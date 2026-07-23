/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package com.nokia.mid.ui;

import com.nokia.mid.ui.DirectGraphics;
import com.nokia.mid.ui.DirectUtils;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class DirectGraphicsImplemented
implements DirectGraphics {
    private Graphics my_g = null;

    protected DirectGraphicsImplemented(Graphics graphics) {
        this.my_g = graphics;
        graphics.setStrokeStyle(0);
    }

    public void setARGBColor(int n) {
        this.my_g.setColor(n);
    }

    public void drawTriangle(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        this.my_g.setColor(n7);
        this.my_g.drawLine(n, n2, n3, n4);
        this.my_g.drawLine(n3, n4, n5, n6);
        this.my_g.drawLine(n5, n6, n, n2);
    }

    public void fillTriangle(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        this.my_g.setColor(n7);
        this.my_g.fillTriangle(n, n2, n3, n4, n5, n6);
    }

    public void drawPolygon(int[] nArray, int n, int[] nArray2, int n2, int n3, int n4) {
        this.my_g.setColor(n4);
        for (int j = 0; j < n3 - 1; ++j) {
            this.my_g.drawLine(nArray[n + j], nArray2[n2 + j], nArray[n + j + 1], nArray2[n2 + j + 1]);
        }
    }

    public void fillPolygon(int[] nArray, int n, int[] nArray2, int n2, int n3, int n4) {
        this.drawPolygon(nArray, n, nArray2, n2, n3, n4);
    }

    public int getNativePixelFormat() {
        return 4444;
    }

    public int getAlphaComponent() {
        return 0;
    }

    public void drawImage(Image image, int n, int n2, int n3, int n4) {
        if (n4 == 0) {
            this.my_g.drawImage(image, n, n2, n3);
        } else {
            int n5 = 0;
            switch (n4) {
                case 0: 
                case 24756: {
                    n5 = 0;
                    break;
                }
                case 8192: 
                case 16564: {
                    n5 = 2;
                    break;
                }
                case 8372: 
                case 16384: {
                    n5 = 1;
                    break;
                }
                case 180: 
                case 24576: {
                    n5 = 3;
                    break;
                }
                case 8462: 
                case 16474: {
                    n5 = 4;
                    break;
                }
                case 90: 
                case 24846: {
                    n5 = 6;
                    break;
                }
                case 270: 
                case 24666: {
                    n5 = 5;
                    break;
                }
                case 8282: 
                case 16654: {
                    n5 = 7;
                }
            }
            this.my_g.drawRegion(image, 0, 0, image.getWidth(), image.getHeight(), n5, n, n2, n3);
        }
    }

    public void drawPixels(int[] nArray, boolean bl, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
    }

    public void drawPixels(short[] sArray, boolean bl, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
    }

    public void drawPixels(byte[] byArray, byte[] byArray2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
    }

    public void getPixels(int[] nArray, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    public void getPixels(byte[] byArray, byte[] byArray2, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    public void getPixels(short[] sArray, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (DirectUtils.src == null) {
            return;
        }
        if (n7 == 4444 || n7 == 444) {
            int[] nArray = new int[n2 * n6 + n];
            DirectUtils.src.getRGB(nArray, n, n2, n3, n4, n5, n6);
            for (int j = 0; j < n2 * n6 + n; ++j) {
                int n8 = nArray[j];
                int n9 = n8 >> 4 & 0xF;
                n9 |= n8 >> 8 & 0xF0;
                n9 |= n8 >> 12 & 0xF00;
                sArray[j] = (short)(n9 |= n8 >> 16 & 0xF000);
            }
        }
    }
}

