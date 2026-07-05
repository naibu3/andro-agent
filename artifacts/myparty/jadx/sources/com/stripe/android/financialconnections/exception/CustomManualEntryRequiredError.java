package com.stripe.android.financialconnections.exception;

import com.stripe.android.core.exception.StripeException;
import kotlin.Metadata;

/* compiled from: CustomManualEntryRequiredError.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0017¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/exception/CustomManualEntryRequiredError;", "Lcom/stripe/android/core/exception/StripeException;", "<init>", "()V", "analyticsValue", "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomManualEntryRequiredError extends StripeException {
    public static final int $stable = 0;

    public CustomManualEntryRequiredError() {
        super(null, null, 0, null, null, 31, null);
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String analyticsValue() {
        return "fcCustomManualEntryRequiredError";
    }
}
