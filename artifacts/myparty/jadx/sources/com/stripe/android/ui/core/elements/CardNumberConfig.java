package com.stripe.android.ui.core.elements;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.VisualTransformation;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.CardUtils;
import com.stripe.android.R;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.model.CardBrand;
import com.stripe.android.ui.core.elements.CardNumberVisualTransformations;
import com.stripe.android.uicore.elements.TextFieldState;
import com.stripe.android.uicore.elements.TextFieldStateConstants;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CardNumberConfig.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 )2\u00020\u0001:\u0001)B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0019H\u0016J \u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0019H\u0016J\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000eH\u0016J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000eH\u0016J\u0010\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0017\u0010\u000bR\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/stripe/android/ui/core/elements/CardNumberConfig;", "Lcom/stripe/android/ui/core/elements/CardDetailsTextFieldConfig;", "isCardBrandChoiceEligible", "", "cardBrandFilter", "Lcom/stripe/android/CardBrandFilter;", "<init>", "(ZLcom/stripe/android/CardBrandFilter;)V", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "getCapitalization-IUNYP9k", "()I", "I", "debugLabel", "", "getDebugLabel", "()Ljava/lang/String;", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "getLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "keyboard", "Landroidx/compose/ui/text/input/KeyboardType;", "getKeyboard-PjHm6EE", "digitsRequiredToFetchBrands", "", "determineVisualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "number", "panLength", "determineState", "Lcom/stripe/android/uicore/elements/TextFieldState;", "brand", "Lcom/stripe/android/model/CardBrand;", "numberAllowedDigits", ViewProps.FILTER, "userTyped", "convertToRaw", "displayName", "convertFromRaw", "rawValue", "Companion", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CardNumberConfig implements CardDetailsTextFieldConfig {

    @Deprecated
    public static final char SEPARATOR = ' ';
    private final int capitalization;
    private final CardBrandFilter cardBrandFilter;
    private final String debugLabel;
    private int digitsRequiredToFetchBrands;
    private final boolean isCardBrandChoiceEligible;
    private final int keyboard;
    private final ResolvableString label;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

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

    public CardNumberConfig(boolean z, CardBrandFilter cardBrandFilter) {
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        this.isCardBrandChoiceEligible = z;
        this.cardBrandFilter = cardBrandFilter;
        this.capitalization = KeyboardCapitalization.INSTANCE.m5813getNoneIUNYP9k();
        this.debugLabel = "Card number";
        this.label = ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_acc_label_card_number, new Object[0], null, 4, null);
        this.keyboard = androidx.compose.ui.text.input.KeyboardType.INSTANCE.m5838getNumberPasswordPjHm6EE();
        this.digitsRequiredToFetchBrands = 9;
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
        if (panLength == 14 || panLength == 15) {
            return new CardNumberVisualTransformations.FourteenAndFifteenPanLength(SEPARATOR);
        }
        if (panLength == 19) {
            return new CardNumberVisualTransformations.NineteenPanLength(SEPARATOR);
        }
        return new CardNumberVisualTransformations.Default(SEPARATOR);
    }

    @Override // com.stripe.android.ui.core.elements.CardDetailsTextFieldConfig
    public TextFieldState determineState(CardBrand brand, String number, int numberAllowedDigits) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(number, "number");
        boolean zIsValidLuhnNumber = CardUtils.INSTANCE.isValidLuhnNumber(number);
        boolean z = brand.getMaxLengthForCardNumber(number) != -1;
        if (StringsKt.isBlank(number)) {
            return TextFieldStateConstants.Error.Blank.INSTANCE;
        }
        if (!this.cardBrandFilter.isAccepted(brand) && (!this.isCardBrandChoiceEligible || number.length() > this.digitsRequiredToFetchBrands)) {
            return new TextFieldStateConstants.Error.Invalid(R.string.stripe_disallowed_card_brand, new String[]{brand.getDisplayName()}, false);
        }
        if (brand == CardBrand.Unknown) {
            return new TextFieldStateConstants.Error.Invalid(R.string.stripe_invalid_card_number, null, true, 2, null);
        }
        if (z && number.length() < numberAllowedDigits) {
            return new TextFieldStateConstants.Error.Incomplete(R.string.stripe_invalid_card_number);
        }
        if (!zIsValidLuhnNumber) {
            return new TextFieldStateConstants.Error.Invalid(R.string.stripe_invalid_card_number, null, true, 2, null);
        }
        if (z && number.length() == numberAllowedDigits) {
            return TextFieldStateConstants.Valid.Full.INSTANCE;
        }
        return new TextFieldStateConstants.Error.Invalid(R.string.stripe_invalid_card_number, null, false, 6, null);
    }

    /* compiled from: CardNumberConfig.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/ui/core/elements/CardNumberConfig$Companion;", "", "<init>", "()V", "SEPARATOR", "", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
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
