package com.stripe.android.link.account;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DefaultLinkAccountManager.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.account.DefaultLinkAccountManager", f = "DefaultLinkAccountManager.kt", i = {0, 0}, l = {480}, m = "updatePaymentDetails-0E7RQCE", n = {"this", "phone"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
final class DefaultLinkAccountManager$updatePaymentDetails$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultLinkAccountManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultLinkAccountManager$updatePaymentDetails$1(DefaultLinkAccountManager defaultLinkAccountManager, Continuation<? super DefaultLinkAccountManager$updatePaymentDetails$1> continuation) {
        super(continuation);
        this.this$0 = defaultLinkAccountManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo7722updatePaymentDetails0E7RQCE = this.this$0.mo7722updatePaymentDetails0E7RQCE(null, null, this);
        return objMo7722updatePaymentDetails0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo7722updatePaymentDetails0E7RQCE : Result.m9117boximpl(objMo7722updatePaymentDetails0E7RQCE);
    }
}
