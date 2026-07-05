.class public final Lcom/stripe/android/paymentsheet/model/PaymentOptionFactoryKt;
.super Ljava/lang/Object;
.source "PaymentOptionFactory.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0007"
    }
    d2 = {
        "shippingDetails",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "getShippingDetails",
        "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
        "makeAddressDetails",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;",
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
.method public static final getShippingDetails(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomPaymentMethod;

    if-nez v0, :cond_2

    .line 34
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$ExternalPaymentMethod;

    if-nez v0, :cond_2

    .line 35
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    if-nez v0, :cond_2

    .line 36
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;

    if-nez v0, :cond_2

    .line 37
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$GenericPaymentMethod;

    if-nez v0, :cond_2

    .line 38
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    if-nez v0, :cond_2

    .line 39
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    if-nez v0, :cond_2

    .line 40
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$ShopPay;

    if-nez v0, :cond_2

    .line 41
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 44
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    if-eqz v0, :cond_1

    .line 45
    check-cast p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactoryKt;->makeAddressDetails(Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;)Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object p0

    return-object p0

    .line 32
    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final makeAddressDetails(Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;)Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;
    .locals 11

    .line 50
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;->getShippingAddress()Lcom/stripe/android/model/ConsumerShippingAddress;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    .line 52
    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerShippingAddress;->getAddress()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getName()Ljava/lang/String;

    move-result-object v1

    .line 53
    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerShippingAddress;->getUnredactedPhoneNumber()Ljava/lang/String;

    move-result-object v2

    .line 55
    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerShippingAddress;->getAddress()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getLine1()Ljava/lang/String;

    move-result-object v7

    .line 56
    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerShippingAddress;->getAddress()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getLine2()Ljava/lang/String;

    move-result-object v8

    .line 57
    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerShippingAddress;->getAddress()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getLocality()Ljava/lang/String;

    move-result-object v5

    .line 58
    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerShippingAddress;->getAddress()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getAdministrativeArea()Ljava/lang/String;

    move-result-object v10

    .line 59
    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerShippingAddress;->getAddress()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getPostalCode()Ljava/lang/String;

    move-result-object v9

    .line 60
    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerShippingAddress;->getAddress()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getCountryCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object p0

    move-object v6, p0

    goto :goto_0

    :cond_0
    move-object v6, v0

    .line 54
    :goto_0
    new-instance v4, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    invoke-direct/range {v4 .. v10}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    new-instance p0, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    invoke-direct {p0, v1, v4, v2, v0}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;-><init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Address;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-object p0

    :cond_1
    return-object v0
.end method
