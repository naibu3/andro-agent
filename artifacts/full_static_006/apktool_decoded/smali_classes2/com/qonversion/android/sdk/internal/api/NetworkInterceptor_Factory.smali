.class public final Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor_Factory;
.super Ljava/lang/Object;
.source "NetworkInterceptor_Factory.java"

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

.field private final headersProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;",
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
            "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/ApiHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/InternalConfig;",
            ">;)V"
        }
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor_Factory;->headersProvider:Ljavax/inject/Provider;

    .line 26
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor_Factory;->apiHelperProvider:Ljavax/inject/Provider;

    .line 27
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor_Factory;->configProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/ApiHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/InternalConfig;",
            ">;)",
            "Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor_Factory;"
        }
    .end annotation

    .line 37
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor_Factory;

    invoke-direct {v0, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor_Factory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/qonversion/android/sdk/internal/api/ApiHelper;Lcom/qonversion/android/sdk/internal/InternalConfig;)Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;
    .locals 1

    .line 42
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;

    invoke-direct {v0, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;-><init>(Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/qonversion/android/sdk/internal/api/ApiHelper;Lcom/qonversion/android/sdk/internal/InternalConfig;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;
    .locals 4

    .line 32
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor_Factory;->headersProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor_Factory;->apiHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/internal/api/ApiHelper;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor_Factory;->configProvider:Ljavax/inject/Provider;

    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qonversion/android/sdk/internal/InternalConfig;

    invoke-direct {v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;-><init>(Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/qonversion/android/sdk/internal/api/ApiHelper;Lcom/qonversion/android/sdk/internal/InternalConfig;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor_Factory;->get()Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;

    move-result-object v0

    return-object v0
.end method
