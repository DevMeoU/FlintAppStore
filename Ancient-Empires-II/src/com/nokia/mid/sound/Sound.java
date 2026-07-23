/*
 * Decompiled with CFR 0.152.
 */
package com.nokia.mid.sound;

import com.nokia.mid.sound.SoundListener;

public class Sound {
    public Sound(byte[] byArray, int n) {
    }

    public Sound(int n, long l) {
    }

    public void init(int n, long l) {
    }

    public void init(byte[] byArray, int n) {
    }

    public int getState() {
        return 0;
    }

    public void play(int n) {
    }

    public void stop() {
    }

    public void resume() {
    }

    public void release() {
    }

    public void setGain(int n) {
    }

    public int getGain() {
        return 128;
    }

    public static int getConcurrentSoundCount(int n) {
        return 1;
    }

    public static int[] getSupportedFormats() {
        int[] nArray = new int[]{1};
        return nArray;
    }

    public void setSoundListener(SoundListener soundListener) {
    }
}

