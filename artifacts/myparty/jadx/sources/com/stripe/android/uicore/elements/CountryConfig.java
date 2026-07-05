package com.stripe.android.uicore.elements;

import com.stripe.android.core.R;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.uicore.elements.DropdownConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CountryConfig.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-Ba\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\f\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0004H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0!X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040!X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040!X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#¨\u0006."}, d2 = {"Lcom/stripe/android/uicore/elements/CountryConfig;", "Lcom/stripe/android/uicore/elements/DropdownConfig;", "onlyShowCountryCodes", "", "", "locale", "Ljava/util/Locale;", "mode", "Lcom/stripe/android/uicore/elements/DropdownConfig$Mode;", "disableDropdownWithSingleElement", "", "collapsedLabelMapper", "Lkotlin/Function1;", "Lcom/stripe/android/core/model/Country;", "expandedLabelMapper", "<init>", "(Ljava/util/Set;Ljava/util/Locale;Lcom/stripe/android/uicore/elements/DropdownConfig$Mode;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getOnlyShowCountryCodes", "()Ljava/util/Set;", "getLocale", "()Ljava/util/Locale;", "getMode", "()Lcom/stripe/android/uicore/elements/DropdownConfig$Mode;", "getDisableDropdownWithSingleElement", "()Z", "debugLabel", "getDebugLabel", "()Ljava/lang/String;", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "getLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "countries", "", "getCountries$stripe_ui_core_release", "()Ljava/util/List;", "rawItems", "getRawItems", "displayItems", "getDisplayItems", "getSelectedItemLabel", "index", "", "convertFromRaw", "rawValue", "Companion", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CountryConfig implements DropdownConfig {
    private final Function1<Country, String> collapsedLabelMapper;
    private final List<Country> countries;
    private final String debugLabel;
    private final boolean disableDropdownWithSingleElement;
    private final List<String> displayItems;
    private final ResolvableString label;
    private final Locale locale;
    private final DropdownConfig.Mode mode;
    private final Set<String> onlyShowCountryCodes;
    private final List<String> rawItems;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public CountryConfig() {
        this(null, null, null, false, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CountryConfig(Set<String> onlyShowCountryCodes, Locale locale, DropdownConfig.Mode mode, boolean z, Function1<? super Country, String> collapsedLabelMapper, Function1<? super Country, String> expandedLabelMapper) {
        Intrinsics.checkNotNullParameter(onlyShowCountryCodes, "onlyShowCountryCodes");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(collapsedLabelMapper, "collapsedLabelMapper");
        Intrinsics.checkNotNullParameter(expandedLabelMapper, "expandedLabelMapper");
        this.onlyShowCountryCodes = onlyShowCountryCodes;
        this.locale = locale;
        this.mode = mode;
        this.disableDropdownWithSingleElement = z;
        this.collapsedLabelMapper = collapsedLabelMapper;
        this.debugLabel = "country";
        this.label = ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_address_label_country_or_region, new Object[0], null, 4, null);
        List orderedCountries = CountryUtils.INSTANCE.getOrderedCountries(locale);
        ArrayList arrayList = new ArrayList();
        for (Object obj : orderedCountries) {
            Country country = (Country) obj;
            if (this.onlyShowCountryCodes.isEmpty() || this.onlyShowCountryCodes.contains(country.getCode().getValue())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        this.countries = arrayList2;
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(((Country) it.next()).getCode().getValue());
        }
        this.rawItems = arrayList4;
        List<Country> list = this.countries;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList5.add(expandedLabelMapper.invoke(it2.next()));
        }
        this.displayItems = arrayList5;
    }

    public /* synthetic */ CountryConfig(Set set, Locale locale, DropdownConfig.Mode.Full full, boolean z, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SetsKt.emptySet() : set, (i & 2) != 0 ? Locale.getDefault() : locale, (i & 4) != 0 ? new DropdownConfig.Mode.Full(false, 1, null) : full, (i & 8) != 0 ? false : z, (i & 16) != 0 ? new Function1() { // from class: com.stripe.android.uicore.elements.CountryConfig$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CountryConfig._init_$lambda$0((Country) obj);
            }
        } : function1, (i & 32) != 0 ? new Function1() { // from class: com.stripe.android.uicore.elements.CountryConfig$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CountryConfig._init_$lambda$1((Country) obj);
            }
        } : function12);
    }

    public final Set<String> getOnlyShowCountryCodes() {
        return this.onlyShowCountryCodes;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public DropdownConfig.Mode getMode() {
        return this.mode;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public boolean getDisableDropdownWithSingleElement() {
        return this.disableDropdownWithSingleElement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(Country country) {
        Intrinsics.checkNotNullParameter(country, "country");
        return country.getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$1(Country country) {
        Intrinsics.checkNotNullParameter(country, "country");
        return INSTANCE.countryCodeToEmoji$stripe_ui_core_release(country.getCode().getValue()) + " " + country.getName();
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public String getDebugLabel() {
        return this.debugLabel;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public ResolvableString getLabel() {
        return this.label;
    }

    public final List<Country> getCountries$stripe_ui_core_release() {
        return this.countries;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public List<String> getRawItems() {
        return this.rawItems;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public List<String> getDisplayItems() {
        return this.displayItems;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public String getSelectedItemLabel(int index) {
        String strInvoke;
        Country country = (Country) CollectionsKt.getOrNull(this.countries, index);
        return (country == null || (strInvoke = this.collapsedLabelMapper.invoke(country)) == null) ? "" : strInvoke;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public String convertFromRaw(String rawValue) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        CountryUtils countryUtils = CountryUtils.INSTANCE;
        CountryCode countryCodeCreate = CountryCode.INSTANCE.create(rawValue);
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        Country countryByCode = countryUtils.getCountryByCode(countryCodeCreate, locale);
        if (countryByCode != null) {
            Integer numValueOf = Integer.valueOf(this.countries.indexOf(countryByCode));
            if (numValueOf.intValue() == -1) {
                numValueOf = null;
            }
            String str = numValueOf != null ? getDisplayItems().get(numValueOf.intValue()) : null;
            if (str != null) {
                return str;
            }
        }
        String str2 = (String) CollectionsKt.firstOrNull((List) getDisplayItems());
        return str2 == null ? "" : str2;
    }

    /* compiled from: CountryConfig.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/uicore/elements/CountryConfig$Companion;", "", "<init>", "()V", "countryCodeToEmoji", "", "countryCode", "countryCodeToEmoji$stripe_ui_core_release", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String countryCodeToEmoji$stripe_ui_core_release(String countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            if (countryCode.length() != 2) {
                return "🌐";
            }
            String str = countryCode;
            int iCodePointAt = Character.codePointAt(str, 0) - (-127397);
            int iCodePointAt2 = Character.codePointAt(str, 1) - (-127397);
            char[] chars = Character.toChars(iCodePointAt);
            Intrinsics.checkNotNullExpressionValue(chars, "toChars(...)");
            char[] chars2 = Character.toChars(iCodePointAt2);
            Intrinsics.checkNotNullExpressionValue(chars2, "toChars(...)");
            return new String(ArraysKt.plus(chars, chars2));
        }
    }
}
