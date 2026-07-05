.class final Lcom/stripe/android/model/parsers/SourceJsonParser$Companion;
.super Ljava/lang/Object;
.source "SourceJsonParser.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/parsers/SourceJsonParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSourceJsonParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SourceJsonParser.kt\ncom/stripe/android/model/parsers/SourceJsonParser$Companion\n*L\n1#1,317:1\n252#1,41:318\n252#1,41:359\n252#1,41:400\n252#1,41:441\n252#1,41:482\n*S KotlinDebug\n*F\n+ 1 SourceJsonParser.kt\ncom/stripe/android/model/parsers/SourceJsonParser$Companion\n*L\n201#1:318,41\n210#1:359,41\n218#1:400,41\n219#1:441,41\n220#1:482,41\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0082\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J.\u0010!\u001a\u0004\u0018\u0001H\"\"\n\u0008\u0000\u0010\"\u0018\u0001*\u00020#2\u0006\u0010\u001e\u001a\u00020\u001f2\u0008\u0008\u0001\u0010$\u001a\u00020\u0005H\u0082\u0008\u00a2\u0006\u0002\u0010%J\u0012\u0010&\u001a\u00020\u00052\u0008\u0010\'\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006("
    }
    d2 = {
        "Lcom/stripe/android/model/parsers/SourceJsonParser$Companion;",
        "",
        "<init>",
        "()V",
        "VALUE_SOURCE",
        "",
        "VALUE_CARD",
        "MODELED_TYPES",
        "",
        "FIELD_ID",
        "FIELD_OBJECT",
        "FIELD_AMOUNT",
        "FIELD_CLIENT_SECRET",
        "FIELD_CODE_VERIFICATION",
        "FIELD_CREATED",
        "FIELD_CURRENCY",
        "FIELD_FLOW",
        "FIELD_LIVEMODE",
        "FIELD_OWNER",
        "FIELD_RECEIVER",
        "FIELD_REDIRECT",
        "FIELD_SOURCE_ORDER",
        "FIELD_STATEMENT_DESCRIPTOR",
        "FIELD_STATUS",
        "FIELD_TYPE",
        "FIELD_USAGE",
        "FIELD_WECHAT",
        "FIELD_KLARNA",
        "fromCardJson",
        "Lcom/stripe/android/model/Source;",
        "jsonObject",
        "Lorg/json/JSONObject;",
        "fromSourceJson",
        "optStripeJsonModel",
        "T",
        "Lcom/stripe/android/core/model/StripeModel;",
        "key",
        "(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/stripe/android/core/model/StripeModel;",
        "asSourceType",
        "sourceType",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/model/parsers/SourceJsonParser$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$fromCardJson(Lcom/stripe/android/model/parsers/SourceJsonParser$Companion;Lorg/json/JSONObject;)Lcom/stripe/android/model/Source;
    .locals 0

    .line 150
    invoke-direct {p0, p1}, Lcom/stripe/android/model/parsers/SourceJsonParser$Companion;->fromCardJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$fromSourceJson(Lcom/stripe/android/model/parsers/SourceJsonParser$Companion;Lorg/json/JSONObject;)Lcom/stripe/android/model/Source;
    .locals 0

    .line 150
    invoke-direct {p0, p1}, Lcom/stripe/android/model/parsers/SourceJsonParser$Companion;->fromSourceJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source;

    move-result-object p0

    return-object p0
.end method

.method private final asSourceType(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 297
    const-string v0, "unknown"

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "sepa_debit"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    return-object v1

    :sswitch_1
    const-string v1, "multibanco"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    :cond_1
    return-object v1

    :sswitch_2
    const-string v1, "ideal"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_0

    :cond_2
    return-object v1

    :sswitch_3
    const-string v1, "giropay"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    return-object v1

    :sswitch_4
    const-string v1, "card"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    return-object v1

    :sswitch_5
    const-string v1, "p24"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    return-object v1

    :sswitch_6
    const-string v1, "eps"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    return-object v1

    :sswitch_7
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    goto :goto_0

    :sswitch_8
    const-string v1, "wechat"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    return-object v1

    :sswitch_9
    const-string v1, "three_d_secure"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_0

    :cond_8
    return-object v1

    :sswitch_a
    const-string v1, "sofort"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_0

    :cond_9
    return-object v1

    :sswitch_b
    const-string v1, "klarna"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_0

    :cond_a
    return-object v1

    :sswitch_c
    const-string v1, "alipay"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_0

    :cond_b
    return-object v1

    :sswitch_d
    const-string v1, "bancontact"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto :goto_0

    :cond_c
    return-object v1

    :cond_d
    :goto_0
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x727c36cf -> :sswitch_d
        -0x545695b6 -> :sswitch_c
        -0x4349b97b -> :sswitch_b
        -0x357672d9 -> :sswitch_a
        -0x313022cd -> :sswitch_9
        -0x2f3174da -> :sswitch_8
        -0x10fa53b6 -> :sswitch_7
        0x18928 -> :sswitch_6
        0x1aab2 -> :sswitch_5
        0x2e7b10 -> :sswitch_4
        0x2494da9 -> :sswitch_3
        0x5f6a055 -> :sswitch_2
        0x4a9d4722 -> :sswitch_1
        0x618aa970 -> :sswitch_0
    .end sparse-switch
.end method

.method private final fromCardJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source;
    .locals 24

    move-object/from16 v0, p1

    .line 180
    new-instance v1, Lcom/stripe/android/model/Source;

    .line 181
    const-string v2, "id"

    invoke-static {v0, v2}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 182
    new-instance v3, Lcom/stripe/android/model/parsers/SourceCardDataJsonParser;

    invoke-direct {v3}, Lcom/stripe/android/model/parsers/SourceCardDataJsonParser;-><init>()V

    invoke-virtual {v3, v0}, Lcom/stripe/android/model/parsers/SourceCardDataJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceTypeModel$Card;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/stripe/android/model/SourceTypeModel;

    const v22, 0x1f1ffe

    const/16 v23, 0x0

    move-object v0, v1

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 180
    const-string v15, "card"

    const-string v16, "card"

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v0 .. v23}, Lcom/stripe/android/model/Source;-><init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$CodeVerification;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$Flow;Ljava/lang/Boolean;Lcom/stripe/android/model/Source$Owner;Lcom/stripe/android/model/Source$Receiver;Lcom/stripe/android/model/Source$Redirect;Lcom/stripe/android/model/Source$Status;Ljava/util/Map;Lcom/stripe/android/model/SourceTypeModel;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Source$Usage;Lcom/stripe/android/model/WeChat;Lcom/stripe/android/model/Source$Klarna;Lcom/stripe/android/model/SourceOrder;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final fromSourceJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source;
    .locals 24

    move-object/from16 v0, p1

    .line 189
    const-string v1, "type"

    invoke-static {v0, v1}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    .line 190
    const-string v1, "unknown"

    :cond_0
    move-object/from16 v2, p0

    .line 192
    invoke-direct {v2, v1}, Lcom/stripe/android/model/parsers/SourceJsonParser$Companion;->asSourceType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 197
    sget-object v4, Lcom/stripe/android/core/model/StripeJsonUtils;->INSTANCE:Lcom/stripe/android/core/model/StripeJsonUtils;

    .line 198
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 197
    invoke-virtual {v4, v5}, Lcom/stripe/android/core/model/StripeJsonUtils;->jsonObjectToMap(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v15

    .line 200
    invoke-static {}, Lcom/stripe/android/model/parsers/SourceJsonParser;->access$getMODELED_TYPES$cp()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    const-string v5, "sepa_debit"

    const-string v6, "card"

    const-string v7, "owner"

    const-string v8, "redirect"

    const-string v9, "receiver"

    const-string v10, "code_verification"

    if-eqz v4, :cond_f

    .line 318
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    const/4 v4, 0x0

    goto/16 :goto_8

    .line 322
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_6

    :sswitch_0
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto/16 :goto_6

    .line 349
    :cond_2
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 350
    new-instance v12, Lcom/stripe/android/model/parsers/SourceSepaDebitDataJsonParser;

    invoke-direct {v12}, Lcom/stripe/android/model/parsers/SourceSepaDebitDataJsonParser;-><init>()V

    invoke-virtual {v12, v4}, Lcom/stripe/android/model/parsers/SourceSepaDebitDataJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceTypeModel$SepaDebit;

    move-result-object v4

    goto :goto_0

    :cond_3
    const/4 v4, 0x0

    .line 349
    :goto_0
    check-cast v4, Lcom/stripe/android/core/model/StripeModel;

    goto/16 :goto_7

    .line 322
    :sswitch_1
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto/16 :goto_6

    .line 324
    :cond_4
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 325
    new-instance v12, Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser;

    invoke-direct {v12}, Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser;-><init>()V

    invoke-virtual {v12, v4}, Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$CodeVerification;

    move-result-object v4

    goto :goto_1

    :cond_5
    const/4 v4, 0x0

    .line 324
    :goto_1
    check-cast v4, Lcom/stripe/android/core/model/StripeModel;

    goto/16 :goto_7

    .line 322
    :sswitch_2
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    goto/16 :goto_6

    .line 329
    :cond_6
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_7

    .line 330
    new-instance v12, Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser;

    invoke-direct {v12}, Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser;-><init>()V

    invoke-virtual {v12, v4}, Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Owner;

    move-result-object v4

    goto :goto_2

    :cond_7
    const/4 v4, 0x0

    .line 329
    :goto_2
    check-cast v4, Lcom/stripe/android/core/model/StripeModel;

    goto :goto_7

    .line 322
    :sswitch_3
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_6

    .line 344
    :cond_8
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_9

    .line 345
    new-instance v12, Lcom/stripe/android/model/parsers/SourceCardDataJsonParser;

    invoke-direct {v12}, Lcom/stripe/android/model/parsers/SourceCardDataJsonParser;-><init>()V

    invoke-virtual {v12, v4}, Lcom/stripe/android/model/parsers/SourceCardDataJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceTypeModel$Card;

    move-result-object v4

    goto :goto_3

    :cond_9
    const/4 v4, 0x0

    .line 344
    :goto_3
    check-cast v4, Lcom/stripe/android/core/model/StripeModel;

    goto :goto_7

    .line 322
    :sswitch_4
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    goto :goto_6

    .line 339
    :cond_a
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_b

    .line 340
    new-instance v12, Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser;

    invoke-direct {v12}, Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser;-><init>()V

    invoke-virtual {v12, v4}, Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Redirect;

    move-result-object v4

    goto :goto_4

    :cond_b
    const/4 v4, 0x0

    .line 339
    :goto_4
    check-cast v4, Lcom/stripe/android/core/model/StripeModel;

    goto :goto_7

    .line 322
    :sswitch_5
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    goto :goto_6

    .line 334
    :cond_c
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_d

    .line 335
    new-instance v12, Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser;

    invoke-direct {v12}, Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser;-><init>()V

    invoke-virtual {v12, v4}, Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Receiver;

    move-result-object v4

    goto :goto_5

    :cond_d
    const/4 v4, 0x0

    .line 334
    :goto_5
    check-cast v4, Lcom/stripe/android/core/model/StripeModel;

    goto :goto_7

    :goto_6
    const/4 v4, 0x0

    .line 358
    :goto_7
    instance-of v12, v4, Lcom/stripe/android/model/SourceTypeModel;

    if-nez v12, :cond_e

    const/4 v4, 0x0

    :cond_e
    check-cast v4, Lcom/stripe/android/model/SourceTypeModel;

    check-cast v4, Lcom/stripe/android/core/model/StripeModel;

    :goto_8
    check-cast v4, Lcom/stripe/android/model/SourceTypeModel;

    move-object/from16 v16, v4

    goto :goto_9

    :cond_f
    const/16 v16, 0x0

    .line 207
    :goto_9
    const-string v4, "id"

    invoke-static {v0, v4}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 208
    sget-object v12, Lcom/stripe/android/core/model/StripeJsonUtils;->INSTANCE:Lcom/stripe/android/core/model/StripeJsonUtils;

    const-string v13, "amount"

    invoke-virtual {v12, v0, v13}, Lcom/stripe/android/core/model/StripeJsonUtils;->optLong(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v12

    .line 209
    const-string v13, "client_secret"

    invoke-static {v0, v13}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 359
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v14

    if-nez v14, :cond_10

    const/4 v11, 0x0

    goto/16 :goto_12

    .line 363
    :cond_10
    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v14

    sparse-switch v14, :sswitch_data_1

    goto/16 :goto_10

    :sswitch_6
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_11

    goto/16 :goto_10

    .line 390
    :cond_11
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v14

    if-eqz v14, :cond_12

    .line 391
    new-instance v11, Lcom/stripe/android/model/parsers/SourceSepaDebitDataJsonParser;

    invoke-direct {v11}, Lcom/stripe/android/model/parsers/SourceSepaDebitDataJsonParser;-><init>()V

    invoke-virtual {v11, v14}, Lcom/stripe/android/model/parsers/SourceSepaDebitDataJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceTypeModel$SepaDebit;

    move-result-object v11

    goto :goto_a

    :cond_12
    const/4 v11, 0x0

    .line 390
    :goto_a
    check-cast v11, Lcom/stripe/android/core/model/StripeModel;

    goto/16 :goto_11

    .line 363
    :sswitch_7
    invoke-virtual {v10, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_13

    goto/16 :goto_10

    .line 365
    :cond_13
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    if-eqz v11, :cond_14

    .line 366
    new-instance v14, Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser;

    invoke-direct {v14}, Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser;-><init>()V

    invoke-virtual {v14, v11}, Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$CodeVerification;

    move-result-object v11

    goto :goto_b

    :cond_14
    const/4 v11, 0x0

    .line 365
    :goto_b
    check-cast v11, Lcom/stripe/android/core/model/StripeModel;

    goto/16 :goto_11

    .line 363
    :sswitch_8
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_15

    goto/16 :goto_10

    .line 370
    :cond_15
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    if-eqz v11, :cond_16

    .line 371
    new-instance v14, Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser;

    invoke-direct {v14}, Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser;-><init>()V

    invoke-virtual {v14, v11}, Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Owner;

    move-result-object v11

    goto :goto_c

    :cond_16
    const/4 v11, 0x0

    .line 370
    :goto_c
    check-cast v11, Lcom/stripe/android/core/model/StripeModel;

    goto :goto_11

    .line 363
    :sswitch_9
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_17

    goto :goto_10

    .line 385
    :cond_17
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    if-eqz v11, :cond_18

    .line 386
    new-instance v14, Lcom/stripe/android/model/parsers/SourceCardDataJsonParser;

    invoke-direct {v14}, Lcom/stripe/android/model/parsers/SourceCardDataJsonParser;-><init>()V

    invoke-virtual {v14, v11}, Lcom/stripe/android/model/parsers/SourceCardDataJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceTypeModel$Card;

    move-result-object v11

    goto :goto_d

    :cond_18
    const/4 v11, 0x0

    .line 385
    :goto_d
    check-cast v11, Lcom/stripe/android/core/model/StripeModel;

    goto :goto_11

    .line 363
    :sswitch_a
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_19

    goto :goto_10

    .line 380
    :cond_19
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    if-eqz v11, :cond_1a

    .line 381
    new-instance v14, Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser;

    invoke-direct {v14}, Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser;-><init>()V

    invoke-virtual {v14, v11}, Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Redirect;

    move-result-object v11

    goto :goto_e

    :cond_1a
    const/4 v11, 0x0

    .line 380
    :goto_e
    check-cast v11, Lcom/stripe/android/core/model/StripeModel;

    goto :goto_11

    .line 363
    :sswitch_b
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1b

    goto :goto_10

    .line 375
    :cond_1b
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    if-eqz v11, :cond_1c

    .line 376
    new-instance v14, Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser;

    invoke-direct {v14}, Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser;-><init>()V

    invoke-virtual {v14, v11}, Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Receiver;

    move-result-object v11

    goto :goto_f

    :cond_1c
    const/4 v11, 0x0

    .line 375
    :goto_f
    check-cast v11, Lcom/stripe/android/core/model/StripeModel;

    goto :goto_11

    :goto_10
    const/4 v11, 0x0

    .line 399
    :goto_11
    instance-of v14, v11, Lcom/stripe/android/model/Source$CodeVerification;

    if-nez v14, :cond_1d

    const/4 v11, 0x0

    :cond_1d
    check-cast v11, Lcom/stripe/android/model/Source$CodeVerification;

    check-cast v11, Lcom/stripe/android/core/model/StripeModel;

    .line 210
    :goto_12
    check-cast v11, Lcom/stripe/android/model/Source$CodeVerification;

    .line 214
    sget-object v14, Lcom/stripe/android/core/model/StripeJsonUtils;->INSTANCE:Lcom/stripe/android/core/model/StripeJsonUtils;

    move-object/from16 v18, v1

    const-string v1, "created"

    invoke-virtual {v14, v0, v1}, Lcom/stripe/android/core/model/StripeJsonUtils;->optLong(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    .line 215
    const-string v14, "currency"

    invoke-static {v0, v14}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v19, v1

    .line 216
    sget-object v1, Lcom/stripe/android/model/Source$Flow;->Companion:Lcom/stripe/android/model/Source$Flow$Companion;

    const-string v2, "flow"

    invoke-static {v0, v2}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/model/Source$Flow$Companion;->fromCode(Ljava/lang/String;)Lcom/stripe/android/model/Source$Flow;

    move-result-object v1

    .line 217
    const-string v2, "livemode"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v2

    .line 400
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v20

    if-nez v20, :cond_1e

    move-object/from16 v20, v1

    move/from16 v21, v2

    const/4 v1, 0x0

    goto/16 :goto_1c

    .line 404
    :cond_1e
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v20

    sparse-switch v20, :sswitch_data_2

    :goto_13
    move-object/from16 v20, v1

    move/from16 v21, v2

    goto/16 :goto_1a

    :sswitch_c
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v20

    if-nez v20, :cond_1f

    goto :goto_13

    :cond_1f
    move-object/from16 v20, v1

    .line 431
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    move/from16 v21, v2

    if-eqz v1, :cond_20

    .line 432
    new-instance v2, Lcom/stripe/android/model/parsers/SourceSepaDebitDataJsonParser;

    invoke-direct {v2}, Lcom/stripe/android/model/parsers/SourceSepaDebitDataJsonParser;-><init>()V

    invoke-virtual {v2, v1}, Lcom/stripe/android/model/parsers/SourceSepaDebitDataJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceTypeModel$SepaDebit;

    move-result-object v1

    goto :goto_14

    :cond_20
    const/4 v1, 0x0

    .line 431
    :goto_14
    check-cast v1, Lcom/stripe/android/core/model/StripeModel;

    goto/16 :goto_1b

    :sswitch_d
    move-object/from16 v20, v1

    move/from16 v21, v2

    .line 404
    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    goto/16 :goto_1a

    .line 406
    :cond_21
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_22

    .line 407
    new-instance v2, Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser;

    invoke-direct {v2}, Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser;-><init>()V

    invoke-virtual {v2, v1}, Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$CodeVerification;

    move-result-object v1

    goto :goto_15

    :cond_22
    const/4 v1, 0x0

    .line 406
    :goto_15
    check-cast v1, Lcom/stripe/android/core/model/StripeModel;

    goto/16 :goto_1b

    :sswitch_e
    move-object/from16 v20, v1

    move/from16 v21, v2

    .line 404
    invoke-virtual {v7, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    goto/16 :goto_1a

    .line 411
    :cond_23
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_24

    .line 412
    new-instance v2, Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser;

    invoke-direct {v2}, Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser;-><init>()V

    invoke-virtual {v2, v1}, Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Owner;

    move-result-object v1

    goto :goto_16

    :cond_24
    const/4 v1, 0x0

    .line 411
    :goto_16
    check-cast v1, Lcom/stripe/android/core/model/StripeModel;

    goto :goto_1b

    :sswitch_f
    move-object/from16 v20, v1

    move/from16 v21, v2

    .line 404
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    goto :goto_1a

    .line 426
    :cond_25
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_26

    .line 427
    new-instance v2, Lcom/stripe/android/model/parsers/SourceCardDataJsonParser;

    invoke-direct {v2}, Lcom/stripe/android/model/parsers/SourceCardDataJsonParser;-><init>()V

    invoke-virtual {v2, v1}, Lcom/stripe/android/model/parsers/SourceCardDataJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceTypeModel$Card;

    move-result-object v1

    goto :goto_17

    :cond_26
    const/4 v1, 0x0

    .line 426
    :goto_17
    check-cast v1, Lcom/stripe/android/core/model/StripeModel;

    goto :goto_1b

    :sswitch_10
    move-object/from16 v20, v1

    move/from16 v21, v2

    .line 404
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    goto :goto_1a

    .line 421
    :cond_27
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_28

    .line 422
    new-instance v2, Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser;

    invoke-direct {v2}, Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser;-><init>()V

    invoke-virtual {v2, v1}, Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Redirect;

    move-result-object v1

    goto :goto_18

    :cond_28
    const/4 v1, 0x0

    .line 421
    :goto_18
    check-cast v1, Lcom/stripe/android/core/model/StripeModel;

    goto :goto_1b

    :sswitch_11
    move-object/from16 v20, v1

    move/from16 v21, v2

    .line 404
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    goto :goto_1a

    .line 416
    :cond_29
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_2a

    .line 417
    new-instance v2, Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser;

    invoke-direct {v2}, Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser;-><init>()V

    invoke-virtual {v2, v1}, Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Receiver;

    move-result-object v1

    goto :goto_19

    :cond_2a
    const/4 v1, 0x0

    .line 416
    :goto_19
    check-cast v1, Lcom/stripe/android/core/model/StripeModel;

    goto :goto_1b

    :goto_1a
    const/4 v1, 0x0

    .line 440
    :goto_1b
    instance-of v2, v1, Lcom/stripe/android/model/Source$Owner;

    if-nez v2, :cond_2b

    const/4 v1, 0x0

    :cond_2b
    check-cast v1, Lcom/stripe/android/model/Source$Owner;

    check-cast v1, Lcom/stripe/android/core/model/StripeModel;

    .line 218
    :goto_1c
    check-cast v1, Lcom/stripe/android/model/Source$Owner;

    .line 441
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2c

    move-object/from16 v22, v1

    const/4 v1, 0x0

    goto/16 :goto_26

    .line 445
    :cond_2c
    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_3

    :goto_1d
    move-object/from16 v22, v1

    goto/16 :goto_24

    :sswitch_12
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2d

    goto :goto_1d

    .line 472
    :cond_2d
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    move-object/from16 v22, v1

    if-eqz v2, :cond_2e

    .line 473
    new-instance v1, Lcom/stripe/android/model/parsers/SourceSepaDebitDataJsonParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/SourceSepaDebitDataJsonParser;-><init>()V

    invoke-virtual {v1, v2}, Lcom/stripe/android/model/parsers/SourceSepaDebitDataJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceTypeModel$SepaDebit;

    move-result-object v1

    goto :goto_1e

    :cond_2e
    const/4 v1, 0x0

    .line 472
    :goto_1e
    check-cast v1, Lcom/stripe/android/core/model/StripeModel;

    goto/16 :goto_25

    :sswitch_13
    move-object/from16 v22, v1

    .line 445
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2f

    goto/16 :goto_24

    .line 447
    :cond_2f
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_30

    .line 448
    new-instance v2, Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser;

    invoke-direct {v2}, Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser;-><init>()V

    invoke-virtual {v2, v1}, Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$CodeVerification;

    move-result-object v1

    goto :goto_1f

    :cond_30
    const/4 v1, 0x0

    .line 447
    :goto_1f
    check-cast v1, Lcom/stripe/android/core/model/StripeModel;

    goto/16 :goto_25

    :sswitch_14
    move-object/from16 v22, v1

    .line 445
    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_31

    goto/16 :goto_24

    .line 452
    :cond_31
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_32

    .line 453
    new-instance v2, Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser;

    invoke-direct {v2}, Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser;-><init>()V

    invoke-virtual {v2, v1}, Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Owner;

    move-result-object v1

    goto :goto_20

    :cond_32
    const/4 v1, 0x0

    .line 452
    :goto_20
    check-cast v1, Lcom/stripe/android/core/model/StripeModel;

    goto :goto_25

    :sswitch_15
    move-object/from16 v22, v1

    .line 445
    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_33

    goto :goto_24

    .line 467
    :cond_33
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_34

    .line 468
    new-instance v2, Lcom/stripe/android/model/parsers/SourceCardDataJsonParser;

    invoke-direct {v2}, Lcom/stripe/android/model/parsers/SourceCardDataJsonParser;-><init>()V

    invoke-virtual {v2, v1}, Lcom/stripe/android/model/parsers/SourceCardDataJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceTypeModel$Card;

    move-result-object v1

    goto :goto_21

    :cond_34
    const/4 v1, 0x0

    .line 467
    :goto_21
    check-cast v1, Lcom/stripe/android/core/model/StripeModel;

    goto :goto_25

    :sswitch_16
    move-object/from16 v22, v1

    .line 445
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_35

    goto :goto_24

    .line 462
    :cond_35
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_36

    .line 463
    new-instance v2, Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser;

    invoke-direct {v2}, Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser;-><init>()V

    invoke-virtual {v2, v1}, Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Redirect;

    move-result-object v1

    goto :goto_22

    :cond_36
    const/4 v1, 0x0

    .line 462
    :goto_22
    check-cast v1, Lcom/stripe/android/core/model/StripeModel;

    goto :goto_25

    :sswitch_17
    move-object/from16 v22, v1

    .line 445
    invoke-virtual {v9, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_37

    goto :goto_24

    .line 457
    :cond_37
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_38

    .line 458
    new-instance v2, Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser;

    invoke-direct {v2}, Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser;-><init>()V

    invoke-virtual {v2, v1}, Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Receiver;

    move-result-object v1

    goto :goto_23

    :cond_38
    const/4 v1, 0x0

    .line 457
    :goto_23
    check-cast v1, Lcom/stripe/android/core/model/StripeModel;

    goto :goto_25

    :goto_24
    const/4 v1, 0x0

    .line 481
    :goto_25
    instance-of v2, v1, Lcom/stripe/android/model/Source$Receiver;

    if-nez v2, :cond_39

    const/4 v1, 0x0

    :cond_39
    check-cast v1, Lcom/stripe/android/model/Source$Receiver;

    check-cast v1, Lcom/stripe/android/core/model/StripeModel;

    .line 219
    :goto_26
    check-cast v1, Lcom/stripe/android/model/Source$Receiver;

    .line 482
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3a

    const/4 v2, 0x0

    goto/16 :goto_2f

    .line 486
    :cond_3a
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_4

    goto/16 :goto_2d

    :sswitch_18
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3b

    goto/16 :goto_2d

    .line 513
    :cond_3b
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_3c

    .line 514
    new-instance v5, Lcom/stripe/android/model/parsers/SourceSepaDebitDataJsonParser;

    invoke-direct {v5}, Lcom/stripe/android/model/parsers/SourceSepaDebitDataJsonParser;-><init>()V

    invoke-virtual {v5, v2}, Lcom/stripe/android/model/parsers/SourceSepaDebitDataJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceTypeModel$SepaDebit;

    move-result-object v2

    goto :goto_27

    :cond_3c
    const/4 v2, 0x0

    .line 513
    :goto_27
    check-cast v2, Lcom/stripe/android/core/model/StripeModel;

    goto/16 :goto_2e

    .line 486
    :sswitch_19
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3d

    goto/16 :goto_2d

    .line 488
    :cond_3d
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_3e

    .line 489
    new-instance v5, Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser;

    invoke-direct {v5}, Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser;-><init>()V

    invoke-virtual {v5, v2}, Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$CodeVerification;

    move-result-object v2

    goto :goto_28

    :cond_3e
    const/4 v2, 0x0

    .line 488
    :goto_28
    check-cast v2, Lcom/stripe/android/core/model/StripeModel;

    goto/16 :goto_2e

    .line 486
    :sswitch_1a
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3f

    goto/16 :goto_2d

    .line 493
    :cond_3f
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_40

    .line 494
    new-instance v5, Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser;

    invoke-direct {v5}, Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser;-><init>()V

    invoke-virtual {v5, v2}, Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Owner;

    move-result-object v2

    goto :goto_29

    :cond_40
    const/4 v2, 0x0

    .line 493
    :goto_29
    check-cast v2, Lcom/stripe/android/core/model/StripeModel;

    goto :goto_2e

    .line 486
    :sswitch_1b
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_41

    goto :goto_2d

    .line 508
    :cond_41
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_42

    .line 509
    new-instance v5, Lcom/stripe/android/model/parsers/SourceCardDataJsonParser;

    invoke-direct {v5}, Lcom/stripe/android/model/parsers/SourceCardDataJsonParser;-><init>()V

    invoke-virtual {v5, v2}, Lcom/stripe/android/model/parsers/SourceCardDataJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceTypeModel$Card;

    move-result-object v2

    goto :goto_2a

    :cond_42
    const/4 v2, 0x0

    .line 508
    :goto_2a
    check-cast v2, Lcom/stripe/android/core/model/StripeModel;

    goto :goto_2e

    .line 486
    :sswitch_1c
    invoke-virtual {v8, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_43

    goto :goto_2d

    .line 503
    :cond_43
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_44

    .line 504
    new-instance v5, Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser;

    invoke-direct {v5}, Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser;-><init>()V

    invoke-virtual {v5, v2}, Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Redirect;

    move-result-object v2

    goto :goto_2b

    :cond_44
    const/4 v2, 0x0

    .line 503
    :goto_2b
    check-cast v2, Lcom/stripe/android/core/model/StripeModel;

    goto :goto_2e

    .line 486
    :sswitch_1d
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_45

    goto :goto_2d

    .line 498
    :cond_45
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_46

    .line 499
    new-instance v5, Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser;

    invoke-direct {v5}, Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser;-><init>()V

    invoke-virtual {v5, v2}, Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Receiver;

    move-result-object v2

    goto :goto_2c

    :cond_46
    const/4 v2, 0x0

    .line 498
    :goto_2c
    check-cast v2, Lcom/stripe/android/core/model/StripeModel;

    goto :goto_2e

    :goto_2d
    const/4 v2, 0x0

    .line 522
    :goto_2e
    instance-of v5, v2, Lcom/stripe/android/model/Source$Redirect;

    if-nez v5, :cond_47

    const/4 v2, 0x0

    :cond_47
    check-cast v2, Lcom/stripe/android/model/Source$Redirect;

    check-cast v2, Lcom/stripe/android/core/model/StripeModel;

    .line 220
    :goto_2f
    check-cast v2, Lcom/stripe/android/model/Source$Redirect;

    .line 221
    const-string v5, "source_order"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    if-eqz v5, :cond_48

    .line 222
    new-instance v6, Lcom/stripe/android/model/parsers/SourceOrderJsonParser;

    invoke-direct {v6}, Lcom/stripe/android/model/parsers/SourceOrderJsonParser;-><init>()V

    invoke-virtual {v6, v5}, Lcom/stripe/android/model/parsers/SourceOrderJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceOrder;

    move-result-object v5

    goto :goto_30

    :cond_48
    const/4 v5, 0x0

    .line 224
    :goto_30
    const-string v6, "statement_descriptor"

    invoke-static {v0, v6}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v23

    .line 225
    sget-object v6, Lcom/stripe/android/model/Source$Status;->Companion:Lcom/stripe/android/model/Source$Status$Companion;

    const-string v7, "status"

    invoke-static {v0, v7}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/stripe/android/model/Source$Status$Companion;->fromCode(Ljava/lang/String;)Lcom/stripe/android/model/Source$Status;

    move-result-object v6

    .line 230
    sget-object v7, Lcom/stripe/android/model/Source$Usage;->Companion:Lcom/stripe/android/model/Source$Usage$Companion;

    const-string v8, "usage"

    invoke-static {v0, v8}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/stripe/android/model/Source$Usage$Companion;->fromCode(Ljava/lang/String;)Lcom/stripe/android/model/Source$Usage;

    move-result-object v7

    .line 231
    const-string v8, "wechat"

    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4a

    .line 232
    new-instance v9, Lcom/stripe/android/model/parsers/WeChatJsonParser;

    invoke-direct {v9}, Lcom/stripe/android/model/parsers/WeChatJsonParser;-><init>()V

    .line 233
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    if-nez v8, :cond_49

    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 232
    :cond_49
    invoke-virtual {v9, v8}, Lcom/stripe/android/model/parsers/WeChatJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/WeChat;

    move-result-object v8

    goto :goto_31

    :cond_4a
    const/4 v8, 0x0

    .line 238
    :goto_31
    const-string v9, "klarna"

    invoke-static {v9, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4c

    .line 239
    new-instance v10, Lcom/stripe/android/model/parsers/SourceJsonParser$KlarnaJsonParser;

    invoke-direct {v10}, Lcom/stripe/android/model/parsers/SourceJsonParser$KlarnaJsonParser;-><init>()V

    .line 240
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_4b

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 239
    :cond_4b
    invoke-virtual {v10, v0}, Lcom/stripe/android/model/parsers/SourceJsonParser$KlarnaJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Klarna;

    move-result-object v0

    goto :goto_32

    :cond_4c
    const/4 v0, 0x0

    :goto_32
    move-object/from16 v9, v20

    move-object/from16 v20, v8

    move-object v8, v14

    move-object v14, v6

    move-object v6, v11

    move-object/from16 v11, v22

    move-object/from16 v22, v5

    move-object v5, v13

    move-object v13, v2

    .line 206
    new-instance v2, Lcom/stripe/android/model/Source;

    .line 217
    invoke-static/range {v21 .. v21}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    move-object/from16 v17, v19

    move-object/from16 v19, v7

    move-object/from16 v7, v17

    move-object/from16 v21, v0

    move-object/from16 v17, v3

    move-object v3, v4

    move-object v4, v12

    move-object v12, v1

    .line 206
    invoke-direct/range {v2 .. v23}, Lcom/stripe/android/model/Source;-><init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$CodeVerification;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$Flow;Ljava/lang/Boolean;Lcom/stripe/android/model/Source$Owner;Lcom/stripe/android/model/Source$Receiver;Lcom/stripe/android/model/Source$Redirect;Lcom/stripe/android/model/Source$Status;Ljava/util/Map;Lcom/stripe/android/model/SourceTypeModel;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Source$Usage;Lcom/stripe/android/model/WeChat;Lcom/stripe/android/model/Source$Klarna;Lcom/stripe/android/model/SourceOrder;Ljava/lang/String;)V

    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        -0x30341611 -> :sswitch_5
        -0x2e430824 -> :sswitch_4
        0x2e7b10 -> :sswitch_3
        0x653f2b3 -> :sswitch_2
        0x604b5b2d -> :sswitch_1
        0x618aa970 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x30341611 -> :sswitch_b
        -0x2e430824 -> :sswitch_a
        0x2e7b10 -> :sswitch_9
        0x653f2b3 -> :sswitch_8
        0x604b5b2d -> :sswitch_7
        0x618aa970 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        -0x30341611 -> :sswitch_11
        -0x2e430824 -> :sswitch_10
        0x2e7b10 -> :sswitch_f
        0x653f2b3 -> :sswitch_e
        0x604b5b2d -> :sswitch_d
        0x618aa970 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        -0x30341611 -> :sswitch_17
        -0x2e430824 -> :sswitch_16
        0x2e7b10 -> :sswitch_15
        0x653f2b3 -> :sswitch_14
        0x604b5b2d -> :sswitch_13
        0x618aa970 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        -0x30341611 -> :sswitch_1d
        -0x2e430824 -> :sswitch_1c
        0x2e7b10 -> :sswitch_1b
        0x653f2b3 -> :sswitch_1a
        0x604b5b2d -> :sswitch_19
        0x618aa970 -> :sswitch_18
    .end sparse-switch
.end method

.method private final synthetic optStripeJsonModel(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/stripe/android/core/model/StripeModel;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/stripe/android/core/model/StripeModel;",
            ">(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .line 252
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 256
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "sepa_debit"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    goto/16 :goto_0

    .line 283
    :cond_1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_2

    move-object p2, p1

    check-cast p2, Lorg/json/JSONObject;

    .line 284
    new-instance p2, Lcom/stripe/android/model/parsers/SourceSepaDebitDataJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/SourceSepaDebitDataJsonParser;-><init>()V

    invoke-virtual {p2, p1}, Lcom/stripe/android/model/parsers/SourceSepaDebitDataJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceTypeModel$SepaDebit;

    move-result-object v1

    .line 283
    move-object p1, v1

    check-cast p1, Lcom/stripe/android/model/SourceTypeModel$SepaDebit;

    :cond_2
    check-cast v1, Lcom/stripe/android/core/model/StripeModel;

    goto/16 :goto_1

    .line 256
    :sswitch_1
    const-string v0, "code_verification"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    goto/16 :goto_0

    .line 258
    :cond_3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_4

    move-object p2, p1

    check-cast p2, Lorg/json/JSONObject;

    .line 259
    new-instance p2, Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser;-><init>()V

    invoke-virtual {p2, p1}, Lcom/stripe/android/model/parsers/SourceJsonParser$CodeVerificationJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$CodeVerification;

    move-result-object v1

    .line 258
    move-object p1, v1

    check-cast p1, Lcom/stripe/android/model/Source$CodeVerification;

    :cond_4
    check-cast v1, Lcom/stripe/android/core/model/StripeModel;

    goto/16 :goto_1

    .line 256
    :sswitch_2
    const-string v0, "owner"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    goto/16 :goto_0

    .line 263
    :cond_5
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_6

    move-object p2, p1

    check-cast p2, Lorg/json/JSONObject;

    .line 264
    new-instance p2, Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser;-><init>()V

    invoke-virtual {p2, p1}, Lcom/stripe/android/model/parsers/SourceJsonParser$OwnerJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Owner;

    move-result-object v1

    .line 263
    move-object p1, v1

    check-cast p1, Lcom/stripe/android/model/Source$Owner;

    :cond_6
    check-cast v1, Lcom/stripe/android/core/model/StripeModel;

    goto :goto_1

    .line 256
    :sswitch_3
    const-string v0, "card"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    goto :goto_0

    .line 278
    :cond_7
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_8

    move-object p2, p1

    check-cast p2, Lorg/json/JSONObject;

    .line 279
    new-instance p2, Lcom/stripe/android/model/parsers/SourceCardDataJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/SourceCardDataJsonParser;-><init>()V

    invoke-virtual {p2, p1}, Lcom/stripe/android/model/parsers/SourceCardDataJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceTypeModel$Card;

    move-result-object v1

    .line 278
    move-object p1, v1

    check-cast p1, Lcom/stripe/android/model/SourceTypeModel$Card;

    :cond_8
    check-cast v1, Lcom/stripe/android/core/model/StripeModel;

    goto :goto_1

    .line 256
    :sswitch_4
    const-string v0, "redirect"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_9

    goto :goto_0

    .line 273
    :cond_9
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_a

    move-object p2, p1

    check-cast p2, Lorg/json/JSONObject;

    .line 274
    new-instance p2, Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser;-><init>()V

    invoke-virtual {p2, p1}, Lcom/stripe/android/model/parsers/SourceJsonParser$RedirectJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Redirect;

    move-result-object v1

    .line 273
    move-object p1, v1

    check-cast p1, Lcom/stripe/android/model/Source$Redirect;

    :cond_a
    check-cast v1, Lcom/stripe/android/core/model/StripeModel;

    goto :goto_1

    .line 256
    :sswitch_5
    const-string v0, "receiver"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_b

    goto :goto_0

    .line 268
    :cond_b
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_c

    move-object p2, p1

    check-cast p2, Lorg/json/JSONObject;

    .line 269
    new-instance p2, Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser;

    invoke-direct {p2}, Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser;-><init>()V

    invoke-virtual {p2, p1}, Lcom/stripe/android/model/parsers/SourceJsonParser$ReceiverJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source$Receiver;

    move-result-object v1

    .line 268
    move-object p1, v1

    check-cast p1, Lcom/stripe/android/model/Source$Receiver;

    :cond_c
    check-cast v1, Lcom/stripe/android/core/model/StripeModel;

    goto :goto_1

    .line 288
    :goto_0
    move-object p1, v1

    check-cast p1, Lcom/stripe/android/core/model/StripeModel;

    :goto_1
    const/4 p1, 0x2

    .line 292
    const-string p2, "T"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->reifiedOperationMarker(ILjava/lang/String;)V

    move-object p1, v1

    check-cast p1, Lcom/stripe/android/core/model/StripeModel;

    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x30341611 -> :sswitch_5
        -0x2e430824 -> :sswitch_4
        0x2e7b10 -> :sswitch_3
        0x653f2b3 -> :sswitch_2
        0x604b5b2d -> :sswitch_1
        0x618aa970 -> :sswitch_0
    .end sparse-switch
.end method
