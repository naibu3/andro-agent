package com.stripe.android.uicore.navigation;

import androidx.navigation.NavBackStackEntry;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NavigationEffects.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/uicore/navigation/NavBackStackEntryUpdate;", "", "previousBackStackEntry", "Landroidx/navigation/NavBackStackEntry;", "currentBackStackEntry", "<init>", "(Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavBackStackEntry;)V", "getPreviousBackStackEntry", "()Landroidx/navigation/NavBackStackEntry;", "getCurrentBackStackEntry", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class NavBackStackEntryUpdate {
    public static final int $stable = 8;
    private final NavBackStackEntry currentBackStackEntry;
    private final NavBackStackEntry previousBackStackEntry;

    public static /* synthetic */ NavBackStackEntryUpdate copy$default(NavBackStackEntryUpdate navBackStackEntryUpdate, NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2, int i, Object obj) {
        if ((i & 1) != 0) {
            navBackStackEntry = navBackStackEntryUpdate.previousBackStackEntry;
        }
        if ((i & 2) != 0) {
            navBackStackEntry2 = navBackStackEntryUpdate.currentBackStackEntry;
        }
        return navBackStackEntryUpdate.copy(navBackStackEntry, navBackStackEntry2);
    }

    /* renamed from: component1, reason: from getter */
    public final NavBackStackEntry getPreviousBackStackEntry() {
        return this.previousBackStackEntry;
    }

    /* renamed from: component2, reason: from getter */
    public final NavBackStackEntry getCurrentBackStackEntry() {
        return this.currentBackStackEntry;
    }

    public final NavBackStackEntryUpdate copy(NavBackStackEntry previousBackStackEntry, NavBackStackEntry currentBackStackEntry) {
        return new NavBackStackEntryUpdate(previousBackStackEntry, currentBackStackEntry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavBackStackEntryUpdate)) {
            return false;
        }
        NavBackStackEntryUpdate navBackStackEntryUpdate = (NavBackStackEntryUpdate) other;
        return Intrinsics.areEqual(this.previousBackStackEntry, navBackStackEntryUpdate.previousBackStackEntry) && Intrinsics.areEqual(this.currentBackStackEntry, navBackStackEntryUpdate.currentBackStackEntry);
    }

    public int hashCode() {
        NavBackStackEntry navBackStackEntry = this.previousBackStackEntry;
        int iHashCode = (navBackStackEntry == null ? 0 : navBackStackEntry.hashCode()) * 31;
        NavBackStackEntry navBackStackEntry2 = this.currentBackStackEntry;
        return iHashCode + (navBackStackEntry2 != null ? navBackStackEntry2.hashCode() : 0);
    }

    public String toString() {
        return "NavBackStackEntryUpdate(previousBackStackEntry=" + this.previousBackStackEntry + ", currentBackStackEntry=" + this.currentBackStackEntry + ")";
    }

    public NavBackStackEntryUpdate(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        this.previousBackStackEntry = navBackStackEntry;
        this.currentBackStackEntry = navBackStackEntry2;
    }

    public final NavBackStackEntry getPreviousBackStackEntry() {
        return this.previousBackStackEntry;
    }

    public final NavBackStackEntry getCurrentBackStackEntry() {
        return this.currentBackStackEntry;
    }
}
