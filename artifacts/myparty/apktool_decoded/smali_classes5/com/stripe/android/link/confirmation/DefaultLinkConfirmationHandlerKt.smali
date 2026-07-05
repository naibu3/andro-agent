.class public final Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandlerKt;
.super Ljava/lang/Object;
.source "DefaultLinkConfirmationHandler.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDefaultLinkConfirmationHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultLinkConfirmationHandler.kt\ncom/stripe/android/link/confirmation/DefaultLinkConfirmationHandlerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n1#2:253\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000\u001a\u0018\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u000c\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002\u00a8\u0006\r"
    }
    d2 = {
        "createPaymentMethodCreateParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "selectedPaymentDetails",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "consumerSessionClientSecret",
        "",
        "cvc",
        "billingPhone",
        "computeExpectedPaymentMethodType",
        "configuration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "paymentDetails",
        "computeBankAccountExpectedPaymentMethodType",
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
.method private static final computeBankAccountExpectedPaymentMethodType(Lcom/stripe/android/link/LinkConfiguration;)Ljava/lang/String;
    .locals 2

    .line 243
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkConfiguration;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v0

    invoke-interface {v0}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethodTypes()Ljava/util/List;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->USBankAccount:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    .line 244
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkConfiguration;->getLinkMode()Lcom/stripe/android/model/LinkMode;

    move-result-object p0

    sget-object v1, Lcom/stripe/android/model/LinkMode;->LinkCardBrand:Lcom/stripe/android/model/LinkMode;

    if-ne p0, v1, :cond_0

    if-nez v0, :cond_0

    .line 247
    const-string p0, "card"

    return-object p0

    .line 249
    :cond_0
    const-string p0, "bank_account"

    return-object p0
.end method

.method public static final computeExpectedPaymentMethodType(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)Ljava/lang/String;
    .locals 1

    const-string v0, "configuration"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    instance-of v0, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandlerKt;->computeBankAccountExpectedPaymentMethodType(Lcom/stripe/android/link/LinkConfiguration;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 237
    :cond_0
    instance-of p0, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    const-string v0, "card"

    if-eqz p0, :cond_1

    return-object v0

    .line 238
    :cond_1
    instance-of p0, p1, Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;

    if-eqz p0, :cond_2

    return-object v0

    .line 235
    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final createPaymentMethodCreateParams(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodCreateParams;
    .locals 14

    move-object/from16 v0, p2

    const-string v1, "selectedPaymentDetails"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "consumerSessionClientSecret"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getBillingAddress()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 210
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getLine1()Ljava/lang/String;

    move-result-object v8

    .line 211
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getLine2()Ljava/lang/String;

    move-result-object v9

    .line 212
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getPostalCode()Ljava/lang/String;

    move-result-object v10

    .line 213
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getLocality()Ljava/lang/String;

    move-result-object v6

    .line 214
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getAdministrativeArea()Ljava/lang/String;

    move-result-object v11

    .line 215
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getCountryCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v1

    move-object v7, v1

    goto :goto_0

    :cond_0
    move-object v7, v2

    .line 209
    :goto_0
    new-instance v5, Lcom/stripe/android/model/Address;

    invoke-direct/range {v5 .. v11}, Lcom/stripe/android/model/Address;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object v5, v2

    .line 218
    :goto_1
    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getBillingEmailAddress()Ljava/lang/String;

    move-result-object v1

    .line 219
    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getBillingAddress()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getName()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object v3, v2

    .line 207
    :goto_2
    new-instance v6, Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-object/from16 v7, p3

    invoke-direct {v6, v5, v1, v3, v7}, Lcom/stripe/android/model/PaymentMethod$BillingDetails;-><init>(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, v2

    .line 223
    sget-object v2, Lcom/stripe/android/model/PaymentMethodCreateParams;->Companion:Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;

    .line 224
    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v3

    .line 226
    new-instance v7, Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    const/16 v12, 0xf

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lcom/stripe/android/model/PaymentMethod$BillingDetails;-><init>(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    move-object v5, v6

    goto :goto_3

    :cond_3
    move-object v5, v1

    :goto_3
    if-eqz v0, :cond_4

    .line 227
    const-string p0, "cvc"

    invoke-static {p0, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    const-string v0, "card"

    invoke-static {v0, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    move-object v6, p0

    goto :goto_4

    :cond_4
    move-object v6, v1

    :goto_4
    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v4, p1

    .line 223
    invoke-static/range {v2 .. v9}, Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;->createLink$default(Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p0

    return-object p0
.end method
