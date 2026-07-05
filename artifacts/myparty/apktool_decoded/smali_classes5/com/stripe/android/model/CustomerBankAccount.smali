.class public final Lcom/stripe/android/model/CustomerBankAccount;
.super Lcom/stripe/android/model/CustomerPaymentSource;
.source "CustomerSource.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\tH\u00d6\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0016\u0010\u0008\u001a\u0004\u0018\u00010\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u000c\u001a\u0004\u0018\u00010\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/model/CustomerBankAccount;",
        "Lcom/stripe/android/model/CustomerPaymentSource;",
        "bankAccount",
        "Lcom/stripe/android/model/BankAccount;",
        "<init>",
        "(Lcom/stripe/android/model/BankAccount;)V",
        "getBankAccount",
        "()Lcom/stripe/android/model/BankAccount;",
        "id",
        "",
        "getId",
        "()Ljava/lang/String;",
        "tokenizationMethod",
        "Lcom/stripe/android/model/TokenizationMethod;",
        "getTokenizationMethod",
        "()Lcom/stripe/android/model/TokenizationMethod;",
        "component1",
        "copy",
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
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
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/model/CustomerBankAccount;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final bankAccount:Lcom/stripe/android/model/BankAccount;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/model/CustomerBankAccount$Creator;

    invoke-direct {v0}, Lcom/stripe/android/model/CustomerBankAccount$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/model/CustomerBankAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/model/CustomerBankAccount;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/BankAccount;)V
    .locals 1

    const-string v0, "bankAccount"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 29
    invoke-direct {p0, v0}, Lcom/stripe/android/model/CustomerPaymentSource;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 28
    iput-object p1, p0, Lcom/stripe/android/model/CustomerBankAccount;->bankAccount:Lcom/stripe/android/model/BankAccount;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/CustomerBankAccount;Lcom/stripe/android/model/BankAccount;ILjava/lang/Object;)Lcom/stripe/android/model/CustomerBankAccount;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/model/CustomerBankAccount;->bankAccount:Lcom/stripe/android/model/BankAccount;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/model/CustomerBankAccount;->copy(Lcom/stripe/android/model/BankAccount;)Lcom/stripe/android/model/CustomerBankAccount;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/model/BankAccount;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CustomerBankAccount;->bankAccount:Lcom/stripe/android/model/BankAccount;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/model/BankAccount;)Lcom/stripe/android/model/CustomerBankAccount;
    .locals 1

    const-string v0, "bankAccount"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/model/CustomerBankAccount;

    invoke-direct {v0, p1}, Lcom/stripe/android/model/CustomerBankAccount;-><init>(Lcom/stripe/android/model/BankAccount;)V

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/model/CustomerBankAccount;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/CustomerBankAccount;

    iget-object v1, p0, Lcom/stripe/android/model/CustomerBankAccount;->bankAccount:Lcom/stripe/android/model/BankAccount;

    iget-object p1, p1, Lcom/stripe/android/model/CustomerBankAccount;->bankAccount:Lcom/stripe/android/model/BankAccount;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getBankAccount()Lcom/stripe/android/model/BankAccount;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/stripe/android/model/CustomerBankAccount;->bankAccount:Lcom/stripe/android/model/BankAccount;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/stripe/android/model/CustomerBankAccount;->bankAccount:Lcom/stripe/android/model/BankAccount;

    invoke-virtual {v0}, Lcom/stripe/android/model/BankAccount;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTokenizationMethod()Lcom/stripe/android/model/TokenizationMethod;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CustomerBankAccount;->bankAccount:Lcom/stripe/android/model/BankAccount;

    invoke-virtual {v0}, Lcom/stripe/android/model/BankAccount;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/model/CustomerBankAccount;->bankAccount:Lcom/stripe/android/model/BankAccount;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "CustomerBankAccount(bankAccount="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/CustomerBankAccount;->bankAccount:Lcom/stripe/android/model/BankAccount;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
