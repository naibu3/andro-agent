package com.stripe.android.uicore.address;

import androidx.compose.ui.text.StringKt;
import androidx.compose.ui.text.intl.Locale;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* compiled from: AutocompleteCapableInputMode.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0010H\u0016R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/uicore/address/AutocompleteCapableInputMode;", "", "googleApiKey", "", "getGoogleApiKey", "()Ljava/lang/String;", "autocompleteCountries", "", "getAutocompleteCountries", "()Ljava/util/Set;", "onNavigation", "Lkotlin/Function0;", "", "getOnNavigation", "()Lkotlin/jvm/functions/Function0;", "supportsAutoComplete", "", "country", "isPlacesAvailable", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AutocompleteCapableInputMode {
    Set<String> getAutocompleteCountries();

    String getGoogleApiKey();

    Function0<Unit> getOnNavigation();

    boolean supportsAutoComplete(String country, boolean isPlacesAvailable);

    /* compiled from: AutocompleteCapableInputMode.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static boolean supportsAutoComplete(AutocompleteCapableInputMode autocompleteCapableInputMode, String str, boolean z) {
            boolean z2;
            String googleApiKey;
            Set<String> autocompleteCountries = autocompleteCapableInputMode.getAutocompleteCountries();
            if (autocompleteCountries != null) {
                Set<String> set = autocompleteCountries;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(StringKt.toLowerCase((String) it.next(), Locale.INSTANCE.getCurrent()));
                }
                z2 = CollectionsKt.contains(arrayList, str != null ? StringKt.toLowerCase(str, Locale.INSTANCE.getCurrent()) : null);
            }
            return z2 && (z && (googleApiKey = autocompleteCapableInputMode.getGoogleApiKey()) != null && !StringsKt.isBlank(googleApiKey));
        }
    }
}
