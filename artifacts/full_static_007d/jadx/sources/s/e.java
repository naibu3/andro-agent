package s;

import D0.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import q.C0232c;
import t.AbstractC0245h;
import t.C0239b;
import t.C0240c;
import t.C0242e;
import t.n;
import t.o;

/* loaded from: classes.dex */
public final class e extends C0237d {

    /* renamed from: A0, reason: collision with root package name */
    public C0235b[] f2326A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0235b[] f2327B0;

    /* renamed from: C0, reason: collision with root package name */
    public int f2328C0;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f2329D0;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f2330E0;
    public WeakReference F0;

    /* renamed from: G0, reason: collision with root package name */
    public WeakReference f2331G0;

    /* renamed from: H0, reason: collision with root package name */
    public WeakReference f2332H0;

    /* renamed from: I0, reason: collision with root package name */
    public WeakReference f2333I0;

    /* renamed from: J0, reason: collision with root package name */
    public HashSet f2334J0;

    /* renamed from: K0, reason: collision with root package name */
    public C0239b f2335K0;

    /* renamed from: p0, reason: collision with root package name */
    public ArrayList f2336p0;

    /* renamed from: q0, reason: collision with root package name */
    public h f2337q0;

    /* renamed from: r0, reason: collision with root package name */
    public C0242e f2338r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f2339s0;
    public v.f t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f2340u0;

    /* renamed from: v0, reason: collision with root package name */
    public C0232c f2341v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f2342w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f2343x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f2344y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f2345z0;

    public static void R(C0237d c0237d, v.f fVar, C0239b c0239b) {
        int i2;
        int i3;
        if (fVar == null) {
            return;
        }
        if (c0237d.f2300f0 == 8 || (c0237d instanceof f) || (c0237d instanceof C0234a)) {
            c0239b.f2357e = 0;
            c0239b.f2358f = 0;
            return;
        }
        int[] iArr = c0237d.f2315o0;
        c0239b.f2353a = iArr[0];
        c0239b.f2354b = iArr[1];
        c0239b.f2355c = c0237d.o();
        c0239b.f2356d = c0237d.i();
        c0239b.f2360i = false;
        c0239b.f2361j = 0;
        boolean z2 = c0239b.f2353a == 3;
        boolean z3 = c0239b.f2354b == 3;
        boolean z4 = z2 && c0237d.f2284V > 0.0f;
        boolean z5 = z3 && c0237d.f2284V > 0.0f;
        if (z2 && c0237d.r(0) && c0237d.f2318r == 0 && !z4) {
            c0239b.f2353a = 2;
            if (z3 && c0237d.f2319s == 0) {
                c0239b.f2353a = 1;
            }
            z2 = false;
        }
        if (z3 && c0237d.r(1) && c0237d.f2319s == 0 && !z5) {
            c0239b.f2354b = 2;
            if (z2 && c0237d.f2318r == 0) {
                c0239b.f2354b = 1;
            }
            z3 = false;
        }
        if (c0237d.y()) {
            c0239b.f2353a = 1;
            z2 = false;
        }
        if (c0237d.z()) {
            c0239b.f2354b = 1;
            z3 = false;
        }
        int[] iArr2 = c0237d.f2320t;
        if (z4) {
            if (iArr2[0] == 4) {
                c0239b.f2353a = 1;
            } else if (!z3) {
                if (c0239b.f2354b == 1) {
                    i3 = c0239b.f2356d;
                } else {
                    c0239b.f2353a = 2;
                    fVar.b(c0237d, c0239b);
                    i3 = c0239b.f2358f;
                }
                c0239b.f2353a = 1;
                c0239b.f2355c = (int) (c0237d.f2284V * i3);
            }
        }
        if (z5) {
            if (iArr2[1] == 4) {
                c0239b.f2354b = 1;
            } else if (!z2) {
                if (c0239b.f2353a == 1) {
                    i2 = c0239b.f2355c;
                } else {
                    c0239b.f2354b = 2;
                    fVar.b(c0237d, c0239b);
                    i2 = c0239b.f2357e;
                }
                c0239b.f2354b = 1;
                if (c0237d.f2285W == -1) {
                    c0239b.f2356d = (int) (i2 / c0237d.f2284V);
                } else {
                    c0239b.f2356d = (int) (c0237d.f2284V * i2);
                }
            }
        }
        fVar.b(c0237d, c0239b);
        c0237d.K(c0239b.f2357e);
        c0237d.H(c0239b.f2358f);
        c0237d.f2267E = c0239b.h;
        int i4 = c0239b.f2359g;
        c0237d.f2288Z = i4;
        c0237d.f2267E = i4 > 0;
        c0239b.f2361j = 0;
    }

    @Override // s.C0237d
    public final void A() {
        this.f2341v0.t();
        this.f2342w0 = 0;
        this.f2343x0 = 0;
        this.f2336p0.clear();
        super.A();
    }

    @Override // s.C0237d
    public final void C(h hVar) {
        super.C(hVar);
        int size = this.f2336p0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0237d) this.f2336p0.get(i2)).C(hVar);
        }
    }

    @Override // s.C0237d
    public final void L(boolean z2, boolean z3) {
        super.L(z2, z3);
        int size = this.f2336p0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0237d) this.f2336p0.get(i2)).L(z2, z3);
        }
    }

    public final void N(C0237d c0237d, int i2) {
        if (i2 == 0) {
            int i3 = this.f2344y0 + 1;
            C0235b[] c0235bArr = this.f2327B0;
            if (i3 >= c0235bArr.length) {
                this.f2327B0 = (C0235b[]) Arrays.copyOf(c0235bArr, c0235bArr.length * 2);
            }
            C0235b[] c0235bArr2 = this.f2327B0;
            int i4 = this.f2344y0;
            c0235bArr2[i4] = new C0235b(c0237d, 0, this.f2340u0);
            this.f2344y0 = i4 + 1;
            return;
        }
        if (i2 == 1) {
            int i5 = this.f2345z0 + 1;
            C0235b[] c0235bArr3 = this.f2326A0;
            if (i5 >= c0235bArr3.length) {
                this.f2326A0 = (C0235b[]) Arrays.copyOf(c0235bArr3, c0235bArr3.length * 2);
            }
            C0235b[] c0235bArr4 = this.f2326A0;
            int i6 = this.f2345z0;
            c0235bArr4[i6] = new C0235b(c0237d, 1, this.f2340u0);
            this.f2345z0 = i6 + 1;
        }
    }

    public final void O(C0232c c0232c) {
        boolean zS = S(64);
        b(c0232c, zS);
        int size = this.f2336p0.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0237d c0237d = (C0237d) this.f2336p0.get(i2);
            boolean[] zArr = c0237d.f2280R;
            zArr[0] = false;
            zArr[1] = false;
            if (c0237d instanceof C0234a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i3 = 0; i3 < size; i3++) {
                C0237d c0237d2 = (C0237d) this.f2336p0.get(i3);
                if (c0237d2 instanceof C0234a) {
                    C0234a c0234a = (C0234a) c0237d2;
                    for (int i4 = 0; i4 < c0234a.f2235q0; i4++) {
                        C0237d c0237d3 = c0234a.f2234p0[i4];
                        if (c0234a.f2237s0 || c0237d3.c()) {
                            int i5 = c0234a.f2236r0;
                            if (i5 == 0 || i5 == 1) {
                                c0237d3.f2280R[0] = true;
                            } else if (i5 == 2 || i5 == 3) {
                                c0237d3.f2280R[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f2334J0;
        hashSet.clear();
        for (int i6 = 0; i6 < size; i6++) {
            C0237d c0237d4 = (C0237d) this.f2336p0.get(i6);
            c0237d4.getClass();
            if (c0237d4 instanceof f) {
                c0237d4.b(c0232c, zS);
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            if (it.hasNext()) {
                ((C0237d) it.next()).getClass();
                throw new ClassCastException();
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C0237d) it2.next()).b(c0232c, zS);
                }
                hashSet.clear();
            }
        }
        if (C0232c.f2189p) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                C0237d c0237d5 = (C0237d) this.f2336p0.get(i7);
                c0237d5.getClass();
                if (!(c0237d5 instanceof f)) {
                    hashSet2.add(c0237d5);
                }
            }
            a(this, c0232c, hashSet2, this.f2315o0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C0237d c0237d6 = (C0237d) it3.next();
                g.b(this, c0232c, c0237d6);
                c0237d6.b(c0232c, zS);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                C0237d c0237d7 = (C0237d) this.f2336p0.get(i8);
                if (c0237d7 instanceof e) {
                    int[] iArr = c0237d7.f2315o0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        c0237d7.I(1);
                    }
                    if (i10 == 2) {
                        c0237d7.J(1);
                    }
                    c0237d7.b(c0232c, zS);
                    if (i9 == 2) {
                        c0237d7.I(i9);
                    }
                    if (i10 == 2) {
                        c0237d7.J(i10);
                    }
                } else {
                    g.b(this, c0232c, c0237d7);
                    if (!(c0237d7 instanceof f)) {
                        c0237d7.b(c0232c, zS);
                    }
                }
            }
        }
        if (this.f2344y0 > 0) {
            g.a(this, c0232c, null, 0);
        }
        if (this.f2345z0 > 0) {
            g.a(this, c0232c, null, 1);
        }
    }

    public final boolean P(int i2, boolean z2) {
        boolean z3;
        C0242e c0242e = this.f2338r0;
        e eVar = c0242e.f2364a;
        boolean z4 = false;
        int iH = eVar.h(0);
        int iH2 = eVar.h(1);
        int iP = eVar.p();
        int iQ = eVar.q();
        ArrayList arrayList = c0242e.f2368e;
        if (z2 && (iH == 2 || iH2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o oVar = (o) it.next();
                if (oVar.f2400f == i2 && !oVar.k()) {
                    z2 = false;
                    break;
                }
            }
            if (i2 == 0) {
                if (z2 && iH == 2) {
                    eVar.I(1);
                    eVar.K(c0242e.d(eVar, 0));
                    eVar.f2295d.f2399e.d(eVar.o());
                }
            } else if (z2 && iH2 == 2) {
                eVar.J(1);
                eVar.H(c0242e.d(eVar, 1));
                eVar.f2297e.f2399e.d(eVar.i());
            }
        }
        int[] iArr = eVar.f2315o0;
        if (i2 == 0) {
            int i3 = iArr[0];
            if (i3 == 1 || i3 == 4) {
                int iO = eVar.o() + iP;
                eVar.f2295d.f2402i.d(iO);
                eVar.f2295d.f2399e.d(iO - iP);
                z3 = true;
            }
            z3 = false;
        } else {
            int i4 = iArr[1];
            if (i4 == 1 || i4 == 4) {
                int i5 = eVar.i() + iQ;
                eVar.f2297e.f2402i.d(i5);
                eVar.f2297e.f2399e.d(i5 - iQ);
                z3 = true;
            }
            z3 = false;
        }
        c0242e.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            o oVar2 = (o) it2.next();
            if (oVar2.f2400f == i2 && (oVar2.f2396b != eVar || oVar2.f2401g)) {
                oVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z4 = true;
                break;
            }
            o oVar3 = (o) it3.next();
            if (oVar3.f2400f == i2 && (z3 || oVar3.f2396b != eVar)) {
                if (!oVar3.h.f2379j || !oVar3.f2402i.f2379j || (!(oVar3 instanceof C0240c) && !oVar3.f2399e.f2379j)) {
                    break;
                }
            }
        }
        eVar.I(iH);
        eVar.J(iH2);
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:341:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x07fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0809 A[LOOP:14: B:491:0x0807->B:492:0x0809, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:504:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x08d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0121  */
    /* JADX WARN: Type inference failed for: r7v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q() {
        int i2;
        Object[] objArr;
        C0236c c0236c;
        int i3;
        int i4;
        int i5;
        int i6;
        C0236c c0236c2;
        int i7;
        boolean z2;
        char c2;
        boolean z3;
        boolean z4;
        int iMax;
        ?? r7;
        boolean z5;
        int iMax2;
        boolean z6;
        int i8;
        int i9;
        int iMax3;
        int iMax4;
        q.g gVarK;
        C0232c c0232c;
        C0232c c0232c2;
        int i10;
        int i11;
        int i12;
        char c3;
        n nVar;
        int i13;
        int iO;
        int i14;
        int i15;
        int iB;
        int iB2;
        n nVar2;
        n nVar3;
        int[] iArr;
        this.f2286X = 0;
        this.f2287Y = 0;
        this.f2329D0 = false;
        this.f2330E0 = false;
        int size = this.f2336p0.size();
        int iMax5 = Math.max(0, o());
        int iMax6 = Math.max(0, i());
        int[] iArr2 = this.f2315o0;
        int i16 = iArr2[1];
        int i17 = iArr2[0];
        int i18 = this.f2339s0;
        C0236c c0236c3 = this.f2271I;
        C0236c c0236c4 = this.f2270H;
        if (i18 == 0 && g.c(this.f2328C0, 1)) {
            v.f fVar = this.t0;
            int i19 = iArr2[0];
            int i20 = iArr2[1];
            B();
            ArrayList arrayList = this.f2336p0;
            int size2 = arrayList.size();
            for (int i21 = 0; i21 < size2; i21++) {
                ((C0237d) arrayList.get(i21)).B();
            }
            boolean z7 = this.f2340u0;
            if (i19 == 1) {
                F(0, o());
            } else {
                c0236c4.i(0);
                this.f2286X = 0;
            }
            int i22 = 0;
            boolean z8 = false;
            boolean z9 = false;
            while (i22 < size2) {
                C0236c c0236c5 = c0236c4;
                C0237d c0237d = (C0237d) arrayList.get(i22);
                int i23 = iMax6;
                if (c0237d instanceof f) {
                    f fVar2 = (f) c0237d;
                    iArr = iArr2;
                    if (fVar2.t0 == 1) {
                        int i24 = fVar2.f2347q0;
                        if (i24 != -1) {
                            fVar2.N(i24);
                        } else if (fVar2.f2348r0 != -1 && y()) {
                            fVar2.N(o() - fVar2.f2348r0);
                        } else if (y()) {
                            fVar2.N((int) ((fVar2.f2346p0 * o()) + 0.5f));
                        }
                        z8 = true;
                    }
                } else {
                    iArr = iArr2;
                    if ((c0237d instanceof C0234a) && ((C0234a) c0237d).P() == 0) {
                        z9 = true;
                    }
                }
                i22++;
                iMax6 = i23;
                c0236c4 = c0236c5;
                iArr2 = iArr;
            }
            i2 = iMax6;
            objArr = iArr2;
            c0236c = c0236c4;
            if (z8) {
                for (int i25 = 0; i25 < size2; i25++) {
                    C0237d c0237d2 = (C0237d) arrayList.get(i25);
                    if (c0237d2 instanceof f) {
                        f fVar3 = (f) c0237d2;
                        if (fVar3.t0 == 1) {
                            AbstractC0245h.c(0, fVar3, fVar, z7);
                        }
                    }
                }
            }
            AbstractC0245h.c(0, this, fVar, z7);
            if (z9) {
                for (int i26 = 0; i26 < size2; i26++) {
                    C0237d c0237d3 = (C0237d) arrayList.get(i26);
                    if (c0237d3 instanceof C0234a) {
                        C0234a c0234a = (C0234a) c0237d3;
                        if (c0234a.P() == 0 && c0234a.O()) {
                            AbstractC0245h.c(1, c0234a, fVar, z7);
                        }
                    }
                }
            }
            if (i20 == 1) {
                G(0, i());
            } else {
                c0236c3.i(0);
                this.f2287Y = 0;
            }
            boolean z10 = false;
            boolean z11 = false;
            for (int i27 = 0; i27 < size2; i27++) {
                C0237d c0237d4 = (C0237d) arrayList.get(i27);
                if (c0237d4 instanceof f) {
                    f fVar4 = (f) c0237d4;
                    if (fVar4.t0 == 0) {
                        int i28 = fVar4.f2347q0;
                        if (i28 != -1) {
                            fVar4.N(i28);
                        } else if (fVar4.f2348r0 != -1 && z()) {
                            fVar4.N(i() - fVar4.f2348r0);
                        } else if (z()) {
                            fVar4.N((int) ((fVar4.f2346p0 * i()) + 0.5f));
                        }
                        z10 = true;
                    }
                } else if ((c0237d4 instanceof C0234a) && ((C0234a) c0237d4).P() == 1) {
                    z11 = true;
                }
            }
            if (z10) {
                for (int i29 = 0; i29 < size2; i29++) {
                    C0237d c0237d5 = (C0237d) arrayList.get(i29);
                    if (c0237d5 instanceof f) {
                        f fVar5 = (f) c0237d5;
                        if (fVar5.t0 == 0) {
                            AbstractC0245h.i(1, fVar5, fVar);
                        }
                    }
                }
            }
            AbstractC0245h.i(0, this, fVar);
            if (z11) {
                for (int i30 = 0; i30 < size2; i30++) {
                    C0237d c0237d6 = (C0237d) arrayList.get(i30);
                    if (c0237d6 instanceof C0234a) {
                        C0234a c0234a2 = (C0234a) c0237d6;
                        if (c0234a2.P() == 1 && c0234a2.O()) {
                            AbstractC0245h.i(1, c0234a2, fVar);
                        }
                    }
                }
            }
            for (int i31 = 0; i31 < size2; i31++) {
                C0237d c0237d7 = (C0237d) arrayList.get(i31);
                if (c0237d7.x() && AbstractC0245h.a(c0237d7)) {
                    R(c0237d7, fVar, AbstractC0245h.f2383a);
                    if (!(c0237d7 instanceof f)) {
                        AbstractC0245h.c(0, c0237d7, fVar, z7);
                        AbstractC0245h.i(0, c0237d7, fVar);
                    } else if (((f) c0237d7).t0 == 0) {
                        AbstractC0245h.i(0, c0237d7, fVar);
                    } else {
                        AbstractC0245h.c(0, c0237d7, fVar, z7);
                    }
                }
            }
            for (int i32 = 0; i32 < size; i32++) {
                C0237d c0237d8 = (C0237d) this.f2336p0.get(i32);
                if (c0237d8.x() && !(c0237d8 instanceof f) && !(c0237d8 instanceof C0234a)) {
                    int iH = c0237d8.h(0);
                    int iH2 = c0237d8.h(1);
                    if (iH != 3 || c0237d8.f2318r == 1 || iH2 != 3 || c0237d8.f2319s == 1) {
                        R(c0237d8, this.t0, new C0239b());
                    }
                }
            }
        } else {
            i2 = iMax6;
            objArr = iArr2;
            c0236c = c0236c4;
        }
        C0232c c0232c3 = this.f2341v0;
        if (size <= 2 || !((i17 == 2 || i16 == 2) && g.c(this.f2328C0, 1024))) {
            i3 = iMax5;
            i4 = size;
            i5 = i16;
            i6 = i17;
            c0236c2 = c0236c3;
            i7 = i2;
        } else {
            v.f fVar6 = this.t0;
            ArrayList arrayList2 = this.f2336p0;
            int size3 = arrayList2.size();
            int i33 = 0;
            while (true) {
                if (i33 < size3) {
                    C0237d c0237d9 = (C0237d) arrayList2.get(i33);
                    char c4 = objArr[0];
                    char c5 = objArr[1];
                    int[] iArr3 = c0237d9.f2315o0;
                    if (!AbstractC0245h.h(c4, c5, iArr3[0], iArr3[1])) {
                        i10 = iMax5;
                        i4 = size;
                        i11 = i16;
                        i12 = i17;
                        c0236c2 = c0236c3;
                        break;
                    }
                    i33++;
                } else {
                    int i34 = 0;
                    ArrayList arrayList3 = null;
                    ArrayList arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    while (i34 < size3) {
                        C0236c c0236c6 = c0236c3;
                        C0237d c0237d10 = (C0237d) arrayList2.get(i34);
                        int i35 = size;
                        char c6 = objArr[0];
                        int i36 = i16;
                        char c7 = objArr[1];
                        int i37 = iMax5;
                        int[] iArr4 = c0237d10.f2315o0;
                        int i38 = i17;
                        if (!AbstractC0245h.h(c6, c7, iArr4[0], iArr4[1])) {
                            R(c0237d10, fVar6, this.f2335K0);
                        }
                        boolean z12 = c0237d10 instanceof f;
                        if (z12) {
                            f fVar7 = (f) c0237d10;
                            if (fVar7.t0 == 0) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(fVar7);
                            }
                            if (fVar7.t0 == 1) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(fVar7);
                            }
                        }
                        if (c0237d10 instanceof C0234a) {
                            if (c0237d10 instanceof C0234a) {
                                C0234a c0234a3 = (C0234a) c0237d10;
                                if (c0234a3.P() == 0) {
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                    }
                                    arrayList4.add(c0234a3);
                                }
                                if (c0234a3.P() == 1) {
                                    if (arrayList6 == null) {
                                        arrayList6 = new ArrayList();
                                    }
                                    arrayList6.add(c0234a3);
                                }
                            } else {
                                C0234a c0234a4 = (C0234a) c0237d10;
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                }
                                arrayList4.add(c0234a4);
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                arrayList6.add(c0234a4);
                            }
                        }
                        if (c0237d10.f2270H.f2260f == null && c0237d10.f2272J.f2260f == null && !z12 && !(c0237d10 instanceof C0234a)) {
                            if (arrayList7 == null) {
                                arrayList7 = new ArrayList();
                            }
                            arrayList7.add(c0237d10);
                        }
                        if (c0237d10.f2271I.f2260f == null && c0237d10.f2273K.f2260f == null && c0237d10.f2274L.f2260f == null && !z12 && !(c0237d10 instanceof C0234a)) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            ArrayList arrayList9 = arrayList8;
                            arrayList9.add(c0237d10);
                            arrayList8 = arrayList9;
                        }
                        i34++;
                        size = i35;
                        c0236c3 = c0236c6;
                        i16 = i36;
                        iMax5 = i37;
                        i17 = i38;
                    }
                    i10 = iMax5;
                    i4 = size;
                    i11 = i16;
                    i12 = i17;
                    c0236c2 = c0236c3;
                    ArrayList arrayList10 = new ArrayList();
                    if (arrayList3 != null) {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            AbstractC0245h.b((f) it.next(), 0, arrayList10, null);
                        }
                    }
                    int i39 = 0;
                    n nVar4 = null;
                    if (arrayList4 != null) {
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            C0234a c0234a5 = (C0234a) it2.next();
                            n nVarB = AbstractC0245h.b(c0234a5, i39, arrayList10, nVar4);
                            c0234a5.N(i39, arrayList10, nVarB);
                            nVarB.a(arrayList10);
                            i39 = 0;
                            nVar4 = null;
                        }
                    }
                    HashSet hashSet = g(2).f2255a;
                    if (hashSet != null) {
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            AbstractC0245h.b(((C0236c) it3.next()).f2258d, 0, arrayList10, null);
                        }
                    }
                    HashSet hashSet2 = g(4).f2255a;
                    if (hashSet2 != null) {
                        Iterator it4 = hashSet2.iterator();
                        while (it4.hasNext()) {
                            AbstractC0245h.b(((C0236c) it4.next()).f2258d, 0, arrayList10, null);
                        }
                    }
                    HashSet hashSet3 = g(7).f2255a;
                    if (hashSet3 != null) {
                        Iterator it5 = hashSet3.iterator();
                        while (it5.hasNext()) {
                            AbstractC0245h.b(((C0236c) it5.next()).f2258d, 0, arrayList10, null);
                        }
                    }
                    n nVar5 = null;
                    if (arrayList7 != null) {
                        Iterator it6 = arrayList7.iterator();
                        while (it6.hasNext()) {
                            AbstractC0245h.b((C0237d) it6.next(), 0, arrayList10, null);
                        }
                    }
                    if (arrayList5 != null) {
                        Iterator it7 = arrayList5.iterator();
                        while (it7.hasNext()) {
                            AbstractC0245h.b((f) it7.next(), 1, arrayList10, null);
                        }
                    }
                    int i40 = 1;
                    if (arrayList6 != null) {
                        Iterator it8 = arrayList6.iterator();
                        while (it8.hasNext()) {
                            C0234a c0234a6 = (C0234a) it8.next();
                            n nVarB2 = AbstractC0245h.b(c0234a6, i40, arrayList10, nVar5);
                            c0234a6.N(i40, arrayList10, nVarB2);
                            nVarB2.a(arrayList10);
                            i40 = 1;
                            nVar5 = null;
                        }
                    }
                    HashSet hashSet4 = g(3).f2255a;
                    if (hashSet4 != null) {
                        Iterator it9 = hashSet4.iterator();
                        while (it9.hasNext()) {
                            AbstractC0245h.b(((C0236c) it9.next()).f2258d, 1, arrayList10, null);
                        }
                    }
                    HashSet hashSet5 = g(6).f2255a;
                    if (hashSet5 != null) {
                        Iterator it10 = hashSet5.iterator();
                        while (it10.hasNext()) {
                            AbstractC0245h.b(((C0236c) it10.next()).f2258d, 1, arrayList10, null);
                        }
                    }
                    HashSet hashSet6 = g(5).f2255a;
                    if (hashSet6 != null) {
                        Iterator it11 = hashSet6.iterator();
                        while (it11.hasNext()) {
                            AbstractC0245h.b(((C0236c) it11.next()).f2258d, 1, arrayList10, null);
                        }
                    }
                    HashSet hashSet7 = g(7).f2255a;
                    if (hashSet7 != null) {
                        Iterator it12 = hashSet7.iterator();
                        while (it12.hasNext()) {
                            AbstractC0245h.b(((C0236c) it12.next()).f2258d, 1, arrayList10, null);
                        }
                    }
                    if (arrayList8 != null) {
                        Iterator it13 = arrayList8.iterator();
                        while (it13.hasNext()) {
                            AbstractC0245h.b((C0237d) it13.next(), 1, arrayList10, null);
                        }
                    }
                    for (int i41 = 0; i41 < size3; i41++) {
                        C0237d c0237d11 = (C0237d) arrayList2.get(i41);
                        int[] iArr5 = c0237d11.f2315o0;
                        if (iArr5[0] == 3 && iArr5[1] == 3) {
                            int i42 = c0237d11.f2311m0;
                            int size4 = arrayList10.size();
                            int i43 = 0;
                            while (true) {
                                if (i43 >= size4) {
                                    nVar2 = null;
                                    break;
                                }
                                nVar2 = (n) arrayList10.get(i43);
                                if (i42 == nVar2.f2391b) {
                                    break;
                                } else {
                                    i43++;
                                }
                            }
                            int i44 = c0237d11.f2313n0;
                            int size5 = arrayList10.size();
                            int i45 = 0;
                            while (true) {
                                if (i45 >= size5) {
                                    nVar3 = null;
                                    break;
                                }
                                nVar3 = (n) arrayList10.get(i45);
                                if (i44 == nVar3.f2391b) {
                                    break;
                                } else {
                                    i45++;
                                }
                            }
                            if (nVar2 != null && nVar3 != null) {
                                nVar2.c(0, nVar3);
                                nVar3.f2392c = 2;
                                arrayList10.remove(nVar2);
                            }
                        }
                    }
                    if (arrayList10.size() > 1) {
                        if (objArr[0] == 2) {
                            Iterator it14 = arrayList10.iterator();
                            int i46 = 0;
                            nVar = null;
                            while (it14.hasNext()) {
                                n nVar6 = (n) it14.next();
                                if (nVar6.f2392c != 1 && (iB2 = nVar6.b(c0232c3, 0)) > i46) {
                                    nVar = nVar6;
                                    i46 = iB2;
                                }
                            }
                            c3 = 1;
                            if (nVar != null) {
                                I(1);
                                K(i46);
                            }
                            if (objArr[c3] != 2) {
                                Iterator it15 = arrayList10.iterator();
                                int i47 = 0;
                                n nVar7 = null;
                                while (it15.hasNext()) {
                                    n nVar8 = (n) it15.next();
                                    if (nVar8.f2392c != 0 && (iB = nVar8.b(c0232c3, 1)) > i47) {
                                        nVar7 = nVar8;
                                        i47 = iB;
                                    }
                                }
                                if (nVar7 != null) {
                                    J(1);
                                    H(i47);
                                } else {
                                    nVar7 = null;
                                }
                                if (nVar != null || nVar7 != null) {
                                    i6 = i12;
                                    if (i6 == 2) {
                                        i13 = i10;
                                        if (i13 >= o() || i13 <= 0) {
                                            iO = o();
                                            i5 = i11;
                                            if (i5 != 2) {
                                                i14 = i2;
                                                if (i14 >= i() || i14 <= 0) {
                                                    i15 = i();
                                                    i7 = i15;
                                                    i3 = iO;
                                                    z2 = true;
                                                } else {
                                                    H(i14);
                                                    this.f2330E0 = true;
                                                }
                                            } else {
                                                i14 = i2;
                                            }
                                            i15 = i14;
                                            i7 = i15;
                                            i3 = iO;
                                            z2 = true;
                                        } else {
                                            K(i13);
                                            this.f2329D0 = true;
                                        }
                                    } else {
                                        i13 = i10;
                                    }
                                    iO = i13;
                                    i5 = i11;
                                    if (i5 != 2) {
                                    }
                                    i15 = i14;
                                    i7 = i15;
                                    i3 = iO;
                                    z2 = true;
                                }
                            }
                        } else {
                            c3 = 1;
                        }
                        nVar = null;
                        if (objArr[c3] != 2) {
                        }
                    }
                }
            }
            i7 = i2;
            i5 = i11;
            i3 = i10;
            i6 = i12;
        }
        z2 = false;
        boolean z13 = S(64) || S(128);
        c0232c3.getClass();
        c0232c3.f2197g = false;
        if (this.f2328C0 == 0 || !z13) {
            c2 = 1;
        } else {
            c2 = 1;
            c0232c3.f2197g = true;
        }
        ArrayList arrayList11 = this.f2336p0;
        boolean z14 = objArr[0] == 2 || objArr[c2] == 2;
        this.f2344y0 = 0;
        this.f2345z0 = 0;
        int i48 = i4;
        for (int i49 = 0; i49 < i48; i49++) {
            C0237d c0237d12 = (C0237d) this.f2336p0.get(i49);
            if (c0237d12 instanceof e) {
                ((e) c0237d12).Q();
            }
        }
        boolean zS = S(64);
        boolean z15 = z2;
        int i50 = 0;
        boolean z16 = true;
        while (z16) {
            int i51 = i50 + 1;
            try {
                c0232c3.t();
                this.f2344y0 = 0;
                this.f2345z0 = 0;
                e(c0232c3);
                for (int i52 = 0; i52 < i48; i52++) {
                    ((C0237d) this.f2336p0.get(i52)).e(c0232c3);
                }
                O(c0232c3);
                try {
                    WeakReference weakReference = this.F0;
                    if (weakReference != null) {
                        try {
                            if (weakReference.get() != null) {
                                C0236c c0236c7 = (C0236c) this.F0.get();
                                C0236c c0236c8 = c0236c2;
                                try {
                                    gVarK = c0232c3.k(c0236c8);
                                    c0232c = this.f2341v0;
                                    z3 = z15;
                                    c0236c2 = c0236c8;
                                } catch (Exception e2) {
                                    e = e2;
                                    z3 = z15;
                                    c0236c2 = c0236c8;
                                }
                                try {
                                    c0232c.f(c0232c.k(c0236c7), gVarK, 0, 5);
                                    this.F0 = null;
                                } catch (Exception e3) {
                                    e = e3;
                                    z16 = true;
                                    e.printStackTrace();
                                    System.out.println("EXCEPTION : " + e);
                                    boolean[] zArr = g.f2351a;
                                    if (z16) {
                                    }
                                    if (z14) {
                                    }
                                    iMax = Math.max(this.f2290a0, o());
                                    if (iMax <= o()) {
                                    }
                                    iMax2 = Math.max(this.f2292b0, i());
                                    if (iMax2 <= i()) {
                                    }
                                    if (!z6) {
                                    }
                                    z15 = z6;
                                    i8 = 8;
                                    if (i51 > i8) {
                                    }
                                    i50 = i51;
                                    z16 = z4;
                                }
                            } else {
                                z3 = z15;
                            }
                            try {
                                WeakReference weakReference2 = this.f2332H0;
                                if (weakReference2 != null && weakReference2.get() != null) {
                                    C0236c c0236c9 = (C0236c) this.f2332H0.get();
                                    q.g gVarK2 = c0232c3.k(this.f2273K);
                                    C0232c c0232c4 = this.f2341v0;
                                    c0232c4.f(gVarK2, c0232c4.k(c0236c9), 0, 5);
                                    this.f2332H0 = null;
                                }
                                WeakReference weakReference3 = this.f2331G0;
                                if (weakReference3 != null && weakReference3.get() != null) {
                                    C0236c c0236c10 = (C0236c) this.f2331G0.get();
                                    C0236c c0236c11 = c0236c;
                                    try {
                                        q.g gVarK3 = c0232c3.k(c0236c11);
                                        C0232c c0232c5 = this.f2341v0;
                                        c0236c = c0236c11;
                                        c0232c5.f(c0232c5.k(c0236c10), gVarK3, 0, 5);
                                        this.f2331G0 = null;
                                    } catch (Exception e4) {
                                        e = e4;
                                        c0236c = c0236c11;
                                        z16 = true;
                                        e.printStackTrace();
                                        System.out.println("EXCEPTION : " + e);
                                        boolean[] zArr2 = g.f2351a;
                                        if (z16) {
                                        }
                                        if (z14) {
                                        }
                                        iMax = Math.max(this.f2290a0, o());
                                        if (iMax <= o()) {
                                        }
                                        iMax2 = Math.max(this.f2292b0, i());
                                        if (iMax2 <= i()) {
                                        }
                                        if (!z6) {
                                        }
                                        z15 = z6;
                                        i8 = 8;
                                        if (i51 > i8) {
                                        }
                                        i50 = i51;
                                        z16 = z4;
                                    }
                                }
                                WeakReference weakReference4 = this.f2333I0;
                                if (weakReference4 != null && weakReference4.get() != null) {
                                    C0236c c0236c12 = (C0236c) this.f2333I0.get();
                                    q.g gVarK4 = c0232c3.k(this.f2272J);
                                    try {
                                        c0232c2 = this.f2341v0;
                                    } catch (Exception e5) {
                                        e = e5;
                                        z16 = true;
                                        e.printStackTrace();
                                        System.out.println("EXCEPTION : " + e);
                                        boolean[] zArr22 = g.f2351a;
                                        if (z16) {
                                        }
                                        if (z14) {
                                            int iMax7 = 0;
                                            int iMax8 = 0;
                                            while (i9 < i48) {
                                            }
                                            iMax3 = Math.max(this.f2290a0, iMax7);
                                            iMax4 = Math.max(this.f2292b0, iMax8);
                                            if (i6 == 2) {
                                                K(iMax3);
                                                objArr[0] = 2;
                                                z4 = true;
                                                z3 = true;
                                            }
                                            if (i5 == 2) {
                                                H(iMax4);
                                                objArr[1] = 2;
                                                z4 = true;
                                                z3 = true;
                                            }
                                        }
                                        iMax = Math.max(this.f2290a0, o());
                                        if (iMax <= o()) {
                                        }
                                        iMax2 = Math.max(this.f2292b0, i());
                                        if (iMax2 <= i()) {
                                        }
                                        if (!z6) {
                                        }
                                        z15 = z6;
                                        i8 = 8;
                                        if (i51 > i8) {
                                        }
                                        i50 = i51;
                                        z16 = z4;
                                    }
                                    try {
                                        c0232c2.f(gVarK4, c0232c2.k(c0236c12), 0, 5);
                                    } catch (Exception e6) {
                                        e = e6;
                                        z16 = true;
                                        e.printStackTrace();
                                        System.out.println("EXCEPTION : " + e);
                                        boolean[] zArr222 = g.f2351a;
                                        if (z16) {
                                        }
                                        if (z14) {
                                        }
                                        iMax = Math.max(this.f2290a0, o());
                                        if (iMax <= o()) {
                                        }
                                        iMax2 = Math.max(this.f2292b0, i());
                                        if (iMax2 <= i()) {
                                        }
                                        if (!z6) {
                                        }
                                        z15 = z6;
                                        i8 = 8;
                                        if (i51 > i8) {
                                        }
                                        i50 = i51;
                                        z16 = z4;
                                    }
                                    try {
                                        this.f2333I0 = null;
                                    } catch (Exception e7) {
                                        e = e7;
                                        z16 = true;
                                        e.printStackTrace();
                                        System.out.println("EXCEPTION : " + e);
                                        boolean[] zArr2222 = g.f2351a;
                                        if (z16) {
                                        }
                                        if (z14) {
                                        }
                                        iMax = Math.max(this.f2290a0, o());
                                        if (iMax <= o()) {
                                        }
                                        iMax2 = Math.max(this.f2292b0, i());
                                        if (iMax2 <= i()) {
                                        }
                                        if (!z6) {
                                        }
                                        z15 = z6;
                                        i8 = 8;
                                        if (i51 > i8) {
                                        }
                                        i50 = i51;
                                        z16 = z4;
                                    }
                                }
                                c0232c3.p();
                                z16 = true;
                            } catch (Exception e8) {
                                e = e8;
                            }
                        } catch (Exception e9) {
                            e = e9;
                            z3 = z15;
                        }
                    }
                } catch (Exception e10) {
                    e = e10;
                    z3 = z15;
                }
            } catch (Exception e11) {
                e = e11;
                z3 = z15;
            }
            boolean[] zArr22222 = g.f2351a;
            if (z16) {
                M(c0232c3, zS);
                for (int i53 = 0; i53 < i48; i53++) {
                    ((C0237d) this.f2336p0.get(i53)).M(c0232c3, zS);
                }
                z4 = false;
            } else {
                zArr22222[2] = false;
                boolean zS2 = S(64);
                M(c0232c3, zS2);
                int size6 = this.f2336p0.size();
                int i54 = 0;
                z4 = false;
                while (i54 < size6) {
                    C0237d c0237d13 = (C0237d) this.f2336p0.get(i54);
                    c0237d13.M(c0232c3, zS2);
                    boolean z17 = zS2;
                    int i55 = size6;
                    if (c0237d13.h != -1 || c0237d13.f2302i != -1) {
                        z4 = true;
                    }
                    i54++;
                    zS2 = z17;
                    size6 = i55;
                }
            }
            if (z14 && i51 < 8 && zArr22222[2]) {
                int iMax72 = 0;
                int iMax82 = 0;
                for (i9 = 0; i9 < i48; i9++) {
                    C0237d c0237d14 = (C0237d) this.f2336p0.get(i9);
                    iMax72 = Math.max(iMax72, c0237d14.o() + c0237d14.f2286X);
                    iMax82 = Math.max(iMax82, c0237d14.i() + c0237d14.f2287Y);
                }
                iMax3 = Math.max(this.f2290a0, iMax72);
                iMax4 = Math.max(this.f2292b0, iMax82);
                if (i6 == 2 && o() < iMax3) {
                    K(iMax3);
                    objArr[0] = 2;
                    z4 = true;
                    z3 = true;
                }
                if (i5 == 2 && i() < iMax4) {
                    H(iMax4);
                    objArr[1] = 2;
                    z4 = true;
                    z3 = true;
                }
            }
            iMax = Math.max(this.f2290a0, o());
            if (iMax <= o()) {
                K(iMax);
                r7 = 1;
                objArr[0] = 1;
                z4 = true;
                z5 = true;
            } else {
                r7 = 1;
                z5 = z3;
            }
            iMax2 = Math.max(this.f2292b0, i());
            if (iMax2 <= i()) {
                H(iMax2);
                objArr[r7] = r7;
                z6 = r7;
                z4 = z6;
            } else {
                z6 = z5;
            }
            if (!z6) {
                if (objArr[0] == 2 && i3 > 0 && o() > i3) {
                    this.f2329D0 = r7;
                    objArr[0] = r7;
                    K(i3);
                    z6 = r7;
                    z4 = z6;
                }
                if (objArr[r7] == 2 && i7 > 0 && i() > i7) {
                    this.f2330E0 = r7;
                    objArr[r7] = r7;
                    H(i7);
                    i8 = 8;
                    z15 = true;
                    z4 = true;
                }
                if (i51 > i8) {
                    z4 = false;
                }
                i50 = i51;
                z16 = z4;
            }
            z15 = z6;
            i8 = 8;
            if (i51 > i8) {
            }
            i50 = i51;
            z16 = z4;
        }
        boolean z18 = z15;
        this.f2336p0 = arrayList11;
        if (z18) {
            objArr[0] = i6;
            objArr[1] = i5;
        }
        C(c0232c3.f2201l);
    }

    public final boolean S(int i2) {
        return (this.f2328C0 & i2) == i2;
    }

    @Override // s.C0237d
    public final void l(StringBuilder sb) {
        sb.append(this.f2304j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f2282T);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f2283U);
        sb.append("\n");
        Iterator it = this.f2336p0.iterator();
        while (it.hasNext()) {
            ((C0237d) it.next()).l(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
