.class final Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "WebIntentNextActionHandler.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;->beginWebAuth(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.stripe.android.payments.core.authentication.WebIntentNextActionHandler$beginWebAuth$2"
    f = "WebIntentNextActionHandler.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $authUrl:Ljava/lang/String;

.field final synthetic $clientSecret:Ljava/lang/String;

.field final synthetic $forceInAppWebView:Z

.field final synthetic $host:Lcom/stripe/android/view/AuthActivityStarterHost;

.field final synthetic $referrer:Ljava/lang/String;

.field final synthetic $requestCode:I

.field final synthetic $returnUrl:Ljava/lang/String;

.field final synthetic $shouldCancelIntentOnUserNavigation:Z

.field final synthetic $shouldCancelSource:Z

.field final synthetic $stripeAccount:Ljava/lang/String;

.field final synthetic $stripeIntent:Lcom/stripe/android/model/StripeIntent;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;


# direct methods
.method constructor <init>(Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/model/StripeIntent;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZ",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;

    iput-object p2, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$host:Lcom/stripe/android/view/AuthActivityStarterHost;

    iput-object p3, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$stripeIntent:Lcom/stripe/android/model/StripeIntent;

    iput p4, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$requestCode:I

    iput-object p5, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$clientSecret:Ljava/lang/String;

    iput-object p6, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$authUrl:Ljava/lang/String;

    iput-object p7, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$returnUrl:Ljava/lang/String;

    iput-object p8, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$stripeAccount:Ljava/lang/String;

    iput-boolean p9, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$shouldCancelSource:Z

    iput-boolean p10, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$shouldCancelIntentOnUserNavigation:Z

    iput-object p11, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$referrer:Ljava/lang/String;

    iput-boolean p12, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$forceInAppWebView:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p13}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 14
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

    new-instance v0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;

    iget-object v2, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$host:Lcom/stripe/android/view/AuthActivityStarterHost;

    iget-object v3, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$stripeIntent:Lcom/stripe/android/model/StripeIntent;

    iget v4, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$requestCode:I

    iget-object v5, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$clientSecret:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$authUrl:Ljava/lang/String;

    iget-object v7, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$returnUrl:Ljava/lang/String;

    iget-object v8, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$stripeAccount:Ljava/lang/String;

    iget-boolean v9, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$shouldCancelSource:Z

    iget-boolean v10, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$shouldCancelIntentOnUserNavigation:Z

    iget-object v11, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$referrer:Ljava/lang/String;

    iget-boolean v12, p0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$forceInAppWebView:Z

    move-object/from16 v13, p2

    invoke-direct/range {v0 .. v13}, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;-><init>(Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZLkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 100
    iget v1, v0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->label:I

    if-nez v1, :cond_1

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 101
    iget-object v1, v0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;

    invoke-static {v1}, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;->access$getPaymentBrowserAuthStarterFactory$p(Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;)Lkotlin/jvm/functions/Function1;

    move-result-object v1

    iget-object v2, v0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$host:Lcom/stripe/android/view/AuthActivityStarterHost;

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/PaymentBrowserAuthStarter;

    .line 103
    new-instance v2, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    .line 104
    iget-object v3, v0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$stripeIntent:Lcom/stripe/android/model/StripeIntent;

    invoke-interface {v3}, Lcom/stripe/android/model/StripeIntent;->getId()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    const-string v3, ""

    .line 105
    :cond_0
    iget v4, v0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$requestCode:I

    .line 106
    iget-object v5, v0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$clientSecret:Ljava/lang/String;

    .line 107
    iget-object v6, v0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$authUrl:Ljava/lang/String;

    .line 108
    iget-object v7, v0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$returnUrl:Ljava/lang/String;

    .line 109
    iget-object v8, v0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;

    invoke-static {v8}, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;->access$getEnableLogging$p(Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;)Z

    move-result v8

    .line 110
    iget-object v10, v0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$stripeAccount:Ljava/lang/String;

    .line 111
    iget-boolean v11, v0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$shouldCancelSource:Z

    .line 112
    iget-boolean v12, v0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$shouldCancelIntentOnUserNavigation:Z

    .line 113
    iget-object v9, v0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$host:Lcom/stripe/android/view/AuthActivityStarterHost;

    invoke-interface {v9}, Lcom/stripe/android/view/AuthActivityStarterHost;->getStatusBarColor()Ljava/lang/Integer;

    move-result-object v13

    .line 114
    iget-object v9, v0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;

    invoke-static {v9}, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;->access$getPublishableKeyProvider$p(Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;)Lkotlin/jvm/functions/Function0;

    move-result-object v9

    invoke-interface {v9}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v9

    move-object v14, v9

    check-cast v14, Ljava/lang/String;

    .line 115
    iget-object v9, v0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;

    invoke-static {v9}, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;->access$isInstantApp$p(Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;)Z

    move-result v15

    .line 116
    iget-object v9, v0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$referrer:Ljava/lang/String;

    move-object/from16 p1, v2

    .line 117
    iget-boolean v2, v0, Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler$beginWebAuth$2;->$forceInAppWebView:Z

    const/16 v18, 0x40

    const/16 v19, 0x0

    move-object/from16 v16, v9

    const/4 v9, 0x0

    move/from16 v17, v2

    move-object/from16 v2, p1

    .line 103
    invoke-direct/range {v2 .. v19}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 102
    invoke-interface {v1, v2}, Lcom/stripe/android/PaymentBrowserAuthStarter;->start(Ljava/lang/Object;)V

    .line 120
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 100
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
