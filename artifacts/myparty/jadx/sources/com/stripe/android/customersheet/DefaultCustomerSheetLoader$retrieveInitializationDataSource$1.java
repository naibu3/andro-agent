package com.stripe.android.customersheet;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CustomerSheetLoader.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.customersheet.DefaultCustomerSheetLoader", f = "CustomerSheetLoader.kt", i = {0}, l = {118}, m = "retrieveInitializationDataSource-IoAF18A", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class DefaultCustomerSheetLoader$retrieveInitializationDataSource$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultCustomerSheetLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultCustomerSheetLoader$retrieveInitializationDataSource$1(DefaultCustomerSheetLoader defaultCustomerSheetLoader, Continuation<? super DefaultCustomerSheetLoader$retrieveInitializationDataSource$1> continuation) {
        super(continuation);
        this.this$0 = defaultCustomerSheetLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7263retrieveInitializationDataSourceIoAF18A = this.this$0.m7263retrieveInitializationDataSourceIoAF18A(this);
        return objM7263retrieveInitializationDataSourceIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM7263retrieveInitializationDataSourceIoAF18A : Result.m9117boximpl(objM7263retrieveInitializationDataSourceIoAF18A);
    }
}
