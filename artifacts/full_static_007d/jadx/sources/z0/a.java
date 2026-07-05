package z0;

import B0.C0000a;
import B0.F;
import B0.h;
import H0.j;
import M.v;
import b0.C0091q;
import j0.AbstractC0150d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import k.C0213z;
import u0.k;
import u0.m;
import u0.n;
import u0.o;
import u0.q;
import u0.s;
import u0.t;
import u0.u;
import u0.w;
import u0.x;
import y0.l;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2968a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2969b;

    public a(u0.b bVar) {
        AbstractC0150d.e(bVar, "cookieJar");
        this.f2969b = bVar;
    }

    public static int d(u uVar, int i2) throws NumberFormatException {
        String strF = u.f("Retry-After", uVar);
        if (strF == null) {
            return i2;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        AbstractC0150d.d(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strF).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strF);
        AbstractC0150d.d(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u0.n
    public final u a(f fVar) {
        w wVar;
        C0091q c0091q;
        int i2;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        u0.e eVar;
        switch (this.f2968a) {
            case 0:
                h hVar = fVar.f2975e;
                s sVarE = hVar.e();
                C0213z c0213z = (C0213z) hVar.f121e;
                if (c0213z != null) {
                    o oVar = (o) c0213z.f2070c;
                    if (oVar != null) {
                        sVarE.b("Content-Type", oVar.f2493a);
                    }
                    long j2 = c0213z.f2069b;
                    if (j2 != -1) {
                        sVarE.b("Content-Length", String.valueOf(j2));
                        sVarE.f2551c.D("Transfer-Encoding");
                    } else {
                        sVarE.b("Transfer-Encoding", "chunked");
                        sVarE.f2551c.D("Content-Length");
                    }
                }
                k kVar = (k) hVar.f119c;
                String strA = kVar.a("Host");
                boolean z2 = false;
                m mVar = (m) hVar.f118b;
                if (strA == null) {
                    sVarE.b("Host", v0.b.v(mVar, false));
                }
                if (kVar.a("Connection") == null) {
                    sVarE.b("Connection", "Keep-Alive");
                }
                if (kVar.a("Accept-Encoding") == null && kVar.a("Range") == null) {
                    sVarE.b("Accept-Encoding", "gzip");
                    z2 = true;
                }
                u0.b bVar = (u0.b) this.f2969b;
                bVar.getClass();
                AbstractC0150d.e(mVar, "url");
                if (kVar.a("User-Agent") == null) {
                    sVarE.b("User-Agent", "okhttp/4.10.0");
                }
                u uVarB = fVar.b(sVarE.a());
                k kVar2 = uVarB.f2571f;
                e.b(bVar, mVar, kVar2);
                t tVarI = uVarB.i();
                tVarI.f2554a = hVar;
                if (z2 && "gzip".equalsIgnoreCase(u.f("Content-Encoding", uVarB)) && e.a(uVarB) && (wVar = uVarB.f2572g) != null) {
                    j jVar = new j(wVar.i());
                    A.f fVarC = kVar2.c();
                    fVarC.D("Content-Encoding");
                    fVarC.D("Content-Length");
                    tVarI.f2559f = fVarC.A().c();
                    tVarI.f2560g = new g(u.f("Content-Type", uVarB), -1L, new H0.o(jVar));
                }
                return tVarI.a();
            default:
                h hVar2 = fVar.f2975e;
                y0.h hVar3 = fVar.f2971a;
                C0091q c0091q2 = C0091q.f1234a;
                u uVar = null;
                int i3 = 0;
                h hVarB = hVar2;
                while (true) {
                    boolean z3 = true;
                    while (true) {
                        hVar3.getClass();
                        if (hVar3.f2892i != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (hVar3) {
                            try {
                                if (hVar3.f2894k) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (hVar3.f2893j) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            l lVar = hVar3.f2887c;
                            m mVar2 = (m) hVarB.f118b;
                            boolean z4 = mVar2.f2490i;
                            q qVar = hVar3.f2885a;
                            if (z4) {
                                SSLSocketFactory sSLSocketFactory2 = qVar.f2532o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                HostnameVerifier hostnameVerifier2 = qVar.f2536s;
                                eVar = qVar.f2537t;
                                sSLSocketFactory = sSLSocketFactory2;
                                hostnameVerifier = hostnameVerifier2;
                            } else {
                                sSLSocketFactory = null;
                                hostnameVerifier = null;
                                eVar = null;
                            }
                            c0091q = c0091q2;
                            i2 = i3;
                            hVar3.f2891g = new y0.e(lVar, new u0.a(mVar2.f2486d, mVar2.f2487e, qVar.f2528k, qVar.f2531n, sSLSocketFactory, hostnameVerifier, eVar, qVar.f2530m, qVar.f2535r, qVar.f2534q, qVar.f2529l), hVar3);
                        } else {
                            c0091q = c0091q2;
                            i2 = i3;
                        }
                        try {
                            if (hVar3.f2896m) {
                                throw new IOException("Canceled");
                            }
                            try {
                                u uVarB2 = fVar.b(hVarB);
                                if (uVar != null) {
                                    t tVarI2 = uVarB2.i();
                                    t tVarI3 = uVar.i();
                                    tVarI3.f2560g = null;
                                    u uVarA = tVarI3.a();
                                    if (uVarA.f2572g != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    tVarI2.f2562j = uVarA;
                                    uVarB2 = tVarI2.a();
                                }
                                uVar = uVarB2;
                                hVarB = b(uVar, hVar3.f2892i);
                                if (hVarB == null) {
                                    hVar3.f(false);
                                    return uVar;
                                }
                                w wVar2 = uVar.f2572g;
                                if (wVar2 != null) {
                                    v0.b.c(wVar2);
                                }
                                i3 = i2 + 1;
                                if (i3 > 20) {
                                    throw new ProtocolException(AbstractC0150d.h(Integer.valueOf(i3), "Too many follow-up requests: "));
                                }
                                hVar3.f(true);
                                c0091q2 = c0091q;
                            } catch (IOException e2) {
                                if (!c(e2, hVar3, hVarB, !(e2 instanceof C0000a))) {
                                    v0.b.z(e2, c0091q);
                                    throw e2;
                                }
                                ArrayList arrayList = new ArrayList(c0091q.size() + 1);
                                arrayList.addAll(c0091q);
                                arrayList.add(e2);
                                hVar3.f(true);
                                c0091q2 = arrayList;
                                i3 = i2;
                                z3 = false;
                            } catch (y0.m e3) {
                                C0091q c0091q3 = c0091q;
                                if (!c(e3.f2923b, hVar3, hVarB, false)) {
                                    IOException iOException = e3.f2922a;
                                    v0.b.z(iOException, c0091q3);
                                    throw iOException;
                                }
                                IOException iOException2 = e3.f2922a;
                                ArrayList arrayList2 = new ArrayList(c0091q3.size() + 1);
                                arrayList2.addAll(c0091q3);
                                arrayList2.add(iOException2);
                                hVar3.f(true);
                                c0091q2 = arrayList2;
                                z3 = false;
                                i3 = i2;
                            }
                        } catch (Throwable th2) {
                            hVar3.f(true);
                            throw th2;
                        }
                    }
                }
        }
    }

    public h b(u uVar, v vVar) throws ProtocolException {
        y0.k kVar;
        String strF;
        u0.l lVar;
        x xVar = (vVar == null || (kVar = (y0.k) vVar.f573d) == null) ? null : kVar.f2903b;
        int i2 = uVar.f2569d;
        String str = (String) uVar.f2566a.f120d;
        if (i2 != 307 && i2 != 308) {
            if (i2 == 401) {
                ((q) this.f2969b).f2525g.getClass();
                return null;
            }
            if (i2 == 421) {
                if (vVar == null || AbstractC0150d.a(((y0.e) vVar.f571b).f2874b.h.f2486d, ((y0.k) vVar.f573d).f2903b.f2580a.h.f2486d)) {
                    return null;
                }
                y0.k kVar2 = (y0.k) vVar.f573d;
                synchronized (kVar2) {
                    kVar2.f2911k = true;
                }
                return uVar.f2566a;
            }
            if (i2 == 503) {
                u uVar2 = uVar.f2574j;
                if ((uVar2 == null || uVar2.f2569d != 503) && d(uVar, Integer.MAX_VALUE) == 0) {
                    return uVar.f2566a;
                }
                return null;
            }
            if (i2 == 407) {
                AbstractC0150d.b(xVar);
                if (xVar.f2581b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((q) this.f2969b).f2530m.getClass();
                return null;
            }
            if (i2 == 408) {
                if (!((q) this.f2969b).f2524f) {
                    return null;
                }
                u uVar3 = uVar.f2574j;
                if ((uVar3 == null || uVar3.f2569d != 408) && d(uVar, 0) <= 0) {
                    return uVar.f2566a;
                }
                return null;
            }
            switch (i2) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        q qVar = (q) this.f2969b;
        if (!qVar.h || (strF = u.f("Location", uVar)) == null) {
            return null;
        }
        h hVar = uVar.f2566a;
        m mVar = (m) hVar.f118b;
        mVar.getClass();
        try {
            lVar = new u0.l();
            lVar.c(mVar, strF);
        } catch (IllegalArgumentException unused) {
            lVar = null;
        }
        m mVarA = lVar == null ? null : lVar.a();
        if (mVarA == null) {
            return null;
        }
        if (!AbstractC0150d.a(mVarA.f2483a, ((m) hVar.f118b).f2483a) && !qVar.f2526i) {
            return null;
        }
        s sVarE = hVar.e();
        if (C0.m.p(str)) {
            boolean zEquals = str.equals("PROPFIND");
            int i3 = uVar.f2569d;
            boolean z2 = zEquals || i3 == 308 || i3 == 307;
            if (str.equals("PROPFIND") || i3 == 308 || i3 == 307) {
                sVarE.c(str, z2 ? (C0213z) hVar.f121e : null);
            } else {
                sVarE.c("GET", null);
            }
            if (!z2) {
                sVarE.f2551c.D("Transfer-Encoding");
                sVarE.f2551c.D("Content-Length");
                sVarE.f2551c.D("Content-Type");
            }
        }
        if (!v0.b.a((m) hVar.f118b, mVarA)) {
            sVarE.f2551c.D("Authorization");
        }
        sVarE.f2549a = mVarA;
        return sVarE.a();
    }

    public boolean c(IOException iOException, y0.h hVar, h hVar2, boolean z2) {
        A0.h hVar3;
        boolean zI;
        y0.k kVar;
        if (!((q) this.f2969b).f2524f) {
            return false;
        }
        if ((z2 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z2)) {
            return false;
        }
        y0.e eVar = hVar.f2891g;
        AbstractC0150d.b(eVar);
        int i2 = eVar.f2878f;
        if (i2 == 0 && eVar.f2879g == 0 && eVar.h == 0) {
            zI = false;
        } else if (eVar.f2880i != null) {
            zI = true;
        } else {
            x xVar = null;
            if (i2 <= 1 && eVar.f2879g <= 1 && eVar.h <= 0 && (kVar = eVar.f2875c.h) != null) {
                synchronized (kVar) {
                    if (kVar.f2912l == 0 && v0.b.a(kVar.f2903b.f2580a.h, eVar.f2874b.h)) {
                        xVar = kVar.f2903b;
                    }
                }
            }
            if (xVar != null) {
                eVar.f2880i = xVar;
            } else {
                F f2 = eVar.f2876d;
                if ((f2 == null || !f2.c()) && (hVar3 = eVar.f2877e) != null) {
                    zI = hVar3.i();
                }
            }
            zI = true;
        }
        return zI;
    }

    public a(q qVar) {
        AbstractC0150d.e(qVar, "client");
        this.f2969b = qVar;
    }
}
