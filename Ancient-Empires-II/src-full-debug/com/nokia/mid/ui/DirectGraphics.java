/*
 * Decompiled with CFR 0.152.
 */
package com.nokia.mid.ui;

import javax.microedition.lcdui.Image;

public interface DirectGraphics {
    public void setARGBColor(int var1);

    public void drawTriangle(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

    public void fillTriangle(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

    public void drawPolygon(int[] var1, int var2, int[] var3, int var4, int var5, int var6);

    public void fillPolygon(int[] var1, int var2, int[] var3, int var4, int var5, int var6);

    public int getNativePixelFormat();

    public int getAlphaComponent();

    public void drawImage(Image var1, int var2, int var3, int var4, int var5);

    public void drawPixels(int[] var1, boolean var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

    public void drawPixels(byte[] var1, byte[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

    public void drawPixels(short[] var1, boolean var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

    public void getPixels(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

    public void getPixels(byte[] var1, byte[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9);

    public void getPixels(short[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);
}
