package com.stripe.android.paymentsheet.ui;

import com.facebook.internal.ServerProtocol;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import com.stripe.android.paymentsheet.DisplayableSavedPaymentMethod;
import com.stripe.android.paymentsheet.PaymentOptionsItem;
import com.stripe.android.paymentsheet.PaymentOptionsStateFactory;
import com.stripe.android.paymentsheet.SavedPaymentMethodMutator;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor;
import com.stripe.android.paymentsheet.ui.SelectSavedPaymentMethodsInteractor;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: SelectSavedPaymentMethodsInteractor.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 12\u00020\u0001:\u00011Bó\u0001\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0003\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u0015\u00128\u0010\u0017\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\f0\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010*\u001a\u00020&H\u0002J,\u0010+\u001a\u0004\u0018\u00010\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u00102\b\u0010,\u001a\u0004\u0018\u00010\u00122\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0010\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\fH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R@\u0010\u0017\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\f0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020&0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u00062"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;", "Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor;", "paymentOptionsItems", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/stripe/android/paymentsheet/PaymentOptionsItem;", "editing", "", "canEdit", "canRemove", "toggleEdit", "Lkotlin/Function0;", "", "isProcessing", "isCurrentScreen", "currentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "mostRecentlySelectedSavedPaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "onAddCardPressed", "onUpdatePaymentMethod", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "updateSelection", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", BaseSheetViewModel.SAVE_SELECTION, "isUserInput", NamedConstantsKt.IS_LIVE_MODE, "<init>", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Z)V", "()Z", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "_screenSelection", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_state", "Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;", ServerProtocol.DIALOG_PARAM_STATE, "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "getInitialState", "getSelectedPaymentOptionsItem", "savedSelection", "handleViewAction", "viewAction", "Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$ViewAction;", "close", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultSelectSavedPaymentMethodsInteractor implements SelectSavedPaymentMethodsInteractor {
    private final MutableStateFlow<PaymentSelection> _screenSelection;
    private final MutableStateFlow<SelectSavedPaymentMethodsInteractor.State> _state;
    private final StateFlow<Boolean> canEdit;
    private final StateFlow<Boolean> canRemove;
    private final CoroutineScope coroutineScope;
    private final StateFlow<PaymentSelection> currentSelection;
    private final StateFlow<Boolean> editing;
    private final StateFlow<Boolean> isCurrentScreen;
    private final boolean isLiveMode;
    private final StateFlow<Boolean> isProcessing;
    private final StateFlow<PaymentMethod> mostRecentlySelectedSavedPaymentMethod;
    private final Function0<Unit> onAddCardPressed;
    private final Function1<DisplayableSavedPaymentMethod, Unit> onUpdatePaymentMethod;
    private final StateFlow<List<PaymentOptionsItem>> paymentOptionsItems;
    private final StateFlow<SelectSavedPaymentMethodsInteractor.State> state;
    private final Function0<Unit> toggleEdit;
    private final Function2<PaymentSelection, Boolean, Unit> updateSelection;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultSelectSavedPaymentMethodsInteractor(StateFlow<? extends List<? extends PaymentOptionsItem>> paymentOptionsItems, StateFlow<Boolean> editing, StateFlow<Boolean> canEdit, StateFlow<Boolean> canRemove, Function0<Unit> toggleEdit, StateFlow<Boolean> isProcessing, StateFlow<Boolean> isCurrentScreen, StateFlow<? extends PaymentSelection> currentSelection, StateFlow<PaymentMethod> mostRecentlySelectedSavedPaymentMethod, Function0<Unit> onAddCardPressed, Function1<? super DisplayableSavedPaymentMethod, Unit> onUpdatePaymentMethod, Function2<? super PaymentSelection, ? super Boolean, Unit> updateSelection, boolean z) {
        Intrinsics.checkNotNullParameter(paymentOptionsItems, "paymentOptionsItems");
        Intrinsics.checkNotNullParameter(editing, "editing");
        Intrinsics.checkNotNullParameter(canEdit, "canEdit");
        Intrinsics.checkNotNullParameter(canRemove, "canRemove");
        Intrinsics.checkNotNullParameter(toggleEdit, "toggleEdit");
        Intrinsics.checkNotNullParameter(isProcessing, "isProcessing");
        Intrinsics.checkNotNullParameter(isCurrentScreen, "isCurrentScreen");
        Intrinsics.checkNotNullParameter(currentSelection, "currentSelection");
        Intrinsics.checkNotNullParameter(mostRecentlySelectedSavedPaymentMethod, "mostRecentlySelectedSavedPaymentMethod");
        Intrinsics.checkNotNullParameter(onAddCardPressed, "onAddCardPressed");
        Intrinsics.checkNotNullParameter(onUpdatePaymentMethod, "onUpdatePaymentMethod");
        Intrinsics.checkNotNullParameter(updateSelection, "updateSelection");
        this.paymentOptionsItems = paymentOptionsItems;
        this.editing = editing;
        this.canEdit = canEdit;
        this.canRemove = canRemove;
        this.toggleEdit = toggleEdit;
        this.isProcessing = isProcessing;
        this.isCurrentScreen = isCurrentScreen;
        this.currentSelection = currentSelection;
        this.mostRecentlySelectedSavedPaymentMethod = mostRecentlySelectedSavedPaymentMethod;
        this.onAddCardPressed = onAddCardPressed;
        this.onUpdatePaymentMethod = onUpdatePaymentMethod;
        this.updateSelection = updateSelection;
        this.isLiveMode = z;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getUnconfined().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        this.coroutineScope = CoroutineScope;
        PaymentSelection paymentSelection = (PaymentSelection) currentSelection.getValue();
        if (!(paymentSelection instanceof PaymentSelection.Link) && !(paymentSelection instanceof PaymentSelection.GooglePay) && !(paymentSelection instanceof PaymentSelection.Saved)) {
            paymentSelection = null;
        }
        this._screenSelection = StateFlowKt.MutableStateFlow(paymentSelection);
        MutableStateFlow<SelectSavedPaymentMethodsInteractor.State> MutableStateFlow = StateFlowKt.MutableStateFlow(getInitialState());
        this._state = MutableStateFlow;
        this.state = MutableStateFlow;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass1(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass2(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass3(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass4(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass5(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass6(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass7(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass8(null), 3, null);
    }

    public static final /* synthetic */ PaymentOptionsItem access$getSelectedPaymentOptionsItem(DefaultSelectSavedPaymentMethodsInteractor defaultSelectSavedPaymentMethodsInteractor, PaymentSelection paymentSelection, PaymentMethod paymentMethod, List list) {
        return defaultSelectSavedPaymentMethodsInteractor.getSelectedPaymentOptionsItem(paymentSelection, paymentMethod, list);
    }

    @Override // com.stripe.android.paymentsheet.ui.SelectSavedPaymentMethodsInteractor
    /* renamed from: isLiveMode, reason: from getter */
    public boolean getIsLiveMode() {
        return this.isLiveMode;
    }

    @Override // com.stripe.android.paymentsheet.ui.SelectSavedPaymentMethodsInteractor
    public StateFlow<SelectSavedPaymentMethodsInteractor.State> getState() {
        return this.state;
    }

    private final SelectSavedPaymentMethodsInteractor.State getInitialState() {
        List<PaymentOptionsItem> value = this.paymentOptionsItems.getValue();
        return new SelectSavedPaymentMethodsInteractor.State(value, getSelectedPaymentOptionsItem(this._screenSelection.getValue(), this.mostRecentlySelectedSavedPaymentMethod.getValue(), value), this.editing.getValue().booleanValue(), this.isProcessing.getValue().booleanValue(), this.canEdit.getValue().booleanValue(), this.canRemove.getValue().booleanValue());
    }

    /* compiled from: SelectSavedPaymentMethodsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor$1", f = "SelectSavedPaymentMethodsInteractor.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultSelectSavedPaymentMethodsInteractor.this.new AnonymousClass1(continuation);
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
                StateFlow stateFlow = DefaultSelectSavedPaymentMethodsInteractor.this.paymentOptionsItems;
                final DefaultSelectSavedPaymentMethodsInteractor defaultSelectSavedPaymentMethodsInteractor = DefaultSelectSavedPaymentMethodsInteractor.this;
                this.label = 1;
                if (stateFlow.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<? extends PaymentOptionsItem>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Object emit(List<? extends PaymentOptionsItem> list, Continuation<? super Unit> continuation) {
                        MutableStateFlow mutableStateFlow = defaultSelectSavedPaymentMethodsInteractor._state;
                        while (true) {
                            Object value = mutableStateFlow.getValue();
                            List<? extends PaymentOptionsItem> list2 = list;
                            if (mutableStateFlow.compareAndSet(value, SelectSavedPaymentMethodsInteractor.State.copy$default((SelectSavedPaymentMethodsInteractor.State) value, list2, null, false, false, false, false, 62, null))) {
                                return Unit.INSTANCE;
                            }
                            list = list2;
                        }
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: SelectSavedPaymentMethodsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor$2", f = "SelectSavedPaymentMethodsInteractor.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultSelectSavedPaymentMethodsInteractor.this.new AnonymousClass2(continuation);
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
                StateFlow stateFlow = DefaultSelectSavedPaymentMethodsInteractor.this.editing;
                final DefaultSelectSavedPaymentMethodsInteractor defaultSelectSavedPaymentMethodsInteractor = DefaultSelectSavedPaymentMethodsInteractor.this;
                this.label = 1;
                if (stateFlow.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        MutableStateFlow mutableStateFlow = defaultSelectSavedPaymentMethodsInteractor._state;
                        while (true) {
                            Object value = mutableStateFlow.getValue();
                            boolean z2 = z;
                            if (mutableStateFlow.compareAndSet(value, SelectSavedPaymentMethodsInteractor.State.copy$default((SelectSavedPaymentMethodsInteractor.State) value, null, null, z2, false, false, false, 59, null))) {
                                return Unit.INSTANCE;
                            }
                            z = z2;
                        }
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: SelectSavedPaymentMethodsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor$3", f = "SelectSavedPaymentMethodsInteractor.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultSelectSavedPaymentMethodsInteractor.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlow = DefaultSelectSavedPaymentMethodsInteractor.this.canEdit;
                final DefaultSelectSavedPaymentMethodsInteractor defaultSelectSavedPaymentMethodsInteractor = DefaultSelectSavedPaymentMethodsInteractor.this;
                this.label = 1;
                if (stateFlow.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        MutableStateFlow mutableStateFlow = defaultSelectSavedPaymentMethodsInteractor._state;
                        while (true) {
                            Object value = mutableStateFlow.getValue();
                            boolean z2 = z;
                            if (mutableStateFlow.compareAndSet(value, SelectSavedPaymentMethodsInteractor.State.copy$default((SelectSavedPaymentMethodsInteractor.State) value, null, null, false, false, z2, false, 47, null))) {
                                return Unit.INSTANCE;
                            }
                            z = z2;
                        }
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: SelectSavedPaymentMethodsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor$4", f = "SelectSavedPaymentMethodsInteractor.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultSelectSavedPaymentMethodsInteractor.this.new AnonymousClass4(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlow = DefaultSelectSavedPaymentMethodsInteractor.this.canRemove;
                final DefaultSelectSavedPaymentMethodsInteractor defaultSelectSavedPaymentMethodsInteractor = DefaultSelectSavedPaymentMethodsInteractor.this;
                this.label = 1;
                if (stateFlow.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor.4.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        MutableStateFlow mutableStateFlow = defaultSelectSavedPaymentMethodsInteractor._state;
                        while (true) {
                            Object value = mutableStateFlow.getValue();
                            boolean z2 = z;
                            if (mutableStateFlow.compareAndSet(value, SelectSavedPaymentMethodsInteractor.State.copy$default((SelectSavedPaymentMethodsInteractor.State) value, null, null, false, false, false, z2, 31, null))) {
                                return Unit.INSTANCE;
                            }
                            z = z2;
                        }
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: SelectSavedPaymentMethodsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor$5", f = "SelectSavedPaymentMethodsInteractor.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultSelectSavedPaymentMethodsInteractor.this.new AnonymousClass5(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlow = DefaultSelectSavedPaymentMethodsInteractor.this.isProcessing;
                final DefaultSelectSavedPaymentMethodsInteractor defaultSelectSavedPaymentMethodsInteractor = DefaultSelectSavedPaymentMethodsInteractor.this;
                this.label = 1;
                if (stateFlow.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor.5.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        MutableStateFlow mutableStateFlow = defaultSelectSavedPaymentMethodsInteractor._state;
                        while (true) {
                            Object value = mutableStateFlow.getValue();
                            boolean z2 = z;
                            if (mutableStateFlow.compareAndSet(value, SelectSavedPaymentMethodsInteractor.State.copy$default((SelectSavedPaymentMethodsInteractor.State) value, null, null, false, z2, false, false, 55, null))) {
                                return Unit.INSTANCE;
                            }
                            z = z2;
                        }
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: SelectSavedPaymentMethodsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor$6", f = "SelectSavedPaymentMethodsInteractor.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor$6, reason: invalid class name */
    static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass6(Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultSelectSavedPaymentMethodsInteractor.this.new AnonymousClass6(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow stateFlow = DefaultSelectSavedPaymentMethodsInteractor.this.currentSelection;
                Flow<PaymentSelection> flow = new Flow<PaymentSelection>() { // from class: com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor$6$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor$6$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor$6$invokeSuspend$$inlined$filter$1$2", f = "SelectSavedPaymentMethodsInteractor.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                        /* renamed from: com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor$6$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
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
                                PaymentSelection paymentSelection = (PaymentSelection) obj;
                                if ((paymentSelection instanceof PaymentSelection.Saved) || (paymentSelection instanceof PaymentSelection.Link) || Intrinsics.areEqual(paymentSelection, PaymentSelection.GooglePay.INSTANCE)) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
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
                    public Object collect(FlowCollector<? super PaymentSelection> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                final DefaultSelectSavedPaymentMethodsInteractor defaultSelectSavedPaymentMethodsInteractor = DefaultSelectSavedPaymentMethodsInteractor.this;
                this.label = 1;
                if (flow.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor.6.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((PaymentSelection) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(PaymentSelection paymentSelection, Continuation<? super Unit> continuation) {
                        if (!Intrinsics.areEqual(paymentSelection, defaultSelectSavedPaymentMethodsInteractor._screenSelection.getValue())) {
                            defaultSelectSavedPaymentMethodsInteractor._screenSelection.setValue(paymentSelection);
                        }
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
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

    /* compiled from: SelectSavedPaymentMethodsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor$7", f = "SelectSavedPaymentMethodsInteractor.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor$7, reason: invalid class name */
    static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass7(Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultSelectSavedPaymentMethodsInteractor.this.new AnonymousClass7(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlow = DefaultSelectSavedPaymentMethodsInteractor.this._screenSelection;
                StateFlow stateFlow = DefaultSelectSavedPaymentMethodsInteractor.this.mostRecentlySelectedSavedPaymentMethod;
                StateFlow stateFlow2 = DefaultSelectSavedPaymentMethodsInteractor.this.paymentOptionsItems;
                final DefaultSelectSavedPaymentMethodsInteractor defaultSelectSavedPaymentMethodsInteractor = DefaultSelectSavedPaymentMethodsInteractor.this;
                StateFlow stateFlowCombineAsStateFlow = StateFlowsKt.combineAsStateFlow(mutableStateFlow, stateFlow, stateFlow2, new Function3() { // from class: com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor$7$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        return DefaultSelectSavedPaymentMethodsInteractor.access$getSelectedPaymentOptionsItem(defaultSelectSavedPaymentMethodsInteractor, (PaymentSelection) obj2, (PaymentMethod) obj3, (List) obj4);
                    }
                });
                final DefaultSelectSavedPaymentMethodsInteractor defaultSelectSavedPaymentMethodsInteractor2 = DefaultSelectSavedPaymentMethodsInteractor.this;
                this.label = 1;
                if (stateFlowCombineAsStateFlow.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor.7.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((PaymentOptionsItem) obj2, (Continuation<? super Unit>) continuation);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Object emit(PaymentOptionsItem paymentOptionsItem, Continuation<? super Unit> continuation) {
                        MutableStateFlow mutableStateFlow2 = defaultSelectSavedPaymentMethodsInteractor2._state;
                        while (true) {
                            Object value = mutableStateFlow2.getValue();
                            PaymentOptionsItem paymentOptionsItem2 = paymentOptionsItem;
                            if (mutableStateFlow2.compareAndSet(value, SelectSavedPaymentMethodsInteractor.State.copy$default((SelectSavedPaymentMethodsInteractor.State) value, null, paymentOptionsItem2, false, false, false, false, 61, null))) {
                                return Unit.INSTANCE;
                            }
                            paymentOptionsItem = paymentOptionsItem2;
                        }
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: SelectSavedPaymentMethodsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor$8", f = "SelectSavedPaymentMethodsInteractor.kt", i = {}, l = {179}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor$8, reason: invalid class name */
    static final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass8(Continuation<? super AnonymousClass8> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultSelectSavedPaymentMethodsInteractor.this.new AnonymousClass8(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlow = DefaultSelectSavedPaymentMethodsInteractor.this.isCurrentScreen;
                final DefaultSelectSavedPaymentMethodsInteractor defaultSelectSavedPaymentMethodsInteractor = DefaultSelectSavedPaymentMethodsInteractor.this;
                this.label = 1;
                if (stateFlow.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor.8.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        if (z) {
                            defaultSelectSavedPaymentMethodsInteractor.updateSelection.invoke(defaultSelectSavedPaymentMethodsInteractor._screenSelection.getValue(), Boxing.boxBoolean(false));
                        }
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentOptionsItem getSelectedPaymentOptionsItem(PaymentSelection selection, PaymentMethod savedSelection, List<? extends PaymentOptionsItem> paymentOptionsItems) {
        if (!(selection instanceof PaymentSelection.Saved) && !(selection instanceof PaymentSelection.Link) && !(selection instanceof PaymentSelection.GooglePay) && !(selection instanceof PaymentSelection.ShopPay)) {
            if (!(selection instanceof PaymentSelection.New) && !(selection instanceof PaymentSelection.ExternalPaymentMethod) && !(selection instanceof PaymentSelection.CustomPaymentMethod) && selection != null) {
                throw new NoWhenBranchMatchedException();
            }
            selection = savedSelection != null ? new PaymentSelection.Saved(savedSelection, null, null, 6, null) : null;
        }
        return PaymentOptionsStateFactory.INSTANCE.getSelectedItem(paymentOptionsItems, selection);
    }

    @Override // com.stripe.android.paymentsheet.ui.SelectSavedPaymentMethodsInteractor
    public void handleViewAction(SelectSavedPaymentMethodsInteractor.ViewAction viewAction) {
        Intrinsics.checkNotNullParameter(viewAction, "viewAction");
        if (viewAction instanceof SelectSavedPaymentMethodsInteractor.ViewAction.EditPaymentMethod) {
            this.onUpdatePaymentMethod.invoke(((SelectSavedPaymentMethodsInteractor.ViewAction.EditPaymentMethod) viewAction).getPaymentMethod());
            return;
        }
        if (viewAction instanceof SelectSavedPaymentMethodsInteractor.ViewAction.SelectPaymentMethod) {
            PaymentSelection selection = ((SelectSavedPaymentMethodsInteractor.ViewAction.SelectPaymentMethod) viewAction).getSelection();
            this._screenSelection.setValue(selection);
            this.updateSelection.invoke(selection, true);
        } else if (Intrinsics.areEqual(viewAction, SelectSavedPaymentMethodsInteractor.ViewAction.AddCardPressed.INSTANCE)) {
            this.onAddCardPressed.invoke();
        } else {
            if (!Intrinsics.areEqual(viewAction, SelectSavedPaymentMethodsInteractor.ViewAction.ToggleEdit.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            this.toggleEdit.invoke();
        }
    }

    @Override // com.stripe.android.paymentsheet.ui.SelectSavedPaymentMethodsInteractor
    public void close() {
        CoroutineScopeKt.cancel$default(this.coroutineScope, null, 1, null);
    }

    /* compiled from: SelectSavedPaymentMethodsInteractor.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor;", "viewModel", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "customerStateHolder", "Lcom/stripe/android/paymentsheet/CustomerStateHolder;", "savedPaymentMethodMutator", "Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SelectSavedPaymentMethodsInteractor create(final BaseSheetViewModel viewModel, final PaymentMethodMetadata paymentMethodMetadata, CustomerStateHolder customerStateHolder, SavedPaymentMethodMutator savedPaymentMethodMutator) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
            Intrinsics.checkNotNullParameter(customerStateHolder, "customerStateHolder");
            Intrinsics.checkNotNullParameter(savedPaymentMethodMutator, "savedPaymentMethodMutator");
            StateFlow<List<PaymentOptionsItem>> paymentOptionsItems = savedPaymentMethodMutator.getPaymentOptionsItems();
            StateFlow<Boolean> editing$paymentsheet_release = savedPaymentMethodMutator.getEditing$paymentsheet_release();
            StateFlow<Boolean> canEdit = savedPaymentMethodMutator.getCanEdit();
            StateFlow<Boolean> canRemove = customerStateHolder.getCanRemove();
            DefaultSelectSavedPaymentMethodsInteractor$Companion$create$1 defaultSelectSavedPaymentMethodsInteractor$Companion$create$1 = new DefaultSelectSavedPaymentMethodsInteractor$Companion$create$1(savedPaymentMethodMutator);
            StateFlow<Boolean> processing = viewModel.getProcessing();
            StateFlow<PaymentSelection> selection$paymentsheet_release = viewModel.getSelection$paymentsheet_release();
            StateFlow<PaymentMethod> mostRecentlySelectedSavedPaymentMethod = customerStateHolder.getMostRecentlySelectedSavedPaymentMethod();
            return new DefaultSelectSavedPaymentMethodsInteractor(paymentOptionsItems, editing$paymentsheet_release, canEdit, canRemove, defaultSelectSavedPaymentMethodsInteractor$Companion$create$1, processing, StateFlowsKt.mapAsStateFlow(viewModel.getNavigationHandler().getCurrentScreen(), new Function1() { // from class: com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(DefaultSelectSavedPaymentMethodsInteractor.Companion.create$lambda$0((PaymentSheetScreen) obj));
                }
            }), selection$paymentsheet_release, mostRecentlySelectedSavedPaymentMethod, new Function0() { // from class: com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DefaultSelectSavedPaymentMethodsInteractor.Companion.create$lambda$1(viewModel, paymentMethodMetadata);
                }
            }, new DefaultSelectSavedPaymentMethodsInteractor$Companion$create$3(savedPaymentMethodMutator), new Function2() { // from class: com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultSelectSavedPaymentMethodsInteractor.Companion.create$lambda$2(viewModel, (PaymentSelection) obj, ((Boolean) obj2).booleanValue());
                }
            }, paymentMethodMetadata.getStripeIntent().isLiveMode());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit create$lambda$1(BaseSheetViewModel baseSheetViewModel, PaymentMethodMetadata paymentMethodMetadata) {
            baseSheetViewModel.getNavigationHandler().transitionTo(new PaymentSheetScreen.AddAnotherPaymentMethod(DefaultAddPaymentMethodInteractor.INSTANCE.create(baseSheetViewModel, paymentMethodMetadata)));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean create$lambda$0(PaymentSheetScreen it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it instanceof PaymentSheetScreen.SelectSavedPaymentMethods;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit create$lambda$2(BaseSheetViewModel baseSheetViewModel, PaymentSelection paymentSelection, boolean z) {
            if (z) {
                baseSheetViewModel.handlePaymentMethodSelected(paymentSelection);
            } else {
                baseSheetViewModel.updateSelection(paymentSelection);
            }
            return Unit.INSTANCE;
        }
    }
}
