/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.m3g.Node;
import javax.microedition.m3g.Transform;

public class q {
    private Transform a = new Transform();
    public float[] h = new float[16];
    public Node i = null;
    public int j = 0;
    private int b;
    private int c;
    public boolean k;
    private boolean d;
    public int[][] l;
    public int m;
    public byte n;
    public int o;
    public boolean p;
    public int q = 5;

    public q(Node node) {
        this.i = node;
        this.h[0] = 1.0f;
        this.h[5] = 1.0f;
        this.h[10] = 1.0f;
        this.h[15] = 1.0f;
    }

    public final void e() {
        this.h[0] = 1.0f;
        this.h[5] = 1.0f;
        this.h[10] = 1.0f;
        this.h[1] = 0.0f;
        this.h[2] = 0.0f;
        this.h[4] = 0.0f;
        this.h[6] = 0.0f;
        this.h[8] = 0.0f;
        this.h[9] = 0.0f;
    }

    public final void b(float f) {
        if (this.k) {
            this.j = (int)((float)this.j + f);
            if (this.j >= this.c) {
                if (this.d) {
                    this.j = this.b;
                    return;
                }
                this.k = false;
                this.j = this.c;
            }
        }
        this.i.animate(this.j);
    }

    public final void a(int n, int n2) {
        this.j = n;
        this.b = n;
        this.c = n2;
    }

    public final void a(boolean bl) {
        this.k = true;
        this.d = bl;
    }

    public final boolean f() {
        return this.o <= this.q ? this.j > this.l[this.m][2] - 150 && this.j < this.l[this.m][3] : this.j > this.l[this.m][2] && this.j < this.l[this.m][3];
    }

    public final void a(int n) {
        this.m = n;
        this.a(this.l[this.m][0], this.l[this.m][1]);
        this.a(false);
    }

    public final void a(float f, float f2, float f3) {
        this.h[3] = f;
        this.h[7] = f2;
        this.h[11] = f3;
    }

    public void a() {
        try {
            this.a.set(this.h);
            this.i.animate(this.j);
            w.l.render(this.i, this.a);
            return;
        }
        catch (Exception exception) {
            System.out.println("Render Exception 111111" + exception);
            return;
        }
    }
}
