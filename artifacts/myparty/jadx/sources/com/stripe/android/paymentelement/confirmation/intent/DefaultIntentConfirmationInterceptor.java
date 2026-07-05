package com.stripe.android.paymentelement.confirmation.intent;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.NativeProtocol;
import com.stripe.android.ConfirmStripeIntentParamsFactory;
import com.stripe.android.R;
import com.stripe.android.common.exception.ExceptionKtKt;
import com.stripe.android.core.exception.GenericStripeException;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.link.utils.ErrorsKt;
import com.stripe.android.model.Address;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodExtraParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.PaymentMethodOptionsParamsKt;
import com.stripe.android.model.RadarSessionWithHCaptcha;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentelement.PreparePaymentMethodHandler;
import com.stripe.android.paymentelement.confirmation.ConfirmationConstantsKt;
import com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationInterceptor;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.paymentsheet.CreateIntentCallback;
import com.stripe.android.paymentsheet.CreateIntentResult;
import com.stripe.android.paymentsheet.DeferredIntentValidator;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import expo.modules.notifications.service.NotificationsService;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.TimeoutKt;

/* compiled from: IntentConfirmationInterceptor.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 S2\u00020\u0001:\u0001SBe\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012JL\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010&JD\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096@¢\u0006\u0002\u0010)JD\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020\fH\u0082@¢\u0006\u0002\u0010-JD\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,2\u0006\u0010'\u001a\u00020(2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010.\u001a\u00020\fH\u0082@¢\u0006\u0002\u0010/JD\u00100\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,2\u0006\u0010'\u001a\u00020(2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010.\u001a\u00020\fH\u0082@¢\u0006\u0002\u0010/J \u00101\u001a\u00020\u00182\u0006\u0010'\u001a\u00020(2\b\u0010#\u001a\u0004\u0018\u00010$H\u0082@¢\u0006\u0002\u00102J\u001e\u00103\u001a\b\u0012\u0004\u0012\u00020(042\u0006\u00105\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0002\u00109J\u0010\u0010:\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0002\u00109J\n\u0010;\u001a\u0004\u0018\u00010\bH\u0002J\n\u0010<\u001a\u0004\u0018\u00010\nH\u0002JL\u0010=\u001a\u00020\u00182\u0006\u0010>\u001a\u00020\b2\u0006\u0010+\u001a\u00020,2\u0006\u0010'\u001a\u00020(2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010.\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010$H\u0082@¢\u0006\u0002\u0010?JD\u0010@\u001a\u00020\u00182\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020,2\u0006\u0010'\u001a\u00020(2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0082@¢\u0006\u0002\u0010BJ \u0010C\u001a\u00020\u00182\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(H\u0002J\u001e\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001c042\u0006\u0010A\u001a\u00020\u000fH\u0082@¢\u0006\u0004\bE\u0010FJF\u0010G\u001a\u00020\u00182\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010'\u001a\u00020(2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010H\u001a\u00020\fH\u0002JB\u0010G\u001a\u00020\u00182\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u001c\u0010I\u001a\u00020J2\n\u0010K\u001a\u00060Lj\u0002`M2\u0006\u0010N\u001a\u00020\u000fH\u0002J\u0012\u0010O\u001a\u00020P2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\f\u0010Q\u001a\u00020R*\u00020$H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006T"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor;", "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "intentCreationCallbackProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/paymentsheet/CreateIntentCallback;", "preparePaymentMethodHandlerProvider", "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;", "allowsManualConfirmation", "", "publishableKeyProvider", "Lkotlin/Function0;", "", "stripeAccountIdProvider", "<init>", "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Ljavax/inject/Provider;Ljavax/inject/Provider;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "getRequestOptions", "()Lcom/stripe/android/core/networking/ApiRequest$Options;", "intercept", "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;", "initializationMode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", SDKConstants.PARAM_INTENT, "Lcom/stripe/android/model/StripeIntent;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodOptionsParams", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "paymentMethodExtraParams", "Lcom/stripe/android/model/PaymentMethodExtraParams;", NamedConstantsKt.SHIPPING_VALUES, "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "customerRequestedSave", "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleDeferred", "intentConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldSavePaymentMethod", "(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleDeferredIntent", "handlePreparePaymentMethod", "(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentMethod", "Lkotlin/Result;", NativeProtocol.WEB_DIALOG_PARAMS, "createPaymentMethod-gIAlu-s", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "waitForIntentCallback", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "waitForPreparePaymentMethodHandler", "retrieveCallback", "retrievePreparePaymentMethodHandler", "handleDeferredIntentCreationFromPaymentMethod", "createIntentCallback", "(Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;ZLcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleDeferredIntentCreationSuccess", "clientSecret", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createHandleNextActionStep", "retrieveStripeIntent", "retrieveStripeIntent-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createConfirmStep", "isDeferred", "createFailStep", "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;", NotificationsService.EXCEPTION_KEY, "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "failIfSetAsDefaultFeatureIsEnabled", "", "toAddressDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultIntentConfirmationInterceptor implements IntentConfirmationInterceptor {
    private static final long PROVIDER_FETCH_INTERVAL = 5;
    private static final int PROVIDER_FETCH_TIMEOUT = 2;
    private final boolean allowsManualConfirmation;
    private final ErrorReporter errorReporter;
    private final Provider<CreateIntentCallback> intentCreationCallbackProvider;
    private final Provider<PreparePaymentMethodHandler> preparePaymentMethodHandlerProvider;
    private final Function0<String> publishableKeyProvider;
    private final Function0<String> stripeAccountIdProvider;
    private final StripeRepository stripeRepository;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: IntentConfirmationInterceptor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.confirmation.intent.DefaultIntentConfirmationInterceptor", f = "IntentConfirmationInterceptor.kt", i = {0, 0, 0, 0, 0, 0}, l = {282, 284}, m = "handleDeferred", n = {"this", "intentConfiguration", "paymentMethodOptionsParams", "paymentMethodExtraParams", NamedConstantsKt.SHIPPING_VALUES, "customerRequestedSave"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0"})
    /* renamed from: com.stripe.android.paymentelement.confirmation.intent.DefaultIntentConfirmationInterceptor$handleDeferred$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultIntentConfirmationInterceptor.this.handleDeferred((PaymentSheet.IntentConfiguration) null, (PaymentMethodCreateParams) null, (PaymentMethodOptionsParams) null, (PaymentMethodExtraParams) null, (ConfirmPaymentIntentParams.Shipping) null, false, (Continuation<? super IntentConfirmationInterceptor.NextStep>) this);
        }
    }

    /* compiled from: IntentConfirmationInterceptor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.confirmation.intent.DefaultIntentConfirmationInterceptor", f = "IntentConfirmationInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {334, 336}, m = "handleDeferredIntent", n = {"this", "intentConfiguration", "paymentMethod", "paymentMethodOptionsParams", "paymentMethodExtraParams", NamedConstantsKt.SHIPPING_VALUES, "shouldSavePaymentMethod"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0"})
    /* renamed from: com.stripe.android.paymentelement.confirmation.intent.DefaultIntentConfirmationInterceptor$handleDeferredIntent$1, reason: invalid class name and case insensitive filesystem */
    static final class C10721 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C10721(Continuation<? super C10721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultIntentConfirmationInterceptor.this.handleDeferredIntent(null, null, null, null, null, false, this);
        }
    }

    /* compiled from: IntentConfirmationInterceptor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.confirmation.intent.DefaultIntentConfirmationInterceptor", f = "IntentConfirmationInterceptor.kt", i = {0, 0, 0, 0, 0, 0}, l = {490, 500}, m = "handleDeferredIntentCreationFromPaymentMethod", n = {"this", "intentConfiguration", "paymentMethod", "paymentMethodOptionsParams", "paymentMethodExtraParams", NamedConstantsKt.SHIPPING_VALUES}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    /* renamed from: com.stripe.android.paymentelement.confirmation.intent.DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationFromPaymentMethod$1, reason: invalid class name and case insensitive filesystem */
    static final class C10731 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        C10731(Continuation<? super C10731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultIntentConfirmationInterceptor.this.handleDeferredIntentCreationFromPaymentMethod(null, null, null, null, null, false, null, this);
        }
    }

    /* compiled from: IntentConfirmationInterceptor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.confirmation.intent.DefaultIntentConfirmationInterceptor", f = "IntentConfirmationInterceptor.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {530}, m = "handleDeferredIntentCreationSuccess", n = {"this", "clientSecret", "intentConfiguration", "paymentMethod", "paymentMethodOptionsParams", "paymentMethodExtraParams", NamedConstantsKt.SHIPPING_VALUES}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"})
    /* renamed from: com.stripe.android.paymentelement.confirmation.intent.DefaultIntentConfirmationInterceptor$handleDeferredIntentCreationSuccess$1, reason: invalid class name and case insensitive filesystem */
    static final class C10741 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        C10741(Continuation<? super C10741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultIntentConfirmationInterceptor.this.handleDeferredIntentCreationSuccess(null, null, null, null, null, null, this);
        }
    }

    /* compiled from: IntentConfirmationInterceptor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.confirmation.intent.DefaultIntentConfirmationInterceptor", f = "IntentConfirmationInterceptor.kt", i = {0, 0, 0, 1, 1, 1}, l = {370, 387, 390}, m = "handlePreparePaymentMethod", n = {"this", "paymentMethod", NamedConstantsKt.SHIPPING_VALUES, "this", "paymentMethod", NamedConstantsKt.SHIPPING_VALUES}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    /* renamed from: com.stripe.android.paymentelement.confirmation.intent.DefaultIntentConfirmationInterceptor$handlePreparePaymentMethod$1, reason: invalid class name and case insensitive filesystem */
    static final class C10751 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C10751(Continuation<? super C10751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultIntentConfirmationInterceptor.this.handlePreparePaymentMethod(null, null, this);
        }
    }

    /* compiled from: IntentConfirmationInterceptor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.confirmation.intent.DefaultIntentConfirmationInterceptor", f = "IntentConfirmationInterceptor.kt", i = {0}, l = {433}, m = "waitForIntentCallback", n = {"$this$waitForIntentCallback_u24lambda_u245"}, s = {"L$0"})
    /* renamed from: com.stripe.android.paymentelement.confirmation.intent.DefaultIntentConfirmationInterceptor$waitForIntentCallback$1, reason: invalid class name and case insensitive filesystem */
    static final class C10761 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10761(Continuation<? super C10761> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultIntentConfirmationInterceptor.this.waitForIntentCallback(this);
        }
    }

    /* compiled from: IntentConfirmationInterceptor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.confirmation.intent.DefaultIntentConfirmationInterceptor", f = "IntentConfirmationInterceptor.kt", i = {0}, l = {454}, m = "waitForPreparePaymentMethodHandler", n = {"$this$waitForPreparePaymentMethodHandler_u24lambda_u246"}, s = {"L$0"})
    /* renamed from: com.stripe.android.paymentelement.confirmation.intent.DefaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$1, reason: invalid class name and case insensitive filesystem */
    static final class C10771 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10771(Continuation<? super C10771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultIntentConfirmationInterceptor.this.waitForPreparePaymentMethodHandler(this);
        }
    }

    @Inject
    public DefaultIntentConfirmationInterceptor(StripeRepository stripeRepository, ErrorReporter errorReporter, Provider<CreateIntentCallback> intentCreationCallbackProvider, Provider<PreparePaymentMethodHandler> preparePaymentMethodHandlerProvider, @Named(ConfirmationConstantsKt.ALLOWS_MANUAL_CONFIRMATION) boolean z, @Named("publishableKey") Function0<String> publishableKeyProvider, @Named(NamedConstantsKt.STRIPE_ACCOUNT_ID) Function0<String> stripeAccountIdProvider) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(intentCreationCallbackProvider, "intentCreationCallbackProvider");
        Intrinsics.checkNotNullParameter(preparePaymentMethodHandlerProvider, "preparePaymentMethodHandlerProvider");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(stripeAccountIdProvider, "stripeAccountIdProvider");
        this.stripeRepository = stripeRepository;
        this.errorReporter = errorReporter;
        this.intentCreationCallbackProvider = intentCreationCallbackProvider;
        this.preparePaymentMethodHandlerProvider = preparePaymentMethodHandlerProvider;
        this.allowsManualConfirmation = z;
        this.publishableKeyProvider = publishableKeyProvider;
        this.stripeAccountIdProvider = stripeAccountIdProvider;
    }

    private final ApiRequest.Options getRequestOptions() {
        return new ApiRequest.Options(this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke(), null, 4, null);
    }

    @Override // com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationInterceptor
    public Object intercept(PaymentElementLoader.InitializationMode initializationMode, StripeIntent stripeIntent, PaymentMethodCreateParams paymentMethodCreateParams, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, ConfirmPaymentIntentParams.Shipping shipping, boolean z, Continuation<? super IntentConfirmationInterceptor.NextStep> continuation) {
        if (initializationMode instanceof PaymentElementLoader.InitializationMode.DeferredIntent) {
            return handleDeferred(((PaymentElementLoader.InitializationMode.DeferredIntent) initializationMode).getIntentConfiguration(), paymentMethodCreateParams, paymentMethodOptionsParams, paymentMethodExtraParams, shipping, z, continuation);
        }
        if (initializationMode instanceof PaymentElementLoader.InitializationMode.PaymentIntent) {
            return createConfirmStep(((PaymentElementLoader.InitializationMode.PaymentIntent) initializationMode).getClientSecret(), stripeIntent, shipping, paymentMethodCreateParams, paymentMethodOptionsParams, paymentMethodExtraParams);
        }
        if (!(initializationMode instanceof PaymentElementLoader.InitializationMode.SetupIntent)) {
            throw new NoWhenBranchMatchedException();
        }
        return createConfirmStep$default(this, ((PaymentElementLoader.InitializationMode.SetupIntent) initializationMode).getClientSecret(), stripeIntent, shipping, paymentMethodCreateParams, null, paymentMethodExtraParams, 16, null);
    }

    @Override // com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationInterceptor
    public Object intercept(PaymentElementLoader.InitializationMode initializationMode, StripeIntent stripeIntent, PaymentMethod paymentMethod, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, ConfirmPaymentIntentParams.Shipping shipping, Continuation<? super IntentConfirmationInterceptor.NextStep> continuation) {
        if (initializationMode instanceof PaymentElementLoader.InitializationMode.DeferredIntent) {
            return handleDeferred(((PaymentElementLoader.InitializationMode.DeferredIntent) initializationMode).getIntentConfiguration(), paymentMethod, paymentMethodOptionsParams, paymentMethodExtraParams, shipping, (paymentMethodOptionsParams != null ? PaymentMethodOptionsParamsKt.setupFutureUsage(paymentMethodOptionsParams) : null) == ConfirmPaymentIntentParams.SetupFutureUsage.OffSession, continuation);
        }
        if (initializationMode instanceof PaymentElementLoader.InitializationMode.PaymentIntent) {
            return createConfirmStep(((PaymentElementLoader.InitializationMode.PaymentIntent) initializationMode).getClientSecret(), stripeIntent, shipping, paymentMethod, paymentMethodOptionsParams, paymentMethodExtraParams, false);
        }
        if (!(initializationMode instanceof PaymentElementLoader.InitializationMode.SetupIntent)) {
            throw new NoWhenBranchMatchedException();
        }
        return createConfirmStep(((PaymentElementLoader.InitializationMode.SetupIntent) initializationMode).getClientSecret(), stripeIntent, shipping, paymentMethod, paymentMethodOptionsParams, paymentMethodExtraParams, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fd, code lost:
    
        if (r1 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleDeferred(PaymentSheet.IntentConfiguration intentConfiguration, PaymentMethodCreateParams paymentMethodCreateParams, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, ConfirmPaymentIntentParams.Shipping shipping, boolean z, Continuation<? super IntentConfirmationInterceptor.NextStep> continuation) {
        AnonymousClass1 anonymousClass1;
        PaymentMethodOptionsParams paymentMethodOptionsParams2;
        PaymentMethodExtraParams paymentMethodExtraParams2;
        boolean z2;
        Object objM8079createPaymentMethodgIAlus;
        ConfirmPaymentIntentParams.Shipping shipping2;
        PaymentSheet.IntentConfiguration intentConfiguration2;
        DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        AnonymousClass1 anonymousClass12 = anonymousClass1;
        Object objHandleDeferred = anonymousClass12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objHandleDeferred);
            Set setCreateSetBuilder = SetsKt.createSetBuilder();
            setCreateSetBuilder.addAll(paymentMethodCreateParams.getAttribution());
            setCreateSetBuilder.add("deferred-intent");
            if (intentConfiguration.getPaymentMethodTypes().isEmpty()) {
                setCreateSetBuilder.add("autopm");
            }
            PaymentMethodCreateParams paymentMethodCreateParamsCopy$default = PaymentMethodCreateParams.copy$default(paymentMethodCreateParams, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, SetsKt.build(setCreateSetBuilder), null, 3145727, null);
            anonymousClass12.L$0 = this;
            anonymousClass12.L$1 = intentConfiguration;
            paymentMethodOptionsParams2 = paymentMethodOptionsParams;
            anonymousClass12.L$2 = paymentMethodOptionsParams2;
            paymentMethodExtraParams2 = paymentMethodExtraParams;
            anonymousClass12.L$3 = paymentMethodExtraParams2;
            anonymousClass12.L$4 = shipping;
            z2 = z;
            anonymousClass12.Z$0 = z2;
            anonymousClass12.label = 1;
            objM8079createPaymentMethodgIAlus = m8079createPaymentMethodgIAlus(paymentMethodCreateParamsCopy$default, anonymousClass12);
            if (objM8079createPaymentMethodgIAlus != coroutine_suspended) {
                shipping2 = shipping;
                intentConfiguration2 = intentConfiguration;
                defaultIntentConfirmationInterceptor = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objHandleDeferred);
            return (IntentConfirmationInterceptor.NextStep) objHandleDeferred;
        }
        boolean z3 = anonymousClass12.Z$0;
        shipping2 = (ConfirmPaymentIntentParams.Shipping) anonymousClass12.L$4;
        PaymentMethodExtraParams paymentMethodExtraParams3 = (PaymentMethodExtraParams) anonymousClass12.L$3;
        PaymentMethodOptionsParams paymentMethodOptionsParams3 = (PaymentMethodOptionsParams) anonymousClass12.L$2;
        intentConfiguration2 = (PaymentSheet.IntentConfiguration) anonymousClass12.L$1;
        DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor2 = (DefaultIntentConfirmationInterceptor) anonymousClass12.L$0;
        ResultKt.throwOnFailure(objHandleDeferred);
        objM8079createPaymentMethodgIAlus = ((Result) objHandleDeferred).getValue();
        z2 = z3;
        defaultIntentConfirmationInterceptor = defaultIntentConfirmationInterceptor2;
        paymentMethodExtraParams2 = paymentMethodExtraParams3;
        paymentMethodOptionsParams2 = paymentMethodOptionsParams3;
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM8079createPaymentMethodgIAlus);
        if (thM9121exceptionOrNullimpl == null) {
            anonymousClass12.L$0 = null;
            anonymousClass12.L$1 = null;
            anonymousClass12.L$2 = null;
            anonymousClass12.L$3 = null;
            anonymousClass12.L$4 = null;
            anonymousClass12.label = 2;
            objHandleDeferred = defaultIntentConfirmationInterceptor.handleDeferred(intentConfiguration2, (PaymentMethod) objM8079createPaymentMethodgIAlus, paymentMethodOptionsParams2, paymentMethodExtraParams2, shipping2, z2, anonymousClass12);
        } else {
            return new IntentConfirmationInterceptor.NextStep.Fail(thM9121exceptionOrNullimpl, ExceptionKtKt.stripeErrorMessage(thM9121exceptionOrNullimpl));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleDeferred(PaymentSheet.IntentConfiguration intentConfiguration, PaymentMethod paymentMethod, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, ConfirmPaymentIntentParams.Shipping shipping, boolean z, Continuation<? super IntentConfirmationInterceptor.NextStep> continuation) {
        PaymentSheet.IntentConfiguration.IntentBehavior intentBehavior = intentConfiguration.getIntentBehavior();
        if (intentBehavior instanceof PaymentSheet.IntentConfiguration.IntentBehavior.Default) {
            return handleDeferredIntent(intentConfiguration, paymentMethod, paymentMethodOptionsParams, paymentMethodExtraParams, shipping, z, continuation);
        }
        if (intentBehavior instanceof PaymentSheet.IntentConfiguration.IntentBehavior.SharedPaymentToken) {
            return handlePreparePaymentMethod(paymentMethod, shipping, continuation);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleDeferredIntent(PaymentSheet.IntentConfiguration intentConfiguration, PaymentMethod paymentMethod, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, ConfirmPaymentIntentParams.Shipping shipping, boolean z, Continuation<? super IntentConfirmationInterceptor.NextStep> continuation) {
        C10721 c10721;
        DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor;
        PaymentMethodExtraParams paymentMethodExtraParams2;
        ConfirmPaymentIntentParams.Shipping shipping2;
        boolean z2;
        PaymentSheet.IntentConfiguration intentConfiguration2;
        PaymentMethod paymentMethod2;
        PaymentMethodOptionsParams paymentMethodOptionsParams2;
        ResolvableString resolvableString;
        if (continuation instanceof C10721) {
            c10721 = (C10721) continuation;
            if ((c10721.label & Integer.MIN_VALUE) != 0) {
                c10721.label -= Integer.MIN_VALUE;
            } else {
                c10721 = new C10721(continuation);
            }
        }
        C10721 c107212 = c10721;
        Object obj = c107212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c107212.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            c107212.L$0 = this;
            c107212.L$1 = intentConfiguration;
            c107212.L$2 = paymentMethod;
            c107212.L$3 = paymentMethodOptionsParams;
            c107212.L$4 = paymentMethodExtraParams;
            c107212.L$5 = shipping;
            c107212.Z$0 = z;
            c107212.label = 1;
            Object objWaitForIntentCallback = waitForIntentCallback(c107212);
            if (objWaitForIntentCallback != coroutine_suspended) {
                defaultIntentConfirmationInterceptor = this;
                paymentMethodExtraParams2 = paymentMethodExtraParams;
                obj = objWaitForIntentCallback;
                shipping2 = shipping;
                z2 = z;
                intentConfiguration2 = intentConfiguration;
                paymentMethod2 = paymentMethod;
                paymentMethodOptionsParams2 = paymentMethodOptionsParams;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        boolean z3 = c107212.Z$0;
        ConfirmPaymentIntentParams.Shipping shipping3 = (ConfirmPaymentIntentParams.Shipping) c107212.L$5;
        PaymentMethodExtraParams paymentMethodExtraParams3 = (PaymentMethodExtraParams) c107212.L$4;
        PaymentMethodOptionsParams paymentMethodOptionsParams3 = (PaymentMethodOptionsParams) c107212.L$3;
        paymentMethod2 = (PaymentMethod) c107212.L$2;
        PaymentSheet.IntentConfiguration intentConfiguration3 = (PaymentSheet.IntentConfiguration) c107212.L$1;
        DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor2 = (DefaultIntentConfirmationInterceptor) c107212.L$0;
        ResultKt.throwOnFailure(obj);
        paymentMethodExtraParams2 = paymentMethodExtraParams3;
        defaultIntentConfirmationInterceptor = defaultIntentConfirmationInterceptor2;
        paymentMethodOptionsParams2 = paymentMethodOptionsParams3;
        intentConfiguration2 = intentConfiguration3;
        z2 = z3;
        shipping2 = shipping3;
        CreateIntentCallback createIntentCallback = (CreateIntentCallback) obj;
        if (createIntentCallback != null) {
            c107212.L$0 = null;
            c107212.L$1 = null;
            c107212.L$2 = null;
            c107212.L$3 = null;
            c107212.L$4 = null;
            c107212.L$5 = null;
            c107212.label = 2;
            Object objHandleDeferredIntentCreationFromPaymentMethod = defaultIntentConfirmationInterceptor.handleDeferredIntentCreationFromPaymentMethod(createIntentCallback, intentConfiguration2, paymentMethod2, paymentMethodOptionsParams2, paymentMethodExtraParams2, z2, shipping2, c107212);
            return objHandleDeferredIntentCreationFromPaymentMethod == coroutine_suspended ? coroutine_suspended : objHandleDeferredIntentCreationFromPaymentMethod;
        }
        ErrorReporter.DefaultImpls.report$default(defaultIntentConfirmationInterceptor.errorReporter, ErrorReporter.ExpectedErrorEvent.CREATE_INTENT_CALLBACK_NULL, null, null, 6, null);
        IllegalStateException illegalStateException = new IllegalStateException("CreateIntentCallback must be implemented when using IntentConfiguration with PaymentSheet");
        if (defaultIntentConfirmationInterceptor.getRequestOptions().getApiKeyIsLiveMode()) {
            resolvableString = ResolvableStringUtilsKt.getResolvableString(R.string.stripe_internal_error);
        } else {
            resolvableString = ResolvableStringUtilsKt.getResolvableString("CreateIntentCallback must be implemented when using IntentConfiguration with PaymentSheet");
        }
        return new IntentConfirmationInterceptor.NextStep.Fail(illegalStateException, resolvableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0106, code lost:
    
        if (r0.onPreparePaymentMethod(r5, r2, r3) == r4) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handlePreparePaymentMethod(PaymentMethod paymentMethod, ConfirmPaymentIntentParams.Shipping shipping, Continuation<? super IntentConfirmationInterceptor.NextStep> continuation) {
        C10751 c10751;
        ConfirmPaymentIntentParams.Shipping shipping2;
        DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor;
        StripeRepository stripeRepository;
        String str;
        Object objMo8027createSavedPaymentMethodRadarSession0E7RQCE;
        Object objM9118constructorimpl;
        PaymentMethod paymentMethod2;
        ConfirmPaymentIntentParams.Shipping shipping3;
        Throwable thM9121exceptionOrNullimpl;
        DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor2;
        PreparePaymentMethodHandler preparePaymentMethodHandler;
        ResolvableString resolvableString;
        PaymentMethod paymentMethod3 = paymentMethod;
        if (continuation instanceof C10751) {
            c10751 = (C10751) continuation;
            if ((c10751.label & Integer.MIN_VALUE) != 0) {
                c10751.label -= Integer.MIN_VALUE;
            } else {
                c10751 = new C10751(continuation);
            }
        }
        Object objWaitForPreparePaymentMethodHandler = c10751.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10751.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(objWaitForPreparePaymentMethodHandler);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor3 = this;
                    stripeRepository = this.stripeRepository;
                    str = paymentMethod3.id;
                    try {
                    } catch (Throwable th) {
                        th = th;
                        defaultIntentConfirmationInterceptor = this;
                        Result.Companion companion2 = Result.INSTANCE;
                        objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                        paymentMethod2 = paymentMethod3;
                        shipping3 = shipping2;
                        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                        if (thM9121exceptionOrNullimpl != null) {
                        }
                        c10751.L$0 = defaultIntentConfirmationInterceptor;
                        c10751.L$1 = paymentMethod2;
                        c10751.L$2 = shipping3;
                        c10751.label = 2;
                        objWaitForPreparePaymentMethodHandler = defaultIntentConfirmationInterceptor.waitForPreparePaymentMethodHandler(c10751);
                        if (objWaitForPreparePaymentMethodHandler != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    shipping2 = shipping;
                }
                if (str == null) {
                    throw new GenericStripeException(new IllegalStateException("No payment method ID was found for provided 'PaymentMethod' object!"), "noPaymentMethodId");
                }
                ApiRequest.Options requestOptions = getRequestOptions();
                c10751.L$0 = this;
                c10751.L$1 = paymentMethod3;
                shipping2 = shipping;
                c10751.L$2 = shipping2;
                c10751.label = 1;
                objMo8027createSavedPaymentMethodRadarSession0E7RQCE = stripeRepository.mo8027createSavedPaymentMethodRadarSession0E7RQCE(str, requestOptions, c10751);
                if (objMo8027createSavedPaymentMethodRadarSession0E7RQCE != coroutine_suspended) {
                    defaultIntentConfirmationInterceptor = this;
                    ResultKt.throwOnFailure(objMo8027createSavedPaymentMethodRadarSession0E7RQCE);
                    objM9118constructorimpl = Result.m9118constructorimpl((RadarSessionWithHCaptcha) objMo8027createSavedPaymentMethodRadarSession0E7RQCE);
                    paymentMethod2 = paymentMethod3;
                    shipping3 = shipping2;
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    c10751.L$0 = defaultIntentConfirmationInterceptor;
                    c10751.L$1 = paymentMethod2;
                    c10751.L$2 = shipping3;
                    c10751.label = 2;
                    objWaitForPreparePaymentMethodHandler = defaultIntentConfirmationInterceptor.waitForPreparePaymentMethodHandler(c10751);
                    if (objWaitForPreparePaymentMethodHandler != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ConfirmPaymentIntentParams.Shipping shipping4 = (ConfirmPaymentIntentParams.Shipping) c10751.L$2;
                PaymentMethod paymentMethod4 = (PaymentMethod) c10751.L$1;
                defaultIntentConfirmationInterceptor = (DefaultIntentConfirmationInterceptor) c10751.L$0;
                try {
                    ResultKt.throwOnFailure(objWaitForPreparePaymentMethodHandler);
                    objMo8027createSavedPaymentMethodRadarSession0E7RQCE = ((Result) objWaitForPreparePaymentMethodHandler).getValue();
                    shipping2 = shipping4;
                    paymentMethod3 = paymentMethod4;
                } catch (Throwable th3) {
                    th = th3;
                    shipping2 = shipping4;
                    paymentMethod3 = paymentMethod4;
                    Result.Companion companion22 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    paymentMethod2 = paymentMethod3;
                    shipping3 = shipping2;
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    c10751.L$0 = defaultIntentConfirmationInterceptor;
                    c10751.L$1 = paymentMethod2;
                    c10751.L$2 = shipping3;
                    c10751.label = 2;
                    objWaitForPreparePaymentMethodHandler = defaultIntentConfirmationInterceptor.waitForPreparePaymentMethodHandler(c10751);
                    if (objWaitForPreparePaymentMethodHandler != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                try {
                    ResultKt.throwOnFailure(objMo8027createSavedPaymentMethodRadarSession0E7RQCE);
                    objM9118constructorimpl = Result.m9118constructorimpl((RadarSessionWithHCaptcha) objMo8027createSavedPaymentMethodRadarSession0E7RQCE);
                } catch (Throwable th4) {
                    th = th4;
                    Result.Companion companion222 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    paymentMethod2 = paymentMethod3;
                    shipping3 = shipping2;
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    c10751.L$0 = defaultIntentConfirmationInterceptor;
                    c10751.L$1 = paymentMethod2;
                    c10751.L$2 = shipping3;
                    c10751.label = 2;
                    objWaitForPreparePaymentMethodHandler = defaultIntentConfirmationInterceptor.waitForPreparePaymentMethodHandler(c10751);
                    if (objWaitForPreparePaymentMethodHandler != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                paymentMethod2 = paymentMethod3;
                shipping3 = shipping2;
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                    ErrorReporter.DefaultImpls.report$default(defaultIntentConfirmationInterceptor.errorReporter, ErrorReporter.ExpectedErrorEvent.SAVED_PAYMENT_METHOD_RADAR_SESSION_FAILURE, StripeException.INSTANCE.create(thM9121exceptionOrNullimpl), null, 4, null);
                }
                c10751.L$0 = defaultIntentConfirmationInterceptor;
                c10751.L$1 = paymentMethod2;
                c10751.L$2 = shipping3;
                c10751.label = 2;
                objWaitForPreparePaymentMethodHandler = defaultIntentConfirmationInterceptor.waitForPreparePaymentMethodHandler(c10751);
                if (objWaitForPreparePaymentMethodHandler != coroutine_suspended) {
                    defaultIntentConfirmationInterceptor2 = defaultIntentConfirmationInterceptor;
                    preparePaymentMethodHandler = (PreparePaymentMethodHandler) objWaitForPreparePaymentMethodHandler;
                    if (preparePaymentMethodHandler == null) {
                    }
                }
                return coroutine_suspended;
            }
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWaitForPreparePaymentMethodHandler);
                return new IntentConfirmationInterceptor.NextStep.Complete(true, false);
            }
            shipping3 = (ConfirmPaymentIntentParams.Shipping) c10751.L$2;
            paymentMethod2 = (PaymentMethod) c10751.L$1;
            defaultIntentConfirmationInterceptor2 = (DefaultIntentConfirmationInterceptor) c10751.L$0;
            ResultKt.throwOnFailure(objWaitForPreparePaymentMethodHandler);
            preparePaymentMethodHandler = (PreparePaymentMethodHandler) objWaitForPreparePaymentMethodHandler;
            if (preparePaymentMethodHandler == null) {
                AddressDetails addressDetails = shipping3 != null ? defaultIntentConfirmationInterceptor2.toAddressDetails(shipping3) : null;
                c10751.L$0 = null;
                c10751.L$1 = null;
                c10751.L$2 = null;
                c10751.label = 3;
            } else {
                ErrorReporter.DefaultImpls.report$default(defaultIntentConfirmationInterceptor2.errorReporter, ErrorReporter.ExpectedErrorEvent.PREPARE_PAYMENT_METHOD_HANDLER_NULL, null, null, 6, null);
                IllegalStateException illegalStateException = new IllegalStateException("PreparePaymentMethodHandler must be implemented when using IntentConfiguration with shared payment tokens!");
                if (defaultIntentConfirmationInterceptor2.getRequestOptions().getApiKeyIsLiveMode()) {
                    resolvableString = ResolvableStringUtilsKt.getResolvableString(R.string.stripe_internal_error);
                } else {
                    resolvableString = ResolvableStringUtilsKt.getResolvableString("PreparePaymentMethodHandler must be implemented when using IntentConfiguration with shared payment tokens!");
                }
                return new IntentConfirmationInterceptor.NextStep.Fail(illegalStateException, resolvableString);
            }
        } catch (Exception e) {
            Exception exc = e;
            return new IntentConfirmationInterceptor.NextStep.Fail(exc, ErrorsKt.getErrorMessage(exc));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: createPaymentMethod-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8079createPaymentMethodgIAlus(PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super Result<PaymentMethod>> continuation) {
        DefaultIntentConfirmationInterceptor$createPaymentMethod$1 defaultIntentConfirmationInterceptor$createPaymentMethod$1;
        if (continuation instanceof DefaultIntentConfirmationInterceptor$createPaymentMethod$1) {
            defaultIntentConfirmationInterceptor$createPaymentMethod$1 = (DefaultIntentConfirmationInterceptor$createPaymentMethod$1) continuation;
            if ((defaultIntentConfirmationInterceptor$createPaymentMethod$1.label & Integer.MIN_VALUE) != 0) {
                defaultIntentConfirmationInterceptor$createPaymentMethod$1.label -= Integer.MIN_VALUE;
            } else {
                defaultIntentConfirmationInterceptor$createPaymentMethod$1 = new DefaultIntentConfirmationInterceptor$createPaymentMethod$1(this, continuation);
            }
        }
        Object obj = defaultIntentConfirmationInterceptor$createPaymentMethod$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultIntentConfirmationInterceptor$createPaymentMethod$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeRepository stripeRepository = this.stripeRepository;
        ApiRequest.Options requestOptions = getRequestOptions();
        defaultIntentConfirmationInterceptor$createPaymentMethod$1.label = 1;
        Object objMo8025createPaymentMethod0E7RQCE = stripeRepository.mo8025createPaymentMethod0E7RQCE(paymentMethodCreateParams, requestOptions, defaultIntentConfirmationInterceptor$createPaymentMethod$1);
        return objMo8025createPaymentMethod0E7RQCE == coroutine_suspended ? coroutine_suspended : objMo8025createPaymentMethod0E7RQCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitForIntentCallback(Continuation<? super CreateIntentCallback> continuation) {
        C10761 c10761;
        CreateIntentCallback createIntentCallbackRetrieveCallback;
        DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor;
        if (continuation instanceof C10761) {
            c10761 = (C10761) continuation;
            if ((c10761.label & Integer.MIN_VALUE) != 0) {
                c10761.label -= Integer.MIN_VALUE;
            } else {
                c10761 = new C10761(continuation);
            }
        }
        Object objM10637withTimeoutOrNullKLykuaI = c10761.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10761.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objM10637withTimeoutOrNullKLykuaI);
            createIntentCallbackRetrieveCallback = retrieveCallback();
            if (createIntentCallbackRetrieveCallback == null) {
                Duration.Companion companion = Duration.INSTANCE;
                long duration = DurationKt.toDuration(2, DurationUnit.SECONDS);
                DefaultIntentConfirmationInterceptor$waitForIntentCallback$2$callback$1 defaultIntentConfirmationInterceptor$waitForIntentCallback$2$callback$1 = new DefaultIntentConfirmationInterceptor$waitForIntentCallback$2$callback$1(this, null);
                c10761.L$0 = this;
                c10761.label = 1;
                objM10637withTimeoutOrNullKLykuaI = TimeoutKt.m10637withTimeoutOrNullKLykuaI(duration, defaultIntentConfirmationInterceptor$waitForIntentCallback$2$callback$1, c10761);
                if (objM10637withTimeoutOrNullKLykuaI == coroutine_suspended) {
                    return coroutine_suspended;
                }
                defaultIntentConfirmationInterceptor = this;
            }
            return createIntentCallbackRetrieveCallback;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defaultIntentConfirmationInterceptor = (DefaultIntentConfirmationInterceptor) c10761.L$0;
        ResultKt.throwOnFailure(objM10637withTimeoutOrNullKLykuaI);
        createIntentCallbackRetrieveCallback = (CreateIntentCallback) objM10637withTimeoutOrNullKLykuaI;
        if (createIntentCallbackRetrieveCallback != null) {
            ErrorReporter.DefaultImpls.report$default(defaultIntentConfirmationInterceptor.errorReporter, ErrorReporter.SuccessEvent.FOUND_CREATE_INTENT_CALLBACK_WHILE_POLLING, null, null, 6, null);
        }
        return createIntentCallbackRetrieveCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitForPreparePaymentMethodHandler(Continuation<? super PreparePaymentMethodHandler> continuation) {
        C10771 c10771;
        PreparePaymentMethodHandler preparePaymentMethodHandlerRetrievePreparePaymentMethodHandler;
        DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor;
        if (continuation instanceof C10771) {
            c10771 = (C10771) continuation;
            if ((c10771.label & Integer.MIN_VALUE) != 0) {
                c10771.label -= Integer.MIN_VALUE;
            } else {
                c10771 = new C10771(continuation);
            }
        }
        Object objM10637withTimeoutOrNullKLykuaI = c10771.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10771.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objM10637withTimeoutOrNullKLykuaI);
            preparePaymentMethodHandlerRetrievePreparePaymentMethodHandler = retrievePreparePaymentMethodHandler();
            if (preparePaymentMethodHandlerRetrievePreparePaymentMethodHandler == null) {
                Duration.Companion companion = Duration.INSTANCE;
                long duration = DurationKt.toDuration(2, DurationUnit.SECONDS);
                DefaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$2$handler$1 defaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$2$handler$1 = new DefaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$2$handler$1(this, null);
                c10771.L$0 = this;
                c10771.label = 1;
                objM10637withTimeoutOrNullKLykuaI = TimeoutKt.m10637withTimeoutOrNullKLykuaI(duration, defaultIntentConfirmationInterceptor$waitForPreparePaymentMethodHandler$2$handler$1, c10771);
                if (objM10637withTimeoutOrNullKLykuaI == coroutine_suspended) {
                    return coroutine_suspended;
                }
                defaultIntentConfirmationInterceptor = this;
            }
            return preparePaymentMethodHandlerRetrievePreparePaymentMethodHandler;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defaultIntentConfirmationInterceptor = (DefaultIntentConfirmationInterceptor) c10771.L$0;
        ResultKt.throwOnFailure(objM10637withTimeoutOrNullKLykuaI);
        preparePaymentMethodHandlerRetrievePreparePaymentMethodHandler = (PreparePaymentMethodHandler) objM10637withTimeoutOrNullKLykuaI;
        if (preparePaymentMethodHandlerRetrievePreparePaymentMethodHandler != null) {
            ErrorReporter.DefaultImpls.report$default(defaultIntentConfirmationInterceptor.errorReporter, ErrorReporter.SuccessEvent.FOUND_PREPARE_PAYMENT_METHOD_HANDLER_WHILE_POLLING, null, null, 6, null);
        }
        return preparePaymentMethodHandlerRetrievePreparePaymentMethodHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CreateIntentCallback retrieveCallback() {
        return this.intentCreationCallbackProvider.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PreparePaymentMethodHandler retrievePreparePaymentMethodHandler() {
        return this.preparePaymentMethodHandlerProvider.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleDeferredIntentCreationFromPaymentMethod(CreateIntentCallback createIntentCallback, PaymentSheet.IntentConfiguration intentConfiguration, PaymentMethod paymentMethod, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, boolean z, ConfirmPaymentIntentParams.Shipping shipping, Continuation<? super IntentConfirmationInterceptor.NextStep> continuation) {
        C10731 c10731;
        DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor;
        ResolvableString resolvableStringStripeErrorMessage;
        if (continuation instanceof C10731) {
            c10731 = (C10731) continuation;
            if ((c10731.label & Integer.MIN_VALUE) != 0) {
                c10731.label -= Integer.MIN_VALUE;
            } else {
                c10731 = new C10731(continuation);
            }
        }
        C10731 c107312 = c10731;
        Object objOnCreateIntent = c107312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c107312.label;
        int i2 = 2;
        boolean z2 = true;
        if (i == 0) {
            ResultKt.throwOnFailure(objOnCreateIntent);
            c107312.L$0 = this;
            c107312.L$1 = intentConfiguration;
            c107312.L$2 = paymentMethod;
            c107312.L$3 = paymentMethodOptionsParams;
            c107312.L$4 = paymentMethodExtraParams;
            c107312.L$5 = shipping;
            c107312.label = 1;
            objOnCreateIntent = createIntentCallback.onCreateIntent(paymentMethod, z, c107312);
            if (objOnCreateIntent != coroutine_suspended) {
                defaultIntentConfirmationInterceptor = this;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOnCreateIntent);
            return objOnCreateIntent;
        }
        shipping = (ConfirmPaymentIntentParams.Shipping) c107312.L$5;
        paymentMethodExtraParams = (PaymentMethodExtraParams) c107312.L$4;
        paymentMethodOptionsParams = (PaymentMethodOptionsParams) c107312.L$3;
        paymentMethod = (PaymentMethod) c107312.L$2;
        intentConfiguration = (PaymentSheet.IntentConfiguration) c107312.L$1;
        defaultIntentConfirmationInterceptor = (DefaultIntentConfirmationInterceptor) c107312.L$0;
        ResultKt.throwOnFailure(objOnCreateIntent);
        PaymentMethodExtraParams paymentMethodExtraParams2 = paymentMethodExtraParams;
        PaymentMethodOptionsParams paymentMethodOptionsParams2 = paymentMethodOptionsParams;
        PaymentMethod paymentMethod2 = paymentMethod;
        PaymentSheet.IntentConfiguration intentConfiguration2 = intentConfiguration;
        CreateIntentResult createIntentResult = (CreateIntentResult) objOnCreateIntent;
        if (createIntentResult instanceof CreateIntentResult.Success) {
            CreateIntentResult.Success success = (CreateIntentResult.Success) createIntentResult;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (Intrinsics.areEqual(success.getClientSecret(), "COMPLETE_WITHOUT_CONFIRMING_INTENT")) {
                return new IntentConfirmationInterceptor.NextStep.Complete(z2, false, i2, defaultConstructorMarker);
            }
            String clientSecret = success.getClientSecret();
            c107312.L$0 = null;
            c107312.L$1 = null;
            c107312.L$2 = null;
            c107312.L$3 = null;
            c107312.L$4 = null;
            c107312.L$5 = null;
            c107312.label = 2;
            Object objHandleDeferredIntentCreationSuccess = defaultIntentConfirmationInterceptor.handleDeferredIntentCreationSuccess(clientSecret, intentConfiguration2, paymentMethod2, paymentMethodOptionsParams2, paymentMethodExtraParams2, shipping, c107312);
            return objHandleDeferredIntentCreationSuccess == coroutine_suspended ? coroutine_suspended : objHandleDeferredIntentCreationSuccess;
        }
        if (!(createIntentResult instanceof CreateIntentResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        CreateIntentResult.Failure failure = (CreateIntentResult.Failure) createIntentResult;
        CreateIntentCallbackFailureException createIntentCallbackFailureException = new CreateIntentCallbackFailureException(failure.getCause());
        String displayMessage = failure.getDisplayMessage();
        if (displayMessage == null || (resolvableStringStripeErrorMessage = ResolvableStringUtilsKt.getResolvableString(displayMessage)) == null) {
            resolvableStringStripeErrorMessage = ExceptionKtKt.stripeErrorMessage(createIntentCallbackFailureException);
        }
        return new IntentConfirmationInterceptor.NextStep.Fail(createIntentCallbackFailureException, resolvableStringStripeErrorMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleDeferredIntentCreationSuccess(String str, PaymentSheet.IntentConfiguration intentConfiguration, PaymentMethod paymentMethod, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, ConfirmPaymentIntentParams.Shipping shipping, Continuation<? super IntentConfirmationInterceptor.NextStep> continuation) {
        C10741 c10741;
        String str2;
        PaymentMethod paymentMethod2;
        PaymentMethodOptionsParams paymentMethodOptionsParams2;
        Object value;
        PaymentMethodExtraParams paymentMethodExtraParams2;
        ConfirmPaymentIntentParams.Shipping shipping2;
        DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor;
        Object objM9118constructorimpl;
        IntentConfirmationInterceptor.NextStep.Complete completeCreateConfirmStep;
        if (continuation instanceof C10741) {
            c10741 = (C10741) continuation;
            if ((c10741.label & Integer.MIN_VALUE) != 0) {
                c10741.label -= Integer.MIN_VALUE;
            } else {
                c10741 = new C10741(continuation);
            }
        }
        Object obj = c10741.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10741.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            c10741.L$0 = this;
            c10741.L$1 = str;
            c10741.L$2 = intentConfiguration;
            c10741.L$3 = paymentMethod;
            c10741.L$4 = paymentMethodOptionsParams;
            c10741.L$5 = paymentMethodExtraParams;
            c10741.L$6 = shipping;
            c10741.label = 1;
            Object objM8080retrieveStripeIntentgIAlus = m8080retrieveStripeIntentgIAlus(str, c10741);
            if (objM8080retrieveStripeIntentgIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = str;
            paymentMethod2 = paymentMethod;
            paymentMethodOptionsParams2 = paymentMethodOptionsParams;
            value = objM8080retrieveStripeIntentgIAlus;
            paymentMethodExtraParams2 = paymentMethodExtraParams;
            shipping2 = shipping;
            defaultIntentConfirmationInterceptor = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ConfirmPaymentIntentParams.Shipping shipping3 = (ConfirmPaymentIntentParams.Shipping) c10741.L$6;
            PaymentMethodExtraParams paymentMethodExtraParams3 = (PaymentMethodExtraParams) c10741.L$5;
            PaymentMethodOptionsParams paymentMethodOptionsParams3 = (PaymentMethodOptionsParams) c10741.L$4;
            PaymentMethod paymentMethod3 = (PaymentMethod) c10741.L$3;
            PaymentSheet.IntentConfiguration intentConfiguration2 = (PaymentSheet.IntentConfiguration) c10741.L$2;
            str2 = (String) c10741.L$1;
            DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor2 = (DefaultIntentConfirmationInterceptor) c10741.L$0;
            ResultKt.throwOnFailure(obj);
            value = ((Result) obj).getValue();
            shipping2 = shipping3;
            paymentMethodExtraParams2 = paymentMethodExtraParams3;
            paymentMethodOptionsParams2 = paymentMethodOptionsParams3;
            paymentMethod2 = paymentMethod3;
            intentConfiguration = intentConfiguration2;
            defaultIntentConfirmationInterceptor = defaultIntentConfirmationInterceptor2;
        }
        if (Result.m9125isSuccessimpl(value)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                StripeIntent stripeIntent = (StripeIntent) value;
                if (stripeIntent.isConfirmed()) {
                    defaultIntentConfirmationInterceptor.failIfSetAsDefaultFeatureIsEnabled(paymentMethodExtraParams2);
                    boolean z = false;
                    completeCreateConfirmStep = new IntentConfirmationInterceptor.NextStep.Complete(z, z, 2, null);
                } else if (stripeIntent.requiresAction()) {
                    completeCreateConfirmStep = defaultIntentConfirmationInterceptor.createHandleNextActionStep(str2, stripeIntent, paymentMethod2);
                } else {
                    DeferredIntentValidator.INSTANCE.validate(stripeIntent, intentConfiguration, defaultIntentConfirmationInterceptor.allowsManualConfirmation);
                    completeCreateConfirmStep = defaultIntentConfirmationInterceptor.createConfirmStep(str2, stripeIntent, shipping2, paymentMethod2, paymentMethodOptionsParams2, paymentMethodExtraParams2, true);
                }
                objM9118constructorimpl = Result.m9118constructorimpl(completeCreateConfirmStep);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            objM9118constructorimpl = Result.m9118constructorimpl(value);
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        return thM9121exceptionOrNullimpl == null ? objM9118constructorimpl : new IntentConfirmationInterceptor.NextStep.Fail(thM9121exceptionOrNullimpl, ExceptionKtKt.stripeErrorMessage(thM9121exceptionOrNullimpl));
    }

    private final IntentConfirmationInterceptor.NextStep createHandleNextActionStep(String clientSecret, StripeIntent intent, PaymentMethod paymentMethod) {
        IntentConfirmationInterceptor.NextStep.Fail failM9118constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor = this;
            DeferredIntentValidator.INSTANCE.validatePaymentMethod(intent, paymentMethod);
            failM9118constructorimpl = Result.m9118constructorimpl(new IntentConfirmationInterceptor.NextStep.HandleNextAction(clientSecret));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            failM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m9121exceptionOrNullimpl(failM9118constructorimpl) != null) {
            failM9118constructorimpl = new IntentConfirmationInterceptor.NextStep.Fail(new InvalidDeferredIntentUsageException(), ResolvableStringUtilsKt.resolvableString$default(com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_invalid_deferred_intent_usage, new Object[0], null, 4, null));
        }
        return (IntentConfirmationInterceptor.NextStep) failM9118constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: retrieveStripeIntent-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8080retrieveStripeIntentgIAlus(String str, Continuation<? super Result<? extends StripeIntent>> continuation) {
        DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1 defaultIntentConfirmationInterceptor$retrieveStripeIntent$1;
        if (continuation instanceof DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1) {
            defaultIntentConfirmationInterceptor$retrieveStripeIntent$1 = (DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1) continuation;
            if ((defaultIntentConfirmationInterceptor$retrieveStripeIntent$1.label & Integer.MIN_VALUE) != 0) {
                defaultIntentConfirmationInterceptor$retrieveStripeIntent$1.label -= Integer.MIN_VALUE;
            } else {
                defaultIntentConfirmationInterceptor$retrieveStripeIntent$1 = new DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1(this, continuation);
            }
        }
        DefaultIntentConfirmationInterceptor$retrieveStripeIntent$1 defaultIntentConfirmationInterceptor$retrieveStripeIntent$12 = defaultIntentConfirmationInterceptor$retrieveStripeIntent$1;
        Object obj = defaultIntentConfirmationInterceptor$retrieveStripeIntent$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultIntentConfirmationInterceptor$retrieveStripeIntent$12.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeRepository stripeRepository = this.stripeRepository;
        ApiRequest.Options requestOptions = getRequestOptions();
        defaultIntentConfirmationInterceptor$retrieveStripeIntent$12.label = 1;
        Object objM8070retrieveStripeIntentBWLJW6A$default = StripeRepository.DefaultImpls.m8070retrieveStripeIntentBWLJW6A$default(stripeRepository, str, requestOptions, null, defaultIntentConfirmationInterceptor$retrieveStripeIntent$12, 4, null);
        return objM8070retrieveStripeIntentBWLJW6A$default == coroutine_suspended ? coroutine_suspended : objM8070retrieveStripeIntentBWLJW6A$default;
    }

    private final IntentConfirmationInterceptor.NextStep createConfirmStep(String clientSecret, StripeIntent intent, ConfirmPaymentIntentParams.Shipping shippingValues, PaymentMethod paymentMethod, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, boolean isDeferred) {
        ConfirmStripeIntentParamsFactory<ConfirmStripeIntentParams> confirmStripeIntentParamsFactoryCreateFactory = ConfirmStripeIntentParamsFactory.INSTANCE.createFactory(clientSecret, intent, shippingValues);
        if (confirmStripeIntentParamsFactoryCreateFactory == null) {
            InvalidClientSecretException invalidClientSecretException = new InvalidClientSecretException(clientSecret, intent);
            return createFailStep(invalidClientSecretException, invalidClientSecretException.getMessage());
        }
        return new IntentConfirmationInterceptor.NextStep.Confirm(confirmStripeIntentParamsFactoryCreateFactory.create(paymentMethod, paymentMethodOptionsParams, paymentMethodExtraParams), isDeferred);
    }

    static /* synthetic */ IntentConfirmationInterceptor.NextStep createConfirmStep$default(DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor, String str, StripeIntent stripeIntent, ConfirmPaymentIntentParams.Shipping shipping, PaymentMethodCreateParams paymentMethodCreateParams, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, int i, Object obj) {
        if ((i & 16) != 0) {
            paymentMethodOptionsParams = null;
        }
        if ((i & 32) != 0) {
            paymentMethodExtraParams = null;
        }
        return defaultIntentConfirmationInterceptor.createConfirmStep(str, stripeIntent, shipping, paymentMethodCreateParams, paymentMethodOptionsParams, paymentMethodExtraParams);
    }

    private final IntentConfirmationInterceptor.NextStep createConfirmStep(String clientSecret, StripeIntent intent, ConfirmPaymentIntentParams.Shipping shippingValues, PaymentMethodCreateParams paymentMethodCreateParams, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams) {
        ConfirmStripeIntentParamsFactory<ConfirmStripeIntentParams> confirmStripeIntentParamsFactoryCreateFactory = ConfirmStripeIntentParamsFactory.INSTANCE.createFactory(clientSecret, intent, shippingValues);
        if (confirmStripeIntentParamsFactoryCreateFactory == null) {
            InvalidClientSecretException invalidClientSecretException = new InvalidClientSecretException(clientSecret, intent);
            return createFailStep(invalidClientSecretException, invalidClientSecretException.getMessage());
        }
        return new IntentConfirmationInterceptor.NextStep.Confirm(confirmStripeIntentParamsFactoryCreateFactory.create(paymentMethodCreateParams, paymentMethodOptionsParams, paymentMethodExtraParams), false);
    }

    private final IntentConfirmationInterceptor.NextStep.Fail createFailStep(Exception exception, String message) {
        ResolvableString resolvableString;
        Exception exc = exception;
        if (getRequestOptions().getApiKeyIsLiveMode()) {
            resolvableString = ResolvableStringUtilsKt.getResolvableString(R.string.stripe_internal_error);
        } else {
            resolvableString = ResolvableStringUtilsKt.getResolvableString(message);
        }
        return new IntentConfirmationInterceptor.NextStep.Fail(exc, resolvableString);
    }

    private final void failIfSetAsDefaultFeatureIsEnabled(PaymentMethodExtraParams paymentMethodExtraParams) {
        boolean zAreEqual;
        if (paymentMethodExtraParams instanceof PaymentMethodExtraParams.Card) {
            zAreEqual = Intrinsics.areEqual((Object) ((PaymentMethodExtraParams.Card) paymentMethodExtraParams).getSetAsDefault(), (Object) true);
        } else if (paymentMethodExtraParams instanceof PaymentMethodExtraParams.USBankAccount) {
            zAreEqual = Intrinsics.areEqual((Object) ((PaymentMethodExtraParams.USBankAccount) paymentMethodExtraParams).getSetAsDefault(), (Object) true);
        } else if (paymentMethodExtraParams instanceof PaymentMethodExtraParams.Link) {
            zAreEqual = Intrinsics.areEqual((Object) ((PaymentMethodExtraParams.Link) paymentMethodExtraParams).getSetAsDefault(), (Object) true);
        } else if (paymentMethodExtraParams instanceof PaymentMethodExtraParams.SepaDebit) {
            zAreEqual = Intrinsics.areEqual((Object) ((PaymentMethodExtraParams.SepaDebit) paymentMethodExtraParams).getSetAsDefault(), (Object) true);
        } else {
            if (!(paymentMethodExtraParams instanceof PaymentMethodExtraParams.BacsDebit) && paymentMethodExtraParams != null) {
                throw new NoWhenBranchMatchedException();
            }
            zAreEqual = false;
        }
        if (zAreEqual && !getRequestOptions().getApiKeyIsLiveMode()) {
            throw new IllegalStateException("(Test-mode only error) The default payment methods feature is not yet supported with deferred server-side confirmation. Please contact us if you'd like to use this feature via a Github issue on stripe-android.");
        }
    }

    private final AddressDetails toAddressDetails(ConfirmPaymentIntentParams.Shipping shipping) {
        String name = shipping.getName();
        String phone = shipping.getPhone();
        Address address = shipping.getAddress();
        return new AddressDetails(name, new PaymentSheet.Address(address.getCity(), address.getCountry(), address.getLine1(), address.getLine2(), address.getPostalCode(), address.getState()), phone, null, 8, null);
    }

    /* compiled from: IntentConfirmationInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/intent/DefaultIntentConfirmationInterceptor$Companion;", "", "<init>", "()V", "PROVIDER_FETCH_TIMEOUT", "", "PROVIDER_FETCH_INTERVAL", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
