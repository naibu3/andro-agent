.class final Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenKt$UpdateCardScreenBody$1;
.super Ljava/lang/Object;
.source "UpdateCardScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenKt;->UpdateCardScreenBody(Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Landroidx/compose/foundation/layout/ColumnScope;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nUpdateCardScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateCardScreen.kt\ncom/stripe/android/link/ui/updatecard/UpdateCardScreenKt$UpdateCardScreenBody$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,155:1\n149#2:156\n149#2:157\n149#2:158\n1225#3,6:159\n*S KotlinDebug\n*F\n+ 1 UpdateCardScreen.kt\ncom/stripe/android/link/ui/updatecard/UpdateCardScreenKt$UpdateCardScreenBody$1\n*L\n68#1:156\n79#1:157\n85#1:158\n88#1:159,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $focusManager:Landroidx/compose/ui/focus/FocusManager;

.field final synthetic $interactor:Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;

.field final synthetic $onUpdateClicked:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;


# direct methods
.method public static synthetic $r8$lambda$ioF3laHco6zedoyswV8sZcHMZLA(Landroidx/compose/ui/focus/FocusManager;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenKt$UpdateCardScreenBody$1;->invoke$lambda$2$lambda$1(Landroidx/compose/ui/focus/FocusManager;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;Landroidx/compose/ui/focus/FocusManager;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;",
            "Landroidx/compose/ui/focus/FocusManager;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenKt$UpdateCardScreenBody$1;->$state:Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    iput-object p2, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenKt$UpdateCardScreenBody$1;->$focusManager:Landroidx/compose/ui/focus/FocusManager;

    iput-object p3, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenKt$UpdateCardScreenBody$1;->$onUpdateClicked:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenKt$UpdateCardScreenBody$1;->$interactor:Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$2$lambda$1(Landroidx/compose/ui/focus/FocusManager;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 89
    invoke-static {p0, v2, v0, v1}, Landroidx/compose/ui/focus/FocusManager;->clearFocus$default(Landroidx/compose/ui/focus/FocusManager;ZILjava/lang/Object;)V

    .line 90
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 91
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 59
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenKt$UpdateCardScreenBody$1;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v4, p2

    move/from16 v1, p3

    const-string v2, "$this$ScrollableTopLevelColumn"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    .line 60
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 92
    :cond_0
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 60
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v5, "com.stripe.android.link.ui.updatecard.UpdateCardScreenBody.<anonymous> (UpdateCardScreen.kt:59)"

    const v6, 0x25d4acf1

    invoke-static {v6, v1, v2, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    new-instance v1, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenKt$UpdateCardScreenBody$1$1;

    iget-object v2, v0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenKt$UpdateCardScreenBody$1;->$interactor:Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;

    invoke-direct {v1, v2}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenKt$UpdateCardScreenBody$1$1;-><init>(Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;)V

    const/16 v2, 0x36

    const v5, 0x65d2d2bc

    const/4 v6, 0x1

    invoke-static {v5, v6, v1, v4, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function2;

    const/16 v2, 0x30

    const/4 v5, 0x0

    invoke-static {v5, v1, v4, v2, v6}, Lcom/stripe/android/link/theme/ColorKt;->StripeThemeForLink(Lcom/stripe/android/uicore/SectionStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    const v1, -0x7ffb6faf

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 66
    iget-object v1, v0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenKt$UpdateCardScreenBody$1;->$state:Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    invoke-virtual {v1}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->getShouldShowDefaultTag()Z

    move-result v1

    const/16 v2, 0x8

    const/4 v7, 0x0

    if-eqz v1, :cond_3

    .line 68
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v8, v1

    check-cast v8, Landroidx/compose/ui/Modifier;

    int-to-float v1, v2

    .line 156
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v10

    const/16 v13, 0xd

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 68
    invoke-static/range {v8 .. v14}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 69
    sget v8, Lcom/stripe/android/paymentsheet/R$string;->stripe_link_update_card_default_card:I

    invoke-static {v8, v4, v7}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    .line 70
    sget-object v9, Lcom/stripe/android/link/theme/LinkTheme;->INSTANCE:Lcom/stripe/android/link/theme/LinkTheme;

    const/4 v10, 0x6

    invoke-virtual {v9, v4, v10}, Lcom/stripe/android/link/theme/LinkTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/link/theme/LinkTypography;

    move-result-object v9

    invoke-virtual {v9}, Lcom/stripe/android/link/theme/LinkTypography;->getBodyEmphasized()Landroidx/compose/ui/text/TextStyle;

    move-result-object v21

    .line 71
    sget-object v9, Lcom/stripe/android/link/theme/LinkTheme;->INSTANCE:Lcom/stripe/android/link/theme/LinkTheme;

    invoke-virtual {v9, v4, v10}, Lcom/stripe/android/link/theme/LinkTheme;->getColors(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v9

    invoke-virtual {v9}, Lcom/stripe/android/link/theme/LinkColors;->getTextSecondary-0d7_KjU()J

    move-result-wide v9

    const/16 v24, 0x0

    const v25, 0xfff8

    move-object v11, v5

    move v12, v6

    const-wide/16 v5, 0x0

    move v13, v7

    const/4 v7, 0x0

    move v14, v2

    move-object v2, v1

    move-object v1, v8

    const/4 v8, 0x0

    move-wide/from16 v30, v9

    move v10, v3

    move-wide/from16 v3, v30

    const/4 v9, 0x0

    move/from16 v16, v10

    move-object v15, v11

    const-wide/16 v10, 0x0

    move/from16 v17, v12

    const/4 v12, 0x0

    move/from16 v18, v13

    const/4 v13, 0x0

    move/from16 v19, v14

    move-object/from16 v20, v15

    const-wide/16 v14, 0x0

    move/from16 v22, v16

    const/16 v16, 0x0

    move/from16 v23, v17

    const/16 v17, 0x0

    move/from16 v26, v18

    const/16 v18, 0x0

    move/from16 v27, v19

    const/16 v19, 0x0

    move-object/from16 v28, v20

    const/16 v20, 0x0

    move/from16 v29, v23

    const/16 v23, 0x30

    move-object/from16 v22, p2

    .line 67
    invoke-static/range {v1 .. v25}, Landroidx/compose/material/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v22

    :cond_3
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 75
    iget-object v1, v0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenKt$UpdateCardScreenBody$1;->$state:Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    invoke-virtual {v1}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->getError()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v1

    const v2, -0x7ffb4373

    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const/4 v7, 0x0

    if-nez v1, :cond_4

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v15, 0x0

    goto :goto_1

    .line 77
    :cond_4
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v2, Landroidx/compose/ui/Modifier;

    const/4 v12, 0x1

    const/4 v15, 0x0

    .line 78
    invoke-static {v2, v7, v12, v15}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const/16 v14, 0x8

    int-to-float v2, v14

    .line 157
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v18

    const/16 v21, 0xd

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    .line 79
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v13, 0x0

    .line 80
    invoke-static {v1, v4, v13}, Lcom/stripe/android/uicore/strings/ResolvableStringComposeUtilsKt;->resolve(Lcom/stripe/android/core/strings/ResolvableString;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    const/16 v5, 0x30

    const/4 v6, 0x4

    const/4 v3, 0x0

    .line 76
    invoke-static/range {v1 .. v6}, Lcom/stripe/android/link/ui/ErrorTextKt;->ErrorText(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/stripe/android/link/ui/ErrorTextStyle;Landroidx/compose/runtime/Composer;II)V

    .line 75
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_1
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 85
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v1, Landroidx/compose/ui/Modifier;

    const/16 v10, 0x10

    int-to-float v2, v10

    .line 158
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 85
    invoke-static {v1, v7, v2, v12, v15}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 86
    iget-object v2, v0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenKt$UpdateCardScreenBody$1;->$state:Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->getPrimaryButtonLabel()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v2

    invoke-static {v2, v4, v13}, Lcom/stripe/android/uicore/strings/ResolvableStringComposeUtilsKt;->resolve(Lcom/stripe/android/core/strings/ResolvableString;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    .line 87
    iget-object v3, v0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenKt$UpdateCardScreenBody$1;->$state:Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;

    invoke-virtual {v3}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;->getPrimaryButtonState()Lcom/stripe/android/link/ui/PrimaryButtonState;

    move-result-object v3

    const v5, -0x7ffb0fc3

    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v5, v0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenKt$UpdateCardScreenBody$1;->$focusManager:Landroidx/compose/ui/focus/FocusManager;

    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    iget-object v6, v0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenKt$UpdateCardScreenBody$1;->$onUpdateClicked:Lkotlin/jvm/functions/Function0;

    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    .line 88
    iget-object v6, v0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenKt$UpdateCardScreenBody$1;->$focusManager:Landroidx/compose/ui/focus/FocusManager;

    iget-object v7, v0, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenKt$UpdateCardScreenBody$1;->$onUpdateClicked:Lkotlin/jvm/functions/Function0;

    .line 159
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_5

    .line 160
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v8, v5, :cond_6

    .line 88
    :cond_5
    new-instance v8, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenKt$UpdateCardScreenBody$1$$ExternalSyntheticLambda0;

    invoke-direct {v8, v6, v7}, Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenKt$UpdateCardScreenBody$1$$ExternalSyntheticLambda0;-><init>(Landroidx/compose/ui/focus/FocusManager;Lkotlin/jvm/functions/Function0;)V

    .line 162
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 88
    :cond_6
    check-cast v8, Lkotlin/jvm/functions/Function0;

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object v4, v8

    const/4 v8, 0x6

    const/16 v9, 0x30

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v7, p2

    .line 84
    invoke-static/range {v1 .. v9}, Lcom/stripe/android/link/ui/PrimaryButtonKt;->PrimaryButton(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/stripe/android/link/ui/PrimaryButtonState;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_7
    return-void
.end method
