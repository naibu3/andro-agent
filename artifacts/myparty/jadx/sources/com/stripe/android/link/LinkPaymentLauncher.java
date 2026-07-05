package com.stripe.android.link;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.link.LinkAccountUpdate;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.account.LinkStore;
import com.stripe.android.link.analytics.LinkAnalyticsHelper;
import com.stripe.android.link.injection.LinkAnalyticsComponent;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackIdentifier;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkPaymentLauncher.kt */
@Singleton
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B+\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u0017J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u0017J$\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00182\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u0017H\u0002J\u0006\u0010\u001e\u001a\u00020\u0012J&\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/stripe/android/link/LinkPaymentLauncher;", "", "linkAnalyticsComponentBuilder", "Lcom/stripe/android/link/injection/LinkAnalyticsComponent$Builder;", "paymentElementCallbackIdentifier", "", "linkActivityContract", "Lcom/stripe/android/link/LinkActivityContract;", "linkStore", "Lcom/stripe/android/link/account/LinkStore;", "<init>", "(Lcom/stripe/android/link/injection/LinkAnalyticsComponent$Builder;Ljava/lang/String;Lcom/stripe/android/link/LinkActivityContract;Lcom/stripe/android/link/account/LinkStore;)V", "analyticsHelper", "Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;", "linkActivityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/link/LinkActivityContract$Args;", "register", "", SDKConstants.PARAM_KEY, "activityResultRegistry", "Landroidx/activity/result/ActivityResultRegistry;", "callback", "Lkotlin/Function1;", "Lcom/stripe/android/link/LinkActivityResult;", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "handleActivityResult", "linkActivityResult", "nextStep", "unregister", "present", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "linkAccountInfo", "Lcom/stripe/android/link/LinkAccountUpdate$Value;", "launchMode", "Lcom/stripe/android/link/LinkLaunchMode;", "linkExpressMode", "Lcom/stripe/android/link/LinkExpressMode;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkPaymentLauncher {
    public static final int $stable = 8;
    private final LinkAnalyticsHelper analyticsHelper;
    private final LinkActivityContract linkActivityContract;
    private ActivityResultLauncher<LinkActivityContract.Args> linkActivityResultLauncher;
    private final LinkStore linkStore;
    private final String paymentElementCallbackIdentifier;

    @Inject
    public LinkPaymentLauncher(LinkAnalyticsComponent.Builder linkAnalyticsComponentBuilder, @PaymentElementCallbackIdentifier String paymentElementCallbackIdentifier, LinkActivityContract linkActivityContract, LinkStore linkStore) {
        Intrinsics.checkNotNullParameter(linkAnalyticsComponentBuilder, "linkAnalyticsComponentBuilder");
        Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        Intrinsics.checkNotNullParameter(linkActivityContract, "linkActivityContract");
        Intrinsics.checkNotNullParameter(linkStore, "linkStore");
        this.paymentElementCallbackIdentifier = paymentElementCallbackIdentifier;
        this.linkActivityContract = linkActivityContract;
        this.linkStore = linkStore;
        this.analyticsHelper = linkAnalyticsComponentBuilder.build().getLinkAnalyticsHelper();
    }

    public static /* synthetic */ void register$default(LinkPaymentLauncher linkPaymentLauncher, String str, ActivityResultRegistry activityResultRegistry, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "LinkPaymentLauncher";
        }
        linkPaymentLauncher.register(str, activityResultRegistry, function1);
    }

    public final void register(String key, ActivityResultRegistry activityResultRegistry, final Function1<? super LinkActivityResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(activityResultRegistry, "activityResultRegistry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.linkActivityResultLauncher = activityResultRegistry.register(this.paymentElementCallbackIdentifier + "_" + key, this.linkActivityContract, new ActivityResultCallback() { // from class: com.stripe.android.link.LinkPaymentLauncher$$ExternalSyntheticLambda1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                LinkPaymentLauncher.register$lambda$0(this.f$0, callback, (LinkActivityResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$0(LinkPaymentLauncher linkPaymentLauncher, Function1 function1, LinkActivityResult linkActivityResult) {
        Intrinsics.checkNotNullParameter(linkActivityResult, "linkActivityResult");
        linkPaymentLauncher.handleActivityResult(linkActivityResult, function1);
    }

    public final void register(ActivityResultCaller activityResultCaller, final Function1<? super LinkActivityResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.linkActivityResultLauncher = activityResultCaller.registerForActivityResult(this.linkActivityContract, new ActivityResultCallback() { // from class: com.stripe.android.link.LinkPaymentLauncher$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                LinkPaymentLauncher.register$lambda$1(this.f$0, callback, (LinkActivityResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$1(LinkPaymentLauncher linkPaymentLauncher, Function1 function1, LinkActivityResult linkActivityResult) {
        Intrinsics.checkNotNullParameter(linkActivityResult, "linkActivityResult");
        linkPaymentLauncher.handleActivityResult(linkActivityResult, function1);
    }

    private final void handleActivityResult(LinkActivityResult linkActivityResult, Function1<? super LinkActivityResult, Unit> nextStep) {
        this.analyticsHelper.onLinkResult(linkActivityResult);
        if ((linkActivityResult instanceof LinkActivityResult.PaymentMethodObtained) || (linkActivityResult instanceof LinkActivityResult.Completed)) {
            this.linkStore.markLinkAsUsed();
        } else if (!(linkActivityResult instanceof LinkActivityResult.Canceled) && !(linkActivityResult instanceof LinkActivityResult.Failed)) {
            throw new NoWhenBranchMatchedException();
        }
        nextStep.invoke(linkActivityResult);
    }

    public final void unregister() {
        ActivityResultLauncher<LinkActivityContract.Args> activityResultLauncher = this.linkActivityResultLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        this.linkActivityResultLauncher = null;
    }

    public final void present(LinkConfiguration configuration, LinkAccountUpdate.Value linkAccountInfo, LinkLaunchMode launchMode, LinkExpressMode linkExpressMode) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(linkAccountInfo, "linkAccountInfo");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(linkExpressMode, "linkExpressMode");
        LinkActivityContract.Args args = new LinkActivityContract.Args(configuration, linkExpressMode, linkAccountInfo, launchMode);
        ActivityResultLauncher<LinkActivityContract.Args> activityResultLauncher = this.linkActivityResultLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(args);
        }
        this.analyticsHelper.onLinkLaunched();
    }
}
