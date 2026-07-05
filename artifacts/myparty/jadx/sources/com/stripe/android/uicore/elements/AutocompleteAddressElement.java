package com.stripe.android.uicore.elements;

import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.uicore.elements.AutocompleteAddressInteractor;
import com.stripe.android.uicore.forms.FormFieldEntry;
import expo.modules.notifications.service.NotificationsService;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AutocompleteAddressElement.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010/\u001a\u00020\u001aH\u0016J\u001e\u00100\u001a\u0002012\u0014\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0016J \u00103\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020605040 H\u0016J\u0014\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0003040 H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u0014X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010+\u001a\u0004\u0018\u00010,X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u00068"}, d2 = {"Lcom/stripe/android/uicore/elements/AutocompleteAddressElement;", "Lcom/stripe/android/uicore/elements/AddressFieldsElement;", NotificationsService.IDENTIFIER_KEY, "Lcom/stripe/android/uicore/elements/IdentifierSpec;", NamedConstantsKt.INITIAL_VALUES, "", "", "countryCodes", "", "countryDropdownFieldController", "Lcom/stripe/android/uicore/elements/DropdownFieldController;", "phoneNumberConfig", "Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;", "nameConfig", "sameAsShippingElement", "Lcom/stripe/android/uicore/elements/SameAsShippingElement;", "shippingValuesMap", "interactorFactory", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;", "hideCountry", "", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Ljava/util/Set;Lcom/stripe/android/uicore/elements/DropdownFieldController;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;Z)V", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "controller", "Lcom/stripe/android/uicore/elements/AutocompleteAddressController;", "getController", "()Lcom/stripe/android/uicore/elements/AutocompleteAddressController;", "controller$delegate", "Lkotlin/Lazy;", "addressController", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/uicore/elements/AddressController;", "getAddressController", "()Lkotlinx/coroutines/flow/StateFlow;", "countryElement", "Lcom/stripe/android/uicore/elements/CountryElement;", "getCountryElement", "()Lcom/stripe/android/uicore/elements/CountryElement;", "allowsUserInteraction", "getAllowsUserInteraction", "()Z", "mandateText", "Lcom/stripe/android/core/strings/ResolvableString;", "getMandateText", "()Lcom/stripe/android/core/strings/ResolvableString;", "sectionFieldErrorController", "setRawValue", "", "rawValuesMap", "getFormFieldValueFlow", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getTextFieldIdentifiers", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutocompleteAddressElement implements AddressFieldsElement {
    public static final int $stable = 8;
    private final StateFlow<AddressController> addressController;
    private final boolean allowsUserInteraction;

    /* renamed from: controller$delegate, reason: from kotlin metadata */
    private final Lazy controller;
    private final CountryElement countryElement;
    private final IdentifierSpec identifier;
    private final ResolvableString mandateText;

    public AutocompleteAddressElement(IdentifierSpec identifier, final Map<IdentifierSpec, String> initialValues, final Set<String> countryCodes, final DropdownFieldController countryDropdownFieldController, final AddressFieldConfiguration phoneNumberConfig, final AddressFieldConfiguration nameConfig, final SameAsShippingElement sameAsShippingElement, final Map<IdentifierSpec, String> map, final AutocompleteAddressInteractor.Factory interactorFactory, final boolean z) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(initialValues, "initialValues");
        Intrinsics.checkNotNullParameter(countryCodes, "countryCodes");
        Intrinsics.checkNotNullParameter(countryDropdownFieldController, "countryDropdownFieldController");
        Intrinsics.checkNotNullParameter(phoneNumberConfig, "phoneNumberConfig");
        Intrinsics.checkNotNullParameter(nameConfig, "nameConfig");
        Intrinsics.checkNotNullParameter(interactorFactory, "interactorFactory");
        this.identifier = identifier;
        this.controller = LazyKt.lazy(new Function0() { // from class: com.stripe.android.uicore.elements.AutocompleteAddressElement$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AutocompleteAddressElement.controller_delegate$lambda$0(this.f$0, initialValues, interactorFactory, countryCodes, countryDropdownFieldController, phoneNumberConfig, nameConfig, sameAsShippingElement, map, z);
            }
        });
        this.addressController = getController().getAddressController();
        this.countryElement = getController().getCountryElement();
        this.allowsUserInteraction = true;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AutocompleteAddressElement(IdentifierSpec identifierSpec, Map map, Set set, DropdownFieldController dropdownFieldController, AddressFieldConfiguration addressFieldConfiguration, AddressFieldConfiguration addressFieldConfiguration2, SameAsShippingElement sameAsShippingElement, Map map2, AutocompleteAddressInteractor.Factory factory, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Set setEmptySet = (i & 4) != 0 ? SetsKt.emptySet() : set;
        this(identifierSpec, map, setEmptySet, (i & 8) != 0 ? new DropdownFieldController(new CountryConfig(setEmptySet, null, null, false, null, null, 62, null), (String) map.get(IdentifierSpec.INSTANCE.getCountry())) : dropdownFieldController, (i & 16) != 0 ? AddressFieldConfiguration.HIDDEN : addressFieldConfiguration, (i & 32) != 0 ? AddressFieldConfiguration.HIDDEN : addressFieldConfiguration2, sameAsShippingElement, map2, factory, (i & 512) != 0 ? false : z);
    }

    private final AutocompleteAddressController getController() {
        return (AutocompleteAddressController) this.controller.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AutocompleteAddressController controller_delegate$lambda$0(AutocompleteAddressElement autocompleteAddressElement, Map map, AutocompleteAddressInteractor.Factory factory, Set set, DropdownFieldController dropdownFieldController, AddressFieldConfiguration addressFieldConfiguration, AddressFieldConfiguration addressFieldConfiguration2, SameAsShippingElement sameAsShippingElement, Map map2, boolean z) {
        return new AutocompleteAddressController(autocompleteAddressElement.getIdentifier(), map, factory, set, dropdownFieldController, addressFieldConfiguration, addressFieldConfiguration2, sameAsShippingElement, map2, z);
    }

    @Override // com.stripe.android.uicore.elements.AddressFieldsElement
    public StateFlow<AddressController> getAddressController() {
        return this.addressController;
    }

    @Override // com.stripe.android.uicore.elements.AddressFieldsElement
    public CountryElement getCountryElement() {
        return this.countryElement;
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
    public AutocompleteAddressController sectionFieldErrorController() {
        return getController();
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public void setRawValue(Map<IdentifierSpec, String> rawValuesMap) {
        Intrinsics.checkNotNullParameter(rawValuesMap, "rawValuesMap");
        getController().getAddressElementFlow().getValue().setRawValue(rawValuesMap);
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        return getController().getFormFieldValues();
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public StateFlow<List<IdentifierSpec>> getTextFieldIdentifiers() {
        return getController().getTextFieldIdentifiers();
    }
}
