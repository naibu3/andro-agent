package B0;

import j0.AbstractC0150d;
import java.io.IOException;

/* loaded from: classes.dex */
public final class y implements H0.t {

    /* renamed from: a, reason: collision with root package name */
    public final long f192a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f193b;

    /* renamed from: c, reason: collision with root package name */
    public final H0.e f194c;

    /* renamed from: d, reason: collision with root package name */
    public final H0.e f195d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f196e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A f197f;

    public y(A a2, long j2, boolean z2) {
        AbstractC0150d.e(a2, "this$0");
        this.f197f = a2;
        this.f192a = j2;
        this.f193b = z2;
        this.f194c = new H0.e();
        this.f195d = new H0.e();
    }

    @Override // H0.t
    public final H0.v a() {
        return this.f197f.f62k;
    }

    @Override // H0.t
    public final long b(long j2, H0.e eVar) throws Throwable {
        Throwable g2;
        boolean z2;
        long jB;
        do {
            A a2 = this.f197f;
            synchronized (a2) {
                a2.f62k.h();
                try {
                    if (a2.f() != null) {
                        g2 = a2.f65n;
                        if (g2 == null) {
                            EnumC0001b enumC0001bF = a2.f();
                            AbstractC0150d.b(enumC0001bF);
                            g2 = new G(enumC0001bF);
                        }
                    } else {
                        g2 = null;
                    }
                    if (this.f196e) {
                        throw new IOException("stream closed");
                    }
                    H0.e eVar2 = this.f195d;
                    long j3 = eVar2.f412b;
                    z2 = false;
                    if (j3 > 0) {
                        jB = eVar2.b(Math.min(8192L, j3), eVar);
                        long j4 = a2.f55c + jB;
                        a2.f55c = j4;
                        long j5 = j4 - a2.f56d;
                        if (g2 == null && j5 >= a2.f54b.f162p.b() / 2) {
                            a2.f54b.o(j5, a2.f53a);
                            a2.f56d = a2.f55c;
                        }
                    } else {
                        if (!this.f193b && g2 == null) {
                            a2.l();
                            z2 = true;
                        }
                        jB = -1;
                    }
                    a2.f62k.k();
                } catch (Throwable th) {
                    a2.f62k.k();
                    throw th;
                }
            }
        } while (z2);
        if (jB != -1) {
            f(jB);
            return jB;
        }
        if (g2 == null) {
            return -1L;
        }
        throw g2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j2;
        A a2 = this.f197f;
        synchronized (a2) {
            this.f196e = true;
            H0.e eVar = this.f195d;
            j2 = eVar.f412b;
            eVar.o(j2);
            a2.notifyAll();
        }
        if (j2 > 0) {
            f(j2);
        }
        this.f197f.a();
    }

    public final void f(long j2) {
        byte[] bArr = v0.b.f2808a;
        this.f197f.f54b.l(j2);
    }
}
