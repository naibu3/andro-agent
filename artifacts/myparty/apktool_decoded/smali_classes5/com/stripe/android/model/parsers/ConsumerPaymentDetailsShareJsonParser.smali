.class public final Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsShareJsonParser;
.super Ljava/lang/Object;
.source "ConsumerPaymentDetailsShareJsonParser.kt"

# interfaces
.implements Lcom/stripe/android/core/model/parsers/ModelJsonParser;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
        "Lcom/stripe/android/model/ConsumerPaymentDetailsShare;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u00c1\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0008\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsShareJsonParser;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser;",
        "Lcom/stripe/android/model/ConsumerPaymentDetailsShare;",
        "<init>",
        "()V",
        "FIELD_PAYMENT_METHOD",
        "",
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
.field public static final $stable:I = 0x0

.field private static final FIELD_PAYMENT_METHOD:Ljava/lang/String; = "payment_method"

.field public static final INSTANCE:Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsShareJsonParser;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsShareJsonParser;

    invoke-direct {v0}, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsShareJsonParser;-><init>()V

    sput-object v0, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsShareJsonParser;->INSTANCE:Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsShareJsonParser;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;
    .locals 0

    .line 7
    invoke-virtual {p0, p1}, Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsShareJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/ConsumerPaymentDetailsShare;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/model/StripeModel;

    return-object p1
.end method

.method public parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/ConsumerPaymentDetailsShare;
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    const-string v0, "payment_method"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 12
    :cond_0
    new-instance v0, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;

    invoke-direct {v0}, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;-><init>()V

    invoke-virtual {v0, p1}, Lcom/stripe/android/model/parsers/PaymentMethodJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    .line 13
    new-instance v0, Lcom/stripe/android/model/ConsumerPaymentDetailsShare;

    invoke-direct {v0, p1}, Lcom/stripe/android/model/ConsumerPaymentDetailsShare;-><init>(Lcom/stripe/android/model/PaymentMethod;)V

    return-object v0
.end method
