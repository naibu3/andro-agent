.class final Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "PaymentSheetFragment.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativestripesdk/PaymentSheetFragment;->onConfirmCustomPaymentMethod(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)V
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
    c = "com.reactnativestripesdk.PaymentSheetFragment$onConfirmCustomPaymentMethod$1"
    f = "PaymentSheetFragment.kt"
    i = {}
    l = {
        0x1df,
        0x1e7
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $billingDetails:Lcom/stripe/android/model/PaymentMethod$BillingDetails;

.field final synthetic $customPaymentMethod:Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;

.field final synthetic $keepJsAwakeTask:Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;

.field final synthetic $stripeSdkModule:Lcom/reactnativestripesdk/StripeSdkModule;

.field label:I

.field final synthetic this$0:Lcom/reactnativestripesdk/PaymentSheetFragment;


# direct methods
.method constructor <init>(Lcom/reactnativestripesdk/StripeSdkModule;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;Lcom/reactnativestripesdk/PaymentSheetFragment;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/reactnativestripesdk/StripeSdkModule;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;",
            "Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
            "Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;",
            "Lcom/reactnativestripesdk/PaymentSheetFragment;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;->$stripeSdkModule:Lcom/reactnativestripesdk/StripeSdkModule;

    iput-object p2, p0, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;->$customPaymentMethod:Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;

    iput-object p3, p0, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;->$billingDetails:Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    iput-object p4, p0, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;->$keepJsAwakeTask:Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;

    iput-object p5, p0, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;->this$0:Lcom/reactnativestripesdk/PaymentSheetFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance v0, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;

    iget-object v1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;->$stripeSdkModule:Lcom/reactnativestripesdk/StripeSdkModule;

    iget-object v2, p0, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;->$customPaymentMethod:Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;

    iget-object v3, p0, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;->$billingDetails:Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    iget-object v4, p0, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;->$keepJsAwakeTask:Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;

    iget-object v5, p0, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;->this$0:Lcom/reactnativestripesdk/PaymentSheetFragment;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;-><init>(Lcom/reactnativestripesdk/StripeSdkModule;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;Lcom/reactnativestripesdk/PaymentSheetFragment;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 476
    iget v1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 479
    :try_start_2
    move-object p1, p0

    check-cast p1, Lkotlin/coroutines/Continuation;

    iput v3, p0, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;->label:I

    const-wide/16 v3, 0x64

    invoke-static {v3, v4, p1}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    .line 482
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;->$stripeSdkModule:Lcom/reactnativestripesdk/StripeSdkModule;

    .line 483
    iget-object v1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;->$customPaymentMethod:Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;

    iget-object v3, p0, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;->$billingDetails:Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    invoke-static {v1, v3}, Lcom/reactnativestripesdk/utils/MappersKt;->mapFromCustomPaymentMethod(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/bridge/ReadableMap;

    .line 482
    invoke-virtual {p1, v1}, Lcom/reactnativestripesdk/StripeSdkModule;->emitOnCustomPaymentMethodConfirmHandlerCallback(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 487
    iget-object p1, p0, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;->$stripeSdkModule:Lcom/reactnativestripesdk/StripeSdkModule;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/StripeSdkModule;->getCustomPaymentMethodResultCallback$stripe_stripe_react_native_release()Lkotlinx/coroutines/CompletableDeferred;

    move-result-object p1

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;->label:I

    invoke-interface {p1, v1}, Lkotlinx/coroutines/CompletableDeferred;->await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    .line 476
    :cond_4
    :goto_2
    check-cast p1, Lcom/facebook/react/bridge/ReadableMap;

    .line 489
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;->$keepJsAwakeTask:Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;

    invoke-virtual {v0}, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;->stop()V

    .line 491
    const-string v0, "status"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 494
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x539f09b5

    if-eq v1, v2, :cond_a

    const v2, -0x4c696bc3

    if-eq v1, v2, :cond_7

    const p1, -0x7577b67

    if-eq v1, p1, :cond_5

    goto :goto_3

    :cond_5
    const-string p1, "canceled"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_3

    .line 498
    :cond_6
    sget-object p1, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;->Companion:Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Companion;->canceled()Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;

    move-result-object p1

    goto :goto_4

    .line 494
    :cond_7
    const-string v1, "failed"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_3

    .line 500
    :cond_8
    const-string v0, "error"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_9

    const-string p1, "Custom payment failed"

    .line 501
    :cond_9
    sget-object v0, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;->Companion:Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Companion;->failed(Ljava/lang/String;)Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;

    move-result-object p1

    goto :goto_4

    .line 494
    :cond_a
    const-string p1, "completed"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_3

    .line 496
    :cond_b
    sget-object p1, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;->Companion:Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Companion;->completed()Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;

    move-result-object p1

    goto :goto_4

    .line 504
    :cond_c
    :goto_3
    sget-object p1, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;->Companion:Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Companion;

    const-string v0, "Unknown status"

    invoke-virtual {p1, v0}, Lcom/stripe/android/paymentelement/CustomPaymentMethodResult$Companion;->failed(Ljava/lang/String;)Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;

    move-result-object p1

    .line 509
    :goto_4
    iget-object v0, p0, Lcom/reactnativestripesdk/PaymentSheetFragment$onConfirmCustomPaymentMethod$1;->this$0:Lcom/reactnativestripesdk/PaymentSheetFragment;

    invoke-static {v0}, Lcom/reactnativestripesdk/PaymentSheetFragment;->access$getContext$p(Lcom/reactnativestripesdk/PaymentSheetFragment;)Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    if-nez v0, :cond_d

    const-string v0, "context"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_d
    check-cast v0, Landroid/content/Context;

    .line 508
    invoke-static {v0, p1}, Lcom/stripe/android/paymentelement/CustomPaymentMethodResultHandler;->handleCustomPaymentMethodResult(Landroid/content/Context;Lcom/stripe/android/paymentelement/CustomPaymentMethodResult;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 514
    sget-object p1, Lcom/reactnativestripesdk/CustomPaymentMethodActivity;->Companion:Lcom/reactnativestripesdk/CustomPaymentMethodActivity$Companion;

    invoke-virtual {p1}, Lcom/reactnativestripesdk/CustomPaymentMethodActivity$Companion;->finishCurrent()V

    .line 516
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 514
    :goto_5
    sget-object v0, Lcom/reactnativestripesdk/CustomPaymentMethodActivity;->Companion:Lcom/reactnativestripesdk/CustomPaymentMethodActivity$Companion;

    invoke-virtual {v0}, Lcom/reactnativestripesdk/CustomPaymentMethodActivity$Companion;->finishCurrent()V

    throw p1
.end method
