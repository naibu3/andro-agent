package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.C0234a;
import s.C0236c;
import s.C0237d;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0242e {

    /* renamed from: a, reason: collision with root package name */
    public s.e f2364a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2365b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2366c;

    /* renamed from: d, reason: collision with root package name */
    public s.e f2367d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f2368e;

    /* renamed from: f, reason: collision with root package name */
    public v.f f2369f;

    /* renamed from: g, reason: collision with root package name */
    public C0239b f2370g;
    public ArrayList h;

    public final void a(C0243f c0243f, int i2, ArrayList arrayList, C0249l c0249l) {
        o oVar = c0243f.f2374d;
        if (oVar.f2397c == null) {
            s.e eVar = this.f2364a;
            if (oVar == eVar.f2295d || oVar == eVar.f2297e) {
                return;
            }
            if (c0249l == null) {
                c0249l = new C0249l();
                c0249l.f2385a = null;
                c0249l.f2386b = new ArrayList();
                c0249l.f2385a = oVar;
                arrayList.add(c0249l);
            }
            oVar.f2397c = c0249l;
            c0249l.f2386b.add(oVar);
            C0243f c0243f2 = oVar.h;
            Iterator it = c0243f2.f2380k.iterator();
            while (it.hasNext()) {
                InterfaceC0241d interfaceC0241d = (InterfaceC0241d) it.next();
                if (interfaceC0241d instanceof C0243f) {
                    a((C0243f) interfaceC0241d, i2, arrayList, c0249l);
                }
            }
            C0243f c0243f3 = oVar.f2402i;
            Iterator it2 = c0243f3.f2380k.iterator();
            while (it2.hasNext()) {
                InterfaceC0241d interfaceC0241d2 = (InterfaceC0241d) it2.next();
                if (interfaceC0241d2 instanceof C0243f) {
                    a((C0243f) interfaceC0241d2, i2, arrayList, c0249l);
                }
            }
            if (i2 == 1 && (oVar instanceof m)) {
                Iterator it3 = ((m) oVar).f2387k.f2380k.iterator();
                while (it3.hasNext()) {
                    InterfaceC0241d interfaceC0241d3 = (InterfaceC0241d) it3.next();
                    if (interfaceC0241d3 instanceof C0243f) {
                        a((C0243f) interfaceC0241d3, i2, arrayList, c0249l);
                    }
                }
            }
            Iterator it4 = c0243f2.f2381l.iterator();
            while (it4.hasNext()) {
                a((C0243f) it4.next(), i2, arrayList, c0249l);
            }
            Iterator it5 = c0243f3.f2381l.iterator();
            while (it5.hasNext()) {
                a((C0243f) it5.next(), i2, arrayList, c0249l);
            }
            if (i2 == 1 && (oVar instanceof m)) {
                Iterator it6 = ((m) oVar).f2387k.f2381l.iterator();
                while (it6.hasNext()) {
                    a((C0243f) it6.next(), i2, arrayList, c0249l);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(s.e eVar) {
        int iO;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Iterator it = eVar.f2336p0.iterator();
        while (it.hasNext()) {
            C0237d c0237d = (C0237d) it.next();
            int[] iArr = c0237d.f2315o0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            if (c0237d.f2300f0 == 8) {
                c0237d.f2289a = true;
            } else {
                float f2 = c0237d.f2323w;
                if (f2 < 1.0f && i7 == 3) {
                    c0237d.f2318r = 2;
                }
                float f3 = c0237d.f2325z;
                if (f3 < 1.0f && i8 == 3) {
                    c0237d.f2319s = 2;
                }
                if (c0237d.f2284V > 0.0f) {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        c0237d.f2318r = 3;
                    } else if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        c0237d.f2319s = 3;
                    } else if (i7 == 3 && i8 == 3) {
                        if (c0237d.f2318r == 0) {
                            c0237d.f2318r = 3;
                        }
                        if (c0237d.f2319s == 0) {
                            c0237d.f2319s = 3;
                        }
                    }
                }
                C0236c c0236c = c0237d.f2272J;
                C0236c c0236c2 = c0237d.f2270H;
                if (i7 == 3 && c0237d.f2318r == 1 && (c0236c2.f2260f == null || c0236c.f2260f == null)) {
                    i7 = 2;
                }
                C0236c c0236c3 = c0237d.f2273K;
                C0236c c0236c4 = c0237d.f2271I;
                int i9 = (i8 == 3 && c0237d.f2319s == 1 && (c0236c4.f2260f == null || c0236c3.f2260f == null)) ? 2 : i8;
                C0248k c0248k = c0237d.f2295d;
                c0248k.f2398d = i7;
                int i10 = c0237d.f2318r;
                c0248k.f2395a = i10;
                m mVar = c0237d.f2297e;
                mVar.f2398d = i9;
                int i11 = c0237d.f2319s;
                mVar.f2395a = i11;
                if ((i7 == 4 || i7 == 1 || i7 == 2) && (i9 == 4 || i9 == 1 || i9 == 2)) {
                    int iO2 = c0237d.o();
                    if (i7 == 4) {
                        iO = (eVar.o() - c0236c2.f2261g) - c0236c.f2261g;
                        i7 = 1;
                    } else {
                        iO = iO2;
                    }
                    int i12 = c0237d.i();
                    if (i9 == 4) {
                        i2 = (eVar.i() - c0236c4.f2261g) - c0236c3.f2261g;
                        i3 = 1;
                    } else {
                        i2 = i12;
                        i3 = i9;
                    }
                    f(i7, iO, i3, i2, c0237d);
                    c0237d.f2295d.f2399e.d(c0237d.o());
                    c0237d.f2297e.f2399e.d(c0237d.i());
                    c0237d.f2289a = true;
                } else {
                    int[] iArr2 = eVar.f2315o0;
                    C0236c[] c0236cArr = c0237d.f2278P;
                    if (i7 != 3 || (i9 != 2 && i9 != 1)) {
                        i4 = 3;
                        if (i9 == i4) {
                            if (i7 != 2 && i7 != 1) {
                                i6 = i4;
                                i5 = 1;
                                if (i7 != i6) {
                                }
                            } else if (i11 == i4) {
                                if (i7 == 2) {
                                    f(2, 0, 2, 0, c0237d);
                                }
                                int iO3 = c0237d.o();
                                float f4 = c0237d.f2284V;
                                if (c0237d.f2285W == -1) {
                                    f4 = 1.0f / f4;
                                }
                                f(1, iO3, 1, (int) ((iO3 * f4) + 0.5f), c0237d);
                                c0237d.f2295d.f2399e.d(c0237d.o());
                                c0237d.f2297e.f2399e.d(c0237d.i());
                                c0237d.f2289a = true;
                            } else if (i11 == 1) {
                                f(i7, 0, 2, 0, c0237d);
                                c0237d.f2297e.f2399e.f2382m = c0237d.i();
                            } else {
                                if (i11 == 2) {
                                    int i13 = iArr2[1];
                                    if (i13 == 1 || i13 == 4) {
                                        f(i7, c0237d.o(), 1, (int) ((f3 * eVar.i()) + 0.5f), c0237d);
                                        c0237d.f2295d.f2399e.d(c0237d.o());
                                        c0237d.f2297e.f2399e.d(c0237d.i());
                                        c0237d.f2289a = true;
                                    }
                                } else if (c0236cArr[2].f2260f == null || c0236cArr[3].f2260f == null) {
                                    f(2, 0, i9, 0, c0237d);
                                    c0237d.f2295d.f2399e.d(c0237d.o());
                                    c0237d.f2297e.f2399e.d(c0237d.i());
                                    c0237d.f2289a = true;
                                }
                                if (i7 != i6 && i9 == i6) {
                                    if (i10 == i5 || i11 == i5) {
                                        f(2, 0, 2, 0, c0237d);
                                        c0237d.f2295d.f2399e.f2382m = c0237d.o();
                                        c0237d.f2297e.f2399e.f2382m = c0237d.i();
                                    } else if (i11 == 2 && i10 == 2 && iArr2[0] == 1 && iArr2[i5] == 1) {
                                        f(1, (int) ((f2 * eVar.o()) + 0.5f), 1, (int) ((f3 * eVar.i()) + 0.5f), c0237d);
                                        c0237d.f2295d.f2399e.d(c0237d.o());
                                        c0237d.f2297e.f2399e.d(c0237d.i());
                                        c0237d.f2289a = true;
                                    }
                                }
                            }
                        }
                        i5 = 1;
                        i6 = 3;
                        if (i7 != i6) {
                        }
                    } else if (i10 == 3) {
                        if (i9 == 2) {
                            f(2, 0, 2, 0, c0237d);
                        }
                        int i14 = c0237d.i();
                        f(1, (int) ((i14 * c0237d.f2284V) + 0.5f), 1, i14, c0237d);
                        c0237d.f2295d.f2399e.d(c0237d.o());
                        c0237d.f2297e.f2399e.d(c0237d.i());
                        c0237d.f2289a = true;
                    } else if (i10 == 1) {
                        f(2, 0, i9, 0, c0237d);
                        c0237d.f2295d.f2399e.f2382m = c0237d.o();
                    } else {
                        if (i10 == 2) {
                            int i15 = iArr2[0];
                            if (i15 == 1 || i15 == 4) {
                                f(1, (int) ((f2 * eVar.o()) + 0.5f), i9, c0237d.i(), c0237d);
                                c0237d.f2295d.f2399e.d(c0237d.o());
                                c0237d.f2297e.f2399e.d(c0237d.i());
                                c0237d.f2289a = true;
                            } else {
                                i4 = 3;
                            }
                        } else if (c0236cArr[0].f2260f == null || c0236cArr[1].f2260f == null) {
                            f(2, 0, i9, 0, c0237d);
                            c0237d.f2295d.f2399e.d(c0237d.o());
                            c0237d.f2297e.f2399e.d(c0237d.i());
                            c0237d.f2289a = true;
                        } else {
                            i4 = 3;
                        }
                        if (i9 == i4) {
                        }
                        i5 = 1;
                        i6 = 3;
                        if (i7 != i6) {
                        }
                    }
                }
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.f2368e;
        arrayList.clear();
        s.e eVar = this.f2367d;
        eVar.f2295d.f();
        eVar.f2297e.f();
        arrayList.add(eVar.f2295d);
        arrayList.add(eVar.f2297e);
        Iterator it = eVar.f2336p0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C0237d c0237d = (C0237d) it.next();
            if (c0237d instanceof s.f) {
                C0246i c0246i = new C0246i(c0237d);
                c0237d.f2295d.f();
                c0237d.f2297e.f();
                c0246i.f2400f = ((s.f) c0237d).t0;
                arrayList.add(c0246i);
            } else {
                if (c0237d.v()) {
                    if (c0237d.f2291b == null) {
                        c0237d.f2291b = new C0240c(c0237d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0237d.f2291b);
                } else {
                    arrayList.add(c0237d.f2295d);
                }
                if (c0237d.w()) {
                    if (c0237d.f2293c == null) {
                        c0237d.f2293c = new C0240c(c0237d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0237d.f2293c);
                } else {
                    arrayList.add(c0237d.f2297e);
                }
                if (c0237d instanceof C0234a) {
                    arrayList.add(new C0247j(c0237d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((o) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            o oVar = (o) it3.next();
            if (oVar.f2396b != eVar) {
                oVar.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        s.e eVar2 = this.f2364a;
        e(eVar2.f2295d, 0, arrayList2);
        e(eVar2.f2297e, 1, arrayList2);
        this.f2365b = false;
    }

    public final int d(s.e eVar, int i2) {
        ArrayList arrayList;
        int i3;
        int i4;
        long jMax;
        float f2;
        s.e eVar2 = eVar;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i5 = 0;
        long jMax2 = 0;
        while (i5 < size) {
            o oVar = ((C0249l) arrayList2.get(i5)).f2385a;
            if (!(oVar instanceof C0240c) ? !(i2 != 0 ? (oVar instanceof m) : (oVar instanceof C0248k)) : ((C0240c) oVar).f2400f != i2) {
                C0243f c0243f = (i2 == 0 ? eVar2.f2295d : eVar2.f2297e).h;
                C0243f c0243f2 = (i2 == 0 ? eVar2.f2295d : eVar2.f2297e).f2402i;
                boolean zContains = oVar.h.f2381l.contains(c0243f);
                C0243f c0243f3 = oVar.f2402i;
                boolean zContains2 = c0243f3.f2381l.contains(c0243f2);
                long j2 = oVar.j();
                C0243f c0243f4 = oVar.h;
                if (zContains && zContains2) {
                    long jB = C0249l.b(c0243f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i3 = size;
                    long jA = C0249l.a(c0243f3, 0L);
                    long j3 = jB - j2;
                    int i6 = c0243f3.f2376f;
                    arrayList = arrayList3;
                    i4 = i5;
                    if (j3 >= (-i6)) {
                        j3 += i6;
                    }
                    long j4 = (-jA) - j2;
                    long j5 = c0243f4.f2376f;
                    long j6 = j4 - j5;
                    if (j6 >= j5) {
                        j6 -= j5;
                    }
                    C0237d c0237d = oVar.f2396b;
                    if (i2 == 0) {
                        f2 = c0237d.f2294c0;
                    } else if (i2 == 1) {
                        f2 = c0237d.f2296d0;
                    } else {
                        c0237d.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > 0.0f ? (long) ((j3 / (1.0f - f2)) + (j6 / f2)) : 0L;
                    jMax = (c0243f4.f2376f + ((((long) ((f3 * f2) + 0.5f)) + j2) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - c0243f3.f2376f;
                } else {
                    arrayList = arrayList2;
                    i3 = size;
                    i4 = i5;
                    jMax = zContains ? Math.max(C0249l.b(c0243f4, c0243f4.f2376f), c0243f4.f2376f + j2) : zContains2 ? Math.max(-C0249l.a(c0243f3, c0243f3.f2376f), (-c0243f3.f2376f) + j2) : (oVar.j() + c0243f4.f2376f) - c0243f3.f2376f;
                }
            } else {
                arrayList = arrayList2;
                i3 = size;
                i4 = i5;
                jMax = 0;
            }
            jMax2 = Math.max(jMax2, jMax);
            i5 = i4 + 1;
            eVar2 = eVar;
            size = i3;
            arrayList2 = arrayList;
        }
        return (int) jMax2;
    }

    public final void e(o oVar, int i2, ArrayList arrayList) {
        C0243f c0243f;
        Iterator it = oVar.h.f2380k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c0243f = oVar.f2402i;
            if (!zHasNext) {
                break;
            }
            InterfaceC0241d interfaceC0241d = (InterfaceC0241d) it.next();
            if (interfaceC0241d instanceof C0243f) {
                a((C0243f) interfaceC0241d, i2, arrayList, null);
            } else if (interfaceC0241d instanceof o) {
                a(((o) interfaceC0241d).h, i2, arrayList, null);
            }
        }
        Iterator it2 = c0243f.f2380k.iterator();
        while (it2.hasNext()) {
            InterfaceC0241d interfaceC0241d2 = (InterfaceC0241d) it2.next();
            if (interfaceC0241d2 instanceof C0243f) {
                a((C0243f) interfaceC0241d2, i2, arrayList, null);
            } else if (interfaceC0241d2 instanceof o) {
                a(((o) interfaceC0241d2).f2402i, i2, arrayList, null);
            }
        }
        if (i2 == 1) {
            Iterator it3 = ((m) oVar).f2387k.f2380k.iterator();
            while (it3.hasNext()) {
                InterfaceC0241d interfaceC0241d3 = (InterfaceC0241d) it3.next();
                if (interfaceC0241d3 instanceof C0243f) {
                    a((C0243f) interfaceC0241d3, i2, arrayList, null);
                }
            }
        }
    }

    public final void f(int i2, int i3, int i4, int i5, C0237d c0237d) {
        C0239b c0239b = this.f2370g;
        c0239b.f2353a = i2;
        c0239b.f2354b = i4;
        c0239b.f2355c = i3;
        c0239b.f2356d = i5;
        this.f2369f.b(c0237d, c0239b);
        c0237d.K(c0239b.f2357e);
        c0237d.H(c0239b.f2358f);
        c0237d.f2267E = c0239b.h;
        int i6 = c0239b.f2359g;
        c0237d.f2288Z = i6;
        c0237d.f2267E = i6 > 0;
    }

    public final void g() {
        C0238a c0238a;
        Iterator it = this.f2364a.f2336p0.iterator();
        while (it.hasNext()) {
            C0237d c0237d = (C0237d) it.next();
            if (!c0237d.f2289a) {
                int[] iArr = c0237d.f2315o0;
                boolean z2 = false;
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = c0237d.f2318r;
                int i5 = c0237d.f2319s;
                boolean z3 = i2 == 2 || (i2 == 3 && i4 == 1);
                if (i3 == 2 || (i3 == 3 && i5 == 1)) {
                    z2 = true;
                }
                C0244g c0244g = c0237d.f2295d.f2399e;
                boolean z4 = c0244g.f2379j;
                C0244g c0244g2 = c0237d.f2297e.f2399e;
                boolean z5 = c0244g2.f2379j;
                if (z4 && z5) {
                    f(1, c0244g.f2377g, 1, c0244g2.f2377g, c0237d);
                    c0237d.f2289a = true;
                } else if (z4 && z2) {
                    f(1, c0244g.f2377g, 2, c0244g2.f2377g, c0237d);
                    if (i3 == 3) {
                        c0237d.f2297e.f2399e.f2382m = c0237d.i();
                    } else {
                        c0237d.f2297e.f2399e.d(c0237d.i());
                        c0237d.f2289a = true;
                    }
                } else if (z5 && z3) {
                    f(2, c0244g.f2377g, 1, c0244g2.f2377g, c0237d);
                    if (i2 == 3) {
                        c0237d.f2295d.f2399e.f2382m = c0237d.o();
                    } else {
                        c0237d.f2295d.f2399e.d(c0237d.o());
                        c0237d.f2289a = true;
                    }
                }
                if (c0237d.f2289a && (c0238a = c0237d.f2297e.f2388l) != null) {
                    c0238a.d(c0237d.f2288Z);
                }
            }
        }
    }
}
