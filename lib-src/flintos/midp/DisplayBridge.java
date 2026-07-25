package flintos.midp;

/**
 * Native bridge to the board LCD panel.
 */
public final class DisplayBridge {
    /** Initialize the LCD panel (physical dimensions). */
    public static native void init();

    /** Logical panel width in pixels. */
    public static native int width();

    /** Logical panel height in pixels. */
    public static native int height();

    /** Push a full big-endian RGB565 framebuffer to the panel. */
    public static native void present(byte[] fb);

    /** Next typed console byte as a game key, or -1 if none. */
    public static native int readKey();

    private DisplayBridge() {}
}
