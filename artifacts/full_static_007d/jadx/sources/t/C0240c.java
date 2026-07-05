package t;

import java.util.ArrayList;
import java.util.Iterator;
import s.C0236c;
import s.C0237d;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240c extends o {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2362k;

    /* renamed from: l, reason: collision with root package name */
    public int f2363l;

    public C0240c(C0237d c0237d, int i2) {
        C0237d c0237d2;
        super(c0237d);
        this.f2362k = new ArrayList();
        this.f2400f = i2;
        C0237d c0237d3 = this.f2396b;
        C0237d c0237dK = c0237d3.k(i2);
        while (true) {
            C0237d c0237d4 = c0237dK;
            c0237d2 = c0237d3;
            c0237d3 = c0237d4;
            if (c0237d3 == null) {
                break;
            } else {
                c0237dK = c0237d3.k(this.f2400f);
            }
        }
        this.f2396b = c0237d2;
        int i3 = this.f2400f;
        o oVar = i3 == 0 ? c0237d2.f2295d : i3 == 1 ? c0237d2.f2297e : null;
        ArrayList arrayList = this.f2362k;
        arrayList.add(oVar);
        C0237d c0237dJ = c0237d2.j(this.f2400f);
        while (c0237dJ != null) {
            int i4 = this.f2400f;
            arrayList.add(i4 == 0 ? c0237dJ.f2295d : i4 == 1 ? c0237dJ.f2297e : null);
            c0237dJ = c0237dJ.j(this.f2400f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o oVar2 = (o) it.next();
            int i5 = this.f2400f;
            if (i5 == 0) {
                oVar2.f2396b.f2291b = this;
            } else if (i5 == 1) {
                oVar2.f2396b.f2293c = this;
            }
        }
        if (this.f2400f == 0 && ((s.e) this.f2396b.f2281S).f2340u0 && arrayList.size() > 1) {
            this.f2396b = ((o) arrayList.get(arrayList.size() - 1)).f2396b;
        }
        this.f2363l = this.f2400f == 0 ? this.f2396b.h0 : this.f2396b.f2303i0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0153  */
    @Override // t.InterfaceC0241d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0241d interfaceC0241d) {
        int i2;
        int i3;
        ArrayList arrayList;
        int i4;
        int i5;
        int i6;
        int i7;
        float f2;
        int i8;
        boolean z2;
        ArrayList arrayList2;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z3;
        int i13;
        int i14;
        int i15;
        float f3;
        int i16;
        boolean z4;
        int i17;
        C0243f c0243f = this.h;
        if (c0243f.f2379j) {
            C0243f c0243f2 = this.f2402i;
            if (c0243f2.f2379j) {
                C0237d c0237d = this.f2396b.f2281S;
                boolean z5 = c0237d instanceof s.e ? ((s.e) c0237d).f2340u0 : false;
                int i18 = c0243f2.f2377g - c0243f.f2377g;
                ArrayList arrayList3 = this.f2362k;
                int size = arrayList3.size();
                int i19 = 0;
                while (true) {
                    i2 = -1;
                    i3 = 8;
                    if (i19 >= size) {
                        i19 = -1;
                        break;
                    } else if (((o) arrayList3.get(i19)).f2396b.f2300f0 != 8) {
                        break;
                    } else {
                        i19++;
                    }
                }
                int i20 = size - 1;
                int i21 = i20;
                while (true) {
                    if (i21 < 0) {
                        break;
                    }
                    if (((o) arrayList3.get(i21)).f2396b.f2300f0 != 8) {
                        i2 = i21;
                        break;
                    }
                    i21--;
                }
                int i22 = 0;
                while (i22 < 2) {
                    int i23 = 0;
                    i7 = 0;
                    int i24 = 0;
                    int i25 = 0;
                    f2 = 0.0f;
                    while (i23 < size) {
                        o oVar = (o) arrayList3.get(i23);
                        C0237d c0237d2 = oVar.f2396b;
                        ArrayList arrayList4 = arrayList3;
                        if (c0237d2.f2300f0 == i3) {
                            i16 = i19;
                        } else {
                            i25++;
                            if (i23 > 0 && i23 >= i19) {
                                i7 += oVar.h.f2376f;
                            }
                            C0244g c0244g = oVar.f2399e;
                            int i26 = c0244g.f2377g;
                            i16 = i19;
                            boolean z6 = oVar.f2398d != 3;
                            if (z6) {
                                int i27 = this.f2400f;
                                if (i27 == 0 && !c0237d2.f2295d.f2399e.f2379j) {
                                    return;
                                }
                                if (i27 == 1 && !c0237d2.f2297e.f2399e.f2379j) {
                                    return;
                                } else {
                                    z4 = z6;
                                }
                            } else {
                                z4 = z6;
                                if (oVar.f2395a == 1 && i22 == 0) {
                                    i17 = c0244g.f2382m;
                                    i24++;
                                } else if (c0244g.f2379j) {
                                    i17 = i26;
                                }
                                z4 = true;
                                if (z4) {
                                    i24++;
                                    float f4 = c0237d2.f2305j0[this.f2400f];
                                    if (f4 >= 0.0f) {
                                        f2 += f4;
                                    }
                                } else {
                                    i7 += i17;
                                }
                                if (i23 >= i20 && i23 < i2) {
                                    i7 += -oVar.f2402i.f2376f;
                                }
                            }
                            i17 = i26;
                            if (z4) {
                            }
                            if (i23 >= i20) {
                            }
                        }
                        i23++;
                        arrayList3 = arrayList4;
                        i19 = i16;
                        i3 = 8;
                    }
                    arrayList = arrayList3;
                    i4 = i19;
                    if (i7 < i18 || i24 == 0) {
                        i5 = i24;
                        i6 = i25;
                        break;
                    } else {
                        i22++;
                        arrayList3 = arrayList;
                        i19 = i4;
                        i3 = 8;
                    }
                }
                arrayList = arrayList3;
                i4 = i19;
                i5 = 0;
                i6 = 0;
                i7 = 0;
                f2 = 0.0f;
                int i28 = c0243f.f2377g;
                if (z5) {
                    i28 = c0243f2.f2377g;
                }
                if (i7 > i18) {
                    i28 = z5 ? i28 + ((int) (((i7 - i18) / 2.0f) + 0.5f)) : i28 - ((int) (((i7 - i18) / 2.0f) + 0.5f));
                }
                if (i5 > 0) {
                    float f5 = i18 - i7;
                    int i29 = (int) ((f5 / i5) + 0.5f);
                    int i30 = 0;
                    int i31 = 0;
                    while (i30 < size) {
                        ArrayList arrayList5 = arrayList;
                        o oVar2 = (o) arrayList5.get(i30);
                        int i32 = i29;
                        C0237d c0237d3 = oVar2.f2396b;
                        int i33 = i7;
                        int i34 = i28;
                        if (c0237d3.f2300f0 != 8 && oVar2.f2398d == 3) {
                            C0244g c0244g2 = oVar2.f2399e;
                            if (c0244g2.f2379j) {
                                z3 = z5;
                                f3 = f5;
                            } else {
                                if (f2 > 0.0f) {
                                    z3 = z5;
                                    i13 = (int) (((c0237d3.f2305j0[this.f2400f] * f5) / f2) + 0.5f);
                                } else {
                                    z3 = z5;
                                    i13 = i32;
                                }
                                if (this.f2400f == 0) {
                                    i14 = c0237d3.f2322v;
                                    i15 = c0237d3.f2321u;
                                } else {
                                    i14 = c0237d3.y;
                                    i15 = c0237d3.f2324x;
                                }
                                f3 = f5;
                                int iMax = Math.max(i15, oVar2.f2395a == 1 ? Math.min(i13, c0244g2.f2382m) : i13);
                                if (i14 > 0) {
                                    iMax = Math.min(i14, iMax);
                                }
                                if (iMax != i13) {
                                    i31++;
                                    i13 = iMax;
                                }
                                c0244g2.d(i13);
                            }
                        }
                        i30++;
                        i29 = i32;
                        i7 = i33;
                        i28 = i34;
                        z5 = z3;
                        f5 = f3;
                        arrayList = arrayList5;
                    }
                    i8 = i28;
                    z2 = z5;
                    arrayList2 = arrayList;
                    int i35 = i7;
                    if (i31 > 0) {
                        i5 -= i31;
                        int i36 = 0;
                        i7 = 0;
                        while (i36 < size) {
                            o oVar3 = (o) arrayList2.get(i36);
                            if (oVar3.f2396b.f2300f0 == 8) {
                                i12 = i4;
                            } else {
                                i12 = i4;
                                if (i36 > 0 && i36 >= i12) {
                                    i7 += oVar3.h.f2376f;
                                }
                                i7 += oVar3.f2399e.f2377g;
                                if (i36 < i20 && i36 < i2) {
                                    i7 += -oVar3.f2402i.f2376f;
                                }
                            }
                            i36++;
                            i4 = i12;
                        }
                        i9 = i4;
                    } else {
                        i9 = i4;
                        i7 = i35;
                    }
                    i11 = 2;
                    if (this.f2363l == 2 && i31 == 0) {
                        i10 = 0;
                        this.f2363l = 0;
                    } else {
                        i10 = 0;
                    }
                } else {
                    i8 = i28;
                    z2 = z5;
                    arrayList2 = arrayList;
                    i9 = i4;
                    i10 = 0;
                    i11 = 2;
                }
                if (i7 > i18) {
                    this.f2363l = i11;
                }
                if (i6 > 0 && i5 == 0 && i9 == i2) {
                    this.f2363l = i11;
                }
                int i37 = this.f2363l;
                if (i37 == 1) {
                    int i38 = i6 > 1 ? (i18 - i7) / (i6 - 1) : i6 == 1 ? (i18 - i7) / 2 : i10;
                    if (i5 > 0) {
                        i38 = i10;
                    }
                    int i39 = i8;
                    for (int i40 = i10; i40 < size; i40++) {
                        o oVar4 = (o) arrayList2.get(z2 ? size - (i40 + 1) : i40);
                        int i41 = oVar4.f2396b.f2300f0;
                        C0243f c0243f3 = oVar4.f2402i;
                        C0243f c0243f4 = oVar4.h;
                        if (i41 == 8) {
                            c0243f4.d(i39);
                            c0243f3.d(i39);
                        } else {
                            if (i40 > 0) {
                                i39 = z2 ? i39 - i38 : i39 + i38;
                            }
                            if (i40 > 0 && i40 >= i9) {
                                i39 = z2 ? i39 - c0243f4.f2376f : i39 + c0243f4.f2376f;
                            }
                            if (z2) {
                                c0243f3.d(i39);
                            } else {
                                c0243f4.d(i39);
                            }
                            C0244g c0244g3 = oVar4.f2399e;
                            int i42 = c0244g3.f2377g;
                            if (oVar4.f2398d == 3 && oVar4.f2395a == 1) {
                                i42 = c0244g3.f2382m;
                            }
                            i39 = z2 ? i39 - i42 : i39 + i42;
                            if (z2) {
                                c0243f4.d(i39);
                            } else {
                                c0243f3.d(i39);
                            }
                            oVar4.f2401g = true;
                            if (i40 < i20 && i40 < i2) {
                                i39 = z2 ? i39 - (-c0243f3.f2376f) : i39 + (-c0243f3.f2376f);
                            }
                        }
                    }
                    return;
                }
                if (i37 == 0) {
                    int i43 = (i18 - i7) / (i6 + 1);
                    if (i5 > 0) {
                        i43 = i10;
                    }
                    int i44 = i8;
                    for (int i45 = i10; i45 < size; i45++) {
                        o oVar5 = (o) arrayList2.get(z2 ? size - (i45 + 1) : i45);
                        int i46 = oVar5.f2396b.f2300f0;
                        C0243f c0243f5 = oVar5.f2402i;
                        C0243f c0243f6 = oVar5.h;
                        if (i46 == 8) {
                            c0243f6.d(i44);
                            c0243f5.d(i44);
                        } else {
                            int i47 = z2 ? i44 - i43 : i44 + i43;
                            if (i45 > 0 && i45 >= i9) {
                                i47 = z2 ? i47 - c0243f6.f2376f : i47 + c0243f6.f2376f;
                            }
                            if (z2) {
                                c0243f5.d(i47);
                            } else {
                                c0243f6.d(i47);
                            }
                            C0244g c0244g4 = oVar5.f2399e;
                            int iMin = c0244g4.f2377g;
                            if (oVar5.f2398d == 3 && oVar5.f2395a == 1) {
                                iMin = Math.min(iMin, c0244g4.f2382m);
                            }
                            i44 = z2 ? i47 - iMin : i47 + iMin;
                            if (z2) {
                                c0243f6.d(i44);
                            } else {
                                c0243f5.d(i44);
                            }
                            if (i45 < i20 && i45 < i2) {
                                i44 = z2 ? i44 - (-c0243f5.f2376f) : i44 + (-c0243f5.f2376f);
                            }
                        }
                    }
                    return;
                }
                if (i37 == 2) {
                    float f6 = this.f2400f == 0 ? this.f2396b.f2294c0 : this.f2396b.f2296d0;
                    if (z2) {
                        f6 = 1.0f - f6;
                    }
                    int i48 = (int) (((i18 - i7) * f6) + 0.5f);
                    if (i48 < 0 || i5 > 0) {
                        i48 = i10;
                    }
                    int i49 = z2 ? i8 - i48 : i8 + i48;
                    for (int i50 = i10; i50 < size; i50++) {
                        o oVar6 = (o) arrayList2.get(z2 ? size - (i50 + 1) : i50);
                        int i51 = oVar6.f2396b.f2300f0;
                        C0243f c0243f7 = oVar6.f2402i;
                        C0243f c0243f8 = oVar6.h;
                        if (i51 == 8) {
                            c0243f8.d(i49);
                            c0243f7.d(i49);
                        } else {
                            if (i50 > 0 && i50 >= i9) {
                                i49 = z2 ? i49 - c0243f8.f2376f : i49 + c0243f8.f2376f;
                            }
                            if (z2) {
                                c0243f7.d(i49);
                            } else {
                                c0243f8.d(i49);
                            }
                            C0244g c0244g5 = oVar6.f2399e;
                            int i52 = c0244g5.f2377g;
                            if (oVar6.f2398d == 3 && oVar6.f2395a == 1) {
                                i52 = c0244g5.f2382m;
                            }
                            i49 = z2 ? i49 - i52 : i49 + i52;
                            if (z2) {
                                c0243f8.d(i49);
                            } else {
                                c0243f7.d(i49);
                            }
                            if (i50 < i20 && i50 < i2) {
                                i49 = z2 ? i49 - (-c0243f7.f2376f) : i49 + (-c0243f7.f2376f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // t.o
    public final void d() {
        ArrayList arrayList = this.f2362k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((o) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C0237d c0237d = ((o) arrayList.get(0)).f2396b;
        C0237d c0237d2 = ((o) arrayList.get(size - 1)).f2396b;
        int i2 = this.f2400f;
        C0243f c0243f = this.f2402i;
        C0243f c0243f2 = this.h;
        if (i2 == 0) {
            C0236c c0236c = c0237d.f2270H;
            C0236c c0236c2 = c0237d2.f2272J;
            C0243f c0243fI = o.i(c0236c, 0);
            int iD = c0236c.d();
            C0237d c0237dM = m();
            if (c0237dM != null) {
                iD = c0237dM.f2270H.d();
            }
            if (c0243fI != null) {
                o.b(c0243f2, c0243fI, iD);
            }
            C0243f c0243fI2 = o.i(c0236c2, 0);
            int iD2 = c0236c2.d();
            C0237d c0237dN = n();
            if (c0237dN != null) {
                iD2 = c0237dN.f2272J.d();
            }
            if (c0243fI2 != null) {
                o.b(c0243f, c0243fI2, -iD2);
            }
        } else {
            C0236c c0236c3 = c0237d.f2271I;
            C0236c c0236c4 = c0237d2.f2273K;
            C0243f c0243fI3 = o.i(c0236c3, 1);
            int iD3 = c0236c3.d();
            C0237d c0237dM2 = m();
            if (c0237dM2 != null) {
                iD3 = c0237dM2.f2271I.d();
            }
            if (c0243fI3 != null) {
                o.b(c0243f2, c0243fI3, iD3);
            }
            C0243f c0243fI4 = o.i(c0236c4, 1);
            int iD4 = c0236c4.d();
            C0237d c0237dN2 = n();
            if (c0237dN2 != null) {
                iD4 = c0237dN2.f2273K.d();
            }
            if (c0243fI4 != null) {
                o.b(c0243f, c0243fI4, -iD4);
            }
        }
        c0243f2.f2371a = this;
        c0243f.f2371a = this;
    }

    @Override // t.o
    public final void e() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f2362k;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((o) arrayList.get(i2)).e();
            i2++;
        }
    }

    @Override // t.o
    public final void f() {
        this.f2397c = null;
        Iterator it = this.f2362k.iterator();
        while (it.hasNext()) {
            ((o) it.next()).f();
        }
    }

    @Override // t.o
    public final long j() {
        ArrayList arrayList = this.f2362k;
        int size = arrayList.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j2 = r5.f2402i.f2376f + ((o) arrayList.get(i2)).j() + j2 + r5.h.f2376f;
        }
        return j2;
    }

    @Override // t.o
    public final boolean k() {
        ArrayList arrayList = this.f2362k;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!((o) arrayList.get(i2)).k()) {
                return false;
            }
        }
        return true;
    }

    public final C0237d m() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f2362k;
            if (i2 >= arrayList.size()) {
                return null;
            }
            C0237d c0237d = ((o) arrayList.get(i2)).f2396b;
            if (c0237d.f2300f0 != 8) {
                return c0237d;
            }
            i2++;
        }
    }

    public final C0237d n() {
        ArrayList arrayList = this.f2362k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0237d c0237d = ((o) arrayList.get(size)).f2396b;
            if (c0237d.f2300f0 != 8) {
                return c0237d;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f2400f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f2362k.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            sb.append("<");
            sb.append(oVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
