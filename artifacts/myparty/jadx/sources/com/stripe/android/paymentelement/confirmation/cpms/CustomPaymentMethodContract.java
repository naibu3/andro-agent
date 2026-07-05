package com.stripe.android.paymentelement.confirmation.cpms;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomPaymentMethodContract.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodInput;", "Lcom/stripe/android/paymentelement/confirmation/cpms/InternalCustomPaymentMethodResult;", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", SDKConstants.PARAM_INTENT, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomPaymentMethodContract extends ActivityResultContract<CustomPaymentMethodInput, InternalCustomPaymentMethodResult> {
    public static final int $stable = 0;

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, CustomPaymentMethodInput input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intentPutExtra = new Intent().setClass(context, CustomPaymentMethodProxyActivity.class).putExtra("payment_element_identifier", input.getPaymentElementCallbackIdentifier()).putExtra(CustomPaymentMethodProxyActivity.EXTRA_CUSTOM_PAYMENT_METHOD_TYPE, input.getType()).putExtra(CustomPaymentMethodProxyActivity.EXTRA_BILLING_DETAILS, input.getBillingDetails());
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContract
    public InternalCustomPaymentMethodResult parseResult(int resultCode, Intent intent) {
        return InternalCustomPaymentMethodResult.INSTANCE.fromIntent$paymentsheet_release(intent);
    }
}
