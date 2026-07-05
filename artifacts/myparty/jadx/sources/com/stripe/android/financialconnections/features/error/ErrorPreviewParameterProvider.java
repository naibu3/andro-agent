package com.stripe.android.financialconnections.features.error;

import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import androidx.exifinterface.media.ExifInterface;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.financialconnections.exception.InstitutionPlannedDowntimeError;
import com.stripe.android.financialconnections.exception.InstitutionUnplannedDowntimeError;
import com.stripe.android.financialconnections.features.error.ErrorState;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.presentation.Async;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: ErrorPreviewParameterProvider.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/financialconnections/features/error/ErrorPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/stripe/android/financialconnections/features/error/ErrorState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "loading", "unclassified", "unclassifiedWithManualEntry", "expectedDowntime", "unexpectedDowntime", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ErrorPreviewParameterProvider implements PreviewParameterProvider<ErrorState> {
    public static final int $stable = 8;
    private final Sequence<ErrorState> values = SequencesKt.sequenceOf(loading(), unclassified(), unclassifiedWithManualEntry(), expectedDowntime(), unexpectedDowntime());

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public Sequence<ErrorState> getValues() {
        return this.values;
    }

    private final ErrorState loading() {
        return new ErrorState(new Async.Loading(null, 1, null));
    }

    private final ErrorState unclassified() {
        return new ErrorState(new Async.Success(new ErrorState.Payload(new IllegalArgumentException("An unknown error occurred."), true, false)));
    }

    private final ErrorState unclassifiedWithManualEntry() {
        return new ErrorState(new Async.Success(new ErrorState.Payload(new IllegalArgumentException("An unknown error occurred."), true, true)));
    }

    private final ErrorState expectedDowntime() {
        return new ErrorState(new Async.Success(new ErrorState.Payload(new InstitutionPlannedDowntimeError(institution(), true, true, 10000L, new APIException(null, null, 0, null, null, 31, null)), true, true)));
    }

    private final ErrorState unexpectedDowntime() {
        return new ErrorState(new Async.Success(new ErrorState.Payload(new InstitutionUnplannedDowntimeError(institution(), true, new APIException(null, null, 0, null, null, 31, null)), true, true)));
    }

    private final FinancialConnectionsInstitution institution() {
        return new FinancialConnectionsInstitution(false, ExifInterface.GPS_MEASUREMENT_3D, false, "Random Institution", null, null, null, "Random Institution url");
    }
}
