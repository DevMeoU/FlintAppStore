/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.lcdui.Image;

public final class n
extends w {
    public static int a = -1;
    private int b = 0;
    private Image c = null;
    private Image d = null;
    private Image e = null;

    public n() {
        try {
            this.c = Image.createImage("/7s_Mobi3D.png");
            this.e = Image.createImage("/7s_gamePoster_img.png");
            this.d = Image.createImage("/7s_dev_Logo.png");
        }
        catch (Exception exception) {
            System.out.println("Error: " + exception);
        }
        w.m.setColor(1980473);
        w.q.c(61.928f, 0.1f, 2000.0f);
        k.f.d();
        k.f.b(0);
        y.d = k.f.a == "No Exception" ? 1 : (k.f.a.endsWith("started.") || k.f.a.endsWith("started") ? 2 : 3);
        k.f.a();
        w.o = System.currentTimeMillis();
    }

    public final void a(int n2) {
    }

    public final void a() {
        u.a();
    }

    public final void b() {
        this.b += w.n;
        this.g();
    }

    public final void c() {
        try {
            try {
                w.l.bindTarget(w.k);
                w.l.clear(w.m);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
                w.l.releaseTarget();
                return;
            }
        }
        finally {
            w.l.releaseTarget();
        }
    }

    public final void d() {
        switch (a) {
            case -1: {
                short[][] sArrayArray = new short[6][];
                sArrayArray[0] = new short[]{37, 77, 70, 75, 72, 82, 71};
                sArrayArray[1] = new short[]{37, 82, 79, 64, 133, 78, 75};
                sArrayArray[2] = new short[]{38, 81, 64, 77, 124, 64, 72, 82};
                sArrayArray[3] = new short[]{36, 68, 84, 83, 82, 66, 71};
                short[] sArray = new short[9];
                sArray[0] = 41;
                sArray[1] = 83;
                sArray[2] = 64;
                sArray[3] = 75;
                sArray[4] = 72;
                sArray[5] = 64;
                sArray[6] = 77;
                sArray[7] = 78;
                sArrayArray[4] = sArray;
                sArrayArray[5] = new short[]{46, 68, 67, 68, 81, 75, 64, 77, 67, 82};
                short[][] sArrayArray2 = sArrayArray;
                int n2 = 0;
                while (n2 < 6) {
                    if (n2 == k.g) {
                        w.k.drawImage(w.r.c, (k.b >> 1) - (w.r.c.getWidth() >> 1), (k.c >> 2) + n2 * ((k.c >> 3) - (k.c >> 5)) - 2, 0);
                        w.p.b(sArrayArray2[n2], (k.b >> 1) - (w.p.a(sArrayArray2[n2], sArrayArray2[n2].length) >> 1), (k.c >> 2) + n2 * ((k.c >> 3) - (k.c >> 5)), sArrayArray2[n2].length);
                    } else {
                        w.p.a(sArrayArray2[n2], (k.b >> 1) - (w.p.a(sArrayArray2[n2], sArrayArray2[n2].length) >> 1), (k.c >> 2) + n2 * ((k.c >> 3) - (k.c >> 5)), sArrayArray2[n2].length);
                    }
                    ++n2;
                }
                w.k.drawImage(w.r.b, k.b - 40, k.c - 35, 0);
                return;
            }
            case 0: {
                int n3 = (k.b >> 1) - (w.p.b(0) >> 1);
                w.p.getClass();
                w.p.getClass();
                w.p.a(0, n3, (k.c >> 1) - 10 - 30);
                int n4 = 0;
                while (n4 < 2) {
                    if (n4 == w.r.d) {
                        Image image = w.r.c;
                        int n5 = (k.b >> 1) - (w.r.c.getWidth() >> 1);
                        w.p.getClass();
                        w.p.getClass();
                        w.k.drawImage(image, n5, (k.c >> 1) - 10 + n4 * 30 - 2 - w.r.d, 0);
                        int n6 = (k.b >> 1) - (w.p.b(1 + n4) >> 1);
                        w.p.getClass();
                        w.p.getClass();
                        w.p.a(1 + n4, n6, (k.c >> 1) - 10 + n4 * 30);
                    } else {
                        int n7 = (k.b >> 1) - (w.p.a(1 + n4) >> 1);
                        w.p.getClass();
                        w.p.getClass();
                        w.p.c(1 + n4, n7, (k.c >> 1) - 10 + n4 * 30);
                    }
                    ++n4;
                }
                w.k.drawImage(w.r.b, k.b - 40, k.c - 35, 0);
                return;
            }
            case 1: {
                w.k.drawImage(this.c, (k.b >> 1) - (this.c.getWidth() >> 1), (k.c >> 1) - (this.c.getHeight() >> 1), 0);
                if (this.b <= 2000) break;
                a = 2;
                this.b = 0;
                return;
            }
            case 2: {
                w.k.drawImage(this.d, (k.b >> 1) - (this.d.getWidth() >> 1), (k.c >> 1) - (this.d.getHeight() >> 1), 0);
                if (this.b <= 2000) break;
                a = 3;
                this.b = 0;
                return;
            }
            case 3: {
                w.k.drawImage(this.e, (k.b >> 1) - (this.e.getWidth() >> 1), (k.c >> 1) - (this.e.getHeight() >> 1), 0);
                if (this.b < 500) {
                    if (k.g == 2 || k.g == 3) {
                        w.k.setColor(8094331);
                        int n8 = w.p.g(12, 20, 20) + 1;
                        w.p.getClass();
                        w.k.drawRoundRect(2, (k.c >> 1) - 17, k.b - 4, n8 * 20 + 6, 20, 20);
                        w.k.setColor(3621177);
                        int n9 = w.p.g(12, 20, 20) + 1;
                        w.p.getClass();
                        w.k.fillRoundRect(3, (k.c >> 1) - 17 + 1, k.b - 5, n9 * 20 + 6 - 1, 20, 20);
                        w.p.b(12, 10, (k.c >> 1) - 17);
                    } else {
                        w.k.setColor(8094331);
                        int n10 = (k.b >> 1) - (w.p.b(12) >> 1) - 4;
                        int n11 = w.p.b(12) + 6;
                        w.p.getClass();
                        w.k.drawRoundRect(n10, (k.c >> 1) - 17, n11, 23, 20, 20);
                        w.k.setColor(3621177);
                        int n12 = (k.b >> 1) - (w.p.b(12) >> 1) - 3 + 1;
                        int n13 = w.p.b(12) + 4;
                        w.p.getClass();
                        w.k.fillRoundRect(n12, (k.c >> 1) - 17 + 1, n13, 22, 20, 20);
                        w.p.a(12, (k.b >> 1) - (w.p.b(12) >> 1), (k.c >> 1) - 17);
                    }
                }
                if (this.b <= 1000) break;
                this.b = 0;
                return;
            }
            case 4: {
                if (!w.r.f) break;
                w.r.f = false;
                w.r.d = 0;
                w.r.g = 1;
                this.e();
                i.a(2);
            }
        }
    }

    private void g() {
        switch (i.g) {
            case 1: {
                if (a == -1) {
                    if (--k.g >= 0) break;
                    k.g = 5;
                    break;
                }
                if (a != 0) break;
                --w.r.d;
                if (w.r.d >= 0) break;
                w.r.d = 1;
                break;
            }
            case 2: {
                if (a == -1) {
                    if (++k.g <= 5) break;
                    k.g = 0;
                    break;
                }
                if (a != 0) break;
                ++w.r.d;
                if (w.r.d <= 1) break;
                w.r.d = 0;
                break;
            }
            case 16: 
            case 64: {
                if (a == 0) {
                    if (w.r.d == 0) {
                        if (!k.e) {
                            k.e = true;
                            y.c = 50;
                        }
                    } else if (w.r.d == 1) {
                        k.e = false;
                    }
                    a = 1;
                    this.b = 0;
                }
                if (a != -1) break;
                w.r.d = 0;
                if (k.g != 0) {
                    w.p.a();
                }
                l.a.d();
                a = 0;
                this.b = 0;
            }
        }
        if (a == 3 && i.g != 0) {
            a = 4;
            w.r.f = true;
        }
        i.g = 0;
    }

    public final void e() {
        this.c = null;
        this.d = null;
        this.e = null;
        System.gc();
    }
}
