.class public final enum Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;
.super Ljava/lang/Enum;
.source "PaymentSheet.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "BrandCategory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nj\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;",
        "Landroid/os/Parcelable;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Visa",
        "Mastercard",
        "Amex",
        "Discover",
        "describeContents",
        "",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

.field public static final enum Amex:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum Discover:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

.field public static final enum Mastercard:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

.field public static final enum Visa:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;
    .locals 4

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;->Visa:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;->Mastercard:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

    sget-object v2, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;->Amex:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

    sget-object v3, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;->Discover:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

    filled-new-array {v0, v1, v2, v3}, [Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 2884
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

    const-string v1, "Visa"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;->Visa:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

    .line 2889
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

    const-string v1, "Mastercard"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;->Mastercard:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

    .line 2894
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

    const-string v1, "Amex"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;->Amex:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

    .line 2900
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

    const-string v1, "Discover"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;->Discover:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

    invoke-static {}, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;->$values()[Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;->$VALUES:[Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory$Creator;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 2879
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;
    .locals 1

    const-class v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 2901
    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;->$VALUES:[Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 2901
    check-cast v0, [Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
