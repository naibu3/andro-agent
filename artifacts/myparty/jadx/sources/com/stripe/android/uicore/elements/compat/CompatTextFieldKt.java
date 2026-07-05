package com.stripe.android.uicore.elements.compat;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.material.TextKt;
import androidx.compose.material.Typography;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.R;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.uicore.elements.compat.CompatTextFieldKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: CompatTextField.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a¥\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&H\u0007¢\u0006\u0002\u0010'\u001a¥\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020(2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&H\u0007¢\u0006\u0002\u0010)\u001aÔ\u0001\u0010*\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&H\u0003¢\u0006\u0002\u0010,\u001a¼\u0001\u0010-\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0013\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020.2\u0006\u0010%\u001a\u00020&2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\u0010/\u001aQ\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u0002022\n\b\u0002\u00103\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00104\u001a\u0004\u0018\u0001052 \u00106\u001a\u001c\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u000f¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\u0003\u0010\u0000H\u0001¢\u0006\u0004\b9\u0010:\u001a\u001e\u0010;\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u0007\"\u000e\u0010<\u001a\u00020\u001dX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u00020\u001dX\u0082T¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"CompatTextField", "", "value", "", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", ViewProps.ENABLED, "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", ReactTextInputShadowNode.PROP_PLACEHOLDER, "leadingIcon", "trailingIcon", "isError", "errorMessage", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "minLines", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", PaymentSheetAppearanceKeys.COLORS, "Landroidx/compose/material/TextFieldColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLjava/lang/String;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;IIII)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLjava/lang/String;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;IIII)V", "InsetDecorationBox", "innerTextField", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", "CommonDecorationBox", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;II)V", "Decoration", "contentColor", "Landroidx/compose/ui/graphics/Color;", "typography", "contentAlpha", "", UriUtil.LOCAL_CONTENT_SCHEME, "Landroidx/compose/runtime/ComposableOpenTarget;", "index", "Decoration-euL9pac", "(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "errorSemanticsWithDefault", "PlaceholderAnimationDuration", "PlaceholderAnimationDelayOrDuration", "stripe-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompatTextFieldKt {
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommonDecorationBox$lambda$18(String str, Function2 function2, VisualTransformation visualTransformation, Function2 function22, Function2 function23, Function2 function24, Function2 function25, boolean z, boolean z2, boolean z3, InteractionSource interactionSource, PaddingValues paddingValues, Shape shape, TextFieldColors textFieldColors, int i, int i2, Composer composer, int i3) {
        CommonDecorationBox(str, function2, visualTransformation, function22, function23, function24, function25, z, z2, z3, interactionSource, paddingValues, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompatTextField$lambda$2(String str, Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, String str2, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, int i3, int i4, int i5, int i6, Composer composer, int i7) {
        CompatTextField(str, (Function1<? super String, Unit>) function1, modifier, z, z2, textStyle, (Function2<? super Composer, ? super Integer, Unit>) function2, (Function2<? super Composer, ? super Integer, Unit>) function22, (Function2<? super Composer, ? super Integer, Unit>) function23, (Function2<? super Composer, ? super Integer, Unit>) function24, z3, str2, visualTransformation, keyboardOptions, keyboardActions, z4, i, i2, mutableInteractionSource, shape, textFieldColors, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompatTextField$lambda$5(TextFieldValue textFieldValue, Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, String str, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, int i3, int i4, int i5, int i6, Composer composer, int i7) {
        CompatTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifier, z, z2, textStyle, (Function2<? super Composer, ? super Integer, Unit>) function2, (Function2<? super Composer, ? super Integer, Unit>) function22, (Function2<? super Composer, ? super Integer, Unit>) function23, (Function2<? super Composer, ? super Integer, Unit>) function24, z3, str, visualTransformation, keyboardOptions, keyboardActions, z4, i, i2, mutableInteractionSource, shape, textFieldColors, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Decoration_euL9pac$lambda$19(long j, TextStyle textStyle, Float f, Function2 function2, int i, int i2, Composer composer, int i3) {
        m8862DecorationeuL9pac(j, textStyle, f, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InsetDecorationBox$lambda$12(String str, Function2 function2, boolean z, Function2 function22, Function2 function23, Function2 function24, Function2 function25, boolean z2, VisualTransformation visualTransformation, boolean z3, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, int i, int i2, int i3, Composer composer, int i4) {
        InsetDecorationBox(str, function2, z, function22, function23, function24, function25, z2, visualTransformation, z3, mutableInteractionSource, shape, textFieldColors, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:350:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CompatTextField(final String value, final Function1<? super String, Unit> onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, final String str, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Composer composer, final int i3, final int i4, final int i5, final int i6) {
        int i7;
        Modifier modifier2;
        int i8;
        boolean z5;
        int i9;
        boolean z6;
        TextStyle textStyle2;
        int i10;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i11;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Function2<? super Composer, ? super Integer, Unit> function27;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        int i28;
        int i29;
        KeyboardActions keyboardActions3;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        Shape textFieldShape;
        int i30;
        Composer composer2;
        TextFieldColors textFieldColorsM2061textFieldColorsdx8h9Zs;
        final TextFieldColors textFieldColors2;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        KeyboardActions keyboardActions4;
        PaddingValues paddingValues2;
        int i31;
        boolean z7;
        Function2<? super Composer, ? super Integer, Unit> function29;
        final boolean z8;
        VisualTransformation visualTransformation2;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final MutableInteractionSource mutableInteractionSource4;
        Shape shape2;
        TextStyle textStyle3;
        final boolean z9;
        PaddingValues paddingValuesM2052textFieldWithoutLabelPaddinga9UjIt4$default;
        Function2<? super Composer, ? super Integer, Unit> function211;
        long jM5632getColor0d7_KjU;
        final boolean z10;
        final boolean z11;
        final KeyboardActions keyboardActions5;
        final int i32;
        final MutableInteractionSource mutableInteractionSource5;
        final VisualTransformation visualTransformation3;
        Composer composer3;
        final Modifier modifier3;
        final TextStyle textStyle4;
        final TextFieldColors textFieldColors3;
        final boolean z12;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final Shape shape3;
        final PaddingValues paddingValues3;
        final KeyboardOptions keyboardOptions3;
        final int i33;
        final boolean z13;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-327306771);
        if ((i6 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i34 = i6 & 4;
        if (i34 != 0) {
            i7 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                modifier2 = modifier;
                i7 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i8 = i6 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    z5 = z;
                    i7 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
                }
                i9 = i6 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                } else {
                    if ((i3 & 24576) == 0) {
                        z6 = z2;
                        i7 |= composerStartRestartGroup.changed(z6) ? 16384 : 8192;
                    }
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        textStyle2 = textStyle;
                        i7 |= ((i6 & 32) == 0 && composerStartRestartGroup.changed(textStyle2)) ? 131072 : 65536;
                    } else {
                        textStyle2 = textStyle;
                    }
                    i10 = i6 & 64;
                    if (i10 == 0) {
                        i7 |= 1572864;
                        function25 = function2;
                    } else {
                        function25 = function2;
                        if ((i3 & 1572864) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function25) ? 1048576 : 524288;
                        }
                    }
                    i11 = i6 & 128;
                    if (i11 == 0) {
                        i7 |= 12582912;
                        function26 = function22;
                    } else {
                        function26 = function22;
                        if ((i3 & 12582912) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
                        }
                    }
                    i12 = i6 & 256;
                    if (i12 == 0) {
                        i7 |= 100663296;
                    } else {
                        if ((i3 & 100663296) == 0) {
                            i13 = i12;
                            i7 |= composerStartRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i14 = i6 & 512;
                        if (i14 != 0) {
                            i7 |= 805306368;
                        } else {
                            if ((i3 & 805306368) == 0) {
                                i15 = i14;
                                i7 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                            }
                            i16 = i6 & 1024;
                            if (i16 == 0) {
                                i18 = i4 | 6;
                                i17 = i16;
                            } else if ((i4 & 6) == 0) {
                                i17 = i16;
                                i18 = i4 | (composerStartRestartGroup.changed(z3) ? 4 : 2);
                            } else {
                                i17 = i16;
                                i18 = i4;
                            }
                            if ((i6 & 2048) == 0) {
                                i18 |= 48;
                            } else if ((i4 & 48) == 0) {
                                i18 |= composerStartRestartGroup.changed(str) ? 32 : 16;
                            }
                            int i35 = i18;
                            i19 = i6 & 4096;
                            if (i19 == 0) {
                                i20 = i35 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                            } else if ((i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                i20 = i35 | (composerStartRestartGroup.changed(visualTransformation) ? 256 : 128);
                            } else {
                                i20 = i35;
                            }
                            i21 = i6 & 8192;
                            if (i21 != 0) {
                                i22 = i20;
                                if ((i4 & 3072) == 0) {
                                    i22 |= composerStartRestartGroup.changed(keyboardOptions) ? 2048 : 1024;
                                }
                                if ((i4 & 24576) == 0) {
                                    i22 |= ((i6 & 16384) == 0 && composerStartRestartGroup.changed(keyboardActions)) ? 16384 : 8192;
                                }
                                i23 = i6 & 32768;
                                if (i23 != 0) {
                                    i22 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i22 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
                                }
                                if ((i4 & 1572864) == 0) {
                                    i22 |= ((i6 & 65536) == 0 && composerStartRestartGroup.changed(i)) ? 1048576 : 524288;
                                }
                                i24 = i6 & 131072;
                                if (i24 != 0) {
                                    i22 |= 12582912;
                                } else if ((i4 & 12582912) == 0) {
                                    i22 |= composerStartRestartGroup.changed(i2) ? 8388608 : 4194304;
                                }
                                i25 = i6 & 262144;
                                if (i25 != 0) {
                                    i22 |= 100663296;
                                } else if ((i4 & 100663296) == 0) {
                                    i22 |= composerStartRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                }
                                if ((i4 & 805306368) == 0) {
                                    i22 |= ((i6 & 524288) == 0 && composerStartRestartGroup.changed(shape)) ? 536870912 : 268435456;
                                }
                                if ((i5 & 6) == 0) {
                                    i26 = i5 | (((i6 & 1048576) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 4 : 2);
                                } else {
                                    i26 = i5;
                                }
                                if ((i5 & 48) == 0) {
                                    i26 |= ((i6 & 2097152) == 0 && composerStartRestartGroup.changed(paddingValues)) ? 32 : 16;
                                }
                                i27 = i26;
                                if ((i7 & 306783379) != 306783378 || (i22 & 306783379) != 306783378 || (i27 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        if (i34 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i8 != 0) {
                                            z5 = true;
                                        }
                                        if (i9 != 0) {
                                            z6 = false;
                                        }
                                        if ((i6 & 32) != 0) {
                                            ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume = composerStartRestartGroup.consume(localTextStyle);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            i7 &= -458753;
                                            textStyle2 = (TextStyle) objConsume;
                                        }
                                        if (i10 != 0) {
                                            function25 = null;
                                        }
                                        if (i11 != 0) {
                                            function26 = null;
                                        }
                                        Function2<? super Composer, ? super Integer, Unit> function216 = i13 == 0 ? null : function23;
                                        function27 = i15 == 0 ? null : function24;
                                        boolean z14 = i17 == 0 ? false : z3;
                                        VisualTransformation none = i19 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                        keyboardOptions2 = i21 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                        if ((i6 & 16384) == 0) {
                                            keyboardActions2 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                            i22 &= -57345;
                                        } else {
                                            keyboardActions2 = keyboardActions;
                                        }
                                        boolean z15 = i23 == 0 ? false : z4;
                                        if ((i6 & 65536) == 0) {
                                            i22 &= -3670017;
                                            i28 = z15 ? 1 : Integer.MAX_VALUE;
                                        } else {
                                            i28 = i;
                                        }
                                        i29 = i24 == 0 ? 1 : i2;
                                        Function2<? super Composer, ? super Integer, Unit> function217 = function216;
                                        if (i25 == 0) {
                                            composerStartRestartGroup.startReplaceGroup(1398613845);
                                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            keyboardActions3 = keyboardActions2;
                                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                            }
                                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                            composerStartRestartGroup.endReplaceGroup();
                                        } else {
                                            keyboardActions3 = keyboardActions2;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                        }
                                        if ((i6 & 524288) == 0) {
                                            mutableInteractionSource3 = mutableInteractionSource2;
                                            textFieldShape = TextFieldDefaults.INSTANCE.getTextFieldShape(composerStartRestartGroup, 6);
                                            i30 = i22 & (-1879048193);
                                        } else {
                                            mutableInteractionSource3 = mutableInteractionSource2;
                                            textFieldShape = shape;
                                            i30 = i22;
                                        }
                                        if ((i6 & 1048576) == 0) {
                                            textFieldColorsM2061textFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m2061textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 48, 2097151);
                                            composer2 = composerStartRestartGroup;
                                            i27 &= -15;
                                        } else {
                                            composer2 = composerStartRestartGroup;
                                            textFieldColorsM2061textFieldColorsdx8h9Zs = textFieldColors;
                                        }
                                        if ((i6 & 2097152) == 0) {
                                            if (function25 != null) {
                                                paddingValuesM2052textFieldWithoutLabelPaddinga9UjIt4$default = TextFieldDefaults.m2051textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                            } else {
                                                paddingValuesM2052textFieldWithoutLabelPaddinga9UjIt4$default = TextFieldDefaults.m2052textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                            }
                                            i27 &= -113;
                                            Function2<? super Composer, ? super Integer, Unit> function218 = function26;
                                            textFieldColors2 = textFieldColorsM2061textFieldColorsdx8h9Zs;
                                            function28 = function218;
                                            keyboardActions4 = keyboardActions3;
                                            i31 = i7;
                                            function29 = function25;
                                            paddingValues2 = paddingValuesM2052textFieldWithoutLabelPaddinga9UjIt4$default;
                                            function210 = function217;
                                            mutableInteractionSource4 = mutableInteractionSource3;
                                            shape2 = textFieldShape;
                                            z7 = z6;
                                            textStyle3 = textStyle2;
                                            z8 = z14;
                                            visualTransformation2 = none;
                                        } else {
                                            Function2<? super Composer, ? super Integer, Unit> function219 = function26;
                                            textFieldColors2 = textFieldColorsM2061textFieldColorsdx8h9Zs;
                                            function28 = function219;
                                            keyboardActions4 = keyboardActions3;
                                            paddingValues2 = paddingValues;
                                            i31 = i7;
                                            z7 = z6;
                                            function29 = function25;
                                            z8 = z14;
                                            visualTransformation2 = none;
                                            function210 = function217;
                                            mutableInteractionSource4 = mutableInteractionSource3;
                                            shape2 = textFieldShape;
                                            textStyle3 = textStyle2;
                                        }
                                        z9 = z15;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i6 & 32) != 0) {
                                            i7 &= -458753;
                                        }
                                        if ((i6 & 16384) != 0) {
                                            i22 &= -57345;
                                        }
                                        if ((i6 & 65536) != 0) {
                                            i22 &= -3670017;
                                        }
                                        if ((i6 & 524288) != 0) {
                                            i22 &= -1879048193;
                                        }
                                        if ((i6 & 1048576) != 0) {
                                            i27 &= -15;
                                        }
                                        if ((2097152 & i6) != 0) {
                                            i27 &= -113;
                                        }
                                        function27 = function24;
                                        visualTransformation2 = visualTransformation;
                                        keyboardOptions2 = keyboardOptions;
                                        keyboardActions4 = keyboardActions;
                                        i28 = i;
                                        i29 = i2;
                                        shape2 = shape;
                                        paddingValues2 = paddingValues;
                                        composer2 = composerStartRestartGroup;
                                        i31 = i7;
                                        z7 = z6;
                                        textStyle3 = textStyle2;
                                        function29 = function25;
                                        function28 = function26;
                                        i30 = i22;
                                        function210 = function23;
                                        z8 = z3;
                                        z9 = z4;
                                        mutableInteractionSource4 = mutableInteractionSource;
                                        textFieldColors2 = textFieldColors;
                                    }
                                    composer2.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        function211 = function29;
                                    } else {
                                        function211 = function29;
                                        ComposerKt.traceEventStart(-327306771, i31, i30, "com.stripe.android.uicore.elements.compat.CompatTextField (CompatTextField.kt:164)");
                                    }
                                    Composer composer4 = composer2;
                                    composer4.startReplaceGroup(1398628968);
                                    jM5632getColor0d7_KjU = textStyle3.m5632getColor0d7_KjU();
                                    if (jM5632getColor0d7_KjU == 16) {
                                        jM5632getColor0d7_KjU = textFieldColors2.textColor(z5, composer4, ((i31 >> 9) & 14) | ((i27 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).getValue().m3667unboximpl();
                                    }
                                    composer4.endReplaceGroup();
                                    TextStyle textStyleMerge = textStyle3.merge(new TextStyle(jM5632getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                    Modifier modifier4 = modifier2;
                                    Modifier modifierErrorSemanticsWithDefault = errorSemanticsWithDefault(TextFieldDefaults.m2049indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, modifier4, z5, z8, mutableInteractionSource4, textFieldColors2, 0.0f, 0.0f, 48, null), z8, str);
                                    TextStyle textStyle5 = textStyle3;
                                    int i36 = i30;
                                    SolidColor solidColor = new SolidColor(textFieldColors2.cursorColor(z8, composer4, (i30 & 14) | ((i27 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).getValue().m3667unboximpl(), null);
                                    final boolean z16 = z5;
                                    final Function2<? super Composer, ? super Integer, Unit> function220 = function27;
                                    final VisualTransformation visualTransformation4 = visualTransformation2;
                                    final PaddingValues paddingValues4 = paddingValues2;
                                    final Shape shape4 = shape2;
                                    final Function2<? super Composer, ? super Integer, Unit> function221 = function211;
                                    Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> function3 = new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt.CompatTextField.2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function222, Composer composer5, Integer num) {
                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function222, composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer5, int i37) {
                                            int i38;
                                            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                            if ((i37 & 6) == 0) {
                                                i38 = i37 | (composer5.changedInstance(innerTextField) ? 4 : 2);
                                            } else {
                                                i38 = i37;
                                            }
                                            if ((i38 & 19) != 18 || !composer5.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-400985814, i38, -1, "com.stripe.android.uicore.elements.compat.CompatTextField.<anonymous> (CompatTextField.kt:190)");
                                                }
                                                CompatTextFieldKt.InsetDecorationBox(value, innerTextField, z16, function221, function28, function210, function220, z8, visualTransformation4, z9, mutableInteractionSource4, shape4, textFieldColors2, paddingValues4, composer5, (i38 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 0, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    };
                                    Function2<? super Composer, ? super Integer, Unit> function222 = function28;
                                    Function2<? super Composer, ? super Integer, Unit> function223 = function210;
                                    boolean z17 = z8;
                                    TextFieldColors textFieldColors4 = textFieldColors2;
                                    boolean z18 = z9;
                                    int i37 = i36 << 9;
                                    MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                                    boolean z19 = z7;
                                    KeyboardActions keyboardActions6 = keyboardActions4;
                                    int i38 = i28;
                                    BasicTextFieldKt.BasicTextField(value, onValueChange, modifierErrorSemanticsWithDefault, z16, z19, textStyleMerge, keyboardOptions2, keyboardActions6, z18, i38, i29, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource6, solidColor, ComposableLambdaKt.rememberComposableLambda(-400985814, true, function3, composer4, 54), composer4, (i31 & 64638) | (3670016 & i37) | (29360128 & i37) | (234881024 & i37) | (i37 & 1879048192), ((i36 >> 21) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i36 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i36 >> 15) & 7168), 4096);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    z10 = z19;
                                    z11 = z16;
                                    keyboardActions5 = keyboardActions6;
                                    i32 = i38;
                                    mutableInteractionSource5 = mutableInteractionSource6;
                                    visualTransformation3 = visualTransformation4;
                                    composer3 = composer4;
                                    modifier3 = modifier4;
                                    textStyle4 = textStyle5;
                                    textFieldColors3 = textFieldColors4;
                                    z12 = z17;
                                    function212 = function221;
                                    function213 = function223;
                                    function214 = function220;
                                    shape3 = shape4;
                                    paddingValues3 = paddingValues4;
                                    keyboardOptions3 = keyboardOptions2;
                                    i33 = i29;
                                    z13 = z18;
                                    function215 = function222;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    z12 = z3;
                                    keyboardOptions3 = keyboardOptions;
                                    keyboardActions5 = keyboardActions;
                                    z13 = z4;
                                    i32 = i;
                                    i33 = i2;
                                    mutableInteractionSource5 = mutableInteractionSource;
                                    shape3 = shape;
                                    textFieldColors3 = textFieldColors;
                                    paddingValues3 = paddingValues;
                                    composer3 = composerStartRestartGroup;
                                    z11 = z5;
                                    z10 = z6;
                                    textStyle4 = textStyle2;
                                    function212 = function25;
                                    function215 = function26;
                                    modifier3 = modifier2;
                                    function213 = function23;
                                    function214 = function24;
                                    visualTransformation3 = visualTransformation;
                                }
                                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return CompatTextFieldKt.CompatTextField$lambda$2(value, onValueChange, modifier3, z11, z10, textStyle4, function212, function215, function213, function214, z12, str, visualTransformation3, keyboardOptions3, keyboardActions5, z13, i32, i33, mutableInteractionSource5, shape3, textFieldColors3, paddingValues3, i3, i4, i5, i6, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i22 = i20 | 3072;
                            if ((i4 & 24576) == 0) {
                            }
                            i23 = i6 & 32768;
                            if (i23 != 0) {
                            }
                            if ((i4 & 1572864) == 0) {
                            }
                            i24 = i6 & 131072;
                            if (i24 != 0) {
                            }
                            i25 = i6 & 262144;
                            if (i25 != 0) {
                            }
                            if ((i4 & 805306368) == 0) {
                            }
                            if ((i5 & 6) == 0) {
                            }
                            if ((i5 & 48) == 0) {
                            }
                            i27 = i26;
                            if ((i7 & 306783379) != 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i3 & 1) != 0) {
                                    if (i34 != 0) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if ((i6 & 32) != 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if (i11 != 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    if (i21 == 0) {
                                    }
                                    if ((i6 & 16384) == 0) {
                                    }
                                    if (i23 == 0) {
                                    }
                                    if ((i6 & 65536) == 0) {
                                    }
                                    if (i24 == 0) {
                                    }
                                    Function2<? super Composer, ? super Integer, Unit> function2172 = function216;
                                    if (i25 == 0) {
                                    }
                                    if ((i6 & 524288) == 0) {
                                    }
                                    if ((i6 & 1048576) == 0) {
                                    }
                                    if ((i6 & 2097152) == 0) {
                                    }
                                    z9 = z15;
                                    composer2.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    Composer composer42 = composer2;
                                    composer42.startReplaceGroup(1398628968);
                                    jM5632getColor0d7_KjU = textStyle3.m5632getColor0d7_KjU();
                                    if (jM5632getColor0d7_KjU == 16) {
                                    }
                                    composer42.endReplaceGroup();
                                    TextStyle textStyleMerge2 = textStyle3.merge(new TextStyle(jM5632getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                    Modifier modifier42 = modifier2;
                                    Modifier modifierErrorSemanticsWithDefault2 = errorSemanticsWithDefault(TextFieldDefaults.m2049indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, modifier42, z5, z8, mutableInteractionSource4, textFieldColors2, 0.0f, 0.0f, 48, null), z8, str);
                                    TextStyle textStyle52 = textStyle3;
                                    int i362 = i30;
                                    SolidColor solidColor2 = new SolidColor(textFieldColors2.cursorColor(z8, composer42, (i30 & 14) | ((i27 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).getValue().m3667unboximpl(), null);
                                    final boolean z162 = z5;
                                    final Function2<? super Composer, ? super Integer, Unit> function2202 = function27;
                                    final VisualTransformation visualTransformation42 = visualTransformation2;
                                    final PaddingValues paddingValues42 = paddingValues2;
                                    final Shape shape42 = shape2;
                                    final Function2<? super Composer, ? super Integer, Unit> function2212 = function211;
                                    Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> function32 = new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt.CompatTextField.2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2222, Composer composer5, Integer num) {
                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function2222, composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer5, int i372) {
                                            int i382;
                                            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                            if ((i372 & 6) == 0) {
                                                i382 = i372 | (composer5.changedInstance(innerTextField) ? 4 : 2);
                                            } else {
                                                i382 = i372;
                                            }
                                            if ((i382 & 19) != 18 || !composer5.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-400985814, i382, -1, "com.stripe.android.uicore.elements.compat.CompatTextField.<anonymous> (CompatTextField.kt:190)");
                                                }
                                                CompatTextFieldKt.InsetDecorationBox(value, innerTextField, z162, function2212, function28, function210, function2202, z8, visualTransformation42, z9, mutableInteractionSource4, shape42, textFieldColors2, paddingValues42, composer5, (i382 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 0, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    };
                                    Function2<? super Composer, ? super Integer, Unit> function2222 = function28;
                                    Function2<? super Composer, ? super Integer, Unit> function2232 = function210;
                                    boolean z172 = z8;
                                    TextFieldColors textFieldColors42 = textFieldColors2;
                                    boolean z182 = z9;
                                    int i372 = i362 << 9;
                                    MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource4;
                                    boolean z192 = z7;
                                    KeyboardActions keyboardActions62 = keyboardActions4;
                                    int i382 = i28;
                                    BasicTextFieldKt.BasicTextField(value, onValueChange, modifierErrorSemanticsWithDefault2, z162, z192, textStyleMerge2, keyboardOptions2, keyboardActions62, z182, i382, i29, visualTransformation42, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource62, solidColor2, ComposableLambdaKt.rememberComposableLambda(-400985814, true, function32, composer42, 54), composer42, (i31 & 64638) | (3670016 & i372) | (29360128 & i372) | (234881024 & i372) | (i372 & 1879048192), ((i362 >> 21) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i362 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i362 >> 15) & 7168), 4096);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    z10 = z192;
                                    z11 = z162;
                                    keyboardActions5 = keyboardActions62;
                                    i32 = i382;
                                    mutableInteractionSource5 = mutableInteractionSource62;
                                    visualTransformation3 = visualTransformation42;
                                    composer3 = composer42;
                                    modifier3 = modifier42;
                                    textStyle4 = textStyle52;
                                    textFieldColors3 = textFieldColors42;
                                    z12 = z172;
                                    function212 = function2212;
                                    function213 = function2232;
                                    function214 = function2202;
                                    shape3 = shape42;
                                    paddingValues3 = paddingValues42;
                                    keyboardOptions3 = keyboardOptions2;
                                    i33 = i29;
                                    z13 = z182;
                                    function215 = function2222;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i15 = i14;
                        i16 = i6 & 1024;
                        if (i16 == 0) {
                        }
                        if ((i6 & 2048) == 0) {
                        }
                        int i352 = i18;
                        i19 = i6 & 4096;
                        if (i19 == 0) {
                        }
                        i21 = i6 & 8192;
                        if (i21 != 0) {
                        }
                        if ((i4 & 24576) == 0) {
                        }
                        i23 = i6 & 32768;
                        if (i23 != 0) {
                        }
                        if ((i4 & 1572864) == 0) {
                        }
                        i24 = i6 & 131072;
                        if (i24 != 0) {
                        }
                        i25 = i6 & 262144;
                        if (i25 != 0) {
                        }
                        if ((i4 & 805306368) == 0) {
                        }
                        if ((i5 & 6) == 0) {
                        }
                        if ((i5 & 48) == 0) {
                        }
                        i27 = i26;
                        if ((i7 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i13 = i12;
                    i14 = i6 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    i16 = i6 & 1024;
                    if (i16 == 0) {
                    }
                    if ((i6 & 2048) == 0) {
                    }
                    int i3522 = i18;
                    i19 = i6 & 4096;
                    if (i19 == 0) {
                    }
                    i21 = i6 & 8192;
                    if (i21 != 0) {
                    }
                    if ((i4 & 24576) == 0) {
                    }
                    i23 = i6 & 32768;
                    if (i23 != 0) {
                    }
                    if ((i4 & 1572864) == 0) {
                    }
                    i24 = i6 & 131072;
                    if (i24 != 0) {
                    }
                    i25 = i6 & 262144;
                    if (i25 != 0) {
                    }
                    if ((i4 & 805306368) == 0) {
                    }
                    if ((i5 & 6) == 0) {
                    }
                    if ((i5 & 48) == 0) {
                    }
                    i27 = i26;
                    if ((i7 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z6 = z2;
                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                }
                i10 = i6 & 64;
                if (i10 == 0) {
                }
                i11 = i6 & 128;
                if (i11 == 0) {
                }
                i12 = i6 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i6 & 512;
                if (i14 != 0) {
                }
                i15 = i14;
                i16 = i6 & 1024;
                if (i16 == 0) {
                }
                if ((i6 & 2048) == 0) {
                }
                int i35222 = i18;
                i19 = i6 & 4096;
                if (i19 == 0) {
                }
                i21 = i6 & 8192;
                if (i21 != 0) {
                }
                if ((i4 & 24576) == 0) {
                }
                i23 = i6 & 32768;
                if (i23 != 0) {
                }
                if ((i4 & 1572864) == 0) {
                }
                i24 = i6 & 131072;
                if (i24 != 0) {
                }
                i25 = i6 & 262144;
                if (i25 != 0) {
                }
                if ((i4 & 805306368) == 0) {
                }
                if ((i5 & 6) == 0) {
                }
                if ((i5 & 48) == 0) {
                }
                i27 = i26;
                if ((i7 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z5 = z;
            i9 = i6 & 16;
            if (i9 != 0) {
            }
            z6 = z2;
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
            }
            i10 = i6 & 64;
            if (i10 == 0) {
            }
            i11 = i6 & 128;
            if (i11 == 0) {
            }
            i12 = i6 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i6 & 512;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i6 & 1024;
            if (i16 == 0) {
            }
            if ((i6 & 2048) == 0) {
            }
            int i352222 = i18;
            i19 = i6 & 4096;
            if (i19 == 0) {
            }
            i21 = i6 & 8192;
            if (i21 != 0) {
            }
            if ((i4 & 24576) == 0) {
            }
            i23 = i6 & 32768;
            if (i23 != 0) {
            }
            if ((i4 & 1572864) == 0) {
            }
            i24 = i6 & 131072;
            if (i24 != 0) {
            }
            i25 = i6 & 262144;
            if (i25 != 0) {
            }
            if ((i4 & 805306368) == 0) {
            }
            if ((i5 & 6) == 0) {
            }
            if ((i5 & 48) == 0) {
            }
            i27 = i26;
            if ((i7 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i8 = i6 & 8;
        if (i8 == 0) {
        }
        z5 = z;
        i9 = i6 & 16;
        if (i9 != 0) {
        }
        z6 = z2;
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        i10 = i6 & 64;
        if (i10 == 0) {
        }
        i11 = i6 & 128;
        if (i11 == 0) {
        }
        i12 = i6 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i6 & 512;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i6 & 1024;
        if (i16 == 0) {
        }
        if ((i6 & 2048) == 0) {
        }
        int i3522222 = i18;
        i19 = i6 & 4096;
        if (i19 == 0) {
        }
        i21 = i6 & 8192;
        if (i21 != 0) {
        }
        if ((i4 & 24576) == 0) {
        }
        i23 = i6 & 32768;
        if (i23 != 0) {
        }
        if ((i4 & 1572864) == 0) {
        }
        i24 = i6 & 131072;
        if (i24 != 0) {
        }
        i25 = i6 & 262144;
        if (i25 != 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        if ((i5 & 6) == 0) {
        }
        if ((i5 & 48) == 0) {
        }
        i27 = i26;
        if ((i7 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:350:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CompatTextField(final TextFieldValue value, final Function1<? super TextFieldValue, Unit> onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, final String str, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Composer composer, final int i3, final int i4, final int i5, final int i6) {
        int i7;
        Modifier modifier2;
        int i8;
        boolean z5;
        int i9;
        boolean z6;
        TextStyle textStyle2;
        int i10;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i11;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Function2<? super Composer, ? super Integer, Unit> function27;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        int i28;
        int i29;
        KeyboardActions keyboardActions3;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        Shape textFieldShape;
        int i30;
        Composer composer2;
        TextFieldColors textFieldColorsM2061textFieldColorsdx8h9Zs;
        final TextFieldColors textFieldColors2;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        KeyboardActions keyboardActions4;
        PaddingValues paddingValues2;
        int i31;
        boolean z7;
        Function2<? super Composer, ? super Integer, Unit> function29;
        final boolean z8;
        VisualTransformation visualTransformation2;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final MutableInteractionSource mutableInteractionSource4;
        Shape shape2;
        TextStyle textStyle3;
        final boolean z9;
        PaddingValues paddingValuesM2052textFieldWithoutLabelPaddinga9UjIt4$default;
        Function2<? super Composer, ? super Integer, Unit> function211;
        long jM5632getColor0d7_KjU;
        final boolean z10;
        final boolean z11;
        final KeyboardActions keyboardActions5;
        final int i32;
        final MutableInteractionSource mutableInteractionSource5;
        final VisualTransformation visualTransformation3;
        Composer composer3;
        final Modifier modifier3;
        final TextStyle textStyle4;
        final TextFieldColors textFieldColors3;
        final boolean z12;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final Shape shape3;
        final PaddingValues paddingValues3;
        final KeyboardOptions keyboardOptions3;
        final int i33;
        final boolean z13;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-876476742);
        if ((i6 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i34 = i6 & 4;
        if (i34 != 0) {
            i7 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                modifier2 = modifier;
                i7 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i8 = i6 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    z5 = z;
                    i7 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
                }
                i9 = i6 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                } else {
                    if ((i3 & 24576) == 0) {
                        z6 = z2;
                        i7 |= composerStartRestartGroup.changed(z6) ? 16384 : 8192;
                    }
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        textStyle2 = textStyle;
                        i7 |= ((i6 & 32) == 0 && composerStartRestartGroup.changed(textStyle2)) ? 131072 : 65536;
                    } else {
                        textStyle2 = textStyle;
                    }
                    i10 = i6 & 64;
                    if (i10 == 0) {
                        i7 |= 1572864;
                        function25 = function2;
                    } else {
                        function25 = function2;
                        if ((i3 & 1572864) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function25) ? 1048576 : 524288;
                        }
                    }
                    i11 = i6 & 128;
                    if (i11 == 0) {
                        i7 |= 12582912;
                        function26 = function22;
                    } else {
                        function26 = function22;
                        if ((i3 & 12582912) == 0) {
                            i7 |= composerStartRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
                        }
                    }
                    i12 = i6 & 256;
                    if (i12 == 0) {
                        i7 |= 100663296;
                    } else {
                        if ((i3 & 100663296) == 0) {
                            i13 = i12;
                            i7 |= composerStartRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i14 = i6 & 512;
                        if (i14 != 0) {
                            i7 |= 805306368;
                        } else {
                            if ((i3 & 805306368) == 0) {
                                i15 = i14;
                                i7 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                            }
                            i16 = i6 & 1024;
                            if (i16 == 0) {
                                i18 = i4 | 6;
                                i17 = i16;
                            } else if ((i4 & 6) == 0) {
                                i17 = i16;
                                i18 = i4 | (composerStartRestartGroup.changed(z3) ? 4 : 2);
                            } else {
                                i17 = i16;
                                i18 = i4;
                            }
                            if ((i6 & 2048) == 0) {
                                i18 |= 48;
                            } else if ((i4 & 48) == 0) {
                                i18 |= composerStartRestartGroup.changed(str) ? 32 : 16;
                            }
                            int i35 = i18;
                            i19 = i6 & 4096;
                            if (i19 == 0) {
                                i20 = i35 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                            } else if ((i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                i20 = i35 | (composerStartRestartGroup.changed(visualTransformation) ? 256 : 128);
                            } else {
                                i20 = i35;
                            }
                            i21 = i6 & 8192;
                            if (i21 != 0) {
                                i22 = i20;
                                if ((i4 & 3072) == 0) {
                                    i22 |= composerStartRestartGroup.changed(keyboardOptions) ? 2048 : 1024;
                                }
                                if ((i4 & 24576) == 0) {
                                    i22 |= ((i6 & 16384) == 0 && composerStartRestartGroup.changed(keyboardActions)) ? 16384 : 8192;
                                }
                                i23 = i6 & 32768;
                                if (i23 != 0) {
                                    i22 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i22 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
                                }
                                if ((i4 & 1572864) == 0) {
                                    i22 |= ((i6 & 65536) == 0 && composerStartRestartGroup.changed(i)) ? 1048576 : 524288;
                                }
                                i24 = i6 & 131072;
                                if (i24 != 0) {
                                    i22 |= 12582912;
                                } else if ((i4 & 12582912) == 0) {
                                    i22 |= composerStartRestartGroup.changed(i2) ? 8388608 : 4194304;
                                }
                                i25 = i6 & 262144;
                                if (i25 != 0) {
                                    i22 |= 100663296;
                                } else if ((i4 & 100663296) == 0) {
                                    i22 |= composerStartRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                }
                                if ((i4 & 805306368) == 0) {
                                    i22 |= ((i6 & 524288) == 0 && composerStartRestartGroup.changed(shape)) ? 536870912 : 268435456;
                                }
                                if ((i5 & 6) == 0) {
                                    i26 = i5 | (((i6 & 1048576) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 4 : 2);
                                } else {
                                    i26 = i5;
                                }
                                if ((i5 & 48) == 0) {
                                    i26 |= ((i6 & 2097152) == 0 && composerStartRestartGroup.changed(paddingValues)) ? 32 : 16;
                                }
                                i27 = i26;
                                if ((i7 & 306783379) != 306783378 || (i22 & 306783379) != 306783378 || (i27 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        if (i34 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i8 != 0) {
                                            z5 = true;
                                        }
                                        if (i9 != 0) {
                                            z6 = false;
                                        }
                                        if ((i6 & 32) != 0) {
                                            ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume = composerStartRestartGroup.consume(localTextStyle);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            i7 &= -458753;
                                            textStyle2 = (TextStyle) objConsume;
                                        }
                                        if (i10 != 0) {
                                            function25 = null;
                                        }
                                        if (i11 != 0) {
                                            function26 = null;
                                        }
                                        Function2<? super Composer, ? super Integer, Unit> function216 = i13 == 0 ? null : function23;
                                        function27 = i15 == 0 ? null : function24;
                                        boolean z14 = i17 == 0 ? false : z3;
                                        VisualTransformation none = i19 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                        keyboardOptions2 = i21 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                        if ((i6 & 16384) == 0) {
                                            keyboardActions2 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                            i22 &= -57345;
                                        } else {
                                            keyboardActions2 = keyboardActions;
                                        }
                                        boolean z15 = i23 == 0 ? false : z4;
                                        if ((i6 & 65536) == 0) {
                                            i22 &= -3670017;
                                            i28 = z15 ? 1 : Integer.MAX_VALUE;
                                        } else {
                                            i28 = i;
                                        }
                                        i29 = i24 == 0 ? 1 : i2;
                                        Function2<? super Composer, ? super Integer, Unit> function217 = function216;
                                        if (i25 == 0) {
                                            composerStartRestartGroup.startReplaceGroup(1398838933);
                                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            keyboardActions3 = keyboardActions2;
                                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                            }
                                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                            composerStartRestartGroup.endReplaceGroup();
                                        } else {
                                            keyboardActions3 = keyboardActions2;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                        }
                                        if ((i6 & 524288) == 0) {
                                            mutableInteractionSource3 = mutableInteractionSource2;
                                            textFieldShape = TextFieldDefaults.INSTANCE.getTextFieldShape(composerStartRestartGroup, 6);
                                            i30 = i22 & (-1879048193);
                                        } else {
                                            mutableInteractionSource3 = mutableInteractionSource2;
                                            textFieldShape = shape;
                                            i30 = i22;
                                        }
                                        if ((i6 & 1048576) == 0) {
                                            textFieldColorsM2061textFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m2061textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 48, 2097151);
                                            composer2 = composerStartRestartGroup;
                                            i27 &= -15;
                                        } else {
                                            composer2 = composerStartRestartGroup;
                                            textFieldColorsM2061textFieldColorsdx8h9Zs = textFieldColors;
                                        }
                                        if ((i6 & 2097152) == 0) {
                                            if (function25 != null) {
                                                paddingValuesM2052textFieldWithoutLabelPaddinga9UjIt4$default = TextFieldDefaults.m2051textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                            } else {
                                                paddingValuesM2052textFieldWithoutLabelPaddinga9UjIt4$default = TextFieldDefaults.m2052textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                            }
                                            i27 &= -113;
                                            Function2<? super Composer, ? super Integer, Unit> function218 = function26;
                                            textFieldColors2 = textFieldColorsM2061textFieldColorsdx8h9Zs;
                                            function28 = function218;
                                            keyboardActions4 = keyboardActions3;
                                            i31 = i7;
                                            function29 = function25;
                                            paddingValues2 = paddingValuesM2052textFieldWithoutLabelPaddinga9UjIt4$default;
                                            function210 = function217;
                                            mutableInteractionSource4 = mutableInteractionSource3;
                                            shape2 = textFieldShape;
                                            z7 = z6;
                                            textStyle3 = textStyle2;
                                            z8 = z14;
                                            visualTransformation2 = none;
                                        } else {
                                            Function2<? super Composer, ? super Integer, Unit> function219 = function26;
                                            textFieldColors2 = textFieldColorsM2061textFieldColorsdx8h9Zs;
                                            function28 = function219;
                                            keyboardActions4 = keyboardActions3;
                                            paddingValues2 = paddingValues;
                                            i31 = i7;
                                            z7 = z6;
                                            function29 = function25;
                                            z8 = z14;
                                            visualTransformation2 = none;
                                            function210 = function217;
                                            mutableInteractionSource4 = mutableInteractionSource3;
                                            shape2 = textFieldShape;
                                            textStyle3 = textStyle2;
                                        }
                                        z9 = z15;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i6 & 32) != 0) {
                                            i7 &= -458753;
                                        }
                                        if ((i6 & 16384) != 0) {
                                            i22 &= -57345;
                                        }
                                        if ((i6 & 65536) != 0) {
                                            i22 &= -3670017;
                                        }
                                        if ((i6 & 524288) != 0) {
                                            i22 &= -1879048193;
                                        }
                                        if ((i6 & 1048576) != 0) {
                                            i27 &= -15;
                                        }
                                        if ((2097152 & i6) != 0) {
                                            i27 &= -113;
                                        }
                                        function27 = function24;
                                        visualTransformation2 = visualTransformation;
                                        keyboardOptions2 = keyboardOptions;
                                        keyboardActions4 = keyboardActions;
                                        i28 = i;
                                        i29 = i2;
                                        shape2 = shape;
                                        paddingValues2 = paddingValues;
                                        composer2 = composerStartRestartGroup;
                                        i31 = i7;
                                        z7 = z6;
                                        textStyle3 = textStyle2;
                                        function29 = function25;
                                        function28 = function26;
                                        i30 = i22;
                                        function210 = function23;
                                        z8 = z3;
                                        z9 = z4;
                                        mutableInteractionSource4 = mutableInteractionSource;
                                        textFieldColors2 = textFieldColors;
                                    }
                                    composer2.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        function211 = function29;
                                    } else {
                                        function211 = function29;
                                        ComposerKt.traceEventStart(-876476742, i31, i30, "com.stripe.android.uicore.elements.compat.CompatTextField (CompatTextField.kt:294)");
                                    }
                                    Composer composer4 = composer2;
                                    composer4.startReplaceGroup(1398854056);
                                    jM5632getColor0d7_KjU = textStyle3.m5632getColor0d7_KjU();
                                    if (jM5632getColor0d7_KjU == 16) {
                                        jM5632getColor0d7_KjU = textFieldColors2.textColor(z5, composer4, ((i31 >> 9) & 14) | ((i27 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).getValue().m3667unboximpl();
                                    }
                                    composer4.endReplaceGroup();
                                    TextStyle textStyleMerge = textStyle3.merge(new TextStyle(jM5632getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                    Modifier modifier4 = modifier2;
                                    Modifier modifierErrorSemanticsWithDefault = errorSemanticsWithDefault(TextFieldDefaults.m2049indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, modifier4, z5, z8, mutableInteractionSource4, textFieldColors2, 0.0f, 0.0f, 48, null), z8, str);
                                    TextStyle textStyle5 = textStyle3;
                                    int i36 = i30;
                                    SolidColor solidColor = new SolidColor(textFieldColors2.cursorColor(z8, composer4, (i30 & 14) | ((i27 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).getValue().m3667unboximpl(), null);
                                    final boolean z16 = z5;
                                    final Function2<? super Composer, ? super Integer, Unit> function220 = function27;
                                    final VisualTransformation visualTransformation4 = visualTransformation2;
                                    final PaddingValues paddingValues4 = paddingValues2;
                                    final Shape shape4 = shape2;
                                    final Function2<? super Composer, ? super Integer, Unit> function221 = function211;
                                    Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> function3 = new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt.CompatTextField.5
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function222, Composer composer5, Integer num) {
                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function222, composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer5, int i37) {
                                            int i38;
                                            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                            if ((i37 & 6) == 0) {
                                                i38 = i37 | (composer5.changedInstance(innerTextField) ? 4 : 2);
                                            } else {
                                                i38 = i37;
                                            }
                                            if ((i38 & 19) != 18 || !composer5.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1602042103, i38, -1, "com.stripe.android.uicore.elements.compat.CompatTextField.<anonymous> (CompatTextField.kt:320)");
                                                }
                                                CompatTextFieldKt.InsetDecorationBox(value.getText(), innerTextField, z16, function221, function28, function210, function220, z8, visualTransformation4, z9, mutableInteractionSource4, shape4, textFieldColors2, paddingValues4, composer5, (i38 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 0, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    };
                                    Function2<? super Composer, ? super Integer, Unit> function222 = function28;
                                    Function2<? super Composer, ? super Integer, Unit> function223 = function210;
                                    boolean z17 = z8;
                                    TextFieldColors textFieldColors4 = textFieldColors2;
                                    boolean z18 = z9;
                                    int i37 = i36 << 9;
                                    MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                                    boolean z19 = z7;
                                    KeyboardActions keyboardActions6 = keyboardActions4;
                                    int i38 = i28;
                                    BasicTextFieldKt.BasicTextField(value, onValueChange, modifierErrorSemanticsWithDefault, z16, z19, textStyleMerge, keyboardOptions2, keyboardActions6, z18, i38, i29, visualTransformation4, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource6, solidColor, ComposableLambdaKt.rememberComposableLambda(1602042103, true, function3, composer4, 54), composer4, (i31 & 64638) | (3670016 & i37) | (29360128 & i37) | (234881024 & i37) | (i37 & 1879048192), ((i36 >> 21) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i36 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i36 >> 15) & 7168), 4096);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    z10 = z19;
                                    z11 = z16;
                                    keyboardActions5 = keyboardActions6;
                                    i32 = i38;
                                    mutableInteractionSource5 = mutableInteractionSource6;
                                    visualTransformation3 = visualTransformation4;
                                    composer3 = composer4;
                                    modifier3 = modifier4;
                                    textStyle4 = textStyle5;
                                    textFieldColors3 = textFieldColors4;
                                    z12 = z17;
                                    function212 = function221;
                                    function213 = function223;
                                    function214 = function220;
                                    shape3 = shape4;
                                    paddingValues3 = paddingValues4;
                                    keyboardOptions3 = keyboardOptions2;
                                    i33 = i29;
                                    z13 = z18;
                                    function215 = function222;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    z12 = z3;
                                    keyboardOptions3 = keyboardOptions;
                                    keyboardActions5 = keyboardActions;
                                    z13 = z4;
                                    i32 = i;
                                    i33 = i2;
                                    mutableInteractionSource5 = mutableInteractionSource;
                                    shape3 = shape;
                                    textFieldColors3 = textFieldColors;
                                    paddingValues3 = paddingValues;
                                    composer3 = composerStartRestartGroup;
                                    z11 = z5;
                                    z10 = z6;
                                    textStyle4 = textStyle2;
                                    function212 = function25;
                                    function215 = function26;
                                    modifier3 = modifier2;
                                    function213 = function23;
                                    function214 = function24;
                                    visualTransformation3 = visualTransformation;
                                }
                                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return CompatTextFieldKt.CompatTextField$lambda$5(value, onValueChange, modifier3, z11, z10, textStyle4, function212, function215, function213, function214, z12, str, visualTransformation3, keyboardOptions3, keyboardActions5, z13, i32, i33, mutableInteractionSource5, shape3, textFieldColors3, paddingValues3, i3, i4, i5, i6, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i22 = i20 | 3072;
                            if ((i4 & 24576) == 0) {
                            }
                            i23 = i6 & 32768;
                            if (i23 != 0) {
                            }
                            if ((i4 & 1572864) == 0) {
                            }
                            i24 = i6 & 131072;
                            if (i24 != 0) {
                            }
                            i25 = i6 & 262144;
                            if (i25 != 0) {
                            }
                            if ((i4 & 805306368) == 0) {
                            }
                            if ((i5 & 6) == 0) {
                            }
                            if ((i5 & 48) == 0) {
                            }
                            i27 = i26;
                            if ((i7 & 306783379) != 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i3 & 1) != 0) {
                                    if (i34 != 0) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if ((i6 & 32) != 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if (i11 != 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    if (i21 == 0) {
                                    }
                                    if ((i6 & 16384) == 0) {
                                    }
                                    if (i23 == 0) {
                                    }
                                    if ((i6 & 65536) == 0) {
                                    }
                                    if (i24 == 0) {
                                    }
                                    Function2<? super Composer, ? super Integer, Unit> function2172 = function216;
                                    if (i25 == 0) {
                                    }
                                    if ((i6 & 524288) == 0) {
                                    }
                                    if ((i6 & 1048576) == 0) {
                                    }
                                    if ((i6 & 2097152) == 0) {
                                    }
                                    z9 = z15;
                                    composer2.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    Composer composer42 = composer2;
                                    composer42.startReplaceGroup(1398854056);
                                    jM5632getColor0d7_KjU = textStyle3.m5632getColor0d7_KjU();
                                    if (jM5632getColor0d7_KjU == 16) {
                                    }
                                    composer42.endReplaceGroup();
                                    TextStyle textStyleMerge2 = textStyle3.merge(new TextStyle(jM5632getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                    Modifier modifier42 = modifier2;
                                    Modifier modifierErrorSemanticsWithDefault2 = errorSemanticsWithDefault(TextFieldDefaults.m2049indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, modifier42, z5, z8, mutableInteractionSource4, textFieldColors2, 0.0f, 0.0f, 48, null), z8, str);
                                    TextStyle textStyle52 = textStyle3;
                                    int i362 = i30;
                                    SolidColor solidColor2 = new SolidColor(textFieldColors2.cursorColor(z8, composer42, (i30 & 14) | ((i27 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).getValue().m3667unboximpl(), null);
                                    final boolean z162 = z5;
                                    final Function2<? super Composer, ? super Integer, Unit> function2202 = function27;
                                    final VisualTransformation visualTransformation42 = visualTransformation2;
                                    final PaddingValues paddingValues42 = paddingValues2;
                                    final Shape shape42 = shape2;
                                    final Function2<? super Composer, ? super Integer, Unit> function2212 = function211;
                                    Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> function32 = new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt.CompatTextField.5
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2222, Composer composer5, Integer num) {
                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function2222, composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer5, int i372) {
                                            int i382;
                                            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                            if ((i372 & 6) == 0) {
                                                i382 = i372 | (composer5.changedInstance(innerTextField) ? 4 : 2);
                                            } else {
                                                i382 = i372;
                                            }
                                            if ((i382 & 19) != 18 || !composer5.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1602042103, i382, -1, "com.stripe.android.uicore.elements.compat.CompatTextField.<anonymous> (CompatTextField.kt:320)");
                                                }
                                                CompatTextFieldKt.InsetDecorationBox(value.getText(), innerTextField, z162, function2212, function28, function210, function2202, z8, visualTransformation42, z9, mutableInteractionSource4, shape42, textFieldColors2, paddingValues42, composer5, (i382 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 0, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    };
                                    Function2<? super Composer, ? super Integer, Unit> function2222 = function28;
                                    Function2<? super Composer, ? super Integer, Unit> function2232 = function210;
                                    boolean z172 = z8;
                                    TextFieldColors textFieldColors42 = textFieldColors2;
                                    boolean z182 = z9;
                                    int i372 = i362 << 9;
                                    MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource4;
                                    boolean z192 = z7;
                                    KeyboardActions keyboardActions62 = keyboardActions4;
                                    int i382 = i28;
                                    BasicTextFieldKt.BasicTextField(value, onValueChange, modifierErrorSemanticsWithDefault2, z162, z192, textStyleMerge2, keyboardOptions2, keyboardActions62, z182, i382, i29, visualTransformation42, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource62, solidColor2, ComposableLambdaKt.rememberComposableLambda(1602042103, true, function32, composer42, 54), composer42, (i31 & 64638) | (3670016 & i372) | (29360128 & i372) | (234881024 & i372) | (i372 & 1879048192), ((i362 >> 21) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i362 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i362 >> 15) & 7168), 4096);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    z10 = z192;
                                    z11 = z162;
                                    keyboardActions5 = keyboardActions62;
                                    i32 = i382;
                                    mutableInteractionSource5 = mutableInteractionSource62;
                                    visualTransformation3 = visualTransformation42;
                                    composer3 = composer42;
                                    modifier3 = modifier42;
                                    textStyle4 = textStyle52;
                                    textFieldColors3 = textFieldColors42;
                                    z12 = z172;
                                    function212 = function2212;
                                    function213 = function2232;
                                    function214 = function2202;
                                    shape3 = shape42;
                                    paddingValues3 = paddingValues42;
                                    keyboardOptions3 = keyboardOptions2;
                                    i33 = i29;
                                    z13 = z182;
                                    function215 = function2222;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i15 = i14;
                        i16 = i6 & 1024;
                        if (i16 == 0) {
                        }
                        if ((i6 & 2048) == 0) {
                        }
                        int i352 = i18;
                        i19 = i6 & 4096;
                        if (i19 == 0) {
                        }
                        i21 = i6 & 8192;
                        if (i21 != 0) {
                        }
                        if ((i4 & 24576) == 0) {
                        }
                        i23 = i6 & 32768;
                        if (i23 != 0) {
                        }
                        if ((i4 & 1572864) == 0) {
                        }
                        i24 = i6 & 131072;
                        if (i24 != 0) {
                        }
                        i25 = i6 & 262144;
                        if (i25 != 0) {
                        }
                        if ((i4 & 805306368) == 0) {
                        }
                        if ((i5 & 6) == 0) {
                        }
                        if ((i5 & 48) == 0) {
                        }
                        i27 = i26;
                        if ((i7 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i13 = i12;
                    i14 = i6 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    i16 = i6 & 1024;
                    if (i16 == 0) {
                    }
                    if ((i6 & 2048) == 0) {
                    }
                    int i3522 = i18;
                    i19 = i6 & 4096;
                    if (i19 == 0) {
                    }
                    i21 = i6 & 8192;
                    if (i21 != 0) {
                    }
                    if ((i4 & 24576) == 0) {
                    }
                    i23 = i6 & 32768;
                    if (i23 != 0) {
                    }
                    if ((i4 & 1572864) == 0) {
                    }
                    i24 = i6 & 131072;
                    if (i24 != 0) {
                    }
                    i25 = i6 & 262144;
                    if (i25 != 0) {
                    }
                    if ((i4 & 805306368) == 0) {
                    }
                    if ((i5 & 6) == 0) {
                    }
                    if ((i5 & 48) == 0) {
                    }
                    i27 = i26;
                    if ((i7 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z6 = z2;
                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                }
                i10 = i6 & 64;
                if (i10 == 0) {
                }
                i11 = i6 & 128;
                if (i11 == 0) {
                }
                i12 = i6 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i6 & 512;
                if (i14 != 0) {
                }
                i15 = i14;
                i16 = i6 & 1024;
                if (i16 == 0) {
                }
                if ((i6 & 2048) == 0) {
                }
                int i35222 = i18;
                i19 = i6 & 4096;
                if (i19 == 0) {
                }
                i21 = i6 & 8192;
                if (i21 != 0) {
                }
                if ((i4 & 24576) == 0) {
                }
                i23 = i6 & 32768;
                if (i23 != 0) {
                }
                if ((i4 & 1572864) == 0) {
                }
                i24 = i6 & 131072;
                if (i24 != 0) {
                }
                i25 = i6 & 262144;
                if (i25 != 0) {
                }
                if ((i4 & 805306368) == 0) {
                }
                if ((i5 & 6) == 0) {
                }
                if ((i5 & 48) == 0) {
                }
                i27 = i26;
                if ((i7 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z5 = z;
            i9 = i6 & 16;
            if (i9 != 0) {
            }
            z6 = z2;
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
            }
            i10 = i6 & 64;
            if (i10 == 0) {
            }
            i11 = i6 & 128;
            if (i11 == 0) {
            }
            i12 = i6 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i6 & 512;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i6 & 1024;
            if (i16 == 0) {
            }
            if ((i6 & 2048) == 0) {
            }
            int i352222 = i18;
            i19 = i6 & 4096;
            if (i19 == 0) {
            }
            i21 = i6 & 8192;
            if (i21 != 0) {
            }
            if ((i4 & 24576) == 0) {
            }
            i23 = i6 & 32768;
            if (i23 != 0) {
            }
            if ((i4 & 1572864) == 0) {
            }
            i24 = i6 & 131072;
            if (i24 != 0) {
            }
            i25 = i6 & 262144;
            if (i25 != 0) {
            }
            if ((i4 & 805306368) == 0) {
            }
            if ((i5 & 6) == 0) {
            }
            if ((i5 & 48) == 0) {
            }
            i27 = i26;
            if ((i7 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i8 = i6 & 8;
        if (i8 == 0) {
        }
        z5 = z;
        i9 = i6 & 16;
        if (i9 != 0) {
        }
        z6 = z2;
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        i10 = i6 & 64;
        if (i10 == 0) {
        }
        i11 = i6 & 128;
        if (i11 == 0) {
        }
        i12 = i6 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i6 & 512;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i6 & 1024;
        if (i16 == 0) {
        }
        if ((i6 & 2048) == 0) {
        }
        int i3522222 = i18;
        i19 = i6 & 4096;
        if (i19 == 0) {
        }
        i21 = i6 & 8192;
        if (i21 != 0) {
        }
        if ((i4 & 24576) == 0) {
        }
        i23 = i6 & 32768;
        if (i23 != 0) {
        }
        if ((i4 & 1572864) == 0) {
        }
        i24 = i6 & 131072;
        if (i24 != 0) {
        }
        i25 = i6 & 262144;
        if (i25 != 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        if ((i5 & 6) == 0) {
        }
        if ((i5 & 48) == 0) {
        }
        i27 = i26;
        if ((i7 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:252:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InsetDecorationBox(final String str, final Function2<? super Composer, ? super Integer, Unit> function2, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, boolean z2, VisualTransformation visualTransformation, boolean z3, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        boolean z4;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function29;
        int i9;
        boolean z5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        MutableInteractionSource mutableInteractionSource2;
        Shape textFieldShape;
        TextFieldColors textFieldColorsM2061textFieldColorsdx8h9Zs;
        Function2<? super Composer, ? super Integer, Unit> function210;
        TextFieldColors textFieldColors2;
        PaddingValues paddingValuesM2052textFieldWithoutLabelPaddinga9UjIt4$default;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Function2<? super Composer, ? super Integer, Unit> function212;
        VisualTransformation visualTransformation2;
        Function2<? super Composer, ? super Integer, Unit> function213;
        boolean z6;
        Shape shape2;
        int i18;
        float fM6117constructorimpl;
        float fM6117constructorimpl2;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final PaddingValues paddingValues2;
        final MutableInteractionSource mutableInteractionSource3;
        final VisualTransformation visualTransformation3;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        final Function2<? super Composer, ? super Integer, Unit> function216;
        final Function2<? super Composer, ? super Integer, Unit> function217;
        final boolean z7;
        final boolean z8;
        final boolean z9;
        final Shape shape3;
        final TextFieldColors textFieldColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1433396717);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i19 = i3 & 4;
        if (i19 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                z4 = z;
                i4 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
            }
            i5 = i3 & 8;
            int i20 = 1024;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function26 = function22;
                    i4 |= composerStartRestartGroup.changedInstance(function26) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        function27 = function23;
                        i4 |= composerStartRestartGroup.changedInstance(function27) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function28 = function24;
                    } else {
                        function28 = function24;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function28) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        function29 = function25;
                    } else {
                        function29 = function25;
                        if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function29) ? 1048576 : 524288;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                        z5 = z2;
                    } else {
                        z5 = z2;
                        if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changed(z5) ? 8388608 : 4194304;
                        }
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                        i4 |= 100663296;
                    } else {
                        if ((i & 100663296) == 0) {
                            i11 = i10;
                            i4 |= composerStartRestartGroup.changed(visualTransformation) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i12 = i3 & 512;
                        if (i12 == 0) {
                            if ((i & 805306368) == 0) {
                                i13 = i12;
                                i4 |= composerStartRestartGroup.changed(z3) ? 536870912 : 268435456;
                            }
                            i14 = i3 & 1024;
                            if (i14 == 0) {
                                i16 = i2 | 6;
                                i15 = i14;
                            } else if ((i2 & 6) == 0) {
                                i15 = i14;
                                i16 = i2 | (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                            } else {
                                i15 = i14;
                                i16 = i2;
                            }
                            if ((i2 & 48) == 0) {
                                i16 |= ((i3 & 2048) == 0 && composerStartRestartGroup.changed(shape)) ? 32 : 16;
                            }
                            if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                i16 |= ((i3 & 4096) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 256 : 128;
                            }
                            if ((i2 & 3072) == 0) {
                                if ((i3 & 8192) == 0 && composerStartRestartGroup.changed(paddingValues)) {
                                    i20 = 2048;
                                }
                                i16 |= i20;
                            }
                            i17 = i16;
                            if ((i4 & 306783379) == 306783378 || (i17 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i19 != 0) {
                                        z4 = true;
                                    }
                                    if (i5 != 0) {
                                        function26 = null;
                                    }
                                    if (i6 != 0) {
                                        function27 = null;
                                    }
                                    if (i7 != 0) {
                                        function28 = null;
                                    }
                                    Function2<? super Composer, ? super Integer, Unit> function218 = i8 == 0 ? function29 : null;
                                    if (i9 != 0) {
                                        z5 = false;
                                    }
                                    VisualTransformation none = i11 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                    boolean z10 = i13 == 0 ? false : z3;
                                    if (i15 == 0) {
                                        composerStartRestartGroup.startReplaceGroup(259034146);
                                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else {
                                        mutableInteractionSource2 = mutableInteractionSource;
                                    }
                                    if ((i3 & 2048) == 0) {
                                        textFieldShape = TextFieldDefaults.INSTANCE.getTextFieldShape(composerStartRestartGroup, 6);
                                        i17 &= -113;
                                    } else {
                                        textFieldShape = shape;
                                    }
                                    Function2<? super Composer, ? super Integer, Unit> function219 = function218;
                                    if ((i3 & 4096) == 0) {
                                        textFieldColorsM2061textFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m2061textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 48, 2097151);
                                        i17 &= -897;
                                    } else {
                                        textFieldColorsM2061textFieldColorsdx8h9Zs = textFieldColors;
                                    }
                                    TextFieldColors textFieldColors4 = textFieldColorsM2061textFieldColorsdx8h9Zs;
                                    if ((i3 & 8192) == 0) {
                                        if (function26 != null) {
                                            paddingValuesM2052textFieldWithoutLabelPaddinga9UjIt4$default = TextFieldDefaults.m2051textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        } else {
                                            paddingValuesM2052textFieldWithoutLabelPaddinga9UjIt4$default = TextFieldDefaults.m2052textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        }
                                        i17 &= -7169;
                                        function210 = function219;
                                        textFieldColors2 = textFieldColors4;
                                    } else {
                                        function210 = function219;
                                        textFieldColors2 = textFieldColors4;
                                        paddingValuesM2052textFieldWithoutLabelPaddinga9UjIt4$default = paddingValues;
                                    }
                                    function211 = function26;
                                    function212 = function27;
                                    visualTransformation2 = none;
                                    function213 = function28;
                                    z6 = z10;
                                    shape2 = textFieldShape;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 2048) != 0) {
                                        i17 &= -113;
                                    }
                                    if ((i3 & 4096) != 0) {
                                        i17 &= -897;
                                    }
                                    if ((i3 & 8192) != 0) {
                                        i17 &= -7169;
                                    }
                                    visualTransformation2 = visualTransformation;
                                    z6 = z3;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    shape2 = shape;
                                    textFieldColors2 = textFieldColors;
                                    paddingValuesM2052textFieldWithoutLabelPaddinga9UjIt4$default = paddingValues;
                                    function211 = function26;
                                    function212 = function27;
                                    function213 = function28;
                                    function210 = function29;
                                }
                                boolean z11 = z5;
                                boolean z12 = z4;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1433396717, i4, i17, "com.stripe.android.uicore.elements.compat.InsetDecorationBox (CompatTextField.kt:361)");
                                }
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object objConsume = composerStartRestartGroup.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                LayoutDirection layoutDirection = (LayoutDirection) objConsume;
                                float fCalculateStartPadding = PaddingKt.calculateStartPadding(paddingValuesM2052textFieldWithoutLabelPaddinga9UjIt4$default, layoutDirection);
                                float fCalculateEndPadding = PaddingKt.calculateEndPadding(paddingValuesM2052textFieldWithoutLabelPaddinga9UjIt4$default, layoutDirection);
                                Modifier.Companion companion = Modifier.INSTANCE;
                                if (function213 == null) {
                                    i18 = 0;
                                    fM6117constructorimpl = Dp.m6117constructorimpl(RangesKt.coerceAtLeast(Dp.m6117constructorimpl(fCalculateStartPadding - CompatConstantsKt.getHorizontalIconPadding()), Dp.m6117constructorimpl(0)));
                                } else {
                                    i18 = 0;
                                    fM6117constructorimpl = Dp.m6117constructorimpl(0);
                                }
                                if (function210 == null) {
                                    fM6117constructorimpl2 = Dp.m6117constructorimpl(RangesKt.coerceAtLeast(Dp.m6117constructorimpl(fCalculateEndPadding - CompatConstantsKt.getHorizontalIconPadding()), Dp.m6117constructorimpl(i18)));
                                } else {
                                    fM6117constructorimpl2 = Dp.m6117constructorimpl(i18);
                                }
                                Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(companion, fM6117constructorimpl, 0.0f, fM6117constructorimpl2, 0.0f, 10, null);
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1024paddingqDBjuR0$default);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                int i21 = i17;
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                float top = paddingValuesM2052textFieldWithoutLabelPaddinga9UjIt4$default.getTop();
                                float bottom = paddingValuesM2052textFieldWithoutLabelPaddinga9UjIt4$default.getBottom();
                                if (function213 != null) {
                                    fCalculateStartPadding = CompatConstantsKt.getTextFieldPadding();
                                }
                                if (function210 != null) {
                                    fCalculateEndPadding = CompatConstantsKt.getTextFieldPadding();
                                }
                                int i22 = i21 << 3;
                                composer2 = composerStartRestartGroup;
                                CommonDecorationBox(str, ComposableLambdaKt.rememberComposableLambda(-1139891101, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt$InsetDecorationBox$4$3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i23) {
                                        if ((i23 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1139891101, i23, -1, "com.stripe.android.uicore.elements.compat.InsetDecorationBox.<anonymous>.<anonymous> (CompatTextField.kt:382)");
                                            }
                                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                            Function2<Composer, Integer, Unit> function220 = function2;
                                            ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                            if (!(composer3.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor2);
                                            } else {
                                                composer3.useNode();
                                            }
                                            Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer3);
                                            Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                            function220.invoke(composer3, 0);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            composer3.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composerStartRestartGroup, 54), visualTransformation2, function211, function212, function213, function210, z6, z12, z11, mutableInteractionSource2, PaddingKt.m1016PaddingValuesa9UjIt4(fCalculateStartPadding, top, fCalculateEndPadding, bottom), shape2, textFieldColors2, composer2, (i4 & 14) | 48 | ((i4 >> 18) & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | ((i4 >> 6) & 29360128) | ((i4 << 18) & 234881024) | (1879048192 & (i4 << 6)), (i21 & 14) | (i22 & 896) | (i22 & 7168));
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                paddingValues2 = paddingValuesM2052textFieldWithoutLabelPaddinga9UjIt4$default;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                visualTransformation3 = visualTransformation2;
                                function214 = function211;
                                function215 = function212;
                                function216 = function213;
                                function217 = function210;
                                z7 = z6;
                                z8 = z12;
                                z9 = z11;
                                shape3 = shape2;
                                textFieldColors3 = textFieldColors2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                visualTransformation3 = visualTransformation;
                                shape3 = shape;
                                composer2 = composerStartRestartGroup;
                                function214 = function26;
                                function215 = function27;
                                function216 = function28;
                                function217 = function29;
                                z9 = z5;
                                z8 = z4;
                                z7 = z3;
                                mutableInteractionSource3 = mutableInteractionSource;
                                textFieldColors3 = textFieldColors;
                                paddingValues2 = paddingValues;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return CompatTextFieldKt.InsetDecorationBox$lambda$12(str, function2, z8, function214, function215, function216, function217, z9, visualTransformation3, z7, mutableInteractionSource3, shape3, textFieldColors3, paddingValues2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 805306368;
                        i13 = i12;
                        i14 = i3 & 1024;
                        if (i14 == 0) {
                        }
                        if ((i2 & 48) == 0) {
                        }
                        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                        }
                        if ((i2 & 3072) == 0) {
                        }
                        i17 = i16;
                        if ((i4 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i19 != 0) {
                                }
                                if (i5 != 0) {
                                }
                                if (i6 != 0) {
                                }
                                if (i7 != 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 != 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if ((i3 & 2048) == 0) {
                                }
                                Function2<? super Composer, ? super Integer, Unit> function2192 = function218;
                                if ((i3 & 4096) == 0) {
                                }
                                TextFieldColors textFieldColors42 = textFieldColorsM2061textFieldColorsdx8h9Zs;
                                if ((i3 & 8192) == 0) {
                                }
                                function211 = function26;
                                function212 = function27;
                                visualTransformation2 = none;
                                function213 = function28;
                                z6 = z10;
                                shape2 = textFieldShape;
                                boolean z112 = z5;
                                boolean z122 = z4;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object objConsume2 = composerStartRestartGroup.consume(localLayoutDirection2);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                LayoutDirection layoutDirection2 = (LayoutDirection) objConsume2;
                                float fCalculateStartPadding2 = PaddingKt.calculateStartPadding(paddingValuesM2052textFieldWithoutLabelPaddinga9UjIt4$default, layoutDirection2);
                                float fCalculateEndPadding2 = PaddingKt.calculateEndPadding(paddingValuesM2052textFieldWithoutLabelPaddinga9UjIt4$default, layoutDirection2);
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                if (function213 == null) {
                                }
                                if (function210 == null) {
                                }
                                Modifier modifierM1024paddingqDBjuR0$default2 = PaddingKt.m1024paddingqDBjuR0$default(companion2, fM6117constructorimpl, 0.0f, fM6117constructorimpl2, 0.0f, 10, null);
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1024paddingqDBjuR0$default2);
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                int i212 = i17;
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                }
                                composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!composerM3150constructorimpl.getInserting()) {
                                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    float top2 = paddingValuesM2052textFieldWithoutLabelPaddinga9UjIt4$default.getTop();
                                    float bottom2 = paddingValuesM2052textFieldWithoutLabelPaddinga9UjIt4$default.getBottom();
                                    if (function213 != null) {
                                    }
                                    if (function210 != null) {
                                    }
                                    int i222 = i212 << 3;
                                    composer2 = composerStartRestartGroup;
                                    CommonDecorationBox(str, ComposableLambdaKt.rememberComposableLambda(-1139891101, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt$InsetDecorationBox$4$3
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i23) {
                                            if ((i23 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1139891101, i23, -1, "com.stripe.android.uicore.elements.compat.InsetDecorationBox.<anonymous>.<anonymous> (CompatTextField.kt:382)");
                                                }
                                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                Function2<Composer, Integer, Unit> function220 = function2;
                                                ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier22 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                                                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                if (!(composer3.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer3.startReusableNode();
                                                if (composer3.getInserting()) {
                                                    composer3.createNode(constructor22);
                                                } else {
                                                    composer3.useNode();
                                                }
                                                Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer3);
                                                Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                    composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                    composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                }
                                                Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                                function220.invoke(composer3, 0);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                composer3.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }, composerStartRestartGroup, 54), visualTransformation2, function211, function212, function213, function210, z6, z122, z112, mutableInteractionSource2, PaddingKt.m1016PaddingValuesa9UjIt4(fCalculateStartPadding2, top2, fCalculateEndPadding2, bottom2), shape2, textFieldColors2, composer2, (i4 & 14) | 48 | ((i4 >> 18) & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | ((i4 >> 6) & 29360128) | ((i4 << 18) & 234881024) | (1879048192 & (i4 << 6)), (i212 & 14) | (i222 & 896) | (i222 & 7168));
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    paddingValues2 = paddingValuesM2052textFieldWithoutLabelPaddinga9UjIt4$default;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    visualTransformation3 = visualTransformation2;
                                    function214 = function211;
                                    function215 = function212;
                                    function216 = function213;
                                    function217 = function210;
                                    z7 = z6;
                                    z8 = z122;
                                    z9 = z112;
                                    shape3 = shape2;
                                    textFieldColors3 = textFieldColors2;
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i11 = i10;
                    i12 = i3 & 512;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    i14 = i3 & 1024;
                    if (i14 == 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    }
                    if ((i2 & 3072) == 0) {
                    }
                    i17 = i16;
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function27 = function23;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i3 & 256;
                if (i10 == 0) {
                }
                i11 = i10;
                i12 = i3 & 512;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i3 & 1024;
                if (i14 == 0) {
                }
                if ((i2 & 48) == 0) {
                }
                if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                }
                if ((i2 & 3072) == 0) {
                }
                i17 = i16;
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function26 = function22;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            function27 = function23;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i3 & 256;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i3 & 512;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i3 & 1024;
            if (i14 == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            i17 = i16;
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z4 = z;
        i5 = i3 & 8;
        int i202 = 1024;
        if (i5 == 0) {
        }
        function26 = function22;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        function27 = function23;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i3 & 256;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i3 & 512;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i3 & 1024;
        if (i14 == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        i17 = i16;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void CommonDecorationBox(final String value, final Function2<? super Composer, ? super Integer, Unit> innerTextField, final VisualTransformation visualTransformation, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final boolean z, final boolean z2, final boolean z3, final InteractionSource interactionSource, final PaddingValues contentPadding, final Shape shape, final TextFieldColors colors, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Composer composer2;
        InputPhase inputPhase;
        Composer composer3;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1102660609);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(innerTextField) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(visualTransformation) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 = i3 | (composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536);
        } else {
            i4 = i3;
        }
        if ((i & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function24) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changed(z3) ? 536870912 : 268435456;
        }
        int i7 = i4;
        if ((i2 & 6) == 0) {
            i5 = i2 | (composerStartRestartGroup.changed(interactionSource) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(contentPadding) ? 32 : 16;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 |= composerStartRestartGroup.changed(shape) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(colors) ? 2048 : 1024;
        }
        int i8 = i5;
        if ((i7 & 306783379) != 306783378 || (i8 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1102660609, i7, i8, "com.stripe.android.uicore.elements.compat.CommonDecorationBox (CompatTextField.kt:430)");
            }
            composerStartRestartGroup.startReplaceGroup(1391459420);
            boolean z4 = ((i7 & 14) == 4) | ((i7 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                i6 = i8;
                composer2 = composerStartRestartGroup;
                objRememberedValue = visualTransformation.filter(new AnnotatedString(value, null, null, 6, null));
                composer2.updateRememberedValue(objRememberedValue);
            } else {
                i6 = i8;
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            final String text = ((TransformedText) objRememberedValue).getText().getText();
            if (FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer2, i6 & 14).getValue().booleanValue()) {
                inputPhase = InputPhase.Focused;
            } else {
                inputPhase = text.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
            }
            Function3<InputPhase, Composer, Integer, Color> function3 = new Function3<InputPhase, Composer, Integer, Color>() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt$CommonDecorationBox$labelColor$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Color invoke(InputPhase inputPhase2, Composer composer4, Integer num) {
                    return Color.m3647boximpl(m8864invokeXeAY9LY(inputPhase2, composer4, num.intValue()));
                }

                /* renamed from: invoke-XeAY9LY, reason: not valid java name */
                public final long m8864invokeXeAY9LY(InputPhase it, Composer composer4, int i9) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    composer4.startReplaceGroup(1194596618);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1194596618, i9, -1, "com.stripe.android.uicore.elements.compat.CommonDecorationBox.<anonymous> (CompatTextField.kt:443)");
                    }
                    long jM3667unboximpl = colors.labelColor(z2, it == InputPhase.UnfocusedEmpty ? false : z3, interactionSource, composer4, 0).getValue().m3667unboximpl();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer4.endReplaceGroup();
                    return jM3667unboximpl;
                }
            };
            Typography typography = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable);
            TextStyle subtitle1 = typography.getSubtitle1();
            TextStyle caption = typography.getCaption();
            boolean z5 = (Color.m3658equalsimpl0(subtitle1.m5632getColor0d7_KjU(), Color.INSTANCE.m3693getUnspecified0d7_KjU()) && !Color.m3658equalsimpl0(caption.m5632getColor0d7_KjU(), Color.INSTANCE.m3693getUnspecified0d7_KjU())) || (!Color.m3658equalsimpl0(subtitle1.m5632getColor0d7_KjU(), Color.INSTANCE.m3693getUnspecified0d7_KjU()) && Color.m3658equalsimpl0(caption.m5632getColor0d7_KjU(), Color.INSTANCE.m3693getUnspecified0d7_KjU()));
            TextFieldTransitionScope textFieldTransitionScope = TextFieldTransitionScope.INSTANCE;
            composer2.startReplaceGroup(1391497134);
            long jM5632getColor0d7_KjU = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getCaption().m5632getColor0d7_KjU();
            composer2.startReplaceGroup(1391498953);
            if (z5 && jM5632getColor0d7_KjU == 16) {
                jM5632getColor0d7_KjU = function3.invoke(inputPhase, composer2, 0).m3667unboximpl();
            }
            long j = jM5632getColor0d7_KjU;
            composer2.endReplaceGroup();
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1391503248);
            long jM5632getColor0d7_KjU2 = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getSubtitle1().m5632getColor0d7_KjU();
            composer2.startReplaceGroup(1391505129);
            if (z5 && jM5632getColor0d7_KjU2 == 16) {
                jM5632getColor0d7_KjU2 = function3.invoke(inputPhase, composer2, 0).m3667unboximpl();
            }
            long j2 = jM5632getColor0d7_KjU2;
            composer2.endReplaceGroup();
            composer2.endReplaceGroup();
            final boolean z6 = z5;
            composer3 = composer2;
            textFieldTransitionScope.m8870TransitionDTcfvLk(inputPhase, j, j2, function3, function2 != null, ComposableLambdaKt.rememberComposableLambda(790678428, true, new Function6<Float, Color, Color, Float, Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt.CommonDecorationBox.3
                @Override // kotlin.jvm.functions.Function6
                public /* bridge */ /* synthetic */ Unit invoke(Float f, Color color, Color color2, Float f2, Composer composer4, Integer num) {
                    m8863invokeRIQooxk(f.floatValue(), color.m3667unboximpl(), color2.m3667unboximpl(), f2.floatValue(), composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-RIQooxk, reason: not valid java name */
                public final void m8863invokeRIQooxk(final float f, final long j3, final long j4, final float f2, Composer composer4, int i9) {
                    int i10;
                    ComposableLambda composableLambdaRememberComposableLambda;
                    ComposableLambda composableLambdaRememberComposableLambda2;
                    if ((i9 & 6) == 0) {
                        i10 = (composer4.changed(f) ? 4 : 2) | i9;
                    } else {
                        i10 = i9;
                    }
                    if ((i9 & 48) == 0) {
                        i10 |= composer4.changed(j3) ? 32 : 16;
                    }
                    if ((i9 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                        i10 |= composer4.changed(j4) ? 256 : 128;
                    }
                    if ((i9 & 3072) == 0) {
                        i10 |= composer4.changed(f2) ? 2048 : 1024;
                    }
                    int i11 = i10;
                    if ((i11 & 9363) != 9362 || !composer4.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(790678428, i11, -1, "com.stripe.android.uicore.elements.compat.CommonDecorationBox.<anonymous> (CompatTextField.kt:471)");
                        }
                        final Function2<Composer, Integer, Unit> function25 = function2;
                        composer4.startReplaceGroup(-914106855);
                        if (function25 == null) {
                            composableLambdaRememberComposableLambda = null;
                        } else {
                            final boolean z7 = z6;
                            composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-424665208, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt$CommonDecorationBox$3$decoratedLabel$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i12) {
                                    if ((i12 & 3) != 2 || !composer5.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-424665208, i12, -1, "com.stripe.android.uicore.elements.compat.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (CompatTextField.kt:473)");
                                        }
                                        TextStyle textStyleLerp = TextStyleKt.lerp(MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getSubtitle1(), MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getCaption(), f);
                                        boolean z8 = z7;
                                        long j5 = j3;
                                        if (z8) {
                                            textStyleLerp = TextStyle.m5615copyp1EtxEg$default(textStyleLerp, j5, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                                        }
                                        CompatTextFieldKt.m8862DecorationeuL9pac(j4, textStyleLerp, null, function25, composer5, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer5.skipToGroupEnd();
                                }
                            }, composer4, 54);
                        }
                        composer4.endReplaceGroup();
                        composer4.startReplaceGroup(-914084376);
                        if (function22 == null || text.length() != 0 || f2 <= 0.0f) {
                            composableLambdaRememberComposableLambda2 = null;
                        } else {
                            final TextFieldColors textFieldColors = colors;
                            final boolean z8 = z2;
                            final Function2<Composer, Integer, Unit> function26 = function22;
                            composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(154418702, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt$CommonDecorationBox$3$decoratedPlaceholder$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer5, Integer num) {
                                    invoke(modifier, composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Modifier modifier, Composer composer5, int i12) {
                                    Intrinsics.checkNotNullParameter(modifier, "modifier");
                                    if ((i12 & 6) == 0) {
                                        i12 |= composer5.changed(modifier) ? 4 : 2;
                                    }
                                    if ((i12 & 19) != 18 || !composer5.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(154418702, i12, -1, "com.stripe.android.uicore.elements.compat.CommonDecorationBox.<anonymous>.<anonymous> (CompatTextField.kt:489)");
                                        }
                                        Modifier modifierAlpha = AlphaKt.alpha(modifier, f2);
                                        TextFieldColors textFieldColors2 = textFieldColors;
                                        boolean z9 = z8;
                                        Function2<Composer, Integer, Unit> function27 = function26;
                                        ComposerKt.sourceInformationMarkerStart(composer5, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer5, modifierAlpha);
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer5.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor);
                                        } else {
                                            composer5.useNode();
                                        }
                                        Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer5);
                                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer5, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        CompatTextFieldKt.m8862DecorationeuL9pac(textFieldColors2.placeholderColor(z9, composer5, 0).getValue().m3667unboximpl(), MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getSubtitle1(), null, function27, composer5, 0, 4);
                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                        composer5.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer5.skipToGroupEnd();
                                }
                            }, composer4, 54);
                        }
                        composer4.endReplaceGroup();
                        final long jM3667unboximpl = colors.leadingIconColor(z2, z3, interactionSource, composer4, 0).getValue().m3667unboximpl();
                        final Function2<Composer, Integer, Unit> function27 = function23;
                        composer4.startReplaceGroup(-914061229);
                        ComposableLambda composableLambdaRememberComposableLambda3 = function27 == null ? null : ComposableLambdaKt.rememberComposableLambda(704901338, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt$CommonDecorationBox$3$decoratedLeading$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer5, int i12) {
                                if ((i12 & 3) == 2 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(704901338, i12, -1, "com.stripe.android.uicore.elements.compat.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (CompatTextField.kt:504)");
                                }
                                CompatTextFieldKt.m8862DecorationeuL9pac(jM3667unboximpl, null, null, function27, composer5, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer4, 54);
                        composer4.endReplaceGroup();
                        final long jM3667unboximpl2 = colors.trailingIconColor(z2, z3, interactionSource, composer4, 0).getValue().m3667unboximpl();
                        final Function2<Composer, Integer, Unit> function28 = function24;
                        composer4.startReplaceGroup(-914051500);
                        ComposableLambda composableLambdaRememberComposableLambda4 = function28 != null ? ComposableLambdaKt.rememberComposableLambda(-1742107582, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt$CommonDecorationBox$3$decoratedTrailing$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer5, int i12) {
                                if ((i12 & 3) == 2 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1742107582, i12, -1, "com.stripe.android.uicore.elements.compat.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (CompatTextField.kt:511)");
                                }
                                CompatTextFieldKt.m8862DecorationeuL9pac(jM3667unboximpl2, null, null, function28, composer5, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer4, 54) : null;
                        composer4.endReplaceGroup();
                        TextFieldLayoutKt.TextFieldLayout(BackgroundKt.m574backgroundbw27NRU(Modifier.INSTANCE, colors.backgroundColor(z2, composer4, 0).getValue().m3667unboximpl(), shape), innerTextField, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda3, composableLambdaRememberComposableLambda4, z, f, contentPadding, composer4, (i11 << 21) & 29360128);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer4.skipToGroupEnd();
                }
            }, composer3, 54), composer3, 1769472);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CompatTextFieldKt.CommonDecorationBox$lambda$18(value, innerTextField, visualTransformation, function2, function22, function23, function24, z, z2, z3, interactionSource, contentPadding, shape, colors, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: Decoration-euL9pac, reason: not valid java name */
    public static final void m8862DecorationeuL9pac(final long j, TextStyle textStyle, Float f, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        final Float f2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1020207716);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(textStyle) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                textStyle = null;
            }
            final Float f3 = i5 == 0 ? f : null;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1020207716, i3, -1, "com.stripe.android.uicore.elements.compat.Decoration (CompatTextField.kt:544)");
            }
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(832511270, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt$Decoration$colorAndEmphasis$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(832511270, i6, -1, "com.stripe.android.uicore.elements.compat.Decoration.<anonymous> (CompatTextField.kt:546)");
                        }
                        ProvidedValue<Color> providedValueProvides = ContentColorKt.getLocalContentColor().provides(Color.m3647boximpl(j));
                        final Float f4 = f3;
                        final Function2<Composer, Integer, Unit> function2 = content;
                        final long j2 = j;
                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.rememberComposableLambda(-1145200538, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt$Decoration$colorAndEmphasis$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i7) {
                                if ((i7 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1145200538, i7, -1, "com.stripe.android.uicore.elements.compat.Decoration.<anonymous>.<anonymous> (CompatTextField.kt:547)");
                                    }
                                    if (f4 != null) {
                                        composer3.startReplaceGroup(-970238231);
                                        CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(f4), function2, composer3, ProvidedValue.$stable);
                                        composer3.endReplaceGroup();
                                    } else {
                                        composer3.startReplaceGroup(-970059485);
                                        CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m3659getAlphaimpl(j2))), function2, composer3, ProvidedValue.$stable);
                                        composer3.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            if (textStyle != null) {
                composerStartRestartGroup.startReplaceGroup(287243227);
                TextKt.ProvideTextStyle(textStyle, composableLambdaRememberComposableLambda, composerStartRestartGroup, ((i3 >> 3) & 14) | 48);
            } else {
                composerStartRestartGroup.startReplaceGroup(287244863);
                composableLambdaRememberComposableLambda.invoke(composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f2 = f3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            f2 = f;
        }
        final TextStyle textStyle2 = textStyle;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CompatTextFieldKt.Decoration_euL9pac$lambda$19(j, textStyle2, f2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CompatTextField.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.uicore.elements.compat.CompatTextFieldKt$errorSemanticsWithDefault$1, reason: invalid class name */
    static final class AnonymousClass1 implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ String $errorMessage;
        final /* synthetic */ boolean $isError;

        AnonymousClass1(boolean z, String str) {
            this.$isError = z;
            this.$errorMessage = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        public final Modifier invoke(Modifier composed, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceGroup(1787698759);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1787698759, i, -1, "com.stripe.android.uicore.elements.compat.errorSemanticsWithDefault.<anonymous> (CompatTextField.kt:659)");
            }
            final String strStringResource = StringResources_androidKt.stringResource(R.string.default_error_message, composer, 0);
            if (this.$isError) {
                composer.startReplaceGroup(-1347526150);
                boolean zChanged = composer.changed(this.$errorMessage) | composer.changed(strStringResource);
                final String str = this.$errorMessage;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.uicore.elements.compat.CompatTextFieldKt$errorSemanticsWithDefault$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CompatTextFieldKt.AnonymousClass1.invoke$lambda$1$lambda$0(str, strStringResource, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                composed = SemanticsModifierKt.semantics$default(composed, false, (Function1) objRememberedValue, 1, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return composed;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(String str, String str2, SemanticsPropertyReceiver semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            if (str == null) {
                str = str2;
            }
            SemanticsPropertiesKt.error(semantics, str);
            return Unit.INSTANCE;
        }
    }

    public static final Modifier errorSemanticsWithDefault(Modifier modifier, boolean z, String str) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed$default(modifier, null, new AnonymousClass1(z, str), 1, null);
    }
}
