.class public final enum Lcom/stripe/android/model/StripeIntent$NextActionType;
.super Ljava/lang/Enum;
.source "StripeIntent.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/StripeIntent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "NextActionType"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/StripeIntent$NextActionType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/model/StripeIntent$NextActionType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0014\u0008\u0086\u0081\u0002\u0018\u0000 \u00162\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u0015\u001a\u00020\u0003H\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/model/StripeIntent$NextActionType;",
        "",
        "code",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getCode",
        "()Ljava/lang/String;",
        "RedirectToUrl",
        "UseStripeSdk",
        "DisplayOxxoDetails",
        "AlipayRedirect",
        "BlikAuthorize",
        "WeChatPayRedirect",
        "VerifyWithMicrodeposits",
        "UpiAwaitNotification",
        "CashAppRedirect",
        "DisplayBoletoDetails",
        "DisplayKonbiniDetails",
        "DisplayMultibancoDetails",
        "SwishRedirect",
        "toString",
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
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final enum AlipayRedirect:Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final enum BlikAuthorize:Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final enum CashAppRedirect:Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final Companion:Lcom/stripe/android/model/StripeIntent$NextActionType$Companion;

.field public static final enum DisplayBoletoDetails:Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final enum DisplayKonbiniDetails:Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final enum DisplayMultibancoDetails:Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final enum DisplayOxxoDetails:Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final enum RedirectToUrl:Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final enum SwishRedirect:Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final enum UpiAwaitNotification:Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final enum UseStripeSdk:Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final enum VerifyWithMicrodeposits:Lcom/stripe/android/model/StripeIntent$NextActionType;

.field public static final enum WeChatPayRedirect:Lcom/stripe/android/model/StripeIntent$NextActionType;


# instance fields
.field private final code:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/model/StripeIntent$NextActionType;
    .locals 13

    sget-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->RedirectToUrl:Lcom/stripe/android/model/StripeIntent$NextActionType;

    sget-object v1, Lcom/stripe/android/model/StripeIntent$NextActionType;->UseStripeSdk:Lcom/stripe/android/model/StripeIntent$NextActionType;

    sget-object v2, Lcom/stripe/android/model/StripeIntent$NextActionType;->DisplayOxxoDetails:Lcom/stripe/android/model/StripeIntent$NextActionType;

    sget-object v3, Lcom/stripe/android/model/StripeIntent$NextActionType;->AlipayRedirect:Lcom/stripe/android/model/StripeIntent$NextActionType;

    sget-object v4, Lcom/stripe/android/model/StripeIntent$NextActionType;->BlikAuthorize:Lcom/stripe/android/model/StripeIntent$NextActionType;

    sget-object v5, Lcom/stripe/android/model/StripeIntent$NextActionType;->WeChatPayRedirect:Lcom/stripe/android/model/StripeIntent$NextActionType;

    sget-object v6, Lcom/stripe/android/model/StripeIntent$NextActionType;->VerifyWithMicrodeposits:Lcom/stripe/android/model/StripeIntent$NextActionType;

    sget-object v7, Lcom/stripe/android/model/StripeIntent$NextActionType;->UpiAwaitNotification:Lcom/stripe/android/model/StripeIntent$NextActionType;

    sget-object v8, Lcom/stripe/android/model/StripeIntent$NextActionType;->CashAppRedirect:Lcom/stripe/android/model/StripeIntent$NextActionType;

    sget-object v9, Lcom/stripe/android/model/StripeIntent$NextActionType;->DisplayBoletoDetails:Lcom/stripe/android/model/StripeIntent$NextActionType;

    sget-object v10, Lcom/stripe/android/model/StripeIntent$NextActionType;->DisplayKonbiniDetails:Lcom/stripe/android/model/StripeIntent$NextActionType;

    sget-object v11, Lcom/stripe/android/model/StripeIntent$NextActionType;->DisplayMultibancoDetails:Lcom/stripe/android/model/StripeIntent$NextActionType;

    sget-object v12, Lcom/stripe/android/model/StripeIntent$NextActionType;->SwishRedirect:Lcom/stripe/android/model/StripeIntent$NextActionType;

    filled-new-array/range {v0 .. v12}, [Lcom/stripe/android/model/StripeIntent$NextActionType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 90
    new-instance v0, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/4 v1, 0x0

    const-string v2, "redirect_to_url"

    const-string v3, "RedirectToUrl"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->RedirectToUrl:Lcom/stripe/android/model/StripeIntent$NextActionType;

    .line 91
    new-instance v0, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/4 v1, 0x1

    const-string v2, "use_stripe_sdk"

    const-string v3, "UseStripeSdk"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->UseStripeSdk:Lcom/stripe/android/model/StripeIntent$NextActionType;

    .line 92
    new-instance v0, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/4 v1, 0x2

    const-string v2, "oxxo_display_details"

    const-string v3, "DisplayOxxoDetails"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->DisplayOxxoDetails:Lcom/stripe/android/model/StripeIntent$NextActionType;

    .line 93
    new-instance v0, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/4 v1, 0x3

    const-string v2, "alipay_handle_redirect"

    const-string v3, "AlipayRedirect"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->AlipayRedirect:Lcom/stripe/android/model/StripeIntent$NextActionType;

    .line 94
    new-instance v0, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/4 v1, 0x4

    const-string v2, "blik_authorize"

    const-string v3, "BlikAuthorize"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->BlikAuthorize:Lcom/stripe/android/model/StripeIntent$NextActionType;

    .line 95
    new-instance v0, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/4 v1, 0x5

    const-string v2, "wechat_pay_redirect_to_android_app"

    const-string v3, "WeChatPayRedirect"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->WeChatPayRedirect:Lcom/stripe/android/model/StripeIntent$NextActionType;

    .line 96
    new-instance v0, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/4 v1, 0x6

    const-string v2, "verify_with_microdeposits"

    const-string v3, "VerifyWithMicrodeposits"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->VerifyWithMicrodeposits:Lcom/stripe/android/model/StripeIntent$NextActionType;

    .line 97
    new-instance v0, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/4 v1, 0x7

    const-string v2, "upi_await_notification"

    const-string v3, "UpiAwaitNotification"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->UpiAwaitNotification:Lcom/stripe/android/model/StripeIntent$NextActionType;

    .line 98
    new-instance v0, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/16 v1, 0x8

    const-string v2, "cashapp_handle_redirect_or_display_qr_code"

    const-string v3, "CashAppRedirect"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->CashAppRedirect:Lcom/stripe/android/model/StripeIntent$NextActionType;

    .line 99
    new-instance v0, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/16 v1, 0x9

    const-string v2, "boleto_display_details"

    const-string v3, "DisplayBoletoDetails"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->DisplayBoletoDetails:Lcom/stripe/android/model/StripeIntent$NextActionType;

    .line 100
    new-instance v0, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/16 v1, 0xa

    const-string v2, "konbini_display_details"

    const-string v3, "DisplayKonbiniDetails"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->DisplayKonbiniDetails:Lcom/stripe/android/model/StripeIntent$NextActionType;

    .line 101
    new-instance v0, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/16 v1, 0xb

    const-string v2, "multibanco_display_details"

    const-string v3, "DisplayMultibancoDetails"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->DisplayMultibancoDetails:Lcom/stripe/android/model/StripeIntent$NextActionType;

    .line 102
    new-instance v0, Lcom/stripe/android/model/StripeIntent$NextActionType;

    const/16 v1, 0xc

    const-string v2, "swish_handle_redirect_or_display_qr_code"

    const-string v3, "SwishRedirect"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/StripeIntent$NextActionType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->SwishRedirect:Lcom/stripe/android/model/StripeIntent$NextActionType;

    invoke-static {}, Lcom/stripe/android/model/StripeIntent$NextActionType;->$values()[Lcom/stripe/android/model/StripeIntent$NextActionType;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->$VALUES:[Lcom/stripe/android/model/StripeIntent$NextActionType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/stripe/android/model/StripeIntent$NextActionType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/StripeIntent$NextActionType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->Companion:Lcom/stripe/android/model/StripeIntent$NextActionType$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 89
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/model/StripeIntent$NextActionType;->code:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/model/StripeIntent$NextActionType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$NextActionType;
    .locals 1

    const-class v0, Lcom/stripe/android/model/StripeIntent$NextActionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 114
    check-cast p0, Lcom/stripe/android/model/StripeIntent$NextActionType;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/model/StripeIntent$NextActionType;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/StripeIntent$NextActionType;->$VALUES:[Lcom/stripe/android/model/StripeIntent$NextActionType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 114
    check-cast v0, [Lcom/stripe/android/model/StripeIntent$NextActionType;

    return-object v0
.end method


# virtual methods
.method public final getCode()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/stripe/android/model/StripeIntent$NextActionType;->code:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/stripe/android/model/StripeIntent$NextActionType;->code:Ljava/lang/String;

    return-object v0
.end method
