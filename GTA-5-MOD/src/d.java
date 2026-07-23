/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

final class d {
    Image a;
    String b;

    private d(Image image) {
        this.a = image;
    }

    static final d a(String string) throws IOException {
        Image image = Image.createImage(string);
        if (null == image) {
            return null;
        }
        d d2 = new d(image);
        d2.b = string;
        return d2;
    }

    static final d a(InputStream inputStream) throws IOException {
        Image image = Image.createImage(inputStream);
        if (null == image) {
            return null;
        }
        return new d(image);
    }

    final d a(int[] nArray) {
        try {
            e e2 = new e(this.getClass().getResourceAsStream(this.b), nArray);
            d d2 = d.a(e2);
            d2.b = this.b;
            ((InputStream)e2).close();
            return d2;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    final int a() {
        return this.a.getHeight();
    }
}
