.class public final Lcom/stripe/android/core/networking/ConnectionFactory$Default;
.super Ljava/lang/Object;
.source "ConnectionFactory.kt"

# interfaces
.implements Lcom/stripe/android/core/networking/ConnectionFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/core/networking/ConnectionFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Default"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nConnectionFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionFactory.kt\ncom/stripe/android/core/networking/ConnectionFactory$Default\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n216#2,2:101\n216#2,2:103\n1#3:105\n*S KotlinDebug\n*F\n+ 1 ConnectionFactory.kt\ncom/stripe/android/core/networking/ConnectionFactory$Default\n*L\n80#1:101,2\n86#1:103,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001e\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\t\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/ConnectionFactory$Default;",
        "Lcom/stripe/android/core/networking/ConnectionFactory;",
        "<init>",
        "()V",
        "connectionOpener",
        "Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;",
        "getConnectionOpener",
        "()Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;",
        "setConnectionOpener",
        "(Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;)V",
        "create",
        "Lcom/stripe/android/core/networking/StripeConnection;",
        "",
        "request",
        "Lcom/stripe/android/core/networking/StripeRequest;",
        "createForFile",
        "Ljava/io/File;",
        "outputFile",
        "openConnectionAndApplyFields",
        "Ljavax/net/ssl/HttpsURLConnection;",
        "originalRequest",
        "stripe-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/core/networking/ConnectionFactory$Default;

.field private static volatile connectionOpener:Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;


# direct methods
.method public static synthetic $r8$lambda$9JrVqMVNHlIohzAK-x1WOC0PXqo(Ljava/net/HttpURLConnection;Lcom/stripe/android/core/networking/StripeRequest;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/core/networking/ConnectionFactory$Default;->openConnectionAndApplyFields$lambda$3(Ljava/net/HttpURLConnection;Lcom/stripe/android/core/networking/StripeRequest;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/core/networking/ConnectionFactory$Default;

    invoke-direct {v0}, Lcom/stripe/android/core/networking/ConnectionFactory$Default;-><init>()V

    sput-object v0, Lcom/stripe/android/core/networking/ConnectionFactory$Default;->INSTANCE:Lcom/stripe/android/core/networking/ConnectionFactory$Default;

    .line 53
    sget-object v0, Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener$Default;->INSTANCE:Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener$Default;

    check-cast v0, Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;

    sput-object v0, Lcom/stripe/android/core/networking/ConnectionFactory$Default;->connectionOpener:Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final openConnectionAndApplyFields(Lcom/stripe/android/core/networking/StripeRequest;)Ljavax/net/ssl/HttpsURLConnection;
    .locals 2

    .line 74
    sget-object v0, Lcom/stripe/android/core/networking/ConnectionFactory$Default;->connectionOpener:Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;

    new-instance v1, Lcom/stripe/android/core/networking/ConnectionFactory$Default$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/stripe/android/core/networking/ConnectionFactory$Default$$ExternalSyntheticLambda0;-><init>()V

    invoke-interface {v0, p1, v1}, Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;->open(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/jvm/functions/Function2;)Ljavax/net/ssl/HttpsURLConnection;

    move-result-object p1

    return-object p1
.end method

.method private static final openConnectionAndApplyFields$lambda$3(Ljava/net/HttpURLConnection;Lcom/stripe/android/core/networking/StripeRequest;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$open"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    invoke-static {}, Lcom/stripe/android/core/networking/ConnectionFactory$Companion;->access$getCONNECT_TIMEOUT$p()I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 76
    invoke-static {}, Lcom/stripe/android/core/networking/ConnectionFactory$Companion;->access$getREAD_TIMEOUT$p()I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 77
    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeRequest;->getShouldCache()Z

    move-result v0

    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 78
    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeRequest;->getMethod()Lcom/stripe/android/core/networking/StripeRequest$Method;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/StripeRequest$Method;->getCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 80
    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeRequest;->getHeaders()Ljava/util/Map;

    move-result-object v0

    .line 101
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 80
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 81
    invoke-virtual {p0, v2, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 84
    :cond_0
    sget-object v0, Lcom/stripe/android/core/networking/StripeRequest$Method;->POST:Lcom/stripe/android/core/networking/StripeRequest$Method;

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeRequest;->getMethod()Lcom/stripe/android/core/networking/StripeRequest$Method;

    move-result-object v1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    .line 85
    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 86
    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeRequest;->getPostHeaders()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 103
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 86
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 87
    invoke-virtual {p0, v2, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 89
    :cond_1
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p0

    check-cast p0, Ljava/io/Closeable;

    :try_start_0
    move-object v0, p0

    check-cast v0, Ljava/io/OutputStream;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lcom/stripe/android/core/networking/StripeRequest;->writePostBody(Ljava/io/OutputStream;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {p0, p1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    .line 91
    :cond_2
    :goto_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public synthetic create(Lcom/stripe/android/core/networking/StripeRequest;)Lcom/stripe/android/core/networking/StripeConnection;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/stripe/android/core/exception/InvalidRequestException;
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    new-instance v0, Lcom/stripe/android/core/networking/StripeConnection$Default;

    invoke-direct {p0, p1}, Lcom/stripe/android/core/networking/ConnectionFactory$Default;->openConnectionAndApplyFields(Lcom/stripe/android/core/networking/StripeRequest;)Ljavax/net/ssl/HttpsURLConnection;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/stripe/android/core/networking/StripeConnection$Default;-><init>(Ljavax/net/ssl/HttpsURLConnection;)V

    check-cast v0, Lcom/stripe/android/core/networking/StripeConnection;

    return-object v0
.end method

.method public createForFile(Lcom/stripe/android/core/networking/StripeRequest;Ljava/io/File;)Lcom/stripe/android/core/networking/StripeConnection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/StripeRequest;",
            "Ljava/io/File;",
            ")",
            "Lcom/stripe/android/core/networking/StripeConnection<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outputFile"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    new-instance v0, Lcom/stripe/android/core/networking/StripeConnection$FileConnection;

    .line 66
    invoke-direct {p0, p1}, Lcom/stripe/android/core/networking/ConnectionFactory$Default;->openConnectionAndApplyFields(Lcom/stripe/android/core/networking/StripeRequest;)Ljavax/net/ssl/HttpsURLConnection;

    move-result-object p1

    .line 65
    invoke-direct {v0, p1, p2}, Lcom/stripe/android/core/networking/StripeConnection$FileConnection;-><init>(Ljavax/net/ssl/HttpsURLConnection;Ljava/io/File;)V

    check-cast v0, Lcom/stripe/android/core/networking/StripeConnection;

    return-object v0
.end method

.method public final getConnectionOpener()Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;
    .locals 1

    .line 52
    sget-object v0, Lcom/stripe/android/core/networking/ConnectionFactory$Default;->connectionOpener:Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;

    return-object v0
.end method

.method public final setConnectionOpener(Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    sput-object p1, Lcom/stripe/android/core/networking/ConnectionFactory$Default;->connectionOpener:Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;

    return-void
.end method
