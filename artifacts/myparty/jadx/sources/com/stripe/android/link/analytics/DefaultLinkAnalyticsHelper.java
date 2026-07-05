package com.stripe.android.link.analytics;

import com.stripe.android.link.LinkActivityResult;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultLinkAnalyticsHelper.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/analytics/DefaultLinkAnalyticsHelper;", "Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;", "linkEventsReporter", "Lcom/stripe/android/link/analytics/LinkEventsReporter;", "<init>", "(Lcom/stripe/android/link/analytics/LinkEventsReporter;)V", "onLinkLaunched", "", "onLinkResult", "linkActivityResult", "Lcom/stripe/android/link/LinkActivityResult;", "onLinkPopupSkipped", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultLinkAnalyticsHelper implements LinkAnalyticsHelper {
    public static final int $stable = 8;
    private final LinkEventsReporter linkEventsReporter;

    /* compiled from: DefaultLinkAnalyticsHelper.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinkActivityResult.Canceled.Reason.values().length];
            try {
                iArr[LinkActivityResult.Canceled.Reason.BackPressed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinkActivityResult.Canceled.Reason.LoggedOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LinkActivityResult.Canceled.Reason.PayAnotherWay.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public DefaultLinkAnalyticsHelper(LinkEventsReporter linkEventsReporter) {
        Intrinsics.checkNotNullParameter(linkEventsReporter, "linkEventsReporter");
        this.linkEventsReporter = linkEventsReporter;
    }

    @Override // com.stripe.android.link.analytics.LinkAnalyticsHelper
    public void onLinkLaunched() {
        this.linkEventsReporter.onPopupShow();
    }

    @Override // com.stripe.android.link.analytics.LinkAnalyticsHelper
    public void onLinkResult(LinkActivityResult linkActivityResult) {
        Intrinsics.checkNotNullParameter(linkActivityResult, "linkActivityResult");
        if (linkActivityResult instanceof LinkActivityResult.Canceled) {
            int i = WhenMappings.$EnumSwitchMapping$0[((LinkActivityResult.Canceled) linkActivityResult).getReason().ordinal()];
            if (i == 1) {
                this.linkEventsReporter.onPopupCancel();
                return;
            } else if (i == 2) {
                this.linkEventsReporter.onPopupLogout();
                return;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        if ((linkActivityResult instanceof LinkActivityResult.PaymentMethodObtained) || (linkActivityResult instanceof LinkActivityResult.Completed)) {
            this.linkEventsReporter.onPopupSuccess();
        } else {
            if (!(linkActivityResult instanceof LinkActivityResult.Failed)) {
                throw new NoWhenBranchMatchedException();
            }
            this.linkEventsReporter.onPopupError(((LinkActivityResult.Failed) linkActivityResult).getError());
        }
    }

    @Override // com.stripe.android.link.analytics.LinkAnalyticsHelper
    public void onLinkPopupSkipped() {
        this.linkEventsReporter.onPopupSkipped();
    }
}
