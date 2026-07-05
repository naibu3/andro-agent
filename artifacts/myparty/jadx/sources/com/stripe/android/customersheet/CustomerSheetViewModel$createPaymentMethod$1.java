package com.stripe.android.customersheet;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CustomerSheetViewModel.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel", f = "CustomerSheetViewModel.kt", i = {}, l = {962}, m = "createPaymentMethod-gIAlu-s", n = {}, s = {})
/* loaded from: classes5.dex */
final class CustomerSheetViewModel$createPaymentMethod$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CustomerSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerSheetViewModel$createPaymentMethod$1(CustomerSheetViewModel customerSheetViewModel, Continuation<? super CustomerSheetViewModel$createPaymentMethod$1> continuation) {
        super(continuation);
        this.this$0 = customerSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7259createPaymentMethodgIAlus = this.this$0.m7259createPaymentMethodgIAlus(null, this);
        return objM7259createPaymentMethodgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM7259createPaymentMethodgIAlus : Result.m9117boximpl(objM7259createPaymentMethodgIAlus);
    }
}
