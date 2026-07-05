.class public final Lcom/stripe/android/model/parsers/DisplayablePaymentDetailsJsonParser;
.super Ljava/lang/Object;
.source "DisplayablePaymentDetailsJsonParser.kt"

# interfaces
.implements Lcom/stripe/android/core/model/parsers/ModelJsonParser;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
        "Lcom/stripe/android/model/DisplayablePaymentDetails;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0008\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/model/parsers/DisplayablePaymentDetailsJsonParser;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser;",
        "Lcom/stripe/android/model/DisplayablePaymentDetails;",
        "<init>",
        "()V",
        "parse",
        "json",
        "Lorg/json/JSONObject;",
        "FIELD_DEFAULT_CARD_BRAND",
        "",
        "FIELD_DEFAULT_PAYMENT_TYPE",
        "FIELD_LAST_4",
        "FIELD_NUMBER_OF_SAVED_PAYMENT_DETAILS",
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
.field private static final FIELD_DEFAULT_CARD_BRAND:Ljava/lang/String; = "default_card_brand"

.field private static final FIELD_DEFAULT_PAYMENT_TYPE:Ljava/lang/String; = "default_payment_type"

.field private static final FIELD_LAST_4:Ljava/lang/String; = "last_4"

.field private static final FIELD_NUMBER_OF_SAVED_PAYMENT_DETAILS:Ljava/lang/String; = "number_of_saved_payment_details"

.field public static final INSTANCE:Lcom/stripe/android/model/parsers/DisplayablePaymentDetailsJsonParser;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/model/parsers/DisplayablePaymentDetailsJsonParser;

    invoke-direct {v0}, Lcom/stripe/android/model/parsers/DisplayablePaymentDetailsJsonParser;-><init>()V

    sput-object v0, Lcom/stripe/android/model/parsers/DisplayablePaymentDetailsJsonParser;->INSTANCE:Lcom/stripe/android/model/parsers/DisplayablePaymentDetailsJsonParser;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;
    .locals 0

    .line 10
    invoke-virtual {p0, p1}, Lcom/stripe/android/model/parsers/DisplayablePaymentDetailsJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/DisplayablePaymentDetails;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/model/StripeModel;

    return-object p1
.end method

.method public parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/DisplayablePaymentDetails;
    .locals 6

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    new-instance v0, Lcom/stripe/android/model/DisplayablePaymentDetails;

    .line 14
    const-string v1, "default_card_brand"

    invoke-static {p1, v1}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 15
    const-string v2, "default_payment_type"

    invoke-static {p1, v2}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 16
    const-string v3, "last_4"

    invoke-static {p1, v3}, Lcom/stripe/android/core/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 17
    sget-object v4, Lcom/stripe/android/core/model/StripeJsonUtils;->INSTANCE:Lcom/stripe/android/core/model/StripeJsonUtils;

    const-string v5, "number_of_saved_payment_details"

    invoke-virtual {v4, p1, v5}, Lcom/stripe/android/core/model/StripeJsonUtils;->optLong(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    .line 13
    invoke-direct {v0, v1, v2, v3, p1}, Lcom/stripe/android/model/DisplayablePaymentDetails;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    return-object v0
.end method
