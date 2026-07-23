/*
 * Decompiled with CFR 0.152.
 */
public final class a {
    public float a;
    public float b;
    public float c;

    public a() {
        this(0.0f, 0.0f, 0.0f);
    }

    public a(float f, float f2, float f3) {
        this.a(f, f2, f3);
    }

    public final void a() {
        this.a = -this.a;
        this.b = -this.b;
        this.c = -this.c;
    }

    public final boolean equals(Object object) {
        a a2 = (a)object;
        return a2.a == this.a && a2.b == this.b && a2.c == this.c;
    }

    private void a(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    private void b(float f, float f2, float f3) {
        this.a += f;
        this.b += f2;
        this.c += f3;
    }

    public final void a(a a2) {
        this.b(a2.a, a2.b, a2.c);
    }

    public final a b(a a2) {
        return new a(this.a - a2.a, this.b - a2.b, this.c - a2.c);
    }

    public final void a(float f) {
        this.a *= f;
        this.b *= f;
        this.c *= f;
    }

    public final a b(float f) {
        return new a(this.a * f, this.b * f, this.c * f);
    }

    private a c(float f) {
        this.a /= f;
        this.b /= f;
        this.c /= f;
        return this;
    }

    public final float b() {
        return (float)Math.sqrt(this.a * this.a + this.b * this.b + this.c * this.c);
    }

    public final void c() {
        this.c(this.b());
    }

    public static a c(a a2) {
        float f = a2.b();
        a2.a /= f;
        a2.b /= f;
        a2.c /= f;
        return a2;
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ", " + this.c + ")";
    }

    public final a d(a a2) {
        return new a(this.b * a2.c - this.c * a2.b, this.c * a2.a - this.a * a2.c, this.a * a2.b - this.b * a2.a);
    }
}
