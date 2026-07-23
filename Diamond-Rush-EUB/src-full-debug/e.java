/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public final class e {
    private static Random a = new Random(System.currentTimeMillis());

    public static int a(int n, int n2) {
        return n + Math.abs(a.nextInt()) % (n2 - n);
    }
}
