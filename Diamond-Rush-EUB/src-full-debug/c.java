/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class c {
    private static long a = 1000L;
    private static String a = "/demoSpr.bin";
    private static String b = "/demo.f";
    public static f[] a = null;
    public byte[][] a;
    private int a;
    private long b;
    public byte[] a;
    private int b;
    private boolean b = false;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = -1;
    public boolean a;
    private static i a = null;
    private short[] a = new short[16];
    private int h;

    public c(i i2) {
        a = i2;
    }

    /*
     * Unable to fully structure code
     */
    private void a(Graphics var1_5, byte[] var2_7, int var3_14) {
        if (var2_7 == null) {
            return;
        }
        var9_15 = var2_7[var3_14];
        switch (var9_15) {
            case 18: {
                if (var2_7[var3_14 + 7] == 0) break;
                var10_16 = (var2_7[var3_14 + 3] & 255) + ((var2_7[var3_14 + 3 + 1] & 255) << 8) + ((var2_7[var3_14 + 3 + 2] & 255) << 16);
                var1_5.setColor(var10_16);
                var1_5.fillRect(0, 0, 320, 240);
                return;
            }
            case 12: {
                var10_17 = this.b;
                var1_5.setColor(0xFFFFFF);
                if (var10_17 > 5) {
                    var10_17 = 5;
                }
                var2_8 = c.a.h * 24;
                var3_14 = c.a.i * 24;
                var4_21 = this.c;
                var5_27 = this.d;
                var1_5.fillRect(((var2_8 - c.a.a) * (5 - var10_17) + var4_21 * var10_17) / 5, ((var3_14 - c.a.b) * (5 - var10_17) + var5_27 * var10_17) / 5, var10_17 * 102 / 5, var10_17 * 38 / 5);
                return;
            }
            case 1: {
                var10_18 = this.b;
                var4_22 = (short)i.a(var2_7, var3_14 + 2);
                var5_28 = (short)i.a(var2_7, var3_14 + 4);
                var8_33 = (short)i.a(var2_7, var3_14 + 6);
                var6_36 = (short)i.a(var2_7, var3_14 + 8);
                var7_39 = (short)i.a(var2_7, var3_14 + 10);
                if (var6_36 == 10000) {
                    var6_36 = (short)c.a.c;
                }
                if (var7_39 == 10000) {
                    var7_39 = (short)c.a.d;
                }
                if (var10_18 > var8_33) {
                    var10_18 = var8_33;
                }
                var4_22 = (short)(var4_22 - 148);
                var5_28 = (short)(var5_28 - 77);
                c.a.c = (short)((var4_22 * var10_18 + var6_36 * (var8_33 - var10_18)) / var8_33);
                c.a.d = (short)((var5_28 * var10_18 + var7_39 * (var8_33 - var10_18)) / var8_33);
                var0_1 = c.a.e * 24 - 320;
                var1_6 = c.a.f * 24 - 240 + 62;
                if (c.a.c > var0_1) {
                    v0 = c.a;
                    v1 = var0_1;
                } else if (c.a.c < 0) {
                    v0 = c.a;
                    v1 = v0.c = 0;
                }
                if (c.a.d <= var1_6) ** GOTO lbl52
                v2 = c.a;
                v3 = var1_6;
                ** GOTO lbl55
lbl52:
                // 1 sources

                if (c.a.d >= 0) ** GOTO lbl56
                v2 = c.a;
                v3 = 0;
lbl55:
                // 2 sources

                v2.d = v3;
lbl56:
                // 2 sources

                c.a.a = c.a.c;
                c.a.b = c.a.d;
                if (c.a.a > var0_1) {
                    c.a.a -= var0_1;
                }
                if (c.a.b > var1_6) {
                    c.a.b = var1_6;
                    return;
                }
                if (c.a.b >= 0) break;
                return;
            }
            case 13: {
                var10_19 = this.b;
                var4_23 = (short)i.a(var2_7, var3_14 + 2);
                var5_29 = (short)i.a(var2_7, var3_14 + 4);
                var8_34 = (short)i.a(var2_7, var3_14 + 6);
                var6_37 = (short)i.a(var2_7, var3_14 + 8);
                var7_40 = (short)i.a(var2_7, var3_14 + 10);
                if (var10_19 > var8_34) {
                    var10_19 = var8_34;
                }
                var4_23 = (short)((var4_23 * var10_19 + var6_37 * (var8_34 - var10_19)) / var8_34);
                var5_29 = (short)((var5_29 * var10_19 + var7_40 * (var8_34 - var10_19)) / var8_34);
                if (var9_15 != 13) break;
                this.c = var4_23;
                this.d = var5_29;
                return;
            }
            case 4: {
                var10_20 = this.b;
                var6_38 = (short)i.a(var2_7, var3_14 + 2);
                var7_41 = (short)i.a(var2_7, var3_14 + 4);
                var4_24 = (short)i.a(var2_7, var3_14 + 6);
                var5_30 = (short)i.a(var2_7, var3_14 + 6);
                var8_35 = (short)i.a(var2_7, var3_14 + 14);
                if (var10_20 > var8_35) {
                    var10_20 = var8_35;
                }
                var0_2 = (short)((var4_24 * var10_20 + var6_38 * (var8_35 - var10_20)) / var8_35);
                var4_24 = (short)((var5_30 * var10_20 + var7_41 * (var8_35 - var10_20)) / var8_35);
                var5_30 = (short)i.a(var2_7, var3_14 + 10);
                var2_9 = (short)i.a(var2_7, var3_14 + 12);
                c.a[var5_30].a(var1_5, var2_9, var0_2, var4_24, 0, 0, 0);
                return;
            }
            case 27: {
                var0_3 = i.a.a.stringWidth(i.a[30]) + 10;
                var4_25 = i.a.a.getHeight() + 4;
                var5_31 = null;
                try {
                    var5_31 = new String(var2_7, var3_14 + 8, (int)((short)i.a(var2_7, var3_14 + 2)), "ISO-8859-1");
                }
                catch (Exception v4) {}
                if (var5_31 != null) {
                    try {
                        var2_10 = Integer.parseInt(var5_31.trim());
                        var5_31 = i.b[var2_10];
                    }
                    catch (Exception v5) {}
                }
                var2_11 = c.a(var5_31, 300).length * i.a.a.getHeight() + 6;
                i.a(var1_5, 6, 126, 306, var2_11, 73, 1, var0_3, var4_25);
                c.a(var1_5, var5_31, 8, 139, 300);
                i.a.b(var1_5, i.a[30], 19, 129, 20);
                if (i.g / 2 % 4 >= 2) break;
                var1_5.drawImage(i.a[0][9], 303, 126, 17);
                return;
            }
            case 2: {
                var4_26 = (short)i.a(var2_7, var3_14 + 6);
                var0_4 = i.a(var2_7, var3_14 + 4);
                if (var0_4 == 10000) {
                    var0_4 = -320;
                }
                var5_32 = null;
                try {
                    var5_32 = new String(var2_7, var3_14 + 11, (int)((short)i.a(var2_7, var3_14 + 2)), "ISO-8859-1");
                }
                catch (Exception v6) {}
                if (var5_32 != null) {
                    try {
                        var2_12 = Integer.parseInt(var5_32.trim());
                        var5_32 = i.b[var2_12];
                    }
                    catch (Exception v7) {}
                }
                var2_13 = c.a(var5_32, 302).length * i.a.a.getHeight() + 2;
                i.a(var1_5, var0_4, var4_26 - 11, 306, var2_13, 73, 0);
                c.a(var1_5, var5_32, var0_4 + 2, var4_26 + 2, 302);
                if (i.g / 2 % 4 < 2) {
                    var1_5.drawImage(i.a[0][9], var0_4 + 306 - 10, var4_26 + var2_13 + 2, 17);
                }
                var1_5.setClip(0, 0, 320, 240);
            }
        }
    }

    private void a(byte[] byArray, int n) {
        switch ((short)byArray[n]) {
            case 7: {
                byArray[n + 1] = 1;
                return;
            }
            case 27: {
                if (i.a) {
                    return;
                }
                String string = null;
                try {
                    string = new String(byArray, n + 8, (int)((short)i.a(byArray, n + 2)), "ISO-8859-1");
                }
                catch (Exception exception) {}
                this.a(string, 276);
                short s = (short)(byArray[n + 6] & 0xFF);
                short s2 = (short)(byArray[n + 8] & 0xFF);
                if (s + s2 >= this.h) {
                    byArray[n + 7] = 1;
                    return;
                }
                byArray[n + 6] = (byte)(s + s2);
                return;
            }
            case 2: {
                byte by;
                int n2;
                byte[] byArray2;
                String string = null;
                try {
                    string = new String(byArray, n + 11, (int)((short)i.a(byArray, n + 2)), "ISO-8859-1");
                }
                catch (Exception exception) {}
                this.a(string, 302);
                short s = (short)(byArray[n + 9] & 0xFF);
                short s3 = (short)(byArray[n + 8] & 0xFF);
                if (s + s3 >= this.h) {
                    byArray2 = byArray;
                    n2 = n + 10;
                    by = 1;
                } else {
                    byArray2 = byArray;
                    n2 = n + 9;
                    by = (byte)(s + s3);
                }
                byArray2[n2] = by;
            }
        }
    }

    public final void a() {
        if (this.a == null) {
            return;
        }
        if (Math.abs(this.b - System.currentTimeMillis()) < a) {
            return;
        }
        if (this.a[0] == 0) {
            int n = this.a[1];
            int n2 = 2 + (n << 2);
            for (int k = 0; k < n; ++k) {
                int n3 = i.b(this.a, 2 + (k << 2));
                this.a(this.a, n2);
                n2 += n3;
            }
        } else {
            this.a(this.a, 0);
        }
    }

    public final void a(Graphics graphics) {
        if (this.a) {
            return;
        }
        c c2 = this;
        switch (c2.a == null ? -1 : c2.a[0]) {
            case 25: 
            case 26: {
                if (this.a != null && this.a < this.a.length) break;
                return;
            }
            default: {
                graphics.setColor(0);
                graphics.fillRect(0, 0, 320, 31);
                graphics.fillRect(0, 209, 320, 31);
                i.a.b(graphics, i.a[65], 2, 240 - (i.a.a.getHeight() - 10), 36);
            }
        }
        if (this.a[0] == 0) {
            int n = this.a[1];
            int n2 = 2 + (n << 2);
            for (int k = 0; k < n; ++k) {
                int n3 = i.b(this.a, 2 + (k << 2));
                this.a(graphics, this.a, n2);
                n2 += n3;
            }
        } else {
            this.a(graphics, this.a, 0);
        }
        if (this.b) {
            graphics.setColor(0);
            graphics.fillRect(this.c - 3, this.d - 3, 109, 45);
            a[this.f].a(graphics, 0, this.b % a[this.f].a(0), this.c, this.d, 0, 0, 0);
            a[0].a(graphics, this.e, this.c, this.d, 0, 0, 0);
            if (this.g >= 0) {
                if (i.b && this.g == 2) {
                    this.g = 7;
                }
                if (i.b && this.g == 6) {
                    this.g = 8;
                }
                a[1].a(graphics, this.g, this.c + 90, this.d + -6, 0, 0, 0);
            }
        }
    }

    public final byte[] a() {
        byte[][] byArray = this.a;
        c c2 = this;
        for (int k = 0; k < byArray.length; ++k) {
            c2.b(byArray[k], 0);
        }
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = -1;
        this.a = false;
        this.a = 0;
        this.b = System.currentTimeMillis();
        return this.b();
    }

    /*
     * Unable to fully structure code
     */
    private void b(byte[] var1_1, int var2_2) {
        block5: {
            if (var1_1[var2_2] == 0) break block5;
            var1_1[var2_2 + 1] = 0;
            switch (var1_1[var2_2]) {
                case 27: {
                    var1_1[var2_2 + 6] = 0;
                    c.a(var1_1, var2_2 + 4, (short)-320);
                    v0 = var1_1;
                    v1 = var2_2;
                    v2 = 7;
                    ** GOTO lbl17
                }
                case 2: {
                    var1_1[var2_2 + 9] = 0;
                    c.a(var1_1, var2_2 + 4, (short)-320);
                    v0 = var1_1;
                    v1 = var2_2;
                    v2 = 10;
lbl17:
                    // 2 sources

                    v0[v1 + v2] = 0;
                }
            }
            return;
        }
        var3_3 = var1_1[var2_2 + 1];
        var4_4 = var2_2 + 2 + (var3_3 << 2);
        for (var5_5 = 0; var5_5 < var3_3; ++var5_5) {
            var6_6 = i.b(var1_1, var2_2 + 2 + (var5_5 << 2));
            this.b(var1_1, var4_4);
            var4_4 += var6_6;
        }
    }

    public final byte[] b() {
        byte[] byArray;
        c c2;
        this.b = 0;
        if (this.a == null || this.a >= this.a.length) {
            c2 = this;
            byArray = null;
        } else {
            c2 = this;
            byArray = this.a[this.a++];
        }
        c2.a = byArray;
        return this.a;
    }

    public final void b() {
        if (this.a[0] == 0) {
            int n = this.a[1];
            int n2 = 2 + (n << 2);
            for (int k = 0; k < n; ++k) {
                int n3 = i.b(this.a, 2 + (k << 2));
                this.c(this.a, n2);
                n2 += n3;
            }
        } else {
            this.c(this.a, 0);
        }
        ++this.b;
    }

    private void c(byte[] byArray, int n) {
        short s = byArray[n];
        if (this.a) {
            switch (s) {
                case 5: 
                case 9: 
                case 10: 
                case 25: 
                case 26: {
                    break;
                }
                default: {
                    byArray[n + 1] = 1;
                    return;
                }
            }
        }
        switch (s) {
            case 16: 
            case 17: 
            case 18: {
                boolean bl;
                if (this.b % 2 == 0) {
                    return;
                }
                int n2 = n + (s == 18 ? 2 : 4);
                byte by = byArray[n2];
                int n3 = -1;
                int n4 = n + (s == 18 ? 7 : 5);
                boolean bl2 = bl = byArray[n4] != 0;
                if (s != 18) {
                    n3 = (short)i.a(byArray, n + 2);
                }
                if (bl) {
                    bl = false;
                    this.g = -1;
                    if ((by = (byte)(by - 1)) == 0) {
                        byArray[n + 1] = 1;
                        if (s != 18) {
                            this.g = s == 16 ? n3 : -1;
                        }
                    }
                } else if (by > 0) {
                    bl = true;
                    if (s != 18) {
                        this.g = n3;
                    }
                } else {
                    byArray[n + 1] = 1;
                }
                byArray[n4] = (byte)(bl ? 1 : 0);
                byArray[n2] = by;
                return;
            }
            case 14: 
            case 15: {
                this.b = s == 14;
                byArray[n + 1] = 1;
                return;
            }
            case 12: {
                s = (short)i.a(byArray, n + 2);
                short s2 = (short)i.a(byArray, n + 4);
                this.c = s;
                this.d = s2;
                if (this.b <= 5) break;
                byArray[n + 1] = 1;
                this.b = true;
                return;
            }
            case 11: {
                this.f = (short)i.a(byArray, n + 4);
                this.e = (short)i.a(byArray, n + 2);
                byArray[n + 1] = 1;
                return;
            }
            case 10: {
                s = byArray[n + 2];
                if (this.b == 0) {
                    c.a.k = c.a.k & 0xFFFFFFF8 | s;
                    c.a.a = (byte)s;
                } else if (c.a.j <= 0) {
                    c.a.a = 0;
                    byArray[n + 1] = 1;
                }
                a.a();
                return;
            }
            case 13: {
                if ((short)i.a(byArray, n + 8) == 10000) {
                    c.a(byArray, n + 8, (short)this.c);
                }
                if ((short)i.a(byArray, n + 10) == 10000) {
                    c.a(byArray, n + 10, (short)this.d);
                }
                if (this.b <= (s = (short)((short)i.a(byArray, n + 6)))) break;
                byArray[n + 1] = 1;
                return;
            }
            case 1: {
                if ((short)i.a(byArray, n + 8) == 10000) {
                    c.a(byArray, n + 8, (short)c.a.c);
                }
                if ((short)i.a(byArray, n + 10) == 10000) {
                    c.a(byArray, n + 10, (short)c.a.d);
                }
                if (this.b <= (s = (short)((short)i.a(byArray, n + 6)))) break;
                byArray[n + 1] = 1;
                return;
            }
            case 4: {
                s = (short)i.a(byArray, n + 14);
                if (this.b <= s) break;
                byArray[n + 1] = 1;
                return;
            }
            case 6: {
                if (this.b <= i.b(byArray, n + 2)) break;
                byArray[n + 1] = 1;
                return;
            }
            case 25: {
                s = (short)i.a(byArray, n + 2);
                short s3 = (short)i.a(byArray, n + 4);
                byte by = byArray[n + 6];
                byte by2 = byArray[n + 7];
                i.a[s][s3] = by2 << 8 | by;
                byArray[n + 1] = 1;
                return;
            }
            case 26: {
                int n5;
                s = (short)i.a(byArray, n + 2);
                short s4 = (short)i.a(byArray, n + 4);
                i.b[s][s4] = n5 = i.b(byArray, n + 6);
                byArray[n + 1] = 1;
                return;
            }
            case 5: {
                i.a((short)i.a(byArray, n + 2), (short)i.a(byArray, n + 4), byArray[n + 6], 0);
                byArray[n + 1] = 1;
                return;
            }
            case 8: {
                return;
            }
            case 9: {
                i.a((short)i.a(byArray, n + 2), (short)i.a(byArray, n + 4), (byte)0, (int)((short)i.a(byArray, n + 6)));
                byArray[n + 1] = 1;
                return;
            }
            case 27: {
                if (byArray[n + 7] == 0) break;
                byArray[n + 1] = 1;
                return;
            }
            case 2: {
                s = (short)i.a(byArray, n + 4);
                if (s == 10000) {
                    s = -306;
                }
                s = (short)(s + 30);
                if (byArray[n + 10] == 0) {
                    if (s > 7) {
                        s = 7;
                    }
                } else if (s > 320) {
                    byArray[n + 1] = 1;
                }
                c.a(byArray, n + 4, s);
            }
        }
    }

    public final boolean a() {
        boolean bl = true;
        if (this.a[0] == 0) {
            int n = this.a[1];
            int n2 = 2 + (n << 2);
            for (int k = 0; k < n; ++k) {
                int n3 = i.b(this.a, 2 + (k << 2));
                if (bl = bl && this.a[n2 + 1] == 1) {
                    n2 += n3;
                    continue;
                }
                break;
            }
        } else {
            bl = this.a[1] == 1;
        }
        return bl;
    }

    public final void a(int n) {
        try {
            a.getClass();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(i.a(b, 0));
            byte[] byArray = new byte[4];
            byteArrayInputStream.read(byArray, 0, 2);
            boolean bl = false;
            do {
                int n2;
                byteArrayInputStream.read(byArray, 0, 2);
                if ((short)i.a(byArray, 0) == n) {
                    int n3;
                    short s;
                    int n4;
                    int n5;
                    int n6;
                    Object object;
                    int n7;
                    int n8;
                    Object object2;
                    byteArrayInputStream.read(byArray, 0, 2);
                    n2 = i.a(byArray, 0);
                    byteArrayInputStream.read(byArray, 0, 4);
                    byArray = new byte[i.b(byArray, 0)];
                    byteArrayInputStream.read(byArray);
                    byteArrayInputStream.close();
                    byteArrayInputStream = null;
                    bl = true;
                    int n9 = 0;
                    int n10 = i.a(byArray, 0);
                    n9 += 2;
                    if (n10 != 0) {
                        object2 = new short[n10];
                        for (n8 = 0; n8 < n10; ++n8) {
                            object2[n8] = (short)i.a(byArray, n9);
                            n9 += 2;
                        }
                        for (n7 = 1; n7 < n10; ++n7) {
                            int n11;
                            n8 = object2[n7];
                            int n12 = n11 = n7;
                            while (n12 > 0 && object2[n11 - 1] > n8) {
                                object2[n11] = object2[n11 - 1];
                                n12 = n11 - 1;
                            }
                            object2[n11] = n8;
                        }
                        InputStream inputStream = this.getClass().getResourceAsStream(a);
                        object = new byte[4];
                        inputStream.read((byte[])object, 0, 2);
                        n6 = (short)i.a((byte[])object, 0);
                        if (a == null) {
                            a = new f[n6];
                        }
                        for (n5 = 0; n5 < n10; ++n5) {
                            n4 = object2[n5];
                            boolean bl2 = false;
                            while (!bl2) {
                                inputStream.read((byte[])object, 0, 2);
                                s = (short)i.a((byte[])object, 0);
                                if (n4 == s) {
                                    bl2 = true;
                                }
                                inputStream.read((byte[])object, 0, 4);
                                n3 = i.b((byte[])object, 0);
                                if (!bl2 && a[n4] != null) {
                                    inputStream.skip(n3);
                                    continue;
                                }
                                object = new byte[n3];
                                inputStream.read((byte[])object);
                                c.a[n4] = new f();
                                a[n4].a((byte[])object, 0);
                                a[n4].a(0, 0, -1, -1);
                                c.a[n4].d = null;
                            }
                        }
                        inputStream.close();
                    }
                    object2 = new byte[n2][];
                    n8 = 0;
                    byte[][] byArrayArray = null;
                    n7 = 0;
                    n6 = 0;
                    for (n5 = 0; n5 < n2 || n6 != 0; ++n5) {
                        if (n6 == 0) {
                            object = object2;
                        } else {
                            object = byArrayArray;
                            --n6;
                            --n5;
                        }
                        n4 = byArray[n9++] & 0xFF;
                        byte[] byArray2 = null;
                        switch (n4) {
                            case 18: {
                                s = (short)(byArray[n9++] & 0xFF);
                                n3 = (byArray[n9++] & 0xFF) + ((byArray[n9++] & 0xFF) << 8) + ((byArray[n9++] & 0xFF) << 16);
                                byArray2 = new byte[8];
                                c.a(byArray2, 2, s);
                                c.a(byArray2, 3, n3);
                                byArray2[7] = 0;
                                break;
                            }
                            case 16: 
                            case 17: {
                                n10 = (short)i.a(byArray, n9);
                                n9 += 2;
                                s = (short)(byArray[n9++] & 0xFF);
                                byArray2 = new byte[6];
                                c.a(byArray2, 2, (short)n10);
                                c.a(byArray2, 4, s);
                                byArray2[5] = 0;
                                break;
                            }
                            case 11: {
                                n10 = (short)i.a(byArray, n9);
                                s = (short)i.a(byArray, n9 += 2);
                                n9 += 2;
                                byArray2 = new byte[6];
                                c.a(byArray2, 2, (short)n10);
                                c.a(byArray2, 4, s);
                                break;
                            }
                            case 12: {
                                n10 = (short)i.a(byArray, n9);
                                s = (short)i.a(byArray, n9 += 2);
                                n9 += 2;
                                byArray2 = new byte[6];
                                c.a(byArray2, 2, (short)n10);
                                c.a(byArray2, 4, s);
                                break;
                            }
                            case 13: {
                                n10 = (short)i.a(byArray, n9);
                                s = (short)i.a(byArray, n9 += 2);
                                n3 = (short)i.a(byArray, n9 += 2);
                                n9 += 2;
                                byArray2 = new byte[12];
                                c.a(byArray2, 2, (short)n10);
                                c.a(byArray2, 4, s);
                                c.a(byArray2, 6, (short)n3);
                                c.a(byArray2, 8, (short)10000);
                                c.a(byArray2, 10, (short)10000);
                                break;
                            }
                            case 14: 
                            case 15: {
                                byte[] byArray3 = new byte[2];
                                break;
                            }
                            case 4: {
                                s = (short)i.a(byArray, n9);
                                short s2 = (short)i.a(byArray, n9 += 2);
                                short s3 = (short)i.a(byArray, n9 += 2);
                                short s4 = (short)i.a(byArray, n9 += 2);
                                short s5 = (short)i.a(byArray, n9 += 2);
                                n10 = (short)i.a(byArray, n9 += 2);
                                n3 = (short)i.a(byArray, n9 += 2);
                                n9 += 2;
                                byArray2 = new byte[16];
                                c.a(byArray2, 2, s);
                                c.a(byArray2, 4, s2);
                                c.a(byArray2, 6, s3);
                                c.a(byArray2, 8, s4);
                                c.a(byArray2, 10, s5);
                                c.a(byArray2, 12, (short)n10);
                                c.a(byArray2, 14, (short)n3);
                                break;
                            }
                            case 7: {
                                byte[] byArray3 = new byte[2];
                                break;
                            }
                            case 1: {
                                n10 = (short)(i.a(byArray, n9) * 24);
                                s = (short)(i.a(byArray, n9 += 2) * 24);
                                n3 = (short)i.a(byArray, n9 += 2);
                                n9 += 2;
                                byArray2 = new byte[12];
                                c.a(byArray2, 2, (short)n10);
                                c.a(byArray2, 4, s);
                                c.a(byArray2, 6, (short)n3);
                                c.a(byArray2, 8, (short)10000);
                                c.a(byArray2, 10, (short)10000);
                                break;
                            }
                            case 6: {
                                n10 = i.b(byArray, n9);
                                n9 += 4;
                                byArray2 = new byte[6];
                                c.a(byArray2, 2, n10);
                                break;
                            }
                            case 26: {
                                n10 = (short)i.a(byArray, n9);
                                s = (short)i.a(byArray, n9 += 2);
                                n3 = i.b(byArray, n9 += 2);
                                n9 += 4;
                                byArray2 = new byte[10];
                                c.a(byArray2, 2, (short)n10);
                                c.a(byArray2, 4, s);
                                c.a(byArray2, 6, n3);
                                break;
                            }
                            case 25: {
                                n10 = (short)i.a(byArray, n9);
                                s = (short)i.a(byArray, n9 += 2);
                                n9 += 2;
                                n3 = (short)(byArray[n9++] & 0xFF);
                                short s2 = (short)(byArray[n9++] & 0xFF);
                                byArray2 = new byte[8];
                                c.a(byArray2, 2, (short)n10);
                                c.a(byArray2, 4, s);
                                byArray2[6] = (byte)n3;
                                byArray2[7] = (byte)s2;
                                break;
                            }
                            case 5: {
                                n10 = (short)i.a(byArray, n9);
                                s = (short)i.a(byArray, n9 += 2);
                                n9 += 2;
                                n3 = (short)(byArray[n9++] & 0xFF);
                                byArray2 = new byte[7];
                                c.a(byArray2, 2, (short)n10);
                                c.a(byArray2, 4, s);
                                byArray2[6] = (byte)n3;
                                break;
                            }
                            case 27: {
                                n10 = (short)i.a(byArray, n9);
                                n9 += 2;
                                byArray2 = new byte[n10 + 8];
                                c.a(byArray2, 2, (short)n10);
                                c.a(byArray2, 4, (short)10000);
                                byArray2[6] = 0;
                                byArray2[7] = 0;
                                System.arraycopy(byArray, n9, byArray2, 8, n10);
                                n9 += n10;
                                break;
                            }
                            case 2: {
                                n3 = byArray[n9++] & 0xFF;
                                s = (short)i.a(byArray, n9);
                                n10 = (short)i.a(byArray, n9 += 2);
                                n9 += 2;
                                byArray2 = new byte[n10 + 11];
                                c.a(byArray2, 2, (short)n10);
                                c.a(byArray2, 4, (short)10000);
                                c.a(byArray2, 6, s);
                                byArray2[8] = (byte)n3;
                                byArray2[9] = 0;
                                byArray2[10] = 0;
                                System.arraycopy(byArray, n9, byArray2, 11, n10);
                                n9 += n10;
                                break;
                            }
                            case 9: {
                                n10 = (short)i.a(byArray, n9);
                                s = (short)i.a(byArray, n9 += 2);
                                n3 = (short)i.a(byArray, n9 += 2);
                                n9 += 2;
                                byArray2 = new byte[8];
                                c.a(byArray2, 2, (short)n10);
                                c.a(byArray2, 4, s);
                                c.a(byArray2, 6, (short)n3);
                                break;
                            }
                            case 10: {
                                n10 = (short)(byArray[n9++] & 0xFF);
                                byte[] byArray4 = new byte[3];
                                byArray2 = byArray4;
                                byArray4[2] = (byte)n10;
                                break;
                            }
                            case 0: {
                                short s6 = (short)(byArray[n9++] & 0xFF);
                                n6 = s6;
                                byArrayArray = new byte[s6][];
                                byte[] byArray3 = byArray2 = null;
                            }
                        }
                        if (byArray2 != null) {
                            byArray2[0] = (byte)n4;
                            byArray2[1] = 0;
                            if (object == byArrayArray) {
                                object[n7] = (short)byArray2;
                                ++n7;
                            } else {
                                object[n8] = (short)byArray2;
                                ++n8;
                            }
                        }
                        if (object != byArrayArray || n6 != 0) continue;
                        s = 0;
                        for (n3 = 0; n3 < byArrayArray.length; ++n3) {
                            s += byArrayArray[n3].length;
                        }
                        byte[] byArray5 = new byte[2 + (byArrayArray.length << 2) + s];
                        byArray2 = byArray5;
                        byArray5[0] = 0;
                        byArray2[1] = (byte)byArrayArray.length;
                        n3 = 2 + (byArrayArray.length << 2);
                        for (n10 = 0; n10 < byArrayArray.length; ++n10) {
                            c.a(byArray2, 2 + (n10 << 2), byArrayArray[n10].length);
                            System.arraycopy(byArrayArray[n10], 0, byArray2, n3, byArrayArray[n10].length);
                            n3 += byArrayArray[n10].length;
                        }
                        object2[n8] = (short)byArray2;
                        n7 = 0;
                        byArrayArray = null;
                        ++n8;
                    }
                    this.a = (byte[][])object2;
                    continue;
                }
                byteArrayInputStream.skip(2L);
                byteArrayInputStream.read(byArray, 0, 4);
                n2 = i.b(byArray, 0);
                byteArrayInputStream.skip(n2);
            } while (!bl);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static int a(Graphics graphics, String stringArray, int n, int n2, int n3) {
        stringArray = c.a((String)stringArray, n3);
        for (n3 = 0; n3 < stringArray.length; ++n3) {
            i.a.b(graphics, stringArray[n3], n, n2, 17);
            n2 += i.a.a.getHeight();
        }
        return n2;
    }

    private static void a(Graphics graphics, String stringArray, int n, int n2, int n3) {
        n2 += 14;
        try {
            stringArray = c.a((String)stringArray, n3);
            for (int k = 0; k < stringArray.length; ++k) {
                int n4;
                int n5;
                int n6;
                String string;
                Graphics graphics2;
                h h2;
                if (stringArray[k] == null) {
                    return;
                }
                if (stringArray[k].trim().equals("") || stringArray[k].trim().equals(" ")) {
                    return;
                }
                if (i.b) {
                    h2 = i.a;
                    graphics2 = graphics;
                    string = stringArray[k];
                    n6 = n + n3;
                    n5 = n2;
                    n4 = 8;
                } else {
                    h2 = i.a;
                    graphics2 = graphics;
                    string = stringArray[k];
                    n6 = n;
                    n5 = n2;
                    n4 = 4;
                }
                h2.b(graphics2, string, n6, n5, n4);
                n2 += i.a.a.getHeight();
            }
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public static String[] a(String stringArray, int n) {
        Vector<Object> vector = new Vector<Object>();
        Object object = "";
        stringArray = c.a((String)stringArray, ' ');
        for (int k = 0; k < stringArray.length; ++k) {
            Object object2;
            String string = stringArray[k];
            if (i.a.a.stringWidth(string) >= n) {
                if (((String[])(object = c.b((String)object + string, n))).length > 1 && (string = object[((String[])object).length - 1].trim()).length() == 1 && (string.equals(".") || string.equals(",") || string.equals(";") || string.equals("?") || string.equals("'") || string.equals("\"") || string.equals("!"))) {
                    object2 = object[((Object)object).length - 2];
                    string = ((String)object2).charAt(((String)object2).length() - 1) + string;
                    object[((Object)object).length - 2] = ((String)object2).substring(0, ((String)object2).length() - 1);
                    object[((Object)object).length - 1] = string;
                }
                object2 = object;
                for (int i2 = 0; i2 < ((String[])object2).length - 1; ++i2) {
                    if (object2[i2] == null || object2[i2].equals("") || object2[i2].equals(" ")) continue;
                    vector.addElement(object2[i2]);
                }
                object = "" + object2[((String[])object2).length - 1] + " ";
                if (k != stringArray.length - 1 || object == null || ((String)object).equals("") || ((String)object).equals(" ")) continue;
            } else {
                StringBuffer stringBuffer;
                if (i.a.a.stringWidth((String)object + string + " ") < n) {
                    if (stringArray.length > 2 && k == stringArray.length - 2 && ((String)(object2 = stringArray[stringArray.length - 1].trim())).length() == 1 && i.a.a.stringWidth((String)object + " " + string + " " + (String)object2) >= n && (((String)object2).equals(".") || ((String)object2).equals(",") || ((String)object2).equals(";") || ((String)object2).equals("?") || ((String)object2).equals("'") || ((String)object2).equals("\"") || ((String)object2).equals("!"))) {
                        if (object != null && !((String)object).equals("") && !((String)object).equals(" ")) {
                            vector.addElement(object);
                        }
                        object = "";
                        if ((object = (String)object + string + " " + (String)object2) == null || ((String)object).equals("") || ((String)object).equals(" ")) break;
                        vector.addElement(object);
                        break;
                    }
                    stringBuffer = new StringBuffer();
                } else {
                    if (object != null && !((String)object).equals("") && !((String)object).equals(" ")) {
                        vector.addElement(object);
                    }
                    object = "";
                    stringBuffer = new StringBuffer();
                }
                object = stringBuffer.append((String)object).append(string).append(" ").toString();
                if (k != stringArray.length - 1 || object == null || ((String)object).equals("") || ((String)object).equals(" ")) continue;
            }
            vector.addElement(object);
        }
        return c.a(vector);
    }

    private static String[] b(String string, int n) {
        Vector<String> vector = new Vector<String>();
        String string2 = "";
        for (int k = 0; k < string.length(); ++k) {
            String string3;
            StringBuffer stringBuffer;
            char c2 = string.charAt(k);
            if (i.a.a.stringWidth(string2 + c2) < n) {
                stringBuffer = new StringBuffer();
                string3 = string2;
            } else {
                vector.addElement(string2);
                stringBuffer = new StringBuffer();
                string3 = "";
            }
            string2 = stringBuffer.append(string3).append(c2).toString();
            if (k != string.length() - 1 || string2 == null || string2.equals("") || string2.equals(" ")) continue;
            vector.addElement(string2);
        }
        return c.a(vector);
    }

    private static String[] a(Vector object) {
        String[] stringArray = new String[((Vector)object).size()];
        object = ((Vector)object).elements();
        int n = 0;
        while (object.hasMoreElements()) {
            String string = ((String)object.nextElement()).trim();
            if (!string.equals("") && !string.equals(" ")) {
                stringArray[n] = string;
            }
            ++n;
        }
        return stringArray;
    }

    public static String[] a(String string, char c2) {
        Vector<String> vector = new Vector<String>();
        String string2 = "";
        for (int k = 0; k < string.length(); ++k) {
            char c3 = string.charAt(k);
            if (c3 != c2) {
                string2 = string2 + c3;
            }
            if (c3 != c2 && c3 != '\n' && k != string.length() - 1) continue;
            vector.addElement(string2);
            string2 = "";
        }
        return c.a(vector);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(String string, int n) {
        try {
            this.h = 0;
            int n2 = string.length();
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            while (true) {
                block16: {
                    block15: {
                        block12: {
                            char c2;
                            block14: {
                                block13: {
                                    block11: {
                                        if (n5 >= n2) {
                                            this.a[this.h++] = (short)n2;
                                            return;
                                        }
                                        if (string.charAt(n2 - 1) == '\n') {
                                            return;
                                        }
                                        c2 = string.charAt(n5);
                                        if (c2 <= ' ') break block11;
                                        n3 += i.a.a.charWidth(c2);
                                        break block12;
                                    }
                                    if (c2 != ' ' || n5 + 1 >= n2 || string.charAt(n5 + 1) != '?' && string.charAt(n5 + 1) != '!' && string.charAt(n5 + 1) != ':') break block13;
                                    n3 += i.a.a.charWidth(c2);
                                    string.charAt(n5 + 1);
                                    n3 += i.a.a.charWidth(c2);
                                    break block12;
                                }
                                if (c2 != ' ') break block14;
                                n3 += i.a.a.charWidth(c2);
                                break block15;
                            }
                            if (c2 == '\n') {
                                n3 = 0;
                                this.a[this.h++] = (short)n5;
                            }
                            break block16;
                        }
                        if (n3 > n) {
                            n5 = n4 - 1;
                            this.a[this.h++] = (short)n5;
                            n3 = 0;
                        }
                        if (string.charAt(n5) != ' ') break block16;
                    }
                    n4 = n5 + 1;
                }
                ++n5;
            }
        }
        catch (Exception exception) {
            return;
        }
    }

    private static void a(byte[] byArray, int n, short s) {
        byArray[n] = (byte)s;
        byArray[n + 1] = (byte)(s >> 8);
    }

    private static void a(byte[] byArray, int n, int n2) {
        byArray[n] = (byte)n2;
        byArray[n + 1] = (byte)(n2 >> 8);
        byArray[n + 2] = (byte)(n2 >> 16);
        byArray[n + 3] = (byte)(n2 >>> 24);
    }
}
