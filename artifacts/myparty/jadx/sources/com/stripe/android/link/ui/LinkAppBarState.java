package com.stripe.android.link.ui;

import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.paymentsheet.R;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkAppBarState.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/link/ui/LinkAppBarState;", "", "showHeader", "", "canNavigateBack", "title", "Lcom/stripe/android/core/strings/ResolvableString;", "isElevated", "<init>", "(ZZLcom/stripe/android/core/strings/ResolvableString;Z)V", "getShowHeader", "()Z", "getCanNavigateBack", "getTitle", "()Lcom/stripe/android/core/strings/ResolvableString;", "canShowCloseIcon", "getCanShowCloseIcon", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LinkAppBarState {
    private final boolean canNavigateBack;
    private final boolean isElevated;
    private final boolean showHeader;
    private final ResolvableString title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ LinkAppBarState copy$default(LinkAppBarState linkAppBarState, boolean z, boolean z2, ResolvableString resolvableString, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = linkAppBarState.showHeader;
        }
        if ((i & 2) != 0) {
            z2 = linkAppBarState.canNavigateBack;
        }
        if ((i & 4) != 0) {
            resolvableString = linkAppBarState.title;
        }
        if ((i & 8) != 0) {
            z3 = linkAppBarState.isElevated;
        }
        return linkAppBarState.copy(z, z2, resolvableString, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowHeader() {
        return this.showHeader;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCanNavigateBack() {
        return this.canNavigateBack;
    }

    /* renamed from: component3, reason: from getter */
    public final ResolvableString getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsElevated() {
        return this.isElevated;
    }

    public final LinkAppBarState copy(boolean showHeader, boolean canNavigateBack, ResolvableString title, boolean isElevated) {
        return new LinkAppBarState(showHeader, canNavigateBack, title, isElevated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkAppBarState)) {
            return false;
        }
        LinkAppBarState linkAppBarState = (LinkAppBarState) other;
        return this.showHeader == linkAppBarState.showHeader && this.canNavigateBack == linkAppBarState.canNavigateBack && Intrinsics.areEqual(this.title, linkAppBarState.title) && this.isElevated == linkAppBarState.isElevated;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.showHeader) * 31) + Boolean.hashCode(this.canNavigateBack)) * 31;
        ResolvableString resolvableString = this.title;
        return ((iHashCode + (resolvableString == null ? 0 : resolvableString.hashCode())) * 31) + Boolean.hashCode(this.isElevated);
    }

    public String toString() {
        return "LinkAppBarState(showHeader=" + this.showHeader + ", canNavigateBack=" + this.canNavigateBack + ", title=" + this.title + ", isElevated=" + this.isElevated + ")";
    }

    public LinkAppBarState(boolean z, boolean z2, ResolvableString resolvableString, boolean z3) {
        this.showHeader = z;
        this.canNavigateBack = z2;
        this.title = resolvableString;
        this.isElevated = z3;
    }

    public final boolean getShowHeader() {
        return this.showHeader;
    }

    public final boolean getCanNavigateBack() {
        return this.canNavigateBack;
    }

    public final ResolvableString getTitle() {
        return this.title;
    }

    public final boolean isElevated() {
        return this.isElevated;
    }

    public final boolean getCanShowCloseIcon() {
        return !this.canNavigateBack;
    }

    /* compiled from: LinkAppBarState.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\"\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/link/ui/LinkAppBarState$Companion;", "", "<init>", "()V", "initial", "Lcom/stripe/android/link/ui/LinkAppBarState;", "create", "currentEntry", "Landroidx/navigation/NavBackStackEntry;", "previousEntryRoute", "", "consumerIsSigningUp", "", "updateCardTitle", "Lcom/stripe/android/core/strings/ResolvableString;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LinkAppBarState initial() {
            return new LinkAppBarState(true, false, null, false);
        }

        public final LinkAppBarState create(NavBackStackEntry currentEntry, String previousEntryRoute, boolean consumerIsSigningUp) {
            NavDestination destination;
            ResolvableString resolvableStringUpdateCardTitle = null;
            String route = (currentEntry == null || (destination = currentEntry.getDestination()) == null) ? null : destination.getRoute();
            Set setMutableSetOf = SetsKt.mutableSetOf(LinkScreen.Loading.INSTANCE.getRoute(), LinkScreen.SignUp.INSTANCE.getRoute(), LinkScreen.Wallet.INSTANCE.getRoute(), LinkScreen.Verification.INSTANCE.getRoute());
            if (consumerIsSigningUp) {
                setMutableSetOf.add(LinkScreen.PaymentMethod.INSTANCE.getRoute());
            }
            if (Intrinsics.areEqual(route, LinkScreen.PaymentMethod.INSTANCE.getRoute())) {
                if (!consumerIsSigningUp) {
                    resolvableStringUpdateCardTitle = ResolvableStringUtilsKt.getResolvableString(R.string.stripe_add_payment_method);
                }
            } else if (Intrinsics.areEqual(route, LinkScreen.UpdateCard.INSTANCE.getRoute())) {
                resolvableStringUpdateCardTitle = updateCardTitle(currentEntry);
            }
            return new LinkAppBarState(CollectionsKt.contains(setMutableSetOf, route), previousEntryRoute != null, resolvableStringUpdateCardTitle, false);
        }

        private final ResolvableString updateCardTitle(NavBackStackEntry currentEntry) {
            if (LinkScreen.INSTANCE.billingDetailsUpdateFlow(currentEntry) != null) {
                return ResolvableStringUtilsKt.getResolvableString(R.string.stripe_link_confirm_payment_title);
            }
            return ResolvableStringUtilsKt.getResolvableString(R.string.stripe_link_update_card_title);
        }
    }
}
