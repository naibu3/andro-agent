.class public final Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModelKt;
.super Ljava/lang/Object;
.source "AttachPaymentViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "canSetCustomLinkSuccessMessage",
        "",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
        "getCanSetCustomLinkSuccessMessage",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z",
        "financial-connections_release"
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
.method public static final synthetic access$getCanSetCustomLinkSuccessMessage(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModelKt;->getCanSetCustomLinkSuccessMessage(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z

    move-result p0

    return p0
.end method

.method private static final getCanSetCustomLinkSuccessMessage(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z
    .locals 3

    .line 149
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getAccountholderIsLinkConsumer()Ljava/lang/Boolean;

    move-result-object p0

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    return v1

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
