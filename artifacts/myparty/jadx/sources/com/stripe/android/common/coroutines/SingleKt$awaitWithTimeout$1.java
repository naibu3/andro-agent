package com.stripe.android.common.coroutines;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Single.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.common.coroutines.SingleKt", f = "Single.kt", i = {0}, l = {17}, m = "awaitWithTimeout-dWUq8MI", n = {"timeoutMessage"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class SingleKt$awaitWithTimeout$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    SingleKt$awaitWithTimeout$1(Continuation<? super SingleKt$awaitWithTimeout$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7214awaitWithTimeoutdWUq8MI = SingleKt.m7214awaitWithTimeoutdWUq8MI(null, 0L, null, this);
        return objM7214awaitWithTimeoutdWUq8MI == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM7214awaitWithTimeoutdWUq8MI : Result.m9117boximpl(objM7214awaitWithTimeoutdWUq8MI);
    }
}
