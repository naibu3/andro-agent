package com.stripe.android.paymentsheet.verticalmode;

import com.facebook.internal.ServerProtocol;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.CustomerStateHolder;
import com.stripe.android.paymentsheet.DisplayableSavedPaymentMethod;
import com.stripe.android.paymentsheet.SavedPaymentMethodMutator;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.verticalmode.DefaultManageScreenInteractor;
import com.stripe.android.paymentsheet.verticalmode.ManageScreenInteractor;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: ManageScreenInteractor.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 32\u00020\u0001:\u00013BÞ\u0001\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u001a\u0010\u0010\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u0004\u0012\u00020\u00140\u0011\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0011\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0011\u0012!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u000f0\u0011\u0012\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020\u000fH\u0016J\u0010\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0016H\u0002J\u0010\u00102\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0010\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u0004\u0012\u00020\u00140\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u00064"}, d2 = {"Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;", "Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor;", "paymentMethods", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "editing", "", "canEdit", "toggleEdit", "Lkotlin/Function0;", "", "providePaymentMethodName", "Lkotlin/Function1;", "", "Lcom/stripe/android/model/PaymentMethodCode;", "Lcom/stripe/android/core/strings/ResolvableString;", "onSelectPaymentMethod", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "onUpdatePaymentMethod", "navigateBack", "Lkotlin/ParameterName;", "name", "withDelay", "defaultPaymentMethodId", "dispatcher", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lkotlinx/coroutines/flow/StateFlow;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "hasNavigatedBack", "Ljava/util/concurrent/atomic/AtomicBoolean;", "displayableSavedPaymentMethods", NamedConstantsKt.IS_LIVE_MODE, "()Z", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$State;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "handleViewAction", "viewAction", "Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$ViewAction;", "close", "handlePaymentMethodSelected", "paymentMethod", "safeNavigateBack", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultManageScreenInteractor implements ManageScreenInteractor {
    private final StateFlow<Boolean> canEdit;
    private final CoroutineScope coroutineScope;
    private final StateFlow<String> defaultPaymentMethodId;
    private final StateFlow<List<DisplayableSavedPaymentMethod>> displayableSavedPaymentMethods;
    private final StateFlow<Boolean> editing;
    private final AtomicBoolean hasNavigatedBack;
    private final boolean isLiveMode;
    private final Function1<Boolean, Unit> navigateBack;
    private final Function1<DisplayableSavedPaymentMethod, Unit> onSelectPaymentMethod;
    private final Function1<DisplayableSavedPaymentMethod, Unit> onUpdatePaymentMethod;
    private final PaymentMethodMetadata paymentMethodMetadata;
    private final StateFlow<List<PaymentMethod>> paymentMethods;
    private final Function1<String, ResolvableString> providePaymentMethodName;
    private final StateFlow<PaymentSelection> selection;
    private final StateFlow<ManageScreenInteractor.State> state;
    private final Function0<Unit> toggleEdit;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultManageScreenInteractor(StateFlow<? extends List<PaymentMethod>> paymentMethods, PaymentMethodMetadata paymentMethodMetadata, StateFlow<? extends PaymentSelection> selection, StateFlow<Boolean> editing, StateFlow<Boolean> canEdit, Function0<Unit> toggleEdit, Function1<? super String, ? extends ResolvableString> providePaymentMethodName, Function1<? super DisplayableSavedPaymentMethod, Unit> onSelectPaymentMethod, Function1<? super DisplayableSavedPaymentMethod, Unit> onUpdatePaymentMethod, Function1<? super Boolean, Unit> navigateBack, StateFlow<String> defaultPaymentMethodId, CoroutineContext dispatcher) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(editing, "editing");
        Intrinsics.checkNotNullParameter(canEdit, "canEdit");
        Intrinsics.checkNotNullParameter(toggleEdit, "toggleEdit");
        Intrinsics.checkNotNullParameter(providePaymentMethodName, "providePaymentMethodName");
        Intrinsics.checkNotNullParameter(onSelectPaymentMethod, "onSelectPaymentMethod");
        Intrinsics.checkNotNullParameter(onUpdatePaymentMethod, "onUpdatePaymentMethod");
        Intrinsics.checkNotNullParameter(navigateBack, "navigateBack");
        Intrinsics.checkNotNullParameter(defaultPaymentMethodId, "defaultPaymentMethodId");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.paymentMethods = paymentMethods;
        this.paymentMethodMetadata = paymentMethodMetadata;
        this.selection = selection;
        this.editing = editing;
        this.canEdit = canEdit;
        this.toggleEdit = toggleEdit;
        this.providePaymentMethodName = providePaymentMethodName;
        this.onSelectPaymentMethod = onSelectPaymentMethod;
        this.onUpdatePaymentMethod = onUpdatePaymentMethod;
        this.navigateBack = navigateBack;
        this.defaultPaymentMethodId = defaultPaymentMethodId;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(dispatcher.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        this.coroutineScope = CoroutineScope;
        this.hasNavigatedBack = new AtomicBoolean(false);
        StateFlow<List<DisplayableSavedPaymentMethod>> stateFlowCombineAsStateFlow = StateFlowsKt.combineAsStateFlow(paymentMethods, defaultPaymentMethodId, new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultManageScreenInteractor$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DefaultManageScreenInteractor.displayableSavedPaymentMethods$lambda$1(this.f$0, (List) obj, (String) obj2);
            }
        });
        this.displayableSavedPaymentMethods = stateFlowCombineAsStateFlow;
        this.isLiveMode = paymentMethodMetadata.getStripeIntent().isLiveMode();
        this.state = StateFlowsKt.combineAsStateFlow(stateFlowCombineAsStateFlow, selection, editing, canEdit, new Function4() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultManageScreenInteractor$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return DefaultManageScreenInteractor.state$lambda$2((List) obj, (PaymentSelection) obj2, ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue());
            }
        });
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass1(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass2(null), 3, null);
    }

    public /* synthetic */ DefaultManageScreenInteractor(StateFlow stateFlow, PaymentMethodMetadata paymentMethodMetadata, StateFlow stateFlow2, StateFlow stateFlow3, StateFlow stateFlow4, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, StateFlow stateFlow5, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateFlow, paymentMethodMetadata, stateFlow2, stateFlow3, stateFlow4, function0, function1, function12, function13, function14, stateFlow5, (i & 2048) != 0 ? Dispatchers.getMain() : coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List displayableSavedPaymentMethods$lambda$1(DefaultManageScreenInteractor defaultManageScreenInteractor, List paymentMethods, String str) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        List list = paymentMethods;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(SavedPaymentMethodsExtensionKt.toDisplayableSavedPaymentMethod((PaymentMethod) it.next(), defaultManageScreenInteractor.providePaymentMethodName, defaultManageScreenInteractor.paymentMethodMetadata, str));
        }
        return arrayList;
    }

    @Override // com.stripe.android.paymentsheet.verticalmode.ManageScreenInteractor
    /* renamed from: isLiveMode, reason: from getter */
    public boolean getIsLiveMode() {
        return this.isLiveMode;
    }

    @Override // com.stripe.android.paymentsheet.verticalmode.ManageScreenInteractor
    public StateFlow<ManageScreenInteractor.State> getState() {
        return this.state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ManageScreenInteractor.State state$lambda$2(List displayablePaymentMethods, PaymentSelection paymentSelection, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(displayablePaymentMethods, "displayablePaymentMethods");
        return new ManageScreenInteractor.State(displayablePaymentMethods, z ? null : INSTANCE.paymentSelectionToDisplayableSavedPaymentMethod(paymentSelection, displayablePaymentMethods), z, z2);
    }

    /* compiled from: ManageScreenInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.verticalmode.DefaultManageScreenInteractor$1", f = "ManageScreenInteractor.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.verticalmode.DefaultManageScreenInteractor$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultManageScreenInteractor.this.new AnonymousClass1(continuation);
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
                StateFlow<ManageScreenInteractor.State> state = DefaultManageScreenInteractor.this.getState();
                final DefaultManageScreenInteractor defaultManageScreenInteractor = DefaultManageScreenInteractor.this;
                this.label = 1;
                if (state.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultManageScreenInteractor.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ManageScreenInteractor.State) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(ManageScreenInteractor.State state2, Continuation<? super Unit> continuation) {
                        if (!state2.isEditing() && !state2.getCanEdit() && state2.getPaymentMethods().size() == 1) {
                            defaultManageScreenInteractor.handlePaymentMethodSelected((DisplayableSavedPaymentMethod) CollectionsKt.first((List) state2.getPaymentMethods()));
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

    /* compiled from: ManageScreenInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.verticalmode.DefaultManageScreenInteractor$2", f = "ManageScreenInteractor.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.verticalmode.DefaultManageScreenInteractor$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultManageScreenInteractor.this.new AnonymousClass2(continuation);
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
                StateFlow stateFlow = DefaultManageScreenInteractor.this.paymentMethods;
                final DefaultManageScreenInteractor defaultManageScreenInteractor = DefaultManageScreenInteractor.this;
                this.label = 1;
                if (stateFlow.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultManageScreenInteractor.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<PaymentMethod>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(List<PaymentMethod> list, Continuation<? super Unit> continuation) {
                        if (list.isEmpty()) {
                            defaultManageScreenInteractor.safeNavigateBack(false);
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

    @Override // com.stripe.android.paymentsheet.verticalmode.ManageScreenInteractor
    public void handleViewAction(ManageScreenInteractor.ViewAction viewAction) {
        Intrinsics.checkNotNullParameter(viewAction, "viewAction");
        if (viewAction instanceof ManageScreenInteractor.ViewAction.SelectPaymentMethod) {
            handlePaymentMethodSelected(((ManageScreenInteractor.ViewAction.SelectPaymentMethod) viewAction).getPaymentMethod());
        } else if (viewAction instanceof ManageScreenInteractor.ViewAction.UpdatePaymentMethod) {
            this.onUpdatePaymentMethod.invoke(((ManageScreenInteractor.ViewAction.UpdatePaymentMethod) viewAction).getPaymentMethod());
        } else {
            if (!Intrinsics.areEqual(viewAction, ManageScreenInteractor.ViewAction.ToggleEdit.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            this.toggleEdit.invoke();
        }
    }

    @Override // com.stripe.android.paymentsheet.verticalmode.ManageScreenInteractor
    public void close() {
        CoroutineScopeKt.cancel$default(this.coroutineScope, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePaymentMethodSelected(DisplayableSavedPaymentMethod paymentMethod) {
        this.onSelectPaymentMethod.invoke(paymentMethod);
        safeNavigateBack(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void safeNavigateBack(boolean withDelay) {
        if (this.hasNavigatedBack.getAndSet(true)) {
            return;
        }
        this.navigateBack.invoke(Boolean.valueOf(withDelay));
    }

    /* compiled from: ManageScreenInteractor.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\"\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013H\u0002¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor;", "viewModel", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "customerStateHolder", "Lcom/stripe/android/paymentsheet/CustomerStateHolder;", "savedPaymentMethodMutator", "Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;", "paymentSelectionToDisplayableSavedPaymentMethod", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", BaseSheetViewModel.SAVE_SELECTION, "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "displayableSavedPaymentMethods", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ManageScreenInteractor create(final BaseSheetViewModel viewModel, PaymentMethodMetadata paymentMethodMetadata, CustomerStateHolder customerStateHolder, final SavedPaymentMethodMutator savedPaymentMethodMutator) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
            Intrinsics.checkNotNullParameter(customerStateHolder, "customerStateHolder");
            Intrinsics.checkNotNullParameter(savedPaymentMethodMutator, "savedPaymentMethodMutator");
            return new DefaultManageScreenInteractor(customerStateHolder.getPaymentMethods(), paymentMethodMetadata, viewModel.getSelection$paymentsheet_release(), savedPaymentMethodMutator.getEditing$paymentsheet_release(), savedPaymentMethodMutator.getCanEdit(), new DefaultManageScreenInteractor$Companion$create$1(savedPaymentMethodMutator), savedPaymentMethodMutator.getProvidePaymentMethodName(), new Function1() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultManageScreenInteractor$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultManageScreenInteractor.Companion.create$lambda$0(viewModel, (DisplayableSavedPaymentMethod) obj);
                }
            }, new Function1() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultManageScreenInteractor$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultManageScreenInteractor.Companion.create$lambda$1(savedPaymentMethodMutator, (DisplayableSavedPaymentMethod) obj);
                }
            }, new Function1() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultManageScreenInteractor$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultManageScreenInteractor.Companion.create$lambda$2(viewModel, ((Boolean) obj).booleanValue());
                }
            }, savedPaymentMethodMutator.getDefaultPaymentMethodId(), null, 2048, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit create$lambda$0(BaseSheetViewModel baseSheetViewModel, DisplayableSavedPaymentMethod it) {
            Intrinsics.checkNotNullParameter(it, "it");
            PaymentSelection.Saved saved = new PaymentSelection.Saved(it.getPaymentMethod(), null, null, 6, null);
            baseSheetViewModel.updateSelection(saved);
            baseSheetViewModel.getEventReporter().onSelectPaymentOption(saved);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit create$lambda$1(SavedPaymentMethodMutator savedPaymentMethodMutator, DisplayableSavedPaymentMethod it) {
            Intrinsics.checkNotNullParameter(it, "it");
            savedPaymentMethodMutator.updatePaymentMethod(it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit create$lambda$2(BaseSheetViewModel baseSheetViewModel, boolean z) {
            if (z) {
                baseSheetViewModel.getNavigationHandler().popWithDelay();
            } else {
                baseSheetViewModel.getNavigationHandler().pop();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DisplayableSavedPaymentMethod paymentSelectionToDisplayableSavedPaymentMethod(PaymentSelection selection, List<DisplayableSavedPaymentMethod> displayableSavedPaymentMethods) {
            Object obj = null;
            if (selection == null || (selection instanceof PaymentSelection.ExternalPaymentMethod) || (selection instanceof PaymentSelection.CustomPaymentMethod) || Intrinsics.areEqual(selection, PaymentSelection.GooglePay.INSTANCE) || (selection instanceof PaymentSelection.Link) || (selection instanceof PaymentSelection.ShopPay) || (selection instanceof PaymentSelection.New)) {
                return null;
            }
            if (!(selection instanceof PaymentSelection.Saved)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((PaymentSelection.Saved) selection).getPaymentMethod().id;
            Iterator<T> it = displayableSavedPaymentMethods.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((DisplayableSavedPaymentMethod) next).getPaymentMethod().id, str)) {
                    obj = next;
                    break;
                }
            }
            return (DisplayableSavedPaymentMethod) obj;
        }
    }
}
