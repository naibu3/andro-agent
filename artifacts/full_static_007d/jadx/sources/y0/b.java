package y0;

import c0.C0096a;
import j0.AbstractC0150d;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import k.U0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f2856a;

    /* renamed from: b, reason: collision with root package name */
    public int f2857b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2858c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2859d;

    public b(List list) {
        AbstractC0150d.e(list, "connectionSpecs");
        this.f2856a = list;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.Serializable, java.lang.String[]] */
    public final u0.h a(SSLSocket sSLSocket) throws UnknownServiceException {
        u0.h hVar;
        int i2;
        boolean z2;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i3 = this.f2857b;
        List list = this.f2856a;
        int size = list.size();
        while (true) {
            if (i3 >= size) {
                hVar = null;
                break;
            }
            int i4 = i3 + 1;
            hVar = (u0.h) list.get(i3);
            if (hVar.b(sSLSocket)) {
                this.f2857b = i4;
                break;
            }
            i3 = i4;
        }
        if (hVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f2859d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            AbstractC0150d.b(enabledProtocols2);
            String string = Arrays.toString(enabledProtocols2);
            AbstractC0150d.d(string, "toString(this)");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i5 = this.f2857b;
        int size2 = list.size();
        while (true) {
            i2 = 0;
            if (i5 >= size2) {
                z2 = false;
                break;
            }
            int i6 = i5 + 1;
            if (((u0.h) list.get(i5)).b(sSLSocket)) {
                z2 = true;
                break;
            }
            i5 = i6;
        }
        this.f2858c = z2;
        boolean z3 = this.f2859d;
        String[] strArr = hVar.f2456c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            AbstractC0150d.d(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = v0.b.o(enabledCipherSuites2, strArr, u0.g.f2434c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        ?? r6 = hVar.f2457d;
        if (r6 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            AbstractC0150d.d(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = v0.b.o(enabledProtocols3, r6, C0096a.f1257b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC0150d.d(supportedCipherSuites, "supportedCipherSuites");
        u0.f fVar = u0.g.f2434c;
        byte[] bArr = v0.b.f2808a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (fVar.compare(supportedCipherSuites[i2], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i2++;
        }
        if (z3 && i2 != -1) {
            AbstractC0150d.d(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i2];
            AbstractC0150d.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            AbstractC0150d.d(objArrCopyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        U0 u02 = new U0();
        u02.f1849a = hVar.f2454a;
        u02.f1851c = strArr;
        u02.f1852d = r6;
        u02.f1850b = hVar.f2455b;
        AbstractC0150d.d(enabledCipherSuites, "cipherSuitesIntersection");
        u02.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        AbstractC0150d.d(enabledProtocols, "tlsVersionsIntersection");
        u02.d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        u0.h hVarA = u02.a();
        if (hVarA.c() != null) {
            sSLSocket.setEnabledProtocols(hVarA.f2457d);
        }
        if (hVarA.a() != null) {
            sSLSocket.setEnabledCipherSuites(hVarA.f2456c);
        }
        return hVar;
    }
}
