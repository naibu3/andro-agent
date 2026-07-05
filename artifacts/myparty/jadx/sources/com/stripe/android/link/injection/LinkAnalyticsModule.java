package com.stripe.android.link.injection;

import com.stripe.android.link.analytics.DefaultLinkAnalyticsHelper;
import com.stripe.android.link.analytics.LinkAnalyticsHelper;
import dagger.Binds;
import dagger.Module;
import kotlin.Metadata;

/* compiled from: LinkAnalyticsComponent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/link/injection/LinkAnalyticsModule;", "", "bindLinkAnalyticsHelper", "Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;", "linkAnalyticsHelper", "Lcom/stripe/android/link/analytics/DefaultLinkAnalyticsHelper;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public interface LinkAnalyticsModule {
    @LinkAnalyticsScope
    @Binds
    LinkAnalyticsHelper bindLinkAnalyticsHelper(DefaultLinkAnalyticsHelper linkAnalyticsHelper);
}
