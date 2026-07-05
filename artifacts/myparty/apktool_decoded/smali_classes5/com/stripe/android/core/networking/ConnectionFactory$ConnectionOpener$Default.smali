.class public final Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener$Default;
.super Ljava/lang/Object;
.source "ConnectionFactory.kt"

# interfaces
.implements Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Default"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J>\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072,\u0010\u0008\u001a(\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\u0006\u0012\u0004\u0012\u00020\r0\t\u00a2\u0006\u0002\u0008\u000eH\u0016\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener$Default;",
        "Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;",
        "<init>",
        "()V",
        "open",
        "Ljavax/net/ssl/HttpsURLConnection;",
        "request",
        "Lcom/stripe/android/core/networking/StripeRequest;",
        "callback",
        "Lkotlin/Function2;",
        "Ljava/net/HttpURLConnection;",
        "Lkotlin/ParameterName;",
        "name",
        "",
        "Lkotlin/ExtensionFunctionType;",
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
.field public static final INSTANCE:Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener$Default;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener$Default;

    invoke-direct {v0}, Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener$Default;-><init>()V

    sput-object v0, Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener$Default;->INSTANCE:Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener$Default;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public open(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/jvm/functions/Function2;)Ljavax/net/ssl/HttpsURLConnection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/StripeRequest;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/net/HttpURLConnection;",
            "-",
            "Lcom/stripe/android/core/networking/StripeRequest;",
            "Lkotlin/Unit;",
            ">;)",
            "Ljavax/net/ssl/HttpsURLConnection;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    new-instance v0, Ljava/net/URL;

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeRequest;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    .line 44
    invoke-interface {p2, v0, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
