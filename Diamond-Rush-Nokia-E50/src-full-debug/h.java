/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.rms.RecordStore;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class h
extends GameCanvas
implements Runnable {
    public static h a;
    public int a;
    public int b;
    public boolean a;
    public boolean b;
    public int c;
    public int d;
    public String a;
    public boolean c;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public String b;
    public String c;
    public int j;
    public boolean d;
    public boolean e;
    public byte a;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public static boolean[] a;
    public int r;
    public static boolean[] b;
    public boolean f;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public boolean g;
    public int A;
    public int B;
    public int C;
    public int D = 0;
    public int E = 0;
    public int F;
    public int G;
    public int H;
    public boolean h;
    public boolean i;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public byte b;
    public byte c;
    public byte d;
    public byte e;
    public byte f;
    public byte g;
    public boolean j;
    public int P;
    public int Q;
    public int R;
    public static byte[] a;
    public static byte[] b;
    public static byte[] c;
    public int S;
    public int T;
    public byte h;
    public static boolean k;
    public int U;
    public int V = 0;
    public static int W;
    public boolean l;
    public boolean m;
    public int X;
    public int Y;
    public static byte[] d;
    public byte i = 0;
    public int Z;
    public int aa;
    public int ab;
    public int ac;
    public boolean n;
    public int ad;
    public int ae;
    public int af;
    public int ag;
    public int ah;
    public int ai;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int aj;
    public int ak;
    public static byte[] e;
    public int al;
    public int am;
    public int an;
    public byte j;
    public byte k;
    public int ao;
    public int ap;
    public int aq;
    public int ar;
    public int as;
    public int at;
    public int au;
    public int av;
    public int aw;
    public int ax;
    public int ay;
    public int az;
    public int aA;
    public int aB;
    public int aC;
    public int aD;
    public int aE;
    public int aF;
    public int aG;
    public int aH;
    public int aI;
    public int aJ;
    public int aK;
    public int aL;
    public static byte l;
    public int aM;
    public static byte m;
    public boolean s;
    public static int aN;
    public static int aO;
    public long a;
    public boolean t;
    public int aP;
    public int aQ;
    public int aR;
    public int aS;
    public int aT;
    public boolean u;
    public int aU;
    public int aV;
    public boolean v;
    public byte n;
    public int aW;
    public long b;
    public int aX;
    public int aY = 0;
    public int aZ;
    public int ba = 0;
    public int bb;
    public int bc;
    public int bd;
    public int be;
    public int bf;
    public byte o;
    public int bg;
    public int bh;
    public int bi;
    public int bj;
    public int bk;
    public int bl;
    public int bm = -1;
    public boolean w;
    public int bn;
    public String d;
    public boolean x;
    public int bo;
    public int bp;
    public int bq;
    public int br;
    public int bs;
    public int bt;
    public int bu;
    public int bv;
    public int bw;
    public int bx;
    public int by;
    public int bz;
    public int bA;
    public int bB;
    public int bC;
    public boolean y;
    public int bD = 0;
    public int bE;
    public int bF;
    public int bG;
    public int bH;
    public int bI;
    public int bJ;
    public int bK;
    public int bL;
    public int bM;
    public int bN;
    public int bO;
    public int bP;
    public int bQ;
    public int bR;
    public int bS;
    public int bT;
    public int bU;
    public int bV;
    public int bW = 0;
    public int bX = 0;
    public int bY = 0;
    public int bZ = 0;
    public int ca = 0;
    public int cb = 0;
    public boolean z;
    public int cc;
    public int cd;
    public InputStream a;
    public byte p;
    public byte q;
    public boolean A;
    public int ce;
    public int cf;
    public int cg;
    public int ch;
    public Graphics a;
    public static Image a;
    public static Image b;
    public static Image[][] a;
    public static Image[][] b;
    public static a[] a;
    public static a a;
    public static byte[] f;
    public static g[] a;
    public static a b;
    public static byte[] g;
    public static byte[] h;
    public long c;
    public long d;
    public boolean B = false;
    public static byte[] i;
    public static byte[] j;
    public static int[][] a;
    public static int[][] b;
    public static byte[][] a;
    public static byte[][] b;
    public static byte[][] c;
    public static byte[] k;
    public boolean C = -1;
    public int ci;
    public int cj;
    public int ck;
    public int cl;
    public static byte[] l;
    public static byte[] m;
    public static int cm;
    public static int cn;
    public static byte[] n;
    public static int[][] c;
    public static int[][] d;
    public static byte[][] d;
    public static byte[][] e;
    public static byte[] o;
    public c a;
    public static c[] a;
    public static byte[] p;
    public final Thread a;
    public static GloftDIRU a;
    public int co = -1;
    public int cp = -1;
    public int cq;
    public int cr;
    public int cs;
    public static a c;
    public int ct;
    public byte r;
    public static boolean D;
    public static long e;
    public static boolean E;
    public static int cu;
    public long f;
    public long g;
    public long h = false;
    public static long i;
    public boolean F = false;
    public boolean G = false;
    public boolean H = false;
    public boolean I = false;
    public boolean J = false;
    public boolean K = false;
    public boolean L = false;
    public boolean M = false;
    public boolean N = false;
    public int cv = -1;
    public int cw;
    public int cx;
    public boolean O = 0;
    public boolean P = false;
    public int cy;
    public int cz;
    public boolean Q = false;
    public boolean R = false;
    public int cA;
    public int cB;
    public boolean S;
    public boolean T;
    public int cC;
    public static Image c;
    public static Graphics b;
    public static int cD;
    public static int cE;
    public static int cF;
    public static int cG;
    public static int cH;
    public static int cI;
    public int cJ;
    public int cK;
    public int cL;
    public int cM;
    public static Image d;
    public static int cN;
    public static int cO;
    public static int cP;
    public int cQ = -1;
    public int cR = -1;
    public int cS = -1;
    public int cT = -1;
    public int cU = -1;
    public int cV = -1;
    public int cW = -1;
    public boolean U = true;
    public long j = 0;
    public int cX;
    public int cY;
    public int cZ;
    public int da = 2;
    public int db = 0;
    public int dc;
    public int dd = 3;
    public int de = -1;
    public long k = 0L;
    public int df = -1;
    public static Image e;
    public static boolean V;
    public static boolean W;
    public long l = 0L;
    public static boolean X;
    public boolean Y;
    public boolean Z = 0;
    public boolean aa;
    public boolean ab;
    public boolean ac = false;
    public int dg = 0;
    public int[] a;
    public static byte s;
    public static final int[] b;
    public static int dh;
    public static int di;
    public static int dj;
    public byte t = 10;
    public byte u = 10;
    public boolean ad = false;
    public static byte[] q;
    public static byte[] r;
    public long m = 0L;
    public boolean ae;
    public int dk = 0;
    public boolean af;
    public long n = 0L;
    public long o = 0L;
    public boolean ag = false;
    public boolean ah = false;
    public long p = false;
    public boolean ai;
    public boolean aj;
    public boolean ak;
    public boolean al = false;
    public String e = true;
    public int dl = 0;
    public int dm;
    public int dn;
    public int do;
    public static boolean am;
    public static int dp;
    public static int dq;
    public static int dr;
    public static int ds;
    public e a = null;
    public boolean an = false;
    public boolean ao = true;
    public int dt = -1;
    public int du;
    public int dv;
    public byte v = 0;
    public int dw;
    public int dx;
    public int dy;
    public int dz;
    public int dA;
    public byte w = 0;
    public int dB;
    public int dC = -1;
    public byte x = 0;
    public byte y = 0;
    public int dD;
    public int dE;
    public int dF;
    public byte z = 0;
    public int dG;
    public int dH;
    public int dI;
    public byte A = false;
    public int dJ;
    public int dK;
    public static a d;
    public static int[][] e;
    public static long[] a;
    public static long[] b;
    public static int[][] f;
    public static long[] c;
    public static long[] d;
    public static boolean ap;
    public int dL;
    public int dM;
    public static long[][] a;
    public static StringBuffer a;
    public static StringBuffer b;
    public static StringBuffer c;
    public static Image f;
    public static Graphics c;
    public int dN = 100;
    public int dO;
    public int dP;
    public int dQ;
    public int dR;
    public int dS;
    public int dT;
    public int dU;
    public int dV;
    public int dW;
    public int dX;
    public boolean aq = true;
    public boolean ar;
    public int dY;
    public int dZ;
    public int ea;
    public int eb;
    public static int ec;
    public int ed;
    public int ee;
    public int ef;
    public int eg;
    public int eh;
    public int ei;
    public int ej;
    public int ek;
    public boolean as = true;
    public boolean at = true;
    public boolean au = true;
    public int[] c = 1;
    public int el;
    public int em;
    public int en = 2;
    public int eo;
    public int ep = 2;
    public boolean av;
    public boolean aw = true;
    public boolean ax = true;
    public long q = 0L;
    public int eq = -1;
    public String f = false;
    public StringBuffer d = false;
    public boolean ay = true;
    public boolean az = true;
    public static int er;
    public static Player[] a;
    public static Player a;
    public static byte[][] f;
    public static int[] d;
    public static int es;
    public static int[] e;
    public static int et;
    public static boolean aA;
    public static ByteArrayInputStream a;
    public InputStream b = 1;
    public byte[] s = false;
    public int eu;
    public int ev;
    public static final short[][] a;
    public static final int[] f;
    public static final int[][] g;
    public static String[] a;
    public static byte[] t;
    public static final String[] b;
    public static int ew;
    public long r = 0;
    public String g = 0;
    public int ex;
    public int ey;
    public int ez;
    public int eA;

    public h(GloftDIRU gloftDIRU) {
        super(false);
        this.h = this.f;
        this.i = this.g;
        this.d = (byte)3;
        this.e = (byte)3;
        this.f = (byte)2;
        this.a = new int[]{0, 0, 0, 0, 0};
        this.x = (byte)3;
        this.d = new StringBuffer();
        this.r = System.currentTimeMillis();
        a = this;
        this.ay = -1;
        this.aA = -1;
        this.aC = -1;
        a = new g[6];
        a = new a[61];
        this.cj();
        a = new Image[33][];
        b = new Image[2][];
        a = gloftDIRU;
        k = false;
        this.setFullScreenMode(true);
        this.C();
        this.a = new Thread(this);
        this.a.start();
    }

    private void a(int n, int n2, int n3) {
        this.aA = -1;
        this.aD = -1;
        this.aC = -1;
        g g2 = a[(this.aS & 0x4000) == 0 ? 0 : 3];
        int n4 = g2.f;
        if (n4 == 40) {
            return;
        }
        if (n4 == 48) {
            return;
        }
        if (n4 == 47) {
            return;
        }
        if (this.b <= 0L && this.aW == 0 && this.bi == 0 && this.k != 6 && (this.aS & 0x70) == 0 || this.aT > 0) {
            ++this.bc;
            this.a((byte)(this.n - n));
            if (this.bl == 0 && this.n == 0) {
                this.n = 0L;
                this.co = this.bE;
                this.cp = this.bF;
                c = null;
            }
            this.aS = this.aS & 0xFFFFFF8F | n2;
            this.E(5);
            switch (n2) {
                case 16: {
                    this.ak = 0;
                    this.aj = 0;
                    this.aT = 5;
                    h.a[this.aP][this.aQ] = 9;
                    this.aS = this.aS & 0xFFFFFF8F | 0;
                    h.b[this.aP][this.aQ] = 0x8400000;
                    h.c[this.aP][this.aQ] = 24;
                    return;
                }
                case 64: {
                    this.o(1000);
                    return;
                }
            }
            this.o(10);
            if (n3 != 0) {
                byte by = (byte)n3;
                do {
                    int n5;
                    int n6;
                    if (a[n6 = this.aP - g[by]][n5 = this.aQ - g[by + 8]] >= 0 || (byte)(a[n6][n5] & 0xFF) >= 0) continue;
                    this.aP = n6;
                    this.aQ = n5;
                    this.aR = 18;
                    this.j = 0;
                    this.aS = this.aS & 0xFFFFFFF8 | by | 0x800;
                    return;
                } while ((by = by >= 4 ? (byte)1 : (byte)(by + 1)) != n3);
            }
        }
    }

    private void a(byte by) {
        block4: {
            byte by2;
            block3: {
                h h2;
                block2: {
                    this.n = by;
                    if (this.n > 0) break block2;
                    h2 = this;
                    by2 = 0;
                    break block3;
                }
                if (this.n <= i[8]) break block4;
                h2 = this;
                by2 = i[8];
            }
            h2.n = by2;
        }
        this.C();
    }

    public final void a(int n) {
        this.bp = this.bo;
        this.x = false;
        this.bq = 0;
        this.bo = n;
        this.cX = 0;
        if (n >= 0) {
            this.am();
        }
    }

    public static boolean a(int n) {
        return (W & n) != 0;
    }

    public final void keyPressed(int n) {
        int n2 = h.g(n);
        this.b = false;
        System.out.println("keyPressed:" + (W |= n2));
    }

    public final void keyReleased(int n) {
        if (h.g(n) != 32) {
            W &= ~h.g(n);
            this.b = true;
        } else {
            cu = n;
            e = System.currentTimeMillis();
            E = true;
        }
        System.out.println("keyReleased:" + W);
    }

    private void c(int n) {
        this.b = true;
        System.out.println("keyRealReleased:" + (W &= ~h.g(n)));
    }

    private void h() {
        this.a = System.currentTimeMillis();
        aN = 0;
        aO = 0;
        this.Z = 0;
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
        this.a = System.currentTimeMillis();
        this.h();
        this.I();
        while (!this.z) {
            try {
                Thread.yield();
                if (this.ag) continue;
                this.f = System.currentTimeMillis();
                try {
                    this.i();
                }
                catch (Exception exception) {
                    Exception exception2 = exception;
                    exception.printStackTrace();
                    h.a(5000L);
                }
                if (this.z) break;
                if (l != 2) {
                    ++aN;
                }
                this.g = System.currentTimeMillis();
                if (this.h > 65L) {
                    h.a(100L - this.h - this.g);
                    this.t = true;
                    this.h = 0L;
                    continue;
                }
                this.repaint();
                this.serviceRepaints();
                if (System.currentTimeMillis() - i > 1000L) {
                    i = System.currentTimeMillis();
                }
                this.t = false;
                if (l != 2) {
                    ++aO;
                }
                this.h = Math.abs(System.currentTimeMillis() - this.f);
                h.a(50L - (System.currentTimeMillis() - this.f));
            }
            catch (Exception exception) {
                h.a(this.getGraphics(), exception.toString());
                this.flushGraphics();
                exception.printStackTrace();
            }
        }
        this.B();
        this.g();
        a.a();
    }

    private void i() throws Exception {
        this.cP();
        this.aR();
        switch (l) {
            case 36: {
                this.cL();
                return;
            }
            case 22: {
                this.cM();
                return;
            }
            case 21: {
                this.C(this.bs++);
                this.h();
                return;
            }
            case 20: {
                if (aN <= 30) break;
                this.A = true;
                this.J = true;
                this.H = true;
                this.cu();
                return;
            }
            case 35: {
                this.r(this.bs++);
                this.h();
                if (this.bs != 12) break;
                l = (byte)17;
                this.aM = 0;
                this.E(15);
                return;
            }
            case 17: {
                this.bj();
                return;
            }
            case 31: {
                return;
            }
            case 16: {
                this.B = true;
                this.u();
                W = 0;
                return;
            }
            case 0: {
                h.a[0] = new g(h.a("/ui.f", 0), 0, 0, null);
                a[0].a(0);
                l = (byte)6;
                this.h();
                return;
            }
            case 6: {
                if (aN < 60) {
                    a[0].b();
                    return;
                }
                a = h.a("/lang.f", 126);
                h.cR();
                h.a[18] = h.a("/ui.f", 3);
                this.B();
                this.a(3);
                l = (byte)7;
                return;
            }
            case 7: {
                if (!this.x) break;
                l = (byte)8;
                this.bs = 0;
                this.br = 32;
                return;
            }
            case 1: {
                this.bf();
                return;
            }
            case 3: {
                this.z = true;
                return;
            }
            case 9: {
                try {
                    if ((j[0] & 1) == 0) {
                        this.an = true;
                    }
                    this.G();
                    int n = this.br == 8 ? this.bs : this.bs - 24;
                    this.n(n);
                    ++this.bs;
                    this.Z = true;
                    if (++n == 8) {
                        if (this.F) {
                            l = (byte)4;
                            if (this.bo == -1) {
                                this.aM = 0;
                                this.a(0);
                            } else {
                                this.aM = 2;
                            }
                        } else {
                            l = (byte)30;
                            this.F = true;
                        }
                        this.E(19);
                    }
                }
                catch (Exception exception) {}
                this.h();
                return;
            }
            case 11: {
                this.J = true;
                this.H = true;
                l = (byte)5;
                this.R = true;
                this.h();
                return;
            }
            case 5: {
                if (this.B && this.bs <= 5) {
                    int n;
                    this.l(this.bs++);
                    for (n = 0; n < 3; ++n) {
                        h.b[n] = false;
                    }
                    for (n = 1; n < 3; ++n) {
                        h.a[n] = false;
                    }
                    this.h();
                    if (this.bs == 5) {
                        this.N = true;
                        this.M = true;
                        this.L = true;
                        this.ap = 0;
                        this.aq = 13;
                        W = 0;
                    }
                } else {
                    this.p();
                }
                this.h();
                return;
            }
            case 8: {
                this.e(this.bs++);
                this.h();
                return;
            }
            case 2: 
            case 12: {
                return;
            }
            case 15: {
                this.n();
                return;
            }
            case 27: {
                this.o();
                return;
            }
            case 28: {
                try {
                    this.d(this.bs);
                    ++this.bs;
                    if (this.bs == 11) {
                        l = (byte)27;
                    }
                }
                catch (Exception exception) {}
                this.h();
                return;
            }
            case 29: {
                this.k();
            }
        }
    }

    private void j() {
        block9: {
            int n;
            block8: {
                h h2;
                block7: {
                    block6: {
                        int n2;
                        block5: {
                            h h3;
                            block4: {
                                if (this.O < this.d) break block4;
                                h3 = this;
                                n2 = -1;
                                break block5;
                            }
                            if (this.O > -this.d) break block6;
                            h3 = this;
                            n2 = 1;
                        }
                        h3.b = (byte)n2;
                    }
                    this.O += this.b * this.f;
                    if (this.N < this.e) break block7;
                    h2 = this;
                    n = -1;
                    break block8;
                }
                if (this.O > -this.e) break block9;
                h2 = this;
                n = 1;
            }
            h2.c = (byte)n;
        }
        this.N += this.c * this.g;
    }

    private void k() {
        switch (this.L) {
            case 0: {
                if (System.currentTimeMillis() - this.a < 3000L) break;
                ++this.L;
                this.h();
                return;
            }
            case 1: {
                boolean bl;
                h h2;
                if (aN % 6 >= 3) {
                    this.M += 0x199999;
                    h2 = this;
                    bl = false;
                } else {
                    h2 = this;
                    bl = h2.ay = true;
                }
                if (System.currentTimeMillis() - this.a < 5000L) break;
                ++this.L;
                this.ay = true;
                this.h();
                return;
            }
            case 2: {
                this.j();
                if (System.currentTimeMillis() - this.a < 10000L) break;
                this.N = 0;
                this.O = 0;
                this.h();
                ++this.L;
                return;
            }
            case 3: {
                if (System.currentTimeMillis() - this.a < 1000L) break;
                ++this.L;
                return;
            }
            case 4: {
                if (System.currentTimeMillis() - this.a < 1000L) break;
                ++this.L;
                return;
            }
            case 5: {
                if (System.currentTimeMillis() - this.a < 1000L) break;
                ++this.L;
                return;
            }
            case 6: {
                if (System.currentTimeMillis() - this.a < 1000L) break;
                ++this.L;
                this.h();
                return;
            }
            case 7: {
                if (System.currentTimeMillis() - this.a < 1000L) break;
                b.a = new byte[12][13];
                ++this.L;
                b.b(3);
                this.E(19);
                this.h();
                return;
            }
            case 8: {
                b.a(3);
                this.ay = true;
                if (System.currentTimeMillis() - this.a < 15000L) break;
                ++this.L;
                this.h();
                return;
            }
            case 9: {
                this.ay = true;
                b.a(3);
                if (System.currentTimeMillis() - this.a < 12000L) break;
                ++this.L;
                this.h();
                return;
            }
            case 10: {
                this.B();
                this.a(0);
                l = (byte)22;
                this.aM = 0;
                this.cK();
            }
        }
    }

    private void l() {
        this.G = false;
        h.a(a[17], true);
        h.a[17] = null;
        int n = e.a.length;
        for (int i = 0; i < n; ++i) {
            e.a[i] = null;
        }
        e.a = null;
        h.a(a[10], true);
        h.a[10] = null;
        h.a(a[46], true);
        h.a[46] = null;
        h.a(a[55], true);
        h.a[55] = null;
        h.a[8] = null;
        h.a(a[59], true);
        h.a[3] = null;
        h.a(a[17], true);
        h.a[17] = null;
        System.gc();
    }

    /*
     * Unable to fully structure code
     */
    private void d(int var1_1) {
        switch (var1_1) {
            case 0: {
                if (!this.K) break;
                this.A();
                return;
            }
            case 1: {
                if (!this.H) break;
                this.ct();
                return;
            }
            case 2: {
                if (!this.M) break;
                this.L();
                return;
            }
            case 3: {
                if (!this.L) break;
                System.gc();
                this.L = false;
                return;
            }
            case 4: {
                this.B();
                e.a = h.a("/demoui.f", 0);
                if (h.a[10] == null) {
                    h.a[10] = h.a("/mmv.f", 0);
                }
                if (h.a[46] == null) {
                    h.a[46] = h.a("/mmv.f", 5);
                }
                this.o = 240 - h.c(h.a[10], 0) >> 1;
                this.p = 320 - h.b(h.a[10], 0) - 48 >> 1;
                return;
            }
            case 5: {
                if (h.a[55] == null) {
                    h.a[55] = h.a("/mmv.f", 4);
                    this.m = h.a(h.a[55], 0);
                    h.b = h.a[55];
                }
                if (h.a[18] != null) break;
                h.a[18] = h.a("/ui.f", 3);
                return;
            }
            case 6: {
                if (h.a[54] == null) {
                    h.a[54] = h.a("/mmv.f", 1);
                }
                this.v = h.c(h.a[54], 0) >> 1;
                this.w = h.b(h.a[54], 0) >> 1;
                return;
            }
            case 7: {
                if (h.a[53] != null) break;
                h.a[53] = h.a("/mmv.f", 2);
                return;
            }
            case 8: {
                if (h.a[52] != null) break;
                h.a[52] = h.a("/mmv.f", 3);
                return;
            }
            case 9: {
                try {
                    var2_2 = h.a("/" + 0 + ".f", 3, 0);
                    h.a[8] = var2_2.a[0];
                    var2_2 = h.a("/cm.f", 2, 0);
                    var2_2.a(0, 0, -1, -1);
                    var2_2.a(1, 0, 0, -1);
                    h.a[59] = var2_2;
                    b.b = var2_2.a[0].length;
                    var2_2.g = null;
                    if (h.a[17] == null) {
                        h.a[17] = h.a("/ms.f", 0);
                    }
                    return;
                }
                catch (Exception v0) {
                    return;
                }
            }
            case 10: {
                if (h.a[9] == null) {
                    h.a[9] = h.a("/cm.f", 7);
                }
                this.y = h.a(h.a[9], 5);
                var2_3 = h.i[2];
                for (var3_4 = 0; var3_4 < 3; ++var3_4) {
                    if ((var2_3 & 1 << var3_4) == 0) continue;
                    h.b[var3_4] = true;
                }
                this.t = 10;
                this.u = 10;
                var2_3 = h.i[1];
                if ((var2_3 & 1) != 0) {
                    v1 = h.a;
                    v2 = 1;
                    v3 = true;
                } else {
                    var3_4 = h.a(h.i, 6);
                    if (var3_4 >= f.b[1]) {
                        h.i[1] = (byte)(h.i[1] | 1);
                        this.H();
                        this.q = 1;
                        this.e = 1;
                    } else {
                        v1 = h.a;
                        v2 = 1;
                        v3 = v1[v2] = false;
                    }
                }
                if ((var2_3 & 2) == 0) ** GOTO lbl98
                v4 = h.a;
                v5 = 2;
                v6 = true;
                ** GOTO lbl108
lbl98:
                // 1 sources

                var3_4 = h.a(h.i, 6);
                if (var3_4 >= f.b[2]) {
                    h.i[1] = (byte)(h.i[1] | 2);
                    this.H();
                    this.q = 2;
                    this.e = 2;
                } else {
                    v4 = h.a;
                    v5 = 2;
                    v6 = false;
lbl108:
                    // 2 sources

                    v4[v5] = v6;
                }
                this.f = f.d[this.e << 1];
                this.g = f.d[(this.e << 1) + 1];
                this.h = this.f;
                this.i = this.g;
                this.m();
                this.e = true;
                this.ay = true;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void m() {
        if (this.e == 3) {
            v0 = this;
            v1 = new StringBuffer();
            v2 = h.a[92];
        } else {
            var1_1 = h.b(this.e);
            if (var1_1) {
                v0 = this;
                v1 = new StringBuffer();
                v2 = h.a[92];
            } else {
                v0 = this;
                v1 = new StringBuffer().append(f.b[this.e]).append(" ");
                v2 = h.a[124].toLowerCase();
            }
        }
        v0.b = v1.append(v2).append(" ").append(h.a[89]).toString();
        switch (this.e) {
            case 0: {
                v3 = this;
                v4 = h.a;
                v5 = 28;
                ** GOTO lbl36
            }
            case 1: {
                v3 = this;
                v4 = h.a;
                v5 = 29;
                ** GOTO lbl36
            }
            case 2: {
                v3 = this;
                v4 = h.a;
                v5 = 30;
                ** GOTO lbl36
            }
            case 3: {
                v3 = this;
                v4 = h.a;
                v5 = 31;
lbl36:
                // 4 sources

                v3.c = v4[v5];
            }
        }
    }

    private static boolean b(int n) {
        if (n == 0 || n == 3) {
            return true;
        }
        int n2 = h.a(i, 6);
        return n2 >= f.b[n];
    }

    /*
     * Unable to fully structure code
     */
    private void n() {
        block7: {
            block8: {
                if (this.J <= 0 && this.K <= 0) break block7;
                var1_1 = new StringBuffer();
                if (this.J <= 0) break block8;
                var1_1.append(h.a[102]).append("\n");
                switch (this.J) {
                    case 1: {
                        var1_1.append(h.a[29]);
                        v0 = 2;
                        v1 = h.i;
                        v2 = h.i[2];
                        v3 = 8;
                        ** GOTO lbl23
                    }
                    case 2: {
                        var1_1.append(h.a[30]);
                        h.i[2] = (byte)(h.i[2] | 8);
                        v0 = 2;
                        v1 = h.i;
                        v2 = h.i[2];
                        v3 = 16;
lbl23:
                        // 2 sources

                        v1[v0] = (byte)(v2 | v3);
                    }
                }
                this.H();
                this.J = 0;
            }
            if (this.K > 0) {
                if (var1_1.length() > 0) {
                    var1_1.append("\n\n");
                }
                var1_1.append(h.a[109]).append("\n").append(h.a[95 + this.K - 1]);
                this.K = 0;
            }
            if (var1_1.length() > 0) {
                this.a(var1_1.toString(), -1, -1, 5000, 4273165, 0);
            }
        }
    }

    private void o() {
        if (!this.t) {
            this.h = this.f;
            this.i = this.g;
        }
        if (this.d) {
            W = 0;
            int n = this.k - this.f;
            int n2 = this.l - this.g;
            this.f += n / (8 - this.a);
            this.g += n2 / (8 - this.a);
            this.a = (byte)(this.a + 1);
            if (this.a == 8) {
                this.f = this.k;
                this.g = this.l;
                this.d = false;
                this.a = 0;
                this.e = true;
                this.m();
                return;
            }
        } else {
            switch (this.j) {
                case -1: {
                    break;
                }
                case 4: {
                    switch (this.e) {
                        case 0: {
                            this.G = true;
                            this.H = true;
                            this.cK();
                            this.ap = 0;
                            this.j = false;
                            l = (byte)15;
                            ec = this.b(this.ap);
                            this.cu();
                            break;
                        }
                        case 1: {
                            if (!h.b(this.e)) break;
                            this.G = true;
                            this.H = true;
                            this.cK();
                            this.ap = 1;
                            this.aq = 0;
                            l = (byte)15;
                            ec = this.b(this.ap);
                            this.cu();
                            this.n = true;
                            this.j = false;
                            if (i[9] >= 1) break;
                            h.i[9] = 1;
                            break;
                        }
                        case 2: {
                            if (!h.b(this.e)) break;
                            this.G = true;
                            this.H = true;
                            this.cK();
                            this.ap = 2;
                            this.aq = 0;
                            this.j = false;
                            l = (byte)15;
                            ec = this.b(this.ap);
                            this.cu();
                            this.n = true;
                            if (i[9] >= 2) break;
                            h.i[9] = 2;
                            break;
                        }
                        case 3: {
                            l = (byte)18;
                        }
                    }
                    break;
                }
                default: {
                    int n = f.a[this.j][this.e];
                    if (n == -1) break;
                    this.e = n;
                    this.d = true;
                    this.k = f.d[this.e * 2];
                    this.l = f.d[this.e * 2 + 1];
                }
            }
            this.j = -1;
        }
    }

    private void e(int n) {
        if (n < 21) {
            if (n == 0) {
                this.cI();
            }
            this.D(n);
            if (n == 20) {
                this.cJ();
            }
            System.gc();
            return;
        }
        switch (n) {
            case 21: {
                h.a[9] = h.a("/cm.f", 7);
                return;
            }
            case 22: {
                h.a[0] = h.a("/ui.f", 2);
                return;
            }
            case 23: {
                h.b[0] = h.a("/demoui.f", 0, 0);
                h.b[1] = h.a("/demoui.f", 0, 1);
                String[] stringArray = new String[e.a];
                String[] stringArray2 = h.a("/lang_IGA.f", 21);
                int n2 = 10;
                int n3 = 0;
                while (n2 <= 16) {
                    stringArray[n3] = a.getAppProperty(stringArray2[n2]);
                    if (stringArray[n3] != null && (stringArray[n3].trim().toUpperCase().compareTo("NO") == 0 || stringArray[n3].compareTo("") == 0)) {
                        stringArray[n3] = null;
                    }
                    System.out.println("Property " + stringArray2[n2] + ": " + stringArray[n3]);
                    ++n2;
                    ++n3;
                }
                for (n2 = 0; n2 < 3; ++n2) {
                    if (stringArray[n2] != null && stringArray[n2].trim().toUpperCase().compareTo("DEL") == 0) continue;
                    X = true;
                    System.out.println("showIgp is enabled1");
                    break;
                }
                if (X) break;
                for (n2 = 3; n2 < 7; ++n2) {
                    if (stringArray[n2] != null && stringArray[n2].trim().toUpperCase().compareTo("DEL") == 0 || stringArray[n2] == null) continue;
                    X = true;
                    System.out.println("showIgp is enabled");
                    return;
                }
                break;
            }
            case 24: {
                l = (byte)9;
                this.a(-1);
                a = new StringBuffer(a[8]);
                a.delete(a.length() - 1, a.length());
                b = new StringBuffer(a[20]);
                b.delete(b.length() - 1, b.length());
                c = new StringBuffer("1");
            }
        }
    }

    public static String[] a(String string, int n) {
        byte[] byArray = h.a(string, 0);
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        String[] stringArray = new String[n];
        while (n4 < n) {
            if (byArray[n2 + n3] == 0) {
                try {
                    stringArray[n4] = new String(byArray, n2, n3, "ISO-8859-1");
                }
                catch (Exception exception) {
                    Exception exception2 = exception;
                    exception.printStackTrace();
                }
                n2 += n3 + 1;
                n3 = 0;
                ++n4;
                continue;
            }
            ++n3;
        }
        return stringArray;
    }

    /*
     * Unable to fully structure code
     */
    private void p() {
        try {
            var1_1 = this.bs;
            if (this.B) {
                var1_1 -= 5;
            }
            ++this.bs;
            switch (var1_1) {
                case 0: {
                    if (this.N) {
                        this.H();
                    }
                    return;
                }
                case 1: {
                    if (this.M) {
                        this.L();
                    }
                    return;
                }
                case 2: {
                    if (this.L) {
                        System.gc();
                        this.L = false;
                    }
                    return;
                }
                case 3: {
                    h.a[41].a(1);
                    h.a[41].a(2);
                    return;
                }
                case 4: {
                    if (this.J) {
                        this.B();
                    }
                    return;
                }
                case 5: {
                    if (this.H) {
                        this.ct();
                    }
                    return;
                }
                case 6: {
                    var2_2 = h.c();
                    if (var2_2 >= 1) ** GOTO lbl38
                    v0 = this;
                    v1 = var2_2;
                    ** GOTO lbl41
lbl38:
                    // 1 sources

                    if ((this.V + 9) % 9 >= 1) ** GOTO lbl42
                    v0 = this;
                    v1 = 1;
lbl41:
                    // 2 sources

                    v0.V = v1;
lbl42:
                    // 2 sources

                    h.B(this.V % 9);
                    return;
                }
                case 7: {
                    this.E();
                    return;
                }
                case 8: {
                    h.W();
                    this.N();
                    return;
                }
                case 9: {
                    this.bE();
                    return;
                }
                case 10: {
                    var2_3 = "/" + this.ap + ".f";
                    this.a = this.getClass().getResourceAsStream(var2_3);
                    this.cc = this.a.read();
                    h.n = new byte[this.cc << 3];
                    this.a.read(h.n);
                    return;
                }
            }
            var2_4 = var1_1 - 10 - 1;
            if (var2_4 < 4) {
                this.f(var2_4);
                this.bt = 0;
                return;
            }
            if ((var2_4 -= 4) >= 0 && var2_4 < 43) {
                this.h(var2_4);
                return;
            }
            if ((var2_4 -= 43) >= 0 && var2_4 < 8) {
                this.g(var2_4);
                if (var2_4 == 7) {
                    this.a.close();
                    this.a = null;
                    System.gc();
                }
                return;
            }
            if ((var2_4 -= 8) >= 0 && var2_4 < 16) {
                if (var2_4 < h.a.length) {
                    h.a[var2_4] = new c(this);
                    h.a[var2_4].a(h.p[var2_4]);
                }
                if (var2_4 == 15 && h.a.length >= 16) {
                    for (var3_5 = 16; var3_5 < h.a.length; ++var3_5) {
                        h.a[var3_5] = new c(this);
                        h.a[var3_5].a(h.p[var3_5]);
                    }
                }
                return;
            }
            if ((var2_4 -= 16) >= 0 && var2_4 < 3) {
                switch (this.i) {
                    case 1: {
                        this.j(var2_4);
                        if (var2_4 == 2) {
                            this.a.close();
                            this.a = null;
                        }
                        return;
                    }
                    case 3: {
                        if (var2_4 > 0) {
                            return;
                        }
                        var3_6 = h.a("/mmv.f", 1, 0);
                        h.a[31] = var3_6.a[0];
                        h.a[5] = new g(h.a("/mm1.f", 0), 0, 0, null);
                        h.a[5].a(0);
                        return;
                    }
                    case 4: {
                        if (var2_4 >= 2) {
                            return;
                        }
                        this.i(var2_4);
                        var3_7 = h.a("/mmv.f", 3, 0);
                        h.a[32] = var3_7.a[0];
                        h.a[20] = h.a("/gen0.f", 7, 0);
                        if (var2_4 == 1) {
                            this.a.close();
                            this.a = null;
                        }
                        return;
                    }
                    case 5: {
                        var3_8 = h.a("/mmv.f", 2, 0);
                        h.a[30] = var3_8.a[0];
                        h.a[20] = h.a("/gen0.f", 7, 0);
                        h.a[5] = new g(h.a("/b1.f", 0), 0, 0, null);
                        h.a[5].a(10);
                        return;
                    }
                }
                return;
            }
            switch (var2_4 -= 3) {
                case 0: {
                    h.n = null;
                    this.a(h.a[12] != null || h.a[6] != null || h.a[58] != null || this.i == 1 || this.i == 4 || this.i == 5);
                    break;
                }
                case 1: {
                    this.c = 0L;
                    this.d = 0L;
                    this.bu = 0;
                    ++this.V;
                    h.k(this.V < 3 ? this.V : 3);
                    this.H();
                    break;
                }
                case 2: {
                    h.c = new int[this.av][this.aw];
                    h.d = new byte[this.av][this.aw];
                    h.e = new byte[this.av][this.aw];
                    h.d = new int[this.av][this.aw];
                    if (h.m != null) {
                        h.o = new byte[h.m.length];
                        break;
                    }
                    ** GOTO lbl169
                }
                case 3: {
                    this.cn();
                    break;
                }
                case 4: {
                    this.bl = 0;
                    this.T = 0;
                    this.S = 0;
                    this.cg();
                    break;
                }
                case 5: {
                    this.bn = h.aN + 60;
                    this.d = h.a[38] + "\n" + this.P + " " + h.a[39];
                    this.C();
                    break;
                }
                case 6: {
                    h.a(h.a, true);
                    h.a = null;
                    System.gc();
                    break;
                }
                case 7: {
                    this.B = false;
                    h.f = null;
                    System.gc();
                    this.E(16 + this.ap);
                    h.l = 1;
                }
lbl169:
                // 3 sources

                default: {
                    return;
                }
            }
        }
        catch (Exception v2) {}
    }

    private static int a() {
        return i[8] - 4;
    }

    private void a(boolean bl) {
        try {
            InputStream inputStream = this.getClass().getResourceAsStream("/o.f");
            int n = inputStream.read();
            byte[] byArray = new byte[n << 3];
            inputStream.read(byArray);
            int n2 = h.b(byArray, 4);
            byte[] byArray2 = new byte[n2];
            inputStream.read(byArray2);
            if (!bl) {
                inputStream.close();
                inputStream = null;
                System.gc();
            }
            a a2 = new a();
            a2.a(byArray2, 0);
            this.cv = h.a();
            a2.a(this.cv, 0, -1, -1);
            a2.b = this.cv;
            a2.g = null;
            h.a[0] = new g(a2, 0, 0, null);
            System.gc();
            if (bl) {
                n2 = h.b(byArray, 12);
                byArray2 = new byte[n2];
                inputStream.read(byArray2);
                inputStream.close();
                System.gc();
                a2 = new a();
                a2.a(byArray2, 0);
                a2.a(0, 0, -1, -1);
                a2.g = null;
                h.a[3] = new g(a2, 0, 0, null);
                System.gc();
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private int b() {
        return a[this.bo][this.bq << 1];
    }

    private void q() {
        h.a[41].b = 0;
        this.x = true;
        switch (this.bo) {
            case 0: {
                this.x();
                return;
            }
            case 3: {
                this.w();
                return;
            }
            case 7: {
                this.r();
                return;
            }
            case 2: {
                this.v();
                return;
            }
            case 1: {
                this.t();
                return;
            }
            case 5: {
                this.s();
            }
        }
    }

    private void r() {
        block0 : switch (this.b()) {
            case 0: {
                if (this.bp == 0) {
                    l = (byte)4;
                }
                this.a(this.bp);
                break;
            }
            case 1: {
                switch (this.aM) {
                    case 1: {
                        this.u();
                        break block0;
                    }
                    case 3: {
                        l = (byte)15;
                        this.J = true;
                        this.H = true;
                        this.cu();
                        break block0;
                    }
                    case 4: {
                        this.B();
                        l = (byte)9;
                        this.br = 8;
                        this.a(-1);
                        this.bs = 0;
                        break block0;
                    }
                    case 5: {
                        l = (byte)3;
                        this.g();
                        a.notifyDestroyed();
                    }
                }
            }
        }
        this.aM = -1;
    }

    /*
     * Unable to fully structure code
     */
    private void s() {
        switch (this.b()) {
            case 0: {
                v0 = h.aA = h.aA == false;
                if (h.aA) {
                    var1_1 = 32;
                    this.E(0);
                } else {
                    this.cK();
                    this.cK();
                    var1_1 = 33;
                }
                v1 = 5;
                v2 = 0;
                v3 = var1_1;
                ** GOTO lbl24
            }
            case 1: {
                h.k = h.k == false;
                var2_2 = 51;
                if (h.k) {
                    var2_2 = 50;
                    h.u(200);
                }
                v1 = 5;
                v2 = 1;
                v3 = var2_2;
lbl24:
                // 2 sources

                h.a(v1, v2, (short)v3);
            }
        }
    }

    private void t() {
        switch (this.b()) {
            case 1: {
                this.a(7);
                this.aM = 1;
                return;
            }
            case 0: {
                l = 1;
                f = null;
                e = null;
                return;
            }
            case 3: {
                if (this.aq == 13 && this.ap == 0) break;
                this.a(7);
                this.aM = 3;
                return;
            }
            case 4: {
                this.a(7);
                this.aM = 4;
                return;
            }
            case 5: {
                this.a(7);
                this.aM = 5;
                return;
            }
            case 2: {
                this.a(5);
                return;
            }
            case 6: {
                l = (byte)33;
                this.ay = true;
                return;
            }
            default: {
                this.x = false;
            }
        }
    }

    private void u() {
        int n;
        h h2;
        if (this.B) {
            h2 = this;
            n = 97;
        } else {
            h2 = this;
            n = 92;
        }
        h2.br = n;
        this.bs = 0;
        this.J = true;
        this.v = false;
        l = (byte)11;
        this.j = 0;
        this.k = 0;
        this.aS = 0;
        this.aB = -1;
        this.aA = -1;
        this.b = 0L;
    }

    private void v() {
        switch (this.b()) {
            case 0: {
                this.cK();
                this.ap = 0;
                this.j = false;
                l = (byte)15;
                ec = this.b(this.ap);
                this.H = true;
                this.cu();
                return;
            }
            case 1: {
                this.cK();
                this.ap = 1;
                this.aq = 0;
                l = (byte)15;
                ec = this.b(this.ap);
                this.H = true;
                this.cu();
                this.n = true;
                this.j = false;
                if (i[9] >= 1) break;
                h.i[9] = 1;
                return;
            }
            case 2: {
                this.cK();
                this.ap = 2;
                this.aq = 0;
                this.j = false;
                l = (byte)15;
                ec = this.b(this.ap);
                this.H = true;
                this.cu();
                this.n = true;
                if (i[9] < 2) {
                    h.i[9] = 2;
                }
                if (i[8] >= 8) break;
                h.i[8] = 8;
                return;
            }
            case 3: {
                this.a(4);
                return;
            }
            default: {
                l = (byte)3;
                this.g();
                a.a();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void w() {
        var1_1 = 0;
        switch (this.b()) {
            case 0: {
                h.aA = true;
                v0 = 32;
                ** GOTO lbl10
            }
            case 1: {
                h.aA = false;
                v0 = 33;
lbl10:
                // 2 sources

                var1_1 = v0;
            }
        }
        this.aM = 0;
        h.a(5, 0, var1_1);
    }

    private void x() {
        switch (this.b()) {
            case 1: {
                this.cK();
                this.G();
                if (i != null && h.a()) {
                    this.V = 0;
                    this.M = true;
                    this.n = true;
                    this.bs = 0;
                    l = (byte)28;
                    return;
                }
            }
            case 0: {
                this.cK();
                if (!h.a()) {
                    this.aS();
                    return;
                }
                this.Q = true;
                this.B = false;
                l = (byte)31;
                return;
            }
            case 5: {
                this.a(7);
                this.aM = 5;
                return;
            }
            case 6: {
                l = (byte)10;
                return;
            }
            case 2: {
                this.a(5);
                this.cK();
                return;
            }
            case 4: {
                l = (byte)22;
                this.aM = 0;
                this.cK();
                return;
            }
            case 3: {
                l = (byte)33;
                this.cK();
                this.ay = true;
                return;
            }
        }
        this.x = false;
    }

    private void y() {
        --this.bq;
        if (this.bq < 0) {
            this.bq = (a[this.bo].length >> 1) - 1;
        }
    }

    private void z() {
        this.bq = (this.bq + 1) % (a[this.bo].length >> 1);
    }

    private void A() {
        this.K = false;
        if (a != null) {
            int n = a.length;
            for (int i = 0; i < n; ++i) {
                h.a(a[i]);
                h.a[i] = null;
            }
        }
        a = null;
        h.a(a[42], true);
        h.a(a[43], true);
        System.gc();
    }

    private static void a(c c2) {
        int n;
        if (c2 == null) {
            return;
        }
        if (c.a != null) {
            for (n = 0; n < c.a.length; ++n) {
                h.a(c.a[n], true);
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

    private static void a(a a2, boolean bl) {
        if (a2 == null) {
            return;
        }
        a2.a(bl);
    }

    private void B() {
        int n;
        int n2;
        this.J = false;
        this.m = true;
        this.C = false;
        this.dl = 0;
        this.e = null;
        m = null;
        l = null;
        this.X = 0;
        this.Y = 0;
        d = null;
        e = null;
        this.a = null;
        h.n = null;
        f = null;
        c = null;
        b = null;
        c = null;
        p = null;
        k = null;
        if (a != null) {
            n2 = a.length;
            for (n = 0; n < n2; ++n) {
                h.a(a[n]);
                h.a[n] = null;
            }
        }
        a = null;
        if (this.a != null) {
            h.a(this.a);
            this.a = null;
        }
        if (a != null) {
            for (n2 = 0; n2 < 33; ++n2) {
                if (a[n2] == null) continue;
                n = a[n2].length;
                for (int i = 0; i < n; ++i) {
                    h.a[n2][i] = null;
                }
                h.a[n2] = null;
            }
        }
        h.a(d, true);
        System.gc();
        if (a != null) {
            for (n2 = 0; n2 < 61; ++n2) {
                if (n2 == 41 || n2 == 0 || n2 == 9 || n2 == 18) continue;
                h.a(a[n2], true);
                h.a[n2] = null;
            }
        }
        if (a != null) {
            for (n2 = 0; n2 < 6; ++n2) {
                if (a[n2] == null) continue;
                h.a(h.a[n2].a, true);
                h.a[n2].a = null;
                h.a[n2] = null;
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
        this.ay = -1;
        this.aA = -1;
        this.aC = -1;
        this.aD = -1;
        b = null;
        this.bK = -1;
        this.d = null;
        this.x = (byte)3;
        e = null;
        f = null;
        a = null;
        c = null;
        b = null;
        d = null;
        this.ao = false;
        this.dt = -1;
        this.du = 0;
        this.dv = 0;
        this.v = 0;
        this.dy = 0;
        this.dz = 0;
        this.dA = 0;
        this.w = 0;
        this.dB = 0;
        this.dC = -1;
        this.j = false;
        e = null;
        h.al();
        System.gc();
    }

    private void C() {
        this.m = true;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void f(int var1_1) throws Exception {
        var2_2 = h.b(h.n, var1_1 * 8 + 4);
        var3_3 = new byte[var2_2];
        this.a.read(var3_3);
        var4_4 = new a();
        var4_4.a(var3_3, 0);
        var4_4.a(0, 0, -1, -1);
        switch (var1_1) {
            case 0: {
                if ((this.d & 1L) == 0L) break;
                v0 = h.a;
                v1 = 60;
                v2 /* !! */  = var4_4;
                ** GOTO lbl31
            }
            case 1: {
                if ((this.d & 2L) == 0L) break;
                v0 = h.a;
                v1 = 16;
                v2 /* !! */  = var4_4;
                ** GOTO lbl31
            }
            case 2: {
                h.a[0] = null;
                v0 = h.a;
                v1 = 42;
                v2 /* !! */  = var4_4;
                ** GOTO lbl31
            }
            case 3: {
                v0 = h.a;
                v1 = 8;
                v2 /* !! */  = var4_4.a[0];
lbl31:
                // 4 sources

                v0[v1] = v2 /* !! */ ;
            }
        }
        var4_4.g = null;
    }

    /*
     * Unable to fully structure code
     */
    private void g(int var1_1) {
        try {
            if (var1_1 == 0) {
                this.a.close();
                this.a = null;
                System.gc();
                this.a = this.getClass().getResourceAsStream("/cm.f");
                this.cc = this.a.read();
                h.n = new byte[this.cc << 3];
                this.a.read(h.n);
            }
            var2_2 = h.b(h.n, var1_1 * 8 + 4);
            var3_3 = new byte[var2_2];
            this.a.read(var3_3);
            var4_4 = new a();
            var4_4.a(var3_3, 0);
            var4_4.a(0, 0, -1, -1);
            switch (var1_1) {
                case 6: {
                    h.a[43] = var4_4;
                    v0 = h.a;
                    v1 = 20;
                    v2 = null;
                    ** GOTO lbl58
                }
                case 5: {
                    v0 = h.a;
                    v1 = 18;
                    ** GOTO lbl57
                }
                case 2: {
                    var4_4.a(1, 0, 0, -1);
                    v0 = h.a;
                    v1 = 59;
                    v2 = var4_4;
                    ** GOTO lbl58
                }
                case 1: {
                    switch (this.ap) {
                        case 1: 
                        case 2: {
                            if (this.ap == 0) break;
                            var4_4.a(this.ap, 0, -1, -1);
                            var4_4.a(0);
                            var4_4.b = this.ap;
                        }
                    }
                    v0 = h.a;
                    v1 = 56;
                    v2 = var4_4;
                    ** GOTO lbl58
                }
                case 3: {
                    h.a[13] = var4_4;
                    this.D();
                    break;
                }
                case 0: {
                    v0 = h.a;
                    v1 = 11;
                    ** GOTO lbl57
                }
                case 4: {
                    v0 = h.a;
                    v1 = 5;
lbl57:
                    // 3 sources

                    v2 = var4_4.a[0];
lbl58:
                    // 4 sources

                    v0[v1] = v2;
                }
            }
            var4_4.g = null;
            return;
        }
        catch (Exception v3) {
            return;
        }
    }

    private void D() {
        if ((this.d & 1L) == 0L) {
            for (int i = 0; i < 5; ++i) {
                h.a[13].a[0][i] = null;
            }
        }
    }

    private void h(int n) {
        try {
            if (n % 10 == 0) {
                this.a.close();
                this.a = null;
                StringBuffer stringBuffer = new StringBuffer("/gen").append(this.bt).append(".f");
                this.a = this.getClass().getResourceAsStream(stringBuffer.toString());
                this.cc = this.a.read();
                h.n = new byte[this.cc << 3];
                this.a.read(h.n);
                this.cd = 0;
                ++this.bt;
            }
            int n2 = n - (this.bt - 1) * 10;
            int n3 = h.b(h.n, n2 * 8 + 4);
            if ((this.c & 1L << n) != 0L) {
                if (this.cd != 0) {
                    this.a.skip(this.cd);
                    this.cd = 0;
                }
                byte[] byArray = new byte[n3];
                this.a.read(byArray);
                a a2 = new a();
                a2.a(byArray, 0);
                if ((n != 28 || this.ai) && (n != 24 || this.ak)) {
                    a2.a(0, 0, -1, -1);
                }
                int n4 = -1;
                int n5 = -1;
                switch (n) {
                    case 41: {
                        n4 = 38;
                        break;
                    }
                    case 42: {
                        n4 = 39;
                        break;
                    }
                    case 0: {
                        n4 = 33;
                        break;
                    }
                    case 36: {
                        n4 = 35;
                        break;
                    }
                    case 1: {
                        n4 = 34;
                        break;
                    }
                    case 38: {
                        n4 = 36;
                        break;
                    }
                    case 16: 
                    case 18: {
                        n4 = 37;
                        break;
                    }
                    case 40: {
                        n4 = 2;
                        break;
                    }
                    case 32: {
                        n4 = 32;
                        break;
                    }
                    case 23: {
                        n4 = 30;
                        break;
                    }
                    case 37: {
                        n4 = 29;
                        break;
                    }
                    case 35: {
                        n4 = 28;
                        break;
                    }
                    case 34: {
                        n4 = 27;
                        break;
                    }
                    case 33: {
                        n4 = 22;
                        break;
                    }
                    case 31: {
                        int n6 = 29;
                        break;
                    }
                    case 30: {
                        n4 = 15;
                        break;
                    }
                    case 28: {
                        if (this.aj) {
                            a2.a(1, 0, -1, -1);
                        }
                        n4 = 45;
                        break;
                    }
                    case 29: {
                        int n6 = 26;
                        break;
                    }
                    case 2: {
                        if (this.ai) {
                            h.a[24] = a2.a[0];
                        }
                        if (!this.aj) break;
                        a2.a(1, 0, -1, -1);
                        h.a[25] = a2.a[1];
                        break;
                    }
                    case 6: {
                        int n6 = 21;
                        break;
                    }
                    case 27: {
                        int n6 = 19;
                        break;
                    }
                    case 26: {
                        d = a2;
                        break;
                    }
                    case 25: {
                        int n6 = 17;
                        break;
                    }
                    case 5: {
                        n4 = 58;
                        break;
                    }
                    case 3: {
                        n4 = 7;
                        break;
                    }
                    case 39: {
                        n4 = 6;
                        break;
                    }
                    case 8: {
                        n4 = 5;
                        break;
                    }
                    case 24: {
                        h.a[15] = null;
                        a2.a(1, 0, -1, -1);
                        n4 = 57;
                        h.a[14] = null;
                        break;
                    }
                    case 22: {
                        n4 = 8;
                        break;
                    }
                    case 20: {
                        int n6 = 13;
                        break;
                    }
                    case 4: 
                    case 21: {
                        if (this.ap == 2) break;
                        n4 = 3;
                        break;
                    }
                    case 7: {
                        if (this.ap == 2) {
                            a2.a = null;
                            a2.a(1, 0, -1, -1);
                            a2.b = 1;
                        }
                        n4 = 20;
                        break;
                    }
                    case 14: {
                        int n6 = 6;
                        break;
                    }
                    case 10: {
                        h.a[4] = new g(a2, 0, 0, null);
                        a[4].a(0);
                        break;
                    }
                    case 9: {
                        n4 = 12;
                        break;
                    }
                    case 15: 
                    case 17: {
                        if ((this.bu & 2) != 0) {
                            if (this.ap == 2) {
                                a2.a = null;
                                a2.a(2, 0, -1, -1);
                                a2.b = 2;
                            }
                            n4 = 4;
                        }
                        if ((this.bu & 1) == 0) break;
                        h.a[21] = new a();
                        a[21].a(byArray, 0);
                        a[21].a(1, 0, -1, -1);
                        h.a[21].b = 1;
                        h.a[21].g = null;
                        break;
                    }
                    case 13: {
                        n4 = 1;
                        break;
                    }
                    case 11: {
                        n4 = 11;
                        break;
                    }
                    case 19: {
                        int n6 = 7;
                        break;
                    }
                    case 12: {
                        int n6 = n5 = 10;
                    }
                }
                if (n4 != -1) {
                    h.a[n4] = a2;
                }
                if (n5 != -1) {
                    h.a[n5] = a2.a[0];
                }
            } else {
                this.cd += n3;
                return;
            }
            a2.g = null;
        }
        catch (IOException iOException) {}
    }

    private void i(int n) {
        try {
            if (n == 0) {
                this.a = this.getClass().getResourceAsStream("/b0.f");
                this.cc = this.a.read();
                h.n = new byte[this.cc * 8];
                this.a.read(h.n);
            }
            int n2 = h.b(h.n, n * 8 + 4);
            byte[] byArray = new byte[n2];
            this.a.read(byArray);
            a a2 = new a();
            a2.a(byArray, 0);
            a2.a(0, 0, -1, -1);
            a2.g = null;
            switch (n) {
                case 0: {
                    h.a[5] = new g(a2, 0, 0, null);
                    break;
                }
                case 1: {
                    h.a[40] = a2;
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {}
    }

    private void j(int n) {
        try {
            if (n == 0) {
                this.a = this.getClass().getResourceAsStream("/mm0.f");
                this.cc = this.a.read();
                h.n = new byte[this.cc * 8];
                this.a.read(h.n);
            }
            int n2 = h.b(h.n, n * 8 + 4);
            byte[] byArray = new byte[n2];
            this.a.read(byArray);
            a a2 = new a();
            a2.a(byArray, 0);
            a2.a(0, 0, -1, -1);
            a2.g = null;
            switch (n) {
                case 2: {
                    h.a[27] = a2.a[0];
                    break;
                }
                case 1: {
                    h.a[2] = new g(a2, 0, 0, null);
                    a[2].a(0);
                    break;
                }
                case 0: {
                    h.a[1] = new g(a2, 0, 0, null);
                    a[1].a(2);
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {}
    }

    private static int c() {
        byte by = i[12];
        return by;
    }

    private static void k(int n) {
        h.i[12] = (byte)n;
    }

    private static boolean a() {
        if (i == null) {
            return false;
        }
        return i[13] != 0;
    }

    private void b(boolean bl) {
        h.i[13] = bl ? (byte)1 : 0;
        this.H();
    }

    private void E() {
        this.ba = this.c(this.ap, this.aq);
    }

    private void F() {
        this.I = false;
        this.K();
        this.a(this.ap, ec);
        this.b(this.ap, this.aq, this.bb + this.b(this.ap, this.aq));
        this.H();
    }

    private void G() {
        try {
            RecordStore recordStore = RecordStore.openRecordStore("DiamondRush", true);
            i = recordStore.getRecord(1);
            this.cx = i.length;
            recordStore.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void H() {
        this.N = false;
        try {
            RecordStore recordStore = RecordStore.openRecordStore("DiamondRush", true);
            if (recordStore.getNumRecords() == 0) {
                recordStore.addRecord(i, 0, this.cx);
            } else {
                recordStore.setRecord(1, i, 0, this.cx);
            }
            recordStore.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void I() {
        RecordStore recordStore = null;
        try {
            recordStore = RecordStore.openRecordStore("Preferences", false);
        }
        catch (Exception exception) {}
        j = new byte[1];
        if (recordStore == null) {
            try {
                recordStore = RecordStore.openRecordStore("Preferences", true);
                h.j[0] = 0;
                this.cw = j.length;
                recordStore.closeRecordStore();
                this.J();
                return;
            }
            catch (Exception exception) {
                return;
            }
        }
        try {
            j = recordStore.getRecord(1);
            this.cw = j.length;
            recordStore.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void J() {
        try {
            RecordStore recordStore = RecordStore.openRecordStore("Preferences", true);
            if (recordStore.getNumRecords() == 0) {
                recordStore.addRecord(j, 0, this.cw);
            } else {
                recordStore.setRecord(1, j, 0, this.cw);
            }
            recordStore.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void l(int n) {
        try {
            String string = null;
            switch (n) {
                case 0: 
                case 1: {
                    RecordStore recordStore = null;
                    try {
                        recordStore = RecordStore.openRecordStore("DiamondRush", false);
                    }
                    catch (Exception exception) {}
                    if (recordStore == null) {
                        this.O = true;
                    } else {
                        this.O = false;
                        recordStore.closeRecordStore();
                    }
                    if (n != 0) {
                        i = new byte[1000];
                        h.i[3] = 5;
                        h.i[8] = 4;
                        h.i[9] = 0;
                        h.i[10] = 0;
                        this.cx = 14;
                        this.cx += 6;
                    }
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
                    this.a = this.getClass().getResourceAsStream(b[n - 2]);
                    this.a.read();
                    int n2 = n - 2;
                    int n3 = this.cx;
                    h.i[14 + n2 * 2] = (byte)(this.cx & 0xFF);
                    h.i[14 + n2 * 2 + 1] = (byte)(this.cx >> 8);
                    int n4 = this.a.read();
                    h.i[this.cx++] = (byte)n4;
                    h.i[this.cx++] = 0;
                    this.cv();
                    this.a(string);
                    h.i[this.cx++] = (byte)this.dN;
                    this.ct();
                    this.cx += n4 << 1;
                    for (int i = 0; i < n4; ++i) {
                        int n5;
                        int n6;
                        int n7 = this.cx;
                        h.i[n3 + 3 + i * 2] = (byte)(n7 & 0xFF);
                        h.i[n3 + 3 + i * 2 + 1] = (byte)(n7 >> 8);
                        byte by = 0;
                        byte by2 = 0;
                        int n8 = h.a(this.a);
                        int n9 = h.a(this.a);
                        byte[] byArray = new byte[n8 * n9];
                        this.a.read(byArray);
                        for (n6 = 0; n6 < n9; ++n6) {
                            for (n5 = 0; n5 < n8; ++n5) {
                                if (byArray[n5 + n6 * n8] != 2) continue;
                                by2 = (byte)(by2 + 1);
                            }
                        }
                        h.i[0] = (byte)(h.i[0] + by2);
                        h.i[this.cx++] = 0;
                        h.i[this.cx++] = by2;
                        h.i[this.cx++] = 0;
                        this.a.skip(n8 * n9);
                        n6 = this.cx;
                        this.cx += 2;
                        this.a.read(byArray);
                        for (n5 = 0; n5 < n9; ++n5) {
                            for (int j = 0; j < n8; ++j) {
                                if (byArray[j + n5 * n8] != 14 && byArray[j + n5 * n8] != 33) continue;
                                h.i[this.cx++] = (byte)j;
                                h.i[this.cx++] = (byte)n5;
                                by = (byte)(by + 1);
                            }
                        }
                        h.i[n6] = 0;
                        h.i[n6 + 1] = by;
                    }
                    this.a.close();
                    this.a = null;
                    System.gc();
                }
                default: {
                    return;
                }
            }
        }
        catch (Exception exception) {}
    }

    private void K() {
        h.i[3] = (byte)this.ao;
        h.i[11] = this.r;
    }

    private void L() {
        this.M = false;
        this.ao = i[3];
        this.r = i[11];
        this.aZ = h.a(i, 4);
    }

    private byte a(int n, int n2) {
        int n3 = this.a(n, n2);
        return i[n3 + 2];
    }

    private void a(int n, int n2, byte by) {
        int n3 = this.a(n, n2);
        int n4 = n3 + 2;
        i[n4] = (byte)(i[n4] | by);
    }

    private void a(int n, int n2) {
        int n3 = h.c(n) + 1;
        if (i[n3] < n2) {
            h.i[n3] = (byte)n2;
        }
    }

    private int b(int n) {
        int n2 = h.c(n) + 1;
        if (n2 >= 0 && n2 <= i.length) {
            return i[h.c(n) + 1];
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
        return h.a(i, 14 + n * 2);
    }

    private int d(int n) {
        try {
            return i[h.c(n) + 0];
        }
        catch (Exception exception) {
            return 0;
        }
    }

    private int e(int n) {
        return i[h.c(n) + 2];
    }

    private int a(int n, int n2) {
        return h.a(i, h.c(n) + 3 + n2 * 2);
    }

    private int b(int n, int n2) {
        return i[this.a(n, n2) + 0];
    }

    private void b(int n, int n2, int n3) {
        h.i[this.a((int)n, (int)n2) + 0] = (byte)n3;
    }

    private int c(int n, int n2) {
        return i[this.a(n, n2) + 1];
    }

    private void a(int n, int n2, int n3, int n4) {
        int n5 = this.a(n, n2);
        int n6 = i[n5 + 4];
        for (int i = 0; i < n6; ++i) {
            if (h.i[n5 + 5 + 2 * i + 0] != n3 || h.i[n5 + 5 + 2 * i + 1] != n4) continue;
            h.i[n5 + 5 + 2 * i + 0] = 0;
            h.i[n5 + 5 + 2 * i + 1] = 0;
            int n7 = n5 + 3;
            h.i[n7] = (byte)(h.i[n7] + 1);
            return;
        }
    }

    private boolean a(int n, int n2, int n3, int n4) {
        int n5 = this.a(n, n2);
        int n6 = i[n5 + 4];
        for (int i = 0; i < n6; ++i) {
            if (h.i[n5 + 5 + 2 * i + 0] != n3 || h.i[n5 + 5 + 2 * i + 1] != n4) continue;
            return false;
        }
        return true;
    }

    private void M() {
        this.ad = 13;
        this.af = 4;
        this.ai = 408;
        this.i = (byte)5;
        this.c |= 0x80L;
        this.c |= 8L;
        this.af = false;
        this.D = 16;
        this.E = 16;
        this.F = 19;
        this.G = 18;
    }

    private void N() throws Exception {
        cF = -1;
        D = false;
        this.c = true;
        this.ax = 0;
        this.bj = 0;
        this.c = 0L;
        this.d = 0L;
        this.Q = 0;
        this.R = 0;
        this.i = 0;
        this.P = (this.a(this.ap, this.aq) & 2) != 0;
        this.cl = 0;
        switch (this.ap) {
            case 0: {
                if (this.aq == 5) {
                    this.i = 1;
                    this.aa = 816;
                    this.ab = 0;
                    break;
                }
                if (this.aq == 13) {
                    this.i = (byte)2;
                    this.r = false;
                    break;
                }
                if (this.aq != 8) break;
                this.i = (byte)4;
                this.ad = 0;
                this.af = 3;
                this.ag = 0;
                this.ae = 0;
                this.i = false;
                this.c |= 8L;
                this.c |= 0x400L;
                this.D = 2;
                this.E = 12;
                this.F = 15;
                this.G = 5;
                break;
            }
            case 1: {
                if (this.aq != 9) break;
                this.M();
                break;
            }
            case 2: {
                if (this.aq != 10) break;
                this.by();
                this.ah = 360;
                this.i = (byte)3;
                this.c |= 0x80L;
                this.c |= 8L;
            }
        }
        this.o = false;
        this.p = false;
        this.q = false;
        this.P = 0;
        this.be = -1;
        this.bf = -1;
        this.o = 0;
        this.bg = 0;
        this.bh = 0;
        this.bi = 0;
        this.am = 70;
        this.n = i[8];
        this.k = 0;
        this.aZ = 0;
        this.bc = 0;
        this.bd = 0;
        this.bb = 0;
        this.aW = 0;
        this.aS = 0;
        this.aT = 0;
        this.aU = 0;
        this.aV = 0;
        cm = -1;
        m = null;
        l = null;
        this.a = this.getClass().getResourceAsStream(b[this.ap]);
        this.a.read();
        boolean bl = false;
        while (!bl) {
            int n = this.a.read();
            byte[] byArray = new byte[4];
            for (int i = 0; i < n && !bl; ++i) {
                this.a.read(byArray);
                int n2 = h.a(byArray, 0);
                int n3 = h.a(byArray, 2);
                if (i == this.aq) {
                    int n4;
                    int n5;
                    this.av = n2;
                    this.aw = n3;
                    a = null;
                    c = null;
                    a = null;
                    System.gc();
                    a = new byte[this.av][this.aw];
                    c = new byte[this.av][this.aw];
                    a = new int[this.av][this.aw];
                    byArray = new byte[this.av * this.aw];
                    this.a.read(byArray);
                    for (n5 = 0; n5 < this.av; ++n5) {
                        for (n4 = 0; n4 < this.aw; ++n4) {
                            h.a[n5][n4] = byArray[n5 + n4 * this.av];
                        }
                    }
                    b = new byte[this.av][this.aw];
                    b = new int[this.av][this.aw];
                    this.a.read(byArray);
                    for (n5 = 0; n5 < this.av; ++n5) {
                        for (n4 = 0; n4 < this.aw; ++n4) {
                            h.b[n5][n4] = byArray[n5 + n4 * this.av];
                        }
                    }
                    this.a.read(byArray);
                    for (n5 = 0; n5 < this.av; ++n5) {
                        for (n4 = 0; n4 < this.aw; ++n4) {
                            h.a[n5][n4] = byArray[n5 + n4 * this.av];
                        }
                    }
                    byArray = null;
                    bl = true;
                    continue;
                }
                this.a.skip(n2 * n3 * 3);
            }
        }
        this.a.close();
        this.a = null;
        this.at = 0;
        this.ar = 0;
        this.au = 0;
        this.as = 0;
        this.c();
        System.gc();
    }

    private void O() {
        int n = this.dY;
        int n2 = this.dZ;
        long l = a[n][n2];
        int n3 = h.a(l, (byte)6, (byte)5);
        int n4 = h.a(l, (byte)11, (byte)3);
        int n5 = 14;
        if (this.aq >= this.dN) {
            this.a(this.ap, this.aq, (byte)2);
        }
        if (n4 > 1) {
            int n6 = 0;
            while (n6 < n4) {
                int n7;
                int n8;
                int n9 = h.a(l, (byte)n5, (byte)4);
                long l2 = a[n9][n8 = h.a(l, (byte)(n5 += 4), (byte)4)];
                int n10 = h.a(l2, (byte)3, (byte)3);
                if (n10 == 1 && (n7 = h.a(l2, (byte)6, (byte)5)) > n3) {
                    ec = n7;
                    this.cy = n;
                    this.cz = n2;
                    this.a(this.ap, ec, (byte)64);
                    this.ad = true;
                }
                ++n6;
                n5 += 4;
            }
        } else {
            ec = this.aq;
        }
    }

    private static void a(Graphics graphics, String string) {
        Font font = Font.getFont(0, 1, 8);
        graphics.setFont(font);
        graphics.setClip(0, 0, 240, 320);
        graphics.setColor(0xFF0000);
        graphics.fillRect(0, 0, 240, 320);
        graphics.setColor(0xFFFF00);
        graphics.drawString(string, 0, 0, 20);
    }

    public final void paint(Graphics graphics) {
        if (E && System.currentTimeMillis() - e >= 300L) {
            E = false;
            this.c(cu);
        }
        try {
            this.a = graphics;
            this.a.setClip(0, 0, 240, 320);
            switch (l) {
                case 24: {
                    this.S();
                    break;
                }
                case 34: {
                    this.T();
                    break;
                }
                case 22: {
                    this.cO();
                    break;
                }
                case 36: {
                    this.cN();
                    break;
                }
                case 33: {
                    this.P();
                    break;
                }
                case 20: {
                    h.a(this.a, a[41], a[48], 120, 180, 3, 20, true);
                    break;
                }
                case 17: {
                    this.bh();
                    break;
                }
                case 10: {
                    this.a(this.a);
                    break;
                }
                case 4: {
                    this.U();
                    break;
                }
                case 7: {
                    this.ao();
                    break;
                }
                case 30: {
                    this.b(this.a, true);
                    if (aN % 20 < 10) break;
                    a[41].a(this.a, a[92], 120, 250, 17);
                    break;
                }
                case 2: {
                    this.ao();
                    break;
                }
                case 5: {
                    if (!this.R) {
                        this.a.setClip(0, 293, 240, 27);
                        this.ap();
                        this.a.setClip(0, 0, 240, 320);
                    } else {
                        this.ap();
                    }
                    if (f == null || !this.R) break;
                    this.cs();
                    break;
                }
                case 28: {
                    this.br = 11;
                    this.ap();
                    break;
                }
                case 8: 
                case 9: 
                case 21: 
                case 35: {
                    this.ap();
                    break;
                }
                case 6: {
                    this.aO();
                    break;
                }
                case 1: {
                    this.Y();
                    break;
                }
                case 12: {
                    this.V();
                    break;
                }
                case 0: 
                case 3: {
                    break;
                }
                case 15: {
                    this.cw();
                    break;
                }
                case 18: {
                    this.cG();
                    this.ay = true;
                    l = (byte)25;
                    this.eq = this.c;
                    this.f = a[120] + " " + h.a(i, 4) + " " + a[119];
                }
                case 25: {
                    this.cH();
                    break;
                }
                case 26: {
                    break;
                }
                case 27: {
                    this.R();
                    break;
                }
                case 31: {
                    if (!this.Q) break;
                    this.Q = false;
                    this.a.setColor(0);
                    this.a.fillRect(0, 0, 240, 320);
                    h.a[41].e = 5;
                    a[41].b(this.a, h.a(a[this.O ? 79 : 78], 220), 120, 160, 3);
                    this.b();
                    this.a();
                    break;
                }
                case 16: {
                    this.ap();
                    break;
                }
                case 29: {
                    this.Q();
                }
            }
            this.cQ();
            return;
        }
        catch (Throwable throwable) {
            Throwable throwable2 = throwable;
            String string = throwable.toString();
            a[41].b(graphics, string, 0, 0, 20);
            throwable2.printStackTrace();
            return;
        }
    }

    private void P() {
        if (this.ay) {
            this.a.setColor(0);
            this.a.setClip(0, 0, 240, 320);
            this.a.fillRect(0, 0, 240, 320);
            h.a[41].e = 3;
            String string = a[4] + "\n\n" + a[113] + "\n" + a[114] + "\n" + a[115] + "\n\n" + a[116] + "\n\n" + a[117] + "\n\n" + a[118];
            string = h.a(string, 235);
            a[41].b(this.a, string, 120, 10, 17);
            this.a();
            this.ay = false;
        }
    }

    private void a(Graphics graphics, boolean bl, int n, int n2) {
        int n3;
        graphics.setClip(0, 0, 240, 320);
        int n4 = 0;
        int n5 = 0;
        if (n != 0 || n2 != 0) {
            n4 -= 24;
            n5 -= 24;
        }
        int n6 = 0;
        for (n3 = n5; n3 < 320; n3 += 24) {
            for (int i = n4; i < 240; i += 24) {
                graphics.drawImage(a[8][0], i + n, n3 + n2, 0);
            }
        }
        a[10].a(graphics, 0, this.o + n, this.p + n2, 0, 0, 0);
        if (bl) {
            for (n3 = 0; n3 < 320; n3 += 24) {
                for (n6 = 0; n6 < 240; n6 += 24) {
                    a[17].a(graphics, 16, n6, n3, 0, 0, 0);
                }
            }
        }
    }

    private void a(Graphics graphics, boolean bl) {
        this.a(graphics, bl, 0, 0);
    }

    private void Q() {
        int n;
        int n2;
        if (this.ay) {
            this.a(this.a, false, this.N, this.O);
            a[17].a(this.a, 11, 120 + f.c[6] + this.N, 136 + f.c[7] + this.O, 0, 0, 0);
            n2 = 0;
            for (n = 0; n < 3; ++n) {
                n2 = 52 + n;
                a[n2].a(this.a, 0, f.c[n << 1] + 120 - this.v + this.N, f.c[(n << 1) + 1] + 136 - this.w + this.O, 0, 0, 0);
            }
        }
        switch (this.L) {
            case 1: {
                if (this.ay) break;
                this.a.setColor(this.M);
                this.a.fillRect(0, 0, 240, 320);
                for (n = 0; n < 3; ++n) {
                    n2 = 52 + n;
                    a[n2].a(this.a, 0, f.c[n << 1] + 120 - this.v, f.c[(n << 1) + 1] + 136 - this.w, 0, 0, 0);
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
                b.a(this.a);
                return;
            }
            case 9: 
            case 10: {
                b.a(this.a);
                n2 = h.a[41].e;
                h.a[41].e = 3;
                String string = a[40] + "\n" + a[107];
                string = h.a(string, 220);
                a[41].a(string);
                h.a(this.a, (240 - a.c >> 1) - 3, (320 - a.d >> 1) - 3, a.c + 6, a.d + 6, 7096587, 0);
                a[41].b(this.a, string, 120, 160, 3);
                h.a[41].e = n2;
            }
        }
    }

    private void R() {
        int n;
        int n2;
        block12: {
            block10: {
                block11: {
                    if (this.ay || this.e) {
                        this.a.setClip(0, 0, 240, 320);
                        this.a(this.a, false);
                        a[17].a(this.a, 11, 120 + f.c[6], 136 + f.c[7], 0, 0, 0);
                        this.a();
                        this.b();
                        a[41].a(this.a, a[27].toLowerCase(), 222, 311, 10);
                        this.ay = false;
                    } else {
                        this.a.setClip(this.h + 120, this.i + 136, 14, 22);
                        a[10].a(this.a, 0, this.o, this.p, 0, 0, 0);
                    }
                    if (this.q == 0) break block10;
                    this.e = false;
                    this.ay = true;
                    for (n2 = 0; n2 < this.q; ++n2) {
                        if (!h.b(n2)) continue;
                        a[10].a(this.a, n2 + 1, this.o, this.p, 0, 0, 0);
                    }
                    this.a.setClip(0, 0, 240, 320);
                    if (this.z >= this.y) break block11;
                    a[9].a(this.a, 5, this.z, f.c[this.q << 1] + 120 - 12, f.c[(this.q << 1) + 1] + 124, 0, 0, 0);
                    ++this.z;
                    break block12;
                }
                if (this.n % this.m >= this.m >> 1) {
                    a[10].a(this.a, this.q + 1, this.o, this.p, 0, 0, 0);
                    ++this.r;
                }
                if (this.r < 15) break block12;
                h.a[this.q] = true;
                this.r = 0;
                this.q = 0;
                this.z = 0;
                this.m();
                this.e = true;
                this.ay = false;
                break block12;
            }
            for (n2 = 0; n2 < 3; ++n2) {
                if (!a[n2]) continue;
                a[10].a(this.a, n2 + 1, this.o, this.p, 0, 0, 0);
            }
        }
        for (n = 0; n < 3; ++n) {
            if (!b[n]) continue;
            n2 = 52 + n;
            if (this.s == n) continue;
            a[n2].a(this.a, 0, f.c[n << 1] + 120 - this.v, f.c[(n << 1) + 1] + 136 - this.w, 0, 0, 0);
        }
        if (this.s != -1) {
            this.ay = true;
            if (this.c(this.s)) {
                this.s = -1;
                if (b[0] && b[1] && b[2]) {
                    this.h();
                    this.ay = true;
                    this.g = true;
                    l = (byte)29;
                }
            }
            return;
        }
        this.n %= this.m;
        this.a.setClip(this.f + 120, 136 + this.g, 14, 22);
        a[55].a(this.a, 0, this.n, 120 + this.f, 136 + this.g, 0, 0, 0);
        ++this.n;
        if (this.e) {
            n = h.a[41].e;
            h.a[41].e = 1;
            String string = this.b + "\n" + this.c;
            string = h.a(string, 220);
            a[41].a(string);
            int n3 = (240 - a.c >> 1) - 3;
            int n4 = 250 - (a.d >> 1) - 3;
            int n5 = a.c + 6;
            int n6 = a.d + 6;
            this.a.setClip(n3, n4, n5, n6);
            h.a(this.a, n3, n4, n5, n6, 7096587, 0);
            a[41].b(this.a, string, 120, 250, 3);
            h.a[41].e = n;
            this.e = false;
        }
    }

    private boolean c(int n) {
        int n2;
        int n3;
        int n4;
        block14: {
            block15: {
                int n5;
                block13: {
                    block11: {
                        block12: {
                            int n6;
                            block10: {
                                n4 = 52 + n;
                                n3 = f.c[n << 1] + 120;
                                n2 = f.c[(n << 1) + 1] + 136;
                                n6 = n2 - this.u;
                                n5 = n3 - this.t;
                                if (n6 >= 0) break block10;
                                this.u -= 2;
                                if (this.u > n2) break block11;
                                break block12;
                            }
                            if (n6 <= 0) break block11;
                            this.u += 2;
                            if (this.u < n2) break block11;
                        }
                        this.u = n2;
                    }
                    if (n5 >= 0) break block13;
                    this.t -= 3;
                    if (this.t > n3) break block14;
                    break block15;
                }
                if (n5 <= 0) break block14;
                this.t += 3;
                if (this.t < n3) break block14;
            }
            this.t = n3;
        }
        a[n4].a(this.a, 0, this.t - this.v, this.u - this.w, 0, 0, 0);
        if (this.t == n3 && this.u == n2) {
            this.t = n3;
            this.u = n2;
            if (this.x < 20) {
                if (this.x % 2 == 1) {
                    int n7 = 838860;
                    this.a.setColor(0 + n7 * this.x);
                    this.a.fillRect(0, 0, 240, 320);
                }
                ++this.x;
                return false;
            }
            if (this.z < this.y) {
                a[9].a(this.a, 5, this.z, f.c[n << 1] + 120 - 12, f.c[(n << 1) + 1] + 124, 0, 0, 0);
                ++this.z;
                return false;
            }
            this.z = 0;
            this.x = 0;
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private void S() {
        var1_1 = null;
        var2_2 = h.a[41];
        h.a[41].e = 15;
        this.a.setColor(0);
        this.a.fillRect(0, 0, 240, 320);
        for (var4_3 = 0; var4_3 < 5; ++var4_3) {
            var5_4 = -1;
            switch (var4_3) {
                case 0: {
                    var5_4 = 70;
                    v0 = " 6 - Add " + String.valueOf(this.aZ);
                    ** GOTO lbl36
                }
                case 1: {
                    var5_4 = 71;
                    v0 = " 7 - Add " + String.valueOf(this.bb);
                    ** GOTO lbl36
                }
                case 2: {
                    var5_4 = 72;
                    v0 = " 8 - x " + String.valueOf(this.cB) + (this.cB >= 4 ? " blue potion" : "");
                    ** GOTO lbl36
                }
                case 3: {
                    var5_4 = 73;
                    v0 = " 9 - " + h.a[this.S != false ? 76 : 77];
                    ** GOTO lbl36
                }
                case 4: {
                    var5_4 = 74;
                    v0 = " 0 - " + h.a[this.T != false ? 76 : 77];
                    ** GOTO lbl36
                }
                case 5: {
                    var5_4 = -1;
                    v0 = "5 to activate lang cheat";
                    ** GOTO lbl36
                }
                case 6: {
                    var5_4 = -1;
                    v0 = "4 to go to end scene";
lbl36:
                    // 7 sources

                    var1_1 = v0;
                }
            }
            var6_5 = var4_3 * 35;
            if (var5_4 >= 0) {
                var2_2.a(this.a, h.a[var5_4], 120, var6_5, 17);
            }
            var6_5 += var2_2.e;
            if (var1_1 != "5 to activate lang cheat") {
                var2_2.a(this.a, h.a[75], 5, var6_5, 20);
                v1 = var2_2;
                v2 = this.a;
                v3 = var1_1;
                v4 = 70;
                v5 = var6_5;
                v6 = 20;
            } else if (var4_3 == 6) {
                var2_2.a(this.a, h.a[75], 5, var6_5, 20);
                v1 = var2_2;
                v2 = this.a;
                v3 = var1_1;
                v4 = 70;
                v5 = var6_5;
                v6 = 20;
            } else {
                var2_2.a(this.a, h.a[75] + " " + var1_1.substring(0, 1), 120, var6_5, 17);
                v1 = var2_2;
                v2 = this.a;
                v3 = var1_1.substring(1, var1_1.length());
                v4 = 115;
                v5 = var6_5 += var2_2.e;
                v6 = 17;
            }
            v1.a(v2, v3, v4, v5, v6);
        }
        var1_1 = "Pound - Pass levels ";
        if (this.ac) {
            v7 = new StringBuffer().append(var1_1);
            v8 = "on";
        } else {
            v7 = new StringBuffer().append(var1_1);
            v8 = "off";
        }
        var1_1 = v7.append(v8).toString();
        var2_2.a(this.a, var1_1, 110, 290, 17);
        this.a();
        this.b();
    }

    private void T() {
        String string;
        a a2 = a[41];
        a[41].e = 2;
        this.a.setColor(0);
        this.a.fillRect(0, 0, 240, 320);
        switch (this.dg) {
            case 1: {
                string = "Tips";
                h.B(this.a[1]);
                this.cs();
                break;
            }
            case 0: {
                string = "Mix";
                a2.b(this.a, a[this.a[0]], 10, 5, 20);
                break;
            }
            default: {
                string = "";
            }
        }
        a2.e = 2;
        a2.a(this.a, string, 40, 308, 20);
        a2.a(this.a, "" + this.a[this.dg], 120, 308, 20);
        a2.b(this.a, "Use up, down, left and right to navigate", 10, 280, 20);
        this.a();
        this.b();
    }

    private void U() {
        this.ao();
    }

    private void b(Graphics graphics, boolean bl) {
        graphics.drawImage(a, 0, 0, 20);
        if (bl) {
            graphics.drawImage(b, 120, 319, 33);
        }
    }

    private void V() {
        int n;
        int n2;
        int n3;
        String string;
        Graphics graphics;
        a a2;
        this.a.setColor(0);
        this.a.fillRect(0, 0, 240, 320);
        a a3 = a[41];
        a3.a(this.a, a[35], 120, 50, 17);
        if (this.i == 2) {
            a2 = a3;
            graphics = this.a;
            string = a[26];
            n3 = 0;
            n2 = 320;
            n = 36;
        } else {
            a3.a(this.a, a[1], 0, 320, 36);
            String string2 = a[121] + " " + (h.a(i, 4) < 500 ? h.a(i, 4) : 500) + " " + a[119];
            a2 = a3;
            graphics = this.a;
            string = string2;
            n3 = 120;
            n2 = 160;
            n = 17;
        }
        a2.a(graphics, string, n3, n2, n);
        this.aA();
    }

    /*
     * Unable to fully structure code
     */
    private void a(Graphics var1_1) {
        block4: {
            block2: {
                block3: {
                    var2_2 = this.ar % h.cD;
                    var3_3 = this.as % h.cE;
                    var4_4 = (this.ar + 240) % h.cD;
                    var5_5 = (this.as + 240) % h.cE;
                    if (var4_4 <= var2_2) break block2;
                    if (var5_5 <= var3_3) break block3;
                    v0 = var1_1;
                    v1 = var2_2;
                    v2 = var3_3;
                    v3 = 0;
                    v4 = 0;
                    break block4;
                }
                h.a(var1_1, var2_2, var3_3, 0, 0);
                v0 = var1_1;
                v1 = var2_2;
                v2 = 0;
                v3 = 0;
                ** GOTO lbl36
            }
            if (var5_5 > var3_3) {
                h.a(var1_1, var2_2, var3_3, 0, 0);
                v0 = var1_1;
                v1 = 0;
                v2 = var3_3;
                v3 = 240 - var4_4;
                v4 = 0;
            } else {
                h.a(var1_1, var2_2, var3_3, 0, 0);
                h.a(var1_1, var2_2, 0, 0, 240 - var5_5);
                h.a(var1_1, 0, var3_3, 240 - var4_4, 0);
                v0 = var1_1;
                v1 = 0;
                v2 = 0;
                v3 = 240 - var4_4;
lbl36:
                // 2 sources

                v4 = 240 - var5_5;
            }
        }
        h.a(v0, v1, v2, v3, v4);
    }

    private static void a(Graphics graphics, int n, int n2, int n3, int n4) {
        graphics.drawImage(c, n3 - n, n4 - n2, 0);
    }

    private static void W() {
        cD = 264;
        cE = 264;
        c = Image.createImage(cD, cE);
        b = c.getGraphics();
    }

    private void b(int n, int n2) {
        int n3 = this.ar - this.ar % 24;
        int n4 = this.as - this.as % 24;
        int n5 = this.ar + cD - 24 - (this.ar + cD - 24) % 24;
        int n6 = this.as + cE - 24 - (this.as + cE - 24) % 24;
        int n7 = n * 24;
        int n8 = n2 * 24;
        if (n7 >= n3 && n7 <= n5 && n8 >= n4 && n8 <= n6) {
            int n9 = a[n][n2] & 0xFF;
            byte by = a[n][n2];
            if (by < 80) {
                if (n9 == 4 || n9 == 16 || n9 == 15) {
                    this.c(n, n2);
                    return;
                }
                b.drawImage(a[8][0], n7 % cD, n8 % cE, 0);
            }
        }
    }

    private void c(int n, int n2) {
        int n3 = this.ar - this.ar % 24;
        int n4 = this.as - this.as % 24;
        int n5 = this.ar + cD - 24 - (this.ar + cD - 24) % 24;
        int n6 = this.as + cE - 24 - (this.as + cE - 24) % 24;
        int n7 = n * 24;
        int n8 = n2 * 24;
        if (n7 >= n3 && n7 <= n5 && n8 >= n4 && n8 <= n6) {
            this.a(n7, n8, n7, n8, false);
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
                h.a[45].b = 0;
                return 45;
            }
            case 23: {
                h.a[45].b = 1;
                return 45;
            }
            case 4: {
                return 56;
            }
            case 15: {
                h.a[57].b = 0;
                return 57;
            }
            case 14: {
                h.a[57].b = 1;
                return 57;
            }
            case 16: {
                return 58;
            }
            case 2: {
                h.a[59].b = 0;
                return 59;
            }
            case 3: {
                h.a[59].b = 1;
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
        var6_6 = null;
        var9_7 = 0;
        var10_8 = 0;
        var6_6 = h.b;
        var7_9 = h.cD;
        var8_10 = h.cE;
        var9_7 = var1_1 % var7_9;
        var10_8 = var2_2 % var8_10;
        this.by = var10_8 - 24;
        this.bH = var2_2 / 24 - 1;
        for (var11_11 = var2_2; var11_11 <= var4_4; var11_11 += 24) {
            this.bx = var9_7 - 24;
            this.bG = var1_1 / 24 - 1;
            this.by += 24;
            ++this.bH;
            if (this.by >= var8_10) {
                this.by = 0;
            }
            for (var12_12 = var1_1; var12_12 <= var3_3; var12_12 += 24) {
                block25: {
                    block26: {
                        this.bx += 24;
                        ++this.bG;
                        if (this.bx >= var7_9) {
                            this.bx = 0;
                        }
                        if (this.bG < 0 || this.bG >= this.av || this.bH < 0 || this.bH >= this.aw) continue;
                        this.bI = h.a[this.bG][this.bH];
                        this.bJ = h.a[this.bG][this.bH] & 255;
                        if (this.bI < 80 && !var5_5) {
                            var6_6.drawImage(h.a[8][0], this.bx, this.by, 0);
                        }
                        if (this.bJ > -1 && this.bJ < 38) {
                            switch (this.bJ) {
                                case 4: {
                                    this.aE = 20;
                                    this.aF = 7;
                                    this.bO = 0;
                                    this.bN = 0;
                                    break;
                                }
                                case 27: {
                                    this.aE = 21;
                                    this.aF = 0;
                                    this.bO = 0;
                                    this.bN = 0;
                                    break;
                                }
                                case 15: {
                                    if (this.ce != 0) break;
                                    this.aE = 14;
                                    v0 = this;
                                    v1 = 0 + this.ce * 5 / 10;
                                    break;
                                }
                                case 16: {
                                    if (this.ce != 9) break;
                                    this.aE = 15;
                                    this.aF = 4 - this.ce * 5 / 10;
                                    if (this.aF >= 0) break;
                                    v0 = this;
                                    v1 = v0.aF = 0;
                                }
                            }
                        }
                        if (this.aE != -1) {
                            if (h.a[this.aE] == null) {
                                h.a[h.a(this.aE)].a(var6_6, this.aF, this.bx + this.bN, this.by + this.bO, this.bP, 0, 0);
                            } else {
                                var6_6.drawImage(h.a[this.aE][this.aF], this.bx + this.bN, this.by + this.bO, this.bP);
                            }
                            this.bP = 0;
                            this.aE = -1;
                            this.bO = 0;
                            this.bN = 0;
                        }
                        if (this.bI == -1 || var5_5) break block25;
                        var13_13 = this.bI - 80;
                        if (var13_13 < 0) break block26;
                        this.aG = 0;
                        v2 = this;
                        v3 = var13_13;
                        ** GOTO lbl99
                    }
                    switch (this.bI) {
                        case 10: {
                            h.a[16].a(var6_6, 0, this.bx, this.by, 0, 0, 0);
                            break;
                        }
                        case 1: {
                            if (h.b[this.bG][this.bH] != 0 || h.e != null && h.e[this.bG][this.bH] != 0) break;
                            this.aB();
                            this.aH -= this.bR;
                            this.bO = 0;
                            break;
                        }
                        case 0: {
                            if (h.b[this.bG][this.bH] != 0 || h.e != null && h.e[this.bG][this.bH] != 0) break;
                            this.aB();
                            break;
                        }
                        case 34: {
                            if (this.ce != 9) break;
                            this.aG = 14;
                            v2 = this;
                            v3 = 0 + this.ce * 5 / 10;
                            ** GOTO lbl99
                        }
                        case 35: {
                            if (this.ce != 0) break;
                            this.aG = 15;
                            this.aH = 4 - this.ce * 5 / 10;
                            if (this.aH >= 0) break;
                            v2 = this;
                            v3 = 0;
lbl99:
                            // 3 sources

                            v2.aH = v3;
                        }
                    }
                    if (this.aG != -1) {
                        if (h.a[this.aG] == null) {
                            h.a[h.a(this.aG)].a(var6_6, this.aH, this.bx + this.bN, this.by + this.bO, this.bP, 0, 0);
                        } else {
                            var6_6.drawImage(h.a[this.aG][this.aH], this.bx + this.bN, this.by + this.bO, this.bP);
                        }
                        this.aG = -1;
                        this.bP = 0;
                        this.bO = 0;
                        this.bN = 0;
                    }
                }
                if (this.i != 2) continue;
                this.c(var6_6);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void b(Graphics var1_1) {
        for (var2_2 = -1; var2_2 < 12; ++var2_2) {
            for (var3_3 = -1; var3_3 < 12; ++var3_3) {
                block67: {
                    block64: {
                        block66: {
                            block65: {
                                this.bG = var3_3 + this.cJ;
                                this.bH = var2_2 + this.cK;
                                if (this.bG < 0 || this.bG >= this.av || this.bH < 0 || this.bH >= this.aw) continue;
                                this.bI = h.a[this.bG][this.bH];
                                this.bJ = h.a[this.bG][this.bH] & 255;
                                this.bx = var3_3 * 24 - this.cL;
                                this.by = var2_2 * 24 - this.cM;
                                this.X();
                                if (this.bJ <= -1 || this.bJ >= 38) break block64;
                                switch (this.bJ) {
                                    case 35: {
                                        v0 = this;
                                        ** GOTO lbl62
                                    }
                                    case 34: {
                                        h.a[27].a(var1_1, 2, 0, this.bx, this.by, 0, 0, 0);
                                        break;
                                    }
                                    case 14: 
                                    case 33: {
                                        this.m(this.bJ);
                                        break;
                                    }
                                    case 6: {
                                        this.aD();
                                        if (this.by + 24 >= 240) break;
                                        var1_1.clipRect(this.bx, this.by, 24, 24);
                                        break;
                                    }
                                    case 15: {
                                        if (this.ce == 0 || this.ce > 5) break;
                                        this.aE = 14;
                                        this.aF = 0 + this.ce * 5 / 10;
                                        break;
                                    }
                                    case 16: {
                                        if (this.ce == 9 || this.ce < 5) break;
                                        this.aE = 15;
                                        this.aF = 4 - this.ce * 5 / 10;
                                        if (this.aF >= 0) break;
                                        this.aF = 0;
                                        break;
                                    }
                                    case 7: {
                                        this.aI();
                                        break;
                                    }
                                    case 4: {
                                        if (h.a[this.bG][this.bH] >> 8 < this.ax) break;
                                        this.ah();
                                        break;
                                    }
                                    case 5: 
                                    case 28: {
                                        this.aE = 11;
                                        this.aF = 0;
                                        break;
                                    }
                                    case 8: 
                                    case 9: {
                                        this.aH();
                                        break;
                                    }
                                    case 3: {
                                        var4_4 = (h.a[this.bG][this.bH] >> 8) - 1;
                                        if (var4_4 < 0) break;
                                        this.aE = 12;
                                        this.aF = (byte)var4_4;
                                        break;
                                    }
                                    case 37: {
                                        h.a[27].a(var1_1, 2, 0, this.bx, this.by, 0, 0, 0);
                                        v0 = this;
lbl62:
                                        // 2 sources

                                        v0.ac();
                                    }
                                }
                                if (this.aE == -1) break block65;
                                if (h.a[this.aE] == null) {
                                    h.a[h.a(this.aE)].a(var1_1, this.aF, this.bx + this.bN, this.by + this.bO, this.bP, 0, 0);
                                } else {
                                    var1_1.drawImage(h.a[this.aE][this.aF], this.bx + this.bN, this.by + this.bO, this.bP);
                                }
                                this.bP = 0;
                                this.aE = -1;
                                var1_1.setClip(0, -this.bk, 240, 240);
                                break block66;
                            }
                            if (h.b == null) break block64;
                            if (this.bK != -1) {
                                h.b.a(var1_1, this.bK, this.bL, this.bx + this.bN, this.by + this.bO, 0, 0, 0);
                                this.bK = -1;
                            }
                            h.b = null;
                        }
                        this.bO = 0;
                        this.bN = 0;
                    }
                    if (this.bI == -1) continue;
                    var4_4 = this.bI - 80;
                    if (var4_4 >= 0) break block67;
                    var5_5 = h.b[this.bG][this.bH];
                    switch (this.bI) {
                        case 49: {
                            this.aC();
                            break;
                        }
                        case 48: {
                            this.aa();
                            break;
                        }
                        case 21: {
                            this.ad();
                            break;
                        }
                        case 46: {
                            this.ae();
                            break;
                        }
                        case 45: {
                            this.aL();
                            break;
                        }
                        case 44: {
                            this.af();
                            this.bL = 0;
                            break;
                        }
                        case 12: {
                            this.ag();
                            break;
                        }
                        case 36: {
                            this.ak();
                            break;
                        }
                        case 18: {
                            this.aj();
                            break;
                        }
                        case 34: {
                            if (this.ce == 9 || this.ce < 5) break;
                            this.aG = 14;
                            this.aH = 0 + this.ce * 5 / 10;
                            break;
                        }
                        case 35: {
                            if (this.ce == 0 || this.ce > 5) break;
                            this.aG = 15;
                            this.aH = 4 - this.ce * 5 / 10;
                            if (this.aH >= 0) break;
                            this.aH = 0;
                            break;
                        }
                        case 28: {
                            this.aN();
                            break;
                        }
                        case 16: {
                            this.aK();
                            break;
                        }
                        case 14: {
                            this.aJ();
                            break;
                        }
                        case 32: {
                            this.aG();
                            break;
                        }
                        case 11: {
                            this.aF();
                            break;
                        }
                        case 30: {
                            h.b = h.a[20];
                            this.bK = 0;
                            this.bL = 0 + (var5_5 - 1) * 7 / 16;
                            break;
                        }
                        case 37: {
                            this.aG = 17;
                            this.aH = 0 + (var5_5 - 1) * 3 / 8;
                            break;
                        }
                        case 23: {
                            h.b = h.a[12];
                            this.bL = 0;
                            this.b((byte)23);
                            break;
                        }
                        case 22: {
                            h.b = h.a[12];
                            this.bL = 1;
                            this.b((byte)22);
                            break;
                        }
                        case 43: {
                            this.c((byte)this.bI);
                            break;
                        }
                        case 19: {
                            this.c((byte)this.bI);
                            break;
                        }
                        case 10: {
                            break;
                        }
                        case 47: {
                            v1 = this;
                            ** GOTO lbl197
                        }
                        case 9: {
                            this.aB();
                            if ((h.b[this.bG][this.bH] & 0xFC00000) != 0x8400000) break;
                            this.bN += this.aj;
                            this.bO += this.ak;
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
                            if ((h.b[this.bG][this.bH] & -2147483648) == 0 && this.bR == 0) break;
                            v1 = this;
                            ** GOTO lbl197
                        }
                        case 0: {
                            if ((h.b[this.bG][this.bH] & -2147483648) == 0) break;
                            ** GOTO lbl195
                        }
                        case 6: {
                            break;
                        }
                        case 7: {
                            break;
                        }
lbl195:
                        // 2 sources

                        case 8: {
                            v1 = this;
lbl197:
                            // 3 sources

                            v1.aB();
                        }
                    }
                }
                if (this.aG != -1) {
                    if (h.a[this.aG] == null) {
                        h.a[h.a(this.aG)].a(var1_1, this.aH, this.bx + this.bN, this.by + this.bO, this.bP, 0, 0);
                    } else {
                        var1_1.drawImage(h.a[this.aG][this.aH], this.bx + this.bN, this.by + this.bO, this.bP);
                    }
                    this.aG = -1;
                    this.bP = 0;
                } else {
                    if (h.b == null) continue;
                    if (this.bG == this.co && this.bH == this.cp) {
                        h.c = h.b;
                        this.ct = this.bK;
                        this.cs = this.bL;
                        this.cr = this.bx + this.bN;
                        this.cq = this.by + this.bO;
                    }
                    if (this.bK != -1) {
                        h.b.a(var1_1, this.bK, this.bL, this.bx + this.bN, this.by + this.bO, this.bM, 0, 0);
                        this.bK = -1;
                    } else {
                        h.b.a(var1_1, this.bL, this.bx + this.bN, this.by + this.bO, this.bM, 0, 0);
                    }
                    h.b = null;
                    this.bM = 0;
                }
                this.bO = 0;
                this.bN = 0;
            }
        }
    }

    private void X() {
        this.a.setClip(0, 0, 240, 240);
    }

    /*
     * Unable to fully structure code
     */
    private void Y() {
        var1_1 = this.a;
        var2_2 = h.aN;
        this.bQ = (this.aS & 4096) == 0 ? this.k : 0;
        var1_1.translate(0, 40);
        this.bk = 0;
        this.X();
        if (this.bj > 0) {
            this.bk = this.bj * var2_2 % ((this.bj >> 1) + 1) % 12;
        }
        if (this.bk > this.as) {
            this.bk = this.as;
        }
        this.as -= this.bk;
        this.cJ = this.ar / 24;
        this.cK = this.as / 24;
        this.cL = this.ar % 24;
        this.cM = this.as % 24;
        this.bR = (var2_2 & 63) >> 1;
        if (this.bR >= 4) {
            this.bR = 0;
        }
        var3_3 = this.ar - this.cL;
        var4_4 = this.as - this.cM;
        var5_5 = this.ar + h.cD - 24 - (this.ar + h.cD - 24) % 24;
        var6_6 = this.as + h.cE - 24 - (this.as + h.cE - 24) % 24;
        if (h.cF == -1) {
            this.a(var3_3, var4_4, var5_5, var6_6, false);
            h.cF = var3_3;
            h.cG = var5_5;
            h.cH = var4_4;
            h.cI = var6_6;
        }
        if (h.cF != var3_3) {
            if (h.cF < var3_3) {
                var7_9 = h.cG + 24;
                v0 = var5_5;
            } else {
                var7_9 = var3_3;
                v0 = h.cF - 24;
            }
            var8_10 = v0;
            this.a(var7_9, var4_4, var8_10, var6_6, false);
            h.cF = var3_3;
            h.cG = var5_5;
        }
        if (h.cH != var4_4) {
            if (h.cH < var4_4) {
                var7_9 = h.cI + 24;
                v1 = var6_6;
            } else {
                var7_9 = var4_4;
                v1 = h.cH - 24;
            }
            var8_10 = v1;
            this.a(var3_3, var7_9, var5_5, var8_10, false);
            h.cH = var4_4;
            h.cI = var6_6;
        }
        this.a(var1_1);
        this.X();
        this.b(var1_1);
        if (h.D) {
            var1_1.setColor(0);
            var1_1.fillRect(0, 0, 240, 320);
            this.aA();
            if (h.d != null) {
                var1_1.drawImage(h.d, h.cN, h.cO, h.cP);
            }
            if (this.S != this.T) {
                v2 = var3_3 = this.S;
                while (v2 != this.T) {
                    var4_4 = h.a[var3_3 << 1] * 24 - this.ar;
                    var5_5 = h.a[(var3_3 << 1) + 1] * 24 - this.as;
                    if (h.c[var3_3] < 0) {
                        v3 = h.a[2];
                        v4 = var1_1;
                        v5 = 0;
                        v6 = h.a(var6_7, 0, (int)h.b[var3_3]);
                    } else {
                        v3 = h.a[9];
                        v4 = var1_1;
                        v5 = h.c[var3_3];
                        v6 = h.b[var3_3];
                    }
                    v3.a(v4, v5, v6, var4_4, var5_5, 0, 0, 0);
                    v2 = ++var3_3 & 7;
                }
            }
            this.a.setClip(0, 0, 240, 320);
            var1_1.translate(0, -40);
            this.ai();
            return;
        }
        this.aA();
        if (this.j) {
            this.d(this.cL, this.cM);
        }
        if (h.d != null) {
            var1_1.drawImage(h.d, h.cN, h.cO, h.cP);
        }
        if (this.al > 0) {
            this.Z();
        }
        if (this.i != 0) {
            this.aq();
        }
        for (var3_3 = -1; var3_3 < 12; ++var3_3) {
            for (var4_4 = -1; var4_4 < 12; ++var4_4) {
                block60: {
                    block59: {
                        block58: {
                            var7_9 = var4_4 + this.cJ;
                            var8_10 = var3_3 + this.cK;
                            if (var7_9 < 0 || var7_9 >= this.av || var8_10 < 0 || var8_10 >= this.aw) continue;
                            var5_5 = h.a[var7_9][var8_10] & 255;
                            var6_6 = h.a[var7_9][var8_10];
                            if (var5_5 >= 38 && var5_5 < 80) continue;
                            var10_11 = var4_4 * 24 - this.cL;
                            var11_12 = var3_3 * 24 - this.cM;
                            if (var5_5 < 20 || var5_5 >= 26) break block58;
                            var12_13 = var5_5 - 20;
                            v7 = h.a[3];
                            v8 = var1_1;
                            v9 = var12_13;
                            v10 = (var2_2 >> 2) % (h.a[3].e[var12_13] & 255);
                            break block59;
                        }
                        switch (var5_5) {
                            case 36: {
                                var12_13 = (h.a[var7_9][var8_10] >> 8) - 1;
                                var12_13 = (0 + var12_13 * 7) / 16;
                                h.a[20].a(var1_1, 0, var12_13, var10_11, var11_12, 0, 0, 0);
                                break;
                            }
                            case 31: {
                                var13_14 = h.a[var7_9][var8_10] >> 8;
                                var14_15 = h.a[15];
                                var15_16 = (h.aN >> 1) % (var14_15.e[var13_14] & 255);
                                var14_15.a(this.a, var13_14, var15_16, var10_11, var11_12, 0, 0, 0);
                                break;
                            }
                            case 32: {
                                h.a[16].a(this.a, 0, h.a[var7_9][var8_10] >> 8 & 255, var10_11, var11_12, 0, 0, 0);
                                break;
                            }
                            default: {
                                var16_17 = (byte)(var5_5 - 80);
                                if (var16_17 < 0) break;
                                h.a[42].a(var1_1, var16_17, var10_11, var11_12, 0, 0, 0);
                            }
                        }
                        var12_13 = (h.a[var7_9][var8_10] & -268435456) >> 28;
                        if (var12_13 <= 0) break block60;
                        v7 = h.a[13];
                        v8 = var1_1;
                        v9 = 0;
                        v10 = var12_13;
                    }
                    v7.a(v8, v9, v10, var10_11, var11_12, 0, 0, 0);
                }
                if (var6_6 != 54) continue;
                h.a[7].a(var1_1, 0, h.a(h.a[7], 0, h.b[var7_9][var8_10]), var10_11, var11_12, 0, 0, 0);
            }
        }
        if (this.y) {
            var3_3 = (this.bB - this.cJ) * 24 - this.cL + this.bz;
            var4_4 = (this.bC - this.cK + 1) * 24 - this.cM + this.bA;
            var1_1.drawImage(h.a[13].a[0][0 + this.bD], var3_3, var4_4, 0);
            this.y = false;
        }
        if (this.ay != -1) {
            var1_1.drawImage(h.a[13][0], this.bv + -12, this.bw + -24 + 2, 3);
            var1_1.drawImage(h.a[this.ay][this.az], this.bv + -12, this.bw + -24, 3);
        }
        if (this.S != this.T) {
            v11 = var3_3 = this.S;
            while (v11 != this.T) {
                var4_4 = h.a[var3_3 << 1] * 24 - this.ar;
                var5_5 = h.a[(var3_3 << 1) + 1] * 24 - this.as;
                if (h.c[var3_3] < 0) {
                    v12 = h.a[2];
                    v13 = var1_1;
                    v14 = 0;
                    v15 = h.a(var6_8, 0, (int)h.b[var3_3]);
                } else {
                    v12 = h.a[9];
                    v13 = var1_1;
                    v14 = h.c[var3_3];
                    v15 = h.b[var3_3];
                }
                v12.a(v13, v14, v15, var4_4, var5_5, 0, 0, 0);
                v11 = ++var3_3 & 7;
            }
        }
        this.as += this.bk;
        if (this.v) {
            h.a(var1_1, h.a[41], h.a[40], 120, 160, 17, 19, false);
        }
        if (this.bn > h.aN && this.i != 2) {
            if (!this.al && !this.f) {
                var3_3 = this.bn - h.aN;
                var4_4 = var3_3 < 20 ? (var3_3 - 10) * 240 / 20 : (var3_3 >= 50 ? (60 - var3_3) * 240 / 15 : 120);
                var5_5 = 240 - var4_4;
                h.a(var1_1, h.a[41], h.a[h.f[this.ap]], var4_4, 15, 17, 20, false);
                h.a(var1_1, h.a[41], h.a[h.g[this.ap][this.aq]], var5_5, 50, 17, 20, false);
                if (this.P > 0) {
                    h.a(var1_1, h.a[41], this.d, 120, 190, 17, 5, true);
                }
            }
        } else if (this.Z > h.aN && this.r <= 2) {
            h.a(var1_1, h.a[41], h.a[36], 120, 230, 33, 20, false);
        } else if (this.Z == h.aN && this.r <= 2) {
            this.r = (byte)(this.r + 1);
            this.K();
        }
        switch (this.i) {
            case 4: {
                this.au();
                break;
            }
            case 3: {
                if (this.ad == -1 || this.ad == 15) break;
                v16 = this;
                v17 = var1_1;
                v18 = 5;
                ** GOTO lbl201
            }
            case 5: {
                if (this.ad == -1 || this.ad == 15 || this.ad == 13 || this.ad == 12) break;
                v16 = this;
                v17 = var1_1;
                v18 = 4;
lbl201:
                // 2 sources

                v16.a(v17, v18);
            }
        }
        var1_1.translate(0, -40);
        var1_1.setClip(0, 0, 240, 320);
        if (this.a == null) {
            this.ai();
        }
        if (this.e != null) {
            this.m = true;
            h.a(var1_1, h.a[41], this.e, 120, 263, 33, 4, true);
        }
        if (this.a != null && !h.D) {
            this.m = true;
            this.a.a(var1_1);
        }
        if (this.bl > 0) {
            this.m = true;
            var1_1.setColor(0);
            var1_1.fillRect(0, 0, 240, this.bl);
            var1_1.fillRect(0, 320 - this.bl, 240, this.bl);
            var1_1.translate(0, 40);
            this.aA();
            if (h.d != null) {
                var1_1.drawImage(h.d, h.cN, h.cO, h.cP);
            }
            if (h.c != null) {
                if (this.ct != -1) {
                    h.c.a(var1_1, this.ct, this.cs, (this.co - this.cJ) * 24 - this.cL, (this.cp - this.cK) * 24 - this.cM, this.bM, 0, 0);
                } else {
                    h.c.a(var1_1, this.cs, this.cr, this.cq, this.bM, 0, 0);
                }
            }
            var1_1.translate(0, -40);
        }
    }

    private void Z() {
        int n = this.as - 24;
        int n2 = this.as + 320;
        int n3 = this.ar;
        int n4 = this.ar + 240;
        int n5 = (aN >> 1) % a[2].a(1);
        for (int i = 0; i < e.length; i += 3) {
            int n6;
            int n7;
            int n8;
            int n9;
            int n10;
            Graphics graphics;
            a a2;
            byte by = 0;
            byte by2 = e[i + 2];
            int n11 = by2 * 24;
            if (n11 <= n || n11 >= n2) continue;
            byte by3 = e[i + 0];
            byte by4 = e[i + 1];
            int n12 = by3 * 24;
            int n13 = by4 * 24 + 24;
            if (!(n12 >= n3 && n12 <= n4 || n13 >= n3 && n13 <= n4) && (n12 > n3 || n13 < n4)) continue;
            int n14 = n12 - n3;
            int n15 = by3 + (by3 != 0 ? -1 : 0);
            boolean bl = true;
            if (a[n15][by2] == 48 && (b[n15][by2] & 8) != 0) {
                n14 -= 12;
                bl = false;
                if ((b[n15][by2 + 1] & 7) == 3) {
                    by = -b[n15][by2 + 1];
                } else {
                    n14 -= -b[n15][by2 + 1];
                }
            }
            int n16 = n13 - n3;
            n15 = by4 + (by4 < this.av - 1 ? (byte)1 : 0);
            boolean bl2 = true;
            if (a[n15][by2] == 48 && (b[n15][by2] & 8) != 0) {
                n16 += 12;
                bl2 = false;
                if ((b[n15][by2 + 1] & 7) == 3) {
                    by = -b[n15][by2 + 1];
                } else {
                    n16 += -b[n15][by2 + 1];
                }
            }
            int n17 = n11 - this.as + 10 + by;
            this.a.setColor(1820159);
            this.a.drawLine(n14, n17, n16, n17);
            this.a.drawLine(n14, n17 += 2, n16, n17);
            this.a.setColor(14153215);
            this.a.drawLine(n14, --n17, n16, n17);
            if (bl) {
                a2 = a[2];
                graphics = this.a;
                n10 = 1;
                n9 = n5;
                n8 = n14;
                n7 = n17;
                n6 = 1;
            } else {
                if (!bl2) continue;
                a2 = a[2];
                graphics = this.a;
                n10 = 1;
                n9 = n5;
                n8 = n16;
                n7 = n17;
                n6 = 0;
            }
            a2.a(graphics, n10, n9, n8, n7, n6, 0, 0);
        }
    }

    private void aa() {
        int n = b[this.bG][this.bH];
        if ((n & 8) == 0) {
            int n2;
            h h2;
            b = a[32];
            int n3 = n & 7;
            boolean bl = (n & 0x10) == 0;
            if (bl && n3 == 2 || !bl && n3 == 4) {
                h2 = this;
                n2 = 2;
            } else {
                h2 = this;
                n2 = bl ? 1 : 0;
            }
            h2.bL = n2;
            byte by = b[this.bG][this.bH];
            this.bN = by * g[n3];
            this.bO = by * g[n3 + 8];
        }
    }

    private void ab() {
        if ((b[this.bG][this.bH] & 7) == 1 && (a[this.bG][this.bH] & 0xFF) == 35) {
            this.bN = 0;
            this.bO = b[this.bG][this.bH];
        }
    }

    private void ac() {
        b = a[30];
        this.bK = 1;
        this.bL = h.a(b, 1, aN % h.a(b, 1));
    }

    /*
     * Unable to fully structure code
     */
    private void ad() {
        block11: {
            block10: {
                var1_1 = h.b[this.bG][this.bH] & 7;
                h.b = h.a[29];
                if ((h.b[this.bG][this.bH] & 8) != 0) break block10;
                switch (var1_1) {
                    case 1: {
                        v0 = this;
                        v1 = 2;
                        ** GOTO lbl16
                    }
                    case 2: {
                        v0 = this;
                        v1 = 1;
                        ** GOTO lbl16
                    }
                    case 4: {
                        v0 = this;
                        v1 = 0;
lbl16:
                        // 3 sources

                        v0.bL = v1;
                    }
                }
                this.bN = h.b[this.bG][this.bH] * h.g[var1_1];
                v2 = this;
                v3 = h.b[this.bG][this.bH] * h.g[8 + var1_1];
                break block11;
            }
            switch (var1_1) {
                case 1: {
                    v4 = this;
                    v5 = 14;
                    ** GOTO lbl34
                }
                case 2: {
                    v4 = this;
                    v5 = 13;
                    ** GOTO lbl34
                }
                case 4: {
                    v4 = this;
                    v5 = 12;
lbl34:
                    // 3 sources

                    v4.bK = v5;
                }
            }
            this.bL = h.a(h.b, this.bK, (int)h.b[this.bG][this.bH]);
            var2_2 = (h.b.b[this.bK] + this.bL) * 5;
            this.bN = h.b.f[var2_2 + 2];
            v2 = this;
            v3 = h.b.f[var2_2 + 3];
        }
        v2.bO = v3;
    }

    private void ae() {
        int n;
        h h2;
        b = a[29];
        this.bK = b[this.bG][this.bH] & 0x1F;
        if (this.bK == 8 || this.bK == 9) {
            this.bL = 0;
            int n2 = (h.b.b[this.bK] + 0) * 5;
            this.bN = h.b.f[n2 + 2];
            h2 = this;
            n = -b[this.bG][this.bH];
        } else {
            int n3;
            int n4 = (b[this.bG][this.bH] & 0x1FE0) >> 5;
            this.bL = n3 = h.a(b, this.bK, n4);
            int n5 = (h.b.b[this.bK] + n3) * 5;
            this.bN = h.b.f[n5 + 2];
            h2 = this;
            n = h.b.f[n5 + 3];
        }
        h2.bO = n;
    }

    private void af() {
        int n;
        this.bK = (b[this.bG][this.bH] & 0x38) >> 3;
        b = a[27];
        switch (this.bK) {
            case 3: {
                this.bL = 0;
                this.bO = -b[this.bG][this.bH];
                return;
            }
            case 1: {
                h h2 = this;
                n = (b[this.bG][this.bH] >> 1) % a[27].a(1);
                break;
            }
            default: {
                h h2 = this;
                n = b[this.bG][this.bH];
            }
        }
        h2.bL = n;
    }

    private void ag() {
        this.a(this.bx, this.by, false);
    }

    private void a(int n, int n2, boolean bl) {
        Image[] imageArray = a[18];
        int n3 = 0;
        if (bl) {
            n3 = -5;
        }
        this.a.drawImage(imageArray[1], n + 6, n2 + n3, 0);
        this.a.drawImage(imageArray[0], n + 3, n2 + 7, 0);
        if (!bl) {
            int n4 = 0;
            if (this.P < 10) {
                n4 = h.a[0].a[0][0].getWidth() >> 1;
                ++n4;
            }
            h.a(this.a, n + 19 - n4, n2 + 13, this.P, h.a[0].a[0], 0);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void d(int var1_1, int var2_2) {
        var3_3 = this.a;
        for (var4_4 = 0; var4_4 < 12; ++var4_4) {
            for (var5_5 = 0; var5_5 < 12; ++var5_5) {
                var7_7 = var5_5 + this.ar / 24;
                var8_8 = var4_4 + this.as / 24;
                if (var7_7 < 0 || var7_7 >= this.av || var8_8 < 0 || var8_8 >= this.aw) continue;
                var6_6 = h.e[var7_7][var8_8];
                var10_9 = var5_5 * 24 - var1_1;
                var11_10 = var4_4 * 24 - var2_2;
                var12_11 = 0;
                if (var6_6 <= 0) continue;
                var13_12 = 0;
                v0 = var13_12;
                while (v0 <= 2) {
                    block7: {
                        block9: {
                            block8: {
                                if (h.a(var6_6, var13_12, (byte)0, (byte)3) == 0) break block7;
                                var12_11 = (byte)(h.a(var6_6, var13_12, (byte)7, (byte)2) << 3);
                                if (var12_11 > 0) {
                                    var14_13 = h.a(var6_6, var13_12, (byte)0, (byte)3);
                                    var15_14 = h.a(var14_13, (byte)45, (byte)2);
                                    var12_11 = var15_14 <= 1 ? (var12_11 = (byte)(var12_11 - 24)) : (byte)(24 - var12_11);
                                    this.X();
                                    var3_3.clipRect(var10_9, var11_10 + (var13_12 << 3), 24, 8);
                                }
                                var16_15 = ((var15_14 = (var14_13 = this.a(var7_7, var8_8, var6_6, var13_12)) >> 1) == 7 ? h.aN >> 3 : h.aN) & 1;
                                if (var15_14 != 15) break block8;
                                h.d.a(var3_3, var14_13 + this.cC, var10_9 + var12_11 - 8, var11_10 + (var13_12 << 3) + 8, 36, 0, 0);
                                ++this.cC;
                                if (this.cC > 2) {
                                    this.cC = 0;
                                }
                                break block7;
                            }
                            if (var15_14 != 14 && var15_14 != 11) break block9;
                            v1 = h.d;
                            v2 = var3_3;
                            v3 = var14_13 + var16_15;
                            v4 = var10_9 + var12_11;
                            v5 = var11_10;
                            ** GOTO lbl48
                        }
                        if (var15_14 == 8 && var13_12 == 0 && h.e[var7_7][var8_8 - 1] > 0) {
                            h.d.a(var3_3, 33, var10_9 + var12_11, var11_10, 20, 0, 0);
                            var13_12 = 3;
                        } else {
                            v1 = h.d;
                            v2 = var3_3;
                            v3 = var14_13 + var16_15;
                            v4 = var10_9 + var12_11;
                            v5 = var11_10 + (var13_12 << 3);
lbl48:
                            // 2 sources

                            v1.a(v2, v3, v4, v5, 20, 0, 0);
                            this.X();
                        }
                    }
                    v0 = (byte)(var13_12 + 1);
                }
            }
        }
    }

    private void ah() {
        int n;
        h h2;
        this.aE = 20;
        if (a[this.bG][this.bH] >> 8 >= this.ax) {
            h2 = this;
            n = 0 + (aN >> 1) % 7;
        } else {
            h2 = this;
            n = 7;
        }
        h2.aF = n;
    }

    private void m(int n) {
        int n2;
        int n3 = a[this.bG][this.bH] >> 8;
        if (n3 == 255) {
            n3 = 0;
        }
        int n4 = n2 = 14 == n ? 8 : 22;
        if (a[n2] != null) {
            a[n2].a(this.a, 0, n3, this.bx, this.by, 0, 0, 0);
        }
    }

    private void ai() {
        a a2;
        boolean bl = false;
        Graphics graphics = this.a;
        a a3 = a[0];
        if (a3 == null) {
            return;
        }
        graphics.translate(120, 320);
        if (this.m || l == 2) {
            a3.a(graphics, 0, 0, 0, 0, 0, 0);
            if (this.U) {
                a3.a(graphics, 19, 0, 0, 0, 0, 0);
            }
            a2 = a3;
        } else {
            bl = true;
            graphics.setClip(-120, -320, 240, 320);
            a2 = a3;
        }
        a2.a(graphics, 1, 0, 0, 0, 0, 0);
        if (this.n) {
            a3.a(graphics, 2, 0, 0, 0, 0, 0);
            a3.a(graphics, 3 + this.ac, 0, 0, 0, 0, 0);
        }
        if (bl) {
            graphics.setClip(-120, -320, 240, 320);
        }
        if (this.P > 0) {
            this.j = System.currentTimeMillis();
        } else if (System.currentTimeMillis() - this.j < 1500L) {
            h.a(graphics, a[41], a[34], 0, -55, 33, 5, true);
        }
        if (this.n != this.cQ || this.m || this.n <= 1) {
            Image[] imageArray = h.a[0].a[0];
            int n = 0;
            int n2 = this.n <= 1 ? 1 : 0;
            int n3 = -11 - (i[8] - 4) * imageArray[11 + n2].getWidth() / 2;
            graphics.drawImage(imageArray[11 + n2], n3, -29, 0);
            n = 0 + imageArray[11 + n2].getWidth();
            int n4 = imageArray[15].getWidth();
            for (int i = 0; i < h.i[8]; ++i) {
                int n5;
                Image[] imageArray2;
                Graphics graphics2;
                if (this.n <= 1 && i == 0 && (aN >> 2 & 1) == 0 || i < this.n && this.n > 1) {
                    graphics2 = graphics;
                    imageArray2 = imageArray;
                    n5 = 15;
                } else {
                    graphics2 = graphics;
                    imageArray2 = imageArray;
                    n5 = 13;
                }
                graphics2.drawImage(imageArray2[n5 + n2], n3 + n, -29, 0);
                n += n4;
            }
            graphics.drawImage(imageArray[17 + n2], n3 + n, -29, 0);
            this.cQ = this.n;
        }
        if (this.cR != this.aZ || this.cU != this.P || this.m) {
            if (this.P > 0) {
                h.a(graphics, 70, -12, "" + this.aZ + "/" + (this.P + this.aZ), h.a[0].a[0], 0);
            } else {
                h.a(graphics, 70, -12, this.aZ, h.a[0].a[0], 0);
            }
        }
        if (this.cS != this.bb || this.m) {
            this.cS = this.bb;
            h.a(graphics, 107, -12, this.bb, h.a[0].a[0], 0);
        }
        if (this.cT != this.ao || this.m) {
            this.cT = this.ao;
            h.a(graphics, -25, -12, this.ao, h.a[0].a[0], 0);
        }
        graphics.translate(-120, -320);
        graphics.translate(120, 0);
        if (this.m || l == 2) {
            a3.a(graphics, 20, 0, 0, 0, 0, 0);
        }
        if (this.cR != this.aZ || this.cU != this.P || this.m) {
            this.a(-53, 8, this.P <= 0);
        }
        if (this.cV != this.aU || this.cW != this.aV || this.m || l == 2) {
            a3.a(graphics, 21, 0, 0, 0, 0, 0);
            h.a(graphics, 55, 15, this.aU, h.a[0].a[0], 0);
            h.a(graphics, 87, 15, this.aV, h.a[0].a[0], 0);
            this.cV = this.aU;
            this.cW = this.aV;
        }
        graphics.translate(-120, 0);
        this.cR = this.aZ;
        this.cU = this.P;
        this.m = false;
    }

    private void aj() {
        int n;
        h h2;
        b = a[6];
        this.bK = 0;
        if (this.ce == 0) {
            h2 = this;
            n = 0;
        } else if (this.ce == 9) {
            h2 = this;
            n = 2;
        } else {
            h2 = this;
            n = this.cf < 0 ? 1 : 3;
        }
        h2.bL = n;
    }

    private void ak() {
        int n = b[this.bG][this.bH] == 1 ? 1 : 0;
        a a2 = a[5];
        a2.a(this.a, n, (aN >> 1) % a2.a(n), this.bx, this.by, 0, 0, 0);
    }

    private void b(byte by) {
        g g2 = a[4];
        if (by == 23) {
            g2.a = this.bx;
            g2.e |= 1;
        } else {
            g2.e &= 0xFFFFFFFE;
            g2.a = this.bx + 24;
        }
        g2.b = this.by;
        g2.a();
        g2.a(this.a);
    }

    private void n(int n) {
        switch (n) {
            case 0: {
                h.cR();
                System.gc();
                return;
            }
            case 1: {
                return;
            }
            case 2: {
                h.a[41].e = 15;
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
                if (a == null) {
                    a = h.a("/spl.f", 0);
                }
                if (b != null) break;
                b = h.a("/spl.f", 1);
                return;
            }
            case 7: {
                if (a[18] != null) break;
                h.a[18] = h.a("/ui.f", 3);
            }
        }
    }

    private static void al() {
        a = null;
        b = null;
        f = null;
        e = null;
        c = null;
        System.gc();
    }

    private void am() {
        this.cY = a[this.bo].length >> 1;
        this.cZ = 0;
        for (int i = 0; i < this.cY; ++i) {
            int n = h.a(a[41], a[a[this.bo][i * 2 + 1]], 0);
            if (this.bo == 0 && i == 3 || n <= this.cZ) continue;
            this.cZ = n;
        }
        this.dc = 0;
        this.cX = 0;
    }

    private void e(int n, int n2) {
        if (l == 4) {
            this.b(this.a, false);
            for (int i = n - 1; i < n2 - 2; ++i) {
                a[18].a(this.a, 4, i % 2, i, 0, 0, 0);
            }
        }
        if (l == 2) {
            this.a.setColor(0);
            this.a.fillRect(0, n - 1, 240, n2 - 2 - (n - 1));
        }
        this.a.setColor(0xFFFFFF);
        this.a.drawLine(0, n - 1 - 1, 240, n - 1 - 1);
        this.a.drawLine(0, n2 - 1, 240, n2 - 1);
        this.a.setColor(0);
        this.a.drawLine(0, n - 1 - 2, 240, n - 1 - 2);
        this.a.drawLine(0, n2 - 2, 240, n2 - 2);
    }

    private void an() {
        this.Z = false;
        this.Y = h.a();
    }

    private void ao() {
        int n;
        h h2;
        int n2;
        int n3;
        int n4;
        int n5;
        if (this.Z) {
            this.an();
        }
        int n6 = 320 - (this.cY * 15 + 1 + 2);
        n6 += !this.Y && this.bo == 0 ? 15 : 0;
        n6 += !X && this.bo == 0 ? 15 : 0;
        int n7 = 320;
        this.a.setClip(0, 0, 240, 320);
        if (l == 2 && V && W) {
            this.U = false;
            this.Y();
            this.U = true;
            W = false;
        }
        if (l == 7 || l == 2) {
            n5 = n6 - (160 - (320 - n6) / 2);
            n6 -= n5;
            n7 = 320 - n5;
        }
        if (this.bo == 7) {
            a[41].a(this.a, a[this.aM == 5 ? 112 : 123], 120, n6 - 20, 17);
        }
        if (l == 7) {
            int n8;
            int n9;
            int n10;
            int n11;
            Graphics graphics;
            if (this.df != -1 && !V) {
                n5 = n6 + this.df * 15;
                this.a.setColor(0);
                graphics = this.a;
                n11 = 0;
                n10 = n5;
                n9 = 240;
                n8 = 16;
            } else {
                this.a.setColor(0);
                graphics = this.a;
                n11 = 0;
                n10 = 0;
                n9 = 240;
                n8 = 320;
            }
            graphics.fillRect(n11, n10, n9, n8);
        }
        long l = System.currentTimeMillis();
        if (this.de >= 0 && l - this.k > 100L) {
            ++this.de;
            this.k = l;
        }
        if (this.df != -1 && !V) {
            n4 = this.bo == 0 && this.df > 1 && !this.Y ? 15 : 0;
            n4 = n4 + (this.bo == 0 && this.df > 2 && !X ? 15 : 0);
            n3 = n6 + this.df * 15 - n4;
            this.a.setClip(0, n3, 240, 16);
        }
        if (this.df != this.bq || V) {
            this.e(n6, n7);
        }
        for (n4 = 0; n4 < this.cY; ++n4) {
            int n12;
            int n13;
            int n14;
            block37: {
                int n15;
                int n16;
                int n17;
                int n18;
                Graphics graphics;
                block36: {
                    int n19;
                    Graphics graphics2;
                    block35: {
                        block33: {
                            block34: {
                                if (this.df != -1 && n4 != this.df && n4 != this.bq && !V || this.bo == 0 && n4 == 1 && !this.Y || this.bo == 0 && n4 == 2 && !X) continue;
                                n3 = n6 + n4 * 15;
                                n14 = n3 + 7;
                                if (this.bo == 0 && n4 > 1 && !this.Y) {
                                    n3 -= 15;
                                    n14 -= 15;
                                }
                                if (this.bo == 0 && n4 > 2 && !X) {
                                    n3 -= 15;
                                    n14 -= 15;
                                }
                                n2 = 0;
                                if (n4 == 2 && this.bo == 0 && X) {
                                    n2 = 1;
                                }
                                if (this.i != 2 || n4 != 4 || this.bo != 1) break block33;
                                n2 = 0;
                                if (n4 != this.bq) break block34;
                                graphics2 = this.a;
                                n19 = 0x666666;
                                break block35;
                            }
                            this.a.setColor(0xCCCCCC);
                            graphics = this.a;
                            n18 = 0;
                            n17 = n14 - 7 + 1;
                            n16 = 240;
                            n15 = 14;
                            break block36;
                        }
                        if (n4 != this.bq) break block37;
                        graphics2 = this.a;
                        n19 = 13540096;
                    }
                    graphics2.setColor(n19);
                    graphics = this.a;
                    n18 = 0;
                    n17 = n14 - 7;
                    n16 = 240;
                    n15 = 16;
                }
                graphics.fillRect(n18, n17, n16, n15);
            }
            int n20 = 0;
            boolean bl = false;
            a[41].a(a[a[this.bo][n4 * 2 + 1]]);
            int n21 = n13 = a.c;
            int n22 = n12 = n4 == 2 && this.bo == 0 && X ? 152 : 210;
            if (n13 > n12) {
                bl = true;
                n13 = n12;
            }
            int n23 = 120 - n13 / 2;
            if (bl) {
                n20 = n4 == this.bq ? this.db : 0;
                this.a.setClip(n23, n3, n13, 15);
            }
            h.a[41].b = n2;
            a[41].a(this.a, a[a[this.bo][n4 * 2 + 1]], 120 - n13 / 2 - n20, n14 + 1, 6);
            if (bl) {
                this.a.setClip(0, 0, 240, 320);
            }
            if (n4 == this.bq) {
                this.a.setColor(0xFFFFFF);
                a[18].a(this.a, 2, 120 - n13 / 2 - 8, n14, 0, 0, 10);
                a[18].a(this.a, 2, 120 + n13 / 2 + 8, n14, 0, 0, 6);
            }
            if (n4 != this.bq || !bl || this.cX % 2 != 0) continue;
            this.db += this.da;
            if (this.db >= -5 && this.db + n12 - 5 <= n21) continue;
            this.da = -this.da;
            this.db += this.da;
        }
        this.df = this.bq;
        ++this.cX;
        if (this.dd < 0) {
            h2 = this;
            n = 3;
        } else {
            h h3 = this;
            h2 = h3;
            n = h2.dd = h3.dd - 1;
        }
        if (this.dd == 0 && this.dc + 1 < this.cY) {
            ++this.dc;
        }
        this.a.setClip(0, 0, 240, 320);
        if (this.bo == 0 && X && this.an) {
            n4 = this.cX % 20;
            if (n4 >= 10) {
                a[18].a(this.a, 1, 1, n6 + 30 + 7 - (this.Y ? 0 : 15), 0, 0, 6);
            } else if (this.bq != 2) {
                if (e == null) {
                    n3 = n6 + 30 + 1 - (this.Y ? 0 : 15);
                    e = Image.createImage(28, 14);
                    Graphics graphics = e.getGraphics();
                    graphics.translate(-1, -n3);
                    this.b(graphics, false);
                    graphics.translate(1, n3);
                    for (n2 = 0; n2 < 14; ++n2) {
                        a[18].a(graphics, 4, (n3 + n2 + 1) % 2, n2, 0, 0, 0);
                    }
                }
                this.a.drawImage(e, 1, n6 + 30 + 1 - (this.Y ? 0 : 15), 0);
            }
        }
        if (this.bo != 0 && this.bo != 3 && this.bo != 1 && this.bo != 7) {
            this.a();
        }
        this.b();
        V = false;
        if (this.de == 2) {
            if (h.l == 2) {
                V = true;
                W = true;
            }
            this.de = -1;
            this.m = true;
            this.df = -1;
            this.q();
        }
    }

    public final void a() {
        a[18].a(this.a, 0, 223, 308, 0, 0, 0);
    }

    public final void b() {
        a[18].a(this.a, 3, 2, 308, 0, 0, 0);
    }

    private void ap() {
        Graphics graphics = this.a;
        graphics.setColor(0);
        graphics.fillRect(0, 0, 240, 320);
        int n = (this.bs + 1) * 230 / this.br;
        if (n > 230) {
            n = 230;
        }
        graphics.setColor(13540096);
        this.a.fillRect(5, 310, n, 6);
        graphics.setColor(16554500);
        this.a.drawRoundRect(4, 309, 231, 6, 2, 2);
        h.a[41].b = 0;
        a[41].a(this.a, a[37], 120, 293, 1);
    }

    private void aq() {
        switch (this.i) {
            case 2: {
                this.ay();
                this.ar();
                return;
            }
            case 1: {
                this.aw();
                return;
            }
            case 3: {
                this.at();
                return;
            }
            case 4: {
                this.av();
                return;
            }
            case 5: {
                this.as();
            }
        }
    }

    private void ar() {
        if (this.ar + 240 > 1440 && this.as + 320 > 48) {
            if (a[10] == null) {
                h.a[10] = h.a("/mmv.f", 0);
            }
            a a2 = a[10];
            if (this.d(60, 3) || this.d(61, 3)) {
                a2.a(this.a, 1, 1440 - this.ar, 48 - this.as, 0, 0, 0);
            }
        }
        if (this.aP > 55 && this.c) {
            a[0].a(this.a);
        }
    }

    private void c(Graphics graphics) {
        if (a[10] == null) {
            h.a[10] = h.a("/mmv.f", 0);
        }
        if (this.bG >= 60 && this.bG < 65 && this.bH >= 2 && this.bH < 7) {
            a[10].a(graphics, 4 + (this.bH - 2) * 5 + this.bG - 60, this.bx, this.by, 0, 0, 0);
        }
    }

    private void as() {
        if (this.ad != -1) {
            g g2 = a[5];
            a[5].a = this.ai - this.ar;
            g2.b = 504 - this.as;
            g2.a();
            g2.a(this.a);
            if (this.ad == 12) {
                int n = this.ai - this.ar + aN * this.ae % 48;
                int n2 = h.a[5].b + 24;
                a[7].a(this.a, 0, aN % a[7].a(1), n, n2, 0, 0, 0);
                this.k(n, n2);
            }
        }
    }

    private void at() {
        int n;
        if (this.i == 3 && (long)aN >= this.o + 80L) {
            for (n = 14; n <= 21; ++n) {
                h.b[n][15] = 0;
                h.a[n][15] = -1;
                h.a[n][15] = 44;
                h.b[n][15] = 0;
                h.c[n][15] = 24;
            }
            this.o = 0L;
        }
        if (this.ad != 15) {
            if (this.ar + 240 + 48 >= this.ah && this.as + 320 + 48 >= 504) {
                g g2 = a[5];
                a[5].a = this.ah - this.ar;
                g2.b = 504 - this.as;
                g2.a();
                g2.a(this.a);
            }
            if (this.ad == 12) {
                n = this.ah - this.ar + aN * this.ae % 48;
                int n2 = h.a[5].b + 24;
                a[7].a(this.a, 0, aN % a[7].a(0), n, n2, 0, 0, 0);
                this.k(n, n2);
            }
        }
    }

    private void au() {
        Graphics graphics = this.a;
        g g2 = a[5];
        if (this.ad == 7) {
            int n = g2.a + aN * this.ae % 48;
            int n2 = g2.b;
            if (this.H == 10) {
                n2 -= 144;
            }
            a[7].a(graphics, 1, aN % a[7].a(1), n, n2, 0, 0, 0);
            this.k(n, n2);
            return;
        }
        if (this.ad != 8 && this.ad != 0) {
            this.a(graphics, 3);
        }
    }

    private void a(Graphics graphics, int n) {
        int n2 = n * 14 + 2;
        int n3 = 240 - n2 >> 1;
        if (this.af > 0) {
            graphics.setColor(0);
            graphics.fillRect(n3, 5, n2, 12);
            graphics.setColor(3913615);
            for (int i = 0; i < this.af; ++i) {
                graphics.fillRect(n3 + 2 + i * 14, 7, 12, 8);
            }
        }
    }

    private void av() {
        int n;
        g g2;
        g g3;
        Graphics graphics;
        block14: {
            int n2;
            block15: {
                g g4;
                int n3;
                block13: {
                    block12: {
                        int n4;
                        graphics = this.a;
                        g3 = a[5];
                        g2 = a[4];
                        switch (this.ad) {
                            case 1: {
                                n4 = this.ae * 1;
                                break;
                            }
                            case 2: 
                            case 7: {
                                n4 = 40;
                                break;
                            }
                            case 3: {
                                n4 = 40;
                                break;
                            }
                            case 4: {
                                n4 = 40 - (this.ae * 2 << 1);
                                break;
                            }
                            case 5: {
                                n3 = 15 + this.ae * 18;
                                this.aa = false;
                                break block12;
                            }
                            case 9: {
                                n4 = 15 + this.ae * 18;
                                break;
                            }
                            case 10: {
                                n4 = 15 + this.ae * 18;
                                break;
                            }
                            case 11: {
                                n4 = 15 + this.ae * 18;
                                break;
                            }
                            default: {
                                n4 = -1000;
                            }
                        }
                        n3 = n4;
                    }
                    g3.a = (10 + this.ag * (2 + (this.ag > 0 ? 1 : 0))) * 24 - this.ar;
                    if (this.ad != 5) break block13;
                    n = g3.b;
                    g3.b = 256 - this.as - this.I - 15;
                    if (this.h() != 3) break block14;
                    g4 = g3;
                    n2 = n;
                    break block15;
                }
                g4 = g3;
                n2 = 256 - n3 - this.as;
            }
            g4.b = n2;
        }
        g3.a(graphics);
        if (this.i) {
            g2.b = 96 - this.as;
            g2.a = (this.g() + 1) * 24 - this.ar;
            g2.a(graphics);
        }
        for (n = 0; n < 3; ++n) {
            int n5 = (n * (2 + (n > 0 ? 1 : 0)) + 10) * 24 - this.ar;
            if (n5 >= 240 || n5 <= -48 || this.as <= -80) continue;
            a[40].a(graphics, 1, n5, 216 - this.as, 0, 0, 0);
        }
    }

    private void aw() {
        int n;
        int n2 = aN;
        g g2 = a[2];
        if (this.as + this.bk < 1008 && this.as + this.bk > 592) {
            g2.a = 240 - this.ar;
            g2.b = 1008 - this.as;
            g2.a();
            g2.a(this.a);
            g2.a = 336 - this.ar;
            g2.b = 1008 - this.as;
            g2.a();
            g2.e = 1;
            g2.a(this.a);
        }
        if (this.bj > 10) {
            this.ax();
        }
        int n3 = this.aw * 24 - this.aa - this.as;
        int n4 = n = 168 - this.ar;
        int n5 = n + 240;
        while (n <= -24) {
            n += 24;
        }
        g g3 = a[1];
        if ((this.aa >= 816 || g3.f == 2) && this.aa > 816) {
            for (int i = n3 + 20; i < 320; i += 24) {
                for (int j = n; j < n5; j += 24) {
                    g3.a.a(this.a, 1, ((n2 >> 1) + j + i) % 2, j, i, 0, 0, 0);
                }
            }
        }
        if (g2.f == 2) {
            g3.e = 0;
            g3.a = n4 + 120;
            g3.b = n3;
            g3.a();
            g3.a(this.a);
            g3.e = 1;
            g3.a(this.a);
            this.az();
        }
    }

    private void ax() {
        for (int i = 3; i < 13; i += 2) {
            int n = 10 * (2 * i / 5 + 1);
            int n2 = (n + aN / n) * i % 240;
            int n3 = 320 / n * aN % 320;
            this.a.drawImage(a[27][i & 1], n2, n3, 0);
        }
    }

    private void ay() {
        if (this.r && this.a == null && this.bm == -1) {
            a[15].a(this.a, 0, aN >> 1 & 3, this.bv, this.bw - 24, 0, 0, 0);
        }
    }

    private void az() {
        Graphics graphics = this.a;
        int n = (aN << 3) % 160;
        int n2 = (aN / 160 & 1) == 0 ? 160 - n : 0 + n;
        graphics.setColor(255, n2, 0);
        graphics.drawRect(0, 0, 239, 319);
    }

    private void aA() {
        int n;
        int n2;
        int n3;
        if (this.C) {
            return;
        }
        int n4 = this.aP;
        int n5 = this.aQ;
        int n6 = aN;
        int n7 = this.aS & 7;
        int n8 = (this.aS & 0x4000) == 0 ? 0 : 3;
        g g2 = a[n8];
        boolean bl = this.b();
        int n9 = n3 = (this.aS & 0x800) == 0 ? this.bQ : this.aS & 7;
        if (!this.c) {
            return;
        }
        this.bv = n4 * 24 + g[n3] * this.aR - this.ar;
        this.bw = n5 * 24 + g[n3 + 8] * this.aR - this.as;
        if ((this.b <= 0L || (n6 >> 1 & 1) == 0) && this.aT <= 0) {
            g2.a = this.bv;
            g2.b = this.bw;
            if (e != null && bl && n7 != 1 && n7 != 3 && e[n4][n5 + 1] != 0 && h.j(n4, n5 + 1)) {
                n2 = (n6 >> 1) + n4;
                n = n2 % 4;
                if ((n2 / 4 & 1) == 1) {
                    n = 4 - n;
                }
                g2.b += n;
            }
            g2.a();
            g2.a(this.a);
            n2 = g2.f;
            D = n2 == 47 && g2.g == 0;
            switch (n2) {
                case 40: 
                case 47: 
                case 48: {
                    if (g2.g <= (n2 == 40 ? 13 : 6) && n2 != 47) break;
                    try {
                        n = 0;
                        if (this.aA == 30 || this.aA == 31 || this.aA == 32) {
                            n = -2;
                        }
                        if (a[this.aA] == null) {
                            a[h.a(this.aA)].a(this.a, this.aB, g2.a + n, g2.b - 24, 0, 0, 0);
                        } else {
                            this.a.drawImage(a[this.aA][this.aB], g2.a + n, g2.b - 24, 0);
                        }
                    }
                    catch (Exception exception) {}
                    if (this.aC <= 0) break;
                    h.a(this.a, g2.a + 24, g2.b - 10, this.aC, h.a[0].a[0], 0);
                    break;
                }
                case 17: 
                case 18: {
                    if (g2.g != 0) break;
                    this.a.drawImage(a[this.aA][this.aB], g2.a, g2.b - 12, 0);
                }
            }
        }
        if (bl && a[n4][n5] == 0) {
            n2 = b[n4][n5] & 7;
            n = b[n4][n5];
            try {
                a[h.a(1)].a(this.a, 0 + (b[n4][n5] & 0x38), n4 * 24 - this.ar + g[n2] * n, n5 * 24 - this.as + g[n2 + 8] * n, 0, 0, 0);
                return;
            }
            catch (Exception exception) {}
        }
    }

    private void aB() {
        int n;
        int n2;
        int n3 = this.bG;
        int n4 = this.bH;
        int n5 = n4 + 1;
        this.bz = 0;
        this.bA = 0;
        this.y = false;
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
                this.bL = h.a(b, 0, aN % h.a(b, 0));
                break;
            }
            case 8: {
                this.aG = 16;
                this.aH = 0 + (aN >> 1 & 1);
                break;
            }
            case 5: {
                this.aG = 25;
                this.aH = 0 + this.bR;
                break;
            }
            case 6: {
                this.aG = 5;
                this.aH = 0;
                break;
            }
            case 7: {
                this.aG = 5;
                this.aH = 1;
                break;
            }
            case 9: {
                b = a[(n6 & 0xFC00000) >> 22];
                this.bL = 0;
                break;
            }
            case 4: {
                this.aG = 24;
                this.aH = 0 + this.bR;
                break;
            }
            case 0: {
                boolean bl2;
                n2 = (n6 & 0x38) >> 3;
                n = (n6 & 0x7000) >> 12;
                boolean bl3 = bl2 = (n6 & 0x10000) == 0;
                if (!bl && n7 == 0 && h.j(n3, n5)) {
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
                h.b[n3][n4] = n6;
                this.aG = 1;
                this.aH = 0 + n2;
                break;
            }
            case 1: {
                this.aG = 2;
                this.aH = 0 + this.bR;
                break;
            }
            case 2: {
                this.aE();
            }
        }
        if (bl || e != null && e[n3][n5] != 0 && h.j(n3, n5)) {
            n2 = (aN >> 1) + n3;
            n = n2 % 4;
            if ((n2 / 4 & 1) == 1) {
                n = 4 - n;
            }
            this.bO += n;
        }
        if (((n6 & 0x200) != 0 || a[n3 - g[n7]][n5] < 0 && h.j(n3, n5) && (b[n3][n5] & 7) == 0 && n3 != this.bg && n4 != this.bh) && (this.aS & 8) == 0) {
            this.bO += by * by / 24;
            if (this.bI != 9) {
                this.bN += -1 + aN % 3;
            }
        }
        if ((n6 & 0x200) != 0) {
            this.bN = -this.bN;
        }
        if (this.bI == 0) {
            this.bD = ((n6 & 0x1C0) >> 6) - 1;
            if (this.bD >= 0 && this.bD < 5) {
                int n8;
                this.y = true;
                switch (n6 & 7) {
                    case 4: {
                        h h2 = this;
                        n8 = 24;
                        break;
                    }
                    case 2: {
                        h h2 = this;
                        n8 = -24;
                        break;
                    }
                    default: {
                        h h2 = this;
                        n8 = 0;
                    }
                }
                h2.bz = n8;
                this.bA = 13;
                this.bB = this.bG;
                this.bC = this.bH - 1;
            }
        }
        this.ab();
    }

    private void aC() {
        int n;
        h h2;
        int n2 = this.bG;
        int n3 = this.bH;
        int n4 = b[n2][n3];
        byte by = b[n2][n3];
        int n5 = n4 & 7;
        this.bN = by * g[n5];
        this.bO = by * g[n5 + 8];
        b = a[38];
        int n6 = (n4 & 0x7000) >> 12;
        if ((n6 == 2 || n6 == 4 || n5 == 2 || n5 == 4) && a[n2 - 1][n3] >= 0 && a[n2 + 1][n3] >= 0 || (n6 == 1 || n6 == 3 || n5 == 1 || n5 == 3) && a[n2][n3 - 1] >= 0 && a[n2][n3 + 1] >= 0) {
            this.bK = 1;
            h2 = this;
            n = 0;
        } else {
            int n7;
            h h3;
            if (n5 == 1 || n5 == 3) {
                h3 = this;
                n7 = n5 - 1;
            } else {
                h3 = this;
                n7 = 0;
            }
            h3.bK = n7;
            h2 = this;
            n = (aN >> 1) % b.a(this.bK);
        }
        h2.bL = n;
        this.ab();
    }

    /*
     * Unable to fully structure code
     */
    private void c(byte var1_1) {
        block10: {
            block9: {
                block8: {
                    block7: {
                        var2_2 = h.b[this.bG][this.bH];
                        var3_3 = h.b[this.bG][this.bH];
                        var4_4 = var2_2 & 7;
                        this.bN = var3_3 * h.g[var4_4];
                        this.bO = var3_3 * h.g[var4_4 + 8];
                        var5_5 = var1_1 == 19 ? 4 : 21;
                        h.b = h.a[var5_5];
                        if (this.ap != 1) break block7;
                        var6_6 = (var2_2 & 248) >> 3;
                        if (var6_6 > 0) {
                            v0 = this;
                            v1 = 2;
                        } else {
                            v0 = this;
                            v1 = 0;
                        }
                        v0.bK = v1;
                        v2 = this;
                        v3 = h.aN;
                        v4 = h.b;
                        ** GOTO lbl-1000
                    }
                    var6_7 = (var2_2 & 248) >> 3;
                    if (var6_7 <= 0) break block8;
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
        v3 = h.aN >> 1;
        v4 = h.b;
        if (this.bK < 0) {
            v7 = 0;
        } else lbl-1000:
        // 2 sources

        {
            v7 = this.bK;
        }
        v2.bL = v3 % v4.a(v7);
        this.ab();
    }

    private void aD() {
        block6: {
            int n;
            block3: {
                h h2;
                int n2;
                int n3;
                block4: {
                    block5: {
                        block2: {
                            n3 = this.bG;
                            n2 = this.bH;
                            this.aE = 26;
                            this.aF = 0;
                            if (!h.j(n3, n2) || b[n3][n2] > 12) break block2;
                            h2 = this;
                            n = -(b[n3][n2] - 12);
                            break block3;
                        }
                        if (!this.d(n3, n2)) break block4;
                        if ((this.aS & 0x1000) != 0) break block5;
                        if (this.aR > 12) break block6;
                        h2 = this;
                        n = -(this.aR - 12);
                        break block3;
                    }
                    h2 = this;
                    n = 12;
                    break block3;
                }
                if (!(this.d(n3 - 1, n2) ? this.bQ == 4 && this.aR > 12 : this.d(n3 + 1, n2) && this.bQ == 2 && this.aR > 12)) break block6;
                h2 = this;
                n = this.aR - 12;
            }
            h2.bO = n;
        }
        this.bO += 24;
        this.bP = 36;
    }

    private void aE() {
        block2: {
            int n;
            a[] aArray;
            int n2;
            block4: {
                h h2;
                int n3;
                block3: {
                    n3 = a[this.bG][this.bH] & 0xFF;
                    n2 = a[this.bG][this.bH] >> 8;
                    if ((n3 == 14 || n3 == 33) && n2 <= 11) break block2;
                    this.aG = 3;
                    this.aH = 0 + this.bR;
                    if (n3 != 14) break block3;
                    h2 = this;
                    aArray = a;
                    n = 8;
                    break block4;
                }
                if (n3 != 33) break block2;
                h2 = this;
                aArray = a;
                n = 22;
            }
            h2.bO = -(aArray[n].a(0) - n2);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void aF() {
        block16: {
            block15: {
                var1_1 = this.bG;
                var2_2 = this.bH;
                this.aG = 6;
                var3_3 = (h.b[var1_1][var2_2] & 3840) >> 8;
                if (var3_3 >= 4) {
                    this.aG = -1;
                    return;
                }
                if (var3_3 == 0) {
                    v0 = this;
                    v1 = 0 + (h.aN >> 1) % 3;
                } else {
                    v0 = this;
                    v1 = 3 + var3_3 - 1;
                }
                v0.aH = v1;
                var4_4 = h.b[var1_1][var2_2] & 7;
                this.bN = h.b[var1_1][var2_2] * h.g[var4_4] + 2;
                this.bO = h.b[var1_1][var2_2] * h.g[var4_4 + 8] + 2;
                if ((h.b[var1_1][var2_2] & 16) != 0) break block15;
                switch (var4_4) {
                    case 1: {
                        this.bN += 4;
                        break block16;
                    }
                    case 2: {
                        v2 = this;
                        v3 = v2;
                        v4 = v2.bO + 4;
                        ** GOTO lbl35
                    }
                    case 3: {
                        this.bN -= 4;
                        break block16;
                    }
                    case 4: {
                        v5 = this;
                        v3 = v5;
                        v4 = v5.bO - 4;
lbl35:
                        // 2 sources

                        v3.bO = v4;
                    }
                }
                return;
            }
            switch (var4_4) {
                case 1: {
                    this.bN -= 4;
                    return;
                }
                case 2: {
                    v6 = this;
                    v7 = v6;
                    v8 = v6.bO - 4;
                    ** GOTO lbl54
                }
                case 3: {
                    this.bN += 4;
                    return;
                }
                case 4: {
                    v9 = this;
                    v7 = v9;
                    v8 = v9.bO + 4;
lbl54:
                    // 2 sources

                    v7.bO = v8;
                }
            }
        }
    }

    private void aG() {
        int n;
        h h2;
        int n2;
        int n3;
        this.a.setColor(13883367);
        byte by = b[this.bG][this.bH];
        if ((b[this.bG][this.bH] & 1) != 0) {
            n3 = this.bx;
            n2 = this.bx + 24 - by;
            h2 = this;
            n = 0;
        } else {
            n3 = this.bx + 24;
            n2 = this.bx + by;
            h2 = this;
            n = 1;
        }
        h2.bL = n;
        this.a.drawLine(n3, this.by + 12, n2, this.by + 12);
        if (by > 0) {
            h.a[0].a.a(this.a, this.bL, n2, this.by + 12 - 2, 0);
        }
    }

    private void aH() {
        byte by;
        h h2;
        int n = a[this.bG][this.bH] >> 8;
        int n2 = this.aE = this.bJ == 9 ? 22 : 23;
        if ((n & 0x200) != 0) {
            h2 = this;
            if (this.bJ == 9) {
                // empty if block
            }
            by = (byte)(1 + (aN >> 2) % 6);
        } else if ((n & 0x100) != 0) {
            h2 = this;
            by = 1;
        } else {
            h2 = this;
            by = 0;
        }
        h2.aF = by;
    }

    private void aI() {
        int n = this.bG;
        int n2 = this.bH;
        int n3 = a[n][n2] >> 8;
        int n4 = ((n3 & 0xF0) >> 4) - 1;
        if (n4 < 0) {
            n4 = 0;
        }
        if ((a[n][n2 - 1] & 0xFF) != 9 && (a[n][n2 - 1] & 0xFF) != 8) {
            a[56].a(this.a, n4, this.bx, this.by, 0, 0, 0);
        }
        this.aE = 4;
        this.aF = (byte)(n4 + 3);
    }

    private void aJ() {
        int n = aN;
        int n2 = b[this.bG][this.bH];
        int n3 = b[this.bG][this.bH];
        if (n3 > 24) {
            n3 = 24;
        }
        int n4 = n2 & 7;
        this.bN = n3 * g[n4];
        this.bO = n3 * g[n4 + 8];
        if ((n2 & 8) == 0) {
            this.aG = 10;
            this.aH = (n >> 1) % 3;
            if (n4 != 3) {
                int n5 = (n >> 1) % 5;
                this.a.drawImage(a[10][3 + n5], this.bx + this.bN - n5 * 4, this.by + (this.bO + 24), 36);
                return;
            }
        } else {
            this.aG = 10;
            this.aH = 2 - (n >> 1) % 3;
            if (n4 != 3) {
                int n6 = (n >> 1) % 5;
                this.a.drawImage(a[10][8 + n6], this.bx + 24 - 12 + this.bN + n6 * 3, this.by + (this.bO + 24), 36);
                if ((n >> 1 & 1) == 0 && a[this.bG - 1][this.bH] >= 0) {
                    --this.bN;
                    ++this.bO;
                }
            }
        }
    }

    private void aK() {
        int n;
        a a2;
        if (a[this.bG][this.bH + 1] == 16) {
            return;
        }
        int n2 = b[this.bG][this.bH];
        b = a2 = a[1];
        byte by = b[this.bG][this.bH];
        int n3 = 0;
        int n4 = this.bK = (n2 & 7) == 4 ? 1 : 0;
        if (by != 0) {
            n = 0;
            for (int i = 36 - by; i > 0; i -= a2.a(this.bK, n)) {
                n3 = n++;
            }
        }
        this.bL = n3;
        n = (a2.b[this.bK] + n3) * 5;
        this.bN = a2.f[n + 2];
    }

    private void aL() {
        int n = b[this.bG][this.bH];
        b = a[28];
        this.bK = n & 0xF;
        int n2 = (b[this.bG][this.bH] & 0x1FE000) >> 13;
        if (this.bK == 10) {
            int n3;
            int n4 = 0;
            int n5 = b.a(this.bK);
            int n6 = n3 = 0;
            for (int i = n2; i > 0; i -= b.a(this.bK, n3)) {
                n4 = n3;
                n6 = (n3 + 1) % n5;
            }
            this.bL = n4;
        } else {
            int n7;
            this.bL = n7 = h.a(b, this.bK, n2);
            int n8 = (h.b.b[this.bK] + n7) * 5;
            this.bN = h.b.f[n8 + 2];
            this.bO = h.b.f[n8 + 3];
        }
        this.ab();
    }

    private static int a(a a2, int n, int n2) {
        int n3 = 0;
        int n4 = 0;
        while (n2 > 0) {
            n2 -= a2.a(n, n4);
            n3 = n4++;
        }
        return n3;
    }

    private static int b(a a2, int n, int n2) {
        int n3 = 0;
        for (int i = 0; i < n2; ++i) {
            n3 += a2.a(n, i);
        }
        return n3;
    }

    private void aM() {
        block51: {
            block52: {
                int n;
                int n2;
                int n3;
                int n4;
                int n5;
                block50: {
                    int n6;
                    int n7;
                    byte[] byArray;
                    int n8;
                    int n9;
                    boolean bl;
                    n5 = this.bE;
                    n4 = this.bF;
                    h.c[n5][n4] = 24;
                    int n10 = (b[n5][n4] & 0x1C00) >> 10;
                    n3 = b[n5][n4] & 0xF;
                    int n11 = 0;
                    boolean bl2 = bl = (a[n5][n4] & 0xFF) == 35;
                    if (n3 == 10) {
                        n11 = 100;
                    } else {
                        n9 = a[28].a(n3);
                        for (n8 = 0; n8 < n9; ++n8) {
                            n11 += a[28].a(n3, n8);
                        }
                    }
                    n9 = (b[n5][n4] & 0x1FE000) >> 13;
                    h.b[n5][n4] = b[n5][n4] & 0xFFE01FFF | ++n9 << 13;
                    if (n3 >= 4 && n3 <= 9) {
                        byArray = b[n5];
                        n7 = n4;
                        n6 = 12;
                    } else {
                        byArray = b[n5];
                        n7 = n4;
                        n6 = byArray[n7] = 0;
                    }
                    if (n9 > n11 >> 1) {
                        if (!bl) {
                            if (this.d(n5, n4) && n3 != 10) {
                                int n12;
                                switch (n3) {
                                    case 4: 
                                    case 5: {
                                        n12 = 1;
                                        break;
                                    }
                                    case 6: {
                                        n12 = 2;
                                        break;
                                    }
                                    case 7: 
                                    case 8: {
                                        n12 = 3;
                                        break;
                                    }
                                    case 9: {
                                        n12 = 4;
                                        break;
                                    }
                                    default: {
                                        n12 = h[this.aS & 7];
                                    }
                                }
                                n8 = n12;
                                this.a(1, 48, n8);
                            }
                            if (this.i(n5, n4)) {
                                h.a[n5][n4] = -1;
                                this.p(n5, n4);
                                return;
                            }
                        }
                        if (n9 >= n11) {
                            boolean bl3;
                            int n13;
                            int n14;
                            boolean bl4;
                            h.q(n5, n4);
                            n2 = this.a(n5, n4, this.aP, this.aQ, true);
                            boolean bl5 = false;
                            switch (n3) {
                                case 0: 
                                case 3: 
                                case 4: 
                                case 7: 
                                case 9: {
                                    bl5 = true;
                                }
                            }
                            boolean bl6 = bl4 = n2 == 4;
                            if (bl5 != bl4) {
                                n = bl4 ? 3 : 2;
                                n14 = n5;
                                n13 = n4;
                            } else {
                                int n15;
                                n14 = n5 - g[n2];
                                n13 = n4 - g[8 + n2];
                                if (bl4) {
                                    if (this.d(n14, n13) && n3 != 0) {
                                        n = 0;
                                        n14 = n5;
                                        n13 = n4;
                                    } else {
                                        switch (n2) {
                                            case 1: {
                                                n15 = 4;
                                                break;
                                            }
                                            case 4: {
                                                n15 = 9;
                                                break;
                                            }
                                            case 3: {
                                                n15 = 7;
                                                break;
                                            }
                                            default: {
                                                n15 = 0;
                                                break;
                                            }
                                        }
                                    }
                                } else if (this.d(n14, n13) && n3 != 1) {
                                    n = 1;
                                    n14 = n5;
                                    n13 = n4;
                                } else {
                                    switch (n2) {
                                        case 1: {
                                            n15 = 5;
                                            break;
                                        }
                                        case 2: {
                                            n15 = 6;
                                            break;
                                        }
                                        case 3: {
                                            n15 = 8;
                                            break;
                                        }
                                        default: {
                                            n15 = n = 1;
                                        }
                                    }
                                }
                            }
                            if (!(bl3 = a[n14][n13] < 0) || bl) {
                                if (n14 != n5 || n13 != n4) {
                                    n = 0;
                                }
                                n14 = n5;
                                n13 = n4;
                            }
                            h.a[n5][n4] = -1;
                            h.b[n14][n13] = 0;
                            h.b[n14][n13] = n10 << 10 | n;
                            h.b[n14][n13] = b[n14][n13] & 0xFFE01FFF;
                            h.a[n14][n13] = 45;
                        }
                    }
                    if (!bl) break block50;
                    if (!this.d(n5, n4) || n3 == 10) break block51;
                    break block52;
                }
                n = n5;
                n2 = n4;
                switch (n3) {
                    case 7: 
                    case 8: {
                        --n2;
                        break;
                    }
                    case 10: {
                        n = -1;
                        n2 = -1;
                        break;
                    }
                    case 9: {
                        ++n;
                        break;
                    }
                    case 6: {
                        --n;
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
                        ++n2;
                    }
                }
                if (!this.d(n, n2)) break block51;
            }
            this.a(1, 48, (int)h[this.aS & 7]);
        }
    }

    private void aN() {
        int n;
        int n2;
        int n3;
        Graphics graphics;
        a a2;
        int n4;
        int n5;
        int n6 = -1;
        int n7 = 3;
        int n8 = b[this.bG][this.bH];
        if ((n8 & 7) == 3) {
            n6 = 1;
            n7 = 0;
        }
        if ((n8 & 8) == 0) {
            n5 = this.aJ;
            n4 = this.aI;
        } else {
            n5 = this.aL;
            n4 = this.aK;
        }
        int n9 = n4;
        for (int i = 0; i < n5; ++i) {
            a[11].a(this.a, n7 + i * n6, this.bx + 3, this.by + n6 * (n9 - i * 24), 0, 0, 0);
        }
        if (n6 == 1) {
            a2 = a[42];
            graphics = this.a;
            n3 = a[this.bG][this.bH - 1] - 80;
            n2 = this.bx;
            n = this.by - 24;
        } else {
            a2 = a[42];
            graphics = this.a;
            n3 = a[this.bG][this.bH + 1] - 80;
            n2 = this.bx;
            n = this.by + 24;
        }
        a2.a(graphics, n3, n2, n, 0, 0, 0);
    }

    private void aO() {
        g g2 = a[0];
        this.a.setColor(0);
        this.a.fillRect(0, 0, 240, 320);
        g2.b = 136;
        int n = 0;
        if (aN > 30) {
            g2.a = 139;
            g2.a(1);
            int n2 = (aN - 30) * 4;
            if (n2 > 29) {
                int n3;
                int n4;
                int n5;
                Graphics graphics;
                a a2;
                n2 = 29;
                if (aN < 42) {
                    int n6 = 42 - aN;
                    n = 0 + n6 * n6 % ((n6 >> 1) + 1);
                    a2 = g2.a;
                    graphics = this.a;
                    n5 = 10;
                    n4 = 138;
                    n3 = 136 + n;
                } else {
                    a2 = g2.a;
                    graphics = this.a;
                    n5 = 4;
                    n4 = 138;
                    n3 = 136;
                }
                a2.a(graphics, n5, n4, n3, 0, 0, 0);
                g2.g = 0;
            } else {
                g2.a.a(this.a, 10, 138, 136, 0, 0, 0);
            }
            g2.b = 136 + n2;
        } else {
            g2.a = aN * 4 - 1 + 18;
        }
        g2.b += n;
        g2.a(this.a);
        g2.a.a(this.a, 5, 138, 160 + n, 0, 0, 0);
    }

    private static void a(Graphics graphics, int n, int n2, int n3, Image[] imageArray, int n4) {
        if (n3 == 0) {
            Image image = h.a[0].a[0][0];
            graphics.drawImage(image, n, n2, 24);
            return;
        }
        while (n3 > 0) {
            int n5 = n3 % 10;
            n3 /= 10;
            Image image = imageArray[n5 + n4];
            graphics.drawImage(image, n -= image.getWidth(), n2, 0);
        }
    }

    private static void a(Graphics graphics, int n, int n2, String string, Image[] imageArray, int n3) {
        for (int i = string.length() - 1; i >= 0; --i) {
            int n4 = string.charAt(i);
            if (n4 == 47) {
                n4 = 58;
            }
            n4 = (char)(n4 - 48);
            Image image = imageArray[n4 + n3];
            graphics.drawImage(image, n, n2, 24);
            n -= image.getWidth();
        }
    }

    private boolean b() {
        return this.aP > 0 && this.aP < this.av - 1 && this.aQ > 0 && this.aQ < this.aw - 1;
    }

    private void o(int n) {
        int n2 = h.a[0].f;
        if (n2 != 19 && (this.aS & 0x4000) == 0 && (this.aS & 0x800) == 0) {
            if (this.b()) {
                int n3 = e == null ? 0 : h.a(e[this.aP][this.aQ], (byte)0, (byte)3, (byte)4);
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
                            n = 36 + (this.aS & 7) - 1;
                        }
                    }
                } else if (a[this.aP][this.aQ + 1] < 0 || a[this.aP][this.aQ + 1] == 14) {
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
                this.aS |= 0x4000;
            } else {
                a[0].a(n);
            }
            if (n2 != n) {
                this.am = 70;
            }
        }
    }

    private void aP() {
        int n;
        String[] stringArray;
        h h2;
        block9: {
            int n2;
            h h3;
            block8: {
                block7: {
                    if (h.a(32944)) {
                        W = 0;
                        this.ay = true;
                        this.p(this.c);
                        return;
                    }
                    if (h.a(64)) {
                        W = 0;
                        l = (byte)27;
                        this.ay = true;
                        this.e = true;
                        W = 0;
                        return;
                    }
                    if (!h.a(4097)) break block7;
                    h3 = this;
                    n2 = -1;
                    break block8;
                }
                if (!h.a(262146)) break block9;
                h3 = this;
                n2 = 1;
            }
            h3.q(n2);
        }
        W = 0;
        int n3 = h.f(this.c);
        if (n3 == 0) {
            this.d = -1;
            h2 = this;
            stringArray = a;
            n = 91;
        } else {
            this.d = f.a[this.c];
            this.d.delete(0, this.d.length());
            this.d.append(this.d);
            h2 = this;
            stringArray = a;
            n = 100;
        }
        h2.a = stringArray[n];
        this.ay = true;
    }

    private static int f(int n) {
        byte by = i[8];
        if (by >= 4 + n + 1) {
            return 0;
        }
        int n2 = h.a(i, 4);
        if (n2 < f.a[n]) {
            return -1;
        }
        return 1;
    }

    private void p(int n) {
        this.eq = -1;
        switch (h.f(n)) {
            case -1: {
                this.a = a[99];
                return;
            }
            case 0: {
                this.a = a[91];
                return;
            }
            case 1: {
                this.aZ = h.a(i, 4) - f.a[this.c];
                this.f = null;
                System.gc();
                this.f = a[120] + " " + this.aZ + " " + a[119];
                h.i[4] = (byte)(this.aZ & 0xFF);
                h.i[5] = (byte)(this.aZ >> 8 & 0xFF);
                h.i[8] = (byte)(4 + n + 1);
                this.H();
                this.d = -1;
                this.a = a[91];
                this.ab = true;
                this.a(a[101], -1, -1, 5000, 4273165, 0);
            }
        }
    }

    private void q(int n) {
        this.c += n;
        if (this.c < 0) {
            this.c = 3;
        }
        if (this.c == 4) {
            this.c = 0;
        }
    }

    private void aQ() {
        if (h.a(64)) {
            l = (byte)4;
            this.a(4);
        }
        W = 0;
    }

    /*
     * Unable to fully structure code
     */
    private void aR() {
        if (h.W == 0) {
            this.j = 0;
            return;
        }
        if (h.i()) {
            this.c(true);
            h.W = 0;
            return;
        }
        switch (h.l) {
            case 33: {
                this.aT();
                break;
            }
            case 26: {
                this.aQ();
                break;
            }
            case 18: {
                break;
            }
            case 25: {
                this.aP();
                break;
            }
            case 24: {
                this.aX();
                break;
            }
            case 34: {
                this.aZ();
                break;
            }
            case 12: {
                this.ba();
                break;
            }
            case 4: {
                this.bc();
                break;
            }
            case 30: {
                if (!h.a(32784)) break;
                h.l = (byte)4;
                if (this.bo == -1) {
                    this.aM = 0;
                    this.a(0);
                } else {
                    this.aM = 2;
                }
                v0 = 0;
                break;
            }
            case 2: 
            case 7: 
            case 32: {
                this.bc();
                break;
            }
            case 1: {
                if (this.f || this.al) {
                    h.W = 0;
                }
                h.m = h.l;
                this.aU();
                this.bb();
                break;
            }
            case 10: {
                break;
            }
            case 15: {
                this.cE();
                break;
            }
            case 17: 
            case 20: {
                if (!h.a(32944)) break;
                if (this.aM == 5) {
                    this.bl();
                    this.B();
                }
                this.s = true;
                ** GOTO lbl78
            }
            case 27: {
                h.m = h.l;
                this.aU();
                this.aV();
                break;
            }
            case 31: {
                if (h.a(32944)) {
                    this.aS();
                } else if (h.a(64)) {
                    this.bs = 0;
                    this.br = 8;
                    h.l = (byte)9;
                    this.a(-1);
                }
lbl78:
                // 5 sources

                v0 = h.W = 0;
            }
        }
        if (this.b) {
            return;
        }
        if ((this.aS & 7) != 0) {
            this.b = 10;
        }
    }

    private void aS() {
        this.B = true;
        l = (byte)16;
        this.bs = 0;
        this.br = 6;
        this.ao = 0;
        this.bb = 0;
        this.aZ = 0;
        this.n = false;
        this.V = 0;
        ec = 0;
    }

    private void aT() {
        if (h.a(64)) {
            if (this.bo == 0) {
                l = (byte)4;
                this.a(0);
                this.E(19);
            }
            if (this.bo == 1) {
                l = (byte)2;
                V = true;
                this.m = true;
                this.a(1);
            }
        }
    }

    private void aU() {
        if (s < b.length && h.a(b[s])) {
            W = 0;
            if ((s = (byte)(s + 1)) == b.length) {
                W = 0;
                l = (byte)24;
                this.cA = i[8];
                this.cB = i[9];
                this.S = false;
                this.T = false;
                return;
            }
        } else {
            byte by;
            if (h.a(b[0])) {
                W = 0;
                by = 1;
            } else {
                by = 0;
            }
            s = by;
        }
    }

    private void aV() {
        block7: {
            int n;
            block5: {
                h h2;
                block10: {
                    block9: {
                        block8: {
                            block6: {
                                block4: {
                                    if (this.s != -1 || this.q != 0) {
                                        W = 0;
                                        return;
                                    }
                                    if (!h.a(32944)) break block4;
                                    h2 = this;
                                    n = 4;
                                    break block5;
                                }
                                if (!h.a(64)) break block6;
                                this.B();
                                l = (byte)9;
                                this.br = 8;
                                this.a(-1);
                                this.bs = 0;
                                break block7;
                            }
                            if (!h.a(4097)) break block8;
                            h2 = this;
                            n = 0;
                            break block5;
                        }
                        if (!h.a(262146)) break block9;
                        h2 = this;
                        n = 2;
                        break block5;
                    }
                    if (!h.a(16388)) break block10;
                    h2 = this;
                    n = 3;
                    break block5;
                }
                if (!h.a(65544)) break block7;
                h2 = this;
                n = 1;
            }
            h2.j = n;
        }
        W = 0;
    }

    private void aW() {
        if (this.ap == 0 && this.aq == 13) {
            this.a = null;
            this.aP = 60;
            this.aQ = 3;
            return;
        }
        this.aw = h.a(524288);
        this.A = !this.aw;
        this.bd = 0;
        this.bc = 0;
        this.v = true;
        this.aP = this.av + 5 + 1;
    }

    private void aX() {
        boolean bl;
        block18: {
            block24: {
                block23: {
                    block22: {
                        block21: {
                            block20: {
                                block19: {
                                    block17: {
                                        bl = false;
                                        if (!h.a(512)) break block17;
                                        this.ac = !this.ac;
                                        break block18;
                                    }
                                    if (!h.a(65536)) break block19;
                                    this.aZ += 50;
                                    break block18;
                                }
                                if (!h.a(131072)) break block20;
                                this.bb += 5;
                                break block18;
                            }
                            if (!h.a(262144)) break block21;
                            if (m != 1) {
                                int n;
                                h h2;
                                this.cB <<= 1;
                                if (this.cB == 0) {
                                    h2 = this;
                                    n = 1;
                                } else if (this.cB > 8) {
                                    h2 = this;
                                    n = h2.cB = 0;
                                }
                                h.i[10] = this.cB > 2 ? (byte)1 : 0;
                            }
                            break block18;
                        }
                        if (!h.a(524288)) break block22;
                        this.S = !this.S;
                        break block18;
                    }
                    if (h.a(32768) || h.a(16384)) break block18;
                    if (!h.a(1024)) break block23;
                    this.T = !this.T;
                    break block18;
                }
                if (h.a(64)) break block24;
                if (!h.a(32944)) break block18;
                h.i[8] = (byte)this.cA;
                h.i[9] = (byte)this.cB;
                if (this.S || this.T) {
                    int n;
                    int n2;
                    int n3;
                    for (n3 = 0; n3 <= 2; ++n3) {
                        n2 = this.e(n3);
                        if (n3 == 2) {
                            ++n2;
                        }
                        for (n = 0; n <= n2; ++n) {
                            this.a(n3, n, (byte)2);
                            this.a(n3, n, (byte)64);
                        }
                        this.a(n3, n2);
                    }
                    if (this.T) {
                        for (n3 = 0; n3 <= 2; ++n3) {
                            n2 = this.d(n3);
                            if (n3 == 0) {
                                --n2;
                            }
                            for (n = this.e(n3); n < n2; ++n) {
                                this.a(n3, n, (byte)2);
                                this.a(n3, n, (byte)64);
                            }
                            this.a(n3, n2 - 1);
                        }
                    }
                }
                this.d();
                this.e();
                this.H();
            }
            bl = true;
        }
        if (bl) {
            this.aY();
        }
        W = 0;
    }

    private void aY() {
        l = m;
        if (m == 27) {
            this.ay = true;
            this.e = true;
        } else if (m == 1) {
            this.C();
        }
        W = 0;
    }

    private void aZ() {
        int n = 0;
        int n2 = 0;
        if (h.a(33008)) {
            this.aY();
            h.a(a, true);
            a = null;
        }
        if (h.a(4097)) {
            --this.dg;
            if (this.dg < 0) {
                this.dg = 0;
            }
        }
        if (h.a(262146)) {
            ++this.dg;
            if (this.dg >= 2) {
                this.dg = 1;
            }
        }
        n2 = this.a[this.dg];
        if (h.a(16388)) {
            --n2;
        }
        if (h.a(65544)) {
            ++n2;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        switch (this.dg) {
            case 1: {
                int n3 = 9;
                break;
            }
            case 0: {
                int n3 = n = 126;
            }
        }
        if (n2 >= n) {
            n2 = n - 1;
        }
        this.a[this.dg] = n2;
    }

    private void ba() {
        if (!h.a(32944)) {
            return;
        }
        this.ao = 5;
        h.i[3] = (byte)this.ao;
        if (this.i == 2) {
            this.u();
        } else {
            h.e(4, -500);
            l = (byte)15;
            this.J = true;
            this.H = true;
            this.cu();
        }
        W = 0;
    }

    /*
     * Unable to fully structure code
     */
    private void bb() {
        block77: {
            block79: {
                block83: {
                    block92: {
                        block88: {
                            block90: {
                                block91: {
                                    block89: {
                                        block87: {
                                            block86: {
                                                block85: {
                                                    block84: {
                                                        block82: {
                                                            block81: {
                                                                block80: {
                                                                    block78: {
                                                                        block76: {
                                                                            if (this.ac && (h.a(524288) || h.a(131072))) {
                                                                                this.aW();
                                                                            }
                                                                            if (this.cl != 0 && !h.a(32944) || this.an != 0 || this.v || this.n <= 0 || h.a[0].f == 19 || this.C) {
                                                                                h.W = 0;
                                                                                return;
                                                                            }
                                                                            if (this.a != null) {
                                                                                if (h.a(32944)) {
                                                                                    this.a.b = true;
                                                                                } else if (h.a(32784)) {
                                                                                    this.a.a();
                                                                                }
                                                                                h.W = 0;
                                                                                return;
                                                                            }
                                                                            if (this.aT <= 0) break block76;
                                                                            var1_1 = true;
                                                                            if (h.a(4097)) {
                                                                                this.ak = -5;
                                                                            } else if (h.a(262146)) {
                                                                                this.ak = 5;
                                                                            } else if (h.a(16388)) {
                                                                                this.aj = -5;
                                                                            } else if (h.a(65544)) {
                                                                                this.aj = 5;
                                                                            } else if (!h.a(32784)) {
                                                                                if (h.a(32944)) {
                                                                                    this.bC();
                                                                                    h.W = 0;
                                                                                } else {
                                                                                    var1_1 = false;
                                                                                }
                                                                            }
                                                                            if (var1_1) {
                                                                                --this.aT;
                                                                                if (this.aT == 0) {
                                                                                    if ((byte)(h.a[this.aP][this.aQ] & 255) < 0) {
                                                                                        h.a[this.aP][this.aQ] = 32;
                                                                                    }
                                                                                    if (h.a[this.aP][this.aQ] == 9) {
                                                                                        h.a[this.aP][this.aQ] = -1;
                                                                                    }
                                                                                    this.b = 40L;
                                                                                    this.aR = 0;
                                                                                    this.aS = this.aS & -113 | 0;
                                                                                    this.o(this.f());
                                                                                }
                                                                                h.W = 0;
                                                                                return;
                                                                            }
                                                                            break block77;
                                                                        }
                                                                        if (!h.a(4097)) break block78;
                                                                        this.j = 1;
                                                                        break block79;
                                                                    }
                                                                    if (!h.a(262146)) break block80;
                                                                    this.j = (byte)3;
                                                                    break block79;
                                                                }
                                                                if (!h.a(16388)) break block81;
                                                                this.j = (byte)4;
                                                                break block79;
                                                            }
                                                            if (!h.a(65544)) break block82;
                                                            this.j = (byte)2;
                                                            break block79;
                                                        }
                                                        if (!h.a(32784)) break block83;
                                                        h.W = 0;
                                                        if (this.bS != this.aP || this.bT != this.aQ || (h.a[this.aP][this.aQ] & 255) != 4) break block84;
                                                        this.E(9);
                                                        this.ch();
                                                        break block79;
                                                    }
                                                    var1_2 = h.e == null ? 0 : h.a(h.e[this.aP][this.aQ], (byte)0, (byte)3, (byte)4);
                                                    if (var1_2 == 8 || var1_2 == 7) break block79;
                                                    var2_4 = this.aS & 7;
                                                    var3_5 = -1;
                                                    var4_6 = -1;
                                                    var5_7 = false;
                                                    if (h.i[9] < 2) break block85;
                                                    var6_8 = 0;
                                                    for (var7_9 = 0; var7_9 < 2; ++var7_9) {
                                                        var8_11 = var7_9 == 0 ? 1 : -1;
                                                        if ((var8_11 <= 0 || this.aP >= this.av - 3) && (var8_11 >= 0 || this.aP <= 3)) continue;
                                                        block15: for (var9_13 = 1; var9_13 <= 3; ++var9_13) {
                                                            var10_14 = this.aP + var8_11 * var9_13;
                                                            var11_15 = h.a[var10_14][this.aQ];
                                                            var12_16 = h.a[var10_14][this.aQ] & 255;
                                                            if (var12_16 == 7 && (h.a[var10_14][this.aQ] >> 8 & 240) == 0) ** GOTO lbl-1000
                                                            if (var11_15 == 48 && (h.b[var10_14][this.aQ] & 8) != 0) continue;
                                                            switch (var11_15) {
                                                                case 11: 
                                                                case 19: 
                                                                case 43: {
                                                                    if (var8_11 <= 0) ** GOTO lbl95
                                                                    v0 = var6_8;
                                                                    v1 = 2;
                                                                    ** GOTO lbl98
lbl95:
                                                                    // 1 sources

                                                                    if (var8_11 >= 0) ** GOTO lbl99
                                                                    v0 = var6_8;
                                                                    v1 = 4;
lbl98:
                                                                    // 2 sources

                                                                    var6_8 = v0 | v1;
                                                                }
lbl99:
                                                                // 3 sources

                                                                case 0: 
                                                                case 1: 
                                                                case 8: 
                                                                case 9: 
                                                                case 14: 
                                                                case 47: 
                                                                case 48: {
                                                                    if (var9_13 == 1) ** GOTO lbl108
                                                                    if (var4_6 >= 0) ** GOTO lbl104
                                                                    var4_6 = var8_11 > 0 ? 2 : 4;
                                                                    ** GOTO lbl112
lbl104:
                                                                    // 1 sources

                                                                    var5_7 = true;
                                                                    var4_6 = var6_8 == 2 ? 2 : (var6_8 == 4 ? 4 : -1);
                                                                    v2 = 4;
                                                                    break;
lbl108:
                                                                    // 1 sources

                                                                    v2 = 4;
                                                                    break;
                                                                }
                                                                case -1: {
                                                                    continue block15;
                                                                }
lbl112:
                                                                // 2 sources

                                                                default: lbl-1000:
                                                                // 2 sources

                                                                {
                                                                    v2 = 4;
                                                                }
                                                            }
                                                            var9_13 = v2;
                                                        }
                                                    }
                                                }
                                                if (h.i[9] < 1) break block86;
                                                this.j = (byte)5;
                                                var6_8 = 0;
                                                var7_10 = new int[]{0, 1, 0, -1, 1, 1, -1, -1, 0, 2, 0, -2};
                                                var8_12 = new int[]{-1, 0, 1, 0, -1, 1, 1, -1, -2, 0, 2, 0};
                                                var13_17 = new int[]{0, 0, 0, 0, 3, 6, 12, 9, 1, 2, 4, 8};
                                                for (var14_18 = 0; var14_18 < var7_10.length; ++var14_18) {
                                                    var15_19 = this.aP + var7_10[var14_18];
                                                    var16_20 = this.aQ + var8_12[var14_18];
                                                    if (var15_19 < 0 || var15_19 >= this.av || var16_20 < 0 || var16_20 >= this.aw) continue;
                                                    var17_21 = h.b[var15_19][var16_20] & 7;
                                                    var18_22 = false;
                                                    var19_23 = -1;
                                                    var20_24 = false;
                                                    switch (h.a[var15_19][var16_20]) {
                                                        case 9: 
                                                        case 18: 
                                                        case 30: {
                                                            if (var13_17[var14_18] != 0) break;
                                                            var20_24 = true;
                                                            break;
                                                        }
                                                        case 46: 
                                                        case 49: 
                                                        case 50: {
                                                            if (var13_17[var14_18] != 0) break;
                                                            ++var6_8;
                                                            var20_24 = true;
                                                            break;
                                                        }
                                                        case 19: 
                                                        case 43: {
                                                            if ((h.b[var15_19][var16_20] & 248) != 0) break;
                                                            ** GOTO lbl147
                                                        }
                                                        case 45: {
                                                            if ((h.b[var15_19][var16_20] & 15) == 10) break;
lbl147:
                                                            // 2 sources

                                                            var18_22 = true;
                                                        }
                                                    }
                                                    if (var18_22) {
                                                        if (var13_17[var14_18] == 0) {
                                                            v3 = var14_18 + 1;
                                                        } else if (h.b[var15_19][var16_20] >= 12) {
                                                            if ((var13_17[var14_18] & 1) != 0 && var17_21 == 3) {
                                                                if (var7_10[var14_18] == 0) {
                                                                    v3 = 1;
                                                                } else if (var7_10[var14_18] < 0) {
                                                                    v3 = 4;
                                                                } else if (var7_10[var14_18] > 0) {
                                                                    v3 = 2;
                                                                }
                                                            } else if ((var13_17[var14_18] & 8) != 0 && var17_21 == 2) {
                                                                if (var8_12[var14_18] == 0) {
                                                                    v3 = 4;
                                                                } else if (var8_12[var14_18] < 0) {
                                                                    v3 = 1;
                                                                } else if (var8_12[var14_18] > 0) {
                                                                    v3 = var19_23 = 3;
                                                                }
                                                            }
                                                        }
                                                        if (var19_23 != -1) {
                                                            var20_24 = true;
                                                            ++var6_8;
                                                        }
                                                    }
                                                    if (!var20_24) continue;
                                                    if (var6_8 == 0) {
                                                        if (var2_4 == var14_18 + 1) {
                                                            var3_5 = var2_4;
                                                            continue;
                                                        }
                                                        if (var3_5 >= 0) continue;
                                                        var3_5 = var14_18 + 1;
                                                        continue;
                                                    }
                                                    if (var6_8 == 1) {
                                                        var3_5 = var19_23;
                                                        continue;
                                                    }
                                                    var3_5 = var2_4;
                                                    break;
                                                }
                                            }
                                            if (var3_5 <= 0 || var4_6 != var2_4) break block87;
                                            this.j = (byte)6;
                                            v4 = this;
                                            v5 = this.aS & -8;
                                            v6 = var2_4;
                                            break block88;
                                        }
                                        if (var3_5 <= 0 || var4_6 >= 0 || var5_7) break block89;
                                        v4 = this;
                                        v5 = this.aS & -8;
                                        v6 = var3_5;
                                        break block88;
                                    }
                                    if (var3_5 < 0 && var4_6 > 0 && !var5_7) break block90;
                                    if (!var5_7 || var2_4 != 2 && var2_4 != 4) break block91;
                                    this.j = (byte)6;
                                    v4 = this;
                                    v5 = this.aS & -8;
                                    v6 = var2_4;
                                    break block88;
                                }
                                if (!var5_7 || var4_6 <= 0) break block92;
                            }
                            this.j = (byte)6;
                            v4 = this;
                            v5 = this.aS & -8;
                            v6 = var4_6;
                        }
                        v4.aS = v5 | v6;
                    }
                    if (this.j == 6 && (h.a[this.aP][this.aQ] & 255) == 2 && h.a[this.aP][this.aQ] >> 8 == 1) {
                        this.ay = -1;
                        this.b(this.aP, this.aQ, (byte)2);
                    }
                    break block79;
                }
                if (h.a(256)) {
                    this.ay = -1;
                    var1_3 = h.a[0].f;
                    if (var1_3 == 36 + (this.aS & 7) - 1) {
                        if ((h.a[this.aP][this.aQ] & 255) == 4) {
                            this.ch();
                        } else {
                            this.E(2);
                            this.o(19);
                        }
                    }
                    switch (var1_3) {
                        case 0: 
                        case 1: 
                        case 2: 
                        case 3: 
                        case 34: 
                        case 35: {
                            if ((h.a[this.aP][this.aQ] & 255) == 4) {
                                this.ch();
                                break;
                            }
                            this.E(2);
                            this.o(19);
                        }
                    }
                } else if (h.a(32944)) {
                    this.bC();
                    h.W = 0;
                }
            }
            if (this.j != 5 && this.k == 0 && this.b == 0 && this.j != (this.aS & 7)) {
                this.aS |= 4096;
            }
        }
    }

    private void bc() {
        if (this.de >= 0 && this.de <= 2) {
            W = 0;
            return;
        }
        if (h.a(32944)) {
            if (this.de < 0 || this.de > 2) {
                this.de = 0;
                this.k = System.currentTimeMillis();
            }
        } else if (h.a(4097)) {
            if (System.currentTimeMillis() - this.l < 300L) {
                return;
            }
            this.y();
            if (this.bo == 0 && this.bq == 2 && !X) {
                this.y();
            }
            if (this.bo == 0 && this.bq == 1 && !this.Y) {
                this.y();
            }
        } else if (h.a(262146)) {
            if (System.currentTimeMillis() - this.l < 300L) {
                return;
            }
            this.z();
            if (this.bo == 0 && this.bq == 1 && !this.Y) {
                this.z();
            }
            if (this.bo == 0 && this.bq == 2 && !X) {
                this.z();
            }
        } else if (h.a(64)) {
            this.bd();
        }
        W = 0;
    }

    private void bd() {
        switch (this.bo) {
            case -1: {
                return;
            }
            case 5: {
                V = true;
                W = false;
                if (l == 2) {
                    this.a(1);
                    this.C();
                    W = true;
                }
                if (l != 4) break;
                this.a(0);
                this.E(19);
                return;
            }
            case 2: {
                l = (byte)9;
                this.a(0);
                this.br = 8;
                this.bs = 0;
                return;
            }
            case 4: {
                this.a(2);
            }
        }
    }

    private void f(int n, int n2) {
        int[] nArray = new int[]{0, 1, -1, 0, 0};
        int[] nArray2 = new int[]{0, 0, 0, 1, -1};
        boolean bl = false;
        boolean bl2 = i[9] >= 8;
        boolean bl3 = false;
        switch (a[n][n2]) {
            case 9: {
                if ((this.aS & 0x2000) != 0) break;
                this.aS |= 0x2000;
                bl = true;
                this.g(n, n2);
                break;
            }
            case 18: {
                boolean bl4 = this.c();
                break;
            }
            case 0: {
                bl3 = true;
                break;
            }
            case 30: {
                bl = true;
                if (b[n][n2] != 0) break;
                this.E(11);
                h.b[n][n2] = 1;
                break;
            }
            case 10: {
                if (this.x != 3 || b[n][n2] > 0) break;
                bl = true;
                h.b[n][n2] = 1;
                this.b(n, n2);
                break;
            }
            case 16: {
                bl = true;
                bl3 = true;
                break;
            }
            default: {
                if (a[n][n2] - 80 < 0 && ((a[n][n2] & 0xFF) != 7 || (a[n][n2] >> 8 & 0xF0) != 0)) break;
                bl3 = true;
                boolean bl4 = bl = true;
            }
        }
        if (bl3) {
            h.u(200);
            this.E(6);
            this.o(41 + (this.aS & 7) - 1);
        }
        if (!bl) {
            for (int i = 0; i < 5; ++i) {
                int n3;
                int n4 = n + nArray[i];
                int n5 = n2 + nArray2[i];
                if (n4 < 0 || n4 >= this.av || n5 < 0 || n5 >= this.aw) continue;
                byte by = a[n4][n5];
                boolean bl5 = false;
                boolean bl6 = false;
                switch (by) {
                    case 1: {
                        if (n4 != this.aP - g[this.aS & 7] || n5 != this.aQ - g[(this.aS & 7) + 8]) break;
                        bl6 = true;
                        break;
                    }
                    case 19: 
                    case 43: 
                    case 45: 
                    case 46: 
                    case 49: {
                        boolean bl7;
                        n3 = b[n4][n5] & 7;
                        byte by2 = n3 == 0 ? (byte)0 : b[n4][n5];
                        boolean bl8 = bl7 = by != 49 && by != 46;
                        if (h.a(n, n2, 0, 0, n4, n5, n3, by2)) {
                            bl6 = true;
                            bl5 = bl7;
                        }
                        if (!bl6) break;
                        this.E(10);
                    }
                }
                if (bl2 && bl6 && (n4 != this.aP || n5 != this.aQ)) {
                    boolean bl9 = this.b(n4, n5);
                    n3 = bl9 ? 1 : 0;
                    if (!bl9) continue;
                    this.aS |= 0x2000;
                    continue;
                }
                if (!bl5) continue;
                this.aS |= 0x2000;
                if (by == 45) {
                    n3 = (b[n4][n5] & 0x1C00) >> 10;
                    if (n3 == 3) {
                        h.a[n4][n5] = -1;
                        this.p(n4, n5);
                        continue;
                    }
                    h.b[n4][n5] = 0xA | ++n3 << 10;
                    h.b[n4][n5] = b[n4][n5] & 0xFFFFFF07 | 0x78;
                    h.b[n4][n5] = 0;
                    continue;
                }
                this.c(by, n4, n5);
            }
        }
    }

    private void g(int n, int n2) {
        if (h.a(n, n2)) {
            return;
        }
        h.q(n, n2);
        int n3 = this.d(n, n2 - 1) ? 2 : 1;
        switch ((b[n][n2] & 0xFC00000) >> 22) {
            case 39: {
                h.a[n][n2] = 49;
                h.b[n][n2] = n3;
                return;
            }
            case 37: {
                int n4;
                int n5;
                byte[] byArray;
                if ((b[n][n2] & 0x10000000) != 0) {
                    byArray = a[n];
                    n5 = n2;
                    n4 = 43;
                } else {
                    byArray = a[n];
                    n5 = n2;
                    n4 = 19;
                }
                byArray[n5] = n4;
                h.b[n][n2] = n3;
                this.c(19, n, n2);
                return;
            }
            case 35: {
                h.a[n][n2] = 45;
                h.b[n][n2] = b[n][n2] & 0xFFFFFFF0 | 0xA;
                return;
            }
            case 34: {
                h.a[n][n2] = 1;
                this.c(n, n2);
                return;
            }
            case 36: {
                h.a[n][n2] = 46;
                h.b[n][n2] = 0;
                h.b[n][n2] = 0;
            }
        }
    }

    private boolean c() {
        if (this.x == 3) {
            int n = a[this.aP][this.aQ] & 0xFF;
            if (this.cf == 0 && n != 15 && n != 16) {
                int n2;
                h h2;
                this.E(0);
                if (this.ce <= 0) {
                    h2 = this;
                    n2 = 1;
                } else {
                    h2 = this;
                    n2 = -1;
                }
                h2.cf = n2;
            }
            return true;
        }
        return false;
    }

    private void c(int n, int n2, int n3) {
        int n4 = b[n2][n3];
        if (n == 43 && (n4 & 0xF8) == 0) {
            if ((n4 & 0x18000) == 0) {
                h.a[n2][n3] = -1;
                this.p(n2, n3);
                return;
            }
            n4 -= 32768;
            n4 = n4 & 0xFF01FFFF | n2 << 17;
            n4 = ((n4 = n4 & 0x80FFFFFF | n3 << 24) & 7) == 1 || (n4 & 7) == 3 ? n4 | Integer.MIN_VALUE : n4 & Integer.MAX_VALUE;
        }
        h.b[n2][n3] = n4 = n4 & 0xFFFFFF07 | 0x78;
    }

    private void be() {
        int n;
        int n2;
        int[] nArray;
        int n3 = a[this.bE][this.bF] >> 8;
        if (++n3 >= 16) {
            nArray = a[this.bE];
            n2 = this.bF;
            n = -1;
        } else {
            h.c[this.bE][this.bF] = 24;
            nArray = a[this.bE];
            n2 = this.bF;
            n = n3 << 8 | 0x24;
        }
        nArray[n2] = n;
    }

    private void h(int n, int n2) {
        switch (a[n][n2]) {
            case 0: {
                this.E(11);
            }
            case 19: 
            case 43: 
            case 45: 
            case 46: {
                h.a[n][n2] = -1;
                this.p(n, n2);
                return;
            }
            case 48: {
                h.a[n][n2] = -1;
                this.p(n, n2);
                int n3 = n2 + 1;
                if (a[n][n3] != 48) {
                    n3 = -1;
                }
                h.a[n][n3] = -1;
                this.p(n, n3);
                int n4 = (b[n][n2] >> 24) * 3;
                h.e[n4 + 2] = -1;
                return;
            }
        }
        h.a[n][n2] = -1;
    }

    private void bf() {
        int n;
        h h2;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        boolean bl;
        block104: {
            block105: {
                if (this.a) {
                    --this.a;
                }
                if ((this.f || this.al) && aN > 140) {
                    if (this.al) {
                        this.d();
                    }
                    this.f = false;
                    this.al = false;
                    this.K = true;
                    this.bs = 0;
                    this.h();
                    this.I = true;
                    l = (byte)28;
                }
                bl = this.b();
                if (this.ao) {
                    this.ao = false;
                    if (this.dw < this.dx) {
                        n6 = h.a((byte)this.dw, (byte)13, (byte)7);
                        n5 = h.a((byte)this.dw, (byte)20, (byte)7);
                        this.v(n6, n5);
                        ++this.dw;
                    } else {
                        this.dw = 0;
                        this.dx = 0;
                    }
                }
                if (a[4] != null) {
                    a[4].b();
                }
                if (this.bj > 0) {
                    --this.bj;
                }
                if (this.dl > 0) {
                    --this.dl;
                    if (this.dl == 0) {
                        this.e = null;
                    }
                }
                if (this.S != this.T) {
                    int n7 = n6 = this.S;
                    while (n7 != this.T) {
                        int n8 = n6;
                        b[n8] = (byte)(b[n8] + 1);
                        int n9 = n5 = c[n6] < 0 ? h.a(a[2], 0) : a[9].a(c[n6]);
                        if (b[n6] >= n5) {
                            ++this.S;
                            this.S &= 7;
                        }
                        n7 = n6 + 1 & 7;
                    }
                }
                if (this.i != 0) {
                    this.br();
                    if (l != 1) {
                        return;
                    }
                }
                if ((aN & 0xF) == 0) {
                    this.bq();
                }
                if (this.cf == 0 || (aN >> 1 & 1) != 0) break block104;
                this.ce += this.cf;
                if (this.ce != 0 && this.ce != 9) break block105;
                this.cf = 0;
                for (n6 = 1; n6 < this.aw - 1; ++n6) {
                    for (n5 = 1; n5 < this.av - 1; ++n5) {
                        n4 = a[n5][n6] & 0xFF;
                        n3 = a[n5][n6];
                        if (n4 != 15 && n4 != 16 && n3 != 34 && n3 != 35) continue;
                        this.c(n5, n6);
                    }
                }
                break block104;
            }
            if (this.ce != 5) break block104;
            n6 = this.aw - 1;
            n5 = this.av - 1;
            for (n4 = 1; n4 < n6; ++n4) {
                for (n3 = 1; n3 < n5; ++n3) {
                    boolean bl2;
                    block111: {
                        block107: {
                            int n10;
                            block110: {
                                int n11;
                                int[] nArray;
                                byte by;
                                block109: {
                                    block108: {
                                        block106: {
                                            n2 = a[n3][n4] & 0xFF;
                                            by = a[n3][n4];
                                            bl2 = false;
                                            if (n2 != 15) break block106;
                                            this.h(n3, n4);
                                            h.a[n3][n4] = 34;
                                            break block107;
                                        }
                                        if (n2 != 16) break block108;
                                        this.h(n3, n4);
                                        h.a[n3][n4] = 35;
                                        break block107;
                                    }
                                    if (by != 34) break block109;
                                    nArray = a[n3];
                                    n11 = n4;
                                    n10 = 15;
                                    break block110;
                                }
                                if (by != 35) break block111;
                                nArray = a[n3];
                                n11 = n4;
                                n10 = 16;
                            }
                            nArray[n11] = n10;
                            h.a[n3][n4] = -1;
                            this.t(n3, n4);
                        }
                        bl2 = true;
                    }
                    if (!bl2) continue;
                    h.q(n3, n4);
                }
            }
        }
        --this.b;
        if (this.aW > 0 && --this.aW == 0) {
            this.bm();
        }
        if (this.aR <= 0 && this.u) {
            this.u = false;
            this.E(9);
            try {
                Thread.sleep(100L);
            }
            catch (InterruptedException interruptedException) {}
            this.cg();
        }
        if (a[11] != null) {
            this.bp();
        }
        if (this.bi != 0 && this.bg != 0) {
            this.bo();
        }
        this.bG();
        if (this.al > 0) {
            this.bg();
        }
        this.cp();
        if (this.cl != 0) {
            this.bF();
        }
        if (this.a != null) {
            this.am = 70;
            if (this.a.a() && this.a.b() == null) {
                this.a = null;
            }
            if (this.a != null) {
                this.a.b();
            }
        } else if (this.bm != -1) {
            this.v(this.bm);
            this.bm = -1;
            this.j = 0;
        }
        if (this.aT > 0) {
            if (a[this.aP][this.aQ] < 0) {
                int n12;
                int n13;
                h h3;
                if (a[this.aP][this.aQ + 1] == 9 && (b[this.aP][this.aQ + 1] & 7) == 3) {
                    ++this.aQ;
                    h3 = this;
                    n13 = this.aS & 0xFFFFFFF8;
                    n12 = 3;
                } else if (a[this.aP - 1][this.aQ + 1] == 9 && (b[this.aP - 1][this.aQ + 1] & 7) == 3) {
                    ++this.aQ;
                    --this.aP;
                    h3 = this;
                    n13 = this.aS & 0xFFFFFFF8;
                    n12 = 3;
                } else if (a[this.aP + 1][this.aQ + 1] == 9 && (b[this.aP + 1][this.aQ + 1] & 7) == 3) {
                    ++this.aQ;
                    ++this.aP;
                    h3 = this;
                    n13 = this.aS & 0xFFFFFFF8;
                    n12 = 3;
                } else {
                    h3 = this;
                    n13 = this.aS & 0xFFFFFFF8;
                    n12 = 0;
                }
                h3.aS = n13 | n12;
            }
            h2 = this;
            n = b[this.aP][this.aQ];
        } else if ((this.k == 0 || this.aR <= 0 && this.k != 5) && !this.v && (this.aS & 0x70) == 0 && this.aA == -1) {
            this.k = this.j;
            n6 = 0;
            if (this.an > 0) {
                this.k = (byte)2;
                --this.an;
                if (this.an == 0) {
                    this.j(this.aP - 1, this.aQ);
                    this.j = 0;
                    W = 0;
                }
            } else if (bl) {
                h.q(this.aP, this.aQ);
            }
            switch (this.k) {
                case 3: {
                    this.aS &= 0xFFFFFFF7;
                }
                case 1: 
                case 2: 
                case 4: {
                    if (h.a[0].f == 40 || h.a[0].f == 48) break;
                    if ((this.aS & 0x1000) == 0) {
                        n6 = this.a((int)(-g[this.k]), (int)(-g[this.k + 8]), false) ? 1 : 0;
                        bl = this.b();
                        if (n6 == 0) break;
                        this.a = 40;
                        this.a = false;
                        n5 = this.k - 1;
                        if (n5 < 0) {
                            n5 = 0;
                        }
                        if ((this.aS & 8) != 0) {
                            if (this.k == 2) {
                                this.o(8);
                                break;
                            }
                            this.o(9);
                            break;
                        }
                        this.o(4 + n5);
                        break;
                    }
                    this.aS = this.aS & 0xFFFFFFF8 | this.k;
                    this.aR = 18;
                    n5 = this.k - 1;
                    if (n5 < 0) {
                        n5 = 0;
                    }
                    this.o(0 + n5);
                    break;
                }
                case 6: {
                    int n14 = n5 = (this.aS & 7) == 2 ? 1 : -1;
                    if (!bl || a[this.aP + n5][this.aQ] >= 0) break;
                    this.o(n5 == -1 ? 22 : 20);
                    h.a[this.aP + n5][this.aQ] = 32;
                    h.b[this.aP + n5][this.aQ] = 18;
                    h.b[this.aP + n5][this.aQ] = 4 | (n5 > 0 ? 1 : 0);
                    h.c[this.aP + n5][this.aQ] = 30;
                    this.aR = 72;
                    this.j = 0;
                    break;
                }
                case 5: {
                    this.aR = 0;
                    n4 = this.aS & 7;
                    if (!this.b()) break;
                    this.o(13 + n4 - 1);
                    break;
                }
                case 0: {
                    int n15;
                    h h4;
                    this.aS &= 0xFFFFFFF7;
                    n3 = 0;
                    switch (h.a[0].f) {
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
                            if ((this.aS & 0x4000) != 0) break;
                            n3 = 1;
                        }
                    }
                    if (n3 != 0) {
                        n2 = 0 + (this.aS & 7) - 1;
                        if (n2 < 0) {
                            n2 = 0;
                        }
                        this.o(n2);
                    }
                    if (this.a == null) {
                        h4 = this;
                        n15 = 6;
                    } else {
                        h4 = this;
                        n15 = h4.aX = 0;
                    }
                    if (this.aR <= 0) break;
                    this.aR -= 6;
                }
            }
            if (bl) {
                n5 = a[this.aP][this.aQ - 1];
                if (n6 == 0 && this.k != 5 && this.aR <= 0 && (n5 == 0 || n5 == 9 || n5 == 8 || n5 == 48) && (a[this.aP][this.aQ] & 0xFF) != 35) {
                    n4 = 0;
                    if (e != null) {
                        n4 = h.a(e[this.aP][this.aQ], (byte)0, (byte)3, (byte)4);
                    }
                    if (!this.j || n4 == 0 && n4 != 3) {
                        if ((this.aS & 8) == 0 && h.a[0].f != 11 && h.a[0].f != 10 && h.a[0].f != 12) {
                            this.o(11);
                        }
                        this.a = true;
                        if (this.a <= 0) {
                            this.a = 40;
                            this.b = 0L;
                            this.a((int)i[8], 32, 0);
                            return;
                        }
                    }
                }
            }
            if (n6 != 0) {
                this.w = false;
            } else if (bl && (aN & 0x1F) == 0) {
                n5 = a[this.aP][this.aQ - 1] == 0 ? 1 : 0;
                for (n4 = 1; n5 == 0 && n4 <= 4; n5 |= this.a((int)g[n4], (int)g[n4 + 8], true), ++n4) {
                }
                if (n5 == 0) {
                    if (this.w) {
                        this.o(19);
                    } else {
                        this.w = true;
                    }
                }
            }
        } else {
            if (this.v && this.aR <= 0) {
                byte by;
                h h5;
                if (this.aw) {
                    h5 = this;
                    by = this.p;
                } else {
                    h5 = this;
                    by = this.q;
                }
                h5.k = by;
                this.aS = this.aS & 0xFFFFFFF8 | this.k;
                this.aP += -g[this.k];
                this.aQ += -g[this.k + 8];
                bl = this.b();
                this.aR = 18;
                if (h.a[0].f != 4) {
                    this.o(4 + this.k - 1);
                }
            }
            if ((this.aS & 0x70) <= 32 || (this.aS & 0x800) != 0) {
                this.aR -= 6;
                if (this.aR <= 0) {
                    this.aS &= 0xFFFFEF8F;
                    h2 = this;
                    n = h2.aR = 0;
                }
            }
        }
        if (this.cl == 0) {
            if (this.C) {
                this.ck = 8;
                if (this.f()) {
                    this.d(this.bS, this.bT, 5);
                    this.C = false;
                }
            } else if (this.a == null) {
                if (am && this.k != 0) {
                    am = false;
                    this.am = 0;
                }
                if (!am) {
                    this.c();
                }
            } else {
                this.ar = this.at;
                this.as = this.au;
            }
        }
        if (this.k != 0 && bl) {
            this.l = a[this.aP][this.aQ + 1] >= 0;
        }
        this.bn();
        if (this.v && (this.aP < -5 || this.aP > this.av + 5 || this.aQ < -5 || this.aQ > this.aw + 5)) {
            this.A();
            if (this.aw || this.aq >= this.dN) {
                this.bs = 0;
                this.br = 12;
                l = (byte)35;
            } else {
                l = (byte)20;
                this.bs = 0;
                this.bi();
                this.O();
                h.e(6, this.bb);
                this.F();
            }
            this.h();
            this.aM = -1;
        }
    }

    private byte a(int n, int n2, int n3, int n4) {
        int n5 = n + n2;
        if ((n > 0 && n3 == 0 || n < n3 && n3 > 0) && (a[n5][n4] < 0 || a[n5][n4] == 31 || h.d(n5, n4) >= 0)) {
            while (((n = n5) > 0 && n3 == 0 || n < n3 && n3 > 0) && (a[n5 += n2][n4] < 0 || h.d(n5, n4) >= 0 || a[n5][n4] == 31)) {
            }
        }
        return (byte)n;
    }

    private static boolean a(int n, int n2) {
        if (e == null) {
            return false;
        }
        for (int i = 0; i < e.length; i += 3) {
            if (e[i + 2] != n2 || e[i + 0] - 1 != n && e[i + 1] + 1 != n) continue;
            return true;
        }
        return false;
    }

    private void bg() {
        int n = this.av - 1;
        for (int i = 0; i < e.length; i += 3) {
            byte by = e[i + 2];
            if (by <= 0) continue;
            byte by2 = e[i + 1];
            int n2 = e[i + 0];
            int n3 = this.a(n2, -1, 0, (int)by);
            h.e[i + 0] = n3;
            n2 = n3;
            byte by3 = this.a((int)by2, 1, n, (int)by);
            h.e[i + 1] = by3;
            by2 = by3;
            for (int j = n2; j <= by2; ++j) {
                this.b(j, by);
            }
        }
    }

    private boolean b(int n, int n2) {
        int n3 = h.d(n, n2);
        int n4 = 0;
        if (n3 >= 0) {
            if (n3 == 37 && a[n][n2] == 43) {
                n4 = 0x10000000;
            }
            h.q(n, n2);
            h.a[n][n2] = 9;
            h.b[n][n2] = b[n][n2] & 0xF03FFFFF | n3 << 22 | n4;
            this.d(n, n2, 1);
        }
        int n5 = (this.aS & 0x4000) == 0 ? 0 : 3;
        g g2 = a[n5];
        if (this.d(n, n2) && this.aT <= 0 && g2.f != 40 && g2.f != 48 && g2.f != 47) {
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

    /*
     * Unable to fully structure code
     */
    private void bh() {
        var1_1 = this.aM;
        var2_2 = h.a[41];
        var3_3 = this.a;
        var3_3.setColor(2496263);
        var3_3.fillRect(0, 0, 240, 320);
        switch (var1_1) {
            case 5: {
                if (this.bd == 0) {
                    if ((this.u & 32) != 0) {
                        var3_3.drawImage(h.a[5][0], 200, 237, 0);
                        if (var1_1 == 5 && h.aN < (var7_5 = (var6_4 = h.a[9]).a(0)) * 2) {
                            var6_4.a(var3_3, 0, h.aN * 2, 200, 237, 0, 0, 0);
                        }
                    }
                    var3_3.drawImage(h.a[28][0], 180, 254, 0);
                }
            }
            case 4: {
                if (var1_1 != 4 || (var4_9 = -100 + h.aN * 10) > 0) {
                    var4_9 = 0;
                }
                h.a[0].a.a(var3_3, 12, 0, 7 + var4_9, 243, 0, 0, 0);
                var2_2.b(var3_3, h.a[44], 120, 243, 17);
                var6_4 = String.valueOf(this.bd);
                var2_2.b(var3_3, (String)var6_4, 120, 255, 17);
                if (this.bc == 0) {
                    if ((this.u & 16) != 0) {
                        var3_3.drawImage(h.a[5][0], 200, 179, 0);
                        if (var1_1 == 4 && h.aN < (var8_10 = (var7_6 = h.a[9]).a(0)) * 2) {
                            var7_6.a(var3_3, 0, h.aN >> 1, 200, 179, 0, 0, 0);
                        }
                    }
                    var3_3.drawImage(h.a[28][0], 180, 196, 0);
                }
            }
            case 3: {
                if (var1_1 != 3 || (var4_9 = -100 + h.aN * 10) > 0) {
                    var4_9 = 0;
                }
                h.a[0].a.a(var3_3, 10, 0, 7 + var4_9, 189, 0, 0, 0);
                var2_2.b(var3_3, h.a[43], 120, 185, 17);
                var6_4 = String.valueOf(this.bc);
                var2_2.b(var3_3, (String)var6_4, 120, 197, 17);
                if (this.bb == this.ba) {
                    if ((this.u & 8) != 0) {
                        var3_3.drawImage(h.a[5][0], 200, 121, 0);
                        if (var1_1 == 3 && h.aN < (var8_10 = (var7_7 = h.a[9]).a(0)) * 2) {
                            var7_7.a(var3_3, 0, h.aN >> 1, 200, 121, 0, 0, 0);
                        }
                    }
                    var3_3.drawImage(h.a[28][0], 180, 138, 0);
                }
            }
            case 2: {
                if (var1_1 != 2 || (var4_9 = -100 + h.aN * 10) > 0) {
                    var4_9 = 0;
                }
                h.a[h.a(3)].a(var3_3, 0, 7 + var4_9, 127, 0, 0, 0);
                var2_2.b(var3_3, h.a[124], 120, 127, 17);
                var6_4 = this.bb + "/" + this.ba;
                var2_2.b(var3_3, (String)var6_4, 120, 139, 17);
                if (this.aZ == this.aY) {
                    if ((this.u & 4) != 0) {
                        var3_3.drawImage(h.a[5][0], 200, 63, 0);
                        if (var1_1 == 2 && h.aN < (var8_10 = (var7_8 = h.a[9]).a(0)) >> 1) {
                            var7_8.a(var3_3, 0, h.aN * 2, 200, 63, 0, 0, 0);
                        }
                    }
                    var3_3.drawImage(h.a[28][0], 180, 80, 0);
                }
            }
            case 1: {
                if (var1_1 != 1 || (var4_9 = -100 + h.aN * 10) > 0) {
                    var4_9 = 0;
                }
                h.a[h.a(2)].a(var3_3, 0, 7 + var4_9, 69, 0, 0, 0);
                var2_2.b(var3_3, h.a[119], 120, 69, 17);
                if (var1_1 != 1 || (var7_5 = h.aN >> 1) > this.aZ) {
                    var7_5 = this.aZ;
                }
                var6_4 = var7_5 + "/" + this.aY;
                var2_2.b(var3_3, (String)var6_4, 120, 81, 17);
            }
            case 0: {
                if (var1_1 != 0) ** GOTO lbl70
                var4_9 = -100 + h.aN * 10;
                var5_11 = var4_9 - 240;
                if (var4_9 > 0) {
                    var4_9 = 0;
                }
                if (var5_11 <= 0) ** GOTO lbl72
                ** GOTO lbl71
lbl70:
                // 1 sources

                var4_9 = 0;
lbl71:
                // 2 sources

                var5_11 = 0;
lbl72:
                // 2 sources

                var2_2.a(var3_3, h.a[h.g[this.ap][this.aq]], 120 + var4_9, 10, 17);
                var2_2.a(var3_3, h.a[41], 120 + var5_11, 25, 17);
            }
        }
        h.a[41].a(this.a, h.a[this.aM == 5 ? 108 : 63], 5, 318, 36);
    }

    public static int a(byte[] byArray, int n) {
        return byArray[n] & 0xFF | (byArray[n + 1] & 0xFF) << 8;
    }

    public static int b(byte[] byArray, int n) {
        return byArray[n] & 0xFF | (byArray[n + 1] & 0xFF) << 8 | (byArray[n + 2] & 0xFF) << 16 | (byArray[n + 3] & 0xFF) << 24;
    }

    private static int e(int n, int n2) {
        int n3 = h.a(i, n);
        if ((n3 += n2) < 0) {
            n3 = 0;
        }
        h.i[n] = (byte)(n3 & 0xFF);
        h.i[n + 1] = (byte)(n3 >> 8 & 0xFF);
        return n3;
    }

    private void bi() {
        for (int i = 0; i < this.X; ++i) {
            this.a(this.ap, this.aq, d[i << 1] & 0xFF, d[(i << 1) + 1] & 0xFF);
        }
    }

    private int d() {
        return h.e(4, this.aZ);
    }

    private int e() {
        return h.e(6, this.bb);
    }

    private void r(int n) {
        switch (n) {
            case 0: {
                dh = 0;
                di = 0;
                dj = 0;
                this.t = this.a(this.ap, this.aq);
                this.u = 0;
                return;
            }
            case 1: {
                dh = h.a(i, 4);
                dh += this.aZ;
                this.s = false;
                return;
            }
            case 2: {
                h.i[4] = (byte)(dh & 0xFF);
                h.i[5] = (byte)(dh >> 8 & 0xFF);
                return;
            }
            case 3: {
                di = h.a(i, 6);
                di += this.bb;
                return;
            }
            case 4: {
                h.i[6] = (byte)(di & 0xFF);
                h.i[7] = (byte)(di >> 8 & 0xFF);
                return;
            }
            case 5: {
                dj = i[2];
                this.J = 0;
                if ((dj & 8) == 0 && di >= f.b[1]) {
                    this.J = 1;
                    return;
                }
                if ((dj & 0x10) != 0 || di < f.b[2]) break;
                this.J = 2;
                return;
            }
            case 6: {
                try {
                    h.a[28] = h.a("/ui.f", 4);
                    return;
                }
                catch (Exception exception) {
                    return;
                }
            }
            case 7: {
                this.a(this.ap, this.aq, (byte)2);
                this.K = 0;
                return;
            }
            case 8: {
                int n2;
                int n3;
                for (n3 = n2 = (dj & 0xE0) >> 5; n3 < 4 && dh >= f.a[n3]; ++n3) {
                }
                if (n2 < n3) {
                    i[2] = (byte)(i[2] & 0xFFFFFF1F);
                    i[2] = (byte)(i[2] | n3 << 5 & 0xE0);
                    this.H();
                    this.K = n3;
                }
            }
            case 9: {
                this.bi();
                return;
            }
            case 10: {
                this.h();
                System.gc();
                return;
            }
            case 11: {
                if (this.ao < 99 && this.aZ == this.aY && (this.t & 4) == 0) {
                    this.a(this.ap, this.aq, (byte)4);
                    this.u = (byte)(this.u | 4);
                    ++this.ao;
                }
                if (this.ao < 99 && this.bb == this.ba && (this.t & 8) == 0) {
                    this.a(this.ap, this.aq, (byte)8);
                    this.u = (byte)(this.u | 8);
                    ++this.ao;
                }
                if (this.ao < 99 && this.bc == 0 && (this.t & 0x10) == 0) {
                    this.a(this.ap, this.aq, (byte)16);
                    this.u = (byte)(this.u | 0x10);
                    ++this.ao;
                }
                if (this.ao < 99 && this.bd == 0 && (this.t & 0x20) == 0) {
                    this.a(this.ap, this.aq, (byte)32);
                    this.u = (byte)(this.u | 0x20);
                    ++this.ao;
                }
                this.bk();
                this.F();
                this.I = false;
                this.H = true;
            }
        }
    }

    private void bj() {
        switch (this.aM) {
            case 0: {
                if (aN <= 40 && !this.s) break;
                ++this.aM;
                this.h();
                return;
            }
            case 1: {
                if ((aN <= this.aZ << 1 || aN <= 40) && !this.s) break;
                ++this.aM;
                this.h();
                return;
            }
            case 2: {
                if (aN <= 40 && !this.s) break;
                ++this.aM;
                this.h();
                return;
            }
            case 3: {
                if (aN <= 10 && !this.s) break;
                ++this.aM;
                this.h();
                return;
            }
            case 4: {
                if (aN <= 10 && !this.s) break;
                ++this.aM;
                this.h();
                this.s = false;
            }
        }
    }

    private long a(int n) {
        for (int i = 0; i < 12; ++i) {
            for (int j = 0; j < 12; ++j) {
                long l = a[i][j];
                if (l == 0L || h.a(l, (byte)6, (byte)5) != n) continue;
                return l;
            }
        }
        return -1L;
    }

    private void bk() {
        long l = this.a(this.aq);
        if ((this.aq == 0 || h.a(l, (byte)11, (byte)3) > 1) && l >= 0L && (this.a(this.ap, this.aq + 1) & 0x40) == 0) {
            ec = this.aq + 1;
            this.a(this.ap, ec, (byte)64);
            this.ad = true;
            return;
        }
        ec = this.aq;
    }

    private void bl() {
        this.cu();
    }

    private void d(int n, int n2, int n3) {
        int n4 = this.T << 1;
        h.a[n4] = (byte)n;
        h.a[n4 + 1] = (byte)n2;
        h.c[this.T] = (byte)n3;
        h.b[this.T] = 0;
        this.T = this.T + 1 & 7;
    }

    private void bm() {
        --this.ao;
        ++this.bd;
        if (this.ao >= 0) {
            this.ch();
            this.n = i[8];
            this.C();
            this.aS = 0;
            this.aT = 0;
            this.k = 0;
            this.j = 0;
            return;
        }
        l = (byte)12;
    }

    private void s(int n) {
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
        if (n2 != 7 || (n3 & 0xFF00) >> 8 != n) {
            System.out.println("!!!!!!!!!!!!!! door missing");
        }
        int n4 = n3 & 0xF;
        if (--n4 == 0) {
            n3 = n3 & 0xFFFFFF0F | 0x10;
            this.a((int)by, by2 - 1, 1, 0, 1);
            this.a((int)by, by2 - 1, -1, 0, 1);
            int n5 = a[by][by2 - 1] >> 8;
            h.a[by][by2 - 1] = (n5 |= 0x200) << 8 | a[by][by2 - 1] & 0xFF;
            h.c[by][by2] = 24;
        } else {
            n3 = n3 & 0xFFFFFFF0 | n4;
        }
        h.a[by][by2] = n3 << 8 | n2;
        this.E(8);
    }

    private static void i(int n, int n2) {
        int n3 = a[n][n2] >> 8;
        if ((n3 & 0xF0) == 0) {
            h.a[n][n2] = (n3 |= 0x10) << 8 | 7;
            h.c[n][n2] = 24;
        }
    }

    private void j(int n, int n2) {
        int n3 = a[n][n2] >> 8;
        if ((a[n][n2] & 0xFF) != 7) {
            return;
        }
        if ((n3 & 0xF0) == 0) {
            return;
        }
        if (a[n][n2] == 32) {
            return;
        }
        this.E(14);
        h.a[n][n2] = (n3 &= 0xFFFFFF0F) << 8 | 7;
        this.a(n, n2 - 1, 1, 0, 0);
        this.a(n, n2 - 1, -1, 0, 0);
        if (this.d(n, n2)) {
            this.b = 0L;
            this.bi = 0;
            this.a((int)i[8], 48, 0);
            this.E(2);
        } else {
            switch (a[n][n2]) {
                case 0: 
                case 1: 
                case 19: 
                case 43: 
                case 45: {
                    h.a[n][n2] = -1;
                    this.b(n, n2);
                    this.p(n, n2);
                }
            }
        }
        h.c[n][n2] = 24;
    }

    private void t(int n) {
        if (n < 0) {
            return;
        }
        this.j(q[n], r[n]);
    }

    private void bn() {
        int n;
        h h2;
        boolean bl;
        boolean bl2;
        int n2;
        g g2;
        block68: {
            int n3;
            int n4;
            boolean bl3;
            block67: {
                int n5 = (this.aS & 0x4000) == 0 ? 0 : 3;
                g2 = a[n5];
                n2 = -1;
                bl2 = true;
                bl = false;
                bl3 = g2.a();
                if (bl3) {
                    this.aS &= 0xFFFFDFFF;
                }
                if (n5 != 3) break block67;
                if (bl3) {
                    this.aS &= 0xFFFFB7FF;
                    n4 = this.f();
                }
                break block68;
            }
            switch (g2.f) {
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: {
                    if (bl3) {
                        n2 = 0 + (this.aS & 7) - 1;
                        this.j = 0;
                        this.k = 0;
                        this.aR = 0;
                        W = 0;
                    }
                    break block68;
                }
                case 1: 
                case 3: {
                    if (bl3) {
                        n2 = 0 + (this.aS & 7) - 1;
                    }
                    bl = true;
                    break block68;
                }
                case 36: 
                case 37: 
                case 38: 
                case 39: {
                    if (bl3) {
                        n3 = 4;
                        break;
                    }
                    break block68;
                }
                case 47: {
                    this.aR = 0;
                    this.k = 0;
                    this.j = 0;
                    if ((aN & 1) == 0) {
                        int n6 = this.aP - 2 + aN % 5;
                        int n7 = this.aQ - 2 + aN % 3;
                        if (n6 == this.aP && (n7 == this.aQ || n7 == this.aQ - 1)) {
                            n6 += (aN >> 1 & 1) == 0 ? 1 : -1;
                        }
                        this.d(n6, n7, aN * 3 % 5);
                    }
                    if (bl3) {
                        n2 = 0 + (this.aS & 7) - 1;
                        this.aC = -1;
                        this.aB = -1;
                        this.aA = -1;
                    }
                    break block68;
                }
                case 40: 
                case 48: {
                    this.aR = 0;
                    this.k = 0;
                    this.j = 0;
                    if (g2.h == 0) {
                        if (g2.g == (g2.f == 40 ? 12 : 6)) {
                            this.E(4);
                        }
                        if (g2.g == (g2.f == 40 ? 13 : 6)) {
                            this.bR();
                        }
                    }
                    if (g2.a()) {
                        this.m = System.currentTimeMillis();
                        n2 = 0 + (this.aS & 7) - 1;
                        this.aC = -1;
                        this.aB = -1;
                        this.aA = -1;
                    }
                    break block68;
                }
                case 35: {
                    bl = true;
                    n4 = 35;
                    break block68;
                }
                case 34: {
                    bl = true;
                    n4 = 34;
                    break block68;
                }
                case 0: {
                    bl = true;
                    n4 = 0;
                    break block68;
                }
                case 2: {
                    bl = true;
                    n4 = 2;
                    break block68;
                }
                case 9: {
                    if (!this.l) {
                        n4 = 27;
                    }
                    break block68;
                }
                case 8: {
                    if (!this.l) {
                        n4 = 26;
                    }
                    break block68;
                }
                case 27: {
                    if (!this.l) {
                        n4 = 9;
                    }
                    break block68;
                }
                case 26: {
                    if (!this.l) {
                        n4 = 8;
                    }
                    break block68;
                }
                case 4: 
                case 6: {
                    if (this.l) {
                        n4 = g2.f;
                    }
                    break block68;
                }
                case 5: {
                    if (!this.l) {
                        n4 = 24;
                    }
                    break block68;
                }
                case 7: {
                    if (!this.l) {
                        n4 = 25;
                    }
                    break block68;
                }
                case 24: {
                    if (this.l) {
                        n4 = 5;
                    }
                    break block68;
                }
                case 25: {
                    if (this.l) {
                        n4 = 7;
                    }
                    break block68;
                }
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 30: 
                case 31: 
                case 32: 
                case 33: {
                    if (bl3) {
                        bl2 = false;
                        W = 0;
                    }
                    break block68;
                }
                case 19: {
                    if (bl3) {
                        bl2 = false;
                        this.bm();
                    }
                    break block68;
                }
                case 13: 
                case 14: 
                case 15: 
                case 16: 
                case 28: 
                case 29: {
                    if (bl3) {
                        W = 0;
                        this.k = 0;
                        this.aR = 0;
                        n3 = 0;
                        break;
                    }
                    if ((this.aS & 0x2000) == 0 && g2.g == 2 && g2.h == 0) {
                        int n8 = this.aP - g[this.aS & 7];
                        int n9 = this.aQ - g[(this.aS & 7) + 8];
                        if (i[9] >= 8 && g2.g == 2 && g2.h == 0) {
                            this.d(n8, n9, -1);
                        }
                        this.f(n8, n9);
                        this.j = 0;
                        W = 0;
                    }
                    break block68;
                }
                case 11: {
                    if (a[this.aP][this.aQ - 1] == -1) {
                        n3 = 0;
                        break;
                    }
                    if (bl3 && a[this.aP][this.aQ - 1] != -1) {
                        this.b = 0L;
                        this.a((int)i[8], 32, 0);
                    }
                    break block68;
                }
                case 17: 
                case 18: {
                    if (bl3) {
                        n2 = 0 + (this.aS & 7) - 1;
                        this.aR = 0;
                    } else if (g2.g > 0 && this.aA != -1) {
                        int n10 = (this.aS & 7) == 2 ? this.aP + 1 : this.aP - 1;
                        int n11 = a[n10][this.aQ] >> 8;
                        int n12 = a[n10][this.aQ] & 0xFF;
                        n11 |= 0x100;
                        if (n12 == 9) {
                            --this.aU;
                        } else {
                            --this.aV;
                        }
                        h.a[n10][this.aQ] = n11 << 8 | n12;
                        this.s(n11 & 0xFF);
                        this.aC = -1;
                        this.aA = -1;
                    }
                    break block68;
                }
                case 10: {
                    if (bl3) {
                        this.aS &= 0xFFFFF7FF;
                        n4 = this.f();
                    } else {
                        this.b = 40L;
                    }
                    break block68;
                }
                case 12: {
                    if (this.bl < 160) {
                        this.bl += 12;
                    }
                    break block68;
                }
                default: {
                    n3 = 36;
                }
            }
            n4 = n2 = n3 + (this.aS & 7) - 1;
        }
        if (bl) {
            h h3 = this;
            h2 = h3;
            n = h3.am - 1;
        } else {
            h2 = this;
            n = h2.am = 70;
        }
        if (n2 != -1) {
            this.o(n2);
        }
        if (bl2) {
            g2.b();
        }
        this.b = this.b > 0 ? (this.b = this.b - 1) : 0;
    }

    private int f() {
        int n = 0;
        if (this.n <= 0) {
            this.E(2);
            n = 12;
            this.aW = 80;
        } else {
            n = 0 + (this.aS & 7) - 1;
            this.aS = this.aS & 0xFFFFFF8F | 0;
            this.b = 40L;
        }
        this.k = 0;
        return n;
    }

    private static void u(int n) {
        if (k) {
            h.a.a.vibrate(n);
        }
    }

    private void bo() {
        if (this.o <= 0) {
            int n = this.bi > 0 ? 1 : -1;
            this.bi -= n;
            if (this.bi != 0) {
                if (a[this.bg][this.bh] == 48) {
                    int n2 = b[this.bg][this.bh];
                    int n3 = this.bh + ((n2 & 8) == 0 ? -1 : 1);
                    if (a[this.bg + n][n3] < 0) {
                        h.a[this.bg + n][n3] = a[this.bg][n3];
                        h.a[this.bg][n3] = -1;
                        h.b[this.bg + n][n3] = b[this.bg][n3];
                        h.b[this.bg][n3] = this.o;
                    } else {
                        int n4;
                        int n5 = this.aP;
                        while (a[n4 = n5 - n][this.aQ] == 32) {
                            h.a[n4][this.aQ] = -1;
                            n5 = n4;
                        }
                        this.bi = 0;
                        return;
                    }
                }
                h.a[this.bg + n][this.bh] = a[this.bg][this.bh];
                h.a[this.bg][this.bh] = -1;
                this.b(this.bg, this.bh);
                this.bg += n;
                h.b[this.bg][this.bh] = this.be | Integer.MIN_VALUE;
                h.b[this.bg][this.bh] = this.o = (byte)18;
            } else {
                if (a[this.bg][this.bh] == 48) {
                    int n6 = b[this.bg][this.bh];
                    int n7 = this.bh + ((n6 & 8) == 0 ? -1 : 1);
                    h.b[this.bg][n7] = 0;
                } else {
                    h.b[this.bg][this.bh] = this.bf;
                }
                h.b[this.bg][this.bh] = 0;
                this.bf = -1;
                this.c(this.bg, this.bh);
            }
            h.q(this.bg - n, this.bh);
            return;
        }
        h.b[this.bg][this.bh] = this.o = (byte)(this.o - 6);
        if ((this.bi == 1 || this.bi == -1) && this.o <= 6 && (this.aS & 0x70) == 0) {
            this.o((this.aS & 7) == 4 ? 23 : 21);
        }
    }

    private void bp() {
        int n;
        h h2;
        int n2;
        h h3;
        int n3 = aN % 89;
        if (n3 < 15) {
            h3 = this;
            n2 = 0;
        } else if (n3 < 45) {
            h3 = this;
            n2 = 48 * (n3 - 15) / 30;
        } else if (n3 < 60) {
            h3 = this;
            n2 = 48;
        } else {
            h3 = this;
            n2 = 48 - 48 * (n3 - 60) / 30;
        }
        h3.aI = n2;
        this.aJ = this.aI > 0 ? (this.aI - 1) / 24 + 2 : 1;
        n3 = aN % 44;
        if (n3 < 7) {
            h2 = this;
            n = 0;
        } else if (n3 < 22) {
            h2 = this;
            n = 48 * (n3 - 7) / 15;
        } else if (n3 < 30) {
            h2 = this;
            n = 48;
        } else {
            h2 = this;
            n = 48 - 48 * (n3 - 30) / 15;
        }
        h2.aK = n;
        this.aL = this.aK > 0 ? (this.aK - 1) / 24 + 2 : 1;
    }

    private void bq() {
        int n;
        h h2;
        int n2 = k[this.ax << 1] - this.aP;
        int n3 = k[(this.ax << 1) + 1] - this.aQ;
        if (this.i == 2 && this.ax == 2) {
            n2 = 10;
            n3 = -8;
        }
        if (n3 == 0) {
            if (n2 < 0) {
                h2 = this;
                n = 12;
            } else {
                h2 = this;
                n = 4;
            }
        } else if (n2 == 0) {
            if (n3 < 0) {
                h2 = this;
                n = 0;
            } else {
                h2 = this;
                n = 8;
            }
        } else {
            int n4 = n2 * 128 / n3;
            if (n4 > 0) {
                if (n4 < 128) {
                    if (n2 > 0) {
                        h2 = this;
                        n = 7;
                    } else {
                        h2 = this;
                        n = 15;
                    }
                } else if (n4 > 128) {
                    if (n2 > 0) {
                        h2 = this;
                        n = 5;
                    } else {
                        h2 = this;
                        n = 13;
                    }
                } else if (n2 > 0) {
                    h2 = this;
                    n = 6;
                } else {
                    h2 = this;
                    n = 14;
                }
            } else if (n4 > -128) {
                if (n2 < 0) {
                    h2 = this;
                    n = 9;
                } else {
                    h2 = this;
                    n = 1;
                }
            } else if (n4 < -128) {
                if (n2 < 0) {
                    h2 = this;
                    n = 11;
                } else {
                    h2 = this;
                    n = 3;
                }
            } else if (n2 < 0) {
                h2 = this;
                n = 10;
            } else {
                h2 = this;
                n = 2;
            }
        }
        h2.ac = n;
    }

    private void br() {
        switch (this.i) {
            case 2: {
                this.bB();
                this.bs();
                return;
            }
            case 1: {
                this.bA();
                return;
            }
            case 3: {
                this.bz();
                return;
            }
            case 4: {
                this.bv();
                return;
            }
            case 5: {
                this.bt();
            }
        }
    }

    private void bs() {
        if (this.d(61, 3) && this.aR == 6) {
            this.d(this.aP, this.aQ, 5);
            this.c = false;
        }
        if (this.a == null && (this.d(60, 3) || this.d(61, 3))) {
            this.b(true);
            this.N = true;
            this.ct();
            this.B();
            this.ap = 0;
            this.aq = 0;
            this.u();
        }
        if (this.aD == 2) {
            h.a[11][50] = -1;
        }
    }

    private void k(int n, int n2) {
        for (int i = -1; i < 2; ++i) {
            for (int j = -1; j < 2; ++j) {
                int n3 = (this.ar + n) / 24 + j;
                int n4 = (this.as + n2) / 24 + i;
                if (!this.d(n3, n4)) continue;
                this.a(1, 48, 0);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void bt() {
        block60: {
            block58: {
                block61: {
                    block59: {
                        block57: {
                            var1_1 = h.a[5];
                            if (this.ad != 12) break block57;
                            if (this.ae++ > 100) {
                                this.ad = 15;
                                this.p(11, 11);
                            } else {
                                this.E(7);
                            }
                            v0 = var1_1;
                            break block58;
                        }
                        if (this.ad != -1) break block59;
                        if (this.aP * 24 >= 360) {
                            this.ad = 10;
                            var1_1.a(10);
                            return;
                        }
                        break block60;
                    }
                    if (this.ad == 15 || this.ad == -1) break block60;
                    var2_2 = -1;
                    var3_3 = this.aP * 24 + 12;
                    var4_4 = this.aQ * 24;
                    var5_5 = this.ai + 24;
                    if (this.ad == 13) {
                        var2_2 = 13;
                        if (var3_3 > var5_5) {
                            this.af = true;
                        }
                    }
                    v1 = var6_6 = this.af > 0 && h.aN % this.af == 0 ? 2 : 1;
                    if (this.ad == 6 || this.ad == 7) {
                        v2 = var6_6 = (h.aN & 11) == 0 ? 2 : var6_6;
                    }
                    if (!(this.ae || this.ad != 0 && this.ad != 1)) {
                        if (this.ad == 0) {
                            this.dk = 36;
                            this.dk ^= -1;
                            v3 = this;
                            v4 = v3;
                            v5 = v3.dk + 1;
                        } else {
                            v4 = this;
                            v5 = v4.dk = 36;
                        }
                        if (var4_4 < 504 && (var3_3 == var5_5 + this.dk || h.aN % 76 == 0)) {
                            this.ae = true;
                        }
                    }
                    while (var6_6-- > 0) {
                        switch (this.ad) {
                            case 13: {
                                if (var1_1.a()) {
                                    var2_2 = 0;
                                    this.ad = 0;
                                    this.af = false;
                                    break;
                                }
                                if (!this.af) break;
                                var1_1.b();
                                break;
                            }
                            case 4: 
                            case 5: {
                                if (var1_1.a()) {
                                    var2_2 = this.ad == 4 ? 0 : 1;
                                    this.ad = var2_2;
                                }
                                this.ae = false;
                                this.dk = 0;
                                break;
                            }
                            case 10: 
                            case 11: {
                                if (var3_3 <= var5_5 || var5_5 >= 504) ** GOTO lbl65
                                v6 = this;
                                v7 = 1;
                                ** GOTO lbl68
lbl65:
                                // 1 sources

                                if (var3_3 >= var5_5 || var5_5 <= 360) ** GOTO lbl70
                                v6 = this;
                                v7 = 0;
lbl68:
                                // 2 sources

                                var2_2 = v7;
                                v6.ad = v7;
lbl70:
                                // 2 sources

                                this.ae = false;
                                this.dk = 0;
                                break;
                            }
                            case 6: {
                                if (var4_4 >= 504) {
                                    if (var3_3 >= var5_5 - 48) {
                                        var2_2 = 8;
                                        this.ad = 8;
                                        break;
                                    }
                                    this.ai -= 2;
                                    break;
                                }
                                if (var5_5 < 360) break;
                                var2_2 = 0;
                                this.ad = 0;
                                break;
                            }
                            case 7: {
                                if (var4_4 >= 504) {
                                    if (var3_3 <= var5_5 + 48) {
                                        var2_2 = 9;
                                        this.ad = 9;
                                        break;
                                    }
                                    this.ai += 2;
                                    break;
                                }
                                if (var5_5 > 504) break;
                                var2_2 = 1;
                                this.ad = 1;
                                break;
                            }
                            case 0: {
                                if (var4_4 >= 504 && var5_5 > 360) {
                                    if (var3_3 < var5_5) {
                                        var2_2 = 6;
                                        this.ad = 6;
                                        break;
                                    }
                                    --this.ai;
                                    break;
                                }
                                if (this.ae) {
                                    var2_2 = 2;
                                    this.ad = 2;
                                    break;
                                }
                                if (var5_5 <= 360) {
                                    var2_2 = 1;
                                    this.ad = 1;
                                    break;
                                }
                                --this.ai;
                                break;
                            }
                            case 1: {
                                if (var4_4 >= 504 && var5_5 < 504) {
                                    if (var3_3 < var5_5) {
                                        ++this.ai;
                                        break;
                                    }
                                    var2_2 = 7;
                                    this.ad = 7;
                                    break;
                                }
                                if (this.ae) {
                                    var2_2 = 3;
                                    this.ad = 3;
                                    break;
                                }
                                if (var5_5 >= 504) {
                                    var2_2 = 0;
                                    this.ad = 0;
                                    break;
                                }
                                ++this.ai;
                                break;
                            }
                            case 8: {
                                if (var1_1.a()) {
                                    var2_2 = 10;
                                    this.ad = 10;
                                }
                                if (var1_1.g < 4 || var4_4 < 504 || var3_3 < var5_5 - 48 || var3_3 > var5_5) break;
                                ** GOTO lbl164
                            }
                            case 9: {
                                if (var1_1.a()) {
                                    var2_2 = 11;
                                    this.ad = 11;
                                }
                                if (var1_1.g < 4 || var4_4 < 504 || var3_3 < var5_5 || var3_3 > var5_5 + 48) break;
                                ** GOTO lbl164
                            }
                            case 3: {
                                if (var1_1.g == 5 && var1_1.h == 0) {
                                    this.bj = 30;
                                }
                                if (var1_1.a()) {
                                    var2_2 = 11;
                                    this.ad = 11;
                                    this.ae = false;
                                    this.dk = 0;
                                }
                                if (var1_1.g < 7 || var4_4 >= 504 || var3_3 != var5_5 + this.dk) break;
                                ** GOTO lbl164
                            }
                            case 2: {
                                if (var1_1.g == 5 && var1_1.h == 0) {
                                    this.bj = 30;
                                }
                                if (var1_1.a()) {
                                    var2_2 = 10;
                                    this.ad = 10;
                                    this.ae = false;
                                    this.dk = 0;
                                }
                                if (var1_1.g < 7 || var4_4 >= 504 || var3_3 != var5_5 + this.dk) break;
lbl164:
                                // 4 sources

                                this.a(1, 48, 0);
                            }
                        }
                        if (var4_4 < 504 || var3_3 < var5_5 - 24 || var3_3 > var5_5 - 24) continue;
                        this.a(1, 48, (int)h.h[this.aS & 7]);
                    }
                    if ((this.ad == 8 || this.ad == 9) && var1_1.g == 5) {
                        this.bx();
                    }
                    if (this.ad == 6 || this.ad == 7) break block61;
                    for (var7_7 = 21; var7_7 < 23; ++var7_7) {
                        for (var8_8 = var5_5 / 24 - 1; var8_8 < var5_5 / 24 - 2 + 4; ++var8_8) {
                            block62: {
                                if (h.a[var8_8][var7_7] != 0) continue;
                                if ((h.b[var8_8][var7_7] & 7) != 3 || this.ad == 13) break block62;
                                --this.af;
                                switch (this.ad) {
                                    case 0: 
                                    case 2: 
                                    case 4: 
                                    case 8: 
                                    case 10: {
                                        v8 = this;
                                        v9 = 4;
                                        ** GOTO lbl184
                                    }
                                    case 1: 
                                    case 3: 
                                    case 5: 
                                    case 9: 
                                    case 11: {
                                        v8 = this;
                                        v9 = 5;
lbl184:
                                        // 2 sources

                                        var2_2 = v9;
                                        v8.ad = v9;
                                    }
                                }
                            }
                            h.a[var8_8][var7_7] = -1;
                            this.b(var8_8, var7_7);
                            h.a[var8_8][var7_7] = 30;
                            h.c[var8_8][var7_7] = 24;
                            h.b[var8_8][var7_7] = 4;
                            this.E(14);
                        }
                    }
                }
                if (this.af <= 0) {
                    this.ad = 12;
                    this.ae = 0;
                    var2_2 = 12;
                }
                if (var2_2 != -1) {
                    var1_1.a(var2_2);
                    return;
                }
                v0 = var1_1;
            }
            v0.b();
        }
    }

    private void bu() {
        int n = this.g();
        if (this.aP == n || this.aP == n + 1) {
            g g2 = a[5];
            int n2 = g2.b + -40;
            int n3 = g2.b + 256;
            int n4 = (g2.a.b[g2.f] + g2.g) * 5;
            int n5 = h.a[0].b;
            if (n5 > (n2 -= (n4 = (g2.a.f[n4 + 3] << 0) * 1 / 1)) && n5 < (n3 -= n4) && !this.h) {
                this.a(1, 48, this.aP == n ? 4 : 2);
            }
        }
    }

    private static void l(int n, int n2) {
        if (n < 0 || n2 < 0) {
            return;
        }
        h.a[n][n2] = -1;
        h.a[n + 1][n2] = -1;
    }

    private static void m(int n, int n2) {
        if (n < 0 || n2 < 0) {
            return;
        }
        h.a[n][n2] = 50;
        h.a[n + 1][n2] = 50;
    }

    private boolean c(int n, int n2) {
        boolean bl = false;
        for (int i = n; i <= n + 1; ++i) {
            for (int j = n2; j >= n2 - 1; --j) {
                if (a[i][j] != 0) continue;
                this.h(i, j);
                h.q(i, j);
                h.a[i][j] = -1;
                this.b(i, j);
                bl = true;
            }
        }
        return bl;
    }

    private int g() {
        int n = this.ag > 0 ? 1 : 0;
        return 10 + this.ag * (2 + n);
    }

    private int h() {
        g g2 = a[5];
        int n = g2.b + -40;
        int n2 = (g2.a.b[g2.f] + g2.g) * 5;
        n2 = (g2.a.f[n2 + 3] << 0) * 1 / 1;
        n -= n2;
        return this.aw * (n += this.as) / (this.aw * 24);
    }

    private boolean d() {
        int n = this.g();
        int n2 = this.h();
        boolean bl = false;
        for (int i = n; i <= n + 1; ++i) {
            for (int j = n2; j <= 10; ++j) {
                if (a[i][j] != 0) continue;
                this.h(i, j);
                h.q(i, j);
                h.a[i][j] = -1;
                this.b(i, j);
                bl = true;
            }
        }
        return bl;
    }

    private int i() {
        int n = this.aP - 10;
        int n2 = n / 3;
        if (n == n2 * 3 + 2) {
            n2 += aN % 50 / 25;
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     */
    private void bv() {
        if (this.ad == 5) {
            if (this.aa) {
                return;
            }
            this.aa = true;
        }
        var1_1 = h.a[5];
        ++this.ae;
        var2_2 = -1;
        var3_3 = h.a[4];
        var4_4 = -1;
        var5_5 = this.g();
        if (h.a[this.E][2] == -1) {
            h.a[this.E][2] = 31;
        }
        if (h.a[this.F][2] == -1) {
            h.a[this.F][2] = 31;
        }
        switch (this.ad) {
            case 0: {
                if (this.aP < 10) break;
                this.ad = 6;
                this.ae = 0;
                break;
            }
            case 6: {
                if (this.ae <= 10) break;
                this.ad = 1;
                var2_2 = 2;
                this.ae = 0;
                break;
            }
            case 1: {
                var7_6 = false;
                if (this.ae > 40) {
                    this.ad = 2;
                    this.ae = 0;
                    break;
                }
                if (this.ae <= 20) break;
                this.c(var5_5, 8);
                h.m(var5_5, 8);
                this.B = var5_5;
                this.C = 8;
                break;
            }
            case 7: {
                h.l(this.B, this.C);
                this.B = -1;
                this.C = -1;
                if (this.ae > 80) {
                    this.ad = 8;
                    this.bT();
                }
                if ((this.ae & 111) != 1) break;
                this.E(7);
                break;
            }
            case 3: {
                var7_7 = false;
                if (this.ae <= 40) break;
                if (this.af > 0) {
                    if (this.H == 10) {
                        this.ad = 9;
                        this.ae = 0;
                        break;
                    }
                    if (this.H != 2 && this.H != 1) break;
                    this.ad = 4;
                    this.ae = 0;
                    var2_2 = 2;
                    break;
                }
                this.ad = 7;
                this.ae = 0;
                break;
            }
            case 2: {
                var7_8 = false;
                if (this.c(var5_5, 8)) {
                    --this.af;
                    this.H = this.ad;
                    h.l(this.B, this.C);
                    this.B = -1;
                    this.C = -1;
                    this.H = this.ad;
                    this.ad = 3;
                    var2_2 = 3;
                    this.E(10);
                }
                if (this.ae > 15 && var1_1.f != 6) {
                    var2_2 = 6;
                }
                if (this.ae <= 30) break;
                this.ad = 4;
                this.ae = 0;
                var2_2 = 0;
                h.l(this.B, this.C);
                this.B = -1;
                this.C = -1;
                break;
            }
            case 4: {
                v0 = var7_9 = this.af <= 1 ? 5 : 10;
                if (this.ae < var7_9) ** GOTO lbl95
                this.ad = 5;
                this.ae = 0;
                v1 = 4;
                ** GOTO lbl97
lbl95:
                // 1 sources

                if (this.ae <= var7_9 >> 1 || var1_1.f == 1) ** GOTO lbl98
                v1 = 1;
lbl97:
                // 2 sources

                var2_2 = v1;
lbl98:
                // 2 sources

                this.d();
                this.bu();
                break;
            }
            case 5: {
                var8_10 = var1_1.b + -40;
                var9_11 = (var1_1.a.b[var1_1.f] + var1_1.g) * 5;
                var9_11 = (var1_1.a.f[var9_11 + 3] << 0) * 1 / 1;
                if ((var8_10 -= var9_11) <= 72 - this.as + 40) {
                    this.I = 0;
                    this.bx();
                    this.ad = 10;
                    this.B = var5_5;
                    this.C = 4;
                    h.m(this.B, this.C);
                }
                this.d();
                this.bu();
                break;
            }
            case 9: {
                this.ae -= 2;
                this.bu();
                var10_12 = var1_1.b + -40;
                var11_13 = (var1_1.a.b[var1_1.f] + var1_1.g) * 5;
                var11_13 = (var1_1.a.f[var11_13 + 3] << 0) * 1 / 1;
                if ((var10_12 -= var11_13) < 240 - this.as + 40) break;
                this.ad = 6;
                this.ae = 0;
                this.ag = this.i();
                break;
            }
            case 10: {
                --this.ae;
                this.bu();
                ++this.A;
                if (this.A == 28) {
                    var2_2 = 7;
                }
                if (this.A < 50) break;
                this.A = 0;
                this.ad = 11;
                h.l(this.B, this.C);
                this.B = -1;
                this.C = -1;
                var2_2 = 8;
                var4_4 = 2;
                this.i = true;
                break;
            }
            case 11: {
                --this.ae;
                ++this.A;
                if (this.A >= 12) {
                    this.A = 0;
                    this.ad = 9;
                    var2_2 = 4;
                    this.h = false;
                    this.i = false;
                    break;
                }
                if (this.h) break;
                this.bw();
            }
        }
        if (var2_2 == -1) {
            var1_1.b();
        } else {
            var1_1.a(var2_2);
        }
        if (this.i) {
            if (var4_4 == -1) {
                var3_3.b();
                return;
            }
            var3_3.a(var4_4);
        }
    }

    private void bw() {
        int n = this.g();
        if (this.aQ == 4 && this.aP >= n - 3 && this.aP <= n + 4) {
            this.a(1, 64, this.aP == n ? 4 : 2);
            this.h = true;
        }
    }

    private void bx() {
        this.bj = 30;
        if (a[this.E][this.G] == -1) {
            h.a[this.E][this.D] = 0;
            h.q(this.E, this.D);
        }
        if (a[this.F][this.G] == -1) {
            h.a[this.F][this.D] = 0;
            h.q(this.F, this.D);
        }
    }

    private void by() {
        this.ad = -1;
        this.af = 5;
    }

    /*
     * Unable to fully structure code
     */
    private void bz() {
        block61: {
            block59: {
                block65: {
                    block62: {
                        block64: {
                            block63: {
                                block60: {
                                    block58: {
                                        var1_1 = h.a[5];
                                        var2_2 = this.bE;
                                        var3_3 = this.bF;
                                        var4_4 = this.aP - 8;
                                        var5_5 = this.aP + 8;
                                        var6_6 = this.aQ + 8;
                                        var7_7 = this.aQ - 8;
                                        for (var8_8 = 15; var8_8 <= 22; ++var8_8) {
                                            for (var9_9 = 14; var9_9 <= 21; ++var9_9) {
                                                if (var9_9 > var4_4 && var9_9 < var5_5 && var8_8 > var6_6 && var8_8 < var7_7 || h.a[var9_9][var8_8] != 44) continue;
                                                this.bE = var9_9;
                                                this.bF = var8_8;
                                                this.bL();
                                            }
                                        }
                                        this.bE = var2_2;
                                        this.bF = var3_3;
                                        if (this.n == 0) {
                                            this.by();
                                        }
                                        if (this.ad != 12) break block58;
                                        if (this.ae++ > 100) {
                                            this.ad = 15;
                                            this.p(11, 11);
                                        } else {
                                            this.E(7);
                                        }
                                        v0 = var1_1;
                                        break block59;
                                    }
                                    if (this.ad != -1) break block60;
                                    if (this.aP * 24 >= 336) {
                                        this.ad = 0;
                                        var1_1.a(0);
                                        return;
                                    }
                                    break block61;
                                }
                                if (this.ad == 15 || this.ad == -1) break block61;
                                var8_8 = -1;
                                var9_9 = this.aP * 24 + 12;
                                var10_10 = this.aQ * 24;
                                var11_11 = this.ah + 24;
                                if (this.n == 0L && this.n != 0) {
                                    this.n = h.aN + d.a(340, 441);
                                }
                                v1 = var12_12 = this.af > 0 && h.aN % this.af == 0 ? 2 : 1;
                                if (this.ad == 10 || this.ad == 11) {
                                    v2 = var12_12 = (h.aN & 11) == 0 ? 2 : var12_12;
                                }
                                while (var12_12-- > 0) {
                                    switch (this.ad) {
                                        case 2: {
                                            if (!var1_1.a()) break;
                                            if ((long)h.aN > this.n) {
                                                var8_8 = 13;
                                                this.ad = 13;
                                                break;
                                            }
                                            var8_8 = 4;
                                            this.ad = 4;
                                            break;
                                        }
                                        case 3: {
                                            if (!var1_1.a()) break;
                                            if ((long)h.aN > this.n) {
                                                var8_8 = 14;
                                                this.ad = 14;
                                                break;
                                            }
                                            var8_8 = 5;
                                            this.ad = 5;
                                            break;
                                        }
                                        case 0: {
                                            if (var11_11 > 360) {
                                                var8_8 = 4;
                                                this.ad = 4;
                                                break;
                                            }
                                            var8_8 = 5;
                                            this.ad = 5;
                                            break;
                                        }
                                        case 1: {
                                            if (var11_11 < 504) {
                                                var8_8 = 5;
                                                this.ad = 5;
                                                break;
                                            }
                                            var8_8 = 4;
                                            this.ad = 4;
                                            break;
                                        }
                                        case 10: {
                                            if (var1_1.a()) {
                                                this.bj = 10;
                                                var11_11 = this.ah + 24;
                                                if ((long)h.aN > this.n) {
                                                    var8_8 = 13;
                                                    this.ad = 13;
                                                    break;
                                                }
                                                if (var10_10 >= 504) {
                                                    if (var9_9 < var11_11 - 48) break;
                                                    var8_8 = 6;
                                                    this.ad = 6;
                                                    break;
                                                }
                                                var8_8 = 4;
                                                this.ad = 4;
                                                break;
                                            }
                                            this.ah -= 2;
                                            break;
                                        }
                                        case 11: {
                                            if (var1_1.a()) {
                                                this.bj = 10;
                                                var11_11 = this.ah + 24;
                                                if ((long)h.aN > this.n) {
                                                    var8_8 = 14;
                                                    this.ad = 14;
                                                    break;
                                                }
                                                if (var10_10 >= 504) {
                                                    if (var9_9 > var11_11 + 48) break;
                                                    var8_8 = 7;
                                                    this.ad = 7;
                                                    break;
                                                }
                                                var8_8 = 5;
                                                this.ad = 5;
                                                break;
                                            }
                                            this.ah += 2;
                                            break;
                                        }
                                        case 4: {
                                            if ((long)h.aN > this.n) {
                                                var8_8 = 13;
                                                this.ad = 13;
                                                break;
                                            }
                                            if (var10_10 >= 504 && var9_9 < var11_11 && this.ah - 48 >= 360) {
                                                var8_8 = 10;
                                                this.ad = 10;
                                            }
                                            if (var11_11 <= 360) {
                                                var8_8 = 5;
                                                this.ad = 5;
                                            }
                                            if (this.ad != 4) break;
                                            --this.ah;
                                            break;
                                        }
                                        case 5: {
                                            if ((long)h.aN > this.n) {
                                                var8_8 = 14;
                                                this.ad = 14;
                                                break;
                                            }
                                            if (var10_10 >= 504 && var9_9 > var11_11 && this.ah + 48 <= 504) {
                                                var8_8 = 11;
                                                this.ad = 11;
                                            }
                                            if (var11_11 >= 504) {
                                                var8_8 = 4;
                                                this.ad = 4;
                                            }
                                            if (this.ad != 5) break;
                                            ++this.ah;
                                            break;
                                        }
                                        case 6: 
                                        case 7: 
                                        case 13: 
                                        case 14: {
                                            var14_13 = 0;
                                            var15_14 = 0;
                                            var16_15 = 0;
                                            switch (this.ad) {
                                                case 6: 
                                                case 13: {
                                                    var14_13 = 4;
                                                    var15_14 = 2;
                                                    v3 = 1;
                                                    break;
                                                }
                                                case 7: 
                                                case 14: {
                                                    var14_13 = 5;
                                                    var15_14 = 1;
                                                    v3 = var16_15 = 2;
                                                }
                                            }
                                            if (var1_1.g == 5 && var1_1.h == 0) {
                                                if (this.ad == 13 || this.ad == 14) {
                                                    v4 = this;
                                                    v5 = 80;
                                                } else {
                                                    v4 = this;
                                                    v5 = v4.bj = 10;
                                                }
                                            }
                                            if (var1_1.a()) {
                                                if (this.ad == 13 || this.ad == 14) {
                                                    this.o = h.aN + 40;
                                                    this.n = h.aN + d.a(340, 441);
                                                }
                                                this.ad = var8_8 = var14_13;
                                            }
                                            if (var1_1.g < 5 || var10_10 < 504 || var9_9 < var11_11 - var15_14 * 24 || var9_9 > var11_11 + var16_15 * 24) break;
                                            this.a(1, 48, 4);
                                        }
                                    }
                                    if (var10_10 >= 504 && var9_9 >= var11_11 - 24 && var9_9 <= var11_11 + 24) {
                                        this.a(1, 48, (int)h.h[this.aS & 7]);
                                    }
                                    if (this.af > 0) continue;
                                    this.ad = 12;
                                    this.ae = 0;
                                    return;
                                }
                                if (this.ce != 5) break block62;
                                if (this.cf > 0) break block63;
                                if (this.af <= 2) {
                                    h.a[10][16] = 45;
                                    h.c[10][16] = 24;
                                    h.b[10][16] = 0;
                                    h.b[10][16] = 0;
                                }
                                h.a[26][19] = 45;
                                h.c[26][19] = 24;
                                h.b[26][19] = 0;
                                v6 = h.b[26];
                                v7 = 19;
                                break block64;
                            }
                            h.a[10][19] = 45;
                            h.c[10][19] = 24;
                            h.b[10][19] = 0;
                            h.b[10][19] = 0;
                            if (this.af > 2) break block62;
                            h.a[26][16] = 45;
                            h.c[26][16] = 24;
                            h.b[26][16] = 0;
                            v6 = h.b[26];
                            v7 = 16;
                        }
                        v6[v7] = 0;
                    }
                    if (this.ad == 10 || this.ad == 11) break block65;
                    for (var13_16 = 21; var13_16 < 23; ++var13_16) {
                        for (var14_13 = var11_11 / 24 - 1; var14_13 < var11_11 / 24 - 2 + 4; ++var14_13) {
                            block66: {
                                if (h.a[var14_13][var13_16] != 9) continue;
                                if ((h.b[var14_13][var13_16] & 7) != 3) break block66;
                                --this.af;
                                switch (this.ad) {
                                    case 0: 
                                    case 2: 
                                    case 4: 
                                    case 6: {
                                        v8 = this;
                                        v9 = 2;
                                        ** GOTO lbl221
                                    }
                                    case 1: 
                                    case 3: 
                                    case 5: 
                                    case 7: {
                                        v8 = this;
                                        v9 = 3;
lbl221:
                                        // 2 sources

                                        var8_8 = v9;
                                        v8.ad = v9;
                                    }
                                }
                            }
                            h.a[var14_13][var13_16] = -1;
                            this.b(var14_13, var13_16);
                            h.a[var14_13][var13_16] = 30;
                            h.c[var14_13][var13_16] = 24;
                            h.b[var14_13][var13_16] = 4;
                            this.E(14);
                        }
                    }
                }
                if (var8_8 != -1) {
                    var1_1.a(var8_8);
                    return;
                }
                v0 = var1_1;
            }
            v0.b();
        }
    }

    private void bA() {
        block19: {
            int n;
            g g2;
            block18: {
                block16: {
                    block17: {
                        if (a[18][63] == 0 && b[18][63] <= 0 && this.ab == 0) {
                            this.bj = 120;
                            ++this.ab;
                        }
                        if (this.ab != 3) break block16;
                        if (h.a[2].f != 0) break block17;
                        g2 = a[2];
                        n = 1;
                        break block18;
                    }
                    if (h.a[2].f == 1 && a[2].a()) {
                        a[2].a(2);
                        if (this.aQ == this.aw - 4) {
                            this.aa = 817;
                        }
                    }
                    break block19;
                }
                if (h.a[2].f == 0) break block19;
                g2 = a[2];
                n = 0;
            }
            g2.a(n);
        }
        a[2].b();
        if (h.a[2].f == 2) {
            a[1].b();
            if (this.bj == 10) {
                this.bj = 60;
            }
            if (h.a[1].f == 0) {
                if ((this.a == null || this.aa < 46) && this.aa < 1704) {
                    ++this.aa;
                    int n = this.aw * 24 - (this.as + 320 - 80);
                    if (this.aa < n) {
                        this.aa = n;
                    }
                }
                if (this.aw * 24 - this.aa <= this.aQ * 24 + 18 && this.aP < 17) {
                    this.a((int)i[8], 64, 1);
                    return;
                }
            } else if (a[1].a()) {
                a[1].a(0);
            }
        }
    }

    private void bB() {
        if (a != null && this.b() && (a[this.aP][this.aQ] & 0xFF) == 0) {
            int n = a[this.aP][this.aQ] >> 8;
            if (n == 13) {
                this.o = true;
            } else if (n == 16) {
                this.p = true;
            }
        }
        if (!this.q && this.aR <= 0 && this.d(46, 7)) {
            this.r = true;
            this.q = true;
        }
    }

    public final void c() {
        block18: {
            int n;
            block17: {
                h h2;
                h h3;
                int n2;
                block16: {
                    int n3;
                    h h4;
                    int n4;
                    h h5;
                    byte by = (this.aS & 0x1000) == 0 ? this.k : (byte)0;
                    int n5 = this.aP * 24 + this.aR * g[by];
                    int n6 = 24 * this.av - 240;
                    n2 = 24 * this.aw - 240;
                    if (n5 < this.at + 96) {
                        this.at = this.at - 96 + n5 >> 1;
                        if (this.at < 0) {
                            h5 = this;
                            n4 = 0;
                        }
                    } else if (n5 > this.at + 120) {
                        this.at = this.at - 120 + n5 >> 1;
                        if (this.at > n6) {
                            h5 = this;
                            n4 = h5.at = n6;
                        }
                    }
                    if ((n5 = this.aQ * 24 + this.aR * g[by + 8] + 40) < this.au + 96) {
                        this.au = this.au - 96 + n5 >> 1;
                        if (this.au < 0) {
                            this.au = 0;
                        }
                    }
                    if (n5 > this.au + 160) {
                        this.au = this.au - 160 + n5 >> 1;
                        if (this.au > n2) {
                            this.au = n2;
                        }
                    }
                    this.ar = this.at;
                    this.as = this.au;
                    if (this.ar < 0) {
                        h4 = this;
                        n3 = 0;
                    } else if (this.ar > n6) {
                        h4 = this;
                        n3 = h4.ar = n6;
                    }
                    if (this.as >= 0) break block16;
                    h3 = this;
                    h2 = this;
                    n = 0;
                    break block17;
                }
                if (this.as <= n2) break block18;
                h3 = this;
                h2 = this;
                n = n2;
            }
            h2.au = n;
            h3.as = n;
        }
    }

    private void a(int n, int n2, boolean bl, byte by) {
        int n3;
        int n4;
        int n5 = bl ? n + 1 : n - 1;
        int n6 = b[n][n2];
        h.a[n5][n2] = by;
        h.a[n][n2] = -1;
        h.b[n5][n2] = 18;
        if (bl) {
            n6 = n6 & 0xFFFFFFF8 | 2;
            n4 = n6 & 0xFFFFF3FF;
            n3 = 1024;
        } else {
            n6 = n6 & 0xFFFFFFF8 | 4;
            n4 = n6 & 0xFFFFF3FF;
            n3 = 2048;
        }
        n6 = n4 | n3;
        h.b[n5][n2] = n6 & 0xFFFFFDFF | Integer.MIN_VALUE;
        h.q(n5, n2);
        this.b(n, n2);
    }

    private void b(int n, int n2, byte by) {
        if ((a[n][n2] & 0xFF) == by) {
            h.a[n][n2] = -1;
            this.b(n - 1, n2, by);
            this.b(n + 1, n2, by);
            this.b(n, n2 - 1, by);
            this.b(n, n2 + 1, by);
        }
    }

    /*
     * Unable to fully structure code
     */
    private boolean a(int var1_1, int var2_2, boolean var3_3) {
        block59: {
            block58: {
                var4_4 = false;
                var5_5 = this.aS;
                var6_6 = this.aP;
                var7_7 = this.aQ;
                var8_8 = this.k;
                var9_9 = this.v;
                var10_10 = this.aX;
                var11_11 = this.aR;
                var12_12 = this.aW;
                if (var1_1 > 0) {
                    v0 = var5_5 & -8;
                    v1 = 2;
                } else if (var1_1 < 0) {
                    v0 = var5_5 & -8;
                    v1 = 4;
                } else if (var2_2 < 0) {
                    v0 = var5_5 & -8;
                    v1 = 1;
                } else {
                    v0 = var5_5 & -8;
                    v1 = 3;
                }
                var5_5 = v0 | v1;
                var13_13 = var6_6 + var1_1;
                var14_14 = var7_7 + var2_2;
                var15_15 = false;
                var16_16 = false;
                if (var13_13 >= 0 && var13_13 < this.av && var14_14 >= 0 && var14_14 < this.aw) break block58;
                var15_15 = true;
                break block59;
            }
            if (h.e != null && h.e[var13_13][var14_14] != 0 && h.i[10] == 0) {
                var15_15 = false;
                var4_4 = true;
            }
            var17_17 = (byte)(h.a[var13_13][var14_14] & 255);
            switch (var17_17) {
                case 19: {
                    if (var3_3) break;
                    var19_18 = var13_13 + 3;
                    var20_19 = var14_14;
                    while (h.a[var19_18][var20_19] != 39) {
                        --var20_19;
                    }
                    if (!this.j) {
                        this.co();
                    }
                    this.j = true;
                    this.ao = false;
                    if (h.e == null) {
                        h.e = new int[this.av][this.aw];
                    }
                    this.a((byte)h.b[var19_18][var20_19], var19_18, (byte)var20_19, (byte)0);
                    this.v(var19_18, var20_19);
                    var19_18 = var13_13;
                    while ((h.a[var19_18][++var20_19] & 255) == 19) {
                        h.a[var19_18][var20_19] = -1;
                    }
                    break;
                }
                case 1: {
                    if (var3_3) break;
                    this.bj = 120;
                    ++this.ab;
                    this.b((int)var13_13, var14_14, (byte)1);
                    break;
                }
                case 7: {
                    var18_20 = h.a[var13_13][var14_14] >> 8;
                    if ((var18_20 & 240) >> 4 >= 2) break;
                    v2 = true;
                    break;
                }
                case 4: {
                    if (var3_3 || (var18_21 = (h.a[var13_13][var14_14] & -256) >> 8) < this.ax) break;
                    this.u = true;
                    this.ax = var18_21 + 1;
                    this.Z = h.aN + 13;
                    break;
                }
                case 28: {
                    if (var3_3) break;
                    var9_9 = true;
                    this.aw = false;
                    break;
                }
                case 5: {
                    var15_15 = true;
                    if (var3_3) break;
                    var9_9 = true;
                    this.aw = true;
                    break;
                }
                case 2: {
                    if (var3_3) break;
                    var16_16 = true;
                    var18_22 = h.a[var13_13][var14_14] >> 8;
                    switch (var18_22) {
                        case 0: {
                            if (h.i[9] < 1) ** GOTO lbl98
                            this.ay = 7;
                            v3 = this;
                            v4 = 0;
                            ** GOTO lbl110
lbl98:
                            // 1 sources

                            v5 = this;
                            ** GOTO lbl106
                        }
                        case 1: {
                            if (h.i[9] >= 2) {
                                v5 = this;
                                v6 = 7;
                            } else {
                                v5 = this;
lbl106:
                                // 2 sources

                                v6 = 13;
                            }
                            v5.ay = v6;
                            v3 = this;
                            v4 = 1;
lbl110:
                            // 2 sources

                            v3.az = v4;
                        }
                    }
                    break;
                }
                case 6: {
                    break;
                }
                case 3: {
                    if (h.a[var13_13][var14_14] >> 8 < 3) {
                        var15_15 = true;
                        break;
                    }
                    var15_15 = false;
                    v2 = var4_4 = true;
                }
            }
            if (var4_4) break block59;
            var19_18 = h.a[var13_13][var14_14];
            switch (var19_18) {
                case 34: 
                case 35: {
                    var15_15 = var3_3;
                    break;
                }
                case 31: 
                case 49: {
                    var15_15 = false;
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
                    var15_15 = true;
                    break;
                }
                case 10: {
                    if (this.x != 3) break;
                    if (!var3_3 && h.b[var13_13][var14_14] <= 0) {
                        h.b[var13_13][var14_14] = 1;
                    }
                    var15_15 = true;
                    break;
                }
                case 0: 
                case 8: 
                case 9: 
                case 47: {
                    var20_19 = var6_6 + (var1_1 << 1);
                    var21_23 = var7_7 + (var2_2 << 1);
                    if (this.i == 4 && (var20_19 == (var22_25 = this.g()) || var20_19 == var22_25 + 1) && var21_23 >= (var23_26 = this.h())) {
                        this.o(((var5_5 |= 8) & 7) == 2 ? 8 : 9);
                        return false;
                    }
                    var22_25 = h.a[var20_19][var21_23] & 255;
                    var23_26 = h.a[var20_19][var21_23] >> 8;
                    var24_27 = h.a[var13_13][var7_7 + 1];
                    if ((--var10_10 < 0 || var3_3) && var1_1 != 0 && h.f(var20_19, var21_23) && (var22_25 != 7 || (var23_26 & 240) != 0) && (var24_27 != 19 && var24_27 != 45 && var24_27 != 49 && var24_27 != 43 || (h.a[var13_13][var7_7 + 1] & 255) == 35)) {
                        if (!var3_3) {
                            this.a((int)var13_13, var14_14, var1_1 > 0, var19_18);
                        }
                        var15_15 = true;
                        var5_5 |= 8;
                        break;
                    }
                    if (var1_1 != 0) {
                        var5_5 |= 8;
                    }
                    var8_8 = 0;
                    h.b[var13_13][var14_14] = h.b[var13_13][var14_14] & -8 | 0;
                    break;
                }
                case 48: {
                    var20_19 = var6_6 + (var1_1 << 1);
                    var21_24 = var7_7 + (var2_2 << 1);
                    --var10_10;
                    if ((h.b[var13_13][var14_14] & 8) != 0) {
                        var25_28 = 0;
                        v7 = 1;
                    } else {
                        var25_28 = -1;
                        v7 = var26_29 = 0;
                    }
                    if ((var10_10 < 0 || var3_3) && var1_1 != 0 && h.a[var20_19][var21_24 + var25_28] < 0 && h.a[var20_19][var21_24 + var26_29] < 0 && h.a[var13_13][var14_14 + var26_29 + 1] >= 0) {
                        if (!var3_3) {
                            h.a[var20_19][var21_24 + var25_28] = var19_18;
                            h.a[var20_19][var21_24 + var26_29] = var19_18;
                            h.a[var13_13][var14_14 + var25_28] = -1;
                            h.a[var13_13][var14_14 + var26_29] = -1;
                            h.b[var20_19][var21_24 + var25_28] = h.b[var13_13][var14_14 + var25_28];
                            h.b[var20_19][var21_24 + var26_29] = h.b[var13_13][var14_14 + var26_29] & -16 | (var1_1 > 0 ? 2 : 4);
                            h.b[var20_19][var21_24 + var26_29] = 18;
                            h.c[var20_19][var21_24 + var25_28 - 1] = 48;
                            h.c[var20_19][var21_24 + var25_28 - 1] = 48;
                            h.c[var20_19][var21_24 + var25_28 - 1] = 48;
                            h.q(var20_19, var21_24 + var26_29);
                        }
                        var15_15 = true;
                        var5_5 |= 8;
                        break;
                    }
                    if (var1_1 != 0) {
                        var5_5 |= 8;
                    }
                    var8_8 = 0;
                    break;
                }
                case -1: {
                    if (var13_13 != 0 && var14_14 != 0 && var13_13 != this.av - 1 && var14_14 != this.aw - 1) ** GOTO lbl192
                    v8 = true;
                    ** GOTO lbl196
lbl192:
                    // 1 sources

                    if ((var1_1 != 0 && h.a[var13_13][var7_7 + 1] == 0 && (h.b[var13_13][var7_7 + 1] & 7) == 3 || this.aI >= 24 && (h.a[var13_13][var14_14 - 1] == 28 && (h.b[var13_13][var14_14 - 1] & 8) == 0 || h.a[var13_13][var14_14 + 1] == 28 && (h.b[var13_13][var14_14 + 1] & 8) == 0) || this.aK >= 24 && (h.a[var13_13][var14_14 - 1] == 28 || h.a[var13_13][var14_14 + 1] == 28)) && var3_3 == false) {
                        var8_8 = 0;
                    } else {
                        v8 = true;
lbl196:
                        // 2 sources

                        var15_15 = v8;
                    }
                    var5_5 &= -9;
                    break;
                }
                case 28: {
                    var8_8 = 0;
                    var5_5 &= -9;
                    break;
                }
                default: {
                    var1_1 = 0;
                    var15_15 = false;
                    if (this.k != 4 && this.k != 2) break;
                    this.o(0 + this.k - 1);
                }
            }
        }
        if (!var3_3 && var15_15 && !var16_16) {
            this.ay = -1;
        }
        if (var15_15 && var12_12 == 0) {
            var11_11 = 18;
            var6_6 += var1_1;
            var7_7 += var2_2;
            if ((var5_5 & 8) == 0 && !var3_3) {
                this.o(4 + var8_8 - 1);
            }
        } else if (var1_1 != 0 && !var3_3) {
            var5_5 |= 8;
        }
        if ((var5_5 & 8) != 0 && !var3_3) {
            this.o((var5_5 & 7) == 2 ? 8 : 9);
        }
        if (!var3_3) {
            this.aS = var5_5;
            this.aP = var6_6;
            this.aQ = var7_7;
            this.k = var8_8;
            this.v = var9_9;
            this.aX = var10_10;
            this.aR = var11_11;
            this.aW = var12_12;
        }
        return var15_15;
    }

    public static void d() {
        l = (byte)3;
    }

    private void bC() {
        l = (byte)2;
        V = true;
        this.a(1);
        this.C();
        if (a[18] == null) {
            h.a[18] = h.a("/ui.f", 3);
        }
    }

    public final void e() {
        this.p = System.currentTimeMillis() - this.a;
        this.ag = true;
        System.out.println(this.h());
        if ((l == 30 || l == 4) && this.h()) {
            this.ah = true;
        }
        this.cK();
    }

    public final void showNotify() {
        if (this.ag) {
            this.f();
        }
    }

    public final void hideNotify() {
        if (!this.ag) {
            this.e();
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void f() {
        this.ag = false;
        h.V = true;
        h.W = true;
        this.b = true;
        h.W = 0;
        this.de = -1;
        if (this.bo == 7) {
            this.bq = 0;
        }
        this.a = System.currentTimeMillis() - this.p;
        switch (h.l) {
            case 0: 
            case 6: 
            case 12: 
            case 22: {
                return;
            }
            case 4: 
            case 30: {
                if (!this.ah) break;
                this.E(19);
                return;
            }
            case 7: {
                this.bq = 1;
                return;
            }
            case 15: {
                v0 = this;
                ** GOTO lbl90
            }
            case 10: {
                h.W = false;
                return;
            }
            case 1: {
                this.C();
                if (h.D) {
                    return;
                }
                if (this.a != null) {
                    return;
                }
                if (this.an != 0) {
                    return;
                }
                if (this.v) {
                    return;
                }
                if (this.n <= 0) {
                    return;
                }
                if (h.a[0].f == 19) {
                    return;
                }
                if (this.C) {
                    return;
                }
                this.bC();
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
                this.ao = 0;
                this.bb = 0;
                this.n = false;
                this.V = 0;
                this.B = true;
                return;
            }
            case 17: {
                return;
            }
            case 18: 
            case 25: 
            case 26: {
                v0 = this;
                ** GOTO lbl90
            }
            case 19: {
                return;
            }
            case 20: {
                return;
            }
            case 21: {
                this.cu();
                return;
            }
            case 23: {
                return;
            }
            case 27: {
                this.ay = true;
                this.e = true;
                return;
            }
            case 2: {
                h.f = null;
                this.m = true;
                if (this.bo != 1) break;
                this.bq = 0;
                return;
            }
            case 33: {
                v0 = this;
lbl90:
                // 3 sources

                v0.ay = true;
            }
        }
    }

    private void bD() {
        if (!this.j) {
            return;
        }
        for (int i = 0; i < this.av; ++i) {
            for (int j = 0; j < this.aw; ++j) {
                if (a[i][j] != 38) continue;
                this.a((byte)b[i][j], (byte)i, (byte)j, (byte)0);
                ++this.dx;
            }
        }
    }

    private void n(int n, int n2) {
        this.c |= 0x400000L;
        int[] nArray = a[n];
        int n3 = n2;
        nArray[n3] = nArray[n3] & 0xFFFFFF00;
        int[] nArray2 = a[n];
        int n4 = n2;
        nArray2[n4] = nArray2[n4] | 0xE;
    }

    private boolean e() {
        return this.i == 4 || this.i == 5 || this.i == 3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void bE() {
        var1_1 = new Hashtable<Integer, Integer>();
        var2_2 = new Hashtable<Integer, Integer>();
        var3_3 = new Hashtable<Integer, Integer>();
        this.X = 0;
        this.Y = 0;
        var4_4 = 0;
        this.aY = 0;
        this.bu = 0;
        var5_5 = 0;
        var6_6 = 0;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.al = 0;
        var7_7 = 0;
        for (var8_8 = 0; var8_8 < this.av; ++var8_8) {
            block88: for (var9_9 = 0; var9_9 < this.aw; ++var9_9) {
                block123: {
                    h.b[var8_8][var9_9] = 0;
                    h.c[var8_8][var9_9] = 0;
                    var10_10 = h.a[var8_8][var9_9];
                    var11_11 = h.b[var8_8][var9_9];
                    var12_12 = h.a[var8_8][var9_9];
                    if (var10_10 == -1) break block123;
                    switch (var10_10 & 255) {
                        case 31: {
                            this.c |= 0x40000000L;
                            h.a[var8_8][var9_9] = var11_11 << 8 | 31;
                        }
                        case 19: {
                            h.a[var8_8][var9_9] = var11_11 << 8 | 19;
                            break;
                        }
                        case 17: {
                            var13_13 = h.a[var8_8][var9_9 - 1] & 255;
                            if (var13_13 == 14 || var13_13 == 33) {
                                h.a[var8_8][var9_9 - 1] = 65280 | var13_13;
                            }
                            var14_14 = h.a[var8_8][var9_9 - 1];
                            switch (var14_14) {
                                case 19: 
                                case 36: 
                                case 43: 
                                case 45: 
                                case 46: 
                                case 49: {
                                    var15_15 = new Integer(var11_11);
                                    var16_19 = (Integer)var2_2.get(var15_15);
                                    var16_19 = var16_19 == null ? new Integer(1) : new Integer(var16_19 + 1);
                                    var2_2.put(var15_15, var16_19);
                                    h.a[var8_8][var9_9] = -1;
                                    var17_22 = (Integer)var3_3.get(var15_15);
                                    if (var14_14 == 36) {
                                        if (var17_22 != null) break;
                                        var3_3.put(var15_15, new Integer(68));
                                        break;
                                    }
                                    var3_3.put(var15_15, new Integer(67));
                                    if (this.i == 4) {
                                        var3_3.put(var15_15, new Integer(103));
                                        break;
                                    }
                                    if (this.i == 5) {
                                        var3_3.put(var15_15, new Integer(104));
                                        break;
                                    }
                                    if (this.i != 3) break;
                                    var3_3.put(var15_15, new Integer(105));
                                    break;
                                }
                                default: {
                                    h.a[var8_8][var9_9] = var11_11 << 8 | 17;
                                }
                            }
                            if (var11_11 < 0) break;
                            var6_6 |= 1 << var11_11;
                            break;
                        }
                        case 14: 
                        case 33: {
                            if (!this.e()) {
                                h.a[var8_8][var9_9] = 33;
                            }
                            this.c |= 1L << ((h.a[var8_8][var9_9] & 255) == 14 ? 22 : 33);
                            if (!this.a(this.ap, this.aq, var8_8, var9_9)) break;
                            if (this.e()) {
                                h.a[var8_8][var9_9] = 41;
                                h.b[var8_8][var9_9] = 10;
                                this.aY += 10;
                                break;
                            }
                            h.a[var8_8][var9_9] = -1;
                            v0 = h.a[var8_8];
                            v1 = var9_9;
                            v0[v1] = v0[v1] | 256;
                            break;
                        }
                        case 2: {
                            this.c |= 0x100000L;
                            switch (var11_11) {
                                case 0: 
                                case 1: {
                                    this.c |= 524288L;
                                }
                            }
                            h.a[var8_8][var9_9] = var11_11 << 8 | 2;
                            break;
                        }
                        case 8: {
                            this.aj = true;
                        }
                        case 9: {
                            if ((var10_10 & 255) != 8) {
                                this.ai = true;
                            }
                            this.c |= 0x10000000L;
                            var15_15 = new Integer(var11_11);
                            var16_19 = (Integer)var1_1.get(var15_15);
                            var16_19 = var16_19 == null ? new Integer(1) : new Integer(var16_19 + 1);
                            var1_1.put(var15_15, var16_19);
                            h.a[var8_8][var9_9] = var11_11 << 8 | var10_10;
                            break;
                        }
                        case 7: {
                            if (var11_11 != -1) {
                                h.q[var11_11] = (byte)var8_8;
                                h.r[var11_11] = (byte)var9_9;
                            }
                            h.a[var8_8][var9_9] = var11_11 << 8 | var10_10;
                            break;
                        }
                        case 30: {
                            this.c |= 0x40000000L;
                            ++var7_7;
                        }
                        case 1: 
                        case 26: {
                            h.a[var8_8][var9_9] = var11_11 << 8 | var10_10 & 255;
                            break;
                        }
                        case 0: {
                            ++var7_7;
                            h.a[var8_8][var9_9] = var11_11 << 8 | var10_10 & 255;
                            break;
                        }
                        case 4: {
                            ++var5_5;
                            this.c |= 16L;
                            h.a[var8_8][var9_9] = var11_11 << 8 | var10_10 & 255;
                            break;
                        }
                        case 5: {
                            this.p = (byte)var11_11;
                            break;
                        }
                        case 28: {
                            this.q = (byte)var11_11;
                            break;
                        }
                        case 3: {
                            h.c[var8_8][var9_9] = 127;
                            if (var11_11 <= 0) break;
                            h.a[var8_8][var9_9] = var11_11 + 1 << 8 | 3;
                            break;
                        }
                        case 6: {
                            var15_15 = new Integer(var11_11);
                            var16_19 = (Integer)var1_1.get(var15_15);
                            var16_19 = var16_19 == null ? new Integer(1) : new Integer(var16_19 + 1);
                            var1_1.put(var15_15, var16_19);
                            this.c |= 0x20000000L;
                            h.a[var8_8][var9_9] = var11_11 << 8 | 6;
                            break;
                        }
                        default: {
                            if (var10_10 < 20 || var10_10 >= 26) ** GOTO lbl162
                            h.a[var8_8][var9_9] = var10_10;
                            switch (this.ap) {
                                case 0: {
                                    v2 = this;
                                    v3 = v2;
                                    v4 = v2.c;
                                    v5 = 16L;
                                    ** GOTO lbl160
                                }
                                case 1: {
                                    v6 = this;
                                    v3 = v6;
                                    v4 = v6.c;
                                    v5 = 0x200000L;
lbl160:
                                    // 2 sources

                                    v3.c = v4 | v5;
                                }
                            }
                            break;
lbl162:
                            // 1 sources

                            if (var10_10 >= 80 || var10_10 <= -1) break;
                            h.a[var8_8][var9_9] = -1;
                            break;
                        }
                        case 34: {
                            this.c |= 0x400000000L;
                        }
                    }
                }
                switch (var12_12) {
                    case 48: {
                        if ((var11_11 & 7) == 4) {
                            v7 = h.b[var8_8];
                            v8 = var9_9;
                            v9 = 16;
                        } else {
                            v7 = h.b[var8_8];
                            v8 = var9_9;
                            v9 = 0;
                        }
                        v7[v8] = v9;
                        ++this.al;
                        this.c |= 0x10000000000L;
                        this.c |= 0x100000000L;
                        var13_13 = var9_9 - 1;
                        h.a[var8_8][var13_13] = 48;
                        h.b[var8_8][var13_13] = 8;
                        h.q(var8_8, var13_13);
                        continue block88;
                    }
                    case 47: {
                        h.c[var8_8][var9_9] = 48;
                        h.b[var8_8][var9_9] = 0;
                        this.c |= 0x800000L;
                        continue block88;
                    }
                    case 46: {
                        h.b[var8_8][var9_9] = 0;
                        h.c[var8_8][var9_9] = 24;
                        h.b[var8_8][var9_9] = 0;
                        this.c |= 0x2000000000L;
                        continue block88;
                    }
                    case 45: {
                        h.b[var8_8][var9_9] = 0;
                        h.c[var8_8][var9_9] = 24;
                        this.c |= 0x800000000L;
                        continue block88;
                    }
                    case 44: {
                        h.c[var8_8][var9_9] = 24;
                        h.b[var8_8][var9_9] = 0;
                        this.c |= 0x400000000L;
                        continue block88;
                    }
                    case 42: {
                        ++var7_7;
                        ++var4_4;
                        this.c |= 0x80000000L;
                        this.c |= 0x40000000L;
                        this.n(var8_8, var9_9);
                        continue block88;
                    }
                    case 41: {
                        if (h.b[var8_8][var9_9] <= 0) {
                            h.b[var8_8][var9_9] = 1;
                        }
                        this.aY += h.b[var8_8][var9_9];
                        continue block88;
                    }
                    case 40: {
                        this.c |= 0x40000000L;
                        ++var7_7;
                        this.j = true;
                        this.c |= 0x8000000L;
                        this.n(var8_8, var9_9);
                        ++var4_4;
                        continue block88;
                    }
                    case 12: {
                        this.Q = var8_8;
                        this.R = var9_9;
                        this.P = var11_11;
                        continue block88;
                    }
                    case 36: {
                        if (h.b[var8_8][var9_9] != 1) {
                            h.b[var8_8][var9_9] = 0;
                        }
                        this.c |= 256L;
                        continue block88;
                    }
                    case 18: {
                        this.ce = 0;
                        this.cf = 0;
                        this.c |= 0x8000000000L;
                        this.c |= 128L;
                        continue block88;
                    }
                    case 34: {
                        h.a[var8_8][var9_9] = -1;
                        h.a[var8_8][var9_9] = 15;
                        this.c |= 0x1000000L;
                        continue block88;
                    }
                    case 35: {
                        h.a[var8_8][var9_9] = 35;
                        h.a[var8_8][var9_9] = -1;
                        this.c |= 0x1000000L;
                        this.ak = true;
                        continue block88;
                    }
                    case 31: 
                    case 33: {
                        continue block88;
                    }
                    case 39: {
                        this.j = true;
                        this.c |= 0x4000000L;
                        continue block88;
                    }
                    case 38: {
                        this.j = true;
                        this.c |= 0x4000000L;
                        h.a[var8_8][var9_9] = 27;
                        this.c |= 64L;
                        continue block88;
                    }
                    case 14: {
                        this.c |= 4096L;
                        h.b[var8_8][var9_9] = h.b[var8_8][var9_9] == 4 ? 8 : 0;
                        v10 = h.c[var8_8];
                        v11 = var9_9;
                        v12 = 24;
                        break;
                    }
                    case 28: {
                        this.c |= 2048L;
                        if (var11_11 > 10) {
                            v13 = h.b[var8_8];
                            v14 = var9_9;
                            v13[v14] = v13[v14] / 11;
                            v15 = h.b[var8_8];
                            v16 = var9_9;
                            v15[v16] = v15[v16] | 8;
                        }
                        v10 = h.c[var8_8];
                        v11 = var9_9;
                        v12 = 24;
                        break;
                    }
                    case 79: {
                        this.aP = 0;
                        this.aQ = var9_9;
                        this.an = var8_8;
                        h.a[var8_8][var9_9] = -1;
                        this.at = 0;
                        this.ar = 0;
                        this.as = this.au = this.aQ * 24 - 160;
                        continue block88;
                    }
                    case 11: {
                        h.b[var8_8][var9_9] = var11_11 == 1 ? 16 : 0;
                        h.c[var8_8][var9_9] = 48;
                        this.c |= 16384L;
                        continue block88;
                    }
                    case 49: {
                        this.c |= 0x20000000000L;
                        v10 = h.c[var8_8];
                        v11 = var9_9;
                        v12 = 48;
                        break;
                    }
                    case 43: {
                        this.c |= 1L << (this.ap == 1 ? 17 : 15);
                        this.bu |= 1;
                        h.b[var8_8][var9_9] = var11_11 & -98305 | 65536;
                        v10 = h.c[var8_8];
                        v11 = var9_9;
                        v12 = 48;
                        break;
                    }
                    case 19: {
                        this.c |= 1L << (this.ap == 1 ? 17 : 15);
                        this.bu |= 2;
                        v10 = h.c[var8_8];
                        v11 = var9_9;
                        v12 = 48;
                        break;
                    }
                    case 22: 
                    case 23: {
                        this.c |= 512L;
                        this.c |= 1024L;
                        v10 = h.c[var8_8];
                        v11 = var9_9;
                        v12 = 48;
                        break;
                    }
                    case 30: {
                        this.c |= 128L;
                        h.b[var8_8][var9_9] = 0;
                        continue block88;
                    }
                    case 37: {
                        this.c |= 0x2000000L;
                        h.b[var8_8][var9_9] = 0;
                        continue block88;
                    }
                    case 10: {
                        h.b[var8_8][var9_9] = 0;
                        this.d |= 2L;
                        continue block88;
                    }
                    case 16: {
                        if (h.a[var8_8][var9_9 + 1] != 16) {
                            h.a[var8_8][var9_9 - 1] = 16;
                            h.b[var8_8][var9_9 - 1] = var11_11;
                        }
                        this.c |= 8192L;
                        continue block88;
                    }
                    case 6: {
                        ++var4_4;
                        this.n(var8_8, var9_9);
                    }
                    case 7: {
                        this.c |= 16L;
                        h.b[var8_8][var9_9] = 0;
                        continue block88;
                    }
                    case 26: {
                        this.c |= 0x10000000000L;
                    }
                    case 24: 
                    case 27: {
                        ++var7_7;
                        ++var4_4;
                        this.c |= 0x40000000L;
                        this.c |= 524288L;
                        this.n(var8_8, var9_9);
                        continue block88;
                    }
                    case 8: {
                        this.c |= 32L;
                        this.c |= 8L;
                    }
                    case 4: {
                        if (var12_12 != 8) {
                            this.n(var8_8, var9_9);
                        }
                    }
                    case 5: {
                        this.c |= 4L;
                    }
                    case 2: {
                        ++var4_4;
                    }
                    case 0: {
                        h.c[var8_8][var9_9] = 48;
                        h.b[var8_8][var9_9] = 0;
                        this.d |= 1L;
                        continue block88;
                    }
                    case 1: {
                        ++this.aY;
                        h.c[var8_8][var9_9] = 48;
                        h.b[var8_8][var9_9] = 0;
                        continue block88;
                    }
                    case 53: {
                        continue block88;
                    }
                    case 51: {
                        continue block88;
                    }
                    case 52: {
                        continue block88;
                    }
                    default: {
                        if (var12_12 >= 80 || var12_12 <= -1) continue block88;
                        v10 = h.a[var8_8];
                        v11 = var9_9;
                        v12 = -1;
                    }
                }
                v10[v11] = v12;
            }
        }
        h.d = new byte[var4_4 << 1];
        for (var8_8 = 0; var8_8 < h.d.length; ++var8_8) {
            h.d[var8_8] = 0;
        }
        h.a = new c[var7_7];
        h.p = new byte[var7_7];
        var8_8 = 0;
        h.k = new byte[(var5_5 + 1) * 2];
        for (var9_9 = 31; var9_9 >= 0 && (var6_6 & 1 << var9_9) == 0; --var9_9) {
        }
        if (++var9_9 > 0) {
            h.m = new byte[var9_9];
            h.l = new byte[var9_9];
        }
        if (this.al > 0) {
            h.e = new byte[this.al * 3];
        }
        var10_10 = 0;
        for (var11_11 = 0; var11_11 < this.aw; ++var11_11) {
            block92: for (var12_12 = 0; var12_12 < this.av; ++var12_12) {
                var13_13 = h.a[var12_12][var11_11] & 255;
                var14_14 = h.a[var12_12][var11_11] >> 8;
                switch (var13_13) {
                    case 0: 
                    case 30: {
                        v17 = h.p;
                        v18 = var8_8++;
                        v19 = (byte)var14_14;
                        ** GOTO lbl463
                    }
                    case 7: {
                        var15_17 = (Integer)var1_1.get(new Integer(var14_14));
                        var14_14 <<= 8;
                        if (var15_17 != null) {
                            var14_14 = var14_14 & -16 | var15_17;
                        }
                        var16_21 = (h.a[var12_12][var11_11 - 1] & 255) == 17 ? 1 : 0;
                        v20 = var17_23 = (h.a[var12_12][var11_11 + 1] & 255) == 17 && (h.a[var12_12 + 1][var11_11] & 255) != 26 && (h.a[var12_12 - 1][var11_11] & 255) != 26;
                        if (var16_21 != 0 || var17_23) {
                            var14_14 = var14_14 & -241 | 48;
                            h.c[var12_12][var11_11] = 24;
                            if (var16_21 != 0) {
                                h.a[var12_12][var11_11 - 1] = -1;
                            }
                        }
                        h.a[var12_12][var11_11] = var14_14 << 8 | var13_13;
                        break;
                    }
                    case 4: {
                        var18_24 = var14_14;
                        h.k[var18_24 * 2] = (byte)var12_12;
                        v17 = h.k;
                        v18 = var18_24 * 2 + 1;
                        v19 = (byte)var11_11;
                        ** GOTO lbl463
                    }
                    case 5: {
                        h.k[var5_5 * 2] = (byte)var12_12;
                        v17 = h.k;
                        v18 = var5_5 * 2 + 1;
                        v19 = (byte)var11_11;
                        ** GOTO lbl463
                    }
                    case 17: {
                        if (var14_14 == -1) break;
                        var19_25 = new Integer(var14_14);
                        var20_26 = (Integer)var2_2.get(var19_25);
                        if (var20_26 == null) {
                            var20_26 = new Integer(0);
                        }
                        h.m[var14_14] = var20_26.byteValue();
                        var21_27 = (Integer)var3_3.get(var19_25);
                        if (var21_27 == null) {
                            var21_27 = new Integer(69);
                        }
                        v17 = h.l;
                        v18 = var14_14;
                        v19 = var21_27.byteValue();
lbl463:
                        // 4 sources

                        v17[v18] = v19;
                    }
                }
                switch (h.a[var12_12][var11_11]) {
                    case 48: {
                        if ((h.b[var12_12][var11_11] & 8) == 0) continue block92;
                        var15_18 = var12_12 + ((h.b[var12_12][var11_11 + 1] & 16) == 0 ? 1 : -1);
                        var16_21 = var10_10 * 3;
                        if (h.d(var15_18, var11_11) >= 0) {
                            h.e[var16_21 + 0] = (byte)var15_18;
                            h.e[var16_21 + 1] = (byte)var15_18;
                            v21 = h.e;
                            v22 = var16_21 + 2;
                            v23 = (byte)var11_11;
                        } else {
                            v21 = h.e;
                            v22 = var16_21 + 2;
                            v23 = -1;
                        }
                        v21[v22] = v23;
                        h.b[var12_12][var11_11] = h.b[var12_12][var11_11] & 0xFFFFFF | var10_10 << 24;
                        ++var10_10;
                        continue block92;
                    }
                    case 26: {
                        v24 = h.p;
                        v25 = var8_8++;
                        v26 = 25;
                        ** GOTO lbl507
                    }
                    case 42: {
                        v24 = h.p;
                        v25 = var8_8++;
                        v26 = 11;
                        ** GOTO lbl507
                    }
                    case 24: {
                        v24 = h.p;
                        v25 = var8_8++;
                        v26 = 22;
                        ** GOTO lbl507
                    }
                    case 27: {
                        v24 = h.p;
                        v25 = var8_8++;
                        v26 = 23;
                        ** GOTO lbl507
                    }
                    case 40: {
                        v24 = h.p;
                        v25 = var8_8++;
                        v26 = 24;
lbl507:
                        // 5 sources

                        v24[v25] = v26;
                    }
                }
            }
        }
        h.a[this.an - 2][this.aQ] = -193 << 8 | 7;
        if ((this.c & 0x100000000L) != 0L || h.i[9] >= 8) {
            this.c |= 0x10000000000L;
            this.c |= 2L;
            this.c |= 1L;
            if ((this.c & 131072L) != 0L) {
                this.c |= 262144L;
            }
            if ((this.c & 32768L) != 0L) {
                this.c |= 65536L;
            }
            if ((this.c & 0x800000000L) != 0L) {
                this.c |= 0x1000000000L;
            }
            if ((this.c & 0x2000000000L) != 0L) {
                this.c |= 0x4000000000L;
            }
            if ((this.c & 0x20000000000L) != 0L) {
                this.c |= 0x40000000000L;
            }
        }
    }

    private void a(int n, int n2, int n3, int n4, int n5) {
        if (n + n3 <= 0 || n + n3 >= this.av || n2 + n4 <= 0 || n2 + n4 >= this.aw) {
            return;
        }
        int n6 = n3;
        int n7 = n4;
        int n8 = a[n + n3][n2 + n4] & 0xFF;
        switch (n8) {
            case 8: 
            case 9: {
                int n9 = a[n + n3][n2 + n4] >> 8;
                n9 = n5 == 1 ? n9 | 0x200 : n9 & 0xFFFFFDFF;
                h.a[n + n3][n2 + n4] = n9 << 8 | n8;
                this.a(n + n3, n2 + n4, n6, n7, n5);
                this.a(n + n3, n2 + n4, 0, 1, n5);
            }
        }
    }

    private boolean d(int n, int n2) {
        return n == this.aP && n2 == this.aQ;
    }

    private void v(int n) {
        this.k = 0;
        this.j = 0;
        for (int i = 0; i < p.length; ++i) {
            if (p[i] != n) continue;
            this.a = a[i];
        }
        this.a.a();
    }

    private boolean f() {
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
                                                                if (this.ar >= this.ci) break block13;
                                                                this.ar += this.ck;
                                                                if (this.ar <= this.ci) break block14;
                                                                break block15;
                                                            }
                                                            if (this.ar <= this.ci) break block14;
                                                            this.ar -= this.ck;
                                                            if (this.ar >= this.ci) break block14;
                                                        }
                                                        this.ar = this.ci;
                                                    }
                                                    if (this.as >= this.cj) break block16;
                                                    this.as += this.ck;
                                                    if (this.as <= this.cj) break block17;
                                                    break block18;
                                                }
                                                if (this.as <= this.cj) break block17;
                                                this.as -= this.ck;
                                                if (this.as >= this.cj) break block17;
                                            }
                                            this.as = this.cj;
                                        }
                                        bl2 = false;
                                        bl = false;
                                        if (this.ar >= 0) break block19;
                                        this.ar = 0;
                                        break block20;
                                    }
                                    if (this.ar <= this.av * 24 - 240) break block21;
                                    this.ar = this.av * 24 - 240;
                                    break block20;
                                }
                                if (this.ar != this.ci) break block22;
                            }
                            bl2 = true;
                        }
                        if (this.as >= 0) break block23;
                        this.as = 0;
                        break block24;
                    }
                    if (this.as <= this.aw * 24 - 320 + 80) break block25;
                    this.as = this.aw * 24 - 320 + 80;
                    break block24;
                }
                if (this.as != this.cj) break block26;
            }
            bl = true;
        }
        if (bl2 && bl) {
            this.at = this.ar;
            this.au = this.as;
            this.am = 70;
            return true;
        }
        return false;
    }

    private void bF() {
        switch (this.cl) {
            case 1: {
                this.ck = 8;
                if (!this.f()) break;
                this.cl = 2;
                this.do = 40;
                return;
            }
            case 2: {
                --this.do;
                if (this.do == 30) {
                    int n = a[this.dm][this.dn] >> 8;
                    if ((n & 0xF0) == 0) break;
                    this.j(this.dm, this.dn);
                    return;
                }
                if (this.do != 0) break;
                this.cl = 3;
                this.ci = this.aP * 24 - 108;
                this.cj = this.aQ * 24 - 108;
                this.ck = 5;
                this.e = a[l[cm]];
                a[41].a(this.e);
                this.dl = 80;
                return;
            }
            case 3: {
                if (!this.f()) break;
                this.do = 20;
                this.cl = 4;
                this.am = 0;
                return;
            }
            case 4: {
                --this.do;
                if (this.do != 0) break;
                this.am = 0;
                this.cl = 0;
                am = true;
            }
        }
    }

    private void w(int n) {
        this.E(1);
        int n2 = this.av - 1;
        int n3 = this.aw - 1;
        for (int i = 1; i < n3; ++i) {
            for (int j = 1; j < n2; ++j) {
                int n4;
                if ((a[j][i] & 0xFF) != 17 || a[j][i] >> 8 != n) continue;
                int n5 = -1;
                int n6 = -1;
                if (a[j][i] == 18) {
                    n5 = j;
                    n4 = i;
                } else {
                    int n7 = a[j][i - 1] & 0xFF;
                    switch (n7) {
                        case 7: {
                            int n8 = a[j][i - 1] >> 8;
                            if ((n8 & 0xF0) == 0) break;
                        }
                        case 14: 
                        case 33: {
                            n5 = j;
                            n4 = n6 = i - 1;
                        }
                    }
                }
                if (n5 == -1) continue;
                this.dm = n5;
                this.dn = n6;
                this.ci = 24 * n5 - 108;
                this.cj = 24 * n6 - 108;
            }
        }
    }

    private void x(int n) {
        this.E(8);
        int n2 = this.av - 1;
        int n3 = this.aw - 1;
        for (int i = 1; i < n3; ++i) {
            block5: for (int j = 1; j < n2; ++j) {
                if ((a[j][i] & 0xFF) != 17 || a[j][i] >> 8 != n) continue;
                int n4 = a[j][i - 1] & 0xFF;
                switch (n4) {
                    case 7: {
                        h.i(j, i - 1);
                        continue block5;
                    }
                    case 14: 
                    case 33: {
                        h.a[j][i - 1] = 0 | n4;
                    }
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void bG() {
        var2_1 = this.aP - 8;
        var3_2 = this.aP + 8;
        var4_3 = this.aQ + 8;
        var5_4 = this.aQ - 8;
        var6_5 = 0;
        if (h.a[4] != null) {
            var7_6 = h.a[4].g;
            v0 = var7_6 == 0 ? 0 : (var7_6 <= 10 ? 1 : (var6_5 = var7_6 <= 20 ? 2 : 3));
        }
        if (var2_1 < 1) {
            var2_1 = 1;
        }
        if (var3_2 > this.av - 2) {
            var3_2 = this.av - 2;
        }
        if (var5_4 < 1) {
            var5_4 = 1;
        }
        if (var4_3 > this.aw - 2) {
            var4_3 = this.aw - 2;
        }
        v1 = this;
        v2 = v1.bF = var4_3;
        while (this.bF >= var5_4) {
            v3 = this;
            v4 = v3.bE = var2_1;
            while (this.bE <= var3_2) {
                block76: {
                    v5 = var7_6 = this.bi != 0 && this.bE == this.bg && this.bF == this.bh ? 1 : 0;
                    if (h.c[this.bE][this.bF] <= 0 || var7_6 != 0) break block76;
                    v6 = h.c[this.bE];
                    v7 = this.bF;
                    v6[v7] = (byte)(v6[v7] - 6);
                    var1_7 = (byte)(h.a[this.bE][this.bF] & 255);
                    switch (var1_7) {
                        case 36: {
                            this.be();
                            break;
                        }
                        case 35: 
                        case 37: {
                            if (this.bE == this.bg && this.bF == this.bh && this.bi != 0) break;
                            this.bI();
                            break;
                        }
                        case 32: {
                            this.bM();
                            break;
                        }
                        case 26: {
                            this.bQ();
                            break;
                        }
                        case 6: {
                            this.bN();
                            break;
                        }
                        case 33: {
                            this.A(33);
                            break;
                        }
                        case 14: {
                            this.A(14);
                            break;
                        }
                        case 2: {
                            switch (h.a[this.bE][this.bF] >> 8) {
                                case 0: {
                                    if (h.a[this.bE - 1][this.bF] == 30 || h.a[this.bE + 1][this.bF] == 30 || h.a[this.bE][this.bF - 1] == 30 || h.a[this.bE][this.bF + 1] == 30) break;
                                    this.ay = -1;
                                    this.b(this.bE, this.bF, (byte)2);
                                }
                            }
                            break;
                        }
                        case 3: {
                            this.cf();
                            break;
                        }
                        case 30: {
                            if (this.a != null || this.bm != -1 || !this.d(this.bE, this.bF) || this.aR > 0) break;
                            this.bm = h.a[this.bE][this.bF] >> 8;
                            h.a[this.bE][this.bF] = -1;
                            break;
                        }
                        case 0: {
                            if (this.a != null || this.bm != -1 || !this.d(this.bE, this.bF) || this.aR > 6) break;
                            this.bm = h.a[this.bE][this.bF] >> 8;
                            h.a[this.bE][this.bF] = -1;
                            break;
                        }
                        case 7: {
                            this.ce();
                            break;
                        }
                        case 8: {
                            v8 = this;
                            ** GOTO lbl80
                        }
                        case 9: {
                            v8 = this;
lbl80:
                            // 2 sources

                            v8.cd();
                        }
                    }
                    var8_8 = (h.a[this.bE][this.bF] & -268435456) >> 28;
                    if (var8_8 > 0) {
                        this.bS();
                    }
                    var1_7 = h.a[this.bE][this.bF];
                    switch (var1_7) {
                        case 54: {
                            this.bO();
                            break;
                        }
                        case 50: {
                            if (this.aR >= 12 || !this.d(this.bE, this.bF) || this.h) break;
                            this.a(1, 48, (int)h.h[this.aS & 7]);
                            break;
                        }
                        case 49: {
                            this.e((byte)49);
                            break;
                        }
                        case 48: {
                            if ((h.b[this.bE][this.bF] & 8) == 0) {
                                this.d((byte)48);
                                break;
                            }
                            this.bH();
                            break;
                        }
                        case 46: {
                            this.bK();
                            break;
                        }
                        case 45: {
                            this.aM();
                            break;
                        }
                        case 44: {
                            this.bL();
                            break;
                        }
                        case 40: {
                            this.y(40);
                            break;
                        }
                        case 36: {
                            this.bP();
                            break;
                        }
                        case 28: {
                            this.cc();
                            break;
                        }
                        case 16: {
                            this.cb();
                            break;
                        }
                        case 14: {
                            this.ca();
                            break;
                        }
                        case 10: {
                            this.bX();
                            break;
                        }
                        case 21: {
                            this.bZ();
                            break;
                        }
                        case 32: {
                            this.bY();
                            break;
                        }
                        case 11: {
                            this.bW();
                            break;
                        }
                        case 37: {
                            this.bV();
                            break;
                        }
                        case 30: {
                            this.bU();
                            break;
                        }
                        case 24: {
                            this.z(24);
                            break;
                        }
                        case 27: {
                            this.z(27);
                            break;
                        }
                        case 26: {
                            this.z(26);
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
                            this.y(42);
                            break;
                        }
                        case 2: {
                            this.y(2);
                            break;
                        }
                        case 53: {
                            this.y(53);
                            break;
                        }
                        case 51: {
                            this.y(51);
                            break;
                        }
                        case 52: {
                            this.y(52);
                            break;
                        }
                        case 5: {
                            this.y(5);
                            break;
                        }
                        case 4: {
                            this.y(4);
                            break;
                        }
                        case 6: {
                            this.y(6);
                            break;
                        }
                        case 7: {
                            this.y(7);
                            break;
                        }
                        case 41: {
                            this.y(41);
                            break;
                        }
                        case 47: {
                            this.ci();
                            this.bJ();
                            break;
                        }
                        case 1: {
                            this.ci();
                            break;
                        }
                        case 0: {
                            this.ci();
                            break;
                        }
                        case 9: {
                            if ((h.b[this.bE][this.bF] & 0xFC00000) != 0x8400000) ** GOTO lbl221
                            h.c[this.bE][this.bF] = 24;
                            if (this.aj > 0) {
                                v9 = this;
                                v10 = v9;
                                v11 = v9.aj - 1;
                            } else if (this.aj < 0) {
                                v12 = this;
                                v10 = v12;
                                v11 = v10.aj = v12.aj + 1;
                            }
                            if (this.ak <= 0) ** GOTO lbl216
                            v13 = this;
                            v14 = v13;
                            v15 = v13.ak - 1;
                            ** GOTO lbl220
lbl216:
                            // 1 sources

                            if (this.ak >= 0) ** GOTO lbl221
                            v16 = this;
                            v14 = v16;
                            v15 = v16.ak + 1;
lbl220:
                            // 2 sources

                            v14.ak = v15;
lbl221:
                            // 3 sources

                            this.ci();
                            break;
                        }
                        case 8: {
                            this.ci();
                            break;
                        }
                        case 23: {
                            v17 = this;
                            v18 = 23;
                            ** GOTO lbl233
                        }
                        case 22: {
                            v17 = this;
                            v18 = 22;
lbl233:
                            // 2 sources

                            v17.o(v18, var6_5);
                        }
                    }
                }
                v19 = this;
                v3 = v19;
                v4 = v19.bE + 1;
            }
            v20 = this;
            v1 = v20;
            v2 = v20.bF - 1;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void bH() {
        block6: {
            var1_1 = this.bE;
            var2_2 = this.bF;
            var3_3 = var2_2 + 1;
            var4_4 = h.b[var1_1][var3_3];
            switch (var4_4 & 7) {
                case 4: {
                    v0 = var1_1 + 1;
                    break block6;
                }
                case 2: {
                    v1 = var1_1;
                    break;
                }
                default: {
                    if ((var4_4 & 16) != 0) ** GOTO lbl16
                    v0 = var1_1 + 1;
                    break block6;
lbl16:
                    // 1 sources

                    v1 = var1_1;
                }
            }
            v0 = v1 - 1;
        }
        var5_5 = v0;
        var6_6 = (h.b[var1_1][var2_2] >> 24) * 3;
        if (h.a[var5_5][var2_2] < 0) {
            h.e[var6_6 + 2] = (byte)var2_2;
            h.e[var6_6 + 1] = (byte)var5_5;
            v2 = h.e;
            v3 = var6_6 + 0;
            v4 = (byte)var5_5;
        } else {
            v2 = h.e;
            v3 = var6_6 + 2;
            v4 = -1;
        }
        v2[v3] = v4;
    }

    private void d(byte by) {
        int n = this.bE;
        int n2 = this.bF;
        if (b[n][n2] == 6 && (a[n][n2] & 0xFF) == 6) {
            this.s(a[n][n2] >> 8);
        }
        if (b[n][n2] <= 0) {
            int n3;
            int n4;
            int n5 = b[n][n2];
            int n6 = n5 & 7;
            if (n6 == 2) {
                n4 = n5 | 0x10;
            } else if (n6 == 4) {
                n4 = n5 = n5 & 0xFFFFFFEF;
            }
            if (!(a[n][n3 = n2 + 1] >= 0 || this.d(n, n3) && this.aW == 0)) {
                h.a[n][n2 - 1] = -1;
                h.a[n][n3] = by;
                h.b[n][n3] = n5 & 0xFFFFFFF8 | 3;
                h.b[n][n2] = b[n][n2 - 1] | 8;
                h.b[n][n3] = 18;
                int n7 = n2 - 2;
                h.c[n - 1][n7] = 48;
                h.c[n][n7] = 48;
                h.c[n + 1][n7] = 48;
                h.q(n, n2);
                if (by == 48) {
                    this.bH();
                }
            } else {
                if ((n5 & 7) == 3 && this.d(n, n2 + 1)) {
                    this.a(2, 48, 0);
                }
                h.b[n][n2] = n5 & 0xFFFFFFF8 | 0;
            }
        } else {
            byte[] byArray = b[n];
            int n8 = n2;
            byArray[n8] = (byte)(byArray[n8] - 6);
        }
        h.c[n][n2] = 24;
        h.c[n][n2 - 1] = 24;
    }

    private void bI() {
        block12: {
            byte by;
            block13: {
                int n;
                byte[] byArray;
                int n2;
                int n3;
                block8: {
                    byte by2;
                    int n4;
                    int n5;
                    block11: {
                        int n6;
                        block10: {
                            int n7;
                            int[] nArray;
                            block9: {
                                n3 = this.bE;
                                n2 = this.bF;
                                h.c[n3][n2] = 24;
                                if (b[n3][n2] > 0) break block8;
                                n5 = n2 - 1;
                                n4 = n2 + 1;
                                by2 = (byte)(a[n3][n5] & 0xFF);
                                if (by2 != 34 && by2 != 37) break block9;
                                nArray = a[n3];
                                n7 = n5;
                                n6 = 37;
                                break block10;
                            }
                            if (by2 == 35 || !h.e(n3, n5)) break block11;
                            h.b[n3][n5] = 18;
                            nArray = a[n3];
                            n7 = n5;
                            n6 = 35;
                        }
                        nArray[n7] = n6;
                    }
                    byte by3 = a[n3][n2];
                    if (a[n3][n5] < 0 && !this.d(n3, n5) && by2 == 35 && by3 != 32 && by3 != 21 && a[n3][n2] != -1) {
                        h.b[n3][n5] = 18;
                        h.a[n3][n5] = a[n3][n2];
                        h.b[n3][n5] = b[n3][n2] & 0xFFFFFFF8 | 1;
                        h.a[n3][n2] = -1;
                        this.b(n3, n2);
                    } else {
                        this.c(n3, n2);
                    }
                    if ((a[n3][n4] & 0xFF) != 35 && a[n3][n4] != 47) {
                        int n8;
                        int n9;
                        int[] nArray;
                        if (a[n3][n2] == 37) {
                            nArray = a[n3];
                            n9 = n2;
                            n8 = 34;
                        } else {
                            nArray = a[n3];
                            n9 = n2;
                            n8 = -1;
                        }
                        nArray[n9] = n8;
                    }
                    h.c[n3][n5] = 24;
                    if (a[n3][n2] >= 0) break block12;
                    byArray = b[n3];
                    n = n2;
                    by = (byte)18;
                    break block13;
                }
                byte[] byArray2 = b[n3];
                int n10 = n2;
                n = n10;
                byArray = byArray2;
                by = (byte)(byArray2[n10] - 6);
            }
            byArray[n] = by;
        }
    }

    private static boolean e(int n, int n2) {
        byte by = a[n][n2];
        int n3 = a[n][n2] & 0xFF;
        return by < 80 && by != 30 && by != 10 && by != 37 && by != 34 && by != 35 && n3 != 14 && n3 != 33 && n3 != 15 && n3 != 4 && n3 != 16;
    }

    private static boolean f(int n, int n2) {
        byte by = a[n][n2];
        int n3 = a[n][n2] & 0xFF;
        return by == -1 && n3 != 14 && n3 != 33 && n3 != 5 && n3 != 28;
    }

    private static boolean g(int n, int n2) {
        byte by = a[n][n2];
        int n3 = a[n][n2] & 0xFF;
        return by == -1 && n3 != 14 && n3 != 33 && n3 != 4 && n3 != 32 && (n3 != 7 || (a[n][n2] >> 8 & 0xF0) != 0);
    }

    private void bJ() {
        boolean bl;
        int n = this.bF - 1;
        boolean bl2 = bl = e != null && e[this.bE][this.bF] != 0 && e[this.bE][this.bF - 1] == 0;
        if ((b[this.bE][this.bF] & 7) == 0 && (a[this.bE][n] & 0xFF) != 35 && h.e(this.bE, n) && (!this.d(this.bE - 1, this.bF) && !this.d(this.bE + 1, this.bF) || (this.aS & 8) == 0) && (a[this.bE][this.bF + 1] >= 0 || bl)) {
            h.a[this.bE][n] = 35;
            h.b[this.bE][n] = 18;
            h.c[this.bE][n] = 24;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void bK() {
        block33: {
            block31: {
                block40: {
                    block39: {
                        block34: {
                            block38: {
                                block36: {
                                    block37: {
                                        block35: {
                                            block32: {
                                                var1_1 = this.bE;
                                                var2_2 = this.bF;
                                                var3_3 = h.b[var1_1][var2_2] & 31;
                                                var4_4 = (h.b[var1_1][var2_2] & 8160) >> 5;
                                                var5_5 = h.a(h.a[29], var3_3);
                                                var6_6 = (h.a[var1_1][var2_2] & 255) == 35;
                                                if (var6_6) {
                                                    if (++var4_4 > var5_5) {
                                                        var4_4 = 0;
                                                    }
                                                    h.b[var1_1][var2_2] = 0 | var4_4 << 5;
                                                    return;
                                                }
                                                if (h.a[var1_1][var2_2 + 1] < 0 && var3_3 != 8 && var3_3 != 9) {
                                                    switch (var3_3) {
                                                        case 0: 
                                                        case 2: 
                                                        case 4: 
                                                        case 6: {
                                                            v0 = 8;
                                                            break;
                                                        }
                                                        default: {
                                                            v0 = 9;
                                                        }
                                                    }
                                                    var3_3 = v0;
                                                    h.b[var1_1][var2_2 + 1] = 18;
                                                    h.a[var1_1][var2_2 + 1] = 46;
                                                    h.a[var1_1][var2_2] = -1;
                                                    h.b[var1_1][var2_2 + 1] = var3_3;
                                                    h.q(var1_1, var2_2);
                                                    return;
                                                }
                                                if (var3_3 != 8 && var3_3 != 9) break block32;
                                                v1 = h.b[var1_1];
                                                v2 = var2_2;
                                                v1[v2] = (byte)(v1[v2] - 6);
                                                if (h.b[var1_1][var2_2] < 0) {
                                                    if (h.a[var1_1][var2_2 + 1] < 0) {
                                                        h.b[var1_1][var2_2 + 1] = 18;
                                                        h.a[var1_1][var2_2 + 1] = 46;
                                                        h.a[var1_1][var2_2] = -1;
                                                        h.b[var1_1][var2_2 + 1] = var3_3;
                                                        h.q(var1_1, var2_2);
                                                        return;
                                                    }
                                                    h.b[var1_1][var2_2] = var3_3 = var3_3 == 8 ? 10 : 11;
                                                    h.b[var1_1][var2_2] = 0;
                                                    return;
                                                }
                                                if (h.a(var1_1, var2_2, 3, (int)h.b[var1_1][var2_2], this.aP, this.aQ, this.aS & 7, this.aR)) {
                                                    this.a(1, 48, h.b[var1_1][var2_2] & 7);
                                                    return;
                                                }
                                                break block33;
                                            }
                                            if (this.i(var1_1, var2_2)) {
                                                h.a[var1_1][var2_2] = -1;
                                                this.p(var1_1, var2_2);
                                                h.q(var1_1, var2_2);
                                                return;
                                            }
                                            if (!this.d(var1_1 - 1, var2_2) && !this.d(var1_1 + 1, var2_2) && !this.d(var1_1, var2_2 - 1)) break block34;
                                            if (this.aQ != var2_2 - 1) break block35;
                                            v3 = 17;
                                            break block36;
                                        }
                                        if (this.aP != var1_1 - 1) break block37;
                                        v3 = 16;
                                        break block36;
                                    }
                                    if (this.aP != var1_1 + 1) break block38;
                                    v3 = 15;
                                }
                                var3_3 = v3;
                            }
                            var4_4 = 0;
                            break block31;
                        }
                        var7_7 = this.aS & 7;
                        if (this.aP != var1_1 || this.aR != 6 || var7_7 != 4 && var7_7 != 2 || this.aQ >= var2_2 || h.a[var1_1][var2_2 - 1] >= 0 || var2_2 * 24 > this.as + 320 - 80) break block39;
                        switch (var3_3) {
                            case 0: 
                            case 2: {
                                v4 = 6;
                                ** GOTO lbl76
                            }
                            case 1: 
                            case 3: {
                                v4 = 7;
lbl76:
                                // 2 sources

                                var3_3 = v4;
                                var4_4 = 0;
                            }
                        }
                        break block31;
                    }
                    if (this.aQ != var2_2 || this.aR != 6 || var7_7 != 1 && var7_7 != 3 || var3_3 < 0 || var3_3 > 3 || (this.aP >= var1_1 || h.a[var1_1 - 1][var2_2] >= 0 || var1_1 * 24 >= this.ar + 240) && (this.aP <= var1_1 || h.a[var1_1 + 1][var2_2] >= 0 || (var1_1 + 1) * 24 <= this.ar)) break block40;
                    var3_3 = this.aP < var1_1 ? 4 : 5;
                    var4_4 = 0;
                    break block31;
                }
                ++var4_4;
                switch (var3_3) {
                    case 4: {
                        var8_8 = var1_1 - 1;
                        if (h.a[var8_8][var2_2] >= 0 || var4_4 != h.b(h.a[29], 4, 1)) break;
                        h.a[var8_8][var2_2] = 21;
                        h.b[var8_8][var2_2] = 4;
                        h.b[var8_8][var2_2] = 18;
                        v5 = h.c[var8_8];
                        v6 = var2_2;
                        ** GOTO lbl113
                    }
                    case 5: {
                        var9_9 = var1_1 + 1;
                        if (h.a[var9_9][var2_2] >= 0 || var4_4 != h.b(h.a[29], 5, 1)) break;
                        h.a[var9_9][var2_2] = 21;
                        h.b[var9_9][var2_2] = 2;
                        h.b[var9_9][var2_2] = 18;
                        v5 = h.c[var9_9];
                        v6 = var2_2;
                        ** GOTO lbl113
                    }
                    case 6: 
                    case 7: {
                        var10_10 = var2_2 - 1;
                        if (h.a[var1_1][var10_10] >= 0 || var4_4 != h.b(h.a[29], var3_3, 1)) break;
                        h.a[var1_1][var10_10] = 21;
                        h.b[var1_1][var10_10] = 1;
                        h.b[var1_1][var10_10] = 18;
                        v5 = h.c[var1_1];
                        v6 = var10_10;
lbl113:
                        // 3 sources

                        v5[v6] = 24;
                    }
                }
                if (var4_4 > var5_5) {
                    var4_4 = 0;
                    var8_8 = this.a(var1_1, var2_2, this.aP, this.aQ, false);
                    switch (var8_8) {
                        case 4: {
                            if (this.aQ == var2_2 && var3_3 != 4 && var1_1 * 24 < this.ar + 240) {
                                v7 = 4;
                                break;
                            }
                            v7 = 0;
                            break;
                        }
                        case 2: {
                            if (this.aQ == var2_2 && var3_3 != 5 && (var1_1 + 1) * 24 > this.ar) {
                                v7 = 5;
                                break;
                            }
                            v7 = 1;
                            break;
                        }
                        case 1: {
                            var3_3 = this.aP == var1_1 && var3_3 != 6 && var3_3 != 7 && var2_2 * 24 <= this.as + 320 - 80 ? (var3_3 == 2 ? 6 : 7) : (this.aP < var1_1 ? 2 : 3);
                            break block31;
                        }
                        default: {
                            v7 = this.aP < var1_1 ? 0 : 1;
                        }
                    }
                    var3_3 = v7;
                }
            }
            h.c[var1_1][var2_2] = 24;
            h.b[var1_1][var2_2] = var3_3 & 31 | var4_4 << 5;
        }
    }

    private static int a(a a2, int n) {
        int n2 = 0;
        int n3 = a2.e[n] & 0xFF;
        for (int i = 0; i < n3; ++i) {
            n2 += a2.f[(a2.b[n] + i) * 5 + 1] & 0xFF;
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     */
    private void bL() {
        var1_1 = this.bE;
        var2_2 = this.bF;
        h.c[var1_1][var2_2] = 24;
        var3_3 = (h.b[var1_1][var2_2] & 56) >> 3;
        switch (var3_3) {
            case 0: {
                if ((this.aP != var1_1 || (var2_2 + 1) * 24 <= this.as || this.i == 3) && (this.i != 3 || this.o == 0L || (long)h.aN < this.o + (long)(21 - var1_1))) break;
                var4_4 = var2_2 + 1;
                while (true) {
                    var5_6 = h.a[var1_1][var4_4];
                    if (this.aQ == var4_4 || var5_6 >= 80 || var5_6 == 30 || var5_6 == 34 || var5_6 == 35 || var5_6 == 0) break;
                    ++var4_4;
                }
                if (this.aQ != var4_4 && this.i != 3) break;
                h.b[var1_1][var2_2] = h.b[var1_1][var2_2] & -57 | 8;
                h.b[var1_1][var2_2] = 10;
                return;
            }
            case 1: {
                v0 = h.b[var1_1];
                v1 = var2_2;
                v0[v1] = (byte)(v0[v1] - 1);
                if (h.b[var1_1][var2_2] > 0) break;
                h.a[var1_1][var2_2] = 34;
                h.b[var1_1][var2_2] = h.b[var1_1][var2_2] & -64 | 24 | 3;
                h.b[var1_1][var2_2] = 0;
                return;
            }
            case 3: {
                if (h.b[var1_1][var2_2] > 0) ** GOTO lbl71
                var4_5 = this.d(var1_1, var2_2 + 1);
                var5_7 = false;
                if (var4_5 || h.a[var1_1][var2_2 + 1] >= 0 || this.j && h.e[var1_1][var2_2 + 1] != 0) {
                    if (var4_5) {
                        this.a(1, 48, 0);
                        var5_7 = true;
                    } else {
                        var5_7 = true;
                        switch (h.a[var1_1][var2_2 + 1]) {
                            case 10: {
                                h.a[var1_1][var2_2 + 1] = 32;
                                this.b(var1_1, var2_2 + 1);
                                var5_7 = false;
                                break;
                            }
                            case 19: 
                            case 43: 
                            case 45: 
                            case 46: 
                            case 49: {
                                this.p(var1_1, var2_2 + 1);
                                h.a[var1_1][var2_2 + 1] = -1;
                                break;
                            }
                            case 30: {
                                this.E(11);
                                h.b[var1_1][var2_2 + 1] = 1;
                                break;
                            }
                            case 18: {
                                this.c();
                                break;
                            }
                            case 21: {
                                var5_7 = false;
                                break;
                            }
                            default: {
                                this.E(14);
                            }
                        }
                    }
                }
                if (var5_7) {
                    h.b[var1_1][var2_2] = h.b[var1_1][var2_2] & -64 | 32;
                    h.b[var1_1][var2_2] = 0;
                    return;
                }
                h.a[var1_1][var2_2] = -1;
                h.a[var1_1][var2_2 + 1] = 44;
                h.b[var1_1][var2_2 + 1] = h.b[var1_1][var2_2];
                v2 = h.b[var1_1];
                v3 = var2_2 + 1;
                v4 = 19;
                ** GOTO lbl84
lbl71:
                // 1 sources

                v5 = h.b[var1_1];
                v6 = var2_2;
                v5[v6] = (byte)(v5[v6] - 5);
                return;
            }
            case 4: {
                if ((h.aN & 1) != 0) break;
                v7 = h.b[var1_1];
                v8 = var2_2;
                v7[v8] = (byte)(v7[v8] + 1);
                if (h.b[var1_1][var2_2] != h.a[27].a(4)) break;
                v2 = h.a[var1_1];
                v3 = var2_2;
                v4 = -1;
lbl84:
                // 2 sources

                v2[v3] = v4;
                h.q(var1_1, var2_2);
            }
        }
    }

    private void bM() {
        int n;
        int n2;
        int[] nArray;
        int n3 = a[this.bE][this.bF] >> 8 & 0xFF;
        if ((aN & 1) == 0) {
            ++n3;
        } else if (n3 == 1) {
            this.b(this.bE, this.bF);
        }
        if (n3 == a[16].a(0)) {
            nArray = a[this.bE];
            n2 = this.bF;
            n = -1;
        } else {
            nArray = a[this.bE];
            n2 = this.bF;
            n = n3 << 8 | 0x20;
        }
        nArray[n2] = n;
        h.c[this.bE][this.bF] = 24;
    }

    private void bN() {
        int n = this.bE;
        int n2 = this.bF;
        int n3 = a[n][n2] >> 8;
        boolean bl = h.j(n, n2) || a[n][n2] == 47 || a[n][n2] == 48;
        int n4 = b[n][n2];
        if (!bl && this.d(n, n2)) {
            bl = true;
            int n5 = n4 = (this.aS & 0x1000) != 0 ? 0 : this.aR;
        }
        if (bl && n4 < 12) {
            this.s(n3);
            return;
        }
        this.t(n3);
    }

    /*
     * Unable to fully structure code
     */
    private void bO() {
        block10: {
            block9: {
                var1_1 = this.bE;
                var2_2 = this.bF;
                var3_3 = h.b[var1_1][var2_2];
                var4_4 = h.a[7];
                var5_5 = h.a(var4_4, 0);
                if (++var3_3 >= var5_5) {
                    h.a[var1_1][var2_2] = -1;
                    h.q(var1_1, var2_2);
                    return;
                }
                if (var3_3 != 1) break block9;
                this.E(7);
                h.q(var1_1, var2_2);
                break block10;
            }
            if (var3_3 != var5_5 >> 1) break block10;
            for (var6_6 = -1; var6_6 < 2; ++var6_6) {
                for (var7_7 = -1; var7_7 < 2; ++var7_7) {
                    var8_8 = var1_1 + var7_7;
                    var9_9 = var2_2 + var6_6;
                    switch (h.a[var8_8][var9_9]) {
                        case 10: {
                            if (this.x != 3) break;
                        }
                        case 30: 
                        case 37: {
                            v0 = h.b[var8_8];
                            v1 = var9_9;
                            v2 = 1;
                            ** GOTO lbl38
                        }
                        case 16: 
                        case 19: 
                        case 43: 
                        case 49: {
                            h.a[var8_8][var9_9] = -1;
                            this.p(var8_8, var9_9);
                            h.c[var8_8][var9_9] = 24;
                            break;
                        }
                        case 8: {
                            h.a[var8_8][var9_9] = 54;
                            v0 = h.b[var8_8];
                            v1 = var9_9;
                            v2 = 0;
lbl38:
                            // 2 sources

                            v0[v1] = v2;
                            h.q(var8_8, var9_9);
                        }
                    }
                    if (!this.d(var8_8, var9_9)) continue;
                    this.a(1, 64, 0);
                }
            }
        }
        h.b[var1_1][var2_2] = var3_3;
        h.c[var1_1][var2_2] = 24;
    }

    private void bP() {
        int n = this.bE;
        int n2 = this.bF;
        if (b[n][n2] == 0) {
            if (a[n][n2 - 1] == 11) {
                h.b[n][n2] = 1;
                this.bT();
                return;
            }
        } else if (this.d(n, n2 - 1)) {
            this.a(1, 64, 0);
        }
    }

    private void bQ() {
        if (this.aR <= 6 && this.d(this.bE, this.bF)) {
            W = 0;
            this.j = 0;
            cm = a[this.bE][this.bF] >> 8;
            this.j(this.aP + g[this.aS & 7], this.aQ);
            if (cm < 0 || cm >= m.length) {
                cm = -1;
            } else {
                this.E(1);
                this.cl = 1;
                this.w(cm);
            }
            h.a[this.bE][this.bF] = -1;
        }
    }

    private void o(int n, int n2) {
        int n3 = this.bE;
        int n4 = this.bF;
        int n5 = n == 23 ? -1 : 1;
        h.c[n3][n4] = 24;
        if (this.aQ == n4) {
            for (int i = 0; i <= n2; ++i) {
                int n6 = n3 + i * n5;
                if (this.aP != n6) continue;
                this.a(1, 64, 0);
            }
        }
    }

    private void bR() {
        boolean bl = false;
        int n = -1;
        boolean bl2 = false;
        switch (this.aD) {
            case 26: {
                bl = true;
                this.bm = 25;
                bl2 = true;
                break;
            }
            case 24: {
                bl2 = true;
                bl = true;
                this.bm = 22;
                break;
            }
            case 27: {
                bl2 = true;
                bl = true;
                this.bm = 23;
                break;
            }
            case 40: {
                bl2 = true;
                bl = true;
                this.bm = 24;
                break;
            }
            case 42: {
                bl2 = true;
                bl = true;
                this.n = true;
                this.bm = 11;
                break;
            }
            case 41: {
                if (this.e()) {
                    this.al = true;
                    this.h();
                }
                this.aZ += this.aC;
                this.P -= this.aC;
                if (this.P <= 0 && !this.e()) {
                    h.a[this.Q][this.R] = -1;
                    this.P = 0;
                }
                n = 3;
                break;
            }
            case 4: {
                n = 2;
                ++this.aU;
                break;
            }
            case 5: {
                ++this.aV;
                n = 1;
                break;
            }
            case 2: {
                ++this.bb;
                bl2 = true;
                n = 0;
                break;
            }
            case 6: {
                ++this.ao;
                h.e[this.aP][this.aQ] = -1;
                int[] nArray = d[this.aP];
                int n2 = this.aQ;
                nArray[n2] = nArray[n2] | 0x100;
                n = 0;
                this.a(this.ap, this.aq, this.aP, this.aQ);
                break;
            }
            case 7: {
                this.a((byte)127);
                n = 4;
                break;
            }
            case 51: 
            case 52: 
            case 53: {
                int n3;
                h h2;
                this.a(this.ap, this.aq, this.aP, this.aQ);
                n = 0;
                bl = true;
                this.h();
                this.f = true;
                if (this.aD == 53) {
                    h2 = this;
                    n3 = 0;
                } else if (this.aD == 51) {
                    h2 = this;
                    n3 = 1;
                } else {
                    h2 = this;
                    n3 = 2;
                }
                h2.s = n3;
                i[2] = (byte)(i[2] | 1 << this.s);
                this.H();
            }
        }
        if (bl) {
            this.o(47);
        }
        if (n != -1) {
            this.d(this.aP, this.aQ - 1, n);
        }
        if (bl2) {
            h.d[this.X << 1] = (byte)this.aP;
            h.d[(this.X << 1) + 1] = (byte)this.aQ;
            ++this.X;
        }
        this.C();
        this.aD = -1;
    }

    /*
     * Unable to fully structure code
     */
    private void y(int var1_1) {
        var2_2 = this.bE;
        var3_3 = this.bF;
        if (this.aR > 0 || !this.d(var2_2, var3_3)) {
            return;
        }
        var4_4 = h.a[var2_2][var3_3] & 255;
        if ((var4_4 == 14 || var4_4 == 33) && h.a[var2_2][var3_3] >> 8 == 255) {
            return;
        }
        this.aD = var1_1;
        switch (var1_1) {
            case 40: {
                this.aA = 19;
                this.aB = 0;
                h.a[this.bE][this.bF] = -1;
                this.aD = 40;
                h.i[10] = 1;
                break;
            }
            case 42: {
                this.aA = 29;
                v0 = this;
                v1 = 0;
                ** GOTO lbl77
            }
            case 41: {
                this.aA = 2;
                this.aB = 0;
                this.aC = h.b[this.bE][this.bF];
                break;
            }
            case 4: {
                this.aA = 24;
                v0 = this;
                v1 = 0;
                ** GOTO lbl77
            }
            case 5: {
                this.aA = 25;
                v0 = this;
                v1 = 0;
                ** GOTO lbl77
            }
            case 2: {
                this.aA = 3;
                v0 = this;
                v1 = 0;
                ** GOTO lbl77
            }
            case 53: {
                this.aA = 32;
                v0 = this;
                v1 = 0;
                ** GOTO lbl77
            }
            case 51: {
                this.aA = 30;
                v0 = this;
                v1 = 0;
                ** GOTO lbl77
            }
            case 52: {
                this.aA = 31;
                v0 = this;
                v1 = 0;
                ** GOTO lbl77
            }
            case 6: {
                if (this.ao >= 99) ** GOTO lbl63
                this.aA = 5;
                v0 = this;
                v1 = 0;
                ** GOTO lbl77
lbl63:
                // 1 sources

                h.a[var2_2][var3_3] = 7;
                h.b[var2_2][var3_3] = 0;
                this.y(7);
                break;
            }
            case 7: {
                if (this.n == h.i[8]) {
                    h.a[var2_2][var3_3] = 41;
                    h.b[var2_2][var3_3] = 10;
                    this.aY += 10;
                    this.y(41);
                    break;
                }
                this.aA = 5;
                v0 = this;
                v1 = 1;
lbl77:
                // 9 sources

                v0.aB = v1;
            }
        }
        h.a[var2_2][var3_3] = -1;
        this.C();
    }

    private boolean h(int n, int n2) {
        return a[n][n2] == 28 || this.aI >= 24 && (a[n][n2 - 1] == 28 && (b[n][n2 - 1] & 8) == 0 || a[n][n2 + 1] == 28 && (b[n][n2 + 1] & 8) == 0) || this.aK >= 24 && (a[n][n2 - 1] == 28 || a[n][n2 + 1] == 28);
    }

    private int a(int n, int n2, int n3, int n4, boolean bl) {
        int n5;
        block13: {
            int n6;
            block16: {
                int n7;
                block15: {
                    int n8;
                    block14: {
                        n6 = n - n3;
                        n8 = n2 - n4;
                        int n9 = n6 > 0 ? n6 : -n6;
                        int n10 = n8 > 0 ? n8 : -n8;
                        n5 = 0;
                        if (n9 > n10) {
                            int n11;
                            if (n6 > 0) {
                                n11 = 4;
                            } else if (n6 < 0) {
                                n11 = n5 = 2;
                            }
                            if (n5 != 0 && (!h.g(n - g[n5], n2) || this.h(n - g[n5], n2))) {
                                n5 = 0;
                            }
                        }
                        if (n5 != 0) break block13;
                        if (n8 <= 0) break block14;
                        n7 = 1;
                        break block15;
                    }
                    if (n8 >= 0) break block16;
                    n7 = 3;
                }
                n5 = n7;
            }
            int n12 = n2 - g[8 + n5];
            if (bl && n5 != 0 && (!h.g(n, n12) || this.j && e[n][n12] != 0 || this.h(n, n12))) {
                int n13;
                n5 = 0;
                if (n6 > 0) {
                    n13 = 4;
                } else if (n6 < 0) {
                    n13 = n5 = 2;
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
                                            var4_4 = h.b[var2_2][var3_3];
                                            var5_5 = h.b[var2_2][var3_3];
                                            var6_6 = 0;
                                            var7_7 = 0;
                                            var8_8 = (h.a[var2_2][var3_3] & 255) == 35;
                                            v0 = var9_9 = var1_1 == 43 && (var4_4 & 3840) != 0;
                                            if (!var8_8 && this.i(var2_2, var3_3)) {
                                                h.a[var2_2][var3_3] = -1;
                                                this.p(var2_2, var3_3);
                                                return;
                                            }
                                            var10_10 = var4_4 & 7;
                                            if (var5_5 > 0) break block17;
                                            if (!var8_8 || var5_5 > 6) break block18;
                                            if (var5_5 < 0) {
                                                h.b[var2_2][var3_3] = 0;
                                            }
                                            break block19;
                                        }
                                        h.q(var2_2, var3_3);
                                        if (!var9_9) break block20;
                                        var5_5 = 18;
                                        var11_11 = this.a(var2_2, var3_3, this.aP, this.aQ, true);
                                        var4_4 = var4_4 & -8 | var11_11;
                                        var10_10 = var11_11;
                                        var6_6 = -h.g[var11_11];
                                        var7_7 = -h.g[var11_11 + 8];
                                        if (var11_11 == 0) {
                                            var5_5 = 0;
                                            var7_7 = 0;
                                            var6_6 = 0;
                                        }
                                        var4_4 -= 256;
                                        break block19;
                                    }
                                    if ((var4_4 & 0xFE0000) == 0 || (var4_4 & 248) != 0) break block21;
                                    var11_12 = (var4_4 & 0xFE0000) >> 17;
                                    var12_14 = (var4_4 & 0x7F000000) >> 24;
                                    if (var2_2 != var11_12 || var3_3 != var12_14) break block22;
                                    var10_10 = ((var4_4 &= -16646145) & -2147483648) == 0 ? 2 : 1;
                                    var4_4 = var4_4 & -8 | var10_10;
                                    break block19;
                                }
                                var5_5 = 21;
                                var13_15 = this.a(var2_2, var3_3, var11_12, var12_14, true);
                                var4_4 = var4_4 & -8 | var13_15;
                                var6_6 = -h.g[var13_15];
                                var7_7 = -h.g[var13_15 + 8];
                                var10_10 = var13_15;
                                if (var13_15 != 0) break block19;
                                var5_5 = 0;
                                break block23;
                            }
                            if (var10_10 != 0) break block24;
                            var5_5 = 21;
                            var11_13 = (var4_4 & 28672) >> 12;
                            var4_4 = var4_4 & -8 | var11_13;
                            var10_10 = var11_13;
                            var6_6 = -h.g[var11_13];
                            var7_7 = -h.g[var11_13 + 8];
                            if (!h.g(var2_2 + var6_6, var3_3 + var7_7)) {
                                var7_7 = 0;
                                var6_6 = 0;
                                var5_5 = 0;
                            }
                            break block19;
                        }
                        var5_5 = 21;
                        var6_6 = -h.g[var10_10];
                        var7_7 = -h.g[var10_10 + 8];
                        if (h.g(var2_2 + var6_6, var3_3 + var7_7)) break block19;
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
                        var4_4 = var4_4 & -8 | 0;
                        var10_10 = 0;
                    }
                    var7_7 = 0;
                    var6_6 = 0;
                }
                if ((var4_4 & 248) == 0) {
                    h.a[var2_2][var3_3] = -1;
                    h.a[var2_2 + var6_6][var3_3 + var7_7] = var1_1;
                    h.c[var2_2 + var6_6][var3_3 + var7_7] = 48;
                    h.b[var2_2 + var6_6][var3_3 + var7_7] = var5_5;
                    h.b[var2_2 + var6_6][var3_3 + var7_7] = var4_4;
                } else {
                    if ((h.aN & 3) == 0) {
                        var4_4 = var4_4 & -249 | (var4_4 & 248) - 8;
                        if (var1_1 == 43 && (var4_4 & 248) == 0) {
                            var4_4 = var4_4 & -3841 | 3072;
                        }
                    }
                    v3 = h.b[var2_2];
                    v4 = var3_3;
                    v5 = 0;
                }
                break block25;
            }
            if (var5_5 < 0) {
                h.b[var2_2][var3_3] = 0;
            }
            var5_5 = (byte)(var5_5 - 3);
            v3 = h.b[var2_2];
            v4 = var3_3;
            v5 = v3[v4] = var5_5;
        }
        if ((var4_4 & 248) == 0 && (h.a[0].f < 13 || h.a[0].f > 16) && h.a(var2_2, var3_3, var10_10, (int)h.b[var2_2][var3_3], this.aP, this.aQ, (int)((this.aS & 4096) == 0 ? this.k : 0), this.aR)) {
            this.a(1, 48, var10_10);
            if (var9_9) {
                var4_4 &= -3841;
            }
        }
        h.b[var2_2][var3_3] = var4_4;
    }

    private void bS() {
        int n;
        int n2;
        int[] nArray;
        int n3 = (a[this.bE][this.bF] & 0xF0000000) >> 28;
        if (n3 == 0) {
            this.E(10);
        }
        if ((aN & 1) == 0) {
            ++n3;
        }
        if (n3 >= a[13].a(0)) {
            nArray = a[this.bE];
            n2 = this.bF;
            n = a[this.bE][this.bF] & 0xFFFFFFF;
        } else {
            nArray = a[this.bE];
            n2 = this.bF;
            n = a[this.bE][this.bF] & 0xFFFFFFF | n3 << 28;
        }
        nArray[n2] = n;
        h.q(this.bE, this.bF);
    }

    private void bT() {
        if ((this.i == 3 || this.i == 4 || this.i == 5) && this.af > 0) {
            return;
        }
        if (cm >= 0) {
            int n = cm;
            m[n] = (byte)(m[n] - 1);
            if (m[cm] == 0) {
                this.x(cm);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void z(int var1_1) {
        block6: {
            if ((h.a[this.bE][this.bF] & 255) == 14 && h.a[this.bE][this.bF] >> 8 == 255) {
                return;
            }
            if (!this.d(this.bE, this.bF) || h.a[0].f != 40 && h.a[0].f != 48) break block6;
            h.a[this.bE][this.bF] = -1;
            switch (var1_1) {
                case 24: {
                    h.i[9] = 1;
                    this.aA = 7;
                    this.aB = 0;
                    v0 = this;
                    v1 = 24;
                    ** GOTO lbl26
                }
                case 27: {
                    h.i[9] = 2;
                    this.aA = 7;
                    this.aB = 1;
                    v0 = this;
                    v1 = 27;
                    ** GOTO lbl26
                }
                case 26: {
                    h.i[9] = 8;
                    this.aA = 7;
                    this.aB = 2;
                    v0 = this;
                    v1 = 26;
lbl26:
                    // 3 sources

                    v0.aD = v1;
                }
            }
            this.a(this.ap, this.aq, this.bE, this.bF);
        }
    }

    private void bU() {
        int n = b[this.bE][this.bF];
        if (n > 0) {
            int n2 = this.bE;
            int n3 = this.bF;
            if (n == 4) {
                for (int i = 1; i < 5; ++i) {
                    byte by = g[i];
                    byte by2 = g[i + 8];
                    if (a[n2 + by][n3 + by2] != 30) continue;
                    int[] nArray = b[n2 + by];
                    int n4 = n3 + by2;
                    nArray[n4] = nArray[n4] + 1;
                    h.c[n2 + by][n3 + by2] = 24;
                }
            } else if (n >= 16) {
                h.a[n2][n3] = -1;
                h.q(n2, n3);
            }
            h.b[n2][n3] = n + 1;
            h.c[n2][n3] = 24;
        }
    }

    private void bV() {
        int n = this.bE;
        int n2 = this.bF;
        int n3 = b[n][n2];
        if (n3 > 0) {
            if (n3 >= 8) {
                this.t(n, n2);
                h.a[n][n2] = -1;
                h.q(n, n2);
            }
            h.b[n][n2] = n3 + 1;
            h.c[n][n2] = 24;
        }
    }

    private void bW() {
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
                                            int n15 = (b[n2][n] & 0xF00) >> 8;
                                            if (n15 == 0) break block21;
                                            if (n15 >= 4) {
                                                h.a[n2][n] = -1;
                                            } else if ((aN >> 1 & 1) == 0) {
                                                h.b[n2][n] = b[n2][n] + 256;
                                            }
                                            break block22;
                                        }
                                        if (e == null || e[n2][n] == 0) break block23;
                                        h.b[n2][n] = b[n2][n] & 0xFFFFF0FF | 0x100;
                                        break block22;
                                    }
                                    if (b[n2][n] > 4) break block22;
                                    n8 = b[n2][n];
                                    h.c[n2][n] = 24;
                                    bl = (n8 & 0x10) != 0;
                                    int n16 = n8 & 7;
                                    if (n16 == 0) break block24;
                                    n14 = 0;
                                    n13 = 0;
                                    n11 = 0;
                                    n10 = 0;
                                    n12 = 0;
                                    n9 = 0;
                                    switch (n16) {
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
                                            int n17 = 1;
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
                                            int n17 = n11 = -1;
                                        }
                                    }
                                    if (!h.g(n2 + n11, n + n10) || !h.g(n2 + n14, n + n13) || !h.g(n2 + n14 - n11, n + n13 - n10)) break block25;
                                    if (b[n2][n] <= 0) {
                                        h.b[n2 + n11][n + n10] = n8;
                                        h.a[n2 + n11][n + n10] = 11;
                                        h.a[n2][n] = -1;
                                        h.b[n2 + n11][n + n10] = 18;
                                    }
                                    break block26;
                                }
                                if (!h.g(n2 + n14, n + n13)) break block27;
                                h.b[n2 + n14][n + n13] = n8 & 0xFFFFFFF8 | n12;
                                h.a[n2 + n14][n + n13] = 11;
                                h.a[n2][n] = -1;
                                h.b[n2 + n14][n + n13] = 18;
                                break block26;
                            }
                            if (!h.g(n2 + n11, n + n10)) break block28;
                            if (b[n2][n] <= 0) {
                                h.b[n2 + n11][n + n10] = n8;
                                h.a[n2 + n11][n + n10] = 11;
                                h.a[n2][n] = -1;
                                h.b[n2 + n11][n + n10] = 18;
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
                        h.b[n2][n] = n8 & 0xFFFFFFF8 | (bl ? 3 : 1);
                    }
                    if (a[n2][n + 1] < 0) break block26;
                    nArray2 = b[n2];
                    n7 = n;
                    n4 = n8 & 0xFFFFFFF8;
                    n3 = bl ? 4 : 2;
                }
                nArray2[n7] = n4 | n3;
            }
            h.q(n2, n);
        }
        if (this.d(n2, n)) {
            this.a(1, 64, 0);
        }
        if (b[n2][n] > 0) {
            byte[] byArray = b[n2];
            int n18 = n;
            byArray[n18] = (byte)(byArray[n18] - 5);
        }
    }

    private void bX() {
        int n = this.bE;
        int n2 = this.bF;
        int n3 = b[n][n2];
        if (n3 > 0) {
            h.a[n][n2] = -1;
            h.a[n][n2] = 32;
            h.q(n, n2);
            this.t(n, n2);
            h.c[n][n2] = 24;
        }
    }

    private void bY() {
        int n;
        int n2;
        int n3;
        block14: {
            int n4;
            byte[] byArray;
            block10: {
                int n5;
                boolean bl;
                int n6;
                int n7;
                block13: {
                    block11: {
                        block12: {
                            n3 = this.bE;
                            n2 = this.bF;
                            h.c[n3][n2] = 24;
                            if (b[n3][n2] != 0) break block10;
                            int n8 = b[n3][n2];
                            n7 = (n8 & 1) == 0 ? -1 : 1;
                            n6 = a[n3 + n7][n2];
                            int n9 = a[n3 + n7][n2] & 0xFF;
                            bl = false;
                            int n10 = n8 >> 1;
                            if (n10 <= 0) break block11;
                            if (n6 >= 0 || n9 == 14 || n9 == 33) break block12;
                            h.b[n3 + n7][n2] = n10 - 1 << 1 | n8 & 1;
                            h.c[n3 + n7][n2] = 30;
                            h.b[n3 + n7][n2] = 18;
                            n6 = 32;
                            break block13;
                        }
                        if (n6 == 32) break block13;
                        n5 = b[n3 + n7][n2];
                        int n11 = 0;
                        if (n6 == 48 && (n5 & 8) != 0) break block13;
                        switch (n6) {
                            case 1: 
                            case 2: 
                            case 4: 
                            case 5: 
                            case 6: 
                            case 7: {
                                n11 = -n7;
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
                                this.E(12);
                                this.o = 0;
                                this.bi = this.aP - (n3 + n7) + n11;
                                this.bg = n3 + n7;
                                this.bh = n2;
                                if (this.bf == -1) {
                                    switch (n6) {
                                        case 0: 
                                        case 8: 
                                        case 9: 
                                        case 47: {
                                            n5 &= 0xFFFF8FFF;
                                            n5 &= 0xFFFFFDFF;
                                        }
                                    }
                                    this.bf = n5;
                                }
                                this.be = this.bi < 0 ? n5 & 0xFFFFFFF8 | 4 : n5 & 0xFFFFFFF8 | 2;
                                break block13;
                            }
                            default: {
                                if (n6 == -1) break block13;
                            }
                        }
                    }
                    bl = true;
                }
                if (bl) {
                    for (n5 = 1; n5 <= 3; ++n5) {
                        if (a[this.aP + n7 * n5][this.aQ] != 32) continue;
                        h.a[this.aP + n7 * n5][this.aQ] = -1;
                    }
                }
                byArray = a[n3 + n7];
                n4 = n2;
                n = n6;
                break block14;
            }
            byte[] byArray2 = b[n3];
            int n12 = n2;
            n4 = n12;
            byArray = byArray2;
            n = byArray2[n12] - 6;
        }
        byArray[n4] = n;
        h.q(n3, n2);
    }

    private void bZ() {
        byte by;
        int n;
        byte[] byArray;
        int n2 = this.bE;
        int n3 = this.bF;
        int n4 = b[n2][n3] & 7;
        if ((b[n2][n3] & 8) != 0) {
            int n5;
            switch (n4) {
                case 4: {
                    int n6 = 12;
                    break;
                }
                case 2: {
                    int n6 = 13;
                    break;
                }
                default: {
                    int n6 = n5 = 14;
                }
            }
            if (b[n2][n3] >= h.a(a[29], n5) || (a[this.bE][this.bF] & 0xFF) == 35) {
                h.a[n2][n3] = -1;
                h.q(n2, n3);
            } else {
                byte[] byArray2 = b[n2];
                int n7 = n3;
                byArray2[n7] = (byte)(byArray2[n7] + 1);
            }
            h.c[n2][n3] = 24;
            return;
        }
        if (this.d(n2, n3) || this.d(n2 + g[n4], n3 + g[8 + n4]) && b[n2][n3] <= this.aR) {
            this.a(1, 48, 0);
        }
        if (b[n2][n3] <= 0) {
            int n8;
            int n9;
            byte[] byArray3;
            int n10 = n2 - g[n4];
            int n11 = n3 - g[n4 + 8];
            int n12 = 24;
            if (n4 == 4) {
                n12 = 12;
            }
            if (a[n10][n11] < 0) {
                h.a[n10][n11] = 21;
                h.b[n10][n11] = b[n2][n3];
                h.b[n10][n11] = n12;
                byArray3 = a[n2];
                n9 = n3;
                n8 = -1;
            } else if (a[n10][n11] == 21) {
                int n13 = b[n10][n11] & 7;
                int n14 = n10 - g[n13];
                int n15 = n11 - g[n13 + 8];
                h.a[n2][n3] = -1;
                h.q(n2, n3);
                int n16 = b[n2][n3];
                if (a[n14][n15] < 0) {
                    h.a[n14][n15] = 21;
                    h.b[n14][n15] = b[n10][n11];
                    h.b[n14][n15] = 18;
                }
                h.a[n10][n11] = 21;
                h.b[n10][n11] = n16;
                byArray3 = b[n10];
                n9 = n11;
                n8 = 18;
            } else {
                switch (a[n10][n11]) {
                    case 19: 
                    case 43: 
                    case 45: 
                    case 46: {
                        h.a[n10][n11] = -1;
                        this.p(n10, n11);
                        break;
                    }
                    case 10: 
                    case 30: {
                        if (b[n10][n11] >= 1) break;
                        h.b[n10][n11] = 1;
                    }
                }
                int[] nArray = b[n2];
                int n17 = n3;
                nArray[n17] = nArray[n17] | 8;
                byArray3 = b[n2];
                n9 = n3;
                n8 = 0;
            }
            byArray3[n9] = n8;
            byArray = c[n10];
            n = n11;
            by = (byte)48;
        } else {
            byte[] byArray4 = b[n2];
            int n18 = n3;
            n = n18;
            byArray = byArray4;
            by = (byte)(byArray4[n18] - 12);
        }
        byArray[n] = by;
    }

    private void p(int n, int n2) {
        h.a[n][n2] = a[n][n2] & 0xFFFFFFF | 0x10000000;
        this.bT();
    }

    private void ca() {
        int n;
        int n2;
        int n3;
        block8: {
            byte by;
            byte by2;
            int n4;
            byte[] byArray;
            block10: {
                int n5;
                int n6;
                int n7;
                block12: {
                    block15: {
                        block16: {
                            block13: {
                                block14: {
                                    block11: {
                                        block9: {
                                            int n8;
                                            block7: {
                                                n3 = this.bE;
                                                n2 = this.bF;
                                                n7 = b[n3][n2];
                                                n8 = (n7 & 0xFF00) >> 8;
                                                int n9 = n = (n7 & 8) != 0 ? 4 : 2;
                                                if (n8 < 20) break block7;
                                                if (h.g(n3, n2 + 1) || n == 4 && (a[n3 - 1][n2] < 0 || a[n3 - 1][n2] == 16 || a[n3 - 1][n2] == 19 || a[n3 - 1][n2] == 43) || n == 2 && (a[n3 + 1][n2] < 0 || a[n3 + 1][n2] == 16 || a[n3 + 1][n2] == 19 || a[n3 + 1][n2] == 43)) {
                                                    h.b[n3][n2] = n7 & 0xFFFF00FF | 0x1300;
                                                }
                                                break block8;
                                            }
                                            if (n8 <= 0) break block9;
                                            h.b[n3][n2] = n7 & 0xFFFF00FF | n8 - 1 << 8;
                                            byArray = c[n3];
                                            n4 = n2;
                                            by2 = (byte)24;
                                            break block8;
                                        }
                                        by = b[n3][n2];
                                        if (by > 0) break block10;
                                        n6 = n3;
                                        n5 = n2;
                                        if (!h.g(n3, n2 + 1)) break block11;
                                        n5 = n2 + 1;
                                        n = 3;
                                        break block12;
                                    }
                                    if (n != 4) break block13;
                                    if (!h.g(n3 - 1, n2)) break block14;
                                    n6 = n3 - 1;
                                    break block12;
                                }
                                n = 0;
                                if (a[n3 - 1][n2] == 16 || a[n3 - 1][n2] == 19 || a[n3 - 1][n2] == 43) break block12;
                                break block15;
                            }
                            if (!h.g(n3 + 1, n2)) break block16;
                            n6 = n3 + 1;
                            break block12;
                        }
                        n = 0;
                        if (a[n3 + 1][n2] == 16 || a[n3 + 1][n2] == 19 || a[n3 + 1][n2] == 43) break block12;
                    }
                    n7 = n7 & 0xFFFF00FF | 0x1400;
                }
                if (n6 != n3 || n5 != n2) {
                    h.a[n6][n5] = 14;
                    h.q(n6, n5);
                    h.a[n3][n2] = -1;
                    h.b[n6][n5] = 18;
                }
                h.b[n6][n5] = n7 & 0xFFFFFFF8 | n;
                break block8;
            }
            byArray = b[n3];
            n4 = n2;
            by2 = byArray[n4] = (byte)(by - 6);
        }
        if (this.d(n3, n2)) {
            this.a(1, 48, n);
        }
    }

    private void cb() {
        boolean bl;
        int n;
        int n2;
        int n3 = this.bE;
        int n4 = this.bF;
        if (a[n3][n4 + 1] != 16) {
            n2 = 0;
            n = -1;
        } else {
            n2 = 1;
            n = 0;
        }
        int n5 = n;
        int n6 = b[n3][n4 + n2];
        int n7 = b[n3][n4 + n2];
        int n8 = (n7 & 7) == 4 ? 4 : 2;
        boolean bl2 = bl = this.d(n3 - g[n8], n4 + n2) || this.d(n3 - g[n8], n4 + n5);
        if (n6 <= 0 && bl && this.aR <= 12) {
            n6 = 36;
        } else if (n6 > 0) {
            if (n2 == 0) {
                n6 = (byte)(n6 - 1);
            }
            if ((n6 == 11 || n2 == 0 && n6 < 11) && bl) {
                this.a(1, 48, n7 & 7);
            }
            h.c[n3][n4] = 24;
        }
        if (this.i(n3, n4)) {
            this.E(14);
            h.a[n3][n4 + n5] = -1;
            this.p(n3, n4 + n5);
            h.a[n3][n4 + n2] = -1;
            this.p(n3, n4 + n2);
            return;
        }
        h.b[n3][n4 + n5] = n7;
        h.b[n3][n4 + n2] = n7;
        if (n2 == 0) {
            h.b[n3][n4 + n5] = n6;
            h.b[n3][n4 + n2] = n6;
        }
    }

    private void cc() {
        int n;
        int n2;
        int n3 = (n2 & 8) == 0 ? this.aJ : this.aL;
        int n4 = this.bF + (n3 - 1) * (n = ((n2 = b[this.bE][this.bF]) & 7) == 3 ? 1 : -1);
        if (this.d(this.bE, n4)) {
            this.a(2, 48, (int)h[this.aS & 7]);
        }
        switch (a[this.bE][n4]) {
            case -1: 
            case 28: 
            case 32: {
                break;
            }
            default: {
                this.p(this.bE, n4);
                h.a[this.bE][n4] = -1;
                h.q(this.bE, n4);
                this.b(this.bE, n4);
            }
        }
        h.c[this.bE][this.bF] = 24;
    }

    private void cd() {
        int n;
        int n2 = this.bE;
        int n3 = this.bF;
        int n4 = a[n2][n3] >> 8;
        int n5 = a[n2][n3] & 0xFF;
        if ((n4 & 0x100) == 0 && (n5 == 9 && this.aU > 0 || n5 == 8 && this.aV > 0) && this.aQ == n3 && (this.aP == n2 - 1 || this.aP == n2 + 1) && (n = h.a[0].f) != 18 && n != 17 && this.aR <= 6) {
            int n6;
            h h2;
            int n7;
            h h3;
            this.j = 0;
            this.k = 0;
            if (this.aP == n2 - 1) {
                this.aS = this.aS & 0xFFFFFFF8 | 2;
                h3 = this;
                n7 = 18;
            } else {
                this.aS = this.aS & 0xFFFFFFF8 | 4;
                h3 = this;
                n7 = 17;
            }
            h3.o(n7);
            if (n5 == 9) {
                h2 = this;
                n6 = 24;
            } else {
                h2 = this;
                n6 = 25;
            }
            h2.aA = n6;
            this.aB = 0;
        }
    }

    private void ce() {
        int n = this.bE;
        int n2 = this.bF;
        int n3 = a[n][n2] >> 8;
        int n4 = (n3 & 0xF0) >> 4;
        if (n4 != 0) {
            if (aN % 3 == 0 && n4 < 3) {
                n3 = n3 & 0xFFFFFF0F | n4 + 1 << 4;
                if (n4 == 2) {
                    int n5 = a[n][n2 - 1] & 0xFF;
                    if (n5 == 9 || n5 == 8) {
                        int n6 = a[n][n2 - 1] >> 8;
                        h.a[n][n2 - 1] = (n6 &= 0xFFFFFDFF) << 8 | n5;
                    }
                    this.a(n, n2 - 1, 1, 0, 0);
                    this.a(n, n2 - 1, -1, 0, 0);
                }
                h.c[n][n2] = 24;
            }
            h.a[n][n2] = n3 << 8 | 7;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void cf() {
        block11: {
            var1_1 = this.bE;
            var2_2 = this.bF;
            var3_3 = h.a[var1_1][var2_2] >> 8;
            if (var3_3 >= 6) break block11;
            switch (var3_3) {
                case -1: {
                    if (Math.abs(this.aP - var1_1) >= 4 || Math.abs(this.aQ - var2_2) >= 4) break;
                    var3_3 = 3;
                    break;
                }
                case 0: 
                case 1: {
                    break;
                }
                case 2: {
                    switch (this.k) {
                        case 1: {
                            if (!this.d(var1_1, var2_2 - 1)) break;
                            ** GOTO lbl25
                        }
                        case 2: {
                            if (!this.d(var1_1 + 1, var2_2)) break;
                            ** GOTO lbl25
                        }
                        case 3: {
                            if (!this.d(var1_1, var2_2 + 1)) break;
                            ** GOTO lbl25
                        }
                        case 4: {
                            if (!this.d(var1_1 - 1, var2_2)) break;
lbl25:
                            // 4 sources

                            var3_3 = 3;
                        }
                    }
                    break;
                }
                default: {
                    if ((h.aN & 1) != 0) break;
                    ++var3_3;
                }
            }
            h.c[var1_1][var2_2] = 24;
            h.a[var1_1][var2_2] = var3_3 << 8 | 3;
            return;
        }
        h.c[var1_1][var2_2] = 0;
    }

    private void A(int n) {
        int n2 = this.bE;
        int n3 = this.bF;
        int n4 = a[n2][n3] >> 8;
        h.a[n2][n3] = n4 << 8 | n;
        if (b[n2][n3] <= 0) {
            if (n4 == 0) {
                if (this.d(n2, n3) && this.aR <= 0) {
                    int n5;
                    h h2;
                    this.aS &= 0xFFFFF7FF;
                    h.a[n2][n3] = 0x100 | n;
                    if (Math.abs(this.m - System.currentTimeMillis()) >= 5000L) {
                        h2 = this;
                        n5 = 40;
                    } else {
                        h2 = this;
                        n5 = 48;
                    }
                    h2.o(n5);
                    this.E(3);
                    return;
                }
            } else if ((aN >> 1 & 1) == 0 && a[n == 14 ? 8 : 22] != null && n4 < a[n == 14 ? 8 : 22].a(0) - 1) {
                h.a[n2][n3] = n4 + 1 << 8 | n;
                h.c[n2][n3] = 24;
            }
        }
    }

    private boolean i(int n, int n2) {
        int n3 = n2 - 1;
        int n4 = n - 1;
        int n5 = n + 1;
        return b[n][n3] <= 6 && (h.j(n, n3) && ((b[n][n3] & 7) == 3 || a[n][n2] != 16 && a[n][n3] != 1) || a[n][n3] == 46 || a[n][n3] == 14 || a[n][n3] == 48) || b[n5][n2] <= 0 && a[n5][n2] == 14 && (b[n5][n2] & 8) != 0 && (b[n5][n2] & 7) != 3 || b[n4][n2] <= 0 && a[n4][n2] == 14 && (b[n4][n2] & 8) == 0 && (b[n4][n2] & 7) != 3;
    }

    private static boolean j(int n, int n2) {
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

    private static void q(int n, int n2) {
        int n3 = n - 1;
        int n4 = n + 1;
        int n5 = n2 - 1;
        int n6 = n2 + 1;
        h.c[n3][n5] = 48;
        h.c[n][n5] = 48;
        h.c[n4][n5] = 48;
        h.c[n3][n2] = 48;
        h.c[n][n2] = 48;
        h.c[n4][n2] = 48;
        h.c[n3][n6] = 48;
        h.c[n][n6] = 48;
        h.c[n4][n6] = 48;
    }

    private void cg() {
        this.h = i[10];
        this.ch = this.cf;
        this.cg = this.ce;
        this.U = this.P;
        this.bZ = this.ax;
        this.bX = this.aZ;
        this.bY = this.bb;
        this.bS = this.aP;
        this.bT = this.aQ;
        this.bU = this.aU;
        this.bV = this.aV;
        this.bW = this.an;
        this.Y = this.X;
        this.ca = this.ab;
        this.cb = this.aa;
        cn = cm;
        if (m != null) {
            System.arraycopy(m, 0, o, 0, m.length);
        }
        for (int i = 0; i < this.av; ++i) {
            System.arraycopy(b[i], 0, c[i], 0, this.aw);
            System.arraycopy(b[i], 0, d[i], 0, this.aw);
            System.arraycopy(a[i], 0, e[i], 0, this.aw);
            System.arraycopy(a[i], 0, d[i], 0, this.aw);
        }
        this.cl();
    }

    private void ch() {
        int n;
        int n2;
        int n3;
        block21: {
            block20: {
                int n4;
                int[] nArray;
                block19: {
                    cF = -1;
                    this.aC = -1;
                    this.aB = -1;
                    this.aA = -1;
                    this.bg = 0;
                    this.bh = 0;
                    this.C = true;
                    this.ci = this.bS * 24 - 120;
                    this.cj = this.bT * 24 - 160 + 40;
                    this.bl = 0;
                    if (!this.o) break block19;
                    this.bm = 15;
                    this.o = false;
                    h.d[37][7] = -1;
                    nArray = d[39];
                    n4 = 5;
                    break block20;
                }
                if (!this.p) break block21;
                this.bm = 17;
                this.p = false;
                h.d[46][7] = -1;
                nArray = d[50];
                n4 = 7;
            }
            nArray[n4] = -1;
        }
        this.r = false;
        this.am = 70;
        h.i[10] = this.h;
        this.P = this.U;
        this.cf = this.ch;
        this.ce = this.cg;
        this.ax = this.bZ;
        this.bb = this.bY;
        this.aZ = this.bX;
        a[0].a(2);
        this.aS = 2;
        this.bj = 0;
        this.aP = this.bS;
        this.aQ = this.bT;
        this.aU = this.bU;
        this.aV = this.bV;
        this.X = this.Y;
        switch (this.i) {
            case 5: {
                this.M();
                break;
            }
            case 3: {
                this.af = 5;
                break;
            }
            case 4: {
                this.ad = 0;
                this.ag = 0;
                this.af = 3;
                this.i = false;
                break;
            }
            case 1: {
                this.aa = this.cb;
                this.ab = this.ca;
            }
        }
        cm = cn;
        if (m != null) {
            System.arraycopy(o, 0, m, 0, m.length);
        }
        for (n3 = 0; n3 < this.av; ++n3) {
            System.arraycopy(c[n3], 0, b[n3], 0, this.aw);
            System.arraycopy(d[n3], 0, b[n3], 0, this.aw);
            System.arraycopy(e[n3], 0, a[n3], 0, this.aw);
            System.arraycopy(d[n3], 0, a[n3], 0, this.aw);
        }
        n3 = this.aw - 1;
        for (n2 = 1; n2 < n3; ++n2) {
            n = this.av - 1;
            for (int i = 1; i < n; ++i) {
                byte by = a[i][n2];
                int n5 = a[i][n2] & 0xFF;
                if ((by <= -1 || by >= 80) && (n5 <= -1 || n5 >= 80)) continue;
                h.q(i, n2);
            }
        }
        if (a[2] != null) {
            a[2].a(0);
            h.a[18][63] = -1;
        }
        this.an = this.bW;
        this.C();
        if (this.j) {
            this.cm();
        }
        if (e != null) {
            for (n2 = 0; n2 < this.aw; ++n2) {
                for (n = 0; n < this.av; ++n) {
                    if (a[n][n2] != 48) continue;
                    this.bE = n;
                    this.bF = n2;
                    if ((b[n][n2] & 8) == 0) {
                        this.d((byte)48);
                        continue;
                    }
                    this.bH();
                }
            }
        }
    }

    public static void a(short s, short s2, byte by, int n) {
        h.a[s][s2] = by;
        h.b[s][s2] = n;
    }

    private static boolean b(int n, int n2, int n3, int n4) {
        return Math.abs(n - n3) < 24 && Math.abs(n2 - n4) < 24;
    }

    private static boolean a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        dq = 0;
        dp = 0;
        ds = 100;
        dr = 100;
        if (Math.abs(n - n5) > 1 || Math.abs(n2 - n6) > 1) {
            return false;
        }
        dp = n * 24 + g[n3] * n4;
        dq = n2 * 24 + g[8 + n3] * n4;
        dr = n5 * 24 + g[n7] * n8;
        ds = n6 * 24 + g[8 + n7] * n8;
        return h.b(dp, dq, dr, ds);
    }

    /*
     * Unable to fully structure code
     */
    private void ci() {
        block59: {
            block66: {
                block67: {
                    block57: {
                        block61: {
                            block65: {
                                block64: {
                                    block63: {
                                        block62: {
                                            block60: {
                                                block58: {
                                                    var1_1 = this.bE;
                                                    var2_2 = this.bF;
                                                    var3_3 = h.b[var1_1][var2_2];
                                                    var4_4 = h.b[var1_1][var2_2];
                                                    var5_5 = h.a[var1_1][var2_2];
                                                    var10_6 = h.e != null && h.e[var1_1][var2_2] != 0;
                                                    var11_7 = var4_4 & 7;
                                                    if (var10_6 && h.e[var1_1][var2_2] != 3) {
                                                        var6_8 = -1;
                                                        var7_9 = 1;
                                                        v0 = var2_2 - 1;
                                                    } else {
                                                        var6_8 = 1;
                                                        var7_9 = 3;
                                                        v0 = var2_2 + 1;
                                                    }
                                                    var8_10 = v0;
                                                    var12_11 = (this.aS & 4096) == 0 ? this.k : 0;
                                                    var13_12 = h.a(var1_1, var2_2, var11_7, var3_3, this.aP, this.aQ, (int)var12_11, this.aR);
                                                    if (var5_5 == 1 && var13_12) {
                                                        this.r(var1_1, var2_2);
                                                        return;
                                                    }
                                                    var14_13 = (h.a[var1_1][var2_2] & 255) == 35;
                                                    var15_14 = h.a[var1_1][var8_10];
                                                    if (var15_14 == 9 && var3_3 <= 0) {
                                                        var16_15 = (byte)(h.a[var1_1][var8_10] & 255);
                                                        var17_16 = (h.b[var1_1][var8_10] & 0xFC00000) >> 22;
                                                        if (var17_16 != 34) {
                                                            if (var17_16 == 33) {
                                                                if (var16_15 == -1) {
                                                                    h.a[var1_1][var8_10] = 32;
                                                                }
                                                                this.aP = var1_1;
                                                                this.aQ = var8_10;
                                                                h.a[var1_1][var8_10] = -1;
                                                                this.aR = 0;
                                                                this.aT = 0;
                                                                this.a(2, 48, 0);
                                                            } else if (h.a[var1_1][var8_10] == 19 || h.a[var1_1][var8_10] == 43 || h.a[var1_1][var8_10] == 45 || h.a[var1_1][var8_10] == 46 || h.a[var1_1][var8_10] == 49 || h.a[var1_1][var8_10] == 11) {
                                                                h.a[var1_1][var8_10] = -1;
                                                                this.p(var1_1, var8_10);
                                                            }
                                                        }
                                                    }
                                                    if (var3_3 > 0 || var14_13) break block57;
                                                    if (var11_7 != var7_9 || !this.d(var1_1, var8_10) || !h.f(var1_1, var8_10)) break block58;
                                                    if ((var5_5 == 0 || var5_5 == 9) && var6_8 > 0) {
                                                        this.a(2, 48, 0);
                                                    } else if (var5_5 == 1) {
                                                        h.b[var1_1][var8_10] = var4_4 & -8 | 3;
                                                        h.b[var1_1][var8_10] = 18;
                                                        h.a[var1_1][var8_10] = 1;
                                                        h.a[var1_1][var2_2] = -1;
                                                        this.b(var1_1, var2_2);
                                                    } else if (var5_5 == 8) {
                                                        var4_4 &= -4063233;
                                                    }
                                                    h.b[var1_1][var2_2] = var4_4 & -8 | 0;
                                                    break block59;
                                                }
                                                if (!h.f(var1_1, var8_10) && h.a[var1_1][var8_10] != 21 || this.d(var1_1, var2_2) && this.aT <= 0 || (this.d(var1_1, var8_10) || h.b(h.dp, h.dq, h.dr, h.ds - 1)) && this.aT <= 0 && this.aW == 0 && (var5_5 == 0 || var11_7 != var7_9)) break block60;
                                                if (var6_8 > 0 || h.e != null && h.e[var1_1][var8_10] != 0) {
                                                    var4_4 += 131072;
                                                    var4_4 = var4_4 & -8 | var7_9;
                                                    h.b[var1_1][var8_10] = var4_4 | -2147483648;
                                                    h.b[var1_1][var8_10] = 18;
                                                    h.a[var1_1][var8_10] = var5_5;
                                                    h.a[var1_1][var2_2] = -1;
                                                    h.q(var1_1, var2_2);
                                                    h.c[var1_1][var2_2 + 2 * var6_8] = 24;
                                                    this.b(var1_1, var2_2);
                                                } else {
                                                    h.b[var1_1][var2_2] = var4_4 = var4_4 & -4063240 | 0;
                                                    h.b[var1_1][var8_10] = 0;
                                                }
                                                break block59;
                                            }
                                            if (!h.j(var1_1, var8_10)) break block61;
                                            if (var6_8 >= 0 || h.e != null && h.e[var1_1][var8_10] != 0 || h.a[var1_1][var2_2 + 1] >= 0) break block62;
                                            h.b[var1_1][var2_2 + 1] = var4_4 & -8 | 3;
                                            h.b[var1_1][var2_2 + 1] = h.b[var1_1][var2_2 + 1] | -2147483648;
                                            h.a[var1_1][var2_2 + 1] = var5_5;
                                            h.b[var1_1][var2_2 + 1] = 18;
                                            h.a[var1_1][var2_2] = -1;
                                            break block59;
                                        }
                                        if (h.b[var1_1][var8_10] > 0) break block59;
                                        var16_15 = (var4_4 & 0x3E0000) >> 17;
                                        if (var16_15 >= 2) {
                                            if (var5_5 == 8) {
                                                h.a[var1_1][var2_2] = 54;
                                                h.b[var1_1][var2_2] = 0;
                                                h.q(var1_1, var2_2);
                                                return;
                                            }
                                            if (h.a[var1_1][var8_10] == 8) {
                                                h.a[var1_1][var8_10] = 54;
                                                h.b[var1_1][var8_10] = 0;
                                                h.q(var1_1, var8_10);
                                                return;
                                            }
                                        }
                                        var4_4 &= -4063233;
                                        if (!h.f(var1_1 - 1, var2_2) || !h.f(var1_1 - 1, var8_10) || this.d(var1_1 - 1, var2_2)) break block63;
                                        h.b[var1_1][var2_2] = (byte)(((var4_4 & 28672) >> 12) + 1);
                                        h.c[var1_1][var2_2] = 24;
                                        var4_4 = var4_4 & -8 | 4;
                                        v1 = var4_4 & -3073;
                                        v2 = 2048;
                                        break block64;
                                    }
                                    if (!h.f(var1_1 + 1, var2_2) || !h.f(var1_1 + 1, var8_10) || this.d(var1_1 + 1, var2_2)) break block65;
                                    h.b[var1_1][var2_2] = (byte)(((var4_4 & 28672) >> 12) + 1);
                                    h.c[var1_1][var2_2] = 24;
                                    var4_4 = var4_4 & -8 | 2;
                                    v1 = var4_4 & -3073;
                                    v2 = 1024;
                                }
                                var4_4 = v1 | v2;
                                var4_4 |= 512;
                            }
                            h.b[var1_1][var2_2] = var4_4;
                            break block59;
                        }
                        if (var5_5 == 8) {
                            var16_15 = (var4_4 & 0x3E0000) >> 17;
                            if (var16_15 >= 2) {
                                h.a[var1_1][var2_2] = 54;
                                h.b[var1_1][var2_2] = 0;
                                h.q(var1_1, var2_2);
                                return;
                            }
                            var4_4 &= -4063233;
                        } else {
                            var4_4 = var4_4 & -3073 | 0;
                            var4_4 &= -4063233;
                            h.b[var1_1][var2_2] = var4_4 &= -8;
                        }
                        break block59;
                    }
                    if (var14_13) break block59;
                    if ((var4_4 & 512) != 0) break block66;
                    if (var11_7 != 3 || (h.a[var1_1][var2_2] & 255) != 6 || var3_3 > 12) {
                        var3_3 = (byte)(var3_3 - 6);
                    } else {
                        var3_3 = (byte)(var3_3 - (h.aN & 1));
                        h.c[var1_1][var2_2] = 24;
                    }
                    if (var3_3 != 0 && var3_3 != 12) break block67;
                    switch (var4_4 & 3072) {
                        case 2048: {
                            v3 = var4_4 & -57;
                            v4 = var4_4 - 8;
                            ** GOTO lbl148
                        }
                        case 1024: {
                            v3 = var4_4 & -57;
                            v4 = var4_4 + 8;
lbl148:
                            // 2 sources

                            var4_4 = v3 | v4 & 56;
                        }
                    }
                    if (var3_3 == 0) {
                        if ((h.a[var1_1][var2_2] & 255) == 6) {
                            var4_4 &= -449;
                        }
                        if (var11_7 == var7_9) {
                            if (!(var5_5 != 0 && var5_5 != 9 || var6_8 <= 0 || h.f(var1_1, var2_2 + 1))) {
                                h.u(200);
                                this.E(14);
                                this.bj = 10;
                                if (var5_5 == 9 && this.aT > 0 && this.d(var1_1, var2_2)) {
                                    this.a(1, 0, 0);
                                    this.C();
                                }
                                v5 = h.j(var1_1, var2_2 + 1);
                                var16_15 = (int)v5;
                                if (!v5) {
                                    var4_4 = var4_4 & -449 | 64;
                                }
                            }
                            h.c[var1_1][var2_2] = 30;
                            if (!this.d(var1_1, var8_10)) {
                                var4_4 = var4_4 & -8 | 0;
                            }
                        }
                    }
                }
                h.b[var1_1][var2_2] = var3_3;
                h.b[var1_1][var2_2] = var4_4;
                break block59;
            }
            var16_15 = 0;
            var17_16 = 0;
            if (var11_7 == 4) {
                v6 = -1;
            } else if (var11_7 == 2) {
                v6 = var16_15 = 1;
            }
            if (h.f(var1_1, var8_10) && !this.d(var1_1, var8_10)) {
                if ((var3_3 = (int)(var3_3 - 6)) <= 0) {
                    var3_3 = 0;
                    var4_4 &= -513;
                    var4_4 = var4_4 & -8 | 0;
                }
                h.b[var1_1][var2_2] = var3_3;
                h.b[var1_1][var2_2] = var4_4;
                h.c[var1_1][var2_2] = 24;
            } else if (h.f(var1_1 + var16_15, var2_2) && !this.d(var1_1 + var16_15, var2_2) && h.f(var1_1 + var16_15, var8_10) && !this.d(var1_1 + var16_15, var8_10) && (h.b[var1_1][var8_10] & 512) == 0) {
                if (var3_3 >= 6 || (h.aN & 3) == 0) {
                    var3_3 = (byte)(var3_3 + 1);
                }
                if (var3_3 >= 12) {
                    var4_4 &= -513;
                    if (var16_15 != 0) {
                        var3_3 = 6;
                        h.a[var1_1][var2_2] = -1;
                        if (h.f(var1_1 + var16_15, var8_10)) {
                            var3_3 = 12;
                            var4_4 = var4_4 & -8 | var7_9;
                            var17_16 = var6_8;
                        }
                    } else {
                        var4_4 = var4_4 & -8 | 0;
                        var3_3 = 0;
                    }
                    h.b[var1_1 + var16_15][var2_2 + var17_16] = var4_4 | -2147483648;
                    h.b[var1_1 + var16_15][var2_2 + var17_16] = var3_3;
                    h.a[var1_1 + var16_15][var2_2 + var17_16] = var5_5;
                    h.q(var1_1, var2_2);
                    h.c[var1_1][var2_2 + 2 * var6_8] = 24;
                } else {
                    h.b[var1_1][var2_2] = var3_3;
                    h.b[var1_1][var2_2] = var4_4;
                    h.c[var1_1][var2_2] = 24;
                }
            } else {
                if ((var3_3 = (int)(var3_3 - 6)) <= 0) {
                    var3_3 = 0;
                    var4_4 &= -513;
                    var4_4 = var4_4 & -8 | 0;
                }
                h.b[var1_1][var2_2] = var3_3;
                h.b[var1_1][var2_2] = var4_4;
                h.c[var1_1][var2_2] = 24;
                this.c(var1_1, var2_2);
            }
        }
        var16_15 = var4_4 & 0x20000000;
        var17_16 = h.b[var1_1][var2_2];
        var18_17 = var4_4 & 0x40000000;
        var19_18 = 0;
        if (var16_15 == 0 && var17_16 != 0 || var18_17 == 0 && var10_6) {
            this.b(var1_1, var2_2);
        }
        if (var16_15 != 0 && var17_16 == 0 || var18_17 != 0 && !var10_6) {
            this.c(var1_1, var2_2);
        }
        var19_18 = (var4_4 & 512) != 0 ? 1 : (var17_16 != 0 || var16_15 != 0 ? 2 : (var10_6 != false ? 3 : (h.a[var1_1][var2_2] > -1 && h.a[var1_1][var2_2] < 38 ? 4 : ((h.f(var1_1 - 1, var2_2) != false || h.f(var1_1 + 1, var2_2) != false) && h.j(var1_1, var2_2 + 1) != false && (h.b[var1_1][var2_2 + 1] & 7) == 0 && var1_1 != this.bg && var2_2 != this.bh ? 6 : 0))));
        var4_4 = var4_4 & -536870913 | (var17_16 != 0 ? 0x20000000 : 0);
        var4_4 = var4_4 & -1073741825 | (var10_6 != false ? 0x40000000 : 0);
        h.b[var1_1][var2_2] = var4_4 = var4_4 & 0x7FFFFFFF | (var19_18 != 0 ? -2147483648 : 0);
        var20_19 = ((h.b[var1_1][var2_2] & 448) >> 6) - 1;
        if (var20_19 >= 0 && var20_19 < 5) {
            h.b[var1_1][var2_2] = h.b[var1_1][var2_2] & -449 | h.b[var1_1][var2_2] + 64 & 448;
        }
    }

    private void r(int n, int n2) {
        this.d(n, n2, 3);
        ++this.aZ;
        h.a[n][n2] = -1;
        --this.P;
        this.bi = 0;
        if (this.P == 0) {
            h.a[this.Q][this.R] = -1;
        }
        if (a[n][n2 - 1] == -1) {
            this.b(n, n2 - 1);
        }
        this.b(n, n2);
        this.C();
    }

    private static a a(String string, int n, int n2, int n3) {
        a a2 = null;
        try {
            a2 = new a();
            byte[] byArray = h.a(string, n);
            a2.a(byArray, 0);
            for (int i = n2; i <= n3; ++i) {
                a2.a(i, 0, -1, -1);
            }
            a2.b = n2;
            a2.g = null;
            System.gc();
        }
        catch (Exception exception) {}
        return a2;
    }

    public static a a(String string, int n) {
        return h.a(string, n, 0);
    }

    private static a a(String string, int n, int n2) {
        return h.a(string, n, n2, n2);
    }

    private static Image[] a(String string, int n) {
        return h.a(string, n, 0);
    }

    private static Image[] a(String string, int n, int n2) {
        a a2 = null;
        try {
            a2 = new a();
            byte[] byArray = h.a(string, n);
            a2.a(byArray, 0);
            a2.a(n2, 0, -1, -1);
            h.a(a2, false);
            System.gc();
        }
        catch (Exception exception) {}
        return a2.a[n2];
    }

    private static Image a(String string, int n) {
        Image image = null;
        try {
            byte[] byArray = h.a(string, n);
            image = Image.createImage(byArray, 0, byArray.length);
            System.gc();
        }
        catch (Exception exception) {}
        return image;
    }

    public static byte[] a(String string, int n) {
        byte[] byArray = null;
        InputStream inputStream = string.getClass().getResourceAsStream(string);
        try {
            int n2 = inputStream.read() << 3;
            byArray = new byte[n2];
            inputStream.read(byArray);
            int n3 = h.b(byArray, n << 3);
            int n4 = h.b(byArray, (n << 3) + 4);
            inputStream.skip(n3);
            byArray = new byte[n4];
            inputStream.read(byArray);
            inputStream.close();
        }
        catch (Exception exception) {}
        return byArray;
    }

    private void cj() {
        if (a.h == null) {
            InputStream inputStream = this.getClass().getResourceAsStream("/mc");
            a.h = new byte[256];
            try {
                inputStream.read(a.h);
                inputStream.close();
                return;
            }
            catch (Exception exception) {}
        }
    }

    public static final int a(a a2, String string, int n) {
        int n2;
        if (n != -1 && (n2 = string.indexOf(10)) != -1) {
            string = string.substring(0, n2);
        }
        if ((n2 = string.indexOf(125)) != -1) {
            string = string.substring(0, n2);
        }
        a2.a(string);
        return a.c;
    }

    public static int a(a a2) {
        return a2.e + (a2.a[1] & 0xFF);
    }

    public static void b(int n) {
        e.c = n;
    }

    private boolean a(Graphics graphics) {
        ++e.b;
        switch (e.c) {
            case 0: {
                this.B();
                this.a = new e();
                this.ck();
                this.cK();
                h.b(1);
                this.an = false;
                break;
            }
            case 1: {
                e.a();
                W = false;
                break;
            }
            case 2: {
                e.b();
                this.B();
                l = (byte)9;
                this.br = 8;
                this.bs = 0;
                break;
            }
            case 3: {
                this.a.a(graphics);
                break;
            }
            case 4: {
                h.b(0);
                this.a = null;
                System.gc();
                return false;
            }
        }
        return true;
    }

    private void ck() {
        if ((j[0] & 1) == 0) {
            this.an = true;
            j[0] = (byte)(j[0] | 1);
            this.J();
        }
    }

    private static int a(InputStream inputStream) throws IOException {
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
            case 42: {
                return 256;
            }
            case 35: {
                return 512;
            }
            case 48: {
                return 1024;
            }
            case 49: {
                return 2048;
            }
            case 50: {
                return 4096;
            }
            case 51: {
                return 8192;
            }
            case 52: {
                return 16384;
            }
            case 53: {
                return 32768;
            }
            case 54: {
                return 65536;
            }
            case 55: {
                return 131072;
            }
            case 56: {
                return 262144;
            }
            case 57: {
                return 524288;
            }
        }
        return 0;
    }

    private void cl() {
        if (!this.j) {
            return;
        }
        if (f == null) {
            f = new int[this.av][this.aw];
        }
        for (int i = 0; i < this.av; ++i) {
            System.arraycopy(e[i], 0, f[i], 0, this.aw);
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
        this.dD = this.dt;
        this.dE = this.du;
        this.dF = this.dv;
        this.z = this.v;
        this.dG = this.dy;
        this.dH = this.dz;
        this.dI = this.dA;
        this.A = this.w;
        this.dJ = this.dB;
        this.dK = this.dC;
        ap = this.ao;
        this.dL = this.dw;
        this.dM = this.dx;
    }

    private void cm() {
        this.ao = ap;
        this.dw = this.dL;
        this.dx = this.dM;
        for (int i = 0; i < this.av; ++i) {
            System.arraycopy(f[i], 0, e[i], 0, this.aw);
        }
        System.arraycopy(c, 0, a, 0, a.length);
        System.arraycopy(d, 0, b, 0, b.length);
        this.x = this.y;
        this.dt = this.dD;
        this.du = this.dE;
        this.dv = this.dF;
        this.v = this.z;
        this.dy = this.dG;
        this.dz = this.dH;
        this.dA = this.dI;
        this.w = this.A;
        this.dB = this.dJ;
        this.dC = this.dK;
    }

    private void cn() {
        if (this.j) {
            this.co();
            e = new int[this.av][this.aw];
            this.bD();
        }
    }

    private void co() {
        if (this.j) {
            a = new long[15];
            c = new long[15];
            b = new long[15];
            d = new long[15];
            this.x = (byte)3;
            this.ao = true;
            this.dt = -1;
            this.du = 0;
            this.dv = 0;
            this.v = 0;
            this.dy = 0;
            this.dz = 0;
            this.dA = 0;
            this.w = 0;
            this.dB = 0;
            this.dC = -1;
            this.dw = 0;
            this.dx = 0;
        }
    }

    private byte a(byte by, byte by2, byte by3, byte by4) {
        byte by5;
        byte by6 = by5 = 0;
        while (by6 < 15 && h.a(by5, (byte)0, (byte)4) != 0) {
            by6 = (byte)(by5 + 1);
        }
        if (by5 < 15) {
            this.a(by5, (byte)1, (byte)0, (byte)4);
            this.a(by5, by4, (byte)4, (byte)2);
            this.a(by5, by, (byte)6, (byte)7);
            this.a(by5, by, (byte)27, (byte)7);
            this.a(by5, by2, (byte)13, (byte)7);
            this.a(by5, by3, (byte)20, (byte)7);
            return by5;
        }
        return -1;
    }

    private static int a(int n, byte by, byte by2, byte by3) {
        n >>>= by * 9 + by2;
        return n &= ~(-1 << by3);
    }

    private void a(int n, int n2, byte by, byte n3, byte by2, byte by3) {
        int n4 = e[n][n2];
        int n5 = h.a(n4, by, by2, by3);
        byte by4 = (byte)(by * 9 + by2);
        n4 ^= (n5 <<= by4);
        int n6 = n3;
        h.e[n][n2] = n4 |= (n6 <<= by4);
        h.c[n][n2] = 24;
        h.c[n][n2 + 1] = 24;
    }

    private static int a(int n, byte by, byte by2) {
        return (int)(a[n - 1] >>> by & (-1L << by2 ^ 0xFFFFFFFFFFFFFFFFL));
    }

    private void a(int n, byte by, byte by2, byte by3) {
        long l = h.a(n, by2, by3);
        long l2 = a[--n];
        l2 ^= (l <<= by2);
        long l3 = by;
        h.a[n] = l2 |= (l3 <<= by2);
    }

    private static int a(byte by, byte by2, byte by3) {
        long l = b[by];
        l >>>= by2;
        return (int)(l &= -1L << by3 ^ 0xFFFFFFFFFFFFFFFFL);
    }

    private void a(byte by, byte n, byte by2, byte by3) {
        long l = h.a(by, by2, by3);
        long l2 = b[by];
        l2 ^= (l <<= by2);
        int n2 = n;
        h.b[by] = l2 |= (long)(n2 <<= by2);
    }

    private byte b(int n, int n2) {
        byte by;
        byte by2 = by = 0;
        while (by2 < 15) {
            if (n == h.a(by, (byte)13, (byte)7) && n2 == h.a(by, (byte)20, (byte)7)) {
                return by;
            }
            by2 = (byte)(by + 1);
        }
        return -1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private byte a(int n, int n2, byte by) {
        int n3 = this.b(n, n2);
        if (n3 < 0) return -1;
        this.a((byte)n3, by, (byte)0, (byte)4);
        switch (by) {
            case 3: {
                return (byte)39;
            }
            case 1: {
                return (byte)38;
            }
            case 2: {
                return (byte)39;
            }
        }
        return (byte)n3;
    }

    private void cp() {
        if (!this.j) {
            return;
        }
        if (this.dt >= 0 && this.dC >= 0) {
            ++this.dt;
            this.cr();
        }
        switch (this.x) {
            case 2: {
                byte by;
                byte by2 = by = 1;
                while (by2 <= 15) {
                    switch (h.a((int)by, (byte)28, (byte)3)) {
                        case 3: {
                            h.f(by);
                            break;
                        }
                        case 2: {
                            if (this.dC < 0) break;
                            ++this.dC;
                            this.g(by);
                            break;
                        }
                        case 1: 
                        case 6: 
                        case 7: {
                            this.h(by);
                        }
                    }
                    by2 = (byte)(by + 1);
                }
                break;
            }
            case 1: {
                this.x = (byte)2;
                return;
            }
            case 4: {
                this.cq();
                this.x = (byte)2;
                return;
            }
            case 5: {
                this.u(this.dy, this.dz);
            }
        }
    }

    private static void f(byte by) {
        h.a[by - 1] = 0L;
    }

    /*
     * Unable to fully structure code
     */
    private void cq() {
        v0 = var1_1 = 0;
        while (v0 < 15) {
            block6: {
                if (h.a(var1_1, (byte)0, (byte)4) != 3) break block6;
                var2_2 = h.a(var1_1, (byte)13, (byte)7);
                var3_3 = h.a(var1_1, (byte)20, (byte)7);
                var4_4 = h.a(var1_1, (byte)4, (byte)2);
                h.b[var1_1] = 0L;
                var5_5 = 0;
                var6_6 = 0;
                switch (var4_4) {
                    case 0: {
                        ++var3_3;
                        var5_5 = 0;
                        v1 = 0;
                        ** GOTO lbl25
                    }
                    case 1: {
                        ++var2_2;
                        v2 = 1;
                        ** GOTO lbl23
                    }
                    case 2: {
                        --var2_2;
                        v2 = -1;
lbl23:
                        // 2 sources

                        var5_5 = v2;
                        v1 = 2;
lbl25:
                        // 2 sources

                        var6_6 = v1;
                    }
                }
                this.a(var2_2, var3_3, (byte)7, var5_5, var6_6, this.b(var2_2, var3_3));
            }
            v0 = (byte)(var1_1 + 1);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void cr() {
        var2_2 = h.a((int)this.w, (byte)20, (byte)6);
        var3_3 = h.a((int)this.w, (byte)47, (byte)2);
        switch (var3_3) {
            case 1: {
                if (var2_2 == this.dB) {
                    this.dt = -1;
                    this.dC = -1;
                    h.f(this.w);
                    this.x = (byte)4;
                    return;
                }
                var4_4 = (byte)h.a((int)this.w, (byte)49, (byte)5);
                if (this.dt == 0 || this.dt % var4_4 != 0) break;
                this.dt = 0;
                var5_6 = (byte)h.a((int)this.w, (byte)26, (byte)2);
                if (var5_6 < 0) break;
                v0 = var6_8 = 0;
                while (v0 < var4_4) {
                    h.c(var1_1 - var6_8, var2_2, var5_6);
                    var7_10 = var5_6;
                    var8_12 = var2_2;
                    var7_10 = (byte)(var7_10 + 1);
                    if (var7_10 > 2) {
                        var7_10 = 0;
                        ++var8_12;
                    }
                    var9_13 = h.a(h.e[var1_1 - var6_8][var8_12], var7_10, (byte)3, (byte)4);
                    if (var8_12 != this.dB || var5_6 != 2 ? var9_13 != 12 && var9_13 != 9 : var9_13 != 0 && var9_13 != 3) {
                        this.a(var1_1 - var6_8, var8_12, var7_10, (byte)7, (byte)3, (byte)4);
                    }
                    v0 = (byte)(var6_8 + 1);
                }
                if (var5_6 == 2) {
                    this.a((int)this.w, (byte)0, (byte)47, (byte)2);
                    this.a((int)this.w, (byte)0, (byte)26, (byte)2);
                    v1 = this;
                    v2 = this.w;
                    v3 = (byte)(++var2_2);
                    v4 = 20;
                    v5 = 6;
                } else {
                    v1 = this;
                    v2 = this.w;
                    v3 = var5_6 = (byte)(var5_6 + 1);
                    v4 = 26;
                    v5 = 2;
                }
                ** GOTO lbl85
            }
            case 0: {
                this.a((int)this.w, (byte)1, (byte)47, (byte)2);
                var4_5 = h.a((int)this.w, (byte)49, (byte)5);
                var5_7 = (byte)h.a((int)this.w, (byte)45, (byte)2);
                var6_9 = 0;
                if (var5_7 != 0) {
                    if (var5_7 == 2) {
                        for (var1_1 = h.a((int)this.w, 14, 6); var1_1 >= this.dy && (byte)(h.a[var1_1 + 1][var2_2] - 80) < 0 && h.a[var1_1 + 1][var2_2] != 10 && h.a[var1_1 + 1][var2_2] != 37 && h.a[var1_1 + 1][var2_2] != 34 && h.a[var1_1 + 1][var2_2] != 35; ++var1_1) {
                        }
                    } else {
                        while (var1_1 <= this.dy && (byte)(h.a[var1_1 + 1][var2_2] - 80) < 0 && h.a[var1_1 + 1][var2_2] != 10 && h.a[var1_1 + 1][var2_2] != 37 && h.a[var1_1 + 1][var2_2] != 34 && h.a[var1_1 + 1][var2_2] != 35) {
                            ++var1_1;
                        }
                    }
                } else if ((byte)(h.a[var1_1 + 1][var2_2] - 80) < 0 && h.a[var1_1 + 1][var2_2] != 10 && h.a[var1_1 + 1][var2_2] != 37 && h.a[var1_1 + 1][var2_2] != 34 && h.a[var1_1 + 1][var2_2] != 35) {
                    while ((byte)(h.a[var1_1 + 1][var2_2] - 80) < 0 && h.a[var1_1 + 1][var2_2] != 10 && h.a[var1_1 + 1][var2_2] != 37 && h.a[var1_1 + 1][var2_2] != 34 && h.a[var1_1 + 1][var2_2] != 35) {
                        ++var1_1;
                    }
                } else {
                    while (var6_9 < var4_5) {
                        ++var6_9;
                        if ((byte)(h.a[var1_1][var2_2] - 80) < 0 && h.a[var1_1][var2_2] != 10 && h.a[var1_1][var2_2] != 37 && h.a[var1_1][var2_2] != 34 && h.a[var1_1][var2_2] != 35) {
                            var6_9 = var4_5;
                            continue;
                        }
                        --var1_1;
                    }
                }
                if (this.dA != 2 && var1_1 <= this.dy) {
                    while ((byte)(h.a[var1_1 + 1][var2_2] - 80) < 0 && h.a[var1_1 + 1][var2_2] != 10 && h.a[var1_1 + 1][var2_2] != 37 && h.a[var1_1 + 1][var2_2] != 34 && h.a[var1_1 + 1][var2_2] != 35) {
                        ++var1_1;
                    }
                }
                this.a((int)this.w, (byte)var1_1, (byte)14, (byte)6);
                v6 = 1;
                while ((byte)(h.a[var1_1 - (var7_11 = v6)][var2_2] - 80) < 0 && h.a[var1_1 - var7_11][var2_2] != 10 && h.a[var1_1 - var7_11][var2_2] != 37 && h.a[var1_1 - var7_11][var2_2] != 34 && h.a[var1_1 - var7_11][var2_2] != 35) {
                    v6 = (byte)(var7_11 + 1);
                }
                v1 = this;
                v2 = this.w;
                v3 = (byte)var7_11;
                v4 = 49;
                v5 = 5;
lbl85:
                // 3 sources

                v1.a((int)v2, v3, (byte)v4, (byte)v5);
            }
        }
    }

    private void g(byte by) {
        int n = h.a((int)by, (byte)14, (byte)6);
        int n2 = h.a((int)by, (byte)20, (byte)6);
        int n3 = h.a((int)by, (byte)0, (byte)7);
        int n4 = h.a((int)by, (byte)7, (byte)7);
        int n5 = h.a((int)by, (byte)47, (byte)2);
        byte by2 = (byte)h.a((int)by, (byte)54, (byte)3);
        byte by3 = (byte)h.a(by2, (byte)6, (byte)7);
        switch (n5) {
            case 1: {
                byte by4 = (byte)h.a((int)by, (byte)49, (byte)5);
                if (this.dC == 0 || this.dC % by4 != 0) break;
                this.dC = 0;
                byte by5 = (byte)h.a((int)by, (byte)26, (byte)2);
                byte by6 = (byte)h.a((int)by, (byte)57, (byte)1);
                if (by5 < 0) break;
                if (by6 != 1) {
                    byte by7;
                    byte by8 = by7 = 0;
                    while (by8 < by4) {
                        this.a(n - by7, n2, by5, (byte)7, (byte)3, (byte)4);
                        this.a((int)by, by5, (byte)43, (byte)2);
                        this.a(n - by7, n2, by5, by, (byte)0, (byte)3);
                        by8 = (byte)(by7 + 1);
                    }
                    if (this.du > 0) {
                        byte by9;
                        by7 = by5;
                        int n6 = n2;
                        if ((by7 = (byte)(by7 + 1)) > 2) {
                            by7 = 0;
                            ++n6;
                        }
                        byte by10 = by9 = 0;
                        while (by10 < by4) {
                            if ((byte)(a[n - by9][n6] - 80) < 0 && a[n - by9][n6] != 10 && a[n - by9][n6] != 37 && a[n - by9][n6] != 34 && a[n - by9][n6] != 35) {
                                this.a(n - by9, n6, by7, (byte)8, (byte)3, (byte)4);
                            }
                            by10 = (byte)(by9 + 1);
                        }
                    }
                    ++this.du;
                }
                if (by6 == 1 || (n4 >= n3 || by3 == 0) && by5 == this.v) {
                    if (by6 == 1) {
                        this.a((int)by, (byte)0, (byte)57, (byte)1);
                    }
                    this.a((int)by, (byte)3, (byte)28, (byte)3);
                    if (by3 == 0) {
                        this.a(by2, (byte)3, (byte)0, (byte)4);
                        this.a((int)by, (byte)5, (byte)28, (byte)3);
                        if (this.dt == -1) {
                            this.dC = -1;
                            this.x = (byte)4;
                        }
                        return;
                    }
                }
                if (by5 == 0) {
                    this.a((int)by, (byte)0, (byte)47, (byte)2);
                    this.a((int)by, (byte)2, (byte)26, (byte)2);
                    return;
                }
                by5 = (byte)(by5 - 1);
                this.a((int)by, by5, (byte)26, (byte)2);
                return;
            }
            case 0: {
                byte by11;
                boolean bl;
                int n7;
                byte by12;
                this.a((int)by, (byte)1, (byte)47, (byte)2);
                this.a((int)by, (byte)(--n2), (byte)20, (byte)6);
                boolean bl2 = false;
                if ((byte)(a[n][n2] - 80) >= 0 || a[n][n2] == 10 || a[n][n2] == 37 || a[n][n2] == 34 || a[n][n2] == 35) {
                    while ((byte)(a[n][n2] - 80) >= 0 || a[n][n2] == 10 || a[n][n2] == 37 || a[n][n2] == 34 || a[n][n2] == 35) {
                        n += -1;
                    }
                } else {
                    while ((byte)(a[n + 1][n2] - 80) < 0 && a[n + 1][n2] != 10 && a[n + 1][n2] != 37 && a[n + 1][n2] != 34 && a[n + 1][n2] != 35) {
                        ++n;
                    }
                }
                this.a((int)by, (byte)n, (byte)14, (byte)6);
                byte by13 = 1;
                while ((byte)(a[n - (by12 = by13)][n2] - 80) < 0 && a[n - by12][n2] != 10 && a[n - by12][n2] != 37 && a[n - by12][n2] != 34 && a[n - by12][n2] != 35) {
                    by13 = (byte)(by12 + 1);
                }
                this.a((int)by, by12, (byte)49, (byte)5);
                int n8 = by3 - by12;
                byte by14 = 0;
                this.v = 0;
                if (n8 < 0) {
                    n7 = -n8;
                    n7 *= 3;
                    byte by15 = 0;
                    int n9 = by12 + n8;
                    if (n9 * 3 - by12 != 0 && (n9 *= 3) <= by12 * 3 / 2) {
                        by15 = 1;
                    }
                    this.v = (byte)(n7 /= by12);
                    this.v = (byte)(this.v + by15);
                    if (this.v > 2) {
                        this.a((int)by, (byte)1, (byte)57, (byte)1);
                    }
                    by14 = (byte)Math.abs(n8);
                    bl = false;
                }
                if ((n4 += by12 - by14) > n3) {
                    n7 = n3 - n4;
                    n4 += n7;
                    by11 = (byte)(bl - n7);
                }
                this.a((int)by, (byte)n4, (byte)7, (byte)7);
                this.a(by2, by11, (byte)6, (byte)7);
            }
        }
    }

    private byte a(byte by, int n, int n2, byte by2, byte by3, byte by4, boolean bl) {
        byte by5 = 0;
        if ((byte)(a[n + by4][n2] - 80) >= 0 || a[n + by4][n2] == 10 || a[n + by4][n2] == 37 || a[n + by4][n2] == 34 || a[n + by4][n2] == 35) {
            by5 = -2;
        } else {
            by5 = by4;
            if (by2 != by4) {
                this.a((int)by, by4 < 0 ? (byte)2 : (byte)by4, (byte)45, (byte)2);
            }
            this.a((int)by, (byte)(n += by4), (byte)31, (byte)6);
            this.a(n, n2, by3, by, (byte)0, (byte)3);
            if (bl) {
                h.c(n, n2, by3);
            } else {
                int n3;
                byte by6;
                int n4;
                int n5;
                h h2;
                int n6;
                int n7 = 0;
                int n8 = 0;
                int n9 = h.a((int)by, (byte)28, (byte)3);
                if (by4 > 0) {
                    n7 = n9 == 6 && this.dy == n && this.dz == n2 ? 11 : 4;
                    n6 = 9;
                } else {
                    n7 = n9 == 6 && this.dy == n && this.dz == n2 ? 14 : 5;
                    n6 = n8 = 12;
                }
                if ((byte)(a[n][n2 + 1] - 80) >= 0 || a[n + by4][n2] == 10 || a[n + by4][n2] == 37 || a[n + by4][n2] == 34 || a[n + by4][n2] == 35) {
                    h2 = this;
                    n5 = n;
                    n4 = n2;
                    by6 = by3;
                    n3 = n7;
                } else {
                    h2 = this;
                    n5 = n;
                    n4 = n2;
                    by6 = by3;
                    n3 = n8;
                }
                h2.a(n5, n4, by6, (byte)n3, (byte)3, (byte)4);
            }
        }
        return by5;
    }

    private boolean d(int n) {
        return n != -1 && h.a(n, (byte)6, (byte)1) == 1;
    }

    private static byte a(int n, byte by, byte by2) {
        return (byte)(n >>> by & ~(0xFFFFFF << by2));
    }

    private static boolean a(int n, int n2, int n3) {
        boolean bl;
        boolean bl2 = true;
        boolean bl3 = bl = true;
        while (bl) {
            bl = true;
            n -= n3;
            if (n3 == 0) {
                if ((byte)(a[n - 1][n2] - 80) < 0 && a[n - 1][n2] != 10 && a[n - 1][n2] != 37 && a[n - 1][n2] != 34 && (a[n - 1][n2] != 35 || (byte)(a[n + 1][n2] - 80) < 0) && a[n + 1][n2] != 10 && a[n + 1][n2] != 37 && a[n + 1][n2] != 34 && a[n + 1][n2] != 35) continue;
                bl2 = true;
                bl3 = false;
                continue;
            }
            if ((byte)(a[n][n2 + 1] - 80) < 0 && a[n][n2 + 1] != 10 && a[n][n2 + 1] != 37 && a[n][n2 + 1] != 34 && a[n][n2 + 1] != 35) {
                bl = false;
            }
            if ((byte)(a[n][n2] - 80) >= 0 || a[n][n2] == 10 || a[n][n2] == 37 || a[n][n2] == 34 || a[n][n2] == 35) {
                bl2 = bl;
                bl3 = false;
                continue;
            }
            if (bl) continue;
            return bl;
        }
        return bl2;
    }

    private void h(byte by) {
        int n;
        boolean bl;
        int n2;
        byte by2;
        byte by3;
        int n3;
        int n4;
        block19: {
            block20: {
                byte by4;
                block24: {
                    int n5;
                    byte by5;
                    int n6;
                    int n7;
                    int n8;
                    byte by6;
                    h h2;
                    block23: {
                        block21: {
                            block22: {
                                n4 = h.a((int)by, (byte)31, (byte)6);
                                n3 = h.a((int)by, (byte)37, (byte)6);
                                by3 = (byte)h.a((int)by, (byte)43, (byte)2);
                                by2 = (byte)h.a(e[n4][n3], by3, (byte)7, (byte)2);
                                n2 = h.a((int)by, (byte)45, (byte)2);
                                byte by7 = (byte)h.a((int)by, (byte)28, (byte)3);
                                bl = by7 == 7;
                                n = 0;
                                if (n2 > 1) {
                                    n2 = -1;
                                }
                                if (by2 == 0) {
                                    by4 = (byte)(by3 + 1);
                                    int n9 = n3;
                                    if (by3 == 2) {
                                        by4 = 0;
                                        n9 = n3 + 1;
                                    }
                                    if (h.a(e[n4][n9], by4, (byte)3, (byte)4) == 7) {
                                        this.du = 1;
                                        if (bl) {
                                            h.f(by);
                                            this.x = (byte)3;
                                            this.ao = true;
                                            return;
                                        }
                                        int n10 = by4 - 1;
                                        if (n10 < 0) {
                                            n10 = 2;
                                        }
                                        this.dC = 0;
                                        byte by8 = (byte)h.a(e[n4][n9], by4, (byte)0, (byte)3);
                                        byte by9 = (byte)h.a((int)by, (byte)54, (byte)3);
                                        this.a((int)by8, by9, (byte)54, (byte)3);
                                        this.a((int)by8, (byte)2, (byte)28, (byte)3);
                                        this.a((int)by8, (byte)0, (byte)47, (byte)2);
                                        this.a((int)by8, (byte)n10, (byte)26, (byte)2);
                                        this.a((int)by8, (byte)n4, (byte)14, (byte)6);
                                        this.a((int)by8, (byte)n9, (byte)20, (byte)6);
                                        this.a((int)by8, (byte)0, (byte)57, (byte)1);
                                        h.f(by);
                                        return;
                                    }
                                }
                                if (by3 != 2 || by2 != 0) break block19;
                                if ((byte)(a[n4][n3 + 1] - 80) < 0 && a[n4][n3 + 1] != 10 && a[n4][n3 + 1] != 37 && a[n4][n3 + 1] != 34 && a[n4][n3 + 1] != 35) break block20;
                                if (n2 != 0) break block21;
                                if (bl) {
                                    h.c(n4, n3, by3);
                                } else {
                                    this.a(n4, n3, by3, (byte)15, (byte)3, (byte)4);
                                }
                                n = this.a(by, n4, n3, (byte)n2, by3, (byte)1, bl);
                                if (n >= 0) break block22;
                                h2 = this;
                                by6 = by;
                                n8 = n4;
                                n7 = n3;
                                n6 = n2;
                                by5 = by3;
                                n5 = -1;
                                break block23;
                            }
                            if ((byte)(a[n4 + -1][n3] - 80) < 0 && a[n4 + -1][n3] != 10 && a[n4 + -1][n3] != 37 && a[n4 + -1][n3] != 34 && a[n4 + -1][n3] != 35) {
                                this.a(n4 - 1, n3, bl ? (byte)7 : 5, (byte)-1, (byte)2, (byte)h.a((int)by, (byte)54, (byte)3));
                            }
                            break block24;
                        }
                        h2 = this;
                        by6 = by;
                        n8 = n4;
                        n7 = n3;
                        n6 = n2;
                        by5 = by3;
                        n5 = n2;
                    }
                    n = h2.a(by6, n8, n7, (byte)n6, by5, (byte)n5, bl);
                }
                if (n == -2) {
                    int n11;
                    int n12;
                    byte by10;
                    byte by11;
                    h h3;
                    by4 = b[n4][n3 + 1];
                    if (this.d((int)by4) && h.a(n4, n3, n2)) {
                        this.du = 0;
                        this.dC = 0;
                        this.a((int)by, (byte)2, (byte)28, (byte)3);
                        this.a((int)by, h.a((int)by4, (byte)0, (byte)6), (byte)0, (byte)7);
                        this.a((int)by, (byte)2, (byte)26, (byte)2);
                        this.a((int)by, (byte)n4, (byte)14, (byte)6);
                        h3 = this;
                        by11 = by;
                        by10 = (byte)(n3 + 1);
                        n12 = 20;
                        n11 = 6;
                    } else {
                        h3 = this;
                        by11 = by;
                        by10 = 3;
                        n12 = 28;
                        n11 = 3;
                    }
                    h3.a((int)by11, by10, (byte)n12, (byte)n11);
                    n4 += n2;
                } else {
                    n2 = n;
                    n4 += n2;
                }
                break block19;
            }
            if (n2 != 0) {
                n2 = 0;
                this.a((int)by, (byte)0, (byte)45, (byte)2);
            }
        }
        if (n != -2) {
            switch (n2) {
                case 0: {
                    this.a(by, n4, n3, by3, bl);
                    return;
                }
                case -1: 
                case 1: {
                    this.a(n4, n3, by3, by2);
                }
            }
        }
    }

    private void a(int n, int n2, byte by, byte by2) {
        if ((by2 = (byte)(by2 + 1)) > 2) {
            by2 = 0;
        }
        this.a(n, n2, by, by2, (byte)7, (byte)2);
    }

    private void a(byte by, int n, int n2, byte by2, boolean bl) {
        byte by3;
        byte by4;
        int n3;
        int n4;
        h h2;
        if (!bl && h.a(e[n][n2], by2, (byte)3, (byte)4) == 0) {
            this.a(n, n2, by2, (byte)3, (byte)3, (byte)4);
        }
        if ((by2 = (byte)(by2 + 1)) > 2) {
            by2 = 0;
            this.a((int)by, (byte)(++n2), (byte)37, (byte)6);
        }
        this.a((int)by, by2, (byte)43, (byte)2);
        if (bl) {
            h2 = this;
            n4 = n;
            n3 = n2;
            by4 = by2;
            by3 = 6;
        } else {
            this.a(n, n2, by2, by, (byte)0, (byte)3);
            h2 = this;
            n4 = n;
            n3 = n2;
            by4 = by2;
            by3 = 0;
        }
        h2.a(n4, n3, by4, by3, (byte)3, (byte)4);
    }

    private void s(int n, int n2) {
        this.x = 1;
        this.a(n, n2 + 1, (byte)0, (byte)0, (byte)0, this.b(n, n2));
    }

    private static void c(int n, int n2, byte by) {
        int n3 = e[n][n2];
        byte by2 = (byte)(by * 9);
        int n4 = n3 >>> by2;
        n4 &= 0x1FF;
        h.e[n][n2] = n3 ^= (n4 <<= by2);
        h.c[n][n2] = 24;
    }

    private byte a(int n, int n2, byte by, byte by2, byte by3, byte by4) {
        byte by5;
        byte by6 = by5 = 1;
        while (by6 <= 15 && h.a((int)by5, (byte)28, (byte)3) != 0) {
            by6 = (byte)(by5 + 1);
        }
        h.a[by5 - 1] = 0L;
        if (by == 7) {
            h.c(n, n2, by3);
            this.a((int)by5, (byte)7, (byte)28, (byte)3);
        } else {
            this.a((int)by5, (byte)1, (byte)28, (byte)3);
            this.a((int)by5, by4, (byte)54, (byte)3);
            this.a(n, n2, by3, by5, (byte)0, (byte)3);
            this.a(n, n2, by3, by, (byte)3, (byte)4);
        }
        this.a((int)by5, (byte)n, (byte)31, (byte)6);
        this.a((int)by5, (byte)n2, (byte)37, (byte)6);
        this.a((int)by5, by3, (byte)43, (byte)2);
        if (by2 < 0) {
            by2 = (byte)2;
        }
        this.a((int)by5, by2, (byte)45, (byte)2);
        return by5;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int a(int n, int n2, int n3, byte by) {
        byte by2 = (byte)h.a(n3, by, (byte)0, (byte)3);
        int n4 = h.a((int)by2, (byte)31, (byte)6);
        int n5 = h.a((int)by2, (byte)37, (byte)6);
        int n6 = h.a((int)by2, (byte)43, (byte)2);
        int n7 = h.a(n3, by, (byte)3, (byte)4);
        if (n4 == n && n5 == n2 && n6 == by) {
            switch (n7) {
                case 4: {
                    return 2;
                }
                case 5: {
                    return 4;
                }
            }
            return n7 << 1;
        }
        switch (n7) {
            case 6: {
                h.c(n, n2, by);
            }
        }
        return n7 << 1;
    }

    private void t(int n, int n2) {
        if (this.j) {
            int n3 = e[n - 1][n2] != 0 ? -1 : (this.dA = e[n + 1][n2] != 0 ? 1 : 0);
            if (this.dA == 0) {
                int n4 = this.dA = e[n][n2 - 1] != 0 ? 2 : 0;
            }
            if (this.dA != 0) {
                this.x = (byte)5;
                this.E(13);
                this.dy = n;
                this.dz = n2;
            }
        }
    }

    private int f(int n, int n2) {
        byte by = 0;
        boolean bl = true;
        int n3 = 0;
        int n4 = this.dA;
        int n5 = 0;
        block0: while (true) {
            int n6 = 0;
            while (e[n + n4][n2 - 1] != 0 && (byte)(a[n][n2] - 80) >= 0 || a[n][n2] == 10 || a[n][n2] == 37 || a[n][n2] == 34 || a[n][n2] == 35) {
                n += n4;
            }
            int n7 = 0;
            while ((byte)(a[n + (n3 = n7)][n2] - 80) < 0 && a[n + n3][n2] != 10 && a[n + n3][n2] != 37 && a[n + n3][n2] != 34 && a[n + n3][n2] != 35) {
                if (bl) {
                    bl = false;
                    by = this.a(n, n2, (byte)8, (byte)-2, (byte)2, (byte)0);
                    this.a((int)by, (byte)5, (byte)28, (byte)3);
                    this.a((int)by, (byte)n, (byte)14, (byte)6);
                    this.a((int)by, (byte)n2, (byte)20, (byte)6);
                }
                this.a(n + n3, n2, (byte)2, by, (byte)0, (byte)3);
                n7 = n3 + n4;
            }
            n3 = Math.abs(n3);
            n5 += n3;
            ++n2;
            while (true) {
                if (e[n][n2] != 0) continue block0;
                if (n6 >= n3 || (n += n4) < 0 || n == this.av) {
                    if (n5 > 0) {
                        this.a((int)by, (byte)n5, (byte)7, (byte)7);
                    }
                    return n5;
                }
                ++n6;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void u(int var1_1, int var2_2) {
        this.dt = 0;
        var3_3 = 0;
        if (this.dA > 1) {
            v0 = h.e[var1_1];
            v1 = var2_2 - 1;
        } else {
            v0 = h.e[var1_1 + this.dA];
            v1 = var2_2;
        }
        var3_3 = v0[v1];
        this.w = (byte)h.a(var3_3, (byte)2, (byte)0, (byte)3);
        this.a((int)this.w, (byte)0, (byte)47, (byte)2);
        var4_4 = h.a((int)this.w, (byte)7, (byte)7);
        var5_5 = 0;
        var6_6 = 0;
        var7_7 = 0;
        var8_8 = 0;
        var9_9 = 0;
        switch (this.dA) {
            case 2: {
                var5_5 = 0;
                var6_6 = var1_1;
                var7_7 = var2_2;
                var8_8 = var4_4;
                var9_9 = var2_2 - 1;
                this.dz = -1;
                this.dy = -1;
                break;
            }
            default: {
                var5_5 = this.dA;
                var6_6 = var1_1 + var5_5;
                var5_5 = var5_5 < 0 ? 1 : 2;
                var7_7 = var2_2 + 1;
                var8_8 = var4_4 - this.f(var6_6, var7_7);
                var9_9 = var2_2;
                this.dy = var1_1;
                this.dz = var2_2;
            }
        }
        this.a((int)this.w, (byte)var5_5, (byte)45, (byte)2);
        this.dB = var7_7;
        this.a((byte)var8_8, (byte)var6_6, (byte)var9_9, (byte)var5_5);
        var10_10 = this.b(var6_6, var9_9);
        this.a(var10_10, (byte)2, (byte)0, (byte)4);
        this.x = 1;
        switch (this.dA) {
            case 2: {
                v2 = this;
                v3 = var6_6;
                v4 = var2_2;
                v5 = 3;
                v6 = 0;
                v7 = 0;
                ** GOTO lbl67
            }
            case 1: {
                v2 = this;
                v3 = var6_6 - 1;
                v4 = var2_2;
                v5 = 14;
                v6 = -1;
                ** GOTO lbl66
            }
            case -1: {
                v2 = this;
                v3 = var6_6 + 1;
                v4 = var2_2;
                v5 = 11;
                v6 = 1;
lbl66:
                // 2 sources

                v7 = 2;
lbl67:
                // 2 sources

                var10_10 = v2.a(v3, v4, v5, v6, v7, var10_10);
            }
        }
        this.a((int)var10_10, (byte)6, (byte)28, (byte)3);
        this.dA = 0;
    }

    private void v(int n, int n2) {
        byte by = this.a(n, n2, (byte)2);
        if (by > 0) {
            h.a[n][n2] = -1;
            this.s(n, n2);
        }
    }

    private static int b(a a2, int n) {
        int n2 = (n << 2) + 3;
        return a2.c[n2] & 0xFF;
    }

    private static int c(a a2, int n) {
        int n2 = (n << 2) + 2;
        return a2.c[n2] & 0xFF;
    }

    private static void B(int n) {
        try {
            a = n <= 5 ? h.a("/tips.f", n) : null;
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h.a("/tipst.f", 0));
            int n2 = byteArrayInputStream.read();
            byte[] byArray = new byte[(n2 + 1) * 2];
            byteArrayInputStream.read(byArray);
            int n3 = h.a(byArray, (n %= n2) << 1);
            int n4 = h.a(byArray, n + 1 << 1);
            byteArrayInputStream.skip(n3);
            f = new byte[n4 - n3];
            byteArrayInputStream.read(f);
            byteArrayInputStream.close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void cs() {
        h.a[41].e = 5;
        int n = 0;
        ++n;
        int n2 = f[0];
        this.R = false;
        Graphics graphics = this.a;
        graphics.setColor(798521);
        graphics.fillRoundRect(20, 60, 200, 200, 8, 8);
        graphics.setColor(13540096);
        graphics.drawRoundRect(20, 60, 200, 200, 8, 8);
        int n3 = 0;
        boolean bl = true;
        for (int i = 0; i <= n2; ++i) {
            block9: {
                int n4;
                int n5;
                block8: {
                    int n6;
                    block7: {
                        byte by;
                        if (i == n2) {
                            if (bl) {
                                bl = false;
                                i = -1;
                                n = 1;
                                n3 -= 4;
                                n3 = 60 + (200 - n3 >> 1);
                                continue;
                            }
                            return;
                        }
                        if ((by = f[n++]) != 0) break block7;
                        n += 2;
                        n6 = h.a(f, n += 2);
                        int n7 = n += 2;
                        n += n6;
                        byte by2 = f[n++];
                        int n8 = n;
                        n += by2;
                        n5 = n3 -= 3;
                        n4 = this.a(graphics, f, a[41], n7, n6, bl ? -1 : n3, a, n8, 192);
                        break block8;
                    }
                    n += 2;
                    n += 2;
                    n6 = f[n++] & 0xFF;
                    if (a == null) break block9;
                    if (!bl) {
                        a.a(graphics, n6, (240 - h.a.c[(n6 << 2) + 2] & 0xFF) >> 1, n3, 0, 0, 0);
                    }
                    n5 = n3;
                    n4 = h.a.c[(n6 << 2) + 3] & 0xFF;
                }
                n3 = n5 + n4;
            }
            n3 += 4;
        }
    }

    private static void a(Graphics graphics, a a2, String string, int n, int n2, int n3, int n4, boolean bl) {
        int n5;
        int n6;
        int n7;
        int n8;
        block12: {
            int n9;
            int n10;
            block11: {
                block10: {
                    block9: {
                        int n11;
                        int n12;
                        block8: {
                            block7: {
                                a2.e = n4;
                                if (string.endsWith("\n")) {
                                    string = string.substring(0, string.length() - 1);
                                }
                                string = h.a(string, 230);
                                n8 = h.a(a2, string, bl ? -1 : 0);
                                n7 = a2.a(string);
                                n6 = n;
                                n5 = n2;
                                if ((n3 & 0x20) == 0) break block7;
                                n12 = n5;
                                n11 = n7;
                                break block8;
                            }
                            if ((n3 & 2) == 0) break block9;
                            n12 = n5;
                            n11 = n7 >> 1;
                        }
                        n5 = n12 - n11;
                    }
                    if ((n3 & 8) == 0) break block10;
                    n10 = n6;
                    n9 = n8;
                    break block11;
                }
                if ((n3 & 1) == 0) break block12;
                n10 = n6;
                n9 = n8 >> 1;
            }
            n6 = n10 - n9;
        }
        graphics.setColor(798521);
        graphics.fillRoundRect(n6 - 5, n5 - 5, n8 + 10, n7 + 10, 10, 10);
        graphics.setColor(13540096);
        graphics.drawRoundRect(n6 - 5, n5 - 5, n8 + 10, n7 + 10, 10, 10);
        a2.b(graphics, string, n, n2, n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private int a(Graphics graphics, byte[] byArray, a a2, int n, int n2, int n3, a a3, int n4, int n5) {
        int n6 = 0;
        int n7 = a2.e + (a2.a[1] & 0xFF);
        int n8 = 0;
        int n9 = n3 -= a2.d[2];
        boolean bl = n3 != -1;
        int n10 = a2.b;
        int n11 = n;
        boolean bl2 = true;
        int n12 = n;
        int n13 = 0;
        int n14 = n;
        while (true) {
            block17: {
                int n15;
                int n16;
                block23: {
                    int n17;
                    int n18;
                    int n19;
                    byte[] byArray2;
                    int n20;
                    int n21;
                    block21: {
                        block24: {
                            block22: {
                                block19: {
                                    block20: {
                                        block18: {
                                            block16: {
                                                if (n14 > n + n2) {
                                                    a2.b = n10;
                                                    return n9 - n3;
                                                }
                                                n21 = 10;
                                                if (n14 < n + n2) {
                                                    n21 = byArray[n14] & 0xFF;
                                                }
                                                if (!bl2 || n8 <= n5) break block16;
                                                n8 = n13;
                                                byArray[n12] = 10;
                                                n14 = n12 - 1;
                                                break block17;
                                            }
                                            if (n21 != 10) break block18;
                                            if (bl2 && bl) {
                                                n8 = 120 - (n8 >> 1);
                                                n14 = n11 - 1;
                                                n6 = 0;
                                            } else {
                                                n8 = 0;
                                                n11 = n14 + 1;
                                                n9 += n7;
                                                n7 = a2.e + (a2.a[1] & 0xFF);
                                            }
                                            if (bl) {
                                                bl2 = !bl2;
                                            }
                                            break block17;
                                        }
                                        if (n21 <= 32) break block19;
                                        if (n21 != 64 || a3 == null) break block20;
                                        if (!bl2 && bl) {
                                            a3.a(graphics, byArray[n6 + n4], n8, n9, 0, 0, 0);
                                        }
                                        n8 += h.c(a3, byArray[n6 + n4]);
                                        n20 = h.b(a3, (int)byArray[n6 + n4]);
                                        if (n20 > n7) {
                                            n7 = n20;
                                        }
                                        ++n6;
                                        break block17;
                                    }
                                    byArray2 = a.h;
                                    n19 = n21;
                                    break block21;
                                }
                                if (n21 != 32) break block22;
                                n12 = n14;
                                n13 = n8;
                                n16 = n8;
                                n15 = a2.a[0] & 0xFF;
                                break block23;
                            }
                            if (n21 != 1) break block24;
                            a2.b = byArray[++n14];
                            break block17;
                        }
                        if (n21 != 2) break block17;
                        byArray2 = byArray;
                        n19 = ++n14;
                    }
                    n21 = byArray2[n19] & 0xFF;
                    if (n21 >= a2.b(0)) {
                        n20 = n21 - a2.b(0);
                        if (!bl2 && bl) {
                            a2.a(graphics, n20, n8, n9, 0, 0, 0);
                        }
                        n16 = n8;
                        n18 = a2.c[(n20 << 2) + 2] & 0xFF;
                        n17 = a2.c[n20 << 2] & 0xFF;
                    } else {
                        n20 = (a2.d[n21 << 2] & 0xFF) << 1;
                        if (!bl2 && bl) {
                            a2.a(graphics, 0, n21, n8, n9, 0);
                        }
                        n16 = n8;
                        n18 = a2.a[n20] & 0xFF;
                        n17 = a2.d[(n21 << 2) + 1];
                    }
                    n15 = n18 - n17;
                }
                n8 = n16 + (n15 + a2.d[1]);
            }
            ++n14;
        }
    }

    private void ct() {
        this.H = false;
        h.a(a[23], true);
        h.a[23] = null;
        h.a(a[24], true);
        h.a[24] = null;
        h.a(a[25], true);
        h.a[25] = null;
        h.a(a[26], true);
        h.a[26] = null;
        h.a(a[17], true);
        h.a[17] = null;
        this.c = null;
        f = null;
        c = null;
        System.gc();
    }

    private void cu() {
        this.h();
        this.ax = true;
        this.ay = true;
        this.aq = true;
        l = (byte)21;
        this.bs = 0;
        this.br = 14;
        this.dN = 100;
        if (this.aq > this.b(this.ap)) {
            this.aq = this.b(this.ap);
        }
        this.cv();
    }

    private void cv() {
        a = new long[12][12];
        this.c = new int[20];
    }

    private static int a(long l, byte by, byte by2) {
        l >>>= by;
        return (int)(l &= -1L << by2 ^ 0xFFFFFFFFFFFFFFFFL);
    }

    private void a(int n, int n2, int n3, byte by, byte by2) {
        long l = a[n][n2];
        long l2 = h.a(l, by, by2);
        l ^= (l2 <<= by);
        long l3 = n3;
        h.a[n][n2] = l |= (l3 <<= by);
    }

    private void cw() {
        if (this.ax) {
            f = Image.createImage(186, 226);
        }
        if (this.ay) {
            this.ay = false;
            this.az = true;
            this.cC();
            this.cB();
        }
        if (this.az) {
            this.a.drawImage(f, 27, 56, 0);
            this.cD();
            this.cA();
            this.cx();
            this.cy();
        }
        if (this.az && this.dY == this.ea && this.dZ == this.eb) {
            this.az = false;
        }
    }

    private void cx() {
        int n;
        StringBuffer stringBuffer;
        Graphics graphics;
        a a2;
        long l = a[this.dY][this.dZ];
        int n2 = h.a(l, (byte)6, (byte)5);
        if (n2 < this.dN) {
            a2 = a[41];
            graphics = this.a;
            stringBuffer = new StringBuffer().append(a.toString());
            n = n2;
        } else {
            a2 = a[41];
            graphics = this.a;
            stringBuffer = new StringBuffer().append(b.toString());
            n = n2 - this.dN;
        }
        a2.a(graphics, stringBuffer.append(n + 1).toString(), 8, 45, 6);
    }

    private void cy() {
        int n;
        if (this.dY != this.ea || this.dZ != this.eb) {
            return;
        }
        long l = a[this.dY][this.dZ];
        int n2 = h.a(l, (byte)6, (byte)5);
        int n3 = 0;
        n3 = this.b(this.ap, n2);
        if (n3 > (n = this.c(this.ap, n2))) {
            n3 = n;
        }
        c.delete(0, c.length());
        c.append(n3);
        c.append('/');
        c.append(n);
        a[41].a(c.toString());
        int n4 = a.c + 6 + 14;
        int n5 = 37 + this.dY * 13 + 6;
        int n6 = 73 + this.dZ * 13 + 6;
        int n7 = n5 - (n4 >> 1) + 0;
        int n8 = n6 - 17 + -31;
        if (n8 <= 63) {
            n8 = 63;
            n7 = n5 + 20;
            if (n7 + n4 >= 200) {
                n7 = n5 - n4 + -20;
            }
        }
        if (n7 <= 35) {
            n7 = 35;
        }
        if (n7 + n4 >= 200) {
            n7 = 150;
        }
        h.a(this.a, n7, n8, n4, 17, 37042, 0);
        a[41].a(this.a, c.toString(), n7 + 2, n8 + 2 - 1, 20);
        if (a[17] != null) {
            a[17].a(this.a, 10, n7 + n4 - 2 - 14, n8 + 2 - 1, 0, 0, 0);
        }
    }

    private void cz() {
        this.eo = 0;
        this.el = 0;
        this.em = 0;
        this.au = false;
        this.at = true;
        this.as = false;
        this.en = 2;
        this.ep = 2;
        this.av = false;
    }

    /*
     * Unable to fully structure code
     */
    private boolean g() {
        block32: {
            block31: {
                var1_1 = false;
                var2_2 = this.el >> 1;
                if (this.en < 0) {
                    v0 = this;
                    v1 = 2;
                } else {
                    v2 = this;
                    v0 = v2;
                    v1 = v0.en = v2.en - 1;
                }
                if (this.ea == 0 && this.eb == 0) {
                    this.ea = this.dY;
                    this.eb = this.dZ;
                }
                if (this.en == 0) {
                    if (this.em == var2_2) {
                        v3 = true;
                    } else {
                        ++this.em;
                        v3 = false;
                    }
                    var1_1 = v3;
                }
                var3_3 = h.a[this.dY][this.dZ];
                var5_4 = h.a(var3_3, (byte)3, (byte)3);
                var6_5 = h.a[this.ea][this.eb];
                var8_6 = h.a(var6_5, (byte)3, (byte)3);
                var9_7 = 0;
                var10_8 = 0;
                var10_8 = var5_4 == 1 || var8_6 == 1 ? 1 : var5_4;
                switch (var10_8) {
                    case 0: {
                        v4 = 2;
                        ** GOTO lbl33
                    }
                    case 1: {
                        v4 = 8;
lbl33:
                        // 2 sources

                        var9_7 = v4;
                    }
                }
                var11_9 = 0;
                var12_10 = this.av != false ? var2_2 - 1 : 0;
                v5 = var13_11 = this.av != false ? -1 : 1;
                while (var11_9 < this.em) {
                    var14_12 = var12_10 * 2;
                    h.a[17].a(this.a, var9_7, this.c[var14_12], this.c[var14_12 + 1], 0, 0, 0);
                    ++var11_9;
                    var12_10 += var13_11;
                }
                var14_12 = 0;
                var15_13 = 0;
                switch (var5_4) {
                    case 0: {
                        var15_13 = 0;
                        v6 = 0;
                        ** GOTO lbl53
                    }
                    case 1: {
                        var15_13 = 2;
                        v6 = 9;
lbl53:
                        // 2 sources

                        var14_12 = v6;
                    }
                }
                var16_14 = this.dY * 13 + var15_13 + 37;
                var17_15 = this.dZ * 13 + var15_13 + 73;
                h.a[17].a(this.a, var14_12, var16_14, var17_15, 0, 0, 0);
                var18_16 = this.ar != false ? 7 : 6;
                h.a[17].a(this.a, var18_16, var16_14 + 6, var17_15 + 6, 0, 0, 0);
                var19_17 = true;
                if (var11_9 == var2_2) {
                    if (this.ep < 0) {
                        v7 = this;
                        v8 = 2;
                    } else {
                        v9 = this;
                        v7 = v9;
                        v8 = v7.ep = v9.ep - 1;
                    }
                    if (this.ep == 0) {
                        this.ep = 1;
                        var19_17 = false;
                    }
                }
                if (var19_17) break block31;
                switch (var8_6) {
                    case 0: {
                        var15_13 = 0;
                        v10 = 0;
                        ** GOTO lbl80
                    }
                    case 1: {
                        var15_13 = 2;
                        v10 = 9;
lbl80:
                        // 2 sources

                        var14_12 = v10;
                    }
                }
                break block32;
            }
            switch (var8_6) {
                case 0: {
                    var15_13 = 0;
                    v11 = 1;
                    ** GOTO lbl91
                }
                case 1: {
                    var15_13 = 2;
                    v11 = 5;
lbl91:
                    // 2 sources

                    var14_12 = v11;
                }
            }
        }
        var16_14 = this.ea * 13 + var15_13 + 37;
        var17_15 = this.eb * 13 + var15_13 + 73;
        h.a[17].a(this.a, var14_12, var16_14, var17_15, 0, 0, 0);
        if (!var19_17) {
            if (this.eo == h.a[9].a(0)) {
                --this.eo;
                this.au = true;
                v12 = true;
            } else {
                v12 = var1_1 = false;
            }
            if (!this.P) {
                h.a[9].a(this.a, this.eo, var16_14, var17_15, 0, 0, 0);
            }
            ++this.eo;
        }
        return var1_1;
    }

    private void cA() {
        int n = 37 + this.dY * 13 + 6;
        int n2 = 73 + this.dZ * 13 + 6;
        if (this.dY != this.ea || this.dZ != this.eb) {
            int n3 = 37 + this.ea * 13 + 6;
            int n4 = 73 + this.eb * 13 + 6;
            if ((this.a(this.ap, this.aq + 1) & 2) != 0 && this.aq + 1 == ec || this.aq == ec) {
                this.as = true;
            }
            if (!this.as) {
                this.as = this.g();
                if (this.as) {
                    this.ay = true;
                    return;
                }
            } else {
                boolean bl = this.c(n, n2, n3, n4);
                if (bl) {
                    this.dY = this.ea;
                    this.dZ = this.eb;
                    return;
                }
            }
        } else if (this.az) {
            int n5 = this.ar ? 7 : 6;
            a[17].a(this.a, n5, n, n2, 0, 0, 0);
        }
    }

    private boolean c(int n, int n2, int n3, int n4) {
        block9: {
            block10: {
                int n5;
                block8: {
                    if (this.aq) {
                        this.aq = false;
                        this.dP = n;
                        this.dQ = n2;
                        this.dR = 0;
                        this.dS = n3 - n;
                        this.dT = n4 - n2;
                        this.dU = 0;
                        this.dV = 0;
                        this.dW = 10;
                        this.dX = 10;
                    }
                    if (this.dS < 0) {
                        this.dW = -10;
                        this.dS = -this.dS;
                    }
                    if (this.dT < 0) {
                        this.dX = -10;
                        this.dT = -this.dT;
                    }
                    this.ar = this.dW <= 0;
                    int n6 = n5 = this.ar ? 7 : 6;
                    if (this.dT > this.dS) break block8;
                    this.dU = 2 * this.dS;
                    this.dV = 2 * this.dT;
                    if (this.dW < 0 && this.dP <= n3 || this.dW > 0 && this.dP >= n3) {
                        n3 = 37 + this.ea * 13 + 6;
                        n4 = 73 + this.eb * 13 + 6;
                        a[17].a(this.a, n5, n3, n4, 0, 0, 0);
                        this.aq = true;
                        return true;
                    }
                    a[17].a(this.a, n5, this.dP, this.dQ, 0, 0, 0);
                    this.dP += this.dW;
                    this.dR += this.dV;
                    if (this.dR <= this.dS) break block9;
                    this.dQ += this.dX;
                    break block10;
                }
                this.dU = 2 * this.dT;
                this.dV = 2 * this.dS;
                if (this.dX < 0 && this.dQ <= n4 || this.dX > 0 && this.dQ >= n4) {
                    n3 = 37 + this.ea * 13 + 6;
                    n4 = 73 + this.eb * 13 + 6;
                    a[17].a(this.a, n5, n3, n4, 0, 0, 0);
                    this.aq = true;
                    return true;
                }
                a[17].a(this.a, n5, this.dP, this.dQ, 0, 0, 0);
                this.dQ += this.dX;
                this.dR += this.dV;
                if (this.dR <= this.dT) break block9;
                this.dP += this.dW;
            }
            this.dR -= this.dU;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private void a(int var1_1, int var2_2, long var3_3, int var5_4, int var6_5) {
        var7_6 = h.a(var3_3, (byte)6, (byte)5);
        this.dO |= 1 << var7_6;
        var8_7 = h.a(var3_3, (byte)11, (byte)3);
        var9_8 = 14;
        var10_9 = 0;
        while (var10_9 < var8_7) {
            block24: {
                block27: {
                    block26: {
                        block25: {
                            var11_10 = 37 + var1_1 * 13;
                            var12_11 = 73 + var2_2 * 13;
                            var13_12 = h.a(var3_3, (byte)var9_8, (byte)4);
                            var14_13 = h.a(var3_3, (byte)(var9_8 += 4), (byte)4);
                            var15_14 = var13_12;
                            var16_15 = var14_13;
                            var17_16 = h.a[var15_14][var16_15];
                            var19_17 = h.a(var17_16, (byte)6, (byte)5);
                            var20_18 = this.dO;
                            if ((var20_18 &= 1 << var19_17) > 0) break block24;
                            var15_14 = 37 + var15_14 * 13;
                            var16_15 = 73 + var16_15 * 13;
                            this.ed = var11_10 += 6;
                            this.ee = var12_11 += 6;
                            this.ef = 0;
                            this.eg = (var15_14 += 6) - var11_10;
                            this.eh = (var16_15 += 6) - var12_11;
                            this.ei = 0;
                            this.ej = 0;
                            this.ek = 1;
                            var21_19 = 1;
                            var22_20 = 1;
                            if (this.eg < 0) {
                                var21_19 = -1;
                                this.eg = -this.eg;
                            }
                            if (this.eh < 0) {
                                var22_20 = -1;
                                this.eh = -this.eh;
                            }
                            var23_21 = 0;
                            var24_22 = h.a(var17_16, (byte)0, (byte)3);
                            var25_23 = h.a(var17_16, (byte)3, (byte)3);
                            if (var5_4 == 1) {
                                var25_23 = var5_4;
                            }
                            if (var6_5 != 1) break block25;
                            if (var25_23 == 1) break block24;
                            var24_22 = var6_5;
                        }
                        if (!this.au && var19_17 == h.ec) {
                            var24_22 = 1;
                        }
                        if (var24_22 != 0) break block26;
                        switch (var25_23) {
                            case 0: {
                                v0 = 2;
                                ** GOTO lbl53
                            }
                            case 1: {
                                v0 = 8;
lbl53:
                                // 2 sources

                                var23_21 = v0;
                            }
                        }
                        break block27;
                    }
                    switch (var25_23) {
                        case 0: {
                            v1 = 3;
                            break;
                        }
                        case 1: {
                            v1 = var23_21 = 4;
                        }
                    }
                }
                if (this.eh <= this.eg) {
                    this.ei = this.eg << 1;
                    this.ej = this.eh << 1;
                    while (true) {
                        if (this.ek % 8 == 0) {
                            h.a[17].a(h.c, var23_21, this.ed - 27, this.ee - 56, 0, 0, 0);
                            if (this.at) {
                                this.w(var7_6, var19_17);
                            }
                        }
                        if (this.ed != var15_14) {
                            this.ed += var21_19;
                            this.ef += this.ej;
                            if (this.ef > this.eg) {
                                this.ee += var22_20;
                                this.ef -= this.ei;
                            }
                            ++this.ek;
                            continue;
                        }
                        break;
                    }
                } else {
                    this.ei = 2 * this.eh;
                    this.ej = 2 * this.eg;
                    while (true) {
                        if (this.ek % 8 == 0) {
                            h.a[17].a(h.c, var23_21, this.ed - 27, this.ee - 56, 0, 0, 0);
                            if (this.at) {
                                this.w(var7_6, var19_17);
                            }
                        }
                        if (this.ee == var16_15) break;
                        this.ee += var22_20;
                        this.ef += this.ej;
                        if (this.ef > this.eh) {
                            this.ed += var21_19;
                            this.ef -= this.ei;
                        }
                        ++this.ek;
                    }
                }
            }
            ++var10_9;
            var9_8 += 4;
        }
    }

    private void w(int n, int n2) {
        block6: {
            block7: {
                h h2;
                block5: {
                    if (this.aw) break block5;
                    long l = a[this.cy][this.cz];
                    int n3 = h.a(l, (byte)6, (byte)5);
                    if ((n2 != ec || n != n3) && (n != ec || n2 != n3)) break block6;
                    if (n == ec && n2 == n3) {
                        this.av = true;
                    }
                    h2 = this;
                    break block7;
                }
                if ((n2 != ec || n != ec - 1) && (n != ec || n2 != ec - 1)) break block6;
                if (n == ec && n2 == ec - 1) {
                    this.av = true;
                }
                h2 = this;
            }
            h2.c[this.el++] = this.ed;
            this.c[this.el++] = this.ee;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void cB() {
        this.dO = 0;
        if ((this.a(this.ap, this.aq + 1) & 2) != 0 && this.aq + 1 == h.ec || this.aq == h.ec) {
            this.at = false;
            this.au = true;
        }
        for (var1_1 = 0; var1_1 < 12; ++var1_1) {
            for (var2_2 = 0; var2_2 < 12; ++var2_2) {
                block17: {
                    block16: {
                        var3_3 = h.a[var1_1][var2_2];
                        var5_4 = false;
                        if (var3_3 == 0L) continue;
                        var6_5 = h.a(var3_3, (byte)3, (byte)3);
                        var7_6 = h.a(var3_3, (byte)6, (byte)5);
                        var8_7 = this.au == false && var7_6 == h.ec && var7_6 != 0 ? 1 : h.a(var3_3, (byte)0, (byte)3);
                        var9_8 = -1;
                        var10_9 = -1;
                        var11_10 = -1;
                        if (var8_7 != 0) break block16;
                        var5_4 = this.b(this.ap, var7_6) == this.c(this.ap, var7_6);
                        switch (var6_5) {
                            case 0: {
                                var10_9 = 17;
                                var11_10 = 0;
                                var12_11 = h.a(var3_3, (byte)11, (byte)3);
                                v0 = var12_11 > 2 ? 13 : 0;
                                ** GOTO lbl29
                            }
                            case 1: {
                                var10_9 = 18;
                                var11_10 = 2;
                                v0 = 9;
lbl29:
                                // 2 sources

                                var9_8 = v0;
                            }
                        }
                        break block17;
                    }
                    switch (var6_5) {
                        case 0: {
                            var11_10 = 0;
                            var9_8 = 1;
                        }
                    }
                }
                this.a(var1_1, var2_2, var3_3, var6_5, var8_7);
                if (var11_10 == -1 || var9_8 == -1) continue;
                if (var5_4 && var10_9 != -1) {
                    h.a[17].a(h.c, var10_9, var1_1 * 13 + var11_10 + 37 - 27, var2_2 * 13 + var11_10 + 73 - 56, 0, 0, 0);
                }
                h.a[17].a(h.c, var9_8, var1_1 * 13 + var11_10 + 37 - 27, var2_2 * 13 + var11_10 + 73 - 56, 0, 0, 0);
                var12_11 = -1;
                switch (this.ap) {
                    case 0: {
                        if (var7_6 != 8) break;
                        v1 = 52;
                        break;
                    }
                    case 1: {
                        if (var7_6 != 9) break;
                        v1 = 53;
                        break;
                    }
                    case 2: {
                        if (var7_6 != 10) break;
                        v1 = var12_11 = 54;
                    }
                }
                if (var12_11 == -1) continue;
                h.a[var12_11].a(h.c, 0, var1_1 * 13 + -8 + 37 - 27, var2_2 * 13 + -8 + 73 - 56, 0, 0, 0);
            }
        }
        this.at = false;
    }

    /*
     * Unable to fully structure code
     */
    private void cC() {
        this.a.setClip(0, 0, 240, 320);
        var1_1 = 0;
        var2_2 = 0;
        var3_3 = 0;
        var4_4 = -1;
        var5_5 = 0;
        switch (this.ap) {
            case 0: {
                var1_1 = 939282;
                var2_2 = 3111750;
                var3_3 = 8635434;
                var5_5 = 24;
                v0 = 28;
                ** GOTO lbl28
            }
            case 1: {
                var1_1 = 869201;
                var2_2 = 4022666;
                var3_3 = 5873874;
                var5_5 = 25;
                v0 = 29;
                ** GOTO lbl28
            }
            case 2: {
                var1_1 = 5210510;
                var2_2 = 3711421;
                var3_3 = 7469567;
                var5_5 = 26;
                v0 = 30;
lbl28:
                // 3 sources

                var4_4 = v0;
            }
        }
        this.a.setColor(var1_1);
        this.a.fillRect(0, 0, 240, 320);
        h.a[var5_5].a(this.a, 0, 120, 0, 0, 0, 0);
        h.a[41].a(this.a, h.a[var4_4], 8, 6, 20);
        h.c = h.f.getGraphics();
        h.c.setColor(var1_1);
        h.c.fillRect(0, 0, 186, 226);
        h.a[23].a(h.c, 0, 93, 113, 0, 0, 0);
        this.a.setColor(var2_2);
        this.a.fillRoundRect(2, 282, 236, 22, 8, 8);
        this.a.setColor(var3_3);
        this.a.drawRoundRect(2, 282, 236, 22, 8, 8);
        this.a();
        this.b();
        h.a[41].a(this.a, h.a[106], 222, 311, 10);
        if (h.a[17] != null) {
            h.a[17].a(this.a, 12, 11, 284, 0, 0, 0);
            h.a[17].a(this.a, 10, 155, 285, 0, 0, 0);
            h.a[17].a(this.a, 11, 80, 285, 0, 0, 0);
        }
        h.c.delete(0, h.c.length());
        h.c.append(this.ao);
        h.a[41].a(this.a, h.c.toString(), 39, 285, 20);
        h.c.delete(0, h.c.length());
        h.c.append(h.a(h.i, 4));
        h.a[41].a(this.a, h.c.toString(), 100, 285, 20);
        h.c.delete(0, h.c.length());
        var6_6 = h.a(h.i, 6);
        var8_7 = h.i[0];
        if (var6_6 >= var8_7) {
            h.c.append(var6_6).append("/").append(var6_6);
        } else {
            h.c.append(var6_6).append("/").append(var8_7);
        }
        h.a[41].a(this.a, h.c.toString(), 175, 285, 20);
        this.ax = false;
    }

    /*
     * Unable to fully structure code
     */
    private void cD() {
        var1_1 = 0;
        var2_2 = 0;
        switch (this.ap) {
            case 0: {
                var1_1 = 3111750;
                v0 = 8635434;
                ** GOTO lbl15
            }
            case 1: {
                var1_1 = 4022666;
                v0 = 5873874;
                ** GOTO lbl15
            }
            case 2: {
                var1_1 = 3711421;
                v0 = 7469567;
lbl15:
                // 3 sources

                var2_2 = v0;
            }
        }
        this.a.setColor(var1_1);
        this.a.fillRoundRect(2, 34, 236, 22, 8, 8);
        this.a.setColor(var2_2);
        this.a.drawRoundRect(2, 34, 236, 22, 8, 8);
    }

    /*
     * Unable to fully structure code
     */
    private void cE() {
        block32: {
            block35: {
                block34: {
                    if (this.dY != this.ea || this.dZ != this.eb) break block32;
                    var1_1 = -1;
                    if (h.a(32944)) {
                        if (System.currentTimeMillis() - this.q < 2000L) {
                            return;
                        }
                        var2_2 = h.a[this.dY][this.dZ];
                        var4_4 = h.a(var2_2, (byte)6, (byte)5);
                        this.B();
                        this.ct();
                        System.gc();
                        this.aq = var4_4;
                        this.u();
                        h.W = 0;
                        return;
                    }
                    if (h.a(4097)) {
                        var1_1 = 2;
                    } else if (h.a(262146)) {
                        var1_1 = 3;
                    } else if (h.a(16388)) {
                        var1_1 = 4;
                    } else if (h.a(65544)) {
                        var1_1 = 1;
                    } else if (h.a(64)) {
                        this.J = true;
                        this.H = true;
                        this.L = true;
                        this.bs = 0;
                        h.l = (byte)28;
                        h.W = 0;
                        return;
                    }
                    h.W = 0;
                    if (var1_1 == -1) break block32;
                    var2_3 = this.dY;
                    var3_6 = this.dZ;
                    var4_5 = h.a[var2_3][var3_6];
                    var6_7 = h.a(var4_5, (byte)11, (byte)3);
                    var7_8 = 14;
                    var8_9 = -1;
                    var9_10 = -1;
                    var10_11 = 0;
                    while (var10_11 < var6_7) {
                        block33: {
                            var11_12 = h.a(var4_5, (byte)var7_8, (byte)4);
                            var13_14 = h.a[var11_12][var12_13 = h.a(var4_5, (byte)(var7_8 += 4), (byte)4)];
                            var15_17 = h.a(var13_14, (byte)0, (byte)3);
                            if (var15_17 == 1) break block33;
                            switch (var1_1) {
                                case 1: {
                                    if (var11_12 <= var2_3) break;
                                    if (var8_9 >= 0) {
                                        var9_10 = var10_11;
                                        break;
                                    }
                                    v0 = var10_11;
                                    ** GOTO lbl78
                                }
                                case 4: {
                                    if (var11_12 >= var2_3) break;
                                    if (var8_9 >= 0) {
                                        var9_10 = var10_11;
                                        break;
                                    }
                                    v0 = var10_11;
                                    ** GOTO lbl78
                                }
                                case 2: {
                                    if (var12_13 >= var3_6) break;
                                    if (var8_9 >= 0) {
                                        var9_10 = var10_11;
                                        break;
                                    }
                                    v0 = var10_11;
                                    ** GOTO lbl78
                                }
                                case 3: {
                                    if (var12_13 <= var3_6) break;
                                    if (var8_9 >= 0) {
                                        var9_10 = var10_11;
                                        break;
                                    }
                                    v0 = var10_11;
lbl78:
                                    // 4 sources

                                    var8_9 = v0;
                                }
                            }
                        }
                        ++var10_11;
                        var7_8 += 4;
                    }
                    if (var8_9 == -1) break block32;
                    var10_11 = -1;
                    if (var9_10 == -1) break block34;
                    var7_8 = 14 + var8_9 * 2 * 4;
                    var11_12 = h.a(var4_5, (byte)var7_8, (byte)4);
                    var12_13 = h.a(var4_5, (byte)(var7_8 += 4), (byte)4);
                    var7_8 = 14 + var9_10 * 2 * 4;
                    var13_15 = h.a(var4_5, (byte)var7_8, (byte)4);
                    var14_18 = h.a(var4_5, (byte)(var7_8 += 4), (byte)4);
                    switch (var1_1) {
                        case 1: 
                        case 4: {
                            if (var3_6 != var12_13) ** GOTO lbl97
                            v1 = var8_9;
                            ** GOTO lbl108
lbl97:
                            // 1 sources

                            if (var3_6 == var14_18) ** GOTO lbl-1000
                            v1 = Math.abs(var2_3 - var11_12) > Math.abs(var2_3 - var13_15) ? var8_9 : var9_10;
                            ** GOTO lbl108
                        }
                        case 2: 
                        case 3: {
                            if (var2_3 == var11_12) {
                                v1 = var8_9;
                            } else if (var2_3 != var13_15 && var11_12 > var13_15) {
                                v1 = var8_9;
                            } else lbl-1000:
                            // 2 sources

                            {
                                v1 = var9_10;
                            }
lbl108:
                            // 5 sources

                            var10_11 = v1;
                        }
                    }
                    break block35;
                }
                var10_11 = var8_9;
            }
            if (var10_11 != -1) {
                var7_8 = 14 + var10_11 * 2 * 4;
                var11_12 = h.a(var4_5, (byte)var7_8, (byte)4);
                var13_16 = h.a[var11_12][var12_13 = h.a(var4_5, (byte)(var7_8 += 4), (byte)4)];
                var15_17 = h.a(var13_16, (byte)0, (byte)3);
                if (var15_17 == 0) {
                    this.ea = var11_12;
                    this.eb = var12_13;
                    this.az = true;
                }
            }
        }
        h.W = 0;
    }

    /*
     * Unable to fully structure code
     */
    private void C(int var1_1) {
        try {
            switch (var1_1) {
                case 0: {
                    if (this.I) {
                        this.F();
                        break;
                    }
                    ** GOTO lbl94
                }
                case 1: {
                    if (this.J) {
                        this.B();
                        break;
                    }
                    ** GOTO lbl94
                }
                case 2: {
                    if (this.G) {
                        this.l();
                        break;
                    }
                    ** GOTO lbl94
                }
                case 3: {
                    if (this.H) {
                        this.ct();
                        break;
                    }
                    ** GOTO lbl94
                }
                case 4: {
                    h.a[41].b = 0;
                    h.c.delete(0, h.c.length());
                    switch (this.ap) {
                        case 0: {
                            h.c.append("/map_angkor.out");
                            break;
                        }
                        case 1: {
                            h.c.append("/map_scotland.out");
                            break;
                        }
                        case 2: {
                            h.c.append("/map_tibet.out");
                        }
                    }
                    h.a = new long[12][12];
                    this.c = new int[20];
                    this.a(h.c.toString());
                    break;
                }
                case 5: {
                    h.a[17] = h.a("/ms.f", 0);
                    h.a[23] = h.a("/ms.f", 1);
                    break;
                }
                case 6: {
                    switch (this.ap) {
                        case 0: {
                            v0 = h.a;
                            v1 = 24;
                            v2 = "/ms.f";
                            v3 = 2;
                            ** GOTO lbl66
                        }
                        case 1: {
                            v0 = h.a;
                            v1 = 25;
                            v2 = "/ms.f";
                            v3 = 3;
                            ** GOTO lbl66
                        }
                        case 2: {
                            v0 = h.a;
                            v1 = 26;
                            v2 = "/ms.f";
                            v3 = 4;
lbl66:
                            // 3 sources

                            v0[v1] = h.a(v2, v3);
                        }
                    }
                    break;
                }
                case 7: {
                    if (h.a[54] == null) {
                        h.a[54] = h.a("/mmv.f", 1);
                    }
                    this.v = h.c(h.a[54], 0) >> 1;
                    this.w = h.b(h.a[54], 0) >> 1;
                    break;
                }
                case 8: {
                    if (h.a[53] == null) {
                        h.a[53] = h.a("/mmv.f", 2);
                        break;
                    }
                    ** GOTO lbl94
                }
                case 9: {
                    if (h.a[52] == null) {
                        h.a[52] = h.a("/mmv.f", 3);
                        break;
                    }
                    ** GOTO lbl94
                }
                case 10: {
                    if (this.ad) {
                        this.cz();
                        break;
                    }
                    ** GOTO lbl94
                }
                case 14: {
                    if (this.A) {
                        this.A = false;
                    }
                    this.cF();
                    h.l = (byte)15;
                }
lbl94:
                // 9 sources

                default: {
                    return;
                }
            }
        }
        catch (Exception v4) {}
    }

    private void a(String string) throws IOException {
        InputStream inputStream = this.getClass().getResourceAsStream(string);
        int n = inputStream.read();
        n = ((byte)n & 0xFF) + ((byte)inputStream.read() & 0xFF) * 256;
        int n2 = inputStream.read();
        f = new byte[n];
        inputStream.read(f);
        inputStream.close();
        int n3 = 0;
        for (int i = 0; i < n2; ++i) {
            byte by = f[n3++];
            byte by2 = f[n3++];
            byte by3 = f[n3++];
            int n4 = f[n3++];
            if (by3 == 1 && n4 < this.dN) {
                this.dN = n4;
            }
            int n5 = f[n3++];
            this.a((int)by, (int)by2, 1, (byte)0, (byte)3);
            this.a((int)by, (int)by2, (int)by3, (byte)3, (byte)3);
            this.a((int)by, (int)by2, n4, (byte)6, (byte)5);
            this.a((int)by, (int)by2, n5, (byte)11, (byte)3);
            byte by4 = 14;
            for (int j = 0; j < n5; ++j) {
                byte by5 = f[n3++];
                this.a((int)by, (int)by2, (int)by5, by4, (byte)4);
                by4 = (byte)(by4 + 4);
                byte by6 = f[n3++];
                this.a((int)by, (int)by2, (int)by6, by4, (byte)4);
                by4 = (byte)(by4 + 4);
            }
        }
        f = null;
        System.gc();
    }

    private void cF() {
        this.dY = -1;
        if (!this.ad) {
            this.aq = ec;
        }
        this.ad = false;
        for (int i = 0; i < 12; ++i) {
            for (int j = 0; j < 12; ++j) {
                int n;
                int n2;
                int n3;
                h h2;
                long l = a[i][j];
                if (l == 0L) continue;
                int n4 = h.a(l, (byte)6, (byte)5);
                boolean bl = (this.a(this.ap, n4) & 0x40) != 0;
                if (bl || n4 == 0) {
                    h2 = this;
                    n3 = i;
                    n2 = j;
                    n = 0;
                } else {
                    h2 = this;
                    n3 = i;
                    n2 = j;
                    n = 1;
                }
                h2.a(n3, n2, n, (byte)0, (byte)3);
                if (n4 == this.aq) {
                    this.dY = i;
                    this.dZ = j;
                }
                if (n4 == ec) {
                    this.ea = i;
                    this.eb = j;
                }
                this.ar = false;
            }
        }
    }

    private void cG() {
        h.a[17] = h.a("/ms.f", 0);
        this.aP();
    }

    public static final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        int n8 = graphics.getClipX();
        int n9 = graphics.getClipY();
        int n10 = graphics.getClipWidth();
        int n11 = graphics.getClipHeight();
        graphics.setClip(n, n2, n3, n4);
        graphics.setColor(n5);
        graphics.fillRect(n, n2, n3, n4);
        graphics.setClip(n - 3, n2, n3 + 6, n4);
        for (n7 = n2; n7 <= n2 + n4; n7 += 8) {
            graphics.drawImage(b[n6][7], n, n7, 24);
            graphics.drawImage(b[n6][5], n + n3, n7, 20);
        }
        graphics.setClip(n, n2 - 3, n3, n4 + 6);
        for (n7 = n; n7 <= n + n3; n7 += 8) {
            graphics.drawImage(b[n6][4], n7, n2, 36);
            graphics.drawImage(b[n6][6], n7, n2 + n4, 20);
        }
        graphics.setClip(n - 3, n2 - 3, n3 + 6, n4 + 6);
        graphics.drawImage(b[n6][0], n, n2, 40);
        graphics.drawImage(b[n6][1], n + n3, n2, 36);
        graphics.drawImage(b[n6][2], n, n2 + n4, 24);
        graphics.drawImage(b[n6][3], n + n3, n2 + n4, 20);
        graphics.setClip(n8, n9, n10, n11);
    }

    public static final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9 = graphics.getClipX();
        int n10 = graphics.getClipY();
        int n11 = graphics.getClipWidth();
        int n12 = graphics.getClipHeight();
        h.a(graphics, n, n2, n3, n4, n5, n6);
        h.a(graphics, n + 10, n2 - 3 - n8, n7, n8, n5, n6);
        graphics.setClip(n + 10 - 3, n2 - 3, n7 + 6, 3);
        graphics.setColor(n5);
        graphics.fillRect(n + 10 - 3, n2 - 3, n7 + 6, 3);
        graphics.drawImage(b[n6][3], n + 10, n2 - 3, 24);
        graphics.drawImage(b[n6][2], n + 10 + n7, n2 - 3, 20);
        graphics.setClip(n9, n10, n11, n12);
    }

    private void cH() {
        int n;
        int n2;
        int n3;
        int n4;
        String string;
        Graphics graphics;
        a a2;
        if (this.c == this.eq && !this.ay) {
            return;
        }
        if (this.c != this.eq) {
            this.ay = true;
        }
        this.a.setClip(0, 0, 240, 320);
        if (this.ay) {
            this.a(this.a, true);
            this.a.setColor(0);
            this.a.fillRect(0, 0, 240, 15);
            this.a.setColor(0xFFFFFF);
            this.a.drawLine(0, 15, 240, 15);
            a[41].a(this.a, a[82], 120, 0, 17);
            h.a(this.a, 10, 35, 220, 90, 4273165, 0);
            if (this.d != -1) {
                a[41].b(this.a, h.a(this.a, 200), 120, 280, 17);
            }
            if (this.ab) {
                this.ab = false;
                a[41].a(this.a, this.a, 120, 191, 1);
            }
            a[41].b(this.a, this.f, 120, 260, 17);
            this.a();
            this.b();
            this.ay = false;
        }
        if (this.c != this.eq) {
            this.a.setColor(4273165);
            this.a.fillRect(20, 43 + (this.eq >= 0 ? this.eq : this.c) * 20 + 2, 7, 9);
        }
        a[17].a(this.a, 14, 20, 43 + this.c * 20 + 2, 0, 0, 0);
        h.a(this.a, 10, 155, 220, 70, 4273165, 0);
        if (this.d != -1) {
            String string2 = a[84] + " " + this.d.toString() + "\n" + a[42];
            h.a[41].e = 0;
            a2 = a[41];
            graphics = this.a;
            string = string2;
            n4 = 120;
            n3 = 185;
        } else {
            a2 = a[41];
            graphics = this.a;
            string = this.a;
            n4 = 120;
            n3 = 191;
        }
        a2.b(graphics, string, n4, n3, 1);
        int n5 = 0;
        for (int i = 0; i < 4; ++i) {
            n5 = 43 + 20 * i;
            a[46].a(this.a, 0 + i, 27, n5, 0, 0, 0);
            a[41].a(this.a, a[95 + i], 53, n5, 0);
        }
        Image[] imageArray = h.a[0].a[0];
        int n6 = imageArray[11].getWidth();
        int n7 = imageArray[15].getWidth();
        this.a.drawImage(imageArray[11], 100, 160, 0);
        for (n2 = 0; n2 < 8; ++n2) {
            n = n2 >= 4 ? 13 : 15;
            this.a.drawImage(imageArray[n], 100 + n6, 160, 0);
            n6 += n7;
        }
        n2 = this.c;
        n = n6;
        n6 -= n7 * 4;
        for (int i = 0; i <= n2; ++i) {
            this.a.drawImage(imageArray[15], 100 + n6, 160, 0);
            n6 += n7;
        }
        this.a.drawImage(imageArray[17], 100 + n, 160, 0);
        if (this.c != this.eq) {
            this.eq = this.c;
        }
    }

    private static void a(int n, int n2, short s) {
        for (int i = 0; i < a[n].length; i += 2) {
            if (n2 != a[n][i]) continue;
            h.a[n][i + 1] = s;
            return;
        }
    }

    private void cI() {
        if (a == null) {
            try {
                this.b = this.getClass().getResourceAsStream("/snd.f");
                this.b.skip(1L);
                this.s = new byte[168];
                this.b.read(this.s);
                return;
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
    }

    private void D(int n) {
        if (a == null) {
            a = new Player[13];
            e = new int[13];
        }
        if (f == null) {
            f = new byte[8][];
            d = new int[8];
        }
        try {
            int n2 = h.a(this.s, n * 8 + 4);
            byte[] byArray = new byte[n2];
            this.b.read(byArray);
            a = new ByteArrayInputStream(byArray);
            if (h.e(n)) {
                h.a[h.et] = Manager.createPlayer(a, "audio/x-wav");
                a[et].realize();
                a[et].prefetch();
                ((VolumeControl)a[et].getControl("VolumeControl")).setLevel(100);
                h.e[h.et] = n;
                ++et;
            } else {
                h.f[h.es] = byArray;
                h.d[h.es] = n;
                ++es;
            }
            a.close();
            a = null;
            System.gc();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static boolean e(int n) {
        switch (n) {
            case 0: 
            case 1: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 14: {
                return true;
            }
            case 2: 
            case 13: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 20: {
                return false;
            }
        }
        return false;
    }

    public final void g() {
        if (a != null) {
            this.cK();
            int n = a.length;
            for (int i = 0; i < n; ++i) {
                if (a[i] == null) continue;
                a[i].close();
                h.a[i] = null;
            }
        }
        a = null;
    }

    private void cJ() {
        try {
            er = -1;
            this.b.close();
            this.b = null;
            this.s = null;
            System.gc();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private int h(int n) {
        if (h.e(n)) {
            for (int i = 0; i < 13; ++i) {
                if (e[i] != n) continue;
                return i;
            }
        } else {
            for (int i = 0; i < 8; ++i) {
                if (d[i] != n) continue;
                return i;
            }
        }
        return -1;
    }

    private void E(int n) {
        try {
            if (!aA) {
                return;
            }
            if (er != -1) {
                boolean bl = true;
                if (h.e(n) ? this.h() && h.i(n) < h.i(er) : this.h() && h.i(n) < h.i(er)) {
                    bl = false;
                }
                if (bl) {
                    this.cK();
                } else {
                    return;
                }
            }
            if (h.e(n)) {
                a[this.h(n)].start();
            } else {
                a = new ByteArrayInputStream(f[this.h(n)]);
                a = Manager.createPlayer(a, "audio/midi");
                a.start();
                a.close();
                a = null;
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        er = n;
    }

    private void cK() {
        if (er != -1 && this.h()) {
            try {
                if (!h.e(er) && a != null) {
                    a.close();
                    a.deallocate();
                    a = null;
                }
                return;
            }
            catch (Exception exception) {}
        }
    }

    private boolean h() {
        if (er != -1) {
            if (h.e(er)) {
                return a != null && a[this.h(er)] != null && a[this.h(er)].getState() == 400;
            }
            return a != null && a.getState() == 400;
        }
        return false;
    }

    private static int i(int n) {
        switch (n) {
            case 1: 
            case 2: 
            case 4: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 20: {
                return 30;
            }
            case 3: 
            case 7: 
            case 8: 
            case 9: 
            case 11: 
            case 12: 
            case 13: {
                return 20;
            }
            case 0: 
            case 5: 
            case 6: 
            case 10: 
            case 14: {
                return 10;
            }
        }
        return 0;
    }

    private void cL() {
        if (h.a(255)) {
            int n;
            if (X) {
                n = 10;
            } else {
                this.bs = 0;
                this.br = 8;
                n = 9;
            }
            l = (byte)n;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void cM() {
        switch (this.aM) {
            case 0: {
                this.eu = 0;
                this.ev = 0;
                this.aM = 1;
                return;
            }
            case 1: {
                h.t = h.a("/cr.f", 0);
                var1_1 = 0;
                while (var1_1 < h.t.length) {
                    if (h.t[var1_1] == 92 && h.t[var1_1 + 1] == 110) {
                        h.t[var1_1++] = 10;
                        h.t[var1_1++] = 32;
                        continue;
                    }
                    ++var1_1;
                }
                var1_1 = 0;
                while (h.t[var1_1] != 36) {
                    ++var1_1;
                }
                var2_3 = 0;
                while (var2_3 < GloftDIRU.a.length) {
                    h.t[var1_1] = GloftDIRU.a[var2_3];
                    ++var2_3;
                    ++var1_1;
                }
                this.aM = 2;
                return;
            }
            case 2: {
                if (!h.a(4097)) ** GOTO lbl38
                var2_4 = 0;
                if (this.eu < 240) ** GOTO lbl-1000
                this.eu -= 3;
                if (this.eu >= 240) ** GOTO lbl58
                v0 = this;
                v1 = 240;
                ** GOTO lbl57
lbl38:
                // 1 sources

                if (!h.a(262146)) ** GOTO lbl44
                v2 = this;
                v0 = v2;
                v3 = v2.eu;
                v4 = 3;
                ** GOTO lbl56
lbl44:
                // 1 sources

                if (h.a(64)) {
                    if (this.g) {
                        this.bs = 0;
                        h.l = (byte)36;
                        this.g = false;
                    } else {
                        this.aM = 3;
                    }
                } else lbl-1000:
                // 2 sources

                {
                    v5 = this;
                    v0 = v5;
                    v3 = v5.eu;
                    v4 = 1;
lbl56:
                    // 2 sources

                    v1 = v3 + v4;
lbl57:
                    // 2 sources

                    v0.eu = v1;
                }
lbl58:
                // 4 sources

                var2_4 = -this.eu;
                for (var1_2 = 0; var1_2 < h.t.length && var2_4 <= -340; ++var1_2) {
                    if (h.t[var1_2] != 10) continue;
                    var2_4 += 17;
                }
                this.ev = var1_2;
                if (this.ev < h.t.length) break;
                this.ev = 0;
                this.eu = 0;
                return;
            }
            case 3: {
                h.t = null;
                System.gc();
                h.l = (byte)4;
                this.aM = 2;
                this.a(0);
                this.E(19);
            }
        }
    }

    private void cN() {
        Graphics graphics = this.a;
        graphics.setColor(0, 0, 0);
        graphics.setClip(0, 0, 240, 320);
        graphics.fillRect(0, 0, 240, 320);
        int n = h.a[41].e;
        h.a[41].e = 5;
        a[41].a(a[125]);
        a[41].a(this.a, a[125], 120, 160, 3);
        h.a[41].e = n;
    }

    private void cO() {
        if (this.aM != 2) {
            return;
        }
        Graphics graphics = this.a;
        graphics.setColor(0, 0, 0);
        graphics.fillRect(0, 0, 240, 320);
        int n = 0;
        int n2 = -17;
        int n3 = this.ev;
        int n4 = 0;
        int n5 = n4 = this.eu >= 340 ? -(this.eu % 17) : 340 - this.eu - 17;
        for (int i = this.ev; i < t.length && n2 < 340; ++i) {
            if (t[i] != 10) continue;
            h.a[41].b = 0;
            this.a(graphics, t, a[41], n3, i - n3, n2 + n4, null, 0, 234);
            n2 += 17;
            n3 = i + 1;
        }
        n = 0;
        for (int i = 6; i > 0; --i) {
            graphics.setColor(0);
            graphics.fillRect(0, n, 240, i);
            graphics.fillRect(0, 320 - n - i, 240, i);
            n += i + 1;
        }
        this.a();
    }

    private void cP() {
        if (ew > 0) {
            ew = (int)((long)ew - (System.currentTimeMillis() - this.r));
            this.r = System.currentTimeMillis();
            if (ew <= 0) {
                this.c(true);
            }
        }
    }

    private void a(String string, int n, int n2, int n3, int n4, int n5) {
        this.r = System.currentTimeMillis();
        ew = n3;
        this.ex = n;
        this.ey = n2;
        this.g = h.a(string, 220);
        this.ez = n4;
        this.eA = n5;
    }

    private void c(boolean bl) {
        ew = 0;
        if (bl) {
            this.ay = true;
        }
    }

    private static boolean i() {
        return ew > 0;
    }

    private void cQ() {
        a a2 = a[41];
        if (ew <= 0) {
            return;
        }
        int n = a2.e;
        a2.e = 3;
        a2.a(this.g);
        int n2 = a.d;
        int n3 = a.c;
        if (this.ex == -1) {
            this.ex = 240 - n3 >> 1;
        }
        if (this.ey == -1) {
            this.ey = 320 - n2 >> 1;
        }
        this.a.setClip(this.ex - 6, this.ey - 3, n3 + 12, n2 + 6);
        h.a(this.a, this.ex - 6, this.ey - 3, n3 + 12, n2 + 6, this.ez, this.eA);
        a2.b(this.a, this.g, this.ex, this.ey, 0);
        a2.e = n;
    }

    public static String a(String string, int n) {
        a a2 = a[41];
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        StringBuffer stringBuffer = new StringBuffer(string);
        for (int i = 0; i <= stringBuffer.length(); ++i) {
            int n6;
            block7: {
                int n7;
                int n8;
                block10: {
                    int n9;
                    int n10;
                    int n11;
                    int n12;
                    block9: {
                        block8: {
                            block6: {
                                n12 = 10;
                                if (i < stringBuffer.length()) {
                                    n12 = stringBuffer.charAt(i) & 0xFF;
                                }
                                if (n2 > n && n3 != n5) {
                                    n2 = n4;
                                    stringBuffer.setCharAt(n3, '\n');
                                    i = n3 - 1;
                                    n5 = n3;
                                    continue;
                                }
                                if (n12 != 10) break block6;
                                n6 = 0;
                                break block7;
                            }
                            if (n12 <= 32) break block8;
                            if (n12 == 64) {
                                n2 += 14;
                                continue;
                            }
                            break block9;
                        }
                        if (n12 != 32) continue;
                        n3 = i;
                        n4 = n2;
                        n8 = n2;
                        n7 = a2.a[0] & 0xFF;
                        break block10;
                    }
                    n12 = a.h[n12] & 0xFF;
                    if (n12 >= a2.b(0)) {
                        n11 = n12 - a2.b(0);
                        n8 = n2;
                        n10 = a2.c[(n11 << 2) + 2] & 0xFF;
                        n9 = a2.c[n11 << 2] & 0xFF;
                    } else {
                        n11 = (a2.d[n12 << 2] & 0xFF) << 1;
                        n8 = n2;
                        n10 = a2.a[n11] & 0xFF;
                        n9 = a2.d[(n12 << 2) + 1];
                    }
                    n7 = n10 - n9;
                }
                n6 = n8 + (n7 + a2.d[1]);
            }
            n2 = n6;
        }
        return stringBuffer.toString();
    }

    private static void cR() {
        if (a[41] != null) {
            h.a[41] = null;
            System.gc();
        }
        h.a[41] = new a();
        byte[] byArray = h.a("/ui.f", 1);
        a[41].a(byArray, 0);
        a[41].a(0, 0, -1, -1);
        a[41].a(1, 0, -1, -1);
        a[41].a(2, 0, -1, -1);
        h.a[41].g = null;
    }

    static {
        a = new boolean[]{true, false, false};
        b = new boolean[]{false, false, false};
        a = new byte[16];
        b = new byte[8];
        c = new byte[8];
        m = l = 0;
        g = new byte[]{0, 0, -1, 0, 1, 0, 0, 0, 0, 1, 0, -1, 0, 0, 0, 0};
        h = new byte[]{0, 3, 4, 1, 2, 5, 6};
        i = null;
        j = null;
        a = null;
        p = null;
        D = false;
        E = false;
        c = null;
        b = null;
        cD = 0;
        cE = 0;
        cF = -1;
        cG = -1;
        cH = -1;
        cI = -1;
        d = null;
        cN = 0;
        cO = 0;
        cP = 0;
        e = null;
        V = false;
        W = true;
        X = false;
        s = 0;
        b = new int[]{512, 16384, 131072, 131072, 4096};
        dh = 0;
        di = 0;
        dj = 0;
        q = new byte[16];
        r = new byte[16];
        am = false;
        a = new long[15];
        b = new long[15];
        er = -1;
        es = 0;
        et = 0;
        a = new short[][]{{0, 0, 1, 1, 6, 3, 2, 2, 3, 4, 4, 5, 5, 6}, {0, 25, 1, 26, 2, 2, 6, 4, 3, 49, 4, 27, 5, 6}, {0, 28, 1, 29, 2, 30, 3, 31}, {0, 32, 1, 33}, {0, 45, 1, 46}, {0, 33}, {0, 25, 4, 27}, {0, 111, 1, 110}};
        f = new int[]{28, 29, 30};
        g = new int[][]{{8, 9, 10, 11, 12, 14, 15, 16, 17, 20, 21, 22, 23}, {8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 20, 21, 22}, {8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22, 47}};
        t = null;
        b = new String[]{"/w0.bin", "/w1.bin", "/w2.bin"};
        ew = 0;
    }
}
