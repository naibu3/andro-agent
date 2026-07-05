package q0;

import j0.AbstractC0150d;

/* loaded from: classes.dex */
public abstract class k extends j {
    public static boolean A(String str, String str2, int i2, boolean z2) {
        AbstractC0150d.e(str, "<this>");
        return !z2 ? str.startsWith(str2, i2) : y(i2, 0, str2.length(), str, str2, z2);
    }

    public static boolean B(String str, boolean z2, String str2) {
        AbstractC0150d.e(str, "<this>");
        AbstractC0150d.e(str2, "prefix");
        return !z2 ? str.startsWith(str2) : y(0, 0, str2.length(), str, str2, z2);
    }

    public static boolean x(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final boolean y(int i2, int i3, int i4, String str, String str2, boolean z2) {
        AbstractC0150d.e(str, "<this>");
        AbstractC0150d.e(str2, "other");
        return !z2 ? str.regionMatches(i2, str2, i3, i4) : str.regionMatches(z2, i2, str2, i3, i4);
    }

    public static String z(String str, String str2, String str3) {
        AbstractC0150d.e(str, "<this>");
        int iF = d.F(str, str2, 0, false);
        if (iF < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i3 = 0;
        do {
            sb.append((CharSequence) str, i3, iF);
            sb.append(str3);
            i3 = iF + length;
            if (iF >= str.length()) {
                break;
            }
            iF = d.F(str, str2, iF + i2, false);
        } while (iF > 0);
        sb.append((CharSequence) str, i3, str.length());
        String string = sb.toString();
        AbstractC0150d.d(string, "toString(...)");
        return string;
    }
}
