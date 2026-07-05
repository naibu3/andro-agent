package A0;

import H0.o;
import j0.AbstractC0150d;
import org.conscrypt.BuildConfig;
import u0.k;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final o f28a;

    /* renamed from: b, reason: collision with root package name */
    public long f29b;

    public a(o oVar) {
        AbstractC0150d.e(oVar, "source");
        this.f28a = oVar;
        this.f29b = 262144L;
    }

    public final k a() {
        A.f fVar = new A.f(29);
        while (true) {
            String strO = this.f28a.o(this.f29b);
            this.f29b -= strO.length();
            if (strO.length() == 0) {
                return fVar.A();
            }
            int iG = q0.d.G(strO, ':', 1, 4);
            if (iG != -1) {
                String strSubstring = strO.substring(0, iG);
                AbstractC0150d.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = strO.substring(iG + 1);
                AbstractC0150d.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                fVar.z(strSubstring, strSubstring2);
            } else if (strO.charAt(0) == ':') {
                String strSubstring3 = strO.substring(1);
                AbstractC0150d.d(strSubstring3, "this as java.lang.String).substring(startIndex)");
                fVar.z(BuildConfig.FLAVOR, strSubstring3);
            } else {
                fVar.z(BuildConfig.FLAVOR, strO);
            }
        }
    }
}
