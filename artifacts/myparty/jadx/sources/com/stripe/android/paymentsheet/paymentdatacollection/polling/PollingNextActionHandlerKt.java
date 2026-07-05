package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import kotlin.Metadata;

/* compiled from: PollingNextActionHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"UPI_TIME_LIMIT_IN_SECONDS", "", "UPI_INITIAL_DELAY_IN_SECONDS", "UPI_MAX_ATTEMPTS", "BLIK_TIME_LIMIT_IN_SECONDS", "BLIK_INITIAL_DELAY_IN_SECONDS", "BLIK_MAX_ATTEMPTS", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PollingNextActionHandlerKt {
    private static final int BLIK_INITIAL_DELAY_IN_SECONDS = 5;
    private static final int BLIK_MAX_ATTEMPTS = 12;
    private static final int BLIK_TIME_LIMIT_IN_SECONDS = 60;
    private static final int UPI_INITIAL_DELAY_IN_SECONDS = 5;
    private static final int UPI_MAX_ATTEMPTS = 12;
    private static final int UPI_TIME_LIMIT_IN_SECONDS = 300;
}
