package com.stripe.android.uicore.navigation;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NavigationManager.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/uicore/navigation/PopUpToBehavior;", "", "inclusive", "", "getInclusive", "()Z", "Start", "Current", "Route", "Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Current;", "Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Route;", "Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Start;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PopUpToBehavior {
    boolean getInclusive();

    /* compiled from: NavigationManager.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Start;", "Lcom/stripe/android/uicore/navigation/PopUpToBehavior;", "<init>", "()V", "inclusive", "", "getInclusive", "()Z", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Start implements PopUpToBehavior {
        public static final int $stable = 0;
        public static final Start INSTANCE = new Start();
        private static final boolean inclusive = true;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Start)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 122269371;
        }

        public String toString() {
            return "Start";
        }

        private Start() {
        }

        @Override // com.stripe.android.uicore.navigation.PopUpToBehavior
        public boolean getInclusive() {
            return inclusive;
        }
    }

    /* compiled from: NavigationManager.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Current;", "Lcom/stripe/android/uicore/navigation/PopUpToBehavior;", "inclusive", "", "<init>", "(Z)V", "getInclusive", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Current implements PopUpToBehavior {
        public static final int $stable = 0;
        private final boolean inclusive;

        public static /* synthetic */ Current copy$default(Current current, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = current.inclusive;
            }
            return current.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getInclusive() {
            return this.inclusive;
        }

        public final Current copy(boolean inclusive) {
            return new Current(inclusive);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Current) && this.inclusive == ((Current) other).inclusive;
        }

        public int hashCode() {
            return Boolean.hashCode(this.inclusive);
        }

        public String toString() {
            return "Current(inclusive=" + this.inclusive + ")";
        }

        public Current(boolean z) {
            this.inclusive = z;
        }

        @Override // com.stripe.android.uicore.navigation.PopUpToBehavior
        public boolean getInclusive() {
            return this.inclusive;
        }
    }

    /* compiled from: NavigationManager.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/uicore/navigation/PopUpToBehavior$Route;", "Lcom/stripe/android/uicore/navigation/PopUpToBehavior;", "inclusive", "", "route", "", "<init>", "(ZLjava/lang/String;)V", "getInclusive", "()Z", "getRoute", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Route implements PopUpToBehavior {
        public static final int $stable = 0;
        private final boolean inclusive;
        private final String route;

        public static /* synthetic */ Route copy$default(Route route, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = route.inclusive;
            }
            if ((i & 2) != 0) {
                str = route.route;
            }
            return route.copy(z, str);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getInclusive() {
            return this.inclusive;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRoute() {
            return this.route;
        }

        public final Route copy(boolean inclusive, String route) {
            Intrinsics.checkNotNullParameter(route, "route");
            return new Route(inclusive, route);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Route)) {
                return false;
            }
            Route route = (Route) other;
            return this.inclusive == route.inclusive && Intrinsics.areEqual(this.route, route.route);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.inclusive) * 31) + this.route.hashCode();
        }

        public String toString() {
            return "Route(inclusive=" + this.inclusive + ", route=" + this.route + ")";
        }

        public Route(boolean z, String route) {
            Intrinsics.checkNotNullParameter(route, "route");
            this.inclusive = z;
            this.route = route;
        }

        @Override // com.stripe.android.uicore.navigation.PopUpToBehavior
        public boolean getInclusive() {
            return this.inclusive;
        }

        public final String getRoute() {
            return this.route;
        }
    }
}
