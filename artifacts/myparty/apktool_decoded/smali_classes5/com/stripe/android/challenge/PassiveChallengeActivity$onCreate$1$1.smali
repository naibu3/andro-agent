.class final Lcom/stripe/android/challenge/PassiveChallengeActivity$onCreate$1$1;
.super Ljava/lang/Object;
.source "PassiveChallengeActivity.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/challenge/PassiveChallengeActivity$onCreate$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic this$0:Lcom/stripe/android/challenge/PassiveChallengeActivity;


# direct methods
.method constructor <init>(Lcom/stripe/android/challenge/PassiveChallengeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/challenge/PassiveChallengeActivity$onCreate$1$1;->this$0:Lcom/stripe/android/challenge/PassiveChallengeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/stripe/android/challenge/PassiveChallengeActivityResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/challenge/PassiveChallengeActivityResult;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 28
    iget-object p2, p0, Lcom/stripe/android/challenge/PassiveChallengeActivity$onCreate$1$1;->this$0:Lcom/stripe/android/challenge/PassiveChallengeActivity;

    invoke-static {p2, p1}, Lcom/stripe/android/challenge/PassiveChallengeActivity;->access$dismissWithResult(Lcom/stripe/android/challenge/PassiveChallengeActivity;Lcom/stripe/android/challenge/PassiveChallengeActivityResult;)V

    .line 29
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 27
    check-cast p1, Lcom/stripe/android/challenge/PassiveChallengeActivityResult;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/challenge/PassiveChallengeActivity$onCreate$1$1;->emit(Lcom/stripe/android/challenge/PassiveChallengeActivityResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
