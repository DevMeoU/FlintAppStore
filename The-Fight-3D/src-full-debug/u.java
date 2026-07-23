/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.lcdui.Image;

public final class u {
    public Image a = null;
    public Image b = null;
    public Image c = null;
    public int d;
    public int e = 0;
    public boolean f = false;
    public int g = 0;
    public int h = 0;
    public int i = 0;
    public boolean j = false;
    public int k = 0;
    public boolean l = false;
    public int m = 0;
    public int n = 0;
    public static int o = 1;
    public Image p = null;
    public int q = 0;
    public boolean r = false;
    public boolean s = false;
    public int t = 0;
    public boolean u = false;

    public u() {
        try {
            this.c = Image.createImage("/7s_Option_Selection_img.png");
            this.p = Image.createImage("/7s_mode_left.png");
            this.b = Image.createImage("/7s_yes_img.png");
            this.a = Image.createImage("/7s_back_img.png");
            return;
        }
        catch (Exception exception) {
            System.out.println("Error: " + exception);
            return;
        }
    }

    public static void a() {
    }

    public final void a(int n) {
        switch (n) {
            case -1: 
            case 50: {
                this.m = 0;
                if (!this.r) break;
                if (!this.s) {
                    --this.t;
                    if (this.t >= 0) break;
                    this.t = 3;
                    return;
                }
                if (this.t == 2 || this.t == 3) {
                    --this.d;
                    if (this.d < 0) {
                        this.d = 1;
                    }
                }
                if (this.t != 1) break;
                --this.d;
                if (this.d >= 0) break;
                this.d = 2;
                return;
            }
            case -2: 
            case 56: {
                this.m = 0;
                if (!this.r) break;
                if (!this.s) {
                    ++this.t;
                    if (this.t <= 3) break;
                    this.t = 0;
                    return;
                }
                if (this.t == 2 || this.t == 3) {
                    ++this.d;
                    if (this.d > 1) {
                        this.d = 0;
                    }
                }
                if (this.t != 1) break;
                ++this.d;
                if (this.d <= 2) break;
                this.d = 0;
                return;
            }
            case -3: {
                if (!this.r || !this.s || this.t != 1 || this.d != 2) break;
                if (--k.g < 0) {
                    k.g = 5;
                }
                w.p.a();
                l.a.d();
                return;
            }
            case -4: {
                if (!this.r || !this.s || this.t != 1 || this.d != 2) break;
                if (++k.g > 5) {
                    k.g = 0;
                }
                w.p.a();
                l.a.d();
                return;
            }
            case -21: 
            case -6: {
                if (r.a.b || !this.r || !this.s) break;
                this.s = false;
                this.d = 0;
                if (this.t != 1) break;
                k.f.c();
                return;
            }
            case -22: 
            case -7: {
                if (r.a.b || !this.r) break;
                if (this.s) {
                    if (this.t == 2) {
                        if (this.d == 0) {
                            this.g = 1;
                            return;
                        }
                        if (this.d != 1) break;
                        this.s = false;
                        this.d = 0;
                        return;
                    }
                    if (this.t != 3) break;
                    if (this.d == 0) {
                        this.u = true;
                        return;
                    }
                    if (this.d != 1) break;
                    this.s = false;
                    this.d = 0;
                    return;
                }
                if (this.t == 0) {
                    this.r = false;
                    this.q = 1;
                    if (k.e) {
                        k.f.d();
                    }
                    this.s = false;
                    r.a.b = true;
                    return;
                }
                this.s = true;
                if (this.t != 2 && this.t != 3) break;
                this.d = 1;
                return;
            }
            case -5: 
            case 53: {
                if (!this.r) break;
                if (this.s) {
                    if (this.t == 2) {
                        if (this.d == 0) {
                            this.g = 1;
                            return;
                        }
                        if (this.d != 1) break;
                        this.s = false;
                        return;
                    }
                    if (this.t != 3) break;
                    if (this.d == 0) {
                        this.u = true;
                        return;
                    }
                    if (this.d != 1) break;
                    this.s = false;
                    return;
                }
                if (this.t == 0) {
                    this.r = false;
                    this.q = 1;
                    if (k.e) {
                        k.f.d();
                    }
                    this.s = false;
                    r.a.b = true;
                    return;
                }
                this.s = true;
                if (this.t != 2 && this.t != 3) break;
                this.d = 1;
            }
        }
    }

    public final void b(int n) {
        if (this.s) {
            this.c();
            return;
        }
        int n2 = 0;
        while (n2 < 4) {
            if (this.t == n2) {
                w.k.drawImage(this.c, (k.b >> 1) - (this.c.getWidth() >> 1), n + 12 - 2 + n2 * 32, 0);
                w.p.a(46 + n2, (k.b >> 1) - (w.p.a(46 + n2) >> 1), n + 12 + n2 * 32);
            } else {
                w.p.c(46 + n2, (k.b >> 1) - (w.p.a(46 + n2) >> 1), n + 12 + n2 * 32);
            }
            ++n2;
        }
        w.k.drawImage(this.b, k.b - 40, k.c - 35, 0);
    }

    public final void b() {
        w.p.getClass();
        w.p.getClass();
        w.k.drawImage(this.p, (k.b >> 1) - 50 - 30 - this.n, (k.c >> 1) - 5 - 20 - 50 + this.d * 70 + 30 - 1, 0);
        w.p.getClass();
        w.p.getClass();
        w.k.drawRegion(this.p, 0, 0, 19, 16, 2, (k.b >> 1) - 40 + 100 + this.n, (k.c >> 1) - 5 - 20 - 50 + this.d * 70 + 30 - 1, 0);
        this.n = this.n < 10 ? ++this.n : 0;
        w.k.setColor(13857087);
        w.p.getClass();
        w.p.getClass();
        w.k.drawRoundRect((k.b >> 1) - 50, (k.c >> 1) - 5 - 20 - 50 + 0 + 30, 101, 10, 10, 10);
        w.p.getClass();
        w.p.getClass();
        w.k.drawRoundRect((k.b >> 1) - 50, (k.c >> 1) - 5 - 20 - 50 + 70 + 30, 101, 10, 10, 10);
        w.k.setColor(14995029);
        w.p.getClass();
        w.p.getClass();
        w.k.fillRoundRect((k.b >> 1) - 50 + 1, (k.c >> 1) - 5 - 20 - 50 + 0 + 30 + 1, y.c, 9, 10, 10);
        if (this.d == 0) {
            if (this.m == 4) {
                if (k.e) {
                    if (y.c > 0) {
                        y.c -= 25;
                        this.m = 0;
                        k.f.d();
                    }
                } else if (!k.e || y.c == 0) {
                    k.f.c();
                }
            } else if (this.m == 8) {
                if (!k.e) {
                    if (s.a == 1) {
                        k.f.a();
                        k.f.a(1);
                    }
                    if (this.t == 1) {
                        k.f.a();
                        k.f.a(2);
                    }
                    k.e = true;
                }
                if (k.e) {
                    if (y.c < 100) {
                        y.c += 25;
                        this.m = 0;
                        k.f.d();
                    }
                } else {
                    k.e = false;
                    k.f.c();
                }
            }
        }
        w.p.getClass();
        w.p.getClass();
        w.k.fillRoundRect((k.b >> 1) - 50 + 1, (k.c >> 1) - 5 - 20 - 50 + 70 + 30 + 1, o * 25, 9, 10, 10);
        if (this.d == 1) {
            if (this.m == 4) {
                if (o > 0) {
                    --o;
                    MainMIDlet.b();
                }
                this.m = 0;
            } else if (this.m == 8) {
                if (o < 4) {
                    ++o;
                    MainMIDlet.b();
                }
                this.m = 0;
            }
        }
        w.p.getClass();
        w.p.getClass();
        w.p.f(y.c, (k.b >> 1) + 10, (k.c >> 1) - 5 - 20 - 50 + 0 + 30 + 12);
        w.p.getClass();
        w.p.getClass();
        w.p.a((byte)5, (k.b >> 1) + 10, (k.c >> 1) - 5 - 20 - 50 + 0 + 30 + 12);
        w.p.getClass();
        w.p.getClass();
        w.p.f(o * 25, (k.b >> 1) + 10, (k.c >> 1) - 5 - 20 - 50 + 70 + 30 + 12);
        w.p.getClass();
        w.p.getClass();
        w.p.a((byte)5, (k.b >> 1) + 10, (k.c >> 1) - 5 - 20 - 50 + 70 + 30 + 12);
    }

    private void c() {
        w.k.setColor(8094331);
        w.k.drawRect((k.b >> 1) - (w.p.b(46 + this.t) >> 1) - 5, (k.c >> 4) - 10, w.p.b(46 + this.t) + 10, 30);
        w.k.setColor(3621177);
        w.k.fillRect((k.b >> 1) - (w.p.b(46 + this.t) >> 1) - 5 + 1, (k.c >> 4) - 10 + 1, w.p.b(46 + this.t) + 10 - 1, 29);
        switch (this.t) {
            case 1: {
                w.p.a(4, (k.b >> 1) - (w.p.b(4) >> 1) + 5, (k.c >> 4) - 5);
                int n = (k.b >> 1) - (this.c.getWidth() >> 1);
                w.p.getClass();
                w.p.getClass();
                w.k.drawImage(this.c, n, (k.c >> 1) - 5 - 20 - 51 + this.d * 70, 0);
                if (this.d == 0) {
                    int n2 = (k.b >> 1) - (w.p.b(0) >> 1);
                    w.p.getClass();
                    w.p.getClass();
                    w.p.a(0, n2, (k.c >> 1) - 5 - 20 - 50 + this.d * 70);
                } else {
                    int n3 = (k.b >> 1) - (w.p.a(0) >> 1);
                    w.p.getClass();
                    w.p.getClass();
                    w.p.c(0, n3, (k.c >> 1) - 5 - 20 - 50 + 0);
                }
                if (this.d == 1) {
                    int n4 = (k.b >> 1) - (w.p.b(9) >> 1);
                    w.p.getClass();
                    w.p.getClass();
                    w.p.a(9, n4, (k.c >> 1) - 5 - 20 - 50 + this.d * 70);
                } else {
                    int n5 = (k.b >> 1) - (w.p.a(9) >> 1);
                    w.p.getClass();
                    w.p.getClass();
                    w.p.c(9, n5, (k.c >> 1) - 5 - 20 - 50 + 70);
                }
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
                if (this.d == 2) {
                    int n6 = (k.b >> 1) - (w.p.b(14) >> 1);
                    w.p.getClass();
                    w.p.getClass();
                    w.p.a(14, n6, (k.c >> 1) - 5 - 20 - 50 + this.d * 70);
                    short[] sArray2 = sArrayArray2[k.g];
                    int n7 = (k.b >> 1) - (w.p.a(sArrayArray2[k.g], sArrayArray2[k.g].length) >> 1);
                    w.p.getClass();
                    w.p.getClass();
                    w.p.b(sArray2, n7, (k.c >> 1) - 5 - 20 - 50 + 140 + 25, sArrayArray2[k.g].length);
                } else {
                    int n8 = (k.b >> 1) - (w.p.a(14) >> 1);
                    w.p.getClass();
                    w.p.getClass();
                    w.p.c(14, n8, (k.c >> 1) - 5 - 20 - 50 + 140);
                    short[] sArray3 = sArrayArray2[k.g];
                    int n9 = (k.b >> 1) - (w.p.a(sArrayArray2[k.g], sArrayArray2[k.g].length) >> 1);
                    w.p.getClass();
                    w.p.getClass();
                    w.p.b(sArray3, n9, (k.c >> 1) - 5 - 20 - 50 + 140 + 25, sArrayArray2[k.g].length);
                }
                this.b();
                break;
            }
            case 2: {
                w.p.a(48, (k.b >> 1) - (w.p.b(48) >> 1) + 5, (k.c >> 4) - 5);
                w.p.d(11, 20, (k.c >> 1) - 50);
                int n = 0;
                while (n < 2) {
                    if (n == this.d) {
                        int n10 = (k.b >> 1) - (this.c.getWidth() >> 1);
                        w.p.getClass();
                        w.p.getClass();
                        w.p.getClass();
                        w.k.drawImage(this.c, n10, (k.c >> 1) + (k.c >> 3) - 10 - 2 - 30 + this.d * 30, 0);
                        int n11 = (k.b >> 1) - (w.p.b(21 + n) >> 1);
                        w.p.getClass();
                        w.p.getClass();
                        w.p.getClass();
                        w.p.a(21 + n, n11, (k.c >> 1) + (k.c >> 3) - 10 - 30 + n * 30);
                    } else {
                        int n12 = (k.b >> 1) - (w.p.a(21 + n) >> 1);
                        w.p.getClass();
                        w.p.getClass();
                        w.p.getClass();
                        w.p.c(21 + n, n12, (k.c >> 1) + (k.c >> 3) - 10 - 30 + n * 30);
                    }
                    ++n;
                }
                w.k.drawImage(this.b, k.b - 40, k.c - 35, 0);
                if (this.g != 1) break;
                i.c.e();
                i.c = null;
                o.a = false;
                s.j = 1;
                s.i = false;
                this.r = false;
                s.f = 0;
                s.g = 1;
                s.h = 2;
                i.a(2);
                break;
            }
            case 3: {
                w.p.a(7, (k.b >> 1) - (w.p.b(7) >> 1) + 5, (k.c >> 4) - 5);
                w.p.d(10, 20, (k.c >> 1) - 50);
                int n = 0;
                while (n < 2) {
                    if (n == this.d) {
                        int n13 = (k.b >> 1) - (this.c.getWidth() >> 1);
                        w.p.getClass();
                        w.p.getClass();
                        w.p.getClass();
                        w.k.drawImage(this.c, n13, (k.c >> 1) + (k.c >> 3) - 10 - 2 - 30 + this.d * 30, 0);
                        int n14 = (k.b >> 1) - (w.p.b(21 + n) >> 1);
                        w.p.getClass();
                        w.p.getClass();
                        w.p.getClass();
                        w.p.a(21 + n, n14, (k.c >> 1) + (k.c >> 3) - 10 - 30 + n * 30);
                    } else {
                        int n15 = (k.b >> 1) - (w.p.a(21 + n) >> 1);
                        w.p.getClass();
                        w.p.getClass();
                        w.p.getClass();
                        w.p.c(21 + n, n15, (k.c >> 1) + (k.c >> 3) - 10 - 30 + n * 30);
                    }
                    ++n;
                }
                w.k.drawImage(this.b, k.b - 40, k.c - 35, 0);
            }
        }
        w.k.drawImage(this.a, 5, k.c - 35, 0);
    }
}
