.class public final Lcom/stripe/android/payments/core/injection/StripeRepositoryModule$Companion;
.super Ljava/lang/Object;
.source "StripeRepositoryModule.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/core/injection/StripeRepositoryModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/payments/core/injection/StripeRepositoryModule$Companion;",
        "",
        "<init>",
        "()V",
        "providesAnalyticsRequestV2Executor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;",
        "application",
        "Landroid/content/Context;",
        "coroutineContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
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

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/payments/core/injection/StripeRepositoryModule$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final providesAnalyticsRequestV2Executor(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;
    .locals 10
    .param p2    # Lkotlin/coroutines/CoroutineContext;
        .annotation runtime Lcom/stripe/android/core/injection/IOContext;
        .end annotation
    .end param
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    new-instance v1, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;

    .line 46
    new-instance v2, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p2

    move-object v7, p3

    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;-><init>(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILcom/stripe/android/core/Logger;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v7

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/core/networking/StripeNetworkClient;

    .line 51
    new-instance p2, Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage;

    invoke-direct {p2, p1}, Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage;-><init>(Landroid/content/Context;)V

    move-object v5, p2

    check-cast v5, Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;

    .line 52
    sget-object p2, Lcom/stripe/android/payments/core/injection/StripeRepositoryModule$Companion$providesAnalyticsRequestV2Executor$1;->INSTANCE:Lcom/stripe/android/payments/core/injection/StripeRepositoryModule$Companion$providesAnalyticsRequestV2Executor$1;

    move-object v6, p2

    check-cast v6, Lcom/stripe/android/core/utils/IsWorkManagerAvailable;

    move-object v2, p1

    .line 44
    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/core/networking/DefaultAnalyticsRequestV2Executor;-><init>(Landroid/content/Context;Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/Logger;Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;Lcom/stripe/android/core/utils/IsWorkManagerAvailable;)V

    check-cast v1, Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;

    return-object v1
.end method
