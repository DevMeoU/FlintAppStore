package javax.microedition.lcdui;

import flintos.midp.DisplayBridge;

/* MIDP Display + the synchronous paint pump. */
public class Display {
    private static Display instance;
    private static int sw, sh;
    private static byte[] screenBuf;
    private static Graphics screenGfx;
    private Displayable current;

    private Display() {}

    /** Bring up LCD and screen framebuffer. */
    public static synchronized void initScreen() {
        if(screenBuf != null) return;
        DisplayBridge.init();
        String pw = System.getProperty("flint.lcdui.width");
        String ph = System.getProperty("flint.lcdui.height");
        sw = pw != null ? Integer.parseInt(pw) : DisplayBridge.width();
        sh = ph != null ? Integer.parseInt(ph) : DisplayBridge.height();
        screenBuf = new byte[sw * sh * 2];
        flint.drawing.Graphics fg = flint.drawing.Graphics.create(sw, sh, screenBuf);
        screenGfx = new Graphics(fg, sw, sh);
        if(instance == null) instance = new Display();
    }

    public static Display getDisplay(javax.microedition.midlet.MIDlet m) {
        if(instance == null) instance = new Display();
        return instance;
    }

    public void setCurrent(Displayable d) {
        current = d;
        if(d instanceof Canvas) {
            ((Canvas) d).showNotify();
            requestPaint((Canvas) d);
        }
    }
    public void setCurrent(Alert alert, Displayable next) { setCurrent(next); }
    public Displayable getCurrent() { return current; }

    public boolean isColor() { return true; }
    public int numColors() { return 65536; }
    public int numAlphaLevels() { return 1; }
    public void callSerially(Runnable r) { if(r != null) r.run(); }
    public boolean flashBacklight(int ms) { return false; }
    public boolean vibrate(int ms) { return false; }

    public static Graphics gameGraphics() { return screenGfx; }
    public static void flush() {
        if(screenBuf == null) return;
        DisplayBridge.present(screenBuf);
    }

    static int screenWidth()  { return sw; }
    static int screenHeight() { return sh; }
    static Displayable currentShown() { return instance == null ? null : instance.current; }

    static synchronized void requestPaint(Canvas c) {
        if(screenGfx == null || c == null) return;
        screenGfx.reset();
        c.paint(screenGfx);
        DisplayBridge.present(screenBuf);
    }
}
