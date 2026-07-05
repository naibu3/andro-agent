package com.stripe.android.googlepaylauncher;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GooglePayLauncherViewModel.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel", f = "GooglePayLauncherViewModel.kt", i = {0, 1}, l = {185, 187, 191}, m = "resolveLoadPaymentDataTask-IoAF18A", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes5.dex */
final class GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GooglePayLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1(GooglePayLauncherViewModel googlePayLauncherViewModel, Continuation<? super GooglePayLauncherViewModel$resolveLoadPaymentDataTask$1> continuation) {
        super(continuation);
        this.this$0 = googlePayLauncherViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7662resolveLoadPaymentDataTaskIoAF18A = this.this$0.m7662resolveLoadPaymentDataTaskIoAF18A(this);
        return objM7662resolveLoadPaymentDataTaskIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM7662resolveLoadPaymentDataTaskIoAF18A : Result.m9117boximpl(objM7662resolveLoadPaymentDataTaskIoAF18A);
    }
}
