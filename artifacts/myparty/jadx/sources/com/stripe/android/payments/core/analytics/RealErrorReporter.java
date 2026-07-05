package com.stripe.android.payments.core.analytics;

import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealErrorReporter.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/payments/core/analytics/RealErrorReporter;", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "analyticsRequestFactory", "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", "<init>", "(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/networking/AnalyticsRequestFactory;)V", "report", "", "errorEvent", "Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;", "stripeException", "Lcom/stripe/android/core/exception/StripeException;", "additionalNonPiiParams", "", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RealErrorReporter implements ErrorReporter {
    public static final int $stable = 8;
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final AnalyticsRequestFactory analyticsRequestFactory;

    @Override // com.stripe.android.payments.core.analytics.ErrorReporter, com.stripe.android.core.frauddetection.FraudDetectionErrorReporter
    public void reportFraudDetectionError(StripeException stripeException) {
        ErrorReporter.DefaultImpls.reportFraudDetectionError(this, stripeException);
    }

    @Inject
    public RealErrorReporter(AnalyticsRequestExecutor analyticsRequestExecutor, AnalyticsRequestFactory analyticsRequestFactory) {
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(analyticsRequestFactory, "analyticsRequestFactory");
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.analyticsRequestFactory = analyticsRequestFactory;
    }

    @Override // com.stripe.android.payments.core.analytics.ErrorReporter
    public void report(ErrorReporter.ErrorEvent errorEvent, StripeException stripeException, Map<String, String> additionalNonPiiParams) {
        Map<String, String> additionalParamsFromStripeException;
        Intrinsics.checkNotNullParameter(errorEvent, "errorEvent");
        Intrinsics.checkNotNullParameter(additionalNonPiiParams, "additionalNonPiiParams");
        if (stripeException == null) {
            additionalParamsFromStripeException = MapsKt.emptyMap();
        } else {
            additionalParamsFromStripeException = ErrorReporter.INSTANCE.getAdditionalParamsFromStripeException(stripeException);
        }
        this.analyticsRequestExecutor.executeAsync(this.analyticsRequestFactory.createRequest(errorEvent, MapsKt.plus(additionalParamsFromStripeException, additionalNonPiiParams)));
    }
}
