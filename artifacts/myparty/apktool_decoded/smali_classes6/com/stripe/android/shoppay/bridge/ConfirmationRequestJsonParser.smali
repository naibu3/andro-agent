.class public final Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser;
.super Ljava/lang/Object;
.source "ConfirmationRequestJsonParser.kt"

# interfaces
.implements Lcom/stripe/android/core/model/parsers/ModelJsonParser;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
        "Lcom/stripe/android/shoppay/bridge/ConfirmationRequest;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nConfirmationRequestJsonParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmationRequestJsonParser.kt\ncom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u0000 \u00162\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0017\u0008\u0007\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0008\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0008\u001a\u00020\tH\u0002J\u0012\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0008\u001a\u00020\tH\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0008\u001a\u00020\tH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0008\u001a\u00020\tH\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0008\u001a\u00020\tH\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0008\u001a\u00020\tH\u0002R\u0014\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser;",
        "Lcom/stripe/android/shoppay/bridge/ConfirmationRequest;",
        "shippingRateParser",
        "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;",
        "<init>",
        "(Lcom/stripe/android/core/model/parsers/ModelJsonParser;)V",
        "parse",
        "json",
        "Lorg/json/JSONObject;",
        "parsePaymentDetails",
        "Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;",
        "parseBillingDetails",
        "Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;",
        "parseShippingAddress",
        "Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;",
        "parseFullAddress",
        "Lcom/stripe/android/shoppay/bridge/ECEFullAddress;",
        "parsePaymentMethodOptions",
        "Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;",
        "parseShopPay",
        "Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;",
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
.field public static final $stable:I

.field private static final Companion:Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser$Companion;

.field private static final FIELD_ADDRESS_CITY:Ljava/lang/String; = "city"

.field private static final FIELD_ADDRESS_COUNTRY:Ljava/lang/String; = "country"

.field private static final FIELD_ADDRESS_LINE1:Ljava/lang/String; = "line1"

.field private static final FIELD_ADDRESS_LINE2:Ljava/lang/String; = "line2"

.field private static final FIELD_ADDRESS_POSTAL_CODE:Ljava/lang/String; = "postal_code"

.field private static final FIELD_ADDRESS_STATE:Ljava/lang/String; = "state"

.field private static final FIELD_BILLING_ADDRESS:Ljava/lang/String; = "address"

.field private static final FIELD_BILLING_DETAILS:Ljava/lang/String; = "billingDetails"

.field private static final FIELD_BILLING_EMAIL:Ljava/lang/String; = "email"

.field private static final FIELD_BILLING_NAME:Ljava/lang/String; = "name"

.field private static final FIELD_BILLING_PHONE:Ljava/lang/String; = "phone"

.field private static final FIELD_EXTERNAL_SOURCE_ID:Ljava/lang/String; = "externalSourceId"

.field private static final FIELD_PAYMENT_DETAILS:Ljava/lang/String; = "paymentDetails"

.field private static final FIELD_PAYMENT_METHOD_OPTIONS:Ljava/lang/String; = "paymentMethodOptions"

.field private static final FIELD_SHIPPING_ADDRESS:Ljava/lang/String; = "shippingAddress"

.field private static final FIELD_SHIPPING_ADDRESS_DETAILS:Ljava/lang/String; = "address"

.field private static final FIELD_SHIPPING_NAME:Ljava/lang/String; = "name"

.field private static final FIELD_SHIPPING_RATE:Ljava/lang/String; = "shippingRate"

.field private static final FIELD_SHOP_PAY:Ljava/lang/String; = "shopPay"


# instance fields
.field private final shippingRateParser:Lcom/stripe/android/core/model/parsers/ModelJsonParser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
            "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser;->Companion:Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/core/model/parsers/ModelJsonParser;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
            "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "shippingRateParser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser;->shippingRateParser:Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    return-void
.end method

.method private final parseBillingDetails(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;
    .locals 4

    .line 45
    const-string v0, "name"

    invoke-static {p1, v0}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 46
    const-string v1, "email"

    invoke-static {p1, v1}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 47
    const-string v2, "phone"

    invoke-static {p1, v2}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 48
    const-string v3, "address"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser;->parseFullAddress(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ECEFullAddress;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 50
    :goto_0
    new-instance v3, Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

    invoke-direct {v3, v0, v1, v2, p1}, Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/shoppay/bridge/ECEFullAddress;)V

    return-object v3
.end method

.method private final parseFullAddress(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ECEFullAddress;
    .locals 8

    .line 69
    const-string v0, "line1"

    invoke-static {p1, v0}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 70
    const-string v0, "line2"

    invoke-static {p1, v0}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 71
    const-string v0, "city"

    invoke-static {p1, v0}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 72
    const-string v0, "state"

    invoke-static {p1, v0}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 73
    const-string v0, "postal_code"

    invoke-static {p1, v0}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 74
    const-string v0, "country"

    invoke-static {p1, v0}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 76
    new-instance v1, Lcom/stripe/android/shoppay/bridge/ECEFullAddress;

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/shoppay/bridge/ECEFullAddress;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method private final parsePaymentDetails(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;
    .locals 5

    .line 22
    const-string v0, "billingDetails"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 23
    invoke-direct {p0, v0}, Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser;->parseBillingDetails(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 26
    const-string v1, "shippingAddress"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 27
    invoke-direct {p0, v1}, Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser;->parseShippingAddress(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    .line 29
    :goto_0
    const-string v3, "shippingRate"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 30
    iget-object v4, p0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser;->shippingRateParser:Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    invoke-interface {v4, v3}, Lcom/stripe/android/core/model/parsers/ModelJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;

    goto :goto_1

    :cond_1
    move-object v3, v2

    .line 32
    :goto_1
    const-string v4, "paymentMethodOptions"

    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 33
    invoke-direct {p0, p1}, Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser;->parsePaymentMethodOptions(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;

    move-result-object v2

    .line 36
    :cond_2
    new-instance p1, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;

    invoke-direct {p1, v0, v1, v3, v2}, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;-><init>(Lcom/stripe/android/shoppay/bridge/ECEBillingDetails;Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;Lcom/stripe/android/shoppay/bridge/ECEShippingRate;Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;)V

    return-object p1

    .line 24
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Missing billing details"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final parsePaymentMethodOptions(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;
    .locals 1

    .line 87
    const-string v0, "shopPay"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser;->parseShopPay(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 89
    :goto_0
    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;

    invoke-direct {v0, p1}, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions;-><init>(Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;)V

    return-object v0
.end method

.method private final parseShippingAddress(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;
    .locals 2

    .line 59
    const-string v0, "name"

    invoke-static {p1, v0}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 60
    const-string v1, "address"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser;->parseFullAddress(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ECEFullAddress;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 62
    :goto_0
    new-instance v1, Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;

    invoke-direct {v1, v0, p1}, Lcom/stripe/android/shoppay/bridge/ECEShippingAddressData;-><init>(Ljava/lang/String;Lcom/stripe/android/shoppay/bridge/ECEFullAddress;)V

    return-object v1
.end method

.method private final parseShopPay(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;
    .locals 1

    .line 95
    const-string v0, "externalSourceId"

    invoke-static {p1, v0}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 97
    :cond_0
    new-instance v0, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;

    invoke-direct {v0, p1}, Lcom/stripe/android/shoppay/bridge/ECEPaymentMethodOptions$ShopPay;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ConfirmationRequest;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/model/StripeModel;

    return-object p1
.end method

.method public parse(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ConfirmationRequest;
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    const-string v0, "paymentDetails"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 14
    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser;->parsePaymentDetails(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v0

    .line 16
    :cond_1
    new-instance v0, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest;

    invoke-direct {v0, p1}, Lcom/stripe/android/shoppay/bridge/ConfirmationRequest;-><init>(Lcom/stripe/android/shoppay/bridge/ConfirmationRequest$ConfirmEventData;)V

    return-object v0
.end method
