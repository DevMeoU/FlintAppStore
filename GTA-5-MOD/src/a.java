/*
 * Decompiled with CFR 0.152.
 */
import java.util.Timer;
import java.util.TimerTask;

public class a
extends TimerTask {
    public static int a = 0;
    public static int b = 0;
    public static int c = 0;
    public static boolean d = false;
    public static boolean e = false;
    private static Timer f = null;

    protected a(int n) {
        a = n * 60;
        b = n;
        c = 0;
    }

    public void run() {
        if (d) {
            if (--a > 0) {
                if (--c < 0) {
                    if (b > 0) {
                        c = 59;
                        --b;
                    } else {
                        c = 0;
                        b = 0;
                    }
                }
            } else {
                c = 0;
                b = 0;
                h.mj();
            }
        }
    }

    public static void a() {
        if (f == null) {
            f = new Timer();
            f.schedule((TimerTask)new a(3), 0L, 1000L);
            e = true;
        }
        d = true;
    }

    public static void b() {
        d = false;
        e = false;
        if (f != null) {
            f.cancel();
            f = null;
        }
    }

    public static void c() {
        d = false;
    }

    public static String d() {
        String string = b + ":";
        string = c < 10 ? string + "0" + c : string + c;
        return string;
    }
}
