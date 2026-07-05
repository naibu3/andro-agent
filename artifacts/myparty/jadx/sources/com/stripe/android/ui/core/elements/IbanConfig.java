package com.stripe.android.ui.core.elements;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
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
import java.io.IOException;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.CharRange;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: IbanConfig.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\nH\u0016J\u0010\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0016J\u0010\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\nH\u0016J\u0010\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\nH\u0002R\u0016\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0013\u0010\u0007R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006."}, d2 = {"Lcom/stripe/android/ui/core/elements/IbanConfig;", "Lcom/stripe/android/uicore/elements/TextFieldConfig;", "<init>", "()V", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "getCapitalization-IUNYP9k", "()I", "I", "debugLabel", "", "getDebugLabel", "()Ljava/lang/String;", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "getLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "keyboard", "Landroidx/compose/ui/text/input/KeyboardType;", "getKeyboard-PjHm6EE", "trailingIcon", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "getTrailingIcon", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "loading", "Lkotlinx/coroutines/flow/StateFlow;", "", "getLoading", "()Lkotlinx/coroutines/flow/StateFlow;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation", "()Landroidx/compose/ui/text/input/VisualTransformation;", ViewProps.FILTER, "userTyped", "convertToRaw", "displayName", "convertFromRaw", "rawValue", "determineState", "Lcom/stripe/android/uicore/elements/TextFieldState;", "input", "isIbanValid", "iban", "Companion", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IbanConfig implements TextFieldConfig {

    @Deprecated
    public static final int MAX_LENGTH = 34;

    @Deprecated
    public static final int MIN_LENGTH = 8;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final List<Character> VALID_INPUT_RANGES = CollectionsKt.plus((Collection) CollectionsKt.plus((Iterable) new CharRange('0', '9'), (Iterable) new CharRange('a', 'z')), (Iterable) new CharRange('A', 'Z'));
    private final int capitalization = KeyboardCapitalization.INSTANCE.m5812getCharactersIUNYP9k();
    private final String debugLabel = "iban";
    private final ResolvableString label = ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_iban, new Object[0], null, 4, null);
    private final int keyboard = androidx.compose.ui.text.input.KeyboardType.INSTANCE.m5834getAsciiPjHm6EE();
    private final MutableStateFlow<TextFieldIcon> trailingIcon = StateFlowKt.MutableStateFlow(new TextFieldIcon.Trailing(com.stripe.android.R.drawable.stripe_ic_bank_generic, null, true, null, 10, null));
    private final StateFlow<Boolean> loading = StateFlowKt.MutableStateFlow(false);
    private final VisualTransformation visualTransformation = new VisualTransformation() { // from class: com.stripe.android.ui.core.elements.IbanConfig$$ExternalSyntheticLambda0
        @Override // androidx.compose.ui.text.input.VisualTransformation
        public final TransformedText filter(AnnotatedString annotatedString) {
            return IbanConfig.visualTransformation$lambda$1(annotatedString);
        }
    };

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
    public MutableStateFlow<TextFieldIcon> getTrailingIcon() {
        return this.trailingIcon;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public StateFlow<Boolean> getLoading() {
        return this.loading;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public VisualTransformation getVisualTransformation() {
        return this.visualTransformation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransformedText visualTransformation$lambda$1(AnnotatedString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        StringBuilder sb = new StringBuilder();
        String text2 = text.getText();
        int i = 0;
        int i2 = 0;
        while (i < text2.length()) {
            int i3 = i2 + 1;
            sb.append(text2.charAt(i));
            if (i2 % 4 == 3 && i2 < 33) {
                sb.append(" ");
            }
            i++;
            i2 = i3;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return new TransformedText(new AnnotatedString(string, null, null, 6, null), new OffsetMapping() { // from class: com.stripe.android.ui.core.elements.IbanConfig$visualTransformation$1$2
            @Override // androidx.compose.ui.text.input.OffsetMapping
            public int originalToTransformed(int offset) {
                return offset + (offset / 4);
            }

            @Override // androidx.compose.ui.text.input.OffsetMapping
            public int transformedToOriginal(int offset) {
                return offset - (offset / 5);
            }
        });
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public TextFieldState determineState(String input) {
        TextFieldStateConstants.Valid.Limitless limitless;
        Intrinsics.checkNotNullParameter(input, "input");
        if (StringsKt.isBlank(input)) {
            return TextFieldStateConstants.Error.Blank.INSTANCE;
        }
        String upperCase = StringsKt.take(input, 2).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String str = upperCase;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return new TextFieldStateConstants.Error.Invalid(R.string.stripe_iban_invalid_start, null, false, 6, null);
            }
        }
        if (upperCase.length() < 2) {
            return new TextFieldStateConstants.Error.Incomplete(R.string.stripe_iban_incomplete);
        }
        String[] iSOCountries = Locale.getISOCountries();
        Intrinsics.checkNotNullExpressionValue(iSOCountries, "getISOCountries(...)");
        if (!ArraysKt.contains(iSOCountries, upperCase)) {
            return new TextFieldStateConstants.Error.Invalid(R.string.stripe_iban_invalid_country, new String[]{upperCase}, false, 4, null);
        }
        if (input.length() < 8) {
            return new TextFieldStateConstants.Error.Incomplete(R.string.stripe_iban_incomplete);
        }
        if (isIbanValid(input)) {
            if (input.length() == 34) {
                limitless = TextFieldStateConstants.Valid.Full.INSTANCE;
            } else {
                limitless = TextFieldStateConstants.Valid.Limitless.INSTANCE;
            }
            return limitless;
        }
        return new TextFieldStateConstants.Error.Incomplete(com.stripe.android.R.string.stripe_invalid_bank_account_iban);
    }

    private final boolean isIbanValid(String iban) {
        String upperCase = (StringsKt.takeLast(iban, iban.length() - 4) + StringsKt.take(iban, 4)).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return new BigInteger(new Regex("[A-Z]").replace(upperCase, new Function1() { // from class: com.stripe.android.ui.core.elements.IbanConfig$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IbanConfig.isIbanValid$lambda$5((MatchResult) obj);
            }
        })).mod(new BigInteger("97")).equals(BigInteger.ONE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence isIbanValid$lambda$5(MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return String.valueOf(StringsKt.first(it.getValue()) - '7');
    }

    /* compiled from: IbanConfig.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\f\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/ui/core/elements/IbanConfig$Companion;", "", "<init>", "()V", "MIN_LENGTH", "", "MAX_LENGTH", "VALID_INPUT_RANGES", "", "", "getVALID_INPUT_RANGES", "()Ljava/util/List;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Character> getVALID_INPUT_RANGES() {
            return IbanConfig.VALID_INPUT_RANGES;
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
            if (VALID_INPUT_RANGES.contains(Character.valueOf(cCharAt))) {
                sb.append(cCharAt);
            }
        }
        String upperCase = StringsKt.take(sb.toString(), 34).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
