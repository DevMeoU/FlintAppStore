/*
 * Decompiled with CFR 0.152.
 */
final class b {
    c a;
    int b;
    Object c;
    int[] d = new int[3];
    int[] e = new int[3];
    int[] f = new int[3];
    int[] g = new int[8];
    int[][] h = new int[8][4];
    int[] i = new int[3];

    b() {
    }

    void a() {
        int n;
        this.a = null;
        this.b = 0;
        this.c = null;
        h.a(this.e);
        h.a(this.f);
        h.a(this.d);
        this.i[0] = 65536;
        this.i[1] = 65536;
        this.i[2] = 65536;
        for (n = 0; n < this.g.length; ++n) {
            this.g[n] = 0;
        }
        for (n = 0; n < this.h.length; ++n) {
            for (int i = 0; i < this.h[n].length; ++i) {
                this.h[n][i] = 0;
            }
        }
    }

    int[] b() {
        if (null == this.c) {
            return h.F;
        }
        if (this.c instanceof f) {
            return ((f)this.c).l;
        }
        return (int[])this.c;
    }

    void a(int n, int n2) {
        switch (n) {
            case 1: {
                this.d[0] = n2;
                break;
            }
            case 2: {
                this.d[1] = n2;
                break;
            }
            case 3: {
                this.d[2] = n2;
                break;
            }
            case 4: {
                this.i[0] = n2;
                break;
            }
            case 5: {
                this.i[1] = n2;
                break;
            }
            case 6: {
                this.i[2] = n2;
            }
        }
    }
}
