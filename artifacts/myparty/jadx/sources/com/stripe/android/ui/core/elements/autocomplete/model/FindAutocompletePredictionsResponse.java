package com.stripe.android.ui.core.elements.autocomplete.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Place.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/model/FindAutocompletePredictionsResponse;", "", "autocompletePredictions", "", "Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;", "<init>", "(Ljava/util/List;)V", "getAutocompletePredictions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FindAutocompletePredictionsResponse {
    public static final int $stable = 8;
    private final List<AutocompletePrediction> autocompletePredictions;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FindAutocompletePredictionsResponse copy$default(FindAutocompletePredictionsResponse findAutocompletePredictionsResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = findAutocompletePredictionsResponse.autocompletePredictions;
        }
        return findAutocompletePredictionsResponse.copy(list);
    }

    public final List<AutocompletePrediction> component1() {
        return this.autocompletePredictions;
    }

    public final FindAutocompletePredictionsResponse copy(List<AutocompletePrediction> autocompletePredictions) {
        Intrinsics.checkNotNullParameter(autocompletePredictions, "autocompletePredictions");
        return new FindAutocompletePredictionsResponse(autocompletePredictions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FindAutocompletePredictionsResponse) && Intrinsics.areEqual(this.autocompletePredictions, ((FindAutocompletePredictionsResponse) other).autocompletePredictions);
    }

    public int hashCode() {
        return this.autocompletePredictions.hashCode();
    }

    public String toString() {
        return "FindAutocompletePredictionsResponse(autocompletePredictions=" + this.autocompletePredictions + ")";
    }

    public FindAutocompletePredictionsResponse(List<AutocompletePrediction> autocompletePredictions) {
        Intrinsics.checkNotNullParameter(autocompletePredictions, "autocompletePredictions");
        this.autocompletePredictions = autocompletePredictions;
    }

    public final List<AutocompletePrediction> getAutocompletePredictions() {
        return this.autocompletePredictions;
    }
}
