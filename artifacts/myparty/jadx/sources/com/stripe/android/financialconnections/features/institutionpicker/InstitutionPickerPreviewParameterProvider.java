package com.stripe.android.financialconnections.features.institutionpicker;

import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerState;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import com.stripe.android.financialconnections.presentation.Async;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: InstitutionPickerPreviewParameterProvider.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006!"}, d2 = {"Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "initialLoading", "featured", "searchInProgress", "searchSuccess", "searchSuccessNoManualEntry", "searchNoResults", "searchNoResultsNoManualEntry", "searchFailed", "searchFailedNoManualEntry", "selectedInstitution", "partiallyScrolled", "payload", "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;", "manualEntry", "", "institutionResponse", "Lcom/stripe/android/financialconnections/model/InstitutionResponse;", "institutions", "", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", ContextChain.TAG_INFRA, "InstitutionPreviewState", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InstitutionPickerPreviewParameterProvider implements PreviewParameterProvider<InstitutionPreviewState> {
    public static final int FEW_INSTITUTIONS = 3;
    public static final int MANY_INSTITUTIONS = 10;
    private final Sequence<InstitutionPreviewState> values = SequencesKt.sequenceOf(initialLoading(), featured(), searchInProgress(), searchSuccess(), searchSuccessNoManualEntry(), searchNoResults(), searchNoResultsNoManualEntry(), searchFailed(), searchFailedNoManualEntry(), selectedInstitution(), partiallyScrolled());
    public static final int $stable = 8;

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public Sequence<InstitutionPreviewState> getValues() {
        return this.values;
    }

    private final InstitutionPreviewState initialLoading() {
        return new InstitutionPreviewState(new InstitutionPickerState(null, null, new Async.Loading(null, 1, null), Async.Uninitialized.INSTANCE, null, null, 50, null), 0);
    }

    private final InstitutionPreviewState featured() {
        return new InstitutionPreviewState(new InstitutionPickerState(null, null, new Async.Success(payload$default(this, false, 1, null)), Async.Uninitialized.INSTANCE, null, null, 50, null), 0);
    }

    private final InstitutionPreviewState searchInProgress() {
        return new InstitutionPreviewState(new InstitutionPickerState("Some query", null, new Async.Success(payload$default(this, false, 1, null)), new Async.Loading(null, 1, null), null, null, 50, null), 0);
    }

    private final InstitutionPreviewState searchSuccess() {
        return new InstitutionPreviewState(new InstitutionPickerState("Some query", null, new Async.Success(payload$default(this, false, 1, null)), new Async.Success(InstitutionResponse.copy$default(institutionResponse(3), true, null, 2, null)), null, null, 50, null), 0);
    }

    private final InstitutionPreviewState searchSuccessNoManualEntry() {
        return new InstitutionPreviewState(new InstitutionPickerState("Some query", null, new Async.Success(payload$default(this, false, 1, null)), new Async.Success(InstitutionResponse.copy$default(institutionResponse(3), false, null, 2, null)), null, null, 50, null), 0);
    }

    private final InstitutionPreviewState searchNoResults() {
        return new InstitutionPreviewState(new InstitutionPickerState("Some query", null, new Async.Success(payload$default(this, false, 1, null)), new Async.Success(new InstitutionResponse(true, CollectionsKt.emptyList())), null, null, 50, null), 0);
    }

    private final InstitutionPreviewState searchNoResultsNoManualEntry() {
        return new InstitutionPreviewState(new InstitutionPickerState("Some query", null, new Async.Success(payload$default(this, false, 1, null)), new Async.Success(new InstitutionResponse(false, CollectionsKt.emptyList())), null, null, 50, null), 0);
    }

    private final InstitutionPreviewState searchFailed() {
        return new InstitutionPreviewState(new InstitutionPickerState("Some query", null, new Async.Success(payload(true)), new Async.Fail(new Exception("Something went wrong")), null, null, 50, null), 0);
    }

    private final InstitutionPreviewState searchFailedNoManualEntry() {
        return new InstitutionPreviewState(new InstitutionPickerState("Some query", null, new Async.Success(payload(false)), new Async.Fail(new Exception("Something went wrong")), null, null, 50, null), 0);
    }

    private final InstitutionPreviewState selectedInstitution() {
        return new InstitutionPreviewState(new InstitutionPickerState("Some query", ExifInterface.GPS_MEASUREMENT_2D, new Async.Success(payload$default(this, false, 1, null)), new Async.Success(institutionResponse(3)), new Async.Loading(null, 1, null), null, 32, null), 0);
    }

    private final InstitutionPreviewState partiallyScrolled() {
        return new InstitutionPreviewState(new InstitutionPickerState("Some query", null, new Async.Success(payload$default(this, false, 1, null)), new Async.Success(institutionResponse(10)), null, null, 50, null), 1000);
    }

    private final InstitutionPickerState.Payload payload(boolean manualEntry) {
        return new InstitutionPickerState.Payload(InstitutionResponse.copy$default(institutionResponse(3), Boolean.valueOf(manualEntry), null, 2, null), false, 0L);
    }

    static /* synthetic */ InstitutionPickerState.Payload payload$default(InstitutionPickerPreviewParameterProvider institutionPickerPreviewParameterProvider, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return institutionPickerPreviewParameterProvider.payload(z);
    }

    private final InstitutionResponse institutionResponse(int institutions) {
        return new InstitutionResponse(true, CollectionsKt.take(CollectionsKt.listOf((Object[]) new FinancialConnectionsInstitution[]{FinancialConnectionsInstitution.copy$default(institution(1), false, null, false, "Very very long institution content does not fit - 1", null, null, null, "https://www.institutionUrl.com/1", 119, null), institution(2), FinancialConnectionsInstitution.copy$default(institution(3), false, null, false, null, null, null, null, "Unparseable URL", 127, null), institution(4), institution(5), institution(6), institution(7), institution(8), institution(9), institution(10)}), institutions));
    }

    private final FinancialConnectionsInstitution institution(int i) {
        return new FinancialConnectionsInstitution(false, String.valueOf(i), false, "Institution " + i, null, null, null, "otherUrl.com");
    }

    /* compiled from: InstitutionPickerPreviewParameterProvider.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerPreviewParameterProvider$InstitutionPreviewState;", "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;", "initialScroll", "", "<init>", "(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;I)V", "getState", "()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;", "getInitialScroll", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InstitutionPreviewState {
        public static final int $stable = 8;
        private final int initialScroll;
        private final InstitutionPickerState state;

        public static /* synthetic */ InstitutionPreviewState copy$default(InstitutionPreviewState institutionPreviewState, InstitutionPickerState institutionPickerState, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                institutionPickerState = institutionPreviewState.state;
            }
            if ((i2 & 2) != 0) {
                i = institutionPreviewState.initialScroll;
            }
            return institutionPreviewState.copy(institutionPickerState, i);
        }

        /* renamed from: component1, reason: from getter */
        public final InstitutionPickerState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final int getInitialScroll() {
            return this.initialScroll;
        }

        public final InstitutionPreviewState copy(InstitutionPickerState state, int initialScroll) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new InstitutionPreviewState(state, initialScroll);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InstitutionPreviewState)) {
                return false;
            }
            InstitutionPreviewState institutionPreviewState = (InstitutionPreviewState) other;
            return Intrinsics.areEqual(this.state, institutionPreviewState.state) && this.initialScroll == institutionPreviewState.initialScroll;
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + Integer.hashCode(this.initialScroll);
        }

        public String toString() {
            return "InstitutionPreviewState(state=" + this.state + ", initialScroll=" + this.initialScroll + ")";
        }

        public InstitutionPreviewState(InstitutionPickerState state, int i) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
            this.initialScroll = i;
        }

        public final InstitutionPickerState getState() {
            return this.state;
        }

        public final int getInitialScroll() {
            return this.initialScroll;
        }
    }
}
