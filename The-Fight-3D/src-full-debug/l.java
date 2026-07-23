/*
 * Decompiled with CFR 0.152.
 */
import javax.microedition.lcdui.Image;
import javax.microedition.m3g.Node;

public final class l {
    private static Node[] b = null;
    private static int[] c;
    private static int d;
    private static int[] e;
    public static f a;

    static {
        d = 5;
        e = new int[]{1, 2, 3, 4, 5};
    }

    private static final void a(int n, Node node, int n2) {
        if (c != null) {
            int n3 = 0;
            while (n3 < c.length) {
                if (c[n3] == n) {
                    return;
                }
                ++n3;
            }
            l.c[n2] = n;
            l.b[n2] = node;
            return;
        }
        c = new int[10];
        b = new Node[10];
        l.c[n2] = n;
        l.b[n2] = node;
    }

    public static final Node a(int n) {
        if (c != null) {
            int n2 = 0;
            while (n2 < c.length) {
                if (c[n2] == n) {
                    return b[n2];
                }
                ++n2;
            }
        }
        return null;
    }

    public static final void b(int n) {
        int n2 = 0;
        while (n2 < c.length) {
            if (c[n2] == n) {
                l.c[n2] = 0;
                l.b[n2] = null;
            }
            ++n2;
        }
    }

    public static final void a() {
        if (c != null) {
            c = null;
            b = null;
        }
    }

    public static Image a(Image image, int n, int n2) {
        int[] nArray = new int[image.getHeight() * image.getWidth()];
        image.getRGB(nArray, 0, image.getWidth(), 0, 0, image.getWidth(), image.getHeight());
        int[] nArray2 = new int[n * n2];
        int n3 = image.getHeight() / n2 * image.getWidth() - image.getWidth();
        int n4 = image.getHeight() % n2;
        int n5 = image.getWidth() / n;
        int n6 = image.getWidth() % n;
        int n7 = 0;
        int n8 = 0;
        int n9 = n2;
        int n10 = 0;
        while (n9 > 0) {
            int n11 = n;
            int n12 = 0;
            while (n11 > 0) {
                nArray2[n7++] = nArray[n8];
                n8 += n5;
                if ((n12 += n6) >= n) {
                    n12 -= n;
                    ++n8;
                }
                --n11;
            }
            n8 += n3;
            if ((n10 += n4) >= n2) {
                n10 -= n2;
                n8 += image.getWidth();
            }
            --n9;
        }
        return Image.createRGBImage(nArray2, n, n2, true);
    }

    public static void c(int n) {
        try {
            switch (n) {
                case 1: {
                    Node node = h.a(k.h[s.f]);
                    l.a(1, node, 0);
                    try {
                        h.a(node, Image.createImage("/face" + s.f + ".png"), Image.createImage("/body" + s.f + ".png"));
                    }
                    catch (Exception exception) {}
                    node = h.a("/legEffect" + (s.f + 1) + ".m3g");
                    l.a(8, node, 1);
                    return;
                }
                case 2: {
                    Node node = h.a(k.h[s.g]);
                    l.a(2, node, 2);
                    try {
                        h.a(node, Image.createImage("/face" + s.g + ".png"), Image.createImage("/body" + s.g + ".png"));
                    }
                    catch (Exception exception) {}
                    node = h.a("/legEffect" + (s.g + 1) + ".m3g");
                    l.a(9, node, 3);
                    return;
                }
                case 3: {
                    int n2 = k.a.nextInt(d);
                    if (e[n2] == 1 || e[n2] == 5) {
                        w.m.setColorClearEnable(false);
                        try {
                            r.c = Image.createImage("/s" + e[n2] + ".png");
                        }
                        catch (Exception exception) {}
                    } else {
                        w.m.setColorClearEnable(true);
                        w.m.setColor(0x99CCFF);
                    }
                    Node node = h.a("/Set" + e[n2] + ".m3g");
                    z.u = e[n2];
                    l.e[n2] = 0;
                    int n3 = 0;
                    while (n3 < d) {
                        if (e[n3] == 0 && n3 != d) {
                            l.e[n3] = e[d - 1];
                        }
                        ++n3;
                    }
                    if (--d == 0) {
                        d = 5;
                        l.e[0] = 1;
                        l.e[1] = 2;
                        l.e[2] = 3;
                        l.e[3] = 4;
                        l.e[4] = 5;
                    }
                    l.a(3, node, 4);
                    return;
                }
                case 4: {
                    Node node = h.a("/lostEffect.m3g");
                    l.a(4, node, 5);
                    node = h.a("/strikeEffect.m3g");
                    l.a(5, node, 6);
                    node = h.a("/groundBreak.m3g");
                    l.a(6, node, 7);
                    node = h.a("/landBreak.m3g");
                    l.a(7, node, 8);
                    node = h.a("/specialEffect.m3g");
                    l.a(10, node, 9);
                    return;
                }
            }
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }
}
