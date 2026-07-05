.class public final Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;
.super Ljava/lang/Object;
.source "NetworkModule.kt"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/di/module/NetworkModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u0004H\u0007J\u0008\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0008H\u0007J\u0008\u0010\u0014\u001a\u00020\u0015H\u0007J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;",
        "",
        "()V",
        "provideApiHelper",
        "Lcom/qonversion/android/sdk/internal/api/ApiHelper;",
        "internalConfig",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "provideHeadersInterceptor",
        "Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;",
        "apiHeadersProvider",
        "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;",
        "config",
        "apiHelper",
        "provideMoshi",
        "Lcom/squareup/moshi/Moshi;",
        "provideOkHttpClient",
        "Lokhttp3/OkHttpClient;",
        "context",
        "Landroid/app/Application;",
        "interceptor",
        "provideRateLimiter",
        "Lcom/qonversion/android/sdk/internal/api/RateLimiter;",
        "provideRetrofit",
        "Lretrofit2/Retrofit;",
        "client",
        "moshi",
        "Companion",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final CACHE_SIZE:J = 0xa00010L

.field public static final Companion:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule$Companion;

.field private static final MAX_SIMILAR_API_REQUESTS_PER_SECOND:I = 0x5

.field private static final TIMEOUT:J = 0x1eL


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;->Companion:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final provideApiHelper(Lcom/qonversion/android/sdk/internal/InternalConfig;)Lcom/qonversion/android/sdk/internal/api/ApiHelper;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "internalConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/ApiHelper;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getApiUrl()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/qonversion/android/sdk/internal/api/ApiHelper;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final provideHeadersInterceptor(Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/api/ApiHelper;)Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "apiHeadersProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;

    invoke-direct {v0, p1, p3, p2}, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;-><init>(Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/qonversion/android/sdk/internal/api/ApiHelper;Lcom/qonversion/android/sdk/internal/InternalConfig;)V

    return-object v0
.end method

.method public final provideMoshi()Lcom/squareup/moshi/Moshi;
    .locals 2
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 56
    new-instance v0, Lcom/squareup/moshi/Moshi$Builder;

    invoke-direct {v0}, Lcom/squareup/moshi/Moshi$Builder;-><init>()V

    .line 57
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QDateAdapter;

    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QDateAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lcom/squareup/moshi/Moshi$Builder;->add(Ljava/lang/Object;)Lcom/squareup/moshi/Moshi$Builder;

    move-result-object v0

    .line 58
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QProductsAdapter;

    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QProductsAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lcom/squareup/moshi/Moshi$Builder;->add(Ljava/lang/Object;)Lcom/squareup/moshi/Moshi$Builder;

    move-result-object v0

    .line 59
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QPermissionsAdapter;

    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QPermissionsAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lcom/squareup/moshi/Moshi$Builder;->add(Ljava/lang/Object;)Lcom/squareup/moshi/Moshi$Builder;

    move-result-object v0

    .line 60
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QProductRenewStateAdapter;

    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QProductRenewStateAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lcom/squareup/moshi/Moshi$Builder;->add(Ljava/lang/Object;)Lcom/squareup/moshi/Moshi$Builder;

    move-result-object v0

    .line 61
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QEntitlementSourceAdapter;

    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QEntitlementSourceAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lcom/squareup/moshi/Moshi$Builder;->add(Ljava/lang/Object;)Lcom/squareup/moshi/Moshi$Builder;

    move-result-object v0

    .line 62
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QOfferingsAdapter;

    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QOfferingsAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lcom/squareup/moshi/Moshi$Builder;->add(Ljava/lang/Object;)Lcom/squareup/moshi/Moshi$Builder;

    move-result-object v0

    .line 63
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QOfferingAdapter;

    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QOfferingAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lcom/squareup/moshi/Moshi$Builder;->add(Ljava/lang/Object;)Lcom/squareup/moshi/Moshi$Builder;

    move-result-object v0

    .line 64
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QOfferingTagAdapter;

    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QOfferingTagAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lcom/squareup/moshi/Moshi$Builder;->add(Ljava/lang/Object;)Lcom/squareup/moshi/Moshi$Builder;

    move-result-object v0

    .line 65
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QRemoteConfigListAdapter;

    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QRemoteConfigListAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lcom/squareup/moshi/Moshi$Builder;->add(Ljava/lang/Object;)Lcom/squareup/moshi/Moshi$Builder;

    move-result-object v0

    .line 66
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QExperimentGroupTypeAdapter;

    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QExperimentGroupTypeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lcom/squareup/moshi/Moshi$Builder;->add(Ljava/lang/Object;)Lcom/squareup/moshi/Moshi$Builder;

    move-result-object v0

    .line 67
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QRemoteConfigurationSourceTypeAdapter;

    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QRemoteConfigurationSourceTypeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lcom/squareup/moshi/Moshi$Builder;->add(Ljava/lang/Object;)Lcom/squareup/moshi/Moshi$Builder;

    move-result-object v0

    .line 68
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QRemoteConfigurationSourceAssignmentTypeAdapter;

    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QRemoteConfigurationSourceAssignmentTypeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lcom/squareup/moshi/Moshi$Builder;->add(Ljava/lang/Object;)Lcom/squareup/moshi/Moshi$Builder;

    move-result-object v0

    .line 69
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QEligibilityStatusAdapter;

    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QEligibilityStatusAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lcom/squareup/moshi/Moshi$Builder;->add(Ljava/lang/Object;)Lcom/squareup/moshi/Moshi$Builder;

    move-result-object v0

    .line 70
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QEligibilityAdapter;

    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QEligibilityAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lcom/squareup/moshi/Moshi$Builder;->add(Ljava/lang/Object;)Lcom/squareup/moshi/Moshi$Builder;

    move-result-object v0

    .line 71
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QTransactionOwnershipTypeAdapter;

    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QTransactionOwnershipTypeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lcom/squareup/moshi/Moshi$Builder;->add(Ljava/lang/Object;)Lcom/squareup/moshi/Moshi$Builder;

    move-result-object v0

    .line 72
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QTransactionTypeAdapter;

    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QTransactionTypeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lcom/squareup/moshi/Moshi$Builder;->add(Ljava/lang/Object;)Lcom/squareup/moshi/Moshi$Builder;

    move-result-object v0

    .line 73
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QTransactionEnvironmentAdapter;

    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QTransactionEnvironmentAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lcom/squareup/moshi/Moshi$Builder;->add(Ljava/lang/Object;)Lcom/squareup/moshi/Moshi$Builder;

    move-result-object v0

    .line 74
    new-instance v1, Lcom/qonversion/android/sdk/internal/dto/QEntitlementGrantTypeAdapter;

    invoke-direct {v1}, Lcom/qonversion/android/sdk/internal/dto/QEntitlementGrantTypeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Lcom/squareup/moshi/Moshi$Builder;->add(Ljava/lang/Object;)Lcom/squareup/moshi/Moshi$Builder;

    move-result-object v0

    .line 75
    invoke-virtual {v0}, Lcom/squareup/moshi/Moshi$Builder;->build()Lcom/squareup/moshi/Moshi;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final provideOkHttpClient(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;)Lokhttp3/OkHttpClient;
    .locals 4
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interceptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 85
    new-instance v1, Lokhttp3/Cache;

    invoke-virtual {p1}, Landroid/app/Application;->getCacheDir()Ljava/io/File;

    move-result-object p1

    const-wide/32 v2, 0xa00010

    invoke-direct {v1, p1, v2, v3}, Lokhttp3/Cache;-><init>(Ljava/io/File;J)V

    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->cache(Lokhttp3/Cache;)Lokhttp3/OkHttpClient$Builder;

    move-result-object p1

    .line 86
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1e

    invoke-virtual {p1, v1, v2, v0}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object p1

    .line 87
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v1, v2, v0}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object p1

    .line 88
    check-cast p2, Lokhttp3/Interceptor;

    invoke-virtual {p1, p2}, Lokhttp3/OkHttpClient$Builder;->addInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    move-result-object p1

    .line 89
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object p1

    const-string p2, "build(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final provideRateLimiter()Lcom/qonversion/android/sdk/internal/api/RateLimiter;
    .locals 2
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 113
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/RateLimiter;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/api/RateLimiter;-><init>(I)V

    return-object v0
.end method

.method public final provideRetrofit(Lokhttp3/OkHttpClient;Lcom/squareup/moshi/Moshi;Lcom/qonversion/android/sdk/internal/InternalConfig;)Lretrofit2/Retrofit;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moshi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "internalConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    new-instance v0, Lretrofit2/Retrofit$Builder;

    invoke-direct {v0}, Lretrofit2/Retrofit$Builder;-><init>()V

    .line 47
    invoke-static {p2}, Lretrofit2/converter/moshi/MoshiConverterFactory;->create(Lcom/squareup/moshi/Moshi;)Lretrofit2/converter/moshi/MoshiConverterFactory;

    move-result-object p2

    check-cast p2, Lretrofit2/Converter$Factory;

    invoke-virtual {v0, p2}, Lretrofit2/Retrofit$Builder;->addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;

    move-result-object p2

    .line 48
    invoke-virtual {p3}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getApiUrl()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lretrofit2/Retrofit$Builder;->baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;

    move-result-object p2

    .line 49
    invoke-virtual {p2, p1}, Lretrofit2/Retrofit$Builder;->client(Lokhttp3/OkHttpClient;)Lretrofit2/Retrofit$Builder;

    move-result-object p1

    .line 50
    invoke-virtual {p1}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    move-result-object p1

    const-string p2, "build(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
