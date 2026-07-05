package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
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
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
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
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
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
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u009e\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,H\u0007¢\u0006\u0002\u0010-\u001a\u009e\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020.2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,H\u0007¢\u0006\u0002\u0010/\u001aÂ\u0001\u00100\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u00101\u001a\r\u0012\u0004\u0012\u00020\n0\u0017¢\u0006\u0002\b\u00182\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0019\u0010\u0019\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e¢\u0006\u0002\b\u00182\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0013\u00103\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0006\u0010$\u001a\u00020\u00122\u0006\u00104\u001a\u0002052\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\n0\u0017¢\u0006\u0002\b\u00182\u0013\u00107\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0006\u00108\u001a\u000209H\u0001¢\u0006\u0002\u0010:\u001ae\u0010;\u001a\u00020&2\u0006\u0010<\u001a\u00020&2\u0006\u0010=\u001a\u00020\u00122\u0006\u0010>\u001a\u00020&2\u0006\u0010?\u001a\u00020&2\u0006\u0010@\u001a\u00020&2\u0006\u0010A\u001a\u00020&2\u0006\u0010B\u001a\u00020&2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u0002052\u0006\u00108\u001a\u000209H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010G\u001aE\u0010H\u001a\u00020&2\u0006\u0010I\u001a\u00020&2\u0006\u0010J\u001a\u00020&2\u0006\u0010K\u001a\u00020&2\u0006\u0010L\u001a\u00020&2\u0006\u0010M\u001a\u00020&2\u0006\u0010C\u001a\u00020DH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a\u0014\u0010P\u001a\u00020\u0010*\u00020\u00102\u0006\u0010Q\u001a\u00020RH\u0000\u001a\u0086\u0001\u0010S\u001a\u00020\n*\u00020T2\u0006\u0010U\u001a\u00020&2\u0006\u0010V\u001a\u00020&2\u0006\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010X2\b\u0010Z\u001a\u0004\u0018\u00010X2\b\u0010[\u001a\u0004\u0018\u00010X2\b\u0010\\\u001a\u0004\u0018\u00010X2\u0006\u0010]\u001a\u00020X2\b\u0010^\u001a\u0004\u0018\u00010X2\u0006\u0010$\u001a\u00020\u00122\u0006\u0010_\u001a\u00020&2\u0006\u0010`\u001a\u00020&2\u0006\u00104\u001a\u0002052\u0006\u0010E\u001a\u000205H\u0002\u001al\u0010a\u001a\u00020\n*\u00020T2\u0006\u0010U\u001a\u00020&2\u0006\u0010V\u001a\u00020&2\u0006\u0010b\u001a\u00020X2\b\u0010Z\u001a\u0004\u0018\u00010X2\b\u0010[\u001a\u0004\u0018\u00010X2\b\u0010\\\u001a\u0004\u0018\u00010X2\u0006\u0010]\u001a\u00020X2\b\u0010^\u001a\u0004\u0018\u00010X2\u0006\u0010$\u001a\u00020\u00122\u0006\u0010E\u001a\u0002052\u0006\u00108\u001a\u000209H\u0002\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0019\u0010\u0005\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u0019\u0010\u0007\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\b\u0010\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006c"}, d2 = {"FirstBaselineOffset", "Landroidx/compose/ui/unit/Dp;", "getFirstBaselineOffset", "()F", "F", "TextFieldBottomPadding", "getTextFieldBottomPadding", "TextFieldTopPadding", "getTextFieldTopPadding", "TextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", ViewProps.ENABLED, "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", ReactTextInputShadowNode.PROP_PLACEHOLDER, "leadingIcon", "trailingIcon", "supportingText", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", PaymentSheetAppearanceKeys.COLORS, "Landroidx/compose/material3/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "TextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "container", "supporting", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateHeight", "textFieldHeight", "hasLabel", "labelBaseline", "leadingHeight", "trailingHeight", "placeholderHeight", "supportingHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-jCXOeKk", "(IZIIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingWidth", "trailingWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "calculateWidth-VsPV1Ek", "(IIIIIJ)I", "drawIndicatorLine", "indicatorBorder", "Landroidx/compose/foundation/BorderStroke;", "placeWithLabel", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "width", "totalHeight", "textfieldPlaceable", "Landroidx/compose/ui/layout/Placeable;", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "containerPlaceable", "supportingPlaceable", "labelEndPosition", "textPosition", "placeWithoutLabel", "textPlaceable", "material3_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldKt {
    private static final float FirstBaselineOffset = Dp.m6117constructorimpl(20);
    private static final float TextFieldBottomPadding = Dp.m6117constructorimpl(10);
    private static final float TextFieldTopPadding = Dp.m6117constructorimpl(4);

    /* JADX WARN: Removed duplicated region for block: B:108:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0603 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013d  */
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextField(final String value, final Function1<? super String, Unit> onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        boolean z5;
        int i7;
        boolean z6;
        TextStyle textStyle2;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i9;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i10;
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
        Modifier.Companion companion;
        int i23;
        TextStyle textStyle3;
        int i24;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        MutableInteractionSource mutableInteractionSource2;
        Shape filledShape;
        Composer composer2;
        final KeyboardOptions keyboardOptions3;
        char c;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        TextStyle textStyle4;
        int i25;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final boolean z7;
        final VisualTransformation visualTransformation2;
        final KeyboardActions keyboardActions3;
        final boolean z8;
        final int i26;
        final MutableInteractionSource mutableInteractionSource3;
        final Shape shape2;
        final int i27;
        final TextFieldColors textFieldColorsM2512textFieldColorsl59Burw;
        Modifier modifier3;
        long jM5632getColor0d7_KjU;
        Composer composer3;
        final boolean z9;
        final boolean z10;
        final boolean z11;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        final Shape shape3;
        final TextStyle textStyle5;
        final boolean z12;
        final int i28;
        final VisualTransformation visualTransformation3;
        final MutableInteractionSource mutableInteractionSource4;
        final Modifier modifier4;
        final KeyboardOptions keyboardOptions4;
        final KeyboardActions keyboardActions4;
        final Function2<? super Composer, ? super Integer, Unit> function216;
        final Function2<? super Composer, ? super Integer, Unit> function217;
        final TextFieldColors textFieldColors2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1571072018);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TextField)P(18,10,9,1,12,16,6,11,7,17,15,3,19,5,4,14,8,2,13)163@8420L7,175@9034L39,176@9112L11,177@9173L17,185@9516L15,185@9450L1775:TextField.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i5 |= composerStartRestartGroup.changed(onValueChange) ? 32 : 16;
        }
        int i29 = i4 & 4;
        if (i29 != 0) {
            i5 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i2 & 896) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 7168) == 0) {
                    z5 = z;
                    i5 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
                }
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                    z6 = z2;
                } else {
                    z6 = z2;
                    if ((i2 & 57344) == 0) {
                        i5 |= composerStartRestartGroup.changed(z6) ? 16384 : 8192;
                    }
                }
                if ((i2 & 458752) == 0) {
                    textStyle2 = textStyle;
                    i5 |= ((i4 & 32) == 0 && composerStartRestartGroup.changed(textStyle2)) ? 131072 : 65536;
                } else {
                    textStyle2 = textStyle;
                }
                i8 = i4 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                    function26 = function2;
                } else {
                    function26 = function2;
                    if ((i2 & 3670016) == 0) {
                        i5 |= composerStartRestartGroup.changed(function26) ? 1048576 : 524288;
                    }
                }
                i9 = i4 & 128;
                if (i9 != 0) {
                    i5 |= 12582912;
                    function27 = function22;
                } else {
                    function27 = function22;
                    if ((i2 & 29360128) == 0) {
                        i5 |= composerStartRestartGroup.changed(function27) ? 8388608 : 4194304;
                    }
                }
                i10 = i4 & 256;
                if (i10 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= composerStartRestartGroup.changed(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i11 = i4 & 512;
                if (i11 != 0) {
                    i5 |= 805306368;
                } else {
                    if ((i2 & 1879048192) == 0) {
                        i12 = i11;
                        i5 |= composerStartRestartGroup.changed(function24) ? 536870912 : 268435456;
                    }
                    i13 = i4 & 1024;
                    if (i13 == 0) {
                        i15 = i3 | 6;
                        i14 = i13;
                    } else if ((i3 & 14) == 0) {
                        i14 = i13;
                        i15 = i3 | (composerStartRestartGroup.changed(function25) ? 4 : 2);
                    } else {
                        i14 = i13;
                        i15 = i3;
                    }
                    i16 = i4 & 2048;
                    if (i16 == 0) {
                        i15 |= 48;
                        i17 = i16;
                    } else if ((i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                        i17 = i16;
                        i15 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
                    } else {
                        i17 = i16;
                    }
                    int i30 = i15;
                    i18 = i4 & 4096;
                    if (i18 != 0) {
                        i19 = i30;
                        if ((i3 & 896) == 0) {
                            i19 |= composerStartRestartGroup.changed(visualTransformation) ? 256 : 128;
                        }
                        if ((i3 & 7168) == 0) {
                            i19 |= ((i4 & 8192) == 0 && composerStartRestartGroup.changed(keyboardOptions)) ? 2048 : 1024;
                        }
                        if ((i3 & 57344) == 0) {
                            i19 |= ((i4 & 16384) == 0 && composerStartRestartGroup.changed(keyboardActions)) ? 16384 : 8192;
                        }
                        i20 = i4 & 32768;
                        if (i20 != 0) {
                            i19 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i3 & 458752) == 0) {
                            i19 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
                        }
                        i21 = i4 & 65536;
                        if (i21 != 0) {
                            i19 |= 1572864;
                        } else if ((i3 & 3670016) == 0) {
                            i19 |= composerStartRestartGroup.changed(i) ? 1048576 : 524288;
                        }
                        i22 = i4 & 131072;
                        if (i22 != 0) {
                            i19 |= 12582912;
                        } else if ((i3 & 29360128) == 0) {
                            i19 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                        }
                        if ((i3 & 234881024) == 0) {
                            i19 |= ((i4 & 262144) == 0 && composerStartRestartGroup.changed(shape)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        if ((i3 & 1879048192) == 0) {
                            i19 |= ((i4 & 524288) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 536870912 : 268435456;
                        }
                        int i31 = i19;
                        if ((i5 & 1533916891) != 306783378 || (1533916891 & i31) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            int i32 = i5;
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                companion = i29 == 0 ? Modifier.INSTANCE : modifier2;
                                boolean z13 = i6 == 0 ? true : z5;
                                boolean z14 = i7 == 0 ? false : z6;
                                if ((i4 & 32) == 0) {
                                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume = composerStartRestartGroup.consume(localTextStyle);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    textStyle3 = (TextStyle) objConsume;
                                    i23 = i32 & (-458753);
                                } else {
                                    i23 = i32;
                                    textStyle3 = textStyle2;
                                }
                                Function2<? super Composer, ? super Integer, Unit> function218 = i8 == 0 ? null : function26;
                                Function2<? super Composer, ? super Integer, Unit> function219 = i9 == 0 ? null : function27;
                                Function2<? super Composer, ? super Integer, Unit> function220 = i10 == 0 ? null : function23;
                                Function2<? super Composer, ? super Integer, Unit> function221 = i12 == 0 ? null : function24;
                                Function2<? super Composer, ? super Integer, Unit> function222 = i14 == 0 ? null : function25;
                                boolean z15 = i17 == 0 ? false : z3;
                                VisualTransformation none = i18 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                if ((i4 & 8192) == 0) {
                                    i24 = i31 & (-7169);
                                    keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                                } else {
                                    i24 = i31;
                                    keyboardOptions2 = keyboardOptions;
                                }
                                if ((i4 & 16384) == 0) {
                                    i24 &= -57345;
                                    keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                                } else {
                                    keyboardActions2 = keyboardActions;
                                }
                                boolean z16 = i20 == 0 ? false : z4;
                                int i33 = i21 == 0 ? Integer.MAX_VALUE : i;
                                if (i22 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if ((i4 & 262144) == 0) {
                                    i24 &= -234881025;
                                    filledShape = TextFieldDefaults.INSTANCE.getFilledShape(composerStartRestartGroup, 6);
                                } else {
                                    filledShape = shape;
                                }
                                int i34 = i24;
                                if ((i4 & 524288) == 0) {
                                    composer2 = composerStartRestartGroup;
                                    keyboardOptions3 = keyboardOptions2;
                                    c = 0;
                                    function28 = function220;
                                    textFieldColorsM2512textFieldColorsl59Burw = TextFieldDefaults.INSTANCE.m2512textFieldColorsl59Burw(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 100663296, 268435455);
                                    i27 = i34 & (-1879048193);
                                    z5 = z13;
                                    z6 = z14;
                                    textStyle4 = textStyle3;
                                    i25 = i23;
                                    function29 = function218;
                                    function210 = function219;
                                    function211 = function221;
                                    function212 = function222;
                                    z7 = z15;
                                    visualTransformation2 = none;
                                    keyboardActions3 = keyboardActions2;
                                    z8 = z16;
                                    i26 = i33;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    shape2 = filledShape;
                                } else {
                                    composer2 = composerStartRestartGroup;
                                    keyboardOptions3 = keyboardOptions2;
                                    c = 0;
                                    function28 = function220;
                                    z5 = z13;
                                    z6 = z14;
                                    textStyle4 = textStyle3;
                                    i25 = i23;
                                    function29 = function218;
                                    function210 = function219;
                                    function211 = function221;
                                    function212 = function222;
                                    z7 = z15;
                                    visualTransformation2 = none;
                                    keyboardActions3 = keyboardActions2;
                                    z8 = z16;
                                    i26 = i33;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    shape2 = filledShape;
                                    i27 = i34;
                                    textFieldColorsM2512textFieldColorsl59Burw = textFieldColors;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                int i35 = (i4 & 32) != 0 ? i32 & (-458753) : i32;
                                if ((i4 & 8192) != 0) {
                                    i31 &= -7169;
                                }
                                if ((i4 & 16384) != 0) {
                                    i31 &= -57345;
                                }
                                if ((i4 & 262144) != 0) {
                                    i31 &= -234881025;
                                }
                                if ((i4 & 524288) != 0) {
                                    i31 &= -1879048193;
                                }
                                function28 = function23;
                                function211 = function24;
                                function212 = function25;
                                z7 = z3;
                                keyboardOptions3 = keyboardOptions;
                                i26 = i;
                                shape2 = shape;
                                i27 = i31;
                                c = 0;
                                textStyle4 = textStyle2;
                                function29 = function26;
                                function210 = function27;
                                visualTransformation2 = visualTransformation;
                                keyboardActions3 = keyboardActions;
                                z8 = z4;
                                textFieldColorsM2512textFieldColorsl59Burw = textFieldColors;
                                composer2 = composerStartRestartGroup;
                                i25 = i35;
                                companion = modifier2;
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                modifier3 = companion;
                            } else {
                                modifier3 = companion;
                                ComposerKt.traceEventStart(-1571072018, i25, i27, "androidx.compose.material3.TextField (TextField.kt:157)");
                            }
                            composer2.startReplaceableGroup(-1263332264);
                            ComposerKt.sourceInformation(composer2, "*181@9342L18");
                            jM5632getColor0d7_KjU = textStyle4.m5632getColor0d7_KjU();
                            if (jM5632getColor0d7_KjU == Color.INSTANCE.m3693getUnspecified0d7_KjU()) {
                                jM5632getColor0d7_KjU = textFieldColorsM2512textFieldColorsl59Burw.textColor$material3_release(z5, composer2, ((i25 >> 9) & 14) | ((i27 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).getValue().m3667unboximpl();
                            }
                            composer2.endReplaceableGroup();
                            final TextStyle textStyleMerge = textStyle4.merge(new TextStyle(jM5632getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
                            ProvidedValue[] providedValueArr = new ProvidedValue[1];
                            providedValueArr[c] = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColorsM2512textFieldColorsl59Burw.getSelectionColors(composer2, (i27 >> 27) & 14));
                            final Modifier modifier5 = modifier3;
                            TextStyle textStyle6 = textStyle4;
                            final int i36 = i25;
                            Composer composer4 = composer2;
                            final boolean z17 = z5;
                            final boolean z18 = z6;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer4, -1197699922, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.2
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

                                public final void invoke(Composer composer5, int i37) {
                                    ComposerKt.sourceInformation(composer5, "C198@10029L20,187@9591L1628:TextField.kt#uh7d8r");
                                    if ((i37 & 11) != 2 || !composer5.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1197699922, i37, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:185)");
                                        }
                                        Modifier modifierM1049defaultMinSizeVpY3zN4 = SizeKt.m1049defaultMinSizeVpY3zN4(modifier5, TextFieldDefaults.INSTANCE.m2506getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2505getMinHeightD9Ej5fM());
                                        TextFieldColors textFieldColors3 = textFieldColorsM2512textFieldColorsl59Burw;
                                        boolean z19 = z7;
                                        int i38 = i27;
                                        SolidColor solidColor = new SolidColor(textFieldColors3.cursorColor$material3_release(z19, composer5, ((i38 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i38 >> 3) & 14)).getValue().m3667unboximpl(), null);
                                        String str = value;
                                        Function1<String, Unit> function1 = onValueChange;
                                        boolean z20 = z17;
                                        boolean z21 = z18;
                                        TextStyle textStyle7 = textStyleMerge;
                                        KeyboardOptions keyboardOptions5 = keyboardOptions3;
                                        KeyboardActions keyboardActions5 = keyboardActions3;
                                        boolean z22 = z8;
                                        int i39 = i26;
                                        VisualTransformation visualTransformation4 = visualTransformation2;
                                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                                        SolidColor solidColor2 = solidColor;
                                        final String str2 = value;
                                        final boolean z23 = z17;
                                        final boolean z24 = z8;
                                        final VisualTransformation visualTransformation5 = visualTransformation2;
                                        final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                                        final boolean z25 = z7;
                                        final Function2<Composer, Integer, Unit> function223 = function29;
                                        final Function2<Composer, Integer, Unit> function224 = function210;
                                        final Function2<Composer, Integer, Unit> function225 = function28;
                                        final Function2<Composer, Integer, Unit> function226 = function211;
                                        final Function2<Composer, Integer, Unit> function227 = function212;
                                        final Shape shape4 = shape2;
                                        final TextFieldColors textFieldColors4 = textFieldColorsM2512textFieldColorsl59Burw;
                                        final int i40 = i36;
                                        final int i41 = i27;
                                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer5, 172557367, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function228, Composer composer6, Integer num) {
                                                invoke((Function2<? super Composer, ? super Integer, Unit>) function228, composer6, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer6, int i42) {
                                                int i43;
                                                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                                ComposerKt.sourceInformation(composer6, "C207@10517L678:TextField.kt#uh7d8r");
                                                if ((i42 & 14) == 0) {
                                                    i43 = i42 | (composer6.changed(innerTextField) ? 4 : 2);
                                                } else {
                                                    i43 = i42;
                                                }
                                                if ((i43 & 91) != 18 || !composer6.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(172557367, i43, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:205)");
                                                    }
                                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                    int i44 = i43;
                                                    String str3 = str2;
                                                    boolean z26 = z23;
                                                    boolean z27 = z24;
                                                    VisualTransformation visualTransformation6 = visualTransformation5;
                                                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6;
                                                    boolean z28 = z25;
                                                    Function2<Composer, Integer, Unit> function228 = function223;
                                                    Function2<Composer, Integer, Unit> function229 = function224;
                                                    Function2<Composer, Integer, Unit> function230 = function225;
                                                    Function2<Composer, Integer, Unit> function231 = function226;
                                                    Function2<Composer, Integer, Unit> function232 = function227;
                                                    Shape shape5 = shape4;
                                                    TextFieldColors textFieldColors5 = textFieldColors4;
                                                    int i45 = i40;
                                                    int i46 = (i45 & 14) | ((i44 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i45 >> 3) & 896);
                                                    int i47 = i41;
                                                    textFieldDefaults.TextFieldDecorationBox(str3, innerTextField, z26, z27, visualTransformation6, mutableInteractionSource7, z28, function228, function229, function230, function231, function232, shape5, textFieldColors5, null, null, composer6, i46 | ((i47 >> 6) & 7168) | ((i47 << 6) & 57344) | ((i47 >> 6) & 458752) | ((i47 << 15) & 3670016) | ((i45 << 3) & 29360128) | ((i45 << 3) & 234881024) | ((i45 << 3) & 1879048192), ((i45 >> 27) & 14) | 1572864 | ((i47 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i47 >> 18) & 896) | ((i47 >> 18) & 7168), 49152);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer6.skipToGroupEnd();
                                            }
                                        });
                                        int i42 = (i36 & 64638) | ((i27 << 9) & 3670016) | (KeyboardActions.$stable << 21);
                                        int i43 = i27;
                                        BasicTextFieldKt.BasicTextField(str, function1, modifierM1049defaultMinSizeVpY3zN4, z20, z21, textStyle7, keyboardOptions5, keyboardActions5, z22, i39, visualTransformation4, (Function1) null, mutableInteractionSource5, solidColor2, composableLambda, composer5, i42 | ((i43 << 9) & 29360128) | ((i43 << 9) & 234881024) | ((i43 << 9) & 1879048192), ((i43 >> 6) & 14) | 24576 | ((i43 >> 15) & 896), 2048);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer5.skipToGroupEnd();
                                }
                            }), composer4, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3 = composer4;
                            z9 = z17;
                            z10 = z18;
                            z11 = z8;
                            function213 = function29;
                            function214 = function210;
                            function215 = function28;
                            shape3 = shape2;
                            textStyle5 = textStyle6;
                            z12 = z7;
                            i28 = i26;
                            visualTransformation3 = visualTransformation2;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier5;
                            keyboardOptions4 = keyboardOptions3;
                            keyboardActions4 = keyboardActions3;
                            function216 = function211;
                            function217 = function212;
                            textFieldColors2 = textFieldColorsM2512textFieldColorsl59Burw;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function216 = function24;
                            visualTransformation3 = visualTransformation;
                            z11 = z4;
                            i28 = i;
                            mutableInteractionSource4 = mutableInteractionSource;
                            shape3 = shape;
                            textFieldColors2 = textFieldColors;
                            composer3 = composerStartRestartGroup;
                            z9 = z5;
                            z10 = z6;
                            textStyle5 = textStyle2;
                            function213 = function26;
                            function214 = function27;
                            modifier4 = modifier2;
                            function215 = function23;
                            function217 = function25;
                            z12 = z3;
                            keyboardOptions4 = keyboardOptions;
                            keyboardActions4 = keyboardActions;
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.3
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

                            public final void invoke(Composer composer5, int i37) {
                                TextFieldKt.TextField(value, onValueChange, modifier4, z9, z10, textStyle5, function213, function214, function215, function216, function217, z12, visualTransformation3, keyboardOptions4, keyboardActions4, z11, i28, mutableInteractionSource4, shape3, textFieldColors2, composer5, i2 | 1, i3, i4);
                            }
                        });
                        return;
                    }
                    i19 = i30 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                    if ((i3 & 7168) == 0) {
                    }
                    if ((i3 & 57344) == 0) {
                    }
                    i20 = i4 & 32768;
                    if (i20 != 0) {
                    }
                    i21 = i4 & 65536;
                    if (i21 != 0) {
                    }
                    i22 = i4 & 131072;
                    if (i22 != 0) {
                    }
                    if ((i3 & 234881024) == 0) {
                    }
                    if ((i3 & 1879048192) == 0) {
                    }
                    int i312 = i19;
                    if ((i5 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        int i322 = i5;
                        if ((i2 & 1) != 0) {
                            if (i29 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if ((i4 & 32) == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if ((i4 & 8192) == 0) {
                            }
                            if ((i4 & 16384) == 0) {
                            }
                            if (i20 == 0) {
                            }
                            if (i21 == 0) {
                            }
                            if (i22 == 0) {
                            }
                            if ((i4 & 262144) == 0) {
                            }
                            int i342 = i24;
                            if ((i4 & 524288) == 0) {
                            }
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2.startReplaceableGroup(-1263332264);
                            ComposerKt.sourceInformation(composer2, "*181@9342L18");
                            jM5632getColor0d7_KjU = textStyle4.m5632getColor0d7_KjU();
                            if (jM5632getColor0d7_KjU == Color.INSTANCE.m3693getUnspecified0d7_KjU()) {
                            }
                            composer2.endReplaceableGroup();
                            final TextStyle textStyleMerge2 = textStyle4.merge(new TextStyle(jM5632getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
                            ProvidedValue[] providedValueArr2 = new ProvidedValue[1];
                            providedValueArr2[c] = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColorsM2512textFieldColorsl59Burw.getSelectionColors(composer2, (i27 >> 27) & 14));
                            final Modifier modifier52 = modifier3;
                            TextStyle textStyle62 = textStyle4;
                            final int i362 = i25;
                            Composer composer42 = composer2;
                            final boolean z172 = z5;
                            final boolean z182 = z6;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr2, ComposableLambdaKt.composableLambda(composer42, -1197699922, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.2
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

                                public final void invoke(Composer composer5, int i37) {
                                    ComposerKt.sourceInformation(composer5, "C198@10029L20,187@9591L1628:TextField.kt#uh7d8r");
                                    if ((i37 & 11) != 2 || !composer5.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1197699922, i37, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:185)");
                                        }
                                        Modifier modifierM1049defaultMinSizeVpY3zN4 = SizeKt.m1049defaultMinSizeVpY3zN4(modifier52, TextFieldDefaults.INSTANCE.m2506getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2505getMinHeightD9Ej5fM());
                                        TextFieldColors textFieldColors3 = textFieldColorsM2512textFieldColorsl59Burw;
                                        boolean z19 = z7;
                                        int i38 = i27;
                                        SolidColor solidColor = new SolidColor(textFieldColors3.cursorColor$material3_release(z19, composer5, ((i38 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i38 >> 3) & 14)).getValue().m3667unboximpl(), null);
                                        String str = value;
                                        Function1<String, Unit> function1 = onValueChange;
                                        boolean z20 = z172;
                                        boolean z21 = z182;
                                        TextStyle textStyle7 = textStyleMerge2;
                                        KeyboardOptions keyboardOptions5 = keyboardOptions3;
                                        KeyboardActions keyboardActions5 = keyboardActions3;
                                        boolean z22 = z8;
                                        int i39 = i26;
                                        VisualTransformation visualTransformation4 = visualTransformation2;
                                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                                        SolidColor solidColor2 = solidColor;
                                        final String str2 = value;
                                        final boolean z23 = z172;
                                        final boolean z24 = z8;
                                        final VisualTransformation visualTransformation5 = visualTransformation2;
                                        final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                                        final boolean z25 = z7;
                                        final Function2<? super Composer, ? super Integer, Unit> function223 = function29;
                                        final Function2<? super Composer, ? super Integer, Unit> function224 = function210;
                                        final Function2<? super Composer, ? super Integer, Unit> function225 = function28;
                                        final Function2<? super Composer, ? super Integer, Unit> function226 = function211;
                                        final Function2<? super Composer, ? super Integer, Unit> function227 = function212;
                                        final Shape shape4 = shape2;
                                        final TextFieldColors textFieldColors4 = textFieldColorsM2512textFieldColorsl59Burw;
                                        final int i40 = i362;
                                        final int i41 = i27;
                                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer5, 172557367, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function228, Composer composer6, Integer num) {
                                                invoke((Function2<? super Composer, ? super Integer, Unit>) function228, composer6, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer6, int i42) {
                                                int i43;
                                                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                                ComposerKt.sourceInformation(composer6, "C207@10517L678:TextField.kt#uh7d8r");
                                                if ((i42 & 14) == 0) {
                                                    i43 = i42 | (composer6.changed(innerTextField) ? 4 : 2);
                                                } else {
                                                    i43 = i42;
                                                }
                                                if ((i43 & 91) != 18 || !composer6.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(172557367, i43, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:205)");
                                                    }
                                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                    int i44 = i43;
                                                    String str3 = str2;
                                                    boolean z26 = z23;
                                                    boolean z27 = z24;
                                                    VisualTransformation visualTransformation6 = visualTransformation5;
                                                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6;
                                                    boolean z28 = z25;
                                                    Function2<Composer, Integer, Unit> function228 = function223;
                                                    Function2<Composer, Integer, Unit> function229 = function224;
                                                    Function2<Composer, Integer, Unit> function230 = function225;
                                                    Function2<Composer, Integer, Unit> function231 = function226;
                                                    Function2<Composer, Integer, Unit> function232 = function227;
                                                    Shape shape5 = shape4;
                                                    TextFieldColors textFieldColors5 = textFieldColors4;
                                                    int i45 = i40;
                                                    int i46 = (i45 & 14) | ((i44 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i45 >> 3) & 896);
                                                    int i47 = i41;
                                                    textFieldDefaults.TextFieldDecorationBox(str3, innerTextField, z26, z27, visualTransformation6, mutableInteractionSource7, z28, function228, function229, function230, function231, function232, shape5, textFieldColors5, null, null, composer6, i46 | ((i47 >> 6) & 7168) | ((i47 << 6) & 57344) | ((i47 >> 6) & 458752) | ((i47 << 15) & 3670016) | ((i45 << 3) & 29360128) | ((i45 << 3) & 234881024) | ((i45 << 3) & 1879048192), ((i45 >> 27) & 14) | 1572864 | ((i47 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i47 >> 18) & 896) | ((i47 >> 18) & 7168), 49152);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer6.skipToGroupEnd();
                                            }
                                        });
                                        int i42 = (i362 & 64638) | ((i27 << 9) & 3670016) | (KeyboardActions.$stable << 21);
                                        int i43 = i27;
                                        BasicTextFieldKt.BasicTextField(str, function1, modifierM1049defaultMinSizeVpY3zN4, z20, z21, textStyle7, keyboardOptions5, keyboardActions5, z22, i39, visualTransformation4, (Function1) null, mutableInteractionSource5, solidColor2, composableLambda, composer5, i42 | ((i43 << 9) & 29360128) | ((i43 << 9) & 234881024) | ((i43 << 9) & 1879048192), ((i43 >> 6) & 14) | 24576 | ((i43 >> 15) & 896), 2048);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer5.skipToGroupEnd();
                                }
                            }), composer42, 56);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer3 = composer42;
                            z9 = z172;
                            z10 = z182;
                            z11 = z8;
                            function213 = function29;
                            function214 = function210;
                            function215 = function28;
                            shape3 = shape2;
                            textStyle5 = textStyle62;
                            z12 = z7;
                            i28 = i26;
                            visualTransformation3 = visualTransformation2;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier52;
                            keyboardOptions4 = keyboardOptions3;
                            keyboardActions4 = keyboardActions3;
                            function216 = function211;
                            function217 = function212;
                            textFieldColors2 = textFieldColorsM2512textFieldColorsl59Burw;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i12 = i11;
                i13 = i4 & 1024;
                if (i13 == 0) {
                }
                i16 = i4 & 2048;
                if (i16 == 0) {
                }
                int i302 = i15;
                i18 = i4 & 4096;
                if (i18 != 0) {
                }
                if ((i3 & 7168) == 0) {
                }
                if ((i3 & 57344) == 0) {
                }
                i20 = i4 & 32768;
                if (i20 != 0) {
                }
                i21 = i4 & 65536;
                if (i21 != 0) {
                }
                i22 = i4 & 131072;
                if (i22 != 0) {
                }
                if ((i3 & 234881024) == 0) {
                }
                if ((i3 & 1879048192) == 0) {
                }
                int i3122 = i19;
                if ((i5 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z5 = z;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            if ((i2 & 458752) == 0) {
            }
            i8 = i4 & 64;
            if (i8 != 0) {
            }
            i9 = i4 & 128;
            if (i9 != 0) {
            }
            i10 = i4 & 256;
            if (i10 != 0) {
            }
            i11 = i4 & 512;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i4 & 1024;
            if (i13 == 0) {
            }
            i16 = i4 & 2048;
            if (i16 == 0) {
            }
            int i3022 = i15;
            i18 = i4 & 4096;
            if (i18 != 0) {
            }
            if ((i3 & 7168) == 0) {
            }
            if ((i3 & 57344) == 0) {
            }
            i20 = i4 & 32768;
            if (i20 != 0) {
            }
            i21 = i4 & 65536;
            if (i21 != 0) {
            }
            i22 = i4 & 131072;
            if (i22 != 0) {
            }
            if ((i3 & 234881024) == 0) {
            }
            if ((i3 & 1879048192) == 0) {
            }
            int i31222 = i19;
            if ((i5 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        z5 = z;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        if ((i2 & 458752) == 0) {
        }
        i8 = i4 & 64;
        if (i8 != 0) {
        }
        i9 = i4 & 128;
        if (i9 != 0) {
        }
        i10 = i4 & 256;
        if (i10 != 0) {
        }
        i11 = i4 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i4 & 1024;
        if (i13 == 0) {
        }
        i16 = i4 & 2048;
        if (i16 == 0) {
        }
        int i30222 = i15;
        i18 = i4 & 4096;
        if (i18 != 0) {
        }
        if ((i3 & 7168) == 0) {
        }
        if ((i3 & 57344) == 0) {
        }
        i20 = i4 & 32768;
        if (i20 != 0) {
        }
        i21 = i4 & 65536;
        if (i21 != 0) {
        }
        i22 = i4 & 131072;
        if (i22 != 0) {
        }
        if ((i3 & 234881024) == 0) {
        }
        if ((i3 & 1879048192) == 0) {
        }
        int i312222 = i19;
        if ((i5 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0603 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013d  */
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextField(final TextFieldValue value, final Function1<? super TextFieldValue, Unit> onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        boolean z5;
        int i7;
        boolean z6;
        TextStyle textStyle2;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i9;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i10;
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
        Modifier.Companion companion;
        int i23;
        TextStyle textStyle3;
        int i24;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        MutableInteractionSource mutableInteractionSource2;
        Shape filledShape;
        Composer composer2;
        final KeyboardOptions keyboardOptions3;
        char c;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        TextStyle textStyle4;
        int i25;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final boolean z7;
        final VisualTransformation visualTransformation2;
        final KeyboardActions keyboardActions3;
        final boolean z8;
        final int i26;
        final MutableInteractionSource mutableInteractionSource3;
        final Shape shape2;
        final int i27;
        final TextFieldColors textFieldColorsM2512textFieldColorsl59Burw;
        Modifier modifier3;
        long jM5632getColor0d7_KjU;
        Composer composer3;
        final boolean z9;
        final boolean z10;
        final boolean z11;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        final Shape shape3;
        final TextStyle textStyle5;
        final boolean z12;
        final int i28;
        final VisualTransformation visualTransformation3;
        final MutableInteractionSource mutableInteractionSource4;
        final Modifier modifier4;
        final KeyboardOptions keyboardOptions4;
        final KeyboardActions keyboardActions4;
        final Function2<? super Composer, ? super Integer, Unit> function216;
        final Function2<? super Composer, ? super Integer, Unit> function217;
        final TextFieldColors textFieldColors2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-830955973);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TextField)P(18,10,9,1,12,16,6,11,7,17,15,3,19,5,4,14,8,2,13)300@15974L7,312@16588L39,313@16666L11,314@16727L17,322@17070L15,322@17004L1780:TextField.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i5 |= composerStartRestartGroup.changed(onValueChange) ? 32 : 16;
        }
        int i29 = i4 & 4;
        if (i29 != 0) {
            i5 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i2 & 896) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 7168) == 0) {
                    z5 = z;
                    i5 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
                }
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                    z6 = z2;
                } else {
                    z6 = z2;
                    if ((i2 & 57344) == 0) {
                        i5 |= composerStartRestartGroup.changed(z6) ? 16384 : 8192;
                    }
                }
                if ((i2 & 458752) == 0) {
                    textStyle2 = textStyle;
                    i5 |= ((i4 & 32) == 0 && composerStartRestartGroup.changed(textStyle2)) ? 131072 : 65536;
                } else {
                    textStyle2 = textStyle;
                }
                i8 = i4 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                    function26 = function2;
                } else {
                    function26 = function2;
                    if ((i2 & 3670016) == 0) {
                        i5 |= composerStartRestartGroup.changed(function26) ? 1048576 : 524288;
                    }
                }
                i9 = i4 & 128;
                if (i9 != 0) {
                    i5 |= 12582912;
                    function27 = function22;
                } else {
                    function27 = function22;
                    if ((i2 & 29360128) == 0) {
                        i5 |= composerStartRestartGroup.changed(function27) ? 8388608 : 4194304;
                    }
                }
                i10 = i4 & 256;
                if (i10 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= composerStartRestartGroup.changed(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i11 = i4 & 512;
                if (i11 != 0) {
                    i5 |= 805306368;
                } else {
                    if ((i2 & 1879048192) == 0) {
                        i12 = i11;
                        i5 |= composerStartRestartGroup.changed(function24) ? 536870912 : 268435456;
                    }
                    i13 = i4 & 1024;
                    if (i13 == 0) {
                        i15 = i3 | 6;
                        i14 = i13;
                    } else if ((i3 & 14) == 0) {
                        i14 = i13;
                        i15 = i3 | (composerStartRestartGroup.changed(function25) ? 4 : 2);
                    } else {
                        i14 = i13;
                        i15 = i3;
                    }
                    i16 = i4 & 2048;
                    if (i16 == 0) {
                        i15 |= 48;
                        i17 = i16;
                    } else if ((i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                        i17 = i16;
                        i15 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
                    } else {
                        i17 = i16;
                    }
                    int i30 = i15;
                    i18 = i4 & 4096;
                    if (i18 != 0) {
                        i19 = i30;
                        if ((i3 & 896) == 0) {
                            i19 |= composerStartRestartGroup.changed(visualTransformation) ? 256 : 128;
                        }
                        if ((i3 & 7168) == 0) {
                            i19 |= ((i4 & 8192) == 0 && composerStartRestartGroup.changed(keyboardOptions)) ? 2048 : 1024;
                        }
                        if ((i3 & 57344) == 0) {
                            i19 |= ((i4 & 16384) == 0 && composerStartRestartGroup.changed(keyboardActions)) ? 16384 : 8192;
                        }
                        i20 = i4 & 32768;
                        if (i20 != 0) {
                            i19 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i3 & 458752) == 0) {
                            i19 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
                        }
                        i21 = i4 & 65536;
                        if (i21 != 0) {
                            i19 |= 1572864;
                        } else if ((i3 & 3670016) == 0) {
                            i19 |= composerStartRestartGroup.changed(i) ? 1048576 : 524288;
                        }
                        i22 = i4 & 131072;
                        if (i22 != 0) {
                            i19 |= 12582912;
                        } else if ((i3 & 29360128) == 0) {
                            i19 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                        }
                        if ((i3 & 234881024) == 0) {
                            i19 |= ((i4 & 262144) == 0 && composerStartRestartGroup.changed(shape)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        if ((i3 & 1879048192) == 0) {
                            i19 |= ((i4 & 524288) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 536870912 : 268435456;
                        }
                        int i31 = i19;
                        if ((i5 & 1533916891) != 306783378 || (1533916891 & i31) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            int i32 = i5;
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                companion = i29 == 0 ? Modifier.INSTANCE : modifier2;
                                boolean z13 = i6 == 0 ? true : z5;
                                boolean z14 = i7 == 0 ? false : z6;
                                if ((i4 & 32) == 0) {
                                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume = composerStartRestartGroup.consume(localTextStyle);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    textStyle3 = (TextStyle) objConsume;
                                    i23 = i32 & (-458753);
                                } else {
                                    i23 = i32;
                                    textStyle3 = textStyle2;
                                }
                                Function2<? super Composer, ? super Integer, Unit> function218 = i8 == 0 ? null : function26;
                                Function2<? super Composer, ? super Integer, Unit> function219 = i9 == 0 ? null : function27;
                                Function2<? super Composer, ? super Integer, Unit> function220 = i10 == 0 ? null : function23;
                                Function2<? super Composer, ? super Integer, Unit> function221 = i12 == 0 ? null : function24;
                                Function2<? super Composer, ? super Integer, Unit> function222 = i14 == 0 ? null : function25;
                                boolean z15 = i17 == 0 ? false : z3;
                                VisualTransformation none = i18 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                if ((i4 & 8192) == 0) {
                                    i24 = i31 & (-7169);
                                    keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                                } else {
                                    i24 = i31;
                                    keyboardOptions2 = keyboardOptions;
                                }
                                if ((i4 & 16384) == 0) {
                                    i24 &= -57345;
                                    keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                                } else {
                                    keyboardActions2 = keyboardActions;
                                }
                                boolean z16 = i20 == 0 ? false : z4;
                                int i33 = i21 == 0 ? Integer.MAX_VALUE : i;
                                if (i22 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if ((i4 & 262144) == 0) {
                                    i24 &= -234881025;
                                    filledShape = TextFieldDefaults.INSTANCE.getFilledShape(composerStartRestartGroup, 6);
                                } else {
                                    filledShape = shape;
                                }
                                int i34 = i24;
                                if ((i4 & 524288) == 0) {
                                    composer2 = composerStartRestartGroup;
                                    keyboardOptions3 = keyboardOptions2;
                                    c = 0;
                                    function28 = function220;
                                    textFieldColorsM2512textFieldColorsl59Burw = TextFieldDefaults.INSTANCE.m2512textFieldColorsl59Burw(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 100663296, 268435455);
                                    i27 = i34 & (-1879048193);
                                    z5 = z13;
                                    z6 = z14;
                                    textStyle4 = textStyle3;
                                    i25 = i23;
                                    function29 = function218;
                                    function210 = function219;
                                    function211 = function221;
                                    function212 = function222;
                                    z7 = z15;
                                    visualTransformation2 = none;
                                    keyboardActions3 = keyboardActions2;
                                    z8 = z16;
                                    i26 = i33;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    shape2 = filledShape;
                                } else {
                                    composer2 = composerStartRestartGroup;
                                    keyboardOptions3 = keyboardOptions2;
                                    c = 0;
                                    function28 = function220;
                                    z5 = z13;
                                    z6 = z14;
                                    textStyle4 = textStyle3;
                                    i25 = i23;
                                    function29 = function218;
                                    function210 = function219;
                                    function211 = function221;
                                    function212 = function222;
                                    z7 = z15;
                                    visualTransformation2 = none;
                                    keyboardActions3 = keyboardActions2;
                                    z8 = z16;
                                    i26 = i33;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    shape2 = filledShape;
                                    i27 = i34;
                                    textFieldColorsM2512textFieldColorsl59Burw = textFieldColors;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                int i35 = (i4 & 32) != 0 ? i32 & (-458753) : i32;
                                if ((i4 & 8192) != 0) {
                                    i31 &= -7169;
                                }
                                if ((i4 & 16384) != 0) {
                                    i31 &= -57345;
                                }
                                if ((i4 & 262144) != 0) {
                                    i31 &= -234881025;
                                }
                                if ((i4 & 524288) != 0) {
                                    i31 &= -1879048193;
                                }
                                function28 = function23;
                                function211 = function24;
                                function212 = function25;
                                z7 = z3;
                                keyboardOptions3 = keyboardOptions;
                                i26 = i;
                                shape2 = shape;
                                i27 = i31;
                                c = 0;
                                textStyle4 = textStyle2;
                                function29 = function26;
                                function210 = function27;
                                visualTransformation2 = visualTransformation;
                                keyboardActions3 = keyboardActions;
                                z8 = z4;
                                textFieldColorsM2512textFieldColorsl59Burw = textFieldColors;
                                composer2 = composerStartRestartGroup;
                                i25 = i35;
                                companion = modifier2;
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                modifier3 = companion;
                            } else {
                                modifier3 = companion;
                                ComposerKt.traceEventStart(-830955973, i25, i27, "androidx.compose.material3.TextField (TextField.kt:294)");
                            }
                            composer2.startReplaceableGroup(-1263324710);
                            ComposerKt.sourceInformation(composer2, "*318@16896L18");
                            jM5632getColor0d7_KjU = textStyle4.m5632getColor0d7_KjU();
                            if (jM5632getColor0d7_KjU == Color.INSTANCE.m3693getUnspecified0d7_KjU()) {
                                jM5632getColor0d7_KjU = textFieldColorsM2512textFieldColorsl59Burw.textColor$material3_release(z5, composer2, ((i25 >> 9) & 14) | ((i27 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).getValue().m3667unboximpl();
                            }
                            composer2.endReplaceableGroup();
                            final TextStyle textStyleMerge = textStyle4.merge(new TextStyle(jM5632getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
                            ProvidedValue[] providedValueArr = new ProvidedValue[1];
                            providedValueArr[c] = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColorsM2512textFieldColorsl59Burw.getSelectionColors(composer2, (i27 >> 27) & 14));
                            final Modifier modifier5 = modifier3;
                            TextStyle textStyle6 = textStyle4;
                            final int i36 = i25;
                            Composer composer4 = composer2;
                            final boolean z17 = z5;
                            final boolean z18 = z6;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer4, 765006587, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.5
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

                                public final void invoke(Composer composer5, int i37) {
                                    ComposerKt.sourceInformation(composer5, "C335@17583L20,324@17145L1633:TextField.kt#uh7d8r");
                                    if ((i37 & 11) != 2 || !composer5.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(765006587, i37, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:322)");
                                        }
                                        Modifier modifierM1049defaultMinSizeVpY3zN4 = SizeKt.m1049defaultMinSizeVpY3zN4(modifier5, TextFieldDefaults.INSTANCE.m2506getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2505getMinHeightD9Ej5fM());
                                        TextFieldColors textFieldColors3 = textFieldColorsM2512textFieldColorsl59Burw;
                                        boolean z19 = z7;
                                        int i38 = i27;
                                        SolidColor solidColor = new SolidColor(textFieldColors3.cursorColor$material3_release(z19, composer5, ((i38 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i38 >> 3) & 14)).getValue().m3667unboximpl(), null);
                                        TextFieldValue textFieldValue = value;
                                        Function1<TextFieldValue, Unit> function1 = onValueChange;
                                        boolean z20 = z17;
                                        boolean z21 = z18;
                                        TextStyle textStyle7 = textStyleMerge;
                                        KeyboardOptions keyboardOptions5 = keyboardOptions3;
                                        KeyboardActions keyboardActions5 = keyboardActions3;
                                        boolean z22 = z8;
                                        int i39 = i26;
                                        VisualTransformation visualTransformation4 = visualTransformation2;
                                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                                        SolidColor solidColor2 = solidColor;
                                        final TextFieldValue textFieldValue2 = value;
                                        final boolean z23 = z17;
                                        final boolean z24 = z8;
                                        final VisualTransformation visualTransformation5 = visualTransformation2;
                                        final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                                        final boolean z25 = z7;
                                        final Function2<Composer, Integer, Unit> function223 = function29;
                                        final Function2<Composer, Integer, Unit> function224 = function210;
                                        final Function2<Composer, Integer, Unit> function225 = function28;
                                        final Function2<Composer, Integer, Unit> function226 = function211;
                                        final Function2<Composer, Integer, Unit> function227 = function212;
                                        final Shape shape4 = shape2;
                                        final TextFieldColors textFieldColors4 = textFieldColorsM2512textFieldColorsl59Burw;
                                        final int i40 = i36;
                                        final int i41 = i27;
                                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer5, 998109572, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.5.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function228, Composer composer6, Integer num) {
                                                invoke((Function2<? super Composer, ? super Integer, Unit>) function228, composer6, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer6, int i42) {
                                                int i43;
                                                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                                ComposerKt.sourceInformation(composer6, "C344@18071L683:TextField.kt#uh7d8r");
                                                if ((i42 & 14) == 0) {
                                                    i43 = i42 | (composer6.changed(innerTextField) ? 4 : 2);
                                                } else {
                                                    i43 = i42;
                                                }
                                                if ((i43 & 91) != 18 || !composer6.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(998109572, i43, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:342)");
                                                    }
                                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                    String text = textFieldValue2.getText();
                                                    boolean z26 = z23;
                                                    boolean z27 = z24;
                                                    VisualTransformation visualTransformation6 = visualTransformation5;
                                                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6;
                                                    boolean z28 = z25;
                                                    Function2<Composer, Integer, Unit> function228 = function223;
                                                    Function2<Composer, Integer, Unit> function229 = function224;
                                                    Function2<Composer, Integer, Unit> function230 = function225;
                                                    Function2<Composer, Integer, Unit> function231 = function226;
                                                    Function2<Composer, Integer, Unit> function232 = function227;
                                                    Shape shape5 = shape4;
                                                    TextFieldColors textFieldColors5 = textFieldColors4;
                                                    int i44 = (i43 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS;
                                                    int i45 = i40;
                                                    int i46 = i44 | ((i45 >> 3) & 896);
                                                    int i47 = i41;
                                                    textFieldDefaults.TextFieldDecorationBox(text, innerTextField, z26, z27, visualTransformation6, mutableInteractionSource7, z28, function228, function229, function230, function231, function232, shape5, textFieldColors5, null, null, composer6, i46 | ((i47 >> 6) & 7168) | ((i47 << 6) & 57344) | ((i47 >> 6) & 458752) | ((i47 << 15) & 3670016) | ((i45 << 3) & 29360128) | ((i45 << 3) & 234881024) | ((i45 << 3) & 1879048192), ((i45 >> 27) & 14) | 1572864 | ((i47 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i47 >> 18) & 896) | ((i47 >> 18) & 7168), 49152);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer6.skipToGroupEnd();
                                            }
                                        });
                                        int i42 = (i36 & 64638) | ((i27 << 9) & 3670016) | (KeyboardActions.$stable << 21);
                                        int i43 = i27;
                                        BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifierM1049defaultMinSizeVpY3zN4, z20, z21, textStyle7, keyboardOptions5, keyboardActions5, z22, i39, visualTransformation4, (Function1) null, mutableInteractionSource5, solidColor2, composableLambda, composer5, i42 | ((i43 << 9) & 29360128) | ((i43 << 9) & 234881024) | ((i43 << 9) & 1879048192), ((i43 >> 6) & 14) | 24576 | ((i43 >> 15) & 896), 2048);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer5.skipToGroupEnd();
                                }
                            }), composer4, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer3 = composer4;
                            z9 = z17;
                            z10 = z18;
                            z11 = z8;
                            function213 = function29;
                            function214 = function210;
                            function215 = function28;
                            shape3 = shape2;
                            textStyle5 = textStyle6;
                            z12 = z7;
                            i28 = i26;
                            visualTransformation3 = visualTransformation2;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier5;
                            keyboardOptions4 = keyboardOptions3;
                            keyboardActions4 = keyboardActions3;
                            function216 = function211;
                            function217 = function212;
                            textFieldColors2 = textFieldColorsM2512textFieldColorsl59Burw;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function216 = function24;
                            visualTransformation3 = visualTransformation;
                            z11 = z4;
                            i28 = i;
                            mutableInteractionSource4 = mutableInteractionSource;
                            shape3 = shape;
                            textFieldColors2 = textFieldColors;
                            composer3 = composerStartRestartGroup;
                            z9 = z5;
                            z10 = z6;
                            textStyle5 = textStyle2;
                            function213 = function26;
                            function214 = function27;
                            modifier4 = modifier2;
                            function215 = function23;
                            function217 = function25;
                            z12 = z3;
                            keyboardOptions4 = keyboardOptions;
                            keyboardActions4 = keyboardActions;
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.6
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

                            public final void invoke(Composer composer5, int i37) {
                                TextFieldKt.TextField(value, onValueChange, modifier4, z9, z10, textStyle5, function213, function214, function215, function216, function217, z12, visualTransformation3, keyboardOptions4, keyboardActions4, z11, i28, mutableInteractionSource4, shape3, textFieldColors2, composer5, i2 | 1, i3, i4);
                            }
                        });
                        return;
                    }
                    i19 = i30 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                    if ((i3 & 7168) == 0) {
                    }
                    if ((i3 & 57344) == 0) {
                    }
                    i20 = i4 & 32768;
                    if (i20 != 0) {
                    }
                    i21 = i4 & 65536;
                    if (i21 != 0) {
                    }
                    i22 = i4 & 131072;
                    if (i22 != 0) {
                    }
                    if ((i3 & 234881024) == 0) {
                    }
                    if ((i3 & 1879048192) == 0) {
                    }
                    int i312 = i19;
                    if ((i5 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        int i322 = i5;
                        if ((i2 & 1) != 0) {
                            if (i29 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if ((i4 & 32) == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if ((i4 & 8192) == 0) {
                            }
                            if ((i4 & 16384) == 0) {
                            }
                            if (i20 == 0) {
                            }
                            if (i21 == 0) {
                            }
                            if (i22 == 0) {
                            }
                            if ((i4 & 262144) == 0) {
                            }
                            int i342 = i24;
                            if ((i4 & 524288) == 0) {
                            }
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2.startReplaceableGroup(-1263324710);
                            ComposerKt.sourceInformation(composer2, "*318@16896L18");
                            jM5632getColor0d7_KjU = textStyle4.m5632getColor0d7_KjU();
                            if (jM5632getColor0d7_KjU == Color.INSTANCE.m3693getUnspecified0d7_KjU()) {
                            }
                            composer2.endReplaceableGroup();
                            final TextStyle textStyleMerge2 = textStyle4.merge(new TextStyle(jM5632getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
                            ProvidedValue[] providedValueArr2 = new ProvidedValue[1];
                            providedValueArr2[c] = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColorsM2512textFieldColorsl59Burw.getSelectionColors(composer2, (i27 >> 27) & 14));
                            final Modifier modifier52 = modifier3;
                            TextStyle textStyle62 = textStyle4;
                            final int i362 = i25;
                            Composer composer42 = composer2;
                            final boolean z172 = z5;
                            final boolean z182 = z6;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr2, ComposableLambdaKt.composableLambda(composer42, 765006587, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.5
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

                                public final void invoke(Composer composer5, int i37) {
                                    ComposerKt.sourceInformation(composer5, "C335@17583L20,324@17145L1633:TextField.kt#uh7d8r");
                                    if ((i37 & 11) != 2 || !composer5.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(765006587, i37, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:322)");
                                        }
                                        Modifier modifierM1049defaultMinSizeVpY3zN4 = SizeKt.m1049defaultMinSizeVpY3zN4(modifier52, TextFieldDefaults.INSTANCE.m2506getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2505getMinHeightD9Ej5fM());
                                        TextFieldColors textFieldColors3 = textFieldColorsM2512textFieldColorsl59Burw;
                                        boolean z19 = z7;
                                        int i38 = i27;
                                        SolidColor solidColor = new SolidColor(textFieldColors3.cursorColor$material3_release(z19, composer5, ((i38 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i38 >> 3) & 14)).getValue().m3667unboximpl(), null);
                                        TextFieldValue textFieldValue = value;
                                        Function1<TextFieldValue, Unit> function1 = onValueChange;
                                        boolean z20 = z172;
                                        boolean z21 = z182;
                                        TextStyle textStyle7 = textStyleMerge2;
                                        KeyboardOptions keyboardOptions5 = keyboardOptions3;
                                        KeyboardActions keyboardActions5 = keyboardActions3;
                                        boolean z22 = z8;
                                        int i39 = i26;
                                        VisualTransformation visualTransformation4 = visualTransformation2;
                                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                                        SolidColor solidColor2 = solidColor;
                                        final TextFieldValue textFieldValue2 = value;
                                        final boolean z23 = z172;
                                        final boolean z24 = z8;
                                        final VisualTransformation visualTransformation5 = visualTransformation2;
                                        final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                                        final boolean z25 = z7;
                                        final Function2<? super Composer, ? super Integer, Unit> function223 = function29;
                                        final Function2<? super Composer, ? super Integer, Unit> function224 = function210;
                                        final Function2<? super Composer, ? super Integer, Unit> function225 = function28;
                                        final Function2<? super Composer, ? super Integer, Unit> function226 = function211;
                                        final Function2<? super Composer, ? super Integer, Unit> function227 = function212;
                                        final Shape shape4 = shape2;
                                        final TextFieldColors textFieldColors4 = textFieldColorsM2512textFieldColorsl59Burw;
                                        final int i40 = i362;
                                        final int i41 = i27;
                                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer5, 998109572, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.5.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function228, Composer composer6, Integer num) {
                                                invoke((Function2<? super Composer, ? super Integer, Unit>) function228, composer6, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer6, int i42) {
                                                int i43;
                                                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                                ComposerKt.sourceInformation(composer6, "C344@18071L683:TextField.kt#uh7d8r");
                                                if ((i42 & 14) == 0) {
                                                    i43 = i42 | (composer6.changed(innerTextField) ? 4 : 2);
                                                } else {
                                                    i43 = i42;
                                                }
                                                if ((i43 & 91) != 18 || !composer6.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(998109572, i43, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:342)");
                                                    }
                                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                    String text = textFieldValue2.getText();
                                                    boolean z26 = z23;
                                                    boolean z27 = z24;
                                                    VisualTransformation visualTransformation6 = visualTransformation5;
                                                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6;
                                                    boolean z28 = z25;
                                                    Function2<Composer, Integer, Unit> function228 = function223;
                                                    Function2<Composer, Integer, Unit> function229 = function224;
                                                    Function2<Composer, Integer, Unit> function230 = function225;
                                                    Function2<Composer, Integer, Unit> function231 = function226;
                                                    Function2<Composer, Integer, Unit> function232 = function227;
                                                    Shape shape5 = shape4;
                                                    TextFieldColors textFieldColors5 = textFieldColors4;
                                                    int i44 = (i43 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS;
                                                    int i45 = i40;
                                                    int i46 = i44 | ((i45 >> 3) & 896);
                                                    int i47 = i41;
                                                    textFieldDefaults.TextFieldDecorationBox(text, innerTextField, z26, z27, visualTransformation6, mutableInteractionSource7, z28, function228, function229, function230, function231, function232, shape5, textFieldColors5, null, null, composer6, i46 | ((i47 >> 6) & 7168) | ((i47 << 6) & 57344) | ((i47 >> 6) & 458752) | ((i47 << 15) & 3670016) | ((i45 << 3) & 29360128) | ((i45 << 3) & 234881024) | ((i45 << 3) & 1879048192), ((i45 >> 27) & 14) | 1572864 | ((i47 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i47 >> 18) & 896) | ((i47 >> 18) & 7168), 49152);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer6.skipToGroupEnd();
                                            }
                                        });
                                        int i42 = (i362 & 64638) | ((i27 << 9) & 3670016) | (KeyboardActions.$stable << 21);
                                        int i43 = i27;
                                        BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifierM1049defaultMinSizeVpY3zN4, z20, z21, textStyle7, keyboardOptions5, keyboardActions5, z22, i39, visualTransformation4, (Function1) null, mutableInteractionSource5, solidColor2, composableLambda, composer5, i42 | ((i43 << 9) & 29360128) | ((i43 << 9) & 234881024) | ((i43 << 9) & 1879048192), ((i43 >> 6) & 14) | 24576 | ((i43 >> 15) & 896), 2048);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer5.skipToGroupEnd();
                                }
                            }), composer42, 56);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer3 = composer42;
                            z9 = z172;
                            z10 = z182;
                            z11 = z8;
                            function213 = function29;
                            function214 = function210;
                            function215 = function28;
                            shape3 = shape2;
                            textStyle5 = textStyle62;
                            z12 = z7;
                            i28 = i26;
                            visualTransformation3 = visualTransformation2;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            modifier4 = modifier52;
                            keyboardOptions4 = keyboardOptions3;
                            keyboardActions4 = keyboardActions3;
                            function216 = function211;
                            function217 = function212;
                            textFieldColors2 = textFieldColorsM2512textFieldColorsl59Burw;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i12 = i11;
                i13 = i4 & 1024;
                if (i13 == 0) {
                }
                i16 = i4 & 2048;
                if (i16 == 0) {
                }
                int i302 = i15;
                i18 = i4 & 4096;
                if (i18 != 0) {
                }
                if ((i3 & 7168) == 0) {
                }
                if ((i3 & 57344) == 0) {
                }
                i20 = i4 & 32768;
                if (i20 != 0) {
                }
                i21 = i4 & 65536;
                if (i21 != 0) {
                }
                i22 = i4 & 131072;
                if (i22 != 0) {
                }
                if ((i3 & 234881024) == 0) {
                }
                if ((i3 & 1879048192) == 0) {
                }
                int i3122 = i19;
                if ((i5 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z5 = z;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            if ((i2 & 458752) == 0) {
            }
            i8 = i4 & 64;
            if (i8 != 0) {
            }
            i9 = i4 & 128;
            if (i9 != 0) {
            }
            i10 = i4 & 256;
            if (i10 != 0) {
            }
            i11 = i4 & 512;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i4 & 1024;
            if (i13 == 0) {
            }
            i16 = i4 & 2048;
            if (i16 == 0) {
            }
            int i3022 = i15;
            i18 = i4 & 4096;
            if (i18 != 0) {
            }
            if ((i3 & 7168) == 0) {
            }
            if ((i3 & 57344) == 0) {
            }
            i20 = i4 & 32768;
            if (i20 != 0) {
            }
            i21 = i4 & 65536;
            if (i21 != 0) {
            }
            i22 = i4 & 131072;
            if (i22 != 0) {
            }
            if ((i3 & 234881024) == 0) {
            }
            if ((i3 & 1879048192) == 0) {
            }
            int i31222 = i19;
            if ((i5 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        z5 = z;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        if ((i2 & 458752) == 0) {
        }
        i8 = i4 & 64;
        if (i8 != 0) {
        }
        i9 = i4 & 128;
        if (i9 != 0) {
        }
        i10 = i4 & 256;
        if (i10 != 0) {
        }
        i11 = i4 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i4 & 1024;
        if (i13 == 0) {
        }
        i16 = i4 & 2048;
        if (i16 == 0) {
        }
        int i30222 = i15;
        i18 = i4 & 4096;
        if (i18 != 0) {
        }
        if ((i3 & 7168) == 0) {
        }
        if ((i3 & 57344) == 0) {
        }
        i20 = i4 & 32768;
        if (i20 != 0) {
        }
        i21 = i4 & 65536;
        if (i21 != 0) {
        }
        i22 = i4 & 131072;
        if (i22 != 0) {
        }
        if ((i3 & 234881024) == 0) {
        }
        if ((i3 & 1879048192) == 0) {
        }
        int i312222 = i19;
        if ((i5 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ExperimentalMaterial3Api
    public static final void TextFieldLayout(final Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final boolean z, final float f, final Function2<? super Composer, ? super Integer, Unit> container, Function2<? super Composer, ? super Integer, Unit> function25, final PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        final Function2<? super Composer, ? super Integer, Unit> textField = function2;
        final Function2<? super Composer, ? super Integer, Unit> function26 = function22;
        final Function2<? super Composer, ? super Integer, Unit> function27 = function25;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(textField, "textField");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Composer composerStartRestartGroup = composer.startRestartGroup(1259241976);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TextFieldLayout)P(4,9,2,6,3,10,7!2,8)384@19422L139,387@19609L7,388@19621L2645:TextField.kt#uh7d8r");
        if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i3 |= composerStartRestartGroup.changed(textField) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(function26) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(function3) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(function23) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(function24) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(container) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((1879048192 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(function27) ? 536870912 : 268435456;
        }
        if ((i2 & 14) == 0) {
            i4 = i2 | (composerStartRestartGroup.changed(paddingValues) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i3 & 1533916891) != 306783378 || (i4 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1259241976, i3, i4, "androidx.compose.material3.TextFieldLayout (TextField.kt:371)");
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            Float fValueOf = Float.valueOf(f);
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1,2,3):Composables.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(fValueOf) | composerStartRestartGroup.changed(paddingValues);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new TextFieldMeasurePolicy(z, f, paddingValues);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) objRememberedValue;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) objConsume;
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(Layout)P(!1,2)74@2907L7,75@2962L7,76@3021L7,77@3033L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Density density = (Density) objConsume2;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume3 = composerStartRestartGroup.consume(localLayoutDirection2);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            LayoutDirection layoutDirection2 = (LayoutDirection) objConsume3;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume4 = composerStartRestartGroup.consume(localViewConfiguration);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) objConsume4;
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i6 = i3;
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, textFieldMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(1036839073);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C394@19940L11,445@21753L225,455@22034L163:TextField.kt#uh7d8r");
            container.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 24) & 14));
            composerStartRestartGroup.startReplaceableGroup(-95277174);
            ComposerKt.sourceInformation(composerStartRestartGroup, "397@20004L269");
            if (function23 != null) {
                Modifier modifierThen = LayoutIdKt.layoutId(Modifier.INSTANCE, "Leading").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object objConsume5 = composerStartRestartGroup.consume(localDensity2);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Density density2 = (Density) objConsume5;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object objConsume6 = composerStartRestartGroup.consume(localLayoutDirection3);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                LayoutDirection layoutDirection3 = (LayoutDirection) objConsume6;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object objConsume7 = composerStartRestartGroup.consume(localViewConfiguration2);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) objConsume7;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierThen);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m3157setimpl(composerM3150constructorimpl2, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m3157setimpl(composerM3150constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf2.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-2137368960);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1990589600);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C403@20246L9:TextField.kt#uh7d8r");
                function23.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 12) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-95276839);
            ComposerKt.sourceInformation(composerStartRestartGroup, "407@20340L271");
            if (function24 != null) {
                Modifier modifierThen2 = LayoutIdKt.layoutId(Modifier.INSTANCE, "Trailing").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center2 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object objConsume8 = composerStartRestartGroup.consume(localDensity3);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Density density3 = (Density) objConsume8;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection4 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object objConsume9 = composerStartRestartGroup.consume(localLayoutDirection4);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                LayoutDirection layoutDirection4 = (LayoutDirection) objConsume9;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object objConsume10 = composerStartRestartGroup.consume(localViewConfiguration3);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) objConsume10;
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierThen2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM3150constructorimpl3 = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m3157setimpl(composerM3150constructorimpl3, layoutDirection4, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m3157setimpl(composerM3150constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf3.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-2137368960);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-305264439);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C413@20583L10:TextField.kt#uh7d8r");
                function24.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 15) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            float fCalculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            float fCalculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            Modifier.Companion companion = Modifier.INSTANCE;
            if (function23 != null) {
                i5 = 0;
                fCalculateStartPadding = Dp.m6117constructorimpl(RangesKt.coerceAtLeast(Dp.m6117constructorimpl(fCalculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m6117constructorimpl(0)));
            } else {
                i5 = 0;
            }
            float f2 = fCalculateStartPadding;
            if (function24 != null) {
                fCalculateEndPadding = Dp.m6117constructorimpl(RangesKt.coerceAtLeast(Dp.m6117constructorimpl(fCalculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m6117constructorimpl(i5)));
            }
            Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(companion, f2, 0.0f, fCalculateEndPadding, 0.0f, 10, null);
            composerStartRestartGroup.startReplaceableGroup(-95275778);
            ComposerKt.sourceInformation(composerStartRestartGroup, "434@21404L130");
            if (function3 != null) {
                function3.invoke(LayoutIdKt.layoutId(Modifier.INSTANCE, "Hint").then(modifierM1024paddingqDBjuR0$default), composerStartRestartGroup, Integer.valueOf((i6 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS));
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-95275578);
            ComposerKt.sourceInformation(composerStartRestartGroup, "440@21598L128");
            if (function22 != null) {
                Modifier modifierThen3 = LayoutIdKt.layoutId(Modifier.INSTANCE, "Label").then(modifierM1024paddingqDBjuR0$default);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity4 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object objConsume11 = composerStartRestartGroup.consume(localDensity4);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Density density4 = (Density) objConsume11;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection5 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object objConsume12 = composerStartRestartGroup.consume(localLayoutDirection5);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                LayoutDirection layoutDirection5 = (LayoutDirection) objConsume12;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration4 = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object objConsume13 = composerStartRestartGroup.consume(localViewConfiguration4);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) objConsume13;
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierThen3);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM3150constructorimpl4 = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl4, density4, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m3157setimpl(composerM3150constructorimpl4, layoutDirection5, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m3157setimpl(composerM3150constructorimpl4, viewConfiguration4, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf4.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-2137368960);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-2011394041);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C443@21717L7:TextField.kt#uh7d8r");
                function26 = function22;
                function26.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 6) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                function26 = function22;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen4 = LayoutIdKt.layoutId(Modifier.INSTANCE, "TextField").then(modifierM1024paddingqDBjuR0$default);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity5 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume14 = composerStartRestartGroup.consume(localDensity5);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Density density5 = (Density) objConsume14;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection6 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume15 = composerStartRestartGroup.consume(localLayoutDirection6);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            LayoutDirection layoutDirection6 = (LayoutDirection) objConsume15;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration5 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume16 = composerStartRestartGroup.consume(localViewConfiguration5);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ViewConfiguration viewConfiguration5 = (ViewConfiguration) objConsume16;
            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierThen4);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM3150constructorimpl5 = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl5, measurePolicyRememberBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl5, density5, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m3157setimpl(composerM3150constructorimpl5, layoutDirection6, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m3157setimpl(composerM3150constructorimpl5, viewConfiguration5, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf5.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-2137368960);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-369728037);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C451@21953L11:TextField.kt#uh7d8r");
            textField = function2;
            textField.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 3) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (function25 != null) {
                Modifier modifierPadding = PaddingKt.padding(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.SupportingId), TextFieldDefaults.m2500supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                composerStartRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity6 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object objConsume17 = composerStartRestartGroup.consume(localDensity6);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Density density6 = (Density) objConsume17;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection7 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object objConsume18 = composerStartRestartGroup.consume(localLayoutDirection7);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                LayoutDirection layoutDirection7 = (LayoutDirection) objConsume18;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration6 = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object objConsume19 = composerStartRestartGroup.consume(localViewConfiguration6);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ViewConfiguration viewConfiguration6 = (ViewConfiguration) objConsume19;
                Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifierPadding);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor6);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM3150constructorimpl6 = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl6, measurePolicyRememberBoxMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl6, density6, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m3157setimpl(composerM3150constructorimpl6, layoutDirection7, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m3157setimpl(composerM3150constructorimpl6, viewConfiguration6, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf6.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-2137368960);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-716975194);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C458@22183L12:TextField.kt#uh7d8r");
                function27 = function25;
                function27.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 27) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                function27 = function25;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextFieldLayout.2
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

            public final void invoke(Composer composer2, int i7) {
                TextFieldKt.TextFieldLayout(modifier, textField, function26, function3, function23, function24, z, f, container, function27, paddingValues, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-VsPV1Ek, reason: not valid java name */
    public static final int m2525calculateWidthVsPV1Ek(int i, int i2, int i3, int i4, int i5, long j) {
        return Math.max(i + Math.max(i3, Math.max(i4, i5)) + i2, Constraints.m6072getMinWidthimpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-jCXOeKk, reason: not valid java name */
    public static final int m2524calculateHeightjCXOeKk(int i, boolean z, int i2, int i3, int i4, int i5, int i6, long j, float f, PaddingValues paddingValues) {
        float f2 = TextFieldTopPadding * f;
        float top = paddingValues.getTop() * f;
        float bottom = paddingValues.getBottom() * f;
        int iMax = Math.max(i, i5);
        return Math.max(Constraints.m6071getMinHeightimpl(j), Math.max(i3, Math.max(i4, MathKt.roundToInt(z ? i2 + f2 + iMax + bottom : top + iMax + bottom))) + i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, boolean z, int i3, int i4, float f, float f2) {
        int iRoundToInt;
        Placeable.PlacementScope.m5057place70tqf50$default(placementScope, placeable6, IntOffset.INSTANCE.m6255getZeronOccac(), 0.0f, 2, null);
        int iHeightOrZero = i2 - TextFieldImplKt.heightOrZero(placeable7);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i - placeable5.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            if (z) {
                iRoundToInt = Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), iHeightOrZero);
            } else {
                iRoundToInt = MathKt.roundToInt(TextFieldImplKt.getTextFieldPadding() * f2);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), iRoundToInt - MathKt.roundToInt((iRoundToInt - i3) * f), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable4), i4, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable4), i4, 0.0f, 4, null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, 0, iHeightOrZero, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, boolean z, float f, PaddingValues paddingValues) {
        Placeable.PlacementScope.m5057place70tqf50$default(placementScope, placeable5, IntOffset.INSTANCE.m6255getZeronOccac(), 0.0f, 2, null);
        int iHeightOrZero = i2 - TextFieldImplKt.heightOrZero(placeable6);
        int iRoundToInt = MathKt.roundToInt(paddingValues.getTop() * f);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i - placeable4.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable3), z ? Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), iHeightOrZero) : iRoundToInt, 0.0f, 4, null);
        if (placeable2 != null) {
            if (z) {
                iRoundToInt = Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), iHeightOrZero);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable3), iRoundToInt, 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, 0, iHeightOrZero, 0.0f, 4, null);
        }
    }

    public static final Modifier drawIndicatorLine(Modifier modifier, final BorderStroke indicatorBorder) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(indicatorBorder, "indicatorBorder");
        final float width = indicatorBorder.getWidth();
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.TextFieldKt.drawIndicatorLine.1
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
            public final void invoke2(ContentDrawScope drawWithContent) {
                Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                drawWithContent.drawContent();
                if (Dp.m6122equalsimpl0(width, Dp.INSTANCE.m6135getHairlineD9Ej5fM())) {
                    return;
                }
                float density = width * drawWithContent.getDensity();
                float fM3482getHeightimpl = Size.m3482getHeightimpl(drawWithContent.mo4213getSizeNHjbRc()) - (density / 2);
                DrawScope.m4198drawLine1RTmtNc$default(drawWithContent, indicatorBorder.getBrush(), OffsetKt.Offset(0.0f, fM3482getHeightimpl), OffsetKt.Offset(Size.m3485getWidthimpl(drawWithContent.mo4213getSizeNHjbRc()), fM3482getHeightimpl), density, 0, null, 0.0f, null, 0, 496, null);
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
