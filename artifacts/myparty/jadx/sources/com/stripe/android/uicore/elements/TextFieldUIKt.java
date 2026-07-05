package com.stripe.android.uicore.elements;

import android.content.Context;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactcommunity.rndatetimepicker.Common;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.core.Logger;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.uicore.FocusManagerKtKt;
import com.stripe.android.uicore.FormInsets;
import com.stripe.android.uicore.R;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.TextFieldIcon;
import com.stripe.android.uicore.elements.TextFieldUIKt;
import com.stripe.android.uicore.elements.compat.CompatTextFieldKt;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import com.stripe.android.uicore.text.AutofillModifierKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TextFieldUI.kt */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002\u001aH\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001a{\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u000e2\b\b\u0002\u0010!\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\"\u0010#\u001aã\u0001\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u00032\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010 \u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010/\u001a\u0002002\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062#\b\u0002\u00107\u001a\u001d\u0012\u0013\u0012\u00110&¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00040\u00022#\b\u0002\u0010:\u001a\u001d\u0012\u0013\u0012\u00110;¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0002\u0010=\u001a<\u0010>\u001a\u00020\u0004*\u00020+2\u0006\u0010'\u001a\u00020\u000e2!\u0010:\u001a\u001d\u0012\u0013\u0012\u00110;¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0002\u0010?\u001a#\u0010@\u001a\u00020\u00042\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0B2\u0006\u0010'\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010D\u001a7\u0010E\u001a\u00020F2\b\b\u0002\u0010-\u001a\u00020\u000e2\b\b\u0002\u0010G\u001a\u00020H2\b\b\u0002\u0010I\u001a\u00020H2\b\b\u0002\u0010J\u001a\u00020HH\u0007¢\u0006\u0004\bK\u0010L\u001a'\u0010M\u001a\u00020\u00042\u0006\u0010*\u001a\u00020C2\u0006\u0010'\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010N\u001a@\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020Q2\u0006\u0010'\u001a\u00020\u000e2!\u0010:\u001a\u001d\u0012\u0013\u0012\u00110;¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0002\u0010R\u001a+\u0010S\u001a\u00020\n*\u00020\n2\u0006\u0010%\u001a\u00020\u00032\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u001cH\u0002¢\u0006\u0004\bW\u0010X\u001a-\u0010Y\u001a\u00020\n*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0002\u0010[\u001a\"\u0010\\\u001a\u00020\n*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u000e0^H\u0002\u001a\u001c\u0010_\u001a\u00020\n*\u00020\n2\u000e\u0010`\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012H\u0002\"(\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0010\u0010a\u001a\u00020\u00038\u0006X\u0087T¢\u0006\u0002\n\u0000\"\u000e\u0010b\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000¨\u0006c²\u0006\f\u0010d\u001a\u0004\u0018\u00010eX\u008a\u0084\u0002²\u0006\n\u0010%\u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\f\u0010*\u001a\u0004\u0018\u00010+X\u008a\u0084\u0002²\u0006\n\u0010-\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010'\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010f\u001a\u00020gX\u008a\u0084\u0002²\u0006\n\u0010/\u001a\u000200X\u008a\u0084\u0002²\u0006\f\u0010h\u001a\u0004\u0018\u00010\u0003X\u008a\u0084\u0002²\u0006\n\u0010i\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\n\u0010(\u001a\u00020gX\u008a\u0084\u0002²\u0006\f\u0010d\u001a\u0004\u0018\u00010eX\u008a\u0084\u0002²\u0006\f\u0010j\u001a\u0004\u0018\u00010kX\u008a\u008e\u0002²\u0006\f\u0010l\u001a\u0004\u0018\u00010kX\u008a\u008e\u0002²\u0006\f\u0010m\u001a\u00020C8\nX\u008b\u0084\u0002²\u0006\n\u0010n\u001a\u00020\u000eX\u008a\u008e\u0002"}, d2 = {"LocalAutofillEventReporter", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lkotlin/Function1;", "", "", "getLocalAutofillEventReporter", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "defaultAutofillEventReporter", "TextFieldSection", "modifier", "Landroidx/compose/ui/Modifier;", "textFieldController", "Lcom/stripe/android/uicore/elements/TextFieldController;", "isSelected", "", "sectionTitle", "", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Lcom/stripe/android/uicore/elements/TextFieldController;ZLjava/lang/Integer;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TextField", ViewProps.ENABLED, "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "onTextStateChanged", "Lcom/stripe/android/uicore/elements/TextFieldState;", "nextFocusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "previousFocusDirection", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "shouldAnnounceLabel", "shouldAnnounceFieldValue", "TextField-ZkbtPhE", "(Lcom/stripe/android/uicore/elements/TextFieldController;ZILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/ui/focus/FocusRequester;ZZLandroidx/compose/runtime/Composer;II)V", "TextFieldUi", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "loading", "label", ReactTextInputShadowNode.PROP_PLACEHOLDER, "trailingIcon", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "showOptionalLabel", "shouldShowError", "errorMessage", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", ViewProps.LAYOUT_DIRECTION, "Landroidx/compose/ui/unit/LayoutDirection;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "onValueChange", "Lkotlin/ParameterName;", "name", "onDropdownItemClicked", "Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;", "item", "(Landroidx/compose/ui/text/input/TextFieldValue;ZZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldIcon;ZZLjava/lang/String;ZLandroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Composable", "(Lcom/stripe/android/uicore/elements/TextFieldIcon;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "AnimatedIcons", "icons", "", "Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;", "(Ljava/util/List;ZLandroidx/compose/runtime/Composer;I)V", "TextFieldColors", "Landroidx/compose/material/TextFieldColors;", Common.TEXT_COLOR, "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", ViewProps.BACKGROUND_COLOR, "TextFieldColors-GyCwops", "(ZJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/TextFieldColors;", "TrailingIcon", "(Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TrailingDropdown", PaymentSheetAppearanceKeys.ICON, "Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;", "(Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "onPreviewKeyEvent", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "direction", "onPreviewKeyEvent-I7lrPNg", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/ui/focus/FocusManager;I)Landroidx/compose/ui/Modifier;", "onAutofill", "autofillReporter", "(Landroidx/compose/ui/Modifier;Lcom/stripe/android/uicore/elements/TextFieldController;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "onFocusChanged", "hasFocus", "Landroidx/compose/runtime/MutableState;", "conditionallyClickable", ViewProps.ON_CLICK, "DROPDOWN_MENU_CLICKABLE_TEST_TAG", "LOADING_INDICATOR_SIZE", "stripe-ui-core_release", "error", "Lcom/stripe/android/uicore/elements/FieldError;", "contentDescription", "Lcom/stripe/android/core/strings/ResolvableString;", "placeHolder", "fieldState", BaseSheetViewModel.SAVE_SELECTION, "Landroidx/compose/ui/text/TextRange;", "composition", TypedValues.AttributesType.S_TARGET, "expanded"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldUIKt {
    public static final String DROPDOWN_MENU_CLICKABLE_TEST_TAG = "dropdown_menu_clickable";
    private static final int LOADING_INDICATOR_SIZE = 24;
    private static final ProvidableCompositionLocal<Function1<String, Unit>> LocalAutofillEventReporter = CompositionLocalKt.staticCompositionLocalOf(TextFieldUIKt$LocalAutofillEventReporter$1.INSTANCE);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedIcons$lambda$49(List list, boolean z, int i, Composer composer, int i2) {
        AnimatedIcons(list, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedIcons$lambda$52(List list, boolean z, int i, Composer composer, int i2) {
        AnimatedIcons(list, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Composable$lambda$48(TextFieldIcon textFieldIcon, boolean z, Function1 function1, int i, Composer composer, int i2) {
        Composable(textFieldIcon, z, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextFieldSection$lambda$5(Modifier modifier, TextFieldController textFieldController, boolean z, Integer num, Function2 function2, int i, int i2, Composer composer, int i3) {
        TextFieldSection(modifier, textFieldController, z, num, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextFieldUi$lambda$44(TextFieldValue textFieldValue, boolean z, boolean z2, String str, String str2, TextFieldIcon textFieldIcon, boolean z3, boolean z4, String str3, boolean z5, Modifier modifier, VisualTransformation visualTransformation, LayoutDirection layoutDirection, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, Function1 function1, Function1 function12, int i, int i2, int i3, Composer composer, int i4) {
        TextFieldUi(textFieldValue, z, z2, str, str2, textFieldIcon, z3, z4, str3, z5, modifier, visualTransformation, layoutDirection, keyboardOptions, keyboardActions, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextField_ZkbtPhE$lambda$39(TextFieldController textFieldController, boolean z, int i, Modifier modifier, Function1 function1, int i2, int i3, FocusRequester focusRequester, boolean z2, boolean z3, int i4, int i5, Composer composer, int i6) {
        m8846TextFieldZkbtPhE(textFieldController, z, i, modifier, function1, i2, i3, focusRequester, z2, z3, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrailingDropdown$lambda$69(TextFieldIcon.Dropdown dropdown, boolean z, Function1 function1, int i, Composer composer, int i2) {
        TrailingDropdown(dropdown, z, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrailingIcon$lambda$55(TextFieldIcon.Trailing trailing, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TrailingIcon(trailing, z, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<String, Unit> defaultAutofillEventReporter() {
        return new Function1() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TextFieldUIKt.defaultAutofillEventReporter$lambda$0((String) obj);
            }
        };
    }

    public static final ProvidableCompositionLocal<Function1<String, Unit>> getLocalAutofillEventReporter() {
        return LocalAutofillEventReporter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit defaultAutofillEventReporter$lambda$0(String autofillType) {
        Intrinsics.checkNotNullParameter(autofillType, "autofillType");
        Logger.INSTANCE.getInstance(false).debug("LocalAutofillEventReporter " + autofillType + " event not reported");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextFieldSection(Modifier modifier, final TextFieldController textFieldController, boolean z, Integer num, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        Integer num2;
        FieldError fieldErrorTextFieldSection$lambda$1;
        String strStringResource;
        final Modifier modifier2;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(textFieldController, "textFieldController");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(2063701262);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(textFieldController) : composerStartRestartGroup.changedInstance(textFieldController) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    num2 = num;
                    i3 |= composerStartRestartGroup.changed(num2) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(content) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    if (i5 != 0) {
                        modifier = Modifier.INSTANCE;
                    }
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if (i4 != 0) {
                        num2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2063701262, i3, -1, "com.stripe.android.uicore.elements.TextFieldSection (TextFieldUI.kt:105)");
                    }
                    fieldErrorTextFieldSection$lambda$1 = TextFieldSection$lambda$1(StateFlowsComposeKt.collectAsState(textFieldController.getError(), null, composerStartRestartGroup, 0, 1));
                    composerStartRestartGroup.startReplaceGroup(1900572133);
                    if (fieldErrorTextFieldSection$lambda$1 != null) {
                        strStringResource = null;
                    } else {
                        Object[] formatArgs = fieldErrorTextFieldSection$lambda$1.getFormatArgs();
                        composerStartRestartGroup.startReplaceGroup(1900572991);
                        strStringResource = formatArgs == null ? null : StringResources_androidKt.stringResource(fieldErrorTextFieldSection$lambda$1.getErrorMessage(), Arrays.copyOf(formatArgs, formatArgs.length), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1900572561);
                        if (strStringResource == null) {
                            strStringResource = StringResources_androidKt.stringResource(fieldErrorTextFieldSection$lambda$1.getErrorMessage(), composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i7 = ((i3 << 6) & 896) | ((i3 << 3) & 7168) | (57344 & i3);
                    boolean z4 = z2;
                    Modifier modifier3 = modifier;
                    SectionUIKt.Section(num2 != null ? ResolvableStringUtilsKt.resolvableString$default(num2.intValue(), new Object[0], null, 4, null) : null, strStringResource, modifier3, z4, content, composerStartRestartGroup, i7, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    z3 = z4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    z3 = z2;
                }
                final Integer num3 = num2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TextFieldUIKt.TextFieldSection$lambda$5(modifier2, textFieldController, z3, num3, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            num2 = num;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) != 9362) {
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                fieldErrorTextFieldSection$lambda$1 = TextFieldSection$lambda$1(StateFlowsComposeKt.collectAsState(textFieldController.getError(), null, composerStartRestartGroup, 0, 1));
                composerStartRestartGroup.startReplaceGroup(1900572133);
                if (fieldErrorTextFieldSection$lambda$1 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                int i72 = ((i3 << 6) & 896) | ((i3 << 3) & 7168) | (57344 & i3);
                boolean z42 = z2;
                Modifier modifier32 = modifier;
                SectionUIKt.Section(num2 != null ? ResolvableStringUtilsKt.resolvableString$default(num2.intValue(), new Object[0], null, 4, null) : null, strStringResource, modifier32, z42, content, composerStartRestartGroup, i72, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier32;
                z3 = z42;
            }
            final Integer num32 = num2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z2 = z;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        num2 = num;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        final Integer num322 = num2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextField_ZkbtPhE$lambda$7$lambda$6(TextFieldState textFieldState) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0102  */
    /* renamed from: TextField-ZkbtPhE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8846TextFieldZkbtPhE(final TextFieldController textFieldController, final boolean z, final int i, Modifier modifier, Function1<? super TextFieldState, Unit> function1, int i2, int i3, FocusRequester focusRequester, boolean z2, boolean z3, Composer composer, final int i4, final int i5) {
        int i6;
        int i7;
        Modifier modifier2;
        int i8;
        Function1<? super TextFieldState, Unit> function12;
        int iM3338getNextdhqQ8s;
        int iM3339getPreviousdhqQ8s;
        int i9;
        FocusRequester focusRequester2;
        int i10;
        int i11;
        int i12;
        int i13;
        final boolean z4;
        boolean z5;
        int i14;
        Function1<? super TextFieldState, Unit> function13;
        FocusRequester focusRequester3;
        FocusManager focusManager;
        int i15;
        Object objRememberedValue;
        FieldError fieldErrorTextField_ZkbtPhE$lambda$20;
        int i16;
        String strStringResource;
        String strStringResource2;
        int i17;
        FocusManager focusManager2;
        boolean z6;
        boolean z7;
        MutableState mutableState;
        final FocusManager focusManager3;
        State state;
        Object obj;
        Object objRememberedValue2;
        int i18;
        Object objRememberedValue3;
        final MutableState mutableState2;
        final MutableState mutableState3;
        final Context context;
        boolean z8;
        Object objRememberedValue4;
        boolean zChanged;
        Object objRememberedValue5;
        final int i19;
        boolean zChangedInstance;
        Object objRememberedValue6;
        boolean zChangedInstance2;
        Object objRememberedValue7;
        boolean zChanged2;
        Object objRememberedValue8;
        Function1<? super TextFieldState, Unit> function14;
        final int i20;
        final Function1<? super TextFieldState, Unit> function15;
        final boolean z9;
        final Modifier modifier3;
        final boolean z10;
        final int i21;
        final FocusRequester focusRequester4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(textFieldController, "textFieldController");
        Composer composerStartRestartGroup = composer.startRestartGroup(1949869177);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = ((i4 & 8) == 0 ? composerStartRestartGroup.changed(textFieldController) : composerStartRestartGroup.changedInstance(textFieldController) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i6 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                i6 |= composerStartRestartGroup.changed(i) ? 256 : 128;
            }
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else {
                if ((i4 & 3072) == 0) {
                    modifier2 = modifier;
                    i6 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else {
                    if ((i4 & 24576) == 0) {
                        function12 = function1;
                        i6 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
                    }
                    if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        iM3338getNextdhqQ8s = i2;
                        i6 |= ((i5 & 32) == 0 && composerStartRestartGroup.changed(iM3338getNextdhqQ8s)) ? 131072 : 65536;
                    } else {
                        iM3338getNextdhqQ8s = i2;
                    }
                    if ((i4 & 1572864) != 0) {
                        iM3339getPreviousdhqQ8s = i3;
                        i6 |= ((i5 & 64) == 0 && composerStartRestartGroup.changed(iM3339getPreviousdhqQ8s)) ? 1048576 : 524288;
                    } else {
                        iM3339getPreviousdhqQ8s = i3;
                    }
                    i9 = i5 & 128;
                    if (i9 == 0) {
                        i6 |= 12582912;
                        focusRequester2 = focusRequester;
                    } else {
                        focusRequester2 = focusRequester;
                        if ((i4 & 12582912) == 0) {
                            i6 |= composerStartRestartGroup.changed(focusRequester2) ? 8388608 : 4194304;
                        }
                    }
                    i10 = i5 & 256;
                    if (i10 == 0) {
                        i6 |= 100663296;
                    } else {
                        if ((i4 & 100663296) == 0) {
                            i11 = i10;
                            i6 |= composerStartRestartGroup.changed(z2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i12 = i5 & 512;
                        if (i12 == 0) {
                            if ((i4 & 805306368) == 0) {
                                i13 = i12;
                                i6 |= composerStartRestartGroup.changed(z3) ? 536870912 : 268435456;
                            }
                            if ((i6 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i4 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i7 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i8 != 0) {
                                        composerStartRestartGroup.startReplaceGroup(2088969152);
                                        Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue9 = new Function1() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda19
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj2) {
                                                    return TextFieldUIKt.TextField_ZkbtPhE$lambda$7$lambda$6((TextFieldState) obj2);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        function12 = (Function1) objRememberedValue9;
                                    }
                                    if ((i5 & 32) != 0) {
                                        i6 &= -458753;
                                        iM3338getNextdhqQ8s = FocusDirection.INSTANCE.m3338getNextdhqQ8s();
                                    }
                                    if ((i5 & 64) != 0) {
                                        i6 &= -3670017;
                                        iM3339getPreviousdhqQ8s = FocusDirection.INSTANCE.m3339getPreviousdhqQ8s();
                                    }
                                    if (i9 != 0) {
                                        composerStartRestartGroup.startReplaceGroup(2088974715);
                                        Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue10 = new FocusRequester();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        focusRequester2 = (FocusRequester) objRememberedValue10;
                                    }
                                    boolean z11 = i11 == 0 ? true : z2;
                                    if (i13 == 0) {
                                        z5 = z11;
                                        i14 = i6;
                                        function13 = function12;
                                        focusRequester3 = focusRequester2;
                                        z4 = true;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1949869177, i14, -1, "com.stripe.android.uicore.elements.TextField (TextFieldUI.kt:148)");
                                        }
                                        ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object objConsume = composerStartRestartGroup.consume(localFocusManager);
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        focusManager = (FocusManager) objConsume;
                                        final Function1<? super TextFieldState, Unit> function16 = function13;
                                        boolean z12 = z5;
                                        final State stateCollectAsState = StateFlowsComposeKt.collectAsState(textFieldController.getFieldValue(), null, composerStartRestartGroup, 0, 1);
                                        i15 = i14;
                                        State stateCollectAsState2 = StateFlowsComposeKt.collectAsState(textFieldController.getTrailingIcon(), null, composerStartRestartGroup, 0, 1);
                                        State stateCollectAsState3 = StateFlowsComposeKt.collectAsState(textFieldController.getVisibleError(), null, composerStartRestartGroup, 0, 1);
                                        State stateCollectAsState4 = StateFlowsComposeKt.collectAsState(textFieldController.getLoading(), null, composerStartRestartGroup, 0, 1);
                                        final State stateCollectAsState5 = StateFlowsComposeKt.collectAsState(textFieldController.getContentDescription(), null, composerStartRestartGroup, 0, 1);
                                        State stateCollectAsState6 = StateFlowsComposeKt.collectAsState(textFieldController.getVisualTransformation(), null, composerStartRestartGroup, 0, 1);
                                        State stateCollectAsState7 = StateFlowsComposeKt.collectAsState(textFieldController.getPlaceHolder(), null, composerStartRestartGroup, 0, 1);
                                        Object[] objArr = new Object[0];
                                        composerStartRestartGroup.startReplaceGroup(2088998231);
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda20
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return TextFieldUIKt.TextField_ZkbtPhE$lambda$17$lambda$16();
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        MutableState mutableState4 = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                                        State stateCollectAsState8 = StateFlowsComposeKt.collectAsState(textFieldController.getFieldState(), null, composerStartRestartGroup, 0, 1);
                                        State stateCollectAsState9 = StateFlowsComposeKt.collectAsState(textFieldController.getLabel(), null, composerStartRestartGroup, 0, 1);
                                        fieldErrorTextField_ZkbtPhE$lambda$20 = TextField_ZkbtPhE$lambda$20(StateFlowsComposeKt.collectAsState(textFieldController.getError(), null, composerStartRestartGroup, 0, 1));
                                        composerStartRestartGroup.startReplaceGroup(2089006524);
                                        if (fieldErrorTextField_ZkbtPhE$lambda$20 != null) {
                                            strStringResource2 = null;
                                        } else {
                                            Object[] formatArgs = fieldErrorTextField_ZkbtPhE$lambda$20.getFormatArgs();
                                            composerStartRestartGroup.startReplaceGroup(2089007382);
                                            if (formatArgs == null) {
                                                strStringResource = null;
                                                i16 = 0;
                                            } else {
                                                i16 = 0;
                                                strStringResource = StringResources_androidKt.stringResource(fieldErrorTextField_ZkbtPhE$lambda$20.getErrorMessage(), Arrays.copyOf(formatArgs, formatArgs.length), composerStartRestartGroup, 0);
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.startReplaceGroup(2089006952);
                                            strStringResource2 = strStringResource == null ? StringResources_androidKt.stringResource(fieldErrorTextField_ZkbtPhE$lambda$20.getErrorMessage(), composerStartRestartGroup, i16) : strStringResource;
                                            composerStartRestartGroup.endReplaceGroup();
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        TextFieldState textFieldStateTextField_ZkbtPhE$lambda$18 = TextField_ZkbtPhE$lambda$18(stateCollectAsState8);
                                        composerStartRestartGroup.startReplaceGroup(2089013721);
                                        boolean zChanged3 = composerStartRestartGroup.changed(stateCollectAsState8) | composerStartRestartGroup.changed(mutableState4) | composerStartRestartGroup.changedInstance(focusManager);
                                        i17 = (i15 & 458752) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                        if (i17 > 131072 || !composerStartRestartGroup.changed(iM3338getNextdhqQ8s)) {
                                            focusManager2 = focusManager;
                                            if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                                                z6 = false;
                                            }
                                            z7 = z6 | zChanged3;
                                            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                                            if (z7 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                                Object textFieldUIKt$TextField$3$1 = new TextFieldUIKt$TextField$3$1(mutableState4, focusManager2, iM3338getNextdhqQ8s, stateCollectAsState8, null);
                                                mutableState = mutableState4;
                                                focusManager3 = focusManager2;
                                                state = stateCollectAsState8;
                                                obj = (Function2) textFieldUIKt$TextField$3$1;
                                                composerStartRestartGroup.updateRememberedValue(obj);
                                            } else {
                                                focusManager3 = focusManager2;
                                                obj = objRememberedValue11;
                                                state = stateCollectAsState8;
                                                mutableState = mutableState4;
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            String str = strStringResource2;
                                            EffectsKt.LaunchedEffect(textFieldStateTextField_ZkbtPhE$lambda$18, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) obj, composerStartRestartGroup, 0);
                                            ProvidableCompositionLocal<Function1<String, Unit>> providableCompositionLocal = LocalAutofillEventReporter;
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume2 = composerStartRestartGroup.consume(providableCompositionLocal);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            Function1 function17 = (Function1) objConsume2;
                                            composerStartRestartGroup.startReplaceGroup(2089024311);
                                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue2 != Composer.INSTANCE.getEmpty()) {
                                                i18 = iM3338getNextdhqQ8s;
                                                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                                composerStartRestartGroup.updateRememberedValue(objMutableStateOf$default);
                                                objRememberedValue2 = objMutableStateOf$default;
                                            } else {
                                                i18 = iM3338getNextdhqQ8s;
                                            }
                                            MutableState mutableState5 = (MutableState) objRememberedValue2;
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.startReplaceGroup(2089026935);
                                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue3 != Composer.INSTANCE.getEmpty()) {
                                                mutableState2 = mutableState5;
                                                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                            } else {
                                                mutableState2 = mutableState5;
                                            }
                                            mutableState3 = (MutableState) objRememberedValue3;
                                            composerStartRestartGroup.endReplaceGroup();
                                            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume3 = composerStartRestartGroup.consume(localContext);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            context = (Context) objConsume3;
                                            String strTextField_ZkbtPhE$lambda$9 = TextField_ZkbtPhE$lambda$9(stateCollectAsState);
                                            TextRange textRangeTextField_ZkbtPhE$lambda$25 = TextField_ZkbtPhE$lambda$25(mutableState2);
                                            TextFieldValue textFieldValue = new TextFieldValue(strTextField_ZkbtPhE$lambda$9, textRangeTextField_ZkbtPhE$lambda$25 == null ? textRangeTextField_ZkbtPhE$lambda$25.getPackedValue() : TextRangeKt.TextRange(TextField_ZkbtPhE$lambda$9(stateCollectAsState).length()), TextField_ZkbtPhE$lambda$28(mutableState3), (DefaultConstructorMarker) null);
                                            boolean zTextField_ZkbtPhE$lambda$12 = TextField_ZkbtPhE$lambda$12(stateCollectAsState4);
                                            composerStartRestartGroup.startReplaceGroup(2089056648);
                                            int i22 = i15 & 14;
                                            z8 = i22 != 4 || ((i15 & 8) != 0 && composerStartRestartGroup.changedInstance(textFieldController));
                                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                            if (!z8 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue4 = (KFunction) new TextFieldUIKt$TextField$4$1(textFieldController);
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                            }
                                            KFunction kFunction = (KFunction) objRememberedValue4;
                                            composerStartRestartGroup.endReplaceGroup();
                                            int i23 = i15 << 3;
                                            int i24 = iM3339getPreviousdhqQ8s;
                                            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(onFocusChanged(onAutofill(m8848onPreviewKeyEventI7lrPNg(modifier2, TextField_ZkbtPhE$lambda$9(stateCollectAsState), focusManager3, iM3339getPreviousdhqQ8s), textFieldController, function17, composerStartRestartGroup, i23 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), textFieldController, mutableState), focusRequester3);
                                            composerStartRestartGroup.startReplaceGroup(2089076050);
                                            zChanged = composerStartRestartGroup.changed(stateCollectAsState5) | composerStartRestartGroup.changedInstance(context) | ((i15 & 1879048192) != 536870912);
                                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                            if (!zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue5 = new Function1() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda21
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj2) {
                                                        return TextFieldUIKt.TextField_ZkbtPhE$lambda$32$lambda$31(context, z4, stateCollectAsState5, (SemanticsPropertyReceiver) obj2);
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierFocusRequester, false, (Function1) objRememberedValue5, 1, null);
                                            boolean z13 = !z && textFieldController.getEnabled();
                                            String strResolve = ResolvableStringComposeUtilsKt.resolve(TextField_ZkbtPhE$lambda$19(stateCollectAsState9), composerStartRestartGroup, 0);
                                            boolean showOptionalLabel = textFieldController.getShowOptionalLabel();
                                            String strTextField_ZkbtPhE$lambda$15 = TextField_ZkbtPhE$lambda$15(stateCollectAsState7);
                                            TextFieldIcon textFieldIconTextField_ZkbtPhE$lambda$10 = TextField_ZkbtPhE$lambda$10(stateCollectAsState2);
                                            boolean zTextField_ZkbtPhE$lambda$11 = TextField_ZkbtPhE$lambda$11(stateCollectAsState3);
                                            VisualTransformation visualTransformationTextField_ZkbtPhE$lambda$14 = TextField_ZkbtPhE$lambda$14(stateCollectAsState6);
                                            LayoutDirection layoutDirection = textFieldController.getLayoutDirection();
                                            boolean z14 = z13;
                                            i19 = i18;
                                            FocusRequester focusRequester5 = focusRequester3;
                                            KeyboardOptions keyboardOptions = new KeyboardOptions(textFieldController.getCapitalization(), (Boolean) null, textFieldController.getKeyboardType(), i, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 114, (DefaultConstructorMarker) null);
                                            composerStartRestartGroup.startReplaceGroup(2089109403);
                                            zChangedInstance = composerStartRestartGroup.changedInstance(focusManager3);
                                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                            if (!zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue6 = new Function1() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda22
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj2) {
                                                        return TextFieldUIKt.TextField_ZkbtPhE$lambda$34$lambda$33(focusManager3, (KeyboardActionScope) obj2);
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                            }
                                            Function1 function18 = (Function1) objRememberedValue6;
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.startReplaceGroup(2089106126);
                                            zChangedInstance2 = ((i17 <= 131072 && composerStartRestartGroup.changed(i19)) || (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | composerStartRestartGroup.changedInstance(focusManager3);
                                            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                            if (zChangedInstance2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue7 = new Function1() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda23
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj2) {
                                                        return TextFieldUIKt.TextField_ZkbtPhE$lambda$36$lambda$35(focusManager3, i19, (KeyboardActionScope) obj2);
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            KeyboardActions keyboardActions = new KeyboardActions(function18, null, (Function1) objRememberedValue7, null, null, null, 58, null);
                                            composerStartRestartGroup.startReplaceGroup(2089038189);
                                            zChanged2 = composerStartRestartGroup.changed(state) | composerStartRestartGroup.changed(stateCollectAsState) | (i22 != 4 || ((i15 & 8) != 0 && composerStartRestartGroup.changedInstance(textFieldController))) | ((i15 & 57344) != 16384);
                                            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                            if (!zChanged2 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                                final State state2 = state;
                                                objRememberedValue8 = new Function1() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj2) {
                                                        return TextFieldUIKt.TextField_ZkbtPhE$lambda$38$lambda$37(textFieldController, function16, state2, stateCollectAsState, mutableState2, mutableState3, (TextFieldValue) obj2);
                                                    }
                                                };
                                                function14 = function16;
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                            } else {
                                                function14 = function16;
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            TextFieldUi(textFieldValue, z14, zTextField_ZkbtPhE$lambda$12, strResolve, strTextField_ZkbtPhE$lambda$15, textFieldIconTextField_ZkbtPhE$lambda$10, showOptionalLabel, zTextField_ZkbtPhE$lambda$11, str, z12, modifierSemantics$default, visualTransformationTextField_ZkbtPhE$lambda$14, layoutDirection, keyboardOptions, keyboardActions, (Function1) objRememberedValue8, (Function1) kFunction, composerStartRestartGroup, i23 & 1879048192, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            i20 = i19;
                                            function15 = function14;
                                            z9 = z4;
                                            modifier3 = modifier2;
                                            z10 = z12;
                                            i21 = i24;
                                            focusRequester4 = focusRequester5;
                                        } else {
                                            focusManager2 = focusManager;
                                        }
                                        z6 = true;
                                        z7 = z6 | zChanged3;
                                        Object objRememberedValue112 = composerStartRestartGroup.rememberedValue();
                                        if (z7) {
                                            Object textFieldUIKt$TextField$3$12 = new TextFieldUIKt$TextField$3$1(mutableState4, focusManager2, iM3338getNextdhqQ8s, stateCollectAsState8, null);
                                            mutableState = mutableState4;
                                            focusManager3 = focusManager2;
                                            state = stateCollectAsState8;
                                            obj = (Function2) textFieldUIKt$TextField$3$12;
                                            composerStartRestartGroup.updateRememberedValue(obj);
                                            composerStartRestartGroup.endReplaceGroup();
                                            String str2 = strStringResource2;
                                            EffectsKt.LaunchedEffect(textFieldStateTextField_ZkbtPhE$lambda$18, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) obj, composerStartRestartGroup, 0);
                                            ProvidableCompositionLocal<Function1<String, Unit>> providableCompositionLocal2 = LocalAutofillEventReporter;
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume22 = composerStartRestartGroup.consume(providableCompositionLocal2);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            Function1 function172 = (Function1) objConsume22;
                                            composerStartRestartGroup.startReplaceGroup(2089024311);
                                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue2 != Composer.INSTANCE.getEmpty()) {
                                            }
                                            MutableState mutableState52 = (MutableState) objRememberedValue2;
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.startReplaceGroup(2089026935);
                                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue3 != Composer.INSTANCE.getEmpty()) {
                                            }
                                            mutableState3 = (MutableState) objRememberedValue3;
                                            composerStartRestartGroup.endReplaceGroup();
                                            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume32 = composerStartRestartGroup.consume(localContext2);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            context = (Context) objConsume32;
                                            String strTextField_ZkbtPhE$lambda$92 = TextField_ZkbtPhE$lambda$9(stateCollectAsState);
                                            TextRange textRangeTextField_ZkbtPhE$lambda$252 = TextField_ZkbtPhE$lambda$25(mutableState2);
                                            TextFieldValue textFieldValue2 = new TextFieldValue(strTextField_ZkbtPhE$lambda$92, textRangeTextField_ZkbtPhE$lambda$252 == null ? textRangeTextField_ZkbtPhE$lambda$252.getPackedValue() : TextRangeKt.TextRange(TextField_ZkbtPhE$lambda$9(stateCollectAsState).length()), TextField_ZkbtPhE$lambda$28(mutableState3), (DefaultConstructorMarker) null);
                                            boolean zTextField_ZkbtPhE$lambda$122 = TextField_ZkbtPhE$lambda$12(stateCollectAsState4);
                                            composerStartRestartGroup.startReplaceGroup(2089056648);
                                            int i222 = i15 & 14;
                                            if (i222 != 4) {
                                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                                if (!z8) {
                                                    objRememberedValue4 = (KFunction) new TextFieldUIKt$TextField$4$1(textFieldController);
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                                    KFunction kFunction2 = (KFunction) objRememberedValue4;
                                                    composerStartRestartGroup.endReplaceGroup();
                                                    int i232 = i15 << 3;
                                                    int i242 = iM3339getPreviousdhqQ8s;
                                                    Modifier modifierFocusRequester2 = FocusRequesterModifierKt.focusRequester(onFocusChanged(onAutofill(m8848onPreviewKeyEventI7lrPNg(modifier2, TextField_ZkbtPhE$lambda$9(stateCollectAsState), focusManager3, iM3339getPreviousdhqQ8s), textFieldController, function172, composerStartRestartGroup, i232 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), textFieldController, mutableState), focusRequester3);
                                                    composerStartRestartGroup.startReplaceGroup(2089076050);
                                                    zChanged = composerStartRestartGroup.changed(stateCollectAsState5) | composerStartRestartGroup.changedInstance(context) | ((i15 & 1879048192) != 536870912);
                                                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                                    if (!zChanged) {
                                                        objRememberedValue5 = new Function1() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda21
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj2) {
                                                                return TextFieldUIKt.TextField_ZkbtPhE$lambda$32$lambda$31(context, z4, stateCollectAsState5, (SemanticsPropertyReceiver) obj2);
                                                            }
                                                        };
                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                                        composerStartRestartGroup.endReplaceGroup();
                                                        Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(modifierFocusRequester2, false, (Function1) objRememberedValue5, 1, null);
                                                        if (z) {
                                                            String strResolve2 = ResolvableStringComposeUtilsKt.resolve(TextField_ZkbtPhE$lambda$19(stateCollectAsState9), composerStartRestartGroup, 0);
                                                            boolean showOptionalLabel2 = textFieldController.getShowOptionalLabel();
                                                            String strTextField_ZkbtPhE$lambda$152 = TextField_ZkbtPhE$lambda$15(stateCollectAsState7);
                                                            TextFieldIcon textFieldIconTextField_ZkbtPhE$lambda$102 = TextField_ZkbtPhE$lambda$10(stateCollectAsState2);
                                                            boolean zTextField_ZkbtPhE$lambda$112 = TextField_ZkbtPhE$lambda$11(stateCollectAsState3);
                                                            VisualTransformation visualTransformationTextField_ZkbtPhE$lambda$142 = TextField_ZkbtPhE$lambda$14(stateCollectAsState6);
                                                            LayoutDirection layoutDirection2 = textFieldController.getLayoutDirection();
                                                            boolean z142 = z13;
                                                            i19 = i18;
                                                            FocusRequester focusRequester52 = focusRequester3;
                                                            KeyboardOptions keyboardOptions2 = new KeyboardOptions(textFieldController.getCapitalization(), (Boolean) null, textFieldController.getKeyboardType(), i, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 114, (DefaultConstructorMarker) null);
                                                            composerStartRestartGroup.startReplaceGroup(2089109403);
                                                            zChangedInstance = composerStartRestartGroup.changedInstance(focusManager3);
                                                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                                            if (!zChangedInstance) {
                                                                objRememberedValue6 = new Function1() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda22
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj2) {
                                                                        return TextFieldUIKt.TextField_ZkbtPhE$lambda$34$lambda$33(focusManager3, (KeyboardActionScope) obj2);
                                                                    }
                                                                };
                                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                                                Function1 function182 = (Function1) objRememberedValue6;
                                                                composerStartRestartGroup.endReplaceGroup();
                                                                composerStartRestartGroup.startReplaceGroup(2089106126);
                                                                if (i17 <= 131072) {
                                                                    zChangedInstance2 = ((i17 <= 131072 && composerStartRestartGroup.changed(i19)) || (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | composerStartRestartGroup.changedInstance(focusManager3);
                                                                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                                                    if (zChangedInstance2) {
                                                                        objRememberedValue7 = new Function1() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda23
                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public final Object invoke(Object obj2) {
                                                                                return TextFieldUIKt.TextField_ZkbtPhE$lambda$36$lambda$35(focusManager3, i19, (KeyboardActionScope) obj2);
                                                                            }
                                                                        };
                                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                                                        composerStartRestartGroup.endReplaceGroup();
                                                                        KeyboardActions keyboardActions2 = new KeyboardActions(function182, null, (Function1) objRememberedValue7, null, null, null, 58, null);
                                                                        composerStartRestartGroup.startReplaceGroup(2089038189);
                                                                        if (i222 != 4) {
                                                                            zChanged2 = composerStartRestartGroup.changed(state) | composerStartRestartGroup.changed(stateCollectAsState) | (i222 != 4 || ((i15 & 8) != 0 && composerStartRestartGroup.changedInstance(textFieldController))) | ((i15 & 57344) != 16384);
                                                                            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                                                            if (zChanged2) {
                                                                                final State state22 = state;
                                                                                objRememberedValue8 = new Function1() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda1
                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                    public final Object invoke(Object obj2) {
                                                                                        return TextFieldUIKt.TextField_ZkbtPhE$lambda$38$lambda$37(textFieldController, function16, state22, stateCollectAsState, mutableState2, mutableState3, (TextFieldValue) obj2);
                                                                                    }
                                                                                };
                                                                                function14 = function16;
                                                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                                                                composerStartRestartGroup.endReplaceGroup();
                                                                                TextFieldUi(textFieldValue2, z142, zTextField_ZkbtPhE$lambda$122, strResolve2, strTextField_ZkbtPhE$lambda$152, textFieldIconTextField_ZkbtPhE$lambda$102, showOptionalLabel2, zTextField_ZkbtPhE$lambda$112, str2, z12, modifierSemantics$default2, visualTransformationTextField_ZkbtPhE$lambda$142, layoutDirection2, keyboardOptions2, keyboardActions2, (Function1) objRememberedValue8, (Function1) kFunction2, composerStartRestartGroup, i232 & 1879048192, 0, 0);
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                }
                                                                                i20 = i19;
                                                                                function15 = function14;
                                                                                z9 = z4;
                                                                                modifier3 = modifier2;
                                                                                z10 = z12;
                                                                                i21 = i242;
                                                                                focusRequester4 = focusRequester52;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    zChangedInstance2 = ((i17 <= 131072 && composerStartRestartGroup.changed(i19)) || (i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | composerStartRestartGroup.changedInstance(focusManager3);
                                                                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                                                    if (zChangedInstance2) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        z4 = z3;
                                        z5 = z11;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i5 & 32) != 0) {
                                        i6 &= -458753;
                                    }
                                    if ((i5 & 64) != 0) {
                                        i6 &= -3670017;
                                    }
                                    z5 = z2;
                                    z4 = z3;
                                }
                                i14 = i6;
                                function13 = function12;
                                focusRequester3 = focusRequester2;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                ProvidableCompositionLocal<FocusManager> localFocusManager2 = CompositionLocalsKt.getLocalFocusManager();
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object objConsume4 = composerStartRestartGroup.consume(localFocusManager2);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                focusManager = (FocusManager) objConsume4;
                                final Function1 function162 = function13;
                                boolean z122 = z5;
                                final State stateCollectAsState10 = StateFlowsComposeKt.collectAsState(textFieldController.getFieldValue(), null, composerStartRestartGroup, 0, 1);
                                i15 = i14;
                                State stateCollectAsState22 = StateFlowsComposeKt.collectAsState(textFieldController.getTrailingIcon(), null, composerStartRestartGroup, 0, 1);
                                State stateCollectAsState32 = StateFlowsComposeKt.collectAsState(textFieldController.getVisibleError(), null, composerStartRestartGroup, 0, 1);
                                State stateCollectAsState42 = StateFlowsComposeKt.collectAsState(textFieldController.getLoading(), null, composerStartRestartGroup, 0, 1);
                                final State stateCollectAsState52 = StateFlowsComposeKt.collectAsState(textFieldController.getContentDescription(), null, composerStartRestartGroup, 0, 1);
                                State stateCollectAsState62 = StateFlowsComposeKt.collectAsState(textFieldController.getVisualTransformation(), null, composerStartRestartGroup, 0, 1);
                                State stateCollectAsState72 = StateFlowsComposeKt.collectAsState(textFieldController.getPlaceHolder(), null, composerStartRestartGroup, 0, 1);
                                Object[] objArr2 = new Object[0];
                                composerStartRestartGroup.startReplaceGroup(2088998231);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                MutableState mutableState42 = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                                State stateCollectAsState82 = StateFlowsComposeKt.collectAsState(textFieldController.getFieldState(), null, composerStartRestartGroup, 0, 1);
                                State stateCollectAsState92 = StateFlowsComposeKt.collectAsState(textFieldController.getLabel(), null, composerStartRestartGroup, 0, 1);
                                fieldErrorTextField_ZkbtPhE$lambda$20 = TextField_ZkbtPhE$lambda$20(StateFlowsComposeKt.collectAsState(textFieldController.getError(), null, composerStartRestartGroup, 0, 1));
                                composerStartRestartGroup.startReplaceGroup(2089006524);
                                if (fieldErrorTextField_ZkbtPhE$lambda$20 != null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                TextFieldState textFieldStateTextField_ZkbtPhE$lambda$182 = TextField_ZkbtPhE$lambda$18(stateCollectAsState82);
                                composerStartRestartGroup.startReplaceGroup(2089013721);
                                boolean zChanged32 = composerStartRestartGroup.changed(stateCollectAsState82) | composerStartRestartGroup.changed(mutableState42) | composerStartRestartGroup.changedInstance(focusManager);
                                i17 = (i15 & 458752) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                if (i17 > 131072) {
                                    focusManager2 = focusManager;
                                    if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
                                        z6 = true;
                                    }
                                    z7 = z6 | zChanged32;
                                    Object objRememberedValue1122 = composerStartRestartGroup.rememberedValue();
                                    if (z7) {
                                    }
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                z9 = z3;
                                i21 = iM3339getPreviousdhqQ8s;
                                modifier3 = modifier2;
                                i20 = iM3338getNextdhqQ8s;
                                function15 = function12;
                                focusRequester4 = focusRequester2;
                                z10 = z2;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj2, Object obj3) {
                                        return TextFieldUIKt.TextField_ZkbtPhE$lambda$39(textFieldController, z, i, modifier3, function15, i20, i21, focusRequester4, z10, z9, i4, i5, (Composer) obj2, ((Integer) obj3).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i6 |= 805306368;
                        i13 = i12;
                        if ((i6 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i4 & 1) != 0) {
                                if (i7 != 0) {
                                }
                                if (i8 != 0) {
                                }
                                if ((i5 & 32) != 0) {
                                }
                                if ((i5 & 64) != 0) {
                                }
                                if (i9 != 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i13 == 0) {
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i11 = i10;
                    i12 = i5 & 512;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    if ((i6 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function12 = function1;
                if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                }
                if ((i4 & 1572864) != 0) {
                }
                i9 = i5 & 128;
                if (i9 == 0) {
                }
                i10 = i5 & 256;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i5 & 512;
                if (i12 == 0) {
                }
                i13 = i12;
                if ((i6 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            function12 = function1;
            if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
            }
            if ((i4 & 1572864) != 0) {
            }
            i9 = i5 & 128;
            if (i9 == 0) {
            }
            i10 = i5 & 256;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i5 & 512;
            if (i12 == 0) {
            }
            i13 = i12;
            if ((i6 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        function12 = function1;
        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        if ((i4 & 1572864) != 0) {
        }
        i9 = i5 & 128;
        if (i9 == 0) {
        }
        i10 = i5 & 256;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i5 & 512;
        if (i12 == 0) {
        }
        i13 = i12;
        if ((i6 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState TextField_ZkbtPhE$lambda$17$lambda$16() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    private static final TextRange TextField_ZkbtPhE$lambda$25(MutableState<TextRange> mutableState) {
        return mutableState.getValue();
    }

    private static final TextRange TextField_ZkbtPhE$lambda$28(MutableState<TextRange> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextField_ZkbtPhE$lambda$38$lambda$37(TextFieldController textFieldController, Function1 function1, State state, State state2, MutableState mutableState, MutableState mutableState2, TextFieldValue newValue) {
        TextFieldState textFieldStateOnValueChange;
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        String text = newValue.getText();
        boolean zCanAcceptInput = TextFieldStateKt.canAcceptInput(TextField_ZkbtPhE$lambda$18(state), TextField_ZkbtPhE$lambda$9(state2), text);
        if (Intrinsics.areEqual(text, TextField_ZkbtPhE$lambda$9(state2)) || zCanAcceptInput) {
            mutableState.setValue(TextRange.m5590boximpl(newValue.getSelection()));
            mutableState2.setValue(newValue.getComposition());
        }
        if (zCanAcceptInput && (textFieldStateOnValueChange = textFieldController.onValueChange(text)) != null) {
            function1.invoke(textFieldStateOnValueChange);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextField_ZkbtPhE$lambda$32$lambda$31(Context context, boolean z, State state, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, TextField_ZkbtPhE$lambda$13(state).resolve(context));
        if (!z) {
            SemanticsPropertiesKt.setEditableText(semantics, new AnnotatedString("", null, null, 6, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextField_ZkbtPhE$lambda$36$lambda$35(FocusManager focusManager, int i, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        FocusManagerKtKt.m8697moveFocusSafelyMxy_nc0(focusManager, i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextField_ZkbtPhE$lambda$34$lambda$33(FocusManager focusManager, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        focusManager.clearFocus(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextFieldUi$lambda$41$lambda$40(TextFieldValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextFieldUi$lambda$43$lambda$42(TextFieldIcon.Dropdown.Item it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextFieldUi(final TextFieldValue value, final boolean z, final boolean z2, final String label, final String str, final TextFieldIcon textFieldIcon, final boolean z3, final boolean z4, final String str2, boolean z5, Modifier modifier, VisualTransformation visualTransformation, LayoutDirection layoutDirection, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, Function1<? super TextFieldValue, Unit> function1, Function1<? super TextFieldIcon.Dropdown.Item, Unit> function12, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z6;
        int i6;
        Modifier modifier2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        VisualTransformation none;
        KeyboardActions keyboardActions2;
        Modifier modifier3;
        Function1<? super TextFieldValue, Unit> function13;
        final Modifier modifier4;
        final Function1<? super TextFieldValue, Unit> function14;
        final Function1<? super TextFieldIcon.Dropdown.Item, Unit> function15;
        final boolean z7;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions3;
        LayoutDirection layoutDirection2;
        int i16;
        LayoutDirection layoutDirection3;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions4;
        Composer composer2;
        final boolean z8;
        final Function1<? super TextFieldIcon.Dropdown.Item, Unit> function16;
        final LayoutDirection layoutDirection4;
        final Function1<? super TextFieldValue, Unit> function17;
        final Modifier modifier5;
        final VisualTransformation visualTransformation2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(label, "label");
        Composer composerStartRestartGroup = composer.startRestartGroup(1851537946);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    i4 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changed(label) ? 2048 : 1024;
                }
                int i17 = 8192;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        i4 |= composerStartRestartGroup.changed(str) ? 16384 : 8192;
                    }
                    if ((i3 & 32) == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= composerStartRestartGroup.changed(textFieldIcon) ? 131072 : 65536;
                    }
                    if ((i3 & 64) == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) == 0) {
                        i4 |= 12582912;
                    } else {
                        if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changed(z4) ? 8388608 : 4194304;
                        }
                        if ((i3 & 256) == 0) {
                            if ((100663296 & i) == 0) {
                                i4 |= composerStartRestartGroup.changed(str2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            i5 = i3 & 512;
                            if (i5 == 0) {
                                i4 |= 805306368;
                                z6 = z5;
                            } else {
                                z6 = z5;
                                if ((i & 805306368) == 0) {
                                    i4 |= composerStartRestartGroup.changed(z6) ? 536870912 : 268435456;
                                }
                            }
                            i6 = i3 & 1024;
                            if (i6 == 0) {
                                i7 = i2 | 6;
                                modifier2 = modifier;
                            } else {
                                modifier2 = modifier;
                                if ((i2 & 6) == 0) {
                                    i7 = i2 | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
                                } else {
                                    i7 = i2;
                                }
                            }
                            i8 = i3 & 2048;
                            if (i8 == 0) {
                                i7 |= 48;
                                i9 = i8;
                            } else if ((i2 & 48) == 0) {
                                i9 = i8;
                                i7 |= composerStartRestartGroup.changed(visualTransformation) ? 32 : 16;
                            } else {
                                i9 = i8;
                            }
                            int i18 = i7;
                            i10 = i3 & 4096;
                            if (i10 == 0) {
                                i11 = i18 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                            } else {
                                int i19 = i18;
                                if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                    i19 |= composerStartRestartGroup.changed(layoutDirection) ? 256 : 128;
                                }
                                i11 = i19;
                            }
                            i12 = i3 & 8192;
                            if (i12 == 0) {
                                i13 = i11 | 3072;
                            } else {
                                int i20 = i11;
                                if ((i2 & 3072) == 0) {
                                    i13 = i20 | (composerStartRestartGroup.changed(keyboardOptions) ? 2048 : 1024);
                                } else {
                                    i13 = i20;
                                }
                            }
                            if ((i2 & 24576) == 0) {
                                if ((i3 & 16384) == 0 && composerStartRestartGroup.changed(keyboardActions)) {
                                    i17 = 16384;
                                }
                                i13 |= i17;
                            }
                            i14 = i3 & 32768;
                            if (i14 == 0) {
                                i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i13 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
                            }
                            i15 = i3 & 65536;
                            if (i15 == 0) {
                                i13 |= 1572864;
                            } else if ((i2 & 1572864) == 0) {
                                i13 |= composerStartRestartGroup.changedInstance(function12) ? 1048576 : 524288;
                            }
                            if ((i4 & 306783379) == 306783378 || (i13 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i5 != 0) {
                                        z6 = true;
                                    }
                                    Modifier.Companion companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                                    none = i9 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                    LayoutDirection layoutDirection5 = i10 == 0 ? null : layoutDirection;
                                    KeyboardOptions keyboardOptions4 = i12 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                    if ((i3 & 16384) == 0) {
                                        keyboardActions2 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                        i13 &= -57345;
                                    } else {
                                        keyboardActions2 = keyboardActions;
                                    }
                                    if (i14 == 0) {
                                        composerStartRestartGroup.startReplaceGroup(1576335636);
                                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        modifier3 = companion;
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function1() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda9
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return TextFieldUIKt.TextFieldUi$lambda$41$lambda$40((TextFieldValue) obj);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        function13 = (Function1) objRememberedValue;
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else {
                                        modifier3 = companion;
                                        function13 = function1;
                                    }
                                    if (i15 == 0) {
                                        composerStartRestartGroup.startReplaceGroup(1576338100);
                                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        Function1<? super TextFieldValue, Unit> function18 = function13;
                                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function1() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda10
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return TextFieldUIKt.TextFieldUi$lambda$43$lambda$42((TextFieldIcon.Dropdown.Item) obj);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        modifier4 = modifier3;
                                        function14 = function18;
                                        function15 = (Function1) objRememberedValue2;
                                    } else {
                                        modifier4 = modifier3;
                                        function14 = function13;
                                        function15 = function12;
                                    }
                                    z7 = z6;
                                    keyboardOptions2 = keyboardOptions4;
                                    keyboardActions3 = keyboardActions2;
                                    layoutDirection2 = layoutDirection5;
                                    i16 = i13;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 16384) != 0) {
                                        i13 &= -57345;
                                    }
                                    layoutDirection2 = layoutDirection;
                                    keyboardOptions2 = keyboardOptions;
                                    keyboardActions3 = keyboardActions;
                                    function14 = function1;
                                    function15 = function12;
                                    modifier4 = modifier2;
                                    z7 = z6;
                                    i16 = i13;
                                    none = visualTransformation;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1851537946, i4, i16, "com.stripe.android.uicore.elements.TextFieldUi (TextFieldUI.kt:281)");
                                }
                                final TextFieldColors textFieldColorsM8847TextFieldColorsGyCwops = m8847TextFieldColorsGyCwops(z4, 0L, 0L, 0L, composerStartRestartGroup, (i4 >> 21) & 14, 14);
                                ProvidableCompositionLocal<FormInsets> localTextFieldInsets = StripeThemeKt.getLocalTextFieldInsets();
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object objConsume = composerStartRestartGroup.consume(localTextFieldInsets);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                final FormInsets formInsets = (FormInsets) objConsume;
                                composerStartRestartGroup.startReplaceGroup(1576342753);
                                if (layoutDirection2 != null) {
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume2 = composerStartRestartGroup.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    layoutDirection3 = (LayoutDirection) objConsume2;
                                } else {
                                    layoutDirection3 = layoutDirection2;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                final KeyboardOptions keyboardOptions5 = keyboardOptions2;
                                final KeyboardActions keyboardActions5 = keyboardActions3;
                                final VisualTransformation visualTransformation3 = none;
                                CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalLayoutDirection().provides(layoutDirection3), ComposableLambdaKt.rememberComposableLambda(2071297754, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt.TextFieldUi.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i21) {
                                        if ((i21 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(2071297754, i21, -1, "com.stripe.android.uicore.elements.TextFieldUi.<anonymous> (TextFieldUI.kt:288)");
                                            }
                                            TextFieldValue textFieldValue = value;
                                            Function1<TextFieldValue, Unit> function19 = function14;
                                            ComposableLambda composableLambdaRememberComposableLambda = null;
                                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                                            boolean z9 = z;
                                            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(966902356, true, new AnonymousClass1(z3, label, z7), composer3, 54);
                                            final String str3 = str;
                                            composer3.startReplaceGroup(387720147);
                                            ComposableLambda composableLambdaRememberComposableLambda3 = str3 == null ? null : ComposableLambdaKt.rememberComposableLambda(-382025762, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$TextFieldUi$3$2$1
                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer4, int i22) {
                                                    if ((i22 & 3) == 2 && composer4.getSkipping()) {
                                                        composer4.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-382025762, i22, -1, "com.stripe.android.uicore.elements.TextFieldUi.<anonymous>.<anonymous>.<anonymous> (TextFieldUI.kt:308)");
                                                    }
                                                    PlaceHolderKt.Placeholder(str3, null, false, composer4, 0, 6);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer3, 54);
                                            composer3.endReplaceGroup();
                                            final TextFieldIcon textFieldIcon2 = textFieldIcon;
                                            composer3.startReplaceGroup(387724692);
                                            if (textFieldIcon2 != null) {
                                                final boolean z10 = z2;
                                                final Function1<TextFieldIcon.Dropdown.Item, Unit> function110 = function15;
                                                composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(224578945, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$TextFieldUi$3$3$1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                        invoke(composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer4, int i22) {
                                                        if ((i22 & 3) == 2 && composer4.getSkipping()) {
                                                            composer4.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(224578945, i22, -1, "com.stripe.android.uicore.elements.TextFieldUi.<anonymous>.<anonymous>.<anonymous> (TextFieldUI.kt:313)");
                                                        }
                                                        TextFieldUIKt.Composable(textFieldIcon2, z10, function110, composer4, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer3, 54);
                                            }
                                            composer3.endReplaceGroup();
                                            CompatTextFieldKt.CompatTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function19, modifierFillMaxWidth$default, z9, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) composableLambdaRememberComposableLambda2, (Function2<? super Composer, ? super Integer, Unit>) composableLambdaRememberComposableLambda3, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) composableLambdaRememberComposableLambda, z4, str2, visualTransformation3, keyboardOptions5, keyboardActions5, true, 0, 0, (MutableInteractionSource) null, (Shape) null, textFieldColorsM8847TextFieldColorsGyCwops, formInsets.asPaddingValues(), composer3, 1572864, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 983344);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }

                                    /* compiled from: TextFieldUI.kt */
                                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                                    /* renamed from: com.stripe.android.uicore.elements.TextFieldUIKt$TextFieldUi$3$1, reason: invalid class name */
                                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                        final /* synthetic */ String $label;
                                        final /* synthetic */ boolean $shouldAnnounceLabel;
                                        final /* synthetic */ boolean $showOptionalLabel;

                                        AnonymousClass1(boolean z, String str, boolean z2) {
                                            this.$showOptionalLabel = z;
                                            this.$label = str;
                                            this.$shouldAnnounceLabel = z2;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                            invoke(composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer, int i) {
                                            String strStringResource;
                                            Modifier.Companion companionClearAndSetSemantics;
                                            if ((i & 3) != 2 || !composer.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(966902356, i, -1, "com.stripe.android.uicore.elements.TextFieldUi.<anonymous>.<anonymous> (TextFieldUI.kt:294)");
                                                }
                                                composer.startReplaceGroup(-771945217);
                                                if (this.$showOptionalLabel) {
                                                    strStringResource = StringResources_androidKt.stringResource(R.string.stripe_form_label_optional, new Object[]{this.$label}, composer, 0);
                                                } else {
                                                    strStringResource = this.$label;
                                                }
                                                composer.endReplaceGroup();
                                                composer.startReplaceGroup(-771935689);
                                                if (this.$shouldAnnounceLabel) {
                                                    companionClearAndSetSemantics = Modifier.INSTANCE;
                                                } else {
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    composer.startReplaceGroup(-771933550);
                                                    Object objRememberedValue = composer.rememberedValue();
                                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue = new Function1() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$TextFieldUi$3$1$$ExternalSyntheticLambda0
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj) {
                                                                return TextFieldUIKt.AnonymousClass3.AnonymousClass1.invoke$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                                                            }
                                                        };
                                                        composer.updateRememberedValue(objRememberedValue);
                                                    }
                                                    composer.endReplaceGroup();
                                                    companionClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) objRememberedValue);
                                                }
                                                composer.endReplaceGroup();
                                                FormLabelKt.FormLabel(strStringResource, companionClearAndSetSemantics, composer, 0, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer.skipToGroupEnd();
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$1$lambda$0(SemanticsPropertyReceiver clearAndSetSemantics) {
                                            Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                keyboardOptions3 = keyboardOptions5;
                                keyboardActions4 = keyboardActions5;
                                composer2 = composerStartRestartGroup;
                                z8 = z7;
                                function16 = function15;
                                layoutDirection4 = layoutDirection2;
                                function17 = function14;
                                modifier5 = modifier4;
                                visualTransformation2 = visualTransformation3;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                keyboardOptions3 = keyboardOptions;
                                keyboardActions4 = keyboardActions;
                                function17 = function1;
                                function16 = function12;
                                modifier5 = modifier2;
                                composer2 = composerStartRestartGroup;
                                z8 = z6;
                                visualTransformation2 = visualTransformation;
                                layoutDirection4 = layoutDirection;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda12
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return TextFieldUIKt.TextFieldUi$lambda$44(value, z, z2, label, str, textFieldIcon, z3, z4, str2, z8, modifier5, visualTransformation2, layoutDirection4, keyboardOptions3, keyboardActions4, function17, function16, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 100663296;
                        i5 = i3 & 512;
                        if (i5 == 0) {
                        }
                        i6 = i3 & 1024;
                        if (i6 == 0) {
                        }
                        i8 = i3 & 2048;
                        if (i8 == 0) {
                        }
                        int i182 = i7;
                        i10 = i3 & 4096;
                        if (i10 == 0) {
                        }
                        i12 = i3 & 8192;
                        if (i12 == 0) {
                        }
                        if ((i2 & 24576) == 0) {
                        }
                        i14 = i3 & 32768;
                        if (i14 == 0) {
                        }
                        i15 = i3 & 65536;
                        if (i15 == 0) {
                        }
                        if ((i4 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if ((i3 & 16384) == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                z7 = z6;
                                keyboardOptions2 = keyboardOptions4;
                                keyboardActions3 = keyboardActions2;
                                layoutDirection2 = layoutDirection5;
                                i16 = i13;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                final TextFieldColors textFieldColorsM8847TextFieldColorsGyCwops2 = m8847TextFieldColorsGyCwops(z4, 0L, 0L, 0L, composerStartRestartGroup, (i4 >> 21) & 14, 14);
                                ProvidableCompositionLocal<FormInsets> localTextFieldInsets2 = StripeThemeKt.getLocalTextFieldInsets();
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object objConsume3 = composerStartRestartGroup.consume(localTextFieldInsets2);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                final FormInsets formInsets2 = (FormInsets) objConsume3;
                                composerStartRestartGroup.startReplaceGroup(1576342753);
                                if (layoutDirection2 != null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                final KeyboardOptions keyboardOptions52 = keyboardOptions2;
                                final KeyboardActions keyboardActions52 = keyboardActions3;
                                final VisualTransformation visualTransformation32 = none;
                                CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalLayoutDirection().provides(layoutDirection3), ComposableLambdaKt.rememberComposableLambda(2071297754, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt.TextFieldUi.3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i21) {
                                        if ((i21 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(2071297754, i21, -1, "com.stripe.android.uicore.elements.TextFieldUi.<anonymous> (TextFieldUI.kt:288)");
                                            }
                                            TextFieldValue textFieldValue = value;
                                            Function1<TextFieldValue, Unit> function19 = function14;
                                            ComposableLambda composableLambdaRememberComposableLambda = null;
                                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                                            boolean z9 = z;
                                            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(966902356, true, new AnonymousClass1(z3, label, z7), composer3, 54);
                                            final String str3 = str;
                                            composer3.startReplaceGroup(387720147);
                                            ComposableLambda composableLambdaRememberComposableLambda3 = str3 == null ? null : ComposableLambdaKt.rememberComposableLambda(-382025762, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$TextFieldUi$3$2$1
                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer4, int i22) {
                                                    if ((i22 & 3) == 2 && composer4.getSkipping()) {
                                                        composer4.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-382025762, i22, -1, "com.stripe.android.uicore.elements.TextFieldUi.<anonymous>.<anonymous>.<anonymous> (TextFieldUI.kt:308)");
                                                    }
                                                    PlaceHolderKt.Placeholder(str3, null, false, composer4, 0, 6);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer3, 54);
                                            composer3.endReplaceGroup();
                                            final TextFieldIcon textFieldIcon2 = textFieldIcon;
                                            composer3.startReplaceGroup(387724692);
                                            if (textFieldIcon2 != null) {
                                                final boolean z10 = z2;
                                                final Function1<? super TextFieldIcon.Dropdown.Item, Unit> function110 = function15;
                                                composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(224578945, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$TextFieldUi$3$3$1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                        invoke(composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer4, int i22) {
                                                        if ((i22 & 3) == 2 && composer4.getSkipping()) {
                                                            composer4.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(224578945, i22, -1, "com.stripe.android.uicore.elements.TextFieldUi.<anonymous>.<anonymous>.<anonymous> (TextFieldUI.kt:313)");
                                                        }
                                                        TextFieldUIKt.Composable(textFieldIcon2, z10, function110, composer4, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer3, 54);
                                            }
                                            composer3.endReplaceGroup();
                                            CompatTextFieldKt.CompatTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function19, modifierFillMaxWidth$default, z9, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) composableLambdaRememberComposableLambda2, (Function2<? super Composer, ? super Integer, Unit>) composableLambdaRememberComposableLambda3, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) composableLambdaRememberComposableLambda, z4, str2, visualTransformation32, keyboardOptions52, keyboardActions52, true, 0, 0, (MutableInteractionSource) null, (Shape) null, textFieldColorsM8847TextFieldColorsGyCwops2, formInsets2.asPaddingValues(), composer3, 1572864, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 983344);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }

                                    /* compiled from: TextFieldUI.kt */
                                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                                    /* renamed from: com.stripe.android.uicore.elements.TextFieldUIKt$TextFieldUi$3$1, reason: invalid class name */
                                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                        final /* synthetic */ String $label;
                                        final /* synthetic */ boolean $shouldAnnounceLabel;
                                        final /* synthetic */ boolean $showOptionalLabel;

                                        AnonymousClass1(boolean z, String str, boolean z2) {
                                            this.$showOptionalLabel = z;
                                            this.$label = str;
                                            this.$shouldAnnounceLabel = z2;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                            invoke(composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer, int i) {
                                            String strStringResource;
                                            Modifier.Companion companionClearAndSetSemantics;
                                            if ((i & 3) != 2 || !composer.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(966902356, i, -1, "com.stripe.android.uicore.elements.TextFieldUi.<anonymous>.<anonymous> (TextFieldUI.kt:294)");
                                                }
                                                composer.startReplaceGroup(-771945217);
                                                if (this.$showOptionalLabel) {
                                                    strStringResource = StringResources_androidKt.stringResource(R.string.stripe_form_label_optional, new Object[]{this.$label}, composer, 0);
                                                } else {
                                                    strStringResource = this.$label;
                                                }
                                                composer.endReplaceGroup();
                                                composer.startReplaceGroup(-771935689);
                                                if (this.$shouldAnnounceLabel) {
                                                    companionClearAndSetSemantics = Modifier.INSTANCE;
                                                } else {
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    composer.startReplaceGroup(-771933550);
                                                    Object objRememberedValue = composer.rememberedValue();
                                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue = new Function1() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$TextFieldUi$3$1$$ExternalSyntheticLambda0
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj) {
                                                                return TextFieldUIKt.AnonymousClass3.AnonymousClass1.invoke$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                                                            }
                                                        };
                                                        composer.updateRememberedValue(objRememberedValue);
                                                    }
                                                    composer.endReplaceGroup();
                                                    companionClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) objRememberedValue);
                                                }
                                                composer.endReplaceGroup();
                                                FormLabelKt.FormLabel(strStringResource, companionClearAndSetSemantics, composer, 0, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer.skipToGroupEnd();
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$1$lambda$0(SemanticsPropertyReceiver clearAndSetSemantics) {
                                            Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                keyboardOptions3 = keyboardOptions52;
                                keyboardActions4 = keyboardActions52;
                                composer2 = composerStartRestartGroup;
                                z8 = z7;
                                function16 = function15;
                                layoutDirection4 = layoutDirection2;
                                function17 = function14;
                                modifier5 = modifier4;
                                visualTransformation2 = visualTransformation32;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i3 & 256) == 0) {
                    }
                    i5 = i3 & 512;
                    if (i5 == 0) {
                    }
                    i6 = i3 & 1024;
                    if (i6 == 0) {
                    }
                    i8 = i3 & 2048;
                    if (i8 == 0) {
                    }
                    int i1822 = i7;
                    i10 = i3 & 4096;
                    if (i10 == 0) {
                    }
                    i12 = i3 & 8192;
                    if (i12 == 0) {
                    }
                    if ((i2 & 24576) == 0) {
                    }
                    i14 = i3 & 32768;
                    if (i14 == 0) {
                    }
                    i15 = i3 & 65536;
                    if (i15 == 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                if ((i3 & 32) == 0) {
                }
                if ((i3 & 64) == 0) {
                }
                if ((i3 & 128) == 0) {
                }
                if ((i3 & 256) == 0) {
                }
                i5 = i3 & 512;
                if (i5 == 0) {
                }
                i6 = i3 & 1024;
                if (i6 == 0) {
                }
                i8 = i3 & 2048;
                if (i8 == 0) {
                }
                int i18222 = i7;
                i10 = i3 & 4096;
                if (i10 == 0) {
                }
                i12 = i3 & 8192;
                if (i12 == 0) {
                }
                if ((i2 & 24576) == 0) {
                }
                i14 = i3 & 32768;
                if (i14 == 0) {
                }
                i15 = i3 & 65536;
                if (i15 == 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i3 & 8) != 0) {
            }
            int i172 = 8192;
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) == 0) {
            }
            if ((i3 & 64) == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            if ((i3 & 256) == 0) {
            }
            i5 = i3 & 512;
            if (i5 == 0) {
            }
            i6 = i3 & 1024;
            if (i6 == 0) {
            }
            i8 = i3 & 2048;
            if (i8 == 0) {
            }
            int i182222 = i7;
            i10 = i3 & 4096;
            if (i10 == 0) {
            }
            i12 = i3 & 8192;
            if (i12 == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i14 = i3 & 32768;
            if (i14 == 0) {
            }
            i15 = i3 & 65536;
            if (i15 == 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) != 0) {
        }
        int i1722 = 8192;
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        i5 = i3 & 512;
        if (i5 == 0) {
        }
        i6 = i3 & 1024;
        if (i6 == 0) {
        }
        i8 = i3 & 2048;
        if (i8 == 0) {
        }
        int i1822222 = i7;
        i10 = i3 & 4096;
        if (i10 == 0) {
        }
        i12 = i3 & 8192;
        if (i12 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i14 = i3 & 32768;
        if (i14 == 0) {
        }
        i15 = i3 & 65536;
        if (i15 == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Composable(final TextFieldIcon textFieldIcon, boolean z, final Function1<? super TextFieldIcon.Dropdown.Item, Unit> function1, Composer composer, final int i) {
        int i2;
        final boolean z2 = z;
        Composer composerStartRestartGroup = composer.startRestartGroup(-310096182);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(textFieldIcon) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-310096182, i3, -1, "com.stripe.android.uicore.elements.Composable (TextFieldUI.kt:332)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (textFieldIcon instanceof TextFieldIcon.Trailing) {
                composerStartRestartGroup.startReplaceGroup(-1078787679);
                TrailingIcon((TextFieldIcon.Trailing) textFieldIcon, z2, null, composerStartRestartGroup, i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 4);
                composerStartRestartGroup.endReplaceGroup();
                z2 = z;
            } else if (textFieldIcon instanceof TextFieldIcon.MultiTrailing) {
                composerStartRestartGroup.startReplaceGroup(-1078664082);
                Modifier modifierM1020padding3ABfNKs = PaddingKt.m1020padding3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(10));
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1020padding3ABfNKs);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-906941877);
                TextFieldIcon.MultiTrailing multiTrailing = (TextFieldIcon.MultiTrailing) textFieldIcon;
                Iterator<T> it = multiTrailing.getStaticIcons().iterator();
                while (it.hasNext()) {
                    TrailingIcon((TextFieldIcon.Trailing) it.next(), z, null, composerStartRestartGroup, i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 4);
                }
                z2 = z;
                composerStartRestartGroup.endReplaceGroup();
                AnimatedIcons(multiTrailing.getAnimatedIcons(), z2, composerStartRestartGroup, i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                z2 = z;
                if (!(textFieldIcon instanceof TextFieldIcon.Dropdown)) {
                    composerStartRestartGroup.startReplaceGroup(-450443047);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1078344689);
                TrailingDropdown((TextFieldIcon.Dropdown) textFieldIcon, z2, function1, composerStartRestartGroup, i3 & PointerIconCompat.TYPE_TEXT);
                composerStartRestartGroup.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextFieldUIKt.Composable$lambda$48(textFieldIcon, z2, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AnimatedIcons(final List<TextFieldIcon.Trailing> icons, final boolean z, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(icons, "icons");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2067380269);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(icons) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2067380269, i2, -1, "com.stripe.android.uicore.elements.AnimatedIcons (TextFieldUI.kt:363)");
            }
            if (icons.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TextFieldUIKt.AnimatedIcons$lambda$49(icons, z, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ProvidableCompositionLocal<Boolean> localInstrumentationTest = StripeThemeKt.getLocalInstrumentationTest();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localInstrumentationTest);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            boolean zBooleanValue = ((Boolean) objConsume).booleanValue();
            Object objFirst = CollectionsKt.first((List<? extends Object>) icons);
            composerStartRestartGroup.startReplaceGroup(790383557);
            boolean zChanged = composerStartRestartGroup.changed(zBooleanValue) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(icons);
            TextFieldUIKt$AnimatedIcons$target$2$1 textFieldUIKt$AnimatedIcons$target$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || textFieldUIKt$AnimatedIcons$target$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                textFieldUIKt$AnimatedIcons$target$2$1RememberedValue = new TextFieldUIKt$AnimatedIcons$target$2$1(zBooleanValue, coroutineScope, icons, null);
                composerStartRestartGroup.updateRememberedValue(textFieldUIKt$AnimatedIcons$target$2$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            CrossfadeKt.Crossfade(AnimatedIcons$lambda$51(SnapshotStateKt.produceState(objFirst, (Function2) textFieldUIKt$AnimatedIcons$target$2$1RememberedValue, composerStartRestartGroup, 0)), (Modifier) null, (FiniteAnimationSpec<Float>) null, (String) null, ComposableLambdaKt.rememberComposableLambda(2089412202, true, new Function3<TextFieldIcon.Trailing, Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt.AnimatedIcons.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(TextFieldIcon.Trailing trailing, Composer composer2, Integer num) {
                    invoke(trailing, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(TextFieldIcon.Trailing it, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i3 & 6) == 0) {
                        i3 |= composer2.changed(it) ? 4 : 2;
                    }
                    if ((i3 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2089412202, i3, -1, "com.stripe.android.uicore.elements.AnimatedIcons.<anonymous> (TextFieldUI.kt:385)");
                    }
                    TextFieldUIKt.TrailingIcon(it, z, null, composer2, i3 & 14, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextFieldUIKt.AnimatedIcons$lambda$52(icons, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: TextFieldColors-GyCwops, reason: not valid java name */
    public static final TextFieldColors m8847TextFieldColorsGyCwops(boolean z, long j, long j2, long j3, Composer composer, int i, int i2) {
        composer.startReplaceGroup(-242141665);
        boolean z2 = (i2 & 1) != 0 ? false : z;
        long jM8728getOnComponent0d7_KjU = (i2 & 2) != 0 ? StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).m8728getOnComponent0d7_KjU() : j;
        long jM3656copywmQWz5c$default = (i2 & 4) != 0 ? Color.m3656copywmQWz5c$default(jM8728getOnComponent0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM8725getComponent0d7_KjU = (i2 & 8) != 0 ? StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).m8725getComponent0d7_KjU() : j3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-242141665, i, -1, "com.stripe.android.uicore.elements.TextFieldColors (TextFieldUI.kt:396)");
        }
        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
        composer.startReplaceGroup(147591660);
        if (z2) {
            jM8728getOnComponent0d7_KjU = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1827getError0d7_KjU();
        }
        composer.endReplaceGroup();
        long jM8729getPlaceholderText0d7_KjU = StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).m8729getPlaceholderText0d7_KjU();
        long jM8729getPlaceholderText0d7_KjU2 = StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).m8729getPlaceholderText0d7_KjU();
        long jM8729getPlaceholderText0d7_KjU3 = StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).m8729getPlaceholderText0d7_KjU();
        int i3 = i >> 3;
        long j4 = jM8725getComponent0d7_KjU;
        TextFieldColors textFieldColorsM2061textFieldColorsdx8h9Zs = textFieldDefaults.m2061textFieldColorsdx8h9Zs(jM8728getOnComponent0d7_KjU, jM3656copywmQWz5c$default, j4, StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).m8731getTextCursor0d7_KjU(), 0L, Color.INSTANCE.m3692getTransparent0d7_KjU(), Color.INSTANCE.m3692getTransparent0d7_KjU(), Color.INSTANCE.m3692getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, jM8729getPlaceholderText0d7_KjU2, jM8729getPlaceholderText0d7_KjU, 0L, 0L, jM8729getPlaceholderText0d7_KjU3, 0L, composer, (i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 14352384 | (i3 & 896), 0, 48, 1474320);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return textFieldColorsM2061textFieldColorsdx8h9Zs;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TrailingIcon(final TextFieldIcon.Trailing trailingIcon, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(trailingIcon, "trailingIcon");
        Composer composerStartRestartGroup = composer.startRestartGroup(580728384);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(trailingIcon) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(580728384, i3, -1, "com.stripe.android.uicore.elements.TrailingIcon (TextFieldUI.kt:419)");
                }
                if (!z) {
                    composerStartRestartGroup.startReplaceGroup(613713810);
                    ProgressIndicatorKt.m1958CircularProgressIndicatorLxG7B9w(SizeKt.m1051height3ABfNKs(ProgressSemanticsKt.progressSemantics(modifier4), Dp.m6117constructorimpl(24)), 0L, 0.0f, 0L, 0, composerStartRestartGroup, 0, 30);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    String strStringResource = null;
                    if (trailingIcon.isTintable()) {
                        composerStartRestartGroup.startReplaceGroup(613923866);
                        Painter painterPainterResource = PainterResources_androidKt.painterResource(trailingIcon.getIdRes(), composerStartRestartGroup, 0);
                        Integer contentDescription = trailingIcon.getContentDescription();
                        composerStartRestartGroup.startReplaceGroup(435450423);
                        if (contentDescription != null) {
                            contentDescription.intValue();
                            strStringResource = StringResources_androidKt.stringResource(trailingIcon.getContentDescription().intValue(), composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        IconKt.m1925Iconww6aTOc(painterPainterResource, strStringResource, conditionallyClickable(modifier4, trailingIcon.getOnClick()), 0L, composerStartRestartGroup, 0, 8);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(614251257);
                        Painter painterPainterResource2 = PainterResources_androidKt.painterResource(trailingIcon.getIdRes(), composerStartRestartGroup, 0);
                        Integer contentDescription2 = trailingIcon.getContentDescription();
                        composerStartRestartGroup.startReplaceGroup(435461015);
                        if (contentDescription2 != null) {
                            contentDescription2.intValue();
                            strStringResource = StringResources_androidKt.stringResource(trailingIcon.getContentDescription().intValue(), composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ImageKt.Image(painterPainterResource2, strStringResource, conditionallyClickable(modifier4, trailingIcon.getOnClick()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 0, 120);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TextFieldUIKt.TrailingIcon$lambda$55(trailingIcon, z, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!z) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void TrailingDropdown(final TextFieldIcon.Dropdown dropdown, final boolean z, final Function1<? super TextFieldIcon.Dropdown.Item, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-58118303);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(dropdown) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-58118303, i3, -1, "com.stripe.android.uicore.elements.TrailingDropdown (TextFieldUI.kt:450)");
            }
            composerStartRestartGroup.startReplaceGroup(1539038826);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            boolean z2 = (z || dropdown.getHide()) ? false : true;
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1539043696);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextFieldUIKt.TrailingDropdown$lambda$60$lambda$59((FocusProperties) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFocusProperties = FocusPropertiesKt.focusProperties(companion, (Function1) objRememberedValue2);
            composerStartRestartGroup.startReplaceGroup(1539045615);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TextFieldUIKt.TrailingDropdown$lambda$62$lambda$61(mutableState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierTestTag = TestTagKt.testTag(ClickableKt.m608clickableXHw0xAI$default(modifierFocusProperties, z2, null, null, (Function0) objRememberedValue3, 6, null), DROPDOWN_MENU_CLICKABLE_TEST_TAG);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierTestTag);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM1020padding3ABfNKs = PaddingKt.m1020padding3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(10));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(4));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, centerVertically, composerStartRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1020padding3ABfNKs);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TrailingIcon(new TextFieldIcon.Trailing(dropdown.getCurrentItem().getIcon().intValue(), null, false, null, 10, null), z, null, composerStartRestartGroup, i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 4);
            composerStartRestartGroup.startReplaceGroup(-268189028);
            if (z2) {
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8729getPlaceholderText0d7_KjU())), ComposableSingletons$TextFieldUIKt.INSTANCE.m8783getLambda1$stripe_ui_core_release(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            boolean zTrailingDropdown$lambda$57 = TrailingDropdown$lambda$57(mutableState);
            boolean z3 = false;
            ResolvableString title = dropdown.getTitle();
            TextFieldIcon.Dropdown.Item currentItem = dropdown.getCurrentItem();
            List<TextFieldIcon.Dropdown.Item> items = dropdown.getItems();
            long jM8730getSubtitle0d7_KjU = StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8730getSubtitle0d7_KjU();
            long jM8728getOnComponent0d7_KjU = StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8728getOnComponent0d7_KjU();
            TextFieldIcon.Dropdown.Item item = currentItem;
            composerStartRestartGroup.startReplaceGroup(-797446144);
            if ((i3 & 896) == 256) {
                z3 = true;
            }
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TextFieldUIKt.TrailingDropdown$lambda$68$lambda$65$lambda$64(function1, mutableState, (TextFieldIcon.Dropdown.Item) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function1 function12 = (Function1) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-797442133);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TextFieldUIKt.TrailingDropdown$lambda$68$lambda$67$lambda$66(mutableState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            SingleChoiceDropdownUIKt.m8835SingleChoiceDropdownWMdw5o4(zTrailingDropdown$lambda$57, title, item, items, function12, jM8730getSubtitle0d7_KjU, jM8728getOnComponent0d7_KjU, (Function0) objRememberedValue5, composerStartRestartGroup, 12582912);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TextFieldUIKt.TrailingDropdown$lambda$69(dropdown, z, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean TrailingDropdown$lambda$57(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void TrailingDropdown$lambda$58(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrailingDropdown$lambda$60$lambda$59(FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "$this$focusProperties");
        focusProperties.setCanFocus(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrailingDropdown$lambda$62$lambda$61(MutableState mutableState) {
        TrailingDropdown$lambda$58(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrailingDropdown$lambda$68$lambda$65$lambda$64(Function1 function1, MutableState mutableState, TextFieldIcon.Dropdown.Item item) {
        Intrinsics.checkNotNullParameter(item, "item");
        function1.invoke(item);
        TrailingDropdown$lambda$58(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrailingDropdown$lambda$68$lambda$67$lambda$66(MutableState mutableState) {
        TrailingDropdown$lambda$58(mutableState, false);
        return Unit.INSTANCE;
    }

    /* renamed from: onPreviewKeyEvent-I7lrPNg, reason: not valid java name */
    private static final Modifier m8848onPreviewKeyEventI7lrPNg(Modifier modifier, final String str, final FocusManager focusManager, final int i) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$onPreviewKeyEvent$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m8849invokeZmokQxo(keyEvent.m4711unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m8849invokeZmokQxo(android.view.KeyEvent event) {
                boolean z;
                Intrinsics.checkNotNullParameter(event, "event");
                if (KeyEventType.m4715equalsimpl0(KeyEvent_androidKt.m4723getTypeZmokQxo(event), KeyEventType.INSTANCE.m4719getKeyDownCS__XNY()) && event.getKeyCode() == 67 && str.length() == 0) {
                    FocusManagerKtKt.m8697moveFocusSafelyMxy_nc0(focusManager, i);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    private static final Modifier onAutofill(Modifier modifier, final TextFieldController textFieldController, final Function1<? super String, Unit> function1, Composer composer, int i) {
        composer.startReplaceGroup(-1079542001);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1079542001, i, -1, "com.stripe.android.uicore.elements.onAutofill (TextFieldUI.kt:537)");
        }
        List listListOfNotNull = CollectionsKt.listOfNotNull(textFieldController.getAutofillType());
        composer.startReplaceGroup(558038239);
        boolean z = ((((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) ^ 48) > 32 && composer.changedInstance(textFieldController)) || (i & 48) == 32) | ((((i & 896) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composer.changed(function1)) || (i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TextFieldUIKt.onAutofill$lambda$72$lambda$71(textFieldController, function1, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierAutofill = AutofillModifierKt.autofill(modifier, listListOfNotNull, (Function1) objRememberedValue, composer, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierAutofill;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAutofill$lambda$72$lambda$71(TextFieldController textFieldController, Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AutofillType autofillType = textFieldController.getAutofillType();
        if (autofillType != null) {
            function1.invoke(autofillType.name());
        }
        textFieldController.onValueChange(it);
        return Unit.INSTANCE;
    }

    private static final Modifier onFocusChanged(Modifier modifier, final TextFieldController textFieldController, final MutableState<Boolean> mutableState) {
        return FocusChangedModifierKt.onFocusChanged(modifier, new Function1() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TextFieldUIKt.onFocusChanged$lambda$73(mutableState, textFieldController, (FocusState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFocusChanged$lambda$73(MutableState mutableState, TextFieldController textFieldController, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (((Boolean) mutableState.getValue()).booleanValue() != it.isFocused()) {
            textFieldController.onFocusChange(it.isFocused());
        }
        mutableState.setValue(Boolean.valueOf(it.isFocused()));
        return Unit.INSTANCE;
    }

    private static final Modifier conditionallyClickable(Modifier modifier, final Function0<Unit> function0) {
        return function0 != null ? ClickableKt.m608clickableXHw0xAI$default(modifier, false, null, null, new Function0() { // from class: com.stripe.android.uicore.elements.TextFieldUIKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TextFieldUIKt.conditionallyClickable$lambda$74(function0);
            }
        }, 7, null) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit conditionallyClickable$lambda$74(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final FieldError TextFieldSection$lambda$1(State<FieldError> state) {
        return state.getValue();
    }

    private static final String TextField_ZkbtPhE$lambda$9(State<String> state) {
        return state.getValue();
    }

    private static final TextFieldIcon TextField_ZkbtPhE$lambda$10(State<? extends TextFieldIcon> state) {
        return state.getValue();
    }

    private static final boolean TextField_ZkbtPhE$lambda$11(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean TextField_ZkbtPhE$lambda$12(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final ResolvableString TextField_ZkbtPhE$lambda$13(State<? extends ResolvableString> state) {
        return state.getValue();
    }

    private static final VisualTransformation TextField_ZkbtPhE$lambda$14(State<? extends VisualTransformation> state) {
        return state.getValue();
    }

    private static final String TextField_ZkbtPhE$lambda$15(State<String> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldState TextField_ZkbtPhE$lambda$18(State<? extends TextFieldState> state) {
        return state.getValue();
    }

    private static final ResolvableString TextField_ZkbtPhE$lambda$19(State<? extends ResolvableString> state) {
        return state.getValue();
    }

    private static final FieldError TextField_ZkbtPhE$lambda$20(State<FieldError> state) {
        return state.getValue();
    }

    private static final TextFieldIcon.Trailing AnimatedIcons$lambda$51(State<TextFieldIcon.Trailing> state) {
        return state.getValue();
    }
}
