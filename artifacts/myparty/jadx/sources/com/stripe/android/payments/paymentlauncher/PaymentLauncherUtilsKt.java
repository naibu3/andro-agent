package com.stripe.android.payments.paymentlauncher;

import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.payments.paymentlauncher.InternalPaymentResult;
import com.stripe.android.payments.paymentlauncher.PaymentLauncher;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentLauncherUtils.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001aF\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00042!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\u0007¨\u0006\f"}, d2 = {"toInternalResultCallback", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$InternalPaymentResultCallback;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;", "toInternalPaymentResultCallback", "Lkotlin/Function1;", "Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;", "Lkotlin/ParameterName;", "name", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "callback", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "payments-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentLauncherUtilsKt {
    public static final PaymentLauncher.InternalPaymentResultCallback toInternalResultCallback(final PaymentLauncher.PaymentResultCallback paymentResultCallback) {
        Intrinsics.checkNotNullParameter(paymentResultCallback, "<this>");
        return new PaymentLauncher.InternalPaymentResultCallback() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherUtilsKt$$ExternalSyntheticLambda0
            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncher.InternalPaymentResultCallback
            public final void onPaymentResult(InternalPaymentResult internalPaymentResult) {
                PaymentLauncherUtilsKt.toInternalResultCallback$lambda$0(paymentResultCallback, internalPaymentResult);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toInternalResultCallback$lambda$0(PaymentLauncher.PaymentResultCallback paymentResultCallback, InternalPaymentResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof InternalPaymentResult.Completed) {
            paymentResultCallback.onPaymentResult(PaymentResult.Completed.INSTANCE);
        } else if (result instanceof InternalPaymentResult.Failed) {
            paymentResultCallback.onPaymentResult(new PaymentResult.Failed(((InternalPaymentResult.Failed) result).getThrowable()));
        } else {
            if (!(result instanceof InternalPaymentResult.Canceled)) {
                throw new NoWhenBranchMatchedException();
            }
            paymentResultCallback.onPaymentResult(PaymentResult.Canceled.INSTANCE);
        }
    }

    public static final Function1<InternalPaymentResult, Unit> toInternalPaymentResultCallback(final Function1<? super PaymentResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new Function1() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherUtilsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentLauncherUtilsKt.toInternalPaymentResultCallback$lambda$1(callback, (InternalPaymentResult) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toInternalPaymentResultCallback$lambda$1(Function1 function1, InternalPaymentResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof InternalPaymentResult.Completed) {
            function1.invoke(PaymentResult.Completed.INSTANCE);
        } else if (result instanceof InternalPaymentResult.Failed) {
            function1.invoke(new PaymentResult.Failed(((InternalPaymentResult.Failed) result).getThrowable()));
        } else {
            if (!(result instanceof InternalPaymentResult.Canceled)) {
                throw new NoWhenBranchMatchedException();
            }
            function1.invoke(PaymentResult.Canceled.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
