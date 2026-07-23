/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class MainMIDlet
extends MIDlet
implements Runnable {
    private static Display c = null;
    private i d = null;
    private boolean e = false;
    private Thread f = null;
    public static int a = 0;
    public static int b = 0;

    public MainMIDlet() {
        c = Display.getDisplay(this);
        this.f = new Thread(this);
        this.d = new i(this);
        a = 0;
    }

    public void startApp() {
        if (!this.e) {
            this.e = true;
            c.setCurrent(this.d);
            this.f.start();
        }
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean bl) {
        this.e = false;
        this.f = null;
        i.b();
        l.a();
        this.d = null;
        this.notifyDestroyed();
    }

    public final void a() {
        this.destroyApp(true);
    }

    public void run() {
        while (this.e) {
            if (a == 0) {
                this.d.a();
            } else if (a == 3) {
                this.d.c();
            }
            try {
                Thread.sleep(5L);
            }
            catch (Exception exception) {
                System.out.println("Game Exception:  " + exception);
            }
        }
    }

    public static void b() {
        c.vibrate(u.o * 100);
    }
}
