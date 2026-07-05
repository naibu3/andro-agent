package com.stripe.android.paymentsheet.state;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.link.ui.LinkButtonState;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.model.GooglePayButtonType;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WalletsState.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0003'()BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JU\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\tHÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006*"}, d2 = {"Lcom/stripe/android/paymentsheet/state/WalletsState;", "", "link", "Lcom/stripe/android/paymentsheet/state/WalletsState$Link;", "googlePay", "Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;", "buttonsEnabled", "", "dividerTextResource", "", "onGooglePayPressed", "Lkotlin/Function0;", "", "onLinkPressed", "<init>", "(Lcom/stripe/android/paymentsheet/state/WalletsState$Link;Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;ZILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getLink", "()Lcom/stripe/android/paymentsheet/state/WalletsState$Link;", "getGooglePay", "()Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;", "getButtonsEnabled", "()Z", "getDividerTextResource", "()I", "getOnGooglePayPressed", "()Lkotlin/jvm/functions/Function0;", "getOnLinkPressed", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "Link", "GooglePay", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class WalletsState {
    private final boolean buttonsEnabled;
    private final int dividerTextResource;
    private final GooglePay googlePay;
    private final Link link;
    private final Function0<Unit> onGooglePayPressed;
    private final Function0<Unit> onLinkPressed;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GooglePayJsonFactory.BillingAddressParameters.$stable;

    public static /* synthetic */ WalletsState copy$default(WalletsState walletsState, Link link, GooglePay googlePay, boolean z, int i, Function0 function0, Function0 function02, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            link = walletsState.link;
        }
        if ((i2 & 2) != 0) {
            googlePay = walletsState.googlePay;
        }
        if ((i2 & 4) != 0) {
            z = walletsState.buttonsEnabled;
        }
        if ((i2 & 8) != 0) {
            i = walletsState.dividerTextResource;
        }
        if ((i2 & 16) != 0) {
            function0 = walletsState.onGooglePayPressed;
        }
        if ((i2 & 32) != 0) {
            function02 = walletsState.onLinkPressed;
        }
        Function0 function03 = function0;
        Function0 function04 = function02;
        return walletsState.copy(link, googlePay, z, i, function03, function04);
    }

    /* renamed from: component1, reason: from getter */
    public final Link getLink() {
        return this.link;
    }

    /* renamed from: component2, reason: from getter */
    public final GooglePay getGooglePay() {
        return this.googlePay;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getButtonsEnabled() {
        return this.buttonsEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDividerTextResource() {
        return this.dividerTextResource;
    }

    public final Function0<Unit> component5() {
        return this.onGooglePayPressed;
    }

    public final Function0<Unit> component6() {
        return this.onLinkPressed;
    }

    public final WalletsState copy(Link link, GooglePay googlePay, boolean buttonsEnabled, int dividerTextResource, Function0<Unit> onGooglePayPressed, Function0<Unit> onLinkPressed) {
        Intrinsics.checkNotNullParameter(onGooglePayPressed, "onGooglePayPressed");
        Intrinsics.checkNotNullParameter(onLinkPressed, "onLinkPressed");
        return new WalletsState(link, googlePay, buttonsEnabled, dividerTextResource, onGooglePayPressed, onLinkPressed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletsState)) {
            return false;
        }
        WalletsState walletsState = (WalletsState) other;
        return Intrinsics.areEqual(this.link, walletsState.link) && Intrinsics.areEqual(this.googlePay, walletsState.googlePay) && this.buttonsEnabled == walletsState.buttonsEnabled && this.dividerTextResource == walletsState.dividerTextResource && Intrinsics.areEqual(this.onGooglePayPressed, walletsState.onGooglePayPressed) && Intrinsics.areEqual(this.onLinkPressed, walletsState.onLinkPressed);
    }

    public int hashCode() {
        Link link = this.link;
        int iHashCode = (link == null ? 0 : link.hashCode()) * 31;
        GooglePay googlePay = this.googlePay;
        return ((((((((iHashCode + (googlePay != null ? googlePay.hashCode() : 0)) * 31) + Boolean.hashCode(this.buttonsEnabled)) * 31) + Integer.hashCode(this.dividerTextResource)) * 31) + this.onGooglePayPressed.hashCode()) * 31) + this.onLinkPressed.hashCode();
    }

    public String toString() {
        return "WalletsState(link=" + this.link + ", googlePay=" + this.googlePay + ", buttonsEnabled=" + this.buttonsEnabled + ", dividerTextResource=" + this.dividerTextResource + ", onGooglePayPressed=" + this.onGooglePayPressed + ", onLinkPressed=" + this.onLinkPressed + ")";
    }

    public WalletsState(Link link, GooglePay googlePay, boolean z, int i, Function0<Unit> onGooglePayPressed, Function0<Unit> onLinkPressed) {
        Intrinsics.checkNotNullParameter(onGooglePayPressed, "onGooglePayPressed");
        Intrinsics.checkNotNullParameter(onLinkPressed, "onLinkPressed");
        this.link = link;
        this.googlePay = googlePay;
        this.buttonsEnabled = z;
        this.dividerTextResource = i;
        this.onGooglePayPressed = onGooglePayPressed;
        this.onLinkPressed = onLinkPressed;
    }

    public final Link getLink() {
        return this.link;
    }

    public final GooglePay getGooglePay() {
        return this.googlePay;
    }

    public final boolean getButtonsEnabled() {
        return this.buttonsEnabled;
    }

    public final int getDividerTextResource() {
        return this.dividerTextResource;
    }

    public final Function0<Unit> getOnGooglePayPressed() {
        return this.onGooglePayPressed;
    }

    public final Function0<Unit> getOnLinkPressed() {
        return this.onLinkPressed;
    }

    /* compiled from: WalletsState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/state/WalletsState$Link;", "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/link/ui/LinkButtonState;", "<init>", "(Lcom/stripe/android/link/ui/LinkButtonState;)V", "getState", "()Lcom/stripe/android/link/ui/LinkButtonState;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Link {
        public static final int $stable = 0;
        private final LinkButtonState state;

        public static /* synthetic */ Link copy$default(Link link, LinkButtonState linkButtonState, int i, Object obj) {
            if ((i & 1) != 0) {
                linkButtonState = link.state;
            }
            return link.copy(linkButtonState);
        }

        /* renamed from: component1, reason: from getter */
        public final LinkButtonState getState() {
            return this.state;
        }

        public final Link copy(LinkButtonState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new Link(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Link) && Intrinsics.areEqual(this.state, ((Link) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "Link(state=" + this.state + ")";
        }

        public Link(LinkButtonState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }

        public final LinkButtonState getState() {
            return this.state;
        }
    }

    /* compiled from: WalletsState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/state/WalletsState$GooglePay;", "", "buttonType", "Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;", "allowCreditCards", "", "billingAddressParameters", "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;", "<init>", "(Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;ZLcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;)V", "getButtonType", "()Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;", "getAllowCreditCards", "()Z", "getBillingAddressParameters", "()Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GooglePay {
        public static final int $stable = GooglePayJsonFactory.BillingAddressParameters.$stable;
        private final boolean allowCreditCards;
        private final GooglePayJsonFactory.BillingAddressParameters billingAddressParameters;
        private final GooglePayButtonType buttonType;

        public static /* synthetic */ GooglePay copy$default(GooglePay googlePay, GooglePayButtonType googlePayButtonType, boolean z, GooglePayJsonFactory.BillingAddressParameters billingAddressParameters, int i, Object obj) {
            if ((i & 1) != 0) {
                googlePayButtonType = googlePay.buttonType;
            }
            if ((i & 2) != 0) {
                z = googlePay.allowCreditCards;
            }
            if ((i & 4) != 0) {
                billingAddressParameters = googlePay.billingAddressParameters;
            }
            return googlePay.copy(googlePayButtonType, z, billingAddressParameters);
        }

        /* renamed from: component1, reason: from getter */
        public final GooglePayButtonType getButtonType() {
            return this.buttonType;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getAllowCreditCards() {
            return this.allowCreditCards;
        }

        /* renamed from: component3, reason: from getter */
        public final GooglePayJsonFactory.BillingAddressParameters getBillingAddressParameters() {
            return this.billingAddressParameters;
        }

        public final GooglePay copy(GooglePayButtonType buttonType, boolean allowCreditCards, GooglePayJsonFactory.BillingAddressParameters billingAddressParameters) {
            Intrinsics.checkNotNullParameter(buttonType, "buttonType");
            return new GooglePay(buttonType, allowCreditCards, billingAddressParameters);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GooglePay)) {
                return false;
            }
            GooglePay googlePay = (GooglePay) other;
            return this.buttonType == googlePay.buttonType && this.allowCreditCards == googlePay.allowCreditCards && Intrinsics.areEqual(this.billingAddressParameters, googlePay.billingAddressParameters);
        }

        public int hashCode() {
            int iHashCode = ((this.buttonType.hashCode() * 31) + Boolean.hashCode(this.allowCreditCards)) * 31;
            GooglePayJsonFactory.BillingAddressParameters billingAddressParameters = this.billingAddressParameters;
            return iHashCode + (billingAddressParameters == null ? 0 : billingAddressParameters.hashCode());
        }

        public String toString() {
            return "GooglePay(buttonType=" + this.buttonType + ", allowCreditCards=" + this.allowCreditCards + ", billingAddressParameters=" + this.billingAddressParameters + ")";
        }

        public GooglePay(GooglePayButtonType buttonType, boolean z, GooglePayJsonFactory.BillingAddressParameters billingAddressParameters) {
            Intrinsics.checkNotNullParameter(buttonType, "buttonType");
            this.buttonType = buttonType;
            this.allowCreditCards = z;
            this.billingAddressParameters = billingAddressParameters;
        }

        public final GooglePayButtonType getButtonType() {
            return this.buttonType;
        }

        public final boolean getAllowCreditCards() {
            return this.allowCreditCards;
        }

        public final GooglePayJsonFactory.BillingAddressParameters getBillingAddressParameters() {
            return this.billingAddressParameters;
        }
    }

    /* compiled from: WalletsState.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ju\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/state/WalletsState$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/paymentsheet/state/WalletsState;", "isLinkAvailable", "", "linkEmail", "", "isGooglePayReady", "googlePayButtonType", "Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;", "buttonsEnabled", "paymentMethodTypes", "", "googlePayLauncherConfig", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "onGooglePayPressed", "Lkotlin/Function0;", "", "onLinkPressed", "isSetupIntent", "(Ljava/lang/Boolean;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/model/GooglePayButtonType;ZLjava/util/List;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)Lcom/stripe/android/paymentsheet/state/WalletsState;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: WalletsState.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[GooglePayPaymentMethodLauncher.BillingAddressConfig.Format.values().length];
                try {
                    iArr[GooglePayPaymentMethodLauncher.BillingAddressConfig.Format.Min.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[GooglePayPaymentMethodLauncher.BillingAddressConfig.Format.Full.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final WalletsState create(Boolean isLinkAvailable, String linkEmail, boolean isGooglePayReady, GooglePayButtonType googlePayButtonType, boolean buttonsEnabled, List<String> paymentMethodTypes, GooglePayPaymentMethodLauncher.Config googlePayLauncherConfig, Function0<Unit> onGooglePayPressed, Function0<Unit> onLinkPressed, boolean isSetupIntent) {
            GooglePayJsonFactory.BillingAddressParameters billingAddressParameters;
            int i;
            GooglePayJsonFactory.BillingAddressParameters.Format format;
            Intrinsics.checkNotNullParameter(googlePayButtonType, "googlePayButtonType");
            Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
            Intrinsics.checkNotNullParameter(onGooglePayPressed, "onGooglePayPressed");
            Intrinsics.checkNotNullParameter(onLinkPressed, "onLinkPressed");
            Link link = Intrinsics.areEqual((Object) isLinkAvailable, (Object) true) ? new Link(LinkButtonState.INSTANCE.create(linkEmail, null, false)) : null;
            boolean allowCreditCards = googlePayLauncherConfig != null ? googlePayLauncherConfig.getAllowCreditCards() : false;
            if (googlePayLauncherConfig != null) {
                boolean zIsRequired = googlePayLauncherConfig.getBillingAddressConfig().isRequired();
                int i2 = WhenMappings.$EnumSwitchMapping$0[googlePayLauncherConfig.getBillingAddressConfig().getFormat().ordinal()];
                if (i2 == 1) {
                    format = GooglePayJsonFactory.BillingAddressParameters.Format.Min;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    format = GooglePayJsonFactory.BillingAddressParameters.Format.Full;
                }
                billingAddressParameters = new GooglePayJsonFactory.BillingAddressParameters(zIsRequired, format, googlePayLauncherConfig.getBillingAddressConfig().isPhoneNumberRequired());
            } else {
                billingAddressParameters = null;
            }
            GooglePay googlePay = new GooglePay(googlePayButtonType, allowCreditCards, billingAddressParameters);
            if (!isGooglePayReady) {
                googlePay = null;
            }
            if (link == null && googlePay == null) {
                return null;
            }
            if (Intrinsics.areEqual(CollectionsKt.singleOrNull((List) paymentMethodTypes), PaymentMethod.Type.Card.code) && !isSetupIntent) {
                i = R.string.stripe_paymentsheet_or_pay_with_card;
            } else if (CollectionsKt.singleOrNull((List) paymentMethodTypes) == null && !isSetupIntent) {
                i = R.string.stripe_paymentsheet_or_pay_using;
            } else if (Intrinsics.areEqual(CollectionsKt.singleOrNull((List) paymentMethodTypes), PaymentMethod.Type.Card.code) && isSetupIntent) {
                i = R.string.stripe_paymentsheet_or_use_a_card;
            } else {
                i = R.string.stripe_paymentsheet_or_use;
            }
            return new WalletsState(link, googlePay, buttonsEnabled, i, onGooglePayPressed, onLinkPressed);
        }
    }
}
