package com.stripe.android.ui.core.elements.autocomplete;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.model.AddressComponent;
import com.google.android.libraries.places.api.model.AddressComponents;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.ui.core.elements.autocomplete.model.FetchPlaceResponse;
import com.stripe.android.ui.core.elements.autocomplete.model.FindAutocompletePredictionsResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.tasks.TasksKt;

/* compiled from: PlacesClientProxy.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\r2\u0006\u0010\u0018\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/DefaultPlacesClientProxy;", "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "Lcom/google/android/libraries/places/api/net/PlacesClient;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "<init>", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V", "token", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "kotlin.jvm.PlatformType", "Lcom/google/android/libraries/places/api/model/AutocompleteSessionToken;", "findAutocompletePredictions", "Lkotlin/Result;", "Lcom/stripe/android/ui/core/elements/autocomplete/model/FindAutocompletePredictionsResponse;", SearchIntents.EXTRA_QUERY, "", "country", "limit", "", "findAutocompletePredictions-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchPlace", "Lcom/stripe/android/ui/core/elements/autocomplete/model/FetchPlaceResponse;", "placeId", "fetchPlace-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultPlacesClientProxy implements PlacesClientProxy {
    public static final int $stable = 8;
    private final PlacesClient client;
    private final ErrorReporter errorReporter;
    private final AutocompleteSessionToken token;

    public DefaultPlacesClientProxy(PlacesClient client, ErrorReporter errorReporter) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        this.client = client;
        this.errorReporter = errorReporter;
        this.token = AutocompleteSessionToken.newInstance();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.ui.core.elements.autocomplete.PlacesClientProxy
    /* renamed from: findAutocompletePredictions-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8668findAutocompletePredictionsBWLJW6A(String str, String str2, int i, Continuation<? super Result<FindAutocompletePredictionsResponse>> continuation) {
        DefaultPlacesClientProxy$findAutocompletePredictions$1 defaultPlacesClientProxy$findAutocompletePredictions$1;
        Exception exc;
        DefaultPlacesClientProxy defaultPlacesClientProxy;
        if (continuation instanceof DefaultPlacesClientProxy$findAutocompletePredictions$1) {
            defaultPlacesClientProxy$findAutocompletePredictions$1 = (DefaultPlacesClientProxy$findAutocompletePredictions$1) continuation;
            if ((defaultPlacesClientProxy$findAutocompletePredictions$1.label & Integer.MIN_VALUE) != 0) {
                defaultPlacesClientProxy$findAutocompletePredictions$1.label -= Integer.MIN_VALUE;
            } else {
                defaultPlacesClientProxy$findAutocompletePredictions$1 = new DefaultPlacesClientProxy$findAutocompletePredictions$1(this, continuation);
            }
        }
        Object objAwait = defaultPlacesClientProxy$findAutocompletePredictions$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = defaultPlacesClientProxy$findAutocompletePredictions$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwait);
            try {
                Task taskFindAutocompletePredictions = this.client.findAutocompletePredictions(FindAutocompletePredictionsRequest.builder().setSessionToken(this.token).setQuery(str).setCountry(str2).setTypeFilter(TypeFilter.ADDRESS).build());
                Intrinsics.checkNotNullExpressionValue(taskFindAutocompletePredictions, "findAutocompletePredictions(...)");
                defaultPlacesClientProxy$findAutocompletePredictions$1.L$0 = this;
                defaultPlacesClientProxy$findAutocompletePredictions$1.I$0 = i;
                defaultPlacesClientProxy$findAutocompletePredictions$1.label = 1;
                objAwait = TasksKt.await(taskFindAutocompletePredictions, defaultPlacesClientProxy$findAutocompletePredictions$1);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
                defaultPlacesClientProxy = this;
            } catch (Exception e) {
                exc = e;
                defaultPlacesClientProxy = this;
                ErrorReporter.DefaultImpls.report$default(defaultPlacesClientProxy.errorReporter, ErrorReporter.ExpectedErrorEvent.PLACES_FIND_AUTOCOMPLETE_ERROR, StripeException.INSTANCE.create(exc), null, 4, null);
                Result.Companion companion = Result.INSTANCE;
                return Result.m9118constructorimpl(ResultKt.createFailure(new Exception("Could not find autocomplete predictions: " + exc.getMessage())));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = defaultPlacesClientProxy$findAutocompletePredictions$1.I$0;
            defaultPlacesClientProxy = (DefaultPlacesClientProxy) defaultPlacesClientProxy$findAutocompletePredictions$1.L$0;
            try {
                ResultKt.throwOnFailure(objAwait);
            } catch (Exception e2) {
                exc = e2;
                ErrorReporter.DefaultImpls.report$default(defaultPlacesClientProxy.errorReporter, ErrorReporter.ExpectedErrorEvent.PLACES_FIND_AUTOCOMPLETE_ERROR, StripeException.INSTANCE.create(exc), null, 4, null);
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m9118constructorimpl(ResultKt.createFailure(new Exception("Could not find autocomplete predictions: " + exc.getMessage())));
            }
        }
        ErrorReporter.DefaultImpls.report$default(defaultPlacesClientProxy.errorReporter, ErrorReporter.SuccessEvent.PLACES_FIND_AUTOCOMPLETE_SUCCESS, null, null, 6, null);
        Result.Companion companion3 = Result.INSTANCE;
        List autocompletePredictions = ((com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse) objAwait).getAutocompletePredictions();
        Intrinsics.checkNotNullExpressionValue(autocompletePredictions, "getAutocompletePredictions(...)");
        List<AutocompletePrediction> list = autocompletePredictions;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (AutocompletePrediction autocompletePrediction : list) {
            SpannableString primaryText = autocompletePrediction.getPrimaryText(new StyleSpan(1));
            Intrinsics.checkNotNullExpressionValue(primaryText, "getPrimaryText(...)");
            SpannableString secondaryText = autocompletePrediction.getSecondaryText(new StyleSpan(1));
            Intrinsics.checkNotNullExpressionValue(secondaryText, "getSecondaryText(...)");
            String placeId = autocompletePrediction.getPlaceId();
            Intrinsics.checkNotNullExpressionValue(placeId, "getPlaceId(...)");
            arrayList.add(new com.stripe.android.ui.core.elements.autocomplete.model.AutocompletePrediction(primaryText, secondaryText, placeId));
        }
        return Result.m9118constructorimpl(new FindAutocompletePredictionsResponse(CollectionsKt.take(arrayList, i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.ui.core.elements.autocomplete.PlacesClientProxy
    /* renamed from: fetchPlace-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8667fetchPlacegIAlus(String str, Continuation<? super Result<FetchPlaceResponse>> continuation) {
        DefaultPlacesClientProxy$fetchPlace$1 defaultPlacesClientProxy$fetchPlace$1;
        Exception exc;
        DefaultPlacesClientProxy defaultPlacesClientProxy;
        ArrayList arrayList;
        List listAsList;
        if (continuation instanceof DefaultPlacesClientProxy$fetchPlace$1) {
            defaultPlacesClientProxy$fetchPlace$1 = (DefaultPlacesClientProxy$fetchPlace$1) continuation;
            if ((defaultPlacesClientProxy$fetchPlace$1.label & Integer.MIN_VALUE) != 0) {
                defaultPlacesClientProxy$fetchPlace$1.label -= Integer.MIN_VALUE;
            } else {
                defaultPlacesClientProxy$fetchPlace$1 = new DefaultPlacesClientProxy$fetchPlace$1(this, continuation);
            }
        }
        Object objAwait = defaultPlacesClientProxy$fetchPlace$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = defaultPlacesClientProxy$fetchPlace$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objAwait);
            try {
                Task taskFetchPlace = this.client.fetchPlace(FetchPlaceRequest.newInstance(str, CollectionsKt.listOf(Place.Field.ADDRESS_COMPONENTS)));
                Intrinsics.checkNotNullExpressionValue(taskFetchPlace, "fetchPlace(...)");
                defaultPlacesClientProxy$fetchPlace$1.L$0 = this;
                defaultPlacesClientProxy$fetchPlace$1.label = 1;
                objAwait = TasksKt.await(taskFetchPlace, defaultPlacesClientProxy$fetchPlace$1);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
                defaultPlacesClientProxy = this;
            } catch (Exception e) {
                exc = e;
                defaultPlacesClientProxy = this;
                ErrorReporter.DefaultImpls.report$default(defaultPlacesClientProxy.errorReporter, ErrorReporter.ExpectedErrorEvent.PLACES_FETCH_PLACE_ERROR, StripeException.INSTANCE.create(exc), null, 4, null);
                Result.Companion companion = Result.INSTANCE;
                return Result.m9118constructorimpl(ResultKt.createFailure(new Exception("Could not fetch place: " + exc.getMessage())));
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defaultPlacesClientProxy = (DefaultPlacesClientProxy) defaultPlacesClientProxy$fetchPlace$1.L$0;
            try {
                ResultKt.throwOnFailure(objAwait);
            } catch (Exception e2) {
                exc = e2;
                ErrorReporter.DefaultImpls.report$default(defaultPlacesClientProxy.errorReporter, ErrorReporter.ExpectedErrorEvent.PLACES_FETCH_PLACE_ERROR, StripeException.INSTANCE.create(exc), null, 4, null);
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m9118constructorimpl(ResultKt.createFailure(new Exception("Could not fetch place: " + exc.getMessage())));
            }
        }
        ErrorReporter.DefaultImpls.report$default(defaultPlacesClientProxy.errorReporter, ErrorReporter.SuccessEvent.PLACES_FETCH_PLACE_SUCCESS, null, null, 6, null);
        Result.Companion companion3 = Result.INSTANCE;
        AddressComponents addressComponents = ((com.google.android.libraries.places.api.net.FetchPlaceResponse) objAwait).getPlace().getAddressComponents();
        if (addressComponents == null || (listAsList = addressComponents.asList()) == null) {
            arrayList = null;
        } else {
            List<AddressComponent> list = listAsList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (AddressComponent addressComponent : list) {
                String shortName = addressComponent.getShortName();
                String name = addressComponent.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                List types = addressComponent.getTypes();
                Intrinsics.checkNotNullExpressionValue(types, "getTypes(...)");
                arrayList2.add(new com.stripe.android.ui.core.elements.autocomplete.model.AddressComponent(shortName, name, types));
            }
            arrayList = arrayList2;
        }
        return Result.m9118constructorimpl(new FetchPlaceResponse(new com.stripe.android.ui.core.elements.autocomplete.model.Place(arrayList)));
    }
}
