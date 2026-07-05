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

/* compiled from: SaveForFutureUseController.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u0005J\u0010\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0003H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\fR\u0014\u0010\u0018\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\f¨\u0006#"}, d2 = {"Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;", "Lcom/stripe/android/uicore/elements/InputController;", "merchantName", "", "saveForFutureUseInitialValue", "", "<init>", "(Ljava/lang/String;Z)V", "label", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/core/strings/ResolvableString;", "getLabel", "()Lkotlinx/coroutines/flow/StateFlow;", "_saveForFutureUse", "Lkotlinx/coroutines/flow/MutableStateFlow;", "saveForFutureUse", "getSaveForFutureUse", "fieldValue", "getFieldValue", "rawFieldValue", "getRawFieldValue", "error", "Lcom/stripe/android/uicore/elements/FieldError;", "getError", "showOptionalLabel", "getShowOptionalLabel", "()Z", "isComplete", "formFieldValue", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValue", "onValueChange", "", "onRawValueChange", "rawValue", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SaveForFutureUseController implements InputController {
    public static final int $stable = 8;
    private final MutableStateFlow<Boolean> _saveForFutureUse;
    private final StateFlow<FieldError> error;
    private final StateFlow<String> fieldValue;
    private final StateFlow<FormFieldEntry> formFieldValue;
    private final StateFlow<Boolean> isComplete;
    private final StateFlow<ResolvableString> label;
    private final StateFlow<String> rawFieldValue;
    private final StateFlow<Boolean> saveForFutureUse;
    private final boolean showOptionalLabel;

    public SaveForFutureUseController(String str, boolean z) {
        this.label = StateFlowKt.MutableStateFlow(ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_save_payment_details_to_merchant_name, new Object[]{str}, null, 4, null));
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(z));
        this._saveForFutureUse = MutableStateFlow;
        MutableStateFlow<Boolean> mutableStateFlow = MutableStateFlow;
        this.saveForFutureUse = mutableStateFlow;
        this.fieldValue = StateFlowsKt.mapAsStateFlow(mutableStateFlow, new Function1() { // from class: com.stripe.android.ui.core.elements.SaveForFutureUseController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return String.valueOf(((Boolean) obj).booleanValue());
            }
        });
        this.rawFieldValue = getFieldValue();
        this.error = StateFlowsKt.stateFlowOf(null);
        this.isComplete = StateFlowsKt.stateFlowOf(true);
        this.formFieldValue = StateFlowsKt.combineAsStateFlow(isComplete(), getRawFieldValue(), new Function2() { // from class: com.stripe.android.ui.core.elements.SaveForFutureUseController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SaveForFutureUseController.formFieldValue$lambda$1(((Boolean) obj).booleanValue(), (String) obj2);
            }
        });
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public StateFlow<ResolvableString> getLabel() {
        return this.label;
    }

    public final StateFlow<Boolean> getSaveForFutureUse() {
        return this.saveForFutureUse;
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
    public static final FormFieldEntry formFieldValue$lambda$1(boolean z, String str) {
        return new FormFieldEntry(str, z);
    }

    public final void onValueChange(boolean saveForFutureUse) {
        this._saveForFutureUse.setValue(Boolean.valueOf(saveForFutureUse));
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public void onRawValueChange(String rawValue) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        Boolean booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(rawValue);
        onValueChange(booleanStrictOrNull != null ? booleanStrictOrNull.booleanValue() : true);
    }
}
