package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import com.stripe.android.model.CardBrand;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcCompletionState;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionInteractor;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import com.stripe.android.uicore.utils.StateFlowsKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: CvcRecollectionInteractor.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001aB=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/DefaultCvcRecollectionInteractor;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionInteractor;", "lastFour", "", "cardBrand", "Lcom/stripe/android/model/CardBrand;", "cvc", "isTestMode", "", BaseSheetViewModel.SAVE_PROCESSING, "Lkotlinx/coroutines/flow/StateFlow;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;ZLkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/CoroutineScope;)V", "_viewState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionViewState;", "viewState", "getViewState", "()Lkotlinx/coroutines/flow/StateFlow;", "cvcCompletionState", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcCompletionState;", "getCvcCompletionState", "onCvcChanged", "", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultCvcRecollectionInteractor implements CvcRecollectionInteractor {
    public static final int $stable = 8;
    private final MutableStateFlow<CvcRecollectionViewState> _viewState;
    private final CardBrand cardBrand;
    private final String cvc;
    private final StateFlow<CvcCompletionState> cvcCompletionState;
    private final boolean isTestMode;
    private final String lastFour;
    private final StateFlow<Boolean> processing;
    private final StateFlow<CvcRecollectionViewState> viewState;

    public DefaultCvcRecollectionInteractor(String lastFour, CardBrand cardBrand, String cvc, boolean z, StateFlow<Boolean> processing, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(cardBrand, "cardBrand");
        Intrinsics.checkNotNullParameter(cvc, "cvc");
        Intrinsics.checkNotNullParameter(processing, "processing");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.lastFour = lastFour;
        this.cardBrand = cardBrand;
        this.cvc = cvc;
        this.isTestMode = z;
        this.processing = processing;
        MutableStateFlow<CvcRecollectionViewState> MutableStateFlow = StateFlowKt.MutableStateFlow(new CvcRecollectionViewState(lastFour, z, new CvcState(cvc, cardBrand), !processing.getValue().booleanValue()));
        this._viewState = MutableStateFlow;
        this.viewState = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(null), 3, null);
        this.cvcCompletionState = StateFlowsKt.mapAsStateFlow(MutableStateFlow, new Function1() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.DefaultCvcRecollectionInteractor$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultCvcRecollectionInteractor.cvcCompletionState$lambda$0((CvcRecollectionViewState) obj);
            }
        });
    }

    @Override // com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionInteractor
    public StateFlow<CvcRecollectionViewState> getViewState() {
        return this.viewState;
    }

    /* compiled from: CvcRecollectionInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.DefaultCvcRecollectionInteractor$1", f = "CvcRecollectionInteractor.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.DefaultCvcRecollectionInteractor$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultCvcRecollectionInteractor.this.new AnonymousClass1(continuation);
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
                StateFlow stateFlow = DefaultCvcRecollectionInteractor.this.processing;
                final DefaultCvcRecollectionInteractor defaultCvcRecollectionInteractor = DefaultCvcRecollectionInteractor.this;
                this.label = 1;
                if (stateFlow.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.DefaultCvcRecollectionInteractor.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        Object value;
                        MutableStateFlow mutableStateFlow = defaultCvcRecollectionInteractor._viewState;
                        do {
                            value = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.compareAndSet(value, CvcRecollectionViewState.copy$default((CvcRecollectionViewState) value, null, false, null, !z, 7, null)));
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

    @Override // com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionInteractor
    public StateFlow<CvcCompletionState> getCvcCompletionState() {
        return this.cvcCompletionState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CvcCompletionState cvcCompletionState$lambda$0(CvcRecollectionViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getCvcState().getIsValid()) {
            return new CvcCompletionState.Completed(state.getCvcState().getCvc());
        }
        return CvcCompletionState.Incomplete.INSTANCE;
    }

    @Override // com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionInteractor
    public void onCvcChanged(String cvc) {
        CvcRecollectionViewState value;
        CvcRecollectionViewState cvcRecollectionViewState;
        Intrinsics.checkNotNullParameter(cvc, "cvc");
        MutableStateFlow<CvcRecollectionViewState> mutableStateFlow = this._viewState;
        do {
            value = mutableStateFlow.getValue();
            cvcRecollectionViewState = value;
        } while (!mutableStateFlow.compareAndSet(value, CvcRecollectionViewState.copy$default(cvcRecollectionViewState, null, false, cvcRecollectionViewState.getCvcState().updateCvc(cvc), false, 11, null)));
    }

    /* compiled from: CvcRecollectionInteractor.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/DefaultCvcRecollectionInteractor$Factory;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionInteractor$Factory;", "<init>", "()V", "create", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionInteractor;", CardScanActivity.ARGS, "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/Args;", BaseSheetViewModel.SAVE_PROCESSING, "Lkotlinx/coroutines/flow/StateFlow;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements CvcRecollectionInteractor.Factory {
        public static final int $stable = 0;
        public static final Factory INSTANCE = new Factory();

        private Factory() {
        }

        @Override // com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionInteractor.Factory
        public CvcRecollectionInteractor create(Args args, StateFlow<Boolean> processing, CoroutineScope coroutineScope) {
            Intrinsics.checkNotNullParameter(args, "args");
            Intrinsics.checkNotNullParameter(processing, "processing");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            return new DefaultCvcRecollectionInteractor(args.getLastFour(), args.getCardBrand(), args.getCvc(), args.isTestMode(), processing, coroutineScope);
        }
    }
}
