package com.stripe.android.paymentsheet.utils;

import com.stripe.android.core.networking.AnalyticsEvent;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventReporterProviderUtil.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class EventReporterProviderUtilKt$EventReporterProvider$4$1 extends FunctionReferenceImpl implements Function1<AnalyticsEvent, Unit> {
    EventReporterProviderUtilKt$EventReporterProvider$4$1(Object obj) {
        super(1, obj, EventReporter.class, "onAnalyticsEvent", "onAnalyticsEvent(Lcom/stripe/android/core/networking/AnalyticsEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AnalyticsEvent analyticsEvent) {
        invoke2(analyticsEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AnalyticsEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((EventReporter) this.receiver).onAnalyticsEvent(p0);
    }
}
