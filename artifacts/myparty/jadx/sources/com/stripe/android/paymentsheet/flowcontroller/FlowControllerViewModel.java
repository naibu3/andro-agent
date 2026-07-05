package com.stripe.android.paymentsheet.flowcontroller;

import android.app.Application;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.analytics.SessionSavedStateHandler;
import com.stripe.android.core.utils.CreationExtrasKtxKt;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerConfigurationHandler;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.state.PaymentSheetState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: FlowControllerViewModel.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 ;2\u00020\u0001:\u0002:;B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010+\u001a\u00020,2\u0016\u0010-\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0006\u0012\u0004\u0018\u00010%0.J\u0006\u00109\u001a\u00020,R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u001e\u001a\u0004\u0018\u00010%8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f00X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f02¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0019\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%02¢\u0006\b\n\u0000\u001a\u0004\b6\u00104R\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020,08X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "paymentElementCallbackIdentifier", "", "statusBarColor", "", "<init>", "(Landroid/app/Application;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Integer;)V", "getHandle", "()Landroidx/lifecycle/SavedStateHandle;", "flowControllerStateComponent", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;", "getFlowControllerStateComponent", "()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;", "walletButtonsRendered", "", "getWalletButtonsRendered", "()Z", "setWalletButtonsRendered", "(Z)V", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "getPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "setPaymentSelection", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "value", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;", "previousConfigureRequest", "getPreviousConfigureRequest", "()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;", "setPreviousConfigureRequest", "(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler$ConfigureRequest;)V", "Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;", "state", "getState", "()Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;", "setState", "(Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;)V", "updateState", "", "block", "Lkotlin/Function1;", "_configureRequest", "Lkotlinx/coroutines/flow/MutableStateFlow;", "configureRequest", "Lkotlinx/coroutines/flow/StateFlow;", "getConfigureRequest", "()Lkotlinx/coroutines/flow/StateFlow;", "stateFlow", "getStateFlow", "restartSession", "Lkotlin/Function0;", "resetSession", "Factory", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FlowControllerViewModel extends AndroidViewModel {
    private static final String STATE_KEY = "state";
    private final MutableStateFlow<FlowControllerConfigurationHandler.ConfigureRequest> _configureRequest;
    private final StateFlow<FlowControllerConfigurationHandler.ConfigureRequest> configureRequest;
    private final FlowControllerStateComponent flowControllerStateComponent;
    private final SavedStateHandle handle;
    private volatile PaymentSelection paymentSelection;
    private final Function0<Unit> restartSession;
    private final StateFlow<DefaultFlowController.State> stateFlow;
    private boolean walletButtonsRendered;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public final SavedStateHandle getHandle() {
        return this.handle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowControllerViewModel(Application application, SavedStateHandle handle, String paymentElementCallbackIdentifier, Integer num) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(handle, "handle");
        Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        this.handle = handle;
        this.flowControllerStateComponent = DaggerFlowControllerStateComponent.builder().application(application).statusBarColor(num).paymentElementCallbackIdentifier(paymentElementCallbackIdentifier).flowControllerViewModel(this).build();
        MutableStateFlow<FlowControllerConfigurationHandler.ConfigureRequest> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._configureRequest = MutableStateFlow;
        this.configureRequest = FlowKt.asStateFlow(MutableStateFlow);
        this.stateFlow = handle.getStateFlow("state", null);
        FlowControllerViewModel flowControllerViewModel = this;
        this.restartSession = SessionSavedStateHandler.INSTANCE.attachTo(flowControllerViewModel, handle);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(flowControllerViewModel), null, null, new AnonymousClass1(null), 3, null);
    }

    public final FlowControllerStateComponent getFlowControllerStateComponent() {
        return this.flowControllerStateComponent;
    }

    public final boolean getWalletButtonsRendered() {
        return this.walletButtonsRendered;
    }

    public final void setWalletButtonsRendered(boolean z) {
        this.walletButtonsRendered = z;
    }

    public final PaymentSelection getPaymentSelection() {
        return this.paymentSelection;
    }

    public final void setPaymentSelection(PaymentSelection paymentSelection) {
        this.paymentSelection = paymentSelection;
    }

    public final FlowControllerConfigurationHandler.ConfigureRequest getPreviousConfigureRequest() {
        return this._configureRequest.getValue();
    }

    public final void setPreviousConfigureRequest(FlowControllerConfigurationHandler.ConfigureRequest configureRequest) {
        this._configureRequest.setValue(configureRequest);
    }

    public final DefaultFlowController.State getState() {
        return (DefaultFlowController.State) this.handle.get("state");
    }

    public final void setState(DefaultFlowController.State state) {
        this.handle.set("state", state);
    }

    public final void updateState(Function1<? super DefaultFlowController.State, DefaultFlowController.State> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.handle.set("state", block.invoke(getState()));
    }

    public final StateFlow<FlowControllerConfigurationHandler.ConfigureRequest> getConfigureRequest() {
        return this.configureRequest;
    }

    public final StateFlow<DefaultFlowController.State> getStateFlow() {
        return this.stateFlow;
    }

    /* compiled from: FlowControllerViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.flowcontroller.FlowControllerViewModel$1", f = "FlowControllerViewModel.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.flowcontroller.FlowControllerViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FlowControllerViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: FlowControllerViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.paymentsheet.flowcontroller.FlowControllerViewModel$1$1", f = "FlowControllerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.paymentsheet.flowcontroller.FlowControllerViewModel$1$1, reason: invalid class name and collision with other inner class name */
        static final class C02051 extends SuspendLambda implements Function2<DefaultFlowController.State, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ FlowControllerViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02051(FlowControllerViewModel flowControllerViewModel, Continuation<? super C02051> continuation) {
                super(2, continuation);
                this.this$0 = flowControllerViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02051 c02051 = new C02051(this.this$0, continuation);
                c02051.L$0 = obj;
                return c02051;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DefaultFlowController.State state, Continuation<? super Unit> continuation) {
                return ((C02051) create(state, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                PaymentSheetState.Full paymentSheetState;
                PaymentMethodMetadata paymentMethodMetadata;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                DefaultFlowController.State state = (DefaultFlowController.State) this.L$0;
                this.this$0.getFlowControllerStateComponent().getLinkHandler().setupLink((state == null || (paymentSheetState = state.getPaymentSheetState()) == null || (paymentMethodMetadata = paymentSheetState.getPaymentMethodMetadata()) == null) ? null : paymentMethodMetadata.getLinkState());
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (FlowKt.collectLatest(FlowControllerViewModel.this.getStateFlow(), new C02051(FlowControllerViewModel.this, null), this) == coroutine_suspended) {
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

    public final void resetSession() {
        this.restartSession.invoke();
    }

    /* compiled from: FlowControllerViewModel.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0010R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "statusBarColor", "", "paymentElementCallbackIdentifier", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "Ljava/lang/Integer;", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        public static final int $stable = 0;
        private final String paymentElementCallbackIdentifier;
        private final Integer statusBarColor;

        public Factory(Integer num, String paymentElementCallbackIdentifier) {
            Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
            this.statusBarColor = num;
            this.paymentElementCallbackIdentifier = paymentElementCallbackIdentifier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new FlowControllerViewModel(CreationExtrasKtxKt.requireApplication(extras), SavedStateHandleSupport.createSavedStateHandle(extras), this.paymentElementCallbackIdentifier, this.statusBarColor);
        }
    }

    /* compiled from: FlowControllerViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel$Companion;", "", "<init>", "()V", "STATE_KEY", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
