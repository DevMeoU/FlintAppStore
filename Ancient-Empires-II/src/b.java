/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.midlet.MIDlet;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class b
extends MIDlet {
    public static b x;
    public static e y;

    public final void startApp() {
        if (x == null) {
            x = this;
            y = new e(this);
        }
    }

    public final void destroyApp(boolean bl) {
        if (y != null) {
            y.e();
        }
        y = null;
        x = null;
    }

    public final void pauseApp() {
    }
}
