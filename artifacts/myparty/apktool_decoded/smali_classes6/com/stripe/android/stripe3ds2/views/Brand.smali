.class public final enum Lcom/stripe/android/stripe3ds2/views/Brand;
.super Ljava/lang/Enum;
.source "Brand.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/views/Brand$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/stripe3ds2/views/Brand;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0014\u0008\u0080\u0081\u0002\u0018\u0000 \u001b2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB3\u0008\u0002\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u0008X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/views/Brand;",
        "",
        "directoryServerName",
        "",
        "drawableResId",
        "",
        "nameResId",
        "shouldStretch",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;Z)V",
        "getDirectoryServerName$3ds2sdk_release",
        "()Ljava/lang/String;",
        "getDrawableResId$3ds2sdk_release",
        "()I",
        "getNameResId$3ds2sdk_release",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getShouldStretch$3ds2sdk_release",
        "()Z",
        "Visa",
        "Mastercard",
        "Amex",
        "Discover",
        "CartesBancaires",
        "UnionPay",
        "Unknown",
        "Companion",
        "3ds2sdk_release"
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/stripe3ds2/views/Brand;

.field public static final enum Amex:Lcom/stripe/android/stripe3ds2/views/Brand;

.field public static final enum CartesBancaires:Lcom/stripe/android/stripe3ds2/views/Brand;

.field public static final Companion:Lcom/stripe/android/stripe3ds2/views/Brand$Companion;

.field public static final enum Discover:Lcom/stripe/android/stripe3ds2/views/Brand;

.field public static final enum Mastercard:Lcom/stripe/android/stripe3ds2/views/Brand;

.field public static final enum UnionPay:Lcom/stripe/android/stripe3ds2/views/Brand;

.field public static final enum Unknown:Lcom/stripe/android/stripe3ds2/views/Brand;

.field public static final enum Visa:Lcom/stripe/android/stripe3ds2/views/Brand;


# instance fields
.field private final directoryServerName:Ljava/lang/String;

.field private final drawableResId:I

.field private final nameResId:Ljava/lang/Integer;

.field private final shouldStretch:Z


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/stripe3ds2/views/Brand;
    .locals 7

    sget-object v0, Lcom/stripe/android/stripe3ds2/views/Brand;->Visa:Lcom/stripe/android/stripe3ds2/views/Brand;

    sget-object v1, Lcom/stripe/android/stripe3ds2/views/Brand;->Mastercard:Lcom/stripe/android/stripe3ds2/views/Brand;

    sget-object v2, Lcom/stripe/android/stripe3ds2/views/Brand;->Amex:Lcom/stripe/android/stripe3ds2/views/Brand;

    sget-object v3, Lcom/stripe/android/stripe3ds2/views/Brand;->Discover:Lcom/stripe/android/stripe3ds2/views/Brand;

    sget-object v4, Lcom/stripe/android/stripe3ds2/views/Brand;->CartesBancaires:Lcom/stripe/android/stripe3ds2/views/Brand;

    sget-object v5, Lcom/stripe/android/stripe3ds2/views/Brand;->UnionPay:Lcom/stripe/android/stripe3ds2/views/Brand;

    sget-object v6, Lcom/stripe/android/stripe3ds2/views/Brand;->Unknown:Lcom/stripe/android/stripe3ds2/views/Brand;

    filled-new-array/range {v0 .. v6}, [Lcom/stripe/android/stripe3ds2/views/Brand;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 15

    .line 15
    new-instance v0, Lcom/stripe/android/stripe3ds2/views/Brand;

    .line 17
    sget v4, Lcom/stripe/android/stripe3ds2/R$drawable;->stripe_3ds2_ic_visa:I

    .line 18
    sget v1, Lcom/stripe/android/stripe3ds2/R$string;->stripe_3ds2_brand_visa:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v7, 0x8

    const/4 v8, 0x0

    .line 15
    const-string v1, "Visa"

    const/4 v2, 0x0

    const-string v3, "visa"

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/stripe3ds2/views/Brand;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/Brand;->Visa:Lcom/stripe/android/stripe3ds2/views/Brand;

    .line 20
    new-instance v1, Lcom/stripe/android/stripe3ds2/views/Brand;

    .line 22
    sget v5, Lcom/stripe/android/stripe3ds2/R$drawable;->stripe_3ds2_ic_mastercard:I

    .line 23
    sget v0, Lcom/stripe/android/stripe3ds2/R$string;->stripe_3ds2_brand_mastercard:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/16 v8, 0x8

    const/4 v9, 0x0

    .line 20
    const-string v2, "Mastercard"

    const/4 v3, 0x1

    const-string v4, "mastercard"

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/stripe3ds2/views/Brand;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lcom/stripe/android/stripe3ds2/views/Brand;->Mastercard:Lcom/stripe/android/stripe3ds2/views/Brand;

    .line 25
    new-instance v2, Lcom/stripe/android/stripe3ds2/views/Brand;

    .line 27
    sget v6, Lcom/stripe/android/stripe3ds2/R$drawable;->stripe_3ds2_ic_amex:I

    .line 28
    sget v0, Lcom/stripe/android/stripe3ds2/R$string;->stripe_3ds2_brand_amex:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    .line 25
    const-string v3, "Amex"

    const/4 v4, 0x2

    const-string v5, "american_express"

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lcom/stripe/android/stripe3ds2/views/Brand;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lcom/stripe/android/stripe3ds2/views/Brand;->Amex:Lcom/stripe/android/stripe3ds2/views/Brand;

    .line 30
    new-instance v3, Lcom/stripe/android/stripe3ds2/views/Brand;

    .line 32
    sget v7, Lcom/stripe/android/stripe3ds2/R$drawable;->stripe_3ds2_ic_discover:I

    .line 33
    sget v0, Lcom/stripe/android/stripe3ds2/R$string;->stripe_3ds2_brand_discover:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v10, 0x8

    const/4 v11, 0x0

    .line 30
    const-string v4, "Discover"

    const/4 v5, 0x3

    const-string v6, "discover"

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lcom/stripe/android/stripe3ds2/views/Brand;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v3, Lcom/stripe/android/stripe3ds2/views/Brand;->Discover:Lcom/stripe/android/stripe3ds2/views/Brand;

    .line 35
    new-instance v4, Lcom/stripe/android/stripe3ds2/views/Brand;

    .line 37
    sget v8, Lcom/stripe/android/stripe3ds2/R$drawable;->stripe_3ds2_ic_cartesbancaires:I

    .line 38
    sget v0, Lcom/stripe/android/stripe3ds2/R$string;->stripe_3ds2_brand_cartesbancaires:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/4 v10, 0x1

    .line 35
    const-string v5, "CartesBancaires"

    const/4 v6, 0x4

    const-string v7, "cartes_bancaires"

    invoke-direct/range {v4 .. v10}, Lcom/stripe/android/stripe3ds2/views/Brand;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;Z)V

    sput-object v4, Lcom/stripe/android/stripe3ds2/views/Brand;->CartesBancaires:Lcom/stripe/android/stripe3ds2/views/Brand;

    .line 41
    new-instance v5, Lcom/stripe/android/stripe3ds2/views/Brand;

    .line 43
    sget v9, Lcom/stripe/android/stripe3ds2/R$drawable;->stripe_3ds2_ic_unionpay:I

    .line 44
    sget v0, Lcom/stripe/android/stripe3ds2/R$string;->stripe_3ds2_brand_unionpay:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v12, 0x8

    const/4 v13, 0x0

    .line 41
    const-string v6, "UnionPay"

    const/4 v7, 0x5

    const-string v8, "unionpay"

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v13}, Lcom/stripe/android/stripe3ds2/views/Brand;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v5, Lcom/stripe/android/stripe3ds2/views/Brand;->UnionPay:Lcom/stripe/android/stripe3ds2/views/Brand;

    .line 46
    new-instance v6, Lcom/stripe/android/stripe3ds2/views/Brand;

    .line 48
    sget v10, Lcom/stripe/android/stripe3ds2/R$drawable;->stripe_3ds2_ic_unknown:I

    const/16 v13, 0x8

    const/4 v14, 0x0

    .line 46
    const-string v7, "Unknown"

    const/4 v8, 0x6

    const-string v9, "unknown"

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v14}, Lcom/stripe/android/stripe3ds2/views/Brand;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v6, Lcom/stripe/android/stripe3ds2/views/Brand;->Unknown:Lcom/stripe/android/stripe3ds2/views/Brand;

    invoke-static {}, Lcom/stripe/android/stripe3ds2/views/Brand;->$values()[Lcom/stripe/android/stripe3ds2/views/Brand;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/Brand;->$VALUES:[Lcom/stripe/android/stripe3ds2/views/Brand;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/Brand;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/Brand$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/views/Brand$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/Brand;->Companion:Lcom/stripe/android/stripe3ds2/views/Brand$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Integer;",
            "Z)V"
        }
    .end annotation

    .line 9
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 10
    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/views/Brand;->directoryServerName:Ljava/lang/String;

    .line 11
    iput p4, p0, Lcom/stripe/android/stripe3ds2/views/Brand;->drawableResId:I

    .line 12
    iput-object p5, p0, Lcom/stripe/android/stripe3ds2/views/Brand;->nameResId:Ljava/lang/Integer;

    .line 13
    iput-boolean p6, p0, Lcom/stripe/android/stripe3ds2/views/Brand;->shouldStretch:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_0

    const/4 p6, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    move v6, p6

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/stripe3ds2/views/Brand;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;Z)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/stripe3ds2/views/Brand;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/stripe3ds2/views/Brand;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/views/Brand;
    .locals 1

    const-class v0, Lcom/stripe/android/stripe3ds2/views/Brand;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 77
    check-cast p0, Lcom/stripe/android/stripe3ds2/views/Brand;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/stripe3ds2/views/Brand;
    .locals 1

    sget-object v0, Lcom/stripe/android/stripe3ds2/views/Brand;->$VALUES:[Lcom/stripe/android/stripe3ds2/views/Brand;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 77
    check-cast v0, [Lcom/stripe/android/stripe3ds2/views/Brand;

    return-object v0
.end method


# virtual methods
.method public final getDirectoryServerName$3ds2sdk_release()Ljava/lang/String;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/Brand;->directoryServerName:Ljava/lang/String;

    return-object v0
.end method

.method public final getDrawableResId$3ds2sdk_release()I
    .locals 1

    .line 11
    iget v0, p0, Lcom/stripe/android/stripe3ds2/views/Brand;->drawableResId:I

    return v0
.end method

.method public final getNameResId$3ds2sdk_release()Ljava/lang/Integer;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/Brand;->nameResId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getShouldStretch$3ds2sdk_release()Z
    .locals 1

    .line 13
    iget-boolean v0, p0, Lcom/stripe/android/stripe3ds2/views/Brand;->shouldStretch:Z

    return v0
.end method
