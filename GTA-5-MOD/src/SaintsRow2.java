/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public final class SaintsRow2
extends MIDlet
implements Runnable {
    static h a;

    protected void startApp() throws MIDletStateChangeException {
        if (null != a) {
            h.bf(false);
        } else {
            new Thread(this).start();
        }
    }

    protected void pauseApp() {
        if (null != a) {
            h.bf(true);
        }
    }

    protected void destroyApp(boolean bl) throws MIDletStateChangeException {
        if (null != a) {
            a.mb();
        }
    }

    public void run() {
        try {
            a = new h(this);
            a.lW();
            a.mh();
            a.ma();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
