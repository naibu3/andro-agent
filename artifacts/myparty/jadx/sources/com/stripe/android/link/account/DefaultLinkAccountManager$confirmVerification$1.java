package com.stripe.android.link.account;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DefaultLinkAccountManager.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.account.DefaultLinkAccountManager", f = "DefaultLinkAccountManager.kt", i = {0}, l = {TypedValues.CycleType.TYPE_WAVE_PERIOD, 433}, m = "confirmVerification-gIAlu-s", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class DefaultLinkAccountManager$confirmVerification$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultLinkAccountManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultLinkAccountManager$confirmVerification$1(DefaultLinkAccountManager defaultLinkAccountManager, Continuation<? super DefaultLinkAccountManager$confirmVerification$1> continuation) {
        super(continuation);
        this.this$0 = defaultLinkAccountManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo7705confirmVerificationgIAlus = this.this$0.mo7705confirmVerificationgIAlus(null, this);
        return objMo7705confirmVerificationgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo7705confirmVerificationgIAlus : Result.m9117boximpl(objMo7705confirmVerificationgIAlus);
    }
}
