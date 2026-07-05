package s;

import java.util.ArrayList;
import q.C0231b;
import q.C0232c;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f2351a = new boolean[3];

    /* JADX WARN: Removed duplicated region for block: B:184:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x069f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x06ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0707 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(e eVar, C0232c c0232c, ArrayList arrayList, int i2) {
        int i3;
        C0235b[] c0235bArr;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        float f2;
        C0237d c0237d;
        boolean z4;
        boolean z5;
        C0236c[] c0236cArr;
        int i6;
        C0235b[] c0235bArr2;
        C0237d c0237d2;
        int i7;
        int i8;
        int i9;
        C0237d c0237d3;
        int i10;
        int i11;
        C0237d c0237d4;
        q.g gVar;
        q.g gVar2;
        C0236c c0236c;
        C0236c c0236c2;
        q.g gVar3;
        C0237d c0237d5;
        C0237d c0237d6;
        C0237d c0237d7;
        C0237d c0237d8;
        q.g gVar4;
        int size;
        ArrayList arrayList2;
        int i12;
        float f3;
        C0237d c0237d9;
        boolean z6;
        C0237d c0237d10;
        C0235b c0235b;
        C0237d c0237d11;
        C0237d c0237d12;
        int i13;
        int i14;
        C0237d c0237d13;
        e eVar2 = eVar;
        ArrayList arrayList3 = arrayList;
        int i15 = 2;
        if (i2 == 0) {
            i3 = eVar2.f2344y0;
            c0235bArr = eVar2.f2327B0;
            i4 = 0;
        } else {
            i3 = eVar2.f2345z0;
            c0235bArr = eVar2.f2326A0;
            i4 = 2;
        }
        int i16 = 0;
        while (i16 < i3) {
            C0235b c0235b2 = c0235bArr[i16];
            boolean z7 = c0235b2.f2254q;
            C0237d c0237d14 = c0235b2.f2239a;
            int i17 = 3;
            int i18 = 1;
            int i19 = 8;
            if (z7) {
                i5 = i16;
                z2 = true;
            } else {
                int i20 = c0235b2.f2249l;
                int i21 = i20 * 2;
                C0237d c0237d15 = c0237d14;
                C0237d c0237d16 = c0237d15;
                boolean z8 = false;
                while (!z8) {
                    c0235b2.f2246i += i18;
                    c0237d15.f2309l0[i20] = null;
                    c0237d15.f2307k0[i20] = null;
                    int i22 = c0237d15.f2300f0;
                    C0236c[] c0236cArr2 = c0237d15.f2278P;
                    if (i22 != i19) {
                        c0237d15.h(i20);
                        c0236cArr2[i21].d();
                        int i23 = i21 + 1;
                        c0236cArr2[i23].d();
                        c0236cArr2[i21].d();
                        c0236cArr2[i23].d();
                        if (c0235b2.f2240b == null) {
                            c0235b2.f2240b = c0237d15;
                        }
                        c0235b2.f2242d = c0237d15;
                        int i24 = c0237d15.f2315o0[i20];
                        if (i24 == i17) {
                            int i25 = c0237d15.f2320t[i20];
                            if (i25 == 0 || i25 == i17 || i25 == i15) {
                                c0235b2.f2247j++;
                                float f4 = c0237d15.f2305j0[i20];
                                if (f4 > 0.0f) {
                                    c0235b2.f2248k += f4;
                                }
                                i14 = i16;
                                if (c0237d15.f2300f0 != 8 && i24 == 3 && (i25 == 0 || i25 == 3)) {
                                    if (f4 < 0.0f) {
                                        c0235b2.f2251n = true;
                                    } else {
                                        c0235b2.f2252o = true;
                                    }
                                    if (c0235b2.h == null) {
                                        c0235b2.h = new ArrayList();
                                    }
                                    c0235b2.h.add(c0237d15);
                                }
                                if (c0235b2.f2244f == null) {
                                    c0235b2.f2244f = c0237d15;
                                }
                                C0237d c0237d17 = c0235b2.f2245g;
                                if (c0237d17 != null) {
                                    c0237d17.f2307k0[i20] = c0237d15;
                                }
                                c0235b2.f2245g = c0237d15;
                            } else {
                                i14 = i16;
                            }
                            if (i20 == 0) {
                                if (c0237d15.f2318r == 0 && c0237d15.f2321u == 0) {
                                    int i26 = c0237d15.f2322v;
                                }
                            } else if (c0237d15.f2319s == 0 && c0237d15.f2324x == 0) {
                                int i27 = c0237d15.y;
                            }
                        } else {
                            i14 = i16;
                        }
                    }
                    C0237d c0237d18 = c0237d16;
                    if (c0237d18 != c0237d15) {
                        c0237d18.f2309l0[i20] = c0237d15;
                    }
                    C0236c c0236c3 = c0236cArr2[i21 + 1].f2260f;
                    if (c0236c3 != null) {
                        c0237d13 = c0236c3.f2258d;
                        C0236c c0236c4 = c0237d13.f2278P[i21].f2260f;
                        if (c0236c4 == null || c0236c4.f2258d != c0237d15) {
                            c0237d13 = null;
                        }
                    }
                    if (c0237d13 == null) {
                        c0237d13 = c0237d15;
                        z8 = true;
                    }
                    c0237d16 = c0237d15;
                    i16 = i14;
                    i18 = 1;
                    i19 = 8;
                    i15 = 2;
                    c0237d15 = c0237d13;
                    i17 = 3;
                }
                i5 = i16;
                C0237d c0237d19 = c0235b2.f2240b;
                if (c0237d19 != null) {
                    c0237d19.f2278P[i21].d();
                }
                C0237d c0237d20 = c0235b2.f2242d;
                if (c0237d20 != null) {
                    c0237d20.f2278P[i21 + 1].d();
                }
                c0235b2.f2241c = c0237d15;
                if (i20 == 0 && c0235b2.f2250m) {
                    c0235b2.f2243e = c0237d15;
                } else {
                    c0235b2.f2243e = c0237d14;
                }
                c0235b2.f2253p = c0235b2.f2252o && c0235b2.f2251n;
                z2 = true;
            }
            c0235b2.f2254q = z2;
            if (arrayList3 == null || arrayList3.contains(c0237d14)) {
                C0237d c0237d21 = c0235b2.f2241c;
                C0237d c0237d22 = c0235b2.f2240b;
                C0237d c0237d23 = c0235b2.f2242d;
                C0237d c0237d24 = c0235b2.f2243e;
                float f5 = c0235b2.f2248k;
                boolean z9 = eVar2.f2315o0[i2] == 2;
                if (i2 == 0) {
                    int i28 = c0237d24.h0;
                    boolean z10 = i28 == 0;
                    z5 = i28 == 1;
                    z3 = i28 == 2;
                    f2 = f5;
                    c0237d = c0237d14;
                    z4 = z10;
                } else {
                    int i29 = c0237d24.f2303i0;
                    boolean z11 = i29 == 0;
                    boolean z12 = i29 == 1;
                    z3 = i29 == 2;
                    f2 = f5;
                    c0237d = c0237d14;
                    z4 = z11;
                    z5 = z12;
                }
                boolean z13 = false;
                while (true) {
                    c0236cArr = eVar2.f2278P;
                    if (z13) {
                        break;
                    }
                    C0236c c0236c5 = c0237d.f2278P[i4];
                    int i30 = z3 ? 1 : 4;
                    int iD = c0236c5.d();
                    boolean z14 = z13;
                    int[] iArr = c0237d.f2315o0;
                    int i31 = i3;
                    C0235b[] c0235bArr3 = c0235bArr;
                    boolean z15 = iArr[i2] == 3 && c0237d.f2320t[i2] == 0;
                    C0236c c0236c6 = c0236c5.f2260f;
                    if (c0236c6 != null && c0237d != c0237d14) {
                        iD = c0236c6.d() + iD;
                    }
                    int i32 = iD;
                    if (!z3 || c0237d == c0237d14 || c0237d == c0237d22) {
                        c0237d10 = c0237d24;
                    } else {
                        c0237d10 = c0237d24;
                        i30 = 8;
                    }
                    C0236c c0236c7 = c0236c5.f2260f;
                    if (c0236c7 != null) {
                        if (c0237d == c0237d22) {
                            c0237d11 = c0237d14;
                            c0235b = c0235b2;
                            c0232c.f(c0236c5.f2262i, c0236c7.f2262i, i32, 6);
                        } else {
                            c0235b = c0235b2;
                            c0237d11 = c0237d14;
                            c0232c.f(c0236c5.f2262i, c0236c7.f2262i, i32, 8);
                        }
                        if (z15 && !z3) {
                            i30 = 5;
                        }
                        c0232c.e(c0236c5.f2262i, c0236c5.f2260f.f2262i, i32, (c0237d == c0237d22 && z3 && c0237d.f2280R[i2]) ? 5 : i30);
                    } else {
                        c0235b = c0235b2;
                        c0237d11 = c0237d14;
                    }
                    C0236c[] c0236cArr3 = c0237d.f2278P;
                    if (z9) {
                        if (c0237d.f2300f0 == 8 || iArr[i2] != 3) {
                            i13 = 0;
                        } else {
                            i13 = 0;
                            c0232c.f(c0236cArr3[i4 + 1].f2262i, c0236cArr3[i4].f2262i, 0, 5);
                        }
                        c0232c.f(c0236cArr3[i4].f2262i, c0236cArr[i4].f2262i, i13, 8);
                    }
                    C0236c c0236c8 = c0236cArr3[i4 + 1].f2260f;
                    if (c0236c8 != null) {
                        c0237d12 = c0236c8.f2258d;
                        C0236c c0236c9 = c0237d12.f2278P[i4].f2260f;
                        if (c0236c9 == null || c0236c9.f2258d != c0237d) {
                            c0237d12 = null;
                        }
                    }
                    if (c0237d12 != null) {
                        c0237d = c0237d12;
                        z13 = z14;
                    } else {
                        z13 = true;
                    }
                    c0237d24 = c0237d10;
                    i3 = i31;
                    c0235bArr = c0235bArr3;
                    c0237d14 = c0237d11;
                    c0235b2 = c0235b;
                }
                C0235b c0235b3 = c0235b2;
                C0237d c0237d25 = c0237d24;
                C0237d c0237d26 = c0237d14;
                i6 = i3;
                c0235bArr2 = c0235bArr;
                if (c0237d23 != null) {
                    int i33 = i4 + 1;
                    if (c0237d21.f2278P[i33].f2260f != null) {
                        C0236c c0236c10 = c0237d23.f2278P[i33];
                        if (c0237d23.f2315o0[i2] == 3 && c0237d23.f2320t[i2] == 0 && !z3) {
                            C0236c c0236c11 = c0236c10.f2260f;
                            if (c0236c11.f2258d == eVar2) {
                                c0232c.e(c0236c10.f2262i, c0236c11.f2262i, -c0236c10.d(), 5);
                            }
                            c0232c.g(c0236c10.f2262i, c0237d21.f2278P[i33].f2260f.f2262i, -c0236c10.d(), 6);
                        } else {
                            if (z3) {
                                C0236c c0236c12 = c0236c10.f2260f;
                                if (c0236c12.f2258d == eVar2) {
                                    c0232c.e(c0236c10.f2262i, c0236c12.f2262i, -c0236c10.d(), 4);
                                }
                            }
                            c0232c.g(c0236c10.f2262i, c0237d21.f2278P[i33].f2260f.f2262i, -c0236c10.d(), 6);
                        }
                    }
                    if (z9) {
                        int i34 = i4 + 1;
                        q.g gVar5 = c0236cArr[i34].f2262i;
                        C0236c c0236c13 = c0237d21.f2278P[i34];
                        c0232c.f(gVar5, c0236c13.f2262i, c0236c13.d(), 8);
                    }
                    ArrayList arrayList4 = c0235b3.h;
                    if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                        float f6 = (!c0235b3.f2251n || c0235b3.f2253p) ? f2 : c0235b3.f2247j;
                        C0237d c0237d27 = null;
                        float f7 = 0.0f;
                        int i35 = 0;
                        while (i35 < size) {
                            C0237d c0237d28 = (C0237d) arrayList4.get(i35);
                            float f8 = c0237d28.f2305j0[i2];
                            C0236c[] c0236cArr4 = c0237d28.f2278P;
                            if (f8 < 0.0f) {
                                if (c0235b3.f2253p) {
                                    q.g gVar6 = c0236cArr4[i4 + 1].f2262i;
                                    q.g gVar7 = c0236cArr4[i4].f2262i;
                                    z6 = false;
                                    c0232c.e(gVar6, gVar7, 0, 4);
                                    arrayList2 = arrayList4;
                                    i12 = size;
                                    i35++;
                                    size = i12;
                                    arrayList4 = arrayList2;
                                } else {
                                    f8 = 1.0f;
                                }
                            }
                            if (f8 == 0.0f) {
                                q.g gVar8 = c0236cArr4[i4 + 1].f2262i;
                                q.g gVar9 = c0236cArr4[i4].f2262i;
                                z6 = false;
                                c0232c.e(gVar8, gVar9, 0, 8);
                                arrayList2 = arrayList4;
                                i12 = size;
                                i35++;
                                size = i12;
                                arrayList4 = arrayList2;
                            } else {
                                if (c0237d27 != null) {
                                    C0236c[] c0236cArr5 = c0237d27.f2278P;
                                    q.g gVar10 = c0236cArr5[i4].f2262i;
                                    int i36 = i4 + 1;
                                    q.g gVar11 = c0236cArr5[i36].f2262i;
                                    arrayList2 = arrayList4;
                                    q.g gVar12 = c0236cArr4[i4].f2262i;
                                    q.g gVar13 = c0236cArr4[i36].f2262i;
                                    i12 = size;
                                    C0231b c0231bL = c0232c.l();
                                    c0237d9 = c0237d28;
                                    c0231bL.f2185b = 0.0f;
                                    if (f6 == 0.0f || f7 == f8) {
                                        f3 = f8;
                                        c0231bL.f2187d.g(gVar10, 1.0f);
                                        c0231bL.f2187d.g(gVar11, -1.0f);
                                        c0231bL.f2187d.g(gVar13, 1.0f);
                                        c0231bL.f2187d.g(gVar12, -1.0f);
                                    } else {
                                        if (f7 == 0.0f) {
                                            c0231bL.f2187d.g(gVar10, 1.0f);
                                            c0231bL.f2187d.g(gVar11, -1.0f);
                                        } else if (f8 == 0.0f) {
                                            c0231bL.f2187d.g(gVar12, 1.0f);
                                            c0231bL.f2187d.g(gVar13, -1.0f);
                                        } else {
                                            float f9 = (f7 / f6) / (f8 / f6);
                                            f3 = f8;
                                            c0231bL.f2187d.g(gVar10, 1.0f);
                                            c0231bL.f2187d.g(gVar11, -1.0f);
                                            c0231bL.f2187d.g(gVar13, f9);
                                            c0231bL.f2187d.g(gVar12, -f9);
                                        }
                                        f3 = f8;
                                    }
                                    c0232c.c(c0231bL);
                                } else {
                                    arrayList2 = arrayList4;
                                    i12 = size;
                                    f3 = f8;
                                    c0237d9 = c0237d28;
                                }
                                f7 = f3;
                                c0237d27 = c0237d9;
                                i35++;
                                size = i12;
                                arrayList4 = arrayList2;
                            }
                        }
                    }
                    if (c0237d22 == null || !(c0237d22 == c0237d23 || z3)) {
                        c0237d2 = c0237d23;
                        i7 = i5;
                        if (!z4 || c0237d22 == null) {
                            int i37 = 8;
                            if (z5 && c0237d22 != null) {
                                int i38 = c0235b3.f2247j;
                                boolean z16 = i38 > 0 && c0235b3.f2246i == i38;
                                C0237d c0237d29 = c0237d22;
                                C0237d c0237d30 = c0237d29;
                                while (c0237d30 != null) {
                                    C0237d c0237d31 = c0237d30.f2309l0[i2];
                                    while (c0237d31 != null && c0237d31.f2300f0 == i37) {
                                        c0237d31 = c0237d31.f2309l0[i2];
                                    }
                                    if (c0237d30 == c0237d22 || c0237d30 == c0237d2 || c0237d31 == null) {
                                        c0237d3 = c0237d29;
                                        i10 = i7;
                                        i11 = i37;
                                    } else {
                                        C0237d c0237d32 = c0237d31 == c0237d2 ? null : c0237d31;
                                        C0236c[] c0236cArr6 = c0237d30.f2278P;
                                        C0236c c0236c14 = c0236cArr6[i4];
                                        q.g gVar14 = c0236c14.f2262i;
                                        int i39 = i4 + 1;
                                        q.g gVar15 = c0237d29.f2278P[i39].f2262i;
                                        int iD2 = c0236c14.d();
                                        int iD3 = c0236cArr6[i39].d();
                                        if (c0237d32 != null) {
                                            c0236c = c0237d32.f2278P[i4];
                                            gVar = c0236c.f2262i;
                                            c0237d4 = c0237d32;
                                            C0236c c0236c15 = c0236c.f2260f;
                                            gVar2 = c0236c15 != null ? c0236c15.f2262i : null;
                                        } else {
                                            c0237d4 = c0237d32;
                                            C0236c c0236c16 = c0237d2.f2278P[i4];
                                            gVar = c0236c16 != null ? c0236c16.f2262i : null;
                                            gVar2 = c0236cArr6[i39].f2262i;
                                            c0236c = c0236c16;
                                        }
                                        int iD4 = c0236c != null ? c0236c.d() + iD3 : iD3;
                                        int iD5 = c0237d29.f2278P[i39].d() + iD2;
                                        int i40 = z16 ? 8 : 4;
                                        if (gVar14 == null || gVar15 == null || gVar == null || gVar2 == null) {
                                            c0237d3 = c0237d29;
                                            i10 = i7;
                                            i11 = 8;
                                        } else {
                                            c0237d3 = c0237d29;
                                            int i41 = iD4;
                                            i10 = i7;
                                            i11 = 8;
                                            c0232c.b(gVar14, gVar15, iD5, 0.5f, gVar, gVar2, i41, i40);
                                        }
                                        c0237d31 = c0237d4;
                                    }
                                    c0237d29 = c0237d30.f2300f0 != i11 ? c0237d30 : c0237d3;
                                    c0237d30 = c0237d31;
                                    i37 = i11;
                                    i7 = i10;
                                }
                                i8 = i7;
                                C0236c c0236c17 = c0237d22.f2278P[i4];
                                C0236c c0236c18 = c0237d26.f2278P[i4].f2260f;
                                int i42 = i4 + 1;
                                C0236c c0236c19 = c0237d2.f2278P[i42];
                                C0236c c0236c20 = c0237d21.f2278P[i42].f2260f;
                                if (c0236c18 == null) {
                                    i9 = 5;
                                    if (c0236c20 != null && c0237d22 != c0237d2) {
                                        c0232c.e(c0236c19.f2262i, c0236c20.f2262i, -c0236c19.d(), i9);
                                    }
                                } else {
                                    if (c0237d22 != c0237d2) {
                                        c0232c.e(c0236c17.f2262i, c0236c18.f2262i, c0236c17.d(), 5);
                                    } else {
                                        if (c0236c20 != null) {
                                            i9 = 5;
                                            c0232c.b(c0236c17.f2262i, c0236c18.f2262i, c0236c17.d(), 0.5f, c0236c19.f2262i, c0236c20.f2262i, c0236c19.d(), 5);
                                        }
                                        if (c0236c20 != null) {
                                            c0232c.e(c0236c19.f2262i, c0236c20.f2262i, -c0236c19.d(), i9);
                                        }
                                    }
                                    i9 = 5;
                                    if (c0236c20 != null) {
                                    }
                                }
                            }
                            if ((z4 || z5) && c0237d22 != null && c0237d22 != c0237d2) {
                                C0236c[] c0236cArr7 = c0237d22.f2278P;
                                C0236c c0236c21 = c0236cArr7[i4];
                                c0237d8 = c0237d2 == null ? c0237d22 : c0237d2;
                                int i43 = i4 + 1;
                                C0236c[] c0236cArr8 = c0237d8.f2278P;
                                C0236c c0236c22 = c0236cArr8[i43];
                                C0236c c0236c23 = c0236c21.f2260f;
                                gVar4 = c0236c23 != null ? c0236c23.f2262i : null;
                                C0236c c0236c24 = c0236c22.f2260f;
                                q.g gVar16 = c0236c24 != null ? c0236c24.f2262i : null;
                                if (c0237d21 != c0237d8) {
                                    C0236c c0236c25 = c0237d21.f2278P[i43].f2260f;
                                    gVar16 = c0236c25 != null ? c0236c25.f2262i : null;
                                }
                                if (c0237d22 == c0237d8) {
                                    c0236c22 = c0236cArr7[i43];
                                }
                                if (gVar4 != null && gVar16 != null) {
                                    c0232c.b(c0236c21.f2262i, gVar4, c0236c21.d(), 0.5f, gVar16, c0236c22.f2262i, c0236cArr8[i43].d(), 5);
                                }
                            }
                        } else {
                            int i44 = c0235b3.f2247j;
                            boolean z17 = i44 > 0 && c0235b3.f2246i == i44;
                            C0237d c0237d33 = c0237d22;
                            for (C0237d c0237d34 = c0237d33; c0237d34 != null; c0237d34 = c0237d6) {
                                C0237d c0237d35 = c0237d34.f2309l0[i2];
                                while (c0237d35 != null && c0237d35.f2300f0 == 8) {
                                    c0237d35 = c0237d35.f2309l0[i2];
                                }
                                if (c0237d35 != null || c0237d34 == c0237d2) {
                                    C0236c[] c0236cArr9 = c0237d34.f2278P;
                                    C0236c c0236c26 = c0236cArr9[i4];
                                    q.g gVar17 = c0236c26.f2262i;
                                    C0236c c0236c27 = c0236c26.f2260f;
                                    q.g gVar18 = c0236c27 != null ? c0236c27.f2262i : null;
                                    if (c0237d33 != c0237d34) {
                                        gVar18 = c0237d33.f2278P[i4 + 1].f2262i;
                                    } else if (c0237d34 == c0237d22) {
                                        C0236c c0236c28 = c0237d26.f2278P[i4].f2260f;
                                        gVar18 = c0236c28 != null ? c0236c28.f2262i : null;
                                    }
                                    int iD6 = c0236c26.d();
                                    int i45 = i4 + 1;
                                    int iD7 = c0236cArr9[i45].d();
                                    if (c0237d35 != null) {
                                        c0236c2 = c0237d35.f2278P[i4];
                                        gVar3 = c0236c2.f2262i;
                                    } else {
                                        c0236c2 = c0237d21.f2278P[i45].f2260f;
                                        gVar3 = c0236c2 != null ? c0236c2.f2262i : null;
                                    }
                                    q.g gVar19 = c0236cArr9[i45].f2262i;
                                    if (c0236c2 != null) {
                                        iD7 = c0236c2.d() + iD7;
                                    }
                                    int iD8 = c0237d33.f2278P[i45].d() + iD6;
                                    if (gVar17 == null || gVar18 == null || gVar3 == null || gVar19 == null) {
                                        c0237d6 = c0237d35;
                                        c0237d5 = c0237d33;
                                        c0237d7 = c0237d34;
                                    } else {
                                        if (c0237d34 == c0237d22) {
                                            iD8 = c0237d22.f2278P[i4].d();
                                        }
                                        if (c0237d34 == c0237d2) {
                                            iD7 = c0237d2.f2278P[i45].d();
                                        }
                                        q.g gVar20 = gVar18;
                                        int i46 = iD8;
                                        q.g gVar21 = gVar3;
                                        c0237d5 = c0237d33;
                                        int i47 = iD7;
                                        c0237d6 = c0237d35;
                                        c0237d7 = c0237d34;
                                        c0232c.b(gVar17, gVar20, i46, 0.5f, gVar21, gVar19, i47, z17 ? 8 : 5);
                                    }
                                }
                                c0237d33 = c0237d7.f2300f0 != 8 ? c0237d7 : c0237d5;
                            }
                        }
                    } else {
                        C0236c c0236c29 = c0237d26.f2278P[i4];
                        int i48 = i4 + 1;
                        C0236c c0236c30 = c0237d21.f2278P[i48];
                        C0236c c0236c31 = c0236c29.f2260f;
                        q.g gVar22 = c0236c31 != null ? c0236c31.f2262i : null;
                        C0236c c0236c32 = c0236c30.f2260f;
                        q.g gVar23 = c0236c32 != null ? c0236c32.f2262i : null;
                        C0236c c0236c33 = c0237d22.f2278P[i4];
                        if (c0237d23 != null) {
                            c0236c30 = c0237d23.f2278P[i48];
                        }
                        if (gVar22 == null || gVar23 == null) {
                            c0237d2 = c0237d23;
                            i7 = i5;
                        } else {
                            c0237d2 = c0237d23;
                            i7 = i5;
                            c0232c.b(c0236c33.f2262i, gVar22, c0236c33.d(), i2 == 0 ? c0237d25.f2294c0 : c0237d25.f2296d0, gVar23, c0236c30.f2262i, c0236c30.d(), 7);
                        }
                    }
                    i8 = i7;
                    if (z4) {
                        C0236c[] c0236cArr72 = c0237d22.f2278P;
                        C0236c c0236c212 = c0236cArr72[i4];
                        if (c0237d2 == null) {
                        }
                        int i432 = i4 + 1;
                        C0236c[] c0236cArr82 = c0237d8.f2278P;
                        C0236c c0236c222 = c0236cArr82[i432];
                        C0236c c0236c232 = c0236c212.f2260f;
                        if (c0236c232 != null) {
                        }
                        C0236c c0236c242 = c0236c222.f2260f;
                        if (c0236c242 != null) {
                        }
                        if (c0237d21 != c0237d8) {
                        }
                        if (c0237d22 == c0237d8) {
                        }
                        if (gVar4 != null) {
                        }
                    } else {
                        C0236c[] c0236cArr722 = c0237d22.f2278P;
                        C0236c c0236c2122 = c0236cArr722[i4];
                        if (c0237d2 == null) {
                        }
                        int i4322 = i4 + 1;
                        C0236c[] c0236cArr822 = c0237d8.f2278P;
                        C0236c c0236c2222 = c0236cArr822[i4322];
                        C0236c c0236c2322 = c0236c2122.f2260f;
                        if (c0236c2322 != null) {
                        }
                        C0236c c0236c2422 = c0236c2222.f2260f;
                        if (c0236c2422 != null) {
                        }
                        if (c0237d21 != c0237d8) {
                        }
                        if (c0237d22 == c0237d8) {
                        }
                        if (gVar4 != null) {
                        }
                    }
                }
            } else {
                i6 = i3;
                c0235bArr2 = c0235bArr;
                i8 = i5;
            }
            i16 = i8 + 1;
            i15 = 2;
            eVar2 = eVar;
            arrayList3 = arrayList;
            i3 = i6;
            c0235bArr = c0235bArr2;
        }
    }

    public static void b(e eVar, C0232c c0232c, C0237d c0237d) {
        c0237d.f2314o = -1;
        c0237d.f2316p = -1;
        int i2 = eVar.f2315o0[0];
        int[] iArr = c0237d.f2315o0;
        if (i2 != 2 && iArr[0] == 4) {
            C0236c c0236c = c0237d.f2270H;
            int i3 = c0236c.f2261g;
            int iO = eVar.o();
            C0236c c0236c2 = c0237d.f2272J;
            int i4 = iO - c0236c2.f2261g;
            c0236c.f2262i = c0232c.k(c0236c);
            c0236c2.f2262i = c0232c.k(c0236c2);
            c0232c.d(c0236c.f2262i, i3);
            c0232c.d(c0236c2.f2262i, i4);
            c0237d.f2314o = 2;
            c0237d.f2286X = i3;
            int i5 = i4 - i3;
            c0237d.f2282T = i5;
            int i6 = c0237d.f2290a0;
            if (i5 < i6) {
                c0237d.f2282T = i6;
            }
        }
        if (eVar.f2315o0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C0236c c0236c3 = c0237d.f2271I;
        int i7 = c0236c3.f2261g;
        int i8 = eVar.i();
        C0236c c0236c4 = c0237d.f2273K;
        int i9 = i8 - c0236c4.f2261g;
        c0236c3.f2262i = c0232c.k(c0236c3);
        c0236c4.f2262i = c0232c.k(c0236c4);
        c0232c.d(c0236c3.f2262i, i7);
        c0232c.d(c0236c4.f2262i, i9);
        if (c0237d.f2288Z > 0 || c0237d.f2300f0 == 8) {
            C0236c c0236c5 = c0237d.f2274L;
            q.g gVarK = c0232c.k(c0236c5);
            c0236c5.f2262i = gVarK;
            c0232c.d(gVarK, c0237d.f2288Z + i7);
        }
        c0237d.f2316p = 2;
        c0237d.f2287Y = i7;
        int i10 = i9 - i7;
        c0237d.f2283U = i10;
        int i11 = c0237d.f2292b0;
        if (i10 < i11) {
            c0237d.f2283U = i11;
        }
    }

    public static final boolean c(int i2, int i3) {
        return (i2 & i3) == i3;
    }
}
