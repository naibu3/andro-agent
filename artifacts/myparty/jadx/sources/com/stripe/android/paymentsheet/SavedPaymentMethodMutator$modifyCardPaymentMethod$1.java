package com.stripe.android.paymentsheet;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SavedPaymentMethodMutator.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator", f = "SavedPaymentMethodMutator.kt", i = {0, 0, 0, 0, 1, 1}, l = {272, 291}, m = "modifyCardPaymentMethod-BWLJW6A", n = {"this", "cardUpdateParams", "onSuccess", "currentCustomer", "this", "cardUpdateParams"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
/* loaded from: classes6.dex */
final class SavedPaymentMethodMutator$modifyCardPaymentMethod$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SavedPaymentMethodMutator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavedPaymentMethodMutator$modifyCardPaymentMethod$1(SavedPaymentMethodMutator savedPaymentMethodMutator, Continuation<? super SavedPaymentMethodMutator$modifyCardPaymentMethod$1> continuation) {
        super(continuation);
        this.this$0 = savedPaymentMethodMutator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8236modifyCardPaymentMethodBWLJW6A = this.this$0.m8236modifyCardPaymentMethodBWLJW6A(null, null, null, this);
        return objM8236modifyCardPaymentMethodBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8236modifyCardPaymentMethodBWLJW6A : Result.m9117boximpl(objM8236modifyCardPaymentMethodBWLJW6A);
    }
}
