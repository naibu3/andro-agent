package com.stripe.android.common.di;

import com.stripe.android.core.networking.AnalyticsRequestFactory;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MobileSessionIdModule.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/common/di/MobileSessionIdModule;", "", "<init>", "()V", "mobileSessionIdProvider", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public final class MobileSessionIdModule {
    public static final int $stable = 0;

    @Provides
    @Named(MobileSessionIdModuleKt.MOBILE_SESSION_ID)
    public final String mobileSessionIdProvider() {
        String string = AnalyticsRequestFactory.INSTANCE.getSessionId().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
