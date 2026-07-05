package com.stripe.android.ui.core.elements;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.VisualTransformation;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.R;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.model.CardBrand;
import com.stripe.android.uicore.elements.TextFieldState;
import com.stripe.android.uicore.elements.TextFieldStateConstants;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CvcConfig.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0016J\u0010\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\nH\u0016J\u0010\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\nH\u0016R\u0016\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0013\u0010\u0007¨\u0006$"}, d2 = {"Lcom/stripe/android/ui/core/elements/CvcConfig;", "Lcom/stripe/android/ui/core/elements/CardDetailsTextFieldConfig;", "<init>", "()V", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "getCapitalization-IUNYP9k", "()I", "I", "debugLabel", "", "getDebugLabel", "()Ljava/lang/String;", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "getLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "keyboard", "Landroidx/compose/ui/text/input/KeyboardType;", "getKeyboard-PjHm6EE", "determineVisualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "number", "panLength", "", "determineState", "Lcom/stripe/android/uicore/elements/TextFieldState;", "brand", "Lcom/stripe/android/model/CardBrand;", "numberAllowedDigits", ViewProps.FILTER, "userTyped", "convertToRaw", "displayName", "convertFromRaw", "rawValue", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CvcConfig implements CardDetailsTextFieldConfig {
    public static final int $stable = 8;
    private final int capitalization = KeyboardCapitalization.INSTANCE.m5813getNoneIUNYP9k();
    private final String debugLabel = "cvc";
    private final ResolvableString label = ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_cvc_number_hint, new Object[0], null, 4, null);
    private final int keyboard = androidx.compose.ui.text.input.KeyboardType.INSTANCE.m5838getNumberPasswordPjHm6EE();

    @Override // com.stripe.android.ui.core.elements.CardDetailsTextFieldConfig
    public String convertFromRaw(String rawValue) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        return rawValue;
    }

    @Override // com.stripe.android.ui.core.elements.CardDetailsTextFieldConfig
    public String convertToRaw(String displayName) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        return displayName;
    }

    @Override // com.stripe.android.ui.core.elements.CardDetailsTextFieldConfig
    /* renamed from: getCapitalization-IUNYP9k, reason: from getter */
    public int getCapitalization() {
        return this.capitalization;
    }

    @Override // com.stripe.android.ui.core.elements.CardDetailsTextFieldConfig
    public String getDebugLabel() {
        return this.debugLabel;
    }

    @Override // com.stripe.android.ui.core.elements.CardDetailsTextFieldConfig
    public ResolvableString getLabel() {
        return this.label;
    }

    @Override // com.stripe.android.ui.core.elements.CardDetailsTextFieldConfig
    /* renamed from: getKeyboard-PjHm6EE, reason: from getter */
    public int getKeyboard() {
        return this.keyboard;
    }

    @Override // com.stripe.android.ui.core.elements.CardDetailsTextFieldConfig
    public VisualTransformation determineVisualTransformation(String number, int panLength) {
        Intrinsics.checkNotNullParameter(number, "number");
        return VisualTransformation.INSTANCE.getNone();
    }

    @Override // com.stripe.android.ui.core.elements.CardDetailsTextFieldConfig
    public TextFieldState determineState(CardBrand brand, String number, int numberAllowedDigits) {
        TextFieldStateConstants.Valid.Limitless limitless;
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(number, "number");
        boolean z = brand.getMaxCvcLength() != -1;
        if (number.length() == 0) {
            return TextFieldStateConstants.Error.Blank.INSTANCE;
        }
        if (brand == CardBrand.Unknown) {
            if (number.length() == numberAllowedDigits) {
                limitless = TextFieldStateConstants.Valid.Full.INSTANCE;
            } else {
                limitless = TextFieldStateConstants.Valid.Limitless.INSTANCE;
            }
            return limitless;
        }
        if (z && number.length() == numberAllowedDigits) {
            return TextFieldStateConstants.Valid.Full.INSTANCE;
        }
        if (z && brand.getCvcLength().contains(Integer.valueOf(number.length()))) {
            return TextFieldStateConstants.Valid.Limitless.INSTANCE;
        }
        if (z && number.length() < numberAllowedDigits) {
            return new TextFieldStateConstants.Error.Incomplete(R.string.stripe_invalid_cvc);
        }
        if (z && number.length() > numberAllowedDigits) {
            return new TextFieldStateConstants.Error.Invalid(R.string.stripe_invalid_cvc, null, false, 6, null);
        }
        return new TextFieldStateConstants.Error.Invalid(R.string.stripe_invalid_cvc, null, false, 6, null);
    }

    @Override // com.stripe.android.ui.core.elements.CardDetailsTextFieldConfig
    public String filter(String userTyped) throws IOException {
        Intrinsics.checkNotNullParameter(userTyped, "userTyped");
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
