package com.stripe.android.uicore.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.uicore.elements.AddressInputMode;
import com.stripe.android.uicore.elements.AutocompleteAddressInteractor;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import com.stripe.android.uicore.utils.StateFlowsKt;
import expo.modules.notifications.service.NotificationsService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: AutocompleteAddressController.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J&\u00109\u001a\u00020,2\u0014\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010;\u001a\u00020<H\u0002J&\u0010=\u001a\u00020<2\u0006\u0010 \u001a\u00020\u00152\u0014\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002J\u0016\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002J=\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u00152\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\b\u0010G\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0002\u0010HR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\"X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R)\u0010/\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020201000\"¢\u0006\b\n\u0000\u001a\u0004\b3\u0010%R\u001d\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0004000\"¢\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0017\u00106\u001a\b\u0012\u0004\u0012\u0002070\"¢\u0006\b\n\u0000\u001a\u0004\b8\u0010%¨\u0006I²\u0006\n\u0010J\u001a\u000207X\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/uicore/elements/AutocompleteAddressController;", "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;", "Lcom/stripe/android/uicore/elements/SectionFieldComposable;", NotificationsService.IDENTIFIER_KEY, "Lcom/stripe/android/uicore/elements/IdentifierSpec;", NamedConstantsKt.INITIAL_VALUES, "", "", "interactorFactory", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;", "countryCodes", "", "countryDropdownFieldController", "Lcom/stripe/android/uicore/elements/DropdownFieldController;", "phoneNumberConfig", "Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;", "nameConfig", "sameAsShippingElement", "Lcom/stripe/android/uicore/elements/SameAsShippingElement;", "shippingValuesMap", "hideCountry", "", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;Ljava/util/Set;Lcom/stripe/android/uicore/elements/DropdownFieldController;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;Z)V", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getInitialValues", "()Ljava/util/Map;", "interactor", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;", "config", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;", "expandForm", "error", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/uicore/elements/FieldError;", "getError", "()Lkotlinx/coroutines/flow/StateFlow;", "countryElement", "Lcom/stripe/android/uicore/elements/CountryElement;", "getCountryElement", "()Lcom/stripe/android/uicore/elements/CountryElement;", "addressElementFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/uicore/elements/AddressElement;", "getAddressElementFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "formFieldValues", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValues", "textFieldIdentifiers", "getTextFieldIdentifiers", "addressController", "Lcom/stripe/android/uicore/elements/AddressController;", "getAddressController", "createAddressElement", "values", "addressInputMode", "Lcom/stripe/android/uicore/elements/AddressInputMode;", "toAddressInputMode", "getCurrentValues", "ComposeUI", "", ViewProps.ENABLED, "field", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "modifier", "Landroidx/compose/ui/Modifier;", "hiddenIdentifiers", "lastTextFieldIdentifier", "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V", "stripe-ui-core_release", "controller"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutocompleteAddressController implements SectionFieldErrorController, SectionFieldComposable {
    public static final int $stable = 8;
    private final StateFlow<AddressController> addressController;
    private final MutableStateFlow<AddressElement> addressElementFlow;
    private final AutocompleteAddressInteractor.Config config;
    private final DropdownFieldController countryDropdownFieldController;
    private final CountryElement countryElement;
    private final StateFlow<FieldError> error;
    private boolean expandForm;
    private final StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> formFieldValues;
    private final boolean hideCountry;
    private final IdentifierSpec identifier;
    private final Map<IdentifierSpec, String> initialValues;
    private final AutocompleteAddressInteractor interactor;
    private final AddressFieldConfiguration nameConfig;
    private final AddressFieldConfiguration phoneNumberConfig;
    private final SameAsShippingElement sameAsShippingElement;
    private final Map<IdentifierSpec, String> shippingValuesMap;
    private final StateFlow<List<IdentifierSpec>> textFieldIdentifiers;

    public AutocompleteAddressController(IdentifierSpec identifier, Map<IdentifierSpec, String> initialValues, AutocompleteAddressInteractor.Factory interactorFactory, Set<String> countryCodes, DropdownFieldController countryDropdownFieldController, AddressFieldConfiguration phoneNumberConfig, AddressFieldConfiguration nameConfig, SameAsShippingElement sameAsShippingElement, Map<IdentifierSpec, String> map, boolean z) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(initialValues, "initialValues");
        Intrinsics.checkNotNullParameter(interactorFactory, "interactorFactory");
        Intrinsics.checkNotNullParameter(countryCodes, "countryCodes");
        Intrinsics.checkNotNullParameter(countryDropdownFieldController, "countryDropdownFieldController");
        Intrinsics.checkNotNullParameter(phoneNumberConfig, "phoneNumberConfig");
        Intrinsics.checkNotNullParameter(nameConfig, "nameConfig");
        this.identifier = identifier;
        this.initialValues = initialValues;
        this.countryDropdownFieldController = countryDropdownFieldController;
        this.phoneNumberConfig = phoneNumberConfig;
        this.nameConfig = nameConfig;
        this.sameAsShippingElement = sameAsShippingElement;
        this.shippingValuesMap = map;
        this.hideCountry = z;
        AutocompleteAddressInteractor autocompleteAddressInteractorCreate = interactorFactory.create();
        this.interactor = autocompleteAddressInteractorCreate;
        this.config = autocompleteAddressInteractorCreate.getAutocompleteConfig();
        this.error = StateFlowsKt.stateFlowOf(null);
        this.countryElement = new CountryElement(IdentifierSpec.INSTANCE.getCountry(), countryDropdownFieldController);
        MutableStateFlow<AddressElement> MutableStateFlow = StateFlowKt.MutableStateFlow(createAddressElement(initialValues, toAddressInputMode(this.expandForm, initialValues)));
        this.addressElementFlow = MutableStateFlow;
        this.formFieldValues = StateFlowsKt.flatMapLatestAsStateFlow(MutableStateFlow, new Function1() { // from class: com.stripe.android.uicore.elements.AutocompleteAddressController$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutocompleteAddressController.formFieldValues$lambda$0((AddressElement) obj);
            }
        });
        this.textFieldIdentifiers = StateFlowsKt.flatMapLatestAsStateFlow(MutableStateFlow, new Function1() { // from class: com.stripe.android.uicore.elements.AutocompleteAddressController$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutocompleteAddressController.textFieldIdentifiers$lambda$1((AddressElement) obj);
            }
        });
        this.addressController = StateFlowsKt.flatMapLatestAsStateFlow(MutableStateFlow, new Function1() { // from class: com.stripe.android.uicore.elements.AutocompleteAddressController$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutocompleteAddressController.addressController$lambda$2((AddressElement) obj);
            }
        });
        autocompleteAddressInteractorCreate.register(new Function1() { // from class: com.stripe.android.uicore.elements.AutocompleteAddressController$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutocompleteAddressController._init_$lambda$4(this.f$0, (AutocompleteAddressInteractor.Event) obj);
            }
        });
    }

    public final IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    public final Map<IdentifierSpec, String> getInitialValues() {
        return this.initialValues;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AutocompleteAddressController(IdentifierSpec identifierSpec, Map map, AutocompleteAddressInteractor.Factory factory, Set set, DropdownFieldController dropdownFieldController, AddressFieldConfiguration addressFieldConfiguration, AddressFieldConfiguration addressFieldConfiguration2, SameAsShippingElement sameAsShippingElement, Map map2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Set setEmptySet = (i & 8) != 0 ? SetsKt.emptySet() : set;
        this(identifierSpec, map, factory, setEmptySet, (i & 16) != 0 ? new DropdownFieldController(new CountryConfig(setEmptySet, null, null, false, null, null, 62, null), (String) map.get(IdentifierSpec.INSTANCE.getCountry())) : dropdownFieldController, addressFieldConfiguration, addressFieldConfiguration2, sameAsShippingElement, map2, (i & 512) != 0 ? false : z);
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldErrorController
    public StateFlow<FieldError> getError() {
        return this.error;
    }

    public final CountryElement getCountryElement() {
        return this.countryElement;
    }

    public final MutableStateFlow<AddressElement> getAddressElementFlow() {
        return this.addressElementFlow;
    }

    public final StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValues() {
        return this.formFieldValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateFlow formFieldValues$lambda$0(AddressElement addressElement) {
        Intrinsics.checkNotNullParameter(addressElement, "addressElement");
        return addressElement.getFormFieldValueFlow();
    }

    public final StateFlow<List<IdentifierSpec>> getTextFieldIdentifiers() {
        return this.textFieldIdentifiers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateFlow textFieldIdentifiers$lambda$1(AddressElement addressElement) {
        Intrinsics.checkNotNullParameter(addressElement, "addressElement");
        return addressElement.getTextFieldIdentifiers();
    }

    public final StateFlow<AddressController> getAddressController() {
        return this.addressController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateFlow addressController$lambda$2(AddressElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getAddressController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$4(AutocompleteAddressController autocompleteAddressController, AutocompleteAddressInteractor.Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Map<IdentifierSpec, String> currentValues = autocompleteAddressController.getCurrentValues();
        Map<IdentifierSpec, String> values = event.getValues();
        if (values == null) {
            values = currentValues;
        }
        if (!(event instanceof AutocompleteAddressInteractor.Event.OnValues)) {
            if (!(event instanceof AutocompleteAddressInteractor.Event.OnExpandForm)) {
                throw new NoWhenBranchMatchedException();
            }
            autocompleteAddressController.expandForm = true;
        }
        AddressInputMode addressInputMode = autocompleteAddressController.toAddressInputMode(autocompleteAddressController.expandForm, values);
        if (!Intrinsics.areEqual(currentValues, values) || !Intrinsics.areEqual(addressInputMode, autocompleteAddressController.addressElementFlow.getValue().getAddressInputMode())) {
            String str = values.get(IdentifierSpec.INSTANCE.getCountry());
            if (str != null) {
                autocompleteAddressController.countryDropdownFieldController.onRawValueChange(str);
            }
            autocompleteAddressController.addressElementFlow.setValue(autocompleteAddressController.createAddressElement(values, autocompleteAddressController.toAddressInputMode(autocompleteAddressController.expandForm, values)));
        }
        return Unit.INSTANCE;
    }

    private final AddressElement createAddressElement(Map<IdentifierSpec, String> values, AddressInputMode addressInputMode) {
        return new AddressElement(this.identifier, values, addressInputMode, null, this.countryElement, this.sameAsShippingElement, this.shippingValuesMap, this.config.getIsPlacesAvailable(), this.hideCountry, 8, null);
    }

    private final AddressInputMode toAddressInputMode(boolean expandForm, Map<IdentifierSpec, String> values) {
        String googlePlacesApiKey = this.config.getGooglePlacesApiKey();
        if (googlePlacesApiKey == null) {
            return new AddressInputMode.NoAutocomplete(this.phoneNumberConfig, this.nameConfig);
        }
        if (expandForm || values.get(IdentifierSpec.INSTANCE.getLine1()) != null) {
            return new AddressInputMode.AutocompleteExpanded(googlePlacesApiKey, this.config.getAutocompleteCountries(), this.phoneNumberConfig, this.nameConfig, new Function0() { // from class: com.stripe.android.uicore.elements.AutocompleteAddressController$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AutocompleteAddressController.toAddressInputMode$lambda$5(this.f$0);
                }
            });
        }
        return new AddressInputMode.AutocompleteCondensed(googlePlacesApiKey, this.config.getAutocompleteCountries(), this.phoneNumberConfig, this.nameConfig, new Function0() { // from class: com.stripe.android.uicore.elements.AutocompleteAddressController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AutocompleteAddressController.toAddressInputMode$lambda$6(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toAddressInputMode$lambda$5(AutocompleteAddressController autocompleteAddressController) {
        AutocompleteAddressInteractor autocompleteAddressInteractor = autocompleteAddressController.interactor;
        String value = autocompleteAddressController.countryDropdownFieldController.getRawFieldValue().getValue();
        if (value == null) {
            value = "";
        }
        autocompleteAddressInteractor.onAutocomplete(value);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toAddressInputMode$lambda$6(AutocompleteAddressController autocompleteAddressController) {
        AutocompleteAddressInteractor autocompleteAddressInteractor = autocompleteAddressController.interactor;
        String value = autocompleteAddressController.countryDropdownFieldController.getRawFieldValue().getValue();
        if (value == null) {
            value = "";
        }
        autocompleteAddressInteractor.onAutocomplete(value);
        return Unit.INSTANCE;
    }

    private final Map<IdentifierSpec, String> getCurrentValues() {
        Map map = MapsKt.toMap(this.formFieldValues.getValue());
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((FormFieldEntry) entry.getValue()).getValue());
        }
        return linkedHashMap;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldComposable
    public void ComposeUI(boolean z, SectionFieldElement field, Modifier modifier, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
        composer.startReplaceGroup(1686156249);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1686156249, i, -1, "com.stripe.android.uicore.elements.AutocompleteAddressController.ComposeUI (AutocompleteAddressController.kt:142)");
        }
        int i2 = i >> 3;
        AddressElementUIKt.AddressElementUI(z, ComposeUI$lambda$8(StateFlowsComposeKt.collectAsState(this.addressController, null, composer, 0, 1)), hiddenIdentifiers, identifierSpec, modifier, composer, (i & 14) | (AddressController.$stable << 3) | (i2 & 896) | (i2 & 7168) | ((i << 6) & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    private static final AddressController ComposeUI$lambda$8(State<AddressController> state) {
        return state.getValue();
    }
}
