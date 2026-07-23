/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class d
extends a {
    public boolean[] a;
    public int a;
    public static final int b = e.f <= 143 ? 1 : 2;
    public static final int c = b * 2 + 1;
    public byte a;
    public short a;
    public static i a;
    public String[] a;
    public f[] a;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public Font a;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public byte b;
    public int o;
    public boolean a;
    public boolean b;
    public c[] a;
    public int p;
    public int q;
    public byte c;
    public int r;
    public int s;
    public int t;
    public int u;
    public String[] b;
    public int v = -1;
    public boolean c = true;
    public int w;
    public c a;
    public boolean d;
    public a a;
    public int x;
    public h[] a;
    public int y;
    public boolean e = false;
    public Vector a;
    public int z = -1;
    public boolean f;
    public boolean g;
    public int A;
    public int B;
    public int C;
    public int D;
    public byte[][] a;
    public Vector b;
    public int E;
    public int F;
    public int G = 2370117;
    public int H = 2370117;
    public f a;
    public d a;
    public int[] a;
    public int I;
    public int J;
    public int[] b = false;
    public int K;
    public int L = -1;
    public short[] a;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public byte d = true;
    public h a = false;

    public final void a() {
        this.T = 0;
        if (this.a != null) {
            this.b();
        }
        this.y = 4;
        this.a = true;
        this.b = true;
        if (a != null) {
            a.a();
        }
        if (this.a != null) {
            this.a.a = true;
        }
        if (this.b == 15) {
            for (int j = 0; j < this.a.size(); ++j) {
                d d2 = (d)this.a.elementAt(j);
                d2.a();
                d2.b = false;
            }
        }
    }

    public final void a(byte by, boolean bl) {
        this.a[by] = bl;
    }

    public final void a(a a2) {
        this.a = a2;
        this.a[1] = a2 != null;
    }

    public d(byte by, int n) {
        this.c = (byte)-1;
        this.b = by;
        this.o = n;
        if (by == 15) {
            this.K = d.a.b - d.a.e.q;
            this.c = true;
        } else if (by == 0 || by == 11) {
            this.a[0] = true;
            this.a[1] = true;
        } else if (by == 3) {
            this.a = d.a.m;
            this.e();
            this.c = false;
            this.f = true;
            this.p = e.b - e.a;
            this.f = d.a.a;
            this.g = d.a.m.q + c;
            if ((n & 2) == 0) {
                this.g += 5;
            }
            this.a = c.a(d.a.f);
            this.j = this.a.length;
            boolean bl = false;
            int n2 = this.f - d.a.c.p * 2;
            if ((n & 4) == 0) {
                n2 -= 8;
            }
            if ((n & 8) == 0) {
                n2 -= 8;
            }
            this.s = n2 / (d.a.m.p + 3);
            if (this.s > this.j) {
                this.s = this.j;
            }
            this.h = n2 / this.s;
            this.x = (n2 - this.h * this.s) / 2;
            this.a = (byte)2;
        } else if (by == 2 || by == 5) {
            this.c = false;
            this.g = 5 + b + 24 + c + d.a.n.q * 2 + b + b + 1;
            if (by == 5) {
                this.g += c + e.a;
                this.a = a.a(d.a.q, d.a.r, (byte)0);
                this.i = this.a.d;
                this.f = d.a.a;
            } else {
                this.f = d.a.a;
            }
        } else if (by != 7 && by == 8) {
            this.a = (short)8;
            this.a[0] = true;
        }
        this.a = true;
    }

    public final d a(String string) {
        this.a = new d(10, 0);
        this.a.a(null, string, d.a.a, -1);
        return this.a;
    }

    public final void a(d d2, int n, int n2, int n3) {
        int n4;
        if (this.a == null) {
            this.a = new Vector();
        }
        if (this.b == null) {
            this.b = new int[5];
            for (n4 = 0; n4 < 5; ++n4) {
                this.b[n4] = this.K;
                if (n4 <= 0) continue;
                int n5 = n4;
                this.b[n5] = this.b[n5] - d.a.e.q;
            }
        }
        d2.a(n, n2, n3);
        n4 = d2.e;
        for (int j = 0; j < 5; ++j) {
            if (n4 < this.b[j]) {
                if (n4 + d2.g <= this.b[j]) break;
                this.b[j] = n4;
                if (j + 1 <= this.J) break;
                this.J = j + 1;
                break;
            }
            n4 -= this.b[j];
        }
        d2.a((byte)0, false);
        d2.a((byte)1, false);
        this.a.addElement(d2);
    }

    public final void a(int n, int n2, byte[][] byArray, Vector vector) {
        int n3;
        this.o = 15;
        this.a = byArray;
        this.b = vector;
        this.a = (short)8;
        this.a[0] = true;
        this.c = true;
        this.E = byArray.length;
        this.F = byArray[0].length;
        boolean bl = false;
        this.f = this.E * d.a.c[0].a + 8;
        this.g = this.F * d.a.c[0].b + 8;
        if (this.f > n) {
            n3 = d.a.c[0].a;
            this.C = (n - 8) / n3;
            this.f = n3 * this.C + 8;
        } else {
            this.C = this.E;
        }
        if (this.g > n2) {
            n3 = d.a.c[0].b;
            this.D = (n2 - 8) / n3;
            this.g = n3 * this.D + 8;
        } else {
            this.D = this.F;
        }
        this.b = (byte)8;
    }

    public final void a(int n, int n2, int n3) {
        this.d = n;
        this.e = n2;
        if ((n3 & 1) != 0) {
            this.d -= this.f >> 1;
        } else if ((n3 & 8) != 0) {
            this.d -= this.f;
        }
        if ((n3 & 2) != 0) {
            this.e -= this.g >> 1;
        } else if ((n3 & 0x20) != 0) {
            this.e -= this.g;
        }
        this.m = this.d;
        this.n = this.e;
    }

    public final void a(String string, int n, int n2, byte by, byte by2) {
        this.c = by;
        if (by == -1) {
            this.o = 14;
        } else {
            this.t = d.a.l.p - 8;
        }
        int n3 = n - this.t - 16;
        this.a = a.a(string, n3, e.b);
        this.a(null, this.a, n, n2);
        this.e = false;
        this.b = (byte)7;
    }

    public final void a(String string, String[] stringArray, int n, int n2) {
        this.c = false;
        this.f = n;
        this.g = n2;
        this.j = stringArray.length;
        this.i = 0;
        this.r = 0;
        this.u = 0;
        this.e = false;
        int n3 = n - this.t - 16;
        if (string != null) {
            this.b = a.a(string, n3, e.b);
        }
        this.a = stringArray;
        this.h = e.b;
        this.p = e.b - e.a;
        this.q = this.p / 2;
        int n4 = n2 <= 0 ? this.X : n2;
        if ((this.o & 1) == 0) {
            n4 -= 5;
        }
        if ((this.o & 2) == 0) {
            n4 -= 5;
        }
        if (string != null) {
            n4 -= this.b.length * this.h;
        }
        this.s = (n4 - 2) / this.h;
        if (this.s > this.a.length) {
            this.s = this.a.length;
        } else if (this.s < this.a.length) {
            this.e = true;
        }
        if (n2 < 0) {
            if (this.b != null) {
                this.g = this.b.length * this.h;
            }
            this.g += this.s * this.h;
            if ((this.o & 1) == 0) {
                this.g += 5;
            }
            if ((this.o & 2) == 0) {
                this.g += 5;
            }
        } else {
            this.x = (n4 - this.s * this.h) / 2;
        }
        this.b = (byte)10;
        this.a = (byte)2;
    }

    public final void a(String string, String string2, int n, int n2) {
        int n3 = n - this.t;
        if ((this.o & 4) == 0) {
            n3 -= 8;
        }
        if ((this.o & 8) == 0) {
            n3 -= 8;
        }
        this.a = a.a(string2, n3, e.b);
        this.a(string, this.a, n, n2);
        if (this.e) {
            this.a = a.a(string2, n3 -= d.a.d.p, e.b);
            this.a(string, this.a, n, n2);
        }
    }

    private final void e() {
        this.a = new h[3];
        for (int j = 0; j < this.a.length; ++j) {
            this.a[j] = new h(d.a.k);
        }
        this.b();
    }

    public final void b() {
        for (int j = 0; j < this.a.length; ++j) {
            this.a[j].c = true;
            this.a[j].b(e.a(this.a.p), e.a(this.a.q));
            this.a[j].c(e.a(this.a[j].e()));
        }
    }

    public final void a(String[] stringArray, f[] fArray, int n, int n2, int n3) {
        this.o = 15;
        this.a = stringArray;
        this.a = fArray;
        this.j = this.a.length;
        this.f = 0;
        for (int j = 0; j < this.j; ++j) {
            int n4 = e.b.stringWidth(this.a[j]);
            if (n4 <= this.f) continue;
            this.f = n4;
        }
        this.p = e.b - e.a;
        this.q = this.p / 2;
        this.U = d.a.n.p;
        this.h = this.U + this.p;
        this.f += this.j * this.h;
        this.f += 32;
        if (this.f > this.W) {
            this.f = this.W;
        }
        this.g = this.U;
        this.a(n, n2, n3);
        this.b = (byte)13;
        this.a = (byte)2;
    }

    public final void a(String[] stringArray, int n, int n2) {
        this.a = stringArray;
        this.j = this.a.length;
        this.f = true;
        this.c = false;
        this.g = n2;
        int n3 = 0;
        for (int j = 0; j < this.a.length; ++j) {
            int n4 = e.b.stringWidth(this.a[j]);
            if (n4 <= n3) continue;
            n3 = n4;
        }
        this.f = n3 + 16 + d.a.c.p * 2;
        if (this.f < n) {
            this.f = n;
        }
        if (this.g < 0) {
            this.g = e.b;
            if (d.a.c.q > this.g) {
                this.g = d.a.c.q;
            }
            if ((this.o & 1) == 0) {
                this.g += 5;
            }
            if ((this.o & 2) == 0) {
                this.g += 5;
            }
        }
        this.b = (byte)14;
        this.a = (byte)2;
    }

    public final void a(String[] stringArray, int n, int n2, int n3, int n4, int n5, int n6) {
        this.a = stringArray;
        this.j = this.a.length;
        this.p = e.b - e.a;
        this.h = e.b;
        int n7 = 0;
        for (int j = 0; j < this.a.length; ++j) {
            int n8 = e.b.stringWidth(this.a[j]);
            if (n8 <= n7) continue;
            n7 = n8;
        }
        this.f = n7 + 4 + 16;
        if (this.f > this.W) {
            this.f = this.W;
        } else if (this.f < n3) {
            if (n6 == 4) {
                this.L = (n3 - this.f) / 2;
            }
            this.f = n3;
        }
        this.g = this.h * this.a.length + this.p + 16;
        if (this.g > n4) {
            this.g = n4;
        }
        this.a(null, this.a, this.f, this.g);
        if (this.f < this.W && this.e) {
            this.f += d.a.d.p;
        }
        this.b = (byte)11;
        this.a(n, n2, n5);
    }

    public final void a(String[] stringArray, f[] fArray, int n, int n2, int n3, int n4, byte by) {
        int n5;
        this.d = by;
        this.a = stringArray;
        this.a = fArray;
        this.j = this.a.length;
        if (by == 1) {
            this.a = d.a.m;
        } else if (by == 2) {
            this.a = d.a.n;
            if (this.j < 4) {
                String[] stringArray2 = new String[4];
                System.arraycopy(this.a, 0, stringArray2, 0, this.j);
                this.a = stringArray2;
                this.j = 4;
            }
        }
        this.p = e.b - e.a;
        this.o = 15;
        this.U = this.a.p;
        this.V = this.U >> 1;
        this.e();
        this.a = new short[this.j];
        this.R = 360 / this.j;
        this.P = this.Q = this.R / 2;
        for (n5 = 0; n5 < this.j; ++n5) {
            this.a[n5] = (short)(this.R * n5);
        }
        if (this.j == 1) {
            this.N = 0;
        } else if (n3 <= 0) {
            this.N = (this.a.p << 10) / (2 * a.a(45));
            this.O = this.N + this.a.p / 2;
            n3 = this.O * 2 + e.b + 2;
        } else {
            n5 = (this.a.p << 10) / a.a(this.R / 2) + this.a.q / 2;
            this.O = (n3 - e.b) / 2 - 2;
            if (this.O > n5) {
                this.O = n5;
            }
            this.N = this.O - this.a.q / 2;
        }
        this.M = 0;
        this.f = this.O * 2;
        this.g = n3;
        this.a = 0;
        this.a(n, n2, n4);
    }

    public final int a(int n) {
        int n2;
        int n3 = n2 = this.z;
        int n4 = this.a.size();
        do {
            if ((n2 += n) < 0) {
                n2 = n4 - 1;
                continue;
            }
            if (n2 < this.a.size()) continue;
            if (n3 < 0) {
                return -1;
            }
            n2 = 0;
        } while (!((d)this.a.elementAt((int)n2)).f);
        return n2;
    }

    public final void c() throws Exception {
        this.a(true);
    }

    public final void a(boolean bl) throws Exception {
        int n;
        if (this.a == 3) {
            return;
        }
        if (this.b == 10 && this.v > 0 && this.v <= 250) {
            ++this.y;
            this.a = true;
        } else if (this.y > 0) {
            --this.y;
            this.a = true;
        }
        if (bl && this.a == 2) {
            int n2;
            n = 0;
            if (this.a[0] && (a.a.a(i.h) || a.a.a(16))) {
                n = 1;
                a.a.b(i.h);
                a.a.b(16);
            }
            if (this.b == 0 || this.b == 3) {
                for (n2 = 0; n2 < this.a.length; ++n2) {
                    if (this.a[n2].m == this.a[n2].e() - 1) {
                        if (this.T == 0) {
                            this.a[n2].b(e.a(this.a.p - this.a[n2].p), e.a(this.a.q - this.a[n2].q));
                        } else {
                            this.a[n2].c = false;
                        }
                    }
                    this.a[n2].e();
                }
                this.a = true;
            }
            if (this.b == 15) {
                if (!this.g && this.z >= 0) {
                    int n3;
                    int n4;
                    if (a.a.a(1)) {
                        ((d)this.a.elementAt((int)this.z)).a = true;
                        this.z = this.a(-1);
                        d d2 = (d)this.a.elementAt(this.z);
                        ((d)this.a.elementAt(this.z)).a = true;
                        n4 = d2.e;
                        for (n3 = 0; n3 < 5; ++n3) {
                            if (n4 < this.b[n3]) {
                                if (this.I == n3) break;
                                this.a();
                                this.I = n3;
                                break;
                            }
                            n4 -= this.b[n3];
                        }
                    } else if (a.a.a(2)) {
                        ((d)this.a.elementAt((int)this.z)).a = true;
                        this.z = this.a(1);
                        d d3 = (d)this.a.elementAt(this.z);
                        ((d)this.a.elementAt(this.z)).a = true;
                        n4 = d3.e;
                        for (n3 = 0; n3 < 5; ++n3) {
                            if (n4 < this.b[n3]) {
                                if (this.I == n3) break;
                                this.a();
                                this.I = n3;
                                break;
                            }
                            n4 -= this.b[n3];
                        }
                    }
                }
                if (n != 0) {
                    a.a(this, this.z, "", (byte)0);
                    return;
                }
                for (n2 = 0; n2 < this.a.size(); ++n2) {
                    d d4 = (d)this.a.elementAt(n2);
                    if (this.g) {
                        d4.a(true);
                        continue;
                    }
                    d4.a(n2 == this.z);
                }
                this.a = true;
            } else if (this.b == 0) {
                if (this.a == 2) {
                    this.a = true;
                    if (a.a.a(4)) {
                        this.T -= this.R;
                        this.S += this.R;
                        --this.i;
                        if (this.i < 0) {
                            this.i = this.j - 1;
                        }
                    } else if (a.a.a(8)) {
                        this.T += this.R;
                        this.S -= this.R;
                        if (this.S < 0) {
                            this.S += 360;
                        }
                        ++this.i;
                        if (this.i >= this.j) {
                            this.i = 0;
                        }
                    }
                    if (this.T != 0) {
                        n2 = -this.T / 2;
                        this.T = n2 == 0 ? 0 : (this.T += n2);
                        if (this.T == 0) {
                            this.b();
                        }
                    } else if (a.a.c(4)) {
                        this.T -= this.R;
                        this.S += this.R;
                        --this.i;
                        if (this.i < 0) {
                            this.i = this.j - 1;
                        }
                    } else if (a.a.c(8)) {
                        this.T += this.R;
                        this.S -= this.R;
                        if (this.S < 0) {
                            this.S += 360;
                        }
                        ++this.i;
                        if (this.i >= this.j) {
                            this.i = 0;
                        }
                    }
                    if (n != 0) {
                        a.a(this, this.i, this.a[this.i], (byte)0);
                        return;
                    }
                }
            } else if (this.b == 13 || this.b == 14) {
                if (a.a.a(4)) {
                    --this.i;
                    if (this.i < 0) {
                        this.i = this.j - 1;
                    }
                    if (this.b == 14) {
                        a.a(this, this.i, null, (byte)2);
                    }
                    this.a = true;
                } else if (a.a.a(8)) {
                    ++this.i;
                    if (this.i >= this.j) {
                        this.i = 0;
                    }
                    if (this.b == 14) {
                        a.a(this, this.i, null, (byte)2);
                    }
                    this.a = true;
                } else if (n != 0) {
                    a.a(this, this.i, this.a[this.i], (byte)0);
                    return;
                }
            } else if (this.b == 3) {
                if (this.u != 0) {
                    this.u = Math.abs(this.u) < 2 ? 0 : (this.u -= this.u / 2);
                    this.a = true;
                }
                if (n != 0) {
                    a.a(this, this.i, this.a[this.i], (byte)0);
                    return;
                }
                if (a.a.a(4)) {
                    if (this.i < this.r) {
                        this.i += this.j;
                    }
                    --this.i;
                    if (this.i < this.r) {
                        if (this.i < 0) {
                            this.i += this.j;
                        }
                        this.r = this.i;
                        this.u = -this.h;
                    }
                    this.i %= this.j;
                    a.a(this, this.i, null, (byte)2);
                    this.b();
                    this.a = true;
                } else if (a.a.a(8)) {
                    if (this.i < this.r) {
                        this.i += this.j;
                    }
                    ++this.i;
                    if (this.i >= this.r + this.s) {
                        this.u = this.h;
                        this.r = (this.r + 1) % this.j;
                    }
                    this.i %= this.j;
                    a.a(this, this.i, null, (byte)3);
                    this.b();
                    this.a = true;
                }
            } else if (this.b == 10 || this.b == 7 || this.b == 11) {
                if (this.v != -1) {
                    if (this.v > 0) {
                        this.v -= 50;
                    } else {
                        a.a.a(this.a);
                    }
                }
                if (this.u > 0) {
                    this.u -= this.h / 3 + 1;
                    if (this.u < 0) {
                        this.u = 0;
                    }
                    this.a = true;
                } else if (this.u < 0) {
                    this.u += this.h / 3 + 1;
                    if (this.u > 0) {
                        this.u = 0;
                    }
                    this.a = true;
                }
                if (this.u == 0) {
                    if ((this.b == 11 || this.b == 10) && n != 0) {
                        a.a(this, this.i, this.a[this.i], (byte)0);
                        return;
                    }
                    if (this.b != 7 && a.a.a(1)) {
                        if (this.b == 11) {
                            --this.i;
                            if (this.i < 0) {
                                this.i = this.j - 1;
                                this.r = this.j - this.s;
                                if (this.b == 3) {
                                    this.r = this.i;
                                }
                            } else if (this.i < this.r) {
                                this.u = -this.h;
                                --this.r;
                            }
                            a.a(this, this.i, null, (byte)2);
                            this.a = true;
                        } else if (this.r > 0) {
                            this.u = -this.h;
                            --this.r;
                            this.a = true;
                        }
                        a.a.d();
                    }
                    if (a.a.a(2) || this.b == 7 && a.a.a(2048)) {
                        if (this.b == 11) {
                            ++this.i;
                            if (this.i >= this.j) {
                                this.i = 0;
                                this.r = 0;
                            } else if (this.i >= this.r + this.s) {
                                this.u = this.h;
                                ++this.r;
                            }
                            a.a(this, this.i, null, (byte)3);
                            this.a = true;
                        } else if (this.r + this.s < this.a.length) {
                            this.u = this.h;
                            ++this.r;
                            this.a = true;
                        } else if (this.b == 7) {
                            a.a(this, 0, null, (byte)0);
                            return;
                        }
                        a.a.d();
                    }
                }
            } else if (this.b == 8) {
                if (a.a.a(1)) {
                    if (this.B > 0) {
                        --this.B;
                        this.a = true;
                    }
                } else if (a.a.a(2) && this.B + this.D < this.F) {
                    ++this.B;
                    this.a = true;
                }
                if (a.a.a(4)) {
                    if (this.A > 0) {
                        --this.A;
                        this.a = true;
                    }
                } else if (a.a.a(8) && this.A + this.C < this.E) {
                    ++this.A;
                    this.a = true;
                }
            }
            if (this.a == 2 && this.a[1] && a.a.a(i.i)) {
                a.a.b(i.i);
                a.a.d();
                if (this.a != null) {
                    a.a.a(this.a);
                }
                if (this.a != null) {
                    a.a(this, this.i, this.a[this.i], (byte)1);
                    return;
                }
                a.a(this, -1, null, (byte)1);
                return;
            }
        }
        if (this.c && ++this.l >= this.a) {
            this.k = this.k == 0 ? 2 : 0;
            this.l = 0;
            this.a = true;
        }
        switch (this.a) {
            case 0: {
                if (this.b == 0) {
                    if (this.M < this.N) {
                        n = this.d == 2 ? this.N / 2 : this.N / 5;
                        if (n < 1) {
                            n = 1;
                        }
                        this.M += n;
                        if (this.M > this.N) {
                            this.M = this.N;
                        }
                    } else {
                        this.P = Math.abs(360 - this.a[0]) / 2;
                        if (this.P < 1) {
                            this.P = 1;
                        } else if (this.P > this.Q) {
                            this.P = this.Q;
                        }
                    }
                    if (this.d == 1) {
                        for (n = 0; n < this.a.length; ++n) {
                            this.a[n] = (short)((this.a[n] + this.P) % 360);
                        }
                    }
                    if (a.a.a() || this.M >= this.N && this.a[0] == 0) {
                        this.M = this.N;
                        for (n = 0; n < this.a.length; ++n) {
                            this.a[n] = (short)(this.R * n);
                        }
                        this.a = (byte)2;
                        if (this.d) {
                            a.a.d();
                        }
                    }
                } else if (this.b == 13) {
                    this.m += (this.d - this.m) / 2;
                    ++this.w;
                    if (this.w == 2) {
                        this.a = (byte)2;
                        this.m = this.d;
                    }
                } else {
                    n = (this.d - this.m) / 4;
                    if (n <= 0) {
                        n = 1;
                    }
                    this.m += n;
                    if (this.m == this.d) {
                        this.a = (byte)2;
                    }
                }
                this.a = true;
                return;
            }
            case 1: {
                this.a = (byte)3;
            }
        }
    }

    public static final void a(Graphics graphics, int n, int n2, int n3, int n4) {
        if (n4 <= 2) {
            graphics.fillRect(n, n2, n3, n4);
            return;
        }
        graphics.fillRect(n, n2 + 1, n3, n4 - 2);
        graphics.fillRect(n + 1, n2, n3 - 2, n4);
    }

    public final void a(Graphics graphics) {
        this.a(graphics, 0, 0, false);
    }

    public final void a(Graphics graphics, int n, int n2, boolean bl) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        if (this.a == 3) {
            return;
        }
        if (!this.a) {
            return;
        }
        this.a = false;
        if (a.a.a == this && this.b || this.b == 0) {
            a.a(graphics);
        }
        this.b = false;
        graphics.setClip(0, 0, this.W, this.X);
        if (this.a != null) {
            this.a.a(graphics);
        }
        int n9 = this.m + n;
        int n10 = this.n + n2;
        int n11 = 0;
        int n12 = 0;
        if (this.b != 0 && this.b != 13) {
            d.a(graphics, n9, n10, this.f, this.g, this.o, this.H, this.G, this.y, 5);
            graphics.setClip(0, 0, this.W, this.X);
        }
        n11 = this.f;
        n12 = this.g;
        if ((this.o & 1) == 0) {
            n12 -= 5;
            n10 += 5;
        }
        if ((this.o & 2) == 0) {
            n12 -= 5;
        }
        if ((this.o & 4) == 0) {
            n9 += 8;
            n11 -= 8;
        }
        if ((this.o & 8) == 0) {
            n11 -= 8;
        }
        graphics.translate(n9, n10);
        graphics.setFont(this.a);
        if (this.a != null && (this.a == null || this.a.stringWidth(this.a[0]) < n11 - this.a.a * 2)) {
            this.a.a(graphics, 0, n12 / 2, 6);
        }
        if (bl) {
            graphics.setColor(5594742);
            d.a(graphics, 0, 0, n11, n12);
        }
        if (this.b == 0) {
            graphics.setColor(0xFFFFFF);
            n8 = this.S + this.T;
            for (n7 = this.a.length - 1; n7 >= 0; --n7) {
                n6 = (this.a[n7] + n8) % 360;
                if (n6 < 0) {
                    n6 += 360;
                }
                n5 = this.O + (a.a(n6) * this.M >> 10);
                n4 = e.b + this.O + 2 - (a.b(n6) * this.M >> 10);
                if (this.a == 2 && n7 == this.i) {
                    this.a.a(graphics, 1, n5, n4, 3);
                    if (this.T == 0) {
                        for (n3 = 0; n3 < this.a.length; ++n3) {
                            this.a[n3].a(graphics, n5 - this.V, n4 - this.V, 20);
                        }
                    }
                } else {
                    this.a.a(graphics, 0, n5, n4, 3);
                }
                if (this.a[n7] == null || this.a == null || this.a[n7] == null) continue;
                this.a[n7].a(graphics, n5, n4, 3);
            }
            if (this.a == 2) {
                for (n7 = 0; n7 < this.a.length; ++n7) {
                    this.a[n7].a(graphics, (this.f - this.U) / 2, e.b, 3);
                }
            }
        }
        switch (this.b) {
            case 15: {
                int n13;
                n7 = 0;
                n6 = 0;
                n3 = this.b[0];
                for (n13 = 1; n13 <= this.I; ++n13) {
                    n7 = n3;
                    n3 += this.b[n13];
                }
                if (this.I > 0) {
                    n6 = -n7 + d.a.e.q;
                }
                for (n13 = 0; n13 < this.a.size(); ++n13) {
                    d d2 = (d)this.a.elementAt(n13);
                    if (d2.e < n7 || d2.e >= n3) continue;
                    d2.a(graphics, 0, n6, n13 == this.z);
                }
                graphics.setClip(0, 0, d.a.a, d.a.b);
                if (this.I > 0) {
                    graphics.setColor(2370117);
                    graphics.fillRect(0, 0, this.W, d.a.e.q);
                    d.a.d.a(graphics, 0, d.a.a / 2, -this.k, 17);
                }
                if (this.I >= this.J) break;
                graphics.setColor(2370117);
                n13 = this.b[this.I];
                if (this.I > 0) {
                    n13 += d.a.e.q;
                }
                graphics.fillRect(0, n13, this.W, d.a.b - n13);
                d.a.d.a(graphics, 1, d.a.a / 2, d.a.b + this.k, 33);
                break;
            }
            case 0: {
                if (this.a != 2) break;
                graphics.setColor(1645370);
                if (this.d == 2) {
                    int n14;
                    int n15 = this.f;
                    if (this.a[this.i] != null && n15 < (n14 = e.b.stringWidth(this.a[this.i]) + 2)) {
                        n15 = n14;
                    }
                    d.a(graphics, (this.f - n15) / 2, 1, n15, e.b);
                } else {
                    d.a(graphics, 2 - this.d, 1, this.W - 4, e.b);
                }
                if (this.a[this.i] == null) break;
                graphics.setColor(0xFFFFFF);
                e.b(graphics, this.a[this.i], this.O, (this.p >> 1) + 1, 17);
                break;
            }
            case 3: {
                graphics.setClip(0, 0, n11, n12);
                n4 = b;
                graphics.setColor(11515819);
                graphics.drawLine(b, n4, n11 - b * 2, n4);
                n4 += 1 + b;
                n4 += d.a.m.q / 2;
                n5 = d.a.c.p + this.u + this.x;
                int n16 = this.r;
                int n17 = this.r + this.s;
                if (this.u > 0) {
                    --n16;
                    n5 -= this.h;
                } else if (this.u < 0) {
                    ++n17;
                }
                for (int j = n16; j < n17; ++j) {
                    int n18 = j % this.j;
                    if (n18 < 0) {
                        n18 += this.j;
                    }
                    int n19 = n5 + this.h / 2;
                    if (n18 == this.i) {
                        d.a.m.a(graphics, 1, n19, n4, 3);
                    } else {
                        d.a.m.a(graphics, 0, n19, n4, 3);
                    }
                    c c2 = this.a[n18];
                    int n20 = n19 - c2.n - c2.p / 2;
                    int n21 = n4 - c2.o - c2.q / 2;
                    c2.a(graphics, n20, n21, c2.k > d.a.f[d.a.f]);
                    if (n18 == this.i) {
                        int n22 = n19 - this.a.p / 2;
                        int n23 = n4 - this.a.p / 2;
                        for (int k = 0; k < this.a.length; ++k) {
                            this.a[k].a(graphics, n22, n23, 20);
                        }
                    }
                    n5 += this.h;
                }
                d.a.c.a(graphics, 0, 0, n4, 6);
                d.a.c.a(graphics, 1, n11, n4, 10);
                break;
            }
            case 2: 
            case 5: {
                int n24;
                int n25;
                int n26;
                int n27;
                graphics.setClip(0, 0, n11, n12);
                int n28 = b;
                int n29 = e.a[0].p;
                n4 = n28;
                this.a.a(graphics, -this.a.n + n28, -this.a.o + n4);
                n8 = n4 + this.a.q / 2;
                String string = null;
                graphics.setFont(e.b);
                graphics.setColor(this.a);
                e.b(graphics, this.a.a, n28 + this.a.p + n28, n8 - e.a / 2, 20);
                if (this.b == 2) {
                    string = "" + this.a.k;
                    d.a.p.a(graphics, 1, n11 - n28 - e.a((byte)1, string), n8, 10);
                } else {
                    string = "" + this.a.g;
                }
                e.a(graphics, string, n11 - n28, n8, 1, 10);
                this.p = e.b - e.a;
                graphics.setColor(this.a);
                graphics.drawLine(n28, n4 += this.a.q + b, n11 - n28 - n28, n4);
                n4 += 1 + b;
                if (this.b == 5) {
                    n27 = e.a;
                    n8 = n4 + n27 / 2;
                    n5 = n28;
                    e.b(graphics, a.a(97), n5, n4, 20);
                    n26 = e.b.stringWidth(a.a(97));
                    n25 = n11 - (n5 += n26 + n28) - n28 - d.a.o.p - n29 - n28;
                    graphics.setColor(this.a);
                    d.a(graphics, n5, n4, n25, n27);
                    graphics.setColor(2370117);
                    n24 = n25 * this.a.a / this.a.b();
                    if (n24 <= 0) {
                        n24 = 1;
                    }
                    graphics.fillRect(n5 + 1, n4 + 1, n24, n27 - 2);
                    n5 = n11 - n28 - n29;
                    d.a.o.a(graphics, 2, n5, n8, 10);
                    e.a(graphics, "" + this.a.a, n5, n8, 0, 6);
                    graphics.setColor(this.a);
                    graphics.drawLine(n28, n4 += n27 + b, n11 - n28 - n28, n4);
                    n4 += 1 + b;
                }
                n27 = (n11 - n28 * 3) / 2;
                n26 = d.a.o.q;
                n25 = d.a.n.q;
                n24 = n25 / 2;
                for (int j = 0; j < 2; ++j) {
                    int n30 = n4 + n24 - n26 / 2;
                    n5 = n28;
                    for (int k = 0; k < 2; ++k) {
                        if (j != 0 && k != 0) continue;
                        int n31 = n5 + n24;
                        d.a(graphics, n31, n30, n27 - n24, n26);
                        d.a.n.a(graphics, n5, n4);
                        int n32 = j * 2 + k;
                        if (n32 == 0 || n32 == 1) {
                            d.a.o.a(graphics, n32, n31, n4 + n24, 3);
                        }
                        int n33 = 0;
                        if (n32 == 0) {
                            if (this.b == 5) {
                                n33 = this.a.a((c)null);
                            }
                            string = this.a.d + n33 + "-" + (this.a.e + n33);
                        } else if (n32 == 1) {
                            if (this.b == 5) {
                                n33 = this.a.b((c)null);
                            }
                            string = "" + (this.a.f + n33);
                        } else if (n32 == 2) {
                            d.a.a[5].a(graphics, n31, n4 + n24, 3);
                            string = "" + c.a[this.a.d];
                        }
                        e.a(graphics, string, n5 + n25 + 1, n4 + n24, 0, 6);
                        if (n33 > 0) {
                            d.a.u.a(graphics, 1, n31 + n27 - n24 - 1, n4 + n24, 10);
                        } else if (n33 < 0) {
                            d.a.u.a(graphics, 2, n31 + n27 - n24 - 1, n4 + n24, 10);
                        }
                        n5 += n27 + b;
                    }
                    n4 += n25;
                }
                graphics.setColor(this.a);
                graphics.drawLine(n28, n4 += b, n11 - n28 - n28, n4);
                break;
            }
            case 8: {
                int n34;
                int n35;
                int n36;
                int n37;
                a.a(graphics, 0, 0, this.f, this.g);
                int n38 = d.a.c[0].a;
                int n39 = d.a.c[0].b;
                int n40 = this.D + this.B;
                int n41 = this.C + this.A;
                n4 = 4;
                for (n37 = this.B; n37 < n40; ++n37) {
                    n5 = 4;
                    for (n36 = this.A; n36 < n41; ++n36) {
                        n35 = d.a.h[this.a[n36][n37]];
                        if (this.a[n36][n37] >= d.a.j) {
                            n34 = (this.a[n36][n37] - d.a.j) / 2;
                            n35 = 2 * n34 + 8 + n35 - 8;
                        }
                        d.a.c[n35].a(graphics, n5, n4);
                        n5 += n38;
                    }
                    n4 += n39;
                }
                if (this.b != null && this.k == 0) {
                    n37 = -this.A * n38 + 4;
                    n36 = -this.B * n39 + 4;
                    n34 = d.a.a.size();
                    for (n35 = 0; n35 < n34; ++n35) {
                        c c3 = (c)d.a.a.elementAt(n35);
                        if (c3.c < this.A || c3.c >= n41 || c3.d < this.B || c3.d >= n40) continue;
                        d.a.q.a(graphics, d.a.j[c3.e] - 1, c3.c * n38 + n37, c3.d * n39 + n36, 0);
                    }
                }
                if (this.k != 0) break;
                if (this.B > 0) {
                    d.a.d.a(graphics, 0, n11 / 2, 0, 17);
                }
                if (this.B + this.D < this.F) {
                    d.a.d.a(graphics, 1, n11 / 2, n12, 33);
                }
                if (this.A > 0) {
                    d.a.c.a(graphics, 0, 0, n12 / 2, 6);
                }
                if (this.A + this.C >= this.E) break;
                d.a.c.a(graphics, 1, n11, n12 / 2, 10);
                break;
            }
            case 14: {
                graphics.setFont(e.b);
                graphics.setColor(i.a(0xFFFFFF, 1645370, this.y, 5));
                n8 = n12 / 2;
                e.b(graphics, this.a[this.i], n11 / 2, (n12 - e.a) / 2, 17);
                d.a.c.a(graphics, 0, 0, n8, 6);
                d.a.c.a(graphics, 1, n11, n8, 10);
                break;
            }
            case 13: {
                int n42 = e.b;
                int n43 = (this.g - n42) / 2;
                graphics.setColor(i.a(1645370, 0xFFFFFF, this.y, 5));
                d.a(graphics, 0, n43, this.f, n42);
                graphics.setFont(e.b);
                graphics.setColor(0xFFFFFF);
                e.b(graphics, this.a[this.i], 16, n43 + this.q, 20);
                int n44 = this.f - this.h;
                for (int j = this.j - 1; j >= 0; --j) {
                    if (j == this.i) {
                        d.a.n.a(graphics, 1, n44, 0, 20);
                    } else {
                        d.a.n.a(graphics, 0, n44, 0, 20);
                    }
                    this.a[j].a(graphics, n44 + d.a.n.p / 2, this.g / 2, 3);
                    n44 -= this.h;
                }
                break;
            }
            case 7: 
            case 10: 
            case 11: {
                int n45;
                int n46;
                int n47;
                int n48;
                graphics.setFont(e.b);
                if (this.c != -1) {
                    d.a.l.a(graphics, this.c, -8, n12, 36);
                }
                graphics.setClip(0, 0, n11 -= this.t, this.g - 10);
                int n49 = 0;
                n4 = 0;
                if (this.b != null) {
                    graphics.setColor(i.a(0xFFFFFF, this.H, this.y, 5));
                    for (n48 = 0; n48 < this.b.length; ++n48) {
                        e.b(graphics, this.b[n48], this.t + n11 / 2, n4 + this.q, 17);
                        n4 += this.h;
                    }
                    graphics.setColor(10463131);
                    graphics.drawLine(0, n4, n11 - 1, n4);
                    n49 = n4;
                }
                n48 = n4 + this.x;
                graphics.setColor(this.a);
                int n50 = this.r;
                int n51 = this.r + this.s;
                if (this.u > 0) {
                    --n50;
                    n4 -= this.h;
                } else if (this.u < 0) {
                    ++n51;
                }
                n4 += this.u + this.x;
                graphics.setClip(this.t, n49, n11, n12 - n49);
                int n52 = n11;
                if (this.e) {
                    n52 -= d.a.d.p;
                }
                int n53 = this.t + n52 / 2;
                for (n47 = n50; n47 < n51; ++n47) {
                    n46 = 0;
                    if (n4 < n48) {
                        n46 = n48 - n4;
                    } else if (n4 + this.h > n12 - this.x) {
                        n46 = n4 + this.h - n12 + this.x;
                    }
                    if (this.b == 11 && n47 == this.i) {
                        graphics.setColor(5594742);
                        d.a(graphics, 0, n4, n52, this.h);
                        n45 = i.a(this.H, 0xFFFFFF, this.h - n46, this.h);
                    } else {
                        n45 = i.a(this.H, this.a, this.h - n46, this.h);
                    }
                    n45 = i.a(n45, this.H, this.y, 5);
                    graphics.setColor(n45);
                    if (this.L >= 0) {
                        e.b(graphics, this.a[n47], this.L, n4 + this.q, 20);
                    } else {
                        e.b(graphics, this.a[n47], n53, n4 + this.q, 17);
                    }
                    n4 += this.h;
                }
                if (this.e) {
                    n47 = d.a.d.q;
                    n46 = d.a.d.p;
                    n45 = d.a.d.p / 2;
                    int n54 = n12 - n47 * 2 - 2;
                    int n55 = n11 - (n46 + n45) / 2;
                    if (n54 > 2) {
                        graphics.setColor(this.a);
                        d.a(graphics, n55, n47 + 1, n45, n54);
                        int n56 = (n54 - 2) * this.s / this.j;
                        if (n56 < 1) {
                            n56 = 1;
                        }
                        graphics.setColor(2370117);
                        d.a(graphics, n55 + 1, n47 + (n54 - 2) * this.r / this.j + 2, n45 - 2, n56);
                        d.a.d.a(graphics, 0, n11 - n46, 0, 20);
                        d.a.d.a(graphics, 1, n11 - n46, n12, 36);
                    } else {
                        if (this.r > 0) {
                            d.a.d.a(graphics, 0, n11 - n46, 0, 20);
                        }
                        if (this.r + this.s < this.j) {
                            d.a.d.a(graphics, 1, n11 - n46, n12, 36);
                        }
                    }
                }
                if (this.b != 7) break;
                graphics.setClip(0, 0, this.W, this.X);
                n47 = n12;
                if ((this.o & 2) == 0) {
                    n47 += 5;
                }
                d.a.d.a(graphics, 1, n11 + this.t, n47, 40);
            }
        }
        graphics.translate(-n9, -n10);
        graphics.setClip(0, 0, this.W, this.X);
        if (a.a.a == this && this.a == 2) {
            if (this.a[0]) {
                a.a(graphics, i.h, 0, d.a.b);
            }
            if (this.a[1]) {
                a.a(graphics, i.i, 1, d.a.b);
            }
        }
    }

    public static final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5) {
        d.a(graphics, n, n2, n3, n4, n5, 2370117, 2370117, 0, 0);
    }

    public static final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        int n10;
        int n11;
        int n12;
        int n13;
        h h2 = d.a.f;
        graphics.setClip(n, n2, n3, n4);
        graphics.setColor(n6);
        graphics.fillRect(n, n2, n3, n4);
        if (n7 != n6) {
            n13 = n4 / 4;
            n12 = n2 + 5;
            for (n11 = 0; n11 < n13; ++n11) {
                n10 = i.a(n7, n6, n11, n13);
                graphics.setColor(i.a(n10, n6, n8, n9));
                graphics.fillRect(n, n12, n3, 1);
                ++n12;
            }
        }
        if (n5 != 15) {
            int n14;
            n13 = (n5 & 4) == 0 ? 1 : 0;
            n12 = (n5 & 8) == 0 ? 1 : 0;
            n10 = (n5 & 1) == 0 ? 1 : 0;
            n11 = (n5 & 2) == 0 ? 1 : 0;
            int n15 = n3 / h2.p - 2;
            if (n3 % h2.p != 0) {
                ++n15;
            }
            if (n13 == 0) {
                ++n15;
            }
            if (n12 == 0) {
                ++n15;
            }
            int n16 = n4 / h2.q - 2;
            if (n4 % h2.q != 0) {
                ++n16;
            }
            if (n10 == 0) {
                ++n16;
            }
            if (n11 == 0) {
                ++n16;
            }
            int n17 = n;
            if (n13 != 0) {
                n17 += h2.p;
            }
            int n18 = n2 + n4 - h2.q;
            for (n14 = 0; n14 < n15; ++n14) {
                if (n10 != 0) {
                    h2.a(graphics, 1, n17, n2, 0);
                }
                if (n11 != 0) {
                    h2.a(graphics, 6, n17, n18, 0);
                }
                n17 += h2.p;
            }
            n14 = n2;
            if (n10 != 0) {
                n14 += h2.q;
            }
            int n19 = n + n3 - h2.p;
            for (int j = 0; j < n16; ++j) {
                if (n13 != 0) {
                    h2.a(graphics, 3, n, n14, 0);
                }
                if (n12 != 0) {
                    h2.a(graphics, 4, n19, n14, 0);
                }
                n14 += h2.q;
            }
            if (n13 != 0 && n10 != 0) {
                h2.a(graphics, 0, n, n2, 0);
            }
            if (n12 != 0 && n10 != 0) {
                h2.a(graphics, 2, n19, n2, 0);
            }
            if (n13 != 0 && n11 != 0) {
                h2.a(graphics, 5, n, n18, 0);
            }
            if (n12 != 0 && n11 != 0) {
                h2.a(graphics, 7, n19, n18, 0);
            }
        }
    }
}
