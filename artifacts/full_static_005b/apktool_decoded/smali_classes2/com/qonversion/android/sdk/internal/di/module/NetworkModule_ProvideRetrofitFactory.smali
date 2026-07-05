.class public final Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;
.super Ljava/lang/Object;
.source "NetworkModule_ProvideRetrofitFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lretrofit2/Retrofit;",
        ">;"
    }
.end annotation


# instance fields
.field private final clientProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lokhttp3/OkHttpClient;",
            ">;"
        }
    .end annotation
.end field

.field private final internalConfigProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/InternalConfig;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

.field private final moshiProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/squareup/moshi/Moshi;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;",
            "Ljavax/inject/Provider<",
            "Lokhttp3/OkHttpClient;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/squareup/moshi/Moshi;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/InternalConfig;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

    .line 33
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;->clientProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;->moshiProvider:Ljavax/inject/Provider;

    .line 35
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;->internalConfigProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;",
            "Ljavax/inject/Provider<",
            "Lokhttp3/OkHttpClient;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/squareup/moshi/Moshi;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/InternalConfig;",
            ">;)",
            "Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;"
        }
    .end annotation

    .line 46
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;-><init>(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideRetrofit(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Lokhttp3/OkHttpClient;Lcom/squareup/moshi/Moshi;Lcom/qonversion/android/sdk/internal/InternalConfig;)Lretrofit2/Retrofit;
    .locals 0

    .line 51
    invoke-virtual {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;->provideRetrofit(Lokhttp3/OkHttpClient;Lcom/squareup/moshi/Moshi;Lcom/qonversion/android/sdk/internal/InternalConfig;)Lretrofit2/Retrofit;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lretrofit2/Retrofit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;->get()Lretrofit2/Retrofit;

    move-result-object v0

    return-object v0
.end method

.method public get()Lretrofit2/Retrofit;
    .locals 4

    .line 40
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;->clientProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lokhttp3/OkHttpClient;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;->moshiProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/squareup/moshi/Moshi;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;->internalConfigProvider:Ljavax/inject/Provider;

    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qonversion/android/sdk/internal/InternalConfig;

    invoke-static {v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule_ProvideRetrofitFactory;->provideRetrofit(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Lokhttp3/OkHttpClient;Lcom/squareup/moshi/Moshi;Lcom/qonversion/android/sdk/internal/InternalConfig;)Lretrofit2/Retrofit;

    move-result-object v0

    return-object v0
.end method
