package com.stripe.android.uicore.elements;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.R;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.uicore.elements.DropdownConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdministrativeAreaConfig.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017¨\u0006 "}, d2 = {"Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;", "Lcom/stripe/android/uicore/elements/DropdownConfig;", "country", "Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;", "<init>", "(Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;)V", "shortAdministrativeAreaNames", "", "", "fullAdministrativeAreaNames", "mode", "Lcom/stripe/android/uicore/elements/DropdownConfig$Mode$Full;", "getMode", "()Lcom/stripe/android/uicore/elements/DropdownConfig$Mode$Full;", "debugLabel", "getDebugLabel", "()Ljava/lang/String;", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "getLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "rawItems", "getRawItems", "()Ljava/util/List;", "displayItems", "getDisplayItems", "getSelectedItemLabel", "index", "", "convertFromRaw", "rawValue", "Country", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdministrativeAreaConfig implements DropdownConfig {
    public static final int $stable = 8;
    private final String debugLabel;
    private final List<String> displayItems;
    private final List<String> fullAdministrativeAreaNames;
    private final ResolvableString label;
    private final DropdownConfig.Mode.Full mode;
    private final List<String> rawItems;
    private final List<String> shortAdministrativeAreaNames;

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public boolean getDisableDropdownWithSingleElement() {
        return DropdownConfig.DefaultImpls.getDisableDropdownWithSingleElement(this);
    }

    public AdministrativeAreaConfig(Country country) {
        Intrinsics.checkNotNullParameter(country, "country");
        List<Pair<String, String>> administrativeAreas = country.getAdministrativeAreas();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(administrativeAreas, 10));
        Iterator<T> it = administrativeAreas.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Pair) it.next()).getFirst());
        }
        this.shortAdministrativeAreaNames = arrayList;
        List<Pair<String, String>> administrativeAreas2 = country.getAdministrativeAreas();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(administrativeAreas2, 10));
        Iterator<T> it2 = administrativeAreas2.iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) ((Pair) it2.next()).getSecond());
        }
        ArrayList arrayList3 = arrayList2;
        this.fullAdministrativeAreaNames = arrayList3;
        this.mode = new DropdownConfig.Mode.Full(false);
        this.debugLabel = "administrativeArea";
        this.label = ResolvableStringUtilsKt.resolvableString$default(country.getLabel(), new Object[0], null, 4, null);
        this.rawItems = this.shortAdministrativeAreaNames;
        this.displayItems = arrayList3;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public DropdownConfig.Mode.Full getMode() {
        return this.mode;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public String getDebugLabel() {
        return this.debugLabel;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public ResolvableString getLabel() {
        return this.label;
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
        return this.fullAdministrativeAreaNames.get(index);
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public String convertFromRaw(String rawValue) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        if (this.shortAdministrativeAreaNames.contains(rawValue)) {
            return this.fullAdministrativeAreaNames.get(this.shortAdministrativeAreaNames.indexOf(rawValue));
        }
        return this.fullAdministrativeAreaNames.get(0);
    }

    /* compiled from: AdministrativeAreaConfig.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB+\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR&\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;", "", "label", "", "administrativeAreas", "", "Lkotlin/Pair;", "", "<init>", "(ILjava/util/List;)V", "getLabel", "()I", "getAdministrativeAreas", "()Ljava/util/List;", "Canada", "US", "Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;", "Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Country {
        public static final int $stable = 8;
        private final List<Pair<String, String>> administrativeAreas;
        private final int label;

        public /* synthetic */ Country(int i, List list, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, list);
        }

        private Country(int i, List<Pair<String, String>> list) {
            this.label = i;
            this.administrativeAreas = list;
        }

        public int getLabel() {
            return this.label;
        }

        public List<Pair<String, String>> getAdministrativeAreas() {
            return this.administrativeAreas;
        }

        /* compiled from: AdministrativeAreaConfig.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003J/\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR&\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;", "Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;", "label", "", "administrativeAreas", "", "Lkotlin/Pair;", "", "<init>", "(ILjava/util/List;)V", "getLabel", "()I", "getAdministrativeAreas", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Canada extends Country {
            public static final int $stable = 8;
            private final List<Pair<String, String>> administrativeAreas;
            private final int label;

            /* JADX WARN: Multi-variable type inference failed */
            public Canada() {
                this(0, null, 3, 0 == true ? 1 : 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Canada copy$default(Canada canada, int i, List list, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = canada.label;
                }
                if ((i2 & 2) != 0) {
                    list = canada.administrativeAreas;
                }
                return canada.copy(i, list);
            }

            /* renamed from: component1, reason: from getter */
            public final int getLabel() {
                return this.label;
            }

            public final List<Pair<String, String>> component2() {
                return this.administrativeAreas;
            }

            public final Canada copy(int label, List<Pair<String, String>> administrativeAreas) {
                Intrinsics.checkNotNullParameter(administrativeAreas, "administrativeAreas");
                return new Canada(label, administrativeAreas);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Canada)) {
                    return false;
                }
                Canada canada = (Canada) other;
                return this.label == canada.label && Intrinsics.areEqual(this.administrativeAreas, canada.administrativeAreas);
            }

            public int hashCode() {
                return (Integer.hashCode(this.label) * 31) + this.administrativeAreas.hashCode();
            }

            public String toString() {
                return "Canada(label=" + this.label + ", administrativeAreas=" + this.administrativeAreas + ")";
            }

            public /* synthetic */ Canada(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? R.string.stripe_address_label_province : i, (i2 & 2) != 0 ? CollectionsKt.listOf((Object[]) new Pair[]{new Pair("AB", "Alberta"), new Pair("BC", "British Columbia"), new Pair("MB", "Manitoba"), new Pair("NB", "New Brunswick"), new Pair("NL", "Newfoundland and Labrador"), new Pair("NT", "Northwest Territories"), new Pair("NS", "Nova Scotia"), new Pair("NU", "Nunavut"), new Pair("ON", "Ontario"), new Pair("PE", "Prince Edward Island"), new Pair("QC", "Quebec"), new Pair("SK", "Saskatchewan"), new Pair("YT", "Yukon")}) : list);
            }

            @Override // com.stripe.android.uicore.elements.AdministrativeAreaConfig.Country
            public int getLabel() {
                return this.label;
            }

            @Override // com.stripe.android.uicore.elements.AdministrativeAreaConfig.Country
            public List<Pair<String, String>> getAdministrativeAreas() {
                return this.administrativeAreas;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Canada(int i, List<Pair<String, String>> administrativeAreas) {
                super(i, administrativeAreas, null);
                Intrinsics.checkNotNullParameter(administrativeAreas, "administrativeAreas");
                this.label = i;
                this.administrativeAreas = administrativeAreas;
            }
        }

        /* compiled from: AdministrativeAreaConfig.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003J/\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR&\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;", "Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;", "label", "", "administrativeAreas", "", "Lkotlin/Pair;", "", "<init>", "(ILjava/util/List;)V", "getLabel", "()I", "getAdministrativeAreas", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class US extends Country {
            public static final int $stable = 8;
            private final List<Pair<String, String>> administrativeAreas;
            private final int label;

            /* JADX WARN: Multi-variable type inference failed */
            public US() {
                this(0, null, 3, 0 == true ? 1 : 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ US copy$default(US us, int i, List list, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = us.label;
                }
                if ((i2 & 2) != 0) {
                    list = us.administrativeAreas;
                }
                return us.copy(i, list);
            }

            /* renamed from: component1, reason: from getter */
            public final int getLabel() {
                return this.label;
            }

            public final List<Pair<String, String>> component2() {
                return this.administrativeAreas;
            }

            public final US copy(int label, List<Pair<String, String>> administrativeAreas) {
                Intrinsics.checkNotNullParameter(administrativeAreas, "administrativeAreas");
                return new US(label, administrativeAreas);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof US)) {
                    return false;
                }
                US us = (US) other;
                return this.label == us.label && Intrinsics.areEqual(this.administrativeAreas, us.administrativeAreas);
            }

            public int hashCode() {
                return (Integer.hashCode(this.label) * 31) + this.administrativeAreas.hashCode();
            }

            public String toString() {
                return "US(label=" + this.label + ", administrativeAreas=" + this.administrativeAreas + ")";
            }

            public /* synthetic */ US(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? R.string.stripe_address_label_state : i, (i2 & 2) != 0 ? CollectionsKt.listOf((Object[]) new Pair[]{new Pair("AL", "Alabama"), new Pair("AK", "Alaska"), new Pair("AS", "American Samoa"), new Pair("AZ", "Arizona"), new Pair("AR", "Arkansas"), new Pair("AA", "Armed Forces (AA)"), new Pair("AE", "Armed Forces (AE)"), new Pair("AP", "Armed Forces (AP)"), new Pair("CA", "California"), new Pair("CO", "Colorado"), new Pair("CT", "Connecticut"), new Pair("DE", "Delaware"), new Pair("DC", "District of Columbia"), new Pair("FL", "Florida"), new Pair("GA", "Georgia"), new Pair("GU", "Guam"), new Pair("HI", "Hawaii"), new Pair("ID", "Idaho"), new Pair("IL", "Illinois"), new Pair("IN", "Indiana"), new Pair("IA", "Iowa"), new Pair("KS", "Kansas"), new Pair("KY", "Kentucky"), new Pair("LA", "Louisiana"), new Pair("ME", "Maine"), new Pair("MH", "Marshal Islands"), new Pair("MD", "Maryland"), new Pair("MA", "Massachusetts"), new Pair("MI", "Michigan"), new Pair("FM", "Micronesia"), new Pair("MN", "Minnesota"), new Pair("MS", "Mississippi"), new Pair("MO", "Missouri"), new Pair("MT", "Montana"), new Pair("NE", "Nebraska"), new Pair("NV", "Nevada"), new Pair("NH", "New Hampshire"), new Pair("NJ", "New Jersey"), new Pair("NM", "New Mexico"), new Pair("NY", "New York"), new Pair("NC", "North Carolina"), new Pair("ND", "North Dakota"), new Pair("MP", "Northern Mariana Islands"), new Pair("OH", "Ohio"), new Pair("OK", "Oklahoma"), new Pair("OR", "Oregon"), new Pair("PW", "Palau"), new Pair("PA", "Pennsylvania"), new Pair("PR", "Puerto Rico"), new Pair("RI", "Rhode Island"), new Pair("SC", "South Carolina"), new Pair("SD", "South Dakota"), new Pair("TN", "Tennessee"), new Pair("TX", "Texas"), new Pair("UT", "Utah"), new Pair("VT", "Vermont"), new Pair("VI", "Virgin Islands"), new Pair("VA", "Virginia"), new Pair("WA", "Washington"), new Pair("WV", "West Virginia"), new Pair("WI", "Wisconsin"), new Pair("WY", "Wyoming")}) : list);
            }

            @Override // com.stripe.android.uicore.elements.AdministrativeAreaConfig.Country
            public int getLabel() {
                return this.label;
            }

            @Override // com.stripe.android.uicore.elements.AdministrativeAreaConfig.Country
            public List<Pair<String, String>> getAdministrativeAreas() {
                return this.administrativeAreas;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public US(int i, List<Pair<String, String>> administrativeAreas) {
                super(i, administrativeAreas, null);
                Intrinsics.checkNotNullParameter(administrativeAreas, "administrativeAreas");
                this.label = i;
                this.administrativeAreas = administrativeAreas;
            }
        }
    }
}
