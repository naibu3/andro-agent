.class public final enum Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;
.super Ljava/lang/Enum;
.source "PaymentOptionsItem.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentOptionsItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ViewType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "SavedPaymentMethod",
        "AddCard",
        "GooglePay",
        "Link",
        "paymentsheet_release"
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

.field public static final enum AddCard:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

.field public static final enum GooglePay:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

.field public static final enum Link:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

.field public static final enum SavedPaymentMethod:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;
    .locals 4

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;->SavedPaymentMethod:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;->AddCard:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    sget-object v2, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;->GooglePay:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    sget-object v3, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;->Link:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    filled-new-array {v0, v1, v2, v3}, [Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 47
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    const-string v1, "SavedPaymentMethod"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;->SavedPaymentMethod:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    .line 48
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    const-string v1, "AddCard"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;->AddCard:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    .line 49
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    const-string v1, "GooglePay"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;->GooglePay:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    .line 50
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    const-string v1, "Link"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;->Link:Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    invoke-static {}, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;->$values()[Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;->$VALUES:[Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 45
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;
    .locals 1

    const-class v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 51
    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;->$VALUES:[Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 51
    check-cast v0, [Lcom/stripe/android/paymentsheet/PaymentOptionsItem$ViewType;

    return-object v0
.end method
