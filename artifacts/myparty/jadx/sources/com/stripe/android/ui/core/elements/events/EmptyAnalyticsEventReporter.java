package com.stripe.android.ui.core.elements.events;

import com.stripe.android.core.networking.AnalyticsEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalyticsEventReporter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/stripe/android/ui/core/elements/events/EmptyAnalyticsEventReporter;", "Lcom/stripe/android/ui/core/elements/events/AnalyticsEventReporter;", "<init>", "()V", "onAnalyticsEvent", "", "event", "Lcom/stripe/android/core/networking/AnalyticsEvent;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class EmptyAnalyticsEventReporter implements AnalyticsEventReporter {
    public static final EmptyAnalyticsEventReporter INSTANCE = new EmptyAnalyticsEventReporter();

    @Override // com.stripe.android.ui.core.elements.events.AnalyticsEventReporter
    public void onAnalyticsEvent(AnalyticsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    private EmptyAnalyticsEventReporter() {
    }
}
