.class public final Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;
.super Ljava/lang/Object;
.source "NetworkInterceptor.kt"

# interfaces
.implements Lokhttp3/Interceptor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001f\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;",
        "Lokhttp3/Interceptor;",
        "headersProvider",
        "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;",
        "apiHelper",
        "Lcom/qonversion/android/sdk/internal/api/ApiHelper;",
        "config",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "(Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/qonversion/android/sdk/internal/api/ApiHelper;Lcom/qonversion/android/sdk/internal/InternalConfig;)V",
        "intercept",
        "Lokhttp3/Response;",
        "chain",
        "Lokhttp3/Interceptor$Chain;",
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
.field public static final Companion:Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor$Companion;

.field private static final FATAL_ERRORS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final apiHelper:Lcom/qonversion/android/sdk/internal/api/ApiHelper;

.field private final config:Lcom/qonversion/android/sdk/internal/InternalConfig;

.field private final headersProvider:Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;->Companion:Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor$Companion;

    const/4 v0, 0x3

    .line 46
    new-array v0, v0, [Ljava/lang/Integer;

    const/16 v1, 0x191

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/16 v1, 0x192

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/16 v1, 0x193

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;->FATAL_ERRORS:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/qonversion/android/sdk/internal/api/ApiHelper;Lcom/qonversion/android/sdk/internal/InternalConfig;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "headersProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;->headersProvider:Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    .line 14
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;->apiHelper:Lcom/qonversion/android/sdk/internal/api/ApiHelper;

    .line 15
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;->config:Lcom/qonversion/android/sdk/internal/InternalConfig;

    return-void
.end method


# virtual methods
.method public intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;->config:Lcom/qonversion/android/sdk/internal/InternalConfig;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getFatalError()Lcom/qonversion/android/sdk/internal/HttpError;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 23
    new-instance v1, Lokhttp3/Response$Builder;

    invoke-direct {v1}, Lokhttp3/Response$Builder;-><init>()V

    .line 24
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/HttpError;->getCode()I

    move-result v2

    invoke-virtual {v1, v2}, Lokhttp3/Response$Builder;->code(I)Lokhttp3/Response$Builder;

    move-result-object v1

    const/4 v2, 0x0

    .line 25
    const-string v3, ""

    invoke-static {v2, v3}, Lokhttp3/ResponseBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/ResponseBody;

    move-result-object v2

    invoke-virtual {v1, v2}, Lokhttp3/Response$Builder;->body(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    move-result-object v1

    .line 26
    sget-object v2, Lokhttp3/Protocol;->HTTP_2:Lokhttp3/Protocol;

    invoke-virtual {v1, v2}, Lokhttp3/Response$Builder;->protocol(Lokhttp3/Protocol;)Lokhttp3/Response$Builder;

    move-result-object v1

    .line 27
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/HttpError;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lokhttp3/Response$Builder;->message(Ljava/lang/String;)Lokhttp3/Response$Builder;

    move-result-object v0

    .line 28
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    move-result-object p1

    invoke-virtual {v0, p1}, Lokhttp3/Response$Builder;->request(Lokhttp3/Request;)Lokhttp3/Response$Builder;

    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    move-result-object p1

    .line 22
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p1

    .line 31
    :cond_0
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lokhttp3/Request;->newBuilder()Lokhttp3/Request$Builder;

    move-result-object v1

    .line 33
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;->headersProvider:Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    invoke-virtual {v0}, Lokhttp3/Request;->headers()Lokhttp3/Headers;

    move-result-object v0

    const-string v3, "headers(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->getHeaders(Lokhttp3/Headers;)Lokhttp3/Headers;

    move-result-object v0

    invoke-virtual {v1, v0}, Lokhttp3/Request$Builder;->headers(Lokhttp3/Headers;)Lokhttp3/Request$Builder;

    move-result-object v0

    .line 34
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v0

    .line 36
    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object p1

    .line 37
    sget-object v1, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;->FATAL_ERRORS:Ljava/util/List;

    invoke-virtual {p1}, Lokhttp3/Response;->code()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;->apiHelper:Lcom/qonversion/android/sdk/internal/api/ApiHelper;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, Lcom/qonversion/android/sdk/internal/api/ApiHelper;->isDeprecatedEndpoint(Lokhttp3/Request;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 38
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/api/NetworkInterceptor;->config:Lcom/qonversion/android/sdk/internal/InternalConfig;

    new-instance v1, Lcom/qonversion/android/sdk/internal/HttpError;

    invoke-virtual {p1}, Lokhttp3/Response;->code()I

    move-result v2

    invoke-virtual {p1}, Lokhttp3/Response;->message()Ljava/lang/String;

    move-result-object v3

    const-string v4, "message(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2, v3}, Lcom/qonversion/android/sdk/internal/HttpError;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/InternalConfig;->setFatalError(Lcom/qonversion/android/sdk/internal/HttpError;)V

    .line 41
    :cond_1
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object p1
.end method
