.class public abstract Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;
.super Lcom/stripe/android/core/exception/StripeException;
.source "FinancialConnectionsError.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0008\u0008!\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006BK\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u000fJ\u0008\u0010\u0014\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;",
        "Lcom/stripe/android/core/exception/StripeException;",
        "name",
        "",
        "stripeException",
        "<init>",
        "(Ljava/lang/String;Lcom/stripe/android/core/exception/StripeException;)V",
        "stripeError",
        "Lcom/stripe/android/core/StripeError;",
        "requestId",
        "statusCode",
        "",
        "cause",
        "",
        "message",
        "(Ljava/lang/String;Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V",
        "getName",
        "()Ljava/lang/String;",
        "getStripeException",
        "()Lcom/stripe/android/core/exception/StripeException;",
        "analyticsValue",
        "financial-connections_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final name:Ljava/lang/String;

.field private final stripeException:Lcom/stripe/android/core/exception/StripeException;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V
    .locals 7

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    new-instance v1, Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError$1;

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError$1;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V

    check-cast v1, Lcom/stripe/android/core/exception/StripeException;

    .line 29
    invoke-direct {p0, p1, v1}, Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;-><init>(Ljava/lang/String;Lcom/stripe/android/core/exception/StripeException;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x2

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_2

    const/4 p4, 0x0

    :cond_2
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_3

    move-object p5, v0

    :cond_3
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    if-eqz p2, :cond_4

    .line 28
    invoke-virtual {p2}, Lcom/stripe/android/core/StripeError;->getMessage()Ljava/lang/String;

    move-result-object p6

    goto :goto_0

    :cond_4
    move-object p6, v0

    :cond_5
    :goto_0
    move-object p7, p6

    move-object p6, p5

    move p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 22
    invoke-direct/range {p1 .. p7}, Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;-><init>(Ljava/lang/String;Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/core/exception/StripeException;)V
    .locals 7

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeException"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p2}, Lcom/stripe/android/core/exception/StripeException;->getStripeError()Lcom/stripe/android/core/StripeError;

    move-result-object v2

    .line 14
    invoke-virtual {p2}, Lcom/stripe/android/core/exception/StripeException;->getRequestId()Ljava/lang/String;

    move-result-object v3

    .line 15
    invoke-virtual {p2}, Lcom/stripe/android/core/exception/StripeException;->getStatusCode()I

    move-result v4

    .line 16
    invoke-virtual {p2}, Lcom/stripe/android/core/exception/StripeException;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    .line 17
    invoke-virtual {p2}, Lcom/stripe/android/core/exception/StripeException;->getMessage()Ljava/lang/String;

    move-result-object v6

    move-object v1, p0

    .line 12
    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/core/exception/StripeException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V

    .line 10
    iput-object p1, v1, Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;->name:Ljava/lang/String;

    .line 11
    iput-object p2, v1, Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;->stripeException:Lcom/stripe/android/core/exception/StripeException;

    return-void
.end method


# virtual methods
.method public analyticsValue()Ljava/lang/String;
    .locals 1

    .line 20
    const-string v0, "fcError"

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getStripeException()Lcom/stripe/android/core/exception/StripeException;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;->stripeException:Lcom/stripe/android/core/exception/StripeException;

    return-object v0
.end method
