package com.stripe.android.link.repositories;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LinkApiRepository.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.repositories.LinkApiRepository", f = "LinkApiRepository.kt", i = {}, l = {105}, m = "mobileLookupConsumer-bMdYcbs", n = {}, s = {})
/* loaded from: classes5.dex */
final class LinkApiRepository$mobileLookupConsumer$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LinkApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkApiRepository$mobileLookupConsumer$1(LinkApiRepository linkApiRepository, Continuation<? super LinkApiRepository$mobileLookupConsumer$1> continuation) {
        super(continuation);
        this.this$0 = linkApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo7759mobileLookupConsumerbMdYcbs = this.this$0.mo7759mobileLookupConsumerbMdYcbs(null, null, null, null, null, null, this);
        return objMo7759mobileLookupConsumerbMdYcbs == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo7759mobileLookupConsumerbMdYcbs : Result.m9117boximpl(objMo7759mobileLookupConsumerbMdYcbs);
    }
}
