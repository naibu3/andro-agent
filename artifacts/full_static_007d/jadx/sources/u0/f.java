package u0;

import j0.AbstractC0150d;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class f implements Comparator {
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return -1;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        AbstractC0150d.e(str, "a");
        AbstractC0150d.e(str2, "b");
        int iMin = Math.min(str.length(), str2.length());
        int i2 = 4;
        while (true) {
            if (i2 < iMin) {
                char cCharAt = str.charAt(i2);
                char cCharAt2 = str2.charAt(i2);
                if (cCharAt == cCharAt2) {
                    i2++;
                } else if (AbstractC0150d.f(cCharAt, cCharAt2) >= 0) {
                    return 1;
                }
            } else {
                int length = str.length();
                int length2 = str2.length();
                if (length == length2) {
                    return 0;
                }
                if (length >= length2) {
                    return 1;
                }
            }
        }
    }
}
