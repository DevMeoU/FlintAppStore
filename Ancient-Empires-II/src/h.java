/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.io.InputStream;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class h {
    public f[] a;
    private byte[] f;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public boolean c;
    public int p;
    public int q;
    public byte[][] c = true;
    public int r;
    public byte k = 0;
    public int s = -1;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public boolean d = true;
    public boolean e;
    public boolean f;
    public int y = -1;
    public byte l = (byte)-1;
    public boolean g;
    public int z;
    public String b;
    public int A;
    public h a;
    public h b;
    public int[][] a;
    public short[][] a;
    public int B = 0xFFE000;
    public byte[] e;
    public boolean[] a;

    public h(String string) throws Exception {
        this.a(string, 1);
    }

    public h(f[] fArray) {
        this.a = fArray;
        this.f = new byte[this.a.length];
        for (int n = 0; n < this.a.length; n = (int)((byte)(n + 1))) {
            this.f[n] = n;
        }
        this.p = this.a[0].a;
        this.q = this.a[0].b;
    }

    public h(String string, byte by) throws Exception {
        this.a(string, by);
    }

    private final void a(String string, int n) throws Exception {
        int n2;
        int n3;
        byte by;
        int n4;
        int n5;
        InputStream inputStream = e.a(string + ".sprite");
        int n6 = inputStream.read();
        this.p = (byte)inputStream.read();
        this.q = (byte)inputStream.read();
        this.a = new f[n6];
        f[] fArray = new f[n6];
        try {
            f f2 = new f(string, n);
            n5 = f2.a / this.p;
            n4 = f2.b / this.q;
            by = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                for (int j = 0; j < n5; ++j) {
                    fArray[by] = new f(f2, j, n3, this.p, this.q);
                    by = (byte)(by + 1);
                }
            }
        }
        catch (Exception exception) {
            try {
                for (n5 = 0; n5 < n6; ++n5) {
                    StringBuffer stringBuffer = new StringBuffer(string);
                    stringBuffer.append('_');
                    if (n5 < 10) {
                        stringBuffer.append('0');
                    }
                    stringBuffer.append(n5);
                    fArray[n5] = n == 1 ? new f(stringBuffer.toString()) : new f(stringBuffer.toString(), n);
                }
            }
            catch (Exception exception2) {}
        }
        for (n2 = 0; n2 < n6; ++n2) {
            n5 = inputStream.read();
            n4 = inputStream.read();
            this.a[n2] = new f(fArray[n5], n4);
        }
        n2 = inputStream.read();
        if (n2 > 0) {
            for (n5 = 0; n5 < n6; ++n5) {
                this.a[n5].a(n2, this.p, this.q);
            }
        }
        if ((n5 = inputStream.read()) > 0) {
            this.c = new byte[n5][];
            this.u = inputStream.read() * 50;
            for (n4 = 0; n4 < n5; ++n4) {
                by = (byte)inputStream.read();
                this.c[n4] = new byte[by];
                for (n3 = 0; n3 < by; ++n3) {
                    this.c[n4][n3] = (byte)inputStream.read();
                }
            }
        }
        for (n4 = 0; n4 < n6; ++n4) {
            by = (byte)inputStream.read();
            n3 = (byte)inputStream.read();
            if (by == -1 || n3 == -1) break;
            this.a[n4].a(by, n3);
        }
        inputStream.close();
        if (this.c != null) {
            this.f = this.c[0];
            return;
        }
        this.f = new byte[n6];
        for (n4 = 0; n4 < n6; n4 = (int)((byte)(n4 + 1))) {
            this.f[n4] = n4;
        }
    }

    public h(h h2) {
        this.a = h2.a;
        this.f = h2.f;
        this.m = h2.m;
        this.n = h2.n;
        this.o = h2.o;
        this.r = h2.r;
        this.c = h2.c;
        this.p = h2.p;
        this.q = h2.q;
        this.u = h2.u;
        this.c = h2.c;
    }

    public h(int n, int n2) {
        this.p = n;
        this.q = n2;
    }

    public final int d() {
        return this.f.length;
    }

    public final int e() {
        return this.a.length;
    }

    public final void c(int n) {
        if (n < this.f.length) {
            this.m = (byte)n;
        }
    }

    public final void b(int n, int n2) {
        this.n = (short)n;
        this.o = (short)n2;
    }

    public final void e() {
        ++this.m;
        if (this.m >= this.f.length) {
            this.m = 0;
        }
    }

    public final void a(byte[] byArray) {
        this.f = byArray;
        this.m = 0;
        this.t = 0;
    }

    public final void a(int n, boolean bl) {
        if (this.c != null && n <= this.c.length) {
            byte[] byArray = this.c[n];
            if (bl) {
                byte[] byArray2 = new byte[byArray.length];
                for (int j = 0; j < byArray2.length; ++j) {
                    byArray2[j] = (byte)(byArray[j] + this.e() / 2);
                }
                byArray = byArray2;
            }
            this.a(byArray);
        }
    }

    public final void a(Graphics graphics, int n, int n2, int n3, int n4) {
        if (this.k == 2 || this.k == 4 || this.k == 3) {
            this.a(graphics, n2, n3);
            return;
        }
        if (this.c) {
            int n5 = this.n + n2;
            int n6 = this.o + n3;
            this.a[n].a(graphics, n5, n6, n4);
        }
    }

    public final void a(Graphics graphics, int n, int n2, int n3) {
        this.a(graphics, this.f[this.m], n, n2, n3);
    }

    public void a(Graphics graphics, int n, int n2) {
        if (this.k == 2 || this.k == 4) {
            graphics.setColor(this.B);
            for (int j = 0; j < 5; ++j) {
                if (!this.a[j]) continue;
                int n3 = (this.a[j][0] >> 10) + n + this.n;
                int n4 = (this.a[j][1] >> 10) + n2 + this.o;
                graphics.fillRect(n3, n4, (int)this.e[j], (int)this.e[j]);
            }
        } else {
            if (this.k == 6) {
                boolean bl = false;
                if (this.m == 0) {
                    graphics.setColor(15718144);
                } else {
                    graphics.setColor(0xFFFFFF);
                }
                if (this.v > 0) {
                    int n5 = this.n + 15;
                    graphics.fillArc(this.n, this.o - 15, 30, 30, 0, 360);
                    graphics.fillRect(n5, this.o - 15, e.e - n5, 30);
                    return;
                }
                graphics.fillArc(this.n - 30, this.o - 15, 30, 30, 0, 360);
                graphics.fillRect(0, this.o - 15, this.n - 15, 30);
                return;
            }
            if (this.k == 3) {
                graphics.setColor(0);
                if (this.v > 0) {
                    graphics.drawLine(this.n, this.o, this.n + 4, this.o - 2);
                    return;
                }
                graphics.drawLine(this.n - 4, this.o - 2, this.n, this.o);
                return;
            }
            if (this.c) {
                int n6 = this.n + n;
                int n7 = this.o + n2;
                if (this.b != null) {
                    e.a(graphics, this.b, n6, n7, this.A, 33);
                    return;
                }
                if (this.y > 0) {
                    n6 += e.a(-4, 5);
                    n7 += e.a(-1, 2);
                }
                byte by = this.f[this.m];
                this.a[by].a(graphics, n6, n7);
                if (this.a != null) {
                    h h2;
                    int n8 = by % (this.e() / 2);
                    if (n8 == 2) {
                        h2 = this.b;
                    } else {
                        h2 = this.a;
                        h2.c(n8);
                    }
                    h2.a(graphics, n6, n7);
                }
            }
        }
    }

    public static final h a(String string, int n, int n2, byte by) {
        int n3 = e.a(by, string);
        int n4 = e.a(by);
        h h2 = new h(n3, n4);
        new h(n3, n4).A = by;
        h2.b = string;
        h2.v = n;
        h2.x = n2;
        h2.k = (byte)5;
        return h2;
    }

    public static final h a(h h2, int n, int n2, int n3, int n4, int n5, byte by) {
        h h3 = null;
        if (h2 != null) {
            h3 = new h(h2);
        } else {
            h3 = new h(0, 0);
            if (by == 2 || by == 4) {
                if (by == 4) {
                    h3.B = 0xEEEEFF;
                }
                h3.a = new int[5][2];
                h3.a = new short[5][2];
                h3.e = new byte[5];
                h3.a = new boolean[5];
                boolean bl = false;
                boolean bl2 = false;
                for (int j = 0; j < 5; ++j) {
                    h3.a[j] = true;
                    if (by == 4) {
                        h3.a[j][0] = (short)(e.a.nextInt() % 4 << 10);
                        h3.a[j][1] = (short)(e.a.nextInt() % 4 << 10);
                    } else {
                        h3.a[j][0] = (short)(Math.abs(e.a.nextInt()) % 8192 + -4096);
                        h3.a[j][1] = (short)(Math.abs(e.a.nextInt()) % 4096 + -2048);
                    }
                    h3.e[j] = (byte)(Math.abs(e.a.nextInt()) % 2 + 1);
                }
            }
        }
        h3.k = by;
        h3.s = n4;
        h3.u = n5;
        h3.v = n;
        h3.w = n2;
        h3.x = n3;
        h3.e = true;
        return h3;
    }

    public void c() {
        if (this.d) {
            this.t += 50;
            if (this.y >= 0) {
                --this.y;
            }
            switch (this.k) {
                case 2: 
                case 4: {
                    this.f();
                    return;
                }
                case 3: {
                    this.b(this.n + this.v, this.o + this.w);
                    return;
                }
                case 6: {
                    this.m = (this.m + 1) % 2;
                    if (this.t < this.u) break;
                    this.d = false;
                    return;
                }
                case 5: {
                    if (this.s == -1) {
                        this.b(this.n + this.v, this.o);
                        this.r += this.x;
                        if (this.r >= 0) {
                            this.r = 0;
                            this.x = -this.x / 2;
                            if (this.x != 0) break;
                            this.s = 1;
                            this.t = 0;
                            return;
                        }
                        ++this.x;
                        return;
                    }
                    if (this.t < 400) break;
                    this.d = false;
                    return;
                }
                default: {
                    this.b(this.n + this.v, this.o + this.w);
                    this.r += this.x;
                    if (this.s == 0 || this.t < this.u) break;
                    this.e();
                    if (this.k == 0 && this.m == 0 && this.s > 0) {
                        --this.s;
                        if (this.s <= 0) {
                            this.c(this.d() - 1);
                            if (this.e) {
                                this.d = false;
                            }
                        }
                    }
                    this.t = 0;
                }
            }
        }
    }

    public final void f() {
        if (this.k != 4) {
            this.B += -263168;
        }
        for (int j = 0; j < 5; ++j) {
            if (!this.a[j]) continue;
            if (this.k == 4) {
                int[] nArray = this.a[j];
                nArray[0] = nArray[0] + this.a[j][0];
                int[] nArray2 = this.a[j];
                nArray2[1] = nArray2[1] + this.a[j][1];
                if (this.a[j][0] < 0) {
                    short[] sArray = this.a[j];
                    sArray[0] = (short)(sArray[0] + 256);
                } else if (this.a[j][0] > 0) {
                    short[] sArray = this.a[j];
                    sArray[0] = (short)(sArray[0] - 256);
                }
                if (this.a[j][1] < 0) {
                    short[] sArray = this.a[j];
                    sArray[1] = (short)(sArray[1] + 256);
                    continue;
                }
                if (this.a[j][1] <= 0) continue;
                short[] sArray = this.a[j];
                sArray[1] = (short)(sArray[1] - 256);
                continue;
            }
            int[] nArray = this.a[j];
            nArray[0] = nArray[0] + this.a[j][0];
            int[] nArray3 = this.a[j];
            nArray3[1] = nArray3[1] + this.a[j][1];
            short[] sArray = this.a[j];
            sArray[1] = (short)(sArray[1] + 256);
        }
        if (this.t >= this.u) {
            this.d = false;
        }
    }
}

