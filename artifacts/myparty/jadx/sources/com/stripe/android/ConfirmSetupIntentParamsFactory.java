package com.stripe.android;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodExtraParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.SetupIntent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfirmStripeIntentParamsFactory.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J$\u0010\t\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/ConfirmSetupIntentParamsFactory;", "Lcom/stripe/android/ConfirmStripeIntentParamsFactory;", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "clientSecret", "", SDKConstants.PARAM_INTENT, "Lcom/stripe/android/model/SetupIntent;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/SetupIntent;)V", "create", "paymentMethodId", "paymentMethodType", "Lcom/stripe/android/model/PaymentMethod$Type;", "optionsParams", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "extraParams", "Lcom/stripe/android/model/PaymentMethodExtraParams;", "createParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConfirmSetupIntentParamsFactory extends ConfirmStripeIntentParamsFactory<ConfirmSetupIntentParams> {
    public static final int $stable = 8;
    private final String clientSecret;
    private final SetupIntent intent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmSetupIntentParamsFactory(String clientSecret, SetupIntent intent) {
        super(null);
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.clientSecret = clientSecret;
        this.intent = intent;
    }

    @Override // com.stripe.android.ConfirmStripeIntentParamsFactory
    public ConfirmSetupIntentParams create(String paymentMethodId, PaymentMethod.Type paymentMethodType, PaymentMethodOptionsParams optionsParams, PaymentMethodExtraParams extraParams) {
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
        return ConfirmSetupIntentParams.Companion.createWithSetAsDefaultPaymentMethod$payments_core_release$default(ConfirmSetupIntentParams.INSTANCE, paymentMethodId, this.clientSecret, ConfirmStripeIntentParamsFactoryKt.mandateData(this.intent, paymentMethodType), null, extraParams != null ? ConfirmStripeIntentParamsFactoryKt.extractSetAsDefaultPaymentMethodFromExtraParams(extraParams) : null, paymentMethodType.code, 8, null);
    }

    @Override // com.stripe.android.ConfirmStripeIntentParamsFactory
    public ConfirmSetupIntentParams create(PaymentMethodCreateParams createParams, PaymentMethodOptionsParams optionsParams, PaymentMethodExtraParams extraParams) {
        Intrinsics.checkNotNullParameter(createParams, "createParams");
        return ConfirmSetupIntentParams.Companion.createWithSetAsDefaultPaymentMethod$payments_core_release$default(ConfirmSetupIntentParams.INSTANCE, createParams, this.clientSecret, null, null, extraParams != null ? ConfirmStripeIntentParamsFactoryKt.extractSetAsDefaultPaymentMethodFromExtraParams(extraParams) : null, 12, null);
    }
}
