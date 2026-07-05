package C0;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import b0.AbstractC0081g;
import j0.AbstractC0150d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class a extends o {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f200d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f201c;

    static {
        f200d = g.c() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList arrayListB = AbstractC0081g.B(new D0.l[]{(!g.c() || Build.VERSION.SDK_INT < 29) ? null : new D0.i(1), new D0.k(D0.e.f249f), new D0.k(D0.i.f261b), new D0.k(D0.g.f255a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((D0.l) next).c()) {
                arrayList.add(next);
            }
        }
        this.f201c = arrayList;
    }

    @Override // C0.o
    public final f b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        AbstractC0150d.e(x509TrustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        D0.a aVar = x509TrustManagerExtensions != null ? new D0.a(x509TrustManager, x509TrustManagerExtensions) : null;
        return aVar == null ? super.b(x509TrustManager) : aVar;
    }

    @Override // C0.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        AbstractC0150d.e(list, "protocols");
        Iterator it = this.f201c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((D0.l) next).a(sSLSocket)) {
                    break;
                }
            }
        }
        D0.l lVar = (D0.l) next;
        if (lVar == null) {
            return;
        }
        lVar.d(sSLSocket, str, list);
    }

    @Override // C0.o
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f201c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((D0.l) next).a(sSLSocket)) {
                break;
            }
        }
        D0.l lVar = (D0.l) next;
        if (lVar == null) {
            return null;
        }
        return lVar.b(sSLSocket);
    }

    @Override // C0.o
    public final boolean h(String str) {
        AbstractC0150d.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
