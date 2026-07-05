.class public interface abstract Lcom/stripe/android/core/networking/StripeConnection;
.super Ljava/lang/Object;
.source "StripeConnection.kt"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;,
        Lcom/stripe/android/core/networking/StripeConnection$Default;,
        Lcom/stripe/android/core/networking/StripeConnection$FileConnection;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResponseBodyType:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Closeable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008g\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002:\u0003\u000f\u0010\u0011J\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH&\u00a2\u0006\u0002\u0010\u000eR\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0008X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/StripeConnection;",
        "ResponseBodyType",
        "Ljava/io/Closeable;",
        "responseCode",
        "",
        "getResponseCode",
        "()I",
        "response",
        "Lcom/stripe/android/core/networking/StripeResponse;",
        "getResponse",
        "()Lcom/stripe/android/core/networking/StripeResponse;",
        "createBodyFromResponseStream",
        "responseStream",
        "Ljava/io/InputStream;",
        "(Ljava/io/InputStream;)Ljava/lang/Object;",
        "AbstractConnection",
        "Default",
        "FileConnection",
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
.method public abstract createBodyFromResponseStream(Ljava/io/InputStream;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            ")TResponseBodyType;"
        }
    .end annotation
.end method

.method public abstract getResponse()Lcom/stripe/android/core/networking/StripeResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "TResponseBodyType;>;"
        }
    .end annotation
.end method

.method public abstract getResponseCode()I
.end method
