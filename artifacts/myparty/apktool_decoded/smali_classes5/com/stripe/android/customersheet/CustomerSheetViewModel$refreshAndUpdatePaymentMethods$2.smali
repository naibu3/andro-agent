.class final Lcom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CustomerSheetViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/customersheet/CustomerSheetViewModel;->refreshAndUpdatePaymentMethods(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Ljava/util/List<",
        "+",
        "Lcom/stripe/android/model/PaymentMethod;",
        ">;>;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCustomerSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerSheetViewModel.kt\ncom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2\n+ 2 CustomerSheetDataResultKtx.kt\ncom/stripe/android/customersheet/data/CustomerSheetDataResultKtxKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1343:1\n54#2,4:1344\n63#2,6:1348\n774#3:1354\n865#3,2:1355\n*S KotlinDebug\n*F\n+ 1 CustomerSheetViewModel.kt\ncom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2\n*L\n1106#1:1344,4\n1135#1:1348,6\n1117#1:1354\n1117#1:1355,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;",
        "",
        "Lcom/stripe/android/model/PaymentMethod;",
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
    c = "com.stripe.android.customersheet.CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2"
    f = "CustomerSheetViewModel.kt"
    i = {}
    l = {
        0x452,
        0x452
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $newPaymentMethod:Lcom/stripe/android/model/PaymentMethod;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/customersheet/CustomerSheetViewModel;


# direct methods
.method public static synthetic $r8$lambda$qVL6UsNjl8ugzFL5Yek1JGmPf5k(Ljava/util/List;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;)Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2;->invokeSuspend$lambda$5$lambda$4(Ljava/util/List;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;)Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/customersheet/CustomerSheetViewModel;",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2;->this$0:Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    iput-object p2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2;->$newPaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$5$lambda$4(Ljava/util/List;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;)Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;
    .locals 12

    .line 1112
    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/stripe/android/model/PaymentMethod;

    .line 1113
    iget-object v4, p1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    iget-object v3, v3, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    .line 1112
    :goto_0
    move-object v4, v1

    check-cast v4, Lcom/stripe/android/model/PaymentMethod;

    if-eqz v4, :cond_2

    .line 1115
    new-instance v3, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;-><init>(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved$WalletType;Lcom/stripe/android/model/PaymentMethodOptionsParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1112
    check-cast v3, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    goto :goto_1

    .line 1116
    :cond_2
    invoke-virtual {p3}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->getCurrentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move-result-object v3

    :goto_1
    move-object v6, v3

    .line 1354
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/Collection;

    .line 1355
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/model/PaymentMethod;

    .line 1118
    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    if-eqz v1, :cond_4

    .line 1119
    new-instance v3, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;

    invoke-static {p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$getConfiguration$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getCardBrandAcceptance$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;)V

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Card;->brand:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {v3, v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;->isAccepted(Lcom/stripe/android/model/CardBrand;)Z

    move-result v1

    goto :goto_3

    :cond_4
    const/4 v1, 0x1

    :goto_3
    if-eqz v1, :cond_3

    .line 1355
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 1356
    :cond_5
    check-cast p1, Ljava/util/List;

    .line 1125
    instance-of p0, v6, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    if-eqz p0, :cond_6

    move-object v2, v6

    check-cast v2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    .line 1123
    :cond_6
    invoke-static {p1, v2}, Lcom/stripe/android/customersheet/util/CustomerSheetUtilsKt;->sortPaymentMethods(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;)Ljava/util/List;

    move-result-object v5

    const/16 v10, 0x1c

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, p3

    .line 1122
    invoke-static/range {v4 .. v11}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;->copy$default(Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/customersheet/CustomerPermissions;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;ILjava/lang/Object;)Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    move-result-object p0

    return-object p0
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

    new-instance p1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2;

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2;->this$0:Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2;->$newPaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 1105
    iget v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2;->label:I

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

    .line 1106
    iget-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2;->this$0:Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput v3, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2;->label:I

    invoke-static {p1, v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$awaitPaymentMethodDataSource(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2;->label:I

    invoke-interface {p1, v1}, Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;->retrievePaymentMethods(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    .line 1105
    :cond_4
    :goto_2
    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2;->this$0:Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2;->$newPaymentMethod:Lcom/stripe/android/model/PaymentMethod;

    .line 1344
    instance-of v2, p1, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    if-eqz v2, :cond_5

    .line 1345
    move-object v2, p1

    check-cast v2, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;

    invoke-virtual {v2}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Success;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 1107
    invoke-static {v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$getErrorReporter$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    move-result-object v4

    .line 1108
    sget-object v5, Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;->CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_SUCCESS:Lcom/stripe/android/payments/core/analytics/ErrorReporter$SuccessEvent;

    check-cast v5, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 1107
    invoke-static/range {v4 .. v9}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 1111
    new-instance v4, Lcom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2$$ExternalSyntheticLambda0;

    invoke-direct {v4, v2, v1, v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2$$ExternalSyntheticLambda0;-><init>(Ljava/util/List;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/customersheet/CustomerSheetViewModel;)V

    invoke-static {v0, v4}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$setCustomerState(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/jvm/functions/Function1;)V

    .line 1132
    invoke-static {v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$getSelectPaymentMethodState$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/customersheet/CustomerSheetViewState;

    .line 1131
    invoke-static {v0, v1, v3}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$transition(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/customersheet/CustomerSheetViewState;Z)V

    .line 1135
    :cond_5
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2;->this$0:Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    .line 1348
    invoke-static {p1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResultKtxKt;->failureOrNull(Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;)Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;

    move-result-object v1

    if-eqz v1, :cond_8

    .line 1349
    invoke-virtual {v1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getDisplayMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_7

    .line 1350
    invoke-virtual {v1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    instance-of v3, v2, Lcom/stripe/android/core/exception/StripeException;

    if-eqz v3, :cond_6

    check-cast v2, Lcom/stripe/android/core/exception/StripeException;

    goto :goto_3

    :cond_6
    const/4 v2, 0x0

    :goto_3
    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lcom/stripe/android/core/exception/StripeException;->getStripeError()Lcom/stripe/android/core/StripeError;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lcom/stripe/android/core/StripeError;->getMessage()Ljava/lang/String;

    .line 1351
    :cond_7
    invoke-virtual {v1}, Lcom/stripe/android/customersheet/data/CustomerSheetDataResult$Failure;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    .line 1136
    invoke-static {v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$getErrorReporter$p(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    move-result-object v2

    .line 1137
    sget-object v3, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;->CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE:Lcom/stripe/android/payments/core/analytics/ErrorReporter$ExpectedErrorEvent;

    check-cast v3, Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;

    .line 1138
    sget-object v4, Lcom/stripe/android/core/exception/StripeException;->Companion:Lcom/stripe/android/core/exception/StripeException$Companion;

    invoke-virtual {v4, v1}, Lcom/stripe/android/core/exception/StripeException$Companion;->create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    .line 1136
    invoke-static/range {v2 .. v7}, Lcom/stripe/android/payments/core/analytics/ErrorReporter$DefaultImpls;->report$default(Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/payments/core/analytics/ErrorReporter$ErrorEvent;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;ILjava/lang/Object;)V

    .line 1141
    invoke-static {v0}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$onDismissed(Lcom/stripe/android/customersheet/CustomerSheetViewModel;)V

    :cond_8
    return-object p1
.end method
