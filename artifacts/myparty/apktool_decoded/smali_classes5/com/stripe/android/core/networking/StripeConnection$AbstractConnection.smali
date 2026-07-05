.class public abstract Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;
.super Ljava/lang/Object;
.source "StripeConnection.kt"

# interfaces
.implements Lcom/stripe/android/core/networking/StripeConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/core/networking/StripeConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AbstractConnection"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResponseBodyType:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/stripe/android/core/networking/StripeConnection<",
        "TResponseBodyType;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\'\u0018\u0000 \u0015*\u0004\u0008\u0001\u0010\u00012\u0008\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0008\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u001a\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u000c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;",
        "ResponseBodyType",
        "Lcom/stripe/android/core/networking/StripeConnection;",
        "conn",
        "Ljavax/net/ssl/HttpsURLConnection;",
        "<init>",
        "(Ljavax/net/ssl/HttpsURLConnection;)V",
        "responseCode",
        "",
        "getResponseCode",
        "()I",
        "response",
        "Lcom/stripe/android/core/networking/StripeResponse;",
        "getResponse",
        "()Lcom/stripe/android/core/networking/StripeResponse;",
        "responseStream",
        "Ljava/io/InputStream;",
        "getResponseStream",
        "()Ljava/io/InputStream;",
        "close",
        "",
        "Companion",
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
.field private static final CHARSET:Ljava/lang/String;

.field public static final Companion:Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection$Companion;


# instance fields
.field private final conn:Ljavax/net/ssl/HttpsURLConnection;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->Companion:Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection$Companion;

    .line 63
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->CHARSET:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljavax/net/ssl/HttpsURLConnection;)V
    .locals 1

    const-string v0, "conn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->conn:Ljavax/net/ssl/HttpsURLConnection;

    return-void
.end method

.method public static final synthetic access$getCHARSET$cp()Ljava/lang/String;
    .locals 1

    .line 24
    sget-object v0, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->CHARSET:Ljava/lang/String;

    return-object v0
.end method

.method private final getResponseStream()Ljava/io/InputStream;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 50
    invoke-virtual {p0}, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->getResponseCode()I

    move-result v0

    const/16 v1, 0xc8

    if-gt v1, v0, :cond_0

    const/16 v1, 0x12c

    if-ge v0, v1, :cond_0

    .line 51
    iget-object v0, p0, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->conn:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    return-object v0

    .line 53
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->conn:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 58
    invoke-direct {p0}, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->getResponseStream()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 59
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->conn:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    return-void
.end method

.method public synthetic getResponse()Lcom/stripe/android/core/networking/StripeResponse;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 39
    invoke-virtual {p0}, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->getResponseCode()I

    move-result v0

    .line 40
    new-instance v1, Lcom/stripe/android/core/networking/StripeResponse;

    .line 42
    invoke-direct {p0}, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->getResponseStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->createBodyFromResponseStream(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v2

    .line 43
    iget-object v3, p0, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->conn:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v3}, Ljavax/net/ssl/HttpsURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v3

    const-string v4, "getHeaderFields(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/core/networking/StripeResponse;-><init>(ILjava/lang/Object;Ljava/util/Map;)V

    return-object v1
.end method

.method public synthetic getResponseCode()I
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;->conn:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getResponseCode()I

    move-result v0

    return v0
.end method
