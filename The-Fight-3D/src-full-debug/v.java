/*
 * Decompiled with CFR 0.152.
 */
public final class v {
    private p[] a = null;
    private byte b = 0;
    private int c = 0;
    private byte d;
    private int e;
    private int f;

    public v(p[] pArray) {
        this.a = pArray;
    }

    public final void a() {
        if (w.n > 100) {
            w.n = 100;
        }
        this.a[1].a(this.a[0].h[3], this.a[0].h[11]);
        this.a[0].b.a = this.a[1].h[3];
        this.a[0].b.c = this.a[1].h[11];
        this.a[1].b.a = this.a[0].h[3];
        this.a[1].b.c = this.a[0].h[11];
        if (this.a[1].n == 3) {
            if (this.a[1].m != 0) {
                this.f = this.a[1].m;
            }
            if (!this.a[1].d && this.a[1].o > this.a[1].q && this.a[1].j >= this.a[1].l[this.a[1].m][4] && this.a[1].j < this.a[1].l[this.a[1].m][5] && r.a.r != 4 && r.a.E != 6) {
                this.a[1].a((float)(-w.n) * 0.01f);
            } else if (this.a[1].j >= this.a[1].l[this.a[1].m][5] && this.a[1].o > 0) {
                this.a[1].n = (byte)4;
            }
            this.c();
            return;
        }
        if (this.a[1].n == 4) {
            if (this.f == this.a[1].m) {
                return;
            }
            if (this.a[1].o >= this.a[1].q) {
                this.a[1].n = 1;
            } else if (this.a[1].o < this.a[1].q) {
                this.a[1].n = 0;
            }
        }
        if (this.a[1].o <= this.a[1].q && this.a[1].o != 3 && this.a[1].n != 3) {
            this.a[1].n = (byte)5;
        }
        if (this.a[1].n == 0 && this.a[1].m != 0) {
            this.a[1].a(0);
        }
        if (this.a[1].n == 1) {
            if (this.a[1].a > 4.5f) {
                if (this.a[1].m != 1 && this.a[1].m != 4 && this.a[1].m != 5) {
                    this.a[1].a(1);
                }
            } else if (this.a[1].m == 1 && this.a[1].m != 0) {
                this.a[1].a(0);
            }
        }
        if (this.a[1].n == 5 && this.a[1].m != 4 && this.a[1].m != 5 && this.a[1].m != 7) {
            this.a[1].a(7);
        }
        if (this.a[1].n == -1) {
            if (this.a[1].m != 20 && !this.a[1].c) {
                this.a[1].a(20);
                this.a[1].c = true;
            } else if (this.a[0].f != r.a.s) {
                this.a[1].m = 0;
            }
        }
        if (this.a[1].n != -1 && this.a[1].f != r.a.s) {
            if (r.a.r != 4) {
                this.b();
            }
            this.c();
        }
    }

    private void b() {
        switch (this.b) {
            case 0: {
                if (this.a[1].a > 4.5f && this.a[1].n == 1) {
                    if (this.a[1].m == 1 || this.a[1].n == 3 || this.a[1].n == 4) break;
                    this.a[1].a(1);
                    return;
                }
                if (this.a[1].o <= this.a[1].q) break;
                this.b = 1;
                return;
            }
            case 1: {
                this.c += w.n;
                if (this.d >= 3) {
                    this.c = 0;
                    this.d = 0;
                }
                if (this.a[1].m != 0) break;
                if (this.a[1].a <= 4.5f) {
                    if (this.a[1].e > 1 && this.a[0].m >= 14) {
                        int n = k.a.nextInt(3);
                        if (n == 0) {
                            this.a[1].a(2);
                        } else if (n == 1) {
                            this.a[1].a(3);
                        } else if (n == 2) {
                            this.a[1].a(6);
                        }
                        this.a[1].e = 0;
                        return;
                    }
                    if (this.c <= 300 || this.a[0].m == 4 || this.a[0].m == 5 || this.a[1].n != 1) break;
                    if (this.a[0].m != 3 && this.a[0].m != 2) {
                        int n = this.a[0].o <= this.a[0].q ? k.a.nextInt(3) + 14 : k.a.nextInt(5) + 14;
                        this.a[1].a(n);
                    } else {
                        this.a[1].a(13);
                    }
                    this.b = (byte)2;
                    return;
                }
                if (this.a[1].n == 11) {
                    if (this.c <= 50 || this.a[0].m == 4 || this.a[0].m == 5) break;
                    this.a[1].a(21);
                    return;
                }
                this.b = 0;
                return;
            }
            case 2: {
                if (this.a[1].a < 4.5f && this.a[1].f()) {
                    if (this.a[0].m != 4 && this.a[0].m != 5 && this.a[1].m != 8 && this.a[0].o > this.a[0].q) {
                        if (this.a[1].m >= 12 && this.a[1].m != 13 && this.a[1].m <= 19 && (this.a[0].j < this.a[0].l[6][4] || this.a[0].j > this.a[0].l[6][5]) && this.a[0].m != 3 && this.a[0].m != 2) {
                            if (this.a[0].m == 4) break;
                            this.a[0].a(4);
                            this.d = (byte)(this.d + 1);
                            this.a[0].n = 1;
                            this.a[0].p = true;
                            if (r.a.r != 3) {
                                this.a[0].o -= 5;
                            } else if (r.a.r == 3) {
                                this.a[0].o -= 4;
                            }
                            MainMIDlet.b();
                            return;
                        }
                        if (this.a[1].m != 13 || this.a[0].o <= this.a[0].q || this.a[0].m == 5) break;
                        this.a[0].a(5);
                        if (r.a.r != 3) {
                            this.a[0].o -= 5;
                        } else if (r.a.r == 3) {
                            this.a[0].o -= 4;
                        }
                        MainMIDlet.b();
                        this.d = (byte)(this.d + 1);
                        this.a[0].n = 1;
                        this.a[0].p = true;
                        this.a[0].g = true;
                        r.a.o.d = 0;
                        return;
                    }
                    if (this.a[0].o > this.a[0].q || this.a[0].m == 8 || this.a[0].m == 4 || this.a[0].m == 5 || this.a[0].m == 6 || this.a[0].m == 3 || this.a[0].m == 2 || this.a[0].m != 7) break;
                    this.a[0].a(8);
                    this.a[0].p = true;
                    this.a[0].n = 1;
                    this.a[0].o -= this.a[0].q;
                    r.a.E = 1;
                    r.a.l = true;
                    ++this.a[0].f;
                    return;
                }
                if (this.a[1].m == 0) {
                    this.e += w.n;
                    if (this.e > 60 && this.a[0].o > this.a[0].q) {
                        this.e = 0;
                        this.b = 0;
                        return;
                    }
                    if (this.e <= 1800) break;
                    this.e = 0;
                    this.b = 0;
                    return;
                }
                if (!(this.a[1].a <= 4.5f) || this.a[1].m == 0 && this.a[1].m == 1 || this.a[1].m == 2 || this.a[1].m == 4 || this.a[1].m == 5 || this.a[1].m == 6 || this.a[1].m == 7 || this.a[1].m == 8 || this.a[1].m == 11 || this.a[1].m == 12 || this.a[1].m == 13 || this.a[1].m == 14 || this.a[1].m == 15 || this.a[1].m == 16 || this.a[1].m == 17 || this.a[1].m == 18 || this.a[1].m == 19) break;
                this.a[1].a(0);
            }
        }
    }

    private void c() {
        if (this.a[1].m != 4 && this.a[1].m != 5 && this.a[1].m != 8 && this.a[1].m != 3 && this.a[1].m != 2 && this.a[1].m != 6 && this.a[0].f() && this.a[1].o > 0) {
            if (this.a[1].o <= this.a[1].q && this.a[1].m != 8 && r.a.r != 4) {
                this.a[1].a(8);
                this.a[1].p = true;
                this.a[1].o -= this.a[1].q;
                r.a.E = 1;
                r.a.l = true;
                ++this.a[1].f;
                r.a.C = true;
            } else if (this.a[0].m >= 14 && this.a[0].m <= 19) {
                if (this.a[1].m != 4) {
                    this.a[1].a(4);
                    this.a[1].e = (byte)(this.a[1].e + 1);
                    this.a[1].p = true;
                    if (r.a.r != 3) {
                        this.a[1].o -= 5;
                    } else if (r.a.r == 3) {
                        this.a[1].o -= 3;
                    }
                    r.a.C = true;
                }
            } else if ((this.a[0].m == 12 || this.a[0].m == 13) && this.a[1].m != 5) {
                this.a[1].a(5);
                this.a[1].e = (byte)(this.a[1].e + 1);
                this.a[1].p = true;
                if (r.a.r != 3) {
                    this.a[1].o -= 5;
                } else if (r.a.r == 3) {
                    this.a[1].o -= 3;
                }
                r.a.C = true;
                this.a[1].g = true;
                r.a.o.d = 0;
            }
            this.a[1].n = (byte)3;
        }
    }
}
