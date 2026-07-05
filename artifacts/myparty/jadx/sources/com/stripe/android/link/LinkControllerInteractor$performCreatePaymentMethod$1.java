package com.stripe.android.link;

import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LinkControllerInteractor.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.LinkControllerInteractor", f = "LinkControllerInteractor.kt", i = {}, l = {WalletConstants.ERROR_CODE_INVALID_PARAMETERS, WalletConstants.ERROR_CODE_ILLEGAL_CALLER}, m = "performCreatePaymentMethod-IoAF18A", n = {}, s = {})
/* loaded from: classes5.dex */
final class LinkControllerInteractor$performCreatePaymentMethod$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LinkControllerInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkControllerInteractor$performCreatePaymentMethod$1(LinkControllerInteractor linkControllerInteractor, Continuation<? super LinkControllerInteractor$performCreatePaymentMethod$1> continuation) {
        super(continuation);
        this.this$0 = linkControllerInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7690performCreatePaymentMethodIoAF18A = this.this$0.m7690performCreatePaymentMethodIoAF18A(this);
        return objM7690performCreatePaymentMethodIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM7690performCreatePaymentMethodIoAF18A : Result.m9117boximpl(objM7690performCreatePaymentMethodIoAF18A);
    }
}
