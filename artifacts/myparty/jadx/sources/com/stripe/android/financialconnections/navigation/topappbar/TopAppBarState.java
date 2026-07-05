package com.stripe.android.financialconnections.navigation.topappbar;

import androidx.core.app.FrameMetricsAggregator;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.ui.theme.Theme;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TopAppBarState.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003Je\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u001a\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011¨\u0006."}, d2 = {"Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;", "", "hideStripeLogo", "", "forceHideStripeLogo", "allowBackNavigation", "theme", "Lcom/stripe/android/financialconnections/ui/theme/Theme;", "isTestMode", "allowElevation", "isContentScrolled", "error", "", "canCloseWithoutConfirmation", "<init>", "(ZZZLcom/stripe/android/financialconnections/ui/theme/Theme;ZZZLjava/lang/Throwable;Z)V", "getHideStripeLogo", "()Z", "getForceHideStripeLogo", "getAllowBackNavigation", "getTheme", "()Lcom/stripe/android/financialconnections/ui/theme/Theme;", "getAllowElevation", "getError", "()Ljava/lang/Throwable;", "getCanCloseWithoutConfirmation", "isElevated", "apply", "update", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TopAppBarState {
    public static final int $stable = 8;
    private final boolean allowBackNavigation;
    private final boolean allowElevation;
    private final boolean canCloseWithoutConfirmation;
    private final Throwable error;
    private final boolean forceHideStripeLogo;
    private final boolean hideStripeLogo;
    private final boolean isContentScrolled;
    private final boolean isTestMode;
    private final Theme theme;

    public TopAppBarState() {
        this(false, false, false, null, false, false, false, null, false, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public static /* synthetic */ TopAppBarState copy$default(TopAppBarState topAppBarState, boolean z, boolean z2, boolean z3, Theme theme, boolean z4, boolean z5, boolean z6, Throwable th, boolean z7, int i, Object obj) {
        if ((i & 1) != 0) {
            z = topAppBarState.hideStripeLogo;
        }
        if ((i & 2) != 0) {
            z2 = topAppBarState.forceHideStripeLogo;
        }
        if ((i & 4) != 0) {
            z3 = topAppBarState.allowBackNavigation;
        }
        if ((i & 8) != 0) {
            theme = topAppBarState.theme;
        }
        if ((i & 16) != 0) {
            z4 = topAppBarState.isTestMode;
        }
        if ((i & 32) != 0) {
            z5 = topAppBarState.allowElevation;
        }
        if ((i & 64) != 0) {
            z6 = topAppBarState.isContentScrolled;
        }
        if ((i & 128) != 0) {
            th = topAppBarState.error;
        }
        if ((i & 256) != 0) {
            z7 = topAppBarState.canCloseWithoutConfirmation;
        }
        Throwable th2 = th;
        boolean z8 = z7;
        boolean z9 = z5;
        boolean z10 = z6;
        boolean z11 = z4;
        boolean z12 = z3;
        return topAppBarState.copy(z, z2, z12, theme, z11, z9, z10, th2, z8);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHideStripeLogo() {
        return this.hideStripeLogo;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getForceHideStripeLogo() {
        return this.forceHideStripeLogo;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getAllowBackNavigation() {
        return this.allowBackNavigation;
    }

    /* renamed from: component4, reason: from getter */
    public final Theme getTheme() {
        return this.theme;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsTestMode() {
        return this.isTestMode;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getAllowElevation() {
        return this.allowElevation;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsContentScrolled() {
        return this.isContentScrolled;
    }

    /* renamed from: component8, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getCanCloseWithoutConfirmation() {
        return this.canCloseWithoutConfirmation;
    }

    public final TopAppBarState copy(boolean hideStripeLogo, boolean forceHideStripeLogo, boolean allowBackNavigation, Theme theme, boolean isTestMode, boolean allowElevation, boolean isContentScrolled, Throwable error, boolean canCloseWithoutConfirmation) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        return new TopAppBarState(hideStripeLogo, forceHideStripeLogo, allowBackNavigation, theme, isTestMode, allowElevation, isContentScrolled, error, canCloseWithoutConfirmation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopAppBarState)) {
            return false;
        }
        TopAppBarState topAppBarState = (TopAppBarState) other;
        return this.hideStripeLogo == topAppBarState.hideStripeLogo && this.forceHideStripeLogo == topAppBarState.forceHideStripeLogo && this.allowBackNavigation == topAppBarState.allowBackNavigation && this.theme == topAppBarState.theme && this.isTestMode == topAppBarState.isTestMode && this.allowElevation == topAppBarState.allowElevation && this.isContentScrolled == topAppBarState.isContentScrolled && Intrinsics.areEqual(this.error, topAppBarState.error) && this.canCloseWithoutConfirmation == topAppBarState.canCloseWithoutConfirmation;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Boolean.hashCode(this.hideStripeLogo) * 31) + Boolean.hashCode(this.forceHideStripeLogo)) * 31) + Boolean.hashCode(this.allowBackNavigation)) * 31) + this.theme.hashCode()) * 31) + Boolean.hashCode(this.isTestMode)) * 31) + Boolean.hashCode(this.allowElevation)) * 31) + Boolean.hashCode(this.isContentScrolled)) * 31;
        Throwable th = this.error;
        return ((iHashCode + (th == null ? 0 : th.hashCode())) * 31) + Boolean.hashCode(this.canCloseWithoutConfirmation);
    }

    public String toString() {
        return "TopAppBarState(hideStripeLogo=" + this.hideStripeLogo + ", forceHideStripeLogo=" + this.forceHideStripeLogo + ", allowBackNavigation=" + this.allowBackNavigation + ", theme=" + this.theme + ", isTestMode=" + this.isTestMode + ", allowElevation=" + this.allowElevation + ", isContentScrolled=" + this.isContentScrolled + ", error=" + this.error + ", canCloseWithoutConfirmation=" + this.canCloseWithoutConfirmation + ")";
    }

    public TopAppBarState(boolean z, boolean z2, boolean z3, Theme theme, boolean z4, boolean z5, boolean z6, Throwable th, boolean z7) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.hideStripeLogo = z;
        this.forceHideStripeLogo = z2;
        this.allowBackNavigation = z3;
        this.theme = theme;
        this.isTestMode = z4;
        this.allowElevation = z5;
        this.isContentScrolled = z6;
        this.error = th;
        this.canCloseWithoutConfirmation = z7;
    }

    public final boolean getHideStripeLogo() {
        return this.hideStripeLogo;
    }

    public final boolean getForceHideStripeLogo() {
        return this.forceHideStripeLogo;
    }

    public final boolean getAllowBackNavigation() {
        return this.allowBackNavigation;
    }

    public /* synthetic */ TopAppBarState(boolean z, boolean z2, boolean z3, Theme theme, boolean z4, boolean z5, boolean z6, Throwable th, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? Theme.INSTANCE.getDefault() : theme, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? true : z5, (i & 64) != 0 ? false : z6, (i & 128) != 0 ? null : th, (i & 256) != 0 ? false : z7);
    }

    public final Theme getTheme() {
        return this.theme;
    }

    public final boolean isTestMode() {
        return this.isTestMode;
    }

    public final boolean getAllowElevation() {
        return this.allowElevation;
    }

    public final boolean isContentScrolled() {
        return this.isContentScrolled;
    }

    public final Throwable getError() {
        return this.error;
    }

    public final boolean getCanCloseWithoutConfirmation() {
        return this.canCloseWithoutConfirmation;
    }

    public final boolean isElevated() {
        return this.allowElevation && this.isContentScrolled;
    }

    public final TopAppBarState apply(TopAppBarStateUpdate update) {
        Intrinsics.checkNotNullParameter(update, "update");
        Boolean hideStripeLogo = update.getHideStripeLogo();
        boolean zBooleanValue = hideStripeLogo != null ? hideStripeLogo.booleanValue() : this.hideStripeLogo;
        boolean allowBackNavigation = update.getAllowBackNavigation();
        boolean allowElevation = update.getAllowElevation();
        Throwable error = update.getError();
        if (error == null) {
            error = this.error;
        }
        return copy$default(this, zBooleanValue, false, allowBackNavigation, null, false, allowElevation, false, error, update.getCanCloseWithoutConfirmation(), 88, null);
    }
}
