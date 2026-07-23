/*
 * Decompiled with CFR 0.152.
 */
package com.nokia.mid.ui;

import com.nokia.mid.ui.DirectGraphics;
import com.nokia.mid.ui.DirectGraphicsImplemented;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class DirectUtils {
    public static Image src;

    public static DirectGraphics getDirectGraphics(Graphics graphics) {
        return new DirectGraphicsImplemented(graphics);
    }

    public static Image createImage(byte[] byArray, int n, int n2) {
        System.out.println("CreateImage");
        src = Image.createImage(byArray, n, n2);
        Image image = Image.createImage(src.getWidth(), src.getHeight());
        Graphics graphics = image.getGraphics();
        graphics.drawImage(src, 0, 0, 20);
        return image;
    }

    public static Image createImage(int n, int n2, int n3) {
        System.out.println("CreateARGBImage");
        Image image = Image.createImage(n, n2);
        Graphics graphics = image.getGraphics();
        int n4 = graphics.getColor();
        graphics.setColor(n3);
        graphics.fillRect(0, 0, n - 1, n2 - 1);
        graphics.setColor(n4);
        return image;
    }
}
