/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

final class e
extends InputStream {
    protected InputStream a;
    protected byte[] b;
    protected int c;
    protected boolean d;
    static final int[] e = new int[256];

    e(InputStream inputStream, int[] nArray) throws IOException {
        this.a = inputStream;
        this.b = e.a(new DataInputStream(inputStream), nArray);
        this.d = false;
    }

    public int read() throws IOException {
        int n = this.c < this.b.length ? this.b[this.c] & 0xFF : this.a.read();
        ++this.c;
        return n;
    }

    public void close() throws IOException {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.close();
        super.close();
    }

    static final byte[] a(DataInputStream dataInputStream, int[] nArray) throws IOException {
        int n;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        for (n = 0; n < 8; ++n) {
            dataOutputStream.write(dataInputStream.read());
        }
        n = 0;
        block4: while (n == 0) {
            int n2;
            int n3 = dataInputStream.readInt();
            int n4 = dataInputStream.readInt();
            dataOutputStream.writeInt(n3);
            dataOutputStream.writeInt(n4);
            switch (n4) {
                case 1347179589: {
                    byte[] byArray = new byte[n3 + 4];
                    byArray[0] = (byte)(n4 >> 24 & 0xFF);
                    byArray[1] = (byte)(n4 >> 16 & 0xFF);
                    byArray[2] = (byte)(n4 >> 8 & 0xFF);
                    byArray[3] = (byte)(n4 >> 0 & 0xFF);
                    for (n2 = 0; n2 < n3 / 3; ++n2) {
                        int n5 = nArray[n2];
                        byArray[4 + n2 * 3 + 0] = (byte)(n5 >> 16 & 0xFF);
                        byArray[4 + n2 * 3 + 1] = (byte)(n5 >> 8 & 0xFF);
                        byArray[4 + n2 * 3 + 2] = (byte)(n5 >> 0 & 0xFF);
                    }
                    e.a(dataOutputStream, byArray);
                    dataInputStream.skip(n3 + 4);
                    n = 1;
                    continue block4;
                }
            }
            for (n2 = 0; n2 < n3 + 4; ++n2) {
                dataOutputStream.write(dataInputStream.read());
            }
        }
        dataOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    static final void a(OutputStream outputStream, byte[] byArray) throws IOException {
        outputStream.write(byArray, 4, byArray.length - 4);
        long l = e.a(byArray, byArray.length);
        outputStream.write((byte)(l >> 24 & 0xFFL));
        outputStream.write((byte)(l >> 16 & 0xFFL));
        outputStream.write((byte)(l >> 8 & 0xFFL));
        outputStream.write((byte)(l >> 0 & 0xFFL));
    }

    static final long a(byte[] byArray, int n) {
        int n2 = -1;
        for (int i = 0; i < n; ++i) {
            n2 = e[(n2 ^ byArray[i]) & 0xFF] ^ n2 >>> 8;
        }
        return ~n2;
    }

    static {
        for (int i = 0; i < 256; ++i) {
            int n = i;
            for (int j = 0; j < 8; ++j) {
                if ((n & 1) != 0) {
                    n = 0xEDB88320 ^ n >>> 1;
                    continue;
                }
                n >>>= 1;
            }
            e.e[i] = n;
        }
    }
}
