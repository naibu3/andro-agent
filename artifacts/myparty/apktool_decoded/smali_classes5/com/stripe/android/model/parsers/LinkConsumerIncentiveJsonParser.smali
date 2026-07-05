.class public final Lcom/stripe/android/model/parsers/LinkConsumerIncentiveJsonParser;
.super Ljava/lang/Object;
.source "LinkConsumerIncentiveJsonParser.kt"

# interfaces
.implements Lcom/stripe/android/core/model/parsers/ModelJsonParser;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
        "Lcom/stripe/android/model/LinkConsumerIncentive;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/model/parsers/LinkConsumerIncentiveJsonParser;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser;",
        "Lcom/stripe/android/model/LinkConsumerIncentive;",
        "<init>",
        "()V",
        "parse",
        "json",
        "Lorg/json/JSONObject;",
        "buildIncentiveParams",
        "Lcom/stripe/android/model/LinkConsumerIncentive$IncentiveParams;",
        "payments-model_release"
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
.field public static final INSTANCE:Lcom/stripe/android/model/parsers/LinkConsumerIncentiveJsonParser;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/model/parsers/LinkConsumerIncentiveJsonParser;

    invoke-direct {v0}, Lcom/stripe/android/model/parsers/LinkConsumerIncentiveJsonParser;-><init>()V

    sput-object v0, Lcom/stripe/android/model/parsers/LinkConsumerIncentiveJsonParser;->INSTANCE:Lcom/stripe/android/model/parsers/LinkConsumerIncentiveJsonParser;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final buildIncentiveParams(Lorg/json/JSONObject;)Lcom/stripe/android/model/LinkConsumerIncentive$IncentiveParams;
    .locals 2

    .line 24
    new-instance v0, Lcom/stripe/android/model/LinkConsumerIncentive$IncentiveParams;

    .line 25
    const-string v1, "payment_method"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "optString(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {v0, p1}, Lcom/stripe/android/model/LinkConsumerIncentive$IncentiveParams;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Lcom/stripe/android/model/parsers/LinkConsumerIncentiveJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/LinkConsumerIncentive;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/model/StripeModel;

    return-object p1
.end method

.method public parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/LinkConsumerIncentive;
    .locals 3

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    const-string v0, "incentive_params"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "getJSONObject(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0, v0}, Lcom/stripe/android/model/parsers/LinkConsumerIncentiveJsonParser;->buildIncentiveParams(Lorg/json/JSONObject;)Lcom/stripe/android/model/LinkConsumerIncentive$IncentiveParams;

    move-result-object v0

    .line 17
    new-instance v1, Lcom/stripe/android/model/LinkConsumerIncentive;

    .line 19
    const-string v2, "incentive_display_text"

    invoke-static {p1, v2}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 17
    invoke-direct {v1, v0, p1}, Lcom/stripe/android/model/LinkConsumerIncentive;-><init>(Lcom/stripe/android/model/LinkConsumerIncentive$IncentiveParams;Ljava/lang/String;)V

    return-object v1
.end method
