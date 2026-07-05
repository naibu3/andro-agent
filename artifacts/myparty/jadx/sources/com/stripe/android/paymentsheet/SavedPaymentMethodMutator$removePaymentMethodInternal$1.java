package com.stripe.android.paymentsheet;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SavedPaymentMethodMutator.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator", f = "SavedPaymentMethodMutator.kt", i = {0, 0, 0, 0}, l = {160, 165}, m = "removePaymentMethodInternal-gIAlu-s", n = {"this", "paymentMethodId", "currentCustomer", "canRemoveDuplicates"}, s = {"L$0", "L$1", "L$2", "Z$0"})
/* loaded from: classes6.dex */
final class SavedPaymentMethodMutator$removePaymentMethodInternal$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SavedPaymentMethodMutator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavedPaymentMethodMutator$removePaymentMethodInternal$1(SavedPaymentMethodMutator savedPaymentMethodMutator, Continuation<? super SavedPaymentMethodMutator$removePaymentMethodInternal$1> continuation) {
        super(continuation);
        this.this$0 = savedPaymentMethodMutator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8235removePaymentMethodInternalgIAlus = this.this$0.m8235removePaymentMethodInternalgIAlus(null, this);
        return objM8235removePaymentMethodInternalgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8235removePaymentMethodInternalgIAlus : Result.m9117boximpl(objM8235removePaymentMethodInternalgIAlus);
    }
}
