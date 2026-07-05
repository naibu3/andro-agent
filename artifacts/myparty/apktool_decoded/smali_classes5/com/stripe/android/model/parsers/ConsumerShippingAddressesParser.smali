.class public final Lcom/stripe/android/model/parsers/ConsumerShippingAddressesParser;
.super Ljava/lang/Object;
.source "ConsumerShippingAddressesParser.kt"

# interfaces
.implements Lcom/stripe/android/core/model/parsers/ModelJsonParser;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
        "Lcom/stripe/android/model/ConsumerShippingAddresses;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nConsumerShippingAddressesParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsumerShippingAddressesParser.kt\ncom/stripe/android/model/parsers/ConsumerShippingAddressesParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1611#2,9:49\n1863#2:58\n1864#2:60\n1620#2:61\n1#3:59\n1#3:62\n*S KotlinDebug\n*F\n+ 1 ConsumerShippingAddressesParser.kt\ncom/stripe/android/model/parsers/ConsumerShippingAddressesParser\n*L\n17#1:49,9\n17#1:58\n17#1:60\n17#1:61\n17#1:59\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/model/parsers/ConsumerShippingAddressesParser;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser;",
        "Lcom/stripe/android/model/ConsumerShippingAddresses;",
        "<init>",
        "()V",
        "parse",
        "json",
        "Lorg/json/JSONObject;",
        "parseShippingAddress",
        "Lcom/stripe/android/model/ConsumerShippingAddress;",
        "parseAddress",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;",
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
.field public static final INSTANCE:Lcom/stripe/android/model/parsers/ConsumerShippingAddressesParser;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/model/parsers/ConsumerShippingAddressesParser;

    invoke-direct {v0}, Lcom/stripe/android/model/parsers/ConsumerShippingAddressesParser;-><init>()V

    sput-object v0, Lcom/stripe/android/model/parsers/ConsumerShippingAddressesParser;->INSTANCE:Lcom/stripe/android/model/parsers/ConsumerShippingAddressesParser;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final parseAddress(Lorg/json/JSONObject;)Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;
    .locals 9

    .line 38
    const-string v0, "name"

    invoke-static {p1, v0}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 39
    const-string v0, "line_1"

    invoke-static {p1, v0}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 40
    const-string v0, "line_2"

    invoke-static {p1, v0}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 41
    const-string v0, "locality"

    invoke-static {p1, v0}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 42
    const-string v0, "administrative_area"

    invoke-static {p1, v0}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 43
    const-string v0, "postal_code"

    invoke-static {p1, v0}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 44
    const-string v0, "country_code"

    invoke-static {p1, v0}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Lcom/stripe/android/core/model/CountryCode;

    invoke-direct {v0, p1}, Lcom/stripe/android/core/model/CountryCode;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v8, v0

    .line 37
    new-instance v1, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/model/CountryCode;)V

    return-object v1
.end method

.method private final parseShippingAddress(Lorg/json/JSONObject;)Lcom/stripe/android/model/ConsumerShippingAddress;
    .locals 8

    .line 25
    const-string v0, "id"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 26
    const-string v0, "is_default"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    .line 27
    const-string v0, "address"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 29
    :cond_0
    new-instance v1, Lcom/stripe/android/model/ConsumerShippingAddress;

    .line 30
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 32
    invoke-direct {p0, p1}, Lcom/stripe/android/model/parsers/ConsumerShippingAddressesParser;->parseAddress(Lorg/json/JSONObject;)Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    .line 29
    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/model/ConsumerShippingAddress;-><init>(Ljava/lang/String;ZLcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method


# virtual methods
.method public bridge synthetic parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;
    .locals 0

    .line 12
    invoke-virtual {p0, p1}, Lcom/stripe/android/model/parsers/ConsumerShippingAddressesParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/ConsumerShippingAddresses;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/model/StripeModel;

    return-object p1
.end method

.method public parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/ConsumerShippingAddresses;
    .locals 4

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    const-string v0, "shipping_addresses"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 49
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 58
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v2, v0

    check-cast v2, Lkotlin/collections/IntIterator;

    invoke-virtual {v2}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v2

    .line 18
    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    .line 19
    sget-object v3, Lcom/stripe/android/model/parsers/ConsumerShippingAddressesParser;->INSTANCE:Lcom/stripe/android/model/parsers/ConsumerShippingAddressesParser;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v3, v2}, Lcom/stripe/android/model/parsers/ConsumerShippingAddressesParser;->parseShippingAddress(Lorg/json/JSONObject;)Lcom/stripe/android/model/ConsumerShippingAddress;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 57
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 61
    :cond_2
    check-cast v1, Ljava/util/List;

    .line 21
    new-instance p1, Lcom/stripe/android/model/ConsumerShippingAddresses;

    invoke-direct {p1, v1}, Lcom/stripe/android/model/ConsumerShippingAddresses;-><init>(Ljava/util/List;)V

    return-object p1
.end method
