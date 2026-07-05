package com.stripe.android.paymentsheet.analytics;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EventTimeProvider.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/EventTimeProvider;", "", "<init>", "()V", "currentTimeMillis", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EventTimeProvider {
    public static final int $stable = 0;

    @Inject
    public EventTimeProvider() {
    }

    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
