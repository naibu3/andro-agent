package com.stripe.android.ui.core.elements;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.ui.core.R;
import com.stripe.android.uicore.elements.TextFieldConfig;
import com.stripe.android.uicore.elements.TextFieldIcon;
import com.stripe.android.uicore.elements.TextFieldState;
import com.stripe.android.uicore.elements.TextFieldStateConstants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: UpiConfig.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0014H\u0016J\u0010\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0014H\u0016J\u0010\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u0014H\u0016J\u0010\u0010-\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u0014H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u0011R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"¨\u0006/"}, d2 = {"Lcom/stripe/android/ui/core/elements/UpiConfig;", "Lcom/stripe/android/uicore/elements/TextFieldConfig;", "<init>", "()V", "upiPattern", "Lkotlin/text/Regex;", "getUpiPattern", "()Lkotlin/text/Regex;", "upiPattern$delegate", "Lkotlin/Lazy;", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "getLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "getCapitalization-IUNYP9k", "()I", "I", "debugLabel", "", "getDebugLabel", "()Ljava/lang/String;", "keyboard", "Landroidx/compose/ui/text/input/KeyboardType;", "getKeyboard-PjHm6EE", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation", "()Landroidx/compose/ui/text/input/VisualTransformation;", "trailingIcon", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "getTrailingIcon", "()Lkotlinx/coroutines/flow/StateFlow;", "loading", "", "getLoading", "determineState", "Lcom/stripe/android/uicore/elements/TextFieldState;", "input", ViewProps.FILTER, "userTyped", "convertToRaw", "displayName", "convertFromRaw", "rawValue", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UpiConfig implements TextFieldConfig {
    public static final int $stable = 8;
    private final VisualTransformation visualTransformation;

    /* renamed from: upiPattern$delegate, reason: from kotlin metadata */
    private final Lazy upiPattern = LazyKt.lazy(new Function0() { // from class: com.stripe.android.ui.core.elements.UpiConfig$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UpiConfig.upiPattern_delegate$lambda$0();
        }
    });
    private final ResolvableString label = ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_upi_id_label, new Object[0], null, 4, null);
    private final int capitalization = KeyboardCapitalization.INSTANCE.m5813getNoneIUNYP9k();
    private final String debugLabel = "upi_id";
    private final int keyboard = androidx.compose.ui.text.input.KeyboardType.INSTANCE.m5836getEmailPjHm6EE();
    private final StateFlow<TextFieldIcon> trailingIcon = StateFlowKt.MutableStateFlow(null);
    private final StateFlow<Boolean> loading = StateFlowKt.MutableStateFlow(false);

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String convertFromRaw(String rawValue) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        return rawValue;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String convertToRaw(String displayName) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        return displayName;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public LayoutDirection getLayoutDirection() {
        return TextFieldConfig.DefaultImpls.getLayoutDirection(this);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public Function1<String, ResolvableString> getOverrideContentDescriptionProvider() {
        return TextFieldConfig.DefaultImpls.getOverrideContentDescriptionProvider(this);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String getPlaceHolder() {
        return TextFieldConfig.DefaultImpls.getPlaceHolder(this);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public boolean getShouldAnnounceFieldValue() {
        return TextFieldConfig.DefaultImpls.getShouldAnnounceFieldValue(this);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public boolean getShouldAnnounceLabel() {
        return TextFieldConfig.DefaultImpls.getShouldAnnounceLabel(this);
    }

    private final Regex getUpiPattern() {
        return (Regex) this.upiPattern.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Regex upiPattern_delegate$lambda$0() {
        return new Regex("[a-zA-Z0-9.\\-_]{2,256}@[a-zA-Z]{2,64}");
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public ResolvableString getLabel() {
        return this.label;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    /* renamed from: getCapitalization-IUNYP9k, reason: from getter */
    public int getCapitalization() {
        return this.capitalization;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String getDebugLabel() {
        return this.debugLabel;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    /* renamed from: getKeyboard-PjHm6EE, reason: from getter */
    public int getKeyboard() {
        return this.keyboard;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public VisualTransformation getVisualTransformation() {
        return this.visualTransformation;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public StateFlow<TextFieldIcon> getTrailingIcon() {
        return this.trailingIcon;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public StateFlow<Boolean> getLoading() {
        return this.loading;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public TextFieldState determineState(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        String str = input;
        boolean z = getUpiPattern().matches(str) && input.length() <= 30;
        if (str.length() == 0) {
            return TextFieldStateConstants.Error.Blank.INSTANCE;
        }
        if (z) {
            return TextFieldStateConstants.Valid.Limitless.INSTANCE;
        }
        return new TextFieldStateConstants.Error.Incomplete(R.string.stripe_invalid_upi_id);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String filter(String userTyped) {
        Intrinsics.checkNotNullParameter(userTyped, "userTyped");
        return StringsKt.trim((CharSequence) userTyped).toString();
    }
}
