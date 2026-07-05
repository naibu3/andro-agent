.class public final Lcom/qonversion/android/sdk/dto/products/QProduct;
.super Ljava/lang/Object;
.source "QProduct.kt"


# annotations
.annotation runtime Lcom/squareup/moshi/JsonClass;
    generateAdapter = true
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQProduct.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QProduct.kt\ncom/qonversion/android/sdk/dto/products/QProduct\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n1#2:153\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J+\u0010+\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u000200H\u00d6\u0001J\u0015\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0000\u00a2\u0006\u0002\u00085J\u0012\u00106\u001a\u0002072\u0008\u00108\u001a\u0004\u0018\u000109H\u0007J\u0014\u00106\u001a\u0002072\n\u0008\u0002\u0010:\u001a\u0004\u0018\u00010\u0003H\u0007J\u001c\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u00032\n\u0008\u0002\u0010>\u001a\u0004\u0018\u00010?H\u0007J\t\u0010@\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u0008\"\u0004\u0008\u000b\u0010\u000cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0008R&\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0008R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010!R\u0013\u0010\"\u001a\u0004\u0018\u00010\u001f8F\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010!R\u0011\u0010$\u001a\u00020%8F\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\'\u00a8\u0006A"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "",
        "qonversionID",
        "",
        "storeID",
        "basePlanID",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "getBasePlanID",
        "()Ljava/lang/String;",
        "offeringID",
        "getOfferingID",
        "setOfferingID",
        "(Ljava/lang/String;)V",
        "prettyPrice",
        "getPrettyPrice",
        "getQonversionID",
        "skuDetail",
        "Lcom/android/billingclient/api/SkuDetails;",
        "getSkuDetail$annotations",
        "()V",
        "getSkuDetail",
        "()Lcom/android/billingclient/api/SkuDetails;",
        "setSkuDetail",
        "(Lcom/android/billingclient/api/SkuDetails;)V",
        "<set-?>",
        "Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;",
        "storeDetails",
        "getStoreDetails",
        "()Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;",
        "getStoreID",
        "subscriptionPeriod",
        "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;",
        "getSubscriptionPeriod",
        "()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;",
        "trialPeriod",
        "getTrialPeriod",
        "type",
        "Lcom/qonversion/android/sdk/dto/products/QProductType;",
        "getType",
        "()Lcom/qonversion/android/sdk/dto/products/QProductType;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "setStoreProductDetails",
        "",
        "productDetails",
        "Lcom/android/billingclient/api/ProductDetails;",
        "setStoreProductDetails$sdk_release",
        "toPurchaseModel",
        "Lcom/qonversion/android/sdk/dto/QPurchaseModel;",
        "offer",
        "Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;",
        "offerId",
        "toPurchaseUpdateModel",
        "Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;",
        "oldProductId",
        "updatePolicy",
        "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;",
        "toString",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final basePlanID:Ljava/lang/String;

.field private transient offeringID:Ljava/lang/String;

.field private final qonversionID:Ljava/lang/String;

.field private transient skuDetail:Lcom/android/billingclient/api/SkuDetails;

.field private transient storeDetails:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

.field private final storeID:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "store_id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "base_plan_id"
        .end annotation
    .end param

    const-string v0, "qonversionID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->qonversionID:Ljava/lang/String;

    .line 14
    iput-object p2, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeID:Ljava/lang/String;

    .line 15
    iput-object p3, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->basePlanID:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/products/QProduct;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->qonversionID:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeID:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->basePlanID:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/dto/products/QProduct;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QProduct;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getSkuDetail$annotations()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Consider using `storeDetails` instead"
    .end annotation

    return-void
.end method

.method public static synthetic toPurchaseModel$default(Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/QPurchaseModel;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 111
    :cond_0
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->toPurchaseModel(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QPurchaseModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic toPurchaseUpdateModel$default(Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 141
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/dto/products/QProduct;->toPurchaseUpdateModel(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;)Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->qonversionID:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeID:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->basePlanID:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QProduct;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "id"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "store_id"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lcom/squareup/moshi/Json;
            name = "base_plan_id"
        .end annotation
    .end param

    const-string v0, "qonversionID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QProduct;

    invoke-direct {v0, p1, p2, p3}, Lcom/qonversion/android/sdk/dto/products/QProduct;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/qonversion/android/sdk/dto/products/QProduct;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/dto/products/QProduct;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->qonversionID:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/products/QProduct;->qonversionID:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeID:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeID:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->basePlanID:Ljava/lang/String;

    iget-object p1, p1, Lcom/qonversion/android/sdk/dto/products/QProduct;->basePlanID:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getBasePlanID()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->basePlanID:Ljava/lang/String;

    return-object v0
.end method

.method public final getOfferingID()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->offeringID:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrettyPrice()Ljava/lang/String;
    .locals 3

    .line 94
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getType()Lcom/qonversion/android/sdk/dto/products/QProductType;

    move-result-object v0

    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QProductType;->InApp:Lcom/qonversion/android/sdk/dto/products/QProductType;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeDetails:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getInAppOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;->getPrice()Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->getFormattedPrice()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    .line 95
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeDetails:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getBasePlanSubscriptionOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_2

    .line 96
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeDetails:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getBasePlanSubscriptionOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getBasePlan()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getPrice()Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->getFormattedPrice()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    .line 97
    :cond_2
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->skuDetail:Lcom/android/billingclient/api/SkuDetails;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/android/billingclient/api/SkuDetails;->getPrice()Ljava/lang/String;

    move-result-object v2

    :cond_3
    :goto_1
    return-object v2
.end method

.method public final getQonversionID()Ljava/lang/String;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->qonversionID:Ljava/lang/String;

    return-object v0
.end method

.method public final getSkuDetail()Lcom/android/billingclient/api/SkuDetails;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->skuDetail:Lcom/android/billingclient/api/SkuDetails;

    return-object v0
.end method

.method public final getStoreDetails()Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeDetails:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    return-object v0
.end method

.method public final getStoreID()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeID:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubscriptionPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;
    .locals 3

    .line 43
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeDetails:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getDefaultSubscriptionOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 44
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getBasePlan()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getBillingPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    move-result-object v1

    :cond_0
    return-object v1

    .line 45
    :cond_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->skuDetail:Lcom/android/billingclient/api/SkuDetails;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/android/billingclient/api/SkuDetails;->getSubscriptionPeriod()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 46
    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_3

    .line 47
    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->Companion:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;

    invoke-virtual {v1, v0}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;->from(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    move-result-object v1

    :cond_3
    return-object v1
.end method

.method public final getTrialPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;
    .locals 3

    .line 56
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeDetails:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getDefaultSubscriptionOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 57
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getTrialPhase()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getBillingPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    move-result-object v1

    :cond_0
    return-object v1

    .line 58
    :cond_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->skuDetail:Lcom/android/billingclient/api/SkuDetails;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/android/billingclient/api/SkuDetails;->getFreeTrialPeriod()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 59
    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_3

    .line 60
    sget-object v1, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->Companion:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;

    invoke-virtual {v1, v0}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;->from(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    move-result-object v1

    :cond_3
    return-object v1
.end method

.method public final getType()Lcom/qonversion/android/sdk/dto/products/QProductType;
    .locals 4

    .line 68
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeDetails:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 69
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getSubscriptionOfferDetails()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v2

    if-ne v3, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getInAppOfferDetails()Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 70
    :goto_0
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->getProductType()Lcom/qonversion/android/sdk/dto/products/QProductType;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_2

    .line 79
    sget-object v3, Lcom/qonversion/android/sdk/dto/products/QProductType;->Unknown:Lcom/qonversion/android/sdk/dto/products/QProductType;

    if-eq v0, v3, :cond_2

    goto :goto_2

    .line 82
    :cond_2
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->skuDetail:Lcom/android/billingclient/api/SkuDetails;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/android/billingclient/api/SkuDetails;->getType()Ljava/lang/String;

    move-result-object v1

    :cond_3
    const-string v0, "inapp"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lcom/qonversion/android/sdk/dto/products/QProductType;->InApp:Lcom/qonversion/android/sdk/dto/products/QProductType;

    goto :goto_2

    .line 83
    :cond_4
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getTrialPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    move-result-object v0

    if-eqz v0, :cond_5

    sget-object v0, Lcom/qonversion/android/sdk/dto/products/QProductType;->Trial:Lcom/qonversion/android/sdk/dto/products/QProductType;

    goto :goto_2

    .line 84
    :cond_5
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->skuDetail:Lcom/android/billingclient/api/SkuDetails;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/android/billingclient/api/SkuDetails;->getIntroductoryPricePeriod()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/2addr v0, v2

    if-ne v0, v2, :cond_6

    sget-object v0, Lcom/qonversion/android/sdk/dto/products/QProductType;->Intro:Lcom/qonversion/android/sdk/dto/products/QProductType;

    goto :goto_2

    .line 85
    :cond_6
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getSubscriptionPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    move-result-object v0

    if-eqz v0, :cond_7

    sget-object v0, Lcom/qonversion/android/sdk/dto/products/QProductType;->Subscription:Lcom/qonversion/android/sdk/dto/products/QProductType;

    goto :goto_2

    .line 86
    :cond_7
    sget-object v0, Lcom/qonversion/android/sdk/dto/products/QProductType;->Unknown:Lcom/qonversion/android/sdk/dto/products/QProductType;

    :goto_2
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->qonversionID:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeID:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->basePlanID:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public final setOfferingID(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->offeringID:Ljava/lang/String;

    return-void
.end method

.method public final setSkuDetail(Lcom/android/billingclient/api/SkuDetails;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->skuDetail:Lcom/android/billingclient/api/SkuDetails;

    return-void
.end method

.method public final setStoreProductDetails$sdk_release(Lcom/android/billingclient/api/ProductDetails;)V
    .locals 2

    const-string v0, "productDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->basePlanID:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;-><init>(Lcom/android/billingclient/api/ProductDetails;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeDetails:Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    return-void
.end method

.method public final toPurchaseModel()Lcom/qonversion/android/sdk/dto/QPurchaseModel;
    .locals 2
    .annotation runtime Lkotlin/Deprecated;
        message = "Use new QPurchaseOptions object instead"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "QPurchaseOptions.Builder().setOfferId(offerId).build()"
            imports = {}
        .end subannotation
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->toPurchaseModel$default(Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/QPurchaseModel;

    move-result-object v0

    return-object v0
.end method

.method public final toPurchaseModel(Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;)Lcom/qonversion/android/sdk/dto/QPurchaseModel;
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        message = "Use new QPurchaseOptions object instead"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "QPurchaseOptions.Builder().setOffer(offer).build()"
            imports = {}
        .end subannotation
    .end annotation

    if-eqz p1, :cond_0

    .line 122
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getOfferId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->toPurchaseModel(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QPurchaseModel;

    move-result-object v0

    if-eqz p1, :cond_1

    .line 124
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getOfferId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    .line 125
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QPurchaseModel;->removeOffer()Lcom/qonversion/android/sdk/dto/QPurchaseModel;

    :cond_1
    return-object v0
.end method

.method public final toPurchaseModel(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QPurchaseModel;
    .locals 2
    .annotation runtime Lkotlin/Deprecated;
        message = "Use new QPurchaseOptions object instead"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "QPurchaseOptions.Builder().setOfferId(offerId).build()"
            imports = {}
        .end subannotation
    .end annotation

    .line 112
    new-instance v0, Lcom/qonversion/android/sdk/dto/QPurchaseModel;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->qonversionID:Ljava/lang/String;

    invoke-direct {v0, v1, p1}, Lcom/qonversion/android/sdk/dto/QPurchaseModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final toPurchaseUpdateModel(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;
    .locals 2
    .annotation runtime Lkotlin/Deprecated;
        message = "Use new QPurchaseOptions object instead"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "QPurchaseOptions.Builder().setOldProduct(TODO(\"pass old product here\")).build()"
            imports = {}
        .end subannotation
    .end annotation

    const-string v0, "oldProductId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->toPurchaseUpdateModel$default(Lcom/qonversion/android/sdk/dto/products/QProduct;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;

    move-result-object p1

    return-object p1
.end method

.method public final toPurchaseUpdateModel(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;)Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;
    .locals 8
    .annotation runtime Lkotlin/Deprecated;
        message = "Use new QPurchaseOptions object instead"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "QPurchaseOptions.Builder().setOldProduct(TODO(\"pass old product here\")).build()"
            imports = {}
        .end subannotation
    .end annotation

    const-string v0, "oldProductId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    new-instance v0, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;

    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->qonversionID:Ljava/lang/String;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, v0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v7}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->qonversionID:Ljava/lang/String;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->storeID:Ljava/lang/String;

    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/products/QProduct;->basePlanID:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "QProduct(qonversionID="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", storeID="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", basePlanID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
