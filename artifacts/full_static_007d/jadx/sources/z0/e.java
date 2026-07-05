package z0;

import A.m;
import H0.h;
import b0.C0091q;
import j0.AbstractC0150d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.conscrypt.BuildConfig;
import u0.i;
import u0.k;
import u0.u;

/* loaded from: classes.dex */
public abstract class e {
    static {
        h hVar = h.f413d;
        m.e("\"\\");
        m.e("\t ,=");
    }

    public static final boolean a(u uVar) {
        if (AbstractC0150d.a((String) uVar.f2566a.f120d, "HEAD")) {
            return false;
        }
        int i2 = uVar.f2569d;
        return (((i2 >= 100 && i2 < 200) || i2 == 204 || i2 == 304) && v0.b.j(uVar) == -1 && !"chunked".equalsIgnoreCase(u.f("Transfer-Encoding", uVar))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0209, code lost:
    
        if (((java.util.regex.Pattern) r2.f1739b).matcher(r0).matches() == false) goto L113;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(u0.b bVar, u0.m mVar, k kVar) {
        C0091q c0091q;
        List listUnmodifiableList;
        C0091q c0091q2;
        i iVar;
        String strSubstring;
        String str;
        int iJ;
        String str2;
        C0091q c0091q3;
        boolean z2;
        int i2 = 1;
        AbstractC0150d.e(bVar, "<this>");
        AbstractC0150d.e(mVar, "url");
        AbstractC0150d.e(kVar, "headers");
        if (bVar == u0.b.f2415b) {
            return;
        }
        Pattern pattern = i.f2458j;
        int size = kVar.size();
        int i3 = 0;
        int i4 = 0;
        ArrayList arrayList = null;
        while (i4 < size) {
            int i5 = i4 + 1;
            if ("Set-Cookie".equalsIgnoreCase(kVar.b(i4))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(kVar.d(i4));
            }
            i4 = i5;
        }
        C0091q c0091q4 = C0091q.f1234a;
        if (arrayList != null) {
            ?? UnmodifiableList = Collections.unmodifiableList(arrayList);
            AbstractC0150d.d(UnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            c0091q = UnmodifiableList;
        } else {
            c0091q = c0091q4;
        }
        int size2 = c0091q.size();
        int i6 = 0;
        ArrayList arrayList2 = null;
        while (i6 < size2) {
            int i7 = i6 + 1;
            String str3 = (String) c0091q.get(i6);
            AbstractC0150d.e(str3, "setCookie");
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = v0.b.f2808a;
            char c2 = ';';
            int iE = v0.b.e(str3, ';', i3, str3.length());
            int iE2 = v0.b.e(str3, '=', i3, iE);
            if (iE2 == iE) {
                c0091q2 = c0091q4;
            } else {
                String strY = v0.b.y(str3, i3, iE2);
                if (strY.length() != 0 && v0.b.l(strY) == -1) {
                    String strY2 = v0.b.y(str3, iE2 + i2, iE);
                    if (v0.b.l(strY2) != -1) {
                        c0091q2 = c0091q4;
                    } else {
                        int i8 = iE + i2;
                        int length = str3.length();
                        long j2 = 253402300799999L;
                        ?? r26 = i2;
                        long jO = 253402300799999L;
                        String str4 = null;
                        long j3 = -1;
                        boolean z3 = false;
                        boolean z4 = false;
                        boolean z5 = false;
                        String str5 = null;
                        while (true) {
                            if (i8 < length) {
                                int iE3 = v0.b.e(str3, c2, i8, length);
                                int iE4 = v0.b.e(str3, '=', i8, iE3);
                                String strY3 = v0.b.y(str3, i8, iE4);
                                String strY4 = iE4 < iE3 ? v0.b.y(str3, iE4 + 1, iE3) : BuildConfig.FLAVOR;
                                if (strY3.equalsIgnoreCase("expires")) {
                                    try {
                                        jO = C0.m.o(strY4, strY4.length());
                                        c0091q3 = c0091q4;
                                        z2 = true;
                                        z5 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                        c0091q3 = c0091q4;
                                    }
                                } else {
                                    if (strY3.equalsIgnoreCase("max-age")) {
                                        try {
                                            long j4 = Long.parseLong(strY4);
                                            c0091q3 = c0091q4;
                                            j3 = j4 > 0 ? j4 : Long.MIN_VALUE;
                                        } catch (NumberFormatException e2) {
                                            Pattern patternCompile = Pattern.compile("-?\\d+");
                                            c0091q3 = c0091q4;
                                            try {
                                                AbstractC0150d.d(patternCompile, "compile(...)");
                                                if (!patternCompile.matcher(strY4).matches()) {
                                                    throw e2;
                                                }
                                                j3 = q0.k.B(strY4, false, "-") ? Long.MIN_VALUE : Long.MAX_VALUE;
                                            } catch (NumberFormatException | IllegalArgumentException unused2) {
                                            }
                                        }
                                        z2 = true;
                                        z5 = true;
                                    } else {
                                        c0091q3 = c0091q4;
                                        if (strY3.equalsIgnoreCase("domain")) {
                                            if (strY4.endsWith(".")) {
                                                throw new IllegalArgumentException("Failed requirement.");
                                            }
                                            String strU = C0.m.u(q0.d.L(strY4, "."));
                                            if (strU == null) {
                                                throw new IllegalArgumentException();
                                            }
                                            str4 = strU;
                                            z2 = true;
                                            r26 = 0;
                                        } else if (strY3.equalsIgnoreCase("path")) {
                                            str5 = strY4;
                                        } else if (strY3.equalsIgnoreCase("secure")) {
                                            z2 = true;
                                            z3 = true;
                                        } else if (strY3.equalsIgnoreCase("httponly")) {
                                            z2 = true;
                                            z4 = true;
                                        }
                                    }
                                    z2 = true;
                                }
                                i8 = iE3 + 1;
                                c0091q4 = c0091q3;
                                c2 = ';';
                                r26 = r26;
                            } else {
                                c0091q2 = c0091q4;
                                if (j3 == Long.MIN_VALUE) {
                                    j2 = Long.MIN_VALUE;
                                } else if (j3 != -1) {
                                    long j5 = jCurrentTimeMillis + (j3 <= 9223372036854775L ? j3 * 1000 : Long.MAX_VALUE);
                                    if (j5 >= jCurrentTimeMillis && j5 <= 253402300799999L) {
                                        j2 = j5;
                                    }
                                } else {
                                    j2 = jO;
                                }
                                String str6 = mVar.f2486d;
                                if (str4 == null) {
                                    str4 = str6;
                                } else {
                                    if (!AbstractC0150d.a(str6, str4)) {
                                        AbstractC0150d.e(str6, "<this>");
                                        if (str6.endsWith(str4)) {
                                            i2 = 1;
                                            if (str6.charAt((str6.length() - str4.length()) - 1) == '.') {
                                                j0.g gVar = v0.b.f2814g;
                                                gVar.getClass();
                                            }
                                        } else {
                                            i2 = 1;
                                        }
                                        i3 = 0;
                                    }
                                    if (str6.length() != str4.length() || PublicSuffixDatabase.f2143g.a(str4) != null) {
                                        strSubstring = "/";
                                        str = str5;
                                        i3 = 0;
                                        if (str == null && q0.k.B(str, false, "/")) {
                                            str2 = str;
                                        } else {
                                            String strB = mVar.b();
                                            iJ = q0.d.J(strB, '/', 0, 6);
                                            if (iJ != 0) {
                                                strSubstring = strB.substring(0, iJ);
                                                AbstractC0150d.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                            }
                                            str2 = strSubstring;
                                        }
                                        iVar = new i(strY, strY2, j2, str4, str2, z3, z4, z5, r26);
                                    }
                                }
                                i2 = 1;
                                if (str6.length() != str4.length()) {
                                }
                                strSubstring = "/";
                                str = str5;
                                i3 = 0;
                                if (str == null) {
                                    String strB2 = mVar.b();
                                    iJ = q0.d.J(strB2, '/', 0, 6);
                                    if (iJ != 0) {
                                    }
                                    str2 = strSubstring;
                                    iVar = new i(strY, strY2, j2, str4, str2, z3, z4, z5, r26);
                                }
                            }
                        }
                    }
                    iVar = null;
                    i3 = 0;
                }
                if (iVar != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(iVar);
                }
                i6 = i7;
                c0091q4 = c0091q2;
            }
            iVar = null;
            if (iVar != null) {
            }
            i6 = i7;
            c0091q4 = c0091q2;
        }
        C0091q c0091q5 = c0091q4;
        if (arrayList2 != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            AbstractC0150d.d(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
        } else {
            listUnmodifiableList = c0091q5;
        }
        listUnmodifiableList.isEmpty();
    }
}
