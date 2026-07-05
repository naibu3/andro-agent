package G0;

import A.e;
import C0.m;
import b0.C0091q;
import j0.AbstractC0150d;
import j0.g;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import q0.k;

/* loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f313a = new c();

    public static List a(X509Certificate x509Certificate, int i2) throws CertificateParsingException {
        Object obj;
        C0091q c0091q = C0091q.f1234a;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return c0091q;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && AbstractC0150d.a(list.get(0), Integer.valueOf(i2)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return c0091q;
        }
    }

    public static boolean b(String str) {
        int i2;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(e.b("endIndex < beginIndex: ", length2, " < 0").toString());
        }
        if (length2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + length2 + " > " + str.length()).toString());
        }
        long j2 = 0;
        int i3 = 0;
        while (i3 < length2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < 128) {
                j2++;
            } else {
                if (cCharAt < 2048) {
                    i2 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i2 = 3;
                } else {
                    int i4 = i3 + 1;
                    char cCharAt2 = i4 < length2 ? str.charAt(i4) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j2++;
                        i3 = i4;
                    } else {
                        j2 += 4;
                        i3 += 2;
                    }
                }
                j2 += i2;
            }
            i3++;
        }
        return length == ((int) j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        boolean zA;
        int length;
        AbstractC0150d.e(str, "host");
        AbstractC0150d.e(x509Certificate, "certificate");
        byte[] bArr = v0.b.f2808a;
        g gVar = v0.b.f2814g;
        gVar.getClass();
        if (((Pattern) gVar.f1739b).matcher(str).matches()) {
            String strU = m.u(str);
            List listA = a(x509Certificate, 7);
            if (!listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    if (AbstractC0150d.a(strU, m.u((String) it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            if (b(str)) {
                Locale locale = Locale.US;
                AbstractC0150d.d(locale, "US");
                str = str.toLowerCase(locale);
                AbstractC0150d.d(str, "this as java.lang.String).toLowerCase(locale)");
            }
            List<String> listA2 = a(x509Certificate, 2);
            if (!listA2.isEmpty()) {
                for (String lowerCase : listA2) {
                    if (str.length() != 0 && !k.B(str, false, ".") && !str.endsWith("..") && lowerCase != null && lowerCase.length() != 0 && !k.B(lowerCase, false, ".") && !lowerCase.endsWith("..")) {
                        String strH = !str.endsWith(".") ? AbstractC0150d.h(".", str) : str;
                        if (!lowerCase.endsWith(".")) {
                            lowerCase = AbstractC0150d.h(".", lowerCase);
                        }
                        if (b(lowerCase)) {
                            Locale locale2 = Locale.US;
                            AbstractC0150d.d(locale2, "US");
                            lowerCase = lowerCase.toLowerCase(locale2);
                            AbstractC0150d.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        }
                        if (!q0.d.D(lowerCase, "*")) {
                            zA = AbstractC0150d.a(strH, lowerCase);
                        } else if (!k.B(lowerCase, false, "*.") || q0.d.G(lowerCase, '*', 1, 4) != -1 || strH.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                            zA = false;
                        } else {
                            String strSubstring = lowerCase.substring(1);
                            AbstractC0150d.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                            if (strH.endsWith(strSubstring) && ((length = strH.length() - strSubstring.length()) <= 0 || q0.d.J(strH, '.', length - 1, 4) == -1)) {
                                zA = true;
                            }
                        }
                    }
                    if (zA) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        AbstractC0150d.e(str, "host");
        AbstractC0150d.e(sSLSession, "session");
        if (!b(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return c(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
