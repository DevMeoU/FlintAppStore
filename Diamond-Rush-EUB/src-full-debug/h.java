/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class h {
    public static int a;
    public static int b;
    private static int e;
    public static int c;
    public int d = 0;
    public int[] a;
    public int[] b;
    private static byte[] a;
    public Font a = new int[2];

    public h(int n) {
        ((h)((Object)inputStream)).b = new int[3];
        e = n;
        c = 0xFFFFFF;
        ((h)((Object)inputStream)).a = Font.getFont(0, 1, n);
        ((h)((Object)inputStream)).a[0] = 4;
        ((h)((Object)inputStream)).a[1] = 14;
        ((h)((Object)inputStream)).b[0] = 0;
        ((h)((Object)inputStream)).b[0] = 0;
        ((h)((Object)inputStream)).b[0] = 0;
        InputStream inputStream = inputStream.getClass().getResourceAsStream("/mc");
        a = new byte[256];
        try {
            inputStream.read(a);
            inputStream.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static int a() {
        return e;
    }

    public final void a(Graphics graphics, String stringArray, int n, int n2, int n3) {
        stringArray = h.a((String)stringArray);
        int n4 = this.a.getHeight();
        for (int i = 0; i < stringArray.length; ++i) {
            this.b(graphics, stringArray[i], n, n2 + i * n4, n3);
        }
    }

    private static String[] a(Vector object) {
        String[] stringArray = new String[((Vector)object).size()];
        object = ((Vector)object).elements();
        int n = 0;
        while (object.hasMoreElements()) {
            stringArray[n] = ((String)object.nextElement()).trim();
            ++n;
        }
        return stringArray;
    }

    private static String[] a(String string) {
        Vector<String> vector = new Vector<String>();
        String string2 = "";
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            string2 = string2 + c;
            if (c != '\n' && i != string.length() - 1) continue;
            vector.addElement(string2);
            string2 = "";
        }
        return h.a(vector);
    }

    public final void a(String stringArray) {
        a = 0;
        stringArray = h.a((String)stringArray);
        for (int i = 0; i < stringArray.length; ++i) {
            int n = this.a.stringWidth(stringArray[i]);
            if (n <= a) continue;
            a = n;
        }
        b = stringArray.length * this.a.getHeight();
    }

    public final void a(Graphics graphics, String string, int n, int n2, int n3, int n4) {
        this.a(string);
        graphics.setColor(n3);
        graphics.setFont(this.a);
        graphics.drawString(string, n, n2 -= 12, 0);
    }

    public final void b(Graphics graphics, String string, int n, int n2, int n3) {
        block2: {
            int n4;
            int n5;
            block4: {
                block3: {
                    n2 -= 12;
                    if ((n3 & 0x2B) == 0) break block2;
                    this.a(string);
                    if ((n3 & 8) == 0) break block3;
                    n5 = n;
                    n4 = a;
                    break block4;
                }
                if ((n3 & 1) == 0) break block2;
                n5 = n;
                n4 = a >> 1;
            }
            n = n5 - n4;
        }
        graphics.setColor(0xFFFFFF);
        graphics.setFont(this.a);
        graphics.drawString(string, n, n2, 0);
    }

    public final int b() {
        return this.a.getHeight();
    }

    public static void a() {
        c = 0xFFFFFF;
    }

    public static void a(int n) {
        c = n;
    }

    public final int a(String string) {
        int n = 1;
        int n2 = string.length();
        int n3 = string.indexOf(10);
        while (n3 != -1) {
            ++n;
            n3 = n3 < n2 - 1 ? string.indexOf(10, n3 + 1) : -1;
        }
        return this.a.getHeight() * n;
    }

    static {
        e = 0;
        c = 0;
    }
}
