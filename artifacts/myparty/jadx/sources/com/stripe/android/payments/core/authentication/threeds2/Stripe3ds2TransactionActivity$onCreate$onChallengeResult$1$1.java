package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Stripe3ds2TransactionActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$onCreate$onChallengeResult$1$1", f = "Stripe3ds2TransactionActivity.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class Stripe3ds2TransactionActivity$onCreate$onChallengeResult$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChallengeResult $challengeResult;
    final /* synthetic */ Lazy<Stripe3ds2TransactionViewModel> $viewModel$delegate;
    Object L$0;
    int label;
    final /* synthetic */ Stripe3ds2TransactionActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Stripe3ds2TransactionActivity$onCreate$onChallengeResult$1$1(Stripe3ds2TransactionActivity stripe3ds2TransactionActivity, ChallengeResult challengeResult, Lazy<Stripe3ds2TransactionViewModel> lazy, Continuation<? super Stripe3ds2TransactionActivity$onCreate$onChallengeResult$1$1> continuation) {
        super(2, continuation);
        this.this$0 = stripe3ds2TransactionActivity;
        this.$challengeResult = challengeResult;
        this.$viewModel$delegate = lazy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Stripe3ds2TransactionActivity$onCreate$onChallengeResult$1$1(this.this$0, this.$challengeResult, this.$viewModel$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Stripe3ds2TransactionActivity$onCreate$onChallengeResult$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Stripe3ds2TransactionActivity stripe3ds2TransactionActivity;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Stripe3ds2TransactionActivity stripe3ds2TransactionActivity2 = this.this$0;
            this.L$0 = stripe3ds2TransactionActivity2;
            this.label = 1;
            Object objProcessChallengeResult = Stripe3ds2TransactionActivity.onCreate$lambda$9(this.$viewModel$delegate).processChallengeResult(this.$challengeResult, this);
            if (objProcessChallengeResult == coroutine_suspended) {
                return coroutine_suspended;
            }
            stripe3ds2TransactionActivity = stripe3ds2TransactionActivity2;
            obj = objProcessChallengeResult;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stripe3ds2TransactionActivity = (Stripe3ds2TransactionActivity) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        stripe3ds2TransactionActivity.finishWithResult((PaymentFlowResult.Unvalidated) obj);
        return Unit.INSTANCE;
    }
}
