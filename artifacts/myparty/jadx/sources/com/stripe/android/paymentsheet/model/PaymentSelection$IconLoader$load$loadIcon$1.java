package com.stripe.android.paymentsheet.model;

import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PaymentSelection.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.model.PaymentSelection$IconLoader", f = "PaymentSelection.kt", i = {0, 0}, l = {323}, m = "load$loadIcon", n = {"this$0", "$drawableResourceId"}, s = {"L$0", "I$0"})
/* loaded from: classes6.dex */
final class PaymentSelection$IconLoader$load$loadIcon$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    PaymentSelection$IconLoader$load$loadIcon$1(Continuation<? super PaymentSelection$IconLoader$load$loadIcon$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PaymentSelection.IconLoader.load$loadIcon(null, 0, null, this);
    }
}
