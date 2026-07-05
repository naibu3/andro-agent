package com.stripe.android.uicore.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.text.input.ImeAction;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: TextFieldController.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BL\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010N\u001a\u0004\u0018\u00010?2\u0006\u0010O\u001a\u00020\u0007H\u0016J\u0010\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u0007H\u0016J\u0010\u0010S\u001a\u00020Q2\u0006\u0010T\u001a\u00020\u0005H\u0016J=\u0010U\u001a\u00020Q2\u0006\u0010V\u001a\u00020\u00052\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020Z2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020]0\\2\b\u0010^\u001a\u0004\u0018\u00010]H\u0017¢\u0006\u0002\u0010_R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R+\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u001cX\u0096\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020!X\u0096\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\"\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0'X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0015R\u0016\u0010,\u001a\u0004\u0018\u00010-X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u000101X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070'X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0014\u00108\u001a\b\u0012\u0004\u0012\u00020\u00070'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001aR\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u001aR\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u001aR\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020?0'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u001aR\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\u001aR\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00050'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\u001aR\u001c\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010\u001aR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u001aR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010\u001a¨\u0006`"}, d2 = {"Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "Lcom/stripe/android/uicore/elements/TextFieldController;", "textFieldConfig", "Lcom/stripe/android/uicore/elements/TextFieldConfig;", "showOptionalLabel", "", "initialValue", "", "overrideContentDescriptionProvider", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "fieldValue", "Lcom/stripe/android/core/strings/ResolvableString;", "<init>", "(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getTextFieldConfig", "()Lcom/stripe/android/uicore/elements/TextFieldConfig;", "getShowOptionalLabel", "()Z", "getInitialValue", "()Ljava/lang/String;", "trailingIcon", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "getTrailingIcon", "()Lkotlinx/coroutines/flow/StateFlow;", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "getCapitalization-IUNYP9k", "()I", "I", "keyboardType", "Landroidx/compose/ui/text/input/KeyboardType;", "getKeyboardType-PjHm6EE", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation", "label", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getLabel", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "debugLabel", "getDebugLabel", ViewProps.LAYOUT_DIRECTION, "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "autofillType", "Landroidx/compose/ui/autofill/AutofillType;", "getAutofillType$annotations", "()V", "getAutofillType", "()Landroidx/compose/ui/autofill/AutofillType;", "placeHolder", "getPlaceHolder", "_fieldValue", "getFieldValue", "rawFieldValue", "getRawFieldValue", "contentDescription", "getContentDescription", "_fieldState", "Lcom/stripe/android/uicore/elements/TextFieldState;", "fieldState", "getFieldState", "loading", "getLoading", "_hasFocus", "visibleError", "getVisibleError", "error", "Lcom/stripe/android/uicore/elements/FieldError;", "getError", "isComplete", "formFieldValue", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValue", "onValueChange", "displayFormatted", "onRawValueChange", "", "rawValue", "onFocusChange", "newHasFocus", "ComposeUI", ViewProps.ENABLED, "field", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "modifier", "Landroidx/compose/ui/Modifier;", "hiddenIdentifiers", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "lastTextFieldIdentifier", "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SimpleTextFieldController implements TextFieldController {
    public static final int $stable = 8;
    private final MutableStateFlow<TextFieldState> _fieldState;
    private final MutableStateFlow<String> _fieldValue;
    private final MutableStateFlow<Boolean> _hasFocus;
    private final AutofillType autofillType;
    private final int capitalization;
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
    private final Function1<String, ResolvableString> overrideContentDescriptionProvider;
    private final MutableStateFlow<String> placeHolder;
    private final StateFlow<String> rawFieldValue;
    private final boolean showOptionalLabel;
    private final TextFieldConfig textFieldConfig;
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
    public void onDropdownItemClicked(TextFieldIcon.Dropdown.Item item) {
        TextFieldController.DefaultImpls.onDropdownItemClicked(this, item);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleTextFieldController(TextFieldConfig textFieldConfig, boolean z, String str, Function1<? super String, ? extends ResolvableString> function1) {
        AutofillType autofillType;
        Intrinsics.checkNotNullParameter(textFieldConfig, "textFieldConfig");
        this.textFieldConfig = textFieldConfig;
        this.showOptionalLabel = z;
        this.initialValue = str;
        this.overrideContentDescriptionProvider = function1;
        this.trailingIcon = textFieldConfig.getTrailingIcon();
        this.capitalization = textFieldConfig.getCapitalization();
        this.keyboardType = textFieldConfig.getKeyboard();
        VisualTransformation visualTransformation = textFieldConfig.getVisualTransformation();
        this.visualTransformation = StateFlowsKt.stateFlowOf(visualTransformation == null ? VisualTransformation.INSTANCE.getNone() : visualTransformation);
        this.label = StateFlowKt.MutableStateFlow(textFieldConfig.getLabel());
        this.debugLabel = textFieldConfig.getDebugLabel();
        this.layoutDirection = textFieldConfig.getLayoutDirection();
        if (textFieldConfig instanceof DateConfig) {
            autofillType = AutofillType.CreditCardExpirationDate;
        } else if (textFieldConfig instanceof PostalCodeConfig) {
            autofillType = AutofillType.PostalCode;
        } else if (textFieldConfig instanceof EmailConfig) {
            autofillType = AutofillType.EmailAddress;
        } else {
            autofillType = textFieldConfig instanceof NameConfig ? AutofillType.PersonFullName : null;
        }
        this.autofillType = autofillType;
        this.placeHolder = StateFlowKt.MutableStateFlow(textFieldConfig.getPlaceHolder());
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this._fieldValue = MutableStateFlow;
        this.fieldValue = FlowKt.asStateFlow(MutableStateFlow);
        this.rawFieldValue = StateFlowsKt.mapAsStateFlow(MutableStateFlow, new Function1() { // from class: com.stripe.android.uicore.elements.SimpleTextFieldController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SimpleTextFieldController.rawFieldValue$lambda$0(this.f$0, (String) obj);
            }
        });
        this.contentDescription = StateFlowsKt.mapAsStateFlow(MutableStateFlow, new Function1() { // from class: com.stripe.android.uicore.elements.SimpleTextFieldController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SimpleTextFieldController.contentDescription$lambda$1(this.f$0, (String) obj);
            }
        });
        MutableStateFlow<TextFieldState> MutableStateFlow2 = StateFlowKt.MutableStateFlow(TextFieldStateConstants.Error.Blank.INSTANCE);
        this._fieldState = MutableStateFlow2;
        this.fieldState = FlowKt.asStateFlow(MutableStateFlow2);
        this.loading = textFieldConfig.getLoading();
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(false);
        this._hasFocus = MutableStateFlow3;
        this.visibleError = StateFlowsKt.combineAsStateFlow(MutableStateFlow2, MutableStateFlow3, new Function2() { // from class: com.stripe.android.uicore.elements.SimpleTextFieldController$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(SimpleTextFieldController.visibleError$lambda$2((TextFieldState) obj, ((Boolean) obj2).booleanValue()));
            }
        });
        this.error = StateFlowsKt.mapAsStateFlow(getVisibleError(), new Function1() { // from class: com.stripe.android.uicore.elements.SimpleTextFieldController$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SimpleTextFieldController.error$lambda$4(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        this.isComplete = StateFlowsKt.mapAsStateFlow(MutableStateFlow2, new Function1() { // from class: com.stripe.android.uicore.elements.SimpleTextFieldController$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SimpleTextFieldController.isComplete$lambda$5(this.f$0, (TextFieldState) obj));
            }
        });
        this.formFieldValue = StateFlowsKt.combineAsStateFlow(isComplete(), getRawFieldValue(), new Function2() { // from class: com.stripe.android.uicore.elements.SimpleTextFieldController$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SimpleTextFieldController.formFieldValue$lambda$6(((Boolean) obj).booleanValue(), (String) obj2);
            }
        });
        String initialValue = getInitialValue();
        if (initialValue != null) {
            onRawValueChange(initialValue);
        }
    }

    public /* synthetic */ SimpleTextFieldController(TextFieldConfig textFieldConfig, boolean z, String str, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldConfig, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : function1);
    }

    public final TextFieldConfig getTextFieldConfig() {
        return this.textFieldConfig;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController, com.stripe.android.uicore.elements.InputController
    public boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
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
    public MutableStateFlow<ResolvableString> getLabel() {
        return this.label;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public String getDebugLabel() {
        return this.debugLabel;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public AutofillType getAutofillType() {
        return this.autofillType;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public MutableStateFlow<String> getPlaceHolder() {
        return this.placeHolder;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController, com.stripe.android.uicore.elements.InputController
    public StateFlow<String> getFieldValue() {
        return this.fieldValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rawFieldValue$lambda$0(SimpleTextFieldController simpleTextFieldController, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return simpleTextFieldController.textFieldConfig.convertToRaw(it);
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public StateFlow<String> getRawFieldValue() {
        return this.rawFieldValue;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public StateFlow<ResolvableString> getContentDescription() {
        return this.contentDescription;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResolvableString contentDescription$lambda$1(SimpleTextFieldController simpleTextFieldController, String it) {
        ResolvableString resolvableStringInvoke;
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<String, ResolvableString> function1 = simpleTextFieldController.overrideContentDescriptionProvider;
        return (function1 == null || (resolvableStringInvoke = function1.invoke(it)) == null) ? ResolvableStringUtilsKt.getResolvableString(it) : resolvableStringInvoke;
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
    public static final boolean visibleError$lambda$2(TextFieldState fieldState, boolean z) {
        Intrinsics.checkNotNullParameter(fieldState, "fieldState");
        return fieldState.shouldShowError(z);
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldErrorController
    public StateFlow<FieldError> getError() {
        return this.error;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldError error$lambda$4(SimpleTextFieldController simpleTextFieldController, boolean z) {
        FieldError error = simpleTextFieldController._fieldState.getValue().getError();
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
    public static final boolean isComplete$lambda$5(SimpleTextFieldController simpleTextFieldController, TextFieldState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isValid()) {
            return true;
        }
        return !it.isValid() && simpleTextFieldController.getShowOptionalLabel() && it.isBlank();
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public StateFlow<FormFieldEntry> getFormFieldValue() {
        return this.formFieldValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FormFieldEntry formFieldValue$lambda$6(boolean z, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new FormFieldEntry(value, z);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public TextFieldState onValueChange(String displayFormatted) {
        Intrinsics.checkNotNullParameter(displayFormatted, "displayFormatted");
        TextFieldState value = this._fieldState.getValue();
        this._fieldValue.setValue(this.textFieldConfig.filter(displayFormatted));
        this._fieldState.setValue(this.textFieldConfig.determineState(this._fieldValue.getValue()));
        if (Intrinsics.areEqual(this._fieldState.getValue(), value)) {
            return null;
        }
        return this._fieldState.getValue();
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public void onRawValueChange(String rawValue) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        onValueChange(this.textFieldConfig.convertFromRaw(rawValue));
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public void onFocusChange(boolean newHasFocus) {
        this._hasFocus.setValue(Boolean.valueOf(newHasFocus));
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController, com.stripe.android.uicore.elements.SectionFieldComposable
    public void ComposeUI(boolean z, SectionFieldElement field, Modifier modifier, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, Composer composer, int i) {
        int iM5783getNexteUduSuo;
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
        composer.startReplaceGroup(1225623209);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1225623209, i, -1, "com.stripe.android.uicore.elements.SimpleTextFieldController.ComposeUI (TextFieldController.kt:226)");
        }
        SimpleTextFieldController simpleTextFieldController = this;
        if (Intrinsics.areEqual(identifierSpec, field.getIdentifier())) {
            iM5783getNexteUduSuo = ImeAction.INSTANCE.m5781getDoneeUduSuo();
        } else {
            iM5783getNexteUduSuo = ImeAction.INSTANCE.m5783getNexteUduSuo();
        }
        int i2 = i << 3;
        TextFieldUIKt.m8846TextFieldZkbtPhE(simpleTextFieldController, z, iM5783getNexteUduSuo, modifier, null, 0, 0, null, this.textFieldConfig.getShouldAnnounceLabel(), this.textFieldConfig.getShouldAnnounceFieldValue(), composer, ((i >> 15) & 14) | (i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i2 & 7168), 240);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
