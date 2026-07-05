.class public final Lexpo/modules/fetch/NativeRequest;
.super Lexpo/modules/kotlin/sharedobjects/SharedObject;
.source "NativeRequest.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0006\u0010\u0018\u001a\u00020\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lexpo/modules/fetch/NativeRequest;",
        "Lexpo/modules/kotlin/sharedobjects/SharedObject;",
        "appContext",
        "Lexpo/modules/kotlin/AppContext;",
        "response",
        "Lexpo/modules/fetch/NativeResponse;",
        "<init>",
        "(Lexpo/modules/kotlin/AppContext;Lexpo/modules/fetch/NativeResponse;)V",
        "getResponse$expo_release",
        "()Lexpo/modules/fetch/NativeResponse;",
        "requestHolder",
        "Lexpo/modules/fetch/RequestHolder;",
        "task",
        "Lokhttp3/Call;",
        "start",
        "",
        "client",
        "Lokhttp3/OkHttpClient;",
        "url",
        "Ljava/net/URL;",
        "requestInit",
        "Lexpo/modules/fetch/NativeRequestInit;",
        "requestBody",
        "",
        "cancel",
        "expo_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final requestHolder:Lexpo/modules/fetch/RequestHolder;

.field private final response:Lexpo/modules/fetch/NativeResponse;

.field private task:Lokhttp3/Call;


# direct methods
.method public constructor <init>(Lexpo/modules/kotlin/AppContext;Lexpo/modules/fetch/NativeResponse;)V
    .locals 1

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/sharedobjects/SharedObject;-><init>(Lexpo/modules/kotlin/AppContext;)V

    .line 19
    iput-object p2, p0, Lexpo/modules/fetch/NativeRequest;->response:Lexpo/modules/fetch/NativeResponse;

    .line 21
    new-instance p1, Lexpo/modules/fetch/RequestHolder;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lexpo/modules/fetch/RequestHolder;-><init>(Lokhttp3/Request;)V

    iput-object p1, p0, Lexpo/modules/fetch/NativeRequest;->requestHolder:Lexpo/modules/fetch/RequestHolder;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 63
    iget-object v0, p0, Lexpo/modules/fetch/NativeRequest;->task:Lokhttp3/Call;

    if-nez v0, :cond_0

    return-void

    .line 64
    :cond_0
    invoke-interface {v0}, Lokhttp3/Call;->cancel()V

    .line 65
    iget-object v0, p0, Lexpo/modules/fetch/NativeRequest;->response:Lexpo/modules/fetch/NativeResponse;

    invoke-virtual {v0}, Lexpo/modules/fetch/NativeResponse;->emitRequestCanceled()V

    return-void
.end method

.method public final getResponse$expo_release()Lexpo/modules/fetch/NativeResponse;
    .locals 1

    .line 19
    iget-object v0, p0, Lexpo/modules/fetch/NativeRequest;->response:Lexpo/modules/fetch/NativeResponse;

    return-object v0
.end method

.method public final start(Lokhttp3/OkHttpClient;Ljava/net/URL;Lexpo/modules/fetch/NativeRequestInit;[B)V
    .locals 11

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestInit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-virtual {p1}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    move-result-object p1

    .line 26
    invoke-virtual {p3}, Lexpo/modules/fetch/NativeRequestInit;->getCredentials()Lexpo/modules/fetch/NativeRequestCredentials;

    move-result-object v0

    sget-object v1, Lexpo/modules/fetch/NativeRequestCredentials;->INCLUDE:Lexpo/modules/fetch/NativeRequestCredentials;

    if-eq v0, v1, :cond_0

    .line 27
    sget-object v0, Lokhttp3/CookieJar;->NO_COOKIES:Lokhttp3/CookieJar;

    invoke-virtual {p1, v0}, Lokhttp3/OkHttpClient$Builder;->cookieJar(Lokhttp3/CookieJar;)Lokhttp3/OkHttpClient$Builder;

    .line 29
    :cond_0
    invoke-virtual {p3}, Lexpo/modules/fetch/NativeRequestInit;->getRedirect()Lexpo/modules/fetch/NativeRequestRedirect;

    move-result-object v0

    sget-object v1, Lexpo/modules/fetch/NativeRequestRedirect;->FOLLOW:Lexpo/modules/fetch/NativeRequestRedirect;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    .line 30
    invoke-virtual {p1, v2}, Lokhttp3/OkHttpClient$Builder;->followRedirects(Z)Lokhttp3/OkHttpClient$Builder;

    .line 31
    invoke-virtual {p1, v2}, Lokhttp3/OkHttpClient$Builder;->followSslRedirects(Z)Lokhttp3/OkHttpClient$Builder;

    .line 34
    :cond_1
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object p1

    .line 35
    iget-object v0, p0, Lexpo/modules/fetch/NativeRequest;->response:Lexpo/modules/fetch/NativeResponse;

    invoke-virtual {p3}, Lexpo/modules/fetch/NativeRequestInit;->getRedirect()Lexpo/modules/fetch/NativeRequestRedirect;

    move-result-object v1

    invoke-virtual {v0, v1}, Lexpo/modules/fetch/NativeResponse;->setRedirectMode(Lexpo/modules/fetch/NativeRequestRedirect;)V

    .line 37
    invoke-virtual {p3}, Lexpo/modules/fetch/NativeRequestInit;->getHeaders()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lexpo/modules/fetch/RequestUtilsKt;->toHeaders(Ljava/util/List;)Lokhttp3/Headers;

    move-result-object v0

    .line 38
    const-string v1, "Content-Type"

    invoke-virtual {v0, v1}, Lokhttp3/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    sget-object v4, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    invoke-virtual {v4, v1}, Lokhttp3/MediaType$Companion;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v1

    move-object v6, v1

    goto :goto_0

    :cond_2
    move-object v6, v3

    :goto_0
    if-eqz p4, :cond_3

    .line 39
    sget-object v4, Lokhttp3/RequestBody;->Companion:Lokhttp3/RequestBody$Companion;

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, p4

    invoke-static/range {v4 .. v10}, Lokhttp3/RequestBody$Companion;->create$default(Lokhttp3/RequestBody$Companion;[BLokhttp3/MediaType;IIILjava/lang/Object;)Lokhttp3/RequestBody;

    move-result-object p4

    if-nez p4, :cond_5

    :cond_3
    move-object p4, p0

    check-cast p4, Lexpo/modules/fetch/NativeRequest;

    .line 44
    invoke-static {}, Lexpo/modules/fetch/NativeRequestKt;->getMETHODS_REQUIRING_BODY()[Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3}, Lexpo/modules/fetch/NativeRequestInit;->getMethod()Ljava/lang/String;

    move-result-object v1

    invoke-static {p4, v1}, Lkotlin/collections/ArraysKt;->contains([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_4

    .line 45
    sget-object v4, Lokhttp3/RequestBody;->Companion:Lokhttp3/RequestBody$Companion;

    const/4 p4, 0x1

    new-array v5, p4, [B

    aput-byte v2, v5, v2

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lokhttp3/RequestBody$Companion;->create$default(Lokhttp3/RequestBody$Companion;[BLokhttp3/MediaType;IIILjava/lang/Object;)Lokhttp3/RequestBody;

    move-result-object v3

    :cond_4
    move-object p4, v3

    .line 50
    :cond_5
    new-instance v1, Lokhttp3/Request$Builder;

    invoke-direct {v1}, Lokhttp3/Request$Builder;-><init>()V

    .line 51
    invoke-virtual {v1, v0}, Lokhttp3/Request$Builder;->headers(Lokhttp3/Headers;)Lokhttp3/Request$Builder;

    move-result-object v0

    .line 52
    invoke-virtual {p3}, Lexpo/modules/fetch/NativeRequestInit;->getMethod()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3, p4}, Lokhttp3/Request$Builder;->method(Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    move-result-object p3

    .line 53
    sget-object p4, Lexpo/modules/fetch/OkHttpFileUrlInterceptor;->Companion:Lexpo/modules/fetch/OkHttpFileUrlInterceptor$Companion;

    invoke-virtual {p4, p2}, Lexpo/modules/fetch/OkHttpFileUrlInterceptor$Companion;->handleFileUrl(Ljava/net/URL;)Ljava/net/URL;

    move-result-object p2

    invoke-virtual {p3, p2}, Lokhttp3/Request$Builder;->url(Ljava/net/URL;)Lokhttp3/Request$Builder;

    move-result-object p2

    .line 54
    invoke-virtual {p2}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p2

    .line 55
    iget-object p3, p0, Lexpo/modules/fetch/NativeRequest;->requestHolder:Lexpo/modules/fetch/RequestHolder;

    invoke-virtual {p3, p2}, Lexpo/modules/fetch/RequestHolder;->setRequest(Lokhttp3/Request;)V

    .line 57
    invoke-virtual {p1, p2}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object p1

    iput-object p1, p0, Lexpo/modules/fetch/NativeRequest;->task:Lokhttp3/Call;

    if-eqz p1, :cond_6

    .line 58
    iget-object p2, p0, Lexpo/modules/fetch/NativeRequest;->response:Lexpo/modules/fetch/NativeResponse;

    check-cast p2, Lokhttp3/Callback;

    invoke-interface {p1, p2}, Lokhttp3/Call;->enqueue(Lokhttp3/Callback;)V

    .line 59
    :cond_6
    iget-object p1, p0, Lexpo/modules/fetch/NativeRequest;->response:Lexpo/modules/fetch/NativeResponse;

    invoke-virtual {p1}, Lexpo/modules/fetch/NativeResponse;->onStarted()V

    return-void
.end method
