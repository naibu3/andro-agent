.class public final Lcom/stripe/android/model/PaymentMethodOptionsParamsKt;
.super Ljava/lang/Object;
.source "PaymentMethodOptionsParams.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007\u00a8\u0006\u0003"
    }
    d2 = {
        "setupFutureUsage",
        "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;",
        "Lcom/stripe/android/model/PaymentMethodOptionsParams;",
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
.method public static final setupFutureUsage(Lcom/stripe/android/model/PaymentMethodOptionsParams;)Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    instance-of v0, p0, Lcom/stripe/android/model/PaymentMethodOptionsParams$Blik;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 173
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/model/PaymentMethodOptionsParams$Card;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/stripe/android/model/PaymentMethodOptionsParams$Card;

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentMethodOptionsParams$Card;->getSetupFutureUsage()Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    move-result-object p0

    return-object p0

    .line 174
    :cond_1
    instance-of v0, p0, Lcom/stripe/android/model/PaymentMethodOptionsParams$SepaDebit;

    if-eqz v0, :cond_2

    check-cast p0, Lcom/stripe/android/model/PaymentMethodOptionsParams$SepaDebit;

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentMethodOptionsParams$SepaDebit;->getSetupFutureUsage()Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    move-result-object p0

    return-object p0

    .line 175
    :cond_2
    instance-of v0, p0, Lcom/stripe/android/model/PaymentMethodOptionsParams$Konbini;

    if-eqz v0, :cond_3

    return-object v1

    .line 176
    :cond_3
    instance-of v0, p0, Lcom/stripe/android/model/PaymentMethodOptionsParams$Link;

    if-eqz v0, :cond_4

    check-cast p0, Lcom/stripe/android/model/PaymentMethodOptionsParams$Link;

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentMethodOptionsParams$Link;->getSetupFutureUsage()Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    move-result-object p0

    return-object p0

    .line 177
    :cond_4
    instance-of v0, p0, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;

    if-eqz v0, :cond_5

    check-cast p0, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;->getSetupFutureUsage()Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    move-result-object p0

    return-object p0

    .line 178
    :cond_5
    instance-of v0, p0, Lcom/stripe/android/model/PaymentMethodOptionsParams$WeChatPay;

    if-eqz v0, :cond_6

    return-object v1

    .line 179
    :cond_6
    instance-of p0, p0, Lcom/stripe/android/model/PaymentMethodOptionsParams$WeChatPayH5;

    if-eqz p0, :cond_7

    return-object v1

    .line 171
    :cond_7
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
