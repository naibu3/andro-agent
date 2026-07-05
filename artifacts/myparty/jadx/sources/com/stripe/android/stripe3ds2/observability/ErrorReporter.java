package com.stripe.android.stripe3ds2.observability;

import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: ErrorReporter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "Ljava/io/Serializable;", "reportError", "", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ErrorReporter extends Serializable {
    void reportError(Throwable t);
}
