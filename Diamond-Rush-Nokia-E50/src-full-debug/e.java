/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class e {
    public static int a = 7;
    public static Image[] a;
    public static a a;
    public static a b;
    public static String[] a;
    public static String[] b;
    public static int b;
    public static int c;
    public static int[] a;
    public static int d;
    public static int e;
    public static int[] b;
    public static int f;
    public static int g;
    public static boolean a;
    public static int h;
    public boolean b;
    public int i;

    public e() {
        a = false;
        if (a) {
            h = 4;
            a = 4;
        }
        a = new Image[h];
        a = new String[a];
    }

    private static void a(String string) {
        if (string == null) {
            return;
        }
        try {
            h.a.platformRequest(string);
            h.a.destroyApp(true);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void a() {
        int n;
        int n2;
        b = h.a[41];
        e.b.e = 1;
        a = h.a("/tips.f", 0);
        if (b == null) {
            n2 = 0;
            b = h.a("/lang_IGA.f", 21);
            e.b[8] = h.a(b[8], 170);
            e.b[9] = h.a(b[9], 170);
        }
        e = 0;
        a = new int[4];
        d = 0;
        if (!a) {
            n2 = 10;
            n = 0;
            while (n2 <= 16) {
                e.a[n] = h.a.getAppProperty(b[n2]);
                if (a[n] != null && (a[n].trim().toUpperCase().compareTo("NO") == 0 || a[n].compareTo("") == 0)) {
                    e.a[n] = null;
                }
                ++n2;
                ++n;
            }
            for (n2 = 0; n2 < 3; ++n2) {
                if (a[n2] != null && a[n2].trim().toUpperCase().compareTo("DEL") == 0) continue;
                if (a[n2] != null && (a[n2].trim().length() == 0 || a[n2].trim().toUpperCase().compareTo("NO") == 0)) {
                    e.a[n2] = null;
                }
                e.a[e.e] = n2;
                ++e;
            }
            n2 = 0;
            for (n = 3; n < 7; ++n) {
                if (a[n] == null || a[n].trim().toUpperCase().compareTo("DEL") == 0 || a[n].trim().toUpperCase().compareTo("NO") == 0 || a[n].trim().length() == 0) continue;
                n2 = 1;
                break;
            }
            if (n2 != 0) {
                e.a[e.e] = 3;
                ++e;
                g = 0;
                b = new int[4];
                for (n = 0; n < 4; ++n) {
                    if (a[n + 3] == null || a[n + 3].trim().toUpperCase().compareTo("DEL") == 0 || a[n + 3].trim().toUpperCase().compareTo("NO") == 0 || a[n + 3].trim().length() == 0) continue;
                    e.b[e.g] = n;
                    ++g;
                }
            }
        } else {
            n2 = 10;
            n = 0;
            while (n2 <= 12) {
                e.a[n] = h.a.getAppProperty(b[n2]);
                if (a[n] != null && (a[n].compareTo("no") == 0 || a[n].compareTo("") == 0)) {
                    e.a[n] = null;
                }
                ++n2;
                ++n;
            }
            e.a[3] = h.a.getAppProperty(b[16]);
            if (a[3] != null && (a[3].compareTo("no") == 0 || a[3].compareTo("") == 0)) {
                e.a[3] = null;
            }
            for (n2 = 0; n2 < 4; ++n2) {
                if (a[n2] != null && a[n2].trim().toUpperCase().compareTo("DEL") == 0) continue;
                if (a[n2] != null && (a[n2].trim().length() == 0 || a[n2].trim().toUpperCase().compareTo("NO") == 0)) {
                    e.a[n2] = null;
                }
                e.a[e.e] = n2;
                ++e;
            }
        }
        try {
            for (n2 = 0; n2 < h; ++n2) {
                e.a[n2] = Image.createImage("/ad" + (n2 + 1));
            }
        }
        catch (Exception exception) {}
        d = 0;
        f = 0;
        h.b(3);
    }

    private static void a(int n, int n2) {
        block6: {
            int n3;
            block8: {
                block7: {
                    int n4;
                    if ((d += n) >= e) {
                        n4 = 0;
                    } else if (d < 0) {
                        n4 = d = e - 1;
                    }
                    if (a || a[d] != 3 || n2 == 0) break block6;
                    if ((f += n2) < g) break block7;
                    n3 = 0;
                    break block8;
                }
                if (f >= 0) break block6;
                n3 = g - 1;
            }
            f = n3;
        }
    }

    private static void a(Graphics graphics, int n) {
        block11: {
            int n2;
            int n3;
            int n4;
            String string;
            block10: {
                int n5;
                int n6;
                block9: {
                    int n7;
                    int n8;
                    if (a[d] == 3 || a[a[d]] == null) break block9;
                    if (b % 30 < 15) {
                        return;
                    }
                    string = b[9];
                    b.a(string);
                    n4 = a.c + 2;
                    n3 = b.a(string);
                    if (n != 0) {
                        n8 = 320 + n >> 1;
                        n7 = (n3 >> 1) + 4;
                    } else {
                        n8 = 160;
                        n7 = n3 >> 1;
                    }
                    n2 = n8 - n7;
                    break block10;
                }
                if (!a || a[d] != 3 || a[a[d]] == null) break block11;
                if (b % 30 < 15) {
                    return;
                }
                string = b[9];
                b.a(string);
                n4 = a.c + 2;
                n3 = b.a(string);
                if (n != 0) {
                    n6 = 320 + n >> 1;
                    n5 = (n3 >> 1) + 4;
                } else {
                    n6 = 160;
                    n5 = n3 >> 1;
                }
                n2 = n6 - n5;
            }
            graphics.setClip(0, 0, 240, 320);
            graphics.setColor(0xFF0000);
            graphics.fillRect(120 - (n4 >> 1) - 4, n2 - 4, n4 + 8, n3 + 8);
            b.b(graphics, string, 120, n2, 1);
        }
    }

    private static void b(Graphics graphics) {
        int n = 99;
        int n2 = 189;
        graphics.setClip(0, 0, 240, 320);
        for (int i = 0; i < 16; ++i) {
            graphics.setColor(n << 16 | 0 | n2);
            graphics.fillRect(0, 160 + 160 * i / 16, 240, 21);
            graphics.fillRect(0, 160 - 160 * (i + 1) / 16, 240, 21);
            n -= 4;
            n2 -= 8;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void a(Graphics var1_1) {
        block27: {
            block24: {
                block29: {
                    block28: {
                        block26: {
                            block25: {
                                block23: {
                                    block21: {
                                        block22: {
                                            block20: {
                                                block19: {
                                                    e.b(var1_1);
                                                    var2_2 = 0;
                                                    switch (e.a[e.d]) {
                                                        case 3: {
                                                            if (e.a) ** GOTO lbl44
                                                            var1_1.drawImage(e.a[3], 120, 10, 17);
                                                            for (var3_3 = 0; var3_3 < e.g; ++var3_3) {
                                                                switch (e.b[var3_3]) {
                                                                    case 0: {
                                                                        var1_1.drawImage(e.a[4], 30, 80 + 50 * var3_3, 20);
                                                                        v0 = e.b;
                                                                        v1 = var1_1;
                                                                        v2 = e.b;
                                                                        v3 = 18;
                                                                        ** GOTO lbl36
                                                                    }
                                                                    case 1: {
                                                                        var1_1.drawImage(e.a[5], 30, 80 + 50 * var3_3, 20);
                                                                        v0 = e.b;
                                                                        v1 = var1_1;
                                                                        v2 = e.b;
                                                                        v3 = 17;
                                                                        ** GOTO lbl36
                                                                    }
                                                                    case 2: {
                                                                        var1_1.drawImage(e.a[6], 30, 80 + 50 * var3_3, 20);
                                                                        v0 = e.b;
                                                                        v1 = var1_1;
                                                                        v2 = e.b;
                                                                        v3 = 19;
                                                                        ** GOTO lbl36
                                                                    }
                                                                    case 3: {
                                                                        var1_1.drawImage(e.a[7], 30, 80 + 50 * var3_3, 20);
                                                                        v0 = e.b;
                                                                        v1 = var1_1;
                                                                        v2 = e.b;
                                                                        v3 = 20;
lbl36:
                                                                        // 4 sources

                                                                        v0.a(v1, v2[v3], 85, 80 + 50 * var3_3 + 25, 6);
                                                                    }
                                                                }
                                                            }
                                                            var2_2 = 160 + (a.d >> 1) + 4;
                                                            var3_3 = var1_1.getColor();
                                                            var1_1.setColor(255, 0, 0);
                                                            var1_1.drawRect(30, 80 + 50 * e.f, 180, 50);
                                                            var1_1.setColor(var3_3);
                                                            break block19;
lbl44:
                                                            // 1 sources

                                                            var1_1.drawImage(e.a[3], 120, 160, 3);
                                                            v4 = 60;
                                                            break;
                                                        }
                                                        default: {
                                                            var1_1.drawImage(e.a[e.a[e.d]], 120, 160, 3);
                                                            e.b.b(var1_1, e.b[e.a[e.d]], 120, 272, 17);
                                                            v4 = 0;
                                                        }
                                                    }
                                                    var2_2 = v4;
                                                }
                                                h.a.a();
                                                if (e.a) break block20;
                                                if (e.a[e.d] != 3 && e.a[e.a[e.d]] == null) break block21;
                                                v5 = h.a;
                                                break block22;
                                            }
                                            if (e.a[e.a[e.d]] == null) break block21;
                                            v5 = h.a;
                                        }
                                        v5.b();
                                    }
                                    e.a(var1_1, var2_2);
                                    if (!h.a(16388)) break block23;
                                    v6 = -1;
                                    v7 = 0;
                                    break block24;
                                }
                                if (!h.a(65544)) break block25;
                                v6 = 1;
                                v7 = 0;
                                break block24;
                            }
                            if (!h.a(32944)) break block26;
                            if (e.a[e.d] < 3) {
                                e.a(e.a[e.a[e.d]]);
                            } else {
                                e.a(e.a[3 + e.b[e.f]]);
                            }
                            break block27;
                        }
                        if (!h.a(64)) break block28;
                        h.a.a(0);
                        e.c = 2;
                        h.W = 0;
                        break block27;
                    }
                    if (!h.a(262146)) break block29;
                    v6 = 0;
                    v7 = 1;
                    break block24;
                }
                if (!h.a(4097)) break block27;
                v6 = 0;
                v7 = -1;
            }
            e.a(v6, v7);
        }
        e.a.a(var1_1, h.a(16388) != false ? 2 : 0, e.b % e.a.a(0), 15 + this.i, 160, 0, 0, 0);
        e.a.a(var1_1, h.a(65544) != false ? 3 : 1, e.b % e.a.a(1), 225 - this.i, 160, 0, 0, 0);
        this.i += this.b != false ? -1 : 1;
        if (this.i > 3 || this.i < 1) {
            this.b = this.b == false;
        }
        h.W = 0;
    }

    public static void b() {
        int n = 0;
        int n2 = a.length;
        for (n = 0; n < n2; ++n) {
            e.a[n] = null;
        }
        a = null;
        n2 = a.length;
        for (n = 0; n < n2; ++n) {
            e.a[n] = null;
        }
        a = null;
        n2 = b.length;
        for (n = 0; n < n2; ++n) {
            e.b[n] = null;
        }
        b = null;
        a = null;
        c = 0;
        System.gc();
    }

    static {
        d = 0;
        e = 4;
        f = 0;
        g = 4;
        a = false;
        h = 8;
    }
}
