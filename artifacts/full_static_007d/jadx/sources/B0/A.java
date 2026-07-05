package B0;

import j0.AbstractC0150d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final int f53a;

    /* renamed from: b, reason: collision with root package name */
    public final s f54b;

    /* renamed from: c, reason: collision with root package name */
    public long f55c;

    /* renamed from: d, reason: collision with root package name */
    public long f56d;

    /* renamed from: e, reason: collision with root package name */
    public long f57e;

    /* renamed from: f, reason: collision with root package name */
    public long f58f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f59g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final y f60i;

    /* renamed from: j, reason: collision with root package name */
    public final x f61j;

    /* renamed from: k, reason: collision with root package name */
    public final z f62k;

    /* renamed from: l, reason: collision with root package name */
    public final z f63l;

    /* renamed from: m, reason: collision with root package name */
    public EnumC0001b f64m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f65n;

    public A(int i2, s sVar, boolean z2, boolean z3, u0.k kVar) {
        AbstractC0150d.e(sVar, "connection");
        this.f53a = i2;
        this.f54b = sVar;
        this.f58f = sVar.f163q.b();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f59g = arrayDeque;
        this.f60i = new y(this, sVar.f162p.b(), z3);
        this.f61j = new x(this, z2);
        this.f62k = new z(this);
        this.f63l = new z(this);
        if (kVar == null) {
            if (!h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (h()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(kVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z2;
        boolean zI;
        byte[] bArr = v0.b.f2808a;
        synchronized (this) {
            y yVar = this.f60i;
            if (yVar.f193b || !yVar.f196e) {
                z2 = false;
                zI = i();
            } else {
                x xVar = this.f61j;
                if (xVar.f188a || xVar.f190c) {
                    z2 = true;
                }
                zI = i();
            }
        }
        if (z2) {
            c(EnumC0001b.CANCEL, null);
        } else {
            if (zI) {
                return;
            }
            this.f54b.j(this.f53a);
        }
    }

    public final void b() throws IOException {
        x xVar = this.f61j;
        if (xVar.f190c) {
            throw new IOException("stream closed");
        }
        if (xVar.f188a) {
            throw new IOException("stream finished");
        }
        if (this.f64m != null) {
            IOException iOException = this.f65n;
            if (iOException != null) {
                throw iOException;
            }
            EnumC0001b enumC0001b = this.f64m;
            AbstractC0150d.b(enumC0001b);
            throw new G(enumC0001b);
        }
    }

    public final void c(EnumC0001b enumC0001b, IOException iOException) {
        if (d(enumC0001b, iOException)) {
            this.f54b.f169w.m(this.f53a, enumC0001b);
        }
    }

    public final boolean d(EnumC0001b enumC0001b, IOException iOException) {
        byte[] bArr = v0.b.f2808a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            if (this.f60i.f193b && this.f61j.f188a) {
                return false;
            }
            this.f64m = enumC0001b;
            this.f65n = iOException;
            notifyAll();
            this.f54b.j(this.f53a);
            return true;
        }
    }

    public final void e(EnumC0001b enumC0001b) {
        if (d(enumC0001b, null)) {
            this.f54b.n(this.f53a, enumC0001b);
        }
    }

    public final synchronized EnumC0001b f() {
        return this.f64m;
    }

    public final x g() {
        synchronized (this) {
            if (!this.h && !h()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f61j;
    }

    public final boolean h() {
        boolean z2 = (this.f53a & 1) == 1;
        this.f54b.getClass();
        return true == z2;
    }

    public final synchronized boolean i() {
        if (this.f64m != null) {
            return false;
        }
        y yVar = this.f60i;
        if (yVar.f193b || yVar.f196e) {
            x xVar = this.f61j;
            if (xVar.f188a || xVar.f190c) {
                if (this.h) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void j(u0.k kVar, boolean z2) {
        boolean zI;
        AbstractC0150d.e(kVar, "headers");
        byte[] bArr = v0.b.f2808a;
        synchronized (this) {
            try {
                if (this.h && z2) {
                    this.f60i.getClass();
                } else {
                    this.h = true;
                    this.f59g.add(kVar);
                }
                if (z2) {
                    this.f60i.f193b = true;
                }
                zI = i();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zI) {
            return;
        }
        this.f54b.j(this.f53a);
    }

    public final synchronized void k(EnumC0001b enumC0001b) {
        if (this.f64m == null) {
            this.f64m = enumC0001b;
            notifyAll();
        }
    }

    public final void l() throws InterruptedException, InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
