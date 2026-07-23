/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.game.GameCanvas
 */
package com.alcatelonetouchx;

import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.game.GameCanvas;

public abstract class CanvasPlus
extends GameCanvas {
    boolean setFullScreen;
    boolean autoScreenSize;
    boolean noKeyCodeConv;
    int screenW;
    int screenH;
    int[] codes;
    int[] mapfrom;
    int[] mapto;

    protected CanvasPlus() {
        super(false);
        this.CanvasPlusInit();
    }

    protected CanvasPlus(boolean bl) {
        super(bl);
        this.CanvasPlusInit();
    }

    private void CanvasPlusInit() {
        this.setFullScreen = true;
        this.autoScreenSize = false;
        this.noKeyCodeConv = false;
        this.screenW = 240;
        this.screenH = 294;
        this.codes = new int[]{0, 50, 52, 0, 0, 54, 56, 0, 53, 49, 51, 55, 57};
        this.mapfrom = new int[]{-22, -21, -20, -5, -2, -6, -1, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 42, 35, 0, 0, 0, 0, 0, 0};
        this.mapto = new int[]{-7, -6, -5, -4, -3, -2, -1, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 42, 35, 0, 0, 0, 0, 0, 0};
        this.setFullScreenMode(this.setFullScreen);
        for (int j = 0; j < 13; ++j) {
            if (j == 0 || j == 3 || j == 4 || j == 7) continue;
            this.codes[j] = this.keyCodeConvert(super.getKeyCode(j));
        }
        System.out.println("CanvasPlus! " + this.setFullScreen);
    }

    public static Font getFont(int n) {
        return Font.getFont((int)n);
    }

    public static Font getFont(int n, int n2, int n3) {
        int n4 = 255;
        int n5 = 255;
        switch (n3) {
            case 0: {
                n3 = 0;
                break;
            }
            case 8: {
                n3 = 8;
                break;
            }
            case 16: {
                n3 = 16;
            }
        }
        return Font.getFont((int)(n & n5), (int)(n2 & n4), (int)n3);
    }

    private int keyCodeConvert(int n) {
        if (this.noKeyCodeConv) {
            return n;
        }
        for (int j = 0; j < 25; ++j) {
            if (this.mapfrom[j] != n) continue;
            return this.mapto[j];
        }
        return n;
    }

    protected void keyPressed(int n) {
        this.keyPressee(this.keyCodeConvert(n));
    }

    protected void keyReleased(int n) {
        this.keyReleasee(this.keyCodeConvert(n));
    }

    protected void keyRepeated(int n) {
        this.keyRepeatee(this.keyCodeConvert(n));
    }

    protected void keyPressee(int n) {
    }

    protected void keyReleasee(int n) {
    }

    protected void keyRepeatee(int n) {
    }

    public int getGameAction(int n) {
        if (this.noKeyCodeConv) {
            return super.getGameAction(n);
        }
        boolean bl = false;
        for (int j = 0; j < 25; ++j) {
            if (this.mapto[j] != n) continue;
            bl = true;
            int n2 = super.getGameAction(this.mapfrom[j]);
            if (n2 == 0) continue;
            return n2;
        }
        return bl ? 0 : super.getGameAction(n);
    }

    public int getKeyCode(int n) {
        if (this.noKeyCodeConv) {
            return super.getKeyCode(n);
        }
        return this.codes[n] != 0 ? this.codes[n] : super.getKeyCode(n);
    }

    public String getKeyName(int n) {
        if (this.noKeyCodeConv) {
            return super.getKeyName(n);
        }
        for (int j = 0; j < 25; ++j) {
            if (this.mapto[j] != n) continue;
            return super.getKeyName(this.mapfrom[j]);
        }
        return super.getKeyName(n);
    }

    public int getWidth() {
        return this.screenW;
    }

    public int getHeight() {
        return this.screenH;
    }

    protected void sizeChanged(int n, int n2) {
        if (this.autoScreenSize) {
            this.screenH = n2;
            this.screenW = n;
        }
        this.setFullScreenMode(this.setFullScreen);
        System.out.println("Res. " + this.screenW + "x" + this.screenH);
    }
}

