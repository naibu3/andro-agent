.class public final Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTheme;
.super Ljava/lang/Object;
.source "PrimaryButtonTheme.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPrimaryButtonTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButtonTheme.kt\ncom/stripe/android/paymentsheet/ui/PrimaryButtonTheme\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,164:1\n77#2:165\n77#2:166\n77#2:183\n77#2:199\n1225#3,3:167\n1228#3,3:180\n1225#3,3:184\n1228#3,3:196\n1225#3,3:200\n1228#3,3:205\n708#4:170\n696#4:171\n708#4:172\n696#4:173\n708#4:174\n696#4:175\n708#4:176\n696#4:177\n708#4:178\n696#4:179\n139#5:187\n125#5:188\n169#5:189\n139#5:190\n125#5:191\n169#5:192\n139#5:193\n125#5:194\n169#5:195\n265#6:203\n251#6:204\n*S KotlinDebug\n*F\n+ 1 PrimaryButtonTheme.kt\ncom/stripe/android/paymentsheet/ui/PrimaryButtonTheme\n*L\n71#1:165\n72#1:166\n113#1:183\n133#1:199\n75#1:167,3\n75#1:180,3\n115#1:184,3\n115#1:196,3\n135#1:200,3\n135#1:205,3\n82#1:170\n82#1:171\n85#1:172\n85#1:173\n88#1:174\n88#1:175\n96#1:176\n96#1:177\n103#1:178\n103#1:179\n117#1:187\n117#1:188\n118#1:189\n120#1:190\n120#1:191\n121#1:192\n123#1:193\n123#1:194\n124#1:195\n141#1:203\n141#1:204\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0005H\u0003\u00a2\u0006\u0002\u0010\u0007J\r\u0010\u0011\u001a\u00020\tH\u0003\u00a2\u0006\u0002\u0010\u000bJ\r\u0010\u0012\u001a\u00020\rH\u0003\u00a2\u0006\u0002\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u00058G\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0008\u001a\u00020\t8G\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u000c\u001a\u00020\r8G\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTheme;",
        "",
        "<init>",
        "()V",
        "colors",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;",
        "getColors",
        "(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;",
        "shape",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;",
        "getShape",
        "(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;",
        "typography",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;",
        "getTypography",
        "(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;",
        "getPrimaryButtonColors",
        "getPrimaryButtonShape",
        "getPrimaryButtonTypography",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTheme;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTheme;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTheme;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTheme;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTheme;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final getPrimaryButtonColors(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;
    .locals 21

    move-object/from16 v0, p1

    const v1, -0x5fa996d4

    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.getPrimaryButtonColors (PrimaryButtonTheme.kt:68)"

    move/from16 v4, p2

    .line 69
    invoke-static {v1, v4, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 70
    :cond_0
    sget-object v1, Lcom/stripe/android/uicore/StripeTheme;->INSTANCE:Lcom/stripe/android/uicore/StripeTheme;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeTheme;->getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object v1

    .line 71
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v2

    check-cast v2, Landroidx/compose/runtime/CompositionLocal;

    const v3, 0x789c5f52

    .line 165
    const-string v4, "CC:CompositionLocal.kt#9igjgp"

    invoke-static {v0, v3, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 71
    check-cast v2, Landroid/content/Context;

    .line 72
    invoke-static {}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonThemeKt;->getLocalPrimaryButtonColors()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v5

    check-cast v5, Landroidx/compose/runtime/CompositionLocal;

    .line 166
    invoke-static {v0, v3, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v0, v5}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 72
    check-cast v3, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;

    const/4 v4, 0x0

    .line 73
    invoke-static {v0, v4}, Landroidx/compose/foundation/DarkThemeKt;->isSystemInDarkTheme(Landroidx/compose/runtime/Composer;I)Z

    move-result v4

    const v5, 0xbc4a40d

    invoke-interface {v0, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 76
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    .line 77
    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    .line 78
    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    .line 79
    invoke-interface {v0, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v6

    or-int/2addr v5, v6

    .line 167
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_1

    .line 168
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_8

    .line 82
    :cond_1
    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;->getBackground-0d7_KjU()J

    move-result-wide v5

    const-wide/16 v7, 0x10

    cmp-long v9, v5, v7

    if-eqz v9, :cond_2

    goto :goto_0

    .line 83
    :cond_2
    invoke-static {v1, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->getBackgroundColor(Lcom/stripe/android/uicore/PrimaryButtonStyle;Landroid/content/Context;)I

    move-result v5

    invoke-static {v5}, Landroidx/compose/ui/graphics/ColorKt;->Color(I)J

    move-result-wide v5

    :goto_0
    move-wide v10, v5

    .line 85
    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;->getOnBackground-0d7_KjU()J

    move-result-wide v5

    cmp-long v9, v5, v7

    if-eqz v9, :cond_3

    goto :goto_1

    .line 86
    :cond_3
    invoke-static {v1, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->getOnBackgroundColor(Lcom/stripe/android/uicore/PrimaryButtonStyle;Landroid/content/Context;)I

    move-result v5

    invoke-static {v5}, Landroidx/compose/ui/graphics/ColorKt;->Color(I)J

    move-result-wide v5

    :goto_1
    move-wide v12, v5

    .line 88
    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;->getSuccessBackground-0d7_KjU()J

    move-result-wide v5

    cmp-long v9, v5, v7

    if-eqz v9, :cond_4

    goto :goto_2

    .line 92
    :cond_4
    sget v5, Lcom/stripe/android/paymentsheet/R$color;->stripe_paymentsheet_primary_button_success_background:I

    .line 90
    invoke-static {v2, v5}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v5

    .line 89
    invoke-static {v5}, Landroidx/compose/ui/graphics/ColorKt;->Color(I)J

    move-result-wide v5

    :goto_2
    move-wide v14, v5

    .line 96
    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;->getOnSuccessBackground-0d7_KjU()J

    move-result-wide v5

    cmp-long v9, v5, v7

    if-eqz v9, :cond_5

    :goto_3
    move-wide/from16 v16, v5

    goto :goto_5

    :cond_5
    if-eqz v4, :cond_6

    .line 98
    sget-object v4, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    move-result-wide v4

    goto :goto_4

    .line 100
    :cond_6
    sget-object v4, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v4

    :goto_4
    move-wide v5, v4

    goto :goto_3

    .line 103
    :goto_5
    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;->getBorder-0d7_KjU()J

    move-result-wide v3

    cmp-long v5, v3, v7

    if-eqz v5, :cond_7

    goto :goto_6

    .line 104
    :cond_7
    invoke-static {v1, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->getBorderStrokeColor(Lcom/stripe/android/uicore/PrimaryButtonStyle;Landroid/content/Context;)I

    move-result v1

    invoke-static {v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(I)J

    move-result-wide v3

    :goto_6
    move-wide/from16 v18, v3

    .line 81
    new-instance v9, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;

    const/16 v20, 0x0

    invoke-direct/range {v9 .. v20}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;-><init>(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 180
    invoke-interface {v0, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    move-object v6, v9

    .line 75
    :cond_8
    check-cast v6, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_9
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-object v6
.end method

.method private final getPrimaryButtonShape(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;
    .locals 4

    const v0, -0x6845e150

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.getPrimaryButtonShape (PrimaryButtonTheme.kt:110)"

    .line 111
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 112
    :cond_0
    sget-object p2, Lcom/stripe/android/uicore/StripeTheme;->INSTANCE:Lcom/stripe/android/uicore/StripeTheme;

    invoke-virtual {p2}, Lcom/stripe/android/uicore/StripeTheme;->getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object p2

    .line 113
    invoke-static {}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonThemeKt;->getLocalPrimaryButtonShape()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/CompositionLocal;

    const v1, 0x789c5f52

    const-string v2, "CC:CompositionLocal.kt#9igjgp"

    .line 183
    invoke-static {p1, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 113
    check-cast v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;

    const v1, -0x4a290cf8

    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 115
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    .line 184
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1

    .line 185
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_5

    .line 117
    :cond_1
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;->getCornerRadius-D9Ej5fM()F

    move-result v1

    .line 188
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    .line 118
    :cond_2
    invoke-virtual {p2}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getShape()Lcom/stripe/android/uicore/PrimaryButtonShape;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/PrimaryButtonShape;->getCornerRadius()F

    move-result v1

    .line 189
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 120
    :goto_0
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;->getBorderStrokeWidth-D9Ej5fM()F

    move-result v2

    .line 191
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_1

    .line 121
    :cond_3
    invoke-virtual {p2}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getShape()Lcom/stripe/android/uicore/PrimaryButtonShape;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/PrimaryButtonShape;->getBorderStrokeWidth()F

    move-result v2

    .line 192
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 123
    :goto_1
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;->getHeight-D9Ej5fM()F

    move-result v0

    .line 194
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_2

    .line 124
    :cond_4
    invoke-virtual {p2}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getShape()Lcom/stripe/android/uicore/PrimaryButtonShape;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/uicore/PrimaryButtonShape;->getHeight()F

    move-result p2

    .line 195
    invoke-static {p2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 116
    :goto_2
    new-instance p2, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;

    const/4 v3, 0x0

    invoke-direct {p2, v1, v2, v0, v3}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;-><init>(FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 196
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    move-object v2, p2

    .line 115
    :cond_5
    check-cast v2, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_6
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-object v2
.end method

.method private final getPrimaryButtonTypography(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;
    .locals 9

    const v0, -0x48290a34

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.getPrimaryButtonTypography (PrimaryButtonTheme.kt:130)"

    .line 131
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 132
    :cond_0
    sget-object p2, Lcom/stripe/android/uicore/StripeTheme;->INSTANCE:Lcom/stripe/android/uicore/StripeTheme;

    invoke-virtual {p2}, Lcom/stripe/android/uicore/StripeTheme;->getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object p2

    .line 133
    invoke-static {}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonThemeKt;->getLocalPrimaryButtonTypography()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/CompositionLocal;

    const v1, 0x789c5f52

    const-string v2, "CC:CompositionLocal.kt#9igjgp"

    .line 199
    invoke-static {p1, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 133
    check-cast v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;

    const v1, 0x3cb0c8fa

    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 135
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    .line 200
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1

    .line 201
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_5

    .line 137
    :cond_1
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;->getFontFamily()Landroidx/compose/ui/text/font/FontFamily;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_3

    .line 138
    invoke-virtual {p2}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getTypography()Lcom/stripe/android/uicore/PrimaryButtonTypography;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/PrimaryButtonTypography;->getFontFamily()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v3

    const/4 v1, 0x1

    .line 139
    new-array v1, v1, [Landroidx/compose/ui/text/font/Font;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Landroidx/compose/ui/text/font/FontKt;->Font-YpTlLL0$default(ILandroidx/compose/ui/text/font/FontWeight;IIILjava/lang/Object;)Landroidx/compose/ui/text/font/Font;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v1, v4

    invoke-static {v1}, Landroidx/compose/ui/text/font/FontFamilyKt;->FontFamily([Landroidx/compose/ui/text/font/Font;)Landroidx/compose/ui/text/font/FontFamily;

    move-result-object v1

    goto :goto_0

    :cond_2
    move-object v1, v2

    .line 141
    :cond_3
    :goto_0
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;->getFontSize-XSAIIZE()J

    move-result-wide v3

    .line 204
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/TextUnitKt;->isUnspecified--R2X_6o(J)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    .line 142
    :cond_4
    invoke-virtual {p2}, Lcom/stripe/android/uicore/PrimaryButtonStyle;->getTypography()Lcom/stripe/android/uicore/PrimaryButtonTypography;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/uicore/PrimaryButtonTypography;->getFontSize-XSAIIZE()J

    move-result-wide v3

    .line 136
    :goto_1
    new-instance p2, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;

    invoke-direct {p2, v1, v3, v4, v2}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;-><init>(Landroidx/compose/ui/text/font/FontFamily;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 205
    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    move-object v2, p2

    .line 135
    :cond_5
    check-cast v2, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_6
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-object v2
.end method


# virtual methods
.method public final getColors(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;
    .locals 3

    const v0, -0xcc35015

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.<get-colors> (PrimaryButtonTheme.kt:57)"

    .line 58
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 p2, p2, 0xe

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTheme;->getPrimaryButtonColors(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;

    move-result-object p2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-object p2
.end method

.method public final getShape(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;
    .locals 3

    const v0, -0x62c3c378

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.<get-shape> (PrimaryButtonTheme.kt:61)"

    .line 62
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 p2, p2, 0xe

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTheme;->getPrimaryButtonShape(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonShape;

    move-result-object p2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-object p2
.end method

.method public final getTypography(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;
    .locals 3

    const v0, 0x44c28a8a

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.ui.PrimaryButtonTheme.<get-typography> (PrimaryButtonTheme.kt:65)"

    .line 66
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 p2, p2, 0xe

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTheme;->getPrimaryButtonTypography(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;

    move-result-object p2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-object p2
.end method
