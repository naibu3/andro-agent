.class public final Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;
.super Ljava/lang/Object;
.source "RepositoryModule_ProvideQonversionRepositoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;",
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
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
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
            ">;)V"
        }
    .end annotation

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    .line 44
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->retrofitProvider:Ljavax/inject/Provider;

    .line 45
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->environmentProvider:Ljavax/inject/Provider;

    .line 46
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->configProvider:Ljavax/inject/Provider;

    .line 47
    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->loggerProvider:Ljavax/inject/Provider;

    .line 48
    iput-object p6, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->apiErrorMapperProvider:Ljavax/inject/Provider;

    .line 49
    iput-object p7, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->delayCalculatorProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;
    .locals 9
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
            ">;)",
            "Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;"
        }
    .end annotation

    .line 62
    new-instance v8, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;-><init>(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v8
.end method

.method public static provideQonversionRepository(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Lretrofit2/Retrofit;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;)Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;
    .locals 0

    .line 68
    invoke-virtual/range {p0 .. p6}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;->provideQonversionRepository(Lretrofit2/Retrofit;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;)Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;
    .locals 7

    .line 54
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->retrofitProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lretrofit2/Retrofit;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->environmentProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->configProvider:Ljavax/inject/Provider;

    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qonversion/android/sdk/internal/InternalConfig;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->loggerProvider:Ljavax/inject/Provider;

    invoke-interface {v4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/qonversion/android/sdk/internal/logger/Logger;

    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->apiErrorMapperProvider:Ljavax/inject/Provider;

    invoke-interface {v5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->delayCalculatorProvider:Ljavax/inject/Provider;

    invoke-interface {v6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;

    invoke-static/range {v0 .. v6}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->provideQonversionRepository(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Lretrofit2/Retrofit;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/logger/Logger;Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;)Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideQonversionRepositoryFactory;->get()Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    move-result-object v0

    return-object v0
.end method
