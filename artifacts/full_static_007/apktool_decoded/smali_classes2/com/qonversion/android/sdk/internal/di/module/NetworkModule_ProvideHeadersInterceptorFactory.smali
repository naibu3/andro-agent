.class public final Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;
.super Ljava/lang/Object;
.source "NetworkModule_ProvideHeadersInterceptorFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;",
        ">;"
    }
.end annotation


# instance fields
.field private final apiHeadersProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final apiHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/ApiHelper;",
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

.field private final module:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/InternalConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/ApiHelper;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

    .line 33
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;->apiHeadersProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;->configProvider:Ljavax/inject/Provider;

    .line 35
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;->apiHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/InternalConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/ApiHelper;",
            ">;)",
            "Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;"
        }
    .end annotation

    .line 46
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;-><init>(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideHeadersInterceptor(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/api/ApiHelper;)Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;
    .locals 0

    .line 51
    invoke-virtual {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;->provideHeadersInterceptor(Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/api/ApiHelper;)Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;
    .locals 4

    .line 40
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;->apiHeadersProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;->configProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/internal/InternalConfig;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;->apiHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qonversion/android/sdk/internal/api/ApiHelper;

    invoke-static {v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;->provideHeadersInterceptor(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/api/ApiHelper;)Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideHeadersInterceptorFactory;->get()Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;

    move-result-object v0

    return-object v0
.end method
