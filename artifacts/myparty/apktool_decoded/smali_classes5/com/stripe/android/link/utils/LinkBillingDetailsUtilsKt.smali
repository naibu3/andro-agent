.class public final Lcom/stripe/android/link/utils/LinkBillingDetailsUtilsKt;
.super Ljava/lang/Object;
.source "LinkBillingDetailsUtils.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLinkBillingDetailsUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkBillingDetailsUtils.kt\ncom/stripe/android/link/utils/LinkBillingDetailsUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u0006\u001a\u00020\u0007*\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u000e\u0010\u000b\u001a\u00020\u0007*\u0004\u0018\u00010\u000cH\u0002\u001a\u001e\u0010\r\u001a\u00020\u0008*\u00020\u00082\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000\u001a\u000e\u0010\u000e\u001a\u0004\u0018\u00010\u000c*\u00020\u0001H\u0002\u001a\u000e\u0010\u000e\u001a\u0004\u0018\u00010\u000c*\u00020\u000fH\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "effectiveBillingDetails",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;",
        "configuration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "linkAccount",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "supports",
        "",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "billingDetailsConfig",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
        "isIncomplete",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;",
        "withEffectiveBillingDetails",
        "toConsumerBillingAddress",
        "Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
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
.method public static final effectiveBillingDetails(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/model/LinkAccount;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;
    .locals 9

    const-string v0, "configuration"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccount"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkConfiguration;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v0

    .line 23
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkConfiguration;->getDefaultBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object p0

    if-nez p0, :cond_0

    .line 24
    new-instance v1, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v1

    goto :goto_0

    :cond_0
    move-object v2, p0

    .line 26
    :goto_0
    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getEmail()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    if-nez p0, :cond_2

    .line 27
    invoke-virtual {p1}, Lcom/stripe/android/link/model/LinkAccount;->getEmail()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getCollectsEmail$paymentsheet_release()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move-object v4, v1

    goto :goto_2

    :cond_2
    :goto_1
    move-object v4, p0

    .line 28
    :goto_2
    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getPhone()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_4

    .line 29
    invoke-virtual {p1}, Lcom/stripe/android/link/model/LinkAccount;->getUnredactedPhoneNumber()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getCollectsPhone$paymentsheet_release()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_3

    :cond_3
    move-object v6, v1

    goto :goto_4

    :cond_4
    :goto_3
    move-object v6, p0

    :goto_4
    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    .line 25
    invoke-static/range {v2 .. v8}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->copy$default(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object p0

    return-object p0
.end method

.method private static final isIncomplete(Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;)Z
    .locals 1

    if-eqz p0, :cond_1

    .line 60
    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getLine1()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getLocality()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getPostalCode()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getCountryCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final supports(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/link/model/LinkAccount;)Z
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingDetailsConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccount"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    instance-of v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    const/4 v1, 0x1

    if-nez v0, :cond_1

    .line 42
    instance-of v0, p0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    .line 44
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;

    move-result-object v0

    sget-object v2, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;->Full:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;

    const/4 v3, 0x0

    if-ne v0, v2, :cond_2

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getBillingAddress()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/link/utils/LinkBillingDetailsUtilsKt;->isIncomplete(Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v3

    .line 46
    :cond_2
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getCollectsPhone$paymentsheet_release()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lcom/stripe/android/link/model/LinkAccount;->getUnredactedPhoneNumber()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_3

    return v3

    .line 48
    :cond_3
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->getCollectsName$paymentsheet_release()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getBillingAddress()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getName()Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_4
    const/4 p0, 0x0

    :goto_1
    if-nez p0, :cond_5

    return v3

    :cond_5
    return v1
.end method

.method public static final toConsumerBillingAddress(Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    invoke-static {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt;->toPaymentSheetBillingDetails(Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/link/utils/LinkBillingDetailsUtilsKt;->toConsumerBillingAddress(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;)Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    move-result-object p0

    return-object p0
.end method

.method private static final toConsumerBillingAddress(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;)Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;
    .locals 10

    .line 101
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getAddress()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 103
    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getName()Ljava/lang/String;

    move-result-object v3

    .line 104
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getLine1()Ljava/lang/String;

    move-result-object v4

    .line 105
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getLine2()Ljava/lang/String;

    move-result-object v5

    .line 106
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getCity()Ljava/lang/String;

    move-result-object v7

    .line 107
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getState()Ljava/lang/String;

    move-result-object v6

    .line 108
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getPostalCode()Ljava/lang/String;

    move-result-object v8

    .line 109
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;->getCountry()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    sget-object v0, Lcom/stripe/android/core/model/CountryCode;->Companion:Lcom/stripe/android/core/model/CountryCode$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/core/model/CountryCode$Companion;->create(Ljava/lang/String;)Lcom/stripe/android/core/model/CountryCode;

    move-result-object v1

    :cond_1
    move-object v9, v1

    .line 102
    new-instance v2, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/model/CountryCode;)V

    return-object v2
.end method

.method public static final withEffectiveBillingDetails(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/model/LinkAccount;)Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;
    .locals 18

    move-object/from16 v0, p0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "configuration"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    goto/16 :goto_2

    .line 72
    :cond_0
    invoke-static/range {p1 .. p2}, Lcom/stripe/android/link/utils/LinkBillingDetailsUtilsKt;->effectiveBillingDetails(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/model/LinkAccount;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v1

    .line 73
    invoke-static {v1}, Lcom/stripe/android/link/utils/LinkBillingDetailsUtilsKt;->toConsumerBillingAddress(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;)Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    move-result-object v2

    .line 74
    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getBillingAddress()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    const/4 v5, 0x0

    if-eqz v2, :cond_1

    .line 75
    invoke-virtual {v2}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getCountryCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v6

    goto :goto_0

    :cond_1
    move-object v6, v5

    :goto_0
    invoke-virtual {v3}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getCountryCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    if-eqz v2, :cond_2

    .line 76
    invoke-virtual {v2}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getPostalCode()Ljava/lang/String;

    move-result-object v5

    :cond_2
    invoke-virtual {v3}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getPostalCode()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v4, 0x1

    .line 81
    :cond_3
    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getBillingAddress()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    move-result-object v3

    if-eqz v3, :cond_5

    if-eqz v4, :cond_4

    goto :goto_1

    .line 82
    :cond_4
    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getBillingAddress()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    move-result-object v2

    :cond_5
    :goto_1
    move-object v8, v2

    .line 85
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->getEmail()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getBillingEmailAddress()Ljava/lang/String;

    move-result-object v1

    :cond_6
    move-object v9, v1

    .line 88
    instance-of v1, v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    if-eqz v1, :cond_7

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    const/16 v16, 0xfcf

    const/16 v17, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v3 .. v17}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->copy$default(Lcom/stripe/android/model/ConsumerPaymentDetails$Card;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;IILcom/stripe/android/model/CardBrand;Ljava/util/List;Lcom/stripe/android/model/CvcCheck;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    return-object v0

    .line 92
    :cond_7
    instance-of v1, v0, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    if-eqz v1, :cond_8

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    const/16 v12, 0x3f

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v10, v8

    const/4 v8, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    invoke-static/range {v3 .. v13}, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;->copy$default(Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    return-object v0

    .line 96
    :cond_8
    instance-of v1, v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;

    if-eqz v1, :cond_9

    :goto_2
    return-object v0

    .line 87
    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
