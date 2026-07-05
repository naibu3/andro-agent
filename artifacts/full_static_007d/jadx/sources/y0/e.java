package y0;

import B0.C0000a;
import B0.EnumC0001b;
import B0.F;
import B0.G;
import b0.AbstractC0088n;
import b0.C0079e;
import b0.C0091q;
import j0.AbstractC0150d;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import u0.x;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final l f2873a;

    /* renamed from: b, reason: collision with root package name */
    public final u0.a f2874b;

    /* renamed from: c, reason: collision with root package name */
    public final h f2875c;

    /* renamed from: d, reason: collision with root package name */
    public F f2876d;

    /* renamed from: e, reason: collision with root package name */
    public A0.h f2877e;

    /* renamed from: f, reason: collision with root package name */
    public int f2878f;

    /* renamed from: g, reason: collision with root package name */
    public int f2879g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public x f2880i;

    public e(l lVar, u0.a aVar, h hVar) {
        AbstractC0150d.e(lVar, "connectionPool");
        AbstractC0150d.e(hVar, "call");
        this.f2873a = lVar;
        this.f2874b = aVar;
        this.f2875c = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x02e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k a(int i2, int i3, int i4, boolean z2, boolean z3) throws IOException {
        ArrayList arrayList;
        String hostAddress;
        int port;
        boolean zContains;
        x0.c cVar;
        Socket socketJ;
        while (!this.f2875c.f2896m) {
            k kVar = this.f2875c.h;
            if (kVar != null) {
                synchronized (kVar) {
                    try {
                        socketJ = (kVar.f2910j || !b(kVar.f2903b.f2580a.h)) ? this.f2875c.j() : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f2875c.h == null) {
                    if (socketJ != null) {
                        v0.b.d(socketJ);
                    }
                    AbstractC0150d.e(this.f2875c, "call");
                    this.f2878f = 0;
                    this.f2879g = 0;
                    this.h = 0;
                    if (this.f2873a.a(this.f2874b, this.f2875c, null, false)) {
                        x xVar = this.f2880i;
                        try {
                            if (xVar != null) {
                                this.f2880i = null;
                            } else {
                                F f2 = this.f2876d;
                                if (f2 == null || !f2.c()) {
                                    A0.h hVar = this.f2877e;
                                    if (hVar == null) {
                                        u0.a aVar = this.f2874b;
                                        h hVar2 = this.f2875c;
                                        hVar = new A0.h(aVar, hVar2.f2885a.y, hVar2);
                                        this.f2877e = hVar;
                                    }
                                    if (!hVar.i()) {
                                        throw new NoSuchElementException();
                                    }
                                    arrayList = new ArrayList();
                                    while (hVar.f46a < ((List) hVar.f50e).size()) {
                                        boolean z4 = hVar.f46a < ((List) hVar.f50e).size();
                                        u0.a aVar2 = (u0.a) hVar.f47b;
                                        if (!z4) {
                                            throw new SocketException("No route to " + aVar2.h.f2486d + "; exhausted proxy configurations: " + ((List) hVar.f50e));
                                        }
                                        List list = (List) hVar.f50e;
                                        int i5 = hVar.f46a;
                                        hVar.f46a = i5 + 1;
                                        Proxy proxy = (Proxy) list.get(i5);
                                        ArrayList arrayList2 = new ArrayList();
                                        hVar.f51f = arrayList2;
                                        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                            u0.m mVar = aVar2.h;
                                            hostAddress = mVar.f2486d;
                                            port = mVar.f2487e;
                                        } else {
                                            SocketAddress socketAddressAddress = proxy.address();
                                            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                                                throw new IllegalArgumentException(AbstractC0150d.h(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ").toString());
                                            }
                                            AbstractC0150d.d(socketAddressAddress, "proxyAddress");
                                            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                                            AbstractC0150d.e(inetSocketAddress, "<this>");
                                            InetAddress address = inetSocketAddress.getAddress();
                                            if (address == null) {
                                                hostAddress = inetSocketAddress.getHostName();
                                                AbstractC0150d.d(hostAddress, "hostName");
                                            } else {
                                                hostAddress = address.getHostAddress();
                                                AbstractC0150d.d(hostAddress, "address.hostAddress");
                                            }
                                            port = inetSocketAddress.getPort();
                                        }
                                        if (1 > port || port >= 65536) {
                                            throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                                        }
                                        if (proxy.type() == Proxy.Type.SOCKS) {
                                            arrayList2.add(InetSocketAddress.createUnresolved(hostAddress, port));
                                        } else {
                                            AbstractC0150d.e((h) hVar.f49d, "call");
                                            AbstractC0150d.e(hostAddress, "domainName");
                                            aVar2.f2405a.getClass();
                                            try {
                                                InetAddress[] allByName = InetAddress.getAllByName(hostAddress);
                                                AbstractC0150d.d(allByName, "getAllByName(hostname)");
                                                int length = allByName.length;
                                                List arrayList3 = length != 0 ? length != 1 ? new ArrayList(new C0079e(allByName, false)) : C0.d.y(allByName[0]) : C0091q.f1234a;
                                                if (arrayList3.isEmpty()) {
                                                    throw new UnknownHostException(aVar2.f2405a + " returned no addresses for " + hostAddress);
                                                }
                                                Iterator it = arrayList3.iterator();
                                                while (it.hasNext()) {
                                                    arrayList2.add(new InetSocketAddress((InetAddress) it.next(), port));
                                                }
                                            } catch (NullPointerException e2) {
                                                UnknownHostException unknownHostException = new UnknownHostException(AbstractC0150d.h(hostAddress, "Broken system behaviour for dns lookup of "));
                                                unknownHostException.initCause(e2);
                                                throw unknownHostException;
                                            }
                                        }
                                        Iterator it2 = hVar.f51f.iterator();
                                        while (it2.hasNext()) {
                                            x xVar2 = new x((u0.a) hVar.f47b, proxy, (InetSocketAddress) it2.next());
                                            x0.c cVar2 = (x0.c) hVar.f48c;
                                            synchronized (cVar2) {
                                                zContains = ((LinkedHashSet) cVar2.f2846a).contains(xVar2);
                                            }
                                            if (zContains) {
                                                ((ArrayList) hVar.f52g).add(xVar2);
                                            } else {
                                                arrayList.add(xVar2);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            break;
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        AbstractC0088n.J(arrayList, (ArrayList) hVar.f52g);
                                        ((ArrayList) hVar.f52g).clear();
                                    }
                                    F f3 = new F(arrayList, 4);
                                    this.f2876d = f3;
                                    if (this.f2875c.f2896m) {
                                        throw new IOException("Canceled");
                                    }
                                    if (this.f2873a.a(this.f2874b, this.f2875c, arrayList, false)) {
                                        kVar = this.f2875c.h;
                                        AbstractC0150d.b(kVar);
                                        AbstractC0150d.e(this.f2875c, "call");
                                    } else {
                                        if (!f3.c()) {
                                            throw new NoSuchElementException();
                                        }
                                        int i6 = f3.f79a;
                                        f3.f79a = i6 + 1;
                                        xVar = (x) arrayList.get(i6);
                                        kVar = new k(this.f2873a, xVar);
                                        this.f2875c.f2898o = kVar;
                                        kVar.c(i2, i3, i4, z2, this.f2875c);
                                        this.f2875c.f2898o = null;
                                        cVar = this.f2875c.f2885a.y;
                                        synchronized (cVar) {
                                            ((LinkedHashSet) cVar.f2846a).remove(xVar);
                                        }
                                        if (this.f2873a.a(this.f2874b, this.f2875c, arrayList, true)) {
                                            k kVar2 = this.f2875c.h;
                                            AbstractC0150d.b(kVar2);
                                            this.f2880i = xVar;
                                            Socket socket = kVar.f2905d;
                                            AbstractC0150d.b(socket);
                                            v0.b.d(socket);
                                            AbstractC0150d.e(this.f2875c, "call");
                                            kVar = kVar2;
                                        } else {
                                            synchronized (kVar) {
                                                l lVar = this.f2873a;
                                                lVar.getClass();
                                                byte[] bArr = v0.b.f2808a;
                                                lVar.f2921d.add(kVar);
                                                lVar.f2919b.c(lVar.f2920c, 0L);
                                                this.f2875c.b(kVar);
                                            }
                                            AbstractC0150d.e(this.f2875c, "call");
                                        }
                                    }
                                } else {
                                    F f4 = this.f2876d;
                                    AbstractC0150d.b(f4);
                                    if (!f4.c()) {
                                        throw new NoSuchElementException();
                                    }
                                    int i7 = f4.f79a;
                                    f4.f79a = i7 + 1;
                                    xVar = (x) ((ArrayList) f4.f80b).get(i7);
                                }
                            }
                            kVar.c(i2, i3, i4, z2, this.f2875c);
                            this.f2875c.f2898o = null;
                            cVar = this.f2875c.f2885a.y;
                            synchronized (cVar) {
                            }
                        } catch (Throwable th2) {
                            this.f2875c.f2898o = null;
                            throw th2;
                        }
                        arrayList = null;
                        kVar = new k(this.f2873a, xVar);
                        this.f2875c.f2898o = kVar;
                    } else {
                        kVar = this.f2875c.h;
                        AbstractC0150d.b(kVar);
                        AbstractC0150d.e(this.f2875c, "call");
                    }
                } else if (socketJ != null) {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                this.f2878f = 0;
                this.f2879g = 0;
                this.h = 0;
                if (this.f2873a.a(this.f2874b, this.f2875c, null, false)) {
                }
            }
            if (kVar.i(z3)) {
                return kVar;
            }
            kVar.k();
            if (this.f2880i == null) {
                F f5 = this.f2876d;
                if (f5 == null ? true : f5.c()) {
                    continue;
                } else {
                    A0.h hVar3 = this.f2877e;
                    if (!(hVar3 == null ? true : hVar3.i())) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(u0.m mVar) {
        AbstractC0150d.e(mVar, "url");
        u0.m mVar2 = this.f2874b.h;
        return mVar.f2487e == mVar2.f2487e && AbstractC0150d.a(mVar.f2486d, mVar2.f2486d);
    }

    public final void c(IOException iOException) {
        AbstractC0150d.e(iOException, "e");
        this.f2880i = null;
        if (iOException instanceof G) {
            if (((G) iOException).f81a == EnumC0001b.REFUSED_STREAM) {
                this.f2878f++;
                return;
            }
        }
        if (iOException instanceof C0000a) {
            this.f2879g++;
        } else {
            this.h++;
        }
    }
}
