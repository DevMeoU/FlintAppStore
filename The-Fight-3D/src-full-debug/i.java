/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.m3g.Graphics3D;

public final class i
extends GameCanvas {
    public static MainMIDlet a;
    public static w b;
    public static w c;
    public static w d;
    public static w e;
    public static int f;
    public static int g;
    public static boolean h;
    private static i i;

    static {
        f = 0;
        g = 0;
    }

    public i(MainMIDlet mainMIDlet) {
        super(false);
        this.setFullScreenMode(true);
        i = this;
        h = false;
        k.b = ((Displayable)this).getWidth();
        k.c = ((Displayable)this).getHeight();
        a = mainMIDlet;
        w.k = this.getGraphics();
        w.l = Graphics3D.getInstance();
        w.q = new x();
        w.q.c(80.0f, 0.1f, 20000.0f);
        w.p = new t(w.k);
        if (l.a == null) {
            l.a = new f();
        }
        l.a.c();
        w.p.a();
        k.f = new y();
        i.a(0);
        i.d();
    }

    public static void a(int n2) {
        switch (n2) {
            case 0: {
                if (e != null) break;
                k.f.a(0);
                b = e = new n();
                return;
            }
            case 1: {
                e = null;
                if (d != null) break;
                b = d = new s();
                return;
            }
            case 2: {
                d = null;
                MainMIDlet.a = 1;
                k.d.a();
                return;
            }
            case 4: {
                if (c == null) {
                    c = new r();
                    c.a();
                    w.q.c(80.0f, 0.1f, 20000.0f);
                }
                b = c;
            }
        }
    }

    public final void keyPressed(int n2) {
        if (h) {
            h = false;
            MainMIDlet.a = MainMIDlet.b;
            if (!o.b) {
                if (k.e) {
                    k.f.d();
                }
                System.out.println("external pause");
            }
            w.o = System.currentTimeMillis();
            return;
        }
        b.a(n2);
        switch (n2) {
            case -1: 
            case 50: {
                f |= 1;
                g |= 1;
                return;
            }
            case -2: 
            case 56: {
                f |= 2;
                g |= 2;
                return;
            }
            case -3: 
            case 52: {
                f |= 4;
                g |= 4;
                if (s.a == 1 && w.r.d < 2) {
                    w.r.m = 4;
                }
                if (w.r.t != 1 || w.r.d >= 2) break;
                w.r.m = 4;
                return;
            }
            case -4: 
            case 54: {
                f |= 8;
                g |= 8;
                if (s.a == 1 && w.r.d < 2) {
                    w.r.m = 8;
                }
                if (w.r.t != 1 || w.r.d >= 2) break;
                w.r.m = 8;
                return;
            }
            case -5: 
            case 53: {
                f |= 0x10;
                g |= 0x10;
                return;
            }
            case -21: 
            case -6: {
                f |= 0x20;
                g |= 0x20;
                return;
            }
            case -22: 
            case -7: {
                f |= 0x40;
                g |= 0x40;
                return;
            }
            case 35: {
                f |= 0x80;
                g |= 0x80;
                return;
            }
            case 42: {
                f |= 0x100;
                g |= 0x100;
                return;
            }
            case 48: {
                f |= 0x200;
                g |= 0x200;
                return;
            }
            case 49: {
                f |= 0x400;
                g |= 0x400;
                return;
            }
            case 51: {
                f |= 0x800;
                g |= 0x800;
                return;
            }
            case 55: {
                f |= 0x1000;
                g |= 0x1000;
                return;
            }
            case 57: {
                f |= 0x2000;
                g |= 0x2000;
            }
        }
    }

    public final void keyReleased(int n2) {
        if (h) {
            return;
        }
        switch (n2) {
            case -1: 
            case 50: {
                f ^= 1;
                return;
            }
            case -2: 
            case 56: {
                f ^= 2;
                return;
            }
            case -3: 
            case 52: {
                f ^= 4;
                return;
            }
            case -4: 
            case 54: {
                f ^= 8;
                return;
            }
            case -5: 
            case 53: {
                f ^= 0x10;
                return;
            }
            case -21: 
            case -6: {
                f ^= 0x20;
                return;
            }
            case -22: 
            case -7: {
                f ^= 0x40;
                return;
            }
            case 35: {
                f ^= 0x80;
                return;
            }
            case 42: {
                f ^= 0x100;
                return;
            }
            case 48: {
                f ^= 0x200;
                return;
            }
            case 49: {
                f ^= 0x400;
                return;
            }
            case 51: {
                f ^= 0x800;
                return;
            }
            case 55: {
                f ^= 0x1000;
                return;
            }
            case 57: {
                f ^= 0x2000;
            }
        }
    }

    public final void keyRepeated(int n2) {
        switch (n2) {
            case -3: 
            case 52: {
                f |= 4;
                g |= 4;
                if (s.a == 1 && w.r.d < 2) {
                    w.r.m = 4;
                }
                if (w.r.t != 1 || w.r.d >= 2) break;
                w.r.m = 4;
                return;
            }
            case -4: 
            case 54: {
                f |= 8;
                g |= 8;
                if (s.a == 1 && w.r.d < 2) {
                    w.r.m = 8;
                }
                if (w.r.t != 1 || w.r.d >= 2) break;
                w.r.m = 8;
            }
        }
    }

    public final void sizeChanged(int n2, int n3) {
        w.k = this.getGraphics();
        k.b = n2;
        k.c = n3;
    }

    public final void hideNotify() {
        if (!h) {
            h = true;
            MainMIDlet.b = MainMIDlet.a;
            if (k.e) {
                k.f.c();
            }
            MainMIDlet.a = 3;
        }
        f = 0;
        g = 0;
    }

    public final void a() {
        try {
            if (MainMIDlet.a == 0) {
                b.f();
                b.b();
                b.c();
                b.d();
                this.flushGraphics();
                return;
            }
        }
        catch (Exception exception) {
            System.out.println("Rungame\t " + exception);
            exception.printStackTrace();
        }
    }

    public static void b() {
        if (k.d != null) {
            k.d.b();
            k.d = null;
        }
        if (b != null) {
            b.e();
            b = null;
        }
    }

    private static void d() {
        k.d = new o(i);
    }

    public final void c() {
        w.k.setColor(0);
        w.k.fillRect(0, 0, k.b, k.c);
        if (k.g == 2 || k.g == 3) {
            w.k.setColor(8094331);
            int n2 = w.p.g(12, 20, 20) + 1;
            w.p.getClass();
            w.k.drawRoundRect(2, (k.c >> 1) - 17, k.b - 4, n2 * 20 + 6, 20, 20);
            w.k.setColor(3621177);
            int n3 = w.p.g(12, 20, 20) + 1;
            w.p.getClass();
            w.k.fillRoundRect(3, (k.c >> 1) - 17 + 1, k.b - 5, n3 * 20 + 6 - 1, 20, 20);
            w.p.b(12, 20, (k.c >> 1) - 17);
        } else {
            w.k.setColor(8094331);
            int n4 = (k.b >> 1) - (w.p.b(12) >> 1) - 4;
            int n5 = w.p.b(12) + 6;
            w.p.getClass();
            w.k.drawRoundRect(n4, (k.c >> 1) - 9, n5, 23, 20, 20);
            w.k.setColor(3621177);
            int n6 = (k.b >> 1) - (w.p.b(12) >> 1) - 3 + 1;
            int n7 = w.p.b(12) + 4;
            w.p.getClass();
            w.k.fillRoundRect(n6, (k.c >> 1) - 9 + 1, n7, 22, 20, 20);
            w.p.a(12, (k.b >> 1) - (w.p.b(12) >> 1), (k.c >> 1) - 9);
        }
        this.flushGraphics();
    }
}
