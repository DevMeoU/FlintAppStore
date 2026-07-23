/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.m3g.Node;
import javax.microedition.m3g.Transform;

public final class b {
    public static Transform a = new Transform();
    public float[] b = new float[16];
    public Node c = null;
    public int d = 0;

    public b(Node node) {
        this.c = node;
        this.b[0] = 1.0f;
        this.b[5] = 1.0f;
        this.b[10] = 1.0f;
        this.b[15] = 1.0f;
    }

    public b() {
        this.b[0] = 1.0f;
        this.b[5] = 1.0f;
        this.b[10] = 1.0f;
        this.b[15] = 1.0f;
    }

    public final void a() {
        try {
            a.set(this.b);
            w.l.render(this.c, a);
            return;
        }
        catch (Exception exception) {
            System.out.println("Render Exception " + exception);
            return;
        }
    }

    public final void a(float f, float f2, float f3) {
        float f4 = f - this.b[3];
        float f5 = f2 - this.b[7];
        float f6 = f3 - this.b[11];
        float f7 = 1.0f / (float)Math.sqrt(f4 * f4 + f5 * f5 + f6 * f6);
        float f8 = -(f6 *= f7);
        float f9 = f4 *= f7;
        this.b[1] = 0.0f * f6 - f9 * (f5 *= f7);
        this.b[5] = f9 * f4 - f8 * f6;
        this.b[9] = f8 * f5 - 0.0f * f4;
        this.b[0] = f8;
        this.b[4] = 0.0f;
        this.b[8] = f9;
        this.b[2] = -f4;
        this.b[6] = -f5;
        this.b[10] = -f6;
        a.set(this.b);
    }

    public final void b(float f, float f2, float f3) {
        this.b[0] = f;
        this.b[5] = f2;
        this.b[10] = f3;
    }

    public final void c(float f, float f2, float f3) {
        this.b[3] = f;
        this.b[7] = f2;
        this.b[11] = f3;
    }

    public final void b() {
        this.b[0] = 1.0f;
        this.b[5] = 1.0f;
        this.b[10] = 1.0f;
        this.b[1] = 0.0f;
        this.b[2] = 0.0f;
        this.b[4] = 0.0f;
        this.b[6] = 0.0f;
        this.b[8] = 0.0f;
        this.b[9] = 0.0f;
    }
}
