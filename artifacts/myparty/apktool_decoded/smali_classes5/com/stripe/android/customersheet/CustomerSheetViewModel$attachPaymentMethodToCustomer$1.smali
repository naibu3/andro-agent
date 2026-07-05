.class final Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethodToCustomer$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CustomerSheetViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/customersheet/CustomerSheetViewModel;->attachPaymentMethodToCustomer(Lcom/stripe/android/model/PaymentMethod;)V
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
    c = "com.stripe.android.customersheet.CustomerSheetViewModel$attachPaymentMethodToCustomer$1"
    f = "CustomerSheetViewModel.kt"
    i = {}
    l = {
        0x3cd,
        0x3ce,
        0x3d0
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $paymentMethod:Lcom/stripe/android/model/PaymentMethod;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/customersheet/CustomerSheetViewModel;


# direct methods
.method constructor <init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/customersheet/CustomerSheetViewModel;",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethodToCustomer$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethodToCustomer$1;->this$0:Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    iput-object p2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethodToCustomer$1;->$paymentMethod:Lcom/stripe/android/model/PaymentMethod;

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

    new-instance p1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethodToCustomer$1;

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethodToCustomer$1;->this$0:Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethodToCustomer$1;->$paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethodToCustomer$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethodToCustomer$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethodToCustomer$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethodToCustomer$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethodToCustomer$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 972
    iget v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethodToCustomer$1;->label:I

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
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 973
    iget-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethodToCustomer$1;->this$0:Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput v4, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethodToCustomer$1;->label:I

    invoke-static {p1, v1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$awaitIntentDataSource(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;

    invoke-interface {p1}, Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;->getCanCreateSetupIntents()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 974
    iget-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethodToCustomer$1;->this$0:Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethodToCustomer$1;->$paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    move-object v2, p0

    check-cast v2, Lkotlin/coroutines/Continuation;

    iput v3, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethodToCustomer$1;->label:I

    invoke-static {p1, v1, v2}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$attachWithSetupIntent(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_2

    .line 976
    :cond_5
    iget-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethodToCustomer$1;->this$0:Lcom/stripe/android/customersheet/CustomerSheetViewModel;

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethodToCustomer$1;->$paymentMethod:Lcom/stripe/android/model/PaymentMethod;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$attachPaymentMethodToCustomer$1;->label:I

    invoke-static {p1, v1, v3}, Lcom/stripe/android/customersheet/CustomerSheetViewModel;->access$attachPaymentMethod(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_2
    return-object v0

    .line 978
    :cond_6
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
