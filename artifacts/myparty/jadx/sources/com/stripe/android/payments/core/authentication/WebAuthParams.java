package com.stripe.android.payments.core.authentication;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.navigation.Destination;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebIntentNextActionHandler.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006 "}, d2 = {"Lcom/stripe/android/payments/core/authentication/WebAuthParams;", "", "authUrl", "", "returnUrl", "shouldCancelSource", "", "shouldCancelIntentOnUserNavigation", Destination.KEY_REFERRER, "forceInAppWebView", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Z)V", "getAuthUrl", "()Ljava/lang/String;", "getReturnUrl", "getShouldCancelSource", "()Z", "getShouldCancelIntentOnUserNavigation", "getReferrer", "getForceInAppWebView", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class WebAuthParams {
    private final String authUrl;
    private final boolean forceInAppWebView;
    private final String referrer;
    private final String returnUrl;
    private final boolean shouldCancelIntentOnUserNavigation;
    private final boolean shouldCancelSource;

    public static /* synthetic */ WebAuthParams copy$default(WebAuthParams webAuthParams, String str, String str2, boolean z, boolean z2, String str3, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webAuthParams.authUrl;
        }
        if ((i & 2) != 0) {
            str2 = webAuthParams.returnUrl;
        }
        if ((i & 4) != 0) {
            z = webAuthParams.shouldCancelSource;
        }
        if ((i & 8) != 0) {
            z2 = webAuthParams.shouldCancelIntentOnUserNavigation;
        }
        if ((i & 16) != 0) {
            str3 = webAuthParams.referrer;
        }
        if ((i & 32) != 0) {
            z3 = webAuthParams.forceInAppWebView;
        }
        String str4 = str3;
        boolean z4 = z3;
        return webAuthParams.copy(str, str2, z, z2, str4, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAuthUrl() {
        return this.authUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShouldCancelSource() {
        return this.shouldCancelSource;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShouldCancelIntentOnUserNavigation() {
        return this.shouldCancelIntentOnUserNavigation;
    }

    /* renamed from: component5, reason: from getter */
    public final String getReferrer() {
        return this.referrer;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getForceInAppWebView() {
        return this.forceInAppWebView;
    }

    public final WebAuthParams copy(String authUrl, String returnUrl, boolean shouldCancelSource, boolean shouldCancelIntentOnUserNavigation, String referrer, boolean forceInAppWebView) {
        Intrinsics.checkNotNullParameter(authUrl, "authUrl");
        return new WebAuthParams(authUrl, returnUrl, shouldCancelSource, shouldCancelIntentOnUserNavigation, referrer, forceInAppWebView);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebAuthParams)) {
            return false;
        }
        WebAuthParams webAuthParams = (WebAuthParams) other;
        return Intrinsics.areEqual(this.authUrl, webAuthParams.authUrl) && Intrinsics.areEqual(this.returnUrl, webAuthParams.returnUrl) && this.shouldCancelSource == webAuthParams.shouldCancelSource && this.shouldCancelIntentOnUserNavigation == webAuthParams.shouldCancelIntentOnUserNavigation && Intrinsics.areEqual(this.referrer, webAuthParams.referrer) && this.forceInAppWebView == webAuthParams.forceInAppWebView;
    }

    public int hashCode() {
        int iHashCode = this.authUrl.hashCode() * 31;
        String str = this.returnUrl;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.shouldCancelSource)) * 31) + Boolean.hashCode(this.shouldCancelIntentOnUserNavigation)) * 31;
        String str2 = this.referrer;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.forceInAppWebView);
    }

    public String toString() {
        return "WebAuthParams(authUrl=" + this.authUrl + ", returnUrl=" + this.returnUrl + ", shouldCancelSource=" + this.shouldCancelSource + ", shouldCancelIntentOnUserNavigation=" + this.shouldCancelIntentOnUserNavigation + ", referrer=" + this.referrer + ", forceInAppWebView=" + this.forceInAppWebView + ")";
    }

    public WebAuthParams(String authUrl, String str, boolean z, boolean z2, String str2, boolean z3) {
        Intrinsics.checkNotNullParameter(authUrl, "authUrl");
        this.authUrl = authUrl;
        this.returnUrl = str;
        this.shouldCancelSource = z;
        this.shouldCancelIntentOnUserNavigation = z2;
        this.referrer = str2;
        this.forceInAppWebView = z3;
    }

    public /* synthetic */ WebAuthParams(String str, String str2, boolean z, boolean z2, String str3, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z3);
    }

    public final String getAuthUrl() {
        return this.authUrl;
    }

    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public final boolean getShouldCancelSource() {
        return this.shouldCancelSource;
    }

    public final boolean getShouldCancelIntentOnUserNavigation() {
        return this.shouldCancelIntentOnUserNavigation;
    }

    public final String getReferrer() {
        return this.referrer;
    }

    public final boolean getForceInAppWebView() {
        return this.forceInAppWebView;
    }
}
