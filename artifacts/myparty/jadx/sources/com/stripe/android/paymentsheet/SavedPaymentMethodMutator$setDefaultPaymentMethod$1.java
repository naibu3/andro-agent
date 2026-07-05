package com.stripe.android.paymentsheet;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SavedPaymentMethodMutator.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator", f = "SavedPaymentMethodMutator.kt", i = {0, 0, 1, 1}, l = {221, 234}, m = "setDefaultPaymentMethod-gIAlu-s$paymentsheet_release", n = {"this", "paymentMethod", "this", "paymentMethod"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes6.dex */
final class SavedPaymentMethodMutator$setDefaultPaymentMethod$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SavedPaymentMethodMutator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavedPaymentMethodMutator$setDefaultPaymentMethod$1(SavedPaymentMethodMutator savedPaymentMethodMutator, Continuation<? super SavedPaymentMethodMutator$setDefaultPaymentMethod$1> continuation) {
        super(continuation);
        this.this$0 = savedPaymentMethodMutator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8237setDefaultPaymentMethodgIAlus$paymentsheet_release = this.this$0.m8237setDefaultPaymentMethodgIAlus$paymentsheet_release(null, this);
        return objM8237setDefaultPaymentMethodgIAlus$paymentsheet_release == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8237setDefaultPaymentMethodgIAlus$paymentsheet_release : Result.m9117boximpl(objM8237setDefaultPaymentMethodgIAlus$paymentsheet_release);
    }
}
