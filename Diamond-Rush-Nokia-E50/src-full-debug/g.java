/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class g {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public a a;
    public int f;
    public int g;
    public int h;
    public g a;

    public g() {
    }

    public g(a a2, int n, int n2, g g2) {
        this.a = n << 0;
        this.b = n2 << 0;
        this.a = a2;
        this.a = g2;
    }

    public final void a(int n) {
        if (n != this.f) {
            this.f = n;
            this.g = 0;
            this.h = 0;
            this.c = 0;
            this.d = 0;
        }
    }

    public final void a() {
        int n = (this.a.b[this.f] + this.g) * 5;
        this.c = (this.a.f[n + 2] << 0) * 1 / 1;
        if ((this.e & 1) != 0) {
            this.c = -this.c;
        }
        this.d = (this.a.f[n + 3] << 0) * 1 / 1;
        if ((this.e & 2) != 0) {
            this.d = -this.d;
        }
        this.a += this.c;
        this.b += this.d;
    }

    public final boolean a() {
        if (this.g != this.a.a(this.f) - 1) {
            return false;
        }
        int n = this.a.a(this.f, this.g);
        return n == 0 || this.h == n - 1;
    }

    public final void a(Graphics graphics) {
        g g2;
        if (this.a == null) {
            return;
        }
        int n = this.a;
        int n2 = this.b;
        g g3 = this;
        while ((g2 = g3.a) != null) {
            n += g2.a;
            n2 += g2.b;
            g3 = g2;
        }
        n = g.a(n) + 0;
        n2 = g.b(n2) + 0;
        if (this.h >= 0) {
            this.a.a(graphics, this.f, this.g, n, n2, this.e, 0, 0);
            return;
        }
        if (this.f >= 0) {
            this.a.a(graphics, this.f, n, n2, this.e);
            return;
        }
        if (this.g >= 0) {
            this.a.a(graphics, this.g, n, n2, this.e, 0, 0);
        }
    }

    public final void b() {
        if (this.a == null) {
            return;
        }
        if (this.h < 0) {
            return;
        }
        int n = this.a.a(this.f, this.g);
        if (n == 0) {
            return;
        }
        ++this.h;
        if (n > this.h) {
            return;
        }
        this.h = 0;
        ++this.g;
        if (this.g >= this.a.a(this.f)) {
            this.g = 0;
            this.c = 0;
            this.d = 0;
        }
    }

    private static int a(int n) {
        return (n >> 0) * 1 / 1;
    }

    private static int b(int n) {
        return (n >> 0) * 1 / 1;
    }
}
