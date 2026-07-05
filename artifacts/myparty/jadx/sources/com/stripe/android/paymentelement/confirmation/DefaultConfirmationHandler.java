package com.stripe.android.paymentelement.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultCaller;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentelement.confirmation.ConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.ConfirmationMediator;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: DefaultConfirmationHandler.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 C2\u00020\u0001:\u0003ABCBE\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0016\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0096@¢\u0006\u0002\u0010%J\u0010\u0010&\u001a\u0004\u0018\u00010'H\u0096@¢\u0006\u0002\u0010(J\u0016\u0010)\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0082@¢\u0006\u0002\u0010%J6\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0016\u0010/\u001a\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0082@¢\u0006\u0002\u00100J\u0010\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020\u001d2\u0006\u00102\u001a\u00020'H\u0002J \u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020\u0012H\u0002J\b\u0010:\u001a\u00020\u001dH\u0002J\n\u0010;\u001a\u0004\u0018\u00010\u0010H\u0002J\f\u0010<\u001a\u00020.*\u00020$H\u0002J\u001e\u0010=\u001a\u0002H>\"\u0006\b\u0000\u0010>\u0018\u0001*\u0006\u0012\u0002\b\u00030?H\u0082H¢\u0006\u0002\u0010@R$\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006D"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;", "mediators", "", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "ioContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "isInitiallyAwaitingForResultData", "Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$AwaitingConfirmationResultData;", "hasReloadedFromProcessDeath", "", "getHasReloadedFromProcessDeath", "()Z", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;", ServerProtocol.DIALOG_PARAM_STATE, "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "register", "", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", ViewProps.START, "arguments", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;", "(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitResult", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirm", "handleMediatorAction", "confirmationOption", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "parameters", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;", "mediator", "(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;", "onHandlerResult", "storeIsAwaitingForResult", SDKConstants.PARAM_KEY, "", "option", "receivesResultInProcess", "removeIsAwaitingForResult", "retrieveIsAwaitingForResultData", "toParameters", "firstInstanceOf", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AwaitingConfirmationResultData", "Factory", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultConfirmationHandler implements ConfirmationHandler {
    private static final String AWAITING_CONFIRMATION_RESULT_KEY = "AwaitingConfirmationResult";
    private final MutableStateFlow<ConfirmationHandler.State> _state;
    private final CoroutineScope coroutineScope;
    private final ErrorReporter errorReporter;
    private final boolean hasReloadedFromProcessDeath;
    private final CoroutineContext ioContext;
    private final AwaitingConfirmationResultData isInitiallyAwaitingForResultData;
    private final List<ConfirmationMediator<?, ?, ?, ?>> mediators;
    private final SavedStateHandle savedStateHandle;
    private final StateFlow<ConfirmationHandler.State> state;
    public static final int $stable = 8;

    /* compiled from: DefaultConfirmationHandler.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.confirmation.DefaultConfirmationHandler", f = "DefaultConfirmationHandler.kt", i = {}, l = {303}, m = "awaitResult", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentelement.confirmation.DefaultConfirmationHandler$awaitResult$1, reason: invalid class name and case insensitive filesystem */
    static final class C10681 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C10681(Continuation<? super C10681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultConfirmationHandler.this.awaitResult(this);
        }
    }

    /* compiled from: DefaultConfirmationHandler.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.confirmation.DefaultConfirmationHandler", f = "DefaultConfirmationHandler.kt", i = {0, 0, 0}, l = {154}, m = "handleMediatorAction", n = {"this", "confirmationOption", "mediator"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.stripe.android.paymentelement.confirmation.DefaultConfirmationHandler$handleMediatorAction$1, reason: invalid class name and case insensitive filesystem */
    static final class C10691 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C10691(Continuation<? super C10691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultConfirmationHandler.this.handleMediatorAction(null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultConfirmationHandler(List<? extends ConfirmationMediator<?, ?, ?, ?>> mediators, CoroutineScope coroutineScope, SavedStateHandle savedStateHandle, ErrorReporter errorReporter, CoroutineContext ioContext) {
        ConfirmationHandler.State.Idle confirming;
        Intrinsics.checkNotNullParameter(mediators, "mediators");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(ioContext, "ioContext");
        this.mediators = mediators;
        this.coroutineScope = coroutineScope;
        this.savedStateHandle = savedStateHandle;
        this.errorReporter = errorReporter;
        this.ioContext = ioContext;
        AwaitingConfirmationResultData awaitingConfirmationResultDataRetrieveIsAwaitingForResultData = retrieveIsAwaitingForResultData();
        this.isInitiallyAwaitingForResultData = awaitingConfirmationResultDataRetrieveIsAwaitingForResultData;
        this.hasReloadedFromProcessDeath = awaitingConfirmationResultDataRetrieveIsAwaitingForResultData != null;
        if (awaitingConfirmationResultDataRetrieveIsAwaitingForResultData != null) {
            confirming = new ConfirmationHandler.State.Confirming(awaitingConfirmationResultDataRetrieveIsAwaitingForResultData.getConfirmationOption());
        } else {
            confirming = ConfirmationHandler.State.Idle.INSTANCE;
        }
        MutableStateFlow<ConfirmationHandler.State> MutableStateFlow = StateFlowKt.MutableStateFlow(confirming);
        this._state = MutableStateFlow;
        this.state = FlowKt.asStateFlow(MutableStateFlow);
        if (getHasReloadedFromProcessDeath()) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(null), 3, null);
        }
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationHandler
    public boolean getHasReloadedFromProcessDeath() {
        return this.hasReloadedFromProcessDeath;
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationHandler
    public StateFlow<ConfirmationHandler.State> getState() {
        return this.state;
    }

    /* compiled from: DefaultConfirmationHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.confirmation.DefaultConfirmationHandler$1", f = "DefaultConfirmationHandler.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentelement.confirmation.DefaultConfirmationHandler$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultConfirmationHandler.this.new AnonymousClass1(continuation);
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
                Duration.Companion companion = Duration.INSTANCE;
                this.label = 1;
                if (DelayKt.m10627delayVtjQ1oo(DurationKt.toDuration(1, DurationUnit.SECONDS), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AwaitingConfirmationResultData awaitingConfirmationResultDataRetrieveIsAwaitingForResultData = DefaultConfirmationHandler.this.retrieveIsAwaitingForResultData();
            if (awaitingConfirmationResultDataRetrieveIsAwaitingForResultData != null) {
                String key = awaitingConfirmationResultDataRetrieveIsAwaitingForResultData.getKey();
                AwaitingConfirmationResultData awaitingConfirmationResultData = DefaultConfirmationHandler.this.isInitiallyAwaitingForResultData;
                if (Intrinsics.areEqual(key, awaitingConfirmationResultData != null ? awaitingConfirmationResultData.getKey() : null) && !awaitingConfirmationResultDataRetrieveIsAwaitingForResultData.getReceivesResultInProcess()) {
                    DefaultConfirmationHandler.this.onHandlerResult(new ConfirmationHandler.Result.Canceled(ConfirmationHandler.Result.Canceled.Action.None));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationHandler
    public void register(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Iterator<T> it = this.mediators.iterator();
        while (it.hasNext()) {
            ((ConfirmationMediator) it.next()).register(activityResultCaller, new DefaultConfirmationHandler$register$1$1(this));
        }
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.stripe.android.paymentelement.confirmation.DefaultConfirmationHandler.register.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Iterator it2 = DefaultConfirmationHandler.this.mediators.iterator();
                while (it2.hasNext()) {
                    ((ConfirmationMediator) it2.next()).unregister();
                }
                super.onDestroy(owner);
            }
        });
    }

    /* compiled from: DefaultConfirmationHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.confirmation.DefaultConfirmationHandler$start$2", f = "DefaultConfirmationHandler.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentelement.confirmation.DefaultConfirmationHandler$start$2, reason: invalid class name and case insensitive filesystem */
    static final class C10712 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ConfirmationHandler.Args $arguments;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10712(ConfirmationHandler.Args args, Continuation<? super C10712> continuation) {
            super(2, continuation);
            this.$arguments = args;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultConfirmationHandler.this.new C10712(this.$arguments, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10712) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!(((ConfirmationHandler.State) DefaultConfirmationHandler.this._state.getValue()) instanceof ConfirmationHandler.State.Confirming)) {
                    this.label = 1;
                    if (DefaultConfirmationHandler.this.confirm(this.$arguments, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    return Unit.INSTANCE;
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

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationHandler
    public Object start(ConfirmationHandler.Args args, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.coroutineScope.getCoroutineContext(), new C10712(args, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object awaitResult(Continuation<? super ConfirmationHandler.Result> continuation) {
        C10681 c10681;
        if (continuation instanceof C10681) {
            c10681 = (C10681) continuation;
            if ((c10681.label & Integer.MIN_VALUE) != 0) {
                c10681.label -= Integer.MIN_VALUE;
            } else {
                c10681 = new C10681(continuation);
            }
        }
        Object objFirst = c10681.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10681.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objFirst);
            ConfirmationHandler.State value = this._state.getValue();
            if (value instanceof ConfirmationHandler.State.Idle) {
                return null;
            }
            if (value instanceof ConfirmationHandler.State.Complete) {
                return ((ConfirmationHandler.State.Complete) value).getResult();
            }
            if (!(value instanceof ConfirmationHandler.State.Confirming)) {
                throw new NoWhenBranchMatchedException();
            }
            MutableStateFlow<ConfirmationHandler.State> mutableStateFlow = this._state;
            DefaultConfirmationHandler$awaitResult$$inlined$firstInstanceOf$1 defaultConfirmationHandler$awaitResult$$inlined$firstInstanceOf$1 = new DefaultConfirmationHandler$awaitResult$$inlined$firstInstanceOf$1(null);
            c10681.label = 1;
            objFirst = FlowKt.first(mutableStateFlow, defaultConfirmationHandler$awaitResult$$inlined$firstInstanceOf$1, c10681);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
        }
        if (objFirst != null) {
            return ((ConfirmationHandler.State.Complete) objFirst).getResult();
        }
        throw new NullPointerException("null cannot be cast to non-null type com.stripe.android.paymentelement.confirmation.ConfirmationHandler.State.Complete");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object confirm(ConfirmationHandler.Args args, Continuation<? super Unit> continuation) {
        Object next;
        ConfirmationHandler.Option confirmationOption = args.getConfirmationOption();
        this._state.setValue(new ConfirmationHandler.State.Confirming(args.getConfirmationOption()));
        ConfirmationDefinition.Parameters parameters = toParameters(args);
        Iterator<T> it = this.mediators.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ConfirmationMediator) next).canConfirm(confirmationOption, parameters)) {
                break;
            }
        }
        ConfirmationMediator<?, ?, ?, ?> confirmationMediator = (ConfirmationMediator) next;
        if (confirmationMediator == null) {
            ErrorReporter.DefaultImpls.report$default(this.errorReporter, ErrorReporter.UnexpectedErrorEvent.INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION, StripeException.INSTANCE.create(new IllegalStateException("Attempting to confirm intent for invalid confirmation option: " + confirmationOption)), null, 4, null);
            onHandlerResult(new ConfirmationHandler.Result.Failed(new IllegalStateException("Attempted to confirm invalid " + Reflection.getOrCreateKotlinClass(confirmationOption.getClass()).getQualifiedName() + " confirmation type"), ResolvableStringUtilsKt.getResolvableString(R.string.stripe_something_went_wrong), ConfirmationHandler.Result.Failed.ErrorType.Internal.INSTANCE));
            return Unit.INSTANCE;
        }
        Object objHandleMediatorAction = handleMediatorAction(confirmationOption, parameters, confirmationMediator, continuation);
        return objHandleMediatorAction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleMediatorAction : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleMediatorAction(ConfirmationHandler.Option option, ConfirmationDefinition.Parameters parameters, ConfirmationMediator<?, ?, ?, ?> confirmationMediator, Continuation<? super Unit> continuation) {
        C10691 c10691;
        DefaultConfirmationHandler defaultConfirmationHandler;
        if (continuation instanceof C10691) {
            c10691 = (C10691) continuation;
            if ((c10691.label & Integer.MIN_VALUE) != 0) {
                c10691.label -= Integer.MIN_VALUE;
            } else {
                c10691 = new C10691(continuation);
            }
        }
        Object objWithContext = c10691.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10691.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContext = this.ioContext;
            DefaultConfirmationHandler$handleMediatorAction$action$1 defaultConfirmationHandler$handleMediatorAction$action$1 = new DefaultConfirmationHandler$handleMediatorAction$action$1(confirmationMediator, option, parameters, null);
            c10691.L$0 = this;
            c10691.L$1 = option;
            c10691.L$2 = confirmationMediator;
            c10691.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, defaultConfirmationHandler$handleMediatorAction$action$1, c10691);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            defaultConfirmationHandler = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            confirmationMediator = (ConfirmationMediator) c10691.L$2;
            option = (ConfirmationHandler.Option) c10691.L$1;
            defaultConfirmationHandler = (DefaultConfirmationHandler) c10691.L$0;
            ResultKt.throwOnFailure(objWithContext);
        }
        ConfirmationMediator.Action action = (ConfirmationMediator.Action) objWithContext;
        if (action instanceof ConfirmationMediator.Action.Launch) {
            ConfirmationMediator.Action.Launch launch = (ConfirmationMediator.Action.Launch) action;
            defaultConfirmationHandler.storeIsAwaitingForResult(confirmationMediator.getKey(), option, launch.getReceivesResultInProcess());
            launch.getLaunch().invoke();
        } else if (action instanceof ConfirmationMediator.Action.Fail) {
            ConfirmationMediator.Action.Fail fail = (ConfirmationMediator.Action.Fail) action;
            defaultConfirmationHandler.onHandlerResult(new ConfirmationHandler.Result.Failed(fail.getCause(), fail.getMessage(), fail.getErrorType()));
        } else {
            if (!(action instanceof ConfirmationMediator.Action.Complete)) {
                throw new NoWhenBranchMatchedException();
            }
            ConfirmationMediator.Action.Complete complete = (ConfirmationMediator.Action.Complete) action;
            defaultConfirmationHandler.onHandlerResult(new ConfirmationHandler.Result.Succeeded(complete.getIntent(), complete.getDeferredIntentConfirmationType(), complete.getCompletedFullPaymentFlow()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onResult(ConfirmationDefinition.Result result) {
        ConfirmationHandler.Result.Canceled canceled;
        if (result instanceof ConfirmationDefinition.Result.NextStep) {
            removeIsAwaitingForResult();
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new DefaultConfirmationHandler$onResult$confirmationResult$1(result, this, null), 3, null);
            return;
        }
        if (result instanceof ConfirmationDefinition.Result.Succeeded) {
            ConfirmationDefinition.Result.Succeeded succeeded = (ConfirmationDefinition.Result.Succeeded) result;
            canceled = new ConfirmationHandler.Result.Succeeded(succeeded.getIntent(), succeeded.getDeferredIntentConfirmationType(), succeeded.getCompletedFullPaymentFlow());
        } else if (result instanceof ConfirmationDefinition.Result.Failed) {
            ConfirmationDefinition.Result.Failed failed = (ConfirmationDefinition.Result.Failed) result;
            canceled = new ConfirmationHandler.Result.Failed(failed.getCause(), failed.getMessage(), failed.getType());
        } else {
            if (!(result instanceof ConfirmationDefinition.Result.Canceled)) {
                throw new NoWhenBranchMatchedException();
            }
            canceled = new ConfirmationHandler.Result.Canceled(((ConfirmationDefinition.Result.Canceled) result).getAction());
        }
        onHandlerResult(canceled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onHandlerResult(ConfirmationHandler.Result result) {
        this._state.setValue(new ConfirmationHandler.State.Complete(result));
        removeIsAwaitingForResult();
    }

    private final void storeIsAwaitingForResult(String key, ConfirmationHandler.Option option, boolean receivesResultInProcess) {
        this.savedStateHandle.set(AWAITING_CONFIRMATION_RESULT_KEY, new AwaitingConfirmationResultData(key, option, receivesResultInProcess));
    }

    private final void removeIsAwaitingForResult() {
        this.savedStateHandle.remove(AWAITING_CONFIRMATION_RESULT_KEY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AwaitingConfirmationResultData retrieveIsAwaitingForResultData() {
        return (AwaitingConfirmationResultData) this.savedStateHandle.get(AWAITING_CONFIRMATION_RESULT_KEY);
    }

    private final ConfirmationDefinition.Parameters toParameters(ConfirmationHandler.Args args) {
        PaymentSheet.Appearance appearance = args.getAppearance();
        AddressDetails shippingDetails = args.getShippingDetails();
        return new ConfirmationDefinition.Parameters(args.getIntent(), appearance, args.getInitializationMode(), shippingDetails);
    }

    /* compiled from: DefaultConfirmationHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.confirmation.DefaultConfirmationHandler$firstInstanceOf$2", f = "DefaultConfirmationHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentelement.confirmation.DefaultConfirmationHandler$firstInstanceOf$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Object, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.L$0;
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            return Boxing.boxBoolean(obj2 instanceof Object);
        }
    }

    private final /* synthetic */ <T> Object firstInstanceOf(Flow<?> flow, Continuation<? super T> continuation) {
        Intrinsics.needClassReification();
        Object objFirst = FlowKt.first(flow, new AnonymousClass2(null), continuation);
        Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
        return objFirst;
    }

    /* compiled from: DefaultConfirmationHandler.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$AwaitingConfirmationResultData;", "Landroid/os/Parcelable;", SDKConstants.PARAM_KEY, "", "confirmationOption", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "receivesResultInProcess", "", "<init>", "(Ljava/lang/String;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Z)V", "getKey", "()Ljava/lang/String;", "getConfirmationOption", "()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "getReceivesResultInProcess", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AwaitingConfirmationResultData implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<AwaitingConfirmationResultData> CREATOR = new Creator();
        private final ConfirmationHandler.Option confirmationOption;
        private final String key;
        private final boolean receivesResultInProcess;

        /* compiled from: DefaultConfirmationHandler.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AwaitingConfirmationResultData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AwaitingConfirmationResultData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AwaitingConfirmationResultData(parcel.readString(), (ConfirmationHandler.Option) parcel.readParcelable(AwaitingConfirmationResultData.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AwaitingConfirmationResultData[] newArray(int i) {
                return new AwaitingConfirmationResultData[i];
            }
        }

        public static /* synthetic */ AwaitingConfirmationResultData copy$default(AwaitingConfirmationResultData awaitingConfirmationResultData, String str, ConfirmationHandler.Option option, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = awaitingConfirmationResultData.key;
            }
            if ((i & 2) != 0) {
                option = awaitingConfirmationResultData.confirmationOption;
            }
            if ((i & 4) != 0) {
                z = awaitingConfirmationResultData.receivesResultInProcess;
            }
            return awaitingConfirmationResultData.copy(str, option, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: component2, reason: from getter */
        public final ConfirmationHandler.Option getConfirmationOption() {
            return this.confirmationOption;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getReceivesResultInProcess() {
            return this.receivesResultInProcess;
        }

        public final AwaitingConfirmationResultData copy(String key, ConfirmationHandler.Option confirmationOption, boolean receivesResultInProcess) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
            return new AwaitingConfirmationResultData(key, confirmationOption, receivesResultInProcess);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AwaitingConfirmationResultData)) {
                return false;
            }
            AwaitingConfirmationResultData awaitingConfirmationResultData = (AwaitingConfirmationResultData) other;
            return Intrinsics.areEqual(this.key, awaitingConfirmationResultData.key) && Intrinsics.areEqual(this.confirmationOption, awaitingConfirmationResultData.confirmationOption) && this.receivesResultInProcess == awaitingConfirmationResultData.receivesResultInProcess;
        }

        public int hashCode() {
            return (((this.key.hashCode() * 31) + this.confirmationOption.hashCode()) * 31) + Boolean.hashCode(this.receivesResultInProcess);
        }

        public String toString() {
            return "AwaitingConfirmationResultData(key=" + this.key + ", confirmationOption=" + this.confirmationOption + ", receivesResultInProcess=" + this.receivesResultInProcess + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.key);
            dest.writeParcelable(this.confirmationOption, flags);
            dest.writeInt(this.receivesResultInProcess ? 1 : 0);
        }

        public AwaitingConfirmationResultData(String key, ConfirmationHandler.Option confirmationOption, boolean z) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
            this.key = key;
            this.confirmationOption = confirmationOption;
            this.receivesResultInProcess = z;
        }

        public final String getKey() {
            return this.key;
        }

        public final ConfirmationHandler.Option getConfirmationOption() {
            return this.confirmationOption;
        }

        public final boolean getReceivesResultInProcess() {
            return this.receivesResultInProcess;
        }
    }

    /* compiled from: DefaultConfirmationHandler.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$Factory;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;", "registry", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationRegistry;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "ioContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lcom/stripe/android/paymentelement/confirmation/ConfirmationRegistry;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "create", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements ConfirmationHandler.Factory {
        public static final int $stable = 8;
        private final ErrorReporter errorReporter;
        private final CoroutineContext ioContext;
        private final ConfirmationRegistry registry;
        private final SavedStateHandle savedStateHandle;

        @Inject
        public Factory(ConfirmationRegistry registry, SavedStateHandle savedStateHandle, ErrorReporter errorReporter, @IOContext CoroutineContext ioContext) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(ioContext, "ioContext");
            this.registry = registry;
            this.savedStateHandle = savedStateHandle;
            this.errorReporter = errorReporter;
            this.ioContext = ioContext;
        }

        @Override // com.stripe.android.paymentelement.confirmation.ConfirmationHandler.Factory
        public ConfirmationHandler create(CoroutineScope scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            return new DefaultConfirmationHandler(this.registry.createConfirmationMediators(this.savedStateHandle), scope, this.savedStateHandle, this.errorReporter, this.ioContext);
        }
    }
}
