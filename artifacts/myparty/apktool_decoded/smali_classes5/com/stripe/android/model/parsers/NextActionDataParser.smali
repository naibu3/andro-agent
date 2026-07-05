.class public final Lcom/stripe/android/model/parsers/NextActionDataParser;
.super Ljava/lang/Object;
.source "NextActionDataParser.kt"

# interfaces
.implements Lcom/stripe/android/core/model/parsers/ModelJsonParser;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/parsers/NextActionDataParser$AlipayRedirectParser;,
        Lcom/stripe/android/model/parsers/NextActionDataParser$BlikAuthorizeParser;,
        Lcom/stripe/android/model/parsers/NextActionDataParser$CashAppRedirectParser;,
        Lcom/stripe/android/model/parsers/NextActionDataParser$Companion;,
        Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayBoletoDetailsJsonParser;,
        Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayKonbiniDetailsJsonParser;,
        Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayMultibancoDetailsJsonParser;,
        Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayOxxoDetailsJsonParser;,
        Lcom/stripe/android/model/parsers/NextActionDataParser$RedirectToUrlParser;,
        Lcom/stripe/android/model/parsers/NextActionDataParser$SdkDataJsonParser;,
        Lcom/stripe/android/model/parsers/NextActionDataParser$SwishRedirectParser;,
        Lcom/stripe/android/model/parsers/NextActionDataParser$UpiAwaitNotificationParser;,
        Lcom/stripe/android/model/parsers/NextActionDataParser$VerifyWithMicrodepositsParser;,
        Lcom/stripe/android/model/parsers/NextActionDataParser$WeChatPayRedirectParser;,
        Lcom/stripe/android/model/parsers/NextActionDataParser$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
        "Lcom/stripe/android/model/StripeIntent$NextActionData;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0001\u0018\u0000 \u00152\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u000e\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/model/parsers/NextActionDataParser;",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser;",
        "Lcom/stripe/android/model/StripeIntent$NextActionData;",
        "<init>",
        "()V",
        "parse",
        "json",
        "Lorg/json/JSONObject;",
        "DisplayOxxoDetailsJsonParser",
        "DisplayBoletoDetailsJsonParser",
        "DisplayKonbiniDetailsJsonParser",
        "DisplayMultibancoDetailsJsonParser",
        "RedirectToUrlParser",
        "AlipayRedirectParser",
        "SdkDataJsonParser",
        "BlikAuthorizeParser",
        "WeChatPayRedirectParser",
        "VerifyWithMicrodepositsParser",
        "UpiAwaitNotificationParser",
        "CashAppRedirectParser",
        "SwishRedirectParser",
        "Companion",
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

.field private static final Companion:Lcom/stripe/android/model/parsers/NextActionDataParser$Companion;

.field private static final FIELD_NEXT_ACTION_TYPE:Ljava/lang/String; = "type"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/model/parsers/NextActionDataParser$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/parsers/NextActionDataParser;->Companion:Lcom/stripe/android/model/parsers/NextActionDataParser$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;
    .locals 0

    .line 12
    invoke-virtual {p0, p1}, Lcom/stripe/android/model/parsers/NextActionDataParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$NextActionData;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/model/StripeModel;

    return-object p1
.end method

.method public parse(Lorg/json/JSONObject;)Lcom/stripe/android/model/StripeIntent$NextActionData;
    .locals 3

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    sget-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->Companion:Lcom/stripe/android/model/StripeIntent$NextActionType$Companion;

    .line 17
    const-string v1, "type"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Lcom/stripe/android/model/StripeIntent$NextActionType$Companion;->fromCode$payments_core_release(Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$NextActionType;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v1, -0x1

    goto :goto_0

    .line 19
    :cond_0
    sget-object v1, Lcom/stripe/android/model/parsers/NextActionDataParser$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/stripe/android/model/StripeIntent$NextActionType;->ordinal()I

    move-result v2

    aget v1, v1, v2

    :goto_0
    packed-switch v1, :pswitch_data_0

    :pswitch_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 32
    :pswitch_1
    new-instance v1, Lcom/stripe/android/model/parsers/NextActionDataParser$SwishRedirectParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$SwishRedirectParser;-><init>()V

    check-cast v1, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    goto :goto_1

    .line 31
    :pswitch_2
    new-instance v1, Lcom/stripe/android/model/parsers/NextActionDataParser$CashAppRedirectParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$CashAppRedirectParser;-><init>()V

    check-cast v1, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    goto :goto_1

    .line 30
    :pswitch_3
    new-instance v1, Lcom/stripe/android/model/parsers/NextActionDataParser$UpiAwaitNotificationParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$UpiAwaitNotificationParser;-><init>()V

    check-cast v1, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    goto :goto_1

    .line 29
    :pswitch_4
    new-instance v1, Lcom/stripe/android/model/parsers/NextActionDataParser$VerifyWithMicrodepositsParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$VerifyWithMicrodepositsParser;-><init>()V

    check-cast v1, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    goto :goto_1

    .line 28
    :pswitch_5
    new-instance v1, Lcom/stripe/android/model/parsers/NextActionDataParser$WeChatPayRedirectParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$WeChatPayRedirectParser;-><init>()V

    check-cast v1, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    goto :goto_1

    .line 27
    :pswitch_6
    new-instance v1, Lcom/stripe/android/model/parsers/NextActionDataParser$BlikAuthorizeParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$BlikAuthorizeParser;-><init>()V

    check-cast v1, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    goto :goto_1

    .line 26
    :pswitch_7
    new-instance v1, Lcom/stripe/android/model/parsers/NextActionDataParser$AlipayRedirectParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$AlipayRedirectParser;-><init>()V

    check-cast v1, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    goto :goto_1

    .line 25
    :pswitch_8
    new-instance v1, Lcom/stripe/android/model/parsers/NextActionDataParser$SdkDataJsonParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$SdkDataJsonParser;-><init>()V

    check-cast v1, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    goto :goto_1

    .line 24
    :pswitch_9
    new-instance v1, Lcom/stripe/android/model/parsers/NextActionDataParser$RedirectToUrlParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$RedirectToUrlParser;-><init>()V

    check-cast v1, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    goto :goto_1

    .line 23
    :pswitch_a
    new-instance v1, Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayMultibancoDetailsJsonParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayMultibancoDetailsJsonParser;-><init>()V

    check-cast v1, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    goto :goto_1

    .line 22
    :pswitch_b
    new-instance v1, Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayKonbiniDetailsJsonParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayKonbiniDetailsJsonParser;-><init>()V

    check-cast v1, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    goto :goto_1

    .line 21
    :pswitch_c
    new-instance v1, Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayBoletoDetailsJsonParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayBoletoDetailsJsonParser;-><init>()V

    check-cast v1, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    goto :goto_1

    .line 20
    :pswitch_d
    new-instance v1, Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayOxxoDetailsJsonParser;

    invoke-direct {v1}, Lcom/stripe/android/model/parsers/NextActionDataParser$DisplayOxxoDetailsJsonParser;-><init>()V

    check-cast v1, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    .line 35
    :goto_1
    invoke-virtual {v0}, Lcom/stripe/android/model/StripeIntent$NextActionType;->getCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_1

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    :cond_1
    invoke-interface {v1, p1}, Lcom/stripe/android/core/model/parsers/ModelJsonParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/core/model/StripeModel;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/StripeIntent$NextActionData;

    return-object p1

    :pswitch_e
    const/4 p1, 0x0

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_e
        :pswitch_0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
