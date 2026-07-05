package w0;

import B0.h;
import E.c;
import j0.AbstractC0150d;
import java.io.IOException;
import java.util.ArrayList;
import q0.d;
import u0.k;
import u0.n;
import u0.r;
import u0.t;
import u0.u;
import u0.v;
import u0.w;
import z0.f;

/* loaded from: classes.dex */
public final class b implements n {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    @Override // u0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u a(f fVar) throws IOException {
        k kVar;
        k kVar2;
        int i2;
        int i3;
        int i4;
        String string;
        int length;
        System.currentTimeMillis();
        h hVar = fVar.f2975e;
        c cVar = new c(hVar, null, 9);
        u0.c cVar2 = (u0.c) hVar.f123g;
        if (cVar2 == null) {
            int i5 = u0.c.f2417n;
            k kVar3 = (k) hVar.f119c;
            int size = kVar3.size();
            String str = null;
            boolean z2 = true;
            boolean z3 = false;
            boolean z4 = false;
            int iX = -1;
            int iX2 = -1;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            int iX3 = -1;
            int iX4 = -1;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            while (i2 < size) {
                int i6 = i2 + 1;
                String strB = kVar3.b(i2);
                String strD = kVar3.d(i2);
                if (q0.k.x(strB, "Cache-Control")) {
                    if (str == null) {
                        str = strD;
                    }
                    i3 = 0;
                    while (i3 < strD.length()) {
                        int length2 = strD.length();
                        int length3 = i3;
                        while (true) {
                            if (length3 >= length2) {
                                length3 = strD.length();
                                break;
                            }
                            int i7 = length3 + 1;
                            if (d.C("=,;", strD.charAt(length3))) {
                                break;
                            }
                            length3 = i7;
                        }
                        String strSubstring = strD.substring(i3, length3);
                        AbstractC0150d.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        String string2 = d.P(strSubstring).toString();
                        if (length3 == strD.length() || strD.charAt(length3) == ',' || strD.charAt(length3) == ';') {
                            i4 = length3 + 1;
                            string = null;
                        } else {
                            int length4 = length3 + 1;
                            byte[] bArr = v0.b.f2808a;
                            int length5 = strD.length();
                            while (true) {
                                if (length4 >= length5) {
                                    length4 = strD.length();
                                    break;
                                }
                                int i8 = length4 + 1;
                                char cCharAt = strD.charAt(length4);
                                int i9 = length5;
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length4 = i8;
                                length5 = i9;
                            }
                            if (length4 >= strD.length() || strD.charAt(length4) != '\"') {
                                int length6 = strD.length();
                                int i10 = length4;
                                while (true) {
                                    if (i10 >= length6) {
                                        length = strD.length();
                                        break;
                                    }
                                    int i11 = i10 + 1;
                                    int i12 = length6;
                                    int i13 = i10;
                                    if (d.C(",;", strD.charAt(i10))) {
                                        length = i13;
                                        break;
                                    }
                                    length6 = i12;
                                    i10 = i11;
                                }
                                String strSubstring2 = strD.substring(length4, length);
                                AbstractC0150d.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                string = d.P(strSubstring2).toString();
                                i4 = length;
                            } else {
                                int i14 = length4 + 1;
                                int iG = d.G(strD, '\"', i14, 4);
                                String strSubstring3 = strD.substring(i14, iG);
                                AbstractC0150d.d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                i4 = iG + 1;
                                string = strSubstring3;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(string2)) {
                            i3 = i4;
                            z3 = true;
                        } else if ("no-store".equalsIgnoreCase(string2)) {
                            i3 = i4;
                            z4 = true;
                        } else {
                            if ("max-age".equalsIgnoreCase(string2)) {
                                iX = v0.b.x(string, -1);
                            } else if ("s-maxage".equalsIgnoreCase(string2)) {
                                iX2 = v0.b.x(string, -1);
                            } else if ("private".equalsIgnoreCase(string2)) {
                                i3 = i4;
                                z5 = true;
                            } else if ("public".equalsIgnoreCase(string2)) {
                                i3 = i4;
                                z6 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(string2)) {
                                i3 = i4;
                                z7 = true;
                            } else if ("max-stale".equalsIgnoreCase(string2)) {
                                iX3 = v0.b.x(string, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(string2)) {
                                iX4 = v0.b.x(string, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(string2)) {
                                i3 = i4;
                                z8 = true;
                            } else if ("no-transform".equalsIgnoreCase(string2)) {
                                i3 = i4;
                                z9 = true;
                            } else if ("immutable".equalsIgnoreCase(string2)) {
                                i3 = i4;
                                z10 = true;
                            }
                            i3 = i4;
                        }
                    }
                } else {
                    i2 = q0.k.x(strB, "Pragma") ? 0 : i6;
                }
                z2 = false;
                i3 = 0;
                while (i3 < strD.length()) {
                }
            }
            cVar2 = new u0.c(z3, z4, iX, iX2, z5, z6, z7, iX3, iX4, z8, z9, z10, !z2 ? null : str);
            hVar.f123g = cVar2;
        }
        if (cVar2.f2426j) {
            Object obj = null;
            cVar = new c(obj, obj, 9);
        }
        y0.h hVar2 = fVar.f2971a;
        h hVar3 = (h) cVar.f271b;
        u uVar = (u) cVar.f272c;
        if (hVar3 == null && uVar == null) {
            ArrayList arrayList = new ArrayList(20);
            r rVar = r.HTTP_1_1;
            v vVar = v0.b.f2810c;
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            u uVar2 = new u(hVar, rVar, "Unsatisfiable Request (only-if-cached)", 504, null, new k((String[]) array), vVar, null, null, null, -1L, jCurrentTimeMillis, null);
            AbstractC0150d.e(hVar2, "call");
            return uVar2;
        }
        if (hVar3 == null) {
            AbstractC0150d.b(uVar);
            t tVarI = uVar.i();
            u uVarA = a.a(uVar);
            t.b("cacheResponse", uVarA);
            tVarI.f2561i = uVarA;
            u uVarA2 = tVarI.a();
            AbstractC0150d.e(hVar2, "call");
            return uVarA2;
        }
        if (uVar != null) {
            AbstractC0150d.e(hVar2, "call");
        }
        u uVarB = fVar.b(hVar3);
        if (uVar != null) {
            if (uVarB.f2569d == 304) {
                t tVarI2 = uVar.i();
                A.f fVar2 = new A.f(29);
                k kVar4 = uVar.f2571f;
                int size2 = kVar4.size();
                int i15 = 0;
                while (true) {
                    kVar = uVarB.f2571f;
                    if (i15 >= size2) {
                        break;
                    }
                    int i16 = i15 + 1;
                    String strB2 = kVar4.b(i15);
                    String strD2 = kVar4.d(i15);
                    if ("Warning".equalsIgnoreCase(strB2)) {
                        kVar2 = kVar4;
                        if (q0.k.B(strD2, false, "1")) {
                        }
                        i15 = i16;
                        kVar4 = kVar2;
                    } else {
                        kVar2 = kVar4;
                    }
                    if ("Content-Length".equalsIgnoreCase(strB2) || "Content-Encoding".equalsIgnoreCase(strB2) || "Content-Type".equalsIgnoreCase(strB2) || !a.b(strB2) || kVar.a(strB2) == null) {
                        fVar2.z(strB2, strD2);
                    }
                    i15 = i16;
                    kVar4 = kVar2;
                }
                int i17 = 0;
                int size3 = kVar.size();
                while (i17 < size3) {
                    int i18 = i17 + 1;
                    String strB3 = kVar.b(i17);
                    if (!"Content-Length".equalsIgnoreCase(strB3) && !"Content-Encoding".equalsIgnoreCase(strB3) && !"Content-Type".equalsIgnoreCase(strB3) && a.b(strB3)) {
                        fVar2.z(strB3, kVar.d(i17));
                    }
                    i17 = i18;
                }
                tVarI2.f2559f = fVar2.A().c();
                tVarI2.f2563k = uVarB.f2575k;
                tVarI2.f2564l = uVarB.f2576l;
                u uVarA3 = a.a(uVar);
                t.b("cacheResponse", uVarA3);
                tVarI2.f2561i = uVarA3;
                u uVarA4 = a.a(uVarB);
                t.b("networkResponse", uVarA4);
                tVarI2.h = uVarA4;
                tVarI2.a();
                w wVar = uVarB.f2572g;
                AbstractC0150d.b(wVar);
                wVar.close();
                AbstractC0150d.b(null);
                throw null;
            }
            w wVar2 = uVar.f2572g;
            if (wVar2 != null) {
                v0.b.c(wVar2);
            }
        }
        t tVarI3 = uVarB.i();
        u uVarA5 = a.a(uVar);
        t.b("cacheResponse", uVarA5);
        tVarI3.f2561i = uVarA5;
        u uVarA6 = a.a(uVarB);
        t.b("networkResponse", uVarA6);
        tVarI3.h = uVarA6;
        return tVarI3.a();
    }
}
