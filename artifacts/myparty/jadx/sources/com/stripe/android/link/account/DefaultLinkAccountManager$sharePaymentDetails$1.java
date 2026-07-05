package com.stripe.android.link.account;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DefaultLinkAccountManager.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.account.DefaultLinkAccountManager", f = "DefaultLinkAccountManager.kt", i = {}, l = {346}, m = "sharePaymentDetails-yxL6bBk", n = {}, s = {})
/* loaded from: classes5.dex */
final class DefaultLinkAccountManager$sharePaymentDetails$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultLinkAccountManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultLinkAccountManager$sharePaymentDetails$1(DefaultLinkAccountManager defaultLinkAccountManager, Continuation<? super DefaultLinkAccountManager$sharePaymentDetails$1> continuation) {
        super(continuation);
        this.this$0 = defaultLinkAccountManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo7718sharePaymentDetailsyxL6bBk = this.this$0.mo7718sharePaymentDetailsyxL6bBk(null, null, null, null, this);
        return objMo7718sharePaymentDetailsyxL6bBk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo7718sharePaymentDetailsyxL6bBk : Result.m9117boximpl(objMo7718sharePaymentDetailsyxL6bBk);
    }
}
