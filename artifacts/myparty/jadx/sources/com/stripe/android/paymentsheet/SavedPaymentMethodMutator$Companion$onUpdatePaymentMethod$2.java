package com.stripe.android.paymentsheet;

import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: SavedPaymentMethodMutator.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "method", "Lcom/stripe/android/model/PaymentMethod;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator$Companion$onUpdatePaymentMethod$2", f = "SavedPaymentMethodMutator.kt", i = {}, l = {392}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class SavedPaymentMethodMutator$Companion$onUpdatePaymentMethod$2 extends SuspendLambda implements Function2<PaymentMethod, Continuation<? super Throwable>, Object> {
    final /* synthetic */ Function1<Continuation<? super Throwable>, Object> $performRemove;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SavedPaymentMethodMutator$Companion$onUpdatePaymentMethod$2(Function1<? super Continuation<? super Throwable>, ? extends Object> function1, Continuation<? super SavedPaymentMethodMutator$Companion$onUpdatePaymentMethod$2> continuation) {
        super(2, continuation);
        this.$performRemove = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SavedPaymentMethodMutator$Companion$onUpdatePaymentMethod$2(this.$performRemove, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PaymentMethod paymentMethod, Continuation<? super Throwable> continuation) {
        return ((SavedPaymentMethodMutator$Companion$onUpdatePaymentMethod$2) create(paymentMethod, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Function1<Continuation<? super Throwable>, Object> function1 = this.$performRemove;
        this.label = 1;
        Object objInvoke = function1.invoke(this);
        return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
    }
}
