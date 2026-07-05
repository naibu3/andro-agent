.class final Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;
.super Ljava/lang/Object;
.source "LinkScreenContent.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/LinkScreenContentKt;->LinkScreenContent(Lcom/stripe/android/link/LinkActivityViewModel;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLinkScreenContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkScreenContent.kt\ncom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,121:1\n1225#2,6:122\n1225#2,6:128\n1225#2,6:134\n1225#2,6:140\n1225#2,6:146\n1225#2,6:152\n1225#2,6:158\n1225#2,6:164\n1225#2,6:170\n1225#2,6:176\n1225#2,6:182\n1225#2,6:188\n*S KotlinDebug\n*F\n+ 1 LinkScreenContent.kt\ncom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1\n*L\n43#1:122,6\n44#1:128,6\n45#1:134,6\n46#1:140,6\n47#1:146,6\n48#1:152,6\n52#1:158,6\n53#1:164,6\n54#1:170,6\n55#1:176,6\n56#1:182,6\n49#1:188,6\n*E\n"
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
.field final synthetic $appBarState$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lcom/stripe/android/link/ui/LinkAppBarState;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $bottomSheetState:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

.field final synthetic $screenState$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lcom/stripe/android/link/ScreenState;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $viewModel:Lcom/stripe/android/link/LinkActivityViewModel;


# direct methods
.method public static synthetic $r8$lambda$scP80Lo3NS0WgcmPVSgblWOcGK4(Lcom/stripe/android/link/LinkActivityViewModel;)Lcom/stripe/android/link/model/LinkAccount;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->invoke$lambda$12$lambda$11(Lcom/stripe/android/link/LinkActivityViewModel;)Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/link/LinkActivityViewModel;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkActivityViewModel;",
            "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lcom/stripe/android/link/ScreenState;",
            ">;",
            "Landroidx/compose/runtime/State<",
            "Lcom/stripe/android/link/ui/LinkAppBarState;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->$viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

    iput-object p2, p0, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->$bottomSheetState:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    iput-object p3, p0, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->$screenState$delegate:Landroidx/compose/runtime/State;

    iput-object p4, p0, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->$appBarState$delegate:Landroidx/compose/runtime/State;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$12$lambda$11(Lcom/stripe/android/link/LinkActivityViewModel;)Lcom/stripe/android/link/model/LinkAccount;
    .locals 0

    .line 50
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkActivityViewModel;->getLinkAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 37
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    .line 38
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 59
    :cond_0
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 38
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.link.LinkScreenContent.<anonymous> (LinkScreenContent.kt:37)"

    const v5, 0x6d1eb52

    invoke-static {v5, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 40
    :cond_2
    iget-object v2, v0, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->$screenState$delegate:Landroidx/compose/runtime/State;

    invoke-static {v2}, Lcom/stripe/android/link/LinkScreenContentKt;->access$LinkScreenContent$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/link/ScreenState;

    move-result-object v2

    .line 41
    iget-object v3, v0, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->$appBarState$delegate:Landroidx/compose/runtime/State;

    invoke-static {v3}, Lcom/stripe/android/link/LinkScreenContentKt;->access$LinkScreenContent$lambda$1(Landroidx/compose/runtime/State;)Lcom/stripe/android/link/ui/LinkAppBarState;

    move-result-object v3

    .line 42
    iget-object v4, v0, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->$viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

    invoke-virtual {v4}, Lcom/stripe/android/link/LinkActivityViewModel;->getEventReporter()Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    move-result-object v4

    .line 43
    iget-object v5, v0, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->$viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

    const v6, 0x28c476d3

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    .line 122
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_3

    .line 123
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_4

    .line 43
    :cond_3
    new-instance v6, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1$1$1;

    invoke-direct {v6, v5}, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1$1$1;-><init>(Ljava/lang/Object;)V

    move-object v7, v6

    check-cast v7, Lkotlin/reflect/KFunction;

    .line 125
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 43
    :cond_4
    check-cast v7, Lkotlin/reflect/KFunction;

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 44
    iget-object v5, v0, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->$viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

    const v6, 0x28c47f38

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    .line 128
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_5

    .line 129
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v8, v6, :cond_6

    .line 44
    :cond_5
    new-instance v6, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1$2$1;

    invoke-direct {v6, v5}, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1$2$1;-><init>(Ljava/lang/Object;)V

    move-object v8, v6

    check-cast v8, Lkotlin/reflect/KFunction;

    .line 131
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 44
    :cond_6
    check-cast v8, Lkotlin/reflect/KFunction;

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 45
    iget-object v5, v0, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->$viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

    const v6, 0x28c487c2

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    .line 134
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    if-nez v6, :cond_7

    .line 135
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v9, v6, :cond_8

    .line 45
    :cond_7
    new-instance v6, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1$3$1;

    invoke-direct {v6, v5}, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1$3$1;-><init>(Ljava/lang/Object;)V

    move-object v9, v6

    check-cast v9, Lkotlin/reflect/KFunction;

    .line 137
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 45
    :cond_8
    check-cast v9, Lkotlin/reflect/KFunction;

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 46
    iget-object v5, v0, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->$viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

    const v6, 0x28c48d04

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    .line 140
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    if-nez v6, :cond_9

    .line 141
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v10, v6, :cond_a

    .line 46
    :cond_9
    new-instance v6, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1$4$1;

    invoke-direct {v6, v5}, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1$4$1;-><init>(Ljava/lang/Object;)V

    move-object v10, v6

    check-cast v10, Lkotlin/jvm/functions/Function2;

    .line 143
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 46
    :cond_a
    move-object v11, v10

    check-cast v11, Lkotlin/jvm/functions/Function2;

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 47
    iget-object v5, v0, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->$viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

    const v6, 0x28c49268

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    .line 146
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    if-nez v6, :cond_b

    .line 147
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v10, v6, :cond_c

    .line 47
    :cond_b
    new-instance v6, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1$5$1;

    invoke-direct {v6, v5}, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1$5$1;-><init>(Ljava/lang/Object;)V

    move-object v10, v6

    check-cast v10, Lkotlin/reflect/KFunction;

    .line 149
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 47
    :cond_c
    check-cast v10, Lkotlin/reflect/KFunction;

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 48
    iget-object v5, v0, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->$viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

    const v6, 0x28c49988

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    .line 152
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    if-nez v6, :cond_d

    .line 153
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v12, v6, :cond_e

    .line 48
    :cond_d
    new-instance v6, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1$6$1;

    invoke-direct {v6, v5}, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1$6$1;-><init>(Ljava/lang/Object;)V

    move-object v12, v6

    check-cast v12, Lkotlin/reflect/KFunction;

    .line 155
    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 48
    :cond_e
    check-cast v12, Lkotlin/reflect/KFunction;

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 52
    iget-object v5, v0, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->$viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

    const v6, 0x28c4ab0c

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    .line 158
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v13

    if-nez v6, :cond_f

    .line 159
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v13, v6, :cond_10

    .line 52
    :cond_f
    new-instance v6, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1$7$1;

    invoke-direct {v6, v5}, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1$7$1;-><init>(Ljava/lang/Object;)V

    move-object v13, v6

    check-cast v13, Lkotlin/reflect/KFunction;

    .line 161
    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 52
    :cond_10
    check-cast v13, Lkotlin/reflect/KFunction;

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 53
    iget-object v5, v0, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->$viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

    const v6, 0x28c4b1a5

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    .line 164
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v14

    if-nez v6, :cond_11

    .line 165
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v14, v6, :cond_12

    .line 53
    :cond_11
    new-instance v6, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1$8$1;

    invoke-direct {v6, v5}, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1$8$1;-><init>(Ljava/lang/Object;)V

    move-object v14, v6

    check-cast v14, Lkotlin/reflect/KFunction;

    .line 167
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 53
    :cond_12
    check-cast v14, Lkotlin/reflect/KFunction;

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 54
    iget-object v5, v0, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->$viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

    const v6, 0x28c4b702

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    .line 170
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v15

    if-nez v6, :cond_13

    .line 171
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v15, v6, :cond_14

    .line 54
    :cond_13
    new-instance v6, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1$9$1;

    invoke-direct {v6, v5}, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1$9$1;-><init>(Ljava/lang/Object;)V

    move-object v15, v6

    check-cast v15, Lkotlin/reflect/KFunction;

    .line 173
    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 54
    :cond_14
    check-cast v15, Lkotlin/reflect/KFunction;

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 55
    iget-object v5, v0, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->$viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

    const v6, 0x28c4bca7

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    move-object/from16 p2, v2

    .line 176
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v6, :cond_15

    .line 177
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v2, v6, :cond_16

    .line 55
    :cond_15
    new-instance v2, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1$10$1;

    invoke-direct {v2, v5}, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1$10$1;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/reflect/KFunction;

    .line 179
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 55
    :cond_16
    check-cast v2, Lkotlin/reflect/KFunction;

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 56
    iget-object v5, v0, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->$viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

    const v6, 0x28c4c4cd

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    move-object/from16 v16, v2

    .line 182
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v6, :cond_17

    .line 183
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v2, v6, :cond_18

    .line 56
    :cond_17
    new-instance v2, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1$11$1;

    invoke-direct {v2, v5}, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1$11$1;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/reflect/KFunction;

    .line 185
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 56
    :cond_18
    check-cast v2, Lkotlin/reflect/KFunction;

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 57
    iget-object v5, v0, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->$viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

    invoke-virtual {v5}, Lcom/stripe/android/link/LinkActivityViewModel;->getNavigationFlow()Lkotlinx/coroutines/flow/SharedFlow;

    move-result-object v6

    .line 58
    iget-object v5, v0, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->$viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

    invoke-virtual {v5}, Lcom/stripe/android/link/LinkActivityViewModel;->getLinkConfiguration()Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/link/LinkConfiguration;->getLinkAppearance()Lcom/stripe/android/link/model/LinkAppearance;

    move-result-object v5

    move-object/from16 v17, v2

    .line 39
    iget-object v2, v0, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->$bottomSheetState:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    .line 56
    check-cast v17, Lkotlin/jvm/functions/Function1;

    .line 43
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 44
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 45
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 47
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 48
    check-cast v12, Lkotlin/jvm/functions/Function1;

    move-object/from16 v18, v2

    const v2, 0x28c4a066

    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v2, v0, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->$viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    move/from16 v19, v2

    .line 49
    iget-object v2, v0, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;->$viewModel:Lcom/stripe/android/link/LinkActivityViewModel;

    .line 188
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v19, :cond_19

    .line 189
    sget-object v19, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 v20, v3

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v0, v3, :cond_1a

    goto :goto_1

    :cond_19
    move-object/from16 v20, v3

    .line 49
    :goto_1
    new-instance v0, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1$$ExternalSyntheticLambda0;

    invoke-direct {v0, v2}, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/link/LinkActivityViewModel;)V

    .line 191
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 49
    :cond_1a
    check-cast v0, Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 52
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 53
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 54
    check-cast v15, Lkotlin/jvm/functions/Function0;

    .line 55
    move-object/from16 v2, v16

    check-cast v2, Lkotlin/jvm/functions/Function0;

    move-object/from16 v3, v20

    sget v20, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;->$stable:I

    const/16 v21, 0x0

    move-object/from16 v16, v8

    move-object v8, v7

    move-object/from16 v7, v17

    move-object/from16 v17, v15

    move-object v15, v13

    move-object v13, v12

    move-object v12, v10

    move-object v10, v9

    move-object/from16 v9, v16

    move-object/from16 v19, v1

    move-object/from16 v16, v14

    move-object/from16 v1, v18

    move-object v14, v0

    move-object/from16 v18, v2

    move-object/from16 v2, p2

    .line 38
    invoke-static/range {v1 .. v21}, Lcom/stripe/android/link/LinkScreenContentKt;->LinkScreenContentBody(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lcom/stripe/android/link/ScreenState;Lcom/stripe/android/link/ui/LinkAppBarState;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/link/model/LinkAppearance;Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1b
    return-void
.end method
