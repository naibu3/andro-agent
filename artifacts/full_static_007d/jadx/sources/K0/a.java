package K0;

import L0.b;
import java.security.AccessController;
import java.security.ProviderException;

/* loaded from: classes.dex */
public final class a extends b {
    public a() {
        super("OpenJSSE", b.f519a, b.f520b);
        if (Boolean.TRUE.equals(null)) {
            throw new ProviderException("OpenJSSE is already initialized in FIPS mode");
        }
        AccessController.doPrivileged(new L0.a(this));
    }
}
