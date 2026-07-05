package com.stripe.android.paymentsheet;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandler;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingNextActionHandler;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* compiled from: PaymentSheetNextActionHandlers.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0005¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetNextActionHandlers;", "", "<init>", "()V", "get", "", "Ljava/lang/Class;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;", "Lcom/stripe/android/model/StripeIntent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentSheetNextActionHandlers {
    public static final int $stable = 0;
    public static final PaymentSheetNextActionHandlers INSTANCE = new PaymentSheetNextActionHandlers();

    private PaymentSheetNextActionHandlers() {
    }

    public final Map<Class<? extends StripeIntent.NextActionData>, PaymentNextActionHandler<StripeIntent>> get() {
        return MapsKt.mapOf(TuplesKt.to(StripeIntent.NextActionData.UpiAwaitNotification.class, new PollingNextActionHandler()), TuplesKt.to(StripeIntent.NextActionData.BlikAuthorize.class, new PollingNextActionHandler()));
    }
}
