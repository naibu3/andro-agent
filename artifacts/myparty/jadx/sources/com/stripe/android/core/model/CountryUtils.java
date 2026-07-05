package com.stripe.android.core.model;

import com.google.zxing.client.result.ExpandedProductParsedResult;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CountryUtils.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0006H\u0007J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/core/model/CountryUtils;", "", "<init>", "()V", "supportedBillingCountries", "", "", "getSupportedBillingCountries", "()Ljava/util/Set;", "CARD_POSTAL_CODE_COUNTRIES", "localizedCountries", "", "Lcom/stripe/android/core/model/Country;", "currentLocale", "Ljava/util/Locale;", "getDisplayCountry", "countryCode", "Lcom/stripe/android/core/model/CountryCode;", "getCountryCodeByName", "countryName", "getCountryByCode", "getOrderedCountries", "doesCountryUsePostalCode", "", "cachedCountriesLocale", "cachedOrderedLocalizedCountries", "getSortedLocalizedCountries", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CountryUtils {
    private static volatile Locale cachedCountriesLocale;
    public static final CountryUtils INSTANCE = new CountryUtils();
    private static final Set<String> supportedBillingCountries = SetsKt.setOf((Object[]) new String[]{"AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CV", "CW", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IS", "IT", "JE", "JM", "JO", "JP", "KE", ExpandedProductParsedResult.KILOGRAM, "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", ExpandedProductParsedResult.POUND, "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MK", "ML", "MM", "MN", "MO", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SZ", "TA", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VN", "VU", "WF", "WS", "XK", "YE", "YT", "ZA", "ZM", "ZW"});
    private static final Set<String> CARD_POSTAL_CODE_COUNTRIES = SetsKt.setOf((Object[]) new String[]{"US", "GB", "CA"});
    private static volatile List<Country> cachedOrderedLocalizedCountries = CollectionsKt.emptyList();

    private CountryUtils() {
    }

    public final Set<String> getSupportedBillingCountries() {
        return supportedBillingCountries;
    }

    private final List<Country> localizedCountries(Locale currentLocale) {
        Set<String> set = supportedBillingCountries;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        for (String str : set) {
            CountryCode countryCodeCreate = CountryCode.INSTANCE.create(str);
            String displayCountry = new Locale("", str).getDisplayCountry(currentLocale);
            Intrinsics.checkNotNullExpressionValue(displayCountry, "getDisplayCountry(...)");
            arrayList.add(new Country(countryCodeCreate, displayCountry));
        }
        return arrayList;
    }

    public final /* synthetic */ String getDisplayCountry(CountryCode countryCode, Locale currentLocale) {
        String name;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(currentLocale, "currentLocale");
        Country countryByCode = getCountryByCode(countryCode, currentLocale);
        if (countryByCode != null && (name = countryByCode.getName()) != null) {
            return name;
        }
        String displayCountry = new Locale("", countryCode.getValue()).getDisplayCountry(currentLocale);
        Intrinsics.checkNotNullExpressionValue(displayCountry, "getDisplayCountry(...)");
        return displayCountry;
    }

    public final /* synthetic */ CountryCode getCountryCodeByName(String countryName, Locale currentLocale) {
        Object next;
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        Intrinsics.checkNotNullParameter(currentLocale, "currentLocale");
        Iterator<T> it = getSortedLocalizedCountries(currentLocale).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Country) next).getName(), countryName)) {
                break;
            }
        }
        Country country = (Country) next;
        if (country != null) {
            return country.getCode();
        }
        return null;
    }

    public final /* synthetic */ Country getCountryByCode(CountryCode countryCode, Locale currentLocale) {
        Object next;
        Intrinsics.checkNotNullParameter(currentLocale, "currentLocale");
        Iterator<T> it = getSortedLocalizedCountries(currentLocale).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Country) next).getCode(), countryCode)) {
                break;
            }
        }
        return (Country) next;
    }

    public final /* synthetic */ List getOrderedCountries(Locale currentLocale) {
        Intrinsics.checkNotNullParameter(currentLocale, "currentLocale");
        return getSortedLocalizedCountries(currentLocale);
    }

    @Deprecated(message = "Use with parameter CountryCode", replaceWith = @ReplaceWith(expression = "CountryUtils.doesCountryUsePostalCode(CountryCode.create(countryCode))", imports = {"com.stripe.android.model.CountryCode"}))
    public final /* synthetic */ boolean doesCountryUsePostalCode(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Set<String> set = CARD_POSTAL_CODE_COUNTRIES;
        String upperCase = countryCode.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return set.contains(upperCase);
    }

    public final /* synthetic */ boolean doesCountryUsePostalCode(CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return CARD_POSTAL_CODE_COUNTRIES.contains(countryCode.getValue());
    }

    private final List<Country> getSortedLocalizedCountries(Locale currentLocale) {
        Object next;
        if (Intrinsics.areEqual(currentLocale, cachedCountriesLocale)) {
            return cachedOrderedLocalizedCountries;
        }
        List<Country> listLocalizedCountries = localizedCountries(currentLocale);
        final Collator collator = Collator.getInstance(currentLocale);
        List<Country> list = listLocalizedCountries;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Country) next).getCode(), CountryCodeKt.getCountryCode(currentLocale))) {
                break;
            }
        }
        List listListOfNotNull = CollectionsKt.listOfNotNull(next);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.areEqual(((Country) obj).getCode(), CountryCodeKt.getCountryCode(currentLocale))) {
                arrayList.add(obj);
            }
        }
        final Function2 function2 = new Function2() { // from class: com.stripe.android.core.model.CountryUtils$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return Integer.valueOf(CountryUtils.getSortedLocalizedCountries$lambda$5(collator, (Country) obj2, (Country) obj3));
            }
        };
        cachedOrderedLocalizedCountries = CollectionsKt.plus((Collection) listListOfNotNull, (Iterable) CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.stripe.android.core.model.CountryUtils$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return CountryUtils.getSortedLocalizedCountries$lambda$6(function2, obj2, obj3);
            }
        }));
        cachedCountriesLocale = currentLocale;
        return cachedOrderedLocalizedCountries;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getSortedLocalizedCountries$lambda$5(Collator collator, Country country, Country country2) {
        return collator.compare(country.getName(), country2.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getSortedLocalizedCountries$lambda$6(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }
}
