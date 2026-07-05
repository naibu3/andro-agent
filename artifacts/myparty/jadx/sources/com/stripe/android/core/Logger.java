package com.stripe.android.core;

import android.util.Log;
import com.nimbusds.jose.jwk.JWKParameterNames;
import com.stripe.android.core.injection.NamedConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Logger.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\bg\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH&¨\u0006\f"}, d2 = {"Lcom/stripe/android/core/Logger;", "", "debug", "", "msg", "", "info", "warning", "error", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "", "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface Logger {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void debug(String msg);

    void error(String msg, Throwable t);

    void info(String msg);

    void warning(String msg);

    /* compiled from: Logger.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void error$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logger.error(str, th);
        }
    }

    /* compiled from: Logger.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\b\u0005*\u0002\u000b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\u0005R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/core/Logger$Companion;", "", "<init>", "()V", "getInstance", "Lcom/stripe/android/core/Logger;", NamedConstantsKt.ENABLE_LOGGING, "", "TAG", "", "REAL_LOGGER", "com/stripe/android/core/Logger$Companion$REAL_LOGGER$1", "Lcom/stripe/android/core/Logger$Companion$REAL_LOGGER$1;", "NOOP_LOGGER", "com/stripe/android/core/Logger$Companion$NOOP_LOGGER$1", "Lcom/stripe/android/core/Logger$Companion$NOOP_LOGGER$1;", "real", "noop", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private static final String TAG = "StripeSdk";
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Logger$Companion$REAL_LOGGER$1 REAL_LOGGER = new Logger() { // from class: com.stripe.android.core.Logger$Companion$REAL_LOGGER$1
            @Override // com.stripe.android.core.Logger
            public void debug(String msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                Log.d("StripeSdk", msg);
            }

            @Override // com.stripe.android.core.Logger
            public void info(String msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                Log.i("StripeSdk", msg);
            }

            @Override // com.stripe.android.core.Logger
            public void warning(String msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                Log.w("StripeSdk", msg);
            }

            @Override // com.stripe.android.core.Logger
            public void error(String msg, Throwable t) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                Log.e("StripeSdk", msg, t);
            }
        };
        private static final Logger$Companion$NOOP_LOGGER$1 NOOP_LOGGER = new Logger() { // from class: com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1
            @Override // com.stripe.android.core.Logger
            public void debug(String msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
            }

            @Override // com.stripe.android.core.Logger
            public void error(String msg, Throwable t) {
                Intrinsics.checkNotNullParameter(msg, "msg");
            }

            @Override // com.stripe.android.core.Logger
            public void info(String msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
            }

            @Override // com.stripe.android.core.Logger
            public void warning(String msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
            }
        };

        private Companion() {
        }

        public final Logger getInstance(boolean enableLogging) {
            if (enableLogging) {
                return real();
            }
            return noop();
        }

        public final Logger real() {
            return REAL_LOGGER;
        }

        public final Logger noop() {
            return NOOP_LOGGER;
        }
    }
}
