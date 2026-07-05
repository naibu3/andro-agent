package com.stripe.android.customersheet.data;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CustomerAdapterDataSource.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource", f = "CustomerAdapterDataSource.kt", i = {0}, l = {143}, m = "fetchInitialPaymentMethods-IoAF18A", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class CustomerAdapterDataSource$fetchInitialPaymentMethods$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CustomerAdapterDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerAdapterDataSource$fetchInitialPaymentMethods$1(CustomerAdapterDataSource customerAdapterDataSource, Continuation<? super CustomerAdapterDataSource$fetchInitialPaymentMethods$1> continuation) {
        super(continuation);
        this.this$0 = customerAdapterDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7267fetchInitialPaymentMethodsIoAF18A = this.this$0.m7267fetchInitialPaymentMethodsIoAF18A(this);
        return objM7267fetchInitialPaymentMethodsIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM7267fetchInitialPaymentMethodsIoAF18A : Result.m9117boximpl(objM7267fetchInitialPaymentMethodsIoAF18A);
    }
}
