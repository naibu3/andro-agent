.class final Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;
.super Ljava/lang/Object;
.source "DaggerNextActionHandlerComponent.java"

# interfaces
.implements Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Builder"
.end annotation


# instance fields
.field private analyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

.field private context:Landroid/content/Context;

.field private enableLogging:Ljava/lang/Boolean;

.field private includePaymentSheetNextActionHandlers:Ljava/lang/Boolean;

.field private isInstantApp:Ljava/lang/Boolean;

.field private productUsage:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private publishableKeyProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private threeDs1IntentReturnUrlMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private uiContext:Lkotlin/coroutines/CoroutineContext;

.field private workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent-IA;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public analyticsRequestFactory(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;
    .locals 0

    .line 99
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->analyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    return-object p0
.end method

.method public bridge synthetic analyticsRequestFactory(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;
    .locals 0

    .line 69
    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->analyticsRequestFactory(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public build()Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent;
    .locals 17

    move-object/from16 v0, p0

    .line 153
    iget-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->context:Landroid/content/Context;

    const-class v2, Landroid/content/Context;

    invoke-static {v1, v2}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 154
    iget-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->analyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    const-class v2, Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    invoke-static {v1, v2}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 155
    iget-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->enableLogging:Ljava/lang/Boolean;

    const-class v2, Ljava/lang/Boolean;

    invoke-static {v1, v2}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 156
    iget-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->workContext:Lkotlin/coroutines/CoroutineContext;

    const-class v2, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v1, v2}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 157
    iget-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->uiContext:Lkotlin/coroutines/CoroutineContext;

    const-class v2, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v1, v2}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 158
    iget-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->threeDs1IntentReturnUrlMap:Ljava/util/Map;

    const-class v2, Ljava/util/Map;

    invoke-static {v1, v2}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 159
    iget-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    const-class v2, Lkotlin/jvm/functions/Function0;

    invoke-static {v1, v2}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 160
    iget-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->productUsage:Ljava/util/Set;

    const-class v2, Ljava/util/Set;

    invoke-static {v1, v2}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 161
    iget-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->isInstantApp:Ljava/lang/Boolean;

    const-class v2, Ljava/lang/Boolean;

    invoke-static {v1, v2}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 162
    iget-object v1, v0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->includePaymentSheetNextActionHandlers:Ljava/lang/Boolean;

    const-class v2, Ljava/lang/Boolean;

    invoke-static {v1, v2}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 163
    new-instance v3, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$NextActionHandlerComponentImpl;

    new-instance v4, Lcom/stripe/android/payments/core/injection/WeChatPayNextActionHandlerModule;

    invoke-direct {v4}, Lcom/stripe/android/payments/core/injection/WeChatPayNextActionHandlerModule;-><init>()V

    new-instance v5, Lcom/stripe/android/core/injection/CoreCommonModule;

    invoke-direct {v5}, Lcom/stripe/android/core/injection/CoreCommonModule;-><init>()V

    iget-object v6, v0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->context:Landroid/content/Context;

    iget-object v7, v0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->analyticsRequestFactory:Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;

    iget-object v8, v0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->enableLogging:Ljava/lang/Boolean;

    iget-object v9, v0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->workContext:Lkotlin/coroutines/CoroutineContext;

    iget-object v10, v0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->uiContext:Lkotlin/coroutines/CoroutineContext;

    iget-object v11, v0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->threeDs1IntentReturnUrlMap:Ljava/util/Map;

    iget-object v12, v0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    iget-object v13, v0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->productUsage:Ljava/util/Set;

    iget-object v14, v0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->isInstantApp:Ljava/lang/Boolean;

    iget-object v15, v0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->includePaymentSheetNextActionHandlers:Ljava/lang/Boolean;

    const/16 v16, 0x0

    invoke-direct/range {v3 .. v16}, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$NextActionHandlerComponentImpl;-><init>(Lcom/stripe/android/payments/core/injection/WeChatPayNextActionHandlerModule;Lcom/stripe/android/core/injection/CoreCommonModule;Landroid/content/Context;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Ljava/lang/Boolean;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/util/Map;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent-IA;)V

    return-object v3
.end method

.method public context(Landroid/content/Context;)Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;
    .locals 0

    .line 92
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->context:Landroid/content/Context;

    return-object p0
.end method

.method public bridge synthetic context(Landroid/content/Context;)Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;
    .locals 0

    .line 69
    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->context(Landroid/content/Context;)Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public enableLogging(Z)Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;
    .locals 0

    .line 105
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->enableLogging:Ljava/lang/Boolean;

    return-object p0
.end method

.method public bridge synthetic enableLogging(Z)Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;
    .locals 0

    .line 69
    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->enableLogging(Z)Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public includePaymentSheetNextActionHandlers(Z)Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;
    .locals 0

    .line 147
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->includePaymentSheetNextActionHandlers:Ljava/lang/Boolean;

    return-object p0
.end method

.method public bridge synthetic includePaymentSheetNextActionHandlers(Z)Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;
    .locals 0

    .line 69
    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->includePaymentSheetNextActionHandlers(Z)Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public isInstantApp(Z)Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;
    .locals 0

    .line 141
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->isInstantApp:Ljava/lang/Boolean;

    return-object p0
.end method

.method public bridge synthetic isInstantApp(Z)Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;
    .locals 0

    .line 69
    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->isInstantApp(Z)Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public productUsage(Ljava/util/Set;)Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;"
        }
    .end annotation

    .line 135
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->productUsage:Ljava/util/Set;

    return-object p0
.end method

.method public bridge synthetic productUsage(Ljava/util/Set;)Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;
    .locals 0

    .line 69
    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->productUsage(Ljava/util/Set;)Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;"
        }
    .end annotation

    .line 129
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function0;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method public bridge synthetic publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;
    .locals 0

    .line 69
    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public threeDs1IntentReturnUrlMap(Ljava/util/Map;)Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;"
        }
    .end annotation

    .line 123
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->threeDs1IntentReturnUrlMap:Ljava/util/Map;

    return-object p0
.end method

.method public bridge synthetic threeDs1IntentReturnUrlMap(Ljava/util/Map;)Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;
    .locals 0

    .line 69
    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->threeDs1IntentReturnUrlMap(Ljava/util/Map;)Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public uiContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;
    .locals 0

    .line 117
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/coroutines/CoroutineContext;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->uiContext:Lkotlin/coroutines/CoroutineContext;

    return-object p0
.end method

.method public bridge synthetic uiContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;
    .locals 0

    .line 69
    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->uiContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public workContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;
    .locals 0

    .line 111
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/coroutines/CoroutineContext;

    iput-object p1, p0, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-object p0
.end method

.method public bridge synthetic workContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;
    .locals 0

    .line 69
    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;->workContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent$Builder;

    move-result-object p1

    return-object p1
.end method
