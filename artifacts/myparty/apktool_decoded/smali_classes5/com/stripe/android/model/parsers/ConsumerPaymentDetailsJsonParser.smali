.class public final Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;
.super Ljava/lang/Object;
.source "ConsumerPaymentDetailsJsonParser.kt"

# interfaces
.implements Lcom/stripe/android/core/model/parsers/ModelJsonParser;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
        "Lcom/stripe/android/model/ConsumerPaymentDetails;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nConsumerPaymentDetailsJsonParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsumerPaymentDetailsJsonParser.kt\ncom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1557#2:130\n1628#2,3:131\n1611#2,9:134\n1863#2:143\n1864#2:145\n1620#2:146\n1#3:144\n1#3:147\n*S KotlinDebug\n*F\n+ 1 ConsumerPaymentDetailsJsonParser.kt\ncom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser\n*L\n51#1:130\n51#1:131,3\n52#1:134,9\n52#1:143\n52#1:145\n52#1:146\n52#1:144\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser;",
        "Lcom/stripe/android/model/ConsumerPaymentDetails;",
        "<init>",
        "()V",
        "parse",
        "json",
        "Lorg/json/JSONObject;",
        "parsePaymentDetails",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "parseBillingAddress",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;",
        "cardBrandFix",
        "",
        "original",
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
.field public static final INSTANCE:Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;

    invoke-direct {v0}, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;-><init>()V

    sput-object v0, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;->INSTANCE:Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final cardBrandFix(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 121
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toLowerCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    const-string v0, "american_express"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "amex"

    return-object p1

    .line 124
    :cond_0
    const-string v0, "diners_club"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "diners"

    :cond_1
    return-object p1
.end method

.method private final parseBillingAddress(Lorg/json/JSONObject;)Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;
    .locals 10

    .line 106
    const-string v0, "billing_address"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 108
    const-string v1, "name"

    invoke-static {p1, v1}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 109
    const-string v1, "line_1"

    invoke-static {p1, v1}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 110
    const-string v1, "line_2"

    invoke-static {p1, v1}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 111
    const-string v1, "locality"

    invoke-static {p1, v1}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 112
    const-string v1, "postal_code"

    invoke-static {p1, v1}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 113
    const-string v1, "administrative_area"

    invoke-static {p1, v1}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 114
    const-string v1, "country_code"

    invoke-static {p1, v1}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Lcom/stripe/android/core/model/CountryCode;

    invoke-direct {v0, p1}, Lcom/stripe/android/core/model/CountryCode;-><init>(Ljava/lang/String;)V

    :cond_0
    move-object v9, v0

    .line 107
    new-instance v2, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/model/CountryCode;)V

    return-object v2

    :cond_1
    return-object v0
.end method


# virtual methods
.method public bridge synthetic parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;
    .locals 0

    .line 45
    invoke-virtual {p0, p1}, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/ConsumerPaymentDetails;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/model/StripeModel;

    return-object p1
.end method

.method public parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/ConsumerPaymentDetails;
    .locals 3

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    const-string v0, "redacted_payment_details"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    if-eqz v1, :cond_3

    const/4 p1, 0x0

    .line 50
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v0

    invoke-static {p1, v0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 130
    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 131
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, p1

    check-cast v2, Lkotlin/collections/IntIterator;

    invoke-virtual {v2}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v2

    .line 51
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    .line 132
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 133
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 130
    check-cast v0, Ljava/lang/Iterable;

    .line 134
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/Collection;

    .line 143
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 142
    check-cast v1, Lorg/json/JSONObject;

    .line 52
    sget-object v2, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;->INSTANCE:Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, v1}, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;->parsePaymentDetails(Lorg/json/JSONObject;)Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 142
    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 146
    :cond_2
    check-cast p1, Ljava/util/List;

    goto :goto_2

    .line 54
    :cond_3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 55
    sget-object v0, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;->INSTANCE:Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;

    invoke-virtual {v0, p1}, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;->parsePaymentDetails(Lorg/json/JSONObject;)Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 56
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_2

    :cond_4
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    .line 57
    :goto_2
    new-instance v0, Lcom/stripe/android/model/ConsumerPaymentDetails;

    invoke-direct {v0, p1}, Lcom/stripe/android/model/ConsumerPaymentDetails;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public final parsePaymentDetails(Lorg/json/JSONObject;)Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;
    .locals 17

    move-object/from16 v0, p1

    const-string v1, "json"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    const-string v1, "type"

    invoke-static {v0, v1}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 63
    const-string v3, "id"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 64
    const-string v3, "is_default"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    .line 65
    const-string v3, "nickname"

    invoke-static {v0, v3}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    move-object v4, v3

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    move-object v8, v3

    goto :goto_0

    :cond_0
    move-object v8, v2

    .line 67
    :goto_0
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "toLowerCase(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    const-string v3, "card"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "billing_email_address"

    const-string v6, "last4"

    const-string v9, "getString(...)"

    if-eqz v3, :cond_2

    .line 69
    const-string v1, "card_details"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 70
    const-string v3, "checks"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 71
    sget-object v10, Lcom/stripe/android/core/model/parsers/ModelJsonParser;->Companion:Lcom/stripe/android/core/model/parsers/ModelJsonParser$Companion;

    const-string v11, "networks"

    invoke-virtual {v1, v11}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/stripe/android/core/model/parsers/ModelJsonParser$Companion;->jsonArrayToList(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v14

    .line 74
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 75
    const-string v10, "exp_year"

    invoke-virtual {v1, v10}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v11

    .line 76
    const-string v10, "exp_month"

    invoke-virtual {v1, v10}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v12

    .line 77
    sget-object v10, Lcom/stripe/android/model/CardBrand;->Companion:Lcom/stripe/android/model/CardBrand$Companion;

    sget-object v13, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;->INSTANCE:Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;

    const-string v15, "brand"

    invoke-virtual {v1, v15}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v13, v15}, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;->cardBrandFix(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v10, v15}, Lcom/stripe/android/model/CardBrand$Companion;->fromCode(Ljava/lang/String;)Lcom/stripe/android/model/CardBrand;

    move-result-object v10

    .line 79
    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    sget-object v15, Lcom/stripe/android/model/CvcCheck;->Companion:Lcom/stripe/android/model/CvcCheck$Companion;

    if-eqz v3, :cond_1

    const-string v2, "cvc_check"

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_1
    invoke-virtual {v15, v2}, Lcom/stripe/android/model/CvcCheck$Companion;->fromCode(Ljava/lang/String;)Lcom/stripe/android/model/CvcCheck;

    move-result-object v15

    .line 81
    const-string v2, "funding"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    invoke-direct {v13, v0}, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;->parseBillingAddress(Lorg/json/JSONObject;)Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    move-result-object v9

    move-object v13, v10

    .line 83
    invoke-static {v0, v4}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 73
    new-instance v4, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    move-object/from16 v16, v1

    invoke-direct/range {v4 .. v16}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;IILcom/stripe/android/model/CardBrand;Ljava/util/List;Lcom/stripe/android/model/CvcCheck;Ljava/lang/String;)V

    check-cast v4, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    return-object v4

    .line 88
    :cond_2
    const-string v3, "bank_account"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 89
    const-string v1, "bank_account_details"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 91
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 92
    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    const-string v2, "bank_name"

    invoke-static {v1, v2}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 94
    const-string v2, "bank_icon_code"

    invoke-static {v1, v2}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 97
    sget-object v1, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;->INSTANCE:Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;

    invoke-direct {v1, v0}, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;->parseBillingAddress(Lorg/json/JSONObject;)Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    move-result-object v11

    .line 98
    invoke-static {v0, v4}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 90
    new-instance v4, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    invoke-direct/range {v4 .. v12}, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;)V

    check-cast v4, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    return-object v4

    :cond_3
    return-object v2
.end method
