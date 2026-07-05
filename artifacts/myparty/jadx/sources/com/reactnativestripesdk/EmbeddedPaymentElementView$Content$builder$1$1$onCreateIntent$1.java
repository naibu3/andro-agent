package com.reactnativestripesdk;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: EmbeddedPaymentElementView.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.reactnativestripesdk.EmbeddedPaymentElementView$Content$builder$1$1", f = "EmbeddedPaymentElementView.kt", i = {0, 0}, l = {186}, m = "onCreateIntent", n = {"stripeSdkModule", "keepJsAwakeTask"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
final class EmbeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EmbeddedPaymentElementView$Content$builder$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmbeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1(EmbeddedPaymentElementView$Content$builder$1$1 embeddedPaymentElementView$Content$builder$1$1, Continuation<? super EmbeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1> continuation) {
        super(continuation);
        this.this$0 = embeddedPaymentElementView$Content$builder$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onCreateIntent(null, false, this);
    }
}
