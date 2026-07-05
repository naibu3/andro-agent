package com.reactnativestripesdk;

import com.reactnativestripesdk.EmbeddedPaymentElementView;
import com.reactnativestripesdk.EmbeddedPaymentElementView$Content$1$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: EmbeddedPaymentElementView.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.reactnativestripesdk.EmbeddedPaymentElementView$Content$1$1$1", f = "EmbeddedPaymentElementView.kt", i = {}, l = {246}, m = "emit", n = {}, s = {})
/* loaded from: classes5.dex */
final class EmbeddedPaymentElementView$Content$1$1$1$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EmbeddedPaymentElementView$Content$1$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EmbeddedPaymentElementView$Content$1$1$1$emit$1(EmbeddedPaymentElementView$Content$1$1.AnonymousClass1<? super T> anonymousClass1, Continuation<? super EmbeddedPaymentElementView$Content$1$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((EmbeddedPaymentElementView.Event) null, (Continuation<? super Unit>) this);
    }
}
