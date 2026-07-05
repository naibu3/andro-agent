package com.stripe.android.paymentsheet.repositories;

import com.facebook.internal.NativeProtocol;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ElementsSessionRepository.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.repositories.RealElementsSessionRepository", f = "ElementsSessionRepository.kt", i = {0, 0}, l = {72, 78}, m = "get-hUnOzRk", n = {"this", NativeProtocol.WEB_DIALOG_PARAMS}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
final class RealElementsSessionRepository$get$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RealElementsSessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealElementsSessionRepository$get$1(RealElementsSessionRepository realElementsSessionRepository, Continuation<? super RealElementsSessionRepository$get$1> continuation) {
        super(continuation);
        this.this$0 = realElementsSessionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo8420gethUnOzRk = this.this$0.mo8420gethUnOzRk(null, null, null, null, null, this);
        return objMo8420gethUnOzRk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8420gethUnOzRk : Result.m9117boximpl(objMo8420gethUnOzRk);
    }
}
