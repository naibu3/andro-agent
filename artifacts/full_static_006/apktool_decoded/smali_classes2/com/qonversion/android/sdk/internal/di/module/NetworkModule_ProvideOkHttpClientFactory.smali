.class public final Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideOkHttpClientFactory;
.super Ljava/lang/Object;
.source "NetworkModule_ProvideOkHttpClientFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lokhttp3/OkHttpClient;",
        ">;"
    }
.end annotation


# instance fields
.field private final contextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private final interceptorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;",
            "Ljavax/inject/Provider<",
            "Landroid/app/Application;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;",
            ">;)V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideOkHttpClientFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

    .line 29
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideOkHttpClientFactory;->contextProvider:Ljavax/inject/Provider;

    .line 30
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideOkHttpClientFactory;->interceptorProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideOkHttpClientFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;",
            "Ljavax/inject/Provider<",
            "Landroid/app/Application;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;",
            ">;)",
            "Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideOkHttpClientFactory;"
        }
    .end annotation

    .line 40
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideOkHttpClientFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideOkHttpClientFactory;-><init>(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideOkHttpClient(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Landroid/app/Application;Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;)Lokhttp3/OkHttpClient;
    .locals 0

    .line 45
    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;->provideOkHttpClient(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;)Lokhttp3/OkHttpClient;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lokhttp3/OkHttpClient;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideOkHttpClientFactory;->get()Lokhttp3/OkHttpClient;

    move-result-object v0

    return-object v0
.end method

.method public get()Lokhttp3/OkHttpClient;
    .locals 3

    .line 35
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideOkHttpClientFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideOkHttpClientFactory;->contextProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Application;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideOkHttpClientFactory;->interceptorProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;

    invoke-static {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideOkHttpClientFactory;->provideOkHttpClient(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Landroid/app/Application;Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;)Lokhttp3/OkHttpClient;

    move-result-object v0

    return-object v0
.end method
