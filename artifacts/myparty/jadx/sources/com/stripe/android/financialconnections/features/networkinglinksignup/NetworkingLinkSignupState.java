package com.stripe.android.financialconnections.features.networkinglinksignup;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.common.util.UriUtil;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.financialconnections.model.Bullet;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.LegalDetailsNotice;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: NetworkingLinkSignupViewModel.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003345Be\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0010\u0010\u0014J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010,\u001a\u00020\u000fHÆ\u0003Jg\u0010-\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010.\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0011\u0010!\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001eR\u0011\u0010#\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u00066"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;", "", "payload", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;", "validEmail", "", "validPhone", "saveAccountToLink", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "lookupAccount", "Lcom/stripe/android/model/ConsumerSessionLookup;", "viewEffect", "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;", "isInstantDebits", "", "<init>", "(Lcom/stripe/android/financialconnections/presentation/Async;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;Z)V", "parentState", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;", "(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)V", "getPayload", "()Lcom/stripe/android/financialconnections/presentation/Async;", "getValidEmail", "()Ljava/lang/String;", "getValidPhone", "getSaveAccountToLink", "getLookupAccount", "getViewEffect", "()Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;", "()Z", "showFullForm", "getShowFullForm", "valid", "getValid", "pane", "getPane", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Payload", "Content", "ViewEffect", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NetworkingLinkSignupState {
    public static final int $stable = 8;
    private final boolean isInstantDebits;
    private final Async<ConsumerSessionLookup> lookupAccount;
    private final Async<Payload> payload;
    private final Async<FinancialConnectionsSessionManifest.Pane> saveAccountToLink;
    private final String validEmail;
    private final String validPhone;
    private final ViewEffect viewEffect;

    public NetworkingLinkSignupState() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    public static /* synthetic */ NetworkingLinkSignupState copy$default(NetworkingLinkSignupState networkingLinkSignupState, Async async, String str, String str2, Async async2, Async async3, ViewEffect viewEffect, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            async = networkingLinkSignupState.payload;
        }
        if ((i & 2) != 0) {
            str = networkingLinkSignupState.validEmail;
        }
        if ((i & 4) != 0) {
            str2 = networkingLinkSignupState.validPhone;
        }
        if ((i & 8) != 0) {
            async2 = networkingLinkSignupState.saveAccountToLink;
        }
        if ((i & 16) != 0) {
            async3 = networkingLinkSignupState.lookupAccount;
        }
        if ((i & 32) != 0) {
            viewEffect = networkingLinkSignupState.viewEffect;
        }
        if ((i & 64) != 0) {
            z = networkingLinkSignupState.isInstantDebits;
        }
        ViewEffect viewEffect2 = viewEffect;
        boolean z2 = z;
        Async async4 = async3;
        String str3 = str2;
        return networkingLinkSignupState.copy(async, str, str3, async2, async4, viewEffect2, z2);
    }

    public final Async<Payload> component1() {
        return this.payload;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValidEmail() {
        return this.validEmail;
    }

    /* renamed from: component3, reason: from getter */
    public final String getValidPhone() {
        return this.validPhone;
    }

    public final Async<FinancialConnectionsSessionManifest.Pane> component4() {
        return this.saveAccountToLink;
    }

    public final Async<ConsumerSessionLookup> component5() {
        return this.lookupAccount;
    }

    /* renamed from: component6, reason: from getter */
    public final ViewEffect getViewEffect() {
        return this.viewEffect;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsInstantDebits() {
        return this.isInstantDebits;
    }

    public final NetworkingLinkSignupState copy(Async<Payload> payload, String validEmail, String validPhone, Async<? extends FinancialConnectionsSessionManifest.Pane> saveAccountToLink, Async<ConsumerSessionLookup> lookupAccount, ViewEffect viewEffect, boolean isInstantDebits) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(saveAccountToLink, "saveAccountToLink");
        Intrinsics.checkNotNullParameter(lookupAccount, "lookupAccount");
        return new NetworkingLinkSignupState(payload, validEmail, validPhone, saveAccountToLink, lookupAccount, viewEffect, isInstantDebits);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkingLinkSignupState)) {
            return false;
        }
        NetworkingLinkSignupState networkingLinkSignupState = (NetworkingLinkSignupState) other;
        return Intrinsics.areEqual(this.payload, networkingLinkSignupState.payload) && Intrinsics.areEqual(this.validEmail, networkingLinkSignupState.validEmail) && Intrinsics.areEqual(this.validPhone, networkingLinkSignupState.validPhone) && Intrinsics.areEqual(this.saveAccountToLink, networkingLinkSignupState.saveAccountToLink) && Intrinsics.areEqual(this.lookupAccount, networkingLinkSignupState.lookupAccount) && Intrinsics.areEqual(this.viewEffect, networkingLinkSignupState.viewEffect) && this.isInstantDebits == networkingLinkSignupState.isInstantDebits;
    }

    public int hashCode() {
        int iHashCode = this.payload.hashCode() * 31;
        String str = this.validEmail;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.validPhone;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.saveAccountToLink.hashCode()) * 31) + this.lookupAccount.hashCode()) * 31;
        ViewEffect viewEffect = this.viewEffect;
        return ((iHashCode3 + (viewEffect != null ? viewEffect.hashCode() : 0)) * 31) + Boolean.hashCode(this.isInstantDebits);
    }

    public String toString() {
        return "NetworkingLinkSignupState(payload=" + this.payload + ", validEmail=" + this.validEmail + ", validPhone=" + this.validPhone + ", saveAccountToLink=" + this.saveAccountToLink + ", lookupAccount=" + this.lookupAccount + ", viewEffect=" + this.viewEffect + ", isInstantDebits=" + this.isInstantDebits + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkingLinkSignupState(Async<Payload> payload, String str, String str2, Async<? extends FinancialConnectionsSessionManifest.Pane> saveAccountToLink, Async<ConsumerSessionLookup> lookupAccount, ViewEffect viewEffect, boolean z) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(saveAccountToLink, "saveAccountToLink");
        Intrinsics.checkNotNullParameter(lookupAccount, "lookupAccount");
        this.payload = payload;
        this.validEmail = str;
        this.validPhone = str2;
        this.saveAccountToLink = saveAccountToLink;
        this.lookupAccount = lookupAccount;
        this.viewEffect = viewEffect;
        this.isInstantDebits = z;
    }

    public /* synthetic */ NetworkingLinkSignupState(Async.Uninitialized uninitialized, String str, String str2, Async.Uninitialized uninitialized2, Async.Uninitialized uninitialized3, ViewEffect viewEffect, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Async.Uninitialized.INSTANCE : uninitialized, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? Async.Uninitialized.INSTANCE : uninitialized2, (i & 16) != 0 ? Async.Uninitialized.INSTANCE : uninitialized3, (i & 32) != 0 ? null : viewEffect, (i & 64) != 0 ? false : z);
    }

    public final Async<Payload> getPayload() {
        return this.payload;
    }

    public final String getValidEmail() {
        return this.validEmail;
    }

    public final String getValidPhone() {
        return this.validPhone;
    }

    public final Async<FinancialConnectionsSessionManifest.Pane> getSaveAccountToLink() {
        return this.saveAccountToLink;
    }

    public final Async<ConsumerSessionLookup> getLookupAccount() {
        return this.lookupAccount;
    }

    public final ViewEffect getViewEffect() {
        return this.viewEffect;
    }

    public final boolean isInstantDebits() {
        return this.isInstantDebits;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NetworkingLinkSignupState(FinancialConnectionsSheetNativeState parentState) {
        this(null, null, null, null, null, null, parentState.isLinkWithStripe(), 63, null);
        Intrinsics.checkNotNullParameter(parentState, "parentState");
    }

    public final boolean getShowFullForm() {
        if (this.lookupAccount.invoke() != null) {
            return !r0.getExists();
        }
        return false;
    }

    public final boolean getValid() {
        ConsumerSessionLookup consumerSessionLookupInvoke = this.lookupAccount.invoke();
        return this.validEmail != null && ((consumerSessionLookupInvoke != null && consumerSessionLookupInvoke.getExists()) || this.validPhone != null);
    }

    public final FinancialConnectionsSessionManifest.Pane getPane() {
        return this.isInstantDebits ? FinancialConnectionsSessionManifest.Pane.LINK_LOGIN : FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE;
    }

    /* compiled from: NetworkingLinkSignupViewModel.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J]\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u001d\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u001f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b \u0010\u0016¨\u0006/"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;", "", "merchantName", "", "emailController", "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "appVerificationEnabled", "", "prefilledEmail", "phoneController", "Lcom/stripe/android/uicore/elements/PhoneNumberController;", "isInstantDebits", UriUtil.LOCAL_CONTENT_SCHEME, "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;", "sessionId", "<init>", "(Ljava/lang/String;Lcom/stripe/android/uicore/elements/SimpleTextFieldController;ZLjava/lang/String;Lcom/stripe/android/uicore/elements/PhoneNumberController;ZLcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;Ljava/lang/String;)V", "getMerchantName", "()Ljava/lang/String;", "getEmailController", "()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "getAppVerificationEnabled", "()Z", "getPrefilledEmail", "getPhoneController", "()Lcom/stripe/android/uicore/elements/PhoneNumberController;", "getContent", "()Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;", "getSessionId", "focusEmailField", "getFocusEmailField", "focusPhoneFieldOnShow", "getFocusPhoneFieldOnShow", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Payload {
        public static final int $stable = 8;
        private final boolean appVerificationEnabled;
        private final Content content;
        private final SimpleTextFieldController emailController;
        private final boolean isInstantDebits;
        private final String merchantName;
        private final PhoneNumberController phoneController;
        private final String prefilledEmail;
        private final String sessionId;

        public static /* synthetic */ Payload copy$default(Payload payload, String str, SimpleTextFieldController simpleTextFieldController, boolean z, String str2, PhoneNumberController phoneNumberController, boolean z2, Content content, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = payload.merchantName;
            }
            if ((i & 2) != 0) {
                simpleTextFieldController = payload.emailController;
            }
            if ((i & 4) != 0) {
                z = payload.appVerificationEnabled;
            }
            if ((i & 8) != 0) {
                str2 = payload.prefilledEmail;
            }
            if ((i & 16) != 0) {
                phoneNumberController = payload.phoneController;
            }
            if ((i & 32) != 0) {
                z2 = payload.isInstantDebits;
            }
            if ((i & 64) != 0) {
                content = payload.content;
            }
            if ((i & 128) != 0) {
                str3 = payload.sessionId;
            }
            Content content2 = content;
            String str4 = str3;
            PhoneNumberController phoneNumberController2 = phoneNumberController;
            boolean z3 = z2;
            return payload.copy(str, simpleTextFieldController, z, str2, phoneNumberController2, z3, content2, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMerchantName() {
            return this.merchantName;
        }

        /* renamed from: component2, reason: from getter */
        public final SimpleTextFieldController getEmailController() {
            return this.emailController;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getAppVerificationEnabled() {
            return this.appVerificationEnabled;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPrefilledEmail() {
            return this.prefilledEmail;
        }

        /* renamed from: component5, reason: from getter */
        public final PhoneNumberController getPhoneController() {
            return this.phoneController;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsInstantDebits() {
            return this.isInstantDebits;
        }

        /* renamed from: component7, reason: from getter */
        public final Content getContent() {
            return this.content;
        }

        /* renamed from: component8, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        public final Payload copy(String merchantName, SimpleTextFieldController emailController, boolean appVerificationEnabled, String prefilledEmail, PhoneNumberController phoneController, boolean isInstantDebits, Content content, String sessionId) {
            Intrinsics.checkNotNullParameter(emailController, "emailController");
            Intrinsics.checkNotNullParameter(phoneController, "phoneController");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            return new Payload(merchantName, emailController, appVerificationEnabled, prefilledEmail, phoneController, isInstantDebits, content, sessionId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return Intrinsics.areEqual(this.merchantName, payload.merchantName) && Intrinsics.areEqual(this.emailController, payload.emailController) && this.appVerificationEnabled == payload.appVerificationEnabled && Intrinsics.areEqual(this.prefilledEmail, payload.prefilledEmail) && Intrinsics.areEqual(this.phoneController, payload.phoneController) && this.isInstantDebits == payload.isInstantDebits && Intrinsics.areEqual(this.content, payload.content) && Intrinsics.areEqual(this.sessionId, payload.sessionId);
        }

        public int hashCode() {
            String str = this.merchantName;
            int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.emailController.hashCode()) * 31) + Boolean.hashCode(this.appVerificationEnabled)) * 31;
            String str2 = this.prefilledEmail;
            return ((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.phoneController.hashCode()) * 31) + Boolean.hashCode(this.isInstantDebits)) * 31) + this.content.hashCode()) * 31) + this.sessionId.hashCode();
        }

        public String toString() {
            return "Payload(merchantName=" + this.merchantName + ", emailController=" + this.emailController + ", appVerificationEnabled=" + this.appVerificationEnabled + ", prefilledEmail=" + this.prefilledEmail + ", phoneController=" + this.phoneController + ", isInstantDebits=" + this.isInstantDebits + ", content=" + this.content + ", sessionId=" + this.sessionId + ")";
        }

        public Payload(String str, SimpleTextFieldController emailController, boolean z, String str2, PhoneNumberController phoneController, boolean z2, Content content, String sessionId) {
            Intrinsics.checkNotNullParameter(emailController, "emailController");
            Intrinsics.checkNotNullParameter(phoneController, "phoneController");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            this.merchantName = str;
            this.emailController = emailController;
            this.appVerificationEnabled = z;
            this.prefilledEmail = str2;
            this.phoneController = phoneController;
            this.isInstantDebits = z2;
            this.content = content;
            this.sessionId = sessionId;
        }

        public final String getMerchantName() {
            return this.merchantName;
        }

        public final SimpleTextFieldController getEmailController() {
            return this.emailController;
        }

        public final boolean getAppVerificationEnabled() {
            return this.appVerificationEnabled;
        }

        public final String getPrefilledEmail() {
            return this.prefilledEmail;
        }

        public final PhoneNumberController getPhoneController() {
            return this.phoneController;
        }

        public final boolean isInstantDebits() {
            return this.isInstantDebits;
        }

        public final Content getContent() {
            return this.content;
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public final boolean getFocusEmailField() {
            if (!this.isInstantDebits) {
                return false;
            }
            String initialValue = this.emailController.getInitialValue();
            return initialValue == null || StringsKt.isBlank(initialValue);
        }

        public final boolean getFocusPhoneFieldOnShow() {
            return StringsKt.isBlank(this.phoneController.getInitialPhoneNumber());
        }
    }

    /* compiled from: NetworkingLinkSignupViewModel.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003J[\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;", "", "title", "", "message", "bullets", "", "Lcom/stripe/android/financialconnections/model/Bullet;", "aboveCta", SDKConstants.PARAM_GAME_REQUESTS_CTA, "skipCta", "legalDetailsNotice", "Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getBullets", "()Ljava/util/List;", "getAboveCta", "getCta", "getSkipCta", "getLegalDetailsNotice", "()Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Content {
        public static final int $stable = 8;
        private final String aboveCta;
        private final List<Bullet> bullets;
        private final String cta;
        private final LegalDetailsNotice legalDetailsNotice;
        private final String message;
        private final String skipCta;
        private final String title;

        public static /* synthetic */ Content copy$default(Content content, String str, String str2, List list, String str3, String str4, String str5, LegalDetailsNotice legalDetailsNotice, int i, Object obj) {
            if ((i & 1) != 0) {
                str = content.title;
            }
            if ((i & 2) != 0) {
                str2 = content.message;
            }
            if ((i & 4) != 0) {
                list = content.bullets;
            }
            if ((i & 8) != 0) {
                str3 = content.aboveCta;
            }
            if ((i & 16) != 0) {
                str4 = content.cta;
            }
            if ((i & 32) != 0) {
                str5 = content.skipCta;
            }
            if ((i & 64) != 0) {
                legalDetailsNotice = content.legalDetailsNotice;
            }
            String str6 = str5;
            LegalDetailsNotice legalDetailsNotice2 = legalDetailsNotice;
            String str7 = str4;
            List list2 = list;
            return content.copy(str, str2, list2, str3, str7, str6, legalDetailsNotice2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final List<Bullet> component3() {
            return this.bullets;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAboveCta() {
            return this.aboveCta;
        }

        /* renamed from: component5, reason: from getter */
        public final String getCta() {
            return this.cta;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSkipCta() {
            return this.skipCta;
        }

        /* renamed from: component7, reason: from getter */
        public final LegalDetailsNotice getLegalDetailsNotice() {
            return this.legalDetailsNotice;
        }

        public final Content copy(String title, String message, List<Bullet> bullets, String aboveCta, String cta, String skipCta, LegalDetailsNotice legalDetailsNotice) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(bullets, "bullets");
            Intrinsics.checkNotNullParameter(aboveCta, "aboveCta");
            Intrinsics.checkNotNullParameter(cta, "cta");
            return new Content(title, message, bullets, aboveCta, cta, skipCta, legalDetailsNotice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.message, content.message) && Intrinsics.areEqual(this.bullets, content.bullets) && Intrinsics.areEqual(this.aboveCta, content.aboveCta) && Intrinsics.areEqual(this.cta, content.cta) && Intrinsics.areEqual(this.skipCta, content.skipCta) && Intrinsics.areEqual(this.legalDetailsNotice, content.legalDetailsNotice);
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.message;
            int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.bullets.hashCode()) * 31) + this.aboveCta.hashCode()) * 31) + this.cta.hashCode()) * 31;
            String str2 = this.skipCta;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            LegalDetailsNotice legalDetailsNotice = this.legalDetailsNotice;
            return iHashCode3 + (legalDetailsNotice != null ? legalDetailsNotice.hashCode() : 0);
        }

        public String toString() {
            return "Content(title=" + this.title + ", message=" + this.message + ", bullets=" + this.bullets + ", aboveCta=" + this.aboveCta + ", cta=" + this.cta + ", skipCta=" + this.skipCta + ", legalDetailsNotice=" + this.legalDetailsNotice + ")";
        }

        public Content(String title, String str, List<Bullet> bullets, String aboveCta, String cta, String str2, LegalDetailsNotice legalDetailsNotice) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(bullets, "bullets");
            Intrinsics.checkNotNullParameter(aboveCta, "aboveCta");
            Intrinsics.checkNotNullParameter(cta, "cta");
            this.title = title;
            this.message = str;
            this.bullets = bullets;
            this.aboveCta = aboveCta;
            this.cta = cta;
            this.skipCta = str2;
            this.legalDetailsNotice = legalDetailsNotice;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getMessage() {
            return this.message;
        }

        public final List<Bullet> getBullets() {
            return this.bullets;
        }

        public final String getAboveCta() {
            return this.aboveCta;
        }

        public final String getCta() {
            return this.cta;
        }

        public final String getSkipCta() {
            return this.skipCta;
        }

        public final LegalDetailsNotice getLegalDetailsNotice() {
            return this.legalDetailsNotice;
        }
    }

    /* compiled from: NetworkingLinkSignupViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;", "", "<init>", "()V", "OpenUrl", "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect$OpenUrl;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ViewEffect {
        public static final int $stable = 0;

        public /* synthetic */ ViewEffect(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ViewEffect() {
        }

        /* compiled from: NetworkingLinkSignupViewModel.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect$OpenUrl;", "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$ViewEffect;", "url", "", "id", "", "<init>", "(Ljava/lang/String;J)V", "getUrl", "()Ljava/lang/String;", "getId", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl extends ViewEffect {
            public static final int $stable = 0;
            private final long id;
            private final String url;

            public static /* synthetic */ OpenUrl copy$default(OpenUrl openUrl, String str, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = openUrl.url;
                }
                if ((i & 2) != 0) {
                    j = openUrl.id;
                }
                return openUrl.copy(str, j);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            /* renamed from: component2, reason: from getter */
            public final long getId() {
                return this.id;
            }

            public final OpenUrl copy(String url, long id) {
                Intrinsics.checkNotNullParameter(url, "url");
                return new OpenUrl(url, id);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OpenUrl)) {
                    return false;
                }
                OpenUrl openUrl = (OpenUrl) other;
                return Intrinsics.areEqual(this.url, openUrl.url) && this.id == openUrl.id;
            }

            public int hashCode() {
                return (this.url.hashCode() * 31) + Long.hashCode(this.id);
            }

            public String toString() {
                return "OpenUrl(url=" + this.url + ", id=" + this.id + ")";
            }

            public final String getUrl() {
                return this.url;
            }

            public final long getId() {
                return this.id;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenUrl(String url, long j) {
                super(null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
                this.id = j;
            }
        }
    }
}
