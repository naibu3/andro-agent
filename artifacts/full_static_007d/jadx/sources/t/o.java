package t;

import s.C0236c;
import s.C0237d;

/* loaded from: classes.dex */
public abstract class o implements InterfaceC0241d {

    /* renamed from: a, reason: collision with root package name */
    public int f2395a;

    /* renamed from: b, reason: collision with root package name */
    public C0237d f2396b;

    /* renamed from: c, reason: collision with root package name */
    public C0249l f2397c;

    /* renamed from: d, reason: collision with root package name */
    public int f2398d;

    /* renamed from: e, reason: collision with root package name */
    public final C0244g f2399e = new C0244g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f2400f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2401g = false;
    public final C0243f h = new C0243f(this);

    /* renamed from: i, reason: collision with root package name */
    public final C0243f f2402i = new C0243f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f2403j = 1;

    public o(C0237d c0237d) {
        this.f2396b = c0237d;
    }

    public static void b(C0243f c0243f, C0243f c0243f2, int i2) {
        c0243f.f2381l.add(c0243f2);
        c0243f.f2376f = i2;
        c0243f2.f2380k.add(c0243f);
    }

    public static C0243f h(C0236c c0236c) {
        C0236c c0236c2 = c0236c.f2260f;
        if (c0236c2 == null) {
            return null;
        }
        int iA = q.f.a(c0236c2.f2259e);
        C0237d c0237d = c0236c2.f2258d;
        if (iA == 1) {
            return c0237d.f2295d.h;
        }
        if (iA == 2) {
            return c0237d.f2297e.h;
        }
        if (iA == 3) {
            return c0237d.f2295d.f2402i;
        }
        if (iA == 4) {
            return c0237d.f2297e.f2402i;
        }
        if (iA != 5) {
            return null;
        }
        return c0237d.f2297e.f2387k;
    }

    public static C0243f i(C0236c c0236c, int i2) {
        C0236c c0236c2 = c0236c.f2260f;
        if (c0236c2 == null) {
            return null;
        }
        C0237d c0237d = c0236c2.f2258d;
        o oVar = i2 == 0 ? c0237d.f2295d : c0237d.f2297e;
        int iA = q.f.a(c0236c2.f2259e);
        if (iA == 1 || iA == 2) {
            return oVar.h;
        }
        if (iA == 3 || iA == 4) {
            return oVar.f2402i;
        }
        return null;
    }

    public final void c(C0243f c0243f, C0243f c0243f2, int i2, C0244g c0244g) {
        c0243f.f2381l.add(c0243f2);
        c0243f.f2381l.add(this.f2399e);
        c0243f.h = i2;
        c0243f.f2378i = c0244g;
        c0243f2.f2380k.add(c0243f);
        c0244g.f2380k.add(c0243f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i2, int i3) {
        int iMax;
        if (i3 == 0) {
            C0237d c0237d = this.f2396b;
            int i4 = c0237d.f2322v;
            iMax = Math.max(c0237d.f2321u, i2);
            if (i4 > 0) {
                iMax = Math.min(i4, i2);
            }
            if (iMax == i2) {
                return i2;
            }
        } else {
            C0237d c0237d2 = this.f2396b;
            int i5 = c0237d2.y;
            iMax = Math.max(c0237d2.f2324x, i2);
            if (i5 > 0) {
                iMax = Math.min(i5, i2);
            }
            if (iMax == i2) {
                return i2;
            }
        }
        return iMax;
    }

    public long j() {
        if (this.f2399e.f2379j) {
            return r0.f2377g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(C0236c c0236c, C0236c c0236c2, int i2) {
        C0243f c0243fH = h(c0236c);
        C0243f c0243fH2 = h(c0236c2);
        if (c0243fH.f2379j && c0243fH2.f2379j) {
            int iD = c0236c.d() + c0243fH.f2377g;
            int iD2 = c0243fH2.f2377g - c0236c2.d();
            int i3 = iD2 - iD;
            C0244g c0244g = this.f2399e;
            if (!c0244g.f2379j && this.f2398d == 3) {
                int i4 = this.f2395a;
                if (i4 == 0) {
                    c0244g.d(g(i3, i2));
                } else if (i4 == 1) {
                    c0244g.d(Math.min(g(c0244g.f2382m, i2), i3));
                } else if (i4 == 2) {
                    C0237d c0237d = this.f2396b;
                    C0237d c0237d2 = c0237d.f2281S;
                    if (c0237d2 != null) {
                        if ((i2 == 0 ? c0237d2.f2295d : c0237d2.f2297e).f2399e.f2379j) {
                            c0244g.d(g((int) ((r6.f2377g * (i2 == 0 ? c0237d.f2323w : c0237d.f2325z)) + 0.5f), i2));
                        }
                    }
                } else if (i4 == 3) {
                    C0237d c0237d3 = this.f2396b;
                    o oVar = c0237d3.f2295d;
                    if (oVar.f2398d == 3 && oVar.f2395a == 3) {
                        m mVar = c0237d3.f2297e;
                        if (mVar.f2398d != 3 || mVar.f2395a != 3) {
                        }
                    } else {
                        if (i2 == 0) {
                            oVar = c0237d3.f2297e;
                        }
                        if (oVar.f2399e.f2379j) {
                            float f2 = c0237d3.f2284V;
                            c0244g.d(i2 == 1 ? (int) ((r6.f2377g / f2) + 0.5f) : (int) ((f2 * r6.f2377g) + 0.5f));
                        }
                    }
                }
            }
            if (c0244g.f2379j) {
                int i5 = c0244g.f2377g;
                C0243f c0243f = this.f2402i;
                C0243f c0243f2 = this.h;
                if (i5 == i3) {
                    c0243f2.d(iD);
                    c0243f.d(iD2);
                    return;
                }
                C0237d c0237d4 = this.f2396b;
                float f3 = i2 == 0 ? c0237d4.f2294c0 : c0237d4.f2296d0;
                if (c0243fH == c0243fH2) {
                    iD = c0243fH.f2377g;
                    iD2 = c0243fH2.f2377g;
                    f3 = 0.5f;
                }
                c0243f2.d((int) ((((iD2 - iD) - i5) * f3) + iD + 0.5f));
                c0243f.d(c0243f2.f2377g + c0244g.f2377g);
            }
        }
    }
}
