.class final Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$retrieveSavedSelection$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CustomerSessionSavedSelectionDataSource.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->retrieveSavedSelection(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;",
        "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
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
    c = "com.stripe.android.customersheet.data.CustomerSessionSavedSelectionDataSource$retrieveSavedSelection$2"
    f = "CustomerSessionSavedSelectionDataSource.kt"
    i = {}
    l = {
        0x1c,
        0x22
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $customerSessionElementsSession:Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;


# direct methods
.method constructor <init>(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;",
            "Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$retrieveSavedSelection$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$retrieveSavedSelection$2;->$customerSessionElementsSession:Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;

    iput-object p2, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$retrieveSavedSelection$2;->this$0:Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance p1, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$retrieveSavedSelection$2;

    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$retrieveSavedSelection$2;->$customerSessionElementsSession:Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$retrieveSavedSelection$2;->this$0:Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$retrieveSavedSelection$2;-><init>(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$retrieveSavedSelection$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$retrieveSavedSelection$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$retrieveSavedSelection$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$retrieveSavedSelection$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 25
    iget v1, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$retrieveSavedSelection$2;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lkotlin/Result;

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 26
    iget-object p1, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$retrieveSavedSelection$2;->$customerSessionElementsSession:Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;

    if-eqz p1, :cond_3

    .line 27
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    .line 28
    :cond_3
    iget-object p1, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$retrieveSavedSelection$2;->this$0:Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;

    invoke-static {p1}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->access$getElementsSessionManager$p(Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;)Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;

    move-result-object p1

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput v3, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$retrieveSavedSelection$2;->label:I

    invoke-interface {p1, v1}, Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;->fetchElementsSession-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_1

    .line 29
    :cond_4
    :goto_0
    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$retrieveSavedSelection$2;->this$0:Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_7

    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;

    .line 31
    invoke-virtual {p1}, Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;->getElementsSession()Lcom/stripe/android/model/ElementsSession;

    move-result-object v3

    invoke-static {v3}, Lcom/stripe/android/customersheet/util/SyncDefaultPaymentMethodUtilsKt;->getDefaultPaymentMethodsEnabledForCustomerSheet(Lcom/stripe/android/model/ElementsSession;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 32
    invoke-virtual {p1}, Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;->getCustomer()Lcom/stripe/android/model/ElementsSession$Customer;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->access$useDefaultPaymentMethodFromBackend(Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;Lcom/stripe/android/model/ElementsSession$Customer;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    move-result-object p1

    return-object p1

    .line 34
    :cond_5
    iput v2, p0, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource$retrieveSavedSelection$2;->label:I

    invoke-static {v1, p0}, Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;->access$useLocallySavedSelection(Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_1
    return-object v0

    .line 25
    :cond_6
    :goto_2
    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    return-object p1

    .line 38
    :cond_7
    sget-object p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;->Companion:Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;

    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Companion;->failure(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    return-object p1
.end method
