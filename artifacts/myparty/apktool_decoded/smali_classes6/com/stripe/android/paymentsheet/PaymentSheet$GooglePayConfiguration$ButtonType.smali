.class public final enum Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;
.super Ljava/lang/Enum;
.source "PaymentSheet.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ButtonType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Buy",
        "Book",
        "Checkout",
        "Donate",
        "Order",
        "Pay",
        "Subscribe",
        "Plain",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

.field public static final enum Book:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

.field public static final enum Buy:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

.field public static final enum Checkout:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

.field public static final enum Donate:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

.field public static final enum Order:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

.field public static final enum Pay:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

.field public static final enum Plain:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

.field public static final enum Subscribe:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;
    .locals 8

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Buy:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Book:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    sget-object v2, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Checkout:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    sget-object v3, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Donate:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    sget-object v4, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Order:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    sget-object v5, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Pay:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    sget-object v6, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Subscribe:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    sget-object v7, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Plain:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    filled-new-array/range {v0 .. v7}, [Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 3108
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    const-string v1, "Buy"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Buy:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    .line 3113
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    const-string v1, "Book"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Book:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    .line 3118
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    const-string v1, "Checkout"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Checkout:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    .line 3123
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    const-string v1, "Donate"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Donate:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    .line 3128
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    const-string v1, "Order"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Order:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    .line 3133
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    const-string v1, "Pay"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Pay:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    .line 3138
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    const-string v1, "Subscribe"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Subscribe:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    .line 3143
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    const-string v1, "Plain"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->Plain:Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    invoke-static {}, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->$values()[Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->$VALUES:[Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 3098
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;
    .locals 1

    const-class v0, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 3144
    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;->$VALUES:[Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 3144
    check-cast v0, [Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;

    return-object v0
.end method
