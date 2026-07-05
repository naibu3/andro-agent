package com.stripe.android.paymentsheet.utils;

import com.stripe.android.model.CardBrand;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventReporterProviderUtil.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class EventReporterProviderUtilKt$EventReporterProvider$3$1 extends FunctionReferenceImpl implements Function1<CardBrand, Unit> {
    EventReporterProviderUtilKt$EventReporterProvider$3$1(Object obj) {
        super(1, obj, EventReporter.class, "onDisallowedCardBrandEntered", "onDisallowedCardBrandEntered(Lcom/stripe/android/model/CardBrand;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CardBrand cardBrand) {
        invoke2(cardBrand);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CardBrand p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((EventReporter) this.receiver).onDisallowedCardBrandEntered(p0);
    }
}
