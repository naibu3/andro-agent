.class public final Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata$Companion;
.super Ljava/lang/Object;
.source "PaymentMethodMetadata.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentMethodMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodMetadata.kt\ncom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,431:1\n1557#2:432\n1628#2,3:433\n*S KotlinDebug\n*F\n+ 1 PaymentMethodMetadata.kt\ncom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata$Companion\n*L\n397#1:432\n397#1:433,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JS\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0000\u00a2\u0006\u0002\u0008\u0015JC\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0000\u00a2\u0006\u0002\u0008\u001aJ\u001d\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0000\u00a2\u0006\u0002\u0008\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata$Companion;",
        "",
        "<init>",
        "()V",
        "createForPaymentElement",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
        "elementsSession",
        "Lcom/stripe/android/model/ElementsSession;",
        "configuration",
        "Lcom/stripe/android/common/model/CommonConfiguration;",
        "sharedDataSpecs",
        "",
        "Lcom/stripe/android/ui/core/elements/SharedDataSpec;",
        "externalPaymentMethodSpecs",
        "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;",
        "isGooglePayReady",
        "",
        "linkState",
        "Lcom/stripe/android/paymentsheet/state/LinkState;",
        "customerMetadata",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;",
        "createForPaymentElement$paymentsheet_release",
        "createForCustomerSheet",
        "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
        "paymentMethodSaveConsentBehavior",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;",
        "createForCustomerSheet$paymentsheet_release",
        "createForNativeLink",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "linkAccount",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "createForNativeLink$paymentsheet_release",
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

    .line 287
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final createForCustomerSheet$paymentsheet_release(Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Ljava/util/List;ZLcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;)Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ElementsSession;",
            "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/SharedDataSpec;",
            ">;Z",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;",
            ")",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "elementsSession"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "configuration"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "paymentMethodSaveConsentBehavior"

    move-object/from16 v3, p3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "sharedDataSpecs"

    move-object/from16 v14, p4

    invoke-static {v14, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "customerMetadata"

    move-object/from16 v4, p6

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 346
    invoke-virtual {v0}, Lcom/stripe/android/model/ElementsSession;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v3

    .line 347
    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v4

    .line 351
    sget-object v1, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;->Companion:Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType$Companion;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move/from16 v7, p5

    invoke-virtual {v1, v0, v7, v5, v6}, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType$Companion;->listFrom(Lcom/stripe/android/model/ElementsSession;ZLcom/stripe/android/paymentsheet/state/LinkState;Z)Ljava/util/List;

    move-result-object v8

    .line 357
    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getPaymentMethodOrder$paymentsheet_release()Ljava/util/List;

    move-result-object v9

    .line 358
    sget-object v1, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;->Companion:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Companion;

    .line 359
    invoke-virtual {v0}, Lcom/stripe/android/model/ElementsSession;->getCardBrandChoice()Lcom/stripe/android/model/ElementsSession$CardBrandChoice;

    move-result-object v10

    if-eqz v10, :cond_0

    invoke-virtual {v10}, Lcom/stripe/android/model/ElementsSession$CardBrandChoice;->getEligible()Z

    move-result v6

    .line 360
    :cond_0
    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getPreferredNetworks()Ljava/util/List;

    move-result-object v10

    .line 358
    invoke-virtual {v1, v6, v10}, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Companion;->create(ZLjava/util/List;)Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    move-result-object v10

    .line 362
    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getMerchantDisplayName()Ljava/lang/String;

    move-result-object v11

    .line 363
    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getDefaultBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v12

    .line 369
    new-instance v1, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    const/4 v6, 0x1

    invoke-direct {v1, v5, v6, v5}, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 370
    invoke-virtual {v0}, Lcom/stripe/android/model/ElementsSession;->getLinkSettings()Lcom/stripe/android/model/ElementsSession$LinkSettings;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {v6}, Lcom/stripe/android/model/ElementsSession$LinkSettings;->getLinkMode()Lcom/stripe/android/model/LinkMode;

    move-result-object v6

    move-object/from16 v21, v6

    goto :goto_0

    :cond_1
    move-object/from16 v21, v5

    .line 373
    :goto_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v16

    .line 374
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v15

    .line 375
    new-instance v6, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;

    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheet$Configuration;->getCardBrandAcceptance$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    move-result-object v2

    invoke-direct {v6, v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;)V

    .line 376
    invoke-virtual {v0}, Lcom/stripe/android/model/ElementsSession;->getElementsSessionId()Ljava/lang/String;

    move-result-object v26

    .line 377
    sget-object v2, Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;->INSTANCE:Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;

    const/4 v13, 0x2

    invoke-static {v2, v0, v5, v13, v5}, Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;->invoke$default(Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;ILjava/lang/Object;)Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    move-result-object v24

    .line 379
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v28

    .line 345
    new-instance v2, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    .line 375
    move-object/from16 v25, v6

    check-cast v25, Lcom/stripe/android/CardBrandFilter;

    const/16 v27, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v13, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v20, p3

    move/from16 v18, p5

    move-object/from16 v17, p6

    move-object/from16 v19, v1

    .line 345
    invoke-direct/range {v2 .. v28}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;-><init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;ZZZLjava/util/List;Ljava/util/List;Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;ZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/model/LinkMode;Lcom/stripe/android/paymentsheet/state/LinkState;Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;Ljava/util/Map;)V

    return-object v2
.end method

.method public final createForNativeLink$paymentsheet_release(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/model/LinkAccount;)Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;
    .locals 28

    const-string v0, "configuration"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccount"

    move-object/from16 v2, p2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 388
    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v2

    .line 389
    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v3

    .line 393
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v7

    .line 394
    sget-object v0, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->INSTANCE:Lcom/stripe/android/common/configuration/ConfigurationDefaults;

    invoke-virtual {v0}, Lcom/stripe/android/common/configuration/ConfigurationDefaults;->getPaymentMethodOrder()Ljava/util/List;

    move-result-object v8

    .line 395
    sget-object v0, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;->Companion:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Companion;

    .line 396
    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration;->getCardBrandChoice()Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;->getEligible()Z

    move-result v4

    if-ne v4, v6, :cond_0

    move v4, v6

    goto :goto_0

    :cond_0
    move v4, v5

    .line 397
    :goto_0
    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration;->getCardBrandChoice()Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;

    move-result-object v9

    const/4 v10, 0x0

    if-eqz v9, :cond_2

    invoke-virtual {v9}, Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;->getPreferredNetworks()Ljava/util/List;

    move-result-object v9

    if-eqz v9, :cond_2

    check-cast v9, Ljava/lang/Iterable;

    .line 432
    new-instance v11, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v9, v12}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v11, Ljava/util/Collection;

    .line 433
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 434
    check-cast v12, Ljava/lang/String;

    .line 398
    sget-object v13, Lcom/stripe/android/model/CardBrand;->Companion:Lcom/stripe/android/model/CardBrand$Companion;

    invoke-virtual {v13, v12}, Lcom/stripe/android/model/CardBrand$Companion;->fromCode(Ljava/lang/String;)Lcom/stripe/android/model/CardBrand;

    move-result-object v12

    .line 434
    invoke-interface {v11, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 435
    :cond_1
    check-cast v11, Ljava/util/List;

    goto :goto_2

    :cond_2
    move-object v11, v10

    :goto_2
    if-nez v11, :cond_3

    .line 399
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v11

    .line 395
    :cond_3
    invoke-virtual {v0, v4, v11}, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Companion;->create(ZLjava/util/List;)Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    move-result-object v9

    .line 401
    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration;->getMerchantName()Ljava/lang/String;

    move-result-object v0

    .line 403
    invoke-static/range {p1 .. p2}, Lcom/stripe/android/link/utils/LinkBillingDetailsUtilsKt;->effectiveBillingDetails(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/model/LinkAccount;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v11

    .line 408
    new-instance v4, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    .line 411
    sget-object v12, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->Companion:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions$Companion;

    invoke-virtual {v12}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions$Companion;->createForNativeLink$paymentsheet_release()Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;

    move-result-object v12

    .line 408
    invoke-direct {v4, v6, v5, v12}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;-><init>(ZZLcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;)V

    .line 413
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v13

    .line 414
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v15

    .line 415
    new-instance v5, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior$Disabled;

    invoke-direct {v5, v10}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior$Disabled;-><init>(Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;)V

    .line 416
    new-instance v12, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    invoke-direct {v12, v10, v6, v10}, Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 421
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v14

    .line 422
    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration;->getCardBrandFilter()Lcom/stripe/android/CardBrandFilter;

    move-result-object v24

    .line 423
    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration;->getElementsSessionId()Ljava/lang/String;

    move-result-object v25

    .line 424
    sget-object v1, Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;->INSTANCE:Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;

    const/4 v6, 0x2

    invoke-static {v1, v10, v10, v6, v10}, Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;->invoke$default(Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;ILjava/lang/Object;)Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    move-result-object v23

    .line 426
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v27

    .line 387
    new-instance v1, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    .line 415
    move-object/from16 v19, v5

    check-cast v19, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    const/16 v22, 0x0

    const/16 v26, 0x0

    move-object/from16 v16, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v18, v12

    const/4 v12, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object v10, v0

    .line 387
    invoke-direct/range {v1 .. v27}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;-><init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;ZZZLjava/util/List;Ljava/util/List;Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;ZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/model/LinkMode;Lcom/stripe/android/paymentsheet/state/LinkState;Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;Ljava/util/Map;)V

    return-object v1
.end method

.method public final createForPaymentElement$paymentsheet_release(Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/common/model/CommonConfiguration;Ljava/util/List;Ljava/util/List;ZLcom/stripe/android/paymentsheet/state/LinkState;Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;)Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ElementsSession;",
            "Lcom/stripe/android/common/model/CommonConfiguration;",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/SharedDataSpec;",
            ">;",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;",
            ">;Z",
            "Lcom/stripe/android/paymentsheet/state/LinkState;",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;",
            ")",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "elementsSession"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "configuration"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "sharedDataSpecs"

    move-object/from16 v14, p3

    invoke-static {v14, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "externalPaymentMethodSpecs"

    move-object/from16 v3, p4

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "customerMetadata"

    move-object/from16 v4, p7

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 297
    invoke-virtual {v0}, Lcom/stripe/android/model/ElementsSession;->getLinkSettings()Lcom/stripe/android/model/ElementsSession$LinkSettings;

    move-result-object v1

    .line 299
    invoke-virtual {v0}, Lcom/stripe/android/model/ElementsSession;->getStripeIntent()Lcom/stripe/android/model/StripeIntent;

    move-result-object v3

    .line 300
    invoke-virtual {v2}, Lcom/stripe/android/common/model/CommonConfiguration;->getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-result-object v4

    .line 301
    invoke-virtual {v2}, Lcom/stripe/android/common/model/CommonConfiguration;->getAllowsDelayedPaymentMethods()Z

    move-result v5

    .line 303
    invoke-virtual {v2}, Lcom/stripe/android/common/model/CommonConfiguration;->getAllowsPaymentMethodsRequiringShippingAddress()Z

    move-result v6

    .line 304
    invoke-virtual {v0}, Lcom/stripe/android/model/ElementsSession;->getEnableLinkInSpm()Z

    move-result v7

    .line 305
    sget-object v8, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;->Companion:Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType$Companion;

    .line 309
    invoke-virtual {v2}, Lcom/stripe/android/common/model/CommonConfiguration;->getShopPayConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;

    move-result-object v9

    const/4 v10, 0x0

    if-eqz v9, :cond_0

    const/4 v9, 0x1

    goto :goto_0

    :cond_0
    move v9, v10

    :goto_0
    move/from16 v11, p5

    move-object/from16 v12, p6

    .line 305
    invoke-virtual {v8, v0, v11, v12, v9}, Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType$Companion;->listFrom(Lcom/stripe/android/model/ElementsSession;ZLcom/stripe/android/paymentsheet/state/LinkState;Z)Ljava/util/List;

    move-result-object v8

    .line 311
    invoke-virtual {v2}, Lcom/stripe/android/common/model/CommonConfiguration;->getPaymentMethodOrder()Ljava/util/List;

    move-result-object v9

    .line 312
    sget-object v13, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;->Companion:Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Companion;

    .line 313
    invoke-virtual {v0}, Lcom/stripe/android/model/ElementsSession;->getCardBrandChoice()Lcom/stripe/android/model/ElementsSession$CardBrandChoice;

    move-result-object v15

    if-eqz v15, :cond_1

    invoke-virtual {v15}, Lcom/stripe/android/model/ElementsSession$CardBrandChoice;->getEligible()Z

    move-result v10

    .line 314
    :cond_1
    invoke-virtual {v2}, Lcom/stripe/android/common/model/CommonConfiguration;->getPreferredNetworks()Ljava/util/List;

    move-result-object v15

    .line 312
    invoke-virtual {v13, v10, v15}, Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility$Companion;->create(ZLjava/util/List;)Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;

    move-result-object v10

    .line 316
    invoke-virtual {v2}, Lcom/stripe/android/common/model/CommonConfiguration;->getMerchantDisplayName()Ljava/lang/String;

    move-result-object v11

    .line 317
    invoke-virtual {v2}, Lcom/stripe/android/common/model/CommonConfiguration;->getDefaultBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v12

    .line 318
    invoke-virtual {v2}, Lcom/stripe/android/common/model/CommonConfiguration;->getShippingDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v13

    .line 322
    invoke-static {v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadataKtxKt;->toPaymentSheetSaveConsentBehavior(Lcom/stripe/android/model/ElementsSession;)Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;

    move-result-object v20

    .line 323
    invoke-virtual {v2}, Lcom/stripe/android/common/model/CommonConfiguration;->getLink()Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;

    move-result-object v19

    if-eqz v1, :cond_2

    .line 324
    invoke-virtual {v1}, Lcom/stripe/android/model/ElementsSession$LinkSettings;->getLinkMode()Lcom/stripe/android/model/LinkMode;

    move-result-object v16

    move-object/from16 v21, v16

    goto :goto_1

    :cond_2
    const/16 v21, 0x0

    :goto_1
    if-eqz v1, :cond_3

    .line 326
    invoke-virtual {v1}, Lcom/stripe/android/model/ElementsSession$LinkSettings;->getLinkConsumerIncentive()Lcom/stripe/android/model/LinkConsumerIncentive;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentiveKt;->toPaymentMethodIncentive(Lcom/stripe/android/model/LinkConsumerIncentive;)Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;

    move-result-object v1

    move-object/from16 v23, v1

    goto :goto_2

    :cond_3
    const/16 v23, 0x0

    .line 328
    :goto_2
    invoke-static/range {p1 .. p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadataKtxKt;->toDisplayableCustomPaymentMethods(Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/common/model/CommonConfiguration;)Ljava/util/List;

    move-result-object v1

    .line 329
    new-instance v15, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;

    move-object/from16 v17, v1

    invoke-virtual {v2}, Lcom/stripe/android/common/model/CommonConfiguration;->getCardBrandAcceptance()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    move-result-object v1

    invoke-direct {v15, v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilter;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;)V

    .line 330
    sget-object v1, Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;->INSTANCE:Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;

    const/4 v2, 0x2

    move-object/from16 v18, v3

    const/4 v3, 0x0

    invoke-static {v1, v0, v3, v2, v3}, Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;->invoke$default(Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;ILjava/lang/Object;)Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    move-result-object v24

    .line 331
    invoke-virtual {v0}, Lcom/stripe/android/model/ElementsSession;->getElementsSessionId()Ljava/lang/String;

    move-result-object v26

    .line 332
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/common/model/CommonConfiguration;->getShopPayConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;

    move-result-object v27

    .line 333
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/common/model/CommonConfiguration;->getTermsDisplay()Ljava/util/Map;

    move-result-object v28

    .line 298
    new-instance v2, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;

    .line 329
    move-object/from16 v25, v15

    check-cast v25, Lcom/stripe/android/CardBrandFilter;

    move-object/from16 v16, p4

    move-object/from16 v22, p6

    move-object/from16 v15, v17

    move-object/from16 v3, v18

    move/from16 v18, p5

    move-object/from16 v17, p7

    .line 298
    invoke-direct/range {v2 .. v28}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;-><init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;ZZZLjava/util/List;Ljava/util/List;Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;ZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/model/LinkMode;Lcom/stripe/android/paymentsheet/state/LinkState;Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;Ljava/util/Map;)V

    return-object v2
.end method
