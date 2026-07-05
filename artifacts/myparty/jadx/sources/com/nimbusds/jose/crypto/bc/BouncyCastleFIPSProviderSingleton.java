package com.nimbusds.jose.crypto.bc;

import java.security.Provider;
import java.security.Security;

/* loaded from: classes5.dex */
public final class BouncyCastleFIPSProviderSingleton {
    private static Provider bouncyCastleFIPSProvider;

    private BouncyCastleFIPSProviderSingleton() {
    }

    public static Provider getInstance() {
        if (bouncyCastleFIPSProvider == null) {
            bouncyCastleFIPSProvider = Security.getProvider("BCFIPS");
        }
        return bouncyCastleFIPSProvider;
    }
}
