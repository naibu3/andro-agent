package com.stripe.android.financialconnections.features.partnerauth;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SharedPartnerAuthState.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0004*+,-BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\r\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003JI\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001a¨\u0006."}, d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;", "", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "payload", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;", "viewEffect", "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;", "authenticationStatus", "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus;", "inModal", "", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;Lcom/stripe/android/financialconnections/presentation/Async;Z)V", CardScanActivity.ARGS, "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Args;", "(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Args;)V", "getPane", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getPayload", "()Lcom/stripe/android/financialconnections/presentation/Async;", "getViewEffect", "()Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;", "getAuthenticationStatus", "getInModal", "()Z", "isNetworkingRelinkSession", "canNavigateBack", "getCanNavigateBack", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Payload", "AuthenticationStatus", "ViewEffect", "ClickableText", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SharedPartnerAuthState {
    public static final int $stable = 8;
    private final Async<AuthenticationStatus> authenticationStatus;
    private final boolean inModal;
    private final FinancialConnectionsSessionManifest.Pane pane;
    private final Async<Payload> payload;
    private final ViewEffect viewEffect;

    public static /* synthetic */ SharedPartnerAuthState copy$default(SharedPartnerAuthState sharedPartnerAuthState, FinancialConnectionsSessionManifest.Pane pane, Async async, ViewEffect viewEffect, Async async2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            pane = sharedPartnerAuthState.pane;
        }
        if ((i & 2) != 0) {
            async = sharedPartnerAuthState.payload;
        }
        if ((i & 4) != 0) {
            viewEffect = sharedPartnerAuthState.viewEffect;
        }
        if ((i & 8) != 0) {
            async2 = sharedPartnerAuthState.authenticationStatus;
        }
        if ((i & 16) != 0) {
            z = sharedPartnerAuthState.inModal;
        }
        boolean z2 = z;
        ViewEffect viewEffect2 = viewEffect;
        return sharedPartnerAuthState.copy(pane, async, viewEffect2, async2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getPane() {
        return this.pane;
    }

    public final Async<Payload> component2() {
        return this.payload;
    }

    /* renamed from: component3, reason: from getter */
    public final ViewEffect getViewEffect() {
        return this.viewEffect;
    }

    public final Async<AuthenticationStatus> component4() {
        return this.authenticationStatus;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getInModal() {
        return this.inModal;
    }

    public final SharedPartnerAuthState copy(FinancialConnectionsSessionManifest.Pane pane, Async<Payload> payload, ViewEffect viewEffect, Async<AuthenticationStatus> authenticationStatus, boolean inModal) {
        Intrinsics.checkNotNullParameter(pane, "pane");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(authenticationStatus, "authenticationStatus");
        return new SharedPartnerAuthState(pane, payload, viewEffect, authenticationStatus, inModal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedPartnerAuthState)) {
            return false;
        }
        SharedPartnerAuthState sharedPartnerAuthState = (SharedPartnerAuthState) other;
        return this.pane == sharedPartnerAuthState.pane && Intrinsics.areEqual(this.payload, sharedPartnerAuthState.payload) && Intrinsics.areEqual(this.viewEffect, sharedPartnerAuthState.viewEffect) && Intrinsics.areEqual(this.authenticationStatus, sharedPartnerAuthState.authenticationStatus) && this.inModal == sharedPartnerAuthState.inModal;
    }

    public int hashCode() {
        int iHashCode = ((this.pane.hashCode() * 31) + this.payload.hashCode()) * 31;
        ViewEffect viewEffect = this.viewEffect;
        return ((((iHashCode + (viewEffect == null ? 0 : viewEffect.hashCode())) * 31) + this.authenticationStatus.hashCode()) * 31) + Boolean.hashCode(this.inModal);
    }

    public String toString() {
        return "SharedPartnerAuthState(pane=" + this.pane + ", payload=" + this.payload + ", viewEffect=" + this.viewEffect + ", authenticationStatus=" + this.authenticationStatus + ", inModal=" + this.inModal + ")";
    }

    public SharedPartnerAuthState(FinancialConnectionsSessionManifest.Pane pane, Async<Payload> payload, ViewEffect viewEffect, Async<AuthenticationStatus> authenticationStatus, boolean z) {
        Intrinsics.checkNotNullParameter(pane, "pane");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(authenticationStatus, "authenticationStatus");
        this.pane = pane;
        this.payload = payload;
        this.viewEffect = viewEffect;
        this.authenticationStatus = authenticationStatus;
        this.inModal = z;
    }

    public final FinancialConnectionsSessionManifest.Pane getPane() {
        return this.pane;
    }

    public /* synthetic */ SharedPartnerAuthState(FinancialConnectionsSessionManifest.Pane pane, Async.Uninitialized uninitialized, ViewEffect viewEffect, Async.Uninitialized uninitialized2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pane, (i & 2) != 0 ? Async.Uninitialized.INSTANCE : uninitialized, (i & 4) != 0 ? null : viewEffect, (i & 8) != 0 ? Async.Uninitialized.INSTANCE : uninitialized2, (i & 16) != 0 ? false : z);
    }

    public final Async<Payload> getPayload() {
        return this.payload;
    }

    public final ViewEffect getViewEffect() {
        return this.viewEffect;
    }

    public final Async<AuthenticationStatus> getAuthenticationStatus() {
        return this.authenticationStatus;
    }

    public final boolean getInModal() {
        return this.inModal;
    }

    public final boolean isNetworkingRelinkSession() {
        return this.pane == FinancialConnectionsSessionManifest.Pane.BANK_AUTH_REPAIR;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPartnerAuthState(PartnerAuthViewModel.Args args) {
        this(args.getPane(), null, null, null, args.getInModal(), 14, null);
        Intrinsics.checkNotNullParameter(args, "args");
    }

    /* compiled from: SharedPartnerAuthState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$Payload;", "", "isStripeDirect", "", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "authSession", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "<init>", "(ZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V", "()Z", "getInstitution", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "getAuthSession", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Payload {
        public static final int $stable = 8;
        private final FinancialConnectionsAuthorizationSession authSession;
        private final FinancialConnectionsInstitution institution;
        private final boolean isStripeDirect;

        public static /* synthetic */ Payload copy$default(Payload payload, boolean z, FinancialConnectionsInstitution financialConnectionsInstitution, FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, int i, Object obj) {
            if ((i & 1) != 0) {
                z = payload.isStripeDirect;
            }
            if ((i & 2) != 0) {
                financialConnectionsInstitution = payload.institution;
            }
            if ((i & 4) != 0) {
                financialConnectionsAuthorizationSession = payload.authSession;
            }
            return payload.copy(z, financialConnectionsInstitution, financialConnectionsAuthorizationSession);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsStripeDirect() {
            return this.isStripeDirect;
        }

        /* renamed from: component2, reason: from getter */
        public final FinancialConnectionsInstitution getInstitution() {
            return this.institution;
        }

        /* renamed from: component3, reason: from getter */
        public final FinancialConnectionsAuthorizationSession getAuthSession() {
            return this.authSession;
        }

        public final Payload copy(boolean isStripeDirect, FinancialConnectionsInstitution institution, FinancialConnectionsAuthorizationSession authSession) {
            Intrinsics.checkNotNullParameter(institution, "institution");
            Intrinsics.checkNotNullParameter(authSession, "authSession");
            return new Payload(isStripeDirect, institution, authSession);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return this.isStripeDirect == payload.isStripeDirect && Intrinsics.areEqual(this.institution, payload.institution) && Intrinsics.areEqual(this.authSession, payload.authSession);
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isStripeDirect) * 31) + this.institution.hashCode()) * 31) + this.authSession.hashCode();
        }

        public String toString() {
            return "Payload(isStripeDirect=" + this.isStripeDirect + ", institution=" + this.institution + ", authSession=" + this.authSession + ")";
        }

        public Payload(boolean z, FinancialConnectionsInstitution institution, FinancialConnectionsAuthorizationSession authSession) {
            Intrinsics.checkNotNullParameter(institution, "institution");
            Intrinsics.checkNotNullParameter(authSession, "authSession");
            this.isStripeDirect = z;
            this.institution = institution;
            this.authSession = authSession;
        }

        public final boolean isStripeDirect() {
            return this.isStripeDirect;
        }

        public final FinancialConnectionsInstitution getInstitution() {
            return this.institution;
        }

        public final FinancialConnectionsAuthorizationSession getAuthSession() {
            return this.authSession;
        }
    }

    /* compiled from: SharedPartnerAuthState.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus;", "", "action", "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus$Action;", "<init>", "(Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus$Action;)V", "getAction", "()Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus$Action;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Action", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AuthenticationStatus {
        public static final int $stable = 0;
        private final Action action;

        public static /* synthetic */ AuthenticationStatus copy$default(AuthenticationStatus authenticationStatus, Action action, int i, Object obj) {
            if ((i & 1) != 0) {
                action = authenticationStatus.action;
            }
            return authenticationStatus.copy(action);
        }

        /* renamed from: component1, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        public final AuthenticationStatus copy(Action action) {
            Intrinsics.checkNotNullParameter(action, "action");
            return new AuthenticationStatus(action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AuthenticationStatus) && this.action == ((AuthenticationStatus) other).action;
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return "AuthenticationStatus(action=" + this.action + ")";
        }

        public AuthenticationStatus(Action action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
        }

        public final Action getAction() {
            return this.action;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SharedPartnerAuthState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$AuthenticationStatus$Action;", "", "<init>", "(Ljava/lang/String;I)V", "CANCELLING", "AUTHENTICATING", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Action {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Action[] $VALUES;
            public static final Action CANCELLING = new Action("CANCELLING", 0);
            public static final Action AUTHENTICATING = new Action("AUTHENTICATING", 1);

            private static final /* synthetic */ Action[] $values() {
                return new Action[]{CANCELLING, AUTHENTICATING};
            }

            public static EnumEntries<Action> getEntries() {
                return $ENTRIES;
            }

            private Action(String str, int i) {
            }

            static {
                Action[] actionArr$values = $values();
                $VALUES = actionArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(actionArr$values);
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) $VALUES.clone();
            }
        }
    }

    public final boolean getCanNavigateBack() {
        Async<AuthenticationStatus> async = this.authenticationStatus;
        return ((async instanceof Async.Loading) || (async instanceof Async.Success) || (this.payload instanceof Async.Fail) || isNetworkingRelinkSession()) ? false : true;
    }

    /* compiled from: SharedPartnerAuthState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;", "", "OpenPartnerAuth", "OpenUrl", "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect$OpenPartnerAuth;", "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect$OpenUrl;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewEffect {

        /* compiled from: SharedPartnerAuthState.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect$OpenPartnerAuth;", "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenPartnerAuth implements ViewEffect {
            public static final int $stable = 0;
            private final String url;

            public static /* synthetic */ OpenPartnerAuth copy$default(OpenPartnerAuth openPartnerAuth, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = openPartnerAuth.url;
                }
                return openPartnerAuth.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public final OpenPartnerAuth copy(String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return new OpenPartnerAuth(url);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpenPartnerAuth) && Intrinsics.areEqual(this.url, ((OpenPartnerAuth) other).url);
            }

            public int hashCode() {
                return this.url.hashCode();
            }

            public String toString() {
                return "OpenPartnerAuth(url=" + this.url + ")";
            }

            public OpenPartnerAuth(String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
            }

            public final String getUrl() {
                return this.url;
            }
        }

        /* compiled from: SharedPartnerAuthState.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect$OpenUrl;", "Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ViewEffect;", "url", "", "id", "", "<init>", "(Ljava/lang/String;J)V", "getUrl", "()Ljava/lang/String;", "getId", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl implements ViewEffect {
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

            public OpenUrl(String url, long j) {
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
                this.id = j;
            }

            public final String getUrl() {
                return this.url;
            }

            public final long getId() {
                return this.id;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SharedPartnerAuthState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState$ClickableText;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DATA", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickableText {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ClickableText[] $VALUES;
        public static final ClickableText DATA = new ClickableText("DATA", 0, "stripe://data-access-notice");
        private final String value;

        private static final /* synthetic */ ClickableText[] $values() {
            return new ClickableText[]{DATA};
        }

        public static EnumEntries<ClickableText> getEntries() {
            return $ENTRIES;
        }

        private ClickableText(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            return this.value;
        }

        static {
            ClickableText[] clickableTextArr$values = $values();
            $VALUES = clickableTextArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(clickableTextArr$values);
        }

        public static ClickableText valueOf(String str) {
            return (ClickableText) Enum.valueOf(ClickableText.class, str);
        }

        public static ClickableText[] values() {
            return (ClickableText[]) $VALUES.clone();
        }
    }
}
