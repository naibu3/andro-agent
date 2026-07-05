.class public final Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;
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
    name = "Card"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0008\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0006\u0010\n\u001a\u00020\u0003J\u0013\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;",
        "Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType;",
        "iconRes",
        "",
        "<init>",
        "(I)V",
        "getIconRes",
        "()I",
        "component1",
        "copy",
        "describeContents",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
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
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final iconRes:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card$Creator;

    invoke-direct {v0}, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;->iconRes:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;IILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget p1, p0, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;->iconRes:I

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;->copy(I)Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;->iconRes:I

    return v0
.end method

.method public final copy(I)Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;
    .locals 1

    new-instance v0, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;-><init>(I)V

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
    instance-of v1, p1, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;

    iget v1, p0, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;->iconRes:I

    iget p1, p1, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;->iconRes:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getIconRes()I
    .locals 1

    .line 26
    iget v0, p0, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;->iconRes:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;->iconRes:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;->iconRes:I

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Card(iconRes="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

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

    iget p2, p0, Lcom/stripe/android/link/ui/wallet/DefaultPaymentUI$PaymentType$Card;->iconRes:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
