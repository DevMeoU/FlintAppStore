import javax.microedition.lcdui.Display;
import flintos.midp.DisplayBridge;
import flintos.midp.TouchBridge;
import flintos.midp.MIDletLifecycle;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

public final class Main {
    public static void main(String[] args) throws Exception {
        MIDletLifecycle.init();
        DisplayBridge.init(240, 320, "rotate270");
        TouchBridge.init();
        Display.initScreen();
        RecordStore.openRecordStore("Preferences", true).closeRecordStore();
        String midletClass = "GloftDIRU";
        Class<?> clazz = Class.forName(midletClass);
        MIDlet midlet = (MIDlet) clazz.getDeclaredConstructor().newInstance();
        MIDletLifecycle.attach(midlet);
        MIDletLifecycle.start(midlet);
        while(true) Thread.sleep(1000);
    }
}
