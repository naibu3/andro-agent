package q0;

import C0.m;
import b0.AbstractC0082h;
import b0.C0091q;
import j0.AbstractC0150d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public abstract class e extends m {
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010d A[PHI: r10
      0x010d: PHI (r10v2 java.lang.String) = (r10v1 java.lang.String), (r10v3 java.lang.String) binds: [B:77:0x010d, B:51:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String w(String str) {
        List listY;
        int length;
        int i2;
        AbstractC0150d.e(str, "<this>");
        for (int i3 = 0; i3 < 1; i3++) {
            char cCharAt = "|".charAt(i3);
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                List listAsList = Arrays.asList("\r\n", "\n", "\r");
                AbstractC0150d.d(listAsList, "asList(...)");
                b bVar = new b(new c(str, new l(1, listAsList)));
                if (bVar.hasNext()) {
                    n0.c cVar = (n0.c) bVar.next();
                    AbstractC0150d.e(cVar, "it");
                    String string = str.subSequence(cVar.f2131a, cVar.f2132b + 1).toString();
                    if (bVar.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(string);
                        while (bVar.hasNext()) {
                            n0.c cVar2 = (n0.c) bVar.next();
                            AbstractC0150d.e(cVar2, "it");
                            arrayList.add(str.subSequence(cVar2.f2131a, cVar2.f2132b + 1).toString());
                        }
                        listY = arrayList;
                    } else {
                        listY = C0.d.y(string);
                    }
                } else {
                    listY = C0091q.f1234a;
                }
                int length2 = str.length();
                listY.size();
                int size = listY.size() - 1;
                ArrayList arrayList2 = new ArrayList();
                int i4 = 0;
                for (Object obj : listY) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str2 = (String) obj;
                    String strSubstring = null;
                    if (i4 == 0 || i4 == size) {
                        AbstractC0150d.e(str2, "<this>");
                        for (int i6 = 0; i6 < str2.length(); i6++) {
                            char cCharAt2 = str2.charAt(i6);
                            if (!Character.isWhitespace(cCharAt2) && !Character.isSpaceChar(cCharAt2)) {
                                length = str2.length();
                                i2 = 0;
                                while (true) {
                                    if (i2 < length) {
                                        i2 = -1;
                                        break;
                                    }
                                    char cCharAt3 = str2.charAt(i2);
                                    if (!Character.isWhitespace(cCharAt3) && !Character.isSpaceChar(cCharAt3)) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (i2 != -1 && k.A(str2, "|", i2, false)) {
                                    strSubstring = str2.substring(i2 + 1);
                                    AbstractC0150d.d(strSubstring, "substring(...)");
                                }
                                if (strSubstring != null) {
                                    str2 = strSubstring;
                                }
                            }
                        }
                        str2 = strSubstring;
                    } else {
                        length = str2.length();
                        i2 = 0;
                        while (true) {
                            if (i2 < length) {
                            }
                            i2++;
                        }
                        if (i2 != -1) {
                            strSubstring = str2.substring(i2 + 1);
                            AbstractC0150d.d(strSubstring, "substring(...)");
                        }
                        if (strSubstring != null) {
                        }
                    }
                    if (str2 != null) {
                        arrayList2.add(str2);
                    }
                    i4 = i5;
                }
                StringBuilder sb = new StringBuilder(length2);
                AbstractC0082h.K(arrayList2, sb, "\n", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "...", null);
                String string2 = sb.toString();
                AbstractC0150d.d(string2, "toString(...)");
                return string2;
            }
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.");
    }
}
