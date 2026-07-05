package androidx.compose.material;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactcommunity.rndatetimepicker.Common;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: TextFieldDefaults.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JP\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%J×\u0001\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00103\u001a\u0002042\u0013\b\u0002\u00105\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+H\u0007¢\u0006\u0002\u00106Já\u0001\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\b\b\u0002\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00103\u001a\u0002042\u0013\b\u0002\u00105\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+H\u0007¢\u0006\u0002\u00107JÂ\u0001\u00108\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00103\u001a\u000204H\u0007¢\u0006\u0002\u00109JÌ\u0001\u00108\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\b\b\u0002\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00103\u001a\u000204H\u0007¢\u0006\u0002\u0010:Jä\u0001\u0010;\u001a\u00020 2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=2\b\b\u0002\u0010A\u001a\u00020=2\b\b\u0002\u0010B\u001a\u00020=2\b\b\u0002\u0010C\u001a\u00020=2\b\b\u0002\u0010D\u001a\u00020=2\b\b\u0002\u0010E\u001a\u00020=2\b\b\u0002\u0010F\u001a\u00020=2\b\b\u0002\u0010G\u001a\u00020=2\b\b\u0002\u0010H\u001a\u00020=2\b\b\u0002\u0010I\u001a\u00020=2\b\b\u0002\u0010J\u001a\u00020=2\b\b\u0002\u0010K\u001a\u00020=2\b\b\u0002\u0010L\u001a\u00020=2\b\b\u0002\u0010M\u001a\u00020=2\b\b\u0002\u0010N\u001a\u00020=2\b\b\u0002\u0010O\u001a\u00020=2\b\b\u0002\u0010P\u001a\u00020=2\b\b\u0002\u0010Q\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ:\u0010T\u001a\u0002042\b\b\u0002\u0010U\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\u00062\b\b\u0002\u0010W\u001a\u00020\u00062\b\b\u0002\u0010X\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJä\u0001\u0010[\u001a\u00020 2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=2\b\b\u0002\u0010A\u001a\u00020=2\b\b\u0002\u0010\\\u001a\u00020=2\b\b\u0002\u0010]\u001a\u00020=2\b\b\u0002\u0010^\u001a\u00020=2\b\b\u0002\u0010_\u001a\u00020=2\b\b\u0002\u0010F\u001a\u00020=2\b\b\u0002\u0010G\u001a\u00020=2\b\b\u0002\u0010H\u001a\u00020=2\b\b\u0002\u0010I\u001a\u00020=2\b\b\u0002\u0010J\u001a\u00020=2\b\b\u0002\u0010K\u001a\u00020=2\b\b\u0002\u0010L\u001a\u00020=2\b\b\u0002\u0010M\u001a\u00020=2\b\b\u0002\u0010N\u001a\u00020=2\b\b\u0002\u0010O\u001a\u00020=2\b\b\u0002\u0010P\u001a\u00020=2\b\b\u0002\u0010Q\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\b`\u0010SJ:\u0010a\u001a\u0002042\b\b\u0002\u0010U\u001a\u00020\u00062\b\b\u0002\u0010W\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\u00062\b\b\u0002\u0010X\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\bb\u0010ZJ:\u0010c\u001a\u0002042\b\b\u0002\u0010U\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\u00062\b\b\u0002\u0010W\u001a\u00020\u00062\b\b\u0002\u0010X\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\bd\u0010ZJJ\u0010e\u001a\u00020f*\u00020f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010g\u001a\u00020\u00062\b\b\u0002\u0010h\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\bi\u0010jR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\f\u0010\bR\u0019\u0010\r\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0019\u0010\u0015\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0016\u0010\bR\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006k"}, d2 = {"Landroidx/compose/material/TextFieldDefaults;", "", "()V", "BackgroundOpacity", "", "FocusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "getFocusedBorderThickness-D9Ej5fM", "()F", "F", "IconOpacity", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "OutlinedTextFieldShape", "Landroidx/compose/ui/graphics/Shape;", "getOutlinedTextFieldShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "TextFieldShape", "getTextFieldShape", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "UnfocusedIndicatorLineOpacity", "BorderBox", "", ViewProps.ENABLED, "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", PaymentSheetAppearanceKeys.COLORS, "Landroidx/compose/material/TextFieldColors;", "shape", "focusedBorderThickness", "unfocusedBorderThickness", "BorderBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "OutlinedTextFieldDecorationBox", "value", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", ReactTextInputShadowNode.PROP_PLACEHOLDER, "leadingIcon", "trailingIcon", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "border", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "TextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", "outlinedTextFieldColors", Common.TEXT_COLOR, "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", ViewProps.BACKGROUND_COLOR, "cursorColor", "errorCursorColor", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "outlinedTextFieldColors-dx8h9Zs", "(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "outlinedTextFieldPadding", ViewProps.START, "top", ViewProps.END, "bottom", "outlinedTextFieldPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "textFieldColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "textFieldColors-dx8h9Zs", "textFieldWithLabelPadding", "textFieldWithLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "indicatorLine", "Landroidx/compose/ui/Modifier;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldDefaults {
    public static final int $stable = 0;
    public static final float BackgroundOpacity = 0.12f;
    public static final float IconOpacity = 0.54f;
    public static final float UnfocusedIndicatorLineOpacity = 0.42f;
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m6117constructorimpl(56);
    private static final float MinWidth = Dp.m6117constructorimpl(280);
    private static final float UnfocusedBorderThickness = Dp.m6117constructorimpl(1);
    private static final float FocusedBorderThickness = Dp.m6117constructorimpl(2);

    private TextFieldDefaults() {
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m2055getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m2056getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    public final Shape getTextFieldShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1117199624, "C233@8406L6:TextFieldDefaults.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1117199624, i, -1, "androidx.compose.material.TextFieldDefaults.<get-TextFieldShape> (TextFieldDefaults.kt:233)");
        }
        CornerBasedShape cornerBasedShapeCopy$default = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return cornerBasedShapeCopy$default;
    }

    public final Shape getOutlinedTextFieldShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1899109048, "C242@8708L6:TextFieldDefaults.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1899109048, i, -1, "androidx.compose.material.TextFieldDefaults.<get-OutlinedTextFieldShape> (TextFieldDefaults.kt:242)");
        }
        CornerBasedShape small = MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return small;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2057getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2054getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: indicatorLine-gv0btCI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2049indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, float f, float f2, int i, Object obj) {
        if ((i & 16) != 0) {
            f = FocusedBorderThickness;
        }
        return textFieldDefaults.m2058indicatorLinegv0btCI(modifier, z, z2, interactionSource, textFieldColors, f, (i & 32) != 0 ? UnfocusedBorderThickness : f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0188  */
    /* renamed from: BorderBox-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2053BorderBoxnbWgWpA(final boolean z, final boolean z2, final InteractionSource interactionSource, final TextFieldColors textFieldColors, Shape shape, float f, float f2, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        boolean z4;
        InteractionSource interactionSource2;
        TextFieldColors textFieldColors2;
        Shape outlinedTextFieldShape;
        float f3;
        float f4;
        final float f5;
        final float f6;
        Composer composerStartRestartGroup = composer.startRestartGroup(943754022);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BorderBox)P(1,4,3!1,5,2:c#ui.unit.Dp,6:c#ui.unit.Dp)332@12464L22,336@12648L203,344@12860L47:TextFieldDefaults.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(z3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z4) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            interactionSource2 = interactionSource;
        } else {
            interactionSource2 = interactionSource;
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                i3 |= composerStartRestartGroup.changed(interactionSource2) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            textFieldColors2 = textFieldColors;
        } else {
            textFieldColors2 = textFieldColors;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(textFieldColors2) ? 2048 : 1024;
            }
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                outlinedTextFieldShape = shape;
                int i4 = composerStartRestartGroup.changed(outlinedTextFieldShape) ? 16384 : 8192;
                i3 |= i4;
            } else {
                outlinedTextFieldShape = shape;
            }
            i3 |= i4;
        } else {
            outlinedTextFieldShape = shape;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                f3 = f;
                int i5 = composerStartRestartGroup.changed(f3) ? 131072 : 65536;
                i3 |= i5;
            } else {
                f3 = f;
            }
            i3 |= i5;
        } else {
            f3 = f;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                f4 = f2;
                int i6 = composerStartRestartGroup.changed(f4) ? 1048576 : 524288;
                i3 |= i6;
            } else {
                f4 = f2;
            }
            i3 |= i6;
        } else {
            f4 = f2;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(this) ? 8388608 : 4194304;
        }
        if ((4793491 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                }
                float f7 = f3;
                float f8 = f4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i7 = i3 & 8190;
                int i8 = i3 >> 3;
                BoxKt.Box(BorderKt.border(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.m2065animateBorderStrokeAsStateNuRrP5Q(z3, z4, interactionSource2, textFieldColors2, f7, f8, composerStartRestartGroup, i7 | (57344 & i8) | (i8 & 458752)).getValue(), outlinedTextFieldShape), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                f5 = f7;
                f6 = f8;
            } else {
                if ((i2 & 16) != 0) {
                    outlinedTextFieldShape = getOutlinedTextFieldShape(composerStartRestartGroup, (i3 >> 21) & 14);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    f3 = FocusedBorderThickness;
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    f4 = UnfocusedBorderThickness;
                    i3 &= -3670017;
                }
                float f72 = f3;
                float f82 = f4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(943754022, i3, -1, "androidx.compose.material.TextFieldDefaults.BorderBox (TextFieldDefaults.kt:335)");
                }
                int i72 = i3 & 8190;
                int i82 = i3 >> 3;
                BoxKt.Box(BorderKt.border(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.m2065animateBorderStrokeAsStateNuRrP5Q(z3, z4, interactionSource2, textFieldColors2, f72, f82, composerStartRestartGroup, i72 | (57344 & i82) | (i82 & 458752)).getValue(), outlinedTextFieldShape), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f5 = f72;
                f6 = f82;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            f6 = f4;
            f5 = f3;
        }
        final Shape shape2 = outlinedTextFieldShape;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$BorderBox$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i9) {
                    this.$tmp0_rcvr.m2053BorderBoxnbWgWpA(z, z2, interactionSource, textFieldColors, shape2, f5, f6, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2051textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getFirstBaselineOffset();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldBottomPadding();
        }
        return textFieldDefaults.m2062textFieldWithLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2062textFieldWithLabelPaddinga9UjIt4(float start, float end, float top, float bottom) {
        return PaddingKt.m1016PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2052textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m2063textFieldWithoutLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2063textFieldWithoutLabelPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m1016PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2050outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m2060outlinedTextFieldPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2060outlinedTextFieldPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m1016PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* renamed from: textFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m2061textFieldColorsdx8h9Zs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, Composer composer, int i, int i2, int i3, int i4) {
        long jM3656copywmQWz5c$default;
        long j22;
        long jM3656copywmQWz5c$default2;
        long j23;
        long jM3656copywmQWz5c$default3;
        long j24;
        long jM3656copywmQWz5c$default4;
        long j25;
        long jM3656copywmQWz5c$default5;
        ComposerKt.sourceInformationMarkerStart(composer, 231892599, "C(textFieldColors)P(17:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,8:c#ui.graphics.Color,13:c#ui.graphics.Color,19:c#ui.graphics.Color,2:c#ui.graphics.Color,9:c#ui.graphics.Color,15:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.graphics.Color,18:c#ui.graphics.Color,7:c#ui.graphics.Color,12:c#ui.graphics.Color,14:c#ui.graphics.Color,20:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.graphics.Color,16:c#ui.graphics.Color,5:c#ui.graphics.Color)395@14784L7,395@14815L7,396@14888L8,397@14946L6,398@15039L6,399@15103L6,401@15182L6,401@15223L4,403@15297L6,404@15449L8,405@15511L6,407@15585L6,408@15714L8,411@15843L6,412@15974L8,413@16039L6,415@16114L6,415@16155L4,416@16213L6,416@16248L6,417@16331L8,418@16389L6,419@16451L6,419@16486L6,420@16572L8:TextFieldDefaults.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd(composer);
            long jM3667unboximpl = ((Color) objConsume).m3667unboximpl();
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composer.consume(localContentAlpha);
            ComposerKt.sourceInformationMarkerEnd(composer);
            jM3656copywmQWz5c$default = Color.m3656copywmQWz5c$default(jM3667unboximpl, ((Number) objConsume2).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3656copywmQWz5c$default = j;
        }
        long jM3656copywmQWz5c$default6 = (i4 & 2) != 0 ? Color.m3656copywmQWz5c$default(jM3656copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM3656copywmQWz5c$default7 = (i4 & 4) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jM1833getPrimary0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1833getPrimary0d7_KjU() : j4;
        long jM1827getError0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1827getError0d7_KjU() : j5;
        long jM3656copywmQWz5c$default8 = (i4 & 32) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1833getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long jM3656copywmQWz5c$default9 = (i4 & 64) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if ((i4 & 128) != 0) {
            long j26 = jM3656copywmQWz5c$default9;
            j22 = j26;
            jM3656copywmQWz5c$default2 = Color.m3656copywmQWz5c$default(j26, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j22 = jM3656copywmQWz5c$default9;
            jM3656copywmQWz5c$default2 = j8;
        }
        long jM1827getError0d7_KjU2 = (i4 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1827getError0d7_KjU() : j9;
        long jM3656copywmQWz5c$default10 = (i4 & 512) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if ((i4 & 1024) != 0) {
            long j27 = jM3656copywmQWz5c$default10;
            jM3656copywmQWz5c$default3 = Color.m3656copywmQWz5c$default(j27, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j23 = j27;
        } else {
            j23 = jM3656copywmQWz5c$default10;
            jM3656copywmQWz5c$default3 = j11;
        }
        long j28 = (i4 & 2048) != 0 ? j23 : j12;
        long jM3656copywmQWz5c$default11 = (i4 & 4096) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if ((i4 & 8192) != 0) {
            long j29 = jM3656copywmQWz5c$default11;
            jM3656copywmQWz5c$default4 = Color.m3656copywmQWz5c$default(j29, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j24 = j29;
        } else {
            j24 = jM3656copywmQWz5c$default11;
            jM3656copywmQWz5c$default4 = j14;
        }
        long jM1827getError0d7_KjU3 = (i4 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1827getError0d7_KjU() : j15;
        long jM3656copywmQWz5c$default12 = (32768 & i4) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1833getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long jM3656copywmQWz5c$default13 = (65536 & i4) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        if ((131072 & i4) != 0) {
            long j30 = jM3656copywmQWz5c$default13;
            jM3656copywmQWz5c$default5 = Color.m3656copywmQWz5c$default(j30, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j25 = j30;
        } else {
            j25 = jM3656copywmQWz5c$default13;
            jM3656copywmQWz5c$default5 = j18;
        }
        long jM1827getError0d7_KjU4 = (262144 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1827getError0d7_KjU() : j19;
        long jM3656copywmQWz5c$default14 = (524288 & i4) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long jM3656copywmQWz5c$default15 = (i4 & 1048576) != 0 ? Color.m3656copywmQWz5c$default(jM3656copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(231892599, i, i2, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:422)");
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(jM3656copywmQWz5c$default, jM3656copywmQWz5c$default6, jM1833getPrimary0d7_KjU, jM1827getError0d7_KjU, jM3656copywmQWz5c$default8, j22, jM1827getError0d7_KjU2, jM3656copywmQWz5c$default2, j23, jM3656copywmQWz5c$default3, j28, j24, jM3656copywmQWz5c$default4, jM1827getError0d7_KjU3, jM3656copywmQWz5c$default7, jM3656copywmQWz5c$default12, j25, jM3656copywmQWz5c$default5, jM1827getError0d7_KjU4, jM3656copywmQWz5c$default14, jM3656copywmQWz5c$default15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultTextFieldColors;
    }

    /* renamed from: outlinedTextFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m2059outlinedTextFieldColorsdx8h9Zs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, Composer composer, int i, int i2, int i3, int i4) {
        long jM3656copywmQWz5c$default;
        long j22;
        long jM3656copywmQWz5c$default2;
        long j23;
        long jM3656copywmQWz5c$default3;
        long j24;
        long jM3656copywmQWz5c$default4;
        long j25;
        long jM3656copywmQWz5c$default5;
        ComposerKt.sourceInformationMarkerStart(composer, 1762667317, "C(outlinedTextFieldColors)P(17:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,9:c#ui.graphics.Color,13:c#ui.graphics.Color,19:c#ui.graphics.Color,2:c#ui.graphics.Color,8:c#ui.graphics.Color,15:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.graphics.Color,18:c#ui.graphics.Color,7:c#ui.graphics.Color,12:c#ui.graphics.Color,14:c#ui.graphics.Color,20:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.graphics.Color,16:c#ui.graphics.Color,5:c#ui.graphics.Color)453@18100L7,453@18131L7,454@18204L8,456@18310L6,457@18374L6,459@18450L6,459@18491L4,461@18562L6,461@18605L8,462@18700L8,463@18759L6,465@18833L6,466@18962L8,469@19091L6,470@19222L8,471@19287L6,473@19362L6,473@19403L4,474@19461L6,474@19496L6,475@19579L8,476@19637L6,477@19699L6,477@19734L6,478@19820L8:TextFieldDefaults.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd(composer);
            long jM3667unboximpl = ((Color) objConsume).m3667unboximpl();
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composer.consume(localContentAlpha);
            ComposerKt.sourceInformationMarkerEnd(composer);
            jM3656copywmQWz5c$default = Color.m3656copywmQWz5c$default(jM3667unboximpl, ((Number) objConsume2).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3656copywmQWz5c$default = j;
        }
        long jM3656copywmQWz5c$default6 = (i4 & 2) != 0 ? Color.m3656copywmQWz5c$default(jM3656copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM3692getTransparent0d7_KjU = (i4 & 4) != 0 ? Color.INSTANCE.m3692getTransparent0d7_KjU() : j3;
        long jM1833getPrimary0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1833getPrimary0d7_KjU() : j4;
        long jM1827getError0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1827getError0d7_KjU() : j5;
        long jM3656copywmQWz5c$default7 = (i4 & 32) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1833getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long jM3656copywmQWz5c$default8 = (i4 & 64) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if ((i4 & 128) != 0) {
            long j26 = jM3656copywmQWz5c$default8;
            j22 = j26;
            jM3656copywmQWz5c$default2 = Color.m3656copywmQWz5c$default(j26, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j22 = jM3656copywmQWz5c$default8;
            jM3656copywmQWz5c$default2 = j8;
        }
        long jM1827getError0d7_KjU2 = (i4 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1827getError0d7_KjU() : j9;
        long jM3656copywmQWz5c$default9 = (i4 & 512) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if ((i4 & 1024) != 0) {
            long j27 = jM3656copywmQWz5c$default9;
            jM3656copywmQWz5c$default3 = Color.m3656copywmQWz5c$default(j27, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j23 = j27;
        } else {
            j23 = jM3656copywmQWz5c$default9;
            jM3656copywmQWz5c$default3 = j11;
        }
        long j28 = (i4 & 2048) != 0 ? j23 : j12;
        long jM3656copywmQWz5c$default10 = (i4 & 4096) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if ((i4 & 8192) != 0) {
            long j29 = jM3656copywmQWz5c$default10;
            jM3656copywmQWz5c$default4 = Color.m3656copywmQWz5c$default(j29, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j24 = j29;
        } else {
            j24 = jM3656copywmQWz5c$default10;
            jM3656copywmQWz5c$default4 = j14;
        }
        long jM1827getError0d7_KjU3 = (i4 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1827getError0d7_KjU() : j15;
        long jM3656copywmQWz5c$default11 = (32768 & i4) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1833getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long jM3656copywmQWz5c$default12 = (65536 & i4) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        if ((131072 & i4) != 0) {
            long j30 = jM3656copywmQWz5c$default12;
            jM3656copywmQWz5c$default5 = Color.m3656copywmQWz5c$default(j30, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j25 = j30;
        } else {
            j25 = jM3656copywmQWz5c$default12;
            jM3656copywmQWz5c$default5 = j18;
        }
        long jM1827getError0d7_KjU4 = (262144 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1827getError0d7_KjU() : j19;
        long jM3656copywmQWz5c$default13 = (524288 & i4) != 0 ? Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1832getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long jM3656copywmQWz5c$default14 = (i4 & 1048576) != 0 ? Color.m3656copywmQWz5c$default(jM3656copywmQWz5c$default13, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1762667317, i, i2, "androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:480)");
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(jM3656copywmQWz5c$default, jM3656copywmQWz5c$default6, jM1833getPrimary0d7_KjU, jM1827getError0d7_KjU, jM3656copywmQWz5c$default7, j22, jM1827getError0d7_KjU2, jM3656copywmQWz5c$default2, j23, jM3656copywmQWz5c$default3, j28, j24, jM3656copywmQWz5c$default4, jM1827getError0d7_KjU3, jM3692getTransparent0d7_KjU, jM3656copywmQWz5c$default11, j25, jM3656copywmQWz5c$default5, jM1827getError0d7_KjU4, jM3656copywmQWz5c$default13, jM3656copywmQWz5c$default14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultTextFieldColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void TextFieldDecorationBox(final String str, final Function2<? super Composer, ? super Integer, Unit> function2, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Composer composer, final int i, final int i2, int i3) {
        int i4;
        int i5;
        final boolean z4;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Shape textFieldShape;
        Shape shape2;
        Composer composer2;
        int i15;
        TextFieldColors textFieldColorsM2061textFieldColorsdx8h9Zs;
        PaddingValues paddingValues2;
        Shape shape3;
        TextFieldColors textFieldColors2;
        boolean z5;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        PaddingValues paddingValuesM2051textFieldWithLabelPaddinga9UjIt4$default;
        int i16;
        final PaddingValues paddingValues3;
        final Shape shape4;
        final TextFieldColors textFieldColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i17 = i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1391531252);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TextFieldDecorationBox)P(12,3,2,10,13,4,5,6,8,7,11,9)573@25758L14,574@25808L17,582@26042L624:TextFieldDefaults.kt#jmzs0o");
        if ((i17 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i17 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            }
            if ((i17 & 4) == 0) {
                i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                }
                int i18 = 1024;
                if ((i17 & 8) != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                    }
                    if ((i17 & 16) == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            i4 |= composerStartRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                        }
                        if ((i17 & 32) != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536;
                        }
                        i5 = i17 & 64;
                        if (i5 != 0) {
                            i4 |= 1572864;
                            z4 = z3;
                        } else {
                            z4 = z3;
                            if ((i & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
                            }
                        }
                        i6 = i17 & 128;
                        if (i6 != 0) {
                            i4 |= 12582912;
                            function26 = function22;
                        } else {
                            function26 = function22;
                            if ((i & 12582912) == 0) {
                                i4 |= composerStartRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
                            }
                        }
                        i7 = i17 & 256;
                        if (i7 != 0) {
                            i4 |= 100663296;
                            function27 = function23;
                        } else {
                            function27 = function23;
                            if ((i & 100663296) == 0) {
                                i4 |= composerStartRestartGroup.changedInstance(function27) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                        }
                        i8 = i17 & 512;
                        if (i8 == 0) {
                            if ((i & 805306368) == 0) {
                                i9 = i8;
                                i4 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                            }
                            i10 = i17 & 1024;
                            if (i10 == 0) {
                                i12 = i2 | 6;
                                i11 = i10;
                            } else if ((i2 & 6) == 0) {
                                i11 = i10;
                                i12 = i2 | (composerStartRestartGroup.changedInstance(function25) ? 4 : 2);
                            } else {
                                i11 = i10;
                                i12 = i2;
                            }
                            if ((i2 & 48) == 0) {
                                i12 |= ((i17 & 2048) == 0 && composerStartRestartGroup.changed(shape)) ? 32 : 16;
                            }
                            if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                i12 |= ((i17 & 4096) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 256 : 128;
                            }
                            if ((i2 & 3072) == 0) {
                                if ((i17 & 8192) == 0 && composerStartRestartGroup.changed(paddingValues)) {
                                    i18 = 2048;
                                }
                                i12 |= i18;
                            }
                            i13 = i12;
                            if ((i17 & 16384) == 0) {
                                i13 |= 24576;
                            } else if ((i2 & 24576) == 0) {
                                i13 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                            }
                            if ((306783379 & i4) == 306783378 || (i13 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    boolean z6 = i5 == 0 ? false : z4;
                                    Function2<? super Composer, ? super Integer, Unit> function212 = i6 == 0 ? null : function26;
                                    Function2<? super Composer, ? super Integer, Unit> function213 = i7 == 0 ? null : function27;
                                    Function2<? super Composer, ? super Integer, Unit> function214 = i9 == 0 ? null : function24;
                                    Function2<? super Composer, ? super Integer, Unit> function215 = i11 == 0 ? null : function25;
                                    if ((i17 & 2048) == 0) {
                                        i14 = i13 & (-113);
                                        textFieldShape = getTextFieldShape(composerStartRestartGroup, (i13 >> 12) & 14);
                                    } else {
                                        i14 = i13;
                                        textFieldShape = shape;
                                    }
                                    if ((i17 & 4096) == 0) {
                                        int i19 = i14;
                                        shape2 = textFieldShape;
                                        i15 = i4;
                                        textFieldColorsM2061textFieldColorsdx8h9Zs = m2061textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i14 >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 2097151);
                                        composer2 = composerStartRestartGroup;
                                        i13 = i19 & (-897);
                                    } else {
                                        shape2 = textFieldShape;
                                        i13 = i14;
                                        composer2 = composerStartRestartGroup;
                                        i15 = i4;
                                        textFieldColorsM2061textFieldColorsdx8h9Zs = textFieldColors;
                                    }
                                    i17 = i3;
                                    if ((i17 & 8192) == 0) {
                                        if (function212 == null) {
                                            paddingValuesM2051textFieldWithLabelPaddinga9UjIt4$default = m2052textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        } else {
                                            paddingValuesM2051textFieldWithLabelPaddinga9UjIt4$default = m2051textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        }
                                        i13 &= -7169;
                                        shape3 = shape2;
                                        paddingValues2 = paddingValuesM2051textFieldWithLabelPaddinga9UjIt4$default;
                                    } else {
                                        paddingValues2 = paddingValues;
                                        shape3 = shape2;
                                    }
                                    textFieldColors2 = textFieldColorsM2061textFieldColorsdx8h9Zs;
                                    z5 = z6;
                                    function28 = function212;
                                    function29 = function213;
                                    function210 = function214;
                                    function211 = function215;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i17 & 2048) != 0) {
                                        i13 &= -113;
                                    }
                                    if ((i17 & 4096) != 0) {
                                        i13 &= -897;
                                    }
                                    if ((i17 & 8192) != 0) {
                                        i13 &= -7169;
                                    }
                                    function210 = function24;
                                    shape3 = shape;
                                    textFieldColors2 = textFieldColors;
                                    paddingValues2 = paddingValues;
                                    composer2 = composerStartRestartGroup;
                                    i15 = i4;
                                    function28 = function26;
                                    function29 = function27;
                                    function211 = function25;
                                    z5 = z4;
                                }
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    i16 = i15;
                                } else {
                                    i16 = i15;
                                    ComposerKt.traceEventStart(-1391531252, i16, i13, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:581)");
                                }
                                TextFieldType textFieldType = TextFieldType.Filled;
                                int i20 = i16 << 3;
                                int i21 = i16 >> 9;
                                int i22 = (i20 & 896) | (i20 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6 | ((i16 >> 3) & 7168) | (57344 & i21) | (458752 & i21) | (i21 & 3670016) | ((i13 << 21) & 29360128) | ((i16 << 15) & 234881024) | ((i16 << 21) & 1879048192);
                                int i23 = ((i16 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i16 >> 12) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i13 >> 3) & 896);
                                int i24 = i13 << 6;
                                TextFieldImplKt.CommonDecorationBox(textFieldType, str, function2, visualTransformation, function28, function29, function210, function211, z2, z, z5, interactionSource, paddingValues2, shape3, textFieldColors2, null, composer2, i22, i23 | (i24 & 7168) | (i24 & 57344));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z4 = z5;
                                paddingValues3 = paddingValues2;
                                shape4 = shape3;
                                textFieldColors3 = textFieldColors2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                function210 = function24;
                                shape4 = shape;
                                textFieldColors3 = textFieldColors;
                                composer2 = composerStartRestartGroup;
                                function28 = function26;
                                function29 = function27;
                                function211 = function25;
                                paddingValues3 = paddingValues;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                final int i25 = i17;
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox.1
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

                                    public final void invoke(Composer composer3, int i26) {
                                        TextFieldDefaults.this.TextFieldDecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z4, function28, function29, function210, function211, shape4, textFieldColors3, paddingValues3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i25);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 805306368;
                        i9 = i8;
                        i10 = i17 & 1024;
                        if (i10 == 0) {
                        }
                        if ((i2 & 48) == 0) {
                        }
                        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                        }
                        if ((i2 & 3072) == 0) {
                        }
                        i13 = i12;
                        if ((i17 & 16384) == 0) {
                        }
                        if ((306783379 & i4) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i5 == 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if ((i17 & 2048) == 0) {
                                }
                                if ((i17 & 4096) == 0) {
                                }
                                i17 = i3;
                                if ((i17 & 8192) == 0) {
                                }
                                textFieldColors2 = textFieldColorsM2061textFieldColorsdx8h9Zs;
                                z5 = z6;
                                function28 = function212;
                                function29 = function213;
                                function210 = function214;
                                function211 = function215;
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                TextFieldType textFieldType2 = TextFieldType.Filled;
                                int i202 = i16 << 3;
                                int i212 = i16 >> 9;
                                int i222 = (i202 & 896) | (i202 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6 | ((i16 >> 3) & 7168) | (57344 & i212) | (458752 & i212) | (i212 & 3670016) | ((i13 << 21) & 29360128) | ((i16 << 15) & 234881024) | ((i16 << 21) & 1879048192);
                                int i232 = ((i16 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i16 >> 12) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i13 >> 3) & 896);
                                int i242 = i13 << 6;
                                TextFieldImplKt.CommonDecorationBox(textFieldType2, str, function2, visualTransformation, function28, function29, function210, function211, z2, z, z5, interactionSource, paddingValues2, shape3, textFieldColors2, null, composer2, i222, i232 | (i242 & 7168) | (i242 & 57344));
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z4 = z5;
                                paddingValues3 = paddingValues2;
                                shape4 = shape3;
                                textFieldColors3 = textFieldColors2;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i17 & 32) != 0) {
                    }
                    i5 = i17 & 64;
                    if (i5 != 0) {
                    }
                    i6 = i17 & 128;
                    if (i6 != 0) {
                    }
                    i7 = i17 & 256;
                    if (i7 != 0) {
                    }
                    i8 = i17 & 512;
                    if (i8 == 0) {
                    }
                    i9 = i8;
                    i10 = i17 & 1024;
                    if (i10 == 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    }
                    if ((i2 & 3072) == 0) {
                    }
                    i13 = i12;
                    if ((i17 & 16384) == 0) {
                    }
                    if ((306783379 & i4) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                if ((i17 & 16) == 0) {
                }
                if ((i17 & 32) != 0) {
                }
                i5 = i17 & 64;
                if (i5 != 0) {
                }
                i6 = i17 & 128;
                if (i6 != 0) {
                }
                i7 = i17 & 256;
                if (i7 != 0) {
                }
                i8 = i17 & 512;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i17 & 1024;
                if (i10 == 0) {
                }
                if ((i2 & 48) == 0) {
                }
                if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                }
                if ((i2 & 3072) == 0) {
                }
                i13 = i12;
                if ((i17 & 16384) == 0) {
                }
                if ((306783379 & i4) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            int i182 = 1024;
            if ((i17 & 8) != 0) {
            }
            if ((i17 & 16) == 0) {
            }
            if ((i17 & 32) != 0) {
            }
            i5 = i17 & 64;
            if (i5 != 0) {
            }
            i6 = i17 & 128;
            if (i6 != 0) {
            }
            i7 = i17 & 256;
            if (i7 != 0) {
            }
            i8 = i17 & 512;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i17 & 1024;
            if (i10 == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            i13 = i12;
            if ((i17 & 16384) == 0) {
            }
            if ((306783379 & i4) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i17 & 4) == 0) {
        }
        int i1822 = 1024;
        if ((i17 & 8) != 0) {
        }
        if ((i17 & 16) == 0) {
        }
        if ((i17 & 32) != 0) {
        }
        i5 = i17 & 64;
        if (i5 != 0) {
        }
        i6 = i17 & 128;
        if (i6 != 0) {
        }
        i7 = i17 & 256;
        if (i7 != 0) {
        }
        i8 = i17 & 512;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i17 & 1024;
        if (i10 == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        i13 = i12;
        if ((i17 & 16384) == 0) {
        }
        if ((306783379 & i4) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OutlinedTextFieldDecorationBox(final String str, final Function2<? super Composer, ? super Integer, Unit> function2, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function26, Composer composer, final int i, final int i2, int i3) {
        int i4;
        int i5;
        final boolean z4;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Shape shape2;
        boolean z5;
        int i15;
        Composer composer2;
        int i16;
        int i17;
        TextFieldColors textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs;
        PaddingValues paddingValuesM2050outlinedTextFieldPaddinga9UjIt4$default;
        boolean z6;
        TextFieldColors textFieldColors2;
        Shape shape3;
        Function2<? super Composer, ? super Integer, Unit> function2RememberComposableLambda;
        PaddingValues paddingValues2;
        TextFieldColors textFieldColors3;
        Shape shape4;
        boolean z7;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        int i18;
        Composer composer3;
        final PaddingValues paddingValues3;
        final Shape shape5;
        final TextFieldColors textFieldColors4;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i19 = i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-920823490);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OutlinedTextFieldDecorationBox)P(13,4,3,11,14,5,6,7,9,8,12,10,1,2)669@31256L22,670@31314L25,672@31450L85,676@31552L628:TextFieldDefaults.kt#jmzs0o");
        if ((i19 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i19 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            }
            if ((i19 & 4) == 0) {
                i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                }
                int i20 = 1024;
                if ((i19 & 8) != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                    }
                    if ((i19 & 16) == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            i4 |= composerStartRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                        }
                        if ((i19 & 32) != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536;
                        }
                        i5 = i19 & 64;
                        if (i5 != 0) {
                            i4 |= 1572864;
                            z4 = z3;
                        } else {
                            z4 = z3;
                            if ((i & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
                            }
                        }
                        i6 = i19 & 128;
                        if (i6 != 0) {
                            i4 |= 12582912;
                            function27 = function22;
                        } else {
                            function27 = function22;
                            if ((i & 12582912) == 0) {
                                i4 |= composerStartRestartGroup.changedInstance(function27) ? 8388608 : 4194304;
                            }
                        }
                        i7 = i19 & 256;
                        if (i7 != 0) {
                            i4 |= 100663296;
                            function28 = function23;
                        } else {
                            function28 = function23;
                            if ((i & 100663296) == 0) {
                                i4 |= composerStartRestartGroup.changedInstance(function28) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                        }
                        i8 = i19 & 512;
                        if (i8 != 0) {
                            i4 |= 805306368;
                        } else {
                            if ((i & 805306368) == 0) {
                                i9 = i8;
                                i4 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                            }
                            i10 = i19 & 1024;
                            if (i10 == 0) {
                                i12 = i2 | 6;
                                i11 = i10;
                            } else if ((i2 & 6) == 0) {
                                i11 = i10;
                                i12 = i2 | (composerStartRestartGroup.changedInstance(function25) ? 4 : 2);
                            } else {
                                i11 = i10;
                                i12 = i2;
                            }
                            if ((i2 & 48) == 0) {
                                i12 |= ((i19 & 2048) == 0 && composerStartRestartGroup.changed(shape)) ? 32 : 16;
                            }
                            if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                i12 |= ((i19 & 4096) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 256 : 128;
                            }
                            if ((i2 & 3072) == 0) {
                                if ((i19 & 8192) == 0 && composerStartRestartGroup.changed(paddingValues)) {
                                    i20 = 2048;
                                }
                                i12 |= i20;
                            }
                            int i21 = i12;
                            i13 = i19 & 16384;
                            if (i13 != 0) {
                                i14 = i21;
                                if ((i2 & 24576) == 0) {
                                    i14 |= composerStartRestartGroup.changedInstance(function26) ? 16384 : 8192;
                                }
                                if ((i19 & 32768) != 0) {
                                    i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i14 |= composerStartRestartGroup.changed(this) ? 131072 : 65536;
                                }
                                if ((i4 & 306783379) != 306783378 || (i14 & 74899) != 74898 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        boolean z8 = i5 == 0 ? false : z4;
                                        Function2<? super Composer, ? super Integer, Unit> function214 = i6 == 0 ? null : function27;
                                        Function2<? super Composer, ? super Integer, Unit> function215 = i7 == 0 ? null : function28;
                                        Function2<? super Composer, ? super Integer, Unit> function216 = i9 == 0 ? null : function24;
                                        Function2<? super Composer, ? super Integer, Unit> function217 = i11 == 0 ? null : function25;
                                        if ((i19 & 2048) == 0) {
                                            Shape outlinedTextFieldShape = getOutlinedTextFieldShape(composerStartRestartGroup, (i14 >> 15) & 14);
                                            i14 &= -113;
                                            shape2 = outlinedTextFieldShape;
                                        } else {
                                            shape2 = shape;
                                        }
                                        if ((i19 & 4096) == 0) {
                                            i15 = i13;
                                            z5 = z8;
                                            i16 = i4;
                                            textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs = m2059outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i14 >> 12) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 2097151);
                                            composer2 = composerStartRestartGroup;
                                            i17 = i14 & (-897);
                                        } else {
                                            z5 = z8;
                                            i15 = i13;
                                            composer2 = composerStartRestartGroup;
                                            i16 = i4;
                                            i17 = i14;
                                            textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                        }
                                        i19 = i3;
                                        if ((i19 & 8192) == 0) {
                                            paddingValuesM2050outlinedTextFieldPaddinga9UjIt4$default = m2050outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                            i17 &= -7169;
                                        } else {
                                            paddingValuesM2050outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                        }
                                        if (i15 == 0) {
                                            final boolean z9 = z5;
                                            final TextFieldColors textFieldColors5 = textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs;
                                            final Shape shape6 = shape2;
                                            z6 = z9;
                                            textFieldColors2 = textFieldColors5;
                                            shape3 = shape6;
                                            function2RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(2147252344, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer4, int i22) {
                                                    ComposerKt.sourceInformation(composer4, "C673@31464L61:TextFieldDefaults.kt#jmzs0o");
                                                    if ((i22 & 3) == 2 && composer4.getSkipping()) {
                                                        composer4.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(2147252344, i22, -1, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:673)");
                                                    }
                                                    TextFieldDefaults.INSTANCE.m2053BorderBoxnbWgWpA(z, z9, interactionSource, textFieldColors5, shape6, 0.0f, 0.0f, composer4, 12582912, 96);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer2, 54);
                                        } else {
                                            z6 = z5;
                                            textFieldColors2 = textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs;
                                            shape3 = shape2;
                                            function2RememberComposableLambda = function26;
                                        }
                                        paddingValues2 = paddingValuesM2050outlinedTextFieldPaddinga9UjIt4$default;
                                        textFieldColors3 = textFieldColors2;
                                        shape4 = shape3;
                                        z7 = z6;
                                        function29 = function214;
                                        function210 = function215;
                                        function211 = function216;
                                        function212 = function217;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i19 & 2048) != 0) {
                                            i14 &= -113;
                                        }
                                        i17 = i14;
                                        if ((i19 & 4096) != 0) {
                                            i17 &= -897;
                                        }
                                        if ((i19 & 8192) != 0) {
                                            i17 &= -7169;
                                        }
                                        function211 = function24;
                                        shape4 = shape;
                                        textFieldColors3 = textFieldColors;
                                        paddingValues2 = paddingValues;
                                        function2RememberComposableLambda = function26;
                                        composer2 = composerStartRestartGroup;
                                        i16 = i4;
                                        function29 = function27;
                                        function210 = function28;
                                        function212 = function25;
                                        z7 = z4;
                                    }
                                    composer2.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        i18 = i16;
                                    } else {
                                        i18 = i16;
                                        ComposerKt.traceEventStart(-920823490, i18, i17, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:675)");
                                    }
                                    TextFieldType textFieldType = TextFieldType.Outlined;
                                    int i22 = i18 << 3;
                                    int i23 = i18 >> 9;
                                    int i24 = (i22 & 896) | (i22 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6 | ((i18 >> 3) & 7168) | (57344 & i23) | (458752 & i23) | (i23 & 3670016) | ((i17 << 21) & 29360128) | ((i18 << 15) & 234881024) | ((i18 << 21) & 1879048192);
                                    int i25 = ((i18 >> 18) & 14) | ((i18 >> 12) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i17 >> 3) & 896);
                                    int i26 = i17 << 6;
                                    Composer composer4 = composer2;
                                    TextFieldImplKt.CommonDecorationBox(textFieldType, str, function2, visualTransformation, function29, function210, function211, function212, z2, z, z7, interactionSource, paddingValues2, shape4, textFieldColors3, function2RememberComposableLambda, composer4, i24, i25 | (i26 & 7168) | (i26 & 57344) | ((i17 << 3) & 458752));
                                    composer3 = composer4;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    z4 = z7;
                                    paddingValues3 = paddingValues2;
                                    shape5 = shape4;
                                    textFieldColors4 = textFieldColors3;
                                    function213 = function2RememberComposableLambda;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    function211 = function24;
                                    shape5 = shape;
                                    textFieldColors4 = textFieldColors;
                                    function213 = function26;
                                    composer3 = composerStartRestartGroup;
                                    function29 = function27;
                                    function210 = function28;
                                    function212 = function25;
                                    paddingValues3 = paddingValues;
                                }
                                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    final int i27 = i19;
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.2
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

                                        public final void invoke(Composer composer5, int i28) {
                                            TextFieldDefaults.this.OutlinedTextFieldDecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z4, function29, function210, function211, function212, shape5, textFieldColors4, paddingValues3, function213, composer5, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i27);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i14 = i21 | 24576;
                            if ((i19 & 32768) != 0) {
                            }
                            if ((i4 & 306783379) != 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    if (i5 == 0) {
                                    }
                                    if (i6 == 0) {
                                    }
                                    if (i7 == 0) {
                                    }
                                    if (i9 == 0) {
                                    }
                                    if (i11 == 0) {
                                    }
                                    if ((i19 & 2048) == 0) {
                                    }
                                    if ((i19 & 4096) == 0) {
                                    }
                                    i19 = i3;
                                    if ((i19 & 8192) == 0) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    paddingValues2 = paddingValuesM2050outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors3 = textFieldColors2;
                                    shape4 = shape3;
                                    z7 = z6;
                                    function29 = function214;
                                    function210 = function215;
                                    function211 = function216;
                                    function212 = function217;
                                    composer2.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    TextFieldType textFieldType2 = TextFieldType.Outlined;
                                    int i222 = i18 << 3;
                                    int i232 = i18 >> 9;
                                    int i242 = (i222 & 896) | (i222 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6 | ((i18 >> 3) & 7168) | (57344 & i232) | (458752 & i232) | (i232 & 3670016) | ((i17 << 21) & 29360128) | ((i18 << 15) & 234881024) | ((i18 << 21) & 1879048192);
                                    int i252 = ((i18 >> 18) & 14) | ((i18 >> 12) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i17 >> 3) & 896);
                                    int i262 = i17 << 6;
                                    Composer composer42 = composer2;
                                    TextFieldImplKt.CommonDecorationBox(textFieldType2, str, function2, visualTransformation, function29, function210, function211, function212, z2, z, z7, interactionSource, paddingValues2, shape4, textFieldColors3, function2RememberComposableLambda, composer42, i242, i252 | (i262 & 7168) | (i262 & 57344) | ((i17 << 3) & 458752));
                                    composer3 = composer42;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    z4 = z7;
                                    paddingValues3 = paddingValues2;
                                    shape5 = shape4;
                                    textFieldColors4 = textFieldColors3;
                                    function213 = function2RememberComposableLambda;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i9 = i8;
                        i10 = i19 & 1024;
                        if (i10 == 0) {
                        }
                        if ((i2 & 48) == 0) {
                        }
                        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                        }
                        if ((i2 & 3072) == 0) {
                        }
                        int i212 = i12;
                        i13 = i19 & 16384;
                        if (i13 != 0) {
                        }
                        if ((i19 & 32768) != 0) {
                        }
                        if ((i4 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    if ((i19 & 32) != 0) {
                    }
                    i5 = i19 & 64;
                    if (i5 != 0) {
                    }
                    i6 = i19 & 128;
                    if (i6 != 0) {
                    }
                    i7 = i19 & 256;
                    if (i7 != 0) {
                    }
                    i8 = i19 & 512;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    i10 = i19 & 1024;
                    if (i10 == 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    }
                    if ((i2 & 3072) == 0) {
                    }
                    int i2122 = i12;
                    i13 = i19 & 16384;
                    if (i13 != 0) {
                    }
                    if ((i19 & 32768) != 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i19 & 16) == 0) {
                }
                if ((i19 & 32) != 0) {
                }
                i5 = i19 & 64;
                if (i5 != 0) {
                }
                i6 = i19 & 128;
                if (i6 != 0) {
                }
                i7 = i19 & 256;
                if (i7 != 0) {
                }
                i8 = i19 & 512;
                if (i8 != 0) {
                }
                i9 = i8;
                i10 = i19 & 1024;
                if (i10 == 0) {
                }
                if ((i2 & 48) == 0) {
                }
                if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                }
                if ((i2 & 3072) == 0) {
                }
                int i21222 = i12;
                i13 = i19 & 16384;
                if (i13 != 0) {
                }
                if ((i19 & 32768) != 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            int i202 = 1024;
            if ((i19 & 8) != 0) {
            }
            if ((i19 & 16) == 0) {
            }
            if ((i19 & 32) != 0) {
            }
            i5 = i19 & 64;
            if (i5 != 0) {
            }
            i6 = i19 & 128;
            if (i6 != 0) {
            }
            i7 = i19 & 256;
            if (i7 != 0) {
            }
            i8 = i19 & 512;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i19 & 1024;
            if (i10 == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            int i212222 = i12;
            i13 = i19 & 16384;
            if (i13 != 0) {
            }
            if ((i19 & 32768) != 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i19 & 4) == 0) {
        }
        int i2022 = 1024;
        if ((i19 & 8) != 0) {
        }
        if ((i19 & 16) == 0) {
        }
        if ((i19 & 32) != 0) {
        }
        i5 = i19 & 64;
        if (i5 != 0) {
        }
        i6 = i19 & 128;
        if (i6 != 0) {
        }
        i7 = i19 & 256;
        if (i7 != 0) {
        }
        i8 = i19 & 512;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i19 & 1024;
        if (i10 == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        int i2122222 = i12;
        i13 = i19 & 16384;
        if (i13 != 0) {
        }
        if ((i19 & 32768) != 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0129  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with `shape` parameter.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void TextFieldDecorationBox(final String str, final Function2 function2, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z3, Function2 function22, Function2 function23, Function2 function24, Function2 function25, TextFieldColors textFieldColors, PaddingValues paddingValues, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z4;
        int i6;
        Function2 function26;
        int i7;
        Function2 function27;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        TextFieldColors textFieldColorsM2061textFieldColorsdx8h9Zs;
        int i15;
        TextFieldDefaults textFieldDefaults;
        final PaddingValues paddingValues2;
        final TextFieldColors textFieldColors2;
        Function2 function28;
        Function2 function29;
        Function2 function210;
        Function2 function211;
        PaddingValues paddingValuesM2051textFieldWithLabelPaddinga9UjIt4$default;
        int i16;
        final Function2 function212;
        final Function2 function213;
        final Function2 function214;
        final Function2 function215;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1171040065);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TextFieldDecorationBox)P(11,3,2,9,12,4,5,6,8,7,10)714@32930L17,733@33577L14,721@33156L508:TextFieldDefaults.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                    }
                    if ((i3 & 16) == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            i4 |= composerStartRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                        }
                        if ((i3 & 32) != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536;
                        }
                        i5 = i3 & 64;
                        if (i5 != 0) {
                            i4 |= 1572864;
                            z4 = z3;
                        } else {
                            z4 = z3;
                            if ((i & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
                            }
                        }
                        i6 = i3 & 128;
                        if (i6 != 0) {
                            i4 |= 12582912;
                            function26 = function22;
                        } else {
                            function26 = function22;
                            if ((i & 12582912) == 0) {
                                i4 |= composerStartRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
                            }
                        }
                        i7 = i3 & 256;
                        if (i7 != 0) {
                            i4 |= 100663296;
                            function27 = function23;
                        } else {
                            function27 = function23;
                            if ((i & 100663296) == 0) {
                                i4 |= composerStartRestartGroup.changedInstance(function27) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                        }
                        i8 = i3 & 512;
                        if (i8 == 0) {
                            if ((i & 805306368) == 0) {
                                i9 = i8;
                                i4 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                            }
                            i10 = i3 & 1024;
                            if (i10 == 0) {
                                i12 = i2 | 6;
                                i11 = i10;
                            } else if ((i2 & 6) == 0) {
                                i11 = i10;
                                i12 = i2 | (composerStartRestartGroup.changedInstance(function25) ? 4 : 2);
                            } else {
                                i11 = i10;
                                i12 = i2;
                            }
                            if ((i2 & 48) == 0) {
                                i12 |= ((i3 & 2048) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 32 : 16;
                            }
                            if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                i12 |= ((i3 & 4096) == 0 && composerStartRestartGroup.changed(paddingValues)) ? 256 : 128;
                            }
                            int i17 = i12;
                            if ((i3 & 8192) == 0) {
                                i17 |= 3072;
                            } else if ((i2 & 3072) == 0) {
                                i17 |= composerStartRestartGroup.changed(this) ? 2048 : 1024;
                            }
                            if ((306783379 & i4) != 306783378 && (i17 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                function212 = function25;
                                textFieldColors2 = textFieldColors;
                                function215 = function26;
                                function214 = function27;
                                function213 = function24;
                                paddingValues2 = paddingValues;
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    boolean z5 = i5 == 0 ? false : z4;
                                    Function2 function216 = i6 == 0 ? null : function26;
                                    Function2 function217 = i7 == 0 ? null : function27;
                                    Function2 function218 = i9 == 0 ? null : function24;
                                    Function2 function219 = i11 == 0 ? null : function25;
                                    if ((i3 & 2048) == 0) {
                                        int i18 = (i17 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS;
                                        int i19 = i17;
                                        i14 = i4;
                                        i13 = i3;
                                        textFieldColorsM2061textFieldColorsdx8h9Zs = m2061textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, i18, 2097151);
                                        composerStartRestartGroup = composerStartRestartGroup;
                                        i15 = i19 & (-113);
                                    } else {
                                        int i20 = i17;
                                        i13 = i3;
                                        i14 = i4;
                                        textFieldColorsM2061textFieldColorsdx8h9Zs = textFieldColors;
                                        i15 = i20;
                                    }
                                    if ((i13 & 4096) == 0) {
                                        if (function216 == null) {
                                            paddingValuesM2051textFieldWithLabelPaddinga9UjIt4$default = m2052textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                            textFieldDefaults = this;
                                        } else {
                                            paddingValuesM2051textFieldWithLabelPaddinga9UjIt4$default = m2051textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                            textFieldDefaults = this;
                                        }
                                        i15 &= -897;
                                        textFieldColors2 = textFieldColorsM2061textFieldColorsdx8h9Zs;
                                        paddingValues2 = paddingValuesM2051textFieldWithLabelPaddinga9UjIt4$default;
                                    } else {
                                        textFieldDefaults = this;
                                        paddingValues2 = paddingValues;
                                        textFieldColors2 = textFieldColorsM2061textFieldColorsdx8h9Zs;
                                    }
                                    z4 = z5;
                                    function28 = function216;
                                    function29 = function217;
                                    function210 = function218;
                                    function211 = function219;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 2048) != 0) {
                                        i17 &= -113;
                                    }
                                    if ((i3 & 4096) != 0) {
                                        i17 &= -897;
                                    }
                                    textFieldDefaults = this;
                                    function210 = function24;
                                    textFieldColors2 = textFieldColors;
                                    i15 = i17;
                                    i14 = i4;
                                    function28 = function26;
                                    function29 = function27;
                                    function211 = function25;
                                    paddingValues2 = paddingValues;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    i16 = i14;
                                } else {
                                    i16 = i14;
                                    ComposerKt.traceEventStart(1171040065, i16, i15, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:721)");
                                }
                                int i21 = i15 & 14;
                                int i22 = i15 << 3;
                                textFieldDefaults.TextFieldDecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z4, function28, function29, function210, function211, textFieldDefaults.getTextFieldShape(composerStartRestartGroup, (i15 >> 9) & 14), textFieldColors2, paddingValues2, composerStartRestartGroup, i16 & 2147483646, i21 | (i22 & 896) | (i22 & 7168) | (i22 & 57344), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function212 = function211;
                                function213 = function210;
                                function214 = function29;
                                function215 = function28;
                            }
                            final boolean z6 = z4;
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox.2
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

                                    public final void invoke(Composer composer2, int i23) {
                                        TextFieldDefaults.this.TextFieldDecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function215, function214, function213, function212, textFieldColors2, paddingValues2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 805306368;
                        i9 = i8;
                        i10 = i3 & 1024;
                        if (i10 == 0) {
                        }
                        if ((i2 & 48) == 0) {
                        }
                        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                        }
                        int i172 = i12;
                        if ((i3 & 8192) == 0) {
                        }
                        if ((306783379 & i4) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i5 == 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if ((i3 & 2048) == 0) {
                                }
                                if ((i13 & 4096) == 0) {
                                }
                                z4 = z5;
                                function28 = function216;
                                function29 = function217;
                                function210 = function218;
                                function211 = function219;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i212 = i15 & 14;
                                int i222 = i15 << 3;
                                textFieldDefaults.TextFieldDecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z4, function28, function29, function210, function211, textFieldDefaults.getTextFieldShape(composerStartRestartGroup, (i15 >> 9) & 14), textFieldColors2, paddingValues2, composerStartRestartGroup, i16 & 2147483646, i212 | (i222 & 896) | (i222 & 7168) | (i222 & 57344), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function212 = function211;
                                function213 = function210;
                                function214 = function29;
                                function215 = function28;
                            }
                        }
                        final boolean z62 = z4;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i3 & 32) != 0) {
                    }
                    i5 = i3 & 64;
                    if (i5 != 0) {
                    }
                    i6 = i3 & 128;
                    if (i6 != 0) {
                    }
                    i7 = i3 & 256;
                    if (i7 != 0) {
                    }
                    i8 = i3 & 512;
                    if (i8 == 0) {
                    }
                    i9 = i8;
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    }
                    int i1722 = i12;
                    if ((i3 & 8192) == 0) {
                    }
                    if ((306783379 & i4) != 306783378) {
                    }
                    final boolean z622 = z4;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                if ((i3 & 16) == 0) {
                }
                if ((i3 & 32) != 0) {
                }
                i5 = i3 & 64;
                if (i5 != 0) {
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                }
                i8 = i3 & 512;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                if ((i2 & 48) == 0) {
                }
                if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                }
                int i17222 = i12;
                if ((i3 & 8192) == 0) {
                }
                if ((306783379 & i4) != 306783378) {
                }
                final boolean z6222 = z4;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i3 & 8) != 0) {
            }
            if ((i3 & 16) == 0) {
            }
            if ((i3 & 32) != 0) {
            }
            i5 = i3 & 64;
            if (i5 != 0) {
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            i7 = i3 & 256;
            if (i7 != 0) {
            }
            i8 = i3 & 512;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            }
            int i172222 = i12;
            if ((i3 & 8192) == 0) {
            }
            if ((306783379 & i4) != 306783378) {
            }
            final boolean z62222 = z4;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) != 0) {
        }
        i5 = i3 & 64;
        if (i5 != 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        i7 = i3 & 256;
        if (i7 != 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
        }
        int i1722222 = i12;
        if ((i3 & 8192) == 0) {
        }
        if ((306783379 & i4) != 306783378) {
        }
        final boolean z622222 = z4;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012e  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with `shape` parameter.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void OutlinedTextFieldDecorationBox(final String str, final Function2 function2, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z3, Function2 function22, Function2 function23, Function2 function24, Function2 function25, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2 function26, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        final boolean z4;
        int i6;
        Function2 function27;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Function2 function28;
        boolean z5;
        int i15;
        Composer composer2;
        int i16;
        int i17;
        final TextFieldColors textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs;
        int i18;
        TextFieldDefaults textFieldDefaults;
        PaddingValues paddingValuesM2050outlinedTextFieldPaddinga9UjIt4$default;
        final boolean z6;
        final Function2 function29;
        final TextFieldColors textFieldColors2;
        final PaddingValues paddingValues2;
        Function2 function210;
        Function2 function211;
        Function2 function212;
        int i19;
        Composer composer3;
        final Function2 function213;
        final Function2 function214;
        final Function2 function215;
        final Function2 function216;
        final boolean z7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1280721485);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OutlinedTextFieldDecorationBox)P(12,4,3,10,13,5,6,7,9,8,11,1,2)756@34416L25,758@34552L78,773@35068L22,761@34639L549:TextFieldDefaults.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        i4 |= composerStartRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                    }
                    if ((i3 & 32) == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536;
                    }
                    i5 = i3 & 64;
                    if (i5 == 0) {
                        i4 |= 1572864;
                        z4 = z3;
                    } else {
                        z4 = z3;
                        if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
                        }
                    }
                    i6 = i3 & 128;
                    if (i6 == 0) {
                        i4 |= 12582912;
                        function27 = function22;
                    } else {
                        function27 = function22;
                        if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function27) ? 8388608 : 4194304;
                        }
                    }
                    i7 = i3 & 256;
                    if (i7 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i8 = i3 & 512;
                    if (i8 != 0) {
                        if ((i & 805306368) == 0) {
                            i9 = i8;
                            i4 |= composerStartRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                        }
                        i10 = i3 & 1024;
                        if (i10 != 0) {
                            i12 = i2 | 6;
                            i11 = i10;
                        } else if ((i2 & 6) == 0) {
                            i11 = i10;
                            i12 = i2 | (composerStartRestartGroup.changedInstance(function25) ? 4 : 2);
                        } else {
                            i11 = i10;
                            i12 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i12 |= ((i3 & 2048) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 32 : 16;
                        }
                        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                            i12 |= ((i3 & 4096) == 0 && composerStartRestartGroup.changed(paddingValues)) ? 256 : 128;
                        }
                        int i20 = i12;
                        i13 = i3 & 8192;
                        if (i13 != 0) {
                            i14 = i20 | 3072;
                        } else {
                            int i21 = i20;
                            if ((i2 & 3072) == 0) {
                                i21 |= composerStartRestartGroup.changedInstance(function26) ? 2048 : 1024;
                            }
                            i14 = i21;
                        }
                        if ((i3 & 16384) != 0) {
                            i14 |= 24576;
                        } else if ((i2 & 24576) == 0) {
                            i14 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                        }
                        if ((306783379 & i4) == 306783378 && (i14 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            function215 = function23;
                            function214 = function24;
                            function213 = function25;
                            paddingValues2 = paddingValues;
                            function29 = function26;
                            composer3 = composerStartRestartGroup;
                            z7 = z4;
                            function216 = function27;
                            textFieldColors2 = textFieldColors;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                boolean z8 = i5 == 0 ? false : z4;
                                Function2 function217 = i6 == 0 ? null : function27;
                                function28 = i7 == 0 ? null : function23;
                                Function2 function218 = i9 == 0 ? null : function24;
                                Function2 function219 = i11 == 0 ? null : function25;
                                if ((i3 & 2048) == 0) {
                                    int i22 = i14;
                                    i17 = i13;
                                    i15 = i3;
                                    z5 = z8;
                                    i16 = i4;
                                    textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs = m2059outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i14 >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 2097151);
                                    composer2 = composerStartRestartGroup;
                                    i18 = i22 & (-113);
                                } else {
                                    z5 = z8;
                                    int i23 = i14;
                                    i15 = i3;
                                    composer2 = composerStartRestartGroup;
                                    i16 = i4;
                                    i17 = i13;
                                    textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                    i18 = i23;
                                }
                                if ((i15 & 4096) == 0) {
                                    paddingValuesM2050outlinedTextFieldPaddinga9UjIt4$default = m2050outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    textFieldDefaults = this;
                                    i18 &= -897;
                                } else {
                                    textFieldDefaults = this;
                                    paddingValuesM2050outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i17 == 0) {
                                    z6 = z;
                                    z4 = z5;
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1261916269, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i24) {
                                            ComposerKt.sourceInformation(composer4, "C759@34566L54:TextFieldDefaults.kt#jmzs0o");
                                            if ((i24 & 3) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1261916269, i24, -1, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:759)");
                                            }
                                            TextFieldDefaults.INSTANCE.m2053BorderBoxnbWgWpA(z6, z4, interactionSource, textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs, null, 0.0f, 0.0f, composer4, 12582912, OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer2, 54);
                                    textFieldColors2 = textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs;
                                    i14 = i18;
                                    paddingValues2 = paddingValuesM2050outlinedTextFieldPaddinga9UjIt4$default;
                                    function29 = composableLambdaRememberComposableLambda;
                                } else {
                                    z6 = z;
                                    z4 = z5;
                                    function29 = function26;
                                    textFieldColors2 = textFieldColorsM2059outlinedTextFieldColorsdx8h9Zs;
                                    i14 = i18;
                                    paddingValues2 = paddingValuesM2050outlinedTextFieldPaddinga9UjIt4$default;
                                }
                                function210 = function217;
                                function211 = function218;
                                function212 = function219;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 2048) != 0) {
                                    i14 &= -113;
                                }
                                if ((i3 & 4096) != 0) {
                                    i14 &= -897;
                                }
                                function28 = function23;
                                function211 = function24;
                                paddingValues2 = paddingValues;
                                function29 = function26;
                                composer2 = composerStartRestartGroup;
                                i16 = i4;
                                function210 = function27;
                                function212 = function25;
                                textFieldColors2 = textFieldColors;
                                z6 = z;
                                textFieldDefaults = this;
                            }
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                i19 = i16;
                            } else {
                                i19 = i16;
                                ComposerKt.traceEventStart(-1280721485, i19, i14, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:761)");
                            }
                            int i24 = i14 & 14;
                            int i25 = i14 << 3;
                            int i26 = i24 | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (i25 & 458752);
                            Composer composer4 = composer2;
                            boolean z9 = z6;
                            boolean z10 = z4;
                            Function2 function220 = function28;
                            textFieldDefaults.OutlinedTextFieldDecorationBox(str, function2, z9, z2, visualTransformation, interactionSource, z10, function210, function220, function211, function212, textFieldDefaults.getOutlinedTextFieldShape(composer2, (i14 >> 12) & 14), textFieldColors2, paddingValues2, function29, composer4, i19 & 2147483646, i26, 0);
                            composer3 = composer4;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function213 = function212;
                            function214 = function211;
                            function215 = function220;
                            function216 = function210;
                            z7 = z10;
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.4
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

                                public final void invoke(Composer composer5, int i27) {
                                    TextFieldDefaults.this.OutlinedTextFieldDecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z7, function216, function215, function214, function213, textFieldColors2, paddingValues2, function29, composer5, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 805306368;
                    i9 = i8;
                    i10 = i3 & 1024;
                    if (i10 != 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    }
                    int i202 = i12;
                    i13 = i3 & 8192;
                    if (i13 != 0) {
                    }
                    if ((i3 & 16384) != 0) {
                    }
                    if ((306783379 & i4) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if ((i3 & 2048) == 0) {
                            }
                            if ((i15 & 4096) == 0) {
                            }
                            if (i17 == 0) {
                            }
                            function210 = function217;
                            function211 = function218;
                            function212 = function219;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i242 = i14 & 14;
                            int i252 = i14 << 3;
                            int i262 = i242 | (i252 & 896) | (i252 & 7168) | (57344 & i252) | (i252 & 458752);
                            Composer composer42 = composer2;
                            boolean z92 = z6;
                            boolean z102 = z4;
                            Function2 function2202 = function28;
                            textFieldDefaults.OutlinedTextFieldDecorationBox(str, function2, z92, z2, visualTransformation, interactionSource, z102, function210, function2202, function211, function212, textFieldDefaults.getOutlinedTextFieldShape(composer2, (i14 >> 12) & 14), textFieldColors2, paddingValues2, function29, composer42, i19 & 2147483646, i262, 0);
                            composer3 = composer42;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function213 = function212;
                            function214 = function211;
                            function215 = function2202;
                            function216 = function210;
                            z7 = z102;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i3 & 32) == 0) {
                }
                i5 = i3 & 64;
                if (i5 == 0) {
                }
                i6 = i3 & 128;
                if (i6 == 0) {
                }
                i7 = i3 & 256;
                if (i7 == 0) {
                }
                i8 = i3 & 512;
                if (i8 != 0) {
                }
                i9 = i8;
                i10 = i3 & 1024;
                if (i10 != 0) {
                }
                if ((i2 & 48) == 0) {
                }
                if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                }
                int i2022 = i12;
                i13 = i3 & 8192;
                if (i13 != 0) {
                }
                if ((i3 & 16384) != 0) {
                }
                if ((306783379 & i4) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) == 0) {
            }
            i5 = i3 & 64;
            if (i5 == 0) {
            }
            i6 = i3 & 128;
            if (i6 == 0) {
            }
            i7 = i3 & 256;
            if (i7 == 0) {
            }
            i8 = i3 & 512;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            }
            int i20222 = i12;
            i13 = i3 & 8192;
            if (i13 != 0) {
            }
            if ((i3 & 16384) != 0) {
            }
            if ((306783379 & i4) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) == 0) {
        }
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        i7 = i3 & 256;
        if (i7 == 0) {
        }
        i8 = i3 & 512;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
        }
        int i202222 = i12;
        i13 = i3 & 8192;
        if (i13 != 0) {
        }
        if ((i3 & 16384) != 0) {
        }
        if ((306783379 & i4) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m2058indicatorLinegv0btCI(Modifier modifier, final boolean z, final boolean z2, final InteractionSource interactionSource, final TextFieldColors textFieldColors, final float f, final float f2) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("indicatorLine");
                inspectorInfo.getProperties().set(ViewProps.ENABLED, Boolean.valueOf(z));
                inspectorInfo.getProperties().set("isError", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set(PaymentSheetAppearanceKeys.COLORS, textFieldColors);
                inspectorInfo.getProperties().set("focusedIndicatorLineThickness", Dp.m6115boximpl(f));
                inspectorInfo.getProperties().set("unfocusedIndicatorLineThickness", Dp.m6115boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.startReplaceGroup(1398930845);
                ComposerKt.sourceInformation(composer, "C299@11110L217:TextFieldDefaults.kt#jmzs0o");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1398930845, i, -1, "androidx.compose.material.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:299)");
                }
                Modifier modifierDrawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.m2065animateBorderStrokeAsStateNuRrP5Q(z, z2, interactionSource, textFieldColors, f, f2, composer, 0).getValue());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierDrawIndicatorLine;
            }
        });
    }
}
