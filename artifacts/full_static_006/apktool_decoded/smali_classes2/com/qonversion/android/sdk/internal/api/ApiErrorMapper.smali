.class public final Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;
.super Ljava/lang/Object;
.source "ApiErrorMapper.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0002J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0002\u0010\u000cJ\u001a\u0010\r\u001a\u00020\u000e\"\u0004\u0008\u0000\u0010\u000f2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u0002H\u000f0\u0010J\u0017\u0010\u0011\u001a\u00020\u00122\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0002\u0010\u0013J\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0006H\u0002\u00a2\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0015*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00012\u0006\u0010\u001b\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;",
        "",
        "helper",
        "Lcom/qonversion/android/sdk/internal/api/ApiHelper;",
        "(Lcom/qonversion/android/sdk/internal/api/ApiHelper;)V",
        "convertResponseBody",
        "",
        "response",
        "Lokhttp3/ResponseBody;",
        "getAdditionalMessageForCode",
        "value",
        "",
        "(Ljava/lang/Integer;)Ljava/lang/String;",
        "getErrorFromResponse",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "T",
        "Lretrofit2/Response;",
        "getQonversionErrorCode",
        "Lcom/qonversion/android/sdk/dto/QonversionErrorCode;",
        "(Ljava/lang/Integer;)Lcom/qonversion/android/sdk/dto/QonversionErrorCode;",
        "getInt",
        "Lorg/json/JSONObject;",
        "field",
        "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;",
        "getJsonObject",
        "getString",
        "toFormatString",
        "fieldName",
        "Companion",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final CODE:Ljava/lang/String; = "code"

.field public static final Companion:Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper$Companion;

.field private static final DATA:Ljava/lang/String; = "data"

.field private static final ERROR:Ljava/lang/String; = "error"

.field private static final MESSAGE:Ljava/lang/String; = "message"


# instance fields
.field private final helper:Lcom/qonversion/android/sdk/internal/api/ApiHelper;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->Companion:Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/internal/api/ApiHelper;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "helper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->helper:Lcom/qonversion/android/sdk/internal/api/ApiHelper;

    return-void
.end method

.method private final convertResponseBody(Lokhttp3/ResponseBody;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 58
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->source()Lokio/BufferedSource;

    move-result-object p1

    const-wide v0, 0x7fffffffffffffffL

    .line 59
    invoke-interface {p1, v0, v1}, Lokio/BufferedSource;->request(J)Z

    .line 60
    invoke-interface {p1}, Lokio/BufferedSource;->getBuffer()Lokio/Buffer;

    move-result-object p1

    .line 61
    invoke-virtual {p1}, Lokio/Buffer;->clone()Lokio/Buffer;

    move-result-object p1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    const-string v1, "forName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lokio/Buffer;->readString(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final getAdditionalMessageForCode(Ljava/lang/Integer;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    .line 118
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x4ee9

    if-ne v0, v1, :cond_1

    const-string p1, "For more details please check our guide [Troubleshooting](https://documentation.qonversion.io/docs/troubleshooting)"

    goto :goto_2

    :cond_1
    :goto_0
    if-nez p1, :cond_2

    goto :goto_1

    .line 119
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v0, 0x4eeb

    if-ne p1, v0, :cond_3

    const-string p1, "Possible reasons for this error are fraud purchases and incorrect configuration of the project key in the Qonversion Dashboard"

    goto :goto_2

    :cond_3
    :goto_1
    const/4 p1, 0x0

    :goto_2
    return-object p1
.end method

.method private final getInt(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 77
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 81
    :cond_0
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final getJsonObject(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 68
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 72
    :cond_0
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method private final getQonversionErrorCode(Ljava/lang/Integer;)Lcom/qonversion/android/sdk/dto/QonversionErrorCode;
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    .line 101
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x2712

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x2713

    if-ne v0, v1, :cond_3

    :goto_1
    sget-object p1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->InvalidCredentials:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    goto/16 :goto_1a

    :cond_3
    :goto_2
    if-nez p1, :cond_4

    goto :goto_3

    .line 102
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x2714

    if-ne v0, v1, :cond_5

    goto :goto_5

    :cond_5
    :goto_3
    if-nez p1, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x2715

    if-ne v0, v1, :cond_7

    goto :goto_5

    :cond_7
    :goto_4
    if-nez p1, :cond_8

    goto :goto_6

    :cond_8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x4e2e

    if-ne v0, v1, :cond_9

    :goto_5
    sget-object p1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->InvalidClientUid:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    goto/16 :goto_1a

    :cond_9
    :goto_6
    if-nez p1, :cond_a

    goto :goto_7

    .line 103
    :cond_a
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x2716

    if-ne v0, v1, :cond_b

    sget-object p1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->UnknownClientPlatform:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    goto/16 :goto_1a

    :cond_b
    :goto_7
    if-nez p1, :cond_c

    goto :goto_8

    .line 104
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x2718

    if-ne v0, v1, :cond_d

    sget-object p1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->FraudPurchase:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    goto/16 :goto_1a

    :cond_d
    :goto_8
    if-nez p1, :cond_e

    goto :goto_9

    .line 105
    :cond_e
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x4e25

    if-ne v0, v1, :cond_f

    sget-object p1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->FeatureNotSupported:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    goto/16 :goto_1a

    :cond_f
    :goto_9
    if-nez p1, :cond_10

    goto :goto_a

    .line 106
    :cond_10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x4e26

    if-ne v0, v1, :cond_11

    goto :goto_e

    :cond_11
    :goto_a
    if-nez p1, :cond_12

    goto :goto_b

    :cond_12
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x4e27

    if-ne v0, v1, :cond_13

    goto :goto_e

    :cond_13
    :goto_b
    if-nez p1, :cond_14

    goto :goto_c

    :cond_14
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x4f4c

    if-ne v0, v1, :cond_15

    goto :goto_e

    :cond_15
    :goto_c
    if-nez p1, :cond_16

    goto :goto_d

    :cond_16
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x4f4f

    if-ne v0, v1, :cond_17

    goto :goto_e

    :cond_17
    :goto_d
    if-nez p1, :cond_18

    goto :goto_f

    :cond_18
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x4faf

    if-ne v0, v1, :cond_19

    :goto_e
    sget-object p1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PlayStoreError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    goto/16 :goto_1a

    :cond_19
    :goto_f
    if-nez p1, :cond_1a

    goto :goto_10

    .line 107
    :cond_1a
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x4e28

    if-ne v0, v1, :cond_1b

    goto :goto_13

    :cond_1b
    :goto_10
    if-nez p1, :cond_1c

    goto :goto_11

    :cond_1c
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x4e2a

    if-ne v0, v1, :cond_1d

    goto :goto_13

    :cond_1d
    :goto_11
    if-nez p1, :cond_1e

    goto :goto_12

    :cond_1e
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x4eeb

    if-ne v0, v1, :cond_1f

    goto :goto_13

    :cond_1f
    :goto_12
    if-nez p1, :cond_20

    goto :goto_14

    :cond_20
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x4ef2

    if-ne v0, v1, :cond_21

    :goto_13
    sget-object p1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchaseInvalid:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    goto :goto_1a

    :cond_21
    :goto_14
    if-nez p1, :cond_22

    goto :goto_15

    .line 108
    :cond_22
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x4e2b

    if-ne v0, v1, :cond_23

    goto :goto_17

    :cond_23
    :goto_15
    if-nez p1, :cond_24

    goto :goto_16

    :cond_24
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x4e2c

    if-ne v0, v1, :cond_25

    goto :goto_17

    :cond_25
    :goto_16
    if-nez p1, :cond_26

    goto :goto_18

    :cond_26
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x4e2d

    if-ne v0, v1, :cond_27

    :goto_17
    sget-object p1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProjectConfigError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    goto :goto_1a

    :cond_27
    :goto_18
    if-nez p1, :cond_28

    goto :goto_19

    .line 109
    :cond_28
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v0, 0x4ee9

    if-ne p1, v0, :cond_29

    sget-object p1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->InvalidStoreCredentials:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    goto :goto_1a

    .line 110
    :cond_29
    :goto_19
    sget-object p1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->BackendError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    :goto_1a
    return-object p1
.end method

.method private final getString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 86
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 90
    :cond_0
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final toFormatString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 96
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v0, "="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final getErrorFromResponse(Lretrofit2/Response;)Lcom/qonversion/android/sdk/dto/QonversionError;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lretrofit2/Response<",
            "TT;>;)",
            "Lcom/qonversion/android/sdk/dto/QonversionError;"
        }
    .end annotation

    const-string v0, "data"

    const-string v1, "error"

    const-string v2, "value"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2}, Ljava/lang/String;-><init>()V

    .line 18
    invoke-virtual {p1}, Lretrofit2/Response;->errorBody()Lokhttp3/ResponseBody;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    .line 20
    :try_start_0
    invoke-direct {p0, v3}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->convertResponseBody(Lokhttp3/ResponseBody;)Ljava/lang/String;

    move-result-object v3

    .line 21
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 23
    invoke-virtual {p1}, Lretrofit2/Response;->raw()Lokhttp3/Response;

    move-result-object v3

    invoke-virtual {v3}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object v3

    .line 24
    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->helper:Lcom/qonversion/android/sdk/internal/api/ApiHelper;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v6, v3}, Lcom/qonversion/android/sdk/internal/api/ApiHelper;->isDeprecatedEndpoint(Lokhttp3/Request;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 25
    invoke-direct {p0, v5, v0}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->getJsonObject(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 26
    invoke-direct {p0, v1, v0}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->toFormatString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object v2, v0

    .line 30
    :cond_0
    const-string v0, "code"

    invoke-direct {p0, v1, v0}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->getInt(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_1

    .line 32
    :cond_1
    invoke-direct {p0, v5, v1}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->getJsonObject(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 34
    const-string v3, "message"

    invoke-direct {p0, v0, v3}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->getString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 35
    invoke-direct {p0, v0, v1}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->toFormatString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    move-object v2, v0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 42
    invoke-virtual {v0}, Ljava/io/IOException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "error="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    .line 40
    :catch_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const-string v0, "error=failed to parse the backend response"

    goto :goto_0

    .line 46
    :cond_2
    :goto_1
    invoke-direct {p0, v4}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->getQonversionErrorCode(Ljava/lang/Integer;)Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    move-result-object v0

    .line 47
    invoke-direct {p0, v4}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->getAdditionalMessageForCode(Ljava/lang/Integer;)Ljava/lang/String;

    move-result-object v1

    .line 49
    new-instance v3, Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 51
    invoke-virtual {p1}, Lretrofit2/Response;->code()I

    move-result v4

    if-nez v1, :cond_3

    const-string v1, ""

    :cond_3
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "HTTP status code="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ", "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ". "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 52
    invoke-virtual {p1}, Lretrofit2/Response;->code()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 49
    invoke-direct {v3, v0, v1, p1}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v3
.end method
