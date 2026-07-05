package com.stripe.android.model;

import com.stripe.android.StripePaymentController;
import com.stripe.android.model.PaymentMethod;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeIntentKtx.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"getRequestCode", "", "Lcom/stripe/android/model/StripeIntent;", "shouldRefresh", "", "REFRESHABLE_PAYMENT_METHODS", "", "Lcom/stripe/android/model/PaymentMethod$Type;", "getREFRESHABLE_PAYMENT_METHODS", "()Ljava/util/Set;", "payments-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StripeIntentKtxKt {
    private static final Set<PaymentMethod.Type> REFRESHABLE_PAYMENT_METHODS = SetsKt.setOf(PaymentMethod.Type.WeChatPay);

    public static final int getRequestCode(StripeIntent stripeIntent) {
        Intrinsics.checkNotNullParameter(stripeIntent, "<this>");
        return StripePaymentController.INSTANCE.getRequestCode$payments_core_release(stripeIntent);
    }

    public static final boolean shouldRefresh(StripeIntent stripeIntent) {
        Intrinsics.checkNotNullParameter(stripeIntent, "<this>");
        if (!(stripeIntent instanceof PaymentIntent)) {
            return false;
        }
        Set<PaymentMethod.Type> set = REFRESHABLE_PAYMENT_METHODS;
        PaymentIntent paymentIntent = (PaymentIntent) stripeIntent;
        PaymentMethod paymentMethod = paymentIntent.getPaymentMethod();
        return CollectionsKt.contains(set, paymentMethod != null ? paymentMethod.type : null) && paymentIntent.requiresAction();
    }

    public static final Set<PaymentMethod.Type> getREFRESHABLE_PAYMENT_METHODS() {
        return REFRESHABLE_PAYMENT_METHODS;
    }
}
