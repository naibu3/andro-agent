package com.stripe.android.link.analytics;

import com.stripe.android.link.LinkActivityResult;
import kotlin.Metadata;

/* compiled from: LinkAnalyticsHelper.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;", "", "onLinkLaunched", "", "onLinkResult", "linkActivityResult", "Lcom/stripe/android/link/LinkActivityResult;", "onLinkPopupSkipped", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LinkAnalyticsHelper {
    void onLinkLaunched();

    void onLinkPopupSkipped();

    void onLinkResult(LinkActivityResult linkActivityResult);
}
