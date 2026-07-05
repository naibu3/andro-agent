package H0;

import B0.z;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f403a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f404b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f405c;

    public /* synthetic */ c(Object obj, Object obj2, int i2) {
        this.f403a = i2;
        this.f404b = obj;
        this.f405c = obj2;
    }

    @Override // H0.t
    public final v a() {
        switch (this.f403a) {
            case 0:
                return (z) this.f404b;
            default:
                return (v) this.f405c;
        }
    }

    @Override // H0.t
    public final long b(long j2, e eVar) throws IOException {
        switch (this.f403a) {
            case 0:
                c cVar = (c) this.f405c;
                z zVar = (z) this.f404b;
                zVar.h();
                try {
                    long jB = cVar.b(8192L, eVar);
                    if (zVar.i()) {
                        throw zVar.l(null);
                    }
                    return jB;
                } catch (IOException e2) {
                    if (zVar.i()) {
                        throw zVar.l(e2);
                    }
                    throw e2;
                } finally {
                    zVar.i();
                }
            default:
                try {
                    ((v) this.f405c).f();
                    p pVarQ = eVar.q(1);
                    int i2 = ((InputStream) this.f404b).read(pVarQ.f436a, pVarQ.f438c, (int) Math.min(8192L, 8192 - pVarQ.f438c));
                    if (i2 == -1) {
                        if (pVarQ.f437b == pVarQ.f438c) {
                            eVar.f411a = pVarQ.a();
                            q.a(pVarQ);
                        }
                        return -1L;
                    }
                    pVarQ.f438c += i2;
                    long j3 = i2;
                    eVar.f412b += j3;
                    return j3;
                } catch (AssertionError e3) {
                    if (C0.m.l(e3)) {
                        throw new IOException(e3);
                    }
                    throw e3;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f403a) {
            case 0:
                c cVar = (c) this.f405c;
                z zVar = (z) this.f404b;
                zVar.h();
                try {
                    cVar.close();
                    if (zVar.i()) {
                        throw zVar.l(null);
                    }
                    return;
                } catch (IOException e2) {
                    if (!zVar.i()) {
                        throw e2;
                    }
                    throw zVar.l(e2);
                } finally {
                    zVar.i();
                }
            default:
                ((InputStream) this.f404b).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f403a) {
            case 0:
                return "AsyncTimeout.source(" + ((c) this.f405c) + ')';
            default:
                return "source(" + ((InputStream) this.f404b) + ')';
        }
    }
}
