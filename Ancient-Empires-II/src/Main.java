import javax.microedition.lcdui.DisplayAccess;
import javax.microedition.midlet.MIDletLifecycle;
import javax.microedition.rms.RecordStore;

public class Main {
    public static void main(String[] args) throws Exception {
        System.setProperty("flint.resource.dir", "Ancient-Empires-II_J2ME_EN_v10");
        System.setProperty("flint.lcdui.width", "240");
        System.setProperty("flint.lcdui.height", "320");
        System.setProperty("flint.lcdui.present", "rotate270");
        System.setProperty("flint.lcdui.maxfps", "25");

        DisplayAccess.initScreen();
        board.Touch.init();
        board.Audio.init();

        RecordStore.openRecordStore("Preferences", true).closeRecordStore();

        // AMS loads suite properties before constructing b, then starts it.
        MIDletLifecycle.main(new String[]{"b"});

        while(true) {
            Thread.sleep(1000);
        }
    }
}