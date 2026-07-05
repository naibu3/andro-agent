package com.stripe.android.paymentelement.embedded.form;

import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmbeddedFormInteractorFactory.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class EmbeddedFormInteractorFactory$create$usBankAccountFormArguments$2 extends FunctionReferenceImpl implements Function1<USBankAccountFormViewModel.AnalyticsEvent, Unit> {
    EmbeddedFormInteractorFactory$create$usBankAccountFormArguments$2(Object obj) {
        super(1, obj, EventReporter.class, "onUsBankAccountFormEvent", "onUsBankAccountFormEvent(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(USBankAccountFormViewModel.AnalyticsEvent analyticsEvent) {
        invoke2(analyticsEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(USBankAccountFormViewModel.AnalyticsEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((EventReporter) this.receiver).onUsBankAccountFormEvent(p0);
    }
}
