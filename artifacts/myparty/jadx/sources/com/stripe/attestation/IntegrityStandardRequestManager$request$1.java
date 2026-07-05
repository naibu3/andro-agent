package com.stripe.attestation;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: IntegrityStandardRequestManager.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.attestation.IntegrityStandardRequestManager", f = "IntegrityStandardRequestManager.kt", i = {0}, l = {78}, m = "request-gIAlu-s", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class IntegrityStandardRequestManager$request$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ IntegrityStandardRequestManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IntegrityStandardRequestManager$request$1(IntegrityStandardRequestManager integrityStandardRequestManager, Continuation<? super IntegrityStandardRequestManager$request$1> continuation) {
        super(continuation);
        this.this$0 = integrityStandardRequestManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8938requestgIAlus = this.this$0.m8938requestgIAlus(null, this);
        return objM8938requestgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8938requestgIAlus : Result.m9117boximpl(objM8938requestgIAlus);
    }
}
