package com.stripe.android.ui.core.elements.autocomplete;

import android.content.Context;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.ui.core.elements.autocomplete.PlacesClientProxy;
import com.stripe.android.ui.core.elements.autocomplete.model.FetchPlaceResponse;
import com.stripe.android.ui.core.elements.autocomplete.model.FindAutocompletePredictionsResponse;
import com.stripe.android.uicore.elements.DefaultIsPlacesAvailable;
import com.stripe.android.uicore.elements.IsPlacesAvailable;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlacesClientProxy.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J0\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u000e\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;", "", "findAutocompletePredictions", "Lkotlin/Result;", "Lcom/stripe/android/ui/core/elements/autocomplete/model/FindAutocompletePredictionsResponse;", SearchIntents.EXTRA_QUERY, "", "country", "limit", "", "findAutocompletePredictions-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchPlace", "Lcom/stripe/android/ui/core/elements/autocomplete/model/FetchPlaceResponse;", "placeId", "fetchPlace-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PlacesClientProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* renamed from: fetchPlace-gIAlu-s */
    Object mo8667fetchPlacegIAlus(String str, Continuation<? super Result<FetchPlaceResponse>> continuation);

    /* renamed from: findAutocompletePredictions-BWLJW6A */
    Object mo8668findAutocompletePredictionsBWLJW6A(String str, String str2, int i, Continuation<? super Result<FindAutocompletePredictionsResponse>> continuation);

    /* compiled from: PlacesClientProxy.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00140\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u001f\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u001eR&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy$Companion;", "", "<init>", "()V", "override", "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;", "getOverride$annotations", "getOverride", "()Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;", "setOverride", "(Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;)V", "create", "context", "Landroid/content/Context;", "googlePlacesApiKey", "", "isPlacesAvailable", "Lcom/stripe/android/uicore/elements/IsPlacesAvailable;", "clientFactory", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "initializer", "Lkotlin/Function0;", "", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "getPlacesPoweredByGoogleDrawable", "", "isSystemDarkTheme", "", "(ZLcom/stripe/android/uicore/elements/IsPlacesAvailable;)Ljava/lang/Integer;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static volatile PlacesClientProxy override;

        public static /* synthetic */ void getOverride$annotations() {
        }

        private Companion() {
        }

        public final PlacesClientProxy getOverride() {
            return override;
        }

        public final void setOverride(PlacesClientProxy placesClientProxy) {
            override = placesClientProxy;
        }

        public static /* synthetic */ PlacesClientProxy create$default(Companion companion, final Context context, final String str, IsPlacesAvailable isPlacesAvailable, Function1 function1, Function0 function0, ErrorReporter errorReporter, int i, Object obj) {
            if ((i & 4) != 0) {
                isPlacesAvailable = new DefaultIsPlacesAvailable();
            }
            IsPlacesAvailable isPlacesAvailable2 = isPlacesAvailable;
            if ((i & 8) != 0) {
                function1 = new Function1() { // from class: com.stripe.android.ui.core.elements.autocomplete.PlacesClientProxy$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PlacesClientProxy.Companion.create$lambda$0(context, (Context) obj2);
                    }
                };
            }
            Function1 function12 = function1;
            if ((i & 16) != 0) {
                function0 = new Function0() { // from class: com.stripe.android.ui.core.elements.autocomplete.PlacesClientProxy$Companion$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PlacesClientProxy.Companion.create$lambda$1(context, str);
                    }
                };
            }
            return companion.create(context, str, isPlacesAvailable2, function12, function0, errorReporter);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PlacesClient create$lambda$0(Context context, Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Places.createClient(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit create$lambda$1(Context context, String str) {
            Places.initialize(context, str);
            return Unit.INSTANCE;
        }

        public final PlacesClientProxy create(Context context, String googlePlacesApiKey, IsPlacesAvailable isPlacesAvailable, Function1<? super Context, ? extends PlacesClient> clientFactory, Function0<Unit> initializer, ErrorReporter errorReporter) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(googlePlacesApiKey, "googlePlacesApiKey");
            Intrinsics.checkNotNullParameter(isPlacesAvailable, "isPlacesAvailable");
            Intrinsics.checkNotNullParameter(clientFactory, "clientFactory");
            Intrinsics.checkNotNullParameter(initializer, "initializer");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            if (isPlacesAvailable.invoke()) {
                PlacesClientProxy placesClientProxy = override;
                if (placesClientProxy != null) {
                    return placesClientProxy;
                }
                initializer.invoke();
                return new DefaultPlacesClientProxy(clientFactory.invoke(context), errorReporter);
            }
            return new UnsupportedPlacesClientProxy(errorReporter);
        }

        public static /* synthetic */ Integer getPlacesPoweredByGoogleDrawable$default(Companion companion, boolean z, IsPlacesAvailable isPlacesAvailable, int i, Object obj) {
            if ((i & 2) != 0) {
                isPlacesAvailable = new DefaultIsPlacesAvailable();
            }
            return companion.getPlacesPoweredByGoogleDrawable(z, isPlacesAvailable);
        }

        public final Integer getPlacesPoweredByGoogleDrawable(boolean isSystemDarkTheme, IsPlacesAvailable isPlacesAvailable) {
            int i;
            Intrinsics.checkNotNullParameter(isPlacesAvailable, "isPlacesAvailable");
            if (!isPlacesAvailable.invoke()) {
                return null;
            }
            if (isSystemDarkTheme) {
                i = R.drawable.places_powered_by_google_dark;
            } else {
                i = R.drawable.places_powered_by_google_light;
            }
            return Integer.valueOf(i);
        }
    }
}
