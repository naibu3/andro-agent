package com.stripe.android.paymentsheet;

import com.stripe.android.common.model.CommonConfigurationKt;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PaymentSheetViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$loadPaymentSheetState$result$1", f = "PaymentSheetViewModel.kt", i = {}, l = {242}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class PaymentSheetViewModel$loadPaymentSheetState$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends PaymentElementLoader.State>>, Object> {
    int label;
    final /* synthetic */ PaymentSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentSheetViewModel$loadPaymentSheetState$result$1(PaymentSheetViewModel paymentSheetViewModel, Continuation<? super PaymentSheetViewModel$loadPaymentSheetState$result$1> continuation) {
        super(2, continuation);
        this.this$0 = paymentSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentSheetViewModel$loadPaymentSheetState$result$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends PaymentElementLoader.State>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<PaymentElementLoader.State>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<PaymentElementLoader.State>> continuation) {
        return ((PaymentSheetViewModel$loadPaymentSheetState$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objMo8425loadBWLJW6A;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            objMo8425loadBWLJW6A = this.this$0.paymentElementLoader.mo8425loadBWLJW6A(this.this$0.getArgs().getInitializationMode$paymentsheet_release(), CommonConfigurationKt.asCommonConfiguration(this.this$0.getArgs().getConfig$paymentsheet_release()), new PaymentElementLoader.Metadata(this.this$0.confirmationHandler.getHasReloadedFromProcessDeath(), this.this$0.getArgs().getInitializedViaCompose()), this);
            if (objMo8425loadBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8425loadBWLJW6A = ((Result) obj).getValue();
        }
        return Result.m9117boximpl(objMo8425loadBWLJW6A);
    }
}
