.class public final Lcom/stripe/android/paymentsheet/ui/EditCardPayload$Companion;
.super Ljava/lang/Object;
.source "EditCardDetailsInteractor.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/ui/EditCardPayload;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEditCardDetailsInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCardDetailsInteractor.kt\ncom/stripe/android/paymentsheet/ui/EditCardPayload$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,394:1\n1#2:395\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tJ\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/EditCardPayload$Companion;",
        "",
        "<init>",
        "()V",
        "create",
        "Lcom/stripe/android/paymentsheet/ui/EditCardPayload;",
        "card",
        "Lcom/stripe/android/model/PaymentMethod$Card;",
        "billingDetails",
        "Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
        "details",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "billingPhoneNumber",
        "",
        "link",
        "Lcom/stripe/android/model/LinkPaymentDetails$Card;",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/EditCardPayload$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/ui/EditCardPayload;
    .locals 18

    move-object/from16 v0, p1

    const-string v1, "details"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    instance-of v1, v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    .line 67
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getLast4()Ljava/lang/String;

    move-result-object v3

    move-object v5, v3

    goto :goto_1

    :cond_1
    move-object v5, v2

    :goto_1
    if-eqz v1, :cond_2

    .line 68
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getExpiryMonth()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object v6, v3

    goto :goto_2

    :cond_2
    move-object v6, v2

    :goto_2
    if-eqz v1, :cond_3

    .line 69
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getExpiryYear()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object v7, v3

    goto :goto_3

    :cond_3
    move-object v7, v2

    :goto_3
    if-eqz v1, :cond_4

    .line 70
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v3

    if-nez v3, :cond_5

    :cond_4
    sget-object v3, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    :cond_5
    move-object v8, v3

    if-eqz v1, :cond_6

    .line 71
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lcom/stripe/android/model/CardBrand;->getCode()Ljava/lang/String;

    move-result-object v3

    move-object v9, v3

    goto :goto_4

    :cond_6
    move-object v9, v2

    :goto_4
    if-eqz v1, :cond_7

    .line 72
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getNetworks()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_7

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    goto :goto_5

    :cond_7
    move-object v1, v2

    :goto_5
    if-eqz v1, :cond_8

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_6

    :cond_8
    move-object v3, v2

    :goto_6
    if-eqz v3, :cond_9

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v3

    const/4 v4, 0x1

    if-le v3, v4, :cond_9

    move-object v10, v1

    goto :goto_7

    :cond_9
    move-object v10, v2

    .line 74
    :goto_7
    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getBillingAddress()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    move-result-object v1

    if-eqz v1, :cond_b

    .line 76
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getLine1()Ljava/lang/String;

    move-result-object v14

    .line 77
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getLine2()Ljava/lang/String;

    move-result-object v15

    .line 78
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getLocality()Ljava/lang/String;

    move-result-object v12

    .line 79
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getAdministrativeArea()Ljava/lang/String;

    move-result-object v17

    .line 80
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getPostalCode()Ljava/lang/String;

    move-result-object v16

    .line 81
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getCountryCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v1

    move-object v13, v1

    goto :goto_8

    :cond_a
    move-object v13, v2

    .line 75
    :goto_8
    new-instance v11, Lcom/stripe/android/model/Address;

    invoke-direct/range {v11 .. v17}, Lcom/stripe/android/model/Address;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_9

    :cond_b
    move-object v11, v2

    .line 84
    :goto_9
    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getBillingEmailAddress()Ljava/lang/String;

    move-result-object v1

    .line 85
    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getBillingAddress()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getName()Ljava/lang/String;

    move-result-object v2

    .line 73
    :cond_c
    new-instance v0, Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-object/from16 v3, p2

    invoke-direct {v0, v11, v1, v2, v3}, Lcom/stripe/android/model/PaymentMethod$BillingDetails;-><init>(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    new-instance v4, Lcom/stripe/android/paymentsheet/ui/EditCardPayload;

    move-object v11, v0

    invoke-direct/range {v4 .. v11}, Lcom/stripe/android/paymentsheet/ui/EditCardPayload;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)V

    return-object v4
.end method

.method public final create(Lcom/stripe/android/model/LinkPaymentDetails$Card;)Lcom/stripe/android/paymentsheet/ui/EditCardPayload;
    .locals 9

    const-string v0, "link"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    new-instance v1, Lcom/stripe/android/paymentsheet/ui/EditCardPayload;

    .line 93
    invoke-virtual {p1}, Lcom/stripe/android/model/LinkPaymentDetails$Card;->getLast4()Ljava/lang/String;

    move-result-object v2

    .line 94
    invoke-virtual {p1}, Lcom/stripe/android/model/LinkPaymentDetails$Card;->getExpMonth()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 95
    invoke-virtual {p1}, Lcom/stripe/android/model/LinkPaymentDetails$Card;->getExpYear()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 96
    invoke-virtual {p1}, Lcom/stripe/android/model/LinkPaymentDetails$Card;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v6, 0x0

    .line 92
    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/paymentsheet/ui/EditCardPayload;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)V

    return-object v1
.end method

.method public final create(Lcom/stripe/android/model/PaymentMethod$Card;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lcom/stripe/android/paymentsheet/ui/EditCardPayload;
    .locals 9

    const-string v0, "card"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    new-instance v1, Lcom/stripe/android/paymentsheet/ui/EditCardPayload;

    .line 51
    iget-object v2, p1, Lcom/stripe/android/model/PaymentMethod$Card;->last4:Ljava/lang/String;

    .line 52
    iget-object v3, p1, Lcom/stripe/android/model/PaymentMethod$Card;->expiryMonth:Ljava/lang/Integer;

    .line 53
    iget-object v4, p1, Lcom/stripe/android/model/PaymentMethod$Card;->expiryYear:Ljava/lang/Integer;

    .line 54
    iget-object v5, p1, Lcom/stripe/android/model/PaymentMethod$Card;->brand:Lcom/stripe/android/model/CardBrand;

    .line 55
    iget-object v6, p1, Lcom/stripe/android/model/PaymentMethod$Card;->displayBrand:Ljava/lang/String;

    .line 56
    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod$Card;->networks:Lcom/stripe/android/model/PaymentMethod$Card$Networks;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethod$Card$Networks;->getAvailable()Ljava/util/Set;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move-object v7, p1

    move-object v8, p2

    .line 50
    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/paymentsheet/ui/EditCardPayload;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)V

    return-object v1
.end method
