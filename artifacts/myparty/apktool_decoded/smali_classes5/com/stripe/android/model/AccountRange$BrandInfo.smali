.class public final enum Lcom/stripe/android/model/AccountRange$BrandInfo;
.super Ljava/lang/Enum;
.source "AccountRange.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/AccountRange;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "BrandInfo"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/model/AccountRange$BrandInfo;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/model/AccountRange$BrandInfo;",
        "",
        "brandName",
        "",
        "brand",
        "Lcom/stripe/android/model/CardBrand;",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/model/CardBrand;)V",
        "getBrandName",
        "()Ljava/lang/String;",
        "getBrand",
        "()Lcom/stripe/android/model/CardBrand;",
        "Visa",
        "Mastercard",
        "AmericanExpress",
        "JCB",
        "DinersClub",
        "Discover",
        "UnionPay",
        "CartesBancaires",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/model/AccountRange$BrandInfo;

.field public static final enum AmericanExpress:Lcom/stripe/android/model/AccountRange$BrandInfo;

.field public static final enum CartesBancaires:Lcom/stripe/android/model/AccountRange$BrandInfo;

.field public static final enum DinersClub:Lcom/stripe/android/model/AccountRange$BrandInfo;

.field public static final enum Discover:Lcom/stripe/android/model/AccountRange$BrandInfo;

.field public static final enum JCB:Lcom/stripe/android/model/AccountRange$BrandInfo;

.field public static final enum Mastercard:Lcom/stripe/android/model/AccountRange$BrandInfo;

.field public static final enum UnionPay:Lcom/stripe/android/model/AccountRange$BrandInfo;

.field public static final enum Visa:Lcom/stripe/android/model/AccountRange$BrandInfo;


# instance fields
.field private final brand:Lcom/stripe/android/model/CardBrand;

.field private final brandName:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/model/AccountRange$BrandInfo;
    .locals 8

    sget-object v0, Lcom/stripe/android/model/AccountRange$BrandInfo;->Visa:Lcom/stripe/android/model/AccountRange$BrandInfo;

    sget-object v1, Lcom/stripe/android/model/AccountRange$BrandInfo;->Mastercard:Lcom/stripe/android/model/AccountRange$BrandInfo;

    sget-object v2, Lcom/stripe/android/model/AccountRange$BrandInfo;->AmericanExpress:Lcom/stripe/android/model/AccountRange$BrandInfo;

    sget-object v3, Lcom/stripe/android/model/AccountRange$BrandInfo;->JCB:Lcom/stripe/android/model/AccountRange$BrandInfo;

    sget-object v4, Lcom/stripe/android/model/AccountRange$BrandInfo;->DinersClub:Lcom/stripe/android/model/AccountRange$BrandInfo;

    sget-object v5, Lcom/stripe/android/model/AccountRange$BrandInfo;->Discover:Lcom/stripe/android/model/AccountRange$BrandInfo;

    sget-object v6, Lcom/stripe/android/model/AccountRange$BrandInfo;->UnionPay:Lcom/stripe/android/model/AccountRange$BrandInfo;

    sget-object v7, Lcom/stripe/android/model/AccountRange$BrandInfo;->CartesBancaires:Lcom/stripe/android/model/AccountRange$BrandInfo;

    filled-new-array/range {v0 .. v7}, [Lcom/stripe/android/model/AccountRange$BrandInfo;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 23
    new-instance v0, Lcom/stripe/android/model/AccountRange$BrandInfo;

    const-string v1, "VISA"

    sget-object v2, Lcom/stripe/android/model/CardBrand;->Visa:Lcom/stripe/android/model/CardBrand;

    const-string v3, "Visa"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/stripe/android/model/AccountRange$BrandInfo;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/model/CardBrand;)V

    sput-object v0, Lcom/stripe/android/model/AccountRange$BrandInfo;->Visa:Lcom/stripe/android/model/AccountRange$BrandInfo;

    .line 24
    new-instance v0, Lcom/stripe/android/model/AccountRange$BrandInfo;

    const-string v1, "MASTERCARD"

    sget-object v2, Lcom/stripe/android/model/CardBrand;->MasterCard:Lcom/stripe/android/model/CardBrand;

    const-string v3, "Mastercard"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/stripe/android/model/AccountRange$BrandInfo;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/model/CardBrand;)V

    sput-object v0, Lcom/stripe/android/model/AccountRange$BrandInfo;->Mastercard:Lcom/stripe/android/model/AccountRange$BrandInfo;

    .line 25
    new-instance v0, Lcom/stripe/android/model/AccountRange$BrandInfo;

    const-string v1, "AMERICAN_EXPRESS"

    sget-object v2, Lcom/stripe/android/model/CardBrand;->AmericanExpress:Lcom/stripe/android/model/CardBrand;

    const-string v3, "AmericanExpress"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/stripe/android/model/AccountRange$BrandInfo;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/model/CardBrand;)V

    sput-object v0, Lcom/stripe/android/model/AccountRange$BrandInfo;->AmericanExpress:Lcom/stripe/android/model/AccountRange$BrandInfo;

    .line 26
    new-instance v0, Lcom/stripe/android/model/AccountRange$BrandInfo;

    const/4 v1, 0x3

    sget-object v2, Lcom/stripe/android/model/CardBrand;->JCB:Lcom/stripe/android/model/CardBrand;

    const-string v3, "JCB"

    invoke-direct {v0, v3, v1, v3, v2}, Lcom/stripe/android/model/AccountRange$BrandInfo;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/model/CardBrand;)V

    sput-object v0, Lcom/stripe/android/model/AccountRange$BrandInfo;->JCB:Lcom/stripe/android/model/AccountRange$BrandInfo;

    .line 27
    new-instance v0, Lcom/stripe/android/model/AccountRange$BrandInfo;

    const-string v1, "DINERS_CLUB"

    sget-object v2, Lcom/stripe/android/model/CardBrand;->DinersClub:Lcom/stripe/android/model/CardBrand;

    const-string v3, "DinersClub"

    const/4 v4, 0x4

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/stripe/android/model/AccountRange$BrandInfo;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/model/CardBrand;)V

    sput-object v0, Lcom/stripe/android/model/AccountRange$BrandInfo;->DinersClub:Lcom/stripe/android/model/AccountRange$BrandInfo;

    .line 28
    new-instance v0, Lcom/stripe/android/model/AccountRange$BrandInfo;

    const-string v1, "DISCOVER"

    sget-object v2, Lcom/stripe/android/model/CardBrand;->Discover:Lcom/stripe/android/model/CardBrand;

    const-string v3, "Discover"

    const/4 v4, 0x5

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/stripe/android/model/AccountRange$BrandInfo;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/model/CardBrand;)V

    sput-object v0, Lcom/stripe/android/model/AccountRange$BrandInfo;->Discover:Lcom/stripe/android/model/AccountRange$BrandInfo;

    .line 29
    new-instance v0, Lcom/stripe/android/model/AccountRange$BrandInfo;

    const-string v1, "UNIONPAY"

    sget-object v2, Lcom/stripe/android/model/CardBrand;->UnionPay:Lcom/stripe/android/model/CardBrand;

    const-string v3, "UnionPay"

    const/4 v4, 0x6

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/stripe/android/model/AccountRange$BrandInfo;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/model/CardBrand;)V

    sput-object v0, Lcom/stripe/android/model/AccountRange$BrandInfo;->UnionPay:Lcom/stripe/android/model/AccountRange$BrandInfo;

    .line 30
    new-instance v0, Lcom/stripe/android/model/AccountRange$BrandInfo;

    const-string v1, "CARTES_BANCAIRES"

    sget-object v2, Lcom/stripe/android/model/CardBrand;->CartesBancaires:Lcom/stripe/android/model/CardBrand;

    const-string v3, "CartesBancaires"

    const/4 v4, 0x7

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/stripe/android/model/AccountRange$BrandInfo;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/model/CardBrand;)V

    sput-object v0, Lcom/stripe/android/model/AccountRange$BrandInfo;->CartesBancaires:Lcom/stripe/android/model/AccountRange$BrandInfo;

    invoke-static {}, Lcom/stripe/android/model/AccountRange$BrandInfo;->$values()[Lcom/stripe/android/model/AccountRange$BrandInfo;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/AccountRange$BrandInfo;->$VALUES:[Lcom/stripe/android/model/AccountRange$BrandInfo;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/AccountRange$BrandInfo;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/model/CardBrand;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/CardBrand;",
            ")V"
        }
    .end annotation

    .line 19
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 20
    iput-object p3, p0, Lcom/stripe/android/model/AccountRange$BrandInfo;->brandName:Ljava/lang/String;

    .line 21
    iput-object p4, p0, Lcom/stripe/android/model/AccountRange$BrandInfo;->brand:Lcom/stripe/android/model/CardBrand;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/model/AccountRange$BrandInfo;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/model/AccountRange$BrandInfo;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/model/AccountRange$BrandInfo;
    .locals 1

    const-class v0, Lcom/stripe/android/model/AccountRange$BrandInfo;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 31
    check-cast p0, Lcom/stripe/android/model/AccountRange$BrandInfo;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/model/AccountRange$BrandInfo;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/AccountRange$BrandInfo;->$VALUES:[Lcom/stripe/android/model/AccountRange$BrandInfo;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 31
    check-cast v0, [Lcom/stripe/android/model/AccountRange$BrandInfo;

    return-object v0
.end method


# virtual methods
.method public final getBrand()Lcom/stripe/android/model/CardBrand;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/stripe/android/model/AccountRange$BrandInfo;->brand:Lcom/stripe/android/model/CardBrand;

    return-object v0
.end method

.method public final getBrandName()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/stripe/android/model/AccountRange$BrandInfo;->brandName:Ljava/lang/String;

    return-object v0
.end method
