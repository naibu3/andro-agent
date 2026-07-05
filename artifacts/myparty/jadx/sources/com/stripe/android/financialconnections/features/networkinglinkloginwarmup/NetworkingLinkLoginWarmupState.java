package com.stripe.android.financialconnections.features.networkinglinkloginwarmup;

import android.os.Bundle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkingLinkLoginWarmupViewModel.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001:\u00011Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011B\u001b\b\u0016\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0010\u0010\u0016J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0\bHÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003Jg\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010-\u001a\u00020\u000f2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\"HÖ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010 R\u0011\u0010!\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u00062"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupState;", "", Destination.KEY_REFERRER, "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "nextPaneOnDisableNetworking", "", "consumerEmail", "payload", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupState$Payload;", "disableNetworkingAsync", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "continueAsync", "", "isInstantDebits", "", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Z)V", CardScanActivity.ARGS, "Landroid/os/Bundle;", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;", "(Landroid/os/Bundle;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;)V", "getReferrer", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getNextPaneOnDisableNetworking", "()Ljava/lang/String;", "getConsumerEmail", "getPayload", "()Lcom/stripe/android/financialconnections/presentation/Async;", "getDisableNetworkingAsync", "getContinueAsync", "()Z", "secondaryButtonLabel", "", "getSecondaryButtonLabel", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "Payload", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NetworkingLinkLoginWarmupState {
    public static final int $stable = 8;
    private final String consumerEmail;
    private final Async<Unit> continueAsync;
    private final Async<FinancialConnectionsSessionManifest> disableNetworkingAsync;
    private final boolean isInstantDebits;
    private final String nextPaneOnDisableNetworking;
    private final Async<Payload> payload;
    private final FinancialConnectionsSessionManifest.Pane referrer;

    public NetworkingLinkLoginWarmupState() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    public static /* synthetic */ NetworkingLinkLoginWarmupState copy$default(NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState, FinancialConnectionsSessionManifest.Pane pane, String str, String str2, Async async, Async async2, Async async3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            pane = networkingLinkLoginWarmupState.referrer;
        }
        if ((i & 2) != 0) {
            str = networkingLinkLoginWarmupState.nextPaneOnDisableNetworking;
        }
        if ((i & 4) != 0) {
            str2 = networkingLinkLoginWarmupState.consumerEmail;
        }
        if ((i & 8) != 0) {
            async = networkingLinkLoginWarmupState.payload;
        }
        if ((i & 16) != 0) {
            async2 = networkingLinkLoginWarmupState.disableNetworkingAsync;
        }
        if ((i & 32) != 0) {
            async3 = networkingLinkLoginWarmupState.continueAsync;
        }
        if ((i & 64) != 0) {
            z = networkingLinkLoginWarmupState.isInstantDebits;
        }
        Async async4 = async3;
        boolean z2 = z;
        Async async5 = async2;
        String str3 = str2;
        return networkingLinkLoginWarmupState.copy(pane, str, str3, async, async5, async4, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getReferrer() {
        return this.referrer;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNextPaneOnDisableNetworking() {
        return this.nextPaneOnDisableNetworking;
    }

    /* renamed from: component3, reason: from getter */
    public final String getConsumerEmail() {
        return this.consumerEmail;
    }

    public final Async<Payload> component4() {
        return this.payload;
    }

    public final Async<FinancialConnectionsSessionManifest> component5() {
        return this.disableNetworkingAsync;
    }

    public final Async<Unit> component6() {
        return this.continueAsync;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsInstantDebits() {
        return this.isInstantDebits;
    }

    public final NetworkingLinkLoginWarmupState copy(FinancialConnectionsSessionManifest.Pane referrer, String nextPaneOnDisableNetworking, String consumerEmail, Async<Payload> payload, Async<FinancialConnectionsSessionManifest> disableNetworkingAsync, Async<Unit> continueAsync, boolean isInstantDebits) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(disableNetworkingAsync, "disableNetworkingAsync");
        Intrinsics.checkNotNullParameter(continueAsync, "continueAsync");
        return new NetworkingLinkLoginWarmupState(referrer, nextPaneOnDisableNetworking, consumerEmail, payload, disableNetworkingAsync, continueAsync, isInstantDebits);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkingLinkLoginWarmupState)) {
            return false;
        }
        NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState = (NetworkingLinkLoginWarmupState) other;
        return this.referrer == networkingLinkLoginWarmupState.referrer && Intrinsics.areEqual(this.nextPaneOnDisableNetworking, networkingLinkLoginWarmupState.nextPaneOnDisableNetworking) && Intrinsics.areEqual(this.consumerEmail, networkingLinkLoginWarmupState.consumerEmail) && Intrinsics.areEqual(this.payload, networkingLinkLoginWarmupState.payload) && Intrinsics.areEqual(this.disableNetworkingAsync, networkingLinkLoginWarmupState.disableNetworkingAsync) && Intrinsics.areEqual(this.continueAsync, networkingLinkLoginWarmupState.continueAsync) && this.isInstantDebits == networkingLinkLoginWarmupState.isInstantDebits;
    }

    public int hashCode() {
        FinancialConnectionsSessionManifest.Pane pane = this.referrer;
        int iHashCode = (pane == null ? 0 : pane.hashCode()) * 31;
        String str = this.nextPaneOnDisableNetworking;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.consumerEmail;
        return ((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.payload.hashCode()) * 31) + this.disableNetworkingAsync.hashCode()) * 31) + this.continueAsync.hashCode()) * 31) + Boolean.hashCode(this.isInstantDebits);
    }

    public String toString() {
        return "NetworkingLinkLoginWarmupState(referrer=" + this.referrer + ", nextPaneOnDisableNetworking=" + this.nextPaneOnDisableNetworking + ", consumerEmail=" + this.consumerEmail + ", payload=" + this.payload + ", disableNetworkingAsync=" + this.disableNetworkingAsync + ", continueAsync=" + this.continueAsync + ", isInstantDebits=" + this.isInstantDebits + ")";
    }

    public NetworkingLinkLoginWarmupState(FinancialConnectionsSessionManifest.Pane pane, String str, String str2, Async<Payload> payload, Async<FinancialConnectionsSessionManifest> disableNetworkingAsync, Async<Unit> continueAsync, boolean z) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(disableNetworkingAsync, "disableNetworkingAsync");
        Intrinsics.checkNotNullParameter(continueAsync, "continueAsync");
        this.referrer = pane;
        this.nextPaneOnDisableNetworking = str;
        this.consumerEmail = str2;
        this.payload = payload;
        this.disableNetworkingAsync = disableNetworkingAsync;
        this.continueAsync = continueAsync;
        this.isInstantDebits = z;
    }

    public final FinancialConnectionsSessionManifest.Pane getReferrer() {
        return this.referrer;
    }

    public final String getNextPaneOnDisableNetworking() {
        return this.nextPaneOnDisableNetworking;
    }

    public final String getConsumerEmail() {
        return this.consumerEmail;
    }

    public /* synthetic */ NetworkingLinkLoginWarmupState(FinancialConnectionsSessionManifest.Pane pane, String str, String str2, Async.Uninitialized uninitialized, Async.Uninitialized uninitialized2, Async.Uninitialized uninitialized3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : pane, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? Async.Uninitialized.INSTANCE : uninitialized, (i & 16) != 0 ? Async.Uninitialized.INSTANCE : uninitialized2, (i & 32) != 0 ? Async.Uninitialized.INSTANCE : uninitialized3, (i & 64) != 0 ? false : z);
    }

    public final Async<Payload> getPayload() {
        return this.payload;
    }

    public final Async<FinancialConnectionsSessionManifest> getDisableNetworkingAsync() {
        return this.disableNetworkingAsync;
    }

    public final Async<Unit> getContinueAsync() {
        return this.continueAsync;
    }

    public final boolean isInstantDebits() {
        return this.isInstantDebits;
    }

    public final int getSecondaryButtonLabel() {
        if (this.isInstantDebits) {
            return R.string.stripe_networking_link_login_warmup_cta_cancel;
        }
        return R.string.stripe_networking_link_login_warmup_cta_skip;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NetworkingLinkLoginWarmupState(Bundle bundle, FinancialConnectionsSheetNativeState state) {
        this(Destination.INSTANCE.referrer$financial_connections_release(bundle), bundle != null ? bundle.getString(Destination.KEY_NEXT_PANE_ON_DISABLE_NETWORKING) : null, null, Async.Uninitialized.INSTANCE, Async.Uninitialized.INSTANCE, null, state.isLinkWithStripe(), 36, null);
        Intrinsics.checkNotNullParameter(state, "state");
    }

    /* compiled from: NetworkingLinkLoginWarmupViewModel.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupState$Payload;", "", "merchantName", "", "email", "redactedEmail", "verifiedFlow", "", "sessionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getMerchantName", "()Ljava/lang/String;", "getEmail", "getRedactedEmail", "getVerifiedFlow", "()Z", "getSessionId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Payload {
        public static final int $stable = 0;
        private final String email;
        private final String merchantName;
        private final String redactedEmail;
        private final String sessionId;
        private final boolean verifiedFlow;

        public static /* synthetic */ Payload copy$default(Payload payload, String str, String str2, String str3, boolean z, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = payload.merchantName;
            }
            if ((i & 2) != 0) {
                str2 = payload.email;
            }
            if ((i & 4) != 0) {
                str3 = payload.redactedEmail;
            }
            if ((i & 8) != 0) {
                z = payload.verifiedFlow;
            }
            if ((i & 16) != 0) {
                str4 = payload.sessionId;
            }
            String str5 = str4;
            String str6 = str3;
            return payload.copy(str, str2, str6, z, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMerchantName() {
            return this.merchantName;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRedactedEmail() {
            return this.redactedEmail;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getVerifiedFlow() {
            return this.verifiedFlow;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        public final Payload copy(String merchantName, String email, String redactedEmail, boolean verifiedFlow, String sessionId) {
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(redactedEmail, "redactedEmail");
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            return new Payload(merchantName, email, redactedEmail, verifiedFlow, sessionId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return Intrinsics.areEqual(this.merchantName, payload.merchantName) && Intrinsics.areEqual(this.email, payload.email) && Intrinsics.areEqual(this.redactedEmail, payload.redactedEmail) && this.verifiedFlow == payload.verifiedFlow && Intrinsics.areEqual(this.sessionId, payload.sessionId);
        }

        public int hashCode() {
            String str = this.merchantName;
            return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.email.hashCode()) * 31) + this.redactedEmail.hashCode()) * 31) + Boolean.hashCode(this.verifiedFlow)) * 31) + this.sessionId.hashCode();
        }

        public String toString() {
            return "Payload(merchantName=" + this.merchantName + ", email=" + this.email + ", redactedEmail=" + this.redactedEmail + ", verifiedFlow=" + this.verifiedFlow + ", sessionId=" + this.sessionId + ")";
        }

        public Payload(String str, String email, String redactedEmail, boolean z, String sessionId) {
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(redactedEmail, "redactedEmail");
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            this.merchantName = str;
            this.email = email;
            this.redactedEmail = redactedEmail;
            this.verifiedFlow = z;
            this.sessionId = sessionId;
        }

        public final String getMerchantName() {
            return this.merchantName;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getRedactedEmail() {
            return this.redactedEmail;
        }

        public final boolean getVerifiedFlow() {
            return this.verifiedFlow;
        }

        public final String getSessionId() {
            return this.sessionId;
        }
    }
}
