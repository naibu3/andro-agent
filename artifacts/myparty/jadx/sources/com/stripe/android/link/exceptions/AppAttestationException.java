package com.stripe.android.link.exceptions;

import com.stripe.android.core.exception.StripeException;
import kotlin.Metadata;

/* compiled from: MissingConfigurationException.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/link/exceptions/AppAttestationException;", "Lcom/stripe/android/core/exception/StripeException;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AppAttestationException extends StripeException {
    public static final int $stable = 0;

    public AppAttestationException(Throwable th) {
        super(null, null, 0, th, null, 23, null);
    }
}
