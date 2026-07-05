.class public final Lcom/stripe/android/link/LinkScreenContentKt;
.super Ljava/lang/Object;
.source "LinkScreenContent.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLinkScreenContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkScreenContent.kt\ncom/stripe/android/link/LinkScreenContentKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,121:1\n1225#2,6:122\n81#3:128\n81#3:129\n*S KotlinDebug\n*F\n+ 1 LinkScreenContent.kt\ncom/stripe/android/link/LinkScreenContentKt\n*L\n31#1:122,6\n28#1:128\n29#1:129\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0004\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u0010\u0006\u001a\u00b1\u0002\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00142\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00172\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00172\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u001726\u0010\u001a\u001a2\u0012\u0013\u0012\u00110\u001c\u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\u0008(\u001f\u0012\u0013\u0012\u00110 \u00a2\u0006\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\u0008(!\u0012\u0004\u0012\u00020\u00010\u001b2\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00172\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00010\u00142\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00172\u0012\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00010\u00142\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00010\u00142\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00172\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0017H\u0001\u00a2\u0006\u0002\u0010-\u00a8\u0006.\u00b2\u0006\n\u0010\u0008\u001a\u00020\tX\u008a\u0084\u0002\u00b2\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"
    }
    d2 = {
        "LinkScreenContent",
        "",
        "viewModel",
        "Lcom/stripe/android/link/LinkActivityViewModel;",
        "bottomSheetState",
        "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;",
        "(Lcom/stripe/android/link/LinkActivityViewModel;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/compose/runtime/Composer;I)V",
        "LinkScreenContentBody",
        "screenState",
        "Lcom/stripe/android/link/ScreenState;",
        "appBarState",
        "Lcom/stripe/android/link/ui/LinkAppBarState;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "appearance",
        "Lcom/stripe/android/link/model/LinkAppearance;",
        "navigationChannel",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "Lcom/stripe/android/uicore/navigation/NavigationIntent;",
        "onNavBackStackEntryChanged",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/uicore/navigation/NavBackStackEntryUpdate;",
        "onVerificationSucceeded",
        "Lkotlin/Function0;",
        "onDismissClicked",
        "onBackPressed",
        "navigate",
        "Lkotlin/Function2;",
        "Lcom/stripe/android/link/LinkScreen;",
        "Lkotlin/ParameterName;",
        "name",
        "route",
        "",
        "clearStack",
        "dismiss",
        "dismissWithResult",
        "Lcom/stripe/android/link/LinkActivityResult;",
        "getLinkAccount",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "handleViewAction",
        "Lcom/stripe/android/link/LinkAction;",
        "moveToWeb",
        "",
        "goBack",
        "changeEmail",
        "(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lcom/stripe/android/link/ScreenState;Lcom/stripe/android/link/ui/LinkAppBarState;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/link/model/LinkAppearance;Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V",
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


# direct methods
.method public static synthetic $r8$lambda$Ku-p913oANUmD5LjSsPV-PmoWGM(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lcom/stripe/android/link/ScreenState;Lcom/stripe/android/link/ui/LinkAppBarState;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/link/model/LinkAppearance;Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p21}, Lcom/stripe/android/link/LinkScreenContentKt;->LinkScreenContentBody$lambda$4(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lcom/stripe/android/link/ScreenState;Lcom/stripe/android/link/ui/LinkAppBarState;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/link/model/LinkAppearance;Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$pAXOwJ-cSs5mr42n7_ZqeyeNoe8(Lcom/stripe/android/link/LinkActivityViewModel;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/link/LinkScreenContentKt;->LinkScreenContent$lambda$3(Lcom/stripe/android/link/LinkActivityViewModel;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final LinkScreenContent(Lcom/stripe/android/link/LinkActivityViewModel;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/compose/runtime/Composer;I)V
    .locals 5

    const-string v0, "viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bottomSheetState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x7756a96e

    .line 27
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p2

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_4

    and-int/lit8 v2, p3, 0x40

    if-nez v2, :cond_2

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_2

    :cond_2
    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    :goto_2
    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_3

    :cond_3
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v1, v2

    :cond_4
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_6

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_4

    .line 61
    :cond_5
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_5

    .line 27
    :cond_6
    :goto_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_7

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.link.LinkScreenContent (LinkScreenContent.kt:26)"

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 28
    :cond_7
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkActivityViewModel;->getLinkScreenState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v1, p2, v2, v3}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v0

    .line 29
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkActivityViewModel;->getLinkAppBarState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v4

    invoke-static {v4, v1, p2, v2, v3}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v1

    const v2, 0x755e1219

    invoke-interface {p2, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 31
    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 122
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_8

    .line 123
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_9

    .line 32
    :cond_8
    new-instance v4, Lcom/stripe/android/link/ui/LinkContentScrollHandler;

    new-instance v2, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$linkContentScrollHandler$1$1;

    invoke-direct {v2, p0}, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$linkContentScrollHandler$1$1;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-direct {v4, v2}, Lcom/stripe/android/link/ui/LinkContentScrollHandler;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 125
    invoke-interface {p2, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 31
    :cond_9
    check-cast v4, Lcom/stripe/android/link/ui/LinkContentScrollHandler;

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 36
    invoke-static {}, Lcom/stripe/android/link/ui/LinkContentScrollHandlerKt;->getLocalLinkContentScrollHandler()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    move-result-object v2

    .line 37
    new-instance v4, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;

    invoke-direct {v4, p0, p1, v0, v1}, Lcom/stripe/android/link/LinkScreenContentKt$LinkScreenContent$1;-><init>(Lcom/stripe/android/link/LinkActivityViewModel;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V

    const/16 v0, 0x36

    const v1, 0x6d1eb52

    invoke-static {v1, v3, v4, p2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function2;

    sget v1, Landroidx/compose/runtime/ProvidedValue;->$stable:I

    or-int/lit8 v1, v1, 0x30

    .line 35
    invoke-static {v2, v0, p2, v1}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider(Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 61
    :cond_a
    :goto_5
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p2

    if-eqz p2, :cond_b

    new-instance v0, Lcom/stripe/android/link/LinkScreenContentKt$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0, p1, p3}, Lcom/stripe/android/link/LinkScreenContentKt$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/link/LinkActivityViewModel;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;I)V

    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_b
    return-void
.end method

.method private static final LinkScreenContent$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/link/ScreenState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lcom/stripe/android/link/ScreenState;",
            ">;)",
            "Lcom/stripe/android/link/ScreenState;"
        }
    .end annotation

    .line 128
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/link/ScreenState;

    return-object p0
.end method

.method private static final LinkScreenContent$lambda$1(Landroidx/compose/runtime/State;)Lcom/stripe/android/link/ui/LinkAppBarState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Lcom/stripe/android/link/ui/LinkAppBarState;",
            ">;)",
            "Lcom/stripe/android/link/ui/LinkAppBarState;"
        }
    .end annotation

    .line 129
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/link/ui/LinkAppBarState;

    return-object p0
.end method

.method private static final LinkScreenContent$lambda$3(Lcom/stripe/android/link/LinkActivityViewModel;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/stripe/android/link/LinkScreenContentKt;->LinkScreenContent(Lcom/stripe/android/link/LinkActivityViewModel;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final LinkScreenContentBody(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lcom/stripe/android/link/ScreenState;Lcom/stripe/android/link/ui/LinkAppBarState;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/link/model/LinkAppearance;Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;",
            "Lcom/stripe/android/link/ScreenState;",
            "Lcom/stripe/android/link/ui/LinkAppBarState;",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            "Lcom/stripe/android/link/model/LinkAppearance;",
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "+",
            "Lcom/stripe/android/uicore/navigation/NavigationIntent;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/uicore/navigation/NavBackStackEntryUpdate;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/android/link/LinkScreen;",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkActivityResult;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkAction;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v5, p7

    move-object/from16 v8, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v9, p15

    const-string v2, "bottomSheetState"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "screenState"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "appBarState"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "eventReporter"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "navigationChannel"

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onNavBackStackEntryChanged"

    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onVerificationSucceeded"

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onDismissClicked"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onBackPressed"

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "navigate"

    invoke-static {v11, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "dismiss"

    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "dismissWithResult"

    invoke-static {v13, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "getLinkAccount"

    invoke-static {v14, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "handleViewAction"

    invoke-static {v15, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "moveToWeb"

    invoke-static {v9, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "goBack"

    move-object/from16 v9, p16

    invoke-static {v9, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "changeEmail"

    move-object/from16 v9, p17

    invoke-static {v9, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, -0x95d3da7

    move-object/from16 v9, p18

    .line 83
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    move/from16 v2, p19

    and-int/lit8 v17, v2, 0x6

    const/16 v18, 0x4

    const/16 v19, 0x2

    if-nez v17, :cond_2

    and-int/lit8 v17, v2, 0x8

    if-nez v17, :cond_0

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    goto :goto_0

    :cond_0
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    :goto_0
    if-eqz v17, :cond_1

    move/from16 v17, v18

    goto :goto_1

    :cond_1
    move/from16 v17, v19

    :goto_1
    or-int v17, v2, v17

    goto :goto_2

    :cond_2
    move/from16 v17, v2

    :goto_2
    and-int/lit8 v20, v2, 0x30

    const/16 v21, 0x20

    const/16 v22, 0x10

    if-nez v20, :cond_5

    and-int/lit8 v20, v2, 0x40

    if-nez v20, :cond_3

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v20

    goto :goto_3

    :cond_3
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v20

    :goto_3
    if-eqz v20, :cond_4

    move/from16 v20, v21

    goto :goto_4

    :cond_4
    move/from16 v20, v22

    :goto_4
    or-int v17, v17, v20

    :cond_5
    and-int/lit16 v1, v2, 0x180

    const/16 v20, 0x100

    const/16 v23, 0x80

    if-nez v1, :cond_7

    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    move/from16 v1, v20

    goto :goto_5

    :cond_6
    move/from16 v1, v23

    :goto_5
    or-int v17, v17, v1

    :cond_7
    and-int/lit16 v1, v2, 0xc00

    if-nez v1, :cond_a

    and-int/lit16 v1, v2, 0x1000

    if-nez v1, :cond_8

    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_6

    :cond_8
    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    :goto_6
    if-eqz v1, :cond_9

    const/16 v1, 0x800

    goto :goto_7

    :cond_9
    const/16 v1, 0x400

    :goto_7
    or-int v17, v17, v1

    :cond_a
    and-int/lit16 v1, v2, 0x6000

    if-nez v1, :cond_d

    const v1, 0x8000

    and-int/2addr v1, v2

    if-nez v1, :cond_b

    move-object/from16 v1, p4

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v24

    goto :goto_8

    :cond_b
    move-object/from16 v1, p4

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v24

    :goto_8
    if-eqz v24, :cond_c

    const/16 v24, 0x4000

    goto :goto_9

    :cond_c
    const/16 v24, 0x2000

    :goto_9
    or-int v17, v17, v24

    goto :goto_a

    :cond_d
    move-object/from16 v1, p4

    :goto_a
    const/high16 v24, 0x30000

    and-int v25, v2, v24

    const/high16 v26, 0x20000

    const/high16 v27, 0x10000

    if-nez v25, :cond_f

    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_e

    move/from16 v25, v26

    goto :goto_b

    :cond_e
    move/from16 v25, v27

    :goto_b
    or-int v17, v17, v25

    :cond_f
    const/high16 v25, 0x180000

    and-int v28, v2, v25

    if-nez v28, :cond_11

    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_10

    const/high16 v28, 0x100000

    goto :goto_c

    :cond_10
    const/high16 v28, 0x80000

    :goto_c
    or-int v17, v17, v28

    :cond_11
    const/high16 v28, 0xc00000

    and-int v29, v2, v28

    if-nez v29, :cond_13

    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_12

    const/high16 v29, 0x800000

    goto :goto_d

    :cond_12
    const/high16 v29, 0x400000

    :goto_d
    or-int v17, v17, v29

    :cond_13
    const/high16 v29, 0x6000000

    and-int v29, v2, v29

    if-nez v29, :cond_15

    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_14

    const/high16 v29, 0x4000000

    goto :goto_e

    :cond_14
    const/high16 v29, 0x2000000

    :goto_e
    or-int v17, v17, v29

    :cond_15
    const/high16 v29, 0x30000000

    and-int v29, v2, v29

    if-nez v29, :cond_17

    invoke-interface {v9, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_16

    const/high16 v29, 0x20000000

    goto :goto_f

    :cond_16
    const/high16 v29, 0x10000000

    :goto_f
    or-int v17, v17, v29

    :cond_17
    move/from16 v1, v17

    move/from16 v2, p20

    and-int/lit8 v17, v2, 0x6

    if-nez v17, :cond_19

    invoke-interface {v9, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_18

    goto :goto_10

    :cond_18
    move/from16 v18, v19

    :goto_10
    or-int v17, v2, v18

    goto :goto_11

    :cond_19
    move/from16 v17, v2

    :goto_11
    and-int/lit8 v18, v2, 0x30

    if-nez v18, :cond_1b

    invoke-interface {v9, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_1a

    goto :goto_12

    :cond_1a
    move/from16 v21, v22

    :goto_12
    or-int v17, v17, v21

    :cond_1b
    and-int/lit16 v3, v2, 0x180

    if-nez v3, :cond_1d

    invoke-interface {v9, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1c

    goto :goto_13

    :cond_1c
    move/from16 v20, v23

    :goto_13
    or-int v17, v17, v20

    :cond_1d
    and-int/lit16 v3, v2, 0xc00

    if-nez v3, :cond_1f

    invoke-interface {v9, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1e

    const/16 v3, 0x800

    goto :goto_14

    :cond_1e
    const/16 v3, 0x400

    :goto_14
    or-int v17, v17, v3

    :cond_1f
    and-int/lit16 v3, v2, 0x6000

    if-nez v3, :cond_21

    invoke-interface {v9, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_20

    const/16 v3, 0x4000

    goto :goto_15

    :cond_20
    const/16 v3, 0x2000

    :goto_15
    or-int v17, v17, v3

    :cond_21
    and-int v3, v2, v24

    if-nez v3, :cond_23

    move-object/from16 v3, p15

    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_22

    goto :goto_16

    :cond_22
    move/from16 v26, v27

    :goto_16
    or-int v17, v17, v26

    goto :goto_17

    :cond_23
    move-object/from16 v3, p15

    :goto_17
    and-int v18, v2, v25

    move-object/from16 v2, p16

    if-nez v18, :cond_25

    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_24

    const/high16 v18, 0x100000

    goto :goto_18

    :cond_24
    const/high16 v18, 0x80000

    :goto_18
    or-int v17, v17, v18

    :cond_25
    and-int v18, p20, v28

    move-object/from16 v2, p17

    if-nez v18, :cond_27

    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_26

    const/high16 v18, 0x800000

    goto :goto_19

    :cond_26
    const/high16 v18, 0x400000

    :goto_19
    or-int v17, v17, v18

    :cond_27
    move/from16 v2, v17

    const v17, 0x12492493

    and-int v3, v1, v17

    const v4, 0x12492492

    if-ne v3, v4, :cond_29

    const v3, 0x492493

    and-int/2addr v3, v2

    const v4, 0x492492

    if-ne v3, v4, :cond_29

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_28

    goto :goto_1a

    .line 120
    :cond_28
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v7, v9

    move-object v9, v0

    goto/16 :goto_1c

    .line 83
    :cond_29
    :goto_1a
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_2a

    const-string v3, "com.stripe.android.link.LinkScreenContentBody (LinkScreenContent.kt:82)"

    const v4, -0x95d3da7

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 85
    :cond_2a
    instance-of v3, v0, Lcom/stripe/android/link/ScreenState$FullScreen;

    const v16, 0xe000

    if-eqz v3, :cond_2b

    const v3, -0x2017300

    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 87
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    const/high16 p18, 0x70000

    .line 88
    const-string v4, "full_screen_content_tag"

    invoke-static {v3, v4}, Landroidx/compose/ui/platform/TestTagKt;->testTag(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 90
    move-object v4, v0

    check-cast v4, Lcom/stripe/android/link/ScreenState$FullScreen;

    invoke-virtual {v4}, Lcom/stripe/android/link/ScreenState$FullScreen;->getInitialDestination()Lcom/stripe/android/link/LinkScreen;

    move-result-object v4

    .line 101
    sget v17, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;->$stable:I

    shl-int/lit8 v17, v17, 0x3

    or-int/lit8 v17, v17, 0x6

    shl-int/lit8 v0, v1, 0x3

    and-int/lit8 v18, v0, 0x70

    or-int v17, v17, v18

    move/from16 v18, v1

    and-int/lit16 v1, v0, 0x1c00

    or-int v1, v17, v1

    and-int v0, v0, v16

    or-int/2addr v0, v1

    shr-int/lit8 v1, v18, 0xc

    and-int v1, v1, p18

    or-int/2addr v0, v1

    shl-int/lit8 v1, v2, 0x3

    const/high16 v17, 0x380000

    and-int v17, v1, v17

    or-int v0, v0, v17

    const/high16 v17, 0x1c00000

    and-int v17, v1, v17

    or-int v0, v0, v17

    shl-int/lit8 v17, v18, 0x6

    const/high16 v19, 0xe000000

    and-int v17, v17, v19

    or-int v0, v0, v17

    const/high16 v17, 0x70000000

    shl-int/lit8 v18, v18, 0xc

    and-int v17, v18, v17

    or-int v17, v0, v17

    shr-int/lit8 v0, v2, 0xc

    and-int/lit8 v0, v0, 0xe

    and-int/lit8 v18, v1, 0x70

    or-int v0, v0, v18

    move/from16 v18, v0

    and-int/lit16 v0, v1, 0x380

    or-int v0, v18, v0

    move/from16 v18, v0

    and-int/lit16 v0, v1, 0x1c00

    or-int v0, v18, v0

    and-int v1, v1, v16

    or-int/2addr v0, v1

    shr-int/lit8 v1, v2, 0x6

    and-int v1, v1, p18

    or-int v18, v0, v1

    move-object/from16 v1, p0

    move-object v0, v3

    move-object v2, v4

    move-object v8, v7

    move-object/from16 v16, v9

    move-object v5, v10

    move-object v10, v15

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v7, p16

    move-object/from16 v15, p17

    move-object v9, v6

    move-object/from16 v6, p15

    .line 86
    invoke-static/range {v0 .. v18}, Lcom/stripe/android/link/ui/FullScreenContentKt;->FullScreenContent(Landroidx/compose/ui/Modifier;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lcom/stripe/android/link/LinkScreen;Lcom/stripe/android/link/ui/LinkAppBarState;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v7, v16

    .line 85
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object/from16 v9, p1

    goto :goto_1b

    :cond_2b
    move/from16 v18, v1

    move-object v7, v9

    const/high16 p18, 0x70000

    .line 106
    sget-object v0, Lcom/stripe/android/link/ScreenState$Loading;->INSTANCE:Lcom/stripe/android/link/ScreenState$Loading;

    move-object/from16 v9, p1

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2c

    const v0, -0x4a62b668

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_1b

    .line 107
    :cond_2c
    instance-of v0, v9, Lcom/stripe/android/link/ScreenState$VerificationDialog;

    if-eqz v0, :cond_2f

    const v0, -0x1f31c0b

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 109
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    .line 110
    const-string v1, "verification_dialog_content_tag"

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/TestTagKt;->testTag(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 111
    move-object v1, v9

    check-cast v1, Lcom/stripe/android/link/ScreenState$VerificationDialog;

    invoke-virtual {v1}, Lcom/stripe/android/link/ScreenState$VerificationDialog;->getLinkAccount()Lcom/stripe/android/link/model/LinkAccount;

    move-result-object v1

    shr-int/lit8 v3, v18, 0x6

    and-int/lit16 v3, v3, 0x380

    or-int/lit8 v3, v3, 0x6

    shr-int/lit8 v4, v18, 0xc

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v3, v4

    shr-int/lit8 v4, v2, 0x9

    and-int v4, v4, v16

    or-int/2addr v3, v4

    shr-int/lit8 v4, v18, 0x9

    and-int v4, v4, p18

    or-int/2addr v3, v4

    const/high16 v4, 0x380000

    shl-int/lit8 v2, v2, 0xc

    and-int/2addr v2, v4

    or-int v8, v3, v2

    move-object/from16 v2, p4

    move-object/from16 v3, p7

    move-object/from16 v5, p8

    move-object/from16 v6, p12

    move-object/from16 v4, p17

    .line 108
    invoke-static/range {v0 .. v8}, Lcom/stripe/android/link/ui/verification/VerificationDialogKt;->VerificationDialog(Landroidx/compose/ui/Modifier;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/model/LinkAppearance;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 107
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 84
    :goto_1b
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 120
    :cond_2d
    :goto_1c
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_2e

    move-object v1, v0

    new-instance v0, Lcom/stripe/android/link/LinkScreenContentKt$$ExternalSyntheticLambda0;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move/from16 v19, p19

    move/from16 v20, p20

    move-object/from16 v30, v1

    move-object v2, v9

    move-object/from16 v1, p0

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v20}, Lcom/stripe/android/link/LinkScreenContentKt$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lcom/stripe/android/link/ScreenState;Lcom/stripe/android/link/ui/LinkAppBarState;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/link/model/LinkAppearance;Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;II)V

    move-object/from16 v1, v30

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_2e
    return-void

    :cond_2f
    const v0, -0x4a632993

    .line 84
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private static final LinkScreenContentBody$lambda$4(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lcom/stripe/android/link/ScreenState;Lcom/stripe/android/link/ui/LinkAppBarState;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/link/model/LinkAppearance;Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 22

    or-int/lit8 v0, p18, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v20

    invoke-static/range {p19 .. p19}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v21

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p20

    invoke-static/range {v1 .. v21}, Lcom/stripe/android/link/LinkScreenContentKt;->LinkScreenContentBody(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lcom/stripe/android/link/ScreenState;Lcom/stripe/android/link/ui/LinkAppBarState;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/link/model/LinkAppearance;Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public static final synthetic access$LinkScreenContent$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/link/ScreenState;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/stripe/android/link/LinkScreenContentKt;->LinkScreenContent$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/link/ScreenState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$LinkScreenContent$lambda$1(Landroidx/compose/runtime/State;)Lcom/stripe/android/link/ui/LinkAppBarState;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/stripe/android/link/LinkScreenContentKt;->LinkScreenContent$lambda$1(Landroidx/compose/runtime/State;)Lcom/stripe/android/link/ui/LinkAppBarState;

    move-result-object p0

    return-object p0
.end method
