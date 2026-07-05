package com.stripe.attestation;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: IntegrityStandardRequestManager.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.attestation.IntegrityStandardRequestManager", f = "IntegrityStandardRequestManager.kt", i = {0, 0}, l = {52}, m = "prepare-IoAF18A", n = {"this", "$this$prepare_IoAF18A_u24lambda_u242"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
final class IntegrityStandardRequestManager$prepare$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ IntegrityStandardRequestManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IntegrityStandardRequestManager$prepare$1(IntegrityStandardRequestManager integrityStandardRequestManager, Continuation<? super IntegrityStandardRequestManager$prepare$1> continuation) {
        super(continuation);
        this.this$0 = integrityStandardRequestManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo8934prepareIoAF18A = this.this$0.mo8934prepareIoAF18A(this);
        return objMo8934prepareIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8934prepareIoAF18A : Result.m9117boximpl(objMo8934prepareIoAF18A);
    }
}
