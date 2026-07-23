/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class r
extends w {
    public static z a;
    public static int b;
    public static Image c;
    private boolean g;
    private Image h;
    private Image i;
    private int j = 0;
    public static int d;
    private int s = 0;
    public static boolean e;
    public static int f;
    private Image t = null;

    static {
        b = 0;
        c = null;
        d = 0;
        e = true;
        f = 0;
    }

    public r() {
        w.o = System.currentTimeMillis();
        w.m.setColor(0x99CCFF);
        try {
            this.h = Image.createImage("/Hud_img/7s_left_helth_bar.png");
            this.i = Image.createImage("/Hud_img/7s_innerMenu_img.png");
            int[] nArray = new int[(k.b >> 1) * (k.c >> 1)];
            int n = 0;
            while (n < (k.b >> 1) * (k.c >> 1)) {
                nArray[n] = -2009902505;
                ++n;
            }
            this.t = Image.createRGBImage(nArray, k.b >> 1, k.c >> 1, true);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void a() {
        r.g();
    }

    private static void a(Graphics graphics) {
        float f = m.a(w.q.a(2), w.q.a(10));
        int n = 0;
        n = (int)((f + 360.0f) % 360.0f * (float)k.b / 90.0f) % c.getWidth();
        graphics.setClip(0, 0, k.b, k.c);
        graphics.drawImage(c, n - c.getWidth(), 0, 20);
        while (n < k.b) {
            graphics.drawImage(c, n, 0, 20);
            n += c.getWidth();
        }
        graphics.setClip(0, 0, k.b, k.c);
    }

    private static void g() {
        switch (b) {
            case 0: {
                a = new j(new int[]{s.f, s.g});
                a.d();
                r.a.r = 1;
                break;
            }
            case 1: {
                a = new e(new int[]{s.f, s.g});
                a.d();
                r.a.r = 4;
                e = true;
                break;
            }
            case 2: {
                a = new d(new int[]{s.f, s.g});
                a.d();
                r.a.r = 2;
                break;
            }
            case 3: {
                a = new g(new int[]{s.f, s.g});
                a.d();
                r.a.r = 3;
            }
        }
        l.b(1);
        l.b(4);
        l.b(5);
        l.b(8);
        l.b(6);
        l.b(7);
        l.b(10);
        System.gc();
    }

    public final void b() {
        if (!o.b && !w.r.f && r.a.b && !w.r.r) {
            a.a();
            this.j = 0;
        }
        if (y.d == 2 && r.a.b && !i.h && k.f.b.getState() == 300) {
            y.e = true;
        }
        if (y.e) {
            try {
                k.f.b.stop();
                k.f.d();
            }
            catch (Exception exception) {}
            y.e = false;
        }
        if ((r.a.d[0].m == 18 || r.a.d[0].m == 19) && r.a.d[0].j >= r.a.d[0].l[r.a.d[0].m][2] && r.a.d[0].j <= r.a.d[0].l[r.a.d[0].m][3] && r.a.d[1].m != 2 && r.a.d[1].m != 3 && r.a.d[1].m != 6 && r.a.C) {
            if (k.e && (y.d == 1 || y.d == 2)) {
                k.f.b();
                k.f.b(0);
                r.a.C = false;
                return;
            }
        } else if ((r.a.d[0].m == 12 || r.a.d[0].m == 13 || r.a.d[0].m == 14 || r.a.d[0].m == 15 || r.a.d[0].m == 16 || r.a.d[0].m == 17) && r.a.d[0].j >= r.a.d[0].l[r.a.d[0].m][2] && r.a.d[0].j <= r.a.d[0].l[r.a.d[0].m][3] && r.a.d[1].m != 2 && r.a.d[1].m != 3 && r.a.d[1].m != 6 && r.a.C && k.e && (y.d == 1 || y.d == 2)) {
            k.f.b();
            k.f.b(1);
            r.a.C = false;
        }
    }

    public final void a(int n) {
        if (!o.b && !w.r.f && w.r.g != 1) {
            w.r.a(n);
            switch (n) {
                case -1: 
                case 50: {
                    if (w.r.e != 1 || w.r.r || this.s != 0 || !e || f != 10) break;
                    --w.r.d;
                    if (w.r.d >= 0) break;
                    w.r.d = 1;
                    break;
                }
                case -2: 
                case 56: {
                    if (w.r.e != 1 || w.r.r || this.s != 0 || !e || f != 10) break;
                    ++w.r.d;
                    if (w.r.d <= 1) break;
                    w.r.d = 0;
                    break;
                }
                case -21: 
                case -6: {
                    if (w.r.e != 1 || w.r.r || this.s != 0 || !e || f >= 10) break;
                    e = false;
                    break;
                }
                case -22: 
                case -7: {
                    if (w.r.i != 0 || !r.a.b || w.r.r || this.j != 0) break;
                    r.a.b = false;
                    w.r.r = true;
                    if (k.e) {
                        k.f.c();
                    }
                    this.j = 1;
                    break;
                }
                case -5: 
                case 53: {
                    if (w.r.e != 1 || w.r.r || this.s != 0 || !e || f != 10) break;
                    if (w.r.d == 0) {
                        f = 0;
                        this.s = 0;
                        e = true;
                        break;
                    }
                    w.r.f = true;
                }
            }
            a.a(n);
            i.g = 0;
        }
    }

    public final void c() {
        if (!w.m.isColorClearEnabled()) {
            r.a(w.k);
        }
        w.l.bindTarget(w.k);
        w.l.clear(w.m);
        if (!o.b) {
            a.c();
        }
        w.l.releaseTarget();
    }

    public final void d() {
        if (!r.a.b) {
            if (w.r.r) {
                w.k.drawImage(this.t, 0, 0, 0);
                w.k.drawImage(this.t, 0, k.c >> 1, 0);
                w.k.drawImage(this.t, k.b >> 1, 0, 0);
                w.k.drawImage(this.t, k.b >> 1, k.c >> 1, 0);
                w.r.b((k.c >> 1) - 68 - 17);
            }
        } else if (w.r.e != 1) {
            if (r.a.r == 4 && r.a.d[1].o < 0) {
                r.a.d[1].o = 0;
            }
            w.k.drawImage(s.c[s.f], 0, 0, 0);
            w.k.drawImage(s.c[s.g], k.b - 56, 0, 0);
            w.k.drawImage(this.h, 0, 49, 0);
            w.k.drawRegion(this.h, 0, 0, this.h.getWidth(), this.h.getHeight(), 2, k.b - this.h.getWidth(), 49, 0);
            w.k.setColor(1697271);
            w.k.fillRect(2, 62, 62, 3);
            w.k.fillRect(k.b - this.h.getWidth() + 21, 62, 62, 3);
            w.k.setColor(12275);
            if (r.a.m) {
                d = 0;
                ++w.r.k;
                r.a.y = 0;
                w.r.j = false;
                r.a.m = false;
                if (r.a.d[1].o < 5) {
                    r.a.d[1].o = 3;
                }
                if (r.a.d[0].o < 5) {
                    r.a.d[0].o = 3;
                    r.a.d[1].o = 3;
                }
            }
            if (d < 80) {
                if (r.a.r == 2 && !this.g || r.a.r == 1 || r.a.r == 3 || r.a.r == 4) {
                    w.k.setColor(12275);
                }
                if (r.a.r == 2 && d > r.a.d[0].o + 1) {
                    w.k.fillRect(2, 52, r.a.d[0].o + 1, 6);
                } else {
                    w.k.fillRect(2, 52, d, 6);
                }
                w.k.setColor(15975424);
                w.k.fillRect(k.b - this.h.getWidth() + 2 + 81 - d, 52, d, 6);
                if ((d += 4) == 80) {
                    r.a.d[1].o = 80;
                    r.a.f = true;
                    i.g = 0;
                    i.f = 0;
                    if (r.a.r != 2) {
                        r.a.d[0].o = 80;
                    } else if (r.a.r == 2 && !this.g) {
                        r.a.d[0].o = 80;
                        this.g = true;
                    }
                }
            } else {
                if (r.a.d[0].o > 5) {
                    w.k.setColor(12275);
                } else {
                    w.k.setColor(0xFF0000);
                }
                if (r.a.d[0].o > 2) {
                    w.k.fillRect(2, 52, r.a.d[0].o + 1, 6);
                }
                if (r.a.d[1].o > 5) {
                    w.k.setColor(15975424);
                } else {
                    w.k.setColor(0xFF0000);
                }
                if (r.a.d[1].o > 2) {
                    w.k.fillRect(k.b - r.a.d[1].o + 2 + 75 - d, 52, r.a.d[1].o + 1, 6);
                }
            }
            if (w.r.i == 0) {
                w.k.drawImage(this.i, k.b - this.i.getWidth() - 2, k.c - this.i.getHeight() - 2, 0);
            } else {
                w.k.drawImage(w.r.b, k.b - 40, k.c - 35, 0);
            }
            a.b();
        } else {
            if (e) {
                w.k.setColor(8094331);
                int n = w.p.g(57 + f, 20, 20) + 1;
                w.p.getClass();
                w.k.drawRoundRect(2, 14, k.b - 4, n * 20 + 6, 20, 20);
                w.k.setColor(3621177);
                int n2 = w.p.g(57 + f, 20, 20) + 1;
                w.p.getClass();
                w.k.fillRoundRect(3, 15, k.b - 5, n2 * 20 + 6 - 1, 20, 20);
                w.p.b(57 + f, 20, 15);
                if (f == 10) {
                    int n3 = (k.b >> 1) - (w.p.b(68) >> 1);
                    w.p.getClass();
                    w.p.a(68, n3, (k.c >> 1) - 40);
                    int n4 = 0;
                    while (n4 < 2) {
                        if (n4 == w.r.d) {
                            Image image = w.r.c;
                            int n5 = (k.b >> 1) - (w.r.c.getWidth() >> 1);
                            w.p.getClass();
                            w.p.getClass();
                            int n6 = w.r.d;
                            w.p.getClass();
                            w.k.drawImage(image, n5, (k.c >> 1) + (k.c >> 3) - 10 - 2 - 30 + n6 * 30, 0);
                            int n7 = (k.b >> 1) - (w.p.b(21 + n4) >> 1);
                            w.p.getClass();
                            w.p.getClass();
                            w.p.getClass();
                            w.p.a(21 + n4, n7, (k.c >> 1) + (k.c >> 3) - 10 - 30 + n4 * 30);
                        } else {
                            int n8 = (k.b >> 1) - (w.p.a(21 + n4) >> 1);
                            w.p.getClass();
                            w.p.getClass();
                            w.p.getClass();
                            w.p.c(21 + n4, n8, (k.c >> 1) + (k.c >> 3) - 10 - 30 + n4 * 30);
                        }
                        ++n4;
                    }
                } else {
                    w.k.drawImage(w.r.b, 5, k.c - 35, 0);
                }
            } else {
                this.s += w.n;
                if (this.s > 5000) {
                    e = true;
                    this.s = 0;
                    if (f < 10) {
                        ++f;
                    }
                    if (f == 1 && r.a.d[0].a < 10.0f) {
                        r.a.d[0].a(11.0f, 0.0f, 0.0f);
                    }
                    if (f == 4 && r.a.d[0].a > 4.0f) {
                        r.a.d[0].a(-1.0f, 0.0f, 0.0f);
                    }
                }
            }
            w.k.drawImage(this.i, k.b - this.i.getWidth() - 2, k.c - this.i.getHeight() - 2, 0);
            if (w.r.f) {
                w.r.e = 0;
                w.r.d = 1;
                f = 0;
                this.s = 0;
                e = true;
                w.r.f = false;
                w.m.setColorClearEnable(true);
                s.b = true;
                s.e = 0;
                w.r.i = 0;
                s.f = 0;
                s.g = 1;
                s.h = 2;
                w.q.a();
                w.q.d(0.0f, 0.0f, 0.0f);
                w.q.c(60.0f, 1.0f, 100000.0f);
                w.m.setColorClearEnable(true);
                s.i = false;
                w.r.g = 1;
                o.a = false;
                i.c.e();
                i.c = null;
                i.a(2);
            }
        }
        if (w.r.u) {
            w.r.u = false;
            i.a.a();
        }
    }

    public final void e() {
        if (this.i != null) {
            a.e();
            a.f();
            a = null;
            l.b(5);
            l.b(6);
            l.b(7);
            l.b(10);
            this.h = null;
            this.i = null;
            this.t = null;
            i.c = null;
            System.gc();
        }
    }
}
