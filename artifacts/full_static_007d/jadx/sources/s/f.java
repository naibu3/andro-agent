package s;

import java.util.ArrayList;
import q.C0231b;
import q.C0232c;

/* loaded from: classes.dex */
public final class f extends C0237d {

    /* renamed from: p0, reason: collision with root package name */
    public float f2346p0 = -1.0f;

    /* renamed from: q0, reason: collision with root package name */
    public int f2347q0 = -1;

    /* renamed from: r0, reason: collision with root package name */
    public int f2348r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public C0236c f2349s0 = this.f2271I;
    public int t0 = 0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f2350u0;

    public f() {
        this.f2279Q.clear();
        this.f2279Q.add(this.f2349s0);
        int length = this.f2278P.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f2278P[i2] = this.f2349s0;
        }
    }

    @Override // s.C0237d
    public final void M(C0232c c0232c, boolean z2) {
        if (this.f2281S == null) {
            return;
        }
        C0236c c0236c = this.f2349s0;
        c0232c.getClass();
        int iN = C0232c.n(c0236c);
        if (this.t0 == 1) {
            this.f2286X = iN;
            this.f2287Y = 0;
            H(this.f2281S.i());
            K(0);
            return;
        }
        this.f2286X = 0;
        this.f2287Y = iN;
        K(this.f2281S.o());
        H(0);
    }

    public final void N(int i2) {
        this.f2349s0.i(i2);
        this.f2350u0 = true;
    }

    public final void O(int i2) {
        if (this.t0 == i2) {
            return;
        }
        this.t0 = i2;
        ArrayList arrayList = this.f2279Q;
        arrayList.clear();
        if (this.t0 == 1) {
            this.f2349s0 = this.f2270H;
        } else {
            this.f2349s0 = this.f2271I;
        }
        arrayList.add(this.f2349s0);
        C0236c[] c0236cArr = this.f2278P;
        int length = c0236cArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            c0236cArr[i3] = this.f2349s0;
        }
    }

    @Override // s.C0237d
    public final void b(C0232c c0232c, boolean z2) {
        e eVar = (e) this.f2281S;
        if (eVar == null) {
            return;
        }
        Object objG = eVar.g(2);
        Object objG2 = eVar.g(4);
        C0237d c0237d = this.f2281S;
        boolean z3 = c0237d != null && c0237d.f2315o0[0] == 2;
        if (this.t0 == 0) {
            objG = eVar.g(3);
            objG2 = eVar.g(5);
            C0237d c0237d2 = this.f2281S;
            z3 = c0237d2 != null && c0237d2.f2315o0[1] == 2;
        }
        if (this.f2350u0) {
            C0236c c0236c = this.f2349s0;
            if (c0236c.f2257c) {
                q.g gVarK = c0232c.k(c0236c);
                c0232c.d(gVarK, this.f2349s0.c());
                if (this.f2347q0 != -1) {
                    if (z3) {
                        c0232c.f(c0232c.k(objG2), gVarK, 0, 5);
                    }
                } else if (this.f2348r0 != -1 && z3) {
                    q.g gVarK2 = c0232c.k(objG2);
                    c0232c.f(gVarK, c0232c.k(objG), 0, 5);
                    c0232c.f(gVarK2, gVarK, 0, 5);
                }
                this.f2350u0 = false;
                return;
            }
        }
        if (this.f2347q0 != -1) {
            q.g gVarK3 = c0232c.k(this.f2349s0);
            c0232c.e(gVarK3, c0232c.k(objG), this.f2347q0, 8);
            if (z3) {
                c0232c.f(c0232c.k(objG2), gVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f2348r0 != -1) {
            q.g gVarK4 = c0232c.k(this.f2349s0);
            q.g gVarK5 = c0232c.k(objG2);
            c0232c.e(gVarK4, gVarK5, -this.f2348r0, 8);
            if (z3) {
                c0232c.f(gVarK4, c0232c.k(objG), 0, 5);
                c0232c.f(gVarK5, gVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f2346p0 != -1.0f) {
            q.g gVarK6 = c0232c.k(this.f2349s0);
            q.g gVarK7 = c0232c.k(objG2);
            float f2 = this.f2346p0;
            C0231b c0231bL = c0232c.l();
            c0231bL.f2187d.g(gVarK6, -1.0f);
            c0231bL.f2187d.g(gVarK7, f2);
            c0232c.c(c0231bL);
        }
    }

    @Override // s.C0237d
    public final boolean c() {
        return true;
    }

    @Override // s.C0237d
    public final C0236c g(int i2) {
        int iA = q.f.a(i2);
        if (iA != 1) {
            if (iA != 2) {
                if (iA != 3) {
                    if (iA != 4) {
                        return null;
                    }
                }
            }
            if (this.t0 == 0) {
                return this.f2349s0;
            }
            return null;
        }
        if (this.t0 == 1) {
            return this.f2349s0;
        }
        return null;
    }

    @Override // s.C0237d
    public final boolean y() {
        return this.f2350u0;
    }

    @Override // s.C0237d
    public final boolean z() {
        return this.f2350u0;
    }
}
