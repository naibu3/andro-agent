package com.stripe.android.core.exception;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExceptionUtils.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0015\u0010\u0003\u001a\u00020\u0001*\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"IO_EXCEPTION_ANALYTICS_MESSAGE", "", "DEFAULT_ANALYTICS_MESSAGE", "safeAnalyticsMessage", "", "getSafeAnalyticsMessage", "(Ljava/lang/Throwable;)Ljava/lang/String;", "stripe-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExceptionUtilsKt {
    private static final String DEFAULT_ANALYTICS_MESSAGE = "unknown";
    private static final String IO_EXCEPTION_ANALYTICS_MESSAGE = "ioException";

    public static final String getSafeAnalyticsMessage(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        return th instanceof StripeException ? ((StripeException) th).analyticsValue() : th instanceof IOException ? IO_EXCEPTION_ANALYTICS_MESSAGE : "unknown";
    }
}
