package com.google.android.play.integrity.internal;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
public final class ax implements bb {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f323a = new Object();
    private volatile bb b;
    private volatile Object c = f323a;

    private ax(bb bbVar) {
        this.b = bbVar;
    }

    public static bb b(bb bbVar) {
        return bbVar instanceof ax ? bbVar : new ax(bbVar);
    }

    @Override // com.google.android.play.integrity.internal.bd, com.google.android.play.integrity.internal.bc
    public final Object a() {
        Object objA;
        Object obj = this.c;
        Object obj2 = f323a;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            objA = this.c;
            if (objA == obj2) {
                objA = this.b.a();
                Object obj3 = this.c;
                if (obj3 != obj2 && obj3 != objA) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                }
                this.c = objA;
                this.b = null;
            }
        }
        return objA;
    }
}
