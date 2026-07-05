package androidx.compose.material3;

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
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
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

/* compiled from: OutlinedTextField.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001a\u009e\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u000f2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)H\u0007¢\u0006\u0002\u0010*\u001a\u009e\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020+2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00070\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u000f2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)H\u0007¢\u0006\u0002\u0010,\u001aÙ\u0001\u0010-\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u00152\u0019\u0010\u0016\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¢\u0006\u0002\b\u00152\u0013\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0013\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0013\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0006\u0010!\u001a\u00020\u000f2\u0006\u00101\u001a\u0002022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00070\u000b2\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u00152\u0013\u00106\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0006\u00107\u001a\u000208H\u0001ø\u0001\u0000¢\u0006\u0002\u00109\u001a]\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u00020#2\u0006\u0010<\u001a\u00020#2\u0006\u0010=\u001a\u00020#2\u0006\u0010>\u001a\u00020#2\u0006\u0010?\u001a\u00020#2\u0006\u0010@\u001a\u00020#2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u0002022\u0006\u00107\u001a\u000208H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001a]\u0010F\u001a\u00020#2\u0006\u0010G\u001a\u00020#2\u0006\u0010H\u001a\u00020#2\u0006\u0010I\u001a\u00020#2\u0006\u0010J\u001a\u00020#2\u0006\u0010K\u001a\u00020#2\u0006\u0010L\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u0002022\u0006\u00107\u001a\u000208H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a)\u0010O\u001a\u00020\r*\u00020\r2\u0006\u0010P\u001a\u0002042\u0006\u00107\u001a\u000208H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bQ\u0010R\u001a\u0086\u0001\u0010S\u001a\u00020\u0007*\u00020T2\u0006\u0010U\u001a\u00020#2\u0006\u0010V\u001a\u00020#2\b\u0010W\u001a\u0004\u0018\u00010X2\b\u0010Y\u001a\u0004\u0018\u00010X2\u0006\u0010Z\u001a\u00020X2\b\u0010[\u001a\u0004\u0018\u00010X2\b\u0010\\\u001a\u0004\u0018\u00010X2\u0006\u0010]\u001a\u00020X2\b\u0010^\u001a\u0004\u0018\u00010X2\u0006\u00101\u001a\u0002022\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010C\u001a\u0002022\u0006\u0010_\u001a\u00020`2\u0006\u00107\u001a\u000208H\u0002\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0019\u0010\u0003\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006a"}, d2 = {"OutlinedTextFieldInnerPadding", "Landroidx/compose/ui/unit/Dp;", "F", "OutlinedTextFieldTopPadding", "getOutlinedTextFieldTopPadding", "()F", "OutlinedTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", ViewProps.ENABLED, "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", ReactTextInputShadowNode.PROP_PLACEHOLDER, "leadingIcon", "trailingIcon", "supportingText", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", PaymentSheetAppearanceKeys.COLORS, "Landroidx/compose/material3/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "OutlinedTextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "onLabelMeasured", "Landroidx/compose/ui/geometry/Size;", "container", "supporting", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateHeight", "leadingPlaceableHeight", "trailingPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "supportingPlaceableHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-O3s9Psw", "(IIIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingPlaceableWidth", "trailingPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "isLabelInMiddleSection", "calculateWidth-O3s9Psw", "(IIIIIZJFLandroidx/compose/foundation/layout/PaddingValues;)I", "outlineCutout", "labelSize", "outlineCutout-12SF9DM", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "place", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "totalHeight", "width", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "containerPlaceable", "supportingPlaceable", ViewProps.LAYOUT_DIRECTION, "Landroidx/compose/ui/unit/LayoutDirection;", "material3_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt {
    private static final float OutlinedTextFieldInnerPadding = Dp.m6117constructorimpl(4);
    private static final float OutlinedTextFieldTopPadding = Dp.m6117constructorimpl(8);

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
    /* JADX WARN: Removed duplicated region for block: B:241:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05f2  */
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
    public static final void OutlinedTextField(final String value, final Function1<? super String, Unit> onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        final boolean z5;
        int i7;
        final boolean z6;
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
        int i23;
        TextStyle textStyle3;
        Function2<? super Composer, ? super Integer, Unit> function28;
        VisualTransformation none;
        int i24;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        MutableInteractionSource mutableInteractionSource2;
        Shape outlinedShape;
        int i25;
        Composer composer2;
        final KeyboardOptions keyboardOptions3;
        final TextFieldColors textFieldColorsM2509outlinedTextFieldColorsl59Burw;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        TextStyle textStyle4;
        int i26;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final boolean z7;
        final KeyboardActions keyboardActions3;
        final boolean z8;
        final int i27;
        final MutableInteractionSource mutableInteractionSource3;
        final Shape shape2;
        final int i28;
        char c;
        long jM5632getColor0d7_KjU;
        final boolean z9;
        final boolean z10;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final MutableInteractionSource mutableInteractionSource4;
        final boolean z11;
        final VisualTransformation visualTransformation2;
        final KeyboardActions keyboardActions4;
        Composer composer3;
        final boolean z12;
        final int i29;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        final Shape shape3;
        final TextStyle textStyle5;
        final Function2<? super Composer, ? super Integer, Unit> function216;
        final TextFieldColors textFieldColors2;
        final KeyboardOptions keyboardOptions4;
        final Function2<? super Composer, ? super Integer, Unit> function217;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(534493230);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OutlinedTextField)P(18,10,9,1,12,16,6,11,7,17,15,3,19,5,4,14,8,2,13)138@7667L7,150@8281L39,151@8359L13,152@8422L25,160@8773L15,160@8707L2376:OutlinedTextField.kt#uh7d8r");
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
        int i30 = i4 & 4;
        if (i30 != 0) {
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
                    int i31 = i15;
                    i18 = i4 & 4096;
                    if (i18 != 0) {
                        i19 = i31;
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
                        int i32 = i19;
                        if ((i5 & 1533916891) != 306783378 || (1533916891 & i32) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            int i33 = i5;
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i30 == 0 ? Modifier.INSTANCE : modifier2;
                                boolean z13 = i6 == 0 ? true : z5;
                                boolean z14 = i7 == 0 ? false : z6;
                                if ((i4 & 32) == 0) {
                                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume = composerStartRestartGroup.consume(localTextStyle);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    textStyle3 = (TextStyle) objConsume;
                                    i23 = i33 & (-458753);
                                } else {
                                    i23 = i33;
                                    textStyle3 = textStyle2;
                                }
                                function28 = i8 == 0 ? null : function26;
                                Function2<? super Composer, ? super Integer, Unit> function218 = i9 == 0 ? null : function27;
                                Function2<? super Composer, ? super Integer, Unit> function219 = i10 == 0 ? null : function23;
                                Function2<? super Composer, ? super Integer, Unit> function220 = i12 == 0 ? null : function24;
                                Function2<? super Composer, ? super Integer, Unit> function221 = i14 == 0 ? null : function25;
                                boolean z15 = i17 == 0 ? false : z3;
                                none = i18 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                if ((i4 & 8192) == 0) {
                                    i24 = i32 & (-7169);
                                    keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                                } else {
                                    i24 = i32;
                                    keyboardOptions2 = keyboardOptions;
                                }
                                if ((i4 & 16384) == 0) {
                                    i24 &= -57345;
                                    keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                                } else {
                                    keyboardActions2 = keyboardActions;
                                }
                                boolean z16 = i20 == 0 ? false : z4;
                                int i34 = i21 == 0 ? Integer.MAX_VALUE : i;
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
                                    outlinedShape = TextFieldDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                                } else {
                                    outlinedShape = shape;
                                }
                                int i35 = i24;
                                if ((i4 & 524288) == 0) {
                                    KeyboardOptions keyboardOptions5 = keyboardOptions2;
                                    i25 = 1;
                                    composer2 = composerStartRestartGroup;
                                    keyboardOptions3 = keyboardOptions5;
                                    modifier2 = companion;
                                    function29 = function219;
                                    textFieldColorsM2509outlinedTextFieldColorsl59Burw = TextFieldDefaults.INSTANCE.m2509outlinedTextFieldColorsl59Burw(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 100663296, 268435455);
                                    i28 = i35 & (-1879048193);
                                    z5 = z13;
                                    z6 = z14;
                                    textStyle4 = textStyle3;
                                    i26 = i23;
                                    function210 = function218;
                                    function211 = function220;
                                    function212 = function221;
                                    z7 = z15;
                                    keyboardActions3 = keyboardActions2;
                                    z8 = z16;
                                    i27 = i34;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    shape2 = outlinedShape;
                                } else {
                                    KeyboardOptions keyboardOptions6 = keyboardOptions2;
                                    i25 = 1;
                                    composer2 = composerStartRestartGroup;
                                    keyboardOptions3 = keyboardOptions6;
                                    textFieldColorsM2509outlinedTextFieldColorsl59Burw = textFieldColors;
                                    modifier2 = companion;
                                    function29 = function219;
                                    z5 = z13;
                                    z6 = z14;
                                    textStyle4 = textStyle3;
                                    i26 = i23;
                                    function210 = function218;
                                    function211 = function220;
                                    function212 = function221;
                                    z7 = z15;
                                    keyboardActions3 = keyboardActions2;
                                    z8 = z16;
                                    i27 = i34;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    shape2 = outlinedShape;
                                    i28 = i35;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                int i36 = (i4 & 32) != 0 ? i33 & (-458753) : i33;
                                if ((i4 & 8192) != 0) {
                                    i32 &= -7169;
                                }
                                if ((i4 & 16384) != 0) {
                                    i32 &= -57345;
                                }
                                if ((i4 & 262144) != 0) {
                                    i32 &= -234881025;
                                }
                                if ((i4 & 524288) != 0) {
                                    i32 &= -1879048193;
                                }
                                function29 = function23;
                                function211 = function24;
                                function212 = function25;
                                z7 = z3;
                                none = visualTransformation;
                                z8 = z4;
                                mutableInteractionSource3 = mutableInteractionSource;
                                shape2 = shape;
                                textFieldColorsM2509outlinedTextFieldColorsl59Burw = textFieldColors;
                                i28 = i32;
                                i25 = 1;
                                function28 = function26;
                                function210 = function27;
                                keyboardActions3 = keyboardActions;
                                i27 = i;
                                composer2 = composerStartRestartGroup;
                                i26 = i36;
                                textStyle4 = textStyle2;
                                keyboardOptions3 = keyboardOptions;
                            }
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                c = 0;
                            } else {
                                c = 0;
                                ComposerKt.traceEventStart(534493230, i26, i28, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:132)");
                            }
                            composer2.startReplaceableGroup(1663535219);
                            ComposerKt.sourceInformation(composer2, "*156@8599L18");
                            jM5632getColor0d7_KjU = textStyle4.m5632getColor0d7_KjU();
                            if (jM5632getColor0d7_KjU == Color.INSTANCE.m3693getUnspecified0d7_KjU()) {
                                jM5632getColor0d7_KjU = textFieldColorsM2509outlinedTextFieldColorsl59Burw.textColor$material3_release(z5, composer2, ((i26 >> 9) & 14) | ((i28 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).getValue().m3667unboximpl();
                            }
                            composer2.endReplaceableGroup();
                            final TextStyle textStyleMerge = textStyle4.merge(new TextStyle(jM5632getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
                            ProvidedValue[] providedValueArr = new ProvidedValue[i25];
                            TextStyle textStyle6 = textStyle4;
                            providedValueArr[c] = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColorsM2509outlinedTextFieldColorsl59Burw.getSelectionColors(composer2, (i28 >> 27) & 14));
                            final int i37 = i26;
                            Composer composer4 = composer2;
                            final Modifier modifier4 = modifier2;
                            final Function2<? super Composer, ? super Integer, Unit> function222 = function28;
                            final VisualTransformation visualTransformation3 = none;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer4, -1801753362, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2
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

                                public final void invoke(Composer composer5, int i38) {
                                    Modifier modifierM1024paddingqDBjuR0$default;
                                    ComposerKt.sourceInformation(composer5, "C181@9663L20,162@8848L2229:OutlinedTextField.kt#uh7d8r");
                                    if ((i38 & 11) != 2 || !composer5.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1801753362, i38, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:160)");
                                        }
                                        if (function222 != null) {
                                            modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier4, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.1
                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(SemanticsPropertyReceiver semantics) {
                                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    invoke2(semanticsPropertyReceiver);
                                                    return Unit.INSTANCE;
                                                }
                                            }), 0.0f, OutlinedTextFieldKt.getOutlinedTextFieldTopPadding(), 0.0f, 0.0f, 13, null);
                                        } else {
                                            modifierM1024paddingqDBjuR0$default = modifier4;
                                        }
                                        Modifier modifierM1049defaultMinSizeVpY3zN4 = SizeKt.m1049defaultMinSizeVpY3zN4(modifierM1024paddingqDBjuR0$default, TextFieldDefaults.INSTANCE.m2506getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2505getMinHeightD9Ej5fM());
                                        TextFieldColors textFieldColors3 = textFieldColorsM2509outlinedTextFieldColorsl59Burw;
                                        boolean z17 = z7;
                                        int i39 = i28;
                                        SolidColor solidColor = new SolidColor(textFieldColors3.cursorColor$material3_release(z17, composer5, ((i39 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i39 >> 3) & 14)).getValue().m3667unboximpl(), null);
                                        String str = value;
                                        Function1<String, Unit> function1 = onValueChange;
                                        boolean z18 = z5;
                                        boolean z19 = z6;
                                        TextStyle textStyle7 = textStyleMerge;
                                        KeyboardOptions keyboardOptions7 = keyboardOptions3;
                                        KeyboardActions keyboardActions5 = keyboardActions3;
                                        boolean z20 = z8;
                                        int i40 = i27;
                                        VisualTransformation visualTransformation4 = visualTransformation3;
                                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                                        SolidColor solidColor2 = solidColor;
                                        final String str2 = value;
                                        final boolean z21 = z5;
                                        final boolean z22 = z8;
                                        final VisualTransformation visualTransformation5 = visualTransformation3;
                                        final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                                        final boolean z23 = z7;
                                        final Function2<Composer, Integer, Unit> function223 = function222;
                                        final Function2<Composer, Integer, Unit> function224 = function210;
                                        final Function2<Composer, Integer, Unit> function225 = function29;
                                        final Function2<Composer, Integer, Unit> function226 = function211;
                                        final Function2<Composer, Integer, Unit> function227 = function212;
                                        final TextFieldColors textFieldColors4 = textFieldColorsM2509outlinedTextFieldColorsl59Burw;
                                        final int i41 = i37;
                                        final int i42 = i28;
                                        final Shape shape4 = shape2;
                                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer5, 794931831, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.2
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

                                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer6, int i43) {
                                                int i44;
                                                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                                ComposerKt.sourceInformation(composer6, "C189@10058L995:OutlinedTextField.kt#uh7d8r");
                                                if ((i43 & 14) == 0) {
                                                    i44 = i43 | (composer6.changed(innerTextField) ? 4 : 2);
                                                } else {
                                                    i44 = i43;
                                                }
                                                if ((i44 & 91) != 18 || !composer6.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(794931831, i44, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:188)");
                                                    }
                                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                    int i45 = i44;
                                                    String str3 = str2;
                                                    boolean z24 = z21;
                                                    boolean z25 = z22;
                                                    VisualTransformation visualTransformation6 = visualTransformation5;
                                                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6;
                                                    boolean z26 = z23;
                                                    Function2<Composer, Integer, Unit> function228 = function223;
                                                    Function2<Composer, Integer, Unit> function229 = function224;
                                                    Function2<Composer, Integer, Unit> function230 = function225;
                                                    Function2<Composer, Integer, Unit> function231 = function226;
                                                    Function2<Composer, Integer, Unit> function232 = function227;
                                                    TextFieldColors textFieldColors5 = textFieldColors4;
                                                    final boolean z27 = z21;
                                                    final boolean z28 = z23;
                                                    final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource6;
                                                    final TextFieldColors textFieldColors6 = textFieldColors4;
                                                    final Shape shape5 = shape4;
                                                    final int i46 = i41;
                                                    final int i47 = i42;
                                                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer6, -839984881, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.2.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                            invoke(composer7, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer7, int i48) {
                                                            ComposerKt.sourceInformation(composer7, "C204@10769L244:OutlinedTextField.kt#uh7d8r");
                                                            if ((i48 & 11) != 2 || !composer7.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-839984881, i48, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:203)");
                                                                }
                                                                TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.INSTANCE;
                                                                boolean z29 = z27;
                                                                boolean z30 = z28;
                                                                MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource8;
                                                                TextFieldColors textFieldColors7 = textFieldColors6;
                                                                Shape shape6 = shape5;
                                                                int i49 = ((i46 >> 9) & 14) | 12582912;
                                                                int i50 = i47;
                                                                textFieldDefaults2.m2503OutlinedBorderContainerBoxnbWgWpA(z29, z30, mutableInteractionSource9, textFieldColors7, shape6, 0.0f, 0.0f, composer7, i49 | (i50 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i50 >> 15) & 896) | ((i50 >> 18) & 7168) | ((i50 >> 12) & 57344), 96);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer7.skipToGroupEnd();
                                                        }
                                                    });
                                                    int i48 = i41;
                                                    int i49 = (i48 & 14) | ((i45 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i48 >> 3) & 896);
                                                    int i50 = i42;
                                                    textFieldDefaults.OutlinedTextFieldDecorationBox(str3, innerTextField, z24, z25, visualTransformation6, mutableInteractionSource7, z26, function228, function229, function230, function231, function232, textFieldColors5, null, composableLambda2, composer6, ((i50 >> 6) & 7168) | i49 | ((i50 << 6) & 57344) | ((i50 >> 6) & 458752) | ((i50 << 15) & 3670016) | ((i48 << 3) & 29360128) | ((i48 << 3) & 234881024) | ((i48 << 3) & 1879048192), ((i48 >> 27) & 14) | 221184 | ((i50 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i50 >> 21) & 896), 8192);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer6.skipToGroupEnd();
                                            }
                                        });
                                        int i43 = (i37 & 64638) | ((i28 << 9) & 3670016) | (KeyboardActions.$stable << 21);
                                        int i44 = i28;
                                        BasicTextFieldKt.BasicTextField(str, function1, modifierM1049defaultMinSizeVpY3zN4, z18, z19, textStyle7, keyboardOptions7, keyboardActions5, z20, i40, visualTransformation4, (Function1) null, mutableInteractionSource5, solidColor2, composableLambda, composer5, i43 | ((i44 << 9) & 29360128) | ((i44 << 9) & 234881024) | ((i44 << 9) & 1879048192), ((i44 >> 6) & 14) | 24576 | ((i44 >> 15) & 896), 2048);
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
                            KeyboardActions keyboardActions5 = keyboardActions3;
                            z9 = z7;
                            z10 = z5;
                            function213 = function210;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z11 = z8;
                            visualTransformation2 = visualTransformation3;
                            keyboardActions4 = keyboardActions5;
                            composer3 = composer4;
                            z12 = z6;
                            i29 = i27;
                            function214 = function29;
                            function215 = function211;
                            shape3 = shape2;
                            textStyle5 = textStyle6;
                            function216 = function222;
                            textFieldColors2 = textFieldColorsM2509outlinedTextFieldColorsl59Burw;
                            keyboardOptions4 = keyboardOptions3;
                            function217 = function212;
                            modifier3 = modifier4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function215 = function24;
                            visualTransformation2 = visualTransformation;
                            z11 = z4;
                            i29 = i;
                            mutableInteractionSource4 = mutableInteractionSource;
                            shape3 = shape;
                            textFieldColors2 = textFieldColors;
                            composer3 = composerStartRestartGroup;
                            z10 = z5;
                            z12 = z6;
                            textStyle5 = textStyle2;
                            function216 = function26;
                            function213 = function27;
                            modifier3 = modifier2;
                            function214 = function23;
                            function217 = function25;
                            z9 = z3;
                            keyboardOptions4 = keyboardOptions;
                            keyboardActions4 = keyboardActions;
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3
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

                            public final void invoke(Composer composer5, int i38) {
                                OutlinedTextFieldKt.OutlinedTextField(value, onValueChange, modifier3, z10, z12, textStyle5, function216, function213, function214, function215, function217, z9, visualTransformation2, keyboardOptions4, keyboardActions4, z11, i29, mutableInteractionSource4, shape3, textFieldColors2, composer5, i2 | 1, i3, i4);
                            }
                        });
                        return;
                    }
                    i19 = i31 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
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
                    int i322 = i19;
                    if ((i5 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        int i332 = i5;
                        if ((i2 & 1) != 0) {
                            if (i30 == 0) {
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
                            int i352 = i24;
                            if ((i4 & 524288) == 0) {
                            }
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2.startReplaceableGroup(1663535219);
                            ComposerKt.sourceInformation(composer2, "*156@8599L18");
                            jM5632getColor0d7_KjU = textStyle4.m5632getColor0d7_KjU();
                            if (jM5632getColor0d7_KjU == Color.INSTANCE.m3693getUnspecified0d7_KjU()) {
                            }
                            composer2.endReplaceableGroup();
                            final TextStyle textStyleMerge2 = textStyle4.merge(new TextStyle(jM5632getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
                            ProvidedValue[] providedValueArr2 = new ProvidedValue[i25];
                            TextStyle textStyle62 = textStyle4;
                            providedValueArr2[c] = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColorsM2509outlinedTextFieldColorsl59Burw.getSelectionColors(composer2, (i28 >> 27) & 14));
                            final int i372 = i26;
                            Composer composer42 = composer2;
                            final Modifier modifier42 = modifier2;
                            final Function2<? super Composer, ? super Integer, Unit> function2222 = function28;
                            final VisualTransformation visualTransformation32 = none;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr2, ComposableLambdaKt.composableLambda(composer42, -1801753362, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2
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

                                public final void invoke(Composer composer5, int i38) {
                                    Modifier modifierM1024paddingqDBjuR0$default;
                                    ComposerKt.sourceInformation(composer5, "C181@9663L20,162@8848L2229:OutlinedTextField.kt#uh7d8r");
                                    if ((i38 & 11) != 2 || !composer5.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1801753362, i38, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:160)");
                                        }
                                        if (function2222 != null) {
                                            modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier42, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.1
                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(SemanticsPropertyReceiver semantics) {
                                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    invoke2(semanticsPropertyReceiver);
                                                    return Unit.INSTANCE;
                                                }
                                            }), 0.0f, OutlinedTextFieldKt.getOutlinedTextFieldTopPadding(), 0.0f, 0.0f, 13, null);
                                        } else {
                                            modifierM1024paddingqDBjuR0$default = modifier42;
                                        }
                                        Modifier modifierM1049defaultMinSizeVpY3zN4 = SizeKt.m1049defaultMinSizeVpY3zN4(modifierM1024paddingqDBjuR0$default, TextFieldDefaults.INSTANCE.m2506getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2505getMinHeightD9Ej5fM());
                                        TextFieldColors textFieldColors3 = textFieldColorsM2509outlinedTextFieldColorsl59Burw;
                                        boolean z17 = z7;
                                        int i39 = i28;
                                        SolidColor solidColor = new SolidColor(textFieldColors3.cursorColor$material3_release(z17, composer5, ((i39 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i39 >> 3) & 14)).getValue().m3667unboximpl(), null);
                                        String str = value;
                                        Function1<String, Unit> function1 = onValueChange;
                                        boolean z18 = z5;
                                        boolean z19 = z6;
                                        TextStyle textStyle7 = textStyleMerge2;
                                        KeyboardOptions keyboardOptions7 = keyboardOptions3;
                                        KeyboardActions keyboardActions52 = keyboardActions3;
                                        boolean z20 = z8;
                                        int i40 = i27;
                                        VisualTransformation visualTransformation4 = visualTransformation32;
                                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                                        SolidColor solidColor2 = solidColor;
                                        final String str2 = value;
                                        final boolean z21 = z5;
                                        final boolean z22 = z8;
                                        final VisualTransformation visualTransformation5 = visualTransformation32;
                                        final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                                        final boolean z23 = z7;
                                        final Function2<? super Composer, ? super Integer, Unit> function223 = function2222;
                                        final Function2<? super Composer, ? super Integer, Unit> function224 = function210;
                                        final Function2<? super Composer, ? super Integer, Unit> function225 = function29;
                                        final Function2<? super Composer, ? super Integer, Unit> function226 = function211;
                                        final Function2<? super Composer, ? super Integer, Unit> function227 = function212;
                                        final TextFieldColors textFieldColors4 = textFieldColorsM2509outlinedTextFieldColorsl59Burw;
                                        final int i41 = i372;
                                        final int i42 = i28;
                                        final Shape shape4 = shape2;
                                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer5, 794931831, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.2
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

                                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer6, int i43) {
                                                int i44;
                                                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                                ComposerKt.sourceInformation(composer6, "C189@10058L995:OutlinedTextField.kt#uh7d8r");
                                                if ((i43 & 14) == 0) {
                                                    i44 = i43 | (composer6.changed(innerTextField) ? 4 : 2);
                                                } else {
                                                    i44 = i43;
                                                }
                                                if ((i44 & 91) != 18 || !composer6.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(794931831, i44, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:188)");
                                                    }
                                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                    int i45 = i44;
                                                    String str3 = str2;
                                                    boolean z24 = z21;
                                                    boolean z25 = z22;
                                                    VisualTransformation visualTransformation6 = visualTransformation5;
                                                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6;
                                                    boolean z26 = z23;
                                                    Function2<Composer, Integer, Unit> function228 = function223;
                                                    Function2<Composer, Integer, Unit> function229 = function224;
                                                    Function2<Composer, Integer, Unit> function230 = function225;
                                                    Function2<Composer, Integer, Unit> function231 = function226;
                                                    Function2<Composer, Integer, Unit> function232 = function227;
                                                    TextFieldColors textFieldColors5 = textFieldColors4;
                                                    final boolean z27 = z21;
                                                    final boolean z28 = z23;
                                                    final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource6;
                                                    final TextFieldColors textFieldColors6 = textFieldColors4;
                                                    final Shape shape5 = shape4;
                                                    final int i46 = i41;
                                                    final int i47 = i42;
                                                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer6, -839984881, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2.2.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                            invoke(composer7, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer7, int i48) {
                                                            ComposerKt.sourceInformation(composer7, "C204@10769L244:OutlinedTextField.kt#uh7d8r");
                                                            if ((i48 & 11) != 2 || !composer7.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-839984881, i48, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:203)");
                                                                }
                                                                TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.INSTANCE;
                                                                boolean z29 = z27;
                                                                boolean z30 = z28;
                                                                MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource8;
                                                                TextFieldColors textFieldColors7 = textFieldColors6;
                                                                Shape shape6 = shape5;
                                                                int i49 = ((i46 >> 9) & 14) | 12582912;
                                                                int i50 = i47;
                                                                textFieldDefaults2.m2503OutlinedBorderContainerBoxnbWgWpA(z29, z30, mutableInteractionSource9, textFieldColors7, shape6, 0.0f, 0.0f, composer7, i49 | (i50 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i50 >> 15) & 896) | ((i50 >> 18) & 7168) | ((i50 >> 12) & 57344), 96);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer7.skipToGroupEnd();
                                                        }
                                                    });
                                                    int i48 = i41;
                                                    int i49 = (i48 & 14) | ((i45 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i48 >> 3) & 896);
                                                    int i50 = i42;
                                                    textFieldDefaults.OutlinedTextFieldDecorationBox(str3, innerTextField, z24, z25, visualTransformation6, mutableInteractionSource7, z26, function228, function229, function230, function231, function232, textFieldColors5, null, composableLambda2, composer6, ((i50 >> 6) & 7168) | i49 | ((i50 << 6) & 57344) | ((i50 >> 6) & 458752) | ((i50 << 15) & 3670016) | ((i48 << 3) & 29360128) | ((i48 << 3) & 234881024) | ((i48 << 3) & 1879048192), ((i48 >> 27) & 14) | 221184 | ((i50 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i50 >> 21) & 896), 8192);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer6.skipToGroupEnd();
                                            }
                                        });
                                        int i43 = (i372 & 64638) | ((i28 << 9) & 3670016) | (KeyboardActions.$stable << 21);
                                        int i44 = i28;
                                        BasicTextFieldKt.BasicTextField(str, function1, modifierM1049defaultMinSizeVpY3zN4, z18, z19, textStyle7, keyboardOptions7, keyboardActions52, z20, i40, visualTransformation4, (Function1) null, mutableInteractionSource5, solidColor2, composableLambda, composer5, i43 | ((i44 << 9) & 29360128) | ((i44 << 9) & 234881024) | ((i44 << 9) & 1879048192), ((i44 >> 6) & 14) | 24576 | ((i44 >> 15) & 896), 2048);
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
                            KeyboardActions keyboardActions52 = keyboardActions3;
                            z9 = z7;
                            z10 = z5;
                            function213 = function210;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z11 = z8;
                            visualTransformation2 = visualTransformation32;
                            keyboardActions4 = keyboardActions52;
                            composer3 = composer42;
                            z12 = z6;
                            i29 = i27;
                            function214 = function29;
                            function215 = function211;
                            shape3 = shape2;
                            textStyle5 = textStyle62;
                            function216 = function2222;
                            textFieldColors2 = textFieldColorsM2509outlinedTextFieldColorsl59Burw;
                            keyboardOptions4 = keyboardOptions3;
                            function217 = function212;
                            modifier3 = modifier42;
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
                int i312 = i15;
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
                int i3222 = i19;
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
            int i3122 = i15;
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
            int i32222 = i19;
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
        int i31222 = i15;
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
        int i322222 = i19;
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
    /* JADX WARN: Removed duplicated region for block: B:241:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05f2  */
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
    public static final void OutlinedTextField(final TextFieldValue value, final Function1<? super TextFieldValue, Unit> onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        final boolean z5;
        int i7;
        final boolean z6;
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
        int i23;
        TextStyle textStyle3;
        Function2<? super Composer, ? super Integer, Unit> function28;
        VisualTransformation none;
        int i24;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        MutableInteractionSource mutableInteractionSource2;
        Shape outlinedShape;
        int i25;
        Composer composer2;
        final KeyboardOptions keyboardOptions3;
        final TextFieldColors textFieldColorsM2509outlinedTextFieldColorsl59Burw;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        TextStyle textStyle4;
        int i26;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final boolean z7;
        final KeyboardActions keyboardActions3;
        final boolean z8;
        final int i27;
        final MutableInteractionSource mutableInteractionSource3;
        final Shape shape2;
        final int i28;
        char c;
        long jM5632getColor0d7_KjU;
        final boolean z9;
        final boolean z10;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final MutableInteractionSource mutableInteractionSource4;
        final boolean z11;
        final VisualTransformation visualTransformation2;
        final KeyboardActions keyboardActions4;
        Composer composer3;
        final boolean z12;
        final int i29;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        final Shape shape3;
        final TextStyle textStyle5;
        final Function2<? super Composer, ? super Integer, Unit> function216;
        final TextFieldColors textFieldColors2;
        final KeyboardOptions keyboardOptions4;
        final Function2<? super Composer, ? super Integer, Unit> function217;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(1040237435);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OutlinedTextField)P(18,10,9,1,12,16,6,11,7,17,15,3,19,5,4,14,8,2,13)289@15857L7,301@16471L39,302@16549L13,303@16612L25,311@16963L15,311@16897L2381:OutlinedTextField.kt#uh7d8r");
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
        int i30 = i4 & 4;
        if (i30 != 0) {
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
                    int i31 = i15;
                    i18 = i4 & 4096;
                    if (i18 != 0) {
                        i19 = i31;
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
                        int i32 = i19;
                        if ((i5 & 1533916891) != 306783378 || (1533916891 & i32) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            int i33 = i5;
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i30 == 0 ? Modifier.INSTANCE : modifier2;
                                boolean z13 = i6 == 0 ? true : z5;
                                boolean z14 = i7 == 0 ? false : z6;
                                if ((i4 & 32) == 0) {
                                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object objConsume = composerStartRestartGroup.consume(localTextStyle);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    textStyle3 = (TextStyle) objConsume;
                                    i23 = i33 & (-458753);
                                } else {
                                    i23 = i33;
                                    textStyle3 = textStyle2;
                                }
                                function28 = i8 == 0 ? null : function26;
                                Function2<? super Composer, ? super Integer, Unit> function218 = i9 == 0 ? null : function27;
                                Function2<? super Composer, ? super Integer, Unit> function219 = i10 == 0 ? null : function23;
                                Function2<? super Composer, ? super Integer, Unit> function220 = i12 == 0 ? null : function24;
                                Function2<? super Composer, ? super Integer, Unit> function221 = i14 == 0 ? null : function25;
                                boolean z15 = i17 == 0 ? false : z3;
                                none = i18 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                if ((i4 & 8192) == 0) {
                                    i24 = i32 & (-7169);
                                    keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                                } else {
                                    i24 = i32;
                                    keyboardOptions2 = keyboardOptions;
                                }
                                if ((i4 & 16384) == 0) {
                                    i24 &= -57345;
                                    keyboardActions2 = KeyboardActions.INSTANCE.getDefault();
                                } else {
                                    keyboardActions2 = keyboardActions;
                                }
                                boolean z16 = i20 == 0 ? false : z4;
                                int i34 = i21 == 0 ? Integer.MAX_VALUE : i;
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
                                    outlinedShape = TextFieldDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                                } else {
                                    outlinedShape = shape;
                                }
                                int i35 = i24;
                                if ((i4 & 524288) == 0) {
                                    KeyboardOptions keyboardOptions5 = keyboardOptions2;
                                    i25 = 1;
                                    composer2 = composerStartRestartGroup;
                                    keyboardOptions3 = keyboardOptions5;
                                    modifier2 = companion;
                                    function29 = function219;
                                    textFieldColorsM2509outlinedTextFieldColorsl59Burw = TextFieldDefaults.INSTANCE.m2509outlinedTextFieldColorsl59Burw(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 100663296, 268435455);
                                    i28 = i35 & (-1879048193);
                                    z5 = z13;
                                    z6 = z14;
                                    textStyle4 = textStyle3;
                                    i26 = i23;
                                    function210 = function218;
                                    function211 = function220;
                                    function212 = function221;
                                    z7 = z15;
                                    keyboardActions3 = keyboardActions2;
                                    z8 = z16;
                                    i27 = i34;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    shape2 = outlinedShape;
                                } else {
                                    KeyboardOptions keyboardOptions6 = keyboardOptions2;
                                    i25 = 1;
                                    composer2 = composerStartRestartGroup;
                                    keyboardOptions3 = keyboardOptions6;
                                    textFieldColorsM2509outlinedTextFieldColorsl59Burw = textFieldColors;
                                    modifier2 = companion;
                                    function29 = function219;
                                    z5 = z13;
                                    z6 = z14;
                                    textStyle4 = textStyle3;
                                    i26 = i23;
                                    function210 = function218;
                                    function211 = function220;
                                    function212 = function221;
                                    z7 = z15;
                                    keyboardActions3 = keyboardActions2;
                                    z8 = z16;
                                    i27 = i34;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    shape2 = outlinedShape;
                                    i28 = i35;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                int i36 = (i4 & 32) != 0 ? i33 & (-458753) : i33;
                                if ((i4 & 8192) != 0) {
                                    i32 &= -7169;
                                }
                                if ((i4 & 16384) != 0) {
                                    i32 &= -57345;
                                }
                                if ((i4 & 262144) != 0) {
                                    i32 &= -234881025;
                                }
                                if ((i4 & 524288) != 0) {
                                    i32 &= -1879048193;
                                }
                                function29 = function23;
                                function211 = function24;
                                function212 = function25;
                                z7 = z3;
                                none = visualTransformation;
                                z8 = z4;
                                mutableInteractionSource3 = mutableInteractionSource;
                                shape2 = shape;
                                textFieldColorsM2509outlinedTextFieldColorsl59Burw = textFieldColors;
                                i28 = i32;
                                i25 = 1;
                                function28 = function26;
                                function210 = function27;
                                keyboardActions3 = keyboardActions;
                                i27 = i;
                                composer2 = composerStartRestartGroup;
                                i26 = i36;
                                textStyle4 = textStyle2;
                                keyboardOptions3 = keyboardOptions;
                            }
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                c = 0;
                            } else {
                                c = 0;
                                ComposerKt.traceEventStart(1040237435, i26, i28, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:283)");
                            }
                            composer2.startReplaceableGroup(1663543409);
                            ComposerKt.sourceInformation(composer2, "*307@16789L18");
                            jM5632getColor0d7_KjU = textStyle4.m5632getColor0d7_KjU();
                            if (jM5632getColor0d7_KjU == Color.INSTANCE.m3693getUnspecified0d7_KjU()) {
                                jM5632getColor0d7_KjU = textFieldColorsM2509outlinedTextFieldColorsl59Burw.textColor$material3_release(z5, composer2, ((i26 >> 9) & 14) | ((i28 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).getValue().m3667unboximpl();
                            }
                            composer2.endReplaceableGroup();
                            final TextStyle textStyleMerge = textStyle4.merge(new TextStyle(jM5632getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
                            ProvidedValue[] providedValueArr = new ProvidedValue[i25];
                            TextStyle textStyle6 = textStyle4;
                            providedValueArr[c] = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColorsM2509outlinedTextFieldColorsl59Burw.getSelectionColors(composer2, (i28 >> 27) & 14));
                            final int i37 = i26;
                            Composer composer4 = composer2;
                            final Modifier modifier4 = modifier2;
                            final Function2<? super Composer, ? super Integer, Unit> function222 = function28;
                            final VisualTransformation visualTransformation3 = none;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer4, -719341509, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5
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

                                public final void invoke(Composer composer5, int i38) {
                                    Modifier modifierM1024paddingqDBjuR0$default;
                                    ComposerKt.sourceInformation(composer5, "C332@17853L20,313@17038L2234:OutlinedTextField.kt#uh7d8r");
                                    if ((i38 & 11) != 2 || !composer5.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-719341509, i38, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:311)");
                                        }
                                        if (function222 != null) {
                                            modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier4, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.1
                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(SemanticsPropertyReceiver semantics) {
                                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    invoke2(semanticsPropertyReceiver);
                                                    return Unit.INSTANCE;
                                                }
                                            }), 0.0f, OutlinedTextFieldKt.getOutlinedTextFieldTopPadding(), 0.0f, 0.0f, 13, null);
                                        } else {
                                            modifierM1024paddingqDBjuR0$default = modifier4;
                                        }
                                        Modifier modifierM1049defaultMinSizeVpY3zN4 = SizeKt.m1049defaultMinSizeVpY3zN4(modifierM1024paddingqDBjuR0$default, TextFieldDefaults.INSTANCE.m2506getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2505getMinHeightD9Ej5fM());
                                        TextFieldColors textFieldColors3 = textFieldColorsM2509outlinedTextFieldColorsl59Burw;
                                        boolean z17 = z7;
                                        int i39 = i28;
                                        SolidColor solidColor = new SolidColor(textFieldColors3.cursorColor$material3_release(z17, composer5, ((i39 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i39 >> 3) & 14)).getValue().m3667unboximpl(), null);
                                        TextFieldValue textFieldValue = value;
                                        Function1<TextFieldValue, Unit> function1 = onValueChange;
                                        boolean z18 = z5;
                                        boolean z19 = z6;
                                        TextStyle textStyle7 = textStyleMerge;
                                        KeyboardOptions keyboardOptions7 = keyboardOptions3;
                                        KeyboardActions keyboardActions5 = keyboardActions3;
                                        boolean z20 = z8;
                                        int i40 = i27;
                                        VisualTransformation visualTransformation4 = visualTransformation3;
                                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                                        SolidColor solidColor2 = solidColor;
                                        final TextFieldValue textFieldValue2 = value;
                                        final boolean z21 = z5;
                                        final boolean z22 = z8;
                                        final VisualTransformation visualTransformation5 = visualTransformation3;
                                        final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                                        final boolean z23 = z7;
                                        final Function2<Composer, Integer, Unit> function223 = function222;
                                        final Function2<Composer, Integer, Unit> function224 = function210;
                                        final Function2<Composer, Integer, Unit> function225 = function29;
                                        final Function2<Composer, Integer, Unit> function226 = function211;
                                        final Function2<Composer, Integer, Unit> function227 = function212;
                                        final TextFieldColors textFieldColors4 = textFieldColorsM2509outlinedTextFieldColorsl59Burw;
                                        final int i41 = i37;
                                        final int i42 = i28;
                                        final Shape shape4 = shape2;
                                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer5, 342910148, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2
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

                                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer6, int i43) {
                                                int i44;
                                                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                                ComposerKt.sourceInformation(composer6, "C340@18248L1000:OutlinedTextField.kt#uh7d8r");
                                                if ((i43 & 14) == 0) {
                                                    i44 = i43 | (composer6.changed(innerTextField) ? 4 : 2);
                                                } else {
                                                    i44 = i43;
                                                }
                                                if ((i44 & 91) != 18 || !composer6.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(342910148, i44, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:339)");
                                                    }
                                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                    String text = textFieldValue2.getText();
                                                    boolean z24 = z21;
                                                    int i45 = i44;
                                                    boolean z25 = z22;
                                                    VisualTransformation visualTransformation6 = visualTransformation5;
                                                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6;
                                                    boolean z26 = z23;
                                                    Function2<Composer, Integer, Unit> function228 = function223;
                                                    Function2<Composer, Integer, Unit> function229 = function224;
                                                    Function2<Composer, Integer, Unit> function230 = function225;
                                                    Function2<Composer, Integer, Unit> function231 = function226;
                                                    Function2<Composer, Integer, Unit> function232 = function227;
                                                    TextFieldColors textFieldColors5 = textFieldColors4;
                                                    final boolean z27 = z21;
                                                    final boolean z28 = z23;
                                                    final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource6;
                                                    final TextFieldColors textFieldColors6 = textFieldColors4;
                                                    final Shape shape5 = shape4;
                                                    final int i46 = i41;
                                                    final int i47 = i42;
                                                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer6, 119108444, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                            invoke(composer7, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer7, int i48) {
                                                            ComposerKt.sourceInformation(composer7, "C355@18964L244:OutlinedTextField.kt#uh7d8r");
                                                            if ((i48 & 11) != 2 || !composer7.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(119108444, i48, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:354)");
                                                                }
                                                                TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.INSTANCE;
                                                                boolean z29 = z27;
                                                                boolean z30 = z28;
                                                                MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource8;
                                                                TextFieldColors textFieldColors7 = textFieldColors6;
                                                                Shape shape6 = shape5;
                                                                int i49 = ((i46 >> 9) & 14) | 12582912;
                                                                int i50 = i47;
                                                                textFieldDefaults2.m2503OutlinedBorderContainerBoxnbWgWpA(z29, z30, mutableInteractionSource9, textFieldColors7, shape6, 0.0f, 0.0f, composer7, i49 | (i50 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i50 >> 15) & 896) | ((i50 >> 18) & 7168) | ((i50 >> 12) & 57344), 96);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer7.skipToGroupEnd();
                                                        }
                                                    });
                                                    int i48 = (i45 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS;
                                                    int i49 = i41;
                                                    int i50 = i42;
                                                    textFieldDefaults.OutlinedTextFieldDecorationBox(text, innerTextField, z24, z25, visualTransformation6, mutableInteractionSource7, z26, function228, function229, function230, function231, function232, textFieldColors5, null, composableLambda2, composer6, ((i50 >> 6) & 7168) | i48 | ((i49 >> 3) & 896) | ((i50 << 6) & 57344) | ((i50 >> 6) & 458752) | ((i50 << 15) & 3670016) | ((i49 << 3) & 29360128) | ((i49 << 3) & 234881024) | ((i49 << 3) & 1879048192), ((i49 >> 27) & 14) | 221184 | ((i50 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i50 >> 21) & 896), 8192);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer6.skipToGroupEnd();
                                            }
                                        });
                                        int i43 = (i37 & 64638) | ((i28 << 9) & 3670016) | (KeyboardActions.$stable << 21);
                                        int i44 = i28;
                                        BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifierM1049defaultMinSizeVpY3zN4, z18, z19, textStyle7, keyboardOptions7, keyboardActions5, z20, i40, visualTransformation4, (Function1) null, mutableInteractionSource5, solidColor2, composableLambda, composer5, i43 | ((i44 << 9) & 29360128) | ((i44 << 9) & 234881024) | ((i44 << 9) & 1879048192), ((i44 >> 6) & 14) | 24576 | ((i44 >> 15) & 896), 2048);
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
                            KeyboardActions keyboardActions5 = keyboardActions3;
                            z9 = z7;
                            z10 = z5;
                            function213 = function210;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z11 = z8;
                            visualTransformation2 = visualTransformation3;
                            keyboardActions4 = keyboardActions5;
                            composer3 = composer4;
                            z12 = z6;
                            i29 = i27;
                            function214 = function29;
                            function215 = function211;
                            shape3 = shape2;
                            textStyle5 = textStyle6;
                            function216 = function222;
                            textFieldColors2 = textFieldColorsM2509outlinedTextFieldColorsl59Burw;
                            keyboardOptions4 = keyboardOptions3;
                            function217 = function212;
                            modifier3 = modifier4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function215 = function24;
                            visualTransformation2 = visualTransformation;
                            z11 = z4;
                            i29 = i;
                            mutableInteractionSource4 = mutableInteractionSource;
                            shape3 = shape;
                            textFieldColors2 = textFieldColors;
                            composer3 = composerStartRestartGroup;
                            z10 = z5;
                            z12 = z6;
                            textStyle5 = textStyle2;
                            function216 = function26;
                            function213 = function27;
                            modifier3 = modifier2;
                            function214 = function23;
                            function217 = function25;
                            z9 = z3;
                            keyboardOptions4 = keyboardOptions;
                            keyboardActions4 = keyboardActions;
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.6
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

                            public final void invoke(Composer composer5, int i38) {
                                OutlinedTextFieldKt.OutlinedTextField(value, onValueChange, modifier3, z10, z12, textStyle5, function216, function213, function214, function215, function217, z9, visualTransformation2, keyboardOptions4, keyboardActions4, z11, i29, mutableInteractionSource4, shape3, textFieldColors2, composer5, i2 | 1, i3, i4);
                            }
                        });
                        return;
                    }
                    i19 = i31 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
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
                    int i322 = i19;
                    if ((i5 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        int i332 = i5;
                        if ((i2 & 1) != 0) {
                            if (i30 == 0) {
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
                            int i352 = i24;
                            if ((i4 & 524288) == 0) {
                            }
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2.startReplaceableGroup(1663543409);
                            ComposerKt.sourceInformation(composer2, "*307@16789L18");
                            jM5632getColor0d7_KjU = textStyle4.m5632getColor0d7_KjU();
                            if (jM5632getColor0d7_KjU == Color.INSTANCE.m3693getUnspecified0d7_KjU()) {
                            }
                            composer2.endReplaceableGroup();
                            final TextStyle textStyleMerge2 = textStyle4.merge(new TextStyle(jM5632getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
                            ProvidedValue[] providedValueArr2 = new ProvidedValue[i25];
                            TextStyle textStyle62 = textStyle4;
                            providedValueArr2[c] = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColorsM2509outlinedTextFieldColorsl59Burw.getSelectionColors(composer2, (i28 >> 27) & 14));
                            final int i372 = i26;
                            Composer composer42 = composer2;
                            final Modifier modifier42 = modifier2;
                            final Function2<? super Composer, ? super Integer, Unit> function2222 = function28;
                            final VisualTransformation visualTransformation32 = none;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr2, ComposableLambdaKt.composableLambda(composer42, -719341509, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5
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

                                public final void invoke(Composer composer5, int i38) {
                                    Modifier modifierM1024paddingqDBjuR0$default;
                                    ComposerKt.sourceInformation(composer5, "C332@17853L20,313@17038L2234:OutlinedTextField.kt#uh7d8r");
                                    if ((i38 & 11) != 2 || !composer5.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-719341509, i38, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:311)");
                                        }
                                        if (function2222 != null) {
                                            modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier42, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.1
                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(SemanticsPropertyReceiver semantics) {
                                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    invoke2(semanticsPropertyReceiver);
                                                    return Unit.INSTANCE;
                                                }
                                            }), 0.0f, OutlinedTextFieldKt.getOutlinedTextFieldTopPadding(), 0.0f, 0.0f, 13, null);
                                        } else {
                                            modifierM1024paddingqDBjuR0$default = modifier42;
                                        }
                                        Modifier modifierM1049defaultMinSizeVpY3zN4 = SizeKt.m1049defaultMinSizeVpY3zN4(modifierM1024paddingqDBjuR0$default, TextFieldDefaults.INSTANCE.m2506getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2505getMinHeightD9Ej5fM());
                                        TextFieldColors textFieldColors3 = textFieldColorsM2509outlinedTextFieldColorsl59Burw;
                                        boolean z17 = z7;
                                        int i39 = i28;
                                        SolidColor solidColor = new SolidColor(textFieldColors3.cursorColor$material3_release(z17, composer5, ((i39 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i39 >> 3) & 14)).getValue().m3667unboximpl(), null);
                                        TextFieldValue textFieldValue = value;
                                        Function1<TextFieldValue, Unit> function1 = onValueChange;
                                        boolean z18 = z5;
                                        boolean z19 = z6;
                                        TextStyle textStyle7 = textStyleMerge2;
                                        KeyboardOptions keyboardOptions7 = keyboardOptions3;
                                        KeyboardActions keyboardActions52 = keyboardActions3;
                                        boolean z20 = z8;
                                        int i40 = i27;
                                        VisualTransformation visualTransformation4 = visualTransformation32;
                                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                                        SolidColor solidColor2 = solidColor;
                                        final TextFieldValue textFieldValue2 = value;
                                        final boolean z21 = z5;
                                        final boolean z22 = z8;
                                        final VisualTransformation visualTransformation5 = visualTransformation32;
                                        final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                                        final boolean z23 = z7;
                                        final Function2<? super Composer, ? super Integer, Unit> function223 = function2222;
                                        final Function2<? super Composer, ? super Integer, Unit> function224 = function210;
                                        final Function2<? super Composer, ? super Integer, Unit> function225 = function29;
                                        final Function2<? super Composer, ? super Integer, Unit> function226 = function211;
                                        final Function2<? super Composer, ? super Integer, Unit> function227 = function212;
                                        final TextFieldColors textFieldColors4 = textFieldColorsM2509outlinedTextFieldColorsl59Burw;
                                        final int i41 = i372;
                                        final int i42 = i28;
                                        final Shape shape4 = shape2;
                                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer5, 342910148, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2
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

                                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer6, int i43) {
                                                int i44;
                                                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                                ComposerKt.sourceInformation(composer6, "C340@18248L1000:OutlinedTextField.kt#uh7d8r");
                                                if ((i43 & 14) == 0) {
                                                    i44 = i43 | (composer6.changed(innerTextField) ? 4 : 2);
                                                } else {
                                                    i44 = i43;
                                                }
                                                if ((i44 & 91) != 18 || !composer6.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(342910148, i44, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:339)");
                                                    }
                                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                    String text = textFieldValue2.getText();
                                                    boolean z24 = z21;
                                                    int i45 = i44;
                                                    boolean z25 = z22;
                                                    VisualTransformation visualTransformation6 = visualTransformation5;
                                                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6;
                                                    boolean z26 = z23;
                                                    Function2<Composer, Integer, Unit> function228 = function223;
                                                    Function2<Composer, Integer, Unit> function229 = function224;
                                                    Function2<Composer, Integer, Unit> function230 = function225;
                                                    Function2<Composer, Integer, Unit> function231 = function226;
                                                    Function2<Composer, Integer, Unit> function232 = function227;
                                                    TextFieldColors textFieldColors5 = textFieldColors4;
                                                    final boolean z27 = z21;
                                                    final boolean z28 = z23;
                                                    final MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource6;
                                                    final TextFieldColors textFieldColors6 = textFieldColors4;
                                                    final Shape shape5 = shape4;
                                                    final int i46 = i41;
                                                    final int i47 = i42;
                                                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer6, 119108444, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                            invoke(composer7, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer7, int i48) {
                                                            ComposerKt.sourceInformation(composer7, "C355@18964L244:OutlinedTextField.kt#uh7d8r");
                                                            if ((i48 & 11) != 2 || !composer7.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(119108444, i48, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:354)");
                                                                }
                                                                TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.INSTANCE;
                                                                boolean z29 = z27;
                                                                boolean z30 = z28;
                                                                MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource8;
                                                                TextFieldColors textFieldColors7 = textFieldColors6;
                                                                Shape shape6 = shape5;
                                                                int i49 = ((i46 >> 9) & 14) | 12582912;
                                                                int i50 = i47;
                                                                textFieldDefaults2.m2503OutlinedBorderContainerBoxnbWgWpA(z29, z30, mutableInteractionSource9, textFieldColors7, shape6, 0.0f, 0.0f, composer7, i49 | (i50 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i50 >> 15) & 896) | ((i50 >> 18) & 7168) | ((i50 >> 12) & 57344), 96);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer7.skipToGroupEnd();
                                                        }
                                                    });
                                                    int i48 = (i45 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS;
                                                    int i49 = i41;
                                                    int i50 = i42;
                                                    textFieldDefaults.OutlinedTextFieldDecorationBox(text, innerTextField, z24, z25, visualTransformation6, mutableInteractionSource7, z26, function228, function229, function230, function231, function232, textFieldColors5, null, composableLambda2, composer6, ((i50 >> 6) & 7168) | i48 | ((i49 >> 3) & 896) | ((i50 << 6) & 57344) | ((i50 >> 6) & 458752) | ((i50 << 15) & 3670016) | ((i49 << 3) & 29360128) | ((i49 << 3) & 234881024) | ((i49 << 3) & 1879048192), ((i49 >> 27) & 14) | 221184 | ((i50 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i50 >> 21) & 896), 8192);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer6.skipToGroupEnd();
                                            }
                                        });
                                        int i43 = (i372 & 64638) | ((i28 << 9) & 3670016) | (KeyboardActions.$stable << 21);
                                        int i44 = i28;
                                        BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifierM1049defaultMinSizeVpY3zN4, z18, z19, textStyle7, keyboardOptions7, keyboardActions52, z20, i40, visualTransformation4, (Function1) null, mutableInteractionSource5, solidColor2, composableLambda, composer5, i43 | ((i44 << 9) & 29360128) | ((i44 << 9) & 234881024) | ((i44 << 9) & 1879048192), ((i44 >> 6) & 14) | 24576 | ((i44 >> 15) & 896), 2048);
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
                            KeyboardActions keyboardActions52 = keyboardActions3;
                            z9 = z7;
                            z10 = z5;
                            function213 = function210;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            z11 = z8;
                            visualTransformation2 = visualTransformation32;
                            keyboardActions4 = keyboardActions52;
                            composer3 = composer42;
                            z12 = z6;
                            i29 = i27;
                            function214 = function29;
                            function215 = function211;
                            shape3 = shape2;
                            textStyle5 = textStyle62;
                            function216 = function2222;
                            textFieldColors2 = textFieldColorsM2509outlinedTextFieldColorsl59Burw;
                            keyboardOptions4 = keyboardOptions3;
                            function217 = function212;
                            modifier3 = modifier42;
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
                int i312 = i15;
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
                int i3222 = i19;
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
            int i3122 = i15;
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
            int i32222 = i19;
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
        int i31222 = i15;
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
        int i322222 = i19;
        if ((i5 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ExperimentalMaterial3Api
    public static final void OutlinedTextFieldLayout(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> textField, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final boolean z, final float f, final Function1<? super Size, Unit> onLabelMeasured, final Function2<? super Composer, ? super Integer, Unit> container, Function2<? super Composer, ? super Integer, Unit> function24, final PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function32;
        Function2<? super Composer, ? super Integer, Unit> function25;
        final Function2<? super Composer, ? super Integer, Unit> function26 = function24;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(textField, "textField");
        Intrinsics.checkNotNullParameter(onLabelMeasured, "onLabelMeasured");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Composer composerStartRestartGroup = composer.startRestartGroup(-222199799);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OutlinedTextFieldLayout)P(4,10,7,2,3,11,8!1,5!1,9)391@20070L239,399@20357L7,400@20369L2109:OutlinedTextField.kt#uh7d8r");
        int i4 = (i & 14) == 0 ? (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i : i;
        if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i4 |= composerStartRestartGroup.changed(textField) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(function3) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i4 |= composerStartRestartGroup.changed(function2) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i4 |= composerStartRestartGroup.changed(function22) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i4 |= composerStartRestartGroup.changed(function23) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i4 |= composerStartRestartGroup.changed(onLabelMeasured) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((1879048192 & i) == 0) {
            i4 |= composerStartRestartGroup.changed(container) ? 536870912 : 268435456;
        }
        int i5 = (i2 & 14) == 0 ? i2 | (composerStartRestartGroup.changed(function26) ? 4 : 2) : i2;
        if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i5 |= composerStartRestartGroup.changed(paddingValues) ? 32 : 16;
        }
        if ((i4 & 1533916891) != 306783378 || (i5 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-222199799, i4, i5, "androidx.compose.material3.OutlinedTextFieldLayout (OutlinedTextField.kt:377)");
            }
            Object[] objArr = {onLabelMeasured, Boolean.valueOf(z), Float.valueOf(f), paddingValues};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            int i6 = i5;
            boolean zChanged = false;
            for (int i7 = 0; i7 < 4; i7++) {
                zChanged |= composerStartRestartGroup.changed(objArr[i7]);
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OutlinedTextFieldMeasurePolicy(onLabelMeasured, z, f, paddingValues);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) objRememberedValue;
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
            int i8 = i4;
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
            Updater.m3157setimpl(composerM3150constructorimpl, outlinedTextFieldMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m3157setimpl(composerM3150constructorimpl, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m3157setimpl(composerM3150constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m3141boximpl(SkippableUpdater.m3142constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-147819150);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C403@20438L11,442@21889L182,454@22246L163:OutlinedTextField.kt#uh7d8r");
            container.invoke(composerStartRestartGroup, Integer.valueOf((i8 >> 27) & 14));
            composerStartRestartGroup.startReplaceableGroup(1116449790);
            ComposerKt.sourceInformation(composerStartRestartGroup, "406@20502L219");
            if (function22 != null) {
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
                composerStartRestartGroup.startReplaceableGroup(2127001777);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C410@20694L9:OutlinedTextField.kt#uh7d8r");
                function22.invoke(composerStartRestartGroup, Integer.valueOf((i8 >> 12) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1116450075);
            ComposerKt.sourceInformation(composerStartRestartGroup, "414@20788L221");
            if (function23 != null) {
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
                composerStartRestartGroup.startReplaceableGroup(-827051110);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C418@20981L10:OutlinedTextField.kt#uh7d8r");
                function23.invoke(composerStartRestartGroup, Integer.valueOf((i8 >> 15) & 14));
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
            if (function22 != null) {
                i3 = 0;
                fCalculateStartPadding = Dp.m6117constructorimpl(RangesKt.coerceAtLeast(Dp.m6117constructorimpl(fCalculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m6117constructorimpl(0)));
            } else {
                i3 = 0;
            }
            float f2 = fCalculateStartPadding;
            if (function23 != null) {
                fCalculateEndPadding = Dp.m6117constructorimpl(RangesKt.coerceAtLeast(Dp.m6117constructorimpl(fCalculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m6117constructorimpl(i3)));
            }
            Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(companion, f2, 0.0f, fCalculateEndPadding, 0.0f, 10, null);
            composerStartRestartGroup.startReplaceableGroup(1116451086);
            ComposerKt.sourceInformation(composerStartRestartGroup, "439@21802L59");
            if (function3 != null) {
                function32 = function3;
                function32.invoke(LayoutIdKt.layoutId(Modifier.INSTANCE, "Hint").then(modifierM1024paddingqDBjuR0$default), composerStartRestartGroup, Integer.valueOf((i8 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS));
            } else {
                function32 = function3;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen3 = LayoutIdKt.layoutId(Modifier.INSTANCE, "TextField").then(modifierM1024paddingqDBjuR0$default);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composerStartRestartGroup, 48);
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
            composerStartRestartGroup.startReplaceableGroup(-475693524);
            ComposerKt.sourceInformation(composerStartRestartGroup, "C446@22046L11:OutlinedTextField.kt#uh7d8r");
            textField.invoke(composerStartRestartGroup, Integer.valueOf((i8 >> 3) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1116451412);
            ComposerKt.sourceInformation(composerStartRestartGroup, "450@22122L54");
            if (function2 != null) {
                Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, "Label");
                composerStartRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
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
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierLayoutId);
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
                composerStartRestartGroup.startReplaceableGroup(-1527117480);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C450@22167L7:OutlinedTextField.kt#uh7d8r");
                function25 = function2;
                function25.invoke(composerStartRestartGroup, Integer.valueOf((i8 >> 9) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                function25 = function2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (function24 != null) {
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
                composerStartRestartGroup.startReplaceableGroup(270332983);
                ComposerKt.sourceInformation(composerStartRestartGroup, "C457@22395L12:OutlinedTextField.kt#uh7d8r");
                function26 = function24;
                function26.invoke(composerStartRestartGroup, Integer.valueOf(i6 & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                function26 = function24;
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
            function25 = function2;
            function32 = function3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function33 = function32;
        final Function2<? super Composer, ? super Integer, Unit> function27 = function25;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextFieldLayout.2
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

            public final void invoke(Composer composer2, int i9) {
                OutlinedTextFieldKt.OutlinedTextFieldLayout(modifier, textField, function33, function27, function22, function23, z, f, onLabelMeasured, container, function26, paddingValues, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-O3s9Psw, reason: not valid java name */
    public static final int m2395calculateWidthO3s9Psw(int i, int i2, int i3, int i4, int i5, boolean z, long j, float f, PaddingValues paddingValues) {
        return Math.max(i + Math.max(i3, Math.max(z ? i4 : 0, i5)) + i2, Math.max(z ? 0 : i4 + MathKt.roundToInt(Dp.m6117constructorimpl(paddingValues.mo971calculateLeftPaddingu2uoSUM(LayoutDirection.Ltr) + paddingValues.mo972calculateRightPaddingu2uoSUM(LayoutDirection.Ltr)) * f), Constraints.m6072getMinWidthimpl(j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m2394calculateHeightO3s9Psw(int i, int i2, int i3, int i4, int i5, int i6, long j, float f, PaddingValues paddingValues) {
        return Math.max(Constraints.m6071getMinHeightimpl(j), Math.max(i, Math.max(i2, MathKt.roundToInt(Math.max(i3, i5) + (paddingValues.getBottom() * f) + Math.max(paddingValues.getTop() * f, i4 / 2.0f)))) + i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, float f, boolean z, float f2, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        Placeable.PlacementScope.m5057place70tqf50$default(placementScope, placeable6, IntOffset.INSTANCE.m6255getZeronOccac(), 0.0f, 2, null);
        int iHeightOrZero = i - TextFieldImplKt.heightOrZero(placeable7);
        int iRoundToInt = MathKt.roundToInt(paddingValues.getTop() * f2);
        int iRoundToInt2 = MathKt.roundToInt(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f2);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f2;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2 - placeable2.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            float f3 = 1 - f;
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, MathKt.roundToInt(placeable == null ? 0.0f : (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding) * f3) + iRoundToInt2, MathKt.roundToInt(((z ? Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), iHeightOrZero) : iRoundToInt) * f3) - ((placeable4.getHeight() / 2) * f)), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), Math.max(z ? Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), iHeightOrZero) : iRoundToInt, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        if (placeable5 != null) {
            if (z) {
                iRoundToInt = Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), iHeightOrZero);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable), iRoundToInt, 0.0f, 4, null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, 0, iHeightOrZero, 0.0f, 4, null);
        }
    }

    /* renamed from: outlineCutout-12SF9DM, reason: not valid java name */
    public static final Modifier m2396outlineCutout12SF9DM(Modifier outlineCutout, final long j, final PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(outlineCutout, "$this$outlineCutout");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        return DrawModifierKt.drawWithContent(outlineCutout, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$outlineCutout$1

            /* compiled from: OutlinedTextField.kt */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    iArr[LayoutDirection.Rtl.ordinal()] = 1;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

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
                float fCoerceAtLeast;
                Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                float fM3485getWidthimpl = Size.m3485getWidthimpl(j);
                if (fM3485getWidthimpl > 0.0f) {
                    float f = drawWithContent.mo712toPx0680j_4(OutlinedTextFieldKt.OutlinedTextFieldInnerPadding);
                    float f2 = drawWithContent.mo712toPx0680j_4(paddingValues.mo971calculateLeftPaddingu2uoSUM(drawWithContent.getLayoutDirection())) - f;
                    float f3 = 2;
                    float fM3485getWidthimpl2 = fM3485getWidthimpl + f2 + (f * f3);
                    if (WhenMappings.$EnumSwitchMapping$0[drawWithContent.getLayoutDirection().ordinal()] == 1) {
                        fCoerceAtLeast = Size.m3485getWidthimpl(drawWithContent.mo4213getSizeNHjbRc()) - fM3485getWidthimpl2;
                    } else {
                        fCoerceAtLeast = RangesKt.coerceAtLeast(f2, 0.0f);
                    }
                    float f4 = fCoerceAtLeast;
                    if (WhenMappings.$EnumSwitchMapping$0[drawWithContent.getLayoutDirection().ordinal()] == 1) {
                        fM3485getWidthimpl2 = Size.m3485getWidthimpl(drawWithContent.mo4213getSizeNHjbRc()) - RangesKt.coerceAtLeast(f2, 0.0f);
                    }
                    float f5 = fM3485getWidthimpl2;
                    float fM3482getHeightimpl = Size.m3482getHeightimpl(j);
                    float f6 = (-fM3482getHeightimpl) / f3;
                    float f7 = fM3482getHeightimpl / f3;
                    int iM3645getDifferencertfAjoo = ClipOp.INSTANCE.m3645getDifferencertfAjoo();
                    DrawContext drawContext = drawWithContent.getDrawContext();
                    long jMo4134getSizeNHjbRc = drawContext.mo4134getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    drawContext.getTransform().mo4137clipRectN_I0leg(f4, f6, f5, f7, iM3645getDifferencertfAjoo);
                    drawWithContent.drawContent();
                    drawContext.getCanvas().restore();
                    drawContext.mo4135setSizeuvyYCjk(jMo4134getSizeNHjbRc);
                    return;
                }
                drawWithContent.drawContent();
            }
        });
    }

    public static final float getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }
}
