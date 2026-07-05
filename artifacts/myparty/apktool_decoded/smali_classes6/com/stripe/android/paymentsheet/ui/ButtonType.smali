.class final enum Lcom/stripe/android/paymentsheet/ui/ButtonType;
.super Ljava/lang/Enum;
.source "GooglePayButton.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/paymentsheet/ui/ButtonType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\r\u0008\u0082\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/ButtonType;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;II)V",
        "getValue",
        "()I",
        "Book",
        "Buy",
        "Checkout",
        "Donate",
        "Order",
        "Pay",
        "Plain",
        "Subscribe",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/paymentsheet/ui/ButtonType;

.field public static final enum Book:Lcom/stripe/android/paymentsheet/ui/ButtonType;

.field public static final enum Buy:Lcom/stripe/android/paymentsheet/ui/ButtonType;

.field public static final enum Checkout:Lcom/stripe/android/paymentsheet/ui/ButtonType;

.field public static final enum Donate:Lcom/stripe/android/paymentsheet/ui/ButtonType;

.field public static final enum Order:Lcom/stripe/android/paymentsheet/ui/ButtonType;

.field public static final enum Pay:Lcom/stripe/android/paymentsheet/ui/ButtonType;

.field public static final enum Plain:Lcom/stripe/android/paymentsheet/ui/ButtonType;

.field public static final enum Subscribe:Lcom/stripe/android/paymentsheet/ui/ButtonType;


# instance fields
.field private final value:I


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/paymentsheet/ui/ButtonType;
    .locals 8

    sget-object v0, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Book:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    sget-object v1, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Buy:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    sget-object v2, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Checkout:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    sget-object v3, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Donate:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    sget-object v4, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Order:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    sget-object v5, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Pay:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    sget-object v6, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Plain:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    sget-object v7, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Subscribe:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    filled-new-array/range {v0 .. v7}, [Lcom/stripe/android/paymentsheet/ui/ButtonType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 165
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/ButtonType;

    const-string v1, "Book"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/paymentsheet/ui/ButtonType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Book:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    .line 166
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/ButtonType;

    const-string v1, "Buy"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/stripe/android/paymentsheet/ui/ButtonType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Buy:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    .line 167
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/ButtonType;

    const-string v1, "Checkout"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v3, v2}, Lcom/stripe/android/paymentsheet/ui/ButtonType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Checkout:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    .line 168
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/ButtonType;

    const-string v1, "Donate"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/paymentsheet/ui/ButtonType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Donate:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    .line 169
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/ButtonType;

    const-string v1, "Order"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v3, v2}, Lcom/stripe/android/paymentsheet/ui/ButtonType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Order:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    .line 170
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/ButtonType;

    const-string v1, "Pay"

    const/4 v3, 0x6

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/paymentsheet/ui/ButtonType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Pay:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    .line 171
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/ButtonType;

    const-string v1, "Plain"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v3, v2}, Lcom/stripe/android/paymentsheet/ui/ButtonType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Plain:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    .line 172
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/ButtonType;

    const-string v1, "Subscribe"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, v2}, Lcom/stripe/android/paymentsheet/ui/ButtonType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/ButtonType;->Subscribe:Lcom/stripe/android/paymentsheet/ui/ButtonType;

    invoke-static {}, Lcom/stripe/android/paymentsheet/ui/ButtonType;->$values()[Lcom/stripe/android/paymentsheet/ui/ButtonType;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/ButtonType;->$VALUES:[Lcom/stripe/android/paymentsheet/ui/ButtonType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/ButtonType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 164
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/stripe/android/paymentsheet/ui/ButtonType;->value:I

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/paymentsheet/ui/ButtonType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/paymentsheet/ui/ButtonType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/ui/ButtonType;
    .locals 1

    const-class v0, Lcom/stripe/android/paymentsheet/ui/ButtonType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 173
    check-cast p0, Lcom/stripe/android/paymentsheet/ui/ButtonType;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/paymentsheet/ui/ButtonType;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/ui/ButtonType;->$VALUES:[Lcom/stripe/android/paymentsheet/ui/ButtonType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 173
    check-cast v0, [Lcom/stripe/android/paymentsheet/ui/ButtonType;

    return-object v0
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    .line 164
    iget v0, p0, Lcom/stripe/android/paymentsheet/ui/ButtonType;->value:I

    return v0
.end method
