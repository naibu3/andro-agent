.class public final Lcom/stripe/android/paymentsheet/ui/CardDetailsEntryKt;
.super Ljava/lang/Object;
.source "CardDetailsEntry.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCardDetailsEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardDetailsEntry.kt\ncom/stripe/android/paymentsheet/ui/CardDetailsEntryKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1734#2,3:87\n*S KotlinDebug\n*F\n+ 1 CardDetailsEntry.kt\ncom/stripe/android/paymentsheet/ui/CardDetailsEntryKt\n*L\n75#1:87,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000\u001a\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u00a8\u0006\u0008"
    }
    d2 = {
        "toUpdateParams",
        "Lcom/stripe/android/paymentsheet/CardUpdateParams;",
        "cardDetailsEntry",
        "Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;",
        "billingDetailsEntry",
        "Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;",
        "createBillingDetails",
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
.method private static final createBillingDetails(Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;)Lcom/stripe/android/model/PaymentMethod$BillingDetails;
    .locals 9

    const/4 v0, 0x0

    if-eqz p0, :cond_6

    .line 61
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->getBillingDetailsFormState()Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 62
    new-instance v2, Lcom/stripe/android/model/Address;

    .line 63
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getCity()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v0

    .line 64
    :goto_0
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getCountry()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v0

    .line 65
    :goto_1
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getLine1()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_2
    move-object v5, v0

    .line 66
    :goto_2
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getLine2()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v6

    goto :goto_3

    :cond_3
    move-object v6, v0

    .line 67
    :goto_3
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getPostalCode()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v7

    goto :goto_4

    :cond_4
    move-object v7, v0

    .line 68
    :goto_4
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getState()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v1

    move-object v8, v1

    goto :goto_5

    :cond_5
    move-object v8, v0

    .line 62
    :goto_5
    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/model/Address;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    :cond_6
    move-object v2, v0

    :goto_6
    if-eqz p0, :cond_7

    .line 72
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->getBillingDetailsFormState()Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getEmail()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v1

    goto :goto_7

    :cond_7
    move-object v1, v0

    :goto_7
    if-eqz p0, :cond_8

    .line 73
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->getBillingDetailsFormState()Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getPhone()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v3

    goto :goto_8

    :cond_8
    move-object v3, v0

    :goto_8
    if-eqz p0, :cond_9

    .line 74
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;->getBillingDetailsFormState()Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;

    move-result-object p0

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/BillingDetailsFormState;->getName()Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object p0

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object p0

    goto :goto_9

    :cond_9
    move-object p0, v0

    :goto_9
    const/4 v4, 0x3

    .line 75
    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v6, 0x1

    aput-object v3, v4, v6

    const/4 v7, 0x2

    aput-object p0, v4, v7

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    .line 87
    instance-of v7, v4, Ljava/util/Collection;

    if-eqz v7, :cond_b

    move-object v7, v4

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_b

    :cond_a
    move v5, v6

    goto :goto_b

    .line 88
    :cond_b
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_c
    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 75
    check-cast v7, Ljava/lang/CharSequence;

    if-eqz v7, :cond_c

    invoke-static {v7}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_d

    goto :goto_a

    :cond_d
    :goto_b
    if-nez v2, :cond_e

    if-eqz v5, :cond_e

    return-object v0

    .line 79
    :cond_e
    new-instance v0, Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    invoke-direct {v0, v2, v1, p0, v3}, Lcom/stripe/android/model/PaymentMethod$BillingDetails;-><init>(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final toUpdateParams(Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;)Lcom/stripe/android/paymentsheet/CardUpdateParams;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 51
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->getCardBrandChoice()Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz p0, :cond_1

    .line 52
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->getExpiryDateState()Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->getExpiryMonth()Ljava/lang/Integer;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v0

    :goto_1
    if-eqz p0, :cond_2

    .line 53
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;->getExpiryDateState()Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;->getExpiryYear()Ljava/lang/Integer;

    move-result-object v0

    .line 54
    :cond_2
    invoke-static {p1}, Lcom/stripe/android/paymentsheet/ui/CardDetailsEntryKt;->createBillingDetails(Lcom/stripe/android/paymentsheet/ui/BillingDetailsEntry;)Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object p0

    .line 50
    new-instance p1, Lcom/stripe/android/paymentsheet/CardUpdateParams;

    invoke-direct {p1, v2, v0, v1, p0}, Lcom/stripe/android/paymentsheet/CardUpdateParams;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)V

    return-object p1
.end method
