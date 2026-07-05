.class public final Lcom/stripe/android/link/ui/wallet/WalletViewModelKt;
.super Ljava/lang/Object;
.source "WalletViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0008*\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002\u00a8\u0006\u000b"
    }
    d2 = {
        "toPaymentMethodCreateParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "Lcom/stripe/android/link/ui/wallet/WalletUiState;",
        "isSetupForFutureUsage",
        "",
        "Lcom/stripe/android/model/StripeIntent;",
        "passthroughModeEnabled",
        "secondaryButtonLabel",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "linkLaunchMode",
        "Lcom/stripe/android/link/LinkLaunchMode;",
        "paymentsheet_release"
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
.method public static final synthetic access$secondaryButtonLabel(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/link/LinkLaunchMode;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/wallet/WalletViewModelKt;->secondaryButtonLabel(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/link/LinkLaunchMode;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$toPaymentMethodCreateParams(Lcom/stripe/android/link/ui/wallet/WalletUiState;)Lcom/stripe/android/model/PaymentMethodCreateParams;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/stripe/android/link/ui/wallet/WalletViewModelKt;->toPaymentMethodCreateParams(Lcom/stripe/android/link/ui/wallet/WalletUiState;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p0

    return-object p0
.end method

.method public static final isSetupForFutureUsage(Lcom/stripe/android/model/StripeIntent;Z)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 645
    instance-of v0, p0, Lcom/stripe/android/model/PaymentIntent;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    .line 649
    check-cast p0, Lcom/stripe/android/model/PaymentIntent;

    .line 647
    sget-object p1, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/stripe/android/model/PaymentIntent;->isSetupFutureUsageSet(Ljava/lang/String;)Z

    move-result p0

    return p0

    .line 649
    :cond_0
    check-cast p0, Lcom/stripe/android/model/PaymentIntent;

    sget-object p1, Lcom/stripe/android/model/PaymentMethod$Type;->Link:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/stripe/android/model/PaymentIntent;->isSetupFutureUsageSet(Ljava/lang/String;)Z

    move-result p0

    return p0

    .line 652
    :cond_1
    instance-of p0, p0, Lcom/stripe/android/model/SetupIntent;

    if-eqz p0, :cond_2

    const/4 p0, 0x1

    return p0

    .line 644
    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final secondaryButtonLabel(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/link/LinkLaunchMode;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 4

    .line 658
    instance-of v0, p1, Lcom/stripe/android/link/LinkLaunchMode$Full;

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-nez v0, :cond_3

    .line 659
    instance-of v0, p1, Lcom/stripe/android/link/LinkLaunchMode$Confirmation;

    if-eqz v0, :cond_0

    goto :goto_1

    .line 663
    :cond_0
    instance-of p0, p1, Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;

    if-nez p0, :cond_2

    .line 664
    instance-of p0, p1, Lcom/stripe/android/link/LinkLaunchMode$Authentication;

    if-eqz p0, :cond_1

    goto :goto_0

    .line 657
    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 664
    :cond_2
    :goto_0
    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_wallet_continue_another_way:I

    new-array p1, v2, [Ljava/lang/Object;

    invoke-static {p0, p1, v3, v1, v3}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 660
    :cond_3
    :goto_1
    instance-of p1, p0, Lcom/stripe/android/model/PaymentIntent;

    if-eqz p1, :cond_4

    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_wallet_pay_another_way:I

    new-array p1, v2, [Ljava/lang/Object;

    invoke-static {p0, p1, v3, v1, v3}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 661
    :cond_4
    instance-of p0, p0, Lcom/stripe/android/model/SetupIntent;

    if-eqz p0, :cond_5

    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_wallet_continue_another_way:I

    new-array p1, v2, [Ljava/lang/Object;

    invoke-static {p0, p1, v3, v1, v3}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 659
    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final toPaymentMethodCreateParams(Lcom/stripe/android/link/ui/wallet/WalletUiState;)Lcom/stripe/android/model/PaymentMethodCreateParams;
    .locals 8

    .line 635
    sget-object v0, Lcom/stripe/android/ui/core/elements/CardDetailsUtil;->INSTANCE:Lcom/stripe/android/ui/core/elements/CardDetailsUtil;

    invoke-virtual {p0}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getExpiryDateInput()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/stripe/android/ui/core/elements/CardDetailsUtil;->createExpiryDateFormFieldValues(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/util/Map;

    move-result-object v2

    .line 636
    sget-object v1, Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter;->Companion:Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter$Companion;

    .line 638
    sget-object p0, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v3, p0, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 636
    invoke-static/range {v1 .. v7}, Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter$Companion;->transformToPaymentMethodCreateParams$default(Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter$Companion;Ljava/util/Map;Ljava/lang/String;ZLcom/stripe/android/model/PaymentMethod$AllowRedisplay;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p0

    return-object p0
.end method
