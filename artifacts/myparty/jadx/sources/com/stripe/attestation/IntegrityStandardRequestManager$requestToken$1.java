package com.stripe.attestation;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: IntegrityStandardRequestManager.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.attestation.IntegrityStandardRequestManager", f = "IntegrityStandardRequestManager.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT}, m = "requestToken-gIAlu-s", n = {}, s = {})
/* loaded from: classes6.dex */
final class IntegrityStandardRequestManager$requestToken$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ IntegrityStandardRequestManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IntegrityStandardRequestManager$requestToken$1(IntegrityStandardRequestManager integrityStandardRequestManager, Continuation<? super IntegrityStandardRequestManager$requestToken$1> continuation) {
        super(continuation);
        this.this$0 = integrityStandardRequestManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo8935requestTokengIAlus = this.this$0.mo8935requestTokengIAlus(null, this);
        return objMo8935requestTokengIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8935requestTokengIAlus : Result.m9117boximpl(objMo8935requestTokengIAlus);
    }
}
