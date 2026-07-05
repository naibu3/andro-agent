package com.stripe.android.payments.paymentlauncher;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: StripePaymentLauncherAssistedFactory.kt */
@AssistedFactory
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JS\u0010\u0002\u001a\u00020\u00032\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncherAssistedFactory;", "", "create", "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;", "publishableKey", "Lkotlin/Function0;", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, "statusBarColor", "", "includePaymentSheetNextHandlers", "", "hostActivityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;ZLandroidx/activity/result/ActivityResultLauncher;)Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface StripePaymentLauncherAssistedFactory {
    StripePaymentLauncher create(@Assisted("publishableKey") Function0<String> publishableKey, @Assisted(NamedConstantsKt.STRIPE_ACCOUNT_ID) Function0<String> stripeAccountId, @Assisted(com.stripe.android.payments.core.injection.NamedConstantsKt.STATUS_BAR_COLOR) Integer statusBarColor, @Assisted(com.stripe.android.payments.core.injection.NamedConstantsKt.INCLUDE_PAYMENT_SHEET_NEXT_ACTION_HANDLERS) boolean includePaymentSheetNextHandlers, ActivityResultLauncher<PaymentLauncherContract.Args> hostActivityLauncher);
}
