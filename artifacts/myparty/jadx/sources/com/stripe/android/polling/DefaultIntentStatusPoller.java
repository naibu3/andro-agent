package com.stripe.android.polling;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.polling.IntentStatusPoller;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: DefaultIntentStatusPoller.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0082@¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0013H\u0082@¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0013H\u0096@¢\u0006\u0002\u0010!J\b\u0010#\u001a\u00020\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/stripe/android/polling/DefaultIntentStatusPoller;", "Lcom/stripe/android/polling/IntentStatusPoller;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "paymentConfigProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/PaymentConfiguration;", "config", "Lcom/stripe/android/polling/IntentStatusPoller$Config;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/stripe/android/networking/StripeRepository;Ljavax/inject/Provider;Lcom/stripe/android/polling/IntentStatusPoller$Config;Lkotlinx/coroutines/CoroutineDispatcher;)V", "attempts", "", "pollingJob", "Lkotlinx/coroutines/Job;", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/model/StripeIntent$Status;", ServerProtocol.DIALOG_PARAM_STATE, "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "startPolling", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "performPoll", "force", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchIntentStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forcePoll", "stopPolling", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultIntentStatusPoller implements IntentStatusPoller {
    public static final int $stable = 8;
    private final MutableStateFlow<StripeIntent.Status> _state;
    private int attempts;
    private final IntentStatusPoller.Config config;
    private final CoroutineDispatcher dispatcher;
    private final Provider<PaymentConfiguration> paymentConfigProvider;
    private Job pollingJob;
    private final StateFlow<StripeIntent.Status> state;
    private final StripeRepository stripeRepository;

    /* compiled from: DefaultIntentStatusPoller.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.polling.DefaultIntentStatusPoller", f = "DefaultIntentStatusPoller.kt", i = {}, l = {57}, m = "fetchIntentStatus", n = {}, s = {})
    /* renamed from: com.stripe.android.polling.DefaultIntentStatusPoller$fetchIntentStatus$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultIntentStatusPoller.this.fetchIntentStatus(this);
        }
    }

    /* compiled from: DefaultIntentStatusPoller.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.polling.DefaultIntentStatusPoller", f = "DefaultIntentStatusPoller.kt", i = {0, 1}, l = {45, ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, 50}, m = "performPoll", n = {"this", "this"}, s = {"L$0", "L$0"})
    /* renamed from: com.stripe.android.polling.DefaultIntentStatusPoller$performPoll$1, reason: invalid class name and case insensitive filesystem */
    static final class C11561 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C11561(Continuation<? super C11561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultIntentStatusPoller.this.performPoll(false, this);
        }
    }

    @Inject
    public DefaultIntentStatusPoller(StripeRepository stripeRepository, Provider<PaymentConfiguration> paymentConfigProvider, IntentStatusPoller.Config config, CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(paymentConfigProvider, "paymentConfigProvider");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.stripeRepository = stripeRepository;
        this.paymentConfigProvider = paymentConfigProvider;
        this.config = config;
        this.dispatcher = dispatcher;
        MutableStateFlow<StripeIntent.Status> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._state = MutableStateFlow;
        this.state = MutableStateFlow;
    }

    @Override // com.stripe.android.polling.IntentStatusPoller
    public StateFlow<StripeIntent.Status> getState() {
        return this.state;
    }

    /* compiled from: DefaultIntentStatusPoller.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.polling.DefaultIntentStatusPoller$startPolling$1", f = "DefaultIntentStatusPoller.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.polling.DefaultIntentStatusPoller$startPolling$1, reason: invalid class name and case insensitive filesystem */
    static final class C11571 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C11571(Continuation<? super C11571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultIntentStatusPoller.this.new C11571(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DefaultIntentStatusPoller.performPoll$default(DefaultIntentStatusPoller.this, false, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.stripe.android.polling.IntentStatusPoller
    public void startPolling(CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.pollingJob = BuildersKt__Builders_commonKt.launch$default(scope, this.dispatcher, null, new C11571(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009c, code lost:
    
        if (performPoll$default(r8, false, r0, 1, null) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performPoll(boolean z, Continuation<? super Unit> continuation) {
        C11561 c11561;
        MutableStateFlow mutableStateFlow;
        DefaultIntentStatusPoller defaultIntentStatusPoller;
        DefaultIntentStatusPoller defaultIntentStatusPoller2;
        if (continuation instanceof C11561) {
            c11561 = (C11561) continuation;
            if ((c11561.label & Integer.MIN_VALUE) != 0) {
                c11561.label -= Integer.MIN_VALUE;
            } else {
                c11561 = new C11561(continuation);
            }
        }
        Object objFetchIntentStatus = c11561.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c11561.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objFetchIntentStatus);
            if (z || this.attempts < this.config.getMaxAttempts()) {
                this.attempts++;
                mutableStateFlow = this._state;
                c11561.L$0 = this;
                c11561.L$1 = mutableStateFlow;
                c11561.label = 1;
                objFetchIntentStatus = fetchIntentStatus(c11561);
                if (objFetchIntentStatus != coroutine_suspended) {
                    defaultIntentStatusPoller = this;
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (i == 1) {
            mutableStateFlow = (MutableStateFlow) c11561.L$1;
            defaultIntentStatusPoller = (DefaultIntentStatusPoller) c11561.L$0;
            ResultKt.throwOnFailure(objFetchIntentStatus);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFetchIntentStatus);
                return Unit.INSTANCE;
            }
            defaultIntentStatusPoller2 = (DefaultIntentStatusPoller) c11561.L$0;
            ResultKt.throwOnFailure(objFetchIntentStatus);
            c11561.L$0 = null;
            c11561.label = 3;
        }
        mutableStateFlow.setValue(objFetchIntentStatus);
        if (defaultIntentStatusPoller.attempts < defaultIntentStatusPoller.config.getMaxAttempts()) {
            long jCalculateDelay = DefaultIntentStatusPollerKt.calculateDelay(defaultIntentStatusPoller.attempts);
            c11561.L$0 = defaultIntentStatusPoller;
            c11561.L$1 = null;
            c11561.label = 2;
            if (DelayKt.m10627delayVtjQ1oo(jCalculateDelay, c11561) != coroutine_suspended) {
                defaultIntentStatusPoller2 = defaultIntentStatusPoller;
                c11561.L$0 = null;
                c11561.label = 3;
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object performPoll$default(DefaultIntentStatusPoller defaultIntentStatusPoller, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return defaultIntentStatusPoller.performPoll(z, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchIntentStatus(Continuation<? super StripeIntent.Status> continuation) {
        AnonymousClass1 anonymousClass1;
        Object objM8068retrievePaymentIntentBWLJW6A$default;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        AnonymousClass1 anonymousClass12 = anonymousClass1;
        Object obj = anonymousClass12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final PaymentConfiguration paymentConfiguration = this.paymentConfigProvider.get();
            StripeRepository stripeRepository = this.stripeRepository;
            String clientSecret = this.config.getClientSecret();
            ApiRequest.Options options = new ApiRequest.Options(new Function0() { // from class: com.stripe.android.polling.DefaultIntentStatusPoller$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return paymentConfiguration.getPublishableKey();
                }
            }, new Function0() { // from class: com.stripe.android.polling.DefaultIntentStatusPoller$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return paymentConfiguration.getStripeAccountId();
                }
            });
            anonymousClass12.label = 1;
            objM8068retrievePaymentIntentBWLJW6A$default = StripeRepository.DefaultImpls.m8068retrievePaymentIntentBWLJW6A$default(stripeRepository, clientSecret, options, null, anonymousClass12, 4, null);
            if (objM8068retrievePaymentIntentBWLJW6A$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM8068retrievePaymentIntentBWLJW6A$default = ((Result) obj).getValue();
        }
        if (Result.m9124isFailureimpl(objM8068retrievePaymentIntentBWLJW6A$default)) {
            objM8068retrievePaymentIntentBWLJW6A$default = null;
        }
        PaymentIntent paymentIntent = (PaymentIntent) objM8068retrievePaymentIntentBWLJW6A$default;
        if (paymentIntent != null) {
            return paymentIntent.getStatus();
        }
        return null;
    }

    @Override // com.stripe.android.polling.IntentStatusPoller
    public Object forcePoll(Continuation<? super StripeIntent.Status> continuation) {
        return fetchIntentStatus(continuation);
    }

    @Override // com.stripe.android.polling.IntentStatusPoller
    public void stopPolling() {
        Job job = this.pollingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.pollingJob = null;
    }
}
