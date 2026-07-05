package u0;

import j0.AbstractC0150d;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f2482j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    public final String f2483a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2484b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2485c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2486d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2487e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2488f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2489g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2490i;

    public m(String str, String str2, String str3, String str4, int i2, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        AbstractC0150d.e(str, "scheme");
        AbstractC0150d.e(str4, "host");
        this.f2483a = str;
        this.f2484b = str2;
        this.f2485c = str3;
        this.f2486d = str4;
        this.f2487e = i2;
        this.f2488f = arrayList2;
        this.f2489g = str5;
        this.h = str6;
        this.f2490i = str.equals("https");
    }

    public final String a() {
        if (this.f2485c.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        int length = this.f2483a.length() + 3;
        String str = this.h;
        String strSubstring = str.substring(q0.d.G(str, ':', length, 4) + 1, q0.d.G(str, '@', 0, 6));
        AbstractC0150d.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String b() {
        int length = this.f2483a.length() + 3;
        String str = this.h;
        int iG = q0.d.G(str, '/', length, 4);
        String strSubstring = str.substring(iG, v0.b.f(str, "?#", iG, str.length()));
        AbstractC0150d.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.f2483a.length() + 3;
        String str = this.h;
        int iG = q0.d.G(str, '/', length, 4);
        int iF = v0.b.f(str, "?#", iG, str.length());
        ArrayList arrayList = new ArrayList();
        while (iG < iF) {
            int i2 = iG + 1;
            int iE = v0.b.e(str, '/', i2, iF);
            String strSubstring = str.substring(i2, iE);
            AbstractC0150d.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iG = iE;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f2488f == null) {
            return null;
        }
        String str = this.h;
        int iG = q0.d.G(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iG, v0.b.e(str, '#', iG, str.length()));
        AbstractC0150d.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String e() {
        if (this.f2484b.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        int length = this.f2483a.length() + 3;
        String str = this.h;
        String strSubstring = str.substring(length, v0.b.f(str, ":@", length, str.length()));
        AbstractC0150d.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m) && AbstractC0150d.a(((m) obj).h, this.h);
    }

    public final String f() {
        l lVar;
        try {
            lVar = new l();
            lVar.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            lVar = null;
        }
        AbstractC0150d.b(lVar);
        lVar.f2476b = b.b(BuildConfig.FLAVOR, 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        lVar.f2477c = b.b(BuildConfig.FLAVOR, 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return lVar.a().h;
    }

    public final URI g() {
        String strSubstring;
        String strReplaceAll;
        l lVar = new l();
        String str = this.f2483a;
        lVar.f2475a = str;
        lVar.f2476b = e();
        lVar.f2477c = a();
        lVar.f2478d = this.f2486d;
        AbstractC0150d.e(str, "scheme");
        int i2 = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i3 = this.f2487e;
        lVar.f2479e = i3 != i2 ? i3 : -1;
        ArrayList arrayList = lVar.f2480f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        lVar.f2481g = strD == null ? null : b.f(b.b(strD, 0, 0, " \"'<>#", 211));
        if (this.f2489g == null) {
            strSubstring = null;
        } else {
            String str2 = this.h;
            strSubstring = str2.substring(q0.d.G(str2, '#', 0, 6) + 1);
            AbstractC0150d.d(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        lVar.h = strSubstring;
        String str3 = lVar.f2478d;
        if (str3 == null) {
            strReplaceAll = null;
        } else {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            AbstractC0150d.d(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str3).replaceAll(BuildConfig.FLAVOR);
            AbstractC0150d.d(strReplaceAll, "replaceAll(...)");
        }
        lVar.f2478d = strReplaceAll;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.set(i4, b.b((String) arrayList.get(i4), 0, 0, "[]", 227));
        }
        ArrayList arrayList2 = lVar.f2481g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            int i5 = 0;
            while (i5 < size2) {
                int i6 = i5 + 1;
                String str4 = (String) arrayList2.get(i5);
                arrayList2.set(i5, str4 == null ? null : b.b(str4, 0, 0, "\\^`{|}", 195));
                i5 = i6;
            }
        }
        String str5 = lVar.h;
        lVar.h = str5 != null ? b.b(str5, 0, 0, " \"#<>\\^`{|}", 163) : null;
        String string = lVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e2) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                AbstractC0150d.d(patternCompile2, "compile(...)");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll(BuildConfig.FLAVOR);
                AbstractC0150d.d(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                AbstractC0150d.d(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h;
    }
}
