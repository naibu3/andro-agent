package com.stripe.android.uicore.elements;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.VisualTransformation;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.core.R;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.uicore.elements.DropdownConfig;
import com.stripe.android.uicore.elements.PhoneNumberFormatter;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: PhoneNumberController.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0001IBC\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u00103\u001a\u00020\u0004J\u000e\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0004J\u0006\u00106\u001a\u00020\u0004J\u0006\u00107\u001a\u00020\u0004J\u000e\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0004J\u0010\u0010;\u001a\u0002092\u0006\u0010<\u001a\u00020\u0004H\u0016J\u000e\u0010=\u001a\u0002092\u0006\u0010>\u001a\u00020\tJ=\u0010?\u001a\u0002092\u0006\u0010@\u001a\u00020\t2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u00072\b\u0010G\u001a\u0004\u0018\u00010FH\u0017¢\u0006\u0002\u0010HR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0015R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0015R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0015R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0015R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0015R\u0017\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0012¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0015¨\u0006J"}, d2 = {"Lcom/stripe/android/uicore/elements/PhoneNumberController;", "Lcom/stripe/android/uicore/elements/InputController;", "Lcom/stripe/android/uicore/elements/SectionFieldComposable;", "initialPhoneNumber", "", "initiallySelectedCountryCode", "overrideCountryCodes", "", "showOptionalLabel", "", "acceptAnyInput", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZZ)V", "getInitialPhoneNumber", "()Ljava/lang/String;", "getShowOptionalLabel", "()Z", "label", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/core/strings/ResolvableString;", "getLabel", "()Lkotlinx/coroutines/flow/StateFlow;", "_fieldValue", "Lkotlinx/coroutines/flow/MutableStateFlow;", "fieldValue", "getFieldValue", "_hasFocus", "countryConfig", "Lcom/stripe/android/uicore/elements/CountryConfig;", "countryDropdownController", "Lcom/stripe/android/uicore/elements/DropdownFieldController;", "getCountryDropdownController", "()Lcom/stripe/android/uicore/elements/DropdownFieldController;", "phoneNumberFormatter", "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;", "phoneNumberMinimumLength", "", "rawFieldValue", "getRawFieldValue", "isComplete", "formFieldValue", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValue", "error", "Lcom/stripe/android/uicore/elements/FieldError;", "getError", ReactTextInputShadowNode.PROP_PLACEHOLDER, "getPlaceholder", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation", "getCountryCode", "getE164PhoneNumber", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "getLocalNumber", "formatLocalNumber", "onValueChange", "", "displayFormatted", "onRawValueChange", "rawValue", "onFocusChange", "newHasFocus", "ComposeUI", ViewProps.ENABLED, "field", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "modifier", "Landroidx/compose/ui/Modifier;", "hiddenIdentifiers", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "lastTextFieldIdentifier", "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V", "Companion", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PhoneNumberController implements InputController, SectionFieldComposable {
    private final MutableStateFlow<String> _fieldValue;
    private final MutableStateFlow<Boolean> _hasFocus;
    private final boolean acceptAnyInput;
    private final CountryConfig countryConfig;
    private final DropdownFieldController countryDropdownController;
    private final StateFlow<FieldError> error;
    private final StateFlow<String> fieldValue;
    private final StateFlow<FormFieldEntry> formFieldValue;
    private final String initialPhoneNumber;
    private final StateFlow<Boolean> isComplete;
    private final StateFlow<ResolvableString> label;
    private final StateFlow<PhoneNumberFormatter> phoneNumberFormatter;
    private final StateFlow<Integer> phoneNumberMinimumLength;
    private final StateFlow<String> placeholder;
    private final StateFlow<String> rawFieldValue;
    private final boolean showOptionalLabel;
    private final StateFlow<VisualTransformation> visualTransformation;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ PhoneNumberController(String str, String str2, Set set, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, set, z, z2);
    }

    private PhoneNumberController(String str, String str2, Set<String> set, boolean z, boolean z2) {
        this.initialPhoneNumber = str;
        this.showOptionalLabel = z;
        this.acceptAnyInput = z2;
        this.label = StateFlowsKt.stateFlowOf(ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_address_label_phone_number, new Object[0], null, 4, null));
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow(str);
        this._fieldValue = MutableStateFlow;
        this.fieldValue = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(false);
        this._hasFocus = MutableStateFlow2;
        CountryConfig countryConfig = new CountryConfig(set, null, DropdownConfig.Mode.Condensed.INSTANCE, false, new Function1() { // from class: com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhoneNumberController.countryConfig$lambda$1((Country) obj);
            }
        }, new Function1() { // from class: com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhoneNumberController.countryConfig$lambda$2((Country) obj);
            }
        }, 10, null);
        this.countryConfig = countryConfig;
        DropdownFieldController dropdownFieldController = new DropdownFieldController(countryConfig, str2);
        this.countryDropdownController = dropdownFieldController;
        StateFlow<PhoneNumberFormatter> stateFlowMapAsStateFlow = StateFlowsKt.mapAsStateFlow(dropdownFieldController.getSelectedIndex(), new Function1() { // from class: com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhoneNumberController.phoneNumberFormatter$lambda$3(this.f$0, (Integer) obj);
            }
        });
        this.phoneNumberFormatter = stateFlowMapAsStateFlow;
        StateFlow<Integer> stateFlowMapAsStateFlow2 = StateFlowsKt.mapAsStateFlow(dropdownFieldController.getSelectedIndex(), new Function1() { // from class: com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhoneNumberController.phoneNumberMinimumLength$lambda$4(this.f$0, (Integer) obj);
            }
        });
        this.phoneNumberMinimumLength = stateFlowMapAsStateFlow2;
        this.rawFieldValue = StateFlowsKt.combineAsStateFlow(getFieldValue(), stateFlowMapAsStateFlow, new Function2() { // from class: com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PhoneNumberController.rawFieldValue$lambda$5((String) obj, (PhoneNumberFormatter) obj2);
            }
        });
        this.isComplete = StateFlowsKt.combineAsStateFlow(getFieldValue(), stateFlowMapAsStateFlow2, new Function2() { // from class: com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(PhoneNumberController.isComplete$lambda$6(this.f$0, (String) obj, (Integer) obj2));
            }
        });
        this.formFieldValue = StateFlowsKt.combineAsStateFlow(getRawFieldValue(), isComplete(), new Function2() { // from class: com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PhoneNumberController.formFieldValue$lambda$7((String) obj, ((Boolean) obj2).booleanValue());
            }
        });
        this.error = StateFlowsKt.combineAsStateFlow(getFieldValue(), isComplete(), MutableStateFlow2, new Function3() { // from class: com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return PhoneNumberController.error$lambda$8((String) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue());
            }
        });
        this.placeholder = StateFlowsKt.mapAsStateFlow(stateFlowMapAsStateFlow, new Function1() { // from class: com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhoneNumberController.placeholder$lambda$9((PhoneNumberFormatter) obj);
            }
        });
        this.visualTransformation = StateFlowsKt.mapAsStateFlow(stateFlowMapAsStateFlow, new Function1() { // from class: com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhoneNumberController.visualTransformation$lambda$10((PhoneNumberFormatter) obj);
            }
        });
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    /* synthetic */ PhoneNumberController(java.lang.String r2, java.lang.String r3, java.util.Set r4, boolean r5, boolean r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r8 = r7 & 2
            if (r8 == 0) goto Lb
            r3 = 0
        Lb:
            r8 = r7 & 4
            if (r8 == 0) goto L13
            java.util.Set r4 = kotlin.collections.SetsKt.emptySet()
        L13:
            r8 = r7 & 8
            r0 = 0
            if (r8 == 0) goto L19
            r5 = r0
        L19:
            r7 = r7 & 16
            if (r7 == 0) goto L24
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L2a
        L24:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L2a:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.uicore.elements.PhoneNumberController.<init>(java.lang.String, java.lang.String, java.util.Set, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getInitialPhoneNumber() {
        return this.initialPhoneNumber;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public StateFlow<ResolvableString> getLabel() {
        return this.label;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public StateFlow<String> getFieldValue() {
        return this.fieldValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String countryConfig$lambda$2(Country country) {
        Intrinsics.checkNotNullParameter(country, "country");
        return CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{CountryConfig.INSTANCE.countryCodeToEmoji$stripe_ui_core_release(country.getCode().getValue()), country.getName(), PhoneNumberFormatter.INSTANCE.prefixForCountry$stripe_ui_core_release(country.getCode().getValue())}), " ", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String countryConfig$lambda$1(Country country) {
        Intrinsics.checkNotNullParameter(country, "country");
        String[] strArr = new String[2];
        strArr[0] = CountryConfig.INSTANCE.countryCodeToEmoji$stripe_ui_core_release(country.getCode().getValue());
        String strPrefixForCountry$stripe_ui_core_release = PhoneNumberFormatter.INSTANCE.prefixForCountry$stripe_ui_core_release(country.getCode().getValue());
        strArr[1] = strPrefixForCountry$stripe_ui_core_release != null ? "  " + strPrefixForCountry$stripe_ui_core_release + "  " : null;
        return CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) strArr), "", null, null, 0, null, null, 62, null);
    }

    public final DropdownFieldController getCountryDropdownController() {
        return this.countryDropdownController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PhoneNumberFormatter phoneNumberFormatter$lambda$3(PhoneNumberController phoneNumberController, Integer num) {
        return PhoneNumberFormatter.INSTANCE.forCountry(phoneNumberController.countryConfig.getCountries$stripe_ui_core_release().get(num != null ? num.intValue() : 0).getCode().getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer phoneNumberMinimumLength$lambda$4(PhoneNumberController phoneNumberController, Integer num) {
        return PhoneNumberFormatter.INSTANCE.lengthForCountry(phoneNumberController.countryConfig.getCountries$stripe_ui_core_release().get(num != null ? num.intValue() : 0).getCode().getValue());
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public StateFlow<String> getRawFieldValue() {
        return this.rawFieldValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rawFieldValue$lambda$5(String value, PhoneNumberFormatter formatter) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return formatter.toE164Format(value);
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public StateFlow<Boolean> isComplete() {
        return this.isComplete;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isComplete$lambda$6(PhoneNumberController phoneNumberController, String value, Integer num) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.length() >= (num != null ? num.intValue() : 0) || phoneNumberController.acceptAnyInput;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public StateFlow<FormFieldEntry> getFormFieldValue() {
        return this.formFieldValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FormFieldEntry formFieldValue$lambda$7(String rawFieldValue, boolean z) {
        Intrinsics.checkNotNullParameter(rawFieldValue, "rawFieldValue");
        return new FormFieldEntry(rawFieldValue, z);
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldErrorController
    public StateFlow<FieldError> getError() {
        return this.error;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldError error$lambda$8(String value, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (StringsKt.isBlank(value) || z || z2) {
            return null;
        }
        return new FieldError(com.stripe.android.uicore.R.string.stripe_incomplete_phone_number, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String placeholder$lambda$9(PhoneNumberFormatter it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getPlaceholder();
    }

    public final StateFlow<String> getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VisualTransformation visualTransformation$lambda$10(PhoneNumberFormatter it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getVisualTransformation();
    }

    public final StateFlow<VisualTransformation> getVisualTransformation() {
        return this.visualTransformation;
    }

    public final String getCountryCode() {
        return this.phoneNumberFormatter.getValue().getCountryCode();
    }

    public final String getE164PhoneNumber(String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        return this.phoneNumberFormatter.getValue().toE164Format(phoneNumber);
    }

    public final String getLocalNumber() {
        return StringsKt.removePrefix(this._fieldValue.getValue(), (CharSequence) this.phoneNumberFormatter.getValue().getPrefix());
    }

    public final String formatLocalNumber() {
        String numberNational;
        String localNumber = getLocalNumber();
        PhoneNumberFormatter value = this.phoneNumberFormatter.getValue();
        PhoneNumberFormatter.WithRegion withRegion = value instanceof PhoneNumberFormatter.WithRegion ? (PhoneNumberFormatter.WithRegion) value : null;
        return (withRegion == null || (numberNational = withRegion.formatNumberNational(localNumber)) == null) ? localNumber : numberNational;
    }

    public final void onValueChange(String displayFormatted) {
        Intrinsics.checkNotNullParameter(displayFormatted, "displayFormatted");
        this._fieldValue.setValue(this.phoneNumberFormatter.getValue().userInputFilter(displayFormatted));
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public void onRawValueChange(String rawValue) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        onValueChange(rawValue);
    }

    public final void onFocusChange(boolean newHasFocus) {
        this._hasFocus.setValue(Boolean.valueOf(newHasFocus));
    }

    /* compiled from: PhoneNumberController.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;", "", "<init>", "()V", "createPhoneNumberController", "Lcom/stripe/android/uicore/elements/PhoneNumberController;", "initialValue", "", "initiallySelectedCountryCode", "overrideCountryCodes", "", "showOptionalLabel", "", "acceptAnyInput", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ PhoneNumberController createPhoneNumberController$default(Companion companion, String str, String str2, Set set, boolean z, boolean z2, int i, Object obj) {
            boolean z3;
            boolean z4;
            String str3;
            Set set2;
            Companion companion2;
            String str4;
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                set = SetsKt.emptySet();
            }
            if ((i & 8) != 0) {
                z = false;
            }
            if ((i & 16) != 0) {
                z3 = false;
                set2 = set;
                z4 = z;
                str4 = str;
                str3 = str2;
                companion2 = companion;
            } else {
                z3 = z2;
                z4 = z;
                str3 = str2;
                set2 = set;
                companion2 = companion;
                str4 = str;
            }
            return companion2.createPhoneNumberController(str4, str3, set2, z4, z3);
        }

        public final PhoneNumberController createPhoneNumberController(String initialValue, String initiallySelectedCountryCode, Set<String> overrideCountryCodes, boolean showOptionalLabel, boolean acceptAnyInput) {
            Intrinsics.checkNotNullParameter(initialValue, "initialValue");
            Intrinsics.checkNotNullParameter(overrideCountryCodes, "overrideCountryCodes");
            PhoneNumberFormatter phoneNumberFormatterForCountry = null;
            boolean zStartsWith$default = StringsKt.startsWith$default(initialValue, "+", false, 2, (Object) null);
            if (initiallySelectedCountryCode == null && zStartsWith$default) {
                phoneNumberFormatterForCountry = PhoneNumberFormatter.INSTANCE.forPrefix(initialValue);
            } else if (initiallySelectedCountryCode != null) {
                phoneNumberFormatterForCountry = PhoneNumberFormatter.INSTANCE.forCountry(initiallySelectedCountryCode);
            }
            if (phoneNumberFormatterForCountry != null) {
                String prefix = phoneNumberFormatterForCountry.getPrefix();
                return new PhoneNumberController(StringsKt.removePrefix(phoneNumberFormatterForCountry.toE164Format(StringsKt.removePrefix(initialValue, (CharSequence) prefix)), (CharSequence) prefix), phoneNumberFormatterForCountry.getCountryCode(), overrideCountryCodes, showOptionalLabel, acceptAnyInput, null);
            }
            return new PhoneNumberController(initialValue, initiallySelectedCountryCode, overrideCountryCodes, showOptionalLabel, acceptAnyInput, null);
        }
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldComposable
    public void ComposeUI(boolean z, SectionFieldElement field, Modifier modifier, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, Composer composer, int i) {
        int iM5781getDoneeUduSuo;
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
        composer.startReplaceGroup(1343378051);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1343378051, i, -1, "com.stripe.android.uicore.elements.PhoneNumberController.ComposeUI (PhoneNumberController.kt:186)");
        }
        if (!Intrinsics.areEqual(identifierSpec, field.getIdentifier())) {
            iM5781getDoneeUduSuo = ImeAction.INSTANCE.m5783getNexteUduSuo();
        } else {
            iM5781getDoneeUduSuo = ImeAction.INSTANCE.m5781getDoneeUduSuo();
        }
        PhoneNumberElementUIKt.m8823PhoneNumberElementUIRts_TWA(z, this, modifier, null, false, false, null, null, iM5781getDoneeUduSuo, composer, (i & 14) | ((i >> 12) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i & 896), 248);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
