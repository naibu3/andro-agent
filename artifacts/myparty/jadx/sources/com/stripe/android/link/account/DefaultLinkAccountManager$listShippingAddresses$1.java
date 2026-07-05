package com.stripe.android.link.account;

import com.facebook.internal.FacebookRequestErrorClassification;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DefaultLinkAccountManager.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.account.DefaultLinkAccountManager", f = "DefaultLinkAccountManager.kt", i = {}, l = {FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED}, m = "listShippingAddresses-IoAF18A", n = {}, s = {})
/* loaded from: classes5.dex */
final class DefaultLinkAccountManager$listShippingAddresses$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultLinkAccountManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultLinkAccountManager$listShippingAddresses$1(DefaultLinkAccountManager defaultLinkAccountManager, Continuation<? super DefaultLinkAccountManager$listShippingAddresses$1> continuation) {
        super(continuation);
        this.this$0 = defaultLinkAccountManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo7712listShippingAddressesIoAF18A = this.this$0.mo7712listShippingAddressesIoAF18A(this);
        return objMo7712listShippingAddressesIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo7712listShippingAddressesIoAF18A : Result.m9117boximpl(objMo7712listShippingAddressesIoAF18A);
    }
}
