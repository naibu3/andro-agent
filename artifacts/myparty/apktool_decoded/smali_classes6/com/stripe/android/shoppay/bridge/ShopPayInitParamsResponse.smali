.class public final Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;
.super Ljava/lang/Object;
.source "ShopPayInitParamsResponse.kt"

# interfaces
.implements Lcom/stripe/android/shoppay/bridge/JsonSerializer;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0008\u0010\u000e\u001a\u00020\u000fH\u0016J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;",
        "Lcom/stripe/android/shoppay/bridge/JsonSerializer;",
        "shopId",
        "",
        "customerSessionClientSecret",
        "amountTotal",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;I)V",
        "getShopId",
        "()Ljava/lang/String;",
        "getCustomerSessionClientSecret",
        "getAmountTotal",
        "()I",
        "toJson",
        "Lorg/json/JSONObject;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
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


# static fields
.field public static final $stable:I


# instance fields
.field private final amountTotal:I

.field private final customerSessionClientSecret:Ljava/lang/String;

.field private final shopId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    const-string v0, "shopId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerSessionClientSecret"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->shopId:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->customerSessionClientSecret:Ljava/lang/String;

    .line 8
    iput p3, p0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->amountTotal:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->shopId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->customerSessionClientSecret:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->amountTotal:I

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->copy(Ljava/lang/String;Ljava/lang/String;I)Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->shopId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->customerSessionClientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->amountTotal:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;I)Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;
    .locals 1

    const-string v0, "shopId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerSessionClientSecret"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->shopId:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->shopId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->customerSessionClientSecret:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->customerSessionClientSecret:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->amountTotal:I

    iget p1, p1, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->amountTotal:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAmountTotal()I
    .locals 1

    .line 8
    iget v0, p0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->amountTotal:I

    return v0
.end method

.method public final getCustomerSessionClientSecret()Ljava/lang/String;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->customerSessionClientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final getShopId()Ljava/lang/String;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->shopId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->shopId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->customerSessionClientSecret:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->amountTotal:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toJson()Lorg/json/JSONObject;
    .locals 3

    .line 11
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 12
    const-string v1, "shopId"

    iget-object v2, p0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->shopId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 13
    const-string v1, "customerSessionClientSecret"

    iget-object v2, p0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->customerSessionClientSecret:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 14
    const-string v1, "amountTotal"

    iget v2, p0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->amountTotal:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->shopId:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->customerSessionClientSecret:Ljava/lang/String;

    iget v2, p0, Lcom/stripe/android/shoppay/bridge/ShopPayInitParamsResponse;->amountTotal:I

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ShopPayInitParamsResponse(shopId="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", customerSessionClientSecret="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", amountTotal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
