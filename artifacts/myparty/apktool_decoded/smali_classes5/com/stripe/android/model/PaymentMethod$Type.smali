.class public final enum Lcom/stripe/android/model/PaymentMethod$Type;
.super Ljava/lang/Enum;
.source "PaymentMethod.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/PaymentMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/PaymentMethod$Type$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/model/PaymentMethod$Type;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u00081\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0081\u0002\u0018\u0000 D2\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002:\u0001DBC\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0008\u0010\n\u001a\u00020\u0006H\u0007J\u0008\u0010<\u001a\u00020\u0004H\u0016J\u0006\u0010=\u001a\u00020>J\u0016\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020>R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u0006X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u000cX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001fj\u0002\u0008 j\u0002\u0008!j\u0002\u0008\"j\u0002\u0008#j\u0002\u0008$j\u0002\u0008%j\u0002\u0008&j\u0002\u0008\'j\u0002\u0008(j\u0002\u0008)j\u0002\u0008*j\u0002\u0008+j\u0002\u0008,j\u0002\u0008-j\u0002\u0008.j\u0002\u0008/j\u0002\u00080j\u0002\u00081j\u0002\u00082j\u0002\u00083j\u0002\u00084j\u0002\u00085j\u0002\u00086j\u0002\u00087j\u0002\u00088j\u0002\u00089j\u0002\u0008:j\u0002\u0008;\u00a8\u0006E"
    }
    d2 = {
        "Lcom/stripe/android/model/PaymentMethod$Type;",
        "Landroid/os/Parcelable;",
        "",
        "code",
        "",
        "isReusable",
        "",
        "isVoucher",
        "requiresMandate",
        "requiresMandateForPaymentIntent",
        "hasDelayedSettlement",
        "afterRedirectAction",
        "Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;)V",
        "getRequiresMandateForPaymentIntent$payments_core_release",
        "()Z",
        "getAfterRedirectAction$payments_core_release",
        "()Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;",
        "Link",
        "Card",
        "CardPresent",
        "Fpx",
        "Ideal",
        "SepaDebit",
        "AuBecsDebit",
        "BacsDebit",
        "Sofort",
        "Upi",
        "P24",
        "Bancontact",
        "Giropay",
        "Eps",
        "Oxxo",
        "Alipay",
        "GrabPay",
        "PayPal",
        "AfterpayClearpay",
        "Netbanking",
        "Blik",
        "WeChatPay",
        "Klarna",
        "Affirm",
        "RevolutPay",
        "Sunbit",
        "Billie",
        "Satispay",
        "Crypto",
        "AmazonPay",
        "Alma",
        "MobilePay",
        "Multibanco",
        "Zip",
        "USBankAccount",
        "CashAppPay",
        "Boleto",
        "Konbini",
        "Swish",
        "Twint",
        "ShopPay",
        "toString",
        "describeContents",
        "",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum Affirm:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum AfterpayClearpay:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum Alipay:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum Alma:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum AmazonPay:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum AuBecsDebit:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum BacsDebit:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum Bancontact:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum Billie:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum Blik:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum Boleto:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/model/PaymentMethod$Type;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum Card:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum CardPresent:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum CashAppPay:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final Companion:Lcom/stripe/android/model/PaymentMethod$Type$Companion;

.field public static final enum Crypto:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum Eps:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum Fpx:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum Giropay:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum GrabPay:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum Ideal:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum Klarna:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum Konbini:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum Link:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum MobilePay:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum Multibanco:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum Netbanking:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum Oxxo:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum P24:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum PayPal:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum RevolutPay:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum Satispay:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum SepaDebit:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum ShopPay:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum Sofort:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum Sunbit:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum Swish:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum Twint:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum USBankAccount:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum Upi:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum WeChatPay:Lcom/stripe/android/model/PaymentMethod$Type;

.field public static final enum Zip:Lcom/stripe/android/model/PaymentMethod$Type;


# instance fields
.field private final afterRedirectAction:Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;

.field public final code:Ljava/lang/String;

.field private final hasDelayedSettlement:Z

.field public final isReusable:Z

.field public final isVoucher:Z

.field public final requiresMandate:Z

.field private final requiresMandateForPaymentIntent:Z


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/model/PaymentMethod$Type;
    .locals 42

    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->Link:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v2, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v3, Lcom/stripe/android/model/PaymentMethod$Type;->CardPresent:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v4, Lcom/stripe/android/model/PaymentMethod$Type;->Fpx:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v5, Lcom/stripe/android/model/PaymentMethod$Type;->Ideal:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v6, Lcom/stripe/android/model/PaymentMethod$Type;->SepaDebit:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v7, Lcom/stripe/android/model/PaymentMethod$Type;->AuBecsDebit:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v8, Lcom/stripe/android/model/PaymentMethod$Type;->BacsDebit:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v9, Lcom/stripe/android/model/PaymentMethod$Type;->Sofort:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v10, Lcom/stripe/android/model/PaymentMethod$Type;->Upi:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v11, Lcom/stripe/android/model/PaymentMethod$Type;->P24:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v12, Lcom/stripe/android/model/PaymentMethod$Type;->Bancontact:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v13, Lcom/stripe/android/model/PaymentMethod$Type;->Giropay:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v14, Lcom/stripe/android/model/PaymentMethod$Type;->Eps:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v15, Lcom/stripe/android/model/PaymentMethod$Type;->Oxxo:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v16, Lcom/stripe/android/model/PaymentMethod$Type;->Alipay:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v17, Lcom/stripe/android/model/PaymentMethod$Type;->GrabPay:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v18, Lcom/stripe/android/model/PaymentMethod$Type;->PayPal:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v19, Lcom/stripe/android/model/PaymentMethod$Type;->AfterpayClearpay:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v20, Lcom/stripe/android/model/PaymentMethod$Type;->Netbanking:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v21, Lcom/stripe/android/model/PaymentMethod$Type;->Blik:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v22, Lcom/stripe/android/model/PaymentMethod$Type;->WeChatPay:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v23, Lcom/stripe/android/model/PaymentMethod$Type;->Klarna:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v24, Lcom/stripe/android/model/PaymentMethod$Type;->Affirm:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v25, Lcom/stripe/android/model/PaymentMethod$Type;->RevolutPay:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v26, Lcom/stripe/android/model/PaymentMethod$Type;->Sunbit:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v27, Lcom/stripe/android/model/PaymentMethod$Type;->Billie:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v28, Lcom/stripe/android/model/PaymentMethod$Type;->Satispay:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v29, Lcom/stripe/android/model/PaymentMethod$Type;->Crypto:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v30, Lcom/stripe/android/model/PaymentMethod$Type;->AmazonPay:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v31, Lcom/stripe/android/model/PaymentMethod$Type;->Alma:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v32, Lcom/stripe/android/model/PaymentMethod$Type;->MobilePay:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v33, Lcom/stripe/android/model/PaymentMethod$Type;->Multibanco:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v34, Lcom/stripe/android/model/PaymentMethod$Type;->Zip:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v35, Lcom/stripe/android/model/PaymentMethod$Type;->USBankAccount:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v36, Lcom/stripe/android/model/PaymentMethod$Type;->CashAppPay:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v37, Lcom/stripe/android/model/PaymentMethod$Type;->Boleto:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v38, Lcom/stripe/android/model/PaymentMethod$Type;->Konbini:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v39, Lcom/stripe/android/model/PaymentMethod$Type;->Swish:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v40, Lcom/stripe/android/model/PaymentMethod$Type;->Twint:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v41, Lcom/stripe/android/model/PaymentMethod$Type;->ShopPay:Lcom/stripe/android/model/PaymentMethod$Type;

    filled-new-array/range {v1 .. v41}, [Lcom/stripe/android/model/PaymentMethod$Type;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 28

    .line 195
    new-instance v0, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v10, 0x40

    const/4 v11, 0x0

    const-string v1, "Link"

    const/4 v2, 0x0

    const-string v3, "link"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v0 .. v11}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/PaymentMethod$Type;->Link:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 203
    new-instance v1, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v11, 0x40

    const/4 v12, 0x0

    const-string v2, "Card"

    const/4 v3, 0x1

    const-string v4, "card"

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v12}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 211
    new-instance v2, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v12, 0x40

    const/4 v13, 0x0

    const-string v3, "CardPresent"

    const/4 v4, 0x2

    const-string v5, "card_present"

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v2 .. v13}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lcom/stripe/android/model/PaymentMethod$Type;->CardPresent:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 219
    new-instance v3, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v13, 0x40

    const/4 v14, 0x0

    const-string v4, "Fpx"

    const/4 v5, 0x3

    const-string v6, "fpx"

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v3 .. v14}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v3, Lcom/stripe/android/model/PaymentMethod$Type;->Fpx:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 227
    new-instance v4, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v14, 0x40

    const/4 v15, 0x0

    const-string v5, "Ideal"

    const/4 v6, 0x4

    const-string v7, "ideal"

    const/4 v10, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v4 .. v15}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v4, Lcom/stripe/android/model/PaymentMethod$Type;->Ideal:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 235
    new-instance v5, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v15, 0x40

    const/16 v16, 0x0

    const-string v6, "SepaDebit"

    const/4 v7, 0x5

    const-string v8, "sepa_debit"

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x1

    const/4 v13, 0x1

    const/4 v14, 0x0

    invoke-direct/range {v5 .. v16}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v5, Lcom/stripe/android/model/PaymentMethod$Type;->SepaDebit:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 243
    new-instance v6, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v16, 0x40

    const/16 v17, 0x0

    const-string v7, "AuBecsDebit"

    const/4 v8, 0x6

    const-string v9, "au_becs_debit"

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    invoke-direct/range {v6 .. v17}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v6, Lcom/stripe/android/model/PaymentMethod$Type;->AuBecsDebit:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 251
    new-instance v7, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v17, 0x40

    const/16 v18, 0x0

    const-string v8, "BacsDebit"

    const/4 v9, 0x7

    const-string v10, "bacs_debit"

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    invoke-direct/range {v7 .. v18}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v7, Lcom/stripe/android/model/PaymentMethod$Type;->BacsDebit:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 259
    new-instance v8, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v18, 0x40

    const/16 v19, 0x0

    const-string v9, "Sofort"

    const/16 v10, 0x8

    const-string v11, "sofort"

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x0

    invoke-direct/range {v8 .. v19}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v8, Lcom/stripe/android/model/PaymentMethod$Type;->Sofort:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 267
    new-instance v9, Lcom/stripe/android/model/PaymentMethod$Type;

    .line 274
    new-instance v0, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Refresh;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Refresh;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v18, v0

    check-cast v18, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;

    .line 267
    const-string v10, "Upi"

    const/16 v11, 0x9

    const-string v12, "upi"

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v9 .. v18}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;)V

    sput-object v9, Lcom/stripe/android/model/PaymentMethod$Type;->Upi:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 276
    new-instance v10, Lcom/stripe/android/model/PaymentMethod$Type;

    .line 287
    new-instance v0, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Poll;

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Poll;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v19, v0

    check-cast v19, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;

    .line 276
    const-string v11, "P24"

    const/16 v12, 0xa

    const-string v13, "p24"

    const/16 v18, 0x0

    invoke-direct/range {v10 .. v19}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;)V

    sput-object v10, Lcom/stripe/android/model/PaymentMethod$Type;->P24:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 289
    new-instance v11, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v21, 0x40

    const/16 v22, 0x0

    const-string v12, "Bancontact"

    const/16 v13, 0xb

    const-string v14, "bancontact"

    const/16 v17, 0x1

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v11 .. v22}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v11, Lcom/stripe/android/model/PaymentMethod$Type;->Bancontact:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 297
    new-instance v12, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v22, 0x40

    const/16 v23, 0x0

    const-string v13, "Giropay"

    const/16 v14, 0xc

    const-string v15, "giropay"

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v12 .. v23}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v12, Lcom/stripe/android/model/PaymentMethod$Type;->Giropay:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 305
    new-instance v13, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v23, 0x40

    const/16 v24, 0x0

    const-string v14, "Eps"

    const/16 v15, 0xd

    const-string v16, "eps"

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v13 .. v24}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v13, Lcom/stripe/android/model/PaymentMethod$Type;->Eps:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 313
    new-instance v14, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v24, 0x40

    const/16 v25, 0x0

    const-string v15, "Oxxo"

    const/16 v16, 0xe

    const-string v17, "oxxo"

    const/16 v19, 0x1

    const/16 v22, 0x1

    const/16 v23, 0x0

    invoke-direct/range {v14 .. v25}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v14, Lcom/stripe/android/model/PaymentMethod$Type;->Oxxo:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 321
    new-instance v15, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v25, 0x40

    const/16 v26, 0x0

    const-string v16, "Alipay"

    const/16 v17, 0xf

    const-string v18, "alipay"

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v15 .. v26}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v15, Lcom/stripe/android/model/PaymentMethod$Type;->Alipay:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 329
    new-instance v16, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v26, 0x40

    const/16 v27, 0x0

    const-string v17, "GrabPay"

    const/16 v18, 0x10

    const-string v19, "grabpay"

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v16 .. v27}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v16, Lcom/stripe/android/model/PaymentMethod$Type;->GrabPay:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 337
    new-instance v4, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v14, 0x40

    const/4 v15, 0x0

    const-string v5, "PayPal"

    const/16 v6, 0x11

    const-string v7, "paypal"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v4 .. v15}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v4, Lcom/stripe/android/model/PaymentMethod$Type;->PayPal:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 345
    new-instance v5, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v15, 0x40

    const/16 v16, 0x0

    const-string v6, "AfterpayClearpay"

    const/16 v7, 0x12

    const-string v8, "afterpay_clearpay"

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v5 .. v16}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v5, Lcom/stripe/android/model/PaymentMethod$Type;->AfterpayClearpay:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 353
    new-instance v6, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v16, 0x40

    const/16 v17, 0x0

    const-string v7, "Netbanking"

    const/16 v8, 0x13

    const-string v9, "netbanking"

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v6 .. v17}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v6, Lcom/stripe/android/model/PaymentMethod$Type;->Netbanking:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 361
    new-instance v7, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v17, 0x40

    const/16 v18, 0x0

    const-string v8, "Blik"

    const/16 v9, 0x14

    const-string v10, "blik"

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v7 .. v18}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v7, Lcom/stripe/android/model/PaymentMethod$Type;->Blik:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 369
    new-instance v8, Lcom/stripe/android/model/PaymentMethod$Type;

    .line 376
    new-instance v0, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Refresh;

    const/4 v4, 0x5

    invoke-direct {v0, v4}, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Refresh;-><init>(I)V

    move-object/from16 v17, v0

    check-cast v17, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;

    .line 369
    const-string v9, "WeChatPay"

    const/16 v10, 0x15

    const-string v11, "wechat_pay"

    const/16 v16, 0x0

    invoke-direct/range {v8 .. v17}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;)V

    sput-object v8, Lcom/stripe/android/model/PaymentMethod$Type;->WeChatPay:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 378
    new-instance v9, Lcom/stripe/android/model/PaymentMethod$Type;

    .line 385
    new-instance v0, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Refresh;

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Refresh;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v18, v0

    check-cast v18, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;

    .line 378
    const-string v10, "Klarna"

    const/16 v11, 0x16

    const-string v12, "klarna"

    const/4 v15, 0x1

    const/16 v17, 0x0

    invoke-direct/range {v9 .. v18}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;)V

    sput-object v9, Lcom/stripe/android/model/PaymentMethod$Type;->Klarna:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 387
    new-instance v10, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v20, 0x40

    const/16 v21, 0x0

    const-string v11, "Affirm"

    const/16 v12, 0x17

    const-string v13, "affirm"

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v10 .. v21}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v10, Lcom/stripe/android/model/PaymentMethod$Type;->Affirm:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 395
    new-instance v11, Lcom/stripe/android/model/PaymentMethod$Type;

    .line 402
    new-instance v0, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Poll;

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Poll;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v20, v0

    check-cast v20, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;

    .line 395
    const-string v12, "RevolutPay"

    const/16 v13, 0x18

    const-string v14, "revolut_pay"

    const/16 v17, 0x1

    const/16 v19, 0x0

    invoke-direct/range {v11 .. v20}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;)V

    sput-object v11, Lcom/stripe/android/model/PaymentMethod$Type;->RevolutPay:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 404
    new-instance v12, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v22, 0x40

    const/16 v23, 0x0

    const-string v13, "Sunbit"

    const/16 v14, 0x19

    const-string v15, "sunbit"

    const/16 v17, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v12 .. v23}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v12, Lcom/stripe/android/model/PaymentMethod$Type;->Sunbit:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 412
    new-instance v13, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v23, 0x40

    const/16 v24, 0x0

    const-string v14, "Billie"

    const/16 v15, 0x1a

    const-string v16, "billie"

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v13 .. v24}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v13, Lcom/stripe/android/model/PaymentMethod$Type;->Billie:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 420
    new-instance v14, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v24, 0x40

    const-string v15, "Satispay"

    const/16 v16, 0x1b

    const-string v17, "satispay"

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v14 .. v25}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v14, Lcom/stripe/android/model/PaymentMethod$Type;->Satispay:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 428
    new-instance v15, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v25, 0x40

    const/16 v26, 0x0

    const-string v16, "Crypto"

    const/16 v17, 0x1c

    const-string v18, "crypto"

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v15 .. v26}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v15, Lcom/stripe/android/model/PaymentMethod$Type;->Crypto:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 436
    new-instance v4, Lcom/stripe/android/model/PaymentMethod$Type;

    .line 443
    new-instance v0, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Poll;

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Poll;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v13, v0

    check-cast v13, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;

    .line 436
    const-string v5, "AmazonPay"

    const/16 v6, 0x1d

    const-string v7, "amazon_pay"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v4 .. v13}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;)V

    sput-object v4, Lcom/stripe/android/model/PaymentMethod$Type;->AmazonPay:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 445
    new-instance v5, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v15, 0x40

    const/16 v16, 0x0

    const-string v6, "Alma"

    const/16 v7, 0x1e

    const-string v8, "alma"

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v5 .. v16}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v5, Lcom/stripe/android/model/PaymentMethod$Type;->Alma:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 453
    new-instance v6, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v16, 0x40

    const/16 v17, 0x0

    const-string v7, "MobilePay"

    const/16 v8, 0x1f

    const-string v9, "mobilepay"

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v6 .. v17}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v6, Lcom/stripe/android/model/PaymentMethod$Type;->MobilePay:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 461
    new-instance v7, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v17, 0x40

    const/16 v18, 0x0

    const-string v8, "Multibanco"

    const/16 v9, 0x20

    const-string v10, "multibanco"

    const/4 v12, 0x1

    const/4 v15, 0x1

    const/16 v16, 0x0

    invoke-direct/range {v7 .. v18}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v7, Lcom/stripe/android/model/PaymentMethod$Type;->Multibanco:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 469
    new-instance v8, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v18, 0x40

    const/16 v19, 0x0

    const-string v9, "Zip"

    const/16 v10, 0x21

    const-string v11, "zip"

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v8 .. v19}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v8, Lcom/stripe/android/model/PaymentMethod$Type;->Zip:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 477
    new-instance v9, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v19, 0x40

    const/16 v20, 0x0

    const-string v10, "USBankAccount"

    const/16 v11, 0x22

    const-string v12, "us_bank_account"

    const/4 v13, 0x1

    const/4 v15, 0x1

    const/16 v16, 0x1

    const/16 v17, 0x1

    const/16 v18, 0x0

    invoke-direct/range {v9 .. v20}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v9, Lcom/stripe/android/model/PaymentMethod$Type;->USBankAccount:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 485
    new-instance v10, Lcom/stripe/android/model/PaymentMethod$Type;

    .line 492
    new-instance v0, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Refresh;

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Refresh;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v19, v0

    check-cast v19, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;

    .line 485
    const-string v11, "CashAppPay"

    const/16 v12, 0x23

    const-string v13, "cashapp"

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v10 .. v19}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;)V

    sput-object v10, Lcom/stripe/android/model/PaymentMethod$Type;->CashAppPay:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 494
    new-instance v11, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v21, 0x40

    const/16 v22, 0x0

    const-string v12, "Boleto"

    const/16 v13, 0x24

    const-string v14, "boleto"

    const/16 v19, 0x1

    invoke-direct/range {v11 .. v22}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v11, Lcom/stripe/android/model/PaymentMethod$Type;->Boleto:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 502
    new-instance v12, Lcom/stripe/android/model/PaymentMethod$Type;

    const/16 v22, 0x40

    const/16 v23, 0x0

    const-string v13, "Konbini"

    const/16 v14, 0x25

    const-string v15, "konbini"

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x0

    invoke-direct/range {v12 .. v23}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v12, Lcom/stripe/android/model/PaymentMethod$Type;->Konbini:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 510
    new-instance v13, Lcom/stripe/android/model/PaymentMethod$Type;

    .line 521
    new-instance v0, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Poll;

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Poll;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v22, v0

    check-cast v22, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;

    .line 510
    const-string v14, "Swish"

    const/16 v15, 0x26

    const-string v16, "swish"

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v13 .. v22}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;)V

    sput-object v13, Lcom/stripe/android/model/PaymentMethod$Type;->Swish:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 523
    new-instance v14, Lcom/stripe/android/model/PaymentMethod$Type;

    .line 534
    new-instance v0, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Poll;

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$Poll;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v23, v0

    check-cast v23, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;

    .line 523
    const-string v15, "Twint"

    const/16 v16, 0x27

    const-string v17, "twint"

    const/16 v22, 0x0

    invoke-direct/range {v14 .. v23}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;)V

    sput-object v14, Lcom/stripe/android/model/PaymentMethod$Type;->Twint:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 536
    new-instance v15, Lcom/stripe/android/model/PaymentMethod$Type;

    const-string v16, "ShopPay"

    const/16 v17, 0x28

    const-string v18, "shop_pay"

    const/16 v23, 0x0

    invoke-direct/range {v15 .. v26}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v15, Lcom/stripe/android/model/PaymentMethod$Type;->ShopPay:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-static {}, Lcom/stripe/android/model/PaymentMethod$Type;->$values()[Lcom/stripe/android/model/PaymentMethod$Type;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/PaymentMethod$Type;->$VALUES:[Lcom/stripe/android/model/PaymentMethod$Type;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/PaymentMethod$Type;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/stripe/android/model/PaymentMethod$Type$Companion;

    invoke-direct {v0, v3}, Lcom/stripe/android/model/PaymentMethod$Type$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/PaymentMethod$Type;->Companion:Lcom/stripe/android/model/PaymentMethod$Type$Companion;

    new-instance v0, Lcom/stripe/android/model/PaymentMethod$Type$Creator;

    invoke-direct {v0}, Lcom/stripe/android/model/PaymentMethod$Type$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/model/PaymentMethod$Type;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZZZZZ",
            "Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;",
            ")V"
        }
    .end annotation

    .line 186
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 187
    iput-object p3, p0, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    .line 188
    iput-boolean p4, p0, Lcom/stripe/android/model/PaymentMethod$Type;->isReusable:Z

    .line 189
    iput-boolean p5, p0, Lcom/stripe/android/model/PaymentMethod$Type;->isVoucher:Z

    .line 190
    iput-boolean p6, p0, Lcom/stripe/android/model/PaymentMethod$Type;->requiresMandate:Z

    .line 191
    iput-boolean p7, p0, Lcom/stripe/android/model/PaymentMethod$Type;->requiresMandateForPaymentIntent:Z

    .line 192
    iput-boolean p8, p0, Lcom/stripe/android/model/PaymentMethod$Type;->hasDelayedSettlement:Z

    .line 193
    iput-object p9, p0, Lcom/stripe/android/model/PaymentMethod$Type;->afterRedirectAction:Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    and-int/lit8 v0, p10, 0x40

    if-eqz v0, :cond_0

    .line 193
    sget-object v0, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None;->INSTANCE:Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction$None;

    check-cast v0, Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;

    move-object v10, v0

    goto :goto_0

    :cond_0
    move-object/from16 v10, p9

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    .line 186
    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/model/PaymentMethod$Type;-><init>(Ljava/lang/String;ILjava/lang/String;ZZZZZLcom/stripe/android/model/PaymentMethod$AfterRedirectAction;)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/model/PaymentMethod$Type;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/model/PaymentMethod$Type;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Type;
    .locals 1

    const-class v0, Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 560
    check-cast p0, Lcom/stripe/android/model/PaymentMethod$Type;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/model/PaymentMethod$Type;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/PaymentMethod$Type;->$VALUES:[Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 560
    check-cast v0, [Lcom/stripe/android/model/PaymentMethod$Type;

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getAfterRedirectAction$payments_core_release()Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethod$Type;->afterRedirectAction:Lcom/stripe/android/model/PaymentMethod$AfterRedirectAction;

    return-object v0
.end method

.method public final getRequiresMandateForPaymentIntent$payments_core_release()Z
    .locals 1

    .line 191
    iget-boolean v0, p0, Lcom/stripe/android/model/PaymentMethod$Type;->requiresMandateForPaymentIntent:Z

    return v0
.end method

.method public final hasDelayedSettlement()Z
    .locals 1

    .line 546
    iget-boolean v0, p0, Lcom/stripe/android/model/PaymentMethod$Type;->hasDelayedSettlement:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 549
    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentMethod$Type;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
