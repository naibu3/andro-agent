.class final Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "GooglePayLauncherViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->confirmStripeIntent(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/PaymentMethodCreateParams;)V
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
    c = "com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel$confirmStripeIntent$1"
    f = "GooglePayLauncherViewModel.kt"
    i = {}
    l = {
        0xd5
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $host:Lcom/stripe/android/view/AuthActivityStarterHost;

.field final synthetic $params:Lcom/stripe/android/model/PaymentMethodCreateParams;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;


# direct methods
.method constructor <init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/view/AuthActivityStarterHost;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;",
            "Lcom/stripe/android/model/PaymentMethodCreateParams;",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;->this$0:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    iput-object p2, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;->$params:Lcom/stripe/android/model/PaymentMethodCreateParams;

    iput-object p3, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;->$host:Lcom/stripe/android/view/AuthActivityStarterHost;

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

    new-instance p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;

    iget-object v0, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;->this$0:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    iget-object v1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;->$params:Lcom/stripe/android/model/PaymentMethodCreateParams;

    iget-object v2, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;->$host:Lcom/stripe/android/view/AuthActivityStarterHost;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;-><init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/view/AuthActivityStarterHost;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 199
    iget v1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 200
    iget-object p1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;->this$0:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    invoke-static {p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->access$getArgs$p(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    move-result-object p1

    .line 201
    instance-of v1, p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$PaymentIntentArgs;

    if-eqz v1, :cond_2

    .line 202
    sget-object v3, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->Companion:Lcom/stripe/android/model/ConfirmPaymentIntentParams$Companion;

    .line 203
    iget-object v4, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;->$params:Lcom/stripe/android/model/PaymentMethodCreateParams;

    .line 204
    iget-object p1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;->this$0:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    invoke-static {p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->access$getArgs$p(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$PaymentIntentArgs;

    invoke-virtual {p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$PaymentIntentArgs;->getClientSecret$payments_core_release()Ljava/lang/String;

    move-result-object v5

    const/16 v12, 0xfc

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 202
    invoke-static/range {v3 .. v13}, Lcom/stripe/android/model/ConfirmPaymentIntentParams$Companion;->createWithPaymentMethodCreateParams$default(Lcom/stripe/android/model/ConfirmPaymentIntentParams$Companion;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/PaymentMethodOptionsParams;ILjava/lang/Object;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/ConfirmStripeIntentParams;

    goto :goto_0

    .line 206
    :cond_2
    instance-of p1, p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$SetupIntentArgs;

    if-eqz p1, :cond_4

    .line 207
    sget-object v3, Lcom/stripe/android/model/ConfirmSetupIntentParams;->Companion:Lcom/stripe/android/model/ConfirmSetupIntentParams$Companion;

    .line 208
    iget-object v4, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;->$params:Lcom/stripe/android/model/PaymentMethodCreateParams;

    .line 209
    iget-object p1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;->this$0:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    invoke-static {p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->access$getArgs$p(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$SetupIntentArgs;

    invoke-virtual {p1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$SetupIntentArgs;->getClientSecret$payments_core_release()Ljava/lang/String;

    move-result-object v5

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 207
    invoke-static/range {v3 .. v9}, Lcom/stripe/android/model/ConfirmSetupIntentParams$Companion;->create$default(Lcom/stripe/android/model/ConfirmSetupIntentParams$Companion;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/ConfirmSetupIntentParams;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/ConfirmStripeIntentParams;

    .line 213
    :goto_0
    iget-object v1, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;->this$0:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    invoke-static {v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->access$getPaymentController$p(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;)Lcom/stripe/android/PaymentController;

    move-result-object v1

    .line 214
    iget-object v3, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;->$host:Lcom/stripe/android/view/AuthActivityStarterHost;

    .line 216
    iget-object v4, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;->this$0:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;

    invoke-static {v4}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;->access$getRequestOptions$p(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v4

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    .line 213
    iput v2, p0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$confirmStripeIntent$1;->label:I

    invoke-interface {v1, v3, p1, v4, v5}, Lcom/stripe/android/PaymentController;->startConfirmAndAuth(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/ConfirmStripeIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    .line 218
    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 200
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
