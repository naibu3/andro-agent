package com.reactnativestripesdk;

import androidx.browser.customtabs.CustomTabsCallback;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.internal.NativeProtocol;
import com.facebook.react.bridge.ReadableMap;
import com.reactnativestripesdk.utils.MappersKt;
import com.stripe.android.model.Address;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PaymentMethodCreateParamsFactory.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0002J\b\u0010\u001c\u001a\u00020\u0011H\u0002J\b\u0010\u001d\u001a\u00020\u0011H\u0002J\b\u0010\u001e\u001a\u00020\u0011H\u0002J\b\u0010\u001f\u001a\u00020\u0011H\u0002J\b\u0010 \u001a\u00020\u0011H\u0002J\b\u0010!\u001a\u00020\u0011H\u0002J\b\u0010\"\u001a\u00020\u0011H\u0002J\b\u0010#\u001a\u00020\u0011H\u0002J\b\u0010$\u001a\u00020\u0011H\u0002J \u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u00020\u0011H\u0002J\u0018\u0010+\u001a\u00020&2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020)H\u0002J\u0018\u0010,\u001a\u00020&2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020)H\u0002J\u0018\u0010-\u001a\u00020&2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020)H\u0002J\u0012\u0010.\u001a\u00020\u00112\b\u0010/\u001a\u0004\u0018\u00010\u0003H\u0002J\n\u00100\u001a\u0004\u0018\u000101H\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/reactnativestripesdk/PaymentMethodCreateParamsFactory;", "", "paymentMethodData", "Lcom/facebook/react/bridge/ReadableMap;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "cardFieldView", "Lcom/reactnativestripesdk/CardFieldView;", "cardFormView", "Lcom/reactnativestripesdk/CardFormView;", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/reactnativestripesdk/CardFieldView;Lcom/reactnativestripesdk/CardFormView;)V", "billingDetailsParams", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "metadataParams", "", "", "createPaymentMethodParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodType", "Lcom/stripe/android/model/PaymentMethod$Type;", "createIDEALParams", "createAlipayParams", "createBancontactParams", "createSepaParams", "createOXXOParams", "createGiropayParams", "createEPSParams", "createGrabPayParams", "createP24Params", "createFpxParams", "createAfterpayClearpayParams", "createAuBecsDebitParams", "createKlarnaParams", "createPayPalParams", "createAffirmParams", "createCashAppParams", "createRevolutPayParams", "createParams", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "clientSecret", NamedConstantsKt.IS_PAYMENT_INTENT, "", "createCardPaymentMethodParams", "createCardStripeIntentParams", "createUSBankAccountStripeIntentParams", "createAffirmStripeIntentParams", "createUSBankAccountParams", NativeProtocol.WEB_DIALOG_PARAMS, "buildMandateDataParams", "Lcom/stripe/android/model/MandateDataParams;", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentMethodCreateParamsFactory {
    public static final int $stable = 8;
    private final PaymentMethod.BillingDetails billingDetailsParams;
    private final CardFieldView cardFieldView;
    private final CardFormView cardFormView;
    private final Map<String, String> metadataParams;
    private final ReadableMap options;
    private final ReadableMap paymentMethodData;

    /* compiled from: PaymentMethodCreateParamsFactory.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentMethod.Type.values().length];
            try {
                iArr[PaymentMethod.Type.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.Type.Ideal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentMethod.Type.Alipay.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentMethod.Type.Bancontact.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaymentMethod.Type.SepaDebit.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PaymentMethod.Type.Oxxo.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PaymentMethod.Type.Giropay.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PaymentMethod.Type.Eps.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PaymentMethod.Type.GrabPay.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PaymentMethod.Type.P24.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PaymentMethod.Type.Fpx.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PaymentMethod.Type.AfterpayClearpay.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PaymentMethod.Type.AuBecsDebit.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PaymentMethod.Type.Klarna.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[PaymentMethod.Type.USBankAccount.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[PaymentMethod.Type.PayPal.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[PaymentMethod.Type.Affirm.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[PaymentMethod.Type.CashAppPay.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[PaymentMethod.Type.RevolutPay.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PaymentMethodCreateParamsFactory(ReadableMap readableMap, ReadableMap readableMap2, CardFieldView cardFieldView, CardFormView cardFormView) {
        Address cardAddress;
        this.paymentMethodData = readableMap;
        this.options = readableMap2;
        this.cardFieldView = cardFieldView;
        this.cardFormView = cardFormView;
        this.billingDetailsParams = MappersKt.mapToBillingDetails(MappersKt.getMapOrNull(readableMap, "billingDetails"), (cardFieldView == null || (cardAddress = cardFieldView.getCardAddress()) == null) ? cardFormView != null ? cardFormView.getCardAddress() : null : cardAddress);
        this.metadataParams = MappersKt.mapToMetadata(MappersKt.getMapOrNull(readableMap, "metadata"));
    }

    public final PaymentMethodCreateParams createPaymentMethodParams(PaymentMethod.Type paymentMethodType) throws PaymentMethodCreateParamsException {
        Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
        switch (WhenMappings.$EnumSwitchMapping$0[paymentMethodType.ordinal()]) {
            case 1:
                return createCardPaymentMethodParams();
            case 2:
                return createIDEALParams();
            case 3:
                return createAlipayParams();
            case 4:
                return createBancontactParams();
            case 5:
                return createSepaParams();
            case 6:
                return createOXXOParams();
            case 7:
                return createGiropayParams();
            case 8:
                return createEPSParams();
            case 9:
                return createGrabPayParams();
            case 10:
                return createP24Params();
            case 11:
                return createFpxParams();
            case 12:
                return createAfterpayClearpayParams();
            case 13:
                return createAuBecsDebitParams();
            case 14:
                return createKlarnaParams();
            case 15:
                return createUSBankAccountParams(this.paymentMethodData);
            case 16:
                return createPayPalParams();
            case 17:
                return createAffirmParams();
            case 18:
                return createCashAppParams();
            case 19:
                return createRevolutPayParams();
            default:
                throw new Exception("This paymentMethodType is not supported yet");
        }
    }

    private final PaymentMethodCreateParams createIDEALParams() throws PaymentMethodCreateParamsException {
        return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.INSTANCE, new PaymentMethodCreateParams.Ideal(MappersKt.getValOr(this.paymentMethodData, "bankName", null)), this.billingDetailsParams, this.metadataParams, (PaymentMethod.AllowRedisplay) null, 8, (Object) null);
    }

    private final PaymentMethodCreateParams createAlipayParams() throws PaymentMethodCreateParamsException {
        return PaymentMethodCreateParams.Companion.createAlipay$default(PaymentMethodCreateParams.INSTANCE, null, null, 3, null);
    }

    private final PaymentMethodCreateParams createBancontactParams() throws PaymentMethodCreateParamsException {
        PaymentMethod.BillingDetails billingDetails = this.billingDetailsParams;
        if (billingDetails != null) {
            return PaymentMethodCreateParams.Companion.createBancontact$default(PaymentMethodCreateParams.INSTANCE, billingDetails, this.metadataParams, null, 4, null);
        }
        throw new PaymentMethodCreateParamsException("You must provide billing details");
    }

    private final PaymentMethodCreateParams createSepaParams() throws PaymentMethodCreateParamsException {
        PaymentMethod.BillingDetails billingDetails = this.billingDetailsParams;
        if (billingDetails != null) {
            String valOr = MappersKt.getValOr(this.paymentMethodData, "iban", null);
            if (valOr != null) {
                return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.INSTANCE, new PaymentMethodCreateParams.SepaDebit(valOr), billingDetails, this.metadataParams, (PaymentMethod.AllowRedisplay) null, 8, (Object) null);
            }
            throw new PaymentMethodCreateParamsException("You must provide IBAN");
        }
        throw new PaymentMethodCreateParamsException("You must provide billing details");
    }

    private final PaymentMethodCreateParams createOXXOParams() throws PaymentMethodCreateParamsException {
        PaymentMethod.BillingDetails billingDetails = this.billingDetailsParams;
        if (billingDetails != null) {
            return PaymentMethodCreateParams.Companion.createOxxo$default(PaymentMethodCreateParams.INSTANCE, billingDetails, this.metadataParams, null, 4, null);
        }
        throw new PaymentMethodCreateParamsException("You must provide billing details");
    }

    private final PaymentMethodCreateParams createGiropayParams() throws PaymentMethodCreateParamsException {
        PaymentMethod.BillingDetails billingDetails = this.billingDetailsParams;
        if (billingDetails != null) {
            return PaymentMethodCreateParams.Companion.createGiropay$default(PaymentMethodCreateParams.INSTANCE, billingDetails, this.metadataParams, null, 4, null);
        }
        throw new PaymentMethodCreateParamsException("You must provide billing details");
    }

    private final PaymentMethodCreateParams createEPSParams() throws PaymentMethodCreateParamsException {
        PaymentMethod.BillingDetails billingDetails = this.billingDetailsParams;
        if (billingDetails != null) {
            return PaymentMethodCreateParams.Companion.createEps$default(PaymentMethodCreateParams.INSTANCE, billingDetails, this.metadataParams, null, 4, null);
        }
        throw new PaymentMethodCreateParamsException("You must provide billing details");
    }

    private final PaymentMethodCreateParams createGrabPayParams() throws PaymentMethodCreateParamsException {
        PaymentMethod.BillingDetails billingDetails = this.billingDetailsParams;
        return PaymentMethodCreateParams.Companion.createGrabPay$default(PaymentMethodCreateParams.INSTANCE, billingDetails == null ? new PaymentMethod.BillingDetails(null, null, null, null, 15, null) : billingDetails, null, null, 6, null);
    }

    private final PaymentMethodCreateParams createP24Params() throws PaymentMethodCreateParamsException {
        PaymentMethod.BillingDetails billingDetails = this.billingDetailsParams;
        if (billingDetails != null) {
            return PaymentMethodCreateParams.Companion.createP24$default(PaymentMethodCreateParams.INSTANCE, billingDetails, this.metadataParams, null, 4, null);
        }
        throw new PaymentMethodCreateParamsException("You must provide billing details");
    }

    private final PaymentMethodCreateParams createFpxParams() throws PaymentMethodCreateParamsException {
        MappersKt.getBooleanOrFalse(this.paymentMethodData, "testOfflineBank");
        return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.INSTANCE, new PaymentMethodCreateParams.Fpx("test_offline_bank"), (PaymentMethod.BillingDetails) null, this.metadataParams, (PaymentMethod.AllowRedisplay) null, 10, (Object) null);
    }

    private final PaymentMethodCreateParams createAfterpayClearpayParams() throws PaymentMethodCreateParamsException {
        PaymentMethod.BillingDetails billingDetails = this.billingDetailsParams;
        if (billingDetails != null) {
            return PaymentMethodCreateParams.Companion.createAfterpayClearpay$default(PaymentMethodCreateParams.INSTANCE, billingDetails, this.metadataParams, null, 4, null);
        }
        throw new PaymentMethodCreateParamsException("You must provide billing details");
    }

    private final PaymentMethodCreateParams createAuBecsDebitParams() throws PaymentMethodCreateParamsException {
        ReadableMap mapOrNull = MappersKt.getMapOrNull(this.paymentMethodData, "formDetails");
        if (mapOrNull == null) {
            throw new PaymentMethodCreateParamsException("You must provide form details");
        }
        String valOr$default = MappersKt.getValOr$default(mapOrNull, "bsbNumber", null, 4, null);
        Intrinsics.checkNotNull(valOr$default, "null cannot be cast to non-null type kotlin.String");
        String valOr$default2 = MappersKt.getValOr$default(mapOrNull, "accountNumber", null, 4, null);
        Intrinsics.checkNotNull(valOr$default2, "null cannot be cast to non-null type kotlin.String");
        String valOr$default3 = MappersKt.getValOr$default(mapOrNull, "name", null, 4, null);
        Intrinsics.checkNotNull(valOr$default3, "null cannot be cast to non-null type kotlin.String");
        String valOr$default4 = MappersKt.getValOr$default(mapOrNull, "email", null, 4, null);
        Intrinsics.checkNotNull(valOr$default4, "null cannot be cast to non-null type kotlin.String");
        return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.INSTANCE, new PaymentMethodCreateParams.AuBecsDebit(valOr$default, valOr$default2), new PaymentMethod.BillingDetails.Builder().setName(valOr$default3).setEmail(valOr$default4).build(), this.metadataParams, (PaymentMethod.AllowRedisplay) null, 8, (Object) null);
    }

    private final PaymentMethodCreateParams createKlarnaParams() throws PaymentMethodCreateParamsException {
        String str;
        PaymentMethod.BillingDetails billingDetails = this.billingDetailsParams;
        if (billingDetails != null) {
            Address address = billingDetails.address;
            String country = address != null ? address.getCountry() : null;
            if (country != null && !StringsKt.isBlank(country) && (str = this.billingDetailsParams.email) != null && !StringsKt.isBlank(str)) {
                return PaymentMethodCreateParams.Companion.createKlarna$default(PaymentMethodCreateParams.INSTANCE, this.billingDetailsParams, this.metadataParams, null, 4, null);
            }
        }
        throw new PaymentMethodCreateParamsException("Klarna requires that you provide the following billing details: email, country");
    }

    private final PaymentMethodCreateParams createPayPalParams() throws PaymentMethodCreateParamsException {
        return PaymentMethodCreateParams.Companion.createPayPal$default(PaymentMethodCreateParams.INSTANCE, this.metadataParams, null, 2, null);
    }

    private final PaymentMethodCreateParams createAffirmParams() throws PaymentMethodCreateParamsException {
        return PaymentMethodCreateParams.Companion.createAffirm$default(PaymentMethodCreateParams.INSTANCE, this.billingDetailsParams, this.metadataParams, null, 4, null);
    }

    private final PaymentMethodCreateParams createCashAppParams() throws PaymentMethodCreateParamsException {
        return PaymentMethodCreateParams.Companion.createCashAppPay$default(PaymentMethodCreateParams.INSTANCE, this.billingDetailsParams, this.metadataParams, null, 4, null);
    }

    private final PaymentMethodCreateParams createRevolutPayParams() throws PaymentMethodCreateParamsException {
        return PaymentMethodCreateParams.Companion.createRevolutPay$default(PaymentMethodCreateParams.INSTANCE, this.billingDetailsParams, this.metadataParams, null, 4, null);
    }

    public final ConfirmStripeIntentParams createParams(String clientSecret, PaymentMethod.Type paymentMethodType, boolean isPaymentIntent) throws PaymentMethodCreateParamsException {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        switch (paymentMethodType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[paymentMethodType.ordinal()]) {
            case -1:
                return ConfirmPaymentIntentParams.Companion.create$default(ConfirmPaymentIntentParams.INSTANCE, clientSecret, null, null, 6, null);
            case 0:
            default:
                throw new Exception("This paymentMethodType is not supported yet");
            case 1:
                return createCardStripeIntentParams(clientSecret, isPaymentIntent);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 16:
            case 18:
            case 19:
                PaymentMethodCreateParams paymentMethodCreateParamsCreatePaymentMethodParams = createPaymentMethodParams(paymentMethodType);
                if (isPaymentIntent) {
                    return ConfirmPaymentIntentParams.Companion.createWithPaymentMethodCreateParams$default(ConfirmPaymentIntentParams.INSTANCE, paymentMethodCreateParamsCreatePaymentMethodParams, clientSecret, null, null, buildMandateDataParams(), MappersKt.mapToPaymentIntentFutureUsage(MappersKt.getValOr$default(this.options, "setupFutureUsage", null, 4, null)), null, null, 204, null);
                }
                return ConfirmSetupIntentParams.Companion.create$default(ConfirmSetupIntentParams.INSTANCE, paymentMethodCreateParamsCreatePaymentMethodParams, clientSecret, buildMandateDataParams(), (String) null, 8, (Object) null);
            case 15:
                return createUSBankAccountStripeIntentParams(clientSecret, isPaymentIntent);
            case 17:
                return createAffirmStripeIntentParams(clientSecret, isPaymentIntent);
        }
    }

    private final PaymentMethodCreateParams createCardPaymentMethodParams() throws PaymentMethodCreateParamsException {
        PaymentMethodCreateParams.Card cardParams;
        PaymentMethodCreateParams.Card cardParams2 = null;
        String valOr = MappersKt.getValOr(this.paymentMethodData, "token", null);
        CardFieldView cardFieldView = this.cardFieldView;
        if (cardFieldView == null || (cardParams = cardFieldView.getCardParams()) == null) {
            CardFormView cardFormView = this.cardFormView;
            if (cardFormView != null) {
                cardParams2 = cardFormView.getCardParams();
            }
        } else {
            cardParams2 = cardParams;
        }
        if (valOr != null) {
            cardParams2 = PaymentMethodCreateParams.Card.INSTANCE.create(valOr);
        }
        PaymentMethodCreateParams.Card card = cardParams2;
        if (card == null) {
            throw new PaymentMethodCreateParamsException("Card details not complete");
        }
        return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.INSTANCE, card, this.billingDetailsParams, (Map) null, (PaymentMethod.AllowRedisplay) null, 12, (Object) null);
    }

    private final ConfirmStripeIntentParams createCardStripeIntentParams(String clientSecret, boolean isPaymentIntent) throws PaymentMethodCreateParamsException {
        String valOr = MappersKt.getValOr(this.paymentMethodData, "paymentMethodId", null);
        ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsageMapToPaymentIntentFutureUsage = MappersKt.mapToPaymentIntentFutureUsage(MappersKt.getValOr$default(this.options, "setupFutureUsage", null, 4, null));
        if (valOr != null) {
            String valOr2 = MappersKt.getValOr(this.paymentMethodData, "cvc", null);
            PaymentMethodOptionsParams.Card card = valOr2 != null ? new PaymentMethodOptionsParams.Card(valOr2, null, null, 6, null) : null;
            if (isPaymentIntent) {
                return ConfirmPaymentIntentParams.Companion.createWithPaymentMethodId$default(ConfirmPaymentIntentParams.INSTANCE, valOr, clientSecret, null, card, null, null, setupFutureUsageMapToPaymentIntentFutureUsage, null, RotationOptions.ROTATE_180, null);
            }
            return ConfirmSetupIntentParams.Companion.create$default(ConfirmSetupIntentParams.INSTANCE, valOr, clientSecret, (MandateDataParams) null, (String) null, 12, (Object) null);
        }
        PaymentMethodCreateParams paymentMethodCreateParamsCreateCardPaymentMethodParams = createCardPaymentMethodParams();
        if (isPaymentIntent) {
            return ConfirmPaymentIntentParams.Companion.createWithPaymentMethodCreateParams$default(ConfirmPaymentIntentParams.INSTANCE, paymentMethodCreateParamsCreateCardPaymentMethodParams, clientSecret, null, null, null, setupFutureUsageMapToPaymentIntentFutureUsage, null, null, 220, null);
        }
        return ConfirmSetupIntentParams.Companion.create$default(ConfirmSetupIntentParams.INSTANCE, paymentMethodCreateParamsCreateCardPaymentMethodParams, clientSecret, (MandateDataParams) null, (String) null, 12, (Object) null);
    }

    private final ConfirmStripeIntentParams createUSBankAccountStripeIntentParams(String clientSecret, boolean isPaymentIntent) throws PaymentMethodCreateParamsException {
        if (this.paymentMethodData == null) {
            if (isPaymentIntent) {
                return ConfirmPaymentIntentParams.INSTANCE.create(clientSecret, PaymentMethod.Type.USBankAccount);
            }
            return ConfirmSetupIntentParams.INSTANCE.create(clientSecret, PaymentMethod.Type.USBankAccount);
        }
        PaymentMethod.BillingDetails billingDetails = this.billingDetailsParams;
        String str = billingDetails != null ? billingDetails.name : null;
        if (str == null || StringsKt.isBlank(str)) {
            throw new PaymentMethodCreateParamsException("When creating a US bank account payment method, you must provide the following billing details: name");
        }
        if (isPaymentIntent) {
            return ConfirmPaymentIntentParams.Companion.createWithPaymentMethodCreateParams$default(ConfirmPaymentIntentParams.INSTANCE, createUSBankAccountParams(this.paymentMethodData), clientSecret, null, null, null, MappersKt.mapToPaymentIntentFutureUsage(MappersKt.getValOr$default(this.options, "setupFutureUsage", null, 4, null)), null, null, 220, null);
        }
        return ConfirmSetupIntentParams.Companion.create$default(ConfirmSetupIntentParams.INSTANCE, createUSBankAccountParams(this.paymentMethodData), clientSecret, (MandateDataParams) null, (String) null, 12, (Object) null);
    }

    private final ConfirmStripeIntentParams createAffirmStripeIntentParams(String clientSecret, boolean isPaymentIntent) throws PaymentMethodCreateParamsException {
        if (!isPaymentIntent) {
            throw new PaymentMethodCreateParamsException("Affirm is not yet supported through SetupIntents.");
        }
        PaymentMethodCreateParams paymentMethodCreateParamsCreateAffirmParams = createAffirmParams();
        return ConfirmPaymentIntentParams.Companion.createWithPaymentMethodCreateParams$default(ConfirmPaymentIntentParams.INSTANCE, paymentMethodCreateParamsCreateAffirmParams, clientSecret, null, null, buildMandateDataParams(), MappersKt.mapToPaymentIntentFutureUsage(MappersKt.getValOr$default(this.options, "setupFutureUsage", null, 4, null)), null, null, 204, null);
    }

    private final PaymentMethodCreateParams createUSBankAccountParams(ReadableMap params) throws PaymentMethodCreateParamsException {
        String valOr = MappersKt.getValOr(params, "accountNumber", null);
        String valOr2 = MappersKt.getValOr(params, "routingNumber", null);
        String str = valOr;
        if (str == null || StringsKt.isBlank(str)) {
            throw new PaymentMethodCreateParamsException("When creating a US bank account payment method, you must provide the bank account number");
        }
        String str2 = valOr2;
        if (str2 == null || StringsKt.isBlank(str2)) {
            throw new PaymentMethodCreateParamsException("When creating a US bank account payment method, you must provide the bank routing number");
        }
        return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.INSTANCE, new PaymentMethodCreateParams.USBankAccount(valOr, valOr2, MappersKt.mapToUSBankAccountType(MappersKt.getValOr(params, "accountType", null)), MappersKt.mapToUSBankAccountHolderType(MappersKt.getValOr(params, "accountHolderType", null))), this.billingDetailsParams, this.metadataParams, (PaymentMethod.AllowRedisplay) null, 8, (Object) null);
    }

    private final MandateDataParams buildMandateDataParams() {
        ReadableMap mapOrNull;
        ReadableMap mapOrNull2;
        ReadableMap mapOrNull3 = MappersKt.getMapOrNull(this.paymentMethodData, "mandateData");
        if (mapOrNull3 == null || (mapOrNull = MappersKt.getMapOrNull(mapOrNull3, "customerAcceptance")) == null || (mapOrNull2 = MappersKt.getMapOrNull(mapOrNull, CustomTabsCallback.ONLINE_EXTRAS_KEY)) == null) {
            return null;
        }
        String valOr = MappersKt.getValOr(mapOrNull2, "ipAddress", "");
        if (valOr == null) {
            valOr = "";
        }
        String valOr2 = MappersKt.getValOr(mapOrNull2, "userAgent", "");
        return new MandateDataParams(new MandateDataParams.Type.Online(valOr, valOr2 != null ? valOr2 : ""));
    }
}
