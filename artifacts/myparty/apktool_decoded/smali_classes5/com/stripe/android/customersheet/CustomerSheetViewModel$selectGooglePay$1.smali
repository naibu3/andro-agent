.class final Lcom/stripe/android/customersheet/CustomerSheetViewModel$selectGooglePay$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CustomerSheetViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/customersheet/CustomerSheetViewModel;->selectGooglePay()V
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCustomerSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerSheetViewModel.kt\ncom/stripe/android/customersheet/CustomerSheetViewModel$selectGooglePay$1\n+ 2 CustomerSheetDataResultKtx.kt\ncom/stripe/android/customersheet/data/CustomerSheetDataResultKtxKt\n*L\n1#1,1343:1\n54#2,4:1344\n63#2,6:1348\n*S KotlinDebug\n*F\n+ 1 CustomerSheetViewModel.kt\ncom/stripe/android/customersheet/CustomerSheetViewModel$selectGooglePay$1\n*L\n1178#1:1344,4\n1184#1:1348,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
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
    c = "com.stripe.android.customersheet.CustomerSheetViewModel$selectGooglePay$1"
    f = "CustomerSheetViewModel.kt"
    i = {}
    l = {
        0x499,
        0x499
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $syncDefaultEnabled:Ljava/lang/Boolean;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/customersheet/CustomerSheetViewModel;


# direct methods
.method constructor <init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/customersheet/CustomerSheetViewModel;",
            "Ljava/lang/Boolean;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/CustomerSheetViewModel$selectGooglePay$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$selectGooglePay$1;->this$0:Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    iput-object p2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$selectGooglePay$1;->$syncDefaultEnabled:Ljava/lang/Boolean;

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

    new-instance p1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$selectGooglePay$1;

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$selectGooglePay$1;->this$0:Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$selectGooglePay$1;->$syncDefaultEnabled:Ljava/lang/Boolean;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$selectGooglePay$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$selectGooglePay$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$selectGooglePay$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$selectGooglePay$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$selectGooglePay$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 1176
    iget v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$selectGooglePay$1;->label:I

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

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 1177
    iget-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$selectGooglePay$1;->this$0:Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput v3, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$selectGooglePay$1;->label:I

    invoke-static {p1, v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$awaitSavedSelectionDataSource(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;

    sget-object v1, Lcom/stripe/android/paymentsheet/model/SavedSelection$GooglePay;->INSTANCE:Lcom/stripe/android/paymentsheet/model/SavedSelection$GooglePay;

    check-cast v1, Lcom/stripe/android/paymentsheet/model/SavedSelection;

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$selectGooglePay$1;->label:I

    const/4 v2, 0x0

    invoke-interface {p1, v1, v2, v3}, Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;->setSavedSelection(Lcom/stripe/android/paymentsheet/model/SavedSelection;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    .line 1176
    :cond_4
    :goto_2
    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    .line 1178
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$selectGooglePay$1;->this$0:Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$selectGooglePay$1;->$syncDefaultEnabled:Ljava/lang/Boolean;

    .line 1344
    instance-of v2, p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    if-eqz v2, :cond_5

    .line 1345
    move-object v2, p1

    check-cast v2, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    invoke-virtual {v2}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/Unit;

    .line 1180
    sget-object v2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    check-cast v2, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    .line 1181
    const-string v3, "google_pay"

    .line 1179
    invoke-static {v0, v2, v3, v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$confirmPaymentSelection(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 1184
    :cond_5
    iget-object v4, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$selectGooglePay$1;->this$0:Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    iget-object v7, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$selectGooglePay$1;->$syncDefaultEnabled:Ljava/lang/Boolean;

    .line 1348
    invoke-static {p1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResultKtxKt;->failureOrNull(Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;

    move-result-object p1

    if-eqz p1, :cond_9

    .line 1349
    invoke-virtual {p1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getDisplayMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_8

    .line 1350
    invoke-virtual {p1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v1, v0, Lcom/stripe/android/core/exception/StripeException;

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    check-cast v0, Lcom/stripe/android/core/exception/StripeException;

    goto :goto_3

    :cond_6
    move-object v0, v2

    :goto_3
    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/stripe/android/core/exception/StripeException;->getStripeError()Lcom/stripe/android/core/StripeError;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/stripe/android/core/StripeError;->getMessage()Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_7
    move-object v9, v2

    goto :goto_5

    :cond_8
    :goto_4
    move-object v9, v0

    .line 1351
    :goto_5
    invoke-virtual {p1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getCause()Ljava/lang/Throwable;

    move-result-object v8

    .line 1186
    sget-object p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    move-object v5, p1

    check-cast v5, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    .line 1187
    const-string v6, "google_pay"

    .line 1185
    invoke-static/range {v4 .. v9}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$confirmPaymentSelectionError(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 1193
    :cond_9
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
