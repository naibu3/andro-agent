package y0;

import B0.A;
import B0.AbstractC0006g;
import B0.B;
import B0.EnumC0001b;
import B0.F;
import B0.s;
import H0.n;
import H0.o;
import H0.p;
import H0.v;
import j0.AbstractC0150d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import u0.q;
import u0.r;
import u0.t;
import u0.u;
import u0.x;

/* loaded from: classes.dex */
public final class k extends B0.j {

    /* renamed from: b, reason: collision with root package name */
    public final x f2903b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f2904c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f2905d;

    /* renamed from: e, reason: collision with root package name */
    public u0.j f2906e;

    /* renamed from: f, reason: collision with root package name */
    public r f2907f;

    /* renamed from: g, reason: collision with root package name */
    public s f2908g;
    public o h;

    /* renamed from: i, reason: collision with root package name */
    public n f2909i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2910j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2911k;

    /* renamed from: l, reason: collision with root package name */
    public int f2912l;

    /* renamed from: m, reason: collision with root package name */
    public int f2913m;

    /* renamed from: n, reason: collision with root package name */
    public int f2914n;

    /* renamed from: o, reason: collision with root package name */
    public int f2915o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f2916p;

    /* renamed from: q, reason: collision with root package name */
    public long f2917q;

    public k(l lVar, x xVar) {
        AbstractC0150d.e(lVar, "connectionPool");
        AbstractC0150d.e(xVar, "route");
        this.f2903b = xVar;
        this.f2915o = 1;
        this.f2916p = new ArrayList();
        this.f2917q = Long.MAX_VALUE;
    }

    public static void d(q qVar, x xVar, IOException iOException) {
        AbstractC0150d.e(qVar, "client");
        AbstractC0150d.e(xVar, "failedRoute");
        AbstractC0150d.e(iOException, "failure");
        if (xVar.f2581b.type() != Proxy.Type.DIRECT) {
            u0.a aVar = xVar.f2580a;
            aVar.f2411g.connectFailed(aVar.h.g(), xVar.f2581b.address(), iOException);
        }
        x0.c cVar = qVar.y;
        synchronized (cVar) {
            ((LinkedHashSet) cVar.f2846a).add(xVar);
        }
    }

    @Override // B0.j
    public final synchronized void a(s sVar, F f2) {
        AbstractC0150d.e(sVar, "connection");
        AbstractC0150d.e(f2, "settings");
        this.f2915o = (f2.f79a & 16) != 0 ? ((int[]) f2.f80b)[4] : Integer.MAX_VALUE;
    }

    @Override // B0.j
    public final void b(A a2) {
        a2.c(EnumC0001b.REFUSED_STREAM, null);
    }

    public final void c(int i2, int i3, int i4, boolean z2, h hVar) throws Throwable {
        x xVar;
        AbstractC0150d.e(hVar, "call");
        if (this.f2907f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f2903b.f2580a.f2413j;
        b bVar = new b(list);
        u0.a aVar = this.f2903b.f2580a;
        if (aVar.f2407c == null) {
            if (!list.contains(u0.h.f2453f)) {
                throw new m(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f2903b.f2580a.h.f2486d;
            C0.o oVar = C0.o.f236a;
            if (!C0.o.f236a.h(str)) {
                throw new m(new UnknownServiceException(A.e.d("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (aVar.f2412i.contains(r.H2_PRIOR_KNOWLEDGE)) {
            throw new m(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        m mVar = null;
        do {
            try {
                x xVar2 = this.f2903b;
                if (xVar2.f2580a.f2407c != null && xVar2.f2581b.type() == Proxy.Type.HTTP) {
                    f(i2, i3, i4, hVar);
                    if (this.f2904c == null) {
                    }
                    xVar = this.f2903b;
                    if (xVar.f2580a.f2407c == null && xVar.f2581b.type() == Proxy.Type.HTTP && this.f2904c == null) {
                        throw new m(new ProtocolException("Too many tunnel connections attempted: 21"));
                    }
                    this.f2917q = System.nanoTime();
                    return;
                }
                e(i2, i3, hVar);
                g(bVar, hVar);
                AbstractC0150d.e(this.f2903b.f2582c, "inetSocketAddress");
                xVar = this.f2903b;
                if (xVar.f2580a.f2407c == null) {
                }
                this.f2917q = System.nanoTime();
                return;
            } catch (IOException e2) {
                Socket socket = this.f2905d;
                if (socket != null) {
                    v0.b.d(socket);
                }
                Socket socket2 = this.f2904c;
                if (socket2 != null) {
                    v0.b.d(socket2);
                }
                this.f2905d = null;
                this.f2904c = null;
                this.h = null;
                this.f2909i = null;
                this.f2906e = null;
                this.f2907f = null;
                this.f2908g = null;
                this.f2915o = 1;
                AbstractC0150d.e(this.f2903b.f2582c, "inetSocketAddress");
                if (mVar == null) {
                    mVar = new m(e2);
                } else {
                    C0.d.e(mVar.f2922a, e2);
                    mVar.f2923b = e2;
                }
                if (!z2) {
                    throw mVar;
                }
                bVar.f2859d = true;
                if (!bVar.f2858c) {
                    throw mVar;
                }
                if (e2 instanceof ProtocolException) {
                    throw mVar;
                }
                if (e2 instanceof InterruptedIOException) {
                    throw mVar;
                }
                if ((e2 instanceof SSLHandshakeException) && (e2.getCause() instanceof CertificateException)) {
                    throw mVar;
                }
                if (e2 instanceof SSLPeerUnverifiedException) {
                    throw mVar;
                }
            }
        } while (e2 instanceof SSLException);
        throw mVar;
    }

    public final void e(int i2, int i3, h hVar) throws IOException {
        Socket socketCreateSocket;
        x xVar = this.f2903b;
        Proxy proxy = xVar.f2581b;
        u0.a aVar = xVar.f2580a;
        Proxy.Type type = proxy.type();
        int i4 = type == null ? -1 : i.f2899a[type.ordinal()];
        if (i4 == 1 || i4 == 2) {
            socketCreateSocket = aVar.f2406b.createSocket();
            AbstractC0150d.b(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f2904c = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.f2903b.f2582c;
        AbstractC0150d.e(hVar, "call");
        AbstractC0150d.e(inetSocketAddress, "inetSocketAddress");
        socketCreateSocket.setSoTimeout(i3);
        try {
            C0.o oVar = C0.o.f236a;
            C0.o.f236a.e(socketCreateSocket, this.f2903b.f2582c, i2);
            try {
                this.h = new o(C0.m.s(socketCreateSocket));
                this.f2909i = new n(C0.m.r(socketCreateSocket));
            } catch (NullPointerException e2) {
                if (AbstractC0150d.a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException(AbstractC0150d.h(this.f2903b.f2582c, "Failed to connect to "));
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void f(int i2, int i3, int i4, h hVar) throws IOException, NumberFormatException {
        u0.s sVar = new u0.s();
        x xVar = this.f2903b;
        u0.m mVar = xVar.f2580a.h;
        AbstractC0150d.e(mVar, "url");
        sVar.f2549a = mVar;
        sVar.c("CONNECT", null);
        u0.a aVar = xVar.f2580a;
        sVar.b("Host", v0.b.v(aVar.h, true));
        sVar.b("Proxy-Connection", "Keep-Alive");
        sVar.b("User-Agent", "okhttp/4.10.0");
        B0.h hVarA = sVar.a();
        A.f fVar = new A.f(29);
        C0.f.d("Proxy-Authenticate");
        C0.f.i("OkHttp-Preemptive", "Proxy-Authenticate");
        fVar.D("Proxy-Authenticate");
        fVar.z("Proxy-Authenticate", "OkHttp-Preemptive");
        fVar.A();
        aVar.f2410f.getClass();
        e(i2, i3, hVar);
        String str = "CONNECT " + v0.b.v((u0.m) hVarA.f118b, true) + " HTTP/1.1";
        o oVar = this.h;
        AbstractC0150d.b(oVar);
        n nVar = this.f2909i;
        AbstractC0150d.b(nVar);
        A0.h hVar2 = new A0.h(null, this, oVar, nVar);
        v vVarA = oVar.f433a.a();
        long j2 = i3;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        vVarA.g(j2, timeUnit);
        nVar.f430a.a().g(i4, timeUnit);
        hVar2.k((u0.k) hVarA.f119c, str);
        hVar2.b();
        t tVarF = hVar2.f(false);
        AbstractC0150d.b(tVarF);
        tVarF.f2554a = hVarA;
        u uVarA = tVarF.a();
        long j3 = v0.b.j(uVarA);
        if (j3 != -1) {
            A0.e eVarJ = hVar2.j(j3);
            v0.b.t(eVarJ, Integer.MAX_VALUE, timeUnit);
            eVarJ.close();
        }
        int i5 = uVarA.f2569d;
        if (i5 != 200) {
            if (i5 != 407) {
                throw new IOException(AbstractC0150d.h(Integer.valueOf(i5), "Unexpected response code for CONNECT: "));
            }
            aVar.f2410f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!oVar.f434b.f() || !nVar.f431b.f()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, h hVar) throws Throwable {
        u0.a aVar = this.f2903b.f2580a;
        SSLSocketFactory sSLSocketFactory = aVar.f2407c;
        r rVarS = r.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = aVar.f2412i;
            r rVar = r.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(rVar)) {
                this.f2905d = this.f2904c;
                this.f2907f = rVarS;
                return;
            } else {
                this.f2905d = this.f2904c;
                this.f2907f = rVar;
                l();
                return;
            }
        }
        AbstractC0150d.e(hVar, "call");
        u0.a aVar2 = this.f2903b.f2580a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.f2407c;
        SSLSocket sSLSocket = null;
        String strF = null;
        try {
            AbstractC0150d.b(sSLSocketFactory2);
            Socket socket = this.f2904c;
            u0.m mVar = aVar2.h;
            Socket socketCreateSocket = sSLSocketFactory2.createSocket(socket, mVar.f2486d, mVar.f2487e, true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                u0.h hVarA = bVar.a(sSLSocket2);
                if (hVarA.f2455b) {
                    C0.o oVar = C0.o.f236a;
                    C0.o.f236a.d(sSLSocket2, aVar2.h.f2486d, aVar2.f2412i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                AbstractC0150d.d(session, "sslSocketSession");
                u0.j jVarR = C0.d.r(session);
                HostnameVerifier hostnameVerifier = aVar2.f2408d;
                AbstractC0150d.b(hostnameVerifier);
                if (hostnameVerifier.verify(aVar2.h.f2486d, session)) {
                    u0.e eVar = aVar2.f2409e;
                    AbstractC0150d.b(eVar);
                    this.f2906e = new u0.j(jVarR.f2470a, jVarR.f2471b, jVarR.f2472c, new j(eVar, jVarR, aVar2));
                    AbstractC0150d.e(aVar2.h.f2486d, "hostname");
                    Iterator it = eVar.f2431a.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    if (hVarA.f2455b) {
                        C0.o oVar2 = C0.o.f236a;
                        strF = C0.o.f236a.f(sSLSocket2);
                    }
                    this.f2905d = sSLSocket2;
                    this.h = new o(C0.m.s(sSLSocket2));
                    this.f2909i = new n(C0.m.r(sSLSocket2));
                    if (strF != null) {
                        rVarS = C0.d.s(strF);
                    }
                    this.f2907f = rVarS;
                    C0.o oVar3 = C0.o.f236a;
                    C0.o.f236a.a(sSLSocket2);
                    if (this.f2907f == r.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List listA = jVarR.a();
                if (listA.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar2.h.f2486d + " not verified (no certificates)");
                }
                X509Certificate x509Certificate = (X509Certificate) listA.get(0);
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(aVar2.h.f2486d);
                sb.append(" not verified:\n              |    certificate: ");
                u0.e eVar2 = u0.e.f2430c;
                sb.append(C0.f.x(x509Certificate));
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                List listA2 = G0.c.a(x509Certificate, 7);
                List listA3 = G0.c.a(x509Certificate, 2);
                ArrayList arrayList = new ArrayList(listA3.size() + listA2.size());
                arrayList.addAll(listA2);
                arrayList.addAll(listA3);
                sb.append(arrayList);
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(q0.e.w(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    C0.o oVar4 = C0.o.f236a;
                    C0.o.f236a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    v0.b.d(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(u0.a aVar, ArrayList arrayList) {
        u0.j jVar;
        byte[] bArr = v0.b.f2808a;
        if (this.f2916p.size() < this.f2915o && !this.f2910j) {
            x xVar = this.f2903b;
            if (!xVar.f2580a.a(aVar)) {
                return false;
            }
            u0.m mVar = aVar.h;
            String str = mVar.f2486d;
            u0.a aVar2 = xVar.f2580a;
            if (AbstractC0150d.a(str, aVar2.h.f2486d)) {
                return true;
            }
            if (this.f2908g != null && arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    x xVar2 = (x) it.next();
                    Proxy.Type type = xVar2.f2581b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && xVar.f2581b.type() == type2) {
                        if (AbstractC0150d.a(xVar.f2582c, xVar2.f2582c)) {
                            if (aVar.f2408d != G0.c.f313a) {
                                return false;
                            }
                            byte[] bArr2 = v0.b.f2808a;
                            u0.m mVar2 = aVar2.h;
                            if (mVar.f2487e == mVar2.f2487e) {
                                String str2 = mVar2.f2486d;
                                String str3 = mVar.f2486d;
                                if (!AbstractC0150d.a(str3, str2)) {
                                    if (!this.f2911k && (jVar = this.f2906e) != null) {
                                        List listA = jVar.a();
                                        if (!listA.isEmpty() && G0.c.c(str3, (X509Certificate) listA.get(0))) {
                                            try {
                                                u0.e eVar = aVar.f2409e;
                                                AbstractC0150d.b(eVar);
                                                u0.j jVar2 = this.f2906e;
                                                AbstractC0150d.b(jVar2);
                                                List listA2 = jVar2.a();
                                                AbstractC0150d.e(str3, "hostname");
                                                AbstractC0150d.e(listA2, "peerCertificates");
                                                Iterator it2 = eVar.f2431a.iterator();
                                                if (!it2.hasNext()) {
                                                    return true;
                                                }
                                                it2.next().getClass();
                                                throw new ClassCastException();
                                            } catch (SSLPeerUnverifiedException unused) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean i(boolean z2) throws SocketException {
        long j2;
        byte[] bArr = v0.b.f2808a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f2904c;
        AbstractC0150d.b(socket);
        Socket socket2 = this.f2905d;
        AbstractC0150d.b(socket2);
        o oVar = this.h;
        AbstractC0150d.b(oVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        s sVar = this.f2908g;
        if (sVar != null) {
            synchronized (sVar) {
                if (sVar.f153f) {
                    return false;
                }
                if (sVar.f160n < sVar.f159m) {
                    if (jNanoTime >= sVar.f161o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j2 = jNanoTime - this.f2917q;
        }
        if (j2 < 10000000000L || !z2) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z3 = !oVar.f();
                socket2.setSoTimeout(soTimeout);
                return z3;
            } catch (Throwable th) {
                socket2.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final z0.d j(q qVar, z0.f fVar) throws SocketException {
        AbstractC0150d.e(qVar, "client");
        Socket socket = this.f2905d;
        AbstractC0150d.b(socket);
        o oVar = this.h;
        AbstractC0150d.b(oVar);
        n nVar = this.f2909i;
        AbstractC0150d.b(nVar);
        s sVar = this.f2908g;
        if (sVar != null) {
            return new B0.t(qVar, this, fVar, sVar);
        }
        int i2 = fVar.f2977g;
        socket.setSoTimeout(i2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        oVar.f433a.a().g(i2, timeUnit);
        nVar.f430a.a().g(fVar.h, timeUnit);
        return new A0.h(qVar, this, oVar, nVar);
    }

    public final synchronized void k() {
        this.f2910j = true;
    }

    public final void l() throws SocketException {
        Socket socket = this.f2905d;
        AbstractC0150d.b(socket);
        o oVar = this.h;
        AbstractC0150d.b(oVar);
        n nVar = this.f2909i;
        AbstractC0150d.b(nVar);
        boolean z2 = false;
        socket.setSoTimeout(0);
        x0.d dVar = x0.d.h;
        B0.h hVar = new B0.h(dVar);
        String str = this.f2903b.f2580a.h.f2486d;
        AbstractC0150d.e(str, "peerName");
        hVar.f119c = socket;
        String str2 = v0.b.h + ' ' + str;
        AbstractC0150d.e(str2, "<set-?>");
        hVar.f120d = str2;
        hVar.f121e = oVar;
        hVar.f122f = nVar;
        hVar.f123g = this;
        s sVar = new s(hVar);
        this.f2908g = sVar;
        F f2 = s.f147z;
        int i2 = 4;
        this.f2915o = (f2.f79a & 16) != 0 ? ((int[]) f2.f80b)[4] : Integer.MAX_VALUE;
        B b2 = sVar.f169w;
        synchronized (b2) {
            try {
                if (b2.f70d) {
                    throw new IOException("closed");
                }
                Logger logger = B.f66f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(v0.b.h(AbstractC0150d.h(AbstractC0006g.f113a.b(), ">> CONNECTION "), new Object[0]));
                }
                n nVar2 = b2.f67a;
                H0.h hVar2 = AbstractC0006g.f113a;
                nVar2.getClass();
                AbstractC0150d.e(hVar2, "byteString");
                if (nVar2.f432c) {
                    throw new IllegalStateException("closed");
                }
                nVar2.f431b.r(hVar2);
                nVar2.f();
                b2.f67a.flush();
            } finally {
            }
        }
        B b3 = sVar.f169w;
        F f3 = sVar.f162p;
        synchronized (b3) {
            try {
                AbstractC0150d.e(f3, "settings");
                if (b3.f70d) {
                    throw new IOException("closed");
                }
                b3.i(0, Integer.bitCount(f3.f79a) * 6, 4, 0);
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i3 + 1;
                    boolean z3 = true;
                    if (((1 << i3) & f3.f79a) == 0) {
                        z3 = z2;
                    }
                    if (z3) {
                        int i5 = i3 != i2 ? i3 != 7 ? i3 : i2 : 3;
                        n nVar3 = b3.f67a;
                        if (nVar3.f432c) {
                            throw new IllegalStateException("closed");
                        }
                        H0.e eVar = nVar3.f431b;
                        p pVarQ = eVar.q(2);
                        int i6 = pVarQ.f438c;
                        byte[] bArr = pVarQ.f436a;
                        bArr[i6] = (byte) ((i5 >>> 8) & 255);
                        bArr[i6 + 1] = (byte) (i5 & 255);
                        pVarQ.f438c = i6 + 2;
                        eVar.f412b += 2;
                        nVar3.f();
                        b3.f67a.i(((int[]) f3.f80b)[i3]);
                    }
                    i3 = i4;
                    z2 = false;
                    i2 = 4;
                }
                b3.f67a.flush();
            } finally {
            }
        }
        if (sVar.f162p.b() != 65535) {
            sVar.f169w.n(r2 - 65535, 0);
        }
        dVar.e().c(new B0.p(sVar.f150c, sVar.f170x, 1), 0L);
    }

    public final String toString() {
        u0.g gVar;
        StringBuilder sb = new StringBuilder("Connection{");
        x xVar = this.f2903b;
        sb.append(xVar.f2580a.h.f2486d);
        sb.append(':');
        sb.append(xVar.f2580a.h.f2487e);
        sb.append(", proxy=");
        sb.append(xVar.f2581b);
        sb.append(" hostAddress=");
        sb.append(xVar.f2582c);
        sb.append(" cipherSuite=");
        u0.j jVar = this.f2906e;
        Object obj = "none";
        if (jVar != null && (gVar = jVar.f2471b) != null) {
            obj = gVar;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f2907f);
        sb.append('}');
        return sb.toString();
    }
}
