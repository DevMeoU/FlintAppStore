/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class g {
    public static final String[] a = new String[]{"road", "grass", "woods", "hill", "mountain", "water", "bridge", "town"};
    public static final byte[] a = new byte[]{0, 1, 1, 1, 4, 5, 6, 7, 7, 7};
    public static final byte[] b = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 7, 7};
    public static final String[] b = new String[]{"soldier", "archer", "lizard", "wizard", "wisp", "spider", "golem", "catapult", "wyvern", "king", "skeleton"};
    public i a;
    public c a;
    public byte a;
    public boolean a;
    public boolean b;
    public boolean c;
    public byte b;
    public byte c;
    public byte d;
    public byte e;
    public byte f;
    public byte g;
    public boolean d;
    public int a;
    public static final byte[] c;
    public h a;
    public h b;
    public h c;
    public h d;
    public int b;
    public int c;
    public long a;
    public long b;
    public long c;
    public h[] a;
    public f[] a;
    public f a;
    public g a;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean e;
    public int h;
    public int i;
    public int[][] a;
    public int[] a;
    public int j;
    public int k = 20;
    public int l;
    public int m;
    public byte[][] a = 0;
    public h e = false;
    public h f;
    public h[] b = false;
    public int n;
    public int o;

    public g(i i2, c c2, g g2) throws Exception {
        int n;
        this.a = i2;
        this.a = c2;
        this.a = c2.d;
        this.a = g2;
        this.b = (byte)c2.g;
        this.h = this.b;
        this.f = this.d = (byte)c2.c();
        int n2 = 0;
        if (g2 == null) {
            this.g = 0;
            this.b = 0;
            this.d = true;
        } else {
            n2 = i2.c;
            this.g = 1;
            this.a = 0;
        }
        this.d = i2.a((int)c2.c, (int)c2.d);
        byte by = b[this.d];
        byte by2 = a[this.d];
        if (g2 != null && by2 == a[g2.d]) {
            this.a = new f[g2.a.length];
            System.arraycopy(g2.a, 0, this.a, 0, this.a.length);
        } else {
            this.a = new h((String)g.a[by2]).a;
        }
        if (this.g == 1) {
            for (n = 0; n < this.a.length; ++n) {
                this.a[n] = new f(this.a[n], 1);
            }
        }
        try {
            this.a = g2 != null && by == b[g2.d] ? g2.a : new f(a[by] + "_bg");
            if (this.g == 1) {
                this.a = new f(this.a, 1);
            }
        }
        catch (Exception exception) {}
        if (this.a != null) {
            this.e = this.a.b;
        }
        this.f = i2.c / this.a[0].a;
        if (i2.c % this.a[0].a != 0) {
            ++this.f;
        }
        this.g = (i2.aH - this.e) / this.a[0].b;
        if ((i2.aH - this.e) % this.a[0].b != 0) {
            ++this.g;
        }
        this.a = new byte[this.f][this.g];
        for (n = 0; n < this.f; ++n) {
            for (int j = 0; j < this.g; ++j) {
                this.a[n][j] = (byte)Math.abs(e.a.nextInt() % this.a.length);
            }
        }
        this.a = new h(b[this.a], i2.j[c2.e]);
        if (g2 != null && g2.a == this.a) {
            if (g2.d != null) {
                this.d = new h(g2.d);
            }
            if (g2.b != null) {
                this.b = new h(g2.b);
            }
            if (g2.c != null) {
                this.c = new h(g2.c);
            }
            if (g2.e != null) {
                this.e = new h(g2.e);
                this.f = new h(g2.f);
            }
        } else if (this.a == 0 || this.a == 10 || this.a == 5) {
            this.d = new h("slash");
        } else if (this.a == 1) {
            this.c = new h("archer_arrow");
        } else if (this.a == 9) {
            this.b = new h("kingwave");
            this.d = new h("kingslash");
            this.e = new h("king_heads");
            this.f = new h("king_heads_back");
        } else if (this.a == 2) {
            this.b = new h("watermagic");
            this.c = new h("fish");
        } else if (this.a == 7 || this.a == 6) {
            this.c = new h("crater");
        } else if (this.a == 3) {
            this.c = this.b = new h("spell");
        }
        if (this.b != null) {
            this.b.a(0, this.d);
        }
        if (this.c != null) {
            this.c.a(0, this.d);
        }
        if (this.d != null) {
            this.d.a(0, this.d);
        }
        if (this.e != null) {
            this.e.a(c2.j, this.d);
            this.e.c(c2.j);
            this.f.a(0, this.d);
            this.f.c(c2.j);
        }
        this.a = new int[c2.a.length][2];
        for (n = 0; n < this.a.length; ++n) {
            this.a[n][0] = c2.a[n][0] * i2.W / 128;
            if (this.g == 1) {
                this.a[n][0] = i2.c - this.a[n][0] - this.a.p + n2;
            }
            this.a[n][1] = c2.a[n][1] * i2.aH / 128 - this.a.q;
        }
        this.a = new h[this.d];
        if (this.a == 4 || this.a == 6) {
            this.a = new int[this.d];
        }
        for (n = 0; n < this.d; ++n) {
            this.a[n] = new h(this.a);
            i2.a(this.a[n]);
            this.a[n].b(this.a[n][0], this.a[n][1]);
            this.a[n].a(0, this.d);
            this.a[n].e = false;
            this.a[n].w = 0;
            if (this.a == 6) {
                this.a[n].g = true;
                this.a[n] = e.a(360);
                this.a[n].r = -6 + 4 * a.a(this.a[n]) >> 10;
                continue;
            }
            if (this.a == 4) {
                this.a[n].g = true;
                this.a[n].r = -5 - e.a(10);
                this.a[n] = e.a(360);
                continue;
            }
            if (this.a != 9) continue;
            this.a[n].a = this.e;
            this.a[n].b = this.f;
        }
    }

    public final int a(h h2, int n) {
        if (this.g == 1) {
            return this.a.p - n - h2.p;
        }
        return n;
    }

    public final void a() {
        this.a = true;
        this.a = 1;
        this.b = this.a.c;
    }

    public final void b() {
        switch (this.a) {
            case 1: {
                if (this.a == 6) {
                    if (this.l == 0) {
                        if (this.a.c - this.b < 200L) break;
                        if (this.o < this.f) {
                            this.a[this.o].z = -1;
                            this.a[this.o].g = false;
                            this.a[this.o].x = 0;
                        }
                        if (++this.o < this.f) break;
                        this.o = 0;
                        this.l = 1;
                        this.b = this.a.c;
                        return;
                    }
                    if (this.l == 1) {
                        if (this.a.c - this.b < 200L) break;
                        if (this.o < this.f) {
                            this.a[this.o].x = -1;
                        }
                        if (++this.o < this.f) break;
                        this.o = 0;
                        this.l = 2;
                        this.b = this.a.c;
                        return;
                    }
                    if (this.l != 2) break;
                    boolean bl = true;
                    if (this.a.c - this.b >= 200L) {
                        if (this.o < this.f) {
                            this.a[this.o].z = 0;
                            this.a[this.o].x = 0;
                            this.a[this.o].a(2, this.d);
                            this.a[this.o].s = 1;
                        }
                        if (++this.o < this.f) {
                            bl = false;
                        }
                    } else {
                        bl = false;
                    }
                    for (int j = 0; j < this.f; ++j) {
                        if (this.a[j].z == 0) {
                            if (this.a[j].m == 1) {
                                this.a[j].r = 0;
                                this.a[j].z = 1;
                                this.a.d(1200);
                                e.b(14, 1);
                                for (int k = 0; k < 2; ++k) {
                                    h h2 = h.a(this.a.g, 0, 0, -1, 1, e.a(4) * 50, (byte)0);
                                    h2.b(this.a[j].n + e.a(this.a.p - h2.p), this.a[j].o + this.a.q - h2.q + 2);
                                    h2.f = true;
                                    this.a.a(h2);
                                }
                                h h3 = h.a(this.a.g, -1, 0, -1, 1, e.a(4) * 50, (byte)0);
                                h3.b(this.a[j].n, this.a[j].o + this.a.q - h3.q + 2);
                                h3.f = true;
                                this.a.a(h3);
                                h3 = h.a(this.a.g, 1, 0, -1, 1, e.a(4) * 50, (byte)0);
                                h3.b(this.a[j].n + this.a.p - h3.p, this.a[j].o + this.a.q - h3.q + 2);
                                h3.f = true;
                                this.a.a(h3);
                            }
                            bl = false;
                            continue;
                        }
                        if (this.a[j].z == -1) continue;
                        if (this.a[j].s > 0) {
                            bl = false;
                            continue;
                        }
                        if (this.a[j].s == -1) continue;
                        if (this.a[j].z == 1) {
                            this.a[j].a(3, this.d);
                            this.a[j].s = 1;
                            this.a[j].z = 2;
                            bl = false;
                            continue;
                        }
                        if (this.a[j].z != 2) continue;
                        this.a[j].r = -6;
                        this.a[j].g = true;
                        this.a[j].x = e.a(-2, 3);
                        this.a[j].a(0, this.d);
                        this.a[j].s = -1;
                        this.a[j].z = 3;
                        bl = false;
                    }
                    if (!bl) break;
                    this.l = 0;
                    this.b = this.a.c;
                    this.a = 4;
                    return;
                }
                if (this.l == 0) {
                    if (this.a.c - this.b < 200L) break;
                    if (this.a == 9) {
                        this.b = new h[this.f * 2];
                    } else if (this.a != 7 && this.a != 1) {
                        this.b = new h[this.f];
                    }
                    this.l = 1;
                    this.o = 0;
                    this.b = this.a.c;
                    return;
                }
                if (this.l != 1) break;
                boolean bl = true;
                if (this.o < this.f) {
                    this.a[this.o].a(2, this.d);
                    this.a[this.o].s = 1;
                    if (this.a == 3 || this.a == 2) {
                        this.b[this.o] = h.a(this.b, 0, 0, 0, 1, 50, (byte)0);
                        this.b[this.o].b(this.a[this.o].n + this.a(this.b[this.o], this.a[this.o].p), this.a[this.o].o);
                        this.a.a(this.b[this.o]);
                    } else if (this.a == 1) {
                        h h4 = h.a(this.c, 0, 0, 0, 1, 0, (byte)0);
                        h4.a(1, this.d);
                        h4.b(this.a[this.o].n + this.a(h4, this.a[this.o].p), this.a[this.o].o);
                        this.a.a(h4);
                    } else if (this.a == 7) {
                        this.a[this.o].y = 5;
                        for (int j = 0; j < 3; ++j) {
                            h h5 = h.a(this.a.r, e.a(-1, 2), 0, 0, 1, e.a(4) * 50, (byte)0);
                            h5.b(this.a[this.o].n + this.a.p / 2, this.a[this.o].o);
                            h5.f = true;
                            this.a.a(h5);
                        }
                    } else if (this.a == 9) {
                        h h6 = h.a(this.d, 0, 0, 0, 1, 200, (byte)0);
                        h6.b(this.a[0].n, this.a[0].o + this.a.q);
                        h6.r = -this.a.q;
                        this.a.a(h6);
                        this.b[0] = h.a(this.b, c[this.g] * 3, -2, 0, -1, 100, (byte)0);
                        int n = this.a[this.o].n + this.a(this.b[this.o], this.a[this.o].p / 2);
                        int n2 = this.a[this.o].o + this.a.q - this.b[this.o].q + 2;
                        this.b[0].b(n, n2);
                        this.b[1] = h.a(this.b, c[this.g] * 3, 1, 0, -1, 100, (byte)0);
                        this.b[1].b(n, n2);
                        this.a.a(this.b[1]);
                        this.b[1].l = this.g;
                        this.a.a(this.b[0]);
                        this.b[0].l = this.g;
                    } else if (this.a == 8) {
                        this.b[this.o] = h.a(null, c[this.g], 0, 0, -1, 2000, (byte)6);
                        this.b[this.o].b(this.a[this.o].n + this.a(this.b[this.o], this.a[this.o].p + 2), this.a[this.o].o + 30);
                        this.b[this.o].f = true;
                        this.a.d(1200);
                        e.b(14, 1);
                        this.a.a(this.b[this.o]);
                    }
                }
                if (++this.o < this.f) {
                    bl = false;
                }
                for (int j = 0; j < this.f; ++j) {
                    if (this.a[j].s > 0) {
                        bl = false;
                    } else if (this.a != 7 && this.a[j].s != -1) {
                        if (this.a[j].z == 0) {
                            this.a[j].a(3, this.d);
                            this.a[j].s = 1;
                            this.a[j].z = 1;
                            if (this.a == 8) {
                                this.b[j].d = false;
                            }
                            bl = false;
                        } else if (this.a[j].z == 1) {
                            this.a[j].a(0, this.d);
                            this.a[j].s = -1;
                            this.a[j].z = 2;
                            bl = false;
                        }
                    }
                    if (this.a != 8 || this.b[j] == null || !this.b[j].d) continue;
                    h h7 = h.a(this.a.r, c[this.g] * e.a(1, 4), e.a(-2, 3), 0, 1, 50 * e.a(4), (byte)0);
                    h7.b(this.a[j].n + this.a(h7, this.a.p), this.b[j].o + e.a(30 - this.b[j].q) - 15);
                    h7.f = true;
                    this.a.a(h7);
                }
                if (!bl) break;
                this.a = this.a.d == 9 ? 6 : 4;
                this.m = 400;
                if (this.a.d == 8) {
                    this.m = 0;
                }
                this.b = this.a.c;
                this.l = 0;
                return;
            }
            case 6: {
                boolean bl = true;
                for (int j = 0; j < this.b.length; ++j) {
                    if (this.a == 9 && e.a(2) == 0) {
                        h h8 = h.a(this.a.r, e.a(-2, 1), 0, -1, 1, 100, (byte)0);
                        h8.b(this.b[j].n + this.a(this.b[j], 0), this.b[j].o + this.b[j].q - h8.q);
                        h8.l = this.b[j].z == 1 ? this.a.g : this.g;
                        this.a.a(h8);
                    }
                    if (this.a != 9) continue;
                    if (this.g == 0) {
                        if (this.b[j].n >= this.a.a) {
                            if (this.b[j].z == 0) {
                                this.b[j].b(this.a.c - this.b[j].p, this.b[j].o);
                                this.b[j].l = this.a.g;
                                this.b[j].z = 1;
                                bl = false;
                                continue;
                            }
                            if (this.b[j].z != 1) continue;
                            this.a.b(this.b[j]);
                            this.b[j].z = 2;
                            continue;
                        }
                        bl = false;
                        continue;
                    }
                    if (this.g != 1) continue;
                    if (this.b[j].n + this.b[j].p < 0) {
                        if (this.b[j].z == 0) {
                            this.b[j].b(this.a.c, this.b[j].o);
                            this.b[j].l = this.a.g;
                            this.b[j].z = 1;
                            bl = false;
                            continue;
                        }
                        if (this.b[j].z != 1) continue;
                        this.a.b(this.b[j]);
                        this.b[j].z = 2;
                        continue;
                    }
                    bl = false;
                }
                if (!bl) break;
                this.l = 0;
                this.a = 4;
                this.b = this.a.c;
                return;
            }
            case 4: {
                if (this.l == 0) {
                    if (this.a.c - this.b < (long)this.m) break;
                    this.a.f();
                    if (this.a != 1) {
                        this.a.d(200);
                    }
                    e.b(14, 1);
                    if (this.c != null) {
                        this.n = c.a[this.a].length;
                    }
                    this.l = 1;
                    return;
                }
                if (this.l != 1) break;
                if (--this.n >= 0) {
                    h h9 = this.a == 3 || this.a == 2 || this.a == 1 ? h.a(this.c, 0, 0, 0, 1, 0, (byte)0) : h.a(this.c, 0, 0, 0, -1, 0, (byte)0);
                    if (this.a == 2 || this.a == 1) {
                        h9.e = false;
                    }
                    int n = e.a(this.a.a / 2 - h9.p);
                    int n3 = 0;
                    if (this.a.a != null) {
                        n3 = 0 + (this.a.a.b - h9.q);
                    }
                    int n4 = (this.a.aH - n3) * (this.n * 2 + 1) / (c.a[this.a].length * 2) - h9.q / 2 + n3;
                    if (this.g == 0) {
                        n += this.a.c;
                    }
                    if (this.a == 7 || this.a == 6) {
                        h9.r = n4;
                        n4 = 0;
                    }
                    h9.b(n, n4);
                    this.a.a(h9);
                    for (int j = 0; j < 3; ++j) {
                        h h10;
                        if (this.a == 7 || this.a == 6) {
                            h10 = h.a(this.a.g, e.a(-1, 2), 0, e.a(-2, 0), 1, e.a(4) * 50, (byte)0);
                            h10.b(n + e.a(h9.p - h10.p), h9.r + h9.q - h10.q + 1);
                            h10.r = -h9.q / 2;
                        } else {
                            h10 = h.a(this.a.r, e.a(-1, 2), 0, -1, 1, 100, (byte)0);
                            h10.b(n + e.a(h9.p - h10.p), n4 + h9.q - h10.q + 1);
                        }
                        this.a.a(h10);
                    }
                    break;
                }
                this.a = 7;
                this.b = this.a.c;
                return;
            }
            case 7: {
                if (this.a.c - this.b < 1000L) break;
                this.a = 0;
                this.b = true;
            }
        }
    }

    public final void c() {
        for (int j = 0; j < this.f; ++j) {
            this.a[j].y = 6;
        }
    }

    public final void d() {
        int n;
        switch (this.a) {
            case 1: {
                h h2;
                if (this.l == 0) {
                    if (this.a.c - this.b < 200L) break;
                    this.l = 1;
                    this.b = this.a.c;
                    break;
                }
                if (this.l == 1) {
                    this.k += 5;
                    if (this.k >= 90) {
                        ++this.l;
                        this.b = this.a.c;
                    }
                    if ((this.k - 20) % 15 == 0) {
                        for (n = 0; n < this.a.length; ++n) {
                            h2 = h.a(this.a.r, e.a(-1, 2), 0, 0, 1, 100, (byte)0);
                            h2.b(this.a[n].n + e.a(this.a.p - h2.p), this.a[n].o + this.a.q - h2.q + 1);
                            this.a.a(h2);
                        }
                    }
                } else if (this.l == 2 && this.a.c - this.b >= 400L) {
                    this.k = 20;
                    this.a.f();
                    this.a = 4;
                    this.a.e = false;
                    this.b = this.a.c;
                }
                if (++this.j < 2) break;
                for (n = 0; n < this.a.a.length; ++n) {
                    h2 = h.a(this.a.i, 0, 0, 0, 1, 50, (byte)0);
                    h2.b(this.a.a[n].n + e.a(this.a.a[n].p - h2.p), this.a.a[n].o + e.a(this.a.a[n].q - h2.q));
                    h2.f = true;
                    this.a.a(h2);
                }
                this.j = 0;
                this.a.c();
                break;
            }
            case 4: {
                if (this.a.c - this.b < 800L) break;
                this.b = true;
                this.a = 0;
            }
        }
        n = 0;
        if (this.a.c - this.a >= 300L) {
            n = 1;
            this.a = this.a.c;
        }
        for (int j = 0; j < this.a.length; ++j) {
            if (n != 0) {
                h h3 = h.a(null, 0, 0, 0, 1, 500, (byte)4);
                h3.b(this.a[j].n + (this.a[j].p >> 1), this.a[j].o + (this.a[j].q >> 1) + this.c);
                this.a.a(h3);
            }
            int n2 = this.a[j].p / 3;
            this.a[j].b(this.a[j][0] + (n2 * a.b(this.a[j]) >> 10), this.a[j][1] + (n2 * a.a(this.a[j]) / 3 >> 10));
            this.a[j] = (this.a[j] + this.k) % 360;
        }
    }

    public final void e() {
        int n;
        if (this.e) {
            if (this.a.c - this.c >= 300L) {
                this.e = false;
                this.b = 0;
                this.c = 0;
            } else {
                this.b = this.b > 0 ? -2 : 2;
                this.c = e.a.nextInt() % 1;
            }
        }
        if (this.c && this.h > this.c) {
            this.h -= 2;
            if (this.h < this.c) {
                this.h = this.c;
            }
            this.a.F = true;
        }
        if (this.a == 8 || this.a == 9 || this.a == 7 || this.a == 1 || this.a == 3 || this.a == 2 || this.a == 6) {
            this.b();
        } else if (this.a == 4) {
            this.d();
        } else {
            n = 0;
            switch (this.a) {
                case 1: {
                    if (this.a.c - this.b < 200L) break;
                    this.a = 3;
                    break;
                }
                case 3: {
                    h h2;
                    int n2;
                    boolean bl = true;
                    if (this.l < this.f) {
                        if (this.a == 0 || this.a == 5) {
                            this.a[this.l].x = -6;
                        }
                        if (this.a == 5) {
                            this.a[this.l].v = 2 * c[this.g];
                            for (n2 = 0; n2 < 3; ++n2) {
                                h2 = h.a(this.a.r, e.a(-1, 2), 0, -1, 1, 100, (byte)0);
                                h2.b(this.a[this.l].n + e.a(this.a.p - h2.p), this.a[this.l].o + this.a.q - h2.q + 1);
                                this.a.a(h2);
                            }
                        } else {
                            this.a[this.l].v = c[this.g];
                        }
                        this.a[this.l].a(1, this.d);
                        ++this.l;
                        bl = false;
                    }
                    for (n2 = 0; n2 < this.l; ++n2) {
                        if (this.a == 10) {
                            if (this.a[n2].z == -1) continue;
                            ++this.a[n2].z;
                            if (this.a[n2].z >= 16) {
                                this.a[n2].a(2, this.d);
                                this.a[n2].v = 0;
                                this.a[n2].z = -1;
                                h2 = h.a(null, 0, 0, 0, 1, 800, (byte)2);
                                h2.b(this.a[n2].n + this.a(h2, this.a.p), this.a[n2].o + this.a.q);
                                this.a.a(h2);
                                h2 = h.a(this.d, 0, 0, 0, 1, 150, (byte)0);
                                h2.b(this.a[n2].n + this.a(h2, 24), this.a[n2].o + 3);
                                this.a.a(h2);
                                continue;
                            }
                            bl = false;
                            continue;
                        }
                        if (this.a[n2].r < 0) {
                            ++this.a[n2].x;
                            bl = false;
                            continue;
                        }
                        if (this.a[n2].x < 6) continue;
                        this.a[n2].r = 0;
                        this.a[n2].x = 0;
                        this.a[n2].v = 0;
                        if (this.a != 0 && this.a != 5) continue;
                        this.a[n2].a(2, this.d);
                        if (this.a == 0) {
                            h2 = h.a(this.d, 0, 0, 0, 1, 150, (byte)0);
                            h2.b(this.a[n2].n + this.a(h2, 14), this.a[n2].o + this.a[n2].q);
                            h2.r = 4 - this.a[n2].q;
                            this.a.a(h2);
                            continue;
                        }
                        if (this.a != 5) continue;
                        h2 = h.a(this.a.i, 0, 0, 0, 1, 50, (byte)0);
                        h2.b(this.a[n2].n + this.a(h2, this.a.p * 3 / 4), this.a[n2].o + this.a[n2].q);
                        h2.r = -h2.q;
                        this.a.a(h2);
                    }
                    if (!bl) break;
                    this.l = 0;
                    this.a = 6;
                    this.a.f();
                    this.a.d(200);
                    e.b(14, 1);
                    this.b = this.a.c;
                    break;
                }
                case 6: {
                    if ((this.a != 10 || this.a.c - this.b < 400L) && (this.a != 0 && this.a != 2 && this.a != 5 || this.a.c - this.b < 50L)) break;
                    this.a = 4;
                    break;
                }
                case 4: {
                    int n2;
                    boolean bl = true;
                    if (this.l < this.f) {
                        if (this.a == 0 || this.a == 2 || this.a == 5) {
                            this.a[this.l].x = -6;
                        } else if (this.a == 10) {
                            this.a[this.l].z = 0;
                        }
                        this.a[this.l].v = this.a == 5 ? -2 * c[this.g] : -c[this.g];
                        this.a[this.l].a(3, this.d);
                        ++this.l;
                        bl = false;
                    }
                    for (n2 = 0; n2 < this.l; ++n2) {
                        if (this.a == 10) {
                            if (this.a[n2].z == -1) continue;
                            ++this.a[n2].z;
                            if (this.a[n2].z >= 16) {
                                this.a[n2].a(0, this.d);
                                this.a[n2].v = 0;
                                this.a[n2].z = -1;
                                continue;
                            }
                            bl = false;
                            continue;
                        }
                        if (this.a[n2].r < 0) {
                            ++this.a[n2].x;
                            bl = false;
                            continue;
                        }
                        if (this.a[n2].x < 6) continue;
                        this.a[n2].x = 0;
                        this.a[n2].v = 0;
                        this.a[n2].r = 0;
                        this.a[n2].a(0, this.d);
                    }
                    if (!bl) break;
                    this.b = true;
                    this.a = 0;
                    this.b = this.a.c;
                }
            }
        }
        if (this.a == 6) {
            for (n = 0; n < this.a.length; ++n) {
                if (!this.a[n].g) continue;
                this.a[n].r = -6 + 4 * a.a(this.a[n]) >> 10;
                this.a[n] = (this.a[n] + 10) % 360;
            }
        }
    }

    public final void f() {
        int n;
        int n2;
        h h2;
        this.c = true;
        this.i = this.d - this.e;
        this.f = this.e;
        for (int j = 0; j < this.i; ++j) {
            h h3;
            this.a.b(this.a[j]);
            h2 = h.a(this.a.i, 0, 0, 0, 1, 0, (byte)0);
            h2.b(this.a[j].n + (this.a[j].p - h2.p) / 2, this.a.X);
            h2.r = this.a[j].o + (this.a[j].q - h2.q) / 2 - this.a.X;
            this.a.a(h2);
            for (n2 = 0; n2 < 3; ++n2) {
                h3 = h.a(this.a.r, -1 + n2, 0, e.a(-4, -1), 1, e.a(4) * 50, (byte)0);
                h3.b(this.a[j].n + (this.a[j].p - h3.p) / 2, this.a[j].o + this.a[j].q - h3.q + 3);
                this.a.a(h3);
            }
            h3 = h.a(this.a.g, 0, 0, -1, 1, 200, (byte)0);
            h3.b(this.a[j].n + (this.a[j].p - h3.p) / 2, this.a[j].o + this.a[j].q - h3.q + 3);
            this.a.a(h3);
        }
        h[] hArray = new h[this.f];
        System.arraycopy(this.a, this.i, hArray, 0, this.f);
        this.a = hArray;
        h2 = h.a("" + (this.c - this.b), 0, -4, (byte)1);
        if (this.e == 1) {
            n = this.a[0].n + this.a[0].p / 2;
            n2 = this.a[0].o + this.a[0].q + 1;
        } else {
            n = this.a.c / 2;
            if (this.g == 1) {
                n += this.a.c;
            }
            n2 = (this.a.aH + this.e) / 2;
        }
        h2.b(n, n2);
        h2.f = true;
        this.a.a(h2);
    }

    public final void a(Graphics graphics, int n, int n2) {
        int n3;
        int n4;
        graphics.translate(n, n2);
        int n5 = 0;
        int n6 = this.f;
        for (n4 = 0; n4 < n6; ++n4) {
            int n7 = this.e + n2;
            int n8 = this.g;
            for (n3 = 0; n3 < n8; ++n3) {
                this.a[this.a[n4][n3]].a(graphics, n5, n7);
                n7 += 24;
            }
            n5 += 24;
        }
        if (this.a != null) {
            n4 = this.a.a;
            n5 = 0;
            n3 = this.a.c / n4;
            for (n6 = 0; n6 < n3; ++n6) {
                this.a.a(graphics, n5, 0);
                n5 += n4;
            }
        }
        graphics.translate(-n, -n2);
    }

    public final void a(Graphics graphics) {
        int n = this.a.X - i.a / 2;
        e.a(graphics, this.h + "/" + 100, this.a.c / 2, n, 1, 3);
    }

    public final void b(Graphics graphics) {
        graphics.setColor(0x404040);
        for (int j = 0; j < this.f; ++j) {
            h h2 = this.a[j];
            if (this.a != 0 && this.a != 4 && this.a != 5 && this.a != 6) continue;
            graphics.fillArc(h2.n, h2.o + h2.q * 4 / 5, h2.p, h2.q / 4, 0, 360);
        }
    }

    static {
        byte[] byArray = new byte[]{18, -18};
        c = new byte[]{3, -3};
    }
}

