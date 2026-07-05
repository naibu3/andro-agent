package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextFieldDefaults.kt */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J7\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u001eJS\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#Jî\u0001\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&2\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00150(¢\u0006\u0002\b)2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0015\b\u0002\u0010-\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010(¢\u0006\u0002\b)2\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010(¢\u0006\u0002\b)2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010(¢\u0006\u0002\b)2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010(¢\u0006\u0002\b)2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010(¢\u0006\u0002\b)2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u00102\u001a\u0002032\u0013\b\u0002\u00104\u001a\r\u0012\u0004\u0012\u00020\u00150(¢\u0006\u0002\b)H\u0007¢\u0006\u0002\u00105Jø\u0001\u00106\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&2\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00150(¢\u0006\u0002\b)2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0015\b\u0002\u0010-\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010(¢\u0006\u0002\b)2\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010(¢\u0006\u0002\b)2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010(¢\u0006\u0002\b)2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010(¢\u0006\u0002\b)2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0018\u00010(¢\u0006\u0002\b)2\b\b\u0002\u0010\u001d\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u00102\u001a\u0002032\u0013\b\u0002\u00104\u001a\r\u0012\u0004\u0012\u00020\u00150(¢\u0006\u0002\b)H\u0007¢\u0006\u0002\u00107J\u00ad\u0002\u00108\u001a\u00020\u001c2\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020:2\b\b\u0002\u0010<\u001a\u00020:2\b\b\u0002\u0010=\u001a\u00020:2\b\b\u0002\u0010>\u001a\u00020:2\b\b\u0002\u0010?\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020:2\b\b\u0002\u0010B\u001a\u00020:2\b\b\u0002\u0010C\u001a\u00020:2\b\b\u0002\u0010D\u001a\u00020:2\b\b\u0002\u0010E\u001a\u00020:2\b\b\u0002\u0010F\u001a\u00020:2\b\b\u0002\u0010G\u001a\u00020:2\b\b\u0002\u0010H\u001a\u00020:2\b\b\u0002\u0010I\u001a\u00020:2\b\b\u0002\u0010J\u001a\u00020:2\b\b\u0002\u0010K\u001a\u00020:2\b\b\u0002\u0010L\u001a\u00020:2\b\b\u0002\u0010M\u001a\u00020:2\b\b\u0002\u0010N\u001a\u00020:2\b\b\u0002\u0010O\u001a\u00020:2\b\b\u0002\u0010P\u001a\u00020:2\b\b\u0002\u0010Q\u001a\u00020:2\b\b\u0002\u0010R\u001a\u00020:2\b\b\u0002\u0010S\u001a\u00020:2\b\b\u0002\u0010T\u001a\u00020:2\b\b\u0002\u0010U\u001a\u00020:2\b\b\u0002\u0010V\u001a\u00020:H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bW\u0010XJ=\u0010Y\u001a\u0002032\b\b\u0002\u0010Z\u001a\u00020\u00042\b\b\u0002\u0010[\u001a\u00020\u00042\b\b\u0002\u0010\\\u001a\u00020\u00042\b\b\u0002\u0010]\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b^\u0010_J=\u0010`\u001a\u0002032\b\b\u0002\u0010Z\u001a\u00020\u00042\b\b\u0002\u0010[\u001a\u00020\u00042\b\b\u0002\u0010\\\u001a\u00020\u00042\b\b\u0002\u0010]\u001a\u00020\u0004H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\ba\u0010_J\u00ad\u0002\u0010b\u001a\u00020\u001c2\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020:2\b\b\u0002\u0010<\u001a\u00020:2\b\b\u0002\u0010=\u001a\u00020:2\b\b\u0002\u0010>\u001a\u00020:2\b\b\u0002\u0010?\u001a\u00020@2\b\b\u0002\u0010c\u001a\u00020:2\b\b\u0002\u0010d\u001a\u00020:2\b\b\u0002\u0010e\u001a\u00020:2\b\b\u0002\u0010f\u001a\u00020:2\b\b\u0002\u0010E\u001a\u00020:2\b\b\u0002\u0010F\u001a\u00020:2\b\b\u0002\u0010G\u001a\u00020:2\b\b\u0002\u0010H\u001a\u00020:2\b\b\u0002\u0010I\u001a\u00020:2\b\b\u0002\u0010J\u001a\u00020:2\b\b\u0002\u0010K\u001a\u00020:2\b\b\u0002\u0010L\u001a\u00020:2\b\b\u0002\u0010M\u001a\u00020:2\b\b\u0002\u0010N\u001a\u00020:2\b\b\u0002\u0010O\u001a\u00020:2\b\b\u0002\u0010P\u001a\u00020:2\b\b\u0002\u0010Q\u001a\u00020:2\b\b\u0002\u0010R\u001a\u00020:2\b\b\u0002\u0010S\u001a\u00020:2\b\b\u0002\u0010T\u001a\u00020:2\b\b\u0002\u0010U\u001a\u00020:2\b\b\u0002\u0010V\u001a\u00020:H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bg\u0010XJ=\u0010h\u001a\u0002032\b\b\u0002\u0010Z\u001a\u00020\u00042\b\b\u0002\u0010\\\u001a\u00020\u00042\b\b\u0002\u0010[\u001a\u00020\u00042\b\b\u0002\u0010]\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bi\u0010_J=\u0010j\u001a\u0002032\b\b\u0002\u0010Z\u001a\u00020\u00042\b\b\u0002\u0010[\u001a\u00020\u00042\b\b\u0002\u0010\\\u001a\u00020\u00042\b\b\u0002\u0010]\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bk\u0010_JM\u0010l\u001a\u00020m*\u00020m2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010n\u001a\u00020\u00042\b\b\u0002\u0010o\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bp\u0010qR\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0011\u0010\u000e\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006r"}, d2 = {"Landroidx/compose/material3/TextFieldDefaults;", "", "()V", "FocusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "getFocusedBorderThickness-D9Ej5fM", "()F", "F", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "filledShape", "Landroidx/compose/ui/graphics/Shape;", "getFilledShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "outlinedShape", "getOutlinedShape", "FilledContainerBox", "", ViewProps.ENABLED, "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", PaymentSheetAppearanceKeys.COLORS, "Landroidx/compose/material3/TextFieldColors;", "shape", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "OutlinedBorderContainerBox", "focusedBorderThickness", "unfocusedBorderThickness", "OutlinedBorderContainerBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "OutlinedTextFieldDecorationBox", "value", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", ReactTextInputShadowNode.PROP_PLACEHOLDER, "leadingIcon", "trailingIcon", "supportingText", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "container", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "TextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "outlinedTextFieldColors", Common.TEXT_COLOR, "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", "containerColor", "cursorColor", "errorCursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "outlinedTextFieldColors-l59Burw", "(JJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material3/TextFieldColors;", "outlinedTextFieldPadding", ViewProps.START, "top", ViewProps.END, "bottom", "outlinedTextFieldPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "supportingTextPadding", "supportingTextPadding-a9UjIt4$material3_release", "textFieldColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "textFieldColors-l59Burw", "textFieldWithLabelPadding", "textFieldWithLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "indicatorLine", "Landroidx/compose/ui/Modifier;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "material3_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldDefaults {
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m6117constructorimpl(56);
    private static final float MinWidth = Dp.m6117constructorimpl(280);
    private static final float UnfocusedBorderThickness = Dp.m6117constructorimpl(1);
    private static final float FocusedBorderThickness = Dp.m6117constructorimpl(2);

    private TextFieldDefaults() {
    }

    public final Shape getOutlinedShape(Composer composer, int i) {
        composer.startReplaceableGroup(-584749279);
        ComposerKt.sourceInformation(composer, "C59@2665L9:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-584749279, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-outlinedShape> (TextFieldDefaults.kt:59)");
        }
        Shape shape = ShapesKt.toShape(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    public final Shape getFilledShape(Composer composer, int i) {
        composer.startReplaceableGroup(611926497);
        ComposerKt.sourceInformation(composer, "C62@2810L9:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611926497, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-filledShape> (TextFieldDefaults.kt:62)");
        }
        Shape shape = ShapesKt.toShape(FilledTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m2505getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m2506getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2507getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2504getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0136 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0137  */
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void FilledContainerBox(final boolean z, final boolean z2, final InteractionSource interactionSource, final TextFieldColors colors, Shape shape, Composer composer, final int i, final int i2) {
        int i3;
        Shape filledShape;
        int i4;
        final Shape shape2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1358797526);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(FilledContainerBox)P(1,3,2)107@4524L11,111@4614L16,109@4553L168:TextFieldDefaults.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(interactionSource) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(colors) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0) {
                filledShape = shape;
                int i5 = composerStartRestartGroup.changed(filledShape) ? 16384 : 8192;
                i3 |= i5;
            } else {
                filledShape = shape;
            }
            i3 |= i5;
        } else {
            filledShape = shape;
        }
        if ((i2 & 32) == 0) {
            if ((458752 & i) == 0) {
                i4 = composerStartRestartGroup.changed(this) ? 131072 : 65536;
            }
            if ((374491 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    Shape shape3 = filledShape;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    BoxKt.Box(m2498indicatorLinegv0btCI$default(this, BackgroundKt.m574backgroundbw27NRU(Modifier.INSTANCE, colors.containerColor$material3_release(composerStartRestartGroup, (i3 >> 9) & 14).getValue().m3667unboximpl(), shape3), z, z2, interactionSource, colors, 0.0f, 0.0f, 48, null), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    shape2 = shape3;
                } else {
                    if ((i2 & 16) != 0) {
                        filledShape = getFilledShape(composerStartRestartGroup, (i3 >> 15) & 14);
                        i3 &= -57345;
                    }
                    Shape shape32 = filledShape;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1358797526, i3, -1, "androidx.compose.material3.TextFieldDefaults.FilledContainerBox (TextFieldDefaults.kt:102)");
                    }
                    BoxKt.Box(m2498indicatorLinegv0btCI$default(this, BackgroundKt.m574backgroundbw27NRU(Modifier.INSTANCE, colors.containerColor$material3_release(composerStartRestartGroup, (i3 >> 9) & 14).getValue().m3667unboximpl(), shape32), z, z2, interactionSource, colors, 0.0f, 0.0f, 48, null), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape2 = shape32;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                shape2 = filledShape;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults.FilledContainerBox.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    TextFieldDefaults.this.FilledContainerBox(z, z2, interactionSource, colors, shape2, composer2, i | 1, i2);
                }
            });
            return;
        }
        i4 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i3 |= i4;
        if ((374491 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if ((i2 & 16) != 0) {
                }
                Shape shape322 = filledShape;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                BoxKt.Box(m2498indicatorLinegv0btCI$default(this, BackgroundKt.m574backgroundbw27NRU(Modifier.INSTANCE, colors.containerColor$material3_release(composerStartRestartGroup, (i3 >> 9) & 14).getValue().m3667unboximpl(), shape322), z, z2, interactionSource, colors, 0.0f, 0.0f, 48, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                shape2 = shape322;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* renamed from: indicatorLine-gv0btCI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2498indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, float f, float f2, int i, Object obj) {
        if ((i & 16) != 0) {
            f = FocusedBorderThickness;
        }
        return textFieldDefaults.m2508indicatorLinegv0btCI(modifier, z, z2, interactionSource, textFieldColors, f, (i & 32) != 0 ? UnfocusedBorderThickness : f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0115  */
    @ExperimentalMaterial3Api
    /* renamed from: OutlinedBorderContainerBox-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2503OutlinedBorderContainerBoxnbWgWpA(final boolean z, final boolean z2, final InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f, float f2, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        Shape shape2;
        float f3;
        float f4;
        TextFieldDefaults textFieldDefaults;
        Shape shape3;
        float f5;
        int i4;
        float f6;
        float f7;
        final float f8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final TextFieldColors colors = textFieldColors;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1998946250);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OutlinedBorderContainerBox)P(1,4,3!1,5,2:c#ui.unit.Dp,6:c#ui.unit.Dp)180@7782L9,184@7953L203,195@8277L16,192@8165L143:TextFieldDefaults.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else if ((i & 14) == 0) {
            z3 = z;
            i3 = (composerStartRestartGroup.changed(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else if ((i & 896) == 0) {
                i3 |= composerStartRestartGroup.changed(interactionSource) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= composerStartRestartGroup.changed(colors) ? 2048 : 1024;
            }
            if ((i & 57344) != 0) {
                if ((i2 & 16) == 0) {
                    shape2 = shape;
                    int i5 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                    i3 |= i5;
                } else {
                    shape2 = shape;
                }
                i3 |= i5;
            } else {
                shape2 = shape;
            }
            if ((i & 458752) != 0) {
                if ((i2 & 32) == 0) {
                    f3 = f;
                    int i6 = composerStartRestartGroup.changed(f3) ? 131072 : 65536;
                    i3 |= i6;
                } else {
                    f3 = f;
                }
                i3 |= i6;
            } else {
                f3 = f;
            }
            if ((3670016 & i) != 0) {
                if ((i2 & 64) == 0) {
                    f4 = f2;
                    int i7 = composerStartRestartGroup.changed(f4) ? 1048576 : 524288;
                    i3 |= i7;
                } else {
                    f4 = f2;
                }
                i3 |= i7;
            } else {
                f4 = f2;
            }
            if ((i2 & 128) != 0) {
                if ((29360128 & i) == 0) {
                    textFieldDefaults = this;
                    i3 |= composerStartRestartGroup.changed(textFieldDefaults) ? 8388608 : 4194304;
                }
                if ((23967451 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if ((i2 & 16) == 0) {
                            shape3 = ShapesKt.toShape(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i2 & 32) == 0) {
                            f5 = FocusedBorderThickness;
                            i3 &= -458753;
                        } else {
                            f5 = f3;
                        }
                        if ((i2 & 64) == 0) {
                            f6 = f5;
                            f7 = UnfocusedBorderThickness;
                            i4 = i3 & (-3670017);
                        } else {
                            i4 = i3;
                            f6 = f5;
                            f7 = f4;
                        }
                        shape2 = shape3;
                    } else {
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
                        f6 = f3;
                        f7 = f4;
                        i4 = i3;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1998946250, i4, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedBorderContainerBox (TextFieldDefaults.kt:175)");
                    }
                    int i8 = i4 >> 3;
                    State stateM2516animateBorderStrokeAsStateNuRrP5Q = TextFieldDefaultsKt.m2516animateBorderStrokeAsStateNuRrP5Q(z3, z2, interactionSource, textFieldColors, f6, f7, composerStartRestartGroup, (i4 & 8190) | (i8 & 57344) | (i8 & 458752));
                    f4 = f7;
                    colors = textFieldColors;
                    BoxKt.Box(BackgroundKt.m574backgroundbw27NRU(BorderKt.border(Modifier.INSTANCE, (BorderStroke) stateM2516animateBorderStrokeAsStateNuRrP5Q.getValue(), shape2), colors.containerColor$material3_release(composerStartRestartGroup, (i4 >> 9) & 14).getValue().m3667unboximpl(), shape2), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f8 = f6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    f8 = f3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final Shape shape4 = shape2;
                final float f9 = f4;
                final TextFieldDefaults textFieldDefaults2 = textFieldDefaults;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults$OutlinedBorderContainerBox$1
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
                        this.$tmp0_rcvr.m2503OutlinedBorderContainerBoxnbWgWpA(z, z2, interactionSource, colors, shape4, f8, f9, composer2, i | 1, i2);
                    }
                });
                return;
            }
            i3 |= 12582912;
            textFieldDefaults = this;
            if ((23967451 & i3) != 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if ((i2 & 16) == 0) {
                    }
                    if ((i2 & 32) == 0) {
                    }
                    if ((i2 & 64) == 0) {
                    }
                    shape2 = shape3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i82 = i4 >> 3;
                    State stateM2516animateBorderStrokeAsStateNuRrP5Q2 = TextFieldDefaultsKt.m2516animateBorderStrokeAsStateNuRrP5Q(z3, z2, interactionSource, textFieldColors, f6, f7, composerStartRestartGroup, (i4 & 8190) | (i82 & 57344) | (i82 & 458752));
                    f4 = f7;
                    colors = textFieldColors;
                    BoxKt.Box(BackgroundKt.m574backgroundbw27NRU(BorderKt.border(Modifier.INSTANCE, (BorderStroke) stateM2516animateBorderStrokeAsStateNuRrP5Q2.getValue(), shape2), colors.containerColor$material3_release(composerStartRestartGroup, (i4 >> 9) & 14).getValue().m3667unboximpl(), shape2), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f8 = f6;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i & 57344) != 0) {
        }
        if ((i & 458752) != 0) {
        }
        if ((3670016 & i) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        textFieldDefaults = this;
        if ((23967451 & i3) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2501textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
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
        return textFieldDefaults.m2513textFieldWithLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    @ExperimentalMaterial3Api
    /* renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2513textFieldWithLabelPaddinga9UjIt4(float start, float end, float top, float bottom) {
        return PaddingKt.m1016PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2502textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
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
        return textFieldDefaults.m2514textFieldWithoutLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    @ExperimentalMaterial3Api
    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2514textFieldWithoutLabelPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m1016PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2499outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
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
        return textFieldDefaults.m2510outlinedTextFieldPaddinga9UjIt4(f, f2, f3, f4);
    }

    @ExperimentalMaterial3Api
    /* renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2510outlinedTextFieldPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m1016PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3_release$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2500supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getSupportingTopPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = Dp.m6117constructorimpl(0);
        }
        return textFieldDefaults.m2511supportingTextPaddinga9UjIt4$material3_release(f, f2, f3, f4);
    }

    @ExperimentalMaterial3Api
    /* renamed from: supportingTextPadding-a9UjIt4$material3_release, reason: not valid java name */
    public final PaddingValues m2511supportingTextPaddinga9UjIt4$material3_release(float start, float top, float end, float bottom) {
        return PaddingKt.m1016PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    @ExperimentalMaterial3Api
    /* renamed from: textFieldColors-l59Burw, reason: not valid java name */
    public final TextFieldColors m2512textFieldColorsl59Burw(long j, long j2, long j3, long j4, long j5, TextSelectionColors textSelectionColors, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, Composer composer, int i, int i2, int i3, int i4) {
        TextSelectionColors textSelectionColors2;
        composer.startReplaceableGroup(-128842621);
        ComposerKt.sourceInformation(composer, "C(textFieldColors)P(22:c#ui.graphics.Color,7:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,9:c#ui.graphics.Color,21,15:c#ui.graphics.Color,23:c#ui.graphics.Color,2:c#ui.graphics.Color,10:c#ui.graphics.Color,17:c#ui.graphics.Color,25:c#ui.graphics.Color,4:c#ui.graphics.Color,12:c#ui.graphics.Color,19:c#ui.graphics.Color,27:c#ui.graphics.Color,8:c#ui.graphics.Color,14:c#ui.graphics.Color,16:c#ui.graphics.Color,24:c#ui.graphics.Color,3:c#ui.graphics.Color,11:c#ui.graphics.Color,20:c#ui.graphics.Color,5:c#ui.graphics.Color,18:c#ui.graphics.Color,26:c#ui.graphics.Color,6:c#ui.graphics.Color,13:c#ui.graphics.Color)293@13317L9,294@13404L9,296@13554L9,297@13627L9,298@13715L9,299@13798L7,300@13894L9,301@13989L9,302@14091L9,304@14267L9,305@14363L9,306@14456L9,307@14556L9,309@14726L9,310@14824L9,311@14919L9,312@15021L9,314@15194L9,315@15278L9,316@15359L9,317@15447L9,319@15599L9,320@15688L9,321@15782L9,323@15950L9,324@16045L9,325@16147L9,327@16318L9:TextFieldDefaults.kt#uh7d8r");
        long color = (i4 & 1) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j;
        long jM3656copywmQWz5c$default = (i4 & 2) != 0 ? Color.m3656copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long color2 = (i4 & 4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getContainerColor(), composer, 6) : j3;
        long color3 = (i4 & 8) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j4;
        long color4 = (i4 & 16) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j5;
        if ((i4 & 32) != 0) {
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localTextSelectionColors);
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) objConsume;
        } else {
            textSelectionColors2 = textSelectionColors;
        }
        long color5 = (i4 & 64) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor(), composer, 6) : j6;
        long color6 = (i4 & 128) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor(), composer, 6) : j7;
        long jM3656copywmQWz5c$default2 = (i4 & 256) != 0 ? Color.m3656copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long color7 = (i4 & 512) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor(), composer, 6) : j9;
        long color8 = (i4 & 1024) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j10;
        long color9 = (i4 & 2048) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j11;
        long jM3656copywmQWz5c$default3 = (i4 & 4096) != 0 ? Color.m3656copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long color10 = (i4 & 8192) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j13;
        long color11 = (i4 & 16384) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j14;
        long color12 = (32768 & i4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j15;
        long jM3656copywmQWz5c$default4 = (65536 & i4) != 0 ? Color.m3656copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long color13 = (131072 & i4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j17;
        long color14 = (262144 & i4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j18;
        long color15 = (524288 & i4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j19;
        long jM3656copywmQWz5c$default5 = (1048576 & i4) != 0 ? Color.m3656copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long color16 = (2097152 & i4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j21;
        long color17 = (4194304 & i4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j22;
        long jM3656copywmQWz5c$default6 = (8388608 & i4) != 0 ? Color.m3656copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long color18 = (16777216 & i4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j24;
        long color19 = (33554432 & i4) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j25;
        long jM3656copywmQWz5c$default7 = (67108864 & i4) != 0 ? Color.m3656copywmQWz5c$default(ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long color20 = (i4 & 134217728) != 0 ? ColorSchemeKt.toColor(FilledTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j27;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-128842621, i, i2, "androidx.compose.material3.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:292)");
        }
        TextFieldColors textFieldColors = new TextFieldColors(color, jM3656copywmQWz5c$default, color2, color3, color4, textSelectionColors2, color5, color6, color7, jM3656copywmQWz5c$default2, color8, color9, jM3656copywmQWz5c$default3, color10, color11, color12, jM3656copywmQWz5c$default4, color13, color14, color15, jM3656copywmQWz5c$default5, color16, color17, jM3656copywmQWz5c$default6, color18, color19, jM3656copywmQWz5c$default7, color20, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColors;
    }

    @ExperimentalMaterial3Api
    /* renamed from: outlinedTextFieldColors-l59Burw, reason: not valid java name */
    public final TextFieldColors m2509outlinedTextFieldColorsl59Burw(long j, long j2, long j3, long j4, long j5, TextSelectionColors textSelectionColors, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, Composer composer, int i, int i2, int i3, int i4) {
        TextSelectionColors textSelectionColors2;
        composer.startReplaceableGroup(-1654658683);
        ComposerKt.sourceInformation(composer, "C(outlinedTextFieldColors)P(22:c#ui.graphics.Color,7:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,10:c#ui.graphics.Color,21,15:c#ui.graphics.Color,23:c#ui.graphics.Color,2:c#ui.graphics.Color,9:c#ui.graphics.Color,17:c#ui.graphics.Color,25:c#ui.graphics.Color,4:c#ui.graphics.Color,12:c#ui.graphics.Color,19:c#ui.graphics.Color,27:c#ui.graphics.Color,8:c#ui.graphics.Color,14:c#ui.graphics.Color,16:c#ui.graphics.Color,24:c#ui.graphics.Color,3:c#ui.graphics.Color,11:c#ui.graphics.Color,20:c#ui.graphics.Color,5:c#ui.graphics.Color,18:c#ui.graphics.Color,26:c#ui.graphics.Color,6:c#ui.graphics.Color,13:c#ui.graphics.Color)400@20949L9,401@21038L9,404@21236L9,405@21326L9,406@21409L7,407@21496L9,408@21582L9,409@21675L9,411@21836L9,412@21934L9,413@22029L9,414@22131L9,416@22305L9,417@22405L9,418@22502L9,420@22619L9,421@22783L9,422@22869L9,423@22952L9,424@23042L9,426@23198L9,427@23289L9,428@23385L9,430@23557L9,431@23654L9,433@23771L9,434@23933L9:TextFieldDefaults.kt#uh7d8r");
        long color = (i4 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j;
        long jM3656copywmQWz5c$default = (i4 & 2) != 0 ? Color.m3656copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM3692getTransparent0d7_KjU = (i4 & 4) != 0 ? Color.INSTANCE.m3692getTransparent0d7_KjU() : j3;
        long color2 = (i4 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j4;
        long color3 = (i4 & 16) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j5;
        if ((i4 & 32) != 0) {
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localTextSelectionColors);
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) objConsume;
        } else {
            textSelectionColors2 = textSelectionColors;
        }
        long color4 = (i4 & 64) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor(), composer, 6) : j6;
        long color5 = (i4 & 128) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getOutlineColor(), composer, 6) : j7;
        long jM3656copywmQWz5c$default2 = (i4 & 256) != 0 ? Color.m3656copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long color6 = (i4 & 512) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor(), composer, 6) : j9;
        long color7 = (i4 & 1024) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j10;
        long color8 = (i4 & 2048) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j11;
        long jM3656copywmQWz5c$default3 = (i4 & 4096) != 0 ? Color.m3656copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long color9 = (i4 & 8192) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j13;
        long color10 = (i4 & 16384) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j14;
        long color11 = (32768 & i4) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j15;
        long jM3656copywmQWz5c$default4 = (65536 & i4) != 0 ? Color.m3656copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long color12 = (131072 & i4) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j17;
        long color13 = (262144 & i4) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j18;
        long color14 = (524288 & i4) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j19;
        long jM3656copywmQWz5c$default5 = (1048576 & i4) != 0 ? Color.m3656copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long color15 = (2097152 & i4) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j21;
        long color16 = (4194304 & i4) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j22;
        long jM3656copywmQWz5c$default6 = (8388608 & i4) != 0 ? Color.m3656copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j23;
        long color17 = (16777216 & i4) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j24;
        long color18 = (33554432 & i4) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j25;
        long jM3656copywmQWz5c$default7 = (67108864 & i4) != 0 ? Color.m3656copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long color19 = (i4 & 134217728) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j27;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1654658683, i, i2, "androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:399)");
        }
        TextFieldColors textFieldColors = new TextFieldColors(color, jM3656copywmQWz5c$default, jM3692getTransparent0d7_KjU, color2, color3, textSelectionColors2, color4, color5, color6, jM3656copywmQWz5c$default2, color7, color8, jM3656copywmQWz5c$default3, color9, color10, color11, jM3656copywmQWz5c$default4, color12, color13, color14, jM3656copywmQWz5c$default5, color15, color16, jM3656copywmQWz5c$default6, color17, color18, jM3656copywmQWz5c$default7, color19, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x048f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014d  */
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void TextFieldDecorationBox(final String value, final Function2<? super Composer, ? super Integer, Unit> innerTextField, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function26, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        boolean z4;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Shape filledShape;
        Shape shape2;
        Composer composer2;
        TextFieldColors textFieldColorsM2512textFieldColorsl59Burw;
        PaddingValues paddingValuesM2501textFieldWithLabelPaddinga9UjIt4$default;
        Shape shape3;
        TextFieldColors textFieldColors2;
        int i19;
        Function2<? super Composer, ? super Integer, Unit> function2ComposableLambda;
        PaddingValues paddingValues2;
        Shape shape4;
        TextFieldColors textFieldColors3;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Function2<? super Composer, ? super Integer, Unit> function212;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        final Function2<? super Composer, ? super Integer, Unit> function216;
        Composer composer3;
        final PaddingValues paddingValues3;
        final TextFieldColors textFieldColors4;
        final Shape shape5;
        final Function2<? super Composer, ? super Integer, Unit> function217;
        final boolean z5;
        final Function2<? super Composer, ? super Integer, Unit> function218;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i20;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1224712461);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TextFieldDecorationBox)P(14,4,3,11,15,5,6,7,9,8,13,12,10!1,2)540@30577L11,541@30624L17,552@30998L649:TextFieldDefaults.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i4 |= composerStartRestartGroup.changed(innerTextField) ? 32 : 16;
        }
        int i21 = 128;
        if ((i3 & 4) != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i & 896) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 57344) == 0) {
                    i4 |= composerStartRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else {
                    if ((i & 458752) == 0) {
                        i5 = composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536;
                    }
                    i6 = i3 & 64;
                    if (i6 == 0) {
                        i4 |= 1572864;
                        z4 = z3;
                    } else {
                        z4 = z3;
                        if ((i & 3670016) == 0) {
                            i4 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
                        }
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                        function27 = function2;
                    } else {
                        function27 = function2;
                        if ((i & 29360128) == 0) {
                            i4 |= composerStartRestartGroup.changed(function27) ? 8388608 : 4194304;
                        }
                    }
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i4 |= composerStartRestartGroup.changed(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i9 = i3 & 512;
                    if (i9 == 0) {
                        i10 = i9;
                        i11 = i4 | 805306368;
                    } else {
                        if ((i & 1879048192) == 0) {
                            i10 = i9;
                            i4 |= composerStartRestartGroup.changed(function23) ? 536870912 : 268435456;
                        } else {
                            i10 = i9;
                        }
                        i11 = i4;
                    }
                    i12 = i3 & 1024;
                    if (i12 == 0) {
                        i13 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        i13 = i2 | (composerStartRestartGroup.changed(function24) ? 4 : 2);
                    } else {
                        i13 = i2;
                    }
                    i14 = i3 & 2048;
                    if (i14 == 0) {
                        i13 |= 48;
                    } else {
                        if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                            i15 = i14;
                            i13 |= composerStartRestartGroup.changed(function25) ? 32 : 16;
                        }
                        if ((i2 & 896) == 0) {
                            if ((i3 & 4096) == 0 && composerStartRestartGroup.changed(shape)) {
                                i21 = 256;
                            }
                            i13 |= i21;
                        }
                        if ((i2 & 7168) == 0) {
                            i13 |= ((i3 & 8192) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 2048 : 1024;
                        }
                        if ((i2 & 57344) == 0) {
                            i13 |= ((i3 & 16384) == 0 && composerStartRestartGroup.changed(paddingValues)) ? 16384 : 8192;
                        }
                        i16 = i3 & 32768;
                        if (i16 != 0) {
                            i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i2 & 458752) == 0) {
                            i13 |= composerStartRestartGroup.changed(function26) ? 131072 : 65536;
                        }
                        if ((i3 & 65536) == 0) {
                            i20 = (i2 & 3670016) == 0 ? composerStartRestartGroup.changed(this) ? 1048576 : 524288 : 1572864;
                            i17 = i13;
                            if ((i11 & 1533916891) == 306783378 || (2995931 & i17) != 599186 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    boolean z6 = i6 == 0 ? false : z4;
                                    Function2<? super Composer, ? super Integer, Unit> function219 = i7 == 0 ? null : function27;
                                    Function2<? super Composer, ? super Integer, Unit> function220 = i8 == 0 ? null : function22;
                                    Function2<? super Composer, ? super Integer, Unit> function221 = i10 == 0 ? null : function23;
                                    Function2<? super Composer, ? super Integer, Unit> function222 = i12 == 0 ? null : function24;
                                    Function2<? super Composer, ? super Integer, Unit> function223 = i15 == 0 ? null : function25;
                                    if ((i3 & 4096) == 0) {
                                        i18 = i17 & (-897);
                                        filledShape = getFilledShape(composerStartRestartGroup, (i17 >> 18) & 14);
                                    } else {
                                        i18 = i17;
                                        filledShape = shape;
                                    }
                                    if ((i3 & 8192) == 0) {
                                        int i22 = i18;
                                        shape2 = filledShape;
                                        textFieldColorsM2512textFieldColorsl59Burw = m2512textFieldColorsl59Burw(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i18 << 6) & 234881024, 268435455);
                                        composer2 = composerStartRestartGroup;
                                        i17 = i22 & (-7169);
                                    } else {
                                        shape2 = filledShape;
                                        i17 = i18;
                                        composer2 = composerStartRestartGroup;
                                        textFieldColorsM2512textFieldColorsl59Burw = textFieldColors;
                                    }
                                    if ((i3 & 16384) == 0) {
                                        if (function219 == null) {
                                            paddingValuesM2501textFieldWithLabelPaddinga9UjIt4$default = m2502textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        } else {
                                            paddingValuesM2501textFieldWithLabelPaddinga9UjIt4$default = m2501textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        }
                                        i17 &= -57345;
                                    } else {
                                        paddingValuesM2501textFieldWithLabelPaddinga9UjIt4$default = paddingValues;
                                    }
                                    if (i16 == 0) {
                                        final Shape shape6 = shape2;
                                        final int i23 = i17;
                                        final TextFieldColors textFieldColors5 = textFieldColorsM2512textFieldColorsl59Burw;
                                        final int i24 = i11;
                                        final boolean z7 = z6;
                                        z4 = z7;
                                        textFieldColors2 = textFieldColors5;
                                        shape3 = shape6;
                                        i19 = i24;
                                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composer2, -1171460386, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i25) {
                                                ComposerKt.sourceInformation(composer4, "C549@30901L70:TextFieldDefaults.kt#uh7d8r");
                                                if ((i25 & 11) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1171460386, i25, -1, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:548)");
                                                }
                                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                boolean z8 = z;
                                                boolean z9 = z7;
                                                InteractionSource interactionSource2 = interactionSource;
                                                TextFieldColors textFieldColors6 = textFieldColors5;
                                                Shape shape7 = shape6;
                                                int i26 = i24;
                                                int i27 = ((i26 >> 9) & 896) | ((i26 >> 6) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i26 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                                                int i28 = i23;
                                                textFieldDefaults.FilledContainerBox(z8, z9, interactionSource2, textFieldColors6, shape7, composer4, i27 | (i28 & 7168) | ((i28 << 6) & 57344), 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        });
                                    } else {
                                        shape3 = shape2;
                                        textFieldColors2 = textFieldColorsM2512textFieldColorsl59Burw;
                                        i19 = i11;
                                        z4 = z6;
                                        function2ComposableLambda = function26;
                                    }
                                    paddingValues2 = paddingValuesM2501textFieldWithLabelPaddinga9UjIt4$default;
                                    shape4 = shape3;
                                    textFieldColors3 = textFieldColors2;
                                    function28 = function219;
                                    function29 = function220;
                                    function210 = function221;
                                    function211 = function222;
                                    function212 = function223;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 4096) != 0) {
                                        i17 &= -897;
                                    }
                                    if ((i3 & 8192) != 0) {
                                        i17 &= -7169;
                                    }
                                    if ((i3 & 16384) != 0) {
                                        i17 &= -57345;
                                    }
                                    function29 = function22;
                                    function210 = function23;
                                    shape4 = shape;
                                    paddingValues2 = paddingValues;
                                    function2ComposableLambda = function26;
                                    composer2 = composerStartRestartGroup;
                                    function28 = function27;
                                    i19 = i11;
                                    function211 = function24;
                                    function212 = function25;
                                    textFieldColors3 = textFieldColors;
                                }
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1224712461, i19, i17, "androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:527)");
                                }
                                int i25 = i17;
                                int i26 = i19 << 3;
                                int i27 = i19 >> 9;
                                int i28 = i25 << 21;
                                Composer composer4 = composer2;
                                TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function28, function29, function210, function211, function212, z2, z, z4, interactionSource, paddingValues2, textFieldColors3, function2ComposableLambda, composer4, (i26 & 896) | (i26 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6 | ((i19 >> 3) & 7168) | (i27 & 57344) | (i27 & 458752) | (i27 & 3670016) | (i28 & 29360128) | (i28 & 234881024) | ((i19 << 18) & 1879048192), ((i19 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i19 >> 6) & 14) | (i27 & 896) | ((i25 >> 3) & 7168) | ((i25 << 3) & 57344) | (i25 & 458752), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function213 = function28;
                                function214 = function29;
                                function215 = function211;
                                function216 = function2ComposableLambda;
                                composer3 = composer4;
                                paddingValues3 = paddingValues2;
                                textFieldColors4 = textFieldColors3;
                                shape5 = shape4;
                                function217 = function212;
                                z5 = z4;
                                function218 = function210;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                function214 = function22;
                                function215 = function24;
                                function217 = function25;
                                textFieldColors4 = textFieldColors;
                                paddingValues3 = paddingValues;
                                function216 = function26;
                                composer3 = composerStartRestartGroup;
                                z5 = z4;
                                function213 = function27;
                                function218 = function23;
                                shape5 = shape;
                            }
                            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults.TextFieldDecorationBox.2
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

                                public final void invoke(Composer composer5, int i29) {
                                    TextFieldDefaults.this.TextFieldDecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z5, function213, function214, function218, function215, function217, shape5, textFieldColors4, paddingValues3, function216, composer5, i | 1, i2, i3);
                                }
                            });
                            return;
                        }
                        i13 |= i20;
                        i17 = i13;
                        if ((i11 & 1533916891) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i6 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if ((i3 & 4096) == 0) {
                                }
                                if ((i3 & 8192) == 0) {
                                }
                                if ((i3 & 16384) == 0) {
                                }
                                if (i16 == 0) {
                                }
                                paddingValues2 = paddingValuesM2501textFieldWithLabelPaddinga9UjIt4$default;
                                shape4 = shape3;
                                textFieldColors3 = textFieldColors2;
                                function28 = function219;
                                function29 = function220;
                                function210 = function221;
                                function211 = function222;
                                function212 = function223;
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i252 = i17;
                                int i262 = i19 << 3;
                                int i272 = i19 >> 9;
                                int i282 = i252 << 21;
                                Composer composer42 = composer2;
                                TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function28, function29, function210, function211, function212, z2, z, z4, interactionSource, paddingValues2, textFieldColors3, function2ComposableLambda, composer42, (i262 & 896) | (i262 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6 | ((i19 >> 3) & 7168) | (i272 & 57344) | (i272 & 458752) | (i272 & 3670016) | (i282 & 29360128) | (i282 & 234881024) | ((i19 << 18) & 1879048192), ((i19 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i19 >> 6) & 14) | (i272 & 896) | ((i252 >> 3) & 7168) | ((i252 << 3) & 57344) | (i252 & 458752), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function213 = function28;
                                function214 = function29;
                                function215 = function211;
                                function216 = function2ComposableLambda;
                                composer3 = composer42;
                                paddingValues3 = paddingValues2;
                                textFieldColors4 = textFieldColors3;
                                shape5 = shape4;
                                function217 = function212;
                                z5 = z4;
                                function218 = function210;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i15 = i14;
                    if ((i2 & 896) == 0) {
                    }
                    if ((i2 & 7168) == 0) {
                    }
                    if ((i2 & 57344) == 0) {
                    }
                    i16 = i3 & 32768;
                    if (i16 != 0) {
                    }
                    if ((i3 & 65536) == 0) {
                    }
                    i13 |= i20;
                    i17 = i13;
                    if ((i11 & 1533916891) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i4 |= i5;
                i6 = i3 & 64;
                if (i6 == 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                i9 = i3 & 512;
                if (i9 == 0) {
                }
                i12 = i3 & 1024;
                if (i12 == 0) {
                }
                i14 = i3 & 2048;
                if (i14 == 0) {
                }
                i15 = i14;
                if ((i2 & 896) == 0) {
                }
                if ((i2 & 7168) == 0) {
                }
                if ((i2 & 57344) == 0) {
                }
                i16 = i3 & 32768;
                if (i16 != 0) {
                }
                if ((i3 & 65536) == 0) {
                }
                i13 |= i20;
                i17 = i13;
                if ((i11 & 1533916891) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            i4 |= i5;
            i6 = i3 & 64;
            if (i6 == 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            i9 = i3 & 512;
            if (i9 == 0) {
            }
            i12 = i3 & 1024;
            if (i12 == 0) {
            }
            i14 = i3 & 2048;
            if (i14 == 0) {
            }
            i15 = i14;
            if ((i2 & 896) == 0) {
            }
            if ((i2 & 7168) == 0) {
            }
            if ((i2 & 57344) == 0) {
            }
            i16 = i3 & 32768;
            if (i16 != 0) {
            }
            if ((i3 & 65536) == 0) {
            }
            i13 |= i20;
            i17 = i13;
            if ((i11 & 1533916891) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        i4 |= i5;
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i12 = i3 & 1024;
        if (i12 == 0) {
        }
        i14 = i3 & 2048;
        if (i14 == 0) {
        }
        i15 = i14;
        if ((i2 & 896) == 0) {
        }
        if ((i2 & 7168) == 0) {
        }
        if ((i2 & 57344) == 0) {
        }
        i16 = i3 & 32768;
        if (i16 != 0) {
        }
        if ((i3 & 65536) == 0) {
        }
        i13 |= i20;
        i17 = i13;
        if ((i11 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0438 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0141  */
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OutlinedTextFieldDecorationBox(final String value, final Function2<? super Composer, ? super Integer, Unit> innerTextField, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function26, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        boolean z4;
        int i5;
        int i6;
        boolean z5;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Composer composer2;
        int i19;
        int i20;
        TextFieldColors textFieldColorsM2509outlinedTextFieldColorsl59Burw;
        PaddingValues paddingValuesM2499outlinedTextFieldPaddinga9UjIt4$default;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Composer composer3;
        int i21;
        PaddingValues paddingValues2;
        Function2<? super Composer, ? super Integer, Unit> function213;
        boolean z6;
        final TextFieldColors textFieldColors2;
        Function2<? super Composer, ? super Integer, Unit> function214;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        final Function2<? super Composer, ? super Integer, Unit> function216;
        final Function2<? super Composer, ? super Integer, Unit> function217;
        Composer composer4;
        final Function2<? super Composer, ? super Integer, Unit> function218;
        final PaddingValues paddingValues3;
        final Function2<? super Composer, ? super Integer, Unit> function219;
        final boolean z7;
        final Function2<? super Composer, ? super Integer, Unit> function220;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Composer composerStartRestartGroup = composer.startRestartGroup(508645792);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OutlinedTextFieldDecorationBox)P(13,4,3,10,14,5,6,7,9,8,12,11!1,2)642@36360L25,648@36611L651:TextFieldDefaults.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i4 |= composerStartRestartGroup.changed(innerTextField) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i & 896) == 0) {
                z4 = z;
                i4 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 57344) == 0) {
                    i4 |= composerStartRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else {
                    if ((i & 458752) == 0) {
                        i5 = composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536;
                    }
                    i6 = i3 & 64;
                    if (i6 == 0) {
                        i4 |= 1572864;
                        z5 = z3;
                    } else {
                        z5 = z3;
                        if ((i & 3670016) == 0) {
                            i4 |= composerStartRestartGroup.changed(z5) ? 1048576 : 524288;
                        }
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                        function27 = function2;
                    } else {
                        function27 = function2;
                        if ((i & 29360128) == 0) {
                            i4 |= composerStartRestartGroup.changed(function27) ? 8388608 : 4194304;
                        }
                    }
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i4 |= 100663296;
                        function28 = function22;
                    } else {
                        function28 = function22;
                        if ((i & 234881024) == 0) {
                            i4 |= composerStartRestartGroup.changed(function28) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                    }
                    i9 = i3 & 512;
                    if (i9 == 0) {
                        i4 |= 805306368;
                    } else {
                        if ((i & 1879048192) == 0) {
                            i10 = i9;
                            i4 |= composerStartRestartGroup.changed(function23) ? 536870912 : 268435456;
                        }
                        i11 = i3 & 1024;
                        if (i11 != 0) {
                            i13 = i2 | 6;
                            i12 = i11;
                        } else if ((i2 & 14) == 0) {
                            i12 = i11;
                            i13 = i2 | (composerStartRestartGroup.changed(function24) ? 4 : 2);
                        } else {
                            i12 = i11;
                            i13 = i2;
                        }
                        i14 = i3 & 2048;
                        if (i14 != 0) {
                            i13 |= 48;
                        } else {
                            if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                                i15 = i14;
                                i13 |= composerStartRestartGroup.changed(function25) ? 32 : 16;
                            }
                            if ((i2 & 896) == 0) {
                                i13 |= ((i3 & 4096) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 256 : 128;
                            }
                            if ((i2 & 7168) == 0) {
                                i13 |= ((i3 & 8192) == 0 && composerStartRestartGroup.changed(paddingValues)) ? 2048 : 1024;
                            }
                            int i22 = i13;
                            i16 = i3 & 16384;
                            if (i16 != 0) {
                                if ((i2 & 57344) == 0) {
                                    i17 = i16;
                                    i22 |= composerStartRestartGroup.changed(function26) ? 16384 : 8192;
                                }
                                if ((i3 & 32768) != 0) {
                                    i18 = i22 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else {
                                    int i23 = i22;
                                    if ((i2 & 458752) == 0) {
                                        i18 = i23 | (composerStartRestartGroup.changed(this) ? 131072 : 65536);
                                    } else {
                                        i18 = i23;
                                    }
                                }
                                if ((i4 & 1533916891) != 306783378 || (374491 & i18) != 74898 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        boolean z8 = i6 == 0 ? false : z5;
                                        Function2<? super Composer, ? super Integer, Unit> function221 = i7 == 0 ? null : function27;
                                        Function2<? super Composer, ? super Integer, Unit> function222 = i8 == 0 ? null : function28;
                                        Function2<? super Composer, ? super Integer, Unit> function223 = i10 == 0 ? null : function23;
                                        function29 = i12 == 0 ? null : function24;
                                        Function2<? super Composer, ? super Integer, Unit> function224 = i15 == 0 ? function25 : null;
                                        if ((i3 & 4096) == 0) {
                                            int i24 = i18;
                                            i20 = i17;
                                            textFieldColorsM2509outlinedTextFieldColorsl59Burw = m2509outlinedTextFieldColorsl59Burw(0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i18 << 9) & 234881024, 268435455);
                                            composer2 = composerStartRestartGroup;
                                            i19 = i24 & (-897);
                                        } else {
                                            composer2 = composerStartRestartGroup;
                                            i19 = i18;
                                            i20 = i17;
                                            textFieldColorsM2509outlinedTextFieldColorsl59Burw = textFieldColors;
                                        }
                                        if ((i3 & 8192) == 0) {
                                            paddingValuesM2499outlinedTextFieldPaddinga9UjIt4$default = m2499outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                            i19 &= -7169;
                                        } else {
                                            paddingValuesM2499outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                        }
                                        if (i20 == 0) {
                                            final boolean z9 = z8;
                                            final int i25 = i19;
                                            final int i26 = i4;
                                            final boolean z10 = z4;
                                            final TextFieldColors textFieldColors3 = textFieldColorsM2509outlinedTextFieldColorsl59Burw;
                                            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, 144282315, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                    invoke(composer5, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer5, int i27) {
                                                    ComposerKt.sourceInformation(composer5, "C645@36513L71:TextFieldDefaults.kt#uh7d8r");
                                                    if ((i27 & 11) == 2 && composer5.getSkipping()) {
                                                        composer5.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(144282315, i27, -1, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:644)");
                                                    }
                                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                    boolean z11 = z10;
                                                    boolean z12 = z9;
                                                    InteractionSource interactionSource2 = interactionSource;
                                                    TextFieldColors textFieldColors4 = textFieldColors3;
                                                    int i28 = i26;
                                                    textFieldDefaults.m2503OutlinedBorderContainerBoxnbWgWpA(z11, z12, interactionSource2, textFieldColors4, null, 0.0f, 0.0f, composer5, ((i28 >> 9) & 896) | ((i28 >> 6) & 14) | 12582912 | ((i28 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i25 << 3) & 7168), OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            });
                                            function210 = function224;
                                            function211 = function221;
                                            function212 = function222;
                                            composer3 = composer2;
                                            paddingValues2 = paddingValuesM2499outlinedTextFieldPaddinga9UjIt4$default;
                                            function213 = composableLambda;
                                            z6 = z9;
                                            i21 = i25;
                                            function214 = function223;
                                            textFieldColors2 = textFieldColors3;
                                        } else {
                                            TextFieldColors textFieldColors4 = textFieldColorsM2509outlinedTextFieldColorsl59Burw;
                                            int i27 = i19;
                                            boolean z11 = z8;
                                            function210 = function224;
                                            function211 = function221;
                                            function212 = function222;
                                            composer3 = composer2;
                                            i21 = i27;
                                            paddingValues2 = paddingValuesM2499outlinedTextFieldPaddinga9UjIt4$default;
                                            function213 = function26;
                                            z6 = z11;
                                            textFieldColors2 = textFieldColors4;
                                            function214 = function223;
                                        }
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i3 & 4096) != 0) {
                                            i18 &= -897;
                                        }
                                        if ((i3 & 8192) != 0) {
                                            i18 &= -7169;
                                        }
                                        function29 = function24;
                                        function210 = function25;
                                        composer3 = composerStartRestartGroup;
                                        z6 = z5;
                                        function211 = function27;
                                        i21 = i18;
                                        function212 = function28;
                                        function214 = function23;
                                        textFieldColors2 = textFieldColors;
                                        paddingValues2 = paddingValues;
                                        function213 = function26;
                                    }
                                    composer3.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(508645792, i4, i21, "androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:629)");
                                    }
                                    TextFieldType textFieldType = TextFieldType.Outlined;
                                    int i28 = i4 << 3;
                                    int i29 = i4 >> 9;
                                    int i30 = i21 << 21;
                                    int i31 = (i28 & 896) | (i28 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6 | ((i4 >> 3) & 7168) | (i29 & 57344) | (i29 & 458752) | (3670016 & i29) | (i30 & 29360128) | (i30 & 234881024) | ((i4 << 18) & 1879048192);
                                    int i32 = ((i4 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i4 >> 6) & 14) | (i29 & 896) | (i21 & 7168) | ((i21 << 6) & 57344) | ((i21 << 3) & 458752);
                                    Function2<? super Composer, ? super Integer, Unit> function225 = function29;
                                    TextFieldImplKt.CommonDecorationBox(textFieldType, value, innerTextField, visualTransformation, function211, function212, function214, function225, function210, z2, z, z6, interactionSource, paddingValues2, textFieldColors2, function213, composer3, i31, i32, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    function215 = function211;
                                    function216 = function212;
                                    function217 = function225;
                                    composer4 = composer3;
                                    function218 = function213;
                                    paddingValues3 = paddingValues2;
                                    function219 = function210;
                                    z7 = z6;
                                    function220 = function214;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    function220 = function23;
                                    function217 = function24;
                                    textFieldColors2 = textFieldColors;
                                    function218 = function26;
                                    composer4 = composerStartRestartGroup;
                                    z7 = z5;
                                    function215 = function27;
                                    function216 = function28;
                                    function219 = function25;
                                    paddingValues3 = paddingValues;
                                }
                                scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                    return;
                                }
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults.OutlinedTextFieldDecorationBox.2
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

                                    public final void invoke(Composer composer5, int i33) {
                                        TextFieldDefaults.this.OutlinedTextFieldDecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z7, function215, function216, function220, function217, function219, textFieldColors2, paddingValues3, function218, composer5, i | 1, i2, i3);
                                    }
                                });
                                return;
                            }
                            i22 |= 24576;
                            i17 = i16;
                            if ((i3 & 32768) != 0) {
                            }
                            if ((i4 & 1533916891) != 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    if (i6 == 0) {
                                    }
                                    if (i7 == 0) {
                                    }
                                    if (i8 == 0) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    if ((i3 & 4096) == 0) {
                                    }
                                    if ((i3 & 8192) == 0) {
                                    }
                                    if (i20 == 0) {
                                    }
                                    composer3.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    TextFieldType textFieldType2 = TextFieldType.Outlined;
                                    int i282 = i4 << 3;
                                    int i292 = i4 >> 9;
                                    int i302 = i21 << 21;
                                    int i312 = (i282 & 896) | (i282 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6 | ((i4 >> 3) & 7168) | (i292 & 57344) | (i292 & 458752) | (3670016 & i292) | (i302 & 29360128) | (i302 & 234881024) | ((i4 << 18) & 1879048192);
                                    int i322 = ((i4 >> 15) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i4 >> 6) & 14) | (i292 & 896) | (i21 & 7168) | ((i21 << 6) & 57344) | ((i21 << 3) & 458752);
                                    Function2<? super Composer, ? super Integer, Unit> function2252 = function29;
                                    TextFieldImplKt.CommonDecorationBox(textFieldType2, value, innerTextField, visualTransformation, function211, function212, function214, function2252, function210, z2, z, z6, interactionSource, paddingValues2, textFieldColors2, function213, composer3, i312, i322, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    function215 = function211;
                                    function216 = function212;
                                    function217 = function2252;
                                    composer4 = composer3;
                                    function218 = function213;
                                    paddingValues3 = paddingValues2;
                                    function219 = function210;
                                    z7 = z6;
                                    function220 = function214;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i15 = i14;
                        if ((i2 & 896) == 0) {
                        }
                        if ((i2 & 7168) == 0) {
                        }
                        int i222 = i13;
                        i16 = i3 & 16384;
                        if (i16 != 0) {
                        }
                        i17 = i16;
                        if ((i3 & 32768) != 0) {
                        }
                        if ((i4 & 1533916891) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i10 = i9;
                    i11 = i3 & 1024;
                    if (i11 != 0) {
                    }
                    i14 = i3 & 2048;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    if ((i2 & 896) == 0) {
                    }
                    if ((i2 & 7168) == 0) {
                    }
                    int i2222 = i13;
                    i16 = i3 & 16384;
                    if (i16 != 0) {
                    }
                    i17 = i16;
                    if ((i3 & 32768) != 0) {
                    }
                    if ((i4 & 1533916891) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i4 |= i5;
                i6 = i3 & 64;
                if (i6 == 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                i9 = i3 & 512;
                if (i9 == 0) {
                }
                i10 = i9;
                i11 = i3 & 1024;
                if (i11 != 0) {
                }
                i14 = i3 & 2048;
                if (i14 != 0) {
                }
                i15 = i14;
                if ((i2 & 896) == 0) {
                }
                if ((i2 & 7168) == 0) {
                }
                int i22222 = i13;
                i16 = i3 & 16384;
                if (i16 != 0) {
                }
                i17 = i16;
                if ((i3 & 32768) != 0) {
                }
                if ((i4 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            i4 |= i5;
            i6 = i3 & 64;
            if (i6 == 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            i9 = i3 & 512;
            if (i9 == 0) {
            }
            i10 = i9;
            i11 = i3 & 1024;
            if (i11 != 0) {
            }
            i14 = i3 & 2048;
            if (i14 != 0) {
            }
            i15 = i14;
            if ((i2 & 896) == 0) {
            }
            if ((i2 & 7168) == 0) {
            }
            int i222222 = i13;
            i16 = i3 & 16384;
            if (i16 != 0) {
            }
            i17 = i16;
            if ((i3 & 32768) != 0) {
            }
            if ((i4 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z4 = z;
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        i4 |= i5;
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i3 & 1024;
        if (i11 != 0) {
        }
        i14 = i3 & 2048;
        if (i14 != 0) {
        }
        i15 = i14;
        if ((i2 & 896) == 0) {
        }
        if ((i2 & 7168) == 0) {
        }
        int i2222222 = i13;
        i16 = i3 & 16384;
        if (i16 != 0) {
        }
        i17 = i16;
        if ((i3 & 32768) != 0) {
        }
        if ((i4 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ExperimentalMaterial3Api
    /* renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m2508indicatorLinegv0btCI(Modifier indicatorLine, final boolean z, final boolean z2, final InteractionSource interactionSource, final TextFieldColors colors, final float f, final float f2) {
        Intrinsics.checkNotNullParameter(indicatorLine, "$this$indicatorLine");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        return ComposedModifierKt.composed(indicatorLine, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
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
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("indicatorLine");
                inspectorInfo.getProperties().set(ViewProps.ENABLED, Boolean.valueOf(z));
                inspectorInfo.getProperties().set("isError", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set(PaymentSheetAppearanceKeys.COLORS, colors);
                inspectorInfo.getProperties().set("focusedIndicatorLineThickness", Dp.m6115boximpl(f));
                inspectorInfo.getProperties().set("unfocusedIndicatorLineThickness", Dp.m6115boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-891038934);
                ComposerKt.sourceInformation(composer, "C147@6353L217:TextFieldDefaults.kt#uh7d8r");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-891038934, i, -1, "androidx.compose.material3.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:146)");
                }
                Modifier modifierDrawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.m2516animateBorderStrokeAsStateNuRrP5Q(z, z2, interactionSource, colors, f, f2, composer, 0).getValue());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierDrawIndicatorLine;
            }
        });
    }
}
