package com.stripe.android.uicore.elements;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.uicore.R;
import com.stripe.android.uicore.elements.TextFieldConfig;
import com.stripe.android.uicore.elements.TextFieldStateConstants;
import java.io.IOException;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: DateConfig.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\nH\u0016J\u0010\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\nH\u0016J\u0010\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020\nH\u0016J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\nH\u0016R\u0016\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0014\u0010 \u001a\u00020!X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u001eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u001eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&¨\u00063"}, d2 = {"Lcom/stripe/android/uicore/elements/DateConfig;", "Lcom/stripe/android/uicore/elements/TextFieldConfig;", "<init>", "()V", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "getCapitalization-IUNYP9k", "()I", "I", "debugLabel", "", "getDebugLabel", "()Ljava/lang/String;", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "getLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "keyboard", "Landroidx/compose/ui/text/input/KeyboardType;", "getKeyboard-PjHm6EE", "visualTransformation", "Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation;", "getVisualTransformation", "()Lcom/stripe/android/uicore/elements/ExpiryDateVisualTransformation;", "trailingIcon", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "getTrailingIcon", "()Lkotlinx/coroutines/flow/StateFlow;", "loading", "", "getLoading", ViewProps.LAYOUT_DIRECTION, "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "shouldAnnounceFieldValue", "getShouldAnnounceFieldValue", "()Z", "shouldAnnounceLabel", "getShouldAnnounceLabel", ViewProps.FILTER, "userTyped", "convertToRaw", "displayName", "convertFromRaw", "rawValue", "determineState", "Lcom/stripe/android/uicore/elements/TextFieldState;", "input", "Companion", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DateConfig implements TextFieldConfig {
    private final boolean shouldAnnounceFieldValue;
    private final boolean shouldAnnounceLabel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final int capitalization = KeyboardCapitalization.INSTANCE.m5813getNoneIUNYP9k();
    private final String debugLabel = "date";
    private final ResolvableString label = ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_expiration_date_hint, new Object[0], null, 4, null);
    private final int keyboard = KeyboardType.INSTANCE.m5838getNumberPasswordPjHm6EE();
    private final ExpiryDateVisualTransformation visualTransformation = new ExpiryDateVisualTransformation(null, 1, null == true ? 1 : 0);
    private final StateFlow<TextFieldIcon> trailingIcon = StateFlowKt.MutableStateFlow(null);
    private final StateFlow<Boolean> loading = StateFlowKt.MutableStateFlow(false);
    private final LayoutDirection layoutDirection = LayoutDirection.Ltr;

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
    public Function1<String, ResolvableString> getOverrideContentDescriptionProvider() {
        return TextFieldConfig.DefaultImpls.getOverrideContentDescriptionProvider(this);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String getPlaceHolder() {
        return TextFieldConfig.DefaultImpls.getPlaceHolder(this);
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
    public ResolvableString getLabel() {
        return this.label;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    /* renamed from: getKeyboard-PjHm6EE, reason: from getter */
    public int getKeyboard() {
        return this.keyboard;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public ExpiryDateVisualTransformation getVisualTransformation() {
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
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public boolean getShouldAnnounceFieldValue() {
        return this.shouldAnnounceFieldValue;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public boolean getShouldAnnounceLabel() {
        return this.shouldAnnounceLabel;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public TextFieldState determineState(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (StringsKt.isBlank(input)) {
            return TextFieldStateConstants.Error.Blank.INSTANCE;
        }
        String strConvertTo4DigitDate = ConvertTo4DigitDateKt.convertTo4DigitDate(input);
        if (strConvertTo4DigitDate.length() < 4) {
            return new TextFieldStateConstants.Error.Incomplete(R.string.stripe_incomplete_expiry_date);
        }
        if (strConvertTo4DigitDate.length() > 4) {
            return new TextFieldStateConstants.Error.Invalid(R.string.stripe_incomplete_expiry_date, null, false, 6, null);
        }
        Companion companion = INSTANCE;
        Integer intOrNull = StringsKt.toIntOrNull(StringsKt.take(strConvertTo4DigitDate, 2));
        if (intOrNull == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        int iIntValue = intOrNull.intValue();
        Integer intOrNull2 = StringsKt.toIntOrNull(StringsKt.takeLast(strConvertTo4DigitDate, 2));
        if (intOrNull2 != null) {
            return companion.determineTextFieldState(iIntValue, intOrNull2.intValue(), Calendar.getInstance().get(2) + 1, Calendar.getInstance().get(1));
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* compiled from: DateConfig.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0007¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/uicore/elements/DateConfig$Companion;", "", "<init>", "()V", "determineTextFieldState", "Lcom/stripe/android/uicore/elements/TextFieldState;", "month1Based", "", "twoDigitYear", "current1BasedMonth", "currentYear", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TextFieldState determineTextFieldState(int month1Based, int twoDigitYear, int current1BasedMonth, int currentYear) {
            int i = twoDigitYear - (currentYear % 100);
            boolean z = i < 0;
            boolean z2 = i > 50;
            boolean z3 = i == 0 && current1BasedMonth > month1Based;
            boolean z4 = 1 <= month1Based && month1Based < 13;
            if (z) {
                return new TextFieldStateConstants.Error.Invalid(R.string.stripe_invalid_expiry_year, null, true, 2, null);
            }
            if (z2) {
                return new TextFieldStateConstants.Error.Invalid(R.string.stripe_invalid_expiry_year, null, true, 2, null);
            }
            if (z3) {
                return new TextFieldStateConstants.Error.Invalid(R.string.stripe_invalid_expiry_month, null, true, 2, null);
            }
            if (!z4) {
                return new TextFieldStateConstants.Error.Incomplete(R.string.stripe_invalid_expiry_month);
            }
            return TextFieldStateConstants.Valid.Full.INSTANCE;
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
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }
}
