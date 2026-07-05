.class public final Lcom/google/accompanist/themeadapter/appcompat/AppCompatTheme;
.super Ljava/lang/Object;
.source "AppCompatTheme.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAppCompatTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppCompatTheme.kt\ncom/google/accompanist/themeadapter/appcompat/AppCompatTheme\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,248:1\n77#2:249\n1223#3,6:250\n233#4,3:256\n*S KotlinDebug\n*F\n+ 1 AppCompatTheme.kt\ncom/google/accompanist/themeadapter/appcompat/AppCompatTheme\n*L\n110#1:249\n116#1:250,6\n176#1:256,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u001aH\u0010\u0000\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00010\n\u00a2\u0006\u0002\u0008\u000bH\u0007\u00a2\u0006\u0002\u0010\u000c\u001a \u0010\r\u001a\u00020\u000e*\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u00a8\u0006\u000f"
    }
    d2 = {
        "AppCompatTheme",
        "",
        "context",
        "Landroid/content/Context;",
        "readColors",
        "",
        "readTypography",
        "shapes",
        "Landroidx/compose/material/Shapes;",
        "content",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "(Landroid/content/Context;ZZLandroidx/compose/material/Shapes;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
        "createAppCompatTheme",
        "Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;",
        "themeadapter-appcompat_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final AppCompatTheme(Landroid/content/Context;ZZLandroidx/compose/material/Shapes;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "ZZ",
            "Landroidx/compose/material/Shapes;",
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

    .annotation runtime Lkotlin/Deprecated;
        message = "\n   AppCompat ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-appcompat/\n"
    .end annotation

    move-object/from16 v5, p4

    move/from16 v6, p6

    const-string v0, "content"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x28c931e4

    move-object/from16 v1, p5

    .line 115
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v11

    and-int/lit8 v1, p7, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v6, 0x2

    goto :goto_0

    :cond_0
    move v2, v6

    :goto_0
    and-int/lit8 v3, p7, 0x2

    if-eqz v3, :cond_1

    or-int/lit8 v2, v2, 0x30

    goto :goto_2

    :cond_1
    and-int/lit8 v4, v6, 0x70

    if-nez v4, :cond_3

    invoke-interface {v11, p1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_1

    :cond_2
    const/16 v4, 0x10

    :goto_1
    or-int/2addr v2, v4

    :cond_3
    :goto_2
    and-int/lit8 v4, p7, 0x4

    if-eqz v4, :cond_4

    or-int/lit16 v2, v2, 0x180

    goto :goto_4

    :cond_4
    and-int/lit16 v7, v6, 0x380

    if-nez v7, :cond_6

    move/from16 v7, p2

    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x100

    goto :goto_3

    :cond_5
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v2, v8

    goto :goto_5

    :cond_6
    :goto_4
    move/from16 v7, p2

    :goto_5
    and-int/lit16 v8, v6, 0x1c00

    if-nez v8, :cond_9

    and-int/lit8 v8, p7, 0x8

    if-nez v8, :cond_7

    move-object/from16 v8, p3

    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x800

    goto :goto_6

    :cond_7
    move-object/from16 v8, p3

    :cond_8
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v2, v9

    goto :goto_7

    :cond_9
    move-object/from16 v8, p3

    :goto_7
    and-int/lit8 v9, p7, 0x10

    if-eqz v9, :cond_a

    or-int/lit16 v2, v2, 0x6000

    goto :goto_9

    :cond_a
    const v9, 0xe000

    and-int/2addr v9, v6

    if-nez v9, :cond_c

    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    const/16 v9, 0x4000

    goto :goto_8

    :cond_b
    const/16 v9, 0x2000

    :goto_8
    or-int/2addr v2, v9

    :cond_c
    :goto_9
    const/4 v9, 0x1

    if-ne v1, v9, :cond_e

    const v10, 0xb6db

    and-int/2addr v10, v2

    const/16 v12, 0x2492

    if-ne v10, v12, :cond_e

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v10

    if-nez v10, :cond_d

    goto :goto_a

    .line 135
    :cond_d
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move v3, v7

    move-object v4, v8

    move-object v1, p0

    move v2, p1

    goto/16 :goto_e

    .line 115
    :cond_e
    :goto_a
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v10, v6, 0x1

    if-eqz v10, :cond_12

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v10

    if-eqz v10, :cond_f

    goto :goto_c

    .line 113
    :cond_f
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    if-eqz v1, :cond_10

    and-int/lit8 v2, v2, -0xf

    :cond_10
    and-int/lit8 v1, p7, 0x8

    if-eqz v1, :cond_11

    and-int/lit16 v2, v2, -0x1c01

    :cond_11
    :goto_b
    move v1, v7

    goto :goto_d

    :cond_12
    :goto_c
    if-eqz v1, :cond_13

    .line 110
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object p0

    check-cast p0, Landroidx/compose/runtime/CompositionLocal;

    const v1, 0x789c5f52

    const-string v10, "CC:CompositionLocal.kt#9igjgp"

    .line 249
    invoke-static {v11, v1, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v11, p0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    check-cast p0, Landroid/content/Context;

    and-int/lit8 v2, v2, -0xf

    :cond_13
    if-eqz v3, :cond_14

    move p1, v9

    :cond_14
    if-eqz v4, :cond_15

    move v7, v9

    :cond_15
    and-int/lit8 v1, p7, 0x8

    if-eqz v1, :cond_11

    .line 113
    sget-object v1, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v3, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-virtual {v1, v11, v3}, Landroidx/compose/material/MaterialTheme;->getShapes(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Shapes;

    move-result-object v1

    and-int/lit16 v2, v2, -0x1c01

    move-object v8, v1

    goto :goto_b

    :goto_d
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_16

    const/4 v3, -0x1

    const-string v4, "com.google.accompanist.themeadapter.appcompat.AppCompatTheme (AppCompatTheme.kt:114)"

    .line 115
    invoke-static {v0, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 116
    :cond_16
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const v3, -0x2df6305e

    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    .line 250
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_17

    .line 251
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_18

    .line 117
    :cond_17
    invoke-static {p0, p1, v1}, Lcom/google/accompanist/themeadapter/appcompat/AppCompatTheme;->createAppCompatTheme(Landroid/content/Context;ZZ)Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;

    move-result-object v3

    .line 253
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 116
    :cond_18
    check-cast v3, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 124
    invoke-virtual {v3}, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;->getColors()Landroidx/compose/material/Colors;

    move-result-object v0

    const v4, -0x2df62f98

    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    if-nez v0, :cond_19

    sget-object v0, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v4, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-virtual {v0, v11, v4}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v0

    :cond_19
    move-object v7, v0

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 125
    invoke-virtual {v3}, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;->getTypography()Landroidx/compose/material/Typography;

    move-result-object v0

    const v3, -0x2df62f57

    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    if-nez v0, :cond_1a

    sget-object v0, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v3, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-virtual {v0, v11, v3}, Landroidx/compose/material/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Typography;

    move-result-object v0

    :cond_1a
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 127
    new-instance v3, Lcom/google/accompanist/themeadapter/appcompat/AppCompatTheme$AppCompatTheme$1;

    invoke-direct {v3, v5}, Lcom/google/accompanist/themeadapter/appcompat/AppCompatTheme$AppCompatTheme$1;-><init>(Lkotlin/jvm/functions/Function2;)V

    const v4, -0x21e7e148

    invoke-static {v11, v4, v9, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Lkotlin/jvm/functions/Function2;

    shr-int/lit8 v2, v2, 0x3

    and-int/lit16 v2, v2, 0x380

    or-int/lit16 v12, v2, 0xc00

    const/4 v13, 0x0

    move-object v9, v8

    move-object v8, v0

    .line 123
    invoke-static/range {v7 .. v13}, Landroidx/compose/material/MaterialThemeKt;->MaterialTheme(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1b
    move v3, v1

    move-object v4, v9

    move v2, p1

    move-object v1, p0

    .line 135
    :goto_e
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_1c

    new-instance v0, Lcom/google/accompanist/themeadapter/appcompat/AppCompatTheme$AppCompatTheme$2;

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/google/accompanist/themeadapter/appcompat/AppCompatTheme$AppCompatTheme$2;-><init>(Landroid/content/Context;ZZLandroidx/compose/material/Shapes;Lkotlin/jvm/functions/Function2;II)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_1c
    return-void
.end method

.method public static final createAppCompatTheme(Landroid/content/Context;ZZ)Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;
    .locals 33
    .annotation runtime Lkotlin/Deprecated;
        message = "\n   AppCompat ThemeAdapter is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/themeadapter-appcompat/\n"
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    sget-object v1, Lcom/google/accompanist/themeadapter/appcompat/R$styleable;->ThemeAdapterAppCompatTheme:[I

    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v2

    const-string v0, "obtainStyledAttributes(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    sget v0, Lcom/google/accompanist/themeadapter/appcompat/R$styleable;->ThemeAdapterAppCompatTheme_windowActionBar:I

    invoke-virtual {v2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 182
    sget v1, Lcom/google/accompanist/themeadapter/appcompat/R$styleable;->ThemeAdapterAppCompatTheme_isLightTheme:I

    const/4 v3, 0x1

    invoke-virtual {v2, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    const/16 v27, 0xfff

    const/16 v28, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    if-eqz v1, :cond_0

    .line 184
    invoke-static/range {v3 .. v28}, Landroidx/compose/material/ColorsKt;->lightColors-2qZNXz8$default(JJJJJJJJJJJJILjava/lang/Object;)Landroidx/compose/material/Colors;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static/range {v3 .. v28}, Landroidx/compose/material/ColorsKt;->darkColors-2qZNXz8$default(JJJJJJJJJJJJILjava/lang/Object;)Landroidx/compose/material/Colors;

    move-result-object v1

    .line 187
    :goto_0
    sget v3, Lcom/google/accompanist/themeadapter/appcompat/R$styleable;->ThemeAdapterAppCompatTheme_colorPrimary:I

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-wide/16 v4, 0x0

    invoke-static/range {v2 .. v7}, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->parseColor-mxwnekA$default(Landroid/content/res/TypedArray;IJILjava/lang/Object;)J

    move-result-wide v8

    .line 190
    sget v3, Lcom/google/accompanist/themeadapter/appcompat/R$styleable;->ThemeAdapterAppCompatTheme_colorPrimaryDark:I

    invoke-static/range {v2 .. v7}, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->parseColor-mxwnekA$default(Landroid/content/res/TypedArray;IJILjava/lang/Object;)J

    move-result-wide v10

    .line 191
    invoke-static {v8, v9}, Lcom/google/accompanist/themeadapter/appcompat/ColorKt;->calculateOnColor-8_81llA(J)J

    move-result-wide v18

    .line 194
    sget v3, Lcom/google/accompanist/themeadapter/appcompat/R$styleable;->ThemeAdapterAppCompatTheme_colorAccent:I

    invoke-static/range {v2 .. v7}, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->parseColor-mxwnekA$default(Landroid/content/res/TypedArray;IJILjava/lang/Object;)J

    move-result-wide v12

    .line 197
    invoke-static {v12, v13}, Lcom/google/accompanist/themeadapter/appcompat/ColorKt;->calculateOnColor-8_81llA(J)J

    move-result-wide v20

    .line 202
    sget v3, Lcom/google/accompanist/themeadapter/appcompat/R$styleable;->ThemeAdapterAppCompatTheme_android_textColorPrimary:I

    .line 201
    invoke-static/range {v2 .. v7}, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->parseColor-mxwnekA$default(Landroid/content/res/TypedArray;IJILjava/lang/Object;)J

    move-result-wide v3

    .line 205
    sget-object v5, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v5

    if-nez v5, :cond_1

    const/16 v28, 0xe

    const/16 v29, 0x0

    const/high16 v24, 0x3f800000    # 1.0f

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-wide/from16 v22, v3

    invoke-static/range {v22 .. v29}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v3

    move-wide v14, v3

    goto :goto_1

    :cond_1
    move-wide/from16 v22, v3

    move-wide/from16 v14, v22

    .line 208
    :goto_1
    invoke-virtual {v1}, Landroidx/compose/material/Colors;->getSurface-0d7_KjU()J

    move-result-wide v3

    .line 209
    invoke-static {v3, v4, v14, v15}, Lcom/google/accompanist/themeadapter/appcompat/ColorKt;->calculateOnColorWithTextColorPrimary--OWjLjI(JJ)J

    move-result-wide v24

    move-wide v4, v3

    .line 212
    sget v3, Lcom/google/accompanist/themeadapter/appcompat/R$styleable;->ThemeAdapterAppCompatTheme_android_colorBackground:I

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-wide/from16 v16, v4

    const-wide/16 v4, 0x0

    invoke-static/range {v2 .. v7}, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->parseColor-mxwnekA$default(Landroid/content/res/TypedArray;IJILjava/lang/Object;)J

    move-result-wide v3

    .line 213
    invoke-static {v3, v4, v14, v15}, Lcom/google/accompanist/themeadapter/appcompat/ColorKt;->calculateOnColorWithTextColorPrimary--OWjLjI(JJ)J

    move-result-wide v22

    move-wide v4, v3

    .line 215
    sget v3, Lcom/google/accompanist/themeadapter/appcompat/R$styleable;->ThemeAdapterAppCompatTheme_colorError:I

    move-wide v14, v4

    const-wide/16 v4, 0x0

    invoke-static/range {v2 .. v7}, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->parseColor-mxwnekA$default(Landroid/content/res/TypedArray;IJILjava/lang/Object;)J

    move-result-wide v3

    .line 216
    invoke-static {v3, v4}, Lcom/google/accompanist/themeadapter/appcompat/ColorKt;->calculateOnColor-8_81llA(J)J

    move-result-wide v26

    const/16 v29, 0x1000

    const/16 v30, 0x0

    const/16 v28, 0x0

    move-wide v6, v10

    move-wide v10, v12

    move-wide/from16 v31, v16

    move-wide/from16 v16, v3

    move-wide v4, v8

    move-wide v8, v12

    move-wide v12, v14

    move-wide/from16 v14, v31

    move-object v3, v1

    .line 218
    invoke-static/range {v3 .. v30}, Landroidx/compose/material/Colors;->copy-pvPzIIM$default(Landroidx/compose/material/Colors;JJJJJJJJJJJJZILjava/lang/Object;)Landroidx/compose/material/Colors;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v0

    :goto_2
    if-eqz p2, :cond_4

    .line 239
    sget v3, Lcom/google/accompanist/themeadapter/appcompat/R$styleable;->ThemeAdapterAppCompatTheme_fontFamily:I

    invoke-static {v2, v3}, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->parseFontFamily(Landroid/content/res/TypedArray;I)Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;

    move-result-object v3

    if-nez v3, :cond_3

    .line 240
    sget v3, Lcom/google/accompanist/themeadapter/appcompat/R$styleable;->ThemeAdapterAppCompatTheme_android_fontFamily:I

    invoke-static {v2, v3}, Lcom/google/accompanist/themeadapter/core/ResourceUtilsKt;->parseFontFamily(Landroid/content/res/TypedArray;I)Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;

    move-result-object v3

    :cond_3
    if-eqz v3, :cond_4

    .line 242
    new-instance v4, Landroidx/compose/material/Typography;

    invoke-virtual {v3}, Lcom/google/accompanist/themeadapter/core/FontFamilyWithWeight;->getFontFamily()Landroidx/compose/ui/text/font/FontFamily;

    move-result-object v5

    const/16 v19, 0x3ffe

    const/16 v20, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v4 .. v20}, Landroidx/compose/material/Typography;-><init>(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v4

    .line 246
    :cond_4
    new-instance v3, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;

    invoke-direct {v3, v1, v0}, Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;-><init>(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;)V

    .line 257
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    return-object v3

    .line 177
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "createAppCompatTheme requires the host context\'s theme to extend Theme.AppCompat"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic createAppCompatTheme$default(Landroid/content/Context;ZZILjava/lang/Object;)Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x1

    if-eqz p4, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v0

    .line 173
    :cond_1
    invoke-static {p0, p1, p2}, Lcom/google/accompanist/themeadapter/appcompat/AppCompatTheme;->createAppCompatTheme(Landroid/content/Context;ZZ)Lcom/google/accompanist/themeadapter/appcompat/ThemeParameters;

    move-result-object p0

    return-object p0
.end method
