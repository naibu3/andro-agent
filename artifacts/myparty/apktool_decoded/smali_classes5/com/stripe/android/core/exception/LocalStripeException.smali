.class public final Lcom/stripe/android/core/exception/LocalStripeException;
.super Lcom/stripe/android/core/exception/StripeException;
.source "LocalStripeException.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0008\u0010\u0004\u001a\u00020\u0003H\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/core/exception/LocalStripeException;",
        "Lcom/stripe/android/core/exception/StripeException;",
        "displayMessage",
        "",
        "analyticsValue",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "getDisplayMessage",
        "()Ljava/lang/String;",
        "getAnalyticsValue",
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


# instance fields
.field private final analyticsValue:Ljava/lang/String;

.field private final displayMessage:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v5, p1

    .line 9
    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/core/exception/StripeException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    iput-object v5, v0, Lcom/stripe/android/core/exception/LocalStripeException;->displayMessage:Ljava/lang/String;

    .line 8
    iput-object p2, v0, Lcom/stripe/android/core/exception/LocalStripeException;->analyticsValue:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public analyticsValue()Ljava/lang/String;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/stripe/android/core/exception/LocalStripeException;->analyticsValue:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "unknown"

    :cond_0
    return-object v0
.end method

.method public final getAnalyticsValue()Ljava/lang/String;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/stripe/android/core/exception/LocalStripeException;->analyticsValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisplayMessage()Ljava/lang/String;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/stripe/android/core/exception/LocalStripeException;->displayMessage:Ljava/lang/String;

    return-object v0
.end method
