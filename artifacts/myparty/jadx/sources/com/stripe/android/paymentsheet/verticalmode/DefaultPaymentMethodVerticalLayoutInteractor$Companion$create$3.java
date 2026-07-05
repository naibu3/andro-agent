package com.stripe.android.paymentsheet.verticalmode;

import com.stripe.android.paymentsheet.analytics.EventReporter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodVerticalLayoutInteractor.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class DefaultPaymentMethodVerticalLayoutInteractor$Companion$create$3 extends FunctionReferenceImpl implements Function1<String, Unit> {
    DefaultPaymentMethodVerticalLayoutInteractor$Companion$create$3(Object obj) {
        super(1, obj, EventReporter.class, "onPaymentMethodFormShown", "onPaymentMethodFormShown(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((EventReporter) this.receiver).onPaymentMethodFormShown(p0);
    }
}
