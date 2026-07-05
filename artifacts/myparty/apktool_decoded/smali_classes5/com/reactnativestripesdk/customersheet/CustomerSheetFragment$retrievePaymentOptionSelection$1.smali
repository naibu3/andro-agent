.class final Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$retrievePaymentOptionSelection$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CustomerSheetFragment.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;->retrievePaymentOptionSelection$stripe_stripe_react_native_release(Lcom/facebook/react/bridge/Promise;)V
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
    c = "com.reactnativestripesdk.customersheet.CustomerSheetFragment$retrievePaymentOptionSelection$1"
    f = "CustomerSheetFragment.kt"
    i = {
        0x0
    }
    l = {
        0xed
    }
    m = "invokeSuspend"
    n = {
        "$this$invokeSuspend_u24lambda_u242"
    }
    s = {
        "L$1"
    }
.end annotation


# instance fields
.field final synthetic $promise:Lcom/facebook/react/bridge/Promise;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;


# direct methods
.method constructor <init>(Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;Lcom/facebook/react/bridge/Promise;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;",
            "Lcom/facebook/react/bridge/Promise;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$retrievePaymentOptionSelection$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$retrievePaymentOptionSelection$1;->this$0:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;

    iput-object p2, p0, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$retrievePaymentOptionSelection$1;->$promise:Lcom/facebook/react/bridge/Promise;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    new-instance v0, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$retrievePaymentOptionSelection$1;

    iget-object v1, p0, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$retrievePaymentOptionSelection$1;->this$0:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;

    iget-object v2, p0, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$retrievePaymentOptionSelection$1;->$promise:Lcom/facebook/react/bridge/Promise;

    invoke-direct {v0, v1, v2, p2}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$retrievePaymentOptionSelection$1;-><init>(Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;Lcom/facebook/react/bridge/Promise;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$retrievePaymentOptionSelection$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$retrievePaymentOptionSelection$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$retrievePaymentOptionSelection$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$retrievePaymentOptionSelection$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$retrievePaymentOptionSelection$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 234
    iget v1, p0, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$retrievePaymentOptionSelection$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$retrievePaymentOptionSelection$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    iget-object v0, p0, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$retrievePaymentOptionSelection$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/facebook/react/bridge/Promise;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$retrievePaymentOptionSelection$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    .line 235
    iget-object v1, p0, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$retrievePaymentOptionSelection$1;->this$0:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;

    iget-object v3, p0, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$retrievePaymentOptionSelection$1;->$promise:Lcom/facebook/react/bridge/Promise;

    :try_start_1
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 237
    invoke-static {v1}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;->access$getCustomerSheet$p(Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;)Lcom/stripe/android/customersheet/CustomerSheet;

    move-result-object v1

    if-eqz v1, :cond_7

    iput-object v3, p0, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$retrievePaymentOptionSelection$1;->L$0:Ljava/lang/Object;

    iput-object p1, p0, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$retrievePaymentOptionSelection$1;->L$1:Ljava/lang/Object;

    iput v2, p0, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$retrievePaymentOptionSelection$1;->label:I

    invoke-virtual {v1, p0}, Lcom/stripe/android/customersheet/CustomerSheet;->retrievePaymentOptionSelection(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, v3

    :goto_0
    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetResult;

    if-nez p1, :cond_3

    move-object v3, v0

    goto :goto_2

    .line 242
    :cond_3
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v1

    const-string v2, "createMap(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    instance-of v2, p1, Lcom/stripe/android/customersheet/CustomerSheetResult$Failed;

    if-eqz v2, :cond_4

    .line 245
    sget-object v2, Lcom/reactnativestripesdk/utils/ErrorType;->Failed:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {v2}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object v2

    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetResult$Failed;

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/CustomerSheetResult$Failed;->getException()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    goto :goto_1

    .line 248
    :cond_4
    instance-of v1, p1, Lcom/stripe/android/customersheet/CustomerSheetResult$Selected;

    if-eqz v1, :cond_5

    .line 249
    sget-object v1, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;->Companion:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;

    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetResult$Selected;

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/CustomerSheetResult$Selected;->getSelection()Lcom/stripe/android/customersheet/PaymentOptionSelection;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;->createPaymentOptionResult$stripe_stripe_react_native_release(Lcom/stripe/android/customersheet/PaymentOptionSelection;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v1

    goto :goto_1

    .line 252
    :cond_5
    instance-of v1, p1, Lcom/stripe/android/customersheet/CustomerSheetResult$Canceled;

    if-eqz v1, :cond_6

    .line 253
    sget-object v1, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;->Companion:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;

    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetResult$Canceled;

    invoke-virtual {p1}, Lcom/stripe/android/customersheet/CustomerSheetResult$Canceled;->getSelection()Lcom/stripe/android/customersheet/PaymentOptionSelection;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;->createPaymentOptionResult$stripe_stripe_react_native_release(Lcom/stripe/android/customersheet/PaymentOptionSelection;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v1

    .line 255
    const-string p1, "error"

    .line 256
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v2

    .line 257
    const-string v3, "code"

    sget-object v4, Lcom/reactnativestripesdk/utils/ErrorType;->Canceled:Lcom/reactnativestripesdk/utils/ErrorType;

    invoke-virtual {v4}, Lcom/reactnativestripesdk/utils/ErrorType;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 256
    check-cast v2, Lcom/facebook/react/bridge/ReadableMap;

    .line 254
    invoke-interface {v1, p1, v2}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 262
    :goto_1
    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 263
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 235
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_3

    .line 243
    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 239
    :cond_7
    :goto_2
    sget-object p1, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment;->Companion:Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$Companion;->createMissingInitError$stripe_stripe_react_native_release()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {v3, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 240
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    .line 235
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 263
    :goto_3
    iget-object v0, p0, Lcom/reactnativestripesdk/customersheet/CustomerSheetFragment$retrievePaymentOptionSelection$1;->$promise:Lcom/facebook/react/bridge/Promise;

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 264
    sget-object v1, Lcom/reactnativestripesdk/utils/CreateTokenErrorType;->Failed:Lcom/reactnativestripesdk/utils/CreateTokenErrorType;

    invoke-virtual {v1}, Lcom/reactnativestripesdk/utils/CreateTokenErrorType;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 266
    :cond_8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
