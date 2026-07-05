package com.stripe.android.financialconnections.analytics;

import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.exception.FinancialConnectionsError;
import com.stripe.android.financialconnections.exception.WebAuthFlowFailedException;
import java.util.Map;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AnalyticsMappers.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a$\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"toEventParams", "", "", "", "extraMessage", "MAX_LOG_LENGTH", "", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AnalyticsMappersKt {
    private static final int MAX_LOG_LENGTH = 100;

    public static final Map<String, String> toEventParams(Throwable th, String str) {
        String simpleName;
        String simpleName2;
        String message;
        String strValueOf;
        String message2;
        String strValueOf2;
        Intrinsics.checkNotNullParameter(th, "<this>");
        if (th instanceof WebAuthFlowFailedException) {
            WebAuthFlowFailedException webAuthFlowFailedException = (WebAuthFlowFailedException) th;
            return MapsKt.mapOf(TuplesKt.to("error", webAuthFlowFailedException.getReason()), TuplesKt.to("error_type", webAuthFlowFailedException.getReason()), TuplesKt.to("error_stacktrace", ExceptionsKt.stackTraceToString(th)), TuplesKt.to("error_message", CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{th.getMessage(), str}), " ", null, null, 0, null, null, 62, null)), TuplesKt.to("code", null));
        }
        if (th instanceof FinancialConnectionsError) {
            Pair[] pairArr = new Pair[5];
            FinancialConnectionsError financialConnectionsError = (FinancialConnectionsError) th;
            pairArr[0] = TuplesKt.to("error", financialConnectionsError.getName());
            pairArr[1] = TuplesKt.to("error_type", financialConnectionsError.getName());
            pairArr[2] = TuplesKt.to("error_stacktrace", ExceptionsKt.stackTraceToString(th));
            String[] strArr = new String[2];
            StripeError stripeError = financialConnectionsError.getStripeError();
            if (stripeError == null || (message2 = stripeError.getMessage()) == null) {
                message2 = th.getMessage();
            }
            strArr[0] = message2;
            strArr[1] = str;
            pairArr[3] = TuplesKt.to("error_message", CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) strArr), " ", null, null, 0, null, null, 62, null));
            StripeError stripeError2 = financialConnectionsError.getStripeError();
            if (stripeError2 == null || (strValueOf2 = stripeError2.getCode()) == null) {
                strValueOf2 = String.valueOf(financialConnectionsError.getStatusCode());
            }
            pairArr[4] = TuplesKt.to("code", strValueOf2);
            return MapsKt.mapOf(pairArr);
        }
        if (th instanceof StripeException) {
            Pair[] pairArr2 = new Pair[5];
            StripeException stripeException = (StripeException) th;
            StripeError stripeError3 = stripeException.getStripeError();
            if (stripeError3 == null || (simpleName = stripeError3.getType()) == null) {
                simpleName = th.getClass().getSimpleName();
            }
            pairArr2[0] = TuplesKt.to("error", simpleName);
            StripeError stripeError4 = stripeException.getStripeError();
            if (stripeError4 == null || (simpleName2 = stripeError4.getType()) == null) {
                simpleName2 = th.getClass().getSimpleName();
            }
            pairArr2[1] = TuplesKt.to("error_type", simpleName2);
            pairArr2[2] = TuplesKt.to("error_stacktrace", ExceptionsKt.stackTraceToString(th));
            String[] strArr2 = new String[2];
            StripeError stripeError5 = stripeException.getStripeError();
            if (stripeError5 == null || (message = stripeError5.getMessage()) == null) {
                message = th.getMessage();
            }
            strArr2[0] = message != null ? StringsKt.take(message, 100) : null;
            strArr2[1] = str;
            pairArr2[3] = TuplesKt.to("error_message", CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) strArr2), " ", null, null, 0, null, null, 62, null));
            StripeError stripeError6 = stripeException.getStripeError();
            if (stripeError6 == null || (strValueOf = stripeError6.getCode()) == null) {
                strValueOf = String.valueOf(stripeException.getStatusCode());
            }
            pairArr2[4] = TuplesKt.to("code", strValueOf);
            return MapsKt.mapOf(pairArr2);
        }
        Pair[] pairArr3 = new Pair[5];
        pairArr3[0] = TuplesKt.to("error", th.getClass().getSimpleName());
        pairArr3[1] = TuplesKt.to("error_type", th.getClass().getSimpleName());
        pairArr3[2] = TuplesKt.to("error_stacktrace", ExceptionsKt.stackTraceToString(th));
        String[] strArr3 = new String[2];
        String message3 = th.getMessage();
        strArr3[0] = message3 != null ? StringsKt.take(message3, 100) : null;
        strArr3[1] = str;
        pairArr3[3] = TuplesKt.to("error_message", CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) strArr3), " ", null, null, 0, null, null, 62, null));
        pairArr3[4] = TuplesKt.to("code", null);
        return MapsKt.mapOf(pairArr3);
    }
}
