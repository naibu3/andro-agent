package t;

import java.util.ArrayList;

/* renamed from: t.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0249l {

    /* renamed from: a, reason: collision with root package name */
    public o f2385a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2386b;

    public static long a(C0243f c0243f, long j2) {
        o oVar = c0243f.f2374d;
        if (oVar instanceof C0247j) {
            return j2;
        }
        ArrayList arrayList = c0243f.f2380k;
        int size = arrayList.size();
        long jMin = j2;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC0241d interfaceC0241d = (InterfaceC0241d) arrayList.get(i2);
            if (interfaceC0241d instanceof C0243f) {
                C0243f c0243f2 = (C0243f) interfaceC0241d;
                if (c0243f2.f2374d != oVar) {
                    jMin = Math.min(jMin, a(c0243f2, c0243f2.f2376f + j2));
                }
            }
        }
        if (c0243f != oVar.f2402i) {
            return jMin;
        }
        long j3 = oVar.j();
        long j4 = j2 - j3;
        return Math.min(Math.min(jMin, a(oVar.h, j4)), j4 - r9.f2376f);
    }

    public static long b(C0243f c0243f, long j2) {
        o oVar = c0243f.f2374d;
        if (oVar instanceof C0247j) {
            return j2;
        }
        ArrayList arrayList = c0243f.f2380k;
        int size = arrayList.size();
        long jMax = j2;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC0241d interfaceC0241d = (InterfaceC0241d) arrayList.get(i2);
            if (interfaceC0241d instanceof C0243f) {
                C0243f c0243f2 = (C0243f) interfaceC0241d;
                if (c0243f2.f2374d != oVar) {
                    jMax = Math.max(jMax, b(c0243f2, c0243f2.f2376f + j2));
                }
            }
        }
        if (c0243f != oVar.h) {
            return jMax;
        }
        long j3 = oVar.j();
        long j4 = j2 + j3;
        return Math.max(Math.max(jMax, b(oVar.f2402i, j4)), j4 - r9.f2376f);
    }
}
