.class public final Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;
.super Ljava/lang/Object;
.source "StripeBottomSheetKeyboardHandler.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000e\u0010\t\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\u000c\u001a\u00020\nH\u0082@\u00a2\u0006\u0002\u0010\u000bR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;",
        "",
        "keyboardController",
        "Landroidx/compose/ui/platform/SoftwareKeyboardController;",
        "isKeyboardVisible",
        "Landroidx/compose/runtime/State;",
        "",
        "<init>",
        "(Landroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/compose/runtime/State;)V",
        "dismiss",
        "",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "awaitKeyboardDismissed",
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
.field public static final $stable:I


# instance fields
.field private final isKeyboardVisible:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final keyboardController:Landroidx/compose/ui/platform/SoftwareKeyboardController;


# direct methods
.method public static synthetic $r8$lambda$M_NY7jh4mGj61zxcXcQuKEtsOqk(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;->awaitKeyboardDismissed$lambda$0(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;)Z

    move-result p0

    return p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/compose/runtime/State;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/platform/SoftwareKeyboardController;",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "isKeyboardVisible"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;->keyboardController:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    .line 17
    iput-object p2, p0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;->isKeyboardVisible:Landroidx/compose/runtime/State;

    return-void
.end method

.method public static final synthetic access$awaitKeyboardDismissed(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;->awaitKeyboardDismissed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final awaitKeyboardDismissed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
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

    .line 28
    new-instance v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;)V

    invoke-static {v0}, Landroidx/compose/runtime/SnapshotStateKt;->snapshotFlow(Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler$awaitKeyboardDismissed$3;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler$awaitKeyboardDismissed$3;-><init>(Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p1}, Lkotlinx/coroutines/flow/FlowKt;->first(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private static final awaitKeyboardDismissed$lambda$0(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;)Z
    .locals 0

    .line 28
    iget-object p0, p0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;->isKeyboardVisible:Landroidx/compose/runtime/State;

    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final dismiss(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
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

    .line 21
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;->isKeyboardVisible:Landroidx/compose/runtime/State;

    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 22
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;->keyboardController:Landroidx/compose/ui/platform/SoftwareKeyboardController;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/compose/ui/platform/SoftwareKeyboardController;->hide()V

    .line 23
    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;->awaitKeyboardDismissed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 25
    :cond_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
