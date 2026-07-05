package com.stripe.android.financialconnections.features.consent;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.model.ConsentPane;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.Async;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConsentState.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002 !BC\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentState;", "", "consent", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;", "merchantLogos", "", "", "acceptConsent", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "viewEffect", "Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;", "<init>", "(Lcom/stripe/android/financialconnections/presentation/Async;Ljava/util/List;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;)V", "getConsent", "()Lcom/stripe/android/financialconnections/presentation/Async;", "getMerchantLogos", "()Ljava/util/List;", "getAcceptConsent", "getViewEffect", "()Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Payload", "ViewEffect", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ConsentState {
    public static final int $stable = 8;
    private final Async<FinancialConnectionsSessionManifest> acceptConsent;
    private final Async<Payload> consent;
    private final List<String> merchantLogos;
    private final ViewEffect viewEffect;

    public ConsentState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConsentState copy$default(ConsentState consentState, Async async, List list, Async async2, ViewEffect viewEffect, int i, Object obj) {
        if ((i & 1) != 0) {
            async = consentState.consent;
        }
        if ((i & 2) != 0) {
            list = consentState.merchantLogos;
        }
        if ((i & 4) != 0) {
            async2 = consentState.acceptConsent;
        }
        if ((i & 8) != 0) {
            viewEffect = consentState.viewEffect;
        }
        return consentState.copy(async, list, async2, viewEffect);
    }

    public final Async<Payload> component1() {
        return this.consent;
    }

    public final List<String> component2() {
        return this.merchantLogos;
    }

    public final Async<FinancialConnectionsSessionManifest> component3() {
        return this.acceptConsent;
    }

    /* renamed from: component4, reason: from getter */
    public final ViewEffect getViewEffect() {
        return this.viewEffect;
    }

    public final ConsentState copy(Async<Payload> consent, List<String> merchantLogos, Async<FinancialConnectionsSessionManifest> acceptConsent, ViewEffect viewEffect) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        Intrinsics.checkNotNullParameter(merchantLogos, "merchantLogos");
        Intrinsics.checkNotNullParameter(acceptConsent, "acceptConsent");
        return new ConsentState(consent, merchantLogos, acceptConsent, viewEffect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsentState)) {
            return false;
        }
        ConsentState consentState = (ConsentState) other;
        return Intrinsics.areEqual(this.consent, consentState.consent) && Intrinsics.areEqual(this.merchantLogos, consentState.merchantLogos) && Intrinsics.areEqual(this.acceptConsent, consentState.acceptConsent) && Intrinsics.areEqual(this.viewEffect, consentState.viewEffect);
    }

    public int hashCode() {
        int iHashCode = ((((this.consent.hashCode() * 31) + this.merchantLogos.hashCode()) * 31) + this.acceptConsent.hashCode()) * 31;
        ViewEffect viewEffect = this.viewEffect;
        return iHashCode + (viewEffect == null ? 0 : viewEffect.hashCode());
    }

    public String toString() {
        return "ConsentState(consent=" + this.consent + ", merchantLogos=" + this.merchantLogos + ", acceptConsent=" + this.acceptConsent + ", viewEffect=" + this.viewEffect + ")";
    }

    public ConsentState(Async<Payload> consent, List<String> merchantLogos, Async<FinancialConnectionsSessionManifest> acceptConsent, ViewEffect viewEffect) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        Intrinsics.checkNotNullParameter(merchantLogos, "merchantLogos");
        Intrinsics.checkNotNullParameter(acceptConsent, "acceptConsent");
        this.consent = consent;
        this.merchantLogos = merchantLogos;
        this.acceptConsent = acceptConsent;
        this.viewEffect = viewEffect;
    }

    public /* synthetic */ ConsentState(Async.Uninitialized uninitialized, List list, Async.Uninitialized uninitialized2, ViewEffect viewEffect, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Async.Uninitialized.INSTANCE : uninitialized, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? Async.Uninitialized.INSTANCE : uninitialized2, (i & 8) != 0 ? null : viewEffect);
    }

    public final Async<Payload> getConsent() {
        return this.consent;
    }

    public final List<String> getMerchantLogos() {
        return this.merchantLogos;
    }

    public final Async<FinancialConnectionsSessionManifest> getAcceptConsent() {
        return this.acceptConsent;
    }

    public final ViewEffect getViewEffect() {
        return this.viewEffect;
    }

    /* compiled from: ConsentState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;", "", "consent", "Lcom/stripe/android/financialconnections/model/ConsentPane;", "merchantLogos", "", "", "shouldShowMerchantLogos", "", "showAnimatedDots", "<init>", "(Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/util/List;ZZ)V", "getConsent", "()Lcom/stripe/android/financialconnections/model/ConsentPane;", "getMerchantLogos", "()Ljava/util/List;", "getShouldShowMerchantLogos", "()Z", "getShowAnimatedDots", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Payload {
        public static final int $stable = 8;
        private final ConsentPane consent;
        private final List<String> merchantLogos;
        private final boolean shouldShowMerchantLogos;
        private final boolean showAnimatedDots;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Payload copy$default(Payload payload, ConsentPane consentPane, List list, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                consentPane = payload.consent;
            }
            if ((i & 2) != 0) {
                list = payload.merchantLogos;
            }
            if ((i & 4) != 0) {
                z = payload.shouldShowMerchantLogos;
            }
            if ((i & 8) != 0) {
                z2 = payload.showAnimatedDots;
            }
            return payload.copy(consentPane, list, z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final ConsentPane getConsent() {
            return this.consent;
        }

        public final List<String> component2() {
            return this.merchantLogos;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldShowMerchantLogos() {
            return this.shouldShowMerchantLogos;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowAnimatedDots() {
            return this.showAnimatedDots;
        }

        public final Payload copy(ConsentPane consent, List<String> merchantLogos, boolean shouldShowMerchantLogos, boolean showAnimatedDots) {
            Intrinsics.checkNotNullParameter(consent, "consent");
            Intrinsics.checkNotNullParameter(merchantLogos, "merchantLogos");
            return new Payload(consent, merchantLogos, shouldShowMerchantLogos, showAnimatedDots);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return Intrinsics.areEqual(this.consent, payload.consent) && Intrinsics.areEqual(this.merchantLogos, payload.merchantLogos) && this.shouldShowMerchantLogos == payload.shouldShowMerchantLogos && this.showAnimatedDots == payload.showAnimatedDots;
        }

        public int hashCode() {
            return (((((this.consent.hashCode() * 31) + this.merchantLogos.hashCode()) * 31) + Boolean.hashCode(this.shouldShowMerchantLogos)) * 31) + Boolean.hashCode(this.showAnimatedDots);
        }

        public String toString() {
            return "Payload(consent=" + this.consent + ", merchantLogos=" + this.merchantLogos + ", shouldShowMerchantLogos=" + this.shouldShowMerchantLogos + ", showAnimatedDots=" + this.showAnimatedDots + ")";
        }

        public Payload(ConsentPane consent, List<String> merchantLogos, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(consent, "consent");
            Intrinsics.checkNotNullParameter(merchantLogos, "merchantLogos");
            this.consent = consent;
            this.merchantLogos = merchantLogos;
            this.shouldShowMerchantLogos = z;
            this.showAnimatedDots = z2;
        }

        public final ConsentPane getConsent() {
            return this.consent;
        }

        public final List<String> getMerchantLogos() {
            return this.merchantLogos;
        }

        public final boolean getShouldShowMerchantLogos() {
            return this.shouldShowMerchantLogos;
        }

        public final boolean getShowAnimatedDots() {
            return this.showAnimatedDots;
        }
    }

    /* compiled from: ConsentState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;", "", "<init>", "()V", "OpenUrl", "Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect$OpenUrl;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ViewEffect {
        public static final int $stable = 0;

        public /* synthetic */ ViewEffect(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ViewEffect() {
        }

        /* compiled from: ConsentState.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect$OpenUrl;", "Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;", "url", "", "id", "", "<init>", "(Ljava/lang/String;J)V", "getUrl", "()Ljava/lang/String;", "getId", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
