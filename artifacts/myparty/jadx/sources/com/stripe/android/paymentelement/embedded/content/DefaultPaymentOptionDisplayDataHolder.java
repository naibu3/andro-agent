package com.stripe.android.paymentelement.embedded.content;

import com.stripe.android.core.injection.ViewModelScope;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentelement.embedded.EmbeddedSelectionHolder;
import com.stripe.android.paymentelement.embedded.content.EmbeddedConfirmationStateHolder;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import javax.inject.Inject;
import javax.inject.Singleton;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: PaymentOptionDisplayDataHolder.kt */
@Singleton
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B3\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/DefaultPaymentOptionDisplayDataHolder;", "Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataHolder;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "selectionHolder", "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;", "confirmationStateSupplier", "Lkotlin/Function0;", "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;", "paymentOptionDisplayDataFactory", "Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentelement/embedded/content/PaymentOptionDisplayDataFactory;)V", "_paymentOption", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$PaymentOptionDisplayData;", "paymentOption", "Lkotlinx/coroutines/flow/StateFlow;", "getPaymentOption", "()Lkotlinx/coroutines/flow/StateFlow;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultPaymentOptionDisplayDataHolder implements PaymentOptionDisplayDataHolder {
    public static final int $stable = 8;
    private final MutableStateFlow<EmbeddedPaymentElement.PaymentOptionDisplayData> _paymentOption;
    private final Function0<EmbeddedConfirmationStateHolder.State> confirmationStateSupplier;
    private final CoroutineScope coroutineScope;
    private final StateFlow<EmbeddedPaymentElement.PaymentOptionDisplayData> paymentOption;
    private final PaymentOptionDisplayDataFactory paymentOptionDisplayDataFactory;
    private final EmbeddedSelectionHolder selectionHolder;

    @Inject
    public DefaultPaymentOptionDisplayDataHolder(@ViewModelScope CoroutineScope coroutineScope, EmbeddedSelectionHolder selectionHolder, Function0<EmbeddedConfirmationStateHolder.State> confirmationStateSupplier, PaymentOptionDisplayDataFactory paymentOptionDisplayDataFactory) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(selectionHolder, "selectionHolder");
        Intrinsics.checkNotNullParameter(confirmationStateSupplier, "confirmationStateSupplier");
        Intrinsics.checkNotNullParameter(paymentOptionDisplayDataFactory, "paymentOptionDisplayDataFactory");
        this.coroutineScope = coroutineScope;
        this.selectionHolder = selectionHolder;
        this.confirmationStateSupplier = confirmationStateSupplier;
        this.paymentOptionDisplayDataFactory = paymentOptionDisplayDataFactory;
        MutableStateFlow<EmbeddedPaymentElement.PaymentOptionDisplayData> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._paymentOption = MutableStateFlow;
        this.paymentOption = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // com.stripe.android.paymentelement.embedded.content.PaymentOptionDisplayDataHolder
    public StateFlow<EmbeddedPaymentElement.PaymentOptionDisplayData> getPaymentOption() {
        return this.paymentOption;
    }

    /* compiled from: PaymentOptionDisplayDataHolder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.embedded.content.DefaultPaymentOptionDisplayDataHolder$1", f = "PaymentOptionDisplayDataHolder.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentelement.embedded.content.DefaultPaymentOptionDisplayDataHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultPaymentOptionDisplayDataHolder.this.new AnonymousClass1(continuation);
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
                StateFlow<PaymentSelection> selection = DefaultPaymentOptionDisplayDataHolder.this.selectionHolder.getSelection();
                final DefaultPaymentOptionDisplayDataHolder defaultPaymentOptionDisplayDataHolder = DefaultPaymentOptionDisplayDataHolder.this;
                this.label = 1;
                if (selection.collect(new FlowCollector() { // from class: com.stripe.android.paymentelement.embedded.content.DefaultPaymentOptionDisplayDataHolder.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((PaymentSelection) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(PaymentSelection paymentSelection, Continuation<? super Unit> continuation) {
                        EmbeddedConfirmationStateHolder.State state = (EmbeddedConfirmationStateHolder.State) defaultPaymentOptionDisplayDataHolder.confirmationStateSupplier.invoke();
                        if (state == null) {
                            defaultPaymentOptionDisplayDataHolder._paymentOption.setValue(null);
                        } else {
                            defaultPaymentOptionDisplayDataHolder._paymentOption.setValue(defaultPaymentOptionDisplayDataHolder.paymentOptionDisplayDataFactory.create(paymentSelection, state.getPaymentMethodMetadata()));
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
}
