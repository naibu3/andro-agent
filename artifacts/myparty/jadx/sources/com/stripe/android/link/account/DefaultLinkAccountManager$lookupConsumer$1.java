package com.stripe.android.link.account;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DefaultLinkAccountManager.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.account.DefaultLinkAccountManager", f = "DefaultLinkAccountManager.kt", i = {0, 0}, l = {82, 86}, m = "lookupConsumer-BWLJW6A", n = {"this", "startSession"}, s = {"L$0", "Z$0"})
/* loaded from: classes5.dex */
final class DefaultLinkAccountManager$lookupConsumer$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultLinkAccountManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultLinkAccountManager$lookupConsumer$1(DefaultLinkAccountManager defaultLinkAccountManager, Continuation<? super DefaultLinkAccountManager$lookupConsumer$1> continuation) {
        super(continuation);
        this.this$0 = defaultLinkAccountManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo7714lookupConsumerBWLJW6A = this.this$0.mo7714lookupConsumerBWLJW6A(null, false, null, this);
        return objMo7714lookupConsumerBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo7714lookupConsumerBWLJW6A : Result.m9117boximpl(objMo7714lookupConsumerBWLJW6A);
    }
}
