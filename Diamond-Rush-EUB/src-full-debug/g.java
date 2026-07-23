/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class g {
    public static byte[][] a;
    private static byte a;
    private static byte b;
    private static int b;
    private static byte c;
    private static byte d;
    private static boolean a;
    public static int a;

    public static void a(int n) {
        if ((a = (byte)(a + b)) > 24) {
            a = 0;
            for (n = 9; n >= 1; --n) {
                for (int i = 0; i < 15; ++i) {
                    g.a[i][n] = a[i][n - 1];
                }
            }
            g.b(3);
        }
    }

    public static void b(int n) {
        int n2;
        for (n2 = 0; n2 < 15; ++n2) {
            g.a[n2][0] = 0;
        }
        int n3 = 0;
        for (int i = 0; i < n; ++i) {
            while (a[n2 = e.a(0, 15)][0] != 0) {
            }
            n3 = e.a(1, 3);
            g.a[n2][0] = (byte)n3;
        }
    }

    public static void a(Graphics graphics) {
        for (int k = 0; k < 15; ++k) {
            for (int i2 = 0; i2 < 10; ++i2) {
                int n;
                Graphics graphics2;
                f f2;
                if (a[k][i2] == 1) {
                    f2 = i.a[i.a(2)];
                    graphics2 = graphics;
                    n = b;
                } else {
                    if (a[k][i2] != 2) continue;
                    f2 = i.a[i.a(2)];
                    graphics2 = graphics;
                    n = 0;
                }
                f2.a(graphics2, n, k * 24, (i2 - 1) * 24 + a, 0, 0, 0);
            }
        }
        b = (b + 1) % a;
    }

    static {
        a = 0;
        b = (byte)4;
        b = 0;
        c = 0;
        d = (byte)2;
        a = false;
        a = 0;
    }
}
