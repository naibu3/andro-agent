package com.stripe.android.payments.core.authentication.threeds2;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.stripe.android.StripePaymentController;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.model.Stripe3ds2Fingerprint;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.authentication.threeds2.NextStep;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2Service;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.InitChallengeArgs;
import com.stripe.android.stripe3ds2.transaction.InitChallengeRepository;
import com.stripe.android.stripe3ds2.transaction.InitChallengeResult;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import com.stripe.android.stripe3ds2.transaction.Transaction;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* compiled from: Stripe3ds2TransactionViewModel.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 M2\u00020\u0001:\u0001MBe\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0086@¢\u0006\u0002\u0010'J\u000e\u0010(\u001a\u00020)H\u0086@¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020-H\u0082@¢\u0006\u0002\u0010.J6\u0010/\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00102\u001a\u0002032\u0006\u0010,\u001a\u00020-2\u0006\u00104\u001a\u00020 2\u0006\u00105\u001a\u000206H\u0082@¢\u0006\u0004\b7\u00108J0\u00109\u001a\u00020)2\u0006\u0010:\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u0010;\u001a\u00020<2\u0006\u00105\u001a\u000206H\u0081@¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020)2\u0006\u0010@\u001a\u00020<H\u0002J\b\u0010A\u001a\u00020)H\u0002J\u0016\u0010B\u001a\u00020C2\u0006\u0010\u0002\u001a\u00020DH\u0086@¢\u0006\u0002\u0010EJ0\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u00102\u001a\u0002032\u0006\u0010;\u001a\u00020<2\u0006\u0010J\u001a\u000206H\u0081@¢\u0006\u0004\bK\u0010LR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006N"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel;", "Landroidx/lifecycle/ViewModel;", CardScanActivity.ARGS, "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "threeDs2Service", "Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2Service;", "messageVersionRegistry", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "challengeResultProcessor", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2ChallengeResultProcessor;", "initChallengeRepository", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", NamedConstantsKt.IS_INSTANT_APP, "", "<init>", "(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2Service;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2ChallengeResultProcessor;Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/SavedStateHandle;Z)V", "hasCompleted", "getHasCompleted", "()Z", "setHasCompleted", "(Z)V", "threeDS2RequestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "getThreeDS2RequestOptions", "()Lcom/stripe/android/core/networking/ApiRequest$Options;", "processChallengeResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "challengeResult", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start3ds2Flow", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "begin3ds2Auth", "stripe3ds2Fingerprint", "Lcom/stripe/android/model/Stripe3ds2Fingerprint;", "(Lcom/stripe/android/model/Stripe3ds2Fingerprint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "perform3ds2AuthenticationRequest", "Lkotlin/Result;", "Lcom/stripe/android/model/Stripe3ds2AuthResult;", "transaction", "Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "requestOptions", "timeout", "", "perform3ds2AuthenticationRequest-yxL6bBk", "(Lcom/stripe/android/stripe3ds2/transaction/Transaction;Lcom/stripe/android/model/Stripe3ds2Fingerprint;Lcom/stripe/android/core/networking/ApiRequest$Options;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "on3ds2AuthSuccess", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "sourceId", "", "on3ds2AuthSuccess$payments_core_release", "(Lcom/stripe/android/model/Stripe3ds2AuthResult;Lcom/stripe/android/stripe3ds2/transaction/Transaction;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "on3ds2AuthFallback", "fallbackRedirectUrl", "startFrictionlessFlow", "initChallenge", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;", "(Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startChallengeFlow", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartChallenge;", "ares", "Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", "maxTimeout", "startChallengeFlow$payments_core_release", "(Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;Lcom/stripe/android/stripe3ds2/transaction/Transaction;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Stripe3ds2TransactionViewModel extends ViewModel {
    private static final String KEY_HAS_COMPLETED = "key_next_step";
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final Stripe3ds2TransactionContract.Args args;
    private final Stripe3ds2ChallengeResultProcessor challengeResultProcessor;
    private boolean hasCompleted;
    private final InitChallengeRepository initChallengeRepository;
    private final boolean isInstantApp;
    private final MessageVersionRegistry messageVersionRegistry;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final SavedStateHandle savedStateHandle;
    private final StripeRepository stripeRepository;
    private final ApiRequest.Options threeDS2RequestOptions;
    private final StripeThreeDs2Service threeDs2Service;
    private final CoroutineContext workContext;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: Stripe3ds2TransactionViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel", f = "Stripe3ds2TransactionViewModel.kt", i = {0, 0, 0, 0}, l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, 115}, m = "begin3ds2Auth", n = {"this", "stripe3ds2Fingerprint", "transaction", "timeout"}, s = {"L$0", "L$1", "L$2", "I$0"})
    /* renamed from: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel$begin3ds2Auth$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Stripe3ds2TransactionViewModel.this.begin3ds2Auth(null, this);
        }
    }

    /* compiled from: Stripe3ds2TransactionViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel", f = "Stripe3ds2TransactionViewModel.kt", i = {0}, l = {73}, m = "start3ds2Flow", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel$start3ds2Flow$1, reason: invalid class name and case insensitive filesystem */
    static final class C10961 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10961(Continuation<? super C10961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Stripe3ds2TransactionViewModel.this.start3ds2Flow(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Stripe3ds2TransactionViewModel(Stripe3ds2TransactionContract.Args args, StripeRepository stripeRepository, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, StripeThreeDs2Service threeDs2Service, MessageVersionRegistry messageVersionRegistry, Stripe3ds2ChallengeResultProcessor challengeResultProcessor, InitChallengeRepository initChallengeRepository, @IOContext CoroutineContext workContext, SavedStateHandle savedStateHandle, @Named(NamedConstantsKt.IS_INSTANT_APP) boolean z) {
        ApiRequest.Options requestOptions;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(threeDs2Service, "threeDs2Service");
        Intrinsics.checkNotNullParameter(messageVersionRegistry, "messageVersionRegistry");
        Intrinsics.checkNotNullParameter(challengeResultProcessor, "challengeResultProcessor");
        Intrinsics.checkNotNullParameter(initChallengeRepository, "initChallengeRepository");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.args = args;
        this.stripeRepository = stripeRepository;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.threeDs2Service = threeDs2Service;
        this.messageVersionRegistry = messageVersionRegistry;
        this.challengeResultProcessor = challengeResultProcessor;
        this.initChallengeRepository = initChallengeRepository;
        this.workContext = workContext;
        this.savedStateHandle = savedStateHandle;
        this.isInstantApp = z;
        this.hasCompleted = savedStateHandle.contains(KEY_HAS_COMPLETED);
        String publishableKey = args.getNextActionData().getPublishableKey();
        if (publishableKey == null) {
            requestOptions = args.getRequestOptions();
        } else {
            String str = publishableKey.length() <= 0 ? null : publishableKey;
            if (str != null) {
                requestOptions = new ApiRequest.Options(str, null, null, 6, null);
            }
        }
        this.threeDS2RequestOptions = requestOptions;
    }

    public final boolean getHasCompleted() {
        return this.hasCompleted;
    }

    public final void setHasCompleted(boolean z) {
        this.hasCompleted = z;
    }

    public final ApiRequest.Options getThreeDS2RequestOptions() {
        return this.threeDS2RequestOptions;
    }

    public final Object processChallengeResult(ChallengeResult challengeResult, Continuation<? super PaymentFlowResult.Unvalidated> continuation) {
        return this.challengeResultProcessor.process(challengeResult, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object start3ds2Flow(Continuation<? super NextStep> continuation) {
        C10961 c10961;
        Throwable th;
        Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel;
        NextStep.Complete completeM9118constructorimpl;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof C10961) {
            c10961 = (C10961) continuation;
            if ((c10961.label & Integer.MIN_VALUE) != 0) {
                c10961.label -= Integer.MIN_VALUE;
            } else {
                c10961 = new C10961(continuation);
            }
        }
        Object objBegin3ds2Auth = c10961.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10961.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objBegin3ds2Auth);
            this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2Fingerprint, null, null, null, null, null, 62, null));
            try {
                Result.Companion companion = Result.INSTANCE;
                Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel2 = this;
                Stripe3ds2Fingerprint stripe3ds2Fingerprint = new Stripe3ds2Fingerprint(this.args.getNextActionData());
                c10961.L$0 = this;
                c10961.label = 1;
                objBegin3ds2Auth = begin3ds2Auth(stripe3ds2Fingerprint, c10961);
                if (objBegin3ds2Auth == coroutine_suspended) {
                    return coroutine_suspended;
                }
                stripe3ds2TransactionViewModel = this;
            } catch (Throwable th2) {
                th = th2;
                stripe3ds2TransactionViewModel = this;
                Result.Companion companion2 = Result.INSTANCE;
                completeM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(completeM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
                stripe3ds2TransactionViewModel.savedStateHandle.set(KEY_HAS_COMPLETED, Boxing.boxBoolean(true));
                stripe3ds2TransactionViewModel.hasCompleted = true;
                return completeM9118constructorimpl;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stripe3ds2TransactionViewModel = (Stripe3ds2TransactionViewModel) c10961.L$0;
            try {
                ResultKt.throwOnFailure(objBegin3ds2Auth);
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion22 = Result.INSTANCE;
                completeM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(completeM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
                stripe3ds2TransactionViewModel.savedStateHandle.set(KEY_HAS_COMPLETED, Boxing.boxBoolean(true));
                stripe3ds2TransactionViewModel.hasCompleted = true;
                return completeM9118constructorimpl;
            }
        }
        completeM9118constructorimpl = Result.m9118constructorimpl((NextStep) objBegin3ds2Auth);
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(completeM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            stripe3ds2TransactionViewModel.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(stripe3ds2TransactionViewModel.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2RequestParamsFailed, null, null, null, null, null, 62, null));
            completeM9118constructorimpl = new NextStep.Complete(new PaymentFlowResult.Unvalidated(null, 0, StripeException.INSTANCE.create(thM9121exceptionOrNullimpl), false, null, null, null, 123, null));
        }
        stripe3ds2TransactionViewModel.savedStateHandle.set(KEY_HAS_COMPLETED, Boxing.boxBoolean(true));
        stripe3ds2TransactionViewModel.hasCompleted = true;
        return completeM9118constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ed, code lost:
    
        if (r1 == r9) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object begin3ds2Auth(Stripe3ds2Fingerprint stripe3ds2Fingerprint, Continuation<? super NextStep> continuation) {
        AnonymousClass1 anonymousClass1;
        Transaction transaction;
        Object value;
        int i;
        Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel;
        Stripe3ds2Fingerprint stripe3ds2Fingerprint2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        AnonymousClass1 anonymousClass12 = anonymousClass1;
        Object objOn3ds2AuthSuccess$payments_core_release = anonymousClass12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass12.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOn3ds2AuthSuccess$payments_core_release);
            Transaction transactionCreateTransaction = this.threeDs2Service.createTransaction(this.args.getSdkTransactionId(), stripe3ds2Fingerprint.getDirectoryServerEncryption().getDirectoryServerId(), this.messageVersionRegistry.getCurrent(), this.args.getStripeIntent().isLiveMode(), stripe3ds2Fingerprint.getDirectoryServerName(), stripe3ds2Fingerprint.getDirectoryServerEncryption().getRootCerts(), stripe3ds2Fingerprint.getDirectoryServerEncryption().getDirectoryServerPublicKey(), stripe3ds2Fingerprint.getDirectoryServerEncryption().getKeyId(), this.args.getConfig().getUiCustomization$payments_core_release().getUiCustomization());
            int timeout$payments_core_release = this.args.getConfig().getTimeout$payments_core_release();
            ApiRequest.Options options = this.threeDS2RequestOptions;
            anonymousClass12.L$0 = this;
            anonymousClass12.L$1 = stripe3ds2Fingerprint;
            anonymousClass12.L$2 = transactionCreateTransaction;
            anonymousClass12.I$0 = timeout$payments_core_release;
            anonymousClass12.label = 1;
            Object objM8175perform3ds2AuthenticationRequestyxL6bBk = m8175perform3ds2AuthenticationRequestyxL6bBk(transactionCreateTransaction, stripe3ds2Fingerprint, options, timeout$payments_core_release, anonymousClass12);
            if (objM8175perform3ds2AuthenticationRequestyxL6bBk != coroutine_suspended) {
                transaction = transactionCreateTransaction;
                value = objM8175perform3ds2AuthenticationRequestyxL6bBk;
                i = timeout$payments_core_release;
                stripe3ds2TransactionViewModel = this;
                stripe3ds2Fingerprint2 = stripe3ds2Fingerprint;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOn3ds2AuthSuccess$payments_core_release);
            return (NextStep) objOn3ds2AuthSuccess$payments_core_release;
        }
        int i3 = anonymousClass12.I$0;
        Transaction transaction2 = (Transaction) anonymousClass12.L$2;
        stripe3ds2Fingerprint2 = (Stripe3ds2Fingerprint) anonymousClass12.L$1;
        Stripe3ds2TransactionViewModel stripe3ds2TransactionViewModel2 = (Stripe3ds2TransactionViewModel) anonymousClass12.L$0;
        ResultKt.throwOnFailure(objOn3ds2AuthSuccess$payments_core_release);
        value = ((Result) objOn3ds2AuthSuccess$payments_core_release).getValue();
        transaction = transaction2;
        stripe3ds2TransactionViewModel = stripe3ds2TransactionViewModel2;
        i = i3;
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(value);
        if (thM9121exceptionOrNullimpl == null) {
            String source = stripe3ds2Fingerprint2.getSource();
            anonymousClass12.L$0 = null;
            anonymousClass12.L$1 = null;
            anonymousClass12.L$2 = null;
            anonymousClass12.label = 2;
            objOn3ds2AuthSuccess$payments_core_release = stripe3ds2TransactionViewModel.on3ds2AuthSuccess$payments_core_release((Stripe3ds2AuthResult) value, transaction, source, i, anonymousClass12);
        } else {
            return new NextStep.Complete(new PaymentFlowResult.Unvalidated(null, 0, StripeException.INSTANCE.create(thM9121exceptionOrNullimpl), false, null, null, null, 123, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: perform3ds2AuthenticationRequest-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8175perform3ds2AuthenticationRequestyxL6bBk(Transaction transaction, Stripe3ds2Fingerprint stripe3ds2Fingerprint, ApiRequest.Options options, int i, Continuation<? super Result<Stripe3ds2AuthResult>> continuation) {
        Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1 stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1;
        if (continuation instanceof Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1) {
            stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1 = (Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1) continuation;
            if ((stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1.label & Integer.MIN_VALUE) != 0) {
                stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1.label -= Integer.MIN_VALUE;
            } else {
                stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1 = new Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1(this, continuation);
            }
        }
        Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1 stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$12 = stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$1;
        Object objWithContext = stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$12.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$2 stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$2 = new Stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$2(transaction, stripe3ds2Fingerprint, i, this, options, null);
            stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$2, stripe3ds2TransactionViewModel$perform3ds2AuthenticationRequest$12);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    public final Object on3ds2AuthSuccess$payments_core_release(Stripe3ds2AuthResult stripe3ds2AuthResult, Transaction transaction, String str, int i, Continuation<? super NextStep> continuation) {
        String strJoinToString$default;
        Stripe3ds2AuthResult.Ares ares = stripe3ds2AuthResult.getAres();
        if (ares != null) {
            if (ares.isChallenge()) {
                Object objStartChallengeFlow$payments_core_release = startChallengeFlow$payments_core_release(ares, transaction, str, i, continuation);
                return objStartChallengeFlow$payments_core_release == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objStartChallengeFlow$payments_core_release : (NextStep) objStartChallengeFlow$payments_core_release;
            }
            return startFrictionlessFlow();
        }
        if (stripe3ds2AuthResult.getFallbackRedirectUrl() != null) {
            return on3ds2AuthFallback(stripe3ds2AuthResult.getFallbackRedirectUrl());
        }
        Stripe3ds2AuthResult.ThreeDS2Error error = stripe3ds2AuthResult.getError();
        if (error == null || (strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{"Code: " + error.getErrorCode(), "Detail: " + error.getErrorDetail(), "Description: " + error.getErrorDescription(), "Component: " + error.getErrorComponent()}), ", ", null, null, 0, null, null, 62, null)) == null) {
            strJoinToString$default = "Invalid 3DS2 authentication response";
        }
        return new NextStep.Complete(new PaymentFlowResult.Unvalidated(null, 0, StripeException.INSTANCE.create(new RuntimeException("Error encountered during 3DS2 authentication request. " + strJoinToString$default)), false, null, null, null, 123, null));
    }

    private final NextStep on3ds2AuthFallback(String fallbackRedirectUrl) {
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2Fallback, null, null, null, null, null, 62, null));
        String id = this.args.getStripeIntent().getId();
        if (id == null) {
            id = "";
        }
        int requestCode$payments_core_release = StripePaymentController.INSTANCE.getRequestCode$payments_core_release(this.args.getStripeIntent());
        String clientSecret = this.args.getStripeIntent().getClientSecret();
        return new NextStep.StartFallback(new PaymentBrowserAuthContract.Args(id, requestCode$payments_core_release, clientSecret != null ? clientSecret : "", fallbackRedirectUrl, null, this.args.getEnableLogging(), null, this.args.getRequestOptions().getStripeAccount(), true, false, this.args.getStatusBarColor(), this.threeDS2RequestOptions.getApiKey(), this.isInstantApp, null, false, 25152, null));
    }

    private final NextStep startFrictionlessFlow() {
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds2Frictionless, null, null, null, null, null, 62, null));
        return new NextStep.Complete(new PaymentFlowResult.Unvalidated(this.args.getStripeIntent().getClientSecret(), 0, null, false, null, null, this.args.getRequestOptions().getStripeAccount(), 62, null));
    }

    public final Object initChallenge(InitChallengeArgs initChallengeArgs, Continuation<? super InitChallengeResult> continuation) {
        return this.initChallengeRepository.startChallenge(initChallengeArgs, continuation);
    }

    public final Object startChallengeFlow$payments_core_release(Stripe3ds2AuthResult.Ares ares, Transaction transaction, String str, int i, Continuation<? super NextStep.StartChallenge> continuation) {
        return BuildersKt.withContext(this.workContext, new Stripe3ds2TransactionViewModel$startChallengeFlow$2(ares, transaction, i, this, str, null), continuation);
    }

    /* compiled from: Stripe3ds2TransactionViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$Companion;", "", "<init>", "()V", "KEY_HAS_COMPLETED", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
