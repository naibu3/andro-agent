package com.stripe.android.paymentsheet.addresselement;

import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.paymentsheet.addresselement.AddressLauncher;
import com.stripe.android.uicore.elements.AddressFieldConfiguration;
import com.stripe.android.uicore.elements.AutocompleteAddressElement;
import com.stripe.android.uicore.elements.AutocompleteAddressInteractor;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SectionElement;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.uicore.utils.StateFlowsKt;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AddressFormController.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001b0\u0003J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001b0\u00030\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR%\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00030\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001a¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001d¨\u0006'"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressFormController;", "", NamedConstantsKt.INITIAL_VALUES, "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", "config", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;", "interactor", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;", "<init>", "(Ljava/util/Map;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;)V", "getInitialValues", "()Ljava/util/Map;", "getConfig", "()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;", "getInteractor", "()Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;", "autocompleteAddressElement", "Lcom/stripe/android/uicore/elements/AutocompleteAddressElement;", "elements", "", "Lcom/stripe/android/uicore/elements/FormElement;", "getElements", "()Ljava/util/List;", "uncompletedFormValues", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getUncompletedFormValues", "()Lkotlinx/coroutines/flow/StateFlow;", "completeFormValues", "getCompleteFormValues", "lastTextFieldIdentifier", "getLastTextFieldIdentifier", "getCurrentFormValues", "parsePhoneNumberConfig", "Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;", "configuration", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$AdditionalFieldsConfiguration$FieldConfiguration;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressFormController {
    public static final int $stable = 8;
    private final AutocompleteAddressElement autocompleteAddressElement;
    private final StateFlow<Map<IdentifierSpec, FormFieldEntry>> completeFormValues;
    private final AddressLauncher.Configuration config;
    private final List<FormElement> elements;
    private final Map<IdentifierSpec, String> initialValues;
    private final AutocompleteAddressInteractor interactor;
    private final StateFlow<IdentifierSpec> lastTextFieldIdentifier;
    private final StateFlow<Map<IdentifierSpec, FormFieldEntry>> uncompletedFormValues;

    /* compiled from: AddressFormController.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AddressLauncher.AdditionalFieldsConfiguration.FieldConfiguration.values().length];
            try {
                iArr[AddressLauncher.AdditionalFieldsConfiguration.FieldConfiguration.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AddressLauncher.AdditionalFieldsConfiguration.FieldConfiguration.OPTIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AddressLauncher.AdditionalFieldsConfiguration.FieldConfiguration.REQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AddressFormController(Map<IdentifierSpec, String> initialValues, AddressLauncher.Configuration configuration, AutocompleteAddressInteractor interactor) {
        AddressLauncher.AdditionalFieldsConfiguration additionalFields;
        Set<String> allowedCountries;
        Intrinsics.checkNotNullParameter(initialValues, "initialValues");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.initialValues = initialValues;
        this.config = configuration;
        this.interactor = interactor;
        AutocompleteAddressElement autocompleteAddressElement = new AutocompleteAddressElement(IdentifierSpec.INSTANCE.Generic("address"), initialValues, (configuration == null || (allowedCountries = configuration.getAllowedCountries()) == null) ? CountryUtils.INSTANCE.getSupportedBillingCountries() : allowedCountries, null, parsePhoneNumberConfig((configuration == null || (additionalFields = configuration.getAdditionalFields()) == null) ? null : additionalFields.getPhone()), AddressFieldConfiguration.REQUIRED, null, null, new AutocompleteAddressInteractor.Factory() { // from class: com.stripe.android.paymentsheet.addresselement.AddressFormController$$ExternalSyntheticLambda0
            @Override // com.stripe.android.uicore.elements.AutocompleteAddressInteractor.Factory
            public final AutocompleteAddressInteractor create() {
                return this.f$0.interactor;
            }
        }, false, 520, null);
        this.autocompleteAddressElement = autocompleteAddressElement;
        this.elements = CollectionsKt.listOf(SectionElement.Companion.wrap$default(SectionElement.INSTANCE, autocompleteAddressElement, (ResolvableString) null, 2, (Object) null));
        StateFlow<Map<IdentifierSpec, FormFieldEntry>> stateFlowMapAsStateFlow = StateFlowsKt.mapAsStateFlow(autocompleteAddressElement.getFormFieldValueFlow(), new Function1() { // from class: com.stripe.android.paymentsheet.addresselement.AddressFormController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressFormController.uncompletedFormValues$lambda$1((List) obj);
            }
        });
        this.uncompletedFormValues = stateFlowMapAsStateFlow;
        this.completeFormValues = StateFlowsKt.mapAsStateFlow(stateFlowMapAsStateFlow, new Function1() { // from class: com.stripe.android.paymentsheet.addresselement.AddressFormController$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressFormController.completeFormValues$lambda$4((Map) obj);
            }
        });
        this.lastTextFieldIdentifier = StateFlowsKt.mapAsStateFlow(autocompleteAddressElement.getTextFieldIdentifiers(), new Function1() { // from class: com.stripe.android.paymentsheet.addresselement.AddressFormController$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressFormController.lastTextFieldIdentifier$lambda$5((List) obj);
            }
        });
    }

    public final Map<IdentifierSpec, String> getInitialValues() {
        return this.initialValues;
    }

    public final AddressLauncher.Configuration getConfig() {
        return this.config;
    }

    public final AutocompleteAddressInteractor getInteractor() {
        return this.interactor;
    }

    public final List<FormElement> getElements() {
        return this.elements;
    }

    public final StateFlow<Map<IdentifierSpec, FormFieldEntry>> getUncompletedFormValues() {
        return this.uncompletedFormValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map uncompletedFormValues$lambda$1(List entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        return MapsKt.toMap(entries);
    }

    public final StateFlow<Map<IdentifierSpec, FormFieldEntry>> getCompleteFormValues() {
        return this.completeFormValues;
    }

    public final StateFlow<IdentifierSpec> getLastTextFieldIdentifier() {
        return this.lastTextFieldIdentifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdentifierSpec lastTextFieldIdentifier$lambda$5(List textFieldControllerIds) {
        Intrinsics.checkNotNullParameter(textFieldControllerIds, "textFieldControllerIds");
        return (IdentifierSpec) CollectionsKt.lastOrNull(textFieldControllerIds);
    }

    public final Map<IdentifierSpec, FormFieldEntry> getCurrentFormValues() {
        List<Pair<IdentifierSpec, FormFieldEntry>> value = this.autocompleteAddressElement.getFormFieldValueFlow().getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : value) {
            if (((FormFieldEntry) ((Pair) obj).getSecond()).isComplete()) {
                arrayList.add(obj);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    private final AddressFieldConfiguration parsePhoneNumberConfig(AddressLauncher.AdditionalFieldsConfiguration.FieldConfiguration configuration) {
        int i = configuration == null ? -1 : WhenMappings.$EnumSwitchMapping$0[configuration.ordinal()];
        if (i == -1) {
            return AddressFieldConfiguration.OPTIONAL;
        }
        if (i == 1) {
            return AddressFieldConfiguration.HIDDEN;
        }
        if (i == 2) {
            return AddressFieldConfiguration.OPTIONAL;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return AddressFieldConfiguration.REQUIRED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map completeFormValues$lambda$4(Map entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        if (entries.isEmpty()) {
            return entries;
        }
        Iterator it = entries.entrySet().iterator();
        while (it.hasNext()) {
            if (!((FormFieldEntry) ((Map.Entry) it.next()).getValue()).isComplete()) {
                return null;
            }
        }
        return entries;
    }
}
