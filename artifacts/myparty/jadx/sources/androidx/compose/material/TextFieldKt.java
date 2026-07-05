package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0087\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010,\u001a\u0093\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010-\u001a\u00020%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010.\u001a\u0087\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020/2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u00100\u001a\u0093\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020/2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010-\u001a\u00020%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u00101\u001a\u009a\u0001\u00102\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\n0\u0017¢\u0006\u0002\b\u00182\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0019\u0010\u0019\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e¢\u0006\u0002\b\u00182\u0013\u00104\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0013\u00105\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0006\u0010#\u001a\u00020\u00122\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0001¢\u0006\u0002\u0010:\u001aZ\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020%2\u0006\u0010=\u001a\u00020\u00122\u0006\u0010>\u001a\u00020%2\u0006\u0010?\u001a\u00020%2\u0006\u0010@\u001a\u00020%2\u0006\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u0002072\u0006\u00108\u001a\u000209H\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001aB\u0010G\u001a\u00020%2\u0006\u0010H\u001a\u00020%2\u0006\u0010I\u001a\u00020%2\u0006\u0010J\u001a\u00020%2\u0006\u0010K\u001a\u00020%2\u0006\u0010L\u001a\u00020%2\u0006\u0010B\u001a\u00020CH\u0002ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a\u0014\u0010O\u001a\u00020\u0010*\u00020\u00102\u0006\u0010P\u001a\u00020QH\u0000\u001at\u0010R\u001a\u00020\n*\u00020S2\u0006\u0010T\u001a\u00020%2\u0006\u0010U\u001a\u00020%2\u0006\u0010V\u001a\u00020W2\b\u0010X\u001a\u0004\u0018\u00010W2\b\u0010Y\u001a\u0004\u0018\u00010W2\b\u0010Z\u001a\u0004\u0018\u00010W2\b\u0010[\u001a\u0004\u0018\u00010W2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020%2\u0006\u0010]\u001a\u00020%2\u0006\u00106\u001a\u0002072\u0006\u0010D\u001a\u000207H\u0002\u001aZ\u0010^\u001a\u00020\n*\u00020S2\u0006\u0010T\u001a\u00020%2\u0006\u0010U\u001a\u00020%2\u0006\u0010_\u001a\u00020W2\b\u0010Y\u001a\u0004\u0018\u00010W2\b\u0010Z\u001a\u0004\u0018\u00010W2\b\u0010[\u001a\u0004\u0018\u00010W2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010D\u001a\u0002072\u0006\u00108\u001a\u000209H\u0002\u001a\u0014\u0010`\u001a\u00020%*\u00020%2\u0006\u0010a\u001a\u00020%H\u0002\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0005\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u0016\u0010\u0007\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\b\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006b"}, d2 = {"FirstBaselineOffset", "Landroidx/compose/ui/unit/Dp;", "getFirstBaselineOffset", "()F", "F", "TextFieldBottomPadding", "getTextFieldBottomPadding", "TextFieldTopPadding", "getTextFieldTopPadding", "TextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", ViewProps.ENABLED, "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", ReactTextInputShadowNode.PROP_PLACEHOLDER, "leadingIcon", "trailingIcon", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", PaymentSheetAppearanceKeys.COLORS, "Landroidx/compose/material/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "minLines", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "TextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "calculateHeight", "textFieldHeight", "hasLabel", "labelBaseline", "leadingHeight", "trailingHeight", "placeholderHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-O3s9Psw", "(IZIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingWidth", "trailingWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "calculateWidth-VsPV1Ek", "(IIIIIJ)I", "drawIndicatorLine", "indicatorBorder", "Landroidx/compose/foundation/BorderStroke;", "placeWithLabel", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "width", "height", "textfieldPlaceable", "Landroidx/compose/ui/layout/Placeable;", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "labelEndPosition", "textPosition", "placeWithoutLabel", "textPlaceable", "substractConstraintSafely", "from", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldKt {
    private static final float FirstBaselineOffset = Dp.m6117constructorimpl(20);
    private static final float TextFieldBottomPadding = Dp.m6117constructorimpl(10);
    private static final float TextFieldTopPadding = Dp.m6117constructorimpl(2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int substractConstraintSafely(int i, int i2) {
        return i == Integer.MAX_VALUE ? i : i - i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:326:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextField(final String str, final Function1<? super String, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
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
        Function2<? super Composer, ? super Integer, Unit> function27;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Function2<? super Composer, ? super Integer, Unit> function210;
        boolean z7;
        int i27;
        KeyboardActions keyboardActions2;
        int i28;
        int i29;
        MutableInteractionSource mutableInteractionSource2;
        Shape textFieldShape;
        Composer composer2;
        TextFieldColors textFieldColorsM2061textFieldColorsdx8h9Zs;
        KeyboardActions keyboardActions3;
        boolean z8;
        boolean z9;
        TextStyle textStyle3;
        int i30;
        VisualTransformation visualTransformation2;
        KeyboardOptions keyboardOptions2;
        boolean z10;
        int i31;
        int i32;
        MutableInteractionSource mutableInteractionSource3;
        long jM5632getColor0d7_KjU;
        Composer composer3;
        final boolean z11;
        final VisualTransformation visualTransformation3;
        final TextStyle textStyle4;
        final TextFieldColors textFieldColors2;
        final boolean z12;
        final int i33;
        final int i34;
        final Modifier modifier3;
        final boolean z13;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final MutableInteractionSource mutableInteractionSource4;
        final Shape shape2;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions4;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final boolean z14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1504264404);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TextField)P(18,11,10,1,13,16,6,12,7,17,3,19,5,4,15,8,9,2,14)165@8582L7,178@9226L14,179@9290L17,194@9914L38,203@10281L20,211@10623L719,190@9731L1617:TextField.kt#jmzs0o");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i6 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    modifier2 = modifier;
                    i6 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        z5 = z;
                        i6 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
                    }
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else {
                        if ((i3 & 24576) == 0) {
                            z6 = z2;
                            i6 |= composerStartRestartGroup.changed(z6) ? 16384 : 8192;
                        }
                        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            textStyle2 = textStyle;
                            i6 |= ((i5 & 32) == 0 && composerStartRestartGroup.changed(textStyle2)) ? 131072 : 65536;
                        } else {
                            textStyle2 = textStyle;
                        }
                        i10 = i5 & 64;
                        if (i10 != 0) {
                            i6 |= 1572864;
                            function25 = function2;
                        } else {
                            function25 = function2;
                            if ((i3 & 1572864) == 0) {
                                i6 |= composerStartRestartGroup.changedInstance(function25) ? 1048576 : 524288;
                            }
                        }
                        i11 = i5 & 128;
                        if (i11 != 0) {
                            i6 |= 12582912;
                            function26 = function22;
                        } else {
                            function26 = function22;
                            if ((i3 & 12582912) == 0) {
                                i6 |= composerStartRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
                            }
                        }
                        i12 = i5 & 256;
                        if (i12 != 0) {
                            i6 |= 100663296;
                        } else {
                            if ((i3 & 100663296) == 0) {
                                i13 = i12;
                                i6 |= composerStartRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            i14 = i5 & 512;
                            if (i14 == 0) {
                                i6 |= 805306368;
                            } else {
                                if ((i3 & 805306368) == 0) {
                                    i15 = i14;
                                    i6 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                                }
                                i16 = i5 & 1024;
                                if (i16 != 0) {
                                    i18 = i4 | 6;
                                    i17 = i16;
                                } else if ((i4 & 6) == 0) {
                                    i17 = i16;
                                    i18 = i4 | (composerStartRestartGroup.changed(z3) ? 4 : 2);
                                } else {
                                    i17 = i16;
                                    i18 = i4;
                                }
                                i19 = i5 & 2048;
                                if (i19 != 0) {
                                    i18 |= 48;
                                    i20 = i19;
                                } else if ((i4 & 48) == 0) {
                                    i20 = i19;
                                    i18 |= composerStartRestartGroup.changed(visualTransformation) ? 32 : 16;
                                } else {
                                    i20 = i19;
                                }
                                int i35 = i18;
                                i21 = i5 & 4096;
                                if (i21 != 0) {
                                    i22 = i35 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                                } else {
                                    i22 = i35;
                                    if ((i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                        i22 |= composerStartRestartGroup.changed(keyboardOptions) ? 256 : 128;
                                    }
                                    if ((i4 & 3072) == 0) {
                                        i22 |= ((i5 & 8192) == 0 && composerStartRestartGroup.changed(keyboardActions)) ? 2048 : 1024;
                                    }
                                    int i36 = i22;
                                    i23 = i5 & 16384;
                                    if (i23 != 0) {
                                        i24 = i36;
                                        if ((i4 & 24576) == 0) {
                                            i24 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                                        }
                                        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                            i24 |= ((i5 & 32768) == 0 && composerStartRestartGroup.changed(i)) ? 131072 : 65536;
                                        }
                                        i25 = i5 & 65536;
                                        if (i25 != 0) {
                                            i24 |= 1572864;
                                        } else if ((i4 & 1572864) == 0) {
                                            i24 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
                                        }
                                        i26 = i5 & 131072;
                                        if (i26 != 0) {
                                            i24 |= 12582912;
                                        } else if ((i4 & 12582912) == 0) {
                                            i24 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                                        }
                                        if ((i4 & 100663296) == 0) {
                                            i24 |= ((i5 & 262144) == 0 && composerStartRestartGroup.changed(shape)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                        }
                                        if ((i4 & 805306368) == 0) {
                                            i24 |= ((i5 & 524288) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 536870912 : 268435456;
                                        }
                                        int i37 = i24;
                                        if ((i6 & 306783379) != 306783378 || (306783379 & i37) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                                            composerStartRestartGroup.startDefaults();
                                            if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                                Modifier.Companion companion = i7 == 0 ? Modifier.INSTANCE : modifier2;
                                                boolean z15 = i8 == 0 ? true : z;
                                                boolean z16 = i9 == 0 ? false : z2;
                                                if ((i5 & 32) != 0) {
                                                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                    Object objConsume = composerStartRestartGroup.consume(localTextStyle);
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    textStyle2 = (TextStyle) objConsume;
                                                    i6 &= -458753;
                                                }
                                                int i38 = i6;
                                                TextStyle textStyle5 = textStyle2;
                                                function27 = i10 == 0 ? null : function25;
                                                function28 = i11 == 0 ? null : function26;
                                                function29 = i13 == 0 ? null : function23;
                                                function210 = i15 == 0 ? null : function24;
                                                z7 = i17 == 0 ? false : z3;
                                                VisualTransformation none = i20 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                                KeyboardOptions keyboardOptions4 = i21 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                                if ((i5 & 8192) == 0) {
                                                    i27 = i37 & (-7169);
                                                    keyboardActions2 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                                } else {
                                                    i27 = i37;
                                                    keyboardActions2 = keyboardActions;
                                                }
                                                boolean z17 = i23 == 0 ? false : z4;
                                                if ((32768 & i5) == 0) {
                                                    i27 &= -458753;
                                                    i28 = z17 ? 1 : Integer.MAX_VALUE;
                                                } else {
                                                    i28 = i;
                                                }
                                                i29 = i25 == 0 ? 1 : i2;
                                                mutableInteractionSource2 = i26 == 0 ? null : mutableInteractionSource;
                                                if ((262144 & i5) == 0) {
                                                    i27 &= -234881025;
                                                    textFieldShape = TextFieldDefaults.INSTANCE.getTextFieldShape(composerStartRestartGroup, 6);
                                                } else {
                                                    textFieldShape = shape;
                                                }
                                                int i39 = i27;
                                                if ((i5 & 524288) == 0) {
                                                    textFieldColorsM2061textFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m2061textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 48, 2097151);
                                                    composer2 = composerStartRestartGroup;
                                                    i32 = i39 & (-1879048193);
                                                    keyboardActions3 = keyboardActions2;
                                                    modifier2 = companion;
                                                    z8 = z15;
                                                    z9 = z16;
                                                    textStyle3 = textStyle5;
                                                    i30 = i38;
                                                    visualTransformation2 = none;
                                                    keyboardOptions2 = keyboardOptions4;
                                                    z10 = z17;
                                                    i31 = i28;
                                                } else {
                                                    composer2 = composerStartRestartGroup;
                                                    textFieldColorsM2061textFieldColorsdx8h9Zs = textFieldColors;
                                                    keyboardActions3 = keyboardActions2;
                                                    modifier2 = companion;
                                                    z8 = z15;
                                                    z9 = z16;
                                                    textStyle3 = textStyle5;
                                                    i30 = i38;
                                                    visualTransformation2 = none;
                                                    keyboardOptions2 = keyboardOptions4;
                                                    z10 = z17;
                                                    i31 = i28;
                                                    i32 = i39;
                                                }
                                            } else {
                                                composerStartRestartGroup.skipToGroupEnd();
                                                if ((i5 & 32) != 0) {
                                                    i6 &= -458753;
                                                }
                                                if ((i5 & 8192) != 0) {
                                                    i37 &= -7169;
                                                }
                                                if ((32768 & i5) != 0) {
                                                    i37 &= -458753;
                                                }
                                                if ((262144 & i5) != 0) {
                                                    i37 &= -234881025;
                                                }
                                                if ((i5 & 524288) != 0) {
                                                    i37 &= -1879048193;
                                                }
                                                composer2 = composerStartRestartGroup;
                                                z9 = z2;
                                                function29 = function23;
                                                function210 = function24;
                                                z7 = z3;
                                                visualTransformation2 = visualTransformation;
                                                keyboardActions3 = keyboardActions;
                                                z10 = z4;
                                                i29 = i2;
                                                mutableInteractionSource2 = mutableInteractionSource;
                                                textFieldShape = shape;
                                                textFieldColorsM2061textFieldColorsdx8h9Zs = textFieldColors;
                                                i32 = i37;
                                                i30 = i6;
                                                textStyle3 = textStyle2;
                                                function27 = function25;
                                                function28 = function26;
                                                z8 = z;
                                                keyboardOptions2 = keyboardOptions;
                                                i31 = i;
                                            }
                                            composer2.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1504264404, i30, i32, "androidx.compose.material.TextField (TextField.kt:180)");
                                            }
                                            if (mutableInteractionSource2 != null) {
                                                composer2.startReplaceGroup(-1675073900);
                                                ComposerKt.sourceInformation(composer2, "182@9393L39");
                                                ComposerKt.sourceInformationMarkerStart(composer2, -54034642, "CC(remember):TextField.kt#9igjgp");
                                                Object objRememberedValue = composer2.rememberedValue();
                                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                    composer2.updateRememberedValue(objRememberedValue);
                                                }
                                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                composer2.endReplaceGroup();
                                            } else {
                                                composer2.startReplaceGroup(-54035293);
                                                composer2.endReplaceGroup();
                                                mutableInteractionSource3 = mutableInteractionSource2;
                                            }
                                            composer2.startReplaceGroup(-54029535);
                                            ComposerKt.sourceInformation(composer2, "*185@9580L18");
                                            jM5632getColor0d7_KjU = textStyle3.m5632getColor0d7_KjU();
                                            if (jM5632getColor0d7_KjU == 16) {
                                                jM5632getColor0d7_KjU = textFieldColorsM2061textFieldColorsdx8h9Zs.textColor(z8, composer2, ((i30 >> 9) & 14) | ((i32 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).getValue().m3667unboximpl();
                                            }
                                            composer2.endReplaceGroup();
                                            TextStyle textStyleMerge = textStyle3.merge(new TextStyle(jM5632getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                            final TextFieldColors textFieldColors3 = textFieldColorsM2061textFieldColorsdx8h9Zs;
                                            final boolean z18 = z8;
                                            Modifier modifier4 = modifier2;
                                            final boolean z19 = z7;
                                            TextStyle textStyle6 = textStyle3;
                                            Modifier modifierM1049defaultMinSizeVpY3zN4 = SizeKt.m1049defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(TextFieldDefaults.m2049indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, modifier4, z18, z19, mutableInteractionSource3, textFieldColors3, 0.0f, 0.0f, 48, null), z19, Strings_androidKt.m2014getString4foXLRw(Strings.INSTANCE.m2009getDefaultErrorMessageUdPEhr4(), composer2, 6)), TextFieldDefaults.INSTANCE.m2056getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2055getMinHeightD9Ej5fM());
                                            Color value = textFieldColors3.cursorColor(z19, composer2, (i32 & 14) | ((i32 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).getValue();
                                            final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                                            final boolean z20 = z10;
                                            final VisualTransformation visualTransformation4 = visualTransformation2;
                                            final Function2<? super Composer, ? super Integer, Unit> function215 = function27;
                                            final Function2<? super Composer, ? super Integer, Unit> function216 = function28;
                                            final Function2<? super Composer, ? super Integer, Unit> function217 = function29;
                                            final Function2<? super Composer, ? super Integer, Unit> function218 = function210;
                                            final Shape shape3 = textFieldShape;
                                            int i40 = i32 << 12;
                                            Composer composer4 = composer2;
                                            int i41 = i29;
                                            BasicTextFieldKt.BasicTextField(str, function1, modifierM1049defaultMinSizeVpY3zN4, z18, z9, textStyleMerge, keyboardOptions2, keyboardActions3, z10, i31, i41, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, new SolidColor(value.m3667unboximpl(), null), ComposableLambdaKt.rememberComposableLambda(989834338, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextField.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer5, Integer num) {
                                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Function2<? super Composer, ? super Integer, Unit> function219, Composer composer5, int i42) {
                                                    int i43;
                                                    ComposerKt.sourceInformation(composer5, "C213@10762L570:TextField.kt#jmzs0o");
                                                    if ((i42 & 6) == 0) {
                                                        i43 = i42 | (composer5.changedInstance(function219) ? 4 : 2);
                                                    } else {
                                                        i43 = i42;
                                                    }
                                                    if ((i43 & 19) != 18 || !composer5.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(989834338, i43, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:213)");
                                                        }
                                                        TextFieldDefaults.INSTANCE.TextFieldDecorationBox(str, function219, z18, z20, visualTransformation4, mutableInteractionSource5, z19, function215, function216, function217, function218, shape3, textFieldColors3, null, composer5, (i43 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 24576, 8192);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }, composer2, 54), composer4, (i30 & 64638) | (3670016 & i40) | (29360128 & i40) | (234881024 & i40) | (i40 & 1879048192), ((i32 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i32 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), 4096);
                                            composer3 = composer4;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            VisualTransformation visualTransformation5 = visualTransformation2;
                                            z11 = z10;
                                            visualTransformation3 = visualTransformation5;
                                            textStyle4 = textStyle6;
                                            textFieldColors2 = textFieldColors3;
                                            z12 = z9;
                                            i33 = i31;
                                            i34 = i41;
                                            modifier3 = modifier4;
                                            z13 = z18;
                                            function211 = function27;
                                            function212 = function28;
                                            function213 = function29;
                                            mutableInteractionSource4 = mutableInteractionSource2;
                                            shape2 = textFieldShape;
                                            keyboardOptions3 = keyboardOptions2;
                                            keyboardActions4 = keyboardActions3;
                                            function214 = function210;
                                            z14 = z19;
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            z14 = z3;
                                            visualTransformation3 = visualTransformation;
                                            z11 = z4;
                                            i33 = i;
                                            i34 = i2;
                                            mutableInteractionSource4 = mutableInteractionSource;
                                            shape2 = shape;
                                            textFieldColors2 = textFieldColors;
                                            composer3 = composerStartRestartGroup;
                                            z13 = z5;
                                            z12 = z6;
                                            textStyle4 = textStyle2;
                                            function211 = function25;
                                            function212 = function26;
                                            modifier3 = modifier2;
                                            function213 = function23;
                                            function214 = function24;
                                            keyboardOptions3 = keyboardOptions;
                                            keyboardActions4 = keyboardActions;
                                        }
                                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                                        if (scopeUpdateScopeEndRestartGroup != null) {
                                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextField.2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer5, int i42) {
                                                    TextFieldKt.TextField(str, function1, modifier3, z13, z12, textStyle4, function211, function212, function213, function214, z14, visualTransformation3, keyboardOptions3, keyboardActions4, z11, i33, i34, mutableInteractionSource4, shape2, textFieldColors2, composer5, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i24 = i36 | 24576;
                                    if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    }
                                    i25 = i5 & 65536;
                                    if (i25 != 0) {
                                    }
                                    i26 = i5 & 131072;
                                    if (i26 != 0) {
                                    }
                                    if ((i4 & 100663296) == 0) {
                                    }
                                    if ((i4 & 805306368) == 0) {
                                    }
                                    int i372 = i24;
                                    if ((i6 & 306783379) != 306783378) {
                                        composerStartRestartGroup.startDefaults();
                                        if ((i3 & 1) != 0) {
                                            if (i7 == 0) {
                                            }
                                            if (i8 == 0) {
                                            }
                                            if (i9 == 0) {
                                            }
                                            if ((i5 & 32) != 0) {
                                            }
                                            int i382 = i6;
                                            TextStyle textStyle52 = textStyle2;
                                            if (i10 == 0) {
                                            }
                                            if (i11 == 0) {
                                            }
                                            if (i13 == 0) {
                                            }
                                            if (i15 == 0) {
                                            }
                                            if (i17 == 0) {
                                            }
                                            if (i20 == 0) {
                                            }
                                            if (i21 == 0) {
                                            }
                                            if ((i5 & 8192) == 0) {
                                            }
                                            if (i23 == 0) {
                                            }
                                            if ((32768 & i5) == 0) {
                                            }
                                            if (i25 == 0) {
                                            }
                                            if (i26 == 0) {
                                            }
                                            if ((262144 & i5) == 0) {
                                            }
                                            int i392 = i27;
                                            if ((i5 & 524288) == 0) {
                                            }
                                            composer2.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            if (mutableInteractionSource2 != null) {
                                            }
                                            composer2.startReplaceGroup(-54029535);
                                            ComposerKt.sourceInformation(composer2, "*185@9580L18");
                                            jM5632getColor0d7_KjU = textStyle3.m5632getColor0d7_KjU();
                                            if (jM5632getColor0d7_KjU == 16) {
                                            }
                                            composer2.endReplaceGroup();
                                            TextStyle textStyleMerge2 = textStyle3.merge(new TextStyle(jM5632getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                            final TextFieldColors textFieldColors32 = textFieldColorsM2061textFieldColorsdx8h9Zs;
                                            final boolean z182 = z8;
                                            Modifier modifier42 = modifier2;
                                            final boolean z192 = z7;
                                            TextStyle textStyle62 = textStyle3;
                                            Modifier modifierM1049defaultMinSizeVpY3zN42 = SizeKt.m1049defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(TextFieldDefaults.m2049indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, modifier42, z182, z192, mutableInteractionSource3, textFieldColors32, 0.0f, 0.0f, 48, null), z192, Strings_androidKt.m2014getString4foXLRw(Strings.INSTANCE.m2009getDefaultErrorMessageUdPEhr4(), composer2, 6)), TextFieldDefaults.INSTANCE.m2056getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2055getMinHeightD9Ej5fM());
                                            Color value2 = textFieldColors32.cursorColor(z192, composer2, (i32 & 14) | ((i32 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).getValue();
                                            final MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                                            final boolean z202 = z10;
                                            final VisualTransformation visualTransformation42 = visualTransformation2;
                                            final Function2<? super Composer, ? super Integer, Unit> function2152 = function27;
                                            final Function2<? super Composer, ? super Integer, Unit> function2162 = function28;
                                            final Function2<? super Composer, ? super Integer, Unit> function2172 = function29;
                                            final Function2<? super Composer, ? super Integer, Unit> function2182 = function210;
                                            final Shape shape32 = textFieldShape;
                                            int i402 = i32 << 12;
                                            Composer composer42 = composer2;
                                            int i412 = i29;
                                            BasicTextFieldKt.BasicTextField(str, function1, modifierM1049defaultMinSizeVpY3zN42, z182, z9, textStyleMerge2, keyboardOptions2, keyboardActions3, z10, i31, i412, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource52, new SolidColor(value2.m3667unboximpl(), null), ComposableLambdaKt.rememberComposableLambda(989834338, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextField.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer5, Integer num) {
                                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Function2<? super Composer, ? super Integer, Unit> function219, Composer composer5, int i42) {
                                                    int i43;
                                                    ComposerKt.sourceInformation(composer5, "C213@10762L570:TextField.kt#jmzs0o");
                                                    if ((i42 & 6) == 0) {
                                                        i43 = i42 | (composer5.changedInstance(function219) ? 4 : 2);
                                                    } else {
                                                        i43 = i42;
                                                    }
                                                    if ((i43 & 19) != 18 || !composer5.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(989834338, i43, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:213)");
                                                        }
                                                        TextFieldDefaults.INSTANCE.TextFieldDecorationBox(str, function219, z182, z202, visualTransformation42, mutableInteractionSource52, z192, function2152, function2162, function2172, function2182, shape32, textFieldColors32, null, composer5, (i43 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 24576, 8192);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }, composer2, 54), composer42, (i30 & 64638) | (3670016 & i402) | (29360128 & i402) | (234881024 & i402) | (i402 & 1879048192), ((i32 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i32 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), 4096);
                                            composer3 = composer42;
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            VisualTransformation visualTransformation52 = visualTransformation2;
                                            z11 = z10;
                                            visualTransformation3 = visualTransformation52;
                                            textStyle4 = textStyle62;
                                            textFieldColors2 = textFieldColors32;
                                            z12 = z9;
                                            i33 = i31;
                                            i34 = i412;
                                            modifier3 = modifier42;
                                            z13 = z182;
                                            function211 = function27;
                                            function212 = function28;
                                            function213 = function29;
                                            mutableInteractionSource4 = mutableInteractionSource2;
                                            shape2 = textFieldShape;
                                            keyboardOptions3 = keyboardOptions2;
                                            keyboardActions4 = keyboardActions3;
                                            function214 = function210;
                                            z14 = z192;
                                        }
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup != null) {
                                    }
                                }
                                if ((i4 & 3072) == 0) {
                                }
                                int i362 = i22;
                                i23 = i5 & 16384;
                                if (i23 != 0) {
                                }
                                if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                }
                                i25 = i5 & 65536;
                                if (i25 != 0) {
                                }
                                i26 = i5 & 131072;
                                if (i26 != 0) {
                                }
                                if ((i4 & 100663296) == 0) {
                                }
                                if ((i4 & 805306368) == 0) {
                                }
                                int i3722 = i24;
                                if ((i6 & 306783379) != 306783378) {
                                }
                                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                }
                            }
                            i15 = i14;
                            i16 = i5 & 1024;
                            if (i16 != 0) {
                            }
                            i19 = i5 & 2048;
                            if (i19 != 0) {
                            }
                            int i352 = i18;
                            i21 = i5 & 4096;
                            if (i21 != 0) {
                            }
                            if ((i4 & 3072) == 0) {
                            }
                            int i3622 = i22;
                            i23 = i5 & 16384;
                            if (i23 != 0) {
                            }
                            if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            }
                            i25 = i5 & 65536;
                            if (i25 != 0) {
                            }
                            i26 = i5 & 131072;
                            if (i26 != 0) {
                            }
                            if ((i4 & 100663296) == 0) {
                            }
                            if ((i4 & 805306368) == 0) {
                            }
                            int i37222 = i24;
                            if ((i6 & 306783379) != 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i13 = i12;
                        i14 = i5 & 512;
                        if (i14 == 0) {
                        }
                        i15 = i14;
                        i16 = i5 & 1024;
                        if (i16 != 0) {
                        }
                        i19 = i5 & 2048;
                        if (i19 != 0) {
                        }
                        int i3522 = i18;
                        i21 = i5 & 4096;
                        if (i21 != 0) {
                        }
                        if ((i4 & 3072) == 0) {
                        }
                        int i36222 = i22;
                        i23 = i5 & 16384;
                        if (i23 != 0) {
                        }
                        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        }
                        i25 = i5 & 65536;
                        if (i25 != 0) {
                        }
                        i26 = i5 & 131072;
                        if (i26 != 0) {
                        }
                        if ((i4 & 100663296) == 0) {
                        }
                        if ((i4 & 805306368) == 0) {
                        }
                        int i372222 = i24;
                        if ((i6 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    z6 = z2;
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i10 = i5 & 64;
                    if (i10 != 0) {
                    }
                    i11 = i5 & 128;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i12;
                    i14 = i5 & 512;
                    if (i14 == 0) {
                    }
                    i15 = i14;
                    i16 = i5 & 1024;
                    if (i16 != 0) {
                    }
                    i19 = i5 & 2048;
                    if (i19 != 0) {
                    }
                    int i35222 = i18;
                    i21 = i5 & 4096;
                    if (i21 != 0) {
                    }
                    if ((i4 & 3072) == 0) {
                    }
                    int i362222 = i22;
                    i23 = i5 & 16384;
                    if (i23 != 0) {
                    }
                    if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i25 = i5 & 65536;
                    if (i25 != 0) {
                    }
                    i26 = i5 & 131072;
                    if (i26 != 0) {
                    }
                    if ((i4 & 100663296) == 0) {
                    }
                    if ((i4 & 805306368) == 0) {
                    }
                    int i3722222 = i24;
                    if ((i6 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z5 = z;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                z6 = z2;
                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                }
                i12 = i5 & 256;
                if (i12 != 0) {
                }
                i13 = i12;
                i14 = i5 & 512;
                if (i14 == 0) {
                }
                i15 = i14;
                i16 = i5 & 1024;
                if (i16 != 0) {
                }
                i19 = i5 & 2048;
                if (i19 != 0) {
                }
                int i352222 = i18;
                i21 = i5 & 4096;
                if (i21 != 0) {
                }
                if ((i4 & 3072) == 0) {
                }
                int i3622222 = i22;
                i23 = i5 & 16384;
                if (i23 != 0) {
                }
                if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i25 = i5 & 65536;
                if (i25 != 0) {
                }
                i26 = i5 & 131072;
                if (i26 != 0) {
                }
                if ((i4 & 100663296) == 0) {
                }
                if ((i4 & 805306368) == 0) {
                }
                int i37222222 = i24;
                if ((i6 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            z5 = z;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            z6 = z2;
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            i11 = i5 & 128;
            if (i11 != 0) {
            }
            i12 = i5 & 256;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i5 & 512;
            if (i14 == 0) {
            }
            i15 = i14;
            i16 = i5 & 1024;
            if (i16 != 0) {
            }
            i19 = i5 & 2048;
            if (i19 != 0) {
            }
            int i3522222 = i18;
            i21 = i5 & 4096;
            if (i21 != 0) {
            }
            if ((i4 & 3072) == 0) {
            }
            int i36222222 = i22;
            i23 = i5 & 16384;
            if (i23 != 0) {
            }
            if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i25 = i5 & 65536;
            if (i25 != 0) {
            }
            i26 = i5 & 131072;
            if (i26 != 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            if ((i4 & 805306368) == 0) {
            }
            int i372222222 = i24;
            if ((i6 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        z5 = z;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        z6 = z2;
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        i11 = i5 & 128;
        if (i11 != 0) {
        }
        i12 = i5 & 256;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i5 & 512;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i5 & 1024;
        if (i16 != 0) {
        }
        i19 = i5 & 2048;
        if (i19 != 0) {
        }
        int i35222222 = i18;
        i21 = i5 & 4096;
        if (i21 != 0) {
        }
        if ((i4 & 3072) == 0) {
        }
        int i362222222 = i22;
        i23 = i5 & 16384;
        if (i23 != 0) {
        }
        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i25 = i5 & 65536;
        if (i25 != 0) {
        }
        i26 = i5 & 131072;
        if (i26 != 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        int i3722222222 = i24;
        if ((i6 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:300:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0111  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void TextField(final String str, final Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        Modifier modifier2;
        int i7;
        boolean z5;
        int i8;
        boolean z6;
        TextStyle textStyle2;
        int i9;
        Function2 function25;
        int i10;
        Function2 function26;
        int i11;
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
        TextStyle textStyle3;
        int i27;
        KeyboardActions keyboardActions2;
        MutableInteractionSource mutableInteractionSource2;
        Shape shapeCopy$default;
        Composer composer2;
        TextFieldColors textFieldColorsM2061textFieldColorsdx8h9Zs;
        KeyboardActions keyboardActions3;
        Modifier modifier3;
        boolean z7;
        boolean z8;
        int i28;
        Function2 function27;
        Function2 function28;
        Function2 function29;
        boolean z9;
        VisualTransformation visualTransformation2;
        KeyboardOptions keyboardOptions2;
        boolean z10;
        int i29;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape2;
        final Modifier modifier4;
        final boolean z11;
        final boolean z12;
        final TextStyle textStyle4;
        final Function2 function210;
        final Function2 function211;
        final Function2 function212;
        final Function2 function213;
        final boolean z13;
        final VisualTransformation visualTransformation3;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions4;
        final boolean z14;
        final int i30;
        final MutableInteractionSource mutableInteractionSource4;
        final Shape shape3;
        final TextFieldColors textFieldColors2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1690895095);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)243@11701L7,254@12255L39,256@12337L6,257@12462L17,259@12488L408:TextField.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    modifier2 = modifier;
                    i5 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        z5 = z;
                        i5 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            z6 = z2;
                            i5 |= composerStartRestartGroup.changed(z6) ? 16384 : 8192;
                        }
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            textStyle2 = textStyle;
                            i5 |= ((i4 & 32) == 0 && composerStartRestartGroup.changed(textStyle2)) ? 131072 : 65536;
                        } else {
                            textStyle2 = textStyle;
                        }
                        i9 = i4 & 64;
                        if (i9 != 0) {
                            i5 |= 1572864;
                            function25 = function2;
                        } else {
                            function25 = function2;
                            if ((i2 & 1572864) == 0) {
                                i5 |= composerStartRestartGroup.changedInstance(function25) ? 1048576 : 524288;
                            }
                        }
                        i10 = i4 & 128;
                        if (i10 != 0) {
                            i5 |= 12582912;
                            function26 = function22;
                        } else {
                            function26 = function22;
                            if ((i2 & 12582912) == 0) {
                                i5 |= composerStartRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
                            }
                        }
                        i11 = i4 & 256;
                        if (i11 != 0) {
                            i5 |= 100663296;
                        } else {
                            if ((i2 & 100663296) == 0) {
                                i12 = i11;
                                i5 |= composerStartRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            i13 = i4 & 512;
                            if (i13 == 0) {
                                i5 |= 805306368;
                            } else {
                                if ((i2 & 805306368) == 0) {
                                    i14 = i13;
                                    i5 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                                }
                                i15 = i4 & 1024;
                                if (i15 != 0) {
                                    i17 = i3 | 6;
                                    i16 = i15;
                                } else if ((i3 & 6) == 0) {
                                    i16 = i15;
                                    i17 = i3 | (composerStartRestartGroup.changed(z3) ? 4 : 2);
                                } else {
                                    i16 = i15;
                                    i17 = i3;
                                }
                                i18 = i4 & 2048;
                                if (i18 != 0) {
                                    i17 |= 48;
                                    i19 = i18;
                                } else if ((i3 & 48) == 0) {
                                    i19 = i18;
                                    i17 |= composerStartRestartGroup.changed(visualTransformation) ? 32 : 16;
                                } else {
                                    i19 = i18;
                                }
                                int i31 = i17;
                                i20 = i4 & 4096;
                                if (i20 != 0) {
                                    i21 = i31 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                                } else {
                                    i21 = i31;
                                    if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                        i21 |= composerStartRestartGroup.changed(keyboardOptions) ? 256 : 128;
                                    }
                                    if ((i3 & 3072) == 0) {
                                        i21 |= ((i4 & 8192) == 0 && composerStartRestartGroup.changed(keyboardActions)) ? 2048 : 1024;
                                    }
                                    int i32 = i21;
                                    i22 = i4 & 16384;
                                    if (i22 != 0) {
                                        i23 = i32;
                                        if ((i3 & 24576) == 0) {
                                            i23 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                                        }
                                        i24 = i4 & 32768;
                                        if (i24 != 0) {
                                            i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                        } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                            i23 |= composerStartRestartGroup.changed(i) ? 131072 : 65536;
                                        }
                                        i25 = i4 & 65536;
                                        if (i25 != 0) {
                                            i23 |= 1572864;
                                        } else if ((i3 & 1572864) == 0) {
                                            i23 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                                        }
                                        if ((i3 & 12582912) == 0) {
                                            i23 |= ((i4 & 131072) == 0 && composerStartRestartGroup.changed(shape)) ? 8388608 : 4194304;
                                        }
                                        if ((i3 & 100663296) == 0) {
                                            i23 |= ((i4 & 262144) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                        }
                                        i26 = i23;
                                        if ((i5 & 306783379) != 306783378 || (38347923 & i26) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                                            composerStartRestartGroup.startDefaults();
                                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                                Modifier.Companion companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                                                boolean z15 = i7 == 0 ? true : z5;
                                                boolean z16 = i8 == 0 ? false : z6;
                                                if ((i4 & 32) == 0) {
                                                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                    Object objConsume = composerStartRestartGroup.consume(localTextStyle);
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    i5 &= -458753;
                                                    textStyle3 = (TextStyle) objConsume;
                                                } else {
                                                    textStyle3 = textStyle2;
                                                }
                                                int i33 = i5;
                                                Function2 function214 = i9 == 0 ? null : function25;
                                                Function2 function215 = i10 == 0 ? null : function26;
                                                Function2 function216 = i12 == 0 ? null : function23;
                                                Function2 function217 = i14 == 0 ? null : function24;
                                                boolean z17 = i16 == 0 ? false : z3;
                                                VisualTransformation none = i19 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                                KeyboardOptions keyboardOptions4 = i20 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                                if ((i4 & 8192) == 0) {
                                                    i27 = i26 & (-7169);
                                                    keyboardActions2 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                                } else {
                                                    i27 = i26;
                                                    keyboardActions2 = keyboardActions;
                                                }
                                                boolean z18 = i22 == 0 ? false : z4;
                                                int i34 = i24 == 0 ? Integer.MAX_VALUE : i;
                                                if (i25 == 0) {
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -53943058, "CC(remember):TextField.kt#9igjgp");
                                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                                } else {
                                                    mutableInteractionSource2 = mutableInteractionSource;
                                                }
                                                if ((i4 & 131072) == 0) {
                                                    i27 &= -29360129;
                                                    shapeCopy$default = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
                                                } else {
                                                    shapeCopy$default = shape;
                                                }
                                                int i35 = i27;
                                                if ((262144 & i4) == 0) {
                                                    composer2 = composerStartRestartGroup;
                                                    keyboardActions3 = keyboardActions2;
                                                    modifier3 = companion;
                                                    textFieldColorsM2061textFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m2061textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 0, 0, 48, 2097151);
                                                    i26 = i35 & (-234881025);
                                                    z7 = z15;
                                                    z8 = z16;
                                                    textStyle2 = textStyle3;
                                                    i28 = i33;
                                                    function25 = function214;
                                                    function27 = function215;
                                                    function28 = function216;
                                                    function29 = function217;
                                                    z9 = z17;
                                                    visualTransformation2 = none;
                                                    keyboardOptions2 = keyboardOptions4;
                                                    z10 = z18;
                                                    i29 = i34;
                                                    mutableInteractionSource3 = mutableInteractionSource2;
                                                    shape2 = shapeCopy$default;
                                                } else {
                                                    composer2 = composerStartRestartGroup;
                                                    textFieldColorsM2061textFieldColorsdx8h9Zs = textFieldColors;
                                                    keyboardActions3 = keyboardActions2;
                                                    modifier3 = companion;
                                                    z7 = z15;
                                                    z8 = z16;
                                                    textStyle2 = textStyle3;
                                                    i28 = i33;
                                                    function25 = function214;
                                                    function27 = function215;
                                                    function28 = function216;
                                                    function29 = function217;
                                                    z9 = z17;
                                                    visualTransformation2 = none;
                                                    keyboardOptions2 = keyboardOptions4;
                                                    z10 = z18;
                                                    i29 = i34;
                                                    mutableInteractionSource3 = mutableInteractionSource2;
                                                    shape2 = shapeCopy$default;
                                                    i26 = i35;
                                                }
                                            } else {
                                                composerStartRestartGroup.skipToGroupEnd();
                                                if ((i4 & 32) != 0) {
                                                    i5 &= -458753;
                                                }
                                                if ((i4 & 8192) != 0) {
                                                    i26 &= -7169;
                                                }
                                                if ((i4 & 131072) != 0) {
                                                    i26 &= -29360129;
                                                }
                                                if ((262144 & i4) != 0) {
                                                    i26 &= -234881025;
                                                }
                                                function28 = function23;
                                                visualTransformation2 = visualTransformation;
                                                keyboardOptions2 = keyboardOptions;
                                                keyboardActions3 = keyboardActions;
                                                z10 = z4;
                                                i29 = i;
                                                mutableInteractionSource3 = mutableInteractionSource;
                                                shape2 = shape;
                                                textFieldColorsM2061textFieldColorsdx8h9Zs = textFieldColors;
                                                composer2 = composerStartRestartGroup;
                                                z8 = z6;
                                                i28 = i5;
                                                function27 = function26;
                                                modifier3 = modifier2;
                                                function29 = function24;
                                                z9 = z3;
                                                z7 = z5;
                                            }
                                            composer2.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1690895095, i28, i26, "androidx.compose.material.TextField (TextField.kt:258)");
                                            }
                                            int i36 = i28 & 2147483646;
                                            int i37 = (i26 & 14) | 1572864 | (i26 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (458752 & i26);
                                            int i38 = i26 << 3;
                                            TextField(str, (Function1<? super String, Unit>) function1, modifier3, z7, z8, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function25, (Function2<? super Composer, ? super Integer, Unit>) function27, (Function2<? super Composer, ? super Integer, Unit>) function28, (Function2<? super Composer, ? super Integer, Unit>) function29, z9, visualTransformation2, keyboardOptions2, keyboardActions3, z10, i29, 1, mutableInteractionSource3, shape2, textFieldColorsM2061textFieldColorsdx8h9Zs, composer2, i36, i37 | (29360128 & i38) | (234881024 & i38) | (i38 & 1879048192), 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            modifier4 = modifier3;
                                            z11 = z7;
                                            z12 = z8;
                                            textStyle4 = textStyle2;
                                            function210 = function25;
                                            function211 = function27;
                                            function212 = function28;
                                            function213 = function29;
                                            z13 = z9;
                                            visualTransformation3 = visualTransformation2;
                                            keyboardOptions3 = keyboardOptions2;
                                            keyboardActions4 = keyboardActions3;
                                            z14 = z10;
                                            i30 = i29;
                                            mutableInteractionSource4 = mutableInteractionSource3;
                                            shape3 = shape2;
                                            textFieldColors2 = textFieldColorsM2061textFieldColorsdx8h9Zs;
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            z13 = z3;
                                            visualTransformation3 = visualTransformation;
                                            z14 = z4;
                                            i30 = i;
                                            mutableInteractionSource4 = mutableInteractionSource;
                                            shape3 = shape;
                                            textFieldColors2 = textFieldColors;
                                            composer2 = composerStartRestartGroup;
                                            z11 = z5;
                                            z12 = z6;
                                            textStyle4 = textStyle2;
                                            function210 = function25;
                                            function211 = function26;
                                            modifier4 = modifier2;
                                            function212 = function23;
                                            function213 = function24;
                                            keyboardOptions3 = keyboardOptions;
                                            keyboardActions4 = keyboardActions;
                                        }
                                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                        if (scopeUpdateScopeEndRestartGroup != null) {
                                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextField.4
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    invoke(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer3, int i39) {
                                                    TextFieldKt.TextField(str, function1, modifier4, z11, z12, textStyle4, function210, function211, function212, function213, z13, visualTransformation3, keyboardOptions3, keyboardActions4, z14, i30, mutableInteractionSource4, shape3, textFieldColors2, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i23 = i32 | 24576;
                                    i24 = i4 & 32768;
                                    if (i24 != 0) {
                                    }
                                    i25 = i4 & 65536;
                                    if (i25 != 0) {
                                    }
                                    if ((i3 & 12582912) == 0) {
                                    }
                                    if ((i3 & 100663296) == 0) {
                                    }
                                    i26 = i23;
                                    if ((i5 & 306783379) != 306783378) {
                                        composerStartRestartGroup.startDefaults();
                                        if ((i2 & 1) != 0) {
                                            if (i6 == 0) {
                                            }
                                            if (i7 == 0) {
                                            }
                                            if (i8 == 0) {
                                            }
                                            if ((i4 & 32) == 0) {
                                            }
                                            int i332 = i5;
                                            if (i9 == 0) {
                                            }
                                            if (i10 == 0) {
                                            }
                                            if (i12 == 0) {
                                            }
                                            if (i14 == 0) {
                                            }
                                            if (i16 == 0) {
                                            }
                                            if (i19 == 0) {
                                            }
                                            if (i20 == 0) {
                                            }
                                            if ((i4 & 8192) == 0) {
                                            }
                                            if (i22 == 0) {
                                            }
                                            if (i24 == 0) {
                                            }
                                            if (i25 == 0) {
                                            }
                                            if ((i4 & 131072) == 0) {
                                            }
                                            int i352 = i27;
                                            if ((262144 & i4) == 0) {
                                            }
                                            composer2.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            int i362 = i28 & 2147483646;
                                            int i372 = (i26 & 14) | 1572864 | (i26 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (458752 & i26);
                                            int i382 = i26 << 3;
                                            TextField(str, (Function1<? super String, Unit>) function1, modifier3, z7, z8, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function25, (Function2<? super Composer, ? super Integer, Unit>) function27, (Function2<? super Composer, ? super Integer, Unit>) function28, (Function2<? super Composer, ? super Integer, Unit>) function29, z9, visualTransformation2, keyboardOptions2, keyboardActions3, z10, i29, 1, mutableInteractionSource3, shape2, textFieldColorsM2061textFieldColorsdx8h9Zs, composer2, i362, i372 | (29360128 & i382) | (234881024 & i382) | (i382 & 1879048192), 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            modifier4 = modifier3;
                                            z11 = z7;
                                            z12 = z8;
                                            textStyle4 = textStyle2;
                                            function210 = function25;
                                            function211 = function27;
                                            function212 = function28;
                                            function213 = function29;
                                            z13 = z9;
                                            visualTransformation3 = visualTransformation2;
                                            keyboardOptions3 = keyboardOptions2;
                                            keyboardActions4 = keyboardActions3;
                                            z14 = z10;
                                            i30 = i29;
                                            mutableInteractionSource4 = mutableInteractionSource3;
                                            shape3 = shape2;
                                            textFieldColors2 = textFieldColorsM2061textFieldColorsdx8h9Zs;
                                        }
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup != null) {
                                    }
                                }
                                if ((i3 & 3072) == 0) {
                                }
                                int i322 = i21;
                                i22 = i4 & 16384;
                                if (i22 != 0) {
                                }
                                i24 = i4 & 32768;
                                if (i24 != 0) {
                                }
                                i25 = i4 & 65536;
                                if (i25 != 0) {
                                }
                                if ((i3 & 12582912) == 0) {
                                }
                                if ((i3 & 100663296) == 0) {
                                }
                                i26 = i23;
                                if ((i5 & 306783379) != 306783378) {
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                }
                            }
                            i14 = i13;
                            i15 = i4 & 1024;
                            if (i15 != 0) {
                            }
                            i18 = i4 & 2048;
                            if (i18 != 0) {
                            }
                            int i312 = i17;
                            i20 = i4 & 4096;
                            if (i20 != 0) {
                            }
                            if ((i3 & 3072) == 0) {
                            }
                            int i3222 = i21;
                            i22 = i4 & 16384;
                            if (i22 != 0) {
                            }
                            i24 = i4 & 32768;
                            if (i24 != 0) {
                            }
                            i25 = i4 & 65536;
                            if (i25 != 0) {
                            }
                            if ((i3 & 12582912) == 0) {
                            }
                            if ((i3 & 100663296) == 0) {
                            }
                            i26 = i23;
                            if ((i5 & 306783379) != 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i12 = i11;
                        i13 = i4 & 512;
                        if (i13 == 0) {
                        }
                        i14 = i13;
                        i15 = i4 & 1024;
                        if (i15 != 0) {
                        }
                        i18 = i4 & 2048;
                        if (i18 != 0) {
                        }
                        int i3122 = i17;
                        i20 = i4 & 4096;
                        if (i20 != 0) {
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        int i32222 = i21;
                        i22 = i4 & 16384;
                        if (i22 != 0) {
                        }
                        i24 = i4 & 32768;
                        if (i24 != 0) {
                        }
                        i25 = i4 & 65536;
                        if (i25 != 0) {
                        }
                        if ((i3 & 12582912) == 0) {
                        }
                        if ((i3 & 100663296) == 0) {
                        }
                        i26 = i23;
                        if ((i5 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    z6 = z2;
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i9 = i4 & 64;
                    if (i9 != 0) {
                    }
                    i10 = i4 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 256;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    i13 = i4 & 512;
                    if (i13 == 0) {
                    }
                    i14 = i13;
                    i15 = i4 & 1024;
                    if (i15 != 0) {
                    }
                    i18 = i4 & 2048;
                    if (i18 != 0) {
                    }
                    int i31222 = i17;
                    i20 = i4 & 4096;
                    if (i20 != 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    int i322222 = i21;
                    i22 = i4 & 16384;
                    if (i22 != 0) {
                    }
                    i24 = i4 & 32768;
                    if (i24 != 0) {
                    }
                    i25 = i4 & 65536;
                    if (i25 != 0) {
                    }
                    if ((i3 & 12582912) == 0) {
                    }
                    if ((i3 & 100663296) == 0) {
                    }
                    i26 = i23;
                    if ((i5 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z5 = z;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                z6 = z2;
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                }
                i10 = i4 & 128;
                if (i10 != 0) {
                }
                i11 = i4 & 256;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i4 & 512;
                if (i13 == 0) {
                }
                i14 = i13;
                i15 = i4 & 1024;
                if (i15 != 0) {
                }
                i18 = i4 & 2048;
                if (i18 != 0) {
                }
                int i312222 = i17;
                i20 = i4 & 4096;
                if (i20 != 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                int i3222222 = i21;
                i22 = i4 & 16384;
                if (i22 != 0) {
                }
                i24 = i4 & 32768;
                if (i24 != 0) {
                }
                i25 = i4 & 65536;
                if (i25 != 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                if ((i3 & 100663296) == 0) {
                }
                i26 = i23;
                if ((i5 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            z5 = z;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            z6 = z2;
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i9 = i4 & 64;
            if (i9 != 0) {
            }
            i10 = i4 & 128;
            if (i10 != 0) {
            }
            i11 = i4 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i4 & 512;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i4 & 1024;
            if (i15 != 0) {
            }
            i18 = i4 & 2048;
            if (i18 != 0) {
            }
            int i3122222 = i17;
            i20 = i4 & 4096;
            if (i20 != 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            int i32222222 = i21;
            i22 = i4 & 16384;
            if (i22 != 0) {
            }
            i24 = i4 & 32768;
            if (i24 != 0) {
            }
            i25 = i4 & 65536;
            if (i25 != 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            if ((i3 & 100663296) == 0) {
            }
            i26 = i23;
            if ((i5 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        modifier2 = modifier;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        z5 = z;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        z6 = z2;
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i9 = i4 & 64;
        if (i9 != 0) {
        }
        i10 = i4 & 128;
        if (i10 != 0) {
        }
        i11 = i4 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i4 & 512;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i4 & 1024;
        if (i15 != 0) {
        }
        i18 = i4 & 2048;
        if (i18 != 0) {
        }
        int i31222222 = i17;
        i20 = i4 & 4096;
        if (i20 != 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        int i322222222 = i21;
        i22 = i4 & 16384;
        if (i22 != 0) {
        }
        i24 = i4 & 32768;
        if (i24 != 0) {
        }
        i25 = i4 & 65536;
        if (i25 != 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        if ((i3 & 100663296) == 0) {
        }
        i26 = i23;
        if ((i5 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:326:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextField(final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
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
        Function2<? super Composer, ? super Integer, Unit> function27;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Function2<? super Composer, ? super Integer, Unit> function210;
        boolean z7;
        int i27;
        KeyboardActions keyboardActions2;
        int i28;
        int i29;
        MutableInteractionSource mutableInteractionSource2;
        Shape textFieldShape;
        Composer composer2;
        TextFieldColors textFieldColorsM2061textFieldColorsdx8h9Zs;
        KeyboardActions keyboardActions3;
        boolean z8;
        boolean z9;
        TextStyle textStyle3;
        int i30;
        VisualTransformation visualTransformation2;
        KeyboardOptions keyboardOptions2;
        boolean z10;
        int i31;
        int i32;
        MutableInteractionSource mutableInteractionSource3;
        long jM5632getColor0d7_KjU;
        Composer composer3;
        final boolean z11;
        final VisualTransformation visualTransformation3;
        final TextStyle textStyle4;
        final TextFieldColors textFieldColors2;
        final boolean z12;
        final int i33;
        final int i34;
        final Modifier modifier3;
        final boolean z13;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final MutableInteractionSource mutableInteractionSource4;
        final Shape shape2;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions4;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final boolean z14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-359119489);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TextField)P(18,11,10,1,13,16,6,12,7,17,3,19,5,4,15,8,9,2,14)356@17778L7,369@18422L14,370@18486L17,385@19110L38,394@19477L20,402@19819L724,381@18927L1622:TextField.kt#jmzs0o");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(textFieldValue) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i6 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    modifier2 = modifier;
                    i6 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        z5 = z;
                        i6 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
                    }
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else {
                        if ((i3 & 24576) == 0) {
                            z6 = z2;
                            i6 |= composerStartRestartGroup.changed(z6) ? 16384 : 8192;
                        }
                        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            textStyle2 = textStyle;
                            i6 |= ((i5 & 32) == 0 && composerStartRestartGroup.changed(textStyle2)) ? 131072 : 65536;
                        } else {
                            textStyle2 = textStyle;
                        }
                        i10 = i5 & 64;
                        if (i10 != 0) {
                            i6 |= 1572864;
                            function25 = function2;
                        } else {
                            function25 = function2;
                            if ((i3 & 1572864) == 0) {
                                i6 |= composerStartRestartGroup.changedInstance(function25) ? 1048576 : 524288;
                            }
                        }
                        i11 = i5 & 128;
                        if (i11 != 0) {
                            i6 |= 12582912;
                            function26 = function22;
                        } else {
                            function26 = function22;
                            if ((i3 & 12582912) == 0) {
                                i6 |= composerStartRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
                            }
                        }
                        i12 = i5 & 256;
                        if (i12 != 0) {
                            i6 |= 100663296;
                        } else {
                            if ((i3 & 100663296) == 0) {
                                i13 = i12;
                                i6 |= composerStartRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            i14 = i5 & 512;
                            if (i14 == 0) {
                                i6 |= 805306368;
                            } else {
                                if ((i3 & 805306368) == 0) {
                                    i15 = i14;
                                    i6 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                                }
                                i16 = i5 & 1024;
                                if (i16 != 0) {
                                    i18 = i4 | 6;
                                    i17 = i16;
                                } else if ((i4 & 6) == 0) {
                                    i17 = i16;
                                    i18 = i4 | (composerStartRestartGroup.changed(z3) ? 4 : 2);
                                } else {
                                    i17 = i16;
                                    i18 = i4;
                                }
                                i19 = i5 & 2048;
                                if (i19 != 0) {
                                    i18 |= 48;
                                    i20 = i19;
                                } else if ((i4 & 48) == 0) {
                                    i20 = i19;
                                    i18 |= composerStartRestartGroup.changed(visualTransformation) ? 32 : 16;
                                } else {
                                    i20 = i19;
                                }
                                int i35 = i18;
                                i21 = i5 & 4096;
                                if (i21 != 0) {
                                    i22 = i35 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                                } else {
                                    i22 = i35;
                                    if ((i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                        i22 |= composerStartRestartGroup.changed(keyboardOptions) ? 256 : 128;
                                    }
                                    if ((i4 & 3072) == 0) {
                                        i22 |= ((i5 & 8192) == 0 && composerStartRestartGroup.changed(keyboardActions)) ? 2048 : 1024;
                                    }
                                    int i36 = i22;
                                    i23 = i5 & 16384;
                                    if (i23 != 0) {
                                        i24 = i36;
                                        if ((i4 & 24576) == 0) {
                                            i24 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                                        }
                                        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                            i24 |= ((i5 & 32768) == 0 && composerStartRestartGroup.changed(i)) ? 131072 : 65536;
                                        }
                                        i25 = i5 & 65536;
                                        if (i25 != 0) {
                                            i24 |= 1572864;
                                        } else if ((i4 & 1572864) == 0) {
                                            i24 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
                                        }
                                        i26 = i5 & 131072;
                                        if (i26 != 0) {
                                            i24 |= 12582912;
                                        } else if ((i4 & 12582912) == 0) {
                                            i24 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                                        }
                                        if ((i4 & 100663296) == 0) {
                                            i24 |= ((i5 & 262144) == 0 && composerStartRestartGroup.changed(shape)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                        }
                                        if ((i4 & 805306368) == 0) {
                                            i24 |= ((i5 & 524288) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 536870912 : 268435456;
                                        }
                                        int i37 = i24;
                                        if ((i6 & 306783379) != 306783378 || (306783379 & i37) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                                            composerStartRestartGroup.startDefaults();
                                            if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                                Modifier.Companion companion = i7 == 0 ? Modifier.INSTANCE : modifier2;
                                                boolean z15 = i8 == 0 ? true : z;
                                                boolean z16 = i9 == 0 ? false : z2;
                                                if ((i5 & 32) != 0) {
                                                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                    Object objConsume = composerStartRestartGroup.consume(localTextStyle);
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    textStyle2 = (TextStyle) objConsume;
                                                    i6 &= -458753;
                                                }
                                                int i38 = i6;
                                                TextStyle textStyle5 = textStyle2;
                                                function27 = i10 == 0 ? null : function25;
                                                function28 = i11 == 0 ? null : function26;
                                                function29 = i13 == 0 ? null : function23;
                                                function210 = i15 == 0 ? null : function24;
                                                z7 = i17 == 0 ? false : z3;
                                                VisualTransformation none = i20 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                                KeyboardOptions keyboardOptions4 = i21 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                                if ((i5 & 8192) == 0) {
                                                    i27 = i37 & (-7169);
                                                    keyboardActions2 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                                } else {
                                                    i27 = i37;
                                                    keyboardActions2 = keyboardActions;
                                                }
                                                boolean z17 = i23 == 0 ? false : z4;
                                                if ((32768 & i5) == 0) {
                                                    i27 &= -458753;
                                                    i28 = z17 ? 1 : Integer.MAX_VALUE;
                                                } else {
                                                    i28 = i;
                                                }
                                                i29 = i25 == 0 ? 1 : i2;
                                                mutableInteractionSource2 = i26 == 0 ? null : mutableInteractionSource;
                                                if ((262144 & i5) == 0) {
                                                    i27 &= -234881025;
                                                    textFieldShape = TextFieldDefaults.INSTANCE.getTextFieldShape(composerStartRestartGroup, 6);
                                                } else {
                                                    textFieldShape = shape;
                                                }
                                                int i39 = i27;
                                                if ((i5 & 524288) == 0) {
                                                    textFieldColorsM2061textFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m2061textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 48, 2097151);
                                                    composer2 = composerStartRestartGroup;
                                                    i32 = i39 & (-1879048193);
                                                    keyboardActions3 = keyboardActions2;
                                                    modifier2 = companion;
                                                    z8 = z15;
                                                    z9 = z16;
                                                    textStyle3 = textStyle5;
                                                    i30 = i38;
                                                    visualTransformation2 = none;
                                                    keyboardOptions2 = keyboardOptions4;
                                                    z10 = z17;
                                                    i31 = i28;
                                                } else {
                                                    composer2 = composerStartRestartGroup;
                                                    textFieldColorsM2061textFieldColorsdx8h9Zs = textFieldColors;
                                                    keyboardActions3 = keyboardActions2;
                                                    modifier2 = companion;
                                                    z8 = z15;
                                                    z9 = z16;
                                                    textStyle3 = textStyle5;
                                                    i30 = i38;
                                                    visualTransformation2 = none;
                                                    keyboardOptions2 = keyboardOptions4;
                                                    z10 = z17;
                                                    i31 = i28;
                                                    i32 = i39;
                                                }
                                            } else {
                                                composerStartRestartGroup.skipToGroupEnd();
                                                if ((i5 & 32) != 0) {
                                                    i6 &= -458753;
                                                }
                                                if ((i5 & 8192) != 0) {
                                                    i37 &= -7169;
                                                }
                                                if ((32768 & i5) != 0) {
                                                    i37 &= -458753;
                                                }
                                                if ((262144 & i5) != 0) {
                                                    i37 &= -234881025;
                                                }
                                                if ((i5 & 524288) != 0) {
                                                    i37 &= -1879048193;
                                                }
                                                composer2 = composerStartRestartGroup;
                                                z9 = z2;
                                                function29 = function23;
                                                function210 = function24;
                                                z7 = z3;
                                                visualTransformation2 = visualTransformation;
                                                keyboardActions3 = keyboardActions;
                                                z10 = z4;
                                                i29 = i2;
                                                mutableInteractionSource2 = mutableInteractionSource;
                                                textFieldShape = shape;
                                                textFieldColorsM2061textFieldColorsdx8h9Zs = textFieldColors;
                                                i32 = i37;
                                                i30 = i6;
                                                textStyle3 = textStyle2;
                                                function27 = function25;
                                                function28 = function26;
                                                z8 = z;
                                                keyboardOptions2 = keyboardOptions;
                                                i31 = i;
                                            }
                                            composer2.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-359119489, i30, i32, "androidx.compose.material.TextField (TextField.kt:371)");
                                            }
                                            if (mutableInteractionSource2 != null) {
                                                composer2.startReplaceGroup(-1665951468);
                                                ComposerKt.sourceInformation(composer2, "373@18589L39");
                                                ComposerKt.sourceInformationMarkerStart(composer2, -53740370, "CC(remember):TextField.kt#9igjgp");
                                                Object objRememberedValue = composer2.rememberedValue();
                                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                    composer2.updateRememberedValue(objRememberedValue);
                                                }
                                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                composer2.endReplaceGroup();
                                            } else {
                                                composer2.startReplaceGroup(-53741021);
                                                composer2.endReplaceGroup();
                                                mutableInteractionSource3 = mutableInteractionSource2;
                                            }
                                            composer2.startReplaceGroup(-53735263);
                                            ComposerKt.sourceInformation(composer2, "*376@18776L18");
                                            jM5632getColor0d7_KjU = textStyle3.m5632getColor0d7_KjU();
                                            if (jM5632getColor0d7_KjU == 16) {
                                                jM5632getColor0d7_KjU = textFieldColorsM2061textFieldColorsdx8h9Zs.textColor(z8, composer2, ((i30 >> 9) & 14) | ((i32 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).getValue().m3667unboximpl();
                                            }
                                            composer2.endReplaceGroup();
                                            TextStyle textStyleMerge = textStyle3.merge(new TextStyle(jM5632getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                            final TextFieldColors textFieldColors3 = textFieldColorsM2061textFieldColorsdx8h9Zs;
                                            final boolean z18 = z8;
                                            Modifier modifier4 = modifier2;
                                            final boolean z19 = z7;
                                            TextStyle textStyle6 = textStyle3;
                                            Modifier modifierM1049defaultMinSizeVpY3zN4 = SizeKt.m1049defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(TextFieldDefaults.m2049indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, modifier4, z18, z19, mutableInteractionSource3, textFieldColors3, 0.0f, 0.0f, 48, null), z19, Strings_androidKt.m2014getString4foXLRw(Strings.INSTANCE.m2009getDefaultErrorMessageUdPEhr4(), composer2, 6)), TextFieldDefaults.INSTANCE.m2056getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2055getMinHeightD9Ej5fM());
                                            Color value = textFieldColors3.cursorColor(z19, composer2, (i32 & 14) | ((i32 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).getValue();
                                            final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                                            final boolean z20 = z10;
                                            final VisualTransformation visualTransformation4 = visualTransformation2;
                                            final Function2<? super Composer, ? super Integer, Unit> function215 = function27;
                                            final Function2<? super Composer, ? super Integer, Unit> function216 = function28;
                                            final Function2<? super Composer, ? super Integer, Unit> function217 = function29;
                                            final Function2<? super Composer, ? super Integer, Unit> function218 = function210;
                                            final Shape shape3 = textFieldShape;
                                            int i40 = i32 << 12;
                                            Composer composer4 = composer2;
                                            int i41 = i29;
                                            BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifierM1049defaultMinSizeVpY3zN4, z18, z9, textStyleMerge, keyboardOptions2, keyboardActions3, z10, i31, i41, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, new SolidColor(value.m3667unboximpl(), null), ComposableLambdaKt.rememberComposableLambda(-126640971, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextField.5
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer5, Integer num) {
                                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Function2<? super Composer, ? super Integer, Unit> function219, Composer composer5, int i42) {
                                                    int i43;
                                                    ComposerKt.sourceInformation(composer5, "C404@19958L575:TextField.kt#jmzs0o");
                                                    if ((i42 & 6) == 0) {
                                                        i43 = i42 | (composer5.changedInstance(function219) ? 4 : 2);
                                                    } else {
                                                        i43 = i42;
                                                    }
                                                    if ((i43 & 19) != 18 || !composer5.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-126640971, i43, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:404)");
                                                        }
                                                        TextFieldDefaults.INSTANCE.TextFieldDecorationBox(textFieldValue.getText(), function219, z18, z20, visualTransformation4, mutableInteractionSource5, z19, function215, function216, function217, function218, shape3, textFieldColors3, null, composer5, (i43 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 24576, 8192);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }, composer2, 54), composer4, (i30 & 64638) | (3670016 & i40) | (29360128 & i40) | (234881024 & i40) | (i40 & 1879048192), ((i32 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i32 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), 4096);
                                            composer3 = composer4;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            VisualTransformation visualTransformation5 = visualTransformation2;
                                            z11 = z10;
                                            visualTransformation3 = visualTransformation5;
                                            textStyle4 = textStyle6;
                                            textFieldColors2 = textFieldColors3;
                                            z12 = z9;
                                            i33 = i31;
                                            i34 = i41;
                                            modifier3 = modifier4;
                                            z13 = z18;
                                            function211 = function27;
                                            function212 = function28;
                                            function213 = function29;
                                            mutableInteractionSource4 = mutableInteractionSource2;
                                            shape2 = textFieldShape;
                                            keyboardOptions3 = keyboardOptions2;
                                            keyboardActions4 = keyboardActions3;
                                            function214 = function210;
                                            z14 = z19;
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            z14 = z3;
                                            visualTransformation3 = visualTransformation;
                                            z11 = z4;
                                            i33 = i;
                                            i34 = i2;
                                            mutableInteractionSource4 = mutableInteractionSource;
                                            shape2 = shape;
                                            textFieldColors2 = textFieldColors;
                                            composer3 = composerStartRestartGroup;
                                            z13 = z5;
                                            z12 = z6;
                                            textStyle4 = textStyle2;
                                            function211 = function25;
                                            function212 = function26;
                                            modifier3 = modifier2;
                                            function213 = function23;
                                            function214 = function24;
                                            keyboardOptions3 = keyboardOptions;
                                            keyboardActions4 = keyboardActions;
                                        }
                                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                                        if (scopeUpdateScopeEndRestartGroup != null) {
                                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextField.6
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer5, int i42) {
                                                    TextFieldKt.TextField(textFieldValue, function1, modifier3, z13, z12, textStyle4, function211, function212, function213, function214, z14, visualTransformation3, keyboardOptions3, keyboardActions4, z11, i33, i34, mutableInteractionSource4, shape2, textFieldColors2, composer5, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i24 = i36 | 24576;
                                    if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    }
                                    i25 = i5 & 65536;
                                    if (i25 != 0) {
                                    }
                                    i26 = i5 & 131072;
                                    if (i26 != 0) {
                                    }
                                    if ((i4 & 100663296) == 0) {
                                    }
                                    if ((i4 & 805306368) == 0) {
                                    }
                                    int i372 = i24;
                                    if ((i6 & 306783379) != 306783378) {
                                        composerStartRestartGroup.startDefaults();
                                        if ((i3 & 1) != 0) {
                                            if (i7 == 0) {
                                            }
                                            if (i8 == 0) {
                                            }
                                            if (i9 == 0) {
                                            }
                                            if ((i5 & 32) != 0) {
                                            }
                                            int i382 = i6;
                                            TextStyle textStyle52 = textStyle2;
                                            if (i10 == 0) {
                                            }
                                            if (i11 == 0) {
                                            }
                                            if (i13 == 0) {
                                            }
                                            if (i15 == 0) {
                                            }
                                            if (i17 == 0) {
                                            }
                                            if (i20 == 0) {
                                            }
                                            if (i21 == 0) {
                                            }
                                            if ((i5 & 8192) == 0) {
                                            }
                                            if (i23 == 0) {
                                            }
                                            if ((32768 & i5) == 0) {
                                            }
                                            if (i25 == 0) {
                                            }
                                            if (i26 == 0) {
                                            }
                                            if ((262144 & i5) == 0) {
                                            }
                                            int i392 = i27;
                                            if ((i5 & 524288) == 0) {
                                            }
                                            composer2.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            if (mutableInteractionSource2 != null) {
                                            }
                                            composer2.startReplaceGroup(-53735263);
                                            ComposerKt.sourceInformation(composer2, "*376@18776L18");
                                            jM5632getColor0d7_KjU = textStyle3.m5632getColor0d7_KjU();
                                            if (jM5632getColor0d7_KjU == 16) {
                                            }
                                            composer2.endReplaceGroup();
                                            TextStyle textStyleMerge2 = textStyle3.merge(new TextStyle(jM5632getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                            final TextFieldColors textFieldColors32 = textFieldColorsM2061textFieldColorsdx8h9Zs;
                                            final boolean z182 = z8;
                                            Modifier modifier42 = modifier2;
                                            final boolean z192 = z7;
                                            TextStyle textStyle62 = textStyle3;
                                            Modifier modifierM1049defaultMinSizeVpY3zN42 = SizeKt.m1049defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(TextFieldDefaults.m2049indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, modifier42, z182, z192, mutableInteractionSource3, textFieldColors32, 0.0f, 0.0f, 48, null), z192, Strings_androidKt.m2014getString4foXLRw(Strings.INSTANCE.m2009getDefaultErrorMessageUdPEhr4(), composer2, 6)), TextFieldDefaults.INSTANCE.m2056getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2055getMinHeightD9Ej5fM());
                                            Color value2 = textFieldColors32.cursorColor(z192, composer2, (i32 & 14) | ((i32 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).getValue();
                                            final MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                                            final boolean z202 = z10;
                                            final VisualTransformation visualTransformation42 = visualTransformation2;
                                            final Function2<? super Composer, ? super Integer, Unit> function2152 = function27;
                                            final Function2<? super Composer, ? super Integer, Unit> function2162 = function28;
                                            final Function2<? super Composer, ? super Integer, Unit> function2172 = function29;
                                            final Function2<? super Composer, ? super Integer, Unit> function2182 = function210;
                                            final Shape shape32 = textFieldShape;
                                            int i402 = i32 << 12;
                                            Composer composer42 = composer2;
                                            int i412 = i29;
                                            BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifierM1049defaultMinSizeVpY3zN42, z182, z9, textStyleMerge2, keyboardOptions2, keyboardActions3, z10, i31, i412, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource52, new SolidColor(value2.m3667unboximpl(), null), ComposableLambdaKt.rememberComposableLambda(-126640971, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextField.5
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer5, Integer num) {
                                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Function2<? super Composer, ? super Integer, Unit> function219, Composer composer5, int i42) {
                                                    int i43;
                                                    ComposerKt.sourceInformation(composer5, "C404@19958L575:TextField.kt#jmzs0o");
                                                    if ((i42 & 6) == 0) {
                                                        i43 = i42 | (composer5.changedInstance(function219) ? 4 : 2);
                                                    } else {
                                                        i43 = i42;
                                                    }
                                                    if ((i43 & 19) != 18 || !composer5.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-126640971, i43, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:404)");
                                                        }
                                                        TextFieldDefaults.INSTANCE.TextFieldDecorationBox(textFieldValue.getText(), function219, z182, z202, visualTransformation42, mutableInteractionSource52, z192, function2152, function2162, function2172, function2182, shape32, textFieldColors32, null, composer5, (i43 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 24576, 8192);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }, composer2, 54), composer42, (i30 & 64638) | (3670016 & i402) | (29360128 & i402) | (234881024 & i402) | (i402 & 1879048192), ((i32 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i32 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), 4096);
                                            composer3 = composer42;
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            VisualTransformation visualTransformation52 = visualTransformation2;
                                            z11 = z10;
                                            visualTransformation3 = visualTransformation52;
                                            textStyle4 = textStyle62;
                                            textFieldColors2 = textFieldColors32;
                                            z12 = z9;
                                            i33 = i31;
                                            i34 = i412;
                                            modifier3 = modifier42;
                                            z13 = z182;
                                            function211 = function27;
                                            function212 = function28;
                                            function213 = function29;
                                            mutableInteractionSource4 = mutableInteractionSource2;
                                            shape2 = textFieldShape;
                                            keyboardOptions3 = keyboardOptions2;
                                            keyboardActions4 = keyboardActions3;
                                            function214 = function210;
                                            z14 = z192;
                                        }
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup != null) {
                                    }
                                }
                                if ((i4 & 3072) == 0) {
                                }
                                int i362 = i22;
                                i23 = i5 & 16384;
                                if (i23 != 0) {
                                }
                                if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                }
                                i25 = i5 & 65536;
                                if (i25 != 0) {
                                }
                                i26 = i5 & 131072;
                                if (i26 != 0) {
                                }
                                if ((i4 & 100663296) == 0) {
                                }
                                if ((i4 & 805306368) == 0) {
                                }
                                int i3722 = i24;
                                if ((i6 & 306783379) != 306783378) {
                                }
                                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                }
                            }
                            i15 = i14;
                            i16 = i5 & 1024;
                            if (i16 != 0) {
                            }
                            i19 = i5 & 2048;
                            if (i19 != 0) {
                            }
                            int i352 = i18;
                            i21 = i5 & 4096;
                            if (i21 != 0) {
                            }
                            if ((i4 & 3072) == 0) {
                            }
                            int i3622 = i22;
                            i23 = i5 & 16384;
                            if (i23 != 0) {
                            }
                            if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            }
                            i25 = i5 & 65536;
                            if (i25 != 0) {
                            }
                            i26 = i5 & 131072;
                            if (i26 != 0) {
                            }
                            if ((i4 & 100663296) == 0) {
                            }
                            if ((i4 & 805306368) == 0) {
                            }
                            int i37222 = i24;
                            if ((i6 & 306783379) != 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i13 = i12;
                        i14 = i5 & 512;
                        if (i14 == 0) {
                        }
                        i15 = i14;
                        i16 = i5 & 1024;
                        if (i16 != 0) {
                        }
                        i19 = i5 & 2048;
                        if (i19 != 0) {
                        }
                        int i3522 = i18;
                        i21 = i5 & 4096;
                        if (i21 != 0) {
                        }
                        if ((i4 & 3072) == 0) {
                        }
                        int i36222 = i22;
                        i23 = i5 & 16384;
                        if (i23 != 0) {
                        }
                        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        }
                        i25 = i5 & 65536;
                        if (i25 != 0) {
                        }
                        i26 = i5 & 131072;
                        if (i26 != 0) {
                        }
                        if ((i4 & 100663296) == 0) {
                        }
                        if ((i4 & 805306368) == 0) {
                        }
                        int i372222 = i24;
                        if ((i6 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    z6 = z2;
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i10 = i5 & 64;
                    if (i10 != 0) {
                    }
                    i11 = i5 & 128;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i12;
                    i14 = i5 & 512;
                    if (i14 == 0) {
                    }
                    i15 = i14;
                    i16 = i5 & 1024;
                    if (i16 != 0) {
                    }
                    i19 = i5 & 2048;
                    if (i19 != 0) {
                    }
                    int i35222 = i18;
                    i21 = i5 & 4096;
                    if (i21 != 0) {
                    }
                    if ((i4 & 3072) == 0) {
                    }
                    int i362222 = i22;
                    i23 = i5 & 16384;
                    if (i23 != 0) {
                    }
                    if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i25 = i5 & 65536;
                    if (i25 != 0) {
                    }
                    i26 = i5 & 131072;
                    if (i26 != 0) {
                    }
                    if ((i4 & 100663296) == 0) {
                    }
                    if ((i4 & 805306368) == 0) {
                    }
                    int i3722222 = i24;
                    if ((i6 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z5 = z;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                z6 = z2;
                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                }
                i12 = i5 & 256;
                if (i12 != 0) {
                }
                i13 = i12;
                i14 = i5 & 512;
                if (i14 == 0) {
                }
                i15 = i14;
                i16 = i5 & 1024;
                if (i16 != 0) {
                }
                i19 = i5 & 2048;
                if (i19 != 0) {
                }
                int i352222 = i18;
                i21 = i5 & 4096;
                if (i21 != 0) {
                }
                if ((i4 & 3072) == 0) {
                }
                int i3622222 = i22;
                i23 = i5 & 16384;
                if (i23 != 0) {
                }
                if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i25 = i5 & 65536;
                if (i25 != 0) {
                }
                i26 = i5 & 131072;
                if (i26 != 0) {
                }
                if ((i4 & 100663296) == 0) {
                }
                if ((i4 & 805306368) == 0) {
                }
                int i37222222 = i24;
                if ((i6 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            z5 = z;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            z6 = z2;
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i10 = i5 & 64;
            if (i10 != 0) {
            }
            i11 = i5 & 128;
            if (i11 != 0) {
            }
            i12 = i5 & 256;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i5 & 512;
            if (i14 == 0) {
            }
            i15 = i14;
            i16 = i5 & 1024;
            if (i16 != 0) {
            }
            i19 = i5 & 2048;
            if (i19 != 0) {
            }
            int i3522222 = i18;
            i21 = i5 & 4096;
            if (i21 != 0) {
            }
            if ((i4 & 3072) == 0) {
            }
            int i36222222 = i22;
            i23 = i5 & 16384;
            if (i23 != 0) {
            }
            if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i25 = i5 & 65536;
            if (i25 != 0) {
            }
            i26 = i5 & 131072;
            if (i26 != 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            if ((i4 & 805306368) == 0) {
            }
            int i372222222 = i24;
            if ((i6 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        z5 = z;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        z6 = z2;
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i10 = i5 & 64;
        if (i10 != 0) {
        }
        i11 = i5 & 128;
        if (i11 != 0) {
        }
        i12 = i5 & 256;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i5 & 512;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i5 & 1024;
        if (i16 != 0) {
        }
        i19 = i5 & 2048;
        if (i19 != 0) {
        }
        int i35222222 = i18;
        i21 = i5 & 4096;
        if (i21 != 0) {
        }
        if ((i4 & 3072) == 0) {
        }
        int i362222222 = i22;
        i23 = i5 & 16384;
        if (i23 != 0) {
        }
        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i25 = i5 & 65536;
        if (i25 != 0) {
        }
        i26 = i5 & 131072;
        if (i26 != 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        int i3722222222 = i24;
        if ((i6 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:300:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0111  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void TextField(final TextFieldValue textFieldValue, final Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        Modifier modifier2;
        int i7;
        boolean z5;
        int i8;
        boolean z6;
        TextStyle textStyle2;
        int i9;
        Function2 function25;
        int i10;
        Function2 function26;
        int i11;
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
        TextStyle textStyle3;
        int i27;
        KeyboardActions keyboardActions2;
        MutableInteractionSource mutableInteractionSource2;
        Shape textFieldShape;
        Composer composer2;
        TextFieldColors textFieldColorsM2061textFieldColorsdx8h9Zs;
        KeyboardActions keyboardActions3;
        Modifier modifier3;
        boolean z7;
        boolean z8;
        int i28;
        Function2 function27;
        Function2 function28;
        Function2 function29;
        boolean z9;
        VisualTransformation visualTransformation2;
        KeyboardOptions keyboardOptions2;
        boolean z10;
        int i29;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape2;
        final Modifier modifier4;
        final boolean z11;
        final boolean z12;
        final TextStyle textStyle4;
        final Function2 function210;
        final Function2 function211;
        final Function2 function212;
        final Function2 function213;
        final boolean z13;
        final VisualTransformation visualTransformation3;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions4;
        final boolean z14;
        final int i30;
        final MutableInteractionSource mutableInteractionSource4;
        final Shape shape3;
        final TextFieldColors textFieldColors2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1576622884);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)434@20918L7,445@21472L39,446@21550L14,447@21614L17,449@21640L408:TextField.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(textFieldValue) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    modifier2 = modifier;
                    i5 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        z5 = z;
                        i5 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            z6 = z2;
                            i5 |= composerStartRestartGroup.changed(z6) ? 16384 : 8192;
                        }
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            textStyle2 = textStyle;
                            i5 |= ((i4 & 32) == 0 && composerStartRestartGroup.changed(textStyle2)) ? 131072 : 65536;
                        } else {
                            textStyle2 = textStyle;
                        }
                        i9 = i4 & 64;
                        if (i9 != 0) {
                            i5 |= 1572864;
                            function25 = function2;
                        } else {
                            function25 = function2;
                            if ((i2 & 1572864) == 0) {
                                i5 |= composerStartRestartGroup.changedInstance(function25) ? 1048576 : 524288;
                            }
                        }
                        i10 = i4 & 128;
                        if (i10 != 0) {
                            i5 |= 12582912;
                            function26 = function22;
                        } else {
                            function26 = function22;
                            if ((i2 & 12582912) == 0) {
                                i5 |= composerStartRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
                            }
                        }
                        i11 = i4 & 256;
                        if (i11 != 0) {
                            i5 |= 100663296;
                        } else {
                            if ((i2 & 100663296) == 0) {
                                i12 = i11;
                                i5 |= composerStartRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            i13 = i4 & 512;
                            if (i13 == 0) {
                                i5 |= 805306368;
                            } else {
                                if ((i2 & 805306368) == 0) {
                                    i14 = i13;
                                    i5 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                                }
                                i15 = i4 & 1024;
                                if (i15 != 0) {
                                    i17 = i3 | 6;
                                    i16 = i15;
                                } else if ((i3 & 6) == 0) {
                                    i16 = i15;
                                    i17 = i3 | (composerStartRestartGroup.changed(z3) ? 4 : 2);
                                } else {
                                    i16 = i15;
                                    i17 = i3;
                                }
                                i18 = i4 & 2048;
                                if (i18 != 0) {
                                    i17 |= 48;
                                    i19 = i18;
                                } else if ((i3 & 48) == 0) {
                                    i19 = i18;
                                    i17 |= composerStartRestartGroup.changed(visualTransformation) ? 32 : 16;
                                } else {
                                    i19 = i18;
                                }
                                int i31 = i17;
                                i20 = i4 & 4096;
                                if (i20 != 0) {
                                    i21 = i31 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                                } else {
                                    i21 = i31;
                                    if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                        i21 |= composerStartRestartGroup.changed(keyboardOptions) ? 256 : 128;
                                    }
                                    if ((i3 & 3072) == 0) {
                                        i21 |= ((i4 & 8192) == 0 && composerStartRestartGroup.changed(keyboardActions)) ? 2048 : 1024;
                                    }
                                    int i32 = i21;
                                    i22 = i4 & 16384;
                                    if (i22 != 0) {
                                        i23 = i32;
                                        if ((i3 & 24576) == 0) {
                                            i23 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                                        }
                                        i24 = i4 & 32768;
                                        if (i24 != 0) {
                                            i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                        } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                            i23 |= composerStartRestartGroup.changed(i) ? 131072 : 65536;
                                        }
                                        i25 = i4 & 65536;
                                        if (i25 != 0) {
                                            i23 |= 1572864;
                                        } else if ((i3 & 1572864) == 0) {
                                            i23 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                                        }
                                        if ((i3 & 12582912) == 0) {
                                            i23 |= ((i4 & 131072) == 0 && composerStartRestartGroup.changed(shape)) ? 8388608 : 4194304;
                                        }
                                        if ((i3 & 100663296) == 0) {
                                            i23 |= ((i4 & 262144) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                        }
                                        i26 = i23;
                                        if ((i5 & 306783379) != 306783378 || (38347923 & i26) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                                            composerStartRestartGroup.startDefaults();
                                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                                Modifier.Companion companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                                                boolean z15 = i7 == 0 ? true : z5;
                                                boolean z16 = i8 == 0 ? false : z6;
                                                if ((i4 & 32) == 0) {
                                                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                    Object objConsume = composerStartRestartGroup.consume(localTextStyle);
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    i5 &= -458753;
                                                    textStyle3 = (TextStyle) objConsume;
                                                } else {
                                                    textStyle3 = textStyle2;
                                                }
                                                int i33 = i5;
                                                Function2 function214 = i9 == 0 ? null : function25;
                                                Function2 function215 = i10 == 0 ? null : function26;
                                                Function2 function216 = i12 == 0 ? null : function23;
                                                Function2 function217 = i14 == 0 ? null : function24;
                                                boolean z17 = i16 == 0 ? false : z3;
                                                VisualTransformation none = i19 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                                KeyboardOptions keyboardOptions4 = i20 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                                if ((i4 & 8192) == 0) {
                                                    i27 = i26 & (-7169);
                                                    keyboardActions2 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                                } else {
                                                    i27 = i26;
                                                    keyboardActions2 = keyboardActions;
                                                }
                                                boolean z18 = i22 == 0 ? false : z4;
                                                int i34 = i24 == 0 ? Integer.MAX_VALUE : i;
                                                if (i25 == 0) {
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -53648114, "CC(remember):TextField.kt#9igjgp");
                                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                                } else {
                                                    mutableInteractionSource2 = mutableInteractionSource;
                                                }
                                                if ((i4 & 131072) == 0) {
                                                    i27 &= -29360129;
                                                    textFieldShape = TextFieldDefaults.INSTANCE.getTextFieldShape(composerStartRestartGroup, 6);
                                                } else {
                                                    textFieldShape = shape;
                                                }
                                                int i35 = i27;
                                                if ((262144 & i4) == 0) {
                                                    composer2 = composerStartRestartGroup;
                                                    keyboardActions3 = keyboardActions2;
                                                    modifier3 = companion;
                                                    textFieldColorsM2061textFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m2061textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 0, 0, 48, 2097151);
                                                    i26 = i35 & (-234881025);
                                                    z7 = z15;
                                                    z8 = z16;
                                                    textStyle2 = textStyle3;
                                                    i28 = i33;
                                                    function25 = function214;
                                                    function27 = function215;
                                                    function28 = function216;
                                                    function29 = function217;
                                                    z9 = z17;
                                                    visualTransformation2 = none;
                                                    keyboardOptions2 = keyboardOptions4;
                                                    z10 = z18;
                                                    i29 = i34;
                                                    mutableInteractionSource3 = mutableInteractionSource2;
                                                    shape2 = textFieldShape;
                                                } else {
                                                    composer2 = composerStartRestartGroup;
                                                    textFieldColorsM2061textFieldColorsdx8h9Zs = textFieldColors;
                                                    keyboardActions3 = keyboardActions2;
                                                    modifier3 = companion;
                                                    z7 = z15;
                                                    z8 = z16;
                                                    textStyle2 = textStyle3;
                                                    i28 = i33;
                                                    function25 = function214;
                                                    function27 = function215;
                                                    function28 = function216;
                                                    function29 = function217;
                                                    z9 = z17;
                                                    visualTransformation2 = none;
                                                    keyboardOptions2 = keyboardOptions4;
                                                    z10 = z18;
                                                    i29 = i34;
                                                    mutableInteractionSource3 = mutableInteractionSource2;
                                                    shape2 = textFieldShape;
                                                    i26 = i35;
                                                }
                                            } else {
                                                composerStartRestartGroup.skipToGroupEnd();
                                                if ((i4 & 32) != 0) {
                                                    i5 &= -458753;
                                                }
                                                if ((i4 & 8192) != 0) {
                                                    i26 &= -7169;
                                                }
                                                if ((i4 & 131072) != 0) {
                                                    i26 &= -29360129;
                                                }
                                                if ((262144 & i4) != 0) {
                                                    i26 &= -234881025;
                                                }
                                                function28 = function23;
                                                visualTransformation2 = visualTransformation;
                                                keyboardOptions2 = keyboardOptions;
                                                keyboardActions3 = keyboardActions;
                                                z10 = z4;
                                                i29 = i;
                                                mutableInteractionSource3 = mutableInteractionSource;
                                                shape2 = shape;
                                                textFieldColorsM2061textFieldColorsdx8h9Zs = textFieldColors;
                                                composer2 = composerStartRestartGroup;
                                                z8 = z6;
                                                i28 = i5;
                                                function27 = function26;
                                                modifier3 = modifier2;
                                                function29 = function24;
                                                z9 = z3;
                                                z7 = z5;
                                            }
                                            composer2.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1576622884, i28, i26, "androidx.compose.material.TextField (TextField.kt:448)");
                                            }
                                            int i36 = i28 & 2147483646;
                                            int i37 = (i26 & 14) | 1572864 | (i26 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (458752 & i26);
                                            int i38 = i26 << 3;
                                            TextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifier3, z7, z8, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function25, (Function2<? super Composer, ? super Integer, Unit>) function27, (Function2<? super Composer, ? super Integer, Unit>) function28, (Function2<? super Composer, ? super Integer, Unit>) function29, z9, visualTransformation2, keyboardOptions2, keyboardActions3, z10, i29, 1, mutableInteractionSource3, shape2, textFieldColorsM2061textFieldColorsdx8h9Zs, composer2, i36, i37 | (29360128 & i38) | (234881024 & i38) | (i38 & 1879048192), 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            modifier4 = modifier3;
                                            z11 = z7;
                                            z12 = z8;
                                            textStyle4 = textStyle2;
                                            function210 = function25;
                                            function211 = function27;
                                            function212 = function28;
                                            function213 = function29;
                                            z13 = z9;
                                            visualTransformation3 = visualTransformation2;
                                            keyboardOptions3 = keyboardOptions2;
                                            keyboardActions4 = keyboardActions3;
                                            z14 = z10;
                                            i30 = i29;
                                            mutableInteractionSource4 = mutableInteractionSource3;
                                            shape3 = shape2;
                                            textFieldColors2 = textFieldColorsM2061textFieldColorsdx8h9Zs;
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            z13 = z3;
                                            visualTransformation3 = visualTransformation;
                                            z14 = z4;
                                            i30 = i;
                                            mutableInteractionSource4 = mutableInteractionSource;
                                            shape3 = shape;
                                            textFieldColors2 = textFieldColors;
                                            composer2 = composerStartRestartGroup;
                                            z11 = z5;
                                            z12 = z6;
                                            textStyle4 = textStyle2;
                                            function210 = function25;
                                            function211 = function26;
                                            modifier4 = modifier2;
                                            function212 = function23;
                                            function213 = function24;
                                            keyboardOptions3 = keyboardOptions;
                                            keyboardActions4 = keyboardActions;
                                        }
                                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                        if (scopeUpdateScopeEndRestartGroup != null) {
                                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextField.8
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    invoke(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer3, int i39) {
                                                    TextFieldKt.TextField(textFieldValue, function1, modifier4, z11, z12, textStyle4, function210, function211, function212, function213, z13, visualTransformation3, keyboardOptions3, keyboardActions4, z14, i30, mutableInteractionSource4, shape3, textFieldColors2, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i23 = i32 | 24576;
                                    i24 = i4 & 32768;
                                    if (i24 != 0) {
                                    }
                                    i25 = i4 & 65536;
                                    if (i25 != 0) {
                                    }
                                    if ((i3 & 12582912) == 0) {
                                    }
                                    if ((i3 & 100663296) == 0) {
                                    }
                                    i26 = i23;
                                    if ((i5 & 306783379) != 306783378) {
                                        composerStartRestartGroup.startDefaults();
                                        if ((i2 & 1) != 0) {
                                            if (i6 == 0) {
                                            }
                                            if (i7 == 0) {
                                            }
                                            if (i8 == 0) {
                                            }
                                            if ((i4 & 32) == 0) {
                                            }
                                            int i332 = i5;
                                            if (i9 == 0) {
                                            }
                                            if (i10 == 0) {
                                            }
                                            if (i12 == 0) {
                                            }
                                            if (i14 == 0) {
                                            }
                                            if (i16 == 0) {
                                            }
                                            if (i19 == 0) {
                                            }
                                            if (i20 == 0) {
                                            }
                                            if ((i4 & 8192) == 0) {
                                            }
                                            if (i22 == 0) {
                                            }
                                            if (i24 == 0) {
                                            }
                                            if (i25 == 0) {
                                            }
                                            if ((i4 & 131072) == 0) {
                                            }
                                            int i352 = i27;
                                            if ((262144 & i4) == 0) {
                                            }
                                            composer2.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            int i362 = i28 & 2147483646;
                                            int i372 = (i26 & 14) | 1572864 | (i26 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (458752 & i26);
                                            int i382 = i26 << 3;
                                            TextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifier3, z7, z8, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function25, (Function2<? super Composer, ? super Integer, Unit>) function27, (Function2<? super Composer, ? super Integer, Unit>) function28, (Function2<? super Composer, ? super Integer, Unit>) function29, z9, visualTransformation2, keyboardOptions2, keyboardActions3, z10, i29, 1, mutableInteractionSource3, shape2, textFieldColorsM2061textFieldColorsdx8h9Zs, composer2, i362, i372 | (29360128 & i382) | (234881024 & i382) | (i382 & 1879048192), 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            modifier4 = modifier3;
                                            z11 = z7;
                                            z12 = z8;
                                            textStyle4 = textStyle2;
                                            function210 = function25;
                                            function211 = function27;
                                            function212 = function28;
                                            function213 = function29;
                                            z13 = z9;
                                            visualTransformation3 = visualTransformation2;
                                            keyboardOptions3 = keyboardOptions2;
                                            keyboardActions4 = keyboardActions3;
                                            z14 = z10;
                                            i30 = i29;
                                            mutableInteractionSource4 = mutableInteractionSource3;
                                            shape3 = shape2;
                                            textFieldColors2 = textFieldColorsM2061textFieldColorsdx8h9Zs;
                                        }
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup != null) {
                                    }
                                }
                                if ((i3 & 3072) == 0) {
                                }
                                int i322 = i21;
                                i22 = i4 & 16384;
                                if (i22 != 0) {
                                }
                                i24 = i4 & 32768;
                                if (i24 != 0) {
                                }
                                i25 = i4 & 65536;
                                if (i25 != 0) {
                                }
                                if ((i3 & 12582912) == 0) {
                                }
                                if ((i3 & 100663296) == 0) {
                                }
                                i26 = i23;
                                if ((i5 & 306783379) != 306783378) {
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                }
                            }
                            i14 = i13;
                            i15 = i4 & 1024;
                            if (i15 != 0) {
                            }
                            i18 = i4 & 2048;
                            if (i18 != 0) {
                            }
                            int i312 = i17;
                            i20 = i4 & 4096;
                            if (i20 != 0) {
                            }
                            if ((i3 & 3072) == 0) {
                            }
                            int i3222 = i21;
                            i22 = i4 & 16384;
                            if (i22 != 0) {
                            }
                            i24 = i4 & 32768;
                            if (i24 != 0) {
                            }
                            i25 = i4 & 65536;
                            if (i25 != 0) {
                            }
                            if ((i3 & 12582912) == 0) {
                            }
                            if ((i3 & 100663296) == 0) {
                            }
                            i26 = i23;
                            if ((i5 & 306783379) != 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i12 = i11;
                        i13 = i4 & 512;
                        if (i13 == 0) {
                        }
                        i14 = i13;
                        i15 = i4 & 1024;
                        if (i15 != 0) {
                        }
                        i18 = i4 & 2048;
                        if (i18 != 0) {
                        }
                        int i3122 = i17;
                        i20 = i4 & 4096;
                        if (i20 != 0) {
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        int i32222 = i21;
                        i22 = i4 & 16384;
                        if (i22 != 0) {
                        }
                        i24 = i4 & 32768;
                        if (i24 != 0) {
                        }
                        i25 = i4 & 65536;
                        if (i25 != 0) {
                        }
                        if ((i3 & 12582912) == 0) {
                        }
                        if ((i3 & 100663296) == 0) {
                        }
                        i26 = i23;
                        if ((i5 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    z6 = z2;
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i9 = i4 & 64;
                    if (i9 != 0) {
                    }
                    i10 = i4 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 256;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    i13 = i4 & 512;
                    if (i13 == 0) {
                    }
                    i14 = i13;
                    i15 = i4 & 1024;
                    if (i15 != 0) {
                    }
                    i18 = i4 & 2048;
                    if (i18 != 0) {
                    }
                    int i31222 = i17;
                    i20 = i4 & 4096;
                    if (i20 != 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    int i322222 = i21;
                    i22 = i4 & 16384;
                    if (i22 != 0) {
                    }
                    i24 = i4 & 32768;
                    if (i24 != 0) {
                    }
                    i25 = i4 & 65536;
                    if (i25 != 0) {
                    }
                    if ((i3 & 12582912) == 0) {
                    }
                    if ((i3 & 100663296) == 0) {
                    }
                    i26 = i23;
                    if ((i5 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z5 = z;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                z6 = z2;
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                }
                i10 = i4 & 128;
                if (i10 != 0) {
                }
                i11 = i4 & 256;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i4 & 512;
                if (i13 == 0) {
                }
                i14 = i13;
                i15 = i4 & 1024;
                if (i15 != 0) {
                }
                i18 = i4 & 2048;
                if (i18 != 0) {
                }
                int i312222 = i17;
                i20 = i4 & 4096;
                if (i20 != 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                int i3222222 = i21;
                i22 = i4 & 16384;
                if (i22 != 0) {
                }
                i24 = i4 & 32768;
                if (i24 != 0) {
                }
                i25 = i4 & 65536;
                if (i25 != 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                if ((i3 & 100663296) == 0) {
                }
                i26 = i23;
                if ((i5 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            z5 = z;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            z6 = z2;
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i9 = i4 & 64;
            if (i9 != 0) {
            }
            i10 = i4 & 128;
            if (i10 != 0) {
            }
            i11 = i4 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i4 & 512;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i4 & 1024;
            if (i15 != 0) {
            }
            i18 = i4 & 2048;
            if (i18 != 0) {
            }
            int i3122222 = i17;
            i20 = i4 & 4096;
            if (i20 != 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            int i32222222 = i21;
            i22 = i4 & 16384;
            if (i22 != 0) {
            }
            i24 = i4 & 32768;
            if (i24 != 0) {
            }
            i25 = i4 & 65536;
            if (i25 != 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            if ((i3 & 100663296) == 0) {
            }
            i26 = i23;
            if ((i5 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        modifier2 = modifier;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        z5 = z;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        z6 = z2;
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i9 = i4 & 64;
        if (i9 != 0) {
        }
        i10 = i4 & 128;
        if (i10 != 0) {
        }
        i11 = i4 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i4 & 512;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i4 & 1024;
        if (i15 != 0) {
        }
        i18 = i4 & 2048;
        if (i18 != 0) {
        }
        int i31222222 = i17;
        i20 = i4 & 4096;
        if (i20 != 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        int i322222222 = i21;
        i22 = i4 & 16384;
        if (i22 != 0) {
        }
        i24 = i4 & 32768;
        if (i24 != 0) {
        }
        i25 = i4 & 65536;
        if (i25 != 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        if ((i3 & 100663296) == 0) {
        }
        i26 = i23;
        if ((i5 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void TextFieldLayout(final Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final boolean z, final float f, final PaddingValues paddingValues, Composer composer, final int i) {
        int i2;
        int i3;
        int i4;
        final Function2<? super Composer, ? super Integer, Unit> function25 = function2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2112507061);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TextFieldLayout)P(3,7,1,5,2,8,6)489@22578L139,492@22765L7,493@22777L1853:TextField.kt#jmzs0o");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function25) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function24) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(paddingValues) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((38347923 & i2) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2112507061, i2, -1, "androidx.compose.material.TextFieldLayout (TextField.kt:488)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -73227460, "CC(remember):TextField.kt#9igjgp");
            boolean z2 = ((3670016 & i2) == 1048576) | ((29360128 & i2) == 8388608) | ((234881024 & i2) == 67108864);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new TextFieldMeasurePolicy(z, f, paddingValues);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) objConsume;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Updater.m3157setimpl(composerM3150constructorimpl, textFieldMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 69567154, "C535@24392L183:TextField.kt#jmzs0o");
            if (function23 != null) {
                composerStartRestartGroup.startReplaceGroup(69542167);
                ComposerKt.sourceInformation(composerStartRestartGroup, "497@22885L219");
                Modifier modifierThen = LayoutIdKt.layoutId(Modifier.INSTANCE, "Leading").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                i3 = i2;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
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
                Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1924262037, "C501@23077L9:TextField.kt#jmzs0o");
                function23.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 12) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                i3 = i2;
                composerStartRestartGroup.startReplaceGroup(69783378);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (function24 != null) {
                composerStartRestartGroup.startReplaceGroup(69825941);
                ComposerKt.sourceInformation(composerStartRestartGroup, "505@23171L221");
                Modifier modifierThen2 = LayoutIdKt.layoutId(Modifier.INSTANCE, "Trailing").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen2);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3150constructorimpl3 = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM3150constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM3150constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m3157setimpl(composerM3150constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1923977302, "C509@23364L10:TextField.kt#jmzs0o");
                function24.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 15) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(70069074);
                composerStartRestartGroup.endReplaceGroup();
            }
            float fCalculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            float fCalculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            Modifier.Companion companion = Modifier.INSTANCE;
            if (function23 != null) {
                i4 = 0;
                fCalculateStartPadding = Dp.m6117constructorimpl(RangesKt.coerceAtLeast(Dp.m6117constructorimpl(fCalculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m6117constructorimpl(0)));
            } else {
                i4 = 0;
            }
            float f2 = fCalculateStartPadding;
            if (function24 != null) {
                fCalculateEndPadding = Dp.m6117constructorimpl(RangesKt.coerceAtLeast(Dp.m6117constructorimpl(fCalculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m6117constructorimpl(i4)));
            }
            Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(companion, f2, 0.0f, fCalculateEndPadding, 0.0f, 10, null);
            if (function3 != null) {
                composerStartRestartGroup.startReplaceGroup(70826807);
                ComposerKt.sourceInformation(composerStartRestartGroup, "530@24185L59");
                function3.invoke(LayoutIdKt.layoutId(Modifier.INSTANCE, "Hint").then(modifierM1024paddingqDBjuR0$default), composerStartRestartGroup, Integer.valueOf((i3 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS));
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(70914258);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (function22 != null) {
                composerStartRestartGroup.startReplaceGroup(70948761);
                ComposerKt.sourceInformation(composerStartRestartGroup, "533@24308L57");
                Modifier modifierThen3 = LayoutIdKt.layoutId(Modifier.INSTANCE, "Label").then(modifierM1024paddingqDBjuR0$default);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen3);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3150constructorimpl4 = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM3150constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM3150constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m3157setimpl(composerM3150constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1922993331, "C533@24356L7:TextField.kt#jmzs0o");
                function22.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 6) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(71034290);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierThen4 = LayoutIdKt.layoutId(Modifier.INSTANCE, "TextField").then(modifierM1024paddingqDBjuR0$default);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen4);
            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl5 = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composerM3150constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composerM3150constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.m3157setimpl(composerM3150constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1922800759, "C539@24550L11:TextField.kt#jmzs0o");
            function25 = function2;
            function25.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 3) & 14));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt.TextFieldLayout.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    TextFieldKt.TextFieldLayout(modifier, function25, function22, function3, function23, function24, z, f, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-VsPV1Ek, reason: not valid java name */
    public static final int m2073calculateWidthVsPV1Ek(int i, int i2, int i3, int i4, int i5, long j) {
        return Math.max(i + Math.max(i3, Math.max(i4, i5)) + i2, Constraints.m6072getMinWidthimpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m2072calculateHeightO3s9Psw(int i, boolean z, int i2, int i3, int i4, int i5, long j, float f, PaddingValues paddingValues) {
        float f2 = TextFieldTopPadding * f;
        float top = paddingValues.getTop() * f;
        float bottom = paddingValues.getBottom() * f;
        int iMax = Math.max(i, i5);
        return Math.max(MathKt.roundToInt(z ? i2 + f2 + iMax + bottom : top + iMax + bottom), Math.max(Math.max(i3, i4), Constraints.m6071getMinHeightimpl(j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, boolean z, int i3, int i4, float f, float f2) {
        int iRoundToInt;
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i - placeable5.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            if (z) {
                iRoundToInt = Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i2);
            } else {
                iRoundToInt = MathKt.roundToInt(TextFieldImplKt.getTextFieldPadding() * f2);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), iRoundToInt - MathKt.roundToInt((iRoundToInt - i3) * f), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable4), i4, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable4), i4, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, boolean z, float f, PaddingValues paddingValues) {
        int iRoundToInt = MathKt.roundToInt(paddingValues.getTop() * f);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i - placeable4.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), i2), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable3), z ? Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i2) : iRoundToInt, 0.0f, 4, null);
        if (placeable2 != null) {
            if (z) {
                iRoundToInt = Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i2);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable3), iRoundToInt, 0.0f, 4, null);
        }
    }

    public static final Modifier drawIndicatorLine(Modifier modifier, final BorderStroke borderStroke) {
        final float width = borderStroke.getWidth();
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material.TextFieldKt.drawIndicatorLine.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                if (Dp.m6122equalsimpl0(width, Dp.INSTANCE.m6135getHairlineD9Ej5fM())) {
                    return;
                }
                float density = width * contentDrawScope.getDensity();
                float fM3482getHeightimpl = Size.m3482getHeightimpl(contentDrawScope.mo4213getSizeNHjbRc()) - (density / 2);
                DrawScope.m4198drawLine1RTmtNc$default(contentDrawScope, borderStroke.getBrush(), OffsetKt.Offset(0.0f, fM3482getHeightimpl), OffsetKt.Offset(Size.m3485getWidthimpl(contentDrawScope.mo4213getSizeNHjbRc()), fM3482getHeightimpl), density, 0, null, 0.0f, null, 0, 496, null);
            }
        });
    }

    public static final float getFirstBaselineOffset() {
        return FirstBaselineOffset;
    }

    public static final float getTextFieldBottomPadding() {
        return TextFieldBottomPadding;
    }

    public static final float getTextFieldTopPadding() {
        return TextFieldTopPadding;
    }
}
