/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class j
implements Runnable,
PlayerListener {
    private static int a = -1;
    private static int b = -1;
    private static int c;
    private static int d;
    private static int e;
    private long a;
    private static Player[] a;
    public static boolean a;
    private static boolean b;
    private static boolean c;
    private ByteArrayInputStream a;
    private InputStream a;
    private byte[] a;
    private Thread a = 0L;

    public final void a(int n) {
        if (a == null) {
            a = new Player[21];
        }
        try {
            byte[] byArray = new byte[i.a(this.a, (n << 3) + 4)];
            this.a.read(byArray);
            this.a = new ByteArrayInputStream(byArray);
            j.a[n] = Manager.createPlayer(this.a, "audio/midi");
            a[n].addPlayerListener(this);
            a[n].realize();
            ((VolumeControl)a[n].getControl("VolumeControl")).setLevel(100);
            this.a.close();
            this.a = null;
            System.gc();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void a() {
        b = false;
        this.a = new Thread(this);
        this.a.setPriority(1);
        this.a.start();
    }

    public final void b() {
        if (a == null) {
            try {
                this.a = this.getClass().getResourceAsStream("/snd.f");
                this.a.skip(1L);
                this.a = new byte[168];
                this.a.read(this.a);
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public final void c() {
        try {
            a = -1;
            e = -1;
            c = 0;
            this.a.close();
            this.a = null;
            this.a = null;
            System.gc();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void d() {
        if (a != null) {
            this.e();
            int n = a.length;
            for (int k = 0; k < n; ++k) {
                if (a[k] == null) continue;
                a[k].close();
                j.a[k] = null;
            }
        }
        a = null;
        b = true;
    }

    private static int a(int n) {
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

    public final synchronized void run() {
        while (!b) {
            try {
                this.wait();
            }
            catch (Exception exception) {}
            if (c) {
                try {
                    boolean bl;
                    int n = a;
                    switch (n) {
                        case 0: 
                        case 5: 
                        case 6: 
                        case 7: 
                        case 8: 
                        case 10: 
                        case 11: 
                        case 12: 
                        case 13: 
                        case 14: {
                            bl = false;
                            break;
                        }
                        default: {
                            bl = true;
                        }
                    }
                    if (bl) {
                        a[a].deallocate();
                        e = -1;
                    }
                    a = -1;
                    c = false;
                }
                catch (Exception exception) {
                }
                finally {
                    c = 0;
                }
            }
            if (b == -1) continue;
            try {
                if (e != -1 && b != e) {
                    a[e].deallocate();
                    e = -1;
                }
                if (e == -1) {
                    a[b].prefetch();
                    e = b;
                }
                a[b].start();
                a = b;
                c = d;
                this.a = System.currentTimeMillis();
            }
            catch (Exception exception) {
            }
            finally {
                b = -1;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final synchronized void b(int n) {
        if (!a) return;
        if (a != -1) {
            if (c >= j.a(n) && (c != j.a(n) || Math.abs(System.currentTimeMillis() - this.a) <= 50L)) return;
            c = true;
        } else {
            c = 0;
        }
        int n2 = j.a(n);
        if (n2 < c) return;
        b = n;
        d = n2;
        this.notify();
    }

    public final synchronized void e() {
        if (a != -1) {
            c = true;
        }
        this.notify();
    }

    public static synchronized boolean a() {
        return a != -1;
    }

    public final void playerUpdate(Player player, String string, Object object) {
        if (a != null && a != -1 && string.equals("endOfMedia")) {
            this.e();
        }
    }

    static {
        e = -1;
        c = false;
    }
}
