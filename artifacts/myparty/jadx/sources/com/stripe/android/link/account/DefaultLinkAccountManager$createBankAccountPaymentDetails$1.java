package com.stripe.android.link.account;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DefaultLinkAccountManager.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.account.DefaultLinkAccountManager", f = "DefaultLinkAccountManager.kt", i = {}, l = {324}, m = "createBankAccountPaymentDetails-gIAlu-s", n = {}, s = {})
/* loaded from: classes5.dex */
final class DefaultLinkAccountManager$createBankAccountPaymentDetails$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultLinkAccountManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultLinkAccountManager$createBankAccountPaymentDetails$1(DefaultLinkAccountManager defaultLinkAccountManager, Continuation<? super DefaultLinkAccountManager$createBankAccountPaymentDetails$1> continuation) {
        super(continuation);
        this.this$0 = defaultLinkAccountManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo7706createBankAccountPaymentDetailsgIAlus = this.this$0.mo7706createBankAccountPaymentDetailsgIAlus(null, this);
        return objMo7706createBankAccountPaymentDetailsgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo7706createBankAccountPaymentDetailsgIAlus : Result.m9117boximpl(objMo7706createBankAccountPaymentDetailsgIAlus);
    }
}
