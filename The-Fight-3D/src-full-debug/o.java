/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.lcdui.Image;

public final class o
implements Runnable {
    private Thread c = null;
    private i d;
    private boolean e = false;
    private Image f = null;
    private Image g = null;
    public static boolean a;
    public static boolean b;
    private int h = 137;
    private int i = 1;

    static {
        b = false;
    }

    public o(i i2) {
        this.d = i2;
    }

    public o() {
    }

    public final void a() {
        w.m.setColor(0);
        try {
            this.f = Image.createImage("/7s_loading_img.png");
            this.g = Image.createImage("/7s_loadingChar.png");
        }
        catch (Exception exception) {
            System.out.println("Error: " + exception);
        }
        k.f.c();
        w.o = System.currentTimeMillis();
        this.e = true;
        this.c = new Thread(this);
        this.c.start();
    }

    public final void run() {
        while (this.e) {
            if (!i.h) {
                MainMIDlet.a = 1;
                b = true;
                w.k.setColor(0);
                w.k.fillRect(0, 0, k.b, k.c);
                w.k.drawRegion(this.f, 0, this.h, 176, 137 - this.h, 0, (k.b >> 1) - 88, (k.c >> 2) + this.h, 0);
                w.k.drawImage(this.g, (k.b >> 1) - 88, k.c >> 2, 0);
                int n = 0;
                while (n < this.i) {
                    w.p.a((byte)14, (k.b >> 1) + (w.p.b(43) >> 1) - 10 + n * 8, (k.c >> 2) + 130);
                    ++n;
                }
                w.p.a(43, (k.b >> 1) - (w.p.b(43) >> 1) - 10, (k.c >> 2) + 130);
                ++this.i;
                if (this.i > 7) {
                    this.i = 1;
                }
                if (this.h > 0) {
                    --this.h;
                }
                if (this.h == 68) {
                    if (w.r.g != 1) {
                        k.f.a();
                        if (k.e) {
                            k.f.a(2);
                        }
                        if (!a) {
                            o.a(0);
                        } else {
                            o.a(0);
                            r.a.d();
                        }
                    } else {
                        s.d = new p[4];
                        n = 0;
                        while (n < 4) {
                            s.d[n] = new p(h.a("/menuPlayer" + n + ".m3g"), 0, n);
                            s.d[n].a(2.0f, -4.0f, -9.0f);
                            ++n;
                        }
                    }
                }
                this.d.flushGraphics();
                if (this.h <= 0) {
                    this.h = 137;
                    b = false;
                    i.g = 0;
                    i.f = 0;
                    if (w.r.g != 1) {
                        w.r.r = false;
                        w.r.s = false;
                        w.r.e = w.r.d == 1 ? 1 : 0;
                        w.r.d = 0;
                        w.r.t = 0;
                        if (k.e) {
                            k.f.d();
                        }
                        if (!k.e) {
                            k.f.c();
                        }
                        i.a(4);
                    } else {
                        w.m.setColorClearEnable(true);
                        s.b = false;
                        s.e = 0;
                        w.r.i = 0;
                        w.q.a();
                        w.q.d(0.0f, 0.0f, 0.0f);
                        w.q.c(60.0f, 1.0f, 100000.0f);
                        i.a(1);
                    }
                    this.e = false;
                    this.b();
                    return;
                }
            }
            try {
                Thread.sleep(20L);
            }
            catch (Exception exception) {}
        }
    }

    private static void a(int n) {
        switch (n) {
            case 0: {
                l.c(1);
                l.c(4);
                a = true;
            }
            case 1: {
                l.c(2);
                l.c(3);
            }
        }
    }

    public final void b() {
        this.e = false;
        MainMIDlet.a = 0;
        w.o = System.currentTimeMillis();
    }
}
