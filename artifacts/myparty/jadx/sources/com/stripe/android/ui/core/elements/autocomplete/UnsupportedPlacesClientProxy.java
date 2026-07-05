package com.stripe.android.ui.core.elements.autocomplete;

import com.google.android.gms.actions.SearchIntents;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.ui.core.elements.autocomplete.model.FetchPlaceResponse;
import com.stripe.android.ui.core.elements.autocomplete.model.FindAutocompletePredictionsResponse;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlacesClientProxy.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\t2\u0006\u0010\u0014\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/UnsupportedPlacesClientProxy;", "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "<init>", "(Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V", "getErrorReporter", "()Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "findAutocompletePredictions", "Lkotlin/Result;", "Lcom/stripe/android/ui/core/elements/autocomplete/model/FindAutocompletePredictionsResponse;", SearchIntents.EXTRA_QUERY, "", "country", "limit", "", "findAutocompletePredictions-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchPlace", "Lcom/stripe/android/ui/core/elements/autocomplete/model/FetchPlaceResponse;", "placeId", "fetchPlace-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnsupportedPlacesClientProxy implements PlacesClientProxy {
    public static final int $stable = 8;
    private final ErrorReporter errorReporter;

    public UnsupportedPlacesClientProxy(ErrorReporter errorReporter) {
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        this.errorReporter = errorReporter;
    }

    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.stripe.android.ui.core.elements.autocomplete.PlacesClientProxy
    /* renamed from: findAutocompletePredictions-BWLJW6A */
    public Object mo8668findAutocompletePredictionsBWLJW6A(String str, String str2, int i, Continuation<? super Result<FindAutocompletePredictionsResponse>> continuation) {
        IllegalStateException illegalStateException = new IllegalStateException("Missing Google Places dependency, please add it to your apps build.gradle");
        ErrorReporter.DefaultImpls.report$default(this.errorReporter, ErrorReporter.UnexpectedErrorEvent.FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY, null, null, 6, null);
        Result.Companion companion = Result.INSTANCE;
        return Result.m9118constructorimpl(ResultKt.createFailure(illegalStateException));
    }

    @Override // com.stripe.android.ui.core.elements.autocomplete.PlacesClientProxy
    /* renamed from: fetchPlace-gIAlu-s */
    public Object mo8667fetchPlacegIAlus(String str, Continuation<? super Result<FetchPlaceResponse>> continuation) {
        IllegalStateException illegalStateException = new IllegalStateException("Missing Google Places dependency, please add it to your apps build.gradle");
        ErrorReporter.DefaultImpls.report$default(this.errorReporter, ErrorReporter.UnexpectedErrorEvent.FETCH_PLACE_WITHOUT_DEPENDENCY, null, null, 6, null);
        Result.Companion companion = Result.INSTANCE;
        return Result.m9118constructorimpl(ResultKt.createFailure(illegalStateException));
    }
}
