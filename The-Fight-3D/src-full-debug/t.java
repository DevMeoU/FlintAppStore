/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class t {
    private Image a = null;
    private Image b = null;
    private short[] c;
    private short[] d;
    private short[] e;
    private short[] f;
    private short[] g;
    private short[] h;
    private short[][] i;
    private Graphics j;

    public t(Graphics graphics) {
        short[] sArray = new short[144];
        sArray[1] = 22;
        sArray[2] = 44;
        sArray[3] = 66;
        sArray[4] = 88;
        sArray[5] = 110;
        sArray[6] = 132;
        sArray[7] = 154;
        sArray[8] = 176;
        sArray[9] = 198;
        sArray[10] = 220;
        sArray[12] = 22;
        sArray[13] = 44;
        sArray[14] = 66;
        sArray[15] = 88;
        sArray[16] = 110;
        sArray[17] = 132;
        sArray[18] = 154;
        sArray[19] = 176;
        sArray[20] = 198;
        sArray[21] = 220;
        sArray[23] = 22;
        sArray[24] = 44;
        sArray[25] = 66;
        sArray[26] = 88;
        sArray[27] = 110;
        sArray[28] = 132;
        sArray[29] = 154;
        sArray[30] = 176;
        sArray[31] = 198;
        sArray[32] = 220;
        sArray[34] = 22;
        sArray[35] = 44;
        sArray[36] = 66;
        sArray[37] = 88;
        sArray[38] = 110;
        sArray[39] = 132;
        sArray[40] = 154;
        sArray[41] = 176;
        sArray[42] = 198;
        sArray[43] = 220;
        sArray[45] = 22;
        sArray[46] = 44;
        sArray[47] = 66;
        sArray[48] = 88;
        sArray[49] = 110;
        sArray[50] = 132;
        sArray[51] = 154;
        sArray[52] = 176;
        sArray[53] = 198;
        sArray[54] = 220;
        sArray[56] = 22;
        sArray[57] = 44;
        sArray[58] = 66;
        sArray[59] = 88;
        sArray[60] = 110;
        sArray[61] = 132;
        sArray[62] = 154;
        sArray[63] = 176;
        sArray[64] = 198;
        sArray[65] = 220;
        sArray[67] = 22;
        sArray[68] = 44;
        sArray[69] = 66;
        sArray[70] = 88;
        sArray[71] = 110;
        sArray[72] = 132;
        sArray[73] = 154;
        sArray[74] = 176;
        sArray[75] = 198;
        sArray[76] = 220;
        sArray[78] = 22;
        sArray[79] = 44;
        sArray[80] = 66;
        sArray[81] = 88;
        sArray[82] = 110;
        sArray[83] = 132;
        sArray[84] = 154;
        sArray[85] = 176;
        sArray[86] = 198;
        sArray[87] = 220;
        sArray[89] = 22;
        sArray[90] = 44;
        sArray[91] = 66;
        sArray[92] = 88;
        sArray[93] = 110;
        sArray[94] = 132;
        sArray[95] = 154;
        sArray[96] = 176;
        sArray[97] = 198;
        sArray[98] = 220;
        sArray[100] = 22;
        sArray[101] = 44;
        sArray[102] = 66;
        sArray[103] = 88;
        sArray[104] = 110;
        sArray[105] = 132;
        sArray[106] = 154;
        sArray[107] = 176;
        sArray[108] = 198;
        sArray[109] = 220;
        sArray[111] = 22;
        sArray[112] = 44;
        sArray[113] = 66;
        sArray[114] = 88;
        sArray[115] = 110;
        sArray[116] = 132;
        sArray[117] = 154;
        sArray[118] = 176;
        sArray[119] = 198;
        sArray[120] = 220;
        sArray[122] = 22;
        sArray[123] = 44;
        sArray[124] = 66;
        sArray[125] = 88;
        sArray[126] = 110;
        sArray[127] = 132;
        sArray[128] = 154;
        sArray[129] = 176;
        sArray[130] = 198;
        sArray[131] = 220;
        sArray[133] = 22;
        sArray[134] = 44;
        sArray[135] = 66;
        sArray[136] = 88;
        sArray[137] = 110;
        sArray[138] = 132;
        sArray[139] = 154;
        sArray[140] = 176;
        sArray[141] = 198;
        sArray[142] = 220;
        this.c = sArray;
        short[] sArray2 = new short[144];
        sArray2[11] = 22;
        sArray2[12] = 22;
        sArray2[13] = 22;
        sArray2[14] = 22;
        sArray2[15] = 22;
        sArray2[16] = 22;
        sArray2[17] = 22;
        sArray2[18] = 22;
        sArray2[19] = 22;
        sArray2[20] = 22;
        sArray2[21] = 22;
        sArray2[22] = 44;
        sArray2[23] = 44;
        sArray2[24] = 44;
        sArray2[25] = 44;
        sArray2[26] = 44;
        sArray2[27] = 44;
        sArray2[28] = 44;
        sArray2[29] = 44;
        sArray2[30] = 44;
        sArray2[31] = 44;
        sArray2[32] = 44;
        sArray2[33] = 66;
        sArray2[34] = 66;
        sArray2[35] = 66;
        sArray2[36] = 66;
        sArray2[37] = 66;
        sArray2[38] = 66;
        sArray2[39] = 66;
        sArray2[40] = 66;
        sArray2[41] = 66;
        sArray2[42] = 66;
        sArray2[43] = 66;
        sArray2[44] = 88;
        sArray2[45] = 88;
        sArray2[46] = 88;
        sArray2[47] = 88;
        sArray2[48] = 88;
        sArray2[49] = 88;
        sArray2[50] = 88;
        sArray2[51] = 88;
        sArray2[52] = 88;
        sArray2[53] = 88;
        sArray2[54] = 88;
        sArray2[55] = 110;
        sArray2[56] = 110;
        sArray2[57] = 110;
        sArray2[58] = 110;
        sArray2[59] = 110;
        sArray2[60] = 110;
        sArray2[61] = 110;
        sArray2[62] = 110;
        sArray2[63] = 110;
        sArray2[64] = 110;
        sArray2[65] = 110;
        sArray2[66] = 132;
        sArray2[67] = 132;
        sArray2[68] = 132;
        sArray2[69] = 132;
        sArray2[70] = 132;
        sArray2[71] = 132;
        sArray2[72] = 132;
        sArray2[73] = 132;
        sArray2[74] = 132;
        sArray2[75] = 132;
        sArray2[76] = 132;
        sArray2[77] = 154;
        sArray2[78] = 154;
        sArray2[79] = 154;
        sArray2[80] = 154;
        sArray2[81] = 154;
        sArray2[82] = 154;
        sArray2[83] = 154;
        sArray2[84] = 154;
        sArray2[85] = 154;
        sArray2[86] = 154;
        sArray2[87] = 154;
        sArray2[88] = 176;
        sArray2[89] = 176;
        sArray2[90] = 176;
        sArray2[91] = 176;
        sArray2[92] = 176;
        sArray2[93] = 176;
        sArray2[94] = 176;
        sArray2[95] = 176;
        sArray2[96] = 176;
        sArray2[97] = 176;
        sArray2[98] = 176;
        sArray2[99] = 198;
        sArray2[100] = 198;
        sArray2[101] = 198;
        sArray2[102] = 198;
        sArray2[103] = 198;
        sArray2[104] = 198;
        sArray2[105] = 198;
        sArray2[106] = 198;
        sArray2[107] = 198;
        sArray2[108] = 198;
        sArray2[109] = 198;
        sArray2[110] = 220;
        sArray2[111] = 220;
        sArray2[112] = 220;
        sArray2[113] = 220;
        sArray2[114] = 220;
        sArray2[115] = 220;
        sArray2[116] = 220;
        sArray2[117] = 220;
        sArray2[118] = 220;
        sArray2[119] = 220;
        sArray2[120] = 220;
        sArray2[121] = 242;
        sArray2[122] = 242;
        sArray2[123] = 242;
        sArray2[124] = 242;
        sArray2[125] = 242;
        sArray2[126] = 242;
        sArray2[127] = 242;
        sArray2[128] = 242;
        sArray2[129] = 242;
        sArray2[130] = 242;
        sArray2[131] = 242;
        sArray2[132] = 264;
        sArray2[133] = 264;
        sArray2[134] = 264;
        sArray2[135] = 264;
        sArray2[136] = 264;
        sArray2[137] = 264;
        sArray2[138] = 264;
        sArray2[139] = 264;
        sArray2[140] = 264;
        sArray2[141] = 264;
        sArray2[142] = 264;
        sArray2[143] = 286;
        this.d = sArray2;
        this.e = new short[]{3, 5, 7, 11, 11, 16, 13, 4, 7, 7, 10, 12, 5, 7, 5, 8, 11, 10, 10, 10, 10, 10, 11, 10, 9, 11, 5, 5, 11, 11, 11, 9, 13, 13, 11, 11, 11, 11, 11, 11, 12, 9, 9, 13, 11, 13, 10, 11, 11, 12, 12, 12, 11, 12, 13, 17, 13, 13, 11, 7, 8, 7, 11, 7, 9, 9, 8, 9, 8, 8, 9, 9, 5, 7, 10, 5, 14, 9, 9, 9, 9, 7, 8, 8, 9, 10, 14, 10, 10, 9, 8, 4, 8, 15, 15, 9, 13, 13, 13, 13, 11, 11, 11, 11, 11, 9, 9, 9, 9, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 9, 9, 9, 9, 9, 8, 8, 8, 8, 8, 7, 7, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 5};
        short[] sArray3 = new short[144];
        sArray3[1] = 22;
        sArray3[2] = 44;
        sArray3[3] = 66;
        sArray3[4] = 88;
        sArray3[5] = 110;
        sArray3[6] = 132;
        sArray3[7] = 154;
        sArray3[8] = 176;
        sArray3[9] = 198;
        sArray3[10] = 220;
        sArray3[12] = 22;
        sArray3[13] = 44;
        sArray3[14] = 66;
        sArray3[15] = 88;
        sArray3[16] = 110;
        sArray3[17] = 132;
        sArray3[18] = 154;
        sArray3[19] = 176;
        sArray3[20] = 198;
        sArray3[21] = 220;
        sArray3[23] = 22;
        sArray3[24] = 44;
        sArray3[25] = 66;
        sArray3[26] = 88;
        sArray3[27] = 110;
        sArray3[28] = 132;
        sArray3[29] = 154;
        sArray3[30] = 176;
        sArray3[31] = 198;
        sArray3[32] = 220;
        sArray3[34] = 22;
        sArray3[35] = 44;
        sArray3[36] = 66;
        sArray3[37] = 88;
        sArray3[38] = 110;
        sArray3[39] = 132;
        sArray3[40] = 154;
        sArray3[41] = 176;
        sArray3[42] = 198;
        sArray3[43] = 220;
        sArray3[45] = 22;
        sArray3[46] = 44;
        sArray3[47] = 66;
        sArray3[48] = 88;
        sArray3[49] = 110;
        sArray3[50] = 132;
        sArray3[51] = 154;
        sArray3[52] = 176;
        sArray3[53] = 198;
        sArray3[54] = 220;
        sArray3[56] = 22;
        sArray3[57] = 44;
        sArray3[58] = 66;
        sArray3[59] = 88;
        sArray3[60] = 110;
        sArray3[61] = 132;
        sArray3[62] = 154;
        sArray3[63] = 176;
        sArray3[64] = 198;
        sArray3[65] = 220;
        sArray3[67] = 22;
        sArray3[68] = 44;
        sArray3[69] = 66;
        sArray3[70] = 88;
        sArray3[71] = 110;
        sArray3[72] = 132;
        sArray3[73] = 154;
        sArray3[74] = 176;
        sArray3[75] = 198;
        sArray3[76] = 220;
        sArray3[78] = 22;
        sArray3[79] = 44;
        sArray3[80] = 66;
        sArray3[81] = 88;
        sArray3[82] = 110;
        sArray3[83] = 132;
        sArray3[84] = 154;
        sArray3[85] = 176;
        sArray3[86] = 198;
        sArray3[87] = 220;
        sArray3[89] = 22;
        sArray3[90] = 44;
        sArray3[91] = 66;
        sArray3[92] = 88;
        sArray3[93] = 110;
        sArray3[94] = 132;
        sArray3[95] = 154;
        sArray3[96] = 176;
        sArray3[97] = 198;
        sArray3[98] = 220;
        sArray3[100] = 22;
        sArray3[101] = 44;
        sArray3[102] = 66;
        sArray3[103] = 88;
        sArray3[104] = 110;
        sArray3[105] = 132;
        sArray3[106] = 154;
        sArray3[107] = 176;
        sArray3[108] = 198;
        sArray3[109] = 220;
        sArray3[111] = 22;
        sArray3[112] = 44;
        sArray3[113] = 66;
        sArray3[114] = 88;
        sArray3[115] = 110;
        sArray3[116] = 132;
        sArray3[117] = 154;
        sArray3[118] = 176;
        sArray3[119] = 198;
        sArray3[120] = 220;
        sArray3[122] = 22;
        sArray3[123] = 44;
        sArray3[124] = 66;
        sArray3[125] = 88;
        sArray3[126] = 110;
        sArray3[127] = 132;
        sArray3[128] = 154;
        sArray3[129] = 176;
        sArray3[130] = 198;
        sArray3[131] = 220;
        sArray3[133] = 22;
        sArray3[134] = 44;
        sArray3[135] = 66;
        sArray3[136] = 88;
        sArray3[137] = 110;
        sArray3[138] = 132;
        sArray3[139] = 154;
        sArray3[140] = 176;
        sArray3[141] = 198;
        sArray3[142] = 220;
        this.f = sArray3;
        short[] sArray4 = new short[144];
        sArray4[11] = 22;
        sArray4[12] = 22;
        sArray4[13] = 22;
        sArray4[14] = 22;
        sArray4[15] = 22;
        sArray4[16] = 22;
        sArray4[17] = 22;
        sArray4[18] = 22;
        sArray4[19] = 22;
        sArray4[20] = 22;
        sArray4[21] = 22;
        sArray4[22] = 44;
        sArray4[23] = 44;
        sArray4[24] = 44;
        sArray4[25] = 44;
        sArray4[26] = 44;
        sArray4[27] = 44;
        sArray4[28] = 44;
        sArray4[29] = 44;
        sArray4[30] = 44;
        sArray4[31] = 44;
        sArray4[32] = 44;
        sArray4[33] = 66;
        sArray4[34] = 66;
        sArray4[35] = 66;
        sArray4[36] = 66;
        sArray4[37] = 66;
        sArray4[38] = 66;
        sArray4[39] = 66;
        sArray4[40] = 66;
        sArray4[41] = 66;
        sArray4[42] = 66;
        sArray4[43] = 66;
        sArray4[44] = 88;
        sArray4[45] = 88;
        sArray4[46] = 88;
        sArray4[47] = 88;
        sArray4[48] = 88;
        sArray4[49] = 88;
        sArray4[50] = 88;
        sArray4[51] = 88;
        sArray4[52] = 88;
        sArray4[53] = 88;
        sArray4[54] = 88;
        sArray4[55] = 110;
        sArray4[56] = 110;
        sArray4[57] = 110;
        sArray4[58] = 110;
        sArray4[59] = 110;
        sArray4[60] = 110;
        sArray4[61] = 110;
        sArray4[62] = 110;
        sArray4[63] = 110;
        sArray4[64] = 110;
        sArray4[65] = 110;
        sArray4[66] = 132;
        sArray4[67] = 132;
        sArray4[68] = 132;
        sArray4[69] = 132;
        sArray4[70] = 132;
        sArray4[71] = 132;
        sArray4[72] = 132;
        sArray4[73] = 132;
        sArray4[74] = 132;
        sArray4[75] = 132;
        sArray4[76] = 132;
        sArray4[77] = 154;
        sArray4[78] = 154;
        sArray4[79] = 154;
        sArray4[80] = 154;
        sArray4[81] = 154;
        sArray4[82] = 154;
        sArray4[83] = 154;
        sArray4[84] = 154;
        sArray4[85] = 154;
        sArray4[86] = 154;
        sArray4[87] = 154;
        sArray4[88] = 176;
        sArray4[89] = 176;
        sArray4[90] = 176;
        sArray4[91] = 176;
        sArray4[92] = 176;
        sArray4[93] = 176;
        sArray4[94] = 176;
        sArray4[95] = 176;
        sArray4[96] = 176;
        sArray4[97] = 176;
        sArray4[98] = 176;
        sArray4[99] = 198;
        sArray4[100] = 198;
        sArray4[101] = 198;
        sArray4[102] = 198;
        sArray4[103] = 198;
        sArray4[104] = 198;
        sArray4[105] = 198;
        sArray4[106] = 198;
        sArray4[107] = 198;
        sArray4[108] = 198;
        sArray4[109] = 198;
        sArray4[110] = 220;
        sArray4[111] = 220;
        sArray4[112] = 220;
        sArray4[113] = 220;
        sArray4[114] = 220;
        sArray4[115] = 220;
        sArray4[116] = 220;
        sArray4[117] = 220;
        sArray4[118] = 220;
        sArray4[119] = 220;
        sArray4[120] = 220;
        sArray4[121] = 242;
        sArray4[122] = 242;
        sArray4[123] = 242;
        sArray4[124] = 242;
        sArray4[125] = 242;
        sArray4[126] = 242;
        sArray4[127] = 242;
        sArray4[128] = 242;
        sArray4[129] = 242;
        sArray4[130] = 242;
        sArray4[131] = 242;
        sArray4[132] = 264;
        sArray4[133] = 264;
        sArray4[134] = 264;
        sArray4[135] = 264;
        sArray4[136] = 264;
        sArray4[137] = 264;
        sArray4[138] = 264;
        sArray4[139] = 264;
        sArray4[140] = 264;
        sArray4[141] = 264;
        sArray4[142] = 264;
        sArray4[143] = 286;
        this.g = sArray4;
        this.h = new short[]{3, 5, 7, 11, 11, 16, 13, 4, 7, 7, 10, 12, 5, 7, 5, 8, 11, 10, 10, 10, 10, 10, 11, 10, 9, 11, 5, 5, 11, 11, 11, 9, 13, 13, 11, 11, 11, 11, 11, 11, 12, 9, 9, 13, 11, 13, 10, 11, 11, 12, 12, 12, 11, 12, 13, 17, 13, 13, 11, 7, 8, 7, 11, 7, 9, 9, 8, 9, 8, 8, 9, 9, 5, 7, 10, 5, 14, 9, 9, 9, 9, 7, 8, 8, 9, 10, 14, 10, 10, 9, 8, 4, 8, 15, 15, 9, 13, 13, 13, 13, 11, 11, 11, 11, 11, 9, 9, 9, 9, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 9, 9, 9, 9, 9, 8, 8, 8, 8, 8, 7, 7, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 5};
        this.i = null;
        this.j = null;
        this.i = new short[69][];
        try {
            this.a = Image.createImage("/7s_Font.png");
            this.b = Image.createImage("/7s_colorFont_black.png");
        }
        catch (Exception exception) {
            System.out.println("ImageFont loading" + exception);
        }
        this.j = graphics;
    }

    public final void a(int n, int n2, int n3) {
        int n4 = 0;
        while (n4 < this.i[n].length) {
            short s = this.i[n][n4];
            try {
                this.j.drawRegion(this.b, this.f[s], this.g[s], this.h[s], 20, 0, n2, n3, 0);
            }
            catch (Exception exception) {
                System.out.println(exception);
            }
            n2 += this.h[s];
            ++n4;
        }
    }

    public final void b(int n, int n2, int n3) {
        int n4 = 0;
        while (n4 < this.i[n].length) {
            short s = this.i[n][n4];
            try {
                this.j.drawRegion(this.b, this.f[s], this.g[s], this.h[s], 20, 0, n2, n3, 0);
            }
            catch (Exception exception) {
                System.out.println(exception);
            }
            if (s == 0 && !this.i(n, n4 + 1, n2 += this.h[s])) {
                n2 = 7;
                n3 += 16;
            }
            ++n4;
        }
    }

    public final void a() {
        InputStream inputStream = null;
        try {
            switch (k.g) {
                case 0: {
                    inputStream = this.getClass().getResourceAsStream("/Languages/7s_En.dat");
                    break;
                }
                case 1: {
                    inputStream = this.getClass().getResourceAsStream("/Languages/7s_Sp.dat");
                    break;
                }
                case 2: {
                    inputStream = this.getClass().getResourceAsStream("/Languages/7s_Fr.dat");
                    break;
                }
                case 3: {
                    inputStream = this.getClass().getResourceAsStream("/Languages/7s_Ge.dat");
                    break;
                }
                case 4: {
                    inputStream = this.getClass().getResourceAsStream("/Languages/7s_It.dat");
                    break;
                }
                case 5: {
                    inputStream = this.getClass().getResourceAsStream("/Languages/7s_De.dat");
                }
            }
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            short[] sArray = new short[500];
            int n = 0;
            while (n < 69) {
                short s;
                int n2 = 0;
                while ((s = dataInputStream.readShort()) != -1) {
                    sArray[n2] = s;
                    ++n2;
                }
                this.i[n] = new short[n2];
                System.arraycopy(sArray, 0, this.i[n], 0, n2);
                ++n;
            }
            dataInputStream.close();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public final int a(short[] sArray, int n) {
        int n2 = 0;
        int n3 = n - 1;
        while (n3 >= 0) {
            n2 += this.e[sArray[n3]] + 1;
            --n3;
        }
        return n2;
    }

    public final void a(short[] sArray, int n, int n2, int n3) {
        int n4 = 0;
        while (n4 < n3) {
            short s = sArray[n4];
            this.j.drawRegion(this.a, this.c[s], this.d[s], this.e[s], 20, 0, n, n2, 0);
            n += this.e[s];
            ++n4;
        }
    }

    public final void b(short[] sArray, int n, int n2, int n3) {
        int n4 = 0;
        while (n4 < n3) {
            short s = sArray[n4];
            this.j.drawRegion(this.b, this.c[s], this.d[s], this.e[s], 20, 0, n, n2, 0);
            n += this.e[s];
            ++n4;
        }
    }

    public final void c(int n, int n2, int n3) {
        int n4 = 0;
        while (n4 < this.i[n].length) {
            short s = this.i[n][n4];
            try {
                this.j.drawRegion(this.a, this.c[s], this.d[s], this.e[s], 20, 0, n2, n3, 0);
            }
            catch (Exception exception) {
                System.out.println(exception);
            }
            n2 += this.e[s];
            ++n4;
        }
    }

    public final void d(int n, int n2, int n3) {
        int n4 = 0;
        while (n4 < this.i[n].length) {
            short s = this.i[n][n4];
            try {
                this.j.drawRegion(this.a, this.c[s], this.d[s], this.e[s], 20, 0, n2, n3, 0);
            }
            catch (Exception exception) {
                System.out.println(exception);
            }
            if (s == 0 && !this.h(n, n4 + 1, n2 += this.e[s])) {
                n2 = 7;
                n3 += 20;
            }
            ++n4;
        }
    }

    private final boolean h(int n, int n2, int n3) {
        int n4 = n2;
        while (n4 < this.i[n].length) {
            if (this.i[n][n4] == 0 || this.i[n][n4] == 300) break;
            n3 += this.e[this.i[n][n4]];
            ++n4;
        }
        return n3 < k.b - 7;
    }

    private final boolean i(int n, int n2, int n3) {
        int n4 = n2;
        while (n4 < this.i[n].length) {
            if (this.i[n][n4] == 0 || this.i[n][n4] == 300) break;
            n3 += this.h[this.i[n][n4]];
            ++n4;
        }
        return n3 < k.b - 7;
    }

    public final int a(int n) {
        int n2 = 0;
        int n3 = this.i[n].length - 1;
        while (n3 >= 0) {
            n2 += this.e[this.i[n][n3]] + 1;
            --n3;
        }
        return n2;
    }

    public final int b(int n) {
        int n2 = 0;
        int n3 = this.i[n].length - 1;
        while (n3 >= 0) {
            n2 += this.h[this.i[n][n3]] + 1;
            --n3;
        }
        return n2;
    }

    public final void e(int n, int n2, int n3) {
        do {
            int n4 = 16 + n % 10;
            n /= 10;
            n2 -= this.e[n4];
            try {
                this.j.drawRegion(this.a, this.c[n4], this.d[n4], this.e[n4], 20, 0, n2, n3, 0);
            }
            catch (Exception exception) {}
        } while (n > 0);
    }

    public final void f(int n, int n2, int n3) {
        do {
            int n4 = 16 + n % 10;
            n /= 10;
            n2 -= this.h[n4];
            try {
                this.j.drawRegion(this.b, this.f[n4], this.g[n4], this.h[n4], 20, 0, n2, n3, 0);
            }
            catch (Exception exception) {}
        } while (n > 0);
    }

    public final void a(byte by, int n, int n2) {
        this.j.drawRegion(this.a, this.c[by], this.d[by], this.e[by], 20, 0, n, n2, 0);
    }

    public final boolean a(int n, int n2, int n3, int n4, int n5, int n6) {
        short s;
        int n7 = 0;
        int n8 = 0;
        int n9 = n6;
        if (n5 > 0) {
            while (n7 < this.i[n].length) {
                s = this.i[n][n7];
                if (s == 300 && --n5 <= 0) {
                    ++n7;
                    break;
                }
                ++n7;
            }
        }
        n8 = n2;
        while (n7 < this.i[n].length) {
            s = this.i[n][n7];
            if (s == 300) {
                n8 = n2;
                if (n4 - 10 < (n3 += 20)) {
                    return false;
                }
            } else if (s == 301) {
                n8 = n9;
            } else {
                this.j.drawRegion(this.a, this.c[s], this.d[s], this.e[s], 20, 0, n8, n3, 0);
                if (s == 0 && !this.h(n, n7 + 1, n8 += this.e[s])) {
                    n8 = n2;
                    if (n4 - 10 < (n3 += 20)) {
                        return false;
                    }
                }
            }
            ++n7;
        }
        return true;
    }

    public final int g(int n, int n2, int n3) {
        int n4 = 0;
        int n5 = 0;
        int n6 = n2;
        while (n5 < this.i[n].length) {
            short s = this.i[n][n5];
            if (s == 0 && !this.h(n, n5 + 1, n6 += this.e[s])) {
                n6 = n2 - 5;
                ++n4;
            }
            ++n5;
        }
        return n4;
    }
}
