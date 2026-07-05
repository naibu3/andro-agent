package q0;

import b0.AbstractC0084j;
import j0.AbstractC0150d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class d extends k {
    public static boolean C(CharSequence charSequence, char c2) {
        AbstractC0150d.e(charSequence, "<this>");
        return G(charSequence, c2, 0, 2) >= 0;
    }

    public static boolean D(CharSequence charSequence, String str) {
        AbstractC0150d.e(charSequence, "<this>");
        return H(charSequence, str, 0, 2) >= 0;
    }

    public static final int E(CharSequence charSequence) {
        AbstractC0150d.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* JADX WARN: Incorrect condition in loop: B:21:0x004c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int F(CharSequence charSequence, String str, int i2, boolean z2) {
        AbstractC0150d.e(charSequence, "<this>");
        AbstractC0150d.e(str, "string");
        if (!z2 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i2);
        }
        int length = charSequence.length();
        if (i2 < 0) {
            i2 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        n0.c cVar = new n0.c(i2, length, 1);
        boolean z3 = charSequence instanceof String;
        int i3 = cVar.f2133c;
        int i4 = cVar.f2132b;
        if (!z3) {
            if ((i3 > 0 && i2 <= i4) || (i3 < 0 && i4 <= i2)) {
                while (!K(str, 0, charSequence, i2, str.length(), z2)) {
                    if (i2 != i4) {
                        i2 += i3;
                    }
                }
                return i2;
            }
            return -1;
        }
        if ((i3 > 0 && i2 <= i4) || (i3 < 0 && i4 <= i2)) {
            while (!k.y(0, i, str.length(), str, (String) charSequence, z2)) {
                if (i2 != i4) {
                    i2 += i3;
                }
            }
            return i2;
        }
        return -1;
    }

    public static int G(CharSequence charSequence, char c2, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        AbstractC0150d.e(charSequence, "<this>");
        return !(charSequence instanceof String) ? I(charSequence, new char[]{c2}, i2, false) : ((String) charSequence).indexOf(c2, i2);
    }

    public static /* synthetic */ int H(CharSequence charSequence, String str, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return F(charSequence, str, i2, false);
    }

    public static final int I(CharSequence charSequence, char[] cArr, int i2, boolean z2) {
        AbstractC0150d.e(charSequence, "<this>");
        if (!z2 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i2);
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int iE = E(charSequence);
        if (i2 > iE) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i2);
            for (char c2 : cArr) {
                if (C0.f.n(c2, cCharAt, z2)) {
                    return i2;
                }
            }
            if (i2 == iE) {
                return -1;
            }
            i2++;
        }
    }

    public static int J(String str, char c2, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = E(str);
        }
        AbstractC0150d.e(str, "<this>");
        return str.lastIndexOf(c2, i2);
    }

    public static final boolean K(String str, int i2, CharSequence charSequence, int i3, int i4, boolean z2) {
        AbstractC0150d.e(str, "<this>");
        AbstractC0150d.e(charSequence, "other");
        if (i3 < 0 || i2 < 0 || i2 > str.length() - i4 || i3 > charSequence.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!C0.f.n(str.charAt(i2 + i5), charSequence.charAt(i3 + i5), z2)) {
                return false;
            }
        }
        return true;
    }

    public static String L(String str, String str2) {
        if (!k.B(str, false, str2)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        AbstractC0150d.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static List M(String str, char[] cArr) {
        AbstractC0150d.e(str, "<this>");
        if (cArr.length == 1) {
            String strValueOf = String.valueOf(cArr[0]);
            int iF = F(str, strValueOf, 0, false);
            if (iF == -1) {
                return C0.d.y(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int length = 0;
            do {
                arrayList.add(str.subSequence(length, iF).toString());
                length = strValueOf.length() + iF;
                iF = F(str, strValueOf, length, false);
            } while (iF != -1);
            arrayList.add(str.subSequence(length, str.length()).toString());
            return arrayList;
        }
        p0.f fVar = new p0.f(new c(str, new l(0, cArr)));
        ArrayList arrayList2 = new ArrayList(AbstractC0084j.I(fVar));
        Iterator it = fVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList2;
            }
            n0.c cVar = (n0.c) bVar.next();
            AbstractC0150d.e(cVar, "range");
            arrayList2.add(str.subSequence(cVar.f2131a, cVar.f2132b + 1).toString());
        }
    }

    public static String N(String str) {
        AbstractC0150d.e(str, "<this>");
        AbstractC0150d.e(str, "missingDelimiterValue");
        int iJ = J(str, '.', 0, 6);
        if (iJ == -1) {
            return str;
        }
        String strSubstring = str.substring(iJ + 1, str.length());
        AbstractC0150d.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String O(String str, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(A.e.b("Requested character count ", i2, " is less than zero.").toString());
        }
        int length = str.length();
        if (i2 > length) {
            i2 = length;
        }
        String strSubstring = str.substring(0, i2);
        AbstractC0150d.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence P(String str) {
        AbstractC0150d.e(str, "<this>");
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            char cCharAt = str.charAt(!z2 ? i2 : length);
            boolean z3 = Character.isWhitespace(cCharAt) || Character.isSpaceChar(cCharAt);
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return str.subSequence(i2, length + 1);
    }
}
