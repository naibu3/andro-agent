.class final Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceNextActionHandler.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;->startSourceAuth(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/Source;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.stripe.android.payments.core.authentication.SourceNextActionHandler$startSourceAuth$2"
    f = "SourceNextActionHandler.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $host:Lcom/stripe/android/view/AuthActivityStarterHost;

.field final synthetic $requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

.field final synthetic $source:Lcom/stripe/android/model/Source;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;


# direct methods
.method constructor <init>(Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/Source;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;",
            "Lcom/stripe/android/view/AuthActivityStarterHost;",
            "Lcom/stripe/android/model/Source;",
            "Lcom/stripe/android/core/networking/ApiRequest$Options;",
            "Lkotlin/coroutines/Continuation<",
            "Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;

    iput-object p2, p0, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->$host:Lcom/stripe/android/view/AuthActivityStarterHost;

    iput-object p3, p0, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->$source:Lcom/stripe/android/model/Source;

    iput-object p4, p0, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->$requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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

    new-instance v0, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;

    iget-object v1, p0, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;

    iget-object v2, p0, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->$host:Lcom/stripe/android/view/AuthActivityStarterHost;

    iget-object v3, p0, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->$source:Lcom/stripe/android/model/Source;

    iget-object v4, p0, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->$requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;-><init>(Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/Source;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 59
    iget v1, v0, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->label:I

    if-nez v1, :cond_5

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 60
    iget-object v1, v0, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;

    invoke-static {v1}, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;->access$getAnalyticsRequestExecutor$p(Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;

    move-result-object v1

    .line 61
    iget-object v2, v0, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;

    invoke-static {v2}, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;->access$getPaymentAnalyticsRequestFactory$p(Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    move-result-object v3

    sget-object v4, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->AuthSourceRedirect:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v10, 0x3e

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;->createRequest$payments_core_release$default(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequest;

    move-result-object v2

    .line 60
    invoke-interface {v1, v2}, Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;->executeAsync(Lcom/stripe/android/core/networking/AnalyticsRequest;)V

    .line 64
    iget-object v1, v0, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;

    invoke-static {v1}, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;->access$getPaymentBrowserAuthStarterFactory$p(Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;)Lkotlin/jvm/functions/Function1;

    move-result-object v1

    iget-object v2, v0, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->$host:Lcom/stripe/android/view/AuthActivityStarterHost;

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/PaymentBrowserAuthStarter;

    .line 67
    new-instance v2, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;

    .line 68
    iget-object v3, v0, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->$source:Lcom/stripe/android/model/Source;

    invoke-virtual {v3}, Lcom/stripe/android/model/Source;->getId()Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    if-nez v3, :cond_0

    move-object v3, v4

    .line 70
    :cond_0
    iget-object v5, v0, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->$source:Lcom/stripe/android/model/Source;

    invoke-virtual {v5}, Lcom/stripe/android/model/Source;->getClientSecret()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1

    move-object v5, v4

    .line 71
    :cond_1
    iget-object v6, v0, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->$source:Lcom/stripe/android/model/Source;

    invoke-virtual {v6}, Lcom/stripe/android/model/Source;->getRedirect()Lcom/stripe/android/model/Source$Redirect;

    move-result-object v6

    const/4 v7, 0x0

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lcom/stripe/android/model/Source$Redirect;->getUrl()Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :cond_2
    move-object v6, v7

    :goto_0
    if-nez v6, :cond_3

    move-object v6, v4

    .line 72
    :cond_3
    iget-object v4, v0, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->$source:Lcom/stripe/android/model/Source;

    invoke-virtual {v4}, Lcom/stripe/android/model/Source;->getRedirect()Lcom/stripe/android/model/Source$Redirect;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lcom/stripe/android/model/Source$Redirect;->getReturnUrl()Ljava/lang/String;

    move-result-object v7

    .line 73
    :cond_4
    iget-object v4, v0, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;

    invoke-static {v4}, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;->access$getEnableLogging$p(Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;)Z

    move-result v8

    .line 74
    iget-object v4, v0, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->$requestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    invoke-virtual {v4}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getStripeAccount()Ljava/lang/String;

    move-result-object v10

    .line 75
    iget-object v4, v0, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->$host:Lcom/stripe/android/view/AuthActivityStarterHost;

    invoke-interface {v4}, Lcom/stripe/android/view/AuthActivityStarterHost;->getStatusBarColor()Ljava/lang/Integer;

    move-result-object v13

    .line 76
    iget-object v4, v0, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;

    invoke-static {v4}, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;->access$getPublishableKeyProvider$p(Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;)Lkotlin/jvm/functions/Function0;

    move-result-object v4

    invoke-interface {v4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v4

    move-object v14, v4

    check-cast v14, Ljava/lang/String;

    .line 77
    iget-object v4, v0, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler$startSourceAuth$2;->this$0:Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;

    invoke-static {v4}, Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;->access$isInstantApp$p(Lcom/stripe/android/payments/core/authentication/SourceNextActionHandler;)Z

    move-result v15

    const/16 v18, 0x6340

    const/16 v19, 0x0

    const v4, 0xc352

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    .line 67
    invoke-direct/range {v2 .. v19}, Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 66
    invoke-interface {v1, v2}, Lcom/stripe/android/PaymentBrowserAuthStarter;->start(Ljava/lang/Object;)V

    .line 80
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 59
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
