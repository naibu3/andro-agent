package com.stripe.android;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodExtraParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfirmStripeIntentParamsFactory.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ,\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J$\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/ConfirmPaymentIntentParamsFactory;", "Lcom/stripe/android/ConfirmStripeIntentParamsFactory;", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "clientSecret", "", SDKConstants.PARAM_INTENT, "Lcom/stripe/android/model/PaymentIntent;", "shipping", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)V", "create", "paymentMethodId", "paymentMethodType", "Lcom/stripe/android/model/PaymentMethod$Type;", "optionsParams", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "extraParams", "Lcom/stripe/android/model/PaymentMethodExtraParams;", "createParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConfirmPaymentIntentParamsFactory extends ConfirmStripeIntentParamsFactory<ConfirmPaymentIntentParams> {
    public static final int $stable = 8;
    private final String clientSecret;
    private final PaymentIntent intent;
    private final ConfirmPaymentIntentParams.Shipping shipping;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmPaymentIntentParamsFactory(String clientSecret, PaymentIntent intent, ConfirmPaymentIntentParams.Shipping shipping) {
        super(null);
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.clientSecret = clientSecret;
        this.intent = intent;
        this.shipping = shipping;
    }

    @Override // com.stripe.android.ConfirmStripeIntentParamsFactory
    public ConfirmPaymentIntentParams create(String paymentMethodId, PaymentMethod.Type paymentMethodType, PaymentMethodOptionsParams optionsParams, PaymentMethodExtraParams extraParams) {
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
        return ConfirmPaymentIntentParams.Companion.createWithSetAsDefaultPaymentMethod$payments_core_release$default(ConfirmPaymentIntentParams.INSTANCE, paymentMethodId, this.clientSecret, null, null, ConfirmStripeIntentParamsFactoryKt.mandateData(this.intent, paymentMethodType), null, this.shipping, optionsParams, extraParams != null ? ConfirmStripeIntentParamsFactoryKt.extractSetAsDefaultPaymentMethodFromExtraParams(extraParams) : null, paymentMethodType.code, 44, null);
    }

    @Override // com.stripe.android.ConfirmStripeIntentParamsFactory
    public ConfirmPaymentIntentParams create(PaymentMethodCreateParams createParams, PaymentMethodOptionsParams optionsParams, PaymentMethodExtraParams extraParams) {
        Intrinsics.checkNotNullParameter(createParams, "createParams");
        return ConfirmPaymentIntentParams.Companion.createWithSetAsDefaultPaymentMethod$payments_core_release$default(ConfirmPaymentIntentParams.INSTANCE, createParams, this.clientSecret, null, null, null, null, this.shipping, optionsParams, extraParams != null ? ConfirmStripeIntentParamsFactoryKt.extractSetAsDefaultPaymentMethodFromExtraParams(extraParams) : null, 60, null);
    }
}
