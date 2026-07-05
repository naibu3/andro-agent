package com.stripe.android.uicore.navigation;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NavigationManager.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/uicore/navigation/NavigationIntent;", "", "<init>", "()V", "NavigateTo", "NavigateBack", "Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateBack;", "Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class NavigationIntent {
    public static final int $stable = 0;

    public /* synthetic */ NavigationIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NavigationIntent() {
    }

    /* compiled from: NavigationManager.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateTo;", "Lcom/stripe/android/uicore/navigation/NavigationIntent;", "route", "", "popUpTo", "Lcom/stripe/android/uicore/navigation/PopUpToBehavior;", "isSingleTop", "", "<init>", "(Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;Z)V", "getRoute", "()Ljava/lang/String;", "getPopUpTo", "()Lcom/stripe/android/uicore/navigation/PopUpToBehavior;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NavigateTo extends NavigationIntent {
        public static final int $stable = 8;
        private final boolean isSingleTop;
        private final PopUpToBehavior popUpTo;
        private final String route;

        public static /* synthetic */ NavigateTo copy$default(NavigateTo navigateTo, String str, PopUpToBehavior popUpToBehavior, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateTo.route;
            }
            if ((i & 2) != 0) {
                popUpToBehavior = navigateTo.popUpTo;
            }
            if ((i & 4) != 0) {
                z = navigateTo.isSingleTop;
            }
            return navigateTo.copy(str, popUpToBehavior, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRoute() {
            return this.route;
        }

        /* renamed from: component2, reason: from getter */
        public final PopUpToBehavior getPopUpTo() {
            return this.popUpTo;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsSingleTop() {
            return this.isSingleTop;
        }

        public final NavigateTo copy(String route, PopUpToBehavior popUpTo, boolean isSingleTop) {
            Intrinsics.checkNotNullParameter(route, "route");
            return new NavigateTo(route, popUpTo, isSingleTop);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateTo)) {
                return false;
            }
            NavigateTo navigateTo = (NavigateTo) other;
            return Intrinsics.areEqual(this.route, navigateTo.route) && Intrinsics.areEqual(this.popUpTo, navigateTo.popUpTo) && this.isSingleTop == navigateTo.isSingleTop;
        }

        public int hashCode() {
            int iHashCode = this.route.hashCode() * 31;
            PopUpToBehavior popUpToBehavior = this.popUpTo;
            return ((iHashCode + (popUpToBehavior == null ? 0 : popUpToBehavior.hashCode())) * 31) + Boolean.hashCode(this.isSingleTop);
        }

        public String toString() {
            return "NavigateTo(route=" + this.route + ", popUpTo=" + this.popUpTo + ", isSingleTop=" + this.isSingleTop + ")";
        }

        public final String getRoute() {
            return this.route;
        }

        public final PopUpToBehavior getPopUpTo() {
            return this.popUpTo;
        }

        public final boolean isSingleTop() {
            return this.isSingleTop;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateTo(String route, PopUpToBehavior popUpToBehavior, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(route, "route");
            this.route = route;
            this.popUpTo = popUpToBehavior;
            this.isSingleTop = z;
        }
    }

    /* compiled from: NavigationManager.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/uicore/navigation/NavigationIntent$NavigateBack;", "Lcom/stripe/android/uicore/navigation/NavigationIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends NavigationIntent {
        public static final int $stable = 0;
        public static final NavigateBack INSTANCE = new NavigateBack();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateBack)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1884351420;
        }

        public String toString() {
            return "NavigateBack";
        }

        private NavigateBack() {
            super(null);
        }
    }
}
