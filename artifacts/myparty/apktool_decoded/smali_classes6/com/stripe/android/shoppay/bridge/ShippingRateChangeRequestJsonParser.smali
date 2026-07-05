.class public final Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser;
.super Ljava/lang/Object;
.source "ShippingRateChangeRequestJsonParser.kt"

# interfaces
.implements Lcom/stripe/android/core/model/parsers/ModelJsonParser;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
        "Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequest;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0017\u0008\u0007\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0008\u001a\u00020\tH\u0016R\u0014\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser;",
        "Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequest;",
        "shippingRateParser",
        "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;",
        "<init>",
        "(Lcom/stripe/android/core/model/parsers/ModelJsonParser;)V",
        "parse",
        "json",
        "Lorg/json/JSONObject;",
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

.field private static final Companion:Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser$Companion;

.field private static final FIELD_SHIPPING_RATE:Ljava/lang/String; = "shippingRate"


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

    new-instance v0, Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser;->Companion:Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser;->$stable:I

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

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser;->shippingRateParser:Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    return-void
.end method


# virtual methods
.method public bridge synthetic parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;
    .locals 0

    .line 7
    invoke-virtual {p0, p1}, Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequest;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/model/StripeModel;

    return-object p1
.end method

.method public parse(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequest;
    .locals 2

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    const-string v0, "shippingRate"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 13
    :cond_0
    iget-object v1, p0, Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser;->shippingRateParser:Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    invoke-interface {v1, p1}, Lcom/stripe/android/core/model/parsers/ModelJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/shoppay/bridge/ECEShippingRate;

    if-nez p1, :cond_1

    return-object v0

    .line 15
    :cond_1
    new-instance v0, Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequest;

    invoke-direct {v0, p1}, Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequest;-><init>(Lcom/stripe/android/shoppay/bridge/ECEShippingRate;)V

    return-object v0
.end method
