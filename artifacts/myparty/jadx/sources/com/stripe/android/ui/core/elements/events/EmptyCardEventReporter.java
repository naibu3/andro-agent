package com.stripe.android.ui.core.elements.events;

import kotlin.Metadata;

/* compiled from: CardNumberCompletedEventReporter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/ui/core/elements/events/EmptyCardEventReporter;", "Lcom/stripe/android/ui/core/elements/events/CardNumberCompletedEventReporter;", "<init>", "()V", "onCardNumberCompleted", "", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class EmptyCardEventReporter implements CardNumberCompletedEventReporter {
    public static final EmptyCardEventReporter INSTANCE = new EmptyCardEventReporter();

    @Override // com.stripe.android.ui.core.elements.events.CardNumberCompletedEventReporter
    public void onCardNumberCompleted() {
    }

    private EmptyCardEventReporter() {
    }
}
