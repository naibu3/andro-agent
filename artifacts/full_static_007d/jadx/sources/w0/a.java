package w0;

import u0.t;
import u0.u;

/* loaded from: classes.dex */
public final class a {
    public static final u a(u uVar) {
        if ((uVar == null ? null : uVar.f2572g) == null) {
            return uVar;
        }
        t tVarI = uVar.i();
        tVarI.f2560g = null;
        return tVarI.a();
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
