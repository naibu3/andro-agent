package com.stripe.android.ui.core.elements;

import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.ui.core.BillingDetailsCollectionConfiguration;
import com.stripe.android.uicore.address.FieldType;
import com.stripe.android.uicore.elements.AddressController;
import com.stripe.android.uicore.elements.AddressElement;
import com.stripe.android.uicore.elements.AddressFieldsElement;
import com.stripe.android.uicore.elements.AddressInputMode;
import com.stripe.android.uicore.elements.AutocompleteAddressElement;
import com.stripe.android.uicore.elements.AutocompleteAddressInteractor;
import com.stripe.android.uicore.elements.CountryConfig;
import com.stripe.android.uicore.elements.CountryElement;
import com.stripe.android.uicore.elements.DropdownFieldController;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SameAsShippingElement;
import com.stripe.android.uicore.elements.SectionFieldErrorController;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.uicore.utils.StateFlowsKt;
import expo.modules.notifications.service.NotificationsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CardBillingAddressElement.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J \u0010*\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020-0,0+0\u0018H\u0016J\b\u0010.\u001a\u00020/H\u0016J\u001e\u00100\u001a\u0002012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0016J\u0014\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030+0\u0018H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u0018¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0014\u0010\"\u001a\u00020#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010&\u001a\u0004\u0018\u00010'X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u00063"}, d2 = {"Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;", "Lcom/stripe/android/uicore/elements/AddressFieldsElement;", NotificationsService.IDENTIFIER_KEY, "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "rawValuesMap", "", "", "countryCodes", "", "countryDropdownFieldController", "Lcom/stripe/android/uicore/elements/DropdownFieldController;", "autocompleteAddressInteractorFactory", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;", "sameAsShippingElement", "Lcom/stripe/android/uicore/elements/SameAsShippingElement;", "shippingValuesMap", "collectionMode", "Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Ljava/util/Set;Lcom/stripe/android/uicore/elements/DropdownFieldController;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;)V", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "addressElement", "addressController", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/uicore/elements/AddressController;", "getAddressController", "()Lkotlinx/coroutines/flow/StateFlow;", "countryElement", "Lcom/stripe/android/uicore/elements/CountryElement;", "getCountryElement", "()Lcom/stripe/android/uicore/elements/CountryElement;", "hiddenIdentifiers", "getHiddenIdentifiers", "allowsUserInteraction", "", "getAllowsUserInteraction", "()Z", "mandateText", "Lcom/stripe/android/core/strings/ResolvableString;", "getMandateText", "()Lcom/stripe/android/core/strings/ResolvableString;", "getFormFieldValueFlow", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "sectionFieldErrorController", "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;", "setRawValue", "", "getTextFieldIdentifiers", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CardBillingAddressElement implements AddressFieldsElement {
    public static final int $stable = 8;
    private final StateFlow<AddressController> addressController;
    private final AddressFieldsElement addressElement;
    private final boolean allowsUserInteraction;
    private final BillingDetailsCollectionConfiguration.AddressCollectionMode collectionMode;
    private final CountryElement countryElement;
    private final StateFlow<Set<IdentifierSpec>> hiddenIdentifiers;
    private final IdentifierSpec identifier;
    private final ResolvableString mandateText;

    /* compiled from: CardBillingAddressElement.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BillingDetailsCollectionConfiguration.AddressCollectionMode.values().length];
            try {
                iArr[BillingDetailsCollectionConfiguration.AddressCollectionMode.Never.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BillingDetailsCollectionConfiguration.AddressCollectionMode.Full.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BillingDetailsCollectionConfiguration.AddressCollectionMode.Automatic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CardBillingAddressElement(IdentifierSpec identifier, Map<IdentifierSpec, String> rawValuesMap, Set<String> countryCodes, DropdownFieldController countryDropdownFieldController, AutocompleteAddressInteractor.Factory factory, SameAsShippingElement sameAsShippingElement, Map<IdentifierSpec, String> map, BillingDetailsCollectionConfiguration.AddressCollectionMode collectionMode) {
        DropdownFieldController dropdownFieldController;
        AddressElement addressElement;
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(rawValuesMap, "rawValuesMap");
        Intrinsics.checkNotNullParameter(countryCodes, "countryCodes");
        Intrinsics.checkNotNullParameter(countryDropdownFieldController, "countryDropdownFieldController");
        Intrinsics.checkNotNullParameter(collectionMode, "collectionMode");
        this.identifier = identifier;
        this.collectionMode = collectionMode;
        if (factory != null) {
            AutocompleteAddressInteractor.Factory factory2 = collectionMode == BillingDetailsCollectionConfiguration.AddressCollectionMode.Full ? factory : null;
            if (factory2 != null) {
                dropdownFieldController = countryDropdownFieldController;
                addressElement = new AutocompleteAddressElement(getIdentifier(), rawValuesMap, countryCodes, countryDropdownFieldController, null, null, sameAsShippingElement, map, factory2, false, 560, null);
            }
        } else {
            dropdownFieldController = countryDropdownFieldController;
            addressElement = new AddressElement(getIdentifier(), rawValuesMap, new AddressInputMode.NoAutocomplete(null, null, 3, null), countryCodes, new CountryElement(IdentifierSpec.INSTANCE.getCountry(), dropdownFieldController), sameAsShippingElement, map, false, false, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, null);
        }
        this.addressElement = addressElement;
        this.addressController = addressElement.getAddressController();
        this.countryElement = addressElement.getCountryElement();
        this.hiddenIdentifiers = StateFlowsKt.mapAsStateFlow(dropdownFieldController.getRawFieldValue(), new Function1() { // from class: com.stripe.android.ui.core.elements.CardBillingAddressElement$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardBillingAddressElement.hiddenIdentifiers$lambda$8(this.f$0, (String) obj);
            }
        });
        this.allowsUserInteraction = addressElement.getAllowsUserInteraction();
        this.mandateText = addressElement.getMandateText();
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    public /* synthetic */ CardBillingAddressElement(IdentifierSpec identifierSpec, Map map, Set set, DropdownFieldController dropdownFieldController, AutocompleteAddressInteractor.Factory factory, SameAsShippingElement sameAsShippingElement, Map map2, BillingDetailsCollectionConfiguration.AddressCollectionMode addressCollectionMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Set set2;
        DropdownFieldController dropdownFieldController2;
        Map mapEmptyMap = (i & 2) != 0 ? MapsKt.emptyMap() : map;
        Set setEmptySet = (i & 4) != 0 ? SetsKt.emptySet() : set;
        if ((i & 8) != 0) {
            set2 = setEmptySet;
            dropdownFieldController2 = new DropdownFieldController(new CountryConfig(set2, null, null, false, null, null, 62, null), (String) mapEmptyMap.get(IdentifierSpec.INSTANCE.getCountry()));
        } else {
            set2 = setEmptySet;
            dropdownFieldController2 = dropdownFieldController;
        }
        this(identifierSpec, mapEmptyMap, set2, dropdownFieldController2, factory, sameAsShippingElement, map2, (i & 128) != 0 ? BillingDetailsCollectionConfiguration.AddressCollectionMode.Automatic : addressCollectionMode);
    }

    @Override // com.stripe.android.uicore.elements.AddressFieldsElement
    public StateFlow<AddressController> getAddressController() {
        return this.addressController;
    }

    @Override // com.stripe.android.uicore.elements.AddressFieldsElement
    public CountryElement getCountryElement() {
        return this.countryElement;
    }

    public final StateFlow<Set<IdentifierSpec>> getHiddenIdentifiers() {
        return this.hiddenIdentifiers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set hiddenIdentifiers$lambda$8(CardBillingAddressElement cardBillingAddressElement, String str) {
        int iHashCode;
        int i = WhenMappings.$EnumSwitchMapping$0[cardBillingAddressElement.collectionMode.ordinal()];
        if (i == 1) {
            EnumEntries<FieldType> entries = FieldType.getEntries();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
            Iterator<FieldType> it = entries.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getIdentifierSpec());
            }
            return CollectionsKt.toSet(arrayList);
        }
        if (i == 2) {
            return SetsKt.emptySet();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (str != null && ((iHashCode = str.hashCode()) == 2142 ? str.equals("CA") : !(iHashCode == 2267 ? !str.equals("GB") : !(iHashCode == 2718 && str.equals("US"))))) {
            EnumEntries<FieldType> entries2 = FieldType.getEntries();
            ArrayList arrayList2 = new ArrayList();
            for (FieldType fieldType : entries2) {
                FieldType fieldType2 = fieldType;
                if (fieldType2 != FieldType.PostalCode && fieldType2 != FieldType.Name) {
                    arrayList2.add(fieldType);
                }
            }
            ArrayList arrayList3 = arrayList2;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((FieldType) it2.next()).getIdentifierSpec());
            }
            return CollectionsKt.toSet(arrayList4);
        }
        EnumEntries<FieldType> entries3 = FieldType.getEntries();
        ArrayList arrayList5 = new ArrayList();
        for (FieldType fieldType3 : entries3) {
            if (fieldType3 != FieldType.Name) {
                arrayList5.add(fieldType3);
            }
        }
        ArrayList arrayList6 = arrayList5;
        ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
        Iterator it3 = arrayList6.iterator();
        while (it3.hasNext()) {
            arrayList7.add(((FieldType) it3.next()).getIdentifierSpec());
        }
        return CollectionsKt.toSet(arrayList7);
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public boolean getAllowsUserInteraction() {
        return this.allowsUserInteraction;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public ResolvableString getMandateText() {
        return this.mandateText;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        return this.addressElement.getFormFieldValueFlow();
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public SectionFieldErrorController sectionFieldErrorController() {
        return this.addressElement.sectionFieldErrorController();
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public void setRawValue(Map<IdentifierSpec, String> rawValuesMap) {
        Intrinsics.checkNotNullParameter(rawValuesMap, "rawValuesMap");
        this.addressElement.setRawValue(rawValuesMap);
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public StateFlow<List<IdentifierSpec>> getTextFieldIdentifiers() {
        return this.addressElement.getTextFieldIdentifiers();
    }
}
