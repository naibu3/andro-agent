package com.stripe.android.uicore.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.uicore.elements.TextFieldController;
import com.stripe.android.uicore.elements.TextFieldIcon;
import com.stripe.android.uicore.elements.TextFieldStateConstants;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: AddressTextFieldController.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010H\u001a\u0004\u0018\u00010<2\u0006\u0010I\u001a\u00020\nH\u0016J\u0010\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020 H\u0016J\u0010\u0010O\u001a\u00020\b2\u0006\u0010P\u001a\u00020\nH\u0016J=\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020 2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020V2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020Y0X2\b\u0010Z\u001a\u0004\u0018\u00010YH\u0017¢\u0006\u0002\u0010[J\u0006\u0010\\\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u001aX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0014\u0010\u001f\u001a\u00020 X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u000eR\u001e\u0010*\u001a\u0004\u0018\u00010+8\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020\n0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\n0\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0013R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\n0\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0013R\u0016\u00105\u001a\u0004\u0018\u000106X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020%0\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0013R\u0014\u0010;\u001a\b\u0012\u0004\u0012\u00020<0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0013R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020 0\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0013R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020 0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020 0\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\u0013R\u001c\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0013R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020 0\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010\u0013R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010\u0013¨\u0006]"}, d2 = {"Lcom/stripe/android/uicore/elements/AddressTextFieldController;", "Lcom/stripe/android/uicore/elements/TextFieldController;", "Lcom/stripe/android/uicore/elements/InputController;", "Lcom/stripe/android/uicore/elements/SectionFieldComposable;", "config", "Lcom/stripe/android/uicore/elements/TextFieldConfig;", "onNavigation", "Lkotlin/Function0;", "", "initialValue", "", "<init>", "(Lcom/stripe/android/uicore/elements/TextFieldConfig;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "getInitialValue", "()Ljava/lang/String;", "trailingIcon", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "getTrailingIcon", "()Lkotlinx/coroutines/flow/StateFlow;", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "getCapitalization-IUNYP9k", "()I", "I", "keyboardType", "Landroidx/compose/ui/text/input/KeyboardType;", "getKeyboardType-PjHm6EE", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation", "showOptionalLabel", "", "getShowOptionalLabel", "()Z", "label", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/core/strings/ResolvableString;", "getLabel", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "debugLabel", "getDebugLabel", "autofillType", "Landroidx/compose/ui/autofill/AutofillType;", "getAutofillType$annotations", "()V", "getAutofillType", "()Landroidx/compose/ui/autofill/AutofillType;", "_fieldValue", "fieldValue", "getFieldValue", "rawFieldValue", "getRawFieldValue", ViewProps.LAYOUT_DIRECTION, "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "contentDescription", "getContentDescription", "_fieldState", "Lcom/stripe/android/uicore/elements/TextFieldState;", "fieldState", "getFieldState", "loading", "getLoading", "_hasFocus", "visibleError", "getVisibleError", "error", "Lcom/stripe/android/uicore/elements/FieldError;", "getError", "isComplete", "onValueChange", "displayFormatted", "onFocusChange", "newHasFocus", "formFieldValue", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValue", "onRawValueChange", "rawValue", "ComposeUI", ViewProps.ENABLED, "field", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "modifier", "Landroidx/compose/ui/Modifier;", "hiddenIdentifiers", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "lastTextFieldIdentifier", "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V", "launchAutocompleteScreen", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressTextFieldController implements TextFieldController, InputController, SectionFieldComposable {
    public static final int $stable = 8;
    private final MutableStateFlow<TextFieldState> _fieldState;
    private final MutableStateFlow<String> _fieldValue;
    private final MutableStateFlow<Boolean> _hasFocus;
    private final AutofillType autofillType;
    private final int capitalization;
    private final TextFieldConfig config;
    private final StateFlow<ResolvableString> contentDescription;
    private final String debugLabel;
    private final StateFlow<FieldError> error;
    private final StateFlow<TextFieldState> fieldState;
    private final StateFlow<String> fieldValue;
    private final StateFlow<FormFieldEntry> formFieldValue;
    private final String initialValue;
    private final StateFlow<Boolean> isComplete;
    private final int keyboardType;
    private final MutableStateFlow<ResolvableString> label;
    private final LayoutDirection layoutDirection;
    private final StateFlow<Boolean> loading;
    private final Function0<Unit> onNavigation;
    private final StateFlow<String> rawFieldValue;
    private final boolean showOptionalLabel;
    private final StateFlow<TextFieldIcon> trailingIcon;
    private final StateFlow<Boolean> visibleError;
    private final StateFlow<VisualTransformation> visualTransformation;

    public static /* synthetic */ void getAutofillType$annotations() {
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public boolean getEnabled() {
        return TextFieldController.DefaultImpls.getEnabled(this);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public StateFlow<String> getPlaceHolder() {
        return TextFieldController.DefaultImpls.getPlaceHolder(this);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public void onDropdownItemClicked(TextFieldIcon.Dropdown.Item item) {
        TextFieldController.DefaultImpls.onDropdownItemClicked(this, item);
    }

    public AddressTextFieldController(TextFieldConfig config, Function0<Unit> function0, String str) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.onNavigation = function0;
        this.initialValue = str;
        String initialValue = getInitialValue();
        if (initialValue != null) {
            onRawValueChange(initialValue);
        }
        this.trailingIcon = config.getTrailingIcon();
        this.capitalization = config.getCapitalization();
        this.keyboardType = config.getKeyboard();
        VisualTransformation visualTransformation = config.getVisualTransformation();
        this.visualTransformation = StateFlowsKt.stateFlowOf(visualTransformation == null ? VisualTransformation.INSTANCE.getNone() : visualTransformation);
        this.label = StateFlowKt.MutableStateFlow(config.getLabel());
        this.debugLabel = config.getDebugLabel();
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this._fieldValue = MutableStateFlow;
        this.fieldValue = FlowKt.asStateFlow(MutableStateFlow);
        this.rawFieldValue = StateFlowsKt.mapAsStateFlow(MutableStateFlow, new Function1() { // from class: com.stripe.android.uicore.elements.AddressTextFieldController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressTextFieldController.rawFieldValue$lambda$1(this.f$0, (String) obj);
            }
        });
        this.contentDescription = StateFlowsKt.mapAsStateFlow(MutableStateFlow, new Function1() { // from class: com.stripe.android.uicore.elements.AddressTextFieldController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressTextFieldController.contentDescription$lambda$2((String) obj);
            }
        });
        MutableStateFlow<TextFieldState> MutableStateFlow2 = StateFlowKt.MutableStateFlow(TextFieldStateConstants.Error.Blank.INSTANCE);
        this._fieldState = MutableStateFlow2;
        this.fieldState = FlowKt.asStateFlow(MutableStateFlow2);
        this.loading = config.getLoading();
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(false);
        this._hasFocus = MutableStateFlow3;
        this.visibleError = StateFlowsKt.combineAsStateFlow(MutableStateFlow2, MutableStateFlow3, new Function2() { // from class: com.stripe.android.uicore.elements.AddressTextFieldController$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(AddressTextFieldController.visibleError$lambda$3((TextFieldState) obj, ((Boolean) obj2).booleanValue()));
            }
        });
        this.error = StateFlowsKt.mapAsStateFlow(getVisibleError(), new Function1() { // from class: com.stripe.android.uicore.elements.AddressTextFieldController$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddressTextFieldController.error$lambda$5(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        this.isComplete = StateFlowsKt.mapAsStateFlow(MutableStateFlow2, new Function1() { // from class: com.stripe.android.uicore.elements.AddressTextFieldController$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AddressTextFieldController.isComplete$lambda$6(this.f$0, (TextFieldState) obj));
            }
        });
        this.formFieldValue = StateFlowsKt.combineAsStateFlow(isComplete(), getRawFieldValue(), new Function2() { // from class: com.stripe.android.uicore.elements.AddressTextFieldController$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AddressTextFieldController.formFieldValue$lambda$7(((Boolean) obj).booleanValue(), (String) obj2);
            }
        });
    }

    public /* synthetic */ AddressTextFieldController(TextFieldConfig textFieldConfig, Function0 function0, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldConfig, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : str);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public String getInitialValue() {
        return this.initialValue;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public StateFlow<TextFieldIcon> getTrailingIcon() {
        return this.trailingIcon;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    /* renamed from: getCapitalization-IUNYP9k, reason: from getter */
    public int getCapitalization() {
        return this.capitalization;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    /* renamed from: getKeyboardType-PjHm6EE, reason: from getter */
    public int getKeyboardType() {
        return this.keyboardType;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public StateFlow<VisualTransformation> getVisualTransformation() {
        return this.visualTransformation;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController, com.stripe.android.uicore.elements.InputController
    public boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController, com.stripe.android.uicore.elements.InputController
    public MutableStateFlow<ResolvableString> getLabel() {
        return this.label;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public String getDebugLabel() {
        return this.debugLabel;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public AutofillType getAutofillType() {
        return this.autofillType;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController, com.stripe.android.uicore.elements.InputController
    public StateFlow<String> getFieldValue() {
        return this.fieldValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rawFieldValue$lambda$1(AddressTextFieldController addressTextFieldController, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return addressTextFieldController.config.convertToRaw(it);
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public StateFlow<String> getRawFieldValue() {
        return this.rawFieldValue;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResolvableString contentDescription$lambda$2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ResolvableStringUtilsKt.getResolvableString(it);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public StateFlow<ResolvableString> getContentDescription() {
        return this.contentDescription;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public StateFlow<TextFieldState> getFieldState() {
        return this.fieldState;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public StateFlow<Boolean> getLoading() {
        return this.loading;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public StateFlow<Boolean> getVisibleError() {
        return this.visibleError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean visibleError$lambda$3(TextFieldState fieldState, boolean z) {
        Intrinsics.checkNotNullParameter(fieldState, "fieldState");
        return fieldState.shouldShowError(z);
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldErrorController
    public StateFlow<FieldError> getError() {
        return this.error;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldError error$lambda$5(AddressTextFieldController addressTextFieldController, boolean z) {
        FieldError error = addressTextFieldController._fieldState.getValue().getError();
        if (error == null || !z) {
            return null;
        }
        return error;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public StateFlow<Boolean> isComplete() {
        return this.isComplete;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isComplete$lambda$6(AddressTextFieldController addressTextFieldController, TextFieldState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isValid()) {
            return true;
        }
        return !it.isValid() && addressTextFieldController.getShowOptionalLabel() && it.isBlank();
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public TextFieldState onValueChange(String displayFormatted) {
        Intrinsics.checkNotNullParameter(displayFormatted, "displayFormatted");
        TextFieldState value = this._fieldState.getValue();
        this._fieldValue.setValue(this.config.filter(displayFormatted));
        this._fieldState.setValue(this.config.determineState(this._fieldValue.getValue()));
        if (Intrinsics.areEqual(this._fieldState.getValue(), value)) {
            return null;
        }
        return this._fieldState.getValue();
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public void onFocusChange(boolean newHasFocus) {
        this._hasFocus.setValue(Boolean.valueOf(newHasFocus));
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public StateFlow<FormFieldEntry> getFormFieldValue() {
        return this.formFieldValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FormFieldEntry formFieldValue$lambda$7(boolean z, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new FormFieldEntry(value, z);
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public void onRawValueChange(String rawValue) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        onValueChange(this.config.convertFromRaw(rawValue));
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController, com.stripe.android.uicore.elements.SectionFieldComposable
    public void ComposeUI(boolean z, SectionFieldElement field, Modifier modifier, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
        composer.startReplaceGroup(105420039);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(105420039, i, -1, "com.stripe.android.uicore.elements.AddressTextFieldController.ComposeUI (AddressTextFieldController.kt:116)");
        }
        AddressTextFieldUIKt.AddressTextFieldUI(this, modifier, null, composer, ((i >> 15) & 14) | ((i >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    public final void launchAutocompleteScreen() {
        Function0<Unit> function0 = this.onNavigation;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
