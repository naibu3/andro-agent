package u0;

import java.io.Closeable;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class w implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v0.b.c(i());
    }

    public abstract long f();

    public abstract o h();

    public abstract H0.g i();

    public final String j() {
        H0.g gVarI = i();
        try {
            o oVarH = h();
            Charset charsetA = oVarH == null ? null : oVarH.a(q0.a.f2219a);
            if (charsetA == null) {
                charsetA = q0.a.f2219a;
            }
            String strE = gVarI.e(v0.b.r(gVarI, charsetA));
            C0.m.b(gVarI, null);
            return strE;
        } finally {
        }
    }
}
