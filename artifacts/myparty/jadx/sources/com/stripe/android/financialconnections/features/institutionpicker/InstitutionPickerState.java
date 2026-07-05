package com.stripe.android.financialconnections.features.institutionpicker;

import android.os.Bundle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstitutionPickerViewModel.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001)B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fB\u0013\b\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0012J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003J]\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;", "", "previewText", "", "selectedInstitutionId", "payload", "Lcom/stripe/android/financialconnections/presentation/Async;", "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;", "searchInstitutions", "Lcom/stripe/android/financialconnections/model/InstitutionResponse;", "createSessionForInstitution", "", Destination.KEY_REFERRER, "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/presentation/Async;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", CardScanActivity.ARGS, "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "getPreviewText", "()Ljava/lang/String;", "getSelectedInstitutionId", "getPayload", "()Lcom/stripe/android/financialconnections/presentation/Async;", "getSearchInstitutions", "getCreateSessionForInstitution", "getReferrer", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Payload", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InstitutionPickerState {
    public static final int $stable = 8;
    private final Async<Unit> createSessionForInstitution;
    private final Async<Payload> payload;
    private final String previewText;
    private final FinancialConnectionsSessionManifest.Pane referrer;
    private final Async<InstitutionResponse> searchInstitutions;
    private final String selectedInstitutionId;

    public InstitutionPickerState() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ InstitutionPickerState copy$default(InstitutionPickerState institutionPickerState, String str, String str2, Async async, Async async2, Async async3, FinancialConnectionsSessionManifest.Pane pane, int i, Object obj) {
        if ((i & 1) != 0) {
            str = institutionPickerState.previewText;
        }
        if ((i & 2) != 0) {
            str2 = institutionPickerState.selectedInstitutionId;
        }
        if ((i & 4) != 0) {
            async = institutionPickerState.payload;
        }
        if ((i & 8) != 0) {
            async2 = institutionPickerState.searchInstitutions;
        }
        if ((i & 16) != 0) {
            async3 = institutionPickerState.createSessionForInstitution;
        }
        if ((i & 32) != 0) {
            pane = institutionPickerState.referrer;
        }
        Async async4 = async3;
        FinancialConnectionsSessionManifest.Pane pane2 = pane;
        return institutionPickerState.copy(str, str2, async, async2, async4, pane2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPreviewText() {
        return this.previewText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSelectedInstitutionId() {
        return this.selectedInstitutionId;
    }

    public final Async<Payload> component3() {
        return this.payload;
    }

    public final Async<InstitutionResponse> component4() {
        return this.searchInstitutions;
    }

    public final Async<Unit> component5() {
        return this.createSessionForInstitution;
    }

    /* renamed from: component6, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getReferrer() {
        return this.referrer;
    }

    public final InstitutionPickerState copy(String previewText, String selectedInstitutionId, Async<Payload> payload, Async<InstitutionResponse> searchInstitutions, Async<Unit> createSessionForInstitution, FinancialConnectionsSessionManifest.Pane referrer) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(searchInstitutions, "searchInstitutions");
        Intrinsics.checkNotNullParameter(createSessionForInstitution, "createSessionForInstitution");
        return new InstitutionPickerState(previewText, selectedInstitutionId, payload, searchInstitutions, createSessionForInstitution, referrer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstitutionPickerState)) {
            return false;
        }
        InstitutionPickerState institutionPickerState = (InstitutionPickerState) other;
        return Intrinsics.areEqual(this.previewText, institutionPickerState.previewText) && Intrinsics.areEqual(this.selectedInstitutionId, institutionPickerState.selectedInstitutionId) && Intrinsics.areEqual(this.payload, institutionPickerState.payload) && Intrinsics.areEqual(this.searchInstitutions, institutionPickerState.searchInstitutions) && Intrinsics.areEqual(this.createSessionForInstitution, institutionPickerState.createSessionForInstitution) && this.referrer == institutionPickerState.referrer;
    }

    public int hashCode() {
        String str = this.previewText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.selectedInstitutionId;
        int iHashCode2 = (((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.payload.hashCode()) * 31) + this.searchInstitutions.hashCode()) * 31) + this.createSessionForInstitution.hashCode()) * 31;
        FinancialConnectionsSessionManifest.Pane pane = this.referrer;
        return iHashCode2 + (pane != null ? pane.hashCode() : 0);
    }

    public String toString() {
        return "InstitutionPickerState(previewText=" + this.previewText + ", selectedInstitutionId=" + this.selectedInstitutionId + ", payload=" + this.payload + ", searchInstitutions=" + this.searchInstitutions + ", createSessionForInstitution=" + this.createSessionForInstitution + ", referrer=" + this.referrer + ")";
    }

    public InstitutionPickerState(String str, String str2, Async<Payload> payload, Async<InstitutionResponse> searchInstitutions, Async<Unit> createSessionForInstitution, FinancialConnectionsSessionManifest.Pane pane) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(searchInstitutions, "searchInstitutions");
        Intrinsics.checkNotNullParameter(createSessionForInstitution, "createSessionForInstitution");
        this.previewText = str;
        this.selectedInstitutionId = str2;
        this.payload = payload;
        this.searchInstitutions = searchInstitutions;
        this.createSessionForInstitution = createSessionForInstitution;
        this.referrer = pane;
    }

    public final String getPreviewText() {
        return this.previewText;
    }

    public final String getSelectedInstitutionId() {
        return this.selectedInstitutionId;
    }

    public /* synthetic */ InstitutionPickerState(String str, String str2, Async.Uninitialized uninitialized, Async.Uninitialized uninitialized2, Async.Uninitialized uninitialized3, FinancialConnectionsSessionManifest.Pane pane, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? Async.Uninitialized.INSTANCE : uninitialized, (i & 8) != 0 ? Async.Uninitialized.INSTANCE : uninitialized2, (i & 16) != 0 ? Async.Uninitialized.INSTANCE : uninitialized3, (i & 32) != 0 ? null : pane);
    }

    public final Async<Payload> getPayload() {
        return this.payload;
    }

    public final Async<InstitutionResponse> getSearchInstitutions() {
        return this.searchInstitutions;
    }

    public final Async<Unit> getCreateSessionForInstitution() {
        return this.createSessionForInstitution;
    }

    public final FinancialConnectionsSessionManifest.Pane getReferrer() {
        return this.referrer;
    }

    public InstitutionPickerState(Bundle bundle) {
        this(null, null, null, null, null, Destination.INSTANCE.referrer$financial_connections_release(bundle), 31, null);
    }

    /* compiled from: InstitutionPickerViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;", "", "featuredInstitutions", "Lcom/stripe/android/financialconnections/model/InstitutionResponse;", "searchDisabled", "", "featuredInstitutionsDuration", "", "<init>", "(Lcom/stripe/android/financialconnections/model/InstitutionResponse;ZJ)V", "getFeaturedInstitutions", "()Lcom/stripe/android/financialconnections/model/InstitutionResponse;", "getSearchDisabled", "()Z", "getFeaturedInstitutionsDuration", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Payload {
        public static final int $stable = 8;
        private final InstitutionResponse featuredInstitutions;
        private final long featuredInstitutionsDuration;
        private final boolean searchDisabled;

        public static /* synthetic */ Payload copy$default(Payload payload, InstitutionResponse institutionResponse, boolean z, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                institutionResponse = payload.featuredInstitutions;
            }
            if ((i & 2) != 0) {
                z = payload.searchDisabled;
            }
            if ((i & 4) != 0) {
                j = payload.featuredInstitutionsDuration;
            }
            return payload.copy(institutionResponse, z, j);
        }

        /* renamed from: component1, reason: from getter */
        public final InstitutionResponse getFeaturedInstitutions() {
            return this.featuredInstitutions;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSearchDisabled() {
            return this.searchDisabled;
        }

        /* renamed from: component3, reason: from getter */
        public final long getFeaturedInstitutionsDuration() {
            return this.featuredInstitutionsDuration;
        }

        public final Payload copy(InstitutionResponse featuredInstitutions, boolean searchDisabled, long featuredInstitutionsDuration) {
            Intrinsics.checkNotNullParameter(featuredInstitutions, "featuredInstitutions");
            return new Payload(featuredInstitutions, searchDisabled, featuredInstitutionsDuration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return Intrinsics.areEqual(this.featuredInstitutions, payload.featuredInstitutions) && this.searchDisabled == payload.searchDisabled && this.featuredInstitutionsDuration == payload.featuredInstitutionsDuration;
        }

        public int hashCode() {
            return (((this.featuredInstitutions.hashCode() * 31) + Boolean.hashCode(this.searchDisabled)) * 31) + Long.hashCode(this.featuredInstitutionsDuration);
        }

        public String toString() {
            return "Payload(featuredInstitutions=" + this.featuredInstitutions + ", searchDisabled=" + this.searchDisabled + ", featuredInstitutionsDuration=" + this.featuredInstitutionsDuration + ")";
        }

        public Payload(InstitutionResponse featuredInstitutions, boolean z, long j) {
            Intrinsics.checkNotNullParameter(featuredInstitutions, "featuredInstitutions");
            this.featuredInstitutions = featuredInstitutions;
            this.searchDisabled = z;
            this.featuredInstitutionsDuration = j;
        }

        public final InstitutionResponse getFeaturedInstitutions() {
            return this.featuredInstitutions;
        }

        public final boolean getSearchDisabled() {
            return this.searchDisabled;
        }

        public final long getFeaturedInstitutionsDuration() {
            return this.featuredInstitutionsDuration;
        }
    }
}
