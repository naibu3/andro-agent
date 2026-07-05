package com.stripe.android.paymentelement;

import android.content.Context;
import android.content.Intent;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.stripe.android.paymentelement.confirmation.cpms.CustomPaymentMethodProxyActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomPaymentMethodResultHandler.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentelement/CustomPaymentMethodResultHandler;", "", "<init>", "()V", "handleCustomPaymentMethodResult", "", "context", "Landroid/content/Context;", "customPaymentMethodResult", "Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;", "createResultIntent", "Landroid/content/Intent;", "EXTRA_CUSTOM_PAYMENT_METHOD_RESULT", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomPaymentMethodResultHandler {
    public static final int $stable = 0;
    public static final String EXTRA_CUSTOM_PAYMENT_METHOD_RESULT = "custom_payment_method_result";
    public static final CustomPaymentMethodResultHandler INSTANCE = new CustomPaymentMethodResultHandler();

    private CustomPaymentMethodResultHandler() {
    }

    @JvmStatic
    public static final void handleCustomPaymentMethodResult(Context context, CustomPaymentMethodResult customPaymentMethodResult) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customPaymentMethodResult, "customPaymentMethodResult");
        context.startActivity(INSTANCE.createResultIntent(context, customPaymentMethodResult));
    }

    private final Intent createResultIntent(Context context, CustomPaymentMethodResult customPaymentMethodResult) {
        Intent intentPutExtra = new Intent().setClass(context, CustomPaymentMethodProxyActivity.class).addFlags(268435456).addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).addFlags(536870912).putExtra(EXTRA_CUSTOM_PAYMENT_METHOD_RESULT, customPaymentMethodResult);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }
}
