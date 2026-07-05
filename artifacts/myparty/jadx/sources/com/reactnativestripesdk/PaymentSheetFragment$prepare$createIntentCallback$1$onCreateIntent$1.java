package com.reactnativestripesdk;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PaymentSheetFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.reactnativestripesdk.PaymentSheetFragment$prepare$createIntentCallback$1", f = "PaymentSheetFragment.kt", i = {}, l = {198}, m = "onCreateIntent", n = {}, s = {})
/* loaded from: classes5.dex */
final class PaymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentSheetFragment$prepare$createIntentCallback$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1(PaymentSheetFragment$prepare$createIntentCallback$1 paymentSheetFragment$prepare$createIntentCallback$1, Continuation<? super PaymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1> continuation) {
        super(continuation);
        this.this$0 = paymentSheetFragment$prepare$createIntentCallback$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onCreateIntent(null, false, this);
    }
}
