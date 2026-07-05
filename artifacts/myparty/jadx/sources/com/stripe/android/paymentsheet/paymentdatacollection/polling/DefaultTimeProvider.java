package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import android.os.SystemClock;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PollingViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/DefaultTimeProvider;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;", "<init>", "()V", "currentTimeInMillis", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultTimeProvider implements TimeProvider {
    public static final int $stable = 0;

    @Inject
    public DefaultTimeProvider() {
    }

    @Override // com.stripe.android.paymentsheet.paymentdatacollection.polling.TimeProvider
    public long currentTimeInMillis() {
        return SystemClock.elapsedRealtime();
    }
}
