.class public final Lcom/qonversion/android/sdk/dto/products/QProductPrice;
.super Ljava/lang/Object;
.source "QProductPrice.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u001d\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u00112\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u000e\u00a8\u0006#"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/products/QProductPrice;",
        "",
        "priceAmountMicros",
        "",
        "priceCurrencyCode",
        "",
        "formattedPrice",
        "(JLjava/lang/String;Ljava/lang/String;)V",
        "currency",
        "Ljava/util/Currency;",
        "getCurrency",
        "()Ljava/util/Currency;",
        "currencySymbol",
        "getCurrencySymbol",
        "()Ljava/lang/String;",
        "getFormattedPrice",
        "isFree",
        "",
        "()Z",
        "priceAmount",
        "",
        "getPriceAmount",
        "()D",
        "getPriceAmountMicros",
        "()J",
        "getPriceCurrencyCode",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
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
.field private final currency:Ljava/util/Currency;

.field private final currencySymbol:Ljava/lang/String;

.field private final formattedPrice:Ljava/lang/String;

.field private final isFree:Z

.field private final priceAmount:D

.field private final priceAmountMicros:J

.field private final priceCurrencyCode:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "priceCurrencyCode"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formattedPrice"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-wide p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->priceAmountMicros:J

    .line 18
    iput-object p3, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->priceCurrencyCode:Ljava/lang/String;

    .line 23
    iput-object p4, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->formattedPrice:Ljava/lang/String;

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 28
    :goto_0
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->isFree:Z

    const/4 p1, 0x0

    .line 34
    :try_start_0
    invoke-static {p3}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-object p2, p1

    .line 33
    :goto_1
    iput-object p2, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->currency:Ljava/util/Currency;

    if-eqz p2, :cond_1

    .line 42
    invoke-virtual {p2}, Ljava/util/Currency;->getSymbol()Ljava/lang/String;

    move-result-object p1

    :cond_1
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->currencySymbol:Ljava/lang/String;

    .line 47
    iget-wide p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->priceAmountMicros:J

    long-to-double p1, p1

    const-wide p3, 0x412e848000000000L    # 1000000.0

    div-double/2addr p1, p3

    iput-wide p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->priceAmount:D

    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/dto/products/QProductPrice;JLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/products/QProductPrice;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-wide p1, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->priceAmountMicros:J

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p3, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->priceCurrencyCode:Ljava/lang/String;

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-object p4, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->formattedPrice:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->copy(JLjava/lang/String;Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->priceAmountMicros:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->priceCurrencyCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->formattedPrice:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(JLjava/lang/String;Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/products/QProductPrice;
    .locals 1

    const-string v0, "priceCurrencyCode"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formattedPrice"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    iget-wide v3, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->priceAmountMicros:J

    iget-wide v5, p1, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->priceAmountMicros:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->priceCurrencyCode:Ljava/lang/String;

    iget-object v3, p1, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->priceCurrencyCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->formattedPrice:Ljava/lang/String;

    iget-object p1, p1, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->formattedPrice:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCurrency()Ljava/util/Currency;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->currency:Ljava/util/Currency;

    return-object v0
.end method

.method public final getCurrencySymbol()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->currencySymbol:Ljava/lang/String;

    return-object v0
.end method

.method public final getFormattedPrice()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->formattedPrice:Ljava/lang/String;

    return-object v0
.end method

.method public final getPriceAmount()D
    .locals 2

    .line 47
    iget-wide v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->priceAmount:D

    return-wide v0
.end method

.method public final getPriceAmountMicros()J
    .locals 2

    .line 13
    iget-wide v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->priceAmountMicros:J

    return-wide v0
.end method

.method public final getPriceCurrencyCode()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->priceCurrencyCode:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->priceAmountMicros:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->priceCurrencyCode:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->formattedPrice:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isFree()Z
    .locals 1

    .line 28
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->isFree:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-wide v0, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->priceAmountMicros:J

    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->priceCurrencyCode:Ljava/lang/String;

    iget-object v3, p0, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->formattedPrice:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "QProductPrice(priceAmountMicros="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", priceCurrencyCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", formattedPrice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
