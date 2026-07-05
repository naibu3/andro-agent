package com.stripe.android.link.injection;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.link.analytics.LinkAnalyticsHelper;
import dagger.Subcomponent;
import kotlin.Metadata;

/* compiled from: LinkAnalyticsComponent.kt */
@Subcomponent(modules = {LinkAnalyticsModule.class})
@LinkAnalyticsScope
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/link/injection/LinkAnalyticsComponent;", "", "linkAnalyticsHelper", "Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;", "getLinkAnalyticsHelper", "()Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LinkAnalyticsComponent {

    /* compiled from: LinkAnalyticsComponent.kt */
    @Subcomponent.Builder
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/link/injection/LinkAnalyticsComponent$Builder;", "", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/link/injection/LinkAnalyticsComponent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Builder {
        LinkAnalyticsComponent build();
    }

    LinkAnalyticsHelper getLinkAnalyticsHelper();
}
