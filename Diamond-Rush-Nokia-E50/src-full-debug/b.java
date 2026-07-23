/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class b {
    public static byte[][] a;
    public static byte a;
    public static byte b;
    public static int a;
    public static byte[][] b;
    public static byte c;
    public static byte d;
    public static boolean a;
    public static int b;

    public static void a(int n) {
        int n2;
        int n3;
        if ((a = (byte)(a + b)) > 24) {
            a = 0;
            for (n3 = 12; n3 >= 1; --n3) {
                for (n2 = 0; n2 < 12; ++n2) {
                    b.a[n2][n3] = a[n2][n3 - 1];
                }
            }
            b.b(n);
        }
        if (a && (c = (byte)(c + d)) > 24) {
            c = 0;
            for (n3 = 12; n3 >= 1; --n3) {
                for (n2 = 0; n2 < 12; ++n2) {
                    b.b[n2][n3] = b[n2][n3 - 1];
                }
            }
            b.b(n);
        }
    }

    public static void b(int n) {
        int n2;
        int n3;
        for (n3 = 0; n3 < 12; ++n3) {
            b.a[n3][0] = 0;
        }
        if (a) {
            for (n3 = 0; n3 < 12; ++n3) {
                b.b[n3][0] = 0;
            }
        }
        int n4 = 0;
        for (n2 = 0; n2 < n; ++n2) {
            while (a[n3 = d.a(0, 12)][0] != 0) {
            }
            n4 = d.a(1, 3);
            b.a[n3][0] = (byte)n4;
        }
        if (a) {
            for (n2 = 0; n2 < n; ++n2) {
                while (b[n3 = d.a(0, 12)][0] != 0) {
                }
                n4 = d.a(1, 3);
                b.b[n3][0] = (byte)n4;
            }
        }
    }

    public static void a(Graphics graphics) {
        int n;
        int n2;
        for (n2 = 0; n2 < 12; ++n2) {
            for (n = 0; n < 13; ++n) {
                int n3;
                Graphics graphics2;
                a a2;
                if (a[n2][n] == 1) {
                    a2 = h.a[h.a(2)];
                    graphics2 = graphics;
                    n3 = a;
                } else {
                    if (a[n2][n] != 2) continue;
                    a2 = h.a[h.a(2)];
                    graphics2 = graphics;
                    n3 = 0;
                }
                a2.a(graphics2, n3, n2 * 24, (n - 1) * 24 + a, 0, 0, 0);
            }
        }
        if (a) {
            for (n2 = 0; n2 < 12; ++n2) {
                for (n = 0; n < 13; ++n) {
                    if (b[n2][n] != 1 && b[n2][n] != 2) continue;
                    h.a[h.a(2)].a(graphics, 0, n2 * 24, (n - 1) * 24 + c, 0, 0, 0);
                }
            }
        }
        a = (a + 1) % b;
    }

    static {
        a = 0;
        b = (byte)4;
        a = 0;
        c = 0;
        d = (byte)2;
        a = false;
        b = 0;
    }
}
