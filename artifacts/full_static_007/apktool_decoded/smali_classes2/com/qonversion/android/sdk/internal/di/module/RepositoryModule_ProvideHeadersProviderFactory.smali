.class public final Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideHeadersProviderFactory;
.super Ljava/lang/Object;
.source "RepositoryModule_ProvideHeadersProviderFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;",
        ">;"
    }
.end annotation


# instance fields
.field private final configProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/InternalConfig;",
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

.field private final module:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

.field private final sharedPreferencesCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/InternalConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/EnvironmentProvider;",
            ">;)V"
        }
    .end annotation

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideHeadersProviderFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    .line 34
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideHeadersProviderFactory;->configProvider:Ljavax/inject/Provider;

    .line 35
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideHeadersProviderFactory;->sharedPreferencesCacheProvider:Ljavax/inject/Provider;

    .line 36
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideHeadersProviderFactory;->environmentProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideHeadersProviderFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/InternalConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/EnvironmentProvider;",
            ">;)",
            "Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideHeadersProviderFactory;"
        }
    .end annotation

    .line 48
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideHeadersProviderFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideHeadersProviderFactory;-><init>(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideHeadersProvider(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;)Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;
    .locals 0

    .line 54
    invoke-virtual {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;->provideHeadersProvider(Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;)Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;
    .locals 4

    .line 41
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideHeadersProviderFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideHeadersProviderFactory;->configProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/InternalConfig;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideHeadersProviderFactory;->sharedPreferencesCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideHeadersProviderFactory;->environmentProvider:Ljavax/inject/Provider;

    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

    invoke-static {v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideHeadersProviderFactory;->provideHeadersProvider(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;)Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideHeadersProviderFactory;->get()Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    move-result-object v0

    return-object v0
.end method
