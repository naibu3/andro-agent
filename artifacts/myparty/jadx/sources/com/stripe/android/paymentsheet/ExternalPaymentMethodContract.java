package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.provider.FontsContractCompat;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.core.exception.LocalStripeException;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.paymentsheet.ExternalPaymentMethodResult;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExternalPaymentMethodContract.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u001a\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/ExternalPaymentMethodContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodInput;", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "<init>", "(Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V", "getErrorReporter", "()Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", SDKConstants.PARAM_INTENT, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExternalPaymentMethodContract extends ActivityResultContract<ExternalPaymentMethodInput, PaymentResult> {
    public static final int $stable = 8;
    private final ErrorReporter errorReporter;

    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    public ExternalPaymentMethodContract(ErrorReporter errorReporter) {
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, ExternalPaymentMethodInput input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtra = new Intent().setClass(context, ExternalPaymentMethodProxyActivity.class).putExtra(ExternalPaymentMethodProxyActivity.EXTRA_EXTERNAL_PAYMENT_METHOD_TYPE, input.getType()).putExtra("payment_element_identifier", input.getPaymentElementCallbackIdentifier()).putExtra(ExternalPaymentMethodProxyActivity.EXTRA_BILLING_DETAILS, input.getBillingDetails());
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContract
    public PaymentResult parseResult(int resultCode, Intent intent) {
        if (resultCode == -1) {
            return PaymentResult.Completed.INSTANCE;
        }
        if (resultCode == 0) {
            return PaymentResult.Canceled.INSTANCE;
        }
        if (resultCode == 1) {
            return new PaymentResult.Failed(new LocalStripeException(intent != null ? intent.getStringExtra(ExternalPaymentMethodResult.Failed.DISPLAY_MESSAGE_EXTRA) : null, "externalPaymentMethodFailure"));
        }
        ErrorReporter.DefaultImpls.report$default(this.errorReporter, ErrorReporter.UnexpectedErrorEvent.EXTERNAL_PAYMENT_METHOD_UNEXPECTED_RESULT_CODE, null, MapsKt.mapOf(TuplesKt.to(FontsContractCompat.Columns.RESULT_CODE, String.valueOf(resultCode))), 2, null);
        return new PaymentResult.Failed(new IllegalArgumentException("Invalid result code returned by external payment method activity"));
    }
}
