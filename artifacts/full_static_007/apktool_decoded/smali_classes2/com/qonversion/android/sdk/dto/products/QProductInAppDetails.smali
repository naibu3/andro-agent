.class public final Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;
.super Ljava/lang/Object;
.source "QProductInAppDetails.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;",
        "",
        "originalOneTimePurchaseOfferDetails",
        "Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;",
        "(Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;)V",
        "getOriginalOneTimePurchaseOfferDetails",
        "()Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;",
        "price",
        "Lcom/qonversion/android/sdk/dto/products/QProductPrice;",
        "getPrice",
        "()Lcom/qonversion/android/sdk/dto/products/QProductPrice;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final originalOneTimePurchaseOfferDetails:Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;

.field private final price:Lcom/qonversion/android/sdk/dto/products/QProductPrice;


# direct methods
.method public constructor <init>(Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;)V
    .locals 5

    const-string v0, "originalOneTimePurchaseOfferDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;->originalOneTimePurchaseOfferDetails:Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;

    .line 18
    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;->getPriceAmountMicros()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;->getPriceCurrencyCode()Ljava/lang/String;

    move-result-object v3

    const-string v4, "getPriceCurrencyCode(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;->getFormattedPrice()Ljava/lang/String;

    move-result-object p1

    const-string v4, "getFormattedPrice(...)"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 17
    iput-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;->price:Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;->originalOneTimePurchaseOfferDetails:Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;->copy(Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;)Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;->originalOneTimePurchaseOfferDetails:Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;

    return-object v0
.end method

.method public final copy(Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;)Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;
    .locals 1

    const-string v0, "originalOneTimePurchaseOfferDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;

    invoke-direct {v0, p1}, Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;-><init>(Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;->originalOneTimePurchaseOfferDetails:Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;

    iget-object p1, p1, Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;->originalOneTimePurchaseOfferDetails:Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getOriginalOneTimePurchaseOfferDetails()Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;->originalOneTimePurchaseOfferDetails:Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;

    return-object v0
.end method

.method public final getPrice()Lcom/qonversion/android/sdk/dto/products/QProductPrice;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;->price:Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;->originalOneTimePurchaseOfferDetails:Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;

    invoke-virtual {v0}, Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductInAppDetails;->originalOneTimePurchaseOfferDetails:Lcom/android/billingclient/api/ProductDetails$OneTimePurchaseOfferDetails;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "QProductInAppDetails(originalOneTimePurchaseOfferDetails="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
