.class final Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$retrieveSavedSelection$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CustomerAdapterDataSource.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->retrieveSavedSelection(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/stripe/android/customersheet/CustomerAdapter$Result<",
        "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCustomerAdapterDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerAdapterDataSource.kt\ncom/stripe/android/customersheet/data/CustomerAdapterDataSource$retrieveSavedSelection$2\n+ 2 CustomerAdapterResultKtx.kt\ncom/stripe/android/customersheet/CustomerAdapterResultKtxKt\n*L\n1#1,180:1\n26#2,5:181\n*S KotlinDebug\n*F\n+ 1 CustomerAdapterDataSource.kt\ncom/stripe/android/customersheet/data/CustomerAdapterDataSource$retrieveSavedSelection$2\n*L\n99#1:181,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/customersheet/CustomerAdapter$Result;",
        "Lcom/stripe/android/paymentsheet/model/SavedSelection;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$retrieveSavedSelection$2"
    f = "CustomerAdapterDataSource.kt"
    i = {}
    l = {
        0x63
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;


# direct methods
.method constructor <init>(Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$retrieveSavedSelection$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$retrieveSavedSelection$2;->this$0:Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$retrieveSavedSelection$2;

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$retrieveSavedSelection$2;->this$0:Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$retrieveSavedSelection$2;-><init>(Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$retrieveSavedSelection$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/CustomerAdapter$Result<",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$retrieveSavedSelection$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$retrieveSavedSelection$2;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$retrieveSavedSelection$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 98
    iget v1, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$retrieveSavedSelection$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 99
    iget-object p1, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$retrieveSavedSelection$2;->this$0:Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;

    invoke-static {p1}, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;->access$getCustomerAdapter$p(Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;)Lcom/stripe/android/customersheet/CustomerAdapter;

    move-result-object p1

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource$retrieveSavedSelection$2;->label:I

    invoke-interface {p1, v1}, Lcom/stripe/android/customersheet/CustomerAdapter;->retrieveSelectedPaymentOption(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    .line 98
    :cond_2
    :goto_0
    check-cast p1, Lcom/stripe/android/customersheet/CustomerAdapter$Result;

    .line 182
    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerAdapter$Result$Success;

    if-eqz v0, :cond_4

    sget-object v0, Lcom/stripe/android/customersheet/CustomerAdapter$Result;->Companion:Lcom/stripe/android/customersheet/CustomerAdapter$Result$Companion;

    check-cast p1, Lcom/stripe/android/customersheet/CustomerAdapter$Result$Success;

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/CustomerAdapter$Result$Success;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;

    if-eqz p1, :cond_3

    .line 100
    invoke-virtual {p1}, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;->toSavedSelection$paymentsheet_release()Lcom/stripe/android/paymentsheet/model/SavedSelection;

    move-result-object p1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    .line 182
    :goto_1
    invoke-virtual {v0, p1}, Lcom/stripe/android/customersheet/CustomerAdapter$Result$Companion;->success(Ljava/lang/Object;)Lcom/stripe/android/customersheet/CustomerAdapter$Result;

    move-result-object p1

    return-object p1

    .line 183
    :cond_4
    instance-of v0, p1, Lcom/stripe/android/customersheet/CustomerAdapter$Result$Failure;

    if-eqz v0, :cond_5

    sget-object v0, Lcom/stripe/android/customersheet/CustomerAdapter$Result;->Companion:Lcom/stripe/android/customersheet/CustomerAdapter$Result$Companion;

    .line 184
    check-cast p1, Lcom/stripe/android/customersheet/CustomerAdapter$Result$Failure;

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/CustomerAdapter$Result$Failure;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    .line 185
    invoke-virtual {p1}, Lcom/stripe/android/customersheet/CustomerAdapter$Result$Failure;->getDisplayMessage()Ljava/lang/String;

    move-result-object p1

    .line 183
    invoke-virtual {v0, v1, p1}, Lcom/stripe/android/customersheet/CustomerAdapter$Result$Companion;->failure(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/stripe/android/customersheet/CustomerAdapter$Result;

    move-result-object p1

    return-object p1

    .line 181
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
