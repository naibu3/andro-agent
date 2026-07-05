package a0;

import i0.InterfaceC0131a;
import j0.AbstractC0150d;
import j0.AbstractC0151e;
import java.io.Serializable;

/* renamed from: a0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050d implements InterfaceC0048b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0151e f788a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f789b = C0051e.f791b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f790c = this;

    /* JADX WARN: Multi-variable type inference failed */
    public C0050d(InterfaceC0131a interfaceC0131a) {
        this.f788a = (AbstractC0151e) interfaceC0131a;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [i0.a, j0.e, java.lang.Object] */
    public final Object a() {
        Object objA;
        Object obj = this.f789b;
        C0051e c0051e = C0051e.f791b;
        if (obj != c0051e) {
            return obj;
        }
        synchronized (this.f790c) {
            objA = this.f789b;
            if (objA == c0051e) {
                ?? r1 = this.f788a;
                AbstractC0150d.b(r1);
                objA = r1.a();
                this.f789b = objA;
                this.f788a = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.f789b != C0051e.f791b ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
