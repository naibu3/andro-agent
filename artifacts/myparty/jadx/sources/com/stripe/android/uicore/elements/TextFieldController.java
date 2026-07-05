package com.stripe.android.uicore.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.PointerIconCompat;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.uicore.elements.TextFieldIcon;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: TextFieldController.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J=\u0010?\u001a\u00020\t2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020F0E2\b\u0010G\u001a\u0004\u0018\u00010FH\u0017¢\u0006\u0002\u0010HR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0012\u0010\u001d\u001a\u00020\u001eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0012\u0010!\u001a\u00020\"X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010 R\u0014\u0010$\u001a\u0004\u0018\u00010%X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0018\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001cR\u0018\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u001cR\u0012\u0010.\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0018\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001cR\u0018\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u001cR\u0018\u00105\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u001cR\u0018\u00107\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u001cR\u001c\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u001cR\u0014\u0010;\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u00100R\u0018\u0010=\u001a\b\u0012\u0004\u0012\u00020)0\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u001c¨\u0006I"}, d2 = {"Lcom/stripe/android/uicore/elements/TextFieldController;", "Lcom/stripe/android/uicore/elements/InputController;", "Lcom/stripe/android/uicore/elements/SectionFieldComposable;", "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;", "onValueChange", "Lcom/stripe/android/uicore/elements/TextFieldState;", "displayFormatted", "", "onFocusChange", "", "newHasFocus", "", "onDropdownItemClicked", "item", "Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;", "initialValue", "getInitialValue", "()Ljava/lang/String;", "autofillType", "Landroidx/compose/ui/autofill/AutofillType;", "getAutofillType", "()Landroidx/compose/ui/autofill/AutofillType;", "debugLabel", "getDebugLabel", "trailingIcon", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "getTrailingIcon", "()Lkotlinx/coroutines/flow/StateFlow;", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "getCapitalization-IUNYP9k", "()I", "keyboardType", "Landroidx/compose/ui/text/input/KeyboardType;", "getKeyboardType-PjHm6EE", ViewProps.LAYOUT_DIRECTION, "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "getLabel", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation", "showOptionalLabel", "getShowOptionalLabel", "()Z", "fieldState", "getFieldState", "fieldValue", "getFieldValue", "visibleError", "getVisibleError", "loading", "getLoading", "placeHolder", "getPlaceHolder", ViewProps.ENABLED, "getEnabled", "contentDescription", "getContentDescription", "ComposeUI", "field", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "modifier", "Landroidx/compose/ui/Modifier;", "hiddenIdentifiers", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "lastTextFieldIdentifier", "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TextFieldController extends InputController, SectionFieldComposable, SectionFieldErrorController {
    void ComposeUI(boolean z, SectionFieldElement sectionFieldElement, Modifier modifier, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, Composer composer, int i);

    AutofillType getAutofillType();

    /* renamed from: getCapitalization-IUNYP9k */
    int getCapitalization();

    StateFlow<ResolvableString> getContentDescription();

    String getDebugLabel();

    boolean getEnabled();

    StateFlow<TextFieldState> getFieldState();

    @Override // com.stripe.android.uicore.elements.InputController
    StateFlow<String> getFieldValue();

    String getInitialValue();

    /* renamed from: getKeyboardType-PjHm6EE */
    int getKeyboardType();

    @Override // com.stripe.android.uicore.elements.InputController
    StateFlow<ResolvableString> getLabel();

    LayoutDirection getLayoutDirection();

    StateFlow<Boolean> getLoading();

    StateFlow<String> getPlaceHolder();

    @Override // com.stripe.android.uicore.elements.InputController
    boolean getShowOptionalLabel();

    StateFlow<TextFieldIcon> getTrailingIcon();

    StateFlow<Boolean> getVisibleError();

    StateFlow<VisualTransformation> getVisualTransformation();

    void onDropdownItemClicked(TextFieldIcon.Dropdown.Item item);

    void onFocusChange(boolean newHasFocus);

    TextFieldState onValueChange(String displayFormatted);

    /* compiled from: TextFieldController.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean getEnabled(TextFieldController textFieldController) {
            return true;
        }

        public static void onDropdownItemClicked(TextFieldController textFieldController, TextFieldIcon.Dropdown.Item item) {
            Intrinsics.checkNotNullParameter(item, "item");
        }

        public static StateFlow<String> getPlaceHolder(TextFieldController textFieldController) {
            return StateFlowsKt.stateFlowOf(null);
        }

        public static void ComposeUI(TextFieldController textFieldController, boolean z, SectionFieldElement field, Modifier modifier, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, Composer composer, int i) {
            int iM5783getNexteUduSuo;
            Intrinsics.checkNotNullParameter(field, "field");
            Intrinsics.checkNotNullParameter(modifier, "modifier");
            Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
            composer.startReplaceGroup(-441413865);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-441413865, i, -1, "com.stripe.android.uicore.elements.TextFieldController.ComposeUI (TextFieldController.kt:64)");
            }
            if (Intrinsics.areEqual(identifierSpec, field.getIdentifier())) {
                iM5783getNexteUduSuo = ImeAction.INSTANCE.m5781getDoneeUduSuo();
            } else {
                iM5783getNexteUduSuo = ImeAction.INSTANCE.m5783getNexteUduSuo();
            }
            int i2 = i << 3;
            TextFieldUIKt.m8846TextFieldZkbtPhE(textFieldController, z, iM5783getNexteUduSuo, modifier, null, 0, 0, null, false, false, composer, ((i >> 15) & 14) | (i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i2 & 7168), PointerIconCompat.TYPE_TEXT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
        }
    }
}
