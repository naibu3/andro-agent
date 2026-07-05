package com.stripe.android.uicore.elements;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutocompleteAddressInteractor.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010J\u001c\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\tH&J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;", "", "autocompleteConfig", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;", "getAutocompleteConfig", "()Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;", "register", "", "onEvent", "Lkotlin/Function1;", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event;", "onAutocomplete", "country", "", "Config", "Event", "Factory", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AutocompleteAddressInteractor {

    /* compiled from: AutocompleteAddressInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;", "", "create", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        AutocompleteAddressInteractor create();
    }

    Config getAutocompleteConfig();

    void onAutocomplete(String country);

    void register(Function1<? super Event, Unit> onEvent);

    /* compiled from: AutocompleteAddressInteractor.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;", "", "googlePlacesApiKey", "", "autocompleteCountries", "", "isPlacesAvailable", "", "<init>", "(Ljava/lang/String;Ljava/util/Set;Z)V", "getGooglePlacesApiKey", "()Ljava/lang/String;", "getAutocompleteCountries", "()Ljava/util/Set;", "()Z", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Config {
        public static final int $stable = 8;
        private final Set<String> autocompleteCountries;
        private final String googlePlacesApiKey;
        private final boolean isPlacesAvailable;

        public Config(String str, Set<String> autocompleteCountries, boolean z) {
            Intrinsics.checkNotNullParameter(autocompleteCountries, "autocompleteCountries");
            this.googlePlacesApiKey = str;
            this.autocompleteCountries = autocompleteCountries;
            this.isPlacesAvailable = z;
        }

        public final String getGooglePlacesApiKey() {
            return this.googlePlacesApiKey;
        }

        public final Set<String> getAutocompleteCountries() {
            return this.autocompleteCountries;
        }

        public /* synthetic */ Config(String str, Set set, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, set, (i & 4) != 0 ? new DefaultIsPlacesAvailable().invoke() : z);
        }

        /* renamed from: isPlacesAvailable, reason: from getter */
        public final boolean getIsPlacesAvailable() {
            return this.isPlacesAvailable;
        }
    }

    /* compiled from: AutocompleteAddressInteractor.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\b\tR\"\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event;", "", "values", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", "getValues", "()Ljava/util/Map;", "OnExpandForm", "OnValues", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event$OnExpandForm;", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event$OnValues;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Event {
        Map<IdentifierSpec, String> getValues();

        /* compiled from: AutocompleteAddressInteractor.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003HÆ\u0003J#\u0010\u000b\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R$\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event$OnExpandForm;", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event;", "values", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", "<init>", "(Ljava/util/Map;)V", "getValues", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OnExpandForm implements Event {
            public static final int $stable = 8;
            private final Map<IdentifierSpec, String> values;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ OnExpandForm copy$default(OnExpandForm onExpandForm, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    map = onExpandForm.values;
                }
                return onExpandForm.copy(map);
            }

            public final Map<IdentifierSpec, String> component1() {
                return this.values;
            }

            public final OnExpandForm copy(Map<IdentifierSpec, String> values) {
                return new OnExpandForm(values);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnExpandForm) && Intrinsics.areEqual(this.values, ((OnExpandForm) other).values);
            }

            public int hashCode() {
                Map<IdentifierSpec, String> map = this.values;
                if (map == null) {
                    return 0;
                }
                return map.hashCode();
            }

            public String toString() {
                return "OnExpandForm(values=" + this.values + ")";
            }

            public OnExpandForm(Map<IdentifierSpec, String> map) {
                this.values = map;
            }

            @Override // com.stripe.android.uicore.elements.AutocompleteAddressInteractor.Event
            public Map<IdentifierSpec, String> getValues() {
                return this.values;
            }
        }

        /* compiled from: AutocompleteAddressInteractor.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\"\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event$OnValues;", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event;", "values", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", "<init>", "(Ljava/util/Map;)V", "getValues", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OnValues implements Event {
            public static final int $stable = 8;
            private final Map<IdentifierSpec, String> values;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ OnValues copy$default(OnValues onValues, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    map = onValues.values;
                }
                return onValues.copy(map);
            }

            public final Map<IdentifierSpec, String> component1() {
                return this.values;
            }

            public final OnValues copy(Map<IdentifierSpec, String> values) {
                Intrinsics.checkNotNullParameter(values, "values");
                return new OnValues(values);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OnValues) && Intrinsics.areEqual(this.values, ((OnValues) other).values);
            }

            public int hashCode() {
                return this.values.hashCode();
            }

            public String toString() {
                return "OnValues(values=" + this.values + ")";
            }

            public OnValues(Map<IdentifierSpec, String> values) {
                Intrinsics.checkNotNullParameter(values, "values");
                this.values = values;
            }

            @Override // com.stripe.android.uicore.elements.AutocompleteAddressInteractor.Event
            public Map<IdentifierSpec, String> getValues() {
                return this.values;
            }
        }
    }
}
