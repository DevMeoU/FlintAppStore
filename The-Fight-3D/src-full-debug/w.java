/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.m3g.Background;
import javax.microedition.m3g.Graphics3D;

public abstract class w {
    public static Graphics k = null;
    public static Graphics3D l = null;
    public static Background m = new Background();
    public static int n = 0;
    public static long o = 0L;
    private long a = 0L;
    public static t p;
    public static x q;
    private int b = 0;
    private int c = 0;
    public static u r;

    static {
        r = new u();
    }

    public abstract void a(int var1);

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void a();

    public abstract void e();

    public final void f() {
        this.a = o;
        o = System.currentTimeMillis();
        n = (int)(o - this.a);
        this.c += n;
        ++this.b;
        if (this.c >= 1000) {
            this.c -= 1000;
            this.b = 0;
        }
    }
}
