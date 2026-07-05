package com.stripe.android.core.utils;

import android.content.Context;
import com.stripe.android.core.Logger;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserFacingLogger.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/core/utils/RealUserFacingLogger;", "Lcom/stripe/android/core/utils/UserFacingLogger;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "isDebuggable", "", "isDebugBuild", "logger", "Lcom/stripe/android/core/Logger;", "logWarningWithoutPii", "", "message", "", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RealUserFacingLogger implements UserFacingLogger {
    private final boolean isDebugBuild;
    private final boolean isDebuggable;
    private final Logger logger;

    @Inject
    public RealUserFacingLogger(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z = true;
        boolean z2 = (context.getApplicationInfo().flags & 2) != 0;
        this.isDebuggable = z2;
        Logger.Companion companion = Logger.INSTANCE;
        if (!z2 && !this.isDebugBuild) {
            z = false;
        }
        this.logger = companion.getInstance(z);
    }

    @Override // com.stripe.android.core.utils.UserFacingLogger
    public void logWarningWithoutPii(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.logger.warning(message);
    }
}
