package com.stripe.android.paymentsheet.ui;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.link.LinkExpressMode;
import com.stripe.android.link.ui.LinkButtonState;
import com.stripe.android.link.ui.verification.VerificationViewState;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.GooglePayButtonType;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.utils.GooglePayUtilsKt;
import com.stripe.android.uicore.elements.OTPElement;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: WalletButtonsInteractor.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0003\u000b\f\rJ\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;", "", ServerProtocol.DIALOG_PARAM_STATE, "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "handleViewAction", "", "action", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction;", "State", "WalletButton", "ViewAction", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface WalletButtonsInteractor {
    StateFlow<State> getState();

    void handleViewAction(ViewAction action);

    /* compiled from: WalletButtonsInteractor.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;", "", "link2FAState", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State$LinkOtpState;", "walletButtons", "", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton;", "buttonsEnabled", "", "<init>", "(Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State$LinkOtpState;Ljava/util/List;Z)V", "getLink2FAState", "()Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State$LinkOtpState;", "getWalletButtons", "()Ljava/util/List;", "getButtonsEnabled", "()Z", "hasContent", "getHasContent", "LinkOtpState", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class State {
        public static final int $stable = 8;
        private final boolean buttonsEnabled;
        private final LinkOtpState link2FAState;
        private final List<WalletButton> walletButtons;

        /* JADX WARN: Multi-variable type inference failed */
        public State(LinkOtpState linkOtpState, List<? extends WalletButton> walletButtons, boolean z) {
            Intrinsics.checkNotNullParameter(walletButtons, "walletButtons");
            this.link2FAState = linkOtpState;
            this.walletButtons = walletButtons;
            this.buttonsEnabled = z;
        }

        public final LinkOtpState getLink2FAState() {
            return this.link2FAState;
        }

        public final List<WalletButton> getWalletButtons() {
            return this.walletButtons;
        }

        public final boolean getButtonsEnabled() {
            return this.buttonsEnabled;
        }

        /* compiled from: WalletButtonsInteractor.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State$LinkOtpState;", "", "viewState", "Lcom/stripe/android/link/ui/verification/VerificationViewState;", "otpElement", "Lcom/stripe/android/uicore/elements/OTPElement;", "<init>", "(Lcom/stripe/android/link/ui/verification/VerificationViewState;Lcom/stripe/android/uicore/elements/OTPElement;)V", "getViewState", "()Lcom/stripe/android/link/ui/verification/VerificationViewState;", "getOtpElement", "()Lcom/stripe/android/uicore/elements/OTPElement;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LinkOtpState {
            public static final int $stable = OTPElement.$stable;
            private final OTPElement otpElement;
            private final VerificationViewState viewState;

            public static /* synthetic */ LinkOtpState copy$default(LinkOtpState linkOtpState, VerificationViewState verificationViewState, OTPElement oTPElement, int i, Object obj) {
                if ((i & 1) != 0) {
                    verificationViewState = linkOtpState.viewState;
                }
                if ((i & 2) != 0) {
                    oTPElement = linkOtpState.otpElement;
                }
                return linkOtpState.copy(verificationViewState, oTPElement);
            }

            /* renamed from: component1, reason: from getter */
            public final VerificationViewState getViewState() {
                return this.viewState;
            }

            /* renamed from: component2, reason: from getter */
            public final OTPElement getOtpElement() {
                return this.otpElement;
            }

            public final LinkOtpState copy(VerificationViewState viewState, OTPElement otpElement) {
                Intrinsics.checkNotNullParameter(viewState, "viewState");
                Intrinsics.checkNotNullParameter(otpElement, "otpElement");
                return new LinkOtpState(viewState, otpElement);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LinkOtpState)) {
                    return false;
                }
                LinkOtpState linkOtpState = (LinkOtpState) other;
                return Intrinsics.areEqual(this.viewState, linkOtpState.viewState) && Intrinsics.areEqual(this.otpElement, linkOtpState.otpElement);
            }

            public int hashCode() {
                return (this.viewState.hashCode() * 31) + this.otpElement.hashCode();
            }

            public String toString() {
                return "LinkOtpState(viewState=" + this.viewState + ", otpElement=" + this.otpElement + ")";
            }

            public LinkOtpState(VerificationViewState viewState, OTPElement otpElement) {
                Intrinsics.checkNotNullParameter(viewState, "viewState");
                Intrinsics.checkNotNullParameter(otpElement, "otpElement");
                this.viewState = viewState;
                this.otpElement = otpElement;
            }

            public final VerificationViewState getViewState() {
                return this.viewState;
            }

            public final OTPElement getOtpElement() {
                return this.otpElement;
            }
        }

        public final boolean getHasContent() {
            return (this.walletButtons.isEmpty() && this.link2FAState == null) ? false : true;
        }
    }

    /* compiled from: WalletButtonsInteractor.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006J\b\u0010\u0002\u001a\u00020\u0003H&\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton;", "", "createSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "Link", "GooglePay", "ShopPay", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton$GooglePay;", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton$Link;", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton$ShopPay;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface WalletButton {
        PaymentSelection createSelection();

        /* compiled from: WalletButtonsInteractor.kt */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton$Link;", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton;", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/link/ui/LinkButtonState;", "<init>", "(Lcom/stripe/android/link/ui/LinkButtonState;)V", "getState", "()Lcom/stripe/android/link/ui/LinkButtonState;", "createSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Link implements WalletButton {
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

            @Override // com.stripe.android.paymentsheet.ui.WalletButtonsInteractor.WalletButton
            public PaymentSelection createSelection() {
                return new PaymentSelection.Link(LinkExpressMode.DISABLED, null, null, 6, null);
            }
        }

        /* compiled from: WalletButtonsInteractor.kt */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB+\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0010J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J1\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÂ\u0001J\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton$GooglePay;", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton;", "googlePayButtonType", "Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;", "billingAddressParameters", "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;", "allowCreditCards", "", "cardBrandFilter", "Lcom/stripe/android/CardBrandFilter;", "<init>", "(Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZLcom/stripe/android/CardBrandFilter;)V", "buttonType", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;", "billingDetailsCollectionConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "(Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;ZLcom/stripe/android/CardBrandFilter;)V", "getGooglePayButtonType", "()Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;", "getBillingAddressParameters", "()Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;", "getAllowCreditCards", "()Z", "getCardBrandFilter", "()Lcom/stripe/android/CardBrandFilter;", "createSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class GooglePay implements WalletButton {
            public static final int $stable = 0;
            private final boolean allowCreditCards;
            private final GooglePayJsonFactory.BillingAddressParameters billingAddressParameters;
            private final CardBrandFilter cardBrandFilter;
            private final GooglePayButtonType googlePayButtonType;

            private final GooglePay copy(GooglePayButtonType googlePayButtonType, GooglePayJsonFactory.BillingAddressParameters billingAddressParameters, boolean allowCreditCards, CardBrandFilter cardBrandFilter) {
                return new GooglePay(googlePayButtonType, billingAddressParameters, allowCreditCards, cardBrandFilter);
            }

            static /* synthetic */ GooglePay copy$default(GooglePay googlePay, GooglePayButtonType googlePayButtonType, GooglePayJsonFactory.BillingAddressParameters billingAddressParameters, boolean z, CardBrandFilter cardBrandFilter, int i, Object obj) {
                if ((i & 1) != 0) {
                    googlePayButtonType = googlePay.googlePayButtonType;
                }
                if ((i & 2) != 0) {
                    billingAddressParameters = googlePay.billingAddressParameters;
                }
                if ((i & 4) != 0) {
                    z = googlePay.allowCreditCards;
                }
                if ((i & 8) != 0) {
                    cardBrandFilter = googlePay.cardBrandFilter;
                }
                return googlePay.copy(googlePayButtonType, billingAddressParameters, z, cardBrandFilter);
            }

            /* renamed from: component1, reason: from getter */
            public final GooglePayButtonType getGooglePayButtonType() {
                return this.googlePayButtonType;
            }

            /* renamed from: component2, reason: from getter */
            public final GooglePayJsonFactory.BillingAddressParameters getBillingAddressParameters() {
                return this.billingAddressParameters;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getAllowCreditCards() {
                return this.allowCreditCards;
            }

            /* renamed from: component4, reason: from getter */
            public final CardBrandFilter getCardBrandFilter() {
                return this.cardBrandFilter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GooglePay)) {
                    return false;
                }
                GooglePay googlePay = (GooglePay) other;
                return this.googlePayButtonType == googlePay.googlePayButtonType && Intrinsics.areEqual(this.billingAddressParameters, googlePay.billingAddressParameters) && this.allowCreditCards == googlePay.allowCreditCards && Intrinsics.areEqual(this.cardBrandFilter, googlePay.cardBrandFilter);
            }

            public int hashCode() {
                return (((((this.googlePayButtonType.hashCode() * 31) + this.billingAddressParameters.hashCode()) * 31) + Boolean.hashCode(this.allowCreditCards)) * 31) + this.cardBrandFilter.hashCode();
            }

            public String toString() {
                return "GooglePay(googlePayButtonType=" + this.googlePayButtonType + ", billingAddressParameters=" + this.billingAddressParameters + ", allowCreditCards=" + this.allowCreditCards + ", cardBrandFilter=" + this.cardBrandFilter + ")";
            }

            private GooglePay(GooglePayButtonType googlePayButtonType, GooglePayJsonFactory.BillingAddressParameters billingAddressParameters, boolean z, CardBrandFilter cardBrandFilter) {
                this.googlePayButtonType = googlePayButtonType;
                this.billingAddressParameters = billingAddressParameters;
                this.allowCreditCards = z;
                this.cardBrandFilter = cardBrandFilter;
            }

            public final GooglePayButtonType getGooglePayButtonType() {
                return this.googlePayButtonType;
            }

            public final GooglePayJsonFactory.BillingAddressParameters getBillingAddressParameters() {
                return this.billingAddressParameters;
            }

            public final boolean getAllowCreditCards() {
                return this.allowCreditCards;
            }

            public final CardBrandFilter getCardBrandFilter() {
                return this.cardBrandFilter;
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public GooglePay(PaymentSheet.GooglePayConfiguration.ButtonType buttonType, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, boolean z, CardBrandFilter cardBrandFilter) {
                this(GooglePayUtilsKt.getAsGooglePayButtonType(buttonType), billingDetailsCollectionConfiguration.toBillingAddressParameters$paymentsheet_release(), z, cardBrandFilter);
                Intrinsics.checkNotNullParameter(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
                Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
            }

            @Override // com.stripe.android.paymentsheet.ui.WalletButtonsInteractor.WalletButton
            public PaymentSelection createSelection() {
                return PaymentSelection.GooglePay.INSTANCE;
            }
        }

        /* compiled from: WalletButtonsInteractor.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton$ShopPay;", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton;", "<init>", "()V", "createSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShopPay implements WalletButton {
            public static final int $stable = 0;
            public static final ShopPay INSTANCE = new ShopPay();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShopPay)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1107753172;
            }

            public String toString() {
                return "ShopPay";
            }

            private ShopPay() {
            }

            @Override // com.stripe.android.paymentsheet.ui.WalletButtonsInteractor.WalletButton
            public PaymentSelection createSelection() {
                return PaymentSelection.ShopPay.INSTANCE;
            }
        }
    }

    /* compiled from: WalletButtonsInteractor.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction;", "", "OnButtonPressed", "OnShown", "OnHidden", "OnResendCode", "OnResendCodeNotificationSent", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction$OnButtonPressed;", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction$OnHidden;", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction$OnResendCode;", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction$OnResendCodeNotificationSent;", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction$OnShown;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewAction {

        /* compiled from: WalletButtonsInteractor.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction$OnButtonPressed;", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction;", "button", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton;", "<init>", "(Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton;)V", "getButton", "()Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OnButtonPressed implements ViewAction {
            public static final int $stable = 8;
            private final WalletButton button;

            public static /* synthetic */ OnButtonPressed copy$default(OnButtonPressed onButtonPressed, WalletButton walletButton, int i, Object obj) {
                if ((i & 1) != 0) {
                    walletButton = onButtonPressed.button;
                }
                return onButtonPressed.copy(walletButton);
            }

            /* renamed from: component1, reason: from getter */
            public final WalletButton getButton() {
                return this.button;
            }

            public final OnButtonPressed copy(WalletButton button) {
                Intrinsics.checkNotNullParameter(button, "button");
                return new OnButtonPressed(button);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnButtonPressed) && Intrinsics.areEqual(this.button, ((OnButtonPressed) other).button);
            }

            public int hashCode() {
                return this.button.hashCode();
            }

            public String toString() {
                return "OnButtonPressed(button=" + this.button + ")";
            }

            public OnButtonPressed(WalletButton button) {
                Intrinsics.checkNotNullParameter(button, "button");
                this.button = button;
            }

            public final WalletButton getButton() {
                return this.button;
            }
        }

        /* compiled from: WalletButtonsInteractor.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction$OnShown;", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OnShown implements ViewAction {
            public static final int $stable = 0;
            public static final OnShown INSTANCE = new OnShown();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OnShown)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -181150876;
            }

            public String toString() {
                return "OnShown";
            }

            private OnShown() {
            }
        }

        /* compiled from: WalletButtonsInteractor.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction$OnHidden;", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OnHidden implements ViewAction {
            public static final int $stable = 0;
            public static final OnHidden INSTANCE = new OnHidden();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OnHidden)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1635053129;
            }

            public String toString() {
                return "OnHidden";
            }

            private OnHidden() {
            }
        }

        /* compiled from: WalletButtonsInteractor.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction$OnResendCode;", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OnResendCode implements ViewAction {
            public static final int $stable = 0;
            public static final OnResendCode INSTANCE = new OnResendCode();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OnResendCode)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -293552555;
            }

            public String toString() {
                return "OnResendCode";
            }

            private OnResendCode() {
            }
        }

        /* compiled from: WalletButtonsInteractor.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction$OnResendCodeNotificationSent;", "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OnResendCodeNotificationSent implements ViewAction {
            public static final int $stable = 0;
            public static final OnResendCodeNotificationSent INSTANCE = new OnResendCodeNotificationSent();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OnResendCodeNotificationSent)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -142796904;
            }

            public String toString() {
                return "OnResendCodeNotificationSent";
            }

            private OnResendCodeNotificationSent() {
            }
        }
    }
}
