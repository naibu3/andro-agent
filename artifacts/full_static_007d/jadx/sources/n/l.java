package n;

import b0.AbstractC0081g;
import j0.AbstractC0150d;
import java.util.Arrays;
import o.AbstractC0228a;

/* loaded from: classes.dex */
public final class l implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ int[] f2128a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object[] f2129b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f2130c;

    public l() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f2128a = new int[i5];
        this.f2129b = new Object[i5];
    }

    public final void a(int i2, Object obj) {
        int i3 = this.f2130c;
        if (i3 == 0 || i2 > this.f2128a[i3 - 1]) {
            if (i3 >= this.f2128a.length) {
                int i4 = (i3 + 1) * 4;
                int i5 = 4;
                while (true) {
                    if (i5 >= 32) {
                        break;
                    }
                    int i6 = (1 << i5) - 12;
                    if (i4 <= i6) {
                        i4 = i6;
                        break;
                    }
                    i5++;
                }
                int i7 = i4 / 4;
                int[] iArrCopyOf = Arrays.copyOf(this.f2128a, i7);
                AbstractC0150d.d(iArrCopyOf, "copyOf(this, newSize)");
                this.f2128a = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.f2129b, i7);
                AbstractC0150d.d(objArrCopyOf, "copyOf(this, newSize)");
                this.f2129b = objArrCopyOf;
            }
            this.f2128a[i3] = i2;
            this.f2129b[i3] = obj;
            this.f2130c = i3 + 1;
            return;
        }
        int iA = AbstractC0228a.a(this.f2130c, i2, this.f2128a);
        if (iA >= 0) {
            this.f2129b[iA] = obj;
            return;
        }
        int i8 = ~iA;
        int i9 = this.f2130c;
        if (i8 < i9) {
            Object[] objArr = this.f2129b;
            if (objArr[i8] == i.f2118b) {
                this.f2128a[i8] = i2;
                objArr[i8] = obj;
                return;
            }
        }
        if (i9 >= this.f2128a.length) {
            int i10 = (i9 + 1) * 4;
            int i11 = 4;
            while (true) {
                if (i11 >= 32) {
                    break;
                }
                int i12 = (1 << i11) - 12;
                if (i10 <= i12) {
                    i10 = i12;
                    break;
                }
                i11++;
            }
            int i13 = i10 / 4;
            int[] iArrCopyOf2 = Arrays.copyOf(this.f2128a, i13);
            AbstractC0150d.d(iArrCopyOf2, "copyOf(this, newSize)");
            this.f2128a = iArrCopyOf2;
            Object[] objArrCopyOf2 = Arrays.copyOf(this.f2129b, i13);
            AbstractC0150d.d(objArrCopyOf2, "copyOf(this, newSize)");
            this.f2129b = objArrCopyOf2;
        }
        int i14 = this.f2130c;
        if (i14 - i8 != 0) {
            int[] iArr = this.f2128a;
            int i15 = i8 + 1;
            AbstractC0081g.w(i15, i8, i14, iArr, iArr);
            Object[] objArr2 = this.f2129b;
            AbstractC0081g.y(objArr2, objArr2, i15, i8, this.f2130c);
        }
        this.f2128a[i8] = i2;
        this.f2129b[i8] = obj;
        this.f2130c++;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC0150d.c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        l lVar = (l) objClone;
        lVar.f2128a = (int[]) this.f2128a.clone();
        lVar.f2129b = (Object[]) this.f2129b.clone();
        return lVar;
    }

    public final String toString() {
        int i2 = this.f2130c;
        if (i2 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        int i3 = this.f2130c;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(this.f2128a[i4]);
            sb.append('=');
            Object obj = this.f2129b[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC0150d.d(string, "buffer.toString()");
        return string;
    }
}
