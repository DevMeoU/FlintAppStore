/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class c
extends h {
    public static byte a = (byte)12;
    public static byte b;
    public static byte c;
    public static i a;
    public String a;
    public short a;
    public int a;
    public byte[][] a;
    public Vector a;
    public short b;
    public long a;
    public byte d;
    public byte e;
    public short c;
    public short d;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public byte f;
    public byte g;
    public short e;
    public short f;
    public short g;
    public boolean a;
    public boolean b;
    public int h;
    public long b = true;
    public byte h;
    public byte i;
    public int i;
    public c a;
    public byte j;
    public int j = 0;
    public int k;
    public int l;
    public static byte[] a;
    public static byte[][] b;
    public static byte[] b;
    public static byte[] c;
    public static byte[] d;
    public static byte[][][] a;
    public static short[] a;
    public static final short[] b;

    private c(byte by, byte by2, int n, int n2, boolean bl) {
        super(a.a(by2, by));
        this.d = by;
        this.f = 0;
        this.c = (short)n;
        this.d = (short)n2;
        this.b(n * 24, n2 * 24);
        this.a((byte)0);
        if (bl) {
            c.a.a.addElement(this);
        }
    }

    public final void a(byte by) {
        this.a = by;
        int n = by * 2;
        this.d = b[this.d][0] + n;
        this.e = b[this.d][1] + n;
        this.f = b[this.d] + n;
        if (this.d != 9) {
            int n2 = this.a / 2;
            if (n2 > 3) {
                n2 = 3;
            }
            this.a = a.a(139 + this.d * 4 + n2);
        }
    }

    public final void a(int n) {
        this.a = true;
        this.b = c.a.c;
        this.h = n;
    }

    public static final c a(byte by, byte by2, int n, int n2) {
        return c.a(by, by2, n, n2, true);
    }

    public static final c a(byte by, byte by2, int n, int n2, boolean bl) {
        c c2 = new c(by, c.a.j[by2], n, n2, bl);
        new c(by, c.a.j[by2], n, n2, bl).d = by;
        c2.e = by2;
        c2.g = 100;
        c2.a = a[by];
        c2.k = a[by];
        if (by == 9) {
            c2.b(c.a.j[by2] - 1);
            c2.j = c.a.e[by2];
            c.a.a[by2][c2.j] = c2;
            byte by3 = by2;
            c.a.e[by3] = c.a.e[by3] + 1;
        }
        return c2;
    }

    public final void a() {
        c.a.a.removeElement(this);
    }

    public final void b(int n) {
        this.j = (byte)n;
        this.a = a.a(n + 93);
    }

    public final int a(c c2) {
        return this.a(c2, (int)this.c, (int)this.d);
    }

    public final int a(c c2, int n, int n2) {
        int n3 = this.f;
        if (c2 != null) {
            if (this.a((short)64) && c2.a((short)1)) {
                n3 += 15;
            }
            if (this.d == 4 && c2.d == 10) {
                n3 += 15;
            }
        }
        if (this.a((short)2) && a.a(n, n2) == 5) {
            n3 += 10;
        }
        if (c.a.b[n][n2] == 34) {
            n3 += 25;
        }
        return n3;
    }

    public final int b(c c2) {
        return this.b(c2, (int)this.c, (int)this.d);
    }

    public final int b(c c2, int n, int n2) {
        byte by = a.a(n, n2);
        int n3 = this.g + i.f[by];
        if (this.a((short)2) && by == 5) {
            n3 += 15;
        }
        if (c.a.b[n][n2] == 34) {
            n3 += 15;
        }
        return n3;
    }

    public final int c(c c2) {
        int n;
        int n2 = e.a(this.d, this.e) + this.a(c2);
        int n3 = (n2 - (n = c2.f + c2.b(this))) * this.g / 100;
        if (n3 < 0) {
            n3 = 0;
        } else if (n3 > c2.g) {
            n3 = c2.g;
        }
        c2.g -= n3;
        this.a += c2.a() * n3;
        return n3;
    }

    public final int a() {
        return this.d + this.e + this.f;
    }

    public final int b() {
        return this.a() * 100 * 2 / 3;
    }

    public final boolean a() {
        int n;
        if (this.a < 9 && this.a >= (n = this.b())) {
            this.a -= n;
            this.a((byte)(this.a + 1));
            return true;
        }
        return false;
    }

    public final boolean a(c c2, int n, int n2) {
        return this.f != 4 && this.g > 0 && Math.abs(this.c - n) + Math.abs(this.d - n2) == 1 && d[this.d] == 1;
    }

    public final void b(byte by) {
        this.g = (byte)(this.g | by);
        this.b();
        if (by == 1) {
            this.i = c.a.f;
        }
    }

    public final void c(byte by) {
        this.g = (byte)(this.g & ~by);
        this.b();
    }

    public final void b() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        if ((this.g & 1) != 0) {
            this.f = (short)(this.f - 10);
            this.g = (short)(this.g - 10);
        }
        if ((this.g & 2) != 0) {
            this.f = (short)(this.f + 10);
        }
    }

    public final void a(int n, int n2) {
        this.c = (short)n;
        this.d = (short)n2;
        this.n = (short)(n * 24);
        this.o = (short)(n2 * 24);
    }

    public final int c() {
        int n = 100 / this.a.length;
        int n2 = this.g / n;
        if (this.g != 100 && this.g % n > 0) {
            ++n2;
        }
        return n2;
    }

    public final int a(int n, int n2, c c2) {
        return (this.d + this.e + this.f + this.a(c2, n, n2) + this.b(c2, n, n2)) * this.g / 100;
    }

    public final void a(byte[][] byArray, int n, int n2) {
        int n3;
        int n4;
        int n5;
        byte by = d[this.d];
        byte by2 = c[this.d];
        int n6 = n - by2;
        if (n6 < 0) {
            n6 = 0;
        }
        if ((n5 = n2 - by2) < 0) {
            n5 = 0;
        }
        if ((n4 = n + by2) >= c.a.o) {
            n4 = c.a.o - 1;
        }
        if ((n3 = n2 + by2) >= c.a.p) {
            n3 = c.a.p - 1;
        }
        for (int j = n6; j <= n4; ++j) {
            for (int k = n5; k <= n3; ++k) {
                int n7 = Math.abs(j - n) + Math.abs(k - n2);
                if (n7 < by || n7 > by2 || byArray[j][k] > 0) continue;
                byArray[j][k] = 127;
            }
        }
    }

    public final void a(byte[][] byArray) {
        if (this.a((short)512)) {
            this.a(byArray, (int)this.c, (int)this.d);
            return;
        }
        this.b(byArray);
        for (int j = 0; j < c.a.o; ++j) {
            for (int k = 0; k < c.a.p; ++k) {
                if (byArray[j][k] <= 0 || byArray[j][k] == 127) continue;
                this.a(byArray, j, k);
            }
        }
    }

    public final c[] a(int n, int n2, byte by) {
        return this.a(n, n2, (int)d[this.d], (int)c[this.d], by);
    }

    public final c[] a(int n, int n2, int n3, int n4, byte by) {
        int n5;
        int n6;
        int n7;
        Vector<c> vector = new Vector<c>();
        int n8 = n - n4;
        if (n8 < 0) {
            n8 = 0;
        }
        if ((n7 = n2 - n4) < 0) {
            n7 = 0;
        }
        if ((n6 = n + n4) >= c.a.o) {
            n6 = c.a.o - 1;
        }
        if ((n5 = n2 + n4) >= c.a.p) {
            n5 = c.a.p - 1;
        }
        for (int j = n8; j <= n6; ++j) {
            for (int k = n7; k <= n5; ++k) {
                c c2;
                int n9 = Math.abs(j - n) + Math.abs(k - n2);
                if (n9 < n3 || n9 > n4) continue;
                if (by == 0) {
                    c2 = a.a(j, k, (byte)0);
                    if (c2 != null) {
                        if (c.a.k[c2.e] == c.a.k[this.e]) continue;
                        vector.addElement(c2);
                        continue;
                    }
                    if (this.d != 7 || a.a(j, k) != 8 || c.a.b[j][k] < c.a.j || a.a(j, k, (int)c.a.k[this.e])) continue;
                    c c3 = c.a((byte)0, (byte)0, j, k, false);
                    c.a((byte)0, (byte)0, j, k, false).d = (byte)-1;
                    c3.f = (byte)4;
                    vector.addElement(c3);
                    continue;
                }
                if (by == 1) {
                    c2 = a.a(j, k, (byte)1);
                    if (c2 == null) continue;
                    vector.addElement(c2);
                    continue;
                }
                if (by != 2 || (c2 = a.a(j, k, (byte)0)) == null || c.a.k[c2.e] != c.a.k[this.e]) continue;
                vector.addElement(c2);
            }
        }
        Object[] objectArray = new c[vector.size()];
        vector.copyInto(objectArray);
        return objectArray;
    }

    public final void a(int n, int n2, boolean bl) {
        this.a(n, n2, bl, false);
    }

    public final void a(int n, int n2, boolean bl, boolean bl2) {
        if (bl) {
            this.a = this.a((int)this.c, (int)this.d, n, n2);
        } else {
            int n3;
            short s;
            int n4;
            short s2;
            if (bl2 && a.a(n, n2, (byte)0) != null) {
                boolean bl3 = false;
                for (s2 = n - 1; s2 <= n + 1; ++s2) {
                    for (n4 = n2 - 1; n4 <= n2 + 1; ++n4) {
                        if ((s2 == n && n4 == n2 || s2 != n) && n4 != n2 || a.a((int)s2, n4, (byte)0) != null) continue;
                        n = s2;
                        n2 = n4;
                        bl3 = true;
                        break;
                    }
                    if (bl3) break;
                }
            }
            this.a = new Vector();
            short[] sArray = new short[]{this.c, this.d};
            this.a.addElement(sArray);
            s2 = this.c;
            n4 = Math.abs(n - this.c);
            if (n4 > 0) {
                s = (n - this.c) / n4;
                for (n3 = 0; n3 < n4; ++n3) {
                    s2 = (short)(s2 + s);
                    short[] sArray2 = new short[]{s2, this.d};
                    this.a.addElement(sArray2);
                }
            }
            s = this.d;
            n4 = Math.abs(n2 - this.d);
            if (n4 > 0) {
                n3 = (n2 - this.d) / n4;
                for (int j = 0; j < n4; ++j) {
                    s = (short)(s + n3);
                    short[] sArray3 = new short[]{s2, s};
                    this.a.addElement(sArray3);
                }
            }
        }
        this.b = n;
        this.c = n2;
        this.b = 1;
        this.f = 1;
    }

    public final Vector a(int n, int n2, int n3, int n4) {
        int n5;
        Vector vector = null;
        short[] sArray = new short[]{(short)n3, (short)n4};
        if (n == n3 && n2 == n4) {
            vector = new Vector();
            vector.addElement(sArray);
            return vector;
        }
        byte by = 0;
        byte by2 = 0;
        byte by3 = 0;
        int n6 = 0;
        if (n4 > 0) {
            by = c.a.c[n3][n4 - 1];
        }
        if (n4 < c.a.p - 1) {
            by2 = c.a.c[n3][n4 + 1];
        }
        if (n3 > 0) {
            by3 = c.a.c[n3 - 1][n4];
        }
        if (n3 < c.a.o - 1) {
            n6 = c.a.c[n3 + 1][n4];
        }
        if ((n5 = Math.max(Math.max(by, by2), Math.max(by3, n6))) == by) {
            vector = this.a(n, n2, n3, n4 - 1);
        } else if (n5 == by2) {
            vector = this.a(n, n2, n3, n4 + 1);
        } else if (n5 == by3) {
            vector = this.a(n, n2, n3 - 1, n4);
        } else if (n5 == n6) {
            vector = this.a(n, n2, n3 + 1, n4);
        }
        vector.addElement(sArray);
        return vector;
    }

    public final void b(byte[][] byArray) {
        c.a(byArray, this.c, this.d, a[this.d] + this.e, -1, this.d, this.e, false);
    }

    public static final boolean a(byte[][] byArray, int n, int n2, int n3, int n4, byte by, byte by2, boolean bl) {
        int n5;
        if (n3 > byArray[n][n2]) {
            byArray[n][n2] = (byte)n3;
            if (bl && a.a(n, n2, (byte)0) == null) {
                return true;
            }
        } else {
            return false;
        }
        if (n4 != 1 && (n5 = n3 - c.a(n, n2 - 1, by, by2)) >= 0 && c.a(byArray, n, n2 - 1, n5, 2, by, by2, bl) && bl) {
            return true;
        }
        if (n4 != 2 && (n5 = n3 - c.a(n, n2 + 1, by, by2)) >= 0 && c.a(byArray, n, n2 + 1, n5, 1, by, by2, bl) && bl) {
            return true;
        }
        if (n4 != 4 && (n5 = n3 - c.a(n - 1, n2, by, by2)) >= 0 && c.a(byArray, n - 1, n2, n5, 8, by, by2, bl) && bl) {
            return true;
        }
        return n4 != 8 && (n5 = n3 - c.a(n + 1, n2, by, by2)) >= 0 && c.a(byArray, n + 1, n2, n5, 4, by, by2, bl) && bl;
    }

    public static final int a(int n, int n2, byte by, byte by2) {
        if (n >= 0 && n2 >= 0 && n < c.a.o && n2 < c.a.p) {
            c c2 = a.a(n, n2, (byte)0);
            if (c2 != null && c.a.k[c2.e] != c.a.k[by2]) {
                return 1000;
            }
            byte by3 = a.a(n, n2);
            if (by == 11) {
                if (by3 == 4) {
                    return 1000;
                }
            } else {
                if (c.a(by, (short)1)) {
                    return 1;
                }
                if (c.a(by, (short)2) && by3 == 5) {
                    return 1;
                }
            }
            return i.g[by3];
        }
        return 10000;
    }

    public final void c() {
        if (this.a) {
            if (c.a.c - this.b >= (long)this.h) {
                this.a = false;
            } else {
                boolean bl = this.b = !this.b;
            }
        }
        if (this.f == 1) {
            if (this.b >= this.a.size()) {
                this.f = 0;
                this.c = (short)(this.n / 24);
                this.d = (short)(this.o / 24);
                this.a = null;
                this.b = 0;
            } else {
                if (this.a != null && this.n % 24 == 0 && this.o % 24 == 0) {
                    this.a.a((int)this.c, (int)this.d, false);
                }
                short[] sArray = (short[])this.a.elementAt(this.b);
                int n = sArray[0] * 24;
                int n2 = sArray[1] * 24;
                h h2 = null;
                if (this.a == null && ++this.i >= 24 / c / 2) {
                    h2 = a.a(c.a.r, this.n, this.o, 0, 0, 1, e.a(1, 4) * 50);
                    this.i = 0;
                }
                if (n < this.n) {
                    this.n -= c;
                    if (h2 != null) {
                        h2.b(this.n + this.p, this.o + this.q - h2.q);
                    }
                } else if (n > this.n) {
                    this.n += c;
                    if (h2 != null) {
                        h2.b(this.n - h2.p, this.o + this.q - h2.q);
                    }
                } else if (n2 < this.o) {
                    this.o -= c;
                    if (h2 != null) {
                        h2.b(this.n + (this.p - h2.p) / 2, this.o + this.q);
                    }
                } else if (n2 > this.o) {
                    this.o += c;
                    if (h2 != null) {
                        h2.b(this.n + (this.p - h2.p) / 2, this.o - h2.q);
                    }
                }
                if (this.n == n && this.o == n2) {
                    this.c = sArray[0];
                    this.d = sArray[1];
                    this.b = (short)(this.b + 1);
                }
            }
            super.b(this.n, this.o);
            this.e();
            return;
        }
        if (this.f == 0 && c.a.c - this.a >= 200L) {
            this.e();
            this.a = c.a.c;
        }
    }

    public static final boolean a(byte by, short s) {
        return (b[by] & s) != 0;
    }

    public final boolean a(short s) {
        return c.a(this.d, s);
    }

    public final void d() {
        this.f = (byte)2;
        c c2 = a.a((int)this.c, (int)this.d, (byte)1);
        if (c2 != null) {
            c2.a();
        }
        if (this.a((short)256)) {
            c[] cArray = this.a(this.c, (int)this.d, 1, 2, (byte)2);
            for (int j = 0; j < cArray.length; ++j) {
                cArray[j].b((byte)2);
                a.a(c.a.h, cArray[j].n, cArray[j].o, 0, 0, 1, 50);
            }
        }
        c.a.r = this;
    }

    public static final c[] a(byte by) {
        c[] cArray = new c[c.a.e[by]];
        int n = 0;
        for (int j = 0; j < cArray.length; ++j) {
            if (c.a.a[c.a.f][j] == null || c.a.a[c.a.f][j].f != 3) continue;
            cArray[n++] = c.a.a[c.a.f][j];
        }
        c[] cArray2 = new c[c.a.I + 1 + n];
        for (int n2 = 0; n2 < cArray2.length; n2 = (int)((byte)(n2 + 1))) {
            cArray2[n2] = n2 < n ? cArray[n2] : c.a((byte)(n2 - n), by, 0, 0, false);
        }
        return cArray2;
    }

    public final void a(Graphics graphics, int n, int n2) {
        this.a(graphics, n, n2, false);
    }

    public final void a(Graphics graphics, int n, int n2, boolean bl) {
        if (this.f != 4) {
            int n3;
            int n4;
            if (this.a) {
                n4 = this.b ? -2 : 2;
                n3 = e.a() % 1;
                super.a(graphics, n + n4, n2 + n3);
            } else if (bl || this.f == 2) {
                c.a.a[0][this.d].a(graphics, this.n + n, this.o + n2);
            } else {
                super.a(graphics, n, n2);
            }
            if (this.d == 9) {
                n4 = this.n + n;
                n3 = this.o + n2;
                if (bl || this.f == 2) {
                    c.a.b[1].a(graphics, this.j * 2 + this.m, n4, n3, 0);
                    return;
                }
                c.a.b[0].a(graphics, this.j * 2 + this.m, n4, n3, 0);
            }
        }
    }

    public final void b(Graphics graphics, int n, int n2) {
        int n3 = this.n + n;
        int n4 = this.o + n2;
        if (this.f != 3 && this.g < 100) {
            e.a(graphics, "" + this.g, n3, n4 + this.q - 7, 0);
        }
    }

    public static final void a(i i2) throws Exception {
        a = i2;
        DataInputStream dataInputStream = new DataInputStream(e.a("units.bin"));
        for (int j = 0; j < 12; ++j) {
            int n;
            c.a[j] = dataInputStream.readByte();
            c.b[j][0] = dataInputStream.readByte();
            c.b[j][1] = dataInputStream.readByte();
            c.b[j] = dataInputStream.readByte();
            c.c[j] = dataInputStream.readByte();
            c.d[j] = dataInputStream.readByte();
            c.a[j] = dataInputStream.readShort();
            int n2 = dataInputStream.readByte();
            c.a[j] = new byte[n2][2];
            for (n = 0; n < n2; ++n) {
                c.a[j][n][0] = dataInputStream.readByte();
                c.a[j][n][1] = dataInputStream.readByte();
            }
            n = dataInputStream.readByte();
            for (int k = 0; k < n; ++k) {
                int n3 = j;
                b[n3] = (short)(b[n3] | 1 << dataInputStream.readByte());
            }
        }
        dataInputStream.close();
    }

    static {
        c = b = (byte)6;
        a = new byte[12];
        b = new byte[12][2];
        b = new byte[12];
        c = new byte[12];
        d = new byte[12];
        a = new byte[12][][];
        a = new short[12];
        b = new short[12];
    }
}
