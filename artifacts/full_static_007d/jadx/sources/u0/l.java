package u0;

import b0.AbstractC0084j;
import j0.AbstractC0150d;
import java.util.ArrayList;
import java.util.Iterator;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public String f2475a;

    /* renamed from: d, reason: collision with root package name */
    public String f2478d;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2480f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2481g;
    public String h;

    /* renamed from: b, reason: collision with root package name */
    public String f2476b = BuildConfig.FLAVOR;

    /* renamed from: c, reason: collision with root package name */
    public String f2477c = BuildConfig.FLAVOR;

    /* renamed from: e, reason: collision with root package name */
    public int f2479e = -1;

    public l() {
        ArrayList arrayList = new ArrayList();
        this.f2480f = arrayList;
        arrayList.add(BuildConfig.FLAVOR);
    }

    public final m a() {
        ArrayList arrayList;
        String str = this.f2475a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strE = b.e(this.f2476b, 0, 0, 7);
        String strE2 = b.e(this.f2477c, 0, 0, 7);
        String str2 = this.f2478d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iB = b();
        ArrayList arrayList2 = this.f2480f;
        ArrayList arrayList3 = new ArrayList(AbstractC0084j.I(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(b.e((String) it.next(), 0, 0, 7));
        }
        ArrayList<String> arrayList4 = this.f2481g;
        if (arrayList4 == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(AbstractC0084j.I(arrayList4));
            for (String str3 : arrayList4) {
                arrayList.add(str3 == null ? null : b.e(str3, 0, 0, 3));
            }
        }
        String str4 = this.h;
        return new m(str, strE, strE2, str2, iB, arrayList3, arrayList, str4 != null ? b.e(str4, 0, 0, 7) : null, toString());
    }

    public final int b() {
        int i2 = this.f2479e;
        if (i2 != -1) {
            return i2;
        }
        String str = this.f2475a;
        AbstractC0150d.b(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(m mVar, String str) {
        int i2;
        int iF;
        char c2;
        char cCharAt;
        int i3;
        int i4;
        byte[] bArr = v0.b.f2808a;
        int iM = v0.b.m(str, 0, str.length());
        int iN = v0.b.n(str, iM, str.length());
        if (iN - iM < 2) {
            i2 = -1;
        } else {
            char cCharAt2 = str.charAt(iM);
            char c3 = 'a';
            if ((AbstractC0150d.f(cCharAt2, 97) >= 0 && AbstractC0150d.f(cCharAt2, 122) <= 0) || (AbstractC0150d.f(cCharAt2, 65) >= 0 && AbstractC0150d.f(cCharAt2, 90) <= 0)) {
                i2 = iM + 1;
                while (true) {
                    if (i2 >= iN) {
                        break;
                    }
                    int i5 = i2 + 1;
                    char cCharAt3 = str.charAt(i2);
                    if ((c3 <= cCharAt3 && cCharAt3 < '{') || (('A' <= cCharAt3 && cCharAt3 < '[') || (('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                        i2 = i5;
                        c3 = 'a';
                    } else if (cCharAt3 != ':') {
                        break;
                    }
                }
                i2 = -1;
            }
        }
        if (i2 != -1) {
            if (q0.k.A(str, "https:", iM, true)) {
                this.f2475a = "https";
                iM += 6;
            } else {
                if (!q0.k.A(str, "http:", iM, true)) {
                    StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    String strSubstring = str.substring(0, i2);
                    AbstractC0150d.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb.append(strSubstring);
                    sb.append('\'');
                    throw new IllegalArgumentException(sb.toString());
                }
                this.f2475a = "http";
                iM += 5;
            }
        } else {
            if (mVar == null) {
                throw new IllegalArgumentException(AbstractC0150d.h(str.length() > 6 ? AbstractC0150d.h("...", q0.d.O(str, 6)) : str, "Expected URL scheme 'http' or 'https' but no scheme was found for "));
            }
            this.f2475a = mVar.f2483a;
        }
        int i6 = iM;
        int i7 = 0;
        while (i6 < iN) {
            int i8 = i6 + 1;
            char cCharAt4 = str.charAt(i6);
            if (cCharAt4 != '\\' && cCharAt4 != '/') {
                break;
            }
            i7++;
            i6 = i8;
        }
        ArrayList arrayList = this.f2480f;
        char c4 = '#';
        if (i7 >= 2 || mVar == null) {
            int i9 = iM + i7;
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                iF = v0.b.f(str, "@/\\?#", i9, iN);
                if (iF != iN) {
                    cCharAt = str.charAt(iF);
                    c2 = 65535;
                } else {
                    c2 = 65535;
                    cCharAt = 65535;
                }
                if (cCharAt == c2 || cCharAt == c4 || cCharAt == '/' || cCharAt == '\\' || cCharAt == '?') {
                    break;
                }
                if (cCharAt == '@') {
                    if (z2) {
                        this.f2477c += "%40" + b.b(str, i9, iF, " \"':;<=>@[]^`{}|/\\?#", 240);
                        z2 = z2;
                    } else {
                        boolean z4 = z2;
                        int iE = v0.b.e(str, ':', i9, iF);
                        String strB = b.b(str, i9, iE, " \"':;<=>@[]^`{}|/\\?#", 240);
                        if (z3) {
                            strB = this.f2476b + "%40" + strB;
                        }
                        this.f2476b = strB;
                        if (iE != iF) {
                            this.f2477c = b.b(str, iE + 1, iF, " \"':;<=>@[]^`{}|/\\?#", 240);
                            z2 = true;
                        } else {
                            z2 = z4;
                        }
                        z3 = true;
                    }
                    i9 = iF + 1;
                    c4 = '#';
                }
            }
            int i10 = i9;
            while (true) {
                if (i10 >= iF) {
                    i10 = iF;
                    break;
                }
                char cCharAt5 = str.charAt(i10);
                if (cCharAt5 == '[') {
                    do {
                        i10++;
                        if (i10 >= iF) {
                            break;
                        }
                    } while (str.charAt(i10) != ']');
                    i4 = 1;
                } else if (cCharAt5 == ':') {
                    break;
                } else {
                    i4 = 1;
                }
                i10 += i4;
            }
            int i11 = i10 + 1;
            if (i11 < iF) {
                this.f2478d = C0.m.u(b.e(str, i9, i10, 4));
                try {
                    i3 = Integer.parseInt(b.b(str, i11, iF, BuildConfig.FLAVOR, 248));
                } catch (NumberFormatException unused) {
                }
                if (1 > i3 || i3 >= 65536) {
                    i3 = -1;
                }
                this.f2479e = i3;
                if (i3 == -1) {
                    StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                    String strSubstring2 = str.substring(i11, iF);
                    AbstractC0150d.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb2.append(strSubstring2);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            } else {
                this.f2478d = C0.m.u(b.e(str, i9, i10, 4));
                String str2 = this.f2475a;
                AbstractC0150d.b(str2);
                this.f2479e = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
            }
            if (this.f2478d == null) {
                StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
                String strSubstring3 = str.substring(i9, i10);
                AbstractC0150d.d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                sb3.append(strSubstring3);
                sb3.append('\"');
                throw new IllegalArgumentException(sb3.toString().toString());
            }
            iM = iF;
        } else {
            if (AbstractC0150d.a(mVar.f2483a, this.f2475a)) {
                this.f2476b = mVar.e();
                this.f2477c = mVar.a();
                this.f2478d = mVar.f2486d;
                this.f2479e = mVar.f2487e;
                arrayList.clear();
                arrayList.addAll(mVar.c());
                if (iM == iN || str.charAt(iM) == '#') {
                    String strD = mVar.d();
                    this.f2481g = strD == null ? null : b.f(b.b(strD, 0, 0, " \"'<>#", 211));
                }
            }
        }
        int iF2 = v0.b.f(str, "?#", iM, iN);
        if (iM != iF2) {
            char cCharAt6 = str.charAt(iM);
            if (cCharAt6 == '/' || cCharAt6 == '\\') {
                arrayList.clear();
                arrayList.add(BuildConfig.FLAVOR);
                iM++;
            } else {
                arrayList.set(arrayList.size() - 1, BuildConfig.FLAVOR);
            }
            while (iM < iF2) {
                int iF3 = v0.b.f(str, "/\\", iM, iF2);
                boolean z5 = iF3 < iF2;
                String strB2 = b.b(str, iM, iF3, " \"<>^`{}|/\\?#", 240);
                if (!strB2.equals(".") && !strB2.equalsIgnoreCase("%2e")) {
                    if (!strB2.equals("..") && !strB2.equalsIgnoreCase("%2e.") && !strB2.equalsIgnoreCase(".%2e") && !strB2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strB2);
                        } else {
                            arrayList.add(strB2);
                        }
                        if (z5) {
                            arrayList.add(BuildConfig.FLAVOR);
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add(BuildConfig.FLAVOR);
                    } else {
                        arrayList.set(arrayList.size() - 1, BuildConfig.FLAVOR);
                    }
                }
                iM = z5 ? iF3 + 1 : iF3;
            }
        }
        if (iF2 < iN && str.charAt(iF2) == '?') {
            int iE2 = v0.b.e(str, '#', iF2, iN);
            this.f2481g = b.f(b.b(str, iF2 + 1, iE2, " \"'<>#", 208));
            iF2 = iE2;
        }
        if (iF2 >= iN || str.charAt(iF2) != '#') {
            return;
        }
        this.h = b.b(str, iF2 + 1, iN, BuildConfig.FLAVOR, 176);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f2475a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.f2476b.length() > 0 || this.f2477c.length() > 0) {
            sb.append(this.f2476b);
            if (this.f2477c.length() > 0) {
                sb.append(':');
                sb.append(this.f2477c);
            }
            sb.append('@');
        }
        String str2 = this.f2478d;
        if (str2 != null) {
            if (q0.d.C(str2, ':')) {
                sb.append('[');
                sb.append(this.f2478d);
                sb.append(']');
            } else {
                sb.append(this.f2478d);
            }
        }
        int i2 = -1;
        if (this.f2479e != -1 || this.f2475a != null) {
            int iB = b();
            String str3 = this.f2475a;
            if (str3 == null) {
                sb.append(':');
                sb.append(iB);
            } else {
                if (str3.equals("http")) {
                    i2 = 80;
                } else if (str3.equals("https")) {
                    i2 = 443;
                }
                if (iB != i2) {
                }
            }
        }
        ArrayList arrayList = this.f2480f;
        AbstractC0150d.e(arrayList, "<this>");
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            sb.append('/');
            sb.append((String) arrayList.get(i3));
        }
        if (this.f2481g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.f2481g;
            AbstractC0150d.b(arrayList2);
            n0.a aVarT = C0.m.t(C0.m.v(0, arrayList2.size()), 2);
            int i4 = aVarT.f2131a;
            int i5 = aVarT.f2132b;
            int i6 = aVarT.f2133c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    int i7 = i4 + i6;
                    String str4 = (String) arrayList2.get(i4);
                    String str5 = (String) arrayList2.get(i4 + 1);
                    if (i4 > 0) {
                        sb.append('&');
                    }
                    sb.append(str4);
                    if (str5 != null) {
                        sb.append('=');
                        sb.append(str5);
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 = i7;
                }
            }
        }
        if (this.h != null) {
            sb.append('#');
            sb.append(this.h);
        }
        String string = sb.toString();
        AbstractC0150d.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
