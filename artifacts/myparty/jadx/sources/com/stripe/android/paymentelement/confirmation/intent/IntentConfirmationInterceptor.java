package com.stripe.android.paymentelement.confirmation.intent;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodExtraParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.CreateIntentCallback;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntentConfirmationInterceptor.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H¦@¢\u0006\u0002\u0010\u0012JF\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH¦@¢\u0006\u0002\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;", "", "intercept", "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;", "initializationMode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", SDKConstants.PARAM_INTENT, "Lcom/stripe/android/model/StripeIntent;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodOptionsParams", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "paymentMethodExtraParams", "Lcom/stripe/android/model/PaymentMethodExtraParams;", NamedConstantsKt.SHIPPING_VALUES, "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "customerRequestedSave", "", "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "NextStep", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface IntentConfirmationInterceptor {
    public static final String COMPLETE_WITHOUT_CONFIRMING_INTENT = "COMPLETE_WITHOUT_CONFIRMING_INTENT";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Object intercept(PaymentElementLoader.InitializationMode initializationMode, StripeIntent stripeIntent, PaymentMethod paymentMethod, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, ConfirmPaymentIntentParams.Shipping shipping, Continuation<? super NextStep> continuation);

    Object intercept(PaymentElementLoader.InitializationMode initializationMode, StripeIntent stripeIntent, PaymentMethodCreateParams paymentMethodCreateParams, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, ConfirmPaymentIntentParams.Shipping shipping, boolean z, Continuation<? super NextStep> continuation);

    /* compiled from: IntentConfirmationInterceptor.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;", "", "deferredIntentConfirmationType", "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "getDeferredIntentConfirmationType", "()Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "Fail", "Confirm", "HandleNextAction", "Complete", "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Complete;", "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Confirm;", "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;", "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$HandleNextAction;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface NextStep {
        DeferredIntentConfirmationType getDeferredIntentConfirmationType();

        /* compiled from: IntentConfirmationInterceptor.kt */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;", "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;", "cause", "", "message", "Lcom/stripe/android/core/strings/ResolvableString;", "<init>", "(Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;)V", "getCause", "()Ljava/lang/Throwable;", "getMessage", "()Lcom/stripe/android/core/strings/ResolvableString;", "deferredIntentConfirmationType", "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "getDeferredIntentConfirmationType", "()Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Fail implements NextStep {
            public static final int $stable = 8;
            private final Throwable cause;
            private final ResolvableString message;

            public static /* synthetic */ Fail copy$default(Fail fail, Throwable th, ResolvableString resolvableString, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = fail.cause;
                }
                if ((i & 2) != 0) {
                    resolvableString = fail.message;
                }
                return fail.copy(th, resolvableString);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getCause() {
                return this.cause;
            }

            /* renamed from: component2, reason: from getter */
            public final ResolvableString getMessage() {
                return this.message;
            }

            public final Fail copy(Throwable cause, ResolvableString message) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                Intrinsics.checkNotNullParameter(message, "message");
                return new Fail(cause, message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Fail)) {
                    return false;
                }
                Fail fail = (Fail) other;
                return Intrinsics.areEqual(this.cause, fail.cause) && Intrinsics.areEqual(this.message, fail.message);
            }

            @Override // com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationInterceptor.NextStep
            public DeferredIntentConfirmationType getDeferredIntentConfirmationType() {
                return null;
            }

            public int hashCode() {
                return (this.cause.hashCode() * 31) + this.message.hashCode();
            }

            public String toString() {
                return "Fail(cause=" + this.cause + ", message=" + this.message + ")";
            }

            public Fail(Throwable cause, ResolvableString message) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                Intrinsics.checkNotNullParameter(message, "message");
                this.cause = cause;
                this.message = message;
            }

            public final Throwable getCause() {
                return this.cause;
            }

            public final ResolvableString getMessage() {
                return this.message;
            }
        }

        /* compiled from: IntentConfirmationInterceptor.kt */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Confirm;", "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;", "confirmParams", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "isDeferred", "", "<init>", "(Lcom/stripe/android/model/ConfirmStripeIntentParams;Z)V", "getConfirmParams", "()Lcom/stripe/android/model/ConfirmStripeIntentParams;", "()Z", "deferredIntentConfirmationType", "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "getDeferredIntentConfirmationType", "()Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Confirm implements NextStep {
            public static final int $stable = 8;
            private final ConfirmStripeIntentParams confirmParams;
            private final boolean isDeferred;

            public static /* synthetic */ Confirm copy$default(Confirm confirm, ConfirmStripeIntentParams confirmStripeIntentParams, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    confirmStripeIntentParams = confirm.confirmParams;
                }
                if ((i & 2) != 0) {
                    z = confirm.isDeferred;
                }
                return confirm.copy(confirmStripeIntentParams, z);
            }

            /* renamed from: component1, reason: from getter */
            public final ConfirmStripeIntentParams getConfirmParams() {
                return this.confirmParams;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsDeferred() {
                return this.isDeferred;
            }

            public final Confirm copy(ConfirmStripeIntentParams confirmParams, boolean isDeferred) {
                Intrinsics.checkNotNullParameter(confirmParams, "confirmParams");
                return new Confirm(confirmParams, isDeferred);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Confirm)) {
                    return false;
                }
                Confirm confirm = (Confirm) other;
                return Intrinsics.areEqual(this.confirmParams, confirm.confirmParams) && this.isDeferred == confirm.isDeferred;
            }

            public int hashCode() {
                return (this.confirmParams.hashCode() * 31) + Boolean.hashCode(this.isDeferred);
            }

            public String toString() {
                return "Confirm(confirmParams=" + this.confirmParams + ", isDeferred=" + this.isDeferred + ")";
            }

            public Confirm(ConfirmStripeIntentParams confirmParams, boolean z) {
                Intrinsics.checkNotNullParameter(confirmParams, "confirmParams");
                this.confirmParams = confirmParams;
                this.isDeferred = z;
            }

            public final ConfirmStripeIntentParams getConfirmParams() {
                return this.confirmParams;
            }

            public final boolean isDeferred() {
                return this.isDeferred;
            }

            @Override // com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationInterceptor.NextStep
            public DeferredIntentConfirmationType getDeferredIntentConfirmationType() {
                DeferredIntentConfirmationType deferredIntentConfirmationType = DeferredIntentConfirmationType.Client;
                if (this.isDeferred) {
                    return deferredIntentConfirmationType;
                }
                return null;
            }
        }

        /* compiled from: IntentConfirmationInterceptor.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$HandleNextAction;", "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;", "clientSecret", "", "<init>", "(Ljava/lang/String;)V", "getClientSecret", "()Ljava/lang/String;", "deferredIntentConfirmationType", "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "getDeferredIntentConfirmationType", "()Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class HandleNextAction implements NextStep {
            public static final int $stable = 0;
            private final String clientSecret;

            public static /* synthetic */ HandleNextAction copy$default(HandleNextAction handleNextAction, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = handleNextAction.clientSecret;
                }
                return handleNextAction.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getClientSecret() {
                return this.clientSecret;
            }

            public final HandleNextAction copy(String clientSecret) {
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                return new HandleNextAction(clientSecret);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HandleNextAction) && Intrinsics.areEqual(this.clientSecret, ((HandleNextAction) other).clientSecret);
            }

            public int hashCode() {
                return this.clientSecret.hashCode();
            }

            public String toString() {
                return "HandleNextAction(clientSecret=" + this.clientSecret + ")";
            }

            public HandleNextAction(String clientSecret) {
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                this.clientSecret = clientSecret;
            }

            public final String getClientSecret() {
                return this.clientSecret;
            }

            @Override // com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationInterceptor.NextStep
            public DeferredIntentConfirmationType getDeferredIntentConfirmationType() {
                return DeferredIntentConfirmationType.Server;
            }
        }

        /* compiled from: IntentConfirmationInterceptor.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Complete;", "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;", "isForceSuccess", "", "completedFullPaymentFlow", "<init>", "(ZZ)V", "()Z", "getCompletedFullPaymentFlow", "deferredIntentConfirmationType", "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "getDeferredIntentConfirmationType", "()Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Complete implements NextStep {
            public static final int $stable = 0;
            private final boolean completedFullPaymentFlow;
            private final boolean isForceSuccess;

            public static /* synthetic */ Complete copy$default(Complete complete, boolean z, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = complete.isForceSuccess;
                }
                if ((i & 2) != 0) {
                    z2 = complete.completedFullPaymentFlow;
                }
                return complete.copy(z, z2);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsForceSuccess() {
                return this.isForceSuccess;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getCompletedFullPaymentFlow() {
                return this.completedFullPaymentFlow;
            }

            public final Complete copy(boolean isForceSuccess, boolean completedFullPaymentFlow) {
                return new Complete(isForceSuccess, completedFullPaymentFlow);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Complete)) {
                    return false;
                }
                Complete complete = (Complete) other;
                return this.isForceSuccess == complete.isForceSuccess && this.completedFullPaymentFlow == complete.completedFullPaymentFlow;
            }

            public int hashCode() {
                return (Boolean.hashCode(this.isForceSuccess) * 31) + Boolean.hashCode(this.completedFullPaymentFlow);
            }

            public String toString() {
                return "Complete(isForceSuccess=" + this.isForceSuccess + ", completedFullPaymentFlow=" + this.completedFullPaymentFlow + ")";
            }

            public Complete(boolean z, boolean z2) {
                this.isForceSuccess = z;
                this.completedFullPaymentFlow = z2;
            }

            public /* synthetic */ Complete(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(z, (i & 2) != 0 ? true : z2);
            }

            public final boolean isForceSuccess() {
                return this.isForceSuccess;
            }

            public final boolean getCompletedFullPaymentFlow() {
                return this.completedFullPaymentFlow;
            }

            @Override // com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationInterceptor.NextStep
            public DeferredIntentConfirmationType getDeferredIntentConfirmationType() {
                if (this.isForceSuccess) {
                    return DeferredIntentConfirmationType.None;
                }
                return DeferredIntentConfirmationType.Server;
            }
        }
    }

    /* compiled from: IntentConfirmationInterceptor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object intercept$default(IntentConfirmationInterceptor intentConfirmationInterceptor, PaymentElementLoader.InitializationMode initializationMode, StripeIntent stripeIntent, PaymentMethodCreateParams paymentMethodCreateParams, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, ConfirmPaymentIntentParams.Shipping shipping, boolean z, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: intercept");
            }
            if ((i & 8) != 0) {
                paymentMethodOptionsParams = null;
            }
            if ((i & 16) != 0) {
                paymentMethodExtraParams = null;
            }
            return intentConfirmationInterceptor.intercept(initializationMode, stripeIntent, paymentMethodCreateParams, paymentMethodOptionsParams, paymentMethodExtraParams, shipping, z, continuation);
        }

        public static /* synthetic */ Object intercept$default(IntentConfirmationInterceptor intentConfirmationInterceptor, PaymentElementLoader.InitializationMode initializationMode, StripeIntent stripeIntent, PaymentMethod paymentMethod, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, ConfirmPaymentIntentParams.Shipping shipping, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: intercept");
            }
            if ((i & 16) != 0) {
                paymentMethodExtraParams = null;
            }
            return intentConfirmationInterceptor.intercept(initializationMode, stripeIntent, paymentMethod, paymentMethodOptionsParams, paymentMethodExtraParams, shipping, continuation);
        }
    }

    /* compiled from: IntentConfirmationInterceptor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$Companion;", "", "<init>", "()V", "createIntentCallback", "Lcom/stripe/android/paymentsheet/CreateIntentCallback;", "getCreateIntentCallback", "()Lcom/stripe/android/paymentsheet/CreateIntentCallback;", "setCreateIntentCallback", "(Lcom/stripe/android/paymentsheet/CreateIntentCallback;)V", "COMPLETE_WITHOUT_CONFIRMING_INTENT", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String COMPLETE_WITHOUT_CONFIRMING_INTENT = "COMPLETE_WITHOUT_CONFIRMING_INTENT";
        private static CreateIntentCallback createIntentCallback;

        private Companion() {
        }

        public final CreateIntentCallback getCreateIntentCallback() {
            return createIntentCallback;
        }

        public final void setCreateIntentCallback(CreateIntentCallback createIntentCallback2) {
            createIntentCallback = createIntentCallback2;
        }
    }
}
