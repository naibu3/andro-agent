.class final Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1$2$2$1$1;
.super Ljava/lang/Object;
.source "ManageActivity.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1$2$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic $hasResult$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1$2$2$1$1;->this$0:Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1$2$2$1$1;->$hasResult$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 98
    iget-object p2, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1$2$2$1$1;->this$0:Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    const/4 v0, 0x1

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p2, p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->access$setManageResult(Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;Z)V

    .line 99
    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1$2$2$1$1;->this$0:Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity;->finish()V

    .line 100
    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1$2$2$1$1;->$hasResult$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1, v0}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1$2;->access$invoke$lambda$2(Landroidx/compose/runtime/MutableState;Z)V

    .line 101
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 97
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/manage/ManageActivity$onCreate$2$1$2$2$1$1;->emit(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
