.class public final Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepositoryKt;
.super Ljava/lang/Object;
.source "ElementsSessionRepository.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nElementsSessionRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElementsSessionRepository.kt\ncom/stripe/android/paymentsheet/repositories/ElementsSessionRepositoryKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n774#2:251\n865#2,2:252\n1557#2:255\n1628#2,3:256\n1#3:254\n*S KotlinDebug\n*F\n+ 1 ElementsSessionRepository.kt\ncom/stripe/android/paymentsheet/repositories/ElementsSessionRepositoryKt\n*L\n117#1:251\n117#1:252,2\n180#1:255\n180#1:256,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0002\u001aL\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00082\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0000\u001a\u0018\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0008*\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u0012H\u0002\u001a\u0014\u0010\u0018\u001a\u00020\u0001*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002\u001a>\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u0002H\u001e0\u001d\"\u0004\u0008\u0000\u0010\u001e*\u0008\u0012\u0004\u0012\u0002H\u001e0\u001d2\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u001e0\u001d0 H\u0082\u0008\u00a2\u0006\u0002\u0010\"\"\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u000b*\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\"\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u000b*\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0015\u00a8\u0006#"
    }
    d2 = {
        "withoutWeChatPay",
        "Lcom/stripe/android/model/StripeIntent;",
        "toElementsSessionParams",
        "Lcom/stripe/android/model/ElementsSessionParams;",
        "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
        "customer",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
        "customPaymentMethods",
        "",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;",
        "externalPaymentMethods",
        "",
        "savedPaymentMethodSelectionId",
        "mobileSessionId",
        "appId",
        "toElementSessionParam",
        "toSellerDetails",
        "Lcom/stripe/android/model/ElementsSessionParams$SellerDetails;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;",
        "customerSessionClientSecret",
        "getCustomerSessionClientSecret",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;)Ljava/lang/String;",
        "legacyCustomerEphemeralKey",
        "getLegacyCustomerEphemeralKey",
        "toStripeIntent",
        "Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;",
        "options",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "getResultOrElse",
        "Lkotlin/Result;",
        "T",
        "transform",
        "Lkotlin/Function1;",
        "",
        "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
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
.method public static final synthetic access$toStripeIntent(Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;Lcom/stripe/android/core/networking/ApiRequest$Options;)Lcom/stripe/android/model/StripeIntent;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepositoryKt;->toStripeIntent(Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;Lcom/stripe/android/core/networking/ApiRequest$Options;)Lcom/stripe/android/model/StripeIntent;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$withoutWeChatPay(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/model/StripeIntent;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepositoryKt;->withoutWeChatPay(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/model/StripeIntent;

    move-result-object p0

    return-object p0
.end method

.method private static final getCustomerSessionClientSecret(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;)Ljava/lang/String;
    .locals 2

    .line 199
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;->getAccessType$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType;

    move-result-object v0

    .line 200
    instance-of v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$CustomerSession;

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;->getAccessType$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$CustomerSession;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$CustomerSession;->getCustomerSessionClientSecret()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 201
    :cond_0
    instance-of p0, v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$LegacyCustomerEphemeralKey;

    if-eqz p0, :cond_1

    const/4 p0, 0x0

    return-object p0

    .line 199
    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final getLegacyCustomerEphemeralKey(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;)Ljava/lang/String;
    .locals 2

    .line 205
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;->getAccessType$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType;

    move-result-object v0

    .line 206
    instance-of v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$CustomerSession;

    if-eqz v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 207
    :cond_0
    instance-of v0, v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$LegacyCustomerEphemeralKey;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;->getAccessType$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$LegacyCustomerEphemeralKey;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$LegacyCustomerEphemeralKey;->getEphemeralKeySecret()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 205
    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final getResultOrElse(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "+",
            "Lkotlin/Result<",
            "+TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 248
    invoke-static {p0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Result;

    invoke-virtual {p0}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method private static final toElementSessionParam(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 180
    check-cast p0, Ljava/lang/Iterable;

    .line 255
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 256
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 257
    check-cast v1, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;

    .line 181
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;->getId()Ljava/lang/String;

    move-result-object v1

    .line 257
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 258
    :cond_0
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public static final toElementsSessionParams(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/ElementsSessionParams;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/stripe/android/model/ElementsSessionParams;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customPaymentMethods"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "externalPaymentMethods"

    move-object/from16 v9, p3

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mobileSessionId"

    move-object/from16 v7, p5

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appId"

    move-object/from16 v10, p6

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 132
    invoke-static {p1}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepositoryKt;->getCustomerSessionClientSecret(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;)Ljava/lang/String;

    move-result-object v2

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object v4, v0

    :goto_0
    if-eqz p1, :cond_1

    .line 133
    invoke-static {p1}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepositoryKt;->getLegacyCustomerEphemeralKey(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    move-object v5, v0

    .line 134
    invoke-static {v1}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepositoryKt;->toElementSessionParam(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    .line 137
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$PaymentIntent;

    if-eqz v0, :cond_2

    .line 139
    check-cast p0, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$PaymentIntent;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$PaymentIntent;->getClientSecret()Ljava/lang/String;

    move-result-object v2

    .line 138
    new-instance v1, Lcom/stripe/android/model/ElementsSessionParams$PaymentIntentType;

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/4 v3, 0x0

    move-object/from16 v6, p4

    invoke-direct/range {v1 .. v12}, Lcom/stripe/android/model/ElementsSessionParams$PaymentIntentType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lcom/stripe/android/model/ElementsSessionParams;

    return-object v1

    .line 150
    :cond_2
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$SetupIntent;

    if-eqz v0, :cond_3

    .line 152
    check-cast p0, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$SetupIntent;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$SetupIntent;->getClientSecret()Ljava/lang/String;

    move-result-object v2

    .line 151
    new-instance v1, Lcom/stripe/android/model/ElementsSessionParams$SetupIntentType;

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/4 v3, 0x0

    move-object/from16 v9, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v10, p6

    invoke-direct/range {v1 .. v12}, Lcom/stripe/android/model/ElementsSessionParams$SetupIntentType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lcom/stripe/android/model/ElementsSessionParams;

    return-object v1

    .line 163
    :cond_3
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;

    if-eqz v0, :cond_4

    .line 172
    check-cast p0, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;

    .line 165
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;->getIntentConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/IntentConfigurationKtxKt;->toDeferredIntentParams(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;)Lcom/stripe/android/model/DeferredIntentParams;

    move-result-object v3

    .line 172
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode$DeferredIntent;->getIntentConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepositoryKt;->toSellerDetails(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;)Lcom/stripe/android/model/ElementsSessionParams$SellerDetails;

    move-result-object v11

    .line 164
    new-instance v1, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v2, 0x0

    move-object/from16 v6, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    move-object v7, v4

    move-object v4, v8

    move-object v8, v5

    move-object/from16 v5, p3

    invoke-direct/range {v1 .. v13}, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;-><init>(Ljava/lang/String;Lcom/stripe/android/model/DeferredIntentParams;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ElementsSessionParams$SellerDetails;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lcom/stripe/android/model/ElementsSessionParams;

    return-object v1

    .line 136
    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final toSellerDetails(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;)Lcom/stripe/android/model/ElementsSessionParams$SellerDetails;
    .locals 3

    .line 187
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;->getIntentBehavior$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$IntentBehavior;

    move-result-object v0

    .line 188
    instance-of v1, v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$IntentBehavior$SharedPaymentToken;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;->getIntentBehavior$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$IntentBehavior;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$IntentBehavior$SharedPaymentToken;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$IntentBehavior$SharedPaymentToken;->getSellerDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SellerDetails;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 190
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SellerDetails;->getExternalId()Ljava/lang/String;

    move-result-object v0

    .line 191
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SellerDetails;->getNetworkId()Ljava/lang/String;

    move-result-object p0

    .line 189
    new-instance v1, Lcom/stripe/android/model/ElementsSessionParams$SellerDetails;

    invoke-direct {v1, p0, v0}, Lcom/stripe/android/model/ElementsSessionParams$SellerDetails;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_0
    return-object v2

    .line 194
    :cond_1
    instance-of p0, v0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$IntentBehavior$Default;

    if-eqz p0, :cond_2

    return-object v2

    .line 187
    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final toStripeIntent(Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;Lcom/stripe/android/core/networking/ApiRequest$Options;)Lcom/stripe/android/model/StripeIntent;
    .locals 31

    .line 211
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->getDeferredIntentParams()Lcom/stripe/android/model/DeferredIntentParams;

    move-result-object v0

    .line 212
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v5

    .line 213
    invoke-virtual {v0}, Lcom/stripe/android/model/DeferredIntentParams;->getMode()Lcom/stripe/android/model/DeferredIntentParams$Mode;

    move-result-object v1

    .line 214
    instance-of v2, v1, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;

    if-eqz v2, :cond_0

    new-instance v2, Lcom/stripe/android/model/PaymentIntent;

    .line 215
    invoke-virtual {v0}, Lcom/stripe/android/model/DeferredIntentParams;->getPaymentMethodConfigurationId()Ljava/lang/String;

    move-result-object v3

    .line 216
    invoke-virtual {v0}, Lcom/stripe/android/model/DeferredIntentParams;->getPaymentMethodTypes()Ljava/util/List;

    move-result-object v4

    .line 217
    check-cast v1, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;

    invoke-virtual {v1}, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->getAmount()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    .line 218
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->getClientSecret()Ljava/lang/String;

    move-result-object v10

    .line 221
    invoke-virtual {v0}, Lcom/stripe/android/model/DeferredIntentParams;->getMode()Lcom/stripe/android/model/DeferredIntentParams$Mode;

    move-result-object v0

    invoke-interface {v0}, Lcom/stripe/android/model/DeferredIntentParams$Mode;->getCurrency()Ljava/lang/String;

    move-result-object v15

    .line 222
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getApiKeyIsLiveMode()Z

    move-result v17

    .line 223
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v25

    .line 224
    invoke-virtual {v1}, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;->getPaymentMethodOptionsJsonString()Ljava/lang/String;

    move-result-object v28

    const v29, 0x6fe8b8

    const/16 v30, 0x0

    move-wide v13, v5

    move-object v5, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    .line 214
    invoke-direct/range {v2 .. v30}, Lcom/stripe/android/model/PaymentIntent;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;JLcom/stripe/android/model/PaymentIntent$CancellationReason;Lcom/stripe/android/model/PaymentIntent$CaptureMethod;Ljava/lang/String;Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/PaymentIntent$Error;Lcom/stripe/android/model/PaymentIntent$Shipping;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$NextActionData;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Lcom/stripe/android/model/StripeIntent;

    return-object v2

    :cond_0
    move-wide v13, v5

    .line 226
    instance-of v1, v1, Lcom/stripe/android/model/DeferredIntentParams$Mode$Setup;

    if-eqz v1, :cond_1

    .line 227
    invoke-virtual {v0}, Lcom/stripe/android/model/DeferredIntentParams;->getPaymentMethodConfigurationId()Ljava/lang/String;

    move-result-object v3

    .line 230
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;->getClientSecret()Ljava/lang/String;

    move-result-object v8

    .line 233
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/core/networking/ApiRequest$Options;->getApiKeyIsLiveMode()Z

    move-result v10

    .line 234
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v18

    .line 237
    invoke-virtual {v0}, Lcom/stripe/android/model/DeferredIntentParams;->getPaymentMethodTypes()Ljava/util/List;

    move-result-object v0

    .line 239
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v17

    .line 226
    new-instance v2, Lcom/stripe/android/model/SetupIntent;

    const v21, 0x11080

    const/16 v22, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-wide v5, v13

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v13, v0

    invoke-direct/range {v2 .. v22}, Lcom/stripe/android/model/SetupIntent;-><init>(Ljava/lang/String;Lcom/stripe/android/model/SetupIntent$CancellationReason;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/SetupIntent$Error;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$NextActionData;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Lcom/stripe/android/model/StripeIntent;

    return-object v2

    .line 213
    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private static final withoutWeChatPay(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/model/StripeIntent;
    .locals 32

    move-object/from16 v0, p0

    .line 117
    invoke-interface {v0}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethodTypes()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 251
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .line 252
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    .line 117
    sget-object v5, Lcom/stripe/android/model/PaymentMethod$Type;->WeChatPay:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v5, v5, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 252
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 253
    :cond_1
    check-cast v2, Ljava/util/List;

    .line 251
    check-cast v2, Ljava/util/Collection;

    .line 117
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "card"

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    :cond_2
    move-object v5, v2

    check-cast v5, Ljava/util/List;

    .line 119
    instance-of v1, v0, Lcom/stripe/android/model/PaymentIntent;

    if-eqz v1, :cond_3

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/model/PaymentIntent;

    const v30, 0xfffffd

    const/16 v31, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-static/range {v3 .. v31}, Lcom/stripe/android/model/PaymentIntent;->copy$default(Lcom/stripe/android/model/PaymentIntent;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;JLcom/stripe/android/model/PaymentIntent$CancellationReason;Lcom/stripe/android/model/PaymentIntent$CaptureMethod;Ljava/lang/String;Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/PaymentIntent$Error;Lcom/stripe/android/model/PaymentIntent$Shipping;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$NextActionData;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentIntent;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/StripeIntent;

    return-object v0

    .line 120
    :cond_3
    instance-of v1, v0, Lcom/stripe/android/model/SetupIntent;

    if-eqz v1, :cond_4

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/model/SetupIntent;

    const v22, 0x1fdff

    const/16 v23, 0x0

    const/4 v4, 0x0

    move-object v14, v5

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v3 .. v23}, Lcom/stripe/android/model/SetupIntent;->copy$default(Lcom/stripe/android/model/SetupIntent;Ljava/lang/String;Lcom/stripe/android/model/SetupIntent$CancellationReason;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/SetupIntent$Error;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$NextActionData;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/SetupIntent;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/StripeIntent;

    return-object v0

    .line 118
    :cond_4
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
