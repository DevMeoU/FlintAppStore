/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.lcdui.Image;
import javax.microedition.m3g.Image2D;

public final class s
extends w {
    public static int a = 0;
    public static boolean b = false;
    private Image[] s = null;
    public static Image[] c = null;
    private Image[] t = null;
    private Image u = null;
    private Image v = null;
    private Image w = null;
    public static p[] d = null;
    private int x = 0;
    public static int e = 0;
    public static int f = 0;
    public static int g = 1;
    public static int h = 2;
    private int y = 0;
    private int z = 0;
    private int A = 0;
    private int B = 0;
    private boolean C = false;
    private int D = 0;
    public static boolean i = false;
    public static int j = 1;

    public s() {
        try {
            k.f.a();
            if (k.e) {
                k.f.a(1);
            }
            this.s = new Image[4];
            this.t = new Image[4];
            this.s[0] = Image.createImage("/GameChar_img/7s_egalBg_img.png");
            this.s[1] = Image.createImage("/GameChar_img/7s_lady2Bg_img.png");
            this.s[2] = Image.createImage("/GameChar_img/7s_bozyBg_img.png");
            this.s[3] = Image.createImage("/GameChar_img/7s_lady1Bg_img.png");
            if (c == null) {
                c = new Image[4];
                s.c[0] = Image.createImage("/GameChar_img/7s_egalSm_img.png");
                s.c[1] = Image.createImage("/GameChar_img/7s_lady2Sm_img.png");
                s.c[2] = Image.createImage("/GameChar_img/7s_bozySm_img.png");
                s.c[3] = Image.createImage("/GameChar_img/7s_lady1Sm_img.png");
            }
            this.t[0] = Image.createImage("/GameChar_img/7s_egalSm1_img.png");
            this.t[1] = Image.createImage("/GameChar_img/7s_lady2Sm1_img.png");
            this.t[2] = Image.createImage("/GameChar_img/7s_bozySm1_img.png");
            this.t[3] = Image.createImage("/GameChar_img/7s_lady1Sm1_img.png");
            this.u = Image.createImage("/7s_vs_img.png");
            this.v = Image.createImage("/7s_GameTittle_img.png");
            this.w = Image.createImage("/7s_lock_img.png");
            w.m.setImage(new Image2D(99, Image.createImage("/7s_menu_bg_img.png")));
        }
        catch (Exception exception) {
            System.out.println("Error: " + exception);
        }
        w.q.c(60.0f, 1.0f, 100000.0f);
        w.q.a();
        if (l.a == null && w.r.h == 0) {
            l.a = new f();
        }
        if (k.e) {
            k.f.d();
        }
        if (!k.e) {
            k.f.c();
        }
        w.o = System.currentTimeMillis();
    }

    public final void b() {
        if (!o.b) {
            if (w.n > 100) {
                w.n = 100;
            }
            this.g();
            if (e == 2 && i) {
                this.x += w.n;
            }
        }
    }

    public final void c() {
        try {
            try {
                w.l.bindTarget(w.k);
                w.l.clear(w.m);
                if (!o.b && b && a == 0) {
                    if (e == 1) {
                        if (s.d[s.f].m != 0) {
                            d[f].a(0);
                        }
                        if (!s.d[s.f].k && s.d[s.f].m == 0) {
                            s.d[s.f].m = 23;
                        }
                        d[f].b((float)w.n);
                        d[f].a();
                    } else if (e == 3) {
                        if (s.d[s.g].m != 0) {
                            d[g].a(0);
                        }
                        if (!s.d[s.g].k && s.d[s.g].m == 0) {
                            s.d[s.g].m = 23;
                        }
                        d[g].b((float)w.n);
                        d[g].a();
                    }
                }
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
        if (!b) {
            w.k.drawImage(this.v, (k.b >> 1) - 38, 0, 0);
            int n = 0;
            while (n < 5) {
                if (n == a) {
                    w.k.drawImage(w.r.c, (k.b >> 1) - (w.r.c.getWidth() >> 1), 80 + (k.c >> 4) - 2 + n * ((k.c >> 4) + 15), 0);
                    w.p.a(3 + n, (k.b >> 1) - (w.p.b(3 + n) >> 1), 80 + (k.c >> 4) + n * ((k.c >> 4) + 15));
                } else {
                    w.p.c(3 + n, (k.b >> 1) - (w.p.a(3 + n) >> 1), 80 + (k.c >> 4) + n * ((k.c >> 4) + 15));
                }
                ++n;
            }
            w.k.drawImage(w.r.b, k.b - 40, k.c - 35, 0);
        } else {
            this.j();
        }
        if (w.r.f) {
            w.r.f = false;
            this.e();
            w.r.g = 0;
            i.a(2);
        }
        if (w.r.u) {
            w.r.u = false;
            i.a.a();
        }
    }

    private void b(int n) {
        if (n == 0) {
            this.y = 30;
            this.z = 80;
            this.A = 60;
            this.B = 40;
            return;
        }
        if (n == 1) {
            this.y = 50;
            this.z = 40;
            this.A = 85;
            this.B = 20;
            return;
        }
        if (n == 2) {
            this.y = 85;
            this.z = 60;
            this.A = 30;
            this.B = 40;
            return;
        }
        if (n == 3) {
            this.y = 25;
            this.z = 45;
            this.A = 60;
            this.B = 85;
        }
    }

    private void g() {
        switch (i.g) {
            case 32: {
                if (!b) break;
                if (a == 0) {
                    if (e == 0) {
                        b = false;
                        break;
                    }
                    if (e == 1) {
                        e = 0;
                        f = 0;
                        g = 1;
                        h = 2;
                        this.b(f);
                        break;
                    }
                    if (e == 2) {
                        if (w.r.d != 3) {
                            if (i) break;
                            e = 1;
                            break;
                        }
                        e = 3;
                        break;
                    }
                    if (e != 3) break;
                    e = 1;
                    g = f + 1;
                    if (g > 3) {
                        g = 0;
                    }
                    if (g == (h = g + 1)) {
                        h = g + 1;
                    }
                    if (h > 3) {
                        h = 0;
                    }
                    this.b(f);
                    break;
                }
                b = false;
                this.D = 0;
                if (a != 1) break;
                w.r.c = l.a(w.r.c, 244, 27);
                break;
            }
            case 16: 
            case 64: {
                if (!b) {
                    b = true;
                    w.r.d = 0;
                    w.r.g = 0;
                    if (a != 0) {
                        e = 0;
                    } else {
                        l.a.b();
                    }
                    if (a != 4) break;
                    w.r.d = 1;
                    break;
                }
                if (a == 0) {
                    if (e == 0) {
                        if (w.r.h > 2) {
                            if (e == 0) {
                                e = 1;
                            }
                            this.b(f);
                        } else if (w.r.d == 0 || w.r.d == 1) {
                            e = 1;
                            this.b(f);
                        }
                        r.b = w.r.d;
                        break;
                    }
                    if (e == 1) {
                        if (w.r.d != 1) {
                            if (w.r.h == 0) {
                                if (f != 0) break;
                                e = 2;
                                break;
                            }
                            if (w.r.h == 1) {
                                if (f > 1) break;
                                e = 2;
                                break;
                            }
                            if (w.r.h == 2) {
                                if (f > 2) break;
                                e = 2;
                                break;
                            }
                            if (w.r.h != 3) break;
                            if (w.r.d != 3) {
                                if (f > 3) break;
                                e = 2;
                                break;
                            }
                            if (f > 3) break;
                            e = 3;
                            this.b(g);
                            break;
                        }
                        if (w.r.h == 0) {
                            if (f != 0) break;
                            w.r.f = true;
                            break;
                        }
                        if (w.r.h == 1) {
                            if (f > 1) break;
                            w.r.f = true;
                            break;
                        }
                        if (w.r.h == 2) {
                            if (f > 2) break;
                            w.r.f = true;
                            break;
                        }
                        if (w.r.h != 3 || f > 3) break;
                        w.r.f = true;
                        break;
                    }
                    if (e == 2) {
                        if (!i) {
                            w.r.f = true;
                            break;
                        }
                        if (this.x <= 500) break;
                        w.r.f = true;
                        this.x = 0;
                        break;
                    }
                    if (e != 3) break;
                    e = 2;
                    break;
                }
                if (a == 1 || a != 4) break;
                if (w.r.d == 0) {
                    w.r.u = true;
                    break;
                }
                if (w.r.d != 1) break;
                b = false;
                w.r.d = 0;
                break;
            }
            case 1: {
                w.r.m = 0;
                if (!b) {
                    if (--a >= 0) break;
                    a = 4;
                    break;
                }
                if (a == 0) {
                    if (e != 0) break;
                    --w.r.d;
                    if (w.r.d >= 0) break;
                    w.r.d = 3;
                    break;
                }
                if (a == 1) {
                    --w.r.d;
                    if (w.r.d >= 0) break;
                    w.r.d = 2;
                    break;
                }
                if (a == 2) {
                    if (this.D <= 0) break;
                    --this.D;
                    break;
                }
                if (a != 4) break;
                --w.r.d;
                if (w.r.d >= 0) break;
                w.r.d = 1;
                break;
            }
            case 2: {
                w.r.m = 0;
                if (!b) {
                    if (++a <= 4) break;
                    a = 0;
                    break;
                }
                if (a == 0) {
                    if (e != 0) break;
                    ++w.r.d;
                    if (w.r.d <= 3) break;
                    w.r.d = 0;
                    break;
                }
                if (a == 1) {
                    ++w.r.d;
                    if (w.r.d <= 2) break;
                    w.r.d = 0;
                    break;
                }
                if (a == 2) {
                    if (this.C) break;
                    ++this.D;
                    break;
                }
                if (a != 4) break;
                ++w.r.d;
                if (w.r.d <= 1) break;
                w.r.d = 0;
                break;
            }
            case 8: {
                if (!b) break;
                if (a == 0) {
                    if (e == 1) {
                        if (++f > 3) {
                            f = 0;
                        }
                        if (++g > 3) {
                            g = 0;
                        }
                        if (++h > 3) {
                            h = 0;
                        }
                        this.b(f);
                        break;
                    }
                    if (e != 3) break;
                    ++h;
                    if (++g == f) {
                        g = f + 1;
                    }
                    if (h == f) {
                        h = f + 2;
                    }
                    if (g > 3) {
                        g = f == 0 ? 1 : 0;
                    }
                    if (g == h) {
                        h = g + 1;
                    }
                    if (h > 3) {
                        if (f == 0) {
                            h = 1;
                        } else {
                            h = 0;
                            if (g == h) {
                                h = g + 1;
                            }
                        }
                    }
                    if (f == 2 && g == 1) {
                        h = 3;
                    }
                    if (f == 1 && g == 0) {
                        h = 2;
                    }
                    this.b(g);
                    break;
                }
                if (a != 1 || w.r.d != 2) break;
                if (++k.g > 5) {
                    k.g = 0;
                }
                w.p.a();
                l.a.d();
                break;
            }
            case 4: {
                if (!b) break;
                if (a == 0) {
                    if (e == 1) {
                        if (--f < 0) {
                            f = 3;
                        }
                        if (--g < 0) {
                            g = 3;
                        }
                        if (--h < 0) {
                            h = 3;
                        }
                        this.b(f);
                        break;
                    }
                    if (e != 3) break;
                    --h;
                    if (f == --g) {
                        g = f - 1;
                    }
                    if (f == h) {
                        h = f - 2;
                    }
                    if (g < 0) {
                        g = f == 3 ? 2 : 3;
                    }
                    if (h < 0) {
                        if (f == 3) {
                            h = 2;
                        } else {
                            h = 3;
                            if (g == h) {
                                h = 0;
                            }
                        }
                    }
                    if (f == 2 && g == 0) {
                        h = 1;
                    }
                    this.b(g);
                    break;
                }
                if (a != 1 || w.r.d != 2) break;
                if (--k.g < 0) {
                    k.g = 5;
                }
                w.p.a();
                l.a.d();
            }
        }
        i.g = 0;
    }

    public final void a(int n) {
    }

    public final void a() {
    }

    public final void e() {
        if (this.s != null) {
            int n = 0;
            while (n < 4) {
                this.s[n] = null;
                this.t[n] = null;
                ++n;
            }
            this.s = null;
            this.t = null;
            this.u = null;
            w.m.setImage(null);
            this.v = null;
            this.w = null;
            n = 0;
            while (n < 4) {
                s.d[n] = null;
                ++n;
            }
        }
        System.gc();
    }

    private void h() {
        w.k.setColor(8094331);
        w.k.drawRect((k.b >> 1) - (w.p.b(8) >> 1), (k.c >> 4) - 10, w.p.b(8), 30);
        w.k.setColor(3621177);
        w.k.fillRect((k.b >> 1) - (w.p.b(8) >> 1) + 1, (k.c >> 4) - 10 + 1, w.p.b(8) - 1, 29);
        w.p.a(8, (k.b >> 1) - (w.p.b(8) >> 1) + 10, (k.c >> 4) - 5);
        w.k.drawImage(w.r.p, 4, (k.c >> 3) + 5 + 40, 0);
        w.k.drawRegion(w.r.p, 0, 0, 19, 16, 2, k.b - 19 - 4 + 1, (k.c >> 3) + 5 + 5, 0);
        w.k.drawImage(this.s[f], 28, (k.c >> 3) + 5, 0);
        w.k.drawImage(c[g], 121, (k.c >> 3) + 5, 0);
        w.k.drawImage(this.t[h], 180, (k.c >> 3) + 5, 0);
        w.p.c(31 + f, 28 + (this.s[f].getWidth() >> 1) - (w.p.a(31 + f) >> 1) + 2, (k.c >> 1) - 20);
        w.k.setColor(14995029);
        w.p.getClass();
        w.k.fillRoundRect((k.b >> 4) + 1, (k.c >> 1) - 20 + 1 * ((k.c >> 4) + 10) + 20 - 2 + 1, this.y, 3, 4, 4);
        w.p.getClass();
        w.k.fillRoundRect((k.b >> 4) + 1, (k.c >> 1) - 20 + 2 * ((k.c >> 4) + 10) + 20 - 2 + 1, this.z, 3, 4, 4);
        w.p.getClass();
        w.k.fillRoundRect((k.b >> 4) + 1, (k.c >> 1) - 20 + 3 * ((k.c >> 4) + 10) + 20 - 2 + 1, this.A, 3, 4, 4);
        w.p.getClass();
        w.k.fillRoundRect((k.b >> 4) + 1, (k.c >> 1) - 20 + 4 * ((k.c >> 4) + 10) + 20 - 2 + 1, this.B, 3, 4, 4);
        int n = 1;
        while (n < 5) {
            w.p.c(24 + n, k.b >> 4, (k.c >> 1) - 20 + n * ((k.c >> 4) + 10) - 4);
            w.k.setColor(13857087);
            w.p.getClass();
            w.k.drawRoundRect(k.b >> 4, (k.c >> 1) - 20 + n * ((k.c >> 4) + 10) + 20 - 2, w.p.a(28) - 12, 4, 4, 4);
            ++n;
        }
        if (w.r.h == 0) {
            if (f >= 1) {
                w.k.drawImage(this.w, (k.b >> 1) + (this.w.getWidth() >> 1) - 4, (k.c >> 1) + this.w.getHeight(), 0);
                return;
            }
        } else if (w.r.h == 1) {
            if (f >= 2) {
                w.k.drawImage(this.w, (k.b >> 1) + (this.w.getWidth() >> 1) - 4, (k.c >> 1) + this.w.getHeight(), 0);
                return;
            }
        } else if (w.r.h == 2) {
            if (f >= 3) {
                w.k.drawImage(this.w, (k.b >> 1) + (this.w.getWidth() >> 1) - 4, (k.c >> 1) + this.w.getHeight(), 0);
                return;
            }
        } else if (w.r.h == 3 && f >= 4) {
            w.k.drawImage(this.w, (k.b >> 1) + (this.w.getWidth() >> 1) - 4, (k.c >> 1) + this.w.getHeight(), 0);
        }
    }

    private void i() {
        w.k.setColor(8094331);
        w.k.drawRect((k.b >> 1) - (w.p.b(13) >> 1), (k.c >> 4) - 10, w.p.b(13), 30);
        w.k.setColor(3621177);
        w.k.fillRect((k.b >> 1) - (w.p.b(13) >> 1) + 1, (k.c >> 4) - 10 + 1, w.p.b(13) - 1, 29);
        w.p.a(13, (k.b >> 1) - (w.p.b(13) >> 1) + 10, (k.c >> 4) - 5);
        w.k.drawImage(w.r.p, 4, (k.c >> 3) + 5 + 40, 0);
        w.k.drawRegion(w.r.p, 0, 0, 19, 16, 2, k.b - 19 - 4 + 1 - 35, (k.c >> 3) + 5 + 5, 0);
        w.k.drawImage(this.s[g], 28, (k.c >> 3) + 5, 0);
        w.k.drawImage(c[h], 121, (k.c >> 3) + 5, 0);
        w.p.c(31 + g, 28 + (this.s[f].getWidth() >> 1) - (w.p.a(31 + f) >> 1) + 2, (k.c >> 1) - 20);
        w.k.setColor(14995029);
        w.p.getClass();
        w.k.fillRoundRect((k.b >> 4) + 1, (k.c >> 1) - 20 + 1 * ((k.c >> 4) + 10) + 20 - 2 + 1, this.y, 3, 4, 4);
        w.p.getClass();
        w.k.fillRoundRect((k.b >> 4) + 1, (k.c >> 1) - 20 + 2 * ((k.c >> 4) + 10) + 20 - 2 + 1, this.z, 3, 4, 4);
        w.p.getClass();
        w.k.fillRoundRect((k.b >> 4) + 1, (k.c >> 1) - 20 + 3 * ((k.c >> 4) + 10) + 20 - 2 + 1, this.A, 3, 4, 4);
        w.p.getClass();
        w.k.fillRoundRect((k.b >> 4) + 1, (k.c >> 1) - 20 + 4 * ((k.c >> 4) + 10) + 20 - 2 + 1, this.B, 3, 4, 4);
        int n = 1;
        while (n < 5) {
            w.p.c(24 + n, k.b >> 4, (k.c >> 1) - 20 + n * ((k.c >> 4) + 10) - 4);
            w.k.setColor(13857087);
            w.p.getClass();
            w.k.drawRoundRect(k.b >> 4, (k.c >> 1) - 20 + n * ((k.c >> 4) + 10) + 20 - 2, w.p.a(28) - 12, 4, 4, 4);
            ++n;
        }
    }

    private void j() {
        if (a != 0) {
            w.k.setColor(8094331);
            w.k.drawRect((k.b >> 2) - 5, (k.c >> 4) - 10, k.b >> 1, 30);
            w.k.setColor(3621177);
            w.k.fillRect((k.b >> 2) - 5 + 1, (k.c >> 4) - 10 + 1, (k.b >> 1) - 1, 29);
        }
        switch (a) {
            case 0: {
                if (e == 0) {
                    w.k.setColor(8094331);
                    w.k.drawRect((k.b >> 1) - (w.p.b(16) >> 1), (k.c >> 4) - 10, w.p.b(16), 30);
                    w.k.setColor(3621177);
                    w.k.fillRect((k.b >> 1) - (w.p.b(16) >> 1) + 1, (k.c >> 4) - 10 + 1, w.p.b(16) - 1, 29);
                    w.p.a(16, (k.b >> 1) - (w.p.b(16) >> 1) + 10, (k.c >> 4) - 5);
                    int n = 0;
                    while (n < 4) {
                        if (n == w.r.d) {
                            Image image = w.r.c;
                            int n2 = (k.b >> 1) - (w.r.c.getWidth() >> 1);
                            w.p.getClass();
                            w.p.getClass();
                            w.k.drawImage(image, n2, (k.c >> 2) + 20 + n * 30 - 2, 0);
                            int n3 = (k.b >> 1) - (w.p.b(17 + n) >> 1);
                            w.p.getClass();
                            w.p.getClass();
                            w.p.a(17 + n, n3, (k.c >> 2) + 20 + n * 30);
                        } else {
                            int n4 = (k.b >> 1) - (w.p.a(17 + n) >> 1);
                            w.p.getClass();
                            w.p.getClass();
                            w.p.c(17 + n, n4, (k.c >> 2) + 20 + n * 30);
                        }
                        ++n;
                    }
                    if (w.r.h < 3) {
                        int n5 = (k.b >> 1) - (w.p.a(19) >> 1) - this.w.getWidth();
                        w.p.getClass();
                        w.p.getClass();
                        w.k.drawImage(this.w, n5, (k.c >> 2) + 20 + 50 + 8, 0);
                        int n6 = (k.b >> 1) - (w.p.a(20) >> 1) - this.w.getWidth();
                        w.p.getClass();
                        w.p.getClass();
                        w.k.drawImage(this.w, n6, (k.c >> 2) + 20 + 80 + 8, 0);
                    }
                } else if (e == 1) {
                    this.h();
                } else if (e == 2) {
                    w.k.drawImage(this.s[f], 0, (k.c >> 1) + (k.c >> 3) - 79, 0);
                    w.k.drawImage(this.s[g], k.b - 90, (k.c >> 1) + (k.c >> 3) - 79, 0);
                    w.k.drawImage(this.u, (k.b >> 1) - (this.u.getWidth() >> 1), (k.c >> 1) + (k.c >> 3), 0);
                    int n = (k.b >> 1) - w.p.b(31 + f) - 40;
                    w.p.getClass();
                    w.p.a(31 + f, n, (k.c >> 1) + (k.c >> 3) + 10 + 3);
                    w.p.getClass();
                    w.p.a(31 + g, (k.b >> 1) + 40, (k.c >> 1) + (k.c >> 3) + 10 + 3);
                } else if (e == 3 && w.r.h == 3) {
                    this.i();
                }
                w.k.drawImage(w.r.b, k.b - 40, k.c - 35, 0);
                break;
            }
            case 1: {
                w.p.a(4, (k.b >> 1) - (w.p.b(4) >> 1), (k.c >> 4) - 5);
                Image image = w.r.c;
                int n = (k.b >> 1) - (w.r.c.getWidth() >> 1);
                w.p.getClass();
                int n7 = w.r.d;
                w.p.getClass();
                w.k.drawImage(image, n, (k.c >> 1) - 5 - 20 - 51 + n7 * 70, 0);
                if (w.r.d == 0) {
                    int n8 = (k.b >> 1) - (w.p.b(0) >> 1);
                    w.p.getClass();
                    int n9 = w.r.d;
                    w.p.getClass();
                    w.p.a(0, n8, (k.c >> 1) - 5 - 20 - 50 + n9 * 70);
                } else {
                    int n10 = (k.b >> 1) - (w.p.a(0) >> 1);
                    w.p.getClass();
                    w.p.getClass();
                    w.p.c(0, n10, (k.c >> 1) - 5 - 20 - 50 + 0);
                }
                if (w.r.d == 1) {
                    int n11 = (k.b >> 1) - (w.p.b(9) >> 1);
                    w.p.getClass();
                    int n12 = w.r.d;
                    w.p.getClass();
                    w.p.a(9, n11, (k.c >> 1) - 5 - 20 - 50 + n12 * 70);
                } else {
                    int n13 = (k.b >> 1) - (w.p.a(9) >> 1);
                    w.p.getClass();
                    w.p.getClass();
                    w.p.c(9, n13, (k.c >> 1) - 5 - 20 - 50 + 70);
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
                if (w.r.d == 2) {
                    int n14 = (k.b >> 1) - (w.p.b(14) >> 1);
                    w.p.getClass();
                    int n15 = w.r.d;
                    w.p.getClass();
                    w.p.a(14, n14, (k.c >> 1) - 5 - 20 - 50 + n15 * 70);
                    short[] sArray2 = sArrayArray2[k.g];
                    int n16 = (k.b >> 1) - (w.p.a(sArrayArray2[k.g], sArrayArray2[k.g].length) >> 1);
                    w.p.getClass();
                    w.p.getClass();
                    w.p.b(sArray2, n16, (k.c >> 1) - 5 - 20 - 50 + 140 + 25, sArrayArray2[k.g].length);
                } else {
                    int n17 = (k.b >> 1) - (w.p.a(14) >> 1);
                    w.p.getClass();
                    w.p.getClass();
                    w.p.c(14, n17, (k.c >> 1) - 5 - 20 - 50 + 140);
                    short[] sArray3 = sArrayArray2[k.g];
                    int n18 = (k.b >> 1) - (w.p.a(sArrayArray2[k.g], sArrayArray2[k.g].length) >> 1);
                    w.p.getClass();
                    w.p.getClass();
                    w.p.b(sArray3, n18, (k.c >> 1) - 5 - 20 - 50 + 140 + 25, sArrayArray2[k.g].length);
                }
                w.r.b();
                break;
            }
            case 2: {
                w.p.a(5, (k.b >> 1) - (w.p.b(5) >> 1), (k.c >> 4) - 5);
                w.p.getClass();
                w.p.getClass();
                this.C = w.p.a(45, 20, (k.c >> 4) - 2 + 20 + 10, 260, this.D, (k.b >> 1) - 40);
                if (this.D >= 1) {
                    if (!this.C) {
                        w.k.drawRegion(w.r.p, 0, 0, 19, 16, 5, (k.b >> 1) - 19, k.c - 20, 0);
                        w.k.drawRegion(w.r.p, 0, 0, 19, 16, 6, k.b >> 1, k.c - 20, 0);
                        break;
                    }
                    w.k.drawRegion(w.r.p, 0, 0, 19, 16, 5, (k.b >> 1) - 19, k.c - 20, 0);
                    break;
                }
                w.k.drawRegion(w.r.p, 0, 0, 19, 16, 6, k.b >> 1, k.c - 20, 0);
                break;
            }
            case 3: {
                w.p.a(6, (k.b >> 1) - (w.p.b(6) >> 1), (k.c >> 4) - 5);
                int n = 0;
                while (n < 7) {
                    int n19 = (k.b >> 1) - (w.p.a(35 + n) >> 1);
                    w.p.getClass();
                    w.p.c(35 + n, n19, (k.c >> 2) + (k.c >> 4) + n * 20);
                    ++n;
                }
                break;
            }
            case 4: {
                w.p.a(7, (k.b >> 1) - (w.p.b(7) >> 1), (k.c >> 4) - 5);
                w.p.d(10, 20, (k.c >> 1) - 50);
                Image image = w.r.c;
                int n = (k.b >> 1) - (w.r.c.getWidth() >> 1);
                w.p.getClass();
                w.p.getClass();
                int n20 = w.r.d;
                w.p.getClass();
                w.k.drawImage(image, n, (k.c >> 1) + (k.c >> 3) - 10 - 2 - 30 + n20 * 30, 0);
                int n21 = 0;
                while (n21 < 2) {
                    if (n21 == w.r.d) {
                        int n22 = (k.b >> 1) - (w.p.b(21 + n21) >> 1);
                        w.p.getClass();
                        w.p.getClass();
                        w.p.getClass();
                        w.p.a(21 + n21, n22, (k.c >> 1) + (k.c >> 3) - 10 - 30 + n21 * 30);
                    } else {
                        int n23 = (k.b >> 1) - (w.p.a(21 + n21) >> 1);
                        w.p.getClass();
                        w.p.getClass();
                        w.p.getClass();
                        w.p.c(21 + n21, n23, (k.c >> 1) + (k.c >> 3) - 10 - 30 + n21 * 30);
                    }
                    ++n21;
                }
                w.k.drawImage(w.r.b, k.b - 40, k.c - 35, 0);
            }
        }
        if (!i) {
            w.k.drawImage(w.r.a, 5, k.c - 35, 0);
        }
    }
}
