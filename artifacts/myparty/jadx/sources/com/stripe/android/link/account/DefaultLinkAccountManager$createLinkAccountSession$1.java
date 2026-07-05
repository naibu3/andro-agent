package com.stripe.android.link.account;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DefaultLinkAccountManager.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.account.DefaultLinkAccountManager", f = "DefaultLinkAccountManager.kt", i = {}, l = {120}, m = "createLinkAccountSession-IoAF18A", n = {}, s = {})
/* loaded from: classes5.dex */
final class DefaultLinkAccountManager$createLinkAccountSession$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultLinkAccountManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultLinkAccountManager$createLinkAccountSession$1(DefaultLinkAccountManager defaultLinkAccountManager, Continuation<? super DefaultLinkAccountManager$createLinkAccountSession$1> continuation) {
        super(continuation);
        this.this$0 = defaultLinkAccountManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo7708createLinkAccountSessionIoAF18A = this.this$0.mo7708createLinkAccountSessionIoAF18A(this);
        return objMo7708createLinkAccountSessionIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo7708createLinkAccountSessionIoAF18A : Result.m9117boximpl(objMo7708createLinkAccountSessionIoAF18A);
    }
}
