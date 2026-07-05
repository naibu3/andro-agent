.class public final Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSessionKt;
.super Ljava/lang/Object;
.source "CompleteFinancialConnectionsSession.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002\u00a8\u0006\u0005"
    }
    d2 = {
        "completionStatus",
        "",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
        "closeAuthFlowError",
        "",
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
.method public static final synthetic access$completionStatus(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSessionKt;->completionStatus(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final completionStatus(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 1

    .line 48
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getAccounts()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->getData()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getPaymentAccount()Lcom/stripe/android/financialconnections/model/PaymentAccount;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getBankAccountToken()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 52
    const-string p0, "failed"

    return-object p0

    .line 54
    :cond_1
    const-string p0, "canceled"

    return-object p0

    .line 50
    :cond_2
    :goto_0
    const-string p0, "completed"

    return-object p0
.end method
