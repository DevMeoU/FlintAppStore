/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

public final class y
implements PlayerListener {
    public String a = "No Exception";
    private String[] f = new String[]{"Punch.amr", "Kick.amr"};
    private String[] g = new String[]{"MenuBg.mid", "GameBg.mid"};
    private Player[] h = new Player[2];
    private Player i = null;
    public Player b = null;
    private VolumeControl j;
    private VolumeControl k = null;
    public static int c = 0;
    public static int d = 1;
    public static boolean e = false;

    public final void playerUpdate(Player player, String string, Object object) {
        if (string.equals("started")) {
            try {
                this.a = "STARTED";
                return;
            }
            catch (Exception exception) {
                this.a = exception.toString();
                exception.printStackTrace();
                return;
            }
        }
        if (string.equals("endOfMedia")) {
            try {
                this.a = "End of Media";
                return;
            }
            catch (Exception exception) {
                this.a = exception.toString();
                exception.printStackTrace();
                return;
            }
        }
        if (string.equals("closed")) {
            try {
                this.a = "Closed";
                player = Manager.createPlayer(new ByteArrayInputStream(this.a(this.g[1])), "audio/MIDI");
                player.realize();
                player.prefetch();
                player.setLoopCount(-1);
                return;
            }
            catch (Exception exception) {
                this.a = exception.toString();
                exception.printStackTrace();
                return;
            }
        }
        if (string.equals("error")) {
            try {
                this.a = "Error";
                player.realize();
                player.prefetch();
                return;
            }
            catch (Exception exception) {
                this.a = exception.toString();
                exception.printStackTrace();
                return;
            }
        }
        if (string.equals("deviceUnavailable")) {
            try {
                this.a = "Device Unavailable";
                return;
            }
            catch (Exception exception) {
                this.a = exception.toString();
                exception.printStackTrace();
                return;
            }
        }
        if (string.equals("deviceAvailable")) {
            try {
                this.a = "Device Available";
                return;
            }
            catch (Exception exception) {
                this.a = exception.toString();
                exception.printStackTrace();
                return;
            }
        }
        if (string.equals("durationUpdated")) {
            try {
                this.a = "DURATION UPDATED";
                return;
            }
            catch (Exception exception) {
                this.a = exception.toString();
                exception.printStackTrace();
                return;
            }
        }
        if (string.equals("stopped")) {
            try {
                this.a = "STOPPED";
                return;
            }
            catch (Exception exception) {
                this.a = exception.toString();
                exception.printStackTrace();
                return;
            }
        }
        if (string.equals("volumeChanged")) {
            try {
                this.a = "VOLUME CHANGED";
                return;
            }
            catch (Exception exception) {
                this.a = exception.toString();
                exception.printStackTrace();
            }
        }
    }

    public final void a(int n) {
        if (n == 0) {
            try {
                this.i = Manager.createPlayer(new ByteArrayInputStream(this.a(this.g[0])), "audio/MIDI");
                this.i.realize();
                this.i.prefetch();
                this.i.setLoopCount(-1);
                this.h[0] = Manager.createPlayer(new ByteArrayInputStream(this.a(this.f[1])), "audio/amr");
                this.h[0].realize();
                this.h[0].prefetch();
            }
            catch (Exception exception) {}
        }
        if (n == 1) {
            try {
                this.i = Manager.createPlayer(new ByteArrayInputStream(this.a(this.g[0])), "audio/MIDI");
                this.i.addPlayerListener(this);
                this.i.realize();
                this.i.prefetch();
                this.i.setLoopCount(-1);
            }
            catch (Exception exception) {
                Exception exception2 = exception;
                exception.printStackTrace();
            }
        }
        if (n == 2) {
            try {
                this.i = Manager.createPlayer(new ByteArrayInputStream(this.a(this.g[1])), "audio/MIDI");
                this.i.realize();
                this.i.prefetch();
                this.i.setLoopCount(-1);
                this.h[0] = Manager.createPlayer(new ByteArrayInputStream(this.a(this.f[0])), "audio/amr");
                this.h[0].realize();
                this.h[0].prefetch();
                this.h[1] = Manager.createPlayer(new ByteArrayInputStream(this.a(this.f[1])), "audio/amr");
                this.h[1].realize();
                this.h[1].prefetch();
            }
            catch (Exception exception) {
                System.out.println("Problem in create Players method");
                exception.printStackTrace();
            }
        }
        try {
            this.j = (VolumeControl)this.i.getControl("VolumeControl");
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private byte[] a(String string) {
        try {
            int n;
            DataInputStream dataInputStream = new DataInputStream(this.getClass().getResourceAsStream("/Sounds/" + string));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while ((n = dataInputStream.read()) != -1) {
                byteArrayOutputStream.write(n);
            }
            dataInputStream.close();
            return byteArrayOutputStream.toByteArray();
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return null;
        }
    }

    public final void a() {
        try {
            if (this.i != null) {
                this.i.stop();
                this.i.deallocate();
                this.i.close();
            }
            int n = 0;
            while (n < this.h.length) {
                if (this.h[n] != null) {
                    this.h[n].stop();
                    this.h[n].deallocate();
                    this.h[n].close();
                }
                ++n;
            }
            if (this.b != null) {
                this.b.stop();
                this.b.deallocate();
                this.b.close();
                return;
            }
        }
        catch (Exception exception) {}
    }

    public final void b() {
        try {
            if (d == 2) {
                this.i.stop();
                return;
            }
        }
        catch (Exception exception) {}
    }

    public final void c() {
        try {
            if (this.i != null) {
                this.i.stop();
            }
            if (this.b != null) {
                this.b.stop();
                return;
            }
        }
        catch (Exception exception) {}
    }

    public final void d() {
        try {
            if (this.j != null) {
                this.j.setLevel(c);
            }
            this.i.start();
            return;
        }
        catch (Exception exception) {
            this.a = exception.toString();
            exception.printStackTrace();
            return;
        }
    }

    public final void b(int n) {
        try {
            this.b = this.h[n];
            if (this.b != null) {
                this.k = (VolumeControl)this.b.getControl("VolumeControl");
                this.k.setLevel(c);
                this.b.start();
                return;
            }
        }
        catch (Exception exception) {
            this.a = exception.toString();
            exception.printStackTrace();
        }
    }
}
