package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.R;
import com.stripe.android.uicore.address.AutocompleteCapableInputMode;
import com.stripe.android.uicore.elements.TextFieldIcon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressElement.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u001a*\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\r"}, d2 = {"updateLine1WithAutocompleteAffordance", "", "field", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "countryCode", "", "addressInputMode", "Lcom/stripe/android/uicore/elements/AddressInputMode;", "isPlacesAvailable", "", "updateLine1ConfigForAutocompleteAffordance", "textConfig", "Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;", "stripe-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressElementKt {
    public static final void updateLine1WithAutocompleteAffordance(SectionFieldElement field, String str, AddressInputMode addressInputMode, boolean z) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(addressInputMode, "addressInputMode");
        if (Intrinsics.areEqual(field.getIdentifier(), IdentifierSpec.INSTANCE.getLine1())) {
            SimpleTextElement simpleTextElement = field instanceof SimpleTextElement ? (SimpleTextElement) field : null;
            TextFieldController controller = simpleTextElement != null ? simpleTextElement.getController() : null;
            SimpleTextFieldController simpleTextFieldController = controller instanceof SimpleTextFieldController ? (SimpleTextFieldController) controller : null;
            Object textFieldConfig = simpleTextFieldController != null ? simpleTextFieldController.getTextFieldConfig() : null;
            SimpleTextFieldConfig simpleTextFieldConfig = textFieldConfig instanceof SimpleTextFieldConfig ? (SimpleTextFieldConfig) textFieldConfig : null;
            if (simpleTextFieldConfig != null) {
                updateLine1ConfigForAutocompleteAffordance(simpleTextFieldConfig, str, addressInputMode, z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void updateLine1ConfigForAutocompleteAffordance(SimpleTextFieldConfig simpleTextFieldConfig, String str, final AddressInputMode addressInputMode, boolean z) {
        AutocompleteCapableInputMode autocompleteCapableInputMode = addressInputMode instanceof AutocompleteCapableInputMode ? (AutocompleteCapableInputMode) addressInputMode : null;
        simpleTextFieldConfig.getTrailingIcon().setValue(Intrinsics.areEqual((Object) (autocompleteCapableInputMode != null ? Boolean.valueOf(autocompleteCapableInputMode.supportsAutoComplete(str, z)) : null), (Object) true) ? new TextFieldIcon.Trailing(R.drawable.stripe_ic_search, Integer.valueOf(R.string.stripe_address_search_content_description), true, new Function0() { // from class: com.stripe.android.uicore.elements.AddressElementKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AddressElementKt.updateLine1ConfigForAutocompleteAffordance$lambda$0(addressInputMode);
            }
        }) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit updateLine1ConfigForAutocompleteAffordance$lambda$0(AddressInputMode addressInputMode) {
        ((AutocompleteCapableInputMode) addressInputMode).getOnNavigation().invoke();
        return Unit.INSTANCE;
    }
}
