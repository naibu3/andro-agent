.class public final Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt;
.super Ljava/lang/Object;
.source "CompatTextField.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCompatTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompatTextField.kt\ncom/stripe/android/uicore/elements/compat/CompatTextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,672:1\n77#2:673\n77#2:682\n77#2:697\n1225#3,6:674\n1225#3,6:683\n1225#3,6:691\n1225#3,6:746\n708#4:680\n696#4:681\n708#4:689\n696#4:690\n708#4:752\n696#4:753\n708#4:754\n696#4:755\n57#5:698\n57#5:702\n149#6:699\n206#6:700\n149#6:701\n149#6:703\n206#6:704\n149#6:705\n71#7:706\n68#7,6:707\n74#7:741\n78#7:745\n79#8,6:713\n86#8,4:728\n90#8,2:738\n94#8:744\n368#9,9:719\n377#9:740\n378#9,2:742\n4034#10,6:732\n*S KotlinDebug\n*F\n+ 1 CompatTextField.kt\ncom/stripe/android/uicore/elements/compat/CompatTextFieldKt\n*L\n144#1:673\n274#1:682\n363#1:697\n157#1:674,6\n287#1:683,6\n354#1:691,6\n432#1:746,6\n167#1:680\n167#1:681\n297#1:689\n297#1:690\n463#1:752\n463#1:753\n466#1:754\n466#1:755\n371#1:698\n374#1:702\n371#1:699\n371#1:700\n372#1:701\n374#1:703\n374#1:704\n375#1:705\n368#1:706\n368#1:707,6\n368#1:741\n368#1:745\n368#1:713,6\n368#1:728,4\n368#1:738,2\n368#1:744\n368#1:719,9\n368#1:740\n368#1:742,2\n368#1:732,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a\u00a5\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0015\u0008\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u00a2\u0006\u0002\u0008\u000f2\u0015\u0008\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u00a2\u0006\u0002\u0008\u000f2\u0015\u0008\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u00a2\u0006\u0002\u0008\u000f2\u0015\u0008\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u00a2\u0006\u0002\u0008\u000f2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\t2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u001a2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\t2\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001f\u001a\u00020 2\u0008\u0008\u0002\u0010!\u001a\u00020\"2\u0008\u0008\u0002\u0010#\u001a\u00020$2\u0008\u0008\u0002\u0010%\u001a\u00020&H\u0007\u00a2\u0006\u0002\u0010\'\u001a\u00a5\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020(2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0015\u0008\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u00a2\u0006\u0002\u0008\u000f2\u0015\u0008\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u00a2\u0006\u0002\u0008\u000f2\u0015\u0008\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u00a2\u0006\u0002\u0008\u000f2\u0015\u0008\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u00a2\u0006\u0002\u0008\u000f2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\t2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u001a2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\t2\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001f\u001a\u00020 2\u0008\u0008\u0002\u0010!\u001a\u00020\"2\u0008\u0008\u0002\u0010#\u001a\u00020$2\u0008\u0008\u0002\u0010%\u001a\u00020&H\u0007\u00a2\u0006\u0002\u0010)\u001a\u00d4\u0001\u0010*\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u00010\u000e\u00a2\u0006\u0002\u0008\u000f2\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0015\u0008\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u00a2\u0006\u0002\u0008\u000f2\u0015\u0008\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u00a2\u0006\u0002\u0008\u000f2\u0015\u0008\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u00a2\u0006\u0002\u0008\u000f2\u0015\u0008\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u00a2\u0006\u0002\u0008\u000f2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u001b\u001a\u00020\t2\u0008\u0008\u0002\u0010\u001f\u001a\u00020 2\u0008\u0008\u0002\u0010!\u001a\u00020\"2\u0008\u0008\u0002\u0010#\u001a\u00020$2\u0008\u0008\u0002\u0010%\u001a\u00020&H\u0003\u00a2\u0006\u0002\u0010,\u001a\u00bc\u0001\u0010-\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u00010\u000e\u00a2\u0006\u0002\u0008\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0013\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u00a2\u0006\u0002\u0008\u000f2\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u00a2\u0006\u0002\u0008\u000f2\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u00a2\u0006\u0002\u0008\u000f2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u00a2\u0006\u0002\u0008\u000f2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020.2\u0006\u0010%\u001a\u00020&2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0001\u00a2\u0006\u0002\u0010/\u001aQ\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u0002022\n\u0008\u0002\u00103\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u00104\u001a\u0004\u0018\u0001052 \u00106\u001a\u001c\u0012\u0004\u0012\u00020\u00010\u000e\u00a2\u0006\u0002\u0008\u000f\u00a2\u0006\u000c\u00087\u0012\u0008\u00088\u0012\u0004\u0008\u0003\u0010\u0000H\u0001\u00a2\u0006\u0004\u00089\u0010:\u001a\u001e\u0010;\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u0007\"\u000e\u0010<\u001a\u00020\u001dX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u00020\u001dX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006>"
    }
    d2 = {
        "CompatTextField",
        "",
        "value",
        "",
        "onValueChange",
        "Lkotlin/Function1;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "enabled",
        "",
        "readOnly",
        "textStyle",
        "Landroidx/compose/ui/text/TextStyle;",
        "label",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "placeholder",
        "leadingIcon",
        "trailingIcon",
        "isError",
        "errorMessage",
        "visualTransformation",
        "Landroidx/compose/ui/text/input/VisualTransformation;",
        "keyboardOptions",
        "Landroidx/compose/foundation/text/KeyboardOptions;",
        "keyboardActions",
        "Landroidx/compose/foundation/text/KeyboardActions;",
        "singleLine",
        "maxLines",
        "",
        "minLines",
        "interactionSource",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "shape",
        "Landroidx/compose/ui/graphics/Shape;",
        "colors",
        "Landroidx/compose/material/TextFieldColors;",
        "contentPadding",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLjava/lang/String;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;IIII)V",
        "Landroidx/compose/ui/text/input/TextFieldValue;",
        "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLjava/lang/String;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;IIII)V",
        "InsetDecorationBox",
        "innerTextField",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V",
        "CommonDecorationBox",
        "Landroidx/compose/foundation/interaction/InteractionSource;",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;II)V",
        "Decoration",
        "contentColor",
        "Landroidx/compose/ui/graphics/Color;",
        "typography",
        "contentAlpha",
        "",
        "content",
        "Landroidx/compose/runtime/ComposableOpenTarget;",
        "index",
        "Decoration-euL9pac",
        "(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
        "errorSemanticsWithDefault",
        "PlaceholderAnimationDuration",
        "PlaceholderAnimationDelayOrDuration",
        "stripe-ui-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final PlaceholderAnimationDelayOrDuration:I = 0x43

.field private static final PlaceholderAnimationDuration:I = 0x53


# direct methods
.method public static synthetic $r8$lambda$6ygtSl2QmH1BTkML3XG2HHGVyeM(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p17}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt;->CommonDecorationBox$lambda$18(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$N_g5XDCkrnkkDK2-k5u1p-iaGL0(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLjava/lang/String;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;IIIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p27}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt;->CompatTextField$lambda$5(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLjava/lang/String;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;IIIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$UANSuYH_bTOJDKhlqUAU1Zv3u5s(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p18}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt;->InsetDecorationBox$lambda$12(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$WiaM8aOTE-IA0ywStJoaYXe2jZo(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p8}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt;->Decoration_euL9pac$lambda$19(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$XRx7e8t80wQ_u-8MLOMDtiYVmEs(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLjava/lang/String;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;IIIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p27}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt;->CompatTextField$lambda$2(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLjava/lang/String;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;IIIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final CommonDecorationBox(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;II)V
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;ZZZ",
            "Landroidx/compose/foundation/interaction/InteractionSource;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material/TextFieldColors;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v11, p1

    move-object/from16 v15, p2

    move-object/from16 v6, p3

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v7, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v8, p15

    move/from16 v0, p16

    const-string v2, "value"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "innerTextField"

    invoke-static {v11, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "visualTransformation"

    invoke-static {v15, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "interactionSource"

    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "contentPadding"

    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "shape"

    invoke-static {v13, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "colors"

    invoke-static {v14, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, -0x41b94401

    move-object/from16 v3, p14

    .line 431
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v3

    and-int/lit8 v4, v8, 0x6

    if-nez v4, :cond_1

    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v8

    goto :goto_1

    :cond_1
    move v4, v8

    :goto_1
    and-int/lit8 v16, v8, 0x30

    const/16 v17, 0x20

    const/16 v18, 0x10

    if-nez v16, :cond_3

    invoke-interface {v3, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_2

    move/from16 v16, v17

    goto :goto_2

    :cond_2
    move/from16 v16, v18

    :goto_2
    or-int v4, v4, v16

    :cond_3
    and-int/lit16 v5, v8, 0x180

    const/16 v19, 0x80

    if-nez v5, :cond_5

    invoke-interface {v3, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    move/from16 v5, v19

    :goto_3
    or-int/2addr v4, v5

    :cond_5
    and-int/lit16 v5, v8, 0xc00

    const/16 v21, 0x800

    const/16 v22, 0x400

    if-nez v5, :cond_7

    invoke-interface {v3, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    move/from16 v5, v21

    goto :goto_4

    :cond_6
    move/from16 v5, v22

    :goto_4
    or-int/2addr v4, v5

    :cond_7
    and-int/lit16 v5, v8, 0x6000

    if-nez v5, :cond_9

    move-object/from16 v5, p4

    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_8

    const/16 v23, 0x4000

    goto :goto_5

    :cond_8
    const/16 v23, 0x2000

    :goto_5
    or-int v4, v4, v23

    goto :goto_6

    :cond_9
    move-object/from16 v5, p4

    :goto_6
    const/high16 v23, 0x30000

    and-int v23, v8, v23

    if-nez v23, :cond_b

    move/from16 v23, v4

    move-object/from16 v4, p5

    invoke-interface {v3, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_a

    const/high16 v24, 0x20000

    goto :goto_7

    :cond_a
    const/high16 v24, 0x10000

    :goto_7
    or-int v23, v23, v24

    goto :goto_8

    :cond_b
    move/from16 v23, v4

    move-object/from16 v4, p5

    :goto_8
    const/high16 v24, 0x180000

    and-int v24, v8, v24

    move-object/from16 v4, p6

    if-nez v24, :cond_d

    invoke-interface {v3, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_c

    const/high16 v24, 0x100000

    goto :goto_9

    :cond_c
    const/high16 v24, 0x80000

    :goto_9
    or-int v23, v23, v24

    :cond_d
    const/high16 v24, 0xc00000

    and-int v24, v8, v24

    move/from16 v4, p7

    if-nez v24, :cond_f

    invoke-interface {v3, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v24

    if-eqz v24, :cond_e

    const/high16 v24, 0x800000

    goto :goto_a

    :cond_e
    const/high16 v24, 0x400000

    :goto_a
    or-int v23, v23, v24

    :cond_f
    const/high16 v24, 0x6000000

    and-int v24, v8, v24

    if-nez v24, :cond_11

    invoke-interface {v3, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v24

    if-eqz v24, :cond_10

    const/high16 v24, 0x4000000

    goto :goto_b

    :cond_10
    const/high16 v24, 0x2000000

    :goto_b
    or-int v23, v23, v24

    :cond_11
    const/high16 v24, 0x30000000

    and-int v24, v8, v24

    if-nez v24, :cond_13

    invoke-interface {v3, v10}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v24

    if-eqz v24, :cond_12

    const/high16 v24, 0x20000000

    goto :goto_c

    :cond_12
    const/high16 v24, 0x10000000

    :goto_c
    or-int v23, v23, v24

    :cond_13
    move/from16 v2, v23

    and-int/lit8 v23, v0, 0x6

    if-nez v23, :cond_15

    invoke-interface {v3, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_14

    const/16 v23, 0x4

    goto :goto_d

    :cond_14
    const/16 v23, 0x2

    :goto_d
    or-int v23, v0, v23

    goto :goto_e

    :cond_15
    move/from16 v23, v0

    :goto_e
    and-int/lit8 v25, v0, 0x30

    if-nez v25, :cond_17

    invoke-interface {v3, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_16

    goto :goto_f

    :cond_16
    move/from16 v17, v18

    :goto_f
    or-int v23, v23, v17

    :cond_17
    and-int/lit16 v1, v0, 0x180

    if-nez v1, :cond_19

    invoke-interface {v3, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_18

    const/16 v19, 0x100

    :cond_18
    or-int v23, v23, v19

    :cond_19
    and-int/lit16 v1, v0, 0xc00

    if-nez v1, :cond_1b

    invoke-interface {v3, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1a

    goto :goto_10

    :cond_1a
    move/from16 v21, v22

    :goto_10
    or-int v23, v23, v21

    :cond_1b
    move/from16 v1, v23

    const v17, 0x12492493

    and-int v0, v2, v17

    const v4, 0x12492492

    if-ne v0, v4, :cond_1d

    and-int/lit16 v0, v1, 0x493

    const/16 v4, 0x492

    if-ne v0, v4, :cond_1d

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_1c

    goto :goto_11

    .line 531
    :cond_1c
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v15, v3

    goto/16 :goto_1a

    .line 431
    :cond_1d
    :goto_11
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1e

    const-string v0, "com.stripe.android.uicore.elements.compat.CommonDecorationBox (CompatTextField.kt:430)"

    const v4, -0x41b94401

    invoke-static {v4, v2, v1, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_1e
    const v0, 0x52effc5c

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    and-int/lit8 v0, v2, 0xe

    const/16 v17, 0x0

    const/4 v4, 0x4

    if-ne v0, v4, :cond_1f

    const/4 v0, 0x1

    goto :goto_12

    :cond_1f
    move/from16 v0, v17

    :goto_12
    and-int/lit16 v2, v2, 0x380

    const/16 v4, 0x100

    if-ne v2, v4, :cond_20

    const/4 v2, 0x1

    goto :goto_13

    :cond_20
    move/from16 v2, v17

    :goto_13
    or-int/2addr v0, v2

    .line 746
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_22

    .line 747
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_21

    goto :goto_14

    :cond_21
    move/from16 v23, v1

    move-object v6, v3

    goto :goto_15

    .line 433
    :cond_22
    :goto_14
    new-instance v0, Landroidx/compose/ui/text/AnnotatedString;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object/from16 v16, v3

    const/4 v3, 0x0

    move/from16 v23, v1

    move-object/from16 v6, v16

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v15, v0}, Landroidx/compose/ui/text/input/VisualTransformation;->filter(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;

    move-result-object v2

    .line 749
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 432
    :goto_15
    check-cast v2, Landroidx/compose/ui/text/input/TransformedText;

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 434
    invoke-virtual {v2}, Landroidx/compose/ui/text/input/TransformedText;->getText()Landroidx/compose/ui/text/AnnotatedString;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/text/AnnotatedString;->getText()Ljava/lang/String;

    move-result-object v3

    and-int/lit8 v0, v23, 0xe

    .line 436
    invoke-static {v7, v6, v0}, Landroidx/compose/foundation/interaction/FocusInteractionKt;->collectIsFocusedAsState(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_23

    .line 438
    sget-object v0, Lcom/stripe/android/uicore/elements/compat/InputPhase;->Focused:Lcom/stripe/android/uicore/elements/compat/InputPhase;

    goto :goto_16

    .line 439
    :cond_23
    move-object v0, v3

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_24

    sget-object v0, Lcom/stripe/android/uicore/elements/compat/InputPhase;->UnfocusedEmpty:Lcom/stripe/android/uicore/elements/compat/InputPhase;

    goto :goto_16

    .line 440
    :cond_24
    sget-object v0, Lcom/stripe/android/uicore/elements/compat/InputPhase;->UnfocusedNotEmpty:Lcom/stripe/android/uicore/elements/compat/InputPhase;

    .line 443
    :goto_16
    new-instance v1, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$labelColor$1;

    invoke-direct {v1, v14, v9, v10, v7}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$labelColor$1;-><init>(Landroidx/compose/material/TextFieldColors;ZZLandroidx/compose/foundation/interaction/InteractionSource;)V

    check-cast v1, Lkotlin/jvm/functions/Function3;

    .line 453
    sget-object v2, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v4, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-virtual {v2, v6, v4}, Landroidx/compose/material/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Typography;

    move-result-object v2

    .line 454
    invoke-virtual {v2}, Landroidx/compose/material/Typography;->getSubtitle1()Landroidx/compose/ui/text/TextStyle;

    move-result-object v4

    .line 455
    invoke-virtual {v2}, Landroidx/compose/material/Typography;->getCaption()Landroidx/compose/ui/text/TextStyle;

    move-result-object v2

    move-object v5, v2

    move-object/from16 p14, v3

    .line 457
    invoke-virtual {v4}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v2

    sget-object v16, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v2

    if-eqz v2, :cond_25

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v2

    sget-object v4, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v2

    if-eqz v2, :cond_26

    .line 458
    :cond_25
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v2

    sget-object v4, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v2

    if-nez v2, :cond_27

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v2

    sget-object v4, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v2

    if-eqz v2, :cond_27

    :cond_26
    const/4 v4, 0x1

    goto :goto_17

    :cond_27
    move/from16 v4, v17

    .line 460
    :goto_17
    sget-object v16, Lcom/stripe/android/uicore/elements/compat/TextFieldTransitionScope;->INSTANCE:Lcom/stripe/android/uicore/elements/compat/TextFieldTransitionScope;

    const v2, 0x52f08fae

    .line 461
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 462
    sget-object v2, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v3, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-virtual {v2, v6, v3}, Landroidx/compose/material/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Typography;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/material/Typography;->getCaption()Landroidx/compose/ui/text/TextStyle;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v2

    const v5, 0x52f096c9

    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-wide/16 v18, 0x10

    if-eqz v4, :cond_29

    cmp-long v5, v2, v18

    if-eqz v5, :cond_28

    goto :goto_18

    .line 463
    :cond_28
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v0, v6, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v2

    :cond_29
    :goto_18
    move-wide/from16 v20, v2

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 462
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v2, 0x52f0a790

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 465
    sget-object v2, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v3, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-virtual {v2, v6, v3}, Landroidx/compose/material/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Typography;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/material/Typography;->getSubtitle1()Landroidx/compose/ui/text/TextStyle;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v2

    const v5, 0x52f0aee9

    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    if-eqz v4, :cond_2b

    cmp-long v5, v2, v18

    if-eqz v5, :cond_2a

    goto :goto_19

    .line 466
    :cond_2a
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v0, v6, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v2

    :cond_2b
    :goto_19
    move-wide/from16 v18, v2

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 465
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    if-eqz p3, :cond_2c

    const/16 v17, 0x1

    :cond_2c
    move-object v2, v0

    .line 470
    new-instance v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;

    move-object v3, v14

    move v14, v4

    move-object v4, v3

    move-object/from16 v8, p5

    move-object/from16 v3, p14

    move-object/from16 v23, v1

    move-object/from16 v22, v2

    move-object v15, v6

    move v5, v9

    move v6, v10

    move-object v10, v13

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v9, p6

    move-object v13, v12

    move/from16 v12, p7

    invoke-direct/range {v0 .. v14}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CommonDecorationBox$3;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Landroidx/compose/material/TextFieldColors;ZZLandroidx/compose/foundation/interaction/InteractionSource;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/layout/PaddingValues;Z)V

    const/16 v1, 0x36

    const v2, 0x2f20cb9c

    const/4 v3, 0x1

    invoke-static {v2, v3, v0, v15, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lkotlin/jvm/functions/Function6;

    const/high16 v13, 0x1b0000

    move-object v12, v15

    move-object/from16 v3, v16

    move/from16 v10, v17

    move-wide/from16 v7, v18

    move-wide/from16 v5, v20

    move-object/from16 v4, v22

    move-object/from16 v9, v23

    .line 460
    invoke-virtual/range {v3 .. v13}, Lcom/stripe/android/uicore/elements/compat/TextFieldTransitionScope;->Transition-DTcfvLk(Lcom/stripe/android/uicore/elements/compat/InputPhase;JJLkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function6;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 531
    :cond_2d
    :goto_1a
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_2e

    move-object v1, v0

    new-instance v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$$ExternalSyntheticLambda1;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p15

    move/from16 v16, p16

    move-object/from16 v26, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v16}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$$ExternalSyntheticLambda1;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;II)V

    move-object/from16 v1, v26

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_2e
    return-void
.end method

.method private static final CommonDecorationBox$lambda$18(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 18

    or-int/lit8 v0, p14, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v16

    invoke-static/range {p15 .. p15}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p16

    invoke-static/range {v1 .. v17}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt;->CommonDecorationBox(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;II)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public static final CompatTextField(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLjava/lang/String;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;IIII)V
    .locals 72
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "ZZ",
            "Landroidx/compose/ui/text/TextStyle;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;Z",
            "Ljava/lang/String;",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            "Landroidx/compose/foundation/text/KeyboardOptions;",
            "Landroidx/compose/foundation/text/KeyboardActions;",
            "ZII",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material/TextFieldColors;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/runtime/Composer;",
            "IIII)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v14, p1

    move-object/from16 v15, p11

    move/from16 v0, p23

    move/from16 v2, p24

    move/from16 v3, p26

    const-string v4, "value"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onValueChange"

    invoke-static {v14, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, -0x343df946    # -2.5431412E7f

    move-object/from16 v5, p22

    .line 295
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v4

    and-int/lit8 v5, v3, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v5, v0, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_2

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_2
    move v5, v0

    :goto_1
    and-int/lit8 v8, v3, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v5, v5, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v0, 0x30

    if-nez v8, :cond_5

    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v5, v8

    :cond_5
    :goto_3
    and-int/lit8 v8, v3, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v5, v5, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v13, v0, 0x180

    if-nez v13, :cond_8

    move-object/from16 v13, p2

    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_7

    const/16 v16, 0x100

    goto :goto_4

    :cond_7
    const/16 v16, 0x80

    :goto_4
    or-int v5, v5, v16

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v13, p2

    :goto_6
    and-int/lit8 v16, v3, 0x8

    const/16 v17, 0x800

    const/16 v18, 0x400

    if-eqz v16, :cond_9

    or-int/lit16 v5, v5, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v6, v0, 0xc00

    if-nez v6, :cond_b

    move/from16 v6, p3

    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v19

    if-eqz v19, :cond_a

    move/from16 v19, v17

    goto :goto_7

    :cond_a
    move/from16 v19, v18

    :goto_7
    or-int v5, v5, v19

    goto :goto_9

    :cond_b
    :goto_8
    move/from16 v6, p3

    :goto_9
    and-int/lit8 v19, v3, 0x10

    const/16 v20, 0x4000

    if-eqz v19, :cond_c

    or-int/lit16 v5, v5, 0x6000

    goto :goto_b

    :cond_c
    and-int/lit16 v7, v0, 0x6000

    if-nez v7, :cond_e

    move/from16 v7, p4

    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v22

    if-eqz v22, :cond_d

    move/from16 v22, v20

    goto :goto_a

    :cond_d
    const/16 v22, 0x2000

    :goto_a
    or-int v5, v5, v22

    goto :goto_c

    :cond_e
    :goto_b
    move/from16 v7, p4

    :goto_c
    const/high16 v64, 0x30000

    and-int v22, v0, v64

    const/high16 v23, 0x10000

    if-nez v22, :cond_10

    and-int/lit8 v22, v3, 0x20

    move-object/from16 v9, p5

    if-nez v22, :cond_f

    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_f

    const/high16 v24, 0x20000

    goto :goto_d

    :cond_f
    move/from16 v24, v23

    :goto_d
    or-int v5, v5, v24

    goto :goto_e

    :cond_10
    move-object/from16 v9, p5

    :goto_e
    and-int/lit8 v24, v3, 0x40

    const/high16 v25, 0x100000

    const/high16 v26, 0x80000

    const/high16 v27, 0x180000

    if-eqz v24, :cond_11

    or-int v5, v5, v27

    move-object/from16 v10, p6

    goto :goto_10

    :cond_11
    and-int v27, v0, v27

    move-object/from16 v10, p6

    if-nez v27, :cond_13

    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_12

    move/from16 v28, v25

    goto :goto_f

    :cond_12
    move/from16 v28, v26

    :goto_f
    or-int v5, v5, v28

    :cond_13
    :goto_10
    and-int/lit16 v11, v3, 0x80

    const/high16 v29, 0xc00000

    if-eqz v11, :cond_14

    or-int v5, v5, v29

    move-object/from16 v12, p7

    goto :goto_12

    :cond_14
    and-int v30, v0, v29

    move-object/from16 v12, p7

    if-nez v30, :cond_16

    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_15

    const/high16 v31, 0x800000

    goto :goto_11

    :cond_15
    const/high16 v31, 0x400000

    :goto_11
    or-int v5, v5, v31

    :cond_16
    :goto_12
    and-int/lit16 v0, v3, 0x100

    const/high16 v31, 0x6000000

    if-eqz v0, :cond_17

    or-int v5, v5, v31

    goto :goto_14

    :cond_17
    and-int v32, p23, v31

    if-nez v32, :cond_19

    move/from16 v32, v0

    move-object/from16 v0, p8

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_18

    const/high16 v33, 0x4000000

    goto :goto_13

    :cond_18
    const/high16 v33, 0x2000000

    :goto_13
    or-int v5, v5, v33

    goto :goto_15

    :cond_19
    :goto_14
    move/from16 v32, v0

    move-object/from16 v0, p8

    :goto_15
    and-int/lit16 v0, v3, 0x200

    const/high16 v33, 0x30000000

    if-eqz v0, :cond_1a

    or-int v5, v5, v33

    goto :goto_17

    :cond_1a
    and-int v33, p23, v33

    if-nez v33, :cond_1c

    move/from16 v33, v0

    move-object/from16 v0, p9

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v34

    if-eqz v34, :cond_1b

    const/high16 v34, 0x20000000

    goto :goto_16

    :cond_1b
    const/high16 v34, 0x10000000

    :goto_16
    or-int v5, v5, v34

    goto :goto_18

    :cond_1c
    :goto_17
    move/from16 v33, v0

    move-object/from16 v0, p9

    :goto_18
    and-int/lit16 v0, v3, 0x400

    if-eqz v0, :cond_1d

    or-int/lit8 v34, v2, 0x6

    move/from16 v35, v34

    move/from16 v34, v0

    move/from16 v0, p10

    goto :goto_1a

    :cond_1d
    and-int/lit8 v34, v2, 0x6

    if-nez v34, :cond_1f

    move/from16 v34, v0

    move/from16 v0, p10

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v35

    if-eqz v35, :cond_1e

    const/16 v35, 0x4

    goto :goto_19

    :cond_1e
    const/16 v35, 0x2

    :goto_19
    or-int v35, v2, v35

    goto :goto_1a

    :cond_1f
    move/from16 v34, v0

    move/from16 v0, p10

    move/from16 v35, v2

    :goto_1a
    and-int/lit16 v0, v3, 0x800

    if-eqz v0, :cond_20

    or-int/lit8 v35, v35, 0x30

    goto :goto_1c

    :cond_20
    and-int/lit8 v0, v2, 0x30

    if-nez v0, :cond_22

    invoke-interface {v4, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_21

    const/16 v0, 0x20

    goto :goto_1b

    :cond_21
    const/16 v0, 0x10

    :goto_1b
    or-int v35, v35, v0

    :cond_22
    :goto_1c
    move/from16 v0, v35

    and-int/lit16 v1, v3, 0x1000

    if-eqz v1, :cond_23

    or-int/lit16 v0, v0, 0x180

    goto :goto_1e

    :cond_23
    move/from16 v35, v0

    and-int/lit16 v0, v2, 0x180

    if-nez v0, :cond_25

    move-object/from16 v0, p12

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v36

    if-eqz v36, :cond_24

    const/16 v28, 0x100

    goto :goto_1d

    :cond_24
    const/16 v28, 0x80

    :goto_1d
    or-int v28, v35, v28

    move/from16 v0, v28

    goto :goto_1e

    :cond_25
    move-object/from16 v0, p12

    move/from16 v0, v35

    :goto_1e
    move/from16 v28, v1

    and-int/lit16 v1, v3, 0x2000

    if-eqz v1, :cond_26

    or-int/lit16 v0, v0, 0xc00

    move/from16 v30, v0

    goto :goto_20

    :cond_26
    move/from16 v30, v0

    and-int/lit16 v0, v2, 0xc00

    if-nez v0, :cond_28

    move-object/from16 v0, p13

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v35

    if-eqz v35, :cond_27

    goto :goto_1f

    :cond_27
    move/from16 v17, v18

    :goto_1f
    or-int v17, v30, v17

    move/from16 v30, v17

    goto :goto_21

    :cond_28
    :goto_20
    move-object/from16 v0, p13

    :goto_21
    and-int/lit16 v0, v2, 0x6000

    if-nez v0, :cond_2b

    and-int/lit16 v0, v3, 0x4000

    if-nez v0, :cond_29

    move-object/from16 v0, p14

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_2a

    goto :goto_22

    :cond_29
    move-object/from16 v0, p14

    :cond_2a
    const/16 v20, 0x2000

    :goto_22
    or-int v30, v30, v20

    goto :goto_23

    :cond_2b
    move-object/from16 v0, p14

    :goto_23
    const v17, 0x8000

    and-int v17, v3, v17

    if-eqz v17, :cond_2c

    or-int v30, v30, v64

    move/from16 v0, p15

    goto :goto_25

    :cond_2c
    and-int v18, v2, v64

    move/from16 v0, p15

    if-nez v18, :cond_2e

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v18

    if-eqz v18, :cond_2d

    const/high16 v18, 0x20000

    goto :goto_24

    :cond_2d
    move/from16 v18, v23

    :goto_24
    or-int v30, v30, v18

    :cond_2e
    :goto_25
    const/high16 v18, 0x180000

    and-int v18, v2, v18

    if-nez v18, :cond_30

    and-int v18, v3, v23

    move/from16 v0, p16

    if-nez v18, :cond_2f

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v18

    if-eqz v18, :cond_2f

    move/from16 v18, v25

    goto :goto_26

    :cond_2f
    move/from16 v18, v26

    :goto_26
    or-int v30, v30, v18

    goto :goto_27

    :cond_30
    move/from16 v0, p16

    :goto_27
    const/high16 v18, 0x20000

    and-int v18, v3, v18

    if-eqz v18, :cond_31

    or-int v30, v30, v29

    move/from16 v0, p17

    goto :goto_29

    :cond_31
    and-int v20, v2, v29

    move/from16 v0, p17

    if-nez v20, :cond_33

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v20

    if-eqz v20, :cond_32

    const/high16 v20, 0x800000

    goto :goto_28

    :cond_32
    const/high16 v20, 0x400000

    :goto_28
    or-int v30, v30, v20

    :cond_33
    :goto_29
    const/high16 v20, 0x40000

    and-int v20, v3, v20

    if-eqz v20, :cond_34

    or-int v30, v30, v31

    move-object/from16 v0, p18

    goto :goto_2b

    :cond_34
    and-int v29, v2, v31

    move-object/from16 v0, p18

    if-nez v29, :cond_36

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_35

    const/high16 v29, 0x4000000

    goto :goto_2a

    :cond_35
    const/high16 v29, 0x2000000

    :goto_2a
    or-int v30, v30, v29

    :cond_36
    :goto_2b
    const/high16 v29, 0x30000000

    and-int v29, v2, v29

    if-nez v29, :cond_38

    and-int v29, v3, v26

    move-object/from16 v0, p19

    if-nez v29, :cond_37

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_37

    const/high16 v29, 0x20000000

    goto :goto_2c

    :cond_37
    const/high16 v29, 0x10000000

    :goto_2c
    or-int v30, v30, v29

    goto :goto_2d

    :cond_38
    move-object/from16 v0, p19

    :goto_2d
    and-int/lit8 v29, p25, 0x6

    if-nez v29, :cond_3a

    and-int v29, v3, v25

    move-object/from16 v0, p20

    if-nez v29, :cond_39

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_39

    const/16 v21, 0x4

    goto :goto_2e

    :cond_39
    const/16 v21, 0x2

    :goto_2e
    or-int v21, p25, v21

    goto :goto_2f

    :cond_3a
    move-object/from16 v0, p20

    move/from16 v21, p25

    :goto_2f
    and-int/lit8 v29, p25, 0x30

    if-nez v29, :cond_3c

    const/high16 v29, 0x200000

    and-int v29, v3, v29

    move-object/from16 v0, p21

    if-nez v29, :cond_3b

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_3b

    const/16 v22, 0x20

    goto :goto_30

    :cond_3b
    const/16 v22, 0x10

    :goto_30
    or-int v21, v21, v22

    goto :goto_31

    :cond_3c
    move-object/from16 v0, p21

    :goto_31
    move/from16 v65, v21

    const v21, 0x12492493

    and-int v0, v5, v21

    move/from16 v21, v1

    const v1, 0x12492492

    if-ne v0, v1, :cond_3e

    const v0, 0x12492493

    and-int v0, v30, v0

    const v1, 0x12492492

    if-ne v0, v1, :cond_3e

    and-int/lit8 v0, v65, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3e

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_3d

    goto :goto_32

    .line 339
    :cond_3d
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v11, p10

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v59, v4

    move v4, v6

    move v5, v7

    move-object v6, v9

    move-object v7, v10

    move-object v8, v12

    move-object v3, v13

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v13, p12

    goto/16 :goto_46

    .line 295
    :cond_3e
    :goto_32
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, p23, 0x1

    if-eqz v0, :cond_46

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_3f

    goto :goto_33

    .line 293
    :cond_3f
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v3, 0x20

    if-eqz v0, :cond_40

    const v0, -0x70001

    and-int/2addr v5, v0

    :cond_40
    and-int/lit16 v0, v3, 0x4000

    if-eqz v0, :cond_41

    const v0, -0xe001

    and-int v30, v30, v0

    :cond_41
    and-int v0, v3, v23

    if-eqz v0, :cond_42

    const v0, -0x380001

    and-int v30, v30, v0

    :cond_42
    and-int v0, v3, v26

    if-eqz v0, :cond_43

    const v0, -0x70000001

    and-int v30, v30, v0

    :cond_43
    and-int v0, v3, v25

    if-eqz v0, :cond_44

    and-int/lit8 v65, v65, -0xf

    :cond_44
    const/high16 v0, 0x200000

    and-int/2addr v0, v3

    if-eqz v0, :cond_45

    and-int/lit8 v65, v65, -0x71

    :cond_45
    move-object/from16 v8, p9

    move-object/from16 v11, p12

    move-object/from16 v67, p13

    move-object/from16 v18, p14

    move/from16 v69, p16

    move/from16 v70, p17

    move-object/from16 p2, p19

    move-object/from16 v19, p21

    move-object/from16 v16, v4

    move v14, v5

    move/from16 v17, v7

    move-object v0, v9

    move-object v3, v10

    move-object v4, v12

    move/from16 v1, v30

    move-object/from16 v5, p8

    move/from16 v7, p10

    move/from16 v9, p15

    move-object/from16 v10, p18

    move-object/from16 v12, p20

    goto/16 :goto_43

    :cond_46
    :goto_33
    if-eqz v8, :cond_47

    .line 271
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v13, v0

    :cond_47
    if-eqz v16, :cond_48

    const/4 v6, 0x1

    :cond_48
    if-eqz v19, :cond_49

    const/4 v0, 0x0

    move v7, v0

    :cond_49
    and-int/lit8 v0, v3, 0x20

    if-eqz v0, :cond_4a

    .line 274
    invoke-static {}, Landroidx/compose/material/TextKt;->getLocalTextStyle()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/CompositionLocal;

    const v8, 0x789c5f52

    const-string v9, "CC:CompositionLocal.kt#9igjgp"

    .line 682
    invoke-static {v4, v8, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    check-cast v0, Landroidx/compose/ui/text/TextStyle;

    const v8, -0x70001

    and-int/2addr v5, v8

    move-object v9, v0

    :cond_4a
    if-eqz v24, :cond_4b

    const/4 v10, 0x0

    :cond_4b
    if-eqz v11, :cond_4c

    const/4 v12, 0x0

    :cond_4c
    if-eqz v32, :cond_4d

    const/4 v0, 0x0

    goto :goto_34

    :cond_4d
    move-object/from16 v0, p8

    :goto_34
    if-eqz v33, :cond_4e

    const/4 v8, 0x0

    goto :goto_35

    :cond_4e
    move-object/from16 v8, p9

    :goto_35
    if-eqz v34, :cond_4f

    const/4 v11, 0x0

    goto :goto_36

    :cond_4f
    move/from16 v11, p10

    :goto_36
    if-eqz v28, :cond_50

    .line 281
    sget-object v16, Landroidx/compose/ui/text/input/VisualTransformation;->Companion:Landroidx/compose/ui/text/input/VisualTransformation$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/text/input/VisualTransformation$Companion;->getNone()Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object v16

    move-object/from16 v66, v16

    goto :goto_37

    :cond_50
    move-object/from16 v66, p12

    :goto_37
    if-eqz v21, :cond_51

    .line 282
    sget-object v16, Landroidx/compose/foundation/text/KeyboardOptions;->Companion:Landroidx/compose/foundation/text/KeyboardOptions$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/foundation/text/KeyboardOptions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardOptions;

    move-result-object v16

    move-object/from16 v67, v16

    goto :goto_38

    :cond_51
    move-object/from16 v67, p13

    :goto_38
    and-int/lit16 v1, v3, 0x4000

    if-eqz v1, :cond_52

    .line 283
    new-instance v1, Landroidx/compose/foundation/text/KeyboardActions;

    const/16 v16, 0x3f

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object/from16 p2, v1

    move/from16 p9, v16

    move-object/from16 p10, v19

    move-object/from16 p3, v21

    move-object/from16 p4, v22

    move-object/from16 p5, v24

    move-object/from16 p6, v27

    move-object/from16 p7, v28

    move-object/from16 p8, v29

    invoke-direct/range {p2 .. p10}, Landroidx/compose/foundation/text/KeyboardActions;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v16, -0xe001

    and-int v30, v30, v16

    goto :goto_39

    :cond_52
    move-object/from16 v1, p14

    :goto_39
    if-eqz v17, :cond_53

    const/16 v16, 0x0

    move/from16 v68, v16

    goto :goto_3a

    :cond_53
    move/from16 v68, p15

    :goto_3a
    and-int v16, v3, v23

    if-eqz v16, :cond_55

    if-eqz v68, :cond_54

    const/16 v16, 0x1

    goto :goto_3b

    :cond_54
    const v16, 0x7fffffff

    :goto_3b
    const v17, -0x380001

    and-int v30, v30, v17

    move/from16 v69, v16

    goto :goto_3c

    :cond_55
    move/from16 v69, p16

    :goto_3c
    if-eqz v18, :cond_56

    const/16 v70, 0x1

    goto :goto_3d

    :cond_56
    move/from16 v70, p17

    :goto_3d
    move-object/from16 p2, v0

    if-eqz v20, :cond_58

    const v0, 0x53609695

    .line 287
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 683
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .line 684
    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p3, v1

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_57

    .line 287
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v0

    .line 686
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 287
    :cond_57
    check-cast v0, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_3e

    :cond_58
    move-object/from16 p3, v1

    move-object/from16 v0, p18

    :goto_3e
    and-int v1, v3, v26

    if-eqz v1, :cond_59

    .line 288
    sget-object v1, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    move-object/from16 p4, v0

    const/4 v0, 0x6

    invoke-virtual {v1, v4, v0}, Landroidx/compose/material/TextFieldDefaults;->getTextFieldShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v0

    const v1, -0x70000001

    and-int v1, v30, v1

    goto :goto_3f

    :cond_59
    move-object/from16 p4, v0

    move-object/from16 v0, p19

    move/from16 v1, v30

    :goto_3f
    and-int v16, v3, v25

    if-eqz v16, :cond_5a

    .line 289
    sget-object v16, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    const/16 v62, 0x30

    const v63, 0x1fffff

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const-wide/16 v33, 0x0

    const-wide/16 v35, 0x0

    const-wide/16 v37, 0x0

    const-wide/16 v39, 0x0

    const-wide/16 v41, 0x0

    const-wide/16 v43, 0x0

    const-wide/16 v45, 0x0

    const-wide/16 v47, 0x0

    const-wide/16 v49, 0x0

    const-wide/16 v51, 0x0

    const-wide/16 v53, 0x0

    const-wide/16 v55, 0x0

    const-wide/16 v57, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    move-object/from16 v59, v4

    invoke-virtual/range {v16 .. v63}, Landroidx/compose/material/TextFieldDefaults;->textFieldColors-dx8h9Zs(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;

    move-result-object v4

    move-object/from16 v16, v59

    and-int/lit8 v65, v65, -0xf

    goto :goto_40

    :cond_5a
    move-object/from16 v16, v4

    move-object/from16 v4, p20

    :goto_40
    const/high16 v17, 0x200000

    and-int v17, v3, v17

    if-eqz v17, :cond_5c

    if-eqz v10, :cond_5b

    .line 291
    sget-object v17, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    const/16 v18, 0xf

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 p12, v17

    move/from16 p17, v18

    move-object/from16 p18, v19

    move/from16 p13, v20

    move/from16 p14, v21

    move/from16 p15, v22

    move/from16 p16, v23

    invoke-static/range {p12 .. p18}, Landroidx/compose/material/TextFieldDefaults;->textFieldWithLabelPadding-a9UjIt4$default(Landroidx/compose/material/TextFieldDefaults;FFFFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v17

    goto :goto_41

    .line 293
    :cond_5b
    sget-object v17, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    const/16 v18, 0xf

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 p12, v17

    move/from16 p17, v18

    move-object/from16 p18, v19

    move/from16 p13, v20

    move/from16 p14, v21

    move/from16 p15, v22

    move/from16 p16, v23

    invoke-static/range {p12 .. p18}, Landroidx/compose/material/TextFieldDefaults;->textFieldWithoutLabelPadding-a9UjIt4$default(Landroidx/compose/material/TextFieldDefaults;FFFFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v17

    :goto_41
    and-int/lit8 v65, v65, -0x71

    move-object v3, v12

    move-object v12, v4

    move-object v4, v3

    move-object/from16 v18, p3

    move v14, v5

    move-object v3, v10

    move-object/from16 v19, v17

    move-object/from16 v5, p2

    move-object/from16 v10, p4

    move-object/from16 p2, v0

    move/from16 v17, v7

    move-object v0, v9

    move v7, v11

    move-object/from16 v11, v66

    goto :goto_42

    :cond_5c
    move-object v3, v12

    move-object v12, v4

    move-object v4, v3

    move-object/from16 v18, p3

    move-object/from16 v19, p21

    move v14, v5

    move/from16 v17, v7

    move-object v3, v10

    move v7, v11

    move-object/from16 v11, v66

    move-object/from16 v5, p2

    move-object/from16 v10, p4

    move-object/from16 p2, v0

    move-object v0, v9

    :goto_42
    move/from16 v9, v68

    :goto_43
    invoke-interface/range {v16 .. v16}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v20

    if-eqz v20, :cond_5d

    const v2, -0x343df946    # -2.5431412E7f

    move-object/from16 p3, v3

    const-string v3, "com.stripe.android.uicore.elements.compat.CompatTextField (CompatTextField.kt:294)"

    .line 295
    invoke-static {v2, v14, v1, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_44

    :cond_5d
    move-object/from16 p3, v3

    :goto_44
    const v2, 0x5360d1a8

    move-object/from16 v3, v16

    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 297
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v20

    const-wide/16 v22, 0x10

    cmp-long v2, v20, v22

    if-eqz v2, :cond_5e

    goto :goto_45

    :cond_5e
    shr-int/lit8 v2, v14, 0x9

    and-int/lit8 v2, v2, 0xe

    shl-int/lit8 v16, v65, 0x3

    and-int/lit8 v16, v16, 0x70

    or-int v2, v2, v16

    .line 298
    invoke-interface {v12, v6, v3, v2}, Landroidx/compose/material/TextFieldColors;->textColor(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v20

    :goto_45
    move-wide/from16 v23, v20

    .line 297
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 300
    new-instance v22, Landroidx/compose/ui/text/TextStyle;

    const v52, 0xfffffe

    const/16 v53, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const-wide/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const-wide/16 v37, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const-wide/16 v44, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    invoke-direct/range {v22 .. v53}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v22

    invoke-virtual {v0, v2}, Landroidx/compose/ui/text/TextStyle;->merge(Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v16

    .line 305
    sget-object v2, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    .line 306
    move-object/from16 v20, v10

    check-cast v20, Landroidx/compose/foundation/interaction/InteractionSource;

    const/16 v21, 0x30

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 p12, v2

    move/from16 p14, v6

    move/from16 p15, v7

    move-object/from16 p17, v12

    move-object/from16 p13, v13

    move-object/from16 p16, v20

    move/from16 p20, v21

    move-object/from16 p21, v22

    move/from16 p18, v23

    move/from16 p19, v24

    invoke-static/range {p12 .. p21}, Landroidx/compose/material/TextFieldDefaults;->indicatorLine-gv0btCI$default(Landroidx/compose/material/TextFieldDefaults;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v20, p13

    .line 307
    invoke-static {v2, v7, v15}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt;->errorSemanticsWithDefault(Landroidx/compose/ui/Modifier;ZLjava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v21

    .line 312
    new-instance v2, Landroidx/compose/ui/graphics/SolidColor;

    and-int/lit8 v13, v1, 0xe

    shl-int/lit8 v22, v65, 0x3

    and-int/lit8 v22, v22, 0x70

    or-int v13, v13, v22

    invoke-interface {v12, v7, v3, v13}, Landroidx/compose/material/TextFieldColors;->cursorColor(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v13

    invoke-interface {v13}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroidx/compose/ui/graphics/Color;

    move-object/from16 p4, v0

    move/from16 v22, v1

    invoke-virtual {v13}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v0

    const/4 v13, 0x0

    invoke-direct {v2, v0, v1, v13}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v23, v2

    check-cast v23, Landroidx/compose/ui/graphics/Brush;

    .line 320
    new-instance v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;

    const/4 v15, 0x1

    move-object/from16 v1, p0

    move-object/from16 v24, p4

    move v2, v6

    move-object v6, v8

    move-object v8, v11

    move-object/from16 v13, v19

    move-object/from16 v11, p2

    move/from16 v19, v14

    move-object v14, v3

    move-object/from16 v3, p3

    invoke-direct/range {v0 .. v13}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$5;-><init>(Landroidx/compose/ui/text/input/TextFieldValue;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;)V

    move-object/from16 v27, v3

    move-object/from16 v28, v4

    move-object/from16 v29, v5

    move-object/from16 v30, v6

    move/from16 v26, v7

    move-object/from16 v31, v11

    move-object/from16 v25, v12

    move-object/from16 v32, v13

    move v6, v2

    move-object v11, v8

    move v8, v9

    const/16 v1, 0x36

    const v2, 0x5f7d38f7

    invoke-static {v2, v15, v0, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lkotlin/jvm/functions/Function3;

    const v0, 0xfc7e

    and-int v0, v19, v0

    shl-int/lit8 v1, v22, 0x9

    const/high16 v2, 0x380000

    and-int/2addr v2, v1

    or-int/2addr v0, v2

    const/high16 v2, 0x1c00000

    and-int/2addr v2, v1

    or-int/2addr v0, v2

    const/high16 v2, 0xe000000

    and-int/2addr v2, v1

    or-int/2addr v0, v2

    const/high16 v2, 0x70000000

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    shr-int/lit8 v1, v22, 0x15

    and-int/lit8 v1, v1, 0xe

    or-int v1, v1, v64

    shr-int/lit8 v2, v22, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v1, v2

    shr-int/lit8 v2, v22, 0xf

    and-int/lit16 v2, v2, 0x1c00

    or-int/2addr v1, v2

    const/16 v19, 0x1000

    const/4 v12, 0x0

    move v3, v6

    move-object v13, v10

    move-object/from16 v5, v16

    move/from16 v4, v17

    move-object/from16 v7, v18

    move-object/from16 v2, v21

    move-object/from16 v6, v67

    move/from16 v9, v69

    move/from16 v10, v70

    move/from16 v17, v0

    move/from16 v18, v1

    move-object/from16 v16, v14

    move-object/from16 v14, v23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 303
    invoke-static/range {v0 .. v19}, Landroidx/compose/foundation/text/BasicTextFieldKt;->BasicTextField(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    move-object v10, v13

    move v6, v3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_5f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_5f
    move v5, v4

    move v4, v6

    move-object v15, v7

    move/from16 v17, v9

    move-object/from16 v19, v10

    move-object v13, v11

    move-object/from16 v59, v16

    move-object/from16 v3, v20

    move-object/from16 v6, v24

    move-object/from16 v21, v25

    move/from16 v11, v26

    move-object/from16 v7, v27

    move-object/from16 v9, v29

    move-object/from16 v10, v30

    move-object/from16 v20, v31

    move-object/from16 v22, v32

    move-object/from16 v14, v67

    move/from16 v18, v70

    move/from16 v16, v8

    move-object/from16 v8, v28

    .line 339
    :goto_46
    invoke-interface/range {v59 .. v59}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_60

    move-object v1, v0

    new-instance v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$$ExternalSyntheticLambda2;

    move-object/from16 v2, p1

    move-object/from16 v12, p11

    move/from16 v23, p23

    move/from16 v24, p24

    move/from16 v25, p25

    move/from16 v26, p26

    move-object/from16 v71, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v26}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$$ExternalSyntheticLambda2;-><init>(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLjava/lang/String;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;IIII)V

    move-object/from16 v1, v71

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_60
    return-void
.end method

.method public static final CompatTextField(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLjava/lang/String;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;IIII)V
    .locals 72
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "ZZ",
            "Landroidx/compose/ui/text/TextStyle;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;Z",
            "Ljava/lang/String;",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            "Landroidx/compose/foundation/text/KeyboardOptions;",
            "Landroidx/compose/foundation/text/KeyboardActions;",
            "ZII",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material/TextFieldColors;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/runtime/Composer;",
            "IIII)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v14, p1

    move-object/from16 v15, p11

    move/from16 v0, p23

    move/from16 v2, p24

    move/from16 v3, p26

    const-string v4, "value"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onValueChange"

    invoke-static {v14, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, -0x13824e13

    move-object/from16 v5, p22

    .line 165
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v4

    and-int/lit8 v5, v3, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v5, v0, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_2

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_2
    move v5, v0

    :goto_1
    and-int/lit8 v8, v3, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v5, v5, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v0, 0x30

    if-nez v8, :cond_5

    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v5, v8

    :cond_5
    :goto_3
    and-int/lit8 v8, v3, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v5, v5, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v13, v0, 0x180

    if-nez v13, :cond_8

    move-object/from16 v13, p2

    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_7

    const/16 v16, 0x100

    goto :goto_4

    :cond_7
    const/16 v16, 0x80

    :goto_4
    or-int v5, v5, v16

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v13, p2

    :goto_6
    and-int/lit8 v16, v3, 0x8

    const/16 v17, 0x800

    const/16 v18, 0x400

    if-eqz v16, :cond_9

    or-int/lit16 v5, v5, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v6, v0, 0xc00

    if-nez v6, :cond_b

    move/from16 v6, p3

    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v19

    if-eqz v19, :cond_a

    move/from16 v19, v17

    goto :goto_7

    :cond_a
    move/from16 v19, v18

    :goto_7
    or-int v5, v5, v19

    goto :goto_9

    :cond_b
    :goto_8
    move/from16 v6, p3

    :goto_9
    and-int/lit8 v19, v3, 0x10

    const/16 v20, 0x4000

    if-eqz v19, :cond_c

    or-int/lit16 v5, v5, 0x6000

    goto :goto_b

    :cond_c
    and-int/lit16 v7, v0, 0x6000

    if-nez v7, :cond_e

    move/from16 v7, p4

    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v22

    if-eqz v22, :cond_d

    move/from16 v22, v20

    goto :goto_a

    :cond_d
    const/16 v22, 0x2000

    :goto_a
    or-int v5, v5, v22

    goto :goto_c

    :cond_e
    :goto_b
    move/from16 v7, p4

    :goto_c
    const/high16 v64, 0x30000

    and-int v22, v0, v64

    const/high16 v23, 0x10000

    if-nez v22, :cond_10

    and-int/lit8 v22, v3, 0x20

    move-object/from16 v9, p5

    if-nez v22, :cond_f

    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_f

    const/high16 v24, 0x20000

    goto :goto_d

    :cond_f
    move/from16 v24, v23

    :goto_d
    or-int v5, v5, v24

    goto :goto_e

    :cond_10
    move-object/from16 v9, p5

    :goto_e
    and-int/lit8 v24, v3, 0x40

    const/high16 v25, 0x100000

    const/high16 v26, 0x80000

    const/high16 v27, 0x180000

    if-eqz v24, :cond_11

    or-int v5, v5, v27

    move-object/from16 v10, p6

    goto :goto_10

    :cond_11
    and-int v27, v0, v27

    move-object/from16 v10, p6

    if-nez v27, :cond_13

    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_12

    move/from16 v28, v25

    goto :goto_f

    :cond_12
    move/from16 v28, v26

    :goto_f
    or-int v5, v5, v28

    :cond_13
    :goto_10
    and-int/lit16 v11, v3, 0x80

    const/high16 v29, 0xc00000

    if-eqz v11, :cond_14

    or-int v5, v5, v29

    move-object/from16 v12, p7

    goto :goto_12

    :cond_14
    and-int v30, v0, v29

    move-object/from16 v12, p7

    if-nez v30, :cond_16

    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_15

    const/high16 v31, 0x800000

    goto :goto_11

    :cond_15
    const/high16 v31, 0x400000

    :goto_11
    or-int v5, v5, v31

    :cond_16
    :goto_12
    and-int/lit16 v0, v3, 0x100

    const/high16 v31, 0x6000000

    if-eqz v0, :cond_17

    or-int v5, v5, v31

    goto :goto_14

    :cond_17
    and-int v32, p23, v31

    if-nez v32, :cond_19

    move/from16 v32, v0

    move-object/from16 v0, p8

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_18

    const/high16 v33, 0x4000000

    goto :goto_13

    :cond_18
    const/high16 v33, 0x2000000

    :goto_13
    or-int v5, v5, v33

    goto :goto_15

    :cond_19
    :goto_14
    move/from16 v32, v0

    move-object/from16 v0, p8

    :goto_15
    and-int/lit16 v0, v3, 0x200

    const/high16 v33, 0x30000000

    if-eqz v0, :cond_1a

    or-int v5, v5, v33

    goto :goto_17

    :cond_1a
    and-int v33, p23, v33

    if-nez v33, :cond_1c

    move/from16 v33, v0

    move-object/from16 v0, p9

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v34

    if-eqz v34, :cond_1b

    const/high16 v34, 0x20000000

    goto :goto_16

    :cond_1b
    const/high16 v34, 0x10000000

    :goto_16
    or-int v5, v5, v34

    goto :goto_18

    :cond_1c
    :goto_17
    move/from16 v33, v0

    move-object/from16 v0, p9

    :goto_18
    and-int/lit16 v0, v3, 0x400

    if-eqz v0, :cond_1d

    or-int/lit8 v34, v2, 0x6

    move/from16 v35, v34

    move/from16 v34, v0

    move/from16 v0, p10

    goto :goto_1a

    :cond_1d
    and-int/lit8 v34, v2, 0x6

    if-nez v34, :cond_1f

    move/from16 v34, v0

    move/from16 v0, p10

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v35

    if-eqz v35, :cond_1e

    const/16 v35, 0x4

    goto :goto_19

    :cond_1e
    const/16 v35, 0x2

    :goto_19
    or-int v35, v2, v35

    goto :goto_1a

    :cond_1f
    move/from16 v34, v0

    move/from16 v0, p10

    move/from16 v35, v2

    :goto_1a
    and-int/lit16 v0, v3, 0x800

    if-eqz v0, :cond_20

    or-int/lit8 v35, v35, 0x30

    goto :goto_1c

    :cond_20
    and-int/lit8 v0, v2, 0x30

    if-nez v0, :cond_22

    invoke-interface {v4, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_21

    const/16 v0, 0x20

    goto :goto_1b

    :cond_21
    const/16 v0, 0x10

    :goto_1b
    or-int v35, v35, v0

    :cond_22
    :goto_1c
    move/from16 v0, v35

    and-int/lit16 v1, v3, 0x1000

    if-eqz v1, :cond_23

    or-int/lit16 v0, v0, 0x180

    goto :goto_1e

    :cond_23
    move/from16 v35, v0

    and-int/lit16 v0, v2, 0x180

    if-nez v0, :cond_25

    move-object/from16 v0, p12

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v36

    if-eqz v36, :cond_24

    const/16 v28, 0x100

    goto :goto_1d

    :cond_24
    const/16 v28, 0x80

    :goto_1d
    or-int v28, v35, v28

    move/from16 v0, v28

    goto :goto_1e

    :cond_25
    move-object/from16 v0, p12

    move/from16 v0, v35

    :goto_1e
    move/from16 v28, v1

    and-int/lit16 v1, v3, 0x2000

    if-eqz v1, :cond_26

    or-int/lit16 v0, v0, 0xc00

    move/from16 v30, v0

    goto :goto_20

    :cond_26
    move/from16 v30, v0

    and-int/lit16 v0, v2, 0xc00

    if-nez v0, :cond_28

    move-object/from16 v0, p13

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v35

    if-eqz v35, :cond_27

    goto :goto_1f

    :cond_27
    move/from16 v17, v18

    :goto_1f
    or-int v17, v30, v17

    move/from16 v30, v17

    goto :goto_21

    :cond_28
    :goto_20
    move-object/from16 v0, p13

    :goto_21
    and-int/lit16 v0, v2, 0x6000

    if-nez v0, :cond_2b

    and-int/lit16 v0, v3, 0x4000

    if-nez v0, :cond_29

    move-object/from16 v0, p14

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_2a

    goto :goto_22

    :cond_29
    move-object/from16 v0, p14

    :cond_2a
    const/16 v20, 0x2000

    :goto_22
    or-int v30, v30, v20

    goto :goto_23

    :cond_2b
    move-object/from16 v0, p14

    :goto_23
    const v17, 0x8000

    and-int v17, v3, v17

    if-eqz v17, :cond_2c

    or-int v30, v30, v64

    move/from16 v0, p15

    goto :goto_25

    :cond_2c
    and-int v18, v2, v64

    move/from16 v0, p15

    if-nez v18, :cond_2e

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v18

    if-eqz v18, :cond_2d

    const/high16 v18, 0x20000

    goto :goto_24

    :cond_2d
    move/from16 v18, v23

    :goto_24
    or-int v30, v30, v18

    :cond_2e
    :goto_25
    const/high16 v18, 0x180000

    and-int v18, v2, v18

    if-nez v18, :cond_30

    and-int v18, v3, v23

    move/from16 v0, p16

    if-nez v18, :cond_2f

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v18

    if-eqz v18, :cond_2f

    move/from16 v18, v25

    goto :goto_26

    :cond_2f
    move/from16 v18, v26

    :goto_26
    or-int v30, v30, v18

    goto :goto_27

    :cond_30
    move/from16 v0, p16

    :goto_27
    const/high16 v18, 0x20000

    and-int v18, v3, v18

    if-eqz v18, :cond_31

    or-int v30, v30, v29

    move/from16 v0, p17

    goto :goto_29

    :cond_31
    and-int v20, v2, v29

    move/from16 v0, p17

    if-nez v20, :cond_33

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v20

    if-eqz v20, :cond_32

    const/high16 v20, 0x800000

    goto :goto_28

    :cond_32
    const/high16 v20, 0x400000

    :goto_28
    or-int v30, v30, v20

    :cond_33
    :goto_29
    const/high16 v20, 0x40000

    and-int v20, v3, v20

    if-eqz v20, :cond_34

    or-int v30, v30, v31

    move-object/from16 v0, p18

    goto :goto_2b

    :cond_34
    and-int v29, v2, v31

    move-object/from16 v0, p18

    if-nez v29, :cond_36

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_35

    const/high16 v29, 0x4000000

    goto :goto_2a

    :cond_35
    const/high16 v29, 0x2000000

    :goto_2a
    or-int v30, v30, v29

    :cond_36
    :goto_2b
    const/high16 v29, 0x30000000

    and-int v29, v2, v29

    if-nez v29, :cond_38

    and-int v29, v3, v26

    move-object/from16 v0, p19

    if-nez v29, :cond_37

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_37

    const/high16 v29, 0x20000000

    goto :goto_2c

    :cond_37
    const/high16 v29, 0x10000000

    :goto_2c
    or-int v30, v30, v29

    goto :goto_2d

    :cond_38
    move-object/from16 v0, p19

    :goto_2d
    and-int/lit8 v29, p25, 0x6

    if-nez v29, :cond_3a

    and-int v29, v3, v25

    move-object/from16 v0, p20

    if-nez v29, :cond_39

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_39

    const/16 v21, 0x4

    goto :goto_2e

    :cond_39
    const/16 v21, 0x2

    :goto_2e
    or-int v21, p25, v21

    goto :goto_2f

    :cond_3a
    move-object/from16 v0, p20

    move/from16 v21, p25

    :goto_2f
    and-int/lit8 v29, p25, 0x30

    if-nez v29, :cond_3c

    const/high16 v29, 0x200000

    and-int v29, v3, v29

    move-object/from16 v0, p21

    if-nez v29, :cond_3b

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_3b

    const/16 v22, 0x20

    goto :goto_30

    :cond_3b
    const/16 v22, 0x10

    :goto_30
    or-int v21, v21, v22

    goto :goto_31

    :cond_3c
    move-object/from16 v0, p21

    :goto_31
    move/from16 v65, v21

    const v21, 0x12492493

    and-int v0, v5, v21

    move/from16 v21, v1

    const v1, 0x12492492

    if-ne v0, v1, :cond_3e

    const v0, 0x12492493

    and-int v0, v30, v0

    const v1, 0x12492492

    if-ne v0, v1, :cond_3e

    and-int/lit8 v0, v65, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3e

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_3d

    goto :goto_32

    .line 209
    :cond_3d
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v11, p10

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v59, v4

    move v4, v6

    move v5, v7

    move-object v6, v9

    move-object v7, v10

    move-object v8, v12

    move-object v3, v13

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v13, p12

    goto/16 :goto_46

    .line 165
    :cond_3e
    :goto_32
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, p23, 0x1

    if-eqz v0, :cond_46

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_3f

    goto :goto_33

    .line 163
    :cond_3f
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v3, 0x20

    if-eqz v0, :cond_40

    const v0, -0x70001

    and-int/2addr v5, v0

    :cond_40
    and-int/lit16 v0, v3, 0x4000

    if-eqz v0, :cond_41

    const v0, -0xe001

    and-int v30, v30, v0

    :cond_41
    and-int v0, v3, v23

    if-eqz v0, :cond_42

    const v0, -0x380001

    and-int v30, v30, v0

    :cond_42
    and-int v0, v3, v26

    if-eqz v0, :cond_43

    const v0, -0x70000001

    and-int v30, v30, v0

    :cond_43
    and-int v0, v3, v25

    if-eqz v0, :cond_44

    and-int/lit8 v65, v65, -0xf

    :cond_44
    const/high16 v0, 0x200000

    and-int/2addr v0, v3

    if-eqz v0, :cond_45

    and-int/lit8 v65, v65, -0x71

    :cond_45
    move-object/from16 v8, p9

    move-object/from16 v11, p12

    move-object/from16 v67, p13

    move-object/from16 v18, p14

    move/from16 v69, p16

    move/from16 v70, p17

    move-object/from16 p2, p19

    move-object/from16 v19, p21

    move-object/from16 v16, v4

    move v14, v5

    move/from16 v17, v7

    move-object v0, v9

    move-object v3, v10

    move-object v4, v12

    move/from16 v1, v30

    move-object/from16 v5, p8

    move/from16 v7, p10

    move/from16 v9, p15

    move-object/from16 v10, p18

    move-object/from16 v12, p20

    goto/16 :goto_43

    :cond_46
    :goto_33
    if-eqz v8, :cond_47

    .line 141
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move-object v13, v0

    :cond_47
    if-eqz v16, :cond_48

    const/4 v6, 0x1

    :cond_48
    if-eqz v19, :cond_49

    const/4 v0, 0x0

    move v7, v0

    :cond_49
    and-int/lit8 v0, v3, 0x20

    if-eqz v0, :cond_4a

    .line 144
    invoke-static {}, Landroidx/compose/material/TextKt;->getLocalTextStyle()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/CompositionLocal;

    const v8, 0x789c5f52

    const-string v9, "CC:CompositionLocal.kt#9igjgp"

    .line 673
    invoke-static {v4, v8, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    check-cast v0, Landroidx/compose/ui/text/TextStyle;

    const v8, -0x70001

    and-int/2addr v5, v8

    move-object v9, v0

    :cond_4a
    if-eqz v24, :cond_4b

    const/4 v10, 0x0

    :cond_4b
    if-eqz v11, :cond_4c

    const/4 v12, 0x0

    :cond_4c
    if-eqz v32, :cond_4d

    const/4 v0, 0x0

    goto :goto_34

    :cond_4d
    move-object/from16 v0, p8

    :goto_34
    if-eqz v33, :cond_4e

    const/4 v8, 0x0

    goto :goto_35

    :cond_4e
    move-object/from16 v8, p9

    :goto_35
    if-eqz v34, :cond_4f

    const/4 v11, 0x0

    goto :goto_36

    :cond_4f
    move/from16 v11, p10

    :goto_36
    if-eqz v28, :cond_50

    .line 151
    sget-object v16, Landroidx/compose/ui/text/input/VisualTransformation;->Companion:Landroidx/compose/ui/text/input/VisualTransformation$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/text/input/VisualTransformation$Companion;->getNone()Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object v16

    move-object/from16 v66, v16

    goto :goto_37

    :cond_50
    move-object/from16 v66, p12

    :goto_37
    if-eqz v21, :cond_51

    .line 152
    sget-object v16, Landroidx/compose/foundation/text/KeyboardOptions;->Companion:Landroidx/compose/foundation/text/KeyboardOptions$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/foundation/text/KeyboardOptions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardOptions;

    move-result-object v16

    move-object/from16 v67, v16

    goto :goto_38

    :cond_51
    move-object/from16 v67, p13

    :goto_38
    and-int/lit16 v1, v3, 0x4000

    if-eqz v1, :cond_52

    .line 153
    new-instance v1, Landroidx/compose/foundation/text/KeyboardActions;

    const/16 v16, 0x3f

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object/from16 p2, v1

    move/from16 p9, v16

    move-object/from16 p10, v19

    move-object/from16 p3, v21

    move-object/from16 p4, v22

    move-object/from16 p5, v24

    move-object/from16 p6, v27

    move-object/from16 p7, v28

    move-object/from16 p8, v29

    invoke-direct/range {p2 .. p10}, Landroidx/compose/foundation/text/KeyboardActions;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v16, -0xe001

    and-int v30, v30, v16

    goto :goto_39

    :cond_52
    move-object/from16 v1, p14

    :goto_39
    if-eqz v17, :cond_53

    const/16 v16, 0x0

    move/from16 v68, v16

    goto :goto_3a

    :cond_53
    move/from16 v68, p15

    :goto_3a
    and-int v16, v3, v23

    if-eqz v16, :cond_55

    if-eqz v68, :cond_54

    const/16 v16, 0x1

    goto :goto_3b

    :cond_54
    const v16, 0x7fffffff

    :goto_3b
    const v17, -0x380001

    and-int v30, v30, v17

    move/from16 v69, v16

    goto :goto_3c

    :cond_55
    move/from16 v69, p16

    :goto_3c
    if-eqz v18, :cond_56

    const/16 v70, 0x1

    goto :goto_3d

    :cond_56
    move/from16 v70, p17

    :goto_3d
    move-object/from16 p2, v0

    if-eqz v20, :cond_58

    const v0, 0x535d2755

    .line 157
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 674
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .line 675
    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p3, v1

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_57

    .line 157
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v0

    .line 677
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 157
    :cond_57
    check-cast v0, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_3e

    :cond_58
    move-object/from16 p3, v1

    move-object/from16 v0, p18

    :goto_3e
    and-int v1, v3, v26

    if-eqz v1, :cond_59

    .line 158
    sget-object v1, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    move-object/from16 p4, v0

    const/4 v0, 0x6

    invoke-virtual {v1, v4, v0}, Landroidx/compose/material/TextFieldDefaults;->getTextFieldShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v0

    const v1, -0x70000001

    and-int v1, v30, v1

    goto :goto_3f

    :cond_59
    move-object/from16 p4, v0

    move-object/from16 v0, p19

    move/from16 v1, v30

    :goto_3f
    and-int v16, v3, v25

    if-eqz v16, :cond_5a

    .line 159
    sget-object v16, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    const/16 v62, 0x30

    const v63, 0x1fffff

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const-wide/16 v33, 0x0

    const-wide/16 v35, 0x0

    const-wide/16 v37, 0x0

    const-wide/16 v39, 0x0

    const-wide/16 v41, 0x0

    const-wide/16 v43, 0x0

    const-wide/16 v45, 0x0

    const-wide/16 v47, 0x0

    const-wide/16 v49, 0x0

    const-wide/16 v51, 0x0

    const-wide/16 v53, 0x0

    const-wide/16 v55, 0x0

    const-wide/16 v57, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    move-object/from16 v59, v4

    invoke-virtual/range {v16 .. v63}, Landroidx/compose/material/TextFieldDefaults;->textFieldColors-dx8h9Zs(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;

    move-result-object v4

    move-object/from16 v16, v59

    and-int/lit8 v65, v65, -0xf

    goto :goto_40

    :cond_5a
    move-object/from16 v16, v4

    move-object/from16 v4, p20

    :goto_40
    const/high16 v17, 0x200000

    and-int v17, v3, v17

    if-eqz v17, :cond_5c

    if-eqz v10, :cond_5b

    .line 161
    sget-object v17, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    const/16 v18, 0xf

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 p12, v17

    move/from16 p17, v18

    move-object/from16 p18, v19

    move/from16 p13, v20

    move/from16 p14, v21

    move/from16 p15, v22

    move/from16 p16, v23

    invoke-static/range {p12 .. p18}, Landroidx/compose/material/TextFieldDefaults;->textFieldWithLabelPadding-a9UjIt4$default(Landroidx/compose/material/TextFieldDefaults;FFFFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v17

    goto :goto_41

    .line 163
    :cond_5b
    sget-object v17, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    const/16 v18, 0xf

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 p12, v17

    move/from16 p17, v18

    move-object/from16 p18, v19

    move/from16 p13, v20

    move/from16 p14, v21

    move/from16 p15, v22

    move/from16 p16, v23

    invoke-static/range {p12 .. p18}, Landroidx/compose/material/TextFieldDefaults;->textFieldWithoutLabelPadding-a9UjIt4$default(Landroidx/compose/material/TextFieldDefaults;FFFFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v17

    :goto_41
    and-int/lit8 v65, v65, -0x71

    move-object v3, v12

    move-object v12, v4

    move-object v4, v3

    move-object/from16 v18, p3

    move v14, v5

    move-object v3, v10

    move-object/from16 v19, v17

    move-object/from16 v5, p2

    move-object/from16 v10, p4

    move-object/from16 p2, v0

    move/from16 v17, v7

    move-object v0, v9

    move v7, v11

    move-object/from16 v11, v66

    goto :goto_42

    :cond_5c
    move-object v3, v12

    move-object v12, v4

    move-object v4, v3

    move-object/from16 v18, p3

    move-object/from16 v19, p21

    move v14, v5

    move/from16 v17, v7

    move-object v3, v10

    move v7, v11

    move-object/from16 v11, v66

    move-object/from16 v5, p2

    move-object/from16 v10, p4

    move-object/from16 p2, v0

    move-object v0, v9

    :goto_42
    move/from16 v9, v68

    :goto_43
    invoke-interface/range {v16 .. v16}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v20

    if-eqz v20, :cond_5d

    const v2, -0x13824e13

    move-object/from16 p3, v3

    const-string v3, "com.stripe.android.uicore.elements.compat.CompatTextField (CompatTextField.kt:164)"

    .line 165
    invoke-static {v2, v14, v1, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_44

    :cond_5d
    move-object/from16 p3, v3

    :goto_44
    const v2, 0x535d6268

    move-object/from16 v3, v16

    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 167
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v20

    const-wide/16 v22, 0x10

    cmp-long v2, v20, v22

    if-eqz v2, :cond_5e

    goto :goto_45

    :cond_5e
    shr-int/lit8 v2, v14, 0x9

    and-int/lit8 v2, v2, 0xe

    shl-int/lit8 v16, v65, 0x3

    and-int/lit8 v16, v16, 0x70

    or-int v2, v2, v16

    .line 168
    invoke-interface {v12, v6, v3, v2}, Landroidx/compose/material/TextFieldColors;->textColor(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v20

    :goto_45
    move-wide/from16 v23, v20

    .line 167
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 170
    new-instance v22, Landroidx/compose/ui/text/TextStyle;

    const v52, 0xfffffe

    const/16 v53, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const-wide/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const-wide/16 v37, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const-wide/16 v44, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    invoke-direct/range {v22 .. v53}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v22

    invoke-virtual {v0, v2}, Landroidx/compose/ui/text/TextStyle;->merge(Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v16

    .line 175
    sget-object v2, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    .line 176
    move-object/from16 v20, v10

    check-cast v20, Landroidx/compose/foundation/interaction/InteractionSource;

    const/16 v21, 0x30

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 p12, v2

    move/from16 p14, v6

    move/from16 p15, v7

    move-object/from16 p17, v12

    move-object/from16 p13, v13

    move-object/from16 p16, v20

    move/from16 p20, v21

    move-object/from16 p21, v22

    move/from16 p18, v23

    move/from16 p19, v24

    invoke-static/range {p12 .. p21}, Landroidx/compose/material/TextFieldDefaults;->indicatorLine-gv0btCI$default(Landroidx/compose/material/TextFieldDefaults;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v20, p13

    .line 177
    invoke-static {v2, v7, v15}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt;->errorSemanticsWithDefault(Landroidx/compose/ui/Modifier;ZLjava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v21

    .line 182
    new-instance v2, Landroidx/compose/ui/graphics/SolidColor;

    and-int/lit8 v13, v1, 0xe

    shl-int/lit8 v22, v65, 0x3

    and-int/lit8 v22, v22, 0x70

    or-int v13, v13, v22

    invoke-interface {v12, v7, v3, v13}, Landroidx/compose/material/TextFieldColors;->cursorColor(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v13

    invoke-interface {v13}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroidx/compose/ui/graphics/Color;

    move-object/from16 p4, v0

    move/from16 v22, v1

    invoke-virtual {v13}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v0

    const/4 v13, 0x0

    invoke-direct {v2, v0, v1, v13}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v23, v2

    check-cast v23, Landroidx/compose/ui/graphics/Brush;

    .line 190
    new-instance v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$2;

    const/4 v15, 0x1

    move-object/from16 v1, p0

    move-object/from16 v24, p4

    move v2, v6

    move-object v6, v8

    move-object v8, v11

    move-object/from16 v13, v19

    move-object/from16 v11, p2

    move/from16 v19, v14

    move-object v14, v3

    move-object/from16 v3, p3

    invoke-direct/range {v0 .. v13}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$CompatTextField$2;-><init>(Ljava/lang/String;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;)V

    move-object/from16 v27, v3

    move-object/from16 v28, v4

    move-object/from16 v29, v5

    move-object/from16 v30, v6

    move/from16 v26, v7

    move-object/from16 v31, v11

    move-object/from16 v25, v12

    move-object/from16 v32, v13

    move v6, v2

    move-object v11, v8

    move v8, v9

    const/16 v1, 0x36

    const v2, -0x17e68ed6

    invoke-static {v2, v15, v0, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lkotlin/jvm/functions/Function3;

    const v0, 0xfc7e

    and-int v0, v19, v0

    shl-int/lit8 v1, v22, 0x9

    const/high16 v2, 0x380000

    and-int/2addr v2, v1

    or-int/2addr v0, v2

    const/high16 v2, 0x1c00000

    and-int/2addr v2, v1

    or-int/2addr v0, v2

    const/high16 v2, 0xe000000

    and-int/2addr v2, v1

    or-int/2addr v0, v2

    const/high16 v2, 0x70000000

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    shr-int/lit8 v1, v22, 0x15

    and-int/lit8 v1, v1, 0xe

    or-int v1, v1, v64

    shr-int/lit8 v2, v22, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v1, v2

    shr-int/lit8 v2, v22, 0xf

    and-int/lit16 v2, v2, 0x1c00

    or-int/2addr v1, v2

    const/16 v19, 0x1000

    const/4 v12, 0x0

    move v3, v6

    move-object v13, v10

    move-object/from16 v5, v16

    move/from16 v4, v17

    move-object/from16 v7, v18

    move-object/from16 v2, v21

    move-object/from16 v6, v67

    move/from16 v9, v69

    move/from16 v10, v70

    move/from16 v17, v0

    move/from16 v18, v1

    move-object/from16 v16, v14

    move-object/from16 v14, v23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 173
    invoke-static/range {v0 .. v19}, Landroidx/compose/foundation/text/BasicTextFieldKt;->BasicTextField(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    move-object v10, v13

    move v6, v3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_5f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_5f
    move v5, v4

    move v4, v6

    move-object v15, v7

    move/from16 v17, v9

    move-object/from16 v19, v10

    move-object v13, v11

    move-object/from16 v59, v16

    move-object/from16 v3, v20

    move-object/from16 v6, v24

    move-object/from16 v21, v25

    move/from16 v11, v26

    move-object/from16 v7, v27

    move-object/from16 v9, v29

    move-object/from16 v10, v30

    move-object/from16 v20, v31

    move-object/from16 v22, v32

    move-object/from16 v14, v67

    move/from16 v18, v70

    move/from16 v16, v8

    move-object/from16 v8, v28

    .line 209
    :goto_46
    invoke-interface/range {v59 .. v59}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_60

    move-object v1, v0

    new-instance v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$$ExternalSyntheticLambda3;

    move-object/from16 v2, p1

    move-object/from16 v12, p11

    move/from16 v23, p23

    move/from16 v24, p24

    move/from16 v25, p25

    move/from16 v26, p26

    move-object/from16 v71, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v26}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$$ExternalSyntheticLambda3;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLjava/lang/String;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;IIII)V

    move-object/from16 v1, v71

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_60
    return-void
.end method

.method private static final CompatTextField$lambda$2(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLjava/lang/String;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;IIIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 28

    or-int/lit8 v0, p22, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v24

    invoke-static/range {p23 .. p23}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v25

    invoke-static/range {p24 .. p24}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v26

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move/from16 v27, p25

    move-object/from16 v23, p26

    invoke-static/range {v1 .. v27}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt;->CompatTextField(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLjava/lang/String;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;IIII)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final CompatTextField$lambda$5(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLjava/lang/String;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;IIIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 28

    or-int/lit8 v0, p22, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v24

    invoke-static/range {p23 .. p23}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v25

    invoke-static/range {p24 .. p24}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v26

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move/from16 v27, p25

    move-object/from16 v23, p26

    invoke-static/range {v1 .. v27}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt;->CompatTextField(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLjava/lang/String;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;IIII)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public static final Decoration-euL9pac(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroidx/compose/ui/text/TextStyle;",
            "Ljava/lang/Float;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v6, p6

    const-string v0, "content"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x3ccf2264

    .line 545
    invoke-interface {p5, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    and-int/lit8 v2, p7, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v6, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v6, 0x6

    if-nez v2, :cond_2

    invoke-interface {v1, p0, p1}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v6

    goto :goto_1

    :cond_2
    move v2, v6

    :goto_1
    and-int/lit8 v3, p7, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_5

    invoke-interface {v1, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, p7, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_8

    invoke-interface {v1, p3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v2, v8

    :cond_8
    :goto_5
    and-int/lit8 v8, p7, 0x8

    if-eqz v8, :cond_9

    or-int/lit16 v2, v2, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v8, v6, 0xc00

    if-nez v8, :cond_b

    invoke-interface {v1, p4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    const/16 v8, 0x800

    goto :goto_6

    :cond_a
    const/16 v8, 0x400

    :goto_6
    or-int/2addr v2, v8

    :cond_b
    :goto_7
    and-int/lit16 v8, v2, 0x493

    const/16 v9, 0x492

    if-ne v8, v9, :cond_d

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v8

    if-nez v8, :cond_c

    goto :goto_9

    .line 562
    :cond_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v4, p3

    :goto_8
    move-object v3, p2

    goto :goto_c

    :cond_d
    :goto_9
    const/4 v8, 0x0

    if-eqz v3, :cond_e

    move-object p2, v8

    :cond_e
    if-eqz v4, :cond_f

    goto :goto_a

    :cond_f
    move-object v8, p3

    .line 541
    :goto_a
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_10

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.uicore.elements.compat.Decoration (CompatTextField.kt:544)"

    .line 545
    invoke-static {v0, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 546
    :cond_10
    new-instance v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$Decoration$colorAndEmphasis$1;

    invoke-direct {v0, p0, p1, v8, p4}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$Decoration$colorAndEmphasis$1;-><init>(JLjava/lang/Float;Lkotlin/jvm/functions/Function2;)V

    const/16 v3, 0x36

    const v4, 0x319f1d26

    const/4 v7, 0x1

    invoke-static {v4, v7, v0, v1, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    if-eqz p2, :cond_11

    const v3, 0x111efbdb

    .line 561
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    shr-int/lit8 v2, v2, 0x3

    and-int/lit8 v2, v2, 0xe

    or-int/lit8 v2, v2, 0x30

    invoke-static {p2, v0, v1, v2}, Landroidx/compose/material/TextKt;->ProvideTextStyle(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    goto :goto_b

    :cond_11
    const v2, 0x111f023f

    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_b
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_12
    move-object v4, v8

    goto :goto_8

    .line 562
    :goto_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p2

    if-eqz p2, :cond_13

    new-instance v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$$ExternalSyntheticLambda4;

    move-wide v1, p0

    move-object v5, p4

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$$ExternalSyntheticLambda4;-><init>(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;II)V

    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_13
    return-void
.end method

.method private static final Decoration_euL9pac$lambda$19(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v6

    move-wide v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt;->Decoration-euL9pac(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final InsetDecorationBox(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V
    .locals 65
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;Z",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            "Z",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material/TextFieldColors;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v15, p15

    move/from16 v0, p16

    move/from16 v1, p17

    const v3, 0x556fe5ed

    move-object/from16 v4, p14

    .line 362
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v4

    and-int/lit8 v5, v1, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v5, v15, 0x6

    move v8, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v15, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x4

    goto :goto_0

    :cond_1
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v8, v15

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v8, v15

    :goto_1
    and-int/lit8 v9, v1, 0x2

    if-eqz v9, :cond_3

    or-int/lit8 v8, v8, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v9, v15, 0x30

    if-nez v9, :cond_5

    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v8, v9

    :cond_5
    :goto_3
    and-int/lit8 v9, v1, 0x4

    if-eqz v9, :cond_6

    or-int/lit16 v8, v8, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v14, v15, 0x180

    if-nez v14, :cond_8

    move/from16 v14, p2

    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_7

    const/16 v16, 0x100

    goto :goto_4

    :cond_7
    const/16 v16, 0x80

    :goto_4
    or-int v8, v8, v16

    goto :goto_6

    :cond_8
    :goto_5
    move/from16 v14, p2

    :goto_6
    and-int/lit8 v16, v1, 0x8

    const/16 v17, 0x400

    const/16 v18, 0x800

    if-eqz v16, :cond_9

    or-int/lit16 v8, v8, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v6, v15, 0xc00

    if-nez v6, :cond_b

    move-object/from16 v6, p3

    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_a

    move/from16 v19, v18

    goto :goto_7

    :cond_a
    move/from16 v19, v17

    :goto_7
    or-int v8, v8, v19

    goto :goto_9

    :cond_b
    :goto_8
    move-object/from16 v6, p3

    :goto_9
    and-int/lit8 v19, v1, 0x10

    if-eqz v19, :cond_c

    or-int/lit16 v8, v8, 0x6000

    goto :goto_b

    :cond_c
    and-int/lit16 v7, v15, 0x6000

    if-nez v7, :cond_e

    move-object/from16 v7, p4

    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_d

    const/16 v21, 0x4000

    goto :goto_a

    :cond_d
    const/16 v21, 0x2000

    :goto_a
    or-int v8, v8, v21

    goto :goto_c

    :cond_e
    :goto_b
    move-object/from16 v7, p4

    :goto_c
    and-int/lit8 v21, v1, 0x20

    const/high16 v22, 0x30000

    if-eqz v21, :cond_f

    or-int v8, v8, v22

    move-object/from16 v10, p5

    goto :goto_e

    :cond_f
    and-int v22, v15, v22

    move-object/from16 v10, p5

    if-nez v22, :cond_11

    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_10

    const/high16 v23, 0x20000

    goto :goto_d

    :cond_10
    const/high16 v23, 0x10000

    :goto_d
    or-int v8, v8, v23

    :cond_11
    :goto_e
    and-int/lit8 v23, v1, 0x40

    const/high16 v24, 0x180000

    if-eqz v23, :cond_12

    or-int v8, v8, v24

    move-object/from16 v11, p6

    goto :goto_10

    :cond_12
    and-int v24, v15, v24

    move-object/from16 v11, p6

    if-nez v24, :cond_14

    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_13

    const/high16 v25, 0x100000

    goto :goto_f

    :cond_13
    const/high16 v25, 0x80000

    :goto_f
    or-int v8, v8, v25

    :cond_14
    :goto_10
    and-int/lit16 v12, v1, 0x80

    const/high16 v26, 0xc00000

    if-eqz v12, :cond_15

    or-int v8, v8, v26

    move/from16 v13, p7

    goto :goto_12

    :cond_15
    and-int v26, v15, v26

    move/from16 v13, p7

    if-nez v26, :cond_17

    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v27

    if-eqz v27, :cond_16

    const/high16 v27, 0x800000

    goto :goto_11

    :cond_16
    const/high16 v27, 0x400000

    :goto_11
    or-int v8, v8, v27

    :cond_17
    :goto_12
    and-int/lit16 v3, v1, 0x100

    const/high16 v27, 0x6000000

    if-eqz v3, :cond_18

    or-int v8, v8, v27

    goto :goto_14

    :cond_18
    and-int v27, v15, v27

    if-nez v27, :cond_1a

    move/from16 v27, v3

    move-object/from16 v3, p8

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_19

    const/high16 v28, 0x4000000

    goto :goto_13

    :cond_19
    const/high16 v28, 0x2000000

    :goto_13
    or-int v8, v8, v28

    goto :goto_15

    :cond_1a
    :goto_14
    move/from16 v27, v3

    move-object/from16 v3, p8

    :goto_15
    and-int/lit16 v3, v1, 0x200

    const/high16 v28, 0x30000000

    if-eqz v3, :cond_1b

    or-int v8, v8, v28

    goto :goto_17

    :cond_1b
    and-int v28, v15, v28

    if-nez v28, :cond_1d

    move/from16 v28, v3

    move/from16 v3, p9

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v29

    if-eqz v29, :cond_1c

    const/high16 v29, 0x20000000

    goto :goto_16

    :cond_1c
    const/high16 v29, 0x10000000

    :goto_16
    or-int v8, v8, v29

    goto :goto_18

    :cond_1d
    :goto_17
    move/from16 v28, v3

    move/from16 v3, p9

    :goto_18
    and-int/lit16 v3, v1, 0x400

    if-eqz v3, :cond_1e

    or-int/lit8 v20, v0, 0x6

    move/from16 v29, v3

    move-object/from16 v3, p10

    goto :goto_1a

    :cond_1e
    and-int/lit8 v29, v0, 0x6

    if-nez v29, :cond_20

    move/from16 v29, v3

    move-object/from16 v3, p10

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_1f

    const/16 v20, 0x4

    goto :goto_19

    :cond_1f
    const/16 v20, 0x2

    :goto_19
    or-int v20, v0, v20

    goto :goto_1a

    :cond_20
    move/from16 v29, v3

    move-object/from16 v3, p10

    move/from16 v20, v0

    :goto_1a
    and-int/lit8 v30, v0, 0x30

    if-nez v30, :cond_23

    and-int/lit16 v3, v1, 0x800

    if-nez v3, :cond_21

    move-object/from16 v3, p11

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_22

    const/16 v22, 0x20

    goto :goto_1b

    :cond_21
    move-object/from16 v3, p11

    :cond_22
    const/16 v22, 0x10

    :goto_1b
    or-int v20, v20, v22

    goto :goto_1c

    :cond_23
    move-object/from16 v3, p11

    :goto_1c
    and-int/lit16 v3, v0, 0x180

    if-nez v3, :cond_26

    and-int/lit16 v3, v1, 0x1000

    if-nez v3, :cond_24

    move-object/from16 v3, p12

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_25

    const/16 v25, 0x100

    goto :goto_1d

    :cond_24
    move-object/from16 v3, p12

    :cond_25
    const/16 v25, 0x80

    :goto_1d
    or-int v20, v20, v25

    goto :goto_1e

    :cond_26
    move-object/from16 v3, p12

    :goto_1e
    and-int/lit16 v3, v0, 0xc00

    if-nez v3, :cond_29

    and-int/lit16 v3, v1, 0x2000

    if-nez v3, :cond_27

    move-object/from16 v3, p13

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_28

    move/from16 v17, v18

    goto :goto_1f

    :cond_27
    move-object/from16 v3, p13

    :cond_28
    :goto_1f
    or-int v20, v20, v17

    goto :goto_20

    :cond_29
    move-object/from16 v3, p13

    :goto_20
    move/from16 v0, v20

    const v17, 0x12492493

    and-int v3, v8, v17

    const v5, 0x12492492

    if-ne v3, v5, :cond_2b

    and-int/lit16 v3, v0, 0x493

    const/16 v5, 0x492

    if-ne v3, v5, :cond_2b

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_2a

    goto :goto_21

    .line 409
    :cond_2a
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v9, p8

    move-object/from16 v12, p11

    move-object/from16 v30, v4

    move-object v4, v6

    move-object v5, v7

    move-object v6, v10

    move-object v7, v11

    move v8, v13

    move v3, v14

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    goto/16 :goto_30

    .line 362
    :cond_2b
    :goto_21
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v3, v15, 0x1

    if-eqz v3, :cond_30

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v3

    if-eqz v3, :cond_2c

    goto :goto_23

    .line 360
    :cond_2c
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit16 v3, v1, 0x800

    if-eqz v3, :cond_2d

    and-int/lit8 v0, v0, -0x71

    :cond_2d
    and-int/lit16 v3, v1, 0x1000

    if-eqz v3, :cond_2e

    and-int/lit16 v0, v0, -0x381

    :cond_2e
    and-int/lit16 v3, v1, 0x2000

    if-eqz v3, :cond_2f

    and-int/lit16 v0, v0, -0x1c01

    :cond_2f
    move-object/from16 v18, p8

    move/from16 v23, p9

    move-object/from16 v5, p10

    move-object/from16 v28, p11

    move-object/from16 v29, p12

    move-object/from16 v3, p13

    move-object/from16 v19, v6

    move-object/from16 v20, v7

    move-object/from16 v21, v10

    move-object/from16 v22, v11

    :goto_22
    move/from16 v25, v13

    move/from16 v24, v14

    goto/16 :goto_2c

    :cond_30
    :goto_23
    if-eqz v9, :cond_31

    const/4 v14, 0x1

    :cond_31
    const/4 v3, 0x0

    if-eqz v16, :cond_32

    move-object v6, v3

    :cond_32
    if-eqz v19, :cond_33

    move-object v7, v3

    :cond_33
    if-eqz v21, :cond_34

    move-object v10, v3

    :cond_34
    if-eqz v23, :cond_35

    goto :goto_24

    :cond_35
    move-object v3, v11

    :goto_24
    if-eqz v12, :cond_36

    const/4 v13, 0x0

    :cond_36
    if-eqz v27, :cond_37

    .line 352
    sget-object v9, Landroidx/compose/ui/text/input/VisualTransformation;->Companion:Landroidx/compose/ui/text/input/VisualTransformation$Companion;

    invoke-virtual {v9}, Landroidx/compose/ui/text/input/VisualTransformation$Companion;->getNone()Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object v9

    goto :goto_25

    :cond_37
    move-object/from16 v9, p8

    :goto_25
    if-eqz v28, :cond_38

    const/4 v11, 0x0

    goto :goto_26

    :cond_38
    move/from16 v11, p9

    :goto_26
    if-eqz v29, :cond_3a

    const v12, 0xf708c22

    .line 354
    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 691
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    .line 692
    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v12, v5, :cond_39

    .line 354
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v12

    .line 694
    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 354
    :cond_39
    move-object v5, v12

    check-cast v5, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_27

    :cond_3a
    move-object/from16 v5, p10

    :goto_27
    and-int/lit16 v12, v1, 0x800

    if-eqz v12, :cond_3b

    .line 355
    sget-object v12, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    move/from16 v16, v0

    const/4 v0, 0x6

    invoke-virtual {v12, v4, v0}, Landroidx/compose/material/TextFieldDefaults;->getTextFieldShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v12

    and-int/lit8 v0, v16, -0x71

    goto :goto_28

    :cond_3b
    move/from16 v16, v0

    move-object/from16 v12, p11

    :goto_28
    move-object/from16 p2, v3

    and-int/lit16 v3, v1, 0x1000

    if-eqz v3, :cond_3c

    .line 356
    sget-object v16, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    const/16 v62, 0x30

    const v63, 0x1fffff

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const-wide/16 v33, 0x0

    const-wide/16 v35, 0x0

    const-wide/16 v37, 0x0

    const-wide/16 v39, 0x0

    const-wide/16 v41, 0x0

    const-wide/16 v43, 0x0

    const-wide/16 v45, 0x0

    const-wide/16 v47, 0x0

    const-wide/16 v49, 0x0

    const-wide/16 v51, 0x0

    const-wide/16 v53, 0x0

    const-wide/16 v55, 0x0

    const-wide/16 v57, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    move-object/from16 v59, v4

    invoke-virtual/range {v16 .. v63}, Landroidx/compose/material/TextFieldDefaults;->textFieldColors-dx8h9Zs(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;

    move-result-object v3

    and-int/lit16 v0, v0, -0x381

    goto :goto_29

    :cond_3c
    move-object/from16 v3, p12

    :goto_29
    move-object/from16 p3, v3

    and-int/lit16 v3, v1, 0x2000

    if-eqz v3, :cond_3e

    if-eqz v6, :cond_3d

    .line 358
    sget-object v3, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    const/16 v16, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 p4, v3

    move/from16 p9, v16

    move-object/from16 p10, v17

    move/from16 p5, v18

    move/from16 p6, v19

    move/from16 p7, v20

    move/from16 p8, v21

    invoke-static/range {p4 .. p10}, Landroidx/compose/material/TextFieldDefaults;->textFieldWithLabelPadding-a9UjIt4$default(Landroidx/compose/material/TextFieldDefaults;FFFFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v3

    goto :goto_2a

    .line 360
    :cond_3d
    sget-object v3, Landroidx/compose/material/TextFieldDefaults;->INSTANCE:Landroidx/compose/material/TextFieldDefaults;

    const/16 v16, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 p4, v3

    move/from16 p9, v16

    move-object/from16 p10, v17

    move/from16 p5, v18

    move/from16 p6, v19

    move/from16 p7, v20

    move/from16 p8, v21

    invoke-static/range {p4 .. p10}, Landroidx/compose/material/TextFieldDefaults;->textFieldWithoutLabelPadding-a9UjIt4$default(Landroidx/compose/material/TextFieldDefaults;FFFFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v3

    :goto_2a
    and-int/lit16 v0, v0, -0x1c01

    move-object/from16 v22, p2

    move-object/from16 v29, p3

    goto :goto_2b

    :cond_3e
    move-object/from16 v22, p2

    move-object/from16 v29, p3

    move-object/from16 v3, p13

    :goto_2b
    move-object/from16 v19, v6

    move-object/from16 v20, v7

    move-object/from16 v18, v9

    move-object/from16 v21, v10

    move/from16 v23, v11

    move-object/from16 v28, v12

    goto/16 :goto_22

    :goto_2c
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v6

    if-eqz v6, :cond_3f

    const-string v6, "com.stripe.android.uicore.elements.compat.InsetDecorationBox (CompatTextField.kt:361)"

    const v7, 0x556fe5ed

    .line 362
    invoke-static {v7, v8, v0, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 363
    :cond_3f
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v6

    check-cast v6, Landroidx/compose/runtime/CompositionLocal;

    const v7, 0x789c5f52

    const-string v9, "CC:CompositionLocal.kt#9igjgp"

    .line 697
    invoke-static {v4, v7, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 363
    check-cast v6, Landroidx/compose/ui/unit/LayoutDirection;

    .line 365
    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/PaddingKt;->calculateStartPadding(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F

    move-result v7

    .line 366
    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/PaddingKt;->calculateEndPadding(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F

    move-result v6

    .line 369
    sget-object v9, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v9, Landroidx/compose/ui/Modifier;

    if-eqz v21, :cond_40

    .line 371
    invoke-static {}, Lcom/stripe/android/uicore/elements/compat/CompatConstantsKt;->getHorizontalIconPadding()F

    move-result v10

    sub-float v10, v7, v10

    .line 698
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v10

    const/4 v11, 0x0

    int-to-float v12, v11

    .line 699
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v12

    .line 700
    invoke-static {v10, v12}, Lkotlin/ranges/RangesKt;->coerceAtLeast(FF)F

    move-result v10

    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v10

    goto :goto_2d

    :cond_40
    const/4 v11, 0x0

    int-to-float v10, v11

    .line 701
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v10

    :goto_2d
    if-eqz v22, :cond_41

    .line 374
    invoke-static {}, Lcom/stripe/android/uicore/elements/compat/CompatConstantsKt;->getHorizontalIconPadding()F

    move-result v12

    sub-float v12, v6, v12

    .line 702
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v12

    int-to-float v13, v11

    .line 703
    invoke-static {v13}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v13

    .line 704
    invoke-static {v12, v13}, Lkotlin/ranges/RangesKt;->coerceAtLeast(FF)F

    move-result v12

    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v12

    goto :goto_2e

    :cond_41
    int-to-float v12, v11

    .line 705
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v12

    :goto_2e
    const/16 v11, 0xa

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object/from16 p2, v9

    move/from16 p3, v10

    move/from16 p7, v11

    move/from16 p5, v12

    move-object/from16 p8, v13

    move/from16 p4, v14

    move/from16 p6, v16

    .line 369
    invoke-static/range {p2 .. p8}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const v10, 0x2bb5b5d7

    .line 368
    const-string v11, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"

    .line 706
    invoke-static {v4, v10, v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 707
    sget-object v10, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v10}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v10

    const/4 v11, 0x0

    .line 711
    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v10

    const v12, -0x4ee9b9da

    .line 712
    const-string v13, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    .line 713
    invoke-static {v4, v12, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 714
    invoke-static {v4, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v11

    .line 715
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v12

    .line 716
    invoke-static {v4, v9}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    .line 718
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v13

    const v14, -0x2942ffcf

    move/from16 v16, v0

    .line 717
    const-string v0, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    .line 719
    invoke-static {v4, v14, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 720
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v0

    instance-of v0, v0, Landroidx/compose/runtime/Applier;

    if-nez v0, :cond_42

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 721
    :cond_42
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 722
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v0

    if-eqz v0, :cond_43

    .line 723
    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_2f

    .line 725
    :cond_43
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 727
    :goto_2f
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v0

    .line 728
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v13

    invoke-static {v0, v10, v13}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 729
    sget-object v10, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v0, v12, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 731
    sget-object v10, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    .line 733
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v12

    if-nez v12, :cond_44

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_45

    .line 734
    :cond_44
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v0, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 735
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v0, v11, v10}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 738
    :cond_45
    sget-object v10, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v0, v9, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    const v0, -0x7ff519f7    # -1.000876E-39f

    .line 740
    const-string v9, "C73@3429L9:Box.kt#2w3rfo"

    .line 741
    invoke-static {v4, v0, v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    check-cast v0, Landroidx/compose/foundation/layout/BoxScope;

    .line 398
    invoke-interface {v3}, Landroidx/compose/foundation/layout/PaddingValues;->calculateTopPadding-D9Ej5fM()F

    move-result v0

    .line 399
    invoke-interface {v3}, Landroidx/compose/foundation/layout/PaddingValues;->calculateBottomPadding-D9Ej5fM()F

    move-result v9

    if-eqz v21, :cond_46

    .line 401
    invoke-static {}, Lcom/stripe/android/uicore/elements/compat/CompatConstantsKt;->getTextFieldPadding()F

    move-result v7

    :cond_46
    if-eqz v22, :cond_47

    .line 404
    invoke-static {}, Lcom/stripe/android/uicore/elements/compat/CompatConstantsKt;->getTextFieldPadding()F

    move-result v6

    .line 397
    :cond_47
    invoke-static {v7, v0, v6, v9}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-a9UjIt4(FFFF)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v27

    .line 382
    new-instance v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$InsetDecorationBox$4$3;

    invoke-direct {v0, v2}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$InsetDecorationBox$4$3;-><init>(Lkotlin/jvm/functions/Function2;)V

    const/16 v6, 0x36

    const v7, -0x43f15b9d

    const/4 v9, 0x1

    invoke-static {v7, v9, v0, v4, v6}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lkotlin/jvm/functions/Function2;

    .line 394
    move-object/from16 v26, v5

    check-cast v26, Landroidx/compose/foundation/interaction/InteractionSource;

    and-int/lit8 v0, v8, 0xe

    or-int/lit8 v0, v0, 0x30

    shr-int/lit8 v6, v8, 0x12

    and-int/lit16 v6, v6, 0x380

    or-int/2addr v0, v6

    and-int/lit16 v6, v8, 0x1c00

    or-int/2addr v0, v6

    const v6, 0xe000

    and-int/2addr v6, v8

    or-int/2addr v0, v6

    const/high16 v6, 0x70000

    and-int/2addr v6, v8

    or-int/2addr v0, v6

    const/high16 v6, 0x380000

    and-int/2addr v6, v8

    or-int/2addr v0, v6

    shr-int/lit8 v6, v8, 0x6

    const/high16 v7, 0x1c00000

    and-int/2addr v6, v7

    or-int/2addr v0, v6

    shl-int/lit8 v6, v8, 0x12

    const/high16 v7, 0xe000000

    and-int/2addr v6, v7

    or-int/2addr v0, v6

    const/high16 v6, 0x70000000

    const/4 v7, 0x6

    shl-int/lit8 v7, v8, 0x6

    and-int/2addr v6, v7

    or-int v31, v0, v6

    and-int/lit8 v0, v16, 0xe

    shl-int/lit8 v6, v16, 0x3

    and-int/lit16 v7, v6, 0x380

    or-int/2addr v0, v7

    and-int/lit16 v6, v6, 0x1c00

    or-int v32, v0, v6

    move-object/from16 v16, p0

    move-object/from16 v30, v4

    .line 379
    invoke-static/range {v16 .. v32}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt;->CommonDecorationBox(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;II)V

    .line 741
    invoke-static/range {v30 .. v30}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 742
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 719
    invoke-static/range {v30 .. v30}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 713
    invoke-static/range {v30 .. v30}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 706
    invoke-static/range {v30 .. v30}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 745
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_48

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_48
    move-object v14, v3

    move-object v11, v5

    move-object/from16 v9, v18

    move-object/from16 v4, v19

    move-object/from16 v5, v20

    move-object/from16 v6, v21

    move-object/from16 v7, v22

    move/from16 v10, v23

    move/from16 v3, v24

    move/from16 v8, v25

    move-object/from16 v12, v28

    move-object/from16 v13, v29

    .line 409
    :goto_30
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_49

    move-object/from16 v16, v0

    new-instance v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$$ExternalSyntheticLambda0;

    move/from16 v17, v1

    move-object/from16 v64, v16

    move-object/from16 v1, p0

    move/from16 v16, p16

    invoke-direct/range {v0 .. v17}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$$ExternalSyntheticLambda0;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;III)V

    move-object v1, v0

    move-object/from16 v0, v64

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_49
    return-void
.end method

.method private static final InsetDecorationBox$lambda$12(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 19

    or-int/lit8 v0, p14, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v16

    invoke-static/range {p15 .. p15}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v18, p16

    move-object/from16 v15, p17

    invoke-static/range {v1 .. v18}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt;->InsetDecorationBox(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public static final synthetic access$InsetDecorationBox(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p17}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt;->InsetDecorationBox(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V

    return-void
.end method

.method public static final errorSemanticsWithDefault(Landroidx/compose/ui/Modifier;ZLjava/lang/String;)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 659
    new-instance v0, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$errorSemanticsWithDefault$1;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/uicore/elements/compat/CompatTextFieldKt$errorSemanticsWithDefault$1;-><init>(ZLjava/lang/String;)V

    check-cast v0, Lkotlin/jvm/functions/Function3;

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p0, p2, v0, p1, p2}, Landroidx/compose/ui/ComposedModifierKt;->composed$default(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
