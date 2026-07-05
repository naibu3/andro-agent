package com.stripe.android.link;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LinkConfigurationCoordinator.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.RealLinkConfigurationCoordinator", f = "LinkConfigurationCoordinator.kt", i = {}, l = {94}, m = "signInWithUserInput-0E7RQCE", n = {}, s = {})
/* loaded from: classes5.dex */
final class RealLinkConfigurationCoordinator$signInWithUserInput$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RealLinkConfigurationCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealLinkConfigurationCoordinator$signInWithUserInput$1(RealLinkConfigurationCoordinator realLinkConfigurationCoordinator, Continuation<? super RealLinkConfigurationCoordinator$signInWithUserInput$1> continuation) {
        super(continuation);
        this.this$0 = realLinkConfigurationCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo7681signInWithUserInput0E7RQCE = this.this$0.mo7681signInWithUserInput0E7RQCE(null, null, this);
        return objMo7681signInWithUserInput0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo7681signInWithUserInput0E7RQCE : Result.m9117boximpl(objMo7681signInWithUserInput0E7RQCE);
    }
}
