import java.util.*;
import org.benf.cfr.reader.api.*;

public final class DumpCfrMappings {
    public static void main(String[] args) {
        OutputSinkFactory sinks = new OutputSinkFactory() {
            public List<SinkClass> getSupportedSinks(SinkType type, Collection<SinkClass> available) {
                if (type == SinkType.LINENUMBER && available.contains(SinkClass.LINE_NUMBER_MAPPING))
                    return Collections.singletonList(SinkClass.LINE_NUMBER_MAPPING);
                if (available.contains(SinkClass.STRING))
                    return Collections.singletonList(SinkClass.STRING);
                return Collections.emptyList();
            }
            @SuppressWarnings("unchecked")
            public <T> Sink<T> getSink(SinkType type, SinkClass sinkClass) {
                if (sinkClass == SinkClass.LINE_NUMBER_MAPPING) {
                    return value -> {
                        SinkReturns.LineNumberMapping m = (SinkReturns.LineNumberMapping)value;
                        System.out.println(m.methodName() + m.methodDescriptor());
                        System.out.println("map=" + m.getMappings());
                        System.out.println("class=" + m.getClassFileMappings());
                    };
                }
                return value -> {};
            }
        };
        Map<String,String> options = new HashMap<>();
        options.put("trackbytecodeloc", "true");
        options.put("silent", "true");
        new CfrDriver.Builder().withOptions(options).withOutputSink(sinks).build()
            .analyse(Collections.singletonList(args[0]));
    }
}
