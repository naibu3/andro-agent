package u0;

import H.C0014h;
import j0.AbstractC0150d;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class q implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final M.v f2519a;

    /* renamed from: b, reason: collision with root package name */
    public final A.f f2520b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2521c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2522d;

    /* renamed from: e, reason: collision with root package name */
    public final C0014h f2523e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2524f;

    /* renamed from: g, reason: collision with root package name */
    public final b f2525g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2526i;

    /* renamed from: j, reason: collision with root package name */
    public final b f2527j;

    /* renamed from: k, reason: collision with root package name */
    public final b f2528k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f2529l;

    /* renamed from: m, reason: collision with root package name */
    public final b f2530m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f2531n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f2532o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f2533p;

    /* renamed from: q, reason: collision with root package name */
    public final List f2534q;

    /* renamed from: r, reason: collision with root package name */
    public final List f2535r;

    /* renamed from: s, reason: collision with root package name */
    public final HostnameVerifier f2536s;

    /* renamed from: t, reason: collision with root package name */
    public final e f2537t;

    /* renamed from: u, reason: collision with root package name */
    public final C0.f f2538u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2539v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2540w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2541x;
    public final x0.c y;

    /* renamed from: z, reason: collision with root package name */
    public static final List f2518z = v0.b.k(r.HTTP_2, r.HTTP_1_1);

    /* renamed from: A, reason: collision with root package name */
    public static final List f2517A = v0.b.k(h.f2452e, h.f2453f);

    public q(p pVar) throws NoSuchAlgorithmException, KeyStoreException {
        this.f2519a = pVar.f2495a;
        this.f2520b = pVar.f2496b;
        this.f2521c = v0.b.w(pVar.f2497c);
        this.f2522d = v0.b.w(pVar.f2498d);
        this.f2523e = pVar.f2499e;
        this.f2524f = pVar.f2500f;
        this.f2525g = pVar.f2501g;
        this.h = pVar.h;
        this.f2526i = pVar.f2502i;
        this.f2527j = pVar.f2503j;
        this.f2528k = pVar.f2504k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f2529l = proxySelector == null ? E0.a.f306a : proxySelector;
        this.f2530m = pVar.f2505l;
        this.f2531n = pVar.f2506m;
        List list = pVar.f2509p;
        this.f2534q = list;
        this.f2535r = pVar.f2510q;
        this.f2536s = pVar.f2511r;
        this.f2539v = pVar.f2514u;
        this.f2540w = pVar.f2515v;
        this.f2541x = pVar.f2516w;
        this.y = new x0.c();
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).f2454a) {
                    SSLSocketFactory sSLSocketFactory = pVar.f2507n;
                    if (sSLSocketFactory != null) {
                        this.f2532o = sSLSocketFactory;
                        C0.f fVar = pVar.f2513t;
                        AbstractC0150d.b(fVar);
                        this.f2538u = fVar;
                        X509TrustManager x509TrustManager = pVar.f2508o;
                        AbstractC0150d.b(x509TrustManager);
                        this.f2533p = x509TrustManager;
                        e eVar = pVar.f2512s;
                        eVar.getClass();
                        this.f2537t = AbstractC0150d.a(eVar.f2432b, fVar) ? eVar : new e(eVar.f2431a, fVar);
                    } else {
                        C0.o oVar = C0.o.f236a;
                        X509TrustManager x509TrustManagerM = C0.o.f236a.m();
                        this.f2533p = x509TrustManagerM;
                        this.f2532o = C0.o.f236a.l(x509TrustManagerM);
                        C0.f fVarB = C0.o.f236a.b(x509TrustManagerM);
                        this.f2538u = fVarB;
                        e eVar2 = pVar.f2512s;
                        eVar2.getClass();
                        this.f2537t = AbstractC0150d.a(eVar2.f2432b, fVarB) ? eVar2 : new e(eVar2.f2431a, fVarB);
                    }
                }
            }
            this.f2532o = null;
            this.f2538u = null;
            this.f2533p = null;
            this.f2537t = e.f2430c;
        } else {
            this.f2532o = null;
            this.f2538u = null;
            this.f2533p = null;
            this.f2537t = e.f2430c;
        }
        List list2 = this.f2521c;
        if (list2.contains(null)) {
            throw new IllegalStateException(AbstractC0150d.h(list2, "Null interceptor: ").toString());
        }
        List list3 = this.f2522d;
        if (list3.contains(null)) {
            throw new IllegalStateException(AbstractC0150d.h(list3, "Null network interceptor: ").toString());
        }
        X509TrustManager x509TrustManager2 = this.f2533p;
        C0.f fVar2 = this.f2538u;
        SSLSocketFactory sSLSocketFactory2 = this.f2532o;
        List list4 = this.f2534q;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((h) it2.next()).f2454a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (fVar2 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (fVar2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!AbstractC0150d.a(this.f2537t, e.f2430c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final Object clone() {
        return super.clone();
    }

    public q() {
        this(new p());
    }
}
