/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Form
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.media.Manager
 *  javax.microedition.media.Player
 *  javax.microedition.midlet.MIDlet
 *  javax.microedition.rms.RecordStore
 */
import com.alcatelonetouchx.JavaMagicGameCanvas;
import com.nokia.mid.ui.DirectUtils;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Random;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class e
extends JavaMagicGameCanvas
implements Runnable,
CommandListener {
    public static final Font a = Font.getFont((int)0, (int)2, (int)8);
    public static final Font b = Font.getFont((int)0, (int)1, (int)8);
    public static final int a = b.getBaselinePosition();
    public static final int b = a + 6;
    public static final int c = a.getBaselinePosition();
    public static final int d = c + 6;
    public static final short[] a = new short[]{45, 43};
    public static final short[] b = new short[]{57, 57};
    public static final byte[][] a = new byte[][]{{10, 11, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {12, -1, 11, -1, 10, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9}};
    private static Display a;
    private boolean d = false;
    private boolean e = true;
    public a a;
    public static int e;
    public static int f;
    public int g = 0;
    public int h;
    public int i = 0;
    public long a;
    public static h[] a;
    public static Random a;
    public static boolean[] a;
    public static String[] a;
    public Graphics a;
    public boolean a;
    public boolean b = false;
    public static int j;
    public static int k;
    public static int l;
    public static boolean c;
    public static final String[] b;
    public static final byte[] a;
    public static Player[] a;
    public static Player a;
    public static boolean[] b;
    public static int m;
    public static int n;
    public static byte[][] b;
    public static String[] c;

    public e(MIDlet mIDlet) {
        super(false);
        this.setFullScreenMode(true);
        this.a = this.getGraphics();
        try {
            Manager.createPlayer(null, (String)"audio/midi");
        }
        catch (Exception exception) {}
        try {
            a.a = this;
            a.a("/lang.dat", false);
            e = this.getWidth();
            f = this.getHeight();
            a = Display.getDisplay((MIDlet)mIDlet);
            a.setCurrent((Displayable)this);
            new Thread(this).start();
            return;
        }
        catch (Exception exception) {
            this.a(exception.toString());
            return;
        }
    }

    public final int getHeight() {
        return 208;
    }

    public static final int a(int n) {
        return e.a(0, n);
    }

    public static final int a(int n, int n2) {
        return n + Math.abs(a.nextInt()) % (n2 - n);
    }

    public static final int a() {
        return a.nextInt();
    }

    public static final byte[] a(String string, int n) throws Exception {
        string = string + n;
        RecordStore recordStore = RecordStore.openRecordStore((String)string, (boolean)false);
        byte[] byArray = recordStore.getRecord(1);
        recordStore.closeRecordStore();
        return byArray;
    }

    public static final void a(String string, int n, byte[] byArray) throws Exception {
        string = string + n;
        try {
            RecordStore.deleteRecordStore((String)string);
        }
        catch (Exception exception) {}
        RecordStore recordStore = RecordStore.openRecordStore((String)string, (boolean)true);
        if (recordStore.getNumRecords() == 0) {
            recordStore.addRecord(byArray, 0, byArray.length);
        } else {
            recordStore.setRecord(1, byArray, 0, byArray.length);
        }
        recordStore.closeRecordStore();
    }

    public static final int a(String string, byte[] byArray) throws Exception {
        RecordStore recordStore = RecordStore.openRecordStore((String)string, (boolean)true);
        int n = recordStore.addRecord(byArray, 0, byArray.length);
        recordStore.closeRecordStore();
        return n - 1;
    }

    public static final void a(String string, int n) throws Exception {
        RecordStore recordStore = RecordStore.openRecordStore((String)string, (boolean)true);
        recordStore.deleteRecord(n + 1);
        recordStore.closeRecordStore();
    }

    public static final int a(String string) {
        int n = 0;
        try {
            RecordStore recordStore = RecordStore.openRecordStore((String)string, (boolean)true);
            n = recordStore.getSizeAvailable();
            recordStore.closeRecordStore();
        }
        catch (Exception exception) {}
        return n;
    }

    public static final int a(byte by, String string) {
        if (string == null) {
            return 0;
        }
        return e.a[by].p * string.length();
    }

    public static final int a(byte by) {
        return e.a[by].q;
    }

    public static final void a(Graphics graphics, int n) {
        graphics.setColor(n);
    }

    public static final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5) {
        DirectUtils.getDirectGraphics(graphics).setARGBColor(n);
        graphics.fillRect(n2, n3, n4, n5);
    }

    public final void a() {
        this.b = true;
        this.a = true;
    }

    public final void b() {
        this.b = false;
        this.a = false;
    }

    public final void showNotify() {
        this.d();
        if (this.a != null) {
            this.a.a();
        }
    }

    public final void hideNotify() {
        this.d();
        if (this.a != null) {
            if (!this.b && !c) {
                c = true;
                if (a != null && a[0] && n == -1) {
                    j = m;
                    k = n;
                }
                e.h();
            }
            if (!this.a) {
                this.b = false;
            }
        }
    }

    public static final void a(Graphics graphics, String string, int n, int n2, int n3, int n4) {
        if ((n4 & 8) != 0) {
            n -= e.a((byte)n3, string);
        } else if ((n4 & 1) != 0) {
            n -= e.a((byte)n3, string) / 2;
        }
        if ((n4 & 0x20) != 0) {
            n2 -= e.a((byte)n3);
        } else if ((n4 & 2) != 0) {
            n2 -= e.a((byte)n3) / 2;
        }
        e.a(graphics, string, n, n2, n3);
    }

    public static final void a(Graphics graphics, String string, int n, int n2, int n3) {
        if (string == null) {
            return;
        }
        boolean bl = false;
        int n4 = string.length();
        for (int j = 0; j < n4; ++j) {
            char c2 = string.charAt(j);
            if (c2 < a[n3] || c2 > b[n3]) continue;
            byte by = a[n3][c2 - a[n3]];
            if (by != -1) {
                a[n3].c(by);
                a[n3].a(graphics, n, n2);
                n += e.a[n3].p;
                continue;
            }
            byte[] byArray = new byte[]{(byte)c2};
            String string2 = new String(byArray);
            graphics.drawString(string2, n, n2, 20);
            n += graphics.getFont().stringWidth(string2);
        }
    }

    public static final void b(Graphics graphics, String string, int n, int n2, int n3) {
        graphics.drawString(string, n, n2, n3);
    }

    public final void a(a a2) {
        this.d();
        a2.a();
        this.a = a2;
    }

    public final void c() {
        this.a.setClip(0, 0, e, f);
        this.paint(this.a);
        this.flushGraphics();
    }

    public final void paint(Graphics graphics) {
        if (this.e) {
            graphics.setColor(0xFFFFFF);
            graphics.fillRect(0, 0, e, f);
            graphics.setFont(b);
            graphics.setColor(0);
            graphics.drawString(a.a(58), e / 2, f / 2 - 1, 33);
            return;
        }
        if (c) {
            graphics.setFont(b);
            graphics.setColor(0);
            graphics.fillRect(0, 0, e, f);
            graphics.setColor(0xFFFFFF);
            graphics.drawString(a.a(21), e >> 1, f - a >> 1, 17);
            return;
        }
        this.a.a(graphics);
    }

    public final int getGameAction(int n) {
        try {
            switch (n) {
                case -6: {
                    return 1024;
                }
                case -7: {
                    return 2048;
                }
                case 48: {
                    return 32;
                }
                case 53: {
                    return 16;
                }
                case 49: {
                    return 64;
                }
                case 51: {
                    return 128;
                }
                case 55: {
                    return 256;
                }
                case 57: {
                    return 512;
                }
                case 50: {
                    return 1;
                }
                case 56: {
                    return 2;
                }
                case 52: {
                    return 4;
                }
                case 54: {
                    return 8;
                }
            }
            switch (super.getGameAction(n)) {
                case 1: {
                    return 1;
                }
                case 6: {
                    return 2;
                }
                case 2: {
                    return 4;
                }
                case 5: {
                    return 8;
                }
                case 8: {
                    return 16;
                }
            }
        }
        catch (Exception exception) {}
        return 4096;
    }

    public final String a(int n) {
        int n2 = 0;
        switch (n) {
            case 32: {
                n2 = 48;
                break;
            }
            case 16: {
                n2 = 53;
                break;
            }
            case 64: {
                n2 = 49;
                break;
            }
            case 128: {
                n2 = 51;
                break;
            }
            case 256: {
                n2 = 55;
                break;
            }
            case 512: {
                n2 = 57;
                break;
            }
            case 1: {
                n2 = 50;
                break;
            }
            case 2: {
                n2 = 56;
                break;
            }
            case 4: {
                n2 = 52;
                break;
            }
            case 8: {
                n2 = 54;
            }
        }
        return super.getKeyName(n2);
    }

    public final void keyPressee(int n) {
        if (c) {
            if (n == 42) {
                c = false;
                l = 5;
            }
            return;
        }
        int n2 = this.getGameAction(n);
        this.a(n2);
        if (this.a != null) {
            this.a.a(n, n2);
        }
    }

    public final boolean a() {
        return this.g != 0;
    }

    public final void d() {
        this.i = 0;
        this.g = 0;
        this.h = 0;
    }

    public final boolean a(int n) {
        boolean bl = (this.h & n) != 0;
        this.h &= ~n;
        return bl;
    }

    public final boolean b(int n) {
        return (this.g & n) != 0;
    }

    public final void keyReleasee(int n) {
        this.b(this.getGameAction(n));
    }

    public final boolean c(int n) {
        return this.i == n && System.currentTimeMillis() - this.a >= 400L;
    }

    public final void a(int n) {
        this.i = n;
        this.a = System.currentTimeMillis();
        this.g |= n;
        this.h |= n;
    }

    public final void b(int n) {
        if (n == this.i) {
            this.i = 0;
        }
        this.g &= ~n;
    }

    public final void a(String string) {
        this.d = false;
        Form form = new Form("Fatal error!");
        form.append(string);
        Command command = new Command("Exit", 7, 1);
        form.addCommand(command);
        form.setCommandListener((CommandListener)this);
        a.setCurrent((Displayable)form);
    }

    public final void e() {
        this.d = false;
    }

    public static final void f() throws Exception {
        e.a[0] = new h("chars");
        e.a[1] = new h("lchars");
    }

    public final void run() {
        try {
            this.c();
            String[] stringArray = new String[]{a.a(26), a.a(25), a.a(24)};
            a = stringArray;
            i i2 = new i();
            this.c();
            this.a = i2;
            this.e = false;
            this.d = true;
            i2.b();
            while (this.d) {
                int n;
                int n2;
                long l = System.currentTimeMillis();
                if (this.isShown() && !c) {
                    if (j >= 0 && --e.l <= 0) {
                        e.b(j, k);
                        if (a != null && a.getState() == 400) {
                            j = -1;
                        }
                    }
                    this.a.c();
                    this.c();
                }
                if ((n2 = 65 - (n = (int)(System.currentTimeMillis() - l))) < 10) {
                    n2 = 10;
                }
                if (n2 <= 0) continue;
                try {
                    Thread.sleep(n2);
                }
                catch (Exception exception) {}
            }
            e.h();
            if (b.a != null) {
                b.a.notifyDestroyed();
                b.a.destroyApp(true);
            }
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            this.a(exception2.toString());
            return;
        }
    }

    public static final void g() {
        a = new Player[b.length];
        b = new boolean[b.length];
    }

    public static final void c(int n) {
        try {
            e.b[n] = false;
            InputStream inputStream = e.a(b[n] + ".mid");
            if (inputStream != null) {
                e.b[n] = true;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static final void a(int n, int n2) {
        e.b(n, n2);
    }

    public static final void h() {
        try {
            if (a != null) {
                a.close();
                a = null;
                m = -1;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static final void b(int n, int n2) {
        try {
            if (!b[n]) {
                return;
            }
            if (a != null) {
                a.close();
            }
            if (a[n] == 1 && a[0]) {
                if (n2 == 0) {
                    n2 = -1;
                }
                if (c) {
                    j = n;
                    k = n2;
                } else {
                    a = Manager.createPlayer((InputStream)e.a(b[n] + ".mid"), (String)"audio/midi");
                    a.setLoopCount(n2);
                    a.start();
                    m = n;
                    e.n = n2;
                }
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static final void d(int n) {
        try {
            if (!b[n]) {
                return;
            }
            if (a == a[n]) {
                a.close();
                a = null;
                m = -1;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static final void b(String string) throws Exception {
        if (c == null) {
            c = null;
            int[] nArray = null;
            int[] nArray2 = null;
            InputStream inputStream = ((Object)((Object)b.a)).getClass().getResourceAsStream("/1.pak");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            short s = dataInputStream.readShort();
            int n = dataInputStream.readShort();
            c = new String[n];
            nArray = new int[n];
            nArray2 = new int[n];
            for (int j = 0; j < n; ++j) {
                e.c[j] = dataInputStream.readUTF();
                nArray[j] = dataInputStream.readInt() + s;
                nArray2[j] = dataInputStream.readShort();
            }
            b = new byte[c.length][];
            for (int j = 0; j < c.length; ++j) {
                e.b[j] = new byte[nArray2[j]];
                dataInputStream.readFully(b[j]);
            }
            dataInputStream.close();
            new f("splash");
        }
    }

    public static final byte[] a(String string) {
        for (int j = 0; j < c.length; ++j) {
            if (!string.equals(c[j])) continue;
            return b[j];
        }
        return null;
    }

    public static final InputStream a(String string) throws Exception {
        return new ByteArrayInputStream(e.a(string));
    }

    public final void commandAction(Command command, Displayable displayable) {
        b.a.notifyDestroyed();
    }

    static {
        a = new h[2];
        a = new Random();
        a = new boolean[]{true, true, true};
        j = -1;
        c = false;
        b = new String[]{"main_theme", "bg_story", "bg_good", "bg_bad", "battle_good", "battle_bad", "victory", "gameover", "game_complete"};
        a = new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        String[] stringArray = new String[]{"soldier", "archer.", "lizard", "wizard", "wisp", "spider", "golem", "catapult", "wyvern", "king_0", "skeleton", "unit_icons"};
    }
}

