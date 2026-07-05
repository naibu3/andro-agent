package com.stripe.android.paymentsheet.utils;

import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.analytics.PaymentSheetConfirmationError;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfirmationReportingUtils.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u001a\u001e\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0000¨\u0006\n"}, d2 = {"toConfirmationError", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed;", "reportPaymentResult", "", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConfirmationReportingUtilsKt {
    public static final PaymentSheetConfirmationError toConfirmationError(ConfirmationHandler.Result.Failed failed) {
        Intrinsics.checkNotNullParameter(failed, "<this>");
        ConfirmationHandler.Result.Failed.ErrorType type = failed.getType();
        if (Intrinsics.areEqual(type, ConfirmationHandler.Result.Failed.ErrorType.ExternalPaymentMethod.INSTANCE)) {
            return PaymentSheetConfirmationError.ExternalPaymentMethod.INSTANCE;
        }
        if (Intrinsics.areEqual(type, ConfirmationHandler.Result.Failed.ErrorType.Payment.INSTANCE)) {
            return new PaymentSheetConfirmationError.Stripe(failed.getCause());
        }
        if (type instanceof ConfirmationHandler.Result.Failed.ErrorType.GooglePay) {
            return new PaymentSheetConfirmationError.GooglePay(((ConfirmationHandler.Result.Failed.ErrorType.GooglePay) failed.getType()).getErrorCode());
        }
        if (Intrinsics.areEqual(type, ConfirmationHandler.Result.Failed.ErrorType.Internal.INSTANCE) || Intrinsics.areEqual(type, ConfirmationHandler.Result.Failed.ErrorType.MerchantIntegration.INSTANCE) || Intrinsics.areEqual(type, ConfirmationHandler.Result.Failed.ErrorType.Fatal.INSTANCE)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void reportPaymentResult(EventReporter eventReporter, ConfirmationHandler.Result result, PaymentSelection paymentSelection) {
        Intrinsics.checkNotNullParameter(eventReporter, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        if (paymentSelection != null) {
            if (result instanceof ConfirmationHandler.Result.Succeeded) {
                eventReporter.onPaymentSuccess(paymentSelection, ((ConfirmationHandler.Result.Succeeded) result).getDeferredIntentConfirmationType());
                return;
            }
            if (result instanceof ConfirmationHandler.Result.Failed) {
                PaymentSheetConfirmationError confirmationError = toConfirmationError((ConfirmationHandler.Result.Failed) result);
                if (confirmationError != null) {
                    eventReporter.onPaymentFailure(paymentSelection, confirmationError);
                    return;
                }
                return;
            }
            if (!(result instanceof ConfirmationHandler.Result.Canceled)) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
