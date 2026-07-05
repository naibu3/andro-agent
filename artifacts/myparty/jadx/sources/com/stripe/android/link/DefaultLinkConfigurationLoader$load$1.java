package com.stripe.android.link;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LinkConfigurationLoader.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.DefaultLinkConfigurationLoader", f = "LinkConfigurationLoader.kt", i = {0}, l = {24}, m = "load-gIAlu-s", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class DefaultLinkConfigurationLoader$load$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultLinkConfigurationLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultLinkConfigurationLoader$load$1(DefaultLinkConfigurationLoader defaultLinkConfigurationLoader, Continuation<? super DefaultLinkConfigurationLoader$load$1> continuation) {
        super(continuation);
        this.this$0 = defaultLinkConfigurationLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo7675loadgIAlus = this.this$0.mo7675loadgIAlus(null, this);
        return objMo7675loadgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo7675loadgIAlus : Result.m9117boximpl(objMo7675loadgIAlus);
    }
}
