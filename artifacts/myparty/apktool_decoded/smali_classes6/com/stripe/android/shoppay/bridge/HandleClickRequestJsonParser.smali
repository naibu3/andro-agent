.class public final Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser;
.super Ljava/lang/Object;
.source "HandleClickRequestJsonParser.kt"

# interfaces
.implements Lcom/stripe/android/core/model/parsers/ModelJsonParser;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
        "Lcom/stripe/android/shoppay/bridge/HandleClickRequest;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser;",
        "Lcom/stripe/android/shoppay/bridge/HandleClickRequest;",
        "<init>",
        "()V",
        "parse",
        "json",
        "Lorg/json/JSONObject;",
        "parseEventData",
        "Lcom/stripe/android/shoppay/bridge/HandleClickRequest$EventData;",
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

.field private static final Companion:Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser$Companion;

.field private static final FIELD_EVENT_DATA:Ljava/lang/String; = "eventData"

.field private static final FIELD_EXPRESS_PAYMENT_TYPE:Ljava/lang/String; = "expressPaymentType"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser;->Companion:Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser$Companion;

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

.method private final parseEventData(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/HandleClickRequest$EventData;
    .locals 1

    .line 20
    const-string v0, "expressPaymentType"

    invoke-static {p1, v0}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 22
    :cond_0
    new-instance v0, Lcom/stripe/android/shoppay/bridge/HandleClickRequest$EventData;

    invoke-direct {v0, p1}, Lcom/stripe/android/shoppay/bridge/HandleClickRequest$EventData;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/HandleClickRequest;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/model/StripeModel;

    return-object p1
.end method

.method public parse(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/HandleClickRequest;
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    const-string v0, "eventData"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 12
    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser;->parseEventData(Lorg/json/JSONObject;)Lcom/stripe/android/shoppay/bridge/HandleClickRequest$EventData;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v0

    .line 14
    :cond_1
    new-instance v0, Lcom/stripe/android/shoppay/bridge/HandleClickRequest;

    invoke-direct {v0, p1}, Lcom/stripe/android/shoppay/bridge/HandleClickRequest;-><init>(Lcom/stripe/android/shoppay/bridge/HandleClickRequest$EventData;)V

    return-object v0
.end method
