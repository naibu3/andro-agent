package M;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f568a;

    /* renamed from: b, reason: collision with root package name */
    public y f569b;

    public u(int i2) {
        this.f568a = new SparseArray(i2);
    }

    public final void a(y yVar, int i2, int i3) {
        int iA = yVar.a(i2);
        SparseArray sparseArray = this.f568a;
        u uVar = sparseArray == null ? null : (u) sparseArray.get(iA);
        if (uVar == null) {
            uVar = new u(1);
            sparseArray.put(yVar.a(i2), uVar);
        }
        if (i3 > i2) {
            uVar.a(yVar, i2 + 1, i3);
        } else {
            uVar.f569b = yVar;
        }
    }
}
