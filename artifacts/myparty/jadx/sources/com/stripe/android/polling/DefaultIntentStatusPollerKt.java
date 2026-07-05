package com.stripe.android.polling;

import kotlin.Metadata;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* compiled from: DefaultIntentStatusPoller.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"calculateDelay", "Lkotlin/time/Duration;", "attempts", "", "(I)J", "payments-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultIntentStatusPollerKt {
    public static final long calculateDelay(int i) {
        double dPow = Math.pow(i + 1.0d, 2);
        Duration.Companion companion = Duration.INSTANCE;
        return DurationKt.toDuration(dPow, DurationUnit.SECONDS);
    }
}
