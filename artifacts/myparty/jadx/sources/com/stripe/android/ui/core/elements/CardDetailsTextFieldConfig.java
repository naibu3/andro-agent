package com.stripe.android.ui.core.elements;

import androidx.compose.ui.text.input.VisualTransformation;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.model.CardBrand;
import com.stripe.android.uicore.elements.TextFieldState;
import kotlin.Metadata;

/* compiled from: CardDetailsTextFieldConfig.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H&J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0015H&J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H&J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H&J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0005¨\u0006!"}, d2 = {"Lcom/stripe/android/ui/core/elements/CardDetailsTextFieldConfig;", "", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "getCapitalization-IUNYP9k", "()I", "debugLabel", "", "getDebugLabel", "()Ljava/lang/String;", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "getLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "keyboard", "Landroidx/compose/ui/text/input/KeyboardType;", "getKeyboard-PjHm6EE", "determineVisualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "number", "panLength", "", "determineState", "Lcom/stripe/android/uicore/elements/TextFieldState;", "brand", "Lcom/stripe/android/model/CardBrand;", "numberAllowedDigits", ViewProps.FILTER, "userTyped", "convertToRaw", "displayName", "convertFromRaw", "rawValue", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CardDetailsTextFieldConfig {
    String convertFromRaw(String rawValue);

    String convertToRaw(String displayName);

    TextFieldState determineState(CardBrand brand, String number, int numberAllowedDigits);

    VisualTransformation determineVisualTransformation(String number, int panLength);

    String filter(String userTyped);

    /* renamed from: getCapitalization-IUNYP9k, reason: not valid java name */
    int getCapitalization();

    String getDebugLabel();

    /* renamed from: getKeyboard-PjHm6EE, reason: not valid java name */
    int getKeyboard();

    ResolvableString getLabel();
}
