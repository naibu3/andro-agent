.class public final Lcom/qonversion/android/sdk/internal/billing/UtilsKt;
.super Ljava/lang/Object;
.source "utils.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/billing/UtilsKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\u001a\u0008\u0010\"\u001a\u00020#H\u0000\u001a\u000c\u0010$\u001a\u00020\u001c*\u00020#H\u0002\u001a\u000c\u0010%\u001a\u00020\u001c*\u00020\u0014H\u0000\u001a\u000c\u0010%\u001a\u00020\u001c*\u00020\u001dH\u0000\u001a\u000c\u0010%\u001a\u00020\u001c*\u00020 H\u0000\u001a\u000c\u0010%\u001a\u00020\u001c*\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\"\u0018\u0010\u0002\u001a\u00020\u0001*\u00020\u00068@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0007\"\u001e\u0010\u0008\u001a\u00020\t*\u00020\n8@X\u0080\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\"\u0018\u0010\u000f\u001a\u00020\u0001*\u00020\u00108@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012\"\u0018\u0010\u0013\u001a\u00020\t*\u00020\u00148@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0015\"\u0018\u0010\u0016\u001a\u00020\u0017*\u00020\u00188@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001a\"\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001c*\u00020\u001d8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001f\"\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001c*\u00020 8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010!\u00a8\u0006&"
    }
    d2 = {
        "MAX_BILLING_PHASES_DURATION_YEARS",
        "",
        "durationDays",
        "Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;",
        "getDurationDays",
        "(Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;)I",
        "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;",
        "(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;)I",
        "hasAnyStoreDetails",
        "",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "getHasAnyStoreDetails$annotations",
        "(Lcom/qonversion/android/sdk/dto/products/QProduct;)V",
        "getHasAnyStoreDetails",
        "(Lcom/qonversion/android/sdk/dto/products/QProduct;)Z",
        "inDays",
        "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;",
        "getInDays",
        "(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;)I",
        "isOk",
        "Lcom/android/billingclient/api/BillingResult;",
        "(Lcom/android/billingclient/api/BillingResult;)Z",
        "pricePerMaxDuration",
        "",
        "Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;",
        "getPricePerMaxDuration",
        "(Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;)D",
        "productId",
        "",
        "Lcom/android/billingclient/api/Purchase;",
        "getProductId",
        "(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;",
        "Lcom/android/billingclient/api/PurchaseHistoryRecord;",
        "(Lcom/android/billingclient/api/PurchaseHistoryRecord;)Ljava/lang/String;",
        "getCurrentTimeInMillis",
        "",
        "convertLongToTime",
        "getDescription",
        "sdk_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final MAX_BILLING_PHASES_DURATION_YEARS:I = 0x37


# direct methods
.method private static final convertLongToTime(J)Ljava/lang/String;
    .locals 2

    .line 91
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 92
    new-instance p0, Ljava/text/SimpleDateFormat;

    const-string p1, "yyyy.MM.dd HH:mm"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-direct {p0, p1, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 93
    invoke-virtual {p0, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "format(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final getCurrentTimeInMillis()J
    .locals 2

    .line 33
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method private static final getDescription(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0xc

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    .line 110
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    .line 109
    :pswitch_0
    const-string p0, "ITEM_NOT_OWNED"

    goto :goto_0

    .line 108
    :pswitch_1
    const-string p0, "ITEM_ALREADY_OWNED"

    goto :goto_0

    .line 107
    :pswitch_2
    const-string p0, "ERROR"

    goto :goto_0

    .line 106
    :pswitch_3
    const-string p0, "DEVELOPER_ERROR"

    goto :goto_0

    .line 105
    :pswitch_4
    const-string p0, "ITEM_UNAVAILABLE"

    goto :goto_0

    .line 104
    :pswitch_5
    const-string p0, "BILLING_UNAVAILABLE"

    goto :goto_0

    .line 103
    :pswitch_6
    const-string p0, "SERVICE_UNAVAILABLE"

    goto :goto_0

    .line 102
    :pswitch_7
    const-string p0, "USER_CANCELED"

    goto :goto_0

    .line 101
    :pswitch_8
    const-string p0, "OK"

    goto :goto_0

    .line 100
    :pswitch_9
    const-string p0, "SERVICE_DISCONNECTED"

    goto :goto_0

    .line 99
    :pswitch_a
    const-string p0, "FEATURE_NOT_SUPPORTED"

    goto :goto_0

    .line 98
    :cond_0
    const-string p0, "NETWORK_ERROR"

    :goto_0
    return-object p0

    :pswitch_data_0
    .packed-switch -0x2
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final getDescription(Lcom/android/billingclient/api/BillingResult;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-virtual {p0}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result p0

    invoke-static {p0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDescription(I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "It is a proxy of the Google BillingClient error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final getDescription(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-static {p0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/android/billingclient/api/Purchase;->getOrderId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/android/billingclient/api/Purchase;->getPurchaseToken()Ljava/lang/String;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ProductId: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "; OrderId: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; PurchaseToken: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final getDescription(Lcom/android/billingclient/api/PurchaseHistoryRecord;)Ljava/lang/String;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-static {p0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getProductId(Lcom/android/billingclient/api/PurchaseHistoryRecord;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/android/billingclient/api/PurchaseHistoryRecord;->getPurchaseTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->convertLongToTime(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/android/billingclient/api/PurchaseHistoryRecord;->getPurchaseToken()Ljava/lang/String;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ProductId: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "; PurchaseTime: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; PurchaseToken: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final getDurationDays(Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;)I
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getType()Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;

    move-result-object v0

    sget-object v1, Lcom/qonversion/android/sdk/internal/billing/UtilsKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase$Type;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 73
    :cond_0
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getBillingPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    move-result-object v0

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDurationDays(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;)I

    move-result v0

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getBillingCycleCount()I

    move-result p0

    mul-int/2addr p0, v0

    :goto_0
    return p0
.end method

.method public static final getDurationDays(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->getUnit()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    move-result-object v0

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getInDays(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;)I

    move-result v0

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;->getUnitCount()I

    move-result p0

    mul-int/2addr v0, p0

    return v0
.end method

.method public static final getHasAnyStoreDetails(Lcom/qonversion/android/sdk/dto/products/QProduct;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getSkuDetail()Lcom/android/billingclient/api/SkuDetails;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreDetails()Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    move-result-object p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static synthetic getHasAnyStoreDetails$annotations(Lcom/qonversion/android/sdk/dto/products/QProduct;)V
    .locals 0

    return-void
.end method

.method public static final getInDays(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    sget-object v0, Lcom/qonversion/android/sdk/internal/billing/UtilsKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->ordinal()I

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

    const/4 v0, 0x0

    goto :goto_0

    .line 84
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    const/16 v0, 0x16d

    goto :goto_0

    :cond_2
    const/16 v0, 0x1e

    goto :goto_0

    :cond_3
    const/4 v0, 0x7

    :cond_4
    :goto_0
    return v0
.end method

.method public static final getPricePerMaxDuration(Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;)D
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    sget-object v0, Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;->Year:Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getInDays(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x37

    .line 44
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getPricingPhases()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const-wide/16 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;

    .line 47
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->isBasePlan()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 48
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getBillingPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    move-result-object p0

    invoke-static {p0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDurationDays(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;)I

    move-result p0

    if-eqz p0, :cond_1

    int-to-double v4, v0

    .line 49
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getBillingPeriod()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;

    move-result-object p0

    invoke-static {p0}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDurationDays(Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;)I

    move-result p0

    int-to-double v6, p0

    div-double/2addr v4, v6

    goto :goto_1

    :cond_1
    const-wide v4, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 53
    :goto_1
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getPrice()Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    move-result-object p0

    invoke-virtual {p0}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->getPriceAmountMicros()J

    move-result-wide v6

    long-to-double v6, v6

    mul-double/2addr v6, v4

    add-double/2addr v1, v6

    goto :goto_2

    .line 58
    :cond_2
    invoke-static {v3}, Lcom/qonversion/android/sdk/internal/billing/UtilsKt;->getDurationDays(Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;)I

    move-result v4

    sub-int/2addr v0, v4

    .line 61
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->isTrial()Z

    move-result v4

    if-nez v4, :cond_0

    .line 62
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getPrice()Lcom/qonversion/android/sdk/dto/products/QProductPrice;

    move-result-object v4

    invoke-virtual {v4}, Lcom/qonversion/android/sdk/dto/products/QProductPrice;->getPriceAmountMicros()J

    move-result-wide v4

    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProductPricingPhase;->getBillingCycleCount()I

    move-result v3

    int-to-long v6, v3

    mul-long/2addr v4, v6

    long-to-double v3, v4

    add-double/2addr v1, v3

    goto :goto_0

    :cond_3
    :goto_2
    return-wide v1
.end method

.method public static final getProductId(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0}, Lcom/android/billingclient/api/Purchase;->getProducts()Ljava/util/List;

    move-result-object p0

    const-string v0, "getProducts(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static final getProductId(Lcom/android/billingclient/api/PurchaseHistoryRecord;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-virtual {p0}, Lcom/android/billingclient/api/PurchaseHistoryRecord;->getProducts()Ljava/util/List;

    move-result-object p0

    const-string v0, "getProducts(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static final isOk(Lcom/android/billingclient/api/BillingResult;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-virtual {p0}, Lcom/android/billingclient/api/BillingResult;->getResponseCode()I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
