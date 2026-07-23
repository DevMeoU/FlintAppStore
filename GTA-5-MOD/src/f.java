/*
 * Decompiled with CFR 0.152.
 */
final class f {
    static int[] a = new int[4];
    static int[] b = new int[4];
    int c;
    int d;
    int e;
    int f;
    int[] g;
    int h;
    int i;
    int j;
    int k;
    int[] l = new int[4];
    int[] m = new int[4];
    int[] n = new int[4];
    int o;
    int p;
    int q;
    int[][] r;
    int s;
    f t;
    int u;
    int v;
    int w;
    int x;
    int y;
    int z;
    int A;
    int B;
    f C;
    int D;
    Object E;
    static f F;
    static int G;
    static boolean H;
    static f I;
    static boolean J;
    static int K;
    static boolean L;
    static int M;
    static int N;
    int O;
    boolean P;
    int Q;
    boolean R;
    int S;
    int[][] T;
    int U;
    int V;
    int W;
    int X;
    static int[] Y;
    static int Z;
    static boolean aa;
    static int ab;
    static int ac;
    static int ad;
    static boolean ae;
    static int af;
    static int ag;
    boolean ah;
    static boolean ai;
    static boolean aj;

    f(int n) {
        this.d = n;
    }

    void a() {
        this.c(this.h, this.i);
        this.f = 0;
        this.o = 0;
        this.p = 0;
        this.r = null;
        this.s = 0;
        this.t = null;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = this.g[2];
        this.z = -1;
        this.A = 0;
        this.B = 0;
        this.C = null;
        switch (this.d) {
            case 2: {
                this.n();
                break;
            }
            case 1: 
            case 3: {
                this.A();
                break;
            }
            case 4: {
                this.D();
                break;
            }
            case 5: {
                this.E();
                break;
            }
            case 6: {
                this.G();
                break;
            }
            case 7: {
                this.H();
                break;
            }
            case 8: {
                this.I();
                break;
            }
            case 10: {
                this.U();
                break;
            }
            case 11: {
                this.V();
                break;
            }
            case 12: {
                this.X();
                break;
            }
            case 13: {
                this.aa();
            }
        }
    }

    void b() {
        this.a();
        this.D = -1;
        switch (this.d) {
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: {
                this.D = 0;
                h.a(this, 0);
                h.c(this, this.g[3], this.g[4], this.g[5]);
                break;
            }
            case 2: {
                this.D = 1;
                h.a(this, 1);
                h.c(this, this.g[3], this.g[4], this.g[5]);
                break;
            }
            case 1: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: {
                this.D = 1;
            }
        }
    }

    static void c() {
        f.m();
    }

    void a(int n) {
        if (0 != (this.v & 1)) {
            return;
        }
        this.x += n;
        switch (this.d) {
            case 1: {
                this.i(n);
                break;
            }
            case 2: {
                this.j(n);
                break;
            }
            case 3: {
                this.n(n);
                break;
            }
            case 4: {
                this.o(n);
                break;
            }
            case 5: {
                this.p(n);
                break;
            }
            case 6: {
                this.u(n);
                break;
            }
            case 7: {
                this.v(n);
                break;
            }
            case 8: {
                this.w(n);
                break;
            }
            case 9: {
                this.E(n);
                break;
            }
            case 10: {
                this.J(n);
                break;
            }
            case 11: {
                this.M(n);
                break;
            }
            case 12: {
                this.Q(n);
                break;
            }
            case 13: {
                this.ab();
                break;
            }
            case 16: {
                this.ac();
                break;
            }
            case 14: {
                this.af();
            }
        }
    }

    void a(g g2) {
        if (0 != (this.v & 1)) {
            return;
        }
        switch (this.d) {
            case 1: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: {
                this.b(g2);
                break;
            }
            case 2: {
                this.c(g2);
                break;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                this.d(g2);
                break;
            }
            case 12: {
                this.e(g2);
                break;
            }
            case 13: {
                this.g(g2);
                break;
            }
            case 16: {
                this.h(g2);
                break;
            }
            case 14: {
                this.i(g2);
            }
        }
        if (0 != (this.v & 4)) {
            h.a(g2, 994, this.h, this.i);
        } else if (0 != (this.v & 0x800)) {
            h.a(g2, 1082, this.h, this.i);
        }
        if (this == F && !h.eE.s()) {
            h.a(g2, 984, this.h, this.i);
        }
    }

    boolean b(int n) {
        if (0 != (this.v & 1)) {
            return false;
        }
        switch (this.d) {
            case 2: {
                return this.k(n);
            }
            case 9: {
                return this.H(n);
            }
        }
        return false;
    }

    boolean a(int n, int n2) {
        return (this.v & n) == n && (this.v & n2) == 0;
    }

    boolean b(int n, int n2) {
        if (Math.max(Math.abs(n - this.h), Math.abs(n2 - this.i)) > Math.max(this.g[4], this.g[5]) >> 16) {
            return false;
        }
        f.a[0] = n - this.h << 16;
        f.a[1] = n2 - this.i << 16;
        f.b[0] = h.h(this.l[3]);
        f.b[1] = h.g(this.l[3]);
        int n3 = Math.abs(h.d(a, b));
        h.c(b, b);
        int n4 = Math.abs(h.d(a, b));
        return n3 < this.g[4] && n4 < this.g[5];
    }

    boolean a(f f2) {
        if (-1 == this.D || -1 == f2.D) {
            return false;
        }
        if (1 != this.D && 0 != this.D) {
            h.a("Unknown intersection body type: " + this.D);
            return false;
        }
        if (1 != f2.D && 0 != f2.D) {
            h.a("Unknown intersection body type: " + f2.D);
            return false;
        }
        switch (this.D) {
            case 1: {
                this.b(a);
                switch (f2.D) {
                    case 1: {
                        f2.b(b);
                        return h.e(a, b);
                    }
                    case 0: {
                        f2.a(b);
                        return h.f(b, a);
                    }
                }
                break;
            }
            case 0: {
                this.a(a);
                switch (f2.D) {
                    case 1: {
                        f2.b(b);
                        return h.f(a, b);
                    }
                    case 0: {
                        f2.a(b);
                        return h.g(a, b);
                    }
                }
            }
        }
        return false;
    }

    void a(int[] nArray) {
        int n = 4;
        int n2 = 5;
        int n3 = this.l[3];
        if (n3 > 51472 && n3 < 154416 || n3 > 257360 && n3 < 360304) {
            n = 5;
            n2 = 4;
        }
        nArray[0] = this.l[0] - this.g[n] - 1;
        nArray[2] = this.l[0] + this.g[n] + 1;
        nArray[1] = this.l[1] - this.g[n2] - 1;
        nArray[3] = this.l[1] + this.g[n2] + 1;
    }

    void b(int[] nArray) {
        nArray[0] = this.l[0];
        nArray[1] = this.l[1];
        nArray[2] = this.g[4] + 1;
    }

    void c(int n, int n2) {
        this.l[0] = n << 16;
        this.l[1] = n2 << 16;
        this.d();
    }

    void d() {
        this.h = this.l[0] >> 16;
        this.i = this.l[1] >> 16;
        if (0 == (this.v & 0x20000)) {
            this.j = this.i;
        }
    }

    void d(int n, int n2) {
        this.l[0] = n;
        this.l[1] = n2;
        this.d();
    }

    void c(int n) {
        this.l[3] = h.j(n);
    }

    void e(int n, int n2) {
        this.c(h.g(n, n2));
    }

    int b(f f2) {
        return Math.max(Math.abs(f2.l[0] - this.l[0]), Math.abs(f2.l[1] - this.l[1]));
    }

    int c(int[] nArray) {
        return Math.max(Math.abs(nArray[0] - this.l[0]), Math.abs(nArray[1] - this.l[1]));
    }

    void a(int[][] nArray, int n) {
        this.r = nArray;
        this.s = n;
        this.u = 0;
        this.v |= 0x10000;
    }

    boolean e() {
        if (-1 == this.q) {
            return false;
        }
        this.a(h.uD(this.q), 0);
        return true;
    }

    void a(boolean bl) {
        this.r = null;
        this.v &= 0xFFFEFFFF;
        if (bl) {
            this.i();
        }
    }

    boolean d(int n) {
        if (null == this.r || 0 != (this.v & 0x4000)) {
            return false;
        }
        if (h.d(this.r) - this.u <= this.s) {
            this.a(true);
            return false;
        }
        this.u += this.o * n >> 10;
        int n2 = h.d(this.r, this.u, 0);
        if (n2 == Integer.MIN_VALUE) {
            this.a(true);
            return false;
        }
        this.l[3] = n2;
        h.a(this.l, this.r, this.u);
        this.d();
        return true;
    }

    void b(boolean bl) {
        this.v = bl ? (this.v &= 0xFFFFFFFE) : (this.v |= 1);
    }

    boolean f() {
        return 0 == (this.v & 1);
    }

    void c(boolean bl) {
        this.v = bl ? (this.v &= 0xFFFFFF7F) : (this.v |= 0x80);
    }

    boolean c(f f2) {
        if (null == f2) {
            return true;
        }
        return 0 == ((f2.v | this.v) & 0x80);
    }

    void a(f f2, int n, int n2) {
        switch (this.d) {
            case 9: {
                this.b(f2, n, n2);
                break;
            }
            case 11: {
                this.c(f2, n, n2);
                break;
            }
            case 2: {
                this.g(f2);
            }
        }
    }

    void e(int n) {
        if (n == this.d) {
            return;
        }
        this.d = n;
    }

    void f(int n) {
        if (n == this.w) {
            return;
        }
        this.w = n;
        this.x = 0;
    }

    int d(f f2) {
        int n = h.et * h.ev + h.eu * h.ew;
        int n2 = 0;
        if (this.C == f2) {
            switch (this.d) {
                case 5: 
                case 6: 
                case 7: {
                    n2 = n * 4;
                    break;
                }
                case 3: 
                case 4: {
                    n2 = n * 3;
                    break;
                }
                case 11: 
                case 12: {
                    n2 = n * 2;
                    break;
                }
                case 8: 
                case 10: {
                    n2 = n * 1;
                }
            }
        } else {
            switch (this.d) {
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 10: 
                case 11: 
                case 12: {
                    n2 = n * 1;
                }
            }
        }
        if (n2 > 0 && 0 != (this.v & 3)) {
            return 0;
        }
        int n3 = Math.max(Math.abs(this.l[0] - f2.l[0]), Math.abs(this.l[1] - f2.l[1]));
        return n2 -= n3;
    }

    Object a(int n, int n2, int n3, int n4) {
        this.v |= 0x10000000;
        Object object = h.a(n, n2, n3, n4 | 0x10000000);
        this.v &= 0xEFFFFFFF;
        return object;
    }

    Object f(int n, int n2) {
        return h.b(this, n, n2);
    }

    static int g(int n) {
        short[][] sArray = h.ae[h.eA[n][1]];
        return h.r(sArray[0][0]);
    }

    void e(f f2) {
        switch (this.d) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: {
                h.a(9, this.h, this.i, 10, null);
                break;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: {
                h.a(5, this.h, this.i, 10, null);
            }
        }
    }

    void f(f f2) {
        switch (this.d) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: {
                h.a(9, this.h, this.i, 10, null);
            }
        }
    }

    boolean a(int n, f f2) {
        if (this.y == 0) {
            return false;
        }
        if (0 != (this.v & 0x400)) {
            n = n * 50 / 100;
        }
        switch (this.d) {
            case 3: 
            case 4: {
                this.i(f2);
                break;
            }
            case 5: 
            case 7: {
                this.m(f2);
                break;
            }
            case 6: {
                this.o(f2);
                break;
            }
            case 11: {
                this.q(f2);
                break;
            }
            case 12: {
                this.r(f2);
            }
        }
        boolean bl = this.h(n);
        if (this.y == 0) {
            if (2 == f2.d || 9 == f2.d) {
                if (this.j()) {
                    h.n(5, 196608);
                } else {
                    ++h.at;
                }
                h.r(f2.z, this.z);
            }
            h.d(f2);
        }
        return bl;
    }

    boolean h(int n) {
        if (this.y == 0) {
            return false;
        }
        if (0 != (this.v & 0x1000)) {
            return false;
        }
        if ((this.d == 2 || this.d == 9) && H) {
            return false;
        }
        this.y -= n;
        if (this.y <= 0) {
            this.y = 0;
            this.g();
        }
        return n > 0;
    }

    void g() {
        this.v |= 0x4082;
        switch (this.d) {
            case 2: {
                this.z();
                break;
            }
            case 1: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: {
                this.k();
                break;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: {
                this.L();
            }
        }
        h.ua(this.c);
    }

    static void h() {
        block3: for (int i = 0; i < h.eB.length; ++i) {
            int n;
            f f2;
            f f3 = h.eB[i];
            if (0 != (f3.v & 3)) continue;
            switch (f3.d) {
                case 1: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: {
                    break;
                }
                default: {
                    continue block3;
                }
            }
            if (4 == f3.w || (f2 = (f)f3.a(f3.h, f3.i, 32, 1)) == null || !f3.a(n = h.a(0, f3.g[2], 0, 0x3C0000, Math.min(0x3C0000, Math.abs(f2.o))), f2)) continue;
            if (f3.y > 0) {
                f3.f(4);
                f3.j = Integer.MIN_VALUE;
                continue;
            }
            h.a(9, f3.h, f3.i, 10, null);
            f2.X = 500;
        }
    }

    void i() {
        switch (this.d) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: {
                this.l();
                break;
            }
            case 8: {
                this.M();
            }
        }
    }

    boolean j() {
        switch (this.d) {
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: {
                return true;
            }
        }
        return false;
    }

    boolean i(int n) {
        if (this.w == 3) {
            return true;
        }
        this.m[0] = this.l[0];
        this.m[1] = this.l[1];
        this.m[3] = this.l[3];
        switch (this.w) {
            case 7: {
                if (!h.cZ(this.A, this.x)) break;
                this.f(0);
                break;
            }
            case 6: {
                if (!h.cZ(this.A, this.x)) break;
                this.f(5);
                break;
            }
            case 5: {
                if (this.x <= 1000) break;
                this.f(0);
                break;
            }
            case 4: {
                if (this.x > 3000) {
                    this.f(0);
                }
                return true;
            }
        }
        if (null != this.r) {
            this.d(n);
        }
        return false;
    }

    void b(g g2) {
        if (8 == this.w) {
            return;
        }
        int n = 10 != this.w ? this.w : 2;
        short[][] sArray = h.ae[this.g[1] + n];
        short[] sArray2 = sArray[h.a(this.l[3], sArray.length, false)];
        short s = sArray2[this.x * sArray2.length / 700 % sArray2.length];
        int n2 = h.r(s);
        h.l(n2, this.f);
        h.a(g2, (int)s, this.h, this.i);
        h.l(n2, 0);
    }

    void g(int n, int n2) {
        if (n2 == 0) {
            return;
        }
        int n3 = n2 * n >> 10;
        this.l[0] = this.l[0] + h.c(n3, h.h(this.l[3]));
        this.l[1] = this.l[1] + h.c(n3, h.g(this.l[3]));
    }

    boolean b(int n, f f2) {
        int[] nArray = h.a(n, this, f2);
        if (null == nArray) {
            return false;
        }
        if (this.w == 3) {
            return true;
        }
        this.o = 0;
        this.e(nArray[0] - this.l[0], nArray[1] - this.l[1]);
        this.A = n;
        if (h.uf(n)) {
            this.f(7);
        } else {
            this.f(6);
        }
        return true;
    }

    boolean a(int n, f f2, int n2) {
        int n3 = this.b(f2);
        this.e(f2.l[0] - this.l[0], f2.l[1] - this.l[1]);
        if (this.w == 0) {
            this.o = 0;
            if (n3 < n2) {
                return true;
            }
            this.f(2);
        }
        if (this.w == 2) {
            if (n3 < n2) {
                this.f(0);
            } else {
                this.o = 0x2D0000;
                this.g(n, this.o);
                Object object = this.a(this.l[0] >> 16, this.l[1] >> 16, 64, 1);
                if (null != object) {
                    Object object2;
                    this.f(0);
                    this.l[0] = this.m[0];
                    this.l[1] = this.m[1];
                    if (object != h.b && ((f)object).j() && object.equals(object2 = this.a(this.l[0] >> 16, this.l[1] >> 16, 64, 1))) {
                        f f3 = (f)object;
                        this.l[0] = this.l[0] - 131072 * h.b(f3.l[0] - this.m[0]);
                        this.l[1] = this.l[1] - 131072 * h.b(f3.l[1] - this.m[1]);
                    }
                }
                this.d();
            }
        }
        return false;
    }

    void a(f f2, int n) {
        int[][] nArray = new int[2][5];
        System.arraycopy(this.l, 0, nArray[0], 0, 3);
        System.arraycopy(f2.l, 0, nArray[1], 0, 3);
        h.c(nArray);
        this.B = 2;
        this.t = f2;
        this.f(10);
        this.o = 0x2D0000;
        this.a(nArray, n);
    }

    void k() {
        this.o = 0;
        this.f(3);
        int n = -1;
        switch (this.d) {
            case 1: 
            case 3: 
            case 4: {
                f.a(0, this.l[0], this.l[1]);
                break;
            }
            case 5: {
                f.a(1, this.l[0] - 0x120000, this.l[1]);
                f.a(3, this.l[0] + 0x120000, this.l[1]);
                break;
            }
            case 6: {
                f.a(2, this.l[0] - 0x120000, this.l[1]);
                f.a(3, this.l[0] + 0x120000, this.l[1]);
            }
        }
        this.j = Integer.MIN_VALUE;
    }

    void l() {
        if (null != this.t) {
            h.cW(this.c, this.t.c);
        }
        this.t = null;
        this.f(0);
        this.o = 0;
        this.B = 7 != this.d ? 0 : 3;
    }

    static void m() {
        F = null;
        G = 0;
    }

    void n() {
        this.z = 0;
        this.f = 11;
        if (h.cb == 5) {
            f.e(false);
        } else {
            f.e(true);
        }
        for (int i = 0; i < h.cV.length && !this.l(i); ++i) {
        }
        this.o();
    }

    void o() {
        if (h.gL[6]) {
            G = h.gK[6];
        }
    }

    void j(int n) {
        if (0 != (this.v & 0x4000)) {
            return;
        }
        if (this.i(n)) {
            return;
        }
        if (this.u()) {
            switch (this.w) {
                case 0: 
                case 1: 
                case 2: 
                case 5: {
                    if (L) break;
                    this.w();
                    if (h.aG[h.cV[G][0]] <= 0 || !this.b(G, this.C)) break;
                    I = this.C;
                    if (!h.uf(G)) {
                        int n2 = h.cV[G][0];
                        h.aG[n2] = h.aG[n2] - 1;
                    }
                    this.w();
                    return;
                }
            }
        }
        if (this.m(n)) {
            this.y();
            return;
        }
        switch (this.w) {
            case 0: 
            case 5: {
                int n3 = this.v();
                if (n3 == Integer.MIN_VALUE) break;
                this.l[3] = n3;
                this.o = 0x3C0000;
                this.f(2);
                this.C = null;
                M = 0;
                break;
            }
            case 1: 
            case 2: {
                int n4 = this.v();
                if (n4 == Integer.MIN_VALUE) {
                    this.o = 0;
                    this.f(0);
                    break;
                }
                this.l[3] = n4;
                break;
            }
            case 9: {
                this.g(n, this.o);
                this.d();
                Object object = this.f(64, 1);
                if (null != object && object instanceof f) break;
                this.o = 0;
                this.f(0);
                this.c(true);
                this.v &= 0xFFFDFFFF;
            }
        }
        switch (this.w) {
            case 0: 
            case 1: 
            case 2: {
                this.g(n, this.o * (h.j ? 5 : 1));
                this.d();
                boolean bl = null != F;
                F = null;
                for (int i = 0; i < h.eB.length; ++i) {
                    f f2 = h.eB[i];
                    if (f2.d != 8 && f2.d != 10 && f2.d != 11 && f2.d != 12 || 0 != (f2.v & 3) || Math.abs(f2.h - this.h) >= 35 || Math.abs(f2.i - this.i) >= 35) continue;
                    F = f2;
                    break;
                }
                if (bl || null == F) break;
                h.vE(169);
            }
        }
    }

    void c(g g2) {
        this.b(g2);
    }

    boolean k(int n) {
        if (0 != (this.v & 0x4000)) {
            return false;
        }
        if (h.gc) {
            return false;
        }
        switch (n) {
            case 11: {
                if (!this.p()) break;
                this.q();
                break;
            }
            case 5: {
                this.x();
                break;
            }
            case 0: 
            case 1: 
            case 2: 
            case 3: {
                if (9 != this.w) break;
                this.l[3] = this.v();
                break;
            }
            case 6: {
                this.C = h.a(G, this, ++M);
            }
        }
        return false;
    }

    boolean p() {
        return null != F && this.w != 8 && this.w != 9;
    }

    void d(boolean bl) {
        if (null == F) {
            return;
        }
        if (!bl && 0 != (f.F.v & 0x2000)) {
            h.d(h.S[157]);
            return;
        }
        this.f(8);
        if (!bl) {
            h.tV(f.F.c);
            if (5 != h.eF && f.F.d != 8 && 0 != f.F.w) {
                if (11 != f.F.d && 12 != f.F.d && f.F.e != 39 && h.a(100) < 50) {
                    h.a(false, 30000);
                } else {
                    F.j(this.h, this.i);
                    if (12 == f.F.d) {
                        h.n(5, 196608);
                    }
                }
                h.d(this);
                ++h.av;
            }
        }
        this.C = null;
        h.a(this, F);
        if (null != h.fZ && !h.lr()) {
            h.vd(-1);
        }
        F.D(this.z);
        this.o = 0;
        this.b(false);
        if (f.F.e == 38 || f.F.e == 39) {
            f.F.ah = !h.aq;
            f.F.f = this.f;
        }
    }

    void q() {
        this.d(false);
    }

    boolean r() {
        if (!this.s()) {
            return false;
        }
        for (int i = 0; i < h.eB.length; ++i) {
            f f2 = h.eB[i];
            if (f2.e != 25 && f2.e != 41 || f2.ad() && !f2.ae()) continue;
            return false;
        }
        return true;
    }

    boolean s() {
        return this.w == 8;
    }

    void t() {
        if (null == F || !F.a(a, this.g[4])) {
            return;
        }
        this.c(a[0], a[1]);
        this.f(0);
        h.a(F, this);
        if (5 == h.eF) {
            h.aQ(false);
        }
        F.O();
        int n = f.F.c;
        F = null;
        this.b(true);
        h.tW(n);
    }

    boolean u() {
        if (h.gc) {
            return false;
        }
        return h.k[4];
    }

    int v() {
        int n = Integer.MIN_VALUE;
        if (h.gc) {
            return n;
        }
        if (h.k[1]) {
            n = 0;
        } else if (h.k[2]) {
            n = 102944;
        } else if (h.k[3]) {
            n = 205888;
        } else if (h.k[0]) {
            n = 308832;
        }
        return n;
    }

    void w() {
        if (null != this.C && 0 == (this.C.v & 3) && h.dh(this.C.h, this.C.i)) {
            return;
        }
        M = 0;
        this.C = h.a(G, this, M);
    }

    void x() {
        for (int i = 1; i < h.cV.length && !this.l((G + i) % h.cV.length); ++i) {
        }
    }

    boolean l(int n) {
        int n2 = h.cV[n][0];
        if (n2 == -1 || h.aG[n2] == 0) {
            return false;
        }
        G = n;
        return true;
    }

    boolean m(int n) {
        if (2 != this.w && 1 != this.w || !J) {
            K = 0;
            return false;
        }
        J = false;
        return (K += n) > 400;
    }

    void y() {
        this.f(9);
        this.c(false);
        this.o = 0x5A0000;
        this.v |= 0x20000;
        this.j = Integer.MAX_VALUE;
        if (null != h.fZ && !h.lr()) {
            h.vd(-1);
        }
        F = null;
    }

    void z() {
        this.k();
        G = 0;
        h.n();
        h.d(h.S[152]);
        h.B(500);
    }

    void g(f f2) {
        if (null == f2) {
            return;
        }
        if (0 != f2.o) {
            return;
        }
        J = Integer.MIN_VALUE != this.v();
    }

    static void e(boolean bl) {
        L = !bl;
    }

    void A() {
        this.f = this.C();
    }

    boolean n(int n) {
        if (this.i(n)) {
            return true;
        }
        switch (this.w) {
            case 0: {
                this.o = 983040 + h.a(983040);
                this.B();
                this.f(1);
            }
            case 1: {
                int n2 = this.l[3];
                this.l[3] = this.n[3];
                this.g(n, this.o);
                if (!h.cX(this.l[0] + this.n[0] >> 16, this.l[1] + this.n[1] >> 16) || null != this.a(this.l[0] >> 16, this.l[1] >> 16, 64, 1)) {
                    this.l[0] = this.m[0];
                    this.l[1] = this.m[1];
                    this.l[3] = n2;
                    this.f(0);
                }
                this.d();
                break;
            }
            case 2: {
                boolean bl;
                this.o = 0x2D0000;
                this.g(n, this.o);
                Object object = this.a(this.l[0] >> 16, this.l[1] >> 16, 64, 1);
                boolean bl2 = bl = null == object && 35 != h.ez;
                if (!bl) {
                    this.l[0] = this.m[0];
                    this.l[1] = this.m[1];
                    this.l[3] = h.a(411776);
                }
                this.d();
            }
        }
        return false;
    }

    void B() {
        int n = h.a(4) * 102944;
        this.n[0] = h.c(this.g[4], h.h(n));
        this.n[1] = h.c(this.g[5], h.g(n));
        this.n[3] = n;
    }

    boolean h(int n, int n2) {
        this.c(n, n2);
        this.a();
        return true;
    }

    int C() {
        return 12 + h.a(1);
    }

    void h(f f2) {
        if (this.w == 2) {
            return;
        }
        int n = Math.max(Math.abs(this.l[0] - f2.l[0]), Math.abs(this.l[1] - f2.l[1]));
        if (n > 0x690000) {
            return;
        }
        this.i(f2);
    }

    void i(f f2) {
        if (this.w == 2) {
            return;
        }
        if (0 != (this.v & 3)) {
            return;
        }
        this.e(this.l[0] - f2.l[0], this.l[1] - f2.l[1]);
        this.f(2);
    }

    void D() {
        this.A();
        this.b(false);
    }

    void o(int n) {
        this.n(n);
    }

    void E() {
        this.q(h.o(this.h, this.i));
        this.O = 16;
    }

    void p(int n) {
        switch (this.B) {
            case 0: 
            case 3: {
                this.r(n);
                break;
            }
            case 1: {
                this.s(n);
                break;
            }
            case 2: {
                this.t(n);
            }
        }
    }

    void q(int n) {
        if (n == -1) {
            h.a("Can't init gangster at: " + this.h + ", " + this.i);
            this.b(false);
            return;
        }
        this.z = n;
        this.f = 13 + this.z;
    }

    void r(int n) {
        if (null != this.t) {
            if (this.i(n)) {
                return;
            }
            this.a(n, this.t, this.s);
        } else if (3 != this.B && this.n(n)) {
            return;
        }
        f f2 = this.F();
        if (null == f2) {
            return;
        }
        if (0 != (f2.v & 3)) {
            return;
        }
        int n2 = Math.max(Math.abs(this.l[0] - f2.l[0]), Math.abs(this.l[1] - f2.l[1]));
        if (n2 > 0x780000) {
            return;
        }
        this.j(f2);
    }

    void s(int n) {
        if (this.i(n)) {
            return;
        }
        if (null == this.C || 0 != (this.C.v & 3)) {
            this.B = 0;
            this.C = null;
            this.f(0);
            return;
        }
        block0 : switch (this.d) {
            case 5: {
                switch (h.H(this.z)) {
                    case 1: {
                        this.O = 0;
                        break;
                    }
                    case 2: {
                        this.O = 2;
                        break;
                    }
                    case 3: 
                    case 4: {
                        this.O = 4;
                        break;
                    }
                    case 5: {
                        this.O = 6;
                    }
                }
                break;
            }
            case 6: {
                switch (h.H(this.z)) {
                    case 1: 
                    case 2: {
                        this.O = 16;
                        break block0;
                    }
                    case 3: 
                    case 4: {
                        this.O = 4;
                        break block0;
                    }
                    case 5: {
                        this.O = 13;
                    }
                }
            }
        }
        if (this.a(n, this.C, h.cV[this.O][4])) {
            this.b(this.O, this.C);
        }
    }

    void t(int n) {
        switch (this.w) {
            case 0: {
                this.o = 0;
                break;
            }
            case 1: {
                this.o = 0x1E0000;
                break;
            }
            case 2: {
                this.o = 0x2D0000;
            }
        }
        this.i(n);
    }

    void j(f f2) {
        this.B = 1;
        this.C = f2;
        this.f(5);
    }

    void k(f f2) {
        this.t = f2;
        this.s = 0x1E0000;
    }

    f F() {
        if (this.z == -1) {
            return null;
        }
        if (this.z != 0) {
            if (h.H(this.z) == 0) {
                return null;
            }
            return h.kt();
        }
        f f2 = h.eB[N++ % h.eB.length];
        if (h.H(f2.z) == 0) {
            return null;
        }
        return f2;
    }

    void l(f f2) {
        if (this.B == 1) {
            return;
        }
        if (this.z == -1) {
            return;
        }
        int n = Math.max(Math.abs(this.l[0] - f2.l[0]), Math.abs(this.l[1] - f2.l[1]));
        if (n > 0x780000) {
            return;
        }
        if (f2.z == this.z) {
            if (f2.C == null) {
                return;
            }
            f2 = f2.C;
        }
        this.m(f2);
    }

    void m(f f2) {
        if (this.B == 1) {
            return;
        }
        if (0 != (this.v & 3)) {
            return;
        }
        if (10 == this.w) {
            return;
        }
        if (this.z == f2.z) {
            return;
        }
        this.j(f2);
    }

    void G() {
        this.z = 5;
    }

    void u(int n) {
        this.p(n);
    }

    void n(f f2) {
        this.l(f2);
    }

    void o(f f2) {
        this.m(f2);
    }

    void H() {
        this.A();
        if (this.e()) {
            this.B = 2;
            this.f(10);
            this.o = 0x2D0000;
        } else {
            this.B = 3;
        }
    }

    void v(int n) {
        this.p(n);
    }

    void I() {
        this.v |= 0x60;
        this.P = false;
        this.Q = 0;
        this.S = 0;
        this.X = 0;
        switch (this.e) {
            case 38: 
            case 39: {
                this.Y();
                break;
            }
            case 2: 
            case 4: 
            case 5: 
            case 6: 
            case 8: 
            case 9: 
            case 16: 
            case 17: 
            case 30: {
                int n = h.a(2);
                if (n >= 10) break;
                this.f = 1 + n;
            }
        }
    }

    void w(int n) {
        this.x(n);
        switch (this.w) {
            case 0: 
            case 1: 
            case 3: {
                this.p = 0;
            }
        }
        if (null != this.r) {
            if (0 == (this.v & 0x4000)) {
                this.z(n);
            }
            this.d(n);
        } else {
            this.y(n);
        }
    }

    void d(g g2) {
        long l;
        if (this.e == 38 || this.e == 39) {
            this.f(g2);
            return;
        }
        if (0 != (this.v & 2)) {
            short[][] sArray = h.ae[41];
            h.a(g2, (int)sArray[h.a(this.l[3], sArray.length, false)][0], this.h, this.i);
            return;
        }
        int n = Math.max(Math.abs(this.l[0] - this.m[0]), Math.abs(this.l[1] - this.m[1]));
        long l2 = l = n <= 5242 || h.gJ ? h.d : 0L;
        if (0L != l) {
            h.d = 0L;
        }
        short[][] sArray = h.ae[this.g[1]];
        int n2 = h.r(sArray[2][0]);
        h.l(n2, this.f);
        h.a(g2, (int)sArray[h.a(this.l[3], sArray.length, false)][0], this.h, this.i);
        h.l(n2, 0);
        if (0L != l) {
            h.d = l;
        }
    }

    void x(int n) {
        this.m[0] = this.l[0];
        this.m[1] = this.l[1];
        this.m[3] = this.l[3];
    }

    void y(int n) {
        if (!this.z(n)) {
            return;
        }
        int n2 = this.A(n);
        int n3 = this.o * n >> 10;
        this.l[0] = this.l[0] + h.c(n3, h.h(n2));
        this.l[1] = this.l[1] + h.c(n3, h.g(n2));
        this.d();
        this.B(n);
        if (this.X > 0 && h.q) {
            this.X -= n;
            h.b(this, 0x800000);
        } else if (Math.abs(this.Q) > 39321) {
            h.b(this, 0x303030);
        }
    }

    boolean z(int n) {
        if (this.o > this.p) {
            this.o = Math.max(this.p, this.o - (0xC80000 * n >> 10));
        } else if (this.o < this.p && !this.P) {
            this.o = Math.min(this.p, this.o + (0x640000 * n >> 10));
        }
        return 0 != this.o;
    }

    boolean i(int n, int n2) {
        int n3 = this.l[3];
        int n4 = h.h(n3, n2);
        if (n4 < 0) {
            n3 += Math.min(-n4, 262144 * n >> 10);
        } else if (n4 > 0) {
            n3 -= Math.min(n4, 262144 * n >> 10);
        } else {
            return false;
        }
        this.l[3] = h.j(n3);
        return true;
    }

    int A(int n) {
        boolean bl;
        if (!this.P && this.o < 0x780000) {
            return this.l[3];
        }
        int n2 = h.h(this.l[3], this.m[3]);
        int n3 = (Math.abs(n2) << 10) / n;
        boolean bl2 = bl = n3 < 32768 || n2 * this.Q > 0;
        if (!bl) {
            this.R = false;
        } else {
            boolean bl3 = this != F || !h.i;
            boolean bl4 = this.R = bl3 && this.S != 0;
            if (this.R) {
                bl = false;
                n3 = 131072 + h.c(this.o, 655);
                n2 = this.S > 0 ? Math.min(this.S, n3 * n >> 10) : Math.max(this.S, -n3 * n >> 10);
                this.l[3] = h.b(this.m[3] + n2, 411776);
                this.S -= n2;
            } else {
                if (this.Q > 0) {
                    this.Q = Math.max(0, this.Q - (205783 * n >> 10));
                } else if (this.Q < 0) {
                    this.Q = Math.min(0, this.Q + (205783 * n >> 10));
                }
                if (this.Q == 0) {
                    this.P = false;
                    return this.l[3];
                }
            }
        }
        if (!bl) {
            this.Q = n2 > 0 ? Math.max(-102891, this.Q - (n2 >> 1)) : Math.min(102891, this.Q - (n2 >> 1));
            if (!this.R) {
                this.S = -(this.Q >> 1);
            }
        }
        if (this.P) {
            this.o -= 0x460000 * n >> 10;
            if (this.o <= 0) {
                this.P = false;
                this.Q = 0;
                this.S = 0;
            }
        } else {
            this.P = Math.abs(this.Q) > 17039;
        }
        return this.l[3] + this.Q;
    }

    void B(int n) {
        if (null == this.T) {
            return;
        }
        this.W += h.a(this.l, this.m);
        if (this.W < 0x1E0000) {
            return;
        }
        int n2 = this.W / 0x1E0000;
        this.W %= 0x1E0000;
        for (int i = 0; i < n2; ++i) {
            int n3 = (this.U + this.V) % 30;
            System.arraycopy(this.l, 0, this.T[n3], 0, 3);
            if (this.V == 30) {
                this.U = (this.U + 1) % 30;
                continue;
            }
            this.V = Math.min(this.V + 1, 30);
        }
    }

    boolean C(int n) {
        return this.e != 38 && this.e != 3 && this.e != 7 && this.e != 39 && h.m(f.g(this.e), n);
    }

    void J() {
        this.T = new int[30][4];
        this.U = 0;
        this.V = 0;
        this.W = 0x1E0000;
    }

    void K() {
        this.T = null;
    }

    boolean d(int[] nArray) {
        if (null == this.T || 0 == this.V) {
            return false;
        }
        System.arraycopy(this.T[this.U], 0, nArray, 0, 3);
        return true;
    }

    boolean a(int[] nArray, int n) {
        int[] nArray2 = new int[]{308832, 102944, 205888, 0};
        int[] nArray3 = new int[]{this.g[5], this.g[5], this.g[4], this.g[4]};
        for (int i = 0; i < nArray2.length; ++i) {
            h.i(nArray2[i] + this.l[3], nArray3[i] + 786432);
            int n2 = h.I + this.l[0] >> 16;
            int n3 = h.J + this.l[1] >> 16;
            if (null != h.a(n2, n3, 64, 1)) continue;
            if (n > 0) {
                h.i(nArray2[i] + this.l[3], nArray3[i] + n * 2);
                int n4 = h.I + this.l[0] >> 16;
                int n5 = h.J + this.l[1] >> 16;
                if (null != h.a(n4, n5, 64, 1)) continue;
            }
            nArray[0] = n2;
            nArray[1] = n3;
            return true;
        }
        h.a("Vehicle_GetLeavingPoint(): Can't find leaving point");
        return false;
    }

    void L() {
        this.o = 0;
        this.f(3);
        h.a(23, this.l, null);
        h.dg(1000, 15);
        if (this == F) {
            h.eE.m[0] = h.eE.l[0];
            h.eE.m[1] = h.eE.l[1];
            h.eE.m[3] = h.eE.l[3];
            h.eE.t();
            h.eE.y = 0;
            h.eE.g();
        }
        if (this.e == 38 || this.e == 39) {
            this.b(false);
        }
        h.a(0x320000, 100, this.l, false);
    }

    f j(int n, int n2) {
        if (this.w == 0) {
            return null;
        }
        switch (this.d) {
            case 11: {
                return this.l(n, n2);
            }
            case 12: {
                return this.m(n, n2);
            }
        }
        if (this.e == 38 || this.e == 39) {
            return this.n(n, n2);
        }
        f f2 = h.uB(4);
        if (null != f2) {
            f2.a();
            f2.c(n, n2);
            f2.b(true);
            f2.f(2);
        }
        return f2;
    }

    void M() {
        this.f(0);
        this.v &= 0xFFFFDFFF;
    }

    void N() {
        this.U = (this.U + 1) % 30;
        this.V = Math.max(0, this.V - 1);
    }

    void D(int n) {
        this.e(9);
        this.f(1);
        this.z = n;
        Y = h.ga[this.g[6]];
        Z = 1;
    }

    void O() {
        this.e(this.g[0]);
        this.f(0);
        this.z = -1;
    }

    void E(int n) {
        this.F(n);
        switch (this.w) {
            case 0: 
            case 1: 
            case 3: {
                this.p = 0;
                this.f(2);
                break;
            }
            case 2: {
                int n2;
                int n3;
                if (this.o == 0) break;
                int n4 = 0;
                if (!h.gc) {
                    int n5 = n3 = h.i ? this.R() : this.I(n);
                    if (n3 != 0) {
                        n2 = this.o < 0 ? 0 : h.c(this.o, 655);
                        n4 = n3 * (131072 + n2) * n >> 10;
                    }
                }
                if (!h.i && aa) {
                    ab = Math.max(0, ab - n);
                    if (ac <= 0) {
                        aa = false;
                        this.P();
                        this.P();
                    }
                }
                if (0 == n4 && Math.abs(n4 = h.b(n2 = h.h(n3 = 102944 * ((this.l[3] + 51472) / 102944), this.l[3])) * (65536 * n) >> 10) > Math.abs(n2)) {
                    n4 = n2;
                }
                if (n4 != 0) {
                    this.l[3] = h.b(this.l[3] + n4, 411776);
                }
                this.T();
            }
        }
        this.G(n);
        h.eE.d(this.l[0], this.l[1]);
        h.eE.l[3] = this.l[3];
    }

    void F(int n) {
        if (ae) {
            ae = false;
            int n2 = h.a(this.l, this.m);
            int n3 = n2 / n << 10;
            if (Math.abs(this.o) > n3) {
                this.o = h.b(this.o) * n3;
            }
        }
        ad = this.o;
        if ((af -= n) < 0) {
            af = 0;
        }
        this.x(n);
    }

    void G(int n) {
        this.y(n);
    }

    boolean H(int n) {
        if (h.gc) {
            return false;
        }
        if (n == 11) {
            if (h.eE.r()) {
                h.eE.t();
                aa = false;
            }
        } else if (h.i) {
            switch (n) {
                case 0: {
                    boolean bl = false;
                    while (this.P() && this.p <= ad) {
                        bl = true;
                    }
                    return bl;
                }
                case 2: {
                    boolean bl = false;
                    while (this.Q() && this.p >= ad) {
                        bl = true;
                    }
                    return bl;
                }
            }
        } else {
            switch (n) {
                case 0: 
                case 1: 
                case 2: 
                case 3: {
                    int n2 = Math.abs(h.h(this.v(), f.F.l[3]));
                    if (n2 <= 102944) {
                        return this.P();
                    }
                    return this.Q();
                }
            }
        }
        return false;
    }

    void b(f f2, int n, int n2) {
        int n3;
        int n4;
        if (null != f2) {
            if (!ae) {
                h.b(h.u, this.l, f2.l);
                h.a(h.v, this.l[3], 65536);
                ae = h.d(h.u, h.v) < 0;
            }
        } else {
            ae = true;
        }
        if ((n4 = h.e(n, n2)) > 0x280000) {
            n3 = h.g(n, n2) - this.l[3];
            int n5 = h.c(h.h(n3), this.g[4]);
            int n6 = h.c(h.g(n3), this.g[5]);
            int n7 = h.h(this.l[3]);
            int n8 = h.g(this.l[3]);
            h.a(6, this.h - (h.c(n5, n7) - h.c(n6, n8) >> 16), this.i - (h.c(n5, n8) + h.c(n6, n7) >> 16), 5, null);
        }
        if (null == f2) {
            this.l[3] = this.m[3];
            return;
        }
        switch (f2.d) {
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: {
                if (n4 <= 0x280000 || af != 0) break;
                af = 1000;
                n3 = h.c(65536, n4) >> 16;
                f2.a(n3, this);
            }
        }
    }

    boolean P() {
        int n;
        if (this.S()) {
            return true;
        }
        int n2 = n = 0 == (this.v & 0x200) ? 5 : 6;
        if (Z < n) {
            this.p = Y[++Z];
            aa = false;
            return true;
        }
        return false;
    }

    boolean Q() {
        if (this.S()) {
            return true;
        }
        if (Z > 0) {
            this.p = Y[--Z];
            if (!aa && 0 == Z) {
                aa = true;
                ab = 1000;
                ac = 205888;
            }
            return true;
        }
        return false;
    }

    int R() {
        if (h.k[1]) {
            return this.o < 0 ? -1 : 1;
        }
        if (h.k[3]) {
            return this.o < 0 ? 1 : -1;
        }
        return 0;
    }

    int I(int n) {
        if (aa && 0 == ab) {
            ac -= 131072 * n >> 10;
            return 1;
        }
        int n2 = this.v();
        int n3 = h.h(n2, this.l[3]);
        int n4 = Math.abs(n3);
        if (Integer.MIN_VALUE == n2) {
            return 0;
        }
        if (n4 < 25736 || n4 > 102944) {
            return 0;
        }
        return h.b(n3);
    }

    boolean S() {
        return aa && ab == 0;
    }

    void T() {
        block12: for (int i = 0; i < 5; ++i) {
            int n;
            int n2;
            int n3 = (this.h >> h.ee) / 3;
            int n4 = (this.i >> h.ee) / 3;
            switch (i) {
                case 0: {
                    break;
                }
                case 1: {
                    --n3;
                    break;
                }
                case 2: {
                    ++n3;
                    break;
                }
                case 3: {
                    --n4;
                    break;
                }
                case 4: {
                    ++n4;
                }
            }
            if (n3 < 0 || n4 < 0 || n3 >= h.et || n4 >= h.eu) continue;
            int n5 = h.ex[n4 * h.et + n3] - 34;
            int n6 = -1;
            switch (n5) {
                case 0: {
                    n6 = 0;
                    n2 = (n3 << h.ee) * 3 + (h.ef >> 1);
                    n = (n4 << h.ee) * 3 + (h.eg >> 1);
                    h.j(n2, n, 567);
                    h.j(n2 - h.ef, n, 393);
                    h.j(n2, n + h.eg, 393);
                    h.j(n2 - h.ef, n + h.eg, 393);
                    break;
                }
                case 1: {
                    n6 = 0;
                    break;
                }
                case 2: {
                    n6 = 9;
                    break;
                }
                default: {
                    continue block12;
                }
            }
            h.i(n3 * 3 << h.ee, n4 * 3 << h.ee, n6);
            n2 = h.er * 3;
            for (n = 0; n < n2; n += 3) {
                if (n3 != (h.es[n + 1] >> h.ee) / 3 || n4 != (h.es[n + 2] >> h.ee) / 3) continue;
                h.a(h.eb[n5], this.h, this.i, 0, null);
                h.es[n + 0] = -1;
                continue block12;
            }
        }
    }

    void U() {
        this.I();
        this.b(false);
    }

    void J(int n) {
        this.x(n);
        switch (this.w) {
            case 0: 
            case 1: 
            case 3: {
                this.p = 0;
                break;
            }
            case 2: {
                this.p = 0;
                int n2 = h.f(this.h, this.i, this.A);
                if (Integer.MIN_VALUE != n2 && this.K(this.l[3])) {
                    this.p = 0x190000;
                    if (!this.i(n, n2)) {
                        this.p = 0x320000;
                    }
                    this.A = h.cP;
                }
                this.L(n);
            }
        }
        this.y(n);
    }

    boolean K(int n) {
        int n2;
        int n3 = 3 * this.g[4] >> 1;
        int n4 = this.l[0] + h.c(n3, h.h(n));
        if (!h.g(n4 >> 16, (n2 = this.l[1] + h.c(n3, h.g(n))) >> 16, this.A)) {
            return false;
        }
        return h.a(this, n4, n2);
    }

    void L(int n) {
        if (!h.a(this.h, this.i, a)) {
            return;
        }
        a[0] = a[0] << 16;
        a[1] = a[1] << 16;
        h.b(b, a, this.l);
        int n2 = h.c(b);
        h.a(this.l, this.l, a, 0, n2, Math.min(n2, 655360 * n >> 10));
    }

    boolean k(int n, int n2) {
        if (!h.a(this, n << 16, n2 << 16)) {
            return false;
        }
        this.c(n, n2);
        this.a();
        this.L(1000);
        this.d();
        this.l[3] = h.f(this.h, this.i, this.A);
        this.A = h.cP;
        if (!this.K(this.l[3])) {
            return false;
        }
        this.b(true);
        this.f(2);
        return true;
    }

    void V() {
        this.v |= 0x60;
        this.b(false);
    }

    void M(int n) {
        if (this.w == 3 || this.w == 0) {
            this.w(n);
        } else {
            switch (this.B) {
                case 0: {
                    this.N(n);
                    break;
                }
                case 1: {
                    this.O(n);
                    break;
                }
                case 2: {
                    this.P(n);
                }
            }
        }
    }

    void N(int n) {
        this.J(n);
        f f2 = h.kt();
        if (f2.z == this.z) {
            return;
        }
        if (h.H(this.z) == 0) {
            return;
        }
        if (0 != (f2.v & 3)) {
            return;
        }
        this.b(f2, 0x4B0000);
    }

    void O(int n) {
        if (null == this.C || 0 != (this.C.v & 3)) {
            this.W();
            return;
        }
        int n2 = this.b(this.C);
        this.x(n);
        switch (this.w) {
            case 0: 
            case 3: {
                this.p = 0;
                break;
            }
            case 1: {
                this.p = 0;
                if (n2 > this.A) {
                    this.f(2);
                    break;
                }
                if (this.x < 1000) break;
                f f2 = null;
                if (this.a(a, 0)) {
                    f2 = this.j(a[0], a[1]);
                }
                if (f2 != null) {
                    f2.j(this.C);
                }
                this.f(0);
                break;
            }
            case 2: {
                this.p = 0;
                if (n2 < this.A) {
                    this.f(1);
                    break;
                }
                int n3 = h.g(this.C.l[0] - this.l[0], this.C.l[1] - this.l[1]);
                if (Integer.MIN_VALUE == n3) break;
                this.p = Math.max(0x320000, h.c(this.C.o, 78643));
                this.p = Math.min(this.p, h.ga[this.g[6]][5]);
                this.i(n, n3);
            }
        }
        this.y(n);
    }

    void P(int n) {
        this.x(n);
        switch (this.w) {
            case 0: 
            case 1: 
            case 3: {
                this.p = 0;
                break;
            }
            case 2: {
                boolean bl = true;
                int n2 = 0;
                while ((bl = this.C.d(a)) && (n2 = h.a(this.l, a)) <= 0x280000) {
                    this.C.N();
                }
                if (!bl) {
                    this.p = 0;
                    break;
                }
                int n3 = n2 / 0x1E0000 + this.C.V;
                this.p = n3 <= 2 ? h.a(0, this.C.o, 0, 2, n3) : h.a(this.C.o, h.ga[this.g[6]][5], 2, 30, Math.min(n3, 30));
                int n4 = h.g(a[0] - this.l[0], a[1] - this.l[1]);
                if (Integer.MIN_VALUE == n4) break;
                this.i(n, n4);
            }
        }
        this.y(n);
    }

    void b(f f2, int n) {
        this.B = 1;
        this.C = f2;
        this.A = n;
        this.f(2);
    }

    void p(f f2) {
        this.v |= 0x10000;
        this.B = 2;
        this.C = f2;
        this.f(2);
        this.C.J();
    }

    void W() {
        if (2 == this.B && null != this.C) {
            this.C.K();
        }
        this.B = 0;
        this.C = null;
        this.v &= 0xFFFEFFFF;
    }

    f l(int n, int n2) {
        return null;
    }

    void q(f f2) {
        if (this.w == 3 || this.w == 0 || this.B == 1 || this.B == 2) {
            return;
        }
        this.b(f2, 0x4B0000);
    }

    void c(f f2, int n, int n2) {
        if (null == this.C) {
            return;
        }
        if (f2 != this.C) {
            return;
        }
        this.o = 0;
    }

    void X() {
        this.z = 5;
        this.V();
    }

    void Q(int n) {
        this.M(n);
    }

    void e(g g2) {
        this.d(g2);
        if (0 != (this.v & 2) || 1 != this.B) {
            return;
        }
        short[][] sArray = h.ae[31];
        h.a(g2, (int)sArray[h.a(this.l[3], sArray.length, false)][0], this.h, this.i);
    }

    f m(int n, int n2) {
        f f2 = h.uB(6);
        if (null != f2) {
            f2.a();
            f2.c(n, n2);
            f2.b(true);
            f2.f(0);
        }
        return f2;
    }

    void r(f f2) {
        if (0 != this.w && 50 > this.y * 100 / this.g[2]) {
            f f3 = null;
            if (this.a(a, 0)) {
                f3 = this.j(a[0], a[1]);
            }
            if (f3 != null) {
                f3.j(this.C);
            }
            this.f(0);
        } else {
            this.q(f2);
        }
    }

    void Y() {
        this.ah = h.a(2) == 0;
        this.f = this.C();
    }

    void f(g g2) {
        short[][] sArray = h.ae[this.g[1]];
        int n = h.a(this.l[3], sArray.length, false);
        h.a(g2, (int)sArray[n][0], this.h, this.i);
        this.Z();
        if (this.w != 0) {
            short[][] sArray2 = h.ae[this.ah ? 8 : 18];
            int n2 = h.r(sArray2[n][0]);
            h.l(n2, this.f);
            h.a(g2, (int)sArray2[n][0], this.h, this.i);
            h.l(n2, 0);
        }
    }

    f n(int n, int n2) {
        f f2 = null;
        for (int i = 0; i < h.eB.length; ++i) {
            f f3 = h.eB[i];
            if (f3.f() || (!this.ah || f3.e != 14) && (this.ah || f3.e != 15)) continue;
            f2 = f3;
            break;
        }
        if (f2 != null) {
            f2.a();
            f2.c(n, n2);
            f2.b(true);
            f2.f(2);
            f2.f = this.f;
        } else {
            h.a("Can't find bike's driver");
        }
        return f2;
    }

    void Z() {
        if (this.ah) {
            return;
        }
        short[][] sArray = h.ae[18];
        int n = h.r(sArray[0][0]);
        if (!h.m(n, this.f)) {
            this.ah = true;
        }
    }

    void aa() {
        this.b(false);
    }

    void ab() {
        if (this.x > 10000) {
            this.b(false);
            return;
        }
        if (null != F) {
            return;
        }
        if (this.b(h.eE) < this.g[4]) {
            this.b(false);
            switch (this.A) {
                case 0: {
                    h.C(15);
                    break;
                }
                case 1: {
                    h.C(30);
                    break;
                }
                case 2: {
                    h.C(35);
                    break;
                }
                case 3: {
                    h.s(h.cV[4][0], h.cV[4][5]);
                }
            }
        }
    }

    void g(g g2) {
        switch (this.A) {
            case 0: 
            case 1: 
            case 2: {
                h.a(g2, 993, this.h, this.i);
                break;
            }
            case 3: {
                h.a(g2, 1048, this.h, this.i);
            }
        }
    }

    static void a(int n, int n2, int n3) {
        f f2 = h.uB(13);
        if (f2 == null) {
            h.a("Can't find instance for pickup");
            return;
        }
        f2.b(true);
        f2.A = n;
        f2.x = 0;
        f2.d(n2, n3);
        f2.j = -2147483647;
    }

    void f(boolean bl) {
        ai = bl;
    }

    void ac() {
        boolean bl;
        boolean bl2 = bl = h.eE.s() && !ai;
        if (41 == this.e) {
            bl &= !this.ag();
        }
        if (aj != bl) {
            this.g(bl);
        }
        aj = bl;
        if (!bl) {
            this.A = 0;
            return;
        }
        int n = f.F.h - this.h;
        int n2 = f.F.i - this.i;
        int n3 = Math.max(Math.abs(n), Math.abs(n2));
        this.A = Math.max(0, 32 - n3);
        if (this.ae()) {
            switch (this.e) {
                case 25: {
                    h.cW = f.F.e;
                    h.cX = f.F.v;
                    h.cY = f.F.f;
                    h.a(this);
                    break;
                }
                case 41: {
                    h.b(this);
                }
            }
        }
    }

    void h(g g2) {
        h.a(g2, 1385, this.h, this.i - this.A);
    }

    void g(boolean bl) {
        int n = (this.h >> h.ee) / 3;
        int n2 = (this.i >> h.ee) / 3;
        for (int i = n - 1; i <= n + 1; ++i) {
            for (int j = n2 - 4; j <= n2 - 1; ++j) {
                h.ex[j * h.et + i] = bl ? (byte)0 : 1;
            }
        }
    }

    boolean ad() {
        return 0 == this.A;
    }

    boolean ae() {
        int n = f.F.h - this.h;
        int n2 = f.F.i - this.i;
        return 0 == this.A && Math.abs(n) < 32 && n2 < 0 && n2 >= -((4 << h.ee) * 3);
    }

    void af() {
        if (this.e == 41) {
            this.ac();
        }
        switch (this.w) {
            case 1: {
                if (this.x < 120000) break;
                this.f(0);
            }
        }
    }

    void i(g g2) {
        if (this.e == 41) {
            this.h(g2);
        }
        switch (this.w) {
            case 1: {
                h.a(g2, 1368, this.h, this.i);
            }
        }
    }

    boolean ag() {
        return this.w == 1;
    }

    static {
        M = 0;
        ag = 0;
        ai = false;
        aj = true;
    }
}
