package com.stripe.android.link.ui.wallet;

import com.stripe.android.model.ConsumerPaymentDetails;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WalletScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.ui.wallet.WalletScreenKt$PaymentMethodSection$3$1$1$1$1$1$1", f = "WalletScreen.kt", i = {}, l = {377}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class WalletScreenKt$PaymentMethodSection$3$1$1$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $hideBottomSheetContent;
    final /* synthetic */ ConsumerPaymentDetails.PaymentDetails $it;
    final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onSetDefaultClicked;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WalletScreenKt$PaymentMethodSection$3$1$1$1$1$1$1(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function12, ConsumerPaymentDetails.PaymentDetails paymentDetails, Continuation<? super WalletScreenKt$PaymentMethodSection$3$1$1$1$1$1$1> continuation) {
        super(2, continuation);
        this.$hideBottomSheetContent = function1;
        this.$onSetDefaultClicked = function12;
        this.$it = paymentDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletScreenKt$PaymentMethodSection$3$1$1$1$1$1$1(this.$hideBottomSheetContent, this.$onSetDefaultClicked, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletScreenKt$PaymentMethodSection$3$1$1$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Function1<Continuation<? super Unit>, Object> function1 = this.$hideBottomSheetContent;
            this.label = 1;
            if (function1.invoke(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$onSetDefaultClicked.invoke(this.$it);
        return Unit.INSTANCE;
    }
}
