package com.stripe.android.link;

import android.os.Bundle;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavType;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: LinkScreen.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00152\u00020\u0001:\u0007\u000f\u0010\u0011\u0012\u0013\u0014\u0015B!\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\n\u0082\u0001\u0006\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/link/LinkScreen;", "", "baseRoute", "", CardScanActivity.ARGS, "", "Landroidx/navigation/NamedNavArgument;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getBaseRoute", "()Ljava/lang/String;", "route", "getRoute", "route$delegate", "Lkotlin/Lazy;", "Loading", "Verification", "Wallet", "PaymentMethod", "SignUp", "UpdateCard", "Companion", "Lcom/stripe/android/link/LinkScreen$Loading;", "Lcom/stripe/android/link/LinkScreen$PaymentMethod;", "Lcom/stripe/android/link/LinkScreen$SignUp;", "Lcom/stripe/android/link/LinkScreen$UpdateCard;", "Lcom/stripe/android/link/LinkScreen$Verification;", "Lcom/stripe/android/link/LinkScreen$Wallet;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class LinkScreen {
    public static final String EXTRA_BILLING_UPDATE_CVC = "billing_update_cvc";
    public static final String EXTRA_IS_BILLING_UPDATE_FLOW = "is_billing_update_flow";
    public static final String EXTRA_PAYMENT_DETAILS = "payment_details";
    private final List<NamedNavArgument> args;
    private final String baseRoute;

    /* renamed from: route$delegate, reason: from kotlin metadata */
    private final Lazy route;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ LinkScreen(String str, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list);
    }

    private LinkScreen(String str, List<NamedNavArgument> list) {
        this.baseRoute = str;
        this.args = list;
        this.route = LazyKt.lazy(new Function0() { // from class: com.stripe.android.link.LinkScreen$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LinkScreen.route_delegate$lambda$2(this.f$0);
            }
        });
    }

    protected final String getBaseRoute() {
        return this.baseRoute;
    }

    public /* synthetic */ LinkScreen(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, null);
    }

    public final String getRoute() {
        return (String) this.route.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String route_delegate$lambda$2(LinkScreen linkScreen) {
        List<NamedNavArgument> list = linkScreen.args;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((NamedNavArgument) it.next()).getName());
        }
        ArrayList arrayList2 = arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (Object obj : arrayList2) {
            linkedHashMap.put(obj, "{" + ((String) obj) + "}");
        }
        return LinkScreenKt.appendParamValues(linkScreen.baseRoute, linkedHashMap);
    }

    /* compiled from: LinkScreen.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/LinkScreen$Loading;", "Lcom/stripe/android/link/LinkScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Loading extends LinkScreen {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loading)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 162565045;
        }

        public String toString() {
            return "Loading";
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Loading() {
            super("loading", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: LinkScreen.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/LinkScreen$Verification;", "Lcom/stripe/android/link/LinkScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Verification extends LinkScreen {
        public static final int $stable = 0;
        public static final Verification INSTANCE = new Verification();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Verification)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1134219074;
        }

        public String toString() {
            return "Verification";
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Verification() {
            super("verification", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: LinkScreen.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/LinkScreen$Wallet;", "Lcom/stripe/android/link/LinkScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Wallet extends LinkScreen {
        public static final int $stable = 0;
        public static final Wallet INSTANCE = new Wallet();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Wallet)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -108071328;
        }

        public String toString() {
            return "Wallet";
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Wallet() {
            super("wallet", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: LinkScreen.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/LinkScreen$PaymentMethod;", "Lcom/stripe/android/link/LinkScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PaymentMethod extends LinkScreen {
        public static final int $stable = 0;
        public static final PaymentMethod INSTANCE = new PaymentMethod();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentMethod)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 818478656;
        }

        public String toString() {
            return "PaymentMethod";
        }

        /* JADX WARN: Multi-variable type inference failed */
        private PaymentMethod() {
            super("paymentMethod", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: LinkScreen.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/LinkScreen$SignUp;", "Lcom/stripe/android/link/LinkScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SignUp extends LinkScreen {
        public static final int $stable = 0;
        public static final SignUp INSTANCE = new SignUp();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SignUp)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -215347297;
        }

        public String toString() {
            return "SignUp";
        }

        /* JADX WARN: Multi-variable type inference failed */
        private SignUp() {
            super("signUp", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: LinkScreen.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086\u0002J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/link/LinkScreen$UpdateCard;", "Lcom/stripe/android/link/LinkScreen;", "<init>", "()V", "invoke", "", "paymentDetailsId", "billingDetailsUpdateFlow", "Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "BillingDetailsUpdateFlow", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateCard extends LinkScreen {
        public static final int $stable = 0;
        public static final UpdateCard INSTANCE = new UpdateCard();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateCard)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1842590304;
        }

        public String toString() {
            return "UpdateCard";
        }

        private UpdateCard() {
            super("updateCard", CollectionsKt.listOf((Object[]) new NamedNavArgument[]{NamedNavArgumentKt.navArgument(LinkScreen.EXTRA_PAYMENT_DETAILS, new Function1() { // from class: com.stripe.android.link.LinkScreen$UpdateCard$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LinkScreen.UpdateCard._init_$lambda$0((NavArgumentBuilder) obj);
                }
            }), NamedNavArgumentKt.navArgument(LinkScreen.EXTRA_IS_BILLING_UPDATE_FLOW, new Function1() { // from class: com.stripe.android.link.LinkScreen$UpdateCard$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LinkScreen.UpdateCard._init_$lambda$1((NavArgumentBuilder) obj);
                }
            }), NamedNavArgumentKt.navArgument(LinkScreen.EXTRA_BILLING_UPDATE_CVC, new Function1() { // from class: com.stripe.android.link.LinkScreen$UpdateCard$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LinkScreen.UpdateCard._init_$lambda$2((NavArgumentBuilder) obj);
                }
            })}), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$0(NavArgumentBuilder navArgument) {
            Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
            navArgument.setType(NavType.StringType);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$1(NavArgumentBuilder navArgument) {
            Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
            navArgument.setType(NavType.BoolType);
            navArgument.setDefaultValue(false);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$2(NavArgumentBuilder navArgument) {
            Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
            navArgument.setType(NavType.StringType);
            navArgument.setNullable(true);
            navArgument.setDefaultValue(null);
            return Unit.INSTANCE;
        }

        public final String invoke(String paymentDetailsId, BillingDetailsUpdateFlow billingDetailsUpdateFlow) {
            Intrinsics.checkNotNullParameter(paymentDetailsId, "paymentDetailsId");
            String baseRoute = getBaseRoute();
            Pair[] pairArr = new Pair[3];
            pairArr[0] = TuplesKt.to(LinkScreen.EXTRA_PAYMENT_DETAILS, paymentDetailsId);
            pairArr[1] = TuplesKt.to(LinkScreen.EXTRA_IS_BILLING_UPDATE_FLOW, String.valueOf(billingDetailsUpdateFlow != null));
            pairArr[2] = TuplesKt.to(LinkScreen.EXTRA_BILLING_UPDATE_CVC, billingDetailsUpdateFlow != null ? billingDetailsUpdateFlow.getCvc() : null);
            return LinkScreenKt.appendParamValues(baseRoute, MapsKt.mapOf(pairArr));
        }

        /* compiled from: LinkScreen.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;", "", "cvc", "", "<init>", "(Ljava/lang/String;)V", "getCvc", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BillingDetailsUpdateFlow {
            public static final int $stable = 0;
            private final String cvc;

            /* JADX WARN: Multi-variable type inference failed */
            public BillingDetailsUpdateFlow() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ BillingDetailsUpdateFlow copy$default(BillingDetailsUpdateFlow billingDetailsUpdateFlow, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = billingDetailsUpdateFlow.cvc;
                }
                return billingDetailsUpdateFlow.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getCvc() {
                return this.cvc;
            }

            public final BillingDetailsUpdateFlow copy(String cvc) {
                return new BillingDetailsUpdateFlow(cvc);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BillingDetailsUpdateFlow) && Intrinsics.areEqual(this.cvc, ((BillingDetailsUpdateFlow) other).cvc);
            }

            public int hashCode() {
                String str = this.cvc;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "BillingDetailsUpdateFlow(cvc=" + this.cvc + ")";
            }

            public BillingDetailsUpdateFlow(String str) {
                this.cvc = str;
            }

            public /* synthetic */ BillingDetailsUpdateFlow(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public final String getCvc() {
                return this.cvc;
            }
        }
    }

    /* compiled from: LinkScreen.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/link/LinkScreen$Companion;", "", "<init>", "()V", "EXTRA_PAYMENT_DETAILS", "", "EXTRA_IS_BILLING_UPDATE_FLOW", "EXTRA_BILLING_UPDATE_CVC", "billingDetailsUpdateFlow", "Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;", "Landroidx/navigation/NavBackStackEntry;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UpdateCard.BillingDetailsUpdateFlow billingDetailsUpdateFlow(NavBackStackEntry navBackStackEntry) {
            Intrinsics.checkNotNullParameter(navBackStackEntry, "<this>");
            Bundle arguments = navBackStackEntry.getArguments();
            if (arguments != null && Boolean.parseBoolean(arguments.getString(LinkScreen.EXTRA_IS_BILLING_UPDATE_FLOW))) {
                return new UpdateCard.BillingDetailsUpdateFlow(arguments.getString(LinkScreen.EXTRA_BILLING_UPDATE_CVC));
            }
            return null;
        }
    }
}
