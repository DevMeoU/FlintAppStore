/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class d {
    private static d a;
    private static DataInputStream a;
    private static String a;

    private d() {
    }

    public static String a(String string, String string2, String string3) {
        int n;
        do {
            if ((n = string.indexOf(string2)) < 0) continue;
            string = string.substring(0, n) + string3 + string.substring(n + string2.length());
        } while (n >= 0);
        return string;
    }

    public static String a(int n) {
        return d.a(n, null);
    }

    private static synchronized String a(int n, String[] object) {
        if (a == null) {
            a = System.getProperty("microedition.locale");
        }
        try {
            if (a == null) {
                a = new d();
            }
            if (a == null) {
                object = a.getClass().getResourceAsStream("/lang." + a);
                if (object == null) {
                    object = a.getClass().getResourceAsStream("/lang.xx");
                }
                if (object == null) {
                    return "X";
                }
                a = new DataInputStream((InputStream)object);
                a.mark(512);
            }
            a.skipBytes(n << 1);
            int n2 = a.readUnsignedShort();
            a.skipBytes(n2 - (n << 1) - 2);
            String string = a.readUTF();
            if (!a.markSupported()) {
                a.close();
                a = null;
            } else {
                try {
                    a.reset();
                }
                catch (IOException iOException) {
                    a.close();
                    a = null;
                }
            }
            return string;
        }
        catch (IOException iOException) {
            a = null;
            return "E";
        }
    }

    private static boolean a(String string, String string2, int n, int n2) {
        block4: while (true) {
            if (n == string.length() && n2 == string2.length()) {
                return true;
            }
            if (n == string.length() || n2 == string2.length()) {
                return false;
            }
            switch (string2.charAt(n2)) {
                case '?': {
                    ++n;
                    ++n2;
                    continue block4;
                }
                case '*': {
                    if (n2 == string2.length() - 1) {
                        return true;
                    }
                    if (d.a(string, string2, n, n2 + 1)) {
                        return true;
                    }
                    ++n;
                    continue block4;
                }
            }
            if (string.charAt(n) != string2.charAt(n2)) break;
            ++n;
            ++n2;
        }
        return false;
    }

    private static StringBuffer a(InputStream inputStream) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            int n = inputStream.read();
            if ((char)n != ' ') {
                return stringBuffer;
            }
            while ((n = inputStream.read()) >= 0) {
                if ((char)n == '\r') continue;
                if ((char)n == '\n') {
                    stringBuffer.append((Object)d.a(inputStream));
                    break;
                }
                stringBuffer.append((char)n);
            }
        }
        catch (IOException iOException) {}
        return stringBuffer;
    }

    static {
        block11: {
            InputStream inputStream;
            a = null;
            a = null;
            String string = System.getProperty("microedition.platform");
            boolean bl = false;
            Serializable serializable = new StringBuffer();
            if (a == null) {
                a = new d();
            }
            if ((inputStream = a.getClass().getResourceAsStream("/META-INF/MANIFEST.MF")) != null) {
                int n;
                block2: while (true) {
                    try {
                        int n2;
                        while ((n2 = inputStream.read()) >= 0) {
                            if ((char)n2 == '\r') continue;
                            if ((char)n2 == '\n') {
                                if (((StringBuffer)serializable).toString().trim().startsWith("Nokia-Platform:")) {
                                    ((StringBuffer)serializable).append((Object)d.a(inputStream));
                                    break block2;
                                }
                                ((StringBuffer)serializable).delete(0, ((StringBuffer)serializable).length());
                                continue;
                            }
                            ((StringBuffer)serializable).append((char)n2);
                        }
                        break block11;
                    }
                    catch (IOException iOException) {
                        continue;
                    }
                    break;
                }
                String string2 = ((StringBuffer)serializable).toString().trim().substring(15);
                serializable = new Vector();
                while ((n = string2.indexOf("@")) != -1) {
                    ((Vector)serializable).addElement(string2.substring(0, n));
                    string2 = string2.substring(n + 1, string2.length());
                }
                ((Vector)serializable).addElement(string2);
                for (n = 0; n < ((Vector)serializable).size(); ++n) {
                    string2 = string;
                    String string3 = ((String)((Vector)serializable).elementAt(n)).trim();
                    if (!d.a(string2, string3, 0, 0)) continue;
                    bl = true;
                    break;
                }
            }
            if (!bl) {
                System.exit(0);
            }
        }
        a = null;
    }
}
