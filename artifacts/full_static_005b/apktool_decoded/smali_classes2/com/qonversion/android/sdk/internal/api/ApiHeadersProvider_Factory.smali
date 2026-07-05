.class public final Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider_Factory;
.super Ljava/lang/Object;
.source "ApiHeadersProvider_Factory.java"

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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider_Factory;->configProvider:Ljavax/inject/Provider;

    .line 29
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider_Factory;->sharedPreferencesCacheProvider:Ljavax/inject/Provider;

    .line 30
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider_Factory;->environmentProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/InternalConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/EnvironmentProvider;",
            ">;)",
            "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider_Factory;"
        }
    .end annotation

    .line 41
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider_Factory;

    invoke-direct {v0, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider_Factory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;)Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;
    .locals 1

    .line 46
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    invoke-direct {v0, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;-><init>(Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;
    .locals 4

    .line 35
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider_Factory;->configProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/InternalConfig;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider_Factory;->sharedPreferencesCacheProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider_Factory;->environmentProvider:Ljavax/inject/Provider;

    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

    invoke-direct {v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;-><init>(Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/EnvironmentProvider;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider_Factory;->get()Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    move-result-object v0

    return-object v0
.end method
