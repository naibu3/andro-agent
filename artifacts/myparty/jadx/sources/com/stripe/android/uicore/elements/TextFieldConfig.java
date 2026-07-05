package com.stripe.android.uicore.elements;

import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.strings.ResolvableString;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: TextFieldConfig.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0007H&J\u0010\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0007H&J\u0010\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0007H&J\u0010\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0005R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\tR\u0014\u0010#\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%R1\u0010(\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u000b\u0018\u00010)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00068"}, d2 = {"Lcom/stripe/android/uicore/elements/TextFieldConfig;", "", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "getCapitalization-IUNYP9k", "()I", "debugLabel", "", "getDebugLabel", "()Ljava/lang/String;", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "getLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "keyboard", "Landroidx/compose/ui/text/input/KeyboardType;", "getKeyboard-PjHm6EE", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation", "()Landroidx/compose/ui/text/input/VisualTransformation;", ViewProps.LAYOUT_DIRECTION, "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "trailingIcon", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "getTrailingIcon", "()Lkotlinx/coroutines/flow/StateFlow;", "loading", "", "getLoading", "placeHolder", "getPlaceHolder", "shouldAnnounceLabel", "getShouldAnnounceLabel", "()Z", "shouldAnnounceFieldValue", "getShouldAnnounceFieldValue", "overrideContentDescriptionProvider", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "fieldValue", "getOverrideContentDescriptionProvider", "()Lkotlin/jvm/functions/Function1;", "determineState", "Lcom/stripe/android/uicore/elements/TextFieldState;", "input", ViewProps.FILTER, "userTyped", "convertToRaw", "displayName", "convertFromRaw", "rawValue", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TextFieldConfig {

    /* compiled from: TextFieldConfig.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static LayoutDirection getLayoutDirection(TextFieldConfig textFieldConfig) {
            return null;
        }

        public static Function1<String, ResolvableString> getOverrideContentDescriptionProvider(TextFieldConfig textFieldConfig) {
            return null;
        }

        public static String getPlaceHolder(TextFieldConfig textFieldConfig) {
            return null;
        }

        public static boolean getShouldAnnounceFieldValue(TextFieldConfig textFieldConfig) {
            return true;
        }

        public static boolean getShouldAnnounceLabel(TextFieldConfig textFieldConfig) {
            return true;
        }
    }

    String convertFromRaw(String rawValue);

    String convertToRaw(String displayName);

    TextFieldState determineState(String input);

    String filter(String userTyped);

    /* renamed from: getCapitalization-IUNYP9k */
    int getCapitalization();

    String getDebugLabel();

    /* renamed from: getKeyboard-PjHm6EE */
    int getKeyboard();

    ResolvableString getLabel();

    LayoutDirection getLayoutDirection();

    StateFlow<Boolean> getLoading();

    Function1<String, ResolvableString> getOverrideContentDescriptionProvider();

    String getPlaceHolder();

    boolean getShouldAnnounceFieldValue();

    boolean getShouldAnnounceLabel();

    StateFlow<TextFieldIcon> getTrailingIcon();

    VisualTransformation getVisualTransformation();
}
