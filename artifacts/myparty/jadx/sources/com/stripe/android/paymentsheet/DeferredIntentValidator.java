package com.stripe.android.paymentsheet;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.model.DeferredIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.PaymentSheet;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DeferredIntentValidator.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0002J3\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0019\u0010\u0016\u001a\u0015\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017¢\u0006\u0002\b\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentsheet/DeferredIntentValidator;", "", "<init>", "()V", "validate", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "intentConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "allowsManualConfirmation", "", "validatePaymentMethod", "", SDKConstants.PARAM_INTENT, "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "isSimilarPaymentMethod", "providedPaymentMethod", "attachedPaymentMethod", "isSameFingerprint", "firstPaymentMethod", "secondPaymentMethod", "fingerprintProvider", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "validatePaymentMethodOptionsSetupFutureUsage", "paramsPaymentMethodOptionsJsonString", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeferredIntentValidator {
    public static final int $stable = 0;
    public static final DeferredIntentValidator INSTANCE = new DeferredIntentValidator();

    /* compiled from: DeferredIntentValidator.kt */
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
                iArr[PaymentMethod.Type.USBankAccount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentMethod.Type.AuBecsDebit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentMethod.Type.BacsDebit.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaymentMethod.Type.SepaDebit.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private DeferredIntentValidator() {
    }

    public final StripeIntent validate(StripeIntent stripeIntent, PaymentSheet.IntentConfiguration intentConfiguration, boolean allowsManualConfirmation) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        Intrinsics.checkNotNullParameter(intentConfiguration, "intentConfiguration");
        DeferredIntentParams deferredIntentParams = IntentConfigurationKtxKt.toDeferredIntentParams(intentConfiguration);
        String lowerCase2 = null;
        if (stripeIntent instanceof PaymentIntent) {
            DeferredIntentParams.Mode mode = deferredIntentParams.getMode();
            DeferredIntentParams.Mode.Payment payment = mode instanceof DeferredIntentParams.Mode.Payment ? (DeferredIntentParams.Mode.Payment) mode : null;
            if (payment == null) {
                throw new IllegalArgumentException("You returned a PaymentIntent client secret but used a PaymentSheet.IntentConfiguration in setup mode.".toString());
            }
            String lowerCase3 = payment.getCurrency().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
            PaymentIntent paymentIntent = (PaymentIntent) stripeIntent;
            String currency = paymentIntent.getCurrency();
            if (currency != null) {
                lowerCase = currency.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (Intrinsics.areEqual(lowerCase3, lowerCase)) {
                if (DeferredIntentValidatorKt.isNull(payment.getSetupFutureUsage()) != DeferredIntentValidatorKt.isNull(paymentIntent.getSetupFutureUsage())) {
                    throw new IllegalArgumentException(("Your PaymentIntent setupFutureUsage (" + paymentIntent.getSetupFutureUsage() + ") does not match the PaymentSheet.IntentConfiguration setupFutureUsage (" + payment.getSetupFutureUsage() + ").").toString());
                }
                if (paymentIntent.getConfirmationMethod() == PaymentIntent.ConfirmationMethod.Manual && !allowsManualConfirmation) {
                    throw new IllegalArgumentException(("Your PaymentIntent confirmationMethod (" + paymentIntent.getConfirmationMethod() + ") can only be used with PaymentSheet.FlowController.").toString());
                }
                if (validatePaymentMethodOptionsSetupFutureUsage(payment.getPaymentMethodOptionsJsonString(), stripeIntent)) {
                    return stripeIntent;
                }
                throw new IllegalArgumentException(("Your PaymentIntent payment_method_options setup_future_usage values (" + paymentIntent.getPaymentMethodOptions() + " do not match the values provided in PaymentSheet.IntentConfiguration.Mode.Payment.PaymentMethodOptions (" + payment.getPaymentMethodOptionsJsonString() + ")").toString());
            }
            String currency2 = paymentIntent.getCurrency();
            if (currency2 != null) {
                lowerCase2 = currency2.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            }
            String lowerCase4 = payment.getCurrency().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
            throw new IllegalArgumentException(("Your PaymentIntent currency (" + lowerCase2 + ") does not match the PaymentSheet.IntentConfiguration currency (" + lowerCase4 + ").").toString());
        }
        if (!(stripeIntent instanceof SetupIntent)) {
            throw new NoWhenBranchMatchedException();
        }
        DeferredIntentParams.Mode mode2 = deferredIntentParams.getMode();
        DeferredIntentParams.Mode.Setup setup = mode2 instanceof DeferredIntentParams.Mode.Setup ? (DeferredIntentParams.Mode.Setup) mode2 : null;
        if (setup != null) {
            SetupIntent setupIntent = (SetupIntent) stripeIntent;
            if (DeferredIntentValidatorKt.isNull(setup.getSetupFutureUsage()) == DeferredIntentValidatorKt.isNull(setupIntent.getUsage())) {
                return stripeIntent;
            }
            throw new IllegalArgumentException(("Your SetupIntent usage (" + setupIntent.getUsage() + ") does not match the PaymentSheet.IntentConfiguration usage (" + setupIntent.getUsage() + ").").toString());
        }
        throw new IllegalArgumentException("You returned a SetupIntent client secret but used a PaymentSheet.IntentConfiguration in payment mode.".toString());
    }

    public final void validatePaymentMethod(StripeIntent intent, PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        String paymentMethodId = intent.getPaymentMethodId();
        if (paymentMethodId == null) {
            PaymentMethod paymentMethod2 = intent.getPaymentMethod();
            paymentMethodId = paymentMethod2 != null ? paymentMethod2.id : null;
        }
        if (paymentMethodId == null || Intrinsics.areEqual(paymentMethodId, paymentMethod.id) || isSimilarPaymentMethod(paymentMethod, intent.getPaymentMethod())) {
        } else {
            throw new IllegalArgumentException(("Your payment method (" + paymentMethodId + ") attached to the intent does not match the provided payment method (" + paymentMethod.id + ")!").toString());
        }
    }

    private final boolean isSimilarPaymentMethod(PaymentMethod providedPaymentMethod, PaymentMethod attachedPaymentMethod) {
        if (attachedPaymentMethod == null || providedPaymentMethod.type != attachedPaymentMethod.type) {
            return false;
        }
        PaymentMethod.Type type = providedPaymentMethod.type;
        int i = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return isSameFingerprint(providedPaymentMethod, attachedPaymentMethod, new Function1() { // from class: com.stripe.android.paymentsheet.DeferredIntentValidator$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DeferredIntentValidator.isSimilarPaymentMethod$lambda$8((PaymentMethod) obj);
                }
            });
        }
        if (i == 2) {
            return isSameFingerprint(providedPaymentMethod, attachedPaymentMethod, new Function1() { // from class: com.stripe.android.paymentsheet.DeferredIntentValidator$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DeferredIntentValidator.isSimilarPaymentMethod$lambda$9((PaymentMethod) obj);
                }
            });
        }
        if (i == 3) {
            return isSameFingerprint(providedPaymentMethod, attachedPaymentMethod, new Function1() { // from class: com.stripe.android.paymentsheet.DeferredIntentValidator$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DeferredIntentValidator.isSimilarPaymentMethod$lambda$10((PaymentMethod) obj);
                }
            });
        }
        if (i == 4) {
            return isSameFingerprint(providedPaymentMethod, attachedPaymentMethod, new Function1() { // from class: com.stripe.android.paymentsheet.DeferredIntentValidator$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DeferredIntentValidator.isSimilarPaymentMethod$lambda$11((PaymentMethod) obj);
                }
            });
        }
        if (i != 5) {
            return false;
        }
        return isSameFingerprint(providedPaymentMethod, attachedPaymentMethod, new Function1() { // from class: com.stripe.android.paymentsheet.DeferredIntentValidator$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeferredIntentValidator.isSimilarPaymentMethod$lambda$12((PaymentMethod) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isSimilarPaymentMethod$lambda$8(PaymentMethod isSameFingerprint) {
        Intrinsics.checkNotNullParameter(isSameFingerprint, "$this$isSameFingerprint");
        PaymentMethod.Card card = isSameFingerprint.card;
        if (card != null) {
            return card.fingerprint;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isSimilarPaymentMethod$lambda$9(PaymentMethod isSameFingerprint) {
        Intrinsics.checkNotNullParameter(isSameFingerprint, "$this$isSameFingerprint");
        PaymentMethod.USBankAccount uSBankAccount = isSameFingerprint.usBankAccount;
        if (uSBankAccount != null) {
            return uSBankAccount.fingerprint;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isSimilarPaymentMethod$lambda$10(PaymentMethod isSameFingerprint) {
        Intrinsics.checkNotNullParameter(isSameFingerprint, "$this$isSameFingerprint");
        PaymentMethod.AuBecsDebit auBecsDebit = isSameFingerprint.auBecsDebit;
        if (auBecsDebit != null) {
            return auBecsDebit.fingerprint;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isSimilarPaymentMethod$lambda$11(PaymentMethod isSameFingerprint) {
        Intrinsics.checkNotNullParameter(isSameFingerprint, "$this$isSameFingerprint");
        PaymentMethod.BacsDebit bacsDebit = isSameFingerprint.bacsDebit;
        if (bacsDebit != null) {
            return bacsDebit.fingerprint;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isSimilarPaymentMethod$lambda$12(PaymentMethod isSameFingerprint) {
        Intrinsics.checkNotNullParameter(isSameFingerprint, "$this$isSameFingerprint");
        PaymentMethod.SepaDebit sepaDebit = isSameFingerprint.sepaDebit;
        if (sepaDebit != null) {
            return sepaDebit.fingerprint;
        }
        return null;
    }

    private final boolean isSameFingerprint(PaymentMethod firstPaymentMethod, PaymentMethod secondPaymentMethod, Function1<? super PaymentMethod, String> fingerprintProvider) {
        String strInvoke = fingerprintProvider.invoke(firstPaymentMethod);
        String strInvoke2 = fingerprintProvider.invoke(secondPaymentMethod);
        if (strInvoke == null || strInvoke2 == null) {
            return false;
        }
        return Intrinsics.areEqual(strInvoke, strInvoke2);
    }

    private final boolean validatePaymentMethodOptionsSetupFutureUsage(String paramsPaymentMethodOptionsJsonString, StripeIntent stripeIntent) {
        Map mapEmptyMap;
        if (paramsPaymentMethodOptionsJsonString == null || (mapEmptyMap = StripeJsonUtils.INSTANCE.jsonObjectToMap(new JSONObject(paramsPaymentMethodOptionsJsonString))) == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        Set<Map.Entry> setEntrySet = mapEmptyMap.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : setEntrySet) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            Map map = value instanceof Map ? (Map) value : null;
            Object obj = map != null ? map.get("setup_future_usage") : null;
            String str2 = obj instanceof String ? (String) obj : null;
            Object obj2 = stripeIntent.getPaymentMethodOptions().get(str);
            Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
            if (!(stripeIntent.getPaymentMethodTypes().contains(str) ? Intrinsics.areEqual(map2 != null ? map2.get("setup_future_usage") : null, str2) : true)) {
                return false;
            }
        }
        return true;
    }
}
