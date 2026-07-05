.class public final Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;
.super Ljava/lang/Object;
.source "SavedPaymentMethodTab.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSavedPaymentMethodTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedPaymentMethodTab.kt\ncom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,293:1\n1225#2,6:294\n149#3:300\n149#3:301\n149#3:302\n149#3:303\n149#3:305\n149#3:306\n77#4:304\n*S KotlinDebug\n*F\n+ 1 SavedPaymentMethodTab.kt\ncom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt\n*L\n158#1:294,6\n159#1:300\n163#1:301\n178#1:302\n179#1:303\n231#1:305\n65#1:306\n220#1:304\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u001a\u00b1\u0001\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00082\n\u0008\u0003\u0010 \u001a\u0004\u0018\u00010\u001e2\u0008\u0008\u0002\u0010!\u001a\u00020\u00182\u0008\u0008\u0002\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u00012\u0010\u0008\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010%2\u0008\u0008\u0002\u0010&\u001a\u00020\u00012\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00130%H\u0001\u00a2\u0006\u0004\u0008(\u0010)\u001a9\u0010*\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0010\u0008\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010%2\u0008\u0008\u0002\u0010&\u001a\u00020\u0001H\u0003\u00a2\u0006\u0002\u0010+\u001a3\u0010,\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0015H\u0003\u00a2\u0006\u0004\u0008-\u0010.\u001a-\u0010/\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00012\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u00130%2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0015H\u0003\u00a2\u0006\u0002\u00101\u001a\r\u00102\u001a\u00020\u0013H\u0003\u00a2\u0006\u0002\u00103\u001a\r\u00104\u001a\u00020\u0013H\u0003\u00a2\u0006\u0002\u00103\u001a\r\u00105\u001a\u00020\u0013H\u0003\u00a2\u0006\u0002\u00103\"\u0016\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0002\u0010\u0003\"\u0010\u0010\u0004\u001a\u00020\u00018\u0006X\u0087T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\t\"\u0010\u0010\n\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\t\"\u0010\u0010\u000b\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\t\"\u0010\u0010\u000c\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\t\"\u0016\u0010\r\u001a\u00020\u000eX\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u00066"
    }
    d2 = {
        "SAVED_PAYMENT_METHOD_CARD_TEST_TAG",
        "",
        "getSAVED_PAYMENT_METHOD_CARD_TEST_TAG$annotations",
        "()V",
        "TEST_TAG_MODIFY_BADGE",
        "EDIT_ICON_SCALE",
        "",
        "editIconColorLight",
        "Landroidx/compose/ui/graphics/Color;",
        "J",
        "editIconColorDark",
        "editIconBackgroundColorLight",
        "editIconBackgroundColorDark",
        "SavedPaymentMethodsTopContentPadding",
        "Landroidx/compose/ui/unit/Dp;",
        "getSavedPaymentMethodsTopContentPadding",
        "()F",
        "F",
        "SavedPaymentMethodTab",
        "",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "viewWidth",
        "isSelected",
        "",
        "shouldShowModifyBadge",
        "shouldShowDefaultBadge",
        "isEnabled",
        "isClickable",
        "iconRes",
        "",
        "iconTint",
        "labelIcon",
        "shouldTintLabelIcon",
        "labelText",
        "description",
        "onModifyListener",
        "Lkotlin/Function0;",
        "onModifyAccessibilityDescription",
        "onItemSelectedListener",
        "SavedPaymentMethodTab-RYabdnw",
        "(Landroidx/compose/ui/Modifier;FZZZZZILandroidx/compose/ui/graphics/Color;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V",
        "SavedPaymentMethodBadge",
        "(ZZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V",
        "SavedPaymentMethodCard",
        "SavedPaymentMethodCard-drOMvmE",
        "(ZILandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "ModifyBadge",
        "onPressed",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "SavedPaymentMethodTabUISelected",
        "(Landroidx/compose/runtime/Composer;I)V",
        "SavedPaymentMethodTabUIModifiable",
        "DefaultSavedPaymentMethodTabUIModifiable",
        "paymentsheet_release"
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
.field private static final EDIT_ICON_SCALE:F = 0.9f

.field public static final SAVED_PAYMENT_METHOD_CARD_TEST_TAG:Ljava/lang/String; = "SAVED_PAYMENT_METHOD_CARD_TEST_TAG"

.field private static final SavedPaymentMethodsTopContentPadding:F

.field public static final TEST_TAG_MODIFY_BADGE:Ljava/lang/String; = "modify_badge"

.field private static final editIconBackgroundColorDark:J

.field private static final editIconBackgroundColorLight:J

.field private static final editIconColorDark:J

.field private static final editIconColorLight:J


# direct methods
.method public static synthetic $r8$lambda$7nCpoxlZsLdT0PsyCICEIyQNYYM(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->ModifyBadge$lambda$5(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$AArrQTIU_UCiVRsWVyYFPtigr5A(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->SavedPaymentMethodBadge$lambda$2$lambda$1(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$CEcthTfT1PPZGW7Izwl9FPLb9d0(ZILandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p7}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->SavedPaymentMethodCard_drOMvmE$lambda$4(ZILandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$NE-FjUjcVFeb_qwhEA8xl259c6s(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->SavedPaymentMethodTabUISelected$lambda$6(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$SLabj9nWTeY3u_MupjdhhztfRl0(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->SavedPaymentMethodTabUIModifiable$lambda$7(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$nMUHfHl0h5DyUW_eD1ngobmYOcw(Landroidx/compose/ui/Modifier;FZZZZZILandroidx/compose/ui/graphics/Color;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p20}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->SavedPaymentMethodTab_RYabdnw$lambda$0(Landroidx/compose/ui/Modifier;FZZZZZILandroidx/compose/ui/graphics/Color;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$oNjtE1r7Uh7nS-nYWzRJOJWFc48(ZZLkotlin/jvm/functions/Function0;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p7}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->SavedPaymentMethodBadge$lambda$3(ZZLkotlin/jvm/functions/Function0;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$x6OKJZILmbGLqIK_9pGouodNMVs(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->DefaultSavedPaymentMethodTabUIModifiable$lambda$8(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    const-wide v0, 0x99000000L

    .line 58
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v0

    sput-wide v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->editIconColorLight:J

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v0

    sput-wide v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->editIconColorDark:J

    const-wide v0, 0xffe5e5eaL

    .line 60
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v0

    sput-wide v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->editIconBackgroundColorLight:J

    const-wide v0, 0xff525252L

    .line 61
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v0

    sput-wide v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->editIconBackgroundColorDark:J

    const/16 v0, 0xc

    int-to-float v0, v0

    .line 306
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 65
    sput v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->SavedPaymentMethodsTopContentPadding:F

    return-void
.end method

.method private static final DefaultSavedPaymentMethodTabUIModifiable(Landroidx/compose/runtime/Composer;I)V
    .locals 12

    const v0, 0x2fe1efab

    .line 278
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    if-nez p1, :cond_1

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 292
    :cond_0
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_1

    .line 278
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, -0x1

    const-string v1, "com.stripe.android.paymentsheet.ui.DefaultSavedPaymentMethodTabUIModifiable (SavedPaymentMethodTab.kt:277)"

    invoke-static {v0, p1, p0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    sget-object p0, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$SavedPaymentMethodTabKt;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$SavedPaymentMethodTabKt;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$SavedPaymentMethodTabKt;->getLambda-3$paymentsheet_release()Lkotlin/jvm/functions/Function2;

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

    .line 279
    invoke-static/range {v1 .. v11}, Lcom/stripe/android/uicore/StripeThemeKt;->StripeTheme(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Ljava/lang/Float;Lcom/stripe/android/uicore/SectionStyle;Lcom/stripe/android/uicore/FormInsets;Lcom/stripe/android/uicore/IconStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 292
    :cond_3
    :goto_1
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_4

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$$ExternalSyntheticLambda7;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$$ExternalSyntheticLambda7;-><init>(I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_4
    return-void
.end method

.method private static final DefaultSavedPaymentMethodTabUIModifiable$lambda$8(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->DefaultSavedPaymentMethodTabUIModifiable(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final ModifyBadge(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v4, p4

    const v0, 0x51727556    # 6.5084416E10f

    move-object/from16 v1, p3

    .line 205
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v12

    and-int/lit8 v1, p5, 0x1

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v1, v4, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_0
    or-int/2addr v3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v3, v4

    :goto_1
    and-int/lit8 v5, p5, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_5

    move-object/from16 v5, p1

    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v5, p1

    :goto_4
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v3, v3, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_8

    move-object/from16 v7, p2

    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_5

    :cond_7
    const/16 v8, 0x80

    :goto_5
    or-int/2addr v3, v8

    goto :goto_7

    :cond_8
    :goto_6
    move-object/from16 v7, p2

    :goto_7
    and-int/lit16 v8, v3, 0x93

    const/16 v9, 0x92

    if-ne v8, v9, :cond_a

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v8

    if-nez v8, :cond_9

    goto :goto_8

    .line 237
    :cond_9
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v3, v7

    goto/16 :goto_d

    :cond_a
    :goto_8
    if-eqz v6, :cond_b

    .line 204
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v6, Landroidx/compose/ui/Modifier;

    goto :goto_9

    :cond_b
    move-object v6, v7

    :goto_9
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v7

    if-eqz v7, :cond_c

    const/4 v7, -0x1

    const-string v8, "com.stripe.android.paymentsheet.ui.ModifyBadge (SavedPaymentMethodTab.kt:204)"

    .line 205
    invoke-static {v0, v3, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 206
    :cond_c
    sget-object v0, Landroidx/compose/material/MaterialTheme;->INSTANCE:Landroidx/compose/material/MaterialTheme;

    sget v7, Landroidx/compose/material/MaterialTheme;->$stable:I

    invoke-virtual {v0, v12, v7}, Landroidx/compose/material/MaterialTheme;->getColors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/Colors;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/material/Colors;->getBackground-0d7_KjU()J

    move-result-wide v7

    invoke-static {v7, v8}, Lcom/stripe/android/uicore/StripeThemeKt;->shouldUseDarkDynamicColor-8_81llA(J)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 209
    sget-wide v7, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->editIconBackgroundColorLight:J

    goto :goto_a

    .line 211
    :cond_d
    sget-wide v7, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->editIconBackgroundColorDark:J

    :goto_a
    move-wide v14, v7

    if-eqz v0, :cond_e

    .line 215
    sget-wide v7, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->editIconColorLight:J

    goto :goto_b

    .line 217
    :cond_e
    sget-wide v7, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->editIconColorDark:J

    :goto_b
    move-wide/from16 v17, v7

    .line 220
    invoke-static {}, Lcom/stripe/android/uicore/StripeThemeKt;->getLocalIconStyle()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/CompositionLocal;

    const v7, 0x789c5f52

    const-string v8, "CC:CompositionLocal.kt#9igjgp"

    .line 304
    invoke-static {v12, v7, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 220
    check-cast v0, Lcom/stripe/android/uicore/IconStyle;

    sget-object v7, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/stripe/android/uicore/IconStyle;->ordinal()I

    move-result v0

    aget v0, v7, v0

    const/4 v7, 0x1

    if-eq v0, v7, :cond_10

    if-ne v0, v2, :cond_f

    .line 222
    sget v0, Lcom/stripe/android/paymentsheet/R$drawable;->stripe_ic_edit_outlined_symbol:I

    goto :goto_c

    .line 220
    :cond_f
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 221
    :cond_10
    sget v0, Lcom/stripe/android/paymentsheet/R$drawable;->stripe_ic_edit_symbol:I

    :goto_c
    const/4 v2, 0x0

    .line 226
    invoke-static {v0, v12, v2}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    move-result-object v0

    .line 228
    sget-object v16, Landroidx/compose/ui/graphics/ColorFilter;->Companion:Landroidx/compose/ui/graphics/ColorFilter$Companion;

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/ui/graphics/ColorFilter$Companion;->tint-xETnrds$default(Landroidx/compose/ui/graphics/ColorFilter$Companion;JIILjava/lang/Object;)Landroidx/compose/ui/graphics/ColorFilter;

    move-result-object v11

    .line 229
    new-instance v2, Landroidx/compose/ui/layout/FixedScale;

    const v7, 0x3f666666    # 0.9f

    invoke-direct {v2, v7}, Landroidx/compose/ui/layout/FixedScale;-><init>(F)V

    const/16 v7, 0x14

    int-to-float v7, v7

    .line 305
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v7

    .line 231
    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v7

    .line 232
    invoke-static {}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->getCircleShape()Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v8

    check-cast v8, Landroidx/compose/ui/graphics/Shape;

    invoke-static {v7, v8}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/16 v17, 0x2

    const/16 v18, 0x0

    const/16 v16, 0x0

    .line 233
    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/16 v18, 0x7

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v17, v5

    .line 234
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    .line 235
    const-string v7, "modify_badge"

    invoke-static {v5, v7}, Landroidx/compose/ui/platform/TestTagKt;->testTag(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    .line 229
    move-object v9, v2

    check-cast v9, Landroidx/compose/ui/layout/ContentScale;

    shl-int/lit8 v2, v3, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/lit16 v13, v2, 0x6000

    const/16 v14, 0x28

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v5, v0

    move-object v0, v6

    move-object v6, v1

    .line 225
    invoke-static/range {v5 .. v14}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_11
    move-object v3, v0

    .line 237
    :goto_d
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v6

    if-eqz v6, :cond_12

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$$ExternalSyntheticLambda0;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$$ExternalSyntheticLambda0;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;II)V

    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_12
    return-void
.end method

.method private static final ModifyBadge$lambda$5(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->ModifyBadge(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final SavedPaymentMethodBadge(ZZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v5, p5

    const v0, -0x1c275403

    move-object/from16 v1, p4

    .line 154
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v5, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v5, 0x6

    if-nez v1, :cond_2

    invoke-interface {v9, p0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v5

    goto :goto_1

    :cond_2
    move v1, v5

    :goto_1
    and-int/lit8 v2, p6, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v5, 0x30

    if-nez v2, :cond_5

    invoke-interface {v9, p1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_2

    :cond_4
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_5
    :goto_3
    and-int/lit8 v2, p6, 0x4

    const/16 v3, 0x100

    if-eqz v2, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v4, v5, 0x180

    if-nez v4, :cond_8

    invoke-interface {v9, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    move v4, v3

    goto :goto_4

    :cond_7
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    :cond_8
    :goto_5
    and-int/lit8 v4, p6, 0x8

    if-eqz v4, :cond_9

    or-int/lit16 v1, v1, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v6, v5, 0xc00

    if-nez v6, :cond_b

    invoke-interface {v9, p3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    const/16 v7, 0x800

    goto :goto_6

    :cond_a
    const/16 v7, 0x400

    :goto_6
    or-int/2addr v1, v7

    :cond_b
    :goto_7
    and-int/lit16 v7, v1, 0x493

    const/16 v8, 0x492

    if-ne v7, v8, :cond_d

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v7

    if-nez v7, :cond_c

    goto :goto_9

    .line 166
    :cond_c
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v4, p3

    :goto_8
    move-object v3, p2

    goto/16 :goto_d

    :cond_d
    :goto_9
    const/4 v7, 0x0

    if-eqz v2, :cond_e

    move-object p2, v7

    :cond_e
    if-eqz v4, :cond_f

    .line 153
    const-string v2, ""

    move-object v6, v2

    goto :goto_a

    :cond_f
    move-object v6, p3

    :goto_a
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_10

    const/4 v2, -0x1

    const-string v4, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodBadge (SavedPaymentMethodTab.kt:153)"

    .line 154
    invoke-static {v0, v1, v2, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_10
    const/4 v0, 0x0

    if-eqz p1, :cond_14

    const v2, 0x609b3c

    .line 155
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const v2, 0x7be224a9

    .line 157
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    and-int/lit16 v2, v1, 0x380

    const/4 v4, 0x1

    if-ne v2, v3, :cond_11

    move v2, v4

    goto :goto_b

    :cond_11
    move v2, v0

    .line 294
    :goto_b
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_12

    .line 295
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_13

    .line 158
    :cond_12
    new-instance v3, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$$ExternalSyntheticLambda1;

    invoke-direct {v3, p2}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 297
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 158
    :cond_13
    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 159
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    const/16 v8, -0xe

    int-to-float v8, v8

    .line 300
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v8

    int-to-float v4, v4

    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    .line 159
    invoke-static {v2, v8, v4}, Landroidx/compose/foundation/layout/OffsetKt;->offset-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v4, 0x3

    invoke-static {v2, v0, v7, v4, v7}, Landroidx/compose/foundation/FocusableKt;->focusable$default(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    shr-int/lit8 v0, v1, 0x9

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v10, v0, 0x180

    const/4 v11, 0x0

    move-object v7, v3

    .line 156
    invoke-static/range {v6 .. v11}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->ModifyBadge(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    .line 155
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_c

    :cond_14
    if-eqz p0, :cond_15

    const v1, 0x64ab6e

    .line 161
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 163
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    const/16 v2, -0x12

    int-to-float v2, v2

    .line 301
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    const/16 v3, 0x3a

    int-to-float v3, v3

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 163
    invoke-static {v1, v2, v3}, Landroidx/compose/foundation/layout/OffsetKt;->offset-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x6

    .line 162
    invoke-static {v1, v9, v2, v0}, Lcom/stripe/android/paymentsheet/ui/SelectedBadgeKt;->SelectedBadge(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    .line 161
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_c

    :cond_15
    const v0, 0x663597

    .line 165
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    :goto_c
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_16
    move-object v4, v6

    goto/16 :goto_8

    .line 166
    :goto_d
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p2

    if-eqz p2, :cond_17

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$$ExternalSyntheticLambda2;

    move v1, p0

    move v2, p1

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$$ExternalSyntheticLambda2;-><init>(ZZLkotlin/jvm/functions/Function0;Ljava/lang/String;II)V

    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_17
    return-void
.end method

.method private static final SavedPaymentMethodBadge$lambda$2$lambda$1(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    if-eqz p0, :cond_0

    .line 158
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final SavedPaymentMethodBadge$lambda$3(ZZLkotlin/jvm/functions/Function0;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v5

    move v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->SavedPaymentMethodBadge(ZZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final SavedPaymentMethodCard-drOMvmE(ZILandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 16

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p5

    const v0, -0x44a4c278

    move-object/from16 v1, p4

    .line 174
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v13

    and-int/lit8 v1, p6, 0x1

    const/4 v4, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v1, v5, 0x6

    move v6, v1

    move/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v5, 0x6

    if-nez v1, :cond_2

    move/from16 v1, p0

    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    move v6, v4

    :goto_0
    or-int/2addr v6, v5

    goto :goto_1

    :cond_2
    move/from16 v1, p0

    move v6, v5

    :goto_1
    and-int/lit8 v7, p6, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v6, v6, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_5

    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_5
    :goto_3
    and-int/lit8 v7, p6, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_8

    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v6, v7

    :cond_8
    :goto_5
    and-int/lit8 v7, p6, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v6, v6, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v8, v5, 0xc00

    if-nez v8, :cond_b

    move-object/from16 v8, p3

    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x800

    goto :goto_6

    :cond_a
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v6, v9

    goto :goto_8

    :cond_b
    :goto_7
    move-object/from16 v8, p3

    :goto_8
    and-int/lit16 v9, v6, 0x493

    const/16 v10, 0x492

    if-ne v9, v10, :cond_d

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v9

    if-nez v9, :cond_c

    goto :goto_9

    .line 198
    :cond_c
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v4, v8

    goto :goto_b

    :cond_d
    :goto_9
    if-eqz v7, :cond_e

    .line 173
    sget-object v7, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v7, Landroidx/compose/ui/Modifier;

    goto :goto_a

    :cond_e
    move-object v7, v8

    :goto_a
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v8

    if-eqz v8, :cond_f

    const/4 v8, -0x1

    const-string v9, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodCard (SavedPaymentMethodTab.kt:173)"

    .line 174
    invoke-static {v0, v6, v8, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_f
    const/16 v0, 0x40

    int-to-float v0, v0

    .line 302
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 178
    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v8, 0x6

    int-to-float v9, v8

    .line 303
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 179
    invoke-static {v0, v9, v10, v4, v11}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v4, 0x1

    .line 180
    invoke-static {v0, v10, v4, v11}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 181
    new-instance v9, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodCard$1;

    invoke-direct {v9, v2, v3}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodCard$1;-><init>(ILandroidx/compose/ui/graphics/Color;)V

    const/16 v10, 0x36

    const v11, -0x44f5e973

    invoke-static {v11, v4, v9, v13, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Lkotlin/jvm/functions/Function2;

    shl-int/lit8 v4, v6, 0x6

    and-int/lit16 v4, v4, 0x380

    const/high16 v6, 0x30000

    or-int v14, v4, v6

    const/16 v15, 0x1a

    move-object v8, v7

    const/4 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object v6, v0

    move-object v0, v8

    move v8, v1

    .line 175
    invoke-static/range {v6 .. v15}, Lcom/stripe/android/uicore/elements/SectionUIKt;->SectionCard-fWhpE4E(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;ZJLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_10
    move-object v4, v0

    .line 198
    :goto_b
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v7

    if-eqz v7, :cond_11

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$$ExternalSyntheticLambda4;

    move/from16 v1, p0

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$$ExternalSyntheticLambda4;-><init>(ZILandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/Modifier;II)V

    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_11
    return-void
.end method

.method private static final SavedPaymentMethodCard_drOMvmE$lambda$4(ZILandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v5

    move v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->SavedPaymentMethodCard-drOMvmE(ZILandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final SavedPaymentMethodTab-RYabdnw(Landroidx/compose/ui/Modifier;FZZZZZILandroidx/compose/ui/graphics/Color;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "FZZZZZI",
            "Landroidx/compose/ui/graphics/Color;",
            "Ljava/lang/Integer;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v0, p3

    move/from16 v12, p5

    move-object/from16 v13, p12

    move-object/from16 v7, p15

    move/from16 v1, p17

    move/from16 v15, p18

    move/from16 v4, p19

    const-string v5, "description"

    invoke-static {v13, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onItemSelectedListener"

    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v5, -0x5251ff6b

    move-object/from16 v6, p16

    .line 86
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v6

    and-int/lit8 v8, v4, 0x1

    if-eqz v8, :cond_0

    or-int/lit8 v11, v1, 0x6

    move v14, v11

    move-object/from16 v11, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v11, v1, 0x6

    if-nez v11, :cond_2

    move-object/from16 v11, p0

    invoke-interface {v6, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_1

    const/4 v14, 0x4

    goto :goto_0

    :cond_1
    const/4 v14, 0x2

    :goto_0
    or-int/2addr v14, v1

    goto :goto_1

    :cond_2
    move-object/from16 v11, p0

    move v14, v1

    :goto_1
    and-int/lit8 v16, v4, 0x2

    const/16 v17, 0x20

    const/16 v18, 0x10

    if-eqz v16, :cond_3

    or-int/lit8 v14, v14, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v16, v1, 0x30

    if-nez v16, :cond_5

    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v16

    if-eqz v16, :cond_4

    move/from16 v16, v17

    goto :goto_2

    :cond_4
    move/from16 v16, v18

    :goto_2
    or-int v14, v14, v16

    :cond_5
    :goto_3
    and-int/lit8 v16, v4, 0x4

    const/16 v19, 0x100

    const/16 v20, 0x80

    if-eqz v16, :cond_6

    or-int/lit16 v14, v14, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v1, 0x180

    if-nez v9, :cond_8

    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v9

    if-eqz v9, :cond_7

    move/from16 v9, v19

    goto :goto_4

    :cond_7
    move/from16 v9, v20

    :goto_4
    or-int/2addr v14, v9

    :cond_8
    :goto_5
    and-int/lit8 v9, v4, 0x8

    const/16 v16, 0x800

    const/16 v21, 0x400

    if-eqz v9, :cond_9

    or-int/lit16 v14, v14, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v1, 0xc00

    if-nez v9, :cond_b

    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v9

    if-eqz v9, :cond_a

    move/from16 v9, v16

    goto :goto_6

    :cond_a
    move/from16 v9, v21

    :goto_6
    or-int/2addr v14, v9

    :cond_b
    :goto_7
    and-int/lit8 v9, v4, 0x10

    const/16 v22, 0x4000

    const/16 v23, 0x2000

    if-eqz v9, :cond_c

    or-int/lit16 v14, v14, 0x6000

    goto :goto_9

    :cond_c
    and-int/lit16 v9, v1, 0x6000

    if-nez v9, :cond_e

    move/from16 v9, p4

    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v24

    if-eqz v24, :cond_d

    move/from16 v24, v22

    goto :goto_8

    :cond_d
    move/from16 v24, v23

    :goto_8
    or-int v14, v14, v24

    goto :goto_a

    :cond_e
    :goto_9
    move/from16 v9, p4

    :goto_a
    and-int/lit8 v24, v4, 0x20

    const/high16 v25, 0x20000

    const/high16 v26, 0x10000

    const/high16 v27, 0x30000

    if-eqz v24, :cond_f

    or-int v14, v14, v27

    goto :goto_c

    :cond_f
    and-int v24, v1, v27

    if-nez v24, :cond_11

    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v24

    if-eqz v24, :cond_10

    move/from16 v24, v25

    goto :goto_b

    :cond_10
    move/from16 v24, v26

    :goto_b
    or-int v14, v14, v24

    :cond_11
    :goto_c
    const/high16 v24, 0x180000

    and-int v24, v1, v24

    if-nez v24, :cond_13

    and-int/lit8 v24, v4, 0x40

    move/from16 v10, p6

    if-nez v24, :cond_12

    invoke-interface {v6, v10}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v28

    if-eqz v28, :cond_12

    const/high16 v28, 0x100000

    goto :goto_d

    :cond_12
    const/high16 v28, 0x80000

    :goto_d
    or-int v14, v14, v28

    goto :goto_e

    :cond_13
    move/from16 v10, p6

    :goto_e
    and-int/lit16 v5, v4, 0x80

    if-eqz v5, :cond_14

    const/high16 v5, 0xc00000

    or-int/2addr v14, v5

    goto :goto_10

    :cond_14
    const/high16 v5, 0xc00000

    and-int/2addr v5, v1

    if-nez v5, :cond_16

    move/from16 v5, p7

    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v29

    if-eqz v29, :cond_15

    const/high16 v29, 0x800000

    goto :goto_f

    :cond_15
    const/high16 v29, 0x400000

    :goto_f
    or-int v14, v14, v29

    goto :goto_11

    :cond_16
    :goto_10
    move/from16 v5, p7

    :goto_11
    and-int/lit16 v1, v4, 0x100

    const/high16 v29, 0x6000000

    if-eqz v1, :cond_17

    or-int v14, v14, v29

    goto :goto_13

    :cond_17
    and-int v29, p17, v29

    if-nez v29, :cond_19

    move/from16 v29, v1

    move-object/from16 v1, p8

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_18

    const/high16 v30, 0x4000000

    goto :goto_12

    :cond_18
    const/high16 v30, 0x2000000

    :goto_12
    or-int v14, v14, v30

    goto :goto_14

    :cond_19
    :goto_13
    move/from16 v29, v1

    move-object/from16 v1, p8

    :goto_14
    and-int/lit16 v1, v4, 0x200

    const/high16 v30, 0x30000000

    if-eqz v1, :cond_1a

    or-int v14, v14, v30

    goto :goto_16

    :cond_1a
    and-int v30, p17, v30

    if-nez v30, :cond_1c

    move/from16 v30, v1

    move-object/from16 v1, p9

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_1b

    const/high16 v31, 0x20000000

    goto :goto_15

    :cond_1b
    const/high16 v31, 0x10000000

    :goto_15
    or-int v14, v14, v31

    goto :goto_17

    :cond_1c
    :goto_16
    move/from16 v30, v1

    move-object/from16 v1, p9

    :goto_17
    and-int/lit16 v1, v4, 0x400

    if-eqz v1, :cond_1d

    or-int/lit8 v24, v15, 0x6

    move/from16 v31, v1

    move/from16 v1, p10

    goto :goto_19

    :cond_1d
    and-int/lit8 v31, v15, 0x6

    if-nez v31, :cond_1f

    move/from16 v31, v1

    move/from16 v1, p10

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v32

    if-eqz v32, :cond_1e

    const/16 v24, 0x4

    goto :goto_18

    :cond_1e
    const/16 v24, 0x2

    :goto_18
    or-int v24, v15, v24

    goto :goto_19

    :cond_1f
    move/from16 v31, v1

    move/from16 v1, p10

    move/from16 v24, v15

    :goto_19
    and-int/lit16 v1, v4, 0x800

    if-eqz v1, :cond_20

    or-int/lit8 v24, v24, 0x30

    move/from16 v32, v1

    goto :goto_1b

    :cond_20
    and-int/lit8 v32, v15, 0x30

    if-nez v32, :cond_22

    move/from16 v32, v1

    move-object/from16 v1, p11

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_21

    goto :goto_1a

    :cond_21
    move/from16 v17, v18

    :goto_1a
    or-int v24, v24, v17

    goto :goto_1b

    :cond_22
    move/from16 v32, v1

    move-object/from16 v1, p11

    :goto_1b
    move/from16 v1, v24

    and-int/lit16 v5, v4, 0x1000

    if-eqz v5, :cond_23

    or-int/lit16 v1, v1, 0x180

    goto :goto_1d

    :cond_23
    and-int/lit16 v5, v15, 0x180

    if-nez v5, :cond_25

    invoke-interface {v6, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_24

    goto :goto_1c

    :cond_24
    move/from16 v19, v20

    :goto_1c
    or-int v1, v1, v19

    :cond_25
    :goto_1d
    and-int/lit16 v5, v4, 0x2000

    if-eqz v5, :cond_26

    or-int/lit16 v1, v1, 0xc00

    goto :goto_1f

    :cond_26
    move/from16 v17, v1

    and-int/lit16 v1, v15, 0xc00

    if-nez v1, :cond_28

    move-object/from16 v1, p13

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_27

    goto :goto_1e

    :cond_27
    move/from16 v16, v21

    :goto_1e
    or-int v16, v17, v16

    move/from16 v1, v16

    goto :goto_1f

    :cond_28
    move-object/from16 v1, p13

    move/from16 v1, v17

    :goto_1f
    move/from16 v16, v5

    and-int/lit16 v5, v4, 0x4000

    if-eqz v5, :cond_29

    or-int/lit16 v1, v1, 0x6000

    move/from16 v17, v1

    goto :goto_21

    :cond_29
    move/from16 v17, v1

    and-int/lit16 v1, v15, 0x6000

    if-nez v1, :cond_2b

    move-object/from16 v1, p14

    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_2a

    goto :goto_20

    :cond_2a
    move/from16 v22, v23

    :goto_20
    or-int v17, v17, v22

    goto :goto_22

    :cond_2b
    :goto_21
    move-object/from16 v1, p14

    :goto_22
    const v18, 0x8000

    and-int v18, v4, v18

    if-eqz v18, :cond_2c

    or-int v17, v17, v27

    goto :goto_24

    :cond_2c
    and-int v18, v15, v27

    if-nez v18, :cond_2e

    invoke-interface {v6, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_2d

    goto :goto_23

    :cond_2d
    move/from16 v25, v26

    :goto_23
    or-int v17, v17, v25

    :cond_2e
    :goto_24
    move/from16 v1, v17

    const v17, 0x12492493

    and-int v4, v14, v17

    move/from16 v17, v5

    const v5, 0x12492492

    if-ne v4, v5, :cond_30

    const v4, 0x12493

    and-int/2addr v4, v1

    const v5, 0x12492

    if-ne v4, v5, :cond_30

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v4

    if-nez v4, :cond_2f

    goto :goto_25

    .line 146
    :cond_2f
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v9, p8

    move-object/from16 v12, p11

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object v0, v6

    move v7, v10

    move-object v1, v11

    move-object/from16 v10, p9

    move/from16 v11, p10

    goto/16 :goto_30

    .line 86
    :cond_30
    :goto_25
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v4, p17, 0x1

    if-eqz v4, :cond_33

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v4

    if-eqz v4, :cond_31

    goto :goto_27

    .line 84
    :cond_31
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v4, p19, 0x40

    if-eqz v4, :cond_32

    const v4, -0x380001

    and-int/2addr v14, v4

    :cond_32
    move-object/from16 v9, p8

    move/from16 v13, p10

    move-object/from16 v4, p11

    move-object/from16 v8, p13

    move-object/from16 v21, v11

    move v5, v14

    move-object/from16 v11, p9

    :goto_26
    move-object/from16 v14, p14

    goto/16 :goto_2e

    :cond_33
    :goto_27
    if-eqz v8, :cond_34

    .line 70
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v4, Landroidx/compose/ui/Modifier;

    goto :goto_28

    :cond_34
    move-object v4, v11

    :goto_28
    and-int/lit8 v8, p19, 0x40

    if-eqz v8, :cond_35

    const v8, -0x380001

    and-int/2addr v14, v8

    move v10, v12

    :cond_35
    const/4 v8, 0x0

    if-eqz v29, :cond_36

    move-object v11, v8

    goto :goto_29

    :cond_36
    move-object/from16 v11, p8

    :goto_29
    if-eqz v30, :cond_37

    move-object/from16 v18, v8

    goto :goto_2a

    :cond_37
    move-object/from16 v18, p9

    :goto_2a
    if-eqz v31, :cond_38

    const/16 v19, 0x1

    goto :goto_2b

    :cond_38
    move/from16 v19, p10

    :goto_2b
    if-eqz v32, :cond_39

    .line 81
    const-string v20, ""

    goto :goto_2c

    :cond_39
    move-object/from16 v20, p11

    :goto_2c
    if-eqz v16, :cond_3a

    goto :goto_2d

    :cond_3a
    move-object/from16 v8, p13

    :goto_2d
    if-eqz v17, :cond_3b

    .line 84
    const-string v16, ""

    move-object/from16 v21, v4

    move-object v9, v11

    move v5, v14

    move-object/from16 v14, v16

    move-object/from16 v11, v18

    move/from16 v13, v19

    move-object/from16 v4, v20

    goto :goto_2e

    :cond_3b
    move-object/from16 v21, v4

    move-object v9, v11

    move v5, v14

    move-object/from16 v11, v18

    move/from16 v13, v19

    move-object/from16 v4, v20

    goto :goto_26

    :goto_2e
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v16

    move-object/from16 p0, v4

    if-eqz v16, :cond_3c

    const-string v4, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTab (SavedPaymentMethodTab.kt:85)"

    const v7, -0x5251ff6b

    .line 86
    invoke-static {v7, v5, v1, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 142
    :cond_3c
    sget v23, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->SavedPaymentMethodsTopContentPadding:F

    const/16 v26, 0xd

    const/16 v27, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v21 .. v27}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 143
    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/SizeKt;->requiredWidth-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v1

    if-eqz v12, :cond_3d

    const/high16 v4, 0x3f800000    # 1.0f

    goto :goto_2f

    :cond_3d
    const v4, 0x3f19999a    # 0.6f

    .line 144
    :goto_2f
    invoke-static {v1, v4}, Landroidx/compose/ui/draw/AlphaKt;->alpha(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 88
    new-instance v4, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$1;

    invoke-direct {v4, v3, v0, v8, v14}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$1;-><init>(ZZLkotlin/jvm/functions/Function0;Ljava/lang/String;)V

    const/16 v5, 0x36

    const v7, 0x179cc90d

    const/4 v0, 0x1

    invoke-static {v7, v0, v4, v6, v5}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v4

    move-object/from16 v16, v4

    check-cast v16, Lkotlin/jvm/functions/Function3;

    .line 96
    new-instance v3, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;

    move-object/from16 v4, p0

    move/from16 v5, p2

    move-object/from16 v7, p15

    move-object/from16 p0, v1

    move-object/from16 v17, v8

    move-object/from16 v18, v14

    move/from16 v14, p4

    move/from16 v8, p7

    move v1, v0

    move-object v0, v6

    move v6, v10

    move-object/from16 v10, p12

    invoke-direct/range {v3 .. v14}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$SavedPaymentMethodTab$2;-><init>(Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;ILandroidx/compose/ui/graphics/Color;Ljava/lang/String;Ljava/lang/Integer;ZZZ)V

    move v5, v6

    move-object v12, v9

    move/from16 v19, v13

    move-object v13, v11

    const/16 v6, 0x36

    const v7, 0x197f878f

    invoke-static {v7, v1, v3, v0, v6}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lkotlin/jvm/functions/Function3;

    const/16 v10, 0x186

    const/4 v11, 0x0

    move-object/from16 v7, p0

    move-object v9, v0

    move-object/from16 v6, v16

    .line 87
    invoke-static/range {v6 .. v11}, Landroidx/compose/material/BadgeKt;->BadgedBox(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_3e

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3e
    move v7, v5

    move-object v9, v12

    move-object v10, v13

    move-object/from16 v14, v17

    move-object/from16 v15, v18

    move/from16 v11, v19

    move-object/from16 v1, v21

    move-object v12, v4

    .line 146
    :goto_30
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_3f

    move-object v3, v0

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$$ExternalSyntheticLambda3;

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v8, p7

    move-object/from16 v13, p12

    move-object/from16 v16, p15

    move/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    move-object/from16 v34, v3

    move/from16 v3, p2

    invoke-direct/range {v0 .. v19}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$$ExternalSyntheticLambda3;-><init>(Landroidx/compose/ui/Modifier;FZZZZZILandroidx/compose/ui/graphics/Color;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;III)V

    move-object/from16 v3, v34

    invoke-interface {v3, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_3f
    return-void
.end method

.method private static final SavedPaymentMethodTabUIModifiable(Landroidx/compose/runtime/Composer;I)V
    .locals 12

    const v0, -0x270b221a

    .line 260
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    if-nez p1, :cond_1

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 274
    :cond_0
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_1

    .line 260
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, -0x1

    const-string v1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabUIModifiable (SavedPaymentMethodTab.kt:259)"

    invoke-static {v0, p1, p0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    sget-object p0, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$SavedPaymentMethodTabKt;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$SavedPaymentMethodTabKt;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$SavedPaymentMethodTabKt;->getLambda-2$paymentsheet_release()Lkotlin/jvm/functions/Function2;

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

    .line 261
    invoke-static/range {v1 .. v11}, Lcom/stripe/android/uicore/StripeThemeKt;->StripeTheme(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Ljava/lang/Float;Lcom/stripe/android/uicore/SectionStyle;Lcom/stripe/android/uicore/FormInsets;Lcom/stripe/android/uicore/IconStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 274
    :cond_3
    :goto_1
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_4

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$$ExternalSyntheticLambda6;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$$ExternalSyntheticLambda6;-><init>(I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_4
    return-void
.end method

.method private static final SavedPaymentMethodTabUIModifiable$lambda$7(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->SavedPaymentMethodTabUIModifiable(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final SavedPaymentMethodTabUISelected(Landroidx/compose/runtime/Composer;I)V
    .locals 12

    const v0, 0x3a2f5d2f

    .line 242
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    if-nez p1, :cond_1

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 256
    :cond_0
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_1

    .line 242
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, -0x1

    const-string v1, "com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabUISelected (SavedPaymentMethodTab.kt:241)"

    invoke-static {v0, p1, p0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    sget-object p0, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$SavedPaymentMethodTabKt;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$SavedPaymentMethodTabKt;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/ComposableSingletons$SavedPaymentMethodTabKt;->getLambda-1$paymentsheet_release()Lkotlin/jvm/functions/Function2;

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

    .line 243
    invoke-static/range {v1 .. v11}, Lcom/stripe/android/uicore/StripeThemeKt;->StripeTheme(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Ljava/lang/Float;Lcom/stripe/android/uicore/SectionStyle;Lcom/stripe/android/uicore/FormInsets;Lcom/stripe/android/uicore/IconStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 256
    :cond_3
    :goto_1
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_4

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$$ExternalSyntheticLambda5;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt$$ExternalSyntheticLambda5;-><init>(I)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_4
    return-void
.end method

.method private static final SavedPaymentMethodTabUISelected$lambda$6(ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->SavedPaymentMethodTabUISelected(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final SavedPaymentMethodTab_RYabdnw$lambda$0(Landroidx/compose/ui/Modifier;FZZZZZILandroidx/compose/ui/graphics/Color;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 21

    or-int/lit8 v0, p16, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v18

    invoke-static/range {p17 .. p17}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v19

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v20, p18

    move-object/from16 v17, p19

    invoke-static/range {v1 .. v20}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->SavedPaymentMethodTab-RYabdnw(Landroidx/compose/ui/Modifier;FZZZZZILandroidx/compose/ui/graphics/Color;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public static final synthetic access$SavedPaymentMethodBadge(ZZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->SavedPaymentMethodBadge(ZZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method

.method public static final synthetic access$SavedPaymentMethodCard-drOMvmE(ZILandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->SavedPaymentMethodCard-drOMvmE(ZILandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method

.method public static synthetic getSAVED_PAYMENT_METHOD_CARD_TEST_TAG$annotations()V
    .locals 0

    return-void
.end method

.method public static final getSavedPaymentMethodsTopContentPadding()F
    .locals 1

    .line 65
    sget v0, Lcom/stripe/android/paymentsheet/ui/SavedPaymentMethodTabKt;->SavedPaymentMethodsTopContentPadding:F

    return v0
.end method
