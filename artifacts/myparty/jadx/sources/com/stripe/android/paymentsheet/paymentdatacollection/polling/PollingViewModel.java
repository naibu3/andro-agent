package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.utils.CreationExtrasKtxKt;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.di.DaggerPollingComponent;
import com.stripe.android.polling.IntentStatusPoller;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import javax.inject.Inject;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: PollingViewModel.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002&'B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0013\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0014J\u0006\u0010\u001c\u001a\u00020\u0014J\u0006\u0010\u001d\u001a\u00020\u0014J\u0018\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b \u0010!J\u000e\u0010\"\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\u0015J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006("}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;", "Landroidx/lifecycle/ViewModel;", CardScanActivity.ARGS, "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;", "poller", "Lcom/stripe/android/polling/IntentStatusPoller;", "timeProvider", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;Lcom/stripe/android/polling/IntentStatusPoller;Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;Landroidx/lifecycle/SavedStateHandle;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "handleTimeLimitReached", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performOneOffPoll", "computeTimeRemaining", "Lkotlin/time/Duration;", "computeTimeRemaining-UwyO8pc", "()J", "pausePolling", "resumePolling", "handleCancel", "observeCountdown", "timeLimit", "observeCountdown-VtjQ1oo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observePollingResults", "updatePollingState", "pollingState", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;", "Factory", "Args", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PollingViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<PollingUiState> _uiState;
    private final Args args;
    private final IntentStatusPoller poller;
    private final SavedStateHandle savedStateHandle;
    private final TimeProvider timeProvider;
    private final StateFlow<PollingUiState> uiState;

    /* compiled from: PollingViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel", f = "PollingViewModel.kt", i = {0}, l = {119, 120}, m = "handleTimeLimitReached", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$handleTimeLimitReached$1, reason: invalid class name and case insensitive filesystem */
    static final class C11321 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C11321(Continuation<? super C11321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PollingViewModel.this.handleTimeLimitReached(this);
        }
    }

    /* compiled from: PollingViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel", f = "PollingViewModel.kt", i = {0}, l = {124}, m = "performOneOffPoll", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$performOneOffPoll$1, reason: invalid class name and case insensitive filesystem */
    static final class C11351 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C11351(Continuation<? super C11351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PollingViewModel.this.performOneOffPoll(this);
        }
    }

    @Inject
    public PollingViewModel(Args args, IntentStatusPoller poller, TimeProvider timeProvider, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(poller, "poller");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.args = args;
        this.poller = poller;
        this.timeProvider = timeProvider;
        this.savedStateHandle = savedStateHandle;
        MutableStateFlow<PollingUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(new PollingUiState(args.m8405getTimeLimitUwyO8pc(), args.getCtaText(), null, 4, null));
        this._uiState = MutableStateFlow;
        this.uiState = MutableStateFlow;
        long jM8398computeTimeRemainingUwyO8pc = m8398computeTimeRemainingUwyO8pc();
        PollingViewModel pollingViewModel = this;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(pollingViewModel), null, null, new AnonymousClass1(jM8398computeTimeRemainingUwyO8pc, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(pollingViewModel), null, null, new AnonymousClass2(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(pollingViewModel), null, null, new AnonymousClass3(jM8398computeTimeRemainingUwyO8pc, this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(pollingViewModel), null, null, new AnonymousClass4(null), 3, null);
    }

    public final StateFlow<PollingUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: PollingViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$1", f = "PollingViewModel.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $timeRemaining;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$timeRemaining = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PollingViewModel.this.new AnonymousClass1(this.$timeRemaining, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (PollingViewModel.this.m8399observeCountdownVtjQ1oo(this.$timeRemaining, this) == coroutine_suspended) {
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

    /* compiled from: PollingViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$2", f = "PollingViewModel.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PollingViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (PollingViewModel.this.observePollingResults(this) == coroutine_suspended) {
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

    /* compiled from: PollingViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$3", f = "PollingViewModel.kt", i = {}, l = {107, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $timeRemaining;
        int label;
        final /* synthetic */ PollingViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(long j, PollingViewModel pollingViewModel, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$timeRemaining = j;
            this.this$0 = pollingViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$timeRemaining, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        
            if (r6.this$0.handleTimeLimitReached(r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.m10627delayVtjQ1oo(this.$timeRemaining, this) != coroutine_suspended) {
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
            ResultKt.throwOnFailure(obj);
            this.label = 2;
        }
    }

    /* compiled from: PollingViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$4", f = "PollingViewModel.kt", i = {0}, l = {OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = PollingViewModel.this.new AnonymousClass4(continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                this.L$0 = coroutineScope2;
                this.label = 1;
                if (DelayKt.m10627delayVtjQ1oo(PollingViewModel.this.args.m8404getInitialDelayUwyO8pc(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            PollingViewModel.this.poller.startPolling(coroutineScope);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r2.performOneOffPoll(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleTimeLimitReached(Continuation<? super Unit> continuation) {
        C11321 c11321;
        PollingViewModel pollingViewModel;
        if (continuation instanceof C11321) {
            c11321 = (C11321) continuation;
            if ((c11321.label & Integer.MIN_VALUE) != 0) {
                c11321.label -= Integer.MIN_VALUE;
            } else {
                c11321 = new C11321(continuation);
            }
        }
        Object obj = c11321.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c11321.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.poller.stopPolling();
            Duration.Companion companion = Duration.INSTANCE;
            long duration = DurationKt.toDuration(3, DurationUnit.SECONDS);
            c11321.L$0 = this;
            c11321.label = 1;
            if (DelayKt.m10627delayVtjQ1oo(duration, c11321) != coroutine_suspended) {
                pollingViewModel = this;
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
        pollingViewModel = (PollingViewModel) c11321.L$0;
        ResultKt.throwOnFailure(obj);
        c11321.L$0 = null;
        c11321.label = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performOneOffPoll(Continuation<? super Unit> continuation) {
        C11351 c11351;
        PollingViewModel pollingViewModel;
        PollingUiState value;
        PollingUiState value2;
        if (continuation instanceof C11351) {
            c11351 = (C11351) continuation;
            if ((c11351.label & Integer.MIN_VALUE) != 0) {
                c11351.label -= Integer.MIN_VALUE;
            } else {
                c11351 = new C11351(continuation);
            }
        }
        Object objForcePoll = c11351.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c11351.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objForcePoll);
            IntentStatusPoller intentStatusPoller = this.poller;
            c11351.L$0 = this;
            c11351.label = 1;
            objForcePoll = intentStatusPoller.forcePoll(c11351);
            if (objForcePoll == coroutine_suspended) {
                return coroutine_suspended;
            }
            pollingViewModel = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pollingViewModel = (PollingViewModel) c11351.L$0;
            ResultKt.throwOnFailure(objForcePoll);
        }
        if (((StripeIntent.Status) objForcePoll) == StripeIntent.Status.Succeeded) {
            MutableStateFlow<PollingUiState> mutableStateFlow = pollingViewModel._uiState;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, PollingUiState.m8393copyKLykuaI$default(value2, 0L, 0, PollingState.Success, 3, null)));
        } else {
            MutableStateFlow<PollingUiState> mutableStateFlow2 = pollingViewModel._uiState;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, PollingUiState.m8393copyKLykuaI$default(value, 0L, 0, PollingState.Failed, 3, null)));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: computeTimeRemaining-UwyO8pc, reason: not valid java name */
    private final long m8398computeTimeRemainingUwyO8pc() {
        Long l = (Long) this.savedStateHandle.get("KEY_CURRENT_POLLING_START_TIME");
        if (l == null) {
            this.savedStateHandle.set("KEY_CURRENT_POLLING_START_TIME", Long.valueOf(this.timeProvider.currentTimeInMillis()));
        }
        if (l != null) {
            long jLongValue = (l.longValue() + Duration.m10493getInWholeMillisecondsimpl(this.args.m8405getTimeLimitUwyO8pc())) - this.timeProvider.currentTimeInMillis();
            Duration.Companion companion = Duration.INSTANCE;
            return ((Duration) ComparisonsKt.maxOf(Duration.m10480boximpl(DurationKt.toDuration(jLongValue, DurationUnit.MILLISECONDS)), Duration.m10480boximpl(Duration.INSTANCE.m10573getZEROUwyO8pc()))).getRawValue();
        }
        return this.args.m8405getTimeLimitUwyO8pc();
    }

    public final void pausePolling() {
        this.poller.stopPolling();
    }

    /* compiled from: PollingViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$resumePolling$1", f = "PollingViewModel.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$resumePolling$1, reason: invalid class name and case insensitive filesystem */
    static final class C11361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C11361(Continuation<? super C11361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PollingViewModel.this.new C11361(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.m10627delayVtjQ1oo(PollingViewModel.this.args.m8404getInitialDelayUwyO8pc(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            PollingViewModel.this.poller.startPolling(ViewModelKt.getViewModelScope(PollingViewModel.this));
            return Unit.INSTANCE;
        }
    }

    public final void resumePolling() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C11361(null), 3, null);
    }

    public final void handleCancel() {
        PollingUiState value;
        MutableStateFlow<PollingUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, PollingUiState.m8393copyKLykuaI$default(value, 0L, 0, PollingState.Canceled, 3, null)));
        this.poller.stopPolling();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeCountdown-VtjQ1oo, reason: not valid java name */
    public final Object m8399observeCountdownVtjQ1oo(long j, Continuation<? super Unit> continuation) {
        Object objCollect = PollingViewModelKt.m8408countdownFlowLRDsOJo(j).collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$observeCountdown$2
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return m8406emitVtjQ1oo(((Duration) obj).getRawValue(), continuation2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: emit-VtjQ1oo, reason: not valid java name */
            public final Object m8406emitVtjQ1oo(long j2, Continuation<? super Unit> continuation2) {
                MutableStateFlow mutableStateFlow = this.this$0._uiState;
                while (true) {
                    Object value = mutableStateFlow.getValue();
                    long j3 = j2;
                    if (mutableStateFlow.compareAndSet(value, PollingUiState.m8393copyKLykuaI$default((PollingUiState) value, j3, 0, null, 6, null))) {
                        return Unit.INSTANCE;
                    }
                    j2 = j3;
                }
            }
        }, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observePollingResults(Continuation<? super Unit> continuation) {
        final StateFlow<StripeIntent.Status> state = this.poller.getState();
        Object objCollect = FlowKt.onEach(new Flow<PollingState>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$observePollingResults$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$observePollingResults$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$observePollingResults$$inlined$map$1$2", f = "PollingViewModel.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$observePollingResults$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    PollingState pollingState;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        StripeIntent.Status status = (StripeIntent.Status) obj;
                        if (status == null || (pollingState = PollingViewModelKt.toPollingState(status)) == null) {
                            pollingState = PollingState.Active;
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(pollingState, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super PollingState> flowCollector, Continuation continuation2) {
                Object objCollect2 = state.collect(new AnonymousClass2(flowCollector), continuation2);
                return objCollect2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect2 : Unit.INSTANCE;
            }
        }, new C11333(null)).collect(new C11344(), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    /* compiled from: PollingViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "pollingState", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$observePollingResults$3", f = "PollingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$observePollingResults$3, reason: invalid class name and case insensitive filesystem */
    static final class C11333 extends SuspendLambda implements Function2<PollingState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C11333(Continuation<? super C11333> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11333 c11333 = PollingViewModel.this.new C11333(continuation);
            c11333.L$0 = obj;
            return c11333;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PollingState pollingState, Continuation<? super Unit> continuation) {
            return ((C11333) create(pollingState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (((PollingState) this.L$0) == PollingState.Failed) {
                PollingViewModel.this.poller.stopPolling();
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: PollingViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$observePollingResults$4, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C11344 implements FlowCollector, FunctionAdapter {
        C11344() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new AdaptedFunctionReference(2, PollingViewModel.this, PollingViewModel.class, "updatePollingState", "updatePollingState(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final Object emit(PollingState pollingState, Continuation<? super Unit> continuation) {
            Object objObservePollingResults$updatePollingState = PollingViewModel.observePollingResults$updatePollingState(PollingViewModel.this, pollingState, continuation);
            return objObservePollingResults$updatePollingState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objObservePollingResults$updatePollingState : Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((PollingState) obj, (Continuation<? super Unit>) continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object observePollingResults$updatePollingState(PollingViewModel pollingViewModel, PollingState pollingState, Continuation continuation) {
        pollingViewModel.updatePollingState(pollingState);
        return Unit.INSTANCE;
    }

    private final void updatePollingState(PollingState pollingState) {
        MutableStateFlow<PollingUiState> mutableStateFlow = this._uiState;
        while (true) {
            PollingUiState value = mutableStateFlow.getValue();
            PollingState pollingState2 = pollingState;
            if (mutableStateFlow.compareAndSet(value, PollingUiState.m8393copyKLykuaI$default(value, 0L, 0, pollingState2, 3, null))) {
                return;
            } else {
                pollingState = pollingState2;
            }
        }
    }

    /* compiled from: PollingViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "argsSupplier", "Lkotlin/Function0;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        public static final int $stable = 0;
        private final Function0<Args> argsSupplier;

        public Factory(Function0<Args> argsSupplier) {
            Intrinsics.checkNotNullParameter(argsSupplier, "argsSupplier");
            this.argsSupplier = argsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Args argsInvoke = this.argsSupplier.invoke();
            PollingViewModel viewModel = DaggerPollingComponent.builder().application(CreationExtrasKtxKt.requireApplication(extras)).config(new IntentStatusPoller.Config(argsInvoke.getClientSecret(), argsInvoke.getMaxAttempts())).ioDispatcher(Dispatchers.getIO()).build().getSubcomponentBuilder().args(argsInvoke).savedStateHandle(SavedStateHandleSupport.createSavedStateHandle(extras)).build().getViewModel();
            Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel.Factory.create");
            return viewModel;
        }
    }

    /* compiled from: PollingViewModel.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0010J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JN\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\bHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;", "", "clientSecret", "", "timeLimit", "Lkotlin/time/Duration;", "initialDelay", "maxAttempts", "", "ctaText", NamedConstantsKt.STRIPE_ACCOUNT_ID, "<init>", "(Ljava/lang/String;JJIILjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getClientSecret", "()Ljava/lang/String;", "getTimeLimit-UwyO8pc", "()J", "J", "getInitialDelay-UwyO8pc", "getMaxAttempts", "()I", "getCtaText", "getStripeAccountId", "component1", "component2", "component2-UwyO8pc", "component3", "component3-UwyO8pc", "component4", "component5", "component6", "copy", "copy-FbhrOv8", "(Ljava/lang/String;JJIILjava/lang/String;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Args {
        public static final int $stable = 0;
        private final String clientSecret;
        private final int ctaText;
        private final long initialDelay;
        private final int maxAttempts;
        private final String stripeAccountId;
        private final long timeLimit;

        public /* synthetic */ Args(String str, long j, long j2, int i, int i2, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j, j2, i, i2, str2);
        }

        /* renamed from: copy-FbhrOv8$default, reason: not valid java name */
        public static /* synthetic */ Args m8400copyFbhrOv8$default(Args args, String str, long j, long j2, int i, int i2, String str2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = args.clientSecret;
            }
            if ((i3 & 2) != 0) {
                j = args.timeLimit;
            }
            if ((i3 & 4) != 0) {
                j2 = args.initialDelay;
            }
            if ((i3 & 8) != 0) {
                i = args.maxAttempts;
            }
            if ((i3 & 16) != 0) {
                i2 = args.ctaText;
            }
            if ((i3 & 32) != 0) {
                str2 = args.stripeAccountId;
            }
            String str3 = str2;
            int i4 = i;
            long j3 = j2;
            return args.m8403copyFbhrOv8(str, j, j3, i4, i2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getClientSecret() {
            return this.clientSecret;
        }

        /* renamed from: component2-UwyO8pc, reason: not valid java name and from getter */
        public final long getTimeLimit() {
            return this.timeLimit;
        }

        /* renamed from: component3-UwyO8pc, reason: not valid java name and from getter */
        public final long getInitialDelay() {
            return this.initialDelay;
        }

        /* renamed from: component4, reason: from getter */
        public final int getMaxAttempts() {
            return this.maxAttempts;
        }

        /* renamed from: component5, reason: from getter */
        public final int getCtaText() {
            return this.ctaText;
        }

        /* renamed from: component6, reason: from getter */
        public final String getStripeAccountId() {
            return this.stripeAccountId;
        }

        /* renamed from: copy-FbhrOv8, reason: not valid java name */
        public final Args m8403copyFbhrOv8(String clientSecret, long timeLimit, long initialDelay, int maxAttempts, int ctaText, String stripeAccountId) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new Args(clientSecret, timeLimit, initialDelay, maxAttempts, ctaText, stripeAccountId, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.clientSecret, args.clientSecret) && Duration.m10487equalsimpl0(this.timeLimit, args.timeLimit) && Duration.m10487equalsimpl0(this.initialDelay, args.initialDelay) && this.maxAttempts == args.maxAttempts && this.ctaText == args.ctaText && Intrinsics.areEqual(this.stripeAccountId, args.stripeAccountId);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.clientSecret.hashCode() * 31) + Duration.m10503hashCodeimpl(this.timeLimit)) * 31) + Duration.m10503hashCodeimpl(this.initialDelay)) * 31) + Integer.hashCode(this.maxAttempts)) * 31) + Integer.hashCode(this.ctaText)) * 31;
            String str = this.stripeAccountId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Args(clientSecret=" + this.clientSecret + ", timeLimit=" + Duration.m10522toStringimpl(this.timeLimit) + ", initialDelay=" + Duration.m10522toStringimpl(this.initialDelay) + ", maxAttempts=" + this.maxAttempts + ", ctaText=" + this.ctaText + ", stripeAccountId=" + this.stripeAccountId + ")";
        }

        private Args(String clientSecret, long j, long j2, int i, int i2, String str) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            this.timeLimit = j;
            this.initialDelay = j2;
            this.maxAttempts = i;
            this.ctaText = i2;
            this.stripeAccountId = str;
        }

        public final String getClientSecret() {
            return this.clientSecret;
        }

        /* renamed from: getTimeLimit-UwyO8pc, reason: not valid java name */
        public final long m8405getTimeLimitUwyO8pc() {
            return this.timeLimit;
        }

        /* renamed from: getInitialDelay-UwyO8pc, reason: not valid java name */
        public final long m8404getInitialDelayUwyO8pc() {
            return this.initialDelay;
        }

        public final int getMaxAttempts() {
            return this.maxAttempts;
        }

        public final int getCtaText() {
            return this.ctaText;
        }

        public final String getStripeAccountId() {
            return this.stripeAccountId;
        }
    }
}
