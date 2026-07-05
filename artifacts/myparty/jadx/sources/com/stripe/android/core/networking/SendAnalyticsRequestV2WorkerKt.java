package com.stripe.android.core.networking;

import com.stripe.android.core.exception.InvalidRequestException;
import kotlin.Metadata;

/* compiled from: SendAnalyticsRequestV2Worker.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"DataKey", "", "MaxAttempts", "", "shouldRetry", "", "", "getShouldRetry", "(Ljava/lang/Throwable;)Z", "stripe-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SendAnalyticsRequestV2WorkerKt {
    private static final String DataKey = "data";
    private static final int MaxAttempts = 5;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getShouldRetry(Throwable th) {
        return !(th instanceof InvalidRequestException);
    }
}
