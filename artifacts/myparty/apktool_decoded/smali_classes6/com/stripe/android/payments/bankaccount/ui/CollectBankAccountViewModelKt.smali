.class public final Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModelKt;
.super Ljava/lang/Object;
.source "CollectBankAccountViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "retrieveElementsSessionContext",
        "Lcom/stripe/android/financialconnections/ElementsSessionContext;",
        "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;",
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
.method public static final synthetic access$retrieveElementsSessionContext(Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;)Lcom/stripe/android/financialconnections/ElementsSessionContext;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModelKt;->retrieveElementsSessionContext(Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;)Lcom/stripe/android/financialconnections/ElementsSessionContext;

    move-result-object p0

    return-object p0
.end method

.method private static final retrieveElementsSessionContext(Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;)Lcom/stripe/android/financialconnections/ElementsSessionContext;
    .locals 1

    .line 311
    instance-of v0, p0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;

    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$InstantDebits;->getElementsSessionContext()Lcom/stripe/android/financialconnections/ElementsSessionContext;

    move-result-object p0

    return-object p0

    .line 312
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccountInternal;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccountInternal;

    invoke-virtual {p0}, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccountInternal;->getElementsSessionContext()Lcom/stripe/android/financialconnections/ElementsSessionContext;

    move-result-object p0

    return-object p0

    .line 313
    :cond_1
    instance-of p0, p0, Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration$USBankAccount;

    if-eqz p0, :cond_2

    const/4 p0, 0x0

    return-object p0

    .line 310
    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
