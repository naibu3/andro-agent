package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.Intent;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExternalPaymentMethodResultHandler.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\fR\u000e\u0010\r\u001a\u00020\u000eX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResultHandler;", "", "<init>", "()V", "onExternalPaymentMethodResult", "", "context", "Landroid/content/Context;", "externalPaymentMethodResult", "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodResult;", "createResultIntent", "Landroid/content/Intent;", "createResultIntent$paymentsheet_release", "EXTRA_EXTERNAL_PAYMENT_METHOD_RESULT", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExternalPaymentMethodResultHandler {
    public static final int $stable = 0;
    public static final String EXTRA_EXTERNAL_PAYMENT_METHOD_RESULT = "external_payment_method_result";
    public static final ExternalPaymentMethodResultHandler INSTANCE = new ExternalPaymentMethodResultHandler();

    private ExternalPaymentMethodResultHandler() {
    }

    @JvmStatic
    public static final void onExternalPaymentMethodResult(Context context, ExternalPaymentMethodResult externalPaymentMethodResult) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(externalPaymentMethodResult, "externalPaymentMethodResult");
        context.startActivity(INSTANCE.createResultIntent$paymentsheet_release(context, externalPaymentMethodResult));
    }

    public final Intent createResultIntent$paymentsheet_release(Context context, ExternalPaymentMethodResult externalPaymentMethodResult) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(externalPaymentMethodResult, "externalPaymentMethodResult");
        Intent intentPutExtra = new Intent().setClass(context, ExternalPaymentMethodProxyActivity.class).addFlags(268435456).addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).addFlags(536870912).putExtra(EXTRA_EXTERNAL_PAYMENT_METHOD_RESULT, externalPaymentMethodResult);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }
}
