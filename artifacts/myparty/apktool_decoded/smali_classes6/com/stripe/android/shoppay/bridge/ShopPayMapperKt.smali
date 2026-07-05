.class public final Lcom/stripe/android/shoppay/bridge/ShopPayMapperKt;
.super Ljava/lang/Object;
.source "ShopPayMapper.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/shoppay/bridge/ShopPayMapperKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0004*\u00020\u0005H\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0006H\u0000\u001a\u000c\u0010\u0007\u001a\u00020\u0008*\u00020\u0002H\u0000\u001a\u000c\u0010\t\u001a\u00020\n*\u00020\u0003H\u0000\u001a\u000c\u0010\u000b\u001a\u00020\u000c*\u00020\u0005H\u0000\u001a\u000c\u0010\r\u001a\u00020\u000e*\u00020\u0006H\u0000\u001a\u000c\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "toJSON",
        "Lorg/json/JSONObject;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;",
        "",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit;",
        "toECELineItem",
        "Lcom/stripe/android/shoppay/bridge/ECELineItem;",
        "toECEShippingRate",
        "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;",
        "toECEDeliveryEstimate",
        "Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;",
        "toECEDeliveryEstimateUnit",
        "Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;",
        "toECEDeliveryTimeUnit",
        "Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;",
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
.method public static final toECEDeliveryEstimate(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate;)Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$Text;

    if-eqz v0, :cond_0

    .line 68
    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Text;

    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$Text;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$Text;->getValue()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Text;-><init>(Ljava/lang/String;)V

    check-cast v0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;

    return-object v0

    .line 70
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$Range;

    if-eqz v0, :cond_3

    .line 71
    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;

    .line 72
    new-instance v1, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;

    .line 74
    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$Range;

    .line 73
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$Range;->getMaximum()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-static {v2}, Lcom/stripe/android/shoppay/bridge/ShopPayMapperKt;->toECEDeliveryEstimateUnit(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit;)Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v3

    .line 74
    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$Range;->getMinimum()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-static {p0}, Lcom/stripe/android/shoppay/bridge/ShopPayMapperKt;->toECEDeliveryEstimateUnit(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit;)Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    move-result-object v3

    .line 72
    :cond_2
    invoke-direct {v1, v2, v3}, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;-><init>(Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;)V

    .line 71
    invoke-direct {v0, v1}, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;-><init>(Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;)V

    check-cast v0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;

    return-object v0

    .line 66
    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final toECEDeliveryEstimateUnit(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit;)Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    .line 83
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit;->getUnit()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/shoppay/bridge/ShopPayMapperKt;->toECEDeliveryTimeUnit(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;)Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    move-result-object v1

    .line 84
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit;->getValue()I

    move-result p0

    .line 82
    invoke-direct {v0, v1, p0}, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;-><init>(Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;I)V

    return-object v0
.end method

.method public static final toECEDeliveryTimeUnit(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;)Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    sget-object v0, Lcom/stripe/android/shoppay/bridge/ShopPayMapperKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    .line 94
    sget-object p0, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->MONTH:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    return-object p0

    .line 89
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 93
    :cond_1
    sget-object p0, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->WEEK:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    return-object p0

    .line 92
    :cond_2
    sget-object p0, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->BUSINESS_DAY:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    return-object p0

    .line 91
    :cond_3
    sget-object p0, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->DAY:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    return-object p0

    .line 90
    :cond_4
    sget-object p0, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->HOUR:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    return-object p0
.end method

.method public static final toECELineItem(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;)Lcom/stripe/android/shoppay/bridge/ECELineItem;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECELineItem;

    .line 51
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;->getName()Ljava/lang/String;

    move-result-object v1

    .line 52
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;->getAmount()I

    move-result p0

    .line 50
    invoke-direct {v0, v1, p0}, Lcom/stripe/android/shoppay/bridge/ECELineItem;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method

.method public static final toECEShippingRate(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;)Lcom/stripe/android/shoppay/bridge/ECEShippingRate;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;

    .line 58
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;->getId()Ljava/lang/String;

    move-result-object v1

    .line 59
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;->getAmount()I

    move-result v2

    .line 60
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;->getDisplayName()Ljava/lang/String;

    move-result-object v3

    .line 61
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;->getDeliveryEstimate()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lcom/stripe/android/shoppay/bridge/ShopPayMapperKt;->toECEDeliveryEstimate(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate;)Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 57
    :goto_0
    invoke-direct {v0, v1, v2, v3, p0}, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;)V

    return-object v0
.end method

.method public static final toJSON(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate;)Ljava/lang/Object;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$Text;

    if-eqz v0, :cond_0

    .line 29
    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$Text;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$Text;->getValue()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 31
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$Range;

    if-eqz v0, :cond_3

    .line 32
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 34
    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$Range;

    .line 33
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$Range;->getMinimum()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-static {v1}, Lcom/stripe/android/shoppay/bridge/ShopPayMapperKt;->toJSON(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit;)Lorg/json/JSONObject;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    const-string v3, "minimum"

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$Range;->getMaximum()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-static {p0}, Lcom/stripe/android/shoppay/bridge/ShopPayMapperKt;->toJSON(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit;)Lorg/json/JSONObject;

    move-result-object v2

    :cond_2
    const-string p0, "maximum"

    invoke-virtual {v0, p0, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0

    .line 27
    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final toJSON(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit;)Lorg/json/JSONObject;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 42
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit;->getUnit()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;->name()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toLowerCase(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "unit"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 43
    const-string v1, "value"

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit;->getValue()I

    move-result p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    return-object v0
.end method

.method public static final toJSON(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;)Lorg/json/JSONObject;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 10
    const-string v1, "name"

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    const-string v1, "amount"

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;->getAmount()I

    move-result p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    return-object v0
.end method

.method public static final toJSON(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;)Lorg/json/JSONObject;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 17
    const-string v1, "id"

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    const-string v1, "amount"

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;->getAmount()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 19
    const-string v1, "displayName"

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;->getDisplayName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 20
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;->getDeliveryEstimate()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 21
    const-string v1, "deliveryEstimate"

    invoke-static {p0}, Lcom/stripe/android/shoppay/bridge/ShopPayMapperKt;->toJSON(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    return-object v0
.end method
