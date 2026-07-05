package com.stripe.android.paymentsheet;

import com.stripe.android.model.DeferredIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.paymentmethodoptions.setupfutureusage.PaymentMethodOptionsSetupFutureUsageUtilKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntentConfigurationKtx.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0002\u001a\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"toDeferredIntentParams", "Lcom/stripe/android/model/DeferredIntentParams;", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "toDeferredIntentMode", "Lcom/stripe/android/model/DeferredIntentParams$Mode;", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;", "toIntentUsage", "Lcom/stripe/android/model/StripeIntent$Usage;", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;", "toIntentCaptureMethod", "Lcom/stripe/android/model/PaymentIntent$CaptureMethod;", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntentConfigurationKtxKt {

    /* compiled from: IntentConfigurationKtx.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PaymentSheet.IntentConfiguration.SetupFutureUse.values().length];
            try {
                iArr[PaymentSheet.IntentConfiguration.SetupFutureUse.OnSession.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentSheet.IntentConfiguration.SetupFutureUse.OffSession.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentSheet.IntentConfiguration.SetupFutureUse.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PaymentSheet.IntentConfiguration.CaptureMethod.values().length];
            try {
                iArr2[PaymentSheet.IntentConfiguration.CaptureMethod.Automatic.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PaymentSheet.IntentConfiguration.CaptureMethod.AutomaticAsync.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PaymentSheet.IntentConfiguration.CaptureMethod.Manual.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final DeferredIntentParams toDeferredIntentParams(PaymentSheet.IntentConfiguration intentConfiguration) {
        Intrinsics.checkNotNullParameter(intentConfiguration, "<this>");
        return new DeferredIntentParams(toDeferredIntentMode(intentConfiguration.getMode()), intentConfiguration.getPaymentMethodTypes(), intentConfiguration.getPaymentMethodConfigurationId(), intentConfiguration.getOnBehalfOf());
    }

    private static final DeferredIntentParams.Mode toDeferredIntentMode(PaymentSheet.IntentConfiguration.Mode mode) {
        if (mode instanceof PaymentSheet.IntentConfiguration.Mode.Payment) {
            PaymentSheet.IntentConfiguration.Mode.Payment payment = (PaymentSheet.IntentConfiguration.Mode.Payment) mode;
            long amount = payment.getAmount();
            String currency = payment.getCurrency();
            PaymentSheet.IntentConfiguration.SetupFutureUse setupFutureUse = payment.getSetupFutureUse();
            StripeIntent.Usage intentUsage = setupFutureUse != null ? toIntentUsage(setupFutureUse) : null;
            PaymentIntent.CaptureMethod intentCaptureMethod = toIntentCaptureMethod(payment.getCaptureMethod());
            PaymentSheet.IntentConfiguration.Mode.Payment.PaymentMethodOptions paymentMethodOptions = payment.getPaymentMethodOptions();
            return new DeferredIntentParams.Mode.Payment(amount, currency, intentUsage, intentCaptureMethod, paymentMethodOptions != null ? PaymentMethodOptionsSetupFutureUsageUtilKt.toJsonObjectString(paymentMethodOptions) : null);
        }
        if (!(mode instanceof PaymentSheet.IntentConfiguration.Mode.Setup)) {
            throw new NoWhenBranchMatchedException();
        }
        PaymentSheet.IntentConfiguration.Mode.Setup setup = (PaymentSheet.IntentConfiguration.Mode.Setup) mode;
        return new DeferredIntentParams.Mode.Setup(setup.getCurrency(), toIntentUsage(setup.getSetupFutureUse()));
    }

    private static final StripeIntent.Usage toIntentUsage(PaymentSheet.IntentConfiguration.SetupFutureUse setupFutureUse) {
        int i = WhenMappings.$EnumSwitchMapping$0[setupFutureUse.ordinal()];
        if (i == 1) {
            return StripeIntent.Usage.OnSession;
        }
        if (i == 2) {
            return StripeIntent.Usage.OffSession;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("PaymentSheet.IntentConfiguration setupFutureUse cannot be set to None");
    }

    private static final PaymentIntent.CaptureMethod toIntentCaptureMethod(PaymentSheet.IntentConfiguration.CaptureMethod captureMethod) {
        int i = WhenMappings.$EnumSwitchMapping$1[captureMethod.ordinal()];
        if (i == 1) {
            return PaymentIntent.CaptureMethod.Automatic;
        }
        if (i == 2) {
            return PaymentIntent.CaptureMethod.AutomaticAsync;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return PaymentIntent.CaptureMethod.Manual;
    }
}
