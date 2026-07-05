.class public final Lcom/stripe/android/model/CreateFinancialConnectionsSessionParamsKt;
.super Ljava/lang/Object;
.source "CreateFinancialConnectionsSessionParams.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00022\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "valueForHostedSurface",
        "",
        "Lcom/stripe/android/model/LinkMode;",
        "hostedSurface",
        "payments-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic access$valueForHostedSurface(Lcom/stripe/android/model/LinkMode;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParamsKt;->valueForHostedSurface(Lcom/stripe/android/model/LinkMode;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final valueForHostedSurface(Lcom/stripe/android/model/LinkMode;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_2

    if-eqz p0, :cond_1

    .line 75
    invoke-virtual {p0}, Lcom/stripe/android/model/LinkMode;->getValue()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    const-string p0, "LINK_DISABLED"

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method
