package com.stripe.android.financialconnections.utils;

import com.stripe.android.core.exception.StripeException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Errors.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/utils/PollingReachedMaxRetriesException;", "Lcom/stripe/android/core/exception/StripeException;", "pollingOptions", "Lcom/stripe/android/financialconnections/utils/PollTimingOptions;", "<init>", "(Lcom/stripe/android/financialconnections/utils/PollTimingOptions;)V", "analyticsValue", "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PollingReachedMaxRetriesException extends StripeException {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollingReachedMaxRetriesException(PollTimingOptions pollingOptions) {
        super(null, null, 202, null, "reached max number of retries " + pollingOptions.getMaxNumberOfRetries() + ".", 11, null);
        Intrinsics.checkNotNullParameter(pollingOptions, "pollingOptions");
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String analyticsValue() {
        return "pollingReachedMaxRetriesError";
    }
}
