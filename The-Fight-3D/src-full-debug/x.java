/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.m3g.Camera;
import javax.microedition.m3g.Transform;

public final class x {
    public Camera a = new Camera();
    public static Transform b = null;
    private float[] c = null;

    public x() {
        b = new Transform();
        this.c = new float[16];
        this.c[15] = 1.0f;
        this.c[10] = 1.0f;
        this.c[5] = 1.0f;
        this.c[0] = 1.0f;
    }

    public final void a(float f, float f2, float f3) {
        this.c[3] = f;
        this.c[7] = f2;
        this.c[11] = f3;
    }

    public final void a(int n, float f) {
        this.c[n] = f;
        b.set(this.c);
        w.l.setCamera(this.a, b);
    }

    public final void b(float f, float f2, float f3) {
        float f4 = f - this.c[3];
        float f5 = f2 - this.c[7];
        float f6 = f3 - this.c[11];
        float f7 = 1.0f / (float)Math.sqrt(f4 * f4 + f5 * f5 + f6 * f6);
        a a2 = new a(0.0f, 1.0f, 0.0f);
        float f8 = (f5 *= f7) * a2.c - (f6 *= f7) * a2.b;
        float f9 = f6 * a2.a - (f4 *= f7) * a2.c;
        float f10 = f4 * a2.b - f5 * a2.a;
        this.c[1] = f9 * f6 - f10 * f5;
        this.c[5] = f10 * f4 - f8 * f6;
        this.c[9] = f8 * f5 - f9 * f4;
        this.c[0] = f8;
        this.c[4] = f9;
        this.c[8] = f10;
        this.c[2] = -f4;
        this.c[6] = -f5;
        this.c[10] = -f6;
        b.set(this.c);
        w.l.setCamera(this.a, b);
    }

    public final void a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10 = 1.0f / (float)Math.sqrt((f4 -= f) * f4 + (f5 -= f2) * f5 + (f6 -= f3) * f6);
        float f11 = (f5 *= f10) * f9 - (f6 *= f10) * f8;
        float f12 = f6 * f7 - (f4 *= f10) * f9;
        float f13 = f4 * f8 - f5 * f7;
        float f14 = 1.0f / (float)Math.sqrt(f11 * f11 + f12 * f12 + f13 * f13);
        f7 = (f12 *= f14) * f6 - (f13 *= f14) * f5;
        f8 = f13 * f4 - (f11 *= f14) * f6;
        f9 = f11 * f5 - f12 * f4;
        this.c[0] = f11;
        this.c[1] = f7;
        this.c[2] = -f4;
        this.c[3] = f;
        this.c[4] = f12;
        this.c[5] = f8;
        this.c[6] = -f5;
        this.c[7] = f2;
        this.c[8] = f13;
        this.c[9] = f9;
        this.c[10] = -f6;
        this.c[11] = f3;
        this.c[12] = 0.0f;
        this.c[13] = 0.0f;
        this.c[14] = 0.0f;
        this.c[15] = 1.0f;
        b.set(this.c);
        w.l.setCamera(this.a, b);
    }

    public final void c(float f, float f2, float f3) {
        this.a.setPerspective(f, (float)k.b / (float)k.c, f2, f3);
        this.b();
    }

    public final void d(float f, float f2, float f3) {
        this.c[3] = f;
        this.c[7] = f2;
        this.c[11] = f3;
    }

    public final void e(float f, float f2, float f3) {
        this.c[3] = this.c[3] + f;
        this.c[7] = this.c[7] + f2;
        this.c[11] = this.c[11] + f3;
        b.set(this.c);
        w.l.setCamera(this.a, b);
    }

    public final float a(int n) {
        return this.c[n];
    }

    private void b() {
        b.set(this.c);
        w.l.setCamera(this.a, b);
    }

    public final void a() {
        this.c[0] = 1.0f;
        this.c[5] = 1.0f;
        this.c[10] = 1.0f;
        this.c[1] = 0.0f;
        this.c[2] = 0.0f;
        this.c[4] = 0.0f;
        this.c[6] = 0.0f;
        this.c[8] = 0.0f;
        this.c[9] = 0.0f;
        b.set(this.c);
    }
}
