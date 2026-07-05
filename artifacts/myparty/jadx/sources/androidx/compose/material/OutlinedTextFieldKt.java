package androidx.compose.material;

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
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.util.MathHelpersKt;
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

/* compiled from: OutlinedTextField.kt */
@Metadata(d1 = {"\u0000®\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0087\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0015\b\u0002\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018¢\u0006\u0002\b\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00132\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00132\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,H\u0007¢\u0006\u0002\u0010-\u001a\u0093\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0015\b\u0002\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018¢\u0006\u0002\b\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00132\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00132\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010.\u001a\u00020&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,H\u0007¢\u0006\u0002\u0010/\u001a\u0087\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0015\b\u0002\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018¢\u0006\u0002\b\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00132\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00132\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,H\u0007¢\u0006\u0002\u00100\u001a\u0093\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0015\b\u0002\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018¢\u0006\u0002\b\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00132\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00132\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010.\u001a\u00020&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,H\u0007¢\u0006\u0002\u00101\u001aÁ\u0001\u00102\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0018¢\u0006\u0002\b\u00192\u0019\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f¢\u0006\u0002\b\u00192\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0013\u00104\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0013\u00105\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0006\u0010$\u001a\u00020\u00132\u0006\u00106\u001a\u0002072\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u000b0\u000f2\u0011\u0010:\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0018¢\u0006\u0002\b\u00192\u0006\u0010;\u001a\u00020<H\u0001¢\u0006\u0002\u0010=\u001aZ\u0010>\u001a\u00020&2\u0006\u0010?\u001a\u00020&2\u0006\u0010@\u001a\u00020&2\u0006\u0010A\u001a\u00020&2\u0006\u0010B\u001a\u00020&2\u0006\u0010C\u001a\u00020&2\u0006\u00106\u001a\u0002072\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u0002072\u0006\u0010;\u001a\u00020<H\u0002ø\u0001\u0000¢\u0006\u0004\bG\u0010H\u001aZ\u0010I\u001a\u00020&2\u0006\u0010J\u001a\u00020&2\u0006\u0010K\u001a\u00020&2\u0006\u0010L\u001a\u00020&2\u0006\u0010M\u001a\u00020&2\u0006\u0010N\u001a\u00020&2\u0006\u00106\u001a\u0002072\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u0002072\u0006\u0010;\u001a\u00020<H\u0002ø\u0001\u0000¢\u0006\u0004\bO\u0010H\u001a&\u0010P\u001a\u00020\u0011*\u00020\u00112\u0006\u0010Q\u001a\u0002092\u0006\u0010;\u001a\u00020<H\u0000ø\u0001\u0000¢\u0006\u0004\bR\u0010S\u001a|\u0010T\u001a\u00020\u000b*\u00020U2\u0006\u0010V\u001a\u00020&2\u0006\u0010W\u001a\u00020&2\b\u0010X\u001a\u0004\u0018\u00010Y2\b\u0010Z\u001a\u0004\u0018\u00010Y2\u0006\u0010[\u001a\u00020Y2\b\u0010\\\u001a\u0004\u0018\u00010Y2\b\u0010]\u001a\u0004\u0018\u00010Y2\u0006\u0010^\u001a\u00020Y2\u0006\u00106\u001a\u0002072\u0006\u0010$\u001a\u00020\u00132\u0006\u0010F\u001a\u0002072\u0006\u0010_\u001a\u00020`2\u0006\u0010;\u001a\u00020<H\u0002\u001a\u0014\u0010a\u001a\u00020&*\u00020&2\u0006\u0010b\u001a\u00020&H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0016\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006c"}, d2 = {"BorderId", "", "OutlinedTextFieldInnerPadding", "Landroidx/compose/ui/unit/Dp;", "F", "OutlinedTextFieldTopPadding", "Landroidx/compose/ui/unit/TextUnit;", "getOutlinedTextFieldTopPadding", "()J", "J", "OutlinedTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", ViewProps.ENABLED, "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", ReactTextInputShadowNode.PROP_PLACEHOLDER, "leadingIcon", "trailingIcon", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", PaymentSheetAppearanceKeys.COLORS, "Landroidx/compose/material/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "minLines", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "OutlinedTextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "onLabelMeasured", "Landroidx/compose/ui/geometry/Size;", "border", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateHeight", "leadingPlaceableHeight", "trailingPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-O3s9Psw", "(IIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingPlaceableWidth", "trailingPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "calculateWidth-O3s9Psw", "outlineCutout", "labelSize", "outlineCutout-12SF9DM", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "place", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "height", "width", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "borderPlaceable", ViewProps.LAYOUT_DIRECTION, "Landroidx/compose/ui/unit/LayoutDirection;", "substractConstraintSafely", "from", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt {
    public static final String BorderId = "border";
    private static final float OutlinedTextFieldInnerPadding = Dp.m6117constructorimpl(4);
    private static final long OutlinedTextFieldTopPadding = TextUnitKt.getSp(8);

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
    /* JADX WARN: Removed duplicated region for block: B:134:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:328:? A[RETURN, SYNTHETIC] */
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
    public static final void OutlinedTextField(final String str, final Function1<? super String, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i3, final int i4, final int i5) {
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
        int i27;
        int i28;
        Modifier.Companion companion;
        TextStyle textStyle3;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        KeyboardOptions keyboardOptions2;
        int i29;
        MutableInteractionSource mutableInteractionSource2;
        Shape outlinedTextFieldShape;
        int i30;
        Composer composer2;
        TextFieldColors textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs;
        boolean z7;
        boolean z8;
        TextStyle textStyle4;
        int i31;
        boolean z9;
        VisualTransformation visualTransformation2;
        KeyboardActions keyboardActions2;
        boolean z10;
        int i32;
        int i33;
        int i34;
        boolean z11;
        MutableInteractionSource mutableInteractionSource3;
        long jM5632getColor0d7_KjU;
        TextStyle textStyle5;
        Modifier.Companion companionM1024paddingqDBjuR0$default;
        Composer composer3;
        final boolean z12;
        final VisualTransformation visualTransformation3;
        final TextFieldColors textFieldColors2;
        final boolean z13;
        final boolean z14;
        final int i35;
        final int i36;
        final Modifier modifier3;
        final TextStyle textStyle6;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final MutableInteractionSource mutableInteractionSource4;
        final Shape shape2;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final boolean z15;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-621914704);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OutlinedTextField)P(18,11,10,1,13,16,6,12,7,17,3,19,5,4,15,8,9,2,14)142@7875L7,155@8525L22,156@8597L25,166@9030L7,183@9689L38,192@10056L20,200@10398L925,169@9086L2243:OutlinedTextField.kt#jmzs0o");
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
                                int i37 = i18;
                                i21 = i5 & 4096;
                                if (i21 != 0) {
                                    i22 = i37 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                                } else {
                                    int i38 = i37;
                                    if ((i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                        i38 |= composerStartRestartGroup.changed(keyboardOptions) ? 256 : 128;
                                    }
                                    i22 = i38;
                                }
                                i23 = i5 & 8192;
                                if (i23 != 0) {
                                    i24 = i22 | 3072;
                                } else {
                                    int i39 = i22;
                                    if ((i4 & 3072) == 0) {
                                        i24 = i39 | (composerStartRestartGroup.changed(keyboardActions) ? 2048 : 1024);
                                    } else {
                                        i24 = i39;
                                    }
                                }
                                i25 = i5 & 16384;
                                if (i25 == 0) {
                                    i26 = i24;
                                    if ((i4 & 24576) == 0) {
                                        i26 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                                    }
                                    if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        i26 |= ((i5 & 32768) == 0 && composerStartRestartGroup.changed(i)) ? 131072 : 65536;
                                    }
                                    i27 = i5 & 65536;
                                    if (i27 == 0) {
                                        i26 |= 1572864;
                                    } else if ((i4 & 1572864) == 0) {
                                        i26 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
                                    }
                                    i28 = i5 & 131072;
                                    if (i28 == 0) {
                                        i26 |= 12582912;
                                    } else if ((i4 & 12582912) == 0) {
                                        i26 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                                    }
                                    if ((i4 & 100663296) == 0) {
                                        i26 |= ((i5 & 262144) == 0 && composerStartRestartGroup.changed(shape)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                    }
                                    if ((i4 & 805306368) == 0) {
                                        i26 |= ((i5 & 524288) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 536870912 : 268435456;
                                    }
                                    if ((i6 & 306783379) == 306783378 || (i26 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.startDefaults();
                                        if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                            companion = i7 == 0 ? Modifier.INSTANCE : modifier2;
                                            boolean z16 = i8 == 0 ? true : z;
                                            if (i9 != 0) {
                                                z6 = false;
                                            }
                                            boolean z17 = z6;
                                            if ((i5 & 32) == 0) {
                                                ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                Object objConsume = composerStartRestartGroup.consume(localTextStyle);
                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                i6 &= -458753;
                                                textStyle3 = (TextStyle) objConsume;
                                            } else {
                                                textStyle3 = textStyle2;
                                            }
                                            int i40 = i6;
                                            Function2<? super Composer, ? super Integer, Unit> function214 = i10 == 0 ? null : function25;
                                            function27 = i11 == 0 ? null : function26;
                                            function28 = i13 == 0 ? null : function23;
                                            function29 = i15 == 0 ? null : function24;
                                            boolean z18 = i17 == 0 ? false : z3;
                                            VisualTransformation none = i20 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                            keyboardOptions2 = i21 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                            KeyboardActions keyboardActions4 = i23 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                            boolean z19 = i25 == 0 ? false : z4;
                                            if ((32768 & i5) == 0) {
                                                i26 &= -458753;
                                                i29 = z19 ? 1 : Integer.MAX_VALUE;
                                            } else {
                                                i29 = i;
                                            }
                                            int i41 = i27 == 0 ? 1 : i2;
                                            mutableInteractionSource2 = i28 == 0 ? null : mutableInteractionSource;
                                            if ((262144 & i5) == 0) {
                                                outlinedTextFieldShape = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape(composerStartRestartGroup, 6);
                                                i30 = i26 & (-234881025);
                                            } else {
                                                outlinedTextFieldShape = shape;
                                                i30 = i26;
                                            }
                                            if ((i5 & 524288) == 0) {
                                                composer2 = composerStartRestartGroup;
                                                textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m2059outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 48, 2097151);
                                                i34 = i30 & (-1879048193);
                                                z7 = z16;
                                                z8 = z17;
                                                textStyle4 = textStyle3;
                                                i31 = i40;
                                                function25 = function214;
                                                z9 = z18;
                                                visualTransformation2 = none;
                                                keyboardActions2 = keyboardActions4;
                                                z10 = z19;
                                                i32 = i29;
                                                i33 = i41;
                                            } else {
                                                composer2 = composerStartRestartGroup;
                                                textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                                z7 = z16;
                                                z8 = z17;
                                                textStyle4 = textStyle3;
                                                i31 = i40;
                                                function25 = function214;
                                                z9 = z18;
                                                visualTransformation2 = none;
                                                keyboardActions2 = keyboardActions4;
                                                z10 = z19;
                                                i32 = i29;
                                                i33 = i41;
                                                i34 = i30;
                                            }
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            if ((i5 & 32) != 0) {
                                                i6 &= -458753;
                                            }
                                            if ((32768 & i5) != 0) {
                                                i26 &= -458753;
                                            }
                                            if ((262144 & i5) != 0) {
                                                i26 &= -234881025;
                                            }
                                            if ((i5 & 524288) != 0) {
                                                i26 &= -1879048193;
                                            }
                                            function28 = function23;
                                            function29 = function24;
                                            visualTransformation2 = visualTransformation;
                                            keyboardOptions2 = keyboardOptions;
                                            keyboardActions2 = keyboardActions;
                                            z10 = z4;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                            outlinedTextFieldShape = shape;
                                            composer2 = composerStartRestartGroup;
                                            z8 = z6;
                                            i31 = i6;
                                            textStyle4 = textStyle2;
                                            function27 = function26;
                                            companion = modifier2;
                                            i34 = i26;
                                            z7 = z;
                                            z9 = z3;
                                            i32 = i;
                                            i33 = i2;
                                            textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                        }
                                        composer2.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            z11 = z8;
                                        } else {
                                            z11 = z8;
                                            ComposerKt.traceEventStart(-621914704, i31, i34, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:157)");
                                        }
                                        if (mutableInteractionSource2 != null) {
                                            composer2.startReplaceGroup(-589524042);
                                            ComposerKt.sourceInformation(composer2, "159@8708L39");
                                            ComposerKt.sourceInformationMarkerStart(composer2, 673719756, "CC(remember):OutlinedTextField.kt#9igjgp");
                                            Object objRememberedValue = composer2.rememberedValue();
                                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                composer2.updateRememberedValue(objRememberedValue);
                                            }
                                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endReplaceGroup();
                                        } else {
                                            composer2.startReplaceGroup(673719105);
                                            composer2.endReplaceGroup();
                                            mutableInteractionSource3 = mutableInteractionSource2;
                                        }
                                        composer2.startReplaceGroup(673724863);
                                        ComposerKt.sourceInformation(composer2, "*162@8895L18");
                                        jM5632getColor0d7_KjU = textStyle4.m5632getColor0d7_KjU();
                                        if (jM5632getColor0d7_KjU == 16) {
                                            jM5632getColor0d7_KjU = textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs.textColor(z7, composer2, ((i31 >> 9) & 14) | ((i34 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).getValue().m3667unboximpl();
                                        }
                                        composer2.endReplaceGroup();
                                        TextStyle textStyleMerge = textStyle4.merge(new TextStyle(jM5632getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                        int i42 = i31;
                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                        final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                                        int i43 = i34;
                                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object objConsume2 = composer2.consume(localDensity);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        Density density = (Density) objConsume2;
                                        if (function25 == null) {
                                            textStyle5 = textStyle4;
                                            companionM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.1
                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    invoke2(semanticsPropertyReceiver);
                                                    return Unit.INSTANCE;
                                                }
                                            }), 0.0f, density.mo707toDpGaN1DYA(OutlinedTextFieldTopPadding), 0.0f, 0.0f, 13, null);
                                        } else {
                                            textStyle5 = textStyle4;
                                            companionM1024paddingqDBjuR0$default = Modifier.INSTANCE;
                                        }
                                        Modifier modifier4 = companion;
                                        final boolean z20 = z9;
                                        final boolean z21 = z7;
                                        final TextFieldColors textFieldColors3 = textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs;
                                        final Function2<? super Composer, ? super Integer, Unit> function215 = function25;
                                        final boolean z22 = z10;
                                        final VisualTransformation visualTransformation4 = visualTransformation2;
                                        final Function2<? super Composer, ? super Integer, Unit> function216 = function27;
                                        final Function2<? super Composer, ? super Integer, Unit> function217 = function28;
                                        final Function2<? super Composer, ? super Integer, Unit> function218 = function29;
                                        final Shape shape3 = outlinedTextFieldShape;
                                        int i44 = i43 << 12;
                                        TextStyle textStyle7 = textStyle5;
                                        Composer composer4 = composer2;
                                        KeyboardOptions keyboardOptions4 = keyboardOptions2;
                                        boolean z23 = z11;
                                        BasicTextFieldKt.BasicTextField(str, function1, SizeKt.m1049defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(companion.then(companionM1024paddingqDBjuR0$default), z9, Strings_androidKt.m2014getString4foXLRw(Strings.INSTANCE.m2009getDefaultErrorMessageUdPEhr4(), composer2, 6)), TextFieldDefaults.INSTANCE.m2056getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2055getMinHeightD9Ej5fM()), z7, z23, textStyleMerge, keyboardOptions4, keyboardActions2, z10, i32, i33, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource5, new SolidColor(textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs.cursorColor(z9, composer2, (i43 & 14) | ((i43 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).getValue().m3667unboximpl(), null), ComposableLambdaKt.rememberComposableLambda(1710364390, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.3
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

                                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> function219, Composer composer5, int i45) {
                                                int i46;
                                                ComposerKt.sourceInformation(composer5, "C215@11038L261,201@10448L865:OutlinedTextField.kt#jmzs0o");
                                                if ((i45 & 6) == 0) {
                                                    i46 = i45 | (composer5.changedInstance(function219) ? 4 : 2);
                                                } else {
                                                    i46 = i45;
                                                }
                                                if ((i46 & 19) != 18 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1710364390, i46, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:201)");
                                                    }
                                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                    int i47 = i46;
                                                    String str2 = str;
                                                    boolean z24 = z21;
                                                    boolean z25 = z22;
                                                    VisualTransformation visualTransformation5 = visualTransformation4;
                                                    MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource5;
                                                    boolean z26 = z20;
                                                    Function2<Composer, Integer, Unit> function220 = function215;
                                                    Function2<Composer, Integer, Unit> function221 = function216;
                                                    Function2<Composer, Integer, Unit> function222 = function217;
                                                    Function2<Composer, Integer, Unit> function223 = function218;
                                                    Shape shape4 = shape3;
                                                    TextFieldColors textFieldColors4 = textFieldColors3;
                                                    final boolean z27 = z21;
                                                    final boolean z28 = z20;
                                                    final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource5;
                                                    final TextFieldColors textFieldColors5 = textFieldColors3;
                                                    final Shape shape5 = shape3;
                                                    textFieldDefaults.OutlinedTextFieldDecorationBox(str2, function219, z24, z25, visualTransformation5, mutableInteractionSource6, z26, function220, function221, function222, function223, shape4, textFieldColors4, null, ComposableLambdaKt.rememberComposableLambda(1757478222, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.3.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                            invoke(composer6, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer6, int i48) {
                                                            ComposerKt.sourceInformation(composer6, "C216@11078L203:OutlinedTextField.kt#jmzs0o");
                                                            if ((i48 & 3) != 2 || !composer6.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1757478222, i48, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:216)");
                                                                }
                                                                TextFieldDefaults.INSTANCE.m2053BorderBoxnbWgWpA(z27, z28, mutableInteractionSource7, textFieldColors5, shape5, 0.0f, 0.0f, composer6, 12582912, 96);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer6.skipToGroupEnd();
                                                        }
                                                    }, composer5, 54), composer5, (i47 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 221184, 8192);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }, composer2, 54), composer4, (i42 & 64638) | (3670016 & i44) | (29360128 & i44) | (234881024 & i44) | (i44 & 1879048192), ((i43 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i43 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), 4096);
                                        composer3 = composer4;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        VisualTransformation visualTransformation5 = visualTransformation2;
                                        z12 = z10;
                                        visualTransformation3 = visualTransformation5;
                                        textFieldColors2 = textFieldColors3;
                                        z13 = z7;
                                        z14 = z23;
                                        i35 = i32;
                                        i36 = i33;
                                        modifier3 = modifier4;
                                        textStyle6 = textStyle7;
                                        function210 = function215;
                                        function211 = function27;
                                        function212 = function28;
                                        mutableInteractionSource4 = mutableInteractionSource2;
                                        shape2 = outlinedTextFieldShape;
                                        keyboardOptions3 = keyboardOptions4;
                                        keyboardActions3 = keyboardActions2;
                                        function213 = function29;
                                        z15 = z20;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        z15 = z3;
                                        visualTransformation3 = visualTransformation;
                                        z12 = z4;
                                        i35 = i;
                                        i36 = i2;
                                        mutableInteractionSource4 = mutableInteractionSource;
                                        shape2 = shape;
                                        textFieldColors2 = textFieldColors;
                                        composer3 = composerStartRestartGroup;
                                        z13 = z5;
                                        z14 = z6;
                                        textStyle6 = textStyle2;
                                        function210 = function25;
                                        function211 = function26;
                                        modifier3 = modifier2;
                                        function212 = function23;
                                        function213 = function24;
                                        keyboardOptions3 = keyboardOptions;
                                        keyboardActions3 = keyboardActions;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.4
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

                                            public final void invoke(Composer composer5, int i45) {
                                                OutlinedTextFieldKt.OutlinedTextField(str, function1, modifier3, z13, z14, textStyle6, function210, function211, function212, function213, z15, visualTransformation3, keyboardOptions3, keyboardActions3, z12, i35, i36, mutableInteractionSource4, shape2, textFieldColors2, composer5, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i26 = i24 | 24576;
                                if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                }
                                i27 = i5 & 65536;
                                if (i27 == 0) {
                                }
                                i28 = i5 & 131072;
                                if (i28 == 0) {
                                }
                                if ((i4 & 100663296) == 0) {
                                }
                                if ((i4 & 805306368) == 0) {
                                }
                                if ((i6 & 306783379) == 306783378) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i3 & 1) != 0) {
                                        if (i7 == 0) {
                                        }
                                        if (i8 == 0) {
                                        }
                                        if (i9 != 0) {
                                        }
                                        boolean z172 = z6;
                                        if ((i5 & 32) == 0) {
                                        }
                                        int i402 = i6;
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
                                        if (i23 == 0) {
                                        }
                                        if (i25 == 0) {
                                        }
                                        if ((32768 & i5) == 0) {
                                        }
                                        if (i27 == 0) {
                                        }
                                        if (i28 == 0) {
                                        }
                                        if ((262144 & i5) == 0) {
                                        }
                                        if ((i5 & 524288) == 0) {
                                        }
                                        composer2.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        if (mutableInteractionSource2 != null) {
                                        }
                                        composer2.startReplaceGroup(673724863);
                                        ComposerKt.sourceInformation(composer2, "*162@8895L18");
                                        jM5632getColor0d7_KjU = textStyle4.m5632getColor0d7_KjU();
                                        if (jM5632getColor0d7_KjU == 16) {
                                        }
                                        composer2.endReplaceGroup();
                                        TextStyle textStyleMerge2 = textStyle4.merge(new TextStyle(jM5632getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                        int i422 = i31;
                                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                        final MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                                        int i432 = i34;
                                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object objConsume22 = composer2.consume(localDensity2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        Density density2 = (Density) objConsume22;
                                        if (function25 == null) {
                                        }
                                        Modifier modifier42 = companion;
                                        final boolean z202 = z9;
                                        final boolean z212 = z7;
                                        final TextFieldColors textFieldColors32 = textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs;
                                        final Function2<? super Composer, ? super Integer, Unit> function2152 = function25;
                                        final boolean z222 = z10;
                                        final VisualTransformation visualTransformation42 = visualTransformation2;
                                        final Function2<? super Composer, ? super Integer, Unit> function2162 = function27;
                                        final Function2<? super Composer, ? super Integer, Unit> function2172 = function28;
                                        final Function2<? super Composer, ? super Integer, Unit> function2182 = function29;
                                        final Shape shape32 = outlinedTextFieldShape;
                                        int i442 = i432 << 12;
                                        TextStyle textStyle72 = textStyle5;
                                        Composer composer42 = composer2;
                                        KeyboardOptions keyboardOptions42 = keyboardOptions2;
                                        boolean z232 = z11;
                                        BasicTextFieldKt.BasicTextField(str, function1, SizeKt.m1049defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(companion.then(companionM1024paddingqDBjuR0$default), z9, Strings_androidKt.m2014getString4foXLRw(Strings.INSTANCE.m2009getDefaultErrorMessageUdPEhr4(), composer2, 6)), TextFieldDefaults.INSTANCE.m2056getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2055getMinHeightD9Ej5fM()), z7, z232, textStyleMerge2, keyboardOptions42, keyboardActions2, z10, i32, i33, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource52, new SolidColor(textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs.cursorColor(z9, composer2, (i432 & 14) | ((i432 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).getValue().m3667unboximpl(), null), ComposableLambdaKt.rememberComposableLambda(1710364390, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.3
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

                                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> function219, Composer composer5, int i45) {
                                                int i46;
                                                ComposerKt.sourceInformation(composer5, "C215@11038L261,201@10448L865:OutlinedTextField.kt#jmzs0o");
                                                if ((i45 & 6) == 0) {
                                                    i46 = i45 | (composer5.changedInstance(function219) ? 4 : 2);
                                                } else {
                                                    i46 = i45;
                                                }
                                                if ((i46 & 19) != 18 || !composer5.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1710364390, i46, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:201)");
                                                    }
                                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                    int i47 = i46;
                                                    String str2 = str;
                                                    boolean z24 = z212;
                                                    boolean z25 = z222;
                                                    VisualTransformation visualTransformation52 = visualTransformation42;
                                                    MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource52;
                                                    boolean z26 = z202;
                                                    Function2<Composer, Integer, Unit> function220 = function2152;
                                                    Function2<Composer, Integer, Unit> function221 = function2162;
                                                    Function2<Composer, Integer, Unit> function222 = function2172;
                                                    Function2<Composer, Integer, Unit> function223 = function2182;
                                                    Shape shape4 = shape32;
                                                    TextFieldColors textFieldColors4 = textFieldColors32;
                                                    final boolean z27 = z212;
                                                    final boolean z28 = z202;
                                                    final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource52;
                                                    final TextFieldColors textFieldColors5 = textFieldColors32;
                                                    final Shape shape5 = shape32;
                                                    textFieldDefaults.OutlinedTextFieldDecorationBox(str2, function219, z24, z25, visualTransformation52, mutableInteractionSource6, z26, function220, function221, function222, function223, shape4, textFieldColors4, null, ComposableLambdaKt.rememberComposableLambda(1757478222, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.3.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                            invoke(composer6, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer6, int i48) {
                                                            ComposerKt.sourceInformation(composer6, "C216@11078L203:OutlinedTextField.kt#jmzs0o");
                                                            if ((i48 & 3) != 2 || !composer6.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1757478222, i48, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:216)");
                                                                }
                                                                TextFieldDefaults.INSTANCE.m2053BorderBoxnbWgWpA(z27, z28, mutableInteractionSource7, textFieldColors5, shape5, 0.0f, 0.0f, composer6, 12582912, 96);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer6.skipToGroupEnd();
                                                        }
                                                    }, composer5, 54), composer5, (i47 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 221184, 8192);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer5.skipToGroupEnd();
                                            }
                                        }, composer2, 54), composer42, (i422 & 64638) | (3670016 & i442) | (29360128 & i442) | (234881024 & i442) | (i442 & 1879048192), ((i432 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i432 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), 4096);
                                        composer3 = composer42;
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        VisualTransformation visualTransformation52 = visualTransformation2;
                                        z12 = z10;
                                        visualTransformation3 = visualTransformation52;
                                        textFieldColors2 = textFieldColors32;
                                        z13 = z7;
                                        z14 = z232;
                                        i35 = i32;
                                        i36 = i33;
                                        modifier3 = modifier42;
                                        textStyle6 = textStyle72;
                                        function210 = function2152;
                                        function211 = function27;
                                        function212 = function28;
                                        mutableInteractionSource4 = mutableInteractionSource2;
                                        shape2 = outlinedTextFieldShape;
                                        keyboardOptions3 = keyboardOptions42;
                                        keyboardActions3 = keyboardActions2;
                                        function213 = function29;
                                        z15 = z202;
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i15 = i14;
                            i16 = i5 & 1024;
                            if (i16 != 0) {
                            }
                            i19 = i5 & 2048;
                            if (i19 != 0) {
                            }
                            int i372 = i18;
                            i21 = i5 & 4096;
                            if (i21 != 0) {
                            }
                            i23 = i5 & 8192;
                            if (i23 != 0) {
                            }
                            i25 = i5 & 16384;
                            if (i25 == 0) {
                            }
                            if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            }
                            i27 = i5 & 65536;
                            if (i27 == 0) {
                            }
                            i28 = i5 & 131072;
                            if (i28 == 0) {
                            }
                            if ((i4 & 100663296) == 0) {
                            }
                            if ((i4 & 805306368) == 0) {
                            }
                            if ((i6 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
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
                        int i3722 = i18;
                        i21 = i5 & 4096;
                        if (i21 != 0) {
                        }
                        i23 = i5 & 8192;
                        if (i23 != 0) {
                        }
                        i25 = i5 & 16384;
                        if (i25 == 0) {
                        }
                        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        }
                        i27 = i5 & 65536;
                        if (i27 == 0) {
                        }
                        i28 = i5 & 131072;
                        if (i28 == 0) {
                        }
                        if ((i4 & 100663296) == 0) {
                        }
                        if ((i4 & 805306368) == 0) {
                        }
                        if ((i6 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
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
                    int i37222 = i18;
                    i21 = i5 & 4096;
                    if (i21 != 0) {
                    }
                    i23 = i5 & 8192;
                    if (i23 != 0) {
                    }
                    i25 = i5 & 16384;
                    if (i25 == 0) {
                    }
                    if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i27 = i5 & 65536;
                    if (i27 == 0) {
                    }
                    i28 = i5 & 131072;
                    if (i28 == 0) {
                    }
                    if ((i4 & 100663296) == 0) {
                    }
                    if ((i4 & 805306368) == 0) {
                    }
                    if ((i6 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
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
                int i372222 = i18;
                i21 = i5 & 4096;
                if (i21 != 0) {
                }
                i23 = i5 & 8192;
                if (i23 != 0) {
                }
                i25 = i5 & 16384;
                if (i25 == 0) {
                }
                if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i27 = i5 & 65536;
                if (i27 == 0) {
                }
                i28 = i5 & 131072;
                if (i28 == 0) {
                }
                if ((i4 & 100663296) == 0) {
                }
                if ((i4 & 805306368) == 0) {
                }
                if ((i6 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
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
            int i3722222 = i18;
            i21 = i5 & 4096;
            if (i21 != 0) {
            }
            i23 = i5 & 8192;
            if (i23 != 0) {
            }
            i25 = i5 & 16384;
            if (i25 == 0) {
            }
            if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i27 = i5 & 65536;
            if (i27 == 0) {
            }
            i28 = i5 & 131072;
            if (i28 == 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            if ((i4 & 805306368) == 0) {
            }
            if ((i6 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
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
        int i37222222 = i18;
        i21 = i5 & 4096;
        if (i21 != 0) {
        }
        i23 = i5 & 8192;
        if (i23 != 0) {
        }
        i25 = i5 & 16384;
        if (i25 == 0) {
        }
        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i27 = i5 & 65536;
        if (i27 == 0) {
        }
        i28 = i5 & 131072;
        if (i28 == 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        if ((i6 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
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
    public static final /* synthetic */ void OutlinedTextField(final String str, final Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i2, final int i3, final int i4) {
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
        int i27;
        TextStyle textStyle3;
        MutableInteractionSource mutableInteractionSource2;
        Shape outlinedTextFieldShape;
        Composer composer2;
        TextFieldColors textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs;
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
        KeyboardActions keyboardActions2;
        boolean z10;
        int i29;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape2;
        int i30;
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
        final KeyboardActions keyboardActions3;
        final boolean z14;
        final int i31;
        final MutableInteractionSource mutableInteractionSource4;
        final Shape shape3;
        final TextFieldColors textFieldColors2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2099955827);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OutlinedTextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)240@11690L7,251@12250L39,252@12328L22,253@12400L25,255@12434L416:OutlinedTextField.kt#jmzs0o");
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
                                int i32 = i17;
                                i20 = i4 & 4096;
                                if (i20 != 0) {
                                    i21 = i32 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                                } else {
                                    int i33 = i32;
                                    if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                        i33 |= composerStartRestartGroup.changed(keyboardOptions) ? 256 : 128;
                                    }
                                    i21 = i33;
                                }
                                i22 = i4 & 8192;
                                if (i22 != 0) {
                                    i23 = i21 | 3072;
                                } else {
                                    int i34 = i21;
                                    if ((i3 & 3072) == 0) {
                                        i23 = i34 | (composerStartRestartGroup.changed(keyboardActions) ? 2048 : 1024);
                                    } else {
                                        i23 = i34;
                                    }
                                }
                                i24 = i4 & 16384;
                                if (i24 == 0) {
                                    i25 = i23;
                                    if ((i3 & 24576) == 0) {
                                        i25 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                                    }
                                    i26 = i4 & 32768;
                                    if (i26 == 0) {
                                        i25 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        i25 |= composerStartRestartGroup.changed(i) ? 131072 : 65536;
                                    }
                                    i27 = i4 & 65536;
                                    if (i27 == 0) {
                                        i25 |= 1572864;
                                    } else if ((i3 & 1572864) == 0) {
                                        i25 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                                    }
                                    if ((i3 & 12582912) == 0) {
                                        i25 |= ((i4 & 131072) == 0 && composerStartRestartGroup.changed(shape)) ? 8388608 : 4194304;
                                    }
                                    if ((i3 & 100663296) == 0) {
                                        i25 |= ((i4 & 262144) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                    }
                                    if ((i5 & 306783379) == 306783378 || (i25 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
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
                                            int i35 = i5;
                                            Function2 function214 = i9 == 0 ? null : function25;
                                            Function2 function215 = i10 == 0 ? null : function26;
                                            Function2 function216 = i12 == 0 ? null : function23;
                                            Function2 function217 = i14 == 0 ? null : function24;
                                            boolean z17 = i16 == 0 ? false : z3;
                                            VisualTransformation none = i19 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                            KeyboardOptions keyboardOptions4 = i20 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                            KeyboardActions keyboardActions4 = i22 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                            boolean z18 = i24 == 0 ? false : z4;
                                            int i36 = i26 == 0 ? Integer.MAX_VALUE : i;
                                            if (i27 == 0) {
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 673833100, "CC(remember):OutlinedTextField.kt#9igjgp");
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
                                                i25 &= -29360129;
                                                outlinedTextFieldShape = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape(composerStartRestartGroup, 6);
                                            } else {
                                                outlinedTextFieldShape = shape;
                                            }
                                            int i37 = i25;
                                            if ((262144 & i4) == 0) {
                                                composer2 = composerStartRestartGroup;
                                                modifier3 = companion;
                                                z7 = z15;
                                                textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m2059outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 0, 0, 48, 2097151);
                                                i30 = i37 & (-234881025);
                                                z8 = z16;
                                                textStyle2 = textStyle3;
                                                i28 = i35;
                                                function25 = function214;
                                                function27 = function215;
                                                function28 = function216;
                                                function29 = function217;
                                                z9 = z17;
                                                visualTransformation2 = none;
                                                keyboardOptions2 = keyboardOptions4;
                                                keyboardActions2 = keyboardActions4;
                                                z10 = z18;
                                                i29 = i36;
                                                mutableInteractionSource3 = mutableInteractionSource2;
                                                shape2 = outlinedTextFieldShape;
                                            } else {
                                                composer2 = composerStartRestartGroup;
                                                textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                                modifier3 = companion;
                                                z7 = z15;
                                                z8 = z16;
                                                textStyle2 = textStyle3;
                                                i28 = i35;
                                                function25 = function214;
                                                function27 = function215;
                                                function28 = function216;
                                                function29 = function217;
                                                z9 = z17;
                                                visualTransformation2 = none;
                                                keyboardOptions2 = keyboardOptions4;
                                                keyboardActions2 = keyboardActions4;
                                                z10 = z18;
                                                i29 = i36;
                                                mutableInteractionSource3 = mutableInteractionSource2;
                                                shape2 = outlinedTextFieldShape;
                                                i30 = i37;
                                            }
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            if ((i4 & 32) != 0) {
                                                i5 &= -458753;
                                            }
                                            if ((i4 & 131072) != 0) {
                                                i25 &= -29360129;
                                            }
                                            if ((262144 & i4) != 0) {
                                                i25 &= -234881025;
                                            }
                                            function28 = function23;
                                            visualTransformation2 = visualTransformation;
                                            keyboardOptions2 = keyboardOptions;
                                            z10 = z4;
                                            i29 = i;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            shape2 = shape;
                                            textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                            composer2 = composerStartRestartGroup;
                                            z8 = z6;
                                            i28 = i5;
                                            function27 = function26;
                                            modifier3 = modifier2;
                                            i30 = i25;
                                            function29 = function24;
                                            z9 = z3;
                                            keyboardActions2 = keyboardActions;
                                            z7 = z5;
                                        }
                                        composer2.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-2099955827, i28, i30, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:254)");
                                        }
                                        int i38 = i28 & 2147483646;
                                        int i39 = (i30 & 14) | 1572864 | (i30 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i30 & 896) | (i30 & 7168) | (57344 & i30) | (458752 & i30);
                                        int i40 = i30 << 3;
                                        OutlinedTextField(str, (Function1<? super String, Unit>) function1, modifier3, z7, z8, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function25, (Function2<? super Composer, ? super Integer, Unit>) function27, (Function2<? super Composer, ? super Integer, Unit>) function28, (Function2<? super Composer, ? super Integer, Unit>) function29, z9, visualTransformation2, keyboardOptions2, keyboardActions2, z10, i29, 1, mutableInteractionSource3, shape2, textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs, composer2, i38, i39 | (29360128 & i40) | (234881024 & i40) | (i40 & 1879048192), 0);
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
                                        keyboardActions3 = keyboardActions2;
                                        z14 = z10;
                                        i31 = i29;
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                        shape3 = shape2;
                                        textFieldColors2 = textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        z13 = z3;
                                        visualTransformation3 = visualTransformation;
                                        z14 = z4;
                                        i31 = i;
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
                                        keyboardActions3 = keyboardActions;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.6
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

                                            public final void invoke(Composer composer3, int i41) {
                                                OutlinedTextFieldKt.OutlinedTextField(str, function1, modifier4, z11, z12, textStyle4, function210, function211, function212, function213, z13, visualTransformation3, keyboardOptions3, keyboardActions3, z14, i31, mutableInteractionSource4, shape3, textFieldColors2, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i25 = i23 | 24576;
                                i26 = i4 & 32768;
                                if (i26 == 0) {
                                }
                                i27 = i4 & 65536;
                                if (i27 == 0) {
                                }
                                if ((i3 & 12582912) == 0) {
                                }
                                if ((i3 & 100663296) == 0) {
                                }
                                if ((i5 & 306783379) == 306783378) {
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
                                        int i352 = i5;
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
                                        if (i22 == 0) {
                                        }
                                        if (i24 == 0) {
                                        }
                                        if (i26 == 0) {
                                        }
                                        if (i27 == 0) {
                                        }
                                        if ((i4 & 131072) == 0) {
                                        }
                                        int i372 = i25;
                                        if ((262144 & i4) == 0) {
                                        }
                                        composer2.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        int i382 = i28 & 2147483646;
                                        int i392 = (i30 & 14) | 1572864 | (i30 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i30 & 896) | (i30 & 7168) | (57344 & i30) | (458752 & i30);
                                        int i402 = i30 << 3;
                                        OutlinedTextField(str, (Function1<? super String, Unit>) function1, modifier3, z7, z8, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function25, (Function2<? super Composer, ? super Integer, Unit>) function27, (Function2<? super Composer, ? super Integer, Unit>) function28, (Function2<? super Composer, ? super Integer, Unit>) function29, z9, visualTransformation2, keyboardOptions2, keyboardActions2, z10, i29, 1, mutableInteractionSource3, shape2, textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs, composer2, i382, i392 | (29360128 & i402) | (234881024 & i402) | (i402 & 1879048192), 0);
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
                                        keyboardActions3 = keyboardActions2;
                                        z14 = z10;
                                        i31 = i29;
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                        shape3 = shape2;
                                        textFieldColors2 = textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs;
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i14 = i13;
                            i15 = i4 & 1024;
                            if (i15 != 0) {
                            }
                            i18 = i4 & 2048;
                            if (i18 != 0) {
                            }
                            int i322 = i17;
                            i20 = i4 & 4096;
                            if (i20 != 0) {
                            }
                            i22 = i4 & 8192;
                            if (i22 != 0) {
                            }
                            i24 = i4 & 16384;
                            if (i24 == 0) {
                            }
                            i26 = i4 & 32768;
                            if (i26 == 0) {
                            }
                            i27 = i4 & 65536;
                            if (i27 == 0) {
                            }
                            if ((i3 & 12582912) == 0) {
                            }
                            if ((i3 & 100663296) == 0) {
                            }
                            if ((i5 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
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
                        int i3222 = i17;
                        i20 = i4 & 4096;
                        if (i20 != 0) {
                        }
                        i22 = i4 & 8192;
                        if (i22 != 0) {
                        }
                        i24 = i4 & 16384;
                        if (i24 == 0) {
                        }
                        i26 = i4 & 32768;
                        if (i26 == 0) {
                        }
                        i27 = i4 & 65536;
                        if (i27 == 0) {
                        }
                        if ((i3 & 12582912) == 0) {
                        }
                        if ((i3 & 100663296) == 0) {
                        }
                        if ((i5 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
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
                    int i32222 = i17;
                    i20 = i4 & 4096;
                    if (i20 != 0) {
                    }
                    i22 = i4 & 8192;
                    if (i22 != 0) {
                    }
                    i24 = i4 & 16384;
                    if (i24 == 0) {
                    }
                    i26 = i4 & 32768;
                    if (i26 == 0) {
                    }
                    i27 = i4 & 65536;
                    if (i27 == 0) {
                    }
                    if ((i3 & 12582912) == 0) {
                    }
                    if ((i3 & 100663296) == 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
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
                int i322222 = i17;
                i20 = i4 & 4096;
                if (i20 != 0) {
                }
                i22 = i4 & 8192;
                if (i22 != 0) {
                }
                i24 = i4 & 16384;
                if (i24 == 0) {
                }
                i26 = i4 & 32768;
                if (i26 == 0) {
                }
                i27 = i4 & 65536;
                if (i27 == 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                if ((i3 & 100663296) == 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
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
            int i3222222 = i17;
            i20 = i4 & 4096;
            if (i20 != 0) {
            }
            i22 = i4 & 8192;
            if (i22 != 0) {
            }
            i24 = i4 & 16384;
            if (i24 == 0) {
            }
            i26 = i4 & 32768;
            if (i26 == 0) {
            }
            i27 = i4 & 65536;
            if (i27 == 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            if ((i3 & 100663296) == 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
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
        int i32222222 = i17;
        i20 = i4 & 4096;
        if (i20 != 0) {
        }
        i22 = i4 & 8192;
        if (i22 != 0) {
        }
        i24 = i4 & 16384;
        if (i24 == 0) {
        }
        i26 = i4 & 32768;
        if (i26 == 0) {
        }
        i27 = i4 & 65536;
        if (i27 == 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        if ((i3 & 100663296) == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
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
    /* JADX WARN: Removed duplicated region for block: B:304:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:331:? A[RETURN, SYNTHETIC] */
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
    public static final void OutlinedTextField(final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i3, final int i4, final int i5) {
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
        Modifier.Companion companion;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Function2<? super Composer, ? super Integer, Unit> function210;
        int i27;
        KeyboardActions keyboardActions2;
        int i28;
        MutableInteractionSource mutableInteractionSource2;
        Shape outlinedTextFieldShape;
        Composer composer2;
        TextFieldColors textFieldColors2;
        KeyboardActions keyboardActions3;
        boolean z7;
        boolean z8;
        TextStyle textStyle3;
        int i29;
        boolean z9;
        VisualTransformation visualTransformation2;
        KeyboardOptions keyboardOptions2;
        boolean z10;
        int i30;
        int i31;
        int i32;
        boolean z11;
        MutableInteractionSource mutableInteractionSource3;
        long jM5632getColor0d7_KjU;
        int i33;
        Modifier.Companion companionM1024paddingqDBjuR0$default;
        Composer composer3;
        final boolean z12;
        final VisualTransformation visualTransformation3;
        final TextStyle textStyle4;
        final TextFieldColors textFieldColors3;
        final boolean z13;
        final boolean z14;
        final int i34;
        final int i35;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final MutableInteractionSource mutableInteractionSource4;
        final Shape shape2;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions4;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final boolean z15;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(237745923);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OutlinedTextField)P(18,11,10,1,13,16,6,12,7,17,3,19,5,4,15,8,9,2,14)351@17754L7,364@18398L22,365@18470L25,375@18903L7,392@19562L38,401@19929L20,409@20271L930,378@18959L2248:OutlinedTextField.kt#jmzs0o");
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
                                int i36 = i18;
                                i21 = i5 & 4096;
                                if (i21 != 0) {
                                    i22 = i36 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                                } else {
                                    i22 = i36;
                                    if ((i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                        i22 |= composerStartRestartGroup.changed(keyboardOptions) ? 256 : 128;
                                    }
                                    if ((i4 & 3072) == 0) {
                                        i22 |= ((i5 & 8192) == 0 && composerStartRestartGroup.changed(keyboardActions)) ? 2048 : 1024;
                                    }
                                    int i37 = i22;
                                    i23 = i5 & 16384;
                                    if (i23 != 0) {
                                        i24 = i37;
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
                                        int i38 = i24;
                                        if ((i6 & 306783379) != 306783378 || (306783379 & i38) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                                            composerStartRestartGroup.startDefaults();
                                            if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                                companion = i7 == 0 ? Modifier.INSTANCE : modifier2;
                                                boolean z16 = i8 == 0 ? true : z;
                                                boolean z17 = i9 == 0 ? false : z2;
                                                if ((i5 & 32) != 0) {
                                                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                    Object objConsume = composerStartRestartGroup.consume(localTextStyle);
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    textStyle2 = (TextStyle) objConsume;
                                                    i6 &= -458753;
                                                }
                                                int i39 = i6;
                                                TextStyle textStyle5 = textStyle2;
                                                function27 = i10 == 0 ? null : function25;
                                                function28 = i11 == 0 ? null : function26;
                                                function29 = i13 == 0 ? null : function23;
                                                function210 = i15 == 0 ? null : function24;
                                                boolean z18 = i17 == 0 ? false : z3;
                                                VisualTransformation none = i20 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                                KeyboardOptions keyboardOptions4 = i21 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                                if ((i5 & 8192) == 0) {
                                                    i27 = i38 & (-7169);
                                                    keyboardActions2 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                                } else {
                                                    i27 = i38;
                                                    keyboardActions2 = keyboardActions;
                                                }
                                                boolean z19 = i23 == 0 ? false : z4;
                                                if ((32768 & i5) == 0) {
                                                    i27 &= -458753;
                                                    i28 = z19 ? 1 : Integer.MAX_VALUE;
                                                } else {
                                                    i28 = i;
                                                }
                                                int i40 = i25 == 0 ? 1 : i2;
                                                mutableInteractionSource2 = i26 == 0 ? null : mutableInteractionSource;
                                                if ((262144 & i5) == 0) {
                                                    i27 &= -234881025;
                                                    outlinedTextFieldShape = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape(composerStartRestartGroup, 6);
                                                } else {
                                                    outlinedTextFieldShape = shape;
                                                }
                                                int i41 = i27;
                                                if ((i5 & 524288) == 0) {
                                                    TextFieldColors textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m2059outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 48, 2097151);
                                                    composer2 = composerStartRestartGroup;
                                                    keyboardActions3 = keyboardActions2;
                                                    i32 = i41 & (-1879048193);
                                                    z7 = z16;
                                                    z8 = z17;
                                                    textStyle3 = textStyle5;
                                                    i29 = i39;
                                                    visualTransformation2 = none;
                                                    keyboardOptions2 = keyboardOptions4;
                                                    z10 = z19;
                                                    i30 = i28;
                                                    i31 = i40;
                                                    textFieldColors2 = textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs;
                                                    z9 = z18;
                                                } else {
                                                    composer2 = composerStartRestartGroup;
                                                    textFieldColors2 = textFieldColors;
                                                    keyboardActions3 = keyboardActions2;
                                                    z7 = z16;
                                                    z8 = z17;
                                                    textStyle3 = textStyle5;
                                                    i29 = i39;
                                                    z9 = z18;
                                                    visualTransformation2 = none;
                                                    keyboardOptions2 = keyboardOptions4;
                                                    z10 = z19;
                                                    i30 = i28;
                                                    i31 = i40;
                                                    i32 = i41;
                                                }
                                            } else {
                                                composerStartRestartGroup.skipToGroupEnd();
                                                if ((i5 & 32) != 0) {
                                                    i6 &= -458753;
                                                }
                                                if ((i5 & 8192) != 0) {
                                                    i38 &= -7169;
                                                }
                                                if ((32768 & i5) != 0) {
                                                    i38 &= -458753;
                                                }
                                                if ((262144 & i5) != 0) {
                                                    i38 &= -234881025;
                                                }
                                                if ((i5 & 524288) != 0) {
                                                    i38 &= -1879048193;
                                                }
                                                TextStyle textStyle6 = textStyle2;
                                                i32 = i38;
                                                textStyle3 = textStyle6;
                                                z8 = z2;
                                                function29 = function23;
                                                function210 = function24;
                                                z9 = z3;
                                                visualTransformation2 = visualTransformation;
                                                keyboardActions3 = keyboardActions;
                                                z10 = z4;
                                                mutableInteractionSource2 = mutableInteractionSource;
                                                outlinedTextFieldShape = shape;
                                                textFieldColors2 = textFieldColors;
                                                composer2 = composerStartRestartGroup;
                                                i29 = i6;
                                                function27 = function25;
                                                function28 = function26;
                                                companion = modifier2;
                                                z7 = z;
                                                keyboardOptions2 = keyboardOptions;
                                                i30 = i;
                                                i31 = i2;
                                            }
                                            composer2.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                                z11 = z8;
                                            } else {
                                                z11 = z8;
                                                ComposerKt.traceEventStart(237745923, i29, i32, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:366)");
                                            }
                                            if (mutableInteractionSource2 != null) {
                                                composer2.startReplaceGroup(-579730026);
                                                ComposerKt.sourceInformation(composer2, "368@18581L39");
                                                ComposerKt.sourceInformationMarkerStart(composer2, 674035692, "CC(remember):OutlinedTextField.kt#9igjgp");
                                                Object objRememberedValue = composer2.rememberedValue();
                                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                    composer2.updateRememberedValue(objRememberedValue);
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                composer2.endReplaceGroup();
                                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                            } else {
                                                composer2.startReplaceGroup(674035041);
                                                composer2.endReplaceGroup();
                                                mutableInteractionSource3 = mutableInteractionSource2;
                                            }
                                            composer2.startReplaceGroup(674040799);
                                            ComposerKt.sourceInformation(composer2, "*371@18768L18");
                                            jM5632getColor0d7_KjU = textStyle3.m5632getColor0d7_KjU();
                                            if (jM5632getColor0d7_KjU == 16) {
                                                jM5632getColor0d7_KjU = textFieldColors2.textColor(z7, composer2, ((i29 >> 9) & 14) | ((i32 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).getValue().m3667unboximpl();
                                            }
                                            composer2.endReplaceGroup();
                                            TextStyle textStyleMerge = textStyle3.merge(new TextStyle(jM5632getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                            TextStyle textStyle7 = textStyle3;
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume2 = composer2.consume(localDensity);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            Density density = (Density) objConsume2;
                                            if (function27 == null) {
                                                i33 = i29;
                                                companionM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(SemanticsModifierKt.semantics(Modifier.INSTANCE, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.7
                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                        invoke2(semanticsPropertyReceiver);
                                                        return Unit.INSTANCE;
                                                    }
                                                }), 0.0f, density.mo707toDpGaN1DYA(OutlinedTextFieldTopPadding), 0.0f, 0.0f, 13, null);
                                            } else {
                                                i33 = i29;
                                                companionM1024paddingqDBjuR0$default = Modifier.INSTANCE;
                                            }
                                            Modifier modifier4 = companion;
                                            final boolean z20 = z9;
                                            final TextFieldColors textFieldColors4 = textFieldColors2;
                                            final boolean z21 = z7;
                                            final boolean z22 = z10;
                                            final VisualTransformation visualTransformation4 = visualTransformation2;
                                            final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                                            final Function2<? super Composer, ? super Integer, Unit> function215 = function27;
                                            final Function2<? super Composer, ? super Integer, Unit> function216 = function28;
                                            final Function2<? super Composer, ? super Integer, Unit> function217 = function29;
                                            final Function2<? super Composer, ? super Integer, Unit> function218 = function210;
                                            final Shape shape3 = outlinedTextFieldShape;
                                            int i42 = i32 << 12;
                                            boolean z23 = z11;
                                            Composer composer4 = composer2;
                                            BasicTextFieldKt.BasicTextField(textFieldValue, function1, SizeKt.m1049defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(companion.then(companionM1024paddingqDBjuR0$default), z9, Strings_androidKt.m2014getString4foXLRw(Strings.INSTANCE.m2009getDefaultErrorMessageUdPEhr4(), composer2, 6)), TextFieldDefaults.INSTANCE.m2056getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2055getMinHeightD9Ej5fM()), z7, z23, textStyleMerge, keyboardOptions2, keyboardActions3, z10, i30, i31, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource3, new SolidColor(textFieldColors2.cursorColor(z9, composer2, (i32 & 14) | ((i32 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).getValue().m3667unboximpl(), null), ComposableLambdaKt.rememberComposableLambda(-1001528775, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.9
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

                                                public final void invoke(Function2<? super Composer, ? super Integer, Unit> function219, Composer composer5, int i43) {
                                                    int i44;
                                                    ComposerKt.sourceInformation(composer5, "C424@20916L261,410@20321L870:OutlinedTextField.kt#jmzs0o");
                                                    if ((i43 & 6) == 0) {
                                                        i44 = i43 | (composer5.changedInstance(function219) ? 4 : 2);
                                                    } else {
                                                        i44 = i43;
                                                    }
                                                    if ((i44 & 19) != 18 || !composer5.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1001528775, i44, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:410)");
                                                        }
                                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                        String text = textFieldValue.getText();
                                                        boolean z24 = z21;
                                                        int i45 = i44;
                                                        boolean z25 = z22;
                                                        VisualTransformation visualTransformation5 = visualTransformation4;
                                                        MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource5;
                                                        boolean z26 = z20;
                                                        Function2<Composer, Integer, Unit> function220 = function215;
                                                        Function2<Composer, Integer, Unit> function221 = function216;
                                                        Function2<Composer, Integer, Unit> function222 = function217;
                                                        Function2<Composer, Integer, Unit> function223 = function218;
                                                        Shape shape4 = shape3;
                                                        TextFieldColors textFieldColors5 = textFieldColors4;
                                                        final boolean z27 = z21;
                                                        final boolean z28 = z20;
                                                        final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource5;
                                                        final TextFieldColors textFieldColors6 = textFieldColors4;
                                                        final Shape shape5 = shape3;
                                                        textFieldDefaults.OutlinedTextFieldDecorationBox(text, function219, z24, z25, visualTransformation5, mutableInteractionSource6, z26, function220, function221, function222, function223, shape4, textFieldColors5, null, ComposableLambdaKt.rememberComposableLambda(-794566495, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.9.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                                invoke(composer6, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Composer composer6, int i46) {
                                                                ComposerKt.sourceInformation(composer6, "C425@20956L203:OutlinedTextField.kt#jmzs0o");
                                                                if ((i46 & 3) != 2 || !composer6.getSkipping()) {
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(-794566495, i46, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:425)");
                                                                    }
                                                                    TextFieldDefaults.INSTANCE.m2053BorderBoxnbWgWpA(z27, z28, mutableInteractionSource7, textFieldColors6, shape5, 0.0f, 0.0f, composer6, 12582912, 96);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                composer6.skipToGroupEnd();
                                                            }
                                                        }, composer5, 54), composer5, (i45 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 221184, 8192);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }, composer2, 54), composer4, (i33 & 64638) | (3670016 & i42) | (29360128 & i42) | (234881024 & i42) | (i42 & 1879048192), ((i32 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i32 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), 4096);
                                            composer3 = composer4;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            VisualTransformation visualTransformation5 = visualTransformation2;
                                            z12 = z10;
                                            visualTransformation3 = visualTransformation5;
                                            textStyle4 = textStyle7;
                                            textFieldColors3 = textFieldColors4;
                                            z13 = z7;
                                            z14 = z23;
                                            i34 = i30;
                                            i35 = i31;
                                            modifier3 = modifier4;
                                            function211 = function27;
                                            function212 = function28;
                                            function213 = function29;
                                            mutableInteractionSource4 = mutableInteractionSource2;
                                            shape2 = outlinedTextFieldShape;
                                            keyboardOptions3 = keyboardOptions2;
                                            keyboardActions4 = keyboardActions3;
                                            function214 = function210;
                                            z15 = z20;
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            z15 = z3;
                                            visualTransformation3 = visualTransformation;
                                            z12 = z4;
                                            i34 = i;
                                            i35 = i2;
                                            mutableInteractionSource4 = mutableInteractionSource;
                                            shape2 = shape;
                                            textFieldColors3 = textFieldColors;
                                            composer3 = composerStartRestartGroup;
                                            z13 = z5;
                                            z14 = z6;
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
                                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.10
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

                                                public final void invoke(Composer composer5, int i43) {
                                                    OutlinedTextFieldKt.OutlinedTextField(textFieldValue, function1, modifier3, z13, z14, textStyle4, function211, function212, function213, function214, z15, visualTransformation3, keyboardOptions3, keyboardActions4, z12, i34, i35, mutableInteractionSource4, shape2, textFieldColors3, composer5, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i24 = i37 | 24576;
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
                                    int i382 = i24;
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
                                            int i392 = i6;
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
                                            int i412 = i27;
                                            if ((i5 & 524288) == 0) {
                                            }
                                            composer2.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            if (mutableInteractionSource2 != null) {
                                            }
                                            composer2.startReplaceGroup(674040799);
                                            ComposerKt.sourceInformation(composer2, "*371@18768L18");
                                            jM5632getColor0d7_KjU = textStyle3.m5632getColor0d7_KjU();
                                            if (jM5632getColor0d7_KjU == 16) {
                                            }
                                            composer2.endReplaceGroup();
                                            TextStyle textStyleMerge2 = textStyle3.merge(new TextStyle(jM5632getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                            TextStyle textStyle72 = textStyle3;
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume22 = composer2.consume(localDensity2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            Density density2 = (Density) objConsume22;
                                            if (function27 == null) {
                                            }
                                            Modifier modifier42 = companion;
                                            final boolean z202 = z9;
                                            final TextFieldColors textFieldColors42 = textFieldColors2;
                                            final boolean z212 = z7;
                                            final boolean z222 = z10;
                                            final VisualTransformation visualTransformation42 = visualTransformation2;
                                            final MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                                            final Function2<? super Composer, ? super Integer, Unit> function2152 = function27;
                                            final Function2<? super Composer, ? super Integer, Unit> function2162 = function28;
                                            final Function2<? super Composer, ? super Integer, Unit> function2172 = function29;
                                            final Function2<? super Composer, ? super Integer, Unit> function2182 = function210;
                                            final Shape shape32 = outlinedTextFieldShape;
                                            int i422 = i32 << 12;
                                            boolean z232 = z11;
                                            Composer composer42 = composer2;
                                            BasicTextFieldKt.BasicTextField(textFieldValue, function1, SizeKt.m1049defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(companion.then(companionM1024paddingqDBjuR0$default), z9, Strings_androidKt.m2014getString4foXLRw(Strings.INSTANCE.m2009getDefaultErrorMessageUdPEhr4(), composer2, 6)), TextFieldDefaults.INSTANCE.m2056getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2055getMinHeightD9Ej5fM()), z7, z232, textStyleMerge2, keyboardOptions2, keyboardActions3, z10, i30, i31, visualTransformation2, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource3, new SolidColor(textFieldColors2.cursorColor(z9, composer2, (i32 & 14) | ((i32 >> 24) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS)).getValue().m3667unboximpl(), null), ComposableLambdaKt.rememberComposableLambda(-1001528775, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.9
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

                                                public final void invoke(Function2<? super Composer, ? super Integer, Unit> function219, Composer composer5, int i43) {
                                                    int i44;
                                                    ComposerKt.sourceInformation(composer5, "C424@20916L261,410@20321L870:OutlinedTextField.kt#jmzs0o");
                                                    if ((i43 & 6) == 0) {
                                                        i44 = i43 | (composer5.changedInstance(function219) ? 4 : 2);
                                                    } else {
                                                        i44 = i43;
                                                    }
                                                    if ((i44 & 19) != 18 || !composer5.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1001528775, i44, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:410)");
                                                        }
                                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                        String text = textFieldValue.getText();
                                                        boolean z24 = z212;
                                                        int i45 = i44;
                                                        boolean z25 = z222;
                                                        VisualTransformation visualTransformation52 = visualTransformation42;
                                                        MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource52;
                                                        boolean z26 = z202;
                                                        Function2<Composer, Integer, Unit> function220 = function2152;
                                                        Function2<Composer, Integer, Unit> function221 = function2162;
                                                        Function2<Composer, Integer, Unit> function222 = function2172;
                                                        Function2<Composer, Integer, Unit> function223 = function2182;
                                                        Shape shape4 = shape32;
                                                        TextFieldColors textFieldColors5 = textFieldColors42;
                                                        final boolean z27 = z212;
                                                        final boolean z28 = z202;
                                                        final MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource52;
                                                        final TextFieldColors textFieldColors6 = textFieldColors42;
                                                        final Shape shape5 = shape32;
                                                        textFieldDefaults.OutlinedTextFieldDecorationBox(text, function219, z24, z25, visualTransformation52, mutableInteractionSource6, z26, function220, function221, function222, function223, shape4, textFieldColors5, null, ComposableLambdaKt.rememberComposableLambda(-794566495, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.9.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                                invoke(composer6, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Composer composer6, int i46) {
                                                                ComposerKt.sourceInformation(composer6, "C425@20956L203:OutlinedTextField.kt#jmzs0o");
                                                                if ((i46 & 3) != 2 || !composer6.getSkipping()) {
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(-794566495, i46, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:425)");
                                                                    }
                                                                    TextFieldDefaults.INSTANCE.m2053BorderBoxnbWgWpA(z27, z28, mutableInteractionSource7, textFieldColors6, shape5, 0.0f, 0.0f, composer6, 12582912, 96);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                composer6.skipToGroupEnd();
                                                            }
                                                        }, composer5, 54), composer5, (i45 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 221184, 8192);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer5.skipToGroupEnd();
                                                }
                                            }, composer2, 54), composer42, (i33 & 64638) | (3670016 & i422) | (29360128 & i422) | (234881024 & i422) | (i422 & 1879048192), ((i32 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i32 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), 4096);
                                            composer3 = composer42;
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            VisualTransformation visualTransformation52 = visualTransformation2;
                                            z12 = z10;
                                            visualTransformation3 = visualTransformation52;
                                            textStyle4 = textStyle72;
                                            textFieldColors3 = textFieldColors42;
                                            z13 = z7;
                                            z14 = z232;
                                            i34 = i30;
                                            i35 = i31;
                                            modifier3 = modifier42;
                                            function211 = function27;
                                            function212 = function28;
                                            function213 = function29;
                                            mutableInteractionSource4 = mutableInteractionSource2;
                                            shape2 = outlinedTextFieldShape;
                                            keyboardOptions3 = keyboardOptions2;
                                            keyboardActions4 = keyboardActions3;
                                            function214 = function210;
                                            z15 = z202;
                                        }
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup != null) {
                                    }
                                }
                                if ((i4 & 3072) == 0) {
                                }
                                int i372 = i22;
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
                                int i3822 = i24;
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
                            int i362 = i18;
                            i21 = i5 & 4096;
                            if (i21 != 0) {
                            }
                            if ((i4 & 3072) == 0) {
                            }
                            int i3722 = i22;
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
                            int i38222 = i24;
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
                        int i3622 = i18;
                        i21 = i5 & 4096;
                        if (i21 != 0) {
                        }
                        if ((i4 & 3072) == 0) {
                        }
                        int i37222 = i22;
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
                        int i382222 = i24;
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
                    int i36222 = i18;
                    i21 = i5 & 4096;
                    if (i21 != 0) {
                    }
                    if ((i4 & 3072) == 0) {
                    }
                    int i372222 = i22;
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
                    int i3822222 = i24;
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
                int i362222 = i18;
                i21 = i5 & 4096;
                if (i21 != 0) {
                }
                if ((i4 & 3072) == 0) {
                }
                int i3722222 = i22;
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
                int i38222222 = i24;
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
            int i3622222 = i18;
            i21 = i5 & 4096;
            if (i21 != 0) {
            }
            if ((i4 & 3072) == 0) {
            }
            int i37222222 = i22;
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
            int i382222222 = i24;
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
        int i36222222 = i18;
        i21 = i5 & 4096;
        if (i21 != 0) {
        }
        if ((i4 & 3072) == 0) {
        }
        int i372222222 = i22;
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
        int i3822222222 = i24;
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
    public static final /* synthetic */ void OutlinedTextField(final TextFieldValue textFieldValue, final Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i2, final int i3, final int i4) {
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
        Shape outlinedTextFieldShape;
        Composer composer2;
        TextFieldColors textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs;
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
        Composer composerStartRestartGroup = composer.startRestartGroup(-288998816);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OutlinedTextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)449@21584L7,460@22138L39,461@22216L22,462@22288L25,464@22322L416:OutlinedTextField.kt#jmzs0o");
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
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 674149516, "CC(remember):OutlinedTextField.kt#9igjgp");
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
                                                    outlinedTextFieldShape = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape(composerStartRestartGroup, 6);
                                                } else {
                                                    outlinedTextFieldShape = shape;
                                                }
                                                int i35 = i27;
                                                if ((262144 & i4) == 0) {
                                                    composer2 = composerStartRestartGroup;
                                                    keyboardActions3 = keyboardActions2;
                                                    modifier3 = companion;
                                                    textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m2059outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 0, 0, 48, 2097151);
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
                                                    shape2 = outlinedTextFieldShape;
                                                } else {
                                                    composer2 = composerStartRestartGroup;
                                                    textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs = textFieldColors;
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
                                                    shape2 = outlinedTextFieldShape;
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
                                                textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs = textFieldColors;
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
                                                ComposerKt.traceEventStart(-288998816, i28, i26, "androidx.compose.material.OutlinedTextField (OutlinedTextField.kt:463)");
                                            }
                                            int i36 = i28 & 2147483646;
                                            int i37 = (i26 & 14) | 1572864 | (i26 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (458752 & i26);
                                            int i38 = i26 << 3;
                                            OutlinedTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifier3, z7, z8, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function25, (Function2<? super Composer, ? super Integer, Unit>) function27, (Function2<? super Composer, ? super Integer, Unit>) function28, (Function2<? super Composer, ? super Integer, Unit>) function29, z9, visualTransformation2, keyboardOptions2, keyboardActions3, z10, i29, 1, mutableInteractionSource3, shape2, textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs, composer2, i36, i37 | (29360128 & i38) | (234881024 & i38) | (i38 & 1879048192), 0);
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
                                            textFieldColors2 = textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs;
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
                                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField.12
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
                                                    OutlinedTextFieldKt.OutlinedTextField(textFieldValue, function1, modifier4, z11, z12, textStyle4, function210, function211, function212, function213, z13, visualTransformation3, keyboardOptions3, keyboardActions4, z14, i30, mutableInteractionSource4, shape3, textFieldColors2, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
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
                                            OutlinedTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) function1, modifier3, z7, z8, textStyle2, (Function2<? super Composer, ? super Integer, Unit>) function25, (Function2<? super Composer, ? super Integer, Unit>) function27, (Function2<? super Composer, ? super Integer, Unit>) function28, (Function2<? super Composer, ? super Integer, Unit>) function29, z9, visualTransformation2, keyboardOptions2, keyboardActions3, z10, i29, 1, mutableInteractionSource3, shape2, textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs, composer2, i362, i372 | (29360128 & i382) | (234881024 & i382) | (i382 & 1879048192), 0);
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
                                            textFieldColors2 = textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs;
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

    public static final void OutlinedTextFieldLayout(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final boolean z, final float f, final Function1<? super Size, Unit> function1, final Function2<? super Composer, ? super Integer, Unit> function25, final PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        final Function2<? super Composer, ? super Integer, Unit> function26 = function22;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2049536174);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OutlinedTextFieldLayout)P(4,9,7,2,3,10,8!1,5)508@23459L239,516@23746L7,517@23758L2308:OutlinedTextField.kt#jmzs0o");
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function26) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function24) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function25) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changed(paddingValues) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i3 & 306783379) != 306783378 || (i4 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2049536174, i3, i4, "androidx.compose.material.OutlinedTextFieldLayout (OutlinedTextField.kt:507)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1860606082, "CC(remember):OutlinedTextField.kt#9igjgp");
            boolean z2 = ((3670016 & i3) == 1048576) | ((234881024 & i3) == 67108864) | ((29360128 & i3) == 8388608) | ((i4 & 14) == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OutlinedTextFieldMeasurePolicy(function1, z, f, paddingValues);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) objRememberedValue;
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
            int i6 = i3;
            Updater.m3157setimpl(composerM3150constructorimpl, outlinedTextFieldMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -988650720, "C525@24262L8,564@25710L182:OutlinedTextField.kt#jmzs0o");
            function25.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 27) & 14));
            if (function23 != null) {
                composerStartRestartGroup.startReplaceGroup(-988654503);
                ComposerKt.sourceInformation(composerStartRestartGroup, "528@24323L219");
                Modifier modifierThen = LayoutIdKt.layoutId(Modifier.INSTANCE, "Leading").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1888671661, "C532@24515L9:OutlinedTextField.kt#jmzs0o");
                function23.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 12) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-988413292);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (function24 != null) {
                composerStartRestartGroup.startReplaceGroup(-988370729);
                ComposerKt.sourceInformation(composerStartRestartGroup, "536@24609L221");
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1888956396, "C540@24802L10:OutlinedTextField.kt#jmzs0o");
                function24.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 15) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-988127596);
                composerStartRestartGroup.endReplaceGroup();
            }
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
            if (function3 != null) {
                composerStartRestartGroup.startReplaceGroup(-987369863);
                ComposerKt.sourceInformation(composerStartRestartGroup, "561@25623L59");
                function3.invoke(LayoutIdKt.layoutId(Modifier.INSTANCE, "Hint").then(modifierM1024paddingqDBjuR0$default), composerStartRestartGroup, Integer.valueOf((i6 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS));
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-987282412);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierThen3 = LayoutIdKt.layoutId(Modifier.INSTANCE, "TextField").then(modifierM1024paddingqDBjuR0$default);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1890012907, "C568@25867L11:OutlinedTextField.kt#jmzs0o");
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 3) & 14));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (function22 != null) {
                composerStartRestartGroup.startReplaceGroup(-987052578);
                ComposerKt.sourceInformation(composerStartRestartGroup, "572@25943L54");
                Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, "Label");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1890132815, "C572@25988L7:OutlinedTextField.kt#jmzs0o");
                function26 = function22;
                function26.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 9) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                function26 = function22;
                composerStartRestartGroup.startReplaceGroup(-986969932);
                composerStartRestartGroup.endReplaceGroup();
            }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextFieldLayout.2
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
                    OutlinedTextFieldKt.OutlinedTextFieldLayout(modifier, function2, function3, function26, function23, function24, z, f, function1, function25, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-O3s9Psw, reason: not valid java name */
    public static final int m1954calculateWidthO3s9Psw(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, PaddingValues paddingValues) {
        return Math.max(i + Math.max(i3, Math.max(MathHelpersKt.lerp(i4, 0, f), i5)) + i2, Math.max(MathKt.roundToInt((i4 + (Dp.m6117constructorimpl(paddingValues.mo971calculateLeftPaddingu2uoSUM(LayoutDirection.Ltr) + paddingValues.mo972calculateRightPaddingu2uoSUM(LayoutDirection.Ltr)) * f2)) * f), Constraints.m6072getMinWidthimpl(j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m1953calculateHeightO3s9Psw(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, PaddingValues paddingValues) {
        int iMax = Math.max(i3, Math.max(i5, MathHelpersKt.lerp(i4, 0, f)));
        float top = paddingValues.getTop() * f2;
        return Math.max(Constraints.m6071getMinHeightimpl(j), Math.max(i, Math.max(i2, MathKt.roundToInt(MathHelpersKt.lerp(top, Math.max(top, i4 / 2.0f), f) + iMax + (paddingValues.getBottom() * f2)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, float f, boolean z, float f2, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        int iRoundToInt = MathKt.roundToInt(paddingValues.getTop() * f2);
        int iRoundToInt2 = MathKt.roundToInt(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f2);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f2;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2 - placeable2.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, MathKt.roundToInt(placeable == null ? 0.0f : (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding) * (1 - f)) + iRoundToInt2, MathHelpersKt.lerp(z ? Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), i) : iRoundToInt, -(placeable4.getHeight() / 2), f), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), Math.max(z ? Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), i) : iRoundToInt, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        if (placeable5 != null) {
            if (z) {
                iRoundToInt = Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), i);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable), Math.max(iRoundToInt, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        }
        Placeable.PlacementScope.m5057place70tqf50$default(placementScope, placeable6, IntOffset.INSTANCE.m6255getZeronOccac(), 0.0f, 2, null);
    }

    /* renamed from: outlineCutout-12SF9DM, reason: not valid java name */
    public static final Modifier m1955outlineCutout12SF9DM(Modifier modifier, final long j, final PaddingValues paddingValues) {
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$outlineCutout$1

            /* compiled from: OutlinedTextField.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    try {
                        iArr[LayoutDirection.Rtl.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
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
            public final void invoke2(ContentDrawScope contentDrawScope) {
                float fCoerceAtLeast;
                float fM3485getWidthimpl = Size.m3485getWidthimpl(j);
                if (fM3485getWidthimpl > 0.0f) {
                    float f = contentDrawScope.mo712toPx0680j_4(OutlinedTextFieldKt.OutlinedTextFieldInnerPadding);
                    float f2 = contentDrawScope.mo712toPx0680j_4(paddingValues.mo971calculateLeftPaddingu2uoSUM(contentDrawScope.getLayoutDirection())) - f;
                    float f3 = 2;
                    float fM3485getWidthimpl2 = fM3485getWidthimpl + f2 + (f * f3);
                    if (WhenMappings.$EnumSwitchMapping$0[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                        fCoerceAtLeast = Size.m3485getWidthimpl(contentDrawScope.mo4213getSizeNHjbRc()) - fM3485getWidthimpl2;
                    } else {
                        fCoerceAtLeast = RangesKt.coerceAtLeast(f2, 0.0f);
                    }
                    float f4 = fCoerceAtLeast;
                    if (WhenMappings.$EnumSwitchMapping$0[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                        fM3485getWidthimpl2 = Size.m3485getWidthimpl(contentDrawScope.mo4213getSizeNHjbRc()) - RangesKt.coerceAtLeast(f2, 0.0f);
                    }
                    float f5 = fM3485getWidthimpl2;
                    float fM3482getHeightimpl = Size.m3482getHeightimpl(j);
                    float f6 = (-fM3482getHeightimpl) / f3;
                    float f7 = fM3482getHeightimpl / f3;
                    int iM3645getDifferencertfAjoo = ClipOp.INSTANCE.m3645getDifferencertfAjoo();
                    DrawContext drawContext = contentDrawScope.getDrawContext();
                    long jMo4134getSizeNHjbRc = drawContext.mo4134getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    try {
                        drawContext.getTransform().mo4137clipRectN_I0leg(f4, f6, f5, f7, iM3645getDifferencertfAjoo);
                        contentDrawScope.drawContent();
                        return;
                    } finally {
                        drawContext.getCanvas().restore();
                        drawContext.mo4135setSizeuvyYCjk(jMo4134getSizeNHjbRc);
                    }
                }
                contentDrawScope.drawContent();
            }
        });
    }

    public static final long getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }
}
