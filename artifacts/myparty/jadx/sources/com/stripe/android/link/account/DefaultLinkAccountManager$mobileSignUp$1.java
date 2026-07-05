package com.stripe.android.link.account;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DefaultLinkAccountManager.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.account.DefaultLinkAccountManager", f = "DefaultLinkAccountManager.kt", i = {0}, l = {248, 260}, m = "mobileSignUp-eH_QyT8", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class DefaultLinkAccountManager$mobileSignUp$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultLinkAccountManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultLinkAccountManager$mobileSignUp$1(DefaultLinkAccountManager defaultLinkAccountManager, Continuation<? super DefaultLinkAccountManager$mobileSignUp$1> continuation) {
        super(continuation);
        this.this$0 = defaultLinkAccountManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo7716mobileSignUpeH_QyT8 = this.this$0.mo7716mobileSignUpeH_QyT8(null, null, null, null, null, null, null, this);
        return objMo7716mobileSignUpeH_QyT8 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo7716mobileSignUpeH_QyT8 : Result.m9117boximpl(objMo7716mobileSignUpeH_QyT8);
    }
}
