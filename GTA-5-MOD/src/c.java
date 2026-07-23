/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.IOException;

final class c {
    byte a;
    byte b;
    byte c;
    int d;
    protected static int[] e = new int[3];
    protected static int[] f = new int[3];
    protected static int[] g = new int[3];
    protected static int[] h = new int[3];
    short[][] i;
    int[][] j;
    c k;
    int[] l;
    int[][] m;
    int n;
    int o;
    int p;

    c() {
    }

    void a(DataInputStream dataInputStream) throws IOException {
        this.a = (byte)dataInputStream.readInt();
        this.b = (byte)dataInputStream.readInt();
        this.c = (byte)dataInputStream.readInt();
        this.d = dataInputStream.readUnsignedShort();
        switch (this.a) {
            case 0: {
                this.b(dataInputStream);
                break;
            }
            case 1: {
                this.c(dataInputStream);
                break;
            }
            case 2: {
                this.d(dataInputStream);
                break;
            }
            case 3: {
                this.e(dataInputStream);
                break;
            }
            case 4: {
                this.f(dataInputStream);
            }
        }
    }

    void a(b b2, int[] nArray, Object object) {
        b2.c = object;
        h.b(b2.e, b2.b());
        if (null != nArray) {
            switch (this.c) {
                case 0: {
                    h.c(b2.e, nArray, b2.b());
                    break;
                }
                case 1: {
                    h.b(b2.e, nArray);
                }
            }
        }
        this.a(b2, b2.f);
        switch (this.a) {
            case 2: {
                this.b(b2, nArray, object);
            }
        }
    }

    boolean a(b b2, int n) {
        n = Math.min(this.d - b2.b, n);
        switch (this.a) {
            case 1: {
                this.b(b2, n);
                break;
            }
            case 2: {
                return this.c(b2, n);
            }
        }
        b2.b += n;
        return b2.b < this.d;
    }

    void a(b b2, g g2, int n) {
        if (n != this.b) {
            return;
        }
        switch (this.a) {
            case 0: {
                this.a(b2, g2);
                break;
            }
            case 2: {
                this.b(b2, g2);
                break;
            }
            case 3: {
                this.c(b2, g2);
                break;
            }
            case 4: {
                this.d(b2, g2);
            }
        }
    }

    void a(b b2, int[] nArray) {
        int[] nArray2 = h;
        switch (this.c) {
            case 0: {
                h.a(nArray2, b2.e, b2.b());
                break;
            }
            case 1: {
                nArray2 = b2.e;
            }
        }
        h.a(nArray, nArray2, b2.d);
    }

    void b(DataInputStream dataInputStream) throws IOException {
        this.i = h.ae[dataInputStream.readInt()];
    }

    void a(b b2, g g2) {
        if (null == this.i || 0 == this.i.length) {
            return;
        }
        this.a(b2, e);
        if (e[2] < 0) {
            return;
        }
        short[] sArray = this.i[0];
        short s = sArray[Math.max(0, b2.b) * sArray.length / this.d];
        h.a(g2, (int)s, e[0] >> 16, e[1] - e[2] >> 16);
    }

    void c(DataInputStream dataInputStream) throws IOException {
        this.j = new int[dataInputStream.readShort()][];
        for (int i = 0; i < this.j.length; ++i) {
            this.j[i] = new int[5];
            int[] nArray = this.j[i];
            nArray[3] = dataInputStream.readInt();
            nArray[4] = dataInputStream.readUnsignedShort();
            nArray[0] = dataInputStream.readInt();
            nArray[1] = dataInputStream.readInt();
            nArray[2] = dataInputStream.readInt();
        }
    }

    boolean b(b b2, int n) {
        this.a(b2, e);
        for (int i = 0; i < this.j.length; ++i) {
            int[] nArray = b2.g;
            int[] nArray2 = this.j[i];
            h.a(f, e, nArray2);
            int n2 = i;
            nArray[n2] = nArray[n2] - n;
            while (nArray[i] < 0) {
                h.a(nArray2[3], f, b2.c);
                int n3 = i;
                nArray[n3] = nArray[n3] + nArray2[4];
            }
        }
        return true;
    }

    void d(DataInputStream dataInputStream) throws IOException {
        this.k = h.dZ[dataInputStream.readInt()];
        this.m = new int[dataInputStream.readShort()][];
        this.l = new int[4 * this.m.length];
        for (int i = 0; i < this.m.length; ++i) {
            this.l[i * 4 + 0] = dataInputStream.readInt();
            this.l[i * 4 + 1] = dataInputStream.readInt();
            this.l[i * 4 + 2] = dataInputStream.readInt();
            this.l[i * 4 + 3] = dataInputStream.readInt();
            this.m[i] = new int[2 * dataInputStream.readShort()];
            for (int j = 0; j < this.m[i].length; ++j) {
                this.m[i][j] = dataInputStream.readInt();
            }
        }
    }

    void b(b b2, int[] nArray, Object object) {
        for (int i = 0; i < this.m.length; ++i) {
            int[] nArray2 = this.m[i];
            int[] nArray3 = b2.h[i];
            for (int j = 0; j < nArray2.length; j += 2) {
                int n = nArray2[j + 1];
                nArray3[j / 2] = nArray2[j + 0] + h.a(n * 2) - n;
            }
            switch (this.l[i * 4 + 0]) {
                case 2: {
                    nArray3[3] = -h.a(nArray3[2], nArray3[0], nArray3[1]);
                }
            }
        }
    }

    boolean c(b b2, int n) {
        int n2 = b2.b + n;
        for (int i = 0; i < this.m.length; ++i) {
            int n3 = i * 4;
            this.a(b2, this.l[n3 + 1] + n2, this.l[n3 + 0], this.l[n3 + 2], this.l[n3 + 3], b2.h[i]);
        }
        b2.b %= this.k.d;
        this.k.a(b2, n);
        b2.b = n2;
        return b2.b < this.d;
    }

    void b(b b2, g g2) {
        int n = b2.b;
        byte by = this.k.c;
        b2.b %= this.k.d;
        this.k.c = this.c;
        this.k.a(b2, g2, this.k.b);
        this.k.c = by;
        b2.b = n;
    }

    void a(b b2, int n, int n2, int n3, int n4, int[] nArray) {
        int n5 = 0;
        int n6 = 0;
        switch (n2) {
            case 0: {
                n5 = (nArray[0] * n >> 10) + nArray[1];
                break;
            }
            case 1: {
                h.i(nArray[0], nArray[1] * n >> 10);
                n5 = h.I;
                n6 = h.J;
                break;
            }
            case 2: {
                n5 = h.a(nArray[2] + (65536 * n >> 10), nArray[0], nArray[1]) + nArray[3];
                break;
            }
            case 3: {
                n5 = h.c(h.c(nArray[1], Math.abs(h.g(nArray[0] * n >> 10))), h.f(nArray[2] * n >> 10));
            }
        }
        b2.a(n3, n5);
        b2.a(n4, n6);
    }

    void e(DataInputStream dataInputStream) throws IOException {
        this.n = dataInputStream.readInt();
        this.o = dataInputStream.readUnsignedByte();
    }

    void c(b b2, g g2) {
        this.a(b2, e);
        if (e[2] < 0) {
            return;
        }
        g2.a(this.n);
        g2.d((e[0] >> 16) - this.o / 2, (e[1] - e[2] >> 16) - this.o / 2, this.o, this.o);
    }

    void f(DataInputStream dataInputStream) throws IOException {
        this.n = dataInputStream.readInt();
        this.p = dataInputStream.readInt();
    }

    void d(b b2, g g2) {
        this.a(b2, e);
        if (e[2] < 0) {
            return;
        }
        int n = h.c(e[0] - b2.f[0], e[1] - b2.f[1], e[2] - b2.f[2]);
        h.b(f, b2.f, e, -n, 0, -this.p);
        if (n > 64) {
            h.b(b2.f, e);
        }
        g2.a(this.n);
        g2.b(f[0] >> 16, f[1] - f[2] >> 16, e[0] >> 16, e[1] - e[2] >> 16);
    }
}
