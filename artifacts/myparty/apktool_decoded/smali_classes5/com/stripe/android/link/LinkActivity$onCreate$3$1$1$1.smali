.class final Lcom/stripe/android/link/LinkActivity$onCreate$3$1$1$1;
.super Ljava/lang/Object;
.source "LinkActivity.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/LinkActivity$onCreate$3$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/FlowCollector;"
    }
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
.field final synthetic $bottomSheetState:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

.field final synthetic this$0:Lcom/stripe/android/link/LinkActivity;


# direct methods
.method constructor <init>(Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lcom/stripe/android/link/LinkActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivity$onCreate$3$1$1$1;->$bottomSheetState:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    iput-object p2, p0, Lcom/stripe/android/link/LinkActivity$onCreate$3$1$1$1;->this$0:Lcom/stripe/android/link/LinkActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/stripe/android/link/LinkActivityResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkActivityResult;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/LinkActivity$onCreate$3$1$1$1$emit$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/LinkActivity$onCreate$3$1$1$1$emit$1;

    iget v1, v0, Lcom/stripe/android/link/LinkActivity$onCreate$3$1$1$1$emit$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/link/LinkActivity$onCreate$3$1$1$1$emit$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/link/LinkActivity$onCreate$3$1$1$1$emit$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/LinkActivity$onCreate$3$1$1$1$emit$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/LinkActivity$onCreate$3$1$1$1$emit$1;-><init>(Lcom/stripe/android/link/LinkActivity$onCreate$3$1$1$1;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/link/LinkActivity$onCreate$3$1$1$1$emit$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 64
    iget v2, v0, Lcom/stripe/android/link/LinkActivity$onCreate$3$1$1$1$emit$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/link/LinkActivity$onCreate$3$1$1$1$emit$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/LinkActivityResult;

    iget-object v0, v0, Lcom/stripe/android/link/LinkActivity$onCreate$3$1$1$1$emit$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/link/LinkActivity$onCreate$3$1$1$1;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 65
    iget-object p2, p0, Lcom/stripe/android/link/LinkActivity$onCreate$3$1$1$1;->$bottomSheetState:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    iput-object p0, v0, Lcom/stripe/android/link/LinkActivity$onCreate$3$1$1$1$emit$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/link/LinkActivity$onCreate$3$1$1$1$emit$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/link/LinkActivity$onCreate$3$1$1$1$emit$1;->label:I

    invoke-virtual {p2, v0}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;->hide(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    .line 66
    :goto_1
    iget-object p2, v0, Lcom/stripe/android/link/LinkActivity$onCreate$3$1$1$1;->this$0:Lcom/stripe/android/link/LinkActivity;

    invoke-static {p2, p1}, Lcom/stripe/android/link/LinkActivity;->access$dismissWithResult(Lcom/stripe/android/link/LinkActivity;Lcom/stripe/android/link/LinkActivityResult;)V

    .line 67
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 64
    check-cast p1, Lcom/stripe/android/link/LinkActivityResult;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/LinkActivity$onCreate$3$1$1$1;->emit(Lcom/stripe/android/link/LinkActivityResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
