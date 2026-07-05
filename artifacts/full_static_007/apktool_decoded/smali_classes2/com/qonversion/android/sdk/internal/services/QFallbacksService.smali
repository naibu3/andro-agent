.class public final Lcom/qonversion/android/sdk/internal/services/QFallbacksService;
.super Ljava/lang/Object;
.source "QFallbacksService.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQFallbacksService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QFallbacksService.kt\ncom/qonversion/android/sdk/internal/services/QFallbacksService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u000fJ\u0008\u0010\u0013\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;",
        "",
        "context",
        "Landroid/app/Application;",
        "cacheConfigProvider",
        "Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;",
        "moshi",
        "Lcom/squareup/moshi/Moshi;",
        "logger",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;Lcom/squareup/moshi/Moshi;Lcom/qonversion/android/sdk/internal/logger/Logger;)V",
        "jsonAdapter",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lcom/qonversion/android/sdk/dto/QFallbackObject;",
        "convertStreamToString",
        "",
        "inputStream",
        "Ljava/io/InputStream;",
        "getStringFromFile",
        "obtainFallbackData",
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


# instance fields
.field private final cacheConfigProvider:Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;

.field private final context:Landroid/app/Application;

.field private final jsonAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lcom/qonversion/android/sdk/dto/QFallbackObject;",
            ">;"
        }
    .end annotation
.end field

.field private final logger:Lcom/qonversion/android/sdk/internal/logger/Logger;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;Lcom/squareup/moshi/Moshi;Lcom/qonversion/android/sdk/internal/logger/Logger;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cacheConfigProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moshi"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/services/QFallbacksService;->context:Landroid/app/Application;

    .line 17
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/services/QFallbacksService;->cacheConfigProvider:Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;

    .line 19
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/services/QFallbacksService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    .line 21
    const-class p1, Lcom/qonversion/android/sdk/dto/QFallbackObject;

    invoke-virtual {p3, p1}, Lcom/squareup/moshi/Moshi;->adapter(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    const-string p2, "adapter(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/services/QFallbacksService;->jsonAdapter:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method


# virtual methods
.method public final convertStreamToString(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-string v0, "inputStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    check-cast v1, Ljava/io/Reader;

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 38
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 41
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V

    .line 45
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getStringFromFile()Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 50
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QFallbacksService;->cacheConfigProvider:Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;

    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/provider/CacheConfigProvider;->getCacheConfig()Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/config/CacheConfig;->getFallbackFileIdentifier()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 52
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/services/QFallbacksService;->context:Landroid/app/Application;

    invoke-virtual {v1}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v0

    goto :goto_0

    .line 54
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/services/QFallbacksService;->context:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/app/Application;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "qonversion_android_fallbacks.json"

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    .line 51
    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 57
    invoke-virtual {p0, v0}, Lcom/qonversion/android/sdk/internal/services/QFallbacksService;->convertStreamToString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v1

    .line 58
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-object v1
.end method

.method public final obtainFallbackData()Lcom/qonversion/android/sdk/dto/QFallbackObject;
    .locals 4

    .line 25
    :try_start_0
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/services/QFallbacksService;->getStringFromFile()Ljava/lang/String;

    move-result-object v0

    .line 26
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/services/QFallbacksService;->jsonAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v1, v0}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/dto/QFallbackObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 30
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/services/QFallbacksService;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to parse Qonversion fallback file: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/qonversion/android/sdk/internal/logger/Logger;->warn(Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
