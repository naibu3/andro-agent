package com.stripe.android.financialconnections.features.streamlinedconsent;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.features.generic.GenericScreenState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.IDConsentContentPane;
import com.stripe.android.financialconnections.presentation.Async;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IDConsentContentState.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB3\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState;", "", "payload", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$Payload;", "acceptConsent", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "viewEffect", "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;", "<init>", "(Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;)V", "getPayload", "()Lcom/stripe/android/financialconnections/presentation/Async;", "getAcceptConsent", "getViewEffect", "()Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Payload", "ViewEffect", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class IDConsentContentState {
    public static final int $stable = 8;
    private final Async<FinancialConnectionsSessionManifest> acceptConsent;
    private final Async<Payload> payload;
    private final ViewEffect viewEffect;

    public IDConsentContentState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IDConsentContentState copy$default(IDConsentContentState iDConsentContentState, Async async, Async async2, ViewEffect viewEffect, int i, Object obj) {
        if ((i & 1) != 0) {
            async = iDConsentContentState.payload;
        }
        if ((i & 2) != 0) {
            async2 = iDConsentContentState.acceptConsent;
        }
        if ((i & 4) != 0) {
            viewEffect = iDConsentContentState.viewEffect;
        }
        return iDConsentContentState.copy(async, async2, viewEffect);
    }

    public final Async<Payload> component1() {
        return this.payload;
    }

    public final Async<FinancialConnectionsSessionManifest> component2() {
        return this.acceptConsent;
    }

    /* renamed from: component3, reason: from getter */
    public final ViewEffect getViewEffect() {
        return this.viewEffect;
    }

    public final IDConsentContentState copy(Async<Payload> payload, Async<FinancialConnectionsSessionManifest> acceptConsent, ViewEffect viewEffect) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(acceptConsent, "acceptConsent");
        return new IDConsentContentState(payload, acceptConsent, viewEffect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IDConsentContentState)) {
            return false;
        }
        IDConsentContentState iDConsentContentState = (IDConsentContentState) other;
        return Intrinsics.areEqual(this.payload, iDConsentContentState.payload) && Intrinsics.areEqual(this.acceptConsent, iDConsentContentState.acceptConsent) && Intrinsics.areEqual(this.viewEffect, iDConsentContentState.viewEffect);
    }

    public int hashCode() {
        int iHashCode = ((this.payload.hashCode() * 31) + this.acceptConsent.hashCode()) * 31;
        ViewEffect viewEffect = this.viewEffect;
        return iHashCode + (viewEffect == null ? 0 : viewEffect.hashCode());
    }

    public String toString() {
        return "IDConsentContentState(payload=" + this.payload + ", acceptConsent=" + this.acceptConsent + ", viewEffect=" + this.viewEffect + ")";
    }

    public IDConsentContentState(Async<Payload> payload, Async<FinancialConnectionsSessionManifest> acceptConsent, ViewEffect viewEffect) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(acceptConsent, "acceptConsent");
        this.payload = payload;
        this.acceptConsent = acceptConsent;
        this.viewEffect = viewEffect;
    }

    public /* synthetic */ IDConsentContentState(Async.Uninitialized uninitialized, Async.Uninitialized uninitialized2, ViewEffect viewEffect, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Async.Uninitialized.INSTANCE : uninitialized, (i & 2) != 0 ? Async.Uninitialized.INSTANCE : uninitialized2, (i & 4) != 0 ? null : viewEffect);
    }

    public final Async<Payload> getPayload() {
        return this.payload;
    }

    public final Async<FinancialConnectionsSessionManifest> getAcceptConsent() {
        return this.acceptConsent;
    }

    public final ViewEffect getViewEffect() {
        return this.viewEffect;
    }

    /* compiled from: IDConsentContentState.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$Payload;", "", "idConsentContentPane", "Lcom/stripe/android/financialconnections/model/IDConsentContentPane;", "<init>", "(Lcom/stripe/android/financialconnections/model/IDConsentContentPane;)V", "getIdConsentContentPane", "()Lcom/stripe/android/financialconnections/model/IDConsentContentPane;", "genericScreenState", "Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;", "getGenericScreenState", "()Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Payload {
        public static final int $stable = 8;
        private final IDConsentContentPane idConsentContentPane;

        public static /* synthetic */ Payload copy$default(Payload payload, IDConsentContentPane iDConsentContentPane, int i, Object obj) {
            if ((i & 1) != 0) {
                iDConsentContentPane = payload.idConsentContentPane;
            }
            return payload.copy(iDConsentContentPane);
        }

        /* renamed from: component1, reason: from getter */
        public final IDConsentContentPane getIdConsentContentPane() {
            return this.idConsentContentPane;
        }

        public final Payload copy(IDConsentContentPane idConsentContentPane) {
            Intrinsics.checkNotNullParameter(idConsentContentPane, "idConsentContentPane");
            return new Payload(idConsentContentPane);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Payload) && Intrinsics.areEqual(this.idConsentContentPane, ((Payload) other).idConsentContentPane);
        }

        public int hashCode() {
            return this.idConsentContentPane.hashCode();
        }

        public String toString() {
            return "Payload(idConsentContentPane=" + this.idConsentContentPane + ")";
        }

        public Payload(IDConsentContentPane idConsentContentPane) {
            Intrinsics.checkNotNullParameter(idConsentContentPane, "idConsentContentPane");
            this.idConsentContentPane = idConsentContentPane;
        }

        public final IDConsentContentPane getIdConsentContentPane() {
            return this.idConsentContentPane;
        }

        public final GenericScreenState getGenericScreenState() {
            return new GenericScreenState(this.idConsentContentPane.getScreen(), false);
        }
    }

    /* compiled from: IDConsentContentState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;", "", "OpenUrl", "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect$OpenUrl;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewEffect {

        /* compiled from: IDConsentContentState.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect$OpenUrl;", "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentState$ViewEffect;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl implements ViewEffect {
            public static final int $stable = 0;
            private final String url;

            public static /* synthetic */ OpenUrl copy$default(OpenUrl openUrl, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = openUrl.url;
                }
                return openUrl.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public final OpenUrl copy(String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                return new OpenUrl(url);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpenUrl) && Intrinsics.areEqual(this.url, ((OpenUrl) other).url);
            }

            public int hashCode() {
                return this.url.hashCode();
            }

            public String toString() {
                return "OpenUrl(url=" + this.url + ")";
            }

            public OpenUrl(String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                this.url = url;
            }

            public final String getUrl() {
                return this.url;
            }
        }
    }
}
