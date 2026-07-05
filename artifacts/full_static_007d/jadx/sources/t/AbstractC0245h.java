package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.C0234a;
import s.C0236c;
import s.C0237d;

/* renamed from: t.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0245h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0239b f2383a = new C0239b();

    public static boolean a(C0237d c0237d) {
        int[] iArr = c0237d.f2315o0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        C0237d c0237d2 = c0237d.f2281S;
        s.e eVar = c0237d2 != null ? (s.e) c0237d2 : null;
        if (eVar != null) {
            int i4 = eVar.f2315o0[0];
        }
        if (eVar != null) {
            int i5 = eVar.f2315o0[1];
        }
        boolean z2 = i2 == 1 || c0237d.y() || i2 == 2 || (i2 == 3 && c0237d.f2318r == 0 && c0237d.f2284V == 0.0f && c0237d.r(0)) || (i2 == 3 && c0237d.f2318r == 1 && c0237d.s(0, c0237d.o()));
        boolean z3 = i3 == 1 || c0237d.z() || i3 == 2 || (i3 == 3 && c0237d.f2319s == 0 && c0237d.f2284V == 0.0f && c0237d.r(1)) || (i3 == 3 && c0237d.f2319s == 1 && c0237d.s(1, c0237d.i()));
        if (c0237d.f2284V <= 0.0f || !(z2 || z3)) {
            return z2 && z3;
        }
        return true;
    }

    public static n b(C0237d c0237d, int i2, ArrayList arrayList, n nVar) {
        int i3;
        int i4 = i2 == 0 ? c0237d.f2311m0 : c0237d.f2313n0;
        if (i4 != -1 && (nVar == null || i4 != nVar.f2391b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                n nVar2 = (n) arrayList.get(i5);
                if (nVar2.f2391b == i4) {
                    if (nVar != null) {
                        nVar.c(i2, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                } else {
                    i5++;
                }
            }
        } else if (i4 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if (c0237d instanceof C0234a) {
                C0234a c0234a = (C0234a) c0237d;
                int i6 = 0;
                while (true) {
                    if (i6 >= c0234a.f2235q0) {
                        i3 = -1;
                        break;
                    }
                    C0237d c0237d2 = c0234a.f2234p0[i6];
                    if ((i2 == 0 && (i3 = c0237d2.f2311m0) != -1) || (i2 == 1 && (i3 = c0237d2.f2313n0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        n nVar3 = (n) arrayList.get(i7);
                        if (nVar3.f2391b == i3) {
                            nVar = nVar3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (nVar == null) {
                nVar = new n();
                nVar.f2390a = new ArrayList();
                nVar.f2393d = null;
                nVar.f2394e = -1;
                int i8 = n.f2389f;
                n.f2389f = i8 + 1;
                nVar.f2391b = i8;
                nVar.f2392c = i2;
            }
            arrayList.add(nVar);
        }
        ArrayList arrayList2 = nVar.f2390a;
        if (!arrayList2.contains(c0237d)) {
            arrayList2.add(c0237d);
            if (c0237d instanceof s.f) {
                s.f fVar = (s.f) c0237d;
                fVar.f2349s0.b(fVar.t0 == 0 ? 1 : 0, arrayList, nVar);
            }
            int i9 = nVar.f2391b;
            if (i2 == 0) {
                c0237d.f2311m0 = i9;
                c0237d.f2270H.b(i2, arrayList, nVar);
                c0237d.f2272J.b(i2, arrayList, nVar);
            } else {
                c0237d.f2313n0 = i9;
                c0237d.f2271I.b(i2, arrayList, nVar);
                c0237d.f2274L.b(i2, arrayList, nVar);
                c0237d.f2273K.b(i2, arrayList, nVar);
            }
            c0237d.f2277O.b(i2, arrayList, nVar);
        }
        return nVar;
    }

    public static void c(int i2, C0237d c0237d, v.f fVar, boolean z2) {
        C0236c c0236c;
        C0236c c0236c2;
        C0236c c0236c3;
        C0236c c0236c4;
        if (c0237d.f2310m) {
            return;
        }
        if (!(c0237d instanceof s.e) && c0237d.x() && a(c0237d)) {
            s.e.R(c0237d, fVar, new C0239b());
        }
        C0236c c0236cG = c0237d.g(2);
        C0236c c0236cG2 = c0237d.g(4);
        int iC = c0236cG.c();
        int iC2 = c0236cG2.c();
        HashSet hashSet = c0236cG.f2255a;
        char c2 = 0;
        if (hashSet != null && c0236cG.f2257c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0236c c0236c5 = (C0236c) it.next();
                C0237d c0237d2 = c0236c5.f2258d;
                int i3 = i2 + 1;
                boolean zA = a(c0237d2);
                if (c0237d2.x() && zA) {
                    s.e.R(c0237d2, fVar, new C0239b());
                }
                C0236c c0236c6 = c0237d2.f2270H;
                C0236c c0236c7 = c0237d2.f2272J;
                char c3 = ((c0236c5 == c0236c6 && (c0236c4 = c0236c7.f2260f) != null && c0236c4.f2257c) || (c0236c5 == c0236c7 && (c0236c3 = c0236c6.f2260f) != null && c0236c3.f2257c)) ? (char) 1 : c2;
                int i4 = c0237d2.f2315o0[c2];
                if (i4 != 3 || zA) {
                    if (!c0237d2.x()) {
                        if (c0236c5 == c0236c6 && c0236c7.f2260f == null) {
                            int iD = c0236c6.d() + iC;
                            c0237d2.F(iD, c0237d2.o() + iD);
                            c(i3, c0237d2, fVar, z2);
                        } else if (c0236c5 == c0236c7 && c0236c6.f2260f == null) {
                            int iD2 = iC - c0236c7.d();
                            c0237d2.F(iD2 - c0237d2.o(), iD2);
                            c(i3, c0237d2, fVar, z2);
                        } else if (c3 != 0 && !c0237d2.v()) {
                            d(i3, c0237d2, fVar, z2);
                        }
                    }
                } else if (i4 == 3 && c0237d2.f2322v >= 0 && c0237d2.f2321u >= 0 && ((c0237d2.f2300f0 == 8 || (c0237d2.f2318r == 0 && c0237d2.f2284V == 0.0f)) && !c0237d2.v() && c3 != 0 && !c0237d2.v())) {
                    e(i3, c0237d, fVar, c0237d2, z2);
                }
                c2 = 0;
            }
        }
        if (c0237d instanceof s.f) {
            return;
        }
        HashSet hashSet2 = c0236cG2.f2255a;
        if (hashSet2 != null && c0236cG2.f2257c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0236c c0236c8 = (C0236c) it2.next();
                C0237d c0237d3 = c0236c8.f2258d;
                int i5 = i2 + 1;
                boolean zA2 = a(c0237d3);
                if (c0237d3.x() && zA2) {
                    s.e.R(c0237d3, fVar, new C0239b());
                }
                C0236c c0236c9 = c0237d3.f2270H;
                C0236c c0236c10 = c0237d3.f2272J;
                boolean z3 = (c0236c8 == c0236c9 && (c0236c2 = c0236c10.f2260f) != null && c0236c2.f2257c) || (c0236c8 == c0236c10 && (c0236c = c0236c9.f2260f) != null && c0236c.f2257c);
                int i6 = c0237d3.f2315o0[0];
                if (i6 != 3 || zA2) {
                    if (!c0237d3.x()) {
                        if (c0236c8 == c0236c9 && c0236c10.f2260f == null) {
                            int iD3 = c0236c9.d() + iC2;
                            c0237d3.F(iD3, c0237d3.o() + iD3);
                            c(i5, c0237d3, fVar, z2);
                        } else if (c0236c8 == c0236c10 && c0236c9.f2260f == null) {
                            int iD4 = iC2 - c0236c10.d();
                            c0237d3.F(iD4 - c0237d3.o(), iD4);
                            c(i5, c0237d3, fVar, z2);
                        } else if (z3 && !c0237d3.v()) {
                            d(i5, c0237d3, fVar, z2);
                        }
                    }
                } else if (i6 == 3 && c0237d3.f2322v >= 0 && c0237d3.f2321u >= 0) {
                    if (c0237d3.f2300f0 != 8) {
                        if (c0237d3.f2318r == 0) {
                            if (c0237d3.f2284V == 0.0f) {
                            }
                        }
                    }
                    if (!c0237d3.v() && z3 && !c0237d3.v()) {
                        e(i5, c0237d, fVar, c0237d3, z2);
                    }
                }
            }
        }
        c0237d.f2310m = true;
    }

    public static void d(int i2, C0237d c0237d, v.f fVar, boolean z2) {
        float f2 = c0237d.f2294c0;
        C0236c c0236c = c0237d.f2270H;
        int iC = c0236c.f2260f.c();
        C0236c c0236c2 = c0237d.f2272J;
        int iC2 = c0236c2.f2260f.c();
        int iD = c0236c.d() + iC;
        int iD2 = iC2 - c0236c2.d();
        if (iC == iC2) {
            f2 = 0.5f;
        } else {
            iC = iD;
            iC2 = iD2;
        }
        int iO = c0237d.o();
        int i3 = (iC2 - iC) - iO;
        if (iC > iC2) {
            i3 = (iC - iC2) - iO;
        }
        int i4 = ((int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3)) + iC;
        int i5 = i4 + iO;
        if (iC > iC2) {
            i5 = i4 - iO;
        }
        c0237d.F(i4, i5);
        c(i2 + 1, c0237d, fVar, z2);
    }

    public static void e(int i2, C0237d c0237d, v.f fVar, C0237d c0237d2, boolean z2) {
        float f2 = c0237d2.f2294c0;
        C0236c c0236c = c0237d2.f2270H;
        int iD = c0236c.d() + c0236c.f2260f.c();
        C0236c c0236c2 = c0237d2.f2272J;
        int iC = c0236c2.f2260f.c() - c0236c2.d();
        if (iC >= iD) {
            int iO = c0237d2.o();
            if (c0237d2.f2300f0 != 8) {
                int i3 = c0237d2.f2318r;
                if (i3 == 2) {
                    iO = (int) (c0237d2.f2294c0 * 0.5f * (c0237d instanceof s.e ? c0237d.o() : c0237d.f2281S.o()));
                } else if (i3 == 0) {
                    iO = iC - iD;
                }
                iO = Math.max(c0237d2.f2321u, iO);
                int i4 = c0237d2.f2322v;
                if (i4 > 0) {
                    iO = Math.min(i4, iO);
                }
            }
            int i5 = iD + ((int) ((f2 * ((iC - iD) - iO)) + 0.5f));
            c0237d2.F(i5, iO + i5);
            c(i2 + 1, c0237d2, fVar, z2);
        }
    }

    public static void f(int i2, C0237d c0237d, v.f fVar) {
        float f2 = c0237d.f2296d0;
        C0236c c0236c = c0237d.f2271I;
        int iC = c0236c.f2260f.c();
        C0236c c0236c2 = c0237d.f2273K;
        int iC2 = c0236c2.f2260f.c();
        int iD = c0236c.d() + iC;
        int iD2 = iC2 - c0236c2.d();
        if (iC == iC2) {
            f2 = 0.5f;
        } else {
            iC = iD;
            iC2 = iD2;
        }
        int i3 = c0237d.i();
        int i4 = (iC2 - iC) - i3;
        if (iC > iC2) {
            i4 = (iC - iC2) - i3;
        }
        int i5 = (int) (i4 > 0 ? (f2 * i4) + 0.5f : f2 * i4);
        int i6 = iC + i5;
        int i7 = i6 + i3;
        if (iC > iC2) {
            i6 = iC - i5;
            i7 = i6 - i3;
        }
        c0237d.G(i6, i7);
        i(i2 + 1, c0237d, fVar);
    }

    public static void g(int i2, C0237d c0237d, v.f fVar, C0237d c0237d2) {
        float f2 = c0237d2.f2296d0;
        C0236c c0236c = c0237d2.f2271I;
        int iD = c0236c.d() + c0236c.f2260f.c();
        C0236c c0236c2 = c0237d2.f2273K;
        int iC = c0236c2.f2260f.c() - c0236c2.d();
        if (iC >= iD) {
            int i3 = c0237d2.i();
            if (c0237d2.f2300f0 != 8) {
                int i4 = c0237d2.f2319s;
                if (i4 == 2) {
                    i3 = (int) (f2 * 0.5f * (c0237d instanceof s.e ? c0237d.i() : c0237d.f2281S.i()));
                } else if (i4 == 0) {
                    i3 = iC - iD;
                }
                i3 = Math.max(c0237d2.f2324x, i3);
                int i5 = c0237d2.y;
                if (i5 > 0) {
                    i3 = Math.min(i5, i3);
                }
            }
            int i6 = iD + ((int) ((f2 * ((iC - iD) - i3)) + 0.5f));
            c0237d2.G(i6, i3 + i6);
            i(i2 + 1, c0237d2, fVar);
        }
    }

    public static boolean h(int i2, int i3, int i4, int i5) {
        return (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2)) || (i5 == 1 || i5 == 2 || (i5 == 4 && i3 != 2));
    }

    public static void i(int i2, C0237d c0237d, v.f fVar) {
        C0236c c0236c;
        C0236c c0236c2;
        C0236c c0236c3;
        C0236c c0236c4;
        C0236c c0236c5;
        if (c0237d.f2312n) {
            return;
        }
        if (!(c0237d instanceof s.e) && c0237d.x() && a(c0237d)) {
            s.e.R(c0237d, fVar, new C0239b());
        }
        C0236c c0236cG = c0237d.g(3);
        C0236c c0236cG2 = c0237d.g(5);
        int iC = c0236cG.c();
        int iC2 = c0236cG2.c();
        HashSet hashSet = c0236cG.f2255a;
        if (hashSet != null && c0236cG.f2257c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0236c c0236c6 = (C0236c) it.next();
                C0237d c0237d2 = c0236c6.f2258d;
                int i3 = i2 + 1;
                boolean zA = a(c0237d2);
                if (c0237d2.x() && zA) {
                    s.e.R(c0237d2, fVar, new C0239b());
                }
                C0236c c0236c7 = c0237d2.f2271I;
                C0236c c0236c8 = c0237d2.f2273K;
                boolean z2 = (c0236c6 == c0236c7 && (c0236c5 = c0236c8.f2260f) != null && c0236c5.f2257c) || (c0236c6 == c0236c8 && (c0236c4 = c0236c7.f2260f) != null && c0236c4.f2257c);
                int i4 = c0237d2.f2315o0[1];
                if (i4 != 3 || zA) {
                    if (!c0237d2.x()) {
                        if (c0236c6 == c0236c7 && c0236c8.f2260f == null) {
                            int iD = c0236c7.d() + iC;
                            c0237d2.G(iD, c0237d2.i() + iD);
                            i(i3, c0237d2, fVar);
                        } else if (c0236c6 == c0236c8 && c0236c7.f2260f == null) {
                            int iD2 = iC - c0236c8.d();
                            c0237d2.G(iD2 - c0237d2.i(), iD2);
                            i(i3, c0237d2, fVar);
                        } else if (z2 && !c0237d2.w()) {
                            f(i3, c0237d2, fVar);
                        }
                    }
                } else if (i4 == 3 && c0237d2.y >= 0 && c0237d2.f2324x >= 0 && (c0237d2.f2300f0 == 8 || (c0237d2.f2319s == 0 && c0237d2.f2284V == 0.0f))) {
                    if (!c0237d2.w() && z2 && !c0237d2.w()) {
                        g(i3, c0237d, fVar, c0237d2);
                    }
                }
            }
        }
        if (c0237d instanceof s.f) {
            return;
        }
        HashSet hashSet2 = c0236cG2.f2255a;
        if (hashSet2 != null && c0236cG2.f2257c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C0236c c0236c9 = (C0236c) it2.next();
                C0237d c0237d3 = c0236c9.f2258d;
                int i5 = i2 + 1;
                boolean zA2 = a(c0237d3);
                if (c0237d3.x() && zA2) {
                    s.e.R(c0237d3, fVar, new C0239b());
                }
                C0236c c0236c10 = c0237d3.f2271I;
                C0236c c0236c11 = c0237d3.f2273K;
                boolean z3 = (c0236c9 == c0236c10 && (c0236c3 = c0236c11.f2260f) != null && c0236c3.f2257c) || (c0236c9 == c0236c11 && (c0236c2 = c0236c10.f2260f) != null && c0236c2.f2257c);
                int i6 = c0237d3.f2315o0[1];
                if (i6 != 3 || zA2) {
                    if (!c0237d3.x()) {
                        if (c0236c9 == c0236c10 && c0236c11.f2260f == null) {
                            int iD3 = c0236c10.d() + iC2;
                            c0237d3.G(iD3, c0237d3.i() + iD3);
                            i(i5, c0237d3, fVar);
                        } else if (c0236c9 == c0236c11 && c0236c10.f2260f == null) {
                            int iD4 = iC2 - c0236c11.d();
                            c0237d3.G(iD4 - c0237d3.i(), iD4);
                            i(i5, c0237d3, fVar);
                        } else if (z3 && !c0237d3.w()) {
                            f(i5, c0237d3, fVar);
                        }
                    }
                } else if (i6 == 3 && c0237d3.y >= 0 && c0237d3.f2324x >= 0) {
                    if (c0237d3.f2300f0 != 8) {
                        if (c0237d3.f2319s == 0) {
                            if (c0237d3.f2284V == 0.0f) {
                            }
                        }
                    }
                    if (!c0237d3.w() && z3 && !c0237d3.w()) {
                        g(i5, c0237d, fVar, c0237d3);
                    }
                }
            }
        }
        C0236c c0236cG3 = c0237d.g(6);
        if (c0236cG3.f2255a != null && c0236cG3.f2257c) {
            int iC3 = c0236cG3.c();
            Iterator it3 = c0236cG3.f2255a.iterator();
            while (it3.hasNext()) {
                C0236c c0236c12 = (C0236c) it3.next();
                C0237d c0237d4 = c0236c12.f2258d;
                int i7 = i2 + 1;
                boolean zA3 = a(c0237d4);
                if (c0237d4.x() && zA3) {
                    s.e.R(c0237d4, fVar, new C0239b());
                }
                if (c0237d4.f2315o0[1] != 3 || zA3) {
                    if (!c0237d4.x() && c0236c12 == (c0236c = c0237d4.f2274L)) {
                        int iD5 = c0236c12.d() + iC3;
                        if (c0237d4.f2267E) {
                            int i8 = iD5 - c0237d4.f2288Z;
                            int i9 = c0237d4.f2283U + i8;
                            c0237d4.f2287Y = i8;
                            c0237d4.f2271I.i(i8);
                            c0237d4.f2273K.i(i9);
                            c0236c.i(iD5);
                            c0237d4.f2308l = true;
                        }
                        i(i7, c0237d4, fVar);
                    }
                }
            }
        }
        c0237d.f2312n = true;
    }
}
