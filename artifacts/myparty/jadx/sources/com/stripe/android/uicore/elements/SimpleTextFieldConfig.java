package com.stripe.android.uicore.elements;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.uicore.elements.TextFieldConfig;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: SimpleTextFieldConfig.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016H\u0016J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0016H\u0016J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0016H\u0016J\u0010\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u0016H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014¨\u0006)"}, d2 = {"Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;", "Lcom/stripe/android/uicore/elements/TextFieldConfig;", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "keyboard", "Landroidx/compose/ui/text/input/KeyboardType;", "trailingIcon", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "<init>", "(Lcom/stripe/android/core/strings/ResolvableString;IILkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "getCapitalization-IUNYP9k", "()I", "I", "getKeyboard-PjHm6EE", "getTrailingIcon", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "debugLabel", "", "getDebugLabel", "()Ljava/lang/String;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation", "()Landroidx/compose/ui/text/input/VisualTransformation;", "loading", "", "getLoading", "determineState", "Lcom/stripe/android/uicore/elements/TextFieldState;", "input", ViewProps.FILTER, "userTyped", "convertToRaw", "displayName", "convertFromRaw", "rawValue", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public class SimpleTextFieldConfig implements TextFieldConfig {
    public static final int $stable = 8;
    private final int capitalization;
    private final String debugLabel;
    private final int keyboard;
    private final ResolvableString label;
    private final MutableStateFlow<Boolean> loading;
    private final MutableStateFlow<TextFieldIcon> trailingIcon;
    private final VisualTransformation visualTransformation;

    public /* synthetic */ SimpleTextFieldConfig(ResolvableString resolvableString, int i, int i2, MutableStateFlow mutableStateFlow, DefaultConstructorMarker defaultConstructorMarker) {
        this(resolvableString, i, i2, mutableStateFlow);
    }

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

    private SimpleTextFieldConfig(ResolvableString label, int i, int i2, MutableStateFlow<TextFieldIcon> trailingIcon) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(trailingIcon, "trailingIcon");
        this.label = label;
        this.capitalization = i;
        this.keyboard = i2;
        this.trailingIcon = trailingIcon;
        this.debugLabel = "generic_text";
        this.loading = StateFlowKt.MutableStateFlow(false);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public ResolvableString getLabel() {
        return this.label;
    }

    public /* synthetic */ SimpleTextFieldConfig(ResolvableString resolvableString, int i, int i2, MutableStateFlow mutableStateFlow, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(resolvableString, (i3 & 2) != 0 ? KeyboardCapitalization.INSTANCE.m5816getWordsIUNYP9k() : i, (i3 & 4) != 0 ? KeyboardType.INSTANCE.m5841getTextPjHm6EE() : i2, (i3 & 8) != 0 ? StateFlowKt.MutableStateFlow(null) : mutableStateFlow, null);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    /* renamed from: getCapitalization-IUNYP9k, reason: from getter */
    public int getCapitalization() {
        return this.capitalization;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    /* renamed from: getKeyboard-PjHm6EE, reason: from getter */
    public int getKeyboard() {
        return this.keyboard;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public MutableStateFlow<TextFieldIcon> getTrailingIcon() {
        return this.trailingIcon;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String getDebugLabel() {
        return this.debugLabel;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public VisualTransformation getVisualTransformation() {
        return this.visualTransformation;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public MutableStateFlow<Boolean> getLoading() {
        return this.loading;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public TextFieldState determineState(final String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new TextFieldState() { // from class: com.stripe.android.uicore.elements.SimpleTextFieldConfig.determineState.1
            @Override // com.stripe.android.uicore.elements.TextFieldState
            public FieldError getError() {
                return null;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            /* renamed from: isFull */
            public boolean getPreventMoreInput() {
                return false;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean shouldShowError(boolean hasFocus) {
                return false;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean isValid() {
                return !StringsKt.isBlank(input);
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean isBlank() {
                return StringsKt.isBlank(input);
            }
        };
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String filter(String userTyped) throws IOException {
        Intrinsics.checkNotNullParameter(userTyped, "userTyped");
        if (!SetsKt.setOf((Object[]) new KeyboardType[]{KeyboardType.m5817boximpl(KeyboardType.INSTANCE.m5837getNumberPjHm6EE()), KeyboardType.m5817boximpl(KeyboardType.INSTANCE.m5838getNumberPasswordPjHm6EE())}).contains(KeyboardType.m5817boximpl(getKeyboard()))) {
            return userTyped;
        }
        String str = userTyped;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }
}
