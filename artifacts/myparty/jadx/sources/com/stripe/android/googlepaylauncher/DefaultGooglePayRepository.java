package com.stripe.android.googlepaylauncher;

import android.content.Context;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.DefaultCardBrandFilter;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: GooglePayRepository.kt */
@Singleton
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014B1\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0017J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0!H\u0016J\u000e\u0010\"\u001a\u00020\tH\u0082@¢\u0006\u0002\u0010#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "context", "Landroid/content/Context;", "environment", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "billingAddressParameters", "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;", "existingPaymentMethodRequired", "", "allowCreditCards", "paymentsClientFactory", "Lcom/stripe/android/googlepaylauncher/PaymentsClientFactory;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "logger", "Lcom/stripe/android/core/Logger;", "cardBrandFilter", "Lcom/stripe/android/CardBrandFilter;", "<init>", "(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZZLcom/stripe/android/googlepaylauncher/PaymentsClientFactory;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/core/Logger;Lcom/stripe/android/CardBrandFilter;)V", "googlePayConfig", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/core/Logger;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/CardBrandFilter;)V", "googlePayJsonFactory", "Lcom/stripe/android/GooglePayJsonFactory;", "googlePayAvailabilityClient", "Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;", "getGooglePayAvailabilityClient", "()Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient;", "googlePayAvailabilityClient$delegate", "Lkotlin/Lazy;", "isReady", "Lkotlinx/coroutines/flow/Flow;", "isReadyAsync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultGooglePayRepository implements GooglePayRepository {
    public static final int $stable = 8;
    private final boolean allowCreditCards;
    private final GooglePayJsonFactory.BillingAddressParameters billingAddressParameters;
    private final CardBrandFilter cardBrandFilter;
    private final Context context;
    private final GooglePayEnvironment environment;
    private final ErrorReporter errorReporter;
    private final boolean existingPaymentMethodRequired;

    /* renamed from: googlePayAvailabilityClient$delegate, reason: from kotlin metadata */
    private final Lazy googlePayAvailabilityClient;
    private final GooglePayJsonFactory googlePayJsonFactory;
    private final Logger logger;
    private final PaymentsClientFactory paymentsClientFactory;

    /* compiled from: GooglePayRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.googlepaylauncher.DefaultGooglePayRepository", f = "GooglePayRepository.kt", i = {0}, l = {114}, m = "isReadyAsync", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.googlepaylauncher.DefaultGooglePayRepository$isReadyAsync$1, reason: invalid class name and case insensitive filesystem */
    static final class C10191 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10191(Continuation<? super C10191> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultGooglePayRepository.this.isReadyAsync(this);
        }
    }

    public DefaultGooglePayRepository(Context context, GooglePayEnvironment environment, GooglePayJsonFactory.BillingAddressParameters billingAddressParameters, boolean z, boolean z2, PaymentsClientFactory paymentsClientFactory, ErrorReporter errorReporter, Logger logger, CardBrandFilter cardBrandFilter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(billingAddressParameters, "billingAddressParameters");
        Intrinsics.checkNotNullParameter(paymentsClientFactory, "paymentsClientFactory");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        this.context = context;
        this.environment = environment;
        this.billingAddressParameters = billingAddressParameters;
        this.existingPaymentMethodRequired = z;
        this.allowCreditCards = z2;
        this.paymentsClientFactory = paymentsClientFactory;
        this.errorReporter = errorReporter;
        this.logger = logger;
        this.cardBrandFilter = cardBrandFilter;
        this.googlePayJsonFactory = new GooglePayJsonFactory(context, false, cardBrandFilter, 2, (DefaultConstructorMarker) null);
        this.googlePayAvailabilityClient = LazyKt.lazy(new Function0() { // from class: com.stripe.android.googlepaylauncher.DefaultGooglePayRepository$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DefaultGooglePayRepository.googlePayAvailabilityClient_delegate$lambda$0(this.f$0);
            }
        });
    }

    public /* synthetic */ DefaultGooglePayRepository(Context context, GooglePayEnvironment googlePayEnvironment, GooglePayJsonFactory.BillingAddressParameters billingAddressParameters, boolean z, boolean z2, PaymentsClientFactory paymentsClientFactory, ErrorReporter errorReporter, Logger logger, CardBrandFilter cardBrandFilter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, googlePayEnvironment, billingAddressParameters, z, z2, (i & 32) != 0 ? new DefaultPaymentsClientFactory(context) : paymentsClientFactory, errorReporter, (i & 128) != 0 ? Logger.INSTANCE.noop() : logger, (i & 256) != 0 ? DefaultCardBrandFilter.INSTANCE : cardBrandFilter);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    public DefaultGooglePayRepository(Context context, GooglePayPaymentMethodLauncher.Config googlePayConfig, Logger logger, ErrorReporter errorReporter, CardBrandFilter cardBrandFilter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(googlePayConfig, "googlePayConfig");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this(applicationContext, googlePayConfig.getEnvironment(), ConvertKt.convert(googlePayConfig.getBillingAddressConfig()), googlePayConfig.getExistingPaymentMethodRequired(), googlePayConfig.getAllowCreditCards(), new DefaultPaymentsClientFactory(context), errorReporter, logger, cardBrandFilter);
    }

    private final GooglePayAvailabilityClient getGooglePayAvailabilityClient() {
        return (GooglePayAvailabilityClient) this.googlePayAvailabilityClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GooglePayAvailabilityClient googlePayAvailabilityClient_delegate$lambda$0(DefaultGooglePayRepository defaultGooglePayRepository) {
        return GooglePayRepository.INSTANCE.getGooglePayAvailabilityClientFactory().create(defaultGooglePayRepository.paymentsClientFactory.create(defaultGooglePayRepository.environment));
    }

    /* compiled from: GooglePayRepository.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.googlepaylauncher.DefaultGooglePayRepository$isReady$1", f = "GooglePayRepository.kt", i = {}, l = {90, 90}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.googlepaylauncher.DefaultGooglePayRepository$isReady$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = DefaultGooglePayRepository.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = DefaultGooglePayRepository.this.isReadyAsync(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = null;
            this.label = 2;
        }
    }

    @Override // com.stripe.android.googlepaylauncher.GooglePayRepository
    public Flow<Boolean> isReady() {
        return FlowKt.flow(new AnonymousClass1(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isReadyAsync(Continuation<? super Boolean> continuation) {
        C10191 c10191;
        Object objM9118constructorimpl;
        DefaultGooglePayRepository defaultGooglePayRepository;
        Object objM9118constructorimpl2;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof C10191) {
            c10191 = (C10191) continuation;
            if ((c10191.label & Integer.MIN_VALUE) != 0) {
                c10191.label -= Integer.MIN_VALUE;
            } else {
                c10191 = new C10191(continuation);
            }
        }
        C10191 c101912 = c10191;
        Object objIsReady = c101912.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c101912.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objIsReady);
            try {
                Result.Companion companion = Result.INSTANCE;
                DefaultGooglePayRepository defaultGooglePayRepository2 = this;
                objM9118constructorimpl = Result.m9118constructorimpl(IsReadyToPayRequest.fromJson(this.googlePayJsonFactory.createIsReadyToPayRequest(this.billingAddressParameters, Boxing.boxBoolean(this.existingPaymentMethodRequired), Boxing.boxBoolean(this.allowCreditCards)).toString()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM9121exceptionOrNullimpl2 = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl2 != null) {
                ErrorReporter.DefaultImpls.report$default(this.errorReporter, ErrorReporter.UnexpectedErrorEvent.GOOGLE_PAY_JSON_REQUEST_PARSING, StripeException.INSTANCE.create(thM9121exceptionOrNullimpl2), null, 4, null);
                this.logger.error("Google Pay json parsing failed.", thM9121exceptionOrNullimpl2);
                return Boxing.boxBoolean(false);
            }
            Intrinsics.checkNotNullExpressionValue(objM9118constructorimpl, "getOrElse(...)");
            IsReadyToPayRequest isReadyToPayRequest = (IsReadyToPayRequest) objM9118constructorimpl;
            try {
                Result.Companion companion3 = Result.INSTANCE;
                DefaultGooglePayRepository defaultGooglePayRepository3 = this;
                GooglePayAvailabilityClient googlePayAvailabilityClient = getGooglePayAvailabilityClient();
                c101912.L$0 = this;
                c101912.label = 1;
                objIsReady = googlePayAvailabilityClient.isReady(isReadyToPayRequest, c101912);
                if (objIsReady == coroutine_suspended) {
                    return coroutine_suspended;
                }
                defaultGooglePayRepository = this;
            } catch (Throwable th2) {
                th = th2;
                defaultGooglePayRepository = this;
                Result.Companion companion4 = Result.INSTANCE;
                objM9118constructorimpl2 = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl2);
                if (thM9121exceptionOrNullimpl != null) {
                }
                Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                if (Result.m9124isFailureimpl(objM9118constructorimpl2)) {
                }
                boolean zBooleanValue = ((Boolean) objM9118constructorimpl2).booleanValue();
                defaultGooglePayRepository.logger.info("Google Pay ready? " + zBooleanValue);
                return Boxing.boxBoolean(zBooleanValue);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defaultGooglePayRepository = (DefaultGooglePayRepository) c101912.L$0;
            try {
                ResultKt.throwOnFailure(objIsReady);
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion42 = Result.INSTANCE;
                objM9118constructorimpl2 = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl2);
                if (thM9121exceptionOrNullimpl != null) {
                }
                Boolean boolBoxBoolean2 = Boxing.boxBoolean(false);
                if (Result.m9124isFailureimpl(objM9118constructorimpl2)) {
                }
                boolean zBooleanValue2 = ((Boolean) objM9118constructorimpl2).booleanValue();
                defaultGooglePayRepository.logger.info("Google Pay ready? " + zBooleanValue2);
                return Boxing.boxBoolean(zBooleanValue2);
            }
        }
        objM9118constructorimpl2 = Result.m9118constructorimpl(Boxing.boxBoolean(((Boolean) objIsReady).booleanValue()));
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl2);
        if (thM9121exceptionOrNullimpl != null) {
            ErrorReporter.DefaultImpls.report$default(defaultGooglePayRepository.errorReporter, ErrorReporter.ExpectedErrorEvent.GOOGLE_PAY_IS_READY_API_CALL, StripeException.INSTANCE.create(thM9121exceptionOrNullimpl), null, 4, null);
            defaultGooglePayRepository.logger.error("Google Pay check failed.", thM9121exceptionOrNullimpl);
        }
        Boolean boolBoxBoolean22 = Boxing.boxBoolean(false);
        if (Result.m9124isFailureimpl(objM9118constructorimpl2)) {
            objM9118constructorimpl2 = boolBoxBoolean22;
        }
        boolean zBooleanValue22 = ((Boolean) objM9118constructorimpl2).booleanValue();
        defaultGooglePayRepository.logger.info("Google Pay ready? " + zBooleanValue22);
        return Boxing.boxBoolean(zBooleanValue22);
    }
}
