/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class f {
    public Image a;
    private boolean a;
    private int d;
    private int e;
    public int a = false;
    public int b;
    private int f;
    private int g;
    public int c;

    public f(f f2, int n, int n2, int n3, int n4) {
        this.a = f2.a;
        this.a = n3;
        this.b = n4;
        this.d = n * n3 + f2.d;
        this.e = n2 * n4 + f2.e;
        this.a = true;
    }

    public f(f f2, int n) {
        this.a = f2.a;
        this.a = f2.a;
        this.b = f2.b;
        this.f = f2.f;
        this.g = f2.g;
        this.d = f2.d;
        this.e = f2.e;
        this.a = f2.a;
        this.c = n;
    }

    public f(String string) throws Exception {
        byte[] byArray = e.a(string + ".png");
        this.a = Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
        this.a = (short)this.a.getWidth();
        this.b = (short)this.a.getHeight();
        this.a = false;
    }

    public final void a(int n, int n2, int n3) {
        if (this.a) {
            return;
        }
        int n4 = n & 0xD;
        int n5 = n & 0x32;
        if (this.c == 1) {
            if ((n4 & 4) != 0) {
                n4 = 8;
            } else if ((n4 & 8) != 0) {
                n4 = 4;
            }
        } else if (this.c == 2) {
            if ((n5 & 0x10) != 0) {
                n4 = 32;
            } else if ((n4 & 0x20) != 0) {
                n4 = 16;
            }
        }
        n = n4 | n5;
        if ((n & 8) != 0) {
            this.f = n2 - this.a;
        } else if ((n & 1) != 0) {
            this.f = n2 - this.a >> 1;
        }
        if ((n & 0x20) != 0) {
            this.g = n3 - this.b;
            return;
        }
        if ((n & 2) != 0) {
            this.g = n3 - this.b >> 1;
        }
    }

    public final void a(int n, int n2) {
        this.f += n;
        this.g += n2;
    }

    public final void a(Graphics graphics, int n, int n2) {
        this.a(graphics, n, n2, 20);
    }

    public final void a(Graphics graphics, int n, int n2, int n3) {
        if (this.a) {
            if ((n3 & 8) != 0) {
                n -= this.a;
            } else if ((n3 & 1) != 0) {
                n -= this.a >> 1;
            }
            if ((n3 & 0x20) != 0) {
                n2 -= this.b;
            } else if ((n3 & 2) != 0) {
                n2 -= this.b >> 1;
            }
            int n4 = graphics.getClipX();
            int n5 = graphics.getClipY();
            int n6 = graphics.getClipWidth();
            int n7 = graphics.getClipHeight();
            int n8 = n + this.f;
            int n9 = n2 + this.g;
            graphics.clipRect(n8, n9, this.a, this.b);
            graphics.drawImage(this.a, n8 - this.d, n9 - this.e, 0);
            graphics.setClip(n4, n5, n6, n7);
            return;
        }
        graphics.drawImage(this.a, n + this.f, n2 + this.g, n3);
    }

    public f(String string, int n) {
        byte[] byArray = e.a(string + ".png");
        if (n != 1) {
            byte[] byArray2 = new byte[byArray.length];
            System.arraycopy(byArray, 0, byArray2, 0, byArray.length);
            f.a(byArray2, n);
            byArray = byArray2;
        }
        this.a = Image.createImage((byte[])byArray, (int)0, (int)byArray.length);
        this.a = this.a.getWidth();
        this.b = this.a.getHeight();
    }

    public static final void a(byte[] byArray, int n) {
        try {
            int n2;
            int n3;
            int n4 = 33;
            int n5 = byArray.length - 3;
            for (n3 = 0; n3 < n5; ++n3) {
                if (byArray[n3] != 80 || byArray[n3 + 1] != 76 || byArray[n3 + 2] != 84) continue;
                n4 = n3 - 4;
                break;
            }
            n3 = n4;
            n5 = ((byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF) & 0xFFFFFFFF;
            n3 += 4;
            int n6 = -1;
            for (int j = 0; j < 4; ++j) {
                n6 = f.a(byArray[n3 + j], n6);
            }
            boolean bl = false;
            boolean bl2 = false;
            for (n2 = n3 += 4; n2 < n3 + n5; n2 += 3) {
                block8: {
                    int n7;
                    int n8;
                    int n9;
                    block7: {
                        int n10;
                        n9 = byArray[n2] & 0xFF;
                        n8 = byArray[n2 + 1] & 0xFF;
                        n7 = byArray[n2 + 2] & 0xFF;
                        if (n != 0) break block7;
                        if (n9 == 244 && n8 == 244 && n7 == 230) break block8;
                        n9 = n10 = (n9 + n8 + n7) / 3;
                        n8 = n10;
                        n7 = n10;
                        byArray[n2] = (byte)n9;
                        byArray[n2 + 1] = (byte)n8;
                        byArray[n2 + 2] = (byte)n7;
                        break block8;
                    }
                    if (n != 1) {
                        int[][] nArray = i.a[1];
                        int[][] nArray2 = i.a[n];
                        for (int j = 0; j < nArray.length; ++j) {
                            if (nArray[j][0] != n9 || nArray[j][1] != n8 || nArray[j][2] != n7) continue;
                            byArray[n2] = (byte)nArray2[j][0];
                            byArray[n2 + 1] = (byte)nArray2[j][1];
                            byArray[n2 + 2] = (byte)nArray2[j][2];
                            break;
                        }
                    }
                }
                n6 = f.a(byArray[n2], n6);
                n6 = f.a(byArray[n2 + 1], n6);
                n6 = f.a(byArray[n2 + 2], n6);
            }
            n2 = n4 + 8 + n5;
            byArray[n2] = (byte)((n6 ^= 0xFFFFFFFF) >> 24);
            byArray[n2 + 1] = (byte)(n6 >> 16);
            byArray[n2 + 2] = (byte)(n6 >> 8);
            byArray[n2 + 3] = (byte)n6;
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public static final int a(byte by, int n) {
        int n2 = by & 0xFF;
        n ^= n2;
        for (int j = 0; j < 8; ++j) {
            if ((n & 1) != 0) {
                n = n >>> 1 ^ 0xEDB88320;
                continue;
            }
            n >>>= 1;
        }
        return n;
    }
}

