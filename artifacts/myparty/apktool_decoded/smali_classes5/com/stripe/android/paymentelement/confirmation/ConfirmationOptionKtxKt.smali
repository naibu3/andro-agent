.class public final Lcom/stripe/android/paymentelement/confirmation/ConfirmationOptionKtxKt;
.super Ljava/lang/Object;
.source "ConfirmationOptionKtx.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/confirmation/ConfirmationOptionKtxKt$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nConfirmationOptionKtx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmationOptionKtx.kt\ncom/stripe/android/paymentelement/confirmation/ConfirmationOptionKtxKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n295#2,2:170\n*S KotlinDebug\n*F\n+ 1 ConfirmationOptionKtx.kt\ncom/stripe/android/paymentelement/confirmation/ConfirmationOptionKtxKt\n*L\n144#1:170,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0007*\u00020\u0008H\u0002\u001a\u000c\u0010\u0000\u001a\u00020\t*\u00020\nH\u0002\u001a\u000c\u0010\u0000\u001a\u00020\u000b*\u00020\u000cH\u0002\u001a\u0018\u0010\u0000\u001a\u0004\u0018\u00010\r*\u00020\u000e2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u000fH\u0002\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0010*\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0018\u0010\u0000\u001a\u0004\u0018\u00010\u0012*\u00020\u00132\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0014*\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0016*\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u00a8\u0006\u0018"
    }
    d2 = {
        "toConfirmationOption",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "configuration",
        "Lcom/stripe/android/common/model/CommonConfiguration;",
        "linkConfiguration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$Saved;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;",
        "Lcom/stripe/android/paymentelement/confirmation/epms/ExternalPaymentMethodConfirmationOption;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$ExternalPaymentMethod;",
        "Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;",
        "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;",
        "Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationOption;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;",
        "Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;",
        "Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodConfirmationOption;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomPaymentMethod;",
        "Lcom/stripe/android/paymentelement/confirmation/shoppay/ShopPayConfirmationOption;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$ShopPay;",
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
.method private static final toConfirmationOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;
    .locals 9

    .line 90
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentMethodCreateParams;->getTypeCode()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->BacsDebit:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/bacs/BacsConfirmationOption;

    .line 92
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v1

    .line 93
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;->getPaymentMethodOptionsParams()Lcom/stripe/android/model/PaymentMethodOptionsParams;

    move-result-object p0

    .line 91
    invoke-direct {v0, v1, p0}, Lcom/stripe/android/paymentelement/confirmation/bacs/BacsConfirmationOption;-><init>(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;)V

    check-cast v0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    return-object v0

    .line 96
    :cond_0
    new-instance v1, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$New;

    .line 97
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v2

    .line 98
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;->getPaymentMethodOptionsParams()Lcom/stripe/android/model/PaymentMethodOptionsParams;

    move-result-object v3

    .line 99
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;->getPaymentMethodExtraParams()Lcom/stripe/android/model/PaymentMethodExtraParams;

    move-result-object v4

    .line 100
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;->getCustomerRequestedSave()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    move-result-object p0

    sget-object v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;->RequestReuse:Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    if-ne p0, v0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    move v5, p0

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    .line 96
    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$New;-><init>(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;ZLcom/stripe/android/model/PassiveCaptchaParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    return-object v1
.end method

.method public static final toConfirmationOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/common/model/CommonConfiguration;Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    invoke-static {p0}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationOptionKtxKt;->toConfirmationOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;)Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$Saved;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    return-object p0

    .line 24
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$ExternalPaymentMethod;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$ExternalPaymentMethod;

    invoke-static {p0}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationOptionKtxKt;->toConfirmationOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection$ExternalPaymentMethod;)Lcom/stripe/android/paymentelement/confirmation/epms/ExternalPaymentMethodConfirmationOption;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    return-object p0

    .line 25
    :cond_1
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomPaymentMethod;

    if-eqz v0, :cond_2

    check-cast p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomPaymentMethod;

    invoke-static {p0, p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationOptionKtxKt;->toConfirmationOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomPaymentMethod;Lcom/stripe/android/common/model/CommonConfiguration;)Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodConfirmationOption;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    return-object p0

    .line 26
    :cond_2
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    if-eqz v0, :cond_3

    check-cast p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    invoke-static {p0}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationOptionKtxKt;->toConfirmationOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;)Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    return-object p0

    .line 27
    :cond_3
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    if-eqz v0, :cond_4

    check-cast p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    invoke-static {p0, p2}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationOptionKtxKt;->toConfirmationOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    return-object p0

    .line 28
    :cond_4
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    if-eqz v0, :cond_5

    check-cast p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;

    invoke-static {p0}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationOptionKtxKt;->toConfirmationOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    move-result-object p0

    return-object p0

    .line 29
    :cond_5
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    if-eqz v0, :cond_6

    check-cast p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    invoke-static {p0, p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationOptionKtxKt;->toConfirmationOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;Lcom/stripe/android/common/model/CommonConfiguration;)Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationOption;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    return-object p0

    .line 30
    :cond_6
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    if-eqz v0, :cond_7

    check-cast p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    invoke-static {p0, p2}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationOptionKtxKt;->toConfirmationOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    return-object p0

    .line 31
    :cond_7
    instance-of p2, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$ShopPay;

    if-eqz p2, :cond_8

    check-cast p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$ShopPay;

    invoke-static {p0, p1}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationOptionKtxKt;->toConfirmationOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection$ShopPay;Lcom/stripe/android/common/model/CommonConfiguration;)Lcom/stripe/android/paymentelement/confirmation/shoppay/ShopPayConfirmationOption;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    return-object p0

    .line 22
    :cond_8
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final toConfirmationOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;)Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$Saved;
    .locals 6

    .line 36
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$Saved;

    .line 37
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v1

    .line 38
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;->getPaymentMethodOptionsParams()Lcom/stripe/android/model/PaymentMethodOptionsParams;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    .line 36
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$Saved;-><init>(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final toConfirmationOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;)Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;
    .locals 10

    .line 50
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getInstantDebits()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$InstantDebitsInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 53
    new-instance v1, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$Saved;

    .line 54
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getInstantDebits()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$InstantDebitsInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount$InstantDebitsInfo;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v2

    .line 55
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getPaymentMethodOptionsParams()Lcom/stripe/android/model/PaymentMethodOptionsParams;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    .line 53
    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$Saved;-><init>(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentMethodOptionsParams;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;

    return-object v1

    .line 58
    :cond_0
    new-instance v2, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$New;

    .line 59
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v3

    .line 60
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getPaymentMethodOptionsParams()Lcom/stripe/android/model/PaymentMethodOptionsParams;

    move-result-object v4

    .line 61
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getPaymentMethodExtraParams()Lcom/stripe/android/model/PaymentMethodExtraParams;

    move-result-object v5

    .line 62
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->getCustomerRequestedSave()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    move-result-object p0

    sget-object v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;->RequestReuse:Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    if-ne p0, v0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    move v6, p0

    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v7, 0x0

    .line 58
    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$New;-><init>(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;ZLcom/stripe/android/model/PassiveCaptchaParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;

    return-object v2
.end method

.method private static final toConfirmationOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomPaymentMethod;Lcom/stripe/android/common/model/CommonConfiguration;)Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodConfirmationOption;
    .locals 4

    .line 144
    invoke-virtual {p1}, Lcom/stripe/android/common/model/CommonConfiguration;->getCustomPaymentMethods()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 170
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;

    .line 145
    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomPaymentMethod;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    .line 144
    :goto_0
    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;

    if-eqz v0, :cond_2

    .line 147
    new-instance p1, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodConfirmationOption;

    .line 149
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomPaymentMethod;->getBillingDetails()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object p0

    .line 147
    invoke-direct {p1, v0, p0}, Lcom/stripe/android/paymentelement/confirmation/cpms/CustomPaymentMethodConfirmationOption;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)V

    return-object p1

    :cond_2
    return-object v1
.end method

.method private static final toConfirmationOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection$ExternalPaymentMethod;)Lcom/stripe/android/paymentelement/confirmation/epms/ExternalPaymentMethodConfirmationOption;
    .locals 2

    .line 43
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/epms/ExternalPaymentMethodConfirmationOption;

    .line 44
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$ExternalPaymentMethod;->getType()Ljava/lang/String;

    move-result-object v1

    .line 45
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$ExternalPaymentMethod;->getBillingDetails()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object p0

    .line 43
    invoke-direct {v0, v1, p0}, Lcom/stripe/android/paymentelement/confirmation/epms/ExternalPaymentMethodConfirmationOption;-><init>(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)V

    return-object v0
.end method

.method private static final toConfirmationOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;Lcom/stripe/android/common/model/CommonConfiguration;)Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationOption;
    .locals 10

    .line 108
    invoke-virtual {p1}, Lcom/stripe/android/common/model/CommonConfiguration;->getGooglePay()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 109
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationOption;

    .line 110
    new-instance v1, Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationOption$Config;

    .line 111
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;->getEnvironment()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;

    move-result-object v2

    .line 112
    invoke-virtual {p1}, Lcom/stripe/android/common/model/CommonConfiguration;->getMerchantDisplayName()Ljava/lang/String;

    move-result-object v3

    .line 113
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;->getCountryCode()Ljava/lang/String;

    move-result-object v4

    .line 114
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;->getCurrencyCode()Ljava/lang/String;

    move-result-object v5

    .line 115
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;->getAmount()Ljava/lang/Long;

    move-result-object v6

    .line 116
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;->getLabel()Ljava/lang/String;

    move-result-object v7

    .line 117
    invoke-virtual {p1}, Lcom/stripe/android/common/model/CommonConfiguration;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v8

    .line 118
    new-instance p0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;

    invoke-virtual {p1}, Lcom/stripe/android/common/model/CommonConfiguration;->getCardBrandAcceptance()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;)V

    move-object v9, p0

    check-cast v9, Lcom/stripe/android/CardBrandFilter;

    .line 110
    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationOption$Config;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/CardBrandFilter;)V

    .line 109
    invoke-direct {v0, v1}, Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationOption;-><init>(Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationOption$Config;)V

    return-object v0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final toConfirmationOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;
    .locals 2

    if-eqz p1, :cond_1

    .line 130
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;->getLinkExpressMode()Lcom/stripe/android/link/LinkExpressMode;

    move-result-object v0

    .line 133
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;->getSelectedPayment()Lcom/stripe/android/link/LinkPaymentMethod;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/stripe/android/link/LinkLaunchMode$Confirmation;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;->getSelectedPayment()Lcom/stripe/android/link/LinkPaymentMethod;

    move-result-object p0

    invoke-direct {v1, p0}, Lcom/stripe/android/link/LinkLaunchMode$Confirmation;-><init>(Lcom/stripe/android/link/LinkPaymentMethod;)V

    check-cast v1, Lcom/stripe/android/link/LinkLaunchMode;

    goto :goto_0

    .line 135
    :cond_0
    sget-object p0, Lcom/stripe/android/link/LinkLaunchMode$Full;->INSTANCE:Lcom/stripe/android/link/LinkLaunchMode$Full;

    move-object v1, p0

    check-cast v1, Lcom/stripe/android/link/LinkLaunchMode;

    .line 128
    :goto_0
    new-instance p0, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;

    invoke-direct {p0, p1, v1, v0}, Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;-><init>(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/LinkExpressMode;)V

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final toConfirmationOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;Lcom/stripe/android/link/LinkConfiguration;)Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;
    .locals 7

    if-eqz p1, :cond_3

    .line 71
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;

    .line 72
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v1

    .line 73
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->getPaymentMethodOptionsParams()Lcom/stripe/android/model/PaymentMethodOptionsParams;

    move-result-object v2

    .line 74
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->getPaymentMethodExtraParams()Lcom/stripe/android/model/PaymentMethodExtraParams;

    move-result-object v3

    .line 75
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->getCustomerRequestedSave()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    move-result-object v4

    sget-object v5, Lcom/stripe/android/paymentelement/confirmation/ConfirmationOptionKtxKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;->ordinal()I

    move-result v4

    aget v4, v5, v4

    const/4 v5, 0x1

    if-eq v4, v5, :cond_2

    const/4 v5, 0x2

    if-eq v4, v5, :cond_1

    const/4 v5, 0x3

    if-ne v4, v5, :cond_0

    .line 81
    sget-object v4, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;->NoRequest:Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;

    goto :goto_0

    .line 75
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 79
    :cond_1
    sget-object v4, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;->RequestedNoReuse:Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;

    goto :goto_0

    .line 77
    :cond_2
    sget-object v4, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;->RequestedReuse:Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;

    .line 84
    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->getInput()Lcom/stripe/android/link/ui/inline/UserInput;

    move-result-object v6

    move-object v5, p1

    .line 71
    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;-><init>(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/ui/inline/UserInput;)V

    return-object v0

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final toConfirmationOption(Lcom/stripe/android/paymentsheet/model/PaymentSelection$ShopPay;Lcom/stripe/android/common/model/CommonConfiguration;)Lcom/stripe/android/paymentelement/confirmation/shoppay/ShopPayConfirmationOption;
    .locals 2

    .line 157
    invoke-virtual {p1}, Lcom/stripe/android/common/model/CommonConfiguration;->getCustomer()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;->getAccessType$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v0

    .line 158
    :goto_0
    instance-of v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$CustomerSession;

    if-eqz v1, :cond_1

    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$CustomerSession;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$CustomerSession;->getCustomerSessionClientSecret()Ljava/lang/String;

    move-result-object p0

    .line 161
    invoke-virtual {p1}, Lcom/stripe/android/common/model/CommonConfiguration;->getShopPayConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 162
    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/shoppay/ShopPayConfirmationOption;

    .line 165
    invoke-virtual {p1}, Lcom/stripe/android/common/model/CommonConfiguration;->getMerchantDisplayName()Ljava/lang/String;

    move-result-object p1

    .line 162
    invoke-direct {v0, v1, p0, p1}, Lcom/stripe/android/paymentelement/confirmation/shoppay/ShopPayConfirmationOption;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-object v0
.end method
