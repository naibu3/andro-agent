package y0;

import M.v;
import j0.AbstractC0150d;
import java.io.IOException;
import u0.n;
import u0.q;
import u0.u;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2855a = new a();

    @Override // u0.n
    public final u a(z0.f fVar) throws IOException {
        h hVar = fVar.f2971a;
        hVar.getClass();
        synchronized (hVar) {
            try {
                if (!hVar.f2895l) {
                    throw new IllegalStateException("released");
                }
                if (hVar.f2894k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (hVar.f2893j) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar = hVar.f2891g;
        AbstractC0150d.b(eVar);
        q qVar = hVar.f2885a;
        AbstractC0150d.e(qVar, "client");
        try {
            v vVar = new v(hVar, eVar, eVar.a(fVar.f2976f, fVar.f2977g, fVar.h, qVar.f2524f, !AbstractC0150d.a((String) fVar.f2975e.f120d, "GET")).j(qVar, fVar));
            hVar.f2892i = vVar;
            hVar.f2897n = vVar;
            synchronized (hVar) {
                hVar.f2893j = true;
                hVar.f2894k = true;
            }
            if (hVar.f2896m) {
                throw new IOException("Canceled");
            }
            return z0.f.a(fVar, 0, vVar, null, 61).b(fVar.f2975e);
        } catch (IOException e2) {
            eVar.c(e2);
            throw new m(e2);
        } catch (m e3) {
            eVar.c(e3.f2923b);
            throw e3;
        }
    }
}
