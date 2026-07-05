package com.stripe.android.payments.paymentlauncher;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PaymentLauncherViewModel.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel", f = "PaymentLauncherViewModel.kt", i = {}, l = {188, 195}, m = "confirmIntent-0E7RQCE", n = {}, s = {})
/* loaded from: classes6.dex */
final class PaymentLauncherViewModel$confirmIntent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentLauncherViewModel$confirmIntent$1(PaymentLauncherViewModel paymentLauncherViewModel, Continuation<? super PaymentLauncherViewModel$confirmIntent$1> continuation) {
        super(continuation);
        this.this$0 = paymentLauncherViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8204confirmIntent0E7RQCE = this.this$0.m8204confirmIntent0E7RQCE(null, null, this);
        return objM8204confirmIntent0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8204confirmIntent0E7RQCE : Result.m9117boximpl(objM8204confirmIntent0E7RQCE);
    }
}
