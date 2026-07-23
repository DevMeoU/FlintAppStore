/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a {
    public static e a;
    public int W = a.getWidth();
    public int X = a.getHeight();
    public int Y = this.W >> 1;
    public int Z = this.X >> 1;
    public static String[] c;
    public static short[] b;
    public static int aa;
    public static int ab;
    public static int ac;

    public void a() {
    }

    public void a(int n, int n2) {
    }

    public void c() throws Exception {
    }

    public void a(Graphics graphics) {
    }

    public static final String[] a(String string, int n, Font font) {
        int n2;
        Vector<String> vector = new Vector<String>();
        int n3 = 0;
        boolean bl = false;
        int n4 = string.length();
        String string2 = null;
        do {
            n2 = n3;
            int n5 = string.indexOf(10, n2);
            block1: do {
                int n6 = n2;
                String string3 = string2;
                n2 = a.a(string, n2);
                if (n5 > -1 && n5 < n2) {
                    n2 = n5;
                }
                if (font.stringWidth(string2 = string.substring(n3, n2).trim()) <= n) continue;
                if (n6 == n3) {
                    for (int i = string2.length() - 1; i > 0; --i) {
                        String string4 = string2.substring(0, i);
                        if (font.stringWidth(string4) > n) continue;
                        n2 = n6 + i;
                        string2 = string4;
                        break block1;
                    }
                    break;
                }
                n2 = n6;
                string2 = string3;
                break;
            } while (n2 != n5 && n2 < n4);
            vector.addElement(string2);
        } while ((n3 = ++n2) < n4);
        Object[] objectArray = new String[vector.size()];
        vector.copyInto(objectArray);
        return objectArray;
    }

    private static final int a(String string, int n) {
        int n2;
        char c = string.charAt(n);
        if (a.a(c)) {
            return n + 1;
        }
        int n3 = 0;
        while ((n2 = string.indexOf(32, n)) == 0) {
            ++n;
        }
        n3 = n2;
        n3 = n3 == -1 ? string.length() : ++n3;
        for (n2 = n + 1; n2 < n3; ++n2) {
            if (!a.a(string.charAt(n2))) continue;
            return n2;
        }
        return n3;
    }

    private static final boolean a(int n) {
        return n >= 11904 && n < 44032 || n >= 63744 && n < 64256 || n >= 65280 && n < 65504;
    }

    public static final int a(String string, boolean bl) throws Exception {
        InputStream inputStream = b.a.getClass().getResourceAsStream(string);
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        c = new String[dataInputStream.readInt()];
        int n = c.length;
        for (int i = 0; i < n; ++i) {
            String string2;
            a.c[i] = string2 = dataInputStream.readUTF();
        }
        dataInputStream.close();
        return c.length;
    }

    public static final String a(int n) {
        return a.a(n, false);
    }

    public static final String a(int n, boolean bl) {
        if (n < c.length) {
            String string = c[n];
            if (bl) {
                string = a.a(string, "%K5", a.a(20, a.a(16)), true);
                string = a.a(string, "%K0", a.a(32), true);
                string = a.a(string, "%K7", a.a(256), true);
                if ((string = a.a(string, "%K9", a.a(512), true)).indexOf("%KM") != -1) {
                    StringBuffer stringBuffer = new StringBuffer();
                    String[] stringArray = new String[]{a.a(1), a.a(2), a.a(4), a.a(8)};
                    stringBuffer.append(a.a(17, stringArray));
                    if (stringBuffer.length() > 0) {
                        stringBuffer.append('/');
                    }
                    stringBuffer.append(a.a(18));
                    string = a.a(string, "%KM", stringBuffer.toString(), true);
                }
            }
            return string;
        }
        return "?: " + n;
    }

    public static final String a(int n, String[] stringArray) {
        String string = new String(a.a(n));
        for (int i = 0; i < stringArray.length; ++i) {
            string = a.a(string, "%U", stringArray[i], false);
        }
        return string;
    }

    public static final String a(int n, String string) {
        return a.a(a.a(n), "%U", string, false);
    }

    public static final String a(String string, String string2, String string3, boolean bl) {
        int n;
        String string4 = string;
        while ((n = string4.indexOf(string2)) != -1) {
            string4 = string4.substring(0, n) + string3 + string4.substring(n + string2.length());
            if (bl) continue;
        }
        return string4;
    }

    public static final void d() {
        boolean bl = false;
        ab = aa >> 1;
        ac = ab >> 1;
        b = new short[aa];
        int n = aa * 10000 / 2 / 31415;
        int n2 = 1024 * n;
        int n3 = 0;
        for (int i = 0; i < aa; ++i) {
            int n4 = n3 / n;
            a.b[i] = (short)n4;
            n3 += (n2 -= n4) / n;
        }
        a.b[180] = 0;
        a.b[270] = -1024;
    }

    public static final short a(int n) {
        return b[n %= 360];
    }

    public static final short b(int n) {
        n = (n + ac) % 360;
        return b[n];
    }

    static {
        b = null;
        aa = 360;
        ab = 0;
        ac = 0;
    }
}
