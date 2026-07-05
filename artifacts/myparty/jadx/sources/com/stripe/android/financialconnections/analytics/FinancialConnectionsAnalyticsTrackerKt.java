package com.stripe.android.financialconnections.analytics;

import com.stripe.android.core.Logger;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.FinancialConnections;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.exception.AppInitializationError;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsAnalyticsTracker.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\f"}, d2 = {"logError", "", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "extraMessage", "", "error", "", "logger", "Lcom/stripe/android/core/Logger;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "emitPublicClientErrorEventIfNeeded", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsAnalyticsTrackerKt {
    public static final void logError(FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, String extraMessage, Throwable error, Logger logger, FinancialConnectionsSessionManifest.Pane pane) {
        Intrinsics.checkNotNullParameter(financialConnectionsAnalyticsTracker, "<this>");
        Intrinsics.checkNotNullParameter(extraMessage, "extraMessage");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(pane, "pane");
        financialConnectionsAnalyticsTracker.track(new FinancialConnectionsAnalyticsEvent.Error(pane, error, extraMessage));
        logger.error(extraMessage, error);
        emitPublicClientErrorEventIfNeeded(error);
    }

    private static final void emitPublicClientErrorEventIfNeeded(Throwable th) {
        StripeError stripeError;
        Map<String, String> extraFields;
        String str;
        StripeException stripeException = th instanceof StripeException ? (StripeException) th : null;
        if (stripeException == null || (stripeError = stripeException.getStripeError()) == null || (extraFields = stripeError.getExtraFields()) == null || (str = extraFields.get(FinancialConnectionsResponseEventEmitter.EVENTS_TO_EMIT)) == null || str.length() <= 0) {
            if (th instanceof AppInitializationError) {
                FinancialConnections.INSTANCE.m7282emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.ERROR, new FinancialConnectionsEvent.Metadata(null, null, FinancialConnectionsEvent.ErrorCode.WEB_BROWSER_UNAVAILABLE, 3, null));
            } else {
                FinancialConnections.INSTANCE.m7282emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.ERROR, new FinancialConnectionsEvent.Metadata(null, null, FinancialConnectionsEvent.ErrorCode.UNEXPECTED_ERROR, 3, null));
            }
        }
    }
}
