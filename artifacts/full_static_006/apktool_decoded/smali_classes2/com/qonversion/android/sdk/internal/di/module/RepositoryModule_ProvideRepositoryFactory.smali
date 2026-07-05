.class public final Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;
.super Ljava/lang/Object;
.source "RepositoryModule_ProvideRepositoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        ">;"
    }
.end annotation


# instance fields
.field private final apiErrorMapperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;",
            ">;"
        }
    .end annotation
.end field

.field private final configProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/InternalConfig;",
            ">;"
        }
    .end annotation
.end field

.field private final delayCalculatorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;",
            ">;"
        }
    .end annotation
.end field

.field private final environmentProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/EnvironmentProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final loggerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/logger/Logger;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

.field private final rateLimiterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/RateLimiter;",
            ">;"
        }
    .end annotation
.end field

.field private final retrofitProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lretrofit2/Retrofit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;",
            "Ljavax/inject/Provider<",
            "Lretrofit2/Retrofit;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/EnvironmentProvider;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/InternalConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/logger/Logger;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/RateLimiter;",
            ">;)V"
        }
    .end annotation

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    .line 48
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;->retrofitProvider:Ljavax/inject/Provider;

    .line 49
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;->environmentProvider:Ljavax/inject/Provider;

    .line 50
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;->configProvider:Ljavax/inject/Provider;

    .line 51
    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;->loggerProvider:Ljavax/inject/Provider;

    .line 52
    iput-object p6, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;->apiErrorMapperProvider:Ljavax/inject/Provider;

    .line 53
    iput-object p7, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;->delayCalculatorProvider:Ljavax/inject/Provider;

    .line 54
    iput-object p8, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;->rateLimiterProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;",
            "Ljavax/inject/Provider<",
            "Lretrofit2/Retrofit;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/EnvironmentProvider;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/InternalConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/logger/Logger;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/RateLimiter;",
            ">;)",
            "Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;"
        }
    .end annotation

    .line 68
    new-instance v9, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;-><init>(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v9
.end method

.method public static provideRepository(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Lretrofit2/Retrofit;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;Lcom/qonversion/android/sdk/internal/api/RateLimiter;)Lcom/qonversion/android/sdk/internal/repository/QRepository;
    .locals 0

    .line 75
    invoke-virtual/range {p0 .. p7}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;->provideRepository(Lretrofit2/Retrofit;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;Lcom/qonversion/android/sdk/internal/api/RateLimiter;)Lcom/qonversion/android/sdk/internal/repository/QRepository;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/internal/repository/QRepository;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/repository/QRepository;
    .locals 8

    .line 59
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;->retrofitProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lretrofit2/Retrofit;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;->environmentProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;->configProvider:Ljavax/inject/Provider;

    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qonversion/android/sdk/internal/InternalConfig;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;->loggerProvider:Ljavax/inject/Provider;

    invoke-interface {v4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/qonversion/android/sdk/internal/logger/Logger;

    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;->apiErrorMapperProvider:Ljavax/inject/Provider;

    invoke-interface {v5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;->delayCalculatorProvider:Ljavax/inject/Provider;

    invoke-interface {v6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;

    iget-object v7, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;->rateLimiterProvider:Ljavax/inject/Provider;

    invoke-interface {v7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/qonversion/android/sdk/internal/api/RateLimiter;

    invoke-static/range {v0 .. v7}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;->provideRepository(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Lretrofit2/Retrofit;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;Lcom/qonversion/android/sdk/internal/api/RateLimiter;)Lcom/qonversion/android/sdk/internal/repository/QRepository;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 16
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideRepositoryFactory;->get()Lcom/qonversion/android/sdk/internal/repository/QRepository;

    move-result-object v0

    return-object v0
.end method
