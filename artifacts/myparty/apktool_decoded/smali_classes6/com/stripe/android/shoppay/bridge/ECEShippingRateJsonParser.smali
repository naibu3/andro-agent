.class public final Lcom/stripe/android/shoppay/bridge/ECEShippingRateJsonParser;
.super Ljava/lang/Object;
.source "ECEShippingRateJsonParser.kt"

# interfaces
.implements Lcom/stripe/android/core/model/parsers/ModelJsonParser;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/shoppay/bridge/ECEShippingRateJsonParser$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
        "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u0000 \u000e2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/shoppay/bridge/ECEShippingRateJsonParser;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser;",
        "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;",
        "<init>",
        "()V",
        "parse",
        "json",
        "Lorg/json/JSONObject;",
        "parseDeliveryEstimate",
        "Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;",
        "fieldName",
        "",
        "parseDeliveryEstimateUnit",
        "Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;",
        "Companion",
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
.field public static final $stable:I = 0x0

.field private static final Companion:Lcom/stripe/android/shoppay/bridge/ECEShippingRateJsonParser$Companion;

.field private static final FIELD_AMOUNT:Ljava/lang/String; = "amount"

.field private static final FIELD_DELIVERY_ESTIMATE:Ljava/lang/String; = "deliveryEstimate"

.field private static final FIELD_DISPLAY_NAME:Ljava/lang/String; = "displayName"

.field private static final FIELD_ID:Ljava/lang/String; = "id"

.field private static final FIELD_MAXIMUM:Ljava/lang/String; = "maximum"

.field private static final FIELD_MINIMUM:Ljava/lang/String; = "minimum"

.field private static final FIELD_UNIT:Ljava/lang/String; = "unit"

.field private static final FIELD_VALUE:Ljava/lang/String; = "value"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECEShippingRateJsonParser$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/shoppay/bridge/ECEShippingRateJsonParser$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/shoppay/bridge/ECEShippingRateJsonParser;->Companion:Lcom/stripe/android/shoppay/bridge/ECEShippingRateJsonParser$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final parseDeliveryEstimate(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;
    .locals 2

    .line 25
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 26
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 27
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 28
    new-instance p1, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Text;

    check-cast v0, Ljava/lang/String;

    invoke-direct {p1, v0}, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Text;-><init>(Ljava/lang/String;)V

    check-cast p1, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;

    return-object p1

    .line 32
    :cond_0
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_1

    return-object p2

    .line 34
    :cond_1
    const-string v0, "maximum"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 35
    const-string v1, "minimum"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz v0, :cond_2

    if-eqz p1, :cond_2

    .line 37
    invoke-direct {p0, v0}, Lcom/stripe/android/shoppay/bridge/ECEShippingRateJsonParser;->parseDeliveryEstimateUnit(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    move-result-object v0

    .line 38
    invoke-direct {p0, p1}, Lcom/stripe/android/shoppay/bridge/ECEShippingRateJsonParser;->parseDeliveryEstimateUnit(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    move-result-object p1

    if-eqz v0, :cond_2

    if-eqz p1, :cond_2

    .line 40
    new-instance p2, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;

    invoke-direct {p2, v0, p1}, Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;-><init>(Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;)V

    .line 41
    new-instance p1, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;

    invoke-direct {p1, p2}, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate$Range;-><init>(Lcom/stripe/android/shoppay/bridge/ECEStructuredDeliveryEstimate;)V

    check-cast p1, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;

    return-object p1

    :cond_2
    return-object p2
.end method

.method private final parseDeliveryEstimateUnit(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;
    .locals 3

    .line 49
    const-string v0, "unit"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 50
    const-string v1, "value"

    const/4 v2, -0x1

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    if-eq p1, v2, :cond_1

    .line 52
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 54
    :cond_0
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toUpperCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->valueOf(Ljava/lang/String;)Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    move-result-object v0

    .line 56
    new-instance v1, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;

    invoke-direct {v1, v0, p1}, Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimateUnit;-><init>(Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;I)V

    return-object v1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public bridge synthetic parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/stripe/android/shoppay/bridge/ECEShippingRateJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ECEShippingRate;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/model/StripeModel;

    return-object p1
.end method

.method public parse(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ECEShippingRate;
    .locals 4

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    const-string v0, "id"

    invoke-static {p1, v0}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 12
    :cond_0
    const-string v2, "displayName"

    invoke-static {p1, v2}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    return-object v1

    .line 13
    :cond_1
    const-string v1, "amount"

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    .line 14
    const-string v3, "deliveryEstimate"

    invoke-direct {p0, p1, v3}, Lcom/stripe/android/shoppay/bridge/ECEShippingRateJsonParser;->parseDeliveryEstimate(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;

    move-result-object p1

    .line 16
    new-instance v3, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;

    invoke-direct {v3, v0, v1, v2, p1}, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/shoppay/bridge/ECEDeliveryEstimate;)V

    return-object v3
.end method
