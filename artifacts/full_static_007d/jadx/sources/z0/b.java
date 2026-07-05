package z0;

import C0.m;
import H0.o;
import M.v;
import j0.AbstractC0150d;
import java.io.IOException;
import java.net.ProtocolException;
import k.C0213z;
import u0.n;
import u0.t;
import u0.u;
import u0.w;
import y0.h;
import y0.k;

/* loaded from: classes.dex */
public final class b implements n {
    @Override // u0.n
    public final u a(f fVar) throws Throwable {
        Long l2;
        t tVarI;
        C0213z c0213z;
        boolean z2;
        v vVar = fVar.f2974d;
        AbstractC0150d.b(vVar);
        h hVar = (h) vVar.f570a;
        d dVar = (d) vVar.f572c;
        B0.h hVar2 = fVar.f2975e;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            AbstractC0150d.e(hVar, "call");
            dVar.c(hVar2);
            boolean zP = m.p((String) hVar2.f120d);
            boolean z3 = true;
            k kVar = (k) vVar.f573d;
            if (!zP || (c0213z = (C0213z) hVar2.f121e) == null) {
                l2 = null;
                hVar.h(vVar, true, false, null);
                tVarI = null;
            } else {
                if ("100-continue".equalsIgnoreCase(((u0.k) hVar2.f119c).a("Expect"))) {
                    try {
                        dVar.d();
                        tVarI = vVar.i(true);
                        AbstractC0150d.e(hVar, "call");
                        z2 = false;
                    } catch (IOException e2) {
                        AbstractC0150d.e(hVar, "call");
                        vVar.j(e2);
                        throw e2;
                    }
                } else {
                    z2 = true;
                    tVarI = null;
                }
                if (tVarI == null) {
                    AbstractC0150d.b(c0213z);
                    long j2 = c0213z.f2069b;
                    AbstractC0150d.e(hVar, "call");
                    H0.n nVar = new H0.n(new y0.c(vVar, dVar.e(hVar2, j2), j2));
                    byte[] bArr = (byte[]) c0213z.f2071d;
                    if (nVar.f432c) {
                        throw new IllegalStateException("closed");
                    }
                    nVar.f431b.s(bArr, c0213z.f2069b);
                    nVar.f();
                    nVar.close();
                } else {
                    hVar.h(vVar, true, false, null);
                    if (kVar.f2908g == null) {
                        dVar.g().k();
                    }
                }
                z3 = z2;
                l2 = null;
            }
            try {
                dVar.b();
                if (tVarI == null) {
                    tVarI = vVar.i(false);
                    AbstractC0150d.b(tVarI);
                    if (z3) {
                        AbstractC0150d.e(hVar, "call");
                        z3 = false;
                    }
                }
                tVarI.f2554a = hVar2;
                tVarI.f2558e = kVar.f2906e;
                tVarI.f2563k = jCurrentTimeMillis;
                tVarI.f2564l = System.currentTimeMillis();
                u uVarA = tVarI.a();
                int i2 = uVarA.f2569d;
                if (i2 == 100) {
                    t tVarI2 = vVar.i(false);
                    AbstractC0150d.b(tVarI2);
                    if (z3) {
                        AbstractC0150d.e(hVar, "call");
                    }
                    tVarI2.f2554a = hVar2;
                    tVarI2.f2558e = kVar.f2906e;
                    tVarI2.f2563k = jCurrentTimeMillis;
                    tVarI2.f2564l = System.currentTimeMillis();
                    uVarA = tVarI2.a();
                    i2 = uVarA.f2569d;
                }
                t tVarI3 = uVarA.i();
                try {
                    String strF = u.f("Content-Type", uVarA);
                    long jA = dVar.a(uVarA);
                    tVarI3.f2560g = new g(strF, jA, new o(new y0.d(vVar, dVar.h(uVarA), jA)));
                    u uVarA2 = tVarI3.a();
                    if ("close".equalsIgnoreCase(((u0.k) uVarA2.f2566a.f119c).a("Connection")) || "close".equalsIgnoreCase(u.f("Connection", uVarA2))) {
                        dVar.g().k();
                    }
                    if (i2 == 204 || i2 == 205) {
                        w wVar = uVarA2.f2572g;
                        if ((wVar == null ? -1L : wVar.f()) > 0) {
                            StringBuilder sb = new StringBuilder("HTTP ");
                            sb.append(i2);
                            sb.append(" had non-zero Content-Length: ");
                            sb.append(wVar == null ? l2 : Long.valueOf(wVar.f()));
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    return uVarA2;
                } catch (IOException e3) {
                    vVar.j(e3);
                    throw e3;
                }
            } catch (IOException e4) {
                vVar.j(e4);
                throw e4;
            }
        } catch (IOException e5) {
            AbstractC0150d.e(hVar, "call");
            vVar.j(e5);
            throw e5;
        }
    }
}
