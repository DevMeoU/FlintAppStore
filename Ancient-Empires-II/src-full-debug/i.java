/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class i
extends a
implements Runnable {
    public String a;
    public static byte a = (byte)32;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public static String[] a = new String[12];
    public static int[] a = new int[]{4, 5, 6, 7, 8, 9, 10, 11};
    public boolean[] a;
    public static final short[] a = new short[]{500, 1000, 2000};
    public static final short[] c = new short[]{10, 20, 25};
    public int f;
    public int g;
    public byte b;
    public static int h = 1024;
    public static int i = 2048;
    public String[] b;
    public String[] d;
    public f[] a;
    public String[] e;
    public f[] b;
    public String[] f;
    public String[] g;
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public static final byte[][] a = new byte[][]{{0, 1}, {2, 3, 4}, {0, 1}, {5}};
    public static final byte[] d = new byte[]{0};
    public long a;
    public long b;
    public static final int[][][] a = new int[][][]{new int[0][], new int[][]{{150, 217, 244}, {65, 149, 233}, {0, 100, 198}, {12, 53, 112}}, new int[][]{{244, 158, 156}, {219, 36, 113}, {161, 0, 112}, {95, 5, 120}}, new int[][]{{171, 237, 90}, {99, 190, 37}, {0, 153, 55}, {0, 85, 82}}, new int[][]{{0, 118, 150}, {0, 65, 114}, {0, 43, 75}, {0, 22, 48}}};
    public static final int[] b = new int[]{0xA0A0A0, 26054, 15204434, 39473, 16754};
    public static final int[] c = new int[]{-1, 2, 3, 2, 3};
    public static final int[] d = new int[]{-1, 4, 5, 4, 5};
    public h[][] a;
    public static final byte[] e = new byte[]{1, 2};
    public static final byte[] f = new byte[]{0, 5, 10, 10, 15, 0, 5, 15, 15, 15};
    public static final byte[] g = new byte[]{1, 1, 2, 2, 3, 3, 1, 1, 1, 1};
    public int j;
    public f[] c;
    public byte[] h;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    private f g;
    public f[] d;
    public h a;
    public h b;
    public h c;
    public h d;
    public h e;
    public h f;
    public h g;
    public h h;
    public h i;
    public h j;
    public h k;
    public h l;
    public int q;
    public int r;
    public byte[][] b;
    public byte c;
    public byte d;
    public long c;
    public int s;
    public int t;
    public int u;
    public c[] a;
    public c a;
    public int v;
    public int w;
    public byte[][] c;
    public boolean a;
    public boolean b;
    public boolean c;
    public Vector a;
    public Vector b;
    public int x;
    public int y;
    public long d;
    public byte e;
    public byte[] i;
    public byte[] j;
    public byte[] k;
    public byte f;
    public short a;
    public c[] b;
    public c[][] a;
    public int[] e;
    public int[] f;
    public byte[][] d;
    public byte[] l;
    public d a;
    public Vector c;
    public Vector d;
    public c b;
    public c c;
    public long e;
    public c d;
    public byte g;
    public long f;
    public int z;
    public boolean d;
    public boolean e;
    public byte h;
    public f a;
    public f b;
    public f c;
    public f d;
    public int A;
    public boolean f;
    public int B;
    public int C;
    public int D;
    public int E;
    public long g;
    public c e;
    public c f;
    public boolean g;
    public long h;
    public boolean h;
    public long i;
    public int F;
    public int G;
    public f[] e;
    public boolean i;
    public boolean j;
    public static int[] g = new int[]{83, 83, 83, 83, 83, 83, 83, 83, 175, 84, 84, 84, 175, 147, 159, 151, 155, 167, 171};
    public int H = -1;
    public d b;
    public d c;
    public d d;
    public d e;
    public int I = 8;
    public d f;
    public d g;
    public d h;
    public boolean k;
    public int J;
    public byte[][] e;
    public byte[][] f;
    public h m;
    public h n;
    public c g;
    public h o;
    public h p;
    public int K;
    public int L;
    public int M;
    public boolean l;
    public int N;
    public boolean m;
    public h q;
    public h[] a;
    public h r;
    public d i;
    public d j;
    public d k;
    public d l;
    public d[] a;
    public d[] b;
    public d m;
    public d[] c;
    public h s;
    public int O;
    public boolean n;
    public boolean o;
    public boolean p;
    public Vector e;
    public h t;
    public int P;
    public h[] b;
    public d n;
    public d o;
    public d p;
    public d q;
    public h u;
    public h v;
    public c h;
    public int Q = 0;
    public boolean q;
    public boolean r;
    public String b;
    public String[] h;
    public byte[] m;
    public int[] h = false;
    public d r;
    public d s;
    public d t;
    public d u;
    public d v;
    public d w;
    public d x;
    public byte i;
    public byte[] n;
    public int R;
    public String[] i;
    public int[] i;
    public String[] j;
    public String[] k;
    public d y;
    public d z;
    public d A;
    public d B;
    public d C;
    public d D;
    public d E;
    public d F;
    public int S;
    public String c;
    public int T;
    public boolean s = true;
    public boolean t = true;
    public boolean u = true;
    public f e;
    public int U;
    public static final String[] l = new String[]{"14281428", "18241824"};
    public StringBuffer a;
    public c i = null;
    public int V = 12;
    public int ad = 1;
    public boolean v;
    public int ae;
    public int af;
    public int ag;
    public int ah;
    public int ai;
    public f f;
    public String[] m;
    public boolean w;
    public byte j;
    public int aj;
    public int ak;
    public int al;
    public int am = 0;
    public int an;
    public int ao = 24;
    public int ap = 8;
    public int aq;
    public int ar;
    public static final byte[] o = new byte[]{0, 2, 3, 3, 1, 3, 3, 3, 3, 3, 3, 3};
    public byte k;
    public int as;
    public int at;
    public c j;
    public c k;
    public c l;
    public int au;
    public long j;
    public c[] c = true;
    public c[] d;
    public byte[] p;
    public int[][] a;
    public int[] j;
    public int av;
    public byte[][] g;
    public int aw;
    public int ax;
    public int ay;
    public int az;
    public int aA;
    public Vector f;
    public boolean x = false;
    public int aB;
    public d G;
    public c m;
    public c n;
    public c o;
    public c p;
    public c q;
    public c r;
    public int aC;
    public long k;
    public int aD;
    public boolean y = false;
    public boolean z = false;
    public int aE = -1;
    public int aF = -1;
    public int aG = 0;
    public g a;
    public g b = false;
    public long l = true;
    public boolean A;
    public Vector g = true;
    public boolean B = false;
    public long m;
    public long n;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int aH;
    public int aI;
    public int aJ;
    public String[] n;
    public String[] o;
    public String[] p;
    public String[] q = null;
    public String[] r = null;
    public int[] k = 0;
    public String d = "Macrospace";
    public String e = "msaeii";
    public String f = "http://msaeii.scores.macrospace.com/connectx/in";
    private ByteArrayOutputStream a;
    private DataOutputStream a;
    public int aK;
    public boolean G;
    public a a = false;
    public int aL;

    public i() {
        this.e = new String[]{a.a(1), a.a(2), a.a(5), a.a(3), a.a(6), a.a(8), a.a(7), a.a(9), a.a(10), a.a(11), a.a(4)};
        this.b = new f[this.e.length];
        this.f = new String[]{a.a(35), a.a(36), a.a(37)};
        this.g = new String[]{a.a(29), a.a(30)};
        this.a = new byte[]{0, 6, 5, 7, 8, 9};
        this.b = new byte[]{0, 6, 5, 7, 8, 9};
        this.c = new byte[]{1, 2, 3, 4};
        this.a = new Vector();
        this.e = (byte)2;
        this.i = new byte[5];
        this.j = new byte[4];
        this.k = new byte[4];
        this.f = new int[4];
        this.d = new byte[4][2];
        this.l = new byte[4];
        this.c = new Vector();
        this.d = new Vector();
        this.a = new h[0];
        this.e = new Vector(2);
        this.j = new String[]{a.a(46), a.a(47)};
        this.k = new String[]{a.a(48), a.a(49)};
        this.a = new StringBuffer();
        this.aq = this.ap >> 1;
        this.g = new Vector();
        this.h = (byte)4;
    }

    public final void b() throws Exception {
        int n;
        this.a(0);
        e.b("");
        this.a(18);
        e.g();
        for (int j = 0; j < e.b.length; ++j) {
            e.c(j);
            this.a(19 + j);
        }
        this.a(28);
        d.a = this;
        this.a(29);
        a.d();
        this.a(30);
        e.f();
        this.a(32);
        this.a = new h((String)"action_icons").a;
        this.a(34);
        this.b = new h((String)"menu_icons").a;
        this.a(36);
        this.o = new h("hud_icons");
        this.a(38);
        this.p = new h("hud_icons_2");
        this.a(40);
        this.d = new h("arrow");
        this.a(42);
        this.c = new h("side_arrow");
        this.a(44);
        this.e = new h("buttons");
        this.a(46);
        this.f = new h("menu");
        this.a(48);
        this.m = new h("big_circle");
        this.a(50);
        this.n = new h("small_circle");
        this.a(52);
        this.k = new h("small_spark");
        this.a(54);
        this.s = new h("alpha");
        this.a(56);
        try {
            this.e = new f("gameover");
        }
        catch (Exception exception) {}
        this.a(58);
        this.a = new f("ms_logo");
        this.a(62);
        DataInputStream dataInputStream = new DataInputStream(e.a("tiles0.prop"));
        int n2 = dataInputStream.readShort();
        dataInputStream.readShort();
        this.h = new byte[n2];
        for (int j = 0; j < n2; ++j) {
            this.h[j] = dataInputStream.readByte();
        }
        dataInputStream.close();
        this.a(64);
        h h2 = new h("stiles0");
        this.c = h2.a;
        this.a(70);
        this.q = new h("mini_icons");
        this.a(72);
        this.j = 37;
        this.a = this.W;
        this.b = this.X;
        this.c = this.a >> 1;
        this.d = this.b >> 1;
        this.A = 0;
        for (int j = 0; j < 12; ++j) {
            i.a[j] = a.a(101 + j);
        }
        i.f();
        this.a(74);
        try {
            this.e = e.a("settings", 1)[0];
        }
        catch (Exception exception) {}
        this.a(76);
        this.i = new String[0];
        this.i = new int[0];
        try {
            byte[] byArray = e.a("settings", 2);
            dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
            this.R = dataInputStream.readInt();
            this.i = new int[this.R];
            this.i = new String[this.R];
            for (int j = 0; j < this.R; ++j) {
                this.i[j] = dataInputStream.readInt();
                this.i[j] = dataInputStream.readUTF();
            }
            dataInputStream.close();
        }
        catch (Exception exception) {}
        this.a(80);
        this.T = e.a("download");
        this.a(84);
        this.h = new String[3];
        this.m = new byte[3];
        this.h = new int[3];
        for (n = 0; n < 3; ++n) {
            this.m[n] = -1;
            this.h[n] = -1;
            byte[] byArray = null;
            try {
                byArray = e.a("save", n);
            }
            catch (Exception exception) {}
            if (byArray == null || byArray.length == 0) {
                this.h[n] = "\n" + a.a(79) + "\n ";
                continue;
            }
            dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
            byte by = dataInputStream.readByte();
            byte by2 = dataInputStream.readByte();
            dataInputStream.readByte();
            dataInputStream.readByte();
            byte by3 = dataInputStream.readByte();
            short s = dataInputStream.readShort();
            dataInputStream.close();
            this.m[n] = by3;
            this.h[n] = this.a((int)by, (int)by2, (int)s);
            this.h[n] = by2;
        }
        this.a(90);
        n = 0;
        String string = b.a.getAppProperty("ProvisionX-Highscore-gameCode");
        if (string != null) {
            this.e = string.trim();
        }
        if ((string = b.a.getAppProperty("ProvisionX-Highscore-portalCode")) != null) {
            this.d = string.trim();
        }
        if ((string = b.a.getAppProperty("ProvisionX-Highscore-Url")) != null) {
            this.f = string.trim();
        }
        if ((string = b.a.getAppProperty("ms-highscoreUpload")) != null) {
            boolean bl = this.s = Integer.parseInt(string.trim()) == 1;
        }
        if ((string = b.a.getAppProperty("ms-skPos")) != null) {
            n = Integer.parseInt(string.trim());
        }
        if ((string = b.a.getAppProperty("MIDlet-Version")) != null) {
            this.a = string.trim();
        }
        this.a(96);
        if (n == 1) {
            h = 2048;
            i = 1024;
        }
        this.a(100);
        e.b(0, 0);
        this.h = 0;
    }

    public final void a(int n) {
        this.U = n;
        a.a.c();
    }

    public final String a(int n, int n2, int n3) {
        String string = n == 0 ? a.a(121 + n2) : this.b(n2);
        String string2 = a.a(32 + n) + "\n" + string + "\n" + "Current turn: " + (n3 + 1);
        return string2;
    }

    public final boolean a() {
        return this.l && a.a.a == this;
    }

    public final void e() throws Exception {
        f[] fArray;
        int n;
        h h2;
        byte by;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        System.gc();
        this.b = this.X - a;
        this.d = this.b >> 1;
        e.h();
        if (this.h == 1) {
            return;
        }
        this.h = 1;
        c.a(this);
        e.b("/1.pak");
        this.a = new h[5][12];
        for (by = 0; by < 5; by = (byte)(by + 1)) {
            h2 = new h("unit_icons", by);
            int n2 = h2.e() / 12;
            for (n = 0; n < 12; n = (int)((byte)(n + 1))) {
                if (by == 0) {
                    fArray = new f[]{h2.a[n]};
                    this.a[by][n] = new h(fArray);
                    continue;
                }
                fArray = new f[n2];
                for (int j = 0; j < n2; ++j) {
                    fArray[j] = h2.a[j * 12 + n];
                }
                this.a[by][n] = new h(fArray);
            }
        }
        h2 = new h("tiles0");
        f[] fArray2 = h2.a;
        this.j = fArray2.length;
        fArray = new f[10];
        for (by = 0; by <= 4; by = (byte)(by + 1)) {
            h h3 = new h("buildings", by);
            for (n = 0; n < 2; n = (int)((byte)(n + 1))) {
                fArray[by * 2 + n] = h3.a[n];
            }
        }
        this.d = new f[fArray2.length + fArray.length];
        System.arraycopy(fArray2, 0, this.d, 0, fArray2.length);
        System.arraycopy(fArray, 0, this.d, this.j, fArray.length);
        this.l = new h("portraits");
        this.a = new h("cursor");
        this.i = new h("redspark");
        this.g = new h("smoke");
        this.h = new h("spark");
        this.j = new h("status");
        this.u = new h("arrow_icons");
        this.g = new f("tombstone");
        this.t = new h("levelup");
        this.b = new h[2];
        this.b[0] = new h("king_head_icons");
        this.b[1] = new h("king_head_icons", 0);
        this.a.a(a[0]);
        this.b = new h(this.a);
        this.b.a(a[3]);
        this.e = new f[2];
        this.G = e[0];
        this.e[0] = this.d[e[0]];
        this.e[1] = this.d[e[1]];
        this.r = new h("b_smoke");
    }

    public final void a(int n, int n2) {
        if (this.b == 0 && this.h == 1 && this.c == 0) {
            boolean bl = false;
            this.a.append(n2);
            String string = this.a.toString();
            for (int j = 0; j < l.length; ++j) {
                if (string.equals(l[j])) {
                    if (j == 0) {
                        if (this.s == 7) {
                            this.r = true;
                        } else {
                            this.u();
                        }
                    } else if (j == 1) {
                        byte by = this.f;
                        this.f[by] = this.f[by] + 1000;
                    }
                    this.t = true;
                    continue;
                }
                if (!l[j].startsWith(string)) continue;
                bl = true;
            }
            if (!bl) {
                this.a = new StringBuffer();
            }
        }
    }

    public final void a() {
        this.t = true;
        this.u = true;
        this.F = true;
        this.E = true;
    }

    public final byte[] a() throws Exception {
        int n;
        this.d[this.f][0] = (byte)this.q;
        this.d[this.f][1] = (byte)this.r;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeByte(this.b);
        dataOutputStream.writeByte(this.s);
        dataOutputStream.writeByte(this.e);
        dataOutputStream.writeByte(this.f);
        dataOutputStream.writeByte(this.j[this.f]);
        dataOutputStream.writeShort(this.a);
        dataOutputStream.writeByte(this.I);
        dataOutputStream.writeByte(this.e);
        for (n = 0; n < this.e; ++n) {
            dataOutputStream.writeByte(this.k[n]);
            dataOutputStream.writeByte(this.l[n]);
            dataOutputStream.writeShort(this.f[n]);
            dataOutputStream.writeByte(this.d[n][0]);
            dataOutputStream.writeByte(this.d[n][1]);
        }
        dataOutputStream.writeByte(this.g);
        for (n = 0; n < this.e.length; ++n) {
            dataOutputStream.writeByte(this.b[this.e[n][0]][this.e[n][1]]);
        }
        dataOutputStream.writeByte(this.a.size());
        int n2 = this.a.size();
        for (n = 0; n < n2; ++n) {
            c c2 = (c)this.a.elementAt(n);
            dataOutputStream.writeByte(c2.d);
            dataOutputStream.writeByte(c2.e);
            dataOutputStream.writeByte(c2.f);
            dataOutputStream.writeByte(c2.g);
            dataOutputStream.writeByte(c2.g);
            dataOutputStream.writeByte(c2.a);
            dataOutputStream.writeShort(c2.a);
            dataOutputStream.writeShort(c2.c);
            dataOutputStream.writeShort(c2.d);
            dataOutputStream.writeByte(c2.h);
            dataOutputStream.writeByte(c2.i);
            if (c2.d != 9) continue;
            dataOutputStream.writeByte(c2.j);
            dataOutputStream.writeShort(c2.k);
            dataOutputStream.writeByte(this.b[c2.e] == c2 ? 1 : 0);
        }
        dataOutputStream.writeShort((short)this.aC);
        dataOutputStream.writeInt((short)this.k);
        dataOutputStream.writeInt(this.aD);
        dataOutputStream.writeByte(this.y ? 0 : 1);
        byte[] byArray = byteArrayOutputStream.toByteArray();
        dataOutputStream.close();
        return byArray;
    }

    public final void a(byte[] byArray) throws Exception {
        int n;
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
        this.b = dataInputStream.readByte();
        this.s = dataInputStream.readByte();
        this.e = dataInputStream.readByte();
        this.b(this.s);
        this.f = dataInputStream.readByte();
        dataInputStream.readByte();
        this.a = dataInputStream.readShort();
        this.I = dataInputStream.readByte();
        this.e = dataInputStream.readByte();
        for (n = 0; n < this.e; ++n) {
            this.k[n] = dataInputStream.readByte();
            this.l[n] = dataInputStream.readByte();
            this.f[n] = dataInputStream.readShort();
            this.d[n][0] = dataInputStream.readByte();
            this.d[n][1] = dataInputStream.readByte();
        }
        this.g = dataInputStream.readByte();
        for (n = 0; n < this.e.length; ++n) {
            this.b[this.e[n][0]][this.e[n][1]] = dataInputStream.readByte();
        }
        this.a = new c[this.e][4];
        this.e = new int[this.e];
        this.i();
        n = dataInputStream.readByte();
        int n2 = n;
        for (int j = 0; j < n2; ++j) {
            byte by = dataInputStream.readByte();
            byte by2 = dataInputStream.readByte();
            byte by3 = dataInputStream.readByte();
            byte by4 = dataInputStream.readByte();
            byte by5 = dataInputStream.readByte();
            byte by6 = dataInputStream.readByte();
            short s = dataInputStream.readShort();
            short s2 = dataInputStream.readShort();
            short s3 = dataInputStream.readShort();
            byte by7 = dataInputStream.readByte();
            byte by8 = dataInputStream.readByte();
            c c2 = c.a(by, by2, (int)s2, s3);
            c.a(by, by2, (int)s2, s3).f = by3;
            c2.a = s;
            c2.a(by6);
            c2.g = by4;
            c2.b();
            c2.g = by5;
            c2.h = by7;
            c2.i = by8;
            if (by != 9) continue;
            byte by9 = dataInputStream.readByte();
            short s4 = dataInputStream.readShort();
            c2.b((int)by9);
            c2.k = s4;
            byte by10 = dataInputStream.readByte();
            if (by10 != 1) continue;
            this.b[c2.e] = c2;
        }
        this.aC = dataInputStream.readShort();
        this.k = dataInputStream.readInt();
        this.aD = dataInputStream.readInt();
        this.y = dataInputStream.readByte() != 0;
        dataInputStream.close();
        if (this.s == 6 && this.aC > 32) {
            this.e = this.a(a.a(121 + this.s), a.a(138), this.b, -1);
            this.e.a((byte)0, true);
            this.e.a((a)null);
        }
        this.e(this.d[this.f][0], this.d[this.f][1]);
        this.c(this.d[this.f][0], this.d[this.f][1]);
        e.a(c[this.j[this.f]], 0);
    }

    public final void a(int n, a a2) {
        try {
            e.a("save", n, this.a());
            this.h[n] = this.a((int)this.b, this.s, (int)this.a);
            this.m[n] = this.j[this.f];
            this.h[n] = this.s;
            this.u.a(null, this.h[n], this.a, -1);
            this.u.G = b[this.m[n]];
            this.u.a();
            d d2 = this.a(null, a.a(77), this.b, 1000);
            this.a(null, a.a(77), this.b, 1000).a = a2;
            a.a.a(d2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static final void f() {
        try {
            byte[] byArray = e.a("settings", 0);
            for (int j = 0; j < 3; ++j) {
                e.a[j] = (byArray[0] & 1 << j) != 0;
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void g() {
        try {
            byte[] byArray = new byte[1];
            for (int j = 0; j < 3; ++j) {
                if (!e.a[j]) continue;
                byArray[0] = (byte)(byArray[0] | 1 << j);
            }
            e.a("settings", 0, byArray);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void a(c c2) {
        this.Q = 0;
        this.e(c2.c, c2.d);
        this.h = c2;
    }

    public final void a(c c2, c c3) {
        if (c3.f == 4) {
            this.c = c3;
            this.a(this.i, this.c.n, this.c.o, 0, 0, 1, 50);
            this.z = 6;
            this.a.d();
            this.c = 0;
            this.j();
            this.a.a(a[0]);
            if (this.l[this.f] == 0) {
                this.j = this.c;
                this.k = (byte)6;
                return;
            }
        } else {
            if (e.a[2] && c3.a.length > 0) {
                this.f = true;
                this.B = 0;
                e.h();
            } else {
                this.c = (byte)13;
                this.E = 0;
                this.a.a(a[0]);
            }
            this.e = c2;
            this.f = c3;
        }
    }

    public final void h() {
        this.j();
        if (this.e.g <= 0) {
            this.b = this.e;
        } else if (this.e.a()) {
            this.e.addElement(this.e);
        }
        if (this.f.g <= 0) {
            this.b = this.f;
        } else {
            if (this.e.a((short)128)) {
                this.a(this.h, this.f.n, this.f.o, 0, 0, 1, 50);
                h h2 = h.a(this.j, 0, 0, -4, -1, 800, (byte)5);
                h2.b(this.f.n + (this.f.p - h2.p) / 2, this.f.o - h2.q);
                h2.a(d);
                this.c.addElement(h2);
                this.f.b((byte)1);
            }
            if (this.f.a()) {
                this.e.addElement(this.f);
            }
        }
        if (this.b != null) {
            this.e(this.b.c, this.b.d);
            this.a(this.h, this.b.n, this.b.o, 0, 0, 1, 50);
            e.b(12, 1);
        }
        this.e = this.c;
        if (this.l[this.f] == 0) {
            this.j = this.c;
            this.k = (byte)6;
        }
        this.a.a(a[0]);
        this.c = 0;
        this.e.d();
        this.f = null;
        this.e = null;
    }

    public final h a(h h2, int n, int n2, int n3, int n4, int n5, int n6) {
        h h3 = h.a(h2, n3, n4, 0, n5, n6, (byte)0);
        h3.b(n, n2);
        this.d.addElement(h3);
        return h3;
    }

    public final void b(c c2) {
        this.e = true;
        this.d = !this.k;
        this.ae = 12;
        this.c = 1;
        this.h = true;
        this.a(this.c, 0);
        c2.b(this.c);
        this.a = true;
        this.b = false;
        this.a.a(a[2]);
    }

    public final void a(byte[] byArray, int n, int n2, a a2) {
        d d2 = new d(0, 0);
        this.K = n;
        this.L = n2;
        int n3 = byArray.length;
        Vector<String> vector = new Vector<String>(n3);
        Vector<f> vector2 = new Vector<f>(n3);
        for (int j = 0; j < n3; ++j) {
            byte by = byArray[j];
            if (!this.s && by == 6) continue;
            vector.addElement(this.e[by]);
            vector2.addElement(this.b[by]);
        }
        Object[] objectArray = new String[vector.size()];
        Object[] objectArray2 = new f[vector2.size()];
        vector.copyInto(objectArray);
        vector2.copyInto(objectArray2);
        d2.a((String[])objectArray, (f[])objectArray2, this.Y, this.K, this.L, 3, (byte)1);
        d2.a(a2);
        a.a.a(d2);
    }

    public final void a(byte[] byArray, c c2) {
        this.a = new d(0, 0);
        int n = byArray.length;
        String[] stringArray = new String[n];
        f[] fArray = new f[n];
        for (int j = 0; j < byArray.length; ++j) {
            stringArray[j] = this.d[byArray[j]];
            fArray[j] = this.a[byArray[j]];
        }
        if (this.r * 24 <= this.b / 2 - 24) {
            this.a.a(stringArray, fArray, 0, this.b - this.e.q, 36);
        } else {
            this.a.a(stringArray, fArray, this.a, 0, 8);
        }
        this.a.a(this);
        a.a.a(this.a);
    }

    public final d a(String string, f f2) {
        String[] stringArray = new String[3];
        for (int j = 0; j < 3; ++j) {
            stringArray[j] = "SLOT " + (j + 1) + "/" + 3;
        }
        this.t = new d(14, 0);
        this.t.a(stringArray, this.a, -1);
        this.u = new d(10, 0);
        this.u.a(null, this.h[0], this.a, -1);
        if (this.m[0] != -1) {
            this.u.G = b[this.m[0]];
        }
        d d2 = new d(15, 15);
        int n = (this.b - this.t.g - this.u.g) / 2;
        d d3 = new d(10, 0);
        d3.a(null, string, this.a, -1);
        d3.a = f2;
        d2.a(d3, 0, 0, 0);
        d2.a(this.t, 0, n += d3.g / 2, 0);
        d2.a(this.u, 0, n += this.t.g, 20);
        d2.g = true;
        d2.a((byte)0, true);
        return d2;
    }

    public final void a(a a2) {
        int n = this.q.length;
        String[] stringArray = new String[n];
        int[] nArray = new int[n];
        int n2 = 0;
        for (int j = 0; j < n; ++j) {
            boolean bl = false;
            for (int k = 0; k < this.R; ++k) {
                if (!this.q[j].equals(this.i[k])) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            stringArray[n2] = this.q[j];
            nArray[n2] = j;
            ++n2;
        }
        this.D = new d(15, 15);
        d d2 = new d(10, 0);
        d2.a(null, a.a(48), this.a, -1);
        if (n2 == 0) {
            d d3 = new d(10, 0);
            d3.a(null, a.a(52), this.a, this.d);
            this.D.a(d3, 0, (this.b + d2.g) / 2, 6);
        } else {
            String[] stringArray2 = new String[n2];
            int[] nArray2 = new int[n2];
            System.arraycopy(stringArray, 0, stringArray2, 0, n2);
            System.arraycopy(nArray, 0, nArray2, 0, n2);
            this.F = new d(10, 0);
            String string = this.c(this.T);
            this.F.a(null, a.a(54, this.c(this.k[nArray2[0]])) + "\n" + a.a(53, string), this.a, -1);
            this.E = new d(11, 0);
            this.E.a(stringArray2, this.c, this.d, this.a, this.b - d2.g - this.F.g, 3, 4);
            this.E.a = nArray2;
            int n3 = (this.b - this.F.g - this.E.g + d2.g) / 2;
            this.D.a(this.E, 0, n3, 20);
            this.D.a(this.F, 0, n3 += this.E.g, 20);
            this.D.g = true;
            this.D.a((byte)0, true);
        }
        this.D.a(d2, 0, 0, 20);
        this.D.a(a2);
    }

    public final d a(a a2) {
        if (this.i.length == 0) {
            d d2 = new d(10, 0);
            d d3 = d2.a(a.a(49));
            d2.a(a.a(49)).a = this.b[6];
            d2.a(null, a.a(52), this.W, -1);
            d2.a(0, (this.b + d3.g) / 2, 6);
            d2.a(a2);
            this.B = null;
            return d2;
        }
        this.B = new d(11, 0);
        d d4 = this.B.a(a.a(49));
        this.B.a(a.a(49)).a = this.b[6];
        this.B.a(this.i, this.W / 2, (this.b + d4.g) / 2, this.a, this.b - d4.g, 3, 4);
        this.B.a(a2);
        return this.B;
    }

    public final int a(int n) {
        if (n >= a.length) {
            return this.i[n - a.length] + a.length;
        }
        return n;
    }

    public final DataInputStream a(int n) throws Exception {
        if (n >= a.length) {
            int n2 = n - a.length;
            return new DataInputStream(new ByteArrayInputStream(e.a("download", n2)));
        }
        return new DataInputStream(e.a("s" + n));
    }

    public final String b(int n) {
        if (n >= a.length) {
            int n2 = n - a.length;
            for (int j = 0; j < this.i.length; ++j) {
                if (this.i[j] != n2) continue;
                return this.i[j];
            }
            return null;
        }
        return a[n];
    }

    public final String c(int n) {
        int n2 = n * 100 / 1024;
        int n3 = n2 / 100;
        int n4 = n2 % 100;
        return n3 + "." + n4;
    }

    public final void a(d d2, int n, String string, byte by) throws Exception {
        int n2;
        int n3;
        Object object;
        int n4;
        this.G = true;
        if (d2 == this.a && by == 1) {
            if (this.c == 3) {
                this.a.a(this.v, this.w);
                this.a.b(this.c);
                this.b(this.a);
                this.h = true;
            }
            return;
        }
        if (d2 == this.v) {
            if (by == 0) {
                a.a.e();
                return;
            }
            this.v = null;
            return;
        }
        if (d2 == this.w) {
            if (by == 0) {
                this.a(this.c, this.K, this.L, d2.a);
            }
            this.w = null;
            return;
        }
        if (d2 == this.x) {
            if (by == 0) {
                int n5 = this.t.i;
                this.a(n5, (a)this.s);
            }
            this.x = null;
            return;
        }
        if (d2 == this.p) {
            if (by == 2 || by == 3) {
                this.q.a(null, a.a(184 + this.p.a[n].d), this.a, this.b - this.o.g - this.p.g);
                this.o.a = this.p.a[n];
                this.q.a();
                this.o.a();
            }
            return;
        }
        if (d2 == this.n) {
            if (by == 0) {
                c c2 = this.p.a[this.p.i];
                if (this.a(c2, this.q, this.r)) {
                    this.a = this.a(c2, this.q, this.r);
                    this.k = true;
                    this.b(this.a);
                    a.a.a(this);
                } else {
                    return;
                }
            }
            this.n = null;
            this.p = null;
            this.q = null;
            this.o = null;
            return;
        }
        if (d2 == this.c) {
            if (by == 2 || by == 3) {
                String string2 = n == 0 ? a.a(15) : a.a(196 + n - 1, true);
                this.d.a(null, string2, this.a, this.d.g);
                this.d.a();
            }
            return;
        }
        if (d2 == this.b) {
            this.b = null;
            this.c = null;
            this.d = null;
            return;
        }
        if (d2 == this.e) {
            if (by == 0) {
                a.a.a(this);
            }
            return;
        }
        if (d2 == this.i) {
            if (by == 0) {
                int n6;
                int n7;
                this.j = new d(15, 15);
                d d3 = new d(10, 0);
                new d(10, 0).a = this.b[4];
                d3.a(null, a.a(34), this.a, -1);
                this.j.a(d3, 0, 0, 20);
                String[] stringArray = new String[this.i];
                for (n7 = 0; n7 < this.i; ++n7) {
                    stringArray[n7] = a.a(38, "" + (n7 + 1));
                }
                n7 = d3.g;
                d[] dArray = new d[this.i];
                this.a = new d[this.i];
                this.b = new d[this.i];
                for (int j = 0; j < this.i; ++j) {
                    this.a[j] = new d(14, 6);
                    this.a[j].a(this.f, this.Y, -1);
                    this.b[j] = new d(14, 5);
                    this.b[j].a(stringArray, this.Y, -1);
                    this.b[j].i = j;
                    int n8 = Math.max(this.a[j].f, this.b[j].f);
                    n6 = this.W - n8;
                    this.a[j].f = n8;
                    this.b[j].f = n8;
                    this.j.a(this.a[j], n6, n7, 20);
                    this.j.a(this.b[j], n6, n7 += this.a[j].g, 20);
                    dArray[j] = new d(10, 8);
                    dArray[j].a(null, a.a(this.n[j] - 1 + 89), n6, this.a[j].g + this.b[j].g);
                    dArray[j].G = b[this.n[j]];
                    this.j.a(dArray[j], 0, n7 += this.b[j].g, 36);
                }
                this.j.z = 1;
                d d4 = new d(10, 8);
                d4.a(null, a.a(40), this.c, -1);
                this.j.a(d4, 0, n7, 20);
                this.k = new d(14, 4);
                String[] stringArray2 = new String[a.length];
                for (n6 = 0; n6 < stringArray2.length; ++n6) {
                    stringArray2[n6] = "" + a[n6];
                }
                this.k.a(stringArray2, this.c, d4.g);
                this.j.a(this.k, this.Y, n7, 20);
                d d5 = new d(10, 8);
                d5.a(null, a.a(41), this.c, -1);
                this.j.a(d5, 0, n7 += d4.g, 20);
                this.l = new d(14, 4);
                String[] stringArray3 = new String[c.length];
                for (int j = 0; j < stringArray3.length; ++j) {
                    stringArray3[j] = "" + c[j];
                }
                this.l.a(stringArray3, this.c, d5.g);
                this.j.a(this.l, this.Y, n7, 20);
                this.j.a(d2);
                this.j.a((byte)0, true);
                a.a.a(this.j);
                return;
            }
            this.i = null;
            return;
        }
        if (d2 == this.j) {
            if (by == 0) {
                int n9 = 0;
                int n10 = 0;
                boolean[] blArray = new boolean[this.i];
                for (int j = 0; j < this.i; ++j) {
                    if (this.a[j].i == 2) {
                        this.l[j] = 2;
                        continue;
                    }
                    ++n9;
                    if (this.a[j].i == 0) {
                        this.l[j] = 1;
                    } else if (this.a[j].i == 1) {
                        this.l[j] = 0;
                    }
                    this.k[j] = (byte)this.b[j].i;
                    if (blArray[this.k[j]]) continue;
                    ++n10;
                    blArray[this.k[j]] = true;
                }
                if (n9 < 2 || n10 < 2) {
                    d d6 = this.a(null, a.a(39), this.b, 2000);
                    d6.a(this.j);
                    a.a.a(d6);
                    return;
                }
                this.j = null;
                this.i = null;
                a.a.a(this);
                this.f = a[this.k.i];
                this.g = c[this.l.i];
                this.a = null;
                this.k = null;
                this.l = null;
                this.b = 1;
                this.I = 8;
                this.i = true;
                a.a.c();
                this.e();
                this.b(this.t);
                this.s = this.t;
                this.i = false;
                this.c = 0;
            }
            return;
        }
        if (d2 == this.g) {
            n4 = this.f.i;
            if (!(by != 0 || n4 < a.length && this.a[n4])) {
                int n11;
                this.t = this.a(n4);
                object = this.a(this.t);
                n3 = object.readInt();
                n2 = object.readInt();
                byte[][] byArray = new byte[n3][n2];
                this.n = new byte[4];
                byte[] byArray2 = new byte[5];
                for (n11 = 0; n11 < 5; ++n11) {
                    byArray2[n11] = -1;
                }
                this.i = 0;
                for (n11 = 0; n11 < n3; ++n11) {
                    for (int j = 0; j < n2; ++j) {
                        int n12;
                        byArray[n11][j] = object.readByte();
                        if (this.h[byArray[n11][j]] != 9 || (n12 = this.a(n11, j, byArray)) == 0 || byArray2[n12] != -1) continue;
                        this.n[this.i] = (byte)n12;
                        byArray2[n12] = this.i;
                        this.i = (byte)(this.i + 1);
                    }
                }
                object.close();
                this.b = this.f.a[n4];
                this.i = new d(15, 15);
                d d7 = new d(10, 0);
                new d(10, 0).a = this.b[4];
                d7.a(null, this.b, this.a, -1);
                d d8 = new d(8, 0);
                d8.a(this.W, this.b - d7.g - this.e.q, byArray, null);
                this.i.a(d8, this.c, this.d + (d7.g - this.e.q) / 2, 3);
                this.i.a(d7, 0, 0, 0);
                this.i.a(d2);
                this.i.a((byte)0, true);
                this.i.g = true;
                a.a.a(this.i);
            }
        } else if (d2 == this.m) {
            if (by == 1) {
                boolean bl = e.a[0];
                boolean bl2 = false;
                for (int j = 0; j < 3; ++j) {
                    boolean bl3 = this.c[j].i == 0;
                    if (bl3 == e.a[j]) continue;
                    e.a[j] = bl3;
                    bl2 = true;
                }
                if (bl2) {
                    this.g();
                    if (bl != e.a[0]) {
                        if (!e.a[0]) {
                            e.h();
                            return;
                        }
                        if (this.h == 1) {
                            if (this.c != 11 && this.c != 14) {
                                e.b(c[this.j[this.f]], 0);
                                return;
                            }
                        } else if (this.h == 0) {
                            e.b(0, 0);
                            return;
                        }
                    }
                } else {
                    this.m = null;
                    this.c = null;
                }
            }
            return;
        }
        if (d2 == this.s) {
            if (by == 0) {
                n4 = this.t.i;
                if (this.m[n4] == -1) {
                    this.a(n4, (a)d2);
                } else {
                    this.x = this.a(null, a.a(88), this.b, -1);
                    this.x.a((byte)0, true);
                    this.x.a(d2);
                    a.a.a(this.x);
                }
            } else {
                this.s = null;
                this.t = null;
                this.u = null;
            }
        } else if (d2 == this.r) {
            if (by == 0) {
                byte[] byArray = null;
                try {
                    byArray = e.a("save", this.t.i);
                }
                catch (Exception exception) {}
                if (byArray != null) {
                    this.r = null;
                    this.t = null;
                    this.u = null;
                    a.a.a(this);
                    this.i = true;
                    a.a.c();
                    this.e();
                    this.a(byArray);
                    if (this.b == 0) {
                        this.l = true;
                    }
                    this.i = false;
                    this.c = 0;
                }
            } else {
                this.r = null;
                this.t = null;
                this.u = null;
            }
        } else if (d2 == this.t) {
            if (by == 2 || by == 3) {
                this.u.a(null, this.h[n], this.a, -1);
                this.u.G = this.m[n] == -1 ? 2370117 : b[this.m[n]];
                this.u.a();
            }
            return;
        }
        if (d2 == this.y) {
            if (by == 0) {
                if (string.equals(this.j[0])) {
                    if (this.n == null) {
                        this.a(0, "news", a.a(0), (a)d2);
                        return;
                    }
                    this.A = this.a(this.n, (a)d2);
                    return;
                }
                if (string.equals(this.j[1])) {
                    this.z = new d(11, 0);
                    d d9 = this.z.a(string);
                    this.z.a(string).a = this.b[6];
                    this.z.a(this.k, this.W / 2, (this.b + d9.g) / 2, this.a, this.b - d9.g, 3, 0);
                    this.z.a(d2);
                    a.a.a(this.z);
                }
            } else if (by == 1) {
                this.y = null;
            }
        } else if (d2 == this.z) {
            if (by == 0) {
                if (string.equals(this.k[0])) {
                    if (this.q == null) {
                        this.a(2, "levels", a.a(0), (a)d2);
                    } else {
                        this.a(d2);
                        a.a.a(this.D);
                    }
                } else if (string.equals(this.k[1])) {
                    a.a.a(this.a(d2));
                }
            } else if (by == 1) {
                this.z = null;
            }
        } else if (d2 == this.A) {
            if (by == 0) {
                if (this.p[n] == null) {
                    this.aI = n;
                    this.a(1, this.o[n], a.a(0), (a)d2);
                } else {
                    d d10 = this.a(this.n[n], this.p[n], this.b, this.b / 2, -1);
                    d10.a(d2);
                    a.a.a(d10);
                }
            } else if (by == 1) {
                this.A = null;
            }
        } else if (d2 == this.D) {
            if (by == 0) {
                this.aJ = this.E.a[this.E.i];
                if (this.T >= this.k[this.aJ]) {
                    this.a(3, this.r[this.aJ], a.a(0), (a)d2);
                } else {
                    d d11 = this.a(null, a.a(55), this.b, -1);
                    d11.a(d2);
                    a.a.a(d11);
                }
            } else if (by == 1) {
                this.F = null;
                this.E = null;
                this.D = null;
            }
        } else if (d2 == this.E) {
            if (by == 2 || by == 3) {
                String string3 = this.c(this.T);
                this.F.a(null, a.a(54, this.c(this.k[this.E.a[n]])) + "\n" + a.a(53, string3), this.a, -1);
                this.F.a();
            }
        } else if (d2 == this.B) {
            if (by == 0) {
                if (this.i[n] + a.length == this.s) {
                    d d12 = this.a(null, a.a(56), this.b, -1);
                    d12.a(d2);
                    a.a.a(d12);
                } else {
                    this.S = n;
                    this.c = string;
                    this.C = this.a(null, a.a(50, string), this.b, this.d, -1);
                    this.C.a(d2);
                    this.C.a((byte)0, true);
                    a.a.a(this.C);
                }
            } else if (by == 1) {
                this.B = null;
            }
        } else if (d2 == this.C) {
            if (by == 0) {
                this.e(this.S);
                d d13 = this.a(this.B.a);
                object = this.a(null, a.a(51, this.c), this.b, -1);
                object.a(d13);
                a.a.a((a)object);
            }
            this.C = null;
            this.c = null;
        }
        if (d2.b == 7) {
            a.a.a(this);
            return;
        }
        if (string == null || by != 0) {
            return;
        }
        if (string.equals(this.e[0])) {
            if (this.h == 0 || this.c != 0) {
                this.a(this.c, this.K, this.L, (a)d2);
                return;
            }
            this.w = this.a(null, a.a(87), this.b, -1);
            this.w.a((byte)0, true);
            this.w.a(d2);
            a.a.a(this.w);
            return;
        }
        if (string.equals(this.e[1]) || d2 == this.h) {
            a.a.a(this);
            if (d2 == this.h) {
                this.s = n;
                this.h = null;
            } else {
                this.s = 0;
            }
            this.b = 0;
            this.l[1] = 0;
            this.i = true;
            a.a.c();
            System.gc();
            this.e();
            this.b(this.s);
            this.i = false;
            this.r();
            this.c = 0;
            return;
        }
        if (string.equals(a.a(3))) {
            this.h = new d(11, 0);
            int n13 = this.e;
            if (n13 > 7) {
                n13 = 7;
            }
            object = new String[++n13];
            for (n3 = 0; n3 < n13; ++n3) {
                object[n3] = n3 + 1 + ". " + a.a(121 + n3);
            }
            d d14 = this.h.a(string);
            this.h.a(string).a = this.b[3];
            this.h.a((String[])object, this.W / 2, (this.b + d14.g) / 2, this.a, this.b - d14.g, 3, 4);
            this.h.a(d2);
            a.a.a(this.h);
            return;
        }
        if (string.equals(a.a(4))) {
            this.s = this.a(string, this.b[10]);
            this.s.a(d2);
            a.a.a(this.s);
            return;
        }
        if (string.equals(a.a(5))) {
            this.r = this.a(string, this.b[2]);
            this.r.a(d2);
            a.a.a(this.r);
            return;
        }
        if (string.equals(a.a(6))) {
            this.g = new d(15, 15);
            d d15 = new d(10, 0);
            d15.a(null, string, this.a, -1);
            d15.a = this.b[4];
            this.a = new boolean[12];
            for (int j = this.e; j <= 7; ++j) {
                this.a[i.a[j]] = true;
            }
            String[] stringArray = new String[12];
            for (n2 = 0; n2 < 12; ++n2) {
                stringArray[n2] = this.a[n2] ? a.a(42) : a[n2];
            }
            String[] stringArray4 = new String[12 + this.R];
            System.arraycopy(stringArray, 0, stringArray4, 0, 12);
            System.arraycopy(this.i, 0, stringArray4, 12, this.R);
            this.f = new d(0, 0);
            this.f.a(stringArray4, 0, 0, this.a, this.b - d15.g - this.e.q * 2, 3, 4);
            this.g.a(this.f, this.c, (this.b + d15.g) / 2, 3);
            this.g.a(d15, 0, 0, 0);
            this.g.g = true;
            this.g.a((byte)0, true);
            this.g.a(d2);
            a.a.a(this.g);
            return;
        }
        if (string.equals(a.a(7))) {
            this.y = new d(11, 0);
            d d16 = this.y.a(string);
            this.y.a(string).a = this.b[6];
            this.y.a(this.j, this.W / 2, (this.b + d16.g) / 2, this.a, this.b - d16.g, 3, 0);
            this.y.a(d2);
            a.a.a(this.y);
            return;
        }
        if (string.equals(a.a(8))) {
            this.m = new d(15, 15);
            d d17 = new d(10, 0);
            new d(10, 0).a = this.b[5];
            d17.a(null, string, this.a, -1);
            this.m.a(d17, 0, 0, 20);
            int n14 = d17.g;
            d[] dArray = new d[3];
            this.c = new d[3];
            for (n2 = 0; n2 < 3; ++n2) {
                int n15 = 8;
                if (n2 != 0) {
                    n15 = 9;
                }
                if (n2 != 2) {
                    n15 |= 2;
                }
                dArray[n2] = new d(10, n15);
                dArray[n2].a(null, e.a[n2], this.c, -1);
                this.m.a(dArray[n2], 0, n14, 20);
                n15 = 4;
                if (n2 != 0) {
                    n15 = 5;
                }
                if (n2 != 2) {
                    n15 |= 2;
                }
                this.c[n2] = new d(14, n15);
                this.c[n2].a(this.g, this.c, dArray[n2].g);
                this.c[n2].i = e.a[n2] ? 0 : 1;
                this.m.a(this.c[n2], this.Y, n14, 20);
                n14 += dArray[n2].g;
            }
            this.m.z = 2;
            this.m.a(d2);
            a.a.a(this.m);
            return;
        }
        if (string.equals(a.a(9))) {
            this.b = new d(15, 15);
            d d18 = new d(10, 0);
            d18.a(null, string, this.a, -1);
            d18.a = this.b[7];
            object = new String[20];
            for (n3 = 0; n3 <= 19; ++n3) {
                object[n3] = n3 > 0 ? a.a(g[n3 - 1]) + " " + n3 + "/" + 19 : a.a(85) + " " + n3 + "/" + 19;
            }
            this.c = new d(14, 2);
            this.c.a((String[])object, this.a, -1);
            this.d = new d(10, 1);
            this.d.a(null, a.a(15), this.a, this.b - d18.g - this.c.g - this.e.q * 2);
            n3 = d18.g + this.e.q;
            this.b.a(this.c, this.c, n3, 17);
            this.b.a(this.d, this.c, n3 += this.c.g, 17);
            this.b.a(d18, 0, 0, 0);
            this.b.a(d2);
            this.b.g = true;
            a.a.a(this.b);
            return;
        }
        if (string.equals(a.a(10))) {
            d d19 = new d(15, 15);
            object = new d(10, 0);
            object.a(null, string, this.a, -1);
            object.a = this.b[8];
            d d20 = new d(10, 0);
            String string4 = a.a(16, this.a);
            d20.a(null, string4, this.a, this.b - object.g - this.e.q * 2);
            d19.a(d20, 0, (this.b + object.g) / 2, 6);
            d19.a((d)object, 0, 0, 0);
            d19.a(d2);
            d19.g = true;
            a.a.a(d19);
            return;
        }
        if (string.equals(a.a(11))) {
            this.v = this.a(null, a.a(86), this.b, -1);
            this.v.a((byte)0, true);
            this.v.a(d2);
            a.a.a(this.v);
            return;
        }
        if (string.equals(a.a(60))) {
            this.a(this.b, this.d, this.b, (a)d2);
            return;
        }
        if (string.equals(a.a(61))) {
            this.k = false;
            this.b(this.a);
            a.a.a(this);
            return;
        }
        if (string.equals(a.a(62))) {
            this.a(this.c, 0);
            this.d = this.c;
            this.c = (byte)6;
            this.h = true;
            this.a = this.a.a((int)this.a.c, (int)this.a.d, (byte)0);
            this.u = 0;
            this.a = true;
            this.b = true;
            this.a.a(this.c, (int)this.a.c, (int)this.a.d);
            this.a.a(a[1]);
            this.e(this.a[this.u].c, this.a[this.u].d);
            this.d = true;
            this.e = true;
            a.a.a(this);
            return;
        }
        if (string.equals(a.a(63))) {
            this.n = new d(15, 15);
            this.n.K = this.b;
            boolean bl = false;
            this.o = new d(2, 2);
            this.p = new d(3, 1);
            this.q = new d(10, 3);
            this.q.f = true;
            this.o.a = this.p.a[0];
            this.q.a(null, a.a(184 + this.p.a[0].d), this.a, this.b - this.o.g - this.p.g);
            this.n.a(this.o, 0, 0, 0);
            this.n.a(this.q, 0, this.o.g, 0);
            this.n.a(this.p, 0, this.b, 32);
            this.n.g = true;
            this.n.a(this);
            this.n.a((byte)0, true);
            a.a.a(this.n);
            return;
        }
        if (string.equals(a.a(64))) {
            this.a.d();
            this.j();
            this.g = this.a(this.q, this.r, (byte)0);
            this.c = 0;
            a.a.a(this);
            return;
        }
        if (string.equals(a.a(66))) {
            this.n();
            a.a.a(this);
            return;
        }
        if (string.equals(a.a(68))) {
            this.a((byte)this.j, (int)this.a.c, (int)this.a.d);
            a.a.a(this.a(null, a.a(74), this.b, 1000));
            e.b(9, 1);
            this.a.d();
            this.c = 0;
            return;
        }
        if (string.equals(a.a(67))) {
            if (this.b((int)this.a.c, (int)this.a.d, this.a)) {
                this.b((int)this.a.c, (int)this.a.d, this.j[this.a.e]);
                a.a.a(this.a(null, a.a(73), this.b, 1000));
                this.c = (byte)9;
                e.b(9, 1);
                this.d = this.c;
            }
            this.a.d();
            return;
        }
        if (string.equals(a.a(69))) {
            this.c = (byte)7;
            this.a = this.a.a((int)this.a.c, (int)this.a.d, (byte)1);
            this.a = true;
            this.b = true;
            this.a.a(this.c, (int)this.a.c, (int)this.a.d);
            this.d = true;
            a.a.a(this);
            return;
        }
        if (string.equals(a.a(70))) {
            d d21 = new d(15, 15);
            object = new d(10, 0);
            object.a(null, this.b, this.a, -1);
            d d22 = new d(8, 0);
            d22.a(this.a, this.b - object.g - this.e.q, this.b, this.a);
            d21.a(d22, this.c, this.d + (object.g - this.e.q) / 2, 3);
            d21.a((d)object, 0, 0, 0);
            d21.a(d2);
            d21.g = true;
            a.a.a(d21);
            return;
        }
        if (string.equals(a.a(71))) {
            this.e.a((byte)0, false);
            this.e.a(d2);
            a.a.a(this.e);
        }
    }

    public final c a(c c2, int n, int n2) {
        byte by = this.f;
        this.f[by] = this.f[by] - c2.k;
        c2.g = 100;
        c2.a(n, n2);
        if (!this.a.contains(c2)) {
            this.a.addElement(c2);
        }
        this.t = true;
        return c2;
    }

    public final c a(byte by, int n, int n2) {
        byte by2 = this.f;
        this.f[by2] = this.f[by2] - c.a[by];
        this.t = true;
        return c.a(by, this.f, n, n2);
    }

    public final h a(byte by, byte by2) {
        return this.a[by][by2];
    }

    public final void i() {
        this.a = new Vector();
        this.a = null;
        this.a = null;
        this.i = null;
    }

    public final void b(int n) throws Exception {
        int n2;
        DataInputStream dataInputStream;
        int n3;
        e.h();
        this.c = new Vector();
        this.n = false;
        this.c = true;
        this.f = false;
        this.r = false;
        this.b = null;
        this.b = null;
        this.h = null;
        this.c = null;
        this.d = null;
        this.e.removeAllElements();
        this.a = 0;
        this.f = 0;
        this.f = 0;
        this.aC = 0;
        this.i();
        this.b = null;
        this.b = null;
        this.c = null;
        this.e = 0;
        for (n3 = 0; n3 < 5; ++n3) {
            this.i[n3] = -1;
        }
        this.h = true;
        e.b("/1.pak");
        if (this.b == 0) {
            this.b = a.a(113 + n);
            dataInputStream = new DataInputStream(e.a("m" + n));
        } else {
            this.b = this.b(n);
            dataInputStream = this.a(n);
        }
        this.o = dataInputStream.readInt();
        this.p = dataInputStream.readInt();
        this.b = new byte[this.o][this.p];
        this.c = new byte[this.o][this.p];
        this.g = new byte[this.o][this.p];
        this.aw = 0;
        int n4 = 0;
        byte[][] byArray = new byte[30][3];
        byte[][] byArray2 = new byte[30][2];
        for (n3 = 0; n3 < this.o; n3 = (int)((short)(n3 + 1))) {
            for (int n5 = 0; n5 < this.p; n5 = (int)((short)(n5 + 1))) {
                this.b[n3][n5] = dataInputStream.readByte();
                this.c[n3][n5] = 0;
                if (this.b[n3][n5] < this.j && this.b[n3][n5] != 27) continue;
                n2 = this.a(n3, n5);
                byArray[n4][0] = (byte)n3;
                byArray[n4][1] = (byte)n5;
                byArray[n4][2] = (byte)n2;
                ++n4;
                if (this.a(n3, n5) != 9) continue;
                if (this.b == 1 && n2 != 0 && this.i[n2] == -1) {
                    this.j[this.e] = (byte)n2;
                    this.i[n2] = this.e;
                    this.e = (byte)(this.e + 1);
                }
                byArray2[this.aw][0] = (byte)n3;
                byArray2[this.aw][1] = (byte)n5;
                ++this.aw;
            }
        }
        this.j = new int[n4];
        this.e = new byte[n4][];
        for (n3 = 0; n3 < n4; n3 = (int)((short)(n3 + 1))) {
            this.e[n3] = byArray[n3];
        }
        this.f = new byte[this.aw][2];
        System.arraycopy(byArray2, 0, this.f, 0, this.aw);
        this.k = this.o * 24;
        this.l = this.p * 24;
        if (this.b == 1) {
            for (n3 = 0; n3 < this.e; n3 = (int)((short)(n3 + 1))) {
                this.f[n3] = this.f;
            }
        } else {
            this.e = (byte)2;
            this.f[0] = 0;
            this.f[1] = 0;
            this.i[1] = 0;
            this.i[2] = 1;
            this.j[0] = 1;
            this.j[1] = 2;
            this.k[0] = 0;
            this.k[1] = 1;
            this.l[0] = 1;
            this.l[1] = 0;
            this.g = 100;
        }
        for (n3 = 0; n3 < this.e.length; n3 = (int)((short)(n3 + 1))) {
            n2 = this.e[n3][2];
            if (n2 <= 0 || this.l[this.d(n2)] != 2) continue;
            this.b((int)this.e[n3][0], (int)this.e[n3][1], 0);
        }
        n2 = dataInputStream.readInt();
        dataInputStream.skip(n2 * 4);
        int n6 = dataInputStream.readInt();
        this.b = new c[this.e];
        this.a = new c[this.e][4];
        this.e = new int[this.e];
        for (n3 = 0; n3 < n6; n3 = (int)((short)(n3 + 1))) {
            byte by = dataInputStream.readByte();
            int n7 = dataInputStream.readShort() / 24;
            int n8 = dataInputStream.readShort() / 24;
            byte by2 = (byte)(by % 12);
            byte by3 = (byte)this.d(1 + by / 12);
            if (this.l[by3] == 2) continue;
            c c2 = c.a(by2, by3, n7, n8);
            if (by2 != 9) continue;
            this.b[by3] = c2;
        }
        dataInputStream.close();
        this.e = this.b == 0 ? this.a(a.a(121 + this.s), a.a(129 + this.s), this.b, -1) : (this.e = this.a(a.a(71), a.a(137), this.b, -1));
        this.z = false;
        this.q = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.r = null;
        for (n3 = 0; n3 < this.b.length; n3 = (int)((short)(n3 + 1))) {
            if (this.b[n3] == null) {
                this.d[n3][0] = 0;
                this.d[n3][1] = 0;
                continue;
            }
            this.d[n3][0] = (byte)this.b[n3].c;
            this.d[n3][1] = (byte)this.b[n3].d;
        }
        if (this.b == 1) {
            this.aC = 100;
            this.l = true;
            for (n3 = 0; n3 < this.e; n3 = (int)((short)(n3 + 1))) {
                if (this.l[n3] != 2) {
                    this.f = (byte)n3;
                    break;
                }
                this.a = (short)(this.a + 1);
            }
        }
        if (this.b[this.f] != null) {
            this.c(this.b[this.f].c, this.b[this.f].d);
            this.e(this.b[this.f].c, this.b[this.f].d);
        }
        this.d = new c[this.e.length];
        this.p = new byte[this.e.length];
        this.a = new h[this.e.length];
        for (n3 = 0; n3 < this.e.length; n3 = (int)((short)(n3 + 1))) {
            if (this.a((int)this.e[n3][0], (int)this.e[n3][1]) != 8) continue;
            this.a[n3] = h.a(this.r, 0, -1, 0, 1, 250, (byte)0);
            this.a[n3].d = false;
        }
        if (this.l[this.f] == 0) {
            this.p();
        }
    }

    public final void j() {
        this.u = 0;
        this.a = null;
        this.a = new c[0];
        this.a(this.c, 0);
        this.a = false;
        this.b = false;
    }

    public final void a(byte[][] byArray, int n) {
        for (int j = 0; j < this.o; ++j) {
            for (int k = 0; k < this.p; ++k) {
                byArray[j][k] = (byte)n;
            }
        }
    }

    public final void c(c c2) {
        e.d(10);
        this.i = null;
        this.a(this.c, 0);
        this.a = false;
        if (this.l[this.f] == 1) {
            this.ad = 1;
            this.c = true;
            this.a.a(a[0]);
            this.c = (byte)3;
            this.a(this.a(c2, (byte)0), c2);
            e.b(11, 1);
            return;
        }
        if (this.l[this.f] == 0) {
            this.k = (byte)4;
            this.c = 0;
        }
    }

    public final byte[] a(c c2, byte by) {
        Object[] objectArray;
        int n = 0;
        byte[] byArray = new byte[this.d.length];
        if (by == 1 && this.a((int)this.a.c, (int)this.a.d) == 9 && this.b((int)this.a.c, (int)this.a.d, c2.e)) {
            ++n;
            byArray[0] = 0;
        }
        if (this.a((int)c2.c, (int)c2.d, c2)) {
            byArray[n++] = 2;
        } else if (this.b((int)c2.c, (int)c2.d, c2)) {
            byArray[n++] = 1;
        }
        if ((by == 1 || c2.d != 7) && c2.a.length > 0 && c2.a((int)c2.c, (int)c2.d, (byte)0).length > 0) {
            byArray[n++] = 3;
        }
        if (c2.a((short)32) && (objectArray = c2.a((int)c2.c, (int)c2.d, (byte)1)).length > 0) {
            byArray[n++] = 4;
        }
        byArray[n++] = by == 1 ? 5 : 6;
        objectArray = new byte[n];
        System.arraycopy(byArray, 0, objectArray, 0, n);
        return objectArray;
    }

    public final void k() throws Exception {
        switch (this.A) {
            case 0: {
                if (this.c >= 1200L) {
                    this.A = 1;
                }
                this.B = 40;
                return;
            }
            case 1: {
                if (this.B <= 0) {
                    this.a = null;
                    this.B = 0;
                    ++this.A;
                    this.a(0, 0, 3);
                    return;
                }
                --this.B;
                return;
            }
            case 2: {
                this.a(1, 2, 3);
                this.c = new f("logo");
                ++this.A;
                return;
            }
            case 3: {
                if (++this.B <= 40) break;
                try {
                    this.b = new f("splash");
                    this.d = new f("glow");
                }
                catch (Exception exception) {}
                this.B = 11;
                ++this.A;
                a.a.d();
                return;
            }
            case 4: {
                if (this.B < 16) {
                    ++this.B;
                    ++this.D;
                    if (this.d == null) break;
                    this.M = -this.d.a;
                    return;
                }
                if (this.M >= this.W * 4) {
                    if (this.d != null) {
                        this.M = -this.d.a;
                    }
                } else {
                    this.M += this.c.a / 6;
                }
                if (this.c % 100L == 0L) {
                    boolean bl = this.j = !this.j;
                }
                if (this.b != null && !a.a.a() || !this.a()) break;
                if (this.d != null) {
                    this.M = -this.d.a;
                }
                this.j = false;
                int n = this.c.b + 1;
                this.a(this.a, (this.X + n) / 2, this.X - n, (a)(this.b == null ? null : this));
                a.a.d();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() throws Exception {
        int n;
        block164: {
            block179: {
                c c2;
                block180: {
                    block178: {
                        block177: {
                            block175: {
                                block176: {
                                    block173: {
                                        block174: {
                                            block170: {
                                                block172: {
                                                    block171: {
                                                        block169: {
                                                            block168: {
                                                                block167: {
                                                                    block166: {
                                                                        this.c += 50L;
                                                                        if (this.h == 2) {
                                                                            this.w();
                                                                            return;
                                                                        }
                                                                        if (this.h == 3) {
                                                                            this.m();
                                                                            return;
                                                                        }
                                                                        if (this.h == 0) {
                                                                            this.k();
                                                                            return;
                                                                        }
                                                                        this.s();
                                                                        if (this.H != -1) {
                                                                            if (e.a[1]) {
                                                                                d d2 = this.a(a.a(196 + this.H, true), (byte)-1, (byte)2);
                                                                                this.a(a.a(196 + this.H, true), (byte)-1, (byte)2).H = 7831691;
                                                                                d2.G = 7831691;
                                                                                d2.a = 0xF7F7E7;
                                                                            }
                                                                            this.H = -1;
                                                                        }
                                                                        if (a.a.a != this) {
                                                                            return;
                                                                        }
                                                                        if (this.c == 0) {
                                                                            for (n = 0; n < this.a.length; ++n) {
                                                                                int n2 = this.a((int)this.e[n][0], (int)this.e[n][1]);
                                                                                if (this.a[n] == null || n2 == -1 || n2 == 0 || this.a[n].d || e.a.nextInt() % 8 != 0) continue;
                                                                                this.a[n].d = true;
                                                                                this.a[n].c(0);
                                                                                this.a[n].s = 1;
                                                                                this.a[n].b((this.e[n][0] + 1) * 24 - this.r.p, this.e[n][1] * 24 - 2);
                                                                                this.d.addElement(this.a[n]);
                                                                            }
                                                                        }
                                                                        if (this.c - this.h >= 300L) {
                                                                            this.g = !this.g;
                                                                            this.h = this.c;
                                                                        }
                                                                        if (this.B && this.c - this.n >= this.m) {
                                                                            this.B = false;
                                                                        }
                                                                        if (this.f) {
                                                                            ++this.B;
                                                                            if (this.B > 16) {
                                                                                if (this.c == 10) {
                                                                                    this.aG = 1;
                                                                                } else if (this.c == 11) {
                                                                                    if (this.b == 0) {
                                                                                        this.p = true;
                                                                                        this.o = true;
                                                                                        this.O = 0;
                                                                                    }
                                                                                    this.J = 0;
                                                                                    this.d = this.c;
                                                                                } else {
                                                                                    this.b(this.e, this.f);
                                                                                    this.j = null;
                                                                                    this.j();
                                                                                }
                                                                                this.f = false;
                                                                            }
                                                                            return;
                                                                        }
                                                                        if (this.p) {
                                                                            if (this.n) {
                                                                                if (this.O < 16) {
                                                                                    ++this.O;
                                                                                }
                                                                            } else if (this.o) {
                                                                                ++this.O;
                                                                                if (this.O > 16) {
                                                                                    this.o = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (this.b != null) {
                                                                            this.x = (this.x + 1) % 12;
                                                                        }
                                                                        if (this.a) {
                                                                            if (this.an == 0) {
                                                                                ++this.am;
                                                                                if (this.am >= 15) {
                                                                                    this.an = 1;
                                                                                }
                                                                            } else {
                                                                                --this.am;
                                                                                if (this.am <= 0) {
                                                                                    this.an = 0;
                                                                                }
                                                                            }
                                                                            if (this.ae > 0) {
                                                                                this.ae -= 4;
                                                                                if (this.ae < 0) {
                                                                                    this.ae = 0;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (this.c && this.c - this.a >= 200L) {
                                                                            this.a.e();
                                                                            this.a = this.c;
                                                                        }
                                                                        int n3 = this.q * 24;
                                                                        int n4 = this.r * 24;
                                                                        int n5 = this.a.n;
                                                                        int n6 = this.a.o;
                                                                        if (n3 > n5) {
                                                                            n5 += 8;
                                                                        } else if (n3 < n5) {
                                                                            n5 -= 8;
                                                                        }
                                                                        if (n4 > n6) {
                                                                            n6 += 8;
                                                                        } else if (n4 < n6) {
                                                                            n6 -= 8;
                                                                        }
                                                                        this.a.b(n5, n6);
                                                                        if (this.m || this.N <= 0) break block166;
                                                                        this.N = this.N < 2 ? 0 : (this.N /= 2);
                                                                        this.t = true;
                                                                        this.u = true;
                                                                        break block164;
                                                                    }
                                                                    if (this.c != 8) break block167;
                                                                    if (this.y == 0) {
                                                                        if (this.N < a) {
                                                                            if (this.N == 0) {
                                                                                this.m = true;
                                                                                this.N = 1;
                                                                            } else {
                                                                                this.N *= 2;
                                                                            }
                                                                            this.t = true;
                                                                            this.u = true;
                                                                            break block164;
                                                                        } else {
                                                                            this.y = 1;
                                                                            this.o();
                                                                            String string = this.l[this.f] == 1 ? "" + this.ar : "?";
                                                                            d d3 = this.a(a.a(75), a.a(76, string), this.b, 1500);
                                                                            a.a.a(d3);
                                                                            d3.G = b[this.j[this.f]];
                                                                            e.a(c[this.j[this.f]], 0);
                                                                            return;
                                                                        }
                                                                    }
                                                                    for (n = this.a.size() - 1; n >= 0; --n) {
                                                                        c c3 = (c)this.a.elementAt(n);
                                                                        if (c3.f == 3 || this.f != c3.e || this.a((int)c3.c, (int)c3.d) != 7 && !this.a((int)c3.c, (int)c3.d, (int)this.k[c3.e]) || c3.g >= 100) continue;
                                                                        int n7 = 100 - c3.g;
                                                                        if (n7 > 20) {
                                                                            n7 = 20;
                                                                        }
                                                                        c3.g += n7;
                                                                        h h2 = h.a("+" + n7, 0, -4, (byte)1);
                                                                        h2.b(c3.n + c3.p / 2, c3.o + c3.q);
                                                                        this.c.addElement(h2);
                                                                    }
                                                                    this.y = 0;
                                                                    this.m = false;
                                                                    this.c = 0;
                                                                    break block164;
                                                                }
                                                                if (this.c != 9) break block168;
                                                                this.c = 0;
                                                                break block164;
                                                            }
                                                            if (this.c != 11) break block169;
                                                            if (!this.f && this.J == 0 && (this.b == 1 || this.c - this.d >= 3000L || a.a.a())) {
                                                                this.b = this.X;
                                                                this.d = this.Z;
                                                                this.a(this.a, this.Z, this.X, null);
                                                                this.J = 1;
                                                                this.o = false;
                                                            }
                                                            break block164;
                                                        }
                                                        if (this.c != 10 && this.c != 14) break block170;
                                                        if (this.aG != 1 && (this.c != 14 || this.aG == 2)) break block171;
                                                        ++this.s;
                                                        if (this.s > this.e) {
                                                            String string = a[a[this.e]];
                                                            d d4 = this.a(null, a.a(82, string), this.X, 3000);
                                                            a.a.a(d4);
                                                            this.e = this.s;
                                                            try {
                                                                byte[] byArray = new byte[]{(byte)this.e};
                                                                e.a("settings", 1, byArray);
                                                            }
                                                            catch (Exception exception) {}
                                                        }
                                                        this.aG = 2;
                                                        break block164;
                                                    }
                                                    if (this.aG != 0) break block172;
                                                    this.f = true;
                                                    this.B = 0;
                                                    break block164;
                                                }
                                                if (this.aG == 2) {
                                                    if (this.c == 14) {
                                                        this.b = this.X;
                                                        this.d = this.Z;
                                                        this.a(this.a, this.Z, this.X, null);
                                                        return;
                                                    }
                                                    if (this.s <= 7) {
                                                        this.b(this.s);
                                                        this.r();
                                                        this.c = 0;
                                                    }
                                                }
                                                break block164;
                                            }
                                            if (this.c != 13) break block173;
                                            if (this.E != 0) break block174;
                                            int n8 = this.e.c(this.f);
                                            this.f.a(400);
                                            e.b(14, 1);
                                            this.a(this.i, this.f.n, this.f.o, 0, 0, 2, 50);
                                            h h3 = h.a("-" + n8, 0, -4, (byte)1);
                                            int n9 = this.f.n + this.f.p / 2;
                                            if (n9 + h3.p / 2 > this.k) {
                                                n9 = this.k - h3.p / 2;
                                            } else if (n9 - h3.p / 2 < 0) {
                                                n9 = h3.p / 2;
                                            }
                                            h3.b(n9, this.f.o + this.f.q);
                                            this.c.addElement(h3);
                                            this.g = this.c;
                                            ++this.E;
                                            break block164;
                                        }
                                        if (this.E == 1) {
                                            if (this.c - this.g >= 800L) {
                                                this.e(this.e.c, this.e.d);
                                                if (this.f.a(this.e, (int)this.e.c, (int)this.e.d)) {
                                                    int n10 = this.f.c(this.e);
                                                    this.e.a(400);
                                                    e.b(14, 1);
                                                    this.a(this.i, this.e.n, this.e.o, 0, 0, 2, 50);
                                                    h h4 = h.a("-" + n10, 0, -4, (byte)1);
                                                    int n11 = this.e.n + this.e.p / 2;
                                                    if (n11 + h4.p / 2 > this.k) {
                                                        n11 = this.k - h4.p / 2;
                                                    } else if (n11 - h4.p / 2 < 0) {
                                                        n11 = h4.p / 2;
                                                    }
                                                    h4.b(n11, this.e.o + this.e.q);
                                                    this.c.addElement(h4);
                                                    this.g = this.c;
                                                    ++this.E;
                                                    break block164;
                                                } else {
                                                    this.h();
                                                }
                                            }
                                            break block164;
                                        } else if (this.c - this.g >= 800L) {
                                            this.h();
                                        }
                                        break block164;
                                    }
                                    if (this.h == null) break block175;
                                    if (this.Q != 0) break block176;
                                    if (this.v) {
                                        this.v = this.a(this.h, this.h.n, -this.n, 0, 12, -1, 0);
                                        d d5 = this.a(null, a.a(280), this.b, 2000);
                                        d5.a(this.c, 2, 17);
                                        a.a.a(d5);
                                        this.Q = 1;
                                    }
                                    break block164;
                                }
                                if (this.Q == 1) {
                                    for (n = 0; n < 3; ++n) {
                                        this.a(this.r, this.v.n + e.a(this.v.p - this.r.p), this.v.o, 0, e.a(-3, 0), 1, 50 * e.a(4));
                                    }
                                    if (this.v.o >= this.h.o) {
                                        this.v.d = false;
                                        this.d(500);
                                        if (this.q) {
                                            int n12 = 25 + e.a(25);
                                            if (n12 > this.h.g) {
                                                n12 = this.h.g;
                                            }
                                            this.h.g -= n12;
                                            h h5 = h.a("-" + n12, 0, -4, (byte)1);
                                            h5.b(this.h.n + this.h.p / 2, this.h.o + this.h.q);
                                            this.c.addElement(h5);
                                        }
                                        this.d(this.h);
                                        this.Q = 2;
                                    }
                                    break block164;
                                } else if (++this.Q >= 20) {
                                    if (this.h.g <= 0) {
                                        this.b = this.h;
                                        this.a(this.h, this.b.n, this.b.o, 0, 0, 1, 50);
                                        e.b(12, 1);
                                        this.e = this.c;
                                    }
                                    this.h = null;
                                }
                                break block164;
                            }
                            if (this.c == null) break block177;
                            if (--this.z <= 0) {
                                this.d(this.c);
                                this.a((byte)27, (int)this.c.c, (int)this.c.d);
                                this.c = null;
                            }
                            break block164;
                        }
                        if (this.b == null) break block178;
                        if (this.c - this.e >= 300L && this.b(this.b.c, this.b.d)) {
                            if (this.b == 0 && this.s == 7 && this.b == this.b[1]) {
                                this.r = true;
                            } else {
                                this.a(this.g, this.b.n, this.b.o, 0, -3, 1, 100);
                                this.b.f = (byte)3;
                                this.b.h = (byte)3;
                                if (this.b.d == 10 || this.b.d == 11) {
                                    this.b.a();
                                } else if (this.b.d == 9) {
                                    this.b.a(-10, -10);
                                    this.b.g = 0;
                                    this.b.b();
                                }
                                if (this.b.d == 9 && this.b.k < 1000) {
                                    this.b.k += 200;
                                }
                            }
                            this.b = null;
                        }
                        break block164;
                    }
                    if (this.e.size() <= 0) break block179;
                    c2 = (c)this.e.elementAt(0);
                    if (this.P != 0) break block180;
                    this.e(c2.c, c2.d);
                    this.P = 1;
                    break block164;
                }
                if (!this.b(c2.c, c2.d)) break block164;
                this.a(this.k, c2.n + e.a(c2.p), c2.o + e.a(c2.q), 0, 0, 1, 50);
                if (this.P == 1) {
                    e.b(13, 1);
                }
                if (this.P <= 5) {
                    int n13 = 200;
                    if (this.P == 5) {
                        n13 = 1000;
                    }
                    int n14 = c2.n + (c2.p - this.t.p) / 2;
                    int n15 = c2.o - this.P * 4;
                    if (n14 < 0) {
                        n14 = 0;
                    } else if (n14 + this.t.p > this.k) {
                        n14 = this.k - this.t.p;
                    }
                    if (n15 < 0) {
                        n15 = 0;
                    }
                    this.a(this.t, n14, n15, 0, 0, 1, n13);
                }
                ++this.P;
                if (this.P >= 20) {
                    this.e.removeElement(c2);
                    this.P = 0;
                    if (c2.d != 9 && c2.a <= 6 && c2.a % 2 == 0) {
                        a.a.a(this.a(null, a.a(80) + "\n" + c2.a, this.a, 2000));
                    }
                }
                break block164;
            }
            if (this.d != null) {
                if (this.c - this.f >= 400L) {
                    this.d.a();
                    c c4 = c.a((byte)10, this.g, (int)this.d.c, this.d.d);
                    c4.d();
                    this.d = null;
                }
            } else if (!this.z) {
                if (this.c == 2) {
                    if (this.a.f != 1 && this.v) {
                        this.c(this.a);
                    }
                } else if (this.l[this.f] == 0) {
                    this.q();
                } else if (this.a()) {
                    if (this.e && a.a.b(h)) {
                        a.a.a(16);
                        a.a.b(h);
                    }
                    if (this.c == 6 || this.c == 7) {
                        if (a.a.a(4) || a.a.a(1)) {
                            --this.u;
                            if (this.u < 0) {
                                this.u = this.a.length - 1;
                            }
                            a.a.b(4);
                            a.a.b(1);
                            this.h = true;
                        } else if (a.a.a(8) || a.a.a(2)) {
                            ++this.u;
                            if (this.u >= this.a.length) {
                                this.u = 0;
                            }
                            a.a.b(8);
                            a.a.b(2);
                            this.h = true;
                        }
                        this.e(this.a[this.u].c, this.a[this.u].d);
                        if (this.h) {
                            this.g = this.a(this.q, this.r, (byte)0);
                            this.u = true;
                        }
                        if (a.a.a(16)) {
                            if (this.c == 6) {
                                this.a(this.a, this.a[this.u]);
                            } else if (this.c == 7) {
                                this.a(this.a[this.u], this.f);
                                this.a.d();
                                this.c = 0;
                            }
                            this.a = null;
                            this.a = false;
                            this.b = false;
                            this.d = false;
                            this.e = false;
                        }
                        this.h = false;
                    } else {
                        Object object;
                        Object object2;
                        if (this.c - this.b >= 150L && this.a.n % 24 == 0 && this.a.o % 24 == 0) {
                            if (a.a.a(4) || a.a.c(4)) {
                                if (this.q > 0) {
                                    --this.q;
                                }
                                this.h = true;
                                this.b = this.c;
                            } else if (a.a.a(8) || a.a.c(8)) {
                                if (this.q < this.o - 1) {
                                    ++this.q;
                                }
                                this.h = true;
                                this.b = this.c;
                            }
                            if (a.a.a(1) || a.a.c(1)) {
                                if (this.r > 0) {
                                    --this.r;
                                }
                                this.h = true;
                                this.b = this.c;
                            } else if (a.a.a(2) || a.a.c(2)) {
                                if (this.r < this.p - 1) {
                                    ++this.r;
                                }
                                this.h = true;
                                this.b = this.c;
                            }
                            if (this.h) {
                                if (this.c == 1) {
                                    if (this.c[this.q][this.r] > 0) {
                                        this.b = this.a.a((int)this.a.c, (int)this.a.d, this.q, this.r);
                                    }
                                } else {
                                    this.g = this.a(this.q, this.r, (byte)0);
                                }
                                this.u = true;
                            }
                            this.h = false;
                        }
                        if ((this.c == 1 || this.c == 0) && a.a.a(256)) {
                            object2 = this.a(this.q, this.r, (byte)0);
                            if (object2 != null) {
                                object = new d(15, 15);
                                new d(15, 15).K = this.b;
                                boolean bl = false;
                                d d6 = new d(5, 2);
                                d d7 = new d(10, 1);
                                new d(10, 1).f = true;
                                String string = a.a(184 + ((c)object2).d);
                                if (((c)object2).g != 0) {
                                    StringBuffer stringBuffer = new StringBuffer(a.a(98));
                                    if ((((c)object2).g & 2) != 0) {
                                        stringBuffer.append('\n');
                                        stringBuffer.append(a.a(100));
                                    }
                                    if ((((c)object2).g & 1) != 0) {
                                        stringBuffer.append('\n');
                                        stringBuffer.append(a.a(99));
                                    }
                                    stringBuffer.append("\n-----------\n");
                                    string = stringBuffer.toString() + string;
                                }
                                d7.a(null, string, this.a, this.b - d6.g);
                                ((d)object).a(d6, 0, 0, 0);
                                ((d)object).a(d7, 0, d6.g, 0);
                                ((d)object).g = true;
                                ((d)object).a(this);
                                a.a.a((a)object);
                            }
                            a.a.b(256);
                        }
                        if (this.c == 1) {
                            if (a.a.a(16) && this.a != null) {
                                object2 = this.a(this.q, this.r, (byte)0);
                                if (this.c[this.q][this.r] > 0 && (object2 == null || object2 == this.a)) {
                                    this.v = this.a.c;
                                    this.w = this.a.d;
                                    this.a.a(this.q, this.r, true);
                                    this.i = this.a;
                                    this.c = false;
                                    this.a = false;
                                    this.b = null;
                                    this.a = null;
                                    this.d = false;
                                    this.e = false;
                                    this.c = (byte)2;
                                    e.b(10, 1);
                                }
                                a.a.b(16);
                            }
                        } else if (this.c == 0) {
                            if (a.a.a(512)) {
                                int n16 = 0;
                                object = this.b[this.f];
                                if (this.g != null && this.g.d == 9) {
                                    object = this.a[this.f][(this.g.j + 1) % this.e[this.f]];
                                }
                                while (++n16 < this.e[this.f] && ((c)object).f == 3) {
                                    object = this.a[this.f][(((c)object).j + 1) % this.e[this.f]];
                                }
                                if (object != null && ((c)object).f != 3) {
                                    this.e(((c)object).c, ((c)object).d);
                                    this.b(((h)object).n + 12, ((h)object).o + 12);
                                }
                            } else if (a.a.a(32)) {
                                if (this.b) {
                                    this.a(this.c, 0);
                                    this.a = false;
                                    this.b = false;
                                } else {
                                    this.a = this.a(this.q, this.r, (byte)0);
                                    if (this.a != null) {
                                        this.a(this.c, 0);
                                        this.a.a(this.c);
                                        this.b = true;
                                        this.a = true;
                                        this.ae = 12;
                                    }
                                }
                                a.a.b(32);
                            } else if (a.a.a(16) || a.a.a(h)) {
                                this.a = this.a(this.q, this.r, (byte)0);
                                if (this.a != null && this.a.f == 0 && this.a.e == this.f) {
                                    byte[] byArray = this.a(this.a, (byte)1);
                                    object2 = byArray;
                                    if (byArray.length > 1) {
                                        this.a((byte[])object2, this.a);
                                        e.b(11, 1);
                                    } else {
                                        this.k = false;
                                        this.b(this.a);
                                    }
                                } else if (this.a(this.q, this.r) == 9 && this.b(this.q, this.r, this.f)) {
                                    object2 = new byte[]{0};
                                    this.a((byte[])object2, null);
                                    e.b(11, 1);
                                } else {
                                    this.a = null;
                                    this.a = new d(11, 0);
                                    this.a.a(this.b, 2, 2, -1, this.b, 20, 0);
                                    this.a.a(this);
                                    a.a.a(this.a);
                                    e.b(11, 1);
                                }
                                a.a.d();
                            }
                        }
                    }
                }
            }
        }
        int n17 = this.a.size();
        for (n = 0; n < n17; ++n) {
            ((c)this.a.elementAt(n)).c();
        }
        if (this.c - this.i >= 300L) {
            this.F = (this.F + 1) % this.e.length;
            this.d[this.G] = this.e[this.F];
            this.i = this.c;
        }
        this.l();
        if (this.d && a.a.b(i)) {
            if (this.c == 1) {
                this.c = 0;
                this.a(this.c, 0);
                this.b = null;
                this.a.a(a[0]);
                this.e(this.a.c, this.a.d);
                this.a = null;
            } else if (this.c == 6 || this.c == 7) {
                this.c = this.d;
                this.a(this.c, 0);
                this.a.a(a[0]);
                this.e(this.a.c, this.a.d);
                a.a.a(this.a);
            }
            this.a = false;
            this.b = false;
            a.a.b(i);
            this.d = false;
            this.e = false;
        }
        for (n = this.c.size() - 1; n >= 0; --n) {
            h h6 = (h)this.c.elementAt(n);
            h6.c();
            if (h6.d) continue;
            this.c.removeElement(h6);
        }
        n = 0;
        n17 = this.d.size();
        while (true) {
            if (n >= n17) {
                this.d.removeAllElements();
                return;
            }
            this.c.addElement(this.d.elementAt(n));
            ++n;
        }
    }

    public final void d(c c2) {
        int n = c2.o + 24;
        this.a(this.g, c2.n, n - this.g.q, 0, -2, 1, 100);
        for (int j = 0; j < 5; ++j) {
            this.a(this.r, c2.n, n - this.r.q, -2 + j, e.a(-4, -1), 1, 50 + 50 * e.a(4));
        }
        this.a(this.h, c2.n, c2.o, 0, 0, 1, 100);
    }

    public final void a(c c2, byte by) {
        this.d = c2;
        this.g = by;
        this.a(this.h, c2.n - 8, c2.o - 8, 1, 1, 3, 50);
        this.a(this.h, c2.n + 8, c2.o - 8, -1, 1, 3, 50);
        this.a(this.h, c2.n - 8, c2.o + 8, 1, -1, 3, 50);
        this.a(this.h, c2.n + 8, c2.o + 8, -1, -1, 3, 50);
        this.f = this.c;
    }

    public final void l() {
        if (this.i == null) {
            this.d(this.a.n + 12, this.a.o + 12);
            return;
        }
        this.d(this.i.n + 12, this.i.o + 12);
    }

    public final boolean a(int n, int n2) {
        return this.m == this.b(n) && this.n == this.c(n2);
    }

    public final boolean b(int n, int n2) {
        return this.a(n * 24 + 12, n2 * 24 + 12);
    }

    public final int b(int n) {
        int n2;
        if (this.k > this.a) {
            n2 = this.c - n;
            if (n2 > 0) {
                n2 = 0;
            } else if (n2 < this.a - this.k) {
                n2 = this.a - this.k;
            }
        } else {
            n2 = (this.a - this.k) / 2;
        }
        return n2;
    }

    public final int c(int n) {
        int n2;
        if (this.l > this.b) {
            n2 = this.d - n;
            if (n2 > 0) {
                n2 = 0;
            } else if (n2 < this.b - this.l) {
                n2 = this.b - this.l;
            }
        } else {
            n2 = (this.b - this.l) / 2;
        }
        return n2;
    }

    public final void b(int n, int n2) {
        this.m = this.b(n);
        this.n = this.c(n2);
    }

    public final void c(int n, int n2) {
        this.b(n * 24 + 12, n2 * 24 + 12);
    }

    public final void d(int n, int n2) {
        int n3;
        this.v = true;
        int n4 = this.b(n);
        int n5 = this.c(n2);
        int n6 = n4 - this.m;
        int n7 = n5 - this.n;
        if (n6 != 0) {
            n3 = n6 / 2;
            if (n6 < 0) {
                if (n3 > -this.ad) {
                    n3 = -this.ad;
                } else if (n3 < -this.V) {
                    n3 = -this.V;
                }
            } else if (n3 < this.ad) {
                n3 = this.ad;
            } else if (n3 > this.V) {
                n3 = this.V;
            }
            this.m += n3;
            this.v = false;
        }
        if (n7 != 0) {
            n3 = n7 / 2;
            if (n7 < 0) {
                if (n3 > -this.ad) {
                    n3 = -this.ad;
                } else if (n3 < -this.V) {
                    n3 = -this.V;
                }
            } else if (n3 < this.ad) {
                n3 = this.ad;
            } else if (n3 > this.V) {
                n3 = this.V;
            }
            this.n += n3;
            this.v = false;
        }
    }

    public final void e(int n, int n2) {
        this.q = n;
        this.r = n2;
        this.a.b(n * 24, n2 * 24);
        this.g = this.a(this.q, this.r, (byte)0);
        this.u = true;
    }

    public final void b(Graphics graphics) {
        int n = -this.m / 24;
        int n2 = -this.n / 24;
        if (n2 < 0) {
            n2 = 0;
        }
        int n3 = (this.a - this.m - 1) / 24;
        int n4 = (this.b - this.n - 1) / 24;
        if (n4 >= this.p) {
            n4 = this.p - 1;
        }
        int n5 = this.m < 0 ? this.m % 24 : this.m;
        int n6 = this.n < 0 ? this.n % 24 : this.n;
        int n7 = 0;
        if (this.b) {
            n7 = 1;
        }
        for (int j = n2; j <= n4; ++j) {
            int n8 = n5;
            for (int k = n; k <= n3; ++k) {
                byte by = this.b[k][j];
                this.d[by].a(graphics, n8, n6);
                int n9 = j + 1;
                if (n9 < this.p && this.h[this.b[k][n9]] == 9) {
                    this.d[28].a(graphics, n8, n6);
                }
                if (this.a && this.c[k][j] > 0) {
                    if (this.ae != 0) {
                        graphics.clipRect(n8 + this.ae, n6 + this.ae, 24 - this.ae * 2, 24 - this.ae * 2);
                    }
                    this.s.a(graphics, n7, n8, n6, 0);
                    if (this.ae != 0) {
                        graphics.setClip(0, 0, this.a, this.b);
                    }
                }
                n8 += 24;
            }
            n6 += 24;
        }
    }

    public final void c(Graphics graphics) {
        graphics.setFont(e.b);
        graphics.setColor(0);
        graphics.fillRect(0, 0, this.W, this.X);
        graphics.setColor(0xFFFFFF);
        e.b(graphics, a.a(58), this.W / 2, (this.X - e.b.getHeight()) / 2, 17);
    }

    public static final int a(int n, int n2, int n3, int n4) {
        if (n3 == 0) {
            return n;
        }
        if (n3 == n4) {
            return n2;
        }
        int n5 = n & 0xFF0000;
        int n6 = n & 0xFF00;
        int n7 = n & 0xFF;
        int n8 = (((n2 & 0xFF0000) - n5) * n3 / n4 & 0xFF0000) + n5;
        int n9 = (((n2 & 0xFF00) - n6) * n3 / n4 & 0xFF00) + n6;
        int n10 = ((n2 & 0xFF) - n7) * n3 / n4 + n7;
        return n8 | n9 | n10;
    }

    public static final int a(int n, int n2, int n3) {
        int n4 = (n & 0xFF0000) * n2 / n3 & 0xFF0000;
        int n5 = (n & 0xFF00) * n2 / n3 & 0xFF00;
        int n6 = (n & 0xFF) * n2 / n3;
        return n4 | n5 | n6;
    }

    public final void a(int n, int n2, int n3) throws Exception {
        this.aj = n2;
        this.ak = n3;
        if (this.aj == 3) {
            this.aj = 1;
        }
        if (this.ak == 3) {
            this.ak = 1;
        }
        this.j = this.h;
        try {
            this.f = new f("intro" + n);
        }
        catch (Exception exception) {}
        this.af = e.d;
        if (this.f != null) {
            this.al = this.f.b;
            this.B = 0;
            this.ah = (this.X - this.f.b) / this.af;
        } else {
            this.al = 0;
            this.B = 16;
            this.ah = this.X / this.af;
        }
        this.m = a.a(a.a(215 + n), this.W, e.a);
        this.ag = this.X - this.af;
        this.ai = 0;
        this.w = false;
        a.a.d();
        this.h = (byte)3;
    }

    public final void a(String string) {
        this.j = this.h;
        this.m = a.a(string, this.W, e.a);
        this.B = 16;
        this.w = false;
        this.aj = 3;
        this.ak = 3;
        this.al = 0;
        this.af = e.d;
        this.ah = this.X / this.af;
        this.ag = this.X - this.af;
        this.ai = 0;
        a.a.d();
        this.h = (byte)3;
    }

    public final void m() {
        if (this.w) {
            --this.B;
            if (this.B < 0) {
                this.B = 0;
                this.h = this.j;
                this.f = null;
                this.m = null;
                return;
            }
        } else {
            if (this.aj == 2 && this.B < 40 || this.aj != 2 && this.B < 16) {
                ++this.B;
            } else {
                --this.ag;
                if (this.ag < this.al) {
                    this.ag = this.al + this.af - (this.al - this.ag);
                    ++this.ai;
                }
            }
            if (this.ai >= this.m.length || a.a.b(h)) {
                this.w = true;
                if (this.f != null || this.ai < this.m.length) {
                    if (this.ak == 2) {
                        this.B = 40;
                        return;
                    }
                    this.B = 16;
                    return;
                }
                this.B = 0;
            }
        }
    }

    public final void d(Graphics graphics) {
        int n;
        graphics.setFont(e.a);
        graphics.setColor(0);
        graphics.fillRect(0, 0, this.W, this.X);
        if (this.f != null) {
            if (!this.w && (this.aj == 2 && this.B >= 40 || this.aj != 2 && this.B >= 16)) {
                this.f.a(graphics, 0, 0);
            } else if (this.ak == 2 && this.w || this.aj == 2 && !this.w) {
                i.a(graphics, this.B, 40, 0, this.f, 0, 0, 2);
            } else if (this.ak == 3 && this.w || this.aj == 3 && !this.w) {
                this.f.a(graphics, 0, 0);
                n = 255 * (16 - this.B) / 16;
                e.a(graphics, n << 24, 0, 0, this.f.a, this.f.b);
            } else {
                this.f.a(graphics, 0, 0);
                if (this.w) {
                    if (this.ak == 1 && this.B <= 16) {
                        i.a(graphics, 0, 16 - this.B, 16, 0, this.f, 0, 0, this.W, this.X);
                    }
                } else if (this.aj == 0) {
                    if (this.B <= 16) {
                        i.a(graphics, 0xFFFFFF, this.B, 16, 1, null, 0, 0, this.W, this.X);
                    }
                } else if (this.aj == 1 && this.B <= 16) {
                    i.a(graphics, 0, this.B, 16, 1, null, 0, 0, this.W, this.f.b);
                }
            }
        }
        graphics.setClip(0, 0, this.W, this.X);
        n = this.B;
        if (this.w && this.ak == 2 && (n -= 24) < 0) {
            n = 0;
        }
        int n2 = this.ag;
        for (int j = this.ai; j < this.ai + this.ah && j < this.m.length && n2 < this.X - this.af; n2 += this.af, ++j) {
            int n3 = this.af;
            if (n2 < this.al + this.af) {
                n3 = n2 - this.al;
            } else if (n2 + this.af > this.X - this.af) {
                n3 = this.X - this.af - n2;
            }
            int n4 = n3 < this.af ? i.a(14672074, n3, this.af) : 14672074;
            if (this.w) {
                n4 = i.a(0, n4, n, 16);
            }
            graphics.setColor(n4);
            e.b(graphics, this.m[j], this.Y, n2 + 3, 17);
        }
        if (!this.w) {
            this.a(graphics, h, 2, this.X);
        }
    }

    public final void e(Graphics graphics) {
        if (this.A == 0) {
            graphics.setColor(0xFFFFFF);
            graphics.fillRect(0, 0, this.W, this.X);
            i.a(graphics, this.B, 40, 0, this.a, (this.W - this.a.a) / 2, (this.X - this.a.b) / 2, 4);
            return;
        }
        if (this.A == 1) {
            graphics.setColor(0xFFFFFF);
            graphics.fillRect(0, 0, this.W, this.X);
            i.a(graphics, this.B, 40, 0, this.a, (this.W - this.a.a) / 2, (this.X - this.a.b) / 2, 4);
            return;
        }
        if (this.A == 3) {
            graphics.setColor(0);
            graphics.fillRect(0, 0, this.W, this.X);
            i.a(graphics, this.B, 40, 0, this.c, 0, 0, 1);
            graphics.setClip(0, 0, this.W, this.X);
            return;
        }
        if (this.A == 4) {
            if (this.B >= 16) {
                if (this.b != null) {
                    this.c.a(graphics, 0, 0);
                    if (this.M != -1) {
                        this.d.a(graphics, 4 + this.M, 6);
                    }
                    this.b.a(graphics, 0, 0);
                } else {
                    graphics.setColor(0);
                    graphics.fillRect(0, 0, this.W, this.X);
                    this.c.a(graphics, 0, 0);
                }
                if (this.j && this.b != null) {
                    graphics.setColor(0xFFFFFF);
                    graphics.setFont(e.b);
                    i.a(graphics, a.a(59), this.Y, this.X - this.e.q - 1, 33, 0xFFFFFF, 0);
                    return;
                }
            } else {
                if (this.b != null) {
                    this.b.a(graphics, 0, 0);
                } else {
                    graphics.setColor(0);
                    graphics.fillRect(0, 0, this.W, this.X);
                }
                graphics.setColor(0);
                graphics.fillRect(0, 0, this.W, this.X);
                this.c.a(graphics, 0, 0);
            }
        }
    }

    public static final void a(Graphics graphics, String string, int n, int n2, int n3, int n4, int n5) {
        graphics.setColor(n5);
        graphics.drawString(string, n - 1, n2 - 1, n3);
        graphics.drawString(string, n - 1, n2 + 1, n3);
        graphics.drawString(string, n + 1, n2 + 1, n3);
        graphics.drawString(string, n + 1, n2 - 1, n3);
        graphics.setColor(n4);
        graphics.drawString(string, n, n2, n3);
    }

    public final void a(Graphics graphics) {
        if (this.h == 4) {
            graphics.setColor(0xFFFFFF);
            graphics.fillRect(0, 0, this.W, this.X);
            graphics.setFont(e.b);
            graphics.setColor(0);
            graphics.drawString(a.a(58), this.W / 2, this.X / 2 - 1, 33);
            int n = this.X / 18;
            if (n < 12) {
                n = 12;
            }
            int n2 = this.X / 2 + 1;
            graphics.setColor(0xCECECE);
            d.a(graphics, 1, n2, this.W - 2, n);
            graphics.setColor(2370117);
            d.a(graphics, 2, n2 + 2, this.U * (this.W - 6) / 100, n - 4);
            return;
        }
        if (this.h == 2) {
            this.f(graphics);
            return;
        }
        if (this.h == 3) {
            this.d(graphics);
            return;
        }
        if (this.i) {
            this.c(graphics);
            return;
        }
        if (this.f) {
            if (this.B >= 16) {
                if (this.c != 11 && this.c != 10) {
                    this.c(graphics);
                    return;
                }
                graphics.setColor(0);
                graphics.fillRect(0, 0, this.W, this.X);
                return;
            }
            i.a(graphics, 0, this.B, 16, this.C, null, 0, 0, this.W, this.X);
            return;
        }
        if (this.h == 0) {
            this.e(graphics);
        } else if (this.c == 14) {
            graphics.setClip(0, 0, this.W, this.X);
            graphics.setColor(0);
            graphics.fillRect(0, 0, this.W, this.X);
        } else if (this.c == 10 && this.aG >= 1) {
            this.c(graphics);
        } else if (this.c == 11 && !this.f) {
            String string = a.a(57);
            graphics.setClip(0, 0, this.W, this.X);
            graphics.setFont(e.b);
            graphics.setColor(0);
            graphics.fillRect(0, 0, this.W, this.X);
            if (this.b == 0) {
                graphics.setColor(0xFFFFFF);
                if (this.e != null) {
                    this.e.a(graphics, this.Y, this.Z, 3);
                    e.b(graphics, string, this.Y, this.X - 2, 33);
                } else {
                    int n = this.Z - e.b.getHeight() / 2;
                    e.b(graphics, string, this.Y, n, 17);
                }
            }
        } else {
            int n;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            graphics.setClip(0, 0, this.a, this.b);
            if (this.k < this.a || this.l < this.b) {
                graphics.setColor(0);
                graphics.fillRect(0, 0, this.a, this.b);
            }
            if (this.B) {
                n7 = e.a() % 10;
                n6 = e.a() % 4;
                graphics.translate(n7, n6);
                this.b(graphics);
                graphics.translate(-n7, -n6);
            } else {
                this.b(graphics);
            }
            n6 = this.a.size();
            for (n7 = 0; n7 < n6; ++n7) {
                c c2 = (c)this.a.elementAt(n7);
                if (c2.f == 3) {
                    this.g.a(graphics, this.m + c2.n, this.n + c2.o);
                    continue;
                }
                if (c2 == this.a) continue;
                c2.a(graphics, this.m, this.n);
            }
            n6 = this.a.size();
            for (n7 = 0; n7 < n6; ++n7) {
                ((c)this.a.elementAt(n7)).b(graphics, this.m, this.n);
            }
            if (this.b != null) {
                graphics.setColor(14745682);
                n6 = 12 + this.ap / 4;
                int n8 = 24 - n6;
                n5 = this.b.size();
                for (n4 = 0; n4 < n5; ++n4) {
                    short[] sArray;
                    short[] sArray2 = (short[])this.b.elementAt(n4);
                    n3 = sArray2[0] * 24 + this.m;
                    int n9 = sArray2[1] * 24 + this.n;
                    int n10 = n3 + 12;
                    int n11 = n9 + 12;
                    boolean bl = false;
                    boolean bl2 = false;
                    if (n4 != 0) {
                        sArray = (short[])this.b.elementAt(n4 - 1);
                        if (sArray[0] == sArray2[0] + 1) {
                            graphics.fillRect(n3 + n8, n11 - this.aq, n6, this.ap);
                        } else if (sArray[0] == sArray2[0] - 1) {
                            graphics.fillRect(n3, n11 - this.aq, n6, this.ap);
                        } else if (sArray[1] == sArray2[1] + 1) {
                            graphics.fillRect(n10 - this.aq, n9 + n8, this.ap, n6);
                        } else if (sArray[1] == sArray2[1] - 1) {
                            graphics.fillRect(n10 - this.aq, n9, this.ap, n6);
                        }
                    }
                    if (n4 == n5 - 1) {
                        graphics.setClip(0, 0, this.a, this.b);
                        this.b.a(graphics, n10, n11, 3);
                        continue;
                    }
                    sArray = (short[])this.b.elementAt(n4 + 1);
                    if (sArray[0] == sArray2[0] + 1) {
                        graphics.fillRect(n3 + n8, n11 - this.aq, n6, this.ap);
                        continue;
                    }
                    if (sArray[0] == sArray2[0] - 1) {
                        graphics.fillRect(n3, n11 - this.aq, n6, this.ap);
                        continue;
                    }
                    if (sArray[1] == sArray2[1] + 1) {
                        graphics.fillRect(n10 - this.aq, n9 + n8, this.ap, n6);
                        continue;
                    }
                    if (sArray[1] != sArray2[1] - 1) continue;
                    graphics.fillRect(n10 - this.aq, n9, this.ap, n6);
                }
            }
            if (this.a != null) {
                this.a.a(graphics, this.m, this.n);
                this.a.b(graphics, this.m, this.n);
            }
            if (this.c) {
                this.a.a(graphics, this.m + 12, this.n + 12, 3);
            }
            n6 = this.c.size();
            for (n = 0; n < n6; ++n) {
                h h2 = (h)this.c.elementAt(n);
                h2.a(graphics, this.m, this.n + h2.r);
            }
            graphics.setClip(0, 0, this.W, this.X);
            n = this.X - a;
            if (this.N > 0) {
                d.a(graphics, 0, n, this.a, a, 14);
                graphics.setClip(0, 0, this.W, this.X);
            }
            n6 = a - 24 >> 1;
            int n12 = 24 + n6 * 2;
            n4 = this.W - n12;
            n += this.N;
            if (this.t) {
                this.t = false;
                d.a(graphics, 0, n, n4 + 1, a, 0, 2370117, b[this.j[this.f]], this.N, a);
                n5 = this.X - a / 2 + this.N;
                if (this.b == 1) {
                    n3 = n4 / 2;
                    this.p.a(graphics, 0, n3, n5, 6);
                    e.a(graphics, this.a(-1, -1, this.f) - this.a(10, -1, this.f) + "/" + this.g, n3 + this.p.p + 1, n5, 1, 6);
                }
                n3 = 10;
                if (this.a <= 120) {
                    n3 = 4;
                }
                this.p.a(graphics, 1, n3, n5, 6);
                n3 += this.p.p + 1;
                if (this.l[this.f] == 1) {
                    e.a(graphics, "" + this.f[this.f], n3, n5, 1, 6);
                } else {
                    e.a(graphics, "- - -", n3, n5, 1, 6);
                }
                graphics.setClip(0, 0, this.W, this.X);
            }
            if (this.u) {
                this.u = false;
                if (n6 > 0) {
                    this.a(graphics, n4, n, n12, (int)a);
                }
                n5 = n4 + n6;
                n3 = n + n6;
                this.d[this.b[this.q][this.r]].a(graphics, n5, n3);
                String string = "." + f[this.a(this.q, this.r)];
                e.a(graphics, string, n5 + 24, n3 + 24, 0, 40);
                if (n6 == 0) {
                    graphics.setColor(0);
                    graphics.drawRect(n5, n3, 24, 24);
                }
            }
            if (this.c == 6 && this.a[this.u].f != 4) {
                n5 = 0;
                if (this.r * 24 <= this.b / 2 - 24) {
                    n5 = this.b - this.e.q - this.ao + 2;
                }
                this.a(graphics, this.a, this.a[this.u], n5);
            }
        }
        if (this.a()) {
            if (this.d) {
                this.a(graphics, i, 1, this.b);
            }
            if (this.e) {
                this.a(graphics, h, 0, this.b);
            }
            if (this.h == 1 && (this.l[this.f] == 0 || this.c == 0) && this.c != 11) {
                this.a(graphics, h, 3, this.b);
            }
        }
        if (this.n || this.o) {
            i.a(graphics, 0, this.O, 16, this.n ? 0 : 1, null, 0, 0, this.W, this.X);
        }
    }

    public final void a(Graphics graphics, int n, int n2, int n3, int n4) {
        graphics.setColor(4344163);
        graphics.fillRect(n, n2, n3, n4);
        graphics.setColor(11384493);
        graphics.fillRect(n + 1, n2 + 1, n3 - 2, n4 - 2);
        graphics.setColor(4344163);
        graphics.fillRect(n + 3, n2 + 3, n3 - 6, n4 - 6);
    }

    public final void a(Graphics graphics, c c2, c c3, int n) {
        int n2 = this.ao - 2;
        graphics.setColor(11384493);
        graphics.fillRect(0, n, this.a, n2);
        graphics.setColor(0);
        graphics.fillRect(0, n2 + n, this.a, 2);
        boolean bl = false;
        int n3 = 0;
        int n4 = n2 / 2;
        int n5 = n4 + n;
        for (int j = 0; j < 3; ++j) {
            this.o.a(graphics, j, n3 + 1, n5, 6);
            int n6 = n + 1;
            int n7 = j == 0 ? (this.W <= 132 ? 56 : 61 * this.a / 176) : (j == 1 ? (this.W <= 132 ? 28 : 47 * this.a / 176) : this.a - (n3 += this.o.p + 2));
            for (int k = 0; k < 2; ++k) {
                c c4;
                c c5;
                if (k == 0) {
                    c5 = c2;
                    c4 = c3;
                } else {
                    c5 = c3;
                    c4 = c2;
                }
                int n8 = n2 / 2 - 2;
                graphics.setColor(2172994);
                graphics.fillRect(n3, n6, n7, n8);
                int n9 = n3 + 1;
                if (j == 0 || this.W > 132) {
                    graphics.setColor(b[this.j[c5.e]]);
                    graphics.fillRect(n9, n6 + 1, 3, n8 - 2);
                    n9 += 4;
                }
                int n10 = 0;
                String string = null;
                if (j == 0) {
                    if (k == 0 || c3.a(c2, (int)c2.c, (int)c2.d)) {
                        n10 = c5.a(c4);
                        string = c5.d + n10 + "-" + (c5.e + n10);
                    } else {
                        string = "0-0";
                    }
                } else if (j == 1) {
                    n10 = c5.b(c4);
                    string = "" + (c5.f + n10);
                } else {
                    string = "" + c5.a;
                }
                e.a(graphics, string, n9, n6 + 1, 0);
                if (n10 > 0) {
                    this.u.a(graphics, 1, n9 + 1 + e.a((byte)0, string), n6 + n8 / 2, 6);
                } else if (n10 < 0) {
                    this.u.a(graphics, 2, n9 + 1 + e.a((byte)0, string), n6 + n8 / 2, 6);
                }
                int n11 = n3 + n7 - 2;
                if (j == 0 && (c5.g & 2) != 0) {
                    this.j.a(graphics, 1, n11, n6 + n8 / 2, 10);
                    n11 -= this.j.p;
                }
                if ((j == 0 || j == 1) && (c5.g & 1) != 0) {
                    this.j.a(graphics, 0, n11, n6 + n8 / 2, 10);
                }
                n6 += n4;
            }
            n3 += n7;
        }
    }

    public final void a(Graphics graphics, int n, int n2, int n3) {
        int n4 = 0;
        int n5 = 0;
        if (n == 1024) {
            n5 = 36;
        } else if (n == 2048) {
            n4 = this.W;
            n5 = 40;
        }
        this.e.a(graphics, n2, n4, n3, n5);
    }

    public final c a(int n, int n2, byte by) {
        int n3 = this.a.size();
        for (int j = 0; j < n3; ++j) {
            int n4;
            int n5;
            c c2 = (c)this.a.elementAt(j);
            if (c2.f == 1) {
                n5 = c2.b;
                n4 = c2.c;
            } else {
                n5 = c2.c;
                n4 = c2.d;
            }
            if (n != n5 || n2 != n4 || !(by == 0 ? c2.f != 3 : by == 1 && c2.f == 3)) continue;
            return c2;
        }
        return null;
    }

    public final byte a(int n, int n2) {
        return this.h[this.b[n][n2]];
    }

    public final void n() {
        e.h();
        this.y = 0;
        this.N = 0;
        this.c = (byte)8;
        this.d = this.c;
    }

    public final void o() {
        int n;
        this.d[this.f][0] = (byte)this.q;
        this.d[this.f][1] = (byte)this.r;
        this.a = (short)(this.a + 1);
        this.f = (byte)((this.f + 1) % this.e);
        if (this.l[this.f] == 2) {
            this.o();
            return;
        }
        for (n = this.a.size() - 1; n >= 0; --n) {
            c c2 = (c)this.a.elementAt(n);
            if (c2.f == 3) {
                if (c2.d == 9 || (c2.h = (byte)(c2.h - 1)) > 0) continue;
                c2.a();
                continue;
            }
            c2.f = 0;
            if ((c2.g & 1) != 0 && c2.i == this.f) {
                c2.c((byte)1);
            }
            if (c2.e == this.f) {
                c2.c((byte)2);
            }
            c2.l = 0;
        }
        this.ar = 0;
        for (n = 0; n < this.b.length; ++n) {
            for (int j = 0; j < this.b[n].length; ++j) {
                if (!this.b(n, j, this.f)) continue;
                if (this.a(n, j) == 8) {
                    this.ar += 30;
                    continue;
                }
                if (this.a(n, j) != 9) continue;
                this.ar += 50;
            }
        }
        byte by = this.f;
        this.f[by] = this.f[by] + this.ar;
        for (n = 0; n < this.e.length; ++n) {
            this.j[n] = 0;
        }
        if (this.l[this.f] == 1) {
            this.e(this.d[this.f][0], this.d[this.f][1]);
        }
        this.h = true;
        this.t = true;
        if (this.l[this.f] == 0) {
            this.p();
        } else {
            c.c = c.b;
        }
        if (this.a(-1, 0, this.f) <= 0 && this.e(this.f) == 0) {
            this.o();
        }
    }

    public final boolean a(int n, int n2, c c2) {
        return c2.a((short)8) && this.a((int)c2.c, (int)c2.d) == 8 && this.b[c2.c][c2.d] < this.j;
    }

    public final boolean b(int n, int n2, c c2) {
        if (c2.a((short)8) && this.a((int)c2.c, (int)c2.d) == 8 && this.b[c2.c][c2.d] >= this.j && !this.a((int)c2.c, (int)c2.d, (int)this.k[c2.e])) {
            return true;
        }
        return c2.a((short)16) && this.a((int)c2.c, (int)c2.d) == 9 && !this.a((int)c2.c, (int)c2.d, (int)this.k[c2.e]);
    }

    public final void a(byte by, int n, int n2) {
        this.b[n][n2] = by;
    }

    public final void b(int n, int n2, int n3) {
        if (this.b[n][n2] >= this.j) {
            this.a((byte)(this.j + n3 * 2 + (this.b[n][n2] - this.j) % 2), n, n2);
        }
    }

    public final int a(int n, int n2) {
        return this.a(n, n2, this.b);
    }

    public final int a(int n, int n2, byte[][] byArray) {
        if (byArray[n][n2] >= this.j) {
            return (byArray[n][n2] - this.j) / 2;
        }
        return -1;
    }

    public final int d(int n) {
        if (n != -1 && n != 0) {
            return this.i[n];
        }
        return -1;
    }

    public final boolean a(int n, int n2, int n3) {
        int n4 = this.d(this.a(n, n2));
        if (n4 > -1) {
            return n3 == this.k[n4];
        }
        return false;
    }

    public final boolean b(int n, int n2, int n3) {
        return this.a(n, n2) == this.j[n3];
    }

    public final int e(int n) {
        int n2 = 0;
        for (int j = 0; j < this.aw; ++j) {
            if (!this.b((int)this.f[j][0], (int)this.f[j][1], n)) continue;
            ++n2;
        }
        return n2;
    }

    public final int a(int n, int n2, byte by) {
        int n3 = 0;
        int n4 = this.a.size();
        for (int j = 0; j < n4; ++j) {
            c c2 = (c)this.a.elementAt(j);
            if (n != -1 && c2.d != n || (n2 != -1 || c2.f == 3) && n2 != c2.f || by != -1 && c2.e != by) continue;
            ++n3;
        }
        return n3;
    }

    public final c[] a(int n, int n2, byte by) {
        Vector<c> vector = new Vector<c>();
        int n3 = this.a.size();
        for (int j = 0; j < n3; ++j) {
            c c2 = (c)this.a.elementAt(j);
            if (n != -1 && c2.d != n || (n2 != -1 || c2.f == 3) && n2 != c2.f || by != -1 && c2.e != by) continue;
            vector.addElement(c2);
        }
        Object[] objectArray = new c[vector.size()];
        vector.copyInto(objectArray);
        return objectArray;
    }

    public static final void a(Graphics graphics, int n, int n2, int n3, f f2, int n4, int n5, int n6) {
        int n7;
        int n8;
        if (n3 == 0) {
            n8 = f2.a;
            n7 = f2.b;
        } else {
            n8 = f2.b;
            n7 = f2.a;
        }
        int n9 = n8 / 2;
        int n10 = n7 / 1;
        int n11 = n8 * n / n2;
        int n12 = n8 * (n2 - n) / (n2 * 4);
        int n13 = 360 * n / n2;
        int n14 = 360 * n6 / n10;
        for (int j = 0; j < n10; ++j) {
            int n15 = n12 * a.a(n13) >> 10;
            if (n3 == 0) {
                graphics.setClip(n4 + n9 - n11 / 2 + n15, n5 + j * 1, n11, 1);
                f2.a(graphics, n4 + n15, n5);
            } else {
                graphics.setClip(n4 + j * 1, n5 + n9 - n11 / 2 + n15, 1, n11);
                f2.a(graphics, n4, n5 + n15);
            }
            n13 += n14;
        }
    }

    public static final void a(Graphics graphics, int n, int n2, int n3, int n4, f f2, int n5, int n6, int n7, int n8) {
        int n9 = n7 / 8 + 1;
        int n10 = n8 / 1;
        int n11 = n3 - 7;
        for (int j = 0; j < 8; ++j) {
            int n12;
            int n13;
            int n14 = n2 - j * 1;
            if (n14 < 0) {
                n14 = 0;
            }
            if (n14 >= n11) {
                boolean bl = false;
                n13 = n9;
            } else {
                n13 = n9 * n14 / n11;
            }
            if (n4 == 1) {
                n12 = j * n9 + n13;
                n13 = n9 - n13;
            } else {
                n12 = j * n9;
            }
            int n15 = 255 * n13 / n9;
            e.a(graphics, n15 << 24 | n);
            for (int k = 0; k < 1; ++k) {
                graphics.fillRect(n5 + n12, n6, n13, n10);
            }
        }
    }

    public final boolean a(byte by, int n, int n2) {
        if (this.g > this.a(-1, -1, this.f) - this.a(10, -1, this.f) && by <= this.I && c.a[by] <= this.f[this.f] && c.a[by] > 0) {
            this.a(this.c, 0);
            return c.a(this.c, n, n2, c.a[by], -1, by, this.f, true);
        }
        return false;
    }

    public final boolean a(c c2, int n, int n2) {
        if (this.g > this.a(-1, -1, this.f) - this.a(10, -1, this.f) && (c2.d <= this.I || c2.d == 9) && c2.k <= this.f[this.f]) {
            this.a(this.c, 0);
            return c.a(this.c, n, n2, c.a[c2.d], -1, c2.d, this.f, true);
        }
        return false;
    }

    public final void p() {
        c[] cArray = this.a(-1, 0, this.f);
        this.f = new Vector(cArray.length);
        for (int j = 0; j < cArray.length; ++j) {
            int n;
            for (n = 0; n < j; ++n) {
                c c2 = (c)this.f.elementAt(n);
                byte by = o[cArray[j].d];
                byte by2 = o[c2.d];
                if (by >= by2 && (by != by2 || cArray[j].g >= c2.g)) continue;
                this.f.insertElementAt(cArray[j], n);
                break;
            }
            if (n != j) continue;
            this.f.addElement(cArray[j]);
        }
        this.d = new c[this.e.length];
        this.p = new byte[this.e.length];
        c.c = c.a;
        this.au = 0;
        this.k = 0;
    }

    public final void q() throws Exception {
        if (a.a.a(h)) {
            this.a(this.b, this.d, this.b, (a)this);
            a.a.d();
            return;
        }
        if (this.x) {
            return;
        }
        if (this.k == 4) {
            if (this.j != null || this.k != null) {
                this.k = (byte)5;
                this.a.a(this.c, (int)this.a.c, (int)this.a.d);
                this.b = true;
                this.a = true;
                this.j = this.c;
                if (this.j != null) {
                    this.a.a(a[1]);
                    this.e(this.j.c, this.j.d);
                } else if (this.k != null) {
                    this.e(this.k.c, this.k.d);
                }
            } else {
                if (this.b((int)this.a.c, (int)this.a.d, this.a)) {
                    int n = this.b(this.a.c, this.a.d);
                    if (this.aA != -1 && this.aA != n) {
                        this.d[this.aA] = this.d[n];
                        this.d[n] = this.a;
                    }
                    this.b((int)this.a.c, (int)this.a.d, this.j[this.a.e]);
                    a.a.a(this.a(null, a.a(73), this.b, 1000));
                    e.b(9, 1);
                    this.c = (byte)9;
                    this.d = this.c;
                } else if (this.a((int)this.a.c, (int)this.a.d, this.a)) {
                    int n = this.b(this.a.c, this.a.d);
                    if (this.aA != -1 && this.aA != n) {
                        this.d[this.aA] = this.d[n];
                        this.d[n] = this.a;
                    }
                    this.a((byte)this.j, (int)this.a.c, (int)this.a.d);
                    a.a.a(this.a(null, a.a(74), this.b, 1000));
                    e.b(9, 1);
                    this.c = 0;
                    this.d = this.c;
                } else {
                    this.c = 0;
                }
                this.a.d();
                this.a = null;
                this.k = 0;
            }
            this.c = true;
            return;
        }
        if (this.k == 5) {
            if (this.c - this.j >= 500L) {
                if (this.j != null) {
                    this.a(this.a, this.j);
                } else if (this.k != null) {
                    this.a(this.k, this.f);
                    this.k = null;
                    this.k = (byte)7;
                    this.a.d();
                }
                this.a = false;
                this.b = false;
                return;
            }
        } else if (this.k == 7) {
            if (this.d == null) {
                this.k = 0;
                this.c = 0;
                return;
            }
        } else if (this.k == 6) {
            if (this.c - this.j >= 1000L) {
                this.j = null;
                this.k = 0;
                this.c = 0;
                return;
            }
        } else {
            if (this.k == 2) {
                return;
            }
            if (this.k == 3) {
                if (this.au == 0) {
                    if (this.a(this.a.n + 12, this.a.o + 12)) {
                        if (this.b == 0 && this.s == 7 && this.a == this.b[1]) {
                            this.i = null;
                            c[] cArray = this.a(-1, -1, (byte)0);
                            if (cArray.length > 0) {
                                this.a(cArray[e.a(cArray.length)]);
                            }
                            this.k = (byte)4;
                            return;
                        }
                        this.au = 1;
                        this.j = this.c;
                        return;
                    }
                } else if (this.au == 1) {
                    if (this.c - this.j >= 100L) {
                        this.a = true;
                        this.b = false;
                        this.au = 2;
                        this.c = 1;
                        this.j = this.c;
                        return;
                    }
                } else if (this.au == 2) {
                    if (this.c - this.j >= 200L) {
                        this.q = this.as;
                        this.r = this.at;
                        this.a.b(this.as * 24, this.at * 24);
                        this.b = this.a.a((int)this.a.c, (int)this.a.d, this.q, this.r);
                        this.au = 3;
                        this.j = this.c;
                        return;
                    }
                } else if (this.au == 3 && this.c - this.j >= 200L) {
                    this.b = null;
                    this.a.a(this.as, this.at, true);
                    this.k = (byte)2;
                    this.au = 0;
                    this.c = (byte)2;
                }
                return;
            }
            if (this.f.size() == 0) {
                int n;
                int n2;
                int n3;
                int n4;
                c c2 = null;
                int n5 = 0;
                int n6 = 6666;
                int n7 = 0;
                int n8 = 0;
                for (n4 = 0; n4 < this.e.length; ++n4) {
                    int n9;
                    n3 = this.e[n4][0];
                    n2 = this.e[n4][1];
                    if (this.a(n3, n2) != 9 || !this.b(n3, n2, this.f)) continue;
                    if (n5 == 0) {
                        n7 = n3;
                        n8 = n2;
                    }
                    ++n5;
                    int n10 = 0;
                    for (n = this.a.size() - 1; n >= 0; --n) {
                        c c3 = (c)this.a.elementAt(n);
                        if (this.k[c3.e] == this.k[this.f] || !c3.a((short)16)) continue;
                        n9 = Math.abs(c3.c - n3) + Math.abs(c3.d - n2);
                        if (n9 < n6) {
                            n6 = n9;
                            n7 = n3;
                            n8 = n2;
                        }
                        ++n10;
                    }
                    if (n10 != 0) continue;
                    for (n = 0; n < this.e.length; ++n) {
                        int n11;
                        byte by = this.e[n][0];
                        n9 = this.e[n][1];
                        if (this.a((int)by, n9) != 9 || this.b((int)by, n9, this.f) || (n11 = Math.abs(by - n3) + Math.abs(n9 - n2)) >= n6) continue;
                        n6 = n11;
                        n7 = n3;
                        n8 = n2;
                    }
                }
                if (n5 > 0) {
                    for (n4 = 0; n4 < this.e[this.f]; ++n4) {
                        if (this.a[this.f][n4] == null || this.a[this.f][n4].f != 3 || !this.a(this.a[this.f][n4], n7, n8)) continue;
                        c2 = this.a(this.a[this.f][n4], n7, n8);
                    }
                    if (c2 == null) {
                        if (this.a(0, -1, this.f) < 2 && this.a((byte)0, n7, n8)) {
                            c2 = this.a((byte)0, n7, n8);
                        } else if (this.a(1, -1, this.f) < 2 && this.a((byte)1, n7, n8)) {
                            c2 = this.a((byte)1, n7, n8);
                        } else {
                            n4 = 0;
                            n3 = 0;
                            for (n2 = 0; n2 < this.e; n2 = (byte)(n2 + 1)) {
                                if (this.k[n2] == this.k[this.f]) {
                                    n4 += this.a(-1, -1, (byte)n2);
                                    continue;
                                }
                                n3 += this.a(-1, -1, (byte)n2);
                            }
                            if (this.f[this.f] >= 1000 || this.a(-1, -1, this.f) < 8 || n4 < n3) {
                                n2 = 0;
                                byte[] byArray = new byte[12];
                                for (n = 1; n < 12; n = (int)((byte)(n + 1))) {
                                    if (this.a(n, -1, this.f) >= 1 && c.a[n] < 600 || !this.a((byte)n, n7, n8)) continue;
                                    byArray[n2] = n;
                                    ++n2;
                                }
                                if (n2 > 0) {
                                    n = byArray[Math.abs(e.a()) % n2];
                                    c2 = this.a((byte)n, n7, n8);
                                }
                            }
                        }
                    }
                }
                if (c2 != null) {
                    this.e(c2);
                    return;
                }
                this.c = null;
                this.f = null;
                this.n();
                return;
            }
            if (this.b == 0 && this.s == 7 && this.b[1].f != 2) {
                this.a = this.b[1];
                this.e(this.a.c, this.a.d);
                this.i = this.a;
                this.k = (byte)3;
                this.f.removeElement(this.a);
                return;
            }
            c c4 = this.l;
            if (c4 == null) {
                c4 = (c)this.f.elementAt(0);
            }
            this.e(c4);
            if (this.l == null) {
                this.f.removeElement(c4);
            }
        }
    }

    public final void e(c c2) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        this.a = c2;
        this.c = true;
        this.a(this.c, 0);
        this.a.b(this.c);
        this.a = false;
        this.c = this.a(0, -1, this.f);
        int n8 = 0;
        int n9 = this.b.length + this.c.length + this.e.length;
        this.a = new int[n9][5];
        this.av = 0;
        boolean bl = false;
        int n10 = 10000;
        this.ax = -1;
        this.ay = -1;
        this.az = -1;
        this.aA = -1;
        for (n7 = 0; n7 < this.c.length + this.b.length; ++n7) {
            c c3 = null;
            if (n7 >= this.c.length) {
                c3 = this.b[n7 - this.c.length];
                if (c3 != null) {
                    if (c3.f == 3) {
                        c3 = null;
                    } else if (this.k[c3.e] != this.k[this.f] && this.b[this.f] == null) {
                        int[] nArray = this.a[n8];
                        nArray[2] = nArray[2] + c3.a((int)c3.c, (int)c3.d, null) * 2;
                    } else if (this.a >= 15 && this.k[c3.e] != this.k[this.f] && this.a(-1, -1, c3.e) < 4 && this.a(-1, -1, this.f) >= 8) {
                        int[] nArray = this.a[n8];
                        nArray[2] = nArray[2] + c3.a((int)c3.c, (int)c3.d, null) * 2;
                    } else if (c3.e != this.f) {
                        c3 = null;
                    }
                }
            } else if (this.b[this.f] != null) {
                c3 = this.c[n7];
            }
            if (c3 != null) {
                this.a[n8][0] = c3.c;
                this.a[n8][1] = c3.d;
                if (c3.e == this.f) {
                    c[] cArray = c3.a(c3.c, (int)c3.d, 1, 5, (byte)0);
                    for (n6 = 0; n6 < cArray.length; ++n6) {
                        if (cArray[n6].f == 4) continue;
                        int[] nArray = this.a[n8];
                        nArray[2] = nArray[2] + cArray[n6].a((int)cArray[n6].c, (int)cArray[n6].d, c3);
                    }
                }
                if (this.a[n8][2] > 0) {
                    int[] nArray = this.a[n8];
                    nArray[4] = nArray[4] + c3.a((int)c3.c, (int)c3.d, null);
                    int[] nArray2 = this.a[n8];
                    nArray2[4] = nArray2[4] + c3.l;
                    if (this.a[n8][2] > this.av) {
                        this.av = this.a[n8][2];
                    }
                    this.a[n8][3] = Math.abs(c3.c - c2.c) + Math.abs(c3.d - c2.d);
                    if (this.a[n8][3] < 1) {
                        this.a[n8][3] = 1;
                    }
                    if (this.a[n8][3] < n10) {
                        n10 = this.a[n8][3];
                    }
                } else {
                    this.a[n8][2] = -6666;
                }
            } else {
                this.a[n8][2] = -6666;
            }
            ++n8;
        }
        n7 = 666;
        int n11 = 666;
        int n12 = -1;
        n6 = -1;
        for (n5 = 0; n5 < this.e.length; ++n5) {
            int n13;
            Object object;
            n4 = this.e[n5][0];
            n3 = this.e[n5][1];
            n2 = this.a(n4, n3);
            n = this.b(n4, n3, c2.e);
            this.a[n8][2] = -6666;
            if (n != 0 || this.d[n5] != null) {
                object = c2.a(n4, n3, 1, 5, (byte)0);
                this.a[n8][0] = n4;
                this.a[n8][1] = n3;
                this.a[n8][2] = 0;
                for (n13 = 0; n13 < ((c[])object).length; ++n13) {
                    if (object[n13].f == 4) continue;
                    if (this.d[n5] != null && n == 0) {
                        int[] nArray = this.a[n8];
                        nArray[2] = nArray[2] + object[n13].a((int)object[n13].c, (int)object[n13].d, null);
                        continue;
                    }
                    if ((n2 != 8 || !object[n13].a((short)8)) && (n2 != 9 || !object[n13].a((short)16))) continue;
                    int[] nArray = this.a[n8];
                    nArray[2] = nArray[2] + object[n13].a((int)object[n13].c, (int)object[n13].d, null);
                }
                if (this.a[n8][2] == 0) {
                    if (this.d[n5] != null && n == 0) {
                        this.a[n8][2] = 100;
                        int[] nArray = this.a[n8];
                        nArray[4] = nArray[4] + 2000;
                    } else {
                        this.a[n8][2] = -6666;
                    }
                }
                if (this.a[n8][2] != -6666) {
                    int[] nArray = this.a[n8];
                    nArray[4] = nArray[4] + this.j[n5];
                    if (this.a[n8][2] > this.av) {
                        this.av = this.a[n8][2];
                    }
                    this.a[n8][3] = Math.abs(n4 - c2.c) + Math.abs(n3 - c2.d);
                    if (this.a[n8][3] < 1) {
                        this.a[n8][3] = 1;
                    }
                    if (this.a[n8][3] < n10) {
                        n10 = this.a[n8][3];
                    }
                }
            }
            if (this.a(n4, n3, (int)this.k[c2.e])) {
                object = this.a(n4, n3, (byte)0);
                if ((object == null || object.e == c2.e) && (n13 = Math.abs(n4 - c2.c) + Math.abs(n3 - c2.d)) < n11) {
                    n6 = n5;
                    n11 = n13;
                }
            } else if ((this.d[n5] == null || this.d[n5] == c2) && (n2 == 8 && c2.a((short)8) || n2 == 9 && c2.a((short)16))) {
                int n14 = Math.abs(n4 - c2.c) + Math.abs(n3 - c2.d);
                if (n14 < n7) {
                    n12 = n5;
                    n7 = n14;
                }
                c c4 = this.a(n4, n3, (byte)0);
                if (n14 < n11 && this.c[n4][n3] > 0 && (c4 == null || c4.e == c2.e)) {
                    n6 = n5;
                    n11 = n14;
                }
            }
            ++n8;
        }
        if (c2.g < 50 && n6 != -1) {
            if (n6 == n12) {
                this.aA = n12;
            }
            this.d[n6] = c2;
            this.ax = this.e[n6][0];
            this.ay = this.e[n6][1];
            this.a(this.g, 0);
            c.a(this.g, this.ax, this.ay, 10, -1, c2.d, this.f, false);
        } else if (this.b[this.f] != null && n12 != -1 && (c2.a((short)8) || c2.a((short)16))) {
            this.aA = n12;
            this.d[n12] = c2;
            this.ax = this.e[n12][0];
            this.ay = this.e[n12][1];
            this.a(this.g, 0);
            c.a(this.g, this.ax, this.ay, 10, -1, c2.d, this.f, false);
        } else {
            n5 = -1;
            n4 = -6666;
            for (n3 = 0; n3 < n8; ++n3) {
                if (this.a[n3][2] <= -6666) continue;
                if (this.a[n3][2] > 0) {
                    this.a[n3][2] = this.a[n3][2] * n10 / this.a[n3][3];
                }
                int[] nArray = this.a[n3];
                nArray[2] = nArray[2] - this.a[n3][4];
                if (this.a[n3][2] <= n4) continue;
                n4 = this.a[n3][2];
                n5 = n3;
            }
            if (n5 != -1) {
                n3 = c2.a((int)c2.c, (int)c2.d, null);
                if (n5 < this.c.length) {
                    this.c[n5].l += n3;
                } else if (n5 < this.b.length + this.c.length) {
                    this.b[n5 - this.c.length].l += n3;
                } else {
                    int n15 = this.az = n5 - this.b.length - this.c.length;
                    this.j[n15] = this.j[n15] + n3;
                }
                this.ax = this.a[n5][0];
                this.ay = this.a[n5][1];
                this.a(this.g, 0);
                c.a(this.g, this.ax, this.ay, 10, -1, c2.d, this.f, false);
            }
        }
        n5 = -10000;
        n3 = this.c.length;
        for (n4 = 0; n4 < n3; ++n4) {
            n = this.c[n4].length;
            for (n2 = 0; n2 < n; ++n2) {
                int n16;
                c c5;
                if (this.c[n4][n2] <= 0 || (c5 = this.a(n4, n2, (byte)0)) != null && c5 != c2 && (this.l != null || c5.e != c2.e || c5.f != 0)) continue;
                if (!c2.a((short)512) || c5 == c2) {
                    c[] cArray = c2.a(n4, n2, (byte)0);
                    for (int j = 0; j < cArray.length; ++j) {
                        n16 = this.a(c2, n4, n2, cArray[j], null);
                        if (n16 <= n5) continue;
                        this.k = null;
                        this.j = cArray[j];
                        n5 = n16;
                        this.as = n4;
                        this.at = n2;
                    }
                }
                if (c2.a((short)32)) {
                    this.a = c2.a(n4, n2, (byte)1);
                    for (int j = 0; j < this.a.length; ++j) {
                        n16 = this.a(c2, n4, n2, null, this.a[j]);
                        if (n16 <= n5) continue;
                        this.j = null;
                        this.k = this.a[j];
                        n5 = n16;
                        this.as = n4;
                        this.at = n2;
                    }
                }
                if ((n16 = this.a(c2, n4, n2, null, null)) <= n5) continue;
                this.j = null;
                this.k = null;
                n5 = n16;
                this.as = n4;
                this.at = n2;
            }
        }
        if (this.aA != -1) {
            this.p[this.aA] = (byte)(10 - this.g[this.as][this.at]);
        }
        this.l = null;
        c c6 = this.a(this.as, this.at, (byte)0);
        if (c6 != null && c6 != c2) {
            this.l = c6;
            this.k = 0;
            return;
        }
        this.e(c2.c, c2.d);
        this.i = c2;
        this.k = (byte)3;
    }

    public final int a(c c2, int n, int n2, c c3, c c4) {
        c c5;
        int n3;
        int n4;
        int n5 = 0;
        if (this.aA != -1 && this.b[c2.e] != null) {
            if (this.ax != -1) {
                if (this.g[n][n2] > 0) {
                    n5 = 0 + (100 + 100 * this.g[n][n2] / 10);
                } else {
                    n4 = Math.abs(this.ax - c2.c) + Math.abs(this.ay - c2.d);
                    n3 = Math.abs(this.ax - n) + Math.abs(this.ay - n2);
                    n5 = 0 + 100 * (n4 - n3) / (c.a[c2.d] - 1);
                    if (g[this.a(n, n2)] <= 1) {
                        n5 += 20;
                    }
                }
            }
            if (c3 == null && !this.a(n, n2, (int)this.k[c2.e])) {
                if (c2.a((short)16) && this.a(n, n2) == 9) {
                    n5 += 300;
                } else if (c2.a((short)8) && (this.a(n, n2) == 8 || this.b[n][n2] == 27)) {
                    n5 += 200;
                }
            }
        }
        switch (c2.d) {
            case 3: {
                if (c4 == null) break;
                n5 += 100;
                break;
            }
            case 4: {
                c[] cArray = c2.a(n, n2, 1, 2, (byte)2);
                if (c4 == null) break;
                n5 += 25 * cArray.length;
                break;
            }
            case 2: {
                if (this.a(n, n2) != 5) break;
                n5 += 25;
            }
        }
        if (c3 != null) {
            if (c3.f == 4) {
                n4 = this.a((int)c3.c, (int)c3.d);
                n3 = this.b(c3.c, c3.d);
                if (n4 != 0 && n3 != -1 && this.d[n3] == null) {
                    n5 += c2.a(n, n2, c3) / 2;
                }
            } else {
                n5 = !c3.a(c2, n, n2) ? (n5 += c2.a(n, n2, c3) * 2) : (n5 += c2.a(n, n2, c3) * 3 / 2 - c3.a(n, n2, c2));
                if (c3.d == 9) {
                    n5 += 25;
                } else if (c3.d == 11) {
                    n5 += 100;
                }
            }
        }
        n5 += f[this.a(n, n2)];
        if (c2.g < 100 && this.a(n, n2, (int)this.k[c2.e])) {
            n5 += 100 - c2.g;
        }
        n4 = this.b(n, n2);
        if (this.g[n][n2] > 0) {
            n3 = this.g[n][n2];
            int n6 = 10 - c.a[c2.d] / 2;
            if (n3 > n6) {
                n3 = n6;
            }
            n5 += 50 + 100 * n3 / n6;
        } else if (this.ax != -1) {
            n3 = Math.abs(this.ax - c2.c) + Math.abs(this.ay - c2.d);
            int n7 = Math.abs(this.ax - n) + Math.abs(this.ay - n2);
            n5 += 50 * (n3 - n7) / (c.a[c2.d] - 1);
        }
        if (n4 != -1 && (c5 = this.d[n4]) != null && c5 != c2 && c5.f == 0 && this.p[n4] < c.a[c5.d]) {
            n5 -= 200;
        }
        return n5 += 20 * (Math.abs(n - c2.c) + Math.abs(n2 - c2.d)) / (c.a[c2.d] - 1);
    }

    public final int b(int n, int n2) {
        for (int j = 0; j < this.e.length; ++j) {
            if (this.e[j][0] != n || this.e[j][1] != n2) continue;
            return j;
        }
        return -1;
    }

    public final void c(int n) {
        this.aB = n;
        this.y = true;
    }

    public final d a(String string, byte by, byte by2) {
        d d2 = new d(7, 12);
        int n = e.b * 3;
        d2.a(string, this.W, n, by, by2);
        d2.a(0, this.X - n, 0);
        a.a.a(d2);
        return d2;
    }

    public final d a(String string, String string2, int n, int n2) {
        return this.a(string, string2, n, -1, n2);
    }

    public final d a(String string, String string2, int n, int n2, int n3) {
        d d2 = new d(10, 12);
        d2.a(string, string2, this.W, n2);
        d2.a(this.Y, n / 2, 3);
        d2.a = this;
        d2.v = n3;
        return d2;
    }

    public final void r() throws Exception {
        this.q = null;
        if (this.b == 0) {
            this.N = a;
            this.m = true;
            this.l = false;
            this.G = this.a(null, this.b, this.X, 2000);
            this.G.a(this.Y, this.Z, 3);
            this.p = true;
            this.o = true;
            this.O = 0;
        }
        if (this.s == 0) {
            this.I = 0;
            this.f[0] = 0;
            this.f[1] = 0;
            c.c = (byte)4;
            this.V = 2;
            this.c(this.b[0].c, this.b[0].d);
            this.e(this.b[0].c, this.b[0].d);
            this.a(2, 3, 3);
            e.a(1, 1);
            this.p = false;
            this.c = false;
            this.aC = 0;
            return;
        }
        if (this.s == 1) {
            this.I = 1;
            this.f[0] = 300;
            this.f[1] = 50;
            c.c = (byte)4;
            this.V = 2;
            this.b[0].b(2);
            this.c(this.b[0].c, this.b[0].d);
            this.e(this.b[0].c, this.b[0].d);
            this.a(7, 12, (byte)0).a(7, 10, false);
            this.a(8, 11, (byte)0).a(8, 9, false);
            this.a(9, 12, (byte)0).a(9, 10, false);
            this.f(7, 3);
            a.a.a(this.G);
            return;
        }
        if (this.s == 2) {
            this.I = 0;
            this.f[0] = 0;
            this.f[1] = 0;
            c.c = (byte)4;
            this.f[0] = 0;
            this.c(this.b[0].c, this.b[0].d);
            this.e(this.b[0].c, this.b[0].d);
            this.m = this.a(8, 17, (byte)0);
            this.n = this.a(8, 18, (byte)0);
            this.o = this.a(8, 19, (byte)0);
            this.m.a(8, 15, false);
            this.n.a(8, 15, false);
            this.o.a(8, 15, false);
            this.b[0].a(8, 14, false);
            this.c = false;
            a.a.a(this.G);
            this.aC = 0;
            return;
        }
        if (this.s == 3) {
            this.I = 7;
            c.c = (byte)4;
            this.f[0] = 400;
            this.f[1] = 400;
            this.m = c.a((byte)0, (byte)0, -1, 5);
            this.n = c.a((byte)2, (byte)0, -2, 5);
            this.o = c.a((byte)3, (byte)0, -3, 5);
            this.m.a(3, 4, false);
            this.n.a(4, 4, false);
            this.o.a(2, 4, false);
            this.b[0].a(3, 3, false);
            this.c(this.b[0].c, this.b[0].d);
            this.e(3, 3);
            this.i = this.b[0];
            this.a(3, 3, 3);
            e.a(1, 1);
            this.p = false;
            this.c = false;
            this.aC = 0;
            return;
        }
        if (this.s == 4) {
            this.I = 0;
            this.f[0] = 0;
            this.f[1] = 0;
            this.b(this.b[0].n + 12, this.b[0].o + 12);
            this.e(this.b[0].c, this.b[0].d);
            c.c = (byte)4;
            c c2 = this.a(11, 2, (byte)0);
            c2.a(11, -3);
            c2.a(11, 2, false);
            c2 = this.a(10, 1, (byte)0);
            c2.a(10, -5);
            c2.a(10, 1, false);
            c2 = this.a(11, 1, (byte)0);
            c2.a(11, -5);
            c2.a(11, 1, false);
            c2 = this.a(12, 1, (byte)0);
            c2.a(12, -5);
            c2.a(12, 1, false);
            c2 = this.a(11, 0, (byte)0);
            c2.a(11, -7);
            c2.a(11, 0, false);
            c2 = this.a(12, 0, (byte)0);
            c2.a(12, -7);
            c2.a(12, 0, false);
            a.a.a(this.G);
            this.c = false;
            this.aC = 0;
            return;
        }
        if (this.s == 5) {
            this.I = 7;
            this.f[0] = 600;
            this.f[1] = 600;
            this.b[0].b(2);
            this.c(5, 0);
            this.e(5, 0);
            this.V = 4;
            this.f(this.b[0].c, this.b[0].d);
            a.a.a(this.G);
            this.c = false;
            this.aC = 0;
            return;
        }
        if (this.s == 6) {
            this.I = 8;
            c.c = (byte)4;
            this.f[0] = 400;
            this.f[1] = 600;
            c c3 = c.a((byte)0, (byte)0, 13, -1);
            c c4 = c.a((byte)1, (byte)0, 13, -1);
            c c5 = c.a((byte)3, (byte)0, 13, -1);
            c c6 = c.a((byte)11, (byte)0, 13, -1);
            this.b[0].a = c3;
            c3.a = c4;
            c4.a = c5;
            c5.a = c6;
            this.b[0].b(this.c);
            this.b[0].a(14, 3, true);
            this.c(this.b[0].c, this.b[0].d);
            this.e(this.b[0].c, this.b[0].d);
            this.i = this.b[0];
            a.a.a(this.G);
            this.c = false;
            this.aC = 0;
            return;
        }
        if (this.s == 7) {
            c c7;
            this.I = 8;
            c.c = (byte)4;
            this.f[0] = 800;
            this.f[1] = 200;
            c c8 = this.a(7, 4, (byte)0);
            c8.b(3);
            this.b[1] = c8;
            this.b[0] = c7 = this.a(8, 15, (byte)0);
            c7.b(0);
            c c9 = this.a(6, 15, (byte)0);
            c9.b(2);
            this.b(this.b[0].n + 12, this.b[0].o + 12);
            this.e(this.b[0].c, this.b[0].d);
            this.a(4, 3, 3);
            e.a(1, 1);
            this.p = false;
            this.c = false;
            this.aC = 0;
        }
    }

    public final void s() throws Exception {
        int n;
        if (this.aB > 0 && --this.aB > 0) {
            return;
        }
        if (this.z) {
            if (this.aC == 0) {
                this.f = true;
                this.B = 0;
                this.c = (byte)11;
                this.aC = 1;
            }
            return;
        }
        if (this.b == 1) {
            if (this.aC == 100) {
                e.a(c[this.j[this.f]], 0);
                this.e.a((byte)0, true);
                this.e.a((a)null);
                a.a.a(this.e);
                ++this.aC;
                return;
            }
            if (this.aC == 101) {
                byte by = -1;
                int n2 = -1;
                boolean bl = true;
                for (int j = 0; j < this.e; ++j) {
                    if (this.l[j] == 2 || (this.b[j] == null || this.b[j].f == 3) && this.e(j) == 0) continue;
                    n2 = j;
                    if (by != -1 && by != this.k[j]) {
                        bl = false;
                        break;
                    }
                    by = this.k[j];
                }
                if (bl) {
                    this.l = false;
                    this.c = false;
                    String string = a.a(38, "" + (this.k[n2] + 1));
                    String string2 = a.a(81, string) + "\n(";
                    for (int j = 0; j < this.e; ++j) {
                        if (this.l[j] == 2 || this.k[j] != this.k[n2]) continue;
                        string2 = string2 + " " + a.a(88 + this.j[j]) + " ";
                    }
                    string2 = string2 + ")";
                    d d2 = this.a(null, string2, this.b, this.d, -1);
                    d2.a(this);
                    a.a.a(d2);
                    if (this.l[n2] == 1) {
                        e.a(6, 1);
                    } else {
                        e.a(7, 1);
                    }
                    this.c(15);
                    ++this.aC;
                    return;
                }
            } else if (this.aC == 102) {
                this.f = true;
                this.B = 0;
                this.c = (byte)11;
                ++this.aC;
            }
            return;
        }
        if (this.h != 1 || this.b != 0 || this.aC == -1) {
            return;
        }
        if (this.aE != -1) {
            if (this.b(this.aE, this.aF)) {
                this.aE = -1;
                this.aF = -1;
            } else {
                return;
            }
        }
        if (this.c != 11) {
            boolean bl = true;
            for (n = 0; n < this.e[0]; ++n) {
                if (this.a[0][n].f == 3) continue;
                bl = false;
                break;
            }
            if (bl && this.e(0) == 0) {
                this.v();
                return;
            }
        }
        if (this.s == 0) {
            switch (this.aC) {
                case 0: {
                    ++this.aC;
                    break;
                }
                case 1: {
                    a.a.a(this.G);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 2: {
                    this.p = true;
                    this.a(0, 8, (byte)0).a(3, 8, false);
                    this.a(1, 9, (byte)0).a(4, 9, false);
                    this.a(0, 10, (byte)0).a(3, 10, false);
                    this.f(5, 9);
                    break;
                }
                case 3: {
                    this.f(9, 3);
                    this.c = true;
                    break;
                }
                case 4: {
                    this.c(10);
                    this.V = 12;
                    c.c = c.b;
                    ++this.aC;
                    break;
                }
                case 5: {
                    this.a(a.a(221), (byte)2, (byte)4);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 6: {
                    c c2 = this.a(9, 3, (byte)0);
                    c2.a(400);
                    this.a(this.i, c2.n, c2.o, 0, 0, 2, 50);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 7: {
                    this.a(a.a(222), (byte)2, (byte)4);
                    ++this.aC;
                    break;
                }
                case 8: {
                    c c3 = this.a(9, 3, (byte)0);
                    this.a(this.h, c3.n, c3.o, 0, 0, 1, 50);
                    this.a(this.g, c3.n, c3.o, 0, -3, 1, 100);
                    c3.a();
                    this.c(20);
                    ++this.aC;
                    break;
                }
                case 9: {
                    this.c = false;
                    this.f(this.b[0].c, this.b[0].d);
                    break;
                }
                case 10: {
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 11: {
                    this.a(a.a(223), (byte)0, (byte)4);
                    this.c(5);
                    ++this.aC;
                    break;
                }
                case 12: {
                    this.a(a.a(224), (byte)5, (byte)4);
                    ++this.aC;
                    break;
                }
                case 13: {
                    this.t();
                    ++this.aC;
                    break;
                }
                case 14: {
                    if (this.N != 0) break;
                    this.H = 0;
                    ++this.aC;
                    break;
                }
                case 15: {
                    if (this.f != 0 || this.c != 1 || this.ae != 0) break;
                    this.H = 1;
                    ++this.aC;
                    break;
                }
                case 16: {
                    if (this.f != 0 || this.r == null) break;
                    this.H = 2;
                    ++this.aC;
                    break;
                }
                case 17: {
                    if (this.f != 0 || this.r == null) break;
                    this.H = 3;
                    ++this.aC;
                    break;
                }
                case 18: {
                    if (this.a(-1, 2, (byte)0) >= 3) {
                        this.H = 4;
                        ++this.aC;
                        break;
                    }
                    if (this.a < 1) break;
                    ++this.aC;
                    break;
                }
                case 19: {
                    if (this.a < 2) break;
                    this.H = 5;
                    ++this.aC;
                    break;
                }
                case 20: {
                    this.H = 6;
                    ++this.aC;
                    break;
                }
                case 21: {
                    if (this.c != 1 || this.f != 0) break;
                    this.H = 7;
                    ++this.aC;
                    break;
                }
                case 22: {
                    if (this.a(-1, -1, (byte)1) != 0) break;
                    this.l = false;
                    this.c(20);
                    ++this.aC;
                    break;
                }
                case 23: {
                    this.f(1, 1);
                    break;
                }
                case 24: {
                    c c4 = c.a((byte)1, (byte)1, 1, 1);
                    c4.a(1, 2, false, true);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 25: {
                    this.f(10, 10);
                    break;
                }
                case 26: {
                    c c5 = c.a((byte)0, (byte)1, 10, 10);
                    c5.a(10, 9, false, true);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 27: {
                    this.f(this.b[0].c, this.b[0].d);
                    break;
                }
                case 28: {
                    this.a(a.a(225), (byte)5, (byte)4);
                    this.c(5);
                    ++this.aC;
                    break;
                }
                case 29: {
                    this.a(a.a(226), (byte)0, (byte)4);
                    this.l = true;
                    ++this.aC;
                    break;
                }
                case 30: {
                    if (this.a(-1, -1, (byte)1) != 0 || this.c != 0) break;
                    this.l = false;
                    this.c = false;
                    this.c(30);
                    ++this.aC;
                    break;
                }
                case 31: {
                    this.n = true;
                    this.O = 0;
                    this.c(20);
                    ++this.aC;
                    break;
                }
                case 32: {
                    this.a(a.a(227), (byte)2, (byte)4);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 33: {
                    this.a(a.a(228), (byte)0, (byte)4);
                    this.c(5);
                    ++this.aC;
                    break;
                }
                case 34: {
                    this.a(a.a(229), (byte)2, (byte)4);
                    this.c(5);
                    ++this.aC;
                    break;
                }
                case 35: {
                    this.a(a.a(230), (byte)0, (byte)4);
                    this.c(15);
                    ++this.aC;
                    break;
                }
                case 36: {
                    this.u();
                }
            }
        } else if (this.s == 1) {
            switch (this.aC) {
                case 1: {
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 2: {
                    this.V = 4;
                    this.f(12, 3);
                    break;
                }
                case 3: {
                    this.a(a.a(231), (byte)1, (byte)4);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 4: {
                    this.a(a.a(232), (byte)3, (byte)4);
                    this.f(this.b[0].c, this.b[0].d);
                    break;
                }
                case 5: {
                    this.a(a.a(233), (byte)5, (byte)4);
                    this.f(7, 3);
                    break;
                }
                case 6: {
                    c.c = (byte)2;
                    this.m = c.a((byte)0, (byte)1, 7, 3);
                    this.n = c.a((byte)11, (byte)1, 7, 3);
                    this.o = c.a((byte)0, (byte)1, 7, 3);
                    this.m.a = this.n;
                    this.n.a = this.o;
                    this.m.a(6, -2, false);
                    this.c(30);
                    ++this.aC;
                    break;
                }
                case 7: {
                    if (this.o.c != 6 || this.o.d != 1) break;
                    c.c = (byte)4;
                    this.p = c.a((byte)0, (byte)0, 7, 3);
                    this.p.a(6, 2, false);
                    this.n.a = null;
                    this.a(a.a(234), (byte)2, (byte)4);
                    ++this.aC;
                    break;
                }
                case 8: {
                    if (this.p.f == 1) break;
                    this.p.a(400);
                    this.a(this.i, this.p.n, this.p.o, 0, 0, 2, 50);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 9: {
                    this.a(a.a(235), (byte)2, (byte)4);
                    this.c(5);
                    ++this.aC;
                    break;
                }
                case 10: {
                    this.a(this.g, this.p.n, this.p.o, 0, -3, 1, 100);
                    this.a(this.h, this.p.n, this.p.o, 0, 0, 1, 50);
                    this.p.a();
                    this.p = null;
                    this.c(15);
                    ++this.aC;
                    break;
                }
                case 11: {
                    c.c = c.b;
                    this.m.a();
                    this.n.a();
                    this.m = null;
                    this.n = null;
                    this.o = null;
                    this.V = 12;
                    this.f(this.b[0].c, this.b[0].d);
                    break;
                }
                case 12: {
                    this.a(a.a(236), (byte)5, (byte)4);
                    ++this.aC;
                    break;
                }
                case 13: {
                    this.a(a.a(237), (byte)1, (byte)4);
                    ++this.aC;
                    break;
                }
                case 14: {
                    this.f(3, 5);
                    break;
                }
                case 15: {
                    this.a(a.a(238), (byte)5, (byte)4);
                    ++this.aC;
                    break;
                }
                case 16: {
                    this.f(this.b[0].c, this.b[0].d);
                    break;
                }
                case 17: {
                    this.H = 8;
                    ++this.aC;
                    break;
                }
                case 18: {
                    this.H = 9;
                    ++this.aC;
                    break;
                }
                case 19: {
                    this.t();
                    ++this.aC;
                    break;
                }
                case 20: {
                    if (this.c != 9 || this.f != 0) break;
                    this.H = 10;
                    ++this.aC;
                    break;
                }
                case 21: {
                    this.H = 11;
                    ++this.aC;
                    break;
                }
                case 22: {
                    if (this.b[0].f != 3 && this.b[1].f != 3) break;
                    this.H = 12;
                    ++this.aC;
                    break;
                }
                case 23: {
                    if (this.a(-1, -1, (byte)1) != 0 || this.e(1) != 0) break;
                    this.l = false;
                    this.c(20);
                    ++this.aC;
                    break;
                }
                case 24: {
                    this.f(this.b[0].c, this.b[0].d);
                    break;
                }
                case 25: {
                    this.a(a.a(239), (byte)1, (byte)4);
                    ++this.aC;
                    break;
                }
                case 26: {
                    this.a(a.a(240), (byte)5, (byte)4);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 27: {
                    this.u();
                }
            }
        } else if (this.s == 2) {
            block68 : switch (this.aC) {
                case 0: {
                    if (this.m.f == 1) break;
                    this.m.a(7, 14, false);
                    ++this.aC;
                    break;
                }
                case 1: {
                    if (this.n.f == 1) break;
                    this.n.a(7, 15, false);
                    this.c(20);
                    ++this.aC;
                    break;
                }
                case 2: {
                    c.c = c.b;
                    this.m = null;
                    this.n = null;
                    this.o = null;
                    this.a(a.a(241), (byte)5, (byte)4);
                    this.c(5);
                    ++this.aC;
                    break;
                }
                case 3: {
                    this.a(a.a(242), (byte)0, (byte)4);
                    this.c(5);
                    ++this.aC;
                    break;
                }
                case 4: {
                    this.a(a.a(243), (byte)5, (byte)4);
                    this.c(5);
                    ++this.aC;
                    break;
                }
                case 5: {
                    this.H = 14;
                    ++this.aC;
                    break;
                }
                case 6: {
                    this.t();
                    ++this.aC;
                    break;
                }
                case 7: 
                case 8: {
                    if (this.aC == 7 && this.f == 0 && this.N == 0 && this.a(-1, 3, (byte)-1) >= 1) {
                        this.H = 15;
                        ++this.aC;
                    }
                    c[] cArray = this.a(-1, 2, (byte)0);
                    for (n = 0; n < cArray.length; ++n) {
                        if (cArray[n].c > 4 && cArray[n].d > 10) continue;
                        this.c(10);
                        this.l = false;
                        this.c = false;
                        this.aC = 9;
                        break block68;
                    }
                    break;
                }
                case 9: {
                    this.f(0, 8);
                    c.a((byte)5, (byte)1, -1, 8).a(0, 8, false);
                    c.a((byte)5, (byte)1, -2, 7).a(1, 7, false);
                    this.c(20);
                    break;
                }
                case 10: {
                    this.f(8, 6);
                    c.a((byte)5, (byte)1, 12, 6).a(8, 6, false);
                    this.c(20);
                    break;
                }
                case 11: {
                    this.f(2, 1);
                    c.a((byte)5, (byte)1, 1, -2).a(1, 2, false);
                    c.a((byte)5, (byte)1, 3, -2).a(3, 2, false);
                    c.a((byte)4, (byte)1, 2, -1).a(2, 1, false);
                    this.c(20);
                    break;
                }
                case 12: {
                    this.a(a.a(244), (byte)5, (byte)4);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 13: {
                    this.f(4, 8);
                    this.c(15);
                    break;
                }
                case 14: {
                    c c6 = c.a((byte)2, (byte)1, 3, 8);
                    c c7 = c.a((byte)2, (byte)1, 4, 7);
                    c c8 = c.a((byte)2, (byte)1, 5, 8);
                    this.a(this.h, c6.n, c6.o, 0, 0, 1, 50);
                    this.a(this.h, c7.n, c7.o, 0, 0, 1, 50);
                    this.a(this.h, c8.n, c8.o, 0, 0, 1, 50);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 15: {
                    this.a(a.a(245), (byte)5, (byte)4);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 16: {
                    this.a(a.a(246), (byte)-1, (byte)4);
                    this.c(5);
                    ++this.aC;
                    break;
                }
                case 17: {
                    this.a(a.a(247), (byte)0, (byte)4);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 18: {
                    a.a.a(this.a(null, a.a(248), this.b, 1500));
                    ++this.aC;
                    break;
                }
                case 19: {
                    this.a(3, 8, (byte)0).a();
                    this.a(4, 7, (byte)0).a();
                    this.a(5, 8, (byte)0).a();
                    c c9 = c.a((byte)2, (byte)0, 3, 8);
                    c c10 = c.a((byte)2, (byte)0, 4, 7);
                    c c11 = c.a((byte)2, (byte)0, 5, 8);
                    this.a(this.h, c9.n, c9.o, 0, 0, 1, 50);
                    this.a(this.h, c10.n, c10.o, 0, 0, 1, 50);
                    this.a(this.h, c11.n, c11.o, 0, 0, 1, 50);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 20: {
                    this.l = true;
                    this.c = true;
                    this.H = 13;
                    ++this.aC;
                    break;
                }
                case 21: {
                    if (this.a(-1, -1, (byte)1) != 0) break;
                    this.l = false;
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 22: {
                    this.u();
                }
            }
        } else if (this.s == 3) {
            switch (this.aC) {
                case 0: {
                    a.a.a(this.G);
                    this.p = true;
                    ++this.aC;
                    break;
                }
                case 1: {
                    if (this.b[0].f == 1) break;
                    this.i = null;
                    this.c(20);
                    ++this.aC;
                    break;
                }
                case 2: {
                    this.n = true;
                    this.p = true;
                    this.O = 0;
                    this.c(20);
                    ++this.aC;
                    break;
                }
                case 3: {
                    this.a(a.a(249), (byte)2, (byte)4);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 4: {
                    this.a(a.a(250), (byte)0, (byte)4);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 5: {
                    this.a(a.a(251), (byte)5, (byte)4);
                    this.e(13, 3);
                    this.b(312, 72);
                    this.b[0].a(7, 1);
                    this.m.a(5, 4);
                    this.n.a(7, 5);
                    this.o.a(3, 3);
                    this.m = null;
                    this.n = null;
                    this.o = null;
                    this.V = 2;
                    this.c(5);
                    ++this.aC;
                    break;
                }
                case 6: {
                    this.n = false;
                    this.o = true;
                    this.O = 0;
                    this.c(5);
                    ++this.aC;
                    break;
                }
                case 7: {
                    this.f(13, 10);
                    break;
                }
                case 8: {
                    c.c = (byte)2;
                    this.V = 4;
                    this.m = this.a(10, 10, (byte)0);
                    this.m.a(6, 10, false);
                    this.e(6, 10);
                    this.f(6, 10);
                    break;
                }
                case 9: {
                    if (this.m.f == 1) break;
                    this.m = null;
                    this.c = true;
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 10: {
                    this.e(4, 9);
                    this.f(4, 9);
                    this.a(this.i, 96, 216, 0, 0, 1, 50);
                    this.c(15);
                    break;
                }
                case 11: {
                    this.c = c.a((byte)0, (byte)0, 4, 9, false);
                    this.c.d = (byte)-1;
                    this.c.f = (byte)4;
                    this.z = 6;
                    this.c(20);
                    ++this.aC;
                    break;
                }
                case 12: {
                    this.a(a.a(252), (byte)5, (byte)4);
                    this.f(7, 1);
                    break;
                }
                case 13: {
                    this.a(a.a(253), (byte)0, (byte)4);
                    this.c(5);
                    ++this.aC;
                    break;
                }
                case 14: {
                    this.H = 17;
                    ++this.aC;
                    break;
                }
                case 15: {
                    this.t();
                    ++this.aC;
                    break;
                }
                case 16: {
                    if (this.a(-1, -1, (byte)1) != 0 || this.e(1) != 0) break;
                    this.c(15);
                    this.l = false;
                    ++this.aC;
                    break;
                }
                case 17: {
                    this.a(a.a(254), (byte)5, (byte)4);
                    this.c(5);
                    ++this.aC;
                    break;
                }
                case 18: {
                    this.a(a.a(255), (byte)0, (byte)4);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 19: {
                    this.u();
                }
            }
        } else if (this.s == 4) {
            if (this.q == null) {
                this.q = this.a(11, -1, (byte)0)[0];
            }
            if (this.aC == 25 && this.q.c >= 15 && this.q.d >= 11 && this.q.f == 2) {
                this.c(10);
                this.l = false;
                this.c = false;
                this.aC = 26;
                return;
            }
            if (this.q.f == 3) {
                this.q = null;
                this.v();
                return;
            }
            block114 : switch (this.aC) {
                case 0: {
                    this.c(50);
                    ++this.aC;
                    break;
                }
                case 1: {
                    this.a(a.a(256), (byte)5, (byte)4);
                    this.c(5);
                    ++this.aC;
                    break;
                }
                case 2: {
                    this.a(a.a(257), (byte)0, (byte)4);
                    this.c(5);
                    ++this.aC;
                    break;
                }
                case 3: {
                    this.t();
                    ++this.aC;
                    break;
                }
                case 4: {
                    c[] cArray = this.a(-1, -1, (byte)0);
                    for (n = 0; n < cArray.length; ++n) {
                        if (cArray[n].f != 2 || cArray[n].c > 8) continue;
                        this.l = false;
                        this.c(5);
                        ++this.aC;
                        break block114;
                    }
                    break;
                }
                case 5: {
                    this.c = false;
                    this.f(4, 4);
                    break;
                }
                case 6: {
                    c.a((byte)10, (byte)1, 4, 4).a(4, 1, false, true);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 7: {
                    c.a((byte)1, (byte)1, 4, 4).a(5, 2, false, true);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 8: {
                    c.a((byte)10, (byte)1, 4, 4).a(4, 3, false, true);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 9: {
                    this.a(a.a(258), (byte)5, (byte)4);
                    this.f(this.b[0].c, this.b[0].d);
                    break;
                }
                case 10: {
                    this.l = true;
                    this.c = true;
                    ++this.aC;
                    break;
                }
                case 11: {
                    c[] cArray = this.a(-1, -1, (byte)0);
                    for (n = 0; n < cArray.length; ++n) {
                        if (cArray[n].f != 2 || cArray[n].d < 7) continue;
                        this.l = false;
                        this.c = false;
                        this.f(6, 10);
                        break block114;
                    }
                    break;
                }
                case 12: {
                    c.a((byte)1, (byte)1, 6, 10).a(5, 10, false, true);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 13: {
                    c.a((byte)5, (byte)1, 6, 10).a(7, 8, false, true);
                    this.c(15);
                    ++this.aC;
                    break;
                }
                case 14: {
                    c.a((byte)5, (byte)1, 6, 10).a(7, 9, false, true);
                    this.l = true;
                    this.c = true;
                    ++this.aC;
                    break;
                }
                case 15: {
                    c[] cArray = this.a(-1, -1, (byte)0);
                    for (n = 0; n < cArray.length; ++n) {
                        if (cArray[n].f != 2 || cArray[n].c < 8 || cArray[n].d < 6) continue;
                        this.l = false;
                        this.c = false;
                        this.f(12, 5);
                        break block114;
                    }
                    break;
                }
                case 16: {
                    c.a((byte)5, (byte)1, 12, 5).a(12, 7, false, true);
                    this.c(15);
                    ++this.aC;
                    break;
                }
                case 17: {
                    c.a((byte)6, (byte)1, 12, 5).a(12, 6, false, true);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 18: {
                    c.a((byte)5, (byte)1, 12, 5).a(12, 5, false, true);
                    this.l = true;
                    this.c = true;
                    ++this.aC;
                    break;
                }
                case 19: {
                    c[] cArray = this.a(-1, -1, (byte)0);
                    for (n = 0; n < cArray.length; ++n) {
                        if (cArray[n].f != 2 || cArray[n].c < 15 || cArray[n].d < 8) continue;
                        this.l = false;
                        this.c = false;
                        this.f(18, 8);
                        break block114;
                    }
                    break;
                }
                case 20: {
                    c.a((byte)5, (byte)1, 18, 8).a(16, 10, false, true);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 21: {
                    c.a((byte)6, (byte)1, 18, 8).a(17, 10, false, true);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 22: {
                    c.a((byte)5, (byte)1, 18, 8).a(18, 10, false, true);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 23: {
                    c.a((byte)1, (byte)1, 18, 8).a(18, 9, false, true);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 24: {
                    this.a(a.a(259), (byte)0, (byte)4);
                    this.l = true;
                    this.c = true;
                    ++this.aC;
                    break;
                }
                case 25: {
                    if (this.a(-1, -1, (byte)1) != 0) break;
                    this.l = false;
                    this.c = false;
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 26: {
                    this.u();
                    ++this.aC;
                }
            }
        } else if (this.s == 5) {
            switch (this.aC) {
                case 0: {
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 1: {
                    this.a(a.a(260), (byte)1, (byte)4);
                    ++this.aC;
                    break;
                }
                case 2: {
                    this.t();
                    ++this.aC;
                    break;
                }
                case 3: {
                    if (this.a(-1, -1, (byte)1) != 0 || this.e(1) != 0) break;
                    this.l = false;
                    this.c = false;
                    this.c(15);
                    ++this.aC;
                    break;
                }
                case 4: {
                    this.f(this.b[0].c, this.b[0].d);
                    break;
                }
                case 5: {
                    this.a(a.a(261), (byte)0, (byte)4);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 6: {
                    this.u();
                }
            }
        } else if (this.s == 6) {
            if (this.aC <= 10) {
                if (this.q == null) {
                    this.q = this.a(11, -1, (byte)0)[0];
                }
                if (this.q.f == 3) {
                    this.q = null;
                    this.v();
                    return;
                }
            }
            switch (this.aC) {
                case 0: {
                    if (this.b[0].f == 1) break;
                    this.i = null;
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 1: {
                    this.a(a.a(262), (byte)5, (byte)4);
                    this.c(5);
                    ++this.aC;
                    break;
                }
                case 2: {
                    this.a(a.a(263), (byte)0, (byte)4);
                    this.c(5);
                    ++this.aC;
                    break;
                }
                case 3: {
                    c[] cArray = this.a(-1, -1, (byte)0);
                    for (n = 0; n < cArray.length; ++n) {
                        cArray[n].a = null;
                    }
                    this.t();
                    ++this.aC;
                    break;
                }
                case 4: {
                    if (this.a < 2) break;
                    this.c(15);
                    this.l = false;
                    this.c = false;
                    this.f(11, 7);
                    break;
                }
                case 5: {
                    c c12 = c.a((byte)5, (byte)1, 11, 8);
                    c12.b(this.c);
                    c12.a(14, 7, true);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 6: {
                    c c13 = c.a((byte)0, (byte)1, 11, 8);
                    c13.b(this.c);
                    c13.a(13, 7, true);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 7: {
                    c c14 = c.a((byte)3, (byte)1, 11, 8);
                    c14.b(this.c);
                    c14.a(12, 7, true);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 8: {
                    c c15 = c.a((byte)1, (byte)1, 11, 8);
                    c15.a(13, 8, false);
                    this.c(20);
                    ++this.aC;
                    break;
                }
                case 9: {
                    this.a(a.a(264), (byte)5, (byte)4);
                    this.l = true;
                    this.c = true;
                    this.f(this.b[0].c, this.b[0].d);
                    break;
                }
                case 10: {
                    boolean bl = false;
                    c[] cArray = this.a(-1, 2, (byte)0);
                    for (int j = 0; j < cArray.length; ++j) {
                        if (cArray[j].c > 9 && cArray[j].d < 10) continue;
                        bl = true;
                        break;
                    }
                    if (!bl && this.a(-1, -1, (byte)1) != 0) break;
                    this.c = false;
                    this.l = false;
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 11: {
                    this.m = this.a(11, -1, (byte)0)[0];
                    this.n = c.a((byte)8, (byte)1, this.o, this.m.d);
                    this.f(this.o - 1, this.m.d);
                    this.c = false;
                    break;
                }
                case 12: {
                    this.n.a((int)this.m.c, (int)this.m.d, false);
                    this.c(5);
                    ++this.aC;
                    break;
                }
                case 13: {
                    this.a(a.a(265), (byte)5, (byte)4);
                    this.i = this.n;
                    ++this.aC;
                    break;
                }
                case 14: {
                    if (this.n.f == 1) break;
                    this.a(a.a(266), (byte)0, (byte)4);
                    this.n.a(-1, (int)this.n.d, false);
                    this.c(3);
                    ++this.aC;
                    break;
                }
                case 15: {
                    this.m.a(-1, (int)this.n.d, false);
                    ++this.aC;
                    break;
                }
                case 16: {
                    if (this.n.f == 1) break;
                    this.c(10);
                    this.m.a();
                    this.n.a();
                    this.e(0, this.n.d);
                    this.m = null;
                    this.n = null;
                    this.i = null;
                    ++this.aC;
                    break;
                }
                case 17: {
                    this.f(1, 9);
                    break;
                }
                case 18: {
                    this.b[1] = c.a((byte)9, (byte)1, -2, 8);
                    this.b[1].a(0, 8, false);
                    c.a((byte)0, (byte)1, -1, 8).a(3, 8, false);
                    c.a((byte)0, (byte)1, -1, 10).a(1, 10, false);
                    c.a((byte)8, (byte)1, -3, 7).a(4, 8, false);
                    c.a((byte)8, (byte)1, -3, 11).a(2, 10, false);
                    c.a((byte)4, (byte)1, -2, 9).a(2, 9, false);
                    c.a((byte)6, (byte)1, -4, 9).a(4, 9, false);
                    c.a((byte)6, (byte)1, -6, 9).a(5, 10, false);
                    this.c(50);
                    ++this.aC;
                    break;
                }
                case 19: {
                    this.a(a.a(267), (byte)3, (byte)4);
                    ++this.aC;
                    break;
                }
                case 20: {
                    this.f(13, 14);
                    break;
                }
                case 21: {
                    c.a((byte)0, (byte)1, 13, 14).a(12, 14, false);
                    this.c(5);
                    ++this.aC;
                    break;
                }
                case 22: {
                    c.a((byte)6, (byte)1, 13, 14).a(14, 14, false);
                    this.c(5);
                    ++this.aC;
                    break;
                }
                case 23: {
                    c.a((byte)2, (byte)1, 13, 14).a(13, 12, false);
                    this.c(5);
                    ++this.aC;
                    break;
                }
                case 24: {
                    c.a((byte)3, (byte)1, 13, 14).a(13, 15, false);
                    this.c(15);
                    ++this.aC;
                    break;
                }
                case 25: {
                    this.a(a.a(268), (byte)5, (byte)4);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 26: {
                    this.a(a.a(269), (byte)0, (byte)4);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 27: {
                    this.f(13, 17);
                    break;
                }
                case 28: {
                    c c16 = c.a((byte)9, (byte)0, 13, 18);
                    c16.b(2);
                    c16.a(13, 16, false);
                    c.a((byte)6, (byte)0, 12, 18).a(12, 16, false);
                    c.a((byte)8, (byte)0, 14, 19).a(14, 16, false);
                    c.a((byte)4, (byte)0, 13, 19).a(13, 17, false);
                    c.a((byte)1, (byte)0, 12, 19).a(12, 17, false);
                    this.c(20);
                    ++this.aC;
                    break;
                }
                case 29: {
                    this.a(a.a(270), (byte)1, (byte)4);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 30: {
                    this.f(this.b[0].c, this.b[0].d);
                    break;
                }
                case 31: {
                    this.H = 18;
                    ++this.aC;
                    break;
                }
                case 32: {
                    this.l = true;
                    this.c = true;
                    this.e = this.a(a.a(121 + this.s), a.a(138), this.b, -1);
                    this.e.a((byte)0, true);
                    this.e.a((a)null);
                    a.a.a(this.e);
                    ++this.aC;
                    break;
                }
                case 33: {
                    if (this.a(-1, -1, (byte)1) != 0 || this.e(1) != 0) break;
                    this.l = false;
                    this.c = false;
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 34: {
                    this.u();
                }
            }
        } else if (this.s == 7) {
            switch (this.aC) {
                case 0: {
                    a.a.a(this.G);
                    this.p = true;
                    ++this.aC;
                    break;
                }
                case 1: {
                    if (this.o) break;
                    this.a(a.a(271), (byte)0, (byte)4);
                    ++this.aC;
                    break;
                }
                case 2: {
                    this.f(this.b[1].c, this.b[1].d);
                    break;
                }
                case 3: {
                    this.a(a.a(272), (byte)4, (byte)4);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 4: {
                    this.a(a.a(273), (byte)1, (byte)4);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 5: {
                    this.a(a.a(274), (byte)4, (byte)4);
                    ++this.aC;
                    break;
                }
                case 6: {
                    this.m = this.a(5, 2, (byte)0);
                    this.m.a(7, 2, false);
                    ++this.aC;
                    break;
                }
                case 7: {
                    if (this.m.f == 1) break;
                    this.m.a();
                    this.m = null;
                    this.n = this.a(7, 3, (byte)0);
                    this.n.a(7, 2, false);
                    ++this.aC;
                    break;
                }
                case 8: {
                    if (this.n.f == 1) break;
                    this.n.a();
                    this.n = null;
                    this.o = this.a(9, 2, (byte)0);
                    this.o.a(7, 2, false);
                    ++this.aC;
                    break;
                }
                case 9: {
                    if (this.o.f == 1) break;
                    this.o.a();
                    this.o = null;
                    this.b[1].a(7, 2, false);
                    this.c(20);
                    ++this.aC;
                    break;
                }
                case 10: {
                    this.f(9, 15);
                    this.c = true;
                    break;
                }
                case 11: {
                    d d3 = this.a(null, a.a(279), this.b, 2000);
                    d3.a(this.c, 2, 17);
                    a.a.a(d3);
                    ++this.aC;
                    break;
                }
                case 12: {
                    this.q = false;
                    this.a(this.a(9, 15, (byte)0));
                    ++this.aC;
                    break;
                }
                case 13: {
                    if (this.Q < 2) break;
                    this.a(a.a(275), (byte)0, (byte)4);
                    c c17 = this.a(9, 15, (byte)0);
                    c17.a();
                    this.q = true;
                    this.c(20);
                    ++this.aC;
                    break;
                }
                case 14: {
                    this.c = false;
                    this.a(a.a(276), (byte)4, (byte)4);
                    ++this.aC;
                    break;
                }
                case 15: {
                    this.a(a.a(277), (byte)1, (byte)4);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 16: {
                    this.c = true;
                    this.V = 4;
                    this.f(3, 9);
                    break;
                }
                case 17: {
                    this.f(13, 4);
                    break;
                }
                case 18: {
                    this.V = 12;
                    this.a(a.a(278), (byte)5, (byte)4);
                    this.f(this.b[0].c, this.b[0].d);
                    break;
                }
                case 19: {
                    this.t();
                    ++this.aC;
                    break;
                }
                case 20: {
                    if (!this.r) break;
                    this.c = false;
                    this.l = false;
                    this.c(20);
                    ++this.aC;
                    break;
                }
                case 21: {
                    this.n = true;
                    this.O = 0;
                    this.p = true;
                    ++this.aC;
                    break;
                }
                case 22: {
                    if (this.O < 16) break;
                    this.c(7, 2);
                    this.e(7, 2);
                    this.i();
                    this.b[1] = c.a((byte)9, (byte)1, 7, 2);
                    this.b[1].b(3);
                    c.a((byte)9, (byte)0, 6, 3);
                    c c18 = c.a((byte)9, (byte)0, 8, 3);
                    c18.b(2);
                    c.a((byte)0, (byte)0, 6, 1);
                    c.a((byte)0, (byte)0, 8, 1);
                    this.c(10);
                    ++this.aC;
                    e.a(8, 0);
                    break;
                }
                case 23: {
                    this.n = false;
                    this.o = true;
                    this.O = 0;
                    ++this.aC;
                    break;
                }
                case 24: {
                    if (this.O < 16) break;
                    this.a(a.a(281), (byte)4, (byte)4);
                    this.c(15);
                    ++this.aC;
                    break;
                }
                case 25: {
                    this.a(a.a(282), (byte)0, (byte)4);
                    this.c(8);
                    ++this.aC;
                    break;
                }
                case 26: {
                    this.a(a.a(283), (byte)4, (byte)4);
                    this.c(15);
                    ++this.aC;
                    break;
                }
                case 27: {
                    this.a(this.h, 168, 48, 0, 0, 1, 50);
                    this.a.removeElement(this.b[1]);
                    this.c(15);
                    ++this.aC;
                    break;
                }
                case 28: {
                    this.d(5000);
                    this.c(10);
                    ++this.aC;
                    break;
                }
                case 29: {
                    this.a(a.a(284), (byte)5, (byte)4);
                    this.c(5);
                    ++this.aC;
                    break;
                }
                case 30: {
                    this.a(a.a(285), (byte)2, (byte)4);
                    this.c(5);
                    ++this.aC;
                    break;
                }
                case 31: {
                    this.a(a.a(286), (byte)1, (byte)4);
                    this.c(5);
                    ++this.aC;
                    break;
                }
                case 32: {
                    this.a(a.a(287), (byte)0, (byte)4);
                    this.n = true;
                    this.O = 0;
                    ++this.aC;
                    break;
                }
                case 33: {
                    if (this.O < 16) break;
                    this.c(10);
                    this.B = false;
                    ++this.aC;
                    break;
                }
                case 34: {
                    this.a(5, 2, 2);
                    ++this.aC;
                    break;
                }
                case 35: {
                    e.a(0, 0);
                    this.a(a.a(288));
                    ++this.aC;
                    break;
                }
                case 36: {
                    this.aG = 0;
                    this.c = (byte)14;
                    ++this.aC;
                }
            }
        }
        this.r = null;
    }

    public final void t() {
        this.G = null;
        this.V = 12;
        c.c = c.b;
        this.e.a((byte)0, true);
        this.e.a((byte)1, false);
        a.a.a(this.e);
        this.c = true;
        this.l = true;
        this.m = false;
        e.a(2, 0);
    }

    public final void f(int n, int n2) {
        this.aE = n;
        this.aF = n2;
        this.e(n, n2);
        ++this.aC;
    }

    public final void u() {
        e.h();
        e.b(6, 1);
        a.a.a(this.a(null, a.a(72), this.b, 3000));
        this.d = this.c;
        this.aC = -1;
        this.aG = 0;
        this.c = (byte)10;
    }

    public final void v() {
        this.z = true;
        this.aC = 0;
        this.c(20);
        e.h();
        e.b(7, 1);
    }

    public final void b(c c2, c c3) throws Exception {
        System.gc();
        this.aH = this.b - this.ao;
        this.D = true;
        this.B = 0;
        this.A = false;
        this.e = c2;
        this.f = c3;
        e.b("/2.pak");
        this.a = new g(this, c2, null);
        this.a.a = this.b = new g(this, c3, this.a);
        c2.c(c3);
        if (c3.a(c2, (int)c2.c, (int)c2.d)) {
            c3.c(c2);
            this.C = true;
        } else {
            this.C = false;
        }
        this.a.c = (byte)c2.g;
        this.a.e = (byte)c2.c();
        this.b.c = (byte)c3.g;
        this.b.e = (byte)c3.c();
        e.b(d[this.j[this.f]], 0);
        this.h = (byte)2;
    }

    public final void a(h h2) {
        this.g.addElement(h2);
    }

    public final void b(h h2) {
        this.g.removeElement(h2);
    }

    public final void w() throws Exception {
        h h2;
        int n;
        if (this.B && this.c - this.n >= this.m) {
            this.B = false;
        }
        for (n = 0; n < this.g.size(); ++n) {
            h2 = (h)this.g.elementAt(n);
            h2.c();
        }
        for (n = 0; n < this.g.size(); ++n) {
            h2 = (h)this.g.elementAt(n);
            if (h2.d) continue;
            this.b(h2);
        }
        this.a.e();
        this.b.e();
        if (this.D) {
            ++this.B;
            if (this.B >= 16) {
                this.D = false;
                this.a.a();
            }
            this.E = true;
            this.F = true;
            return;
        }
        if (this.A) {
            if (this.c - this.l >= 300L) {
                this.g.removeAllElements();
                this.b = null;
                this.a = null;
                this.c = new Vector();
                this.h();
                this.h = 1;
                e.h();
                e.b(c[this.j[this.f]], 0);
                a.a.d();
                this.t = true;
                this.u = true;
                return;
            }
        } else if (this.a.b) {
            if (this.C && this.b.c > 0) {
                if (!this.b.a) {
                    this.b.a();
                }
                if (this.b.b) {
                    this.A = true;
                    this.l = this.c;
                    return;
                }
            } else {
                this.A = true;
                this.l = this.c;
            }
        }
    }

    public final void f(Graphics graphics) {
        h h2;
        int n;
        int n2 = 0;
        int n3 = 0;
        if (this.B) {
            n2 = e.a() % 10;
            n3 = e.a() % 3;
        }
        graphics.translate(0, this.ao);
        graphics.setClip(0, 0, this.a, this.aH);
        this.a.a(graphics, n2, n3);
        this.b.a(graphics, n2 + this.c, n3);
        graphics.setColor(0);
        graphics.fillRect(this.c - 1 + n2, 0, 2, this.aH);
        this.a.b(graphics);
        this.b.b(graphics);
        Vector<h> vector = new Vector<h>(this.g.size());
        for (n = 0; n < this.g.size(); ++n) {
            h2 = (h)this.g.elementAt(n);
            int n4 = 0;
            if (h2.f) {
                vector.addElement(h2);
            } else {
                for (n4 = 0; n4 < vector.size(); ++n4) {
                    h h3 = (h)vector.elementAt(n4);
                    if (!h3.f && h2.o + h2.q >= h3.o + h3.q) continue;
                    vector.insertElementAt(h2, n4);
                    break;
                }
            }
            if (n4 != vector.size()) continue;
            vector.addElement(h2);
        }
        this.g = vector;
        for (n = 0; n < this.g.size(); ++n) {
            h2 = (h)this.g.elementAt(n);
            if (h2.l == 0) {
                graphics.setClip(0, 0, this.c, this.aH);
            } else if (h2.l == 1) {
                graphics.setClip(this.c, 0, this.c, this.aH);
            } else {
                graphics.setClip(0, 0, this.a, this.aH);
            }
            h2.a(graphics, 0, h2.r);
        }
        graphics.translate(0, -this.ao);
        graphics.setClip(0, 0, this.W, this.X);
        if (this.F) {
            this.F = false;
            n = this.X - a;
            graphics.setColor(14672074);
            graphics.fillRect(0, n, this.W, a);
            d.a(graphics, 0, n, this.W, a, 0);
            graphics.setClip(0, 0, this.W, this.X);
            this.a.a(graphics);
            graphics.translate(this.c, 0);
            this.b.a(graphics);
            graphics.translate(-this.c, 0);
        }
        if (this.E) {
            this.E = false;
            this.a(graphics, this.a.a, this.b.a, 0);
        }
        if (this.D) {
            i.a(graphics, 0, this.B, 16, 1, null, 0, 0, this.W, this.X);
        }
    }

    public final void d(int n) {
        this.B = true;
        this.m = n;
        this.n = this.c;
    }

    public final d a(String[] stringArray, a a2) {
        d d2;
        if (this.n.length > 0) {
            d2 = new d(11, 0);
            d d3 = d2.a(a.a(46));
            d2.a(a.a(46)).a = this.b[6];
            d2.a(this.n, this.a / 2, (this.b + d3.g) / 2, this.a, this.b - d3.g, 3, 4);
        } else {
            d2 = new d(10, 0);
            d d4 = d2.a(a.a(46));
            d2.a(a.a(46)).a = this.b[6];
            d2.a(null, a.a(52), this.a, -1);
        }
        d2.a(a2);
        a.a.a(d2);
        return d2;
    }

    public final void b(byte[] byArray) {
        Object object;
        try {
            object = new DataInputStream(new ByteArrayInputStream(byArray));
            ((DataInputStream)object).readLong();
            int n = ((DataInputStream)object).readInt();
            switch (n) {
                case 10001: {
                    ((DataInputStream)object).readUTF();
                    ((DataInputStream)object).readInt();
                    ((DataInputStream)object).readUTF();
                    ((DataInputStream)object).readInt();
                    ((DataInputStream)object).readUTF();
                    ((DataInputStream)object).readInt();
                    ((DataInputStream)object).readUTF();
                    int n2 = ((DataInputStream)object).readInt();
                    ((DataInputStream)object).readUTF();
                    ((DataInputStream)object).readUTF();
                    if (this.aL == 0) {
                        int n3 = ((DataInputStream)object).readInt() / 2;
                        this.n = new String[n3];
                        this.o = new String[n3];
                        this.p = new String[n3];
                        boolean bl = false;
                        for (int j = 0; j < n3; ++j) {
                            this.n[j] = ((DataInputStream)object).readUTF();
                            this.o[j] = ((DataInputStream)object).readUTF();
                        }
                        this.A = this.a(this.n, this.a);
                    } else if (this.aL == 1) {
                        ((DataInputStream)object).readInt();
                        this.p[this.aI] = ((DataInputStream)object).readUTF();
                        d d2 = this.a(this.n[this.aI], this.p[this.aI], this.b, this.b / 2, -1);
                        d2.a(this.a);
                        a.a.a(d2);
                    } else if (this.aL == 2) {
                        int n4 = ((DataInputStream)object).readInt() / 3;
                        this.q = new String[n4];
                        this.r = new String[n4];
                        this.k = new int[n4];
                        for (int j = 0; j < n4; ++j) {
                            this.q[j] = ((DataInputStream)object).readUTF();
                            this.r[j] = ((DataInputStream)object).readUTF();
                            this.k[j] = Integer.parseInt(((DataInputStream)object).readUTF());
                        }
                        this.a(this.a);
                        a.a.a(this.D);
                    } else if (this.aL == 3) {
                        String string = this.q[this.aJ];
                        byte[] byArray2 = new byte[n2];
                        ((DataInputStream)object).readFully(byArray2);
                        this.a(string, byArray2);
                        this.a(this.D.a);
                        d d3 = this.a(null, a.a(45, string), this.b, 2000);
                        d3.a(this.D);
                        a.a.a(d3);
                    }
                    this.a = null;
                    return;
                }
            }
            ((FilterInputStream)object).close();
        }
        catch (Exception exception) {
            object = exception;
            exception.printStackTrace();
        }
        object = this.a(null, a.a(44), this.b, -1);
        ((d)object).a(this.a);
        this.a = null;
        a.a.a((a)object);
    }

    public final void a(int n, String string, String string2, a a2) throws Exception {
        this.aL = n;
        this.a = a2;
        this.G = false;
        this.a = new ByteArrayOutputStream();
        this.a = new DataOutputStream(this.a);
        this.a.writeInt(10001);
        this.a.writeUTF(this.d);
        this.a.writeUTF(this.e);
        this.aK = this.a.size();
        this.a.writeUTF("resourceName");
        this.a.writeUTF(string);
        this.a.writeUTF("languageCode");
        this.a.writeUTF(string2);
        this.a.writeUTF("maxChunkSize");
        this.a.writeUTF("1024");
        this.a.writeUTF("chunk");
        this.a.writeUTF("0");
        this.a.writeUTF("requestId");
        this.a.writeUTF("0");
        d d2 = this.a(null, a.a(43), this.b, -1);
        d2.a(a2);
        a.a.a(d2);
        new Thread(this).start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public final void run() {
        var1_1 = null;
        var2_2 = null;
        try {
            var3_3 = this.a.toByteArray();
            this.a.close();
            this.a.close();
            a.a.a();
            var2_2 = (HttpConnection)Connector.open(this.f);
            if ("J4d28g1Kl490".length() > 0) {
                var4_5 = "J4d28g1Kl490".getBytes();
                for (var5_6 = this.aK; var5_6 < var3_3.length; ++var5_6) {
                    v0 = var5_6;
                    var3_3[v0] = (byte)(var3_3[v0] ^ var4_5[var5_6 % ((byte[])var4_5).length]);
                }
            }
            var2_2.setRequestMethod("POST");
            var2_2.setRequestProperty("Content-Length", Integer.toString(var3_3.length));
            var2_2.setRequestProperty("Connection", "close");
            v1 = var2_2.openOutputStream();
            var4_5 = v1;
            v1.write(var3_3);
            var4_5.flush();
            var4_5.close();
            var5_7 = var2_2.openDataInputStream();
            var6_8 = var2_2.getResponseCode();
            if (var6_8 == 200) {
                var7_9 = new ByteArrayOutputStream();
                var8_10 = 0;
                while ((var8_10 = var5_7.read()) != -1) {
                    var7_9.write(var8_10);
                }
            } else {
                throw new Exception("" + var6_8);
            }
            var1_1 = var7_9.toByteArray();
            var7_9.close();
            var5_7.close();
            ** if (var2_2 == null) goto lbl-1000
        }
        catch (Exception v3) {
            try {
                var3_4 = v3;
                v3.printStackTrace();
                ** if (var2_2 == null) goto lbl-1000
            }
            catch (Throwable var9_14) {
                if (var2_2 != null) {
                    try {
                        var2_2.close();
                    }
                    catch (Exception v5) {
                        var11_13 = v5;
                        v5.printStackTrace();
                    }
                }
                throw var9_14;
            }
lbl-1000:
            // 1 sources

            {
                try {
                    var2_2.close();
                }
                catch (Exception v4) {
                    var11_12 = v4;
                    v4.printStackTrace();
                }
            }
lbl-1000:
            // 2 sources

            {
            }
        }
lbl-1000:
        // 1 sources

        {
            try {
                var2_2.close();
            }
            catch (Exception v2) {
                var11_11 = v2;
                v2.printStackTrace();
            }
        }
lbl-1000:
        // 2 sources

        {
        }
        a.a.b();
        if (!this.G) {
            this.b(var1_1);
        }
    }

    public final void e(int n) throws Exception {
        int n2 = this.i[n];
        --this.R;
        String[] stringArray = new String[this.R];
        int[] nArray = new int[this.R];
        System.arraycopy(this.i, 0, stringArray, 0, n);
        System.arraycopy(this.i, n + 1, stringArray, n, this.R - n);
        System.arraycopy(this.i, 0, nArray, 0, n);
        System.arraycopy(this.i, n + 1, nArray, n, this.R - n);
        this.i = stringArray;
        this.i = nArray;
        e.a("download", n2);
        this.T = e.a("download");
        this.x();
        for (int j = 0; j < 3; ++j) {
            if (this.h[j] != n2 + a.length) continue;
            this.m[j] = -1;
            this.h[j] = -1;
            this.h[j] = "\n" + a.a(79) + "\n ";
            e.a("save", j, new byte[0]);
        }
    }

    public final void a(String string, byte[] byArray) throws Exception {
        String[] stringArray = new String[this.R + 1];
        int[] nArray = new int[this.R + 1];
        System.arraycopy(this.i, 0, stringArray, 0, this.R);
        System.arraycopy(this.i, 0, nArray, 0, this.R);
        this.i = stringArray;
        this.i = nArray;
        this.i[this.R] = e.a("download", byArray);
        this.i[this.R] = string;
        ++this.R;
        this.T = e.a("download");
        this.x();
    }

    public final void x() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt(this.R);
        for (int j = 0; j < this.R; ++j) {
            dataOutputStream.writeInt(this.i[j]);
            dataOutputStream.writeUTF(this.i[j]);
        }
        e.a("settings", 2, byteArrayOutputStream.toByteArray());
        dataOutputStream.close();
    }
}
