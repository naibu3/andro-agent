package u0;

import j0.AbstractC0150d;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f2414a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final b f2415b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final b f2416c = new b();

    public static final g a(b bVar, String str) {
        g gVar = new g(str);
        g.f2435d.put(str, gVar);
        return gVar;
    }

    public static String b(String str, int i2, int i3, String str2, int i4) throws EOFException {
        int i5 = (i4 & 1) != 0 ? 0 : i2;
        int length = (i4 & 2) != 0 ? str.length() : i3;
        boolean z2 = (i4 & 8) == 0;
        boolean z3 = (i4 & 16) == 0;
        boolean z4 = (i4 & 32) == 0;
        boolean z5 = (i4 & 64) == 0;
        AbstractC0150d.e(str, "<this>");
        int iCharCount = i5;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i6 = 32;
            int i7 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z5) || q0.d.C(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z2 || (z3 && !d(str, iCharCount, length)))) || (iCodePointAt == 43 && z4)))) {
                H0.e eVar = new H0.e();
                eVar.y(str, i5, iCharCount);
                H0.e eVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z2 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z4) {
                            eVar.x(z2 ? "+" : "%2B");
                        } else if (iCodePointAt2 < i6 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i7 && !z5) || q0.d.C(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z2 || (z3 && !d(str, iCharCount, length)))))) {
                            if (eVar2 == null) {
                                eVar2 = new H0.e();
                            }
                            eVar2.z(iCodePointAt2);
                            while (!eVar2.f()) {
                                byte bI = eVar2.i();
                                eVar.u(37);
                                char[] cArr = m.f2482j;
                                eVar.u(cArr[((bI & 255) >> 4) & 15]);
                                eVar.u(cArr[bI & 15]);
                            }
                        } else {
                            eVar.z(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i6 = 32;
                    i7 = 128;
                }
                return eVar.n(eVar.f412b, q0.a.f2219a);
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i5, length);
        AbstractC0150d.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static boolean d(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && v0.b.q(str.charAt(i2 + 1)) != -1 && v0.b.q(str.charAt(i4)) != -1;
    }

    public static String e(String str, int i2, int i3, int i4) {
        int i5;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        boolean z2 = (i4 & 4) == 0;
        AbstractC0150d.e(str, "<this>");
        int iCharCount = i2;
        while (iCharCount < i3) {
            int i6 = iCharCount + 1;
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z2)) {
                H0.e eVar = new H0.e();
                eVar.y(str, i2, iCharCount);
                while (iCharCount < i3) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i5 = iCharCount + 2) < i3) {
                        int iQ = v0.b.q(str.charAt(iCharCount + 1));
                        int iQ2 = v0.b.q(str.charAt(i5));
                        if (iQ == -1 || iQ2 == -1) {
                            eVar.z(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            eVar.u((iQ << 4) + iQ2);
                            iCharCount = Character.charCount(iCodePointAt) + i5;
                        }
                    } else if (iCodePointAt == 43 && z2) {
                        eVar.u(32);
                        iCharCount++;
                    } else {
                        eVar.z(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return eVar.n(eVar.f412b, q0.a.f2219a);
            }
            iCharCount = i6;
        }
        String strSubstring = str.substring(i2, i3);
        AbstractC0150d.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int iG = q0.d.G(str, '&', i2, 4);
            if (iG == -1) {
                iG = str.length();
            }
            int iG2 = q0.d.G(str, '=', i2, 4);
            if (iG2 == -1 || iG2 > iG) {
                String strSubstring = str.substring(i2, iG);
                AbstractC0150d.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i2, iG2);
                AbstractC0150d.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iG2 + 1, iG);
                AbstractC0150d.d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring3);
            }
            i2 = iG + 1;
        }
        return arrayList;
    }

    public synchronized g c(String str) {
        g gVar;
        String strH;
        try {
            AbstractC0150d.e(str, "javaName");
            LinkedHashMap linkedHashMap = g.f2435d;
            gVar = (g) linkedHashMap.get(str);
            if (gVar == null) {
                if (q0.k.B(str, false, "TLS_")) {
                    String strSubstring = str.substring(4);
                    AbstractC0150d.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                    strH = AbstractC0150d.h(strSubstring, "SSL_");
                } else if (q0.k.B(str, false, "SSL_")) {
                    String strSubstring2 = str.substring(4);
                    AbstractC0150d.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    strH = AbstractC0150d.h(strSubstring2, "TLS_");
                } else {
                    strH = str;
                }
                gVar = (g) linkedHashMap.get(strH);
                if (gVar == null) {
                    gVar = new g(str);
                }
                linkedHashMap.put(str, gVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return gVar;
    }
}
