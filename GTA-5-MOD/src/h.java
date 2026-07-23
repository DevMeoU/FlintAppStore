/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class h
extends Canvas
implements Runnable,
PlayerListener {
    static MIDlet a;
    static h b;
    static Display c;
    static long d;
    static g e;
    static boolean f;
    static boolean g;
    static boolean h;
    static boolean i;
    static boolean j;
    static boolean[] k;
    static int[] l;
    static int m;
    static boolean n;
    static int o;
    static boolean p;
    static boolean q;
    static int[] r;
    static int[] s;
    static int[] t;
    static int[] u;
    static int[] v;
    static int[] w;
    static int[] x;
    static int[] y;
    static int[] z;
    static int[] A;
    static int[] B;
    static int[] C;
    static final Random D;
    static final int[] E;
    static final int[] F;
    static final int[] G;
    static final int H;
    static int I;
    static int J;
    static int[][] K;
    static d[][] L;
    static String[] M;
    static byte[] N;
    static d[] O;
    static short[] P;
    static short[] Q;
    static short[] R;
    static String[] S;
    static String[][] T;
    static int[] U;
    static int V;
    static boolean W;
    static d[] X;
    static int[] Y;
    static short[][][] Z;
    static short[][][] aa;
    static int[] ab;
    static int ac;
    static Object[] ad;
    static short[][][] ae;
    static boolean af;
    static boolean ag;
    static String[] ah;
    static String[] ai;
    static Player[] aj;
    static int[] ak;
    static boolean[] al;
    static int am;
    static int an;
    static boolean ao;
    static String ap;
    static boolean aq;
    static int ar;
    static int as;
    static int at;
    static int au;
    static int av;
    static int aw;
    static int ax;
    static final int[] ay;
    static int[][] az;
    static int[] aA;
    static int[] aB;
    static boolean[] aC;
    static int[] aD;
    static boolean aE;
    static int[][] aF;
    static int[] aG;
    static boolean[] aH;
    static int[][] aI;
    static f aJ;
    static boolean aK;
    static boolean aL;
    static boolean aM;
    static f aN;
    static f aO;
    static int aP;
    static f aQ;
    static f aR;
    static f aS;
    static f aT;
    static f aU;
    static f aV;
    static int aW;
    static f aX;
    static f aY;
    static f aZ;
    static f ba;
    static boolean bb;
    static f bc;
    static f bd;
    static f be;
    static f bf;
    static f bg;
    static boolean bh;
    static int bi;
    static f bj;
    static boolean bk;
    static f bl;
    static f bm;
    static f bn;
    static f bo;
    static f bp;
    static f bq;
    static f br;
    static f bs;
    static int bt;
    static f bu;
    static f bv;
    static boolean bw;
    static boolean bx;
    static boolean by;
    static boolean bz;
    static boolean bA;
    static f bB;
    static f bC;
    static f bD;
    static f bE;
    static f bF;
    static f bG;
    static f bH;
    static f bI;
    static int bJ;
    static f bK;
    static f bL;
    static f bM;
    static int bN;
    static int bO;
    static f bP;
    static f bQ;
    static f bR;
    static f bS;
    static f bT;
    static f bU;
    static f bV;
    static f bW;
    static f bX;
    static f bY;
    static String[] bZ;
    static int[][] ca;
    static int cb;
    static int cc;
    static byte[] cd;
    static int ce;
    static boolean cf;
    static int[] cg;
    static int[] ch;
    static byte[] ci;
    static boolean cj;
    static int ck;
    static int cl;
    static final int[] cm;
    static final boolean[][] cn;
    static final int[] co;
    static final boolean[][] cp;
    static final int[] cq;
    static final boolean[][] cr;
    static final int[] cs;
    static final boolean[][] ct;
    static final int[] cu;
    static final boolean[][] cv;
    static final int[] cw;
    static final boolean[][] cx;
    static final int[] cy;
    static final boolean[][] cz;
    static final int[] cA;
    static final boolean[][] cB;
    static final int[] cC;
    static final boolean[][] cD;
    static final int[] cE;
    static final boolean[][] cF;
    static final int[] cG;
    static final boolean[][] cH;
    static final int[] cI;
    static final boolean[][] cJ;
    static final int cK;
    static final int cL;
    static int cM;
    static int cN;
    static boolean cO;
    static int cP;
    static final int[][] cQ;
    static final int[][] cR;
    static int cS;
    static int cT;
    static int[] cU;
    static int[][] cV;
    static int cW;
    static int cX;
    static int cY;
    static boolean cZ;
    static int da;
    static int db;
    static int dc;
    static boolean dd;
    static boolean de;
    static int df;
    static int[] dg;
    static int[] dh;
    static int di;
    static int dj;
    static int dk;
    static int dl;
    static int dm;
    static String dn;
    static String do;
    static Vector dp;
    static int dq;
    static int dr;
    static int ds;
    static int dt;
    static int du;
    static int dv;
    static int dw;
    static int[] dx;
    static int[] dy;
    static boolean dz;
    static boolean dA;
    static StringBuffer dB;
    static int dC;
    static long dD;
    static int dE;
    static char dF;
    static int dG;
    static int dH;
    static int dI;
    static int[] dJ;
    static int[] dK;
    static int[] dL;
    static Vector dM;
    static Vector dN;
    static int[] dO;
    static int[] dP;
    static int[] dQ;
    static f dR;
    static f dS;
    static int[] dT;
    static int[] dU;
    static int[] dV;
    static int[] dW;
    static int[] dX;
    static int[][] dY;
    static c[] dZ;
    static b[] ea;
    static final int[] eb;
    static short ec;
    static short ed;
    static short ee;
    static short ef;
    static short eg;
    static short eh;
    static short ei;
    static short[] ej;
    static short ek;
    static short el;
    static short em;
    static short en;
    static short eo;
    static short ep;
    static short[] eq;
    static int er;
    static short[] es;
    static short et;
    static short eu;
    static int ev;
    static int ew;
    static byte[] ex;
    static byte[] ey;
    static byte ez;
    static int[][] eA;
    static f[] eB;
    static int[][][] eC;
    static int[] eD;
    static f eE;
    static int eF;
    static int eG;
    static int eH;
    static int eI;
    static int eJ;
    static String eK;
    static boolean eL;
    static final int[] eM;
    static int eN;
    static int eO;
    static int eP;
    static int eQ;
    static boolean eR;
    static boolean[] eS;
    static boolean eT;
    static boolean eU;
    static int eV;
    static int eW;
    static int eX;
    static int eY;
    static int eZ;
    static int[][][] fa;
    static int[][] fb;
    static int fc;
    static int fd;
    static int fe;
    static int ff;
    static boolean fg;
    static int fh;
    static int fi;
    static int fj;
    static int fk;
    static boolean fl;
    static boolean fm;
    static int fn;
    static final int[] fo;
    static int[] fp;
    static int fq;
    static int fr;
    static int[] fs;
    static int ft;
    static int fu;
    static int fv;
    static int fw;
    static int fx;
    static Vector fy;
    static Object[] fz;
    static Vector fA;
    static int fB;
    static int fC;
    static int fD;
    static Vector fE;
    static int fF;
    static boolean fG;
    static boolean fH;
    static int fI;
    static int[] fJ;
    static int[] fK;
    static boolean fL;
    static int[] fM;
    static boolean fN;
    static Object[] fO;
    static int fP;
    static boolean fQ;
    static int fR;
    static int fS;
    static int fT;
    static boolean fU;
    static boolean fV;
    static int fW;
    static int fX;
    static int[][] fY;
    static f fZ;
    static int[][] ga;
    static boolean gb;
    static boolean gc;
    static int gd;
    static boolean ge;
    static boolean gf;
    static int gg;
    static int gh;
    static int gi;
    static f gj;
    static int gk;
    static int gl;
    static int gm;
    static int gn;
    static int go;
    static int gp;
    static int gq;
    static int gr;
    static boolean[] gs;
    static int[][][] gt;
    static boolean[] gu;
    static boolean[] gv;
    static int[][] gw;
    static int[][] gx;
    static boolean gy;
    static long gz;
    static int gA;
    static long gB;
    static int[][] gC;
    static int gD;
    static boolean gE;
    static int gF;
    static int gG;
    static final int[] gH;
    static final int[] gI;
    static boolean gJ;
    static int[] gK;
    static boolean[] gL;
    static Vector gM;
    static Vector gN;
    static int gO;
    static int gP;
    static String gQ;
    static boolean gR;
    static boolean gS;
    static int gT;
    static boolean gU;
    protected static final int[] gV;
    static boolean gW;
    static boolean gX;
    public static int gY;
    public static boolean gZ;
    public static String[] ha;
    public static boolean hb;
    private static String hc;

    static final void a(String string) {
    }

    static final void a(Throwable throwable) {
    }

    static final int a() {
        return D.nextInt();
    }

    static final int a(int n) {
        int n2 = 0;
        if (n > 0) {
            int n3;
            while ((n3 = h.a() & Integer.MAX_VALUE) - (n2 = n3 % n) + n - 1 < 0) {
            }
        }
        return n2;
    }

    static final int a(int n, int n2, int n3) {
        int n4 = 4 * h.d(n3, n2);
        int n5 = -h.d(n4, n2);
        return h.c(h.c(n5, n) + n4, n);
    }

    static final int b(int n) {
        return n > 0 ? 1 : (n < 0 ? -1 : 0);
    }

    static final int a(int n, int n2) {
        return (n - h.b(n, n2)) / n2;
    }

    static final int b(int n, int n2) {
        int n3 = n % n2;
        if (n3 < 0) {
            n3 += n2;
        }
        return n3;
    }

    static final int a(int n, int n2, int n3, int n4, int n5) {
        int n6 = n;
        int n7 = n2 - n;
        int n8 = n4 - n3;
        if (n7 != 0 && n8 != 0) {
            n6 += (int)((long)n7 * (long)(n5 - n3) / (long)n8);
        }
        return n6;
    }

    static final int c(int n) {
        int n2 = 0;
        for (int i = 1; i < n; i *= 2) {
            ++n2;
        }
        return n2;
    }

    static final int b(int n, int n2, int n3) {
        return h.d(n) + h.d(h.d(n2), h.d(n3));
    }

    static final int d(int n) {
        long l = (long)n << 16;
        if (l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)l;
    }

    static final int a(long l) {
        if (l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)l;
    }

    static final int c(int n, int n2) {
        return h.a((long)n * (long)n2 + 32768L >> 16);
    }

    static final int d(int n, int n2) {
        return h.a(((long)n << 16) / (long)n2);
    }

    static final int e(int n) {
        int n2 = n + 65536 >> 1;
        for (int i = 0; i < 8; ++i) {
            n2 = n2 + h.d(n, n2) >> 1;
        }
        return n2;
    }

    static final int a(int[] nArray, int[] nArray2) {
        return h.e(nArray[0] - nArray2[0], nArray[1] - nArray2[1]);
    }

    static final int e(int n, int n2) {
        if (n < 0) {
            n = -n;
        }
        if (n2 < 0) {
            n2 = -n2;
        }
        int n3 = n;
        if (n2 < n) {
            n3 = n2;
        }
        return n + n2 - (n3 >> 1) - (n3 >> 2) + (n3 >> 4);
    }

    static final int c(int n, int n2, int n3) {
        int n4;
        if (n < 0) {
            n = -n;
        }
        if (n2 < 0) {
            n2 = -n2;
        }
        if (n3 < 0) {
            n3 = -n3;
        }
        if (n2 < n) {
            n4 = n;
            n = n2;
            n2 = n4;
        }
        if (n3 < n2) {
            n4 = n2;
            n2 = n3;
            n3 = n4;
        }
        if (n2 < n) {
            n4 = n;
            n = n2;
            n2 = n4;
        }
        return n3 + 11 * (n2 >> 5) + (n >> 2);
    }

    static final int f(int n) {
        int n2 = 65536;
        int n3 = h.c(n, n);
        int n4 = h.c(n3, n);
        int n5 = h.c(n3, n3);
        int n6 = h.c(n5, n);
        int n7 = h.c(n5, n3);
        int n8 = h.c(n7, n);
        int n9 = h.c(n5, n5);
        return n2 + n + h.d(n3, E[2]) + h.d(n4, E[3]) + h.d(n5, E[4]) + h.d(n6, E[5]) + h.d(n7, E[6]) + h.d(n8, E[7]) + h.d(n9, E[8]);
    }

    static final int[] f(int n, int n2) {
        int[] nArray = new int[]{n, n2};
        return nArray;
    }

    static final void a(int[] nArray) {
        nArray[0] = 0;
        nArray[1] = 0;
        nArray[2] = 0;
    }

    static final void b(int[] nArray, int[] nArray2) {
        nArray[0] = nArray2[0];
        nArray[1] = nArray2[1];
        nArray[2] = nArray2[2];
    }

    static final void a(int[] nArray, int[] nArray2, int[] nArray3) {
        nArray[0] = nArray2[0] + nArray3[0];
        nArray[1] = nArray2[1] + nArray3[1];
        nArray[2] = nArray2[2] + nArray3[2];
    }

    static final void b(int[] nArray, int[] nArray2, int[] nArray3) {
        nArray[0] = nArray2[0] - nArray3[0];
        nArray[1] = nArray2[1] - nArray3[1];
    }

    static final void c(int[] nArray, int[] nArray2, int[] nArray3) {
        nArray[0] = nArray2[0] - nArray3[0];
        nArray[1] = nArray2[1] - nArray3[1];
        nArray[2] = nArray2[2] - nArray3[2];
    }

    static final void c(int[] nArray, int[] nArray2) {
        int n = nArray2[0];
        nArray[0] = -nArray2[1];
        nArray[1] = n;
    }

    static final int d(int[] nArray, int[] nArray2) {
        return h.c(nArray[0], nArray2[0]) + h.c(nArray[1], nArray2[1]);
    }

    static final void a(int[] nArray, int n, int n2) {
        h.i(n, n2);
        nArray[0] = I;
        nArray[1] = J;
    }

    static final int b(int[] nArray) {
        return h.g(nArray[0], nArray[1]);
    }

    static final int c(int[] nArray) {
        return h.e(nArray[0], nArray[1]);
    }

    static final void a(int[] nArray, int[] nArray2, int[] nArray3, int n, int n2, int n3) {
        for (int i = 0; i < 2; ++i) {
            nArray[i] = h.a(nArray2[i], nArray3[i], n, n2, n3);
        }
    }

    static final void b(int[] nArray, int[] nArray2, int[] nArray3, int n, int n2, int n3) {
        for (int i = 0; i < 3; ++i) {
            nArray[i] = h.a(nArray2[i], nArray3[i], n, n2, n3);
        }
    }

    static final int g(int n) {
        n = h.b(n, 411776);
        int n2 = 1;
        if (n > 205888) {
            n -= 205888;
            n2 = -1;
        }
        if (n > 102944) {
            n = 205888 - n;
        }
        int n3 = 0;
        int n4 = 0;
        for (int i = 0; i < H; ++i) {
            n4 = 102944 * (i + 1) / H;
            if (n >= n3 && n <= n4) {
                return h.a(G[i], G[i + 1], n3, n4, n) * n2;
            }
            n3 = n4;
        }
        return 0;
    }

    static final int h(int n) {
        return h.g(n + 102944);
    }

    static final int g(int n, int n2) {
        if (n == 0 && n2 == 0) {
            return Integer.MIN_VALUE;
        }
        int n3 = -1;
        int n4 = 102944;
        if (n < 0) {
            n3 = -n3;
            n = -n;
        }
        if (n2 < 0) {
            n3 = -n3;
            n4 = -n4;
            n2 = -n2;
        }
        int n5 = h.c(n2, G[0]) - h.c(n, G[H]);
        int n6 = 0;
        for (int i = 0; i < H; ++i) {
            n6 = h.c(n2, G[1 + i]) - h.c(n, G[H - 1 - i]);
            if (n5 <= 0 && n6 >= 0) {
                return h.a(n4 + n3 * 102944 * i / H, n4 + n3 * 102944 * (i + 1) / H, n5, n6, 0);
            }
            n5 = n6;
        }
        return Integer.MIN_VALUE;
    }

    static final int i(int n) {
        if ((n = h.b(n, 411776)) > 205888) {
            n -= 411776;
        }
        return n;
    }

    static final int j(int n) {
        return h.b(n, 411776);
    }

    static final int h(int n, int n2) {
        return h.i(n - n2);
    }

    static final boolean d(int n, int n2, int n3) {
        return h.h(n, n2) >= 0 && h.h(n, n3) <= 0;
    }

    static final int a(int n, int n2, boolean bl) {
        while (n < 0) {
            n += 411776;
        }
        if (bl) {
            return n * n2 / 411776;
        }
        return (n * n2 + 205888) / 411776 % n2;
    }

    static final void i(int n, int n2) {
        I = h.c(n2, h.h(n));
        J = h.c(n2, h.g(n));
    }

    static final boolean e(int[] nArray, int[] nArray2) {
        return h.e(nArray[0] - nArray2[0], nArray[1] - nArray2[1]) < nArray[2] + nArray2[2];
    }

    static final boolean f(int[] nArray, int[] nArray2) {
        return Math.max(nArray[0], nArray2[0] - nArray2[2]) < Math.min(nArray[2], nArray2[0] + nArray2[2]) && Math.max(nArray[1], nArray2[1] - nArray2[2]) < Math.min(nArray[3], nArray2[1] + nArray2[2]);
    }

    static final boolean g(int[] nArray, int[] nArray2) {
        return h.d(nArray, nArray2, null);
    }

    static final boolean d(int[] nArray, int[] nArray2, int[] nArray3) {
        int n = Math.max(nArray[0], nArray2[0]);
        int n2 = Math.max(nArray[1], nArray2[1]);
        int n3 = Math.min(nArray[2], nArray2[2]);
        int n4 = Math.min(nArray[3], nArray2[3]);
        if (nArray3 != null) {
            nArray3[0] = n;
            nArray3[1] = n2;
            nArray3[2] = n3;
            nArray3[3] = n4;
        }
        return n < n3 && n2 < n4;
    }

    static final int k(int n) {
        return n >> 16 & 0xFF;
    }

    static final int l(int n) {
        return n >> 8 & 0xFF;
    }

    static final int m(int n) {
        return n >> 0 & 0xFF;
    }

    static final int e(int n, int n2, int n3) {
        return (n & 0xFF) << 16 | (n2 & 0xFF) << 8 | (n3 & 0xFF) << 0;
    }

    static final int b(int n, int n2, int n3, int n4, int n5) {
        return h.e(h.a(h.k(n), h.k(n2), n3, n4, n5), h.a(h.l(n), h.l(n2), n3, n4, n5), h.a(h.m(n), h.m(n2), n3, n4, n5));
    }

    static final String a(DataInputStream dataInputStream) throws IOException {
        byte[] byArray = new byte[dataInputStream.readShort()];
        dataInputStream.readFully(byArray);
        return new String(byArray, "ISO-8859-1");
    }

    static final String[] b(DataInputStream dataInputStream) throws IOException {
        String[] stringArray = new String[dataInputStream.readShort()];
        for (int i = 0; i < stringArray.length; ++i) {
            stringArray[i] = h.a(dataInputStream);
        }
        return stringArray;
    }

    static final String[] c(DataInputStream dataInputStream) throws IOException {
        String[] stringArray = new String[dataInputStream.readShort()];
        for (int i = 0; i < stringArray.length; ++i) {
            stringArray[i] = dataInputStream.readUTF();
        }
        return stringArray;
    }

    static final short[] d(DataInputStream dataInputStream) throws IOException {
        short[] sArray = new short[dataInputStream.readShort()];
        for (int i = 0; i < sArray.length; ++i) {
            sArray[i] = dataInputStream.readShort();
        }
        return sArray;
    }

    static final short[][] e(DataInputStream dataInputStream) throws IOException {
        short[][] sArrayArray = new short[dataInputStream.readShort()][];
        for (int i = 0; i < sArrayArray.length; ++i) {
            sArrayArray[i] = h.d(dataInputStream);
        }
        return sArrayArray;
    }

    static final short[][][] f(DataInputStream dataInputStream) throws IOException {
        short[][][] sArrayArray = new short[dataInputStream.readShort()][][];
        for (int i = 0; i < sArrayArray.length; ++i) {
            sArrayArray[i] = h.e(dataInputStream);
        }
        return sArrayArray;
    }

    static final int[] g(DataInputStream dataInputStream) throws IOException {
        int[] nArray = new int[dataInputStream.readShort()];
        for (int i = 0; i < nArray.length; ++i) {
            nArray[i] = dataInputStream.readInt();
        }
        return nArray;
    }

    static final void a(DataOutputStream dataOutputStream, int[] nArray) throws IOException {
        dataOutputStream.writeShort(nArray.length);
        for (int i = 0; i < nArray.length; ++i) {
            dataOutputStream.writeInt(nArray[i]);
        }
    }

    static final void h(DataInputStream dataInputStream) throws IOException {
        K = new int[dataInputStream.readShort()][];
        for (int i = 0; i < K.length; ++i) {
            int n = dataInputStream.readInt();
            h.K[i] = new int[n / 3];
            for (int j = 0; j < n / 3; ++j) {
                int n2 = dataInputStream.readUnsignedByte();
                int n3 = dataInputStream.readUnsignedByte();
                int n4 = dataInputStream.readUnsignedByte();
                h.K[i][j] = g.a(n2, n3, n4);
            }
        }
        h.a(K.length + " palettes loaded");
    }

    static final void b() {
        L = new d[K.length][];
        for (int i = 0; i < L.length; ++i) {
            h.L[i] = new d[O.length];
        }
    }

    static final void c() {
        for (int i = 0; i < L[0].length; ++i) {
            h.L[0][i] = O[i];
        }
    }

    static final void j(int n, int n2) {
        if (null != L[n2][n]) {
            return;
        }
        if (n2 == 0) {
            return;
        }
        d d2 = O[n];
        if (null == d2) {
            for (int i = 0; i < L.length; ++i) {
                if (null == L[i][n]) continue;
                d2 = L[i][n];
                break;
            }
        }
        h.L[n2][n] = d2.a(K[n2]);
    }

    static final void k(int n, int n2) {
        h.L[n2][n] = null;
    }

    static final void l(int n, int n2) {
        if (n < 0) {
            return;
        }
        h.O[n] = L[n2][n];
    }

    static final boolean m(int n, int n2) {
        return null != L[n2][n];
    }

    static final void i(DataInputStream dataInputStream) throws IOException {
        int n;
        int n2 = dataInputStream.readShort();
        P = new short[n2 + 1];
        R = new short[n2 * 4];
        int n3 = 0;
        for (n = 1; n <= n2; ++n) {
            h.R[n3++] = dataInputStream.readShort();
            h.R[n3++] = dataInputStream.readShort();
            h.R[n3++] = dataInputStream.readShort();
            h.R[n3++] = dataInputStream.readShort();
            h.P[n] = dataInputStream.readShort();
        }
        n = P[P.length - 1];
        Q = new short[n];
        for (n3 = 0; n3 < n; ++n3) {
            h.Q[n3] = dataInputStream.readShort();
        }
        N = new byte[35];
        O = new d[35];
        M = h.c(dataInputStream);
    }

    static final void n(int n) {
        int n2 = n;
        byte by = N[n2];
        N[n2] = (byte)(by + 1);
        if (by == 0) {
            try {
                h.a("Loading image: " + M[n]);
                h.O[n] = d.a(M[n]);
            }
            catch (Exception exception) {
                h.a(exception);
            }
        }
    }

    static final void o(int n) {
        if (N[n] == 0) {
            return;
        }
        int n2 = n;
        N[n2] = (byte)(N[n2] - 1);
        if (N[n2] == 0) {
            h.a("Unloading image: " + M[n]);
            h.O[n] = null;
        }
    }

    static final void a(int n, int n2, int n3, int[] nArray, int n4) {
        int n5 = n * 4;
        int n6 = R[n5++];
        int n7 = R[n5++];
        short s = R[n5++];
        short s2 = R[n5++];
        if (0 != (n4 & 1)) {
            n6 = -(n6 + s - 1);
        }
        if (0 != (n4 & 2)) {
            n7 = -(n7 + s2 - 1);
        }
        nArray[0] = n6 += n2;
        nArray[1] = n7 += n3;
        nArray[2] = n6 + s;
        nArray[3] = n7 + s2;
    }

    static final short p(int n) {
        return R[n * 4 + 2];
    }

    static final short q(int n) {
        return R[n * 4 + 3];
    }

    static final int r(int n) {
        short s = P[n];
        short s2 = P[n + 1];
        block7: while (s != s2) {
            short s3 = s;
            s = (short)(s + 1);
            short s4 = Q[s3];
            switch (s4 & 0xFF) {
                case 0: {
                    return s4 >> 8;
                }
                case 1: 
                case 2: {
                    continue block7;
                }
                case 3: {
                    s = (short)(s + 2);
                    continue block7;
                }
                case 4: {
                    short s5 = s;
                    s = (short)(s + 1);
                    return h.r(Q[s5]);
                }
                case 5: {
                    s = (short)(s + 3);
                    continue block7;
                }
            }
            return -1;
        }
        return -1;
    }

    static final boolean a(g g2, int n, int n2, int n3) {
        return h.a(g2, n, n2, n3, 0);
    }

    static final boolean a(g g2, int n, int n2, int n3, int n4) {
        h.a(n, n2, n3, r, n4);
        h.s[0] = g2.d();
        h.s[1] = g2.e();
        h.s[2] = s[0] + g2.f();
        h.s[3] = s[1] + g2.g();
        if (Math.max(r[0], s[0]) >= Math.min(r[2], s[2]) || Math.max(r[1], s[1]) >= Math.min(r[3], s[3])) {
            return true;
        }
        int n5 = 0;
        int n6 = 0;
        short s = P[n];
        short s2 = P[n + 1];
        while (s != s2) {
            short s3 = s;
            s = (short)(s + 1);
            short s4 = Q[s3];
            block0 : switch (s4 & 0xFF) {
                case 0: {
                    d d2 = O[s4 >> 8];
                    if (null == d2) {
                        return false;
                    }
                    short s5 = s;
                    s = (short)(s + 1);
                    short s6 = s;
                    s = (short)(s + 1);
                    g2.a(d2, Q[s5], Q[s6], r[2] - r[0], r[3] - r[1], r[0], r[1], 0 != (n4 & 1), 0 != (n4 & 2));
                    break;
                }
                case 1: {
                    n4 ^= 1;
                    break;
                }
                case 2: {
                    n4 ^= 2;
                    break;
                }
                case 3: {
                    int n7;
                    int n8;
                    if (0 != (n4 & 1)) {
                        short s7 = s;
                        s = (short)(s + 1);
                        n8 = -Q[s7];
                    } else {
                        short s8 = s;
                        s = (short)(s + 1);
                        n8 = n5 = Q[s8];
                    }
                    if (0 != (n4 & 2)) {
                        short s9 = s;
                        s = (short)(s + 1);
                        n7 = -Q[s9];
                    } else {
                        short s10 = s;
                        s = (short)(s + 1);
                        n7 = Q[s10];
                    }
                    n6 = n7;
                    break;
                }
                case 4: {
                    if (0 == (n4 & 4)) {
                        short s11 = s;
                        s = (short)(s + 1);
                        if (h.a(g2, (int)Q[s11], n2 + n5, n3 + n6, n4)) break;
                        return false;
                    }
                    s = (short)(s + 1);
                    break;
                }
                case 5: {
                    short s12 = s;
                    short s13 = s = (short)(s + 1);
                    short s14 = s = (short)(s + 1);
                    s = (short)(s + 1);
                    if ((long)Q[s12] == d / (long)Q[s13] % (long)Q[s14]) {
                        n4 &= 0xFFFFFFFB;
                        break;
                    }
                    n4 |= 4;
                    break;
                }
                case 6: {
                    short s15 = s;
                    short s16 = s = (short)(s + 1);
                    s = (short)(s + 1);
                    g2.a(Q[s15] << 16 | Q[s16] & 0xFFFF);
                    break;
                }
                case 10: {
                    short s17;
                    short s18;
                    if (0 == (n4 & 1)) {
                        short s19 = s;
                        s = (short)(s + 1);
                        s18 = Q[s19];
                    } else {
                        short s20 = s;
                        s = (short)(s + 1);
                        s18 = -Q[s20];
                    }
                    int n9 = n2 + n5 + s18;
                    if (0 == (n4 & 2)) {
                        short s21 = s;
                        s = (short)(s + 1);
                        s17 = Q[s21];
                    } else {
                        short s22 = s;
                        s = (short)(s + 1);
                        s17 = -Q[s22];
                    }
                    g2.b(n2 + n5, n3 + n6, n9, n3 + n6 + s17);
                    break;
                }
                case 11: 
                case 12: 
                case 13: 
                case 14: {
                    short s23 = s;
                    s = (short)(s + 1);
                    short s24 = Q[s23];
                    short s25 = s;
                    s = (short)(s + 1);
                    short s26 = Q[s25];
                    int n10 = n2 + n5 + (0 == (n4 & 1) ? (short)0 : -s24);
                    int n11 = n3 + n6 + (0 == (n4 & 2) ? (short)0 : -s26);
                    switch (s4 & 0xFF) {
                        case 11: {
                            g2.d(n10, n11, s24, s26);
                            break block0;
                        }
                        case 12: {
                            g2.c(n10, n11, s24, s26);
                            break block0;
                        }
                        case 13: {
                            g2.b(n10, n11, s24, s26, 0, 360);
                            break block0;
                        }
                        case 14: {
                            g2.a(n10, n11, s24, s26, 0, 360);
                        }
                    }
                }
            }
        }
        return true;
    }

    static final int s(int n) {
        if (h.n) {
            switch (n) {
                case 50: {
                    return 0;
                }
                case 52: {
                    return 3;
                }
                case 53: {
                    return 4;
                }
                case 54: {
                    return 1;
                }
                case 56: {
                    return 2;
                }
            }
        }
        switch (n) {
            case 48: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 54: 
            case 55: 
            case 56: 
            case 57: {
                return 10 + n - 48;
            }
            case 42: {
                return 5;
            }
            case 35: {
                return 6;
            }
            case -6: {
                return 7;
            }
            case -7: {
                return 8;
            }
            case -10: {
                return -1;
            }
            case -8: {
                return 9;
            }
        }
        try {
            switch (b.getGameAction(n)) {
                case 1: {
                    return 0;
                }
                case 6: {
                    return 2;
                }
                case 2: {
                    return 3;
                }
                case 5: {
                    return 1;
                }
                case 8: {
                    return 4;
                }
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        h.a("Unknown key: " + n);
        return -1;
    }

    static void j(DataInputStream dataInputStream) throws IOException {
        T = new String[dataInputStream.readShort()][];
        U = new int[T.length];
        for (int i = 0; i < T.length; ++i) {
            dataInputStream.readInt();
            h.T[i] = h.b(dataInputStream);
            h.U[i] = dataInputStream.readShort();
        }
        if (!W) {
            h.c(2, false);
            while (!W) {
                h.mc();
                h.me();
                try {
                    Thread.sleep(100L);
                }
                catch (Exception exception) {}
            }
        }
        S = T[V];
        gY = V;
        T = null;
        h.u(U[V]);
    }

    static void a(g g2) {
        if (null == T) {
            return;
        }
        if (null == T[0]) {
            return;
        }
        int n = g2.d();
        int n2 = g2.e();
        int n3 = g2.f();
        int n4 = g2.g();
        g2.a(0);
        g2.d(n, n2, n3, n4);
        int n5 = h.v(0) + 4;
        int n6 = n4 / 2 - T.length * n5 / 2;
        for (int i = 0; i < T.length; ++i) {
            if (i == V) {
                g2.a(0xFFFFFF);
                g2.d(n + (n3 - 80) / 2, n2 + n6 + i * n5, 80, n5);
            }
            h.u(U[i]);
            h.a(g2, T[i][1], 0, n + n3 / 2, n2 + n6 + i * n5 + n5 / 2, 3);
        }
    }

    static void t(int n) {
        if (null == T) {
            return;
        }
        switch (n) {
            case 4: {
                W = true;
                break;
            }
            case 0: {
                V = (V - 1 + T.length) % T.length;
                break;
            }
            case 2: {
                V = (V + 1) % T.length;
            }
        }
    }

    static final void k(DataInputStream dataInputStream) throws IOException {
        int n;
        int n2;
        int n3;
        ac = 0;
        int n4 = dataInputStream.readShort();
        d[] dArray = new d[n4];
        short[][][] sArrayArray = new short[n4][][];
        short[][][] sArrayArray2 = new short[n4][][];
        int[] nArray = new int[n4];
        for (n3 = 0; n3 < n4; ++n3) {
            dArray[n3] = d.a("/" + dataInputStream.readUTF() + ".png");
            n2 = dataInputStream.readShort();
            sArrayArray[n3] = new short[n2][];
            sArrayArray2[n3] = new short[n2][];
            nArray[n3] = 0;
            for (n = 0; n < n2; ++n) {
                dataInputStream.readInt();
                sArrayArray[n3][n] = new short[256];
                sArrayArray2[n3][n] = new short[256];
                nArray[n3] = dataInputStream.readShort();
                int n5 = 0;
                while (n5 < 256) {
                    sArrayArray2[n3][n][n5] = dataInputStream.readShort();
                    sArrayArray[n3][n][n5] = dataInputStream.readShort();
                    short[] sArray = sArrayArray[n3][n];
                    int n6 = n5++;
                    sArray[n6] = (short)(sArray[n6] - nArray[n3]);
                }
            }
        }
        n3 = dataInputStream.readShort();
        X = new d[n3];
        Y = new int[n3];
        Z = new short[n3][][];
        aa = new short[n3][][];
        ab = new int[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            n = dataInputStream.readInt();
            int n7 = dataInputStream.readInt();
            h.X[n2] = n7 == -1 ? dArray[n] : dArray[n].a(K[n7]);
            h.Y[n2] = dArray[n].a();
            h.Z[n2] = sArrayArray[n];
            h.aa[n2] = sArrayArray2[n];
            h.ab[n2] = nArray[n];
        }
    }

    static final void u(int n) {
        ac = n;
    }

    static final int v(int n) {
        return Y[n];
    }

    static final int a(int n, String string) {
        int n2 = 0;
        char[] cArray = string.toCharArray();
        int n3 = cArray.length;
        short[] sArray = Z[n][ac];
        for (int i = 0; i < n3; ++i) {
            n2 += sArray[cArray[i] & 0xFF];
        }
        return n2 + ab[n];
    }

    static final Vector a(String string, int n, int n2) {
        short[] sArray = Z[n][ac];
        Vector<String> vector = new Vector<String>();
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = string.length();
        int n7 = 0;
        while (n7 <= n6) {
            boolean bl = false;
            int n8 = 10;
            if (n7 < n6) {
                n8 = string.charAt(n7);
            }
            if (n8 == 32) {
                n4 = n7;
            }
            if (n8 == 10) {
                bl = true;
            } else if ((n5 += sArray[n8 & 0xFF]) > n2) {
                bl = true;
            }
            if (bl) {
                if (n4 == n3 || n8 == 10) {
                    n4 = n7;
                }
                if (n4 != n3) {
                    n7 = n4;
                }
                if (n8 == 10 || n8 == 32) {
                    // empty if block
                }
                vector.addElement(string.substring(n3, n4).trim());
                n3 = ++n7;
                n4 = n7;
                n5 = 0;
                continue;
            }
            ++n7;
        }
        return vector;
    }

    static final void a(g g2, int n, char[] cArray, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        int n10 = 0;
        int n11 = Y[n];
        n11 = Math.min(n10 + n11, n5 + n7);
        if ((n11 -= (n10 = Math.max(n10, n5))) <= 0) {
            return;
        }
        d d2 = X[n];
        short[] sArray = Z[n][ac];
        short[] sArray2 = aa[n][ac];
        int n12 = ab[n];
        int n13 = 0;
        for (int i = 0; i < n3; ++i) {
            int n14 = cArray[n2 + i] & 0xFF;
            int n15 = sArray2[n14];
            int n16 = sArray[n14];
            int n17 = Math.max(n13, n4);
            int n18 = Math.min(n13 + n16, n4 + n6);
            if ((n16 = n18 - n17) > 0) {
                g2.a(d2, n15 += n17 - n13, n10, n16 + n12, n11, n8, n9, false, false);
                n8 += n16;
            }
            n13 += sArray[n14];
        }
    }

    static final void a(g g2, String string, int n, int n2, int n3, int n4) {
        int n5 = h.a(n, string);
        int n6 = h.v(n);
        if ((n4 & 1) != 0) {
            n2 -= n5 / 2;
        }
        if ((n4 & 8) != 0) {
            n2 -= n5;
        }
        if ((n4 & 2) != 0) {
            n3 -= n6 / 2;
        }
        if ((n4 & 0x20) != 0) {
            n3 -= n6;
        }
        int n7 = g2.d();
        int n8 = g2.e();
        int n9 = g2.f();
        int n10 = g2.g();
        int n11 = Math.max(n7, n2);
        int n12 = Math.max(n8, n3);
        int n13 = Math.min(n7 + n9, n2 + n5) - n11;
        int n14 = Math.min(n8 + n10, n3 + n6) - n12;
        h.a(g2, n, string.toCharArray(), 0, string.length(), n11 - n2, n12 - n3, n13, n14, n11, n12);
        g2.a(n7, n8, n9, n10);
    }

    static final void a(g g2, Vector vector, int n, int n2, int n3, int n4) {
        int n5 = h.v(n);
        int n6 = n5 * vector.size();
        if ((n4 & 2) != 0) {
            n3 -= n6 / 2;
            n3 += n5 / 2;
        }
        if ((n4 & 0x20) != 0) {
            n3 -= n6;
            n3 += n5;
        }
        for (int i = 0; i < vector.size(); ++i) {
            h.a(g2, (String)vector.elementAt(i), n, n2, n3 + i * n5, n4);
        }
    }

    static final String a(String string, Object[] objectArray, int n) {
        String string2 = new String(string);
        if (null == objectArray) {
            return string2;
        }
        for (int i = n - 1; i >= 0; --i) {
            String string3 = "%" + (i + 1);
            int n2 = string2.indexOf(string3);
            if (n2 < 0) continue;
            string3 = string2.substring(n2 + string3.length());
            String string4 = null == objectArray[i] ? "null" : objectArray[i].toString();
            string2 = string2.substring(0, n2) + string4 + string3;
        }
        return string2;
    }

    static final String a(String string, Object object) {
        h.ad[0] = object;
        return h.a(string, ad, 1);
    }

    static final void l(DataInputStream dataInputStream) throws IOException {
        ae = h.f(dataInputStream);
        h.a(ae.length + " clips loaded");
    }

    static void m(DataInputStream dataInputStream) throws IOException {
        try {
            short s = dataInputStream.readShort();
            ah = new String[s];
            ai = new String[s];
            aj = new Player[s];
            ak = new int[s];
            al = new boolean[s];
            for (int i = 0; i < aj.length; ++i) {
                h.a("Loading sound: " + i);
                h.ah[i] = dataInputStream.readUTF();
                h.ai[i] = dataInputStream.readUTF();
                h.ak[i] = dataInputStream.readInt();
                h.al[i] = dataInputStream.readBoolean();
                if (al[i]) continue;
                h.w(i);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        h.a(true);
    }

    static boolean w(int n) {
        if (null != aj[n]) {
            return true;
        }
        if (ah[n].length() == 0 || ai[n].length() == 0) {
            return false;
        }
        try {
            Player player = Manager.createPlayer(b.getClass().getResourceAsStream("/" + ah[n]), ai[n]);
            player.addPlayerListener(b);
            player.realize();
            VolumeControl volumeControl = (VolumeControl)player.getControl("javax.microedition.media.control.VolumeControl");
            if (null != volumeControl) {
                volumeControl.setLevel(100);
            }
            h.aj[n] = player;
            return player.getState() >= 200;
        }
        catch (Exception exception) {
            return false;
        }
    }

    static void x(int n) {
        if (null == aj[n]) {
            return;
        }
        try {
            aj[n].close();
        }
        catch (Exception exception) {
            // empty catch block
        }
        h.aj[n] = null;
        h.a("Sound_Release: " + n);
    }

    static void a(boolean bl) {
        try {
            for (int i = 0; i < aj.length; ++i) {
                Player player = aj[i];
                if (null == player || bl) continue;
                player.stop();
                if (player.getState() != 300) continue;
                player.deallocate();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    static void y(int n) {
        if (an != -1) {
            return;
        }
        an = n;
        h.z(an);
        an = -1;
    }

    static void z(int n) {
        if (ag || !af) {
            return;
        }
        if (n < 0 || n >= aj.length) {
            return;
        }
        if (-1 != h.e() && ak[n] <= ak[h.e()]) {
            return;
        }
        try {
            int n2;
            int n3 = 0;
            for (n2 = 0; n2 < aj.length; ++n2) {
                if (null == aj[n2] || ++n3 < 4 || n2 == n) continue;
                h.x(n2);
            }
            if (!h.w(n)) {
                return;
            }
            Player player = aj[n];
            for (n2 = 0; n2 < aj.length; ++n2) {
                Player player2 = aj[n2];
                if (null == player2 || player2 == player) continue;
                if (player2.getState() == 400) {
                    player2.stop();
                }
                if (player2.getState() != 300) continue;
                player2.deallocate();
            }
            player.setLoopCount(1);
            player.prefetch();
            player.setMediaTime(0L);
            player.start();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    static void d() {
        an = -1;
        try {
            for (int i = 0; i < aj.length; ++i) {
                Player player = aj[i];
                if (null == player) continue;
                if (player.getState() == 400) {
                    player.stop();
                }
                if (player.getState() != 300) continue;
                player.deallocate();
            }
        }
        catch (MediaException mediaException) {
            // empty catch block
        }
    }

    static int e() {
        for (int i = aj.length - 1; i >= 0; --i) {
            Player player = aj[i];
            if (null == player || player.getState() != 400) continue;
            return i;
        }
        return -1;
    }

    static boolean A(int n) {
        Player player = aj[n];
        if (null == player) {
            return false;
        }
        return player.getState() == 400;
    }

    public void playerUpdate(Player player, String string, Object object) {
        if ("endOfMedia" == string) {
            try {
                player.stop();
            }
            catch (MediaException mediaException) {
                // empty catch block
            }
        }
        if ("endOfMedia" == string || "stopped" == string) {
            for (int i = 0; i < al.length; ++i) {
                if (!al[i] || aj[i] != player) continue;
                h.x(i);
                break;
            }
        }
    }

    static void B(int n) {
        if (ao) {
            c.vibrate(n);
        }
    }

    static void f() {
        aw += at;
        ax += av;
    }

    static void g() {
        at = 0;
        au = 0;
        av = 0;
    }

    static void h() {
        ap = S[101];
        ar = 0;
        as = 0;
        aq = false;
        aw = 0;
        ax = 0;
        h.g();
    }

    static void n(DataInputStream dataInputStream) throws IOException {
        ap = dataInputStream.readUTF();
        ar = dataInputStream.readInt();
        as = dataInputStream.readInt();
        aq = dataInputStream.readBoolean();
        aw = dataInputStream.readInt();
        ax = dataInputStream.readInt();
        at = dataInputStream.readInt();
        au = dataInputStream.readInt();
        av = dataInputStream.readInt();
    }

    static void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeUTF(ap);
        dataOutputStream.writeInt(ar);
        dataOutputStream.writeInt(as);
        dataOutputStream.writeBoolean(aq);
        dataOutputStream.writeInt(aw);
        dataOutputStream.writeInt(ax);
        dataOutputStream.writeInt(at);
        dataOutputStream.writeInt(au);
        dataOutputStream.writeInt(av);
    }

    static void C(int n) {
        h.d("$" + n);
        h.D(n);
    }

    static void D(int n) {
        as += n;
        if (n > 0) {
            au += n;
        }
    }

    static void E(int n) {
        h.F(n);
        h.d("-$" + n);
    }

    static void F(int n) {
        as -= n;
        as = Math.max(as, 0);
    }

    static void o(DataInputStream dataInputStream) throws IOException {
        az = new int[dataInputStream.readShort()][5];
        aA = new int[az.length];
        aB = new int[az.length];
        aC = new boolean[az.length];
        for (int i = 0; i < az.length; ++i) {
            h.az[i][0] = dataInputStream.readInt();
            h.az[i][1] = dataInputStream.readShort();
            h.az[i][2] = dataInputStream.readShort();
            h.az[i][3] = dataInputStream.readByte();
            h.az[i][4] = dataInputStream.readInt();
        }
        h.a("Gangs loaded: " + az.length);
    }

    static void i() {
        for (int i = 0; i < az.length; ++i) {
            h.aA[i] = az[i][3];
        }
        aE = false;
    }

    static void j() {
        System.arraycopy(aA, 0, aB, 0, aA.length);
        for (int i = 0; i < aC.length; ++i) {
            h.aC[i] = false;
        }
    }

    static void k() {
        for (int i = 0; i < aB.length; ++i) {
            if (aC[i]) continue;
            h.aA[i] = Math.min(aD[i], aB[i]);
        }
    }

    static void p(DataInputStream dataInputStream) throws IOException {
        for (int i = 0; i < az.length; ++i) {
            h.aA[i] = dataInputStream.readByte();
        }
    }

    static void b(DataOutputStream dataOutputStream) throws IOException {
        for (int i = 0; i < az.length; ++i) {
            dataOutputStream.writeByte(aA[i]);
        }
    }

    static void G(int n) {
        for (int i = 0; i < az.length; ++i) {
            h.n(i, n * -3276 >> 10);
        }
    }

    static boolean n(int n, int n2) {
        int n3;
        if (n == -1 || aE) {
            return false;
        }
        h.aA[n] = n3 = Math.max(0, Math.min(aD[n], aA[n] + n2));
        return true;
    }

    static int o(int n, int n2) {
        int n3 = (n >> ee) / 3;
        int n4 = (n2 >> ee) / 3;
        if (n3 < 0 || n4 < 0 || n3 >= et || n4 >= eu) {
            return -1;
        }
        byte by = ey[n4 * et + n3];
        if (by < 4 || by >= 9) {
            return -1;
        }
        return by - 4;
    }

    static void l() {
        for (int i = 0; i < aD.length; ++i) {
            h.aD[i] = 0x320000;
        }
    }

    static int p(int n, int n2) {
        if (n2 == -1 || n == -1) {
            return 0;
        }
        if (n2 == 0) {
            return aA[n];
        }
        if (n == 0) {
            return aA[n2];
        }
        return 0;
    }

    static int H(int n) {
        if (n == -1) {
            return 0;
        }
        for (int i = 0; i < ay.length; ++i) {
            if (aA[n] >= ay[i]) continue;
            return i;
        }
        return ay.length;
    }

    static boolean q(int n, int n2) {
        int n3;
        if (n != 5) {
            return false;
        }
        int n4 = 0;
        int n5 = 0;
        for (n3 = 0; n3 < eB.length; ++n3) {
            f f2 = eB[n3];
            if (f2.d != n2) continue;
            if (f2.f()) {
                ++n5;
            }
            ++n4;
        }
        n3 = 1;
        if (n2 != 6) {
            n3 += n4 * aA[n] / aD[n];
        }
        return n5 >= n3;
    }

    static void r(int n, int n2) {
        if (n == n2 || n != 0) {
            return;
        }
        int n3 = 163840;
        if (n2 == -1) {
            n2 = 5;
            n3 = 78643;
        }
        h.n(n2, n3);
    }

    static void q(DataInputStream dataInputStream) throws IOException {
        aF = new int[dataInputStream.readShort()][7];
        aG = new int[aF.length];
        aH = new boolean[aF.length];
        for (int i = 0; i < aF.length; ++i) {
            h.aF[i][0] = dataInputStream.readInt();
            h.aF[i][1] = dataInputStream.readInt();
            h.aF[i][2] = dataInputStream.readInt();
            h.aF[i][3] = dataInputStream.readInt();
            h.aF[i][4] = dataInputStream.readInt();
            h.aF[i][5] = dataInputStream.readInt();
            h.aF[i][6] = dataInputStream.readShort();
        }
        h.a("Items loaded: " + aF.length);
    }

    static void m() {
        for (int i = 0; i < aF.length; ++i) {
            h.aG[i] = h.I(i);
            h.aH[i] = h.J(i);
        }
    }

    static void r(DataInputStream dataInputStream) throws IOException {
        for (int i = 0; i < aF.length; ++i) {
            h.aG[i] = dataInputStream.readByte();
            h.aH[i] = dataInputStream.readBoolean();
        }
    }

    static void c(DataOutputStream dataOutputStream) throws IOException {
        for (int i = 0; i < aF.length; ++i) {
            dataOutputStream.writeByte(aG[i]);
            dataOutputStream.writeBoolean(aH[i]);
        }
    }

    static void n() {
        for (int i = 0; i < aF.length; ++i) {
            if (aF[i][0] != 0) continue;
            h.aG[i] = 0;
        }
        h.aG[0] = 1;
    }

    static int I(int n) {
        return n == 0 ? 1 : 0;
    }

    static boolean J(int n) {
        return n == 0 || n == 4 || n == 19 || n == 20 || aF[n][0] == 1;
    }

    static int K(int n) {
        return aF[n][2];
    }

    static boolean s(int n, int n2) {
        return h.b(n, n2, false);
    }

    static boolean b(int n, int n2, boolean bl) {
        h.a("Inc Item " + n + "(" + S[aF[n][4]] + ") " + n2);
        if (0 == n2) {
            return false;
        }
        int n3 = aG[n];
        int n4 = n;
        aG[n4] = aG[n4] + n2;
        h.aG[n] = Math.max(aG[n], 0);
        h.aG[n] = Math.min(aG[n], aF[n][3]);
        if (aF[n][4] == 102) {
            return true;
        }
        int n5 = Math.max(0, aG[n] - n3);
        if (n5 <= 0 && n2 > 0) {
            return false;
        }
        if (!bl) {
            h.c(S[aF[n][4]] + " " + (n2 > 0 ? "+" : "") + n2);
        }
        h.tT(n);
        return true;
    }

    static void L(int n) {
        if (!h.M(n)) {
            return;
        }
        int n2 = n;
        aG[n2] = aG[n2] - 1;
        h.c(h.a(S[151], (Object)S[aF[n][4]]));
        if (1 == aF[n][0]) {
            int n3 = 0;
            switch (n) {
                case 16: {
                    n3 = 20;
                    break;
                }
                case 17: {
                    n3 = 50;
                    break;
                }
                case 18: {
                    n3 = 120;
                }
            }
            h.eE.y = Math.min(h.eE.y + n3, h.eE.g[2]);
        }
        h.tS(n);
    }

    static boolean M(int n) {
        if (-1 == n) {
            return false;
        }
        if (1 == aF[n][0] && h.eE.y >= h.eE.g[2]) {
            return false;
        }
        return n != -1 && aG[n] > 0;
    }

    static void s(DataInputStream dataInputStream) throws IOException {
        aI = new int[dataInputStream.readShort()][7];
        for (int i = 0; i < aI.length; ++i) {
            h.aI[i][1] = dataInputStream.readInt();
            h.aI[i][2] = dataInputStream.readBoolean() ? 1 : 0;
            h.aI[i][3] = dataInputStream.readShort();
            h.aI[i][4] = dataInputStream.readInt();
            h.aI[i][5] = dataInputStream.readInt();
            h.aI[i][6] = dataInputStream.readInt();
        }
        h.a("Quests loaded: " + aI.length);
    }

    static void o() {
        for (int i = 0; i < aI.length; ++i) {
            h.aI[i][0] = 1;
        }
    }

    static void p() {
        int n;
        for (n = aI.length - 1; n >= 0 && !h.Q(n); --n) {
        }
        if (!h.R(aI.length - 1)) {
            while (n >= 0) {
                h.P(n);
                if (0 != aI[n][2]) break;
                --n;
            }
            cb = aI[n][6];
            h.aI[n][0] = 2;
        }
    }

    static void t(DataInputStream dataInputStream) throws IOException {
        for (int i = 0; i < aI.length; ++i) {
            h.aI[i][0] = dataInputStream.readByte();
        }
    }

    static void d(DataOutputStream dataOutputStream) throws IOException {
        for (int i = 0; i < aI.length; ++i) {
            dataOutputStream.writeByte(aI[i][0]);
        }
    }

    static boolean N(int n) {
        if (aI[n][0] >= 2) {
            return false;
        }
        h.a("Quest Activated: " + S[aI[n][4]] + " #" + n);
        h.aI[n][0] = 2;
        h.tQ(n);
        return true;
    }

    static boolean O(int n) {
        if (aI[n][0] >= 4) {
            return false;
        }
        h.a("Quest Completed: " + S[aI[n][4]] + "#" + n);
        h.aI[n][0] = 4;
        h.tR(n);
        return true;
    }

    static boolean P(int n) {
        if (!h.Q(n)) {
            return false;
        }
        h.a("Quest Reseted: " + S[aI[n][4]] + "#" + n);
        h.aI[n][0] = 1;
        return true;
    }

    static boolean Q(int n) {
        return 1 < aI[n][0];
    }

    static boolean R(int n) {
        return 4 == aI[n][0];
    }

    static int q() {
        for (int i = 0; i < aI.length; ++i) {
            if (aI[i][0] != 2) continue;
            return i;
        }
        return -1;
    }

    static void r() {
        h.d(40, true);
        h.d(41, true);
    }

    static void s() {
        if (!h.wc(1)) {
            h.bb(true);
            h.vX(0);
            h.dp(0, 3000);
            h.d(46, false);
            h.d(47, false);
            h.d(49, false);
            h.d(50, false);
            h.d(51, false);
            h.d(52, false);
        }
        h.bc(true);
    }

    static void t() {
        h.d(46, true);
        h.d(47, true);
        h.d(49, true);
        h.d(50, true);
        h.d(51, true);
        h.d(52, true);
        h.wd(2);
        h.vX(0);
    }

    static void u() {
    }

    static void S(int n) {
    }

    static void T(int n) {
    }

    static void U(int n) {
    }

    static void V(int n) {
    }

    static void W(int n) {
    }

    static void X(int n) {
    }

    static void Y(int n) {
        if (n != -1) {
            h.wf(2);
            h.dp(2, 1500);
        } else {
            h.wf(3);
        }
    }

    static void Z(int n) {
    }

    static void aa(int n) {
        if (0 == n) {
            h.wf(1);
            h.wf(0);
            h.bb(false);
        }
        if (2 == n) {
            h.aZ(true);
            h.we(1);
        }
    }

    static void t(int n, int n2) {
    }

    static void u(int n, int n2) {
    }

    static void ab(int n) {
    }

    static void b(boolean bl) {
    }

    static void v() {
    }

    static void ac(int n) {
    }

    static void w() {
    }

    static void x() {
        aK = false;
        aL = false;
        aM = true;
        h.d(82, false);
        h.bc(false);
        h.d(83, false);
        h.d(65, false);
    }

    static void y() {
        if (!h.wc(0)) {
            h.wg(169);
            h.wg(177);
            h.wg(178);
            h.wg(179);
            h.wg(180);
            h.wg(181);
            h.wg(182);
            h.wg(183);
            h.wg(184);
            h.wg(185);
            h.wg(186);
            h.wg(187);
            h.dp(0, 3000);
            h.bb(true);
            if (h.wk(5) != 0) {
                h.bd(true);
                aM = false;
                h.d(82, true);
                h.dk(45, 2048);
                h.dj(82, 256);
            } else if (h.lS() != null) {
                aM = false;
                h.dj(45, 2048);
            } else {
                h.bd(false);
            }
            h.aX(false);
            h.bc(false);
            h.d(46, false);
            h.d(47, false);
            h.d(49, false);
            h.d(50, false);
            h.d(51, false);
            h.d(52, false);
        }
    }

    static void z() {
        h.wd(1);
        h.aX(true);
        h.bd(true);
        h.aY(true);
        h.bc(true);
        h.dk(45, 2048);
        h.dk(82, 2048);
    }

    static void A() {
        h.aZ(false);
        h.du(5, -100);
        h.aY(true);
        h.aX(true);
    }

    static void ad(int n) {
        if (h.dl(0, 256) && null != (aJ = h.lS()) && (h.wr(0) || h.wr(2))) {
            h.dp(1, 2000);
            h.a("PRESS THR KEY");
            h.dk(0, 256);
        }
        if (h.dl(45, 2048) && null != (aJ = h.lS()) && h.l(45, h.aJ.c, 70)) {
            h.wq(h.aJ.c);
            h.wf(180);
            h.dk(45, 2048);
            h.dp(3, 500);
        }
        if (h.dl(82, 256) && null != (aJ = h.lS()) && h.l(82, h.aJ.c, 350)) {
            h.wq(h.aJ.c);
            h.dk(82, 256);
            h.dq(0, 1000);
        }
        if (aL && null != (aJ = h.lS()) && h.l(82, h.aJ.c, 35)) {
            h.wf(187);
            h.du(5, -50);
            h.dw(0, -1);
            h.dw(h.aJ.c, -1);
            aL = false;
            h.dk(82, 4);
            h.aZ(true);
            h.we(0);
        }
    }

    static void ae(int n) {
    }

    static void af(int n) {
    }

    static void ag(int n) {
    }

    static void ah(int n) {
        if (aM) {
            h.vX(0);
            h.wf(177);
            h.dj(0, 256);
            aM = false;
        }
    }

    static void ai(int n) {
        if (h.dl(45, 256)) {
            h.dq(1, 1000);
            h.dk(45, 256);
        }
    }

    static void aj(int n) {
    }

    static void ak(int n) {
    }

    static void al(int n) {
        if (0 == n) {
            h.bb(false);
            h.wf(169);
        }
        if (1 == n) {
            h.wf(178);
            h.dp(2, 5000);
        }
        if (2 == n) {
            h.wf(179);
            h.d(45, true);
            h.dj(45, 2048);
        }
        if (3 == n) {
            h.wf(181);
            h.dj(45, 256);
        }
        if (5 == n) {
            h.bd(true);
            h.wf(184);
            h.du(5, 10);
            h.wf(185);
            h.d(82, true);
            h.dj(82, 256);
        }
    }

    static void v(int n, int n2) {
        if (0 == n) {
            switch (n2) {
                case 0: {
                    h.ba(true);
                    h.aY(false);
                    h.dr(65, 200);
                    h.dD(65, 0x780000);
                    break;
                }
                case 8000: {
                    h.aY(true);
                    h.lP();
                    h.wf(186);
                    aL = true;
                    h.ba(false);
                    h.vZ(0);
                }
            }
        }
        if (1 == n) {
            switch (n2) {
                case 0: {
                    h.ba(true);
                    h.dr(45, 0);
                    break;
                }
                case 1000: {
                    h.dr(83, 150);
                    h.d(83, true);
                    h.dm(83, 0);
                    h.dD(83, 983040);
                    break;
                }
                case 5000: {
                    h.wf(182);
                    h.wf(183);
                    break;
                }
                case 6000: {
                    h.dj(83, 4);
                    aK = true;
                    h.lP();
                    h.ba(false);
                    h.vZ(1);
                }
            }
        }
    }

    static void w(int n, int n2) {
    }

    static void am(int n) {
        if (n == 0) {
            h.A();
        }
        if (n == 83) {
            h.a("Knife= true");
            h.dp(5, 1000);
            aK = false;
            h.a("Knife= false");
            h.dk(83, 4);
            h.d(65, true);
        }
    }

    static void c(boolean bl) {
    }

    static void B() {
    }

    static void an(int n) {
    }

    static void C() {
    }

    static void D() {
        h.dm(26, 13);
        h.dj(26, 4096);
        h.d(38, false);
        h.d(37, false);
        h.d(26, false);
        h.d(40, true);
        h.d(41, true);
    }

    static void E() {
        if (!h.wc(2)) {
            h.vX(1);
            h.bb(true);
            h.dp(1, 5000);
        }
    }

    static void F() {
        h.wd(3);
    }

    static void G() {
    }

    static void ao(int n) {
        if (h.dl(59, 2048) && null != (aN = h.lS()) && h.l(59, h.aN.c, 35) && !h.g(aN)) {
            h.dk(59, 2048);
            h.dj(h.aN.c, 256);
            if (!h.wa(3)) {
                h.dq(3, 1000);
            }
        }
    }

    static void ap(int n) {
    }

    static void aq(int n) {
    }

    static void ar(int n) {
    }

    static void as(int n) {
    }

    static void at(int n) {
    }

    static void au(int n) {
    }

    static void av(int n) {
    }

    static void aw(int n) {
        if (1 == n) {
            h.wf(4);
            h.bb(false);
            h.d(26, true);
            h.d(59, true);
            h.dj(26, 4096);
            h.dj(59, 2048);
        }
    }

    static void x(int n, int n2) {
        if (3 == n) {
            switch (n2) {
                case 0: {
                    h.ba(true);
                    h.wq(h.aN.c);
                    break;
                }
                case 1000: {
                    h.dr(26, 200);
                    break;
                }
                case 2000: {
                    h.wf(5);
                    h.m(26, h.aN.c, 15);
                }
            }
        }
    }

    static void y(int n, int n2) {
        if (n == 26 && n2 == h.aN.c) {
            h.lP();
            h.d(26, false);
            h.ba(false);
            h.vZ(3);
            h.dj(h.aN.c, 65536);
            h.we(2);
        }
    }

    static void ax(int n) {
    }

    static void d(boolean bl) {
    }

    static void H() {
    }

    static void ay(int n) {
    }

    static void I() {
    }

    static void J() {
        h.dm(26, 13);
        h.d(26, false);
        h.d(1, false);
        h.d(38, false);
        h.d(37, false);
        h.d(55, true);
        h.d(64, false);
        h.dm(37, 16);
        h.dm(38, 16);
        h.vV(37).q(3);
        h.vV(38).q(3);
        h.dt(5, 12);
        h.dt(3, 12);
    }

    static void K() {
        if (!h.wc(3)) {
            h.d(64, true);
            h.dj(64, 2048);
            aO = h.lS();
            if (aO != null) {
                if (!h.dl(h.aO.c, 65536)) {
                    h.aZ(false);
                    h.dp(1, 2000);
                }
            } else {
                h.aZ(false);
                h.dp(1, 2000);
            }
        }
    }

    static void L() {
        h.dk(64, 2048);
        h.d(26, false);
        h.wd(4);
    }

    static void M() {
        h.d(26, false);
        h.dk(64, 2048);
    }

    static void az(int n) {
        f f2;
        if (h.dl(55, 4) && (f2 = h.lS()) != null) {
            if (h.l(f2.c, 55, 400)) {
                h.aY(false);
            } else {
                h.aY(true);
            }
        }
        if (h.dl(64, 2048) && null != (aO = h.lS())) {
            if (h.l(h.aO.c, 55, 400)) {
                h.aY(false);
            } else {
                h.aY(true);
            }
            if (h.l(64, h.aO.c, 35)) {
                h.wq(h.aO.c);
                h.dk(64, 2048);
                h.dq(0, 500);
            }
        }
    }

    static void aA(int n) {
    }

    static void aB(int n) {
    }

    static void aC(int n) {
    }

    static void aD(int n) {
        if (h.dl(n, 256)) {
            h.dk(n, 4);
            h.dj(64, 2048);
        }
    }

    static void aE(int n) {
        if (h.dl(n, 256)) {
            h.dk(64, 2048);
            h.dj(n, 4);
        }
    }

    static void aF(int n) {
    }

    static void aG(int n) {
    }

    static void aH(int n) {
        if (n == 1) {
            h.f(3, true);
        }
    }

    static void z(int n, int n2) {
        if (0 == n) {
            switch (n2) {
                case 0: {
                    h.d(26, true);
                    h.k(26, 307, 1605);
                    h.lR();
                    h.dk(h.aO.c, 4);
                    break;
                }
                case 500: {
                    h.ba(true);
                    h.dj(26, 4);
                    break;
                }
                case 2000: {
                    h.wf(6);
                    break;
                }
                case 3000: {
                    h.dq(1, 500);
                    h.vZ(0);
                }
            }
        }
        if (1 == n) {
            switch (n2) {
                case 0: {
                    h.d(38, true);
                    h.d(37, true);
                    h.dr(38, 200);
                    break;
                }
                case 2500: {
                    h.lP();
                    break;
                }
                case 3000: {
                    h.wf(7);
                    h.aY(true);
                    break;
                }
                case 3500: {
                    h.dk(26, 4);
                    h.dk(h.aO.c, 256);
                    h.dj(38, 4);
                    h.dj(37, 4);
                    h.du(3, 11);
                    h.dy(4, 2);
                    h.wo(4);
                    h.ba(false);
                    h.d(1, true);
                    h.m(26, 1, 15);
                    h.vZ(1);
                    h.we(3);
                }
            }
        }
    }

    static void A(int n, int n2) {
    }

    static void aI(int n) {
        if (h.aO.c == n || 0 == n) {
            if (aO != null) {
                h.dk(h.aO.c, 4);
            }
            h.aZ(false);
            h.dp(1, 2000);
        }
    }

    static void e(boolean bl) {
    }

    static void N() {
    }

    static void aJ(int n) {
    }

    static void O() {
    }

    static void P() {
        h.dm(26, 13);
        h.d(38, false);
        h.d(37, false);
        h.d(55, true);
        h.d(39, true);
        h.dm(37, 16);
        h.dm(38, 16);
        h.vV(37).q(3);
        h.vV(38).q(3);
    }

    static void Q() {
        if (!h.wc(4)) {
            h.d(1, true);
        }
    }

    static void R() {
        h.wd(5);
    }

    static void S() {
        h.aZ(false);
        h.d(26, false);
        h.dk(37, 4);
        h.dk(38, 4);
        h.wg(4);
        h.wg(5);
        h.wg(6);
        h.wg(7);
    }

    static void aK(int n) {
        if (h.l(26, 1, 100)) {
            h.d(26, false);
        }
    }

    static void aL(int n) {
    }

    static void aM(int n) {
    }

    static void aN(int n) {
    }

    static void aO(int n) {
    }

    static void aP(int n) {
    }

    static void aQ(int n) {
    }

    static void aR(int n) {
    }

    static void aS(int n) {
    }

    static void B(int n, int n2) {
    }

    static void C(int n, int n2) {
    }

    static void aT(int n) {
        if (37 == n || 38 == n) {
            int n2;
            h.dk(n, 4);
            int n3 = n2 = 37 == n ? 38 : 37;
            if (h.dl(n2, 2)) {
                h.we(4);
            }
        }
        if (0 == n) {
            h.f(4, true);
        }
    }

    static void f(boolean bl) {
    }

    static void T() {
    }

    static void aU(int n) {
    }

    static void U() {
    }

    static void V() {
    }

    static void W() {
        if (!h.wc(5)) {
            h.wj(100);
            h.dp(1, 2000);
            aP = 0;
        }
    }

    static void X() {
        h.aX(true);
        h.wd(6);
        h.dk(27, 2304);
    }

    static void Y() {
        h.aZ(false);
        h.dk(27, 2304);
    }

    static void aV(int n) {
        if (h.dl(27, 256) && h.l(0, 27, 30)) {
            h.dk(27, 256);
            h.wf(9);
            h.aX(false);
        }
    }

    static void aW(int n) {
    }

    static void aX(int n) {
    }

    static void aY(int n) {
    }

    static void aZ(int n) {
    }

    static void ba(int n) {
    }

    static void bb(int n) {
    }

    static void bc(int n) {
    }

    static void bd(int n) {
        if (n == 1) {
            h.wf(8);
            h.ds(1, 10);
            h.dj(27, 2304);
        }
    }

    static void D(int n, int n2) {
    }

    static void E(int n, int n2) {
    }

    static void be(int n) {
        if (0 == n) {
            h.f(5, true);
        }
    }

    static void g(boolean bl) {
    }

    static void Z() {
    }

    static void bf(int n) {
        if (n == 1 && h.dl(27, 2048)) {
            h.dk(27, 2048);
            h.dx(17, 1);
            h.wf(11);
        }
    }

    static void aa() {
        if (++aP == 4) {
            h.aZ(true);
            h.we(5);
        }
    }

    static void ab() {
        h.dm(54, 16);
        h.d(54, false);
    }

    static void ac() {
        if (!h.wc(6)) {
            h.dp(4, 5000);
            h.bb(true);
        }
        if ((aQ = h.lS()) == null) {
            aQ = h.vV(60);
        }
        h.dt(5, 5);
        h.dt(3, 5);
    }

    static void ad() {
        h.wd(7);
        h.d(54, false);
    }

    static void ae() {
        h.aZ(false);
        h.wg(13);
        h.wg(20);
        h.wg(21);
        h.wg(25);
        h.wg(26);
        if (aQ != null) {
            h.dk(h.aQ.c, 4);
        }
        h.aX(true);
        if (!h.dl(0, 2)) {
            h.c(0, 2955, 159, 3000);
        }
    }

    static void bg(int n) {
        if (h.dl(84, 2048) && aQ != null && !h.g(aQ) && h.l(h.aQ.c, 84, 35)) {
            h.wq(h.aQ.c);
            h.dq(2, 500);
            h.dk(84, 2048);
            h.dk(54, 8);
            h.dj(h.aQ.c, 65792);
        }
    }

    static void bh(int n) {
    }

    static void bi(int n) {
    }

    static void bj(int n) {
        if (54 == n) {
            h.wf(13);
            if (h.l(h.aQ.c, 54, 60) && !h.g(aQ)) {
                h.dq(0, 500);
                h.dk(84, 2048);
                h.dk(54, 12);
                h.dj(h.aQ.c, 4);
            } else {
                h.dq(1, 500);
            }
        }
    }

    static void bk(int n) {
        if (h.dl(n, 4)) {
            h.dk(n, 4);
            h.dj(n, 65792);
            h.we(6);
        }
        aQ = h.lS();
    }

    static void bl(int n) {
    }

    static void bm(int n) {
    }

    static void bn(int n) {
    }

    static void bo(int n) {
        if (4 == n) {
            h.d(54, true);
            h.dj(54, 4108);
            h.wf(12);
            h.bb(false);
        }
    }

    static void F(int n, int n2) {
        block0 : switch (n) {
            case 0: {
                switch (n2) {
                    case 0: {
                        h.wf(15);
                        break;
                    }
                    case 500: {
                        h.m(54, h.aQ.c, 15);
                        break;
                    }
                    case 1000: {
                        h.d(54, false);
                        h.vZ(0);
                    }
                }
                break;
            }
            case 1: {
                switch (n2) {
                    case 0: {
                        h.wf(14);
                        h.dk(54, 4);
                        break;
                    }
                    case 500: {
                        h.dj(84, 2048);
                        h.vZ(1);
                    }
                }
                break;
            }
            case 2: {
                switch (n2) {
                    case 0: {
                        h.wf(15);
                        break block0;
                    }
                    case 500: {
                        h.m(54, h.aQ.c, 15);
                        break block0;
                    }
                    case 1500: {
                        h.d(54, false);
                        if (h.lS() != null) {
                            h.we(6);
                        } else {
                            h.dj(h.aQ.c, 4);
                        }
                        h.vZ(2);
                    }
                }
            }
        }
    }

    static void G(int n, int n2) {
    }

    static void bp(int n) {
        if (n == h.aQ.c || n == 0 || n == 54) {
            h.f(6, true);
        }
    }

    static void h(boolean bl) {
    }

    static void af() {
    }

    static void bq(int n) {
    }

    static void ag() {
    }

    static void ah() {
    }

    static void ai() {
        if (!h.wc(7)) {
            aR = h.lS();
            if (aR == null) {
                h.f(7, true);
                aR = h.vV(60);
            } else if (h.dl(h.aR.c, 256)) {
                h.wf(17);
                h.wf(16);
                h.dj(52, 2048);
                h.dj(51, 2048);
            } else {
                h.f(7, true);
            }
        }
    }

    static void aj() {
        h.dk(52, 2048);
        h.dk(51, 2048);
    }

    static void ak() {
        h.aZ(false);
        h.wg(13);
        h.wg(20);
        h.wg(21);
        h.wg(25);
        h.wg(26);
        if (aR != null) {
            h.dk(h.aR.c, 260);
        }
        if (!h.dl(0, 2)) {
            h.c(0, 2955, 159, 3000);
        }
    }

    static void br(int n) {
    }

    static void bs(int n) {
    }

    static void bt(int n) {
    }

    static void bu(int n) {
    }

    static void bv(int n) {
        if (h.dl(n, 256)) {
            h.dk(n, 4);
            h.d(52, true);
            h.dj(52, 2048);
            h.d(51, true);
            h.dj(51, 2048);
        }
    }

    static void bw(int n) {
        if (h.dl(n, 256)) {
            h.d(52, false);
            h.dk(52, 2048);
            h.d(51, false);
            h.dk(51, 2048);
            h.dj(n, 4);
            h.wf(27);
        }
    }

    static void bx(int n) {
    }

    static void by(int n) {
    }

    static void bz(int n) {
    }

    static void H(int n, int n2) {
    }

    static void I(int n, int n2) {
    }

    static void bA(int n) {
        if (n == h.aR.c || n == 0 || n == 54) {
            h.f(7, true);
            h.dk(h.aR.c, 4);
        }
    }

    static void i(boolean bl) {
    }

    static void al() {
    }

    static void bB(int n) {
    }

    static void am() {
    }

    static void an() {
        h.dm(26, 13);
        h.d(26, false);
    }

    static void ao() {
        if (!h.wc(10)) {
            h.bb(true);
            h.dp(1, 5000);
            h.d(26, true);
            h.k(26, 3059, 1357);
        }
    }

    static void ap() {
        h.dk(26, 12);
        h.wd(11);
    }

    static void aq() {
        h.aZ(false);
    }

    static void bC(int n) {
    }

    static void bD(int n) {
    }

    static void bE(int n) {
    }

    static void bF(int n) {
        if (26 == n) {
            h.wf(39);
            h.dk(26, 12);
            h.we(10);
        }
    }

    static void bG(int n) {
    }

    static void bH(int n) {
    }

    static boolean bI(int n) {
        return false;
    }

    static void bJ(int n) {
        if (n == 1) {
            h.bb(false);
            h.wf(29);
            h.dj(26, 12);
        }
    }

    static void J(int n, int n2) {
    }

    static void bK(int n) {
    }

    static void K(int n, int n2) {
    }

    static void bL(int n) {
        if (n == 85 || n == 0) {
            h.f(10, true);
        }
    }

    static void j(boolean bl) {
    }

    static void ar() {
    }

    static void bM(int n) {
    }

    static void as() {
    }

    static void at() {
        h.d(85, false);
        h.d(60, false);
    }

    static void au() {
        if (!h.wc(11)) {
            h.d(85, true);
            h.dm(85, 9);
            h.dj(85, 4100);
            h.wf(30);
        }
    }

    static void av() {
        h.wd(12);
        h.dk(85, 4100);
    }

    static void aw() {
        h.aZ(false);
        h.du(3, -100);
        h.du(5, -100);
        h.dk(85, 4100);
    }

    static void bN(int n) {
    }

    static void bO(int n) {
    }

    static void bP(int n) {
    }

    static void bQ(int n) {
    }

    static void bR(int n) {
        if (85 == n) {
            h.dj(85, 256);
            h.du(3, 50);
            h.du(5, 50);
            h.we(11);
        }
    }

    static void bS(int n) {
    }

    static boolean bT(int n) {
        return false;
    }

    static void bU(int n) {
    }

    static void L(int n, int n2) {
    }

    static void bV(int n) {
    }

    static void M(int n, int n2) {
    }

    static void bW(int n) {
        if (n == 85 || n == 0) {
            h.f(11, true);
        }
    }

    static void k(boolean bl) {
    }

    static void ax() {
    }

    static void bX(int n) {
    }

    static void ay() {
    }

    static void az() {
        h.dm(26, 13);
    }

    static void aA() {
        if (!h.wc(12)) {
            h.wf(31);
            h.d(26, true);
            h.k(26, 3059, 1357);
            h.dj(26, 4);
            h.d(51, false);
            h.d(52, false);
            h.d(50, false);
            h.d(49, false);
            h.d(49, false);
            h.d(47, false);
            h.d(46, false);
            aS = h.lS();
            if (aS != null) {
                if (!h.dl(h.aS.c, 256)) {
                    h.f(12, true);
                }
            } else {
                h.f(12, true);
                aS = h.vV(85);
            }
        }
    }

    static void aB() {
        h.dk(26, 4);
        h.wd(13);
    }

    static void aC() {
        h.aZ(false);
        h.a("_OnFailed Q3_2");
        if (!h.dl(0, 2)) {
            h.o(0, h.vV((int)0).h, h.vV((int)0).i);
        }
    }

    static void bY(int n) {
        if (aS != null && h.dl(h.aS.c, 256) && h.l(h.aS.c, 26, 200)) {
            h.du(5, -100);
            h.du(3, -100);
            h.dw(0, -1);
            h.dw(h.aS.c, -1);
            if (h.l(h.aS.c, 26, 60) && h.lS() == aS) {
                h.dq(0, 1000);
            }
        }
    }

    static void bZ(int n) {
    }

    static void ca(int n) {
    }

    static void cb(int n) {
    }

    static void cc(int n) {
        if (h.aS.c == n) {
            h.dk(h.aS.c, 4);
            h.dj(26, 4);
        }
    }

    static void cd(int n) {
        if (h.aS.c == n && !h.dl(h.aS.c, 2)) {
            h.dj(h.aS.c, 4);
            h.dk(26, 4);
            if (!h.l(h.aS.c, 26, 60)) {
                h.wf(37);
            }
        }
    }

    static boolean ce(int n) {
        return false;
    }

    static void cf(int n) {
    }

    static void N(int n, int n2) {
        if (0 == n) {
            switch (n2) {
                case 0: {
                    h.wq(85);
                    h.ba(true);
                    h.dr(61, 80);
                    break;
                }
                case 2000: {
                    h.wf(40);
                    h.dk(26, 4);
                    break;
                }
                case 4000: {
                    h.lP();
                    h.ba(false);
                    h.we(12);
                    h.vZ(0);
                }
            }
        }
    }

    static void O(int n, int n2) {
    }

    static void cg(int n) {
    }

    static void ch(int n) {
        if (n == 85 || n == 0) {
            h.f(12, true);
        }
    }

    static void l(boolean bl) {
    }

    static void aD() {
    }

    static void ci(int n) {
    }

    static void aE() {
    }

    static void aF() {
    }

    static void aG() {
        if (!h.wc(13)) {
            h.d(51, true);
            h.d(52, true);
            h.dj(51, 2048);
            h.dj(52, 2048);
            h.d(50, false);
            h.d(49, false);
            h.d(49, false);
            h.d(47, false);
            h.d(46, false);
            h.wf(32);
            aT = h.lS();
            if (aT != null) {
                if (!h.dl(h.aT.c, 256)) {
                    h.f(13, true);
                }
            } else {
                h.f(13, true);
            }
        }
    }

    static void aH() {
        h.dk(52, 2048);
        h.dk(51, 2048);
    }

    static void aI() {
        h.dk(52, 2048);
        h.dk(51, 2048);
        h.a("_OnFailed Q3_3");
        h.aZ(false);
        if (!h.dl(0, 2)) {
            h.o(0, h.vV((int)0).h, h.vV((int)0).i);
        }
    }

    static void cj(int n) {
    }

    static void ck(int n) {
    }

    static void cl(int n) {
    }

    static void cm(int n) {
    }

    static void cn(int n) {
        if (h.aT.c == n) {
            h.d(52, true);
            h.dj(52, 2048);
            h.d(51, true);
            h.dj(51, 2048);
            h.dk(h.aT.c, 4);
        }
    }

    static void co(int n) {
        if (h.aT.c == n) {
            h.d(52, false);
            h.dk(52, 2048);
            h.d(51, false);
            h.dk(51, 2048);
            h.dj(h.aT.c, 4);
            h.wf(37);
        }
    }

    static void cp(int n) {
    }

    static void cq(int n) {
    }

    static void cr(int n) {
    }

    static void P(int n, int n2) {
    }

    static void Q(int n, int n2) {
    }

    static void cs(int n) {
        if (n == h.aT.c || n == 0) {
            h.f(13, true);
        }
    }

    static void m(boolean bl) {
    }

    static void aJ() {
    }

    static void ct(int n) {
    }

    static void aK() {
    }

    static void aL() {
        h.dm(26, 13);
    }

    static void aM() {
        if (!h.wc(17)) {
            h.wf(36);
            h.a("!!!!!!!!!!!!!!!!!!!!!!!!!!!!   HelloSweety");
            h.d(51, false);
            h.d(52, false);
            h.d(50, false);
            h.d(49, false);
            h.d(49, false);
            h.d(47, false);
            h.d(46, false);
            aU = h.lS();
            if (aU != null && h.dl(h.aU.c, 256)) {
                h.d(26, true);
                h.dj(59, 2048);
                h.dp(2, 2000);
            } else {
                aU = h.vV(29);
                h.f(17, true);
            }
        }
    }

    static void aN() {
        h.wj(100);
        h.wd(18);
        h.d(51, true);
        h.d(52, true);
        h.d(50, true);
        h.d(49, true);
        h.d(49, true);
        h.d(47, true);
        h.d(46, true);
        h.wn(2);
    }

    static void aO() {
        h.aZ(false);
        h.dk(59, 2048);
        if (aU != null) {
            h.dk(h.aU.c, 4);
        }
    }

    static void cu(int n) {
        if (aU != null && h.dl(h.aU.c, 256) && h.l(h.aU.c, 59, 50)) {
            h.dk(59, 2048);
            h.dk(h.aU.c, 256);
            h.wq(h.aU.c);
            h.dq(0, 1000);
        }
    }

    static void cv(int n) {
    }

    static void cw(int n) {
    }

    static void cx(int n) {
    }

    static void cy(int n) {
        if (h.aU.c == n) {
            h.dk(h.aU.c, 4);
            h.dj(26, 4);
        }
    }

    static void cz(int n) {
        if (h.aU.c == n) {
            h.dk(26, 4);
            h.dj(h.aU.c, 4);
        }
    }

    static boolean cA(int n) {
        return false;
    }

    static void cB(int n) {
        if (2 == n) {
            h.wf(36);
        }
    }

    static void R(int n, int n2) {
        if (0 == n) {
            switch (n2) {
                case 0: {
                    h.ba(true);
                    break;
                }
                case 1000: {
                    h.n(15, 1810, 626);
                    h.dm(15, 16);
                    break;
                }
                case 2000: {
                    h.dk(26, 4);
                    h.wf(43);
                    break;
                }
                case 3000: {
                    h.m(26, 39, 15);
                    h.m(15, 39, 15);
                    break;
                }
                case 5000: {
                    h.m(26, 39, 15);
                    h.m(15, 39, 15);
                    h.d(26, false);
                    h.d(15, false);
                    break;
                }
                case 7000: {
                    h.aZ(true);
                    h.we(17);
                    h.ba(false);
                    h.vZ(0);
                }
            }
        }
    }

    static void S(int n, int n2) {
    }

    static void cC(int n) {
    }

    static void cD(int n) {
        if (n == h.aU.c || n == 0) {
            h.f(17, true);
        }
    }

    static void n(boolean bl) {
    }

    static void aP() {
    }

    static void cE(int n) {
    }

    static void aQ() {
    }

    static void aR() {
    }

    static void aS() {
        if (!h.wc(18)) {
            h.dp(1, 5000);
        }
    }

    static void aT() {
        h.dk(51, 2048);
        h.dk(52, 2048);
    }

    static void aU() {
    }

    static void cF(int n) {
    }

    static void cG(int n) {
    }

    static void cH(int n) {
    }

    static void cI(int n) {
    }

    static void cJ(int n) {
    }

    static void cK(int n) {
    }

    static boolean cL(int n) {
        return false;
    }

    static void cM(int n) {
        if (1 == n) {
            h.wf(44);
            h.dj(51, 2048);
            h.dj(52, 2048);
        }
    }

    static void T(int n, int n2) {
    }

    static void U(int n, int n2) {
    }

    static void cN(int n) {
    }

    static void cO(int n) {
    }

    static void o(boolean bl) {
    }

    static void aV() {
    }

    static void cP(int n) {
    }

    static void aW() {
    }

    static void aX() {
    }

    static void aY() {
        if (!h.wc(24)) {
            h.a("_OnActivated q5_1!!!!!!!!!!!!!!!!!!!");
            h.dp(1, 5000);
            h.bb(true);
        }
    }

    static void aZ() {
        h.dk(26, 12);
        h.wd(25);
    }

    static void ba() {
    }

    static void cQ(int n) {
    }

    static void cR(int n) {
    }

    static void cS(int n) {
    }

    static void cT(int n) {
        if (n == 26) {
            h.wf(61);
            h.we(24);
        }
    }

    static void cU(int n) {
    }

    static void cV(int n) {
    }

    static void cW(int n) {
    }

    static void cX(int n) {
    }

    static void cY(int n) {
        if (1 == n) {
            h.wf(53);
            h.bb(false);
            h.n(26, h.vV((int)87).h - 20, h.vV((int)87).i);
            h.dj(26, 4108);
        }
    }

    static void V(int n, int n2) {
    }

    static void W(int n, int n2) {
    }

    static void cZ(int n) {
    }

    static void p(boolean bl) {
    }

    static void bb() {
    }

    static void da(int n) {
    }

    static void bc() {
    }

    static void bd() {
    }

    static void be() {
        if (!h.wc(25)) {
            h.wf(54);
            h.dj(49, 2048);
            h.dj(50, 2048);
        }
    }

    static void bf() {
        h.dk(49, 2048);
        h.dk(50, 2048);
    }

    static void bg() {
    }

    static void db(int n) {
    }

    static void dc(int n) {
    }

    static void dd(int n) {
    }

    static void de(int n) {
    }

    static void df(int n) {
        if (h.dl(n, 256)) {
            h.dk(n, 4);
            h.d(49, true);
            h.dj(49, 2048);
            h.d(50, true);
            h.dj(50, 2048);
        }
    }

    static void dg(int n) {
        if (h.dl(n, 256)) {
            h.d(49, false);
            h.dk(49, 2048);
            h.d(50, false);
            h.dk(50, 2048);
            h.dj(n, 4);
            h.wf(18);
        }
    }

    static void dh(int n) {
    }

    static void di(int n) {
    }

    static void dj(int n) {
    }

    static void X(int n, int n2) {
    }

    static void Y(int n, int n2) {
    }

    static void dk(int n) {
    }

    static void q(boolean bl) {
    }

    static void bh() {
    }

    static void dl(int n) {
    }

    static void bi() {
    }

    static void bj() {
        h.dn(67, 180);
        h.d(75, false);
        h.d(74, false);
        h.d(77, false);
        h.d(76, false);
        h.d(63, false);
        h.d(69, false);
        h.d(70, false);
        h.d(72, false);
        h.d(71, false);
    }

    static void bk() {
        if (!h.wc(41)) {
            h.vX(0);
            h.vX(1);
            h.vX(2);
            h.dp(0, 3000);
            h.a("Start Q9_1");
            h.d(67, true);
            h.dj(67, 8192);
            h.d(68, true);
            h.d(26, true);
            h.dj(26, 4108);
            h.k(26, 1821, 364);
        }
    }

    static void bl() {
        h.a("Complete Q9_1");
        h.wd(42);
    }

    static void bm() {
        h.aZ(false);
    }

    static void dm(int n) {
        if (h.dl(68, 256) && h.l(63, 68, 35)) {
            h.dk(68, 256);
            h.dj(63, 20480);
            h.dp(1, 1000);
            h.a("Start timer 1");
        }
    }

    static void dn(int n) {
    }

    static void do(int n) {
    }

    static void dp(int n) {
        if (n == 26) {
            h.dk(26, 12);
            if (!h.wa(3)) {
                h.dq(3, 1000);
            }
        }
    }

    static void dq(int n) {
    }

    static void dr(int n) {
    }

    static boolean ds(int n) {
        return false;
    }

    static void dt(int n) {
        if (0 == n) {
            h.wf(86);
        }
        if (1 == n) {
            h.dr(0, 200);
            h.dp(2, 1000);
            h.a("Timer 1");
        }
        if (2 == n) {
            h.a("Timer 2");
            h.wf(90);
            h.ba(false);
            h.dj(63, 260);
            h.we(41);
        }
    }

    static void Z(int n, int n2) {
        if (3 == n) {
            switch (n2) {
                case 0: {
                    h.ba(true);
                    h.dr(62, 200);
                    h.aY(false);
                    break;
                }
                case 3000: {
                    h.d(63, true);
                    h.dm(63, 15);
                    h.vV(63).q(2);
                    h.dr(63, 200);
                    h.dD(63, 0x780000);
                    h.dj(68, 4352);
                    h.a("IGNORE");
                    h.vZ(3);
                }
            }
        }
    }

    static void aa(int n, int n2) {
    }

    static void du(int n) {
    }

    static void dv(int n) {
        if (n == 0) {
            h.f(41, true);
        }
    }

    static void r(boolean bl) {
    }

    static void bn() {
    }

    static void dw(int n) {
    }

    static void bo() {
    }

    static void bp() {
    }

    static void bq() {
        if (!h.wc(42)) {
            if (h.dl(63, 4)) {
                h.wf(87);
            } else {
                h.f(42, true);
            }
        }
    }

    static void br() {
        h.wd(43);
        h.a("Complete Q9_2");
    }

    static void bs() {
        if (!h.dl(0, 2)) {
            h.o(0, h.vV((int)0).h, h.vV((int)0).i);
        }
    }

    static void dx(int n) {
        if (h.dl(63, 256) && h.l(63, 0, 65)) {
            h.dk(63, 20736);
            h.dk(67, 8192);
        }
        if (h.dl(63, 4)) {
            if (!h.l(63, 0, 450)) {
                h.a("Q9_2: Mission Failed");
                h.dk(63, 4);
                h.d(63, false);
                h.dp(1, 2000);
                h.aZ(false);
            }
            if (h.l(63, 46, 35)) {
                h.a("Q9_2: Mission Failed");
                h.dk(63, 4);
                h.d(63, false);
                h.dp(1, 2000);
                h.aZ(false);
            }
        }
    }

    static void dy(int n) {
    }

    static void dz(int n) {
    }

    static void dA(int n) {
    }

    static void dB(int n) {
    }

    static void dC(int n) {
    }

    static boolean dD(int n) {
        return false;
    }

    static void dE(int n) {
        if (n == 0) {
            h.wf(92);
            h.aY(true);
            h.we(42);
        }
        if (n == 1) {
            h.f(42, true);
        }
    }

    static void ab(int n, int n2) {
    }

    static void ac(int n, int n2) {
    }

    static void dF(int n) {
    }

    static void dG(int n) {
        if (63 == n) {
            h.dp(0, 1500);
        }
        if (n == 0) {
            h.f(42, true);
        }
    }

    static void s(boolean bl) {
    }

    static void bt() {
    }

    static void dH(int n) {
    }

    static void bu() {
    }

    static void bv() {
    }

    static void bw() {
        if (!h.wc(43)) {
            h.wf(88);
            h.dj(68, 2048);
            aW = 0;
        }
    }

    static void bx() {
        h.bb(false);
        h.aY(true);
        h.wd(44);
        h.wj(250);
        h.wn(8);
    }

    static void by() {
        h.aZ(false);
        h.bb(false);
        h.aY(true);
        h.dk(75, 4);
        h.dk(74, 4);
        h.dk(77, 4);
        h.dk(76, 4);
    }

    static void dI(int n) {
        if (h.dl(68, 2048) && h.l(68, 0, 35)) {
            aV = h.lS();
            if (null != aV) {
                h.wq(h.aV.c);
            }
            h.dk(68, 2048);
            h.wf(93);
            h.bb(true);
            h.dq(3, 1000);
        }
        if (h.dl(69, 256) && h.l(73, 69, 35)) {
            h.ba(false);
            h.dr(0, 200);
            h.dk(69, 256);
            h.dj(70, 256);
        }
        if (h.dl(70, 256) && h.l(68, 70, 35) && h.vV((int)70).r == null) {
            h.a("!!!!!!!!!!!!!!FIGHT!!!!!!!!!!!!!!!");
            h.n(75, 1654, 226);
            h.dm(75, 15);
            h.dj(75, 4);
            h.dj(75, 256);
            h.n(74, 1617, 182);
            h.dm(74, 15);
            h.dj(74, 4);
            h.n(77, 1562, 270);
            h.dm(77, 15);
            h.dj(77, 4);
            h.n(76, 1584, 347);
            h.dm(76, 15);
            h.dj(76, 4);
            h.dk(70, 256);
        }
        if (h.dl(75, 256) && (h.dl(75, 4) || h.dl(74, 4) || h.dl(77, 4) || h.dl(76, 4))) {
            aV = h.lS();
            if (aV != null) {
                h.dB(75, h.aV.c);
                h.dB(74, h.aV.c);
                h.dB(77, h.aV.c);
                h.dB(76, h.aV.c);
                h.dk(75, 256);
            } else {
                h.dB(75, 0);
                h.dB(74, 0);
                h.dB(77, 0);
                h.dB(76, 0);
                h.dk(75, 256);
            }
        }
        if (h.dl(0, 256)) {
            h.a("Corpses " + aW);
            if (aW == 4) {
                h.a("MISSION COMPLETE");
                h.dk(0, 256);
                h.we(43);
                h.aZ(true);
            }
        }
    }

    static void dJ(int n) {
    }

    static void dK(int n) {
    }

    static void dL(int n) {
    }

    static void dM(int n) {
    }

    static void dN(int n) {
    }

    static boolean dO(int n) {
        return false;
    }

    static void dP(int n) {
    }

    static void ad(int n, int n2) {
        if (3 == n) {
            switch (n2) {
                case 0: {
                    h.ba(true);
                    h.d(69, true);
                    h.dn(69, 270);
                    h.dD(69, 0x780000);
                    h.dm(69, 15);
                    h.dj(69, 256);
                    h.vV(69).q(2);
                    h.d(70, true);
                    h.dn(70, 270);
                    h.dD(70, 0x780000);
                    h.dm(70, 15);
                    h.vV(70).q(2);
                    h.d(72, true);
                    h.dn(72, 270);
                    h.dD(72, 0x780000);
                    h.dm(72, 15);
                    h.vV(72).q(2);
                    h.d(71, true);
                    h.dn(71, 270);
                    h.dD(71, 0x780000);
                    h.dm(71, 15);
                    h.vV(71).q(2);
                    h.aY(false);
                    break;
                }
                case 1000: {
                    h.dr(69, 200);
                    h.vZ(3);
                }
            }
        }
    }

    static void ae(int n, int n2) {
    }

    static void dQ(int n) {
    }

    static void dR(int n) {
        h.a("deth " + n + " " + 75);
        switch (n) {
            case 75: {
                h.dk(75, 4);
                h.dj(0, 256);
                ++aW;
                break;
            }
            case 74: {
                h.dk(74, 4);
                ++aW;
                break;
            }
            case 77: {
                h.dk(77, 4);
                ++aW;
                break;
            }
            case 76: {
                h.dk(76, 4);
                ++aW;
                break;
            }
            case 63: {
                h.wf(92);
                h.dj(68, 2048);
                h.aY(true);
                break;
            }
            case 0: {
                h.f(43, true);
            }
        }
    }

    static void t(boolean bl) {
    }

    static void bz() {
    }

    static void dS(int n) {
    }

    static void bA() {
    }

    static void bB() {
    }

    static void bC() {
        if (!h.wc(44)) {
            h.d(26, true);
            h.k(26, 1821, 364);
            h.dj(26, 4096);
            h.bb(true);
            h.vX(0);
            h.dp(0, 5000);
        }
    }

    static void bD() {
        h.wd(45);
        h.vX(0);
    }

    static void bE() {
    }

    static void dT(int n) {
    }

    static void dU(int n) {
    }

    static void dV(int n) {
    }

    static void dW(int n) {
        if (n == 26) {
            h.wf(99);
            h.dk(26, 12);
            h.we(44);
        }
    }

    static void dX(int n) {
    }

    static void dY(int n) {
    }

    static void dZ(int n) {
    }

    static void ea(int n) {
    }

    static void eb(int n) {
        if (0 == n) {
            h.wf(94);
            h.bb(false);
            h.dj(26, 12);
        }
    }

    static void af(int n, int n2) {
    }

    static void ag(int n, int n2) {
    }

    static void ec(int n) {
    }

    static void u(boolean bl) {
    }

    static void bF() {
    }

    static void ed(int n) {
    }

    static void bG() {
    }

    static void bH() {
    }

    static void bI() {
        if (!h.wc(45)) {
            h.wf(95);
            h.dj(28, 2048);
        }
    }

    static void bJ() {
        h.d(26, false);
        h.dk(28, 2048);
        h.wd(46);
        h.vX(0);
    }

    static void bK() {
        h.dk(28, 2048);
    }

    static void ee(int n) {
        aY = h.lS();
        if (aY != null && h.l(h.aY.c, 28, 35) && h.dl(28, 2048)) {
            h.wq(h.aY.c);
            h.dy(12, 10);
            h.we(45);
        }
    }

    static void ef(int n) {
    }

    static void eg(int n) {
    }

    static void eh(int n) {
    }

    static void ei(int n) {
    }

    static void ej(int n) {
    }

    static void ek(int n) {
    }

    static void el(int n) {
    }

    static void em(int n) {
    }

    static void ah(int n, int n2) {
    }

    static void ai(int n, int n2) {
    }

    static void en(int n) {
    }

    static void v(boolean bl) {
    }

    static void bL() {
    }

    static void eo(int n) {
    }

    static void bM() {
    }

    static void bN() {
    }

    static void bO() {
        if (!h.wc(46)) {
            h.wf(96);
            h.du(2, -100);
            h.dj(47, 2048);
            h.dj(46, 2048);
            aZ = h.lS();
            if (aZ == null) {
                h.f(46, true);
            }
        }
    }

    static void bP() {
        h.dk(47, 2048);
        h.dk(46, 2048);
    }

    static void bQ() {
        h.aZ(false);
        h.dk(47, 2048);
        h.dk(46, 2048);
        if (aZ != null) {
            h.dk(h.aZ.c, 4);
        }
    }

    static void ep(int n) {
    }

    static void eq(int n) {
    }

    static void er(int n) {
    }

    static void es(int n) {
    }

    static void et(int n) {
        if (n == h.aZ.c) {
            h.dk(h.aZ.c, 4);
        }
    }

    static void eu(int n) {
        if (n == h.aZ.c) {
            h.dj(h.aZ.c, 4);
        }
    }

    static boolean ev(int n) {
        return false;
    }

    static void ew(int n) {
    }

    static void aj(int n, int n2) {
    }

    static void ak(int n, int n2) {
    }

    static void ex(int n) {
    }

    static void ey(int n) {
        if (n == h.aZ.c || n == 0) {
            h.a("Somebody fail the mission");
            h.f(46, true);
        }
    }

    static void w(boolean bl) {
    }

    static void bR() {
    }

    static void ez(int n) {
    }

    static void bS() {
    }

    static void bT() {
        h.dm(15, 13);
        h.dj(15, 4096);
        h.d(15, false);
    }

    static void bU() {
        if (!h.wc(51)) {
            h.d(15, true);
            h.bb(true);
            h.vX(0);
            h.dp(0, 5000);
        }
    }

    static void bV() {
        h.dk(15, 12);
        h.wd(52);
        h.vX(0);
    }

    static void bW() {
        h.aZ(false);
    }

    static void eA(int n) {
    }

    static void eB(int n) {
    }

    static void eC(int n) {
    }

    static void eD(int n) {
        if (n == 15) {
            h.wf(108);
            h.dk(15, 4);
            h.we(51);
        }
    }

    static void eE(int n) {
    }

    static void eF(int n) {
    }

    static void eG(int n) {
    }

    static void eH(int n) {
    }

    static void eI(int n) {
        if (0 == n) {
            h.dj(15, 12);
            h.wf(103);
            h.bb(false);
        }
    }

    static void al(int n, int n2) {
    }

    static void am(int n, int n2) {
    }

    static void eJ(int n) {
    }

    static void x(boolean bl) {
    }

    static void bX() {
    }

    static void eK(int n) {
    }

    static void bY() {
    }

    static void bZ() {
    }

    static void ca() {
        if (!h.wc(52)) {
            h.wf(104);
            h.dj(49, 2048);
            h.dj(50, 2048);
        }
    }

    static void cb() {
        h.dk(49, 2048);
        h.dk(50, 2048);
    }

    static void cc() {
    }

    static void eL(int n) {
    }

    static void eM(int n) {
    }

    static void eN(int n) {
    }

    static void eO(int n) {
    }

    static void eP(int n) {
    }

    static void eQ(int n) {
    }

    static boolean eR(int n) {
        return false;
    }

    static void eS(int n) {
    }

    static void an(int n, int n2) {
    }

    static void ao(int n, int n2) {
    }

    static void eT(int n) {
    }

    static void eU(int n) {
    }

    static void y(boolean bl) {
    }

    static void cd() {
    }

    static void eV(int n) {
    }

    static void ce() {
    }

    static void cf() {
    }

    static void cg() {
        if (!h.wc(55)) {
            h.dj(66, 2048);
            h.d(15, true);
            h.wf(107);
        }
    }

    static void ch() {
        h.wj(200);
        h.wd(56);
        h.wn(13);
        h.wn(14);
    }

    static void ci() {
        h.aZ(false);
    }

    static void eW(int n) {
        if (h.dl(66, 2048)) {
            f f2 = h.lS();
            if (f2 != null) {
                if (h.l(f2.c, 66, 35)) {
                    h.wq(f2.c);
                    h.dk(66, 2048);
                    h.dq(1, 1000);
                }
            } else if (h.l(h.vV((int)0).c, 66, 35)) {
                h.dk(66, 2048);
                h.dq(1, 1000);
            }
        }
    }

    static void eX(int n) {
    }

    static void eY(int n) {
    }

    static void eZ(int n) {
    }

    static void fa(int n) {
    }

    static void fb(int n) {
    }

    static void fc(int n) {
    }

    static void fd(int n) {
    }

    static void fe(int n) {
    }

    static void ap(int n, int n2) {
        block0 : switch (n) {
            case 1: {
                switch (n2) {
                    case 0: {
                        h.wf(112);
                        break block0;
                    }
                    case 1000: {
                        h.aZ(true);
                        h.we(55);
                        h.vZ(1);
                    }
                }
            }
        }
    }

    static void aq(int n, int n2) {
    }

    static void ff(int n) {
    }

    static void z(boolean bl) {
    }

    static void cj() {
    }

    static void fg(int n) {
    }

    static void ck() {
    }

    static void cl() {
    }

    static void cm() {
        if (!h.wc(56)) {
            h.dm(31, 6);
            h.dn(31, 90);
            h.d(31, true);
            h.d(15, true);
            h.dj(31, 12288);
            h.bb(true);
            h.vX(2);
            h.dp(2, 5000);
        }
    }

    static void cn() {
        h.dk(15, 12);
        h.wd(57);
        h.vX(2);
    }

    static void co() {
        h.aZ(false);
    }

    static void fh(int n) {
    }

    static void fi(int n) {
    }

    static void fj(int n) {
    }

    static void fk(int n) {
        if (n == 15) {
            h.wf(117);
            h.dk(15, 12);
            h.we(56);
        }
    }

    static void fl(int n) {
    }

    static void fm(int n) {
    }

    static void fn(int n) {
    }

    static void fo(int n) {
    }

    static void fp(int n) {
        if (2 == n) {
            h.a(">> Taimer kaput");
            h.dj(15, 12);
            h.wf(113);
            h.bb(false);
        }
    }

    static void ar(int n, int n2) {
    }

    static void as(int n, int n2) {
    }

    static void fq(int n) {
        if (n == 31) {
            h.f(56, true);
        }
    }

    static void A(boolean bl) {
    }

    static void cp() {
    }

    static void fr(int n) {
    }

    static void cq() {
    }

    static void cr() {
    }

    static void cs() {
        if (!h.wc(57)) {
            h.wf(114);
            h.dj(31, 4);
            h.dk(31, 8192);
        }
    }

    static void ct() {
        h.dk(31, 4100);
        h.wd(58);
    }

    static void cu() {
        h.aZ(false);
        h.dk(31, 4);
        if (!h.dl(0, 2)) {
            h.c(0, 2955, 159, 3000);
        }
    }

    static void fs(int n) {
    }

    static void ft(int n) {
    }

    static void fu(int n) {
    }

    static void fv(int n) {
    }

    static void fw(int n) {
        if (n == 31 && h.dl(31, 4)) {
            h.we(57);
        }
    }

    static void fx(int n) {
    }

    static void fy(int n) {
    }

    static void fz(int n) {
    }

    static void fA(int n) {
    }

    static void at(int n, int n2) {
    }

    static void au(int n, int n2) {
    }

    static void fB(int n) {
        if (n == 31 || n == 0) {
            h.f(57, true);
        }
    }

    static void B(boolean bl) {
    }

    static void cv() {
    }

    static void fC(int n) {
    }

    static void cw() {
    }

    static void cx() {
        h.d(79, false);
        h.d(78, false);
    }

    static void cy() {
        if (!h.wc(58)) {
            h.d(79, true);
            h.d(78, true);
            h.dm(79, 5);
            h.do(78, 200);
            h.dn(79, 90);
            h.dn(78, 90);
            h.dq(1, 500);
        }
    }

    static void cz() {
        h.wd(59);
    }

    static void cA() {
        h.aZ(false);
        h.dk(78, 4);
        if (!h.dl(0, 2)) {
            h.c(0, 2955, 159, 3000);
        }
    }

    static void fD(int n) {
        if (h.dl(78, 4) && h.l(78, 50, 40)) {
            h.dk(78, 4);
            h.d(79, false);
            h.d(78, false);
            h.f(58, true);
        }
    }

    static void fE(int n) {
    }

    static void fF(int n) {
    }

    static void fG(int n) {
    }

    static void fH(int n) {
    }

    static void fI(int n) {
    }

    static boolean fJ(int n) {
        return false;
    }

    static void fK(int n) {
    }

    static void av(int n, int n2) {
        block0 : switch (n) {
            case 1: {
                switch (n2) {
                    case 0: {
                        h.ba(true);
                        break block0;
                    }
                    case 1000: {
                        h.dr(79, 300);
                        break block0;
                    }
                    case 4000: {
                        h.wf(118);
                        break block0;
                    }
                    case 5000: {
                        h.dD(78, 0x460000);
                        break block0;
                    }
                    case 5500: {
                        h.dD(79, 0x460000);
                        break block0;
                    }
                    case 10000: {
                        h.dj(79, 8192);
                        h.dj(78, 8196);
                        h.ba(false);
                        h.lP();
                        break block0;
                    }
                    case 11000: {
                        h.wf(115);
                        h.vZ(1);
                    }
                }
            }
        }
    }

    static void aw(int n, int n2) {
    }

    static void fL(int n) {
    }

    static void fM(int n) {
        if (n == 78) {
            h.dk(78, 4);
            h.dk(79, 8192);
            h.we(58);
        }
        if (n == 79 || n == 0 || n == 31) {
            h.f(58, true);
        }
    }

    static void C(boolean bl) {
    }

    static void cB() {
    }

    static void fN(int n) {
    }

    static void cC() {
    }

    static void cD() {
    }

    static void cE() {
        if (!h.wc(59)) {
            h.dq(2, 1000);
        }
    }

    static void cF() {
        h.wd(60);
    }

    static void cG() {
        h.aZ(false);
        h.dk(79, 4);
        if (!h.dl(0, 2)) {
            h.c(0, 2955, 159, 3000);
        }
    }

    static void fO(int n) {
    }

    static void fP(int n) {
    }

    static void fQ(int n) {
    }

    static void fR(int n) {
    }

    static void fS(int n) {
        if (n == 79) {
            h.dk(79, 4);
            h.dj(79, 256);
            h.du(5, 70);
            h.we(59);
        }
    }

    static void fT(int n) {
    }

    static boolean fU(int n) {
        return false;
    }

    static void fV(int n) {
    }

    static void ax(int n, int n2) {
        block0 : switch (n) {
            case 2: {
                switch (n2) {
                    case 1000: {
                        h.dj(79, 16388);
                        h.e(79, true);
                        h.du(5, 12);
                        h.n(35, h.vV((int)79).h - 20, h.vV((int)79).i);
                        h.n(36, h.vV((int)79).h + 20, h.vV((int)79).i);
                        break block0;
                    }
                    case 2000: {
                        h.wf(119);
                        h.vZ(2);
                    }
                }
            }
        }
    }

    static void ay(int n, int n2) {
    }

    static void fW(int n) {
    }

    static void fX(int n) {
        if (n == 79 || n == 0 || n == 31) {
            h.f(59, true);
        }
    }

    static void D(boolean bl) {
    }

    static void cH() {
    }

    static void fY(int n) {
    }

    static void cI() {
    }

    static void cJ() {
    }

    static void cK() {
        if (!h.wc(60)) {
            h.dj(66, 2048);
            h.d(15, true);
            h.wf(120);
            h.wf(116);
            bb = false;
            ba = h.lS();
            if (ba == null) {
                ba = h.vV(79);
                h.a(">> Car not found");
                h.f(60, true);
            } else if (!h.dl(h.ba.c, 256)) {
                h.a(">> Car not marked");
                h.f(60, true);
            }
        }
    }

    static void cL() {
        h.wj(200);
        h.dk(66, 2048);
        h.wd(61);
        if (ba != null) {
            h.dk(h.ba.c, 4);
        }
    }

    static void cM() {
        if (ba != null) {
            h.dk(h.ba.c, 4);
        }
        h.dk(66, 2048);
        h.aZ(false);
        if (!h.dl(0, 2)) {
            h.c(0, 2955, 159, 3000);
        }
    }

    static void fZ(int n) {
        if (ba != null && h.l(h.ba.c, 66, 35) && h.dl(66, 2048)) {
            if (h.wk(5) == 0) {
                h.wq(h.ba.c);
                h.dk(66, 2048);
                h.dq(1, 1000);
            } else {
                if (!bb) {
                    h.wf(122);
                }
                bb = true;
            }
        } else if (bb) {
            bb = false;
        }
    }

    static void ga(int n) {
    }

    static void gb(int n) {
    }

    static void gc(int n) {
    }

    static void gd(int n) {
        if (h.dl(n, 256)) {
            h.dk(n, 4);
            h.dj(66, 2048);
        }
    }

    static void ge(int n) {
        if (h.dl(n, 256)) {
            h.dj(n, 4);
            h.dk(66, 2048);
        }
    }

    static void gf(int n) {
    }

    static void gg(int n) {
    }

    static void gh(int n) {
    }

    static void az(int n, int n2) {
        block0 : switch (n) {
            case 1: {
                switch (n2) {
                    case 0: {
                        h.wf(121);
                        break block0;
                    }
                    case 1000: {
                        h.aZ(true);
                        h.we(60);
                        h.vZ(1);
                    }
                }
            }
        }
    }

    static void aA(int n, int n2) {
    }

    static void gi(int n) {
        if (n == h.ba.c || n == 0) {
            h.f(60, true);
        }
    }

    static void E(boolean bl) {
    }

    static void cN() {
    }

    static void gj(int n) {
    }

    static void cO() {
    }

    static void cP() {
    }

    static void cQ() {
        if (!h.wc(61)) {
            h.d(15, true);
            h.bb(true);
            h.vX(0);
            h.dp(0, 5000);
        }
    }

    static void cR() {
        h.dk(15, 12);
        h.wd(62);
        h.vX(0);
    }

    static void cS() {
        h.aZ(false);
        if (!h.dl(0, 2)) {
            h.c(0, h.vV((int)0).h, h.vV((int)0).i, 3000);
            h.a(">> Failed quest");
        }
    }

    static void gk(int n) {
    }

    static void gl(int n) {
    }

    static void gm(int n) {
    }

    static void gn(int n) {
        if (n == 15) {
            h.wf(132);
            h.dk(15, 12);
            h.we(61);
        }
    }

    static void go(int n) {
    }

    static void gp(int n) {
    }

    static void gq(int n) {
    }

    static void gr(int n) {
    }

    static void gs(int n) {
        if (0 == n) {
            h.dj(15, 12);
            h.wf(123);
            h.bb(false);
        }
    }

    static void aB(int n, int n2) {
    }

    static void aC(int n, int n2) {
    }

    static void gt(int n) {
        if (n == 60) {
            h.f(61, true);
        }
    }

    static void F(boolean bl) {
    }

    static void cT() {
    }

    static void gu(int n) {
    }

    static void cU() {
    }

    static void cV() {
    }

    static void cW() {
        if (!h.wc(62)) {
            h.wf(124);
            h.n(60, 3065, 1185);
            h.dm(60, 6);
            h.dj(60, 4);
        }
    }

    static void cX() {
        h.wd(63);
    }

    static void cY() {
        h.aZ(false);
        h.dk(60, 4);
        if (!h.dl(0, 2)) {
            h.c(0, h.vV((int)0).h, h.vV((int)0).i, 3000);
            h.a(">> Failed car");
        }
    }

    static void gv(int n) {
    }

    static void gw(int n) {
    }

    static void gx(int n) {
    }

    static void gy(int n) {
    }

    static void gz(int n) {
        if (n == 60 && h.dl(60, 4)) {
            h.dk(60, 4);
            h.dj(60, 256);
            h.we(62);
        }
    }

    static void gA(int n) {
    }

    static void gB(int n) {
    }

    static void gC(int n) {
    }

    static void gD(int n) {
    }

    static void aD(int n, int n2) {
    }

    static void aE(int n, int n2) {
    }

    static void gE(int n) {
        if (n == 60) {
            h.f(62, true);
        }
    }

    static void G(boolean bl) {
    }

    static void cZ() {
    }

    static void gF(int n) {
    }

    static void da() {
    }

    static void db() {
    }

    static void dc() {
        if (!h.wc(63)) {
            bc = h.lS();
            if (bc == null) {
                h.f(63, true);
                bc = h.vV(60);
            } else if (h.dl(h.bc.c, 256)) {
                h.n(26, 1336, 990);
                h.n(54, 1275, 988);
                h.dm(26, 13);
                h.dm(54, 13);
                h.dj(26, 4096);
                h.dj(54, 4096);
                h.wf(133);
                h.wf(125);
                h.dj(81, 2048);
            } else {
                h.f(63, true);
            }
        }
    }

    static void dd() {
        h.wd(64);
        h.dk(81, 2048);
    }

    static void de() {
        h.aZ(false);
        h.dk(81, 2048);
        if (bc != null) {
            h.dk(h.bc.c, 260);
        }
        if (!h.dl(0, 2)) {
            h.o(0, h.vV((int)0).h, h.vV((int)0).i);
        }
    }

    static void gG(int n) {
        if (bc != null && h.l(h.bc.c, 81, 35)) {
            h.wq(h.bc.c);
            h.dq(0, 500);
        }
    }

    static void gH(int n) {
    }

    static void gI(int n) {
    }

    static void gJ(int n) {
    }

    static void gK(int n) {
        if (n == h.bc.c) {
            h.dk(h.bc.c, 4);
            h.dj(81, 2048);
        }
    }

    static void gL(int n) {
        if (n == h.bc.c) {
            h.dk(81, 2048);
            h.dj(h.bc.c, 4);
        }
    }

    static void gM(int n) {
    }

    static void gN(int n) {
    }

    static void gO(int n) {
    }

    static void aF(int n, int n2) {
        block0 : switch (n) {
            case 0: {
                switch (n2) {
                    case 0: {
                        h.wf(134);
                        h.dk(81, 2048);
                        break block0;
                    }
                    case 500: {
                        h.m(26, 60, 15);
                        h.m(54, 60, 15);
                        break block0;
                    }
                    case 1500: {
                        h.dy(15, 2);
                        h.d(26, false);
                        h.d(54, false);
                        h.we(63);
                        h.vZ(0);
                    }
                }
            }
        }
    }

    static void aG(int n, int n2) {
    }

    static void gP(int n) {
        if (n == 60 || n == 0) {
            h.f(63, true);
        }
    }

    static void H(boolean bl) {
    }

    static void df() {
    }

    static void gQ(int n) {
    }

    static void dg() {
    }

    static void dh() {
    }

    static void di() {
        if (!h.wc(64)) {
            bd = h.lS();
            if (bd == null) {
                h.f(64, true);
                bd = h.vV(60);
            } else if (h.dl(h.bd.c, 256)) {
                h.wf(126);
                h.dj(47, 2048);
                h.dj(46, 2048);
            } else {
                h.f(64, true);
            }
        }
    }

    static void dj() {
        h.dk(47, 2048);
        h.dk(46, 2048);
    }

    static void dk() {
        h.aZ(false);
        if (bd != null) {
            h.dk(h.bd.c, 260);
        }
        h.o(0, h.vV((int)0).h, h.vV((int)0).i);
    }

    static void gR(int n) {
    }

    static void gS(int n) {
    }

    static void gT(int n) {
    }

    static void gU(int n) {
    }

    static void gV(int n) {
        if (n == 60) {
            h.dk(60, 4);
        }
    }

    static void gW(int n) {
        if (n == 60) {
            h.dj(60, 4);
        }
    }

    static boolean gX(int n) {
        return false;
    }

    static void gY(int n) {
    }

    static void aH(int n, int n2) {
    }

    static void aI(int n, int n2) {
    }

    static void gZ(int n) {
    }

    static void ha(int n) {
        if (n == 60 || n == 0) {
            h.f(64, true);
        }
    }

    static void I(boolean bl) {
    }

    static void dl() {
    }

    static void hb(int n) {
    }

    static void dm() {
    }

    static void dn() {
    }

    static void do() {
        if (!h.wc(72)) {
            h.dp(2, 4000);
            h.d(15, true);
            h.dj(15, 12);
        }
    }

    static void dp() {
        h.dk(15, 12);
        h.wd(73);
    }

    static void dq() {
        h.aZ(false);
    }

    static void hc(int n) {
    }

    static void hd(int n) {
    }

    static void he(int n) {
    }

    static void hf(int n) {
        if (15 == n) {
            h.wf(148);
            h.dk(15, 12);
            h.we(72);
        }
    }

    static void hg(int n) {
    }

    static void hh(int n) {
    }

    static boolean hi(int n) {
        return false;
    }

    static void hj(int n) {
        if (n == 2) {
            h.wf(143);
        }
    }

    static void aJ(int n, int n2) {
    }

    static void hk(int n) {
    }

    static void aK(int n, int n2) {
    }

    static void hl(int n) {
        if (n == 0) {
            h.f(72, true);
        }
    }

    static void J(boolean bl) {
    }

    static void dr() {
    }

    static void hm(int n) {
    }

    static void ds() {
    }

    static void dt() {
    }

    static void du() {
        if (!h.wc(73)) {
            h.d(15, true);
            be = h.lS();
            if (be == null || !h.dl(h.be.c, 256)) {
                h.wf(144);
                h.n(60, 1671, 274);
                h.d(60, true);
                h.d(85, false);
                h.dm(60, 5);
                h.dn(60, 180);
                h.dj(60, 4100);
                be = h.vV(60);
            } else {
                h.dj(66, 2048);
            }
        }
    }

    static void dv() {
        h.dk(15, 12);
        h.dk(66, 2048);
        h.wd(74);
    }

    static void dw() {
        h.aZ(false);
        if (be != null) {
            h.dk(h.be.c, 4);
        }
        if (!h.dl(0, 2)) {
            h.c(0, h.vV((int)0).h, h.vV((int)0).i, 3000);
        }
    }

    static void hn(int n) {
        if (be != null && h.l(h.be.c, 66, 35) && h.dl(66, 2048)) {
            h.wq(h.be.c);
            if (!h.wa(0)) {
                h.a("start thread");
                h.dq(0, 500);
            }
        }
    }

    static void ho(int n) {
    }

    static void hp(int n) {
    }

    static void hq(int n) {
    }

    static void hr(int n) {
        if (60 == n && h.dl(60, 4)) {
            h.dk(60, 4100);
            h.dj(66, 2048);
            h.dj(60, 256);
        }
        if (h.dl(n, 256)) {
            h.dk(n, 4);
            h.dj(66, 2048);
        }
        if (h.dl(n, 260) && h.dl(58, 256)) {
            h.we(73);
        }
    }

    static void hs(int n) {
        if (h.dl(n, 256)) {
            h.dk(66, 2048);
            h.dj(n, 4);
        }
    }

    static boolean ht(int n) {
        return false;
    }

    static void hu(int n) {
        if (n == 1) {
            h.d(15, false);
            if (h.lS() != null) {
                h.a("ifffffffffff");
                h.we(73);
            } else {
                h.a("elseeeeeeeeeee");
                h.dj(58, 256);
            }
        }
    }

    static void aL(int n, int n2) {
        block0 : switch (n) {
            case 0: {
                switch (n2) {
                    case 0: {
                        h.wf(149);
                        h.dk(66, 2048);
                        break block0;
                    }
                    case 500: {
                        h.a("case 500");
                        h.m(15, h.be.c, 15);
                        break block0;
                    }
                    case 1500: {
                        h.a("case 1500");
                        h.dp(1, 500);
                        h.vZ(0);
                    }
                }
            }
        }
    }

    static void hv(int n) {
    }

    static void aM(int n, int n2) {
    }

    static void hw(int n) {
        if (n == h.be.c || n == 0) {
            h.f(73, true);
        }
    }

    static void K(boolean bl) {
    }

    static void dx() {
    }

    static void hx(int n) {
    }

    static void dy() {
    }

    static void dz() {
    }

    static void dA() {
        if (!h.wc(74)) {
            h.wf(145);
            h.dj(49, 2048);
            h.dj(50, 2048);
            h.aX(false);
            bf = h.lS();
            if (bf != null) {
                if (!h.dl(h.bf.c, 256)) {
                    h.f(74, true);
                }
            } else {
                h.f(74, true);
            }
        }
    }

    static void dB() {
        h.dk(49, 2048);
        h.dk(50, 2048);
        h.aX(true);
    }

    static void dC() {
        h.aZ(false);
        h.aX(true);
        h.dk(49, 2048);
        h.dk(50, 2048);
        if (bf != null) {
            h.dk(h.bf.c, 4);
        }
        if (!h.dl(0, 2)) {
            h.c(0, h.vV((int)0).h, h.vV((int)0).i, 3000);
        }
    }

    static void hy(int n) {
    }

    static void hz(int n) {
    }

    static void hA(int n) {
    }

    static void hB(int n) {
    }

    static void hC(int n) {
        if (h.dl(n, 256)) {
            h.dk(n, 4);
            h.dj(49, 2048);
            h.dj(50, 2048);
            h.d(50, true);
            h.d(49, true);
        }
    }

    static void hD(int n) {
        if (h.dl(n, 256)) {
            h.dj(n, 4);
            h.dk(49, 2048);
            h.dk(50, 2048);
            h.d(50, false);
            h.d(49, false);
        }
    }

    static boolean hE(int n) {
        return false;
    }

    static void hF(int n) {
    }

    static void aN(int n, int n2) {
    }

    static void aO(int n, int n2) {
    }

    static void hG(int n) {
    }

    static void hH(int n) {
        if (n == h.bf.c || n == 0) {
            h.f(74, true);
        }
    }

    static void L(boolean bl) {
    }

    static void dD() {
    }

    static void hI(int n) {
    }

    static void dE() {
    }

    static void dF() {
        if (!h.wc(0) && !h.wb(0)) {
            if (cj) {
                h.wd(0);
            } else {
                h.wd(1);
            }
        }
        if (!h.wb(6) || !h.wc(6)) {
            // empty if block
        }
        if (h.wb(7) && !h.wc(7)) {
            h.dj(52, 2048);
            h.dj(51, 2048);
        }
        if (h.wb(8) && !h.wc(8)) {
            f f2 = h.lS();
            if (f2 == null) {
                h.aZ(false);
                h.f(8, false);
            } else if (!h.dl(f2.c, 256)) {
                h.aZ(false);
                h.f(8, false);
            } else {
                h.dj(52, 2048);
                h.dj(51, 2048);
            }
        }
        if (h.wb(9) && !h.wc(9)) {
            h.aZ(false);
            h.f(9, false);
        }
        if (!h.wb(11) || !h.wc(11)) {
            // empty if block
        }
        if (!h.wb(12) || !h.wc(12)) {
            // empty if block
        }
        if (h.wb(13) && !h.wc(13)) {
            h.dj(52, 2048);
            h.dj(51, 2048);
        }
        if (h.wb(14) && !h.wc(14)) {
            h.dj(52, 2048);
            h.dj(51, 2048);
        }
        if (h.wb(15) && !h.wc(15)) {
            h.aZ(false);
            h.f(15, false);
            h.dj(52, 2048);
            h.dj(51, 2048);
        }
        if (h.wb(16) && !h.wc(16)) {
            h.we(16);
            h.wd(17);
        }
        if (!h.wb(17) || !h.wc(17)) {
            // empty if block
        }
        if (h.wb(18) && !h.wc(18)) {
            h.dj(52, 2048);
            h.dj(51, 2048);
        }
        if (h.wb(19) && !h.wc(19)) {
            h.dj(52, 2048);
            h.dj(51, 2048);
        }
        if (h.wb(20) && !h.wc(20)) {
            h.dj(52, 2048);
            h.dj(51, 2048);
        }
        if (h.wb(21) && !h.wc(21)) {
            h.dj(52, 2048);
            h.dj(51, 2048);
        }
        if (h.wb(22) && !h.wc(22)) {
            h.dj(52, 2048);
            h.dj(51, 2048);
        }
        if (h.wb(23) && !h.wc(23)) {
            h.we(23);
            h.wd(24);
        }
        if (!h.wb(24) || !h.wc(24)) {
            // empty if block
        }
        if (h.wb(25) && !h.wc(25)) {
            h.dj(49, 2048);
            h.dj(50, 2048);
        }
        if (h.wb(26) && !h.wc(26)) {
            h.dj(49, 2048);
            h.dj(50, 2048);
        }
        if (h.wb(27) && !h.wc(27)) {
            h.dj(49, 2048);
            h.dj(50, 2048);
        }
        if (!h.wb(28) || !h.wc(28)) {
            // empty if block
        }
        if (!h.wb(29) || !h.wc(29)) {
            // empty if block
        }
        if (h.wb(30) && !h.wc(30)) {
            h.aZ(false);
            h.f(30, false);
        }
        if (h.wb(31) && !h.wc(31)) {
            h.aZ(false);
            h.f(31, false);
        }
        if (h.wb(32) && !h.wc(32)) {
            h.dj(47, 2048);
            h.dj(46, 2048);
        }
        if (h.wb(33) && !h.wc(33)) {
            h.dj(47, 2048);
            h.dj(46, 2048);
        }
        if (h.wb(35) && !h.wc(35)) {
            h.dj(47, 2048);
            h.dj(46, 2048);
        }
        if (h.wb(36) && !h.wc(36)) {
            h.dj(47, 2048);
            h.dj(46, 2048);
        }
        if (h.wb(37) && !h.wc(37)) {
            h.dj(47, 2048);
            h.dj(46, 2048);
        }
        if (h.wb(38) && !h.wc(38)) {
            h.dj(47, 2048);
            h.dj(46, 2048);
        }
        if (h.wb(39) && !h.wc(39)) {
            h.dj(47, 2048);
            h.dj(46, 2048);
        }
        if (h.wb(40) && !h.wc(40)) {
            h.dj(47, 2048);
            h.dj(46, 2048);
        }
        if (!h.wb(41) || !h.wc(41)) {
            // empty if block
        }
        if (!h.wb(42) || !h.wc(42)) {
            // empty if block
        }
        if (!h.wb(43) || !h.wc(43)) {
            // empty if block
        }
        if (!h.wb(44) || !h.wc(44)) {
            // empty if block
        }
        if (h.wb(46) && !h.wc(46)) {
            h.dj(47, 2048);
            h.dj(46, 2048);
        }
        if (h.wb(47) && !h.wc(47)) {
            h.dj(47, 2048);
            h.dj(46, 2048);
        }
        if (h.wb(48) && !h.wc(48)) {
            h.dj(47, 2048);
            h.dj(46, 2048);
        }
        if (h.wb(49) && !h.wc(49)) {
            h.dj(47, 2048);
            h.dj(46, 2048);
        }
        if (h.wb(50) && !h.wc(50)) {
            h.we(50);
            h.wd(51);
        }
        if (!h.wb(51) || !h.wc(51)) {
            // empty if block
        }
        if (h.wb(52) && !h.wc(52)) {
            h.dj(49, 2048);
            h.dj(50, 2048);
        }
        if (h.wb(53) && !h.wc(53)) {
            h.dj(49, 2048);
            h.dj(50, 2048);
        }
        if (h.wb(54) && !h.wc(54)) {
            h.we(54);
            h.wd(55);
        }
        if (!h.wb(55) || !h.wc(55)) {
            // empty if block
        }
        if (!h.wb(56) || !h.wc(56)) {
            // empty if block
        }
        if (!h.wb(58) || !h.wc(58)) {
            // empty if block
        }
        if (!h.wb(60) || !h.wc(60)) {
            // empty if block
        }
        if (!h.wb(61) || !h.wc(61)) {
            // empty if block
        }
        if (!h.wb(63) || !h.wc(63)) {
            // empty if block
        }
        if (h.wb(64) && !h.wc(64)) {
            h.dj(47, 2048);
            h.dj(46, 2048);
        }
        if (h.wb(65) && !h.wc(65)) {
            h.dj(47, 2048);
            h.dj(46, 2048);
        }
        if (h.wb(66) && !h.wc(66)) {
            h.dj(47, 2048);
            h.dj(46, 2048);
        }
        if (!h.wb(67) || !h.wc(67)) {
            // empty if block
        }
        if (h.wb(68) && !h.wc(68)) {
            h.dj(49, 2048);
            h.dj(50, 2048);
        }
        if (h.wb(69) && !h.wc(69)) {
            h.dj(49, 2048);
            h.dj(50, 2048);
        }
        if (h.wb(70) && !h.wc(70)) {
            h.dj(49, 2048);
            h.dj(50, 2048);
        }
        if (h.wb(71) && !h.wc(71)) {
            h.we(71);
            h.wd(72);
        }
        if (!h.wb(72) || !h.wc(72)) {
            // empty if block
        }
        if (h.wb(74) && !h.wc(74)) {
            h.dj(49, 2048);
            h.dj(50, 2048);
        }
        if (h.wb(75) && !h.wc(75)) {
            h.dj(49, 2048);
            h.dj(50, 2048);
        }
        if (h.wb(76) && !h.wc(76)) {
            h.dj(49, 2048);
            h.dj(50, 2048);
        }
        if (h.wb(77) && !h.wc(77)) {
            h.dj(49, 2048);
            h.dj(50, 2048);
        }
        if (h.wb(78) && !h.wc(78)) {
            h.dj(47, 2048);
            h.dj(46, 2048);
            h.dj(49, 2048);
            h.dj(50, 2048);
        }
        if (h.wb(79) && !h.wc(79)) {
            h.dj(47, 2048);
            h.dj(46, 2048);
            h.dj(49, 2048);
            h.dj(50, 2048);
        }
        if (h.wb(80) && !h.wc(80)) {
            h.dj(47, 2048);
            h.dj(46, 2048);
            h.dj(49, 2048);
            h.dj(50, 2048);
        }
        if (h.wb(81) && !h.wc(81)) {
            h.dj(47, 2048);
            h.dj(46, 2048);
            h.dj(49, 2048);
            h.dj(50, 2048);
        }
        if (h.wb(82) && !h.wc(82)) {
            h.dj(47, 2048);
            h.dj(46, 2048);
            h.dj(49, 2048);
            h.dj(50, 2048);
        }
        if (h.wb(83) && !h.wc(83)) {
            h.dj(47, 2048);
            h.dj(46, 2048);
            h.dj(49, 2048);
            h.dj(50, 2048);
        }
        if (h.wb(84) && !h.wc(84)) {
            h.dj(47, 2048);
            h.dj(46, 2048);
            h.dj(49, 2048);
            h.dj(50, 2048);
        }
    }

    static void hJ(int n) {
        switch (h.q()) {
            case 1: {
                h.S(n);
                break;
            }
            case 0: {
                h.ad(n);
                break;
            }
            case 2: {
                h.ao(n);
                break;
            }
            case 3: {
                h.az(n);
                break;
            }
            case 4: {
                h.aK(n);
                break;
            }
            case 5: {
                h.aV(n);
                break;
            }
            case 6: {
                h.bg(n);
                break;
            }
            case 7: {
                h.br(n);
                break;
            }
            case 10: {
                h.bC(n);
                break;
            }
            case 11: {
                h.bN(n);
                break;
            }
            case 12: {
                h.bY(n);
                break;
            }
            case 13: {
                h.cj(n);
                break;
            }
            case 17: {
                h.cu(n);
                break;
            }
            case 18: {
                h.cF(n);
                break;
            }
            case 24: {
                h.cQ(n);
                break;
            }
            case 25: {
                h.db(n);
                break;
            }
            case 41: {
                h.dm(n);
                break;
            }
            case 42: {
                h.dx(n);
                break;
            }
            case 43: {
                h.dI(n);
                break;
            }
            case 44: {
                h.dT(n);
                break;
            }
            case 45: {
                h.ee(n);
                break;
            }
            case 46: {
                h.ep(n);
                break;
            }
            case 51: {
                h.eA(n);
                break;
            }
            case 52: {
                h.eL(n);
                break;
            }
            case 55: {
                h.eW(n);
                break;
            }
            case 56: {
                h.fh(n);
                break;
            }
            case 57: {
                h.fs(n);
                break;
            }
            case 58: {
                h.fD(n);
                break;
            }
            case 59: {
                h.fO(n);
                break;
            }
            case 60: {
                h.fZ(n);
                break;
            }
            case 61: {
                h.gk(n);
                break;
            }
            case 62: {
                h.gv(n);
                break;
            }
            case 63: {
                h.gG(n);
                break;
            }
            case 64: {
                h.gR(n);
                break;
            }
            case 72: {
                h.hc(n);
                break;
            }
            case 73: {
                h.hn(n);
                break;
            }
            case 74: {
                h.hy(n);
            }
        }
    }

    static void hK(int n) {
        switch (n) {
            case 1: {
                h.r();
                break;
            }
            case 0: {
                h.x();
                break;
            }
            case 2: {
                h.D();
                break;
            }
            case 3: {
                h.J();
                break;
            }
            case 4: {
                h.P();
                break;
            }
            case 5: {
                h.V();
                break;
            }
            case 6: {
                h.ab();
                break;
            }
            case 7: {
                h.ah();
                break;
            }
            case 10: {
                h.an();
                break;
            }
            case 11: {
                h.at();
                break;
            }
            case 12: {
                h.az();
                break;
            }
            case 13: {
                h.aF();
                break;
            }
            case 17: {
                h.aL();
                break;
            }
            case 18: {
                h.aR();
                break;
            }
            case 24: {
                h.aX();
                break;
            }
            case 25: {
                h.bd();
                break;
            }
            case 41: {
                h.bj();
                break;
            }
            case 42: {
                h.bp();
                break;
            }
            case 43: {
                h.bv();
                break;
            }
            case 44: {
                h.bB();
                break;
            }
            case 45: {
                h.bH();
                break;
            }
            case 46: {
                h.bN();
                break;
            }
            case 51: {
                h.bT();
                break;
            }
            case 52: {
                h.bZ();
                break;
            }
            case 55: {
                h.cf();
                break;
            }
            case 56: {
                h.cl();
                break;
            }
            case 57: {
                h.cr();
                break;
            }
            case 58: {
                h.cx();
                break;
            }
            case 59: {
                h.cD();
                break;
            }
            case 60: {
                h.cJ();
                break;
            }
            case 61: {
                h.cP();
                break;
            }
            case 62: {
                h.cV();
                break;
            }
            case 63: {
                h.db();
                break;
            }
            case 64: {
                h.dh();
                break;
            }
            case 72: {
                h.dn();
                break;
            }
            case 73: {
                h.dt();
                break;
            }
            case 74: {
                h.dz();
            }
        }
    }

    static void hL(int n) {
        switch (n) {
            case 1: {
                h.s();
                break;
            }
            case 0: {
                h.y();
                break;
            }
            case 2: {
                h.E();
                break;
            }
            case 3: {
                h.K();
                break;
            }
            case 4: {
                h.Q();
                break;
            }
            case 5: {
                h.W();
                break;
            }
            case 6: {
                h.ac();
                break;
            }
            case 7: {
                h.ai();
                break;
            }
            case 10: {
                h.ao();
                break;
            }
            case 11: {
                h.au();
                break;
            }
            case 12: {
                h.aA();
                break;
            }
            case 13: {
                h.aG();
                break;
            }
            case 17: {
                h.aM();
                break;
            }
            case 18: {
                h.aS();
                break;
            }
            case 24: {
                h.aY();
                break;
            }
            case 25: {
                h.be();
                break;
            }
            case 41: {
                h.bk();
                break;
            }
            case 42: {
                h.bq();
                break;
            }
            case 43: {
                h.bw();
                break;
            }
            case 44: {
                h.bC();
                break;
            }
            case 45: {
                h.bI();
                break;
            }
            case 46: {
                h.bO();
                break;
            }
            case 51: {
                h.bU();
                break;
            }
            case 52: {
                h.ca();
                break;
            }
            case 55: {
                h.cg();
                break;
            }
            case 56: {
                h.cm();
                break;
            }
            case 57: {
                h.cs();
                break;
            }
            case 58: {
                h.cy();
                break;
            }
            case 59: {
                h.cE();
                break;
            }
            case 60: {
                h.cK();
                break;
            }
            case 61: {
                h.cQ();
                break;
            }
            case 62: {
                h.cW();
                break;
            }
            case 63: {
                h.dc();
                break;
            }
            case 64: {
                h.di();
                break;
            }
            case 72: {
                h.do();
                break;
            }
            case 73: {
                h.du();
                break;
            }
            case 74: {
                h.dA();
            }
        }
    }

    static void hM(int n) {
        switch (n) {
            case 1: {
                h.t();
                break;
            }
            case 0: {
                h.z();
                break;
            }
            case 2: {
                h.F();
                break;
            }
            case 3: {
                h.L();
                break;
            }
            case 4: {
                h.R();
                break;
            }
            case 5: {
                h.X();
                break;
            }
            case 6: {
                h.ad();
                break;
            }
            case 7: {
                h.aj();
                break;
            }
            case 10: {
                h.ap();
                break;
            }
            case 11: {
                h.av();
                break;
            }
            case 12: {
                h.aB();
                break;
            }
            case 13: {
                h.aH();
                break;
            }
            case 17: {
                h.aN();
                break;
            }
            case 18: {
                h.aT();
                break;
            }
            case 24: {
                h.aZ();
                break;
            }
            case 25: {
                h.bf();
                break;
            }
            case 41: {
                h.bl();
                break;
            }
            case 42: {
                h.br();
                break;
            }
            case 43: {
                h.bx();
                break;
            }
            case 44: {
                h.bD();
                break;
            }
            case 45: {
                h.bJ();
                break;
            }
            case 46: {
                h.bP();
                break;
            }
            case 51: {
                h.bV();
                break;
            }
            case 52: {
                h.cb();
                break;
            }
            case 55: {
                h.ch();
                break;
            }
            case 56: {
                h.cn();
                break;
            }
            case 57: {
                h.ct();
                break;
            }
            case 58: {
                h.cz();
                break;
            }
            case 59: {
                h.cF();
                break;
            }
            case 60: {
                h.cL();
                break;
            }
            case 61: {
                h.cR();
                break;
            }
            case 62: {
                h.cX();
                break;
            }
            case 63: {
                h.dd();
                break;
            }
            case 64: {
                h.dj();
                break;
            }
            case 72: {
                h.dp();
                break;
            }
            case 73: {
                h.dv();
                break;
            }
            case 74: {
                h.dB();
            }
        }
    }

    static void hN(int n) {
        switch (n) {
            case 1: {
                h.u();
                break;
            }
            case 0: {
                h.A();
                break;
            }
            case 2: {
                h.G();
                break;
            }
            case 3: {
                h.M();
                break;
            }
            case 4: {
                h.S();
                break;
            }
            case 5: {
                h.Y();
                break;
            }
            case 6: {
                h.ae();
                break;
            }
            case 7: {
                h.ak();
                break;
            }
            case 10: {
                h.aq();
                break;
            }
            case 11: {
                h.aw();
                break;
            }
            case 12: {
                h.aC();
                break;
            }
            case 13: {
                h.aI();
                break;
            }
            case 17: {
                h.aO();
                break;
            }
            case 18: {
                h.aU();
                break;
            }
            case 24: {
                h.ba();
                break;
            }
            case 25: {
                h.bg();
                break;
            }
            case 41: {
                h.bm();
                break;
            }
            case 42: {
                h.bs();
                break;
            }
            case 43: {
                h.by();
                break;
            }
            case 44: {
                h.bE();
                break;
            }
            case 45: {
                h.bK();
                break;
            }
            case 46: {
                h.bQ();
                break;
            }
            case 51: {
                h.bW();
                break;
            }
            case 52: {
                h.cc();
                break;
            }
            case 55: {
                h.ci();
                break;
            }
            case 56: {
                h.co();
                break;
            }
            case 57: {
                h.cu();
                break;
            }
            case 58: {
                h.cA();
                break;
            }
            case 59: {
                h.cG();
                break;
            }
            case 60: {
                h.cM();
                break;
            }
            case 61: {
                h.cS();
                break;
            }
            case 62: {
                h.cY();
                break;
            }
            case 63: {
                h.de();
                break;
            }
            case 64: {
                h.dk();
                break;
            }
            case 72: {
                h.dq();
                break;
            }
            case 73: {
                h.dw();
                break;
            }
            case 74: {
                h.dC();
            }
        }
    }

    static void hO(int n) {
        switch (h.q()) {
            case 1: {
                h.T(n);
                break;
            }
            case 0: {
                h.ae(n);
                break;
            }
            case 2: {
                h.ap(n);
                break;
            }
            case 3: {
                h.aA(n);
                break;
            }
            case 4: {
                h.aL(n);
                break;
            }
            case 5: {
                h.aW(n);
                break;
            }
            case 6: {
                h.bh(n);
                break;
            }
            case 7: {
                h.bs(n);
                break;
            }
            case 10: {
                h.bD(n);
                break;
            }
            case 11: {
                h.bO(n);
                break;
            }
            case 12: {
                h.bZ(n);
                break;
            }
            case 13: {
                h.ck(n);
                break;
            }
            case 17: {
                h.cv(n);
                break;
            }
            case 18: {
                h.cG(n);
                break;
            }
            case 24: {
                h.cR(n);
                break;
            }
            case 25: {
                h.dc(n);
                break;
            }
            case 41: {
                h.dn(n);
                break;
            }
            case 42: {
                h.dy(n);
                break;
            }
            case 43: {
                h.dJ(n);
                break;
            }
            case 44: {
                h.dU(n);
                break;
            }
            case 45: {
                h.ef(n);
                break;
            }
            case 46: {
                h.eq(n);
                break;
            }
            case 51: {
                h.eB(n);
                break;
            }
            case 52: {
                h.eM(n);
                break;
            }
            case 55: {
                h.eX(n);
                break;
            }
            case 56: {
                h.fi(n);
                break;
            }
            case 57: {
                h.ft(n);
                break;
            }
            case 58: {
                h.fE(n);
                break;
            }
            case 59: {
                h.fP(n);
                break;
            }
            case 60: {
                h.ga(n);
                break;
            }
            case 61: {
                h.gl(n);
                break;
            }
            case 62: {
                h.gw(n);
                break;
            }
            case 63: {
                h.gH(n);
                break;
            }
            case 64: {
                h.gS(n);
                break;
            }
            case 72: {
                h.hd(n);
                break;
            }
            case 73: {
                h.ho(n);
                break;
            }
            case 74: {
                h.hz(n);
            }
        }
    }

    static void hP(int n) {
        switch (h.q()) {
            case 1: {
                h.U(n);
                break;
            }
            case 0: {
                h.af(n);
                break;
            }
            case 2: {
                h.aq(n);
                break;
            }
            case 3: {
                h.aB(n);
                break;
            }
            case 4: {
                h.aM(n);
                break;
            }
            case 5: {
                h.aX(n);
                break;
            }
            case 6: {
                h.bi(n);
                break;
            }
            case 7: {
                h.bt(n);
                break;
            }
            case 10: {
                h.bE(n);
                break;
            }
            case 11: {
                h.bP(n);
                break;
            }
            case 12: {
                h.ca(n);
                break;
            }
            case 13: {
                h.cl(n);
                break;
            }
            case 17: {
                h.cw(n);
                break;
            }
            case 18: {
                h.cH(n);
                break;
            }
            case 24: {
                h.cS(n);
                break;
            }
            case 25: {
                h.dd(n);
                break;
            }
            case 41: {
                h.do(n);
                break;
            }
            case 42: {
                h.dz(n);
                break;
            }
            case 43: {
                h.dK(n);
                break;
            }
            case 44: {
                h.dV(n);
                break;
            }
            case 45: {
                h.eg(n);
                break;
            }
            case 46: {
                h.er(n);
                break;
            }
            case 51: {
                h.eC(n);
                break;
            }
            case 52: {
                h.eN(n);
                break;
            }
            case 55: {
                h.eY(n);
                break;
            }
            case 56: {
                h.fj(n);
                break;
            }
            case 57: {
                h.fu(n);
                break;
            }
            case 58: {
                h.fF(n);
                break;
            }
            case 59: {
                h.fQ(n);
                break;
            }
            case 60: {
                h.gb(n);
                break;
            }
            case 61: {
                h.gm(n);
                break;
            }
            case 62: {
                h.gx(n);
                break;
            }
            case 63: {
                h.gI(n);
                break;
            }
            case 64: {
                h.gT(n);
                break;
            }
            case 72: {
                h.he(n);
                break;
            }
            case 73: {
                h.hp(n);
                break;
            }
            case 74: {
                h.hA(n);
            }
        }
    }

    static void hQ(int n) {
        switch (h.q()) {
            case 1: {
                h.V(n);
                break;
            }
            case 0: {
                h.ag(n);
                break;
            }
            case 2: {
                h.ar(n);
                break;
            }
            case 3: {
                h.aC(n);
                break;
            }
            case 4: {
                h.aN(n);
                break;
            }
            case 5: {
                h.aY(n);
                break;
            }
            case 6: {
                h.bj(n);
                break;
            }
            case 7: {
                h.bu(n);
                break;
            }
            case 10: {
                h.bF(n);
                break;
            }
            case 11: {
                h.bQ(n);
                break;
            }
            case 12: {
                h.cb(n);
                break;
            }
            case 13: {
                h.cm(n);
                break;
            }
            case 17: {
                h.cx(n);
                break;
            }
            case 18: {
                h.cI(n);
                break;
            }
            case 24: {
                h.cT(n);
                break;
            }
            case 25: {
                h.de(n);
                break;
            }
            case 41: {
                h.dp(n);
                break;
            }
            case 42: {
                h.dA(n);
                break;
            }
            case 43: {
                h.dL(n);
                break;
            }
            case 44: {
                h.dW(n);
                break;
            }
            case 45: {
                h.eh(n);
                break;
            }
            case 46: {
                h.es(n);
                break;
            }
            case 51: {
                h.eD(n);
                break;
            }
            case 52: {
                h.eO(n);
                break;
            }
            case 55: {
                h.eZ(n);
                break;
            }
            case 56: {
                h.fk(n);
                break;
            }
            case 57: {
                h.fv(n);
                break;
            }
            case 58: {
                h.fG(n);
                break;
            }
            case 59: {
                h.fR(n);
                break;
            }
            case 60: {
                h.gc(n);
                break;
            }
            case 61: {
                h.gn(n);
                break;
            }
            case 62: {
                h.gy(n);
                break;
            }
            case 63: {
                h.gJ(n);
                break;
            }
            case 64: {
                h.gU(n);
                break;
            }
            case 72: {
                h.hf(n);
                break;
            }
            case 73: {
                h.hq(n);
                break;
            }
            case 74: {
                h.hB(n);
            }
        }
    }

    static void hR(int n) {
        switch (h.q()) {
            case 1: {
                h.W(n);
                break;
            }
            case 0: {
                h.ah(n);
                break;
            }
            case 2: {
                h.as(n);
                break;
            }
            case 3: {
                h.aD(n);
                break;
            }
            case 4: {
                h.aO(n);
                break;
            }
            case 5: {
                h.aZ(n);
                break;
            }
            case 6: {
                h.bk(n);
                break;
            }
            case 7: {
                h.bv(n);
                break;
            }
            case 10: {
                h.bG(n);
                break;
            }
            case 11: {
                h.bR(n);
                break;
            }
            case 12: {
                h.cc(n);
                break;
            }
            case 13: {
                h.cn(n);
                break;
            }
            case 17: {
                h.cy(n);
                break;
            }
            case 18: {
                h.cJ(n);
                break;
            }
            case 24: {
                h.cU(n);
                break;
            }
            case 25: {
                h.df(n);
                break;
            }
            case 41: {
                h.dq(n);
                break;
            }
            case 42: {
                h.dB(n);
                break;
            }
            case 43: {
                h.dM(n);
                break;
            }
            case 44: {
                h.dX(n);
                break;
            }
            case 45: {
                h.ei(n);
                break;
            }
            case 46: {
                h.et(n);
                break;
            }
            case 51: {
                h.eE(n);
                break;
            }
            case 52: {
                h.eP(n);
                break;
            }
            case 55: {
                h.fa(n);
                break;
            }
            case 56: {
                h.fl(n);
                break;
            }
            case 57: {
                h.fw(n);
                break;
            }
            case 58: {
                h.fH(n);
                break;
            }
            case 59: {
                h.fS(n);
                break;
            }
            case 60: {
                h.gd(n);
                break;
            }
            case 61: {
                h.go(n);
                break;
            }
            case 62: {
                h.gz(n);
                break;
            }
            case 63: {
                h.gK(n);
                break;
            }
            case 64: {
                h.gV(n);
                break;
            }
            case 72: {
                h.hg(n);
                break;
            }
            case 73: {
                h.hr(n);
                break;
            }
            case 74: {
                h.hC(n);
            }
        }
        h.be(true);
    }

    static void hS(int n) {
        switch (h.q()) {
            case 1: {
                h.X(n);
                break;
            }
            case 0: {
                h.ai(n);
                break;
            }
            case 2: {
                h.at(n);
                break;
            }
            case 3: {
                h.aE(n);
                break;
            }
            case 4: {
                h.aP(n);
                break;
            }
            case 5: {
                h.ba(n);
                break;
            }
            case 6: {
                h.bl(n);
                break;
            }
            case 7: {
                h.bw(n);
                break;
            }
            case 10: {
                h.bH(n);
                break;
            }
            case 11: {
                h.bS(n);
                break;
            }
            case 12: {
                h.cd(n);
                break;
            }
            case 13: {
                h.co(n);
                break;
            }
            case 17: {
                h.cz(n);
                break;
            }
            case 18: {
                h.cK(n);
                break;
            }
            case 24: {
                h.cV(n);
                break;
            }
            case 25: {
                h.dg(n);
                break;
            }
            case 41: {
                h.dr(n);
                break;
            }
            case 42: {
                h.dC(n);
                break;
            }
            case 43: {
                h.dN(n);
                break;
            }
            case 44: {
                h.dY(n);
                break;
            }
            case 45: {
                h.ej(n);
                break;
            }
            case 46: {
                h.eu(n);
                break;
            }
            case 51: {
                h.eF(n);
                break;
            }
            case 52: {
                h.eQ(n);
                break;
            }
            case 55: {
                h.fb(n);
                break;
            }
            case 56: {
                h.fm(n);
                break;
            }
            case 57: {
                h.fx(n);
                break;
            }
            case 58: {
                h.fI(n);
                break;
            }
            case 59: {
                h.fT(n);
                break;
            }
            case 60: {
                h.ge(n);
                break;
            }
            case 61: {
                h.gp(n);
                break;
            }
            case 62: {
                h.gA(n);
                break;
            }
            case 63: {
                h.gL(n);
                break;
            }
            case 64: {
                h.gW(n);
                break;
            }
            case 72: {
                h.hh(n);
                break;
            }
            case 73: {
                h.hs(n);
                break;
            }
            case 74: {
                h.hD(n);
            }
        }
        h.be(false);
    }

    static void hT(int n) {
        switch (h.q()) {
            case 1: {
                h.Y(n);
                break;
            }
            case 0: {
                h.aj(n);
                break;
            }
            case 2: {
                h.au(n);
                break;
            }
            case 3: {
                h.aF(n);
                break;
            }
            case 4: {
                h.aQ(n);
                break;
            }
            case 5: {
                h.bb(n);
                break;
            }
            case 6: {
                h.bm(n);
                break;
            }
            case 7: {
                h.bx(n);
                break;
            }
            case 10: {
                h.bI(n);
                break;
            }
            case 11: {
                h.bT(n);
                break;
            }
            case 12: {
                h.ce(n);
                break;
            }
            case 13: {
                h.cp(n);
                break;
            }
            case 17: {
                h.cA(n);
                break;
            }
            case 18: {
                h.cL(n);
                break;
            }
            case 24: {
                h.cW(n);
                break;
            }
            case 25: {
                h.dh(n);
                break;
            }
            case 41: {
                h.ds(n);
                break;
            }
            case 42: {
                h.dD(n);
                break;
            }
            case 43: {
                h.dO(n);
                break;
            }
            case 44: {
                h.dZ(n);
                break;
            }
            case 45: {
                h.ek(n);
                break;
            }
            case 46: {
                h.ev(n);
                break;
            }
            case 51: {
                h.eG(n);
                break;
            }
            case 52: {
                h.eR(n);
                break;
            }
            case 55: {
                h.fc(n);
                break;
            }
            case 56: {
                h.fn(n);
                break;
            }
            case 57: {
                h.fy(n);
                break;
            }
            case 58: {
                h.fJ(n);
                break;
            }
            case 59: {
                h.fU(n);
                break;
            }
            case 60: {
                h.gf(n);
                break;
            }
            case 61: {
                h.gq(n);
                break;
            }
            case 62: {
                h.gB(n);
                break;
            }
            case 63: {
                h.gM(n);
                break;
            }
            case 64: {
                h.gX(n);
                break;
            }
            case 72: {
                h.hi(n);
                break;
            }
            case 73: {
                h.ht(n);
                break;
            }
            case 74: {
                h.hE(n);
            }
        }
    }

    static void hU(int n) {
        switch (h.q()) {
            case 1: {
                h.Z(n);
                break;
            }
            case 0: {
                h.ak(n);
                break;
            }
            case 2: {
                h.av(n);
                break;
            }
            case 3: {
                h.aG(n);
                break;
            }
            case 4: {
                h.aR(n);
                break;
            }
            case 5: {
                h.bc(n);
                break;
            }
            case 6: {
                h.bn(n);
                break;
            }
            case 7: {
                h.by(n);
                break;
            }
            case 10: {
                h.bK(n);
                break;
            }
            case 11: {
                h.bV(n);
                break;
            }
            case 12: {
                h.cg(n);
                break;
            }
            case 13: {
                h.cq(n);
                break;
            }
            case 17: {
                h.cC(n);
                break;
            }
            case 18: {
                h.cN(n);
                break;
            }
            case 24: {
                h.cX(n);
                break;
            }
            case 25: {
                h.di(n);
                break;
            }
            case 41: {
                h.du(n);
                break;
            }
            case 42: {
                h.dF(n);
                break;
            }
            case 43: {
                h.dQ(n);
                break;
            }
            case 44: {
                h.ea(n);
                break;
            }
            case 45: {
                h.el(n);
                break;
            }
            case 46: {
                h.ex(n);
                break;
            }
            case 51: {
                h.eH(n);
                break;
            }
            case 52: {
                h.eT(n);
                break;
            }
            case 55: {
                h.fd(n);
                break;
            }
            case 56: {
                h.fo(n);
                break;
            }
            case 57: {
                h.fz(n);
                break;
            }
            case 58: {
                h.fL(n);
                break;
            }
            case 59: {
                h.fW(n);
                break;
            }
            case 60: {
                h.gg(n);
                break;
            }
            case 61: {
                h.gr(n);
                break;
            }
            case 62: {
                h.gC(n);
                break;
            }
            case 63: {
                h.gN(n);
                break;
            }
            case 64: {
                h.gZ(n);
                break;
            }
            case 72: {
                h.hk(n);
                break;
            }
            case 73: {
                h.hv(n);
                break;
            }
            case 74: {
                h.hG(n);
            }
        }
    }

    static void hV(int n) {
        switch (h.q()) {
            case 1: {
                h.aa(n);
                break;
            }
            case 0: {
                h.al(n);
                break;
            }
            case 2: {
                h.aw(n);
                break;
            }
            case 3: {
                h.aH(n);
                break;
            }
            case 4: {
                h.aS(n);
                break;
            }
            case 5: {
                h.bd(n);
                break;
            }
            case 6: {
                h.bo(n);
                break;
            }
            case 7: {
                h.bz(n);
                break;
            }
            case 10: {
                h.bJ(n);
                break;
            }
            case 11: {
                h.bU(n);
                break;
            }
            case 12: {
                h.cf(n);
                break;
            }
            case 13: {
                h.cr(n);
                break;
            }
            case 17: {
                h.cB(n);
                break;
            }
            case 18: {
                h.cM(n);
                break;
            }
            case 24: {
                h.cY(n);
                break;
            }
            case 25: {
                h.dj(n);
                break;
            }
            case 41: {
                h.dt(n);
                break;
            }
            case 42: {
                h.dE(n);
                break;
            }
            case 43: {
                h.dP(n);
                break;
            }
            case 44: {
                h.eb(n);
                break;
            }
            case 45: {
                h.em(n);
                break;
            }
            case 46: {
                h.ew(n);
                break;
            }
            case 51: {
                h.eI(n);
                break;
            }
            case 52: {
                h.eS(n);
                break;
            }
            case 55: {
                h.fe(n);
                break;
            }
            case 56: {
                h.fp(n);
                break;
            }
            case 57: {
                h.fA(n);
                break;
            }
            case 58: {
                h.fK(n);
                break;
            }
            case 59: {
                h.fV(n);
                break;
            }
            case 60: {
                h.gh(n);
                break;
            }
            case 61: {
                h.gs(n);
                break;
            }
            case 62: {
                h.gD(n);
                break;
            }
            case 63: {
                h.gO(n);
                break;
            }
            case 64: {
                h.gY(n);
                break;
            }
            case 72: {
                h.hj(n);
                break;
            }
            case 73: {
                h.hu(n);
                break;
            }
            case 74: {
                h.hF(n);
            }
        }
    }

    static void aP(int n, int n2) {
        switch (h.q()) {
            case 1: {
                h.t(n, n2);
                break;
            }
            case 0: {
                h.v(n, n2);
                break;
            }
            case 2: {
                h.x(n, n2);
                break;
            }
            case 3: {
                h.z(n, n2);
                break;
            }
            case 4: {
                h.B(n, n2);
                break;
            }
            case 5: {
                h.D(n, n2);
                break;
            }
            case 6: {
                h.F(n, n2);
                break;
            }
            case 7: {
                h.H(n, n2);
                break;
            }
            case 10: {
                h.J(n, n2);
                break;
            }
            case 11: {
                h.L(n, n2);
                break;
            }
            case 12: {
                h.N(n, n2);
                break;
            }
            case 13: {
                h.P(n, n2);
                break;
            }
            case 17: {
                h.R(n, n2);
                break;
            }
            case 18: {
                h.T(n, n2);
                break;
            }
            case 24: {
                h.V(n, n2);
                break;
            }
            case 25: {
                h.X(n, n2);
                break;
            }
            case 41: {
                h.Z(n, n2);
                break;
            }
            case 42: {
                h.ab(n, n2);
                break;
            }
            case 43: {
                h.ad(n, n2);
                break;
            }
            case 44: {
                h.af(n, n2);
                break;
            }
            case 45: {
                h.ah(n, n2);
                break;
            }
            case 46: {
                h.aj(n, n2);
                break;
            }
            case 51: {
                h.al(n, n2);
                break;
            }
            case 52: {
                h.an(n, n2);
                break;
            }
            case 55: {
                h.ap(n, n2);
                break;
            }
            case 56: {
                h.ar(n, n2);
                break;
            }
            case 57: {
                h.at(n, n2);
                break;
            }
            case 58: {
                h.av(n, n2);
                break;
            }
            case 59: {
                h.ax(n, n2);
                break;
            }
            case 60: {
                h.az(n, n2);
                break;
            }
            case 61: {
                h.aB(n, n2);
                break;
            }
            case 62: {
                h.aD(n, n2);
                break;
            }
            case 63: {
                h.aF(n, n2);
                break;
            }
            case 64: {
                h.aH(n, n2);
                break;
            }
            case 72: {
                h.aJ(n, n2);
                break;
            }
            case 73: {
                h.aL(n, n2);
                break;
            }
            case 74: {
                h.aN(n, n2);
            }
        }
    }

    static void aQ(int n, int n2) {
        switch (h.q()) {
            case 1: {
                h.u(n, n2);
                break;
            }
            case 0: {
                h.w(n, n2);
                break;
            }
            case 2: {
                h.y(n, n2);
                break;
            }
            case 3: {
                h.A(n, n2);
                break;
            }
            case 4: {
                h.C(n, n2);
                break;
            }
            case 5: {
                h.E(n, n2);
                break;
            }
            case 6: {
                h.G(n, n2);
                break;
            }
            case 7: {
                h.I(n, n2);
                break;
            }
            case 10: {
                h.K(n, n2);
                break;
            }
            case 11: {
                h.M(n, n2);
                break;
            }
            case 12: {
                h.O(n, n2);
                break;
            }
            case 13: {
                h.Q(n, n2);
                break;
            }
            case 17: {
                h.S(n, n2);
                break;
            }
            case 18: {
                h.U(n, n2);
                break;
            }
            case 24: {
                h.W(n, n2);
                break;
            }
            case 25: {
                h.Y(n, n2);
                break;
            }
            case 41: {
                h.aa(n, n2);
                break;
            }
            case 42: {
                h.ac(n, n2);
                break;
            }
            case 43: {
                h.ae(n, n2);
                break;
            }
            case 44: {
                h.ag(n, n2);
                break;
            }
            case 45: {
                h.ai(n, n2);
                break;
            }
            case 46: {
                h.ak(n, n2);
                break;
            }
            case 51: {
                h.am(n, n2);
                break;
            }
            case 52: {
                h.ao(n, n2);
                break;
            }
            case 55: {
                h.aq(n, n2);
                break;
            }
            case 56: {
                h.as(n, n2);
                break;
            }
            case 57: {
                h.au(n, n2);
                break;
            }
            case 58: {
                h.aw(n, n2);
                break;
            }
            case 59: {
                h.ay(n, n2);
                break;
            }
            case 60: {
                h.aA(n, n2);
                break;
            }
            case 61: {
                h.aC(n, n2);
                break;
            }
            case 62: {
                h.aE(n, n2);
                break;
            }
            case 63: {
                h.aG(n, n2);
                break;
            }
            case 64: {
                h.aI(n, n2);
                break;
            }
            case 72: {
                h.aK(n, n2);
                break;
            }
            case 73: {
                h.aM(n, n2);
                break;
            }
            case 74: {
                h.aO(n, n2);
            }
        }
    }

    static void hW(int n) {
        switch (h.q()) {
            case 1: {
                h.ab(n);
                break;
            }
            case 0: {
                h.am(n);
                break;
            }
            case 2: {
                h.ax(n);
                break;
            }
            case 3: {
                h.aI(n);
                break;
            }
            case 4: {
                h.aT(n);
                break;
            }
            case 5: {
                h.be(n);
                break;
            }
            case 6: {
                h.bp(n);
                break;
            }
            case 7: {
                h.bA(n);
                break;
            }
            case 10: {
                h.bL(n);
                break;
            }
            case 11: {
                h.bW(n);
                break;
            }
            case 12: {
                h.ch(n);
                break;
            }
            case 13: {
                h.cs(n);
                break;
            }
            case 17: {
                h.cD(n);
                break;
            }
            case 18: {
                h.cO(n);
                break;
            }
            case 24: {
                h.cZ(n);
                break;
            }
            case 25: {
                h.dk(n);
                break;
            }
            case 41: {
                h.dv(n);
                break;
            }
            case 42: {
                h.dG(n);
                break;
            }
            case 43: {
                h.dR(n);
                break;
            }
            case 44: {
                h.ec(n);
                break;
            }
            case 45: {
                h.en(n);
                break;
            }
            case 46: {
                h.ey(n);
                break;
            }
            case 51: {
                h.eJ(n);
                break;
            }
            case 52: {
                h.eU(n);
                break;
            }
            case 55: {
                h.ff(n);
                break;
            }
            case 56: {
                h.fq(n);
                break;
            }
            case 57: {
                h.fB(n);
                break;
            }
            case 58: {
                h.fM(n);
                break;
            }
            case 59: {
                h.fX(n);
                break;
            }
            case 60: {
                h.gi(n);
                break;
            }
            case 61: {
                h.gt(n);
                break;
            }
            case 62: {
                h.gE(n);
                break;
            }
            case 63: {
                h.gP(n);
                break;
            }
            case 64: {
                h.ha(n);
                break;
            }
            case 72: {
                h.hl(n);
                break;
            }
            case 73: {
                h.hw(n);
                break;
            }
            case 74: {
                h.hH(n);
            }
        }
    }

    static void M(boolean bl) {
        switch (h.q()) {
            case 1: {
                h.b(bl);
                break;
            }
            case 0: {
                h.c(bl);
                break;
            }
            case 2: {
                h.d(bl);
                break;
            }
            case 3: {
                h.e(bl);
                break;
            }
            case 4: {
                h.f(bl);
                break;
            }
            case 5: {
                h.g(bl);
                break;
            }
            case 6: {
                h.h(bl);
                break;
            }
            case 7: {
                h.i(bl);
                break;
            }
            case 10: {
                h.j(bl);
                break;
            }
            case 11: {
                h.k(bl);
                break;
            }
            case 12: {
                h.l(bl);
                break;
            }
            case 13: {
                h.m(bl);
                break;
            }
            case 17: {
                h.n(bl);
                break;
            }
            case 18: {
                h.o(bl);
                break;
            }
            case 24: {
                h.p(bl);
                break;
            }
            case 25: {
                h.q(bl);
                break;
            }
            case 41: {
                h.r(bl);
                break;
            }
            case 42: {
                h.s(bl);
                break;
            }
            case 43: {
                h.t(bl);
                break;
            }
            case 44: {
                h.u(bl);
                break;
            }
            case 45: {
                h.v(bl);
                break;
            }
            case 46: {
                h.w(bl);
                break;
            }
            case 51: {
                h.x(bl);
                break;
            }
            case 52: {
                h.y(bl);
                break;
            }
            case 55: {
                h.z(bl);
                break;
            }
            case 56: {
                h.A(bl);
                break;
            }
            case 57: {
                h.B(bl);
                break;
            }
            case 58: {
                h.C(bl);
                break;
            }
            case 59: {
                h.D(bl);
                break;
            }
            case 60: {
                h.E(bl);
                break;
            }
            case 61: {
                h.F(bl);
                break;
            }
            case 62: {
                h.G(bl);
                break;
            }
            case 63: {
                h.H(bl);
                break;
            }
            case 64: {
                h.I(bl);
                break;
            }
            case 72: {
                h.J(bl);
                break;
            }
            case 73: {
                h.K(bl);
                break;
            }
            case 74: {
                h.L(bl);
            }
        }
    }

    static void dG() {
        switch (h.q()) {
            case 1: {
                h.v();
                break;
            }
            case 0: {
                h.B();
                break;
            }
            case 2: {
                h.H();
                break;
            }
            case 3: {
                h.N();
                break;
            }
            case 4: {
                h.T();
                break;
            }
            case 5: {
                h.Z();
                break;
            }
            case 6: {
                h.af();
                break;
            }
            case 7: {
                h.al();
                break;
            }
            case 10: {
                h.ar();
                break;
            }
            case 11: {
                h.ax();
                break;
            }
            case 12: {
                h.aD();
                break;
            }
            case 13: {
                h.aJ();
                break;
            }
            case 17: {
                h.aP();
                break;
            }
            case 18: {
                h.aV();
                break;
            }
            case 24: {
                h.bb();
                break;
            }
            case 25: {
                h.bh();
                break;
            }
            case 41: {
                h.bn();
                break;
            }
            case 42: {
                h.bt();
                break;
            }
            case 43: {
                h.bz();
                break;
            }
            case 44: {
                h.bF();
                break;
            }
            case 45: {
                h.bL();
                break;
            }
            case 46: {
                h.bR();
                break;
            }
            case 51: {
                h.bX();
                break;
            }
            case 52: {
                h.cd();
                break;
            }
            case 55: {
                h.cj();
                break;
            }
            case 56: {
                h.cp();
                break;
            }
            case 57: {
                h.cv();
                break;
            }
            case 58: {
                h.cB();
                break;
            }
            case 59: {
                h.cH();
                break;
            }
            case 60: {
                h.cN();
                break;
            }
            case 61: {
                h.cT();
                break;
            }
            case 62: {
                h.cZ();
                break;
            }
            case 63: {
                h.df();
                break;
            }
            case 64: {
                h.dl();
                break;
            }
            case 72: {
                h.dr();
                break;
            }
            case 73: {
                h.dx();
                break;
            }
            case 74: {
                h.dD();
            }
        }
    }

    static void hX(int n) {
        switch (h.q()) {
            case 1: {
                h.ac(n);
                break;
            }
            case 0: {
                h.an(n);
                break;
            }
            case 2: {
                h.ay(n);
                break;
            }
            case 3: {
                h.aJ(n);
                break;
            }
            case 4: {
                h.aU(n);
                break;
            }
            case 5: {
                h.bf(n);
                break;
            }
            case 6: {
                h.bq(n);
                break;
            }
            case 7: {
                h.bB(n);
                break;
            }
            case 10: {
                h.bM(n);
                break;
            }
            case 11: {
                h.bX(n);
                break;
            }
            case 12: {
                h.ci(n);
                break;
            }
            case 13: {
                h.ct(n);
                break;
            }
            case 17: {
                h.cE(n);
                break;
            }
            case 18: {
                h.cP(n);
                break;
            }
            case 24: {
                h.da(n);
                break;
            }
            case 25: {
                h.dl(n);
                break;
            }
            case 41: {
                h.dw(n);
                break;
            }
            case 42: {
                h.dH(n);
                break;
            }
            case 43: {
                h.dS(n);
                break;
            }
            case 44: {
                h.ed(n);
                break;
            }
            case 45: {
                h.eo(n);
                break;
            }
            case 46: {
                h.ez(n);
                break;
            }
            case 51: {
                h.eK(n);
                break;
            }
            case 52: {
                h.eV(n);
                break;
            }
            case 55: {
                h.fg(n);
                break;
            }
            case 56: {
                h.fr(n);
                break;
            }
            case 57: {
                h.fC(n);
                break;
            }
            case 58: {
                h.fN(n);
                break;
            }
            case 59: {
                h.fY(n);
                break;
            }
            case 60: {
                h.gj(n);
                break;
            }
            case 61: {
                h.gu(n);
                break;
            }
            case 62: {
                h.gF(n);
                break;
            }
            case 63: {
                h.gQ(n);
                break;
            }
            case 64: {
                h.hb(n);
                break;
            }
            case 72: {
                h.hm(n);
                break;
            }
            case 73: {
                h.hx(n);
                break;
            }
            case 74: {
                h.hI(n);
            }
        }
    }

    static void dH() {
        switch (h.q()) {
            case 1: {
                h.w();
                break;
            }
            case 0: {
                h.C();
                break;
            }
            case 2: {
                h.I();
                break;
            }
            case 3: {
                h.O();
                break;
            }
            case 4: {
                h.U();
                break;
            }
            case 5: {
                h.aa();
                break;
            }
            case 6: {
                h.ag();
                break;
            }
            case 7: {
                h.am();
                break;
            }
            case 10: {
                h.as();
                break;
            }
            case 11: {
                h.ay();
                break;
            }
            case 12: {
                h.aE();
                break;
            }
            case 13: {
                h.aK();
                break;
            }
            case 17: {
                h.aQ();
                break;
            }
            case 18: {
                h.aW();
                break;
            }
            case 24: {
                h.bc();
                break;
            }
            case 25: {
                h.bi();
                break;
            }
            case 41: {
                h.bo();
                break;
            }
            case 42: {
                h.bu();
                break;
            }
            case 43: {
                h.bA();
                break;
            }
            case 44: {
                h.bG();
                break;
            }
            case 45: {
                h.bM();
                break;
            }
            case 46: {
                h.bS();
                break;
            }
            case 51: {
                h.bY();
                break;
            }
            case 52: {
                h.ce();
                break;
            }
            case 55: {
                h.ck();
                break;
            }
            case 56: {
                h.cq();
                break;
            }
            case 57: {
                h.cw();
                break;
            }
            case 58: {
                h.cC();
                break;
            }
            case 59: {
                h.cI();
                break;
            }
            case 60: {
                h.cO();
                break;
            }
            case 61: {
                h.cU();
                break;
            }
            case 62: {
                h.da();
                break;
            }
            case 63: {
                h.dg();
                break;
            }
            case 64: {
                h.dm();
                break;
            }
            case 72: {
                h.ds();
                break;
            }
            case 73: {
                h.dy();
                break;
            }
            case 74: {
                h.dE();
            }
        }
    }

    static void dI() {
        h.aY(false);
        h.d(8, false);
        h.d(7, false);
        h.d(3, false);
        h.d(4, false);
        h.d(5, false);
        h.d(6, false);
        if (-1 != cW) {
            f f2 = h.vW(cW);
            h.dm(f2.c, cY);
            h.k(f2.c, 216, 129);
            h.dj(f2.c, cX);
            h.d(f2.c, true);
        }
        if (h.wb(4) && !h.wc(4)) {
            h.aZ(false);
            h.f(4, true);
        }
        if (h.wb(8) && !h.wc(8)) {
            h.aZ(false);
            h.f(8, true);
        }
        if (h.wb(9) && !h.wc(9)) {
            h.aZ(false);
            h.f(9, true);
        }
        if (h.wb(31) && !h.wc(31)) {
            h.aZ(false);
            h.f(31, false);
        }
        if (h.wb(38) && !h.wc(38)) {
            h.aZ(false);
            h.f(38, true);
        }
        if (h.wb(42) && !h.wc(42)) {
            h.aZ(false);
            h.f(42, true);
        }
        if (h.wb(43) && !h.wc(43)) {
            h.aZ(false);
            h.f(43, true);
        }
        if (h.wb(40) && !h.wc(40)) {
            h.aZ(false);
            h.f(40, true);
        }
        if (h.wb(58) && !h.wc(58)) {
            h.aZ(false);
            h.f(58, false);
        }
    }

    static void hY(int n) {
        h.q();
    }

    static void hZ(int n) {
    }

    static void ia(int n) {
    }

    static void ib(int n) {
    }

    static void ic(int n) {
    }

    static void id(int n) {
        h.q();
    }

    static void ie(int n) {
        h.q();
    }

    static void if(int n) {
        h.q();
    }

    static void ig(int n) {
        h.q();
        h.wl(4);
    }

    static void ih(int n) {
        h.q();
    }

    static void ii(int n) {
        h.q();
    }

    static void ij(int n) {
        h.q();
    }

    static void ik(int n) {
    }

    static void aR(int n, int n2) {
        h.q();
    }

    static void aS(int n, int n2) {
        h.q();
    }

    static void il(int n) {
        h.q();
    }

    static void N(boolean bl) {
        h.q();
    }

    static void dJ() {
        h.q();
    }

    static void im(int n) {
        h.q();
    }

    static void dK() {
        h.q();
    }

    static void dL() {
        h.dm(47, 16);
        h.d(47, false);
        h.dj(47, 4096);
    }

    static void dM() {
        if (!h.wc(8)) {
            bg = h.lS();
            if (bg != null) {
                bh = false;
                if (!h.dl(h.bg.c, 256)) {
                    h.f(8, true);
                } else {
                    h.dp(1, 2000);
                    h.dj(58, 2048);
                }
            } else {
                h.f(8, true);
                bg = h.vV(77);
            }
        }
    }

    static void dN() {
        h.dk(58, 2048);
        h.wd(9);
    }

    static void dO() {
        h.aZ(false);
        h.wg(13);
        h.wg(20);
        h.wg(21);
        h.wg(25);
        h.wg(26);
        h.dk(58, 2048);
        h.dj(29, 2048);
        h.dj(28, 2048);
    }

    static void in(int n) {
        if (bg != null) {
            if (h.lS() == bg) {
                if (h.l(58, h.bg.c, 35)) {
                    h.wq(h.bg.c);
                    h.dk(58, 2048);
                    if (!h.wa(0)) {
                        h.dq(0, 1000);
                    }
                }
            } else if (!h.l(0, h.bg.c, 100)) {
                if (!bh) {
                    h.wf(27);
                    bh = true;
                }
            } else {
                bh = false;
            }
        }
    }

    static void io(int n) {
    }

    static void ip(int n) {
    }

    static void iq(int n) {
    }

    static void ir(int n) {
        if (h.dl(n, 4)) {
            h.dk(n, 4);
            if (!h.dl(58, 2048)) {
                h.we(8);
            }
        }
    }

    static void is(int n) {
        if (h.dl(n, 256)) {
            h.dj(n, 4);
        }
    }

    static void it(int n) {
    }

    static void iu(int n) {
    }

    static void iv(int n) {
        if (n == 1) {
            h.wf(19);
        }
    }

    static void aT(int n, int n2) {
        if (0 == n) {
            switch (n2) {
                case 0: {
                    h.ba(true);
                    h.wf(20);
                    break;
                }
                case 1000: {
                    h.d(30, false);
                    h.lR();
                    h.k(0, h.bg.h, h.bg.i - 15);
                    break;
                }
                case 2000: {
                    h.m(0, 30, 15);
                    break;
                }
                case 3000: {
                    h.d(0, false);
                    break;
                }
                case 4000: {
                    h.d(0, true);
                    h.m(0, h.bg.c, 15);
                    break;
                }
                case 5000: {
                    h.e(0, true);
                    h.wf(21);
                    h.ba(false);
                    h.d(30, true);
                    h.dj(h.bg.c, 4);
                    h.vZ(0);
                }
            }
        }
    }

    static void aU(int n, int n2) {
    }

    static void iw(int n) {
        if (n == 47 || n == h.bg.c || n == 0) {
            h.dk(h.bg.c, 260);
            h.f(8, true);
        }
    }

    static void O(boolean bl) {
    }

    static void dP() {
    }

    static void ix(int n) {
    }

    static void dQ() {
    }

    static void dR() {
        h.dm(32, 9);
        h.d(32, false);
        h.dj(32, 12288);
        h.vV(33).q(3);
        h.vV(34).q(3);
        h.d(33, false);
        h.d(34, false);
        h.dm(35, 9);
        h.d(35, false);
        h.dj(35, 12288);
        h.vV(36).q(3);
        h.vV(37).q(3);
        h.vV(38).q(3);
        h.d(36, false);
        h.d(37, false);
        h.d(38, false);
        h.dm(41, 9);
        h.d(41, false);
        h.dj(41, 12288);
        h.vV(39).q(3);
        h.vV(40).q(3);
        h.d(39, false);
        h.d(40, false);
        h.dm(42, 9);
        h.d(42, false);
        h.dj(42, 12288);
        h.vV(43).q(3);
        h.vV(44).q(3);
        h.vV(45).q(3);
        h.d(43, false);
        h.d(44, false);
        h.d(45, false);
    }

    static void dS() {
        if (!h.wc(9)) {
            bi = 0;
            bk = false;
            bj = h.lS();
            if (bj != null) {
                if (!h.dl(h.bj.c, 256)) {
                    h.f(9, true);
                } else {
                    h.d(28, false);
                    h.d(29, false);
                    h.d(32, true);
                    h.d(41, true);
                    h.dj(32, 4);
                    h.dj(41, 4);
                    h.e(47, false);
                    h.dj(47, 4);
                    h.wf(22);
                }
            } else {
                h.f(9, true);
                bj = h.vV(77);
            }
        }
    }

    static void dT() {
        h.d(28, true);
        h.d(29, true);
        h.wd(10);
        h.wj(100);
        h.aY(true);
        h.d(32, false);
        h.d(35, false);
        h.d(41, false);
        h.d(42, false);
    }

    static void dU() {
        h.aZ(false);
        h.d(28, true);
        h.d(29, true);
        h.d(47, false);
        h.dk(32, 4);
        h.dk(41, 4);
        h.dk(47, 4);
        if (bj != null) {
            h.dk(h.bj.c, 4);
        }
        h.aY(true);
        h.wg(13);
        h.wg(20);
        h.wg(21);
        h.wg(25);
        h.wg(26);
        h.vY(-1);
        h.dj(29, 2048);
        h.dj(28, 2048);
        h.aX(true);
    }

    static void iy(int n) {
        if (bj != null && h.l(32, h.bj.c, 90) && h.bj.o == 0 && h.dl(32, 4)) {
            h.dk(32, 4);
            h.dq(0, 1000);
        }
        if (bj != null && h.l(35, h.bj.c, 90) && h.bj.o == 0 && h.dl(35, 4)) {
            h.dk(35, 4);
            h.dq(1, 1000);
        }
        if (bj != null && h.l(41, h.bj.c, 90) && h.bj.o == 0 && h.dl(41, 4)) {
            h.dk(41, 4);
            h.dq(2, 1000);
        }
        if (bj != null && h.l(42, h.bj.c, 90) && h.bj.o == 0 && h.dl(42, 4)) {
            h.dk(42, 4);
            h.dq(3, 1000);
        }
        if (bj != null && !h.l(0, h.bj.c, 180)) {
            if (!bk) {
                h.wf(27);
                bk = true;
            }
        } else {
            bk = false;
        }
    }

    static void iz(int n) {
    }

    static void iA(int n) {
    }

    static void iB(int n) {
    }

    static void iC(int n) {
        if (n == h.bj.c) {
            h.dk(n, 4);
        }
    }

    static void iD(int n) {
        if (n == h.bj.c) {
            h.dj(n, 4);
        }
    }

    static void iE(int n) {
    }

    static void iF(int n) {
    }

    static void iG(int n) {
    }

    static void aV(int n, int n2) {
        block0 : switch (n) {
            case 0: {
                switch (n2) {
                    case 0: {
                        h.wf(23);
                        h.k(47, h.bj.h, h.bj.i - 20);
                        h.lR();
                        h.aY(false);
                        h.d(47, true);
                        h.e(47, false);
                        break;
                    }
                    case 1000: {
                        h.d(33, true);
                        h.d(34, true);
                        h.m(47, 32, 15);
                        break;
                    }
                    case 2000: {
                        h.du(3, 30);
                        f f2 = h.lS();
                        if (f2 == null) {
                            h.dB(33, 0);
                            h.dB(34, 0);
                        } else {
                            h.dB(33, f2.c);
                            h.dB(34, f2.c);
                        }
                        h.d(47, false);
                        h.vY(10000);
                        break;
                    }
                    case 12000: {
                        h.d(47, true);
                        h.m(47, h.bj.c, 15);
                        h.aY(true);
                        h.vZ(0);
                        if (h.l(47, h.bj.c, 180)) break;
                        h.wf(28);
                        h.e(47, false);
                        h.dk(h.bj.c, 260);
                        h.f(9, true);
                    }
                }
                break;
            }
            case 1: {
                switch (n2) {
                    case 0: {
                        h.wf(23);
                        h.k(47, h.bj.h - 25, h.bj.i);
                        h.lR();
                        h.aY(false);
                        h.d(47, true);
                        break;
                    }
                    case 1000: {
                        h.d(36, true);
                        h.d(37, true);
                        h.d(38, true);
                        h.m(47, 35, 15);
                        break;
                    }
                    case 2000: {
                        h.d(47, false);
                        h.du(3, 50);
                        h.vY(10000);
                        break;
                    }
                    case 12000: {
                        h.d(47, true);
                        h.m(47, h.bj.c, 15);
                        h.vZ(1);
                        h.aY(true);
                        if (h.l(47, h.bj.c, 180)) break;
                        h.wf(28);
                        h.e(47, false);
                        h.dk(h.bj.c, 260);
                        h.f(9, true);
                    }
                }
                break;
            }
            case 2: {
                switch (n2) {
                    case 0: {
                        h.wf(23);
                        h.k(47, h.bj.h, h.bj.i - 20);
                        h.lR();
                        h.aY(false);
                        h.d(47, true);
                        break;
                    }
                    case 1000: {
                        h.d(39, true);
                        h.d(40, true);
                        h.m(47, 41, 15);
                        break;
                    }
                    case 2000: {
                        f f3 = h.lS();
                        if (f3 == null) {
                            h.dB(39, 0);
                            h.dB(40, 0);
                        } else {
                            h.dB(39, f3.c);
                            h.dB(40, f3.c);
                        }
                        h.d(47, false);
                        h.du(3, 50);
                        h.vY(10000);
                        break;
                    }
                    case 12000: {
                        h.d(47, true);
                        h.m(47, h.bj.c, 15);
                        h.vZ(2);
                        h.aY(true);
                        if (h.l(47, h.bj.c, 180)) break;
                        h.wf(28);
                        h.e(47, false);
                        h.dk(h.bj.c, 260);
                        h.f(9, true);
                    }
                }
                break;
            }
            case 3: {
                switch (n2) {
                    case 0: {
                        h.wf(23);
                        h.k(47, h.bj.h, h.bj.i - 20);
                        h.lR();
                        h.aY(false);
                        h.d(47, true);
                        break;
                    }
                    case 1000: {
                        h.d(43, true);
                        h.d(44, true);
                        h.d(45, true);
                        h.m(47, 42, 15);
                        break;
                    }
                    case 2000: {
                        h.d(47, false);
                        h.du(3, 50);
                        h.vY(10000);
                        break;
                    }
                    case 12000: {
                        h.d(47, true);
                        h.m(47, h.bj.c, 15);
                        h.vZ(3);
                        h.aY(true);
                        if (h.l(47, h.bj.c, 180)) break;
                        h.wf(28);
                        h.e(47, false);
                        h.dk(h.bj.c, 260);
                        h.f(9, true);
                    }
                }
                break;
            }
            case 4: {
                switch (n2) {
                    case 0: {
                        h.dk(32, 4096);
                        h.dk(35, 4096);
                        h.dk(41, 4096);
                        h.dk(42, 4096);
                        break block0;
                    }
                    case 1000: {
                        h.wf(25);
                        h.vY(10000);
                        break block0;
                    }
                    case 11000: {
                        h.ba(true);
                        h.dr(32, 0);
                        break block0;
                    }
                    case 12000: {
                        h.do(32, 1000);
                        break block0;
                    }
                    case 14000: {
                        h.dr(41, 0);
                        break block0;
                    }
                    case 15000: {
                        h.do(41, 1000);
                        break block0;
                    }
                    case 17000: {
                        h.wf(26);
                        h.dk(47, 4);
                        h.ba(false);
                        h.lP();
                        break block0;
                    }
                    case 18000: {
                        h.du(5, 30);
                        h.dj(29, 2048);
                        h.dj(28, 2048);
                        h.aZ(true);
                        h.dk(h.bj.c, 260);
                        h.we(9);
                        h.vZ(4);
                    }
                }
            }
        }
    }

    static void aW(int n, int n2) {
        if (n == 47 && n2 == h.bj.c) {
            h.d(47, false);
            h.e(47, false);
            if (++bi < 2) {
                h.wf(24);
            } else {
                h.dq(4, 1000);
            }
        }
    }

    static void iH(int n) {
        if (n == 47 || n == h.bj.c || n == 0) {
            h.dk(h.bj.c, 260);
            h.f(9, true);
        }
    }

    static void P(boolean bl) {
    }

    static void dV() {
    }

    static void iI(int n) {
    }

    static void dW() {
    }

    static void dX() {
        h.d(16, false);
        h.d(74, false);
    }

    static void dY() {
        if (!h.wc(14)) {
            bl = h.lS();
            if (null != bl) {
                if (h.dl(h.bl.c, 256)) {
                    h.a("Activated!!!!!!!!!!!!!!!!!!!!!");
                    h.dm(16, 16);
                    h.d(74, true);
                    h.dj(74, 2048);
                    h.dp(2, 2000);
                } else {
                    h.a("Failed!! Not Marked!");
                    h.dp(0, 1500);
                }
            } else {
                h.a("Failed!! No Car!");
                h.dp(0, 1500);
                bl = h.vV(1);
            }
        }
    }

    static void dZ() {
        h.dk(74, 2048);
        h.wd(15);
    }

    static void iJ(int n) {
        if (bl != null && h.l(h.bl.c, 74, 35) && h.dl(74, 2048)) {
            h.wq(h.bl.c);
            h.dk(74, 2048);
            if (!h.wa(0)) {
                h.dq(0, 1500);
            }
        }
    }

    static void iK(int n) {
    }

    static void iL(int n) {
    }

    static void iM(int n) {
    }

    static void iN(int n) {
        if (h.bl.c == n) {
            h.dk(h.bl.c, 4);
            h.dj(74, 2048);
        }
    }

    static void iO(int n) {
        if (h.bl.c == n) {
            h.dk(74, 2048);
            h.dj(h.bl.c, 4);
            h.wf(37);
        }
    }

    static boolean iP(int n) {
        return false;
    }

    static void iQ(int n) {
        if (1 == n) {
            h.ba(false);
            h.lP();
            h.d(16, false);
            h.we(14);
        }
        if (0 == n) {
            h.f(14, true);
            h.wf(38);
        }
        if (2 == n) {
            h.wf(33);
        }
    }

    static void aX(int n, int n2) {
        if (0 == n) {
            switch (n2) {
                case 0: {
                    h.ba(true);
                    h.a("cutscene start");
                    break;
                }
                case 1500: {
                    h.d(16, true);
                    h.dr(16, 150);
                    h.m(16, h.bl.c, 15);
                    h.vZ(0);
                }
            }
        }
    }

    static void aY(int n, int n2) {
        if (16 == n && h.bl.c == n2) {
            h.wf(41);
            h.dp(1, 500);
        }
    }

    static void iR(int n) {
    }

    static void iS(int n) {
        if (n == h.bl.c || n == 0) {
            h.f(14, true);
        }
    }

    static void ea() {
        h.aZ(false);
        if (bl != null) {
            h.dk(h.bl.c, 4);
        }
        h.dj(29, 2048);
        h.dj(28, 2048);
    }

    static void Q(boolean bl) {
    }

    static void eb() {
    }

    static void iT(int n) {
    }

    static void ec() {
    }

    static void ed() {
    }

    static void ee() {
        if (!h.wc(15)) {
            h.wf(34);
            h.dp(0, 1500);
            bm = h.lS();
            if (null == bm) {
                h.f(15, true);
            }
            h.aX(false);
        }
    }

    static void ef() {
        h.wd(16);
        h.aX(true);
    }

    static void iU(int n) {
    }

    static void iV(int n) {
    }

    static void iW(int n) {
    }

    static void iX(int n) {
    }

    static void iY(int n) {
    }

    static void iZ(int n) {
    }

    static void ja(int n) {
    }

    static void jb(int n) {
    }

    static void jc(int n) {
        if (0 == n) {
            h.du(5, 50);
            h.wh(30000);
        }
    }

    static void aZ(int n, int n2) {
    }

    static void ba(int n, int n2) {
    }

    static void jd(int n) {
        if (n == h.bm.c || n == 0) {
            h.f(15, true);
        }
    }

    static void R(boolean bl) {
        if (bl) {
            h.wj(50);
            h.wf(42);
            h.du(5, -100);
            h.dw(h.bm.c, -1);
            h.we(15);
        } else {
            h.wi(16);
            h.f(15, true);
        }
    }

    static void eg() {
        h.aZ(false);
        h.aX(true);
        if (bm != null) {
            h.dk(h.bm.c, 4);
        }
        h.dj(29, 2048);
        h.dj(28, 2048);
    }

    static void eh() {
    }

    static void je(int n) {
    }

    static void ei() {
    }

    static void ej() {
    }

    static void ek() {
        if (!h.wc(16)) {
            bn = h.lS();
            if (null != bn) {
                if (h.dl(h.bn.c, 256)) {
                    h.wf(35);
                    h.d(28, true);
                    h.d(29, true);
                    h.dj(29, 2048);
                    h.dj(28, 2048);
                } else {
                    h.f(16, true);
                }
            } else {
                h.f(16, true);
                bn = h.vV(1);
            }
        }
    }

    static void el() {
        h.dk(29, 2048);
        h.dk(28, 2048);
        h.wn(2);
    }

    static void em() {
        h.aZ(false);
        if (bn != null) {
            h.dk(h.bn.c, 4);
        }
        h.d(28, true);
        h.d(29, true);
        h.dj(29, 2048);
        h.dj(28, 2048);
    }

    static void jf(int n) {
    }

    static void jg(int n) {
    }

    static void jh(int n) {
    }

    static void ji(int n) {
    }

    static void jj(int n) {
        if (h.bn.c == n) {
            h.d(28, true);
            h.dj(28, 2048);
            h.d(29, true);
            h.dj(29, 2048);
            h.dk(n, 4);
        }
    }

    static void jk(int n) {
        if (h.bn.c == n) {
            h.d(28, false);
            h.dk(28, 2048);
            h.d(29, false);
            h.dk(29, 2048);
            h.dj(n, 4);
        }
    }

    static void jl(int n) {
    }

    static void jm(int n) {
    }

    static void jn(int n) {
    }

    static void bb(int n, int n2) {
    }

    static void bc(int n, int n2) {
    }

    static void jo(int n) {
        if (n == h.bn.c || n == 0) {
            h.f(16, true);
        }
    }

    static void S(boolean bl) {
    }

    static void en() {
    }

    static void jp(int n) {
    }

    static void eo() {
    }

    static void ep() {
        h.d(49, false);
        h.dj(49, 4096);
        h.dm(49, 13);
    }

    static void eq() {
        if (!h.wc(19)) {
            h.dk(49, 256);
            h.d(49, true);
            h.bb(true);
            h.vX(3);
            h.dp(3, 3000);
        }
    }

    static void er() {
        h.dk(49, 268);
        h.wd(20);
    }

    static void es() {
        h.dk(49, 268);
        h.aZ(false);
    }

    static void jq(int n) {
        if (!h.l(h.vV((int)0).c, 49, 200) && h.dl(49, 256)) {
            h.d(49, false);
            h.we(19);
        }
    }

    static void jr(int n) {
    }

    static void js(int n) {
    }

    static void jt(int n) {
        if (n == 49) {
            h.wf(45);
            h.dj(49, 256);
            h.dk(49, 12);
            h.wf(46);
        }
    }

    static void ju(int n) {
    }

    static void jv(int n) {
    }

    static void jw(int n) {
    }

    static void jx(int n) {
    }

    static void jy(int n) {
        if (n == 3) {
            h.dj(49, 12);
            h.wf(44);
            h.bb(false);
        }
    }

    static void bd(int n, int n2) {
    }

    static void be(int n, int n2) {
    }

    static void jz(int n) {
    }

    static void T(boolean bl) {
    }

    static void et() {
    }

    static void jA(int n) {
    }

    static void eu() {
    }

    static void ev() {
    }

    static void ew() {
        if (!h.wc(20)) {
            h.k(49, 2764, 2041);
            h.d(49, true);
            h.dj(49, 4108);
            h.wf(46);
        }
        h.wn(6);
    }

    static void ex() {
        h.wd(21);
        h.dk(49, 12);
    }

    static void ey() {
    }

    static void jB(int n) {
    }

    static void jC(int n) {
    }

    static void jD(int n) {
    }

    static void jE(int n) {
        if (n == 49) {
            h.wf(47);
            h.wn(5);
            h.dz(5, 35);
            h.we(20);
        }
    }

    static void jF(int n) {
    }

    static void jG(int n) {
    }

    static void jH(int n) {
    }

    static void jI(int n) {
    }

    static void jJ(int n) {
        if (n == 1) {
            h.f(20, true);
        }
    }

    static void bf(int n, int n2) {
    }

    static void bg(int n, int n2) {
    }

    static void jK(int n) {
        if (n == 0) {
            h.aZ(false);
            h.dp(1, 3000);
        }
    }

    static void U(boolean bl) {
    }

    static void ez() {
    }

    static void jL(int n) {
    }

    static void eA() {
    }

    static void eB() {
        h.dm(51, 6);
        h.dm(52, 6);
        h.dm(53, 9);
        h.d(51, false);
        h.d(52, false);
        h.d(53, false);
        h.vV(59).q(0);
        h.vV(60).q(0);
        h.vV(61).q(0);
        h.d(59, false);
        h.d(60, false);
        h.d(61, false);
    }

    static void eC() {
        if (!h.wc(21)) {
            h.d(51, true);
            h.d(52, true);
            h.dn(51, 270);
            h.d(59, true);
            h.d(60, true);
            h.d(61, true);
            h.dj(54, 2048);
            h.wf(49);
            h.n(33, 721, 2230);
            h.n(34, 771, 2229);
            h.vV(33).q(3);
            h.vV(34).q(3);
            h.n(40, 465, 1911);
            h.n(39, 760, 1803);
            h.vV(40).q(3);
            h.vV(39).q(3);
            h.n(43, 808, 1765);
            h.n(45, 774, 2068);
            h.n(44, 706, 2037);
            h.vV(43).q(3);
            h.vV(45).q(3);
            h.vV(44).q(3);
            h.n(36, 714, 2101);
            h.n(37, 528, 1911);
            h.n(38, 808, 1857);
            h.vV(36).q(3);
            h.vV(37).q(3);
            h.vV(38).q(3);
        }
    }

    static void eD() {
        h.dk(53, 4100);
        h.wd(22);
        h.aY(true);
    }

    static void eE() {
        h.dk(54, 2048);
        h.dk(53, 4100);
        if (!h.dl(0, 2)) {
            h.c(3, h.vV((int)89).h, h.vV((int)89).i, 3000);
        }
    }

    static void jM(int n) {
        if (h.dl(54, 2048)) {
            f f2 = h.lS();
            if (f2 != null) {
                if (h.l(f2.c, 54, 400)) {
                    if (h.l(f2.c, 54, 35)) {
                        h.wq(f2.c);
                        h.lR();
                        h.dk(54, 2048);
                        h.d(53, true);
                        h.dj(53, 4100);
                        h.wf(48);
                        h.du(3, 50);
                        h.dA(59, 5);
                        h.dA(60, 5);
                        h.dA(61, 5);
                        h.dC(59, 0);
                        h.dC(60, 59);
                        h.dC(61, 60);
                    }
                    h.aY(false);
                } else {
                    h.aY(true);
                }
            } else if (h.l(h.vV((int)0).c, 54, 400)) {
                if (h.l(h.vV((int)0).c, 54, 35)) {
                    h.dk(54, 2048);
                    h.d(53, true);
                    h.dj(53, 4100);
                    h.wf(48);
                    h.du(3, 50);
                    h.dA(59, 5);
                    h.dA(60, 5);
                    h.dA(61, 5);
                    h.dC(59, 0);
                    h.dC(60, 59);
                    h.dC(61, 60);
                }
                h.aY(false);
            } else {
                h.aY(true);
            }
        }
        if (h.dl(59, 2)) {
            h.dC(60, 0);
            h.dC(61, 60);
        }
        if (h.dl(59, 2) && h.dl(60, 2)) {
            h.dC(61, 0);
        }
        if (h.dl(60, 2) && !h.dl(59, 2)) {
            h.dC(59, 0);
            h.dC(61, 59);
        }
    }

    static void jN(int n) {
    }

    static void jO(int n) {
    }

    static void jP(int n) {
    }

    static void jQ(int n) {
        if (n == 53) {
            h.dj(53, 256);
            h.wp(61);
            h.wp(60);
            h.wp(59);
            h.we(21);
        }
    }

    static void jR(int n) {
    }

    static void jS(int n) {
    }

    static void jT(int n) {
    }

    static void jU(int n) {
    }

    static void bh(int n, int n2) {
    }

    static void bi(int n, int n2) {
    }

    static void jV(int n) {
        if (n == 53 || n == 0) {
            h.aZ(false);
            h.f(21, true);
        }
    }

    static void V(boolean bl) {
    }

    static void eF() {
    }

    static void jW(int n) {
    }

    static void eG() {
    }

    static void eH() {
    }

    static void eI() {
        if (!h.wc(22)) {
            bo = h.lS();
            if (bo != null) {
                if (!h.dl(h.bo.c, 256)) {
                    h.f(22, true);
                } else {
                    h.wf(50);
                    h.dj(89, 2048);
                }
            } else {
                bo = h.vV(53);
                h.f(22, true);
            }
        }
    }

    static void eJ() {
        h.wj(200);
        if (bo != null) {
            h.dk(h.bo.c, 256);
        }
        h.wd(23);
    }

    static void eK() {
        h.aZ(false);
        if (bo != null) {
            h.dk(h.bo.c, 260);
        }
        if (!h.dl(0, 2)) {
            h.c(3, h.vV((int)89).h, h.vV((int)89).i, 3000);
        }
    }

    static void jX(int n) {
        if (bo != null && h.l(89, h.bo.c, 35)) {
            h.dk(89, 2048);
            h.wq(h.bo.c);
            h.wf(51);
            h.aZ(true);
            h.we(22);
        }
    }

    static void jY(int n) {
    }

    static void jZ(int n) {
    }

    static void ka(int n) {
    }

    static void kb(int n) {
        if (n == h.bo.c) {
            h.dk(n, 4);
            h.dj(89, 2048);
        }
    }

    static void kc(int n) {
        if (n == h.bo.c) {
            h.dj(n, 4);
            h.dk(89, 2048);
        }
    }

    static void kd(int n) {
    }

    static void ke(int n) {
    }

    static void kf(int n) {
    }

    static void bj(int n, int n2) {
    }

    static void bk(int n, int n2) {
    }

    static void kg(int n) {
        if (n == h.bo.c || n == 0) {
            h.f(22, true);
        }
    }

    static void W(boolean bl) {
    }

    static void eL() {
    }

    static void kh(int n) {
    }

    static void eM() {
    }

    static void eN() {
    }

    static void eO() {
        if (!h.wc(23)) {
            h.a("_OnActivated q5_0!!!!!!!!!!!!!!!!!!!");
            h.wf(52);
            h.d(28, true);
            h.d(29, true);
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
    }

    static void eP() {
        h.dk(29, 2048);
        h.dk(28, 2048);
    }

    static void ki(int n) {
    }

    static void kj(int n) {
    }

    static void kk(int n) {
    }

    static void kl(int n) {
    }

    static void km(int n) {
    }

    static void kn(int n) {
    }

    static void ko(int n) {
    }

    static void kp(int n) {
    }

    static void kq(int n) {
    }

    static void bl(int n, int n2) {
    }

    static void bm(int n, int n2) {
    }

    static void kr(int n) {
    }

    static void X(boolean bl) {
    }

    static void eQ() {
    }

    static void eR() {
    }

    static void ks(int n) {
    }

    static void eS() {
    }

    static void eT() {
        h.d(77, false);
        h.d(87, false);
        h.d(86, false);
        h.dm(77, 9);
        h.dm(87, 9);
        h.dm(86, 9);
    }

    static void eU() {
        if (!h.wc(30)) {
            bp = h.lS();
            if (null == bp) {
                bp = h.vV(87);
                h.f(30, true);
            } else if (h.dl(h.bp.c, 256)) {
                h.d(77, true);
                h.dn(77, 90);
                h.dj(77, 4356);
                h.du(3, 50);
                h.dp(0, 1500);
                h.dn(h.bp.c, 90);
                h.dj(h.bp.c, 65536);
            } else {
                h.f(30, true);
            }
        }
    }

    static void eV() {
        h.wd(31);
        h.dk(77, 4100);
    }

    static void eW() {
        h.aZ(false);
        h.dk(77, 4356);
        h.d(77, false);
        h.aY(true);
        h.dj(29, 2048);
        h.dj(28, 2048);
        if (bp != null) {
            h.dk(h.bp.c, 256);
        }
    }

    static void kt(int n) {
        if (h.l(77, 75, 35)) {
            h.dq(1, 1000);
        }
        if (h.dl(77, 256) && !h.l(77, 0, 600)) {
            h.dk(77, 256);
            h.wf(66);
            h.dp(1, 2000);
        }
    }

    static void ku(int n) {
    }

    static void kv(int n) {
    }

    static void kw(int n) {
    }

    static void kx(int n) {
    }

    static void ky(int n) {
    }

    static void kz(int n) {
    }

    static void kA(int n) {
    }

    static void kB(int n) {
        if (0 == n) {
            h.aY(false);
            h.dD(77, 0xA00000);
            h.wf(59);
        }
        if (n == 1) {
            h.wf(67);
            h.f(30, true);
        }
    }

    static void bn(int n, int n2) {
        block0 : switch (n) {
            case 1: {
                switch (n2) {
                    case 0: {
                        h.dk(77, 256);
                        h.ba(true);
                        h.wq(h.bp.c);
                        h.dk(h.bp.c, 256);
                        h.dr(88, 0);
                        break block0;
                    }
                    case 1000: {
                        h.d(87, true);
                        h.d(86, true);
                        h.dj(87, 8192);
                        h.dj(86, 8192);
                        h.dD(87, 0x780000);
                        h.dD(86, 0x780000);
                        h.do(87, 500);
                        h.do(86, 500);
                        break block0;
                    }
                    case 4000: {
                        h.lP();
                        h.wf(68);
                        break block0;
                    }
                    case 5000: {
                        h.lR();
                        h.dy(6, 4);
                        h.wo(6);
                        h.ba(false);
                        h.we(30);
                        h.vZ(1);
                    }
                }
            }
        }
    }

    static void bo(int n, int n2) {
    }

    static void kC(int n) {
        if (n == 0 || n == h.bp.c) {
            h.dp(1, 2000);
        }
    }

    static void Y(boolean bl) {
    }

    static void eX() {
    }

    static void kD(int n) {
    }

    static void eY() {
    }

    static void eZ() {
        h.d(76, false);
    }

    static void fa() {
        if (!h.wc(31)) {
            h.d(76, true);
            h.dj(76, 4);
            h.vV(76).q(3);
            h.n(33, 457, 1351);
            h.n(34, 529, 1356);
            h.vV(33).q(3);
            h.vV(34).q(3);
            h.dA(33, 4);
            h.dA(34, 4);
            h.dB(33, 0);
            h.dB(34, 0);
            h.n(43, 576, 1449);
            h.n(45, 483, 1491);
            h.n(44, 601, 1516);
            h.vV(43).q(3);
            h.vV(45).q(3);
            h.vV(44).q(3);
            h.dA(43, 4);
            h.dA(45, 4);
            h.dA(44, 4);
            h.n(36, 763, 1503);
            h.n(37, 868, 1525);
            h.n(38, 844, 1572);
            h.vV(36).q(3);
            h.vV(37).q(3);
            h.vV(38).q(3);
            h.dA(36, 4);
            h.dA(37, 4);
            h.dA(38, 4);
            h.aY(false);
            h.wf(60);
            h.du(3, 50);
        }
    }

    static void fb() {
        h.dk(76, 4);
        h.aY(true);
        h.wj(250);
        h.wd(32);
        h.dv(3, 0);
        h.wn(1);
    }

    static void fc() {
        h.aZ(false);
        h.dk(77, 4356);
        h.aY(true);
    }

    static void kE(int n) {
    }

    static void kF(int n) {
    }

    static void kG(int n) {
    }

    static void kH(int n) {
    }

    static void kI(int n) {
    }

    static void kJ(int n) {
    }

    static void kK(int n) {
    }

    static void kL(int n) {
    }

    static void kM(int n) {
    }

    static void bp(int n, int n2) {
    }

    static void bq(int n, int n2) {
    }

    static void kN(int n) {
        if (n == 76) {
            h.we(31);
            h.aZ(true);
        }
        if (n == 0) {
            h.f(31, true);
        }
    }

    static void Z(boolean bl) {
    }

    static void fd() {
    }

    static void kO(int n) {
    }

    static void fe() {
    }

    static void ff() {
    }

    static void fg() {
        if (!h.wc(32)) {
            h.wf(69);
            h.d(28, true);
            h.d(29, true);
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
    }

    static void fh() {
        h.dk(29, 2048);
        h.dk(28, 2048);
    }

    static void kP(int n) {
    }

    static void kQ(int n) {
    }

    static void kR(int n) {
    }

    static void kS(int n) {
    }

    static void kT(int n) {
    }

    static void kU(int n) {
    }

    static void kV(int n) {
    }

    static void kW(int n) {
    }

    static void kX(int n) {
    }

    static void br(int n, int n2) {
    }

    static void bs(int n, int n2) {
    }

    static void kY(int n) {
    }

    static void aa(boolean bl) {
    }

    static void fi() {
    }

    static void fj() {
    }

    static void kZ(int n) {
    }

    static void fk() {
    }

    static void fl() {
        if (h.wb(0) && !h.wc(0)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
            h.be(false);
            h.bd(false);
            h.bc(false);
            h.aX(false);
        }
        if (h.wb(1) && !h.wc(1)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(2) && !h.wc(2)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(3) && !h.wc(3)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(4) && !h.wc(4)) {
            h.aZ(false);
            h.f(4, true);
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(6) && !h.wc(6)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(7) && !h.wc(7)) {
            h.we(7);
            h.wd(8);
        }
        if (!h.wb(8) || !h.wc(8)) {
            // empty if block
        }
        if (!h.wb(9) || !h.wc(9)) {
            // empty if block
        }
        if (h.wb(10) && !h.wc(10)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(11) && !h.wc(11)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(12) && !h.wc(12)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(13) && !h.wc(13)) {
            h.we(13);
            h.wd(14);
        }
        if (!h.wb(14) || !h.wc(14)) {
            // empty if block
        }
        if (!h.wb(15) || !h.wc(15)) {
            // empty if block
        }
        if (h.wb(16) && !h.wc(16)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(17) && !h.wc(17)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(18) && !h.wc(18)) {
            h.we(18);
            h.wd(19);
        }
        if (!h.wb(19) || !h.wc(19)) {
            // empty if block
        }
        if (!h.wb(20) || !h.wc(20)) {
            // empty if block
        }
        if (!h.wb(21) || !h.wc(21)) {
            // empty if block
        }
        if (!h.wb(22) || !h.wc(22)) {
            // empty if block
        }
        if (h.wb(23) && !h.wc(23)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(24) && !h.wc(24)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(25) && !h.wc(25)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(26) && !h.wc(26)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(27) && !h.wc(27)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(28) && !h.wc(28)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(29) && !h.wc(29)) {
            h.we(29);
            h.wd(30);
        }
        if (!h.wb(30) || !h.wc(30)) {
            // empty if block
        }
        if (!h.wb(31) || !h.wc(31)) {
            // empty if block
        }
        if (!h.wb(32) || !h.wc(32)) {
            // empty if block
        }
        if (h.wb(33) && !h.wc(33)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(35) && !h.wc(35)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(36) && !h.wc(36)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(37) && !h.wc(37)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(38) && !h.wc(38)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(39) && !h.wc(39)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(40) && !h.wc(40)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(41) && !h.wc(41)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(42) && !h.wc(42)) {
            h.aZ(false);
            h.f(42, true);
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(43) && !h.wc(43)) {
            h.aZ(false);
            h.f(43, true);
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(44) && !h.wc(44)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (!h.wb(46) || !h.wc(46)) {
            // empty if block
        }
        if (!h.wb(47) || !h.wc(47)) {
            // empty if block
        }
        if (!h.wb(48) || !h.wc(48)) {
            // empty if block
        }
        if (!h.wb(49) || !h.wc(49)) {
            // empty if block
        }
        if (h.wb(50) && !h.wc(50)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(51) && !h.wc(51)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (!h.wb(52) || !h.wc(52)) {
            // empty if block
        }
        if (!h.wb(53) || !h.wc(53)) {
            // empty if block
        }
        if (h.wb(54) && !h.wc(54)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (!h.wb(55) || !h.wc(55)) {
            // empty if block
        }
        if (h.wb(56) && !h.wc(56)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(58) && !h.wc(58)) {
            h.aZ(false);
            h.f(58, false);
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(60) && !h.wc(60)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(61) && !h.wc(61)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(62) && !h.wc(62)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(63) && !h.wc(63)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (!h.wb(64) || !h.wc(64)) {
            // empty if block
        }
        if (!h.wb(65) || !h.wc(65)) {
            // empty if block
        }
        if (!h.wb(66) || !h.wc(66)) {
            // empty if block
        }
        if (!h.wb(67) || !h.wc(67)) {
            // empty if block
        }
        if (!h.wb(68) || !h.wc(68)) {
            // empty if block
        }
        if (!h.wb(69) || !h.wc(69)) {
            // empty if block
        }
        if (!h.wb(70) || !h.wc(70)) {
            // empty if block
        }
        if (h.wb(71) && !h.wc(71)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(72) && !h.wc(72)) {
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(73) && !h.wc(72)) {
            h.aZ(false);
            h.f(73, false);
            h.dj(29, 2048);
            h.dj(28, 2048);
        }
        if (!h.wb(74) || !h.wc(74)) {
            // empty if block
        }
        if (!h.wb(75) || !h.wc(75)) {
            // empty if block
        }
        if (!h.wb(78) || !h.wc(78)) {
            // empty if block
        }
        if (!h.wb(79) || !h.wc(79)) {
            // empty if block
        }
        if (!h.wb(81) || !h.wc(81)) {
            // empty if block
        }
        if (!h.wb(84) || !h.wc(84)) {
            // empty if block
        }
    }

    static void la(int n) {
        switch (h.q()) {
            case 8: {
                h.in(n);
                break;
            }
            case 9: {
                h.iy(n);
                break;
            }
            case 14: {
                h.iJ(n);
                break;
            }
            case 15: {
                h.iU(n);
                break;
            }
            case 16: {
                h.jf(n);
                break;
            }
            case 19: {
                h.jq(n);
                break;
            }
            case 20: {
                h.jB(n);
                break;
            }
            case 21: {
                h.jM(n);
                break;
            }
            case 22: {
                h.jX(n);
                break;
            }
            case 23: {
                h.ki(n);
                break;
            }
            case 30: {
                h.kt(n);
                break;
            }
            case 31: {
                h.kE(n);
                break;
            }
            case 32: {
                h.kP(n);
            }
        }
    }

    static void lb(int n) {
        switch (n) {
            case 8: {
                h.dL();
                break;
            }
            case 9: {
                h.dR();
                break;
            }
            case 14: {
                h.dX();
                break;
            }
            case 15: {
                h.ed();
                break;
            }
            case 16: {
                h.ej();
                break;
            }
            case 19: {
                h.ep();
                break;
            }
            case 20: {
                h.ev();
                break;
            }
            case 21: {
                h.eB();
                break;
            }
            case 22: {
                h.eH();
                break;
            }
            case 23: {
                h.eN();
                break;
            }
            case 30: {
                h.eT();
                break;
            }
            case 31: {
                h.eZ();
                break;
            }
            case 32: {
                h.ff();
            }
        }
    }

    static void lc(int n) {
        switch (n) {
            case 8: {
                h.dM();
                break;
            }
            case 9: {
                h.dS();
                break;
            }
            case 14: {
                h.dY();
                break;
            }
            case 15: {
                h.ee();
                break;
            }
            case 16: {
                h.ek();
                break;
            }
            case 19: {
                h.eq();
                break;
            }
            case 20: {
                h.ew();
                break;
            }
            case 21: {
                h.eC();
                break;
            }
            case 22: {
                h.eI();
                break;
            }
            case 23: {
                h.eO();
                break;
            }
            case 30: {
                h.eU();
                break;
            }
            case 31: {
                h.fa();
                break;
            }
            case 32: {
                h.fg();
            }
        }
    }

    static void ld(int n) {
        switch (n) {
            case 8: {
                h.dN();
                break;
            }
            case 9: {
                h.dT();
                break;
            }
            case 14: {
                h.dZ();
                break;
            }
            case 15: {
                h.ef();
                break;
            }
            case 16: {
                h.el();
                break;
            }
            case 19: {
                h.er();
                break;
            }
            case 20: {
                h.ex();
                break;
            }
            case 21: {
                h.eD();
                break;
            }
            case 22: {
                h.eJ();
                break;
            }
            case 23: {
                h.eP();
                break;
            }
            case 30: {
                h.eV();
                break;
            }
            case 31: {
                h.fb();
                break;
            }
            case 32: {
                h.fh();
            }
        }
    }

    static void le(int n) {
        switch (n) {
            case 8: {
                h.dO();
                break;
            }
            case 9: {
                h.dU();
                break;
            }
            case 14: {
                h.ea();
                break;
            }
            case 15: {
                h.eg();
                break;
            }
            case 16: {
                h.em();
                break;
            }
            case 19: {
                h.es();
                break;
            }
            case 20: {
                h.ey();
                break;
            }
            case 21: {
                h.eE();
                break;
            }
            case 22: {
                h.eK();
                break;
            }
            case 23: {
                h.eQ();
                break;
            }
            case 30: {
                h.eW();
                break;
            }
            case 31: {
                h.fc();
                break;
            }
            case 32: {
                h.fi();
            }
        }
    }

    static void lf(int n) {
        switch (h.q()) {
            case 8: {
                h.io(n);
                break;
            }
            case 9: {
                h.iz(n);
                break;
            }
            case 14: {
                h.iK(n);
                break;
            }
            case 15: {
                h.iV(n);
                break;
            }
            case 16: {
                h.jg(n);
                break;
            }
            case 19: {
                h.jr(n);
                break;
            }
            case 20: {
                h.jC(n);
                break;
            }
            case 21: {
                h.jN(n);
                break;
            }
            case 22: {
                h.jY(n);
                break;
            }
            case 23: {
                h.kj(n);
                break;
            }
            case 30: {
                h.ku(n);
                break;
            }
            case 31: {
                h.kF(n);
                break;
            }
            case 32: {
                h.kQ(n);
            }
        }
    }

    static void lg(int n) {
        switch (h.q()) {
            case 8: {
                h.ip(n);
                break;
            }
            case 9: {
                h.iA(n);
                break;
            }
            case 14: {
                h.iL(n);
                break;
            }
            case 15: {
                h.iW(n);
                break;
            }
            case 16: {
                h.jh(n);
                break;
            }
            case 19: {
                h.js(n);
                break;
            }
            case 20: {
                h.jD(n);
                break;
            }
            case 21: {
                h.jO(n);
                break;
            }
            case 22: {
                h.jZ(n);
                break;
            }
            case 23: {
                h.kk(n);
                break;
            }
            case 30: {
                h.kv(n);
                break;
            }
            case 31: {
                h.kG(n);
                break;
            }
            case 32: {
                h.kR(n);
            }
        }
    }

    static void lh(int n) {
        switch (h.q()) {
            case 8: {
                h.iq(n);
                break;
            }
            case 9: {
                h.iB(n);
                break;
            }
            case 14: {
                h.iM(n);
                break;
            }
            case 15: {
                h.iX(n);
                break;
            }
            case 16: {
                h.ji(n);
                break;
            }
            case 19: {
                h.jt(n);
                break;
            }
            case 20: {
                h.jE(n);
                break;
            }
            case 21: {
                h.jP(n);
                break;
            }
            case 22: {
                h.ka(n);
                break;
            }
            case 23: {
                h.kl(n);
                break;
            }
            case 30: {
                h.kw(n);
                break;
            }
            case 31: {
                h.kH(n);
                break;
            }
            case 32: {
                h.kS(n);
            }
        }
    }

    static void li(int n) {
        switch (h.q()) {
            case 8: {
                h.ir(n);
                break;
            }
            case 9: {
                h.iC(n);
                break;
            }
            case 14: {
                h.iN(n);
                break;
            }
            case 15: {
                h.iY(n);
                break;
            }
            case 16: {
                h.jj(n);
                break;
            }
            case 19: {
                h.ju(n);
                break;
            }
            case 20: {
                h.jF(n);
                break;
            }
            case 21: {
                h.jQ(n);
                break;
            }
            case 22: {
                h.kb(n);
                break;
            }
            case 23: {
                h.km(n);
                break;
            }
            case 30: {
                h.kx(n);
                break;
            }
            case 31: {
                h.kI(n);
                break;
            }
            case 32: {
                h.kT(n);
            }
        }
        h.be(true);
    }

    static void lj(int n) {
        switch (h.q()) {
            case 8: {
                h.is(n);
                break;
            }
            case 9: {
                h.iD(n);
                break;
            }
            case 14: {
                h.iO(n);
                break;
            }
            case 15: {
                h.iZ(n);
                break;
            }
            case 16: {
                h.jk(n);
                break;
            }
            case 19: {
                h.jv(n);
                break;
            }
            case 20: {
                h.jG(n);
                break;
            }
            case 21: {
                h.jR(n);
                break;
            }
            case 22: {
                h.kc(n);
                break;
            }
            case 23: {
                h.kn(n);
                break;
            }
            case 30: {
                h.ky(n);
                break;
            }
            case 31: {
                h.kJ(n);
                break;
            }
            case 32: {
                h.kU(n);
            }
        }
        h.be(false);
    }

    static void lk(int n) {
        switch (h.q()) {
            case 8: {
                h.it(n);
                break;
            }
            case 9: {
                h.iE(n);
                break;
            }
            case 14: {
                h.iP(n);
                break;
            }
            case 15: {
                h.ja(n);
                break;
            }
            case 16: {
                h.jl(n);
                break;
            }
            case 19: {
                h.jw(n);
                break;
            }
            case 20: {
                h.jH(n);
                break;
            }
            case 21: {
                h.jS(n);
                break;
            }
            case 22: {
                h.kd(n);
                break;
            }
            case 23: {
                h.ko(n);
                break;
            }
            case 30: {
                h.kz(n);
                break;
            }
            case 31: {
                h.kK(n);
                break;
            }
            case 32: {
                h.kV(n);
            }
        }
    }

    static void ll(int n) {
        switch (h.q()) {
            case 8: {
                h.iu(n);
                break;
            }
            case 9: {
                h.iF(n);
                break;
            }
            case 14: {
                h.iR(n);
                break;
            }
            case 15: {
                h.jb(n);
                break;
            }
            case 16: {
                h.jm(n);
                break;
            }
            case 19: {
                h.jx(n);
                break;
            }
            case 20: {
                h.jI(n);
                break;
            }
            case 21: {
                h.jT(n);
                break;
            }
            case 22: {
                h.ke(n);
                break;
            }
            case 23: {
                h.kp(n);
                break;
            }
            case 30: {
                h.kA(n);
                break;
            }
            case 31: {
                h.kL(n);
                break;
            }
            case 32: {
                h.kW(n);
            }
        }
    }

    static void lm(int n) {
        switch (h.q()) {
            case 8: {
                h.iv(n);
                break;
            }
            case 9: {
                h.iG(n);
                break;
            }
            case 14: {
                h.iQ(n);
                break;
            }
            case 15: {
                h.jc(n);
                break;
            }
            case 16: {
                h.jn(n);
                break;
            }
            case 19: {
                h.jy(n);
                break;
            }
            case 20: {
                h.jJ(n);
                break;
            }
            case 21: {
                h.jU(n);
                break;
            }
            case 22: {
                h.kf(n);
                break;
            }
            case 23: {
                h.kq(n);
                break;
            }
            case 30: {
                h.kB(n);
                break;
            }
            case 31: {
                h.kM(n);
                break;
            }
            case 32: {
                h.kX(n);
            }
        }
    }

    static void bt(int n, int n2) {
        switch (h.q()) {
            case 8: {
                h.aT(n, n2);
                break;
            }
            case 9: {
                h.aV(n, n2);
                break;
            }
            case 14: {
                h.aX(n, n2);
                break;
            }
            case 15: {
                h.aZ(n, n2);
                break;
            }
            case 16: {
                h.bb(n, n2);
                break;
            }
            case 19: {
                h.bd(n, n2);
                break;
            }
            case 20: {
                h.bf(n, n2);
                break;
            }
            case 21: {
                h.bh(n, n2);
                break;
            }
            case 22: {
                h.bj(n, n2);
                break;
            }
            case 23: {
                h.bl(n, n2);
                break;
            }
            case 30: {
                h.bn(n, n2);
                break;
            }
            case 31: {
                h.bp(n, n2);
                break;
            }
            case 32: {
                h.br(n, n2);
            }
        }
    }

    static void bu(int n, int n2) {
        switch (h.q()) {
            case 8: {
                h.aU(n, n2);
                break;
            }
            case 9: {
                h.aW(n, n2);
                break;
            }
            case 14: {
                h.aY(n, n2);
                break;
            }
            case 15: {
                h.ba(n, n2);
                break;
            }
            case 16: {
                h.bc(n, n2);
                break;
            }
            case 19: {
                h.be(n, n2);
                break;
            }
            case 20: {
                h.bg(n, n2);
                break;
            }
            case 21: {
                h.bi(n, n2);
                break;
            }
            case 22: {
                h.bk(n, n2);
                break;
            }
            case 23: {
                h.bm(n, n2);
                break;
            }
            case 30: {
                h.bo(n, n2);
                break;
            }
            case 31: {
                h.bq(n, n2);
                break;
            }
            case 32: {
                h.bs(n, n2);
            }
        }
    }

    static void ln(int n) {
        switch (h.q()) {
            case 8: {
                h.iw(n);
                break;
            }
            case 9: {
                h.iH(n);
                break;
            }
            case 14: {
                h.iS(n);
                break;
            }
            case 15: {
                h.jd(n);
                break;
            }
            case 16: {
                h.jo(n);
                break;
            }
            case 19: {
                h.jz(n);
                break;
            }
            case 20: {
                h.jK(n);
                break;
            }
            case 21: {
                h.jV(n);
                break;
            }
            case 22: {
                h.kg(n);
                break;
            }
            case 23: {
                h.kr(n);
                break;
            }
            case 30: {
                h.kC(n);
                break;
            }
            case 31: {
                h.kN(n);
                break;
            }
            case 32: {
                h.kY(n);
            }
        }
    }

    static void ab(boolean bl) {
        switch (h.q()) {
            case 8: {
                h.O(bl);
                break;
            }
            case 9: {
                h.P(bl);
                break;
            }
            case 14: {
                h.Q(bl);
                break;
            }
            case 15: {
                h.R(bl);
                break;
            }
            case 16: {
                h.S(bl);
                break;
            }
            case 19: {
                h.T(bl);
                break;
            }
            case 20: {
                h.U(bl);
                break;
            }
            case 21: {
                h.V(bl);
                break;
            }
            case 22: {
                h.W(bl);
                break;
            }
            case 23: {
                h.X(bl);
                break;
            }
            case 30: {
                h.Y(bl);
                break;
            }
            case 31: {
                h.Z(bl);
                break;
            }
            case 32: {
                h.aa(bl);
            }
        }
    }

    static void fm() {
        switch (h.q()) {
            case 8: {
                h.dP();
                break;
            }
            case 9: {
                h.dV();
                break;
            }
            case 14: {
                h.eb();
                break;
            }
            case 15: {
                h.eh();
                break;
            }
            case 16: {
                h.en();
                break;
            }
            case 19: {
                h.et();
                break;
            }
            case 20: {
                h.ez();
                break;
            }
            case 21: {
                h.eF();
                break;
            }
            case 22: {
                h.eL();
                break;
            }
            case 23: {
                h.eR();
                break;
            }
            case 30: {
                h.eX();
                break;
            }
            case 31: {
                h.fd();
                break;
            }
            case 32: {
                h.fj();
            }
        }
    }

    static void lo(int n) {
        switch (h.q()) {
            case 8: {
                h.ix(n);
                break;
            }
            case 9: {
                h.iI(n);
                break;
            }
            case 14: {
                h.iT(n);
                break;
            }
            case 15: {
                h.je(n);
                break;
            }
            case 16: {
                h.jp(n);
                break;
            }
            case 19: {
                h.jA(n);
                break;
            }
            case 20: {
                h.jL(n);
                break;
            }
            case 21: {
                h.jW(n);
                break;
            }
            case 22: {
                h.kh(n);
                break;
            }
            case 23: {
                h.ks(n);
                break;
            }
            case 30: {
                h.kD(n);
                break;
            }
            case 31: {
                h.kO(n);
                break;
            }
            case 32: {
                h.kZ(n);
            }
        }
    }

    static void fn() {
        switch (h.q()) {
            case 8: {
                h.dQ();
                break;
            }
            case 9: {
                h.dW();
                break;
            }
            case 14: {
                h.ec();
                break;
            }
            case 15: {
                h.ei();
                break;
            }
            case 16: {
                h.eo();
                break;
            }
            case 19: {
                h.eu();
                break;
            }
            case 20: {
                h.eA();
                break;
            }
            case 21: {
                h.eG();
                break;
            }
            case 22: {
                h.eM();
                break;
            }
            case 23: {
                h.eS();
                break;
            }
            case 30: {
                h.eY();
                break;
            }
            case 31: {
                h.fe();
                break;
            }
            case 32: {
                h.fk();
            }
        }
    }

    static void fo() {
    }

    static void fp() {
        if (!h.wc(26)) {
            bq = h.lS();
            if (bq != null && (h.bq.e == 16 || h.bq.e == 17) && h.bq.f == 3) {
                h.dp(1, 2000);
            } else {
                h.dj(15, 2048);
                h.wf(55);
            }
        }
        h.wm(3);
    }

    static void fq() {
        h.dk(15, 2048);
        h.wd(27);
    }

    static void fr() {
        h.aZ(false);
        h.dk(15, 2048);
    }

    static void lp(int n) {
    }

    static void lq(int n) {
    }

    static void lr(int n) {
    }

    static void ls(int n) {
    }

    static void lt(int n) {
    }

    static void lu(int n) {
    }

    static void lv(int n) {
    }

    static void lw(int n) {
    }

    static void lx(int n) {
        if (n == 1) {
            h.dj(h.bq.c, 65792);
            h.wf(62);
            h.we(26);
        }
    }

    static void bv(int n, int n2) {
    }

    static void bw(int n, int n2) {
    }

    static void ly(int n) {
        if (n == 0) {
            h.f(26, true);
        }
    }

    static void ac(boolean bl) {
    }

    static void fs() {
        f f2 = h.lS();
        if (f2 != null) {
            if (f2.e == 17 || f2.e == 16) {
                h.dj(f2.c, 65792);
                h.dk(15, 2048);
                h.wf(62);
                h.we(26);
                h.a("Kvest camplid");
            } else {
                h.wf(63);
                h.a("Kvest ne camplid");
            }
        }
    }

    static void lz(int n) {
    }

    static void ft() {
    }

    static void fu() {
    }

    static void fv() {
        if (!h.wc(27)) {
            h.a("_OnActivated q54");
            br = h.lS();
            if (br == null) {
                h.f(27, true);
                br = h.vV(44);
            } else if (h.dl(h.br.c, 256)) {
                h.dj(29, 2048);
                h.dj(31, 2048);
            } else {
                h.f(27, true);
            }
        }
    }

    static void fw() {
        h.dk(29, 2048);
        h.dk(31, 2048);
    }

    static void fx() {
        h.aZ(false);
        h.dk(29, 2048);
        h.dk(31, 2048);
        if (br != null) {
            h.dk(h.br.c, 4);
        }
        if (!h.dl(0, 2)) {
            h.c(0, 2955, 159, 2500);
        }
    }

    static void lA(int n) {
    }

    static void lB(int n) {
    }

    static void lC(int n) {
    }

    static void lD(int n) {
    }

    static void lE(int n) {
        if (h.dl(n, 256)) {
            h.dk(n, 4);
            h.d(29, true);
            h.dj(29, 2048);
            h.d(31, true);
            h.dj(31, 2048);
        }
    }

    static void lF(int n) {
        if (h.dl(n, 256)) {
            h.d(29, false);
            h.dk(29, 2048);
            h.d(31, false);
            h.dk(31, 2048);
            h.dj(n, 4);
        }
    }

    static void lG(int n) {
    }

    static void lH(int n) {
    }

    static void lI(int n) {
    }

    static void bx(int n, int n2) {
    }

    static void by(int n, int n2) {
    }

    static void lJ(int n) {
        if (n == 0 || n == h.br.c) {
            h.f(27, true);
            h.a("timer!!!!!!!!!!!!!!!!!!!!!!!");
            h.dp(6, 3000);
        }
    }

    static void ad(boolean bl) {
    }

    static void fy() {
    }

    static void lK(int n) {
    }

    static void fz() {
    }

    static void fA() {
        h.d(44, false);
        h.d(45, false);
        h.d(41, false);
        h.d(40, false);
        h.d(42, false);
        h.d(43, false);
        h.d(46, false);
    }

    static void fB() {
        if (!h.wc(53)) {
            h.wf(105);
            h.dj(46, 2048);
            h.d(46, true);
            h.vV(41).q(1);
            h.vV(40).q(1);
            h.vV(42).q(1);
            h.vV(43).q(1);
            h.d(41, true);
            h.d(40, true);
            h.d(42, true);
            h.d(43, true);
            h.dm(44, 7);
            h.dm(45, 7);
            h.d(44, true);
            h.d(45, true);
            h.dj(44, 4096);
            h.dj(45, 4096);
            h.d(34, false);
            bs = null;
            bt = 0;
            h.dp(2, 2000);
        }
    }

    static void fC() {
        h.wd(54);
        h.d(34, true);
    }

    static void fD() {
        h.aZ(false);
    }

    static void lL(int n) {
        if (h.dl(46, 2048)) {
            f f2 = h.lS();
            if (f2 != null) {
                if (h.l(f2.c, 46, 150)) {
                    h.wq(f2.c);
                    h.dk(46, 2048);
                    h.dq(1, 1000);
                }
            } else if (h.l(0, 46, 150)) {
                h.dk(46, 2048);
                h.dq(1, 1000);
            }
        }
    }

    static void lM(int n) {
    }

    static void lN(int n) {
    }

    static void lO(int n) {
    }

    static void lP(int n) {
    }

    static void lQ(int n) {
    }

    static void lR(int n) {
    }

    static void lS(int n) {
    }

    static void lT(int n) {
        if (2 == n) {
            h.wf(105);
        }
    }

    static void bz(int n, int n2) {
        block0 : switch (n) {
            case 1: {
                switch (n2) {
                    case 0: {
                        h.ba(true);
                        h.dr(46, 200);
                        break block0;
                    }
                    case 2000: {
                        h.wf(109);
                        break block0;
                    }
                    case 3000: {
                        h.m(41, 44, 15);
                        h.m(40, 44, 15);
                        h.m(42, 45, 15);
                        h.m(43, 45, 15);
                        break block0;
                    }
                    case 4000: {
                        h.e(41, false);
                        h.e(40, false);
                        h.e(42, false);
                        h.e(43, false);
                        h.d(41, false);
                        h.d(40, false);
                        h.d(42, false);
                        h.d(43, false);
                        break block0;
                    }
                    case 5000: {
                        h.du(1, 50);
                        h.dj(44, 73732);
                        h.dj(45, 73732);
                        h.dk(44, 4096);
                        h.dk(45, 4096);
                        h.do(44, 300);
                        h.do(45, 300);
                        f f2 = h.lS();
                        if (f2 != null) {
                            h.dB(44, f2.c);
                            h.dB(45, f2.c);
                        } else {
                            h.dB(44, 0);
                            h.dB(45, 0);
                        }
                        h.ba(false);
                        h.lP();
                        h.vZ(1);
                    }
                }
            }
        }
    }

    static void bA(int n, int n2) {
    }

    static void lU(int n) {
        switch (n) {
            case 44: 
            case 45: {
                h.dk(n, 4);
                if (++bt != 2) break;
                h.wf(110);
                h.k(41, h.vV((int)n).h, h.vV((int)n).i + 20);
                h.dj(41, 4);
                h.d(41, true);
            }
        }
        if (n == 41) {
            h.dk(41, 4);
            h.wf(111);
            h.we(53);
        }
    }

    static void ae(boolean bl) {
    }

    static void fE() {
    }

    static void lV(int n) {
    }

    static void fF() {
    }

    static void fG() {
    }

    static void fH() {
        if (!h.wc(54)) {
            h.wf(106);
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
    }

    static void fI() {
        h.dk(32, 2048);
        h.dk(28, 2048);
    }

    static void fJ() {
    }

    static void lW(int n) {
    }

    static void lX(int n) {
    }

    static void lY(int n) {
    }

    static void lZ(int n) {
    }

    static void ma(int n) {
    }

    static void mb(int n) {
    }

    static void mc(int n) {
    }

    static void md(int n) {
    }

    static void me(int n) {
    }

    static void bB(int n, int n2) {
    }

    static void bC(int n, int n2) {
    }

    static void mf(int n) {
    }

    static void af(boolean bl) {
    }

    static void fK() {
    }

    static void mg(int n) {
    }

    static void fL() {
    }

    static void fM() {
        h.d(6, false);
    }

    static void fN() {
        if (!h.wc(69)) {
            bu = h.lS();
            if (bu == null) {
                h.f(69, true);
                bu = h.vV(44);
            } else if (h.dl(h.bu.c, 256)) {
                h.dm(6, 6);
                h.dn(6, 270);
                h.d(6, true);
                h.vV(6).q(0);
                h.dm(6, 6);
                h.dj(6, 8196);
                h.dp(0, 2000);
            } else {
                h.f(69, true);
            }
        }
    }

    static void fO() {
        h.wd(70);
        h.wn(9);
    }

    static void fP() {
        h.aZ(false);
        h.dk(47, 2048);
        h.dk(6, 4);
        if (bu != null) {
            h.dk(h.bu.c, 260);
        }
        h.dj(32, 2048);
        h.dj(28, 2048);
    }

    static void mh(int n) {
        if (bu != null && h.l(h.bu.c, 6, 100) && h.dl(6, 4)) {
            h.dk(6, 4);
            h.dC(6, h.bu.c);
            h.dj(47, 2048);
            h.wf(138);
        }
        if (bu != null && h.l(h.bu.c, 47, 50) && h.dl(47, 2048)) {
            h.dk(47, 2048);
            h.wp(6);
            h.wq(6);
            h.we(69);
        }
    }

    static void mi(int n) {
    }

    static void mj(int n) {
    }

    static void mk(int n) {
    }

    static void ml(int n) {
        if (n == h.bu.c) {
            h.dk(h.bu.c, 4);
            if (h.dl(47, 2048)) {
                h.dC(6, h.bu.c);
            } else {
                h.dj(6, 4);
            }
        }
    }

    static void mm(int n) {
        if (n == h.bu.c) {
            h.dj(h.bu.c, 4);
            h.vV(h.bu.c).q(0);
            h.dm(h.bu.c, 6);
            h.dk(6, 4);
        }
    }

    static void mn(int n) {
    }

    static void mo(int n) {
    }

    static void mp(int n) {
        if (n == 0) {
            h.wf(137);
            h.wf(131);
        }
    }

    static void bD(int n, int n2) {
    }

    static void bE(int n, int n2) {
    }

    static void mq(int n) {
        if (n == h.bu.c || n == 0 || n == 6) {
            h.f(69, true);
        }
    }

    static void ag(boolean bl) {
    }

    static void fQ() {
    }

    static void mr(int n) {
    }

    static void fR() {
    }

    static void fS() {
        h.d(63, false);
        h.d(64, false);
        h.d(65, false);
        h.d(68, false);
        h.d(66, false);
        h.d(67, false);
        h.d(49, false);
        h.d(48, false);
        h.d(39, false);
        h.d(50, false);
        h.d(51, false);
        h.d(53, false);
        h.d(54, false);
        h.d(55, false);
        h.d(56, false);
        h.d(57, false);
        h.d(58, false);
        h.d(59, false);
    }

    static void fT() {
        if (!h.wc(70)) {
            h.a("activate q13_8");
            bv = h.lS();
            if (bv == null) {
                h.f(70, true);
                bv = h.vV(44);
            } else if (h.dl(h.bv.c, 256)) {
                h.dq(1, 1000);
                bw = true;
                bx = true;
                by = true;
                bz = true;
                bA = false;
                h.aY(false);
            } else {
                h.f(70, true);
            }
        }
    }

    static void fU() {
        h.wd(71);
        h.aY(true);
        h.wn(10);
    }

    static void fV() {
        h.aZ(false);
        h.dk(49, 4);
        h.dk(48, 4);
        h.dk(39, 4);
        h.dk(50, 4);
        h.dk(51, 4);
        h.dk(53, 4);
        h.dk(54, 4);
        h.dk(55, 4);
        h.dk(56, 4);
        h.dk(57, 4);
        h.dk(47, 2048);
        h.dk(6, 4);
        h.aY(true);
        h.dj(28, 2048);
        h.dj(32, 2048);
    }

    static void ms(int n) {
        if (h.dl(49, 2) && h.dl(48, 2) && h.dl(39, 2) && bw) {
            h.vV(50).q(1);
            h.vV(51).q(1);
            h.dA(50, 6);
            h.dA(51, 6);
            h.d(50, true);
            h.d(51, true);
            h.dj(50, 4);
            h.dj(51, 4);
            h.m(50, 73, 15);
            h.m(51, 73, 15);
            bw = false;
        }
        if (h.dl(50, 2) && h.dl(51, 2) && bx) {
            h.vV(53).q(1);
            h.vV(54).q(1);
            h.dA(53, 6);
            h.dA(54, 6);
            h.d(53, true);
            h.d(54, true);
            h.dj(53, 4);
            h.dj(54, 4);
            h.m(53, 73, 15);
            h.m(54, 73, 15);
            bx = false;
        }
        if (h.dl(53, 2) && h.dl(54, 2) && by) {
            h.vV(55).q(1);
            h.vV(56).q(1);
            h.vV(57).q(1);
            h.dA(55, 6);
            h.dA(56, 6);
            h.dA(57, 6);
            h.d(55, true);
            h.d(56, true);
            h.d(57, true);
            h.dj(55, 4);
            h.dj(56, 4);
            h.dj(57, 4);
            h.m(55, 73, 15);
            h.m(56, 73, 15);
            h.m(57, 73, 15);
            by = false;
        }
        if (h.dl(55, 2) && h.dl(56, 2) && h.dl(57, 2) && bz) {
            h.dq(2, 1000);
            bz = false;
        }
        if (h.dl(50, 2) && h.dl(51, 2) && h.dl(53, 2) && h.dl(54, 2) && h.dl(55, 2) && h.dl(56, 2) && bA) {
            h.dj(h.bv.c, 260);
            h.wf(141);
            h.dq(3, 1000);
            bA = false;
        }
        if (bv != null && !h.l(h.bv.c, 73, 300) && h.dl(h.bv.c, 256)) {
            h.aZ(true);
            h.dk(h.bv.c, 256);
            h.we(70);
        }
    }

    static void mt(int n) {
    }

    static void mu(int n) {
    }

    static void mv(int n) {
    }

    static void mw(int n) {
        if (n == h.bv.c) {
            h.dk(h.bv.c, 4);
        }
    }

    static void mx(int n) {
        if (n == h.bv.c) {
            h.vV(h.bv.c).q(0);
            h.dm(h.bv.c, 6);
        }
    }

    static void my(int n) {
    }

    static void mz(int n) {
    }

    static void mA(int n) {
    }

    static void bF(int n, int n2) {
        block0 : switch (n) {
            case 1: {
                switch (n2) {
                    case 0: {
                        h.ba(true);
                        h.du(1, 50);
                        h.wq(h.bv.c);
                        h.dr(52, 100);
                        break;
                    }
                    case 2000: {
                        h.vV(49).q(1);
                        h.vV(48).q(1);
                        h.vV(39).q(1);
                        h.dA(49, 6);
                        h.dA(48, 15);
                        h.dA(39, 6);
                        h.d(49, true);
                        h.d(48, true);
                        h.d(39, true);
                        break;
                    }
                    case 4000: {
                        h.do(6, 300);
                        h.dB(49, 6);
                        h.wf(140);
                        break;
                    }
                    case 5000: {
                        h.wf(139);
                        h.dA(48, 6);
                        h.ba(false);
                        h.dj(49, 4);
                        h.dj(48, 4);
                        h.dj(39, 4);
                        h.lP();
                        h.lR();
                        h.vV(63).q(0);
                        h.vV(64).q(0);
                        h.vV(65).q(0);
                        h.vV(68).q(0);
                        h.vV(66).q(0);
                        h.vV(67).q(0);
                        h.dA(63, 8);
                        h.dA(64, 8);
                        h.dA(65, 8);
                        h.dA(68, 8);
                        h.dA(66, 8);
                        h.dA(67, 8);
                        h.d(63, true);
                        h.d(64, true);
                        h.d(65, true);
                        h.d(68, true);
                        h.d(66, true);
                        h.d(67, true);
                        h.vZ(1);
                    }
                }
                break;
            }
            case 2: {
                switch (n2) {
                    case 0: {
                        h.ba(true);
                        h.dr(69, 120);
                        break;
                    }
                    case 3000: {
                        h.dm(58, 7);
                        h.d(58, true);
                        h.dD(58, 0x780000);
                        h.dm(59, 7);
                        h.d(59, true);
                        h.dD(59, 0x780000);
                        break;
                    }
                    case 7000: {
                        h.n(50, 2328, 259);
                        h.n(51, 2364, 256);
                        h.n(53, 2395, 259);
                        h.n(54, 2424, 259);
                        h.n(55, 2452, 258);
                        h.n(56, 2481, 256);
                        h.vV(50).q(1);
                        h.vV(51).q(1);
                        h.vV(53).q(1);
                        h.vV(54).q(1);
                        h.vV(55).q(1);
                        h.vV(56).q(1);
                        h.dA(50, 6);
                        h.dA(51, 6);
                        h.dA(53, 6);
                        h.dA(54, 6);
                        h.dA(55, 6);
                        h.dA(56, 6);
                        break;
                    }
                    case 8000: {
                        h.dj(50, 4);
                        h.dj(51, 4);
                        h.dj(53, 4);
                        h.dj(54, 4);
                        h.dj(55, 4);
                        h.dj(56, 4);
                        h.ba(false);
                        h.lP();
                        bA = true;
                        h.vZ(2);
                    }
                }
                break;
            }
            case 3: {
                switch (n2) {
                    case 1000: {
                        h.m(63, h.bv.c, 15);
                        h.m(64, h.bv.c, 15);
                        h.m(65, h.bv.c, 15);
                        h.m(68, h.bv.c, 15);
                        h.m(66, h.bv.c, 15);
                        h.m(67, h.bv.c, 15);
                        break block0;
                    }
                    case 2000: {
                        h.d(63, false);
                        h.d(64, false);
                        h.d(65, false);
                        h.d(68, false);
                        h.d(66, false);
                        h.d(67, false);
                        h.vZ(3);
                    }
                }
            }
        }
    }

    static void bG(int n, int n2) {
    }

    static void mB(int n) {
        h.dk(n, 4);
        if (n == h.bv.c || n == 0) {
            h.f(70, true);
        }
    }

    static void ah(boolean bl) {
    }

    static void fW() {
    }

    static void mC(int n) {
    }

    static void fX() {
    }

    static void fY() {
    }

    static void fZ() {
        if (!h.wc(71)) {
            h.wf(142);
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
    }

    static void ga() {
        h.dk(32, 2048);
        h.dk(28, 2048);
    }

    static void gb() {
    }

    static void mD(int n) {
    }

    static void mE(int n) {
    }

    static void mF(int n) {
    }

    static void mG(int n) {
    }

    static void mH(int n) {
    }

    static void mI(int n) {
    }

    static void mJ(int n) {
    }

    static void mK(int n) {
    }

    static void mL(int n) {
    }

    static void bH(int n, int n2) {
    }

    static void bI(int n, int n2) {
    }

    static void mM(int n) {
    }

    static void ai(boolean bl) {
    }

    static void gc() {
    }

    static void mN(int n) {
    }

    static void gd() {
    }

    static void ge() {
        h.d(77, false);
        h.dm(77, 13);
    }

    static void gf() {
        if (!h.wc(75)) {
            h.dj(74, 2048);
            h.aX(true);
            bB = h.lS();
            if (bB != null) {
                if (!h.dl(h.bB.c, 256)) {
                    h.f(75, true);
                }
            } else {
                bB = h.vV(44);
                h.f(75, true);
            }
        }
    }

    static void gg() {
        h.wd(76);
    }

    static void gh() {
        h.aZ(false);
        h.dk(74, 2048);
        if (bB != null) {
            h.dk(h.bB.c, 260);
        }
        if (!h.dl(0, 2)) {
            h.c(0, 2955, 159, 2500);
        }
    }

    static void mO(int n) {
        if (bB != null && h.l(h.bB.c, 74, 35) && h.dl(74, 2048)) {
            h.wq(h.bB.c);
            h.dq(0, 1000);
        }
    }

    static void mP(int n) {
    }

    static void mQ(int n) {
    }

    static void mR(int n) {
    }

    static void mS(int n) {
        if (h.bB.c == n && h.dl(h.bB.c, 256)) {
            h.dk(h.bB.c, 4);
            h.dj(74, 2048);
        }
    }

    static void mT(int n) {
        if (h.bB.c == n && h.dl(h.bB.c, 256)) {
            h.dj(h.bB.c, 4);
            h.dk(74, 2048);
        }
    }

    static void mU(int n) {
    }

    static void mV(int n) {
    }

    static void mW(int n) {
    }

    static void bJ(int n, int n2) {
        block0 : switch (n) {
            case 0: {
                switch (n2) {
                    case 0: {
                        h.ba(true);
                        h.dr(27, 100);
                        h.dk(74, 2048);
                        break block0;
                    }
                    case 1000: {
                        h.d(77, true);
                        break block0;
                    }
                    case 2000: {
                        h.m(77, 76, 15);
                        break block0;
                    }
                    case 4000: {
                        h.d(77, false);
                        break block0;
                    }
                    case 7000: {
                        h.d(77, true);
                        h.m(77, h.bB.c, 15);
                        break block0;
                    }
                    case 9000: {
                        h.wf(150);
                        h.d(77, false);
                        h.ba(false);
                        h.dj(h.bB.c, 256);
                        h.lP();
                        h.we(75);
                        h.vZ(0);
                    }
                }
            }
        }
    }

    static void bK(int n, int n2) {
    }

    static void mX(int n) {
        if (n == h.bB.c || n == 0) {
            h.f(75, true);
        }
    }

    static void aj(boolean bl) {
    }

    static void gi() {
    }

    static void mY(int n) {
    }

    static void gj() {
    }

    static void gk() {
    }

    static void gl() {
        if (!h.wc(76)) {
            bC = h.lS();
            if (bC != null) {
                if (!h.dl(h.bC.c, 256)) {
                    h.f(76, true);
                } else {
                    h.du(5, 70);
                    h.dj(34, 2048);
                    h.wf(146);
                }
            } else {
                h.f(76, true);
            }
        }
    }

    static void gm() {
        h.wd(77);
    }

    static void gn() {
        h.aZ(false);
        h.dk(34, 2048);
        if (bC != null) {
            h.dk(h.bC.c, 260);
        }
        if (!h.dl(0, 2)) {
            h.c(0, 2955, 159, 2500);
        }
    }

    static void mZ(int n) {
        if (h.wk(5) == 0 && bC != null && bC == h.lS()) {
            h.dk(34, 2048);
            h.wf(151);
            h.we(76);
        }
    }

    static void na(int n) {
    }

    static void nb(int n) {
    }

    static void nc(int n) {
    }

    static void nd(int n) {
        if (h.bC.c == n && h.dl(h.bC.c, 256)) {
            h.dk(h.bC.c, 4);
        }
    }

    static void ne(int n) {
        if (h.bC.c == n && h.dl(h.bC.c, 256)) {
            h.dj(h.bC.c, 4);
        }
    }

    static void nf(int n) {
    }

    static void ng(int n) {
    }

    static void nh(int n) {
    }

    static void bL(int n, int n2) {
    }

    static void bM(int n, int n2) {
    }

    static void ni(int n) {
        if (n == h.bC.c || n == 0) {
            h.f(76, true);
        }
    }

    static void ak(boolean bl) {
    }

    static void go() {
    }

    static void nj(int n) {
    }

    static void gp() {
    }

    static void gq() {
        h.d(78, false);
    }

    static void gr() {
        if (!h.wc(77)) {
            h.wf(147);
            h.dm(78, 7);
            h.d(78, true);
            h.dD(78, 0x460000);
            h.do(78, 200);
            h.dj(78, 4);
            bD = h.lS();
            if (bD != null) {
                if (!h.dl(h.bD.c, 256)) {
                    h.a("Car not marked");
                    h.f(77, true);
                }
            } else {
                h.f(77, true);
            }
        }
    }

    static void gs() {
        h.wj(200);
        h.wd(78);
        h.dk(78, 4);
        h.dv(1, 0);
        h.wn(11);
        h.wm(5);
        if (bD != null) {
            h.dk(h.bD.c, 260);
        }
    }

    static void gt() {
        h.aZ(false);
        if (bD != null) {
            h.dk(h.bD.c, 260);
        }
        h.dk(78, 4);
        if (!h.dl(0, 2)) {
            h.c(0, 2955, 159, 2500);
        }
    }

    static void nk(int n) {
        if (h.l(78, 29, 35)) {
            h.d(78, false);
            h.f(77, true);
        }
    }

    static void nl(int n) {
    }

    static void nm(int n) {
    }

    static void nn(int n) {
    }

    static void no(int n) {
        if (h.bD.c == n && h.dl(h.bD.c, 256)) {
            h.dk(h.bD.c, 4);
            h.dj(78, 4);
        }
    }

    static void np(int n) {
        if (h.bD.c == n && h.dl(h.bD.c, 256)) {
            h.dj(h.bD.c, 4);
            h.dk(78, 4);
        }
    }

    static void nq(int n) {
    }

    static void nr(int n) {
    }

    static void ns(int n) {
    }

    static void bN(int n, int n2) {
    }

    static void bO(int n, int n2) {
    }

    static void nt(int n) {
        if (n == h.bD.c || n == 0) {
            h.f(77, true);
        }
        if (n == 78) {
            bD = h.lS();
            if (bD != null) {
                if (!h.dl(h.bD.c, 256)) {
                    h.a("Car not marked -  death!!!!");
                    h.f(77, true);
                } else {
                    h.aZ(true);
                    h.we(77);
                }
            } else {
                h.f(77, true);
            }
        }
    }

    static void al(boolean bl) {
    }

    static void gu() {
    }

    static void nu(int n) {
    }

    static void gv() {
    }

    static void gw() {
    }

    static void gx() {
        if (!h.wc(78)) {
            h.wf(152);
            h.dj(29, 2048);
            h.dj(31, 2048);
        }
    }

    static void gy() {
        h.dk(29, 2048);
        h.dk(31, 2048);
    }

    static void gz() {
    }

    static void nv(int n) {
    }

    static void nw(int n) {
    }

    static void nx(int n) {
    }

    static void ny(int n) {
    }

    static void nz(int n) {
        if (h.dl(n, 256)) {
            h.dk(n, 4);
            h.d(29, true);
            h.dj(29, 2048);
            h.d(31, true);
            h.dj(31, 2048);
        }
    }

    static void nA(int n) {
        if (h.dl(n, 256)) {
            h.d(29, false);
            h.dk(29, 2048);
            h.d(31, false);
            h.dk(31, 2048);
            h.dj(n, 4);
        }
    }

    static void nB(int n) {
    }

    static void nC(int n) {
    }

    static void nD(int n) {
    }

    static void bP(int n, int n2) {
    }

    static void bQ(int n, int n2) {
    }

    static void nE(int n) {
    }

    static void am(boolean bl) {
    }

    static void gA() {
    }

    static void nF(int n) {
    }

    static void gB() {
    }

    static void gC() {
        if (h.wb(0) && !h.wc(0)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
            h.be(false);
            h.bd(false);
            h.bc(false);
            h.aX(false);
        }
        if (h.wb(1) && !h.wc(1)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(2) && !h.wc(2)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(3) && !h.wc(3)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(4) && !h.wc(4)) {
            h.aZ(false);
            h.f(4, true);
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(6) && !h.wc(6)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(7) && !h.wc(7)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
            f f2 = h.lS();
            if (f2 == null) {
                h.aZ(false);
                h.f(7, true);
            } else if (!h.dl(f2.c, 256)) {
                h.aZ(false);
                h.f(7, true);
            }
        }
        if (h.wb(8) && !h.wc(8)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(9) && !h.wc(9)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(11) && !h.wc(11)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(12) && !h.wc(12)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(13) && !h.wc(13)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(14) && !h.wc(14)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(15) && !h.wc(15)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(16) && !h.wc(16)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(17) && !h.wc(17)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(18) && !h.wc(18)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(19) && !h.wc(19)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(20) && !h.wc(20)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(21) && !h.wc(21)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(22) && !h.wc(22)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(23) && !h.wc(23)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(24) && !h.wc(24)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(25) && !h.wc(25)) {
            h.we(25);
            h.wd(26);
        }
        if (!h.wb(26) || !h.wc(26)) {
            // empty if block
        }
        if (h.wb(27) && !h.wc(27)) {
            h.dj(29, 2048);
            h.dj(31, 2048);
        }
        if (h.wb(28) && !h.wc(28)) {
            h.dj(29, 2048);
            h.dj(31, 2048);
        }
        if (h.wb(29) && !h.wc(29)) {
            h.dj(29, 2048);
            h.dj(31, 2048);
        }
        if (!h.wb(30) || !h.wc(30)) {
            // empty if block
        }
        if (!h.wb(31) || !h.wc(31)) {
            // empty if block
        }
        if (h.wb(32) && !h.wc(32)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
            h.dj(29, 2048);
            h.dj(31, 2048);
        }
        if (h.wb(33) && !h.wc(33)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
            h.dj(29, 2048);
            h.dj(31, 2048);
        }
        if (h.wb(35) && !h.wc(35)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
            h.dj(29, 2048);
            h.dj(31, 2048);
        }
        if (!h.wb(36) || !h.wc(36)) {
            // empty if block
        }
        if (h.wb(37) && !h.wc(37)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
            h.dj(29, 2048);
            h.dj(31, 2048);
        }
        if (!h.wb(38) || !h.wc(38)) {
            // empty if block
        }
        if (h.wb(39) && !h.wc(39)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
            h.dj(29, 2048);
            h.dj(31, 2048);
        }
        if (!h.wb(40) || !h.wc(40)) {
            // empty if block
        }
        if (h.wb(41) && !h.wc(41)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(42) && !h.wc(42)) {
            h.aZ(false);
            h.f(42, true);
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(43) && !h.wc(43)) {
            h.aZ(false);
            h.f(43, true);
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(44) && !h.wc(44)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(46) && !h.wc(46)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
            h.dj(29, 2048);
            h.dj(31, 2048);
        }
        if (h.wb(47) && !h.wc(47)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
            h.dj(29, 2048);
            h.dj(31, 2048);
        }
        if (!h.wb(48) || !h.wc(48)) {
            // empty if block
        }
        if (!h.wb(49) || !h.wc(49)) {
            // empty if block
        }
        if (h.wb(50) && !h.wc(50)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(51) && !h.wc(51)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(52) && !h.wc(52)) {
            h.we(52);
            h.wd(53);
        }
        if (!h.wb(53) || !h.wc(53)) {
            // empty if block
        }
        if (h.wb(54) && !h.wc(54)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(55) && !h.wc(55)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(56) && !h.wc(56)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(58) && !h.wc(58)) {
            h.aZ(false);
            h.f(58, false);
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(60) && !h.wc(60)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(61) && !h.wc(61)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(62) && !h.wc(62)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(63) && !h.wc(63)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(64) && !h.wc(64)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
            h.dj(29, 2048);
            h.dj(31, 2048);
        }
        if (h.wb(65) && !h.wc(65)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
            h.dj(29, 2048);
            h.dj(31, 2048);
        }
        if (!h.wb(66) || !h.wc(66)) {
            // empty if block
        }
        if (!h.wb(67) || !h.wc(67)) {
            // empty if block
        }
        if (h.wb(68) && !h.wc(68)) {
            h.we(68);
            h.wd(69);
        }
        if (!h.wb(69) || !h.wc(69)) {
            // empty if block
        }
        if (!h.wb(70) || !h.wc(70)) {
            // empty if block
        }
        if (h.wb(71) && !h.wc(71)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(72) && !h.wc(72)) {
            h.dj(32, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(74) && !h.wc(74)) {
            h.we(74);
            h.wd(75);
        }
        if (!h.wb(75) || !h.wc(75)) {
            // empty if block
        }
        if (h.wb(78) && !h.wc(78)) {
            h.dj(29, 2048);
            h.dj(31, 2048);
        }
        if (h.wb(79) && !h.wc(79)) {
            h.dj(29, 2048);
            h.dj(31, 2048);
        }
        if (h.wb(80) && !h.wc(80)) {
            h.dj(29, 2048);
            h.dj(31, 2048);
        }
        if (h.wb(81) && !h.wc(81)) {
            h.dj(29, 2048);
            h.dj(31, 2048);
        }
        if (h.wb(82) && !h.wc(82)) {
            h.dj(29, 2048);
            h.dj(31, 2048);
        }
        if (h.wb(83) && !h.wc(83)) {
            h.dj(29, 2048);
            h.dj(31, 2048);
        }
        if (h.wb(84) && !h.wc(84)) {
            h.dj(29, 2048);
            h.dj(31, 2048);
        }
    }

    static void nG(int n) {
        switch (h.q()) {
            case 26: {
                h.lp(n);
                break;
            }
            case 27: {
                h.lA(n);
                break;
            }
            case 53: {
                h.lL(n);
                break;
            }
            case 54: {
                h.lW(n);
                break;
            }
            case 69: {
                h.mh(n);
                break;
            }
            case 70: {
                h.ms(n);
                break;
            }
            case 71: {
                h.mD(n);
                break;
            }
            case 75: {
                h.mO(n);
                break;
            }
            case 76: {
                h.mZ(n);
                break;
            }
            case 77: {
                h.nk(n);
                break;
            }
            case 78: {
                h.nv(n);
            }
        }
    }

    static void nH(int n) {
        switch (n) {
            case 26: {
                h.fo();
                break;
            }
            case 27: {
                h.fu();
                break;
            }
            case 53: {
                h.fA();
                break;
            }
            case 54: {
                h.fG();
                break;
            }
            case 69: {
                h.fM();
                break;
            }
            case 70: {
                h.fS();
                break;
            }
            case 71: {
                h.fY();
                break;
            }
            case 75: {
                h.ge();
                break;
            }
            case 76: {
                h.gk();
                break;
            }
            case 77: {
                h.gq();
                break;
            }
            case 78: {
                h.gw();
            }
        }
    }

    static void nI(int n) {
        switch (n) {
            case 26: {
                h.fp();
                break;
            }
            case 27: {
                h.fv();
                break;
            }
            case 53: {
                h.fB();
                break;
            }
            case 54: {
                h.fH();
                break;
            }
            case 69: {
                h.fN();
                break;
            }
            case 70: {
                h.fT();
                break;
            }
            case 71: {
                h.fZ();
                break;
            }
            case 75: {
                h.gf();
                break;
            }
            case 76: {
                h.gl();
                break;
            }
            case 77: {
                h.gr();
                break;
            }
            case 78: {
                h.gx();
            }
        }
    }

    static void nJ(int n) {
        switch (n) {
            case 26: {
                h.fq();
                break;
            }
            case 27: {
                h.fw();
                break;
            }
            case 53: {
                h.fC();
                break;
            }
            case 54: {
                h.fI();
                break;
            }
            case 69: {
                h.fO();
                break;
            }
            case 70: {
                h.fU();
                break;
            }
            case 71: {
                h.ga();
                break;
            }
            case 75: {
                h.gg();
                break;
            }
            case 76: {
                h.gm();
                break;
            }
            case 77: {
                h.gs();
                break;
            }
            case 78: {
                h.gy();
            }
        }
    }

    static void nK(int n) {
        switch (n) {
            case 26: {
                h.fr();
                break;
            }
            case 27: {
                h.fx();
                break;
            }
            case 53: {
                h.fD();
                break;
            }
            case 54: {
                h.fJ();
                break;
            }
            case 69: {
                h.fP();
                break;
            }
            case 70: {
                h.fV();
                break;
            }
            case 71: {
                h.gb();
                break;
            }
            case 75: {
                h.gh();
                break;
            }
            case 76: {
                h.gn();
                break;
            }
            case 77: {
                h.gt();
                break;
            }
            case 78: {
                h.gz();
            }
        }
    }

    static void nL(int n) {
        switch (h.q()) {
            case 26: {
                h.lq(n);
                break;
            }
            case 27: {
                h.lB(n);
                break;
            }
            case 53: {
                h.lM(n);
                break;
            }
            case 54: {
                h.lX(n);
                break;
            }
            case 69: {
                h.mi(n);
                break;
            }
            case 70: {
                h.mt(n);
                break;
            }
            case 71: {
                h.mE(n);
                break;
            }
            case 75: {
                h.mP(n);
                break;
            }
            case 76: {
                h.na(n);
                break;
            }
            case 77: {
                h.nl(n);
                break;
            }
            case 78: {
                h.nw(n);
            }
        }
    }

    static void nM(int n) {
        switch (h.q()) {
            case 26: {
                h.lr(n);
                break;
            }
            case 27: {
                h.lC(n);
                break;
            }
            case 53: {
                h.lN(n);
                break;
            }
            case 54: {
                h.lY(n);
                break;
            }
            case 69: {
                h.mj(n);
                break;
            }
            case 70: {
                h.mu(n);
                break;
            }
            case 71: {
                h.mF(n);
                break;
            }
            case 75: {
                h.mQ(n);
                break;
            }
            case 76: {
                h.nb(n);
                break;
            }
            case 77: {
                h.nm(n);
                break;
            }
            case 78: {
                h.nx(n);
            }
        }
    }

    static void nN(int n) {
        switch (h.q()) {
            case 26: {
                h.ls(n);
                break;
            }
            case 27: {
                h.lD(n);
                break;
            }
            case 53: {
                h.lO(n);
                break;
            }
            case 54: {
                h.lZ(n);
                break;
            }
            case 69: {
                h.mk(n);
                break;
            }
            case 70: {
                h.mv(n);
                break;
            }
            case 71: {
                h.mG(n);
                break;
            }
            case 75: {
                h.mR(n);
                break;
            }
            case 76: {
                h.nc(n);
                break;
            }
            case 77: {
                h.nn(n);
                break;
            }
            case 78: {
                h.ny(n);
            }
        }
    }

    static void nO(int n) {
        switch (h.q()) {
            case 26: {
                h.lt(n);
                break;
            }
            case 27: {
                h.lE(n);
                break;
            }
            case 53: {
                h.lP(n);
                break;
            }
            case 54: {
                h.ma(n);
                break;
            }
            case 69: {
                h.ml(n);
                break;
            }
            case 70: {
                h.mw(n);
                break;
            }
            case 71: {
                h.mH(n);
                break;
            }
            case 75: {
                h.mS(n);
                break;
            }
            case 76: {
                h.nd(n);
                break;
            }
            case 77: {
                h.no(n);
                break;
            }
            case 78: {
                h.nz(n);
            }
        }
        h.be(true);
    }

    static void nP(int n) {
        switch (h.q()) {
            case 26: {
                h.lu(n);
                break;
            }
            case 27: {
                h.lF(n);
                break;
            }
            case 53: {
                h.lQ(n);
                break;
            }
            case 54: {
                h.mb(n);
                break;
            }
            case 69: {
                h.mm(n);
                break;
            }
            case 70: {
                h.mx(n);
                break;
            }
            case 71: {
                h.mI(n);
                break;
            }
            case 75: {
                h.mT(n);
                break;
            }
            case 76: {
                h.ne(n);
                break;
            }
            case 77: {
                h.np(n);
                break;
            }
            case 78: {
                h.nA(n);
            }
        }
        h.be(false);
    }

    static void nQ(int n) {
        switch (h.q()) {
            case 26: {
                h.lv(n);
                break;
            }
            case 27: {
                h.lG(n);
                break;
            }
            case 53: {
                h.lR(n);
                break;
            }
            case 54: {
                h.mc(n);
                break;
            }
            case 69: {
                h.mn(n);
                break;
            }
            case 70: {
                h.my(n);
                break;
            }
            case 71: {
                h.mJ(n);
                break;
            }
            case 75: {
                h.mU(n);
                break;
            }
            case 76: {
                h.nf(n);
                break;
            }
            case 77: {
                h.nq(n);
                break;
            }
            case 78: {
                h.nB(n);
            }
        }
    }

    static void nR(int n) {
        switch (h.q()) {
            case 26: {
                h.lw(n);
                break;
            }
            case 27: {
                h.lH(n);
                break;
            }
            case 53: {
                h.lS(n);
                break;
            }
            case 54: {
                h.md(n);
                break;
            }
            case 69: {
                h.mo(n);
                break;
            }
            case 70: {
                h.mz(n);
                break;
            }
            case 71: {
                h.mK(n);
                break;
            }
            case 75: {
                h.mV(n);
                break;
            }
            case 76: {
                h.ng(n);
                break;
            }
            case 77: {
                h.nr(n);
                break;
            }
            case 78: {
                h.nC(n);
            }
        }
    }

    static void nS(int n) {
        switch (h.q()) {
            case 26: {
                h.lx(n);
                break;
            }
            case 27: {
                h.lI(n);
                break;
            }
            case 53: {
                h.lT(n);
                break;
            }
            case 54: {
                h.me(n);
                break;
            }
            case 69: {
                h.mp(n);
                break;
            }
            case 70: {
                h.mA(n);
                break;
            }
            case 71: {
                h.mL(n);
                break;
            }
            case 75: {
                h.mW(n);
                break;
            }
            case 76: {
                h.nh(n);
                break;
            }
            case 77: {
                h.ns(n);
                break;
            }
            case 78: {
                h.nD(n);
            }
        }
    }

    static void bR(int n, int n2) {
        switch (h.q()) {
            case 26: {
                h.bv(n, n2);
                break;
            }
            case 27: {
                h.bx(n, n2);
                break;
            }
            case 53: {
                h.bz(n, n2);
                break;
            }
            case 54: {
                h.bB(n, n2);
                break;
            }
            case 69: {
                h.bD(n, n2);
                break;
            }
            case 70: {
                h.bF(n, n2);
                break;
            }
            case 71: {
                h.bH(n, n2);
                break;
            }
            case 75: {
                h.bJ(n, n2);
                break;
            }
            case 76: {
                h.bL(n, n2);
                break;
            }
            case 77: {
                h.bN(n, n2);
                break;
            }
            case 78: {
                h.bP(n, n2);
            }
        }
    }

    static void bS(int n, int n2) {
        switch (h.q()) {
            case 26: {
                h.bw(n, n2);
                break;
            }
            case 27: {
                h.by(n, n2);
                break;
            }
            case 53: {
                h.bA(n, n2);
                break;
            }
            case 54: {
                h.bC(n, n2);
                break;
            }
            case 69: {
                h.bE(n, n2);
                break;
            }
            case 70: {
                h.bG(n, n2);
                break;
            }
            case 71: {
                h.bI(n, n2);
                break;
            }
            case 75: {
                h.bK(n, n2);
                break;
            }
            case 76: {
                h.bM(n, n2);
                break;
            }
            case 77: {
                h.bO(n, n2);
                break;
            }
            case 78: {
                h.bQ(n, n2);
            }
        }
    }

    static void nT(int n) {
        switch (h.q()) {
            case 26: {
                h.ly(n);
                break;
            }
            case 27: {
                h.lJ(n);
                break;
            }
            case 53: {
                h.lU(n);
                break;
            }
            case 54: {
                h.mf(n);
                break;
            }
            case 69: {
                h.mq(n);
                break;
            }
            case 70: {
                h.mB(n);
                break;
            }
            case 71: {
                h.mM(n);
                break;
            }
            case 75: {
                h.mX(n);
                break;
            }
            case 76: {
                h.ni(n);
                break;
            }
            case 77: {
                h.nt(n);
                break;
            }
            case 78: {
                h.nE(n);
            }
        }
    }

    static void an(boolean bl) {
        switch (h.q()) {
            case 26: {
                h.ac(bl);
                break;
            }
            case 27: {
                h.ad(bl);
                break;
            }
            case 53: {
                h.ae(bl);
                break;
            }
            case 54: {
                h.af(bl);
                break;
            }
            case 69: {
                h.ag(bl);
                break;
            }
            case 70: {
                h.ah(bl);
                break;
            }
            case 71: {
                h.ai(bl);
                break;
            }
            case 75: {
                h.aj(bl);
                break;
            }
            case 76: {
                h.ak(bl);
                break;
            }
            case 77: {
                h.al(bl);
                break;
            }
            case 78: {
                h.am(bl);
            }
        }
    }

    static void gD() {
        switch (h.q()) {
            case 26: {
                h.fs();
                break;
            }
            case 27: {
                h.fy();
                break;
            }
            case 53: {
                h.fE();
                break;
            }
            case 54: {
                h.fK();
                break;
            }
            case 69: {
                h.fQ();
                break;
            }
            case 70: {
                h.fW();
                break;
            }
            case 71: {
                h.gc();
                break;
            }
            case 75: {
                h.gi();
                break;
            }
            case 76: {
                h.go();
                break;
            }
            case 77: {
                h.gu();
                break;
            }
            case 78: {
                h.gA();
            }
        }
    }

    static void nU(int n) {
        switch (h.q()) {
            case 26: {
                h.lz(n);
                break;
            }
            case 27: {
                h.lK(n);
                break;
            }
            case 53: {
                h.lV(n);
                break;
            }
            case 54: {
                h.mg(n);
                break;
            }
            case 69: {
                h.mr(n);
                break;
            }
            case 70: {
                h.mC(n);
                break;
            }
            case 71: {
                h.mN(n);
                break;
            }
            case 75: {
                h.mY(n);
                break;
            }
            case 76: {
                h.nj(n);
                break;
            }
            case 77: {
                h.nu(n);
                break;
            }
            case 78: {
                h.nF(n);
            }
        }
    }

    static void gE() {
        switch (h.q()) {
            case 26: {
                h.ft();
                break;
            }
            case 27: {
                h.fz();
                break;
            }
            case 53: {
                h.fF();
                break;
            }
            case 54: {
                h.fL();
                break;
            }
            case 69: {
                h.fR();
                break;
            }
            case 70: {
                h.fX();
                break;
            }
            case 71: {
                h.gd();
                break;
            }
            case 75: {
                h.gj();
                break;
            }
            case 76: {
                h.gp();
                break;
            }
            case 77: {
                h.gv();
                break;
            }
            case 78: {
                h.gB();
            }
        }
    }

    static void gF() {
        h.d(38, false);
        h.d(39, false);
        h.d(43, false);
        h.dm(38, 13);
        h.dm(39, 16);
        h.dm(43, 9);
    }

    static void gG() {
        if (!h.wc(28)) {
            bE = h.lS();
            if (bE != null) {
                if (h.dl(h.bE.c, 256)) {
                    h.d(38, true);
                    h.dj(38, 4096);
                    h.dj(42, 2048);
                    h.dp(1, 2000);
                } else {
                    h.f(28, true);
                }
            } else {
                bE = h.vV(43);
                h.f(28, true);
            }
        }
    }

    static void gH() {
        h.wd(29);
        h.dk(42, 2048);
    }

    static void gI() {
        h.aZ(false);
        h.dk(43, 4);
        h.dk(41, 2048);
        h.dk(42, 2048);
        if (!h.dl(0, 2)) {
            h.c(0, 2955, 159, 2500);
        }
    }

    static void nV(int n) {
        if (h.dl(42, 2048) && bE != null && h.lS() == bE && h.l(42, h.bE.c, 35)) {
            h.wq(h.bE.c);
            h.dq(0, 500);
            h.dk(42, 2048);
        }
        if (h.dl(41, 2048) && bE != null && h.lS() == bE && h.l(41, h.bE.c, 35)) {
            h.wq(h.bE.c);
            h.dk(41, 2048);
            h.dq(1, 1000);
        }
    }

    static void nW(int n) {
    }

    static void nX(int n) {
    }

    static void nY(int n) {
    }

    static void nZ(int n) {
        if (h.dl(n, 256)) {
            h.dk(n, 4);
        }
    }

    static void oa(int n) {
        if (h.dl(n, 256)) {
            h.dj(n, 4);
        }
    }

    static void ob(int n) {
    }

    static void oc(int n) {
    }

    static void od(int n) {
        if (n == 1) {
            h.wf(57);
        }
    }

    static void bT(int n, int n2) {
        block0 : switch (n) {
            case 0: {
                switch (n2) {
                    case 0: {
                        h.wf(64);
                        break;
                    }
                    case 500: {
                        h.m(38, h.bE.c, 15);
                        break;
                    }
                    case 1000: {
                        h.d(38, false);
                        h.d(43, true);
                        h.dj(43, 12288);
                        h.dj(39, 4096);
                        h.dj(41, 2048);
                        h.vZ(0);
                    }
                }
                break;
            }
            case 1: {
                switch (n2) {
                    case 0: {
                        h.ba(true);
                        h.dr(45, 200);
                        h.d(39, true);
                        h.m(39, 44, 15);
                        break block0;
                    }
                    case 4000: {
                        h.wf(65);
                        break block0;
                    }
                    case 5000: {
                        h.m(39, 43, 15);
                        break block0;
                    }
                    case 7000: {
                        h.d(39, false);
                        h.ba(false);
                        h.lP();
                        h.we(28);
                        h.vZ(1);
                    }
                }
            }
        }
    }

    static void bU(int n, int n2) {
    }

    static void oe(int n) {
        if (n == 0 || n == h.bE.c) {
            h.f(28, true);
        }
    }

    static void ao(boolean bl) {
    }

    static void gJ() {
    }

    static void of(int n) {
    }

    static void gK() {
    }

    static void gL() {
    }

    static void gM() {
        if (!h.wc(29)) {
            bF = h.lS();
            if (bF != null) {
                if (h.dl(h.bF.c, 256)) {
                    h.aY(false);
                    h.dp(1, 2000);
                    h.dj(43, 4);
                } else {
                    h.f(29, true);
                }
            } else {
                bF = h.vV(43);
                h.f(29, true);
            }
        }
    }

    static void gN() {
    }

    static void gO() {
        h.aZ(false);
        h.d(43, false);
        h.aY(true);
        h.wf(67);
        h.dj(30, 2048);
        h.dj(29, 2048);
        h.dj(27, 2048);
        h.dj(28, 2048);
        if (bF != null) {
            h.dk(h.bF.c, 256);
        }
        if (!h.dl(0, 2)) {
            h.c(0, 2955, 159, 2500);
        }
    }

    static void og(int n) {
        if (h.l(43, 28, 35)) {
            h.o(3, 2194, 46);
        }
        if (!h.l(43, 0, 600) && h.dl(43, 4)) {
            h.dk(43, 4);
            h.wf(66);
            h.f(29, true);
        }
    }

    static void oh(int n) {
    }

    static void oi(int n) {
    }

    static void oj(int n) {
    }

    static void ok(int n) {
        if (h.dl(n, 4)) {
            h.dk(n, 4);
        }
    }

    static void ol(int n) {
        if (h.dl(n, 256)) {
            h.dj(n, 4);
        }
    }

    static void om(int n) {
    }

    static void on(int n) {
    }

    static void oo(int n) {
        if (1 == n) {
            h.dD(43, 0xA00000);
        }
    }

    static void bV(int n, int n2) {
    }

    static void bW(int n, int n2) {
    }

    static void op(int n) {
        if (n == 0 || n == h.bF.c) {
            h.dk(43, 4);
            h.f(29, true);
        }
    }

    static void ap(boolean bl) {
    }

    static void gP() {
    }

    static void oq(int n) {
    }

    static void gQ() {
    }

    static void gR() {
    }

    static void gS() {
        if (!h.wc(67)) {
            bG = h.lS();
            if (bG == null) {
                h.f(67, true);
                bG = h.vV(43);
            } else if (h.dl(h.bG.c, 256)) {
                h.dp(1, 1500);
                h.n(46, 1675, 2890);
                h.dj(46, 4096);
                h.vV(46).q(0);
                h.n(49, 1728, 2889);
                h.dj(49, 4096);
                h.vV(49).q(0);
                h.dj(61, 2048);
            } else {
                h.f(67, true);
            }
        }
    }

    static void gT() {
        h.wd(68);
    }

    static void gU() {
        h.aZ(false);
        if (bG != null) {
            h.dk(h.bG.c, 260);
        }
        h.dj(30, 2048);
        h.dj(29, 2048);
        h.dj(27, 2048);
        h.dj(28, 2048);
    }

    static void or(int n) {
        if (bG != null && h.l(h.bG.c, 61, 35)) {
            h.wq(h.bG.c);
            h.dq(0, 500);
        }
    }

    static void os(int n) {
    }

    static void ot(int n) {
    }

    static void ou(int n) {
    }

    static void ov(int n) {
        if (n == h.bG.c) {
            h.dk(h.bG.c, 4);
        }
    }

    static void ow(int n) {
        if (n == h.bG.c) {
            h.dj(h.bG.c, 4);
        }
    }

    static void ox(int n) {
    }

    static void oy(int n) {
    }

    static void oz(int n) {
        if (n == 1) {
            h.wf(129);
        }
    }

    static void bX(int n, int n2) {
        block0 : switch (n) {
            case 0: {
                switch (n2) {
                    case 0: {
                        h.dk(61, 2048);
                        h.wf(136);
                        break block0;
                    }
                    case 500: {
                        h.m(46, h.bG.c, 15);
                        h.m(49, h.bG.c, 15);
                        break block0;
                    }
                    case 1500: {
                        h.d(46, false);
                        h.d(49, false);
                        h.dy(9, 2);
                        h.wo(9);
                        h.we(67);
                        h.vZ(0);
                    }
                }
            }
        }
    }

    static void bY(int n, int n2) {
    }

    static void oA(int n) {
        if (n == h.bG.c || n == 0) {
            h.f(67, true);
        }
    }

    static void aq(boolean bl) {
    }

    static void gV() {
    }

    static void oB(int n) {
    }

    static void gW() {
    }

    static void gX() {
    }

    static void gY() {
        if (!h.wc(68)) {
            bH = h.lS();
            if (bH == null) {
                h.f(68, true);
                bH = h.vV(43);
            } else if (h.dl(h.bH.c, 256)) {
                h.wf(130);
                h.dj(30, 2048);
                h.dj(29, 2048);
            } else {
                h.f(68, true);
            }
        }
    }

    static void gZ() {
        h.dk(30, 2048);
        h.dk(29, 2048);
    }

    static void ha() {
        h.aZ(false);
        if (bH != null) {
            h.dk(h.bH.c, 260);
        }
        h.dj(30, 2048);
        h.dj(29, 2048);
        h.dj(27, 2048);
        h.dj(28, 2048);
    }

    static void oC(int n) {
    }

    static void oD(int n) {
    }

    static void oE(int n) {
    }

    static void oF(int n) {
    }

    static void oG(int n) {
        if (n == h.bH.c) {
            h.dk(h.bH.c, 4);
        }
    }

    static void oH(int n) {
        if (n == h.bH.c) {
            h.dj(h.bH.c, 4);
        }
    }

    static void oI(int n) {
    }

    static void oJ(int n) {
    }

    static void oK(int n) {
    }

    static void bZ(int n, int n2) {
    }

    static void ca(int n, int n2) {
    }

    static void oL(int n) {
        if (n == h.bH.c || n == 0) {
            h.f(68, true);
        }
    }

    static void ar(boolean bl) {
    }

    static void hb() {
    }

    static void oM(int n) {
    }

    static void hc() {
    }

    static void hd() {
        h.vV(46).q(0);
        h.vV(49).q(0);
        h.vV(47).q(0);
        h.vV(48).q(0);
        h.d(46, false);
        h.d(49, false);
        h.d(47, false);
        h.d(48, false);
        h.dj(46, 4096);
        h.dj(49, 4096);
        h.dj(47, 4096);
        h.dj(48, 4096);
        h.vV(56).q(4);
        h.vV(57).q(4);
        h.vV(55).q(4);
        h.vV(54).q(4);
        h.vV(52).q(4);
        h.vV(53).q(4);
        h.d(56, false);
        h.d(57, false);
        h.d(55, false);
        h.d(54, false);
        h.d(52, false);
        h.d(53, false);
        h.d(50, false);
        h.d(51, false);
        h.dm(50, 10);
        h.dm(51, 10);
    }

    static void he() {
        if (!h.wc(79)) {
            bJ = 0;
            h.d(58, true);
            h.dj(58, 2048);
            h.d(46, true);
            h.d(49, true);
            h.d(47, true);
            h.d(48, true);
            h.bb(true);
            h.vX(1);
            h.dp(1, 3000);
        }
    }

    static void hf() {
        h.wd(80);
        h.d(29, true);
        h.d(30, true);
        h.d(28, true);
        h.d(27, true);
        h.aX(true);
        h.wn(15);
    }

    static void hg() {
        h.aZ(false);
        h.d(46, false);
        h.d(49, false);
        h.d(47, false);
        h.d(48, false);
        h.d(56, false);
        h.d(57, false);
        h.d(55, false);
        h.d(54, false);
        h.d(52, false);
        h.d(53, false);
        h.d(50, false);
        h.d(51, false);
        h.d(29, true);
        h.d(30, true);
        h.d(28, true);
        h.d(27, true);
        h.wg(155);
        h.wg(156);
        h.wg(157);
        h.dk(58, 2048);
        h.dk(59, 4);
        h.dk(56, 4);
        h.dk(57, 4);
        h.dk(55, 4);
        h.dk(54, 4);
        h.dk(52, 4);
        h.dk(53, 4);
        h.aX(true);
        if (!h.dl(0, 2)) {
            h.c(4, h.vV((int)0).h, h.vV((int)0).i, 2500);
        }
    }

    static void oN(int n) {
        if (h.dl(58, 2048)) {
            if (h.l(58, 0, 400)) {
                if (h.l(58, 0, 35)) {
                    h.dk(58, 2048);
                    f f2 = h.lS();
                    if (f2 != null) {
                        h.wq(f2.c);
                        h.lR();
                    }
                    h.dq(0, 1000);
                }
                h.aY(false);
            } else {
                h.aY(true);
            }
        }
    }

    static void oO(int n) {
    }

    static void oP(int n) {
    }

    static void oQ(int n) {
    }

    static void oR(int n) {
    }

    static void oS(int n) {
    }

    static void oT(int n) {
    }

    static void oU(int n) {
    }

    static void oV(int n) {
        if (n == 1) {
            h.wf(153);
            h.bb(false);
        }
    }

    static void cb(int n, int n2) {
        if (0 == n) {
            switch (n2) {
                case 0: {
                    h.ba(true);
                    h.d(50, true);
                    h.d(51, true);
                    h.dD(50, 0x320000);
                    h.dD(51, 0x320000);
                    break;
                }
                case 1000: {
                    h.dr(55, 100);
                    break;
                }
                case 5000: {
                    h.d(56, true);
                    h.d(57, true);
                    h.d(55, true);
                    h.d(54, true);
                    h.d(52, true);
                    h.d(53, true);
                    h.dj(56, 4);
                    h.dj(57, 4);
                    h.dj(55, 4);
                    h.dj(54, 4);
                    h.dj(52, 4);
                    h.dj(53, 4);
                    h.dB(56, 0);
                    h.dB(57, 0);
                    h.dB(55, 46);
                    h.dB(54, 49);
                    h.dB(52, 47);
                    h.dB(53, 48);
                    h.dj(50, 8192);
                    h.dj(51, 8192);
                    break;
                }
                case 6000: {
                    h.lP();
                    h.wf(155);
                    h.du(4, 80);
                    h.ba(false);
                    h.dA(46, 8);
                    h.dA(49, 8);
                    h.dA(47, 8);
                    h.dA(48, 8);
                    h.dk(46, 4096);
                    h.dk(49, 4096);
                    h.dk(47, 4096);
                    h.dk(48, 4096);
                    h.dC(46, 0);
                    h.dC(49, 46);
                    h.dC(47, 49);
                    h.dC(48, 47);
                    h.aX(false);
                    h.d(29, false);
                    h.d(30, false);
                    h.d(28, false);
                    h.d(27, false);
                    h.vZ(0);
                }
            }
        }
        if (1 == n) {
            switch (n2) {
                case 2000: {
                    h.wf(156);
                    break;
                }
                case 3000: {
                    h.we(79);
                    h.vZ(1);
                }
            }
        }
    }

    static void cc(int n, int n2) {
    }

    static void oW(int n) {
        switch (n) {
            case 52: 
            case 53: 
            case 54: 
            case 55: 
            case 56: 
            case 57: {
                h.dk(n, 4);
                if (++bJ != 6) break;
                h.aY(true);
                h.dq(1, 1000);
                h.wp(48);
                h.wp(47);
                h.wp(49);
                h.wp(46);
            }
        }
        if (n == 0) {
            h.f(79, true);
        }
    }

    static void as(boolean bl) {
    }

    static void hh() {
    }

    static void oX(int n) {
    }

    static void hi() {
    }

    static void hj() {
        h.d(59, false);
    }

    static void hk() {
        if (!h.wc(80)) {
            h.wf(154);
            h.dm(59, 3);
            h.d(59, true);
            h.dj(59, 65540);
        }
    }

    static void hl() {
        h.wd(81);
    }

    static void hm() {
        h.aZ(false);
        h.wg(155);
        h.wg(156);
        h.wg(157);
        h.dk(58, 2048);
        h.dk(59, 4);
        if (!h.dl(0, 2)) {
            h.c(4, h.vV((int)0).h, h.vV((int)0).i, 2500);
        }
    }

    static void oY(int n) {
    }

    static void oZ(int n) {
    }

    static void pa(int n) {
    }

    static void pb(int n) {
    }

    static void pc(int n) {
        if (n == 59 && h.dl(59, 4)) {
            h.dk(59, 4);
            h.dj(59, 256);
            h.dy(12, 10);
            h.wo(12);
            h.wf(157);
            h.we(80);
        }
    }

    static void pd(int n) {
    }

    static void pe(int n) {
    }

    static void pf(int n) {
    }

    static void pg(int n) {
    }

    static void cd(int n, int n2) {
    }

    static void ce(int n, int n2) {
    }

    static void ph(int n) {
        if (n == 0 || n == 59) {
            h.f(80, true);
        }
    }

    static void at(boolean bl) {
    }

    static void hn() {
    }

    static void pi(int n) {
    }

    static void ho() {
    }

    static void hp() {
    }

    static void hq() {
        if (!h.wc(81)) {
            h.wf(158);
            h.dj(44, 2048);
            bK = h.lS();
            if (bK != null) {
                if (!h.dl(h.bK.c, 256)) {
                    h.f(81, true);
                }
            } else {
                h.f(81, true);
            }
        }
    }

    static void hr() {
        h.wd(82);
        h.aX(true);
        h.dk(44, 2048);
    }

    static void hs() {
        h.aZ(false);
        h.aX(true);
        h.dk(44, 2048);
        if (!h.dl(0, 2)) {
            h.c(4, h.vV((int)0).h, h.vV((int)0).i, 2500);
        }
    }

    static void pj(int n) {
        if (h.dl(62, 2048) && h.l(62, 0, 35) && h.lS() == null) {
            h.dk(62, 2048);
            h.we(81);
        }
        if (h.dl(44, 2048) && bK != null && h.l(44, h.bK.c, 35)) {
            h.dk(44, 2048);
            h.lR();
            h.dk(h.bK.c, 4);
            h.dj(h.bK.c, 12288);
            h.dj(62, 2048);
        }
    }

    static void pk(int n) {
    }

    static void pl(int n) {
    }

    static void pm(int n) {
    }

    static void pn(int n) {
        if (h.dl(n, 256)) {
            h.dk(n, 4);
            h.dj(44, 2048);
        }
    }

    static void po(int n) {
        if (h.dl(n, 256)) {
            h.dk(44, 2048);
            h.dj(n, 4);
        }
    }

    static void pp(int n) {
    }

    static void pq(int n) {
    }

    static void pr(int n) {
    }

    static void cf(int n, int n2) {
    }

    static void cg(int n, int n2) {
    }

    static void ps(int n) {
        if (n == 0 || bK != null && n == h.bK.c) {
            h.f(81, true);
        }
    }

    static void au(boolean bl) {
    }

    static void ht() {
    }

    static void pt(int n) {
    }

    static void hu() {
    }

    static void hv() {
        h.d(68, false);
        h.d(69, false);
        h.d(74, false);
        h.d(76, false);
        h.d(75, false);
        h.vV(74).q(4);
        h.vV(76).q(4);
        h.vV(75).q(4);
        h.d(65, false);
        h.d(71, false);
        h.dm(65, 10);
        h.dm(71, 10);
        h.d(91, false);
    }

    static void hw() {
        if (!h.wc(82)) {
            h.dq(0, 1000);
        }
    }

    static void hx() {
        h.wd(83);
        h.d(68, false);
        h.d(69, false);
        h.d(74, false);
        h.d(76, false);
        h.d(75, false);
        h.aX(true);
        h.d(65, false);
        h.d(71, false);
        h.dk(44, 2048);
    }

    static void hy() {
        h.aZ(false);
        h.d(68, false);
        h.d(69, false);
        h.d(74, false);
        h.d(76, false);
        h.d(75, false);
        h.aX(true);
        h.d(65, false);
        h.d(71, false);
        h.dk(44, 2048);
        if (!h.dl(0, 2)) {
            h.c(4, h.vV((int)0).h, h.vV((int)0).i, 2500);
        }
    }

    static void pu(int n) {
    }

    static void pv(int n) {
    }

    static void pw(int n) {
    }

    static void px(int n) {
    }

    static void py(int n) {
    }

    static void pz(int n) {
    }

    static void pA(int n) {
    }

    static void pB(int n) {
    }

    static void pC(int n) {
    }

    static void ch(int n, int n2) {
        if (0 == n) {
            switch (n2) {
                case 0: {
                    h.ba(true);
                    h.aY(false);
                    break;
                }
                case 1000: {
                    h.d(74, true);
                    h.d(76, true);
                    h.d(75, true);
                    h.dA(74, 4);
                    h.dA(76, 4);
                    h.dA(75, 4);
                    h.dj(0, 256);
                    h.dr(44, 150);
                    h.k(59, 508, 307);
                    break;
                }
                case 3000: {
                    h.a("DialogStart!");
                    h.wf(159);
                    h.a("DialogEND!");
                    h.k(0, 514, 475);
                    h.wo(12);
                    break;
                }
                case 5000: {
                    h.ba(false);
                    h.wl(9);
                    h.du(4, 80);
                    h.dq(1, 1000);
                    break;
                }
                case 10000: {
                    h.dq(2, 1000);
                    break;
                }
                case 65000: {
                    h.a("CLEAR!!!!!");
                    h.dk(0, 256);
                    break;
                }
                case 75000: {
                    h.wl(-1);
                    h.dq(4, 1000);
                    h.vZ(0);
                }
            }
        }
        if (1 == n) {
            switch (n2) {
                case 2000: {
                    h.a("Starttread 1!");
                    h.n(68, 339, 307);
                    h.vV(68).q(4);
                    h.dA(68, 4);
                    h.du(4, 80);
                    h.m(68, 70, 15);
                    break;
                }
                case 6000: {
                    h.vZ(1);
                }
            }
        }
        if (2 == n) {
            switch (n2) {
                case 2000: {
                    h.a("Starttread 2!");
                    h.n(69, 679, 307);
                    h.vV(69).q(4);
                    h.dA(69, 4);
                    h.du(4, 80);
                    h.m(69, 64, 15);
                    break;
                }
                case 6000: {
                    h.vZ(2);
                }
            }
        }
        if (4 == n) {
            switch (n2) {
                case 0: {
                    h.ba(true);
                    h.dr(39, 100);
                    h.dm(39, 17);
                    h.d(39, true);
                    h.k(39, 430, 175);
                    h.m(39, 59, 15);
                    h.d(91, true);
                    h.dn(91, 180);
                    break;
                }
                case 2000: {
                    h.wf(161);
                    break;
                }
                case 3000: {
                    h.d(65, true);
                    h.d(71, true);
                    h.dD(65, 0x780000);
                    h.dD(71, 0x780000);
                    h.d(39, false);
                    h.k(0, 456, 666);
                    break;
                }
                case 5000: {
                    h.dr(0, 100);
                    break;
                }
                case 7000: {
                    h.wf(160);
                    h.lP();
                    h.ba(false);
                    h.aY(true);
                    h.we(82);
                    h.vZ(4);
                }
            }
        }
    }

    static void ci(int n, int n2) {
    }

    static void pD(int n) {
        if (n == 0) {
            h.wl(-1);
            h.f(82, true);
        }
        if (h.dl(0, 256) && n == 69) {
            h.a("RE Starttread 2!");
            h.vZ(2);
            h.dq(2, 1000);
        }
        if (h.dl(0, 256) && n == 68) {
            h.a("RE Starttread 1!");
            h.vZ(1);
            h.dq(1, 1000);
        }
    }

    static void av(boolean bl) {
    }

    static void hz() {
    }

    static void pE(int n) {
    }

    static void hA() {
    }

    static void hB() {
        h.d(91, false);
    }

    static void hC() {
        if (!h.wc(83)) {
            h.dj(91, 4);
        }
    }

    static void hD() {
        h.wd(84);
    }

    static void hE() {
        h.aZ(false);
        if (!h.dl(0, 2)) {
            h.c(4, h.vV((int)0).h, h.vV((int)0).i, 2500);
        }
    }

    static void pF(int n) {
    }

    static void pG(int n) {
    }

    static void pH(int n) {
    }

    static void pI(int n) {
    }

    static void pJ(int n) {
        if (n == 91 && h.dl(91, 4)) {
            h.dk(91, 4);
            h.we(83);
        }
    }

    static void pK(int n) {
    }

    static void pL(int n) {
    }

    static void pM(int n) {
    }

    static void pN(int n) {
    }

    static void cj(int n, int n2) {
    }

    static void ck(int n, int n2) {
    }

    static void pO(int n) {
        if (n == 0 || n == 91) {
            h.f(83, true);
        }
    }

    static void aw(boolean bl) {
    }

    static void hF() {
    }

    static void pP(int n) {
    }

    static void hG() {
    }

    static void hH() {
        h.d(72, false);
        h.d(73, false);
    }

    static void hI() {
        h.dj(0, 256);
        if (!h.wc(84)) {
            h.dj(81, 2048);
            h.dm(72, 10);
            h.dm(73, 10);
            h.d(72, true);
            h.d(73, true);
            h.d(28, false);
            h.dB(72, 0);
            h.dB(73, 0);
            h.dj(72, 4096);
            h.dj(73, 4096);
            h.n(46, 2448, 1963);
            h.n(49, 2478, 1987);
            h.n(47, 2442, 2118);
            h.n(48, 2478, 2100);
            h.vV(46).q(0);
            h.vV(49).q(0);
            h.vV(47).q(0);
            h.vV(48).q(0);
            h.dA(46, 10);
            h.dA(49, 10);
            h.dA(47, 10);
            h.dA(48, 10);
            h.wf(162);
            bM = h.lS();
            if (bM == null) {
                h.f(84, true);
            }
        }
    }

    static void hJ() {
        h.wd(85);
    }

    static void hK() {
        h.aZ(false);
        h.d(28, true);
        h.aY(true);
        h.dk(81, 2048);
        if (!h.dl(0, 2)) {
            h.c(4, h.vV((int)0).h, h.vV((int)0).i, 2500);
        }
    }

    static void pQ(int n) {
        f f2;
        if (h.l(0, 81, 400)) {
            h.aY(false);
            if (h.dl(0, 256)) {
                f2 = h.lS();
                if (f2 != null) {
                    h.dw(f2.c, -1);
                } else {
                    h.dw(0, -1);
                }
            }
        } else {
            h.aY(true);
        }
        if (h.l(0, 81, 35)) {
            f2 = h.lS();
            if (f2 != null) {
                h.wq(f2.c);
            }
            h.we(84);
        }
    }

    static void pR(int n) {
    }

    static void pS(int n) {
    }

    static void pT(int n) {
    }

    static void pU(int n) {
    }

    static void pV(int n) {
    }

    static void pW(int n) {
    }

    static void pX(int n) {
    }

    static void pY(int n) {
    }

    static void cl(int n, int n2) {
    }

    static void cm(int n, int n2) {
    }

    static void pZ(int n) {
        if (n == 0) {
            h.f(84, true);
        }
    }

    static void ax(boolean bl) {
    }

    static void hL() {
    }

    static void qa(int n) {
    }

    static void hM() {
    }

    static void hN() {
        h.d(82, false);
        h.d(83, false);
        h.d(90, false);
        h.d(94, false);
    }

    static void hO() {
        h.dj(0, 256);
        if (!h.wc(85)) {
            h.dm(82, 10);
            h.dm(83, 10);
            h.dm(90, 10);
            h.dq(1, 1000);
            bO = 0;
            if (!h.dl(81, 2048)) {
                h.f(85, true);
            } else {
                h.dk(81, 2048);
            }
        }
    }

    static void hP() {
        h.d(28, true);
        h.aY(true);
        h.dv(4, 0);
        h.lQ();
    }

    static void hQ() {
        h.aZ(false);
        h.d(28, true);
        h.aY(true);
        if (!h.dl(0, 2)) {
            h.c(4, h.vV((int)0).h, h.vV((int)0).i, 2500);
        }
    }

    static void qb(int n) {
    }

    static void qc(int n) {
    }

    static void qd(int n) {
    }

    static void qe(int n) {
    }

    static void qf(int n) {
    }

    static void qg(int n) {
    }

    static void qh(int n) {
    }

    static void qi(int n) {
    }

    static void qj(int n) {
    }

    static void cn(int n, int n2) {
        block0 : switch (n) {
            case 1: {
                switch (n2) {
                    case 0: {
                        h.ba(true);
                        h.dk(0, 256);
                        h.d(72, false);
                        h.d(73, false);
                        h.d(82, true);
                        h.d(83, true);
                        h.dD(82, 0x780000);
                        h.dD(83, 0x780000);
                        break;
                    }
                    case 1000: {
                        h.dr(82, 0);
                        h.dr(82, 100);
                        break;
                    }
                    case 8000: {
                        h.lR();
                        h.wf(163);
                        h.dr(0, 100);
                        break;
                    }
                    case 9000: {
                        h.n(56, 2359, 1959);
                        h.n(57, 2400, 1999);
                        h.n(55, 2356, 2029);
                        h.n(54, 2400, 2071);
                        h.n(52, 2352, 2095);
                        h.n(53, 2388, 2121);
                        h.vV(56).q(4);
                        h.vV(57).q(4);
                        h.vV(55).q(4);
                        h.vV(54).q(4);
                        h.vV(52).q(4);
                        h.vV(53).q(4);
                        h.dA(56, 5);
                        h.dA(57, 5);
                        h.dA(55, 5);
                        h.dA(54, 5);
                        h.dA(52, 5);
                        h.dA(53, 5);
                        h.lP();
                        h.ba(false);
                        h.vZ(1);
                    }
                }
                break;
            }
            case 2: {
                switch (n2) {
                    case 0: {
                        h.d(90, true);
                        h.dD(90, 0x780000);
                        break;
                    }
                    case 6000: {
                        h.n(74, 2400, 1999);
                        h.n(76, 2356, 2029);
                        h.n(75, 2400, 2071);
                        h.vV(74).q(4);
                        h.vV(76).q(4);
                        h.vV(75).q(4);
                        h.dA(74, 5);
                        h.dA(76, 5);
                        h.dA(75, 5);
                        h.vZ(2);
                    }
                }
                break;
            }
            case 3: {
                switch (n2) {
                    case 0: {
                        h.ba(true);
                        h.n(39, 2280, 1701);
                        h.dm(39, 17);
                        h.d(94, true);
                        h.dm(94, 3);
                        h.dn(94, 135);
                        break block0;
                    }
                    case 1000: {
                        h.dr(39, 150);
                        break block0;
                    }
                    case 3000: {
                        h.wf(164);
                        break block0;
                    }
                    case 4000: {
                        h.m(39, 94, 15);
                        break block0;
                    }
                    case 5000: {
                        h.dr(94, 150);
                        h.d(39, false);
                        h.dD(94, 0x780000);
                        break block0;
                    }
                    case 12000: {
                        h.wf(165);
                        break block0;
                    }
                    case 13000: {
                        h.do(94, 1000);
                        break block0;
                    }
                    case 15000: {
                        h.wf(166);
                        break block0;
                    }
                    case 16000: {
                        h.lP();
                        h.ba(false);
                        h.aZ(true);
                        h.we(85);
                        h.vZ(3);
                    }
                }
            }
        }
    }

    static void co(int n, int n2) {
    }

    static void qk(int n) {
        if (n == 0) {
            h.f(85, true);
        }
        switch (n) {
            case 52: 
            case 53: 
            case 54: 
            case 55: 
            case 56: 
            case 57: 
            case 74: 
            case 75: 
            case 76: {
                h.dk(n, 4);
                if (++bO == 6) {
                    h.dq(2, 1000);
                }
                if (bO != 9) break;
                h.dq(3, 1000);
            }
        }
    }

    static void ay(boolean bl) {
    }

    static void hR() {
    }

    static void ql(int n) {
    }

    static void hS() {
    }

    static void hT() {
        if (h.wb(0) && !h.wc(0)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
            h.dj(27, 2048);
            h.dj(28, 2048);
            h.be(false);
            h.bd(false);
            h.bc(false);
            h.aX(false);
        }
        if (h.wb(1) && !h.wc(1)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(2) && !h.wc(2)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (!h.wb(3) || !h.wc(3)) {
            // empty if block
        }
        if (!h.wb(4) || !h.wc(4)) {
            // empty if block
        }
        if (h.wb(6) && !h.wc(6)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(7) && !h.wc(7)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(8) && !h.wc(8)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(9) && !h.wc(9)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(11) && !h.wc(11)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (!h.wb(12) || !h.wc(12)) {
            // empty if block
        }
        if (!h.wb(13) || !h.wc(13)) {
            // empty if block
        }
        if (!h.wb(14) || !h.wc(14)) {
            // empty if block
        }
        if (!h.wb(15) || !h.wc(15)) {
            // empty if block
        }
        if (!h.wb(16) || !h.wc(16)) {
            // empty if block
        }
        if (!h.wb(17) || !h.wc(17)) {
            // empty if block
        }
        if (!h.wb(18) || !h.wc(18)) {
            // empty if block
        }
        if (h.wb(19) && !h.wc(19)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (!h.wb(20) || !h.wc(20)) {
            // empty if block
        }
        if (!h.wb(21) || !h.wc(21)) {
            // empty if block
        }
        if (!h.wb(22) || !h.wc(22)) {
            // empty if block
        }
        if (h.wb(23) && !h.wc(23)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(24) && !h.wc(24)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(25) && !h.wc(25)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
        }
        if (h.wb(26) && !h.wc(26)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
        }
        if (h.wb(27) && !h.wc(27)) {
            h.we(27);
            h.wd(28);
        }
        if (!h.wb(28) || !h.wc(28)) {
            // empty if block
        }
        if (!h.wb(29) || !h.wc(29)) {
            // empty if block
        }
        if (!h.wb(30) || !h.wc(30)) {
            // empty if block
        }
        if (!h.wb(31) || !h.wc(31)) {
            // empty if block
        }
        if (h.wb(32) && !h.wc(32)) {
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(33) && !h.wc(33)) {
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(35) && !h.wc(35)) {
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(36) && !h.wc(36)) {
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(37) && !h.wc(37)) {
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(38) && !h.wc(38)) {
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(39) && !h.wc(39)) {
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(40) && !h.wc(40)) {
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(41) && !h.wc(41)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (!h.wb(42) || !h.wc(42)) {
            // empty if block
        }
        if (!h.wb(43) || !h.wc(43)) {
            // empty if block
        }
        if (h.wb(44) && !h.wc(44)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(46) && !h.wc(46)) {
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(47) && !h.wc(47)) {
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(48) && !h.wc(48)) {
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(49) && !h.wc(49)) {
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(50) && !h.wc(50)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (!h.wb(51) || !h.wc(51)) {
            // empty if block
        }
        if (h.wb(52) && !h.wc(52)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
        }
        if (h.wb(53) && !h.wc(53)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
        }
        if (h.wb(54) && !h.wc(54)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (!h.wb(55) || !h.wc(55)) {
            // empty if block
        }
        if (h.wb(56) && !h.wc(56)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(57) && !h.wc(57)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (!h.wb(58) || !h.wc(58)) {
            // empty if block
        }
        if (!h.wb(60) || !h.wc(60)) {
            // empty if block
        }
        if (h.wb(61) && !h.wc(61)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (!h.wb(63) || !h.wc(63)) {
            // empty if block
        }
        if (h.wb(64) && !h.wc(64)) {
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(65) && !h.wc(65)) {
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (h.wb(66) && !h.wc(66)) {
            h.we(66);
            h.wd(67);
        }
        if (!h.wb(67) || !h.wc(67)) {
            // empty if block
        }
        if (h.wb(68) && !h.wc(68)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
        }
        if (h.wb(69) && !h.wc(69)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
        }
        if (h.wb(70) && !h.wc(70)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
        }
        if (h.wb(71) && !h.wc(71)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
            h.dj(27, 2048);
            h.dj(28, 2048);
        }
        if (!h.wb(72) || !h.wc(72)) {
            // empty if block
        }
        if (h.wb(74) && !h.wc(74)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
        }
        if (h.wb(75) && !h.wc(75)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
        }
        if (h.wb(76) && !h.wc(76)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
        }
        if (h.wb(77) && !h.wc(77)) {
            h.dj(30, 2048);
            h.dj(29, 2048);
        }
        if (h.wb(78) && !h.wc(78)) {
            h.we(78);
            h.wd(79);
        }
        if (!h.wb(79) || !h.wc(79)) {
            // empty if block
        }
        if (!h.wb(81) || !h.wc(81)) {
            // empty if block
        }
        if (!h.wb(84) || !h.wc(84)) {
            // empty if block
        }
    }

    static void qm(int n) {
        switch (h.q()) {
            case 28: {
                h.nV(n);
                break;
            }
            case 29: {
                h.og(n);
                break;
            }
            case 67: {
                h.or(n);
                break;
            }
            case 68: {
                h.oC(n);
                break;
            }
            case 79: {
                h.oN(n);
                break;
            }
            case 80: {
                h.oY(n);
                break;
            }
            case 81: {
                h.pj(n);
                break;
            }
            case 82: {
                h.pu(n);
                break;
            }
            case 83: {
                h.pF(n);
                break;
            }
            case 84: {
                h.pQ(n);
                break;
            }
            case 85: {
                h.qb(n);
            }
        }
    }

    static void qn(int n) {
        switch (n) {
            case 28: {
                h.gF();
                break;
            }
            case 29: {
                h.gL();
                break;
            }
            case 67: {
                h.gR();
                break;
            }
            case 68: {
                h.gX();
                break;
            }
            case 79: {
                h.hd();
                break;
            }
            case 80: {
                h.hj();
                break;
            }
            case 81: {
                h.hp();
                break;
            }
            case 82: {
                h.hv();
                break;
            }
            case 83: {
                h.hB();
                break;
            }
            case 84: {
                h.hH();
                break;
            }
            case 85: {
                h.hN();
            }
        }
    }

    static void qo(int n) {
        switch (n) {
            case 28: {
                h.gG();
                break;
            }
            case 29: {
                h.gM();
                break;
            }
            case 67: {
                h.gS();
                break;
            }
            case 68: {
                h.gY();
                break;
            }
            case 79: {
                h.he();
                break;
            }
            case 80: {
                h.hk();
                break;
            }
            case 81: {
                h.hq();
                break;
            }
            case 82: {
                h.hw();
                break;
            }
            case 83: {
                h.hC();
                break;
            }
            case 84: {
                h.hI();
                break;
            }
            case 85: {
                h.hO();
            }
        }
    }

    static void qp(int n) {
        switch (n) {
            case 28: {
                h.gH();
                break;
            }
            case 29: {
                h.gN();
                break;
            }
            case 67: {
                h.gT();
                break;
            }
            case 68: {
                h.gZ();
                break;
            }
            case 79: {
                h.hf();
                break;
            }
            case 80: {
                h.hl();
                break;
            }
            case 81: {
                h.hr();
                break;
            }
            case 82: {
                h.hx();
                break;
            }
            case 83: {
                h.hD();
                break;
            }
            case 84: {
                h.hJ();
                break;
            }
            case 85: {
                h.hP();
            }
        }
    }

    static void qq(int n) {
        switch (n) {
            case 28: {
                h.gI();
                break;
            }
            case 29: {
                h.gO();
                break;
            }
            case 67: {
                h.gU();
                break;
            }
            case 68: {
                h.ha();
                break;
            }
            case 79: {
                h.hg();
                break;
            }
            case 80: {
                h.hm();
                break;
            }
            case 81: {
                h.hs();
                break;
            }
            case 82: {
                h.hy();
                break;
            }
            case 83: {
                h.hE();
                break;
            }
            case 84: {
                h.hK();
                break;
            }
            case 85: {
                h.hQ();
            }
        }
    }

    static void qr(int n) {
        switch (h.q()) {
            case 28: {
                h.nW(n);
                break;
            }
            case 29: {
                h.oh(n);
                break;
            }
            case 67: {
                h.os(n);
                break;
            }
            case 68: {
                h.oD(n);
                break;
            }
            case 79: {
                h.oO(n);
                break;
            }
            case 80: {
                h.oZ(n);
                break;
            }
            case 81: {
                h.pk(n);
                break;
            }
            case 82: {
                h.pv(n);
                break;
            }
            case 83: {
                h.pG(n);
                break;
            }
            case 84: {
                h.pR(n);
                break;
            }
            case 85: {
                h.qc(n);
            }
        }
    }

    static void qs(int n) {
        switch (h.q()) {
            case 28: {
                h.nX(n);
                break;
            }
            case 29: {
                h.oi(n);
                break;
            }
            case 67: {
                h.ot(n);
                break;
            }
            case 68: {
                h.oE(n);
                break;
            }
            case 79: {
                h.oP(n);
                break;
            }
            case 80: {
                h.pa(n);
                break;
            }
            case 81: {
                h.pl(n);
                break;
            }
            case 82: {
                h.pw(n);
                break;
            }
            case 83: {
                h.pH(n);
                break;
            }
            case 84: {
                h.pS(n);
                break;
            }
            case 85: {
                h.qd(n);
            }
        }
    }

    static void qt(int n) {
        switch (h.q()) {
            case 28: {
                h.nY(n);
                break;
            }
            case 29: {
                h.oj(n);
                break;
            }
            case 67: {
                h.ou(n);
                break;
            }
            case 68: {
                h.oF(n);
                break;
            }
            case 79: {
                h.oQ(n);
                break;
            }
            case 80: {
                h.pb(n);
                break;
            }
            case 81: {
                h.pm(n);
                break;
            }
            case 82: {
                h.px(n);
                break;
            }
            case 83: {
                h.pI(n);
                break;
            }
            case 84: {
                h.pT(n);
                break;
            }
            case 85: {
                h.qe(n);
            }
        }
    }

    static void qu(int n) {
        switch (h.q()) {
            case 28: {
                h.nZ(n);
                break;
            }
            case 29: {
                h.ok(n);
                break;
            }
            case 67: {
                h.ov(n);
                break;
            }
            case 68: {
                h.oG(n);
                break;
            }
            case 79: {
                h.oR(n);
                break;
            }
            case 80: {
                h.pc(n);
                break;
            }
            case 81: {
                h.pn(n);
                break;
            }
            case 82: {
                h.py(n);
                break;
            }
            case 83: {
                h.pJ(n);
                break;
            }
            case 84: {
                h.pU(n);
                break;
            }
            case 85: {
                h.qf(n);
            }
        }
        h.be(true);
    }

    static void qv(int n) {
        switch (h.q()) {
            case 28: {
                h.oa(n);
                break;
            }
            case 29: {
                h.ol(n);
                break;
            }
            case 67: {
                h.ow(n);
                break;
            }
            case 68: {
                h.oH(n);
                break;
            }
            case 79: {
                h.oS(n);
                break;
            }
            case 80: {
                h.pd(n);
                break;
            }
            case 81: {
                h.po(n);
                break;
            }
            case 82: {
                h.pz(n);
                break;
            }
            case 83: {
                h.pK(n);
                break;
            }
            case 84: {
                h.pV(n);
                break;
            }
            case 85: {
                h.qg(n);
            }
        }
        h.be(false);
    }

    static void qw(int n) {
        switch (h.q()) {
            case 28: {
                h.ob(n);
                break;
            }
            case 29: {
                h.om(n);
                break;
            }
            case 67: {
                h.ox(n);
                break;
            }
            case 68: {
                h.oI(n);
                break;
            }
            case 79: {
                h.oT(n);
                break;
            }
            case 80: {
                h.pe(n);
                break;
            }
            case 81: {
                h.pp(n);
                break;
            }
            case 82: {
                h.pA(n);
                break;
            }
            case 83: {
                h.pL(n);
                break;
            }
            case 84: {
                h.pW(n);
                break;
            }
            case 85: {
                h.qh(n);
            }
        }
    }

    static void qx(int n) {
        switch (h.q()) {
            case 28: {
                h.oc(n);
                break;
            }
            case 29: {
                h.on(n);
                break;
            }
            case 67: {
                h.oy(n);
                break;
            }
            case 68: {
                h.oJ(n);
                break;
            }
            case 79: {
                h.oU(n);
                break;
            }
            case 80: {
                h.pf(n);
                break;
            }
            case 81: {
                h.pq(n);
                break;
            }
            case 82: {
                h.pB(n);
                break;
            }
            case 83: {
                h.pM(n);
                break;
            }
            case 84: {
                h.pX(n);
                break;
            }
            case 85: {
                h.qi(n);
            }
        }
    }

    static void qy(int n) {
        switch (h.q()) {
            case 28: {
                h.od(n);
                break;
            }
            case 29: {
                h.oo(n);
                break;
            }
            case 67: {
                h.oz(n);
                break;
            }
            case 68: {
                h.oK(n);
                break;
            }
            case 79: {
                h.oV(n);
                break;
            }
            case 80: {
                h.pg(n);
                break;
            }
            case 81: {
                h.pr(n);
                break;
            }
            case 82: {
                h.pC(n);
                break;
            }
            case 83: {
                h.pN(n);
                break;
            }
            case 84: {
                h.pY(n);
                break;
            }
            case 85: {
                h.qj(n);
            }
        }
    }

    static void cp(int n, int n2) {
        switch (h.q()) {
            case 28: {
                h.bT(n, n2);
                break;
            }
            case 29: {
                h.bV(n, n2);
                break;
            }
            case 67: {
                h.bX(n, n2);
                break;
            }
            case 68: {
                h.bZ(n, n2);
                break;
            }
            case 79: {
                h.cb(n, n2);
                break;
            }
            case 80: {
                h.cd(n, n2);
                break;
            }
            case 81: {
                h.cf(n, n2);
                break;
            }
            case 82: {
                h.ch(n, n2);
                break;
            }
            case 83: {
                h.cj(n, n2);
                break;
            }
            case 84: {
                h.cl(n, n2);
                break;
            }
            case 85: {
                h.cn(n, n2);
            }
        }
    }

    static void cq(int n, int n2) {
        switch (h.q()) {
            case 28: {
                h.bU(n, n2);
                break;
            }
            case 29: {
                h.bW(n, n2);
                break;
            }
            case 67: {
                h.bY(n, n2);
                break;
            }
            case 68: {
                h.ca(n, n2);
                break;
            }
            case 79: {
                h.cc(n, n2);
                break;
            }
            case 80: {
                h.ce(n, n2);
                break;
            }
            case 81: {
                h.cg(n, n2);
                break;
            }
            case 82: {
                h.ci(n, n2);
                break;
            }
            case 83: {
                h.ck(n, n2);
                break;
            }
            case 84: {
                h.cm(n, n2);
                break;
            }
            case 85: {
                h.co(n, n2);
            }
        }
    }

    static void qz(int n) {
        switch (h.q()) {
            case 28: {
                h.oe(n);
                break;
            }
            case 29: {
                h.op(n);
                break;
            }
            case 67: {
                h.oA(n);
                break;
            }
            case 68: {
                h.oL(n);
                break;
            }
            case 79: {
                h.oW(n);
                break;
            }
            case 80: {
                h.ph(n);
                break;
            }
            case 81: {
                h.ps(n);
                break;
            }
            case 82: {
                h.pD(n);
                break;
            }
            case 83: {
                h.pO(n);
                break;
            }
            case 84: {
                h.pZ(n);
                break;
            }
            case 85: {
                h.qk(n);
            }
        }
    }

    static void az(boolean bl) {
        switch (h.q()) {
            case 28: {
                h.ao(bl);
                break;
            }
            case 29: {
                h.ap(bl);
                break;
            }
            case 67: {
                h.aq(bl);
                break;
            }
            case 68: {
                h.ar(bl);
                break;
            }
            case 79: {
                h.as(bl);
                break;
            }
            case 80: {
                h.at(bl);
                break;
            }
            case 81: {
                h.au(bl);
                break;
            }
            case 82: {
                h.av(bl);
                break;
            }
            case 83: {
                h.aw(bl);
                break;
            }
            case 84: {
                h.ax(bl);
                break;
            }
            case 85: {
                h.ay(bl);
            }
        }
    }

    static void hU() {
        switch (h.q()) {
            case 28: {
                h.gJ();
                break;
            }
            case 29: {
                h.gP();
                break;
            }
            case 67: {
                h.gV();
                break;
            }
            case 68: {
                h.hb();
                break;
            }
            case 79: {
                h.hh();
                break;
            }
            case 80: {
                h.hn();
                break;
            }
            case 81: {
                h.ht();
                break;
            }
            case 82: {
                h.hz();
                break;
            }
            case 83: {
                h.hF();
                break;
            }
            case 84: {
                h.hL();
                break;
            }
            case 85: {
                h.hR();
            }
        }
    }

    static void qA(int n) {
        switch (h.q()) {
            case 28: {
                h.of(n);
                break;
            }
            case 29: {
                h.oq(n);
                break;
            }
            case 67: {
                h.oB(n);
                break;
            }
            case 68: {
                h.oM(n);
                break;
            }
            case 79: {
                h.oX(n);
                break;
            }
            case 80: {
                h.pi(n);
                break;
            }
            case 81: {
                h.pt(n);
                break;
            }
            case 82: {
                h.pE(n);
                break;
            }
            case 83: {
                h.pP(n);
                break;
            }
            case 84: {
                h.qa(n);
                break;
            }
            case 85: {
                h.ql(n);
            }
        }
    }

    static void hV() {
        switch (h.q()) {
            case 28: {
                h.gK();
                break;
            }
            case 29: {
                h.gQ();
                break;
            }
            case 67: {
                h.gW();
                break;
            }
            case 68: {
                h.hc();
                break;
            }
            case 79: {
                h.hi();
                break;
            }
            case 80: {
                h.ho();
                break;
            }
            case 81: {
                h.hu();
                break;
            }
            case 82: {
                h.hA();
                break;
            }
            case 83: {
                h.hG();
                break;
            }
            case 84: {
                h.hM();
                break;
            }
            case 85: {
                h.hS();
            }
        }
    }

    static void hW() {
        h.d(49, false);
        h.d(50, false);
        h.d(51, false);
        h.d(52, false);
        h.d(41, false);
        h.d(40, false);
    }

    static void hX() {
        if (!h.wc(33)) {
            h.dp(1, 2500);
            h.d(40, true);
            h.dj(40, 4096);
            h.vV(40).q(0);
            h.d(41, true);
            h.dj(41, 4096);
            h.vV(41).q(0);
            h.dj(42, 2304);
        }
    }

    static void hY() {
        h.wd(34);
        h.dk(42, 2304);
    }

    static void hZ() {
        h.aZ(false);
        h.dk(42, 2304);
    }

    static void qB(int n) {
        bP = h.lS();
        if (h.dl(42, 2048) && h.dl(42, 256)) {
            if (bP != null) {
                if (h.l(h.bP.c, 42, 35)) {
                    h.wq(h.bP.c);
                    h.dk(42, 2304);
                    if (!h.wa(0)) {
                        h.dq(0, 1000);
                    }
                }
            } else if (h.l(0, 42, 35)) {
                h.dk(42, 2304);
                if (!h.wa(0)) {
                    h.dq(0, 1000);
                }
            }
        }
    }

    static void qC(int n) {
    }

    static void qD(int n) {
    }

    static void qE(int n) {
    }

    static void qF(int n) {
    }

    static void qG(int n) {
    }

    static void qH(int n) {
    }

    static void qI(int n) {
    }

    static void qJ(int n) {
        if (n == 1) {
            h.wf(70);
        }
    }

    static void cr(int n, int n2) {
        if (0 == n) {
            switch (n2) {
                case 0: {
                    h.wf(75);
                    h.we(33);
                    h.vZ(0);
                }
            }
        }
    }

    static void cs(int n, int n2) {
    }

    static void qK(int n) {
    }

    static void aA(boolean bl) {
    }

    static void ia() {
    }

    static void qL(int n) {
    }

    static void ib() {
    }

    static void ic() {
        h.d(43, false);
    }

    static void id() {
        if (!h.wc(34)) {
            h.wf(71);
            h.d(40, true);
            h.dj(40, 4096);
            h.vV(40).q(0);
            h.d(41, true);
            h.dj(41, 4096);
            h.vV(41).q(0);
            h.dj(43, 4100);
            h.d(43, true);
            h.dj(43, 256);
        }
    }

    static void ie() {
        h.wd(35);
        h.dk(43, 4100);
    }

    static void if() {
        h.aZ(false);
        h.dk(43, 4100);
        if (!h.dl(0, 2)) {
            h.o(2, h.vV((int)0).h, h.vV((int)0).i);
        }
    }

    static void qM(int n) {
        if (h.l(43, 42, 35)) {
            h.wq(43);
            h.wf(76);
            h.dk(42, 2048);
            h.dj(43, 256);
            h.m(41, 43, 15);
            h.m(40, 43, 15);
            h.we(34);
        }
    }

    static void qN(int n) {
    }

    static void qO(int n) {
    }

    static void qP(int n) {
    }

    static void qQ(int n) {
        if (n == 43 && h.dl(43, 256)) {
            h.dk(43, 4);
            h.dj(42, 2048);
        }
    }

    static void qR(int n) {
        if (n == 43 && h.dl(43, 256)) {
            h.dj(43, 4);
            h.dk(42, 2048);
        }
    }

    static void qS(int n) {
    }

    static void qT(int n) {
    }

    static void qU(int n) {
    }

    static void ct(int n, int n2) {
    }

    static void cu(int n, int n2) {
    }

    static void qV(int n) {
        if (n == 0 || n == 43) {
            h.f(34, true);
        }
    }

    static void aB(boolean bl) {
    }

    static void ig() {
    }

    static void qW(int n) {
    }

    static void ih() {
    }

    static void ii() {
        h.d(44, false);
        h.d(45, false);
        h.d(46, false);
        h.d(48, false);
        h.d(63, false);
    }

    static void ij() {
        if (!h.wc(35)) {
            h.wf(72);
            h.d(32, false);
            h.d(33, false);
            h.d(35, false);
            h.d(34, false);
            h.d(44, true);
            h.dj(44, 4);
            h.vV(44).q(2);
            h.d(45, true);
            h.dj(45, 4);
            h.vV(45).q(2);
            h.dp(0, 1000);
            bR = h.lS();
            if (bR != null) {
                if (!h.dl(h.bR.c, 256)) {
                    h.f(35, true);
                }
            } else {
                h.f(35, true);
            }
        }
    }

    static void ik() {
        h.wd(36);
        h.dk(63, 2048);
        h.aY(true);
        h.dk(44, 4);
        h.dk(45, 4);
        h.d(63, false);
    }

    static void il() {
        h.aZ(false);
        h.aY(true);
        h.d(44, false);
        h.d(45, false);
        h.dk(44, 4);
        h.dk(45, 4);
        if (!h.dl(0, 2)) {
            h.o(2, h.vV((int)0).h, h.vV((int)0).i);
        }
    }

    static void qX(int n) {
        if (bR != null && h.dl(h.bR.c, 256)) {
            if (h.l(h.bR.c, 44, 400)) {
                h.aY(false);
                h.du(2, 30);
            } else {
                h.aY(true);
                h.du(2, -100);
            }
        }
    }

    static void qY(int n) {
    }

    static void qZ(int n) {
    }

    static void ra(int n) {
    }

    static void rb(int n) {
        if (n == h.bR.c && h.dl(h.bR.c, 256)) {
            h.dk(h.bR.c, 4);
            if (h.dl(63, 2048)) {
                h.d(63, true);
            }
        }
    }

    static void rc(int n) {
        if (n == h.bR.c && h.dl(h.bR.c, 256)) {
            h.dj(h.bR.c, 4);
            h.d(63, false);
        }
    }

    static void rd(int n) {
    }

    static void re(int n) {
        if (n == 63) {
            h.we(35);
        }
    }

    static void rf(int n) {
        if (n == 0) {
            h.d(40, false);
            h.d(41, false);
        }
    }

    static void cv(int n, int n2) {
    }

    static void cw(int n, int n2) {
    }

    static void rg(int n) {
        int n2;
        if (44 == n || 45 == n) {
            h.dk(n, 4);
            int n3 = n2 = 44 == n ? 45 : 44;
            if (h.dl(n2, 2)) {
                h.d(46, true);
                h.vV(46).q(2);
                h.dj(46, 4);
                h.d(48, true);
                h.vV(48).q(2);
                h.dj(48, 4);
            }
        }
        if (46 == n || 48 == n) {
            h.dk(n, 4);
            int n4 = n2 = 46 == n ? 48 : 46;
            if (h.dl(n2, 2)) {
                h.aY(true);
                if (h.lS() == bR) {
                    h.d(63, true);
                }
                h.dj(63, 2048);
                h.a("In this place RobShop-Mini-Game should start");
                h.a("After RobShop-Mini-Game we start dialog");
                h.wf(77);
                h.wf(73);
            }
        }
        if (n == 0 || n == h.bR.c) {
            h.f(35, true);
        }
    }

    static void aC(boolean bl) {
    }

    static void im() {
    }

    static void rh(int n) {
    }

    static void in() {
    }

    static void io() {
    }

    static void ip() {
        if (!h.wc(36)) {
            bS = h.lS();
            if (bS != null) {
                if (h.dl(h.bS.c, 256)) {
                    h.wf(74);
                    h.dj(42, 2048);
                } else {
                    h.f(36, true);
                }
            } else {
                h.f(36, true);
            }
        }
    }

    static void iq() {
        h.wd(37);
        h.wn(3);
        h.wj(150);
        h.dk(43, 4);
        h.d(32, true);
        h.d(33, true);
        h.d(35, true);
        h.d(34, true);
    }

    static void ir() {
        h.aZ(false);
        h.d(44, false);
        h.d(45, false);
        h.dk(44, 4);
        h.dk(45, 4);
        h.dk(43, 4);
        if (!h.dl(0, 2)) {
            h.o(2, h.vV((int)0).h, h.vV((int)0).i);
        }
    }

    static void ri(int n) {
        if (h.dl(42, 2048) && bS != null && h.l(h.bS.c, 42, 35)) {
            h.wq(h.bS.c);
            h.dk(42, 2048);
            if (!h.wa(0)) {
                h.dq(0, 1000);
            }
        }
    }

    static void rj(int n) {
    }

    static void rk(int n) {
    }

    static void rl(int n) {
    }

    static void rm(int n) {
        if (n == 43 && h.dl(43, 256)) {
            h.dk(43, 4);
            h.dj(42, 2048);
            h.d(63, true);
        }
    }

    static void rn(int n) {
        if (n == 43 && h.dl(43, 256)) {
            h.dj(43, 4);
            h.dk(42, 2048);
            h.d(63, false);
        }
    }

    static void ro(int n) {
    }

    static void rp(int n) {
    }

    static void rq(int n) {
    }

    static void cx(int n, int n2) {
        if (0 == n) {
            switch (n2) {
                case 0: {
                    h.ba(true);
                    h.dr(63, 0);
                    break;
                }
                case 1000: {
                    h.d(49, true);
                    h.dm(49, 8);
                    h.dD(49, 0x780000);
                    h.d(50, true);
                    h.dm(50, 8);
                    h.dD(50, 0x780000);
                    break;
                }
                case 3000: {
                    h.d(51, true);
                    h.d(52, true);
                    h.dD(51, 0x780000);
                    h.dD(52, 0x780000);
                    break;
                }
                case 9000: {
                    h.ba(false);
                    h.aZ(true);
                    break;
                }
                case 10000: {
                    h.lP();
                    h.we(36);
                    h.vZ(0);
                }
            }
        }
    }

    static void cy(int n, int n2) {
    }

    static void rr(int n) {
        if (n == 0 || n == h.bS.c) {
            h.f(36, true);
        }
    }

    static void aD(boolean bl) {
    }

    static void is() {
    }

    static void rs(int n) {
    }

    static void it() {
    }

    static void iu() {
        h.d(19, false);
        h.d(9, false);
        h.dj(19, 4096);
    }

    static void iv() {
        if (!h.wc(37)) {
            h.wf(78);
            h.dm(19, 13);
            h.d(19, true);
            h.dm(9, 6);
            h.d(9, true);
            h.dj(9, 12288);
            h.dn(9, 90);
            h.n(40, 2319, 515);
            h.vV(40).q(0);
            h.d(40, true);
            h.dj(40, 4096);
            h.dj(19, 16396);
        }
    }

    static void iw() {
        h.bb(false);
        h.wd(38);
        h.dk(19, 16396);
        h.dk(9, 4100);
    }

    static void ix() {
        h.bb(false);
        h.dk(19, 16396);
    }

    static void rt(int n) {
    }

    static void ru(int n) {
    }

    static void rv(int n) {
    }

    static void rw(int n) {
        if (n == 19) {
            h.dk(19, 12);
            h.wf(80);
            h.dj(9, 260);
            h.dk(9, 8192);
            h.bb(true);
        }
    }

    static void rx(int n) {
        if (n == 9) {
            h.we(37);
        }
    }

    static void ry(int n) {
    }

    static void rz(int n) {
    }

    static void rA(int n) {
    }

    static void rB(int n) {
    }

    static void cz(int n, int n2) {
    }

    static void cA(int n, int n2) {
    }

    static void rC(int n) {
    }

    static void aE(boolean bl) {
    }

    static void iy() {
    }

    static void rD(int n) {
    }

    static void iz() {
    }

    static void iA() {
        h.d(53, false);
        h.d(54, false);
        h.d(55, false);
    }

    static void iB() {
        if (!h.wc(38)) {
            bT = h.lS();
            if (bT == null) {
                h.f(38, true);
                bT = h.vV(9);
            } else if (h.dl(h.bT.c, 256)) {
                h.wf(79);
                h.d(53, true);
                h.dj(53, 2048);
            } else {
                h.f(38, true);
            }
        }
    }

    static void iC() {
        h.wj(200);
        h.wd(39);
        h.wn(7);
        h.dk(53, 2048);
        if (bT != null) {
            h.dk(h.bT.c, 260);
        }
    }

    static void iD() {
        h.aZ(false);
        if (!h.dl(0, 2) && bT != null && h.dl(h.bT.c, 256)) {
            h.c(2, h.vV((int)0).h, h.vV((int)0).i, 3000);
        }
        h.dk(53, 2048);
        if (bT != null) {
            h.dk(h.bT.c, 260);
        }
    }

    static void rE(int n) {
        if (bT != null && h.l(53, h.bT.c, 35) && h.dl(53, 2048)) {
            h.wq(h.bT.c);
            h.dk(53, 2048);
            h.du(5, 30);
            h.d(54, true);
            h.dj(54, 2048);
        }
        if (bT != null && h.l(54, h.bT.c, 35) && h.dl(54, 2048)) {
            h.wq(h.bT.c);
            h.dk(54, 2048);
            h.du(5, 50);
            h.d(55, true);
            h.dj(55, 2048);
        }
        if (bT != null && h.l(55, h.bT.c, 35) && h.dl(55, 2048)) {
            h.wq(h.bT.c);
            h.dk(55, 2048);
            h.du(5, -100);
            h.aZ(true);
            h.we(38);
        }
    }

    static void rF(int n) {
    }

    static void rG(int n) {
    }

    static void rH(int n) {
    }

    static void rI(int n) {
        if (h.dl(n, 4)) {
            h.dk(n, 4);
        }
    }

    static void rJ(int n) {
        if (h.dl(n, 256)) {
            h.dj(n, 4);
        }
    }

    static void rK(int n) {
    }

    static void rL(int n) {
    }

    static void rM(int n) {
    }

    static void cB(int n, int n2) {
    }

    static void cC(int n, int n2) {
    }

    static void rN(int n) {
        if (h.bT.c == n || n == 0) {
            h.f(38, true);
        }
    }

    static void aF(boolean bl) {
    }

    static void iE() {
    }

    static void rO(int n) {
    }

    static void iF() {
    }

    static void iG() {
        h.d(56, false);
        h.d(58, false);
        h.d(60, false);
        h.d(59, false);
        h.d(64, false);
    }

    static void iH() {
        if (!h.wc(39)) {
            h.wf(81);
            h.d(61, true);
            h.d(68, false);
            h.dj(61, 2048);
        }
    }

    static void iI() {
        h.d(56, false);
        h.d(58, false);
        h.d(60, false);
        h.d(59, false);
        h.wd(40);
    }

    static void iJ() {
        h.d(56, false);
        h.d(58, false);
        h.d(60, false);
        h.d(59, false);
        h.aZ(false);
    }

    static void rP(int n) {
        if (h.dl(58, 256) && h.l(58, 62, 35)) {
            h.d(66, true);
            h.dm(66, 6);
            h.a("REACHED!");
            h.dD(66, 0x780000);
            h.dj(66, 256);
            h.dr(66, 200);
            h.dk(58, 256);
        }
        if (h.l(0, 61, 35) && h.dl(61, 2048)) {
            f f2 = h.lS();
            if (f2 != null) {
                h.wq(f2.c);
            }
            h.wf(83);
            h.dk(61, 2048);
            if (!h.wa(0)) {
                h.dq(0, 1000);
            }
        }
        if (h.dl(66, 256) && h.l(47, 66, 50) && h.vV((int)66).o == 0) {
            h.dk(66, 256);
            h.a("We are stop");
            h.d(64, true);
            h.dj(64, 4096);
            h.dm(64, 13);
            h.do(64, 59);
            h.d(67, true);
            h.dp(0, 1000);
        }
        if (h.dl(60, 256) && h.l(58, 67, 35)) {
            h.a("AISHA SHOOTS AT BIKE!");
            h.dB(64, 58);
            h.dk(60, 256);
        }
        if (h.dl(58, 2) && h.l(60, 64, 15)) {
            h.do(64, 60);
        }
    }

    static void rQ(int n) {
    }

    static void rR(int n) {
    }

    static void rS(int n) {
    }

    static void rT(int n) {
    }

    static void rU(int n) {
    }

    static void rV(int n) {
    }

    static void rW(int n) {
    }

    static void rX(int n) {
        if (n == 0) {
            h.dr(64, 100);
            h.dj(60, 256);
            h.do(58, 249);
            h.dA(64, 9);
            h.a("AK47");
        }
        if (n == 1) {
            h.ba(false);
            h.we(39);
        }
    }

    static void cD(int n, int n2) {
        if (0 == n) {
            switch (n2) {
                case 0: {
                    h.ba(true);
                    h.aY(false);
                    h.d(56, true);
                    h.dm(56, 8);
                    h.dn(56, 90);
                    h.d(58, true);
                    h.dn(58, 90);
                    h.vV(58).q(2);
                    h.d(60, true);
                    h.dn(60, 90);
                    h.vV(60).q(2);
                    h.d(59, true);
                    h.dn(59, 90);
                    h.vV(59).q(2);
                    break;
                }
                case 1000: {
                    h.dr(56, 0);
                    h.dr(56, 200);
                    h.dD(56, 0x460000);
                    h.dD(58, 0x460000);
                    h.dD(60, 0x460000);
                    h.dD(59, 0x460000);
                    h.dj(58, 256);
                    h.vZ(0);
                }
            }
        }
    }

    static void cE(int n, int n2) {
    }

    static void rY(int n) {
        if (n == 64) {
            h.a("Kill Aisha2");
            h.dp(1, 5000);
        }
        if (n == 58) {
            h.dk(64, 4096);
            h.dB(64, 60);
        }
        if (n == 0) {
            h.f(39, true);
        }
    }

    static void aG(boolean bl) {
    }

    static void iK() {
    }

    static void rZ(int n) {
    }

    static void iL() {
    }

    static void iM() {
        h.d(71, false);
        h.d(70, false);
        h.d(69, false);
    }

    static void iN() {
        if (!h.wc(40)) {
            h.aY(true);
            h.lP();
            h.wf(84);
            h.wf(82);
            h.d(68, true);
            h.dn(68, 180);
            h.d(64, false);
            h.d(66, false);
            h.dj(68, 4);
            h.dk(34, 2048);
            h.dk(35, 2048);
        }
    }

    static void iO() {
        h.aY(true);
        h.d(71, false);
        h.wj(200);
        h.wd(41);
        h.vX(1);
        h.vX(2);
        h.vX(3);
        h.vX(4);
    }

    static void iP() {
        h.aY(true);
        h.dk(68, 4);
        h.dk(70, 4);
        h.dk(69, 4);
        if (!h.dl(0, 2)) {
            h.o(2, h.vV((int)0).h, h.vV((int)0).i);
        }
    }

    static void sa(int n) {
        if (h.dl(68, 256) && h.l(0, 70, 200)) {
            h.dD(70, 0x780000);
            h.dD(69, 0x780000);
            h.dD(71, 0x780000);
            h.dk(68, 256);
            h.a("Start Chase");
            h.vY(58000);
            h.dp(3, 58000);
            h.aY(false);
        }
        if (h.l(71, 33, 35)) {
            h.d(71, false);
        }
    }

    static void sb(int n) {
    }

    static void sc(int n) {
    }

    static void sd(int n) {
    }

    static void se(int n) {
        if (n == 68 && h.dl(68, 4)) {
            h.dk(68, 4);
            h.wf(85);
            h.d(71, true);
            h.dm(71, 8);
            h.d(70, true);
            h.d(69, true);
            h.dn(70, 180);
            h.dn(69, 180);
            h.dn(71, 180);
            h.dj(70, 4);
            h.dj(69, 4);
            h.dj(71, 4096);
            h.dj(68, 256);
            h.a("FLAG Set");
        }
    }

    static void sf(int n) {
    }

    static void sg(int n) {
    }

    static void sh(int n) {
    }

    static void si(int n) {
        if (n == 3) {
            h.a("!!!!!!!!!!!!!!!!!!!!FAILED!!!!!!!!!!!!!!!!!!!!!!");
            h.dp(4, 3000);
            h.a("MISSION FAILED");
            h.aZ(false);
            h.d(70, false);
            h.d(69, false);
            h.d(71, false);
            h.vY(-1);
        }
        if (n == 4) {
            h.lR();
            h.f(40, true);
        }
        if (n == 2) {
            h.lP();
            h.ba(false);
            h.aZ(true);
            h.dp(1, 1000);
        }
        if (n == 1) {
            h.dj(34, 2048);
            h.dj(35, 2048);
            h.wf(89);
            h.we(40);
        }
    }

    static void cF(int n, int n2) {
    }

    static void cG(int n, int n2) {
    }

    static void sj(int n) {
        if (70 == n || 69 == n) {
            int n2;
            h.dk(n, 4);
            int n3 = n2 = 70 == n ? 69 : 70;
            if (h.dl(n2, 2)) {
                f f2 = h.lS();
                if (f2 != null) {
                    h.wq(f2.c);
                }
                h.vX(3);
                h.dr(71, 200);
                h.dk(68, 256);
                h.ba(true);
                h.vY(-1);
                h.dp(2, 5000);
            }
        }
        if (n == 0 || n == 68) {
            h.dk(68, 4);
            h.vX(2);
            h.vY(-1);
            h.dp(4, 2000);
            h.aZ(false);
        }
    }

    static void aH(boolean bl) {
    }

    static void iQ() {
    }

    static void sk(int n) {
    }

    static void iR() {
    }

    static void iS() {
        if (h.wb(44) && !h.wc(44)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
    }

    static void iT() {
        if (!h.wc(47)) {
            h.dj(73, 2048);
            h.wf(97);
            bU = h.lS();
            if (bU == null) {
                h.f(47, true);
            } else {
                h.dj(h.bU.c, 65536);
            }
        }
    }

    static void iU() {
        h.dk(73, 2048);
        h.wd(48);
    }

    static void iV() {
        h.aZ(false);
        h.dj(34, 2048);
        h.dj(35, 2048);
        h.dk(73, 2048);
        if (bU != null) {
            h.dk(h.bU.c, 4);
        }
    }

    static void sl(int n) {
        if (bU != null && h.l(h.bU.c, 73, 35) && h.dl(73, 2048)) {
            h.wq(h.bU.c);
            h.we(47);
        }
        if (bU != null && h.l(h.bU.c, 73, 400)) {
            h.aY(false);
        }
        if (!h.l(0, 73, 400)) {
            h.aY(true);
        }
        if (h.wk(2) > 0) {
            h.f(47, true);
        }
    }

    static void sm(int n) {
    }

    static void sn(int n) {
    }

    static void so(int n) {
    }

    static void sp(int n) {
        if (n == h.bU.c) {
            h.dk(h.bU.c, 4);
        }
    }

    static void sq(int n) {
        if (n == h.bU.c) {
            h.dj(h.bU.c, 4);
        }
    }

    static void sr(int n) {
    }

    static void ss(int n) {
    }

    static void st(int n) {
    }

    static void cH(int n, int n2) {
    }

    static void cI(int n, int n2) {
    }

    static void su(int n) {
        if (n == 0 || n == h.bU.c) {
            h.f(47, true);
        }
    }

    static void aI(boolean bl) {
    }

    static void iW() {
    }

    static void sv(int n) {
    }

    static void iX() {
    }

    static void iY() {
        h.d(82, false);
        h.d(83, false);
        h.d(86, false);
        h.d(87, false);
    }

    static void iZ() {
        if (!h.wc(48)) {
            bV = h.lS();
            if (bV == null) {
                h.f(48, true);
            } else {
                h.dq(4, 1000);
            }
        }
    }

    static void ja() {
        h.wd(49);
        h.aY(true);
    }

    static void jb() {
        h.wl(-1);
        h.lP();
        h.aZ(false);
        h.aY(true);
        h.dj(34, 2048);
        h.dj(35, 2048);
        if (bV != null) {
            h.dk(h.bV.c, 4);
        }
    }

    static void sw(int n) {
    }

    static void sx(int n) {
    }

    static void sy(int n) {
    }

    static void sz(int n) {
    }

    static void sA(int n) {
        if (n == h.bV.c && h.dl(h.bV.c, 4)) {
            h.dk(h.bV.c, 4);
            h.dB(86, h.bV.c);
            h.dB(87, h.bV.c);
            h.d(82, false);
            h.d(83, false);
            h.we(48);
        }
    }

    static void sB(int n) {
    }

    static void sC(int n) {
    }

    static void sD(int n) {
    }

    static void sE(int n) {
    }

    static void cJ(int n, int n2) {
        block0 : switch (n) {
            case 0: {
                switch (n2) {
                    case 0: {
                        h.n(82, 1043, 993);
                        h.vV(82).q(2);
                        h.dA(82, 5);
                        h.dB(82, 0);
                        break;
                    }
                    case 2000: {
                        break;
                    }
                    case 7000: {
                        if (h.dl(82, 2)) break;
                        h.m(82, 84, 15);
                        break;
                    }
                    case 10000: {
                        h.d(82, false);
                        h.vZ(0);
                    }
                }
                break;
            }
            case 1: {
                switch (n2) {
                    case 0: {
                        h.n(83, 1067, 992);
                        h.vV(83).q(2);
                        h.dA(83, 5);
                        h.dB(83, 0);
                        break;
                    }
                    case 2000: {
                        break;
                    }
                    case 7000: {
                        if (h.dl(83, 2)) break;
                        h.m(83, 85, 15);
                        break;
                    }
                    case 10000: {
                        h.d(83, false);
                        h.vZ(1);
                    }
                }
                break;
            }
            case 2: {
                switch (n2) {
                    case 0: {
                        h.n(82, 926, 1017);
                        h.vV(82).q(2);
                        h.dA(82, 5);
                        h.dB(82, 0);
                        break;
                    }
                    case 2000: {
                        break;
                    }
                    case 7000: {
                        if (h.dl(82, 2)) break;
                        h.m(82, 85, 15);
                        break;
                    }
                    case 10000: {
                        h.d(82, false);
                        h.vZ(2);
                    }
                }
                break;
            }
            case 3: {
                switch (n2) {
                    case 0: {
                        h.n(83, 1186, 1017);
                        h.vV(83).q(2);
                        h.dA(83, 5);
                        h.dB(83, 0);
                        break;
                    }
                    case 2000: {
                        break;
                    }
                    case 7000: {
                        if (h.dl(83, 2)) break;
                        h.m(83, 84, 15);
                        break;
                    }
                    case 10000: {
                        h.d(83, false);
                        h.vZ(3);
                    }
                }
                break;
            }
            case 4: {
                switch (n2) {
                    case 1000: {
                        h.du(2, 50);
                        h.aY(false);
                        h.lO();
                        h.k(h.bV.c, 1079, 1206);
                        h.dn(h.bV.c, 0);
                        h.lR();
                        h.wo(12);
                        h.dr(72, 100);
                        h.wf(98);
                        break block0;
                    }
                    case 2000: {
                        h.wl(9);
                        h.dq(0, 1000);
                        break block0;
                    }
                    case 6000: {
                        h.dq(1, 1000);
                        break block0;
                    }
                    case 13000: {
                        h.dq(2, 1000);
                        break block0;
                    }
                    case 17000: {
                        h.dq(3, 1000);
                        break block0;
                    }
                    case 24000: {
                        h.dq(0, 1000);
                        break block0;
                    }
                    case 28000: {
                        h.dq(3, 1000);
                        break block0;
                    }
                    case 35000: {
                        h.dq(2, 1000);
                        break block0;
                    }
                    case 39000: {
                        h.dq(1, 1000);
                        break block0;
                    }
                    case 47000: {
                        h.wl(-1);
                        h.ba(true);
                        h.d(86, true);
                        h.d(87, true);
                        h.vV(86).q(2);
                        h.vV(87).q(2);
                        h.dD(86, 0x780000);
                        h.dD(87, 0x780000);
                        break block0;
                    }
                    case 50000: {
                        h.n(82, 1038, 1174);
                        h.vV(82).q(2);
                        h.dA(82, 5);
                        h.n(83, 1117, 1149);
                        h.vV(83).q(2);
                        h.dA(83, 5);
                        break block0;
                    }
                    case 51000: {
                        h.dr(0, 100);
                        break block0;
                    }
                    case 52000: {
                        h.dj(86, 12288);
                        h.dj(87, 12288);
                        h.ba(false);
                        h.aY(true);
                        h.lP();
                        h.dj(h.bV.c, 4);
                        h.wf(100);
                        break block0;
                    }
                    case 54000: {
                        h.a("FIND TARGET");
                        f f2 = h.lS();
                        h.d(82, false);
                        h.d(83, false);
                        if (f2 == null) {
                            h.dB(86, 0);
                            h.dB(87, 0);
                            h.a("Player on foot. Attack him.");
                        } else {
                            h.dB(86, f2.c);
                            h.dB(87, f2.c);
                            h.a("Player in car. Attack car.");
                        }
                        h.vZ(4);
                    }
                }
            }
        }
    }

    static void cK(int n, int n2) {
    }

    static void sF(int n) {
        if (n == 0 || n == h.bV.c) {
            h.f(48, true);
        }
    }

    static void aJ(boolean bl) {
    }

    static void jc() {
    }

    static void sG(int n) {
    }

    static void jd() {
    }

    static void je() {
        h.d(92, false);
    }

    static void jf() {
        if (!h.wc(49)) {
            bW = h.lS();
            if (bW == null) {
                h.f(49, true);
            } else {
                h.dj(25, 2048);
                h.n(82, 2419, 2227);
                h.n(83, 2455, 2382);
                h.n(19, 2577, 2263);
                h.vV(82).q(0);
                h.vV(83).q(0);
                h.vV(19).q(0);
                h.dA(82, 15);
                h.dA(83, 15);
                h.dA(19, 15);
                h.dj(82, 4096);
                h.dj(83, 4096);
                h.dj(19, 4096);
            }
        }
    }

    static void jg() {
        h.wj(250);
        h.wn(12);
        h.wm(4);
        h.dk(92, 4);
        h.wd(50);
        h.dv(2, 0);
        h.aY(true);
    }

    static void jh() {
        h.aZ(false);
        h.aY(true);
        h.dj(34, 2048);
        h.dj(35, 2048);
        h.dk(92, 4);
    }

    static void sH(int n) {
        if (h.l(0, 25, 400)) {
            h.aY(false);
        } else {
            h.aY(true);
        }
        if (h.l(0, 25, 35) && h.dl(25, 2048)) {
            if (bW != null) {
                h.wq(h.bW.c);
            }
            h.dk(25, 2048);
            h.dk(86, 4096);
            h.dk(87, 4096);
            h.do(86, 170);
            h.do(87, 170);
            if (h.l(82, 86, 180)) {
                h.dB(82, 86);
                h.dB(86, 82);
            }
            if (h.l(83, 87, 180)) {
                h.dB(83, 87);
                h.dB(87, 83);
            }
            h.dp(1, 4000);
        }
    }

    static void sI(int n) {
    }

    static void sJ(int n) {
    }

    static void sK(int n) {
    }

    static void sL(int n) {
    }

    static void sM(int n) {
    }

    static void sN(int n) {
    }

    static void sO(int n) {
    }

    static void sP(int n) {
        if (n == 1) {
            if (h.lS() != null) {
                h.lR();
            }
            h.wf(101);
            h.dy(15, 1);
            h.wo(15);
            h.a("Akuji start");
            h.dj(92, 4);
            h.dm(92, 8);
            h.d(92, true);
            h.do(92, 300);
            h.dD(92, 0x780000);
            h.dp(2, 3000);
        }
        if (n == 2) {
            h.dj(92, 8192);
            h.dB(92, 0);
        }
    }

    static void cL(int n, int n2) {
    }

    static void cM(int n, int n2) {
    }

    static void sQ(int n) {
        if (n == 92) {
            h.a("Akuji dead");
            h.aZ(true);
            h.we(49);
        }
        if (n == 0) {
            h.f(49, true);
        }
    }

    static void aK(boolean bl) {
    }

    static void ji() {
    }

    static void sR(int n) {
    }

    static void jj() {
    }

    static void jk() {
    }

    static void jl() {
        if (!h.wc(50)) {
            h.wf(102);
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
    }

    static void jm() {
        h.dk(34, 2048);
        h.dk(35, 2048);
    }

    static void jn() {
        h.aZ(false);
    }

    static void sS(int n) {
    }

    static void sT(int n) {
    }

    static void sU(int n) {
    }

    static void sV(int n) {
    }

    static void sW(int n) {
    }

    static void sX(int n) {
    }

    static void sY(int n) {
    }

    static void sZ(int n) {
    }

    static void ta(int n) {
    }

    static void cN(int n, int n2) {
    }

    static void cO(int n, int n2) {
    }

    static void tb(int n) {
    }

    static void aL(boolean bl) {
    }

    static void jo() {
    }

    static void tc(int n) {
    }

    static void jp() {
    }

    static void jq() {
    }

    static void jr() {
        if (!h.wc(65)) {
            bX = h.lS();
            if (bX == null) {
                h.f(65, true);
                bX = h.vV(56);
            } else if (h.dl(h.bX.c, 256)) {
                h.dp(1, 1500);
                h.d(40, true);
                h.dj(40, 4096);
                h.vV(40).q(0);
                h.d(41, true);
                h.dj(41, 4096);
                h.vV(41).q(0);
                h.dj(42, 2048);
            } else {
                h.f(65, true);
            }
        }
    }

    static void js() {
        h.wd(66);
    }

    static void jt() {
        h.aZ(false);
        h.dk(42, 2048);
        h.d(40, false);
        h.d(41, false);
        if (bX != null) {
            h.dk(h.bX.c, 260);
        }
        h.dj(34, 2048);
        h.dj(35, 2048);
    }

    static void td(int n) {
        if (bX != null && h.l(h.bX.c, 42, 35)) {
            h.wq(h.bX.c);
            h.dq(0, 500);
        }
    }

    static void te(int n) {
    }

    static void tf(int n) {
    }

    static void tg(int n) {
    }

    static void th(int n) {
        if (n == h.bX.c) {
            h.dk(h.bX.c, 4);
        }
    }

    static void ti(int n) {
        if (n == h.bX.c) {
            h.dj(h.bX.c, 4);
        }
    }

    static void tj(int n) {
    }

    static void tk(int n) {
    }

    static void tl(int n) {
        if (n == 1) {
            h.wf(127);
        }
    }

    static void cP(int n, int n2) {
        block0 : switch (n) {
            case 0: {
                switch (n2) {
                    case 0: {
                        h.dk(42, 2048);
                        h.wf(135);
                        break block0;
                    }
                    case 500: {
                        h.m(40, h.bX.c, 15);
                        h.m(41, h.bX.c, 15);
                        break block0;
                    }
                    case 1500: {
                        h.d(40, false);
                        h.d(41, false);
                        h.dy(8, 2);
                        h.wo(8);
                        h.we(65);
                        h.vZ(0);
                    }
                }
            }
        }
    }

    static void cQ(int n, int n2) {
    }

    static void tm(int n) {
        if (n == h.bX.c || n == 0) {
            h.f(65, true);
        }
    }

    static void aM(boolean bl) {
    }

    static void ju() {
    }

    static void tn(int n) {
    }

    static void jv() {
    }

    static void jw() {
    }

    static void jx() {
        if (!h.wc(66)) {
            bY = h.lS();
            if (bY == null) {
                h.f(66, true);
                bY = h.vV(56);
            } else if (h.dl(h.bY.c, 256)) {
                h.wf(128);
                h.dj(33, 2048);
                h.dj(32, 2048);
            } else {
                h.f(66, true);
            }
        }
    }

    static void jy() {
        h.dk(33, 2048);
        h.dk(32, 2048);
    }

    static void jz() {
        h.aZ(false);
        h.dk(33, 2048);
        h.dk(32, 2048);
        if (bY != null) {
            h.dk(h.bY.c, 260);
        }
        h.dj(34, 2048);
        h.dj(35, 2048);
    }

    static void to(int n) {
    }

    static void tp(int n) {
    }

    static void tq(int n) {
    }

    static void tr(int n) {
    }

    static void ts(int n) {
        if (n == h.bY.c) {
            h.dk(h.bY.c, 4);
        }
    }

    static void tt(int n) {
        if (n == h.bY.c) {
            h.dj(h.bY.c, 4);
        }
    }

    static void tu(int n) {
    }

    static void tv(int n) {
    }

    static void tw(int n) {
    }

    static void cR(int n, int n2) {
    }

    static void cS(int n, int n2) {
    }

    static void tx(int n) {
        if (n == h.bY.c || n == 0) {
            h.f(66, true);
        }
    }

    static void aN(boolean bl) {
    }

    static void jA() {
    }

    static void ty(int n) {
    }

    static void jB() {
    }

    static void jC() {
        if (h.wb(0) && !h.wc(0)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
            h.bd(false);
            h.bc(false);
            h.aX(false);
            h.be(false);
        }
        if (h.wb(1) && !h.wc(1)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(2) && !h.wc(2)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(3) && !h.wc(3)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(4) && !h.wc(4)) {
            h.aZ(false);
            h.f(4, true);
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(6) && !h.wc(6)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(7) && !h.wc(7)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
            f f2 = h.lS();
            if (f2 == null) {
                h.aZ(false);
                h.f(7, true);
            } else if (!h.dl(f2.c, 256)) {
                h.aZ(false);
                h.f(7, true);
            }
        }
        if (h.wb(8) && !h.wc(8)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(9) && !h.wc(9)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(11) && !h.wc(11)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(12) && !h.wc(12)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (!h.wb(13) || !h.wc(13)) {
            // empty if block
        }
        if (!h.wb(14) || !h.wc(14)) {
            // empty if block
        }
        if (!h.wb(15) || !h.wc(15)) {
            // empty if block
        }
        if (!h.wb(16) || !h.wc(16)) {
            // empty if block
        }
        if (h.wb(17) && !h.wc(17)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (!h.wb(18) || !h.wc(18)) {
            // empty if block
        }
        if (!h.wb(19) || !h.wc(19)) {
            // empty if block
        }
        if (!h.wb(20) || !h.wc(20)) {
            // empty if block
        }
        if (!h.wb(21) || !h.wc(21)) {
            // empty if block
        }
        if (!h.wb(22) || !h.wc(22)) {
            // empty if block
        }
        if (h.wb(23) && !h.wc(23)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(24) && !h.wc(24)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(25) && !h.wc(25)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (!h.wb(26) || !h.wc(26)) {
            // empty if block
        }
        if (!h.wb(27) || !h.wc(27)) {
            // empty if block
        }
        if (h.wb(28) && !h.wc(28)) {
            h.dj(32, 2048);
            h.dj(33, 2048);
        }
        if (h.wb(29) && !h.wc(29)) {
            h.dj(32, 2048);
            h.dj(33, 2048);
        }
        if (!h.wb(30) || !h.wc(30)) {
            // empty if block
        }
        if (!h.wb(31) || !h.wc(31)) {
            // empty if block
        }
        if (h.wb(32) && !h.wc(32)) {
            h.we(32);
            h.wd(33);
        }
        if (!h.wb(33) || !h.wc(33)) {
            // empty if block
        }
        if (!h.wb(35) || !h.wc(35)) {
            // empty if block
        }
        if (!h.wb(36) || !h.wc(36)) {
            // empty if block
        }
        if (!h.wb(37) || !h.wc(37)) {
            // empty if block
        }
        if (!h.wb(38) || !h.wc(38)) {
            // empty if block
        }
        if (!h.wb(39) || !h.wc(39)) {
            // empty if block
        }
        if (!h.wb(40) || !h.wc(40)) {
            // empty if block
        }
        if (h.wb(41) && !h.wc(41)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(42) && !h.wc(42)) {
            h.aZ(false);
            h.f(42, true);
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(43) && !h.wc(43)) {
            h.aZ(false);
            h.f(43, true);
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(44) && !h.wc(44)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(46) && !h.wc(46)) {
            h.we(46);
            h.wd(47);
        }
        if (!h.wb(47) || !h.wc(47)) {
            // empty if block
        }
        if (!h.wb(48) || !h.wc(48)) {
            // empty if block
        }
        if (!h.wb(49) || !h.wc(49)) {
            // empty if block
        }
        if (h.wb(50) && !h.wc(50)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(51) && !h.wc(51)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(52) && !h.wc(52)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (!h.wb(53) || !h.wc(53)) {
            // empty if block
        }
        if (h.wb(54) && !h.wc(54)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(55) && !h.wc(55)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(56) && !h.wc(56)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(58) && !h.wc(58)) {
            h.aZ(false);
            h.f(58, false);
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(60) && !h.wc(60)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(61) && !h.wc(61)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(62) && !h.wc(62)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(63) && !h.wc(63)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(64) && !h.wc(64)) {
            h.we(64);
            h.wd(65);
        }
        if (!h.wb(65) || !h.wc(65)) {
            // empty if block
        }
        if (h.wb(66) && !h.wc(66)) {
            h.dj(32, 2048);
            h.dj(33, 2048);
        }
        if (h.wb(67) && !h.wc(67)) {
            h.dj(32, 2048);
            h.dj(33, 2048);
        }
        if (!h.wb(68) || !h.wc(68)) {
            // empty if block
        }
        if (!h.wb(69) || !h.wc(69)) {
            // empty if block
        }
        if (!h.wb(70) || !h.wc(70)) {
            // empty if block
        }
        if (h.wb(71) && !h.wc(71)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(72) && !h.wc(72)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(73) && !h.wc(72)) {
            h.aZ(false);
            h.f(73, false);
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(74) && !h.wc(74)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(75) && !h.wc(75)) {
            h.dj(34, 2048);
            h.dj(35, 2048);
        }
        if (h.wb(78) && !h.wc(78)) {
            h.dj(32, 2048);
            h.dj(33, 2048);
        }
        if (h.wb(79) && !h.wc(79)) {
            h.dj(32, 2048);
            h.dj(33, 2048);
        }
        if (h.wb(80) && !h.wc(80)) {
            h.dj(32, 2048);
            h.dj(33, 2048);
        }
        if (h.wb(81) && !h.wc(81)) {
            h.dj(32, 2048);
            h.dj(33, 2048);
        }
        if (h.wb(82) && !h.wc(82)) {
            h.dj(32, 2048);
            h.dj(33, 2048);
        }
        if (h.wb(83) && !h.wc(83)) {
            h.dj(32, 2048);
            h.dj(33, 2048);
        }
        if (h.wb(84) && !h.wc(84)) {
            h.dj(32, 2048);
            h.dj(33, 2048);
        }
    }

    static void tz(int n) {
        switch (h.q()) {
            case 33: {
                h.qB(n);
                break;
            }
            case 34: {
                h.qM(n);
                break;
            }
            case 35: {
                h.qX(n);
                break;
            }
            case 36: {
                h.ri(n);
                break;
            }
            case 37: {
                h.rt(n);
                break;
            }
            case 38: {
                h.rE(n);
                break;
            }
            case 39: {
                h.rP(n);
                break;
            }
            case 40: {
                h.sa(n);
                break;
            }
            case 47: {
                h.sl(n);
                break;
            }
            case 48: {
                h.sw(n);
                break;
            }
            case 49: {
                h.sH(n);
                break;
            }
            case 50: {
                h.sS(n);
                break;
            }
            case 65: {
                h.td(n);
                break;
            }
            case 66: {
                h.to(n);
            }
        }
    }

    static void tA(int n) {
        switch (n) {
            case 33: {
                h.hW();
                break;
            }
            case 34: {
                h.ic();
                break;
            }
            case 35: {
                h.ii();
                break;
            }
            case 36: {
                h.io();
                break;
            }
            case 37: {
                h.iu();
                break;
            }
            case 38: {
                h.iA();
                break;
            }
            case 39: {
                h.iG();
                break;
            }
            case 40: {
                h.iM();
                break;
            }
            case 47: {
                h.iS();
                break;
            }
            case 48: {
                h.iY();
                break;
            }
            case 49: {
                h.je();
                break;
            }
            case 50: {
                h.jk();
                break;
            }
            case 65: {
                h.jq();
                break;
            }
            case 66: {
                h.jw();
            }
        }
    }

    static void tB(int n) {
        switch (n) {
            case 33: {
                h.hX();
                break;
            }
            case 34: {
                h.id();
                break;
            }
            case 35: {
                h.ij();
                break;
            }
            case 36: {
                h.ip();
                break;
            }
            case 37: {
                h.iv();
                break;
            }
            case 38: {
                h.iB();
                break;
            }
            case 39: {
                h.iH();
                break;
            }
            case 40: {
                h.iN();
                break;
            }
            case 47: {
                h.iT();
                break;
            }
            case 48: {
                h.iZ();
                break;
            }
            case 49: {
                h.jf();
                break;
            }
            case 50: {
                h.jl();
                break;
            }
            case 65: {
                h.jr();
                break;
            }
            case 66: {
                h.jx();
            }
        }
    }

    static void tC(int n) {
        switch (n) {
            case 33: {
                h.hY();
                break;
            }
            case 34: {
                h.ie();
                break;
            }
            case 35: {
                h.ik();
                break;
            }
            case 36: {
                h.iq();
                break;
            }
            case 37: {
                h.iw();
                break;
            }
            case 38: {
                h.iC();
                break;
            }
            case 39: {
                h.iI();
                break;
            }
            case 40: {
                h.iO();
                break;
            }
            case 47: {
                h.iU();
                break;
            }
            case 48: {
                h.ja();
                break;
            }
            case 49: {
                h.jg();
                break;
            }
            case 50: {
                h.jm();
                break;
            }
            case 65: {
                h.js();
                break;
            }
            case 66: {
                h.jy();
            }
        }
    }

    static void tD(int n) {
        switch (n) {
            case 33: {
                h.hZ();
                break;
            }
            case 34: {
                h.if();
                break;
            }
            case 35: {
                h.il();
                break;
            }
            case 36: {
                h.ir();
                break;
            }
            case 37: {
                h.ix();
                break;
            }
            case 38: {
                h.iD();
                break;
            }
            case 39: {
                h.iJ();
                break;
            }
            case 40: {
                h.iP();
                break;
            }
            case 47: {
                h.iV();
                break;
            }
            case 48: {
                h.jb();
                break;
            }
            case 49: {
                h.jh();
                break;
            }
            case 50: {
                h.jn();
                break;
            }
            case 65: {
                h.jt();
                break;
            }
            case 66: {
                h.jz();
            }
        }
    }

    static void tE(int n) {
        switch (h.q()) {
            case 33: {
                h.qC(n);
                break;
            }
            case 34: {
                h.qN(n);
                break;
            }
            case 35: {
                h.qY(n);
                break;
            }
            case 36: {
                h.rj(n);
                break;
            }
            case 37: {
                h.ru(n);
                break;
            }
            case 38: {
                h.rF(n);
                break;
            }
            case 39: {
                h.rQ(n);
                break;
            }
            case 40: {
                h.sb(n);
                break;
            }
            case 47: {
                h.sm(n);
                break;
            }
            case 48: {
                h.sx(n);
                break;
            }
            case 49: {
                h.sI(n);
                break;
            }
            case 50: {
                h.sT(n);
                break;
            }
            case 65: {
                h.te(n);
                break;
            }
            case 66: {
                h.tp(n);
            }
        }
    }

    static void tF(int n) {
        switch (h.q()) {
            case 33: {
                h.qD(n);
                break;
            }
            case 34: {
                h.qO(n);
                break;
            }
            case 35: {
                h.qZ(n);
                break;
            }
            case 36: {
                h.rk(n);
                break;
            }
            case 37: {
                h.rv(n);
                break;
            }
            case 38: {
                h.rG(n);
                break;
            }
            case 39: {
                h.rR(n);
                break;
            }
            case 40: {
                h.sc(n);
                break;
            }
            case 47: {
                h.sn(n);
                break;
            }
            case 48: {
                h.sy(n);
                break;
            }
            case 49: {
                h.sJ(n);
                break;
            }
            case 50: {
                h.sU(n);
                break;
            }
            case 65: {
                h.tf(n);
                break;
            }
            case 66: {
                h.tq(n);
            }
        }
    }

    static void tG(int n) {
        switch (h.q()) {
            case 33: {
                h.qE(n);
                break;
            }
            case 34: {
                h.qP(n);
                break;
            }
            case 35: {
                h.ra(n);
                break;
            }
            case 36: {
                h.rl(n);
                break;
            }
            case 37: {
                h.rw(n);
                break;
            }
            case 38: {
                h.rH(n);
                break;
            }
            case 39: {
                h.rS(n);
                break;
            }
            case 40: {
                h.sd(n);
                break;
            }
            case 47: {
                h.so(n);
                break;
            }
            case 48: {
                h.sz(n);
                break;
            }
            case 49: {
                h.sK(n);
                break;
            }
            case 50: {
                h.sV(n);
                break;
            }
            case 65: {
                h.tg(n);
                break;
            }
            case 66: {
                h.tr(n);
            }
        }
    }

    static void tH(int n) {
        switch (h.q()) {
            case 33: {
                h.qF(n);
                break;
            }
            case 34: {
                h.qQ(n);
                break;
            }
            case 35: {
                h.rb(n);
                break;
            }
            case 36: {
                h.rm(n);
                break;
            }
            case 37: {
                h.rx(n);
                break;
            }
            case 38: {
                h.rI(n);
                break;
            }
            case 39: {
                h.rT(n);
                break;
            }
            case 40: {
                h.se(n);
                break;
            }
            case 47: {
                h.sp(n);
                break;
            }
            case 48: {
                h.sA(n);
                break;
            }
            case 49: {
                h.sL(n);
                break;
            }
            case 50: {
                h.sW(n);
                break;
            }
            case 65: {
                h.th(n);
                break;
            }
            case 66: {
                h.ts(n);
            }
        }
        h.be(true);
    }

    static void tI(int n) {
        switch (h.q()) {
            case 33: {
                h.qG(n);
                break;
            }
            case 34: {
                h.qR(n);
                break;
            }
            case 35: {
                h.rc(n);
                break;
            }
            case 36: {
                h.rn(n);
                break;
            }
            case 37: {
                h.ry(n);
                break;
            }
            case 38: {
                h.rJ(n);
                break;
            }
            case 39: {
                h.rU(n);
                break;
            }
            case 40: {
                h.sf(n);
                break;
            }
            case 47: {
                h.sq(n);
                break;
            }
            case 48: {
                h.sB(n);
                break;
            }
            case 49: {
                h.sM(n);
                break;
            }
            case 50: {
                h.sX(n);
                break;
            }
            case 65: {
                h.ti(n);
                break;
            }
            case 66: {
                h.tt(n);
            }
        }
        h.be(false);
    }

    static void tJ(int n) {
        switch (h.q()) {
            case 33: {
                h.qH(n);
                break;
            }
            case 34: {
                h.qS(n);
                break;
            }
            case 35: {
                h.rd(n);
                break;
            }
            case 36: {
                h.ro(n);
                break;
            }
            case 37: {
                h.rz(n);
                break;
            }
            case 38: {
                h.rK(n);
                break;
            }
            case 39: {
                h.rV(n);
                break;
            }
            case 40: {
                h.sg(n);
                break;
            }
            case 47: {
                h.sr(n);
                break;
            }
            case 48: {
                h.sC(n);
                break;
            }
            case 49: {
                h.sN(n);
                break;
            }
            case 50: {
                h.sY(n);
                break;
            }
            case 65: {
                h.tj(n);
                break;
            }
            case 66: {
                h.tu(n);
            }
        }
    }

    static void tK(int n) {
        switch (h.q()) {
            case 33: {
                h.qI(n);
                break;
            }
            case 34: {
                h.qT(n);
                break;
            }
            case 35: {
                h.re(n);
                break;
            }
            case 36: {
                h.rp(n);
                break;
            }
            case 37: {
                h.rA(n);
                break;
            }
            case 38: {
                h.rL(n);
                break;
            }
            case 39: {
                h.rW(n);
                break;
            }
            case 40: {
                h.sh(n);
                break;
            }
            case 47: {
                h.ss(n);
                break;
            }
            case 48: {
                h.sD(n);
                break;
            }
            case 49: {
                h.sO(n);
                break;
            }
            case 50: {
                h.sZ(n);
                break;
            }
            case 65: {
                h.tk(n);
                break;
            }
            case 66: {
                h.tv(n);
            }
        }
    }

    static void tL(int n) {
        switch (h.q()) {
            case 33: {
                h.qJ(n);
                break;
            }
            case 34: {
                h.qU(n);
                break;
            }
            case 35: {
                h.rf(n);
                break;
            }
            case 36: {
                h.rq(n);
                break;
            }
            case 37: {
                h.rB(n);
                break;
            }
            case 38: {
                h.rM(n);
                break;
            }
            case 39: {
                h.rX(n);
                break;
            }
            case 40: {
                h.si(n);
                break;
            }
            case 47: {
                h.st(n);
                break;
            }
            case 48: {
                h.sE(n);
                break;
            }
            case 49: {
                h.sP(n);
                break;
            }
            case 50: {
                h.ta(n);
                break;
            }
            case 65: {
                h.tl(n);
                break;
            }
            case 66: {
                h.tw(n);
            }
        }
    }

    static void cT(int n, int n2) {
        switch (h.q()) {
            case 33: {
                h.cr(n, n2);
                break;
            }
            case 34: {
                h.ct(n, n2);
                break;
            }
            case 35: {
                h.cv(n, n2);
                break;
            }
            case 36: {
                h.cx(n, n2);
                break;
            }
            case 37: {
                h.cz(n, n2);
                break;
            }
            case 38: {
                h.cB(n, n2);
                break;
            }
            case 39: {
                h.cD(n, n2);
                break;
            }
            case 40: {
                h.cF(n, n2);
                break;
            }
            case 47: {
                h.cH(n, n2);
                break;
            }
            case 48: {
                h.cJ(n, n2);
                break;
            }
            case 49: {
                h.cL(n, n2);
                break;
            }
            case 50: {
                h.cN(n, n2);
                break;
            }
            case 65: {
                h.cP(n, n2);
                break;
            }
            case 66: {
                h.cR(n, n2);
            }
        }
    }

    static void cU(int n, int n2) {
        switch (h.q()) {
            case 33: {
                h.cs(n, n2);
                break;
            }
            case 34: {
                h.cu(n, n2);
                break;
            }
            case 35: {
                h.cw(n, n2);
                break;
            }
            case 36: {
                h.cy(n, n2);
                break;
            }
            case 37: {
                h.cA(n, n2);
                break;
            }
            case 38: {
                h.cC(n, n2);
                break;
            }
            case 39: {
                h.cE(n, n2);
                break;
            }
            case 40: {
                h.cG(n, n2);
                break;
            }
            case 47: {
                h.cI(n, n2);
                break;
            }
            case 48: {
                h.cK(n, n2);
                break;
            }
            case 49: {
                h.cM(n, n2);
                break;
            }
            case 50: {
                h.cO(n, n2);
                break;
            }
            case 65: {
                h.cQ(n, n2);
                break;
            }
            case 66: {
                h.cS(n, n2);
            }
        }
    }

    static void tM(int n) {
        switch (h.q()) {
            case 33: {
                h.qK(n);
                break;
            }
            case 34: {
                h.qV(n);
                break;
            }
            case 35: {
                h.rg(n);
                break;
            }
            case 36: {
                h.rr(n);
                break;
            }
            case 37: {
                h.rC(n);
                break;
            }
            case 38: {
                h.rN(n);
                break;
            }
            case 39: {
                h.rY(n);
                break;
            }
            case 40: {
                h.sj(n);
                break;
            }
            case 47: {
                h.su(n);
                break;
            }
            case 48: {
                h.sF(n);
                break;
            }
            case 49: {
                h.sQ(n);
                break;
            }
            case 50: {
                h.tb(n);
                break;
            }
            case 65: {
                h.tm(n);
                break;
            }
            case 66: {
                h.tx(n);
            }
        }
    }

    static void aO(boolean bl) {
        switch (h.q()) {
            case 33: {
                h.aA(bl);
                break;
            }
            case 34: {
                h.aB(bl);
                break;
            }
            case 35: {
                h.aC(bl);
                break;
            }
            case 36: {
                h.aD(bl);
                break;
            }
            case 37: {
                h.aE(bl);
                break;
            }
            case 38: {
                h.aF(bl);
                break;
            }
            case 39: {
                h.aG(bl);
                break;
            }
            case 40: {
                h.aH(bl);
                break;
            }
            case 47: {
                h.aI(bl);
                break;
            }
            case 48: {
                h.aJ(bl);
                break;
            }
            case 49: {
                h.aK(bl);
                break;
            }
            case 50: {
                h.aL(bl);
                break;
            }
            case 65: {
                h.aM(bl);
                break;
            }
            case 66: {
                h.aN(bl);
            }
        }
    }

    static void jD() {
        switch (h.q()) {
            case 33: {
                h.ia();
                break;
            }
            case 34: {
                h.ig();
                break;
            }
            case 35: {
                h.im();
                break;
            }
            case 36: {
                h.is();
                break;
            }
            case 37: {
                h.iy();
                break;
            }
            case 38: {
                h.iE();
                break;
            }
            case 39: {
                h.iK();
                break;
            }
            case 40: {
                h.iQ();
                break;
            }
            case 47: {
                h.iW();
                break;
            }
            case 48: {
                h.jc();
                break;
            }
            case 49: {
                h.ji();
                break;
            }
            case 50: {
                h.jo();
                break;
            }
            case 65: {
                h.ju();
                break;
            }
            case 66: {
                h.jA();
            }
        }
    }

    static void tN(int n) {
        switch (h.q()) {
            case 33: {
                h.qL(n);
                break;
            }
            case 34: {
                h.qW(n);
                break;
            }
            case 35: {
                h.rh(n);
                break;
            }
            case 36: {
                h.rs(n);
                break;
            }
            case 37: {
                h.rD(n);
                break;
            }
            case 38: {
                h.rO(n);
                break;
            }
            case 39: {
                h.rZ(n);
                break;
            }
            case 40: {
                h.sk(n);
                break;
            }
            case 47: {
                h.sv(n);
                break;
            }
            case 48: {
                h.sG(n);
                break;
            }
            case 49: {
                h.sR(n);
                break;
            }
            case 50: {
                h.tc(n);
                break;
            }
            case 65: {
                h.tn(n);
                break;
            }
            case 66: {
                h.ty(n);
            }
        }
    }

    static void jE() {
        switch (h.q()) {
            case 33: {
                h.ib();
                break;
            }
            case 34: {
                h.ih();
                break;
            }
            case 35: {
                h.in();
                break;
            }
            case 36: {
                h.it();
                break;
            }
            case 37: {
                h.iz();
                break;
            }
            case 38: {
                h.iF();
                break;
            }
            case 39: {
                h.iL();
                break;
            }
            case 40: {
                h.iR();
                break;
            }
            case 47: {
                h.iX();
                break;
            }
            case 48: {
                h.jd();
                break;
            }
            case 49: {
                h.jj();
                break;
            }
            case 50: {
                h.jp();
                break;
            }
            case 65: {
                h.jv();
                break;
            }
            case 66: {
                h.jB();
            }
        }
    }

    static void u(DataInputStream dataInputStream) throws IOException {
        bZ = new String[dataInputStream.readShort()];
        ca = new int[bZ.length][];
        for (int i = 0; i < bZ.length; ++i) {
            h.bZ[i] = dataInputStream.readUTF();
            h.ca[i] = new int[dataInputStream.readShort() * 2];
            for (int j = 0; j < ca[i].length; ++j) {
                h.ca[i][j] = dataInputStream.readInt();
            }
        }
    }

    static void jF() {
        h.jH();
        int[] nArray = ca[cb];
        for (int i = 0; i < nArray.length; i += 2) {
            int n = nArray[i + 0];
            int n2 = nArray[i + 1];
            if (-1 != n2) {
                h.j(n, n2);
                continue;
            }
            h.n(n);
        }
    }

    static void jG() {
        h.jI();
        int[] nArray = ca[ce];
        for (int i = 0; i < nArray.length; i += 2) {
            int n = nArray[i + 0];
            int n2 = nArray[i + 1];
            if (-1 != n2) {
                h.k(n, n2);
                continue;
            }
            h.o(n);
        }
    }

    static void jH() {
        ck = -1;
        int n = -1;
        if (-1 != cW && 5 == cb) {
            n = cW;
            cl = cY;
        }
        if (gL[1]) {
            n = gK[1];
            cl = gK[2];
        }
        if (-1 == n) {
            return;
        }
        int n2 = f.g(n);
        if (!h.m(n2, cl)) {
            h.j(n2, cl);
            ck = n2;
        }
    }

    static void jI() {
        if (-1 != ck) {
            h.k(ck, cl);
        }
    }

    static void jJ() {
        ce = -1;
        cc = -1;
        cb = 0;
        cd = new byte[6];
        h.cd[h.cb] = 1;
        cf = false;
        ci = null;
        cj = false;
    }

    static void v(DataInputStream dataInputStream) throws IOException {
        cb = dataInputStream.readByte();
        cc = dataInputStream.readByte();
        cj = dataInputStream.readBoolean();
        dataInputStream.readFully(cd);
        ci = new byte[dataInputStream.readShort()];
        dataInputStream.readFully(ci);
        if (ci.length == 0) {
            ci = null;
        }
    }

    static void e(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(cb);
        dataOutputStream.writeByte(cc);
        dataOutputStream.writeBoolean(cj);
        dataOutputStream.write(cd);
        if (ci == null) {
            ci = new byte[0];
        }
        dataOutputStream.writeShort(ci.length);
        dataOutputStream.write(ci);
    }

    static void jK() {
        int n;
        cf = true;
        for (n = 0; n < cg.length; ++n) {
            h.cg[n] = 0;
        }
        for (n = 0; n < ch.length; ++n) {
            h.ch[n] = 0;
        }
        for (n = 0; n < aI.length; ++n) {
            h.tP(n);
        }
        for (n = 0; n < aI.length; ++n) {
            if (h.Q(n)) {
                h.tQ(n);
            }
            if (!h.R(n)) continue;
            h.tR(n);
        }
        h.jL();
        ce = cb;
        cf = false;
    }

    static void jL() {
        if (!eE.s()) {
            h.be(false);
        }
        switch (cb) {
            case 0: {
                h.dF();
                break;
            }
            case 5: {
                h.dI();
                break;
            }
            case 3: {
                h.fl();
                break;
            }
            case 1: {
                h.gC();
                break;
            }
            case 4: {
                h.hT();
                break;
            }
            case 2: {
                h.jC();
            }
        }
        switch (ce) {
            case 5: {
                h.jS();
            }
        }
    }

    static void tO(int n) {
        int n2;
        for (n2 = 0; n2 < 16; ++n2) {
            if (cg[n2] <= 0) continue;
            int n3 = n2;
            cg[n3] = cg[n3] - n;
            if (cg[n2] > 0) continue;
            h.tZ(n2);
        }
        for (n2 = 0; n2 < ch.length; n2 += 2) {
            if (0 == ch[n2 + 1]) continue;
            int n4 = ch[n2 + 1];
            int n5 = ch[n2 + 0];
            int n6 = ch[n2 + 0] + n;
            for (int i = n5 - n5 % n4 + n4; i <= n6; i += n4) {
                h.cV(n2 / 2, i);
                if (0 == ch[n2 + 1]) break;
            }
            int n7 = n2 + 0;
            ch[n7] = ch[n7] + n;
        }
        switch (cb) {
            case 0: {
                h.hJ(n);
                break;
            }
            case 5: {
                h.hY(n);
                break;
            }
            case 3: {
                h.la(n);
                break;
            }
            case 1: {
                h.nG(n);
                break;
            }
            case 4: {
                h.qm(n);
                break;
            }
            case 2: {
                h.tz(n);
            }
        }
    }

    static void tP(int n) {
        switch (cb) {
            case 0: {
                h.hK(n);
                break;
            }
            case 5: {
                h.hZ(n);
                break;
            }
            case 3: {
                h.lb(n);
                break;
            }
            case 1: {
                h.nH(n);
                break;
            }
            case 4: {
                h.qn(n);
                break;
            }
            case 2: {
                h.tA(n);
            }
        }
    }

    static void tQ(int n) {
        switch (cb) {
            case 0: {
                h.hL(n);
                break;
            }
            case 5: {
                h.ia(n);
                break;
            }
            case 3: {
                h.lc(n);
                break;
            }
            case 1: {
                h.nI(n);
                break;
            }
            case 4: {
                h.qo(n);
                break;
            }
            case 2: {
                h.tB(n);
            }
        }
    }

    static void tR(int n) {
        switch (cb) {
            case 0: {
                h.hM(n);
                break;
            }
            case 5: {
                h.ib(n);
                break;
            }
            case 3: {
                h.ld(n);
                break;
            }
            case 1: {
                h.nJ(n);
                break;
            }
            case 4: {
                h.qp(n);
                break;
            }
            case 2: {
                h.tC(n);
            }
        }
    }

    static void tS(int n) {
        switch (cb) {
            case 0: {
                h.hO(n);
                break;
            }
            case 5: {
                h.id(n);
                break;
            }
            case 3: {
                h.lf(n);
                break;
            }
            case 1: {
                h.nL(n);
                break;
            }
            case 4: {
                h.qr(n);
                break;
            }
            case 2: {
                h.tE(n);
            }
        }
    }

    static void tT(int n) {
        switch (cb) {
            case 0: {
                h.hP(n);
                break;
            }
            case 5: {
                h.ie(n);
                break;
            }
            case 3: {
                h.lg(n);
                break;
            }
            case 1: {
                h.nM(n);
                break;
            }
            case 4: {
                h.qs(n);
                break;
            }
            case 2: {
                h.tF(n);
            }
        }
    }

    static void tU(int n) {
        switch (cb) {
            case 0: {
                h.hQ(n);
                break;
            }
            case 5: {
                h.if(n);
                break;
            }
            case 3: {
                h.lh(n);
                break;
            }
            case 1: {
                h.nN(n);
                break;
            }
            case 4: {
                h.qt(n);
                break;
            }
            case 2: {
                h.tG(n);
            }
        }
    }

    static void tV(int n) {
        switch (cb) {
            case 0: {
                h.hR(n);
                break;
            }
            case 5: {
                h.ig(n);
                break;
            }
            case 3: {
                h.li(n);
                break;
            }
            case 1: {
                h.nO(n);
                break;
            }
            case 4: {
                h.qu(n);
                break;
            }
            case 2: {
                h.tH(n);
            }
        }
    }

    static void tW(int n) {
        switch (cb) {
            case 0: {
                h.hS(n);
                break;
            }
            case 5: {
                h.ih(n);
                break;
            }
            case 3: {
                h.lj(n);
                break;
            }
            case 1: {
                h.nP(n);
                break;
            }
            case 4: {
                h.qv(n);
                break;
            }
            case 2: {
                h.tI(n);
            }
        }
    }

    static void tX(int n) {
        switch (cb) {
            case 0: {
                h.hT(n);
                break;
            }
            case 5: {
                h.ii(n);
                break;
            }
            case 3: {
                h.lk(n);
                break;
            }
            case 1: {
                h.nQ(n);
                break;
            }
            case 4: {
                h.qw(n);
                break;
            }
            case 2: {
                h.tJ(n);
            }
        }
    }

    static void tY(int n) {
        switch (cb) {
            case 0: {
                h.hU(n);
                break;
            }
            case 5: {
                h.ij(n);
                break;
            }
            case 3: {
                h.ll(n);
                break;
            }
            case 1: {
                h.nR(n);
                break;
            }
            case 4: {
                h.qx(n);
                break;
            }
            case 2: {
                h.tK(n);
            }
        }
    }

    static void a(f f2) {
        if (0 != (h.kt().v & 0x10)) {
            f f3 = f.F;
            eE.t();
            f3.b(false);
            eE.c(f2.h, f2.i + eg);
            h.kD();
        }
        fZ = f2;
        h.ky();
    }

    static void b(f f2) {
        fZ = f2;
        h.vd(1);
        eH = h.fZ.c;
        eG = 1;
        h.kQ();
    }

    static void c(f f2) {
        f.F.d(f2.l[0], f2.l[1] + 0x1E0000);
        f.F.c(102944);
        f.F.o = 0;
        f.F.p = 0;
        f.Z = 1;
    }

    static void tZ(int n) {
        switch (cb) {
            case 0: {
                h.hV(n);
                break;
            }
            case 5: {
                h.ik(n);
                break;
            }
            case 3: {
                h.lm(n);
                break;
            }
            case 1: {
                h.nS(n);
                break;
            }
            case 4: {
                h.qy(n);
                break;
            }
            case 2: {
                h.tL(n);
            }
        }
    }

    static void cV(int n, int n2) {
        switch (cb) {
            case 0: {
                h.aP(n, n2);
                break;
            }
            case 5: {
                h.aR(n, n2);
                break;
            }
            case 3: {
                h.bt(n, n2);
                break;
            }
            case 1: {
                h.bR(n, n2);
                break;
            }
            case 4: {
                h.cp(n, n2);
                break;
            }
            case 2: {
                h.cT(n, n2);
            }
        }
    }

    static void cW(int n, int n2) {
        switch (cb) {
            case 0: {
                h.aQ(n, n2);
                break;
            }
            case 5: {
                h.aS(n, n2);
                break;
            }
            case 3: {
                h.bu(n, n2);
                break;
            }
            case 1: {
                h.bS(n, n2);
                break;
            }
            case 4: {
                h.cq(n, n2);
                break;
            }
            case 2: {
                h.cU(n, n2);
            }
        }
    }

    static void ua(int n) {
        switch (cb) {
            case 0: {
                h.hW(n);
                break;
            }
            case 5: {
                h.il(n);
                break;
            }
            case 3: {
                h.ln(n);
                break;
            }
            case 1: {
                h.nT(n);
                break;
            }
            case 4: {
                h.qz(n);
                break;
            }
            case 2: {
                h.tM(n);
            }
        }
    }

    static void aP(boolean bl) {
        switch (cb) {
            case 0: {
                h.M(bl);
                break;
            }
            case 5: {
                h.N(bl);
                break;
            }
            case 3: {
                h.ab(bl);
                break;
            }
            case 1: {
                h.an(bl);
                break;
            }
            case 4: {
                h.az(bl);
                break;
            }
            case 2: {
                h.aO(bl);
            }
        }
    }

    static void jM() {
        switch (cb) {
            case 0: {
                h.dG();
                break;
            }
            case 5: {
                h.dJ();
                break;
            }
            case 3: {
                h.fm();
                break;
            }
            case 1: {
                h.gD();
                break;
            }
            case 4: {
                h.hU();
                break;
            }
            case 2: {
                h.jD();
            }
        }
    }

    static void ub(int n) {
        switch (cb) {
            case 0: {
                h.hX(n);
                break;
            }
            case 5: {
                h.im(n);
                break;
            }
            case 3: {
                h.lo(n);
                break;
            }
            case 1: {
                h.nU(n);
                break;
            }
            case 4: {
                h.qA(n);
                break;
            }
            case 2: {
                h.tN(n);
            }
        }
    }

    static void jN() {
        switch (cb) {
            case 0: {
                h.dH();
                break;
            }
            case 5: {
                h.dK();
                break;
            }
            case 3: {
                h.fn();
                break;
            }
            case 1: {
                h.gE();
                break;
            }
            case 4: {
                h.hV();
                break;
            }
            case 2: {
                h.jE();
            }
        }
    }

    static void jO() {
        cO = true;
    }

    static void uc(int n) {
        cM = (int)(d / 3000L) % 4;
        int n2 = gm;
        int n3 = gn;
        for (int i = 1; i != 0; --i) {
            f f2 = eB[cN % eB.length];
            int n4 = 0 == (f2.v & 0x10000) ? f2.d : -1;
            switch (n4) {
                case 10: 
                case 11: 
                case 12: {
                    if (Math.abs(f2.h - n2) <= cK && Math.abs(f2.i - n3) <= cK) break;
                    h.a(f2, n2, n3, 3 * cK >> 2);
                    break;
                }
                case 3: 
                case 5: 
                case 6: {
                    if (Math.abs(f2.h - n2) <= cL && Math.abs(f2.i - n3) <= cL) break;
                    h.b(f2, n2, n3, 3 * cL >> 2);
                    break;
                }
                case 4: {
                    if (Math.abs(f2.h - n2) <= cL && Math.abs(f2.i - n3) <= cL) break;
                    f2.b(false);
                    break;
                }
                case 2: {
                    break;
                }
                default: {
                    ++i;
                }
            }
            ++cN;
        }
    }

    static void jP() {
        for (int i = 0; i < eB.length; ++i) {
            f f2 = eB[i];
            if (f2.d != 12 && f2.d != 11 && f2.d != 10 && f2.d != 6 && f2.d != 3 && f2.d != 5 && f2.d != 4) continue;
            f2.b(false);
        }
    }

    static void d(f f2) {
        block5: for (int i = 0; i < eB.length; ++i) {
            f f3 = eB[i];
            switch (f3.d) {
                case 3: {
                    f3.h(f2);
                    continue block5;
                }
                case 5: 
                case 7: {
                    f3.l(f2);
                    continue block5;
                }
                case 6: {
                    f3.n(f2);
                }
            }
        }
    }

    static int f(int n, int n2, int n3) {
        cP = h.da(n, n2) - 10;
        switch (cP) {
            case 1: {
                return 205888;
            }
            case 0: {
                return 0;
            }
            case 3: {
                return 308832;
            }
            case 2: {
                return 102944;
            }
            case 7: {
                return 257360;
            }
            case 6: {
                return 360304;
            }
            case 5: {
                return 154416;
            }
            case 4: {
                return 51472;
            }
            case 11: {
                return cm[cM >> 1];
            }
            case 10: {
                return co[cM >> 1];
            }
            case 9: {
                return cq[cM >> 1];
            }
            case 8: {
                return cs[cM >> 1];
            }
            case 12: {
                return cu[cM >> 1];
            }
            case 13: {
                return cw[cM >> 1];
            }
            case 14: {
                return cy[cM >> 1];
            }
            case 15: {
                return cA[cM >> 1];
            }
            case 16: {
                return cC[cM >> 1];
            }
            case 17: {
                return cE[cM >> 1];
            }
            case 18: {
                return cG[cM >> 1];
            }
            case 19: {
                return cI[cM >> 1];
            }
        }
        return Integer.MIN_VALUE;
    }

    static boolean g(int n, int n2, int n3) {
        if (n3 < 0 || n3 > 19) {
            return true;
        }
        cP = h.da(n, n2) - 10;
        switch (cP) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: {
                return true;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: {
                if (h.ud(n3)) {
                    return true;
                }
                if (cM == 3 || cM == 1) {
                    return false;
                }
                switch (cP) {
                    case 11: {
                        return cn[cM >> 1][n3];
                    }
                    case 10: {
                        return cp[cM >> 1][n3];
                    }
                    case 9: {
                        return cr[cM >> 1][n3];
                    }
                    case 8: {
                        return ct[cM >> 1][n3];
                    }
                    case 12: {
                        return cv[cM >> 1][n3];
                    }
                    case 13: {
                        return cx[cM >> 1][n3];
                    }
                    case 14: {
                        return cz[cM >> 1][n3];
                    }
                    case 15: {
                        return cB[cM >> 1][n3];
                    }
                    case 16: {
                        return cD[cM >> 1][n3];
                    }
                    case 17: {
                        return cF[cM >> 1][n3];
                    }
                    case 18: {
                        return cH[cM >> 1][n3];
                    }
                    case 19: {
                        return cJ[cM >> 1][n3];
                    }
                }
            }
        }
        return true;
    }

    static boolean ud(int n) {
        switch (n) {
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: {
                return true;
            }
        }
        return false;
    }

    static boolean a(int n, int n2, int[] nArray) {
        int n3 = 0;
        int n4 = 0;
        int n5 = h.da(n, n2);
        switch (n5 - 10) {
            case 0: 
            case 1: {
                if (n5 == h.da(n, n2 - eg)) {
                    n4 = -1;
                    break;
                }
                if (n5 != h.da(n, n2 + eg)) break;
                n4 = 1;
                break;
            }
            case 2: 
            case 3: {
                if (n5 == h.da(n - ef, n2)) {
                    n3 = -1;
                    break;
                }
                if (n5 != h.da(n + ef, n2)) break;
                n3 = 1;
                break;
            }
            default: {
                return false;
            }
        }
        nArray[0] = n;
        nArray[1] = n2;
        int n6 = (n >> ee) / 3;
        int n7 = (n2 >> ee) / 3;
        if (n3 > 0) {
            nArray[0] = (n6 + 1) * ef;
        } else if (n3 < 0) {
            nArray[0] = n6 * ef;
        }
        if (n4 > 0) {
            nArray[1] = (n7 + 1) * eg;
        } else if (n4 < 0) {
            nArray[1] = n7 * eg;
        }
        return true;
    }

    static boolean a(f f2, int n, int n2) {
        block4: for (int i = 0; i < eB.length; ++i) {
            f f3 = eB[i];
            if (f2 == f3 || !f3.f()) continue;
            switch (f3.d) {
                case 8: 
                case 9: 
                case 10: 
                case 12: {
                    if (Math.abs(n - f3.l[0]) >= f3.g[4] || Math.abs(n2 - f3.l[1]) >= f3.g[4]) continue block4;
                    return false;
                }
                case 2: {
                    if (Math.abs(n - f3.l[0]) >= f2.g[5] || Math.abs(n2 - f3.l[1]) >= f2.g[5]) continue block4;
                    return false;
                }
            }
        }
        return true;
    }

    static boolean cX(int n, int n2) {
        int n3 = h.da(n, n2);
        return n3 == 9 || n3 == 36;
    }

    static int ue(int n) {
        return 4 * n * 2;
    }

    static boolean cY(int n, int n2) {
        if (n >= h.ue(n2)) {
            return false;
        }
        int n3 = n % 4;
        cS = n2 * cQ[n3][0];
        cT = n2 * cQ[n3][1];
        int n4 = n / 4 + 1;
        n4 = (n4 % 2 == 0 ? 1 : -1) * (n4 / 2);
        cS += n4 * cR[n3][0];
        cT += n4 * cR[n3][1];
        return true;
    }

    static boolean a(f f2, int n, int n2, int n3) {
        f2.b(false);
        if (!cO || h.q(f2.z, f2.d)) {
            return false;
        }
        n /= ef;
        n2 /= eg;
        int n4 = h.ue(n3 /= ef);
        int n5 = h.a(n4);
        while (h.cY(n5 % (n4 + 1), n3)) {
            block7: {
                int n6 = n + cS;
                int n7 = n2 + cT;
                if (n6 >= 0 && n7 >= 0 && n6 < et && n7 < eu) {
                    int n8 = ex[n7 * et + n6] - 10;
                    switch (n8) {
                        case 0: 
                        case 1: 
                        case 2: 
                        case 3: {
                            if (cN % 4 == n8) break;
                        }
                        default: {
                            break block7;
                        }
                    }
                    if (f2.k(n6 * ef + (ef >> 1), n7 * eg + (eg >> 1))) {
                        return true;
                    }
                }
            }
            ++n5;
        }
        return false;
    }

    static boolean b(f f2, int n, int n2, int n3) {
        f2.b(false);
        if (!cO || h.q(f2.z, f2.d)) {
            return false;
        }
        n /= ef;
        n2 /= eg;
        int n4 = h.ue(n3 /= ef);
        int n5 = h.a(n4);
        while (h.cY(n5 % (n4 + 1), n3)) {
            block7: {
                int n6 = n + cS;
                int n7 = n2 + cT;
                if (n6 >= 0 && n7 >= 0 && n6 < et && n7 < eu) {
                    byte by = ex[n7 * et + n6];
                    switch (by) {
                        case 9: 
                        case 36: {
                            byte by2;
                            if (f2.d != 5 || (by2 = ey[n7 * et + n6]) >= 4 && by2 < 9) break;
                            break block7;
                        }
                        default: {
                            break block7;
                        }
                    }
                    if (f2.h(n6 * ef + (ef >> 1), n7 * eg + (eg >> 1))) {
                        return true;
                    }
                }
            }
            ++n5;
        }
        return false;
    }

    static void w(DataInputStream dataInputStream) throws IOException {
        cU = h.g(dataInputStream);
    }

    static void f(DataOutputStream dataOutputStream) throws IOException {
        h.a(dataOutputStream, cU);
    }

    static void x(DataInputStream dataInputStream) throws IOException {
        cV = new int[dataInputStream.readShort()][7];
        for (int i = 0; i < cV.length; ++i) {
            h.cV[i][0] = dataInputStream.readInt();
            h.cV[i][1] = dataInputStream.readInt();
            h.cV[i][2] = dataInputStream.readShort();
            h.cV[i][3] = dataInputStream.readShort();
            h.cV[i][4] = dataInputStream.readInt();
            h.cV[i][5] = dataInputStream.readByte();
            h.cV[i][6] = dataInputStream.readInt();
        }
        h.a("Weapons loaded: " + cV.length);
    }

    static void jQ() {
        cU = new int[cV.length];
    }

    static int[] a(int n, int[] nArray, int[] nArray2) {
        return nArray2;
    }

    static void a(int n, int n2, int[] nArray, boolean bl) {
        if (bl) {
            h.a(12, nArray, null);
            h.dg(1000, 15);
        }
        for (int i = 0; i < eB.length; ++i) {
            int n3;
            f f2 = eB[i];
            if (0 != (f2.v & 3) || (n3 = f2.c(nArray)) >= 0x320000) continue;
            f2.h(n2 - n2 * n3 / n);
        }
        h.d();
        h.y(1);
    }

    static void a(f f2, int n, int[] nArray) {
        if (!h.uf(n)) {
            if (n == 15) {
                h.a(0x320000, 100, nArray, true);
            } else {
                h.a(5, nArray, null);
                h.y(cV[n][6]);
            }
            h.d(f2);
        }
    }

    static int[] a(int n, f f2, f f3) {
        int n2;
        int[] nArray = null;
        if (h.uf(n) && null != f3) {
            n2 = cV[n][4];
            if (f3.j()) {
                n2 += 983040;
            }
            if (f2.b(f3) > n2) {
                f3 = null;
            }
        }
        if (null == f3) {
            nArray = u;
            n2 = cV[n][4];
            int n3 = f2.l[3];
            nArray[0] = f2.l[0] + h.c(n2, h.h(n3));
            nArray[1] = f2.l[1] + h.c(n2, h.g(n3));
            nArray[2] = 0;
            if (h.e(f2.l, nArray, C)) {
                nArray = C;
            }
            h.a(f2, n, nArray);
        } else if (h.e(f2.l, f3.l, C)) {
            nArray = C;
            h.a(f2, n, nArray);
        } else {
            n2 = f3.a(cV[n][2], f2) ? 1 : 0;
            nArray = f3.l;
            if (n2 != 0) {
                if (h.uf(n)) {
                    f3.f(f2);
                } else {
                    if (n == 15 && !f3.j()) {
                        h.a(0x320000, 100, f3.l, true);
                    }
                    f3.e(f2);
                }
            }
            h.d(f2);
            h.y(cV[n][6]);
        }
        return h.a(n, f2.l, nArray);
    }

    static f a(int n, f f2, int n2) {
        int[] nArray = f2.l;
        f f3 = null;
        Vector<f> vector = new Vector<f>();
        while (true) {
            int n3 = Integer.MAX_VALUE;
            int n4 = 0;
            f3 = null;
            for (int i = 0; i < eB.length; ++i) {
                int n5;
                int n6;
                f f4 = eB[i];
                if (f4.z == f2.z || f2.b(f4) > cV[n][4] + (f4.j() && h.uf(n) ? 983040 : 0) || vector.contains(f4) || (n6 = f4.d(f2)) <= n4 || !h.dh(f4.l[0] >> 16, f4.l[1] >> 16) || Math.abs(h.h(n5 = h.g(f4.l[0] - nArray[0], f4.l[1] - nArray[1]), nArray[3])) > 51472) continue;
                n4 = n6;
                f3 = f4;
            }
            if (f3 == null) break;
            vector.addElement(f3);
        }
        if (0 != vector.size()) {
            return (f)vector.elementAt(n2 % vector.size());
        }
        return null;
    }

    static boolean cZ(int n, int n2) {
        return n2 > cV[n][3];
    }

    static boolean uf(int n) {
        return n == 0 || n == 1 || n == 2 || n == 16;
    }

    static int ug(int n) {
        for (int i = 0; i < cV.length; ++i) {
            if (n != cV[i][0]) continue;
            return cV[i][1];
        }
        return -1;
    }

    static boolean uh(int n) {
        for (int i = 0; i < cV.length; ++i) {
            int n2 = cV[i][0];
            if (n2 < 0 || n != cV[i][1] || !aH[n2]) continue;
            return true;
        }
        return false;
    }

    static int ui(int n) {
        return cV[n][0];
    }

    static int uj(int n) {
        for (int i = 0; i < cV.length; ++i) {
            int n2 = cV[i][0];
            if (n2 < 0 || n != cV[i][1] || aG[n2] <= 0) continue;
            return i;
        }
        return -1;
    }

    static int uk(int n) {
        for (int i = 0; i < cV.length; ++i) {
            if (n != cV[i][0]) continue;
            return i;
        }
        return -1;
    }

    static void jR() {
        cW = -1;
        cX = 0;
        cY = -1;
    }

    static void y(DataInputStream dataInputStream) throws IOException {
        cW = dataInputStream.readInt();
        cY = dataInputStream.readInt();
    }

    static void g(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(cW);
        dataOutputStream.writeInt(cY);
    }

    static void jS() {
        f f2 = null;
        if (gL[1]) {
            f2 = h.uC(25);
            if (f2 != null) {
                f.F.c(f2.h, f2.i);
                f.F.c(102944);
            }
            h.jR();
        } else {
            f2 = h.uC(24);
            if (f2 != null) {
                eE.c(f2.h, f2.i);
            }
        }
    }

    static void jT() {
        cZ = false;
        da = -1;
        fW = -1;
        h.h();
        h.i();
        h.o();
        h.m();
        h.jJ();
        h.kV();
        h.jR();
        h.lA();
        h.lK();
        h.jQ();
    }

    static void z(DataInputStream dataInputStream) throws IOException {
        cZ = dataInputStream.readBoolean();
        h.n(dataInputStream);
        h.p(dataInputStream);
        h.t(dataInputStream);
        h.r(dataInputStream);
        h.v(dataInputStream);
        h.H(dataInputStream);
        h.y(dataInputStream);
        h.L(dataInputStream);
        h.w(dataInputStream);
    }

    static void h(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeBoolean(cZ);
        h.a(dataOutputStream);
        h.b(dataOutputStream);
        h.d(dataOutputStream);
        h.c(dataOutputStream);
        h.e(dataOutputStream);
        h.j(dataOutputStream);
        h.g(dataOutputStream);
        h.k(dataOutputStream);
        h.f(dataOutputStream);
    }

    static void ul(int n) {
        da -= n;
        fW -= n;
        h.uc(n);
        h.G(n);
        h.tO(n);
    }

    static boolean jU() {
        return !cZ;
    }

    static void jV() {
        h.n(24);
        h.n(2);
    }

    static void jW() {
        h.o(24);
        h.o(2);
    }

    static void um(int n) {
        df += n;
    }

    static void b(g g2) {
        switch (df / 3000) {
            case 0: {
                g2.a(0);
                g2.d(0, 0, 240, 320);
                h.a(g2, 1372, 120, 160);
                break;
            }
            case 1: {
                g2.a(0);
                g2.d(0, 0, 240, 320);
                h.a(g2, 1373, 120, 160);
                break;
            }
            case 2: {
                g2.a(0);
                g2.d(0, 0, 240, 320);
                h.a(g2, 1374, 120, 160);
                break;
            }
            default: {
                h.vT(4);
            }
        }
    }

    static void un(int n) {
        if (df / 3000 != 0) {
            df += 3000;
        }
        if (9 == n) {
            h.mb();
        }
    }

    static void jX() {
        h.n(26);
        h.n(10);
        int[] nArray = dg;
        if (h.jU()) {
            nArray = h.a(nArray, 48);
        }
        if (hb) {
            nArray = h.a(nArray, 49);
            nArray = h.a(nArray, 48);
        } else {
            nArray = h.a(nArray, 666);
            nArray = h.a(nArray, 670);
        }
        if (!gZ) {
            nArray = h.a(nArray, 999);
        }
        h.d(nArray);
        for (int i = 0; i < dh.length; ++i) {
            if (dl != dh[i]) continue;
            di = i;
            dj = dm;
        }
    }

    static void jY() {
        h.d(null);
    }

    static void c(g g2) {
        h.a(g2, null);
        h.b(g2, 25, 36, 190, 273);
        h.a(g2, S[15], null, false);
    }

    static void uo(int n) {
        switch (h.up(n)) {
            case 49: {
                if (h.jU()) {
                    h.b(7, false);
                    break;
                }
                dn = S[49];
                dG = 65;
                dH = 8;
                dI = 9;
                h.b(8, false);
                break;
            }
            case 48: {
                h.p();
                h.lJ();
                h.b(9, true);
                gU = true;
                break;
            }
            case 33: {
                h.b(6, false);
                break;
            }
            case 45: {
                dn = S[45];
                do = S[61];
                h.b(5, false);
                break;
            }
            case 44: {
                dn = S[44];
                do = S[60];
                h.b(5, false);
                break;
            }
            case 35: {
                if (n != 9) break;
            }
            case 31: {
                dn = S[31];
                dG = 63;
                dH = 8;
                dI = 9;
                h.b(8, false);
                break;
            }
            case 999: {
                h.mi();
                break;
            }
            case 666: {
                dn = "";
                dG = 668;
                dH = 28;
                dI = 10;
                h.b(8, false);
                break;
            }
            case 670: {
                h.mk();
            }
        }
    }

    static void d(int[] nArray) {
        dh = nArray;
        di = 0;
        dj = 0;
        dk = 0;
    }

    static void b(g g2, int n, int n2, int n3, int n4) {
        if (null == dh) {
            return;
        }
        int n5 = h.v(3) - 3;
        int n6 = Math.min(n4 / n5, dh.length);
        int n7 = n6 * n5;
        dk = Math.min(dj + n6, dh.length);
        for (int i = dj; i < dk; ++i) {
            h.a(g2, h.wv(dh[i]), n, n2 + (n4 - n7) / 2 + (i - dj) * n5, n3, n5, di == i);
        }
        if (dj > 0) {
            h.a(g2, 974, n + n3, n2 + (h.q(974) >> 1));
        }
        if (dk < dh.length) {
            h.a(g2, 976, n + n3, n2 + n4 - (h.q(976) >> 1));
        }
    }

    static void a(g g2, String string, int n, int n2, int n3, int n4, boolean bl) {
        int n5 = bl ? 4 : 3;
        int n6 = h.a(n5, string);
        int n7 = n + (n3 >> 1);
        int n8 = n2 + (n4 >> 1);
        h.a(g2, string, n5, n7, n8, 3);
        if (!bl) {
            return;
        }
        if (!fG) {
            h.a(g2, 1093, n7 - (n6 >> 1), n8);
            h.a(g2, 1092, n7 + (n6 >> 1), n8);
        }
    }

    static void a(g g2, String string, String string2, boolean bl) {
        int n = 3;
        if (bl) {
            int n2 = n = d / 400L % 2L == 0L ? 4 : 3;
        }
        if (null != string) {
            h.a(g2, string, n, 7, 309, 6);
        }
        if (null != string2) {
            h.a(g2, string2, n, 234, 309, 10);
        }
    }

    static int up(int n) {
        if (null == dh) {
            return -1;
        }
        if (0 == dh.length) {
            return -1;
        }
        if (0 == dk) {
            return -1;
        }
        if (n == 2) {
            ++di;
        } else if (n == 0) {
            --di;
        } else {
            if (n == 4 || n == 7) {
                dm = dj;
                dl = dh[di];
                return dl;
            }
            if (n == 8 || n == 9) {
                return 35;
            }
        }
        if (di < 0) {
            di = 0;
        } else if (di > dh.length - 1) {
            di = dh.length - 1;
        }
        if (di < dj) {
            dj = di;
        }
        if (di >= dk) {
            dj = di - (dk - dj - 1);
        }
        return -1;
    }

    static int[] a(int[] nArray, int n) {
        int n2 = 0;
        for (int i = 0; i < nArray.length; ++i) {
            if (n == nArray[i]) continue;
            ++n2;
        }
        int[] nArray2 = new int[n2];
        int n3 = 0;
        for (int i = 0; i < nArray.length; ++i) {
            if (n == nArray[i]) continue;
            nArray2[n3++] = nArray[i];
        }
        return nArray2;
    }

    static void a(g g2, String string) {
        int n;
        short s = h.q(982);
        int n2 = h.p(982) >> 1;
        int n3 = 320 + (s >> 1);
        for (n = -s >> 1; n <= n3; n += s) {
            h.a(g2, 982, n2, n);
            h.a(g2, 982, 240 - n2, n);
        }
        s = h.q(981);
        n2 = 120;
        n = 320 - h.q(983);
        n3 = -s >> 1;
        h.a(g2, 980, n2, n - (h.q(980) >> 1));
        n -= h.q(980) + (s >> 1);
        while (n >= n3) {
            h.a(g2, 981, n2, n);
            n -= s;
        }
        s = h.p(983);
        n = 0 + (h.q(1080) >> 1);
        n3 = 240 + (s >> 1);
        int n4 = 320 - (h.q(983) >> 1);
        for (int i = s >> 1; i < n3; i += s) {
            h.a(g2, 983, i, n);
            h.a(g2, 983, i, n4);
        }
        n = n4 - (h.q(983) >> 2);
        h.a(g2, 989, 120 - (h.p(989) >> 1), n);
        h.a(g2, 990, 120 + (h.p(989) >> 1), n);
        h.a(g2, 1080, 120, 0);
    }

    static void jZ() {
        h.a(do, 1, 190, null == dn ? 199 : 180);
    }

    static void ka() {
        dp = null;
        do = null;
    }

    static void d(g g2) {
        h.a(g2, dn);
        h.a(g2, 26, dn == null ? 81 : 100);
        h.a(g2, 229, 100, 4, 160, 0xFFFFFF);
        h.a(g2, null, S[10], false);
    }

    static void uq(int n) {
        if (h.a(n, false)) {
            return;
        }
        if (n == 8 || n == 9) {
            h.b(4, false);
        }
    }

    static void a(String string, int n, int n2, int n3) {
        ds = 0;
        dp = h.a(string, n, n2);
        dq = n;
        dr = dp.size();
        du = 0;
        dv = Math.min(dr, du + n3 / h.v(n));
        dw = n3 / h.v(n);
    }

    static void a(g g2, int n, int n2) {
        int n3 = h.v(dq);
        for (int i = du; i < Math.min(dv, dr); ++i) {
            h.a(g2, (String)dp.elementAt(i), dq, n, n2 + (i - du) * n3, 20);
        }
    }

    static void a(g g2, int n, int n2, int n3, int n4, int n5) {
        if (dv - du == dr) {
            return;
        }
        g2.a(h.b(0, n5, 0, 255, 128));
        g2.d(n, n2, n3, n4);
        int n6 = du / dw;
        int n7 = (dr - 1) / dw + 1;
        g2.a(n5);
        g2.d(n, n2 + n4 * n6 / n7, n3, n4 / n7);
    }

    static boolean a(int n, boolean bl) {
        switch (n) {
            case 2: {
                if (bl) {
                    if (ds >= dr - 1) break;
                    if (++ds >= dv) {
                        ++du;
                        ++dv;
                    }
                    return true;
                }
                if (du >= dr - dw) break;
                dv = (du += dw) + dw;
                return true;
            }
            case 0: {
                if (bl) {
                    if (ds <= 0) break;
                    if (--ds < du) {
                        --du;
                        --dv;
                    }
                    return true;
                }
                if (du <= 0) break;
                dv = (du -= dw) + dw;
                return true;
            }
        }
        return false;
    }

    static void kb() {
        int[] nArray = p ? dy : dx;
        if (fG || h.jU() || hb) {
            nArray = h.a(nArray, 59);
        }
        h.d(nArray);
        dh = h.e(dh);
    }

    static void kc() {
        h.d(null);
    }

    static void e(g g2) {
        h.a(g2, S[33]);
        h.b(g2, 25, 36, 190, 273);
        h.a(g2, S[59 == dh[di] ? 15 : 24], S[10], false);
    }

    static void ur(int n) {
        switch (h.up(n)) {
            case 35: {
                h.b(4, false);
                break;
            }
            case 36: 
            case 37: {
                af = !af;
                h.a(af);
                if (af) {
                    if (!gJ) {
                        h.y(0);
                    } else {
                        h.y(7);
                    }
                }
                dh = h.e(dh);
                break;
            }
            case 38: 
            case 39: {
                ao = !ao;
                h.B(1000);
                h.mg();
                dh = h.e(dh);
                break;
            }
            case 40: 
            case 41: {
                i = !i;
                h.mg();
                dh = h.e(dh);
                break;
            }
            case 42: 
            case 43: {
                q = !q;
                h.mg();
                dh = h.e(dh);
                break;
            }
            case 59: {
                dn = S[59];
                dG = 64;
                dH = 8;
                dI = 9;
                h.b(8, false);
            }
        }
    }

    static int[] e(int[] nArray) {
        block6: for (int i = 0; i < nArray.length; ++i) {
            switch (nArray[i]) {
                case 36: 
                case 37: {
                    nArray[i] = af ? 36 : 37;
                    continue block6;
                }
                case 38: 
                case 39: {
                    nArray[i] = ao ? 38 : 39;
                    continue block6;
                }
                case 40: 
                case 41: {
                    nArray[i] = h.i ? 40 : 41;
                    continue block6;
                }
                case 42: 
                case 43: {
                    nArray[i] = q ? 42 : 43;
                }
            }
        }
        return nArray;
    }

    static void kd() {
        h.n(31);
        if (dG != 71) {
            dz = true;
            dA = true;
        }
        h.kh();
    }

    static void ke() {
        h.o(31);
        h.ki();
    }

    static void kf() {
        if (!dz) {
            h.kj();
        }
        if (!h.A(0)) {
            h.y(0);
        }
    }

    static void f(g g2) {
        h.a(g2, null);
        h.a(g2, S[46], 4, 120, 87, 3);
        if (dz) {
            g2.a(12563456);
            g2.d(60, 99, 121, 11);
            h.a(g2, 999, 181 + h.p(999), 104);
            h.a(g2, 1001, 60 - h.p(1001), 104);
            h.a(g2, S[dA ? 448 : 449], 1, 120, 104, 3);
            h.a(g2, dA ? 1284 : 1285, 120, 196);
        } else {
            g2.a(12563456);
            g2.d(60, 212, 121, 11);
            h.a(g2, S[47], 1, 120, 217, 3);
            g2.a(4866895);
            g2.d(28, 225, 185, 15);
            g2.a(0);
            g2.c(28, 225, 185, 15);
            h.b(g2, 2, 120, 232);
        }
        h.a(g2, h.a(dz ? S[57] : S[58], 1, 178), 1, 124, 278, 3);
        h.a(g2, h.kk() ? null : S[5], S[10], false);
    }

    static void us(int n) {
        if (dz) {
            switch (n) {
                case 1: 
                case 3: {
                    dA = !dA;
                    break;
                }
                case 4: 
                case 7: {
                    dz = false;
                    break;
                }
                case 8: 
                case 9: {
                    h.b(4, false);
                }
            }
        } else {
            switch (h.ut(n)) {
                case 5: {
                    h.kg();
                    break;
                }
                case 10: {
                    dz = true;
                }
            }
        }
    }

    static void kg() {
        h.jT();
        aq = !dA;
        ap = new String(dB);
        cZ = true;
        h.lV();
        dn = S[56];
        dG = 71;
        dH = 8;
        dI = 9;
        h.b(8, false);
    }

    static void kh() {
        dB = new StringBuffer();
        dB.append(S[101]);
        dF = '\u0000';
        dE = 6;
        n = false;
    }

    static void ki() {
        dB = null;
        n = true;
    }

    static void kj() {
        if ((int)(d - dD) >= 1000) {
            h.kl();
        }
    }

    static boolean kk() {
        return dB.length() == 0;
    }

    static boolean kl() {
        if (dB.length() < dE && '\u0000' != dF) {
            if (0 == dB.length()) {
                dB.append(dF);
            } else {
                dB.append(Character.toLowerCase(dF));
            }
            dF = '\u0000';
            return true;
        }
        return false;
    }

    static int ut(int n) {
        switch (n) {
            case 4: 
            case 7: {
                h.kl();
                if (h.kk()) break;
                return 5;
            }
            case 8: {
                return 10;
            }
            case 3: 
            case 9: {
                if (h.kk()) {
                    return 10;
                }
                if ('\u0000' != dF) {
                    dF = '\u0000';
                    break;
                }
                if (dB.length() <= 0) break;
                dB.deleteCharAt(dB.length() - 1);
                break;
            }
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: {
                int n2 = n - 10;
                String string = S[74 + n2];
                if (n == dC && '\u0000' != dF && 1 < string.length()) {
                    int n3 = string.indexOf(dF);
                    int n4 = -1 == n3 ? 0 : (n3 + 1) % string.length();
                    dF = string.charAt(n4);
                } else {
                    h.kl();
                    if (dB.length() < dE) {
                        dF = string.charAt(0);
                    }
                }
                dC = n;
                dD = d;
            }
        }
        return -1;
    }

    static void b(g g2, int n, int n2, int n3) {
        String string = dB.toString();
        int n4 = h.a(n, string);
        int n5 = n;
        String string2 = "";
        if ('\u0000' != dF) {
            string2 = String.valueOf(dF);
        } else if (dB.length() < dE) {
            if (d % 1000L < 500L) {
                string2 = "_";
            }
        } else {
            switch (n5) {
                case 1: {
                    n5 = 2;
                    break;
                }
                case 2: {
                    n5 = 1;
                    break;
                }
                case 3: {
                    n5 = 4;
                    break;
                }
                case 4: {
                    n5 = 3;
                }
            }
        }
        h.a(g2, string, n5, n2, n3, 3);
        h.a(g2, string2, n5, n2 + n4 / 2, n3, 6);
    }

    static void km() {
        do = h.wv(dG);
        h.jZ();
    }

    static void kn() {
        h.ka();
    }

    static void g(g g2) {
        if (dG == 68) {
            g2.a(0);
            g2.d(0, 0, 240, 320);
        } else if (dG == 91) {
            h.aa(g2);
        } else {
            h.a(g2, dn);
        }
        int n = 1;
        int n2 = h.v(n);
        int n3 = 190 - (dn == null ? 4 : 0);
        for (int i = du; i < dv; ++i) {
            h.a(g2, (String)dp.elementAt(i), n, 120, n3 - dr * n2 / 2 + (i - du) * n2, 17);
        }
        h.a(g2, dH != -1 ? h.wv(dH) : null, dI != -1 ? h.wv(dI) : null, false);
    }

    static void uu(int n) {
        switch (n) {
            case 4: 
            case 7: {
                h.uv(dH);
                break;
            }
            case 8: {
                h.uv(dI);
                break;
            }
            case 9: {
                h.uv(10);
            }
        }
    }

    static void uv(int n) {
        switch (dG) {
            case 63: {
                if (n == 8) {
                    h.mb();
                    break;
                }
                h.b(4, false);
                break;
            }
            case 65: {
                if (n == 8) {
                    h.b(7, false);
                    break;
                }
                h.b(4, false);
                break;
            }
            case 71: {
                if (n == 10) {
                    h.b(7, false);
                    break;
                }
                cj = n == 8;
                h.b(9, true);
                h.aV(false);
                gU = true;
                h.vM(4);
                break;
            }
            case 66: {
                h.kn();
                db = 9;
                if (n != 8) break;
                h.vT(4);
                break;
            }
            case 68: {
                if (n == 10) {
                    h.mb();
                    break;
                }
                af = n == 8;
                h.a(af);
                h.vT(3);
                break;
            }
            case 91: {
                if (n == 8) {
                    h.b(9, true);
                    break;
                }
                h.vT(4);
                break;
            }
            case 64: {
                if (n == 8) {
                    h.jT();
                    h.b(4, false);
                    break;
                }
                h.vT(6);
                break;
            }
            case 668: {
                if (n == 28) {
                    h.b(7, false);
                    break;
                }
                if (n != 10) break;
                h.b(4, false);
                break;
            }
            case 669: {
                if (n == 667) {
                    h.mk();
                    break;
                }
                if (n != 11) break;
                h.b(4, false);
                break;
            }
            case 1200: {
                if (n == 5) {
                    if (h.h(hc)) {
                        h.mb();
                        break;
                    }
                    h.b(4, false);
                    break;
                }
                if (n != 10) break;
                h.b(4, false);
            }
        }
    }

    public static final int[][] a(int n, int n2, int n3, int n4, int n5, boolean bl, int n6, int n7, int n8) {
        int[][] nArray = h.a(n, n2, bl, n6, n7, n8);
        nArray[10][0] = 0;
        nArray[7] = h.f(0, 0);
        nArray[8] = h.f(0, 0);
        nArray[9] = h.f(0, 0);
        h.b(nArray, n5);
        h.c(nArray, n3 / 2, n4 / 2);
        return nArray;
    }

    public static final void a(int[][] nArray, int n, int n2) {
        nArray[9][0] = n;
        nArray[9][1] = n2;
    }

    public static final void a(int[][] nArray, int n) {
        nArray[10][1] = n;
        h.c(nArray, n);
    }

    public static final int[] a(int[][] nArray, int[] nArray2) {
        int n = h.c(nArray[9][0], Math.abs(h.d(nArray2, nArray[7]))) + h.c(nArray[9][1], Math.abs(h.d(nArray2, nArray[8])));
        int n2 = h.d(nArray[0], nArray2);
        nArray[2][0] = n2 - n;
        nArray[2][1] = n2 + n;
        return nArray[2];
    }

    private static final void c(int[][] nArray, int n) {
        int n2;
        int n3 = h.g(n);
        nArray[7][0] = n2 = h.h(n);
        nArray[7][1] = n3;
        nArray[8][0] = -n3;
        nArray[8][1] = n2;
    }

    public static final int[][] a(int n, int n2, int n3, boolean bl, int n4, int n5, int n6) {
        int[][] nArray = h.a(n, n2, bl, n4, n5, n6);
        nArray[10][0] = 1;
        nArray[10][8] = n3;
        return nArray;
    }

    public static final void b(int[][] nArray, int n, int n2) {
        nArray[10][8] = n;
    }

    public static final int[] b(int[][] nArray, int[] nArray2) {
        int n = h.d(nArray[0], nArray2);
        int n2 = nArray[10][8];
        nArray[2][0] = n - n2;
        nArray[2][1] = n + n2;
        return nArray[2];
    }

    public static final int[] a(int[][] nArray) {
        int n = nArray[10][8];
        nArray[2][0] = nArray[0][0] - n;
        nArray[2][1] = nArray[0][0] + n;
        return nArray[2];
    }

    public static final int[] b(int[][] nArray) {
        int n = nArray[10][8];
        nArray[2][0] = nArray[0][1] - n;
        nArray[2][1] = nArray[0][1] + n;
        return nArray[2];
    }

    public static final int[][] h(int n, int n2, int n3) {
        int[][] nArray = h.a(0, 0, true, n, n2, n3);
        nArray[10][0] = 2;
        return nArray;
    }

    public static final int[][] a(int n, int n2, boolean bl, int n3, int n4, int n5) {
        int[][] nArrayArray = new int[11][];
        nArrayArray[2] = new int[2];
        nArrayArray[0] = h.f(n, n2);
        nArrayArray[1] = h.f(n, n2);
        nArrayArray[4] = h.f(0, 0);
        nArrayArray[3] = h.f(0, 0);
        nArrayArray[5] = h.f(0, 0);
        nArrayArray[6] = h.f(0, 0);
        nArrayArray[10] = new int[9];
        nArrayArray[10][0] = -1;
        nArrayArray[10][3] = n3;
        nArrayArray[10][4] = h.d(65536, n3);
        nArrayArray[10][5] = bl ? 1 : 0;
        nArrayArray[10][2] = n4;
        nArrayArray[10][6] = n5;
        nArrayArray[10][7] = 1;
        return nArrayArray;
    }

    public static final void c(int[][] nArray, int n, int n2) {
        switch (nArray[10][0]) {
            case 0: {
                h.a(nArray, n, n2);
                break;
            }
            case 1: {
                h.b(nArray, n, n2);
            }
        }
    }

    public static final void c(int[][] nArray, int[] nArray2) {
        nArray[0][0] = nArray2[0];
        nArray[0][1] = nArray2[1];
        nArray[1][0] = nArray2[0];
        nArray[1][1] = nArray2[1];
    }

    public static final void b(int[][] nArray, int n) {
        switch (nArray[10][0]) {
            case 0: {
                h.a(nArray, n);
                break;
            }
            default: {
                nArray[10][1] = n;
            }
        }
    }

    static void ko() {
        h.dK[0] = 0;
        h.dK[1] = 0;
        h.dL[0] = 0;
        h.dL[1] = 0;
    }

    static void kp() {
        dM.removeAllElements();
        dN.removeAllElements();
    }

    static void uw(int n) {
        Object object;
        int n2;
        int n3 = h.c(n << 16, 65);
        int n4 = h.d(65536, n3);
        int n5 = dM.size();
        for (n2 = 0; n2 < n5; ++n2) {
            object = (f)dN.elementAt(n2);
            if (null == object) continue;
            int[][] nArray = (int[][])((f)object).E;
            boolean bl = ((f)object).f();
            int n6 = nArray[10][7] = bl ? 1 : 0;
            if (!bl) continue;
            nArray[1][0] = ((f)object).m[0];
            nArray[1][1] = ((f)object).m[1];
            nArray[0][0] = ((f)object).l[0];
            nArray[0][1] = ((f)object).l[1];
            h.b(nArray, ((f)object).l[3]);
        }
        for (n2 = 0; n2 < n5; ++n2) {
            dR = (f)dN.elementAt(n2);
            object = (int[][])dM.elementAt(n2);
            if (false == object[10][7]) continue;
            for (int i = n2 + 1; i < n5; ++i) {
                boolean bl;
                dS = (f)dN.elementAt(i);
                int[][] nArray = (int[][])dM.elementAt(i);
                if (0 == nArray[10][7]) continue;
                boolean bl2 = null != dR ? dR.c(dS) : (bl = null != dS ? dS.c(dR) : true);
                if (!bl || !h.a((int[][])object, nArray)) continue;
                int n7 = h.c(n4, dO[0]);
                int n8 = h.c(n4, dO[1]);
                if (null != dR) {
                    dR.a(dS, n7, n8);
                }
                if (null == dS) continue;
                dS.a(dR, -n7, -n8);
            }
        }
        for (n2 = 0; n2 < n5; ++n2) {
            int[][] nArray;
            object = (f)dN.elementAt(n2);
            if (null == object || 0 == (nArray = (int[][])((f)object).E)[10][7]) continue;
            ((f)object).d(nArray[0][0], nArray[0][1]);
        }
    }

    static void h(g g2) {
    }

    static void a(f f2, int n) {
        int[][] nArray = null;
        switch (n) {
            case 0: {
                nArray = h.a(0, 0, h.d(10), h.d(10), 0, false, 393216, 0, 45875);
                break;
            }
            case 1: {
                nArray = h.a(0, 0, h.d(10), false, 65536, 0, 45875);
                break;
            }
            case 2: {
                nArray = h.h(655360000, 0, 45875);
            }
        }
        dN.addElement(f2);
        dM.addElement(nArray);
        if (null != f2) {
            f2.E = nArray;
        }
    }

    static void c(f f2, int n, int n2, int n3) {
        int[][] nArray = (int[][])f2.E;
        nArray[10][3] = n;
        h.c(nArray, n2, n3);
    }

    static boolean a(int[][] nArray, int[][] nArray2) {
        if (nArray[10][5] > 0 && nArray2[10][5] > 0) {
            return false;
        }
        int n = nArray[10][0];
        int n2 = nArray2[10][0];
        if (0 == n && 0 == n2) {
            return h.b(nArray, nArray2);
        }
        if (1 == n && 1 == n2) {
            return h.d(nArray, nArray2);
        }
        if (0 == n && 1 == n2) {
            return h.c(nArray, nArray2);
        }
        if (1 == n && 0 == n2) {
            return h.c(nArray2, nArray);
        }
        if (0 == n && 2 == n2) {
            return h.e(nArray, nArray2);
        }
        if (2 == n && 0 == n2) {
            return h.e(nArray2, nArray);
        }
        if (1 == n && 2 == n2) {
            return h.g(nArray, nArray2);
        }
        if (2 == n && 1 == n2) {
            return h.g(nArray2, nArray);
        }
        return false;
    }

    static boolean b(int[][] nArray, int[][] nArray2) {
        int[] nArray3 = dT;
        nArray3[0] = 0;
        nArray3[1] = 0;
        int n = Integer.MAX_VALUE;
        for (int i = 0; i < 2; ++i) {
            int[] nArray4 = nArray[7 + i];
            int n2 = h.h(h.a(nArray, nArray4), h.a(nArray2, nArray4));
            if (n2 == 0) {
                return false;
            }
            int[] nArray5 = nArray2[7 + i];
            int n3 = h.h(h.a(nArray, nArray5), h.a(nArray2, nArray5));
            if (n3 == 0) {
                return false;
            }
            int n4 = Math.abs(n2);
            int n5 = Math.abs(n3);
            if (n4 >= Math.abs(n) && n5 >= Math.abs(n)) continue;
            boolean bl = n4 < n5;
            nArray3 = bl ? nArray4 : nArray5;
            n = bl ? n2 : n3;
        }
        h.a(nArray, nArray2, nArray3, n);
        return true;
    }

    static boolean c(int[][] nArray, int[][] nArray2) {
        int n;
        int[] nArray3;
        int n2;
        int[] nArray4 = dT;
        nArray4[0] = 0;
        nArray4[1] = 0;
        int[] nArray5 = dU;
        int n3 = Integer.MAX_VALUE;
        for (n2 = 0; n2 < 2; ++n2) {
            nArray3 = nArray[7 + n2];
            n = h.h(h.a(nArray, nArray3), h.b(nArray2, nArray3));
            if (n == 0) {
                return false;
            }
            if (Math.abs(n) < Math.abs(n3)) {
                nArray4[0] = nArray3[0];
                nArray4[1] = nArray3[1];
                n3 = n;
            }
            nArray5[n2] = n;
        }
        n2 = nArray2[10][8];
        if (Math.abs(nArray5[0]) < n2 && Math.abs(nArray5[1]) < n2) {
            nArray3 = dV;
            h.a(nArray3, nArray2[0], nArray);
            nArray4[0] = nArray3[0] - nArray2[0][0];
            nArray4[1] = nArray3[1] - nArray2[0][1];
            n = h.e(nArray4[0], nArray4[1]);
            n3 = n2 - n;
            if (n3 > 0) {
                nArray4[0] = h.d(nArray4[0], n);
                nArray4[1] = h.d(nArray4[1], n);
            } else {
                return false;
            }
        }
        h.a(nArray, nArray2, nArray4, n3);
        return true;
    }

    static boolean d(int[][] nArray, int[][] nArray2) {
        int n = h.h(h.a(nArray), h.a(nArray2));
        if (n == 0) {
            return false;
        }
        int n2 = h.h(h.b(nArray), h.b(nArray2));
        if (n2 == 0) {
            return false;
        }
        int[] nArray3 = dT;
        nArray3[0] = nArray[0][0] - nArray2[0][0];
        nArray3[1] = nArray[0][1] - nArray2[0][1];
        int n3 = h.e(nArray3[0], nArray3[1]);
        int n4 = nArray[10][8] + nArray2[10][8] - n3;
        if (n4 <= 0) {
            return false;
        }
        nArray3[0] = h.d(nArray3[0], n3);
        nArray3[1] = h.d(nArray3[1], n3);
        h.a(nArray, nArray2, nArray3, n4);
        return true;
    }

    static boolean e(int[][] nArray, int[][] nArray2) {
        int n = nArray[0][0] - nArray[1][0];
        int n2 = nArray[0][1] - nArray[1][1];
        int n3 = Math.max(Math.abs(n), Math.abs(n2)) >> 16;
        int n4 = n3 / (ef / 4);
        if (n4 > 1) {
            h.dQ[0] = nArray[0][0];
            h.dQ[1] = nArray[0][1];
            for (int i = 0; i < n4; ++i) {
                nArray[0][0] = nArray[1][0] + n * i / n4;
                nArray[0][1] = nArray[1][1] + n2 * i / n4;
                if (!h.f(nArray, nArray2)) continue;
                return true;
            }
            nArray[0][0] = dQ[0];
            nArray[0][1] = dQ[1];
        }
        return h.f(nArray, nArray2);
    }

    static boolean f(int[][] nArray, int[][] nArray2) {
        if (null == dY) {
            dY = h.a(0, 0, ef << 16, eg << 16, 0, true, nArray2[10][3], nArray2[10][2], nArray2[10][6]);
        }
        int n = h.c(92681, Math.max(nArray[9][0], nArray[9][1]));
        int n2 = (nArray[0][0] - n >> 16) / 3 >> ee;
        int n3 = (nArray[0][1] - n >> 16) / 3 >> ee;
        int n4 = (nArray[0][0] + n >> 16) / 3 >> ee;
        int n5 = (nArray[0][1] + n >> 16) / 3 >> ee;
        boolean bl = false;
        for (int i = n3; i <= n5; ++i) {
            for (int j = n2; j <= n4; ++j) {
                if (!h.dc(j, i)) continue;
                h.dP[0] = j * ef + (ef >> 1) << 16;
                h.dP[1] = i * eg + (eg >> 1) << 16;
                h.c(dY, dP);
                bl |= h.b(nArray, dY);
            }
        }
        return bl;
    }

    static boolean g(int[][] nArray, int[][] nArray2) {
        int[] nArray3 = nArray[0];
        int[] nArray4 = nArray[1];
        int n = nArray3[0] - nArray4[0];
        int n2 = nArray3[1] - nArray4[1];
        int n3 = Math.max(Math.abs(n), Math.abs(n2)) >> 16;
        int n4 = n3 / (ef / 4);
        if (n4 > 1) {
            h.dQ[0] = nArray3[0];
            h.dQ[1] = nArray3[1];
            for (int i = 0; i < n4; ++i) {
                nArray3[0] = nArray4[0] + n * i / n4;
                nArray3[1] = nArray4[1] + n2 * i / n4;
                if (!h.h(nArray, nArray2)) continue;
                return true;
            }
            nArray3[0] = dQ[0];
            nArray3[1] = dQ[1];
        }
        return h.h(nArray, nArray2);
    }

    static boolean h(int[][] nArray, int[][] nArray2) {
        if (null == dY) {
            dY = h.a(0, 0, ef << 16, eg << 16, 0, true, nArray2[10][3], nArray2[10][2], nArray2[10][6]);
        }
        int n = nArray[10][8];
        int n2 = (nArray[0][0] - n >> 16) / 3 >> ee;
        int n3 = (nArray[0][1] - n >> 16) / 3 >> ee;
        int n4 = (nArray[0][0] + n >> 16) / 3 >> ee;
        int n5 = (nArray[0][1] + n >> 16) / 3 >> ee;
        boolean bl = false;
        for (int i = n3; i <= n5; ++i) {
            for (int j = n2; j <= n4; ++j) {
                if (2 == (null == h.dR ? h.dS : h.dR).d ? !h.db(j, i) : !h.dc(j, i)) continue;
                h.dP[0] = j * ef + (ef >> 1) << 16;
                h.dP[1] = i * eg + (eg >> 1) << 16;
                h.c(dY, dP);
                bl |= h.c(dY, nArray);
            }
        }
        return bl;
    }

    static int h(int[] nArray, int[] nArray2) {
        int n = nArray2[1] - nArray[0];
        if (n < 0) {
            return 0;
        }
        int n2 = nArray2[0] - nArray[1];
        if (n2 > 0) {
            return 0;
        }
        return Math.abs(n) < Math.abs(n2) ? n : n2;
    }

    static void a(int[] nArray, int[] nArray2, int[][] nArray3) {
        int[] nArray4 = dW;
        nArray4[0] = nArray2[0] - nArray3[0][0];
        nArray4[1] = nArray2[1] - nArray3[0][1];
        int[] nArray5 = nArray;
        nArray5[0] = nArray3[0][0];
        nArray5[1] = nArray3[0][1];
        for (int i = 0; i < 2; ++i) {
            int[] nArray6 = nArray3[7 + i];
            int n = h.d(nArray4, nArray6);
            n = n >= 0 ? nArray3[9][i] : -nArray3[9][i];
            nArray5[0] = nArray5[0] + h.c(nArray6[0], n);
            nArray5[1] = nArray5[1] + h.c(nArray6[1], n);
        }
    }

    static void a(int[][] nArray, int[][] nArray2, int[] nArray3, int n) {
        h.dO[0] = h.c(nArray3[0], n);
        h.dO[1] = h.c(nArray3[1], n);
        int n2 = nArray[10][4] + nArray2[10][4];
        int[] nArray4 = dO;
        int n3 = h.d(nArray[10][4], n2);
        if (0 == nArray[10][5]) {
            int[] nArray5 = nArray[0];
            nArray5[0] = nArray5[0] + h.c(nArray4[0], n3);
            int[] nArray6 = nArray[0];
            nArray6[1] = nArray6[1] + h.c(nArray4[1], n3);
        }
        int n4 = h.d(nArray2[10][4], n2);
        if (0 == nArray2[10][5]) {
            int[] nArray7 = nArray2[0];
            nArray7[0] = nArray7[0] + h.c(nArray4[0], -n4);
            int[] nArray8 = nArray2[0];
            nArray8[1] = nArray8[1] + h.c(nArray4[1], -n4);
        }
    }

    static final void A(DataInputStream dataInputStream) throws IOException {
        int n;
        ea = new b[64];
        for (n = 0; n < 64; ++n) {
            h.ea[n] = new b();
        }
        dZ = new c[dataInputStream.readShort()];
        for (n = 0; n < dZ.length; ++n) {
            h.dZ[n] = new c();
            dZ[n].a(dataInputStream);
        }
        h.a("Effects loaded: " + dZ.length);
    }

    static final void kq() {
        for (int i = 0; i < 64; ++i) {
            ea[i].a();
        }
    }

    static final void ux(int n) {
        for (int i = 0; i < 64; ++i) {
            b b2 = ea[i];
            if (null == b2.a || b2.a.a(b2, n)) continue;
            h.uy(i);
        }
    }

    static final void a(g g2, int n) {
        for (int i = 0; i < 64; ++i) {
            b b2 = ea[i];
            if (null == b2.a) continue;
            b2.a.a(b2, g2, n);
        }
    }

    static final int a(int n, int[] nArray, Object object) {
        if (!q && 9 == n) {
            return -1;
        }
        for (int i = 0; i < 64; ++i) {
            b b2 = ea[i];
            if (null != b2.a) continue;
            b2.a = dZ[n];
            b2.a.a(b2, nArray, object);
            return i;
        }
        h.a("Effects_Create: max number of effects reached");
        return -1;
    }

    static final int a(int n, int n2, int n3, int n4, Object object) {
        h.v[0] = n2 << 16;
        h.v[1] = n3 << 16;
        h.v[2] = n4 << 16;
        return h.a(n, v, object);
    }

    static final void uy(int n) {
        if (n == -1) {
            return;
        }
        ea[n].a();
    }

    static Object a(int n, int n2, int n3, int n4) {
        for (int i = 0; i < eB.length; ++i) {
            f f2 = eB[i];
            if (!f2.a(n3, n4) || !f2.b(n, n2)) continue;
            return f2;
        }
        if ((0x40 & n3) == n3 && (0x40 & n4) == 0 && h.dc((n >> ee) / 3, (n2 >> ee) / 3)) {
            return b;
        }
        return null;
    }

    static Object b(f f2, int n, int n2) {
        for (int i = 0; i < eB.length; ++i) {
            f f3 = eB[i];
            if (f3 == f2 || !f3.a(n, n2) || !f3.a(f2)) continue;
            return f3;
        }
        if ((0x40 & n) == n && (0x40 & n2) == 0 && h.dc((f2.h >> ee) / 3, (f2.i >> ee) / 3)) {
            return b;
        }
        return null;
    }

    static void B(DataInputStream dataInputStream) throws IOException {
        int n;
        Thread.yield();
        dataInputStream.readShort();
        ec = dataInputStream.readShort();
        ed = dataInputStream.readShort();
        ef = dataInputStream.readShort();
        eg = dataInputStream.readShort();
        eh = dataInputStream.readShort();
        ei = dataInputStream.readShort();
        ee = (short)(h.c(ef) - 2);
        er = dataInputStream.readUnsignedShort();
        ek = dataInputStream.readShort();
        el = dataInputStream.readShort();
        em = dataInputStream.readShort();
        en = dataInputStream.readShort();
        eo = dataInputStream.readShort();
        ep = dataInputStream.readShort();
        es = new short[er * 3];
        for (n = 0; n < es.length; ++n) {
            h.es[n] = dataInputStream.readShort();
        }
        ej = new short[eh * ei];
        for (n = 0; n < ej.length; ++n) {
            h.ej[n] = dataInputStream.readShort();
        }
        eq = new short[eo * ep];
        for (n = 0; n < eq.length; ++n) {
            h.eq[n] = dataInputStream.readShort();
        }
        ev = dataInputStream.readInt() << 4;
        ew = dataInputStream.readInt() << 4;
        n = dataInputStream.readByte();
        if (n > 0) {
            dataInputStream.readShort();
            dataInputStream.readShort();
            et = dataInputStream.readShort();
            eu = dataInputStream.readShort();
            ex = new byte[et * eu];
            ey = new byte[et * eu];
            dataInputStream.readFully(ex);
        }
        if (n > 1) {
            dataInputStream.readShort();
            dataInputStream.readShort();
            dataInputStream.readShort();
            dataInputStream.readShort();
            dataInputStream.readFully(ey);
        }
        h.a(null, 2);
    }

    static void kr() {
        ej = null;
        ex = null;
        ey = null;
        eq = null;
        es = null;
    }

    static void a(g g2, short s, short s2, short s3, short s4, short s5, short s6, short[] sArray) {
        if (0 == s3 || 0 == s4) {
            return;
        }
        s = (short)(s - (s3 >> 1));
        s2 = (short)(s2 - (s4 >> 1));
        int n = Math.max(0, (g2.d() - s) / s3);
        int n2 = Math.max(0, (g2.e() - s2) / s4);
        int n3 = Math.min(s5, n + (g2.f() + (s3 - 1)) / s3 + 1);
        int n4 = Math.min(s6, n2 + (g2.g() + (s4 - 1)) / s4 + 1);
        s = (short)(s + (s3 >> 1));
        s2 = (short)(s2 + (s4 >> 1));
        for (int i = n2; i < n4; ++i) {
            int n5 = i * s5 + n;
            int n6 = s + s3 * n;
            int n7 = s2 + s4 * i;
            int n8 = n;
            while (n8 < n3) {
                short s7 = sArray[n5];
                if (s7 != -1) {
                    h.a(g2, (int)s7, n6, n7, 0);
                }
                ++n8;
                ++n5;
                n6 += s3;
            }
        }
    }

    static void i(g g2) {
        g2.d = 1;
        h.a(g2, ec, ed, ef, eg, eh, ei, ej);
        g2.d = 0;
        g2.d = (byte)2;
        int n = Math.max(0, (g2.d() >> ee) / 3);
        int n2 = Math.max(1, (g2.e() >> ee) / 3);
        int n3 = Math.min(et - 1, n + (g2.f() + (ef - 1) >> ee) / 3 + 1);
        int n4 = Math.min(eu, n2 + (g2.g() + (eg - 1) >> ee) / 3 + 1);
        int n5 = ef >> 1;
        int n6 = eg >> 1;
        for (int i = n2; i < n4; ++i) {
            int n7 = i * et + n;
            int n8 = n5 + ef * n;
            int n9 = n6 + eg * i;
            int n10 = n;
            while (n10 < n3) {
                if (4 != ex[n7]) {
                    if (4 == ex[n7 - et]) {
                        if (4 == ex[n7 - et + 1]) {
                            if (4 == ex[n7 + 1]) {
                                h.a(g2, 1361, n8, n9);
                            } else {
                                h.a(g2, 1359, n8, n9);
                            }
                        } else {
                            h.a(g2, 1360, n8, n9);
                        }
                    } else if (4 == ex[n7 + 1]) {
                        if (4 == ex[n7 - et + 1]) {
                            h.a(g2, 1357, n8, n9);
                        } else {
                            h.a(g2, 1356, n8, n9);
                        }
                    } else if (4 == ex[n7 - et + 1]) {
                        h.a(g2, 1358, n8, n9);
                    }
                }
                ++n10;
                ++n7;
                n8 += ef;
            }
        }
        g2.d = 0;
    }

    static void j(g g2) {
        h.a(g2, ek, el, em, en, eo, ep, eq);
    }

    static int da(int n, int n2) {
        int n3 = (n >> ee) / 3;
        int n4 = (n2 >> ee) / 3;
        if (n3 < 0 || n4 < 0 || n3 >= et || n4 >= eu) {
            return 1;
        }
        return ex[n4 * et + n3];
    }

    static void i(int n, int n2, int n3) {
        int n4 = (n >> ee) / 3;
        int n5 = (n2 >> ee) / 3;
        if (n4 < 0 || n5 < 0 || n4 >= et || n5 >= eu) {
            return;
        }
        h.ex[n5 * h.et + n4] = (byte)n3;
    }

    static void j(int n, int n2, int n3) {
        int n4 = (n - ec >> ee) / 3;
        int n5 = (n2 - ed >> ee) / 3;
        h.ej[n5 * h.eh + n4] = (short)n3;
    }

    static boolean e(int[] nArray, int[] nArray2, int[] nArray3) {
        int n = h.e(nArray[0] - nArray2[0], nArray[1] - nArray2[1]);
        int n2 = Math.min(ev, ew);
        int n3 = (n + n2 - 1) / n2;
        for (int i = 1; i <= n3; ++i) {
            h.b(B, nArray, nArray2, 0, n3, i);
            int n4 = h.a(B[0], ev);
            int n5 = h.a(B[1], ew);
            if (!h.dc(n4, n5) || 2 == ez) continue;
            if (null != nArray3) {
                h.b(nArray3, B);
            }
            return true;
        }
        return false;
    }

    static boolean db(int n, int n2) {
        if (n < 0 || n2 < 0 || n >= et || n2 >= eu) {
            ez = (byte)2;
            return true;
        }
        ez = ex[n2 * et + n];
        switch (ez) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 34: 
            case 35: {
                return true;
            }
        }
        return false;
    }

    static boolean dc(int n, int n2) {
        if (n < 0 || n2 < 0 || n >= et || n2 >= eu) {
            ez = (byte)2;
            return true;
        }
        ez = ex[n2 * et + n];
        switch (ez) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                return true;
            }
        }
        return false;
    }

    static int[][] C(DataInputStream dataInputStream) throws IOException {
        int[][] nArray = new int[dataInputStream.readByte()][5];
        for (int i = 0; i < nArray.length; ++i) {
            nArray[i][0] = dataInputStream.readShort() << 16;
            nArray[i][1] = dataInputStream.readShort() << 16;
            nArray[i][4] = dataInputStream.readUnsignedByte();
        }
        h.c(nArray);
        return nArray;
    }

    static void c(int[][] nArray) {
        int n = 0;
        for (int i = 1; i < nArray.length; ++i) {
            h.b(C, nArray[i], nArray[i - 1]);
            nArray[i][3] = n += h.c(C);
        }
    }

    static void a(int[] nArray, int[][] nArray2, int n) {
        for (int i = 1; i < nArray2.length; ++i) {
            if (n > nArray2[i][3]) continue;
            h.a(nArray, nArray2[i - 1], nArray2[i], nArray2[i - 1][3], nArray2[i][3], n);
            break;
        }
    }

    static int d(int[][] nArray, int n, int n2) {
        for (int i = n2 + 1; i < nArray.length; ++i) {
            if (n > nArray[i][3]) continue;
            h.b(B, nArray[i], nArray[i - 1]);
            return h.b(B);
        }
        return Integer.MIN_VALUE;
    }

    static int d(int[][] nArray) {
        return nArray[nArray.length - 1][3];
    }

    static void D(DataInputStream dataInputStream) throws IOException {
    }

    static void i(DataOutputStream dataOutputStream) throws IOException {
    }

    static void E(DataInputStream dataInputStream) throws IOException {
        eA = new int[dataInputStream.readShort()][8];
        for (int i = 0; i < eA.length; ++i) {
            h.eA[i][0] = dataInputStream.readInt();
            h.eA[i][1] = dataInputStream.readInt();
            h.eA[i][2] = dataInputStream.readShort();
            h.eA[i][3] = dataInputStream.readInt();
            h.eA[i][4] = dataInputStream.readInt();
            h.eA[i][5] = dataInputStream.readInt();
            h.eA[i][6] = dataInputStream.readInt();
            h.eA[i][7] = dataInputStream.readInt();
        }
    }

    static void F(DataInputStream dataInputStream) throws IOException {
        int n;
        eB = new f[dataInputStream.readUnsignedByte()];
        eD = new int[eB.length];
        for (n = 0; n < eB.length; ++n) {
            int n2 = dataInputStream.readUnsignedByte();
            if (n2 == 0 && aq) {
                n2 = 1;
            }
            f f2 = h.eB[n] = h.uA(eA[n2][0]);
            f2.c = n;
            f2.e = n2;
            f2.g = eA[n2];
            f2.h = dataInputStream.readShort();
            f2.i = dataInputStream.readShort();
            f2.k = dataInputStream.readShort();
            f2.q = dataInputStream.readByte();
            h.eD[n] = n;
        }
        eE = eB[0];
        h.a("Objects loaded: " + eB.length);
        eC = new int[dataInputStream.readShort()][][];
        for (n = 0; n < eC.length; ++n) {
            h.eC[n] = h.C(dataInputStream);
        }
        h.a("Routes loaded: " + eC.length);
        f.c();
        for (n = 0; n < eB.length; ++n) {
            eB[n].b();
        }
    }

    static void ks() {
        eC = null;
        eE = null;
        eB = null;
        eD = null;
    }

    static void uz(int n) {
        for (int i = 0; i < eB.length; ++i) {
            eB[i].a(n);
        }
        f.h();
    }

    static void k(g g2) {
        int n;
        int n2;
        int n3;
        int n4 = eB.length;
        g2.d = (byte)2;
        for (n3 = 0; n3 < n4 - 1; ++n3) {
            f f2 = eB[eD[n3]];
            if (0 != (f2.v & 1) || !h.h(f2)) continue;
            h.a(g2, 1362, f2.h, f2.i);
            if (2 != f2.d) continue;
            g2.d = 0;
            h.a(g2, 1104, f2.h, f2.i);
            g2.d = (byte)2;
        }
        g2.d = 0;
        do {
            n3 = 0;
            for (n2 = 0; n2 < n4 - 1; ++n2) {
                if (h.eB[h.eD[n2]].j <= h.eB[h.eD[n2 + 1]].j) continue;
                n = eD[n2];
                h.eD[n2] = eD[n2 + 1];
                h.eD[n2 + 1] = n;
                n3 = 1;
            }
        } while (n3 != 0);
        n3 = 0;
        n2 = 0;
        n = er * 3;
        int n5 = h.eB[h.eD[n3]].j;
        while (n2 < n) {
            short s = es[n2 + 0];
            if (-1 == s) {
                n2 += 3;
                continue;
            }
            if (n3 < n4) {
                short s2 = es[n2 + 2];
                while (n5 < s2) {
                    eB[eD[n3++]].a(g2);
                    if (n3 >= n4) break;
                    n5 = h.eB[h.eD[n3]].j;
                }
            }
            h.a(g2, (int)es[n2++], (int)es[n2++], (int)es[n2++]);
        }
        while (n3 < n4) {
            eB[eD[n3++]].a(g2);
        }
    }

    static f uA(int n) {
        return new f(n);
    }

    static f uB(int n) {
        for (int i = 0; i < eB.length; ++i) {
            f f2 = eB[i];
            if (f2.d != n || f2.f()) continue;
            return f2;
        }
        return null;
    }

    static f kt() {
        if (eE.s()) {
            return f.F;
        }
        return eE;
    }

    static f uC(int n) {
        for (int i = 0; i < eB.length; ++i) {
            if (h.eB[i].e != n) continue;
            return eB[i];
        }
        return null;
    }

    static void a(f f2, f f3) {
        for (int i = 0; i < eB.length; ++i) {
            f f4 = eB[i];
            boolean bl = false;
            switch (f4.d) {
                case 1: 
                case 5: 
                case 6: 
                case 7: {
                    bl = f4.B == 1;
                    break;
                }
                case 11: 
                case 12: {
                    boolean bl2 = bl = f4.B == 1;
                }
            }
            if (!bl || f4.C != f2) continue;
            f4.C = f3;
        }
    }

    static int[][] uD(int n) {
        if (n < 0 || n >= eC.length) {
            return null;
        }
        return eC[n];
    }

    static void ku() {
        eL = true;
        ds = 0;
        du = 0;
        dr = 0;
        dt = -1;
        fr = 0;
        eR = false;
        switch (h.fZ.g[7]) {
            case 1: {
                eN = 1;
                eO = 451;
                break;
            }
            case 2: {
                eN = 0;
                eO = 452;
                h.kv();
                break;
            }
            case 3: {
                eN = 2;
                eO = 453;
                break;
            }
            case 16: {
                h.dd(eH, -1);
            }
        }
        if (h.fZ.g[7] == eQ && -1 != eP) {
            h.vE(eP);
            eQ = -1;
        }
        eT = false;
        for (int i = 0; i < eB.length; ++i) {
            if (15 != h.eB[i].d || 0 != (h.eB[i].v & 1)) continue;
            eT = true;
            break;
        }
    }

    static boolean uE(int n) {
        switch (eG) {
            case 0: {
                if (null != fZ) break;
                h.vd(-1);
            }
        }
        return eG != 0;
    }

    static void l(g g2) {
        if (eG == 0) {
            h.a(g2, S[20], null, false);
            return;
        }
        g2.a(0);
        g2.d(0, 0, 240, 320);
        h.a(g2, 988, 120, 12);
        g2.a(7294602);
        g2.c(10, 25, 221, 280);
        h.a(g2, S[eO], 4, 14, 34, 6);
        if (0 != eN) {
            g2.a(7294602);
            g2.d(13, 49, 215, 200);
            h.m(g2);
        } else {
            h.v(g2);
            g2.a(7294602);
            g2.d(13, 64, 215, 198);
            h.a(g2, true);
        }
        g2.a(4670283);
        g2.d(13, 251, 215, 37);
        g2.a(7294602);
        g2.d(15, 254, 28, 30);
        if (-1 != dt && h.uH(dt)) {
            h.a(g2, aF[dt][6], 29, 269);
            h.a(g2, h.a(S[aF[dt][5]], 1, 180), 1, 136, 269, 3);
        }
        h.a(g2, S[450], 2, 118, 296, 6);
        h.a(g2, "$" + as, 2, 226, 296, 10);
        if (eR) {
            h.n(g2);
            return;
        }
        h.a(g2, eT ? S[22] : null, S[21], false);
    }

    static boolean uF(int n) {
        if (dr > 0 && h.a(n, true)) {
            return true;
        }
        if (eR) {
            switch (n) {
                case 4: {
                    eR = false;
                }
            }
            return true;
        }
        switch (n) {
            case 4: {
                if (-1 != dt) {
                    h.uI(dt);
                }
                return true;
            }
            case 3: {
                if (0 == eN && fr > 0) {
                    --fr;
                    ds = 0;
                }
                return true;
            }
            case 1: {
                if (0 == eN && fr < fp.length - 1) {
                    ++fr;
                    ds = 0;
                }
                return true;
            }
            case 8: {
                if (3 == h.fZ.g[7]) {
                    h.c(fZ);
                }
                h.ub(h.fZ.g[7]);
                h.vd(-1);
                return true;
            }
            case 7: {
                if (!eT) {
                    return true;
                }
                f f2 = h.kw();
                boolean bl = eR = null == f2;
                if (eR) {
                    return true;
                }
                if (3 == h.fZ.g[7]) {
                    h.c(fZ);
                }
                h.dd(eH, f2.c);
                return true;
            }
        }
        return false;
    }

    static void kv() {
        int n;
        int n2 = 0;
        for (n = 0; n < fo.length; ++n) {
            if (!h.uh(n)) continue;
            ++n2;
        }
        fp = new int[n2];
        n = 0;
        for (int i = 0; i < fo.length; ++i) {
            if (!h.uh(i)) continue;
            h.fp[n] = i;
            ++n;
        }
    }

    static boolean uG(int n) {
        return aF[n][0] == eN && h.ug(n) == fp[fr] && aH[n];
    }

    static void m(g g2) {
        int n = h.v(1);
        dv = du + 186 / n;
        int n2 = 0;
        for (int i = 0; i < aF.length; ++i) {
            if (aF[i][0] != eN || !h.uH(i)) continue;
            if (dr == 1) {
                ds = 0;
            }
            if (n2 >= du && n2 < dv) {
                int n3 = 58 + (n2 - du) * n;
                if (n2 == ds) {
                    g2.a(12497920);
                    g2.d(14, n3, 205, n);
                    dt = i;
                }
                h.a(g2, S[aF[i][4]], 1, 17, n3, 20);
                h.a(g2, "$" + aF[i][1], 1, 216, n3, 24);
            }
            ++n2;
        }
        dr = n2;
        dv = Math.min(dv, dr);
        h.a(g2, 1110, 224, 149);
        n = dr - (dv - du);
        if (n > 0) {
            h.a(g2, 1108, 224, 55 + 188 * du / n);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean uH(int n) {
        if (!aH[n]) {
            return false;
        }
        switch (n) {
            case 19: {
                if (0 != (f.F.v & 0x200)) return false;
                return true;
            }
            case 20: {
                if (0 != (f.F.v & 0x400)) return false;
                return true;
            }
            case 21: 
            case 22: 
            case 23: {
                int n2 = 3 + n - 21;
                if (!f.F.C(n2)) return false;
                if (f.F.f == n2) return false;
                return true;
            }
        }
        return true;
    }

    static void uI(int n) {
        if (aF[n][1] > as) {
            return;
        }
        if (!h.uH(n)) {
            return;
        }
        int n2 = aF[n][0];
        boolean bl = true;
        switch (n) {
            case 19: {
                f.F.v |= 0x200;
                break;
            }
            case 20: {
                f.F.v |= 0x400;
                break;
            }
            case 21: 
            case 22: 
            case 23: {
                f.F.f = 3 + n - 21;
                h.jM();
                break;
            }
            default: {
                int n3;
                if (0 == n2) {
                    n3 = h.uj(h.ug(dt));
                    int n4 = h.uk(dt);
                    h.de(n3, n4);
                }
                if (h.s(dt, n3 = h.K(dt))) break;
                bl = false;
            }
        }
        if (bl) {
            h.F(aF[dt][1]);
        }
    }

    static f kw() {
        boolean bl = true;
        f f2 = null;
        for (int i = 0; i < eM.length; ++i) {
            h.eS[i] = false;
            block0 : switch (eM[i]) {
                case 462: {
                    int n;
                    for (n = 0; n < eB.length; ++n) {
                        f f3 = eB[n];
                        if (5 != f3.e && 9 != f3.e || !f3.f() || 0 != f3.w && h.kt() != f3 || 0 != (f3.v & 0x10) || f3.b(eB[eH]) > 0x780000) continue;
                        f2 = f3;
                        h.eS[i] = true;
                        break block0;
                    }
                    break;
                }
                case 463: {
                    int n;
                    for (n = 0; n < cV.length; ++n) {
                        if (h.uf(n) || aG[cV[n][0]] <= 0) continue;
                        h.eS[i] = true;
                        break block0;
                    }
                    break;
                }
            }
            if (eS[i]) continue;
            bl = false;
        }
        if (!bl) {
            f2 = null;
        }
        return f2;
    }

    static void n(g g2) {
        g2.a(7360139);
        g2.d(5, 48, 231, 206);
        g2.a(0);
        g2.c(5, 48, 231, 206);
        h.a(g2, h.a(S[461], (Object)S[eO]), 1, 120, 60, 3);
        for (int i = 0; i < eM.length; ++i) {
            int n = i * 17;
            h.a(g2, S[eM[i]], 1, 16, 85 + n, 6);
            h.a(g2, 985, 216, 85 + n);
            h.a(g2, eS[i] ? 986 : 987, 216, 85 + n);
        }
        h.a(g2, S[5], 4, 122, 241, 3);
    }

    static void kx() {
        h.tU(eH);
        h.vd(-1);
    }

    static boolean uJ(int n) {
        switch (eG) {
            case 0: {
                if (eE.b(eB[eH]) < 0x280000) break;
                h.vd(-1);
            }
        }
        return eG != 0;
    }

    static void o(g g2) {
        h.a(g2, S[23], null, false);
    }

    static void ky() {
        if (h.f(fZ) && eE.s()) {
            f.F.c(h.fZ.l[3]);
        }
        cc = cb;
        cb = h.kz();
        h.di(0, h.fZ.k);
        h.vd(-1);
        h.b(9, true);
    }

    static boolean uK(int n) {
        switch (eG) {
            case 0: {
                if (null != fZ && (h.fZ.g[7] != 6 || eE.s())) break;
                h.vd(-1);
            }
        }
        return eG != 0;
    }

    static void e(f f2) {
        int n = et * ev;
        int n2 = eu * ew;
        int n3 = Integer.MAX_VALUE;
        if (f2.l[1] < n3) {
            n3 = f2.l[1];
            f2.l[3] = 308832;
        }
        if (n2 - f2.l[1] < n3) {
            n3 = n2 - f2.l[1];
            f2.l[3] = 102944;
        }
        if (n - f2.l[0] < n3) {
            n3 = n - f2.l[0];
            f2.l[3] = 0;
        }
        if (f2.l[0] < n3) {
            f2.l[3] = 205888;
        }
    }

    static void p(g g2) {
        String string;
        int n;
        h.a(g2, S[20], null, true);
        String string2 = h.kX();
        if (string2 != null) {
            if (S[467 + cb] == string2) {
                h.kU();
            } else {
                return;
            }
        }
        if (-1 != (n = h.kz()) && (string = S[467 + n - 0]).length() > 0) {
            string = h.a(S[156], (Object)string);
            h.a(g2, h.a(string, 1, 180), 1, 120, 135, 3);
        }
    }

    static boolean f(f f2) {
        switch (f2.g[7]) {
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: {
                return true;
            }
        }
        return false;
    }

    static int kz() {
        if (null == fZ) {
            return -1;
        }
        switch (h.fZ.g[7]) {
            case 4: 
            case 6: 
            case 7: {
                return 5;
            }
            case 10: {
                return 0;
            }
            case 11: {
                return 1;
            }
            case 12: {
                return 2;
            }
            case 13: {
                return 3;
            }
            case 14: {
                return 4;
            }
        }
        return -1;
    }

    static void kA() {
        cb = cc;
        cc = -1;
        h.vd(-1);
        h.b(9, true);
    }

    static boolean uL(int n) {
        switch (eG) {
            case 0: {
                if (null != fZ || eE.s()) break;
                h.vd(-1);
            }
        }
        return eG != 0;
    }

    static void q(g g2) {
        h.a(g2, S[21], null, false);
    }

    static void a(boolean bl, int n) {
        h.vd(5);
        eG = 1;
        eU = bl;
        eV = n;
        eW = 10000;
        eX = f.F.z;
        if (!eU) {
            h.d(S[464]);
        }
        h.n(5, 196608);
        h.vE(176);
    }

    static void aQ(boolean bl) {
        h.vd(-1);
        h.a("ActivityMiniHostageDrive_Finish: " + bl);
        if (!eU) {
            h.d(S[bl ? 465 : 466]);
            if (bl) {
                h.C(20);
            }
            if (f.F.a(u, 0)) {
                f.F.j(u[0], u[1]);
            }
        } else {
            h.aP(bl);
        }
    }

    /*
     * Unable to fully structure code
     */
    static boolean uM(int var0) {
        h.eV -= var0;
        if (f.Z < 5) ** GOTO lbl-1000
        if (f.F.o < 655360) lbl-1000:
        // 2 sources

        {
            h.eW -= var0;
        } else {
            h.eW = 10000;
        }
        if (h.eW <= 0) {
            h.aQ(false);
        } else if (h.eV <= 0) {
            h.aQ(true);
        }
        return false;
    }

    static void r(g g2) {
        if (eW < 10000) {
            h.a(g2, 1119, 93, 90);
            h.b(g2, 1120, 1121, 130, 90, eW, 10000);
        }
        h.a(g2, 1119, 4, 5);
        h.b(g2, 1120, 1121, 43, 5, eV, 30000);
    }

    static void G(DataInputStream dataInputStream) throws IOException {
        int n = dataInputStream.readShort();
        fa = new int[n][][];
        for (int i = 0; i < n; ++i) {
            int n2 = dataInputStream.readInt();
            int n3 = dataInputStream.readShort();
            h.fa[i] = new int[n3][7];
            for (int j = 0; j < n3; ++j) {
                h.fa[i][j][0] = dataInputStream.readShort();
                h.fa[i][j][1] = n2;
                for (int k = 0; k < 5; ++k) {
                    h.fa[i][j][2 + k] = dataInputStream.readInt();
                }
            }
        }
        h.a("Robbery items loaded: " + n);
        fd = 6;
        fe = 9;
    }

    static void dd(int n, int n2) {
        h.vd(6);
        eH = n;
        eG = 1;
        eY = n2;
        fg = false;
        eZ = 0;
        fc = -1;
        fh = 0;
        fb = new int[10][4];
        int n3 = 0;
        block3: while (n3 < fb.length) {
            h.fb[n3][2] = h.a(fa.length);
            switch (fb[n3][2]) {
                case 4: 
                case 5: {
                    if (n3 == 0) break;
                    continue block3;
                }
                default: {
                    if (n3 == 0) continue block3;
                }
            }
            ++n3;
        }
        h.kE();
        eL = true;
        h.n(1);
        h.vE(188);
    }

    static void kB() {
        if (-1 != eY) {
            h.a(S[460], S[459]);
        }
        if (-1 != eH) {
            eB[eH].f(1);
            h.tY(eH);
        }
        if (-1 != eY) {
            f f2 = eB[eY];
            f2.v |= 0x10;
            f.F = f2;
            eE.q();
        }
        h.n(5, 327680);
        h.vd(-1);
    }

    static void kC() {
        fb = null;
        h.o(1);
    }

    static void kD() {
        if (eZ > 0) {
            h.C(eZ);
        }
        eZ = 0;
        cX ^= 0x10;
    }

    static boolean uN(int n) {
        if (eI >= 30000) {
            fg = true;
        }
        if (fg) {
            if ((fh += n) > 2000) {
                h.kB();
            }
            return eG != 0;
        }
        int[] nArray = fb[fc];
        if ((ff += n) > 2000) {
            ff = 0;
            if (!h.b(nArray, 0, 1)) {
                eZ += fa[nArray[2]][nArray[3]][1];
                if (!h.kE()) {
                    fg = true;
                }
            }
        }
        return eG != 0;
    }

    static void s(g g2) {
        int n;
        if (eG == 0) {
            return;
        }
        g2.a(0);
        g2.d(0, 0, 240, 320);
        h.a(g2, 1291, 0, 0);
        h.a(g2, "$" + eZ, 4, 122, 16, 3);
        int[] nArray = fb[fc];
        if (fg) {
            h.a(g2, S[458], 3, 122, 36, 3);
        } else {
            n = fa[nArray[2]][nArray[3]][1];
            h.a(g2, "+" + n, 3, 122, 36, 3);
        }
        if (!fg) {
            g2.a(32768);
            g2.d(46, 301, 151 * (30000 - eI) / 30000, 10);
            h.a(g2, S[457], 3, 121, 301, 33);
        }
        g2.a(53, 54);
        for (n = 0; n <= fc; ++n) {
            h.a(g2, fb[n]);
        }
        g2.a(-53, -54);
        h.B(g2);
    }

    static boolean uO(int n) {
        if (h.vi(n)) {
            return true;
        }
        if (fg) {
            return false;
        }
        switch (n) {
            case 3: {
                h.b(fb[fc], -1, 0);
                return true;
            }
            case 1: {
                h.b(fb[fc], 1, 0);
                return true;
            }
            case 0: {
                h.f(fb[fc]);
                return true;
            }
            case 2: {
                h.b(fb[fc], 0, 1);
                return true;
            }
            case 4: {
                return true;
            }
        }
        return false;
    }

    static void a(g g2, int[] nArray) {
        int[] nArray2 = fa[nArray[2]][nArray[3]];
        if (-1 != nArray2[0]) {
            h.a(g2, nArray2[0], nArray[0] * 23, nArray[1] * 23);
        }
    }

    static boolean b(int[] nArray, int n, int n2) {
        nArray[0] = nArray[0] + n;
        nArray[1] = nArray[1] + n2;
        if (h.g(nArray)) {
            nArray[0] = nArray[0] - n;
            nArray[1] = nArray[1] - n2;
            return false;
        }
        return true;
    }

    static boolean f(int[] nArray) {
        int n = nArray[3];
        int n2 = nArray[0];
        int n3 = nArray[1];
        nArray[3] = nArray[3] + 1;
        nArray[3] = nArray[3] % fa[nArray[2]].length;
        if (h.g(nArray)) {
            nArray[0] = n2 - 1;
            if (h.g(nArray)) {
                nArray[0] = n2 + 1;
                if (h.g(nArray)) {
                    nArray[3] = n;
                    nArray[0] = n2;
                    nArray[1] = n3;
                    return false;
                }
            }
        }
        return true;
    }

    static boolean g(int[] nArray) {
        int[] nArray2 = fa[nArray[2]][nArray[3]];
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                if (!h.c(nArray2, i, j)) continue;
                int n = i + nArray[0];
                int n2 = j + nArray[1];
                if (n < 0 || n2 < 0 || n >= fd || n2 >= fe) {
                    return true;
                }
                for (int k = 0; k < fc; ++k) {
                    int[] nArray3 = fb[k];
                    if (!h.c(fa[nArray3[2]][nArray3[3]], n - nArray3[0], n2 - nArray3[1])) continue;
                    return true;
                }
            }
        }
        return false;
    }

    static boolean c(int[] nArray, int n, int n2) {
        if (n < 0 || n2 < 0 || n >= 5 || n2 >= 5) {
            return false;
        }
        return 0 != (nArray[2 + n2] & 15 << 4 * (5 - n - 1));
    }

    static boolean kE() {
        if (fc + 1 == fb.length) {
            return false;
        }
        int[] nArray = fb[++fc];
        nArray[0] = fd / 2 - 2;
        for (int i = 1; i <= 5; ++i) {
            nArray[1] = -5 + i;
            int n = 0;
            while (n < fa[nArray[2]].length) {
                nArray[3] = n++;
                if (h.g(nArray)) continue;
                return true;
            }
        }
        --fc;
        return false;
    }

    static void kF() {
        fi = 30;
        fj = -1;
        fk = 0;
        fl = h.a(2) == 0;
        fn = 0;
        h.vE(168);
    }

    static boolean uP(int n) {
        switch (eG) {
            case 0: {
                if (eE.b(eB[eH]) < 0x280000 && h.eB[h.eH].w == 1) break;
                h.vd(-1);
                break;
            }
            case 1: {
                if (fk > 0 && (fk -= n) <= 0) {
                    fj = -1;
                    boolean bl = fl = h.a(2) == 0;
                }
                if (eI > 5000 || fi == 100) {
                    h.kG();
                    h.vd(-1);
                }
                fn += n;
            }
        }
        return eG != 0;
    }

    static void t(g g2) {
        if (eG == 0) {
            h.a(g2, S[22], null, true);
            return;
        }
        g2.a(7294602);
        g2.d(40, 41, 160, 29);
        g2.a(0);
        g2.c(40, 41, 160, 29);
        switch (fj) {
            case 3: {
                g2.a(12497920);
                g2.d(43, 45, 17, 21);
                break;
            }
            case 1: {
                g2.a(12497920);
                g2.d(180, 45, 17, 21);
            }
        }
        int n = h.g(h.c(h.d(fn << 16, 65536000), h.c(262144, 205888)));
        int n2 = h.c(n, 131072) >> 16;
        h.a(g2, fl ? 997 : 996, 51, 55 + (fl ? n2 : 0));
        h.a(g2, fl ? 996 : 997, 188, 55 + (fl ? 0 : n2));
        h.a(g2, 1119, 64, 50);
        int n3 = 108 * eI / 5000;
        g2.a(16645122);
        g2.d(70, 48, n3, 5);
        g2.a(1774692);
        g2.d(70 + n3, 48, 108 - n3, 5);
        h.a(g2, 1095, 64, 60);
        n3 = Math.max(108 * fi / 100, 0);
        g2.a(8234968);
        g2.d(70, 58, n3, 5);
        g2.a(1774692);
        g2.d(70 + n3, 58, 108 - n3, 5);
        h.B(g2);
    }

    static boolean uQ(int n) {
        if (h.vi(n)) {
            return true;
        }
        if (fj != -1) {
            return false;
        }
        switch (n) {
            case 1: 
            case 3: {
                fi = fl ^ n == 1 ? (fi += 10) : (fi -= 10);
                fj = n;
                fk = 200;
                return true;
            }
        }
        return false;
    }

    static void kG() {
        if (0 < fi) {
            h.C(fi);
        }
        eB[eH].f(2);
        h.n(5, 65536);
        h.d(eE);
        h.tX(fi > 0 ? eH : -1);
        da = 60000;
    }

    static void kH() {
        eL = true;
        h.kI();
        h.vE(189);
    }

    static void kI() {
        ds = 0;
        du = 0;
        dr = 0;
        fr = 0;
        switch (h.fZ.g[7]) {
            case 9: {
                eN = 0;
                eO = 454;
                h.kJ();
            }
        }
    }

    static boolean uR(int n) {
        switch (eG) {
            case 0: {
                if (null != fZ) break;
                h.vd(-1);
            }
        }
        return eG != 0;
    }

    static void u(g g2) {
        if (eG == 0) {
            h.a(g2, S[25], null, false);
            return;
        }
        g2.a(0);
        g2.d(0, 0, 240, 320);
        h.a(g2, 988, 120, 12);
        g2.a(7294602);
        g2.c(10, 25, 221, 280);
        h.a(g2, S[eO], 4, 14, 34, 6);
        h.v(g2);
        g2.a(7294602);
        g2.d(13, 64, 215, 198);
        h.a(g2, false);
        g2.a(4670283);
        g2.d(13, 265, 215, 37);
        g2.a(7294602);
        g2.d(15, 268, 28, 30);
        if (0 != fp.length) {
            h.a(g2, aF[dt][6], 29, 283);
            h.a(g2, h.a(S[aF[dt][5]], 1, 180), 1, 136, 283, 3);
        } else {
            h.a(g2, S[456], 1, 120, 165, 3);
        }
        h.a(g2, 0 == fp.length ? null : S[26], S[30], false);
    }

    static boolean uS(int n) {
        if (dr > 0 && h.a(n, true)) {
            return true;
        }
        switch (n) {
            case 3: {
                if (fr > 0) {
                    ds = 0;
                    fq = fp[--fr];
                }
                return true;
            }
            case 1: {
                if (fr < fp.length - 1) {
                    ds = 0;
                    fq = fp[++fr];
                }
                return true;
            }
            case 4: 
            case 7: {
                if (0 == fp.length) {
                    return false;
                }
                int n2 = h.uj(fq);
                int n3 = h.uk(dt);
                h.de(n2, n3);
                if (!h.uU(fq)) {
                    h.kI();
                }
                return true;
            }
            case 8: {
                h.vd(-1);
                return true;
            }
        }
        return false;
    }

    static void a(g g2, boolean bl) {
        if (0 == fp.length) {
            return;
        }
        int n = h.v(1);
        dv = du + 184 / n;
        int n2 = 0;
        for (int i = 0; i < aF.length; ++i) {
            boolean bl2;
            boolean bl3 = bl2 = bl ? h.uG(i) : h.uT(i);
            if (!bl2 || n2 < du || n2 >= dv) continue;
            int n3 = 73 + (n2 - du) * n;
            if (n2 == ds) {
                g2.a(12497920);
                g2.d(14, n3, 205, n);
                dt = i;
            }
            h.a(g2, S[aF[i][4]], 1, 17, n3, 20);
            if (bl) {
                h.a(g2, "$" + aF[i][1], 1, 216, n3, 24);
            }
            ++n2;
        }
        dr = n2;
        dv = Math.min(dv, dr);
        h.a(g2, 1110, 224, 163);
        n = dr - (dv - du);
        if (n > 0) {
            h.a(g2, 1108, 224, 70 + 186 * du / n);
        }
    }

    static void v(g g2) {
        for (int i = 0; i < fp.length; ++i) {
            h.a(g2, fr == i ? 1123 : 1124, 33 + i * 41, 54);
            h.a(g2, fo[fp[i]], 33 + i * 41, 54);
        }
    }

    static void kJ() {
        int n;
        int n2 = 0;
        for (n = 0; n < fo.length; ++n) {
            if (!h.uU(n)) continue;
            ++n2;
        }
        fp = new int[n2];
        n = 0;
        for (int i = 0; i < fo.length; ++i) {
            if (!h.uU(i)) continue;
            h.fp[n] = i;
            ++n;
        }
        fq = fp.length > 0 ? fp[0] : -1;
    }

    static boolean uT(int n) {
        return aF[n][0] == eN && h.ug(n) == fq && cU[h.uk(n)] > 0;
    }

    static boolean uU(int n) {
        for (int i = 0; i < cU.length; ++i) {
            int n2 = cV[i][0];
            if (n2 < 0 || n != cV[i][1] || cU[i] <= 0) continue;
            return true;
        }
        return false;
    }

    static void uV(int n) {
        if (n < 0) {
            return;
        }
        int n2 = h.ui(n);
        h.cU[n] = aG[n2];
        h.aG[n2] = 0;
    }

    static void uW(int n) {
        if (n < 0) {
            return;
        }
        int n2 = h.ui(n);
        h.aG[n2] = cU[n];
        h.cU[n] = 0;
    }

    static void de(int n, int n2) {
        h.uV(n);
        h.uW(n2);
        if (n == f.G) {
            f.G = n2;
            h.di(6, f.G);
        }
    }

    static void kK() {
        int n = gm - go + 120 << 16;
        int n2 = gn - gp + 160 << 16;
        h.fs[0] = n;
        h.fs[1] = n2;
        eE.f(6);
        h.eE.v |= 0x4000;
        h.eE.o = 0;
        ft = 0;
        h.aT(false);
    }

    static void kL() {
        if (3 != h.eE.w) {
            eE.f(0);
        }
        h.eE.v &= 0xFFFFBFFF;
        h.aT(true);
    }

    static boolean uX(int n) {
        switch (eG) {
            case 0: {
                eG = 1;
                h.kQ();
                break;
            }
            case 1: {
                h.uY(n);
                h.uZ(n);
            }
        }
        return false;
    }

    static void w(g g2) {
        int n = gm - go;
        int n2 = gn - gp;
        short[] sArray = ae[h.kM() ? 50 : 49][0];
        short s = sArray[ft * sArray.length / 1500 % sArray.length];
        h.a(g2, (int)s, (fs[0] >> 16) - n, (fs[1] >> 16) - n2);
    }

    static boolean kM() {
        return ft >= 1500;
    }

    static void uY(int n) {
        int n2 = n * 0x960000 >> 10;
        int n3 = fs[0];
        int n4 = fs[1];
        if (k[3]) {
            n3 -= n2;
        }
        if (k[1]) {
            n3 += n2;
        }
        if (k[0]) {
            n4 -= n2;
        }
        if (k[2]) {
            n4 += n2;
        }
        if (h.dh(n3 >> 16, n4 >> 16)) {
            h.fs[0] = n3;
            h.fs[1] = n4;
        }
        ft += n;
    }

    static void uZ(int n) {
        if (3 == h.eE.w) {
            return;
        }
        h.b(u, fs, h.eE.l);
        eE.e(u[0], u[1]);
        if (!h.kM()) {
            return;
        }
        if (k[4]) {
            eE.f(6);
            Object object = eE.a(fs[0] >> 16, (fs[1] >> 16) + 18, 0, 3);
            if (null != object && object instanceof f) {
                f f2 = (f)object;
                f2.e(eE);
                f2.a(cV[f.G][2], eE);
            } else {
                h.a(5, fs, null);
            }
            ft = 0;
        }
    }

    static void b(int n, int n2, int n3, int n4) {
        eI = 0;
        fx = n4;
        fu = n;
        fv = n2;
        fw = n3;
        h.eE.v |= 0x4000;
        h.vd(10);
        eG = 1;
    }

    static boolean va(int n) {
        if (eI >= fx) {
            h.eE.v &= 0xFFFFBFFF;
            h.vd(-1);
            h.o(fu, fv, fw);
        }
        return false;
    }

    static void kN() {
        eF = -1;
        eG = 0;
    }

    static void kO() {
        h.vd(-1);
    }

    static boolean vb(int n) {
        if (eG > 0) {
            eI += n;
        }
        switch (eF) {
            case 0: {
                if (!h.kW()) {
                    h.b(eK);
                    h.ve(0);
                }
                return false;
            }
            case 1: {
                return h.uE(n);
            }
            case 2: {
                return h.uJ(n);
            }
            case 3: {
                return h.uK(n);
            }
            case 4: {
                return h.uL(n);
            }
            case 5: {
                return h.uM(n);
            }
            case 6: {
                return h.uN(n);
            }
            case 7: {
                return h.uP(n);
            }
            case 8: {
                return h.uR(n);
            }
            case 9: {
                return h.uX(n);
            }
            case 10: {
                return h.va(n);
            }
        }
        return false;
    }

    static void x(g g2) {
        switch (eF) {
            case 1: {
                h.l(g2);
                break;
            }
            case 2: {
                h.o(g2);
                break;
            }
            case 3: {
                h.p(g2);
                break;
            }
            case 4: {
                h.q(g2);
                break;
            }
            case 5: {
                h.r(g2);
                break;
            }
            case 6: {
                h.s(g2);
                break;
            }
            case 7: {
                h.t(g2);
                break;
            }
            case 8: {
                h.u(g2);
                break;
            }
            case 9: {
                h.w(g2);
            }
        }
    }

    static void y(g g2) {
    }

    static boolean kP() {
        switch (eF) {
            case 0: 
            case 5: {
                return false;
            }
        }
        return true;
    }

    static boolean vc(int n) {
        if (eF == -1) {
            return false;
        }
        if (n == 7 && eG == 0 && h.kP()) {
            eG = 1;
            h.kQ();
            return true;
        }
        if (eG == 0) {
            return false;
        }
        switch (eF) {
            case 1: {
                return h.uF(n);
            }
            case 6: {
                return h.uO(n);
            }
            case 7: {
                return h.uQ(n);
            }
            case 8: {
                return h.uS(n);
            }
        }
        return false;
    }

    static void kQ() {
        h.kU();
        switch (eF) {
            case 1: {
                h.ku();
                break;
            }
            case 2: {
                h.kx();
                break;
            }
            case 3: {
                h.ky();
                break;
            }
            case 4: {
                h.kA();
                break;
            }
            case 7: {
                h.kF();
                break;
            }
            case 8: {
                h.kH();
                break;
            }
            case 9: {
                h.kK();
            }
        }
    }

    static void kR() {
        switch (eF) {
            case 9: {
                h.kL();
                break;
            }
            case 6: {
                h.kC();
            }
        }
    }

    static void vd(int n) {
        if (eF != -1) {
            h.kR();
        }
        eF = n;
        eG = 0;
        eH = -1;
        eJ = -1;
        eI = 0;
        eK = null;
        eL = false;
        h.a("Activity_SetCurrent: " + n);
    }

    static void kS() {
    }

    static void kT() {
        h.kU();
    }

    static void kU() {
        fz = null;
        fA = null;
        fB = 0;
        fC = 0;
        fy.removeAllElements();
        fE.removeAllElements();
        fF = 0;
    }

    static void kV() {
    }

    static void H(DataInputStream dataInputStream) throws IOException {
    }

    static void j(DataOutputStream dataOutputStream) throws IOException {
    }

    static void a(int n, String string, String string2, int n2) {
        Object[] objectArray = new Object[4];
        objectArray[0] = string;
        objectArray[2] = string2;
        objectArray[1] = new Integer(n2);
        fy.insertElementAt(objectArray, n);
    }

    static void b(String string) {
        h.a(fy.size(), null, string, -1);
    }

    static void a(String string, String string2, int n) {
        Object[] objectArray;
        int n2;
        for (n2 = 0; n2 < fy.size() && null != (objectArray = (Object[])fy.elementAt(n2))[0]; ++n2) {
        }
        h.a(n2, string, string2, n);
        if (null != fz && null == (objectArray = (Object[])fy.lastElement())[0]) {
            fB = 0;
        }
    }

    static void a(String string, String string2) {
        h.a(string, string2, -1);
    }

    static void c(String string) {
        for (int i = 0; i < fy.size(); ++i) {
            Object[] objectArray = (Object[])fy.elementAt(i);
            String string2 = (String)objectArray[2];
            if (!h.b(string, string2)) continue;
            String string3 = h.e(string2);
            String string4 = h.e(string);
            if (null != string3 && null != string4) {
                objectArray[2] = h.a(h.f(string2), new Integer(Integer.parseInt(string3) + Integer.parseInt(string4)));
            }
            return;
        }
        h.b(string);
    }

    static boolean kW() {
        return fz != null;
    }

    static String kX() {
        return fE.isEmpty() ? null : (String)fE.firstElement();
    }

    static boolean kY() {
        if (fz == null) {
            return false;
        }
        return null != fz[0];
    }

    static void d(String string) {
        fE.insertElementAt(string, fE.size());
        fF = 1000;
    }

    static boolean ve(int n) {
        if (0 == fB) {
            fz = null;
            fA = null;
            fC = 0;
            if (!fy.isEmpty()) {
                fz = (Object[])fy.firstElement();
                fy.removeElementAt(0);
                int n2 = fB = h.kY() ? Integer.MAX_VALUE : 2000;
            }
        }
        if (fB == Integer.MAX_VALUE) {
            return true;
        }
        fB = Math.max(0, fB - n);
        if (fF > 0 && !gJ && (fF -= n) <= 0) {
            fE.removeElementAt(0);
            if (!fE.isEmpty()) {
                fF = 1000;
            }
        }
        return false;
    }

    static void z(g g2) {
        if (null != fz) {
            fA = h.kY() ? h.b(g2, fz, fC) : h.a(g2, fz, fC);
        }
        if (fF > 0) {
            String string;
            int n = 25 - 0 * fF / 1000;
            h.a(g2, string, (string = (String)fE.firstElement()) == S[155] || string.startsWith(S[160]) ? 3 : 1, 120, 160 - n, 3);
        }
    }

    static boolean vf(int n) {
        if (!h.kY() || null == fA) {
            return false;
        }
        switch (n) {
            case 2: {
                if (fC + fD >= fA.size()) break;
                ++fC;
                break;
            }
            case 0: {
                if (fC <= 0) break;
                --fC;
                break;
            }
            case 4: 
            case 7: {
                if (fC + fD < fA.size()) {
                    ++fC;
                    break;
                }
                h.jN();
                fB = 0;
                h.md();
                break;
            }
            case 8: {
                if (fC + fD >= fA.size()) break;
                h.jN();
                fB = 0;
                h.md();
            }
        }
        return true;
    }

    static Vector a(g g2, Object[] objectArray, int n) {
        Vector vector = (Vector)objectArray[3];
        if (null == vector) {
            vector = h.a((String)objectArray[2], 1, 234);
            objectArray[3] = vector;
        }
        int n2 = h.v(1);
        int n3 = vector.size();
        int n4 = 3;
        int n5 = 2;
        int n6 = 234;
        int n7 = n3 * n2;
        g2.a(7294602);
        g2.d(n4 + -3, n5 + -2, n6 + 6, n7 + 4);
        g2.a(5059936);
        g2.c(n4 + -3, n5 + -2, n6 + 6, n7 + 4);
        for (int i = 0; i < n3; ++i) {
            h.a(g2, (String)vector.elementAt(i), 1, n4, n5 + i * n2, 20);
        }
        return vector;
    }

    static Vector b(g g2, Object[] objectArray, int n) {
        Vector vector;
        int n2 = (Integer)objectArray[1];
        int n3 = 46;
        int n4 = 262;
        int n5 = 180;
        int n6 = 47;
        if (n2 == -1) {
            n3 = 4;
            n5 = 222;
        }
        if (null == (vector = (Vector)objectArray[3])) {
            vector = h.a((String)objectArray[2], 1, n5);
            objectArray[3] = vector;
        }
        int n7 = vector.size();
        int n8 = h.v(1);
        fD = n6 / n8;
        g2.a(0);
        g2.d(0, 240, 240, 80);
        g2.a(4604746);
        g2.d(0, 250, 240, 11);
        g2.a(5125985);
        g2.d(3, 262, 234, 41);
        h.a(g2, 988, 120, 240);
        if (n2 != -1) {
            h.a(g2, n2, 21, 279);
        }
        h.a(g2, (String)objectArray[0], 2, n3, 255, 6);
        int n9 = Math.min(n + fD, n7);
        for (int i = n; i < n9; ++i) {
            h.a(g2, (String)vector.elementAt(i), 1, n3, n4 + (i - n) * n8, 20);
        }
        if (n7 > fD) {
            n3 = 231;
            n4 = 263;
            g2.a(h.b(0, 0xFFFFFF, 0, 255, 128));
            g2.d(n3, n4, 4, 38);
            g2.a(0xFFFFFF);
            g2.d(n3, n4 + n * 38 / n7, 4, fD * 38 / n7 + 1);
            if (fC + fD < n7) {
                h.a(g2, S[6], S[19], false);
            } else {
                h.a(g2, S[5], null, false);
            }
        } else {
            h.a(g2, S[5], null, false);
        }
        return vector;
    }

    static String e(String string) {
        char c2;
        int n;
        int n2 = -1;
        for (n = 0; n < string.length(); ++n) {
            c2 = string.charAt(n);
            if (Character.isDigit(c2)) {
                if (n2 != -1) continue;
                n2 = n;
                continue;
            }
            if (n2 != -1) break;
        }
        if (n2 > 0 && (c2 = string.charAt(n2 - 1)) == '-') {
            --n2;
        }
        return n2 == -1 ? null : string.substring(n2, n);
    }

    static String f(String string) {
        String string2 = h.e(string);
        if (null == string2) {
            return string;
        }
        return string.substring(0, string.indexOf(string2)) + "%1" + string.substring(string.indexOf(string2) + string2.length());
    }

    static boolean b(String string, String string2) {
        return h.f(string).equals(h.f(string2));
    }

    static boolean aR(boolean bl) {
        if (bl && gJ) {
            return false;
        }
        fG = bl;
        if (fG) {
            h.h(fM);
            h.d();
            if (hb && a.e) {
                a.c();
            }
        } else {
            h.h(null);
            h.md();
            if (hb && a.e) {
                a.a();
            }
        }
        return true;
    }

    static boolean vg(int n) {
        if (fH) {
            h.vk(n);
        }
        return fG;
    }

    static boolean vh(int n) {
        if (!fG) {
            if (n == 8 || n == 9) {
                return h.aR(true);
            }
            return false;
        }
        if (fH) {
            h.vj(n);
        } else {
            h.vo(n);
        }
        return true;
    }

    static boolean vi(int n) {
        boolean bl = gJ;
        gJ = false;
        boolean bl2 = h.vh(n);
        gJ = bl;
        return bl2;
    }

    static void A(g g2) {
        if (!fG) {
            if (!gJ) {
                h.a(g2, 1117, 240, 320);
            }
            return;
        }
        if (fH) {
            h.C(g2);
        } else {
            h.G(g2);
        }
    }

    static void B(g g2) {
        boolean bl = gJ;
        gJ = false;
        h.A(g2);
        gJ = bl;
    }

    static void h(int[] nArray) {
        h.d(nArray);
        if (null == dh) {
            return;
        }
        fH = nArray == fJ;
        fI = -1;
        if (fH) {
            h.kZ();
        } else {
            h.lg();
        }
    }

    static void a(g g2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        if (n <= n3 - n2) {
            return;
        }
        h.a(g2, n4, n5, n6);
        int n10 = n;
        int n11 = n10 - (n3 - n2);
        if (n11 > 0) {
            h.a(g2, n7, n5, n8 + n9 * n2 / n11);
        }
    }

    static void kZ() {
        if (fL || h.R(aI.length - 1)) {
            dh = h.a(dh, 55);
        }
        h.vl(-1);
        h.vl(0);
    }

    static void la() {
        if (di != -1) {
            switch (dh[di]) {
                case 52: {
                    h.lj();
                    break;
                }
                case 53: {
                    h.ll();
                    break;
                }
                case 54: {
                    h.ll();
                    break;
                }
                case 55: {
                    h.ln();
                }
            }
        }
    }

    static void lb() {
        h.la();
    }

    static void vj(int n) {
        switch (n) {
            case 1: 
            case 3: {
                h.vl(h.b(di + (n == 3 ? -1 : 1), dh.length));
                return;
            }
            case 8: 
            case 9: {
                h.lb();
                h.h(fM);
                return;
            }
        }
        switch (dh[di]) {
            case 52: {
                h.vq(n);
                break;
            }
            case 53: {
                h.vr(n);
                break;
            }
            case 54: {
                h.vr(n);
                break;
            }
            case 55: {
                h.vu(n);
            }
        }
    }

    static void C(g g2) {
        h.D(g2);
        switch (dh[di]) {
            case 52: {
                h.J(g2);
                break;
            }
            case 53: {
                h.K(g2);
                break;
            }
            case 54: {
                h.K(g2);
                break;
            }
            case 55: {
                h.L(g2);
            }
        }
        h.a(g2, null, S[10], false);
    }

    static void vk(int n) {
        switch (dh[di]) {
            case 53: 
            case 54: {
                h.vs(n);
            }
        }
    }

    static void vl(int n) {
        h.la();
        di = n;
        if (di != -1) {
            switch (dh[di]) {
                case 52: {
                    h.li();
                    break;
                }
                case 53: {
                    h.lk();
                    break;
                }
                case 54: {
                    h.lk();
                    break;
                }
                case 55: {
                    h.lm();
                }
            }
        }
    }

    static void c(g g2, int n, int n2, int n3) {
        h.a(g2, n, n2, n3, 1097, 224, 177, 1108, 80, 194);
    }

    static void D(g g2) {
        g2.a(0);
        g2.d(0, 0, 240, 320);
        h.a(g2, S[67], 4, 120, 12, 3);
        for (int i = 0; i < dh.length; ++i) {
            int n = 41 * i + i;
            h.a(g2, 1123 + (i == di ? 0 : 1), 20 + n, 34);
            h.a(g2, fK[i], 20 + n, 34);
        }
        g2.a(7294602);
        g2.d(0, 45, 240, 255);
        h.a(g2, S[dh[di]], 4, 120, 51, 3);
        g2.a(5520233);
        g2.c(8, 59, 223, 236);
    }

    static void lc() {
        h.kb();
    }

    static void ld() {
        h.kc();
    }

    static void vm(int n) {
        switch (n) {
            case 8: 
            case 9: {
                h.ld();
                h.h(fM);
                return;
            }
        }
        h.ur(n);
    }

    static void E(g g2) {
        h.b(g2, 17, 65, 205, 208);
        h.a(g2, S[24], S[10], false);
    }

    static void le() {
        h.a(S[60], 1, 198, 200);
    }

    static void lf() {
        dp = null;
    }

    static void vn(int n) {
        switch (n) {
            case 8: 
            case 9: {
                h.lf();
                h.h(fM);
                return;
            }
        }
        h.a(n, false);
    }

    static void F(g g2) {
        h.a(g2, 21, 69);
        h.d(g2, dr, du, dv);
        h.a(g2, null, S[10], false);
    }

    static void lg() {
    }

    static void lh() {
    }

    static void vo(int n) {
        switch (fI) {
            case 33: {
                h.vm(n);
                return;
            }
            case 44: {
                h.vn(n);
                return;
            }
            case 34: {
                h.vv(n);
                return;
            }
        }
        fI = h.up(n);
        switch (fI) {
            case 35: {
                if (n != 9) break;
            }
            case 32: {
                h.aR(false);
                break;
            }
            case 33: {
                h.lc();
                break;
            }
            case 44: {
                h.le();
                break;
            }
            case 34: {
                h.lo();
                break;
            }
            case 50: {
                h.lh();
                h.h(fJ);
            }
        }
    }

    static void G(g g2) {
        h.I(g2);
        switch (fI) {
            case 33: {
                h.E(g2);
                break;
            }
            case 44: {
                h.F(g2);
                break;
            }
            case 34: {
                h.M(g2);
                break;
            }
            default: {
                h.b(g2, 17, 65, 205, 208);
                h.a(g2, S[5], null, false);
            }
        }
    }

    static void vp(int n) {
        dp = h.a(S[n], 1, 205);
    }

    static void H(g g2) {
        h.a(g2, dp, 1, 119, 169, 3);
    }

    static void d(g g2, int n, int n2, int n3) {
        h.a(g2, n, n2, n3, 1097, 226, 169, 1108, 72, 163);
    }

    static void I(g g2) {
        g2.a(7360138);
        g2.d(0, 0, 240, 320);
        g2.a(5585770);
        g2.c(7, 52, 226, 241);
        g2.a(0);
        g2.d(0, 0, 240, 22);
        g2.d(0, 298, 240, 22);
        h.a(g2, 988, 120, 17);
        h.a(g2, 991, 120, 307);
        h.a(g2, S[67], 4, 120, 40, 3);
    }

    static void li() {
        int n = 1212 + cb;
        fS = 119 - (h.p(n) >> 1);
        fT = 169 - (h.q(n) >> 1);
        fU = false;
    }

    static void lj() {
        fU = true;
    }

    static void vq(int n) {
    }

    static void J(g g2) {
        if (5 != cb) {
            h.a(g2, 1212 + cb, fS, fT);
            h.R(g2);
        }
        h.a(g2, S[467 + cb - 0], 4, 112, 267, 3);
    }

    static void lk() {
        dr = 0;
        ds = 0;
        dt = -1;
        du = 0;
        int n = 1;
        boolean bl = fN = dh[di] == 53;
        if (fN) {
            for (int i = 0; i < aF.length; ++i) {
                if (!h.vt(i)) continue;
                if (cV[f.G][0] == i) {
                    ds = dr;
                }
                ++dr;
            }
            if (n < dr) {
                du = Math.min(ds, dr - 2);
            }
        }
    }

    static void ll() {
    }

    static void vr(int n) {
        h.a(n, true);
        block0 : switch (n) {
            case 4: 
            case 7: {
                if (-1 == dt) break;
                if (!fN) {
                    h.L(dt);
                    if (!h.M(dt) && aG[dt] == 0) {
                        --ds;
                    }
                    if (ds < 0) {
                        ds = 0;
                    }
                    if (ds >= du) break;
                    --du;
                    --dv;
                    break;
                }
                if (0 != (0x4000 & h.eE.v)) break;
                for (int i = 0; i < cV.length; ++i) {
                    if (cV[i][0] != dt) continue;
                    f.G = i;
                    h.g(S[aF[dt][4]] + " " + S[159]);
                    break block0;
                }
                break;
            }
        }
    }

    static void vs(int n) {
        if (fP > 0 && 0 > (fP -= n)) {
            fO = null;
        }
    }

    static void K(g g2) {
        dv = du + 2;
        int n = 0;
        for (int i = 0; i < aF.length; ++i) {
            int n2;
            if (!h.vt(i) || (n2 = n++) < du || n2 >= dv) continue;
            int n3 = (n2 - du) * 90;
            if (n2 == ds) {
                dt = i;
                g2.a(12563456);
                g2.d(11, 74 + n3, 207, 93);
                if (h.M(dt)) {
                    String string = 1 == aF[dt][0] ? S[18] : S[17];
                    h.a(g2, string, null, false);
                }
            }
            g2.a(4801359);
            g2.d(14, 77 + n3, 201, 87);
            g2.a(9992115);
            g2.d(20, 80 + n3, 36, 35);
            h.a(g2, aF[i][6], 38, 97 + n3);
            h.a(g2, Integer.toString(aG[i]), 2, 36, 131 + n3, 3);
            h.a(g2, S[aF[i][4]], 2, 64, 84 + n3, 6);
            h.a(g2, h.a(S[aF[i][5]], 1, 150), 1, 61, 126 + n3, 6);
        }
        dr = n;
        dv = Math.min(dv, dr);
        h.c(g2, dr, du, dv);
        if (!fN) {
            h.a(g2, S[439], 1, 40, 292, 3);
            h.b(g2, 1002, 1003, 142, 292, h.eE.y, h.eE.g[2]);
        }
        if (0 < fP) {
            h.a(g2, fO, 0);
        }
    }

    static boolean vt(int n) {
        return aF[n][0] == 0 == fN && aG[n] > 0;
    }

    static void g(String string) {
        fO = new Object[4];
        h.fO[0] = null;
        h.fO[2] = string;
        h.fO[1] = null;
        fP = 2000;
    }

    static void lm() {
        int n = h.q();
        if (n == -1) {
            return;
        }
        h.a(S[aI[n][5]], 1, 194, 165);
    }

    static void ln() {
        dp = null;
    }

    static void vu(int n) {
        h.a(n, false);
    }

    static void L(g g2) {
        int n = h.q();
        if (n == -1) {
            return;
        }
        g2.a(4670283);
        g2.d(13, 77, 197, 9);
        int n2 = aI[n][1];
        h.a(g2, S[n2], 2, 130, 81, 3);
        int n3 = aI[n][3];
        if (n3 != -1) {
            h.a(g2, n3, 31, 99);
        }
        h.a(g2, h.a(S[aI[n][4]], 1, 156), 1, 132, 104, 3);
        h.a(g2, 16, 125);
        h.c(g2, dr, du, dv);
    }

    static void lo() {
        h.vp(66);
    }

    static void vv(int n) {
        switch (n) {
            case 8: 
            case 9: {
                h.lf();
                h.h(fM);
                return;
            }
            case 4: 
            case 7: {
                h.b(4, false);
                a.b();
                return;
            }
        }
    }

    static void M(g g2) {
        h.H(g2);
        h.a(g2, S[5], S[10], false);
    }

    static boolean b(boolean bl, int n) {
        fR = n;
        h.a(S[fR], 1, 198, 192);
        return h.aS(bl);
    }

    static boolean aS(boolean bl) {
        if (bl && fQ) {
            return false;
        }
        fQ = bl;
        return true;
    }

    static boolean vw(int n) {
        return fQ;
    }

    static boolean vx(int n) {
        if (fQ) {
            switch (n) {
                case 4: 
                case 7: {
                    return h.aS(false);
                }
                case 9: {
                    h.b(4, false);
                    return true;
                }
            }
            h.a(n, false);
        }
        return false;
    }

    static void N(g g2) {
        if (!fQ) {
            return;
        }
        h.O(g2);
        h.a(g2, 21, 73);
        h.P(g2);
        h.a(g2, S[29], null, false);
    }

    static void O(g g2) {
        g2.a(7360138);
        g2.d(0, 0, 240, 320);
        g2.a(5585770);
        g2.c(7, 52, 226, 234);
        g2.a(0);
        g2.d(0, 0, 240, 33);
        g2.d(0, 295, 240, 25);
        h.a(g2, 988, 120, 22);
        h.a(g2, 991, 120, 305);
        h.a(g2, S[3], 4, 120, 42, 3);
    }

    static void P(g g2) {
        if (dr - dw <= 0) {
            return;
        }
        h.a(g2, 1110, 225, 166);
        int n = dr % dw;
        int n2 = dr + (n > 0 ? dw - n : 0);
        int n3 = n2 - dw;
        if (n3 > 0) {
            h.a(g2, 1108, 225, 75 + 182 * du / n3);
        }
    }

    static void Q(g g2) {
        int n;
        if (cb == 5) {
            return;
        }
        f f2 = h.kt();
        fS = 43 - h.vz(f2.l[0]);
        fT = 275 - h.vz(f2.l[1]);
        if (fV) {
            int n2;
            n = 1217 + cb;
            for (n2 = 0; n2 <= 27; n2 += 3) {
                int n3;
                int n4 = 729 - n2 * n2;
                for (n3 = 27; n3 >= 0 && n3 * n3 > n4; n3 -= 3) {
                }
                g2.a(43 - n3 + 1, 275 - n2 - 2, n3 << 1, 3);
                h.a(g2, n, fS, fT);
                g2.a(43 - n3 + 1, 275 + n2 - 2, n3 << 1, 3);
                h.a(g2, n, fS, fT);
            }
            g2.a(0, 0, 240, 320);
            h.a(g2, 1007, 43, 275);
            if (0 != h.H(5)) {
                h.a(g2, az[5][1], 11, 272, 1009, az[5][2], h.H(5));
            }
            if ((n2 = h.o(f2.h, f2.i)) > 0) {
                h.a(g2, az[n2][1], 16, 300, 1010, az[n2][2], h.H(n2));
            }
            h.R(g2);
        }
        h.a(g2, 1071, 162, 7);
        n = 54 * f2.y / f2.g[2];
        g2.a(163, 5, n, 5);
        h.a(g2, 1072, 163, 7);
        g2.a(0, 0, 240, 320);
        h.a(g2, "$" + as, 2, 166, 14, 6);
        h.a(g2, 1005, 224, 15);
        if (da >= 0) {
            h.a(g2, 1026, 224, 15);
        }
        if (h.eE.w == 8) {
            h.a(g2, 1020, 224, 15);
        } else {
            n = f.G;
            int n5 = cV[n][0];
            h.a(g2, aF[n5][6], 224, 15);
            if (9 == eF) {
                return;
            }
            if (!h.uf(n)) {
                int n6 = aG[n5] % cV[n][5];
                if (n6 == 0 && aG[n5] > 0) {
                    n6 = cV[n][5];
                }
                h.a(g2, "" + n6 + "/" + (aG[n5] - n6), 1, 236, 30, 10);
            }
        }
        if (fW >= 0) {
            h.a(g2, 1119, 4, 5);
            h.b(g2, 1120, 1121, 43, 5, fW, fX);
        }
    }

    static void a(g g2, int n, int n2, int n3, int n4, int n5, int n6) {
        h.a(g2, n4, 43, 275);
        for (int i = 0; i < n6; ++i) {
            h.a(g2, n5 + i, 43, 275);
        }
        h.a(g2, n, n2, n3);
    }

    static void R(g g2) {
        Object object;
        h.S(g2);
        h.y(g2);
        for (int i = 0; i < eB.length; ++i) {
            object = eB[i];
            if (!((f)object).f() || 0 == (((f)object).v & 0x804)) continue;
            h.e(g2, 1094, ((f)object).h, ((f)object).i);
        }
        f f2 = h.kt();
        object = ae[48];
        h.a(g2, (int)object[h.a(f2.l[3], ((Object)object).length, false)][0], fS + h.vz(f2.l[0]), fT + h.vz(f2.l[1]));
    }

    static void e(g g2, int n, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8 = fS + h.vz(n2 << 16);
        int n9 = fT + h.vz(n3 << 16);
        if (fU && (n7 = (n6 = n8 - 43) * n6) + (n5 = (n4 = n9 - 275) * n4) > 576) {
            if (n4 == 0) {
                n9 = 0;
                n8 = h.b(n6) * 24 << 16;
            } else {
                int n10 = (int)(65536L + ((long)n7 << 16) / (long)n5);
                n9 = h.b(n4) * h.d(0x180000, h.e(n10));
                n8 = h.c(n9, h.d(n6 << 16, n4 << 16));
            }
            n8 = 43 + (n8 >> 16);
            n9 = 275 + (n9 >> 16);
        }
        h.a(g2, n, n8, n9);
    }

    static void b(g g2, int n, int n2, int n3, int n4, int n5, int n6) {
        short s = h.p(n2);
        short s2 = h.q(n2);
        int n7 = n3 - s / 2;
        int n8 = n4 - s2 / 2;
        h.a(g2, n, n3, n4);
        g2.a(n7, n8, s * n5 / n6, s2);
        h.a(g2, n2, n3, n4);
        g2.a(0, 0, 240, 320);
    }

    static void vy(int n) {
        fW = n;
        fX = n;
    }

    static int vz(int n) {
        return h.c(n, 65536) >> 20;
    }

    static void aT(boolean bl) {
        fV = bl;
    }

    static void I(DataInputStream dataInputStream) throws IOException {
        int n = dataInputStream.readShort();
        fY = new int[n][1];
        for (int i = 0; i < n; ++i) {
            h.fY[i][0] = dataInputStream.readShort();
        }
        h.a("Businesses loaded: " + n);
    }

    static void lp() {
        fZ = null;
    }

    static void lq() {
        f f2 = fZ;
        fZ = null;
        if (0 != (h.eE.v & 0x4000)) {
            return;
        }
        int n = Integer.MAX_VALUE;
        for (int i = 0; i < eB.length; ++i) {
            f f3 = eB[i];
            int n2 = f3.b(eE);
            if (f3.g[7] <= 0 || f3.b(eE) >= f3.g[4] || !f3.f() || n < n2 || h.f(f3) && !h.d(h.eE.l[3], f3.l[3] - 51472, f3.l[3] + 51472)) continue;
            fZ = f3;
            n = n2;
        }
        if (null == fZ) {
            return;
        }
        if (!h.lr()) {
            return;
        }
        switch (h.fZ.g[7]) {
            case 1: 
            case 2: {
                if (fZ.ag()) break;
            }
            case 16: {
                h.vd(1);
                eH = h.fZ.c;
                break;
            }
            case 4: {
                h.vd(3);
                break;
            }
            case 5: {
                h.vd(4);
                break;
            }
            case 9: {
                h.vd(8);
                eH = h.fZ.c;
                break;
            }
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: {
                h.vd(3);
                break;
            }
            case 15: {
                if (f2 == fZ) break;
                h.ls();
            }
        }
    }

    static void S(g g2) {
        for (int i = 0; i < eB.length; ++i) {
            int n;
            f f2 = eB[i];
            int n2 = f2.g[7];
            if (n2 <= 0 || (n = fY[n2][0]) == -1) continue;
            h.e(g2, n, f2.h, f2.i);
        }
    }

    static boolean lr() {
        switch (h.fZ.g[7]) {
            case 15: {
                return eF == -1 || 5 == eF;
            }
            case 1: 
            case 2: 
            case 4: 
            case 5: {
                return !eE.s() && 9 != h.eE.w;
            }
        }
        return eF == -1;
    }

    static void ls() {
        if (!eE.s()) {
            return;
        }
        h.a(f.F, null);
        if (h.H(5) == 0) {
            return;
        }
        if (5 == eF) {
            h.d(S[464]);
        } else if (as < 50) {
            h.d(S[153]);
        } else {
            h.E(50);
            h.aA[5] = 0;
        }
    }

    static void J(DataInputStream dataInputStream) throws IOException {
        ga = new int[dataInputStream.readShort()][7];
        for (int i = 0; i < ga.length; ++i) {
            for (int j = 0; j < 7; ++j) {
                h.ga[i][j] = dataInputStream.readInt();
            }
        }
    }

    static void lt() {
        gc = false;
    }

    static void lu() {
        gd = 0;
        gb = true;
        gc = true;
        h.a(eE, null);
        if (eE.s()) {
            h.a(f.F, null);
        }
        h.j();
        h.i();
    }

    static void lv() {
        gb = false;
        h.k();
    }

    static void vA(int n) {
        if (!gc) {
            return;
        }
        if (gb) {
            if (gd < 27) {
                gd += Math.max(25 * n / 1000, 1);
            }
            if (gd > 27) {
                gd = 27;
            }
        } else {
            if (gd > 0) {
                gd -= Math.max(25 * n / 1000, 1);
            }
            if (gd <= 0) {
                gd = 0;
                gc = false;
            }
        }
    }

    static void T(g g2) {
        if (!gc) {
            return;
        }
        g2.a(0);
        g2.d(g2.d(), g2.e(), g2.f(), gd);
        if (!h.kW()) {
            g2.d(g2.d(), g2.e() + g2.g() - gd, g2.f(), gd);
        }
    }

    static void lw() {
        gq = 0;
        h.ly();
    }

    static void lx() {
        h.lw();
    }

    static void df(int n, int n2) {
        gf = false;
        ge = true;
        gj = eB[n];
        gi = n2 << 16;
        h.lz();
        if (0 == n2) {
            gk = gg;
            gl = gh;
        }
    }

    static void ly() {
        ge = false;
        gj = null;
    }

    static void dg(int n, int n2) {
        gq = n;
        gr = n2;
    }

    static void vB(int n) {
        if (gq > 0) {
            if ((gq = Math.max(0, gq - n)) > 0) {
                go = 120 + h.a(gr) - gr / 2;
                gp = 160 + h.a(gr) - gr / 2;
            } else {
                go = 120;
                gp = 160;
            }
        }
        if (!ge) {
            f f2 = h.kt();
            gk = f2.h << 16;
            gl = f2.i << 16;
        } else {
            h.lz();
            int n2 = gg - gk;
            int n3 = gh - gl;
            int n4 = h.e(n2, n3);
            if (0 == n4 || n4 < gi * n / 1000) {
                gk = gg;
                gl = gh;
            } else {
                int n5 = h.b(0, n, 1000);
                int n6 = h.c(gi, n5);
                gk += h.c(h.d(n2, n4), n6);
                gl += h.c(h.d(n3, n4), n6);
            }
        }
        gm = h.vC(gk >> 16);
        gn = h.vD(gl >> 16);
    }

    static int vC(int n) {
        return Math.max(go, Math.min(et * ef - go, n));
    }

    static int vD(int n) {
        return Math.max(gp, Math.min(eu * eg - gp, n));
    }

    static void lz() {
        if (null == gj) {
            return;
        }
        gg = h.gj.h << 16;
        gh = h.gj.i << 16;
    }

    static void K(DataInputStream dataInputStream) throws IOException {
        gs = new boolean[dataInputStream.readShort()];
        gt = new int[gs.length][][];
        gu = new boolean[gs.length];
        gv = new boolean[gs.length];
        for (int i = 0; i < gs.length; ++i) {
            h.gs[i] = dataInputStream.readBoolean();
            h.gu[i] = dataInputStream.readBoolean();
            h.gt[i] = new int[dataInputStream.readShort()][3];
            for (int j = 0; j < gt[i].length; ++j) {
                h.gt[i][j][0] = dataInputStream.readInt();
                h.gt[i][j][1] = dataInputStream.readInt();
                h.gt[i][j][2] = dataInputStream.readShort();
            }
        }
    }

    static void lA() {
        for (int i = 0; i < gv.length; ++i) {
            h.vF(i);
        }
    }

    static void L(DataInputStream dataInputStream) throws IOException {
        int n = Math.min(dataInputStream.readShort(), gv.length);
        for (int i = 0; i < n; ++i) {
            h.gv[i] = dataInputStream.readBoolean();
        }
    }

    static void k(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(gv.length);
        for (int i = 0; i < gv.length; ++i) {
            dataOutputStream.writeBoolean(gv[i]);
        }
    }

    static void vE(int n) {
        if (!gs[n] && gv[n] || !cj && gu[n]) {
            return;
        }
        int[][] nArray = gt[n];
        for (int i = 0; i < nArray.length; ++i) {
            int n2 = nArray[i][0];
            int n3 = nArray[i][2];
            if (1284 == n3 || 1285 == n3) {
                n3 = aq ? 1285 : 1284;
            }
            h.a(-1 != n2 ? S[n2] : ap, S[nArray[i][1]], n3);
        }
        h.gv[n] = true;
    }

    static void vF(int n) {
        h.gv[n] = false;
    }

    static void lB() {
        gw = new int[40][5];
        gx = new int[60][5];
    }

    static void lC() {
        gy = false;
        gz = d + 60000L;
    }

    static void lD() {
        int n;
        for (n = 0; n < gx.length; ++n) {
            h.a(gx[n], -1, 3, 262144, 131072, false);
        }
        for (n = 0; n < gw.length; ++n) {
            h.a(gw[n], -1, 3, 458752, 196608, false);
        }
        gy = true;
        gB = d + (long)h.a(30000);
    }

    static void lE() {
        h.lC();
    }

    static void vG(int n) {
        gA = n;
        if (gy) {
            if (d > gz + 30000L) {
                h.lE();
            }
        } else if (d > gz) {
            h.lD();
        }
    }

    static void U(g g2) {
        if (!gy) {
            return;
        }
        h.a(g2, gA, gx, -1, 3, 262144, 131072, 0x1E0000);
        h.a(g2, gA, gw, -1, 3, 458752, 196608, 0x320000);
        h.V(g2);
    }

    static int vH(int n) {
        int n2 = (int)(d - gz);
        if (n2 < 5000) {
            return h.a(0, n, 0, 5000, n2);
        }
        if (n2 > 25000) {
            return h.a(n, 0, 5000, 0, 30000 - n2);
        }
        return n;
    }

    static void a(int[] nArray, int n, int n2, int n3, int n4, boolean bl) {
        int n5 = n3 + h.a(n4) - (n4 >> 1);
        nArray[0] = h.a(0x1E00000);
        nArray[1] = bl ? 0 : h.a(320) << 16;
        nArray[2] = nArray[0] + n5 * n;
        nArray[3] = nArray[1] + n5 * n2;
        nArray[4] = h.a(320) << 16;
    }

    static void a(g g2, int n, int[][] nArray, int n2, int n3, int n4, int n5, int n6) {
        int n7 = h.vH(nArray.length);
        int n8 = n * n2 * n6 >> 10;
        int n9 = n * n3 * n6 >> 10;
        g2.a(-4473925);
        for (int i = 0; i < n7; ++i) {
            int[] nArray2 = nArray[i];
            g2.b(nArray2[0] >> 16, nArray2[1] >> 16, nArray2[2] >> 16, nArray2[3] >> 16);
            nArray2[0] = nArray2[0] + n8;
            nArray2[1] = nArray2[1] + n9;
            nArray2[2] = nArray2[2] + n8;
            nArray2[3] = nArray2[3] + n9;
            if (nArray2[1] <= nArray2[4] && nArray2[0] >= 0) continue;
            h.a(nArray2, n2, n3, n4, n5, true);
        }
    }

    static void V(g g2) {
        long l;
        if (d < gB || gJ) {
            return;
        }
        if (h.a(100) < 13) {
            g2.a(-1);
            g2.d(0, 0, 240, 320);
        }
        if (d > (l = gB + 2000L)) {
            gB = l - gz < 15000L ? l + (long)h.a(15000) : gz + 30000L;
        }
    }

    static void lF() {
        for (int i = 0; i < gC.length; ++i) {
            for (int j = 0; j < 5; ++j) {
                h.gC[i][j] = -1;
            }
        }
    }

    static void W(g g2) {
        for (int i = 0; i < gC.length; ++i) {
            int[] nArray = gC[i];
            g2.a(nArray[0]);
            g2.b(nArray[1], nArray[2], nArray[3], nArray[4]);
            g2.b(nArray[1] + 1, nArray[2], nArray[3] + 1, nArray[4]);
            g2.b(nArray[1], nArray[2] + 1, nArray[3], nArray[4] + 1);
        }
    }

    static void b(f f2, int n) {
        int n2 = h.g(f2.m[3]);
        int n3 = h.h(f2.m[3]);
        int n4 = h.g(f2.l[3]);
        int n5 = h.h(f2.l[3]);
        int n6 = f2.m[0] + -12 * n3;
        int n7 = f2.m[1] + -12 * n2;
        int n8 = f2.l[0] + -12 * n5;
        int n9 = f2.l[1] + -12 * n4;
        if (f2.e == 38 || f2.e == 39) {
            h.gC[h.gD][0] = n;
            h.gC[h.gD][1] = n6 >> 16;
            h.gC[h.gD][2] = n7 >> 16;
            h.gC[h.gD][3] = n8 >> 16;
            h.gC[h.gD][4] = n9 >> 16;
            if (++gD == 128) {
                gD = 0;
            }
        } else {
            int n10 = 8 * n2;
            int n11 = 8 * n3;
            int n12 = 8 * n4;
            int n13 = 8 * n5;
            h.gC[h.gD][0] = n;
            h.gC[h.gD][1] = n6 - n10 >> 16;
            h.gC[h.gD][2] = n7 + n11 >> 16;
            h.gC[h.gD][3] = n8 - n12 >> 16;
            h.gC[h.gD][4] = n9 + n13 >> 16;
            if (++gD == 128) {
                gD = 0;
            }
            h.gC[h.gD][0] = n;
            h.gC[h.gD][1] = n6 + n10 >> 16;
            h.gC[h.gD][2] = n7 - n11 >> 16;
            h.gC[h.gD][3] = n8 + n12 >> 16;
            h.gC[h.gD][4] = n9 - n13 >> 16;
            if (++gD == 128) {
                gD = 0;
            }
        }
    }

    static boolean aU(boolean bl) {
        gE = bl;
        gd = 0;
        gG = 3000;
        return true;
    }

    static boolean vI(int n) {
        if (!gE) {
            return false;
        }
        if (gF < 160) {
            gF += Math.max(35 * n / 1000, 1);
        } else if (gF > 160) {
            gF = 160;
        }
        if (gF == 160) {
            gG -= n;
        }
        if (0 > gG) {
            h.b(10, false);
        }
        return gE;
    }

    static void X(g g2) {
        if (!gE) {
            return;
        }
        g2.a(0);
        g2.d(g2.d(), g2.e(), g2.f(), gF);
        g2.d(g2.d(), g2.e() + g2.g() - gF, g2.f(), gF);
        if (gF == 160) {
            h.a(g2, S[90], 3, 120, 160, 3);
        }
    }

    static void lG() {
        f f2;
        gJ = false;
        fL = false;
        h.kN();
        h.kS();
        h.kq();
        h.lt();
        h.ko();
        h.lC();
        h.lF();
        h.l();
        h.d();
        Thread.yield();
        h.vN(100);
        h.o(26);
        h.jF();
        h.vN(300);
        try {
            DataInputStream dataInputStream = new DataInputStream(b.getClass().getResourceAsStream(bZ[cb]));
            h.B(dataInputStream);
            Thread.yield();
            h.F(dataInputStream);
            dataInputStream.close();
            if (null != ci) {
                h.D(new DataInputStream(new ByteArrayInputStream(ci)));
            }
        }
        catch (Exception exception) {
            h.a(exception);
        }
        h.vN(700);
        if (-1 != gH[cb]) {
            h.n(gH[cb]);
        }
        Thread.yield();
        h.vN(800);
        h.lp();
        h.lw();
        h.vN(900);
        if (gL[0]) {
            for (int i = 0; i < eB.length; ++i) {
                f2 = eB[i];
                if (f2.d != 21 || f2.k != gK[0]) continue;
                eE.d(f2.l[0], f2.l[1]);
                break;
            }
        }
        if (gL[4]) {
            eE.c(gK[4], gK[5]);
        }
        if (gL[1]) {
            f.F = h.uC(44);
            if (null != f.F) {
                f.F.e = gK[1];
                f.F.g = eA[f.F.e];
                f.F.d = f.F.g[0];
                f.F.h = h.eE.h;
                f.F.i = h.eE.i;
                f.F.b();
                f.F.f = gK[2];
                f.F.c(gK[3]);
                f.F.b(true);
                f.F.v = gK[9];
                f.F.z = gK[10];
                eE.d(true);
            }
        }
        if (gL[7]) {
            h.eE.y = gK[7];
        }
        if (gL[8]) {
            if (null != f.F) {
                f.F.y = gK[8];
            }
        }
        h.vN(950);
        for (int i = 0; i < eB.length; ++i) {
            f2 = eB[i];
            if (!h.f(f2)) continue;
            h.e(f2);
        }
        h.vJ(10);
        Thread.yield();
        h.jO();
        h.jK();
        Thread.yield();
        h.mg();
        h.vJ(10);
        h.lK();
        h.vN(1000);
        String string = S[467 + cb];
        if (string.length() > 0) {
            h.d(string);
        }
        h.aU(false);
    }

    static void lH() {
        h.vd(-1);
        h.jG();
        if (9 != dc) {
            h.p();
        }
        if (eE.s()) {
            h.di(1, f.F.e);
            h.di(2, f.F.f);
            h.di(3, f.F.l[3]);
            h.di(8, f.F.y);
            h.di(9, f.F.v);
            h.di(10, f.F.z);
        }
        h.di(7, h.eE.y);
        h.di(6, f.G);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            h.i(new DataOutputStream(byteArrayOutputStream));
            ci = byteArrayOutputStream.toByteArray();
        }
        catch (Exception exception) {
            h.a(exception);
        }
        fG = false;
        h.kO();
        h.kp();
        h.ks();
        h.kr();
        h.kT();
        h.lx();
        for (int i = 0; i < gH.length; ++i) {
            if (-1 == gH[i]) continue;
            h.o(gH[i]);
        }
    }

    static void vJ(int n) {
        boolean bl = gJ = h.vg(n) || h.ve(n) || h.vb(n) || h.vw(n) || h.vI(n) || gW;
        if (!gJ) {
            h.ul(n);
            h.uz(n);
            h.uw(n);
            h.ux(n);
            h.vA(n);
            h.vB(n);
            h.vG(n);
            if (eF == -1) {
                h.lI();
            }
            h.lq();
            f f2 = h.kt();
            if (f2.w == 3 && f2.x > 4000) {
                f f3 = h.uC(37);
                h.E(100);
                h.n(5, -h.p(5, 0));
                f2.y = f2.g[2];
                if (f3 != null) {
                    h.o(cb, f3.h, f3.i);
                } else {
                    h.b(9, true);
                }
            }
        }
    }

    static void lI() {
        if (null != f.F) {
            return;
        }
        for (int i = 0; i < eB.length; ++i) {
            f f2 = eB[i];
            if (8 == (f2.v & 0xB) && eE.b(f2) < 0x280000) {
                h.vd(2);
                eH = i;
                return;
            }
            if (f2.d != 3 || f2.w != 1 || eE.b(f2) >= 0x280000 || da >= 0 || 9 == h.eE.w || !fm) continue;
            h.vd(7);
            eH = i;
            h.vE(167);
            return;
        }
    }

    static void Y(g g2) {
        if (gW) {
            h.ai(g2);
            return;
        }
        if (!fG) {
            if (eL) {
                h.x(g2);
            } else {
                g2.a(go - gm - g2.b(), gp - gn - g2.c());
                h.i(g2);
                h.W(g2);
                h.k(g2);
                h.a(g2, 2);
                h.j(g2);
                h.h(g2);
                if (null != h.eE.C) {
                    h.a(g2, 1118, h.eE.C.h, h.eE.C.i - 10);
                }
                g2.a(-g2.b(), -g2.c());
                h.U(g2);
                if (!gc) {
                    h.x(g2);
                    h.Q(g2);
                }
                h.T(g2);
            }
            h.z(g2);
        }
        h.A(g2);
        h.N(g2);
        h.X(g2);
        if (hb) {
            h.ak(g2);
        }
    }

    static void vK(int n) {
        if (h.ws(n)) {
            return;
        }
        if (h.vx(n)) {
            return;
        }
        if (h.vh(n)) {
            return;
        }
        if (h.vf(n)) {
            return;
        }
        if (!gc && h.vc(n)) {
            return;
        }
        if (h.kt().b(n)) {
            return;
        }
    }

    static boolean dh(int n, int n2) {
        int n3 = gm - go;
        int n4 = gn - gp;
        return n >= n3 && n < n3 + 240 && n2 >= n4 && n2 < n4 + 320;
    }

    static void lJ() {
        for (int i = 0; i < gL.length; ++i) {
            if (i == 6 || i == 7) continue;
            h.gL[i] = false;
        }
    }

    static void lK() {
        for (int i = 0; i < gL.length; ++i) {
            h.gL[i] = false;
        }
    }

    static void di(int n, int n2) {
        h.gK[n] = n2;
        h.gL[n] = true;
    }

    static void lL() {
        gM = new Vector();
        gN = new Vector();
        gM.addElement(S[94]);
        gM.addElement(S[95]);
        gM.addElement(S[93]);
        gN.addElement(Integer.toString(aw));
        gN.addElement(Integer.toString(as));
        gN.addElement(Integer.toString(ax));
    }

    static void lM() {
        gN = null;
        gM = null;
    }

    static void Z(g g2) {
        h.aa(g2);
        h.a(g2, S[92], 4, 120, 42, 3);
        h.ab(g2);
        h.a(g2, S[5], null, false);
    }

    static void aa(g g2) {
        g2.a(7360138);
        g2.d(0, 0, 240, 320);
        g2.a(5585770);
        g2.c(7, 52, 226, 234);
        g2.a(0);
        g2.d(0, 0, 240, 33);
        g2.d(0, 295, 240, 25);
        h.a(g2, 988, 120, 22);
        h.a(g2, 991, 120, 305);
    }

    static void ab(g g2) {
        h.a(g2, gM, 1, 17, 169, 6);
        h.a(g2, gN, 1, 137, 169, 6);
    }

    static void vL(int n) {
        if (4 == n || 7 == n) {
            dn = S[91];
            dG = 91;
            dH = 8;
            dI = 9;
            h.b(8, false);
        }
    }

    static void lN() {
        gO = 0;
        gS = true;
        gT = -1;
        gP = gI[h.a(gI.length)];
        gQ = S[467 + cb - 0];
    }

    static void aV(boolean bl) {
        gS = bl;
        if (!bl) {
            gP = 414;
        }
    }

    static void vM(int n) {
        gT = n;
    }

    static void vN(int n) {
        if (n < gO) {
            return;
        }
        gO = n;
        if (1000 <= gO && 1 != db) {
            gR = true;
            if (-1 != gT) {
                h.b(true, gT);
            }
        }
        h.me();
    }

    static boolean vO(int n) {
        if (gR) {
            switch (n) {
                case 9: {
                    h.b(4, false);
                }
                case 4: 
                case 7: {
                    gR = false;
                    gU = false;
                    h.md();
                    return true;
                }
            }
        }
        return false;
    }

    static void ac(g g2) {
        h.ae(g2);
        h.ad(g2);
        h.af(g2);
        h.a(g2, gR ? (gU ? S[5] : S[29]) : null, null, false);
    }

    static void ad(g g2) {
        if (gS) {
            h.a(g2, S[415], 4, 120, 76, 3);
        }
        h.a(g2, h.a(S[gP], 1, 205), 1, 18, 161, 6);
        if (!gR) {
            h.a(g2, S[2], 1, 120, 283, 3);
        }
        h.a(g2, gQ, 4, 120, 272, 3);
    }

    static void ae(g g2) {
        g2.a(0);
        g2.d(0, 0, 240, 320);
        g2.a(7360138);
        g2.d(0, 70, 240, 180);
        g2.a(5585770);
        g2.c(8, 83, 225, 157);
        h.a(g2, 988, 120, 249);
        h.a(g2, 1080, 120, 0);
    }

    static void af(g g2) {
        h.a(g2, 1077, 120, 296);
        int n = 227 * gO / 1000;
        g2.a(7, 283, n, 26);
        h.a(g2, 1078, 120, 296);
        g2.a(0, 0, 240, 320);
    }

    static void vP(int n) {
        h.md();
        switch (n) {
            case 3: {
                h.jV();
                break;
            }
            case 4: {
                h.jX();
                break;
            }
            case 5: {
                h.jZ();
                break;
            }
            case 6: {
                h.kb();
                break;
            }
            case 7: {
                h.kd();
                break;
            }
            case 8: {
                h.km();
                break;
            }
            case 9: {
                h.lG();
                break;
            }
            case 10: {
                h.lL();
            }
        }
        d = System.currentTimeMillis();
    }

    static void vQ(int n) {
        switch (n) {
            case 3: {
                h.jW();
                break;
            }
            case 4: {
                h.jY();
                break;
            }
            case 5: {
                h.ka();
                break;
            }
            case 6: {
                h.kc();
                break;
            }
            case 7: {
                h.ke();
                break;
            }
            case 8: {
                h.kn();
                break;
            }
            case 9: {
                h.lH();
                break;
            }
            case 10: {
                h.lM();
            }
        }
    }

    static void vR(int n) {
        if (0 != dc) {
            h.c(dc, dd);
            dc = 0;
            return;
        }
        if (dd || de) {
            return;
        }
        switch (db) {
            case 3: {
                h.um(n);
                if (h.A(0)) break;
                h.y(0);
                break;
            }
            case 7: {
                h.kf();
                break;
            }
            case 9: {
                h.vJ(n);
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 8: {
                if (!af || h.A(0)) break;
                h.y(0);
            }
        }
    }

    static void ag(g g2) {
        if (db != 9) {
            g2.a(0);
            g2.d(0, 0, 240, 320);
        }
        switch (db) {
            case 2: {
                h.a(g2);
                break;
            }
            case 0: 
            case 1: {
                h.aj(g2);
                break;
            }
            case 3: {
                h.b(g2);
                break;
            }
            case 4: {
                h.c(g2);
                break;
            }
            case 5: {
                h.d(g2);
                break;
            }
            case 6: {
                h.e(g2);
                break;
            }
            case 7: {
                h.f(g2);
                break;
            }
            case 8: {
                h.g(g2);
                break;
            }
            case 9: {
                h.Y(g2);
                break;
            }
            case 10: {
                h.Z(g2);
            }
        }
        if (de) {
            h.ah(g2);
        } else if (dd) {
            h.ac(g2);
        }
    }

    static void vS(int n) {
        if (de) {
            if (h.vU(n)) {
                de = false;
                h.md();
            }
            return;
        }
        if (dd) {
            if (h.vO(n)) {
                dd = false;
            }
            return;
        }
        switch (db) {
            case 2: {
                h.t(n);
                break;
            }
            case 3: {
                h.un(n);
                break;
            }
            case 4: {
                h.uo(n);
                break;
            }
            case 5: {
                h.uq(n);
                break;
            }
            case 6: {
                h.ur(n);
                break;
            }
            case 7: {
                h.us(n);
                break;
            }
            case 8: {
                h.uu(n);
                break;
            }
            case 9: {
                h.vK(n);
                break;
            }
            case 10: {
                h.vL(n);
            }
        }
    }

    static void b(int n, boolean bl) {
        dc = n;
        dd = bl;
        if (dd) {
            h.lN();
        }
        if (hb && n == 9) {
            a.a();
        }
    }

    static void vT(int n) {
        h.b(n, false);
    }

    static void c(int n, boolean bl) {
        int n2 = db;
        db = 0;
        if (bl) {
            h.me();
        }
        h.vQ(n2);
        h.vP(n);
        db = n;
    }

    private static void aj(g g2) {
        g2.a(0);
        g2.d(0, 0, 240, 320);
        h.a(g2, S[2], 0, 120, 160, 3);
        int n = 160 + h.v(0);
        g2.a(0xFFFFFF);
        g2.c(60, n, 119, 6);
        g2.d(62, n + 2, 116 * gO / 1000, 3);
    }

    static void aW(boolean bl) {
        if (bl) {
            if (db <= 2) {
                return;
            }
            h.d();
            de = true;
        }
    }

    static boolean vU(int n) {
        return 7 == n || 9 == n || 4 == n;
    }

    static void ah(g g2) {
        h.I(g2);
        h.a(g2, h.a(S[73], 1, 190), 1, 120, 186 - h.v(1) / 2, 17);
        h.a(g2, S[5], null, false);
    }

    static void aX(boolean bl) {
        for (int i = 0; i < eB.length; ++i) {
            if (h.eB[i].e == 25 || h.eB[i].e == 41) {
                eB[i].f(!bl);
                eB[i].g(bl);
            }
            if (15 != h.eB[i].d) continue;
            eB[i].b(bl);
        }
    }

    static void d(int n, boolean bl) {
        eB[n].b(bl);
    }

    static void dj(int n, int n2) {
        h.eB[n].v |= n2;
    }

    static void dk(int n, int n2) {
        h.eB[n].v &= ~n2;
    }

    static boolean dl(int n, int n2) {
        return 0 != (h.eB[n].v & n2);
    }

    static f vV(int n) {
        return eB[n];
    }

    static f vW(int n) {
        return h.uC(n);
    }

    static void k(int n, int n2, int n3) {
        eB[n].c(n2, n3);
    }

    static boolean l(int n, int n2, int n3) {
        return eB[n].b(eB[n2]) < n3 << 16;
    }

    static void dm(int n, int n2) {
        f f2 = eB[n];
        if (!h.m(f.g(f2.e), n2)) {
            return;
        }
        f2.f = n2;
    }

    static void dn(int n, int n2) {
        eB[n].c(n2 * 205888 / 180);
    }

    static void m(int n, int n2, int n3) {
        eB[n].a(eB[n2], n3 << 16);
    }

    static void e(int n, boolean bl) {
        eB[n].a(bl);
    }

    static void do(int n, int n2) {
        eB[n].h(n2);
    }

    static void n(int n, int n2, int n3) {
        eB[n].c(n2, n3);
        eB[n].b();
    }

    static void aY(boolean bl) {
        cO = bl;
    }

    static void lO() {
        h.jP();
    }

    static void dp(int n, int n2) {
        if (cg[n] > 0) {
            h.a("Error: Timer " + n + " is already set");
            return;
        }
        h.cg[n] = n2;
    }

    static void vX(int n) {
        h.cg[n] = 0;
    }

    static void vY(int n) {
        h.vy(n);
    }

    static void dq(int n, int n2) {
        if (cf) {
            return;
        }
        int n3 = n * 2;
        if (ch[n3 + 1] > 0) {
            h.a("Error: Thread " + n + " is already active");
            return;
        }
        h.ch[n3 + 0] = 0;
        h.ch[n3 + 1] = n2;
        if (n2 > 0) {
            h.cV(n, 0);
        }
    }

    static void vZ(int n) {
        if (cf) {
            return;
        }
        int n2 = n * 2;
        h.ch[n2 + 0] = 0;
        h.ch[n2 + 1] = 0;
    }

    static boolean wa(int n) {
        return ch[n * 2 + 1] > 0;
    }

    static boolean wb(int n) {
        return h.Q(n);
    }

    static boolean wc(int n) {
        return h.R(n);
    }

    static void wd(int n) {
        h.N(n);
    }

    static void we(int n) {
        h.O(n);
    }

    static void aZ(boolean bl) {
        if (bl) {
            h.d(S[155]);
            h.B(500);
            h.f();
        } else {
            h.d(S[154]);
            h.B(500);
            h.E(au);
        }
        h.g();
    }

    static void f(int n, boolean bl) {
        int n2;
        if (bl) {
            switch (cb) {
                case 0: {
                    h.hN(n);
                    break;
                }
                case 5: {
                    h.ic(n);
                    break;
                }
                case 3: {
                    h.le(n);
                    break;
                }
                case 1: {
                    h.nK(n);
                    break;
                }
                case 4: {
                    h.qq(n);
                    break;
                }
                case 2: {
                    h.tD(n);
                }
            }
        }
        for (n2 = n; n2 >= 0; --n2) {
            h.P(n2);
            if (0 != aI[n2][2]) break;
        }
        h.N(n2);
    }

    static void ba(boolean bl) {
        if (cf) {
            return;
        }
        if (bl) {
            h.lu();
        } else {
            h.lv();
        }
    }

    static void dr(int n, int n2) {
        if (cf) {
            return;
        }
        h.df(n, n2);
    }

    static void lP() {
        if (cf) {
            return;
        }
        h.ly();
    }

    static void wf(int n) {
        if (cf) {
            return;
        }
        h.vE(n);
    }

    static void wg(int n) {
        h.vF(n);
    }

    static void bb(boolean bl) {
        fL = bl;
    }

    static void bc(boolean bl) {
        fm = bl;
    }

    static void wh(int n) {
        h.a(true, n);
    }

    static void ds(int n, int n2) {
        eP = n2;
        eQ = n;
    }

    static void lQ() {
        h.aU(true);
    }

    static void wi(int n) {
        if (eE.s()) {
            if (f.F.a(u, 0)) {
                f f2 = h.vV(n);
                f2.d = 3;
                f2.c(u[0], u[1]);
                f2.b(true);
                f2.i(eE);
            }
        }
    }

    static void wj(int n) {
        if (cf) {
            return;
        }
        if (n < 0) {
            h.E(-n);
        } else {
            h.D(n);
            h.d(S[160] + n);
        }
    }

    static int wk(int n) {
        return h.H(n);
    }

    static void dt(int n, int n2) {
        int n3 = n2 - 1;
        if (n3 < 0 || n3 >= ay.length) {
            return;
        }
        h.aD[n] = n3 == ay.length - 1 ? 0x320000 : ay[n3 + 1] + ay[n3] >> 1;
    }

    static void du(int n, int n2) {
        if (cf) {
            return;
        }
        h.n(n, aD[n] * n2 / 100);
        h.aC[n] = true;
    }

    static void bd(boolean bl) {
        aE = !bl;
    }

    static void dv(int n, int n2) {
        for (int i = 0; i < ey.length; ++i) {
            if (n != ey[i] - 4) continue;
            h.ey[i] = (byte)(4 + n2);
        }
    }

    static void dw(int n, int n2) {
        h.a(n == -1 ? null : eB[n], n2 == -1 ? null : eB[n2]);
    }

    static void wl(int n) {
        h.vd(n);
    }

    static void lR() {
        if (eE.s()) {
            eE.t();
        }
    }

    static void be(boolean bl) {
        for (int i = 0; i < eB.length; ++i) {
            f f2 = eB[i];
            if (f2.e != 25 && f2.e != 41) continue;
            if (bl) {
                if (f.ai) continue;
            }
            f2.g(bl);
        }
    }

    static f lS() {
        if (eE.s()) {
            return f.F;
        }
        return null;
    }

    static boolean g(f f2) {
        return f2.e == 38 || f2.e == 39;
    }

    static boolean h(f f2) {
        if (null != f2) {
            switch (f2.d) {
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: {
                    return true;
                }
            }
        }
        return false;
    }

    static void dx(int n, int n2) {
        h.s(n, n2);
    }

    static void dy(int n, int n2) {
        h.s(h.ui(n), cV[n][5] * n2);
    }

    static void wm(int n) {
        h.aH[21 + n - 3] = true;
    }

    static void o(int n, int n2, int n3) {
        h.di(4, n2);
        h.di(5, n3);
        cc = cb;
        cb = n;
        h.b(9, true);
    }

    static void c(int n, int n2, int n3, int n4) {
        h.b(n, n2, n3, n4);
    }

    static void dz(int n, int n2) {
        int n3 = h.ui(n);
        boolean bl = 0 == aG[n3];
        boolean bl2 = h.b(n3, n2, bl);
        if (bl && bl2) {
            h.c(S[455]);
        }
        if (bl) {
            h.uV(n);
        }
    }

    static void wn(int n) {
        h.aH[h.ui((int)n)] = true;
    }

    static void wo(int n) {
        eE.l(n);
    }

    static void dA(int n, int n2) {
        h.eB[n].O = n2;
    }

    static void dB(int n, int n2) {
        f f2 = eB[n];
        switch (f2.d) {
            case 1: 
            case 5: 
            case 6: 
            case 7: {
                f2.j(eB[n2]);
                break;
            }
            case 8: 
            case 11: 
            case 12: {
                f2.e(11);
                f2.b(eB[n2], 0);
            }
        }
    }

    static void dC(int n, int n2) {
        f f2 = eB[n];
        switch (f2.d) {
            case 8: 
            case 11: 
            case 12: {
                f2.e(11);
                f2.p(eB[n2]);
                break;
            }
            case 5: 
            case 7: {
                f2.q(h.eB[n2].z);
                f2.k(eB[n2]);
            }
        }
    }

    static void wp(int n) {
        f f2 = eB[n];
        switch (f2.d) {
            case 11: {
                f2.W();
                f2.e(f2.g[0]);
                break;
            }
            case 5: 
            case 7: {
                f2.k(null);
            }
        }
    }

    static void dD(int n, int n2) {
        f f2 = eB[n];
        if (f2.e()) {
            f2.f(2);
            f2.p = n2;
            f2.v |= 0x2000;
        }
    }

    static void wq(int n) {
        if (5 == eF) {
            h.aQ(false);
        }
        f f2 = eB[n];
        f.Z = 1;
        f2.f(1);
    }

    static boolean wr(int n) {
        return k[n];
    }

    static void lT() {
        gW = false;
        n = true;
    }

    static boolean ws(int n) {
        if (!gW) {
            return false;
        }
        if (gX) {
            if (h.a(n, true)) {
                return true;
            }
            switch (n) {
                case 4: {
                    if (!h.wu(dt)) break;
                    h.a("[Quest activated]");
                    h.lT();
                }
                case 8: {
                    gX = false;
                    break;
                }
                case 10: {
                    h.lT();
                }
            }
            return true;
        }
        int n2 = -1;
        switch (n) {
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: {
                n2 = n - 11;
                break;
            }
            case 4: 
            case 8: 
            case 10: {
                h.lT();
                return true;
            }
        }
        if (n2 < 0) {
            return true;
        }
        switch (gV[n2]) {
            case 475: {
                f.H = !f.H;
                h.b("God mode: " + f.H);
                break;
            }
            case 476: {
                h.C(100);
                break;
            }
            case 477: {
                h.i();
                break;
            }
            case 478: {
                for (int i = 0; i < cV.length; ++i) {
                    int n3 = cV[i][0];
                    if (n3 == -1 || 0 != aG[n3]) continue;
                    h.aG[n3] = 10 * cV[i][5];
                }
                break;
            }
            case 479: {
                j = !j;
                h.b("Super-speed mode: " + j);
                break;
            }
            case 480: {
                cb = (cb + 1) % 6;
                h.b(9, true);
                break;
            }
            case 481: {
                int n4 = h.q();
                if (n4 == -1) break;
                h.O(n4);
                break;
            }
            case 482: {
                gX = true;
                return true;
            }
        }
        h.lT();
        h.a("Cheat activated: " + h.wt(n2));
        return true;
    }

    static void ai(g g2) {
        int n;
        g2.a(0x808080);
        g2.d(0, 0, 240, 320);
        h.a(g2, h.a(S[474], 1, 240), 1, 120, 3, 17);
        for (n = 0; n < gV.length; ++n) {
            h.a(g2, new Integer(n + 1) + ".", 0, 5, 62 + n * 15, 6);
            h.a(g2, h.wt(n), 0, 26, 62 + n * 15, 6);
        }
        if (gX) {
            g2.a(32960);
            g2.d(8, 11, 225, 302);
            g2.a(0);
            g2.c(8, 11, 224, 301);
            dv = du + 20;
            n = 0;
            for (int i = 0; i < aI.length; ++i) {
                if (0 == aI[i][2]) continue;
                if (n >= du && n < dv) {
                    int n2 = (n - du) * 15;
                    if (n == ds) {
                        g2.a(25491);
                        g2.d(10, 13 + n2, 221, 15);
                        g2.a(0);
                        g2.c(11, 13 + n2 + 1, 220, 14);
                        g2.a(0xFFFFFF);
                        g2.c(10, 13 + n2, 220, 14);
                        dt = i;
                    }
                    h.a(g2, S[aI[i][4]], 0, 13, 20 + n2, 6);
                }
                ++n;
            }
            dr = n;
            dv = Math.min(dv, dr);
        }
        h.a(g2, "", S[10], false);
    }

    static String wt(int n) {
        String string = S[gV[n]];
        switch (gV[n]) {
            case 475: {
                string = h.a(string, (Object)new Boolean(f.H).toString());
                break;
            }
            case 479: {
                string = h.a(string, (Object)new Boolean(j).toString());
            }
        }
        return string;
    }

    static boolean wu(int n) {
        if (-1 == n) {
            return false;
        }
        h.o();
        for (int i = 0; i < n; ++i) {
            h.aI[i][0] = 4;
        }
        h.N(n);
        h.b(9, true);
        return true;
    }

    static void lU() {
        int n;
        h.n(3);
        h.n(0);
        h.n(6);
        h.n(8);
        h.vN(500);
        h.j(aq ? 8 : 6, 11);
        h.j(6, 12);
        h.j(6, 13);
        h.j(8, 12);
        h.vN(550);
        h.o(6);
        h.o(8);
        h.n(5);
        h.n(7);
        h.n(4);
        h.n(12);
        h.n(11);
        h.vN(600);
        h.n(13);
        h.n(16);
        h.n(18);
        h.n(25);
        h.n(27);
        h.n(31);
        h.n(29);
        h.n(33);
        h.vN(650);
        for (n = 1; n < 4; ++n) {
            h.j(18, n);
        }
        h.o(18);
        h.vN(700);
        for (n = 1; n < 4; ++n) {
            h.j(5, n);
        }
        h.o(5);
        h.vN(800);
        for (n = 1; n < 4; ++n) {
            h.j(7, n);
        }
        h.o(7);
        h.vN(900);
        for (n = 1; n < 4; ++n) {
            h.j(13, n);
        }
        h.o(13);
        h.vN(950);
        h.c();
        h.L[0][18] = L[1][18];
        h.L[0][5] = L[1][5];
        h.L[0][7] = L[1][7];
        h.L[0][13] = L[1][13];
    }

    static void lV() {
        h.k(aq ? 6 : 8, 11);
        h.j(!aq ? 6 : 8, 11);
    }

    h(MIDlet mIDlet) {
        this.setFullScreenMode(true);
        e = new g(240, 320);
        b = this;
        a = mIDlet;
        c = Display.getDisplay(a);
        c.setCurrent(this);
    }

    static void lW() throws IOException {
        String string;
        DataInputStream dataInputStream = new DataInputStream(b.getClass().getResourceAsStream("/bin.all"));
        h.h(dataInputStream);
        h.k(dataInputStream);
        h.j(dataInputStream);
        p = false;
        String string2 = a.getAppProperty("Gore");
        if (null != string2 && string2.toLowerCase().equals("on")) {
            p = true;
        }
        if (null == (string = a.getAppProperty("MIDlet-Version"))) {
            string = "1.0";
        }
        h.S[61] = h.a(S[61], (Object)string);
        h.c(1, true);
        h.i(dataInputStream);
        h.b();
        h.vN(100);
        h.l(dataInputStream);
        h.m(dataInputStream);
        h.vN(200);
        h.q(dataInputStream);
        h.s(dataInputStream);
        h.o(dataInputStream);
        h.A(dataInputStream);
        h.E(dataInputStream);
        h.x(dataInputStream);
        h.J(dataInputStream);
        h.I(dataInputStream);
        h.G(dataInputStream);
        h.K(dataInputStream);
        h.u(dataInputStream);
        dataInputStream.close();
        h.vN(300);
        h.lB();
        h.jT();
        h.mf();
        d = System.currentTimeMillis();
        h.vN(400);
        h.lU();
        h.vN(1000);
        af = false;
        dn = null;
        dG = 68;
        dH = 8;
        dI = 9;
        h.b(8, false);
    }

    static void lX() {
        h.mg();
    }

    static void bf(boolean bl) {
        if (h) {
            return;
        }
        f = bl;
        if (f) {
            h.aW(true);
        }
    }

    static void lY() {
        h.a(false);
        h.md();
    }

    static void lZ() {
        h.a(true);
        d = System.currentTimeMillis();
    }

    void ma() {
        this.run();
    }

    static void mb() {
        f = false;
        h = true;
        h.lX();
    }

    public void run() {
        while (!h) {
            long l;
            if (f != g) {
                if (f) {
                    h.lY();
                } else {
                    h.lZ();
                }
                g = f;
            }
            if (f) {
                try {
                    Thread.sleep(200L);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                d = System.currentTimeMillis();
                continue;
            }
            int n = 0;
            do {
                Thread.yield();
            } while ((n = (int)((l = System.currentTimeMillis()) - d)) < o);
            if (n > 100) {
                n = 100;
            }
            d = l;
            h.vR(n);
            h.mc();
            h.me();
        }
        h.lX();
        a.notifyDestroyed();
    }

    protected void paint(Graphics graphics) {
        graphics.setClip(0, 0, 240, 320);
        if (null != e) {
            e.a(graphics);
            h.ag(e);
            e.a();
        }
    }

    protected void hideNotify() {
        h.bf(true);
    }

    protected void showNotify() {
        h.bf(false);
    }

    protected void keyPressed(int n) {
        int n2 = h.s(n);
        if (-1 == n2) {
            return;
        }
        if (n2 < k.length) {
            h.k[n2] = true;
        }
        if (m < l.length) {
            h.l[h.m++] = n2;
        }
    }

    protected void keyReleased(int n) {
        int n2 = h.s(n);
        if (-1 == n2) {
            return;
        }
        h.k[n2] = false;
    }

    static void mc() {
        for (int i = 0; i < m; ++i) {
            h.vS(l[i]);
        }
        m = 0;
    }

    static void md() {
        for (int i = 0; i < k.length; ++i) {
            h.k[i] = false;
        }
        m = 0;
    }

    static void me() {
        b.repaint();
        b.serviceRepaints();
    }

    static void mf() {
        try {
            RecordStore recordStore = RecordStore.openRecordStore("saintsrow2", true);
            byte[] byArray = null;
            try {
                byArray = recordStore.getRecord(1);
            }
            catch (Exception exception) {
                // empty catch block
            }
            recordStore.closeRecordStore();
            if (null != byArray) {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
                if (29 == dataInputStream.readByte()) {
                    ao = dataInputStream.readBoolean();
                    i = dataInputStream.readBoolean();
                    q = dataInputStream.readBoolean();
                    if (!p) {
                        q = false;
                    }
                    h.z(dataInputStream);
                }
                dataInputStream.close();
            }
        }
        catch (Exception exception) {
            h.a(exception.toString());
            h.jT();
        }
    }

    static void mg() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(29);
            dataOutputStream.writeBoolean(ao);
            dataOutputStream.writeBoolean(i);
            dataOutputStream.writeBoolean(q);
            h.h(dataOutputStream);
            byte[] byArray = byteArrayOutputStream.toByteArray();
            try {
                RecordStore.deleteRecordStore("saintsrow2");
            }
            catch (Exception exception) {
                // empty catch block
            }
            RecordStore recordStore = RecordStore.openRecordStore("saintsrow2", true);
            recordStore.addRecord(byArray, 0, byArray.length);
            recordStore.closeRecordStore();
        }
        catch (Exception exception) {
            h.a(exception);
        }
    }

    public static String wv(int n) {
        if (n >= 0 && n < S.length) {
            return S[n];
        }
        if (n == 1200) {
            return i.a[gY];
        }
        if (n == 999) {
            return i.b[gY];
        }
        return i.c[n - 666][gY];
    }

    public static void mh() {
        String string;
        String string2 = a.getAppProperty("GameLinkEnabled");
        if (string2 != null && string2.toUpperCase().equals("TRUE")) {
            gZ = true;
        }
        if ((string = a.getAppProperty("Demo")) != null && string.toUpperCase().equals("TRUE")) {
            hb = true;
        }
    }

    public static boolean h(String string) {
        boolean bl = false;
        try {
            bl = a.platformRequest(string);
        }
        catch (Exception exception) {
            return false;
        }
        return bl;
    }

    public static void mi() {
        String string = "GameUrl-" + ha[gY];
        String string2 = a.getAppProperty(string);
        h.i(string2);
    }

    public static void mj() {
        a.b();
        dn = "";
        dG = 669;
        dH = 667;
        dI = 11;
        h.b(8, false);
    }

    private static void ak(g g2) {
        if (!fG) {
            h.a(g2, a.d(), 3, 120, 0, 17);
        }
    }

    private static void mk() {
        String string = "BuyGameURL";
        String string2 = a.getAppProperty(string);
        h.i(string2);
    }

    public static void i(String string) {
        hc = string;
        dn = "";
        dG = 1200;
        dH = 5;
        dI = 10;
        h.b(8, false);
    }

    static {
        i = true;
        k = new boolean[20];
        l = new int[8];
        m = 0;
        n = true;
        o = 10;
        q = false;
        r = new int[5];
        s = new int[5];
        t = new int[5];
        u = new int[3];
        v = new int[3];
        w = new int[3];
        x = new int[3];
        y = new int[3];
        z = new int[3];
        A = new int[3];
        B = new int[3];
        C = new int[3];
        D = new Random();
        E = new int[]{65536, 65536, 131072, 393216, 0x180000, 0x780000, 0x2D00000, 330301440, -1652555776};
        F = new int[3];
        G = new int[]{0, 3215, 6423, 9616, 12785, 15923, 19024, 22078, 25079, 28020, 30893, 33692, 36409, 39039, 41575, 44011, 46340, 48558, 50660, 52639, 54491, 56212, 57797, 59243, 60547, 61705, 62714, 63571, 64276, 64826, 65220, 65457, 65536};
        H = G.length - 1;
        ad = new Object[4];
        af = true;
        am = -1;
        an = -1;
        ao = true;
        ay = new int[]{131072, 655360, 0x140000, 0x1E0000, 0x280000};
        aD = new int[6];
        aJ = null;
        aN = null;
        aO = null;
        aP = 0;
        aQ = null;
        aR = null;
        aS = null;
        aT = null;
        aU = null;
        aV = null;
        aX = null;
        aY = null;
        aZ = null;
        ba = null;
        bb = false;
        bc = null;
        bd = null;
        be = null;
        bf = null;
        bg = null;
        bh = false;
        bi = 0;
        bj = null;
        bk = false;
        bl = null;
        bm = null;
        bn = null;
        bo = null;
        bp = null;
        bq = null;
        br = null;
        bs = null;
        bu = null;
        bv = null;
        bw = true;
        bx = true;
        by = true;
        bz = true;
        bA = false;
        bB = null;
        bC = null;
        bD = null;
        bE = null;
        bF = null;
        bG = null;
        bH = null;
        bI = null;
        bK = null;
        bL = null;
        bM = null;
        bN = 0;
        bO = 0;
        bP = null;
        bQ = null;
        bR = null;
        bS = null;
        bT = null;
        bU = null;
        bV = null;
        bW = null;
        bX = null;
        bY = null;
        cg = new int[16];
        ch = new int[32];
        cm = new int[]{205888, 102944};
        cn = new boolean[][]{{false, true, false, false, false, true, false, true}, {false, false, true, false, true, true, false, false}};
        co = new int[]{0, 102944};
        cp = new boolean[][]{{true, false, false, false, true, false, true, false}, {false, false, true, false, true, true, false, false}};
        cq = new int[]{205888, 308832};
        cr = new boolean[][]{{false, true, false, false, false, true, false, true}, {false, false, false, true, false, false, true, true}};
        cs = new int[]{0, 308832};
        ct = new boolean[][]{{true, false, false, false, true, false, true, false}, {false, false, false, true, false, false, true, true}};
        cu = new int[]{0, 51472};
        cv = new boolean[][]{cp[0], cp[1]};
        cw = new int[]{0, 360304};
        cx = new boolean[][]{ct[0], ct[1]};
        cy = new int[]{205888, 154416};
        cz = new boolean[][]{cn[0], cn[1]};
        cA = new int[]{205888, 257360};
        cB = new boolean[][]{cr[0], cr[1]};
        cC = new int[]{51472, 102944};
        cD = new boolean[][]{cp[0], cp[1]};
        cE = new int[]{154416, 102944};
        cF = new boolean[][]{cn[0], cn[1]};
        cG = new int[]{360304, 308832};
        cH = new boolean[][]{ct[0], ct[1]};
        cI = new int[]{257360, 308832};
        cJ = new boolean[][]{cr[0], cr[1]};
        cK = Math.max(240, 320);
        cL = Math.max(240, 320);
        cQ = new int[][]{{0, -1}, {1, 0}, {0, 1}, {-1, 0}};
        cR = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        cZ = false;
        db = -1;
        dc = 0;
        dd = false;
        de = false;
        dg = new int[]{670, 666, 48, 49, 33, 44, 45, 999, 31};
        dx = new int[]{36, 38, 40, 59};
        dy = new int[]{36, 38, 40, 42, 59};
        dJ = new int[2];
        dK = new int[2];
        dL = new int[2];
        dM = new Vector();
        dN = new Vector();
        dO = new int[2];
        dP = new int[2];
        dQ = new int[2];
        dT = new int[2];
        dU = new int[2];
        dV = new int[2];
        dW = new int[2];
        dX = new int[2];
        dY = null;
        eb = new int[]{30, 39, 39};
        eM = new int[]{462, 463};
        eP = -1;
        eQ = -1;
        eS = new boolean[eM.length];
        fm = true;
        fo = new int[]{1090, 1098, 1112, 1103, 1096};
        fq = 0;
        fr = 0;
        fs = new int[3];
        ft = 0;
        fy = new Vector();
        fE = new Vector();
        fJ = new int[]{52, 53, 54, 55};
        fK = new int[]{970, 1125, 969, 971};
        fM = new int[]{32, 50, 33, 44, 34};
        fO = null;
        fP = 0;
        fR = -1;
        fU = true;
        fV = true;
        go = 120;
        gp = 160;
        gC = new int[128][5];
        gE = false;
        gF = 0;
        gH = new int[]{19, 14, 21, 15, 17, -1, -1, -1};
        gI = new int[]{431, 433, 436};
        gK = new int[11];
        gL = new boolean[11];
        gQ = "";
        gR = false;
        gT = -1;
        gU = false;
        gV = new int[]{475, 476, 477, 478, 479, 480, 481, 482};
        gW = false;
        gX = false;
        gY = 0;
        gZ = false;
        ha = new String[]{"en", "fr", "it", "de", "es"};
        hb = false;
        hc = null;
    }
}
