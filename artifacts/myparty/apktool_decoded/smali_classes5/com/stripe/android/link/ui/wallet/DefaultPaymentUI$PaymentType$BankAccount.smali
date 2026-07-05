.class public final Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;
.super Ljava/lang/Object;
.source "DefaultPaymentUI.kt"

# interfaces
.implements Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BankAccount"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000b\u0010\u0008\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;",
        "Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType;",
        "bankIconCode",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "getBankIconCode",
        "()Ljava/lang/String;",
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
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final bankIconCode:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount$Creator;

    invoke-direct {v0}, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;->bankIconCode:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;->bankIconCode:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;->copy(Ljava/lang/String;)Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;->bankIconCode:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;)Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;
    .locals 1

    new-instance v0, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;-><init>(Ljava/lang/String;)V

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
    instance-of v1, p1, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;

    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;->bankIconCode:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;->bankIconCode:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getBankIconCode()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;->bankIconCode:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;->bankIconCode:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;->bankIconCode:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "BankAccount(bankIconCode="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$BankAccount;->bankIconCode:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
