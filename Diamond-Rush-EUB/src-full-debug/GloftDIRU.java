/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class GloftDIRU
extends MIDlet {
    public static byte[] a = null;
    private i a;
    public Display a;
    public static String a = null;

    public GloftDIRU() {
        a = this.getAppProperty("MIDlet-Version").getBytes();
        this.a = new i(this);
    }

    public final void startApp() {
        if (this.a == null) {
            this.a = Display.getDisplay(this);
        }
        this.a.setCurrent(this.a);
        this.a.d();
    }

    public final void pauseApp() {
        this.a.c();
        this.notifyPaused();
    }

    public final void destroyApp(boolean bl) {
        if (a != null) {
            try {
                this.platformRequest(a);
            }
            catch (Exception exception) {}
        }
        this.notifyDestroyed();
    }

    public final void a() {
        i.b();
        this.a.a.d();
        try {
            this.destroyApp(true);
            return;
        }
        catch (MIDletStateChangeException mIDletStateChangeException) {
            return;
        }
    }
}
