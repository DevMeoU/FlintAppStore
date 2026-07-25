import flintos.midp.DisplayBridge;
import flintos.midp.TouchBridge;
import flintos.midp.MIDletLifecycle;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

public final class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("[Main] 1. MIDletLifecycle.init()");
        MIDletLifecycle.init();

        System.out.println("[Main] 2. DisplayBridge.init()");
        DisplayBridge.init(240, 320, "rotate270");

        System.out.println("[Main] 3. TouchBridge.init()");
        TouchBridge.init();

        System.out.println("[Main] 4. RecordStore.openRecordStore()");
        RecordStore.openRecordStore("Preferences", true).closeRecordStore();

        System.out.println("[Main] 5. Class.forName(\"b\")");
        Class clazz = Class.forName("b");

        System.out.println("[Main] 6. newInstance()");
        MIDlet midlet = (MIDlet) clazz.newInstance();

        System.out.println("[Main] 7. MIDletLifecycle.attach()");
        MIDletLifecycle.attach(midlet);

        System.out.println("[Main] 8. MIDletLifecycle.start()");
        MIDletLifecycle.start(midlet);

        System.out.println("[Main] 9. Loop");
        while(true) Thread.sleep(1000);
    }
}
