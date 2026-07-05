.class public final Lcom/stripe/android/shoppay/bridge/ShippingResponse;
.super Ljava/lang/Object;
.source "ShippingResponse.kt"

# interfaces
.implements Lcom/stripe/android/shoppay/bridge/JsonSerializer;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nShippingResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShippingResponse.kt\ncom/stripe/android/shoppay/bridge/ShippingResponse\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,19:1\n1557#2:20\n1628#2,3:21\n1557#2:24\n1628#2,3:25\n*S KotlinDebug\n*F\n+ 1 ShippingResponse.kt\ncom/stripe/android/shoppay/bridge/ShippingResponse\n*L\n13#1:20\n13#1:21,3\n14#1:24\n14#1:25,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0081\u0008\u0018\u00002\u00020\u0001B1\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0008\u0010\u0011\u001a\u00020\u0012H\u0016J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ>\u0010\u0016\u001a\u00020\u00002\u0010\u0008\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\u0008\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0008H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/shoppay/bridge/ShippingResponse;",
        "Lcom/stripe/android/shoppay/bridge/JsonSerializer;",
        "lineItems",
        "",
        "Lcom/stripe/android/shoppay/bridge/ECELineItem;",
        "shippingRates",
        "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;",
        "totalAmount",
        "",
        "<init>",
        "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)V",
        "getLineItems",
        "()Ljava/util/List;",
        "getShippingRates",
        "getTotalAmount",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "toJson",
        "Lorg/json/JSONObject;",
        "component1",
        "component2",
        "component3",
        "copy",
        "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)Lcom/stripe/android/shoppay/bridge/ShippingResponse;",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final lineItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/shoppay/bridge/ECELineItem;",
            ">;"
        }
    .end annotation
.end field

.field private final shippingRates:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;",
            ">;"
        }
    .end annotation
.end field

.field private final totalAmount:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/shoppay/bridge/ECELineItem;",
            ">;",
            "Ljava/util/List<",
            "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;",
            ">;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->lineItems:Ljava/util/List;

    .line 8
    iput-object p2, p0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->shippingRates:Ljava/util/List;

    .line 9
    iput-object p3, p0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->totalAmount:Ljava/lang/Integer;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/shoppay/bridge/ShippingResponse;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/stripe/android/shoppay/bridge/ShippingResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->lineItems:Ljava/util/List;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->shippingRates:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->totalAmount:Ljava/lang/Integer;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->copy(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)Lcom/stripe/android/shoppay/bridge/ShippingResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/shoppay/bridge/ECELineItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->lineItems:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->shippingRates:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->totalAmount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)Lcom/stripe/android/shoppay/bridge/ShippingResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/shoppay/bridge/ECELineItem;",
            ">;",
            "Ljava/util/List<",
            "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;",
            ">;",
            "Ljava/lang/Integer;",
            ")",
            "Lcom/stripe/android/shoppay/bridge/ShippingResponse;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/shoppay/bridge/ShippingResponse;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/shoppay/bridge/ShippingResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/shoppay/bridge/ShippingResponse;

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->lineItems:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->lineItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->shippingRates:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->shippingRates:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->totalAmount:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->totalAmount:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getLineItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/shoppay/bridge/ECELineItem;",
            ">;"
        }
    .end annotation

    .line 7
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->lineItems:Ljava/util/List;

    return-object v0
.end method

.method public final getShippingRates()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;",
            ">;"
        }
    .end annotation

    .line 8
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->shippingRates:Ljava/util/List;

    return-object v0
.end method

.method public final getTotalAmount()Ljava/lang/Integer;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->totalAmount:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->lineItems:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->shippingRates:Ljava/util/List;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->totalAmount:Ljava/lang/Integer;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toJson()Lorg/json/JSONObject;
    .locals 6

    .line 12
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 13
    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->lineItems:Ljava/util/List;

    const/16 v2, 0xa

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    check-cast v1, Ljava/lang/Iterable;

    .line 20
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .line 21
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 22
    check-cast v5, Lcom/stripe/android/shoppay/bridge/ECELineItem;

    .line 13
    invoke-virtual {v5}, Lcom/stripe/android/shoppay/bridge/ECELineItem;->toJson()Lorg/json/JSONObject;

    move-result-object v5

    .line 22
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 23
    :cond_0
    check-cast v4, Ljava/util/List;

    goto :goto_1

    :cond_1
    move-object v4, v3

    .line 13
    :goto_1
    check-cast v4, Ljava/util/Collection;

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1, v4}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    const-string v4, "lineItems"

    invoke-virtual {v0, v4, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 14
    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->shippingRates:Ljava/util/List;

    if-eqz v1, :cond_3

    check-cast v1, Ljava/lang/Iterable;

    .line 24
    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 25
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 26
    check-cast v2, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;

    .line 14
    invoke-virtual {v2}, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;->toJson()Lorg/json/JSONObject;

    move-result-object v2

    .line 26
    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 27
    :cond_2
    check-cast v3, Ljava/util/List;

    .line 14
    :cond_3
    check-cast v3, Ljava/util/Collection;

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1, v3}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    const-string v2, "shippingRates"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 15
    const-string v1, "totalAmount"

    iget-object v2, p0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->totalAmount:Ljava/lang/Integer;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->lineItems:Ljava/util/List;

    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->shippingRates:Ljava/util/List;

    iget-object v2, p0, Lcom/stripe/android/shoppay/bridge/ShippingResponse;->totalAmount:Ljava/lang/Integer;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ShippingResponse(lineItems="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", shippingRates="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", totalAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
