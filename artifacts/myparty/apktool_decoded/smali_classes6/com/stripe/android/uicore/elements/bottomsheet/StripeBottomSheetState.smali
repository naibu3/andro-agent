.class public final Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;
.super Ljava/lang/Object;
.source "StripeBottomSheetState.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$DismissalType;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0019\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010\u0012\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0002\u0010\u0014J\u000e\u0010\u0016\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000c\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;",
        "",
        "modalBottomSheetState",
        "Landroidx/compose/material/ModalBottomSheetState;",
        "keyboardHandler",
        "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;",
        "<init>",
        "(Landroidx/compose/material/ModalBottomSheetState;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;)V",
        "getModalBottomSheetState",
        "()Landroidx/compose/material/ModalBottomSheetState;",
        "dismissalType",
        "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$DismissalType;",
        "skipHideAnimation",
        "",
        "getSkipHideAnimation",
        "()Z",
        "setSkipHideAnimation",
        "(Z)V",
        "show",
        "",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "awaitDismissal",
        "hide",
        "DismissalType",
        "stripe-ui-core_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private dismissalType:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$DismissalType;

.field private final keyboardHandler:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;

.field private final modalBottomSheetState:Landroidx/compose/material/ModalBottomSheetState;

.field private skipHideAnimation:Z


# direct methods
.method public static synthetic $r8$lambda$SShN1U31HWvF4ZN3dUi44_WW8YY(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;->show$lambda$0(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$SoH0rbzHuISa98pKqCgJ0TtkFT0(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;->awaitDismissal$lambda$1(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;)Z

    move-result p0

    return p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/material/ModalBottomSheetState;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;)V
    .locals 1

    const-string v0, "modalBottomSheetState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keyboardHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;->modalBottomSheetState:Landroidx/compose/material/ModalBottomSheetState;

    .line 42
    iput-object p2, p0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;->keyboardHandler:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;

    return-void
.end method

.method private static final awaitDismissal$lambda$1(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;)Z
    .locals 0

    .line 61
    iget-object p0, p0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;->modalBottomSheetState:Landroidx/compose/material/ModalBottomSheetState;

    invoke-virtual {p0}, Landroidx/compose/material/ModalBottomSheetState;->isVisible()Z

    move-result p0

    return p0
.end method

.method private static final show$lambda$0(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;)Z
    .locals 0

    .line 57
    iget-object p0, p0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;->modalBottomSheetState:Landroidx/compose/material/ModalBottomSheetState;

    invoke-virtual {p0}, Landroidx/compose/material/ModalBottomSheetState;->isVisible()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final awaitDismissal(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$DismissalType;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$awaitDismissal$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$awaitDismissal$1;

    iget v1, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$awaitDismissal$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$awaitDismissal$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$awaitDismissal$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$awaitDismissal$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$awaitDismissal$1;-><init>(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$awaitDismissal$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 60
    iget v2, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$awaitDismissal$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$awaitDismissal$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    new-instance p1, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$$ExternalSyntheticLambda0;

    invoke-direct {p1, p0}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;)V

    invoke-static {p1}, Landroidx/compose/runtime/SnapshotStateKt;->snapshotFlow(Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/flow/Flow;

    move-result-object p1

    new-instance v2, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$awaitDismissal$3;

    const/4 v4, 0x0

    invoke-direct {v2, v4}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$awaitDismissal$3;-><init>(Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    iput-object p0, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$awaitDismissal$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$awaitDismissal$1;->label:I

    invoke-static {p1, v2, v0}, Lkotlinx/coroutines/flow/FlowKt;->first(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    .line 62
    :goto_1
    iget-object p1, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;->dismissalType:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$DismissalType;

    if-nez p1, :cond_4

    sget-object p1, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$DismissalType;->SwipedDownByUser:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$DismissalType;

    :cond_4
    return-object p1
.end method

.method public final getModalBottomSheetState()Landroidx/compose/material/ModalBottomSheetState;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;->modalBottomSheetState:Landroidx/compose/material/ModalBottomSheetState;

    return-object v0
.end method

.method public final getSkipHideAnimation()Z
    .locals 1

    .line 47
    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;->skipHideAnimation:Z

    return v0
.end method

.method public final hide(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$hide$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$hide$1;

    iget v1, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$hide$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$hide$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$hide$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$hide$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$hide$1;-><init>(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$hide$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 65
    iget v2, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$hide$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$hide$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 66
    iget-boolean p1, p0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;->skipHideAnimation:Z

    if-eqz p1, :cond_4

    .line 67
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 70
    :cond_4
    sget-object p1, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$DismissalType;->Programmatically:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$DismissalType;

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;->dismissalType:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$DismissalType;

    .line 74
    iget-object p1, p0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;->keyboardHandler:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;

    iput-object p0, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$hide$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$hide$1;->label:I

    invoke-virtual {p1, v0}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;->dismiss(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    move-object v2, p0

    .line 76
    :goto_1
    iget-object p1, v2, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;->modalBottomSheetState:Landroidx/compose/material/ModalBottomSheetState;

    invoke-virtual {p1}, Landroidx/compose/material/ModalBottomSheetState;->isVisible()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 77
    new-instance p1, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$hide$2;

    const/4 v4, 0x0

    invoke-direct {p1, v2, v4}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$hide$2;-><init>(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/jvm/functions/Function1;

    iput-object v4, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$hide$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$hide$1;->label:I

    const/16 v2, 0xa

    invoke-static {v2, p1, v0}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt;->access$repeatUntilSucceededOrLimit(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    .line 83
    :cond_6
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final setSkipHideAnimation(Z)V
    .locals 0

    .line 47
    iput-boolean p1, p0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;->skipHideAnimation:Z

    return-void
.end method

.method public final show(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$show$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$show$1;

    iget v1, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$show$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$show$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$show$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$show$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$show$1;-><init>(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$show$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 49
    iget v2, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$show$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$show$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 50
    new-instance p1, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$show$2;

    invoke-direct {p1, p0, v5}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$show$2;-><init>(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/jvm/functions/Function1;

    iput-object p0, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$show$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$show$1;->label:I

    const/16 v2, 0xa

    invoke-static {v2, p1, v0}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt;->access$repeatUntilSucceededOrLimit(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, p0

    .line 57
    :goto_1
    new-instance p1, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$$ExternalSyntheticLambda1;

    invoke-direct {p1, v2}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;)V

    invoke-static {p1}, Landroidx/compose/runtime/SnapshotStateKt;->snapshotFlow(Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/flow/Flow;

    move-result-object p1

    new-instance v2, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$show$4;

    invoke-direct {v2, v5}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$show$4;-><init>(Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function2;

    iput-object v5, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$show$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState$show$1;->label:I

    invoke-static {p1, v2, v0}, Lkotlinx/coroutines/flow/FlowKt;->first(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    .line 58
    :cond_5
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
