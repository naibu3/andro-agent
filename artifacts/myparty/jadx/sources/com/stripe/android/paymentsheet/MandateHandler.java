package com.stripe.android.paymentsheet;

import androidx.lifecycle.ViewModelKt;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.paymentsheet.MandateHandler;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.MandateText;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: MandateHandler.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0015\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\nR\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/MandateHandler;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", BaseSheetViewModel.SAVE_SELECTION, "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "merchantDisplayName", "", "isVerticalMode", "", "isSetupFlowProvider", "Lkotlin/Function0;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/StateFlow;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V", "_mandateText", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/paymentsheet/model/MandateText;", "mandateText", "getMandateText", "()Lkotlinx/coroutines/flow/StateFlow;", "updateMandateText", "", "Lcom/stripe/android/core/strings/ResolvableString;", "showAbove", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MandateHandler {
    private final MutableStateFlow<MandateText> _mandateText;
    private final Function0<Boolean> isSetupFlowProvider;
    private final boolean isVerticalMode;
    private final StateFlow<MandateText> mandateText;
    private final String merchantDisplayName;
    private final StateFlow<PaymentSelection> selection;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public MandateHandler(CoroutineScope coroutineScope, StateFlow<? extends PaymentSelection> selection, String merchantDisplayName, boolean z, Function0<Boolean> isSetupFlowProvider) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
        Intrinsics.checkNotNullParameter(isSetupFlowProvider, "isSetupFlowProvider");
        this.selection = selection;
        this.merchantDisplayName = merchantDisplayName;
        this.isVerticalMode = z;
        this.isSetupFlowProvider = isSetupFlowProvider;
        MutableStateFlow<MandateText> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._mandateText = MutableStateFlow;
        this.mandateText = MutableStateFlow;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(null), 3, null);
    }

    public final StateFlow<MandateText> getMandateText() {
        return this.mandateText;
    }

    /* compiled from: MandateHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.MandateHandler$1", f = "MandateHandler.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.MandateHandler$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MandateHandler.this.new AnonymousClass1(continuation);
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
                StateFlow stateFlow = MandateHandler.this.selection;
                final MandateHandler mandateHandler = MandateHandler.this;
                this.label = 1;
                if (stateFlow.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.MandateHandler.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((PaymentSelection) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(PaymentSelection paymentSelection, Continuation<? super Unit> continuation) {
                        ResolvableString resolvableStringMandateText = paymentSelection != null ? paymentSelection.mandateText(mandateHandler.merchantDisplayName, ((Boolean) mandateHandler.isSetupFlowProvider.invoke()).booleanValue()) : null;
                        PaymentSelection.Saved saved = paymentSelection instanceof PaymentSelection.Saved ? (PaymentSelection.Saved) paymentSelection : null;
                        boolean z = false;
                        if (saved != null && saved.getShowMandateAbovePrimaryButton()) {
                            z = true;
                        }
                        mandateHandler.updateMandateText(resolvableStringMandateText, z);
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

    public final void updateMandateText(ResolvableString mandateText, boolean showAbove) {
        MandateText mandateText2;
        MutableStateFlow<MandateText> mutableStateFlow = this._mandateText;
        if (mandateText != null) {
            mandateText2 = new MandateText(mandateText, showAbove || this.isVerticalMode);
        } else {
            mandateText2 = null;
        }
        mutableStateFlow.setValue(mandateText2);
    }

    /* compiled from: MandateHandler.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/MandateHandler$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/paymentsheet/MandateHandler;", "viewModel", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MandateHandler create(final BaseSheetViewModel viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            return new MandateHandler(ViewModelKt.getViewModelScope(viewModel), viewModel.getSelection$paymentsheet_release(), viewModel.getConfig().getMerchantDisplayName(), viewModel.getConfig().getPaymentMethodLayout$paymentsheet_release() != PaymentSheet.PaymentMethodLayout.Horizontal, new Function0() { // from class: com.stripe.android.paymentsheet.MandateHandler$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(MandateHandler.Companion.create$lambda$0(viewModel));
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean create$lambda$0(BaseSheetViewModel baseSheetViewModel) {
            PaymentMethodMetadata value = baseSheetViewModel.getPaymentMethodMetadata$paymentsheet_release().getValue();
            return (value != null ? value.getStripeIntent() : null) instanceof SetupIntent;
        }
    }
}
