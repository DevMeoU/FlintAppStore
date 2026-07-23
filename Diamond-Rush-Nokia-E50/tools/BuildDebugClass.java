import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import org.benf.cfr.reader.api.*;

public final class BuildDebugClass {
    private static final class MethodKey {
        final String name, descriptor;
        MethodKey(String n, String d) { name = n; descriptor = d; }
        public boolean equals(Object o) { return o instanceof MethodKey && name.equals(((MethodKey)o).name) && descriptor.equals(((MethodKey)o).descriptor); }
        public int hashCode() { return name.hashCode() * 31 + descriptor.hashCode(); }
    }

    private static final class CfrResult {
        String packageName = "", className, java;
        final Map<MethodKey, NavigableMap<Integer,Integer>> lines = new HashMap<>();
    }

    private static int u2(byte[] b, int p) { return ((b[p] & 255) << 8) | (b[p + 1] & 255); }
    private static int u4(byte[] b, int p) { return (u2(b, p) << 16) | u2(b, p + 2); }
    private static void p2(byte[] b, int p, int v) { b[p] = (byte)(v >>> 8); b[p + 1] = (byte)v; }
    private static void p4(byte[] b, int p, int v) { p2(b, p, v >>> 16); p2(b, p + 2, v); }
    private static int skipAttrs(byte[] b, int p, int count) {
        for (int i = 0; i < count; i++) p += 6 + u4(b, p + 2);
        return p;
    }
    private static byte[] insert(byte[] b, int p, byte[] value) {
        byte[] out = new byte[b.length + value.length];
        System.arraycopy(b, 0, out, 0, p);
        System.arraycopy(value, 0, out, p, value.length);
        System.arraycopy(b, p, out, p + value.length, b.length - p);
        return out;
    }

    private static final class Pool {
        byte[] bytes;
        String[] utf8;
        int end;
        final Map<String,Integer> indices = new HashMap<>();
        Pool(byte[] input) {
            bytes = input;
            parse();
        }
        void parse() {
            int count = u2(bytes, 8), p = 10;
            utf8 = new String[count];
            indices.clear();
            for (int i = 1; i < count; i++) {
                int tag = bytes[p++] & 255;
                switch (tag) {
                    case 1: int n = u2(bytes, p); p += 2; utf8[i] = new String(bytes, p, n, StandardCharsets.UTF_8); indices.put(utf8[i], i); p += n; break;
                    case 3: case 4: p += 4; break;
                    case 5: case 6: p += 8; i++; break;
                    case 7: case 8: case 16: case 19: case 20: p += 2; break;
                    case 9: case 10: case 11: case 12: case 17: case 18: p += 4; break;
                    case 15: p += 3; break;
                    default: throw new IllegalArgumentException("Unknown constant-pool tag " + tag);
                }
            }
            end = p;
        }
        int addUtf8(String value) throws IOException {
            Integer old = indices.get(value);
            if (old != null) return old;
            byte[] text = value.getBytes(StandardCharsets.UTF_8);
            ByteArrayOutputStream raw = new ByteArrayOutputStream();
            DataOutputStream out = new DataOutputStream(raw);
            out.writeByte(1); out.writeShort(text.length); out.write(text);
            int index = u2(bytes, 8);
            bytes = insert(bytes, end, raw.toByteArray());
            p2(bytes, 8, index + 1);
            parse();
            return index;
        }
    }

    private static CfrResult decompile(String classFile, String extraClassPath) {
        CfrResult result = new CfrResult();
        OutputSinkFactory factory = new OutputSinkFactory() {
            public List<SinkClass> getSupportedSinks(SinkType type, Collection<SinkClass> available) {
                if (type == SinkType.JAVA && available.contains(SinkClass.DECOMPILED)) return Collections.singletonList(SinkClass.DECOMPILED);
                if (type == SinkType.LINENUMBER && available.contains(SinkClass.LINE_NUMBER_MAPPING)) return Collections.singletonList(SinkClass.LINE_NUMBER_MAPPING);
                if (available.contains(SinkClass.STRING)) return Collections.singletonList(SinkClass.STRING);
                return Collections.emptyList();
            }
            public <T> Sink<T> getSink(SinkType type, SinkClass sinkClass) {
                return value -> {
                    if (sinkClass == SinkClass.DECOMPILED) {
                        SinkReturns.Decompiled d = (SinkReturns.Decompiled)value;
                        result.packageName = d.getPackageName(); result.className = d.getClassName(); result.java = d.getJava();
                    } else if (sinkClass == SinkClass.LINE_NUMBER_MAPPING) {
                        SinkReturns.LineNumberMapping m = (SinkReturns.LineNumberMapping)value;
                        result.lines.put(new MethodKey(m.methodName(), m.methodDescriptor()), new TreeMap<>(m.getMappings()));
                    }
                };
            }
        };
        Map<String,String> options = new HashMap<>();
        options.put("trackbytecodeloc", "true"); options.put("silent", "true"); options.put("extraclasspath", extraClassPath);
        new CfrDriver.Builder().withOptions(options).withOutputSink(factory).build().analyse(Collections.singletonList(classFile));
        return result;
    }

    private static byte[] patch(byte[] original, CfrResult cfr, String sourceFile) throws Exception {
        Pool pool = new Pool(original);
        int lineName = pool.addUtf8("LineNumberTable");
        int sourceName = pool.addUtf8("SourceFile");
        int sourceValue = pool.addUtf8(sourceFile);
        byte[] b = pool.bytes;
        pool = new Pool(b);
        int p = pool.end + 6;
        int interfaces = u2(b, p); p += 2 + interfaces * 2;
        int fields = u2(b, p); p += 2;
        for (int i = 0; i < fields; i++) { p += 6; int n = u2(b, p); p += 2; p = skipAttrs(b, p, n); }
        int methods = u2(b, p); p += 2;
        final class Addition { int at, lengthPos, countPos; byte[] data; }
        List<Addition> additions = new ArrayList<>();
        for (int i = 0; i < methods; i++) {
            int nameIndex = u2(b, p + 2), descIndex = u2(b, p + 4); p += 6;
            MethodKey key = new MethodKey(pool.utf8[nameIndex], pool.utf8[descIndex]);
            NavigableMap<Integer,Integer> mapping = cfr.lines.get(key);
            int attrs = u2(b, p); p += 2;
            for (int j = 0; j < attrs; j++) {
                int attrStart = p, attrLen = u4(b, p + 2), info = p + 6;
                if ("Code".equals(pool.utf8[u2(b, p)]) && mapping != null && !mapping.isEmpty()) {
                    int q = info + 4, codeLength = u4(b, q); q += 4 + codeLength;
                    int exceptions = u2(b, q); q += 2 + exceptions * 8;
                    int nestedCountPos = q; int nested = u2(b, q); q += 2;
                    int end = skipAttrs(b, q, nested);
                    ByteArrayOutputStream raw = new ByteArrayOutputStream(); DataOutputStream out = new DataOutputStream(raw);
                    out.writeShort(lineName); out.writeInt(2 + mapping.size() * 4); out.writeShort(mapping.size());
                    for (Map.Entry<Integer,Integer> entry : mapping.entrySet()) { out.writeShort(entry.getKey()); out.writeShort(entry.getValue()); }
                    Addition a = new Addition(); a.at = end; a.lengthPos = attrStart + 2; a.countPos = nestedCountPos; a.data = raw.toByteArray(); additions.add(a);
                }
                p = attrStart + 6 + attrLen;
            }
        }
        int classCountPos = p, classAttrs = u2(b, p); p += 2; int classEnd = skipAttrs(b, p, classAttrs);
        ByteArrayOutputStream sfRaw = new ByteArrayOutputStream(); DataOutputStream sf = new DataOutputStream(sfRaw);
        sf.writeShort(sourceName); sf.writeInt(2); sf.writeShort(sourceValue);
        p2(b, classCountPos, classAttrs + 1); b = insert(b, classEnd, sfRaw.toByteArray());
        additions.sort((x,y) -> Integer.compare(y.at, x.at));
        for (Addition a : additions) {
            p4(b, a.lengthPos, u4(b, a.lengthPos) + a.data.length);
            p2(b, a.countPos, u2(b, a.countPos) + 1);
            b = insert(b, a.at, a.data);
        }
        return b;
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 4) throw new IllegalArgumentException("classFile sourceRoot outputClass extraClassPath");
        Path input = Paths.get(args[0]), sourceRoot = Paths.get(args[1]), output = Paths.get(args[2]);
        CfrResult cfr = decompile(input.toString(), args[3]);
        if (cfr.java == null || cfr.className == null) throw new IllegalStateException("CFR returned no source for " + input);
        Path sourceDir = cfr.packageName.isEmpty() ? sourceRoot : sourceRoot.resolve(cfr.packageName.replace('.', File.separatorChar));
        Files.createDirectories(sourceDir); Files.write(sourceDir.resolve(cfr.className + ".java"), cfr.java.getBytes(StandardCharsets.UTF_8));
        Files.createDirectories(output.getParent()); Files.write(output, patch(Files.readAllBytes(input), cfr, cfr.className + ".java"));
        System.out.println(cfr.className + ": " + cfr.lines.size() + " methods mapped");
    }
}
