.class public final Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultKt;
.super Ljava/lang/Object;
.source "CollectBankAccountResult.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u00a8\u0006\u0003"
    }
    d2 = {
        "toUSBankAccountResult",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;",
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
.method public static final toUSBankAccountResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    instance-of v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Cancelled;

    if-eqz v0, :cond_0

    sget-object p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Cancelled;->INSTANCE:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Cancelled;

    check-cast p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;

    return-object p0

    .line 40
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;

    if-eqz v0, :cond_3

    .line 58
    check-cast p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;

    .line 41
    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;->getResponse()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->getUsBankAccountData()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;

    move-result-object v0

    if-nez v0, :cond_1

    .line 42
    new-instance p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Failed;

    .line 43
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "ACH payload cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    .line 42
    invoke-direct {p0, v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;

    return-object p0

    .line 48
    :cond_1
    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;->getResponse()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->getIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v0

    if-nez v0, :cond_2

    .line 49
    new-instance p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Failed;

    .line 50
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "StripeIntent cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    .line 49
    invoke-direct {p0, v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;

    return-object p0

    .line 55
    :cond_2
    new-instance v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Completed;

    .line 56
    new-instance v1, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponse;

    .line 57
    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;->getResponse()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->getIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v2

    .line 58
    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;->getResponse()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->getUsBankAccountData()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;->getFinancialConnectionsSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    move-result-object p0

    .line 56
    invoke-direct {v1, v2, p0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponse;-><init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V

    .line 55
    invoke-direct {v0, v1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Completed;-><init>(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponse;)V

    check-cast v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;

    return-object v0

    .line 64
    :cond_3
    instance-of v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Failed;

    if-eqz v0, :cond_4

    .line 65
    new-instance v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Failed;

    check-cast p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Failed;

    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Failed;->getError()Ljava/lang/Throwable;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;

    return-object v0

    .line 37
    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
