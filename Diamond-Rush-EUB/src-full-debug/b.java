/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class b {
    public int a;
    public int b;
    private int g;
    private int h;
    public int c;
    public f a;
    public int d;
    public int e;
    public int f;
    private b a;

    public b() {
    }

    public b(f f2, int n, int n2, b b2) {
        this.a = 0;
        this.b = 0;
        this.a = f2;
        this.a = null;
    }

    public final void a(int n) {
        if (n != this.d) {
            this.d = n;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
        }
    }

    public final void a() {
        int n = (this.a.a[this.d] + this.e) * 5;
        this.g = this.a.c[n + 2];
        if ((this.c & 1) != 0) {
            this.g = -this.g;
        }
        this.h = this.a.c[n + 3];
        if ((this.c & 2) != 0) {
            this.h = -this.h;
        }
        this.a += this.g;
        this.b += this.h;
    }

    public final boolean a() {
        if (this.e != this.a.a(this.d) - 1) {
            return false;
        }
        int n = this.a.a(this.d, this.e);
        return n == 0 || this.f == n - 1;
    }

    public final void a(Graphics graphics) {
        int n;
        b b2;
        if (this.a == null) {
            return;
        }
        int n2 = this.a;
        int n3 = this.b;
        b b3 = this;
        while ((b2 = b3.a) != null) {
            n2 += b2.a;
            n3 += b2.b;
            b3 = b2;
        }
        n2 = n = n2;
        n3 = n = n3;
        if (this.f >= 0) {
            this.a.a(graphics, this.d, this.e, n2, n3, this.c, 0, 0);
            return;
        }
        if (this.d >= 0) {
            this.a.a(graphics, this.d, n2, n3, this.c);
            return;
        }
        if (this.e >= 0) {
            this.a.a(graphics, this.e, n2, n3, this.c, 0, 0);
        }
    }

    public final void b() {
        if (this.a == null) {
            return;
        }
        if (this.f < 0) {
            return;
        }
        int n = this.a.a(this.d, this.e);
        if (n == 0) {
            return;
        }
        ++this.f;
        if (n > this.f) {
            return;
        }
        this.f = 0;
        ++this.e;
        if (this.e >= this.a.a(this.d)) {
            this.e = 0;
            this.g = 0;
            this.h = 0;
        }
    }
}
