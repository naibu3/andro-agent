package com.stripe.android.uicore.elements;

import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.uicore.R;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.uicore.utils.StateFlowsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: SameAsShippingController.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u0003J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0010H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\n¨\u0006\""}, d2 = {"Lcom/stripe/android/uicore/elements/SameAsShippingController;", "Lcom/stripe/android/uicore/elements/InputController;", "initialValue", "", "<init>", "(Z)V", "label", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/core/strings/ResolvableString;", "getLabel", "()Lkotlinx/coroutines/flow/StateFlow;", "_value", "Lkotlinx/coroutines/flow/MutableStateFlow;", "value", "getValue", "fieldValue", "", "getFieldValue", "rawFieldValue", "getRawFieldValue", "error", "Lcom/stripe/android/uicore/elements/FieldError;", "getError", "showOptionalLabel", "getShowOptionalLabel", "()Z", "isComplete", "formFieldValue", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValue", "onValueChange", "", "onRawValueChange", "rawValue", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SameAsShippingController implements InputController {
    public static final int $stable = 8;
    private final MutableStateFlow<Boolean> _value;
    private final StateFlow<FieldError> error;
    private final StateFlow<String> fieldValue;
    private final StateFlow<FormFieldEntry> formFieldValue;
    private final StateFlow<Boolean> isComplete;
    private final StateFlow<ResolvableString> label = StateFlowsKt.stateFlowOf(ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_billing_same_as_shipping, new Object[0], null, 4, null));
    private final StateFlow<String> rawFieldValue;
    private final boolean showOptionalLabel;
    private final StateFlow<Boolean> value;

    public SameAsShippingController(boolean z) {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(z));
        this._value = MutableStateFlow;
        StateFlow<Boolean> stateFlowAsStateFlow = FlowKt.asStateFlow(MutableStateFlow);
        this.value = stateFlowAsStateFlow;
        this.fieldValue = StateFlowsKt.mapAsStateFlow(stateFlowAsStateFlow, new Function1() { // from class: com.stripe.android.uicore.elements.SameAsShippingController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return String.valueOf(((Boolean) obj).booleanValue());
            }
        });
        this.rawFieldValue = getFieldValue();
        this.error = StateFlowsKt.stateFlowOf(null);
        this.isComplete = StateFlowsKt.stateFlowOf(true);
        this.formFieldValue = StateFlowsKt.mapAsStateFlow(getRawFieldValue(), new Function1() { // from class: com.stripe.android.uicore.elements.SameAsShippingController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SameAsShippingController.formFieldValue$lambda$1((String) obj);
            }
        });
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public StateFlow<ResolvableString> getLabel() {
        return this.label;
    }

    public final StateFlow<Boolean> getValue() {
        return this.value;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public StateFlow<String> getFieldValue() {
        return this.fieldValue;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public StateFlow<String> getRawFieldValue() {
        return this.rawFieldValue;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldErrorController
    public StateFlow<FieldError> getError() {
        return this.error;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public StateFlow<Boolean> isComplete() {
        return this.isComplete;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public StateFlow<FormFieldEntry> getFormFieldValue() {
        return this.formFieldValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FormFieldEntry formFieldValue$lambda$1(String str) {
        return new FormFieldEntry(str, true);
    }

    public final void onValueChange(boolean value) {
        this._value.setValue(Boolean.valueOf(value));
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public void onRawValueChange(String rawValue) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        Boolean booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(rawValue);
        onValueChange(booleanStrictOrNull != null ? booleanStrictOrNull.booleanValue() : true);
    }
}
