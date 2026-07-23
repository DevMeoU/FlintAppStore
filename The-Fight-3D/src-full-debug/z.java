/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.lcdui.Image;
import javax.microedition.m3g.Group;
import javax.microedition.m3g.Image2D;
import javax.microedition.m3g.Mesh;

public abstract class z {
    public boolean b = true;
    public v c = null;
    public p[] d = null;
    public c e = null;
    public boolean f = true;
    public boolean g;
    public int h;
    public b i = null;
    public b j = null;
    public b k = null;
    public boolean l;
    public boolean m;
    private float a;
    public float n = -3.126f;
    public b o = null;
    public b p = null;
    public b q = null;
    public int r;
    public byte s;
    public int t;
    public static int u;
    public int v = 0;
    private float F;
    private float G;
    private a H;
    private a I;
    private a J;
    public int w;
    public int x;
    public int y;
    public b z = null;
    public b A = null;
    public b B = null;
    public boolean C;
    public float[] D = new float[3];
    public int E = 0;
    private float K;
    private float L;
    private float M;
    private float N;
    private float O;
    private float P;

    public abstract void c();

    public abstract void b();

    public abstract boolean a(p var1);

    public abstract void a(int var1);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public void a() {
        byte by;
        if (w.n >= 100) {
            w.n = 100;
        }
        if ((this.d[0].m == 17 || this.d[0].m == 15) && this.E != 1) {
            this.E = 6;
            w.n = (int)((float)w.n * 0.9f);
        } else if (this.E == 6) {
            this.E = 0;
        }
        if (this.r == 3 && this.h >= 100000) {
            this.t += w.n;
            if (this.t >= 20000) {
                if (this.d[0].o < this.d[1].o) {
                    this.d[0].f = this.s;
                } else if (this.d[0].o > this.d[1].o) {
                    this.d[1].f = this.s;
                } else if (this.d[0].o == this.d[1].o && this.d[0].f != this.s && this.d[1].f != this.s) {
                    this.t = 0;
                    this.d();
                }
            }
        }
        if (!this.l) {
            if (this.E != 5) {
                this.c.a();
            }
            by = 0;
            while (by < 2) {
                this.d[by].b((float)w.n);
                this.d[by].b();
                ++by;
            }
            if (this.a(this.d[1])) {
                this.d[1].d = true;
                this.d[1].d();
            } else {
                this.d[1].d = false;
            }
            this.e.a();
            if (this.a(this.d[0])) {
                this.e.b();
                this.e.b = true;
            } else {
                this.e.b = false;
            }
            if ((this.d[0].m == 5 || this.d[0].m == 11) && this.d[0].j > this.d[0].l[this.d[0].m][6] && this.d[0].g) {
                this.b(0);
            } else if (this.d[0].m != 5 && this.d[0].m != 11 && this.d[0].g) {
                this.o.c.animate(0);
                this.d[0].g = false;
            } else if ((this.d[1].m == 5 || this.d[1].m == 11) && this.d[1].j > this.d[1].l[this.d[1].m][6] && this.d[1].g) {
                this.b(1);
            } else if (this.d[1].m != 5 && this.d[1].m != 11 && this.d[1].g) {
                this.o.c.animate(0);
                this.d[1].g = false;
            }
            if (this.o.b[7] < 100.0f && (this.r == 4 && this.d[1].m == 0 || this.d[1].m == 4 || this.d[0].m == 4 || this.d[0].o <= 0 && this.d[0].m == 0 || this.d[1].o <= 0 && this.d[1].m == 0)) {
                this.o.c(500.0f, 500.0f, 500.0f);
                this.o.d = 0;
                this.o.b();
                this.o.c.animate(0);
                this.p.c(500.0f, 500.0f, 500.0f);
                this.p.d = 0;
                this.p.b(2.5f, 2.5f, 2.5f);
                this.p.c.animate(0);
            }
            this.i();
        }
        by = 0;
        while (by < 2) {
            if (this.d[by].p) {
                this.a(this.d[by], (int)by);
            }
            if (this.k.b[7] != 500.0f) {
                this.k.d += w.n;
                if (this.k.d > 500) {
                    this.k.d = 0;
                    this.d[by].p = false;
                }
                this.k.c.animate(this.k.d);
                if (this.d[by].m != 8 && this.d[by].o <= this.d[by].q) {
                    this.k.c(500.0f, 500.0f, 500.0f);
                }
            }
            ++by;
        }
        if (this.d[1].m == 7 || this.d[0].m == 7) {
            this.B.d += w.n;
            if (this.B.d > 1000) {
                this.B.d = 0;
            }
            if (this.d[1].m == 7) {
                this.B.c(this.d[1].h[3] + this.d[1].h[2] * 0.4f, this.d[1].h[7] + 6.3f, this.d[1].h[11] + this.d[1].h[10] * 0.4f);
            } else if (this.d[0].m == 7) {
                this.B.c(this.d[0].h[3] + this.d[0].h[2] * 0.4f, this.d[0].h[7] + 6.3f, this.d[0].h[11] + this.d[0].h[10] * 0.4f);
            }
            this.B.a(w.q.a(3), 6.3f, w.q.a(11));
            this.B.c.animate(this.B.d);
        } else if (this.d[1].m != 7 && this.d[0].m != 7) {
            this.B.c(500.0f, 500.0f, 500.0f);
            this.B.d = 0;
        }
        if (this.d[0].f == this.s - 1 && this.d[0].m == 9 && this.d[0].m != 11 && this.d[0].o <= 0 || this.d[1].f == this.s - 1 && this.d[1].m == 9 && this.d[1].m != 11 && this.d[1].o <= 0) {
            this.y += w.n;
            if (this.y > 100) {
                w.r.j = true;
            }
            if (this.y > 3000) {
                w.r.j = false;
                this.d[0].a(2.0f, 0.0f, 0.0f);
                this.d[1].a(-8.0f, 0.0f, 0.0f);
                this.d[0].e();
                this.d[1].e();
                this.d[0].c();
                this.d[1].c();
                this.e.a = 0.0f;
                this.E = 3;
                this.o.c(500.0f, 500.0f, 500.0f);
                this.p.c(500.0f, 500.0f, 500.0f);
                if (this.d[0].o <= 0) {
                    this.d[0].a(11);
                    this.d[0].n = 0;
                    this.d[0].g = true;
                    this.o.b(0.5f, 0.5f, 0.5f);
                    this.p.b(1.5f, 1.5f, 1.5f);
                } else if (this.d[1].o <= 0) {
                    this.d[1].a(11);
                    this.d[1].g = true;
                    this.o.b(0.5f, 0.5f, 0.5f);
                    this.p.b(1.5f, 1.5f, 1.5f);
                    this.f = false;
                }
            }
        }
        if (this.d[0].f == this.s - 1 && this.d[0].o <= 0 && this.d[0].m == 11) {
            w.q.d(-1.0f, 4.0f, -6.0f);
            w.q.b(this.d[0].h[3], 2.0f, this.d[0].h[11]);
        } else if (this.d[1].f == this.s - 1 && this.d[1].o <= 0 && this.d[1].m == 11) {
            w.q.d(-5.0f, 4.0f, -6.0f);
            w.q.b(this.d[1].h[3], 2.0f, this.d[1].h[11]);
        }
        if ((this.d[0].m == 0 && this.d[0].o <= 0 || this.d[1].m == 0 && this.d[1].o <= 0) && !this.m) {
            this.m = true;
            if (this.r != 4) {
                this.E = 4;
            }
        }
        if (this.d[0].m != 21 && this.d[0].m != 22 && this.E == 4 && this.d[0].o > 0 && this.d[1].o > 0) {
            this.E = 0;
        }
        if (this.d[1].f == this.s && this.d[0].m != 10 && (this.d[1].m == 9 || this.r == 3)) {
            this.f = false;
            this.E = 5;
        } else if (this.d[0].f == this.s && this.d[1].m != 10 && (this.d[0].m == 9 || this.r == 3)) {
            this.f = false;
            this.d[1].n = (byte)-1;
            this.E = 5;
        }
        if (this.E == 5) {
            by = 0;
            if (this.d[0].f == this.s) {
                by = 1;
            } else if (this.d[1].f == this.s) {
                by = 0;
            }
            if (this.x < 1500) {
                this.x += w.n;
            }
            if (this.x > 1000) {
                if (this.d[by].m != 10) {
                    this.d[by].a(10);
                }
                this.a(by);
            }
        }
        if (this.E != 3 && this.E != 5) {
            this.h();
        }
    }

    private void a(byte by) {
        switch (this.v) {
            case 0: {
                if (by == 0) {
                    this.d[1].i.setRenderingEnable(false);
                    this.d[1].a(0.0f, 0.0f, 15.0f);
                    this.d[1].e();
                    this.d[1].c();
                } else {
                    this.d[0].i.setRenderingEnable(false);
                    this.d[0].a(0.0f, 0.0f, 15.0f);
                    this.d[0].e();
                    this.d[0].c();
                }
                this.d[by].a(0.0f, 0.0f, 0.0f);
                this.d[by].e();
                this.d[by].b.a = this.d[by].h[3] + this.d[by].h[2] * 10.0f;
                this.d[by].b.b = 5.52f;
                this.d[by].b.c = this.d[by].h[11] + this.d[by].h[10] * 10.0f;
                this.d[by].c();
                this.H = new a(this.d[by].h[3] + this.d[by].h[2] * 10.0f + this.d[by].h[0] * 5.0f, 5.52f, this.d[by].h[11] + this.d[by].h[10] * 10.0f + this.d[by].h[8] * 5.0f);
                this.I = new a(this.d[by].h[3], 5.52f, this.d[by].h[11]);
                this.J = this.a(this.I, this.H, 30.0f);
                w.q.d(this.H.a, this.H.b, this.H.c);
                w.q.b(this.d[by].h[3], 5.52f, this.d[by].h[11]);
                this.o.c.setRenderingEnable(false);
                this.p.c.setRenderingEnable(false);
                this.v = 1;
                return;
            }
            case 1: {
                if (this.F <= 3.0f) {
                    this.w += w.n;
                    if (this.w <= 1000) break;
                    this.v = 2;
                    this.w = 0;
                    this.H = new a(this.d[by].h[3] + this.d[by].h[2] * 10.0f - this.d[by].h[0] * 5.0f, 5.52f, this.d[by].h[11] + this.d[by].h[10] * 10.0f - this.d[by].h[8] * 5.0f);
                    this.I = new a(this.d[by].h[3], 5.52f, this.d[by].h[11]);
                    this.J = this.a(this.I, this.H, 30.0f);
                    w.q.d(this.H.a, this.H.b, this.H.c);
                    return;
                }
                w.q.b(this.d[by].h[3], 5.52f, this.d[by].h[11]);
                this.F -= this.G;
                this.H.a(this.J);
                w.q.e(this.J.a, this.J.b, this.J.c);
                return;
            }
            case 2: {
                if (this.F <= 3.0f) {
                    this.w += w.n;
                    if (this.w <= 1000) break;
                    this.v = 3;
                    this.w = 0;
                    this.H = new a(this.d[by].h[3] + this.d[by].h[2] * 7.0f, 5.52f, this.d[by].h[11] + this.d[by].h[10] * 7.0f);
                    this.I = new a(this.d[by].h[3], 5.52f, this.d[by].h[11]);
                    this.J = this.a(this.I, this.H, 45.0f);
                    w.q.d(this.H.a, this.H.b, this.H.c);
                    return;
                }
                w.q.b(this.d[by].h[3], 5.52f, this.d[by].h[11]);
                this.F -= this.G;
                this.H.a(this.J);
                w.q.e(this.J.a, this.J.b, this.J.c);
                return;
            }
            case 3: {
                if (this.F <= 3.0f) {
                    this.w += w.n;
                    if (this.w <= 3500) break;
                    this.w = 0;
                    this.x = 0;
                    this.v = 0;
                    if (this.d[1].f == this.s) {
                        w.r.i = 2;
                        return;
                    }
                    if (this.d[0].f != this.s) break;
                    w.r.i = 1;
                    return;
                }
                w.q.b(this.d[by].h[3], 5.52f, this.d[by].h[11]);
                this.F -= this.G;
                this.H.a(this.J);
                w.q.e(this.J.a, this.J.b, this.J.c);
            }
        }
    }

    private a a(a a2, a a3, float f) {
        float f2 = 0.0f;
        float f3 = 0.0f;
        a a4 = null;
        a4 = a2.b(a3);
        f2 = a4.b();
        a4.c();
        f3 = f2 / f;
        a4.a(f3);
        this.F = f2;
        this.G = f3;
        return a4;
    }

    private void b(int n) {
        if (this.d[n].m != 11) {
            this.o.c(this.d[n].h[3], this.d[n].h[7] + 0.1f, this.d[n].h[11]);
            this.p.c(this.d[n].h[3], this.d[n].h[7], this.d[n].h[11]);
        } else {
            this.o.c(this.d[n].h[3] + this.d[n].h[2] * 1.6f, this.d[n].h[7] + 0.1f, this.d[n].h[11] + this.d[n].h[10] * 1.6f);
            this.p.c(this.d[n].h[3] + this.d[n].h[2] * 1.6f, this.d[n].h[7], this.d[n].h[11] + this.d[n].h[10] * 1.6f);
        }
        this.o.d += w.n;
        if (this.o.d > 500) {
            this.o.d = 500;
            this.d[n].g = false;
        }
        this.o.c.animate(this.o.d);
    }

    public final void a(b b2, int n) {
        ((Group)this.d[n].i.find(2)).addChild((Mesh)b2.c.duplicate());
    }

    private void a(q q2, int n) {
        block13: {
            block12: {
                block10: {
                    block11: {
                        if (this.d[n].o < this.d[n].q) break block10;
                        this.i.d += w.n;
                        this.j.d += w.n;
                        if (this.i.d <= 150 && this.j.d <= 150) break block11;
                        this.i.d = 0;
                        this.j.d = 0;
                        q2.p = false;
                        break block12;
                    }
                    if (n == 1) {
                        if (this.d[0].m == 13) {
                            this.j.c(q2.h[3] + q2.h[2] * 0.9f, q2.h[7] + 1.5f, q2.h[11] + q2.h[10] * 0.9f);
                        } else {
                            this.j.c(q2.h[3] + q2.h[2] * 0.9f, q2.h[7] + 5.0f, q2.h[11] + q2.h[10] * 0.9f);
                        }
                        this.j.c.animate(this.j.d);
                        return;
                    }
                    if (this.d[1].m == 13) {
                        this.i.c(q2.h[3] + q2.h[2] * 0.9f, q2.h[7] + 1.5f, q2.h[11] + q2.h[10] * 0.9f);
                    } else {
                        this.i.c(q2.h[3] + q2.h[2] * 0.9f, q2.h[7] + 5.0f, q2.h[11] + q2.h[10] * 0.9f);
                    }
                    this.i.c.animate(this.i.d);
                    return;
                }
                if (this.d[n].o >= this.d[n].q) break block13;
                if (n == 1 && this.d[0].m == 13 || n == 0 && this.d[1].m == 13) {
                    this.k.c(q2.h[3] + q2.h[2] * 0.9f, q2.h[7] + 2.2f, q2.h[11] + q2.h[10] * 0.9f);
                } else {
                    this.k.c(q2.h[3] + q2.h[2] * 0.9f, q2.h[7] + 5.0f, q2.h[11] + q2.h[10] * 0.9f);
                }
            }
            this.i.c(500.0f, 500.0f, 500.0f);
            this.j.c(500.0f, 500.0f, 500.0f);
        }
    }

    public final void g() {
        try {
            ((Mesh)((Group)this.o.c).getChild(0)).getAppearance(0).getTexture(0).setImage(new Image2D(100, Image.createImage("/ground" + u + ".png")));
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void b(b b2, int n) {
        try {
            ((Mesh)((Group)b2.c).getChild(0)).getAppearance(0).getTexture(0).setImage(new Image2D(100, Image.createImage("/strikeEffect" + n + ".png")));
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void i() {
        float f;
        float f2 = (float)Math.sqrt((this.d[1].h[3] - this.d[0].h[3]) * (this.d[1].h[3] - this.d[0].h[3]) + (this.d[1].h[11] - this.d[0].h[11]) * (this.d[1].h[11] - this.d[0].h[11]));
        if (f < 4.0f) {
            this.g = false;
            return;
        }
        this.g = true;
    }

    public final void h() {
        a a2 = new a(this.d[0].h[3] - this.d[1].h[3], 0.0f, this.d[0].h[11] - this.d[1].h[11]);
        float f = (float)Math.sqrt(a2.a * a2.a + a2.c * a2.c);
        a2.a /= f;
        a2.c /= f;
        a2 = a2.d(new a(0.0f, 1.0f, 0.0f));
        a2.c();
        a2.a();
        a a3 = new a();
        this.D[0] = (this.d[1].h[3] + this.d[0].h[3]) / 2.0f;
        this.D[1] = 4.0f;
        this.D[2] = (this.d[1].h[11] + this.d[0].h[11]) / 2.0f;
        if (this.E == 0 || this.E == 1 || this.E == 4) {
            if (this.E == 0) {
                if (f < 8.0f) {
                    f = 8.0f;
                }
                this.a = this.n;
            }
            if (this.E == 4 && f < 11.0f) {
                f = 11.0f;
            }
            a3.a = w.q.a(3) + (this.D[0] + a2.a * (f *= 0.95f) - w.q.a(3)) * (float)w.n * 0.004f;
            a3.b = a3.b;
            a3.c = w.q.a(11) + (this.D[2] + a2.c * f - w.q.a(11)) * (float)w.n * 0.004f;
        }
        if (this.E == 6) {
            this.K = this.d[0].h[3];
            this.L = this.d[0].h[11];
            this.M = this.d[0].h[2];
            this.N = this.d[0].h[10];
            this.O = this.d[0].h[0];
            this.P = this.d[0].h[8];
            if (this.d[0].m == 17) {
                a3.a = this.K - this.M * 6.0f;
                a3.b = this.d[0].h[7] + 6.0f;
                a3.c = this.L - this.N * 6.0f;
                a3.a -= this.O * 6.0f;
                a3.c -= this.P * 6.0f;
            } else if (this.d[0].m == 15) {
                a3.a = this.K + this.M * 7.0f;
                a3.b = this.d[0].h[7] + 6.0f;
                a3.c = this.L + this.N * 7.0f;
                a3.a -= this.O * 7.0f;
                a3.c -= this.P * 7.0f;
            }
        }
        if (this.E == 0 || this.E == 4 || this.E == 6) {
            float f2;
            a3.a -= w.q.a(3);
            a3.b -= w.q.a(7);
            a3.c -= w.q.a(11);
            float f3 = a3.a * a3.a + a3.b * a3.b + a3.c * a3.c;
            f3 = f2 < 0.0099f ? 1.0E-4f : (float)Math.sqrt(f3) / 3.0f;
            if (this.E == 6) {
                if (f3 > 0.2f) {
                    f3 = 0.2f;
                }
            } else if (f3 > 0.7f) {
                f3 = 0.7f;
            }
            float f4 = w.q.a(3) + a3.a * f3;
            float f5 = w.q.a(11) + a3.c * f3;
            w.q.a(3, f4);
            w.q.a(7, 4.0f + f * 0.2f);
            w.q.a(11, f5);
        }
        if (this.h < 100000) {
            if (this.n >= 3.12f) {
                this.n = 3.12f;
                this.h = 100000;
                this.d[1].n = 1;
                i.f = 0;
                i.g = 0;
            }
            w.q.a(this.D[0] + 8.0f * (float)Math.sin(this.n), 4.0f + f * 0.2f, this.D[2] + 8.0f * (float)Math.cos(this.n));
            this.n += (float)w.n * 0.002f;
        }
        if (this.E == 1 && this.r != 4) {
            if (this.n >= this.a + 6.0f) {
                this.n = this.a + 6.0f;
                this.E = 0;
                this.l = false;
            }
            w.q.a(this.D[0] + 8.0f * (float)Math.sin(this.n), 4.0f + f * 0.2f, this.D[2] + 8.0f * (float)Math.cos(this.n));
            this.n += (float)w.n * 0.005f;
        }
        w.q.a(w.q.a(3), w.q.a(7), w.q.a(11), this.D[0], this.D[1], this.D[2], 0.0f, 1.0f, 0.0f);
    }
}
