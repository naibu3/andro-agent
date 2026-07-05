package com.stripe.android.paymentsheet.model;

import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.state.PaymentSheetLoadingException;
import com.stripe.android.paymentsheet.state.PaymentSheetLoadingExceptionKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeIntentValidator.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\"\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006\"\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\b¨\u0006\t"}, d2 = {"validate", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoadingException;", "Lcom/stripe/android/model/StripeIntent;", "isInTerminalState", "", "Lcom/stripe/android/model/PaymentIntent;", "(Lcom/stripe/android/model/PaymentIntent;)Z", "Lcom/stripe/android/model/SetupIntent;", "(Lcom/stripe/android/model/SetupIntent;)Z", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StripeIntentValidatorKt {
    public static final PaymentSheetLoadingException validate(StripeIntent stripeIntent) {
        Object objM9118constructorimpl;
        Intrinsics.checkNotNullParameter(stripeIntent, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(StripeIntentValidator.INSTANCE.requireValid(stripeIntent));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            return PaymentSheetLoadingExceptionKt.getAsPaymentSheetLoadingException(thM9121exceptionOrNullimpl);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isInTerminalState(PaymentIntent paymentIntent) {
        return CollectionsKt.contains(SetsKt.setOf((Object[]) new StripeIntent.Status[]{StripeIntent.Status.Canceled, StripeIntent.Status.Succeeded, StripeIntent.Status.RequiresCapture}), paymentIntent.getStatus());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isInTerminalState(SetupIntent setupIntent) {
        return CollectionsKt.contains(SetsKt.setOf((Object[]) new StripeIntent.Status[]{StripeIntent.Status.Canceled, StripeIntent.Status.Succeeded}), setupIntent.getStatus());
    }
}
