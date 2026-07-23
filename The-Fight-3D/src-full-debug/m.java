/*
 * Decompiled with CFR 0.152.
 */
public final class m {
    private static final float[] a = new float[1030];

    static {
        int n = a.length;
        while (n-- > 0) {
            float f = 0.0f;
            float f2 = 90.0f;
            float f3 = 0.0f;
            while ((double)(f2 - f) > 0.01) {
                float f4;
                f3 = (f2 + f) / 2.0f;
                if ((float)Math.sin(Math.toRadians(f4)) > (float)n / 1024.0f) {
                    f2 = f3;
                    continue;
                }
                f = f3;
            }
            m.a[n] = f3;
        }
    }

    public static float a(float f, float f2) {
        if (f < 0.0f) {
            if (f < -1.0f) {
                f = -1.0f;
            }
            if (f2 > 0.0f) {
                return -a[(int)(-f * 1024.0f)];
            }
            return a[(int)(-f * 1024.0f)] - 180.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 > 0.0f) {
            return a[(int)(f * 1024.0f)];
        }
        return 180.0f - a[(int)(f * 1024.0f)];
    }
}
