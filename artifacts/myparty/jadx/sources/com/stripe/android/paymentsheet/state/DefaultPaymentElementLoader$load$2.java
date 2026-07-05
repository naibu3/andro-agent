package com.stripe.android.paymentsheet.state;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentElementLoader.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class DefaultPaymentElementLoader$load$2 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
    DefaultPaymentElementLoader$load$2(Object obj) {
        super(1, obj, DefaultPaymentElementLoader.class, "reportFailedLoad", "reportFailedLoad(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((DefaultPaymentElementLoader) this.receiver).reportFailedLoad(p0);
    }
}
