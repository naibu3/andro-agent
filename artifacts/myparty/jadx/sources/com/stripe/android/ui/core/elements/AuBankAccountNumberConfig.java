package com.stripe.android.ui.core.elements;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.R;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.uicore.elements.TextFieldConfig;
import com.stripe.android.uicore.elements.TextFieldIcon;
import com.stripe.android.uicore.elements.TextFieldState;
import com.stripe.android.uicore.elements.TextFieldStateConstants;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.CharRange;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: AuBankAccountNumberConfig.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\nH\u0016J\u0010\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\nH\u0016J\u0010\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0016J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\nH\u0016R\u0016\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u001eX\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001f\u0010\u0007¨\u0006*"}, d2 = {"Lcom/stripe/android/ui/core/elements/AuBankAccountNumberConfig;", "Lcom/stripe/android/uicore/elements/TextFieldConfig;", "<init>", "()V", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "getCapitalization-IUNYP9k", "()I", "I", "debugLabel", "", "getDebugLabel", "()Ljava/lang/String;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation", "()Landroidx/compose/ui/text/input/VisualTransformation;", "trailingIcon", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "getTrailingIcon", "()Lkotlinx/coroutines/flow/StateFlow;", "loading", "", "getLoading", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "getLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "keyboard", "Landroidx/compose/ui/text/input/KeyboardType;", "getKeyboard-PjHm6EE", ViewProps.FILTER, "userTyped", "convertToRaw", "displayName", "convertFromRaw", "rawValue", "determineState", "Lcom/stripe/android/uicore/elements/TextFieldState;", "input", "Companion", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AuBankAccountNumberConfig implements TextFieldConfig {

    @Deprecated
    public static final int MAXIMUM_LENGTH = 9;

    @Deprecated
    public static final int MINIMUM_LENGTH = 4;
    private final VisualTransformation visualTransformation;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final CharRange VALID_INPUT_RANGES = new CharRange('0', '9');
    private final int capitalization = KeyboardCapitalization.INSTANCE.m5813getNoneIUNYP9k();
    private final String debugLabel = "au_bank_account_number";
    private final StateFlow<TextFieldIcon> trailingIcon = StateFlowKt.MutableStateFlow(null);
    private final StateFlow<Boolean> loading = StateFlowKt.MutableStateFlow(false);
    private final ResolvableString label = ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_becs_widget_account_number, new Object[0], null, 4, null);
    private final int keyboard = androidx.compose.ui.text.input.KeyboardType.INSTANCE.m5837getNumberPjHm6EE();

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

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    /* renamed from: getCapitalization-IUNYP9k, reason: not valid java name and from getter */
    public int getCapitalization() {
        return this.capitalization;
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
    public StateFlow<TextFieldIcon> getTrailingIcon() {
        return this.trailingIcon;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public StateFlow<Boolean> getLoading() {
        return this.loading;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public ResolvableString getLabel() {
        return this.label;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    /* renamed from: getKeyboard-PjHm6EE, reason: not valid java name and from getter */
    public int getKeyboard() {
        return this.keyboard;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public TextFieldState determineState(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (StringsKt.isBlank(input)) {
            return TextFieldStateConstants.Error.Blank.INSTANCE;
        }
        if (input.length() < 4) {
            return new TextFieldStateConstants.Error.Incomplete(R.string.stripe_becs_widget_account_number_incomplete);
        }
        if (input.length() < 9) {
            return TextFieldStateConstants.Valid.Limitless.INSTANCE;
        }
        return TextFieldStateConstants.Valid.Full.INSTANCE;
    }

    /* compiled from: AuBankAccountNumberConfig.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/ui/core/elements/AuBankAccountNumberConfig$Companion;", "", "<init>", "()V", "MINIMUM_LENGTH", "", "MAXIMUM_LENGTH", "VALID_INPUT_RANGES", "Lkotlin/ranges/CharRange;", "getVALID_INPUT_RANGES", "()Lkotlin/ranges/CharRange;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CharRange getVALID_INPUT_RANGES() {
            return AuBankAccountNumberConfig.VALID_INPUT_RANGES;
        }
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String filter(String userTyped) throws IOException {
        Intrinsics.checkNotNullParameter(userTyped, "userTyped");
        String str = userTyped;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (VALID_INPUT_RANGES.contains(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return StringsKt.take(sb.toString(), 9);
    }
}
