.class public final Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResultKt;
.super Ljava/lang/Object;
.source "CollectBankAccountForInstantDebitsResult.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "toInstantDebitsResult",
        "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult;",
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
.method public static final toInstantDebitsResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    instance-of v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Cancelled;

    if-eqz v0, :cond_0

    .line 39
    sget-object p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Cancelled;->INSTANCE:Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Cancelled;

    check-cast p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult;

    return-object p0

    .line 42
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;

    if-eqz v0, :cond_2

    .line 56
    check-cast p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;

    .line 44
    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;->getResponse()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->getInstantDebitsData()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;

    move-result-object v0

    if-nez v0, :cond_1

    .line 45
    new-instance p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Failed;

    .line 46
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "instant debits data cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    .line 45
    invoke-direct {p0, v0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult;

    return-object p0

    .line 51
    :cond_1
    new-instance v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Completed;

    .line 52
    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;->getResponse()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->getIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v1

    .line 53
    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;->getResponse()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->getInstantDebitsData()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v2

    .line 54
    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;->getResponse()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->getInstantDebitsData()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->getLast4()Ljava/lang/String;

    move-result-object v3

    .line 55
    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;->getResponse()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->getInstantDebitsData()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->getBankName()Ljava/lang/String;

    move-result-object v4

    .line 56
    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Completed;->getResponse()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;->getInstantDebitsData()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;->getEligibleForIncentive()Z

    move-result v5

    .line 51
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Completed;-><init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/String;Z)V

    check-cast v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult;

    return-object v0

    .line 62
    :cond_2
    instance-of v0, p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Failed;

    if-eqz v0, :cond_3

    .line 63
    new-instance v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Failed;

    check-cast p0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Failed;

    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResultInternal$Failed;->getError()Ljava/lang/Throwable;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast v0, Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountForInstantDebitsResult;

    return-object v0

    .line 37
    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
