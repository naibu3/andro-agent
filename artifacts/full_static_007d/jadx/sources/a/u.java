package a;

import a0.C0051e;
import a0.InterfaceC0047a;
import i0.InterfaceC0131a;
import j0.C0152f;
import j0.InterfaceC0147a;
import j0.InterfaceC0149c;
import java.io.Serializable;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements InterfaceC0131a, InterfaceC0149c, Serializable, InterfaceC0047a {

    /* renamed from: a, reason: collision with root package name */
    public transient u f774a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f775b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f776c = false;

    /* renamed from: d, reason: collision with root package name */
    public final int f777d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f778e;

    public u(int i2, Object obj) {
        this.f778e = i2;
        this.f775b = obj;
    }

    @Override // i0.InterfaceC0131a
    public final Object a() {
        switch (this.f778e) {
            case 0:
                ((v) this.f775b).d();
                break;
            default:
                ((v) this.f775b).d();
                break;
        }
        return C0051e.f792c;
    }

    @Override // j0.InterfaceC0149c
    public final int b() {
        return 0;
    }

    public final InterfaceC0147a c() {
        if (!this.f776c) {
            return j0.h.a(v.class);
        }
        j0.h.f1740a.getClass();
        return new C0152f();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            uVar.getClass();
            return this.f777d == uVar.f777d && this.f775b.equals(uVar.f775b) && c().equals(uVar.c());
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar2 = this.f774a;
        if (uVar2 == null) {
            j0.h.f1740a.getClass();
            this.f774a = this;
            uVar2 = this;
        }
        return obj.equals(uVar2);
    }

    public final int hashCode() {
        c();
        return (((c().hashCode() * 31) + 986734966) * 31) + 1065238079;
    }

    public final String toString() {
        u uVar = this.f774a;
        if (uVar == null) {
            j0.h.f1740a.getClass();
            this.f774a = this;
            uVar = this;
        }
        return uVar != this ? uVar.toString() : "function updateEnabledCallbacks (Kotlin reflection is not available)";
    }
}
