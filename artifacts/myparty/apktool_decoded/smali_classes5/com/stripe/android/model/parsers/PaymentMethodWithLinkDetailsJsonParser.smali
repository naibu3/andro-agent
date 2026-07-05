.class public final Lcom/stripe/android/model/parsers/PaymentMethodWithLinkDetailsJsonParser;
.super Ljava/lang/Object;
.source "PaymentMethodWithLinkDetailsJsonParser.kt"

# interfaces
.implements Lcom/stripe/android/core/model/parsers/ModelJsonParser;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
        "Lcom/stripe/android/model/PaymentMethod;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008\u00c1\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\u0008\u001a\u00020\t2\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/model/parsers/PaymentMethodWithLinkDetailsJsonParser;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser;",
        "Lcom/stripe/android/model/PaymentMethod;",
        "<init>",
        "()V",
        "parse",
        "json",
        "Lorg/json/JSONObject;",
        "isUnsupportedLinkPaymentDetailsType",
        "",
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


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/model/parsers/PaymentMethodWithLinkDetailsJsonParser;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/model/parsers/PaymentMethodWithLinkDetailsJsonParser;

    invoke-direct {v0}, Lcom/stripe/android/model/parsers/PaymentMethodWithLinkDetailsJsonParser;-><init>()V

    sput-object v0, Lcom/stripe/android/model/parsers/PaymentMethodWithLinkDetailsJsonParser;->INSTANCE:Lcom/stripe/android/model/parsers/PaymentMethodWithLinkDetailsJsonParser;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final isUnsupportedLinkPaymentDetailsType(Lorg/json/JSONObject;)Z
    .locals 4

    const/4 v0, 0x2

    .line 60
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "CARD"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "BANK_ACCOUNT"

    const/4 v3, 0x1

    aput-object v1, v0, v3

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    if-eqz p1, :cond_0

    .line 61
    check-cast v0, Ljava/lang/Iterable;

    const-string v1, "type"

    invoke-static {p1, v1}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return v3

    :cond_0
    return v2
.end method


# virtual methods
.method public bridge synthetic parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;
    .locals 0

    .line 11
    invoke-virtual {p0, p1}, Lcom/stripe/android/model/parsers/PaymentMethodWithLinkDetailsJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/model/StripeModel;

    return-object p1
.end method

.method public parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod;
    .locals 28

    move-object/from16 v0, p1

    const-string v1, "json"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    new-instance v1, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;-><init>()V

    const-string v2, "payment_method"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "getJSONObject(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod;

    move-result-object v4

    .line 15
    const-string v1, "link_payment_details"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 16
    sget-object v2, Lcom/stripe/android/core/model/StripeJsonUtils;->INSTANCE:Lcom/stripe/android/core/model/StripeJsonUtils;

    const-string v3, "is_link_origin"

    invoke-virtual {v2, v0, v3}, Lcom/stripe/android/core/model/StripeJsonUtils;->optBoolean(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v0

    move-object/from16 v2, p0

    .line 18
    invoke-direct {v2, v1}, Lcom/stripe/android/model/parsers/PaymentMethodWithLinkDetailsJsonParser;->isUnsupportedLinkPaymentDetailsType(Lorg/json/JSONObject;)Z

    move-result v3

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    return-object v5

    :cond_0
    if-eqz v1, :cond_1

    .line 24
    sget-object v3, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;->INSTANCE:Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;

    invoke-virtual {v3, v1}, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParser;->parsePaymentDetails(Lorg/json/JSONObject;)Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v5

    .line 28
    :goto_0
    instance-of v3, v1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    if-eqz v3, :cond_3

    .line 29
    new-instance v6, Lcom/stripe/android/model/LinkPaymentDetails$Card;

    .line 30
    check-cast v1, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getNickname()Ljava/lang/String;

    move-result-object v7

    .line 31
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getExpiryMonth()I

    move-result v8

    .line 32
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getExpiryYear()I

    move-result v9

    .line 33
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getLast4()Ljava/lang/String;

    move-result-object v10

    .line 34
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v11

    .line 35
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getFunding()Ljava/lang/String;

    move-result-object v12

    .line 29
    invoke-direct/range {v6 .. v12}, Lcom/stripe/android/model/LinkPaymentDetails$Card;-><init>(Ljava/lang/String;IILjava/lang/String;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;)V

    move-object v5, v6

    check-cast v5, Lcom/stripe/android/model/LinkPaymentDetails;

    :cond_2
    :goto_1
    move-object/from16 v23, v5

    goto :goto_2

    .line 38
    :cond_3
    instance-of v3, v1, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    if-eqz v3, :cond_4

    .line 39
    new-instance v3, Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;

    .line 40
    check-cast v1, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;->getBankName()Ljava/lang/String;

    move-result-object v5

    .line 41
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;->getLast4()Ljava/lang/String;

    move-result-object v1

    .line 39
    invoke-direct {v3, v5, v1}, Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v5, v3

    check-cast v5, Lcom/stripe/android/model/LinkPaymentDetails;

    goto :goto_1

    .line 44
    :cond_4
    instance-of v3, v1, Lcom/stripe/android/model/ConsumerPaymentDetails$Passthrough;

    if-nez v3, :cond_2

    if-nez v1, :cond_5

    goto :goto_1

    .line 27
    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :goto_2
    if-eqz v0, :cond_6

    if-nez v23, :cond_6

    const/4 v0, 0x1

    goto :goto_3

    :cond_6
    const/4 v0, 0x0

    :goto_3
    move/from16 v24, v0

    const v26, 0x13ffff

    const/16 v27, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    .line 52
    invoke-static/range {v4 .. v27}, Lcom/stripe/android/model/PaymentMethod;->copy$default(Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/Long;ZLjava/lang/String;Lcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Card;Lcom/stripe/android/model/PaymentMethod$CardPresent;Lcom/stripe/android/model/PaymentMethod$Fpx;Lcom/stripe/android/model/PaymentMethod$Ideal;Lcom/stripe/android/model/PaymentMethod$SepaDebit;Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;Lcom/stripe/android/model/PaymentMethod$BacsDebit;Lcom/stripe/android/model/PaymentMethod$Sofort;Lcom/stripe/android/model/PaymentMethod$Upi;Lcom/stripe/android/model/PaymentMethod$Netbanking;Lcom/stripe/android/model/PaymentMethod$USBankAccount;Lcom/stripe/android/model/LinkPaymentDetails;ZLcom/stripe/android/model/PaymentMethod$AllowRedisplay;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentMethod;

    move-result-object v0

    return-object v0
.end method
