package com.stripe.android.paymentsheet;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.stripe.android.paymentsheet.PaymentOptionsActivity$onCreate$1$1$1$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PaymentOptionsActivity.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentOptionsActivity$onCreate$1$1$1$1$1", f = "PaymentOptionsActivity.kt", i = {0}, l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m = "emit", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class PaymentOptionsActivity$onCreate$1$1$1$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PaymentOptionsActivity$onCreate$1$1$1$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PaymentOptionsActivity$onCreate$1$1$1$1$1$emit$1(PaymentOptionsActivity$onCreate$1$1$1$1.AnonymousClass1<? super T> anonymousClass1, Continuation<? super PaymentOptionsActivity$onCreate$1$1$1$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((PaymentOptionsActivityResult) null, (Continuation<? super Unit>) this);
    }
}
