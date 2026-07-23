/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class f {
    private static int[] a = new int[4096];
    private byte[] f;
    private byte[] g;
    private short[] b;
    public byte[] a;
    private byte[] h;
    public byte[] b;
    public short[] a;
    public byte[] c;
    private int[][] a;
    private int b;
    public int a;
    private boolean a;
    private short a;
    public byte[] d;
    private short[] c;
    public Image[][] a;
    public static byte[] e;

    public final void a(byte[] byArray, int n) {
        try {
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            System.gc();
            ++n;
            ++n;
            ++n;
            ++n;
            ++n;
            ++n;
            ++n;
            ++n;
            short s = (short)((byArray[6] & 0xFF) + ((byArray[7] & 0xFF) << 8));
            if (s > 0) {
                this.f = new byte[s << 1];
                System.arraycopy(byArray, 8, this.f, 0, this.f.length);
                n = 8 + this.f.length;
            }
            if ((n7 = (int)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8))) > 0) {
                this.h = new byte[n7 << 2];
                System.arraycopy(byArray, n, this.h, 0, this.h.length);
                n += this.h.length;
            }
            if ((n7 = (int)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8))) > 0) {
                this.g = new byte[n7];
                this.b = new short[n7];
                for (n6 = 0; n6 < n7; ++n6) {
                    this.g[n6] = byArray[n++];
                    int n8 = ++n;
                    int n9 = ++n;
                    ++n;
                    this.b[n6] = (short)((byArray[n8] & 0xFF) + ((byArray[n9] & 0xFF) << 8));
                }
                n6 = n7 << 2;
                this.a = new byte[n6];
                for (n7 = 0; n7 < n6; ++n7) {
                    this.a[n7] = byArray[n++];
                }
            }
            short s2 = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
            n6 = s2;
            if (s2 > 0) {
                this.c = new byte[n6 * 5];
                System.arraycopy(byArray, n, this.c, 0, this.c.length);
                n += this.c.length;
            }
            short s3 = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
            n7 = s3;
            if (s3 > 0) {
                this.b = new byte[n7];
                this.a = new short[n7];
                for (n6 = 0; n6 < n7; ++n6) {
                    this.b[n6] = byArray[n++];
                    int n10 = ++n;
                    int n11 = ++n;
                    ++n;
                    this.a[n6] = (short)((byArray[n10] & 0xFF) + ((byArray[n11] & 0xFF) << 8));
                }
            }
            if (s <= 0) {
                System.gc();
                return;
            }
            n6 = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
            this.b = byArray[n++] & 0xFF;
            n7 = byArray[n++] & 0xFF;
            this.a = new int[16][];
            block11: for (n5 = 0; n5 < this.b; ++n5) {
                this.a[n5] = new int[n7];
                switch (n6) {
                    case -30584: {
                        for (n4 = 0; n4 < n7; ++n4) {
                            if (((n3 = (byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8) + ((byArray[n++] & 0xFF) << 16) + ((byArray[n++] & 0xFF) << 24)) & 0xFF000000) != -16777216) {
                                this.a = true;
                            }
                            this.a[n5][n4] = n3;
                        }
                        continue block11;
                    }
                    case 17476: {
                        for (n4 = 0; n4 < n7; ++n4) {
                            if (((n3 = (byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8)) & 0xF000) != 61440) {
                                this.a = true;
                            }
                            this.a[n5][n4] = (n3 & 0xF000) << 16 | (n3 & 0xF000) << 12 | (n3 & 0xF00) << 12 | (n3 & 0xF00) << 8 | (n3 & 0xF0) << 8 | (n3 & 0xF0) << 4 | (n3 & 0xF) << 4 | n3 & 0xF;
                        }
                        continue block11;
                    }
                    case 21781: {
                        for (n4 = 0; n4 < n7; ++n4) {
                            n3 = (byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8);
                            n2 = -16777216;
                            if ((n3 & 0x8000) != 32768) {
                                n2 = 0;
                                this.a = true;
                            }
                            this.a[n5][n4] = n2 | (n3 & 0x7C00) << 9 | (n3 & 0x3E0) << 6 | (n3 & 0x1F) << 3;
                        }
                        continue block11;
                    }
                    case 25861: {
                        for (n4 = 0; n4 < n7; ++n4) {
                            n3 = (byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8);
                            n2 = -16777216;
                            if (n3 == 63519) {
                                n2 = 0;
                                this.a = true;
                            }
                            this.a[n5][n4] = n2 | (n3 & 0xF800) << 8 | (n3 & 0x7E0) << 5 | (n3 & 0x1F) << 3;
                        }
                        continue block11;
                    }
                }
            }
            this.a = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
            if (s > 0) {
                this.c = new short[s];
                n5 = 0;
                n4 = n;
                for (n3 = 0; n3 < s; ++n3) {
                    n2 = (short)((byArray[n4++] & 0xFF) + ((byArray[n4++] & 0xFF) << 8));
                    this.c[n3] = (short)n5;
                    n4 += n2;
                    n5 += n2;
                }
                this.d = new byte[n5];
                for (n3 = 0; n3 < s; ++n3) {
                    n2 = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
                    System.arraycopy(byArray, n, this.d, this.c[n3] & 0xFFFF, n2);
                    n += n2;
                }
            }
            System.gc();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public final void a(int n, int n2, int n3, int n4) {
        if (this.f == null) {
            return;
        }
        if (n3 == -1) {
            n3 = (this.f.length >> 1) - 1;
        }
        if (this.a == null) {
            this.a = new Image[this.b][];
        }
        if (this.a[n] == null) {
            this.a[n] = new Image[this.f.length >> 1];
        }
        n2 = this.a;
        this.a = n;
        System.gc();
        for (n4 = 0; n4 <= n3; ++n4) {
            int[] nArray;
            int n5 = n4 << 1;
            int n6 = this.f[n5] & 0xFF;
            n5 = this.f[n5 + 1] & 0xFF;
            if (n6 <= 0 || n5 <= 0 || (nArray = this.a(n4)) == null) continue;
            boolean bl = false;
            int n7 = n6 * n5;
            for (int i = 0; i < n7; ++i) {
                if ((nArray[i] & 0xFF000000) == -16777216) continue;
                bl = true;
                break;
            }
            this.a[n][n4] = Image.createRGBImage(nArray, n6, n5, bl);
        }
        System.gc();
        this.a = n2;
        System.gc();
    }

    public final void a(int n) {
        if (this.f == null) {
            return;
        }
        if (this.a == null) {
            return;
        }
        if (this.a[0] == null) {
            return;
        }
        for (n = 0; n < this.a[0].length; ++n) {
            this.a[0][n] = null;
        }
        this.a[0] = null;
        --this.b;
    }

    public final String toString() {
        new String();
        int n = 0;
        for (int i = 0; i < this.f.length / 2; ++i) {
            n += 2 * (this.f[i * 2] & 0xFF) * (this.f[i * 2 + 1] & 0xFF);
        }
        return "raw/full: " + this.d.length + "/" + n;
    }

    public final int a(int n, int n2) {
        return this.c[(this.a[n] + n2) * 5 + 1] & 0xFF;
    }

    public final int a(int n) {
        return this.b[n] & 0xFF;
    }

    public final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        n = (this.a[n] + n2) * 5;
        n2 = this.c[n] & 0xFF;
        if ((n5 & 0x20) != 0) {
            n6 = (n5 & 1) != 0 ? 0 + this.c[n + 2] : 0 - this.c[n + 2];
            n7 = (n5 & 2) != 0 ? 0 + this.c[n + 3] : 0 - this.c[n + 3];
        }
        this.a(graphics, n2, n3 - n6, n4 - n7, n5 ^ this.c[n + 4] & 0xF, n6, n7);
    }

    public final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = this.g[n] & 0xFF;
        for (int i = 0; i < n7; ++i) {
            int n8 = n6;
            int n9 = n5;
            int n10 = n4;
            int n11 = n3;
            int n12 = n2;
            int n13 = i;
            int n14 = n;
            Graphics graphics2 = graphics;
            f f2 = this;
            n14 = f2.b[n14] + n13 << 2;
            n13 = f2.h[n14 + 3] & 0xFF;
            int n15 = f2.h[n14] & 0xFF;
            n12 = (n10 & 1) != 0 ? n12 - f2.h[n14 + 1] : n12 + f2.h[n14 + 1];
            int n16 = n11 = (n10 & 2) != 0 ? n11 - f2.h[n14 + 2] : n11 + f2.h[n14 + 2];
            if ((n13 & 0x10) != 0) {
                f2.a(graphics2, n15, n12, n11, n10 ^ n13 & 0xF, n9, n8);
                continue;
            }
            if ((n10 & 1) != 0) {
                n12 -= f2.f[n15 << 1] & 0xFF;
            }
            if ((n10 & 2) != 0) {
                n11 -= f2.f[(n15 << 1) + 1] & 0xFF;
            }
            f2.a(graphics2, n15, n12, n11, n10 ^ n13 & 0xF);
        }
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
        int n11 = this.f[n10] & 0xFF;
        n10 = this.f[n10 + 1] & 0xFF;
        if (n11 <= 0 || n10 <= 0) {
            return;
        }
        Image image2 = null;
        if (this.a != null && this.a[this.a] != null) {
            image2 = this.a[this.a][n];
        }
        if (image2 == null) {
            int[] nArray = this.a(n);
            if (nArray == null) {
                return;
            }
            image2 = Image.createRGBImage(nArray, n11, n10, this.a);
        }
        n11 = image2.getWidth();
        n10 = image2.getHeight();
        if ((n4 & 1) != 0) {
            if ((n4 & 2) != 0) {
                graphics2 = graphics;
                image = image2;
                n9 = 0;
                n8 = 0;
                n7 = n11;
                n6 = n10;
                n5 = 3;
            } else {
                graphics2 = graphics;
                image = image2;
                n9 = 0;
                n8 = 0;
                n7 = n11;
                n6 = n10;
                n5 = 2;
            }
        } else if ((n4 & 2) != 0) {
            graphics2 = graphics;
            image = image2;
            n9 = 0;
            n8 = 0;
            n7 = n11;
            n6 = n10;
            n5 = 1;
        } else {
            graphics2 = graphics;
            image = image2;
            n9 = 0;
            n8 = 0;
            n7 = n11;
            n6 = n10;
            n5 = 0;
        }
        graphics2.drawRegion(image, n9, n8, n7, n6, n5, n2, n3, 0);
    }

    private int[] a(int n) {
        int[] nArray;
        block14: {
            int n2;
            byte[] byArray;
            int[] nArray2;
            int n3;
            int n4;
            block18: {
                block17: {
                    block16: {
                        block15: {
                            block13: {
                                if (this.d == null || this.c == null) {
                                    return null;
                                }
                                n4 = n << 1;
                                n3 = this.f[n4] & 0xFF;
                                n4 = this.f[n4 + 1] & 0xFF;
                                nArray = a;
                                nArray2 = this.a[this.a];
                                if (nArray2 == null) {
                                    return null;
                                }
                                byArray = this.d;
                                n = this.c[n] & 0xFFFF;
                                n2 = 0;
                                n4 = n3 * n4;
                                if (this.a != 10225) break block13;
                                while (n2 < n4) {
                                    int n5;
                                    if ((n5 = byArray[n++] & 0xFF) > 127) {
                                        n3 = byArray[n++] & 0xFF;
                                        n3 = nArray2[n3];
                                        n5 -= 128;
                                        while (n5-- > 0) {
                                            nArray[n2++] = n3;
                                        }
                                        continue;
                                    }
                                    nArray[n2++] = nArray2[n5];
                                }
                                break block14;
                            }
                            if (this.a != 5632) break block15;
                            while (n2 < n4) {
                                nArray[n2++] = nArray2[byArray[n] >> 4 & 0xF];
                                nArray[n2++] = nArray2[byArray[n] & 0xF];
                                ++n;
                            }
                            break block14;
                        }
                        if (this.a != 1024) break block16;
                        while (n2 < n4) {
                            nArray[n2++] = nArray2[byArray[n] >> 6 & 3];
                            nArray[n2++] = nArray2[byArray[n] >> 4 & 3];
                            nArray[n2++] = nArray2[byArray[n] >> 2 & 3];
                            nArray[n2++] = nArray2[byArray[n] & 3];
                            ++n;
                        }
                        break block14;
                    }
                    if (this.a != 512) break block17;
                    while (n2 < n4) {
                        nArray[n2++] = nArray2[byArray[n] >> 7 & 1];
                        nArray[n2++] = nArray2[byArray[n] >> 6 & 1];
                        nArray[n2++] = nArray2[byArray[n] >> 5 & 1];
                        nArray[n2++] = nArray2[byArray[n] >> 4 & 1];
                        nArray[n2++] = nArray2[byArray[n] >> 3 & 1];
                        nArray[n2++] = nArray2[byArray[n] >> 2 & 1];
                        nArray[n2++] = nArray2[byArray[n] >> 1 & 1];
                        nArray[n2++] = nArray2[byArray[n] & 1];
                        ++n;
                    }
                    break block14;
                }
                if (this.a != 22018) break block18;
                while (n2 < n4) {
                    nArray[n2++] = nArray2[byArray[n++] & 0xFF];
                }
                break block14;
            }
            if (this.a != 22258) break block14;
            while (n2 < n4) {
                int n6;
                if ((n6 = byArray[n++] & 0xFF) > 127) {
                    n6 -= 128;
                    while (n6-- > 0) {
                        nArray[n2++] = nArray2[byArray[n++] & 0xFF];
                    }
                    continue;
                }
                n3 = nArray2[byArray[n++] & 0xFF];
                while (n6-- > 0) {
                    nArray[n2++] = n3;
                }
            }
        }
        return nArray;
    }

    public final void a(boolean n) {
        int n2;
        this.f = null;
        this.g = null;
        this.b = null;
        this.a = null;
        this.h = null;
        this.b = null;
        this.a = null;
        this.c = null;
        if (this.a != null) {
            for (n2 = 0; n2 < this.a.length; ++n2) {
                this.a[n2] = null;
            }
            this.a = null;
        }
        this.d = null;
        this.c = null;
        if (n != 0 && this.a != null) {
            for (n2 = 0; n2 < this.a.length; ++n2) {
                if (this.a[n2] == null) continue;
                for (n = 0; n < this.a[n2].length; ++n) {
                    this.a[n2][n] = null;
                }
            }
            this.a = null;
        }
    }
}
