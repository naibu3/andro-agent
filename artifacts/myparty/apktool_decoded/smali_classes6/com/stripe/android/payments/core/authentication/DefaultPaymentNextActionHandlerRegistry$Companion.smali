.class public final Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry$Companion;
.super Ljava/lang/Object;
.source "DefaultPaymentNextActionHandlerRegistry.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003Jn\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00102\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00132\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry$Companion;",
        "",
        "<init>",
        "()V",
        "createInstance",
        "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerRegistry;",
        "context",
        "Landroid/content/Context;",
        "paymentAnalyticsRequestFactory",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "enableLogging",
        "",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "uiContext",
        "threeDs1IntentReturnUrlMap",
        "",
        "",
        "publishableKeyProvider",
        "Lkotlin/Function0;",
        "productUsage",
        "",
        "isInstantApp",
        "includePaymentSheetNextActionHandlers",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final createInstance(Landroid/content/Context;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;ZLkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/util/Map;Lkotlin/jvm/functions/Function0;Ljava/util/Set;ZZ)Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerRegistry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
            "Z",
            "Lkotlin/coroutines/CoroutineContext;",
            "Lkotlin/coroutines/CoroutineContext;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;ZZ)",
            "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerRegistry;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentAnalyticsRequestFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threeDs1IntentReturnUrlMap"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsage"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    invoke-static {}, Lcom/stripe/android/payments/core/injection/DaggerNextActionHandlerComponent;->builder()Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;

    move-result-object v0

    .line 134
    invoke-interface {v0, p1}, Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;->context(Landroid/content/Context;)Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;

    move-result-object p1

    .line 135
    invoke-interface {p1, p2}, Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;->analyticsRequestFactory(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;

    move-result-object p1

    .line 136
    invoke-interface {p1, p3}, Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;->enableLogging(Z)Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;

    move-result-object p1

    .line 137
    invoke-interface {p1, p4}, Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;->workContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;

    move-result-object p1

    .line 138
    invoke-interface {p1, p5}, Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;->uiContext(Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;

    move-result-object p1

    .line 139
    invoke-interface {p1, p6}, Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;->threeDs1IntentReturnUrlMap(Ljava/util/Map;)Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;

    move-result-object p1

    .line 140
    invoke-interface {p1, p7}, Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;->publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;

    move-result-object p1

    .line 141
    invoke-interface {p1, p8}, Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;->productUsage(Ljava/util/Set;)Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;

    move-result-object p1

    .line 142
    invoke-interface {p1, p9}, Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;->isInstantApp(Z)Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;

    move-result-object p1

    .line 143
    invoke-interface {p1, p10}, Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;->includePaymentSheetNextActionHandlers(Z)Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;

    move-result-object p1

    .line 144
    invoke-interface {p1}, Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent$Builder;->build()Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent;

    move-result-object p1

    .line 145
    invoke-interface {p1}, Lcom/stripe/android/payments/core/injection/NextActionHandlerComponent;->getRegistry()Lcom/stripe/android/payments/core/authentication/DefaultPaymentNextActionHandlerRegistry;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerRegistry;

    return-object p1
.end method
