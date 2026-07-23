/*
 * Decompiled with CFR 0.152.
 */
public final class e
extends z {
    public e(int[] nArray) {
        this.i = new b(l.a(5));
        this.j = new b(h.a("/strikeEffect.m3g"));
        l.b(5);
        this.k = new b(l.a(10));
        this.k.c(500.0f, 500.0f, 500.0f);
        this.k.b(0.7f, 0.7f, 0.7f);
        l.b(10);
        this.o = new b(l.a(6));
        l.b(6);
        this.p = new b(l.a(7));
        l.b(7);
        this.p.b(2.5f, 2.5f, 2.5f);
        this.q = new b(l.a(3));
        l.b(3);
        this.B = new b(l.a(4));
        this.B.c(500.0f, 500.0f, 500.0f);
        this.B.b(0.8f, 0.8f, 0.8f);
        l.b(4);
        this.d = new p[nArray.length];
        int n = 0;
        while (n < nArray.length) {
            if (n == 0) {
                this.d[n] = new p(l.a(1), n, nArray[n]);
                l.b(1);
                z.b(this.i, nArray[1]);
            } else {
                this.d[n] = new p(l.a(2), n, nArray[n]);
                l.b(2);
                z.b(this.j, nArray[0]);
            }
            ++n;
        }
        this.i();
        this.e = new c(this.d[0]);
        this.c = new v(this.d);
        if (this.d[0].f != this.s && this.d[1].f != this.s) {
            this.d[0].b.a = this.d[1].h[3];
            this.d[0].b.c = this.d[1].h[11];
            this.d[1].b.a = this.d[0].h[3];
            this.d[1].b.c = this.d[0].h[11];
        }
    }

    private void i() {
        this.d[0].a(-1.0f, 0.0f, 0.0f);
        this.d[1].a(-5.0f, 0.0f, 0.0f);
    }

    public final void a() {
        super.a();
        this.d[0].h[7] = 0.0f;
        this.d[1].h[7] = 0.0f;
        if (this.h < 100000) {
            this.h += w.n;
            this.d[1].n = (byte)-1;
        } else if (this.h >= 100000) {
            if (this.d[1].a >= 1.0f && this.d[1].o > this.d[1].q && this.d[0].o > 0) {
                this.d[1].n = (byte)7;
            } else if (this.d[0].o <= 0) {
                this.d[1].n = (byte)-1;
            }
        }
        if (this.d[1].o <= 20) {
            this.d[1].o = 80;
        }
    }

    public final boolean a(p p2) {
        float f;
        float f2 = (p2.h[3] - 0.0f) * (p2.h[3] - 0.0f) + (p2.h[11] - 0.0f) * (p2.h[11] - 0.0f);
        return f > 1200.0f;
    }

    public final void a(int n) {
    }

    public final void b() {
    }

    public final void e() {
        this.d[0] = null;
        this.d[1] = null;
        this.q = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.o = null;
        this.p = null;
        this.B = null;
        this.e = null;
        this.c = null;
        l.b(1);
        l.b(2);
        l.b(3);
        l.b(4);
        l.b(5);
        l.b(6);
        l.b(7);
        l.b(8);
        l.b(9);
        l.b(10);
        System.gc();
    }

    public final void c() {
        this.q.a();
        this.i.a();
        this.j.a();
        this.o.a();
        this.p.a();
        int n = 0;
        while (n < 2) {
            this.d[n].a();
            ++n;
        }
    }

    public final void d() {
        w.q.c(80.0f, 1.0f, 200000.0f);
        w.q.a(-3.0f, 5.52f, -7.5f);
        this.f = true;
        this.i();
        this.d[0].a(0);
        this.d[1].a(0);
        this.d[0].c = true;
        this.d[1].c = true;
        this.d[0].b.a = this.d[1].h[3];
        this.d[0].b.c = this.d[1].h[11];
        this.d[1].b.a = this.d[0].h[3];
        this.d[1].b.c = this.d[0].h[11];
        this.d[0].c();
        this.d[1].c();
        this.d[1].i.setRenderingEnable(true);
        this.d[0].i.setRenderingEnable(true);
        this.o.c.setRenderingEnable(true);
        this.p.c.setRenderingEnable(true);
        this.o.c(500.0f, 500.0f, 500.0f);
        this.p.c(500.0f, 500.0f, 500.0f);
        this.o.c.animate(0);
        this.g();
        this.i.c(500.0f, 500.0f, 500.0f);
        this.j.c(500.0f, 500.0f, 500.0f);
        this.k.c(500.0f, 500.0f, 500.0f);
        this.d[0].n = (byte)-1;
        this.d[1].n = (byte)-1;
        this.h = 100000;
        this.n = 0.0f;
        this.e.a = 0.0f;
        this.m = true;
        this.E = 0;
        r.f = 0;
        this.s = 1;
        this.d[0].f = 0;
        this.d[1].f = 0;
    }

    public final void f() {
    }
}
