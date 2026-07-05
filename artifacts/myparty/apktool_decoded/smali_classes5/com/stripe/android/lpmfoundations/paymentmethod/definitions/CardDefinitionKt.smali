.class public final Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CardDefinitionKt;
.super Ljava/lang/Object;
.source "CardDefinition.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CardDefinitionKt$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCardDefinition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardDefinition.kt\ncom/stripe/android/lpmfoundations/paymentmethod/definitions/CardDefinitionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,331:1\n1#2:332\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001aN\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\n2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0018\u00010\nH\u0002\u001a0\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a8\u0006\u0012"
    }
    d2 = {
        "toInternal",
        "Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;",
        "cardBillingElements",
        "",
        "Lcom/stripe/android/uicore/elements/FormElement;",
        "collectionMode",
        "autocompleteAddressInteractorFactory",
        "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;",
        "initialValues",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "",
        "shippingValues",
        "contactInformationElement",
        "collectEmail",
        "",
        "collectPhone",
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
.method public static final synthetic access$cardBillingElements(Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;Ljava/util/Map;Ljava/util/Map;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CardDefinitionKt;->cardBillingElements(Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;Ljava/util/Map;Ljava/util/Map;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$contactInformationElement(Ljava/util/Map;ZZ)Lcom/stripe/android/uicore/elements/FormElement;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CardDefinitionKt;->contactInformationElement(Ljava/util/Map;ZZ)Lcom/stripe/android/uicore/elements/FormElement;

    move-result-object p0

    return-object p0
.end method

.method private static final cardBillingElements(Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;Ljava/util/Map;Ljava/util/Map;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;",
            "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;"
        }
    .end annotation

    const/4 v11, 0x0

    if-eqz p3, :cond_0

    .line 241
    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getSameAsShipping()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 242
    invoke-static {v0}, Lkotlin/text/StringsKt;->toBooleanStrictOrNull(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 243
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 244
    new-instance v1, Lcom/stripe/android/uicore/elements/SameAsShippingElement;

    .line 245
    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getSameAsShipping()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    .line 246
    new-instance v3, Lcom/stripe/android/uicore/elements/SameAsShippingController;

    invoke-direct {v3, v0}, Lcom/stripe/android/uicore/elements/SameAsShippingController;-><init>(Z)V

    .line 244
    invoke-direct {v1, v2, v3}, Lcom/stripe/android/uicore/elements/SameAsShippingElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/SameAsShippingController;)V

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object v6, v11

    .line 250
    :goto_0
    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string v1, "credit_billing"

    invoke-virtual {v0, v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    .line 251
    sget-object v0, Lcom/stripe/android/core/model/CountryUtils;->INSTANCE:Lcom/stripe/android/core/model/CountryUtils;

    invoke-virtual {v0}, Lcom/stripe/android/core/model/CountryUtils;->getSupportedBillingCountries()Ljava/util/Set;

    move-result-object v3

    .line 249
    new-instance v0, Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v4, 0x0

    move-object v8, p0

    move-object v5, p1

    move-object v2, p2

    move-object v7, p3

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Ljava/util/Set;Lcom/stripe/android/uicore/elements/DropdownFieldController;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x2

    .line 260
    new-array v1, v1, [Lcom/stripe/android/uicore/elements/FormElement;

    sget-object v2, Lcom/stripe/android/uicore/elements/SectionElement;->Companion:Lcom/stripe/android/uicore/elements/SectionElement$Companion;

    .line 261
    check-cast v0, Lcom/stripe/android/uicore/elements/SectionFieldElement;

    .line 262
    sget v3, Lcom/stripe/android/ui/core/R$string;->stripe_billing_details:I

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    const/4 v7, 0x4

    invoke-static {v3, v5, v11, v7, v11}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v3

    .line 260
    invoke-virtual {v2, v0, v3}, Lcom/stripe/android/uicore/elements/SectionElement$Companion;->wrap(Lcom/stripe/android/uicore/elements/SectionFieldElement;Lcom/stripe/android/core/strings/ResolvableString;)Lcom/stripe/android/uicore/elements/SectionElement;

    move-result-object v0

    aput-object v0, v1, v4

    const/4 v0, 0x1

    .line 264
    aput-object v6, v1, v0

    .line 259
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static final contactInformationElement(Ljava/util/Map;ZZ)Lcom/stripe/android/uicore/elements/FormElement;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;ZZ)",
            "Lcom/stripe/android/uicore/elements/FormElement;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 274
    new-array v0, v0, [Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;

    new-instance v1, Lcom/stripe/android/uicore/elements/EmailElement;

    .line 275
    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getEmail()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    .line 274
    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/uicore/elements/EmailElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const/4 p1, 0x0

    .line 276
    aput-object v1, v0, p1

    .line 277
    new-instance v1, Lcom/stripe/android/uicore/elements/PhoneNumberElement;

    .line 278
    sget-object v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v3}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getPhone()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    .line 279
    sget-object v4, Lcom/stripe/android/uicore/elements/PhoneNumberController;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;

    .line 280
    sget-object v5, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v5}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getPhone()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v5

    invoke-interface {p0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-nez p0, :cond_1

    const-string p0, ""

    :cond_1
    move-object v5, p0

    const/16 v10, 0x1e

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 279
    invoke-static/range {v4 .. v11}, Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;->createPhoneNumberController$default(Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZZILjava/lang/Object;)Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-result-object p0

    .line 277
    invoke-direct {v1, v3, p0}, Lcom/stripe/android/uicore/elements/PhoneNumberElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/PhoneNumberController;)V

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    const/4 p0, 0x1

    .line 282
    aput-object v1, v0, p0

    .line 273
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    .line 285
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_3

    return-object v2

    .line 287
    :cond_3
    sget-object p2, Lcom/stripe/android/uicore/elements/SectionElement;->Companion:Lcom/stripe/android/uicore/elements/SectionElement$Companion;

    .line 288
    sget v0, Lcom/stripe/android/ui/core/R$string;->stripe_contact_information:I

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v1, 0x4

    invoke-static {v0, p1, v2, v1, v2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    .line 287
    invoke-virtual {p2, p0, p1}, Lcom/stripe/android/uicore/elements/SectionElement$Companion;->wrap(Ljava/util/List;Lcom/stripe/android/core/strings/ResolvableString;)Lcom/stripe/android/uicore/elements/SectionElement;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/uicore/elements/FormElement;

    return-object p0
.end method

.method public static final toInternal(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;)Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    sget-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CardDefinitionKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    .line 229
    sget-object p0, Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;->Full:Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;

    return-object p0

    .line 219
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 225
    :cond_1
    sget-object p0, Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;->Never:Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;

    return-object p0

    .line 221
    :cond_2
    sget-object p0, Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;->Automatic:Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;

    return-object p0
.end method
