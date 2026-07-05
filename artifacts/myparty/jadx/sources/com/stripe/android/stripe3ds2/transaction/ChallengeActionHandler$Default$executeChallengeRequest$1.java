package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ChallengeActionHandler.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default", f = "ChallengeActionHandler.kt", i = {0, 0, 1, 1}, l = {79, 82}, m = "executeChallengeRequest", n = {"this", "creqData", "this", "creqData"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes6.dex */
final class ChallengeActionHandler$Default$executeChallengeRequest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChallengeActionHandler.Default this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChallengeActionHandler$Default$executeChallengeRequest$1(ChallengeActionHandler.Default r1, Continuation<? super ChallengeActionHandler$Default$executeChallengeRequest$1> continuation) {
        super(continuation);
        this.this$0 = r1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.executeChallengeRequest(null, this);
    }
}
