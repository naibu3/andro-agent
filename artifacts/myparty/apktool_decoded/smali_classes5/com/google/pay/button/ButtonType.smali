.class public final enum Lcom/google/pay/button/ButtonType;
.super Ljava/lang/Enum;
.source "PayButton.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/pay/button/ButtonType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000c\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/google/pay/button/ButtonType;",
        "",
        "value",
        "",
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
        "compose-pay-button_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/pay/button/ButtonType;

.field public static final enum Book:Lcom/google/pay/button/ButtonType;

.field public static final enum Buy:Lcom/google/pay/button/ButtonType;

.field public static final enum Checkout:Lcom/google/pay/button/ButtonType;

.field public static final enum Donate:Lcom/google/pay/button/ButtonType;

.field public static final enum Order:Lcom/google/pay/button/ButtonType;

.field public static final enum Pay:Lcom/google/pay/button/ButtonType;

.field public static final enum Plain:Lcom/google/pay/button/ButtonType;

.field public static final enum Subscribe:Lcom/google/pay/button/ButtonType;


# instance fields
.field private final value:I


# direct methods
.method private static final synthetic $values()[Lcom/google/pay/button/ButtonType;
    .locals 8

    sget-object v0, Lcom/google/pay/button/ButtonType;->Book:Lcom/google/pay/button/ButtonType;

    sget-object v1, Lcom/google/pay/button/ButtonType;->Buy:Lcom/google/pay/button/ButtonType;

    sget-object v2, Lcom/google/pay/button/ButtonType;->Checkout:Lcom/google/pay/button/ButtonType;

    sget-object v3, Lcom/google/pay/button/ButtonType;->Donate:Lcom/google/pay/button/ButtonType;

    sget-object v4, Lcom/google/pay/button/ButtonType;->Order:Lcom/google/pay/button/ButtonType;

    sget-object v5, Lcom/google/pay/button/ButtonType;->Pay:Lcom/google/pay/button/ButtonType;

    sget-object v6, Lcom/google/pay/button/ButtonType;->Plain:Lcom/google/pay/button/ButtonType;

    sget-object v7, Lcom/google/pay/button/ButtonType;->Subscribe:Lcom/google/pay/button/ButtonType;

    filled-new-array/range {v0 .. v7}, [Lcom/google/pay/button/ButtonType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 36
    new-instance v0, Lcom/google/pay/button/ButtonType;

    const-string v1, "Book"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lcom/google/pay/button/ButtonType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/pay/button/ButtonType;->Book:Lcom/google/pay/button/ButtonType;

    .line 37
    new-instance v0, Lcom/google/pay/button/ButtonType;

    const-string v1, "Buy"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/google/pay/button/ButtonType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/pay/button/ButtonType;->Buy:Lcom/google/pay/button/ButtonType;

    .line 38
    new-instance v0, Lcom/google/pay/button/ButtonType;

    const-string v1, "Checkout"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v3, v2}, Lcom/google/pay/button/ButtonType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/pay/button/ButtonType;->Checkout:Lcom/google/pay/button/ButtonType;

    .line 39
    new-instance v0, Lcom/google/pay/button/ButtonType;

    const-string v1, "Donate"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lcom/google/pay/button/ButtonType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/pay/button/ButtonType;->Donate:Lcom/google/pay/button/ButtonType;

    .line 40
    new-instance v0, Lcom/google/pay/button/ButtonType;

    const-string v1, "Order"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v3, v2}, Lcom/google/pay/button/ButtonType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/pay/button/ButtonType;->Order:Lcom/google/pay/button/ButtonType;

    .line 41
    new-instance v0, Lcom/google/pay/button/ButtonType;

    const-string v1, "Pay"

    const/4 v3, 0x6

    invoke-direct {v0, v1, v2, v3}, Lcom/google/pay/button/ButtonType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/pay/button/ButtonType;->Pay:Lcom/google/pay/button/ButtonType;

    .line 42
    new-instance v0, Lcom/google/pay/button/ButtonType;

    const-string v1, "Plain"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v3, v2}, Lcom/google/pay/button/ButtonType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/pay/button/ButtonType;->Plain:Lcom/google/pay/button/ButtonType;

    .line 43
    new-instance v0, Lcom/google/pay/button/ButtonType;

    const-string v1, "Subscribe"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, v2}, Lcom/google/pay/button/ButtonType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/pay/button/ButtonType;->Subscribe:Lcom/google/pay/button/ButtonType;

    invoke-static {}, Lcom/google/pay/button/ButtonType;->$values()[Lcom/google/pay/button/ButtonType;

    move-result-object v0

    sput-object v0, Lcom/google/pay/button/ButtonType;->$VALUES:[Lcom/google/pay/button/ButtonType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 35
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/pay/button/ButtonType;->value:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/pay/button/ButtonType;
    .locals 1

    const-class v0, Lcom/google/pay/button/ButtonType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/pay/button/ButtonType;

    return-object p0
.end method

.method public static values()[Lcom/google/pay/button/ButtonType;
    .locals 1

    sget-object v0, Lcom/google/pay/button/ButtonType;->$VALUES:[Lcom/google/pay/button/ButtonType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/pay/button/ButtonType;

    return-object v0
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    .line 35
    iget v0, p0, Lcom/google/pay/button/ButtonType;->value:I

    return v0
.end method
