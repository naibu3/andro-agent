.class final Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "CompleteLinkFlow.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;->completeLinkFlow(Lcom/stripe/android/link/LinkLaunchMode;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.link.confirmation.DefaultCompleteLinkFlow"
    f = "CompleteLinkFlow.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x5e,
        0x6e
    }
    m = "completeLinkFlow"
    n = {
        "$this$withDismissalDisabled$iv",
        "originalDismissible$iv"
    }
    s = {
        "L$0",
        "Z$0"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field Z$0:Z

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;


# direct methods
.method constructor <init>(Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;->this$0:Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;->label:I

    iget-object p1, p0, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow$completeLinkFlow$1;->this$0:Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-static {p1, v0, v0, v0, v1}, Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;->access$completeLinkFlow(Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;Lcom/stripe/android/link/LinkLaunchMode;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
