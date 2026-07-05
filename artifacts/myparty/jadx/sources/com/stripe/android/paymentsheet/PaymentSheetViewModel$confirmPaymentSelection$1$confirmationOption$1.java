package com.stripe.android.paymentsheet;

import com.stripe.android.common.model.CommonConfigurationKt;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.ConfirmationOptionKtxKt;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PaymentSheetViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$confirmPaymentSelection$1$confirmationOption$1", f = "PaymentSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class PaymentSheetViewModel$confirmPaymentSelection$1$confirmationOption$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ConfirmationHandler.Option>, Object> {
    final /* synthetic */ PaymentSelection $paymentSelection;
    int label;
    final /* synthetic */ PaymentSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentSheetViewModel$confirmPaymentSelection$1$confirmationOption$1(PaymentSheetViewModel paymentSheetViewModel, PaymentSelection paymentSelection, Continuation<? super PaymentSheetViewModel$confirmPaymentSelection$1$confirmationOption$1> continuation) {
        super(2, continuation);
        this.this$0 = paymentSheetViewModel;
        this.$paymentSelection = paymentSelection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentSheetViewModel$confirmPaymentSelection$1$confirmationOption$1(this.this$0, this.$paymentSelection, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ConfirmationHandler.Option> continuation) {
        return ((PaymentSheetViewModel$confirmPaymentSelection$1$confirmationOption$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.setInProgressSelection(this.$paymentSelection);
            PaymentSelection paymentSelectionPaymentSelectionWithCvcIfEnabled = this.this$0.paymentSelectionWithCvcIfEnabled(this.$paymentSelection);
            if (paymentSelectionPaymentSelectionWithCvcIfEnabled != null) {
                return ConfirmationOptionKtxKt.toConfirmationOption(paymentSelectionPaymentSelectionWithCvcIfEnabled, CommonConfigurationKt.asCommonConfiguration(this.this$0.getConfig()), this.this$0.getLinkHandler().getLinkConfiguration().getValue());
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
