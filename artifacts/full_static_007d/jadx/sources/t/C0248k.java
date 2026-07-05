package t;

import java.util.ArrayList;
import s.C0234a;
import s.C0236c;
import s.C0237d;

/* renamed from: t.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0248k extends o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f2384k = new int[2];

    public static void m(int[] iArr, int i2, int i3, int i4, int i5, float f2, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 != -1) {
            if (i6 == 0) {
                iArr[0] = (int) ((i8 * f2) + 0.5f);
                iArr[1] = i8;
                return;
            } else {
                if (i6 != 1) {
                    return;
                }
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f2) + 0.5f);
                return;
            }
        }
        int i9 = (int) ((i8 * f2) + 0.5f);
        int i10 = (int) ((i7 / f2) + 0.5f);
        if (i9 <= i7) {
            iArr[0] = i9;
            iArr[1] = i8;
        } else if (i10 <= i8) {
            iArr[0] = i7;
            iArr[1] = i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0267  */
    @Override // t.InterfaceC0241d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0241d interfaceC0241d) {
        float f2;
        float f3;
        float f4;
        int i2;
        if (q.f.a(this.f2403j) == 3) {
            C0237d c0237d = this.f2396b;
            l(c0237d.f2270H, c0237d.f2272J, 0);
            return;
        }
        C0244g c0244g = this.f2399e;
        boolean z2 = c0244g.f2379j;
        C0243f c0243f = this.h;
        C0243f c0243f2 = this.f2402i;
        if (!z2 && this.f2398d == 3) {
            C0237d c0237d2 = this.f2396b;
            int i3 = c0237d2.f2318r;
            if (i3 == 2) {
                C0237d c0237d3 = c0237d2.f2281S;
                if (c0237d3 != null) {
                    if (c0237d3.f2295d.f2399e.f2379j) {
                        c0244g.d((int) ((r3.f2377g * c0237d2.f2323w) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = c0237d2.f2319s;
                if (i4 == 0 || i4 == 3) {
                    m mVar = c0237d2.f2297e;
                    C0243f c0243f3 = mVar.h;
                    C0243f c0243f4 = mVar.f2402i;
                    boolean z3 = c0237d2.f2270H.f2260f != null;
                    boolean z4 = c0237d2.f2271I.f2260f != null;
                    boolean z5 = c0237d2.f2272J.f2260f != null;
                    boolean z6 = c0237d2.f2273K.f2260f != null;
                    int i5 = c0237d2.f2285W;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = c0237d2.f2284V;
                        boolean z7 = c0243f3.f2379j;
                        int[] iArr = f2384k;
                        if (z7 && c0243f4.f2379j) {
                            if (c0243f.f2373c && c0243f2.f2373c) {
                                m(iArr, ((C0243f) c0243f.f2381l.get(0)).f2377g + c0243f.f2376f, ((C0243f) c0243f2.f2381l.get(0)).f2377g - c0243f2.f2376f, c0243f3.f2377g + c0243f3.f2376f, c0243f4.f2377g - c0243f4.f2376f, f5, i5);
                                c0244g.d(iArr[0]);
                                this.f2396b.f2297e.f2399e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z8 = c0243f.f2379j;
                        ArrayList arrayList = c0243f3.f2381l;
                        if (z8 && c0243f2.f2379j) {
                            if (!c0243f3.f2373c || !c0243f4.f2373c) {
                                return;
                            }
                            m(iArr, c0243f.f2377g + c0243f.f2376f, c0243f2.f2377g - c0243f2.f2376f, ((C0243f) arrayList.get(0)).f2377g + c0243f3.f2376f, ((C0243f) c0243f4.f2381l.get(0)).f2377g - c0243f4.f2376f, f5, i5);
                            c0244g.d(iArr[0]);
                            this.f2396b.f2297e.f2399e.d(iArr[1]);
                        }
                        if (!c0243f.f2373c || !c0243f2.f2373c || !c0243f3.f2373c || !c0243f4.f2373c) {
                            return;
                        }
                        m(iArr, ((C0243f) c0243f.f2381l.get(0)).f2377g + c0243f.f2376f, ((C0243f) c0243f2.f2381l.get(0)).f2377g - c0243f2.f2376f, ((C0243f) arrayList.get(0)).f2377g + c0243f3.f2376f, ((C0243f) c0243f4.f2381l.get(0)).f2377g - c0243f4.f2376f, f5, i5);
                        c0244g.d(iArr[0]);
                        this.f2396b.f2297e.f2399e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!c0243f.f2373c || !c0243f2.f2373c) {
                            return;
                        }
                        float f6 = c0237d2.f2284V;
                        int i6 = ((C0243f) c0243f.f2381l.get(0)).f2377g + c0243f.f2376f;
                        int i7 = ((C0243f) c0243f2.f2381l.get(0)).f2377g - c0243f2.f2376f;
                        if (i5 == -1 || i5 == 0) {
                            int iG = g(i7 - i6, 0);
                            int i8 = (int) ((iG * f6) + 0.5f);
                            int iG2 = g(i8, 1);
                            if (i8 != iG2) {
                                iG = (int) ((iG2 / f6) + 0.5f);
                            }
                            c0244g.d(iG);
                            this.f2396b.f2297e.f2399e.d(iG2);
                        } else if (i5 == 1) {
                            int iG3 = g(i7 - i6, 0);
                            int i9 = (int) ((iG3 / f6) + 0.5f);
                            int iG4 = g(i9, 1);
                            if (i9 != iG4) {
                                iG3 = (int) ((iG4 * f6) + 0.5f);
                            }
                            c0244g.d(iG3);
                            this.f2396b.f2297e.f2399e.d(iG4);
                        }
                    } else if (z4 && z6) {
                        if (!c0243f3.f2373c || !c0243f4.f2373c) {
                            return;
                        }
                        float f7 = c0237d2.f2284V;
                        int i10 = ((C0243f) c0243f3.f2381l.get(0)).f2377g + c0243f3.f2376f;
                        int i11 = ((C0243f) c0243f4.f2381l.get(0)).f2377g - c0243f4.f2376f;
                        if (i5 == -1) {
                            int iG5 = g(i11 - i10, 1);
                            int i12 = (int) ((iG5 / f7) + 0.5f);
                            int iG6 = g(i12, 0);
                            if (i12 != iG6) {
                                iG5 = (int) ((iG6 * f7) + 0.5f);
                            }
                            c0244g.d(iG6);
                            this.f2396b.f2297e.f2399e.d(iG5);
                        } else if (i5 == 0) {
                            int iG7 = g(i11 - i10, 1);
                            int i13 = (int) ((iG7 * f7) + 0.5f);
                            int iG8 = g(i13, 0);
                            if (i13 != iG8) {
                                iG7 = (int) ((iG8 / f7) + 0.5f);
                            }
                            c0244g.d(iG8);
                            this.f2396b.f2297e.f2399e.d(iG7);
                        } else if (i5 == 1) {
                        }
                    }
                } else {
                    int i14 = c0237d2.f2285W;
                    if (i14 == -1) {
                        f2 = c0237d2.f2297e.f2399e.f2377g;
                        f3 = c0237d2.f2284V;
                    } else if (i14 == 0) {
                        f4 = c0237d2.f2297e.f2399e.f2377g / c0237d2.f2284V;
                        i2 = (int) (f4 + 0.5f);
                        c0244g.d(i2);
                    } else if (i14 != 1) {
                        i2 = 0;
                        c0244g.d(i2);
                    } else {
                        f2 = c0237d2.f2297e.f2399e.f2377g;
                        f3 = c0237d2.f2284V;
                    }
                    f4 = f2 * f3;
                    i2 = (int) (f4 + 0.5f);
                    c0244g.d(i2);
                }
            }
        }
        if (c0243f.f2373c && c0243f2.f2373c) {
            if (c0243f.f2379j && c0243f2.f2379j && c0244g.f2379j) {
                return;
            }
            if (!c0244g.f2379j && this.f2398d == 3) {
                C0237d c0237d4 = this.f2396b;
                if (c0237d4.f2318r == 0 && !c0237d4.v()) {
                    C0243f c0243f5 = (C0243f) c0243f.f2381l.get(0);
                    C0243f c0243f6 = (C0243f) c0243f2.f2381l.get(0);
                    int i15 = c0243f5.f2377g + c0243f.f2376f;
                    int i16 = c0243f6.f2377g + c0243f2.f2376f;
                    c0243f.d(i15);
                    c0243f2.d(i16);
                    c0244g.d(i16 - i15);
                    return;
                }
            }
            if (!c0244g.f2379j && this.f2398d == 3 && this.f2395a == 1 && c0243f.f2381l.size() > 0 && c0243f2.f2381l.size() > 0) {
                int iMin = Math.min((((C0243f) c0243f2.f2381l.get(0)).f2377g + c0243f2.f2376f) - (((C0243f) c0243f.f2381l.get(0)).f2377g + c0243f.f2376f), c0244g.f2382m);
                C0237d c0237d5 = this.f2396b;
                int i17 = c0237d5.f2322v;
                int iMax = Math.max(c0237d5.f2321u, iMin);
                if (i17 > 0) {
                    iMax = Math.min(i17, iMax);
                }
                c0244g.d(iMax);
            }
            if (c0244g.f2379j) {
                C0243f c0243f7 = (C0243f) c0243f.f2381l.get(0);
                C0243f c0243f8 = (C0243f) c0243f2.f2381l.get(0);
                int i18 = c0243f7.f2377g;
                int i19 = c0243f.f2376f + i18;
                int i20 = c0243f8.f2377g;
                int i21 = c0243f2.f2376f + i20;
                float f8 = this.f2396b.f2294c0;
                if (c0243f7 == c0243f8) {
                    f8 = 0.5f;
                } else {
                    i18 = i19;
                    i20 = i21;
                }
                c0243f.d((int) ((((i20 - i18) - c0244g.f2377g) * f8) + i18 + 0.5f));
                c0243f2.d(c0243f.f2377g + c0244g.f2377g);
            }
        }
    }

    @Override // t.o
    public final void d() {
        C0237d c0237d;
        C0237d c0237d2;
        int i2;
        C0237d c0237d3;
        C0237d c0237d4;
        int i3;
        C0237d c0237d5 = this.f2396b;
        boolean z2 = c0237d5.f2289a;
        C0244g c0244g = this.f2399e;
        if (z2) {
            c0244g.d(c0237d5.o());
        }
        boolean z3 = c0244g.f2379j;
        C0243f c0243f = this.f2402i;
        C0243f c0243f2 = this.h;
        if (!z3) {
            C0237d c0237d6 = this.f2396b;
            int i4 = c0237d6.f2315o0[0];
            this.f2398d = i4;
            if (i4 != 3) {
                if (i4 == 4 && (c0237d4 = c0237d6.f2281S) != null && ((i3 = c0237d4.f2315o0[0]) == 1 || i3 == 4)) {
                    int iO = (c0237d4.o() - this.f2396b.f2270H.d()) - this.f2396b.f2272J.d();
                    o.b(c0243f2, c0237d4.f2295d.h, this.f2396b.f2270H.d());
                    o.b(c0243f, c0237d4.f2295d.f2402i, -this.f2396b.f2272J.d());
                    c0244g.d(iO);
                    return;
                }
                if (i4 == 1) {
                    c0244g.d(c0237d6.o());
                }
            }
        } else if (this.f2398d == 4 && (c0237d2 = (c0237d = this.f2396b).f2281S) != null && ((i2 = c0237d2.f2315o0[0]) == 1 || i2 == 4)) {
            o.b(c0243f2, c0237d2.f2295d.h, c0237d.f2270H.d());
            o.b(c0243f, c0237d2.f2295d.f2402i, -this.f2396b.f2272J.d());
            return;
        }
        if (c0244g.f2379j) {
            C0237d c0237d7 = this.f2396b;
            if (c0237d7.f2289a) {
                C0236c[] c0236cArr = c0237d7.f2278P;
                C0236c c0236c = c0236cArr[0];
                C0236c c0236c2 = c0236c.f2260f;
                if (c0236c2 != null && c0236cArr[1].f2260f != null) {
                    if (c0237d7.v()) {
                        c0243f2.f2376f = this.f2396b.f2278P[0].d();
                        c0243f.f2376f = -this.f2396b.f2278P[1].d();
                        return;
                    }
                    C0243f c0243fH = o.h(this.f2396b.f2278P[0]);
                    if (c0243fH != null) {
                        o.b(c0243f2, c0243fH, this.f2396b.f2278P[0].d());
                    }
                    C0243f c0243fH2 = o.h(this.f2396b.f2278P[1]);
                    if (c0243fH2 != null) {
                        o.b(c0243f, c0243fH2, -this.f2396b.f2278P[1].d());
                    }
                    c0243f2.f2372b = true;
                    c0243f.f2372b = true;
                    return;
                }
                if (c0236c2 != null) {
                    C0243f c0243fH3 = o.h(c0236c);
                    if (c0243fH3 != null) {
                        o.b(c0243f2, c0243fH3, this.f2396b.f2278P[0].d());
                        o.b(c0243f, c0243f2, c0244g.f2377g);
                        return;
                    }
                    return;
                }
                C0236c c0236c3 = c0236cArr[1];
                if (c0236c3.f2260f != null) {
                    C0243f c0243fH4 = o.h(c0236c3);
                    if (c0243fH4 != null) {
                        o.b(c0243f, c0243fH4, -this.f2396b.f2278P[1].d());
                        o.b(c0243f2, c0243f, -c0244g.f2377g);
                        return;
                    }
                    return;
                }
                if ((c0237d7 instanceof C0234a) || c0237d7.f2281S == null || c0237d7.g(7).f2260f != null) {
                    return;
                }
                C0237d c0237d8 = this.f2396b;
                o.b(c0243f2, c0237d8.f2281S.f2295d.h, c0237d8.p());
                o.b(c0243f, c0243f2, c0244g.f2377g);
                return;
            }
        }
        if (this.f2398d == 3) {
            C0237d c0237d9 = this.f2396b;
            int i5 = c0237d9.f2318r;
            if (i5 == 2) {
                C0237d c0237d10 = c0237d9.f2281S;
                if (c0237d10 != null) {
                    C0244g c0244g2 = c0237d10.f2297e.f2399e;
                    c0244g.f2381l.add(c0244g2);
                    c0244g2.f2380k.add(c0244g);
                    c0244g.f2372b = true;
                    c0244g.f2380k.add(c0243f2);
                    c0244g.f2380k.add(c0243f);
                }
            } else if (i5 == 3) {
                if (c0237d9.f2319s == 3) {
                    c0243f2.f2371a = this;
                    c0243f.f2371a = this;
                    m mVar = c0237d9.f2297e;
                    mVar.h.f2371a = this;
                    mVar.f2402i.f2371a = this;
                    c0244g.f2371a = this;
                    if (c0237d9.w()) {
                        c0244g.f2381l.add(this.f2396b.f2297e.f2399e);
                        this.f2396b.f2297e.f2399e.f2380k.add(c0244g);
                        m mVar2 = this.f2396b.f2297e;
                        mVar2.f2399e.f2371a = this;
                        c0244g.f2381l.add(mVar2.h);
                        c0244g.f2381l.add(this.f2396b.f2297e.f2402i);
                        this.f2396b.f2297e.h.f2380k.add(c0244g);
                        this.f2396b.f2297e.f2402i.f2380k.add(c0244g);
                    } else if (this.f2396b.v()) {
                        this.f2396b.f2297e.f2399e.f2381l.add(c0244g);
                        c0244g.f2380k.add(this.f2396b.f2297e.f2399e);
                    } else {
                        this.f2396b.f2297e.f2399e.f2381l.add(c0244g);
                    }
                } else {
                    C0244g c0244g3 = c0237d9.f2297e.f2399e;
                    c0244g.f2381l.add(c0244g3);
                    c0244g3.f2380k.add(c0244g);
                    this.f2396b.f2297e.h.f2380k.add(c0244g);
                    this.f2396b.f2297e.f2402i.f2380k.add(c0244g);
                    c0244g.f2372b = true;
                    c0244g.f2380k.add(c0243f2);
                    c0244g.f2380k.add(c0243f);
                    c0243f2.f2381l.add(c0244g);
                    c0243f.f2381l.add(c0244g);
                }
            }
        }
        C0237d c0237d11 = this.f2396b;
        C0236c[] c0236cArr2 = c0237d11.f2278P;
        C0236c c0236c4 = c0236cArr2[0];
        C0236c c0236c5 = c0236c4.f2260f;
        if (c0236c5 != null && c0236cArr2[1].f2260f != null) {
            if (c0237d11.v()) {
                c0243f2.f2376f = this.f2396b.f2278P[0].d();
                c0243f.f2376f = -this.f2396b.f2278P[1].d();
                return;
            }
            C0243f c0243fH5 = o.h(this.f2396b.f2278P[0]);
            C0243f c0243fH6 = o.h(this.f2396b.f2278P[1]);
            if (c0243fH5 != null) {
                c0243fH5.b(this);
            }
            if (c0243fH6 != null) {
                c0243fH6.b(this);
            }
            this.f2403j = 4;
            return;
        }
        if (c0236c5 != null) {
            C0243f c0243fH7 = o.h(c0236c4);
            if (c0243fH7 != null) {
                o.b(c0243f2, c0243fH7, this.f2396b.f2278P[0].d());
                c(c0243f, c0243f2, 1, c0244g);
                return;
            }
            return;
        }
        C0236c c0236c6 = c0236cArr2[1];
        if (c0236c6.f2260f != null) {
            C0243f c0243fH8 = o.h(c0236c6);
            if (c0243fH8 != null) {
                o.b(c0243f, c0243fH8, -this.f2396b.f2278P[1].d());
                c(c0243f2, c0243f, -1, c0244g);
                return;
            }
            return;
        }
        if ((c0237d11 instanceof C0234a) || (c0237d3 = c0237d11.f2281S) == null) {
            return;
        }
        o.b(c0243f2, c0237d3.f2295d.h, c0237d11.p());
        c(c0243f, c0243f2, 1, c0244g);
    }

    @Override // t.o
    public final void e() {
        C0243f c0243f = this.h;
        if (c0243f.f2379j) {
            this.f2396b.f2286X = c0243f.f2377g;
        }
    }

    @Override // t.o
    public final void f() {
        this.f2397c = null;
        this.h.c();
        this.f2402i.c();
        this.f2399e.c();
        this.f2401g = false;
    }

    @Override // t.o
    public final boolean k() {
        return this.f2398d != 3 || this.f2396b.f2318r == 0;
    }

    public final void n() {
        this.f2401g = false;
        C0243f c0243f = this.h;
        c0243f.c();
        c0243f.f2379j = false;
        C0243f c0243f2 = this.f2402i;
        c0243f2.c();
        c0243f2.f2379j = false;
        this.f2399e.f2379j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f2396b.g0;
    }
}
