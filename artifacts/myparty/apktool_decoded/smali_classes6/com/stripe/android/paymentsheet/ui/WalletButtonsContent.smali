.class public final Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;
.super Ljava/lang/Object;
.source "WalletButtonsContent.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWalletButtonsContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletButtonsContent.kt\ncom/stripe/android/paymentsheet/ui/WalletButtonsContent\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,110:1\n1225#2,6:111\n1225#2,6:118\n77#3:117\n81#4:124\n64#5,5:125\n*S KotlinDebug\n*F\n+ 1 WalletButtonsContent.kt\ncom/stripe/android/paymentsheet/ui/WalletButtonsContent\n*L\n32#1:111,6\n102#1:118,6\n101#1:117\n30#1:124\n35#1:125,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010\u0008J\u0015\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0003\u00a2\u0006\u0002\u0010\u000cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r\u00b2\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;",
        "",
        "interactor",
        "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;)V",
        "Content",
        "",
        "(Landroidx/compose/runtime/Composer;I)V",
        "ResendCodeNotificationEffect",
        "state",
        "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;",
        "(Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;Landroidx/compose/runtime/Composer;I)V",
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


# instance fields
.field private final interactor:Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;


# direct methods
.method public static synthetic $r8$lambda$0bC4hZNq6TxthCKJLqOwMYSTjME(Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;->Content$lambda$4(Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$3S8MiamVrWAxl_RxOEJFLUDtHuM(Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;->Content$lambda$3$lambda$2(Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$L2_ONZfSXlNC57-gr6adK-dUWGI(Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;->ResendCodeNotificationEffect$lambda$6(Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;)V
    .locals 1

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;->interactor:Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;

    return-void
.end method

.method private static final Content$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;"
        }
    .end annotation

    .line 124
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;

    return-object p0
.end method

.method private static final Content$lambda$3$lambda$2(Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;->interactor:Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;

    sget-object v0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction$OnShown;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction$OnShown;

    check-cast v0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction;

    invoke-interface {p1, v0}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;->handleViewAction(Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction;)V

    .line 125
    new-instance p1, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$Content$lambda$3$lambda$2$$inlined$onDispose$1;

    invoke-direct {p1, p0}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$Content$lambda$3$lambda$2$$inlined$onDispose$1;-><init>(Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;)V

    check-cast p1, Landroidx/compose/runtime/DisposableEffectResult;

    return-object p1
.end method

.method private static final Content$lambda$4(Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p1

    invoke-virtual {p0, p2, p1}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;->Content(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final ResendCodeNotificationEffect(Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    const v0, 0x30052501

    .line 100
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p2

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

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

    const/16 v3, 0x20

    if-nez v2, :cond_3

    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, v1, 0x13

    const/16 v4, 0x12

    if-ne v2, v4, :cond_5

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    .line 108
    :cond_4
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_6

    .line 100
    :cond_5
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, -0x1

    const-string v4, "com.stripe.android.paymentsheet.ui.WalletButtonsContent.ResendCodeNotificationEffect (WalletButtonsContent.kt:99)"

    invoke-static {v0, v1, v2, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 101
    :cond_6
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/CompositionLocal;

    const v2, 0x789c5f52

    const-string v4, "CC:CompositionLocal.kt#9igjgp"

    .line 117
    invoke-static {p2, v2, v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 101
    check-cast v0, Landroid/content/Context;

    .line 102
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;->getLink2FAState()Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State$LinkOtpState;

    move-result-object v2

    const/4 v4, 0x0

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State$LinkOtpState;->getViewState()Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/verification/VerificationViewState;->getDidSendNewCode()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    goto :goto_4

    :cond_7
    move-object v2, v4

    :goto_4
    const v5, 0x7a2df2b

    invoke-interface {p2, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    and-int/lit8 v1, v1, 0x70

    const/4 v6, 0x0

    if-ne v1, v3, :cond_8

    const/4 v1, 0x1

    goto :goto_5

    :cond_8
    move v1, v6

    :goto_5
    or-int/2addr v1, v5

    .line 118
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_9

    .line 119
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_a

    .line 102
    :cond_9
    new-instance v1, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$ResendCodeNotificationEffect$1$1;

    invoke-direct {v1, p1, v0, p0, v4}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$ResendCodeNotificationEffect$1$1;-><init>(Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;Landroid/content/Context;Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;Lkotlin/coroutines/Continuation;)V

    move-object v3, v1

    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 121
    invoke-interface {p2, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 102
    :cond_a
    check-cast v3, Lkotlin/jvm/functions/Function2;

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {v2, v3, p2, v6}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 108
    :cond_b
    :goto_6
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p2

    if-eqz p2, :cond_c

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0, p1, p3}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;I)V

    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_c
    return-void
.end method

.method private static final ResendCodeNotificationEffect$lambda$6(Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p2

    invoke-direct {p0, p1, p3, p2}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;->ResendCodeNotificationEffect(Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic access$Content$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;
    .locals 0

    .line 24
    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;->Content$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getInteractor$p(Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;)Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;->interactor:Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;

    return-object p0
.end method


# virtual methods
.method public final Content(Landroidx/compose/runtime/Composer;I)V
    .locals 12

    const v0, -0x47ff1b3d

    .line 29
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    and-int/lit8 p1, p2, 0x6

    const/4 v1, 0x4

    const/4 v2, 0x2

    if-nez p1, :cond_1

    invoke-interface {v9, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    or-int/2addr p1, p2

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    and-int/lit8 v3, p1, 0x3

    if-ne v3, v2, :cond_3

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    .line 95
    :cond_2
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_3

    .line 29
    :cond_3
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.paymentsheet.ui.WalletButtonsContent.Content (WalletButtonsContent.kt:28)"

    invoke-static {v0, p1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 30
    :cond_4
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;->interactor:Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;

    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;->getState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v9, v3, v4}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v0

    .line 32
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const v5, -0x785bc35d

    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    and-int/lit8 v5, p1, 0xe

    if-ne v5, v1, :cond_5

    move v3, v4

    .line 111
    :cond_5
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    if-nez v3, :cond_6

    .line 112
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v1, v3, :cond_7

    .line 32
    :cond_6
    new-instance v1, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;)V

    .line 114
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 32
    :cond_7
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v3, 0x6

    invoke-static {v2, v1, v9, v3}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 40
    invoke-static {v0}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;->Content$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;

    move-result-object v1

    shl-int/lit8 p1, p1, 0x3

    and-int/lit8 p1, p1, 0x70

    invoke-direct {p0, v1, v9, p1}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;->ResendCodeNotificationEffect(Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;Landroidx/compose/runtime/Composer;I)V

    .line 43
    invoke-static {v0}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;->Content$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;->getHasContent()Z

    move-result p1

    if-eqz p1, :cond_8

    .line 44
    new-instance p1, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$Content$2;

    invoke-direct {p1, v0, p0}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$Content$2;-><init>(Landroidx/compose/runtime/State;Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;)V

    const/16 v0, 0x36

    const v1, 0x1e40be1e

    invoke-static {v1, v4, p1, v9, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p1

    move-object v8, p1

    check-cast v8, Lkotlin/jvm/functions/Function2;

    const/high16 v10, 0xc00000

    const/16 v11, 0x7f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v11}, Lcom/stripe/android/uicore/StripeThemeKt;->StripeTheme(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Ljava/lang/Float;Lcom/stripe/android/uicore/SectionStyle;Lcom/stripe/android/uicore/FormInsets;Lcom/stripe/android/uicore/IconStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    :cond_8
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 95
    :cond_9
    :goto_3
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p1

    if-eqz p1, :cond_a

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$$ExternalSyntheticLambda2;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;I)V

    invoke-interface {p1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_a
    return-void
.end method
