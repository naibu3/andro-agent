.class public final Lcom/stripe/android/model/parsers/CustomerPaymentSourceJsonParser;
.super Ljava/lang/Object;
.source "CustomerPaymentSourceJsonParser.kt"

# interfaces
.implements Lcom/stripe/android/core/model/parsers/ModelJsonParser;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
        "Lcom/stripe/android/model/CustomerPaymentSource;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/model/parsers/CustomerPaymentSourceJsonParser;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser;",
        "Lcom/stripe/android/model/CustomerPaymentSource;",
        "<init>",
        "()V",
        "parse",
        "json",
        "Lorg/json/JSONObject;",
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;
    .locals 0

    .line 11
    invoke-virtual {p0, p1}, Lcom/stripe/android/model/parsers/CustomerPaymentSourceJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/CustomerPaymentSource;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/model/StripeModel;

    return-object p1
.end method

.method public parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/CustomerPaymentSource;
    .locals 4

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    const-string v0, "object"

    invoke-static {p1, v0}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, -0x6ccac4d6

    if-eq v2, v3, :cond_6

    const v3, -0x356f97e5    # -4731917.5f

    if-eq v2, v3, :cond_3

    const v3, 0x2e7b10

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "card"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 15
    :cond_1
    new-instance v0, Lcom/stripe/android/model/parsers/CardJsonParser;

    invoke-direct {v0}, Lcom/stripe/android/model/parsers/CardJsonParser;-><init>()V

    invoke-virtual {v0, p1}, Lcom/stripe/android/model/parsers/CardJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Card;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 16
    new-instance v1, Lcom/stripe/android/model/CustomerCard;

    invoke-direct {v1, p1}, Lcom/stripe/android/model/CustomerCard;-><init>(Lcom/stripe/android/model/Card;)V

    .line 15
    :cond_2
    check-cast v1, Lcom/stripe/android/model/CustomerPaymentSource;

    return-object v1

    .line 13
    :cond_3
    const-string v2, "source"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    .line 20
    :cond_4
    new-instance v0, Lcom/stripe/android/model/parsers/SourceJsonParser;

    invoke-direct {v0}, Lcom/stripe/android/model/parsers/SourceJsonParser;-><init>()V

    invoke-virtual {v0, p1}, Lcom/stripe/android/model/parsers/SourceJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 21
    new-instance v1, Lcom/stripe/android/model/CustomerSource;

    invoke-direct {v1, p1}, Lcom/stripe/android/model/CustomerSource;-><init>(Lcom/stripe/android/model/Source;)V

    .line 20
    :cond_5
    check-cast v1, Lcom/stripe/android/model/CustomerPaymentSource;

    return-object v1

    .line 13
    :cond_6
    const-string v2, "bank_account"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    .line 25
    :cond_7
    new-instance v0, Lcom/stripe/android/model/parsers/BankAccountJsonParser;

    invoke-direct {v0}, Lcom/stripe/android/model/parsers/BankAccountJsonParser;-><init>()V

    invoke-virtual {v0, p1}, Lcom/stripe/android/model/parsers/BankAccountJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/BankAccount;

    move-result-object p1

    .line 26
    new-instance v0, Lcom/stripe/android/model/CustomerBankAccount;

    invoke-direct {v0, p1}, Lcom/stripe/android/model/CustomerBankAccount;-><init>(Lcom/stripe/android/model/BankAccount;)V

    .line 25
    check-cast v0, Lcom/stripe/android/model/CustomerPaymentSource;

    return-object v0

    :cond_8
    :goto_0
    return-object v1
.end method
