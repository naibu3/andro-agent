package com.stripe.android.uicore.elements;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.uicore.R;
import com.stripe.android.uicore.elements.TextFieldConfig;
import com.stripe.android.uicore.elements.TextFieldStateConstants;
import java.io.IOException;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: EmailConfig.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0016J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000eH\u0016J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000eH\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000eH\u0016J\u0010\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u000eH\u0002J\u0010\u0010-\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u000eH\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0013\u0010\u000bR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006/"}, d2 = {"Lcom/stripe/android/uicore/elements/EmailConfig;", "Lcom/stripe/android/uicore/elements/TextFieldConfig;", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "<init>", "(Lcom/stripe/android/core/strings/ResolvableString;)V", "getLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "getCapitalization-IUNYP9k", "()I", "I", "debugLabel", "", "getDebugLabel", "()Ljava/lang/String;", "keyboard", "Landroidx/compose/ui/text/input/KeyboardType;", "getKeyboard-PjHm6EE", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation", "()Landroidx/compose/ui/text/input/VisualTransformation;", "trailingIcon", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "getTrailingIcon", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "loading", "Lkotlinx/coroutines/flow/StateFlow;", "", "getLoading", "()Lkotlinx/coroutines/flow/StateFlow;", ViewProps.FILTER, "userTyped", "convertToRaw", "displayName", "convertFromRaw", "rawValue", "determineState", "Lcom/stripe/android/uicore/elements/TextFieldState;", "input", "containsNameAndDomain", "str", "cannotBecomeValid", "Companion", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EmailConfig implements TextFieldConfig {
    private static final Pattern PATTERN;
    private final int capitalization;
    private final String debugLabel;
    private final int keyboard;
    private final ResolvableString label;
    private final StateFlow<Boolean> loading;
    private final MutableStateFlow<TextFieldIcon> trailingIcon;
    private final VisualTransformation visualTransformation;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public EmailConfig() {
        this(null, 1, 0 == true ? 1 : 0);
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

    public EmailConfig(ResolvableString label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.label = label;
        this.capitalization = KeyboardCapitalization.INSTANCE.m5813getNoneIUNYP9k();
        this.debugLabel = "email";
        this.keyboard = KeyboardType.INSTANCE.m5836getEmailPjHm6EE();
        this.trailingIcon = StateFlowKt.MutableStateFlow(null);
        this.loading = StateFlowKt.MutableStateFlow(false);
    }

    public /* synthetic */ EmailConfig(ResolvableString resolvableString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_email, new Object[0], null, 4, null) : resolvableString);
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
    public MutableStateFlow<TextFieldIcon> getTrailingIcon() {
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
        if (str.length() == 0) {
            return TextFieldStateConstants.Error.Blank.INSTANCE;
        }
        if (PATTERN.matcher(str).matches()) {
            return TextFieldStateConstants.Valid.Limitless.INSTANCE;
        }
        if (containsNameAndDomain(input) || cannotBecomeValid(input)) {
            return new TextFieldStateConstants.Error.Invalid(R.string.stripe_email_is_invalid, null, false, 6, null);
        }
        return new TextFieldStateConstants.Error.Incomplete(R.string.stripe_email_is_invalid);
    }

    private final boolean containsNameAndDomain(String str) {
        String str2 = str;
        return StringsKt.contains$default((CharSequence) str2, (CharSequence) "@", false, 2, (Object) null) && new Regex(".*@.*\\..+").matches(str2);
    }

    private final boolean cannotBecomeValid(String str) {
        String str2 = str;
        int i = 0;
        for (int i2 = 0; i2 < str2.length(); i2++) {
            if (str2.charAt(i2) == '@') {
                i++;
            }
        }
        return i > 1;
    }

    /* compiled from: EmailConfig.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/uicore/elements/EmailConfig$Companion;", "", "<init>", "()V", "createController", "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "initialValue", "", "showOptionalLabel", "", "PATTERN", "Ljava/util/regex/Pattern;", "getPATTERN", "()Ljava/util/regex/Pattern;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ SimpleTextFieldController createController$default(Companion companion, String str, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.createController(str, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final SimpleTextFieldController createController(String initialValue, boolean showOptionalLabel) {
            return new SimpleTextFieldController(new EmailConfig(null, 1, 0 == true ? 1 : 0), showOptionalLabel, initialValue, null, 8, null);
        }

        public final Pattern getPATTERN() {
            return EmailConfig.PATTERN;
        }
    }

    static {
        Pattern patternCompile = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        PATTERN = patternCompile;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldConfig
    public String filter(String userTyped) throws IOException {
        Intrinsics.checkNotNullParameter(userTyped, "userTyped");
        String str = userTyped;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!CharsKt.isWhitespace(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }
}
