/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class a {
    public static int[] a = new int[4096];
    public byte[] a;
    public byte[] b;
    public short[] a;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public short[] b;
    public byte[] f;
    public int[][] a;
    public int[][] b;
    public int a;
    public int b;
    public boolean a;
    public short a;
    public byte[] g;
    public short[] c;
    public Image[][] a;
    public static int c;
    public static int d;
    public static byte[] h;
    public int e = 0;
    public static int f;
    public static int g;

    public final void a(byte[] byArray, int n) {
        try {
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            short s;
            System.gc();
            ++n;
            ++n;
            boolean bl = false;
            ++n;
            ++n;
            ++n;
            int n10 = ++n;
            int n11 = ++n;
            ++n;
            short s2 = (short)((byArray[n10] & 0xFF) + ((byArray[n11] & 0xFF) << 8));
            if (s2 > 0) {
                this.a = new byte[s2 << 1];
                System.arraycopy(byArray, n, this.a, 0, this.a.length);
                n += this.a.length;
            }
            if ((s = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8))) > 0) {
                this.d = new byte[s << 2];
                System.arraycopy(byArray, n, this.d, 0, this.d.length);
                n += this.d.length;
            }
            if ((n9 = (int)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8))) > 0) {
                this.b = new byte[n9];
                this.a = new short[n9];
                for (n8 = 0; n8 < n9; ++n8) {
                    this.b[n8] = byArray[n++];
                    int n12 = ++n;
                    int n13 = ++n;
                    ++n;
                    this.a[n8] = (short)((byArray[n12] & 0xFF) + ((byArray[n13] & 0xFF) << 8));
                }
                n8 = n9 << 2;
                this.c = new byte[n8];
                for (n7 = 0; n7 < n8; ++n7) {
                    this.c[n7] = byArray[n++];
                }
            }
            short s3 = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
            n8 = s3;
            if (s3 > 0) {
                this.f = new byte[n8 * 5];
                System.arraycopy(byArray, n, this.f, 0, this.f.length);
                n += this.f.length;
            }
            short s4 = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
            n7 = s4;
            if (s4 > 0) {
                this.e = new byte[n7];
                this.b = new short[n7];
                for (n6 = 0; n6 < n7; ++n6) {
                    this.e[n6] = byArray[n++];
                    int n14 = ++n;
                    int n15 = ++n;
                    ++n;
                    this.b[n6] = (short)((byArray[n14] & 0xFF) + ((byArray[n15] & 0xFF) << 8));
                }
            }
            if (s2 <= 0) {
                System.gc();
                return;
            }
            n6 = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
            this.a = byArray[n++] & 0xFF;
            int n16 = byArray[n++] & 0xFF;
            this.b = new int[16][];
            block11: for (n5 = 0; n5 < this.a; ++n5) {
                this.b[n5] = new int[n16];
                switch (n6) {
                    case -30584: {
                        for (n4 = 0; n4 < n16; ++n4) {
                            n3 = byArray[n++] & 0xFF;
                            n3 += (byArray[n++] & 0xFF) << 8;
                            n3 += (byArray[n++] & 0xFF) << 16;
                            if (((n3 += (byArray[n++] & 0xFF) << 24) & 0xFF000000) != -16777216) {
                                this.a = true;
                            }
                            this.b[n5][n4] = n3;
                        }
                        continue block11;
                    }
                    case 17476: {
                        for (n4 = 0; n4 < n16; ++n4) {
                            n3 = byArray[n++] & 0xFF;
                            if (((n3 += (byArray[n++] & 0xFF) << 8) & 0xF000) != 61440) {
                                this.a = true;
                            }
                            this.b[n5][n4] = (n3 & 0xF000) << 16 | (n3 & 0xF000) << 12 | (n3 & 0xF00) << 12 | (n3 & 0xF00) << 8 | (n3 & 0xF0) << 8 | (n3 & 0xF0) << 4 | (n3 & 0xF) << 4 | n3 & 0xF;
                        }
                        continue block11;
                    }
                    case 21781: {
                        for (n4 = 0; n4 < n16; ++n4) {
                            n3 = byArray[n++] & 0xFF;
                            int n17 = n++;
                            n2 = -16777216;
                            if (((n3 += (byArray[n17] & 0xFF) << 8) & 0x8000) != 32768) {
                                n2 = 0;
                                this.a = true;
                            }
                            this.b[n5][n4] = n2 | (n3 & 0x7C00) << 9 | (n3 & 0x3E0) << 6 | (n3 & 0x1F) << 3;
                        }
                        continue block11;
                    }
                    case 25861: {
                        for (n4 = 0; n4 < n16; ++n4) {
                            n3 = byArray[n++] & 0xFF;
                            int n18 = n++;
                            n2 = -16777216;
                            if ((n3 += (byArray[n18] & 0xFF) << 8) == 63519) {
                                n2 = 0;
                                this.a = true;
                            }
                            this.b[n5][n4] = n2 | (n3 & 0xF800) << 8 | (n3 & 0x7E0) << 5 | (n3 & 0x1F) << 3;
                        }
                        continue block11;
                    }
                }
            }
            this.a = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
            if (s2 > 0) {
                this.c = new short[s2];
                n5 = 0;
                n4 = n;
                for (n3 = 0; n3 < s2; ++n3) {
                    n2 = (short)((byArray[n4++] & 0xFF) + ((byArray[n4++] & 0xFF) << 8));
                    this.c[n3] = (short)n5;
                    n4 += n2;
                    n5 += n2;
                }
                this.g = new byte[n5];
                for (n3 = 0; n3 < s2; ++n3) {
                    n2 = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
                    System.arraycopy(byArray, n, this.g, this.c[n3] & 0xFFFF, n2);
                    n += n2;
                }
            }
            System.gc();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public final void a(int n, int n2, int n3, int n4) {
        if (this.a == null) {
            return;
        }
        if (n3 == -1) {
            n3 = (this.a.length >> 1) - 1;
        }
        if (this.a == null) {
            this.a = new Image[this.a][];
        }
        if (this.a[n] == null) {
            this.a[n] = new Image[this.a.length >> 1];
        }
        if (n4 >= 0) {
            for (int i = n2; i <= n3; ++i) {
                this.a[n][i] = this.a[n4][i];
            }
        } else {
            int n5 = this.b;
            this.b = n;
            System.gc();
            for (int i = n2; i <= n3; ++i) {
                int[] nArray;
                int n6 = i << 1;
                int n7 = this.a[n6] & 0xFF;
                int n8 = this.a[n6 + 1] & 0xFF;
                if (n7 <= 0 || n8 <= 0 || (nArray = this.a(i)) == null) continue;
                boolean bl = false;
                int n9 = n7 * n8;
                for (int j = 0; j < n9; ++j) {
                    if ((nArray[j] & 0xFF000000) == -16777216) continue;
                    bl = true;
                    break;
                }
                this.a[n][i] = Image.createRGBImage(nArray, n7, n8, bl);
            }
            System.gc();
            this.b = n5;
        }
        System.gc();
    }

    public final void a(int n) {
        if (this.a == null) {
            return;
        }
        if (this.a == null) {
            return;
        }
        if (this.a[n] == null) {
            return;
        }
        for (int i = 0; i < this.a[n].length; ++i) {
            this.a[n][i] = null;
        }
        this.a[n] = null;
        --this.a;
    }

    public final String toString() {
        new String();
        String string = null;
        int n = 0;
        for (int i = 0; i < this.a.length / 2; ++i) {
            n += 2 * (this.a[2 * i] & 0xFF) * (this.a[2 * i + 1] & 0xFF);
        }
        string = "raw/full: " + this.g.length + "/" + n;
        return string;
    }

    public final int a(int n, int n2) {
        return this.f[(this.b[n] + n2) * 5 + 1] & 0xFF;
    }

    public final int a(int n) {
        return this.e[n] & 0xFF;
    }

    public final int b(int n) {
        return this.b[n] & 0xFF;
    }

    public final int a(String string) {
        int n = 1;
        int n2 = string.length();
        int n3 = string.indexOf(10);
        while (n3 != -1) {
            ++n;
            n3 = n3 < n2 - 1 ? string.indexOf(10, n3 + 1) : -1;
        }
        return this.e * (n - 1) + this.a[1] * n;
    }

    public final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = (this.b[n] + n2) * 5;
        int n9 = this.f[n8] & 0xFF;
        if ((n5 & 0x20) != 0) {
            n6 = (n5 & 1) != 0 ? n6 + this.f[n8 + 2] : n6 - this.f[n8 + 2];
            n7 = (n5 & 2) != 0 ? n7 + this.f[n8 + 3] : n7 - this.f[n8 + 3];
        }
        this.a(graphics, n9, n3 - n6, n4 - n7, n5 ^ this.f[n8 + 4] & 0xF, n6, n7);
    }

    public final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = this.b[n] & 0xFF;
        for (int i = 0; i < n7; ++i) {
            this.a(graphics, n, i, n2, n3, n4);
        }
    }

    public final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5) {
        int n6 = this.a[n] + n2 << 2;
        int n7 = this.d[n6 + 3] & 0xFF;
        int n8 = this.d[n6] & 0xFF;
        n3 = (n5 & 1) != 0 ? n3 - this.d[n6 + 1] : n3 + this.d[n6 + 1];
        int n9 = n4 = (n5 & 2) != 0 ? n4 - this.d[n6 + 2] : n4 + this.d[n6 + 2];
        if ((n5 & 1) != 0) {
            n3 -= this.a[n8 << 1] & 0xFF;
        }
        if ((n5 & 2) != 0) {
            n4 -= this.a[(n8 << 1) + 1] & 0xFF;
        }
        this.a(graphics, n8, n3, n4, n5 ^ n7 & 0xF);
    }

    public final void a(Graphics graphics, int n, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        Image image;
        Graphics graphics2;
        int n10 = n << 1;
        int n11 = this.a[n10] & 0xFF;
        int n12 = this.a[n10 + 1] & 0xFF;
        if (n11 <= 0 || n12 <= 0) {
            return;
        }
        Image image2 = null;
        if (this.a != null && this.a[this.b] != null) {
            image2 = this.a[this.b][n];
        }
        if (image2 == null) {
            int[] nArray = this.a(n);
            if (nArray == null) {
                return;
            }
            image2 = Image.createRGBImage(nArray, n11, n12, this.a);
        }
        n11 = image2.getWidth();
        n12 = image2.getHeight();
        if ((n4 & 1) != 0) {
            if ((n4 & 2) != 0) {
                graphics2 = graphics;
                image = image2;
                n9 = 0;
                n8 = 0;
                n7 = n11;
                n6 = n12;
                n5 = 3;
            } else {
                graphics2 = graphics;
                image = image2;
                n9 = 0;
                n8 = 0;
                n7 = n11;
                n6 = n12;
                n5 = 2;
            }
        } else if ((n4 & 2) != 0) {
            graphics2 = graphics;
            image = image2;
            n9 = 0;
            n8 = 0;
            n7 = n11;
            n6 = n12;
            n5 = 1;
        } else {
            graphics2 = graphics;
            image = image2;
            n9 = 0;
            n8 = 0;
            n7 = n11;
            n6 = n12;
            n5 = 0;
        }
        graphics2.drawRegion(image, n9, n8, n7, n6, n5, n2, n3, 0);
    }

    private int[] a(int n) {
        int[] nArray;
        block14: {
            int n2;
            int n3;
            int n4;
            byte[] byArray;
            int[] nArray2;
            block18: {
                block17: {
                    block16: {
                        block15: {
                            block13: {
                                if (this.g == null || this.c == null) {
                                    return null;
                                }
                                int n5 = n << 1;
                                int n6 = this.a[n5] & 0xFF;
                                int n7 = this.a[n5 + 1] & 0xFF;
                                nArray = a;
                                nArray2 = this.b[this.b];
                                if (nArray2 == null) {
                                    return null;
                                }
                                byArray = this.g;
                                n4 = this.c[n] & 0xFFFF;
                                n3 = 0;
                                n2 = n6 * n7;
                                if (this.a != 10225) break block13;
                                while (n3 < n2) {
                                    int n8;
                                    if ((n8 = byArray[n4++] & 0xFF) > 127) {
                                        int n9 = byArray[n4++] & 0xFF;
                                        int n10 = nArray2[n9];
                                        n8 -= 128;
                                        while (n8-- > 0) {
                                            nArray[n3++] = n10;
                                        }
                                        continue;
                                    }
                                    nArray[n3++] = nArray2[n8];
                                }
                                break block14;
                            }
                            if (this.a != 5632) break block15;
                            while (n3 < n2) {
                                nArray[n3++] = nArray2[byArray[n4] >> 4 & 0xF];
                                nArray[n3++] = nArray2[byArray[n4] & 0xF];
                                ++n4;
                            }
                            break block14;
                        }
                        if (this.a != 1024) break block16;
                        while (n3 < n2) {
                            nArray[n3++] = nArray2[byArray[n4] >> 6 & 3];
                            nArray[n3++] = nArray2[byArray[n4] >> 4 & 3];
                            nArray[n3++] = nArray2[byArray[n4] >> 2 & 3];
                            nArray[n3++] = nArray2[byArray[n4] & 3];
                            ++n4;
                        }
                        break block14;
                    }
                    if (this.a != 512) break block17;
                    while (n3 < n2) {
                        nArray[n3++] = nArray2[byArray[n4] >> 7 & 1];
                        nArray[n3++] = nArray2[byArray[n4] >> 6 & 1];
                        nArray[n3++] = nArray2[byArray[n4] >> 5 & 1];
                        nArray[n3++] = nArray2[byArray[n4] >> 4 & 1];
                        nArray[n3++] = nArray2[byArray[n4] >> 3 & 1];
                        nArray[n3++] = nArray2[byArray[n4] >> 2 & 1];
                        nArray[n3++] = nArray2[byArray[n4] >> 1 & 1];
                        nArray[n3++] = nArray2[byArray[n4] & 1];
                        ++n4;
                    }
                    break block14;
                }
                if (this.a != 22018) break block18;
                while (n3 < n2) {
                    nArray[n3++] = nArray2[byArray[n4++] & 0xFF];
                }
                break block14;
            }
            if (this.a != 22258) break block14;
            while (n3 < n2) {
                int n11;
                if ((n11 = byArray[n4++] & 0xFF) > 127) {
                    n11 -= 128;
                    while (n11-- > 0) {
                        nArray[n3++] = nArray2[byArray[n4++] & 0xFF];
                    }
                    continue;
                }
                int n12 = nArray2[byArray[n4++] & 0xFF];
                while (n11-- > 0) {
                    nArray[n3++] = n12;
                }
            }
        }
        return nArray;
    }

    /*
     * Unable to fully structure code
     */
    public final void a(String var1_1) {
        a.c = 0;
        a.d = this.a[1] & 255;
        var2_2 = 0;
        var3_3 = a.f >= 0 ? a.f : 0;
        var4_4 = a.g >= 0 ? a.g : var1_1.length();
        for (var5_5 = var3_3; var5_5 < var4_4; ++var5_5) {
            block10: {
                var6_6 = var1_1.charAt(var5_5);
                if (var6_6 <= 32) break block10;
                v0 = a.h[var6_6] & 255;
                ** GOTO lbl27
            }
            if (var6_6 == 32) {
                v1 = var2_2;
                v2 = this.a[0] & 255;
            } else {
                if (var6_6 == 10) {
                    if (var2_2 > a.c) {
                        a.c = var2_2;
                    }
                    var2_2 = 0;
                    a.d += this.e + (this.a[1] & 255);
                    continue;
                }
                if (var6_6 == 1) {
                    ++var5_5;
                    continue;
                }
                if (var6_6 != 2) continue;
                v0 = var6_6 = (int)var1_1.charAt(++var5_5);
lbl27:
                // 2 sources

                if (v0 >= this.b(0)) {
                    var7_7 = var6_6 - this.b(0);
                    v1 = var2_2;
                    v3 = this.c[(var7_7 << 2) + 2] & 255;
                    v4 = this.c[var7_7 << 2] & 255;
                } else {
                    var7_7 = (this.d[var6_6 << 2] & 255) << 1;
                    v1 = var2_2;
                    v3 = this.a[var7_7] & 255;
                    v4 = this.d[(var6_6 << 2) + 1];
                }
                v2 = v3 - v4;
            }
            var2_2 = v1 + (v2 + this.d[1]);
        }
        if (var2_2 > a.c) {
            a.c = var2_2;
        }
        if (a.c > 0) {
            a.c -= this.d[1];
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(Graphics graphics, String string, int n, int n2, int n3) {
        block13: {
            int n4;
            int n5;
            block18: {
                block17: {
                    block16: {
                        int n6;
                        int n7;
                        block15: {
                            block14: {
                                n2 -= this.d[2];
                                if ((n3 & 0x2B) == 0) break block13;
                                this.a(string);
                                if ((n3 & 8) == 0) break block14;
                                n7 = n;
                                n6 = c;
                                break block15;
                            }
                            if ((n3 & 1) == 0) break block16;
                            n7 = n;
                            n6 = c >> 1;
                        }
                        n = n7 - n6;
                    }
                    if ((n3 & 0x20) == 0) break block17;
                    n5 = n2;
                    n4 = d;
                    break block18;
                }
                if ((n3 & 2) == 0) break block13;
                n5 = n2;
                n4 = d >> 1;
            }
            n2 = n5 - n4;
        }
        int n8 = n;
        int n9 = n2;
        int n10 = this.b;
        int n11 = f >= 0 ? f : 0;
        int n12 = g >= 0 ? g : string.length();
        int n13 = n11;
        while (true) {
            block24: {
                int n14;
                int n15;
                block22: {
                    int n16;
                    int n17;
                    int n18;
                    int n19;
                    int n20;
                    block20: {
                        block25: {
                            block23: {
                                block21: {
                                    block19: {
                                        if (n13 >= n12) {
                                            this.b = n10;
                                            return;
                                        }
                                        n20 = string.charAt(n13);
                                        if (n20 <= 32) break block19;
                                        n19 = h[n20] & 0xFF;
                                        break block20;
                                    }
                                    if (n20 != 32) break block21;
                                    n15 = n8;
                                    n14 = this.a[0] & 0xFF;
                                    break block22;
                                }
                                if (n20 != 10) break block23;
                                n8 = n;
                                n9 += this.e + (this.a[1] & 0xFF);
                                break block24;
                            }
                            if (n20 != 1) break block25;
                            this.b = string.charAt(++n13);
                            break block24;
                        }
                        if (n20 != 2) break block24;
                        n19 = n20 = (int)string.charAt(++n13);
                    }
                    if (n19 >= this.b(0)) {
                        n18 = n20 - this.b(0);
                        this.a(graphics, n18, n8, n9, 0, 0, 0);
                        n15 = n8;
                        n17 = this.c[(n18 << 2) + 2] & 0xFF;
                        n16 = this.c[n18 << 2] & 0xFF;
                    } else {
                        n18 = (this.d[n20 << 2] & 0xFF) << 1;
                        this.a(graphics, 0, n20, n8, n9, 0);
                        n15 = n8;
                        n17 = this.a[n18] & 0xFF;
                        n16 = this.d[(n20 << 2) + 1];
                    }
                    n14 = n17 - n16;
                }
                n8 = n15 + (n14 + this.d[1]);
            }
            ++n13;
        }
    }

    public final void b(Graphics graphics, String string, int n, int n2, int n3) {
        int n4;
        int[] nArray;
        int n5;
        block6: {
            int n6;
            int n7;
            block5: {
                block4: {
                    n5 = 0;
                    int n8 = string.length();
                    nArray = new int[100];
                    for (n4 = 0; n4 < n8; ++n4) {
                        if (string.charAt(n4) != '\n') continue;
                        nArray[n5++] = n4;
                    }
                    nArray[n5++] = n8;
                    n4 = this.e + (this.a[1] & 0xFF);
                    if ((n3 & 0x20) == 0) break block4;
                    n7 = n2;
                    n6 = n4 * (n5 - 1);
                    break block5;
                }
                if ((n3 & 2) == 0) break block6;
                n7 = n2;
                n6 = n4 * (n5 - 1) >> 1;
            }
            n2 = n7 - n6;
        }
        for (int i = 0; i < n5; ++i) {
            f = i > 0 ? nArray[i - 1] + 1 : 0;
            g = nArray[i];
            this.a(graphics, string, n, n2 + i * n4, n3);
        }
        f = -1;
        g = -1;
    }

    public final void a(boolean bl) {
        int n;
        this.a = null;
        this.b = null;
        this.a = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.b = null;
        this.f = null;
        if (this.a != null) {
            for (n = 0; n < this.a.length; ++n) {
                this.a[n] = null;
            }
            this.a = null;
        }
        if (this.b != null) {
            for (n = 0; n < this.b.length; ++n) {
                this.b[n] = null;
            }
            this.b = null;
        }
        this.g = null;
        this.c = null;
        if (bl && this.a != null) {
            for (n = 0; n < this.a.length; ++n) {
                if (this.a[n] == null) continue;
                for (int i = 0; i < this.a[n].length; ++i) {
                    this.a[n][i] = null;
                }
            }
            this.a = null;
        }
    }

    static {
        f = -1;
        g = -1;
    }
}
