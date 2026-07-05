.class public final enum Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;
.super Ljava/lang/Enum;
.source "KlarnaSourceParams.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PurchaseType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;",
        "",
        "code",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getCode",
        "()Ljava/lang/String;",
        "Buy",
        "Rent",
        "Book",
        "Subscribe",
        "Download",
        "Order",
        "Continue",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

.field public static final enum Book:Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

.field public static final enum Buy:Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

.field public static final enum Continue:Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

.field public static final enum Download:Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

.field public static final enum Order:Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

.field public static final enum Rent:Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

.field public static final enum Subscribe:Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;


# instance fields
.field private final code:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;
    .locals 7

    sget-object v0, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;->Buy:Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    sget-object v1, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;->Rent:Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    sget-object v2, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;->Book:Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    sget-object v3, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;->Subscribe:Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    sget-object v4, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;->Download:Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    sget-object v5, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;->Order:Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    sget-object v6, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;->Continue:Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    filled-new-array/range {v0 .. v6}, [Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 224
    new-instance v0, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    const/4 v1, 0x0

    const-string v2, "buy"

    const-string v3, "Buy"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;->Buy:Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    .line 225
    new-instance v0, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    const/4 v1, 0x1

    const-string v2, "rent"

    const-string v3, "Rent"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;->Rent:Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    .line 226
    new-instance v0, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    const/4 v1, 0x2

    const-string v2, "book"

    const-string v3, "Book"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;->Book:Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    .line 227
    new-instance v0, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    const/4 v1, 0x3

    const-string v2, "subscribe"

    const-string v3, "Subscribe"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;->Subscribe:Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    .line 228
    new-instance v0, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    const/4 v1, 0x4

    const-string v2, "download"

    const-string v3, "Download"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;->Download:Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    .line 229
    new-instance v0, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    const/4 v1, 0x5

    const-string v2, "order"

    const-string v3, "Order"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;->Order:Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    .line 230
    new-instance v0, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    const/4 v1, 0x6

    const-string v2, "continue"

    const-string v3, "Continue"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;->Continue:Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    invoke-static {}, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;->$values()[Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;->$VALUES:[Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    .line 223
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;->code:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;
    .locals 1

    const-class v0, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 231
    check-cast p0, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;->$VALUES:[Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 231
    check-cast v0, [Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;

    return-object v0
.end method


# virtual methods
.method public final getCode()Ljava/lang/String;
    .locals 1

    .line 223
    iget-object v0, p0, Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;->code:Ljava/lang/String;

    return-object v0
.end method
