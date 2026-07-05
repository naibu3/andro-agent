.class final Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource$loadCustomerSheetSession$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CustomerSessionInitializationDataSource.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;->loadCustomerSheetSession(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/stripe/android/customersheet/data/CustomerSheetSession;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;",
        "Lcom/stripe/android/customersheet/data/CustomerSheetSession;",
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
    c = "com.stripe.android.customersheet.data.CustomerSessionInitializationDataSource$loadCustomerSheetSession$2"
    f = "CustomerSessionInitializationDataSource.kt"
    i = {
        0x1
    }
    l = {
        0x16,
        0x18
    }
    m = "invokeSuspend"
    n = {
        "customerSessionElementsSession"
    }
    s = {
        "L$1"
    }
.end annotation


# instance fields
.field final synthetic $configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;


# direct methods
.method constructor <init>(Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;",
            "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource$loadCustomerSheetSession$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource$loadCustomerSheetSession$2;->this$0:Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;

    iput-object p2, p0, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource$loadCustomerSheetSession$2;->$configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

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

    new-instance p1, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource$loadCustomerSheetSession$2;

    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource$loadCustomerSheetSession$2;->this$0:Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource$loadCustomerSheetSession$2;->$configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource$loadCustomerSheetSession$2;-><init>(Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource$loadCustomerSheetSession$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/stripe/android/customersheet/data/CustomerSheetSession;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource$loadCustomerSheetSession$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource$loadCustomerSheetSession$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource$loadCustomerSheetSession$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 21
    iget v1, p0, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource$loadCustomerSheetSession$2;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource$loadCustomerSheetSession$2;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;

    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource$loadCustomerSheetSession$2;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_6

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

    .line 22
    iget-object p1, p0, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource$loadCustomerSheetSession$2;->this$0:Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;

    invoke-static {p1}, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;->access$getElementsSessionManager$p(Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;)Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;

    move-result-object p1

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput v3, p0, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource$loadCustomerSheetSession$2;->label:I

    invoke-interface {p1, v1}, Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;->fetchElementsSession-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object v1, p0, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource$loadCustomerSheetSession$2;->this$0:Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;

    iget-object v4, p0, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource$loadCustomerSheetSession$2;->$configuration:Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    :try_start_1
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;

    .line 23
    invoke-static {v1}, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;->access$getSavedSelectionDataSource$p(Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;)Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;

    move-result-object v1

    .line 24
    iput-object v4, p0, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource$loadCustomerSheetSession$2;->L$0:Ljava/lang/Object;

    iput-object p1, p0, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource$loadCustomerSheetSession$2;->L$1:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource$loadCustomerSheetSession$2;->label:I

    invoke-interface {v1, p1, p0}, Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;->retrieveSavedSelection(Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    move-object v0, p1

    move-object p1, v1

    move-object v1, v4

    .line 21
    :goto_2
    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    .line 27
    invoke-interface {p1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;->toResult-d1pmJ48()Ljava/lang/Object;

    move-result-object p1

    .line 28
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v7, p1

    check-cast v7, Lcom/stripe/android/paymentsheet/model/SavedSelection;

    .line 30
    invoke-virtual {v0}, Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;->getCustomer()Lcom/stripe/android/model/ElementsSession$Customer;

    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lcom/stripe/android/model/ElementsSession$Customer;->getSession()Lcom/stripe/android/model/ElementsSession$Customer$Session;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/model/ElementsSession$Customer$Session;->getComponents()Lcom/stripe/android/model/ElementsSession$Customer$Components;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/model/ElementsSession$Customer$Components;->getCustomerSheet()Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;

    move-result-object v2

    .line 35
    instance-of v4, v2, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;

    const/4 v5, 0x0

    if-eqz v4, :cond_5

    .line 36
    check-cast v2, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;

    invoke-virtual {v2}, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->getCanRemoveLastPaymentMethod()Z

    move-result v2

    goto :goto_3

    .line 37
    :cond_5
    instance-of v2, v2, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Disabled;

    if-eqz v2, :cond_9

    move v2, v5

    .line 41
    :goto_3
    invoke-virtual {v0}, Lcom/stripe/android/customersheet/data/CustomerSessionElementsSession;->getElementsSession()Lcom/stripe/android/model/ElementsSession;

    move-result-object v0

    .line 42
    invoke-virtual {p1}, Lcom/stripe/android/model/ElementsSession$Customer;->getPaymentMethods()Ljava/util/List;

    move-result-object v6

    .line 48
    new-instance v4, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior$Disabled;

    .line 49
    sget-object v8, Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;->ALWAYS:Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    .line 48
    invoke-direct {v4, v8}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior$Disabled;-><init>(Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;)V

    .line 53
    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getAllowsRemovalOfLastSavedPaymentMethod$paymentsheet_release()Z

    move-result v1

    if-eqz v1, :cond_6

    if-eqz v2, :cond_6

    move v1, v3

    goto :goto_4

    :cond_6
    move v1, v5

    .line 55
    :goto_4
    invoke-virtual {p1}, Lcom/stripe/android/model/ElementsSession$Customer;->getSession()Lcom/stripe/android/model/ElementsSession$Customer$Session;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/model/ElementsSession$Customer$Session;->getComponents()Lcom/stripe/android/model/ElementsSession$Customer$Components;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/model/ElementsSession$Customer$Components;->getCustomerSheet()Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;

    move-result-object v2

    .line 56
    instance-of v8, v2, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;

    if-eqz v8, :cond_7

    .line 57
    check-cast v2, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;

    invoke-virtual {v2}, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->isPaymentMethodRemoveEnabled()Z

    move-result v5

    goto :goto_5

    .line 58
    :cond_7
    instance-of v2, v2, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Disabled;

    if-eqz v2, :cond_8

    .line 52
    :goto_5
    new-instance v9, Lcom/stripe/android/customersheet/CustomerPermissions;

    invoke-direct {v9, v5, v1, v3}, Lcom/stripe/android/customersheet/CustomerPermissions;-><init>(ZZZ)V

    .line 63
    invoke-virtual {p1}, Lcom/stripe/android/model/ElementsSession$Customer;->getDefaultPaymentMethod()Ljava/lang/String;

    move-result-object v10

    move-object p1, v4

    .line 40
    new-instance v4, Lcom/stripe/android/customersheet/data/CustomerSheetSession;

    .line 48
    move-object v8, p1

    check-cast v8, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    move-object v5, v0

    .line 40
    invoke-direct/range {v4 .. v10}, Lcom/stripe/android/customersheet/data/CustomerSheetSession;-><init>(Lcom/stripe/android/model/ElementsSession;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/customersheet/CustomerPermissions;Ljava/lang/String;)V

    .line 22
    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_7

    .line 55
    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 32
    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    :goto_6
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    :cond_a
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 65
    :goto_7
    invoke-static {p1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResultKtxKt;->toCustomerSheetDataResult(Ljava/lang/Object;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    move-result-object p1

    return-object p1
.end method
