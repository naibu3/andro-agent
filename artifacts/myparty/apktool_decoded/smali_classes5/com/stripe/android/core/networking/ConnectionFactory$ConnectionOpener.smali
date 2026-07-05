.class public interface abstract Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;
.super Ljava/lang/Object;
.source "ConnectionFactory.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/core/networking/ConnectionFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ConnectionOpener"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener$Default;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00e7\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\rJ>\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052,\u0010\u0006\u001a(\u0012\u0004\u0012\u00020\u0008\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u0004\u0012\u0004\u0012\u00020\u000b0\u0007\u00a2\u0006\u0002\u0008\u000cH&\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/ConnectionFactory$ConnectionOpener;",
        "",
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
        "Default",
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


# virtual methods
.method public abstract open(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/jvm/functions/Function2;)Ljavax/net/ssl/HttpsURLConnection;
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
.end method
