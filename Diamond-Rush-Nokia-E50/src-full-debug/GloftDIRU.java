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
    public h a;
    public Display a;

    public GloftDIRU() {
        a = this.getAppProperty("MIDlet-Version").getBytes();
        this.a = new h(this);
    }

    public final void startApp() throws MIDletStateChangeException {
        if (this.a == null) {
            this.a = Display.getDisplay(this);
        }
        this.a.setCurrent(this.a);
        this.a.f();
    }

    public final void pauseApp() {
        this.a.e();
        this.notifyPaused();
    }

    public final void destroyApp(boolean bl) throws MIDletStateChangeException {
        this.notifyDestroyed();
    }

    public final void a() {
        h.d();
        this.a.g();
        this.b();
        try {
            this.destroyApp(true);
            return;
        }
        catch (MIDletStateChangeException mIDletStateChangeException) {
            return;
        }
    }

    private void b() {
        this.a = null;
        this.a = null;
        System.gc();
    }
}
