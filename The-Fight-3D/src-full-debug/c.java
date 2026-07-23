/*
 * Decompiled with CFR 0.152.
 */
public final class c {
    private int c = 5;
    private p d;
    private float[] e;
    private int f;
    private float g;
    private float h;
    public float a;
    public boolean b;
    private float i = 5.0f;

    public c(p p2) {
        this.d = p2;
        this.e = p2.h;
    }

    public final void a() {
        if (w.n > 100) {
            w.n = 100;
        }
        this.d.a(r.a.d[1].h[3], r.a.d[1].h[11]);
        if (this.d.m != 20 && !this.d.c) {
            this.f = 20;
            this.d.c = true;
        }
        if (this.d.o <= this.d.q && this.d.o > 0 && this.d.o != 3 && this.d.m != 7 && this.d.m != 4 && this.d.m != 5) {
            this.f = 7;
            this.d.a(this.f);
        }
        if (this.d.o > this.d.q && this.d.m != 10) {
            this.g = this.d.h[3];
            this.h = this.d.h[11];
            if (this.d.n == 1) {
                if (this.d.m == 4 || this.d.m == 5) {
                    if (this.d.j >= this.d.l[this.d.m][4] && this.d.j <= this.d.l[this.d.m][5]) {
                        this.d.h[3] = this.d.h[3] - this.d.h[2] * (float)w.n * 0.01f;
                        this.d.h[11] = this.d.h[11] - this.d.h[10] * (float)w.n * 0.01f;
                        return;
                    }
                    if (this.d.j >= this.d.l[this.d.m][5]) {
                        this.d.n = 0;
                    }
                }
                return;
            }
            if (this.d.m == 18 && this.d.a > this.i - 1.0f && this.d.j >= this.d.l[this.d.m][4] && this.d.j <= this.d.l[this.d.m][5]) {
                this.d.h[3] = this.d.h[3] + this.d.h[2] * (float)w.n * 0.01f;
                this.d.h[11] = this.d.h[11] + this.d.h[10] * (float)w.n * 0.01f;
            }
            if ((i.f & 0x1000) != 0 && r.a.f && this.d.m != 12 && this.d.m != 4 && this.d.m != 5 && this.d.m == 6 && this.d.j >= this.d.l[this.d.m][4] && this.d.j <= this.d.l[this.d.m][5] && this.d.a < this.i) {
                i.g = 0;
                if (r.a.r == 4 && r.f == 7 && !r.e || r.a.r != 4) {
                    this.f = 12;
                    this.d.a(this.f);
                    return;
                }
            }
            if ((i.g & 1) != 0 && r.a.f && this.d.m != 6) {
                i.g = 0;
                if (r.a.r == 4 && (r.f == 6 || r.f == 7) && !r.e || r.a.r != 4) {
                    this.f = 6;
                    this.d.a(this.f);
                    return;
                }
            }
            if (w.r.q == 1) {
                w.r.q = 0;
                i.g = 0;
            }
            if ((i.g & 0x10) != 0 && this.d.m != 5 && this.d.m != 13 && this.d.m != 6 && this.d.m != 14 && this.d.m != 15 && this.d.m != 16 && this.d.m != 17 && this.d.m != 18 && this.d.m != 19 && this.d.a < this.i && r.a.d[1].n != 3 && r.a.d[1].n != 4) {
                i.g = 0;
                if (r.a.r == 4 && !r.e && (r.f == 5 || r.f == 9) || r.a.r != 4) {
                    if (this.d.m == 2) {
                        this.f = 13;
                    } else if (r.f != 5) {
                        if (r.a.d[1].o > r.a.d[1].q) {
                            this.f = k.a.nextInt(6) + 14;
                        } else if (r.a.d[1].o <= r.a.d[1].q) {
                            this.f = k.a.nextInt(4) + 14;
                        }
                    }
                    if (r.a.r == 4 && r.f == 5 && this.d.m == 2 || r.a.r == 4 && r.f == 9 || r.a.r != 4) {
                        this.d.a(this.f);
                    }
                    return;
                }
            }
            if (this.d.k && this.d.m > 1 && this.d.m < 21) {
                i.g = 0;
                return;
            }
            if (this.f != 7 && this.d.m != 10) {
                this.f = 0;
            }
            if ((i.f & 0x100) != 0 && r.a.f && !this.b) {
                if (r.a.r == 4 && r.f == 2 && !r.e || r.a.r != 4) {
                    this.c = 0;
                    this.a += (float)w.n * 9.0E-4f;
                    r.a.n = this.a;
                    this.f = 22;
                }
            } else if ((i.f & 0x80) != 0 && r.a.f && !this.b) {
                if (r.a.r == 4 && r.f == 3 && !r.e || r.a.r != 4) {
                    this.c = 2;
                    this.a -= (float)w.n * 9.0E-4f;
                    r.a.E = 4;
                    r.a.n = this.a;
                    this.f = 21;
                }
            } else if ((i.f & 4) != 0 && r.a.f) {
                if (r.a.r == 4 && r.f == 0 && !r.e || r.a.r != 4) {
                    this.c = 3;
                    this.f = 24;
                    this.b((float)w.n * 0.004f);
                }
            } else if ((i.f & 8) != 0 && r.a.f && r.a.g && (r.a.r == 4 && r.f == 1 && !r.e || r.a.r != 4)) {
                this.c = 4;
                this.f = 1;
                this.a((float)w.n * 0.006f);
            }
            if (!(this.c != 0 && this.c != 2 || this.b)) {
                double d = Math.sqrt((this.d.h[3] - r.a.d[1].h[3]) * (this.d.h[3] - r.a.d[1].h[3]) + (this.d.h[11] - r.a.d[1].h[11]) * (this.d.h[11] - r.a.d[1].h[11]));
                double d2 = d * Math.sin(this.a);
                double d3 = d * Math.cos(this.a);
                this.d.h[3] = r.a.d[1].h[3] + (float)d3;
                this.d.h[11] = r.a.d[1].h[11] + (float)d2;
            }
            this.c = 5;
            if ((i.f & 2) != 0 && r.a.f && (r.a.r == 4 && (r.f == 4 || r.f == 5) && !r.e || r.a.r != 4)) {
                if (r.a.r == 4 && this.d.a > this.i) {
                    r.a.d[0].a(-1.0f, 0.0f, 0.0f);
                }
                this.f = 2;
                this.d.a(this.f);
                return;
            }
            if ((i.f & 0x200) != 0 && r.a.f && (r.a.r == 4 && r.f == 8 && !r.e || r.a.r != 4)) {
                this.f = 3;
                this.d.a(this.f);
            }
        }
        if (this.f != 0 && this.d.m == 0) {
            this.d.a(this.f);
        }
        if (this.f == 0 && this.d.m != 0 && this.d.m != 10) {
            this.d.a(this.f);
        }
        if (!this.d.k) {
            if (this.d.m == 20 || this.d.m == 11) {
                this.d.m = 0;
                this.f = 0;
            }
            if (this.d.m == 8) {
                this.d.m = 9;
                this.f = 9;
            }
            this.d.a(this.f);
        }
    }

    private void a(float f) {
        this.e[3] = this.e[3] + this.e[2] * f;
        this.e[11] = this.e[11] + this.e[10] * f;
    }

    private void b(float f) {
        this.e[3] = this.e[3] - this.e[2] * f;
        this.e[11] = this.e[11] - this.e[10] * f;
    }

    public final void b() {
        this.e[3] = this.g;
        this.e[11] = this.h;
    }
}
