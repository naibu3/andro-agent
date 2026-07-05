package com.stripe.android.uicore.elements;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.uicore.R;
import com.stripe.android.uicore.elements.TextFieldConfig;
import java.io.IOException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: PostalCodeConfig.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001/B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\bH\u0016J\u0010\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\bH\u0016J\u0010\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\bH\u0016J\u0010\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u000eR\u0014\u0010#\u001a\u00020!X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00060"}, d2 = {"Lcom/stripe/android/uicore/elements/PostalCodeConfig;", "Lcom/stripe/android/uicore/elements/TextFieldConfig;", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "trailingIcon", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "country", "", "<init>", "(Lcom/stripe/android/core/strings/ResolvableString;Lkotlinx/coroutines/flow/MutableStateFlow;Ljava/lang/String;)V", "getLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "getTrailingIcon", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "format", "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "getCapitalization-IUNYP9k", "()I", "I", "keyboard", "Landroidx/compose/ui/text/input/KeyboardType;", "getKeyboard-PjHm6EE", "debugLabel", "getDebugLabel", "()Ljava/lang/String;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation", "()Landroidx/compose/ui/text/input/VisualTransformation;", "loading", "", "getLoading", "shouldAnnounceFieldValue", "getShouldAnnounceFieldValue", "()Z", "determineState", "Lcom/stripe/android/uicore/elements/TextFieldState;", "input", ViewProps.FILTER, "userTyped", "convertToRaw", "displayName", "convertFromRaw", "rawValue", "CountryPostalFormat", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PostalCodeConfig implements TextFieldConfig {
    public static final int $stable = 8;
    private final int capitalization;
    private final String country;
    private final String debugLabel;
    private final CountryPostalFormat format;
    private final int keyboard;
    private final ResolvableString label;
    private final MutableStateFlow<Boolean> loading;
    private final boolean shouldAnnounceFieldValue;
    private final MutableStateFlow<TextFieldIcon> trailingIcon;
    private final VisualTransformation visualTransformation;

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
    public boolean getShouldAnnounceLabel() {
        return TextFieldConfig.DefaultImpls.getShouldAnnounceLabel(this);
    }

    public PostalCodeConfig(ResolvableString label, MutableStateFlow<TextFieldIcon> trailingIcon, String country) {
        int iM5812getCharactersIUNYP9k;
        int iM5841getTextPjHm6EE;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(trailingIcon, "trailingIcon");
        Intrinsics.checkNotNullParameter(country, "country");
        this.label = label;
        this.trailingIcon = trailingIcon;
        this.country = country;
        CountryPostalFormat countryPostalFormatForCountry = CountryPostalFormat.INSTANCE.forCountry(country);
        this.format = countryPostalFormatForCountry;
        if (Intrinsics.areEqual(countryPostalFormatForCountry, CountryPostalFormat.US.INSTANCE)) {
            iM5812getCharactersIUNYP9k = KeyboardCapitalization.INSTANCE.m5813getNoneIUNYP9k();
        } else {
            if (!Intrinsics.areEqual(countryPostalFormatForCountry, CountryPostalFormat.CA.INSTANCE) && !Intrinsics.areEqual(countryPostalFormatForCountry, CountryPostalFormat.GB.INSTANCE) && !Intrinsics.areEqual(countryPostalFormatForCountry, CountryPostalFormat.Other.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            iM5812getCharactersIUNYP9k = KeyboardCapitalization.INSTANCE.m5812getCharactersIUNYP9k();
        }
        this.capitalization = iM5812getCharactersIUNYP9k;
        if (Intrinsics.areEqual(countryPostalFormatForCountry, CountryPostalFormat.US.INSTANCE)) {
            iM5841getTextPjHm6EE = KeyboardType.INSTANCE.m5838getNumberPasswordPjHm6EE();
        } else {
            if (!Intrinsics.areEqual(countryPostalFormatForCountry, CountryPostalFormat.CA.INSTANCE) && !Intrinsics.areEqual(countryPostalFormatForCountry, CountryPostalFormat.GB.INSTANCE) && !Intrinsics.areEqual(countryPostalFormatForCountry, CountryPostalFormat.Other.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            iM5841getTextPjHm6EE = KeyboardType.INSTANCE.m5841getTextPjHm6EE();
        }
        this.keyboard = iM5841getTextPjHm6EE;
        this.debugLabel = "postal_code_text";
        this.visualTransformation = new PostalCodeVisualTransformation(countryPostalFormatForCountry);
        this.loading = StateFlowKt.MutableStateFlow(false);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public ResolvableString getLabel() {
        return this.label;
    }

    public /* synthetic */ PostalCodeConfig(ResolvableString resolvableString, MutableStateFlow mutableStateFlow, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(resolvableString, (i & 2) != 0 ? StateFlowKt.MutableStateFlow(null) : mutableStateFlow, str);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public MutableStateFlow<TextFieldIcon> getTrailingIcon() {
        return this.trailingIcon;
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
    public boolean getShouldAnnounceFieldValue() {
        return this.shouldAnnounceFieldValue;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public TextFieldState determineState(final String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new TextFieldState() { // from class: com.stripe.android.uicore.elements.PostalCodeConfig.determineState.1
            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean shouldShowError(boolean hasFocus) {
                return (getError() == null || hasFocus) ? false : true;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean isValid() {
                if (PostalCodeConfig.this.format instanceof CountryPostalFormat.Other) {
                    return !StringsKt.isBlank(input);
                }
                int minimumLength = PostalCodeConfig.this.format.getMinimumLength();
                int maximumLength = PostalCodeConfig.this.format.getMaximumLength();
                int length = input.length();
                if (minimumLength <= length && length <= maximumLength) {
                    if (PostalCodeConfig.this.format.getRegexPattern().matches(input)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public FieldError getError() {
                if (!StringsKt.isBlank(input) && !isValid() && Intrinsics.areEqual(PostalCodeConfig.this.country, "US")) {
                    if (input.length() < PostalCodeConfig.this.format.getMinimumLength()) {
                        return new FieldError(R.string.stripe_address_zip_incomplete, null, 2, null);
                    }
                    return new FieldError(R.string.stripe_address_zip_invalid, null, 2, null);
                }
                if (StringsKt.isBlank(input) || isValid()) {
                    return null;
                }
                if (input.length() < PostalCodeConfig.this.format.getMinimumLength()) {
                    return new FieldError(R.string.stripe_address_postal_code_incomplete, null, 2, null);
                }
                return new FieldError(R.string.stripe_address_postal_code_invalid, null, 2, null);
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            /* renamed from: isFull */
            public boolean getPreventMoreInput() {
                return input.length() >= PostalCodeConfig.this.format.getMaximumLength();
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
        CountryPostalFormat countryPostalFormat = this.format;
        int i = 0;
        if (!Intrinsics.areEqual(countryPostalFormat, CountryPostalFormat.US.INSTANCE)) {
            if (!Intrinsics.areEqual(countryPostalFormat, CountryPostalFormat.CA.INSTANCE) && !Intrinsics.areEqual(countryPostalFormat, CountryPostalFormat.GB.INSTANCE)) {
                if (!Intrinsics.areEqual(countryPostalFormat, CountryPostalFormat.Other.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                String str = userTyped;
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                while (i < length) {
                    char cCharAt = str.charAt(i);
                    if (Character.isLetterOrDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                    i++;
                }
                userTyped = sb.toString().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(userTyped, "toUpperCase(...)");
            }
        } else {
            String str2 = userTyped;
            StringBuilder sb2 = new StringBuilder();
            int length2 = str2.length();
            while (i < length2) {
                char cCharAt2 = str2.charAt(i);
                if (Character.isDigit(cCharAt2)) {
                    sb2.append(cCharAt2);
                }
                i++;
            }
            userTyped = sb2.toString();
        }
        return StringsKt.take(userTyped, this.format.getMaximumLength());
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String convertFromRaw(String rawValue) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        return new Regex("\\s+").replace(rawValue, "");
    }

    /* compiled from: PostalCodeConfig.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00122\u00020\u0001:\u0005\u000e\u000f\u0010\u0011\u0012B!\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0001\u0004\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;", "", "minimumLength", "", "maximumLength", "regexPattern", "Lkotlin/text/Regex;", "<init>", "(IILkotlin/text/Regex;)V", "getMinimumLength", "()I", "getMaximumLength", "getRegexPattern", "()Lkotlin/text/Regex;", "CA", "GB", "US", "Other", "Companion", "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$CA;", "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$GB;", "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Other;", "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$US;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class CountryPostalFormat {
        private final int maximumLength;
        private final int minimumLength;
        private final Regex regexPattern;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ CountryPostalFormat(int i, int i2, Regex regex, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, regex);
        }

        private CountryPostalFormat(int i, int i2, Regex regex) {
            this.minimumLength = i;
            this.maximumLength = i2;
            this.regexPattern = regex;
        }

        public final int getMinimumLength() {
            return this.minimumLength;
        }

        public final int getMaximumLength() {
            return this.maximumLength;
        }

        public final Regex getRegexPattern() {
            return this.regexPattern;
        }

        /* compiled from: PostalCodeConfig.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$CA;", "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;", "<init>", "()V", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CA extends CountryPostalFormat {
            public static final int $stable = 0;
            public static final CA INSTANCE = new CA();

            /* JADX WARN: Illegal instructions before constructor call */
            private CA() {
                int i = 6;
                super(i, i, new Regex("[a-zA-Z]\\d[a-zA-Z][\\s-]?\\d[a-zA-Z]\\d"), null);
            }
        }

        /* compiled from: PostalCodeConfig.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$GB;", "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;", "<init>", "()V", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class GB extends CountryPostalFormat {
            public static final int $stable = 0;
            public static final GB INSTANCE = new GB();

            private GB() {
                super(5, 7, new Regex("^[A-Za-z][A-Za-z0-9]*(?: [A-Za-z0-9]*)?$"), null);
            }
        }

        /* compiled from: PostalCodeConfig.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$US;", "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;", "<init>", "()V", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class US extends CountryPostalFormat {
            public static final int $stable = 0;
            public static final US INSTANCE = new US();

            /* JADX WARN: Illegal instructions before constructor call */
            private US() {
                int i = 5;
                super(i, i, new Regex("\\d+"), null);
            }
        }

        /* compiled from: PostalCodeConfig.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Other;", "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;", "<init>", "()V", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Other extends CountryPostalFormat {
            public static final int $stable = 0;
            public static final Other INSTANCE = new Other();

            private Other() {
                super(1, Integer.MAX_VALUE, new Regex(".*"), null);
            }
        }

        /* compiled from: PostalCodeConfig.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat$Companion;", "", "<init>", "()V", "forCountry", "Lcom/stripe/android/uicore/elements/PostalCodeConfig$CountryPostalFormat;", "country", "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final CountryPostalFormat forCountry(String country) {
                Intrinsics.checkNotNullParameter(country, "country");
                int iHashCode = country.hashCode();
                if (iHashCode != 2142) {
                    if (iHashCode != 2267) {
                        if (iHashCode == 2718 && country.equals("US")) {
                            return US.INSTANCE;
                        }
                    } else if (country.equals("GB")) {
                        return GB.INSTANCE;
                    }
                } else if (country.equals("CA")) {
                    return CA.INSTANCE;
                }
                return Other.INSTANCE;
            }
        }
    }
}
