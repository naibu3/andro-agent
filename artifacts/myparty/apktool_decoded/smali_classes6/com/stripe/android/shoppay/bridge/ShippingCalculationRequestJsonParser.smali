.class public final Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequestJsonParser;
.super Ljava/lang/Object;
.source "ShippingCalculationRequestJsonParser.kt"

# interfaces
.implements Lcom/stripe/android/core/model/parsers/ModelJsonParser;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequestJsonParser$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
        "Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequestJsonParser;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser;",
        "Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest;",
        "<init>",
        "()V",
        "parse",
        "json",
        "Lorg/json/JSONObject;",
        "parseShippingAddress",
        "Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest$ShippingAddress;",
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

.field private static final Companion:Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequestJsonParser$Companion;

.field private static final FIELD_ADDRESS:Ljava/lang/String; = "address"

.field private static final FIELD_CITY:Ljava/lang/String; = "city"

.field private static final FIELD_COUNTRY:Ljava/lang/String; = "country"

.field private static final FIELD_NAME:Ljava/lang/String; = "name"

.field private static final FIELD_POSTAL_CODE:Ljava/lang/String; = "postal_code"

.field private static final FIELD_SHIPPING_ADDRESS:Ljava/lang/String; = "shippingAddress"

.field private static final FIELD_STATE:Ljava/lang/String; = "state"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequestJsonParser$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequestJsonParser$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequestJsonParser;->Companion:Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequestJsonParser$Companion;

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

.method private final parseShippingAddress(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest$ShippingAddress;
    .locals 6

    .line 21
    const-string v0, "address"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 23
    :cond_0
    const-string v1, "name"

    invoke-static {p1, v1}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 25
    new-instance v1, Lcom/stripe/android/shoppay/bridge/ECEPartialAddress;

    .line 26
    const-string v2, "city"

    invoke-static {v0, v2}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 27
    const-string v3, "state"

    invoke-static {v0, v3}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 28
    const-string v4, "postal_code"

    invoke-static {v0, v4}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 29
    const-string v5, "country"

    invoke-static {v0, v5}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 25
    invoke-direct {v1, v2, v3, v4, v0}, Lcom/stripe/android/shoppay/bridge/ECEPartialAddress;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    new-instance v0, Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest$ShippingAddress;

    invoke-direct {v0, p1, v1}, Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest$ShippingAddress;-><init>(Ljava/lang/String;Lcom/stripe/android/shoppay/bridge/ECEPartialAddress;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequestJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/model/StripeModel;

    return-object p1
.end method

.method public parse(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest;
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    const-string v0, "shippingAddress"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 13
    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequestJsonParser;->parseShippingAddress(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest$ShippingAddress;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v0

    .line 15
    :cond_1
    new-instance v0, Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest;

    invoke-direct {v0, p1}, Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest;-><init>(Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest$ShippingAddress;)V

    return-object v0
.end method
