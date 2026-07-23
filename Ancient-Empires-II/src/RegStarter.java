import javax.microedition.midlet.MIDlet;

/* Override of the game's RegStarter: the Gameloft registration/security probe is flaky
 * on this runtime (RMS/security/country parsing) and unnecessary to run the game. We
 * replace its start() with a no-op so GloftDIRU.<init> skips straight to creating the
 * game (`new j(this)`). The original game logic in `j` is untouched. */
public class RegStarter {
    public static void start(MIDlet midlet) {
    }
}
