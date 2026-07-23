/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.lcdui.Image;

public final class j
extends z {
    private Image a = null;
    private Image F = null;
    private Image G = null;
    private Image H = null;

    public j(int[] nArray) {
        this.a(nArray[0], nArray[1]);
        if (this.d[0].f != this.s && this.d[1].f != this.s) {
            this.d[0].b.a = this.d[1].h[3];
            this.d[0].b.c = this.d[1].h[11];
            this.d[1].b.a = this.d[0].h[3];
            this.d[1].b.c = this.d[0].h[11];
        }
    }

    private void a(int n, int n2) {
        try {
            this.a = Image.createImage("/Hud_img/7s_youWin_img.png");
            this.F = Image.createImage("/Hud_img/7s_youLose_img.png");
            this.G = Image.createImage("/Hud_img/7s_ko_img.png");
            this.H = Image.createImage("/Hud_img/7s_punch_img.png");
        }
        catch (Exception exception) {}
        this.i = new b(l.a(5));
        this.j = new b(h.a("/strikeEffect.m3g"));
        l.b(5);
        this.k = new b(l.a(10));
        this.k.c(500.0f, 500.0f, 500.0f);
        this.k.b(0.7f, 0.7f, 0.7f);
        l.b(10);
        this.B = new b(l.a(4));
        this.B.c(500.0f, 500.0f, 500.0f);
        this.B.b(0.8f, 0.8f, 0.8f);
        l.b(4);
        this.z = new b(l.a(8));
        l.b(8);
        this.A = new b(l.a(9));
        l.b(9);
        this.o = new b(l.a(6));
        this.p = new b(l.a(7));
        this.p.b(2.5f, 2.5f, 2.5f);
        l.b(6);
        l.b(7);
        this.q = new b(l.a(3));
        l.b(3);
        this.d = new p[2];
        int n3 = 0;
        while (n3 < 2) {
            if (n3 == 0) {
                this.d[0] = new p(l.a(1), 0, n);
                z.b(this.i, n2);
                this.a(this.z, 0);
                l.b(1);
            } else {
                this.d[1] = new p(l.a(2), 1, n2);
                z.b(this.j, n);
                this.a(this.A, 1);
                l.b(2);
            }
            ++n3;
        }
        this.i();
        this.e = new c(this.d[0]);
        this.c = new v(this.d);
    }

    private void i() {
        this.d[0].a(2.0f, 0.0f, 0.0f);
        this.d[1].a(-5.0f, 0.0f, 0.0f);
    }

    public final void a() {
        super.a();
        this.d[0].h[7] = 0.0f;
        this.d[1].h[7] = 0.0f;
        if (this.h < 100000) {
            this.h += w.n;
            this.d[1].n = (byte)-1;
            return;
        }
        if (this.h >= 100000) {
            if (this.d[1].a >= 5.0f && this.d[1].o > this.d[1].q && this.d[0].o > 0) {
                this.d[1].n = 1;
                return;
            }
            if (this.d[0].o <= 0) {
                this.d[1].n = (byte)-1;
            }
        }
    }

    public final boolean a(p p2) {
        float f;
        float f2 = (p2.h[3] - 0.0f) * (p2.h[3] - 0.0f) + (p2.h[11] - 0.0f) * (p2.h[11] - 0.0f);
        return f > 1200.0f;
    }

    public final void a(int n) {
        switch (n) {
            case -1: 
            case 50: {
                if (w.r.i != 1) break;
                --w.r.d;
                if (w.r.d >= 0) break;
                w.r.d = 1;
                return;
            }
            case -2: 
            case 56: {
                if (w.r.i != 1) break;
                ++w.r.d;
                if (w.r.d <= 1) break;
                w.r.d = 0;
                return;
            }
            case -22: 
            case -7: 
            case -5: 
            case 53: {
                if (w.r.i != 1) break;
                if (w.r.d == 0) {
                    w.r.l = true;
                }
                if (w.r.d != 1) break;
                w.r.f = true;
            }
        }
    }

    public final void b() {
        if (w.r.i == 2) {
            w.m.setColorClearEnable(true);
            s.b = true;
            s.e = 2;
            s.i = true;
            w.q.a();
            w.q.d(0.0f, 0.0f, 0.0f);
            w.q.c(60.0f, 1.0f, 100000.0f);
            if (w.r.h < 3) {
                w.r.h = w.r.h == 0 && s.g == 1 ? 1 : (w.r.h == 1 && s.g == 1 ? 1 : (w.r.h == 1 && s.g == 2 ? 2 : (w.r.h == 2 && s.g == 1 ? 2 : (w.r.h == 2 && s.g == 2 ? 2 : ++w.r.h))));
                l.a.a();
            }
            if (s.j < 3) {
                ++s.j;
                if (++s.g > 3) {
                    s.g = 0;
                }
                this.e();
                this.f();
                i.g = 0;
                i.f = 0;
                i.a(1);
                return;
            }
            s.e = 0;
            s.i = false;
            s.j = 1;
            s.g = s.f + 1;
            s.h = s.f + 2;
            if (s.g > 3) {
                s.g = 0;
            }
            if (s.h > 3) {
                s.h = 0;
            }
            w.m.setColorClearEnable(true);
            s.b = true;
            s.e = 0;
            w.r.i = 0;
            w.q.a();
            w.q.d(0.0f, 0.0f, 0.0f);
            w.q.c(60.0f, 1.0f, 100000.0f);
            w.r.g = 1;
            o.a = false;
            i.c.e();
            i.c = null;
            i.g = 0;
            i.f = 0;
            i.a(2);
            return;
        }
        if (w.r.i == 1) {
            int n = (k.b >> 1) - (w.p.b(15) >> 1);
            w.p.getClass();
            w.p.a(15, n, (k.c >> 1) - 40);
            int n2 = 0;
            while (n2 < 2) {
                if (n2 == w.r.d) {
                    Image image = w.r.c;
                    int n3 = (k.b >> 1) - (w.r.c.getWidth() >> 1);
                    w.p.getClass();
                    w.p.getClass();
                    int n4 = w.r.d;
                    w.p.getClass();
                    w.k.drawImage(image, n3, (k.c >> 1) + (k.c >> 3) - 10 - 2 - 30 + n4 * 30, 0);
                    int n5 = (k.b >> 1) - (w.p.b(21 + n2) >> 1);
                    w.p.getClass();
                    w.p.getClass();
                    w.p.getClass();
                    w.p.a(21 + n2, n5, (k.c >> 1) + (k.c >> 3) - 10 - 30 + n2 * 30);
                } else {
                    int n6 = (k.b >> 1) - (w.p.a(21 + n2) >> 1);
                    w.p.getClass();
                    w.p.getClass();
                    w.p.getClass();
                    w.p.c(21 + n2, n6, (k.c >> 1) + (k.c >> 3) - 10 - 30 + n2 * 30);
                }
                ++n2;
            }
            if (w.r.f) {
                w.m.setColorClearEnable(true);
                s.i = false;
                w.r.f = false;
                s.j = 1;
                s.f = 0;
                s.g = 1;
                s.h = 2;
                s.b = false;
                s.e = 0;
                w.r.i = 0;
                w.q.a();
                w.q.d(0.0f, 0.0f, 0.0f);
                w.q.c(60.0f, 1.0f, 100000.0f);
                w.r.g = 1;
                o.a = false;
                i.c.e();
                i.c = null;
                i.a(2);
            }
            if (w.r.l) {
                w.m.setColorClearEnable(true);
                s.b = true;
                s.e = 2;
                s.j = 1;
                w.r.l = false;
                s.i = true;
                s.g = s.f + 1;
                if (s.g > 3) {
                    s.g = 0;
                }
                w.q.a();
                w.q.d(0.0f, 0.0f, 0.0f);
                w.q.c(60.0f, 1.0f, 100000.0f);
                this.e();
                this.f();
                i.g = 0;
                i.f = 0;
                i.a(1);
                return;
            }
        } else {
            if (this.h < 100000 || r.d < 80) {
                w.k.setColor(8094331);
                w.k.drawRect((k.b >> 1) - 50 - 5, k.c >> 2, 97, 20);
                w.k.setColor(3621177);
                w.k.fillRect((k.b >> 1) - 50 - 5 + 1, (k.c >> 2) + 1, 96, 19);
                w.p.a(23, (k.b >> 1) - (w.p.b(23) >> 1) - 20 + 5, (k.c >> 2) - 2);
                w.p.f(w.r.k, (k.b >> 1) + (w.p.b(23) >> 1) + 2, (k.c >> 2) - 2);
            }
            if (w.r.j) {
                w.k.drawImage(this.G, (k.b >> 1) - 22, (k.c >> 1) - 12, 0);
            }
            if ((this.d[0].m == 18 || this.d[0].m == 19) && this.d[0].j >= this.d[0].l[this.d[0].m][2] && this.d[0].j <= this.d[0].l[this.d[0].m][3] + 200 && this.d[1].m != 2 && this.d[1].m != 3 && this.d[1].m != 6) {
                w.k.drawImage(this.H, (k.b >> 1) - 38, (k.c >> 2) - 3, 0);
            }
            if (this.E == 5 && this.x > 1000 && this.d[1].f == this.s) {
                w.k.drawImage(this.a, (k.b >> 1) - (this.a.getWidth() >> 1), (k.c >> 2) - 13, 0);
            }
            if (this.E == 5 && this.x > 1000 && this.d[0].f == this.s) {
                w.k.drawImage(this.F, (k.b >> 1) - (this.F.getWidth() >> 1), (k.c >> 2) - 13, 0);
            }
        }
    }

    public final void e() {
        l.b(2);
        l.b(3);
        l.b(9);
        this.A = null;
        this.d[1] = null;
        this.q = null;
        System.gc();
    }

    public final void f() {
        l.b(1);
        l.b(4);
        l.b(5);
        l.b(6);
        l.b(7);
        l.b(8);
        l.b(10);
        this.d[0] = null;
        this.e = null;
        this.c = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.z = null;
        this.A = null;
        this.o = null;
        this.p = null;
        this.a = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.B = null;
        System.gc();
    }

    public final void c() {
        this.q.a();
        this.i.a();
        this.j.a();
        this.k.a();
        this.o.a();
        this.p.a();
        this.B.a();
        int n = 0;
        while (n < 2) {
            this.d[n].a();
            ++n;
        }
    }

    public final void d() {
        if (w.r.i == 2) {
            w.r.i = 0;
            this.a(s.f, s.g);
        }
        if (w.r.i == 1) {
            w.r.i = 0;
            this.a(s.f, s.g);
        }
        this.i();
        w.r.k = 0;
        w.q.c(80.0f, 1.0f, 200000.0f);
        w.m.setColor(0x99CCFF);
        this.d[0].a(0);
        this.d[0].c = false;
        this.d[0].b.a = this.d[1].h[3];
        this.d[0].b.c = this.d[1].h[11];
        this.d[1].b.a = this.d[0].h[3];
        this.d[1].b.c = this.d[0].h[11];
        this.d[0].c();
        this.d[1].c();
        this.o.c(500.0f, 500.0f, 500.0f);
        this.p.c(500.0f, 500.0f, 500.0f);
        this.o.c.animate(0);
        this.d[0].i.setRenderingEnable(true);
        this.d[1].i.setRenderingEnable(true);
        this.o.c.setRenderingEnable(true);
        this.p.c.setRenderingEnable(true);
        this.g();
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        w.r.j = false;
        this.i.c(500.0f, 500.0f, 500.0f);
        this.j.c(500.0f, 500.0f, 500.0f);
        this.k.c(500.0f, 500.0f, 500.0f);
        this.d[0].n = (byte)-1;
        this.d[1].n = (byte)-1;
        this.h = 0;
        this.n = -3.126f;
        this.e.a = 0.0f;
        this.m = true;
        this.E = 0;
        this.s = (byte)2;
        this.d[0].f = 0;
        this.d[1].f = 0;
    }
}
