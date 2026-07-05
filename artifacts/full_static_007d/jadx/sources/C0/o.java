package C0;

import android.util.Log;
import j0.AbstractC0150d;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import u0.q;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public static volatile o f236a;

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f237b;

    /* JADX WARN: Removed duplicated region for block: B:34:0x0095 A[PHI: r1
      0x0095: PHI (r1v32 C0.o) = (r1v15 C0.o), (r1v26 C0.o), (r1v30 C0.o), (r1v35 C0.o) binds: [B:55:0x00e3, B:49:0x00d5, B:41:0x00b5, B:33:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    static {
        o lVar;
        o oVar;
        if (g.c()) {
            for (Map.Entry entry : D0.b.f246b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (D0.b.f245a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(D0.c.f247a);
                }
            }
            oVar = a.f200d ? new a() : null;
            if (oVar == null) {
                jVar = c.f204e ? new c() : null;
                AbstractC0150d.b(jVar);
            }
        } else if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
            lVar = h.f219d ? new h() : null;
            if (lVar != null) {
            }
        } else if ("BC".equals(Security.getProviders()[0].getName())) {
            lVar = e.f207d ? new e() : null;
            if (lVar != null) {
            }
        } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
            lVar = n.f234d ? new n() : null;
            if (lVar != null) {
            }
        } else {
            lVar = l.f229c ? new l() : null;
            if (lVar != null) {
                oVar = lVar;
            } else {
                String property = System.getProperty("java.specification.version", "unknown");
                try {
                    AbstractC0150d.d(property, "jvmVersion");
                } catch (NumberFormatException unused) {
                }
                if (Integer.parseInt(property) < 9) {
                    try {
                        Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls2 = Class.forName(AbstractC0150d.h("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                        Class<?> cls3 = Class.forName(AbstractC0150d.h("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                        Class<?> cls4 = Class.forName(AbstractC0150d.h("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
                        Method method = cls.getMethod("put", SSLSocket.class, cls2);
                        Method method2 = cls.getMethod("get", SSLSocket.class);
                        Method method3 = cls.getMethod("remove", SSLSocket.class);
                        AbstractC0150d.d(method, "putMethod");
                        AbstractC0150d.d(method2, "getMethod");
                        AbstractC0150d.d(method3, "removeMethod");
                        AbstractC0150d.d(cls3, "clientProviderClass");
                        AbstractC0150d.d(cls4, "serverProviderClass");
                        jVar = new j(method, method2, method3, cls3, cls4);
                    } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                    }
                }
                oVar = jVar != null ? jVar : new o();
            }
        }
        f236a = oVar;
        f237b = Logger.getLogger(q.class.getName());
    }

    public static void i(String str, int i2, Throwable th) {
        AbstractC0150d.e(str, "message");
        f237b.log(i2 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public f b(X509TrustManager x509TrustManager) {
        AbstractC0150d.e(x509TrustManager, "trustManager");
        return new G0.a(c(x509TrustManager));
    }

    public G0.d c(X509TrustManager x509TrustManager) {
        AbstractC0150d.e(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        AbstractC0150d.d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new G0.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC0150d.e(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i2) throws IOException {
        AbstractC0150d.e(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i2);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f237b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        AbstractC0150d.e(str, "hostname");
        return true;
    }

    public void j(Object obj, String str) {
        AbstractC0150d.e(str, "message");
        if (obj == null) {
            str = AbstractC0150d.h(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);", str);
        }
        i(str, 5, (Throwable) obj);
    }

    public SSLContext k() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        AbstractC0150d.d(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory l(X509TrustManager x509TrustManager) throws KeyManagementException {
        try {
            SSLContext sSLContextK = k();
            sSLContextK.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextK.getSocketFactory();
            AbstractC0150d.d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e2) {
            throw new AssertionError(AbstractC0150d.h(e2, "No System TLS: "), e2);
        }
    }

    public X509TrustManager m() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC0150d.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager != null) {
                    return (X509TrustManager) trustManager;
                }
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
        }
        String string = Arrays.toString(trustManagers);
        AbstractC0150d.d(string, "toString(this)");
        throw new IllegalStateException(AbstractC0150d.h(string, "Unexpected default trust managers: ").toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }
}
