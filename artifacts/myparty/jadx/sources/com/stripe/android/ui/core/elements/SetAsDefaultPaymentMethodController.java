package com.stripe.android.ui.core.elements;

import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.ui.core.R;
import com.stripe.android.uicore.elements.FieldError;
import com.stripe.android.uicore.elements.InputController;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.uicore.utils.StateFlowsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: SetAsDefaultPaymentMethodController.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\"\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u0003J\u0010\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0014H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\fR\u0014\u0010\u001b\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\f¨\u0006&"}, d2 = {"Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodController;", "Lcom/stripe/android/uicore/elements/InputController;", "setAsDefaultPaymentMethodInitialValue", "", "saveForFutureUseCheckedFlow", "Lkotlinx/coroutines/flow/StateFlow;", "setAsDefaultMatchesSaveForFutureUse", "<init>", "(ZLkotlinx/coroutines/flow/StateFlow;Z)V", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "getLabel", "()Lkotlinx/coroutines/flow/StateFlow;", "_setAsDefaultPaymentMethodChecked", "Lkotlinx/coroutines/flow/MutableStateFlow;", "setAsDefaultPaymentMethodChecked", "getSetAsDefaultPaymentMethodChecked", "shouldPaymentMethodBeSetAsDefault", "getShouldPaymentMethodBeSetAsDefault", "fieldValue", "", "getFieldValue", "rawFieldValue", "getRawFieldValue", "error", "Lcom/stripe/android/uicore/elements/FieldError;", "getError", "showOptionalLabel", "getShowOptionalLabel", "()Z", "isComplete", "formFieldValue", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValue", "onValueChange", "", "onRawValueChange", "rawValue", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SetAsDefaultPaymentMethodController implements InputController {
    public static final int $stable = 8;
    private final MutableStateFlow<Boolean> _setAsDefaultPaymentMethodChecked;
    private final StateFlow<FieldError> error;
    private final StateFlow<String> fieldValue;
    private final StateFlow<FormFieldEntry> formFieldValue;
    private final StateFlow<Boolean> isComplete;
    private final StateFlow<ResolvableString> label;
    private final StateFlow<String> rawFieldValue;
    private final StateFlow<Boolean> setAsDefaultPaymentMethodChecked;
    private final StateFlow<Boolean> shouldPaymentMethodBeSetAsDefault;
    private final boolean showOptionalLabel;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldPaymentMethodBeSetAsDefault$lambda$0(boolean z, boolean z2, boolean z3) {
        if (z2) {
            return z || z3;
        }
        return false;
    }

    public SetAsDefaultPaymentMethodController(boolean z, StateFlow<Boolean> saveForFutureUseCheckedFlow, final boolean z2) {
        Intrinsics.checkNotNullParameter(saveForFutureUseCheckedFlow, "saveForFutureUseCheckedFlow");
        this.label = StateFlowKt.MutableStateFlow(ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_set_as_default_payment_method, new Object[0], null, 4, null));
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(z));
        this._setAsDefaultPaymentMethodChecked = MutableStateFlow;
        MutableStateFlow<Boolean> mutableStateFlow = MutableStateFlow;
        this.setAsDefaultPaymentMethodChecked = mutableStateFlow;
        StateFlow<Boolean> stateFlowCombineAsStateFlow = StateFlowsKt.combineAsStateFlow(saveForFutureUseCheckedFlow, mutableStateFlow, new Function2() { // from class: com.stripe.android.ui.core.elements.SetAsDefaultPaymentMethodController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(SetAsDefaultPaymentMethodController.shouldPaymentMethodBeSetAsDefault$lambda$0(z2, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue()));
            }
        });
        this.shouldPaymentMethodBeSetAsDefault = stateFlowCombineAsStateFlow;
        this.fieldValue = StateFlowsKt.mapAsStateFlow(stateFlowCombineAsStateFlow, new Function1() { // from class: com.stripe.android.ui.core.elements.SetAsDefaultPaymentMethodController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return String.valueOf(((Boolean) obj).booleanValue());
            }
        });
        this.rawFieldValue = getFieldValue();
        this.error = StateFlowsKt.stateFlowOf(null);
        this.isComplete = StateFlowsKt.stateFlowOf(true);
        this.formFieldValue = StateFlowsKt.combineAsStateFlow(isComplete(), getRawFieldValue(), new Function2() { // from class: com.stripe.android.ui.core.elements.SetAsDefaultPaymentMethodController$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SetAsDefaultPaymentMethodController.formFieldValue$lambda$2(((Boolean) obj).booleanValue(), (String) obj2);
            }
        });
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public StateFlow<ResolvableString> getLabel() {
        return this.label;
    }

    public final StateFlow<Boolean> getSetAsDefaultPaymentMethodChecked() {
        return this.setAsDefaultPaymentMethodChecked;
    }

    public final StateFlow<Boolean> getShouldPaymentMethodBeSetAsDefault() {
        return this.shouldPaymentMethodBeSetAsDefault;
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
    public static final FormFieldEntry formFieldValue$lambda$2(boolean z, String str) {
        return new FormFieldEntry(str, z);
    }

    public final void onValueChange(boolean setAsDefaultPaymentMethodChecked) {
        this._setAsDefaultPaymentMethodChecked.setValue(Boolean.valueOf(setAsDefaultPaymentMethodChecked));
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public void onRawValueChange(String rawValue) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        Boolean booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(rawValue);
        onValueChange(booleanStrictOrNull != null ? booleanStrictOrNull.booleanValue() : true);
    }
}
