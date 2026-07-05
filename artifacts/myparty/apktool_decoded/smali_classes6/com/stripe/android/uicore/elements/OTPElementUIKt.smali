.class public final Lcom/stripe/android/uicore/elements/OTPElementUIKt;
.super Ljava/lang/Object;
.source "OTPElementUI.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOTPElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTPElementUI.kt\ncom/stripe/android/uicore/elements/OTPElementUIKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,311:1\n149#2:312\n149#2:313\n149#2:314\n1225#3,6:315\n1225#3,6:358\n1225#3,6:372\n1225#3,6:378\n1225#3,6:384\n77#4:321\n99#5:322\n96#5,6:323\n102#5:357\n106#5:371\n79#6,6:329\n86#6,4:344\n90#6,2:354\n94#6:370\n368#7,9:335\n377#7:356\n378#7,2:368\n4034#8,6:348\n1557#9:364\n1628#9,3:365\n1863#9,2:393\n78#10:390\n111#10,2:391\n*S KotlinDebug\n*F\n+ 1 OTPElementUI.kt\ncom/stripe/android/uicore/elements/OTPElementUIKt\n*L\n102#1:312\n103#1:313\n112#1:314\n113#1:315,6\n119#1:358,6\n246#1:372,6\n245#1:378,6\n225#1:384,6\n115#1:321\n116#1:322\n116#1:323,6\n116#1:357\n116#1:371\n116#1:329,6\n116#1:344,4\n116#1:354,2\n116#1:370\n116#1:335,9\n116#1:356\n116#1:368,2\n116#1:348,6\n121#1:364\n121#1:365,3\n235#1:393,2\n119#1:390\n119#1:391,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001\u00a2\u0006\u0002\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0001H\u0001\u00a2\u0006\u0002\u0010\u0002\u001ay\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0018H\u0007\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u001a]\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0013H\u0003\u00a2\u0006\u0002\u0010$\u001aQ\u0010%\u001a\u001e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00010\'\u00a2\u0006\u0002\u0008(\u0012\u0004\u0012\u00020\u00010&\u00a2\u0006\u0002\u0008(2\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0003\u00a2\u0006\u0002\u0010)\u00a8\u0006*\u00b2\u0006\n\u0010+\u001a\u00020 X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001c\u001a\u00020\u0013X\u008a\u0084\u0002"
    }
    d2 = {
        "OTPElementUIPreview",
        "",
        "(Landroidx/compose/runtime/Composer;I)V",
        "OTPElementUIDisabledPreview",
        "OTPElementUI",
        "enabled",
        "",
        "element",
        "Lcom/stripe/android/uicore/elements/OTPElement;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "boxShape",
        "Landroidx/compose/ui/graphics/Shape;",
        "boxTextStyle",
        "Landroidx/compose/ui/text/TextStyle;",
        "boxSpacing",
        "Landroidx/compose/ui/unit/Dp;",
        "middleSpacing",
        "otpInputPlaceholder",
        "",
        "colors",
        "Lcom/stripe/android/uicore/elements/OTPElementColors;",
        "selectedStrokeWidth",
        "focusRequester",
        "Landroidx/compose/ui/focus/FocusRequester;",
        "OTPElementUI-RE_urrM",
        "(ZLcom/stripe/android/uicore/elements/OTPElement;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/text/TextStyle;FFLjava/lang/String;Lcom/stripe/android/uicore/elements/OTPElementColors;FLandroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;III)V",
        "OTPInputBox",
        "value",
        "isSelected",
        "textStyle",
        "index",
        "",
        "focusManager",
        "Landroidx/compose/ui/focus/FocusManager;",
        "placeholder",
        "(Ljava/lang/String;ZLandroidx/compose/ui/text/TextStyle;Lcom/stripe/android/uicore/elements/OTPElement;ILandroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/Modifier;ZLcom/stripe/android/uicore/elements/OTPElementColors;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V",
        "OTPInputDecorationBox",
        "Lkotlin/Function1;",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "(Ljava/lang/String;ZLjava/lang/String;ZLcom/stripe/android/uicore/elements/OTPElementColors;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function3;",
        "stripe-ui-core_release",
        "focusedElementIndex"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic $r8$lambda$1rluQgiokSyJ4wZxEfoS5LbF9v4(Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;ILandroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/text/input/TextFieldValue;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPInputBox$lambda$15$lambda$14(Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;ILandroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/text/input/TextFieldValue;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$2JP7sOxDPYyBKq5-eS9nH82yJA8(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPElementUIDisabledPreview$lambda$1(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$FvKXyFFnRK8KZgEa6O2DS9l2BXw(ZLcom/stripe/android/uicore/elements/OTPElement;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/text/TextStyle;FFLjava/lang/String;Lcom/stripe/android/uicore/elements/OTPElementColors;FLandroidx/compose/ui/focus/FocusRequester;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p15}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPElementUI_RE_urrM$lambda$8(ZLcom/stripe/android/uicore/elements/OTPElement;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/text/TextStyle;FFLjava/lang/String;Lcom/stripe/android/uicore/elements/OTPElementColors;FLandroidx/compose/ui/focus/FocusRequester;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$PwzDsrwG4bBIt6K1I4IQZO3RHeY(Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/foundation/text/KeyboardActionScope;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPInputBox$lambda$10$lambda$9(Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/foundation/text/KeyboardActionScope;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$VWLiAOn7kqjbnXoAQyROMJ_tfeE(Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/foundation/text/KeyboardActionScope;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPInputBox$lambda$12$lambda$11(Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/foundation/text/KeyboardActionScope;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$VzOIy7r0rVTf91so2BSG3-0OX_M(Ljava/lang/String;ZLandroidx/compose/ui/text/TextStyle;Lcom/stripe/android/uicore/elements/OTPElement;ILandroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/Modifier;ZLcom/stripe/android/uicore/elements/OTPElementColors;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p12}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPInputBox$lambda$16(Ljava/lang/String;ZLandroidx/compose/ui/text/TextStyle;Lcom/stripe/android/uicore/elements/OTPElement;ILandroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/Modifier;ZLcom/stripe/android/uicore/elements/OTPElementColors;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$dRA4UtbS2Zc7s7c49Si1kJ0-C_4(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPElementUIPreview$lambda$0(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final OTPElementUI-RE_urrM(ZLcom/stripe/android/uicore/elements/OTPElement;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/text/TextStyle;FFLjava/lang/String;Lcom/stripe/android/uicore/elements/OTPElementColors;FLandroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;III)V
    .locals 35

    move/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v12, p12

    move/from16 v14, p14

    const-string v0, "element"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x10b96620

    move-object/from16 v3, p11

    .line 114
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v3

    and-int/lit8 v4, v14, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v4, v12, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v12, 0x6

    if-nez v4, :cond_2

    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v12

    goto :goto_1

    :cond_2
    move v4, v12

    :goto_1
    and-int/lit8 v6, v14, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v4, v4, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v12, 0x30

    if-nez v6, :cond_5

    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_5
    :goto_3
    and-int/lit8 v6, v14, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v4, v4, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v12, 0x180

    if-nez v7, :cond_8

    move-object/from16 v7, p2

    invoke-interface {v3, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v4, v8

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v7, p2

    :goto_6
    and-int/lit16 v8, v12, 0xc00

    if-nez v8, :cond_b

    and-int/lit8 v8, v14, 0x8

    if-nez v8, :cond_9

    move-object/from16 v8, p3

    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x800

    goto :goto_7

    :cond_9
    move-object/from16 v8, p3

    :cond_a
    const/16 v9, 0x400

    :goto_7
    or-int/2addr v4, v9

    goto :goto_8

    :cond_b
    move-object/from16 v8, p3

    :goto_8
    and-int/lit16 v9, v12, 0x6000

    if-nez v9, :cond_e

    and-int/lit8 v9, v14, 0x10

    if-nez v9, :cond_c

    move-object/from16 v9, p4

    invoke-interface {v3, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_d

    const/16 v10, 0x4000

    goto :goto_9

    :cond_c
    move-object/from16 v9, p4

    :cond_d
    const/16 v10, 0x2000

    :goto_9
    or-int/2addr v4, v10

    goto :goto_a

    :cond_e
    move-object/from16 v9, p4

    :goto_a
    and-int/lit8 v10, v14, 0x20

    const/high16 v13, 0x30000

    if-eqz v10, :cond_f

    or-int/2addr v4, v13

    goto :goto_c

    :cond_f
    and-int v15, v12, v13

    if-nez v15, :cond_11

    move/from16 v15, p5

    invoke-interface {v3, v15}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_b

    :cond_10
    const/high16 v16, 0x10000

    :goto_b
    or-int v4, v4, v16

    goto :goto_d

    :cond_11
    :goto_c
    move/from16 v15, p5

    :goto_d
    and-int/lit8 v16, v14, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_12

    or-int v4, v4, v17

    move/from16 v5, p6

    goto :goto_f

    :cond_12
    and-int v17, v12, v17

    move/from16 v5, p6

    if-nez v17, :cond_14

    invoke-interface {v3, v5}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v17

    if-eqz v17, :cond_13

    const/high16 v17, 0x100000

    goto :goto_e

    :cond_13
    const/high16 v17, 0x80000

    :goto_e
    or-int v4, v4, v17

    :cond_14
    :goto_f
    move/from16 v17, v13

    and-int/lit16 v13, v14, 0x80

    const/high16 v18, 0xc00000

    if-eqz v13, :cond_15

    or-int v4, v4, v18

    move-object/from16 v0, p7

    goto :goto_11

    :cond_15
    and-int v18, v12, v18

    move-object/from16 v0, p7

    if-nez v18, :cond_17

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_16

    const/high16 v19, 0x800000

    goto :goto_10

    :cond_16
    const/high16 v19, 0x400000

    :goto_10
    or-int v4, v4, v19

    :cond_17
    :goto_11
    const/high16 v19, 0x6000000

    and-int v19, v12, v19

    if-nez v19, :cond_1a

    and-int/lit16 v11, v14, 0x100

    if-nez v11, :cond_18

    move-object/from16 v11, p8

    invoke-interface {v3, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_19

    const/high16 v20, 0x4000000

    goto :goto_12

    :cond_18
    move-object/from16 v11, p8

    :cond_19
    const/high16 v20, 0x2000000

    :goto_12
    or-int v4, v4, v20

    goto :goto_13

    :cond_1a
    move-object/from16 v11, p8

    :goto_13
    and-int/lit16 v0, v14, 0x200

    const/high16 v20, 0x30000000

    if-eqz v0, :cond_1b

    or-int v4, v4, v20

    goto :goto_15

    :cond_1b
    and-int v20, v12, v20

    if-nez v20, :cond_1d

    move/from16 v20, v0

    move/from16 v0, p9

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v21

    if-eqz v21, :cond_1c

    const/high16 v21, 0x20000000

    goto :goto_14

    :cond_1c
    const/high16 v21, 0x10000000

    :goto_14
    or-int v4, v4, v21

    goto :goto_16

    :cond_1d
    :goto_15
    move/from16 v20, v0

    move/from16 v0, p9

    :goto_16
    and-int/lit16 v0, v14, 0x400

    if-eqz v0, :cond_1e

    or-int/lit8 v21, p13, 0x6

    move/from16 v34, v21

    move/from16 v21, v0

    move/from16 v0, v34

    goto :goto_18

    :cond_1e
    and-int/lit8 v21, p13, 0x6

    if-nez v21, :cond_20

    move/from16 v21, v0

    move-object/from16 v0, p10

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_1f

    const/16 v22, 0x4

    goto :goto_17

    :cond_1f
    const/16 v22, 0x2

    :goto_17
    or-int v22, p13, v22

    move/from16 v0, v22

    goto :goto_18

    :cond_20
    move/from16 v21, v0

    move-object/from16 v0, p10

    move/from16 v0, p13

    :goto_18
    const v22, 0x12492493

    and-int v1, v4, v22

    const v2, 0x12492492

    if-ne v1, v2, :cond_22

    and-int/lit8 v1, v0, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_22

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_21

    goto :goto_1a

    .line 199
    :cond_21
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v10, p9

    move-object v12, v3

    move-object v3, v7

    move-object v4, v8

    move-object/from16 v8, p7

    move v7, v5

    move-object v5, v9

    move-object v9, v11

    move-object/from16 v11, p10

    :goto_19
    move v6, v15

    goto/16 :goto_2a

    .line 114
    :cond_22
    :goto_1a
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v1, v12, 0x1

    const v2, -0xe000001

    const v22, -0xe001

    if-eqz v1, :cond_27

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v1

    if-eqz v1, :cond_23

    goto :goto_1b

    .line 113
    :cond_23
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v1, v14, 0x8

    if-eqz v1, :cond_24

    and-int/lit16 v4, v4, -0x1c01

    :cond_24
    and-int/lit8 v1, v14, 0x10

    if-eqz v1, :cond_25

    and-int v4, v4, v22

    :cond_25
    and-int/lit16 v1, v14, 0x100

    if-eqz v1, :cond_26

    and-int/2addr v4, v2

    :cond_26
    move/from16 v2, p9

    move v1, v5

    move-object v13, v8

    move-object v6, v9

    move-object v8, v11

    move-object/from16 v9, p7

    move-object/from16 v5, p10

    move-object v11, v7

    goto/16 :goto_23

    :cond_27
    :goto_1b
    if-eqz v6, :cond_28

    .line 99
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    goto :goto_1c

    :cond_28
    move-object v1, v7

    :goto_1c
    and-int/lit8 v6, v14, 0x8

    if-eqz v6, :cond_29

    .line 100
    sget-object v6, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v7, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-virtual {v6, v3, v7}, Landroidx/compose/material/MaterialTheme;->getShapes(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Shapes;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/material/Shapes;->getMedium()Landroidx/compose/foundation/shape/CornerBasedShape;

    move-result-object v6

    check-cast v6, Landroidx/compose/ui/graphics/Shape;

    and-int/lit16 v4, v4, -0x1c01

    goto :goto_1d

    :cond_29
    move-object v6, v8

    :goto_1d
    and-int/lit8 v7, v14, 0x10

    if-eqz v7, :cond_2a

    .line 101
    sget-object v7, Lcom/stripe/android/uicore/elements/OTPElementUI;->INSTANCE:Lcom/stripe/android/uicore/elements/OTPElementUI;

    const/4 v8, 0x6

    invoke-virtual {v7, v3, v8}, Lcom/stripe/android/uicore/elements/OTPElementUI;->defaultTextStyle(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;

    move-result-object v7

    and-int v4, v4, v22

    goto :goto_1e

    :cond_2a
    move-object v7, v9

    :goto_1e
    if-eqz v10, :cond_2b

    const/16 v8, 0x8

    int-to-float v8, v8

    .line 312
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v8

    goto :goto_1f

    :cond_2b
    move v8, v15

    :goto_1f
    if-eqz v16, :cond_2c

    const/16 v5, 0x14

    int-to-float v5, v5

    .line 313
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v5

    :cond_2c
    if-eqz v13, :cond_2d

    .line 104
    const-string v9, "\u25cf"

    goto :goto_20

    :cond_2d
    move-object/from16 v9, p7

    :goto_20
    and-int/lit16 v10, v14, 0x100

    if-eqz v10, :cond_2e

    .line 106
    sget-object v10, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v11, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-virtual {v10, v3, v11}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v10

    invoke-virtual {v10}, Landroidx/compose/material/Colors;->getPrimary-0d7_KjU()J

    move-result-wide v23

    .line 107
    sget-object v10, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v11, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-static {v10, v3, v11}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(Landroidx/compose/material/MaterialTheme;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v10

    invoke-virtual {v10}, Lcom/stripe/android/uicore/StripeColors;->getComponentBorder-0d7_KjU()J

    move-result-wide v31

    .line 108
    sget-object v10, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v11, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-static {v10, v3, v11}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(Landroidx/compose/material/MaterialTheme;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v10

    invoke-virtual {v10}, Lcom/stripe/android/uicore/StripeColors;->getPlaceholderText-0d7_KjU()J

    move-result-wide v25

    .line 109
    sget-object v10, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v10}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    move-result-wide v27

    .line 110
    sget-object v10, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v10}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    move-result-wide v29

    .line 105
    new-instance v22, Lcom/stripe/android/uicore/elements/OTPElementColors;

    const/16 v33, 0x0

    invoke-direct/range {v22 .. v33}, Lcom/stripe/android/uicore/elements/OTPElementColors;-><init>(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/2addr v2, v4

    move v4, v2

    goto :goto_21

    :cond_2e
    move-object/from16 v22, v11

    :goto_21
    if-eqz v20, :cond_2f

    const/4 v2, 0x2

    int-to-float v10, v2

    .line 314
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    goto :goto_22

    :cond_2f
    move/from16 v2, p9

    :goto_22
    if-eqz v21, :cond_31

    const v10, 0x67914271

    .line 113
    invoke-interface {v3, v10}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 315
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    .line 316
    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v11

    if-ne v10, v11, :cond_30

    .line 113
    new-instance v10, Landroidx/compose/ui/focus/FocusRequester;

    invoke-direct {v10}, Landroidx/compose/ui/focus/FocusRequester;-><init>()V

    .line 318
    invoke-interface {v3, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 113
    :cond_30
    check-cast v10, Landroidx/compose/ui/focus/FocusRequester;

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object v11, v1

    move v1, v5

    move-object v13, v6

    move-object v6, v7

    move v15, v8

    move-object v5, v10

    move-object/from16 v8, v22

    goto :goto_23

    :cond_31
    move-object v11, v1

    move v1, v5

    move-object v13, v6

    move-object v6, v7

    move v15, v8

    move-object/from16 v8, v22

    move-object/from16 v5, p10

    :goto_23
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v7

    if-eqz v7, :cond_32

    const-string v7, "com.stripe.android.uicore.elements.OTPElementUI (OTPElementUI.kt:113)"

    const v10, -0x10b96620

    .line 114
    invoke-static {v10, v4, v0, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 115
    :cond_32
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalFocusManager()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/CompositionLocal;

    const v7, 0x789c5f52

    const-string v10, "CC:CompositionLocal.kt#9igjgp"

    .line 321
    invoke-static {v3, v7, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 115
    check-cast v0, Landroidx/compose/ui/focus/FocusManager;

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x1

    .line 117
    invoke-static {v11, v7, v12, v10}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const v10, 0x2952b718

    .line 116
    const-string v12, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo"

    .line 322
    invoke-static {v3, v10, v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 323
    sget-object v10, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v10}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v10

    .line 324
    sget-object v12, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v12}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v12

    move-object/from16 v18, v11

    const/4 v11, 0x0

    .line 327
    invoke-static {v10, v12, v3, v11}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v10

    const v12, -0x4ee9b9da

    move-object/from16 p8, v0

    .line 328
    const-string v0, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    .line 329
    invoke-static {v3, v12, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 330
    invoke-static {v3, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v0

    .line 331
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v12

    .line 332
    invoke-static {v3, v7}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    .line 334
    sget-object v20, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v11

    move/from16 p2, v0

    const v0, -0x2942ffcf

    move/from16 p4, v2

    .line 333
    const-string v2, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    .line 335
    invoke-static {v3, v0, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 336
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v0

    instance-of v0, v0, Landroidx/compose/runtime/Applier;

    if-nez v0, :cond_33

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 337
    :cond_33
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 338
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v0

    if-eqz v0, :cond_34

    .line 339
    invoke-interface {v3, v11}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_24

    .line 341
    :cond_34
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 343
    :goto_24
    invoke-static {v3}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v0

    .line 344
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v10, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 345
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v12, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 347
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    .line 349
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v10

    if-nez v10, :cond_35

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_36

    .line 350
    :cond_35
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v0, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 351
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v0, v10, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 354
    :cond_36
    sget-object v2, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v0, v7, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    const v0, -0x184f2606

    .line 356
    const-string v2, "C101@5126L9:Row.kt#2w3rfo"

    .line 357
    invoke-static {v3, v0, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    move-object/from16 v22, v0

    check-cast v22, Landroidx/compose/foundation/layout/RowScope;

    const v0, -0x201fe32b

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 358
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .line 359
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_37

    const/4 v0, -0x1

    .line 119
    invoke-static {v0}, Landroidx/compose/runtime/SnapshotIntStateKt;->mutableIntStateOf(I)Landroidx/compose/runtime/MutableIntState;

    move-result-object v0

    .line 361
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 119
    :cond_37
    move-object v10, v0

    check-cast v10, Landroidx/compose/runtime/MutableIntState;

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v0, -0x201fcc46

    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 121
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/uicore/elements/OTPElement;->getController()Lcom/stripe/android/uicore/elements/OTPController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/OTPController;->getOtpLength()I

    move-result v0

    const/4 v2, 0x0

    invoke-static {v2, v0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 364
    new-instance v2, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v0, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v2, v7}, Ljava/util/ArrayList;-><init>(I)V

    move-object v11, v2

    check-cast v11, Ljava/util/Collection;

    .line 365
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_25
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3d

    move-object v0, v12

    check-cast v0, Lkotlin/collections/IntIterator;

    invoke-virtual {v0}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v2

    .line 122
    invoke-static {v10}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPElementUI_RE_urrM$lambda$7$lambda$4(Landroidx/compose/runtime/MutableIntState;)I

    move-result v0

    if-ne v0, v2, :cond_38

    const/4 v0, 0x1

    goto :goto_26

    :cond_38
    const/4 v0, 0x0

    :goto_26
    if-nez v2, :cond_39

    const v7, -0x4a5a0c2a

    .line 125
    invoke-interface {v3, v7}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object/from16 v20, v12

    const/4 v12, 0x0

    const/16 v19, 0x2

    goto :goto_27

    .line 126
    :cond_39
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/uicore/elements/OTPElement;->getController()Lcom/stripe/android/uicore/elements/OTPController;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/uicore/elements/OTPController;->getOtpLength()I

    move-result v7

    const/16 v19, 0x2

    div-int/lit8 v7, v7, 0x2

    if-ne v2, v7, :cond_3a

    const v7, -0x4a5a04de

    invoke-interface {v3, v7}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    sget-object v7, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v7, Landroidx/compose/ui/Modifier;

    invoke-static {v7, v1}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 v20, v12

    const/4 v12, 0x0

    invoke-static {v7, v3, v12}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_27

    :cond_3a
    move-object/from16 v20, v12

    const/4 v12, 0x0

    const v7, -0x4a59fbc1

    .line 127
    invoke-interface {v3, v7}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    sget-object v7, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v7, Landroidx/compose/ui/Modifier;

    invoke-static {v7, v15}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7, v3, v12}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 131
    :goto_27
    sget-object v7, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v7, Landroidx/compose/ui/Modifier;

    const v12, -0x201fa6a3

    invoke-interface {v3, v12}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    if-eqz p0, :cond_3b

    const/high16 v12, 0x3f800000    # 1.0f

    move/from16 p3, v0

    goto :goto_28

    .line 132
    :cond_3b
    sget-object v12, Landroidx/compose/material/ContentAlpha;->INSTANCE:Landroidx/compose/material/ContentAlpha;

    move/from16 p3, v0

    sget v0, Landroidx/compose/material/ContentAlpha;->$stable:I

    invoke-virtual {v12, v3, v0}, Landroidx/compose/material/ContentAlpha;->getDisabled(Landroidx/compose/runtime/Composer;I)F

    move-result v12

    :goto_28
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {v7, v12}, Landroidx/compose/ui/draw/AlphaKt;->alpha(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v23

    const/16 v26, 0x2

    const/16 v27, 0x0

    const/high16 v24, 0x3f800000    # 1.0f

    const/16 v25, 0x0

    .line 133
    invoke-static/range {v22 .. v27}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    .line 135
    sget-object v0, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v7, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-static {v0, v3, v7}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(Landroidx/compose/material/MaterialTheme;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/StripeColors;->getComponent-0d7_KjU()J

    move-result-wide v23

    .line 137
    sget-object v0, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    .line 139
    sget v7, Landroidx/compose/material/MaterialTheme;->$stable:I

    move-object/from16 p2, v0

    shr-int/lit8 v0, v4, 0x15

    and-int/lit16 v0, v0, 0x380

    or-int/2addr v0, v7

    const/4 v7, 0x0

    move/from16 p6, v0

    move-object/from16 p5, v3

    move/from16 p7, v7

    .line 137
    invoke-static/range {p2 .. p7}, Lcom/stripe/android/uicore/StripeThemeKt;->getBorderStrokeWidth-6a0pyJM(Landroidx/compose/material/MaterialTheme;ZFLandroidx/compose/runtime/Composer;II)F

    move-result v0

    move/from16 v7, p3

    move/from16 v25, p4

    if-eqz v7, :cond_3c

    .line 142
    invoke-virtual {v8}, Lcom/stripe/android/uicore/elements/OTPElementColors;->getSelectedBorder-0d7_KjU()J

    move-result-wide v26

    goto :goto_29

    .line 144
    :cond_3c
    invoke-virtual {v8}, Lcom/stripe/android/uicore/elements/OTPElementColors;->getUnselectedBorder-0d7_KjU()J

    move-result-wide v26

    :goto_29
    move/from16 v28, v1

    move/from16 p2, v2

    move-wide/from16 v1, v26

    .line 136
    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/BorderStrokeKt;->BorderStroke-cXLIe8U(FJ)Landroidx/compose/foundation/BorderStroke;

    move-result-object v26

    .line 147
    new-instance v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v27, v4

    move-object/from16 p3, v12

    move-object/from16 v4, p8

    move-object v12, v3

    move v3, v7

    move/from16 v7, p0

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;-><init>(Lcom/stripe/android/uicore/elements/OTPElement;IZLandroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/ui/text/TextStyle;ZLcom/stripe/android/uicore/elements/OTPElementColors;Ljava/lang/String;Landroidx/compose/runtime/MutableIntState;)V

    const/16 v1, 0x36

    const v2, -0x411571ad

    const/4 v3, 0x1

    invoke-static {v2, v3, v0, v12, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    shr-int/lit8 v1, v27, 0x6

    and-int/lit8 v1, v1, 0x70

    or-int v1, v1, v17

    const/4 v2, 0x4

    const/4 v7, 0x0

    move-object/from16 p2, p3

    move-object/from16 p8, v0

    move/from16 p10, v1

    move/from16 p11, v2

    move/from16 p4, v7

    move-object/from16 p9, v12

    move-object/from16 p3, v13

    move-wide/from16 p5, v23

    move-object/from16 p7, v26

    .line 130
    invoke-static/range {p2 .. p11}, Lcom/stripe/android/uicore/elements/SectionUIKt;->SectionCard-fWhpE4E(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;ZJLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v0, p3

    .line 197
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 366
    invoke-interface {v11, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v13, v0

    move-object/from16 p8, v4

    move-object v3, v12

    move-object/from16 v12, v20

    move/from16 p4, v25

    move/from16 v4, v27

    move/from16 v1, v28

    goto/16 :goto_25

    :cond_3d
    move/from16 v25, p4

    move/from16 v28, v1

    move-object v12, v3

    move-object v0, v13

    .line 367
    check-cast v11, Ljava/util/List;

    .line 121
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 357
    invoke-static {v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 368
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 335
    invoke-static {v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 329
    invoke-static {v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 322
    invoke-static {v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 371
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_3e

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3e
    move-object v3, v9

    move-object v9, v8

    move-object v8, v3

    move-object v4, v0

    move-object v11, v5

    move-object v5, v6

    move-object/from16 v3, v18

    move/from16 v10, v25

    move/from16 v7, v28

    goto/16 :goto_19

    .line 199
    :goto_2a
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v15

    if-eqz v15, :cond_3f

    new-instance v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda0;

    move/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v12, p12

    move/from16 v13, p13

    invoke-direct/range {v0 .. v14}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda0;-><init>(ZLcom/stripe/android/uicore/elements/OTPElement;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/text/TextStyle;FFLjava/lang/String;Lcom/stripe/android/uicore/elements/OTPElementColors;FLandroidx/compose/ui/focus/FocusRequester;III)V

    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_3f
    return-void
.end method

.method public static final OTPElementUIDisabledPreview(Landroidx/compose/runtime/Composer;I)V
    .locals 12

    const v0, 0x156af5f

    .line 81
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    if-nez p1, :cond_1

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 91
    :cond_0
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_1

    .line 81
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, -0x1

    const-string v1, "com.stripe.android.uicore.elements.OTPElementUIDisabledPreview (OTPElementUI.kt:80)"

    invoke-static {v0, p1, p0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    sget-object p0, Lcom/stripe/android/uicore/elements/ComposableSingletons$OTPElementUIKt;->INSTANCE:Lcom/stripe/android/uicore/elements/ComposableSingletons$OTPElementUIKt;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/ComposableSingletons$OTPElementUIKt;->getLambda-2$stripe_ui_core_release()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    const/high16 v10, 0xc00000

    const/16 v11, 0x7f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 82
    invoke-static/range {v1 .. v11}, Lcom/stripe/android/uicore/StripeThemeKt;->StripeTheme(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Ljava/lang/Float;Lcom/stripe/android/uicore/SectionStyle;Lcom/stripe/android/uicore/FormInsets;Lcom/stripe/android/uicore/IconStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 91
    :cond_3
    :goto_1
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_4

    new-instance v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda5;

    invoke-direct {v0, p1}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda5;-><init>(I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_4
    return-void
.end method

.method private static final OTPElementUIDisabledPreview$lambda$1(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPElementUIDisabledPreview(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final OTPElementUIPreview(Landroidx/compose/runtime/Composer;I)V
    .locals 12

    const v0, 0x7d281b7b

    .line 67
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    if-nez p1, :cond_1

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 77
    :cond_0
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_1

    .line 67
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, -0x1

    const-string v1, "com.stripe.android.uicore.elements.OTPElementUIPreview (OTPElementUI.kt:66)"

    invoke-static {v0, p1, p0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    sget-object p0, Lcom/stripe/android/uicore/elements/ComposableSingletons$OTPElementUIKt;->INSTANCE:Lcom/stripe/android/uicore/elements/ComposableSingletons$OTPElementUIKt;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/ComposableSingletons$OTPElementUIKt;->getLambda-1$stripe_ui_core_release()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    const/high16 v10, 0xc00000

    const/16 v11, 0x7f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 68
    invoke-static/range {v1 .. v11}, Lcom/stripe/android/uicore/StripeThemeKt;->StripeTheme(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Ljava/lang/Float;Lcom/stripe/android/uicore/SectionStyle;Lcom/stripe/android/uicore/FormInsets;Lcom/stripe/android/uicore/IconStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 77
    :cond_3
    :goto_1
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_4

    new-instance v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda6;

    invoke-direct {v0, p1}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda6;-><init>(I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_4
    return-void
.end method

.method private static final OTPElementUIPreview$lambda$0(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPElementUIPreview(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final OTPElementUI_RE_urrM$lambda$7$lambda$4(Landroidx/compose/runtime/MutableIntState;)I
    .locals 0

    .line 119
    check-cast p0, Landroidx/compose/runtime/IntState;

    .line 390
    invoke-interface {p0}, Landroidx/compose/runtime/IntState;->getIntValue()I

    move-result p0

    return p0
.end method

.method private static final OTPElementUI_RE_urrM$lambda$7$lambda$5(Landroidx/compose/runtime/MutableIntState;I)V
    .locals 0

    .line 391
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableIntState;->setIntValue(I)V

    return-void
.end method

.method private static final OTPElementUI_RE_urrM$lambda$8(ZLcom/stripe/android/uicore/elements/OTPElement;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/text/TextStyle;FFLjava/lang/String;Lcom/stripe/android/uicore/elements/OTPElementColors;FLandroidx/compose/ui/focus/FocusRequester;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 16

    or-int/lit8 v0, p11, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v13

    invoke-static/range {p12 .. p12}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v14

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v15, p13

    move-object/from16 v12, p14

    invoke-static/range {v1 .. v15}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPElementUI-RE_urrM(ZLcom/stripe/android/uicore/elements/OTPElement;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/text/TextStyle;FFLjava/lang/String;Lcom/stripe/android/uicore/elements/OTPElementColors;FLandroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;III)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final OTPInputBox(Ljava/lang/String;ZLandroidx/compose/ui/text/TextStyle;Lcom/stripe/android/uicore/elements/OTPElement;ILandroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/Modifier;ZLcom/stripe/android/uicore/elements/OTPElementColors;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 32

    move-object/from16 v1, p0

    move/from16 v7, p1

    move-object/from16 v8, p3

    move/from16 v9, p4

    move-object/from16 v10, p5

    move/from16 v11, p11

    const v0, -0x6acb7f51

    move-object/from16 v2, p10

    .line 213
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v12

    and-int/lit8 v2, v11, 0x6

    if-nez v2, :cond_1

    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v11

    goto :goto_1

    :cond_1
    move v2, v11

    :goto_1
    and-int/lit8 v3, v11, 0x30

    if-nez v3, :cond_3

    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v11, 0x180

    move-object/from16 v14, p2

    if-nez v3, :cond_5

    invoke-interface {v12, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v2, v3

    :cond_5
    and-int/lit16 v3, v11, 0xc00

    if-nez v3, :cond_7

    invoke-interface {v12, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x800

    goto :goto_4

    :cond_6
    const/16 v3, 0x400

    :goto_4
    or-int/2addr v2, v3

    :cond_7
    and-int/lit16 v3, v11, 0x6000

    if-nez v3, :cond_9

    invoke-interface {v12, v9}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 v3, 0x4000

    goto :goto_5

    :cond_8
    const/16 v3, 0x2000

    :goto_5
    or-int/2addr v2, v3

    :cond_9
    const/high16 v3, 0x30000

    and-int/2addr v3, v11

    if-nez v3, :cond_b

    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    const/high16 v3, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v3, 0x10000

    :goto_6
    or-int/2addr v2, v3

    :cond_b
    const/high16 v3, 0x180000

    and-int/2addr v3, v11

    if-nez v3, :cond_d

    move-object/from16 v3, p6

    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    const/high16 v4, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v4, 0x80000

    :goto_7
    or-int/2addr v2, v4

    goto :goto_8

    :cond_d
    move-object/from16 v3, p6

    :goto_8
    const/high16 v4, 0xc00000

    and-int/2addr v4, v11

    if-nez v4, :cond_f

    move/from16 v4, p7

    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v5

    if-eqz v5, :cond_e

    const/high16 v5, 0x800000

    goto :goto_9

    :cond_e
    const/high16 v5, 0x400000

    :goto_9
    or-int/2addr v2, v5

    goto :goto_a

    :cond_f
    move/from16 v4, p7

    :goto_a
    const/high16 v16, 0x6000000

    and-int v5, v11, v16

    if-nez v5, :cond_11

    move-object/from16 v5, p8

    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_10

    const/high16 v6, 0x4000000

    goto :goto_b

    :cond_10
    const/high16 v6, 0x2000000

    :goto_b
    or-int/2addr v2, v6

    goto :goto_c

    :cond_11
    move-object/from16 v5, p8

    :goto_c
    const/high16 v6, 0x30000000

    and-int/2addr v6, v11

    if-nez v6, :cond_13

    move-object/from16 v6, p9

    invoke-interface {v12, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_12

    const/high16 v17, 0x20000000

    goto :goto_d

    :cond_12
    const/high16 v17, 0x10000000

    :goto_d
    or-int v2, v2, v17

    goto :goto_e

    :cond_13
    move-object/from16 v6, p9

    :goto_e
    const v17, 0x12492493

    and-int v15, v2, v17

    const v13, 0x12492492

    if-ne v15, v13, :cond_15

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v13

    if-nez v13, :cond_14

    goto :goto_f

    .line 251
    :cond_14
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v5, v12

    goto/16 :goto_13

    .line 213
    :cond_15
    :goto_f
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v13

    if-eqz v13, :cond_16

    const/4 v13, -0x1

    const-string v15, "com.stripe.android.uicore.elements.OTPInputBox (OTPElementUI.kt:212)"

    invoke-static {v0, v2, v13, v15}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 217
    :cond_16
    new-instance v0, Landroidx/compose/ui/text/input/TextFieldValue;

    if-eqz v7, :cond_17

    .line 220
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v13

    invoke-static {v13}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(I)J

    move-result-wide v18

    goto :goto_10

    .line 222
    :cond_17
    sget-object v13, Landroidx/compose/ui/text/TextRange;->Companion:Landroidx/compose/ui/text/TextRange$Companion;

    invoke-virtual {v13}, Landroidx/compose/ui/text/TextRange$Companion;->getZero-d9O1mEE()J

    move-result-wide v18

    :goto_10
    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move v13, v2

    move-wide/from16 v2, v18

    .line 217
    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/text/input/TextFieldValue;-><init>(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v15, v0

    .line 240
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    sget-object v1, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v2, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-static {v1, v12, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(Landroidx/compose/material/MaterialTheme;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeColors;->getTextCursor-0d7_KjU()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 241
    new-instance v18, Landroidx/compose/foundation/text/KeyboardOptions;

    .line 242
    invoke-virtual {v8}, Lcom/stripe/android/uicore/elements/OTPElement;->getController()Lcom/stripe/android/uicore/elements/OTPController;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/OTPController;->getKeyboardType-PjHm6EE$stripe_ui_core_release()I

    move-result v21

    const/16 v26, 0x7b

    const/16 v27, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    .line 241
    invoke-direct/range {v18 .. v27}, Landroidx/compose/foundation/text/KeyboardOptions;-><init>(ILjava/lang/Boolean;IILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x4298449e

    .line 244
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    .line 372
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_18

    .line 373
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_19

    .line 246
    :cond_18
    new-instance v2, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda1;

    invoke-direct {v2, v10}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda1;-><init>(Landroidx/compose/ui/focus/FocusManager;)V

    .line 375
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 246
    :cond_19
    move-object/from16 v20, v2

    check-cast v20, Lkotlin/jvm/functions/Function1;

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v1, 0x42983b32

    .line 244
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    .line 378
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1a

    .line 379
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_1b

    .line 245
    :cond_1a
    new-instance v2, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda2;

    invoke-direct {v2, v10}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda2;-><init>(Landroidx/compose/ui/focus/FocusManager;)V

    .line 381
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 245
    :cond_1b
    move-object/from16 v22, v2

    check-cast v22, Lkotlin/jvm/functions/Function1;

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 244
    new-instance v19, Landroidx/compose/foundation/text/KeyboardActions;

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x3a

    const/16 v27, 0x0

    invoke-direct/range {v19 .. v27}, Landroidx/compose/foundation/text/KeyboardActions;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v1, v13, 0xe

    and-int/lit8 v2, v13, 0x7e

    shr-int/lit8 v3, v13, 0x15

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v2, v3

    shr-int/lit8 v3, v13, 0xc

    and-int/lit16 v4, v3, 0x1c00

    or-int/2addr v2, v4

    const v20, 0xe000

    and-int v5, v3, v20

    or-int v6, v2, v5

    move-object/from16 v2, p9

    move-object/from16 v21, v0

    move/from16 v22, v4

    move-object v5, v12

    move-object/from16 v0, p0

    move-object/from16 v4, p8

    move v12, v1

    move v1, v7

    move v7, v3

    move/from16 v3, p7

    .line 249
    invoke-static/range {v0 .. v6}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPInputDecorationBox(Ljava/lang/String;ZLjava/lang/String;ZLcom/stripe/android/uicore/elements/OTPElementColors;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function3;

    move-result-object v27

    move-object v1, v0

    const v0, 0x4297cd0b

    .line 217
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const/4 v0, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x4

    if-ne v12, v3, :cond_1c

    move v3, v0

    goto :goto_11

    :cond_1c
    move v3, v2

    :goto_11
    invoke-interface {v5, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    and-int v4, v13, v20

    const/16 v6, 0x4000

    if-ne v4, v6, :cond_1d

    goto :goto_12

    :cond_1d
    move v0, v2

    :goto_12
    or-int/2addr v0, v3

    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    .line 384
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_1e

    .line 385
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_1f

    .line 225
    :cond_1e
    new-instance v2, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda3;

    invoke-direct {v2, v1, v8, v9, v10}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda3;-><init>(Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;ILandroidx/compose/ui/focus/FocusManager;)V

    .line 387
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 225
    :cond_1f
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 240
    move-object/from16 v26, v21

    check-cast v26, Landroidx/compose/ui/graphics/Brush;

    and-int/lit16 v0, v7, 0x380

    or-int v0, v0, v16

    or-int v0, v0, v22

    shl-int/lit8 v3, v13, 0x9

    const/high16 v4, 0x70000

    and-int/2addr v3, v4

    or-int v29, v0, v3

    const/16 v30, 0x0

    const/16 v31, 0x3e10

    const/16 v16, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object v13, v2

    move-object/from16 v28, v5

    move-object/from16 v17, v14

    move-object v12, v15

    move-object/from16 v14, p6

    move/from16 v15, p7

    .line 216
    invoke-static/range {v12 .. v31}, Landroidx/compose/foundation/text/BasicTextFieldKt;->BasicTextField(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 251
    :cond_20
    :goto_13
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v12

    if-eqz v12, :cond_21

    new-instance v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v7, p6

    move-object v4, v8

    move v5, v9

    move-object v6, v10

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v11}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$$ExternalSyntheticLambda4;-><init>(Ljava/lang/String;ZLandroidx/compose/ui/text/TextStyle;Lcom/stripe/android/uicore/elements/OTPElement;ILandroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/Modifier;ZLcom/stripe/android/uicore/elements/OTPElementColors;Ljava/lang/String;I)V

    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_21
    return-void
.end method

.method private static final OTPInputBox$lambda$10$lambda$9(Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/foundation/text/KeyboardActionScope;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$KeyboardActions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 246
    invoke-interface {p0, p1}, Landroidx/compose/ui/focus/FocusManager;->clearFocus(Z)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final OTPInputBox$lambda$12$lambda$11(Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/foundation/text/KeyboardActionScope;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$KeyboardActions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    sget-object p1, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getNext-dhqQ-8s()I

    move-result p1

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/FocusManagerKtKt;->moveFocusSafely-Mxy_nc0(Landroidx/compose/ui/focus/FocusManager;I)Z

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final OTPInputBox$lambda$15$lambda$14(Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;ILandroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/text/input/TextFieldValue;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 229
    check-cast p0, Ljava/lang/CharSequence;

    invoke-static {p0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    invoke-virtual {p4}, Landroidx/compose/ui/text/input/TextFieldValue;->getText()Ljava/lang/String;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-static {p0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    .line 230
    invoke-virtual {p4}, Landroidx/compose/ui/text/input/TextFieldValue;->getText()Ljava/lang/String;

    move-result-object p0

    const/4 p4, 0x1

    invoke-virtual {p0, p4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const-string p4, "substring(...)"

    invoke-static {p0, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 232
    :cond_0
    invoke-virtual {p4}, Landroidx/compose/ui/text/input/TextFieldValue;->getText()Ljava/lang/String;

    move-result-object p0

    .line 234
    :goto_0
    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/OTPElement;->getController()Lcom/stripe/android/uicore/elements/OTPController;

    move-result-object p1

    invoke-virtual {p1, p2, p0}, Lcom/stripe/android/uicore/elements/OTPController;->onValueChanged(ILjava/lang/String;)I

    move-result p0

    const/4 p1, 0x0

    .line 235
    invoke-static {p1, p0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 393
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    move-object p1, p0

    check-cast p1, Lkotlin/collections/IntIterator;

    invoke-virtual {p1}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 235
    sget-object p1, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getNext-dhqQ-8s()I

    move-result p1

    invoke-static {p3, p1}, Lcom/stripe/android/uicore/FocusManagerKtKt;->moveFocusSafely-Mxy_nc0(Landroidx/compose/ui/focus/FocusManager;I)Z

    goto :goto_1

    .line 236
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final OTPInputBox$lambda$16(Ljava/lang/String;ZLandroidx/compose/ui/text/TextStyle;Lcom/stripe/android/uicore/elements/OTPElement;ILandroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/Modifier;ZLcom/stripe/android/uicore/elements/OTPElementColors;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 13

    or-int/lit8 v0, p10, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v12

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p11

    invoke-static/range {v1 .. v12}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPInputBox(Ljava/lang/String;ZLandroidx/compose/ui/text/TextStyle;Lcom/stripe/android/uicore/elements/OTPElement;ILandroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/Modifier;ZLcom/stripe/android/uicore/elements/OTPElementColors;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final OTPInputDecorationBox(Ljava/lang/String;ZLjava/lang/String;ZLcom/stripe/android/uicore/elements/OTPElementColors;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function3;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Z",
            "Lcom/stripe/android/uicore/elements/OTPElementColors;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Lkotlin/jvm/functions/Function3<",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    const v0, 0x3665675f

    invoke-interface {p5, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.uicore.elements.OTPInputDecorationBox (OTPElementUI.kt:260)"

    .line 261
    invoke-static {v0, p6, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    new-instance v3, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1;

    move-object v6, p0

    move v4, p1

    move-object v8, p2

    move v7, p3

    move-object v5, p4

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputDecorationBox$1;-><init>(ZLcom/stripe/android/uicore/elements/OTPElementColors;Ljava/lang/String;ZLjava/lang/String;)V

    const/16 p0, 0x36

    const p1, 0x5d1b9611

    const/4 p2, 0x1

    invoke-static {p1, p2, v3, p5, p0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p0

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    check-cast p0, Lkotlin/jvm/functions/Function3;

    return-object p0
.end method

.method public static final synthetic access$OTPElementUI_RE_urrM$lambda$7$lambda$5(Landroidx/compose/runtime/MutableIntState;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPElementUI_RE_urrM$lambda$7$lambda$5(Landroidx/compose/runtime/MutableIntState;I)V

    return-void
.end method

.method public static final synthetic access$OTPInputBox(Ljava/lang/String;ZLandroidx/compose/ui/text/TextStyle;Lcom/stripe/android/uicore/elements/OTPElement;ILandroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/Modifier;ZLcom/stripe/android/uicore/elements/OTPElementColors;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p11}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPInputBox(Ljava/lang/String;ZLandroidx/compose/ui/text/TextStyle;Lcom/stripe/android/uicore/elements/OTPElement;ILandroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/Modifier;ZLcom/stripe/android/uicore/elements/OTPElementColors;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
