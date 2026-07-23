/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.midlet.MIDlet;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class b
extends MIDlet {
    public static b a;
    public static e a;

    public final void startApp() {
        if (a == null) {
            a = this;
            a = new e(this);
        }
    }

    public final void destroyApp(boolean bl) {
        if (a != null) {
            a.e();
        }
        a = null;
        a = null;
    }

    public final void pauseApp() {
    }
}
