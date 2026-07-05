package com.stripe.android.paymentelement.embedded.content;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: EmbeddedConfigurationHandler.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentelement.embedded.content.DefaultEmbeddedConfigurationHandler", f = "EmbeddedConfigurationHandler.kt", i = {}, l = {88, 134}, m = "configure-0E7RQCE", n = {}, s = {})
/* loaded from: classes5.dex */
final class DefaultEmbeddedConfigurationHandler$configure$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultEmbeddedConfigurationHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultEmbeddedConfigurationHandler$configure$1(DefaultEmbeddedConfigurationHandler defaultEmbeddedConfigurationHandler, Continuation<? super DefaultEmbeddedConfigurationHandler$configure$1> continuation) {
        super(continuation);
        this.this$0 = defaultEmbeddedConfigurationHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo8106configure0E7RQCE = this.this$0.mo8106configure0E7RQCE(null, null, this);
        return objMo8106configure0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8106configure0E7RQCE : Result.m9117boximpl(objMo8106configure0E7RQCE);
    }
}
