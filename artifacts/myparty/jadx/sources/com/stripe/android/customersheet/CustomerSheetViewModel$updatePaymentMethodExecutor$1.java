package com.stripe.android.customersheet;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CustomerSheetViewModel.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel", f = "CustomerSheetViewModel.kt", i = {}, l = {TypedValues.MotionType.TYPE_POLAR_RELATIVETO}, m = "updatePaymentMethodExecutor-0E7RQCE", n = {}, s = {})
/* loaded from: classes5.dex */
final class CustomerSheetViewModel$updatePaymentMethodExecutor$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CustomerSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerSheetViewModel$updatePaymentMethodExecutor$1(CustomerSheetViewModel customerSheetViewModel, Continuation<? super CustomerSheetViewModel$updatePaymentMethodExecutor$1> continuation) {
        super(continuation);
        this.this$0 = customerSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7260updatePaymentMethodExecutor0E7RQCE = this.this$0.m7260updatePaymentMethodExecutor0E7RQCE(null, null, this);
        return objM7260updatePaymentMethodExecutor0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM7260updatePaymentMethodExecutor0E7RQCE : Result.m9117boximpl(objM7260updatePaymentMethodExecutor0E7RQCE);
    }
}
