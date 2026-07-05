package com.stripe.android.financialconnections.navigation.topappbar;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TopAppBarState.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003JN\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006&"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", "", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "allowBackNavigation", "", "error", "", "canCloseWithoutConfirmation", "hideStripeLogo", "allowElevation", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLjava/lang/Throwable;ZLjava/lang/Boolean;Z)V", "getPane", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getAllowBackNavigation", "()Z", "getError", "()Ljava/lang/Throwable;", "getCanCloseWithoutConfirmation", "getHideStripeLogo", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAllowElevation", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLjava/lang/Throwable;ZLjava/lang/Boolean;Z)Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TopAppBarStateUpdate {
    public static final int $stable = 8;
    private final boolean allowBackNavigation;
    private final boolean allowElevation;
    private final boolean canCloseWithoutConfirmation;
    private final Throwable error;
    private final Boolean hideStripeLogo;
    private final FinancialConnectionsSessionManifest.Pane pane;

    public static /* synthetic */ TopAppBarStateUpdate copy$default(TopAppBarStateUpdate topAppBarStateUpdate, FinancialConnectionsSessionManifest.Pane pane, boolean z, Throwable th, boolean z2, Boolean bool, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            pane = topAppBarStateUpdate.pane;
        }
        if ((i & 2) != 0) {
            z = topAppBarStateUpdate.allowBackNavigation;
        }
        if ((i & 4) != 0) {
            th = topAppBarStateUpdate.error;
        }
        if ((i & 8) != 0) {
            z2 = topAppBarStateUpdate.canCloseWithoutConfirmation;
        }
        if ((i & 16) != 0) {
            bool = topAppBarStateUpdate.hideStripeLogo;
        }
        if ((i & 32) != 0) {
            z3 = topAppBarStateUpdate.allowElevation;
        }
        Boolean bool2 = bool;
        boolean z4 = z3;
        return topAppBarStateUpdate.copy(pane, z, th, z2, bool2, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getPane() {
        return this.pane;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAllowBackNavigation() {
        return this.allowBackNavigation;
    }

    /* renamed from: component3, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getCanCloseWithoutConfirmation() {
        return this.canCloseWithoutConfirmation;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getHideStripeLogo() {
        return this.hideStripeLogo;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getAllowElevation() {
        return this.allowElevation;
    }

    public final TopAppBarStateUpdate copy(FinancialConnectionsSessionManifest.Pane pane, boolean allowBackNavigation, Throwable error, boolean canCloseWithoutConfirmation, Boolean hideStripeLogo, boolean allowElevation) {
        Intrinsics.checkNotNullParameter(pane, "pane");
        return new TopAppBarStateUpdate(pane, allowBackNavigation, error, canCloseWithoutConfirmation, hideStripeLogo, allowElevation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopAppBarStateUpdate)) {
            return false;
        }
        TopAppBarStateUpdate topAppBarStateUpdate = (TopAppBarStateUpdate) other;
        return this.pane == topAppBarStateUpdate.pane && this.allowBackNavigation == topAppBarStateUpdate.allowBackNavigation && Intrinsics.areEqual(this.error, topAppBarStateUpdate.error) && this.canCloseWithoutConfirmation == topAppBarStateUpdate.canCloseWithoutConfirmation && Intrinsics.areEqual(this.hideStripeLogo, topAppBarStateUpdate.hideStripeLogo) && this.allowElevation == topAppBarStateUpdate.allowElevation;
    }

    public int hashCode() {
        int iHashCode = ((this.pane.hashCode() * 31) + Boolean.hashCode(this.allowBackNavigation)) * 31;
        Throwable th = this.error;
        int iHashCode2 = (((iHashCode + (th == null ? 0 : th.hashCode())) * 31) + Boolean.hashCode(this.canCloseWithoutConfirmation)) * 31;
        Boolean bool = this.hideStripeLogo;
        return ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + Boolean.hashCode(this.allowElevation);
    }

    public String toString() {
        return "TopAppBarStateUpdate(pane=" + this.pane + ", allowBackNavigation=" + this.allowBackNavigation + ", error=" + this.error + ", canCloseWithoutConfirmation=" + this.canCloseWithoutConfirmation + ", hideStripeLogo=" + this.hideStripeLogo + ", allowElevation=" + this.allowElevation + ")";
    }

    public TopAppBarStateUpdate(FinancialConnectionsSessionManifest.Pane pane, boolean z, Throwable th, boolean z2, Boolean bool, boolean z3) {
        Intrinsics.checkNotNullParameter(pane, "pane");
        this.pane = pane;
        this.allowBackNavigation = z;
        this.error = th;
        this.canCloseWithoutConfirmation = z2;
        this.hideStripeLogo = bool;
        this.allowElevation = z3;
    }

    public /* synthetic */ TopAppBarStateUpdate(FinancialConnectionsSessionManifest.Pane pane, boolean z, Throwable th, boolean z2, Boolean bool, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pane, z, th, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? true : z3);
    }

    public final FinancialConnectionsSessionManifest.Pane getPane() {
        return this.pane;
    }

    public final boolean getAllowBackNavigation() {
        return this.allowBackNavigation;
    }

    public final Throwable getError() {
        return this.error;
    }

    public final boolean getCanCloseWithoutConfirmation() {
        return this.canCloseWithoutConfirmation;
    }

    public final Boolean getHideStripeLogo() {
        return this.hideStripeLogo;
    }

    public final boolean getAllowElevation() {
        return this.allowElevation;
    }
}
