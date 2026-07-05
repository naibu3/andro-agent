.class public final Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionExtensionsKt;
.super Ljava/lang/Object;
.source "FinancialConnectionsSessionExtensions.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u00a8\u0006\u0008"
    }
    d2 = {
        "update",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
        "manifest",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
        "usesMicrodeposits",
        "",
        "setUsesMicrodepositsIfNeeded",
        "Lcom/stripe/android/financialconnections/model/PaymentAccount;",
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
.method private static final setUsesMicrodepositsIfNeeded(Lcom/stripe/android/financialconnections/model/PaymentAccount;Z)Lcom/stripe/android/financialconnections/model/PaymentAccount;
    .locals 9

    .line 32
    instance-of v0, p0, Lcom/stripe/android/financialconnections/model/BankAccount;

    if-eqz v0, :cond_0

    move-object v1, p0

    check-cast v1, Lcom/stripe/android/financialconnections/model/BankAccount;

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v6, p1

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/financialconnections/model/BankAccount;->copy$default(Lcom/stripe/android/financialconnections/model/BankAccount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/BankAccount;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/financialconnections/model/PaymentAccount;

    return-object p0

    .line 33
    :cond_0
    instance-of p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    if-eqz p1, :cond_1

    return-object p0

    .line 31
    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final update(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;
    .locals 14

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 10
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getManualEntryUsesMicrodeposits()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getPaymentAccount()Lcom/stripe/android/financialconnections/model/PaymentAccount;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0, p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionExtensionsKt;->setUsesMicrodepositsIfNeeded(Lcom/stripe/android/financialconnections/model/PaymentAccount;Z)Lcom/stripe/android/financialconnections/model/PaymentAccount;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    move-object v6, p1

    const/16 v12, 0x7df

    const/4 v13, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    .line 11
    invoke-static/range {v0 .. v13}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->copy$default(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    move-result-object p0

    return-object p0
.end method

.method public static final update(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Z)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;
    .locals 14

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getPaymentAccount()Lcom/stripe/android/financialconnections/model/PaymentAccount;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionExtensionsKt;->setUsesMicrodepositsIfNeeded(Lcom/stripe/android/financialconnections/model/PaymentAccount;Z)Lcom/stripe/android/financialconnections/model/PaymentAccount;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move-object v6, p1

    const/16 v12, 0x7df

    const/4 v13, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    .line 23
    invoke-static/range {v0 .. v13}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->copy$default(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    move-result-object p0

    return-object p0
.end method
