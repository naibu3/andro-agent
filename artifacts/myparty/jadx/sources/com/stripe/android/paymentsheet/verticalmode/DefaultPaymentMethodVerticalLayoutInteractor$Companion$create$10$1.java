package com.stripe.android.paymentsheet.verticalmode;

import com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutInteractor;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: PaymentMethodVerticalLayoutInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$Companion$create$10$1", f = "PaymentMethodVerticalLayoutInteractor.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class DefaultPaymentMethodVerticalLayoutInteractor$Companion$create$10$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DefaultPaymentMethodVerticalLayoutInteractor $interactor;
    final /* synthetic */ BaseSheetViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultPaymentMethodVerticalLayoutInteractor$Companion$create$10$1(DefaultPaymentMethodVerticalLayoutInteractor defaultPaymentMethodVerticalLayoutInteractor, BaseSheetViewModel baseSheetViewModel, Continuation<? super DefaultPaymentMethodVerticalLayoutInteractor$Companion$create$10$1> continuation) {
        super(2, continuation);
        this.$interactor = defaultPaymentMethodVerticalLayoutInteractor;
        this.$viewModel = baseSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultPaymentMethodVerticalLayoutInteractor$Companion$create$10$1(this.$interactor, this.$viewModel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefaultPaymentMethodVerticalLayoutInteractor$Companion$create$10$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow<PaymentMethodVerticalLayoutInteractor.State> state = this.$interactor.getState();
            final BaseSheetViewModel baseSheetViewModel = this.$viewModel;
            this.label = 1;
            if (state.collect(new FlowCollector() { // from class: com.stripe.android.paymentsheet.verticalmode.DefaultPaymentMethodVerticalLayoutInteractor$Companion$create$10$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((PaymentMethodVerticalLayoutInteractor.State) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(PaymentMethodVerticalLayoutInteractor.State state2, Continuation<? super Unit> continuation) {
                    baseSheetViewModel.getMandateHandler().updateMandateText(state2.getMandate(), true);
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
