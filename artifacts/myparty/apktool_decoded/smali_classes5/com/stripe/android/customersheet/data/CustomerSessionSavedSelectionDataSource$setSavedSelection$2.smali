.class final Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$setSavedSelection$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CustomerSessionSavedSelectionDataSource.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->setSavedSelection(Lcom/stripe/android/paymentsheet/model/SavedSelection;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult<",
        "Lkotlin/Unit;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
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
    c = "com.stripe.android.customersheet.data.CustomerSessionSavedSelectionDataSource$setSavedSelection$2"
    f = "CustomerSessionSavedSelectionDataSource.kt"
    i = {}
    l = {
        0x49,
        0x4b,
        0x4d
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $selection:Lcom/stripe/android/paymentsheet/model/SavedSelection;

.field final synthetic $shouldSyncDefault:Z

.field label:I

.field final synthetic this$0:Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;


# direct methods
.method constructor <init>(Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;ZLcom/stripe/android/paymentsheet/model/SavedSelection;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;",
            "Z",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$setSavedSelection$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$setSavedSelection$2;->this$0:Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;

    iput-boolean p2, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$setSavedSelection$2;->$shouldSyncDefault:Z

    iput-object p3, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$setSavedSelection$2;->$selection:Lcom/stripe/android/paymentsheet/model/SavedSelection;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$setSavedSelection$2;

    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$setSavedSelection$2;->this$0:Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;

    iget-boolean v1, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$setSavedSelection$2;->$shouldSyncDefault:Z

    iget-object v2, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$setSavedSelection$2;->$selection:Lcom/stripe/android/paymentsheet/model/SavedSelection;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$setSavedSelection$2;-><init>(Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;ZLcom/stripe/android/paymentsheet/model/SavedSelection;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$setSavedSelection$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult<",
            "Lkotlin/Unit;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$setSavedSelection$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$setSavedSelection$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$setSavedSelection$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 72
    iget v1, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$setSavedSelection$2;->label:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 73
    iget-object p1, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$setSavedSelection$2;->this$0:Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;

    invoke-static {p1}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->access$getElementsSessionManager$p(Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;)Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;

    move-result-object p1

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput v4, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$setSavedSelection$2;->label:I

    invoke-interface {p1, v1}, Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;->fetchCustomerSessionEphemeralKey-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-boolean v1, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$setSavedSelection$2;->$shouldSyncDefault:Z

    iget-object v4, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$setSavedSelection$2;->this$0:Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;

    iget-object v5, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$setSavedSelection$2;->$selection:Lcom/stripe/android/paymentsheet/model/SavedSelection;

    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    :try_start_1
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p1, Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;

    if-eqz v1, :cond_5

    .line 75
    iput v3, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$setSavedSelection$2;->label:I

    invoke-static {v4, p1, v5, p0}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->access$saveSelectionToBackend(Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;Lcom/stripe/android/customersheet/data/CachedCustomerEphemeralKey;Lcom/stripe/android/paymentsheet/model/SavedSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_2

    .line 77
    :cond_5
    iput v2, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$setSavedSelection$2;->label:I

    invoke-static {v4, v5, p0}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->access$saveSelectionToPrefs(Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;Lcom/stripe/android/paymentsheet/model/SavedSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_2
    return-object v0

    .line 79
    :cond_6
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 73
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_5

    :goto_4
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    :cond_7
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 79
    :goto_5
    invoke-static {p1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResultKtxKt;->toCustomerSheetDataResult(Ljava/lang/Object;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    move-result-object p1

    return-object p1
.end method
