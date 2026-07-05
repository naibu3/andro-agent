.class public final Lio/qonversion/sandwich/MappersKt;
.super Ljava/lang/Object;
.source "Mappers.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/qonversion/sandwich/MappersKt$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMappers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mappers.kt\nio/qonversion/sandwich/MappersKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,342:1\n1549#2:343\n1620#2,3:344\n1549#2:347\n1620#2,3:348\n1238#2,4:353\n1549#2:357\n1620#2,3:358\n1238#2,4:363\n1549#2:367\n1620#2,3:368\n1549#2:371\n1620#2,3:372\n1549#2:375\n1620#2,3:376\n1238#2,4:381\n1549#2:385\n1620#2,3:386\n1238#2,4:398\n453#3:351\n403#3:352\n453#3:361\n403#3:362\n453#3:379\n403#3:380\n494#3,7:389\n453#3:396\n403#3:397\n1#4:402\n*S KotlinDebug\n*F\n+ 1 Mappers.kt\nio/qonversion/sandwich/MappersKt\n*L\n113#1:343\n113#1:344,3\n154#1:347\n154#1:348,3\n170#1:353,4\n189#1:357\n189#1:358,3\n208#1:363,4\n215#1:367\n215#1:368,3\n222#1:371\n222#1:372,3\n245#1:375\n245#1:376,3\n250#1:381,4\n255#1:385\n255#1:386,3\n328#1:398,4\n170#1:351\n170#1:352\n208#1:361\n208#1:362\n250#1:379\n250#1:380\n327#1:389,7\n328#1:396\n328#1:397\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a(\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0001\u001a(\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0001\u001a\n\u0010\u0008\u001a\u00020\u0002*\u00020\t\u001a\n\u0010\u0008\u001a\u00020\u0002*\u00020\n\u001a\n\u0010\u0008\u001a\u00020\u0002*\u00020\u000b\u001a\u001c\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\r\u001a\u001c\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u000e\u001a\u001c\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u000f\u001a\u001c\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0010\u001a\u001c\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0011\u001a\u001c\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0012\u001a\u001c\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0013\u001a\u001c\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0005\u001a\u001c\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0007\u001a\u001c\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0014\u001a\u001c\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0015\u001a\u001c\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0016\u001a\u001c\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0017\u001a\u001c\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0018\u001a\u001c\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u0019\u001a\u001c\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u001a\u001a\u001c\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u001b\u001a\u001c\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u001c\u001a\u001c\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u001d\u001a\u001c\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u001e\u001a\u001c\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\u001f\u001a\u001c\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020 \u001a\u001c\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020!\u001a\u001c\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u00020\"\u001a(\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u0004*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00190\u0001\u001a\n\u0010$\u001a\u00020%*\u00020\u0013\u001a\u0018\u0010&\u001a\u00020\'*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\u001a$\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\u00a8\u0006)"
    }
    d2 = {
        "toEligibilityMap",
        "",
        "",
        "",
        "Lio/qonversion/sandwich/BridgeData;",
        "Lcom/qonversion/android/sdk/dto/eligibility/QEligibility;",
        "toEntitlementsMap",
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;",
        "toFormattedString",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;",
        "Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroupType;",
        "toMap",
        "Lcom/android/billingclient/api/SkuDetails;",
        "Lcom/qonversion/android/sdk/automations/dto/QActionResult;",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfigList;",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;",
        "Lcom/qonversion/android/sdk/dto/QUser;",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;",
        "Lcom/qonversion/android/sdk/dto/experiments/QExperiment;",
        "Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;",
        "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
        "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;",
        "Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;",
        "Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;",
        "Lcom/qonversion/android/sdk/dto/products/QProductPrice;",
        "Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;",
        "Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;",
        "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;",
        "Lcom/qonversion/android/sdk/dto/properties/QUserProperties;",
        "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;",
        "toProductsMap",
        "toSandwichError",
        "Lio/qonversion/sandwich/SandwichError;",
        "toScreenPresentationConfig",
        "Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;",
        "toStringMap",
        "sandwich_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final toEligibilityMap(Ljava/util/Map;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/eligibility/QEligibility;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 379
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v0, Ljava/util/Map;

    .line 380
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 381
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 382
    check-cast v1, Ljava/util/Map$Entry;

    .line 380
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    .line 250
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/dto/eligibility/QEligibility;

    invoke-static {v1}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/eligibility/QEligibility;)Ljava/util/Map;

    move-result-object v1

    .line 382
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final toEntitlementsMap(Ljava/util/Map;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 361
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v0, Ljava/util/Map;

    .line 362
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 363
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 364
    check-cast v1, Ljava/util/Map$Entry;

    .line 362
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    .line 208
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;

    invoke-static {v1}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;)Ljava/util/Map;

    move-result-object v1

    .line 364
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final toFormattedString(Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 311
    sget-object v0, Lio/qonversion/sandwich/MappersKt$WhenMappings;->$EnumSwitchMapping$2:[I

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    .line 314
    const-string p0, "unknown"

    goto :goto_0

    .line 313
    :cond_0
    const-string p0, "manual"

    goto :goto_0

    .line 312
    :cond_1
    const-string p0, "auto"

    :goto_0
    return-object p0
.end method

.method public static final toFormattedString(Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 302
    sget-object v0, Lio/qonversion/sandwich/MappersKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    .line 306
    const-string p0, "unknown"

    goto :goto_0

    .line 305
    :cond_0
    const-string p0, "experiment_control_group"

    goto :goto_0

    .line 304
    :cond_1
    const-string p0, "experiment_treatment_group"

    goto :goto_0

    .line 303
    :cond_2
    const-string p0, "remote_configuration"

    :goto_0
    return-object p0
.end method

.method public static final toFormattedString(Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroupType;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 284
    sget-object v0, Lio/qonversion/sandwich/MappersKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroupType;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    .line 287
    const-string p0, "unknown"

    goto :goto_0

    .line 286
    :cond_0
    const-string p0, "control"

    goto :goto_0

    .line 285
    :cond_1
    const-string p0, "treatment"

    :goto_0
    return-object p0
.end method

.method public static final toMap(Lcom/android/billingclient/api/SkuDetails;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/SkuDetails;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x13

    .line 48
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "description"

    invoke-virtual {p0}, Lcom/android/billingclient/api/SkuDetails;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 49
    const-string v1, "freeTrialPeriod"

    invoke-virtual {p0}, Lcom/android/billingclient/api/SkuDetails;->getFreeTrialPeriod()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 50
    const-string v1, "iconUrl"

    invoke-virtual {p0}, Lcom/android/billingclient/api/SkuDetails;->getIconUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 51
    const-string v1, "introductoryPrice"

    invoke-virtual {p0}, Lcom/android/billingclient/api/SkuDetails;->getIntroductoryPrice()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 52
    invoke-virtual {p0}, Lcom/android/billingclient/api/SkuDetails;->getIntroductoryPriceAmountMicros()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "introductoryPriceAmountMicros"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 53
    invoke-virtual {p0}, Lcom/android/billingclient/api/SkuDetails;->getIntroductoryPriceCycles()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "introductoryPriceCycles"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    .line 54
    const-string v1, "introductoryPricePeriod"

    invoke-virtual {p0}, Lcom/android/billingclient/api/SkuDetails;->getIntroductoryPricePeriod()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    .line 55
    const-string v1, "originalJson"

    invoke-virtual {p0}, Lcom/android/billingclient/api/SkuDetails;->getOriginalJson()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    .line 56
    const-string v1, "originalPrice"

    invoke-virtual {p0}, Lcom/android/billingclient/api/SkuDetails;->getOriginalPrice()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    .line 57
    invoke-virtual {p0}, Lcom/android/billingclient/api/SkuDetails;->getOriginalPriceAmountMicros()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "originalPriceAmountMicros"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    .line 58
    const-string v1, "price"

    invoke-virtual {p0}, Lcom/android/billingclient/api/SkuDetails;->getPrice()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    .line 59
    invoke-virtual {p0}, Lcom/android/billingclient/api/SkuDetails;->getPriceAmountMicros()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "priceAmountMicros"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    .line 60
    const-string v1, "priceCurrencyCode"

    invoke-virtual {p0}, Lcom/android/billingclient/api/SkuDetails;->getPriceCurrencyCode()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xc

    aput-object v1, v0, v2

    .line 61
    const-string v1, "sku"

    invoke-virtual {p0}, Lcom/android/billingclient/api/SkuDetails;->getSku()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xd

    aput-object v1, v0, v2

    .line 62
    const-string v1, "subscriptionPeriod"

    invoke-virtual {p0}, Lcom/android/billingclient/api/SkuDetails;->getSubscriptionPeriod()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xe

    aput-object v1, v0, v2

    .line 63
    const-string v1, "title"

    invoke-virtual {p0}, Lcom/android/billingclient/api/SkuDetails;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xf

    aput-object v1, v0, v2

    .line 64
    const-string v1, "type"

    invoke-virtual {p0}, Lcom/android/billingclient/api/SkuDetails;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x10

    aput-object v1, v0, v2

    .line 65
    invoke-virtual {p0}, Lcom/android/billingclient/api/SkuDetails;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "hashCode"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x11

    aput-object v1, v0, v2

    .line 66
    const-string v1, "toString"

    invoke-virtual {p0}, Lcom/android/billingclient/api/SkuDetails;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    const/16 v1, 0x12

    aput-object p0, v0, v1

    .line 47
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toMap(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/automations/dto/QActionResult;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    .line 320
    new-array v0, v0, [Lkotlin/Pair;

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/dto/QActionResult;->getType()Lcom/qonversion/android/sdk/automations/dto/QActionResultType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/automations/dto/QActionResultType;->getType()Ljava/lang/String;

    move-result-object v1

    const-string v2, "type"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 321
    const-string v1, "value"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/dto/QActionResult;->getValue()Ljava/util/Map;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 322
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/dto/QActionResult;->getError()Lcom/qonversion/android/sdk/dto/QonversionError;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/QonversionError;)Ljava/util/Map;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const-string v1, "error"

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    const/4 v1, 0x2

    aput-object p0, v0, v1

    .line 319
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toMap(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    .line 261
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "payload"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->getPayload()Ljava/util/Map;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 262
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->getExperiment()Lcom/qonversion/android/sdk/dto/experiments/QExperiment;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/experiments/QExperiment;)Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "experiment"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 263
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->getSource()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    move-result-object p0

    invoke-static {p0}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;)Ljava/util/Map;

    move-result-object p0

    const-string v1, "source"

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    const/4 v1, 0x2

    aput-object p0, v0, v1

    .line 260
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toMap(Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/QRemoteConfigList;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 255
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->getRemoteConfigs()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 385
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 386
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 387
    check-cast v1, Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    .line 255
    invoke-static {v1}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)Ljava/util/Map;

    move-result-object v1

    .line 387
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 388
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 255
    const-string p0, "remoteConfigs"

    invoke-static {p0, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    .line 254
    invoke-static {p0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toMap(Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x5

    .line 293
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "id"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 294
    const-string v1, "name"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 295
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->getType()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;

    move-result-object v1

    invoke-static {v1}, Lio/qonversion/sandwich/MappersKt;->toFormattedString(Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "type"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 296
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->getAssignmentType()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;

    move-result-object v1

    invoke-static {v1}, Lio/qonversion/sandwich/MappersKt;->toFormattedString(Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "assignmentType"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 297
    const-string v1, "contextKey"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->getContextKey()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    const/4 v1, 0x4

    aput-object p0, v0, v1

    .line 292
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toMap(Lcom/qonversion/android/sdk/dto/QUser;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/QUser;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 232
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "qonversionId"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/QUser;->getQonversionId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 233
    const-string v1, "identityId"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/QUser;->getIdentityId()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    const/4 v1, 0x1

    aput-object p0, v0, v1

    .line 231
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toMap(Lcom/qonversion/android/sdk/dto/QonversionError;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    .line 39
    new-array v0, v0, [Lkotlin/Pair;

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/QonversionError;->getCode()Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "code"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 40
    const-string v1, "description"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/QonversionError;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 41
    const-string v1, "additionalMessage"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/QonversionError;->getAdditionalMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    const/4 v1, 0x2

    aput-object p0, v0, v1

    .line 38
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toMap(Lcom/qonversion/android/sdk/dto/eligibility/QEligibility;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/eligibility/QEligibility;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/eligibility/QEligibility;->getStatus()Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    move-result-object p0

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->getType()Ljava/lang/String;

    move-result-object p0

    const-string v0, "status"

    invoke-static {v0, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toMap(Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xf

    .line 175
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "id"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 176
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getStartedDate()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    long-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string v2, "startedTimestamp"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 177
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getExpirationDate()Ljava/util/Date;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    long-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const-string v3, "expirationTimestamp"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    .line 178
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->isActive()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v3, "active"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    .line 179
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getSource()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;->name()Ljava/lang/String;

    move-result-object v1

    const-string v3, "source"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x4

    aput-object v1, v0, v3

    .line 180
    const-string v1, "productId"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getProductId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x5

    aput-object v1, v0, v3

    .line 181
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getRenewState()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;->getType()Ljava/lang/String;

    move-result-object v1

    const-string v3, "renewState"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x6

    aput-object v1, v0, v3

    .line 182
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getRenewsCount()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "renewsCount"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x7

    aput-object v1, v0, v3

    .line 183
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getTrialStartDate()Ljava/util/Date;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    long-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    const-string v3, "trialStartTimestamp"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x8

    aput-object v1, v0, v3

    .line 184
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getFirstPurchaseDate()Ljava/util/Date;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    long-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v2

    :goto_2
    const-string v3, "firstPurchaseTimestamp"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x9

    aput-object v1, v0, v3

    .line 185
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getLastPurchaseDate()Ljava/util/Date;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    long-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_3

    :cond_3
    move-object v1, v2

    :goto_3
    const-string v3, "lastPurchaseTimestamp"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0xa

    aput-object v1, v0, v3

    .line 186
    const-string v1, "lastActivatedOfferCode"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getLastActivatedOfferCode()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v4, 0xb

    aput-object v1, v0, v4

    .line 187
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getAutoRenewDisableDate()Ljava/util/Date;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    long-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    :cond_4
    const-string v1, "autoRenewDisableTimestamp"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xc

    aput-object v1, v0, v2

    .line 188
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getGrantType()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "grantType"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xd

    aput-object v1, v0, v2

    .line 189
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;->getTransactions()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 357
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {p0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 358
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 359
    check-cast v2, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;

    .line 189
    invoke-static {v2}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;)Ljava/util/Map;

    move-result-object v2

    .line 359
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 360
    :cond_5
    check-cast v1, Ljava/util/List;

    .line 189
    const-string p0, "transactions"

    invoke-static {p0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    const/16 v1, 0xe

    aput-object p0, v0, v1

    .line 174
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toMap(Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x9

    .line 195
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "originalTransactionId"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->getOriginalTransactionId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 196
    const-string v1, "transactionId"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->getTransactionId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 197
    const-string v1, "offerCode"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->getOfferCode()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 198
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->getTransactionDate()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    long-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string v2, "transactionTimestamp"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 199
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->getExpirationDate()Ljava/util/Date;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    long-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const-string v3, "expirationTimestamp"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x4

    aput-object v1, v0, v3

    .line 200
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->getTransactionRevocationDate()Ljava/util/Date;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    long-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    :cond_1
    const-string v1, "transactionRevocationTimestamp"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    .line 201
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->getOwnershipType()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ownershipType"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    .line 202
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->getType()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "type"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    .line 203
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;->getEnvironment()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;

    move-result-object p0

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;->name()Ljava/lang/String;

    move-result-object p0

    const-string v1, "environment"

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    const/16 v1, 0x8

    aput-object p0, v0, v1

    .line 194
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toMap(Lcom/qonversion/android/sdk/dto/experiments/QExperiment;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/experiments/QExperiment;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    .line 269
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "id"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 270
    const-string v1, "name"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 271
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/experiments/QExperiment;->getGroup()Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;

    move-result-object p0

    invoke-static {p0}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;)Ljava/util/Map;

    move-result-object p0

    const-string v1, "group"

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    const/4 v1, 0x2

    aput-object p0, v0, v1

    .line 268
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toMap(Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    .line 277
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "id"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 278
    const-string v1, "name"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 279
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;->getType()Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroupType;

    move-result-object p0

    invoke-static {p0}, Lio/qonversion/sandwich/MappersKt;->toFormattedString(Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroupType;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "type"

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    const/4 v1, 0x2

    aput-object p0, v0, v1

    .line 276
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toMap(Lcom/qonversion/android/sdk/dto/offerings/QOffering;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    .line 213
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "id"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->getOfferingID()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 214
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->getTag()Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;->getTag()Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "tag"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 215
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->getProducts()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 367
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 368
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 369
    check-cast v2, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 215
    invoke-static {v2}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/products/QProduct;)Ljava/util/Map;

    move-result-object v2

    .line 369
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 370
    :cond_0
    check-cast v1, Ljava/util/List;

    .line 215
    const-string p0, "products"

    invoke-static {p0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    const/4 v1, 0x2

    aput-object p0, v0, v1

    .line 212
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toMap(Lcom/qonversion/android/sdk/dto/offerings/QOfferings;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 221
    new-array v0, v0, [Lkotlin/Pair;

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->getMain()Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/offerings/QOffering;)Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "main"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 222
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->getAvailableOfferings()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 371
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 372
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 373
    check-cast v2, Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    .line 222
    invoke-static {v2}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/offerings/QOffering;)Ljava/util/Map;

    move-result-object v2

    .line 373
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 374
    :cond_1
    check-cast v1, Ljava/util/List;

    .line 222
    const-string p0, "availableOfferings"

    invoke-static {p0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    const/4 v1, 0x1

    aput-object p0, v0, v1

    .line 220
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toMap(Lcom/qonversion/android/sdk/dto/products/QProduct;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xa

    .line 73
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "id"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getQonversionID()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 74
    const-string v1, "storeId"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreID()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 75
    const-string v1, "basePlanId"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getBasePlanID()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 76
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getType()Lcom/qonversion/android/sdk/dto/products/QProductType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/products/QProductType;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "type"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 77
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getSubscriptionPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {v1}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;)Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const-string v3, "subscriptionPeriod"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x4

    aput-object v1, v0, v3

    .line 78
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getTrialPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;)Ljava/util/Map;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    const-string v3, "trialPeriod"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x5

    aput-object v1, v0, v3

    .line 79
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getSkuDetail()Lcom/android/billingclient/api/SkuDetails;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/android/billingclient/api/SkuDetails;)Ljava/util/Map;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v2

    :goto_2
    const-string v3, "skuDetails"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x6

    aput-object v1, v0, v3

    .line 80
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreDetails()Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;)Ljava/util/Map;

    move-result-object v2

    :cond_3
    const-string v1, "storeDetails"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    .line 81
    const-string v1, "prettyPrice"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getPrettyPrice()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    .line 82
    const-string v1, "offeringId"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getOfferingID()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    const/16 v1, 0x9

    aput-object p0, v0, v1

    .line 72
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toMap(Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;->getPrice()Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    move-result-object p0

    invoke-static {p0}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/products/QProductPrice;)Ljava/util/Map;

    move-result-object p0

    const-string v0, "price"

    invoke-static {v0, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    .line 142
    invoke-static {p0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toMap(Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 126
    new-array v0, v0, [Lkotlin/Pair;

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;->getCommitmentPaymentsCount()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "commitmentPaymentsCount"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 127
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;->getSubsequentCommitmentPaymentsCount()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v1, "subsequentCommitmentPaymentsCount"

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    const/4 v1, 0x1

    aput-object p0, v0, v1

    .line 125
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toMap(Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xc

    .line 109
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "basePlanId"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getBasePlanId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 110
    const-string v1, "offerId"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getOfferId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 111
    const-string v1, "offerToken"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getOfferToken()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 112
    const-string v1, "tags"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getTags()Ljava/util/List;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 113
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getPricingPhases()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 343
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 344
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 345
    check-cast v4, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 113
    invoke-static {v4}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;)Ljava/util/Map;

    move-result-object v4

    .line 345
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 346
    :cond_0
    check-cast v2, Ljava/util/List;

    .line 113
    const-string v1, "pricingPhases"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 114
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getBasePlan()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-static {v1}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;)Ljava/util/Map;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    const-string v4, "basePlan"

    invoke-static {v4, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v4, 0x5

    aput-object v1, v0, v4

    .line 115
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getInstallmentPlanDetails()Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/products/QProductInstallmentPlanDetails;)Ljava/util/Map;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v2

    :goto_2
    const-string v4, "installmentPlanDetails"

    invoke-static {v4, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v4, 0x6

    aput-object v1, v0, v4

    .line 116
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getTrialPhase()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;)Ljava/util/Map;

    move-result-object v1

    goto :goto_3

    :cond_3
    move-object v1, v2

    :goto_3
    const-string v4, "trialPhase"

    invoke-static {v4, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v4, 0x7

    aput-object v1, v0, v4

    .line 117
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getIntroPhase()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {v1}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;)Ljava/util/Map;

    move-result-object v2

    :cond_4
    const-string v1, "introPhase"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    .line 118
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getHasTrial()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "hasTrial"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    .line 119
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getHasIntro()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "hasIntro"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v3

    .line 120
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getHasTrialOrIntro()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    const-string v1, "hasTrialOrIntro"

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    const/16 v1, 0xb

    aput-object p0, v0, v1

    .line 108
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toMap(Lcom/qonversion/android/sdk/dto/products/QProductPrice;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/products/QProductPrice;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x5

    .line 133
    new-array v0, v0, [Lkotlin/Pair;

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->getPriceAmountMicros()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "priceAmountMicros"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 134
    const-string v1, "priceCurrencyCode"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->getPriceCurrencyCode()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 135
    const-string v1, "formattedPrice"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->getFormattedPrice()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 136
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->isFree()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "isFree"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 137
    const-string v1, "currencySymbol"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->getCurrencySymbol()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    const/4 v1, 0x4

    aput-object p0, v0, v1

    .line 132
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toMap(Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    .line 96
    new-array v0, v0, [Lkotlin/Pair;

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getPrice()Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    move-result-object v1

    invoke-static {v1}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/products/QProductPrice;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "price"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 97
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getBillingPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    move-result-object v1

    invoke-static {v1}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "billingPeriod"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 98
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getBillingCycleCount()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "billingCycleCount"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 99
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getRecurrenceMode()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$RecurrenceMode;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "recurrenceMode"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 100
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getType()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "type"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 101
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->isTrial()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "isTrial"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    .line 102
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->isIntro()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "isIntro"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    .line 103
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->isBasePlan()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    const-string v1, "isBasePlan"

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    const/4 v1, 0x7

    aput-object p0, v0, v1

    .line 95
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toMap(Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x11

    .line 149
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "basePlanId"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getBasePlanId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 150
    const-string v1, "productId"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getProductId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 151
    const-string v1, "name"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 152
    const-string v1, "title"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 153
    const-string v1, "description"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 154
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getSubscriptionOfferDetails()Ljava/util/List;

    move-result-object v1

    const/16 v2, 0xa

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    check-cast v1, Ljava/lang/Iterable;

    .line 347
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .line 348
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 349
    check-cast v5, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    .line 154
    invoke-static {v5}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;)Ljava/util/Map;

    move-result-object v5

    .line 349
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 350
    :cond_0
    check-cast v4, Ljava/util/List;

    goto :goto_1

    :cond_1
    move-object v4, v3

    .line 154
    :goto_1
    const-string v1, "subscriptionOfferDetails"

    invoke-static {v1, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v4, 0x5

    aput-object v1, v0, v4

    .line 155
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getDefaultSubscriptionOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;)Ljava/util/Map;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v3

    :goto_2
    const-string v4, "defaultSubscriptionOfferDetails"

    invoke-static {v4, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v4, 0x6

    aput-object v1, v0, v4

    .line 156
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getBasePlanSubscriptionOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;)Ljava/util/Map;

    move-result-object v1

    goto :goto_3

    :cond_3
    move-object v1, v3

    :goto_3
    const-string v4, "basePlanSubscriptionOfferDetails"

    invoke-static {v4, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v4, 0x7

    aput-object v1, v0, v4

    .line 157
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getInAppOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {v1}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;)Ljava/util/Map;

    move-result-object v3

    :cond_4
    const-string v1, "inAppOfferDetails"

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x8

    aput-object v1, v0, v3

    .line 158
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getHasTrialOffer()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v3, "hasTrialOffer"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x9

    aput-object v1, v0, v3

    .line 159
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getHasIntroOffer()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v3, "hasIntroOffer"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v2

    .line 160
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getHasTrialOrIntroOffer()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "hasTrialOrIntroOffer"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    .line 161
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getProductType()Lcom/qonversion/android/sdk/dto/products/QProductType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/products/QProductType;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "productType"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xc

    aput-object v1, v0, v2

    .line 162
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->isInApp()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "isInApp"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xd

    aput-object v1, v0, v2

    .line 163
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->isSubscription()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "isSubscription"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xe

    aput-object v1, v0, v2

    .line 164
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->isPrepaid()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "isPrepaid"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xf

    aput-object v1, v0, v2

    .line 165
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->isInstallment()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    const-string v1, "isInstallment"

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    const/16 v1, 0x10

    aput-object p0, v0, v1

    .line 148
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toMap(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    .line 88
    new-array v0, v0, [Lkotlin/Pair;

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->getUnitCount()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "unitCount"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 89
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->getUnit()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "unit"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 90
    const-string v1, "iso"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->getIso()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    const/4 v1, 0x2

    aput-object p0, v0, v1

    .line 87
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toMap(Lcom/qonversion/android/sdk/dto/properties/QUserProperties;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/properties/QUserProperties;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/properties/QUserProperties;->getProperties()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 375
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 376
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 377
    check-cast v1, Lcom/qonversion/android/sdk/dto/properties/QUserProperty;

    .line 245
    invoke-static {v1}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/properties/QUserProperty;)Ljava/util/Map;

    move-result-object v1

    .line 377
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 378
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 246
    const-string p0, "properties"

    invoke-static {p0, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toMap(Lcom/qonversion/android/sdk/dto/properties/QUserProperty;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 239
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "key"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/properties/QUserProperty;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 240
    const-string v1, "value"

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/properties/QUserProperty;->getValue()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    const/4 v1, 0x1

    aput-object p0, v0, v1

    .line 238
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toProductsMap(Ljava/util/Map;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 351
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v0, Ljava/util/Map;

    .line 352
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    .line 353
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 354
    check-cast v1, Ljava/util/Map$Entry;

    .line 352
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    .line 170
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/dto/products/QProduct;

    invoke-static {v1}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/products/QProduct;)Ljava/util/Map;

    move-result-object v1

    .line 354
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final toSandwichError(Lcom/qonversion/android/sdk/dto/QonversionError;)Lio/qonversion/sandwich/SandwichError;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    new-instance v0, Lio/qonversion/sandwich/SandwichError;

    invoke-direct {v0, p0}, Lio/qonversion/sandwich/SandwichError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-object v0
.end method

.method public static final toScreenPresentationConfig(Ljava/util/Map;)Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 333
    :try_start_0
    const-string v1, "presentationStyle"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_1

    instance-of v1, p0, Ljava/lang/String;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    if-eqz p0, :cond_1

    .line 334
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;->valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :cond_1
    move-object p0, v0

    :goto_1
    if-eqz p0, :cond_2

    .line 340
    new-instance v0, Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;

    invoke-direct {v0, p0}, Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;-><init>(Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;)V

    goto :goto_2

    :cond_2
    new-instance p0, Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;-><init>(Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, p0

    :goto_2
    return-object v0
.end method

.method public static final toStringMap(Ljava/util/Map;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 389
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 390
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 391
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 392
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 395
    :cond_1
    check-cast v0, Ljava/util/Map;

    .line 396
    new-instance p0, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v1

    invoke-direct {p0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast p0, Ljava/util/Map;

    .line 397
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 398
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 399
    check-cast v1, Ljava/util/Map$Entry;

    .line 397
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    .line 328
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 399
    invoke-interface {p0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    return-object p0
.end method
