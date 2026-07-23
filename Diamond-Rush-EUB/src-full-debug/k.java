/*
 * Decompiled with CFR 0.152.
 */
public final class k
extends Thread {
    private final String a;

    public k(String string) {
        this.a = string;
    }

    public final void run() {
        boolean bl;
        try {
            bl = i.a.getAppProperty("APP-RUNNING-ON-PLATFORMREQUEST").trim().equals("0");
        }
        catch (Exception exception) {
            bl = false;
        }
        try {
            if (bl) {
                GloftDIRU.a = this.a;
                i.b = (byte)3;
                return;
            }
            i.a.platformRequest(this.a);
            return;
        }
        catch (Exception exception) {
            GloftDIRU.a = this.a;
            return;
        }
    }
}
