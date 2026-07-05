package com.stripe.android.customersheet;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CustomerSheetLoader.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.customersheet.DefaultCustomerSheetLoader", f = "CustomerSheetLoader.kt", i = {0, 0, 1, 1, 2, 2, 2}, l = {73, 75, 91}, m = "load-gIAlu-s", n = {"this", "configuration", "this", "configuration", "this", "configuration", "customerSheetSession"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"})
/* loaded from: classes5.dex */
final class DefaultCustomerSheetLoader$load$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultCustomerSheetLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultCustomerSheetLoader$load$1(DefaultCustomerSheetLoader defaultCustomerSheetLoader, Continuation<? super DefaultCustomerSheetLoader$load$1> continuation) {
        super(continuation);
        this.this$0 = defaultCustomerSheetLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo7250loadgIAlus = this.this$0.mo7250loadgIAlus(null, this);
        return objMo7250loadgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo7250loadgIAlus : Result.m9117boximpl(objMo7250loadgIAlus);
    }
}
