package com.qonversion.android.sdk.internal.logger;

import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConsoleLogger.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;", "Lcom/qonversion/android/sdk/internal/logger/Logger;", "()V", "debug", "", "message", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "format", "log", "logLevel", "", "release", "warn", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ConsoleLogger implements Logger {
    private static final String TAG = "Qonversion";

    @Override // com.qonversion.android.sdk.internal.logger.Logger
    public void debug(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // com.qonversion.android.sdk.internal.logger.Logger
    public void error(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(6, message);
    }

    @Override // com.qonversion.android.sdk.internal.logger.Logger
    public void warn(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(5, message);
    }

    @Override // com.qonversion.android.sdk.internal.logger.Logger
    public void release(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        log(4, message);
    }

    private final void log(int logLevel, String message) {
        Log.println(logLevel, TAG, format(message));
    }

    private final String format(String message) {
        return "[Thread - " + Thread.currentThread().getName() + "] " + message;
    }
}
