package s;

import java.util.ArrayList;
import q.C0231b;
import q.C0232c;
import t.AbstractC0245h;
import t.n;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234a extends C0237d {

    /* renamed from: p0, reason: collision with root package name */
    public C0237d[] f2234p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f2235q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f2236r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f2237s0;
    public int t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f2238u0;

    public final void N(int i2, ArrayList arrayList, n nVar) {
        for (int i3 = 0; i3 < this.f2235q0; i3++) {
            C0237d c0237d = this.f2234p0[i3];
            ArrayList arrayList2 = nVar.f2390a;
            if (!arrayList2.contains(c0237d)) {
                arrayList2.add(c0237d);
            }
        }
        for (int i4 = 0; i4 < this.f2235q0; i4++) {
            AbstractC0245h.b(this.f2234p0[i4], i2, arrayList, nVar);
        }
    }

    public final boolean O() {
        int i2;
        int i3;
        int i4;
        boolean z2 = true;
        int i5 = 0;
        while (true) {
            i2 = this.f2235q0;
            if (i5 >= i2) {
                break;
            }
            C0237d c0237d = this.f2234p0[i5];
            if ((this.f2237s0 || c0237d.c()) && ((((i3 = this.f2236r0) == 0 || i3 == 1) && !c0237d.y()) || (((i4 = this.f2236r0) == 2 || i4 == 3) && !c0237d.z()))) {
                z2 = false;
            }
            i5++;
        }
        if (!z2 || i2 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z3 = false;
        for (int i6 = 0; i6 < this.f2235q0; i6++) {
            C0237d c0237d2 = this.f2234p0[i6];
            if (this.f2237s0 || c0237d2.c()) {
                if (!z3) {
                    int i7 = this.f2236r0;
                    if (i7 == 0) {
                        iMax = c0237d2.g(2).c();
                    } else if (i7 == 1) {
                        iMax = c0237d2.g(4).c();
                    } else if (i7 == 2) {
                        iMax = c0237d2.g(3).c();
                    } else if (i7 == 3) {
                        iMax = c0237d2.g(5).c();
                    }
                    z3 = true;
                }
                int i8 = this.f2236r0;
                if (i8 == 0) {
                    iMax = Math.min(iMax, c0237d2.g(2).c());
                } else if (i8 == 1) {
                    iMax = Math.max(iMax, c0237d2.g(4).c());
                } else if (i8 == 2) {
                    iMax = Math.min(iMax, c0237d2.g(3).c());
                } else if (i8 == 3) {
                    iMax = Math.max(iMax, c0237d2.g(5).c());
                }
            }
        }
        int i9 = iMax + this.t0;
        int i10 = this.f2236r0;
        if (i10 == 0 || i10 == 1) {
            F(i9, i9);
        } else {
            G(i9, i9);
        }
        this.f2238u0 = true;
        return true;
    }

    public final int P() {
        int i2 = this.f2236r0;
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        return (i2 == 2 || i2 == 3) ? 1 : -1;
    }

    @Override // s.C0237d
    public final void b(C0232c c0232c, boolean z2) {
        boolean z3;
        int i2;
        int i3;
        C0236c[] c0236cArr = this.f2278P;
        C0236c c0236c = this.f2270H;
        c0236cArr[0] = c0236c;
        C0236c c0236c2 = this.f2271I;
        int i4 = 2;
        c0236cArr[2] = c0236c2;
        C0236c c0236c3 = this.f2272J;
        c0236cArr[1] = c0236c3;
        C0236c c0236c4 = this.f2273K;
        c0236cArr[3] = c0236c4;
        for (C0236c c0236c5 : c0236cArr) {
            c0236c5.f2262i = c0232c.k(c0236c5);
        }
        int i5 = this.f2236r0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        C0236c c0236c6 = c0236cArr[i5];
        if (!this.f2238u0) {
            O();
        }
        if (this.f2238u0) {
            this.f2238u0 = false;
            int i6 = this.f2236r0;
            if (i6 == 0 || i6 == 1) {
                c0232c.d(c0236c.f2262i, this.f2286X);
                c0232c.d(c0236c3.f2262i, this.f2286X);
                return;
            } else {
                if (i6 == 2 || i6 == 3) {
                    c0232c.d(c0236c2.f2262i, this.f2287Y);
                    c0232c.d(c0236c4.f2262i, this.f2287Y);
                    return;
                }
                return;
            }
        }
        for (int i7 = 0; i7 < this.f2235q0; i7++) {
            C0237d c0237d = this.f2234p0[i7];
            if ((this.f2237s0 || c0237d.c()) && ((((i3 = this.f2236r0) == 0 || i3 == 1) && c0237d.f2315o0[0] == 3 && c0237d.f2270H.f2260f != null && c0237d.f2272J.f2260f != null) || ((i3 == 2 || i3 == 3) && c0237d.f2315o0[1] == 3 && c0237d.f2271I.f2260f != null && c0237d.f2273K.f2260f != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = c0236c.e() || c0236c3.e();
        boolean z5 = c0236c2.e() || c0236c4.e();
        int i8 = (z3 || !(((i2 = this.f2236r0) == 0 && z4) || ((i2 == 2 && z5) || ((i2 == 1 && z4) || (i2 == 3 && z5))))) ? 4 : 5;
        int i9 = 0;
        while (i9 < this.f2235q0) {
            C0237d c0237d2 = this.f2234p0[i9];
            if (this.f2237s0 || c0237d2.c()) {
                q.g gVarK = c0232c.k(c0237d2.f2278P[this.f2236r0]);
                int i10 = this.f2236r0;
                C0236c c0236c7 = c0237d2.f2278P[i10];
                c0236c7.f2262i = gVarK;
                C0236c c0236c8 = c0236c7.f2260f;
                int i11 = (c0236c8 == null || c0236c8.f2258d != this) ? 0 : c0236c7.f2261g;
                if (i10 == 0 || i10 == i4) {
                    q.g gVar = c0236c6.f2262i;
                    int i12 = this.t0 - i11;
                    C0231b c0231bL = c0232c.l();
                    q.g gVarM = c0232c.m();
                    gVarM.f2211d = 0;
                    c0231bL.c(gVar, gVarK, gVarM, i12);
                    c0232c.c(c0231bL);
                } else {
                    q.g gVar2 = c0236c6.f2262i;
                    int i13 = this.t0 + i11;
                    C0231b c0231bL2 = c0232c.l();
                    q.g gVarM2 = c0232c.m();
                    gVarM2.f2211d = 0;
                    c0231bL2.b(gVar2, gVarK, gVarM2, i13);
                    c0232c.c(c0231bL2);
                }
                c0232c.e(c0236c6.f2262i, gVarK, this.t0 + i11, i8);
            }
            i9++;
            i4 = 2;
        }
        int i14 = this.f2236r0;
        if (i14 == 0) {
            c0232c.e(c0236c3.f2262i, c0236c.f2262i, 0, 8);
            c0232c.e(c0236c.f2262i, this.f2281S.f2272J.f2262i, 0, 4);
            c0232c.e(c0236c.f2262i, this.f2281S.f2270H.f2262i, 0, 0);
            return;
        }
        if (i14 == 1) {
            c0232c.e(c0236c.f2262i, c0236c3.f2262i, 0, 8);
            c0232c.e(c0236c.f2262i, this.f2281S.f2270H.f2262i, 0, 4);
            c0232c.e(c0236c.f2262i, this.f2281S.f2272J.f2262i, 0, 0);
        } else if (i14 == 2) {
            c0232c.e(c0236c4.f2262i, c0236c2.f2262i, 0, 8);
            c0232c.e(c0236c2.f2262i, this.f2281S.f2273K.f2262i, 0, 4);
            c0232c.e(c0236c2.f2262i, this.f2281S.f2271I.f2262i, 0, 0);
        } else if (i14 == 3) {
            c0232c.e(c0236c2.f2262i, c0236c4.f2262i, 0, 8);
            c0232c.e(c0236c2.f2262i, this.f2281S.f2271I.f2262i, 0, 4);
            c0232c.e(c0236c2.f2262i, this.f2281S.f2273K.f2262i, 0, 0);
        }
    }

    @Override // s.C0237d
    public final boolean c() {
        return true;
    }

    @Override // s.C0237d
    public final String toString() {
        String strC = "[Barrier] " + this.g0 + " {";
        for (int i2 = 0; i2 < this.f2235q0; i2++) {
            C0237d c0237d = this.f2234p0[i2];
            if (i2 > 0) {
                strC = A.e.c(strC, ", ");
            }
            strC = strC + c0237d.g0;
        }
        return A.e.c(strC, "}");
    }

    @Override // s.C0237d
    public final boolean y() {
        return this.f2238u0;
    }

    @Override // s.C0237d
    public final boolean z() {
        return this.f2238u0;
    }
}
