.class public final enum Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;
.super Ljava/lang/Enum;
.source "PaymentMethod.kt"

# interfaces
.implements Lcom/stripe/android/core/model/StripeModel;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/PaymentMethod$USBankAccount;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "USBankAccountType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;",
        ">;",
        "Lcom/stripe/android/core/model/StripeModel;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0006\u0010\u000c\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;",
        "Lcom/stripe/android/core/model/StripeModel;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "UNKNOWN",
        "CHECKING",
        "SAVINGS",
        "describeContents",
        "",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
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

.field private static final synthetic $VALUES:[Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

.field public static final enum CHECKING:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum SAVINGS:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

.field public static final enum UNKNOWN:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;
    .locals 3

    sget-object v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;->UNKNOWN:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    sget-object v1, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;->CHECKING:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    sget-object v2, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;->SAVINGS:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    filled-new-array {v0, v1, v2}, [Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1225
    new-instance v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    const/4 v1, 0x0

    const-string v2, "unknown"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;->UNKNOWN:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    .line 1228
    new-instance v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    const/4 v1, 0x1

    const-string v2, "checking"

    const-string v3, "CHECKING"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;->CHECKING:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    .line 1231
    new-instance v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    const/4 v1, 0x2

    const-string v2, "savings"

    const-string v3, "SAVINGS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;->SAVINGS:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    invoke-static {}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;->$values()[Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;->$VALUES:[Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType$Creator;

    invoke-direct {v0}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;->CREATOR:Landroid/os/Parcelable$Creator;

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

    .line 1224
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;->value:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;
    .locals 1

    const-class v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    .line 1232
    check-cast p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;
    .locals 1

    sget-object v0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;->$VALUES:[Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 1232
    check-cast v0, [Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 1224
    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;->value:Ljava/lang/String;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
