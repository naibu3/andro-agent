.class public final Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;
.super Ljava/lang/Object;
.source "PaymentSheet.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Custom"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000b\u0010\u0008\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;",
        "Landroid/os/Parcelable;",
        "h1",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;)V",
        "getH1",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;",
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
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final h1:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom$Creator;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;)V
    .locals 0

    .line 2330
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2336
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;->h1:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 2330
    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;->h1:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;->copy(Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;)Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;->h1:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;)Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;)V

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
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;->h1:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;->h1:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getH1()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;
    .locals 1

    .line 2336
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;->h1:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;->h1:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;->h1:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Custom(h1="

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
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;->h1:Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;

    if-nez v0, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
