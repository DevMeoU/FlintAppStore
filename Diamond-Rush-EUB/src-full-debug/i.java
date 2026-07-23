/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class i
extends Canvas
implements Runnable {
    private int l;
    private int m;
    private boolean c;
    private boolean d;
    private int n;
    private int o;
    private String a;
    private boolean e;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private String b;
    private String c;
    private int u;
    private boolean f;
    private boolean g;
    private byte c;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;
    private int A;
    private int B;
    private static boolean[] a = new boolean[]{true, false, false};
    private int C;
    private static boolean[] b = new boolean[]{false, false, false};
    private boolean h;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private boolean i;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private boolean j;
    private boolean k;
    private int T;
    private int U;
    private int V = 0;
    private int W = 0;
    private int X;
    private int Y;
    private int Z;
    private byte d;
    private byte e;
    private byte f;
    private byte g;
    private byte h;
    private byte i;
    private boolean l;
    private int aa;
    private int ab;
    private int ac;
    private static byte[] a = new byte[16];
    private static byte[] b = new byte[8];
    private static byte[] c = new byte[8];
    private int ad;
    private int ae;
    private byte j;
    private static boolean m;
    private int af;
    private int ag;
    private static int ah;
    private boolean n;
    private boolean o;
    private int ai;
    private int aj;
    private static byte[] d;
    private byte k;
    private int ak = 0;
    private int al;
    private int am;
    private int an;
    private boolean p;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private int at;
    private boolean q;
    private boolean r;
    private boolean s = false;
    private boolean t;
    private int au;
    private int av;
    private static byte[] e;
    private int aw;
    private int ax;
    private int ay;
    public byte a;
    private byte l;
    private int az;
    private int aA;
    private int aB;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    private int aC;
    private int aD = -1;
    private int aE;
    private int aF = -1;
    private int aG;
    private int aH = -1;
    private int aI;
    private int aJ;
    private int aK;
    private int aL;
    private int aM;
    private int aN;
    private int aO;
    private int aP;
    private int aQ;
    public static byte b;
    private int aR;
    private static byte m;
    private boolean u;
    private static int aS;
    public static int g;
    private long a;
    private boolean v;
    public int h;
    public int i;
    public int j;
    public int k;
    private int aT;
    private boolean w;
    private int aU;
    private int aV;
    private boolean x;
    private byte n;
    private int aW;
    private long b = "";
    private int aX;
    private int aY = 0;
    private int aZ;
    private int ba = 0;
    private int bb;
    private int bc;
    private int bd;
    private int be;
    private int bf;
    private byte o = a.a[this.n];
    private int bg;
    private int bh;
    private int bi;
    private int bj;
    private int bk;
    private int bl;
    private int bm = -1;
    private boolean y;
    private int bn;
    private boolean z;
    private int bo;
    private int bp;
    private int bq;
    private int br;
    private int bs;
    private int bt;
    private int bu;
    private int bv;
    private int bw;
    private int bx;
    private int by;
    private int bz;
    private int bA;
    private int bB;
    private int bC;
    private boolean A;
    private int bD = 0;
    private int bE;
    private int bF;
    private int bG;
    private int bH;
    private int bI;
    private int bJ;
    private int bK;
    private int bL;
    private int bM;
    private int bN;
    private int bO;
    private int bP;
    private int bQ;
    private int bR;
    private int bS;
    private int bT;
    private int bU;
    private int bV;
    private int bW = 0;
    private int bX = 0;
    private int bY = 0;
    private int bZ = 0;
    private int ca = 0;
    private int cb = 0;
    private boolean B = 0;
    private int cc;
    private int cd;
    private InputStream a;
    private byte p = 0;
    private byte q = false;
    private boolean C = false;
    private int ce;
    private int cf;
    private int cg;
    private int ch;
    private Graphics a;
    private static Image a;
    private static Image b;
    private static Image c;
    private static Image[][] b;
    public static Image[][] a;
    public static f[] a;
    private static h b;
    public static h a;
    private static f a;
    private static byte[] f;
    private static b[] a;
    private static f b;
    private static byte[] g;
    private static byte[] h;
    private long c;
    private long d;
    private boolean D = false;
    private static byte[] i;
    private static byte[] j;
    public static int[][] a;
    public static int[][] b;
    private static byte[][] a;
    private static byte[][] b;
    private static byte[][] c;
    private static byte[] k;
    private boolean E = 10;
    private int ci;
    private int cj;
    private int ck;
    private int cl;
    private static byte[] l;
    private static byte[] m;
    private static int cm;
    private static int cn;
    private static byte[] n;
    private static int[][] c;
    private static int[][] d;
    private static byte[][] d;
    private static byte[][] e;
    private static byte[] o;
    public final j a;
    private c a;
    private static c[] a;
    private static byte[] p;
    private Thread a;
    public static GloftDIRU a;
    private int co = -1;
    private int cp = -1;
    private int cq;
    private int cr;
    private int cs;
    private static f c;
    private int ct;
    private byte r = 0;
    public static boolean a;
    private static String d;
    private long e;
    private long f = false;
    private boolean F = false;
    private boolean G = false;
    private boolean H = false;
    private boolean I = false;
    private boolean J = false;
    private boolean K = false;
    private boolean L = false;
    private boolean M = false;
    private boolean N = false;
    private int cu = -1;
    private int cv;
    private int cw;
    private boolean O = 0;
    private boolean P = false;
    private int cx;
    private int cy;
    private boolean Q = false;
    private boolean R = false;
    private int cz;
    private int cA;
    private boolean S = 0;
    private boolean T = 0;
    private int cB;
    private static Image d;
    private static Graphics b;
    private static int cC;
    private static int cD;
    private static int cE;
    private static int cF;
    private static int cG;
    private static int cH;
    private int cI;
    private int cJ;
    private int cK;
    private int cL;
    private static Image e;
    private static int cM;
    private static int cN;
    private static int cO;
    private int cP = -1;
    private int cQ = -1;
    private int cR = -1;
    private int cS = -1;
    private int cT = -1;
    private int cU = -1;
    private int cV = -1;
    private boolean U = true;
    private int cW;
    private int cX;
    private int cY;
    private int cZ;
    private int da = 3;
    private int db = -1;
    private long g;
    private int dc = -1;
    private static boolean V;
    private static boolean W;
    private long h;
    private boolean X = 0;
    private boolean Y = 0;
    private boolean Z = 0;
    private boolean aa;
    private boolean ab = false;
    private int dd = 0;
    private int[] a = null;
    private static byte s;
    private static int[] b;
    private static int de;
    private static int df;
    private static int dg;
    private byte t = false;
    private byte u = false;
    private boolean ac = false;
    private static byte[] q;
    private static byte[] r;
    private long i = 0L;
    private boolean ad;
    private int dh = 0;
    private boolean ae;
    private long j = 0L;
    private long k = 0L;
    private boolean af = false;
    private long l = 0;
    private boolean ag = 0;
    private boolean ah;
    private boolean ai;
    private boolean aj = false;
    private String e = 1;
    private int di = 0;
    private int dj;
    private int dk;
    private int dl;
    private static boolean ak;
    private static int dm;
    private static int dn;
    private static int do;
    private static int dp;
    private boolean al = true;
    private int dq = -1;
    private int dr;
    private int ds;
    private byte v = 0;
    private int dt;
    private int du;
    private int dv;
    private int dw;
    private int dx;
    private byte w = 0;
    private int dy;
    private int dz = -1;
    private byte x = 0;
    private byte y = 0;
    private int dA;
    private int dB;
    private int dC;
    private byte z = 0;
    private int dD;
    private int dE;
    private int dF;
    private byte A = 0;
    private int dG;
    private int dH;
    private static f d;
    private static int[][] e;
    private static long[] a;
    private static long[] b;
    private static int[][] f;
    private static long[] c;
    private static long[] d;
    private static boolean am;
    private int dI;
    private int dJ;
    private static String f;
    private static long[][] a;
    private static StringBuffer a;
    private static StringBuffer b;
    private static StringBuffer c;
    private static Image f;
    private static Graphics c;
    private int dK = 100;
    private int dL;
    private int dM;
    private int dN;
    private int dO;
    private int dP;
    private int dQ;
    private int dR;
    private int dS;
    private int dT;
    private int dU;
    private boolean an = true;
    private boolean ao;
    private int dV;
    private int dW;
    private int dX;
    private int dY;
    private static int dZ;
    private int ea;
    private int eb;
    private int ec;
    private int ed;
    private int ee;
    private int ef;
    private int eg;
    private int eh;
    private boolean ap = true;
    private boolean aq = true;
    private boolean ar = true;
    private int[] c = 0;
    private int ei;
    private int ej;
    private int ek = 2;
    private int el;
    private int em = 2;
    private boolean as;
    private boolean at = true;
    private boolean au = true;
    private long m = 0L;
    private int en = -1;
    private String g = 0L;
    private StringBuffer d = 1;
    private boolean av = true;
    private boolean aw = true;
    private int eo;
    private int ep;
    private static short[][] a;
    private static int[] d;
    private static int[][] g;
    private static String[] c;
    public static String[] a;
    public static String[] b;
    public static boolean b;
    private static byte[] s;
    private static String[] d;
    private static int eq;
    private long n = true;
    private String h = 0L;
    private int er;
    private int es;
    private int et;
    private int eu;

    public i(GloftDIRU object) {
        int n;
        short[] sArray;
        this.s = this.q;
        this.t = this.r;
        this.f = (byte)3;
        this.g = (byte)3;
        this.h = (byte)2;
        this.a = new int[]{0, 0, 0, 0, 0};
        this.x = (byte)3;
        this.d = new StringBuffer();
        this.n = System.currentTimeMillis();
        a = new b[6];
        a = new f[61];
        Object object2 = this;
        if (f.e == null) {
            object2 = object2.getClass().getResourceAsStream("/mc");
            f.e = new byte[256];
            try {
                ((InputStream)object2).read(f.e);
                ((InputStream)object2).close();
            }
            catch (Exception exception) {}
        }
        b = new Image[33][];
        a = new Image[2][];
        a = object;
        this.a = new j();
        this.setFullScreenMode(true);
        object = this;
        this.o = true;
        m = true;
        d = a.getAppProperty(d);
        this.a = new Thread(this);
        this.a.start();
        if (!i.a()) {
            i.a[0] = new short[8];
            i.a[0][0] = 0;
            i.a[0][1] = 16;
            i.a[0][2] = 1;
            i.a[0][3] = 40;
            i.a[0][4] = 3;
            i.a[0][5] = 18;
            i.a[0][6] = 5;
            sArray = a[0];
            n = 7;
        } else {
            i.a[0] = new short[10];
            i.a[0][0] = 0;
            i.a[0][1] = 16;
            i.a[0][2] = 1;
            i.a[0][3] = 40;
            i.a[0][4] = 6;
            i.a[0][5] = 44;
            i.a[0][6] = 3;
            i.a[0][7] = 18;
            i.a[0][8] = 5;
            sArray = a[0];
            n = 9;
        }
        sArray[n] = 22;
    }

    private void a(int n, int n2, int n3) {
        this.aF = -1;
        this.aI = -1;
        this.aH = -1;
        int n4 = i.a[(this.k & 0x4000) == 0 ? 0 : 3].d;
        if (n4 == 40) {
            return;
        }
        if (n4 == 48) {
            return;
        }
        if (n4 == 47) {
            return;
        }
        if (this.b <= 0L && this.aW == 0 && this.bi == 0 && this.l != 6 && (this.k & 0x70) == 0 || this.aT > 0) {
            ++this.bc;
            this.a((byte)(this.n - n));
            if (this.bl == 0 && this.n == 0) {
                this.j = 0L;
                this.co = this.bE;
                this.cp = this.bF;
                c = null;
            }
            this.k = this.k & 0xFFFFFF8F | n2;
            this.p(5);
            switch (n2) {
                case 16: {
                    this.av = 0;
                    this.au = 0;
                    this.aT = 5;
                    i.a[this.h][this.i] = 9;
                    this.k &= 0xFFFFFF8F;
                    i.b[this.h][this.i] = 0x8400000;
                    i.c[this.h][this.i] = 24;
                    return;
                }
                case 64: {
                    this.g(1000);
                    return;
                }
            }
            this.g(10);
            if (n3 != 0) {
                n = (byte)n3;
                do {
                    if (a[n2 = this.h - g[n]][n4 = this.i - g[n + 8]] >= 0 || (byte)a[n2][n4] >= 0) continue;
                    this.h = n2;
                    this.i = n4;
                    this.j = 18;
                    this.a = 0;
                    this.k = this.k & 0xFFFFFFF8 | n | 0x800;
                    return;
                } while ((byte)(n = (byte)(n >= 4 ? 1 : (byte)(n + 1))) != n3);
            }
        }
    }

    private void a(byte by) {
        block4: {
            byte by2;
            block3: {
                i i2;
                block2: {
                    this.n = by;
                    if (this.n > 0) break block2;
                    i2 = this;
                    by2 = 0;
                    break block3;
                }
                if (this.n <= i[8]) break block4;
                i2 = this;
                by2 = i[8];
            }
            i2.n = by2;
        }
        v2.o = true;
    }

    private void a(int n) {
        this.bp = this.bo;
        this.z = false;
        this.bq = 0;
        this.bo = n;
        this.cW = 0;
        if (n >= 0) {
            v0.cX = a[this.bo].length >> 1;
            this.cY = 0;
            for (n = 0; n < this.cX; ++n) {
                int n2 = i.a(b, a[a[this.bo][(n << 1) + 1]], 0);
                if (this.bo == 0 && n == 3 || n2 <= this.cY) continue;
                this.cY = n2;
            }
            this.cZ = 0;
            this.cW = 0;
        }
    }

    private static boolean a(int n) {
        return (ah & n) != 0;
    }

    public final void keyPressed(int n) {
        if ((n = i.g(n)) == 0 && b == 30) {
            n = 53;
        }
        ah |= n;
        this.d = false;
    }

    public final void keyReleased(int n) {
        if (b == 30 && i.g(n) == 0) {
            n = 53;
        }
        ah &= ~i.g(n);
        this.d = true;
    }

    private void e() {
        this.a = System.currentTimeMillis();
        aS = 0;
        g = 0;
        this.ak = 0;
    }

    private static void a(long l) {
        if (l <= 0L) {
            return;
        }
        System.currentTimeMillis();
        try {
            Thread.sleep(l);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void run() {
        RecordStore recordStore;
        block21: {
            this.a = System.currentTimeMillis();
            this.e();
            i i2 = this;
            recordStore = null;
            try {
                try {
                    recordStore = RecordStore.openRecordStore("Preferences", false);
                }
                catch (Exception exception) {
                    System.out.println("Exception " + exception);
                }
                j = new byte[1];
                if (recordStore == null) {
                    try {
                        recordStore = RecordStore.openRecordStore("Preferences", true);
                        i.j[0] = 0;
                        i2.cv = j.length;
                        recordStore.closeRecordStore();
                        i2.v();
                    }
                    catch (Exception exception) {}
                    break block21;
                }
                try {
                    j = recordStore.getRecord(1);
                    i2.cv = j.length;
                    recordStore.closeRecordStore();
                    recordStore = null;
                }
                catch (Exception exception) {}
            }
            catch (Throwable throwable) {
                try {
                    if (recordStore != null) {
                        recordStore.closeRecordStore();
                    }
                }
                catch (Exception exception) {}
                throw throwable;
            }
        }
        try {
            if (recordStore != null) {
                recordStore.closeRecordStore();
            }
        }
        catch (Exception exception) {}
        while (!this.B) {
            if (this.af) continue;
            this.e = System.currentTimeMillis();
            try {
                this.f();
            }
            catch (Exception exception) {
                exception.printStackTrace();
                i.a(5000L);
            }
            if (this.B) break;
            if (b != 2) {
                ++aS;
            }
            System.currentTimeMillis();
            if (this.f > 65L) {
                this.v = true;
                this.f = 0L;
                continue;
            }
            this.repaint();
            this.v = false;
            if (b != 2) {
                ++g;
            }
            this.f = Math.abs(System.currentTimeMillis() - this.e);
            i.a(50L - (System.currentTimeMillis() - this.e));
        }
        this.p();
        this.a.d();
        a.a();
    }

    /*
     * Unable to fully structure code
     */
    private void f() {
        block340: {
            block341: {
                block339: {
                    var2_1 = this;
                    if (i.eq > 0) {
                        i.eq = (int)((long)i.eq - (System.currentTimeMillis() - var2_1.n));
                        var2_1.n = System.currentTimeMillis();
                        if (i.eq <= 0) {
                            var2_1.d(true);
                        }
                    }
                    var2_1 = this;
                    if (i.ah != 0) break block339;
                    var2_1.a = 0;
                    break block340;
                }
                if (!(i.eq > 0)) break block341;
                var2_1.d(true);
                i.ah = 0;
                break block340;
            }
            switch (i.b) {
                case 33: {
                    var1_3 = var2_1;
                    if (!i.a(64)) break;
                    if (var1_3.bo == 0) {
                        i.b = (byte)4;
                        super.a(0);
                    }
                    if (var1_3.bo != 1) break;
                    i.b = (byte)2;
                    i.V = true;
                    var1_3.o = true;
                    super.a(1);
                    break;
                }
                case 26: {
                    var1_3 = var2_1;
                    if (i.a(64)) {
                        i.b = (byte)4;
                        var1_3.a(4);
                    }
                    v0 = 0;
                    break;
                }
                case 18: {
                    break;
                }
                case 25: {
                    var2_1.R();
                    break;
                }
                case 24: {
                    var1_3 = var2_1;
                    var3_11 = 0;
                    if (!i.a(512)) ** GOTO lbl48
                    var1_3.ab = var1_3.ab == false;
                    ** GOTO lbl107
lbl48:
                    // 1 sources

                    if (!i.a(65536)) ** GOTO lbl51
                    var1_3.aZ += 50;
                    ** GOTO lbl107
lbl51:
                    // 1 sources

                    if (!i.a(131072)) ** GOTO lbl54
                    var1_3.bb += 5;
                    ** GOTO lbl107
lbl54:
                    // 1 sources

                    if (!i.a(262144)) ** GOTO lbl66
                    if (i.m != 1) {
                        var1_3.cA <<= 1;
                        if (var1_3.cA == 0) {
                            v1 = var1_3;
                            v2 = 1;
                        } else if (var1_3.cA > 8) {
                            v1 = var1_3;
                            v2 = v1.cA = 0;
                        }
                        i.i[10] = var1_3.cA > 2 ? 1 : 0;
                    }
                    ** GOTO lbl107
lbl66:
                    // 1 sources

                    if (!i.a(524288)) ** GOTO lbl69
                    var1_3.S = var1_3.S == false;
                    ** GOTO lbl107
lbl69:
                    // 1 sources

                    if (!i.a(1024)) ** GOTO lbl72
                    var1_3.T = var1_3.T == false;
                    ** GOTO lbl107
lbl72:
                    // 1 sources

                    if (i.a(64)) ** GOTO lbl104
                    if (!i.a(32944)) ** GOTO lbl107
                    i.i[8] = (byte)var1_3.cz;
                    i.i[9] = (byte)var1_3.cA;
                    if (var1_3.S || var1_3.T) {
                        for (var4_20 = 0; var4_20 <= 2; ++var4_20) {
                            var5_24 = i.e(var4_20);
                            if (var4_20 == 2) {
                                ++var5_24;
                            }
                            for (var7_27 = 0; var7_27 <= var5_24; ++var7_27) {
                                super.a(var4_20, var7_27, (byte)2);
                                super.a(var4_20, var7_27, (byte)64);
                            }
                            i.a(var4_20, var5_24);
                        }
                        if (var1_3.T) {
                            for (var4_20 = 0; var4_20 <= 2; ++var4_20) {
                                var5_24 = i.d(var4_20);
                                if (var4_20 == 0) {
                                    --var5_24;
                                }
                                for (var7_27 = i.e(var4_20); var7_27 < var5_24; ++var7_27) {
                                    super.a(var4_20, var7_27, (byte)2);
                                    super.a(var4_20, var7_27, (byte)64);
                                }
                                i.a(var4_20, var5_24 - 1);
                            }
                        }
                    }
                    super.b();
                    var8_35 = var1_3;
                    i.e(6, var8_35.bb);
                    super.u();
lbl104:
                    // 2 sources

                    var3_11 = 1;
                    var1_3.a.setColor(0);
                    var1_3.a.fillRect(0, 0, 320, 240);
lbl107:
                    // 8 sources

                    if (var3_11 != 0) {
                        super.U();
                    }
                    v0 = 0;
                    break;
                }
                case 34: {
                    var1_3 = var2_1;
                    var3_11 = 0;
                    if (i.a(33008)) {
                        var1_3.U();
                        i.a(i.a, true);
                        i.a = null;
                    }
                    if (i.a(4097)) {
                        --var1_3.dd;
                        if (var1_3.dd < 0) {
                            var1_3.dd = 0;
                        }
                    }
                    if (i.a(262146)) {
                        ++var1_3.dd;
                        if (var1_3.dd >= 2) {
                            var1_3.dd = 1;
                        }
                    }
                    var4_20 = var1_3.a[var1_3.dd];
                    if (i.a(16388)) {
                        --var4_20;
                    }
                    if (i.a(65544)) {
                        ++var4_20;
                    }
                    if (var4_20 < 0) {
                        var4_20 = 0;
                    }
                    switch (var1_3.dd) {
                        case 1: {
                            v3 = 8;
                            break;
                        }
                        case 0: {
                            v3 = var3_11 = 115;
                        }
                    }
                    if (var4_20 >= var3_11) {
                        var4_20 = var3_11 - 1;
                    }
                    var1_3.a[var1_3.dd] = var4_20;
                    ** GOTO lbl591
                }
                case 12: {
                    var1_3 = var2_1;
                    if (!i.a(32944)) break;
                    var1_3.az = 5;
                    i.i[3] = (byte)var1_3.az;
                    if (var1_3.k == 2) {
                        super.l();
                        break;
                    }
                    i.e(4, -500);
                    super.u();
                    i.b = (byte)15;
                    var1_3.J = true;
                    var1_3.H = true;
                    super.ax();
                    break;
                }
                case 4: {
                    var2_1.V();
                    break;
                }
                case 30: {
                    if (!i.a(1048575)) break;
                    i.b = (byte)4;
                    if (var2_1.bo == -1) {
                        var2_1.aR = 0;
                        var2_1.a(0);
                    } else {
                        var2_1.aR = 2;
                    }
                    v0 = 0;
                    break;
                }
                case 2: 
                case 7: 
                case 32: {
                    var2_1.V();
                    break;
                }
                case 1: {
                    if (var2_1.h || var2_1.aj) {
                        i.ah = 0;
                    }
                    i.m = i.b;
                    var2_1.T();
                    var1_3 = var2_1;
                    if (var1_3.ab && (i.a(524288) || i.a(131072))) {
                        var3_12 = var1_3;
                        if (var3_12.aA == 0 && var3_12.aB == 13) {
                            var3_12.a = null;
                            var3_12.h = 60;
                            var3_12.i = 3;
                        } else {
                            var3_12.at = i.a(524288);
                            var3_12.C = var3_12.at == false;
                            var3_12.bd = 0;
                            var3_12.bc = 0;
                            var3_12.x = true;
                            var3_12.h = var3_12.e + 5 + 1;
                        }
                    }
                    if (var1_3.cl != 0 && !i.a(32944) || var1_3.ay != 0 || var1_3.x || var1_3.n <= 0 || i.a[0].d == 19 || var1_3.E) {
                        i.ah = 0;
                        break;
                    }
                    if (var1_3.a != null) {
                        if (i.a(32784)) {
                            var1_3.a.a();
                        } else if (i.a(32944)) {
                            var1_3.a.a = true;
                        }
                        i.ah = 0;
                        break;
                    }
                    if (var1_3.aT > 0) {
                        var3_13 = true;
                        if (i.a(4097)) {
                            var1_3.av = -5;
                        } else if (i.a(262146)) {
                            var1_3.av = 5;
                        } else if (i.a(16388)) {
                            var1_3.au = -5;
                        } else if (i.a(65544)) {
                            var1_3.au = 5;
                        } else if (!i.a(32784)) {
                            if (i.a(32944)) {
                                super.ag();
                                i.ah = 0;
                            } else {
                                var3_13 = false;
                            }
                        }
                        if (!var3_13) break;
                        --var1_3.aT;
                        if (var1_3.aT == 0) {
                            if ((byte)i.a[var1_3.h][var1_3.i] < 0) {
                                i.a[var1_3.h][var1_3.i] = 32;
                            }
                            if (i.a[var1_3.h][var1_3.i] == 9) {
                                i.a[var1_3.h][var1_3.i] = -1;
                            }
                            var1_3.b = 40L;
                            var1_3.j = 0;
                            var1_3.k &= -113;
                            super.g(super.c());
                        }
                        i.ah = 0;
                        break;
                    }
                    if (!i.a(4097)) ** GOTO lbl241
                    var1_3.a = 1;
                    ** GOTO lbl417
lbl241:
                    // 1 sources

                    if (!i.a(262146)) ** GOTO lbl244
                    var1_3.a = (byte)3;
                    ** GOTO lbl417
lbl244:
                    // 1 sources

                    if (!i.a(16388)) ** GOTO lbl247
                    var1_3.a = (byte)4;
                    ** GOTO lbl417
lbl247:
                    // 1 sources

                    if (!i.a(65544)) ** GOTO lbl250
                    var1_3.a = (byte)2;
                    ** GOTO lbl417
lbl250:
                    // 1 sources

                    if (!i.a(32784)) ** GOTO lbl397
                    i.ah = 0;
                    if (var1_3.bS != var1_3.h || var1_3.bT != var1_3.i || (i.a[var1_3.h][var1_3.i] & 255) != 4) ** GOTO lbl256
                    super.p(9);
                    super.ar();
                    ** GOTO lbl417
lbl256:
                    // 1 sources

                    var3_14 = i.e == null ? 0 : i.a(i.e[var1_3.h][var1_3.i], (byte)0, (byte)3, (byte)4);
                    if (var3_14 == 8 || var3_14 == 7) ** GOTO lbl417
                    var4_20 = var1_3.k & 7;
                    var5_24 = -1;
                    var7_28 = -1;
                    var8_36 = false;
                    if (i.i[9] < 2) ** GOTO lbl299
                    var9_38 = 0;
                    for (var6_39 = 0; var6_39 < 2; ++var6_39) {
                        var10_41 = var6_39 == 0 ? 1 : -1;
                        if ((var10_41 <= 0 || var1_3.h >= var1_3.e - 3) && (var10_41 >= 0 || var1_3.h <= 3)) continue;
                        block155: for (var12_46 = 1; var12_46 <= 3; ++var12_46) {
                            var13_49 = var1_3.h + var10_41 * var12_46;
                            var11_45 = i.a[var13_49][var1_3.i];
                            if ((i.a[var13_49][var1_3.i] & 255) == 7 && (i.a[var13_49][var1_3.i] >> 8 & 240) == 0) ** GOTO lbl-1000
                            if (var11_45 == 48 && (i.b[var13_49][var1_3.i] & 8) != 0) continue;
                            switch (var11_45) {
                                case 11: 
                                case 19: 
                                case 43: {
                                    if (var10_41 <= 0) ** GOTO lbl278
                                    v4 = var9_38;
                                    v5 = 2;
                                    ** GOTO lbl281
lbl278:
                                    // 1 sources

                                    if (var10_41 >= 0) ** GOTO lbl282
                                    v4 = var9_38;
                                    v5 = 4;
lbl281:
                                    // 2 sources

                                    var9_38 = v4 | v5;
                                }
lbl282:
                                // 3 sources

                                case 0: 
                                case 1: 
                                case 8: 
                                case 9: 
                                case 14: 
                                case 47: 
                                case 48: {
                                    if (var12_46 == 1) ** GOTO lbl290
                                    if (var7_28 < 0) {
                                        var7_28 = var10_41 > 0 ? 2 : 4;
                                    } else {
                                        var8_36 = true;
                                        var7_28 = var9_38 == 2 ? 2 : (var9_38 == 4 ? 4 : -1);
                                    }
                                    ** GOTO lbl294
lbl290:
                                    // 1 sources

                                    v6 = 4;
                                    break;
                                }
                                case -1: {
                                    continue block155;
                                }
lbl294:
                                // 3 sources

                                default: lbl-1000:
                                // 2 sources

                                {
                                    v6 = 4;
                                }
                            }
                            var12_46 = v6;
                        }
                    }
lbl299:
                    // 2 sources

                    if (i.i[9] < 1) ** GOTO lbl369
                    var1_3.a = (byte)5;
                    var9_38 = 0;
                    var6_40 = new int[]{0, 1, 0, -1, 1, 1, -1, -1, 0, 2, 0, -2};
                    var10_42 = new int[]{-1, 0, 1, 0, -1, 1, 1, -1, -2, 0, 2, 0};
                    var15_50 = new int[]{0, 0, 0, 0, 3, 6, 12, 9, 1, 2, 4, 8};
                    for (var16_52 = 0; var16_52 < var6_40.length; ++var16_52) {
                        var3_14 = var1_3.h + var6_40[var16_52];
                        var11_45 = var1_3.i + var10_42[var16_52];
                        if (var3_14 < 0 || var3_14 >= var1_3.e || var11_45 < 0 || var11_45 >= var1_3.f) continue;
                        var12_46 = i.b[var3_14][var11_45] & 7;
                        var13_49 = 0;
                        var14_53 = -1;
                        var17_54 = false;
                        switch (i.a[var3_14][var11_45]) {
                            case 9: 
                            case 18: 
                            case 30: {
                                if (var15_50[var16_52] != 0) break;
                                var17_54 = true;
                                break;
                            }
                            case 46: 
                            case 49: 
                            case 50: {
                                if (var15_50[var16_52] != 0) break;
                                ++var9_38;
                                var17_54 = true;
                                break;
                            }
                            case 19: 
                            case 43: {
                                if ((i.b[var3_14][var11_45] & 248) != 0) break;
                                ** GOTO lbl328
                            }
                            case 45: {
                                if ((i.b[var3_14][var11_45] & 15) == 10) break;
lbl328:
                                // 2 sources

                                var13_49 = 1;
                            }
                        }
                        if (var13_49 != 0) {
                            if (var15_50[var16_52] == 0) {
                                v7 = var16_52 + 1;
                            } else if (i.b[var3_14][var11_45] >= 12) {
                                if ((var15_50[var16_52] & 1) != 0 && var12_46 == 3) {
                                    if (var6_40[var16_52] == 0) {
                                        v7 = 1;
                                    } else if (var6_40[var16_52] < 0) {
                                        v7 = 4;
                                    } else if (var6_40[var16_52] > 0) {
                                        v7 = 2;
                                    }
                                } else if ((var15_50[var16_52] & 8) != 0 && var12_46 == 2) {
                                    if (var10_42[var16_52] == 0) {
                                        v7 = 4;
                                    } else if (var10_42[var16_52] < 0) {
                                        v7 = 1;
                                    } else if (var10_42[var16_52] > 0) {
                                        v7 = var14_53 = 3;
                                    }
                                }
                            }
                            if (var14_53 != -1) {
                                var17_54 = true;
                                ++var9_38;
                            }
                        }
                        if (!var17_54) continue;
                        if (var9_38 == 0) {
                            if (var4_20 == var16_52 + 1) {
                                var5_24 = var4_20;
                                continue;
                            }
                            if (var5_24 >= 0) continue;
                            var5_24 = var16_52 + 1;
                            continue;
                        }
                        if (var9_38 == 1) {
                            var5_24 = var14_53;
                            continue;
                        }
                        var5_24 = var4_20;
                        break;
                    }
lbl369:
                    // 3 sources

                    if (var5_24 <= 0 || var7_28 != var4_20) ** GOTO lbl375
                    var1_3.a = (byte)6;
                    v8 = var1_3;
                    v9 = var1_3.k & -8;
                    v10 = var4_20;
                    ** GOTO lbl392
lbl375:
                    // 1 sources

                    if (var5_24 <= 0 || var7_28 >= 0 || var8_36) ** GOTO lbl380
                    v8 = var1_3;
                    v9 = var1_3.k & -8;
                    v10 = var5_24;
                    ** GOTO lbl392
lbl380:
                    // 1 sources

                    if (var5_24 < 0 && var7_28 > 0 && !var8_36) ** GOTO lbl388
                    if (!var8_36 || var4_20 != 2 && var4_20 != 4) ** GOTO lbl387
                    var1_3.a = (byte)6;
                    v8 = var1_3;
                    v9 = var1_3.k & -8;
                    v10 = var4_20;
                    ** GOTO lbl392
lbl387:
                    // 1 sources

                    if (!var8_36 || var7_28 <= 0) ** GOTO lbl393
lbl388:
                    // 2 sources

                    var1_3.a = (byte)6;
                    v8 = var1_3;
                    v9 = var1_3.k & -8;
                    v10 = var7_28;
lbl392:
                    // 4 sources

                    v8.k = v9 | v10;
lbl393:
                    // 2 sources

                    if (var1_3.a == 6 && (i.a[var1_3.h][var1_3.i] & 255) == 2 && i.a[var1_3.h][var1_3.i] >> 8 == 1) {
                        var1_3.aD = -1;
                        super.b(var1_3.h, var1_3.i, (byte)2);
                    }
                    ** GOTO lbl417
lbl397:
                    // 1 sources

                    if (i.a(256)) {
                        var1_3.aD = -1;
                        var3_15 = i.a[0].d;
                        if (var3_15 == 36 + (var1_3.k & 7) - 1) {
                            if ((i.a[var1_3.h][var1_3.i] & 255) == 4) {
                                super.ar();
                            } else {
                                super.p(2);
                                super.g(19);
                            }
                        }
                        switch (var3_15) {
                            case 0: 
                            case 1: 
                            case 2: 
                            case 3: 
                            case 34: 
                            case 35: {
                                if ((i.a[var1_3.h][var1_3.i] & 255) == 4) {
                                    super.ar();
                                    break;
                                }
                                super.p(2);
                                super.g(19);
                            }
                        }
                    } else if (i.a(32944)) {
                        super.ag();
                        i.ah = 0;
                    }
lbl417:
                    // 11 sources

                    if (var1_3.a == 5 || var1_3.l != 0 || var1_3.m != 0 || var1_3.a == (var1_3.k & 7)) break;
                    var1_3.k |= 4096;
                    break;
                }
                case 10: {
                    break;
                }
                case 15: {
                    var1_3 = var2_1;
                    if (var1_3.dV != var1_3.dX || var1_3.dW != var1_3.dY) break;
                    var3_16 = -1;
                    if (i.a(4097)) {
                        var3_16 = 2;
                    } else if (i.a(262146)) {
                        var3_16 = 3;
                    } else if (i.a(16388)) {
                        var3_16 = 4;
                    } else if (i.a(65544)) {
                        var3_16 = 1;
                    } else {
                        if (i.a(32944)) {
                            if (System.currentTimeMillis() < 2000L) break;
                            var7_29 = i.a(i.a[var1_3.dV][var1_3.dW], (byte)6, (byte)5);
                            super.p();
                            super.aw();
                            System.gc();
                            var1_3.aB = var7_29;
                            super.l();
                            i.ah = 0;
                            break;
                        }
                        if (i.a(64)) {
                            var1_3.J = true;
                            var1_3.H = true;
                            var1_3.L = true;
                            var1_3.bs = 0;
                            i.b = (byte)28;
                            i.ah = 0;
                            break;
                        }
                    }
                    i.ah = 0;
                    if (var3_16 == -1) break;
                    var4_20 = var1_3.dV;
                    var5_24 = var1_3.dW;
                    var7_30 = i.a[var4_20][var5_24];
                    var9_38 = i.a(var7_30, (byte)11, (byte)3);
                    var6_39 = 14;
                    var10_43 = -1;
                    var12_46 = -1;
                    var13_49 = 0;
                    while (var13_49 < var9_38) {
                        var11_45 = i.a(var7_30, (byte)var6_39, (byte)4);
                        if (i.a(i.a[var11_45][var14_53 = i.a(var7_30, (byte)(var6_39 += 4), (byte)4)], (byte)0, (byte)3) == 1) ** GOTO lbl498
                        switch (var3_16) {
                            case 1: {
                                if (var11_45 <= var4_20) break;
                                if (var10_43 >= 0) {
                                    var12_46 = var13_49;
                                    break;
                                }
                                v11 = var13_49;
                                ** GOTO lbl497
                            }
                            case 4: {
                                if (var11_45 >= var4_20) break;
                                if (var10_43 >= 0) {
                                    var12_46 = var13_49;
                                    break;
                                }
                                v11 = var13_49;
                                ** GOTO lbl497
                            }
                            case 2: {
                                if (var14_53 >= var5_24) break;
                                if (var10_43 >= 0) {
                                    var12_46 = var13_49;
                                    break;
                                }
                                v11 = var13_49;
                                ** GOTO lbl497
                            }
                            case 3: {
                                if (var14_53 <= var5_24) break;
                                if (var10_43 >= 0) {
                                    var12_46 = var13_49;
                                    break;
                                }
                                v11 = var13_49;
lbl497:
                                // 4 sources

                                var10_43 = v11;
                            }
                        }
lbl498:
                        // 11 sources

                        ++var13_49;
                        var6_39 += 4;
                    }
                    if (var10_43 == -1) break;
                    var13_49 = -1;
                    if (var12_46 == -1) ** GOTO lbl528
                    var6_39 = 14 + (var10_43 << 1 << 2);
                    var11_45 = i.a(var7_30, (byte)var6_39, (byte)4);
                    var14_53 = i.a(var7_30, (byte)(var6_39 += 4), (byte)4);
                    var6_39 = 14 + (var12_46 << 1 << 2);
                    var15_51 = i.a(var7_30, (byte)var6_39, (byte)4);
                    var16_52 = i.a(var7_30, (byte)(var6_39 += 4), (byte)4);
                    switch (var3_16) {
                        case 1: 
                        case 4: {
                            if (var5_24 != var14_53) ** GOTO lbl515
                            v12 = var10_43;
                            ** GOTO lbl526
lbl515:
                            // 1 sources

                            if (var5_24 == var16_52) ** GOTO lbl-1000
                            v12 = Math.abs(var4_20 - var11_45) > Math.abs(var4_20 - var15_51) ? var10_43 : var12_46;
                            ** GOTO lbl526
                        }
                        case 2: 
                        case 3: {
                            if (var4_20 == var11_45) {
                                v12 = var10_43;
                            } else if (var4_20 != var15_51 && var11_45 > var15_51) {
                                v12 = var10_43;
                            } else lbl-1000:
                            // 2 sources

                            {
                                v12 = var12_46;
                            }
lbl526:
                            // 5 sources

                            var13_49 = v12;
                        }
                    }
                    ** GOTO lbl529
lbl528:
                    // 1 sources

                    var13_49 = var10_43;
lbl529:
                    // 2 sources

                    if (var13_49 == -1) break;
                    var6_39 = 14 + (var13_49 << 1 << 2);
                    var11_45 = i.a(var7_30, (byte)var6_39, (byte)4);
                    if (i.a(i.a[var11_45][var14_53 = i.a(var7_30, (byte)(var6_39 += 4), (byte)4)], (byte)0, (byte)3) != 0) break;
                    var1_3.dX = var11_45;
                    var1_3.dY = var14_53;
                    var1_3.aw = true;
                    break;
                }
                case 17: 
                case 20: {
                    if (!i.a(32944)) break;
                    if (var2_1.aR == 5) {
                        var1_3 = var2_1;
                        var1_3.ax();
                        super.c(false);
                        var2_1.p();
                    }
                    var2_1.u = true;
                    ** GOTO lbl591
                }
                case 27: {
                    i.m = i.b;
                    var2_1.T();
                    var1_3 = var2_1;
                    if (var1_3.D != -1 || var1_3.B != 0) {
                        i.ah = 0;
                        break;
                    }
                    if (!i.a(32944)) ** GOTO lbl557
                    v13 = var1_3;
                    v14 = 4;
                    ** GOTO lbl579
lbl557:
                    // 1 sources

                    if (!i.a(64)) ** GOTO lbl564
                    super.p();
                    i.b = (byte)9;
                    var1_3.br = 8;
                    super.a(-1);
                    var1_3.bs = 0;
                    ** GOTO lbl580
lbl564:
                    // 1 sources

                    if (!i.a(4097)) ** GOTO lbl568
                    v13 = var1_3;
                    v14 = 0;
                    ** GOTO lbl579
lbl568:
                    // 1 sources

                    if (!i.a(262146)) ** GOTO lbl572
                    v13 = var1_3;
                    v14 = 2;
                    ** GOTO lbl579
lbl572:
                    // 1 sources

                    if (!i.a(16388)) ** GOTO lbl576
                    v13 = var1_3;
                    v14 = 3;
                    ** GOTO lbl579
lbl576:
                    // 1 sources

                    if (!i.a(65544)) ** GOTO lbl580
                    v13 = var1_3;
                    v14 = 1;
lbl579:
                    // 5 sources

                    v13.u = v14;
lbl580:
                    // 3 sources

                    i.ah = 0;
                    break;
                }
                case 31: {
                    if (i.a(64)) {
                        var2_1.bs = 0;
                        var2_1.br = 8;
                        i.b = (byte)9;
                        var2_1.a(-1);
                    } else if (i.a(32944)) {
                        var2_1.S();
                    }
lbl591:
                    // 6 sources

                    v0 = i.ah = 0;
                }
            }
            if (!var2_1.d && (var2_1.k & 7) != 0) {
                var2_1.m = 10;
            }
        }
        switch (i.b) {
            case 22: {
                var2_1 = this;
                switch (var2_1.aR) {
                    case 0: {
                        var2_1.eo = 0;
                        var2_1.ep = 0;
                        var2_1.aR = 1;
                        return;
                    }
                    case 1: {
                        i.s = i.a("/cr.f", 0);
                        var1_4 = 0;
                        while (var1_4 < i.s.length) {
                            if (i.s[var1_4] == 92 && i.s[var1_4 + 1] == 110) {
                                i.s[var1_4++] = 10;
                                i.s[var1_4++] = 32;
                                continue;
                            }
                            ++var1_4;
                        }
                        var1_4 = 0;
                        while (i.s[var1_4] != 36) {
                            ++var1_4;
                        }
                        var3_17 = 0;
                        while (var3_17 < GloftDIRU.a.length) {
                            i.s[var1_4] = GloftDIRU.a[var3_17];
                            ++var3_17;
                            ++var1_4;
                        }
                        var2_1.aR = 2;
                        return;
                    }
                    case 2: {
                        if (!i.a(4097)) ** GOTO lbl634
                        if (var2_1.eo < 180) ** GOTO lbl-1000
                        var2_1.eo -= 3;
                        if (var2_1.eo >= 180) ** GOTO lbl655
                        v15 = var2_1;
                        v16 = 180;
                        ** GOTO lbl654
lbl634:
                        // 1 sources

                        if (!i.a(262146)) ** GOTO lbl640
                        v17 = var2_1;
                        v15 = v17;
                        v18 = v17.eo;
                        v19 = 3;
                        ** GOTO lbl653
lbl640:
                        // 1 sources

                        if (i.a(64)) {
                            if (var2_1.i) {
                                var2_1.bs = 0;
                                var2_1.br = 8;
                                i.b = (byte)9;
                                var2_1.i = false;
                            } else {
                                var2_1.aR = 3;
                            }
                        } else lbl-1000:
                        // 2 sources

                        {
                            v20 = var2_1;
                            v15 = v20;
                            v18 = v20.eo;
                            v19 = 1;
lbl653:
                            // 2 sources

                            v16 = v18 + v19;
lbl654:
                            // 2 sources

                            v15.eo = v16;
                        }
lbl655:
                        // 4 sources

                        var3_18 = -var2_1.eo;
                        for (var1_5 = 0; var1_5 < i.s.length && var3_18 <= -272; ++var1_5) {
                            if (i.s[var1_5] != 10) continue;
                            var3_18 += 17;
                        }
                        var2_1.ep = var1_5;
                        if (var2_1.ep < i.s.length) break;
                        var2_1.ep = 0;
                        var2_1.eo = 0;
                        return;
                    }
                    case 3: {
                        i.s = null;
                        System.gc();
                        i.b = (byte)4;
                        var2_1.aR = 2;
                        var2_1.a(0);
                        var2_1.a.b(19);
                    }
                }
                return;
            }
            case 21: {
                var1_6 = this.bs++;
                var2_1 = this;
                try {
                    switch (var1_6) {
                        case 0: {
                            if (var2_1.I) {
                                var2_1.s();
                            }
                            break;
                        }
                        case 1: {
                            if (var2_1.J) {
                                var2_1.p();
                            }
                            break;
                        }
                        case 2: {
                            if (var2_1.G) {
                                var4_21 = var2_1;
                                var2_1.G = false;
                                i.a(i.a[17], true);
                                i.a[17] = null;
                                i.a(i.a[10], true);
                                i.a[10] = null;
                                i.a(i.a[46], true);
                                i.a[46] = null;
                                i.a(i.a[55], true);
                                i.a[55] = null;
                                i.b[8] = null;
                                i.a(i.a[59], true);
                                i.b[3] = null;
                                i.a(i.a[17], true);
                                i.a[17] = null;
                                System.gc();
                            }
                            break;
                        }
                        case 3: {
                            if (var2_1.H) {
                                var2_1.aw();
                            }
                            break;
                        }
                        case 4: {
                            h.a(0xFFFFFF);
                            i.c.delete(0, i.c.length());
                            switch (var2_1.aA) {
                                case 0: {
                                    i.c.append("/map_angkor.out");
                                    break;
                                }
                                case 1: {
                                    i.c.append("/map_scotland.out");
                                    break;
                                }
                                case 2: {
                                    i.c.append("/map_tibet.out");
                                }
                            }
                            i.a = new long[12][12];
                            var2_1.c = new int[20];
                            var2_1.a(i.c.toString());
                            break;
                        }
                        case 5: {
                            i.a[17] = i.a("/ms.f", 0);
                            i.a[23] = i.a("/ms.f", 1);
                            break;
                        }
                        case 6: {
                            switch (var2_1.aA) {
                                case 0: {
                                    v21 = i.a;
                                    v22 = 24;
                                    v23 = "/ms.f";
                                    v24 = 2;
                                    ** GOTO lbl756
                                }
                                case 1: {
                                    v21 = i.a;
                                    v22 = 25;
                                    v23 = "/ms.f";
                                    v24 = 3;
                                    ** GOTO lbl756
                                }
                                case 2: {
                                    v21 = i.a;
                                    v22 = 26;
                                    v23 = "/ms.f";
                                    v24 = 4;
lbl756:
                                    // 3 sources

                                    v21[v22] = i.a(v23, v24);
                                }
                            }
                            break;
                        }
                        case 7: {
                            if (i.a[54] == null) {
                                i.a[54] = i.a("/mmv.f", 1);
                            }
                            var2_1.G = i.c(i.a[54], 0) >> 1;
                            var2_1.H = i.b(i.a[54], 0) >> 1;
                            break;
                        }
                        case 8: {
                            if (i.a[53] == null) {
                                i.a[53] = i.a("/mmv.f", 2);
                            }
                            break;
                        }
                        case 9: {
                            if (i.a[52] == null) {
                                i.a[52] = i.a("/mmv.f", 3);
                            }
                            break;
                        }
                        case 10: {
                            if (var2_1.ac) {
                                var4_22 = var2_1;
                                var2_1.el = 0;
                                var4_22.ei = 0;
                                var4_22.ej = 0;
                                var4_22.ar = false;
                                var4_22.aq = true;
                                var4_22.ap = false;
                                var4_22.ek = 2;
                                var4_22.em = 2;
                                var4_22.as = false;
                            }
                            break;
                        }
                        case 14: {
                            if (var2_1.C) {
                                var2_1.C = false;
                            }
                            var4_23 = var2_1;
                            var2_1.dV = -1;
                            if (!var4_23.ac) {
                                var4_23.aB = i.dZ;
                            }
                            var4_23.ac = false;
                            for (var5_24 = 0; var5_24 < 12; ++var5_24) {
                                for (var7_32 = 0; var7_32 < 12; ++var7_32) {
                                    var8_37 = i.a[var5_24][var7_32];
                                    if (var8_37 == 0L) continue;
                                    var6_39 = i.a(var8_37, (byte)6, (byte)5);
                                    if ((var4_23.a(var4_23.aA, var6_39) & 64) != 0 || var6_39 == 0) {
                                        v25 = var5_24;
                                        v26 = var7_32;
                                        v27 = 0;
                                    } else {
                                        v25 = var5_24;
                                        v26 = var7_32;
                                        v27 = 1;
                                    }
                                    i.a(v25, v26, v27, (byte)0, (byte)3);
                                    if (var6_39 == var4_23.aB) {
                                        var4_23.dV = var5_24;
                                        var4_23.dW = var7_32;
                                    }
                                    if (var6_39 == i.dZ) {
                                        var4_23.dX = var5_24;
                                        var4_23.dY = var7_32;
                                    }
                                    var4_23.ao = false;
                                }
                            }
                            i.b = (byte)15;
                        }
                    }
                }
                catch (Exception v28) {}
                this.e();
                return;
            }
            case 20: {
                if (i.aS <= 30) break;
                this.C = true;
                this.J = true;
                this.H = true;
                this.ax();
                return;
            }
            case 35: {
                var1_7 = this.bs++;
                var2_1 = this;
                switch (var1_7) {
                    case 0: {
                        i.de = 0;
                        i.df = 0;
                        i.dg = 0;
                        var2_1.t = var2_1.a(var2_1.aA, var2_1.aB);
                        var2_1.u = 0;
                        break;
                    }
                    case 1: {
                        i.de = i.a(i.i, 4);
                        i.de += var2_1.aZ;
                        var2_1.u = false;
                        break;
                    }
                    case 2: {
                        i.i[4] = (byte)i.de;
                        i.i[5] = (byte)(i.de >> 8);
                        break;
                    }
                    case 3: {
                        i.df = i.a(i.i, 6);
                        i.df += var2_1.bb;
                        break;
                    }
                    case 4: {
                        i.i[6] = (byte)i.df;
                        i.i[7] = (byte)(i.df >> 8);
                        break;
                    }
                    case 5: {
                        i.dg = i.i[2];
                        var2_1.U = 0;
                        if ((i.dg & 8) == 0 && i.df >= a.b[1]) {
                            var2_1.U = 1;
                            break;
                        }
                        if ((i.dg & 16) != 0 || i.df < a.b[2]) break;
                        var2_1.U = 2;
                        break;
                    }
                    case 6: {
                        try {
                            var7_33 = 4;
                            var5_25 = "/ui.f";
                            i.b[28] = i.a("/ui.f", 4, 0);
                        }
                        catch (Exception v29) {}
                        break;
                    }
                    case 7: {
                        var2_1.a(var2_1.aA, var2_1.aB, (byte)2);
                        var2_1.V = 0;
                        break;
                    }
                    case 8: {
                        for (var4_20 = var3_19 = (i.dg & 224) >> 5; var4_20 < 4 && i.de >= a.a[var4_20]; ++var4_20) {
                        }
                        if (var3_19 < var4_20) {
                            i.i[2] = (byte)(i.i[2] & -225);
                            i.i[2] = (byte)(i.i[2] | var4_20 << 5 & 224);
                            var2_1.u();
                            var2_1.V = var4_20;
                        }
                    }
                    case 9: {
                        var2_1.Y();
                        break;
                    }
                    case 10: {
                        var2_1.e();
                        System.gc();
                        break;
                    }
                    case 11: {
                        if (var2_1.az < 99 && var2_1.aZ == var2_1.aY && (var2_1.t & 4) == 0) {
                            var2_1.a(var2_1.aA, var2_1.aB, (byte)4);
                            var2_1.u = (byte)(var2_1.u | 4);
                            ++var2_1.az;
                        }
                        if (var2_1.az < 99 && var2_1.bb == var2_1.ba && (var2_1.t & 8) == 0) {
                            var2_1.a(var2_1.aA, var2_1.aB, (byte)8);
                            var2_1.u = (byte)(var2_1.u | 8);
                            ++var2_1.az;
                        }
                        if (var2_1.az < 99 && var2_1.bc == 0 && (var2_1.t & 16) == 0) {
                            var2_1.a(var2_1.aA, var2_1.aB, (byte)16);
                            var2_1.u = (byte)(var2_1.u | 16);
                            ++var2_1.az;
                        }
                        if (var2_1.az < 99 && var2_1.bd == 0 && (var2_1.t & 32) == 0) {
                            var2_1.a(var2_1.aA, var2_1.aB, (byte)32);
                            var2_1.u = (byte)(var2_1.u | 32);
                            ++var2_1.az;
                        }
                        var5_26 = var2_1;
                        var9_38 = var5_26.aB;
                        for (var6_39 = 0; var6_39 < 12; ++var6_39) {
                            for (var10_44 = 0; var10_44 < 12; ++var10_44) {
                                var12_48 = i.a[var6_39][var10_44];
                                if (var12_48 == 0L || i.a(var12_48, (byte)6, (byte)5) != var9_38) continue;
                                v30 = var12_48;
                                ** GOTO lbl922
                            }
                        }
                        v30 = var7_34 = -1L;
lbl922:
                        // 2 sources

                        if ((var5_26.aB == 0 || i.a(var7_34, (byte)11, (byte)3) > 1) && var7_34 >= 0L && (var5_26.a(var5_26.aA, var5_26.aB + 1) & 64) == 0) {
                            i.dZ = var5_26.aB + 1;
                            var5_26.a(var5_26.aA, i.dZ, (byte)64);
                            var5_26.ac = true;
                        } else {
                            i.dZ = var5_26.aB;
                        }
                        var5_26.c(false);
                        var2_1.s();
                        var2_1.I = false;
                        var2_1.H = true;
                    }
                }
                this.e();
                if (this.bs != 12) break;
                i.b = (byte)17;
                this.aR = 0;
                this.p(15);
                return;
            }
            case 17: {
                var2_1 = this;
                switch (var2_1.aR) {
                    case 0: {
                        if (i.aS <= 40 && !var2_1.u) break;
                        ++var2_1.aR;
                        var2_1.e();
                        return;
                    }
                    case 1: {
                        if ((i.aS <= var2_1.aZ << 1 || i.aS <= 40) && !var2_1.u) break;
                        ++var2_1.aR;
                        var2_1.e();
                        return;
                    }
                    case 2: {
                        if (i.aS <= 40 && !var2_1.u) break;
                        ++var2_1.aR;
                        var2_1.e();
                        return;
                    }
                    case 3: {
                        if (i.aS <= 10 && !var2_1.u) break;
                        ++var2_1.aR;
                        var2_1.e();
                        return;
                    }
                    case 4: {
                        if (i.aS <= 10 && !var2_1.u) break;
                        ++var2_1.aR;
                        var2_1.e();
                        var2_1.u = false;
                    }
                }
                return;
            }
            case 31: {
                return;
            }
            case 16: {
                this.D = true;
                this.l();
                i.ah = 0;
                return;
            }
            case 0: {
                i.a[0] = new b(i.a("/ui.f", 0), 0, 0, null);
                i.a[0].a(0);
                i.b = (byte)6;
                this.e();
                return;
            }
            case 6: {
                if (i.aS < 60) {
                    i.a[0].b();
                    return;
                }
                i.a = i.a(127);
                i.b = i.a();
                i.c = i.b();
                try {
                    i.b = d.a(127).trim().equals("1");
                }
                catch (Exception v31) {
                    v31.printStackTrace();
                    i.b = false;
                }
                i.aC();
                i.a[18] = i.a("/ui.f", 3);
                this.p();
                j.a = true;
                i.b = (byte)8;
                this.bs = 0;
                this.br = 32;
                return;
            }
            case 7: {
                if (!this.z) break;
                i.b = (byte)8;
                this.bs = 0;
                this.br = 32;
                return;
            }
            case 1: {
                this.W();
                return;
            }
            case 3: {
                this.B = true;
                return;
            }
            case 9: {
                try {
                    this.t();
                    var1_8 = this.br == 8 ? this.bs : this.bs - 24;
                    var2_2 = var1_8;
                    switch (var1_8) {
                        case 0: {
                            i.aC();
                            System.gc();
                            break;
                        }
                        case 1: {
                            break;
                        }
                        case 2: {
                            break;
                        }
                        case 3: {
                            break;
                        }
                        case 4: {
                            break;
                        }
                        case 5: {
                            break;
                        }
                        case 6: {
                            if (i.a == null) {
                                i.a = i.a("/spl.f", 0);
                            }
                            if (i.b == null) {
                                i.b = i.a("/spl.f", 1);
                            }
                            if (i.c != null) break;
                            i.c = i.a("/spl.f", 2);
                            break;
                        }
                        case 7: {
                            if (i.a[18] != null) break;
                            i.a[18] = i.a("/ui.f", 3);
                        }
                    }
                    ++this.bs;
                    this.Y = true;
                    if (++var1_8 == 8) {
                        if (this.F) {
                            i.b = (byte)4;
                            if (this.bo == -1) {
                                this.aR = 0;
                                this.a(0);
                            } else {
                                this.aR = 2;
                            }
                        } else {
                            i.b = (byte)30;
                            this.F = true;
                        }
                        this.a.b(19);
                    }
                }
                catch (Exception v32) {}
                this.e();
                return;
            }
            case 11: {
                this.J = true;
                this.H = true;
                i.b = (byte)5;
                this.R = true;
                this.e();
                return;
            }
            case 5: {
                if (this.D && this.bs <= 5) {
                    this.e(this.bs++);
                    for (var1_9 = 0; var1_9 < 3; ++var1_9) {
                        i.b[var1_9] = false;
                    }
                    for (var1_9 = 1; var1_9 < 3; ++var1_9) {
                        i.a[var1_9] = false;
                    }
                    this.e();
                    if (this.bs == 5) {
                        this.N = true;
                        this.M = true;
                        this.L = true;
                        this.aA = 0;
                        this.aB = 13;
                        i.ah = 0;
                    }
                } else {
                    this.j();
                }
                this.e();
                return;
            }
            case 8: {
                var1_10 = this.bs++;
                var2_1 = this;
                if (var1_10 < 21) {
                    if (var1_10 == 0) {
                        var2_1.a.b();
                    }
                    var2_1.a.a(var1_10);
                    if (var1_10 == 20) {
                        var2_1.a.c();
                    }
                    System.gc();
                } else {
                    switch (var1_10) {
                        case 21: {
                            i.a[9] = i.a("/cm.f", 7);
                            break;
                        }
                        case 22: {
                            i.a[0] = i.a("/ui.f", 2);
                            break;
                        }
                        case 23: {
                            i.a[0] = i.a("/demoui.f", 0, 0);
                            i.a[1] = i.a("/demoui.f", 0, 1);
                            break;
                        }
                        case 24: {
                            var2_1.a.a();
                            i.b = (byte)9;
                            var2_1.a(-1);
                            i.a = new StringBuffer(i.c[0]);
                            i.a.delete(i.a.length() - 1, i.a.length());
                            i.b = new StringBuffer(i.c[11]);
                            i.b.delete(i.b.length() - 1, i.b.length());
                            i.c = new StringBuffer("1");
                        }
                    }
                }
                this.e();
                return;
            }
            case 2: 
            case 12: {
                return;
            }
            case 15: {
                var2_1 = this;
                if (var2_1.U <= 0 && var2_1.V <= 0) ** GOTO lbl1163
                var1_3 = new StringBuffer();
                if (var2_1.U <= 0) ** GOTO lbl1154
                var1_3.append(i.a[124]).append("\n");
                switch (var2_1.U) {
                    case 1: {
                        var1_3.append(i.a[4]);
                        v33 = 2;
                        v34 = i.i;
                        v35 = i.i[2];
                        v36 = 8;
                        ** GOTO lbl1151
                    }
                    case 2: {
                        var1_3.append(i.a[64]);
                        i.i[2] = (byte)(i.i[2] | 8);
                        v33 = 2;
                        v34 = i.i;
                        v35 = i.i[2];
                        v36 = 16;
lbl1151:
                        // 2 sources

                        v34[v33] = (byte)(v35 | v36);
                    }
                }
                var2_1.u();
                var2_1.U = 0;
lbl1154:
                // 2 sources

                if (var2_1.V > 0) {
                    if (var1_3.length() > 0) {
                        var1_3.append("\n\n");
                    }
                    var1_3.append(i.a[33]).append("\n").append(i.a[120 + var2_1.V - 1]);
                    var2_1.V = 0;
                }
                if (var1_3.length() > 0) {
                    var2_1.a(var1_3.toString(), -1, -1, 5000, 4273165, 0);
                }
lbl1163:
                // 4 sources

                return;
            }
            case 27: {
                this.i();
                return;
            }
            case 28: {
                try {
                    this.b(this.bs);
                    ++this.bs;
                    if (this.bs == 11) {
                        i.b = (byte)27;
                    }
                }
                catch (Exception v37) {}
                this.e();
                return;
            }
            case 29: {
                this.g();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void g() {
        switch (this.W) {
            case 0: {
                if (System.currentTimeMillis() - this.a < 3000L) break;
                ++this.W;
                this.e();
                return;
            }
            case 1: {
                if (i.aS % 6 >= 3) {
                    this.X += 0x199999;
                    v0 = this;
                    v1 = false;
                } else {
                    v0 = this;
                    v1 = v0.av = true;
                }
                if (System.currentTimeMillis() - this.a < 5000L) break;
                ++this.W;
                this.av = true;
                this.e();
                return;
            }
            case 2: {
                var1_1 = this;
                if (var1_1.Z < var1_1.f) ** GOTO lbl26
                v2 = var1_1;
                v3 = -1;
                ** GOTO lbl29
lbl26:
                // 1 sources

                if (var1_1.Z > -var1_1.f) ** GOTO lbl30
                v2 = var1_1;
                v3 = 1;
lbl29:
                // 2 sources

                v2.d = (byte)v3;
lbl30:
                // 2 sources

                var1_1.Z += var1_1.d * var1_1.h;
                if (var1_1.Y < var1_1.g) ** GOTO lbl35
                v4 = var1_1;
                v5 = -1;
                ** GOTO lbl38
lbl35:
                // 1 sources

                if (var1_1.Z > -var1_1.g) ** GOTO lbl39
                v4 = var1_1;
                v5 = 1;
lbl38:
                // 2 sources

                v4.e = (byte)v5;
lbl39:
                // 2 sources

                var1_1.e;
                var1_1.Y += 0;
                if (System.currentTimeMillis() - this.a < 10000L) break;
                this.Y = 0;
                this.Z = 0;
                this.e();
                ++this.W;
                return;
            }
            case 3: {
                if (System.currentTimeMillis() - this.a < 1000L) break;
                ++this.W;
                return;
            }
            case 4: {
                if (System.currentTimeMillis() - this.a < 1000L) break;
                ++this.W;
                return;
            }
            case 5: {
                if (System.currentTimeMillis() - this.a < 1000L) break;
                ++this.W;
                return;
            }
            case 6: {
                if (System.currentTimeMillis() - this.a < 1000L) break;
                ++this.W;
                this.e();
                return;
            }
            case 7: {
                if (System.currentTimeMillis() - this.a < 1000L) break;
                g.a = new byte[15][10];
                ++this.W;
                g.b(3);
                this.a.b(19);
                this.e();
                return;
            }
            case 8: {
                g.a(3);
                this.av = true;
                if (System.currentTimeMillis() - this.a < 15000L) break;
                ++this.W;
                this.e();
                return;
            }
            case 9: {
                this.av = true;
                g.a(3);
                if (System.currentTimeMillis() - this.a < 12000L) break;
                ++this.W;
                this.e();
                return;
            }
            case 10: {
                this.p();
                this.a(0);
                i.b = (byte)22;
                this.aR = 0;
                this.a.e();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void b(int var1_1) {
        switch (var1_1) {
            case 0: {
                if (!this.K) break;
                this.o();
                return;
            }
            case 1: {
                if (!this.H) break;
                this.aw();
                return;
            }
            case 2: {
                if (!this.M) break;
                this.x();
                return;
            }
            case 3: {
                if (!this.L) break;
                System.gc();
                this.L = false;
                return;
            }
            case 4: {
                this.p();
                if (i.a[10] == null) {
                    var2_31 = 0;
                    var1_2 = "/mmv.f";
                    var1_3 = false;
                    var1_4 = "/mmv.f";
                    i.a[10] = i.a("/mmv.f", var2_31, 0, 0);
                }
                if (i.a[46] == null) {
                    var2_31 = 5;
                    var1_5 = "/mmv.f";
                    var1_6 = false;
                    var1_7 = "/mmv.f";
                    i.a[46] = i.a("/mmv.f", var2_31, 0, 0);
                }
                this.z = 320 - i.c(i.a[10], 0) >> 1;
                this.A = (240 - i.b(i.a[10], 0) - 48 >> 1) - 20;
                return;
            }
            case 5: {
                if (i.a[55] == null) {
                    var2_32 = 4;
                    var1_8 = "/mmv.f";
                    var1_9 = false;
                    var1_10 = "/mmv.f";
                    i.a[55] = i.a("/mmv.f", var2_32, 0, 0);
                    this.x = i.a(i.a[55], 0);
                    i.b = i.a[55];
                }
                if (i.a[18] != null) break;
                var2_32 = 3;
                var1_11 = "/ui.f";
                var1_12 = false;
                var1_13 = "/ui.f";
                i.a[18] = i.a("/ui.f", var2_32, 0, 0);
                return;
            }
            case 6: {
                if (i.a[54] == null) {
                    var2_33 = 1;
                    var1_14 = "/mmv.f";
                    var1_15 = false;
                    var1_16 = "/mmv.f";
                    i.a[54] = i.a("/mmv.f", var2_33, 0, 0);
                }
                this.G = i.c(i.a[54], 0) >> 1;
                this.H = (i.b(i.a[54], 0) >> 1) - 20;
                return;
            }
            case 7: {
                if (i.a[53] != null) break;
                var2_34 = 2;
                var1_17 = "/mmv.f";
                var1_18 = false;
                var1_19 = "/mmv.f";
                i.a[53] = i.a("/mmv.f", var2_34, 0, 0);
                return;
            }
            case 8: {
                if (i.a[52] != null) break;
                var2_35 = 3;
                var1_20 = "/mmv.f";
                var1_21 = false;
                var1_22 = "/mmv.f";
                i.a[52] = i.a("/mmv.f", var2_35, 0, 0);
                return;
            }
            case 9: {
                try {
                    var1_1 = 0;
                    var2_36 = 3;
                    var1_23 = "/" + 0 + ".f";
                    var1_23 = i.a((String)var1_23, var2_36, 0, 0);
                    i.b[8] = var1_23.a[0];
                    var1_24 = false;
                    var2_36 = 2;
                    var1_25 = "/cm.f";
                    var1_25 = i.a("/cm.f", var2_36, 0, 0);
                    var1_25.a(0, 0, -1, -1);
                    var1_25.a(1, 0, 0, -1);
                    i.a[59] = var1_25;
                    g.a = var1_25.a[0].length;
                    var1_25.d = null;
                    if (i.a[17] == null) {
                        var2_36 = 0;
                        var1_25 = "/ms.f";
                        var1_26 = false;
                        var1_27 = "/ms.f";
                        i.a[17] = i.a("/ms.f", var2_36, 0, 0);
                    }
                    return;
                }
                catch (Exception v0) {
                    return;
                }
            }
            case 10: {
                if (i.a[9] == null) {
                    var2_37 = 7;
                    var1_28 = "/cm.f";
                    var1_29 = false;
                    var1_30 = "/cm.f";
                    i.a[9] = i.a("/cm.f", var2_37, 0, 0);
                }
                this.J = i.a(i.a[9], 5);
                var1_1 = i.i[2];
                for (var2_37 = 0; var2_37 < 3; ++var2_37) {
                    if ((var1_1 & 1 << var2_37) == 0) continue;
                    i.b[var2_37] = true;
                }
                this.E = 10;
                this.F = 10;
                var1_1 = i.i[1];
                if ((var1_1 & 1) != 0) {
                    v1 = i.a;
                    v2 = 1;
                    v3 = true;
                } else if (i.a(i.i, 6) >= a.b[1]) {
                    i.i[1] = (byte)(i.i[1] | 1);
                    this.u();
                    this.B = 1;
                    this.p = 1;
                } else {
                    v1 = i.a;
                    v2 = 1;
                    v3 = v1[v2] = false;
                }
                if ((var1_1 & 2) == 0) ** GOTO lbl138
                v4 = i.a;
                v5 = 2;
                v6 = true;
                ** GOTO lbl147
lbl138:
                // 1 sources

                if (i.a(i.i, 6) >= a.b[2]) {
                    i.i[1] = (byte)(i.i[1] | 2);
                    this.u();
                    this.B = 2;
                    this.p = 2;
                } else {
                    v4 = i.a;
                    v5 = 2;
                    v6 = false;
lbl147:
                    // 2 sources

                    v4[v5] = v6;
                }
                this.q = a.d[this.p << 1];
                this.r = a.d[(this.p << 1) + 1] - 20;
                this.s = this.q;
                this.t = this.r;
                this.h();
                this.g = true;
                this.av = true;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void h() {
        if (this.p == 3) {
            v0 = this;
            v1 = new StringBuffer();
            v2 = i.a[45];
        } else if (i.b(this.p)) {
            v0 = this;
            v1 = new StringBuffer();
            v2 = i.a[45];
        } else {
            v0 = this;
            v1 = new StringBuffer().append(a.b[this.p]).append(" ");
            v2 = i.a[48].toLowerCase();
        }
        v0.b = v1.append(v2).append(" ").append(i.a[77]).toString();
        switch (this.p) {
            case 0: {
                v3 = this;
                v4 = i.a;
                v5 = 1;
                ** GOTO lbl35
            }
            case 1: {
                v3 = this;
                v4 = i.a;
                v5 = 4;
                ** GOTO lbl35
            }
            case 2: {
                v3 = this;
                v4 = i.a;
                v5 = 64;
                ** GOTO lbl35
            }
            case 3: {
                v3 = this;
                v4 = i.a;
                v5 = 63;
lbl35:
                // 4 sources

                v3.c = v4[v5];
            }
        }
    }

    private static boolean b(int n) {
        if (n == 0 || n == 3) {
            return true;
        }
        return i.a(i, 6) >= a.b[n];
    }

    private void i() {
        if (!this.v) {
            this.s = this.q;
            this.t = this.r;
        }
        if (this.f) {
            ah = 0;
            int n = this.v - this.q;
            int n2 = this.w - this.r;
            this.q += n / (8 - this.c);
            this.r += n2 / (8 - this.c);
            this.c = (byte)(this.c + 1);
            if (this.c == 8) {
                this.q = this.v;
                this.r = this.w;
                this.f = false;
                this.c = 0;
                this.g = true;
                this.h();
                return;
            }
        } else {
            switch (this.u) {
                case -1: {
                    break;
                }
                case 4: {
                    switch (this.p) {
                        case 0: {
                            this.G = true;
                            this.H = true;
                            this.a.e();
                            this.aA = 0;
                            this.l = false;
                            b = (byte)15;
                            dZ = i.b(this.aA);
                            this.ax();
                            break;
                        }
                        case 1: {
                            if (!i.b(this.p)) break;
                            this.G = true;
                            this.H = true;
                            this.a.e();
                            this.aA = 1;
                            this.aB = 0;
                            b = (byte)15;
                            dZ = i.b(this.aA);
                            this.ax();
                            this.p = true;
                            this.l = false;
                            if (i[9] >= 1) break;
                            i.i[9] = 1;
                            break;
                        }
                        case 2: {
                            if (!i.b(this.p)) break;
                            this.G = true;
                            this.H = true;
                            this.a.e();
                            this.aA = 2;
                            this.aB = 0;
                            this.l = false;
                            b = (byte)15;
                            dZ = i.b(this.aA);
                            this.ax();
                            this.p = true;
                            if (i[9] >= 2) break;
                            i.i[9] = 2;
                            break;
                        }
                        case 3: {
                            b = (byte)18;
                        }
                    }
                    break;
                }
                default: {
                    int n = a.a[this.u][this.p];
                    if (n == -1) break;
                    this.p = n;
                    this.f = true;
                    this.v = a.d[this.p << 1];
                    this.w = a.d[(this.p << 1) + 1] - 20;
                }
            }
            this.u = -1;
        }
    }

    private static String[] a(int n) {
        String[] stringArray = new String[128];
        for (int k = 0; k <= 127; ++k) {
            try {
                stringArray[k] = d.a(k);
                continue;
            }
            catch (Exception exception) {
                stringArray[k] = "E";
            }
        }
        return stringArray;
    }

    private static String[] a() {
        String[] stringArray = new String[39];
        for (int k = 0; k < 39; ++k) {
            try {
                switch (k) {
                    case 0: {
                        stringArray[k] = d.a(79);
                        break;
                    }
                    case 1: {
                        stringArray[k] = d.a(80);
                        break;
                    }
                    case 2: {
                        stringArray[k] = d.a(91);
                        break;
                    }
                    case 3: {
                        stringArray[k] = d.a(102);
                        break;
                    }
                    case 4: {
                        stringArray[k] = d.a(112);
                        break;
                    }
                    case 5: {
                        stringArray[k] = d.a(113);
                        break;
                    }
                    case 6: {
                        stringArray[k] = d.a(114);
                        break;
                    }
                    case 7: {
                        stringArray[k] = d.a(115);
                        break;
                    }
                    case 8: {
                        stringArray[k] = d.a(116);
                        break;
                    }
                    case 9: {
                        stringArray[k] = d.a(117);
                        break;
                    }
                    case 10: {
                        stringArray[k] = d.a(81);
                        break;
                    }
                    case 11: {
                        stringArray[k] = d.a(82);
                        break;
                    }
                    case 12: {
                        stringArray[k] = d.a(83);
                        break;
                    }
                    case 13: {
                        stringArray[k] = d.a(84);
                        break;
                    }
                    case 14: {
                        stringArray[k] = d.a(85);
                        break;
                    }
                    case 15: {
                        stringArray[k] = d.a(86);
                        break;
                    }
                    case 16: {
                        stringArray[k] = d.a(87);
                        break;
                    }
                    case 17: {
                        stringArray[k] = d.a(88);
                        break;
                    }
                    case 18: {
                        stringArray[k] = d.a(89);
                        break;
                    }
                    case 19: {
                        stringArray[k] = d.a(90);
                        break;
                    }
                    case 20: {
                        stringArray[k] = d.a(92);
                        break;
                    }
                    case 21: {
                        stringArray[k] = d.a(93);
                        break;
                    }
                    case 22: {
                        stringArray[k] = d.a(94);
                        break;
                    }
                    case 23: {
                        stringArray[k] = d.a(95);
                        break;
                    }
                    case 24: {
                        stringArray[k] = d.a(96);
                        break;
                    }
                    case 25: {
                        stringArray[k] = d.a(97);
                        break;
                    }
                    case 26: {
                        stringArray[k] = d.a(98);
                        break;
                    }
                    case 27: {
                        stringArray[k] = d.a(99);
                        break;
                    }
                    case 28: {
                        stringArray[k] = d.a(100);
                        break;
                    }
                    case 29: {
                        stringArray[k] = d.a(101);
                        break;
                    }
                    case 30: {
                        stringArray[k] = d.a(103);
                        break;
                    }
                    case 31: {
                        stringArray[k] = d.a(104);
                        break;
                    }
                    case 32: {
                        stringArray[k] = d.a(105);
                        break;
                    }
                    case 33: {
                        stringArray[k] = d.a(106);
                        break;
                    }
                    case 34: {
                        stringArray[k] = d.a(107);
                        break;
                    }
                    case 35: {
                        stringArray[k] = d.a(108);
                        break;
                    }
                    case 36: {
                        stringArray[k] = d.a(109);
                        break;
                    }
                    case 37: {
                        stringArray[k] = d.a(110);
                        break;
                    }
                    case 38: {
                        stringArray[k] = d.a(111);
                    }
                }
                continue;
            }
            catch (Exception exception) {
                stringArray[k] = "E";
            }
        }
        return stringArray;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void j() {
        block279: {
            block278: {
                block277: {
                    try {
                        var1_3 = this.bs;
                        if (this.D) {
                            var1_3 -= 5;
                        }
                        ++this.bs;
                        switch (var1_3) {
                            case 0: {
                                if (!this.N) return;
                                this.u();
                                return;
                            }
                            case 1: {
                                if (!this.M) return;
                                this.x();
                                return;
                            }
                            case 2: {
                                if (!this.L) return;
                                System.gc();
                                this.L = false;
                                return;
                            }
                            case 3: {
                                h.a();
                                h.a();
                                return;
                            }
                            case 4: {
                                if (!this.J) return;
                                this.p();
                                return;
                            }
                            case 5: {
                                if (!this.H) return;
                                this.aw();
                                return;
                            }
                            case 6: {
                                var1_3 = i.i[12];
                                if (var1_3 >= 1) ** GOTO lbl38
                                v0 = this;
                                v1 = var1_3;
                                ** GOTO lbl41
lbl38:
                                // 1 sources

                                if ((this.ag + 8) % 8 >= 1) ** GOTO lbl42
                                v0 = this;
                                v1 = 1;
lbl41:
                                // 2 sources

                                v0.ag = v1;
lbl42:
                                // 2 sources

                                i.o(this.ag % 8);
                                return;
                            }
                            case 7: {
                                var2_6 = this;
                                this.ba = var2_6.c(var2_6.aA, var2_6.aB);
                                return;
                            }
                            case 8: {
                                i.cC = 360;
                                i.cD = 216;
                                i.d = Image.createImage(i.cC, i.cD);
                                i.b = i.d.getGraphics();
                                var2_7 = this;
                                i.cE = -1;
                                i.a = false;
                                var2_7.e = true;
                                var2_7.aC = 0;
                                var2_7.bj = 0;
                                var2_7.c = 0L;
                                var2_7.d = 0L;
                                var2_7.ab = 0;
                                var2_7.ac = 0;
                                var2_7.k = 0;
                                var2_7.P = (super.a(var2_7.aA, var2_7.aB) & 2) != 0;
                                var2_7.cl = 0;
                                switch (var2_7.aA) {
                                    case 0: {
                                        if (var2_7.aB == 5) {
                                            var2_7.k = 1;
                                            var2_7.al = 816;
                                            var2_7.am = 0;
                                            break;
                                        }
                                        if (var2_7.aB == 13) {
                                            var2_7.k = (byte)2;
                                            var2_7.t = false;
                                            break;
                                        }
                                        if (var2_7.aB != 8) break;
                                        var2_7.k = (byte)4;
                                        var2_7.ao = 0;
                                        var2_7.aq = 3;
                                        var2_7.ar = 0;
                                        var2_7.ap = 0;
                                        var2_7.k = false;
                                        var2_7.c |= 8L;
                                        var2_7.c |= 1024L;
                                        var2_7.O = 2;
                                        var2_7.P = 12;
                                        var2_7.Q = 15;
                                        var2_7.R = 5;
                                        break;
                                    }
                                    case 1: {
                                        if (var2_7.aB != 9) break;
                                        super.y();
                                        break;
                                    }
                                    case 2: {
                                        if (var2_7.aB != 10) break;
                                        super.af();
                                        var2_7.as = 360;
                                        var2_7.k = (byte)3;
                                        var2_7.c |= 128L;
                                        var2_7.c |= 8L;
                                        break;
                                    }
                                }
                                var2_7.q = false;
                                var2_7.r = false;
                                var2_7.s = false;
                                var2_7.aa = 0;
                                var2_7.be = -1;
                                var2_7.bf = -1;
                                var2_7.o = 0;
                                var2_7.bg = 0;
                                var2_7.bh = 0;
                                var2_7.bi = 0;
                                var2_7.ax = 70;
                                var2_7.n = i.i[8];
                                var2_7.l = 0;
                                var2_7.aZ = 0;
                                var2_7.bc = 0;
                                var2_7.bd = 0;
                                var2_7.bb = 0;
                                var2_7.aW = 0;
                                var2_7.k = 0;
                                var2_7.aT = 0;
                                var2_7.aU = 0;
                                var2_7.aV = 0;
                                i.cm = -1;
                                i.m = null;
                                i.l = null;
                                var2_7.a = var2_7.getClass().getResourceAsStream(i.d[var2_7.aA]);
                                var2_7.a.read();
                                var0_1 = false;
                                block187: while (true) {
                                    if (var0_1) {
                                        var2_7.a.close();
                                        var2_7.a = null;
                                        var2_7.c = 0;
                                        var2_7.a = 0;
                                        var2_7.d = 0;
                                        var2_7.b = 0;
                                        var2_7.a();
                                        System.gc();
                                        return;
                                    }
                                    var4_23 = var2_7.a.read();
                                    var5_28 = 0;
                                    var3_18 = new byte[4];
                                    block188: while (true) {
                                        if (var5_28 >= var4_23 || var0_1) continue block187;
                                        var2_7.a.read(var3_18);
                                        var1_3 = i.a(var3_18, 0);
                                        var6_36 = i.a(var3_18, 2);
                                        if (var5_28 == var2_7.aB) {
                                            var2_7.e = var1_3;
                                            var2_7.f = var6_36;
                                            i.a = null;
                                            i.c = null;
                                            i.a = null;
                                            System.gc();
                                            i.a = new byte[var2_7.e][var2_7.f];
                                            i.c = new byte[var2_7.e][var2_7.f];
                                            i.a = new int[var2_7.e][var2_7.f];
                                            var3_18 = new byte[var2_7.e * var2_7.f];
                                            var2_7.a.read(var3_18);
                                            break block277;
                                        }
                                        var2_7.a.skip(var1_3 * var6_36 * 3);
lbl168:
                                        // 2 sources

                                        while (true) {
                                            ++var5_28;
                                            continue block188;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                            }
                            case 9: {
                                var2_8 = this;
                                var3_19 = new Hashtable<Integer, Integer>();
                                this = new Hashtable<K, V>();
                                var4_24 = new Hashtable<Integer, Integer>();
                                var2_8.ai = 0;
                                var2_8.aj = 0;
                                var5_29 = 0;
                                var2_8.aY = 0;
                                var2_8.bu = 0;
                                var1_3 = 0;
                                var6_37 = 0;
                                var2_8.ag = false;
                                var2_8.ah = false;
                                var2_8.ai = false;
                                var2_8.aw = 0;
                                var7_41 = 0;
                                var8_44 = 0;
lbl189:
                                // 2 sources

                                while (true) {
                                    if (var8_44 < var2_8.e) {
                                        break block278;
                                    }
                                    i.d = new byte[var5_29 << 1];
                                    for (var8_44 = 0; var8_44 < i.d.length; ++var8_44) {
                                        i.d[var8_44] = 0;
                                    }
                                    i.a = new c[var7_41];
                                    i.p = new byte[var7_41];
                                    var8_44 = 0;
                                    i.k = new byte[var1_3 + 1 << 1];
                                    for (var9_45 = 31; var9_45 >= 0 && (var6_37 & 1 << var9_45) == 0; --var9_45) {
                                    }
                                    if (++var9_45 > 0) {
                                        i.m = new byte[var9_45];
                                        i.l = new byte[var9_45];
                                    }
                                    if (var2_8.aw > 0) {
                                        i.e = new byte[var2_8.aw * 3];
                                    }
                                    var10_46 = 0;
                                    var11_47 = 0;
lbl209:
                                    // 2 sources

                                    while (true) {
                                        if (var11_47 < var2_8.f) {
                                            break block279;
                                        }
                                        i.a[var2_8.ay - 2][var2_8.i] = -193 << 8 | 7;
                                        if ((var2_8.c & 0x100000000L) == 0L && i.i[9] < 8) return;
                                        var2_8.c |= 0x10000000000L;
                                        var2_8.c |= 2L;
                                        var2_8.c |= 1L;
                                        if ((var2_8.c & 131072L) != 0L) {
                                            var2_8.c |= 262144L;
                                        }
                                        if ((var2_8.c & 32768L) != 0L) {
                                            var2_8.c |= 65536L;
                                        }
                                        if ((var2_8.c & 0x800000000L) != 0L) {
                                            var2_8.c |= 0x1000000000L;
                                        }
                                        if ((var2_8.c & 0x2000000000L) != 0L) {
                                            var2_8.c |= 0x4000000000L;
                                        }
                                        if ((var2_8.c & 0x20000000000L) == 0L) return;
                                        var2_8.c |= 0x40000000000L;
                                        return;
                                    }
                                    break;
                                }
                            }
                            case 10: {
                                var1_4 = "/" + this.aA + ".f";
                                this.a = this.getClass().getResourceAsStream(var1_4);
                                this.cc = this.a.read();
                                i.n = new byte[this.cc << 3];
                                this.a.read(i.n);
                                return;
                            }
                            default: {
                                var1_3 = var1_3 - 10 - 1;
                                if (var1_3 >= 4) ** GOTO lbl275
                                var3_20 = var1_3;
                                var2_9 = this;
                                var4_25 = new byte[i.b(i.n, (var3_20 << 3) + 4)];
                                var2_9.a.read(var4_25);
                                var5_33 = new f();
                                var5_33.a(var4_25, 0);
                                var5_33.a(0, 0, -1, -1);
                                switch (var3_20) {
                                    case 0: {
                                        if ((var2_9.d & 1L) == 0L) break;
                                        v2 = i.a;
                                        v3 = 60;
                                        v4 /* !! */  = var5_33;
                                        ** GOTO lbl270
                                    }
                                    case 1: {
                                        if ((var2_9.d & 2L) == 0L) break;
                                        v2 = i.a;
                                        v3 = 16;
                                        v4 /* !! */  = var5_33;
                                        ** GOTO lbl270
                                    }
                                    case 2: {
                                        i.b[0] = null;
                                        v2 = i.a;
                                        v3 = 42;
                                        v4 /* !! */  = var5_33;
                                        ** GOTO lbl270
                                    }
                                    case 3: {
                                        v2 = i.b;
                                        v3 = 8;
                                        v4 /* !! */  = var5_33.a[0];
lbl270:
                                        // 4 sources

                                        v2[v3] = v4 /* !! */ ;
                                    }
                                }
                                var5_33.d = null;
                                this.bt = 0;
                                return;
lbl275:
                                // 1 sources

                                if ((var1_3 -= 4) < 0 || var1_3 >= 43) ** GOTO lbl464
                                var3_21 = var1_3;
                                var2_10 = this;
                                try {
                                    if (var3_21 % 10 == 0) {
                                        var2_10.a.close();
                                        var2_10.a = null;
                                        this = new StringBuffer("/gen").append(var2_10.bt).append(".f");
                                        var2_10.a = var2_10.getClass().getResourceAsStream(this.toString());
                                        var2_10.cc = var2_10.a.read();
                                        i.n = new byte[var2_10.cc << 3];
                                        var2_10.a.read(i.n);
                                        var2_10.cd = 0;
                                        ++var2_10.bt;
                                    }
                                    var0_2 = var3_21 - (var2_10.bt - 1) * 10;
                                    var4_26 = i.b(i.n, (var0_2 << 3) + 4);
                                    if ((var2_10.c & 1L << var3_21) == 0L) {
                                        var2_10.cd += var4_26;
                                        return;
                                    }
                                    if (var2_10.cd != 0) {
                                        var2_10.a.skip(var2_10.cd);
                                        var2_10.cd = 0;
                                    }
                                    var5_34 = new byte[var4_26];
                                    var2_10.a.read(var5_34);
                                    var1_5 = new f();
                                    var1_5.a(var5_34, 0);
                                    if ((var3_21 != 28 || var2_10.ag) && (var3_21 != 24 || var2_10.ai)) {
                                        var1_5.a(0, 0, -1, -1);
                                    }
                                    var6_39 = -1;
                                    var7_42 = -1;
                                    switch (var3_21) {
                                        case 41: {
                                            var6_39 = 38;
                                            break;
                                        }
                                        case 42: {
                                            var6_39 = 39;
                                            break;
                                        }
                                        case 0: {
                                            var6_39 = 33;
                                            break;
                                        }
                                        case 36: {
                                            var6_39 = 35;
                                            break;
                                        }
                                        case 1: {
                                            var6_39 = 34;
                                            break;
                                        }
                                        case 38: {
                                            var6_39 = 36;
                                            break;
                                        }
                                        case 16: 
                                        case 18: {
                                            var6_39 = 37;
                                            break;
                                        }
                                        case 40: {
                                            var6_39 = 2;
                                            break;
                                        }
                                        case 32: {
                                            var6_39 = 32;
                                            break;
                                        }
                                        case 23: {
                                            var6_39 = 30;
                                            break;
                                        }
                                        case 37: {
                                            var6_39 = 29;
                                            break;
                                        }
                                        case 35: {
                                            var6_39 = 28;
                                            break;
                                        }
                                        case 34: {
                                            var6_39 = 27;
                                            break;
                                        }
                                        case 33: {
                                            var6_39 = 22;
                                            break;
                                        }
                                        case 31: {
                                            v5 = 29;
                                            ** GOTO lbl454
                                        }
                                        case 30: {
                                            var6_39 = 15;
                                            break;
                                        }
                                        case 28: {
                                            if (var2_10.ah) {
                                                var1_5.a(1, 0, -1, -1);
                                            }
                                            var6_39 = 45;
                                            break;
                                        }
                                        case 29: {
                                            v5 = 26;
                                            ** GOTO lbl454
                                        }
                                        case 2: {
                                            if (var2_10.ag) {
                                                i.b[24] = var1_5.a[0];
                                            }
                                            if (var2_10.ah) {
                                                var1_5.a(1, 0, -1, -1);
                                                i.b[25] = var1_5.a[1];
                                            }
                                            break;
                                        }
                                        case 6: {
                                            v5 = 21;
                                            ** GOTO lbl454
                                        }
                                        case 27: {
                                            v5 = 19;
                                            ** GOTO lbl454
                                        }
                                        case 26: {
                                            i.d = var1_5;
                                            break;
                                        }
                                        case 25: {
                                            v5 = 17;
                                            ** GOTO lbl454
                                        }
                                        case 5: {
                                            var6_39 = 58;
                                            break;
                                        }
                                        case 3: {
                                            var6_39 = 7;
                                            break;
                                        }
                                        case 39: {
                                            var6_39 = 6;
                                            break;
                                        }
                                        case 8: {
                                            var6_39 = 5;
                                            break;
                                        }
                                        case 24: {
                                            i.b[15] = null;
                                            var1_5.a(1, 0, -1, -1);
                                            var6_39 = 57;
                                            i.b[14] = null;
                                            break;
                                        }
                                        case 22: {
                                            var6_39 = 8;
                                            break;
                                        }
                                        case 20: {
                                            v5 = 13;
                                            ** GOTO lbl454
                                        }
                                        case 4: 
                                        case 21: {
                                            if (var2_10.aA != 2) {
                                                var6_39 = 3;
                                            }
                                            break;
                                        }
                                        case 7: {
                                            if (var2_10.aA == 2) {
                                                var1_5.a = null;
                                                var1_5.a(1, 0, -1, -1);
                                                var1_5.a = 1;
                                            }
                                            var6_39 = 20;
                                            break;
                                        }
                                        case 14: {
                                            v5 = 6;
                                            ** GOTO lbl454
                                        }
                                        case 10: {
                                            i.a[4] = new b(var1_5, 0, 0, null);
                                            i.a[4].a(0);
                                            break;
                                        }
                                        case 9: {
                                            var6_39 = 12;
                                            break;
                                        }
                                        case 15: 
                                        case 17: {
                                            if ((var2_10.bu & 2) != 0) {
                                                if (var2_10.aA == 2) {
                                                    var1_5.a = null;
                                                    var1_5.a(2, 0, -1, -1);
                                                    var1_5.a = 2;
                                                }
                                                var6_39 = 4;
                                            }
                                            if ((var2_10.bu & 1) != 0) {
                                                i.a[21] = new f();
                                                i.a[21].a(var5_34, 0);
                                                i.a[21].a(1, 0, -1, -1);
                                                i.a[21].a = 1;
                                                i.a[21].d = null;
                                            }
                                            break;
                                        }
                                        case 13: {
                                            var6_39 = 1;
                                            break;
                                        }
                                        case 11: {
                                            var6_39 = 11;
                                            break;
                                        }
                                        case 19: {
                                            v5 = 7;
                                            ** GOTO lbl454
                                        }
                                        case 12: {
                                            v5 = 10;
lbl454:
                                            // 9 sources

                                            var7_42 = v5;
                                        }
                                    }
                                    if (var6_39 != -1) {
                                        i.a[var6_39] = var1_5;
                                    }
                                    if (var7_42 != -1) {
                                        i.b[var7_42] = var1_5.a[0];
                                    }
                                    var1_5.d = null;
                                    return;
                                }
                                catch (IOException v6) {
                                    return;
                                }
lbl464:
                                // 1 sources

                                if ((var1_3 -= 43) < 0 || var1_3 >= 8) ** GOTO lbl534
                                var3_22 = var1_3;
                                var2_11 = this;
                                try {
                                    if (var3_22 == 0) {
                                        var2_11.a.close();
                                        var2_11.a = null;
                                        System.gc();
                                        var2_11.a = var2_11.getClass().getResourceAsStream("/cm.f");
                                        var2_11.cc = var2_11.a.read();
                                        i.n = new byte[var2_11.cc << 3];
                                        var2_11.a.read(i.n);
                                    }
                                    var4_27 = new byte[i.b(i.n, (var3_22 << 3) + 4)];
                                    var2_11.a.read(var4_27);
                                    var5_35 = new f();
                                    var5_35.a(var4_27, 0);
                                    var5_35.a(0, 0, -1, -1);
                                    switch (var3_22) {
                                        case 6: {
                                            i.a[43] = var5_35;
                                            v7 = i.b;
                                            v8 = 20;
                                            v9 = null;
                                            ** GOTO lbl524
                                        }
                                        case 5: {
                                            v7 = i.b;
                                            v8 = 18;
                                            ** GOTO lbl523
                                        }
                                        case 2: {
                                            var5_35.a(1, 0, 0, -1);
                                            v7 = i.a;
                                            v8 = 59;
                                            v9 = var5_35;
                                            ** GOTO lbl524
                                        }
                                        case 1: {
                                            switch (var2_11.aA) {
                                                case 1: 
                                                case 2: {
                                                    if (var2_11.aA == 0) break;
                                                    var5_35.a(var2_11.aA, 0, -1, -1);
                                                    var5_35.a(0);
                                                    var5_35.a = var2_11.aA;
                                                    break;
                                                }
                                            }
                                            v7 = i.a;
                                            v8 = 56;
                                            v9 = var5_35;
                                            ** GOTO lbl524
                                        }
                                        case 3: {
                                            i.a[13] = var5_35;
                                            super.r();
                                            break;
                                        }
                                        case 0: {
                                            v7 = i.b;
                                            v8 = 11;
                                            ** GOTO lbl523
                                        }
                                        case 4: {
                                            v7 = i.b;
                                            v8 = 5;
lbl523:
                                            // 3 sources

                                            v9 = var5_35.a[0];
lbl524:
                                            // 4 sources

                                            v7[v8] = v9;
                                        }
                                    }
                                    var5_35.d = null;
                                }
                                catch (Exception v10) {}
                                if (var1_3 != 7) return;
                                this.a.close();
                                this.a = null;
                                System.gc();
                                return;
lbl534:
                                // 1 sources

                                if ((var1_3 -= 8) >= 0 && var1_3 < 16) {
                                    if (var1_3 < i.a.length) {
                                        i.a[var1_3] = new c((i)this);
                                        i.a[var1_3].a(i.p[var1_3]);
                                    }
                                    if (var1_3 != 15 || i.a.length < 16) return;
                                    for (var2_12 = 16; var2_12 < i.a.length; ++var2_12) {
                                        i.a[var2_12] = new c((i)this);
                                        i.a[var2_12].a(i.p[var2_12]);
                                    }
                                    return;
                                }
                                if ((var1_3 -= 16) >= 0 && var1_3 < 3) {
                                    switch (this.k) {
                                        case 1: {
                                            super.d(var1_3);
                                            if (var1_3 != 2) return;
                                            this.a.close();
                                            this.a = null;
                                            return;
                                        }
                                        case 3: {
                                            if (var1_3 > 0) {
                                                return;
                                            }
                                            var2_13 = i.a("/mmv.f", 1, 0);
                                            i.b[31] = var2_13.a[0];
                                            i.a[5] = new b(i.a("/mm1.f", 0), 0, 0, null);
                                            i.a[5].a(0);
                                            return;
                                        }
                                        case 4: {
                                            if (var1_3 >= 2) {
                                                return;
                                            }
                                            super.c(var1_3);
                                            var2_14 = i.a("/mmv.f", 3, 0);
                                            i.b[32] = var2_14.a[0];
                                            i.a[20] = i.a("/gen0.f", 7, 0);
                                            if (var1_3 != 1) return;
                                            this.a.close();
                                            this.a = null;
                                            return;
                                        }
                                        case 5: {
                                            var2_15 = i.a("/mmv.f", 2, 0);
                                            i.b[30] = var2_15.a[0];
                                            i.a[20] = i.a("/gen0.f", 7, 0);
                                            i.a[5] = new b(i.a("/b1.f", 0), 0, 0, null);
                                            i.a[5].a(10);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                switch (var1_3 -= 3) {
                                    case 0: {
                                        i.n = null;
                                        super.a(i.a[12] != null || i.b[6] != null || i.a[58] != null || this.k == 1 || this.k == 4 || this.k == 5);
                                        return;
                                    }
                                    case 1: {
                                        this.c = 0L;
                                        this.d = 0L;
                                        this.bu = 0;
                                        ++this.ag;
                                        var2_16 = this.ag < 3 ? this.ag : 3;
                                        i.i[12] = (byte)var2_16;
                                        super.u();
                                        return;
                                    }
                                    case 2: {
                                        i.c = new int[this.e][this.f];
                                        i.d = new byte[this.e][this.f];
                                        i.e = new byte[this.e][this.f];
                                        i.d = new int[this.e][this.f];
                                        if (i.m == null) return;
                                        i.o = new byte[i.m.length];
                                        return;
                                    }
                                    case 3: {
                                        var2_17 = this;
                                        if (!var2_17.l) return;
                                        super.at();
                                        i.e = new int[var2_17.e][var2_17.f];
                                        super.ah();
                                        return;
                                    }
                                    case 4: {
                                        this.bl = 0;
                                        this.ae = 0;
                                        this.ad = 0;
                                        super.aq();
                                        return;
                                    }
                                    case 5: {
                                        this.bn = i.aS + 60;
                                        super.q();
                                        return;
                                    }
                                    case 6: {
                                        i.a(i.a, true);
                                        i.a = null;
                                        System.gc();
                                        return;
                                    }
                                    case 7: {
                                        this.D = false;
                                        i.f = null;
                                        System.gc();
                                        this.a.b(16 + this.aA);
                                        i.b = 1;
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                    }
                    catch (Exception v11) {
                        return;
                    }
                }
                for (var7_40 = 0; var7_40 < var2_7.e; ++var7_40) {
                    for (var8_43 = 0; var8_43 < var2_7.f; ++var8_43) {
                        i.a[var7_40][var8_43] = var3_18[var7_40 + var8_43 * var2_7.e];
                    }
                }
                i.b = new byte[var2_7.e][var2_7.f];
                i.b = new int[var2_7.e][var2_7.f];
                var2_7.a.read(var3_18);
                for (var7_40 = 0; var7_40 < var2_7.e; ++var7_40) {
                    for (var8_43 = 0; var8_43 < var2_7.f; ++var8_43) {
                        i.b[var7_40][var8_43] = var3_18[var7_40 + var8_43 * var2_7.e];
                    }
                }
                var2_7.a.read(var3_18);
                for (var7_40 = 0; var7_40 < var2_7.e; ++var7_40) {
                    for (var8_43 = 0; var8_43 < var2_7.f; ++var8_43) {
                        i.a[var7_40][var8_43] = var3_18[var7_40 + var8_43 * var2_7.e];
                    }
                }
                var3_18 = null;
                var0_1 = true;
                ** while (true)
            }
            block201: for (var9_45 = 0; var9_45 < var2_8.f; ++var9_45) {
                block280: {
                    i.b[var8_44][var9_45] = 0;
                    i.c[var8_44][var9_45] = 0;
                    var10_46 = i.a[var8_44][var9_45];
                    var11_47 = i.b[var8_44][var9_45];
                    var12_48 = i.a[var8_44][var9_45];
                    if (var10_46 == -1) break block280;
                    block21 : switch (var10_46 & 255) {
                        case 31: {
                            var2_8.c |= 0x40000000L;
                            i.a[var8_44][var9_45] = var11_47 << 8 | 31;
                        }
                        case 19: {
                            i.a[var8_44][var9_45] = var11_47 << 8 | 19;
                            break;
                        }
                        case 17: {
                            var13_49 = i.a[var8_44][var9_45 - 1] & 255;
                            if (var13_49 == 14 || var13_49 == 33) {
                                i.a[var8_44][var9_45 - 1] = 65280 | var13_49;
                            }
                            var14_50 = i.a[var8_44][var9_45 - 1];
                            switch (var14_50) {
                                case 19: 
                                case 36: 
                                case 43: 
                                case 45: 
                                case 46: 
                                case 49: {
                                    var15_51 = new Integer(var11_47);
                                    var16_55 = (Integer)this.get(var15_51);
                                    var16_55 = var16_55 == null ? new Integer(1) : new Integer(var16_55 + 1);
                                    this.put(var15_51, var16_55);
                                    i.a[var8_44][var9_45] = -1;
                                    var17_58 = (Integer)var4_24.get(var15_51);
                                    if (var14_50 == 36) {
                                        if (var17_58 != null) break;
                                        var4_24.put(var15_51, new Integer(58));
                                        break;
                                    }
                                    var4_24.put(var15_51, new Integer(56));
                                    if (var2_8.k == 4) {
                                        var4_24.put(var15_51, new Integer(51));
                                        break;
                                    }
                                    if (var2_8.k == 5) {
                                        var4_24.put(var15_51, new Integer(52));
                                        break;
                                    }
                                    if (var2_8.k != 3) break;
                                    var4_24.put(var15_51, new Integer(53));
                                    break;
                                }
                                default: {
                                    i.a[var8_44][var9_45] = var11_47 << 8 | 17;
                                }
                            }
                            if (var11_47 < 0) break;
                            var6_37 |= 1 << var11_47;
                            break;
                        }
                        case 14: 
                        case 33: {
                            if (!var2_8.f()) {
                                i.a[var8_44][var9_45] = 33;
                            }
                            var2_8.c = var2_8.c | 1L << ((i.a[var8_44][var9_45] & 255) == 14 ? 22 : 33);
                            if (!var2_8.a(var2_8.aA, var2_8.aB, var8_44, var9_45)) break;
                            if (var2_8.f()) {
                                i.a[var8_44][var9_45] = 41;
                                i.b[var8_44][var9_45] = 10;
                                var2_8.aY += 10;
                                break;
                            }
                            i.a[var8_44][var9_45] = -1;
                            v12 = i.a[var8_44];
                            v13 = var9_45;
                            v12[v13] = v12[v13] | 256;
                            break;
                        }
                        case 2: {
                            var2_8.c |= 0x100000L;
                            switch (var11_47) {
                                case 0: 
                                case 1: {
                                    var2_8.c |= 524288L;
                                    break;
                                }
                            }
                            i.a[var8_44][var9_45] = var11_47 << 8 | 2;
                            break;
                        }
                        case 8: {
                            var2_8.ah = true;
                        }
                        case 9: {
                            if ((var10_46 & 255) != 8) {
                                var2_8.ag = true;
                            }
                            var2_8.c |= 0x10000000L;
                            var15_51 = new Integer(var11_47);
                            var16_55 = (Integer)var3_19.get(var15_51);
                            var16_55 = var16_55 == null ? new Integer(1) : new Integer(var16_55 + 1);
                            var3_19.put(var15_51, var16_55);
                            i.a[var8_44][var9_45] = var11_47 << 8 | var10_46;
                            break;
                        }
                        case 7: {
                            if (var11_47 != -1) {
                                i.q[var11_47] = (byte)var8_44;
                                i.r[var11_47] = (byte)var9_45;
                            }
                            i.a[var8_44][var9_45] = var11_47 << 8 | var10_46;
                            break;
                        }
                        case 30: {
                            var2_8.c |= 0x40000000L;
                            ++var7_41;
                        }
                        case 1: 
                        case 26: {
                            i.a[var8_44][var9_45] = var11_47 << 8 | var10_46 & 255;
                            break;
                        }
                        case 0: {
                            ++var7_41;
                            i.a[var8_44][var9_45] = var11_47 << 8 | var10_46 & 255;
                            break;
                        }
                        case 4: {
                            ++var1_3;
                            var2_8.c |= 16L;
                            i.a[var8_44][var9_45] = var11_47 << 8 | var10_46 & 255;
                            break;
                        }
                        case 5: {
                            var2_8.p = (byte)var11_47;
                            break;
                        }
                        case 28: {
                            var2_8.q = (byte)var11_47;
                            break;
                        }
                        case 3: {
                            i.c[var8_44][var9_45] = 127;
                            if (var11_47 <= 0) break;
                            i.a[var8_44][var9_45] = var11_47 + 1 << 8 | 3;
                            break;
                        }
                        case 6: {
                            var15_51 = new Integer(var11_47);
                            var16_55 = (Integer)var3_19.get(var15_51);
                            var16_55 = var16_55 == null ? new Integer(1) : new Integer(var16_55 + 1);
                            var3_19.put(var15_51, var16_55);
                            var2_8.c |= 0x20000000L;
                            i.a[var8_44][var9_45] = var11_47 << 8 | 6;
                            break;
                        }
                        default: {
                            if (var10_46 < 20 || var10_46 >= 26) ** GOTO lbl806
                            i.a[var8_44][var9_45] = var10_46;
                            switch (var2_8.aA) {
                                case 0: {
                                    v14 = var2_8;
                                    v15 = v14;
                                    v16 = v14.c;
                                    v17 = 16L;
                                    ** GOTO lbl803
                                }
                                case 1: {
                                    v18 = var2_8;
                                    v15 = v18;
                                    v16 = v18.c;
                                    v17 = 0x200000L;
lbl803:
                                    // 2 sources

                                    v15.c = v16 | v17;
                                    break block21;
                                }
                            }
                            break;
lbl806:
                            // 1 sources

                            if (var10_46 >= 80 || var10_46 <= -1) break;
                            i.a[var8_44][var9_45] = -1;
                            break;
                        }
                        case 34: {
                            var2_8.c |= 0x400000000L;
                        }
                    }
                }
                switch (var12_48) {
                    case 48: {
                        if ((var11_47 & 7) == 4) {
                            v19 = i.b[var8_44];
                            v20 = var9_45;
                            v21 = 16;
                        } else {
                            v19 = i.b[var8_44];
                            v20 = var9_45;
                            v21 = 0;
                        }
                        v19[v20] = v21;
                        ++var2_8.aw;
                        var2_8.c |= 0x10000000000L;
                        var2_8.c |= 0x100000000L;
                        var13_49 = var9_45 - 1;
                        i.a[var8_44][var13_49] = 48;
                        i.b[var8_44][var13_49] = 8;
                        i.l(var8_44, var13_49);
                        continue block201;
                    }
                    case 47: {
                        i.c[var8_44][var9_45] = 48;
                        i.b[var8_44][var9_45] = 0;
                        var2_8.c |= 0x800000L;
                        continue block201;
                    }
                    case 46: {
                        i.b[var8_44][var9_45] = 0;
                        i.c[var8_44][var9_45] = 24;
                        i.b[var8_44][var9_45] = 0;
                        var2_8.c |= 0x2000000000L;
                        continue block201;
                    }
                    case 45: {
                        i.b[var8_44][var9_45] = 0;
                        i.c[var8_44][var9_45] = 24;
                        var2_8.c |= 0x800000000L;
                        continue block201;
                    }
                    case 44: {
                        i.c[var8_44][var9_45] = 24;
                        i.b[var8_44][var9_45] = 0;
                        var2_8.c |= 0x400000000L;
                        continue block201;
                    }
                    case 42: {
                        ++var7_41;
                        ++var5_29;
                        var2_8.c |= 0x80000000L;
                        var2_8.c |= 0x40000000L;
                        var2_8.j(var8_44, var9_45);
                        continue block201;
                    }
                    case 41: {
                        if (i.b[var8_44][var9_45] <= 0) {
                            i.b[var8_44][var9_45] = 1;
                        }
                        var2_8.aY += i.b[var8_44][var9_45];
                        continue block201;
                    }
                    case 40: {
                        var2_8.c |= 0x40000000L;
                        ++var7_41;
                        var2_8.l = true;
                        var2_8.c |= 0x8000000L;
                        var2_8.j(var8_44, var9_45);
                        ++var5_29;
                        continue block201;
                    }
                    case 12: {
                        i.a[var8_44][var9_45] = -1;
                        var2_8.ab = var8_44;
                        var2_8.ac = var9_45;
                        var2_8.aa = var11_47;
                        continue block201;
                    }
                    case 36: {
                        if (i.b[var8_44][var9_45] != 1) {
                            i.b[var8_44][var9_45] = 0;
                        }
                        var2_8.c |= 256L;
                        continue block201;
                    }
                    case 18: {
                        var2_8.ce = 0;
                        var2_8.cf = 0;
                        var2_8.c |= 0x8000000000L;
                        var2_8.c |= 128L;
                        continue block201;
                    }
                    case 34: {
                        i.a[var8_44][var9_45] = -1;
                        i.a[var8_44][var9_45] = 15;
                        var2_8.c |= 0x1000000L;
                        continue block201;
                    }
                    case 35: {
                        i.a[var8_44][var9_45] = 35;
                        i.a[var8_44][var9_45] = -1;
                        var2_8.c |= 0x1000000L;
                        var2_8.ai = true;
                        continue block201;
                    }
                    case 31: 
                    case 33: {
                        continue block201;
                    }
                    case 39: {
                        var2_8.l = true;
                        var2_8.c |= 0x4000000L;
                        continue block201;
                    }
                    case 38: {
                        var2_8.l = true;
                        var2_8.c |= 0x4000000L;
                        i.a[var8_44][var9_45] = 27;
                        var2_8.c |= 64L;
                        continue block201;
                    }
                    case 14: {
                        var2_8.c |= 4096L;
                        i.b[var8_44][var9_45] = i.b[var8_44][var9_45] == 4 ? 8 : 0;
                        v22 = i.c[var8_44];
                        v23 = var9_45;
                        v24 = 24;
                        break;
                    }
                    case 28: {
                        var2_8.c |= 2048L;
                        if (var11_47 > 10) {
                            v25 = i.b[var8_44];
                            v26 = var9_45;
                            v25[v26] = v25[v26] / 11;
                            v27 = i.b[var8_44];
                            v28 = var9_45;
                            v27[v28] = v27[v28] | 8;
                        }
                        v22 = i.c[var8_44];
                        v23 = var9_45;
                        v24 = 24;
                        break;
                    }
                    case 79: {
                        var2_8.h = 0;
                        var2_8.i = var9_45;
                        var2_8.ay = var8_44;
                        i.a[var8_44][var9_45] = -1;
                        var2_8.c = 0;
                        var2_8.a = 0;
                        var2_8.b = var2_8.d = var2_8.i * 24 - 120;
                        continue block201;
                    }
                    case 11: {
                        i.b[var8_44][var9_45] = var11_47 == 1 ? 16 : 0;
                        i.c[var8_44][var9_45] = 48;
                        var2_8.c |= 16384L;
                        continue block201;
                    }
                    case 49: {
                        var2_8.c |= 0x20000000000L;
                        v22 = i.c[var8_44];
                        v23 = var9_45;
                        v24 = 48;
                        break;
                    }
                    case 43: {
                        var2_8.c = var2_8.c | 1L << (var2_8.aA == 1 ? 17 : 15);
                        var2_8.bu |= 1;
                        i.b[var8_44][var9_45] = var11_47 & -98305 | 65536;
                        v22 = i.c[var8_44];
                        v23 = var9_45;
                        v24 = 48;
                        break;
                    }
                    case 19: {
                        var2_8.c = var2_8.c | 1L << (var2_8.aA == 1 ? 17 : 15);
                        var2_8.bu |= 2;
                        v22 = i.c[var8_44];
                        v23 = var9_45;
                        v24 = 48;
                        break;
                    }
                    case 22: 
                    case 23: {
                        var2_8.c |= 512L;
                        var2_8.c |= 1024L;
                        v22 = i.c[var8_44];
                        v23 = var9_45;
                        v24 = 48;
                        break;
                    }
                    case 30: {
                        var2_8.c |= 128L;
                        i.b[var8_44][var9_45] = 0;
                        continue block201;
                    }
                    case 37: {
                        var2_8.c |= 0x2000000L;
                        i.b[var8_44][var9_45] = 0;
                        continue block201;
                    }
                    case 10: {
                        i.b[var8_44][var9_45] = 0;
                        var2_8.d |= 2L;
                        continue block201;
                    }
                    case 16: {
                        if (i.a[var8_44][var9_45 + 1] != 16) {
                            i.a[var8_44][var9_45 - 1] = 16;
                            i.b[var8_44][var9_45 - 1] = var11_47;
                        }
                        var2_8.c |= 8192L;
                        continue block201;
                    }
                    case 6: {
                        ++var5_29;
                        var2_8.j(var8_44, var9_45);
                    }
                    case 7: {
                        var2_8.c |= 16L;
                        i.b[var8_44][var9_45] = 0;
                        continue block201;
                    }
                    case 26: {
                        var2_8.c |= 0x10000000000L;
                    }
                    case 24: 
                    case 27: {
                        ++var7_41;
                        ++var5_29;
                        var2_8.c |= 0x40000000L;
                        var2_8.c |= 524288L;
                        var2_8.j(var8_44, var9_45);
                        continue block201;
                    }
                    case 8: {
                        var2_8.c |= 32L;
                        var2_8.c |= 8L;
                    }
                    case 4: {
                        if (var12_48 != 8) {
                            var2_8.j(var8_44, var9_45);
                        }
                    }
                    case 5: {
                        var2_8.c |= 4L;
                    }
                    case 2: {
                        ++var5_29;
                    }
                    case 0: {
                        i.c[var8_44][var9_45] = 48;
                        i.b[var8_44][var9_45] = 0;
                        var2_8.d |= 1L;
                        continue block201;
                    }
                    case 1: {
                        ++var2_8.aY;
                        i.c[var8_44][var9_45] = 48;
                        i.b[var8_44][var9_45] = 0;
                        continue block201;
                    }
                    case 53: {
                        continue block201;
                    }
                    case 51: {
                        continue block201;
                    }
                    case 52: {
                        continue block201;
                    }
                    default: {
                        if (var12_48 >= 80 || var12_48 <= -1) continue block201;
                        v22 = i.a[var8_44];
                        v23 = var9_45;
                        v24 = -1;
                    }
                }
                v22[v23] = v24;
            }
            ++var8_44;
            ** while (true)
        }
        block202: for (var12_48 = 0; var12_48 < var2_8.e; ++var12_48) {
            var13_49 = i.a[var12_48][var11_47] & 255;
            var14_50 = i.a[var12_48][var11_47] >> 8;
            switch (var13_49) {
                case 0: 
                case 30: {
                    v29 = i.p;
                    v30 = var8_44++;
                    v31 = (byte)var14_50;
                    ** GOTO lbl1092
                }
                case 7: {
                    var15_53 = (Integer)var3_19.get(new Integer(var14_50));
                    var14_50 <<= 8;
                    if (var15_53 != null) {
                        var14_50 = var14_50 & -16 | var15_53;
                    }
                    var16_57 = (i.a[var12_48][var11_47 - 1] & 255) == 17 ? 1 : 0;
                    v32 = var17_59 = (i.a[var12_48][var11_47 + 1] & 255) == 17 && (i.a[var12_48 + 1][var11_47] & 255) != 26 && (i.a[var12_48 - 1][var11_47] & 255) != 26;
                    if (var16_57 != 0 || var17_59) {
                        var14_50 = var14_50 & -241 | 48;
                        i.c[var12_48][var11_47] = 24;
                        if (var16_57 != 0) {
                            i.a[var12_48][var11_47 - 1] = -1;
                        }
                    }
                    i.a[var12_48][var11_47] = var14_50 << 8 | var13_49;
                    break;
                }
                case 4: {
                    var5_31 = var14_50;
                    i.k[var5_31 << 1] = (byte)var12_48;
                    v29 = i.k;
                    v30 = (var5_31 << 1) + 1;
                    v31 = (byte)var11_47;
                    ** GOTO lbl1092
                }
                case 5: {
                    i.k[var1_3 << 1] = (byte)var12_48;
                    v29 = i.k;
                    v30 = (var1_3 << 1) + 1;
                    v31 = (byte)var11_47;
                    ** GOTO lbl1092
                }
                case 17: {
                    if (var14_50 == -1) break;
                    var5_32 = new Integer(var14_50);
                    var6_38 = (Integer)this.get(var5_32);
                    if (var6_38 == null) {
                        var6_38 = new Integer(0);
                    }
                    i.m[var14_50] = var6_38.byteValue();
                    if ((var5_32 = (Integer)var4_24.get(var5_32)) == null) {
                        var5_32 = new Integer(57);
                    }
                    v29 = i.l;
                    v30 = var14_50;
                    v31 = var5_32.byteValue();
lbl1092:
                    // 4 sources

                    v29[v30] = v31;
                }
            }
            switch (i.a[var12_48][var11_47]) {
                case 48: {
                    if ((i.b[var12_48][var11_47] & 8) == 0) continue block202;
                    var15_54 = var12_48 + ((i.b[var12_48][var11_47 + 1] & 16) == 0 ? 1 : -1);
                    var16_57 = var10_46 * 3;
                    if (i.d(var15_54, var11_47) >= 0) {
                        i.e[var16_57] = (byte)var15_54;
                        i.e[var16_57 + 1] = (byte)var15_54;
                        v33 = i.e;
                        v34 = var16_57 + 2;
                        v35 = (byte)var11_47;
                    } else {
                        v33 = i.e;
                        v34 = var16_57 + 2;
                        v35 = -1;
                    }
                    v33[v34] = v35;
                    i.b[var12_48][var11_47] = i.b[var12_48][var11_47] & 0xFFFFFF | var10_46 << 24;
                    ++var10_46;
                    continue block202;
                }
                case 26: {
                    v36 = i.p;
                    v37 = var8_44++;
                    v38 = 25;
                    ** GOTO lbl1139
                }
                case 42: {
                    v36 = i.p;
                    v37 = var8_44++;
                    v38 = 11;
                    ** GOTO lbl1139
                }
                case 24: {
                    v36 = i.p;
                    v37 = var8_44++;
                    v38 = 22;
                    ** GOTO lbl1139
                }
                case 27: {
                    v36 = i.p;
                    v37 = var8_44++;
                    v38 = 23;
                    ** GOTO lbl1139
                }
                case 40: {
                    v36 = i.p;
                    v37 = var8_44++;
                    v38 = 24;
lbl1139:
                    // 5 sources

                    v36[v37] = v38;
                    continue block202;
                }
            }
        }
        ++var11_47;
        ** while (true)
    }

    private void a(boolean bl) {
        try {
            InputStream inputStream = this.getClass().getResourceAsStream("/o.f");
            byte[] byArray = new byte[inputStream.read() << 3];
            inputStream.read(byArray);
            byte[] byArray2 = new byte[i.b(byArray, 4)];
            inputStream.read(byArray2);
            if (!bl) {
                inputStream.close();
                inputStream = null;
                System.gc();
            }
            f f2 = new f();
            f2.a(byArray2, 0);
            this.cu = i[8] - 4;
            f2.a(this.cu, 0, -1, -1);
            f2.a = this.cu;
            f2.d = null;
            i.a[0] = new b(f2, 0, 0, null);
            System.gc();
            if (bl) {
                byArray2 = new byte[i.b(byArray, 12)];
                inputStream.read(byArray2);
                inputStream.close();
                System.gc();
                f2 = new f();
                f2.a(byArray2, 0);
                f2.a(0, 0, -1, -1);
                f2.d = null;
                i.a[3] = new b(f2, 0, 0, null);
                System.gc();
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private int a() {
        return a[this.bo][this.bq << 1];
    }

    private void k() {
        if (d != null) {
            String string = d;
            try {
                Thread.sleep(10L);
                new k(string).start();
                return;
            }
            catch (Exception exception) {}
        }
    }

    private void l() {
        int n;
        i i2;
        if (this.D) {
            i2 = this;
            n = 97;
        } else {
            i2 = this;
            n = 92;
        }
        i2.br = n;
        this.bs = 0;
        if (!i.b()) {
            this.p = false;
        }
        this.J = true;
        this.x = false;
        b = (byte)11;
        this.a = 0;
        this.l = 0;
        this.k = 0;
        this.aG = -1;
        this.aF = -1;
        this.b = 0L;
    }

    private static boolean a() {
        String string = null;
        try {
            string = a.getAppProperty("more_games_status");
        }
        catch (Exception exception) {}
        if (string != null) {
            return string.equals("on");
        }
        return false;
    }

    private void m() {
        --this.bq;
        if (this.bq < 0) {
            this.bq = (a[this.bo].length >> 1) - 1;
        }
    }

    private void n() {
        this.bq = (this.bq + 1) % (a[this.bo].length >> 1);
    }

    private void o() {
        this.K = false;
        if (a != null) {
            int n = a.length;
            for (int i2 = 0; i2 < n; ++i2) {
                i.a(a[i2]);
                i.a[i2] = null;
            }
        }
        a = null;
        i.a(a[42], true);
        i.a(a[43], true);
        System.gc();
    }

    private static void a(c c2) {
        int n;
        if (c2 == null) {
            return;
        }
        if (c.a != null) {
            for (n = 0; n < c.a.length; ++n) {
                i.a(c.a[n], true);
                c.a[n] = null;
            }
        }
        if (c2.a != null) {
            for (n = 0; n < c2.a.length; ++n) {
                c2.a[n] = null;
            }
            c2.a = null;
        }
        c2.a = null;
    }

    private static void a(f f2, boolean bl) {
        if (f2 == null) {
            return;
        }
        f2.a(bl);
    }

    private void p() {
        int n;
        int n2;
        this.J = false;
        this.o = true;
        this.E = false;
        this.di = 0;
        this.e = null;
        m = null;
        l = null;
        this.ai = 0;
        this.aj = 0;
        d = null;
        e = null;
        this.a = null;
        i.n = null;
        f = null;
        c = null;
        b = null;
        d = null;
        p = null;
        k = null;
        if (a != null) {
            n2 = a.length;
            for (n = 0; n < n2; ++n) {
                i.a(a[n]);
                i.a[n] = null;
            }
        }
        a = null;
        if (this.a != null) {
            i.a(this.a);
            this.a = null;
        }
        if (b != null) {
            for (n2 = 0; n2 < 33; ++n2) {
                if (b[n2] == null) continue;
                n = b[n2].length;
                for (int i2 = 0; i2 < n; ++i2) {
                    i.b[n2][i2] = null;
                }
                i.b[n2] = null;
            }
        }
        i.a(d, true);
        System.gc();
        if (a != null) {
            for (n2 = 0; n2 < 61; ++n2) {
                if (n2 == 41 || n2 == 0 || n2 == 9 || n2 == 18) continue;
                i.a(a[n2], true);
                i.a[n2] = null;
            }
        }
        if (a != null) {
            for (n2 = 0; n2 < 6; ++n2) {
                if (a[n2] == null) continue;
                i.a(i.a[n2].a, true);
                i.a[n2].a = null;
                i.a[n2] = null;
            }
        }
        b = null;
        a = null;
        b = null;
        a = null;
        c = null;
        c = null;
        d = null;
        d = null;
        e = null;
        o = null;
        this.c = 0L;
        this.bu = 0;
        this.aD = -1;
        this.aF = -1;
        this.aH = -1;
        this.aI = -1;
        b = null;
        this.bK = -1;
        this.x = (byte)3;
        e = null;
        f = null;
        a = null;
        c = null;
        b = null;
        d = null;
        this.al = false;
        this.dq = -1;
        this.dr = 0;
        this.ds = 0;
        this.v = 0;
        this.dv = 0;
        this.dw = 0;
        this.dx = 0;
        this.w = 0;
        this.dy = 0;
        this.dz = -1;
        this.l = false;
        e = null;
        a = null;
        b = null;
        c = null;
        f = null;
        c = null;
        System.gc();
        System.gc();
    }

    private void q() {
        this.o = true;
    }

    private void r() {
        if ((this.d & 1L) == 0L) {
            for (int i2 = 0; i2 < 5; ++i2) {
                i.a[13].a[0][i2] = null;
            }
        }
    }

    private void c(int n) {
        try {
            if (n == 0) {
                ((i)((Object)f2)).a = f2.getClass().getResourceAsStream("/b0.f");
                ((i)((Object)f2)).cc = ((i)((Object)f2)).a.read();
                i.n = new byte[((i)((Object)f2)).cc << 3];
                ((i)((Object)f2)).a.read(i.n);
            }
            byte[] byArray = new byte[i.b(i.n, (n << 3) + 4)];
            ((i)((Object)f2)).a.read(byArray);
            f f2 = new f();
            f2.a(byArray, 0);
            f2.a(0, 0, -1, -1);
            f2.d = null;
            switch (n) {
                case 0: {
                    i.a[5] = new b(f2, 0, 0, null);
                    return;
                }
                case 1: {
                    i.a[40] = f2;
                }
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void d(int n) {
        try {
            if (n == 0) {
                ((i)((Object)f2)).a = f2.getClass().getResourceAsStream("/mm0.f");
                ((i)((Object)f2)).cc = ((i)((Object)f2)).a.read();
                i.n = new byte[((i)((Object)f2)).cc << 3];
                ((i)((Object)f2)).a.read(i.n);
            }
            byte[] byArray = new byte[i.b(i.n, (n << 3) + 4)];
            ((i)((Object)f2)).a.read(byArray);
            f f2 = new f();
            f2.a(byArray, 0);
            f2.a(0, 0, -1, -1);
            f2.d = null;
            switch (n) {
                case 2: {
                    i.b[27] = f2.a[0];
                    return;
                }
                case 1: {
                    i.a[2] = new b(f2, 0, 0, null);
                    a[2].a(0);
                    return;
                }
                case 0: {
                    i.a[1] = new b(f2, 0, 0, null);
                    a[1].a(2);
                }
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static boolean b() {
        if (i == null) {
            return false;
        }
        return i[13] != 0;
    }

    private void b(boolean bl) {
        i.i[13] = 1;
        this.u();
    }

    private void s() {
        this.c(true);
    }

    private void c(boolean bl) {
        this.I = false;
        this.b(true);
        this.w();
        this.v();
        i.a(this.aA, dZ);
        if (bl) {
            int n = this.bb + this.b(this.aA, this.aB);
            int n2 = this.aB;
            int n3 = this.aA;
            i i2 = this;
            i.i[i.a((int)n3, (int)n2)] = (byte)n;
        }
        this.u();
    }

    private void t() {
        RecordStore recordStore = null;
        try {
            recordStore = RecordStore.openRecordStore("DiamondRush", true);
            i = recordStore.getRecord(1);
            this.cw = i.length;
            recordStore.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            try {
                if (recordStore != null) {
                    recordStore.closeRecordStore();
                }
                return;
            }
            catch (Exception exception2) {
                return;
            }
        }
        catch (Throwable throwable) {
            try {
                if (recordStore != null) {
                    recordStore.closeRecordStore();
                }
            }
            catch (Exception exception) {}
            throw throwable;
        }
    }

    private void u() {
        this.N = false;
        RecordStore recordStore = null;
        try {
            recordStore = RecordStore.openRecordStore("DiamondRush", true);
            if (recordStore.getNumRecords() == 0) {
                recordStore.addRecord(i, 0, this.cw);
            } else {
                recordStore.setRecord(1, i, 0, this.cw);
            }
            recordStore.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            try {
                if (recordStore != null) {
                    recordStore.closeRecordStore();
                }
                return;
            }
            catch (Exception exception2) {
                return;
            }
        }
        catch (Throwable throwable) {
            try {
                if (recordStore != null) {
                    recordStore.closeRecordStore();
                }
            }
            catch (Exception exception) {}
            throw throwable;
        }
    }

    private void v() {
        RecordStore recordStore = null;
        try {
            recordStore = RecordStore.openRecordStore("Preferences", true);
            if (recordStore.getNumRecords() == 0) {
                recordStore.addRecord(j, 0, this.cv);
            } else {
                recordStore.setRecord(1, j, 0, this.cv);
            }
            recordStore.closeRecordStore();
            recordStore = RecordStore.openRecordStore("Preferences", true);
            return;
        }
        catch (Exception exception) {
            try {
                if (recordStore != null) {
                    recordStore.closeRecordStore();
                }
                return;
            }
            catch (Exception exception2) {
                return;
            }
        }
        catch (Throwable throwable) {
            try {
                if (recordStore != null) {
                    recordStore.closeRecordStore();
                }
            }
            catch (Exception exception) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void e(int n) {
        RecordStore recordStore = null;
        try {
            String string = null;
            switch (n) {
                case 0: 
                case 1: {
                    boolean bl;
                    i i2;
                    try {
                        recordStore = RecordStore.openRecordStore("DiamondRush", false);
                    }
                    catch (Exception exception) {}
                    if (recordStore == null) {
                        i2 = this;
                        bl = true;
                    } else {
                        i2 = this;
                        bl = false;
                    }
                    i2.O = bl;
                    recordStore.closeRecordStore();
                    if (n == 0) break;
                    byte[] byArray = new byte[1001];
                    i = byArray;
                    byArray[3] = 5;
                    i.i[8] = 4;
                    i.i[9] = 0;
                    i.i[10] = 0;
                    this.cw = 14;
                    this.cw += 6;
                    break;
                }
                case 2: {
                    string = "/map_angkor.out";
                }
                case 3: {
                    if (string == null) {
                        string = "/map_scotland.out";
                    }
                }
                case 4: {
                    if (string == null) {
                        string = "/map_tibet.out";
                    }
                    this.a = this.getClass().getResourceAsStream(d[n - 2]);
                    this.a.read();
                    int n2 = this.cw;
                    i.i[14 + ((n -= 2) << 1)] = (byte)this.cw;
                    i.i[14 + (n << 1) + 1] = (byte)(this.cw >> 8);
                    n = this.a.read();
                    i.i[this.cw++] = (byte)n;
                    i.i[this.cw++] = 0;
                    this.ay();
                    this.a(string);
                    i.i[this.cw++] = (byte)this.dK;
                    this.aw();
                    this.cw += n << 1;
                    for (int i3 = 0; i3 < n; ++i3) {
                        int n3;
                        int n4;
                        int n5 = this.cw;
                        i.i[n2 + 3 + (i3 << 1)] = (byte)n5;
                        i.i[n2 + 3 + (i3 << 1) + 1] = (byte)(n5 >> 8);
                        n5 = 0;
                        int n6 = 0;
                        int n7 = i.a(this.a);
                        int n8 = i.a(this.a);
                        byte[] byArray = new byte[n7 * n8];
                        this.a.read(byArray);
                        for (n4 = 0; n4 < n8; ++n4) {
                            for (n3 = 0; n3 < n7; ++n3) {
                                if (byArray[n3 + n4 * n7] != 2) continue;
                                n6 = (byte)(n6 + 1);
                            }
                        }
                        i[0] = (byte)(i[0] + n6);
                        i.i[this.cw++] = 0;
                        i.i[this.cw++] = n6;
                        i.i[this.cw++] = 0;
                        this.a.skip(n7 * n8);
                        n4 = this.cw;
                        this.cw += 2;
                        this.a.read(byArray);
                        for (n3 = 0; n3 < n8; ++n3) {
                            for (n6 = 0; n6 < n7; ++n6) {
                                if (byArray[n6 + n3 * n7] != 14 && byArray[n6 + n3 * n7] != 33) continue;
                                i.i[this.cw++] = (byte)n6;
                                i.i[this.cw++] = (byte)n3;
                                n5 = (byte)(n5 + 1);
                            }
                        }
                        i.i[n4] = 0;
                        i.i[n4 + 1] = n5;
                    }
                    this.a.close();
                    this.a = null;
                    System.gc();
                    break;
                }
            }
        }
        catch (Exception exception) {
            try {
                if (recordStore == null) return;
                recordStore.closeRecordStore();
                return;
            }
            catch (Exception exception2) {
                return;
            }
        }
        catch (Throwable throwable) {
            try {
                if (recordStore == null) throw throwable;
                recordStore.closeRecordStore();
                throw throwable;
            }
            catch (Exception exception) {}
            throw throwable;
        }
        try {
            if (recordStore == null) return;
            recordStore.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void w() {
        i.i[3] = (byte)this.az;
        i.i[11] = this.r;
    }

    private void x() {
        this.M = false;
        this.az = i[3];
        this.r = i[11];
        this.aZ = i.a(i, 4);
    }

    private byte a(int n, int n2) {
        int n3 = i.a(n, n2);
        return i[n3 + 2];
    }

    private void a(int n, int n2, byte by) {
        int n3 = i.a(n, n2);
        int n4 = n3 + 2;
        i[n4] = (byte)(i[n4] | by);
    }

    private static void a(int n, int n2) {
        if (i[n = i.c(n) + 1] < n2) {
            i.i[n] = (byte)n2;
        }
    }

    private static int b(int n) {
        int n2 = i.c(n) + 1;
        if (n2 >= 0 && n2 <= i.length) {
            return i[i.c(n) + 1];
        }
        return 0;
    }

    private static int c(int n) {
        block4: {
            int n2;
            block3: {
                block2: {
                    if (n >= 0) break block2;
                    n2 = 0;
                    break block3;
                }
                if (n < 3) break block4;
                n2 = 2;
            }
            n = n2;
        }
        return i.a(i, 14 + (n << 1));
    }

    private static int d(int n) {
        try {
            return i[i.c(n)];
        }
        catch (Exception exception) {
            return 0;
        }
    }

    private static int e(int n) {
        return i[i.c(n) + 2];
    }

    private static int a(int n, int n2) {
        return i.a(i, i.c(n) + 3 + (n2 << 1));
    }

    private int b(int n, int n2) {
        return i[i.a(n, n2)];
    }

    private int c(int n, int n2) {
        return i[i.a(n, n2) + 1];
    }

    private void a(int n, int n2, int n3, int n4) {
        int n5 = i.a(n, n2);
        n = i[n5 + 4];
        for (n2 = 0; n2 < n; ++n2) {
            if (i[n5 + 5 + n2 * 2] != n3 || i[n5 + 5 + n2 * 2 + 1] != n4) continue;
            i.i[n5 + 5 + n2 * 2] = 0;
            i.i[n5 + 5 + n2 * 2 + 1] = 0;
            int n6 = n5 + 3;
            i[n6] = (byte)(i[n6] + 1);
            return;
        }
    }

    private boolean a(int n, int n2, int n3, int n4) {
        int n5 = i.a(n, n2);
        n = i[n5 + 4];
        for (n2 = 0; n2 < n; ++n2) {
            if (i[n5 + 5 + n2 * 2] != n3 || i[n5 + 5 + n2 * 2 + 1] != n4) continue;
            return false;
        }
        return true;
    }

    private void y() {
        this.ao = 13;
        this.aq = 4;
        this.at = 408;
        this.k = (byte)5;
        this.c |= 0x80L;
        this.c |= 8L;
        this.ae = false;
        this.O = 16;
        this.P = 16;
        this.Q = 19;
        this.R = 18;
    }

    private void z() {
        int n = this.dV;
        int n2 = this.dW;
        long l = a[n][n2];
        int n3 = i.a(l, (byte)6, (byte)5);
        int n4 = i.a(l, (byte)11, (byte)3);
        int n5 = 14;
        if (this.aB >= this.dK) {
            this.a(this.aA, this.aB, (byte)2);
        }
        if (n4 > 1) {
            int n6 = 0;
            while (n6 < n4) {
                int n7;
                int n8 = i.a(l, (byte)n5, (byte)4);
                long l2 = a[n8][n7 = i.a(l, (byte)(n5 += 4), (byte)4)];
                if (i.a(l2, (byte)3, (byte)3) == 1 && (n8 = i.a(l2, (byte)6, (byte)5)) > n3) {
                    dZ = n8;
                    this.cx = n;
                    this.cy = n2;
                    this.a(this.aA, dZ, (byte)64);
                    this.ac = true;
                }
                ++n6;
                n5 += 4;
            }
        } else {
            dZ = this.aB;
        }
        this.c(false);
    }

    /*
     * Unable to fully structure code
     */
    public final void paint(Graphics var1_1) {
        try {
            if (this.getWidth() < this.getHeight()) {
                try {
                    var2_2 = var1_1;
                    var1_1 = this;
                    try {
                        var2_2.setColor(0);
                        var2_2.setClip(0, 0, var1_1.getWidth(), var1_1.getHeight());
                        var2_2.fillRect(0, 0, var1_1.getWidth(), var1_1.getHeight());
                        var2_2.setColor(0xFFFFFF);
                        var3_14 = var1_1.getWidth() >> 1;
                        var4_21 = (var1_1.getHeight() >> 1) - 40;
                        c.a(var2_2, d.a(34), var3_14, var4_21, var1_1.getWidth() - 100);
                    }
                    catch (Exception v0) {}
                    this.hideNotify();
                    this.showNotify();
                    return;
                }
                catch (Exception v1) {
                    v1.printStackTrace();
                    return;
                }
            }
            try {
                this.a = var1_1;
                this.a.setClip(0, 0, 320, 240);
                switch (i.b) {
                    case 24: {
                        var1_1 = this;
                        var2_3 = null;
                        var3_15 = i.a;
                        i.a.d = 15;
                        var1_1.a.setColor(0);
                        var1_1.a.fillRect(0, 0, 320, 240);
                        for (var4_22 = 0; var4_22 < 6; ++var4_22) {
                            var5_27 = -1;
                            switch (var4_22) {
                                case 0: {
                                    var5_27 = 7;
                                    v2 = " 6 - Add " + String.valueOf(var1_1.aZ);
                                    ** GOTO lbl60
                                }
                                case 1: {
                                    var5_27 = 8;
                                    v2 = " 7 - Add " + String.valueOf(var1_1.bb);
                                    ** GOTO lbl60
                                }
                                case 2: {
                                    var5_27 = 12;
                                    v2 = " 8 - x " + String.valueOf(var1_1.cA) + (var1_1.cA >= 4 ? " blue potion" : "");
                                    ** GOTO lbl60
                                }
                                case 3: {
                                    var5_27 = 11;
                                    v2 = " 9 - " + i.a[var1_1.S != false ? 43 : 42];
                                    ** GOTO lbl60
                                }
                                case 4: {
                                    var5_27 = 10;
                                    v2 = " 0 - " + i.a[var1_1.T != false ? 43 : 42];
                                    ** GOTO lbl60
                                }
                                case 5: {
                                    var5_27 = -1;
                                    v2 = "";
lbl60:
                                    // 6 sources

                                    var2_3 = v2;
                                }
                            }
                            var6_41 = (var4_22 + 1) * 30;
                            if (var5_27 >= 0) {
                                var3_15.b(var1_1.a, i.a[var5_27], 150, var6_41, 17);
                            }
                            var6_41 += var3_15.d;
                            if (var5_27 == -1) {
                                v3 = var3_15;
                                v4 = var1_1.a;
                                v5 = var2_3;
                                v6 = 150;
                                v7 = var6_41;
                                v8 = 17;
                            } else {
                                var3_15.b(var1_1.a, i.a[9], 150, var6_41, 24);
                                v3 = var3_15;
                                v4 = var1_1.a;
                                v5 = var2_3;
                                v6 = 150;
                                v7 = var6_41;
                                v8 = 20;
                            }
                            v3.b(v4, v5, v6, v7, v8);
                        }
                        var2_3 = "Pound (#) - Pass levels ";
                        if (var1_1.ab) {
                            v9 = new StringBuffer().append(var2_3);
                            v10 = "on";
                        } else {
                            v9 = new StringBuffer().append(var2_3);
                            v10 = "off";
                        }
                        var2_3 = v9.append(v10).toString();
                        var3_15.b(var1_1.a, var2_3, 150, 240 - 3 * var3_15.b() - 5, 17);
                        var3_15.b(var1_1.a, "(Press 9 while gameplay to", 150, 240 - 2 * var3_15.b() - 5, 17);
                        var3_15.b(var1_1.a, "skip the level)", 150, 240 - var3_15.b() - 5, 17);
                        super.I();
                        super.J();
                        break;
                    }
                    case 34: {
                        var1_1 = this;
                        var3_16 = i.a;
                        i.a.d = 2;
                        var1_1.a.setColor(0);
                        var1_1.a.fillRect(0, 0, 320, 240);
                        switch (var1_1.dd) {
                            case 1: {
                                var2_4 = "Tips";
                                i.o(var1_1.a[1]);
                                super.av();
                                break;
                            }
                            case 0: {
                                var2_4 = "Mix";
                                var3_16.a(var1_1.a, i.a[var1_1.a[0]], 10, 15, 20);
                                break;
                            }
                            default: {
                                var2_4 = "";
                            }
                        }
                        var3_16.d = 2;
                        var3_16.b(var1_1.a, var2_4, 40, 228, 20);
                        var3_16.b(var1_1.a, "" + var1_1.a[var1_1.dd], 120, 228, 20);
                        var3_16.a(var1_1.a, "Use up, down, left and right", 10, 190, 20);
                        var3_16.a(var1_1.a, "to navigate", 10, 205, 20);
                        super.I();
                        super.J();
                        break;
                    }
                    case 22: {
                        this.aB();
                        break;
                    }
                    case 33: {
                        var1_1 = this;
                        if (!var1_1.av) break;
                        var1_1.a.setColor(0);
                        var1_1.a.setClip(0, 0, 320, 240);
                        var1_1.a.fillRect(0, 0, 320, 240);
                        var2_5 = i.a[18] + "\n\n" + i.a[29] + "\n" + i.a[37] + "\n" + i.a[38] + "\n\n" + i.a[119] + "\n\n" + i.a(i.a[118]) + "\n" + i.a(i.a[67]);
                        i.a.a(var1_1.a, var2_5, 160, 10, 17);
                        super.I();
                        var1_1.av = false;
                        break;
                    }
                    case 20: {
                        i.a(this.a, i.a, i.a(i.a[61]), 160, 90, 17, 20, true);
                        break;
                    }
                    case 17: {
                        var1_1 = this;
                        var2_6 = var1_1.aR;
                        var3_17 = i.a;
                        var4_23 = var1_1.a;
                        var4_23.setColor(2496263);
                        var4_23.fillRect(0, 0, 320, 240);
                        switch (var2_6) {
                            case 5: {
                                if (var1_1.bd == 0) {
                                    if ((var1_1.u & 32) != 0) {
                                        var4_23.drawImage(i.b[5][0], 288, 176, 0);
                                        if (var2_6 == 5 && i.aS < (var6_42 = (var5_28 = i.a[9]).a(0)) << 1) {
                                            var5_28.a(var4_23, 0, i.aS << 1, 288, 176, 0, 0, 0);
                                        }
                                    }
                                    var4_23.drawImage(i.b[28][0], 268, 178, 0);
                                }
                            }
                            case 4: {
                                if (var2_6 != 4 || (var5_29 = -100 + i.aS * 10) > 0) {
                                    var5_29 = 0;
                                }
                                i.a[0].a.a(var4_23, 12, 0, var5_29 + 7, 175, 0, 0, 0);
                                var3_17.a(var4_23, i.a[78], 160, 182, 17);
                                var5_31 = String.valueOf(var1_1.bd);
                                var3_17.a(var4_23, var5_31, 160, 200, 17);
                                if (var1_1.bc == 0) {
                                    if ((var1_1.u & 16) != 0) {
                                        var4_23.drawImage(i.b[5][0], 288, 136, 0);
                                        if (var2_6 == 4 && i.aS < (var5_32 = (var6_43 = i.a[9]).a(0)) << 1) {
                                            var6_43.a(var4_23, 0, i.aS >> 1, 288, 136, 0, 0, 0);
                                        }
                                    }
                                    var4_23.drawImage(i.b[28][0], 268, 138, 0);
                                }
                            }
                            case 3: {
                                if (var2_6 != 3 || (var5_33 = -100 + i.aS * 10) > 0) {
                                    var5_33 = 0;
                                }
                                i.a[0].a.a(var4_23, 10, 0, var5_33 + 7, 139, 0, 0, 0);
                                var3_17.a(var4_23, i.a[68], 160, 142, 17);
                                var5_34 = String.valueOf(var1_1.bc);
                                var3_17.a(var4_23, var5_34, 160, 160, 17);
                                if (var1_1.bb == var1_1.ba) {
                                    if ((var1_1.u & 8) != 0) {
                                        var4_23.drawImage(i.b[5][0], 288, 96, 0);
                                        if (var2_6 == 3 && i.aS < (var5_35 = (var6_45 = i.a[9]).a(0)) << 1) {
                                            var6_45.a(var4_23, 0, i.aS >> 1, 288, 96, 0, 0, 0);
                                        }
                                    }
                                    var4_23.drawImage(i.b[28][0], 268, 98, 0);
                                }
                            }
                            case 2: {
                                if (var2_6 != 2 || (var5_36 = -100 + i.aS * 10) > 0) {
                                    var5_36 = 0;
                                }
                                i.a[i.a(3)].a(var4_23, 0, var5_36 + 7, 95, 0, 0, 0);
                                var3_17.a(var4_23, i.a[48], 160, 102, 17);
                                var5_37 = var1_1.bb + "/" + var1_1.ba;
                                var3_17.a(var4_23, var5_37, 160, 120, 17);
                                if (var1_1.aZ == var1_1.aY) {
                                    if ((var1_1.u & 4) != 0) {
                                        var4_23.drawImage(i.b[5][0], 288, 56, 0);
                                        if (var2_6 == 2 && i.aS < (var5_38 = (var6_46 = i.a[9]).a(0)) >> 1) {
                                            var6_46.a(var4_23, 0, i.aS << 1, 288, 56, 0, 0, 0);
                                        }
                                    }
                                    var4_23.drawImage(i.b[28][0], 268, 58, 0);
                                }
                            }
                            case 1: {
                                if (var2_6 != 1 || (var5_39 = -100 + i.aS * 10) > 0) {
                                    var5_39 = 0;
                                }
                                i.a[i.a(2)].a(var4_23, 0, var5_39 + 7, 55, 0, 0, 0);
                                var3_17.a(var4_23, i.a[19], 160, 62, 17);
                                if (var2_6 != 1 || (var6_47 = i.aS >> 1) > var1_1.aZ) {
                                    var6_47 = var1_1.aZ;
                                }
                                var5_40 = var6_47 + "/" + var1_1.aY;
                                var3_17.a(var4_23, var5_40, 160, 80, 17);
                            }
                            case 0: {
                                if (var2_6 != 0) ** GOTO lbl210
                                var5_27 = -100 + i.aS * 10;
                                var6_47 = var5_27 - 320;
                                if (var5_27 > 0) {
                                    var5_27 = 0;
                                }
                                if (var6_47 <= 0) ** GOTO lbl212
                                ** GOTO lbl211
lbl210:
                                // 1 sources

                                var5_27 = 0;
lbl211:
                                // 2 sources

                                var6_47 = 0;
lbl212:
                                // 2 sources

                                var3_17.b(var4_23, i.c[i.g[var1_1.aA][var1_1.aB] - 1], var5_27 + 160, 15, 17);
                                var3_17.b(var4_23, i.a[14], var6_47 + 160, 32, 17);
                            }
                        }
                        i.a.b(var1_1.a, i.a[var1_1.aR == 5 ? 17 : 65], 5, 240 - (var3_17.a.getHeight() - 10), 36);
                        break;
                    }
                    case 4: {
                        var1_1 = this;
                        var1_1.H();
                        break;
                    }
                    case 7: {
                        this.H();
                        break;
                    }
                    case 30: {
                        i.b(this.a, true);
                        this.f(200);
                        if (i.aS % 15 < 7) break;
                        i.b.b(this.a, i.a[46], 160, 200, 17);
                        break;
                    }
                    case 2: {
                        this.H();
                        break;
                    }
                    case 5: {
                        if (!this.R) {
                            this.a.setClip(0, a.e, 320, 240 - a.e);
                            this.K();
                            this.a.setClip(0, 0, 320, 240);
                        } else {
                            this.K();
                        }
                        if (i.f == null || !this.R) break;
                        this.av();
                        break;
                    }
                    case 28: {
                        this.br = 11;
                        this.K();
                        break;
                    }
                    case 8: 
                    case 9: 
                    case 21: 
                    case 35: {
                        this.K();
                        break;
                    }
                    case 6: {
                        var1_1 = this;
                        var2_7 = i.a[0];
                        var1_1.a.setColor(0);
                        var1_1.a.fillRect(0, 0, 320, 240);
                        var2_7.b = 96;
                        var4_24 = 0;
                        if (i.aS > 40) {
                            var2_7.a = 179;
                            var2_7.a(1);
                            var5_27 = i.aS - 40 << 2;
                            if (var5_27 > 29) {
                                var5_27 = 29;
                                if (i.aS < 42) {
                                    var6_48 = 42 - i.aS;
                                    var4_24 = 0 + var6_48 * var6_48 % ((var6_48 >> 1) + 1);
                                    v11 = var2_7.a;
                                    v12 = var1_1.a;
                                    v13 = 10;
                                    v14 = 178;
                                    v15 = var4_24 + 96;
                                } else {
                                    v11 = var2_7.a;
                                    v12 = var1_1.a;
                                    v13 = 4;
                                    v14 = 178;
                                    v15 = 96;
                                }
                                v11.a(v12, v13, v14, v15, 0, 0, 0);
                                var2_7.e = 0;
                            } else {
                                var2_7.a.a(var1_1.a, 10, 178, 96, 0, 0, 0);
                            }
                            var2_7.b = var5_27 + 96;
                        } else {
                            var2_7.a = (i.aS << 2) - 1 + 18;
                        }
                        var2_7.b += var4_24;
                        var2_7.a(var1_1.a);
                        var2_7.a.a(var1_1.a, 5, 178, var4_24 + 120, 0, 0, 0);
                        break;
                    }
                    case 1: {
                        this.D();
                        break;
                    }
                    case 12: {
                        var1_1 = this;
                        var1_1.a.setColor(0);
                        var1_1.a.fillRect(0, 0, 320, 240);
                        var2_8 = i.a;
                        var2_8.b(var1_1.a, i.a[26], 160, 50, 17);
                        if (var1_1.k == 2) {
                            v16 = var2_8;
                            v17 = var1_1.a;
                            v18 = i.a[49];
                            v19 = 0;
                            v20 = 240 - (var2_8.a.getHeight() - 10);
                            v21 = 36;
                        } else {
                            var2_8.b(var1_1.a, i.a[16], 0, 240 - (var2_8.a.getHeight() - 10), 36);
                            var3_18 = i.a[126] + " " + (i.a(i.i, 4) < 500 ? i.a(i.i, 4) : 500) + " " + i.a[19];
                            v16 = var2_8;
                            v17 = var1_1.a;
                            v18 = var3_18;
                            v19 = 160;
                            v20 = 160;
                            v21 = 17;
                        }
                        v16.b(v17, v18, v19, v20, v21);
                        break;
                    }
                    case 0: 
                    case 3: {
                        break;
                    }
                    case 15: {
                        var1_1 = this;
                        if (var1_1.au) {
                            i.f = Image.createImage(200, 146);
                        }
                        if (!var1_1.av) ** GOTO lbl389
                        var1_1.av = false;
                        var1_1.aw = true;
                        var2_9 = var1_1;
                        var2_9.a.setClip(0, 0, 320, 240);
                        var3_19 = 0;
                        var4_25 = 0;
                        var5_27 = 0;
                        var6_49 = -1;
                        switch (var2_9.aA) {
                            case 0: {
                                var3_19 = 939282;
                                var4_25 = 3111750;
                                var5_27 = 8635434;
                                v22 = 1;
                                ** GOTO lbl347
                            }
                            case 1: {
                                var3_19 = 869201;
                                var4_25 = 4022666;
                                var5_27 = 5873874;
                                v22 = 4;
                                ** GOTO lbl347
                            }
                            case 2: {
                                var3_19 = 5210510;
                                var4_25 = 3711421;
                                var5_27 = 7469567;
                                v22 = 64;
lbl347:
                                // 3 sources

                                var6_49 = v22;
                            }
                        }
                        var2_9.a.setColor(var3_19);
                        var2_9.a.fillRect(0, 0, 320, 240);
                        i.b.b(var2_9.a, i.a[var6_49], 160, 12, 17);
                        i.c = i.f.getGraphics();
                        i.c.setColor(var3_19);
                        i.c.fillRect(0, 0, 200, 146);
                        i.a[23].a(i.c, 0, 100, 66, 0, 0, 0);
                        var2_9.a.setColor(var4_25);
                        var2_9.a.fillRoundRect(2, 198, 316, a.h, 8, 8);
                        var2_9.a.setColor(var5_27);
                        var2_9.a.drawRoundRect(2, 198, 316, a.h, 8, 8);
                        super.I();
                        super.J();
                        i.a.b(var2_9.a, i.a[60], 298, 234, 40);
                        if (i.a[17] != null) {
                            i.a[17].a(var2_9.a, 12, 10, 201, 0, 0, 0);
                            i.a[17].a(var2_9.a, 10, 230, 203, 0, 0, 0);
                            i.a[17].a(var2_9.a, 11, 130, 203, 0, 0, 0);
                        }
                        i.c.delete(0, i.c.length());
                        i.c.append(var2_9.az);
                        i.a.b(var2_9.a, i.c.toString(), 42, 213, 20);
                        i.c.delete(0, i.c.length());
                        i.c.append(i.a(i.i, 4));
                        i.a.b(var2_9.a, i.c.toString(), 150, 213, 20);
                        i.c.delete(0, i.c.length());
                        var6_49 = i.a(i.i, 6);
                        var3_19 = i.i[0];
                        if (var6_49 >= var3_19) {
                            i.c.append(var6_49).append("/").append(var6_49);
                        } else {
                            i.c.append(var6_49).append("/").append(var3_19);
                        }
                        i.a.b(var2_9.a, i.c.toString(), 250, 213, 20);
                        var2_9.au = false;
                        super.az();
lbl389:
                        // 2 sources

                        if (!var1_1.aw) ** GOTO lbl555
                        var1_1.a.drawImage(i.f, 60, 51, 0);
                        var2_9 = var1_1;
                        var3_19 = 0;
                        var4_25 = 0;
                        switch (var2_9.aA) {
                            case 0: {
                                var3_19 = 3111750;
                                v23 = 8635434;
                                ** GOTO lbl406
                            }
                            case 1: {
                                var3_19 = 4022666;
                                v23 = 5873874;
                                ** GOTO lbl406
                            }
                            case 2: {
                                var3_19 = 3711421;
                                v23 = 7469567;
lbl406:
                                // 3 sources

                                var4_25 = v23;
                            }
                        }
                        var2_9.a.setColor(var3_19);
                        var2_9.a.fillRoundRect(2, a.g, 316, a.f, 8, 8);
                        var2_9.a.setColor(var4_25);
                        var2_9.a.drawRoundRect(2, a.g, 316, a.f, 8, 8);
                        var2_9 = var1_1;
                        var3_19 = 77 + var2_9.dV * 13 + 6;
                        var4_25 = 33 + var2_9.dW * 13 + 6;
                        if (var2_9.dV == var2_9.dX && var2_9.dW == var2_9.dY) ** GOTO lbl486
                        var5_27 = 77 + var2_9.dX * 13 + 6;
                        var6_49 = 33 + var2_9.dY * 13 + 6;
                        if ((super.a(var2_9.aA, var2_9.aB + 1) & 2) != 0 && var2_9.aB + 1 == i.dZ || var2_9.aB == i.dZ) {
                            var2_9.ap = true;
                        }
                        if (var2_9.ap) ** GOTO lbl424
                        var2_9.ap = super.h();
                        if (var2_9.ap) {
                            var2_9.av = true;
                        }
                        ** GOTO lbl489
lbl424:
                        // 1 sources

                        v24 = var3_19;
                        v25 = var4_25;
                        var7_52 = var6_49;
                        var4_25 = var5_27;
                        var3_19 = v25;
                        var5_27 = v24;
                        var6_50 = var2_9;
                        if (var6_50.an) {
                            var6_50.an = false;
                            var6_50.dM = var5_27;
                            var6_50.dN = var3_19;
                            var6_50.dO = 0;
                            var6_50.dP = var4_25 - var5_27;
                            var6_50.dQ = var7_52 - var3_19;
                            var6_50.dR = 0;
                            var6_50.dS = 0;
                            var6_50.dT = 10;
                            var6_50.dU = 10;
                        }
                        if (var6_50.dP < 0) {
                            var6_50.dT = -10;
                            var6_50.dP = -var6_50.dP;
                        }
                        if (var6_50.dQ < 0) {
                            var6_50.dU = -10;
                            var6_50.dQ = -var6_50.dQ;
                        }
                        var6_50.ao = var6_50.dT <= 0;
                        v26 = var3_19 = var6_50.ao != false ? 7 : 6;
                        if (var6_50.dQ > var6_50.dP) ** GOTO lbl466
                        var6_50.dR = 2 * var6_50.dP;
                        var6_50.dS = 2 * var6_50.dQ;
                        if ((var6_50.dT >= 0 || var6_50.dM > var4_25) && (var6_50.dT <= 0 || var6_50.dM < var4_25)) ** GOTO lbl460
                        var4_25 = 77 + var6_50.dX * 13 + 6;
                        var7_52 = 33 + var6_50.dY * 13 + 6;
                        i.a[17].a(var6_50.a, var3_19, var4_25, var7_52, 0, 0, 0);
                        var6_50.an = true;
                        v27 = true;
                        ** GOTO lbl482
lbl460:
                        // 1 sources

                        i.a[17].a(var6_50.a, var3_19, var6_50.dM, var6_50.dN, 0, 0, 0);
                        var6_50.dM += var6_50.dT;
                        var6_50.dO += var6_50.dS;
                        if (var6_50.dO <= var6_50.dP) ** GOTO lbl481
                        var6_50.dN += var6_50.dU;
                        ** GOTO lbl480
lbl466:
                        // 1 sources

                        var6_50.dR = 2 * var6_50.dQ;
                        var6_50.dS = 2 * var6_50.dP;
                        if ((var6_50.dU >= 0 || var6_50.dN > var7_52) && (var6_50.dU <= 0 || var6_50.dN < var7_52)) ** GOTO lbl475
                        var4_25 = 77 + var6_50.dX * 13 + 6;
                        var7_52 = 33 + var6_50.dY * 13 + 6;
                        i.a[17].a(var6_50.a, var3_19, var4_25, var7_52, 0, 0, 0);
                        var6_50.an = true;
                        v27 = true;
                        ** GOTO lbl482
lbl475:
                        // 1 sources

                        i.a[17].a(var6_50.a, var3_19, var6_50.dM, var6_50.dN, 0, 0, 0);
                        var6_50.dN += var6_50.dU;
                        var6_50.dO += var6_50.dS;
                        if (var6_50.dO <= var6_50.dQ) ** GOTO lbl481
                        var6_50.dM += var6_50.dT;
lbl480:
                        // 2 sources

                        var6_50.dO -= var6_50.dR;
lbl481:
                        // 3 sources

                        v27 = false;
lbl482:
                        // 3 sources

                        if (v27) {
                            var2_9.dV = var2_9.dX;
                            var2_9.dW = var2_9.dY;
                        }
                        ** GOTO lbl489
lbl486:
                        // 1 sources

                        if (var2_9.aw) {
                            var5_27 = var2_9.ao != false ? 7 : 6;
                            i.a[17].a(var2_9.a, var5_27, var3_19, var4_25, 0, 0, 0);
                        }
lbl489:
                        // 5 sources

                        var2_9 = var1_1;
                        var5_27 = i.a(i.a[var2_9.dV][var2_9.dW], (byte)6, (byte)5);
                        if (var5_27 >= var2_9.dK) ** GOTO lbl505
                        if (!i.b) ** GOTO lbl500
                        v28 = i.b;
                        v29 = var2_9.a;
                        v30 = i.c[var5_27];
                        v31 = 234;
                        v32 = a.i;
                        v33 = 40;
                        ** GOTO lbl521
lbl500:
                        // 1 sources

                        v28 = i.b;
                        v29 = var2_9.a;
                        v34 = i.c;
                        v35 = var5_27;
                        ** GOTO lbl517
lbl505:
                        // 1 sources

                        if (i.b) {
                            v28 = i.b;
                            v29 = var2_9.a;
                            v30 = i.c[var5_27 + 10 - var2_9.dK + 1];
                            v31 = 234;
                            v32 = a.i;
                            v33 = 40;
                        } else {
                            v28 = i.b;
                            v29 = var2_9.a;
                            v34 = i.c;
                            v35 = var5_27 + 10 - var2_9.dK + 1;
lbl517:
                            // 2 sources

                            v30 = v34[v35];
                            v31 = 8;
                            v32 = a.i;
                            v33 = 36;
                        }
lbl521:
                        // 3 sources

                        v28.b(v29, v30, v31, v32, v33);
                        var2_9 = var1_1;
                        if (var2_9.dV == var2_9.dX && var2_9.dW == var2_9.dY) {
                            var5_27 = i.a(i.a[var2_9.dV][var2_9.dW], (byte)6, (byte)5);
                            var6_51 = super.b(var2_9.aA, var5_27);
                            if (var6_51 > (var5_27 = super.c(var2_9.aA, var5_27))) {
                                var6_51 = var5_27;
                            }
                            i.c.delete(0, i.c.length());
                            i.c.append(var6_51);
                            i.c.append('/');
                            i.c.append(var5_27);
                            i.a.a(i.c.toString());
                            var5_27 = h.a + 6 + 14;
                            var4_25 = 77 + var2_9.dV * 13 + 6;
                            var7_52 = 33 + var2_9.dW * 13 + 6;
                            var3_19 = var4_25 - (var5_27 >> 1);
                            var6_51 = var7_52 - 17 + 21;
                            if (var6_51 <= 50) {
                                var6_51 = 50;
                                var3_19 = var4_25 + 20;
                                if (var3_19 + var5_27 >= 280) {
                                    var3_19 = var4_25 - var5_27 + -20;
                                }
                            }
                            if (var3_19 <= 25) {
                                var3_19 = 25;
                            }
                            if (var3_19 + var5_27 >= 280) {
                                var3_19 = 230;
                            }
                            i.a(var2_9.a, var3_19, var6_51 - 15, var5_27, 17, 37042, 0);
                            i.a.b(var2_9.a, i.c.toString(), var3_19 + 2, var6_51 + 2 + 8, 20);
                            if (i.a[17] != null) {
                                i.a[17].a(var2_9.a, 10, var3_19 + var5_27 - 2 - 14, var6_51 + 2 - 1, 0, 0, 0);
                            }
                        }
lbl555:
                        // 6 sources

                        if (!var1_1.aw || var1_1.dV != var1_1.dX || var1_1.dW != var1_1.dY) break;
                        var1_1.aw = false;
                        break;
                    }
                    case 18: {
                        var1_1 = this;
                        var3_20 = 0;
                        var2_10 = "/ms.f";
                        var2_11 = false;
                        var2_12 = "/ms.f";
                        i.a[17] = i.a("/ms.f", var3_20, 0, 0);
                        super.R();
                        this.av = true;
                        i.b = (byte)25;
                        this.en = this.n;
                        this.g = i.a[125] + " " + i.a(i.i, 4) + " " + i.a[19];
                    }
                    case 25: {
                        this.aA();
                        break;
                    }
                    case 26: {
                        break;
                    }
                    case 27: {
                        this.B();
                        break;
                    }
                    case 31: {
                        if (!this.Q) break;
                        this.Q = false;
                        this.a.setColor(0);
                        this.a.fillRect(0, 0, 320, 240);
                        i.a.a(this.a, i.a(i.a[this.O != false ? 39 : 21]), 160, 120, 3);
                        this.J();
                        this.I();
                        break;
                    }
                    case 16: {
                        this.K();
                        break;
                    }
                    case 29: {
                        this.A();
                    }
                }
                var1_1 = this;
                var2_13 = i.a;
                if (i.eq > 0) {
                    var2_13.a(var1_1.h);
                    var4_26 = h.b;
                    var5_27 = h.a;
                    if (var1_1.er == -1) {
                        var1_1.er = 320 - var5_27 >> 1;
                    }
                    if (var1_1.es == -1) {
                        var1_1.es = 240 - var4_26 >> 1;
                    }
                    var1_1.a.setClip(var1_1.er - 6, var1_1.es - 3, var5_27 + 12, var4_26 + 26 + 6);
                    i.a(var1_1.a, var1_1.er - 6, var1_1.es - 3, var5_27 + 12, var4_26 + 6, var1_1.et, var1_1.eu);
                    var2_13.a(var1_1.a, var1_1.h, var1_1.er, var1_1.es + 26, 0);
                }
                return;
            }
            catch (Throwable v36) {
                return;
            }
        }
        catch (Exception v37) {
            return;
        }
    }

    private static String a(String stringArray) {
        stringArray = c.a((String)stringArray, 300);
        String string = "";
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            string = string + stringArray[i2] + "\n";
        }
        return string;
    }

    private void a(Graphics graphics, boolean bl, int n, int n2) {
        graphics.setClip(0, 0, 320, 240);
        int n3 = 0;
        int n4 = 0;
        if (n != 0 || n2 != 0) {
            n3 -= 24;
            n4 -= 24;
        }
        while (n4 < 240) {
            for (int i2 = n3; i2 < 320; i2 += 24) {
                graphics.drawImage(b[8][0], i2 + n, n4 + n2, 0);
            }
            n4 += 24;
        }
        a[10].a(graphics, 0, this.z + n, this.A + n2, 0, 0, 0);
        if (bl) {
            for (n4 = 0; n4 < 240; n4 += 24) {
                for (int i3 = 0; i3 < 320; i3 += 24) {
                    a[17].a(graphics, 16, i3, n4, 0, 0, 0);
                }
            }
        }
    }

    private void a(Graphics graphics, boolean bl) {
        this.a(graphics, bl, 0, 0);
    }

    private void A() {
        int n;
        int n2;
        if (this.av) {
            this.a(this.a, false, this.Y, this.Z);
            a[17].a(this.a, 11, 160 + a.c[6] + this.Y, 96 + a.c[7] + this.Z, 0, 0, 0);
            for (n2 = 0; n2 < 3; ++n2) {
                n = n2 + 52;
                a[n].a(this.a, 0, a.c[n2 << 1] + 160 - this.G + this.Y, a.c[(n2 << 1) + 1] + 96 - this.H + this.Z, 0, 0, 0);
            }
        }
        switch (this.W) {
            case 1: {
                if (this.av) break;
                this.a.setColor(this.X);
                this.a.fillRect(0, 0, 320, 240);
                for (n2 = 0; n2 < 3; ++n2) {
                    n = n2 + 52;
                    a[n].a(this.a, 0, a.c[n2 << 1] + 160 - this.G, a.c[(n2 << 1) + 1] + 96 - this.H, 0, 0, 0);
                }
                break;
            }
            case 2: {
                return;
            }
            case 3: {
                return;
            }
            case 4: {
                return;
            }
            case 5: {
                return;
            }
            case 6: {
                return;
            }
            case 7: {
                return;
            }
            case 8: {
                g.a(this.a);
                return;
            }
            case 9: 
            case 10: {
                g.a(this.a);
                String string = i.a(a[15] + "\n" + a[20]);
                a.a(string);
                i.a(this.a, (320 - h.a >> 1) - 3, (240 - h.b >> 1) - 3, h.a + 6, h.b + 6, 7096587, 0);
                a.a(this.a, string, 160, (240 - h.b >> 1) + 24, 17);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void B() {
        int n;
        block20: {
            int n2;
            int n3;
            int n4;
            i i2;
            block25: {
                block26: {
                    int n5;
                    block24: {
                        block22: {
                            block23: {
                                int n6;
                                block21: {
                                    int n7;
                                    block19: {
                                        block17: {
                                            block18: {
                                                if (this.av || this.g) {
                                                    this.a.setClip(0, 0, 320, 240);
                                                    this.a(this.a, false);
                                                    a[17].a(this.a, 11, 160 + a.c[6], 96 + a.c[7] - 20, 0, 0, 0);
                                                    this.I();
                                                    this.J();
                                                    a.b(this.a, a[36], 298, 234, 10);
                                                    this.av = false;
                                                } else {
                                                    this.a.setClip(this.s + 160, this.t + 96, 14, 22);
                                                    a[10].a(this.a, 0, this.z, this.A, 0, 0, 0);
                                                }
                                                if (this.B == 0) break block17;
                                                this.g = false;
                                                this.av = true;
                                                for (n7 = 0; n7 < this.B; ++n7) {
                                                    if (!i.b(n7)) continue;
                                                    a[10].a(this.a, n7 + 1, this.z, this.A, 0, 0, 0);
                                                }
                                                this.a.setClip(0, 0, 320, 240);
                                                if (this.K >= this.J) break block18;
                                                a[9].a(this.a, 5, this.K, a.c[this.B << 1] + 160 - 12, a.c[(this.B << 1) + 1] + 84, 0, 0, 0);
                                                ++this.K;
                                                break block19;
                                            }
                                            if (this.y % this.x >= this.x >> 1) {
                                                a[10].a(this.a, this.B + 1, this.z, this.A, 0, 0, 0);
                                                ++this.C;
                                            }
                                            if (this.C < 15) break block19;
                                            i.a[this.B] = true;
                                            this.C = 0;
                                            this.B = 0;
                                            this.K = 0;
                                            this.h();
                                            this.g = true;
                                            this.av = false;
                                            break block19;
                                        }
                                        for (n7 = 0; n7 < 3; ++n7) {
                                            if (!a[n7]) continue;
                                            a[10].a(this.a, n7 + 1, this.z, this.A, 0, 0, 0);
                                        }
                                    }
                                    for (n = 0; n < 3; ++n) {
                                        if (!b[n]) continue;
                                        n7 = n + 52;
                                        if (this.D == n) continue;
                                        a[n7].a(this.a, 0, a.c[n << 1] + 160 - this.G, a.c[(n << 1) + 1] + 96 - this.H - 40, 0, 0, 0);
                                    }
                                    if (this.D == -1) break block20;
                                    this.av = true;
                                    n = this.D;
                                    i2 = this;
                                    n4 = n + 52;
                                    n3 = a.c[n << 1] + 160;
                                    n2 = a.c[(n << 1) + 1] + 96 - 40;
                                    n6 = n2 - i2.F;
                                    n5 = n3 - i2.E;
                                    if (n6 >= 0) break block21;
                                    i2.F -= 2;
                                    if (i2.F > n2) break block22;
                                    break block23;
                                }
                                if (n6 <= 0) break block22;
                                i2.F += 2;
                                if (i2.F < n2) break block22;
                            }
                            i2.F = n2;
                        }
                        if (n5 >= 0) break block24;
                        i2.E -= 3;
                        if (i2.E > n3) break block25;
                        break block26;
                    }
                    if (n5 <= 0) break block25;
                    i2.E += 3;
                    if (i2.E < n3) break block25;
                }
                i2.E = n3;
            }
            a[n4].a(i2.a, 0, i2.E - i2.G, i2.F - i2.H, 0, 0, 0);
            if (i2.E != n3) return;
            if (i2.F != n2) return;
            i2.E = n3;
            i2.F = n2;
            if (i2.I < 20) {
                if (i2.I % 2 == 1) {
                    n = 838860;
                    i2.a.setColor(0 + n * i2.I);
                    i2.a.fillRect(0, 0, 320, 240);
                }
                ++i2.I;
                return;
            }
            if (i2.K < i2.J) {
                a[9].a(i2.a, 5, i2.K, a.c[n << 1] + 160 - 12, a.c[(n << 1) + 1] + 84 - 40, 0, 0, 0);
                ++i2.K;
                return;
            }
            i2.K = 0;
            i2.I = 0;
            boolean bl = true;
            if (!bl) return;
            this.D = -1;
            if (!b[0]) return;
            if (!b[1]) return;
            if (!b[2]) return;
            this.e();
            this.av = true;
            this.i = true;
            b = (byte)29;
            return;
        }
        this.y %= this.x;
        this.a.setClip(this.q + 160, 96 + this.r, 14, 22);
        a[55].a(this.a, 0, this.y, 160 + this.q, 96 + this.r, 0, 0, 0);
        ++this.y;
        if (!this.g) return;
        String string = c.a(this.b, 300).length > 1 ? i.a(this.b + "\n" + this.c) : i.a(this.b) + this.c;
        a.a(string);
        n = (320 - h.a >> 1) - 3;
        int n8 = 170 - (i.a.a.getHeight() >> 1) - 3;
        int n9 = h.a + 6;
        int n10 = h.b + 3;
        this.a.setClip(n, n8 - 15, n9, n10 + 20);
        i.a(this.a, n, n8 - 15, n9, n10, 7096587, 0);
        a.a(this.a, string, 160, 170, 3);
        this.g = false;
    }

    private static void b(Graphics graphics, boolean bl) {
        graphics.drawImage(b, 0, 0, 20);
        graphics.drawImage(a, 0, 0, 20);
        if (bl) {
            graphics.drawImage(c, 160, 239, 33);
        }
    }

    private static void a(Graphics graphics, int n, int n2, int n3, int n4) {
        graphics.drawImage(d, n3 - n, n4 - n2, 0);
    }

    private void b(int n, int n2) {
        int n3 = this.a - this.a % 24;
        int n4 = this.b - this.b % 24;
        int n5 = this.a + cC - 24 - (this.a + cC - 24) % 24;
        int n6 = this.b + cD - 24 - (this.b + cD - 24) % 24;
        int n7 = n * 24;
        int n8 = n2 * 24;
        if (n7 >= n3 && n7 <= n5 && n8 >= n4 && n8 <= n6) {
            n3 = a[n][n2] & 0xFF;
            if (a[n][n2] < 80) {
                if (n3 == 4 || n3 == 16 || n3 == 15) {
                    this.c(n, n2);
                    return;
                }
                b.drawImage(b[8][0], n7 % cC, n8 % cD, 0);
            }
        }
    }

    private void c(int n, int n2) {
        int n3 = this.a - this.a % 24;
        int n4 = this.b - this.b % 24;
        int n5 = this.a + cC - 24 - (this.a + cC - 24) % 24;
        int n6 = this.b + cD - 24 - (this.b + cD - 24) % 24;
        if ((n *= 24) >= n3 && n <= n5 && (n2 *= 24) >= n4 && n2 <= n6) {
            this.a(n, n2, n, n2, false);
        }
    }

    public static int a(int n) {
        switch (n) {
            case 0: {
                return 42;
            }
            case 20: {
                return 43;
            }
            case 22: {
                i.a[45].a = 0;
                return 45;
            }
            case 23: {
                i.a[45].a = 1;
                return 45;
            }
            case 4: {
                return 56;
            }
            case 15: {
                i.a[57].a = 0;
                return 57;
            }
            case 14: {
                i.a[57].a = 1;
                return 57;
            }
            case 16: {
                return 58;
            }
            case 2: {
                i.a[59].a = 0;
                return 59;
            }
            case 3: {
                i.a[59].a = 1;
                return 59;
            }
            case 1: {
                return 60;
            }
        }
        return -1;
    }

    /*
     * Unable to fully structure code
     */
    private void a(int var1_1, int var2_2, int var3_3, int var4_4, boolean var5_5) {
        var5_6 = i.b;
        var6_7 = i.cC;
        var7_8 = i.cD;
        var8_9 = var1_1 % var6_7;
        var9_10 = var2_2 % var7_8;
        this.by = var9_10 - 24;
        this.bH = var2_2 / 24 - 1;
        while (var2_2 <= var4_4) {
            this.bx = var8_9 - 24;
            this.bG = var1_1 / 24 - 1;
            this.by += 24;
            ++this.bH;
            if (this.by >= var7_8) {
                this.by = 0;
            }
            for (var9_10 = var1_1; var9_10 <= var3_3; var9_10 += 24) {
                block26: {
                    block27: {
                        this.bx += 24;
                        ++this.bG;
                        if (this.bx >= var6_7) {
                            this.bx = 0;
                        }
                        if (this.bG < 0 || this.bG >= this.e || this.bH < 0 || this.bH >= this.f) continue;
                        this.bI = i.a[this.bG][this.bH];
                        this.bJ = i.a[this.bG][this.bH] & 255;
                        if (this.bI < 80) {
                            var5_6.drawImage(i.b[8][0], this.bx, this.by, 0);
                        }
                        if (this.bJ > -1 && this.bJ < 38) {
                            switch (this.bJ) {
                                case 4: {
                                    this.aJ = 20;
                                    this.aK = 7;
                                    this.bO = 0;
                                    this.bN = 0;
                                    break;
                                }
                                case 27: {
                                    this.aJ = 21;
                                    this.aK = 0;
                                    this.bO = 0;
                                    this.bN = 0;
                                    break;
                                }
                                case 15: {
                                    if (this.ce != 0) break;
                                    this.aJ = 14;
                                    v0 = this;
                                    v1 = 0 + this.ce * 5 / 10;
                                    break;
                                }
                                case 16: {
                                    if (this.ce != 9) break;
                                    this.aJ = 15;
                                    this.aK = 4 - this.ce * 5 / 10;
                                    if (this.aK >= 0) break;
                                    v0 = this;
                                    v1 = v0.aK = 0;
                                }
                            }
                        }
                        if (this.aJ != -1) {
                            if (i.b[this.aJ] == null) {
                                i.a[i.a(this.aJ)].a(var5_6, this.aK, this.bx + this.bN, this.by + this.bO, this.bP, 0, 0);
                            } else {
                                var5_6.drawImage(i.b[this.aJ][this.aK], this.bx + this.bN, this.by + this.bO, this.bP);
                            }
                            this.bP = 0;
                            this.aJ = -1;
                            this.bO = 0;
                            this.bN = 0;
                        }
                        if (this.bI == -1) break block26;
                        var10_11 = this.bI - 80;
                        if (var10_11 < 0) break block27;
                        this.aL = 0;
                        v2 = this;
                        v3 = var10_11;
                        ** GOTO lbl96
                    }
                    switch (this.bI) {
                        case 10: {
                            i.a[16].a(var5_6, 0, this.bx, this.by, 0, 0, 0);
                            break;
                        }
                        case 1: {
                            if (i.b[this.bG][this.bH] != 0 || i.e != null && i.e[this.bG][this.bH] != 0) break;
                            this.Q();
                            this.aM -= this.bR;
                            this.bO = 0;
                            break;
                        }
                        case 0: {
                            if (i.b[this.bG][this.bH] != 0 || i.e != null && i.e[this.bG][this.bH] != 0) break;
                            this.Q();
                            break;
                        }
                        case 34: {
                            if (this.ce != 9) break;
                            this.aL = 14;
                            v2 = this;
                            v3 = 0 + this.ce * 5 / 10;
                            ** GOTO lbl96
                        }
                        case 35: {
                            if (this.ce != 0) break;
                            this.aL = 15;
                            this.aM = 4 - this.ce * 5 / 10;
                            if (this.aM >= 0) break;
                            v2 = this;
                            v3 = 0;
lbl96:
                            // 3 sources

                            v2.aM = v3;
                        }
                    }
                    if (this.aL != -1) {
                        if (i.b[this.aL] == null) {
                            i.a[i.a(this.aL)].a(var5_6, this.aM, this.bx + this.bN, this.by + this.bO, this.bP, 0, 0);
                        } else {
                            var5_6.drawImage(i.b[this.aL][this.aM], this.bx + this.bN, this.by + this.bO, this.bP);
                        }
                        this.aL = -1;
                        this.bP = 0;
                        this.bO = 0;
                        this.bN = 0;
                    }
                }
                if (this.k != 2) continue;
                var11_13 = var5_6;
                var10_12 = this;
                if (i.a[10] == null) {
                    var13_16 = 0;
                    var12_14 = "/mmv.f";
                    var12_15 = false;
                    var12_14 = "/mmv.f";
                    i.a[10] = i.a("/mmv.f", var13_16, 0, 0);
                }
                if (var10_12.bG < 60 || var10_12.bG >= 65 || var10_12.bH < 2 || var10_12.bH >= 7) continue;
                i.a[10].a(var11_13, 4 + (var10_12.bH - 2) * 5 + var10_12.bG - 60, var10_12.bx, var10_12.by, 0, 0, 0);
            }
            var2_2 += 24;
        }
    }

    private void C() {
        this.a.setClip(0, 0, 320, 178);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void D() {
        block209: {
            block207: {
                block208: {
                    var1_1 = this.a;
                    var2_2 = i.aS;
                    this.bQ = (this.k & 4096) == 0 ? this.l : 0;
                    var1_1.translate(0, 31);
                    this.bk = 0;
                    this.C();
                    if (this.bj > 0) {
                        this.bk = this.bj * var2_2 % ((this.bj >> 1) + 1) % 12;
                    }
                    if (this.bk > this.b) {
                        this.bk = this.b;
                    }
                    this.b -= this.bk;
                    this.cI = this.a / 24;
                    this.cJ = this.b / 24;
                    this.cK = this.a % 24;
                    this.cL = this.b % 24;
                    this.bR = (var2_2 & 63) >> 1;
                    if (this.bR >= 4) {
                        this.bR = 0;
                    }
                    var3_3 = this.a - this.cK;
                    var4_8 = this.b - this.cL;
                    var5_16 = this.a + i.cC - 24 - (this.a + i.cC - 24) % 24;
                    var6_22 = this.b + i.cD - 24 - (this.b + i.cD - 24) % 24;
                    if (i.cE == -1) {
                        this.a(var3_3, var4_8, var5_16, var6_22, false);
                        i.cE = var3_3;
                        i.cF = var5_16;
                        i.cG = var4_8;
                        i.cH = var6_22;
                    }
                    if (i.cE != var3_3) {
                        if (i.cE < var3_3) {
                            var7_25 = i.cF + 24;
                            v0 = var5_16;
                        } else {
                            var7_25 = var3_3;
                            v0 = i.cE - 24;
                        }
                        var8_47 = v0;
                        this.a(var7_25, var4_8, var8_47, var6_22, false);
                        i.cE = var3_3;
                        i.cF = var5_16;
                    }
                    if (i.cG != var4_8) {
                        if (i.cG < var4_8) {
                            var7_25 = i.cH + 24;
                            v1 = var6_22;
                        } else {
                            var7_25 = var4_8;
                            v1 = i.cG - 24;
                        }
                        var8_47 = v1;
                        this.a(var3_3, var7_25, var5_16, var8_47, false);
                        i.cG = var4_8;
                        i.cH = var6_22;
                    }
                    var4_9 = var1_1;
                    var3_4 = this;
                    var5_16 = var3_4.a % i.cC;
                    var6_22 = var3_4.b % i.cD;
                    var7_25 = (var3_4.a + 320) % i.cC;
                    var8_47 = (var3_4.b + 178) % i.cD;
                    if (var7_25 <= var5_16) break block207;
                    if (var8_47 <= var6_22) break block208;
                    v2 = var4_9;
                    v3 = var5_16;
                    v4 = var6_22;
                    v5 = 0;
                    v6 = 0;
                    break block209;
                }
                i.a((Graphics)var4_9, var5_16, var6_22, 0, 0);
                v2 = var4_9;
                v3 = var5_16;
                v4 = 0;
                v5 = 0;
                ** GOTO lbl88
            }
            if (var8_47 > var6_22) {
                i.a((Graphics)var4_9, var5_16, var6_22, 0, 0);
                v2 = var4_9;
                v3 = 0;
                v4 = var6_22;
                v5 = 320 - var7_25;
                v6 = 0;
            } else {
                i.a((Graphics)var4_9, var5_16, var6_22, 0, 0);
                i.a((Graphics)var4_9, var5_16, 0, 0, 178 - var8_47);
                i.a((Graphics)var4_9, 0, var6_22, 320 - var7_25, 0);
                v2 = var4_9;
                v3 = 0;
                v4 = 0;
                v5 = 320 - var7_25;
lbl88:
                // 2 sources

                v6 = 178 - var8_47;
            }
        }
        i.a(v2, v3, v4, v5, v6);
        this.C();
        var4_9 = var1_1;
        var3_4 = this;
        for (var5_16 = -1; var5_16 < 9; ++var5_16) {
            for (var6_22 = -1; var6_22 < 15; ++var6_22) {
                block213: {
                    block210: {
                        block212: {
                            block211: {
                                var3_4.bG = var6_22 + var3_4.cI;
                                var3_4.bH = var5_16 + var3_4.cJ;
                                if (var3_4.bG < 0 || var3_4.bG >= var3_4.e || var3_4.bH < 0 || var3_4.bH >= var3_4.f) continue;
                                var3_4.bI = i.a[var3_4.bG][var3_4.bH];
                                var3_4.bJ = i.a[var3_4.bG][var3_4.bH] & 255;
                                var3_4.bx = var6_22 * 24 - var3_4.cK;
                                var3_4.by = var5_16 * 24 - var3_4.cL;
                                var3_4.C();
                                if (var3_4.bJ <= -1 || var3_4.bJ >= 38) break block210;
                                switch (var3_4.bJ) {
                                    case 35: {
                                        v7 = var3_4;
                                        ** GOTO lbl225
                                    }
                                    case 34: {
                                        i.a[27].a((Graphics)var4_9, 2, 0, var3_4.bx, var3_4.by, 0, 0, 0);
                                        break;
                                    }
                                    case 14: 
                                    case 33: {
                                        var8_47 = var3_4.bJ;
                                        var7_26 = var3_4;
                                        var9_49 = i.a[var7_26.bG][var7_26.bH] >> 8;
                                        if (var9_49 == 255) {
                                            var9_49 = 0;
                                        }
                                        v8 = var10_55 = 14 == var8_47 ? 8 : 22;
                                        if (i.a[var10_55] == null) break;
                                        i.a[var10_55].a(var7_26.a, 0, var9_49, var7_26.bx, var7_26.by, 0, 0, 0);
                                        break;
                                    }
                                    case 6: {
                                        var7_27 = var3_4;
                                        var8_47 = var7_27.bG;
                                        var9_50 = var7_27.bH;
                                        var7_27.aJ = 26;
                                        var7_27.aK = 0;
                                        if (!i.i(var8_47, var9_50) || i.b[var8_47][var9_50] > 12) ** GOTO lbl132
                                        v9 = var7_27;
                                        v10 = -(i.b[var8_47][var9_50] - 12);
                                        ** GOTO lbl144
lbl132:
                                        // 1 sources

                                        if (!var7_27.c(var8_47, var9_50)) ** GOTO lbl141
                                        if ((var7_27.k & 4096) != 0) ** GOTO lbl138
                                        if (var7_27.j > 12) ** GOTO lbl145
                                        v9 = var7_27;
                                        v10 = -(var7_27.j - 12);
                                        ** GOTO lbl144
lbl138:
                                        // 1 sources

                                        v9 = var7_27;
                                        v10 = 12;
                                        ** GOTO lbl144
lbl141:
                                        // 1 sources

                                        if (!(var7_27.c(var8_47 - 1, var9_50) != false ? var7_27.bQ == 4 && var7_27.j > 12 : var7_27.c(var8_47 + 1, var9_50) != false && var7_27.bQ == 2 && var7_27.j > 12)) ** GOTO lbl145
                                        v9 = var7_27;
                                        v10 = var7_27.j - 12;
lbl144:
                                        // 4 sources

                                        v9.bO = v10;
lbl145:
                                        // 3 sources

                                        var7_27.bO += 24;
                                        var7_27.bP = 36;
                                        if (var3_4.by + 24 >= 178) break;
                                        var4_9.clipRect(var3_4.bx, var3_4.by, 24, 24);
                                        break;
                                    }
                                    case 15: {
                                        if (var3_4.ce == 0 || var3_4.ce > 5) break;
                                        var3_4.aJ = 14;
                                        var3_4.aK = 0 + var3_4.ce * 5 / 10;
                                        break;
                                    }
                                    case 16: {
                                        if (var3_4.ce == 9 || var3_4.ce < 5) break;
                                        var3_4.aJ = 15;
                                        var3_4.aK = 4 - var3_4.ce * 5 / 10;
                                        if (var3_4.aK >= 0) break;
                                        var3_4.aK = 0;
                                        break;
                                    }
                                    case 7: {
                                        var7_28 = var3_4;
                                        var8_47 = var7_28.bG;
                                        var9_51 = var7_28.bH;
                                        var11_56 = ((i.a[var8_47][var9_51] >> 8 & 240) >> 4) - 1;
                                        if (var11_56 < 0) {
                                            var11_56 = 0;
                                        }
                                        if ((i.a[var8_47][var9_51 - 1] & 255) != 9 && (i.a[var8_47][var9_51 - 1] & 255) != 8) {
                                            i.a[56].a(var7_28.a, var11_56, var7_28.bx, var7_28.by, 0, 0, 0);
                                        }
                                        var7_28.aJ = 4;
                                        var7_28.aK = (byte)(var11_56 + 3);
                                        break;
                                    }
                                    case 4: {
                                        if (i.a[var3_4.bG][var3_4.bH] >> 8 < var3_4.aC) break;
                                        var7_29 = var3_4;
                                        var3_4.aJ = 20;
                                        if (i.a[var7_29.bG][var7_29.bH] >> 8 >= var7_29.aC) {
                                            v11 = var7_29;
                                            v12 = 0 + (i.aS >> 1) % 7;
                                        } else {
                                            v11 = var7_29;
                                            v12 = 7;
                                        }
                                        v11.aK = v12;
                                        break;
                                    }
                                    case 5: {
                                        System.out.println("k_AOBJ_STAGE_END ..................");
                                    }
                                    case 28: {
                                        System.out.println("k_AOBJ_SECRET_EXIT ..................");
                                        var3_4.aJ = 11;
                                        if (var3_4.aA == 0 && (var3_4.aB == 4 || var3_4.aB == 7) || var3_4.aA == 1 && var3_4.aB == 8 || var3_4.aA == 2 && (var3_4.aB == 1 || var3_4.aB == 2 || var3_4.aB == 6 || var3_4.aB == 7)) {
                                            v13 = var3_4;
                                            v14 = 1;
                                        } else {
                                            v13 = var3_4;
                                            v14 = v13.aK = 0;
                                        }
                                        if (var3_4.bJ != 28 || (var3_4.aA != 1 || var3_4.aB != 3) && (var3_4.aA != 2 || var3_4.aB != 4)) break;
                                        var3_4.aK = 1;
                                        break;
                                    }
                                    case 8: 
                                    case 9: {
                                        var7_30 = var3_4;
                                        var8_47 = i.a[var7_30.bG][var7_30.bH] >> 8;
                                        v15 = var7_30.aJ = var7_30.bJ == 9 ? 22 : 23;
                                        if ((var8_47 & 512) != 0) {
                                            v16 = var7_30;
                                            v17 = (byte)(1 + (i.aS >> 2) % 6);
                                        } else if ((var8_47 & 256) != 0) {
                                            v16 = var7_30;
                                            v17 = 1;
                                        } else {
                                            v16 = var7_30;
                                            v17 = 0;
                                        }
                                        v16.aK = v17;
                                        break;
                                    }
                                    case 3: {
                                        var7_25 = (i.a[var3_4.bG][var3_4.bH] >> 8) - 1;
                                        if (var7_25 < 0) break;
                                        var3_4.aJ = 12;
                                        var3_4.aK = (byte)var7_25;
                                        break;
                                    }
                                    case 37: {
                                        i.a[27].a((Graphics)var4_9, 2, 0, var3_4.bx, var3_4.by, 0, 0, 0);
                                        v7 = var3_4;
lbl225:
                                        // 2 sources

                                        var7_31 = v7;
                                        i.b = i.a[30];
                                        var7_31.bK = 1;
                                        var7_31.bL = i.a(i.b, 1, i.aS % i.a(i.b, 1));
                                    }
                                }
                                if (var3_4.aJ == -1) break block211;
                                if (i.b[var3_4.aJ] == null) {
                                    i.a[i.a(var3_4.aJ)].a((Graphics)var4_9, var3_4.aK, var3_4.bx + var3_4.bN, var3_4.by + var3_4.bO, var3_4.bP, 0, 0);
                                } else {
                                    var4_9.drawImage(i.b[var3_4.aJ][var3_4.aK], var3_4.bx + var3_4.bN, var3_4.by + var3_4.bO, var3_4.bP);
                                }
                                var3_4.bP = 0;
                                var3_4.aJ = -1;
                                var4_9.setClip(0, -var3_4.bk, 320, 178);
                                break block212;
                            }
                            if (i.b == null) break block210;
                            if (var3_4.bK != -1) {
                                i.b.a((Graphics)var4_9, var3_4.bK, var3_4.bL, var3_4.bx + var3_4.bN, var3_4.by + var3_4.bO, 0, 0, 0);
                                var3_4.bK = -1;
                            }
                            i.b = null;
                        }
                        var3_4.bO = 0;
                        var3_4.bN = 0;
                    }
                    if (var3_4.bI == -1) continue;
                    if ((byte)(var3_4.bI - 80) >= 0) break block213;
                    var8_47 = i.b[var3_4.bG][var3_4.bH];
                    switch (var3_4.bI) {
                        case 49: {
                            var7_32 = var3_4;
                            var8_47 = var7_32.bG;
                            var9_49 = var7_32.bH;
                            var10_55 = i.b[var8_47][var9_49];
                            var11_56 = i.b[var8_47][var9_49];
                            var12_59 = var10_55 & 7;
                            var7_32.bN = var11_56 * i.g[var12_59];
                            var7_32.bO = var11_56 * i.g[var12_59 + 8];
                            i.b = i.a[38];
                            var13_67 = (var10_55 & 28672) >> 12;
                            if ((var13_67 == 2 || var13_67 == 4 || var12_59 == 2 || var12_59 == 4) && i.a[var8_47 - 1][var9_49] >= 0 && i.a[var8_47 + 1][var9_49] >= 0 || (var13_67 == 1 || var13_67 == 3 || var12_59 == 1 || var12_59 == 3) && i.a[var8_47][var9_49 - 1] >= 0 && i.a[var8_47][var9_49 + 1] >= 0) {
                                var7_32.bK = 1;
                                v18 = var7_32;
                                v19 = 0;
                            } else {
                                if (var12_59 == 1 || var12_59 == 3) {
                                    v20 = var7_32;
                                    v21 = var12_59 - 1;
                                } else {
                                    v20 = var7_32;
                                    v21 = 0;
                                }
                                v20.bK = v21;
                                v18 = var7_32;
                                v19 = (i.aS >> 1) % i.b.a(var7_32.bK);
                            }
                            v18.bL = v19;
                            var7_32.F();
                            break;
                        }
                        case 48: {
                            var7_33 = var3_4;
                            var8_47 = i.b[var7_33.bG][var7_33.bH];
                            if ((var8_47 & 8) != 0) break;
                            i.b = i.a[32];
                            var9_49 = var8_47 & 7;
                            var10_55 = (var8_47 & 16) == 0 ? 1 : 0;
                            if (var10_55 != 0 && var9_49 == 2 || var10_55 == 0 && var9_49 == 4) {
                                v22 = var7_33;
                                v23 = 2;
                            } else {
                                v22 = var7_33;
                                v23 = var10_55 != 0 ? 1 : 0;
                            }
                            v22.bL = v23;
                            var11_56 = i.b[var7_33.bG][var7_33.bH];
                            var7_33.bN = var11_56 * i.g[var9_49];
                            var7_33.bO = var11_56 * i.g[var9_49 + 8];
                            break;
                        }
                        case 21: {
                            var7_34 = var3_4;
                            var8_47 = i.b[var7_34.bG][var7_34.bH] & 7;
                            i.b = i.a[29];
                            if ((i.b[var7_34.bG][var7_34.bH] & 8) != 0) ** GOTO lbl320
                            switch (var8_47) {
                                case 1: {
                                    v24 = var7_34;
                                    v25 = 2;
                                    ** GOTO lbl315
                                }
                                case 2: {
                                    v24 = var7_34;
                                    v25 = 1;
                                    ** GOTO lbl315
                                }
                                case 4: {
                                    v24 = var7_34;
                                    v25 = 0;
lbl315:
                                    // 3 sources

                                    v24.bL = v25;
                                }
                            }
                            var7_34.bN = i.b[var7_34.bG][var7_34.bH] * i.g[var8_47];
                            v26 = var7_34;
                            v27 = i.b[var7_34.bG][var7_34.bH] * i.g[var8_47 + 8];
                            ** GOTO lbl338
lbl320:
                            // 1 sources

                            switch (var8_47) {
                                case 1: {
                                    v28 = var7_34;
                                    v29 = 14;
                                    ** GOTO lbl332
                                }
                                case 2: {
                                    v28 = var7_34;
                                    v29 = 13;
                                    ** GOTO lbl332
                                }
                                case 4: {
                                    v28 = var7_34;
                                    v29 = 12;
lbl332:
                                    // 3 sources

                                    v28.bK = v29;
                                }
                            }
                            var7_34.bL = i.a(i.b, var7_34.bK, (int)i.b[var7_34.bG][var7_34.bH]);
                            var9_49 = (i.b.a[var7_34.bK] + var7_34.bL) * 5;
                            var7_34.bN = i.b.c[var9_49 + 2];
                            v26 = var7_34;
                            v27 = i.b.c[var9_49 + 3];
lbl338:
                            // 2 sources

                            v26.bO = v27;
                            break;
                        }
                        case 46: {
                            var7_35 = var3_4;
                            i.b = i.a[29];
                            var7_35.bK = i.b[var7_35.bG][var7_35.bH] & 31;
                            if (var7_35.bK == 8 || var7_35.bK == 9) {
                                var7_35.bL = 0;
                                var8_47 = i.b.a[var7_35.bK] * 5;
                                var7_35.bN = i.b.c[var8_47 + 2];
                                v30 = var7_35;
                                v31 = -i.b[var7_35.bG][var7_35.bH];
                            } else {
                                var8_47 = (i.b[var7_35.bG][var7_35.bH] & 8160) >> 5;
                                var7_35.bL = var9_49 = i.a(i.b, var7_35.bK, var8_47);
                                var10_55 = (i.b.a[var7_35.bK] + var9_49) * 5;
                                var7_35.bN = i.b.c[var10_55 + 2];
                                v30 = var7_35;
                                v31 = i.b.c[var10_55 + 3];
                            }
                            v30.bO = v31;
                            break;
                        }
                        case 45: {
                            var7_36 = var3_4;
                            var8_47 = i.b[var7_36.bG][var7_36.bH];
                            i.b = i.a[28];
                            var7_36.bK = var8_47 & 15;
                            var9_49 = (i.b[var7_36.bG][var7_36.bH] & 2088960) >> 13;
                            if (var7_36.bK == 10) {
                                var11_56 = 0;
                                var13_67 = i.b.a(var7_36.bK);
                                v32 = var12_60 = 0;
                                for (var10_55 = var9_49; var10_55 > 0; var10_55 -= i.b.a(var7_36.bK, var12_60)) {
                                    var11_56 = var12_60;
                                    v32 = (var12_60 + 1) % var13_67;
                                }
                                var7_36.bL = var11_56;
                            } else {
                                var7_36.bL = var10_55 = i.a(i.b, var7_36.bK, var9_49);
                                var11_56 = (i.b.a[var7_36.bK] + var10_55) * 5;
                                var7_36.bN = i.b.c[var11_56 + 2];
                                var7_36.bO = i.b.c[var11_56 + 3];
                            }
                            var7_36.F();
                            break;
                        }
                        case 44: {
                            var7_37 = var3_4;
                            var3_4.bK = (i.b[var7_37.bG][var7_37.bH] & 56) >> 3;
                            i.b = i.a[27];
                            switch (var7_37.bK) {
                                case 3: {
                                    var7_37.bL = 0;
                                    var7_37.bO = -i.b[var7_37.bG][var7_37.bH];
                                    ** GOTO lbl398
                                }
                                case 1: {
                                    v33 = var7_37;
                                    v34 = (i.b[var7_37.bG][var7_37.bH] >> 1) % i.a[27].a(1);
                                    break;
                                }
                                default: {
                                    v33 = var7_37;
                                    v34 = i.b[var7_37.bG][var7_37.bH];
                                }
                            }
                            v33.bL = v34;
lbl398:
                            // 2 sources

                            var3_4.bL = 0;
                            break;
                        }
                        case 12: {
                            var7_38 = var3_4;
                            var11_56 = 0;
                            var10_55 = var7_38.by;
                            var9_49 = var7_38.bx;
                            var8_48 = var7_38;
                            var12_61 = i.b[18];
                            var8_48.a.drawImage(var12_61[1], var9_49 + 6, var10_55, 0);
                            var8_48.a.drawImage(var12_61[0], var9_49 + 3, var10_55 + 7, 0);
                            var7_39 = 0;
                            if (var8_48.aa < 10) {
                                var7_39 = i.a[0].a[0][0].getWidth() >> 1;
                                ++var7_39;
                            }
                            i.a(var8_48.a, var9_49 + 19 - var7_39, var10_55 + 13, var8_48.aa, i.a[0].a[0], 0);
                            break;
                        }
                        case 36: {
                            var7_40 = var3_4;
                            var8_47 = i.b[var7_40.bG][var7_40.bH] == 1 ? 1 : 0;
                            var9_52 = i.a[5];
                            var9_52.a(var7_40.a, var8_47, (i.aS >> 1) % var9_52.a(var8_47), var7_40.bx, var7_40.by, 0, 0, 0);
                            break;
                        }
                        case 18: {
                            var7_41 = var3_4;
                            i.b = i.a[6];
                            var7_41.bK = 0;
                            if (var7_41.ce == 0) {
                                v35 = var7_41;
                                v36 = 0;
                            } else if (var7_41.ce == 9) {
                                v35 = var7_41;
                                v36 = 2;
                            } else {
                                v35 = var7_41;
                                v36 = var7_41.cf < 0 ? 1 : 3;
                            }
                            v35.bL = v36;
                            break;
                        }
                        case 34: {
                            if (var3_4.ce == 9 || var3_4.ce < 5) break;
                            var3_4.aL = 14;
                            var3_4.aM = 0 + var3_4.ce * 5 / 10;
                            break;
                        }
                        case 35: {
                            if (var3_4.ce == 0 || var3_4.ce > 5) break;
                            var3_4.aL = 15;
                            var3_4.aM = 4 - var3_4.ce * 5 / 10;
                            if (var3_4.aM >= 0) break;
                            var3_4.aM = 0;
                            break;
                        }
                        case 28: {
                            var7_42 = var3_4;
                            var8_47 = -1;
                            var9_49 = 3;
                            var10_55 = i.b[var7_42.bG][var7_42.bH];
                            if ((var10_55 & 7) == 3) {
                                var8_47 = 1;
                                var9_49 = 0;
                            }
                            if ((var10_55 & 8) == 0) {
                                var11_56 = var7_42.aO;
                                v37 = var7_42.aN;
                            } else {
                                var11_56 = var7_42.aQ;
                                v37 = var7_42.aP;
                            }
                            var12_62 = v37;
                            for (var13_67 = 0; var13_67 < var11_56; ++var13_67) {
                                i.a[11].a(var7_42.a, var9_49 + var13_67 * var8_47, var7_42.bx + 3, var7_42.by + var8_47 * (var12_62 - var13_67 * 24), 0, 0, 0);
                            }
                            if (var8_47 == 1) {
                                v38 = i.a[42];
                                v39 = var7_42.a;
                                v40 = i.a[var7_42.bG][var7_42.bH - 1] - 80;
                                v41 = var7_42.bx;
                                v42 = var7_42.by - 24;
                            } else {
                                v38 = i.a[42];
                                v39 = var7_42.a;
                                v40 = i.a[var7_42.bG][var7_42.bH + 1] - 80;
                                v41 = var7_42.bx;
                                v42 = var7_42.by + 24;
                            }
                            v38.a(v39, v40, v41, v42, 0, 0, 0);
                            break;
                        }
                        case 16: {
                            var7_43 = var3_4;
                            if (i.a[var7_43.bG][var7_43.bH + 1] == 16) break;
                            var8_47 = i.b[var7_43.bG][var7_43.bH];
                            i.b = var9_53 = i.a[1];
                            var10_55 = i.b[var7_43.bG][var7_43.bH];
                            var12_63 = 0;
                            v43 = var7_43.bK = (var8_47 & 7) == 4 ? 1 : 0;
                            if (var10_55 != 0) {
                                var13_67 = 0;
                                for (var11_56 = 36 - var10_55; var11_56 > 0; var11_56 -= var9_53.a(var7_43.bK, var13_67)) {
                                    var12_63 = var13_67++;
                                }
                            }
                            var7_43.bL = var12_63;
                            var13_67 = (var9_53.a[var7_43.bK] + var12_63) * 5;
                            var7_43.bN = var9_53.c[var13_67 + 2];
                            break;
                        }
                        case 14: {
                            var7_44 = var3_4;
                            var8_47 = i.aS;
                            var9_49 = i.b[var7_44.bG][var7_44.bH];
                            var10_55 = i.b[var7_44.bG][var7_44.bH];
                            if (var10_55 > 24) {
                                var10_55 = 24;
                            }
                            var11_56 = var9_49 & 7;
                            var7_44.bN = var10_55 * i.g[var11_56];
                            var7_44.bO = var10_55 * i.g[var11_56 + 8];
                            if ((var9_49 & 8) == 0) {
                                var7_44.aL = 10;
                                var7_44.aM = (var8_47 >> 1) % 3;
                                if (var11_56 == 3) break;
                                var12_64 = (var8_47 >> 1) % 5;
                                var7_44.a.drawImage(i.b[10][var12_64 + 3], var7_44.bx + var7_44.bN - (var12_64 << 2), var7_44.by + (var7_44.bO + 24), 36);
                                break;
                            }
                            var7_44.aL = 10;
                            var7_44.aM = 2 - (var8_47 >> 1) % 3;
                            if (var11_56 == 3) break;
                            var12_65 = (var8_47 >> 1) % 5;
                            var7_44.a.drawImage(i.b[10][var12_65 + 8], var7_44.bx + 24 - 12 + var7_44.bN + var12_65 * 3, var7_44.by + (var7_44.bO + 24), 36);
                            if ((var8_47 >> 1 & 1) != 0 || i.a[var7_44.bG - 1][var7_44.bH] < 0) break;
                            --var7_44.bN;
                            ++var7_44.bO;
                            break;
                        }
                        case 32: {
                            var7_45 = var3_4;
                            var7_45.a.setColor(13883367);
                            var10_55 = i.b[var7_45.bG][var7_45.bH];
                            if ((i.b[var7_45.bG][var7_45.bH] & 1) != 0) {
                                var8_47 = var7_45.bx;
                                var9_49 = var7_45.bx + 24 - var10_55;
                                v44 = var7_45;
                                v45 = 0;
                            } else {
                                var8_47 = var7_45.bx + 24;
                                var9_49 = var7_45.bx + var10_55;
                                v44 = var7_45;
                                v45 = 1;
                            }
                            v44.bL = v45;
                            var7_45.a.drawLine(var8_47, var7_45.by + 12, var9_49, var7_45.by + 12);
                            if (var10_55 <= 0) break;
                            i.a[0].a.a(var7_45.a, var7_45.bL, var9_49, var7_45.by + 12 - 2, 0);
                            break;
                        }
                        case 11: {
                            var7_46 = var3_4;
                            var8_47 = var7_46.bG;
                            var9_49 = var7_46.bH;
                            var7_46.aL = 6;
                            var10_55 = (i.b[var8_47][var9_49] & 3840) >> 8;
                            if (var10_55 >= 4) {
                                var7_46.aL = -1;
                                break;
                            }
                            if (var10_55 == 0) {
                                v46 = var7_46;
                                v47 = 0 + (i.aS >> 1) % 3;
                            } else {
                                v46 = var7_46;
                                v47 = var10_55 + 3 - 1;
                            }
                            v46.aM = v47;
                            var11_56 = i.b[var8_47][var9_49] & 7;
                            var7_46.bN = i.b[var8_47][var9_49] * i.g[var11_56] + 2;
                            var7_46.bO = i.b[var8_47][var9_49] * i.g[var11_56 + 8] + 2;
                            if ((i.b[var8_47][var9_49] & 16) != 0) ** GOTO lbl582
                            switch (var11_56) {
                                case 1: {
                                    var7_46.bN += 4;
                                    break;
                                }
                                case 2: {
                                    v48 = var7_46;
                                    v49 = v48;
                                    v50 = v48.bO + 4;
                                    ** GOTO lbl579
                                }
                                case 3: {
                                    var7_46.bN -= 4;
                                    break;
                                }
                                case 4: {
                                    v51 = var7_46;
                                    v49 = v51;
                                    v50 = v51.bO - 4;
lbl579:
                                    // 2 sources

                                    v49.bO = v50;
                                }
                            }
                            break;
lbl582:
                            // 1 sources

                            switch (var11_56) {
                                case 1: {
                                    var7_46.bN -= 4;
                                    break;
                                }
                                case 2: {
                                    v52 = var7_46;
                                    v53 = v52;
                                    v54 = v52.bO - 4;
                                    ** GOTO lbl598
                                }
                                case 3: {
                                    var7_46.bN += 4;
                                    break;
                                }
                                case 4: {
                                    v55 = var7_46;
                                    v53 = v55;
                                    v54 = v55.bO + 4;
lbl598:
                                    // 2 sources

                                    v53.bO = v54;
                                }
                            }
                            break;
                        }
                        case 30: {
                            i.b = i.a[20];
                            var3_4.bK = 0;
                            var3_4.bL = 0 + (var8_47 - 1) * 7 / 16;
                            break;
                        }
                        case 37: {
                            var3_4.aL = 17;
                            var3_4.aM = 0 + (var8_47 - 1) * 3 / 8;
                            break;
                        }
                        case 23: {
                            i.b = i.a[12];
                            var3_4.bL = 0;
                            var3_4.b((byte)23);
                            break;
                        }
                        case 22: {
                            i.b = i.a[12];
                            var3_4.bL = 1;
                            var3_4.b((byte)22);
                            break;
                        }
                        case 43: {
                            var3_4.c((byte)var3_4.bI);
                            break;
                        }
                        case 19: {
                            var3_4.c((byte)var3_4.bI);
                            break;
                        }
                        case 10: {
                            break;
                        }
                        case 47: {
                            v56 = var3_4;
                            ** GOTO lbl656
                        }
                        case 9: {
                            var3_4.Q();
                            if ((i.b[var3_4.bG][var3_4.bH] & 0xFC00000) != 0x8400000) break;
                            var3_4.bN += var3_4.au;
                            var3_4.bO += var3_4.av;
                            break;
                        }
                        case 4: {
                            break;
                        }
                        case 5: {
                            break;
                        }
                        case 2: {
                            break;
                        }
                        case 1: {
                            if ((i.b[var3_4.bG][var3_4.bH] & -2147483648) == 0 && var3_4.bR == 0) break;
                            v56 = var3_4;
                            ** GOTO lbl656
                        }
                        case 0: {
                            if ((i.b[var3_4.bG][var3_4.bH] & -2147483648) == 0) break;
                            ** GOTO lbl654
                        }
                        case 6: {
                            break;
                        }
                        case 7: {
                            break;
                        }
lbl654:
                        // 2 sources

                        case 8: {
                            v56 = var3_4;
lbl656:
                            // 3 sources

                            v56.Q();
                        }
                    }
                }
                if (var3_4.aL != -1) {
                    if (i.b[var3_4.aL] == null) {
                        i.a[i.a(var3_4.aL)].a((Graphics)var4_9, var3_4.aM, var3_4.bx + var3_4.bN, var3_4.by + var3_4.bO, var3_4.bP, 0, 0);
                    } else {
                        var4_9.drawImage(i.b[var3_4.aL][var3_4.aM], var3_4.bx + var3_4.bN, var3_4.by + var3_4.bO, var3_4.bP);
                    }
                    var3_4.aL = -1;
                    var3_4.bP = 0;
                } else {
                    if (i.b == null) continue;
                    if (var3_4.bG == var3_4.co && var3_4.bH == var3_4.cp) {
                        i.c = i.b;
                        var3_4.ct = var3_4.bK;
                        var3_4.cs = var3_4.bL;
                        var3_4.cr = var3_4.bx + var3_4.bN;
                        var3_4.cq = var3_4.by + var3_4.bO;
                    }
                    if (var3_4.bK != -1) {
                        i.b.a((Graphics)var4_9, var3_4.bK, var3_4.bL, var3_4.bx + var3_4.bN, var3_4.by + var3_4.bO, 0, 0, 0);
                        var3_4.bK = -1;
                    } else {
                        i.b.a((Graphics)var4_9, var3_4.bL, var3_4.bx + var3_4.bN, var3_4.by + var3_4.bO, 0, 0, 0);
                    }
                    i.b = null;
                    var3_4.bM = 0;
                }
                var3_4.bO = 0;
                var3_4.bN = 0;
            }
        }
        if (i.a) {
            var1_1.setColor(0);
            var1_1.fillRect(0, 0, 320, 240);
            this.P();
            if (this.ad != this.ae) {
                v57 = var3_5 = this.ad;
                while (v57 != this.ae) {
                    var4_10 = i.a[var3_5 << 1] * 24 - this.a;
                    var5_16 = i.a[(var3_5 << 1) + 1] * 24 - this.b;
                    if (i.c[var3_5] < 0) {
                        v58 = i.a[2];
                        v59 = var1_1;
                        v60 = 0;
                        v61 = i.a(var6_23, 0, (int)i.b[var3_5]);
                    } else {
                        v58 = i.a[9];
                        v59 = var1_1;
                        v60 = i.c[var3_5];
                        v61 = i.b[var3_5];
                    }
                    v58.a(v59, v60, v61, var4_10, var5_16, 0, 0, 0);
                    v57 = ++var3_5 & 7;
                }
            }
            this.a.setClip(0, 0, 320, 240);
            var1_1.translate(0, -31);
            this.G();
            return;
        }
        this.P();
        if (this.l) {
            this.d(this.cK, this.cL);
        }
        if (this.aw > 0) {
            this.E();
        }
        if (this.k != 0) {
            var3_4 = this;
            switch (var3_4.k) {
                case 2: {
                    var4_9 = var3_4;
                    if (var4_9.t && var4_9.a == null && var4_9.bm == -1) {
                        i.a[15].a(var4_9.a, 0, i.aS >> 1 & 3, var4_9.bv, var4_9.bw - 24, 0, 0, 0);
                    }
                    var4_9 = var3_4;
                    if (var4_9.a + 320 > 1440 && var4_9.b + 240 > 48) {
                        if (i.a[10] == null) {
                            i.a[10] = i.a("/mmv.f", 0);
                        }
                        var5_17 = i.a[10];
                        if (super.c(60, 3) || super.c(61, 3)) {
                            var5_17.a(var4_9.a, 1, 1440 - var4_9.a, 48 - var4_9.b, 0, 0, 0);
                        }
                    }
                    if (var4_9.h <= 55 || !var4_9.e) break;
                    i.a[0].a(var4_9.a);
                    break;
                }
                case 1: {
                    var3_4.O();
                    break;
                }
                case 3: {
                    var3_4.M();
                    break;
                }
                case 4: {
                    var3_4.N();
                    break;
                }
                case 5: {
                    var3_4.L();
                }
            }
        }
        for (var3_6 = -1; var3_6 < 9; ++var3_6) {
            for (var4_11 = -1; var4_11 < 15; ++var4_11) {
                block216: {
                    block215: {
                        block214: {
                            var7_25 = var4_11 + this.cI;
                            var8_47 = var3_6 + this.cJ;
                            if (var7_25 < 0 || var7_25 >= this.e || var8_47 < 0 || var8_47 >= this.f) continue;
                            var5_18 = i.a[var7_25][var8_47] & 255;
                            var6_22 = i.a[var7_25][var8_47];
                            if (var5_18 >= 38 && var5_18 < 80) continue;
                            var9_54 = var4_11 * 24 - this.cK;
                            var10_55 = var3_6 * 24 - this.cL;
                            if (var5_18 < 20 || var5_18 >= 26) break block214;
                            v62 = i.a[3];
                            v63 = var1_1;
                            v64 = var5_18 -= 20;
                            v65 = (var2_2 >> 2) % (i.a[3].b[var5_18] & 255);
                            break block215;
                        }
                        switch (var5_18) {
                            case 36: {
                                var5_18 = (i.a[var7_25][var8_47] >> 8) - 1;
                                var5_18 = (0 + var5_18 * 7) / 16;
                                i.a[20].a(var1_1, 0, var5_18, var9_54, var10_55, 0, 0, 0);
                                break;
                            }
                            case 31: {
                                var5_18 = i.a[var7_25][var8_47] >> 8;
                                var11_58 = i.a[15];
                                var12_66 = (i.aS >> 1) % (var11_58.b[var5_18] & 255);
                                var11_58.a(this.a, var5_18, var12_66, var9_54, var10_55, 0, 0, 0);
                                break;
                            }
                            case 32: {
                                i.a[16].a(this.a, 0, i.a[var7_25][var8_47] >> 8 & 255, var9_54, var10_55, 0, 0, 0);
                                break;
                            }
                            default: {
                                v66 = (byte)(var5_18 - 80);
                                var5_18 = v66;
                                if (v66 < 0) break;
                                i.a[42].a(var1_1, var5_18, var9_54, var10_55, 0, 0, 0);
                            }
                        }
                        var5_18 = (i.a[var7_25][var8_47] & -268435456) >> 28;
                        if (var5_18 <= 0) break block216;
                        v62 = i.a[13];
                        v63 = var1_1;
                        v64 = 0;
                        v65 = var5_18;
                    }
                    v62.a(v63, v64, v65, var9_54, var10_55, 0, 0, 0);
                }
                if (var6_22 != 54) continue;
                i.a[7].a(var1_1, 0, i.a(i.a[7], 0, i.b[var7_25][var8_47]), var9_54, var10_55, 0, 0, 0);
            }
        }
        if (this.A) {
            var3_6 = (this.bB - this.cI) * 24 - this.cK + this.bz;
            var4_12 = (this.bC - this.cJ + 1) * 24 - this.cL + this.bA;
            var1_1.drawImage(i.a[13].a[0][0 + this.bD], var3_6, var4_12, 0);
            this.A = false;
        }
        if (this.aD != -1) {
            var1_1.drawImage(i.b[13][0], this.bv + -12, this.bw + -24 + 2, 3);
            var1_1.drawImage(i.b[this.aD][this.aE], this.bv + -12, this.bw + -24, 3);
        }
        if (this.ad != this.ae) {
            v67 = var3_6 = this.ad;
            while (v67 != this.ae) {
                var4_13 = i.a[var3_6 << 1] * 24 - this.a;
                var5_19 = i.a[(var3_6 << 1) + 1] * 24 - this.b;
                if (i.c[var3_6] < 0) {
                    v68 = i.a[2];
                    v69 = var1_1;
                    v70 = 0;
                    v71 = i.a(var6_24, 0, (int)i.b[var3_6]);
                } else {
                    v68 = i.a[9];
                    v69 = var1_1;
                    v70 = i.c[var3_6];
                    v71 = i.b[var3_6];
                }
                v68.a(v69, v70, v71, var4_13, var5_19, 0, 0, 0);
                v67 = ++var3_6 & 7;
            }
        }
        this.b += this.bk;
        if (this.x) {
            i.a(var1_1, i.b, i.a[15], 160, 120, 17, 19, false);
        }
        if (this.bn > i.aS && this.k != 2) {
            if (!this.aj && !this.h) {
                var3_6 = this.bn - i.aS;
                var4_14 = var3_6 < 20 ? (var3_6 - 10) * 320 / 20 : (var3_6 >= 50 ? (60 - var3_6) * 320 / 15 : 160);
                var5_20 = 320 - var4_14;
                i.a(var1_1, i.b, i.a[i.d[this.aA]], var4_14, 15, 17, 20, false);
                i.a(var1_1, i.b, i.c[i.g[this.aA][this.aB] - 1], var5_20, 50, 17, 20, false);
            }
        } else if (this.ak > i.aS) {
            i.a(var1_1, i.b, i.a[13], 160, a.c, 17, 20, false);
        } else if (this.ak == i.aS && this.r <= 2) {
            this.r = (byte)(this.r + 1);
            this.w();
        }
        switch (this.k) {
            case 4: {
                var3_7 = this;
                var4_15 = var3_7.a;
                var5_21 = i.a[5];
                if (var3_7.ao == 7) {
                    var6_22 = var5_21.a + i.aS * var3_7.ap % 48;
                    var7_25 = var5_21.b;
                    if (var3_7.S == 10) {
                        var7_25 -= 144;
                    }
                    i.a[7].a(var4_15, 1, i.aS % i.a[7].a(1), var6_22, var7_25, 0, 0, 0);
                    var3_7.g(var6_22, var7_25);
                    break;
                }
                if (var3_7.ao == 8 || var3_7.ao == 0) break;
                var3_7.a(var4_15, 3);
                break;
            }
            case 3: {
                if (this.ao == -1 || this.ao == 15) break;
                v72 = this;
                v73 = var1_1;
                v74 = 5;
                ** GOTO lbl863
            }
            case 5: {
                if (this.ao == -1 || this.ao == 15 || this.ao == 13 || this.ao == 12) break;
                v72 = this;
                v73 = var1_1;
                v74 = 4;
lbl863:
                // 2 sources

                v72.a(v73, v74);
            }
        }
        var1_1.translate(0, -31);
        var1_1.setClip(0, 0, 320, 240);
        if (this.a == null) {
            this.G();
        }
        if (this.e != null) {
            this.o = true;
            i.a(var1_1, i.a, i.a(this.e), 160, 152, 17, 4, true);
        }
        if (this.a != null && !i.a) {
            this.o = true;
            this.a.a(var1_1);
        }
        if (this.bl > 0) {
            this.o = true;
            var1_1.setColor(0);
            var1_1.fillRect(0, 0, 320, this.bl);
            var1_1.fillRect(0, 240 - this.bl, 320, this.bl);
            var1_1.translate(0, 31);
            this.P();
            if (i.c != null) {
                if (this.ct != -1) {
                    i.c.a(var1_1, this.ct, this.cs, (this.co - this.cI) * 24 - this.cK, (this.cp - this.cJ) * 24 - this.cL, 0, 0, 0);
                } else {
                    i.c.a(var1_1, this.cs, this.cr, this.cq, 0, 0, 0);
                }
            }
            var1_1.translate(0, -31);
        }
    }

    private void E() {
        int n = this.b - 24;
        int n2 = this.b + 240;
        int n3 = this.a;
        int n4 = this.a + 320;
        int n5 = (aS >> 1) % a[2].a(1);
        for (int i2 = 0; i2 < e.length; i2 += 3) {
            int n6;
            int n7;
            int n8;
            int n9;
            int n10;
            Graphics graphics;
            f f2;
            int n11 = 0;
            byte by = e[i2 + 2];
            int n12 = by * 24;
            if (n12 <= n || n12 >= n2) continue;
            int n13 = e[i2];
            byte by2 = e[i2 + 1];
            int n14 = n13 * 24;
            int n15 = by2 * 24 + 24;
            if (!(n14 >= n3 && n14 <= n4 || n15 >= n3 && n15 <= n4) && (n14 > n3 || n15 < n4)) continue;
            n14 -= n3;
            int n16 = n13 != 0 ? -1 : 0;
            boolean bl = true;
            if (a[n13 += n16][by] == 48 && (b[n13][by] & 8) != 0) {
                n14 -= 12;
                bl = false;
                if ((b[n13][by + 1] & 7) == 3) {
                    n11 = -b[n13][by + 1];
                } else {
                    n14 -= -b[n13][by + 1];
                }
            }
            n15 -= n3;
            n13 = by2 + (by2 < this.e - 1 ? (byte)1 : 0);
            by2 = 1;
            if (a[n13][by] == 48 && (b[n13][by] & 8) != 0) {
                n15 += 12;
                by2 = 0;
                if ((b[n13][by + 1] & 7) == 3) {
                    n11 = -b[n13][by + 1];
                } else {
                    n15 -= b[n13][by + 1];
                }
            }
            n11 = n12 - this.b + 10 + n11;
            this.a.setColor(1820159);
            this.a.drawLine(n14, n11, n15, n11);
            this.a.drawLine(n14, n11 += 2, n15, n11);
            this.a.setColor(14153215);
            this.a.drawLine(n14, --n11, n15, n11);
            if (bl) {
                f2 = a[2];
                graphics = this.a;
                n10 = 1;
                n9 = n5;
                n8 = n14;
                n7 = n11;
                n6 = 1;
            } else {
                if (by2 == 0) continue;
                f2 = a[2];
                graphics = this.a;
                n10 = 1;
                n9 = n5;
                n8 = n15;
                n7 = n11;
                n6 = 0;
            }
            f2.a(graphics, n10, n9, n8, n7, n6, 0, 0);
        }
    }

    private void F() {
        if ((b[this.bG][this.bH] & 7) == 1 && (a[this.bG][this.bH] & 0xFF) == 35) {
            this.bN = 0;
            this.bO = b[this.bG][this.bH];
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void d(int var1_1, int var2_2) {
        var3_3 = this.a;
        for (var4_4 = 0; var4_4 < 9; ++var4_4) {
            for (var5_5 = 0; var5_5 < 15; ++var5_5) {
                var7_7 = var5_5 + this.a / 24;
                var8_8 = var4_4 + this.b / 24;
                if (var7_7 < 0 || var7_7 >= this.e || var8_8 < 0 || var8_8 >= this.f) continue;
                var6_6 = i.e[var7_7][var8_8];
                var9_9 = var5_5 * 24 - var1_1;
                var10_10 = var4_4 * 24 - var2_2;
                if (var6_6 <= 0) continue;
                var12_12 = 0;
                v0 = var12_12;
                while (v0 <= 2) {
                    block14: {
                        block18: {
                            block17: {
                                block16: {
                                    block15: {
                                        if (i.a(var6_6, var12_12, (byte)0, (byte)3) == 0) break block14;
                                        var11_11 = (byte)(i.a(var6_6, var12_12, (byte)7, (byte)2) << 3);
                                        if (var11_11 > 0) {
                                            var11_11 = i.a(i.a(var6_6, var12_12, (byte)0, (byte)3), (byte)45, (byte)2) <= 1 ? (byte)(var11_11 - 24) : (byte)(24 - var11_11);
                                            this.C();
                                            var3_3.clipRect(var9_9, var10_10 + (var12_12 << 3), 24, 8);
                                        }
                                        var16_16 = var12_12;
                                        var15_15 = var6_6;
                                        var14_14 = var8_8;
                                        var13_13 = var7_7;
                                        var17_17 = (byte)i.a(var15_15, var16_16, (byte)0, (byte)3);
                                        var18_18 = i.a((int)var17_17, (byte)31, (byte)6);
                                        var19_19 = i.a((int)var17_17, (byte)37, (byte)6);
                                        var17_17 = i.a((int)var17_17, (byte)43, (byte)2);
                                        var15_15 = i.a(var15_15, var16_16, (byte)3, (byte)4);
                                        if (var18_18 != var13_13 || var19_19 != var14_14 || var17_17 != var16_16) break block15;
                                        switch (var15_15) {
                                            case 4: {
                                                v1 = 1;
                                                ** GOTO lbl36
                                            }
                                            case 5: {
                                                v1 = 2;
lbl36:
                                                // 2 sources

                                                var15_15 = v1;
                                            }
                                        }
                                        v2 = var15_15 << 1;
                                        break block16;
                                    }
                                    switch (var15_15) {
                                        case 6: {
                                            i.c(var13_13, var14_14, var16_16);
                                        }
                                    }
                                    v2 = var15_15 << 1;
                                }
                                var13_13 = v2;
                                var14_14 = v2 >> 1;
                                var15_15 = (var14_14 == 7 ? i.aS >> 3 : i.aS) & 1;
                                if (var14_14 != 15) break block17;
                                i.d.a(var3_3, var13_13 + this.cB, var9_9 + var11_11 - 8, var10_10 + (var12_12 << 3) + 8, 36, 0, 0);
                                ++this.cB;
                                if (this.cB > 2) {
                                    this.cB = 0;
                                }
                                break block14;
                            }
                            if (var14_14 != 14 && var14_14 != 11) break block18;
                            v3 = i.d;
                            v4 = var3_3;
                            v5 = var13_13 + var15_15;
                            v6 = var9_9 + var11_11;
                            v7 = var10_10;
                            ** GOTO lbl72
                        }
                        if (var14_14 == 8 && var12_12 == 0 && i.e[var7_7][var8_8 - 1] > 0) {
                            i.d.a(var3_3, 33, var9_9 + var11_11, var10_10, 20, 0, 0);
                            var12_12 = 3;
                        } else {
                            v3 = i.d;
                            v4 = var3_3;
                            v5 = var13_13 + var15_15;
                            v6 = var9_9 + var11_11;
                            v7 = var10_10 + (var12_12 << 3);
lbl72:
                            // 2 sources

                            v3.a(v4, v5, v6, v7, 20, 0, 0);
                            this.C();
                        }
                    }
                    v0 = (byte)(var12_12 + 1);
                }
            }
        }
    }

    private void G() {
        f f2;
        boolean bl = false;
        Graphics graphics = this.a;
        f f3 = a[0];
        if (f3 == null) {
            return;
        }
        graphics.translate(160, 240);
        if (this.o || b == 2) {
            f3.a(graphics, 0, 0, 0, 0, 0, 0);
            if (this.U) {
                f3.a(graphics, 19, -159, 0, 0, 0, 0);
            }
            f2 = f3;
        } else {
            bl = true;
            graphics.setClip(-160, -240, 320, 240);
            f2 = f3;
        }
        f2.a(graphics, 1, 0, 0, 0, 0, 0);
        if (this.p) {
            f3.a(graphics, 2, -150, 0, 0, 0, 0);
            f3.a(graphics, 3 + this.an, -150, 0, 0, 0, 0);
        }
        if (bl) {
            graphics.setClip(-160, -240, 320, 240);
        }
        if (this.n != this.cP || this.o || this.n <= 1) {
            Image[] imageArray = i.a[0].a[0];
            int n = this.n <= 1 ? 1 : 0;
            int n2 = -33 - (i[8] - 4) * imageArray[n + 11].getWidth() / 2;
            graphics.drawImage(imageArray[n + 11], n2, -25, 0);
            int n3 = 0 + imageArray[n + 11].getWidth();
            int n4 = imageArray[15].getWidth();
            for (int i2 = 0; i2 < i[8]; ++i2) {
                int n5;
                Image[] imageArray2;
                Graphics graphics2;
                if (this.n <= 1 && i2 == 0 && (aS >> 2 & 1) == 0 || i2 < this.n && this.n > 1) {
                    graphics2 = graphics;
                    imageArray2 = imageArray;
                    n5 = 15;
                } else {
                    graphics2 = graphics;
                    imageArray2 = imageArray;
                    n5 = 13;
                }
                graphics2.drawImage(imageArray2[n5 + n], n2 + n3, -25, 0);
                n3 += n4;
            }
            graphics.drawImage(imageArray[n + 17], n2 + n3, -25, 0);
            this.cP = this.n;
        }
        if (this.cQ != this.aZ || this.cT != this.aa || this.o) {
            i.a(graphics, 110, -12, this.aZ, i.a[0].a[0], 0);
        }
        if (this.cR != this.bb || this.o) {
            this.cR = this.bb;
            i.a(graphics, 147, -12, this.bb, i.a[0].a[0], 0);
        }
        graphics.translate(-160, -240);
        graphics.translate(160, 0);
        boolean bl2 = false;
        if (this.o || b == 2) {
            f3.a(graphics, 20, 0, 0, 0, 0, 0);
            bl2 = true;
        }
        if (this.cU != this.aU || this.cV != this.aV || this.o || b == 2 || bl2) {
            if (!bl2) {
                f3.a(graphics, 20, 0, 0, 0, 0, 0);
                bl2 = true;
            }
            i.a(graphics, 47, 12, this.aU, i.a[0].a[0], 0);
            i.a(graphics, 87, 12, this.aV, i.a[0].a[0], 0);
            this.cU = this.aU;
            this.cV = this.aV;
        }
        if (this.cS != this.az || this.o || bl2) {
            if (!bl2) {
                f3.a(graphics, 20, 0, 0, 0, 0, 0);
            }
            i.a(graphics, -29, 12, this.az, i.a[0].a[0], 0);
            this.cS = this.az;
        }
        graphics.translate(-160, 0);
        this.cQ = this.aZ;
        this.cT = this.aa;
        this.o = false;
    }

    private void b(byte by) {
        b b2 = a[4];
        if (by == 23) {
            b2.a = this.bx;
            b2.c |= 1;
        } else {
            b2.c &= 0xFFFFFFFE;
            b2.a = this.bx + 24;
        }
        b2.b = this.by;
        b2.a();
        b2.a(this.a);
    }

    private void f(int n) {
        for (int i2 = n - 8 - 1; i2 < n + 15 - 2; ++i2) {
            a[18].a(this.a, 4, i2 % 2, i2, 0, 0, 0);
        }
        this.a.setColor(0xFFFFFF);
        this.a.drawLine(0, n - 8 - 1 - 1, 320, n - 8 - 1 - 1);
        this.a.drawLine(0, n + 15 - 1, 320, n + 15 - 1);
        this.a.setColor(0);
        this.a.drawLine(0, n - 8 - 1 - 2, 320, n - 8 - 1 - 2);
        this.a.drawLine(0, n + 15 - 2, 320, n + 15 - 2);
    }

    private void H() {
        int n;
        i i2;
        int n2;
        int n3;
        int n4;
        if (this.Y) {
            i i3 = this;
            this.Y = false;
            i3.X = i.b();
        }
        int n5 = 240 - ((this.cX + 1) * a.d + 1 + 2) + (!this.X && this.bo == 0 ? a.d : 0);
        int n6 = 240 - a.d + 1 + 1;
        this.a.setClip(0, 0, 320, 240);
        if (b == 2 && V && W) {
            this.U = false;
            this.D();
            this.U = true;
            W = false;
        }
        if (b == 7 || b == 2) {
            n4 = n5 - (120 - (n6 - n5) / 2);
            n5 -= n4;
            n6 -= n4;
        }
        if (this.bo == 7) {
            this.f(n5 - 22);
            b.b(this.a, a[this.aR == 5 ? 23 : 2], 160, n5 - 20, 17);
        }
        if (b == 7) {
            int n7;
            int n8;
            int n9;
            int n10;
            Graphics graphics;
            if (this.dc != -1 && !V) {
                n4 = n5 + this.dc * a.d;
                this.a.setColor(0);
                graphics = this.a;
                n10 = 0;
                n9 = n4;
                n8 = 320;
                n7 = a.d + 1;
            } else {
                this.a.setColor(0);
                graphics = this.a;
                n10 = 0;
                n9 = 0;
                n8 = 320;
                n7 = 240;
            }
            graphics.fillRect(n10, n9, n8, n7);
        }
        long l = System.currentTimeMillis();
        if (this.db >= 0 && l - this.g > 100L) {
            ++this.db;
            this.g = l;
        }
        if (this.dc != -1 && !V) {
            int n11 = this.bo == 0 && this.dc > 0 && !this.X ? a.d : 0;
            n11 = n5 + this.dc * a.d - n11;
            this.a.setClip(0, n11, 320, a.d + 1);
        }
        if (this.dc != this.bq || V) {
            n3 = n6;
            int n12 = n5;
            i i4 = this;
            if (b == 4) {
                i.b(i4.a, false);
                for (n2 = n12 - 1; n2 < n3 - 2; ++n2) {
                    a[18].a(i4.a, 4, n2 % 2, n2, 0, 0, 0);
                }
            }
            if (b == 2) {
                i4.a.setColor(0);
                i4.a.fillRect(0, n12 - 1, 320, n3 - 2 - (n12 - 1));
            }
            i4.a.setColor(0xFFFFFF);
            i4.a.drawLine(0, n12 - 1 - 1, 320, n12 - 1 - 1);
            i4.a.drawLine(0, n3 - 1, 320, n3 - 1);
            i4.a.setColor(0);
            i4.a.drawLine(0, n12 - 1 - 2, 320, n12 - 1 - 2);
            i4.a.drawLine(0, n3 - 2, 320, n3 - 2);
        }
        if (!this.X && b == 4 && this.bq == 0 && this.aR != 5 && this.bo != 8) {
            this.bq = 1;
        }
        for (int i5 = 0; i5 < this.cX; ++i5) {
            int n13;
            block84: {
                int n14;
                int n15;
                int n16;
                int n17;
                Graphics graphics;
                block83: {
                    int n18;
                    Graphics graphics2;
                    block82: {
                        block80: {
                            block81: {
                                if (this.dc != -1 && i5 != this.dc && i5 != this.bq && !V || this.bo == 0 && i5 == 0 && !this.X) continue;
                                n13 = n5 + i5 * a.d + a.d / 2;
                                if (this.bo == 0 && i5 > 0 && !this.X) {
                                    n13 -= a.d;
                                }
                                n3 = 0xFFFFFF;
                                if (i5 == 2 && this.bo == 0 && i.a()) {
                                    n3 = 0xFF0000;
                                }
                                if (i5 == 0 && this.bo == 8 && i.a()) {
                                    n3 = 0xFF0000;
                                }
                                if (this.k != 2 || i5 != 3 || this.bo != 1) break block80;
                                n3 = 0xFFFFFF;
                                if (i5 != this.bq) break block81;
                                graphics2 = this.a;
                                n18 = 0x666666;
                                break block82;
                            }
                            this.a.setColor(0xCCCCCC);
                            graphics = this.a;
                            n17 = 0;
                            n16 = n13 - a.d / 2 + 1;
                            n15 = 320;
                            n14 = a.d - 1;
                            break block83;
                        }
                        if (i5 != this.bq) break block84;
                        graphics2 = this.a;
                        n18 = 13540096;
                    }
                    graphics2.setColor(n18);
                    graphics = this.a;
                    n17 = 0;
                    n16 = n13 - a.d / 2;
                    n15 = 320;
                    n14 = a.d + 1;
                }
                graphics.fillRect(n17, n16, n15, n14);
            }
            b.a(a[a[this.bo][(i5 << 1) + 1]]);
            n2 = h.a;
            if (!(i5 == 2 && this.bo == 0 && i.a() || i5 != 0 || this.bo != 8)) {
                i.a();
            }
            h.a(n3);
            b.a(this.a, a[a[this.bo][(i5 << 1) + 1]], 160 - n2 / 2, n13 + 1, n3, 6);
            if (i5 != this.bq) continue;
            this.a.setColor(0xFFFFFF);
            a[18].a(this.a, 2, 160 - n2 / 2 - 8, n13, 0, 0, 10);
            a[18].a(this.a, 2, 160 + n2 / 2 + 8, n13, 0, 0, 6);
        }
        this.dc = this.bq;
        ++this.cW;
        if (this.da < 0) {
            i2 = this;
            n = 3;
        } else {
            i i6 = this;
            i2 = i6;
            n = i2.da = i6.da - 1;
        }
        if (this.da == 0 && this.cZ + 1 < this.cX) {
            ++this.cZ;
        }
        this.a.setClip(0, 0, 320, 240);
        if (this.bo != 0 && this.bo != 3 && this.bo != 1 && this.bo != 7 && this.bo != 8) {
            this.I();
        }
        this.J();
        V = false;
        if (this.db == 2) {
            if (b == 2) {
                V = true;
                W = true;
            }
            this.db = -1;
            this.o = true;
            this.dc = -1;
            i i7 = this;
            h.a(0xFFFFFF);
            i7.z = true;
            block0 : switch (i7.bo) {
                case 0: {
                    i i8 = i7;
                    switch (i8.a()) {
                        case 0: {
                            i8.a.e();
                            i8.t();
                            if (i != null && i.b()) {
                                i8.ag = 0;
                                i8.M = true;
                                i8.p = true;
                                i8.bs = 0;
                                b = (byte)28;
                                break block0;
                            }
                        }
                        case 1: {
                            i8.a.e();
                            if (!i.b()) {
                                i8.S();
                                break block0;
                            }
                            i8.Q = true;
                            i8.D = false;
                            b = (byte)31;
                            break block0;
                        }
                        case 5: {
                            i8.a(7);
                            i8.aR = 5;
                            break block0;
                        }
                        case 6: {
                            i8.k();
                            break block0;
                        }
                        case 2: {
                            i8.a(5);
                            i8.a.e();
                            break block0;
                        }
                        case 4: {
                            b = (byte)22;
                            i8.aR = 0;
                            i8.a.e();
                            break block0;
                        }
                        case 3: {
                            b = (byte)33;
                            i8.a.e();
                            i8.av = true;
                            break block0;
                        }
                    }
                    i8.z = false;
                    return;
                }
                case 3: {
                    i i9 = i7;
                    i7.aR = 0;
                    int n19 = 0;
                    n19 = 0;
                    n2 = 5;
                    for (n19 = 0; n19 < a[5].length; n19 += 2) {
                        if (0 != a[5][n19]) continue;
                        i.a[5][n19 + 1] = 0;
                        break block0;
                    }
                    return;
                }
                case 7: {
                    i i10 = i7;
                    block18 : switch (i10.a()) {
                        case 0: {
                            if (i10.bp == 0) {
                                b = (byte)4;
                            }
                            i10.a(i10.bp);
                            break;
                        }
                        case 1: {
                            switch (i10.aR) {
                                case 1: {
                                    i10.l();
                                    break block18;
                                }
                                case 3: {
                                    b = (byte)15;
                                    i10.J = true;
                                    i10.H = true;
                                    i10.ax();
                                    break block18;
                                }
                                case 4: {
                                    i10.p();
                                    b = (byte)9;
                                    i10.br = 8;
                                    i10.a(-1);
                                    i10.bs = 0;
                                    break block18;
                                }
                                case 5: {
                                    b = (byte)3;
                                }
                            }
                        }
                    }
                    i10.aR = -1;
                    return;
                }
                case 2: {
                    i i11 = i7;
                    switch (i11.a()) {
                        case 0: {
                            i11.a.e();
                            i11.aA = 0;
                            i11.l = false;
                            b = (byte)15;
                            dZ = i.b(i11.aA);
                            i11.H = true;
                            i11.ax();
                            break block0;
                        }
                        case 1: {
                            i11.a.e();
                            i11.aA = 1;
                            i11.aB = 0;
                            b = (byte)15;
                            dZ = i.b(i11.aA);
                            i11.H = true;
                            i11.ax();
                            i11.p = true;
                            i11.l = false;
                            if (i[9] >= 1) break;
                            i.i[9] = 1;
                            break block0;
                        }
                        case 2: {
                            i11.a.e();
                            i11.aA = 2;
                            i11.aB = 0;
                            i11.l = false;
                            b = (byte)15;
                            dZ = i.b(i11.aA);
                            i11.H = true;
                            i11.ax();
                            i11.p = true;
                            if (i[9] < 2) {
                                i.i[9] = 2;
                            }
                            if (i[8] >= 8) break;
                            i.i[8] = 8;
                            break block0;
                        }
                        case 3: {
                            i11.a(4);
                            break block0;
                        }
                        default: {
                            b = (byte)3;
                            i11.a.d();
                            a.a();
                        }
                    }
                    return;
                }
                case 1: {
                    i i12 = i7;
                    switch (i12.a()) {
                        case 1: {
                            i12.a(7);
                            i12.aR = 1;
                            break block0;
                        }
                        case 0: {
                            b = 1;
                            f = null;
                            break block0;
                        }
                        case 3: {
                            if (i12.aB == 13 && i12.aA == 0) break;
                            i12.a(7);
                            i12.aR = 3;
                            break block0;
                        }
                        case 4: {
                            i12.a(7);
                            i12.aR = 4;
                            break block0;
                        }
                        case 5: {
                            i12.a(7);
                            i12.aR = 5;
                            break block0;
                        }
                        case 2: {
                            i12.a(5);
                            break block0;
                        }
                        case 6: {
                            b = (byte)33;
                            i12.av = true;
                            break block0;
                        }
                        default: {
                            i12.z = false;
                        }
                    }
                    return;
                }
                case 5: {
                    return;
                }
                case 8: {
                    i i13 = i7;
                    switch (i13.a()) {
                        case 0: {
                            i13.k();
                            break;
                        }
                        case 1: {
                            b = (byte)3;
                        }
                    }
                    i13.aR = -1;
                }
            }
        }
    }

    private void I() {
        a[18].a(this.a, 0, 303, 228, 0, 0, 0);
    }

    private void J() {
        a[18].a(this.a, 3, 2, 228, 0, 0, 0);
    }

    private void K() {
        Graphics graphics = this.a;
        graphics.setColor(0);
        graphics.fillRect(0, 0, 320, 240);
        int n = (this.bs + 1) * 310 / this.br;
        if (n > 310) {
            n = 310;
        }
        graphics.setColor(13540096);
        this.a.fillRect(5, 230, n, 6);
        graphics.setColor(16554500);
        this.a.drawRoundRect(4, 229, 311, 6, 2, 2);
        h.a(0xFFFFFF);
        b.b(this.a, a[35], 160, a.e, 1);
    }

    private void L() {
        if (this.ao != -1) {
            b b2 = a[5];
            a[5].a = this.at - this.a;
            b2.b = 504 - this.b;
            b2.a();
            b2.a(this.a);
            if (this.ao == 12) {
                int n = this.at - this.a + aS * this.ap % 48;
                int n2 = i.a[5].b + 24;
                a[7].a(this.a, 0, aS % a[7].a(1), n, n2, 0, 0, 0);
                this.g(n, n2);
            }
        }
    }

    private void M() {
        int n;
        if (this.k == 3 && (long)aS >= this.k + 80L) {
            for (n = 14; n <= 21; ++n) {
                i.b[n][15] = 0;
                i.a[n][15] = -1;
                i.a[n][15] = 44;
                i.b[n][15] = 0;
                i.c[n][15] = 24;
            }
            this.k = 0L;
        }
        if (this.ao != 15) {
            if (this.a + 320 + 48 >= this.as && this.b + 240 + 48 >= 504) {
                b b2 = a[5];
                a[5].a = this.as - this.a;
                b2.b = 504 - this.b;
                b2.a();
                b2.a(this.a);
            }
            if (this.ao == 12) {
                n = this.as - this.a + aS * this.ap % 48;
                int n2 = i.a[5].b + 24;
                a[7].a(this.a, 0, aS % a[7].a(0), n, n2, 0, 0, 0);
                this.g(n, n2);
            }
        }
    }

    private void a(Graphics graphics, int n) {
        n = n * 14 + 2;
        int n2 = 320 - n >> 1;
        if (this.aq > 0) {
            graphics.setColor(0);
            graphics.fillRect(n2, 5, n, 12);
            graphics.setColor(3913615);
            for (n = 0; n < this.aq; ++n) {
                graphics.fillRect(n2 + 2 + n * 14, 7, 12, 8);
            }
        }
    }

    private void N() {
        int n;
        b b2;
        b b3;
        Graphics graphics;
        block14: {
            int n2;
            block15: {
                b b4;
                block13: {
                    block12: {
                        int n3;
                        graphics = this.a;
                        b3 = a[5];
                        b2 = a[4];
                        switch (this.ao) {
                            case 1: {
                                n3 = this.ap;
                                break;
                            }
                            case 2: 
                            case 7: {
                                n3 = 40;
                                break;
                            }
                            case 3: {
                                n3 = 40;
                                break;
                            }
                            case 4: {
                                n3 = 40 - (this.ap << 1 << 1);
                                break;
                            }
                            case 5: {
                                n = 15 + this.ap * 18;
                                this.Z = false;
                                break block12;
                            }
                            case 9: {
                                n3 = 15 + this.ap * 18;
                                break;
                            }
                            case 10: {
                                n3 = 15 + this.ap * 18;
                                break;
                            }
                            case 11: {
                                n3 = 15 + this.ap * 18;
                                break;
                            }
                            default: {
                                n3 = -1000;
                            }
                        }
                        n = n3;
                    }
                    b3.a = (10 + this.ar * (2 + (this.ar > 0 ? 1 : 0))) * 24 - this.a;
                    if (this.ao != 5) break block13;
                    n = b3.b;
                    b3.b = 256 - this.b - 15;
                    if (this.e() != 3) break block14;
                    b4 = b3;
                    n2 = n;
                    break block15;
                }
                b4 = b3;
                n2 = 256 - n - this.b;
            }
            b4.b = n2;
        }
        b3.a(graphics);
        if (this.k) {
            b2.b = 96 - this.b;
            b2.a = (this.d() + 1) * 24 - this.a;
            b2.a(graphics);
        }
        for (n = 0; n < 3; ++n) {
            int n4 = (n * (2 + (n > 0 ? 1 : 0)) + 10) * 24 - this.a;
            if (n4 >= 320 || n4 <= -48 || this.b <= 0) continue;
            a[40].a(graphics, 1, n4, 216 - this.b, 0, 0, 0);
        }
    }

    private void O() {
        int n;
        int n2;
        int n3;
        int n4 = aS;
        b b2 = a[2];
        if (this.b + this.bk < 1008 && this.b + this.bk > 672) {
            b2.a = 240 - this.a;
            b2.b = 1008 - this.b;
            b2.a();
            b2.a(this.a);
            b2.a = 336 - this.a;
            b2.b = 1008 - this.b;
            b2.a();
            b2.c = 1;
            b2.a(this.a);
        }
        if (this.bj > 10) {
            i i2 = this;
            for (n3 = 3; n3 < 13; n3 += 2) {
                n2 = 10 * (n3 * 2 / 5 + 1);
                n = (n2 + aS / n2) * n3 % 320;
                n2 = 240 / n2 * aS % 240;
                i2.a.drawImage(b[27][n3 & 1], n, n2, 0);
            }
        }
        int n5 = this.f * 24 - this.al - this.b;
        n2 = n3 = 168 - this.a;
        n = n3 + 240;
        while (n3 <= -24) {
            n3 += 24;
        }
        b b3 = a[1];
        if ((this.al >= 816 || b3.d == 2) && this.al > 816) {
            for (int i3 = n5 + 20; i3 < 240; i3 += 24) {
                for (int i4 = n3; i4 < n; i4 += 24) {
                    b3.a.a(this.a, 1, ((n4 >> 1) + i4 + i3) % 2, i4, i3, 0, 0, 0);
                }
            }
        }
        if (b2.d == 2) {
            b3.c = 0;
            b3.a = n2 + 120;
            b3.b = n5;
            b3.a();
            b3.a(this.a);
            b3.c = 1;
            b3.a(this.a);
            i i5 = this;
            Graphics graphics = i5.a;
            n = (aS << 3) % 160;
            n2 = (aS / 160 & 1) == 0 ? 160 - n : n + 0;
            graphics.setColor(255, n2, 0);
            graphics.drawRect(0, 0, 319, 239);
        }
    }

    private void P() {
        int n;
        if (this.E) {
            return;
        }
        int n2 = this.h;
        int n3 = this.i;
        int n4 = aS;
        int n5 = this.k & 7;
        int n6 = (this.k & 0x4000) == 0 ? 0 : 3;
        b b2 = a[n6];
        boolean bl = this.c();
        int n7 = n = (this.k & 0x800) == 0 ? this.bQ : this.k & 7;
        if (!this.e) {
            return;
        }
        this.bv = n2 * 24 + g[n] * this.j - this.a;
        this.bw = n3 * 24 + g[n + 8] * this.j - this.b;
        if ((this.b <= 0L || (n4 >> 1 & 1) == 0) && this.aT <= 0) {
            b2.a = this.bv;
            b2.b = this.bw;
            if (e != null && bl && n5 != 1 && n5 != 3 && e[n2][n3 + 1] != 0 && i.i(n2, n3 + 1)) {
                n4 = (n4 >> 1) + n2;
                n5 = n4 % 4;
                if ((n4 / 4 & 1) == 1) {
                    n5 = 4 - n5;
                }
                b2.b += n5;
            }
            b2.a();
            b2.a(this.a);
            n4 = b2.d;
            a = n4 == 47 && b2.e == 0;
            switch (n4) {
                case 40: 
                case 47: 
                case 48: {
                    if (b2.e <= (n4 == 40 ? 13 : 6) && n4 != 47) break;
                    try {
                        n5 = 0;
                        if (this.aF == 30 || this.aF == 31 || this.aF == 32) {
                            n5 = -2;
                        }
                        if (b[this.aF] == null) {
                            a[i.a(this.aF)].a(this.a, this.aG, b2.a + n5, b2.b - 24, 0, 0, 0);
                        } else {
                            this.a.drawImage(b[this.aF][this.aG], b2.a + n5, b2.b - 24, 0);
                        }
                    }
                    catch (Exception exception) {
                        System.out.println(exception);
                    }
                    if (this.aH <= 0) break;
                    i.a(this.a, b2.a + 24, b2.b - 10, this.aH, i.a[0].a[0], 0);
                    break;
                }
                case 17: 
                case 18: {
                    if (b2.e != 0) break;
                    this.a.drawImage(b[this.aF][this.aG], b2.a, b2.b - 12, 0);
                }
            }
        }
        if (bl && a[n2][n3] == 0) {
            n4 = b[n2][n3] & 7;
            byte by = b[n2][n3];
            try {
                a[i.a(1)].a(this.a, 0 + (b[n2][n3] & 0x38), n2 * 24 - this.a + g[n4] * by, n3 * 24 - this.b + g[n4 + 8] * by, 0, 0, 0);
                return;
            }
            catch (Exception exception) {}
        }
    }

    private void Q() {
        int n;
        int n2;
        int n3 = this.bG;
        int n4 = this.bH;
        int n5 = n4 + 1;
        this.bz = 0;
        this.bA = 0;
        this.A = false;
        int n6 = b[n3][n4];
        int n7 = n6 & 7;
        byte by = b[n3][n4];
        if (n6 == -1) {
            n6 = -1;
        }
        this.bN += by * g[n7];
        this.bO += by * g[n7 + 8];
        boolean bl = e != null && e[n3][n4] != 0;
        switch (this.bI) {
            case 47: {
                b = a[30];
                this.bK = 0;
                this.bL = i.a(b, 0, aS % i.a(b, 0));
                break;
            }
            case 8: {
                this.aL = 16;
                this.aM = 0 + (aS >> 1 & 1);
                break;
            }
            case 5: {
                this.aL = 25;
                this.aM = 0 + this.bR;
                break;
            }
            case 6: {
                this.aL = 5;
                this.aM = 0;
                break;
            }
            case 7: {
                this.aL = 5;
                this.aM = 1;
                break;
            }
            case 9: {
                b = a[(n6 & 0xFC00000) >> 22];
                this.bL = 0;
                break;
            }
            case 4: {
                this.aL = 24;
                this.aM = 0 + this.bR;
                break;
            }
            case 0: {
                boolean bl2;
                n2 = (n6 & 0x38) >> 3;
                n = (n6 & 0x7000) >> 12;
                boolean bl3 = bl2 = (n6 & 0x10000) == 0;
                if (!bl && n7 == 0 && i.i(n3, n5)) {
                    n6 = n6 & 0xFFFF8FFF | n << 12;
                    if (bl2) {
                        n6 &= 0xFFFEFFFF;
                    } else {
                        n6 |= 0x10000;
                        n = -n;
                    }
                    this.bN = n;
                } else {
                    n6 &= 0xFFFF8FFF;
                }
                i.b[n3][n4] = n6;
                this.aL = 1;
                this.aM = n2 + 0;
                break;
            }
            case 1: {
                this.aL = 2;
                this.aM = 0 + this.bR;
                break;
            }
            case 2: {
                int n8;
                f[] fArray;
                i i2;
                i i3 = this;
                n = a[i3.bG][i3.bH] & 0xFF;
                int n9 = a[i3.bG][i3.bH] >> 8;
                if ((n == 14 || n == 33) && n9 <= 11) break;
                i3.aL = 3;
                i3.aM = 0 + i3.bR;
                if (n == 14) {
                    i2 = i3;
                    fArray = a;
                    n8 = 8;
                } else {
                    if (n != 33) break;
                    i2 = i3;
                    fArray = a;
                    n8 = 22;
                }
                i2.bO = -(fArray[n8].a(0) - n9);
            }
        }
        if (bl || e != null && e[n3][n5] != 0 && i.i(n3, n5)) {
            n2 = (aS >> 1) + n3;
            n = n2 % 4;
            if ((n2 / 4 & 1) == 1) {
                n = 4 - n;
            }
            this.bO += n;
        }
        if (((n6 & 0x200) != 0 || a[n3 - g[n7]][n5] < 0 && i.i(n3, n5) && (b[n3][n5] & 7) == 0 && n3 != this.bg && n4 != this.bh) && (this.k & 8) == 0) {
            this.bO += by * by / 24;
            if (this.bI != 9) {
                this.bN += -1 + aS % 3;
            }
        }
        if ((n6 & 0x200) != 0) {
            this.bN = -this.bN;
        }
        if (this.bI == 0) {
            this.bD = ((n6 & 0x1C0) >> 6) - 1;
            if (this.bD >= 0 && this.bD < 5) {
                int n10;
                this.A = true;
                switch (n6 & 7) {
                    case 4: {
                        i i4 = this;
                        n10 = 24;
                        break;
                    }
                    case 2: {
                        i i4 = this;
                        n10 = -24;
                        break;
                    }
                    default: {
                        i i4 = this;
                        n10 = 0;
                    }
                }
                i4.bz = n10;
                this.bA = 13;
                this.bB = this.bG;
                this.bC = this.bH - 1;
            }
        }
        this.F();
    }

    /*
     * Unable to fully structure code
     */
    private void c(byte var1_1) {
        block10: {
            block9: {
                block8: {
                    block7: {
                        var2_2 = i.b[this.bG][this.bH];
                        var3_3 = i.b[this.bG][this.bH];
                        var4_4 = var2_2 & 7;
                        this.bN = var3_3 * i.g[var4_4];
                        this.bO = var3_3 * i.g[var4_4 + 8];
                        var1_1 = (byte)(var1_1 == 19 ? 4 : 21);
                        i.b = i.a[var1_1];
                        if (this.aA != 1) break block7;
                        if ((var2_2 & 248) >> 3 > 0) {
                            v0 = this;
                            v1 = 2;
                        } else {
                            v0 = this;
                            v1 = 0;
                        }
                        v0.bK = v1;
                        v2 = this;
                        v3 = i.aS;
                        v4 = i.b;
                        ** GOTO lbl-1000
                    }
                    if ((var2_2 & 248) >> 3 <= 0) break block8;
                    v5 = this;
                    v6 = 4;
                    break block9;
                }
                this.bK = var4_4 - 1;
                if (this.bK >= 0) break block10;
                v5 = this;
                v6 = ((var2_2 & 28672) >> 12) - 1;
            }
            v5.bK = v6;
        }
        v2 = this;
        v3 = i.aS >> 1;
        v4 = i.b;
        if (this.bK < 0) {
            v7 = 0;
        } else lbl-1000:
        // 2 sources

        {
            v7 = this.bK;
        }
        v2.bL = v3 % v4.a(v7);
        this.F();
    }

    private static int a(f f2, int n, int n2) {
        int n3 = 0;
        int n4 = 0;
        while (n2 > 0) {
            n2 -= f2.a(n, n4);
            n3 = n4++;
        }
        return n3;
    }

    private static int b(f f2, int n, int n2) {
        n2 = 0;
        for (int i2 = 0; i2 < 1; ++i2) {
            n2 = 0 + f2.a(n, 0);
        }
        return n2;
    }

    private static void a(Graphics graphics, int n, int n2, int n3, Image[] imageArray, int n4) {
        if (n3 == 0) {
            Image image = i.a[0].a[0][0];
            graphics.drawImage(image, n, n2, 24);
            return;
        }
        while (n3 > 0) {
            n4 = n3 % 10;
            n3 /= 10;
            Image image = imageArray[n4];
            graphics.drawImage(image, n -= image.getWidth(), n2, 0);
        }
    }

    private boolean c() {
        return this.h > 0 && this.h < this.e - 1 && this.i > 0 && this.i < this.f - 1;
    }

    private void g(int n) {
        int n2 = i.a[0].d;
        if (n2 != 19 && (this.k & 0x4000) == 0 && (this.k & 0x800) == 0) {
            if (this.c()) {
                int n3 = e == null ? 0 : i.a(e[this.h][this.i], (byte)0, (byte)3, (byte)4);
                if (n3 == 8 || n3 == 7) {
                    switch (n) {
                        case 0: 
                        case 1: 
                        case 2: 
                        case 3: 
                        case 4: 
                        case 5: 
                        case 6: 
                        case 7: 
                        case 8: 
                        case 9: 
                        case 11: 
                        case 24: 
                        case 25: 
                        case 26: 
                        case 27: {
                            n = 36 + (this.k & 7) - 1;
                        }
                    }
                } else if (a[this.h][this.i + 1] < 0 || a[this.h][this.i + 1] == 14) {
                    switch (n) {
                        case 14: {
                            int n4 = 28;
                            break;
                        }
                        case 16: {
                            int n4 = 29;
                            break;
                        }
                        case 42: {
                            int n4 = 46;
                            break;
                        }
                        case 44: {
                            int n4 = 45;
                            break;
                        }
                        case 1: {
                            int n4 = 35;
                            break;
                        }
                        case 3: {
                            int n4 = 34;
                            break;
                        }
                        case 0: {
                            int n4 = 0;
                            break;
                        }
                        case 2: {
                            int n4 = 2;
                            break;
                        }
                        case 22: {
                            int n4 = 31;
                            break;
                        }
                        case 20: {
                            int n4 = 30;
                            break;
                        }
                        case 23: {
                            int n4 = 33;
                            break;
                        }
                        case 21: {
                            int n4 = n = 32;
                        }
                    }
                }
            }
            if (n == 1000) {
                a[3].a(0);
                this.k |= 0x4000;
            } else {
                a[0].a(n);
            }
            if (n2 != n) {
                this.ax = 70;
            }
        }
    }

    private void R() {
        int n;
        String[] stringArray;
        i i2;
        block16: {
            int n2;
            i i3;
            block15: {
                block14: {
                    if (i.a(32944)) {
                        ah = 0;
                        this.av = true;
                        int n3 = this.n;
                        i i4 = this;
                        this.en = -1;
                        switch (i.f(n3)) {
                            case -1: {
                                i4.a = a[41];
                                return;
                            }
                            case 0: {
                                i4.a = a[0];
                                return;
                            }
                            case 1: {
                                i4.aZ = i.a(i, 4) - a.a[i4.n];
                                i4.g = null;
                                System.gc();
                                i4.g = a[125] + " " + i4.aZ + " " + a[19];
                                i.i[4] = (byte)i4.aZ;
                                i.i[5] = (byte)(i4.aZ >> 8);
                                i.i[8] = (byte)(n3 + 4 + 1);
                                i4.u();
                                i4.o = -1;
                                i4.a = a[0];
                                i4.aa = true;
                                i4.a(a[32], -1, -1, 5000, 4273165, 0);
                            }
                        }
                        return;
                    }
                    if (i.a(64)) {
                        ah = 0;
                        b = (byte)27;
                        this.av = true;
                        this.g = true;
                        ah = 0;
                        return;
                    }
                    if (!i.a(4097)) break block14;
                    i3 = this;
                    n2 = -1;
                    break block15;
                }
                if (!i.a(262146)) break block16;
                i3 = this;
                n2 = 1;
            }
            int n4 = n2;
            i i5 = i3;
            i3.n += n4;
            if (i5.n < 0) {
                i5.n = 3;
            }
            if (i5.n == 4) {
                i5.n = 0;
            }
        }
        ah = 0;
        if (i.f(this.n) == 0) {
            this.o = -1;
            i2 = this;
            stringArray = a;
            n = 0;
        } else {
            this.o = a.a[this.n];
            this.d.delete(0, this.d.length());
            this.d.append(this.o);
            i2 = this;
            stringArray = a;
            n = 6;
        }
        i2.a = stringArray[n];
        this.av = true;
    }

    private static int f(int n) {
        if (i[8] >= n + 4 + 1) {
            return 0;
        }
        if (i.a(i, 4) < a.a[n]) {
            return -1;
        }
        return 1;
    }

    private void S() {
        this.D = true;
        b = (byte)16;
        this.bs = 0;
        this.br = 6;
        this.az = 0;
        this.bb = 0;
        this.aZ = 0;
        this.p = false;
        this.ag = 0;
        dZ = 0;
    }

    private void T() {
        if (s < b.length && i.a(b[s])) {
            ah = 0;
            if ((s = (byte)(s + 1)) == b.length) {
                ah = 0;
                b = (byte)24;
                this.cz = i[8];
                this.cA = i[9];
                this.S = false;
                this.T = false;
                return;
            }
        } else {
            byte by;
            if (i.a(b[0])) {
                ah = 0;
                by = 1;
            } else {
                by = 0;
            }
            s = by;
        }
    }

    private void U() {
        this.a.setClip(0, 0, 320, 240);
        this.a.setColor(0);
        this.a.fillRect(0, 0, 320, 240);
        b = m;
        if (m == 27) {
            this.av = true;
            this.g = true;
        } else if (m == 1) {
            v0.o = true;
        }
        ah = 0;
    }

    private void V() {
        if (this.db >= 0 && this.db <= 2) {
            ah = 0;
            return;
        }
        if (i.a(4097)) {
            if (System.currentTimeMillis() < 300L) {
                return;
            }
            this.m();
            if (this.bo == 0 && this.bq == 0 && !this.X) {
                this.m();
            }
        } else if (i.a(262146)) {
            if (System.currentTimeMillis() < 300L) {
                return;
            }
            this.n();
            if (this.bo == 0 && this.bq == 0 && !this.X) {
                this.n();
            }
        } else if (i.a(32944)) {
            if (this.db < 0 || this.db > 2) {
                this.db = 0;
                this.g = System.currentTimeMillis();
            }
        } else if (i.a(64)) {
            switch (this.bo) {
                case -1: {
                    break;
                }
                case 5: {
                    V = true;
                    W = false;
                    if (b == 2) {
                        this.a(1);
                        i i2 = this;
                        this.o = true;
                        W = true;
                    }
                    if (b != 4) break;
                    this.a(0);
                    this.p(19);
                    break;
                }
                case 2: {
                    b = (byte)9;
                    this.a(0);
                    this.br = 8;
                    this.bs = 0;
                    break;
                }
                case 4: {
                    this.a(2);
                }
            }
        }
        ah = 0;
    }

    private boolean d() {
        if (this.x == 3) {
            int n = a[this.h][this.i] & 0xFF;
            if (this.cf == 0 && n != 15 && n != 16) {
                int n2;
                i i2;
                this.p(0);
                if (this.ce <= 0) {
                    i2 = this;
                    n2 = 1;
                } else {
                    i2 = this;
                    n2 = -1;
                }
                i2.cf = n2;
            }
            return true;
        }
        return false;
    }

    private void b(int n, int n2, int n3) {
        int n4 = b[n2][n3];
        if (n == 43 && (n4 & 0xF8) == 0) {
            if ((n4 & 0x18000) == 0) {
                i.a[n2][n3] = -1;
                this.k(n2, n3);
                return;
            }
            n4 = ((n4 = (n4 - 32768 & 0xFF01FFFF | n2 << 17) & 0x80FFFFFF | n3 << 24) & 7) == 1 || (n4 & 7) == 3 ? n4 | Integer.MIN_VALUE : n4 & Integer.MAX_VALUE;
        }
        i.b[n2][n3] = n4 = n4 & 0xFFFFFF07 | 0x78;
    }

    private void e(int n, int n2) {
        switch (a[n][n2]) {
            case 0: {
                this.p(11);
            }
            case 19: 
            case 43: 
            case 45: 
            case 46: {
                i.a[n][n2] = -1;
                this.k(n, n2);
                return;
            }
            case 48: {
                i.a[n][n2] = -1;
                this.k(n, n2);
                int n3 = n2 + 1;
                if (a[n][n3] != 48) {
                    n3 = -1;
                }
                i.a[n][n3] = -1;
                this.k(n, n3);
                int n4 = (b[n][n2] >> 24) * 3;
                i.e[n4 + 2] = -1;
                return;
            }
        }
        i.a[n][n2] = -1;
    }

    /*
     * Unable to fully structure code
     */
    private void W() {
        block297: {
            block298: {
                block296: {
                    if (this.c) {
                        --this.l;
                    }
                    if ((this.h || this.aj) && i.aS > 140) {
                        if (this.aj) {
                            this.b();
                        }
                        this.h = false;
                        this.aj = false;
                        this.K = true;
                        this.bs = 0;
                        this.e();
                        this.I = true;
                        i.b = (byte)28;
                    }
                    var1_1 = this.c();
                    if (this.al) {
                        this.al = false;
                        if (this.dt < this.du) {
                            var2_2 = i.a((byte)this.dt, (byte)13, (byte)7);
                            var3_11 = i.a((byte)this.dt, (byte)20, (byte)7);
                            this.n(var2_2, var3_11);
                            ++this.dt;
                        } else {
                            this.dt = 0;
                            this.du = 0;
                        }
                    }
                    if (i.a[4] != null) {
                        i.a[4].b();
                    }
                    if (this.bj > 0) {
                        --this.bj;
                    }
                    if (this.di > 0) {
                        --this.di;
                        if (this.di == 0) {
                            this.e = null;
                        }
                    }
                    if (this.ad != this.ae) {
                        v0 = var2_2 = this.ad;
                        while (v0 != this.ae) {
                            v1 = var2_2;
                            i.b[v1] = (byte)(i.b[v1] + 1);
                            v2 = var3_11 = i.c[var2_2] < 0 ? i.a(i.a[2], 0) : i.a[9].a(i.c[var2_2]);
                            if (i.b[var2_2] >= var3_11) {
                                ++this.ad;
                                this.ad &= 7;
                            }
                            v0 = var2_2 + 1 & 7;
                        }
                    }
                    if (this.k == 0) break block296;
                    var2_3 = this;
                    block1 : switch (var2_3.k) {
                        case 2: {
                            var3_12 = var2_3;
                            if (i.a != null && var3_12.c() && (i.a[var3_12.h][var3_12.i] & 255) == 0) {
                                var4_17 = i.a[var3_12.h][var3_12.i] >> 8;
                                if (var4_17 == 13) {
                                    var3_12.q = true;
                                } else if (var4_17 == 16) {
                                    var3_12.r = true;
                                }
                            }
                            if (!var3_12.s && var3_12.j <= 0 && var3_12.c(46, 7)) {
                                var3_12.t = true;
                                var3_12.s = true;
                            }
                            if ((var3_12 = var2_3).c(61, 3) && var3_12.j == 6) {
                                var3_12.c(var3_12.h, var3_12.i, 5);
                                var3_12.e = false;
                            }
                            if (var3_12.a == null && (var3_12.c(60, 3) || var3_12.c(61, 3))) {
                                var3_12.b(true);
                                var3_12.N = true;
                                var3_12.aw();
                                var3_12.p();
                                var3_12.aA = 0;
                                var3_12.aB = 0;
                                var3_12.l();
                            }
                            if (var3_12.aI != 2) break;
                            i.a[11][50] = -1;
                            break;
                        }
                        case 1: {
                            var3_13 = var2_3;
                            if (i.a[18][63] == 0 && i.b[18][63] <= 0 && var3_13.am == 0) {
                                var3_13.bj = 120;
                                ++var3_13.am;
                            }
                            if (var3_13.am != 3) ** GOTO lbl88
                            if (i.a[2].d != 0) ** GOTO lbl83
                            v3 = i.a[2];
                            v4 = 1;
                            ** GOTO lbl91
lbl83:
                            // 1 sources

                            if (i.a[2].d == 1 && i.a[2].a()) {
                                i.a[2].a(2);
                                if (var3_13.i == var3_13.f - 4) {
                                    var3_13.al = 817;
                                }
                            }
                            ** GOTO lbl92
lbl88:
                            // 1 sources

                            if (i.a[2].d == 0) ** GOTO lbl92
                            v3 = i.a[2];
                            v4 = 0;
lbl91:
                            // 2 sources

                            v3.a(v4);
lbl92:
                            // 3 sources

                            i.a[2].b();
                            if (i.a[2].d != 2) break;
                            i.a[1].b();
                            if (var3_13.bj == 10) {
                                var3_13.bj = 60;
                            }
                            if (i.a[1].d == 0) {
                                if ((var3_13.a == null || var3_13.al < 46) && var3_13.al < 1704) {
                                    ++var3_13.al;
                                    var4_18 = var3_13.f * 24 - (var3_13.b + 240 - 62);
                                    if (var3_13.al < var4_18) {
                                        var3_13.al = var4_18;
                                    }
                                }
                                if (var3_13.f * 24 - var3_13.al > var3_13.i * 24 + 18 || var3_13.h >= 17) break;
                                var3_13.a((int)i.i[8], 64, 1);
                                break;
                            }
                            if (!i.a[1].a()) break;
                            i.a[1].a(0);
                            break;
                        }
                        case 3: {
                            var3_14 = var2_3;
                            var4_19 = i.a[5];
                            var2_4 = var3_14.bE;
                            var5_27 = var3_14.bF;
                            var6_33 = var3_14.h - 8;
                            var7_34 = var3_14.h + 8;
                            var8_35 = var3_14.i + 8;
                            var9_36 = var3_14.i - 8;
                            for (var10_41 = 15; var10_41 <= 22; ++var10_41) {
                                for (var11_42 = 14; var11_42 <= 21; ++var11_42) {
                                    if (var11_42 > var6_33 && var11_42 < var7_34 && var10_41 > var8_35 && var10_41 < var9_36 || i.a[var11_42][var10_41] != 44) continue;
                                    var3_14.bE = var11_42;
                                    var3_14.bF = var10_41;
                                    var3_14.am();
                                }
                            }
                            var3_14.bE = var2_4;
                            var3_14.bF = var5_27;
                            if (var3_14.n == 0) {
                                var3_14.af();
                            }
                            if (var3_14.ao != 12) ** GOTO lbl138
                            if (var3_14.ap++ > 100) {
                                var3_14.ao = 15;
                                var3_14.k(11, 11);
                            } else {
                                var3_14.a.b(7);
                            }
                            v5 = var4_19;
                            ** GOTO lbl339
lbl138:
                            // 1 sources

                            if (var3_14.ao == -1) {
                                if (var3_14.h * 24 < 336) break;
                                var3_14.ao = 0;
                                var4_19.a(0);
                                break;
                            }
                            if (var3_14.ao == 15 || var3_14.ao == -1) break;
                            var10_41 = -1;
                            var11_42 = var3_14.h * 24 + 12;
                            var7_34 = var3_14.i * 24;
                            var8_35 = var3_14.as + 24;
                            if (var3_14.j == 0L && var3_14.n != 0) {
                                var3_14.j = i.aS + e.a(340, 441);
                            }
                            v6 = var9_36 = var3_14.aq > 0 && i.aS % var3_14.aq == 0 ? 2 : 1;
                            if (var3_14.ao == 10 || var3_14.ao == 11) {
                                v7 = var9_36 = (i.aS & 11) == 0 ? 2 : var9_36;
                            }
                            while (var9_36-- > 0) {
                                switch (var3_14.ao) {
                                    case 2: {
                                        if (!var4_19.a()) break;
                                        if ((long)i.aS > var3_14.j) {
                                            var10_41 = 13;
                                            var3_14.ao = 13;
                                            break;
                                        }
                                        var10_41 = 4;
                                        var3_14.ao = 4;
                                        break;
                                    }
                                    case 3: {
                                        if (!var4_19.a()) break;
                                        if ((long)i.aS > var3_14.j) {
                                            var10_41 = 14;
                                            var3_14.ao = 14;
                                            break;
                                        }
                                        var10_41 = 5;
                                        var3_14.ao = 5;
                                        break;
                                    }
                                    case 0: {
                                        if (var8_35 > 360) {
                                            var10_41 = 4;
                                            var3_14.ao = 4;
                                            break;
                                        }
                                        var10_41 = 5;
                                        var3_14.ao = 5;
                                        break;
                                    }
                                    case 1: {
                                        if (var8_35 < 504) {
                                            var10_41 = 5;
                                            var3_14.ao = 5;
                                            break;
                                        }
                                        var10_41 = 4;
                                        var3_14.ao = 4;
                                        break;
                                    }
                                    case 10: {
                                        if (var4_19.a()) {
                                            var3_14.bj = 10;
                                            var8_35 = var3_14.as + 24;
                                            if ((long)i.aS > var3_14.j) {
                                                var10_41 = 13;
                                                var3_14.ao = 13;
                                                break;
                                            }
                                            if (var7_34 >= 504) {
                                                if (var11_42 < var8_35 - 48) break;
                                                var10_41 = 6;
                                                var3_14.ao = 6;
                                                break;
                                            }
                                            var10_41 = 4;
                                            var3_14.ao = 4;
                                            break;
                                        }
                                        var3_14.as -= 2;
                                        break;
                                    }
                                    case 11: {
                                        if (var4_19.a()) {
                                            var3_14.bj = 10;
                                            var8_35 = var3_14.as + 24;
                                            if ((long)i.aS > var3_14.j) {
                                                var10_41 = 14;
                                                var3_14.ao = 14;
                                                break;
                                            }
                                            if (var7_34 >= 504) {
                                                if (var11_42 > var8_35 + 48) break;
                                                var10_41 = 7;
                                                var3_14.ao = 7;
                                                break;
                                            }
                                            var10_41 = 5;
                                            var3_14.ao = 5;
                                            break;
                                        }
                                        var3_14.as += 2;
                                        break;
                                    }
                                    case 4: {
                                        if ((long)i.aS > var3_14.j) {
                                            var10_41 = 13;
                                            var3_14.ao = 13;
                                            break;
                                        }
                                        if (var7_34 >= 504 && var11_42 < var8_35 && var3_14.as - 48 >= 360) {
                                            var10_41 = 10;
                                            var3_14.ao = 10;
                                        }
                                        if (var8_35 <= 360) {
                                            var10_41 = 5;
                                            var3_14.ao = 5;
                                        }
                                        if (var3_14.ao != 4) break;
                                        --var3_14.as;
                                        break;
                                    }
                                    case 5: {
                                        if ((long)i.aS > var3_14.j) {
                                            var10_41 = 14;
                                            var3_14.ao = 14;
                                            break;
                                        }
                                        if (var7_34 >= 504 && var11_42 > var8_35 && var3_14.as + 48 <= 504) {
                                            var10_41 = 11;
                                            var3_14.ao = 11;
                                        }
                                        if (var8_35 >= 504) {
                                            var10_41 = 4;
                                            var3_14.ao = 4;
                                        }
                                        if (var3_14.ao != 5) break;
                                        ++var3_14.as;
                                        break;
                                    }
                                    case 6: 
                                    case 7: 
                                    case 13: 
                                    case 14: {
                                        var12_43 = 0;
                                        var2_4 = 0;
                                        var5_27 = 0;
                                        switch (var3_14.ao) {
                                            case 6: 
                                            case 13: {
                                                var12_43 = 4;
                                                var2_4 = 2;
                                                v8 = 1;
                                                break;
                                            }
                                            case 7: 
                                            case 14: {
                                                var12_43 = 5;
                                                var2_4 = 1;
                                                v8 = var5_27 = 2;
                                            }
                                        }
                                        if (var4_19.e == 5 && var4_19.f == 0) {
                                            if (var3_14.ao == 13 || var3_14.ao == 14) {
                                                v9 = var3_14;
                                                v10 = 80;
                                            } else {
                                                v9 = var3_14;
                                                v10 = v9.bj = 10;
                                            }
                                        }
                                        if (var4_19.a()) {
                                            if (var3_14.ao == 13 || var3_14.ao == 14) {
                                                var3_14.k = i.aS + 40;
                                                var3_14.j = i.aS + e.a(340, 441);
                                            }
                                            var3_14.ao = var10_41 = var12_43;
                                        }
                                        if (var4_19.e < 5 || var7_34 < 504 || var11_42 < var8_35 - var2_4 * 24 || var11_42 > var8_35 + var5_27 * 24) break;
                                        var3_14.a(1, 48, 4);
                                    }
                                }
                                if (var7_34 >= 504 && var11_42 >= var8_35 - 24 && var11_42 <= var8_35 + 24) {
                                    var3_14.a(1, 48, (int)i.h[var3_14.k & 7]);
                                }
                                if (var3_14.aq > 0) continue;
                                var3_14.ao = 12;
                                var3_14.ap = 0;
                                break block1;
                            }
                            if (var3_14.ce != 5) ** GOTO lbl311
                            if (var3_14.cf > 0) ** GOTO lbl300
                            if (var3_14.aq <= 2) {
                                i.a[10][16] = 45;
                                i.c[10][16] = 24;
                                i.b[10][16] = 0;
                                i.b[10][16] = 0;
                            }
                            i.a[26][19] = 45;
                            i.c[26][19] = 24;
                            i.b[26][19] = 0;
                            v11 = i.b[26];
                            v12 = 19;
                            ** GOTO lbl310
lbl300:
                            // 1 sources

                            i.a[10][19] = 45;
                            i.c[10][19] = 24;
                            i.b[10][19] = 0;
                            i.b[10][19] = 0;
                            if (var3_14.aq > 2) ** GOTO lbl311
                            i.a[26][16] = 45;
                            i.c[26][16] = 24;
                            i.b[26][16] = 0;
                            v11 = i.b[26];
                            v12 = 16;
lbl310:
                            // 2 sources

                            v11[v12] = 0;
lbl311:
                            // 3 sources

                            if (var3_14.ao == 10 || var3_14.ao == 11) ** GOTO lbl335
                            for (var7_34 = 21; var7_34 < 23; ++var7_34) {
                                for (var12_43 = var8_35 / 24 - 1; var12_43 < var8_35 / 24 - 2 + 4; ++var12_43) {
                                    if (i.a[var12_43][var7_34] != 9) continue;
                                    if ((i.b[var12_43][var7_34] & 7) != 3) ** GOTO lbl327
                                    --var3_14.aq;
                                    switch (var3_14.ao) {
                                        case 0: 
                                        case 2: 
                                        case 4: 
                                        case 6: {
                                            v13 = var3_14;
                                            v14 = 2;
                                            ** GOTO lbl325
                                        }
                                        case 1: 
                                        case 3: 
                                        case 5: 
                                        case 7: {
                                            v13 = var3_14;
                                            v14 = 3;
lbl325:
                                            // 2 sources

                                            var10_41 = v14;
                                            v13.ao = v14;
                                        }
                                    }
lbl327:
                                    // 3 sources

                                    i.a[var12_43][var7_34] = -1;
                                    var3_14.b(var12_43, var7_34);
                                    i.a[var12_43][var7_34] = 30;
                                    i.c[var12_43][var7_34] = 24;
                                    i.b[var12_43][var7_34] = 4;
                                    var3_14.p(14);
                                }
                            }
lbl335:
                            // 2 sources

                            if (var10_41 != -1) {
                                var4_19.a(var10_41);
                                break;
                            }
                            v5 = var4_19;
lbl339:
                            // 2 sources

                            v5.b();
                            break;
                        }
                        case 4: {
                            var3_15 = var2_3;
                            if (var3_15.ao == 5) {
                                if (var3_15.Z) break;
                                var3_15.Z = true;
                            }
                            var4_20 = i.a[5];
                            ++var3_15.ap;
                            var2_5 = -1;
                            var5_28 = i.a[4];
                            var6_33 = -1;
                            var7_34 = var3_15.d();
                            if (i.a[var3_15.P][2] == -1) {
                                i.a[var3_15.P][2] = 31;
                            }
                            if (i.a[var3_15.Q][2] == -1) {
                                i.a[var3_15.Q][2] = 31;
                            }
                            switch (var3_15.ao) {
                                case 0: {
                                    if (var3_15.h < 10) break;
                                    var3_15.ao = 6;
                                    var3_15.ap = 0;
                                    break;
                                }
                                case 6: {
                                    if (var3_15.ap <= 10) break;
                                    var3_15.ao = 1;
                                    var2_5 = 2;
                                    var3_15.ap = 0;
                                    break;
                                }
                                case 1: {
                                    if (var3_15.ap > 40) {
                                        var3_15.ao = 2;
                                        var3_15.ap = 0;
                                        break;
                                    }
                                    if (var3_15.ap <= 20) break;
                                    var3_15.b(var7_34, 8);
                                    i.i(var7_34, 8);
                                    var3_15.M = var7_34;
                                    var3_15.N = 8;
                                    break;
                                }
                                case 7: {
                                    i.h(var3_15.M, var3_15.N);
                                    var3_15.M = -1;
                                    var3_15.N = -1;
                                    if (var3_15.ap > 80) {
                                        var3_15.ao = 8;
                                        var3_15.an();
                                    }
                                    if ((var3_15.ap & 111) != 1) break;
                                    var3_15.p(7);
                                    break;
                                }
                                case 3: {
                                    if (var3_15.ap <= 40) break;
                                    if (var3_15.aq > 0) {
                                        if (var3_15.S == 10) {
                                            var3_15.ao = 9;
                                            var3_15.ap = 0;
                                            break;
                                        }
                                        if (var3_15.S != 2 && var3_15.S != 1) break;
                                        var3_15.ao = 4;
                                        var3_15.ap = 0;
                                        var2_5 = 2;
                                        break;
                                    }
                                    var3_15.ao = 7;
                                    var3_15.ap = 0;
                                    break;
                                }
                                case 2: {
                                    if (var3_15.b(var7_34, 8)) {
                                        --var3_15.aq;
                                        var3_15.S = var3_15.ao;
                                        i.h(var3_15.M, var3_15.N);
                                        var3_15.M = -1;
                                        var3_15.N = -1;
                                        var3_15.S = var3_15.ao;
                                        var3_15.ao = 3;
                                        var2_5 = 3;
                                        var3_15.p(10);
                                    }
                                    if (var3_15.ap > 15 && var4_20.d != 6) {
                                        var2_5 = 6;
                                    }
                                    if (var3_15.ap <= 30) break;
                                    var3_15.ao = 4;
                                    var3_15.ap = 0;
                                    var2_5 = 0;
                                    i.h(var3_15.M, var3_15.N);
                                    var3_15.M = -1;
                                    var3_15.N = -1;
                                    break;
                                }
                                case 4: {
                                    v15 = var9_37 = var3_15.aq <= 1 ? 5 : 10;
                                    if (var3_15.ap < var9_37) ** GOTO lbl433
                                    var3_15.ao = 5;
                                    var3_15.ap = 0;
                                    v16 = 4;
                                    ** GOTO lbl435
lbl433:
                                    // 1 sources

                                    if (var3_15.ap <= var9_37 >> 1 || var4_20.d == 1) ** GOTO lbl436
                                    v16 = 1;
lbl435:
                                    // 2 sources

                                    var2_5 = v16;
lbl436:
                                    // 2 sources

                                    var3_15.e();
                                    var3_15.ad();
                                    break;
                                }
                                case 5: {
                                    var10_41 = var4_20.b + -40;
                                    var11_42 = (var4_20.a.a[var4_20.d] + var4_20.e) * 5;
                                    var11_42 = var4_20.a.c[var11_42 + 3];
                                    if (var10_41 - var11_42 <= 72 - var3_15.b + 40) {
                                        var3_15.T = 0;
                                        var3_15.ae();
                                        var3_15.ao = 10;
                                        var3_15.M = var7_34;
                                        var3_15.N = 4;
                                        i.i(var3_15.M, var3_15.N);
                                    }
                                    var3_15.e();
                                    var3_15.ad();
                                    break;
                                }
                                case 9: {
                                    var3_15.ap -= 2;
                                    var3_15.ad();
                                    var7_34 = var4_20.b + -40;
                                    var8_35 = (var4_20.a.a[var4_20.d] + var4_20.e) * 5;
                                    var8_35 = var4_20.a.c[var8_35 + 3];
                                    if (var7_34 - var8_35 < 240 - var3_15.b + 40) break;
                                    var3_15.ao = 6;
                                    var3_15.ap = 0;
                                    var9_38 = var3_15;
                                    var7_34 = var9_38.h - 10;
                                    var12_43 = var7_34 / 3;
                                    if (var7_34 == var12_43 * 3 + 2) {
                                        var12_43 += i.aS % 50 / 25;
                                    }
                                    var3_15.ar = var12_43;
                                    break;
                                }
                                case 10: {
                                    --var3_15.ap;
                                    var3_15.ad();
                                    ++var3_15.L;
                                    if (var3_15.L == 28) {
                                        var2_5 = 7;
                                    }
                                    if (var3_15.L < 50) break;
                                    var3_15.L = 0;
                                    var3_15.ao = 11;
                                    i.h(var3_15.M, var3_15.N);
                                    var3_15.M = -1;
                                    var3_15.N = -1;
                                    var2_5 = 8;
                                    var6_33 = 2;
                                    var3_15.k = true;
                                    break;
                                }
                                case 11: {
                                    --var3_15.ap;
                                    ++var3_15.L;
                                    if (var3_15.L >= 12) {
                                        var3_15.L = 0;
                                        var3_15.ao = 9;
                                        var2_5 = 4;
                                        var3_15.j = false;
                                        var3_15.k = false;
                                        break;
                                    }
                                    if (var3_15.j) break;
                                    var9_39 = var3_15;
                                    var7_34 = var9_39.d();
                                    if (var9_39.i != 4 || var9_39.h < var7_34 - 3 || var9_39.h > var7_34 + 4) break;
                                    var9_39.a(1, 64, var9_39.h == var7_34 ? 4 : 2);
                                    var9_39.j = true;
                                }
                            }
                            if (var2_5 == -1) {
                                var4_20.b();
                            } else {
                                var4_20.a(var2_5);
                            }
                            if (!var3_15.k) break;
                            if (var6_33 == -1) {
                                var5_28.b();
                                break;
                            }
                            var5_28.a(var6_33);
                            break;
                        }
                        case 5: {
                            var3_16 = var2_3;
                            var4_21 = i.a[5];
                            if (var3_16.ao != 12) ** GOTO lbl524
                            if (var3_16.ap++ > 100) {
                                var3_16.ao = 15;
                                var3_16.k(11, 11);
                            } else {
                                var3_16.a.b(7);
                            }
                            v17 = var4_21;
                            ** GOTO lbl713
lbl524:
                            // 1 sources

                            if (var3_16.ao == -1) {
                                if (var3_16.h * 24 < 360) break;
                                var3_16.ao = 10;
                                var4_21.a(10);
                                break;
                            }
                            if (var3_16.ao == 15 || var3_16.ao == -1) break;
                            var2_6 = -1;
                            var5_29 = var3_16.h * 24 + 12;
                            var6_33 = var3_16.i * 24;
                            var7_34 = var3_16.at + 24;
                            if (var3_16.ao == 13) {
                                var2_6 = 13;
                                if (var5_29 > var7_34) {
                                    var3_16.ae = true;
                                }
                            }
                            v18 = var8_35 = var3_16.aq > 0 && i.aS % var3_16.aq == 0 ? 2 : 1;
                            if (var3_16.ao == 6 || var3_16.ao == 7) {
                                v19 = var8_35 = (i.aS & 11) == 0 ? 2 : var8_35;
                            }
                            if (!(var3_16.ad || var3_16.ao != 0 && var3_16.ao != 1)) {
                                if (var3_16.ao == 0) {
                                    var3_16.dh = 36;
                                    var3_16.dh ^= -1;
                                    v20 = var3_16;
                                    v21 = v20;
                                    v22 = v20.dh + 1;
                                } else {
                                    v21 = var3_16;
                                    v22 = v21.dh = 36;
                                }
                                if (var6_33 < 504 && (var5_29 == var7_34 + var3_16.dh || i.aS % 76 == 0)) {
                                    var3_16.ad = true;
                                }
                            }
                            while (var8_35-- > 0) {
                                switch (var3_16.ao) {
                                    case 13: {
                                        if (var4_21.a()) {
                                            var2_6 = 0;
                                            var3_16.ao = 0;
                                            var3_16.ae = false;
                                            break;
                                        }
                                        if (!var3_16.ae) break;
                                        var4_21.b();
                                        break;
                                    }
                                    case 4: 
                                    case 5: {
                                        if (var4_21.a()) {
                                            var2_6 = var3_16.ao == 4 ? 0 : 1;
                                            var3_16.ao = var2_6;
                                        }
                                        var3_16.ad = false;
                                        var3_16.dh = 0;
                                        break;
                                    }
                                    case 10: 
                                    case 11: {
                                        if (var5_29 <= var7_34 || var7_34 >= 504) ** GOTO lbl576
                                        v23 = var3_16;
                                        v24 = 1;
                                        ** GOTO lbl579
lbl576:
                                        // 1 sources

                                        if (var5_29 >= var7_34 || var7_34 <= 360) ** GOTO lbl581
                                        v23 = var3_16;
                                        v24 = 0;
lbl579:
                                        // 2 sources

                                        var2_6 = v24;
                                        v23.ao = v24;
lbl581:
                                        // 2 sources

                                        var3_16.ad = false;
                                        var3_16.dh = 0;
                                        break;
                                    }
                                    case 6: {
                                        if (var6_33 >= 504) {
                                            if (var5_29 >= var7_34 - 48) {
                                                var2_6 = 8;
                                                var3_16.ao = 8;
                                                break;
                                            }
                                            var3_16.at -= 2;
                                            break;
                                        }
                                        if (var7_34 < 360) break;
                                        var2_6 = 0;
                                        var3_16.ao = 0;
                                        break;
                                    }
                                    case 7: {
                                        if (var6_33 >= 504) {
                                            if (var5_29 <= var7_34 + 48) {
                                                var2_6 = 9;
                                                var3_16.ao = 9;
                                                break;
                                            }
                                            var3_16.at += 2;
                                            break;
                                        }
                                        if (var7_34 > 504) break;
                                        var2_6 = 1;
                                        var3_16.ao = 1;
                                        break;
                                    }
                                    case 0: {
                                        if (var6_33 >= 504 && var7_34 > 360) {
                                            if (var5_29 < var7_34) {
                                                var2_6 = 6;
                                                var3_16.ao = 6;
                                                break;
                                            }
                                            --var3_16.at;
                                            break;
                                        }
                                        if (var3_16.ad) {
                                            var2_6 = 2;
                                            var3_16.ao = 2;
                                            break;
                                        }
                                        if (var7_34 <= 360) {
                                            var2_6 = 1;
                                            var3_16.ao = 1;
                                            break;
                                        }
                                        --var3_16.at;
                                        break;
                                    }
                                    case 1: {
                                        if (var6_33 >= 504 && var7_34 < 504) {
                                            if (var5_29 < var7_34) {
                                                ++var3_16.at;
                                                break;
                                            }
                                            var2_6 = 7;
                                            var3_16.ao = 7;
                                            break;
                                        }
                                        if (var3_16.ad) {
                                            var2_6 = 3;
                                            var3_16.ao = 3;
                                            break;
                                        }
                                        if (var7_34 >= 504) {
                                            var2_6 = 0;
                                            var3_16.ao = 0;
                                            break;
                                        }
                                        ++var3_16.at;
                                        break;
                                    }
                                    case 8: {
                                        if (var4_21.a()) {
                                            var2_6 = 10;
                                            var3_16.ao = 10;
                                        }
                                        if (var4_21.e < 4 || var6_33 < 504 || var5_29 < var7_34 - 48 || var5_29 > var7_34) break;
                                        ** GOTO lbl675
                                    }
                                    case 9: {
                                        if (var4_21.a()) {
                                            var2_6 = 11;
                                            var3_16.ao = 11;
                                        }
                                        if (var4_21.e < 4 || var6_33 < 504 || var5_29 < var7_34 || var5_29 > var7_34 + 48) break;
                                        ** GOTO lbl675
                                    }
                                    case 3: {
                                        if (var4_21.e == 5 && var4_21.f == 0) {
                                            var3_16.bj = 30;
                                        }
                                        if (var4_21.a()) {
                                            var2_6 = 11;
                                            var3_16.ao = 11;
                                            var3_16.ad = false;
                                            var3_16.dh = 0;
                                        }
                                        if (var4_21.e < 7 || var6_33 >= 504 || var5_29 != var7_34 + var3_16.dh) break;
                                        ** GOTO lbl675
                                    }
                                    case 2: {
                                        if (var4_21.e == 5 && var4_21.f == 0) {
                                            var3_16.bj = 30;
                                        }
                                        if (var4_21.a()) {
                                            var2_6 = 10;
                                            var3_16.ao = 10;
                                            var3_16.ad = false;
                                            var3_16.dh = 0;
                                        }
                                        if (var4_21.e < 7 || var6_33 >= 504 || var5_29 != var7_34 + var3_16.dh) break;
lbl675:
                                        // 4 sources

                                        var3_16.a(1, 48, 0);
                                    }
                                }
                                if (var6_33 < 504 || var5_29 < var7_34 - 24 || var5_29 > var7_34 - 24) continue;
                                var3_16.a(1, 48, (int)i.h[var3_16.k & 7]);
                            }
                            if ((var3_16.ao == 8 || var3_16.ao == 9) && var4_21.e == 5) {
                                var3_16.ae();
                            }
                            if (var3_16.ao == 6 || var3_16.ao == 7) ** GOTO lbl705
                            for (var9_40 = 21; var9_40 < 23; ++var9_40) {
                                for (var10_41 = var7_34 / 24 - 1; var10_41 < var7_34 / 24 - 2 + 4; ++var10_41) {
                                    if (i.a[var10_41][var9_40] != 0) continue;
                                    if ((i.b[var10_41][var9_40] & 7) != 3 || var3_16.ao == 13) ** GOTO lbl697
                                    --var3_16.aq;
                                    switch (var3_16.ao) {
                                        case 0: 
                                        case 2: 
                                        case 4: 
                                        case 8: 
                                        case 10: {
                                            v25 = var3_16;
                                            v26 = 4;
                                            ** GOTO lbl695
                                        }
                                        case 1: 
                                        case 3: 
                                        case 5: 
                                        case 9: 
                                        case 11: {
                                            v25 = var3_16;
                                            v26 = 5;
lbl695:
                                            // 2 sources

                                            var2_6 = v26;
                                            v25.ao = v26;
                                        }
                                    }
lbl697:
                                    // 3 sources

                                    i.a[var10_41][var9_40] = -1;
                                    var3_16.b(var10_41, var9_40);
                                    i.a[var10_41][var9_40] = 30;
                                    i.c[var10_41][var9_40] = 24;
                                    i.b[var10_41][var9_40] = 4;
                                    var3_16.p(14);
                                }
                            }
lbl705:
                            // 2 sources

                            if (var3_16.aq <= 0) {
                                var3_16.ao = 12;
                                var3_16.ap = 0;
                                var2_6 = 12;
                            }
                            if (var2_6 != -1) {
                                var4_21.a(var2_6);
                                break;
                            }
                            v17 = var4_21;
lbl713:
                            // 2 sources

                            v17.b();
                        }
                    }
                    if (i.b != 1) {
                        return;
                    }
                }
                if ((i.aS & 15) == 0) {
                    this.ac();
                }
                if (this.cf == 0 || (i.aS >> 1 & 1) != 0) break block297;
                this.ce += this.cf;
                if (this.ce != 0 && this.ce != 9) break block298;
                this.cf = 0;
                for (var2_7 = 1; var2_7 < this.f - 1; ++var2_7) {
                    for (var3_11 = 1; var3_11 < this.e - 1; ++var3_11) {
                        var4_22 = i.a[var3_11][var2_7] & 255;
                        var5_30 = i.a[var3_11][var2_7];
                        if (var4_22 != 15 && var4_22 != 16 && var5_30 != 34 && var5_30 != 35) continue;
                        this.c(var3_11, var2_7);
                    }
                }
                break block297;
            }
            if (this.ce != 5) break block297;
            var2_8 = this.f - 1;
            var3_11 = this.e - 1;
            for (var4_23 = 1; var4_23 < var2_8; ++var4_23) {
                for (var5_31 = 1; var5_31 < var3_11; ++var5_31) {
                    block304: {
                        block300: {
                            block303: {
                                block302: {
                                    block301: {
                                        block299: {
                                            var6_33 = i.a[var5_31][var4_23] & 255;
                                            var7_34 = i.a[var5_31][var4_23];
                                            var8_35 = 0;
                                            if (var6_33 != 15) break block299;
                                            this.e(var5_31, var4_23);
                                            i.a[var5_31][var4_23] = 34;
                                            break block300;
                                        }
                                        if (var6_33 != 16) break block301;
                                        this.e(var5_31, var4_23);
                                        i.a[var5_31][var4_23] = 35;
                                        break block300;
                                    }
                                    if (var7_34 != 34) break block302;
                                    v27 = i.a[var5_31];
                                    v28 = var4_23;
                                    v29 = 15;
                                    break block303;
                                }
                                if (var7_34 != 35) break block304;
                                v27 = i.a[var5_31];
                                v28 = var4_23;
                                v29 = 16;
                            }
                            v27[v28] = v29;
                            i.a[var5_31][var4_23] = -1;
                            this.m(var5_31, var4_23);
                        }
                        var8_35 = 1;
                    }
                    if (var8_35 == 0) continue;
                    i.l(var5_31, var4_23);
                }
            }
        }
        --this.b;
        if (this.aW > 0 && --this.aW == 0) {
            this.Z();
        }
        if (this.j <= 0 && this.w) {
            this.w = false;
            this.p(9);
            try {
                Thread.sleep(100L);
            }
            catch (InterruptedException v30) {}
            this.aq();
        }
        if (i.a[11] != null) {
            var2_9 = this;
            var3_11 = i.aS % 89;
            if (var3_11 < 15) {
                v31 = var2_9;
                v32 = 0;
            } else if (var3_11 < 45) {
                v31 = var2_9;
                v32 = 48 * (var3_11 - 15) / 30;
            } else if (var3_11 < 60) {
                v31 = var2_9;
                v32 = 48;
            } else {
                v31 = var2_9;
                v32 = 48 - 48 * (var3_11 - 60) / 30;
            }
            v31.aN = v32;
            var2_9.aO = var2_9.aN > 0 ? (var2_9.aN - 1) / 24 + 2 : 1;
            var3_11 = i.aS % 44;
            if (var3_11 < 7) {
                v33 = var2_9;
                v34 = 0;
            } else if (var3_11 < 22) {
                v33 = var2_9;
                v34 = 48 * (var3_11 - 7) / 15;
            } else if (var3_11 < 30) {
                v33 = var2_9;
                v34 = 48;
            } else {
                v33 = var2_9;
                v34 = 48 - 48 * (var3_11 - 30) / 15;
            }
            v33.aP = v34;
            v35 = var2_9.aQ = var2_9.aP > 0 ? (var2_9.aP - 1) / 24 + 2 : 1;
        }
        if (this.bi != 0 && this.bg != 0) {
            this.ab();
        }
        this.aj();
        if (this.aw > 0) {
            this.X();
        }
        this.au();
        if (this.cl != 0) {
            this.ai();
        }
        if (this.a != null) {
            this.ax = 70;
            if (this.a.a() && this.a.b() == null) {
                this.a = null;
            }
            if (this.a != null) {
                this.a.b();
            }
        } else if (this.bm != -1) {
            this.k(this.bm);
            this.bm = -1;
            this.a = 0;
        }
        if (this.aT > 0) {
            if (i.a[this.h][this.i] < 0) {
                if (i.a[this.h][this.i + 1] == 9 && (i.b[this.h][this.i + 1] & 7) == 3) {
                    ++this.i;
                    v36 = this;
                    v37 = this.k & -8;
                    v38 = 3;
                } else if (i.a[this.h - 1][this.i + 1] == 9 && (i.b[this.h - 1][this.i + 1] & 7) == 3) {
                    ++this.i;
                    --this.h;
                    v36 = this;
                    v37 = this.k & -8;
                    v38 = 3;
                } else if (i.a[this.h + 1][this.i + 1] == 9 && (i.b[this.h + 1][this.i + 1] & 7) == 3) {
                    ++this.i;
                    ++this.h;
                    v36 = this;
                    v37 = this.k & -8;
                    v38 = 3;
                } else {
                    v36 = this;
                    v37 = this.k & -8;
                    v38 = 0;
                }
                v36.k = v37 | v38;
            }
            v39 = this;
            v40 = i.b[this.h][this.i];
        } else if ((this.l == 0 || this.j <= 0 && this.l != 5) && !this.x && (this.k & 112) == 0 && this.aF == -1) {
            this.l = this.a;
            var2_10 = false;
            if (this.ay > 0) {
                this.l = (byte)2;
                --this.ay;
                if (this.ay == 0) {
                    this.f(this.h - 1, this.i);
                    this.a = 0;
                    i.ah = 0;
                }
            } else if (var1_1) {
                i.l(this.h, this.i);
            }
            switch (this.l) {
                case 3: {
                    this.k &= -9;
                }
                case 1: 
                case 2: 
                case 4: {
                    if (i.a[0].d == 40 || i.a[0].d == 48) break;
                    if ((this.k & 4096) == 0) {
                        var2_10 = this.a((int)(-i.g[this.l]), (int)(-i.g[this.l + 8]), false);
                        var1_1 = this.c();
                        if (!var2_10) break;
                        this.l = 40;
                        this.c = false;
                        var3_11 = this.l - 1;
                        if (var3_11 < 0) {
                            var3_11 = 0;
                        }
                        if ((this.k & 8) != 0) {
                            if (this.l == 2) {
                                this.g(8);
                                break;
                            }
                            this.g(9);
                            break;
                        }
                        this.g(var3_11 + 4);
                        break;
                    }
                    this.k = this.k & -8 | this.l;
                    this.j = 18;
                    var3_11 = this.l - 1;
                    if (var3_11 < 0) {
                        var3_11 = 0;
                    }
                    this.g(var3_11 + 0);
                    break;
                }
                case 6: {
                    v41 = var3_11 = (this.k & 7) == 2 ? 1 : -1;
                    if (!var1_1 || i.a[this.h + var3_11][this.i] >= 0) break;
                    this.g(var3_11 == -1 ? 22 : 20);
                    i.a[this.h + var3_11][this.i] = 32;
                    i.b[this.h + var3_11][this.i] = 18;
                    i.b[this.h + var3_11][this.i] = 4 | (var3_11 > 0 ? 1 : 0);
                    i.c[this.h + var3_11][this.i] = 30;
                    this.j = 72;
                    this.a = 0;
                    break;
                }
                case 5: {
                    this.j = 0;
                    var4_24 = this.k & 7;
                    if (!this.c()) break;
                    this.g(var4_24 + 13 - 1);
                    break;
                }
                case 0: {
                    this.k &= -9;
                    var5_32 = false;
                    switch (i.a[0].d) {
                        case 0: 
                        case 2: 
                        case 10: 
                        case 11: 
                        case 12: 
                        case 34: 
                        case 35: 
                        case 40: 
                        case 48: {
                            break;
                        }
                        default: {
                            if ((this.k & 16384) != 0) break;
                            var5_32 = true;
                        }
                    }
                    if (var5_32) {
                        var6_33 = 0 + (this.k & 7) - 1;
                        if (var6_33 < 0) {
                            var6_33 = 0;
                        }
                        this.g(var6_33);
                    }
                    if (this.a == null) {
                        v42 = this;
                        v43 = 6;
                    } else {
                        v42 = this;
                        v43 = v42.aX = 0;
                    }
                    if (this.j <= 0) break;
                    this.j -= 6;
                }
            }
            if (var1_1) {
                var3_11 = i.a[this.h][this.i - 1];
                if (!(var2_10 || this.l == 5 || this.j > 0 || var3_11 != 0 && var3_11 != 9 && var3_11 != 8 && var3_11 != 48 || (i.a[this.h][this.i] & 255) == 35)) {
                    var4_25 = 0;
                    if (i.e != null) {
                        var4_25 = i.a(i.e[this.h][this.i], (byte)0, (byte)3, (byte)4);
                    }
                    if (!this.l || var4_25 == 0 && var4_25 != 3) {
                        if ((this.k & 8) == 0 && i.a[0].d != 11 && i.a[0].d != 10 && i.a[0].d != 12) {
                            this.g(11);
                        }
                        this.c = true;
                        if (this.l <= 0) {
                            this.l = 40;
                            this.b = 0L;
                            this.a((int)i.i[8], 32, 0);
                            return;
                        }
                    }
                }
            }
            if (var2_10) {
                this.y = false;
            } else if (var1_1 && (i.aS & 31) == 0) {
                var3_11 = i.a[this.h][this.i - 1] == 0 ? 1 : 0;
                for (var4_26 = 1; var3_11 == 0 && var4_26 <= 4; var3_11 |= this.a((int)i.g[var4_26], (int)i.g[var4_26 + 8], true), ++var4_26) {
                }
                if (var3_11 == 0) {
                    if (this.y) {
                        this.g(19);
                    } else {
                        this.y = true;
                    }
                }
            }
        } else {
            if (this.x && this.j <= 0) {
                if (this.at) {
                    v44 = this;
                    v45 = this.p;
                } else {
                    v44 = this;
                    v45 = this.q;
                }
                v44.l = v45;
                this.k = this.k & -8 | this.l;
                this.h -= i.g[this.l];
                this.i -= i.g[this.l + 8];
                var1_1 = this.c();
                this.j = 18;
                if (i.a[0].d != 4) {
                    this.g(4 + this.l - 1);
                }
            }
            if ((this.k & 112) <= 32 || (this.k & 2048) != 0) {
                this.j -= 6;
                if (this.j <= 0) {
                    this.k &= -4209;
                    v39 = this;
                    v40 = v39.j = 0;
                }
            }
        }
        if (this.cl == 0) {
            if (this.E) {
                this.ck = 8;
                if (this.g()) {
                    this.c(this.bS, this.bT, 5);
                    this.E = false;
                }
            } else if (this.a == null) {
                if (i.ak && this.l != 0) {
                    i.ak = false;
                    this.ax = 0;
                }
                if (!i.ak) {
                    this.a();
                }
            } else {
                this.a = this.c;
                this.b = this.d;
            }
        }
        if (this.l != 0 && var1_1) {
            this.n = i.a[this.h][this.i + 1] >= 0;
        }
        this.aa();
        if (this.x && (this.h < -5 || this.h > this.e + 5 || this.i < -5 || this.i > this.f + 5)) {
            this.o();
            if (this.at || this.aB >= this.dK) {
                this.bs = 0;
                this.br = 12;
                i.b = (byte)35;
            } else {
                i.b = (byte)20;
                this.bs = 0;
                this.Y();
                this.z();
                i.e(6, this.bb);
            }
            this.c(false);
            this.u();
            this.e();
            this.aR = -1;
        }
    }

    private static byte a(int n, int n2, int n3, int n4) {
        int n5 = n + n2;
        if ((n > 0 && n3 == 0 || n < n3 && n3 > 0) && (a[n5][n4] < 0 || a[n5][n4] == 31 || i.d(n5, n4) >= 0)) {
            while (((n = n5) > 0 && n3 == 0 || n < n3 && n3 > 0) && (a[n5 += n2][n4] < 0 || i.d(n5, n4) >= 0 || a[n5][n4] == 31)) {
            }
        }
        return (byte)n;
    }

    private void X() {
        int n = this.e - 1;
        for (int i2 = 0; i2 < e.length; i2 += 3) {
            byte by = e[i2 + 2];
            if (by <= 0) continue;
            byte by2 = e[i2 + 1];
            int n2 = e[i2];
            n2 = i.e[i2] = i.a(n2, -1, 0, (int)by);
            byte by3 = i.a((int)by2, 1, n, (int)by);
            i.e[i2 + 1] = by3;
            by2 = by3;
            while (n2 <= by2) {
                this.a(n2, (int)by);
                ++n2;
            }
        }
    }

    private boolean a(int n, int n2) {
        int n3 = i.d(n, n2);
        int n4 = 0;
        if (n3 >= 0) {
            if (n3 == 37 && a[n][n2] == 43) {
                n4 = 0x10000000;
            }
            i.l(n, n2);
            i.a[n][n2] = 9;
            i.b[n][n2] = b[n][n2] & 0xF03FFFFF | n3 << 22 | n4;
            this.c(n, n2, 1);
        }
        n4 = (this.k & 0x4000) == 0 ? 0 : 3;
        b b2 = a[n4];
        if (this.c(n, n2) && this.aT <= 0 && b2.d != 40 && b2.d != 48 && b2.d != 47) {
            this.a(0, 16, 0);
        }
        return n3 >= 0;
    }

    private static int d(int n, int n2) {
        if (a[n][n2] < 0) {
            return -1;
        }
        switch (a[n][n2]) {
            case 1: {
                return 34;
            }
            case 45: {
                return 35;
            }
            case 19: 
            case 43: {
                return 37;
            }
            case 46: {
                return 36;
            }
            case 49: {
                return 39;
            }
        }
        return -1;
    }

    public static int a(byte[] byArray, int n) {
        return byArray[n] & 0xFF | (byArray[n + 1] & 0xFF) << 8;
    }

    public static int b(byte[] byArray, int n) {
        return byArray[n] & 0xFF | (byArray[n + 1] & 0xFF) << 8 | (byArray[n + 2] & 0xFF) << 16 | (byArray[n + 3] & 0xFF) << 24;
    }

    private static int e(int n, int n2) {
        n2 = i.a(i, n) + n2;
        if (n2 < 0) {
            n2 = 0;
        }
        i.i[n] = (byte)n2;
        i.i[n + 1] = (byte)(n2 >> 8);
        return n2;
    }

    private void Y() {
        for (int i2 = 0; i2 < this.ai; ++i2) {
            this.a(this.aA, this.aB, d[i2 << 1] & 0xFF, d[(i2 << 1) + 1] & 0xFF);
        }
    }

    private int b() {
        return i.e(4, this.aZ);
    }

    private void c(int n, int n2, int n3) {
        int n4 = this.ae << 1;
        i.a[n4] = (byte)n;
        i.a[n4 + 1] = (byte)n2;
        i.c[this.ae] = (byte)n3;
        i.b[this.ae] = 0;
        this.ae = this.ae + 1 & 7;
    }

    private void Z() {
        --this.az;
        ++this.bd;
        if (this.az >= 0) {
            this.ar();
            this.n = i[8];
            i i2 = this;
            this.o = true;
            this.k = 0;
            this.aT = 0;
            this.l = 0;
            this.a = 0;
            return;
        }
        b = (byte)12;
    }

    private void h(int n) {
        if (n < 0) {
            return;
        }
        byte by = q[n];
        byte by2 = r[n];
        int n2 = a[by][by2] & 0xFF;
        int n3 = a[by][by2] >> 8;
        if ((n3 & 0xF0) != 0) {
            return;
        }
        if (n2 != 7 || (n3 >> 8 & 0xFF) != n) {
            System.out.println("!!!!!!!!!!!!!! door missing");
        }
        n = n3 & 0xF;
        if (--n == 0) {
            n3 = n3 & 0xFFFFFF0F | 0x10;
            this.a((int)by, by2 - 1, 1, 0, 1);
            this.a((int)by, by2 - 1, -1, 0, 1);
            n = a[by][by2 - 1] >> 8 | 0x200;
            i.a[by][by2 - 1] = n << 8 | a[by][by2 - 1] & 0xFF;
            i.c[by][by2] = 24;
        } else {
            n3 = n3 & 0xFFFFFFF0 | n;
        }
        i.a[by][by2] = n3 << 8 | n2;
        this.p(8);
    }

    private void f(int n, int n2) {
        block10: {
            try {
                int n3 = a[n][n2] >> 8;
                if ((a[n][n2] & 0xFF) != 7) {
                    return;
                }
                if ((n3 & 0xF0) != 0) break block10;
                return;
            }
            catch (Exception exception) {
                return;
            }
        }
        if (a[n][n2] == 32) {
            return;
        }
        this.p(14);
        i.a[n][n2] = (n3 &= 0xFFFFFF0F) << 8 | 7;
        this.a(n, n2 - 1, 1, 0, 0);
        this.a(n, n2 - 1, -1, 0, 0);
        if (this.c(n, n2)) {
            this.b = 0L;
            this.bi = 0;
            this.a((int)i[8], 48, 0);
            this.p(2);
        } else {
            switch (a[n][n2]) {
                case 0: 
                case 1: 
                case 19: 
                case 43: 
                case 45: {
                    i.a[n][n2] = -1;
                    this.b(n, n2);
                    this.k(n, n2);
                }
            }
        }
        i.c[n][n2] = 24;
    }

    private void i(int n) {
        if (n < 0) {
            return;
        }
        try {
            this.f(q[n], r[n]);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void aa() {
        int n;
        i i2;
        boolean bl;
        boolean bl2;
        int n2;
        b b2;
        block121: {
            int n3;
            int n4;
            int n5;
            int n6;
            block120: {
                n6 = (this.k & 0x4000) == 0 ? 0 : 3;
                b2 = a[n6];
                n2 = -1;
                bl2 = true;
                bl = false;
                n5 = b2.a();
                if (n5 != 0) {
                    this.k &= 0xFFFFDFFF;
                }
                if (n6 != 3) break block120;
                if (n5 != 0) {
                    this.k &= 0xFFFFB7FF;
                    n4 = this.c();
                }
                break block121;
            }
            switch (b2.d) {
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: {
                    if (n5 != 0) {
                        n2 = 0 + (this.k & 7) - 1;
                        this.a = 0;
                        this.l = 0;
                        this.j = 0;
                        ah = 0;
                    }
                    break block121;
                }
                case 1: 
                case 3: {
                    if (n5 != 0) {
                        n2 = 0 + (this.k & 7) - 1;
                    }
                    bl = true;
                    break block121;
                }
                case 36: 
                case 37: 
                case 38: 
                case 39: {
                    n3 = 4;
                    break;
                }
                case 47: {
                    this.j = 0;
                    this.l = 0;
                    this.a = 0;
                    if ((aS & 1) == 0) {
                        n6 = this.h - 2 + aS % 5;
                        int n7 = this.i - 2 + aS % 3;
                        if (n6 == this.h && (n7 == this.i || n7 == this.i - 1)) {
                            n6 += (aS >> 1 & 1) == 0 ? 1 : -1;
                        }
                        this.c(n6, n7, aS * 3 % 5);
                    }
                    if (n5 != 0) {
                        n2 = 0 + (this.k & 7) - 1;
                        this.aH = -1;
                        this.aG = -1;
                        this.aF = -1;
                    }
                    break block121;
                }
                case 40: 
                case 48: {
                    this.j = 0;
                    this.l = 0;
                    this.a = 0;
                    if (b2.f == 0) {
                        if (b2.e == (b2.d == 40 ? 12 : 6)) {
                            this.p(4);
                        }
                        if (b2.e == (b2.d == 40 ? 13 : 6)) {
                            i i3 = this;
                            n5 = 0;
                            int n8 = -1;
                            boolean bl3 = false;
                            switch (i3.aI) {
                                case 26: {
                                    n5 = 1;
                                    i3.bm = 25;
                                    bl3 = true;
                                    break;
                                }
                                case 24: {
                                    bl3 = true;
                                    n5 = 1;
                                    i3.bm = 22;
                                    break;
                                }
                                case 27: {
                                    bl3 = true;
                                    n5 = 1;
                                    i3.bm = 23;
                                    break;
                                }
                                case 40: {
                                    bl3 = true;
                                    n5 = 1;
                                    i3.bm = 24;
                                    break;
                                }
                                case 42: {
                                    bl3 = true;
                                    n5 = 1;
                                    i3.p = true;
                                    i3.bm = 11;
                                    break;
                                }
                                case 41: {
                                    if (i3.f()) {
                                        i3.aj = true;
                                        i3.e();
                                    }
                                    i3.aZ += i3.aH;
                                    i3.aa -= i3.aH;
                                    if (i3.aa <= 0 && !i3.f()) {
                                        i.a[i3.ab][i3.ac] = -1;
                                        i3.aa = 0;
                                    }
                                    n8 = 3;
                                    break;
                                }
                                case 4: {
                                    n8 = 2;
                                    ++i3.aU;
                                    break;
                                }
                                case 5: {
                                    ++i3.aV;
                                    n8 = 1;
                                    break;
                                }
                                case 2: {
                                    ++i3.bb;
                                    bl3 = true;
                                    n8 = 0;
                                    break;
                                }
                                case 6: {
                                    ++i3.az;
                                    i.e[i3.h][i3.i] = -1;
                                    int[] nArray = d[i3.h];
                                    int n9 = i3.i;
                                    nArray[n9] = nArray[n9] | 0x100;
                                    n8 = 0;
                                    i3.a(i3.aA, i3.aB, i3.h, i3.i);
                                    break;
                                }
                                case 7: {
                                    i3.a((byte)127);
                                    n8 = 4;
                                    break;
                                }
                                case 51: 
                                case 52: 
                                case 53: {
                                    int n10;
                                    i i4;
                                    i3.a(i3.aA, i3.aB, i3.h, i3.i);
                                    n8 = 0;
                                    n5 = 1;
                                    i3.e();
                                    i3.h = true;
                                    if (i3.aI == 53) {
                                        i4 = i3;
                                        n10 = 0;
                                    } else if (i3.aI == 51) {
                                        i4 = i3;
                                        n10 = 1;
                                    } else {
                                        i4 = i3;
                                        n10 = 2;
                                    }
                                    i4.D = n10;
                                    i[2] = (byte)(i[2] | 1 << i3.D);
                                    i3.u();
                                }
                            }
                            if (n5 != 0) {
                                i3.g(47);
                            }
                            if (n8 != -1) {
                                i3.c(i3.h, i3.i - 1, n8);
                            }
                            if (bl3) {
                                i.d[i3.ai << 1] = (byte)i3.h;
                                i.d[(i3.ai << 1) + 1] = (byte)i3.i;
                                ++i3.ai;
                            }
                            i i5 = i3;
                            i3.o = true;
                            i3.aI = -1;
                        }
                    }
                    if (b2.a()) {
                        this.i = System.currentTimeMillis();
                        n2 = 0 + (this.k & 7) - 1;
                        this.aH = -1;
                        this.aG = -1;
                        this.aF = -1;
                    }
                    break block121;
                }
                case 35: {
                    bl = true;
                    n4 = 35;
                    break block121;
                }
                case 34: {
                    bl = true;
                    n4 = 34;
                    break block121;
                }
                case 0: {
                    bl = true;
                    n4 = 0;
                    break block121;
                }
                case 2: {
                    bl = true;
                    n4 = 2;
                    break block121;
                }
                case 9: {
                    if (!this.n) {
                        n4 = 27;
                    }
                    break block121;
                }
                case 8: {
                    if (!this.n) {
                        n4 = 26;
                    }
                    break block121;
                }
                case 27: {
                    if (!this.n) {
                        n4 = 9;
                    }
                    break block121;
                }
                case 26: {
                    if (!this.n) {
                        n4 = 8;
                    }
                    break block121;
                }
                case 4: 
                case 6: {
                    if (this.n) {
                        n4 = b2.d;
                    }
                    break block121;
                }
                case 5: {
                    if (!this.n) {
                        n4 = 24;
                    }
                    break block121;
                }
                case 7: {
                    if (!this.n) {
                        n4 = 25;
                    }
                    break block121;
                }
                case 24: {
                    if (this.n) {
                        n4 = 5;
                    }
                    break block121;
                }
                case 25: {
                    if (this.n) {
                        n4 = 7;
                    }
                    break block121;
                }
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 30: 
                case 31: 
                case 32: 
                case 33: {
                    if (n5 != 0) {
                        bl2 = false;
                        ah = 0;
                    }
                    break block121;
                }
                case 19: {
                    if (n5 != 0) {
                        bl2 = false;
                        this.Z();
                    }
                    break block121;
                }
                case 13: 
                case 14: 
                case 15: 
                case 16: 
                case 28: 
                case 29: {
                    if (n5 != 0) {
                        ah = 0;
                        this.l = 0;
                        this.j = 0;
                        n3 = 0;
                        break;
                    }
                    if ((this.k & 0x2000) == 0 && b2.e == 2 && b2.f == 0) {
                        int n11;
                        int n12;
                        int n13;
                        int n14;
                        int n15;
                        n6 = this.h - g[this.k & 7];
                        int n16 = this.i - g[(this.k & 7) + 8];
                        if (i[9] >= 8 && b2.e == 2 && b2.f == 0) {
                            this.c(n6, n16, -1);
                        }
                        n5 = n6;
                        i i6 = this;
                        int[] nArray = new int[]{0, 1, -1, 0, 0};
                        int[] nArray2 = new int[]{0, 0, 0, 1, -1};
                        byte by = 0;
                        boolean bl4 = i[9] >= 8;
                        int n17 = 0;
                        switch (a[n5][n16]) {
                            case 9: {
                                boolean bl5;
                                if ((i6.k & 0x2000) != 0) break;
                                i6.k |= 0x2000;
                                by = 1;
                                n15 = n16;
                                n14 = n5;
                                i i7 = i6;
                                n13 = n15;
                                n12 = n14;
                                if (e != null) {
                                    for (n11 = 0; n11 < e.length; n11 += 3) {
                                        if (e[n11 + 2] != n13 || e[n11] - 1 != n12 && e[n11 + 1] + 1 != n12) continue;
                                        bl5 = true;
                                        break;
                                    }
                                } else {
                                    bl5 = false;
                                }
                                if (bl5) break;
                                i.l(n14, n15);
                                n12 = i7.c(n14, n15 - 1) ? 2 : 1;
                                switch ((b[n14][n15] & 0xFC00000) >> 22) {
                                    case 39: {
                                        i.a[n14][n15] = 49;
                                        i.b[n14][n15] = n12;
                                        break;
                                    }
                                    case 37: {
                                        int n18;
                                        int n19;
                                        byte[] byArray;
                                        if ((b[n14][n15] & 0x10000000) != 0) {
                                            byArray = a[n14];
                                            n19 = n15;
                                            n18 = 43;
                                        } else {
                                            byArray = a[n14];
                                            n19 = n15;
                                            n18 = 19;
                                        }
                                        byArray[n19] = n18;
                                        i.b[n14][n15] = n12;
                                        i7.b(19, n14, n15);
                                        break;
                                    }
                                    case 35: {
                                        i.a[n14][n15] = 45;
                                        i.b[n14][n15] = b[n14][n15] & 0xFFFFFFF0 | 0xA;
                                        break;
                                    }
                                    case 34: {
                                        i.a[n14][n15] = 1;
                                        i7.c(n14, n15);
                                        break;
                                    }
                                    case 36: {
                                        i.a[n14][n15] = 46;
                                        i.b[n14][n15] = 0;
                                        i.b[n14][n15] = 0;
                                    }
                                }
                                break;
                            }
                            case 18: {
                                byte by2 = i6.d();
                                break;
                            }
                            case 0: {
                                n17 = 1;
                                break;
                            }
                            case 30: {
                                by = 1;
                                if (b[n5][n16] != 0) break;
                                i6.p(11);
                                i.b[n5][n16] = 1;
                                break;
                            }
                            case 10: {
                                if (i6.x != 3 || b[n5][n16] > 0) break;
                                by = 1;
                                i.b[n5][n16] = 1;
                                i6.b(n5, n16);
                                break;
                            }
                            case 16: {
                                by = 1;
                                n17 = 1;
                                break;
                            }
                            default: {
                                if (a[n5][n16] - 80 < 0 && ((a[n5][n16] & 0xFF) != 7 || (a[n5][n16] >> 8 & 0xF0) != 0)) break;
                                n17 = 1;
                                byte by2 = by = 1;
                            }
                        }
                        if (n17 != 0) {
                            i.j(200);
                            i6.p(6);
                            i6.g(41 + (i6.k & 7) - 1);
                        }
                        if (by == 0) {
                            for (n17 = 0; n17 < 5; ++n17) {
                                int n20 = n5 + nArray[n17];
                                n14 = n16 + nArray2[n17];
                                if (n20 < 0 || n20 >= i6.e || n14 < 0 || n14 >= i6.f) continue;
                                by = a[n20][n14];
                                n15 = 0;
                                n12 = 0;
                                switch (by) {
                                    case 1: {
                                        if (n20 != i6.h - g[i6.k & 7] || n14 != i6.i - g[(i6.k & 7) + 8]) break;
                                        n12 = 1;
                                        break;
                                    }
                                    case 19: 
                                    case 43: 
                                    case 45: 
                                    case 46: 
                                    case 49: {
                                        int n21;
                                        n13 = b[n20][n14] & 7;
                                        n11 = n13 == 0 ? 0 : b[n20][n14];
                                        int n22 = n21 = by != 49 && by != 46 ? 1 : 0;
                                        if (i.a(n5, n16, 0, 0, n20, n14, n13, n11)) {
                                            n12 = 1;
                                            n15 = n21;
                                        }
                                        if (n12 == 0) break;
                                        i6.p(10);
                                    }
                                }
                                if (bl4 && n12 != 0 && (n20 != i6.h || n14 != i6.i)) {
                                    if (!i6.a(n20, n14)) continue;
                                    i6.k |= 0x2000;
                                    continue;
                                }
                                if (n15 == 0) continue;
                                i6.k |= 0x2000;
                                if (by == 45) {
                                    n13 = (b[n20][n14] & 0x1C00) >> 10;
                                    if (n13 == 3) {
                                        i.a[n20][n14] = -1;
                                        i6.k(n20, n14);
                                        continue;
                                    }
                                    i.b[n20][n14] = 0xA | ++n13 << 10;
                                    i.b[n20][n14] = b[n20][n14] & 0xFFFFFF07 | 0x78;
                                    i.b[n20][n14] = 0;
                                    continue;
                                }
                                i6.b((int)by, n20, n14);
                            }
                        }
                        this.a = 0;
                        ah = 0;
                    }
                    break block121;
                }
                case 11: {
                    if (a[this.h][this.i - 1] == -1) {
                        n3 = 0;
                        break;
                    }
                    if (n5 != 0 && a[this.h][this.i - 1] != -1) {
                        this.b = 0L;
                        this.a((int)i[8], 32, 0);
                    }
                    break block121;
                }
                case 17: 
                case 18: {
                    if (n5 != 0) {
                        n2 = 0 + (this.k & 7) - 1;
                        this.j = 0;
                    } else if (b2.e > 0 && this.aF != -1) {
                        n6 = (this.k & 7) == 2 ? this.h + 1 : this.h - 1;
                        int n23 = a[n6][this.i] >> 8;
                        n5 = a[n6][this.i] & 0xFF;
                        n23 |= 0x100;
                        if (n5 == 9) {
                            --this.aU;
                        } else {
                            --this.aV;
                        }
                        i.a[n6][this.i] = n23 << 8 | n5;
                        this.h(n23 & 0xFF);
                        this.aH = -1;
                        this.aF = -1;
                    }
                    break block121;
                }
                case 10: {
                    if (n5 != 0) {
                        this.k &= 0xFFFFF7FF;
                        n4 = this.c();
                    } else {
                        this.b = 40L;
                    }
                    break block121;
                }
                case 12: {
                    if (this.bl < 120) {
                        this.bl += 12;
                    }
                    break block121;
                }
                default: {
                    n3 = 36;
                }
            }
            n4 = n2 = n3 + (this.k & 7) - 1;
        }
        if (bl) {
            i i8 = this;
            i2 = i8;
            n = i8.ax - 1;
        } else {
            i2 = this;
            n = i2.ax = 70;
        }
        if (n2 != -1) {
            this.g(n2);
        }
        if (bl2) {
            b2.b();
        }
        this.m = this.m > 0 ? (this.m = this.m - 1) : 0;
    }

    private int c() {
        int n;
        if (this.n <= 0) {
            this.p(2);
            n = 12;
            this.aW = 80;
        } else {
            n = 0 + (this.k & 7) - 1;
            this.k &= 0xFFFFFF8F;
            this.b = 40L;
        }
        this.l = 0;
        return n;
    }

    private static void j(int n) {
        if (m) {
            i.a.a.vibrate(200);
        }
    }

    private void ab() {
        if (this.o <= 0) {
            int n = this.bi > 0 ? 1 : -1;
            this.bi -= n;
            if (this.bi != 0) {
                if (a[this.bg][this.bh] == 48) {
                    int n2 = b[this.bg][this.bh];
                    n2 = this.bh + ((n2 & 8) == 0 ? -1 : 1);
                    if (a[this.bg + n][n2] < 0) {
                        i.a[this.bg + n][n2] = a[this.bg][n2];
                        i.a[this.bg][n2] = -1;
                        i.b[this.bg + n][n2] = b[this.bg][n2];
                        i.b[this.bg][n2] = this.o;
                    } else {
                        int n3 = this.h;
                        while (a[n2 = n3 - n][this.i] == 32) {
                            i.a[n2][this.i] = -1;
                            n3 = n2;
                        }
                        this.bi = 0;
                        return;
                    }
                }
                i.a[this.bg + n][this.bh] = a[this.bg][this.bh];
                i.a[this.bg][this.bh] = -1;
                this.b(this.bg, this.bh);
                this.bg += n;
                i.b[this.bg][this.bh] = this.be | Integer.MIN_VALUE;
                i.b[this.bg][this.bh] = this.o = (byte)18;
            } else {
                if (a[this.bg][this.bh] == 48) {
                    int n4 = b[this.bg][this.bh];
                    n4 = this.bh + ((n4 & 8) == 0 ? -1 : 1);
                    i.b[this.bg][n4] = 0;
                } else {
                    i.b[this.bg][this.bh] = this.bf;
                }
                i.b[this.bg][this.bh] = 0;
                this.bf = -1;
                this.c(this.bg, this.bh);
            }
            i.l(this.bg - n, this.bh);
            return;
        }
        i.b[this.bg][this.bh] = this.o = (byte)(this.o - 6);
        if ((this.bi == 1 || this.bi == -1) && this.o <= 6 && (this.k & 0x70) == 0) {
            this.g((this.k & 7) == 4 ? 23 : 21);
        }
    }

    private void ac() {
        int n;
        i i2;
        int n2 = k[this.aC << 1] - this.h;
        int n3 = k[(this.aC << 1) + 1] - this.i;
        if (this.k == 2 && this.aC == 2) {
            n2 = 10;
            n3 = -8;
        }
        if (n3 == 0) {
            if (n2 < 0) {
                i2 = this;
                n = 12;
            } else {
                i2 = this;
                n = 4;
            }
        } else if (n2 == 0) {
            if (n3 < 0) {
                i2 = this;
                n = 0;
            } else {
                i2 = this;
                n = 8;
            }
        } else if ((n3 = (n2 << 7) / n3) > 0) {
            if (n3 < 128) {
                if (n2 > 0) {
                    i2 = this;
                    n = 7;
                } else {
                    i2 = this;
                    n = 15;
                }
            } else if (n3 > 128) {
                if (n2 > 0) {
                    i2 = this;
                    n = 5;
                } else {
                    i2 = this;
                    n = 13;
                }
            } else if (n2 > 0) {
                i2 = this;
                n = 6;
            } else {
                i2 = this;
                n = 14;
            }
        } else if (n3 > -128) {
            if (n2 < 0) {
                i2 = this;
                n = 9;
            } else {
                i2 = this;
                n = 1;
            }
        } else if (n3 < -128) {
            if (n2 < 0) {
                i2 = this;
                n = 11;
            } else {
                i2 = this;
                n = 3;
            }
        } else if (n2 < 0) {
            i2 = this;
            n = 10;
        } else {
            i2 = this;
            n = 2;
        }
        i2.an = n;
    }

    private void g(int n, int n2) {
        for (int i2 = -1; i2 < 2; ++i2) {
            for (int i3 = -1; i3 < 2; ++i3) {
                int n3 = (this.a + n) / 24 + i3;
                int n4 = (this.b + n2) / 24 + i2;
                if (!this.c(n3, n4)) continue;
                this.a(1, 48, 0);
            }
        }
    }

    private void ad() {
        int n = this.d();
        if (this.h == n || this.h == n + 1) {
            b b2 = a[5];
            int n2 = b2.b + -40;
            int n3 = b2.b + 256;
            int n4 = (b2.a.a[b2.d] + b2.e) * 5;
            int n5 = i.a[0].b;
            if (n5 > (n2 -= (n4 = b2.a.c[n4 + 3])) && n5 < (n3 -= n4) && !this.j) {
                this.a(1, 48, this.h == n ? 4 : 2);
            }
        }
    }

    private static void h(int n, int n2) {
        if (n < 0 || n2 < 0) {
            return;
        }
        i.a[n][n2] = -1;
        i.a[n + 1][n2] = -1;
    }

    private static void i(int n, int n2) {
        if (n < 0 || n2 < 0) {
            return;
        }
        i.a[n][n2] = 50;
        i.a[n + 1][n2] = 50;
    }

    private boolean b(int n, int n2) {
        n2 = 0;
        for (int i2 = n; i2 <= n + 1; ++i2) {
            for (int i3 = 8; i3 >= 7; --i3) {
                if (a[i2][i3] != 0) continue;
                this.e(i2, i3);
                i.l(i2, i3);
                i.a[i2][i3] = -1;
                this.b(i2, i3);
                n2 = 1;
            }
        }
        return n2 != 0;
    }

    private int d() {
        int n = this.ar > 0 ? 1 : 0;
        return 10 + this.ar * (n + 2);
    }

    private int e() {
        b b2 = a[5];
        int n = b2.b + -40;
        int n2 = (b2.a.a[b2.d] + b2.e) * 5;
        n2 = b2.a.c[n2 + 3];
        n = n - n2 + this.b;
        return this.f * n / (this.f * 24);
    }

    private boolean e() {
        int n = this.d();
        int n2 = this.e();
        boolean bl = false;
        for (int i2 = n; i2 <= n + 1; ++i2) {
            for (int i3 = n2; i3 <= 10; ++i3) {
                if (a[i2][i3] != 0) continue;
                this.e(i2, i3);
                i.l(i2, i3);
                i.a[i2][i3] = -1;
                this.b(i2, i3);
                bl = true;
            }
        }
        return bl;
    }

    private void ae() {
        this.bj = 30;
        if (a[this.P][this.R] == -1) {
            i.a[this.P][this.O] = 0;
            i.l(this.P, this.O);
        }
        if (a[this.Q][this.R] == -1) {
            i.a[this.Q][this.O] = 0;
            i.l(this.Q, this.O);
        }
    }

    private void af() {
        this.ao = -1;
        this.aq = 5;
    }

    public final void a() {
        block18: {
            int n;
            block17: {
                i i2;
                i i3;
                int n2;
                block16: {
                    int n3;
                    i i4;
                    int n4;
                    i i5;
                    byte by = (this.k & 0x1000) == 0 ? this.l : (byte)0;
                    int n5 = this.h * 24 + this.j * g[by];
                    int n6 = 24 * this.e - 320;
                    n2 = 24 * this.f - 178;
                    if (n5 < this.c + 144) {
                        this.c = this.c - 144 + n5 >> 1;
                        if (this.c < 0) {
                            i5 = this;
                            n4 = 0;
                        }
                    } else if (n5 > this.c + 152) {
                        this.c = this.c - 152 + n5 >> 1;
                        if (this.c > n6) {
                            i5 = this;
                            n4 = i5.c = n6;
                        }
                    }
                    if ((n5 = this.i * 24 + this.j * g[by + 8] + 31) < this.d + 144) {
                        this.d = this.d - 144 + n5 >> 1;
                        if (this.d < 0) {
                            this.d = 0;
                        }
                    }
                    if (n5 > this.d + 41) {
                        this.d = this.d - 41 + n5 >> 1;
                        if (this.d > n2) {
                            this.d = n2;
                        }
                    }
                    this.a = this.c;
                    this.b = this.d;
                    if (this.a < 0) {
                        i4 = this;
                        n3 = 0;
                    } else if (this.a > n6) {
                        i4 = this;
                        n3 = i4.a = n6;
                    }
                    if (this.b >= 0) break block16;
                    i3 = this;
                    i2 = this;
                    n = 0;
                    break block17;
                }
                if (this.b <= n2) break block18;
                i3 = this;
                i2 = this;
                n = n2;
            }
            i2.d = n;
            i3.b = n;
        }
    }

    private void b(int n, int n2, byte by) {
        while ((a[n][n2] & 0xFF) == by) {
            i.a[n][n2] = -1;
            this.b(n - 1, n2, by);
            this.b(n + 1, n2, by);
            this.b(n, n2 - 1, by);
            ++n2;
        }
    }

    /*
     * Unable to fully structure code
     */
    private boolean a(int var1_1, int var2_2, boolean var3_4) {
        block61: {
            block60: {
                var4_5 = 0;
                var5_6 = this.k;
                var6_7 = this.h;
                var7_8 = this.i;
                var8_9 = this.l;
                var9_10 = this.x;
                var10_11 = this.aX;
                var11_12 = this.j;
                var12_13 = this.aW;
                if (var1_1 > 0) {
                    v0 = var5_6 & -8;
                    v1 = 2;
                } else if (var1_1 < 0) {
                    v0 = var5_6 & -8;
                    v1 = 4;
                } else if (var2_2 < 0) {
                    v0 = var5_6 & -8;
                    v1 = 1;
                } else {
                    v0 = var5_6 & -8;
                    v1 = 3;
                }
                var5_6 = v0 | v1;
                var13_14 = var6_7 + var1_1;
                var14_15 = var7_8 + var2_2;
                var15_16 = false;
                var16_17 = false;
                if (var13_14 >= 0 && var13_14 < this.e && var14_15 >= 0 && var14_15 < this.f) break block60;
                var15_16 = true;
                break block61;
            }
            if (i.e != null && i.e[var13_14][var14_15] != 0 && i.i[10] == 0) {
                var15_16 = false;
                var4_5 = 1;
            }
            switch ((byte)i.a[var13_14][var14_15]) {
                case 19: {
                    if (var3_4) break;
                    var17_18 = var13_14 + 3;
                    var18_19 = var14_15;
                    while (i.a[var17_18][var18_19] != 39) {
                        --var18_19;
                    }
                    if (!this.l) {
                        this.at();
                    }
                    this.l = true;
                    this.al = false;
                    if (i.e == null) {
                        i.e = new int[this.e][this.f];
                    }
                    this.a((byte)i.b[var17_18][var18_19], (byte)var17_18, (byte)var18_19, (byte)0);
                    this.n(var17_18, var18_19);
                    while ((i.a[var13_14][++var18_19] & 255) == 19) {
                        i.a[var13_14][var18_19] = -1;
                    }
                    break;
                }
                case 1: {
                    if (var3_4) break;
                    this.bj = 120;
                    ++this.am;
                    this.b(var13_14, var14_15, (byte)1);
                    break;
                }
                case 7: {
                    if ((i.a[var13_14][var14_15] >> 8 & 240) >> 4 >= 2) break;
                    v2 = 1;
                    break;
                }
                case 4: {
                    if (var3_4 || (var17_18 = (i.a[var13_14][var14_15] & -256) >> 8) < this.aC) break;
                    this.w = true;
                    this.aC = var17_18 + 1;
                    this.ak = i.aS + 13;
                    break;
                }
                case 28: {
                    if (var3_4) break;
                    var9_10 = true;
                    this.at = false;
                    break;
                }
                case 5: {
                    var15_16 = true;
                    if (var3_4) break;
                    var9_10 = true;
                    this.at = true;
                    break;
                }
                case 2: {
                    if (var3_4) break;
                    var16_17 = true;
                    switch (i.a[var13_14][var14_15] >> 8) {
                        case 0: {
                            if (i.i[9] < 1) ** GOTO lbl94
                            this.aD = 7;
                            v3 = this;
                            v4 = 0;
                            ** GOTO lbl106
lbl94:
                            // 1 sources

                            v5 = this;
                            ** GOTO lbl102
                        }
                        case 1: {
                            if (i.i[9] >= 2) {
                                v5 = this;
                                v6 = 7;
                            } else {
                                v5 = this;
lbl102:
                                // 2 sources

                                v6 = 13;
                            }
                            v5.aD = v6;
                            v3 = this;
                            v4 = 1;
lbl106:
                            // 2 sources

                            v3.aE = v4;
                        }
                    }
                    break;
                }
                case 6: {
                    break;
                }
                case 3: {
                    if (i.a[var13_14][var14_15] >> 8 < 3) {
                        var15_16 = true;
                        break;
                    }
                    var15_16 = false;
                    v2 = var4_5 = 1;
                }
            }
            if (var4_5 != 0) break block61;
            var17_18 = i.a[var13_14][var14_15];
            switch (var17_18) {
                case 34: 
                case 35: {
                    var15_16 = var3_4;
                    break;
                }
                case 31: 
                case 49: {
                    var15_16 = false;
                    break;
                }
                case 1: 
                case 2: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 11: 
                case 14: 
                case 19: 
                case 24: 
                case 26: 
                case 27: 
                case 33: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 45: 
                case 50: 
                case 51: 
                case 52: 
                case 53: {
                    var15_16 = true;
                    break;
                }
                case 10: {
                    if (this.x != 3) break;
                    if (!var3_4 && i.b[var13_14][var14_15] <= 0) {
                        i.b[var13_14][var14_15] = 1;
                    }
                    var15_16 = true;
                    break;
                }
                case 0: 
                case 8: 
                case 9: 
                case 47: {
                    var18_19 = var6_7 + (var1_1 << 1);
                    var2_2 = var7_8 + (var2_2 << 1);
                    if (this.k == 4 && (var18_19 == (var4_5 = this.d()) || var18_19 == var4_5 + 1) && var2_2 >= (var19_20 = this.e())) {
                        this.g(((var5_6 |= 8) & 7) == 2 ? 8 : 9);
                        return false;
                    }
                    var4_5 = i.a[var18_19][var2_2] & 255;
                    var19_20 = i.a[var18_19][var2_2] >> 8;
                    var20_22 = i.a[var13_14][var7_8 + 1];
                    if ((--var10_11 < 0 || var3_4) && var1_1 != 0 && i.e(var18_19, var2_2) && (var4_5 != 7 || (var19_20 & 240) != 0) && (var20_22 != 19 && var20_22 != 45 && var20_22 != 49 && var20_22 != 43 || (i.a[var13_14][var7_8 + 1] & 255) == 35)) {
                        if (!var3_4) {
                            v7 = var13_14;
                            var15_16 = var1_1 > 0;
                            var13_14 = var14_15;
                            var4_5 = v7;
                            var2_3 = this;
                            var18_19 = var15_16 != false ? var4_5 + 1 : var4_5 - 1;
                            var19_20 = i.b[var4_5][var13_14];
                            i.a[var18_19][var13_14] = var17_18;
                            i.a[var4_5][var13_14] = -1;
                            i.b[var18_19][var13_14] = 18;
                            if (var15_16) {
                                v8 = (var19_20 & -8 | 2) & -3073;
                                v9 = 1024;
                            } else {
                                v8 = (var19_20 & -8 | 4) & -3073;
                                v9 = 2048;
                            }
                            var19_20 = v8 | v9;
                            i.b[var18_19][var13_14] = var19_20 & -513 | -2147483648;
                            i.l(var18_19, var13_14);
                            var2_3.b(var4_5, var13_14);
                        }
                        var15_16 = true;
                        var5_6 |= 8;
                        break;
                    }
                    if (var1_1 != 0) {
                        var5_6 |= 8;
                    }
                    var8_9 = 0;
                    i.b[var13_14][var14_15] = i.b[var13_14][var14_15] & -8;
                    break;
                }
                case 48: {
                    var18_19 = var6_7 + (var1_1 << 1);
                    var2_2 = var7_8 + (var2_2 << 1);
                    --var10_11;
                    if ((i.b[var13_14][var14_15] & 8) != 0) {
                        var4_5 = 0;
                        v10 = 1;
                    } else {
                        var4_5 = -1;
                        v10 = var19_21 = 0;
                    }
                    if ((var10_11 < 0 || var3_4) && var1_1 != 0 && i.a[var18_19][var2_2 + var4_5] < 0 && i.a[var18_19][var2_2 + var19_21] < 0 && i.a[var13_14][var14_15 + var19_21 + 1] >= 0) {
                        if (!var3_4) {
                            i.a[var18_19][var2_2 + var4_5] = var17_18;
                            i.a[var18_19][var2_2 + var19_21] = var17_18;
                            i.a[var13_14][var14_15 + var4_5] = -1;
                            i.a[var13_14][var14_15 + var19_21] = -1;
                            i.b[var18_19][var2_2 + var4_5] = i.b[var13_14][var14_15 + var4_5];
                            i.b[var18_19][var2_2 + var19_21] = i.b[var13_14][var14_15 + var19_21] & -16 | (var1_1 > 0 ? 2 : 4);
                            i.b[var18_19][var2_2 + var19_21] = 18;
                            i.c[var18_19][var2_2 + var4_5 - 1] = 48;
                            i.c[var18_19][var2_2 + var4_5 - 1] = 48;
                            i.c[var18_19][var2_2 + var4_5 - 1] = 48;
                            i.l(var18_19, var2_2 + var19_21);
                        }
                        var15_16 = true;
                        var5_6 |= 8;
                        break;
                    }
                    if (var1_1 != 0) {
                        var5_6 |= 8;
                    }
                    var8_9 = 0;
                    break;
                }
                case -1: {
                    if (var13_14 != 0 && var14_15 != 0 && var13_14 != this.e - 1 && var14_15 != this.f - 1) ** GOTO lbl207
                    v11 = true;
                    ** GOTO lbl211
lbl207:
                    // 1 sources

                    if ((var1_1 != 0 && i.a[var13_14][var7_8 + 1] == 0 && (i.b[var13_14][var7_8 + 1] & 7) == 3 || this.aN >= 24 && (i.a[var13_14][var14_15 - 1] == 28 && (i.b[var13_14][var14_15 - 1] & 8) == 0 || i.a[var13_14][var14_15 + 1] == 28 && (i.b[var13_14][var14_15 + 1] & 8) == 0) || this.aP >= 24 && (i.a[var13_14][var14_15 - 1] == 28 || i.a[var13_14][var14_15 + 1] == 28)) && !var3_4) {
                        var8_9 = 0;
                    } else {
                        v11 = true;
lbl211:
                        // 2 sources

                        var15_16 = v11;
                    }
                    var5_6 &= -9;
                    break;
                }
                case 28: {
                    var8_9 = 0;
                    var5_6 &= -9;
                    break;
                }
                default: {
                    var1_1 = 0;
                    var15_16 = false;
                    if (this.l != 4 && this.l != 2) break;
                    this.g(0 + this.l - 1);
                }
            }
        }
        if (!var3_4 && var15_16 && !var16_17) {
            this.aD = -1;
        }
        if (var15_16 && var12_13 == 0) {
            var11_12 = 18;
            var6_7 += var1_1;
            var7_8 = var14_15;
            if ((var5_6 & 8) == 0 && !var3_4) {
                this.g(var8_9 + 4 - 1);
            }
        } else if (var1_1 != 0 && !var3_4) {
            var5_6 |= 8;
        }
        if ((var5_6 & 8) != 0 && !var3_4) {
            this.g((var5_6 & 7) == 2 ? 8 : 9);
        }
        if (!var3_4) {
            this.k = var5_6;
            this.h = var6_7;
            this.i = var7_8;
            this.l = var8_9;
            this.x = var9_10;
            this.aX = var10_11;
            this.j = var11_12;
            this.aW = var12_13;
        }
        return var15_16;
    }

    public static void b() {
        b = (byte)3;
    }

    private void ag() {
        b = (byte)2;
        V = true;
        ((i)((Object)string)).a(1);
        v0.o = true;
        if (a[18] == null) {
            int n = 3;
            String string = "/ui.f";
            boolean bl = false;
            String string2 = "/ui.f";
            i.a[18] = i.a("/ui.f", n, 0, 0);
        }
    }

    public final void c() {
        this.l = System.currentTimeMillis() - this.a;
        this.af = true;
        System.out.println(j.a());
        this.a.e();
    }

    public final void showNotify() {
        if (this.af) {
            this.d();
        }
    }

    public final void hideNotify() {
        if (!this.af) {
            this.c();
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void d() {
        this.af = false;
        i.V = true;
        i.W = true;
        this.d = true;
        i.ah = 0;
        this.db = -1;
        if (this.bo == 7) {
            this.bq = 0;
        }
        this.a = System.currentTimeMillis() - this.l;
        switch (i.b) {
            case 0: 
            case 6: 
            case 12: 
            case 22: {
                return;
            }
            case 7: {
                this.bq = 1;
                return;
            }
            case 15: {
                v0 = this;
                ** GOTO lbl92
            }
            case 1: {
                this.a.setClip(0, 0, 320, 240);
                this.a.setColor(0);
                this.a.fillRect(0, 0, 320, 240);
                var1_1 = this;
                this.o = true;
                if (i.a) {
                    this.o = true;
                    this.G();
                    return;
                }
                if (this.a != null) {
                    return;
                }
                if (this.ay != 0) {
                    return;
                }
                if (this.x) {
                    return;
                }
                if (this.n <= 0) {
                    return;
                }
                if (i.a[0].d == 19) {
                    return;
                }
                if (this.E) {
                    return;
                }
                this.ag();
                return;
            }
            case 5: {
                this.R = true;
                return;
            }
            case 8: {
                return;
            }
            case 9: 
            case 28: {
                return;
            }
            case 11: {
                this.bs = 6;
                return;
            }
            case 31: {
                this.Q = true;
                return;
            }
            case 16: {
                this.az = 0;
                this.bb = 0;
                this.p = false;
                this.ag = 0;
                this.D = true;
                return;
            }
            case 17: {
                return;
            }
            case 18: 
            case 25: 
            case 26: {
                v0 = this;
                ** GOTO lbl92
            }
            case 19: {
                return;
            }
            case 20: {
                return;
            }
            case 21: {
                this.ax();
                return;
            }
            case 23: {
                return;
            }
            case 27: {
                this.av = true;
                this.g = true;
                return;
            }
            case 2: {
                i.f = null;
                if (i.a) {
                    this.o = true;
                    this.G();
                }
                this.o = true;
                if (this.bo != 1) break;
                this.bq = 0;
                return;
            }
            case 33: {
                v0 = this;
lbl92:
                // 3 sources

                v0.av = true;
            }
        }
    }

    private void ah() {
        if (!this.l) {
            return;
        }
        for (int i2 = 0; i2 < this.e; ++i2) {
            for (int i3 = 0; i3 < this.f; ++i3) {
                if (a[i2][i3] != 38) continue;
                this.a((byte)b[i2][i3], (byte)i2, (byte)i3, (byte)0);
                ++this.du;
            }
        }
    }

    private void j(int n, int n2) {
        this.c |= 0x400000L;
        int[] nArray = a[n];
        int n3 = n2;
        nArray[n3] = nArray[n3] & 0xFFFFFF00;
        int[] nArray2 = a[n];
        int n4 = n2;
        nArray2[n4] = nArray2[n4] | 0xE;
    }

    private boolean f() {
        return this.k == 4 || this.k == 5 || this.k == 3;
    }

    private void a(int n, int n2, int n3, int n4, int n5) {
        block3: while (true) {
            if (n + n3 <= 0 || n + n3 >= this.e || n2 + n4 <= 0 || n2 + n4 >= this.f) {
                return;
            }
            int n6 = a[n + n3][n2 + n4] & 0xFF;
            switch (n6) {
                case 8: 
                case 9: {
                    int n7 = a[n + n3][n2 + n4] >> 8;
                    n7 = n5 == 1 ? n7 | 0x200 : n7 & 0xFFFFFDFF;
                    i.a[n + n3][n2 + n4] = n7 << 8 | n6;
                    this.a(n + n3, n2 + n4, n3, n4, n5);
                    int n8 = n + n3;
                    int n9 = n2 + n4;
                    n4 = 1;
                    n3 = 0;
                    n2 = n9;
                    n = n8;
                    continue block3;
                }
            }
            break;
        }
    }

    private boolean c(int n, int n2) {
        return n == this.h && n2 == this.i;
    }

    private void k(int n) {
        this.l = 0;
        this.a = 0;
        for (int i2 = 0; i2 < p.length; ++i2) {
            if (p[i2] != n) continue;
            this.a = a[i2];
        }
        this.a.a();
    }

    private boolean g() {
        boolean bl;
        boolean bl2;
        block26: {
            block24: {
                block25: {
                    block23: {
                        block22: {
                            block20: {
                                block21: {
                                    block19: {
                                        block17: {
                                            block18: {
                                                block16: {
                                                    block14: {
                                                        block15: {
                                                            block13: {
                                                                if (this.a >= this.ci) break block13;
                                                                this.a += this.ck;
                                                                if (this.a <= this.ci) break block14;
                                                                break block15;
                                                            }
                                                            if (this.a <= this.ci) break block14;
                                                            this.a -= this.ck;
                                                            if (this.a >= this.ci) break block14;
                                                        }
                                                        this.a = this.ci;
                                                    }
                                                    if (this.b >= this.cj) break block16;
                                                    this.b += this.ck;
                                                    if (this.b <= this.cj) break block17;
                                                    break block18;
                                                }
                                                if (this.b <= this.cj) break block17;
                                                this.b -= this.ck;
                                                if (this.b >= this.cj) break block17;
                                            }
                                            this.b = this.cj;
                                        }
                                        bl2 = false;
                                        bl = false;
                                        if (this.a >= 0) break block19;
                                        this.a = 0;
                                        break block20;
                                    }
                                    if (this.a <= this.e * 24 - 320) break block21;
                                    this.a = this.e * 24 - 320;
                                    break block20;
                                }
                                if (this.a != this.ci) break block22;
                            }
                            bl2 = true;
                        }
                        if (this.b >= 0) break block23;
                        this.b = 0;
                        break block24;
                    }
                    if (this.b <= this.f * 24 - 240 + 62) break block25;
                    this.b = this.f * 24 - 240 + 62;
                    break block24;
                }
                if (this.b != this.cj) break block26;
            }
            bl = true;
        }
        if (bl2 && bl) {
            this.c = this.a;
            this.d = this.b;
            this.ax = 70;
            return true;
        }
        return false;
    }

    private void ai() {
        switch (this.cl) {
            case 1: {
                this.ck = 8;
                if (!this.g()) break;
                this.cl = 2;
                this.dl = 40;
                return;
            }
            case 2: {
                --this.dl;
                if (this.dl == 30) {
                    if ((a[this.dj][this.dk] >> 8 & 0xF0) == 0) break;
                    this.f(this.dj, this.dk);
                    return;
                }
                if (this.dl != 0) break;
                this.cl = 3;
                this.ci = this.h * 24 - 148;
                this.cj = this.i * 24 - 77;
                this.ck = 5;
                this.e = a[l[cm]];
                b.a(this.e);
                this.di = 80;
                return;
            }
            case 3: {
                if (!this.g()) break;
                this.dl = 20;
                this.cl = 4;
                this.ax = 0;
                return;
            }
            case 4: {
                --this.dl;
                if (this.dl != 0) break;
                this.ax = 0;
                this.cl = 0;
                ak = true;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void aj() {
        var1_1 = this.h - 8;
        var2_2 = this.h + 8;
        var3_3 = this.i + 8;
        var4_25 = this.i - 8;
        var5_26 = 0;
        if (i.a[4] != null) {
            var6_27 = i.a[4].e;
            v0 = var6_27 == 0 ? 0 : (var6_27 <= 10 ? 1 : (var5_26 = var6_27 <= 20 ? 2 : 3));
        }
        if (var1_1 < 1) {
            var1_1 = 1;
        }
        if (var2_2 > this.e - 2) {
            var2_2 = this.e - 2;
        }
        if (var4_25 < 1) {
            var4_25 = 1;
        }
        if (var3_3 > this.f - 2) {
            var3_3 = this.f - 2;
        }
        v1 = this;
        v2 = v1.bF = var3_3;
        while (this.bF >= var4_25) {
            v3 = this;
            v4 = v3.bE = var1_1;
            while (this.bE <= var2_2) {
                block262: {
                    v5 = var6_27 = this.bi != 0 && this.bE == this.bg && this.bF == this.bh ? 1 : 0;
                    if (i.c[this.bE][this.bF] <= 0 || var6_27 != 0) break block262;
                    v6 = i.c[this.bE];
                    v7 = this.bF;
                    v6[v7] = (byte)(v6[v7] - 6);
                    switch ((byte)i.a[this.bE][this.bF]) {
                        case 36: {
                            var3_4 = this;
                            var7_42 = i.a[var3_4.bE][var3_4.bF] >> 8;
                            if (++var7_42 >= 16) {
                                v8 = i.a[var3_4.bE];
                                v9 = var3_4.bF;
                                v10 = -1;
                            } else {
                                i.c[var3_4.bE][var3_4.bF] = 24;
                                v8 = i.a[var3_4.bE];
                                v9 = var3_4.bF;
                                v10 = var7_42 << 8 | 36;
                            }
                            v8[v9] = v10;
                            break;
                        }
                        case 35: 
                        case 37: {
                            if (this.bE == this.bg && this.bF == this.bh && this.bi != 0) break;
                            var3_5 = this;
                            var6_27 = var3_5.bE;
                            var7_42 = var3_5.bF;
                            i.c[var6_27][var7_42] = 24;
                            if (i.b[var6_27][var7_42] > 0) ** GOTO lbl90
                            var8_43 = var7_42 - 1;
                            var9_44 = var7_42 + 1;
                            v11 = (byte)i.a[var6_27][var8_43];
                            var10_50 = v11;
                            if (v11 != 34 && var10_50 != 37) ** GOTO lbl59
                            v12 = i.a[var6_27];
                            v13 = var8_43;
                            v14 = 37;
                            ** GOTO lbl64
lbl59:
                            // 1 sources

                            if (var10_50 == 35 || !i.d(var6_27, var8_43)) ** GOTO lbl65
                            i.b[var6_27][var8_43] = 18;
                            v12 = i.a[var6_27];
                            v13 = var8_43;
                            v14 = 35;
lbl64:
                            // 2 sources

                            v12[v13] = v14;
lbl65:
                            // 2 sources

                            var11_51 = i.a[var6_27][var7_42];
                            if (i.a[var6_27][var8_43] < 0 && !var3_5.c(var6_27, var8_43) && var10_50 == 35 && var11_51 != 32 && var11_51 != 21 && i.a[var6_27][var7_42] != -1) {
                                i.b[var6_27][var8_43] = 18;
                                i.a[var6_27][var8_43] = i.a[var6_27][var7_42];
                                i.b[var6_27][var8_43] = i.b[var6_27][var7_42] & -8 | 1;
                                i.a[var6_27][var7_42] = -1;
                                var3_5.b(var6_27, var7_42);
                            } else {
                                var3_5.c(var6_27, var7_42);
                            }
                            if ((i.a[var6_27][var9_44] & 255) != 35 && i.a[var6_27][var9_44] != 47) {
                                if (i.a[var6_27][var7_42] == 37) {
                                    v15 = i.a[var6_27];
                                    v16 = var7_42;
                                    v17 = 34;
                                } else {
                                    v15 = i.a[var6_27];
                                    v16 = var7_42;
                                    v17 = -1;
                                }
                                v15[v16] = v17;
                            }
                            i.c[var6_27][var8_43] = 24;
                            if (i.a[var6_27][var7_42] >= 0) break;
                            v18 = i.b[var6_27];
                            v19 = var7_42;
                            v20 = (byte)18;
                            ** GOTO lbl95
lbl90:
                            // 1 sources

                            v21 = i.b[var6_27];
                            v22 = var7_42;
                            v19 = v22;
                            v18 = v21;
                            v20 = (byte)(v21[v22] - 6);
lbl95:
                            // 2 sources

                            v18[v19] = v20;
                            break;
                        }
                        case 32: {
                            var3_6 = this;
                            var6_27 = i.a[var3_6.bE][var3_6.bF] >> 8 & 255;
                            if ((i.aS & 1) == 0) {
                                ++var6_27;
                            } else if (var6_27 == 1) {
                                var3_6.b(var3_6.bE, var3_6.bF);
                            }
                            if (var6_27 == i.a[16].a(0)) {
                                v23 = i.a[var3_6.bE];
                                v24 = var3_6.bF;
                                v25 = -1;
                            } else {
                                v23 = i.a[var3_6.bE];
                                v24 = var3_6.bF;
                                v25 = var6_27 << 8 | 32;
                            }
                            v23[v24] = v25;
                            i.c[var3_6.bE][var3_6.bF] = 24;
                            break;
                        }
                        case 26: {
                            var3_7 = this;
                            if (var3_7.j > 6 || !var3_7.c(var3_7.bE, var3_7.bF)) break;
                            i.ah = 0;
                            var3_7.a = 0;
                            i.cm = i.a[var3_7.bE][var3_7.bF] >> 8;
                            var3_7.f(var3_7.h + i.g[var3_7.k & 7], var3_7.i);
                            if (i.cm < 0 || i.cm >= i.m.length) {
                                i.cm = -1;
                            } else {
                                var3_7.p(1);
                                var3_7.cl = 1;
                                var7_42 = i.cm;
                                var6_28 = var3_7;
                                var6_28.p(1);
                                var8_43 = var6_28.e - 1;
                                var9_45 = var6_28.f - 1;
                                for (var10_50 = 1; var10_50 < var9_45; ++var10_50) {
                                    for (var11_51 = 1; var11_51 < var8_43; ++var11_51) {
                                        if ((i.a[var11_51][var10_50] & 255) != 17 || i.a[var11_51][var10_50] >> 8 != var7_42) continue;
                                        var12_52 = -1;
                                        var13_53 = 0;
                                        if (i.a[var11_51][var10_50] == 18) {
                                            var12_52 = var11_51;
                                            v26 = var10_50;
                                        } else {
                                            switch (i.a[var11_51][var10_50 - 1] & 255) {
                                                case 7: {
                                                    if ((i.a[var11_51][var10_50 - 1] >> 8 & 240) == 0) break;
                                                }
                                                case 14: 
                                                case 33: {
                                                    var12_52 = var11_51;
                                                    v26 = var13_53 = var10_50 - 1;
                                                }
                                            }
                                        }
                                        if (var12_52 == -1) continue;
                                        var6_28.dj = var12_52;
                                        var6_28.dk = var13_53;
                                        var6_28.ci = var12_52 * 24 - 148;
                                        var6_28.cj = var13_53 * 24 - 77;
                                    }
                                }
                            }
                            i.a[var3_7.bE][var3_7.bF] = -1;
                            break;
                        }
                        case 6: {
                            var3_8 = this;
                            var6_27 = var3_8.bE;
                            var7_42 = var3_8.bF;
                            var8_43 = i.a[var6_27][var7_42] >> 8;
                            var9_46 = i.i(var6_27, var7_42) != false || i.a[var6_27][var7_42] == 47 || i.a[var6_27][var7_42] == 48;
                            var10_50 = i.b[var6_27][var7_42];
                            if (!var9_46 && var3_8.c(var6_27, var7_42)) {
                                var9_46 = true;
                                v27 = var10_50 = (var3_8.k & 4096) != 0 ? 0 : var3_8.j;
                            }
                            if (var9_46 && var10_50 < 12) {
                                var3_8.h(var8_43);
                                break;
                            }
                            var3_8.i(var8_43);
                            break;
                        }
                        case 33: {
                            this.n(33);
                            break;
                        }
                        case 14: {
                            this.n(14);
                            break;
                        }
                        case 2: {
                            switch (i.a[this.bE][this.bF] >> 8) {
                                case 0: {
                                    if (i.a[this.bE - 1][this.bF] == 30 || i.a[this.bE + 1][this.bF] == 30 || i.a[this.bE][this.bF - 1] == 30 || i.a[this.bE][this.bF + 1] == 30) break;
                                    this.aD = -1;
                                    this.b(this.bE, this.bF, (byte)2);
                                }
                            }
                            break;
                        }
                        case 3: {
                            var3_9 = this;
                            var6_27 = var3_9.bE;
                            var7_42 = var3_9.bF;
                            var8_43 = i.a[var6_27][var7_42] >> 8;
                            if (var8_43 >= 6) ** GOTO lbl219
                            switch (var8_43) {
                                case -1: {
                                    if (Math.abs(var3_9.h - var6_27) >= 4 || Math.abs(var3_9.i - var7_42) >= 4) break;
                                    var8_43 = 3;
                                    break;
                                }
                                case 0: 
                                case 1: {
                                    break;
                                }
                                case 2: {
                                    switch (var3_9.l) {
                                        case 1: {
                                            if (!var3_9.c(var6_27, var7_42 - 1)) break;
                                            ** GOTO lbl211
                                        }
                                        case 2: {
                                            if (!var3_9.c(var6_27 + 1, var7_42)) break;
                                            ** GOTO lbl211
                                        }
                                        case 3: {
                                            if (!var3_9.c(var6_27, var7_42 + 1)) break;
                                            ** GOTO lbl211
                                        }
                                        case 4: {
                                            if (!var3_9.c(var6_27 - 1, var7_42)) break;
lbl211:
                                            // 4 sources

                                            var8_43 = 3;
                                        }
                                    }
                                    break;
                                }
                                default: {
                                    if ((i.aS & 1) != 0) break;
                                    ++var8_43;
                                }
                            }
                            i.c[var6_27][var7_42] = 24;
                            i.a[var6_27][var7_42] = var8_43 << 8 | 3;
                            break;
lbl219:
                            // 1 sources

                            i.c[var6_27][var7_42] = 0;
                            break;
                        }
                        case 30: {
                            if (this.a != null || this.bm != -1 || !this.c(this.bE, this.bF) || this.j > 0) break;
                            this.bm = i.a[this.bE][this.bF] >> 8;
                            i.a[this.bE][this.bF] = -1;
                            break;
                        }
                        case 0: {
                            if (this.a != null || this.bm != -1 || !this.c(this.bE, this.bF) || this.j > 6) break;
                            this.bm = i.a[this.bE][this.bF] >> 8;
                            i.a[this.bE][this.bF] = -1;
                            break;
                        }
                        case 7: {
                            var3_10 = this;
                            var6_27 = var3_10.bE;
                            var7_42 = var3_10.bF;
                            var8_43 = i.a[var6_27][var7_42] >> 8;
                            var9_47 = (var8_43 & 240) >> 4;
                            if (var9_47 == 0) break;
                            if (i.aS % 3 == 0 && var9_47 < 3) {
                                var8_43 = var8_43 & -241 | var9_47 + 1 << 4;
                                if (var9_47 == 2) {
                                    var10_50 = i.a[var6_27][var7_42 - 1] & 255;
                                    if (var10_50 == 9 || var10_50 == 8) {
                                        var11_51 = i.a[var6_27][var7_42 - 1] >> 8 & -513;
                                        i.a[var6_27][var7_42 - 1] = var11_51 << 8 | var10_50;
                                    }
                                    var3_10.a(var6_27, var7_42 - 1, 1, 0, 0);
                                    var3_10.a(var6_27, var7_42 - 1, -1, 0, 0);
                                }
                                i.c[var6_27][var7_42] = 24;
                            }
                            i.a[var6_27][var7_42] = var8_43 << 8 | 7;
                            break;
                        }
                        case 8: {
                            v28 = this;
                            ** GOTO lbl255
                        }
                        case 9: {
                            v28 = this;
lbl255:
                            // 2 sources

                            var3_11 = v28;
                            var6_27 = v28.bE;
                            var7_42 = var3_11.bF;
                            var8_43 = i.a[var6_27][var7_42] >> 8;
                            var9_48 = i.a[var6_27][var7_42] & 255;
                            if ((var8_43 & 256) != 0 || (var9_48 != 9 || var3_11.aU <= 0) && (var9_48 != 8 || var3_11.aV <= 0) || var3_11.i != var7_42 || var3_11.h != var6_27 - 1 && var3_11.h != var6_27 + 1 || (var10_50 = i.a[0].d) == 18 || var10_50 == 17 || var3_11.j > 6) break;
                            var3_11.a = 0;
                            var3_11.l = 0;
                            if (var3_11.h == var6_27 - 1) {
                                var3_11.k = var3_11.k & -8 | 2;
                                v29 = var3_11;
                                v30 = 18;
                            } else {
                                var3_11.k = var3_11.k & -8 | 4;
                                v29 = var3_11;
                                v30 = 17;
                            }
                            v29.g(v30);
                            if (var9_48 == 9) {
                                v31 = var3_11;
                                v32 = 24;
                            } else {
                                v31 = var3_11;
                                v32 = 25;
                            }
                            v31.aF = v32;
                            var3_11.aG = 0;
                        }
                    }
                    if ((i.a[this.bE][this.bF] & -268435456) >> 28 > 0) {
                        var3_12 = this;
                        var6_29 = (i.a[var3_12.bE][var3_12.bF] & -268435456) >> 28;
                        if (var6_29 == 0) {
                            var3_12.p(10);
                        }
                        if ((i.aS & 1) == 0) {
                            ++var6_29;
                        }
                        if (var6_29 >= i.a[13].a(0)) {
                            v33 = i.a[var3_12.bE];
                            v34 = var3_12.bF;
                            v35 = i.a[var3_12.bE][var3_12.bF] & 0xFFFFFFF;
                        } else {
                            v33 = i.a[var3_12.bE];
                            v34 = var3_12.bF;
                            v35 = i.a[var3_12.bE][var3_12.bF] & 0xFFFFFFF | var6_29 << 28;
                        }
                        v33[v34] = v35;
                        i.l(var3_12.bE, var3_12.bF);
                    }
                    switch (i.a[this.bE][this.bF]) {
                        case 54: {
                            var3_13 = this;
                            var6_30 = var3_13.bE;
                            var7_42 = var3_13.bF;
                            var8_43 = i.b[var6_30][var7_42];
                            var9_49 = i.a[7];
                            var10_50 = i.a(var9_49, 0);
                            if (++var8_43 >= var10_50) {
                                i.a[var6_30][var7_42] = -1;
                                i.l(var6_30, var7_42);
                                break;
                            }
                            if (var8_43 != 1) ** GOTO lbl313
                            var3_13.p(7);
                            i.l(var6_30, var7_42);
                            ** GOTO lbl342
lbl313:
                            // 1 sources

                            if (var8_43 != var10_50 >> 1) ** GOTO lbl342
                            for (var11_51 = -1; var11_51 < 2; ++var11_51) {
                                for (var12_52 = -1; var12_52 < 2; ++var12_52) {
                                    var13_53 = var6_30 + var12_52;
                                    var14_54 = var7_42 + var11_51;
                                    switch (i.a[var13_53][var14_54]) {
                                        case 10: {
                                            if (var3_13.x != 3) break;
                                        }
                                        case 30: 
                                        case 37: {
                                            v36 = i.b[var13_53];
                                            v37 = var14_54;
                                            v38 = 1;
                                            ** GOTO lbl336
                                        }
                                        case 16: 
                                        case 19: 
                                        case 43: 
                                        case 49: {
                                            i.a[var13_53][var14_54] = -1;
                                            var3_13.k(var13_53, var14_54);
                                            i.c[var13_53][var14_54] = 24;
                                            break;
                                        }
                                        case 8: {
                                            i.a[var13_53][var14_54] = 54;
                                            v36 = i.b[var13_53];
                                            v37 = var14_54;
                                            v38 = 0;
lbl336:
                                            // 2 sources

                                            v36[v37] = v38;
                                            i.l(var13_53, var14_54);
                                        }
                                    }
                                    if (!var3_13.c(var13_53, var14_54)) continue;
                                    var3_13.a(1, 64, 0);
                                }
                            }
lbl342:
                            // 3 sources

                            i.b[var6_30][var7_42] = var8_43;
                            i.c[var6_30][var7_42] = 24;
                            break;
                        }
                        case 50: {
                            if (this.j >= 12 || !this.c(this.bE, this.bF) || this.j) break;
                            this.a(1, 48, (int)i.h[this.k & 7]);
                            break;
                        }
                        case 49: {
                            this.e((byte)49);
                            break;
                        }
                        case 48: {
                            if ((i.b[this.bE][this.bF] & 8) == 0) {
                                this.d((byte)48);
                                break;
                            }
                            this.ak();
                            break;
                        }
                        case 46: {
                            var3_14 = this;
                            var6_31 = var3_14.bE;
                            var7_42 = var3_14.bF;
                            var8_43 = i.b[var6_31][var7_42] & 31;
                            var9_44 = (i.b[var6_31][var7_42] & 8160) >> 5;
                            var10_50 = i.a(i.a[29], var8_43);
                            if ((i.a[var6_31][var7_42] & 255) == 35) {
                                if (++var9_44 > var10_50) {
                                    var9_44 = 0;
                                }
                                i.b[var6_31][var7_42] = 0 | var9_44 << 5;
                                break;
                            }
                            if (i.a[var6_31][var7_42 + 1] < 0 && var8_43 != 8 && var8_43 != 9) {
                                switch (var8_43) {
                                    case 0: 
                                    case 2: 
                                    case 4: 
                                    case 6: {
                                        v39 = 8;
                                        break;
                                    }
                                    default: {
                                        v39 = 9;
                                    }
                                }
                                var8_43 = v39;
                                i.b[var6_31][var7_42 + 1] = 18;
                                i.a[var6_31][var7_42 + 1] = 46;
                                i.a[var6_31][var7_42] = -1;
                                i.b[var6_31][var7_42 + 1] = var8_43;
                                i.l(var6_31, var7_42);
                                break;
                            }
                            if (var8_43 == 8 || var8_43 == 9) {
                                v40 = i.b[var6_31];
                                v41 = var7_42;
                                v40[v41] = (byte)(v40[v41] - 6);
                                if (i.b[var6_31][var7_42] < 0) {
                                    if (i.a[var6_31][var7_42 + 1] < 0) {
                                        i.b[var6_31][var7_42 + 1] = 18;
                                        i.a[var6_31][var7_42 + 1] = 46;
                                        i.a[var6_31][var7_42] = -1;
                                        i.b[var6_31][var7_42 + 1] = var8_43;
                                        i.l(var6_31, var7_42);
                                        break;
                                    }
                                    i.b[var6_31][var7_42] = var8_43 = var8_43 == 8 ? 10 : 11;
                                    i.b[var6_31][var7_42] = 0;
                                    break;
                                }
                                if (!i.a(var6_31, var7_42, 3, (int)i.b[var6_31][var7_42], var3_14.h, var3_14.i, var3_14.k & 7, var3_14.j)) break;
                                var3_14.a(1, 48, i.b[var6_31][var7_42] & 7);
                                break;
                            }
                            if (i.h(var6_31, var7_42)) {
                                i.a[var6_31][var7_42] = -1;
                                var3_14.k(var6_31, var7_42);
                                i.l(var6_31, var7_42);
                                break;
                            }
                            if (!var3_14.c(var6_31 - 1, var7_42) && !var3_14.c(var6_31 + 1, var7_42) && !var3_14.c(var6_31, var7_42 - 1)) ** GOTO lbl419
                            if (var3_14.i != var7_42 - 1) ** GOTO lbl411
                            v42 = 17;
                            ** GOTO lbl416
lbl411:
                            // 1 sources

                            if (var3_14.h != var6_31 - 1) ** GOTO lbl414
                            v42 = 16;
                            ** GOTO lbl416
lbl414:
                            // 1 sources

                            if (var3_14.h != var6_31 + 1) ** GOTO lbl417
                            v42 = 15;
lbl416:
                            // 3 sources

                            var8_43 = v42;
lbl417:
                            // 2 sources

                            var9_44 = 0;
                            ** GOTO lbl484
lbl419:
                            // 1 sources

                            var12_52 = var3_14.k & 7;
                            if (var3_14.h != var6_31 || var3_14.j != 6 || var12_52 != 4 && var12_52 != 2 || var3_14.i >= var7_42 || i.a[var6_31][var7_42 - 1] >= 0 || var7_42 * 24 > var3_14.b + 240 - 62) ** GOTO lbl430
                            switch (var8_43) {
                                case 0: 
                                case 2: {
                                    v43 = 6;
                                    ** GOTO lbl427
                                }
                                case 1: 
                                case 3: {
                                    v43 = 7;
lbl427:
                                    // 2 sources

                                    var8_43 = v43;
                                    var9_44 = 0;
                                }
                            }
                            ** GOTO lbl484
lbl430:
                            // 1 sources

                            if (var3_14.i != var7_42 || var3_14.j != 6 || var12_52 != 1 && var12_52 != 3 || var8_43 < 0 || var8_43 > 3 || (var3_14.h >= var6_31 || i.a[var6_31 - 1][var7_42] >= 0 || var6_31 * 24 >= var3_14.a + 320) && (var3_14.h <= var6_31 || i.a[var6_31 + 1][var7_42] >= 0 || (var6_31 + 1) * 24 <= var3_14.a)) ** GOTO lbl434
                            var8_43 = var3_14.h < var6_31 ? 4 : 5;
                            var9_44 = 0;
                            ** GOTO lbl484
lbl434:
                            // 1 sources

                            ++var9_44;
                            switch (var8_43) {
                                case 4: {
                                    var13_53 = var6_31 - 1;
                                    if (i.a[var13_53][var7_42] >= 0 || var9_44 != i.b(i.a[29], 4, 1)) break;
                                    i.a[var13_53][var7_42] = 21;
                                    i.b[var13_53][var7_42] = 4;
                                    i.b[var13_53][var7_42] = 18;
                                    v44 = i.c[var13_53];
                                    v45 = var7_42;
                                    ** GOTO lbl462
                                }
                                case 5: {
                                    var14_54 = var6_31 + 1;
                                    if (i.a[var14_54][var7_42] >= 0 || var9_44 != i.b(i.a[29], 5, 1)) break;
                                    i.a[var14_54][var7_42] = 21;
                                    i.b[var14_54][var7_42] = 2;
                                    i.b[var14_54][var7_42] = 18;
                                    v44 = i.c[var14_54];
                                    v45 = var7_42;
                                    ** GOTO lbl462
                                }
                                case 6: 
                                case 7: {
                                    var12_52 = var7_42 - 1;
                                    if (i.a[var6_31][var12_52] >= 0 || var9_44 != i.b(i.a[29], var8_43, 1)) break;
                                    i.a[var6_31][var12_52] = 21;
                                    i.b[var6_31][var12_52] = 1;
                                    i.b[var6_31][var12_52] = 18;
                                    v44 = i.c[var6_31];
                                    v45 = var12_52;
lbl462:
                                    // 3 sources

                                    v44[v45] = 24;
                                }
                            }
                            if (var9_44 > var10_50) {
                                var9_44 = 0;
                                switch (var3_14.a(var6_31, var7_42, var3_14.h, var3_14.i, false)) {
                                    case 4: {
                                        if (var3_14.i == var7_42 && var8_43 != 4 && var6_31 * 24 < var3_14.a + 320) {
                                            v46 = 4;
                                            break;
                                        }
                                        v46 = 0;
                                        break;
                                    }
                                    case 2: {
                                        if (var3_14.i == var7_42 && var8_43 != 5 && (var6_31 + 1) * 24 > var3_14.a) {
                                            v46 = 5;
                                            break;
                                        }
                                        v46 = 1;
                                        break;
                                    }
                                    case 1: {
                                        var8_43 = var3_14.h == var6_31 && var8_43 != 6 && var8_43 != 7 && var7_42 * 24 <= var3_14.b + 240 - 62 ? (var8_43 == 2 ? 6 : 7) : (var3_14.h < var6_31 ? 2 : 3);
                                        ** GOTO lbl484
                                    }
                                    default: {
                                        v46 = var3_14.h < var6_31 ? 0 : 1;
                                    }
                                }
                                var8_43 = v46;
                            }
lbl484:
                            // 7 sources

                            i.c[var6_31][var7_42] = 24;
                            i.b[var6_31][var7_42] = var8_43 & 31 | var9_44 << 5;
                            break;
                        }
                        case 45: {
                            var3_15 = this;
                            var6_32 = var3_15.bE;
                            var7_42 = var3_15.bF;
                            i.c[var6_32][var7_42] = 24;
                            var8_43 = (i.b[var6_32][var7_42] & 7168) >> 10;
                            var9_44 = i.b[var6_32][var7_42] & 15;
                            var10_50 = 0;
                            v47 = var11_51 = (i.a[var6_32][var7_42] & 255) == 35 ? 1 : 0;
                            if (var9_44 == 10) {
                                var10_50 = 100;
                            } else {
                                var12_52 = i.a[28].a(var9_44);
                                for (var13_53 = 0; var13_53 < var12_52; ++var13_53) {
                                    var10_50 += i.a[28].a(var9_44, var13_53);
                                }
                            }
                            var12_52 = (i.b[var6_32][var7_42] & 2088960) >> 13;
                            i.b[var6_32][var7_42] = i.b[var6_32][var7_42] & -2088961 | ++var12_52 << 13;
                            if (var9_44 >= 4 && var9_44 <= 9) {
                                v48 = i.b[var6_32];
                                v49 = var7_42;
                                v50 = 12;
                            } else {
                                v48 = i.b[var6_32];
                                v49 = var7_42;
                                v50 = v48[v49] = 0;
                            }
                            if (var12_52 > var10_50 >> 1) {
                                if (var11_51 == 0) {
                                    if (var3_15.c(var6_32, var7_42) && var9_44 != 10) {
                                        switch (var9_44) {
                                            case 4: 
                                            case 5: {
                                                v51 = 1;
                                                break;
                                            }
                                            case 6: {
                                                v51 = 2;
                                                break;
                                            }
                                            case 7: 
                                            case 8: {
                                                v51 = 3;
                                                break;
                                            }
                                            case 9: {
                                                v51 = 4;
                                                break;
                                            }
                                            default: {
                                                v51 = i.h[var3_15.k & 7];
                                            }
                                        }
                                        var13_53 = v51;
                                        var3_15.a(1, 48, var13_53);
                                    }
                                    if (i.h(var6_32, var7_42)) {
                                        i.a[var6_32][var7_42] = -1;
                                        var3_15.k(var6_32, var7_42);
                                        break;
                                    }
                                }
                                if (var12_52 >= var10_50) {
                                    i.l(var6_32, var7_42);
                                    var12_52 = var3_15.a(var6_32, var7_42, var3_15.h, var3_15.i, true);
                                    var10_50 = 0;
                                    switch (var9_44) {
                                        case 0: 
                                        case 3: 
                                        case 4: 
                                        case 7: 
                                        case 9: {
                                            var10_50 = 1;
                                        }
                                    }
                                    v52 = var13_53 = var12_52 == 4 ? 1 : 0;
                                    if (var10_50 != var13_53) {
                                        var14_54 = var13_53 != 0 ? 3 : 2;
                                        var10_50 = var6_32;
                                        var15_55 = var7_42;
                                    } else {
                                        var10_50 = var6_32 - i.g[var12_52];
                                        var15_55 = var7_42 - i.g[var12_52 + 8];
                                        if (var13_53 != 0) {
                                            if (var3_15.c(var10_50, var15_55) && var9_44 != 0) {
                                                var14_54 = 0;
                                                var10_50 = var6_32;
                                                var15_55 = var7_42;
                                            } else {
                                                switch (var12_52) {
                                                    case 1: {
                                                        v53 = 4;
                                                        break;
                                                    }
                                                    case 4: {
                                                        v53 = 9;
                                                        break;
                                                    }
                                                    case 3: {
                                                        v53 = 7;
                                                        break;
                                                    }
                                                    default: {
                                                        v53 = 0;
                                                        break;
                                                    }
                                                }
                                            }
                                        } else if (var3_15.c(var10_50, var15_55) && var9_44 != 1) {
                                            var14_54 = 1;
                                            var10_50 = var6_32;
                                            var15_55 = var7_42;
                                        } else {
                                            switch (var12_52) {
                                                case 1: {
                                                    v53 = 5;
                                                    break;
                                                }
                                                case 2: {
                                                    v53 = 6;
                                                    break;
                                                }
                                                case 3: {
                                                    v53 = 8;
                                                    break;
                                                }
                                                default: {
                                                    v53 = var14_54 = 1;
                                                }
                                            }
                                        }
                                    }
                                    if (!(i.a[var10_50][var15_55] < 0) || var11_51 != 0) {
                                        if (var10_50 != var6_32 || var15_55 != var7_42) {
                                            var14_54 = 0;
                                        }
                                        var10_50 = var6_32;
                                        var15_55 = var7_42;
                                    }
                                    i.a[var6_32][var7_42] = -1;
                                    i.b[var10_50][var15_55] = 0;
                                    i.b[var10_50][var15_55] = var8_43 << 10 | var14_54;
                                    i.b[var10_50][var15_55] = i.b[var10_50][var15_55] & -2088961;
                                    i.a[var10_50][var15_55] = 45;
                                }
                            }
                            if (var11_51 != 0) {
                                if (!var3_15.c(var6_32, var7_42) || var9_44 == 10) break;
                            } else {
                                var14_54 = var6_32;
                                var12_52 = var7_42;
                                switch (var9_44) {
                                    case 7: 
                                    case 8: {
                                        --var12_52;
                                        break;
                                    }
                                    case 10: {
                                        var14_54 = -1;
                                        var12_52 = -1;
                                        break;
                                    }
                                    case 9: {
                                        ++var14_54;
                                        break;
                                    }
                                    case 6: {
                                        --var14_54;
                                        break;
                                    }
                                    case 0: 
                                    case 1: 
                                    case 2: 
                                    case 3: {
                                        break;
                                    }
                                    case 4: 
                                    case 5: {
                                        ++var12_52;
                                    }
                                }
                                if (!var3_15.c(var14_54, var12_52)) break;
                            }
                            var3_15.a(1, 48, (int)i.h[var3_15.k & 7]);
                            break;
                        }
                        case 44: {
                            this.am();
                            break;
                        }
                        case 40: {
                            this.l(40);
                            break;
                        }
                        case 36: {
                            var3_16 = this;
                            var6_33 = var3_16.bE;
                            var7_42 = var3_16.bF;
                            if (i.b[var6_33][var7_42] == 0) {
                                if (i.a[var6_33][var7_42 - 1] != 11) break;
                                i.b[var6_33][var7_42] = 1;
                                var3_16.an();
                                break;
                            }
                            if (!var3_16.c(var6_33, var7_42 - 1)) break;
                            var3_16.a(1, 64, 0);
                            break;
                        }
                        case 28: {
                            var3_17 = this;
                            var6_34 = i.b[var3_17.bE][var3_17.bF];
                            var7_42 = (var6_34 & 7) == 3 ? 1 : -1;
                            var8_43 = (var6_34 & 8) == 0 ? var3_17.aO : var3_17.aQ;
                            var10_50 = var3_17.bF + (var8_43 - 1) * var7_42;
                            if (var3_17.c(var3_17.bE, var10_50)) {
                                var3_17.a(2, 48, (int)i.h[var3_17.k & 7]);
                            }
                            switch (i.a[var3_17.bE][var10_50]) {
                                case -1: 
                                case 28: 
                                case 32: {
                                    break;
                                }
                                default: {
                                    var3_17.k(var3_17.bE, var10_50);
                                    i.a[var3_17.bE][var10_50] = -1;
                                    i.l(var3_17.bE, var10_50);
                                    var3_17.b(var3_17.bE, var10_50);
                                }
                            }
                            i.c[var3_17.bE][var3_17.bF] = 24;
                            break;
                        }
                        case 16: {
                            var3_18 = this;
                            var6_35 = var3_18.bE;
                            var7_42 = var3_18.bF;
                            if (i.a[var6_35][var7_42 + 1] != 16) {
                                var8_43 = 0;
                                v54 = -1;
                            } else {
                                var8_43 = 1;
                                v54 = 0;
                            }
                            var9_44 = v54;
                            var10_50 = i.b[var6_35][var7_42 + var8_43];
                            var11_51 = i.b[var6_35][var7_42 + var8_43];
                            var12_52 = (var11_51 & 7) == 4 ? 4 : 2;
                            v55 = var13_53 = var3_18.c(var6_35 - i.g[var12_52], var7_42 + var8_43) != false || var3_18.c(var6_35 - i.g[var12_52], var7_42 + var9_44) != false ? 1 : 0;
                            if (var10_50 <= 0 && var13_53 != 0 && var3_18.j <= 12) {
                                var10_50 = 36;
                            } else if (var10_50 > 0) {
                                if (var8_43 == 0) {
                                    var10_50 = (byte)(var10_50 - 1);
                                }
                                if ((var10_50 == 11 || var8_43 == 0 && var10_50 < 11) && var13_53 != 0) {
                                    var3_18.a(1, 48, var11_51 & 7);
                                }
                                i.c[var6_35][var7_42] = 24;
                            }
                            if (i.h(var6_35, var7_42)) {
                                var3_18.p(14);
                                i.a[var6_35][var7_42 + var9_44] = -1;
                                var3_18.k(var6_35, var7_42 + var9_44);
                                i.a[var6_35][var7_42 + var8_43] = -1;
                                var3_18.k(var6_35, var7_42 + var8_43);
                                break;
                            }
                            i.b[var6_35][var7_42 + var9_44] = var11_51;
                            i.b[var6_35][var7_42 + var8_43] = var11_51;
                            if (var8_43 != 0) break;
                            i.b[var6_35][var7_42 + var9_44] = var10_50;
                            i.b[var6_35][var7_42 + var8_43] = var10_50;
                            break;
                        }
                        case 14: {
                            var3_19 = this;
                            var6_36 = var3_19.bE;
                            var7_42 = var3_19.bF;
                            var8_43 = i.b[var6_36][var7_42];
                            var9_44 = var8_43 >> 8 & 255;
                            v56 = var10_50 = (var8_43 & 8) != 0 ? 4 : 2;
                            if (var9_44 < 20) ** GOTO lbl709
                            if (i.f(var6_36, var7_42 + 1) || var10_50 == 4 && (i.a[var6_36 - 1][var7_42] < 0 || i.a[var6_36 - 1][var7_42] == 16 || i.a[var6_36 - 1][var7_42] == 19 || i.a[var6_36 - 1][var7_42] == 43) || var10_50 == 2 && (i.a[var6_36 + 1][var7_42] < 0 || i.a[var6_36 + 1][var7_42] == 16 || i.a[var6_36 + 1][var7_42] == 19 || i.a[var6_36 + 1][var7_42] == 43)) {
                                i.b[var6_36][var7_42] = var8_43 & -65281 | 4864;
                            }
                            ** GOTO lbl746
lbl709:
                            // 1 sources

                            if (var9_44 <= 0) ** GOTO lbl715
                            i.b[var6_36][var7_42] = var8_43 & -65281 | var9_44 - 1 << 8;
                            v57 = i.c[var6_36];
                            v58 = var7_42;
                            v59 = (byte)24;
                            ** GOTO lbl746
lbl715:
                            // 1 sources

                            var11_51 = i.b[var6_36][var7_42];
                            if (var11_51 > 0) ** GOTO lbl743
                            var12_52 = var6_36;
                            var13_53 = var7_42;
                            if (!i.f(var6_36, var7_42 + 1)) ** GOTO lbl723
                            var13_53 = var7_42 + 1;
                            var10_50 = 3;
                            ** GOTO lbl736
lbl723:
                            // 1 sources

                            if (var10_50 != 4) ** GOTO lbl730
                            if (!i.f(var6_36 - 1, var7_42)) ** GOTO lbl727
                            var12_52 = var6_36 - 1;
                            ** GOTO lbl736
lbl727:
                            // 1 sources

                            var10_50 = 0;
                            if (i.a[var6_36 - 1][var7_42] == 16 || i.a[var6_36 - 1][var7_42] == 19 || i.a[var6_36 - 1][var7_42] == 43) ** GOTO lbl736
                            ** GOTO lbl735
lbl730:
                            // 1 sources

                            if (!i.f(var6_36 + 1, var7_42)) ** GOTO lbl733
                            var12_52 = var6_36 + 1;
                            ** GOTO lbl736
lbl733:
                            // 1 sources

                            var10_50 = 0;
                            if (i.a[var6_36 + 1][var7_42] == 16 || i.a[var6_36 + 1][var7_42] == 19 || i.a[var6_36 + 1][var7_42] == 43) ** GOTO lbl736
lbl735:
                            // 2 sources

                            var8_43 = var8_43 & -65281 | 5120;
lbl736:
                            // 6 sources

                            if (var12_52 != var6_36 || var13_53 != var7_42) {
                                i.a[var12_52][var13_53] = 14;
                                i.l(var12_52, var13_53);
                                i.a[var6_36][var7_42] = -1;
                                i.b[var12_52][var13_53] = 18;
                            }
                            i.b[var12_52][var13_53] = var8_43 & -8 | var10_50;
                            ** GOTO lbl746
lbl743:
                            // 1 sources

                            v57 = i.b[var6_36];
                            v58 = var7_42;
                            v59 = v57[v58] = (byte)(var11_51 - 6);
lbl746:
                            // 4 sources

                            if (!var3_19.c(var6_36, var7_42)) break;
                            var3_19.a(1, 48, var10_50);
                            break;
                        }
                        case 10: {
                            var3_20 = this;
                            var6_37 = var3_20.bE;
                            var7_42 = var3_20.bF;
                            if (i.b[var6_37][var7_42] <= 0) break;
                            i.a[var6_37][var7_42] = -1;
                            i.a[var6_37][var7_42] = 32;
                            i.l(var6_37, var7_42);
                            var3_20.m(var6_37, var7_42);
                            i.c[var6_37][var7_42] = 24;
                            break;
                        }
                        case 21: {
                            var3_21 = this;
                            var6_38 = var3_21.bE;
                            var7_42 = var3_21.bF;
                            var8_43 = i.b[var6_38][var7_42] & 7;
                            if ((i.b[var6_38][var7_42] & 8) != 0) {
                                switch (var8_43) {
                                    case 4: {
                                        v60 = 12;
                                        break;
                                    }
                                    case 2: {
                                        v60 = 13;
                                        break;
                                    }
                                    default: {
                                        v60 = var9_44 = 14;
                                    }
                                }
                                if (i.b[var6_38][var7_42] >= i.a(i.a[29], var9_44) || (i.a[var3_21.bE][var3_21.bF] & 255) == 35) {
                                    i.a[var6_38][var7_42] = -1;
                                    i.l(var6_38, var7_42);
                                } else {
                                    v61 = i.b[var6_38];
                                    v62 = var7_42;
                                    v61[v62] = (byte)(v61[v62] + 1);
                                }
                                v63 = i.c[var6_38];
                                v64 = var7_42;
                                v65 = (byte)24;
                            } else {
                                if (var3_21.c(var6_38, var7_42) || var3_21.c(var6_38 + i.g[var8_43], var7_42 + i.g[var8_43 + 8]) && i.b[var6_38][var7_42] <= var3_21.j) {
                                    var3_21.a(1, 48, 0);
                                }
                                if (i.b[var6_38][var7_42] <= 0) {
                                    var9_44 = var6_38 - i.g[var8_43];
                                    var10_50 = var7_42 - i.g[var8_43 + 8];
                                    var11_51 = 24;
                                    if (var8_43 == 4) {
                                        var11_51 = 12;
                                    }
                                    if (i.a[var9_44][var10_50] < 0) {
                                        i.a[var9_44][var10_50] = 21;
                                        i.b[var9_44][var10_50] = i.b[var6_38][var7_42];
                                        i.b[var9_44][var10_50] = var11_51;
                                        v66 = i.a[var6_38];
                                        v67 = var7_42;
                                        v68 = -1;
                                    } else if (i.a[var9_44][var10_50] == 21) {
                                        var12_52 = i.b[var9_44][var10_50] & 7;
                                        var13_53 = var9_44 - i.g[var12_52];
                                        var14_54 = var10_50 - i.g[var12_52 + 8];
                                        i.a[var6_38][var7_42] = -1;
                                        i.l(var6_38, var7_42);
                                        var12_52 = i.b[var6_38][var7_42];
                                        if (i.a[var13_53][var14_54] < 0) {
                                            i.a[var13_53][var14_54] = 21;
                                            i.b[var13_53][var14_54] = i.b[var9_44][var10_50];
                                            i.b[var13_53][var14_54] = 18;
                                        }
                                        i.a[var9_44][var10_50] = 21;
                                        i.b[var9_44][var10_50] = var12_52;
                                        v66 = i.b[var9_44];
                                        v67 = var10_50;
                                        v68 = 18;
                                    } else {
                                        switch (i.a[var9_44][var10_50]) {
                                            case 19: 
                                            case 43: 
                                            case 45: 
                                            case 46: {
                                                i.a[var9_44][var10_50] = -1;
                                                var3_21.k(var9_44, var10_50);
                                                break;
                                            }
                                            case 10: 
                                            case 30: {
                                                if (i.b[var9_44][var10_50] >= 1) break;
                                                i.b[var9_44][var10_50] = 1;
                                            }
                                        }
                                        v69 = i.b[var6_38];
                                        v70 = var7_42;
                                        v69[v70] = v69[v70] | 8;
                                        v66 = i.b[var6_38];
                                        v67 = var7_42;
                                        v68 = 0;
                                    }
                                    v66[v67] = v68;
                                    v63 = i.c[var9_44];
                                    v64 = var10_50;
                                    v65 = (byte)48;
                                } else {
                                    v71 = i.b[var6_38];
                                    v72 = var7_42;
                                    v64 = v72;
                                    v63 = v71;
                                    v65 = (byte)(v71[v72] - 12);
                                }
                            }
                            v63[v64] = v65;
                            break;
                        }
                        case 32: {
                            this.ap();
                            break;
                        }
                        case 11: {
                            this.ao();
                            break;
                        }
                        case 37: {
                            var3_22 = this;
                            var6_39 = var3_22.bE;
                            var7_42 = var3_22.bF;
                            var8_43 = i.b[var6_39][var7_42];
                            if (var8_43 <= 0) break;
                            if (var8_43 >= 8) {
                                var3_22.m(var6_39, var7_42);
                                i.a[var6_39][var7_42] = -1;
                                i.l(var6_39, var7_42);
                            }
                            i.b[var6_39][var7_42] = var8_43 + 1;
                            i.c[var6_39][var7_42] = 24;
                            break;
                        }
                        case 30: {
                            var3_23 = this;
                            var6_40 = i.b[var3_23.bE][var3_23.bF];
                            if (var6_40 <= 0) break;
                            var7_42 = var3_23.bE;
                            var8_43 = var3_23.bF;
                            if (var6_40 == 4) {
                                for (var9_44 = 1; var9_44 < 5; ++var9_44) {
                                    var10_50 = i.g[var9_44];
                                    var11_51 = i.g[var9_44 + 8];
                                    if (i.a[var7_42 + var10_50][var8_43 + var11_51] != 30) continue;
                                    v73 = i.b[var7_42 + var10_50];
                                    v74 = var8_43 + var11_51;
                                    v73[v74] = v73[v74] + 1;
                                    i.c[var7_42 + var10_50][var8_43 + var11_51] = 24;
                                }
                            } else if (var6_40 >= 16) {
                                i.a[var7_42][var8_43] = -1;
                                i.l(var7_42, var8_43);
                            }
                            i.b[var7_42][var8_43] = var6_40 + 1;
                            i.c[var7_42][var8_43] = 24;
                            break;
                        }
                        case 24: {
                            this.m(24);
                            break;
                        }
                        case 27: {
                            this.m(27);
                            break;
                        }
                        case 26: {
                            this.m(26);
                            break;
                        }
                        case 43: {
                            this.e((byte)43);
                            break;
                        }
                        case 19: {
                            this.e((byte)19);
                            break;
                        }
                        case 42: {
                            this.l(42);
                            break;
                        }
                        case 2: {
                            this.l(2);
                            break;
                        }
                        case 53: {
                            this.l(53);
                            break;
                        }
                        case 51: {
                            this.l(51);
                            break;
                        }
                        case 52: {
                            this.l(52);
                            break;
                        }
                        case 5: {
                            this.l(5);
                            break;
                        }
                        case 4: {
                            this.l(4);
                            break;
                        }
                        case 6: {
                            this.l(6);
                            break;
                        }
                        case 7: {
                            this.l(7);
                            break;
                        }
                        case 41: {
                            this.l(41);
                            break;
                        }
                        case 47: {
                            this.as();
                            this.al();
                            break;
                        }
                        case 1: {
                            this.as();
                            break;
                        }
                        case 0: {
                            this.as();
                            break;
                        }
                        case 9: {
                            if ((i.b[this.bE][this.bF] & 0xFC00000) != 0x8400000) ** GOTO lbl964
                            i.c[this.bE][this.bF] = 24;
                            if (this.au > 0) {
                                v75 = this;
                                v76 = v75;
                                v77 = v75.au - 1;
                            } else if (this.au < 0) {
                                v78 = this;
                                v76 = v78;
                                v77 = v76.au = v78.au + 1;
                            }
                            if (this.av <= 0) ** GOTO lbl959
                            v79 = this;
                            v80 = v79;
                            v81 = v79.av - 1;
                            ** GOTO lbl963
lbl959:
                            // 1 sources

                            if (this.av >= 0) ** GOTO lbl964
                            v82 = this;
                            v80 = v82;
                            v81 = v82.av + 1;
lbl963:
                            // 2 sources

                            v80.av = v81;
lbl964:
                            // 3 sources

                            this.as();
                            break;
                        }
                        case 8: {
                            this.as();
                            break;
                        }
                        case 23: {
                            v83 = this;
                            v84 = 23;
                            ** GOTO lbl976
                        }
                        case 22: {
                            v83 = this;
                            v84 = 22;
lbl976:
                            // 2 sources

                            var7_42 = var5_26;
                            var6_41 = v84;
                            var3_24 = v83;
                            var8_43 = v83.bE;
                            var9_44 = var3_24.bF;
                            var10_50 = var6_41 == 23 ? -1 : 1;
                            i.c[var8_43][var9_44] = 24;
                            if (var3_24.i != var9_44) break;
                            for (var11_51 = 0; var11_51 <= var7_42; ++var11_51) {
                                var12_52 = var8_43 + var11_51 * var10_50;
                                if (var3_24.h != var12_52) continue;
                                var3_24.a(1, 64, 0);
                            }
                            break;
                        }
                    }
                }
                v85 = this;
                v3 = v85;
                v4 = v85.bE + 1;
            }
            v86 = this;
            v1 = v86;
            v2 = v86.bF - 1;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void ak() {
        block6: {
            var1_2 = this.bE;
            var0_1 = this.bF;
            var2_3 = var0_1 + 1;
            var2_3 = i.b[var1_2][var2_3];
            switch (var2_3 & 7) {
                case 4: {
                    v0 = var1_2 + 1;
                    break block6;
                }
                case 2: {
                    v1 = var1_2;
                    break;
                }
                default: {
                    if ((var2_3 & 16) != 0) ** GOTO lbl16
                    v0 = var1_2 + 1;
                    break block6;
lbl16:
                    // 1 sources

                    v1 = var1_2;
                }
            }
            v0 = v1 - 1;
        }
        var2_3 = v0;
        var1_2 = (i.b[var1_2][var0_1] >> 24) * 3;
        if (i.a[var2_3][var0_1] < 0) {
            i.e[var1_2 + 2] = (byte)var0_1;
            i.e[var1_2 + 1] = (byte)var2_3;
            v2 = i.e;
            v3 = var1_2;
            v4 = (byte)var2_3;
        } else {
            v2 = i.e;
            v3 = var1_2 + 2;
            v4 = -1;
        }
        v2[v3] = v4;
    }

    private void d(byte by) {
        by = (byte)this.bE;
        int n = this.bF;
        if (b[by][n] == 6 && (a[by][n] & 0xFF) == 6) {
            this.h(a[by][n] >> 8);
        }
        if (b[by][n] <= 0) {
            int n2;
            int n3 = b[by][n];
            int n4 = n3 & 7;
            if (n4 == 2) {
                n2 = n3 | 0x10;
            } else if (n4 == 4) {
                n2 = n3 = n3 & 0xFFFFFFEF;
            }
            if (!(a[by][n4 = n + 1] >= 0 || this.c(by, n4) && this.aW == 0)) {
                i.a[by][n - 1] = -1;
                i.a[by][n4] = 48;
                i.b[by][n4] = n3 & 0xFFFFFFF8 | 3;
                i.b[by][n] = b[by][n - 1] | 8;
                i.b[by][n4] = 18;
                n3 = n - 2;
                i.c[by - 1][n3] = 48;
                i.c[by][n3] = 48;
                i.c[by + 1][n3] = 48;
                i.l(by, n);
                this.ak();
            } else {
                if ((n3 & 7) == 3 && this.c(by, n4)) {
                    this.a(2, 48, 0);
                }
                i.b[by][n] = n3 & 0xFFFFFFF8;
            }
        } else {
            byte[] byArray = b[by];
            int n5 = n;
            byArray[n5] = (byte)(byArray[n5] - 6);
        }
        i.c[by][n] = 24;
        i.c[by][n - 1] = 24;
    }

    private static boolean d(int n, int n2) {
        byte by = a[n][n2];
        n = a[n][n2] & 0xFF;
        return by < 80 && by != 30 && by != 10 && by != 37 && by != 34 && by != 35 && n != 14 && n != 33 && n != 15 && n != 4 && n != 16;
    }

    private static boolean e(int n, int n2) {
        byte by = a[n][n2];
        n = a[n][n2] & 0xFF;
        return by == -1 && n != 14 && n != 33 && n != 5 && n != 28;
    }

    private static boolean f(int n, int n2) {
        byte by = a[n][n2];
        int n3 = a[n][n2] & 0xFF;
        return by == -1 && n3 != 14 && n3 != 33 && n3 != 4 && n3 != 32 && (n3 != 7 || (a[n][n2] >> 8 & 0xF0) != 0);
    }

    private void al() {
        boolean bl;
        int n = this.bF - 1;
        boolean bl2 = bl = e != null && e[this.bE][this.bF] != 0 && e[this.bE][this.bF - 1] == 0;
        if ((a[this.bE][n] & 0xFF) != 35 && i.d(this.bE, n) && (!this.c(this.bE - 1, this.bF) && !this.c(this.bE + 1, this.bF) || (this.k & 8) == 0) && (a[this.bE][this.bF + 1] >= 0 || bl)) {
            System.out.println("In ProcessWindPod condition throw");
            i.a[this.bE][n] = 35;
            i.b[this.bE][n] = 18;
            i.c[this.bE][n] = 24;
        }
    }

    private static int a(f f2, int n) {
        int n2 = 0;
        int n3 = f2.b[n] & 0xFF;
        for (int i2 = 0; i2 < n3; ++i2) {
            n2 += f2.c[(f2.a[n] + i2) * 5 + 1] & 0xFF;
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     */
    private void am() {
        var1_1 = this.bE;
        var2_2 = this.bF;
        i.c[var1_1][var2_2] = 24;
        switch ((i.b[var1_1][var2_2] & 56) >> 3) {
            case 0: {
                if ((this.h != var1_1 || (var2_2 + 1) * 24 <= this.b || this.k == 3) && (this.k != 3 || this.k == 0L || (long)i.aS < this.k + (long)(21 - var1_1))) break;
                var3_3 = var2_2 + 1;
                while (true) {
                    var4_5 = i.a[var1_1][var3_3];
                    if (this.i == var3_3 || var4_5 >= 80 || var4_5 == 30 || var4_5 == 34 || var4_5 == 35 || var4_5 == 0) break;
                    ++var3_3;
                }
                if (this.i != var3_3 && this.k != 3) break;
                i.b[var1_1][var2_2] = i.b[var1_1][var2_2] & -57 | 8;
                i.b[var1_1][var2_2] = 10;
                return;
            }
            case 1: {
                v0 = i.b[var1_1];
                v1 = var2_2;
                v0[v1] = (byte)(v0[v1] - 1);
                if (i.b[var1_1][var2_2] > 0) break;
                i.a[var1_1][var2_2] = 34;
                i.b[var1_1][var2_2] = i.b[var1_1][var2_2] & -64 | 24 | 3;
                i.b[var1_1][var2_2] = 0;
                return;
            }
            case 3: {
                if (i.b[var1_1][var2_2] > 0) ** GOTO lbl70
                var3_4 = this.c(var1_1, var2_2 + 1);
                var4_6 = false;
                if (var3_4 || i.a[var1_1][var2_2 + 1] >= 0 || this.l && i.e[var1_1][var2_2 + 1] != 0) {
                    if (var3_4) {
                        this.a(1, 48, 0);
                        var4_6 = true;
                    } else {
                        var4_6 = true;
                        switch (i.a[var1_1][var2_2 + 1]) {
                            case 10: {
                                i.a[var1_1][var2_2 + 1] = 32;
                                this.b(var1_1, var2_2 + 1);
                                var4_6 = false;
                                break;
                            }
                            case 19: 
                            case 43: 
                            case 45: 
                            case 46: 
                            case 49: {
                                this.k(var1_1, var2_2 + 1);
                                i.a[var1_1][var2_2 + 1] = -1;
                                break;
                            }
                            case 30: {
                                this.p(11);
                                i.b[var1_1][var2_2 + 1] = 1;
                                break;
                            }
                            case 18: {
                                this.d();
                                break;
                            }
                            case 21: {
                                var4_6 = false;
                                break;
                            }
                            default: {
                                this.p(14);
                            }
                        }
                    }
                }
                if (var4_6) {
                    i.b[var1_1][var2_2] = i.b[var1_1][var2_2] & -64 | 32;
                    i.b[var1_1][var2_2] = 0;
                    return;
                }
                i.a[var1_1][var2_2] = -1;
                i.a[var1_1][var2_2 + 1] = 44;
                i.b[var1_1][var2_2 + 1] = i.b[var1_1][var2_2];
                v2 = i.b[var1_1];
                v3 = var2_2 + 1;
                v4 = 19;
                ** GOTO lbl83
lbl70:
                // 1 sources

                v5 = i.b[var1_1];
                v6 = var2_2;
                v5[v6] = (byte)(v5[v6] - 5);
                return;
            }
            case 4: {
                if ((i.aS & 1) != 0) break;
                v7 = i.b[var1_1];
                v8 = var2_2;
                v7[v8] = (byte)(v7[v8] + 1);
                if (i.b[var1_1][var2_2] != i.a[27].a(4)) break;
                v2 = i.a[var1_1];
                v3 = var2_2;
                v4 = -1;
lbl83:
                // 2 sources

                v2[v3] = v4;
                i.l(var1_1, var2_2);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void l(int var1_1) {
        var2_2 = this.bE;
        var3_3 = this.bF;
        if (this.j > 0 || !this.c(var2_2, var3_3)) {
            return;
        }
        var4_4 = i.a[var2_2][var3_3] & 255;
        if ((var4_4 == 14 || var4_4 == 33) && i.a[var2_2][var3_3] >> 8 == 255) {
            return;
        }
        this.aI = var1_1;
        switch (var1_1) {
            case 40: {
                this.aF = 19;
                this.aG = 0;
                i.a[this.bE][this.bF] = -1;
                this.aI = 40;
                i.i[10] = 1;
                break;
            }
            case 42: {
                this.aF = 29;
                v0 = this;
                v1 = 0;
                ** GOTO lbl77
            }
            case 41: {
                this.aF = 2;
                this.aG = 0;
                this.aH = i.b[this.bE][this.bF];
                break;
            }
            case 4: {
                this.aF = 24;
                v0 = this;
                v1 = 0;
                ** GOTO lbl77
            }
            case 5: {
                this.aF = 25;
                v0 = this;
                v1 = 0;
                ** GOTO lbl77
            }
            case 2: {
                this.aF = 3;
                v0 = this;
                v1 = 0;
                ** GOTO lbl77
            }
            case 53: {
                this.aF = 32;
                v0 = this;
                v1 = 0;
                ** GOTO lbl77
            }
            case 51: {
                this.aF = 30;
                v0 = this;
                v1 = 0;
                ** GOTO lbl77
            }
            case 52: {
                this.aF = 31;
                v0 = this;
                v1 = 0;
                ** GOTO lbl77
            }
            case 6: {
                if (this.az >= 99) ** GOTO lbl63
                this.aF = 5;
                v0 = this;
                v1 = 0;
                ** GOTO lbl77
lbl63:
                // 1 sources

                i.a[var2_2][var3_3] = 7;
                i.b[var2_2][var3_3] = 0;
                this.l(7);
                break;
            }
            case 7: {
                if (this.n == i.i[8]) {
                    i.a[var2_2][var3_3] = 41;
                    i.b[var2_2][var3_3] = 10;
                    this.aY += 10;
                    this.l(41);
                    break;
                }
                this.aF = 5;
                v0 = this;
                v1 = 1;
lbl77:
                // 9 sources

                v0.aG = v1;
            }
        }
        i.a[var2_2][var3_3] = -1;
        v2.o = true;
    }

    private boolean g(int n, int n2) {
        return a[n][n2] == 28 || this.aN >= 24 && (a[n][n2 - 1] == 28 && (b[n][n2 - 1] & 8) == 0 || a[n][n2 + 1] == 28 && (b[n][n2 + 1] & 8) == 0) || this.aP >= 24 && (a[n][n2 - 1] == 28 || a[n][n2 + 1] == 28);
    }

    private int a(int n, int n2, int n3, int n4, boolean bl) {
        int n5;
        block13: {
            block16: {
                int n6;
                block15: {
                    block14: {
                        n3 = n - n3;
                        n4 = n2 - n4;
                        int n7 = n3 > 0 ? n3 : -n3;
                        int n8 = n4 > 0 ? n4 : -n4;
                        n5 = 0;
                        if (n7 > n8) {
                            int n9;
                            if (n3 > 0) {
                                n9 = 4;
                            } else if (n3 < 0) {
                                n9 = n5 = 2;
                            }
                            if (n5 != 0 && (!i.f(n - g[n5], n2) || this.g(n - g[n5], n2))) {
                                n5 = 0;
                            }
                        }
                        if (n5 != 0) break block13;
                        if (n4 <= 0) break block14;
                        n6 = 1;
                        break block15;
                    }
                    if (n4 >= 0) break block16;
                    n6 = 3;
                }
                n5 = n6;
            }
            n4 = n2 - g[n5 + 8];
            if (bl && n5 != 0 && (!i.f(n, n4) || this.l && e[n][n4] != 0 || this.g(n, n4))) {
                int n10;
                n5 = 0;
                if (n3 > 0) {
                    n10 = 4;
                } else if (n3 < 0) {
                    n10 = n5 = 2;
                }
                if (n5 != 0 && a[n - g[n5]][n2] >= 0) {
                    n5 = 0;
                }
            }
        }
        return n5;
    }

    /*
     * Unable to fully structure code
     */
    private void e(byte var1_1) {
        block25: {
            block17: {
                block19: {
                    block23: {
                        block24: {
                            block21: {
                                block22: {
                                    block20: {
                                        block18: {
                                            var2_2 = this.bE;
                                            var3_3 = this.bF;
                                            var4_4 = i.b[var2_2][var3_3];
                                            var5_5 = i.b[var2_2][var3_3];
                                            var6_6 = 0;
                                            var7_7 = 0;
                                            var8_8 = (i.a[var2_2][var3_3] & 255) == 35 ? 1 : 0;
                                            v0 = var9_9 = var1_1 == 43 && (var4_4 & 3840) != 0;
                                            if (var8_8 == 0 && i.h(var2_2, var3_3)) {
                                                i.a[var2_2][var3_3] = -1;
                                                this.k(var2_2, var3_3);
                                                return;
                                            }
                                            var10_10 = var4_4 & 7;
                                            if (var5_5 > 0) break block17;
                                            if (var8_8 == 0 || var5_5 > 6) break block18;
                                            if (var5_5 < 0) {
                                                i.b[var2_2][var3_3] = 0;
                                            }
                                            break block19;
                                        }
                                        i.l(var2_2, var3_3);
                                        if (!var9_9) break block20;
                                        var5_5 = 18;
                                        var8_8 = this.a(var2_2, var3_3, this.h, this.i, true);
                                        var4_4 = var4_4 & -8 | var8_8;
                                        var10_10 = var8_8;
                                        var6_6 = -i.g[var8_8];
                                        var7_7 = -i.g[var8_8 + 8];
                                        if (var8_8 == 0) {
                                            var5_5 = 0;
                                            var7_7 = 0;
                                            var6_6 = 0;
                                        }
                                        var4_4 -= 256;
                                        break block19;
                                    }
                                    if ((var4_4 & 0xFE0000) == 0 || (var4_4 & 248) != 0) break block21;
                                    var8_8 = (var4_4 & 0xFE0000) >> 17;
                                    var10_10 = (var4_4 & 0x7F000000) >> 24;
                                    if (var2_2 != var8_8 || var3_3 != var10_10) break block22;
                                    var10_10 = ((var4_4 &= -16646145) & -2147483648) == 0 ? 2 : 1;
                                    var4_4 = var4_4 & -8 | var10_10;
                                    break block19;
                                }
                                var5_5 = 21;
                                var8_8 = this.a(var2_2, var3_3, var8_8, var10_10, true);
                                var4_4 = var4_4 & -8 | var8_8;
                                var6_6 = -i.g[var8_8];
                                var7_7 = -i.g[var8_8 + 8];
                                var10_10 = var8_8;
                                if (var8_8 != 0) break block19;
                                var5_5 = 0;
                                break block23;
                            }
                            if (var10_10 != 0) break block24;
                            var5_5 = 21;
                            var8_8 = (var4_4 & 28672) >> 12;
                            var4_4 = var4_4 & -8 | var8_8;
                            var10_10 = var8_8;
                            var6_6 = -i.g[var10_10];
                            var7_7 = -i.g[var10_10 + 8];
                            if (!i.f(var2_2 + var6_6, var3_3 + var7_7)) {
                                var7_7 = 0;
                                var6_6 = 0;
                                var5_5 = 0;
                            }
                            break block19;
                        }
                        var5_5 = 21;
                        var6_6 = -i.g[var10_10];
                        var7_7 = -i.g[var10_10 + 8];
                        if (i.f(var2_2 + var6_6, var3_3 + var7_7)) break block19;
                        switch (var10_10) {
                            case 4: {
                                v1 = var4_4 & -28673;
                                v2 = 8192;
                                ** GOTO lbl86
                            }
                            case 2: {
                                v1 = var4_4 & -28673;
                                v2 = 16384;
                                ** GOTO lbl86
                            }
                            case 1: {
                                v1 = var4_4 & -28673;
                                v2 = 12288;
                                ** GOTO lbl86
                            }
                            case 3: {
                                v1 = var4_4 & -28673;
                                v2 = 4096;
lbl86:
                                // 4 sources

                                var4_4 = v1 | v2;
                            }
                        }
                        var4_4 &= -8;
                        var10_10 = 0;
                    }
                    var7_7 = 0;
                    var6_6 = 0;
                }
                if ((var4_4 & 248) == 0) {
                    i.a[var2_2][var3_3] = -1;
                    i.a[var2_2 + var6_6][var3_3 + var7_7] = var1_1;
                    i.c[var2_2 + var6_6][var3_3 + var7_7] = 48;
                    i.b[var2_2 + var6_6][var3_3 + var7_7] = var5_5;
                    i.b[var2_2 + var6_6][var3_3 + var7_7] = var4_4;
                } else {
                    if ((i.aS & 3) == 0) {
                        var4_4 = var4_4 & -249 | (var4_4 & 248) - 8;
                        if (var1_1 == 43 && (var4_4 & 248) == 0) {
                            var4_4 = var4_4 & -3841 | 3072;
                        }
                    }
                    v3 = i.b[var2_2];
                    v4 = var3_3;
                    v5 = 0;
                }
                break block25;
            }
            if (var5_5 < 0) {
                i.b[var2_2][var3_3] = 0;
            }
            var5_5 = (byte)(var5_5 - 3);
            v3 = i.b[var2_2];
            v4 = var3_3;
            v5 = v3[v4] = var5_5;
        }
        if ((var4_4 & 248) == 0 && (i.a[0].d < 13 || i.a[0].d > 16) && i.a(var2_2, var3_3, var10_10, (int)i.b[var2_2][var3_3], this.h, this.i, (int)((this.k & 4096) == 0 ? this.l : 0), this.j)) {
            this.a(1, 48, var10_10);
            if (var9_9) {
                var4_4 &= -3841;
            }
        }
        i.b[var2_2][var3_3] = var4_4;
    }

    private void an() {
        if ((this.k == 3 || this.k == 4 || this.k == 5) && this.aq > 0) {
            return;
        }
        if (cm >= 0) {
            int n = cm;
            m[n] = (byte)(m[n] - 1);
            if (m[cm] == 0) {
                int n2 = cm;
                this.p(8);
                int n3 = this.e - 1;
                int n4 = this.f - 1;
                for (int i2 = 1; i2 < n4; ++i2) {
                    block5: for (int i3 = 1; i3 < n3; ++i3) {
                        if ((a[i3][i2] & 0xFF) != 17 || a[i3][i2] >> 8 != n2) continue;
                        int n5 = a[i3][i2 - 1] & 0xFF;
                        switch (n5) {
                            case 7: {
                                int n6 = i2 - 1;
                                n5 = i3;
                                int n7 = a[n5][n6] >> 8;
                                if ((n7 & 0xF0) != 0) continue block5;
                                i.a[n5][n6] = (n7 |= 0x10) << 8 | 7;
                                i.c[n5][n6] = 24;
                                continue block5;
                            }
                            case 14: 
                            case 33: {
                                i.a[i3][i2 - 1] = 0 | n5;
                            }
                        }
                    }
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void m(int var1_1) {
        block6: {
            if ((i.a[this.bE][this.bF] & 255) == 14 && i.a[this.bE][this.bF] >> 8 == 255) {
                return;
            }
            if (!this.c(this.bE, this.bF) || i.a[0].d != 40 && i.a[0].d != 48) break block6;
            i.a[this.bE][this.bF] = -1;
            switch (var1_1) {
                case 24: {
                    i.i[9] = 1;
                    this.aF = 7;
                    this.aG = 0;
                    v0 = this;
                    v1 = 24;
                    ** GOTO lbl26
                }
                case 27: {
                    i.i[9] = 2;
                    this.aF = 7;
                    this.aG = 1;
                    v0 = this;
                    v1 = 27;
                    ** GOTO lbl26
                }
                case 26: {
                    i.i[9] = 8;
                    this.aF = 7;
                    this.aG = 2;
                    v0 = this;
                    v1 = 26;
lbl26:
                    // 3 sources

                    v0.aI = v1;
                }
            }
            this.a(this.aA, this.aB, this.bE, this.bF);
        }
    }

    private void ao() {
        int n;
        int n2;
        block22: {
            block26: {
                int n3;
                int n4;
                block29: {
                    int n5;
                    int n6;
                    int[] nArray;
                    int n7;
                    int[] nArray2;
                    boolean bl;
                    int n8;
                    block24: {
                        int n9;
                        block28: {
                            int n10;
                            int n11;
                            block27: {
                                int n12;
                                int n13;
                                int n14;
                                block25: {
                                    block23: {
                                        block21: {
                                            n2 = this.bE;
                                            n = this.bF;
                                            n8 = (b[n2][n] & 0xF00) >> 8;
                                            if (n8 == 0) break block21;
                                            if (n8 >= 4) {
                                                i.a[n2][n] = -1;
                                            } else if ((aS >> 1 & 1) == 0) {
                                                i.b[n2][n] = b[n2][n] + 256;
                                            }
                                            break block22;
                                        }
                                        if (e == null || e[n2][n] == 0) break block23;
                                        i.b[n2][n] = b[n2][n] & 0xFFFFF0FF | 0x100;
                                        break block22;
                                    }
                                    if (b[n2][n] > 4) break block22;
                                    n8 = b[n2][n];
                                    i.c[n2][n] = 24;
                                    bl = (n8 & 0x10) != 0;
                                    int n15 = n8 & 7;
                                    if (n15 == 0) break block24;
                                    n14 = 0;
                                    n13 = 0;
                                    n11 = 0;
                                    n10 = 0;
                                    n12 = 0;
                                    n9 = 0;
                                    switch (n15) {
                                        case 3: {
                                            n14 = bl ? 1 : -1;
                                            n12 = bl ? 2 : 4;
                                            n9 = bl ? 4 : 2;
                                            n10 = 1;
                                            break;
                                        }
                                        case 2: {
                                            n13 = bl ? -1 : 1;
                                            n12 = bl ? 1 : 3;
                                            n9 = bl ? 3 : 1;
                                            int n16 = 1;
                                            break;
                                        }
                                        case 1: {
                                            n14 = bl ? -1 : 1;
                                            n12 = bl ? 4 : 2;
                                            n9 = bl ? 2 : 4;
                                            n10 = -1;
                                            break;
                                        }
                                        case 4: {
                                            n13 = bl ? 1 : -1;
                                            n12 = bl ? 3 : 1;
                                            n9 = bl ? 1 : 3;
                                            int n16 = n11 = -1;
                                        }
                                    }
                                    if (!i.f(n2 + n11, n + n10) || !i.f(n2 + n14, n + n13) || !i.f(n2 + n14 - n11, n + n13 - n10)) break block25;
                                    if (b[n2][n] <= 0) {
                                        i.b[n2 + n11][n + n10] = n8;
                                        i.a[n2 + n11][n + n10] = 11;
                                        i.a[n2][n] = -1;
                                        i.b[n2 + n11][n + n10] = 18;
                                    }
                                    break block26;
                                }
                                if (!i.f(n2 + n14, n + n13)) break block27;
                                i.b[n2 + n14][n + n13] = n8 & 0xFFFFFFF8 | n12;
                                i.a[n2 + n14][n + n13] = 11;
                                i.a[n2][n] = -1;
                                i.b[n2 + n14][n + n13] = 18;
                                break block26;
                            }
                            if (!i.f(n2 + n11, n + n10)) break block28;
                            if (b[n2][n] <= 0) {
                                i.b[n2 + n11][n + n10] = n8;
                                i.a[n2 + n11][n + n10] = 11;
                                i.a[n2][n] = -1;
                                i.b[n2 + n11][n + n10] = 18;
                            }
                            break block26;
                        }
                        nArray2 = b[n2];
                        n7 = n;
                        n4 = n8 & 0xFFFFFFF8;
                        n3 = n9;
                        break block29;
                    }
                    if (a[n2 - 1][n] >= 0) {
                        nArray = b[n2];
                        n6 = n;
                        n5 = n8 & 0xFFFFFFF8 | (bl ? 1 : 3);
                    } else if (a[n2][n + 1] >= 0) {
                        nArray = b[n2];
                        n6 = n;
                        n5 = nArray[n6] = n8 & 0xFFFFFFF8 | (bl ? 2 : 4);
                    }
                    if (a[n2 + 1][n] >= 0) {
                        i.b[n2][n] = n8 & 0xFFFFFFF8 | (bl ? 3 : 1);
                    }
                    if (a[n2][n + 1] < 0) break block26;
                    nArray2 = b[n2];
                    n7 = n;
                    n4 = n8 & 0xFFFFFFF8;
                    n3 = bl ? 4 : 2;
                }
                nArray2[n7] = n4 | n3;
            }
            i.l(n2, n);
        }
        if (this.c(n2, n)) {
            this.a(1, 64, 0);
        }
        if (b[n2][n] > 0) {
            byte[] byArray = b[n2];
            int n17 = n;
            byArray[n17] = (byte)(byArray[n17] - 5);
        }
    }

    private void ap() {
        int n;
        int n2;
        int n3;
        block14: {
            int n4;
            byte[] byArray;
            block10: {
                boolean bl;
                int n5;
                int n6;
                int n7;
                block13: {
                    block11: {
                        int n8;
                        block12: {
                            n3 = this.bE;
                            n2 = this.bF;
                            i.c[n3][n2] = 24;
                            if (b[n3][n2] != 0) break block10;
                            n7 = b[n3][n2];
                            n6 = (n7 & 1) == 0 ? -1 : 1;
                            n5 = a[n3 + n6][n2];
                            n8 = a[n3 + n6][n2] & 0xFF;
                            bl = false;
                            int n9 = n7 >> 1;
                            if (n9 <= 0) break block11;
                            if (n5 >= 0 || n8 == 14 || n8 == 33) break block12;
                            i.b[n3 + n6][n2] = n9 - 1 << 1 | n7 & 1;
                            i.c[n3 + n6][n2] = 30;
                            i.b[n3 + n6][n2] = 18;
                            n5 = 32;
                            break block13;
                        }
                        if (n5 == 32) break block13;
                        n7 = b[n3 + n6][n2];
                        n8 = 0;
                        if (n5 == 48 && (n7 & 8) != 0) break block13;
                        switch (n5) {
                            case 1: 
                            case 2: 
                            case 4: 
                            case 5: 
                            case 6: 
                            case 7: {
                                n8 = -n6;
                            }
                            case 0: 
                            case 8: 
                            case 9: 
                            case 11: 
                            case 14: 
                            case 19: 
                            case 43: 
                            case 47: 
                            case 48: 
                            case 49: {
                                this.p(12);
                                this.o = 0;
                                this.bi = this.h - (n3 + n6) + n8;
                                this.bg = n3 + n6;
                                this.bh = n2;
                                if (this.bf == -1) {
                                    switch (n5) {
                                        case 0: 
                                        case 8: 
                                        case 9: 
                                        case 47: {
                                            n7 = n7 & 0xFFFF8FFF & 0xFFFFFDFF;
                                        }
                                    }
                                    this.bf = n7;
                                }
                                this.be = this.bi < 0 ? n7 & 0xFFFFFFF8 | 4 : n7 & 0xFFFFFFF8 | 2;
                                break block13;
                            }
                            default: {
                                if (n5 == -1) break block13;
                            }
                        }
                    }
                    bl = true;
                }
                if (bl) {
                    for (n7 = 1; n7 <= 3; ++n7) {
                        if (a[this.h + n6 * n7][this.i] != 32) continue;
                        i.a[this.h + n6 * n7][this.i] = -1;
                    }
                }
                byArray = a[n3 + n6];
                n4 = n2;
                n = n5;
                break block14;
            }
            byte[] byArray2 = b[n3];
            int n10 = n2;
            n4 = n10;
            byArray = byArray2;
            n = byArray2[n10] - 6;
        }
        byArray[n4] = n;
        i.l(n3, n2);
    }

    private void k(int n, int n2) {
        i.a[n][n2] = a[n][n2] & 0xFFFFFFF | 0x10000000;
        this.an();
    }

    private void n(int n) {
        int n2 = this.bE;
        int n3 = this.bF;
        int n4 = a[n2][n3] >> 8;
        i.a[n2][n3] = n4 << 8 | n;
        if (b[n2][n3] <= 0) {
            if (n4 == 0) {
                if (this.c(n2, n3) && this.j <= 0) {
                    int n5;
                    i i2;
                    this.k &= 0xFFFFF7FF;
                    i.a[n2][n3] = 0x100 | n;
                    if (Math.abs(this.i - System.currentTimeMillis()) >= 5000L) {
                        i2 = this;
                        n5 = 40;
                    } else {
                        i2 = this;
                        n5 = 48;
                    }
                    i2.g(n5);
                    this.p(3);
                    return;
                }
            } else if ((aS >> 1 & 1) == 0 && a[n == 14 ? 8 : 22] != null && n4 < a[n == 14 ? 8 : 22].a(0) - 1) {
                i.a[n2][n3] = n4 + 1 << 8 | n;
                i.c[n2][n3] = 24;
            }
        }
    }

    private static boolean h(int n, int n2) {
        int n3 = n2 - 1;
        int n4 = n - 1;
        int n5 = n + 1;
        return b[n][n3] <= 6 && (i.i(n, n3) && ((b[n][n3] & 7) == 3 || a[n][n2] != 16 && a[n][n3] != 1) || a[n][n3] == 46 || a[n][n3] == 14 || a[n][n3] == 48) || b[n5][n2] <= 0 && a[n5][n2] == 14 && (b[n5][n2] & 8) != 0 && (b[n5][n2] & 7) != 3 || b[n4][n2] <= 0 && a[n4][n2] == 14 && (b[n4][n2] & 8) == 0 && (b[n4][n2] & 7) != 3;
    }

    private static boolean i(int n, int n2) {
        if (a[n][n2] >= 0) {
            switch (a[n][n2]) {
                case 0: 
                case 1: 
                case 8: 
                case 9: {
                    return true;
                }
            }
        }
        return false;
    }

    private static void l(int n, int n2) {
        int n3 = n - 1;
        int n4 = n + 1;
        int n5 = n2 - 1;
        int n6 = n2 + 1;
        i.c[n3][n5] = 48;
        i.c[n][n5] = 48;
        i.c[n4][n5] = 48;
        i.c[n3][n2] = 48;
        i.c[n][n2] = 48;
        i.c[n4][n2] = 48;
        i.c[n3][n6] = 48;
        i.c[n][n6] = 48;
        i.c[n4][n6] = 48;
    }

    private void aq() {
        int n;
        this.j = i[10];
        this.ch = this.cf;
        this.cg = this.ce;
        this.af = this.aa;
        this.bZ = this.aC;
        this.bX = this.aZ;
        this.bY = this.bb;
        this.bS = this.h;
        this.bT = this.i;
        this.bU = this.aU;
        this.bV = this.aV;
        this.bW = this.ay;
        this.aj = this.ai;
        this.ca = this.am;
        this.cb = this.al;
        cn = cm;
        if (m != null) {
            System.arraycopy(m, 0, o, 0, m.length);
        }
        for (n = 0; n < this.e; ++n) {
            System.arraycopy(b[n], 0, c[n], 0, this.f);
            System.arraycopy(b[n], 0, d[n], 0, this.f);
            System.arraycopy(a[n], 0, e[n], 0, this.f);
            System.arraycopy(a[n], 0, d[n], 0, this.f);
        }
        if (this.l) {
            if (f == null) {
                f = new int[this.e][this.f];
            }
            for (n = 0; n < this.e; ++n) {
                System.arraycopy(e[n], 0, f[n], 0, this.f);
            }
            if (c == null) {
                c = new long[15];
            }
            System.arraycopy(a, 0, c, 0, a.length);
            if (d == null) {
                d = new long[15];
            }
            System.arraycopy(b, 0, d, 0, b.length);
            this.y = this.x;
            this.dA = this.dq;
            this.dB = this.dr;
            this.dC = this.ds;
            this.z = this.v;
            this.dD = this.dv;
            this.dE = this.dw;
            this.dF = this.dx;
            this.A = this.w;
            this.dG = this.dy;
            this.dH = this.dz;
            am = this.al;
            this.dI = this.dt;
            this.dJ = this.du;
        }
    }

    private void ar() {
        int n;
        int n2;
        int n3;
        block22: {
            block21: {
                int n4;
                int[] nArray;
                block20: {
                    cE = -1;
                    this.aH = -1;
                    this.aG = -1;
                    this.aF = -1;
                    this.bg = 0;
                    this.bh = 0;
                    this.E = true;
                    this.ci = this.bS * 24 - 160;
                    this.cj = this.bT * 24 - 120 + 31;
                    this.bl = 0;
                    if (!this.q) break block20;
                    this.bm = 15;
                    this.q = false;
                    i.d[37][7] = -1;
                    nArray = d[39];
                    n4 = 5;
                    break block21;
                }
                if (!this.r) break block22;
                this.bm = 17;
                this.r = false;
                i.d[46][7] = -1;
                nArray = d[50];
                n4 = 7;
            }
            nArray[n4] = -1;
        }
        this.t = false;
        this.ax = 70;
        i.i[10] = this.j;
        this.aa = this.af;
        this.cf = this.ch;
        this.ce = this.cg;
        this.aC = this.bZ;
        this.bb = this.bY;
        this.aZ = this.bX;
        a[0].a(2);
        this.k = 2;
        this.bj = 0;
        this.h = this.bS;
        this.i = this.bT;
        this.aU = this.bU;
        this.aV = this.bV;
        this.ai = this.aj;
        switch (this.k) {
            case 5: {
                this.y();
                break;
            }
            case 3: {
                this.aq = 5;
                break;
            }
            case 4: {
                this.ao = 0;
                this.ar = 0;
                this.aq = 3;
                this.k = false;
                break;
            }
            case 1: {
                this.al = this.cb;
                this.am = this.ca;
            }
        }
        cm = cn;
        if (m != null) {
            System.arraycopy(o, 0, m, 0, m.length);
        }
        for (n3 = 0; n3 < this.e; ++n3) {
            System.arraycopy(c[n3], 0, b[n3], 0, this.f);
            System.arraycopy(d[n3], 0, b[n3], 0, this.f);
            System.arraycopy(e[n3], 0, a[n3], 0, this.f);
            System.arraycopy(d[n3], 0, a[n3], 0, this.f);
        }
        n3 = this.f - 1;
        for (n2 = 1; n2 < n3; ++n2) {
            n = this.e - 1;
            for (int i2 = 1; i2 < n; ++i2) {
                byte by = a[i2][n2];
                int n5 = a[i2][n2] & 0xFF;
                if ((by <= -1 || by >= 80) && (n5 <= -1 || n5 >= 80)) continue;
                i.l(i2, n2);
            }
        }
        if (a[2] != null) {
            a[2].a(0);
            i.a[18][63] = -1;
        }
        this.ay = this.bW;
        i i3 = this;
        this.o = true;
        if (this.l) {
            i3 = this;
            this.al = am;
            i3.dt = i3.dI;
            i3.du = i3.dJ;
            for (n2 = 0; n2 < i3.e; ++n2) {
                System.arraycopy(f[n2], 0, e[n2], 0, i3.f);
            }
            System.arraycopy(c, 0, a, 0, a.length);
            System.arraycopy(d, 0, b, 0, b.length);
            i3.x = i3.y;
            i3.dq = i3.dA;
            i3.dr = i3.dB;
            i3.ds = i3.dC;
            i3.v = i3.z;
            i3.dv = i3.dD;
            i3.dw = i3.dE;
            i3.dx = i3.dF;
            i3.w = i3.A;
            i3.dy = i3.dG;
            i3.dz = i3.dH;
        }
        if (e != null) {
            for (n2 = 0; n2 < this.f; ++n2) {
                for (n = 0; n < this.e; ++n) {
                    if (a[n][n2] != 48) continue;
                    this.bE = n;
                    this.bF = n2;
                    if ((b[n][n2] & 8) == 0) {
                        this.d((byte)48);
                        continue;
                    }
                    this.ak();
                }
            }
        }
    }

    public static void a(short s, short s2, byte by, int n) {
        i.a[s][s2] = by;
        i.b[s][s2] = n;
    }

    private static boolean b(int n, int n2, int n3, int n4) {
        return Math.abs(n - n3) < 24 && Math.abs(n2 - n4) < 24;
    }

    private static boolean a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        dn = 0;
        dm = 0;
        dp = 100;
        do = 100;
        if (Math.abs(n - n5) > 1 || Math.abs(n2 - n6) > 1) {
            return false;
        }
        dm = n * 24 + g[n3] * n4;
        dn = n2 * 24 + g[n3 + 8] * n4;
        do = n5 * 24 + g[n7] * n8;
        dp = n6 * 24 + g[n7 + 8] * n8;
        return i.b(dm, dn, do, dp);
    }

    /*
     * Unable to fully structure code
     */
    private void as() {
        block61: {
            block68: {
                block69: {
                    block59: {
                        block63: {
                            block67: {
                                block66: {
                                    block65: {
                                        block64: {
                                            block62: {
                                                block60: {
                                                    var1_2 = this.bE;
                                                    var2_3 = this.bF;
                                                    var3_4 = i.b[var1_2][var2_3];
                                                    var4_5 = i.b[var1_2][var2_3];
                                                    var5_6 = i.a[var1_2][var2_3];
                                                    var9_9 = i.e != null && i.e[var1_2][var2_3] != 0;
                                                    var10_10 = var4_5 & 7;
                                                    if (var9_9 && i.e[var1_2][var2_3] != 3) {
                                                        var6_11 = -1;
                                                        var7_12 = 1;
                                                        v0 = var2_3 - 1;
                                                    } else {
                                                        var6_11 = 1;
                                                        var7_12 = 3;
                                                        v0 = var2_3 + 1;
                                                    }
                                                    var8_13 = v0;
                                                    var11_14 = (this.k & 4096) == 0 ? this.l : 0;
                                                    var11_14 = (byte)i.a(var1_2, var2_3, var10_10, var3_4, this.h, this.i, (int)var11_14, this.j);
                                                    if (var5_6 == 1 && var11_14 != 0) {
                                                        this.c(var1_2, var2_3, 3);
                                                        ++this.aZ;
                                                        i.a[var1_2][var2_3] = -1;
                                                        --this.aa;
                                                        this.bi = 0;
                                                        if (this.aa == 0) {
                                                            i.a[this.ab][this.ac] = -1;
                                                        }
                                                        if (i.a[var1_2][var2_3 - 1] == -1) {
                                                            this.b(var1_2, var2_3 - 1);
                                                        }
                                                        this.b(var1_2, var2_3);
                                                        var5_7 = this;
                                                        this.o = true;
                                                        return;
                                                    }
                                                    v1 = var11_14 = (i.a[var1_2][var2_3] & 255) == 35 ? 1 : 0;
                                                    if (i.a[var1_2][var8_13] == 9 && var3_4 <= 0) {
                                                        var12_15 = (byte)i.a[var1_2][var8_13];
                                                        var13_16 = (i.b[var1_2][var8_13] & 0xFC00000) >> 22;
                                                        if (var13_16 != 34) {
                                                            if (var13_16 == 33) {
                                                                if (var12_15 == -1) {
                                                                    i.a[var1_2][var8_13] = 32;
                                                                }
                                                                this.h = var1_2;
                                                                this.i = var8_13;
                                                                i.a[var1_2][var8_13] = -1;
                                                                this.j = 0;
                                                                this.aT = 0;
                                                                this.a(2, 48, 0);
                                                            } else if (i.a[var1_2][var8_13] == 19 || i.a[var1_2][var8_13] == 43 || i.a[var1_2][var8_13] == 45 || i.a[var1_2][var8_13] == 46 || i.a[var1_2][var8_13] == 49 || i.a[var1_2][var8_13] == 11) {
                                                                i.a[var1_2][var8_13] = -1;
                                                                this.k(var1_2, var8_13);
                                                            }
                                                        }
                                                    }
                                                    if (var3_4 > 0 || var11_14 != 0) break block59;
                                                    if (var10_10 != var7_12 || !this.c(var1_2, var8_13) || !i.e(var1_2, var8_13)) break block60;
                                                    if ((var5_6 == 0 || var5_6 == 9) && var6_11 > 0) {
                                                        this.a(2, 48, 0);
                                                    } else if (var5_6 == 1) {
                                                        i.b[var1_2][var8_13] = var4_5 & -8 | 3;
                                                        i.b[var1_2][var8_13] = 18;
                                                        i.a[var1_2][var8_13] = 1;
                                                        i.a[var1_2][var2_3] = -1;
                                                        this.b(var1_2, var2_3);
                                                    } else if (var5_6 == 8) {
                                                        var4_5 &= -4063233;
                                                    }
                                                    i.b[var1_2][var2_3] = var4_5 & -8;
                                                    break block61;
                                                }
                                                if (!i.e(var1_2, var8_13) && i.a[var1_2][var8_13] != 21 || this.c(var1_2, var2_3) && this.aT <= 0 || (this.c(var1_2, var8_13) || i.b(i.dm, i.dn, i.do, i.dp - 1)) && this.aT <= 0 && this.aW == 0 && (var5_6 == 0 || var10_10 != var7_12)) break block62;
                                                if (var6_11 > 0 || i.e != null && i.e[var1_2][var8_13] != 0) {
                                                    var4_5 = var4_5 + 131072 & -8 | var7_12;
                                                    i.b[var1_2][var8_13] = var4_5 | -2147483648;
                                                    i.b[var1_2][var8_13] = 18;
                                                    i.a[var1_2][var8_13] = var5_6;
                                                    i.a[var1_2][var2_3] = -1;
                                                    i.l(var1_2, var2_3);
                                                    i.c[var1_2][var2_3 + var6_11 * 2] = 24;
                                                    this.b(var1_2, var2_3);
                                                } else {
                                                    i.b[var1_2][var2_3] = var4_5 &= -4063240;
                                                    i.b[var1_2][var8_13] = 0;
                                                }
                                                break block61;
                                            }
                                            if (!i.i(var1_2, var8_13)) break block63;
                                            if (var6_11 >= 0 || i.e != null && i.e[var1_2][var8_13] != 0 || i.a[var1_2][var2_3 + 1] >= 0) break block64;
                                            i.b[var1_2][var2_3 + 1] = var4_5 & -8 | 3;
                                            i.b[var1_2][var2_3 + 1] = i.b[var1_2][var2_3 + 1] | -2147483648;
                                            i.a[var1_2][var2_3 + 1] = var5_6;
                                            i.b[var1_2][var2_3 + 1] = 18;
                                            i.a[var1_2][var2_3] = -1;
                                            break block61;
                                        }
                                        if (i.b[var1_2][var8_13] > 0) break block61;
                                        if ((var4_5 & 0x3E0000) >> 17 >= 2) {
                                            if (var5_6 == 8) {
                                                i.a[var1_2][var2_3] = 54;
                                                i.b[var1_2][var2_3] = 0;
                                                i.l(var1_2, var2_3);
                                                return;
                                            }
                                            if (i.a[var1_2][var8_13] == 8) {
                                                i.a[var1_2][var8_13] = 54;
                                                i.b[var1_2][var8_13] = 0;
                                                i.l(var1_2, var8_13);
                                                return;
                                            }
                                        }
                                        var4_5 &= -4063233;
                                        if (!i.e(var1_2 - 1, var2_3) || !i.e(var1_2 - 1, var8_13) || this.c(var1_2 - 1, var2_3)) break block65;
                                        i.b[var1_2][var2_3] = (byte)(((var4_5 & 28672) >> 12) + 1);
                                        i.c[var1_2][var2_3] = 24;
                                        v2 = (var4_5 & -8 | 4) & -3073;
                                        v3 = 2048;
                                        break block66;
                                    }
                                    if (!i.e(var1_2 + 1, var2_3) || !i.e(var1_2 + 1, var8_13) || this.c(var1_2 + 1, var2_3)) break block67;
                                    i.b[var1_2][var2_3] = (byte)(((var4_5 & 28672) >> 12) + 1);
                                    i.c[var1_2][var2_3] = 24;
                                    v2 = (var4_5 & -8 | 2) & -3073;
                                    v3 = 1024;
                                }
                                var4_5 = v2 | v3 | 512;
                            }
                            i.b[var1_2][var2_3] = var4_5;
                            break block61;
                        }
                        if (var5_6 == 8) {
                            if ((var4_5 & 0x3E0000) >> 17 >= 2) {
                                i.a[var1_2][var2_3] = 54;
                                i.b[var1_2][var2_3] = 0;
                                i.l(var1_2, var2_3);
                                return;
                            }
                            var4_5 &= -4063233;
                        } else {
                            i.b[var1_2][var2_3] = var4_5 = var4_5 & -3073 & -4063233 & -8;
                        }
                        break block61;
                    }
                    if (var11_14 != 0) break block61;
                    if ((var4_5 & 512) != 0) break block68;
                    if (var10_10 != 3 || (i.a[var1_2][var2_3] & 255) != 6 || var3_4 > 12) {
                        var3_4 = (byte)(var3_4 - 6);
                    } else {
                        var3_4 = (byte)(var3_4 - (i.aS & 1));
                        i.c[var1_2][var2_3] = 24;
                    }
                    if (var3_4 != 0 && var3_4 != 12) break block69;
                    switch (var4_5 & 3072) {
                        case 2048: {
                            v4 = var4_5 & -57;
                            v5 = var4_5 - 8;
                            ** GOTO lbl150
                        }
                        case 1024: {
                            v4 = var4_5 & -57;
                            v5 = var4_5 + 8;
lbl150:
                            // 2 sources

                            var4_5 = v4 | v5 & 56;
                        }
                    }
                    if (var3_4 == 0) {
                        if ((i.a[var1_2][var2_3] & 255) == 6) {
                            var4_5 &= -449;
                        }
                        if (var10_10 == var7_12) {
                            if (!(var5_6 != 0 && var5_6 != 9 || var6_11 <= 0 || i.e(var1_2, var2_3 + 1))) {
                                i.j(200);
                                this.p(14);
                                this.bj = 10;
                                if (var5_6 == 9 && this.aT > 0 && this.c(var1_2, var2_3)) {
                                    this.a(1, 0, 0);
                                    var5_8 = this;
                                    this.o = true;
                                }
                                if (!i.i(var1_2, var2_3 + 1)) {
                                    var4_5 = var4_5 & -449 | 64;
                                }
                            }
                            i.c[var1_2][var2_3] = 30;
                            if (!this.c(var1_2, var8_13)) {
                                var4_5 &= -8;
                            }
                        }
                    }
                }
                i.b[var1_2][var2_3] = var3_4;
                i.b[var1_2][var2_3] = var4_5;
                break block61;
            }
            var12_15 = 0;
            var13_16 = 0;
            if (var10_10 == 4) {
                v6 = -1;
            } else if (var10_10 == 2) {
                v6 = var12_15 = 1;
            }
            if (i.e(var1_2, var8_13) && !this.c(var1_2, var8_13)) {
                v7 = (byte)(var3_4 - 6);
                var3_4 = v7;
                if (v7 <= 0) {
                    var3_4 = 0;
                    var4_5 = var4_5 & -513 & -8;
                }
                i.b[var1_2][var2_3] = var3_4;
                i.b[var1_2][var2_3] = var4_5;
                i.c[var1_2][var2_3] = 24;
            } else if (i.e(var1_2 + var12_15, var2_3) && !this.c(var1_2 + var12_15, var2_3) && i.e(var1_2 + var12_15, var8_13) && !this.c(var1_2 + var12_15, var8_13) && (i.b[var1_2][var8_13] & 512) == 0) {
                if (var3_4 >= 6 || (i.aS & 3) == 0) {
                    var3_4 = (byte)(var3_4 + 1);
                }
                if (var3_4 >= 12) {
                    var4_5 &= -513;
                    if (var12_15 != 0) {
                        var3_4 = 6;
                        i.a[var1_2][var2_3] = -1;
                        if (i.e(var1_2 + var12_15, var8_13)) {
                            var3_4 = 12;
                            var4_5 = var4_5 & -8 | var7_12;
                            var13_16 = var6_11;
                        }
                    } else {
                        var4_5 &= -8;
                        var3_4 = 0;
                    }
                    i.b[var1_2 + var12_15][var2_3 + var13_16] = var4_5 | -2147483648;
                    i.b[var1_2 + var12_15][var2_3 + var13_16] = var3_4;
                    i.a[var1_2 + var12_15][var2_3 + var13_16] = var5_6;
                    i.l(var1_2, var2_3);
                    i.c[var1_2][var2_3 + var6_11 * 2] = 24;
                } else {
                    i.b[var1_2][var2_3] = var3_4;
                    i.b[var1_2][var2_3] = var4_5;
                    i.c[var1_2][var2_3] = 24;
                }
            } else {
                v8 = (byte)(var3_4 - 6);
                var3_4 = v8;
                if (v8 <= 0) {
                    var3_4 = 0;
                    var4_5 = var4_5 & -513 & -8;
                }
                i.b[var1_2][var2_3] = var3_4;
                i.b[var1_2][var2_3] = var4_5;
                i.c[var1_2][var2_3] = 24;
                this.c(var1_2, var2_3);
            }
        }
        var12_15 = var4_5 & 0x20000000;
        var13_16 = i.b[var1_2][var2_3];
        var3_4 = var4_5 & 0x40000000;
        if (var12_15 == 0 && var13_16 != 0 || var3_4 == 0 && var9_9) {
            this.b(var1_2, var2_3);
        }
        if (var12_15 != 0 && var13_16 == 0 || var3_4 != 0 && !var9_9) {
            this.c(var1_2, var2_3);
        }
        var0_1 = (var4_5 & 512) != 0 ? 1 : (var13_16 != 0 || var12_15 != 0 ? 2 : (var9_9 != false ? 3 : (i.a[var1_2][var2_3] > -1 && i.a[var1_2][var2_3] < 38 ? 4 : ((i.e(var1_2 - 1, var2_3) != false || i.e(var1_2 + 1, var2_3) != false) && i.i(var1_2, var2_3 + 1) != false && (i.b[var1_2][var2_3 + 1] & 7) == 0 && var1_2 != this.bg && var2_3 != this.bh ? 6 : 0))));
        i.b[var1_2][var2_3] = var4_5 = ((var4_5 & -536870913 | (var13_16 != 0 ? 0x20000000 : 0)) & -1073741825 | (var9_9 != false ? 0x40000000 : 0)) & 0x7FFFFFFF | (var0_1 != 0 ? -2147483648 : 0);
        var0_1 = ((i.b[var1_2][var2_3] & 448) >> 6) - 1;
        if (var0_1 >= 0 && var0_1 < 5) {
            i.b[var1_2][var2_3] = i.b[var1_2][var2_3] & -449 | i.b[var1_2][var2_3] + 64 & 448;
        }
    }

    private static f a(String object, int n, int n2, int n3) {
        f f2 = null;
        try {
            f2 = new f();
            object = i.a((String)object, n);
            f2.a((byte[])object, 0);
            for (int i2 = n2; i2 <= n3; ++i2) {
                f2.a(i2, 0, -1, -1);
            }
            f2.a = n2;
            f2.d = null;
            System.gc();
        }
        catch (Exception exception) {}
        return f2;
    }

    private static f a(String string, int n) {
        boolean bl = false;
        String string2 = string;
        return i.a(string2, n, 0, 0);
    }

    private static f a(String string, int n, int n2) {
        return i.a(string, n, 0, 0);
    }

    private static Image[] a(String object, int n, int n2) {
        f f2 = null;
        try {
            f2 = new f();
            object = i.a((String)object, n);
            f2.a((byte[])object, 0);
            f2.a(n2, 0, -1, -1);
            i.a(f2, false);
            System.gc();
        }
        catch (Exception exception) {}
        return f2.a[n2];
    }

    private static Image a(String object, int n) {
        Image image = null;
        try {
            byte[] byArray = i.a((String)object, n);
            object = byArray;
            image = Image.createImage(byArray, 0, ((Object)object).length);
            System.gc();
        }
        catch (Exception exception) {}
        return image;
    }

    public static byte[] a(String object, int n) {
        byte[] byArray = null;
        object = object.getClass().getResourceAsStream((String)object);
        try {
            byArray = new byte[((InputStream)object).read() << 3];
            ((InputStream)object).read(byArray);
            int n2 = i.b(byArray, n << 3);
            n = i.b(byArray, (n << 3) + 4);
            ((InputStream)object).skip(n2);
            byArray = new byte[n];
            ((InputStream)object).read(byArray);
            ((InputStream)object).close();
        }
        catch (Exception exception) {}
        return byArray;
    }

    private static int a(h h2, String string, int n) {
        if (n != -1 && (n = string.indexOf(10)) != -1) {
            string = string.substring(0, n);
        }
        if ((n = string.indexOf(125)) != -1) {
            string = string.substring(0, n);
        }
        h2.a(string);
        return h.a;
    }

    private static int a(InputStream inputStream) {
        return inputStream.read() & 0xFF | (inputStream.read() & 0xFF) << 8;
    }

    private static int g(int n) {
        if (n < 0) {
            n = Math.abs(n);
        }
        switch (n) {
            case 1: {
                return 1;
            }
            case 2: {
                return 2;
            }
            case 3: {
                return 4;
            }
            case 4: {
                return 8;
            }
            case 5: {
                return 16;
            }
            case 6: {
                return 32;
            }
            case 7: {
                return 64;
            }
            case 23: {
                return 128;
            }
            case 42: 
            case 117: {
                return 256;
            }
            case 35: 
            case 106: {
                return 512;
            }
            case 48: 
            case 109: {
                return 1024;
            }
            case 49: 
            case 114: 
            case 19968: {
                return 2048;
            }
            case 50: 
            case 116: 
            case 20008: {
                return 4096;
            }
            case 51: 
            case 121: 
            case 20031: {
                return 8192;
            }
            case 52: 
            case 102: 
            case 20022: {
                return 16384;
            }
            case 53: 
            case 103: 
            case 20059: {
                return 32768;
            }
            case 54: 
            case 104: {
                return 65536;
            }
            case 55: 
            case 118: {
                return 131072;
            }
            case 56: 
            case 98: {
                return 262144;
            }
            case 57: 
            case 110: {
                return 524288;
            }
        }
        return 0;
    }

    private void at() {
        if (this.l) {
            a = new long[15];
            c = new long[15];
            b = new long[15];
            d = new long[15];
            this.x = (byte)3;
            this.al = true;
            this.dq = -1;
            this.dr = 0;
            this.ds = 0;
            this.v = 0;
            this.dv = 0;
            this.dw = 0;
            this.dx = 0;
            this.w = 0;
            this.dy = 0;
            this.dz = -1;
            this.dt = 0;
            this.du = 0;
        }
    }

    private byte a(byte by, byte by2, byte by3, byte by4) {
        byte by5;
        byte by6 = by5 = 0;
        while (by6 < 15 && i.a(by5, (byte)0, (byte)4) != 0) {
            by6 = (byte)(by5 + 1);
        }
        if (by5 < 15) {
            i.a(by5, (byte)1, (byte)0, (byte)4);
            i.a(by5, by4, (byte)4, (byte)2);
            i.a(by5, by, (byte)6, (byte)7);
            i.a(by5, by, (byte)27, (byte)7);
            i.a(by5, by2, (byte)13, (byte)7);
            i.a(by5, by3, (byte)20, (byte)7);
            return by5;
        }
        return -1;
    }

    private static int a(int n, byte by, byte by2, byte by3) {
        return n >>> by * 9 + by2 & ~(-1 << by3);
    }

    private static void a(int n, int n2, byte by, byte by2, byte by3, byte by4) {
        int n3 = e[n][n2];
        by4 = (byte)i.a(n3, by, by3, by4);
        by = (byte)(by * 9 + by3);
        by4 = (byte)(by4 << by);
        n3 ^= by4;
        by = (byte)(by2 << by);
        i.e[n][n2] = n3 |= by;
        i.c[n][n2] = 24;
        i.c[n][n2 + 1] = 24;
    }

    private static int a(int n, byte by, byte by2) {
        return (int)(a[n - 1] >>> by & (-1L << by2 ^ 0xFFFFFFFFFFFFFFFFL));
    }

    private static void a(int n, byte by, byte by2, byte by3) {
        long l = i.a(n, by2, by3);
        long l2 = a[--n];
        l2 ^= (l <<= by2);
        long l3 = (long)by << by2;
        i.a[n] = l2 |= l3;
    }

    private static int a(byte by, byte by2, byte by3) {
        return (int)(b[by] >>> by2 & (-1L << by3 ^ 0xFFFFFFFFFFFFFFFFL));
    }

    private static void a(byte by, byte by2, byte by3, byte by4) {
        long l = i.a(by, by3, by4);
        long l2 = b[by];
        l2 ^= (l <<= by3);
        by2 = (byte)(by2 << by3);
        i.b[by] = l2 |= (long)by2;
    }

    private static byte b(int n, int n2) {
        byte by;
        byte by2 = by = 0;
        while (by2 < 15) {
            if (n == i.a(by, (byte)13, (byte)7) && n2 == i.a(by, (byte)20, (byte)7)) {
                return by;
            }
            by2 = (byte)(by + 1);
        }
        return -1;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void au() {
        block109: {
            if (!this.l) {
                return;
            }
            if (this.dq < 0 || this.dz < 0) break block109;
            ++this.dq;
            var2_1 = this;
            var4_4 = i.a((int)var2_1.w, (byte)20, (byte)6);
            switch (i.a((int)var2_1.w, (byte)47, (byte)2)) {
                case 1: {
                    if (var4_4 == var2_1.dy) {
                        var2_1.dq = -1;
                        var2_1.dz = -1;
                        i.f(var2_1.w);
                        var2_1.x = (byte)4;
                        break;
                    }
                    var6_5 = (byte)i.a((int)var2_1.w, (byte)49, (byte)5);
                    if (var2_1.dq == 0 || var2_1.dq % var6_5 != 0) break;
                    var2_1.dq = 0;
                    var7_6 = (byte)i.a((int)var2_1.w, (byte)26, (byte)2);
                    if (var7_6 < 0) break;
                    var8_7 = 0;
                    v0 = var8_7;
                    while (v0 < var6_5) {
                        i.c(var3_3 - var8_7, var4_4, var7_6);
                        var10_9 = var4_4;
                        v1 = (byte)(var7_6 + 1);
                        var9_8 = v1;
                        if (v1 > 2) {
                            var9_8 = 0;
                            ++var10_9;
                        }
                        var11_10 = i.a(i.e[var3_3 - var8_7][var10_9], var9_8, (byte)3, (byte)4);
                        if (var10_9 != var2_1.dy || var7_6 != 2 ? var11_10 != 12 && var11_10 != 9 : var11_10 != 0 && var11_10 != 3) {
                            i.a(var3_3 - var8_7, (int)var10_9, var9_8, (byte)7, (byte)3, (byte)4);
                        }
                        v0 = (byte)(var8_7 + 1);
                    }
                    if (var7_6 == 2) {
                        i.a((int)var2_1.w, (byte)0, (byte)47, (byte)2);
                        i.a((int)var2_1.w, (byte)0, (byte)26, (byte)2);
                        v2 = var2_1.w;
                        v3 = ++var4_4;
                        v4 = 20;
                        v5 = 6;
                    } else {
                        v2 = var2_1.w;
                        v3 = (byte)(var7_6 + 1);
                        v4 = 26;
                        v5 = 2;
                    }
                    ** GOTO lbl87
                }
                case 0: {
                    i.a((int)var2_1.w, (byte)1, (byte)47, (byte)2);
                    var6_5 = (byte)i.a((int)var2_1.w, (byte)49, (byte)5);
                    var7_6 = (byte)i.a((int)var2_1.w, (byte)45, (byte)2);
                    var8_7 = 0;
                    if (var7_6 != 0) {
                        if (var7_6 == 2) {
                            for (var3_3 = i.a((int)var2_1.w, 14, 6); var3_3 >= var2_1.dv && (byte)(i.a[var3_3 + 1][var4_4] - 80) < 0 && i.a[var3_3 + 1][var4_4] != 10 && i.a[var3_3 + 1][var4_4] != 37 && i.a[var3_3 + 1][var4_4] != 34 && i.a[var3_3 + 1][var4_4] != 35; ++var3_3) {
                            }
                        } else {
                            while (var3_3 <= var2_1.dv && (byte)(i.a[var3_3 + 1][var4_4] - 80) < 0 && i.a[var3_3 + 1][var4_4] != 10 && i.a[var3_3 + 1][var4_4] != 37 && i.a[var3_3 + 1][var4_4] != 34 && i.a[var3_3 + 1][var4_4] != 35) {
                                ++var3_3;
                            }
                        }
                    } else if ((byte)(i.a[var3_3 + 1][var4_4] - 80) < 0 && i.a[var3_3 + 1][var4_4] != 10 && i.a[var3_3 + 1][var4_4] != 37 && i.a[var3_3 + 1][var4_4] != 34 && i.a[var3_3 + 1][var4_4] != 35) {
                        while ((byte)(i.a[var3_3 + 1][var4_4] - 80) < 0 && i.a[var3_3 + 1][var4_4] != 10 && i.a[var3_3 + 1][var4_4] != 37 && i.a[var3_3 + 1][var4_4] != 34 && i.a[var3_3 + 1][var4_4] != 35) {
                            ++var3_3;
                        }
                    } else {
                        while (var8_7 < var6_5) {
                            ++var8_7;
                            if ((byte)(i.a[var3_3][var4_4] - 80) < 0 && i.a[var3_3][var4_4] != 10 && i.a[var3_3][var4_4] != 37 && i.a[var3_3][var4_4] != 34 && i.a[var3_3][var4_4] != 35) {
                                var8_7 = var6_5;
                                continue;
                            }
                            --var3_3;
                        }
                    }
                    if (var2_1.dx != 2 && var3_3 <= var2_1.dv) {
                        while ((byte)(i.a[var3_3 + 1][var4_4] - 80) < 0 && i.a[var3_3 + 1][var4_4] != 10 && i.a[var3_3 + 1][var4_4] != 37 && i.a[var3_3 + 1][var4_4] != 34 && i.a[var3_3 + 1][var4_4] != 35) {
                            ++var3_3;
                        }
                    }
                    i.a((int)var2_1.w, var3_3, (byte)14, (byte)6);
                    v6 = 1;
                    while ((byte)(i.a[var3_3 - (var9_8 = v6)][var4_4] - 80) < 0 && i.a[var3_3 - var9_8][var4_4] != 10 && i.a[var3_3 - var9_8][var4_4] != 37 && i.a[var3_3 - var9_8][var4_4] != 34 && i.a[var3_3 - var9_8][var4_4] != 35) {
                        v6 = (byte)(var9_8 + 1);
                    }
                    v2 = var2_1.w;
                    v3 = var9_8;
                    v4 = 49;
                    v5 = 5;
lbl87:
                    // 3 sources

                    i.a((int)v2, v3, (byte)v4, (byte)v5);
                }
            }
        }
        switch (this.x) {
            case 2: {
                var1_11 = 1;
                v7 = var1_11;
                while (v7 <= 15) {
                    block10 : switch (i.a((int)var1_11, (byte)28, (byte)3)) {
                        case 3: {
                            i.f(var1_11);
                            break;
                        }
                        case 2: {
                            if (this.dz < 0) break;
                            ++this.dz;
                            var3_3 = var1_11;
                            var2_1 = this;
                            var4_4 = i.a((int)var3_3, (byte)14, (byte)6);
                            var5_12 = i.a((int)var3_3, (byte)20, (byte)6);
                            var6_5 = i.a((int)var3_3, (byte)0, (byte)7);
                            var7_6 = (byte)i.a((int)var3_3, (byte)7, (byte)7);
                            var8_7 = i.a((int)var3_3, (byte)47, (byte)2);
                            v8 = (byte)i.a((int)var3_3, (byte)54, (byte)3);
                            var9_8 = v8;
                            var10_9 = (byte)i.a(v8, (byte)6, (byte)7);
                            switch (var8_7) {
                                case 1: {
                                    var11_10 = (byte)i.a((int)var3_3, (byte)49, (byte)5);
                                    if (var2_1.dz != 0 && var2_1.dz % var11_10 == 0) {
                                        var2_1.dz = 0;
                                        var12_15 = (byte)i.a((int)var3_3, (byte)26, (byte)2);
                                        var13_17 = (byte)i.a((int)var3_3, (byte)57, (byte)1);
                                        if (var12_15 >= 0) {
                                            if (var13_17 != 1) {
                                                v9 = var14_19 = 0;
                                                while (v9 < var11_10) {
                                                    i.a(var4_4 - var14_19, (int)var5_12, var12_15, (byte)7, (byte)3, (byte)4);
                                                    i.a((int)var3_3, var12_15, (byte)43, (byte)2);
                                                    i.a(var4_4 - var14_19, (int)var5_12, var12_15, var3_3, (byte)0, (byte)3);
                                                    v9 = (byte)(var14_19 + 1);
                                                }
                                                if (var2_1.dr > 0) {
                                                    v10 = (byte)(var12_15 + 1);
                                                    var14_19 = v10;
                                                    if (v10 > 2) {
                                                        var14_19 = 0;
                                                        ++var5_12;
                                                    }
                                                    v11 = var15_21 = 0;
                                                    while (v11 < var11_10) {
                                                        if ((byte)(i.a[var4_4 - var15_21][var5_12] - 80) < 0 && i.a[var4_4 - var15_21][var5_12] != 10 && i.a[var4_4 - var15_21][var5_12] != 37 && i.a[var4_4 - var15_21][var5_12] != 34 && i.a[var4_4 - var15_21][var5_12] != 35) {
                                                            i.a(var4_4 - var15_21, (int)var5_12, var14_19, (byte)8, (byte)3, (byte)4);
                                                        }
                                                        v11 = (byte)(var15_21 + 1);
                                                    }
                                                }
                                                ++var2_1.dr;
                                            }
                                            if (var13_17 == 1 || (var7_6 >= var6_5 || var10_9 == 0) && var12_15 == var2_1.v) {
                                                if (var13_17 == 1) {
                                                    i.a((int)var3_3, (byte)0, (byte)57, (byte)1);
                                                }
                                                i.a((int)var3_3, (byte)3, (byte)28, (byte)3);
                                                if (var10_9 == 0) {
                                                    i.a(var9_8, (byte)3, (byte)0, (byte)4);
                                                    i.a((int)var3_3, (byte)5, (byte)28, (byte)3);
                                                    if (var2_1.dq != -1) break block10;
                                                    var2_1.dz = -1;
                                                    var2_1.x = (byte)4;
                                                    break;
                                                }
                                            }
                                            if (var12_15 == 0) {
                                                i.a((int)var3_3, (byte)0, (byte)47, (byte)2);
                                                i.a((int)var3_3, (byte)2, (byte)26, (byte)2);
                                                break;
                                            }
                                            i.a((int)var3_3, (byte)(var12_15 - 1), (byte)26, (byte)2);
                                            break;
                                        }
                                    }
                                    ** GOTO lbl357
                                }
                                case 0: {
                                    i.a((int)var3_3, (byte)1, (byte)47, (byte)2);
                                    i.a((int)var3_3, --var5_12, (byte)20, (byte)6);
                                    if ((byte)(i.a[var4_4][var5_12] - 80) >= 0 || i.a[var4_4][var5_12] == 10 || i.a[var4_4][var5_12] == 37 || i.a[var4_4][var5_12] == 34 || i.a[var4_4][var5_12] == 35) {
                                        while ((byte)(i.a[var4_4][var5_12] - 80) >= 0 || i.a[var4_4][var5_12] == 10 || i.a[var4_4][var5_12] == 37 || i.a[var4_4][var5_12] == 34 || i.a[var4_4][var5_12] == 35) {
                                            --var4_4;
                                        }
                                    } else {
                                        while ((byte)(i.a[var4_4 + 1][var5_12] - 80) < 0 && i.a[var4_4 + 1][var5_12] != 10 && i.a[var4_4 + 1][var5_12] != 37 && i.a[var4_4 + 1][var5_12] != 34 && i.a[var4_4 + 1][var5_12] != 35) {
                                            ++var4_4;
                                        }
                                    }
                                    i.a((int)var3_3, var4_4, (byte)14, (byte)6);
                                    v12 = 1;
                                    while ((byte)(i.a[var4_4 - (var13_17 = v12)][var5_12] - 80) < 0 && i.a[var4_4 - var13_17][var5_12] != 10 && i.a[var4_4 - var13_17][var5_12] != 37 && i.a[var4_4 - var13_17][var5_12] != 34 && i.a[var4_4 - var13_17][var5_12] != 35) {
                                        v12 = (byte)(var13_17 + 1);
                                    }
                                    i.a((int)var3_3, var13_17, (byte)49, (byte)5);
                                    var10_9 = (byte)(var10_9 - var13_17);
                                    var14_19 = 0;
                                    var2_1.v = 0;
                                    if (var10_9 < 0) {
                                        var5_12 = -var10_9 * 3;
                                        var15_21 = 0;
                                        var16_23 = var13_17 + var10_9;
                                        if (var16_23 * 3 - var13_17 != 0 && var16_23 * 3 <= var13_17 * 3 / 2) {
                                            var15_21 = 1;
                                        }
                                        var2_1.v = var5_12 /= var13_17;
                                        var2_1.v = (byte)(var2_1.v + var15_21);
                                        if (var2_1.v > 2) {
                                            i.a((int)var3_3, (byte)1, (byte)57, (byte)1);
                                        }
                                        var14_19 = (byte)Math.abs(var10_9);
                                        var10_9 = 0;
                                    }
                                    if ((var7_6 += var13_17 - var14_19) > var6_5) {
                                        var5_12 = var6_5 - var7_6;
                                        var7_6 += var5_12;
                                        var10_9 = (byte)(var10_9 - var5_12);
                                    }
                                    i.a((int)var3_3, var7_6, (byte)7, (byte)7);
                                    i.a(var9_8, var10_9, (byte)6, (byte)7);
                                }
                            }
                            break;
                        }
                        case 1: 
                        case 6: 
                        case 7: {
                            var3_3 = var1_11;
                            var2_1 = this;
                            var4_4 = i.a((int)var3_3, (byte)31, (byte)6);
                            var5_12 = i.a((int)var3_3, (byte)37, (byte)6);
                            var6_5 = (byte)i.a((int)var3_3, (byte)43, (byte)2);
                            var7_6 = (byte)i.a(i.e[var4_4][var5_12], var6_5, (byte)7, (byte)2);
                            var8_7 = (byte)i.a((int)var3_3, (byte)45, (byte)2);
                            var10_9 = (byte)i.a((int)var3_3, (byte)28, (byte)3) == 7 ? 1 : 0;
                            var11_10 = 0;
                            if (var8_7 > 1) {
                                var8_7 = -1;
                            }
                            if (var7_6 == 0) {
                                var12_15 = (byte)(var6_5 + 1);
                                var13_17 = var5_12;
                                if (var6_5 == 2) {
                                    var12_15 = 0;
                                    var13_17 = var5_12 + 1;
                                }
                                if (i.a(i.e[var4_4][var13_17], var12_15, (byte)3, (byte)4) == 7) {
                                    var2_1.dr = 1;
                                    if (var10_9 != 0) {
                                        i.f(var3_3);
                                        var2_1.x = (byte)3;
                                        var2_1.al = true;
                                        break;
                                    }
                                    var14_19 = var12_15 - 1;
                                    if (var14_19 < 0) {
                                        var14_19 = 2;
                                    }
                                    var2_1.dz = 0;
                                    var5_12 = (byte)i.a(i.e[var4_4][var13_17], var12_15, (byte)0, (byte)3);
                                    var15_21 = (byte)i.a((int)var3_3, (byte)54, (byte)3);
                                    i.a((int)var5_12, var15_21, (byte)54, (byte)3);
                                    i.a((int)var5_12, (byte)2, (byte)28, (byte)3);
                                    i.a((int)var5_12, (byte)0, (byte)47, (byte)2);
                                    i.a((int)var5_12, var14_19, (byte)26, (byte)2);
                                    i.a((int)var5_12, var4_4, (byte)14, (byte)6);
                                    i.a((int)var5_12, var13_17, (byte)20, (byte)6);
                                    i.a((int)var5_12, (byte)0, (byte)57, (byte)1);
                                    i.f(var3_3);
                                    break;
                                }
                            }
                            if (var6_5 != 2 || var7_6 != 0) ** GOTO lbl317
                            if ((byte)(i.a[var4_4][var5_12 + 1] - 80) < 0 && i.a[var4_4][var5_12 + 1] != 10 && i.a[var4_4][var5_12 + 1] != 37 && i.a[var4_4][var5_12 + 1] != 34 && i.a[var4_4][var5_12 + 1] != 35) ** GOTO lbl314
                            if (var8_7 != 0) ** GOTO lbl258
                            if (var10_9 != 0) {
                                i.c(var4_4, var5_12, var6_5);
                            } else {
                                i.a(var4_4, (int)var5_12, var6_5, (byte)15, (byte)3, (byte)4);
                            }
                            var11_10 = var2_1.a(var3_3, var4_4, var5_12, var8_7, var6_5, (byte)1, (boolean)var10_9);
                            if (var11_10 >= 0) ** GOTO lbl254
                            v13 = var2_1;
                            v14 = var3_3;
                            v15 = var4_4;
                            v16 = var5_12;
                            v17 = var8_7;
                            v18 = var6_5;
                            v19 = -1;
                            ** GOTO lbl265
lbl254:
                            // 1 sources

                            if ((byte)(i.a[var4_4 + -1][var5_12] - 80) < 0 && i.a[var4_4 + -1][var5_12] != 10 && i.a[var4_4 + -1][var5_12] != 37 && i.a[var4_4 + -1][var5_12] != 34 && i.a[var4_4 + -1][var5_12] != 35) {
                                var2_1.a(var4_4 - 1, (int)var5_12, var10_9 != 0 ? 7 : 5, (byte)-1, (byte)2, (byte)i.a((int)var3_3, (byte)54, (byte)3));
                            }
                            ** GOTO lbl266
lbl258:
                            // 1 sources

                            v13 = var2_1;
                            v14 = var3_3;
                            v15 = var4_4;
                            v16 = var5_12;
                            v17 = var8_7;
                            v18 = var6_5;
                            v19 = var8_7;
lbl265:
                            // 2 sources

                            var11_10 = v13.a(v14, v15, v16, v17, v18, v19, (boolean)var10_9);
lbl266:
                            // 2 sources

                            if (var11_10 != -2) ** GOTO lbl311
                            var16_24 = var12_15 = i.b[var4_4][var5_12 + 1];
                            if (!(var12_15 != -1 && i.a((int)var16_24, (byte)6, (byte)1) == 1)) ** GOTO lbl-1000
                            var18_30 = var8_7;
                            var17_28 = var5_12;
                            var16_24 = var4_4;
                            var19_32 = 1;
                            v20 = var20_34 = 1;
                            while (var20_34 != 0) {
                                var20_34 = 1;
                                var16_24 -= var18_30;
                                if (var18_30 == 0) {
                                    if ((byte)(i.a[var16_24 - 1][var17_28] - 80) < 0 && i.a[var16_24 - 1][var17_28] != 10 && i.a[var16_24 - 1][var17_28] != 37 && i.a[var16_24 - 1][var17_28] != 34 && (i.a[var16_24 - 1][var17_28] != 35 || (byte)(i.a[var16_24 + 1][var17_28] - 80) < 0) && i.a[var16_24 + 1][var17_28] != 10 && i.a[var16_24 + 1][var17_28] != 37 && i.a[var16_24 + 1][var17_28] != 34 && i.a[var16_24 + 1][var17_28] != 35) continue;
                                    var19_32 = 1;
                                    v20 = 0;
                                    continue;
                                }
                                if ((byte)(i.a[var16_24][var17_28 + 1] - 80) < 0 && i.a[var16_24][var17_28 + 1] != 10 && i.a[var16_24][var17_28 + 1] != 37 && i.a[var16_24][var17_28 + 1] != 34 && i.a[var16_24][var17_28 + 1] != 35) {
                                    var20_34 = 0;
                                }
                                if ((byte)(i.a[var16_24][var17_28] - 80) >= 0 || i.a[var16_24][var17_28] == 10 || i.a[var16_24][var17_28] == 37 || i.a[var16_24][var17_28] == 34 || i.a[var16_24][var17_28] == 35) {
                                    var19_32 = var20_34;
                                    v20 = 0;
                                    continue;
                                }
                                if (var20_34 != 0) continue;
                                v21 = var20_34;
                                ** GOTO lbl292
                            }
                            v21 = var19_32;
lbl292:
                            // 2 sources

                            if (v21 != 0) {
                                var2_1.dr = 0;
                                var2_1.dz = 0;
                                i.a((int)var3_3, (byte)2, (byte)28, (byte)3);
                                i.a((int)var3_3, i.a((int)var12_15, (byte)0, (byte)6), (byte)0, (byte)7);
                                i.a((int)var3_3, (byte)2, (byte)26, (byte)2);
                                i.a((int)var3_3, var4_4, (byte)14, (byte)6);
                                v22 = var3_3;
                                v23 = (byte)(var5_12 + 1);
                                v24 = 20;
                                v25 = 6;
                            } else lbl-1000:
                            // 2 sources

                            {
                                v22 = var3_3;
                                v23 = 3;
                                v24 = 28;
                                v25 = 3;
                            }
                            i.a((int)v22, v23, (byte)v24, (byte)v25);
                            var4_4 += var8_7;
                            ** GOTO lbl317
lbl311:
                            // 1 sources

                            var8_7 = var11_10;
                            var4_4 += var8_7;
                            ** GOTO lbl317
lbl314:
                            // 1 sources

                            if (var8_7 != 0) {
                                var8_7 = 0;
                                i.a((int)var3_3, (byte)0, (byte)45, (byte)2);
                            }
lbl317:
                            // 6 sources

                            if (var11_10 == -2) break;
                            switch (var8_7) {
                                case 0: {
                                    var2_2 = var10_9;
                                    var20_34 = var6_5;
                                    var19_32 = var5_12;
                                    var18_30 = var4_4;
                                    var17_28 = var3_3;
                                    var16_25 = var2_1;
                                    if (var2_2 == 0 && i.a(i.e[var18_30][var19_32], var20_34, (byte)3, (byte)4) == 0) {
                                        i.a(var18_30, (int)var19_32, var20_34, (byte)3, (byte)3, (byte)4);
                                    }
                                    v26 = (byte)(var20_34 + 1);
                                    var20_34 = v26;
                                    if (v26 > 2) {
                                        var20_34 = 0;
                                        i.a((int)var17_28, ++var19_32, (byte)37, (byte)6);
                                    }
                                    i.a((int)var17_28, var20_34, (byte)43, (byte)2);
                                    if (var2_2 != 0) {
                                        v27 = var18_30;
                                        v28 = var19_32;
                                        v29 = var20_34;
                                        v30 = 6;
                                    } else {
                                        i.a(var18_30, (int)var19_32, var20_34, var17_28, (byte)0, (byte)3);
                                        v27 = var18_30;
                                        v28 = var19_32;
                                        v29 = var20_34;
                                        v30 = 0;
                                    }
                                    i.a(v27, (int)v28, v29, v30, (byte)3, (byte)4);
                                    break block10;
                                }
                                case -1: 
                                case 1: {
                                    var20_34 = var7_6;
                                    var19_32 = var6_5;
                                    var18_30 = var5_12;
                                    var17_28 = var4_4;
                                    var16_26 = var2_1;
                                    var20_34 = (byte)(var20_34 + 1);
                                    if (var20_34 > 2) {
                                        var20_34 = 0;
                                    }
                                    i.a(var17_28, (int)var18_30, var19_32, var20_34, (byte)7, (byte)2);
                                }
                            }
                        }
                    }
lbl357:
                    // 12 sources

                    v7 = (byte)(var1_11 + 1);
                }
                break;
            }
            case 1: {
                this.x = (byte)2;
                return;
            }
            case 4: {
                var2_1 = this;
                var3_3 = 0;
                v31 = var3_3;
                while (v31 < 15) {
                    if (i.a(var3_3, (byte)0, (byte)4) != 3) ** GOTO lbl393
                    var4_4 = i.a(var3_3, (byte)13, (byte)7);
                    var5_13 = i.a(var3_3, (byte)20, (byte)7);
                    var6_5 = i.a(var3_3, (byte)4, (byte)2);
                    i.b[var3_3] = 0L;
                    var7_6 = 0;
                    var8_7 = 0;
                    switch (var6_5) {
                        case 0: {
                            ++var5_13;
                            var7_6 = 0;
                            v32 = 0;
                            ** GOTO lbl390
                        }
                        case 1: {
                            ++var4_4;
                            v33 = 1;
                            ** GOTO lbl388
                        }
                        case 2: {
                            --var4_4;
                            v33 = -1;
lbl388:
                            // 2 sources

                            var7_6 = (byte)v33;
                            v32 = 2;
lbl390:
                            // 2 sources

                            var8_7 = v32;
                        }
                    }
                    var2_1.a(var4_4, var5_13, (byte)7, var7_6, var8_7, i.b(var4_4, var5_13));
lbl393:
                    // 2 sources

                    v31 = (byte)(var3_3 + 1);
                }
                this.x = (byte)2;
                return;
            }
            case 5: {
                var4_4 = this.dw;
                var3_3 = this.dv;
                var2_1 = this;
                this.dq = 0;
                if (var2_1.dx > 1) {
                    v34 = i.e[var3_3];
                    v35 = var4_4 - 1;
                } else {
                    v34 = i.e[var3_3 + var2_1.dx];
                    v35 = var4_4;
                }
                var5_14 = v34[v35];
                var2_1.w = (byte)i.a((int)var5_14, (byte)2, (byte)0, (byte)3);
                i.a((int)var2_1.w, (byte)0, (byte)47, (byte)2);
                var6_5 = i.a((int)var2_1.w, (byte)7, (byte)7);
                switch (var2_1.dx) {
                    case 2: {
                        var7_6 = 0;
                        var8_7 = var3_3;
                        var9_8 = var4_4;
                        var10_9 = var6_5;
                        var11_10 = var4_4 - 1;
                        var2_1.dw = -1;
                        var2_1.dv = -1;
                        break;
                    }
                    default: {
                        var7_6 = (byte)var2_1.dx;
                        var8_7 = var3_3 + var7_6;
                        var7_6 = (byte)(var7_6 < 0 ? 1 : 2);
                        var5_14 = var9_8 = var4_4 + 1;
                        var14_20 = var8_7;
                        var13_18 = var2_1;
                        var15_22 = 0;
                        var16_27 = true;
                        var18_31 = var13_18.dx;
                        var19_33 = 0;
                        block51: while (true) {
                            var20_35 = 0;
                            while (i.e[var14_20 + var18_31][var5_14 - 1] != 0 && (byte)(i.a[var14_20][var5_14] - 80) >= 0 || i.a[var14_20][var5_14] == 10 || i.a[var14_20][var5_14] == 37 || i.a[var14_20][var5_14] == 34 || i.a[var14_20][var5_14] == 35) {
                                var14_20 += var18_31;
                            }
                            v36 = 0;
                            while ((byte)(i.a[var14_20 + (var17_29 = v36)][var5_14] - 80) < 0 && i.a[var14_20 + var17_29][var5_14] != 10 && i.a[var14_20 + var17_29][var5_14] != 37 && i.a[var14_20 + var17_29][var5_14] != 34 && i.a[var14_20 + var17_29][var5_14] != 35) {
                                if (var16_27) {
                                    var16_27 = false;
                                    var15_22 = var13_18.a(var14_20, (int)var5_14, (byte)8, (byte)-2, (byte)2, (byte)0);
                                    i.a((int)var15_22, (byte)5, (byte)28, (byte)3);
                                    i.a((int)var15_22, var14_20, (byte)14, (byte)6);
                                    i.a((int)var15_22, var5_14, (byte)20, (byte)6);
                                }
                                i.a(var14_20 + var17_29, (int)var5_14, (byte)2, var15_22, (byte)0, (byte)3);
                                v36 = var17_29 + var18_31;
                            }
                            var17_29 = Math.abs(var17_29);
                            var19_33 += var17_29;
                            ++var5_14;
                            while (true) {
                                if (i.e[var14_20][var5_14] != 0) continue block51;
                                if (var20_35 >= var17_29 || (var14_20 += var18_31) < 0 || var14_20 == var13_18.e) {
                                    if (var19_33 <= 0) break block51;
                                    i.a((int)var15_22, (byte)var19_33, (byte)7, (byte)7);
                                    break block51;
                                }
                                ++var20_35;
                            }
                            break;
                        }
                        var10_9 = var6_5 - var19_33;
                        var11_10 = var4_4;
                        var2_1.dv = var3_3;
                        var2_1.dw = var4_4;
                    }
                }
                i.a((int)var2_1.w, var7_6, (byte)45, (byte)2);
                var2_1.dy = var9_8;
                var2_1.a(var10_9, var8_7, var11_10, var7_6);
                var12_16 = i.b(var8_7, (int)var11_10);
                i.a(var12_16, (byte)2, (byte)0, (byte)4);
                var2_1.x = 1;
                switch (var2_1.dx) {
                    case 2: {
                        v37 = var2_1;
                        v38 = var8_7;
                        v39 = var4_4;
                        v40 = 3;
                        v41 = 0;
                        v42 = 0;
                        ** GOTO lbl494
                    }
                    case 1: {
                        v37 = var2_1;
                        v38 = var8_7 - 1;
                        v39 = var4_4;
                        v40 = 14;
                        v41 = -1;
                        ** GOTO lbl493
                    }
                    case -1: {
                        v37 = var2_1;
                        v38 = var8_7 + 1;
                        v39 = var4_4;
                        v40 = 11;
                        v41 = 1;
lbl493:
                        // 2 sources

                        v42 = 2;
lbl494:
                        // 2 sources

                        var12_16 = v37.a(v38, (int)v39, v40, v41, v42, var12_16);
                    }
                }
                i.a((int)var12_16, (byte)6, (byte)28, (byte)3);
                var2_1.dx = 0;
            }
        }
    }

    private static void f(byte by) {
        i.a[by - 1] = 0L;
    }

    private byte a(byte by, int n, int n2, byte by2, byte by3, byte by4, boolean bl) {
        byte by5;
        if ((byte)(a[n + by4][n2] - 80) >= 0 || a[n + by4][n2] == 10 || a[n + by4][n2] == 37 || a[n + by4][n2] == 34 || a[n + by4][n2] == 35) {
            by5 = -2;
        } else {
            by5 = by4;
            if (by2 != by4) {
                i.a((int)by, by4 < 0 ? (byte)2 : (byte)by4, (byte)45, (byte)2);
            }
            i.a((int)by, (byte)(n += by4), (byte)31, (byte)6);
            i.a(n, n2, by3, by, (byte)0, (byte)3);
            if (bl) {
                i.c(n, n2, by3);
            } else {
                byte by6;
                byte by7;
                int n3;
                int n4;
                int n5;
                byte by8;
                by = (byte)i.a((int)by, (byte)28, (byte)3);
                if (by4 > 0) {
                    by8 = by == 6 && this.dv == n && this.dw == n2 ? (byte)11 : 4;
                    n5 = 9;
                } else {
                    by8 = by == 6 && this.dv == n && this.dw == n2 ? (byte)14 : 5;
                    n5 = 12;
                }
                by = (byte)n5;
                if ((byte)(a[n][n2 + 1] - 80) >= 0 || a[n + by4][n2] == 10 || a[n + by4][n2] == 37 || a[n + by4][n2] == 34 || a[n + by4][n2] == 35) {
                    n4 = n;
                    n3 = n2;
                    by7 = by3;
                    by6 = by8;
                } else {
                    n4 = n;
                    n3 = n2;
                    by7 = by3;
                    by6 = by;
                }
                i.a(n4, n3, by7, by6, (byte)3, (byte)4);
            }
        }
        return by5;
    }

    private static byte a(int n, byte by, byte by2) {
        return (byte)(n >>> by & ~(0xFFFFFF << by2));
    }

    private static void c(int n, int n2, byte by) {
        int n3 = e[n][n2];
        by = (byte)(by * 9);
        by = (byte)((n3 >>> by & 0x1FF) << by);
        i.e[n][n2] = n3 ^= by;
        i.c[n][n2] = 24;
    }

    private byte a(int n, int n2, byte by, byte by2, byte by3, byte by4) {
        byte by5;
        byte by6 = by5 = 1;
        while (by6 <= 15 && i.a((int)by5, (byte)28, (byte)3) != 0) {
            by6 = (byte)(by5 + 1);
        }
        i.a[by5 - 1] = 0L;
        if (by == 7) {
            i.c(n, n2, by3);
            i.a((int)by5, (byte)7, (byte)28, (byte)3);
        } else {
            i.a((int)by5, (byte)1, (byte)28, (byte)3);
            i.a((int)by5, by4, (byte)54, (byte)3);
            i.a(n, n2, by3, by5, (byte)0, (byte)3);
            i.a(n, n2, by3, by, (byte)3, (byte)4);
        }
        i.a((int)by5, (byte)n, (byte)31, (byte)6);
        i.a((int)by5, (byte)n2, (byte)37, (byte)6);
        i.a((int)by5, by3, (byte)43, (byte)2);
        if (by2 < 0) {
            by2 = (byte)2;
        }
        i.a((int)by5, by2, (byte)45, (byte)2);
        return by5;
    }

    private void m(int n, int n2) {
        if (this.l) {
            int n3 = e[n - 1][n2] != 0 ? -1 : (this.dx = e[n + 1][n2] != 0 ? 1 : 0);
            if (this.dx == 0) {
                int n4 = this.dx = e[n][n2 - 1] != 0 ? 2 : 0;
            }
            if (this.dx != 0) {
                this.x = (byte)5;
                this.p(13);
                this.dv = n;
                this.dw = n2;
            }
        }
    }

    private void n(int n, int n2) {
        int n3;
        int n4 = 2;
        int n5 = n2;
        int n6 = n;
        i i2 = this;
        byte by = i.b(n6, n5);
        if (by >= 0) {
            i.a(by, (byte)2, (byte)0, (byte)4);
            n3 = 39;
        } else {
            n3 = -1;
        }
        if (n3 > 0) {
            i.a[n][n2] = -1;
            n5 = n2;
            n6 = n;
            i i3 = this;
            this.x = 1;
            i3.a(n6, n5 + 1, (byte)0, (byte)0, (byte)0, i.b(n6, n5));
        }
    }

    private static int b(f f2, int n) {
        n = (n << 2) + 3;
        return f2.a[n] & 0xFF;
    }

    private static int c(f f2, int n) {
        n = (n << 2) + 2;
        return f2.a[n] & 0xFF;
    }

    private static void o(int n) {
        try {
            f = d.a((n %= 8) + 69);
            if (n <= 4) {
                a = i.a("/tips.f", n);
                return;
            }
            a = null;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void av() {
        this.R = false;
        i.o(this.ag);
        Graphics graphics = this.a;
        graphics.setColor(798521);
        graphics.fillRoundRect(40, 4, 240, 200, 8, 8);
        graphics.setColor(13540096);
        graphics.drawRoundRect(40, 4, 240, 200, 8, 8);
        int n = 29;
        int n2 = 160;
        String[] stringArray = f;
        i i2 = this;
        stringArray = c.a((String)stringArray, '\n');
        int n3 = i2.ag % 8;
        for (int i3 = 0; i3 < stringArray.length; ++i3) {
            int n4;
            i.a.a.getHeight();
            if ((n3 == 0 && (i3 == 1 || i3 == 4) || n3 > 0 && n3 < 4 && i3 == 1 ? (n3 == 0 && i3 == 1 ? 7 : (n3 == 0 && i3 == 4 ? 6 : 0)) : (n4 = -1)) >= 0) {
                if (a == null) {
                    a = i.a("/tips.f", i2.ag);
                }
                if (a == null) continue;
                try {
                    int n5 = i.c(a, n4);
                    a.a(graphics, n4, 160 - n5 / 2, n - 5, 0, 0, 0);
                    n += (i.a.a[(n4 << 2) + 3] & 0xFF) + 10;
                }
                catch (Exception exception) {}
                continue;
            }
            n = c.a(graphics, stringArray[i3], 160, n, 210);
        }
    }

    private static void a(Graphics graphics, h h2, String string, int n, int n2, int n3, int n4, boolean bl) {
        h2.d = n4;
        if (string.endsWith("\n")) {
            string = string.substring(0, string.length() - 1);
        }
        string = i.a(string, 310);
        n3 = i.a(h2, string, bl ? -1 : 0);
        n4 = h2.a(string);
        boolean bl2 = false;
        int n5 = n - (n3 >> 1);
        graphics.setColor(798521);
        graphics.fillRoundRect(n5 - 5, n2 - 5, n3 + 10, n4 + 10, 10, 10);
        graphics.setColor(13540096);
        graphics.drawRoundRect(n5 - 5, n2 - 5, n3 + 10, n4 + 10, 10, 10);
        h2.a(graphics, string, n, n2 + 10, 17);
    }

    private void aw() {
        this.H = false;
        i.a(a[23], true);
        i.a[23] = null;
        i.a(a[24], true);
        i.a[24] = null;
        i.a(a[25], true);
        i.a[25] = null;
        i.a(a[26], true);
        i.a[26] = null;
        i.a(a[17], true);
        i.a[17] = null;
        this.c = null;
        f = null;
        c = null;
        System.gc();
    }

    private void ax() {
        this.e();
        this.au = true;
        this.av = true;
        this.an = true;
        b = (byte)21;
        this.bs = 0;
        this.br = 14;
        this.dK = 100;
        if (this.aB > i.b(this.aA)) {
            this.aB = i.b(this.aA);
        }
        this.ay();
    }

    private void ay() {
        a = new long[12][12];
        this.c = new int[20];
    }

    private static int a(long l, byte by, byte by2) {
        return (int)(l >>> by & (-1L << by2 ^ 0xFFFFFFFFFFFFFFFFL));
    }

    private static void a(int n, int n2, int n3, byte by, byte by2) {
        long l = a[n][n2];
        long l2 = (long)i.a(l, by, by2) << by;
        l ^= l2;
        long l3 = (long)n3 << by;
        i.a[n][n2] = l |= l3;
    }

    /*
     * Unable to fully structure code
     */
    private boolean h() {
        block32: {
            block31: {
                var1_1 = false;
                var2_2 = this.ei >> 1;
                if (this.ek < 0) {
                    v0 = this;
                    v1 = 2;
                } else {
                    v2 = this;
                    v0 = v2;
                    v1 = v0.ek = v2.ek - 1;
                }
                if (this.dX == 0 && this.dY == 0) {
                    this.dX = this.dV;
                    this.dY = this.dW;
                }
                if (this.ek == 0) {
                    if (this.ej == var2_2) {
                        v3 = true;
                    } else {
                        ++this.ej;
                        v3 = false;
                    }
                    var1_1 = v3;
                }
                var3_3 = i.a(i.a[this.dV][this.dW], (byte)3, (byte)3);
                var4_4 = i.a(i.a[this.dX][this.dY], (byte)3, (byte)3);
                var5_5 = 0;
                switch (var3_3 == 1 || var4_4 == 1 ? 1 : var3_3) {
                    case 0: {
                        v4 = 2;
                        ** GOTO lbl29
                    }
                    case 1: {
                        v4 = 8;
lbl29:
                        // 2 sources

                        var5_5 = v4;
                    }
                }
                var6_6 = 0;
                var7_7 = this.as != false ? var2_2 - 1 : 0;
                v5 = var8_8 = this.as != false ? -1 : 1;
                while (var6_6 < this.ej) {
                    var9_9 = var7_7 << 1;
                    i.a[17].a(this.a, var5_5, this.c[var9_9], this.c[var9_9 + 1], 0, 0, 0);
                    ++var6_6;
                    var7_7 += var8_8;
                }
                var9_9 = 0;
                var5_5 = 0;
                switch (var3_3) {
                    case 0: {
                        var5_5 = 0;
                        v6 = 0;
                        ** GOTO lbl49
                    }
                    case 1: {
                        var5_5 = 2;
                        v6 = 9;
lbl49:
                        // 2 sources

                        var9_9 = v6;
                    }
                }
                var3_3 = this.dV * 13 + var5_5 + 77;
                var7_7 = this.dW * 13 + var5_5 + 33;
                i.a[17].a(this.a, var9_9, var3_3, var7_7, 0, 0, 0);
                var8_8 = this.ao != false ? 7 : 6;
                i.a[17].a(this.a, var8_8, var3_3 + 6, var7_7 + 6, 0, 0, 0);
                var8_8 = 1;
                if (var6_6 == var2_2) {
                    if (this.em < 0) {
                        v7 = this;
                        v8 = 2;
                    } else {
                        v9 = this;
                        v7 = v9;
                        v8 = v7.em = v9.em - 1;
                    }
                    if (this.em == 0) {
                        this.em = 1;
                        var8_8 = 0;
                    }
                }
                if (var8_8 != 0) break block31;
                switch (var4_4) {
                    case 0: {
                        var5_5 = 0;
                        v10 = 0;
                        ** GOTO lbl76
                    }
                    case 1: {
                        var5_5 = 2;
                        v10 = 9;
lbl76:
                        // 2 sources

                        var9_9 = v10;
                    }
                }
                break block32;
            }
            switch (var4_4) {
                case 0: {
                    var5_5 = 0;
                    v11 = 1;
                    ** GOTO lbl87
                }
                case 1: {
                    var5_5 = 2;
                    v11 = 5;
lbl87:
                    // 2 sources

                    var9_9 = v11;
                }
            }
        }
        var3_3 = this.dX * 13 + var5_5 + 77;
        var7_7 = this.dY * 13 + var5_5 + 33;
        i.a[17].a(this.a, var9_9, var3_3, var7_7, 0, 0, 0);
        if (var8_8 == 0) {
            if (this.el == i.a[9].a(0)) {
                --this.el;
                this.ar = true;
                v12 = true;
            } else {
                v12 = var1_1 = false;
            }
            if (!this.P) {
                i.a[9].a(this.a, this.el, var3_3, var7_7, 0, 0, 0);
            }
            ++this.el;
        }
        return var1_1;
    }

    private void o(int n, int n2) {
        block6: {
            block7: {
                i i2;
                block5: {
                    if (this.at) break block5;
                    int n3 = i.a(a[this.cx][this.cy], (byte)6, (byte)5);
                    if ((n2 != dZ || n != n3) && (n != dZ || n2 != n3)) break block6;
                    if (n == dZ && n2 == n3) {
                        this.as = true;
                    }
                    i2 = this;
                    break block7;
                }
                if ((n2 != dZ || n != dZ - 1) && (n != dZ || n2 != dZ - 1)) break block6;
                if (n == dZ && n2 == dZ - 1) {
                    this.as = true;
                }
                i2 = this;
            }
            i2.c[this.ei++] = this.ea;
            this.c[this.ei++] = this.eb;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void az() {
        this.dL = 0;
        if ((this.a(this.aA, this.aB + 1) & 2) != 0 && this.aB + 1 == i.dZ || this.aB == i.dZ) {
            this.aq = false;
            this.ar = true;
        }
        for (var1_1 = 0; var1_1 < 12; ++var1_1) {
            for (var2_2 = 0; var2_2 < 12; ++var2_2) {
                block41: {
                    block40: {
                        var3_3 = i.a[var1_1][var2_2];
                        var5_7 = false;
                        if (var3_3 == 0L) continue;
                        var6_8 = i.a(var3_3, (byte)3, (byte)3);
                        var7_9 = i.a(var3_3, (byte)6, (byte)5);
                        var8_10 = this.ar == false && var7_9 == i.dZ && var7_9 != 0 ? 1 : i.a(var3_3, (byte)0, (byte)3);
                        var9_11 = -1;
                        var10_12 = -1;
                        var11_13 = -1;
                        if (var8_10 != 0) break block40;
                        var5_7 = this.b(this.aA, var7_9) == this.c(this.aA, var7_9);
                        switch (var6_8) {
                            case 0: {
                                var10_12 = 17;
                                var11_13 = 0;
                                v0 = i.a(var3_3, (byte)11, (byte)3) > 2 ? 13 : 0;
                                ** GOTO lbl28
                            }
                            case 1: {
                                var10_12 = 18;
                                var11_13 = 2;
                                v0 = 9;
lbl28:
                                // 2 sources

                                var9_11 = v0;
                            }
                        }
                        break block41;
                    }
                    switch (var6_8) {
                        case 0: {
                            var11_13 = 0;
                            var9_11 = 1;
                        }
                    }
                }
                var12_14 = var8_10;
                var8_10 = var6_8;
                var16_18 = var3_3;
                var6_8 = var2_2;
                var4_6 = var1_1;
                var3_4 = this;
                var13_15 = i.a(var16_18, (byte)6, (byte)5);
                var3_4.dL |= 1 << var13_15;
                var14_16 = i.a(var16_18, (byte)11, (byte)3);
                var15_17 = 14;
                var18_19 = 0;
                while (var18_19 < var14_16) {
                    block42: {
                        block45: {
                            block44: {
                                block43: {
                                    var19_20 = 77 + var4_6 * 13;
                                    var20_21 = 33 + var6_8 * 13;
                                    var21_22 = i.a(var16_18, (byte)var15_17, (byte)4);
                                    var22_23 = i.a(var16_18, (byte)(var15_17 += 4), (byte)4);
                                    var30_28 = i.a[var21_22][var22_23];
                                    var23_24 = i.a(var30_28, (byte)6, (byte)5);
                                    if ((var3_4.dL & 1 << var23_24) > 0) break block42;
                                    var21_22 = 77 + var21_22 * 13;
                                    var22_23 = 33 + var22_23 * 13;
                                    var3_4.ea = var19_20 += 6;
                                    var3_4.eb = var20_21 += 6;
                                    var3_4.ec = 0;
                                    var3_4.ed = (var21_22 += 6) - var19_20;
                                    var3_4.ee = (var22_23 += 6) - var20_21;
                                    var3_4.ef = 0;
                                    var3_4.eg = 0;
                                    var3_4.eh = 1;
                                    var19_20 = 1;
                                    var20_21 = 1;
                                    if (var3_4.ed < 0) {
                                        var19_20 = -1;
                                        var3_4.ed = -var3_4.ed;
                                    }
                                    if (var3_4.ee < 0) {
                                        var20_21 = -1;
                                        var3_4.ee = -var3_4.ee;
                                    }
                                    var24_25 = 0;
                                    var25_26 = i.a(var30_28, (byte)0, (byte)3);
                                    var26_27 = i.a(var30_28, (byte)3, (byte)3);
                                    if (var8_10 == 1) {
                                        var26_27 = var8_10;
                                    }
                                    if (var12_14 != 1) break block43;
                                    if (var26_27 == 1) break block42;
                                    var25_26 = var12_14;
                                }
                                if (!var3_4.ar && var23_24 == i.dZ) {
                                    var25_26 = 1;
                                }
                                if (var25_26 != 0) break block44;
                                switch (var26_27) {
                                    case 0: {
                                        v1 = 2;
                                        ** GOTO lbl91
                                    }
                                    case 1: {
                                        v1 = 8;
lbl91:
                                        // 2 sources

                                        var24_25 = v1;
                                    }
                                }
                                break block45;
                            }
                            switch (var26_27) {
                                case 0: {
                                    v2 = 3;
                                    break;
                                }
                                case 1: {
                                    v2 = var24_25 = 4;
                                }
                            }
                        }
                        if (var3_4.ee <= var3_4.ed) {
                            var3_4.ef = var3_4.ed << 1;
                            var3_4.eg = var3_4.ee << 1;
                            while (true) {
                                if (var3_4.eh % 8 == 0) {
                                    i.a[17].a(i.c, var24_25, var3_4.ea - 60, var3_4.eb - 51, 0, 0, 0);
                                    if (var3_4.aq) {
                                        var3_4.o(var13_15, var23_24);
                                    }
                                }
                                if (var3_4.ea != var21_22) {
                                    var3_4.ea += var19_20;
                                    var3_4.ec += var3_4.eg;
                                    if (var3_4.ec > var3_4.ed) {
                                        var3_4.eb += var20_21;
                                        var3_4.ec -= var3_4.ef;
                                    }
                                    ++var3_4.eh;
                                    continue;
                                }
                                break;
                            }
                        } else {
                            var3_4.ef = 2 * var3_4.ee;
                            var3_4.eg = 2 * var3_4.ed;
                            while (true) {
                                if (var3_4.eh % 8 == 0) {
                                    i.a[17].a(i.c, var24_25, var3_4.ea - 60, var3_4.eb - 51, 0, 0, 0);
                                    if (var3_4.aq) {
                                        var3_4.o(var13_15, var23_24);
                                    }
                                }
                                if (var3_4.eb == var22_23) break;
                                var3_4.eb += var20_21;
                                var3_4.ec += var3_4.eg;
                                if (var3_4.ec > var3_4.ee) {
                                    var3_4.ea += var19_20;
                                    var3_4.ec -= var3_4.ef;
                                }
                                ++var3_4.eh;
                            }
                        }
                    }
                    ++var18_19;
                    var15_17 += 4;
                }
                if (var11_13 == -1 || var9_11 == -1) continue;
                if (var5_7 && var10_12 != -1) {
                    i.a[17].a(i.c, var10_12, var1_1 * 13 + var11_13 + 77 - 60, var2_2 * 13 + var11_13 + 33 - 51, 0, 0, 0);
                }
                i.a[17].a(i.c, var9_11, var1_1 * 13 + var11_13 + 77 - 60, var2_2 * 13 + var11_13 + 33 - 51, 0, 0, 0);
                var3_5 = -1;
                switch (this.aA) {
                    case 0: {
                        if (var7_9 != 8) break;
                        v3 = 52;
                        break;
                    }
                    case 1: {
                        if (var7_9 != 9) break;
                        v3 = 53;
                        break;
                    }
                    case 2: {
                        if (var7_9 != 10) break;
                        v3 = var3_5 = 54;
                    }
                }
                if (var3_5 == -1) continue;
                i.a[var3_5].a(i.c, 0, var1_1 * 13 + -8 + 77 - 60, var2_2 * 13 + -8 + 33 - 51, 0, 0, 0);
            }
        }
        this.aq = false;
    }

    private void a(String object) {
        object = this.getClass().getResourceAsStream((String)object);
        int n = ((byte)((InputStream)object).read() & 0xFF) + (((byte)((InputStream)object).read() & 0xFF) << 8);
        int n2 = ((InputStream)object).read();
        f = new byte[n];
        ((InputStream)object).read(f);
        ((InputStream)object).close();
        int n3 = 0;
        for (n = 0; n < n2; ++n) {
            byte by = f[n3++];
            byte by2 = f[n3++];
            byte by3 = f[n3++];
            int n4 = f[n3++];
            if (by3 == 1 && n4 < this.dK) {
                this.dK = n4;
            }
            byte by4 = f[n3++];
            i.a(by, (int)by2, 1, (byte)0, (byte)3);
            i.a(by, (int)by2, (int)by3, (byte)3, (byte)3);
            i.a(by, (int)by2, n4, (byte)6, (byte)5);
            i.a(by, (int)by2, (int)by4, (byte)11, (byte)3);
            by3 = 14;
            for (n4 = 0; n4 < by4; ++n4) {
                byte by5 = f[n3++];
                i.a(by, (int)by2, (int)by5, by3, (byte)4);
                by3 = (byte)(by3 + 4);
                by5 = f[n3++];
                i.a(by, (int)by2, (int)by5, by3, (byte)4);
                by3 = (byte)(by3 + 4);
            }
        }
        f = null;
        System.gc();
    }

    public static final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = graphics.getClipX();
        int n8 = graphics.getClipY();
        int n9 = graphics.getClipWidth();
        int n10 = graphics.getClipHeight();
        graphics.setClip(n, n2 += 15, n3, n4 += 2);
        graphics.setColor(n5);
        graphics.fillRect(n, n2, n3, n4);
        graphics.setClip(n - 3, n2, n3 + 6, n4);
        for (n5 = n2; n5 <= n2 + n4; n5 += 8) {
            graphics.drawImage(a[n6][7], n, n5, 24);
            graphics.drawImage(a[n6][5], n + n3, n5, 20);
        }
        graphics.setClip(n, n2 - 3, n3, n4 + 6);
        for (n5 = n; n5 <= n + n3; n5 += 8) {
            graphics.drawImage(a[n6][4], n5, n2, 36);
            graphics.drawImage(a[n6][6], n5, n2 + n4, 20);
        }
        graphics.setClip(n - 3, n2 - 3, n3 + 6, n4 + 6);
        graphics.drawImage(a[n6][0], n, n2, 40);
        graphics.drawImage(a[n6][1], n + n3, n2, 36);
        graphics.drawImage(a[n6][2], n, n2 + n4, 24);
        graphics.drawImage(a[n6][3], n + n3, n2 + n4, 20);
        graphics.setClip(n7, n8, n9, n10);
    }

    public static final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        n = graphics.getClipX();
        n2 = graphics.getClipY();
        n3 = graphics.getClipWidth();
        n5 = graphics.getClipHeight();
        i.a(graphics, 6, 126, 306, n4, 73, 1);
        i.a(graphics, 16, 121 - n8, n7, n8, 73, 1);
        graphics.setClip(13, 124, n7 + 6, 3);
        graphics.setColor(73);
        graphics.fillRect(13, 124, n7 + 6, 3);
        graphics.drawImage(a[1][3], 16, 124, 24);
        graphics.drawImage(a[1][2], n7 + 16, 124, 20);
        graphics.setClip(n, n2, n3, n5);
    }

    private void aA() {
        int n;
        int n2;
        String string;
        Graphics graphics;
        h h2;
        if (this.n == this.en && !this.av) {
            return;
        }
        if (this.n != this.en) {
            this.av = true;
        }
        this.a.setClip(0, 0, 320, 240);
        if (this.av) {
            this.a(this.a, true);
            this.a.setColor(0);
            this.a.fillRect(0, 0, 320, a.b);
            this.a.setColor(0xFFFFFF);
            this.a.drawLine(0, a.b, 320, a.b);
            b.b(this.a, a[63], 160, 9, 17);
            i.a(this.a, 10, 15, 300, 82, 4273165, 0);
            if (this.o != -1) {
                a.a(this.a, i.a(this.a, 280), 160, 223, 17);
            }
            if (this.aa) {
                this.aa = false;
                a.b(this.a, this.a, 160, 143, 1);
            }
            a.a(this.a, this.g, 160, 208, 17);
            this.I();
            this.J();
            this.av = false;
        }
        if (this.n != this.en) {
            this.a.setColor(4273165);
            this.a.fillRect(20, 37 + (this.en >= 0 ? this.en : this.n) * 20 + 2, 7, 9);
        }
        a[17].a(this.a, 14, 20, 37 + this.n * 20 + 2, 0, 0, 0);
        i.a(this.a, 10, 110, 300, 60, 4273165, 0);
        if (this.o != -1) {
            String string2 = a[47] + " " + this.d.toString() + "\n" + a[27];
            h2 = a;
            graphics = this.a;
            string = string2;
        } else {
            h2 = a;
            graphics = this.a;
            string = this.a;
        }
        h2.a(graphics, string, 160, 162, 1);
        int n3 = 0;
        for (int i2 = 0; i2 < 4; ++i2) {
            n3 = 37 + i2 * 20;
            a[46].a(this.a, i2 + 0, 27, n3, 0, 0, 0);
            a.b(this.a, a[i2 + 120], 53, n3 + 8, 0);
        }
        Image[] imageArray = i.a[0].a[0];
        n3 = imageArray[11].getWidth();
        int n4 = imageArray[15].getWidth();
        this.a.drawImage(imageArray[11], 140, 127, 0);
        for (n2 = 0; n2 < 8; ++n2) {
            n = n2 >= 4 ? 13 : 15;
            this.a.drawImage(imageArray[n], n3 + 140, 127, 0);
            n3 += n4;
        }
        n2 = this.n;
        n = n3;
        n3 -= n4 << 2;
        for (int i3 = 0; i3 <= n2; ++i3) {
            this.a.drawImage(imageArray[15], n3 + 140, 127, 0);
            n3 += n4;
        }
        this.a.drawImage(imageArray[17], n + 140, 127, 0);
        if (this.n != this.en) {
            this.en = this.n;
        }
    }

    private void p(int n) {
        this.a.b(n);
    }

    /*
     * Unable to fully structure code
     */
    private void aB() {
        if (this.aR != 2) {
            return;
        }
        var1_1 = this.a;
        var1_1.setColor(0, 0, 0);
        var1_1.fillRect(0, 0, 320, 240);
        var2_2 = -17;
        var4_4 = this.ep;
        v0 = var5_6 = this.eo >= 272 ? -(this.eo % 17) : 272 - this.eo - 17;
        for (var3_3 = this.ep; var3_3 < i.s.length && var2_2 < 272; ++var3_3) {
            if (i.s[var3_3] != 10) continue;
            h.a(0xFFFFFF);
            v1 = var4_4;
            v2 = var3_3 - var4_4;
            var4_4 = 314;
            var4_4 = 0;
            var4_5 = null;
            var10_11 = var2_2 + var5_6;
            var9_10 = v2;
            var8_9 = v1;
            var7_8 = i.a;
            var6_7 = i.s;
            var4_5 = var1_1;
            var11_12 = var7_8.a.getHeight();
            var12_13 = 0;
            var13_14 = var10_11;
            var14_15 = var10_11 != -1;
            var15_16 = h.c;
            var16_17 = var8_9;
            var17_18 = true;
            var18_19 = var8_9;
            var19_20 = 0;
            for (var20_21 = var8_9; var20_21 <= var8_9 + var9_10; ++var20_21) {
                block16: {
                    var21_22 = 10;
                    if (var20_21 < var8_9 + var9_10) {
                        var21_22 = var6_7[var20_21] & 255;
                    }
                    if (var17_18 && var12_13 > 314) {
                        var12_13 = var19_20;
                        var6_7[var18_19] = 10;
                        var20_21 = var18_19 - 1;
                        continue;
                    }
                    if (var21_22 == 10) {
                        if (var17_18 && var14_15) {
                            var12_13 = 160 - (var12_13 >> 1);
                            var20_21 = var16_17 - 1;
                        } else {
                            var12_13 = 0;
                            var16_17 = var20_21 + 1;
                            var13_14 += var11_12;
                            var11_12 = var7_8.a.getHeight();
                        }
                        if (!var14_15) continue;
                        var17_18 = var17_18 == false;
                        continue;
                    }
                    if (var21_22 <= 32) break block16;
                    v3 = var6_7[var20_21];
                    ** GOTO lbl68
                }
                if (var21_22 == 32) {
                    var18_19 = var20_21;
                    var19_20 = var12_13;
                    v4 = var12_13;
                    v5 = (var7_8.a[0] & 255) + var7_8.b[1];
                } else {
                    if (var21_22 == 1) {
                        h.c = var6_7[++var20_21];
                        continue;
                    }
                    if (var21_22 != 2) continue;
                    v3 = var21_22 = var6_7[++var20_21] & 255;
lbl68:
                    // 2 sources

                    if (v3 >= 89) {
                        if (!var17_18 && var14_15) {
                            var7_8.b(var4_5, "" + (char)var21_22, var12_13, var13_14 + 10, 0);
                        }
                        v4 = var12_13;
                    } else {
                        if (!var17_18 && var14_15) {
                            var7_8.b(var4_5, "" + (char)var21_22, var12_13, var13_14 + 10, 0);
                        }
                        v4 = var12_13;
                    }
                    v5 = var7_8.a.charWidth((char)var21_22);
                }
                var12_13 = v4 + v5;
            }
            h.c = var15_16;
            var13_14 - var10_11;
            var2_2 += 17;
            var4_4 = var3_3 + 1;
        }
        var2_2 = 0;
        for (var3_3 = 6; var3_3 > 0; --var3_3) {
            var1_1.setColor(0);
            var1_1.fillRect(0, var2_2, 320, var3_3);
            var1_1.fillRect(0, 240 - var2_2 - var3_3, 320, var3_3);
            var2_2 += var3_3 + 1;
        }
        this.I();
    }

    private static String[] b() {
        String[] stringArray = new String[16];
        int n = 1;
        for (int i2 = 0; i2 < 15; ++i2) {
            String string;
            if (i2 < 11) {
                try {
                    string = a[66];
                    if (string.indexOf("%U") == -1 || string.length() == 1) {
                        stringArray[i2] = string;
                        continue;
                    }
                    stringArray[i2] = d.a(string, "%U", "" + (i2 + 1));
                }
                catch (Exception exception) {
                    stringArray[i2] = "E";
                }
                continue;
            }
            try {
                String string2;
                int n2;
                String[] stringArray2;
                string = a[62];
                if (string.indexOf("%U") == -1 || string.length() == 1) {
                    stringArray2 = stringArray;
                    n2 = i2;
                    string2 = string;
                } else {
                    stringArray2 = stringArray;
                    n2 = i2;
                    string2 = d.a(string, "%U", "" + n);
                }
                stringArray2[n2] = string2;
                ++n;
                continue;
            }
            catch (Exception exception) {
                stringArray[i2] = "E";
            }
        }
        try {
            stringArray[15] = a[31];
        }
        catch (Exception exception) {
            stringArray[15] = " ";
        }
        return stringArray;
    }

    private void a(String string, int n, int n2, int n3, int n4, int n5) {
        this.n = System.currentTimeMillis();
        eq = 5000;
        this.er = -1;
        this.es = -1;
        this.h = i.a(string, 300);
        this.et = n4;
        this.eu = 0;
    }

    private void d(boolean bl) {
        eq = 0;
        this.av = true;
    }

    private static String a(String charSequence, int n) {
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        charSequence = new StringBuffer((String)charSequence);
        for (int i2 = 0; i2 <= ((StringBuffer)charSequence).length(); ++i2) {
            int n6;
            int n7 = 10;
            if (i2 < ((StringBuffer)charSequence).length()) {
                n7 = ((StringBuffer)charSequence).charAt(i2) & 0xFF;
            }
            if (n2 > n && n3 != n5) {
                n2 = n4;
                ((StringBuffer)charSequence).setCharAt(n3, '\n');
                i2 = n3 - 1;
                n5 = n3;
                continue;
            }
            if (n7 == 10) {
                n6 = 0;
            } else {
                if (n7 > 32) {
                    if (n7 != 64) continue;
                    n2 += 14;
                    continue;
                }
                if (n7 != 32) continue;
                n3 = i2;
                n4 = n2;
                n6 = n2 + (h.a() + (h.a() << 1));
            }
            n2 = n6;
        }
        return ((StringBuffer)charSequence).toString();
    }

    private static void aC() {
        b = new h(0);
        a = new h(8);
    }

    static {
        b = 0;
        m = 0;
        g = new byte[]{0, 0, -1, 0, 1, 0, 0, 0, 0, 1, 0, -1, 0, 0, 0, 0};
        h = new byte[]{0, 3, 4, 1, 2, 5, 6};
        i = null;
        j = null;
        a = null;
        p = null;
        a = false;
        d = "more_games_url";
        d = null;
        b = null;
        cC = 0;
        cD = 0;
        cE = -1;
        cF = -1;
        cG = -1;
        cH = -1;
        e = null;
        cM = 0;
        cN = 0;
        cO = 0;
        V = false;
        W = true;
        s = 0;
        b = new int[]{512, 16384, 131072, 131072, 4096};
        de = 0;
        df = 0;
        dg = 0;
        q = new byte[16];
        r = new byte[16];
        ak = false;
        a = new long[15];
        b = new long[15];
        a = new short[][]{{0, 16, 1, 40, 6, 44, 3, 18, 5, 22}, {0, 50, 1, 49, 6, 18, 3, 28, 4, 36, 5, 22}, {0, 1, 1, 4, 2, 64, 3, 63}, new short[0], new short[0], new short[0], {0, 50, 4, 36}, {0, 24, 1, 25}, {0, 44, 1, 22}};
        d = new int[]{1, 4, 64};
        g = new int[][]{{1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14, 15}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}};
        b = false;
        s = null;
        d = new String[]{"/w0.bin", "/w1.bin", "/w2.bin"};
        eq = 0;
    }
}
