package n;

import j0.AbstractC0150d;
import java.util.ConcurrentModificationException;
import o.AbstractC0228a;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2117a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f2118b = new Object();

    public static final int a(g gVar, Object obj, int i2) {
        AbstractC0150d.e(gVar, "<this>");
        int i3 = gVar.f2112c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iA = AbstractC0228a.a(gVar.f2112c, i2, gVar.f2110a);
            if (iA < 0 || AbstractC0150d.a(obj, gVar.f2111b[iA])) {
                return iA;
            }
            int i4 = iA + 1;
            while (i4 < i3 && gVar.f2110a[i4] == i2) {
                if (AbstractC0150d.a(obj, gVar.f2111b[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iA - 1; i5 >= 0 && gVar.f2110a[i5] == i2; i5--) {
                if (AbstractC0150d.a(obj, gVar.f2111b[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
