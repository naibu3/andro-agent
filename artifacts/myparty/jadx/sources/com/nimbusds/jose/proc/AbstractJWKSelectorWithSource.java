package com.nimbusds.jose.proc;

import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import java.util.Objects;

@ThreadSafe
/* loaded from: classes5.dex */
abstract class AbstractJWKSelectorWithSource<C extends SecurityContext> {
    private final JWKSource<C> jwkSource;

    public AbstractJWKSelectorWithSource(JWKSource<C> jWKSource) {
        this.jwkSource = (JWKSource) Objects.requireNonNull(jWKSource);
    }

    public JWKSource<C> getJWKSource() {
        return this.jwkSource;
    }
}
