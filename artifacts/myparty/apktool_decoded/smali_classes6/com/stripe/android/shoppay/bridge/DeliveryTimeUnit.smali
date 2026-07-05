.class public final enum Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;
.super Ljava/lang/Enum;
.source "ECETypes.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0081\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bj\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;",
        "Landroid/os/Parcelable;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "HOUR",
        "DAY",
        "BUSINESS_DAY",
        "WEEK",
        "MONTH",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

.field public static final enum BUSINESS_DAY:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum DAY:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

.field public static final enum HOUR:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

.field public static final enum MONTH:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

.field public static final enum WEEK:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;
    .locals 5

    sget-object v0, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->HOUR:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    sget-object v1, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->DAY:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    sget-object v2, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->BUSINESS_DAY:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    sget-object v3, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->WEEK:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    sget-object v4, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->MONTH:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 202
    new-instance v0, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    const-string v1, "HOUR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->HOUR:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    .line 203
    new-instance v0, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    const-string v1, "DAY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->DAY:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    .line 204
    new-instance v0, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    const-string v1, "BUSINESS_DAY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->BUSINESS_DAY:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    .line 205
    new-instance v0, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    const-string v1, "WEEK"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->WEEK:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    .line 206
    new-instance v0, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    const-string v1, "MONTH"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->MONTH:Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    invoke-static {}, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->$values()[Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->$VALUES:[Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit$Creator;

    invoke-direct {v0}, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 200
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;
    .locals 1

    const-class v0, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 207
    check-cast p0, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;
    .locals 1

    sget-object v0, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->$VALUES:[Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 207
    check-cast v0, [Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;

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

    invoke-virtual {p0}, Lcom/stripe/android/shoppay/bridge/DeliveryTimeUnit;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
