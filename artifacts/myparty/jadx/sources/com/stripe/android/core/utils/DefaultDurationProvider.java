package com.stripe.android.core.utils;

import android.os.SystemClock;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.utils.DurationProvider;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* compiled from: DurationProvider.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0002\b\u000fR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/core/utils/DefaultDurationProvider;", "Lcom/stripe/android/core/utils/DurationProvider;", "<init>", "()V", "store", "", "Lcom/stripe/android/core/utils/DurationProvider$Key;", "", ViewProps.START, "", SDKConstants.PARAM_KEY, "reset", "", ViewProps.END, "Lkotlin/time/Duration;", "end-LV8wdWc", "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultDurationProvider implements DurationProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final DefaultDurationProvider instance = new DefaultDurationProvider();
    private final Map<DurationProvider.Key, Long> store = new LinkedHashMap();

    private DefaultDurationProvider() {
    }

    @Override // com.stripe.android.core.utils.DurationProvider
    public void start(DurationProvider.Key key, boolean reset) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (reset || !this.store.containsKey(key)) {
            this.store.put(key, Long.valueOf(SystemClock.uptimeMillis()));
        }
    }

    @Override // com.stripe.android.core.utils.DurationProvider
    /* renamed from: end-LV8wdWc, reason: not valid java name */
    public Duration mo7239endLV8wdWc(DurationProvider.Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Long lRemove = this.store.remove(key);
        if (lRemove == null) {
            return null;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - lRemove.longValue();
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m10480boximpl(DurationKt.toDuration(jUptimeMillis, DurationUnit.MILLISECONDS));
    }

    /* compiled from: DurationProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/core/utils/DefaultDurationProvider$Companion;", "", "<init>", "()V", "instance", "Lcom/stripe/android/core/utils/DefaultDurationProvider;", "getInstance", "()Lcom/stripe/android/core/utils/DefaultDurationProvider;", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DefaultDurationProvider getInstance() {
            return DefaultDurationProvider.instance;
        }
    }
}
