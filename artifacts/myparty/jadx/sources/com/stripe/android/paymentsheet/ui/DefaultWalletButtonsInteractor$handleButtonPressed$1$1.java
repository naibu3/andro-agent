package com.stripe.android.paymentsheet.ui;

import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WalletButtonsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultWalletButtonsInteractor$handleButtonPressed$1$1", f = "WalletButtonsInteractor.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class DefaultWalletButtonsInteractor$handleButtonPressed$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ConfirmationHandler.Args $it;
    int label;
    final /* synthetic */ DefaultWalletButtonsInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultWalletButtonsInteractor$handleButtonPressed$1$1(DefaultWalletButtonsInteractor defaultWalletButtonsInteractor, ConfirmationHandler.Args args, Continuation<? super DefaultWalletButtonsInteractor$handleButtonPressed$1$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultWalletButtonsInteractor;
        this.$it = args;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultWalletButtonsInteractor$handleButtonPressed$1$1(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefaultWalletButtonsInteractor$handleButtonPressed$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (this.this$0.confirmationHandler.start(this.$it, this) == coroutine_suspended) {
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
