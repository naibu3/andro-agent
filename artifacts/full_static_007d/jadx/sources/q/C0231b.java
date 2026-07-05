package q;

import D0.h;
import java.util.ArrayList;
import org.conscrypt.BuildConfig;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0231b {

    /* renamed from: d, reason: collision with root package name */
    public final C0230a f2187d;

    /* renamed from: a, reason: collision with root package name */
    public g f2184a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f2185b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2186c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f2188e = false;

    public C0231b(h hVar) {
        this.f2187d = new C0230a(this, hVar);
    }

    public final void a(C0232c c0232c, int i2) {
        this.f2187d.g(c0232c.j(i2), 1.0f);
        this.f2187d.g(c0232c.j(i2), -1.0f);
    }

    public final void b(g gVar, g gVar2, g gVar3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f2185b = i2;
        }
        if (z2) {
            this.f2187d.g(gVar, 1.0f);
            this.f2187d.g(gVar2, -1.0f);
            this.f2187d.g(gVar3, -1.0f);
        } else {
            this.f2187d.g(gVar, -1.0f);
            this.f2187d.g(gVar2, 1.0f);
            this.f2187d.g(gVar3, 1.0f);
        }
    }

    public final void c(g gVar, g gVar2, g gVar3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f2185b = i2;
        }
        if (z2) {
            this.f2187d.g(gVar, 1.0f);
            this.f2187d.g(gVar2, -1.0f);
            this.f2187d.g(gVar3, 1.0f);
        } else {
            this.f2187d.g(gVar, -1.0f);
            this.f2187d.g(gVar2, 1.0f);
            this.f2187d.g(gVar3, -1.0f);
        }
    }

    public g d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f2184a == null && this.f2185b == 0.0f && this.f2187d.d() == 0;
    }

    public final g f(boolean[] zArr, g gVar) {
        int i2;
        int iD = this.f2187d.d();
        g gVar2 = null;
        float f2 = 0.0f;
        for (int i3 = 0; i3 < iD; i3++) {
            float f3 = this.f2187d.f(i3);
            if (f3 < 0.0f) {
                g gVarE = this.f2187d.e(i3);
                if ((zArr == null || !zArr[gVarE.f2209b]) && gVarE != gVar && (((i2 = gVarE.f2218l) == 3 || i2 == 4) && f3 < f2)) {
                    f2 = f3;
                    gVar2 = gVarE;
                }
            }
        }
        return gVar2;
    }

    public final void g(g gVar) {
        g gVar2 = this.f2184a;
        if (gVar2 != null) {
            this.f2187d.g(gVar2, -1.0f);
            this.f2184a.f2210c = -1;
            this.f2184a = null;
        }
        float fH = this.f2187d.h(gVar, true) * (-1.0f);
        this.f2184a = gVar;
        if (fH == 1.0f) {
            return;
        }
        this.f2185b /= fH;
        C0230a c0230a = this.f2187d;
        int i2 = c0230a.h;
        for (int i3 = 0; i2 != -1 && i3 < c0230a.f2175a; i3++) {
            float[] fArr = c0230a.f2181g;
            fArr[i2] = fArr[i2] / fH;
            i2 = c0230a.f2180f[i2];
        }
    }

    public final void h(C0232c c0232c, g gVar, boolean z2) {
        if (gVar == null || !gVar.f2213f) {
            return;
        }
        float fC = this.f2187d.c(gVar);
        this.f2185b = (gVar.f2212e * fC) + this.f2185b;
        this.f2187d.h(gVar, z2);
        if (z2) {
            gVar.b(this);
        }
        if (this.f2187d.d() == 0) {
            this.f2188e = true;
            c0232c.f2191a = true;
        }
    }

    public void i(C0232c c0232c, C0231b c0231b, boolean z2) {
        C0230a c0230a = this.f2187d;
        c0230a.getClass();
        float fC = c0230a.c(c0231b.f2184a);
        c0230a.h(c0231b.f2184a, z2);
        C0230a c0230a2 = c0231b.f2187d;
        int iD = c0230a2.d();
        for (int i2 = 0; i2 < iD; i2++) {
            g gVarE = c0230a2.e(i2);
            c0230a.a(gVarE, c0230a2.c(gVarE) * fC, z2);
        }
        this.f2185b = (c0231b.f2185b * fC) + this.f2185b;
        if (z2) {
            c0231b.f2184a.b(this);
        }
        if (this.f2184a == null || this.f2187d.d() != 0) {
            return;
        }
        this.f2188e = true;
        c0232c.f2191a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z2;
        String strC = A.e.c(this.f2184a == null ? "0" : BuildConfig.FLAVOR + this.f2184a, " = ");
        if (this.f2185b != 0.0f) {
            strC = strC + this.f2185b;
            z2 = true;
        } else {
            z2 = false;
        }
        int iD = this.f2187d.d();
        for (int i2 = 0; i2 < iD; i2++) {
            g gVarE = this.f2187d.e(i2);
            if (gVarE != null) {
                float f2 = this.f2187d.f(i2);
                if (f2 != 0.0f) {
                    String string = gVarE.toString();
                    if (!z2) {
                        if (f2 < 0.0f) {
                            strC = A.e.c(strC, "- ");
                            f2 *= -1.0f;
                        }
                        strC = f2 == 1.0f ? A.e.c(strC, string) : strC + f2 + " " + string;
                        z2 = true;
                    } else if (f2 > 0.0f) {
                        strC = A.e.c(strC, " + ");
                        if (f2 == 1.0f) {
                        }
                        z2 = true;
                    } else {
                        strC = A.e.c(strC, " - ");
                        f2 *= -1.0f;
                        if (f2 == 1.0f) {
                        }
                        z2 = true;
                    }
                }
            }
        }
        return !z2 ? A.e.c(strC, "0.0") : strC;
    }
}
