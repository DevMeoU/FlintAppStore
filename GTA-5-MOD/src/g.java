/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.lcdui.Graphics;

final class g {
    int a;
    int b;
    Graphics c;
    byte d;

    g(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    final void a(Graphics graphics) {
        this.c = graphics;
    }

    final void a() {
        this.c = null;
    }

    static final int a(int n, int n2, int n3) {
        return 0 | n << 16 | n2 << 8 | n3 << 0;
    }

    final void a(int n, int n2) {
        this.c.translate(n, n2);
    }

    final int b() {
        return this.c.getTranslateX();
    }

    final int c() {
        return this.c.getTranslateY();
    }

    final void a(int n, int n2, int n3, int n4) {
        this.c.setClip(n, n2, n3, n4);
    }

    final int d() {
        return this.c.getClipX();
    }

    final int e() {
        return this.c.getClipY();
    }

    final int f() {
        return this.c.getClipWidth();
    }

    final int g() {
        return this.c.getClipHeight();
    }

    final void a(int n) {
        this.c.setColor(n);
    }

    final void a(d d2, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, boolean bl2) {
        this.c.drawRegion(d2.a, n, n2, n3, n4, (bl ? 2 : 0) ^ (bl2 ? 1 : 0), n5, n6, 20);
    }

    final void b(int n, int n2, int n3, int n4) {
        this.c.drawLine(n, n2, n3, n4);
    }

    final void c(int n, int n2, int n3, int n4) {
        this.c.drawRect(n, n2, n3, n4);
    }

    final void d(int n, int n2, int n3, int n4) {
        this.c.fillRect(n, n2, n3, n4);
    }

    final void a(int n, int n2, int n3, int n4, int n5, int n6) {
        this.c.drawArc(n, n2, n3, n4, n5, n6);
    }

    final void b(int n, int n2, int n3, int n4, int n5, int n6) {
        this.c.fillArc(n, n2, n3, n4, n5, n6);
    }
}
