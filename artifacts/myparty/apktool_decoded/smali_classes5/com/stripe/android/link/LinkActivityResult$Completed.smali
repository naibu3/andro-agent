.class public final Lcom/stripe/android/link/LinkActivityResult$Completed;
.super Lcom/stripe/android/link/LinkActivityResult;
.source "LinkActivityResult.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/LinkActivityResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Completed"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J+\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\""
    }
    d2 = {
        "Lcom/stripe/android/link/LinkActivityResult$Completed;",
        "Lcom/stripe/android/link/LinkActivityResult;",
        "linkAccountUpdate",
        "Lcom/stripe/android/link/LinkAccountUpdate;",
        "selectedPayment",
        "Lcom/stripe/android/link/LinkPaymentMethod;",
        "shippingAddress",
        "Lcom/stripe/android/model/ConsumerShippingAddress;",
        "<init>",
        "(Lcom/stripe/android/link/LinkAccountUpdate;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/ConsumerShippingAddress;)V",
        "getLinkAccountUpdate",
        "()Lcom/stripe/android/link/LinkAccountUpdate;",
        "getSelectedPayment",
        "()Lcom/stripe/android/link/LinkPaymentMethod;",
        "getShippingAddress",
        "()Lcom/stripe/android/model/ConsumerShippingAddress;",
        "component1",
        "component2",
        "component3",
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
            "Lcom/stripe/android/link/LinkActivityResult$Completed;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final linkAccountUpdate:Lcom/stripe/android/link/LinkAccountUpdate;

.field private final selectedPayment:Lcom/stripe/android/link/LinkPaymentMethod;

.field private final shippingAddress:Lcom/stripe/android/model/ConsumerShippingAddress;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/LinkActivityResult$Completed$Creator;

    invoke-direct {v0}, Lcom/stripe/android/link/LinkActivityResult$Completed$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/link/LinkActivityResult$Completed;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/LinkActivityResult$Completed;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/LinkAccountUpdate;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/ConsumerShippingAddress;)V
    .locals 1

    const-string v0, "linkAccountUpdate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 21
    invoke-direct {p0, v0}, Lcom/stripe/android/link/LinkActivityResult;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    iput-object p1, p0, Lcom/stripe/android/link/LinkActivityResult$Completed;->linkAccountUpdate:Lcom/stripe/android/link/LinkAccountUpdate;

    .line 19
    iput-object p2, p0, Lcom/stripe/android/link/LinkActivityResult$Completed;->selectedPayment:Lcom/stripe/android/link/LinkPaymentMethod;

    .line 20
    iput-object p3, p0, Lcom/stripe/android/link/LinkActivityResult$Completed;->shippingAddress:Lcom/stripe/android/model/ConsumerShippingAddress;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/link/LinkAccountUpdate;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/ConsumerShippingAddress;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    .line 17
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/link/LinkActivityResult$Completed;-><init>(Lcom/stripe/android/link/LinkAccountUpdate;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/ConsumerShippingAddress;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/link/LinkActivityResult$Completed;Lcom/stripe/android/link/LinkAccountUpdate;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/ConsumerShippingAddress;ILjava/lang/Object;)Lcom/stripe/android/link/LinkActivityResult$Completed;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/link/LinkActivityResult$Completed;->linkAccountUpdate:Lcom/stripe/android/link/LinkAccountUpdate;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/link/LinkActivityResult$Completed;->selectedPayment:Lcom/stripe/android/link/LinkPaymentMethod;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/link/LinkActivityResult$Completed;->shippingAddress:Lcom/stripe/android/model/ConsumerShippingAddress;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/LinkActivityResult$Completed;->copy(Lcom/stripe/android/link/LinkAccountUpdate;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/ConsumerShippingAddress;)Lcom/stripe/android/link/LinkActivityResult$Completed;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/link/LinkAccountUpdate;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityResult$Completed;->linkAccountUpdate:Lcom/stripe/android/link/LinkAccountUpdate;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/link/LinkPaymentMethod;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityResult$Completed;->selectedPayment:Lcom/stripe/android/link/LinkPaymentMethod;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/model/ConsumerShippingAddress;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityResult$Completed;->shippingAddress:Lcom/stripe/android/model/ConsumerShippingAddress;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/link/LinkAccountUpdate;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/ConsumerShippingAddress;)Lcom/stripe/android/link/LinkActivityResult$Completed;
    .locals 1

    const-string v0, "linkAccountUpdate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/link/LinkActivityResult$Completed;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/link/LinkActivityResult$Completed;-><init>(Lcom/stripe/android/link/LinkAccountUpdate;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/ConsumerShippingAddress;)V

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/link/LinkActivityResult$Completed;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/LinkActivityResult$Completed;

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityResult$Completed;->linkAccountUpdate:Lcom/stripe/android/link/LinkAccountUpdate;

    iget-object v3, p1, Lcom/stripe/android/link/LinkActivityResult$Completed;->linkAccountUpdate:Lcom/stripe/android/link/LinkAccountUpdate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityResult$Completed;->selectedPayment:Lcom/stripe/android/link/LinkPaymentMethod;

    iget-object v3, p1, Lcom/stripe/android/link/LinkActivityResult$Completed;->selectedPayment:Lcom/stripe/android/link/LinkPaymentMethod;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityResult$Completed;->shippingAddress:Lcom/stripe/android/model/ConsumerShippingAddress;

    iget-object p1, p1, Lcom/stripe/android/link/LinkActivityResult$Completed;->shippingAddress:Lcom/stripe/android/model/ConsumerShippingAddress;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public getLinkAccountUpdate()Lcom/stripe/android/link/LinkAccountUpdate;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityResult$Completed;->linkAccountUpdate:Lcom/stripe/android/link/LinkAccountUpdate;

    return-object v0
.end method

.method public final getSelectedPayment()Lcom/stripe/android/link/LinkPaymentMethod;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityResult$Completed;->selectedPayment:Lcom/stripe/android/link/LinkPaymentMethod;

    return-object v0
.end method

.method public final getShippingAddress()Lcom/stripe/android/model/ConsumerShippingAddress;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityResult$Completed;->shippingAddress:Lcom/stripe/android/model/ConsumerShippingAddress;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityResult$Completed;->linkAccountUpdate:Lcom/stripe/android/link/LinkAccountUpdate;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityResult$Completed;->selectedPayment:Lcom/stripe/android/link/LinkPaymentMethod;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/link/LinkPaymentMethod;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityResult$Completed;->shippingAddress:Lcom/stripe/android/model/ConsumerShippingAddress;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerShippingAddress;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityResult$Completed;->linkAccountUpdate:Lcom/stripe/android/link/LinkAccountUpdate;

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityResult$Completed;->selectedPayment:Lcom/stripe/android/link/LinkPaymentMethod;

    iget-object v2, p0, Lcom/stripe/android/link/LinkActivityResult$Completed;->shippingAddress:Lcom/stripe/android/model/ConsumerShippingAddress;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Completed(linkAccountUpdate="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", selectedPayment="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shippingAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityResult$Completed;->linkAccountUpdate:Lcom/stripe/android/link/LinkAccountUpdate;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityResult$Completed;->selectedPayment:Lcom/stripe/android/link/LinkPaymentMethod;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityResult$Completed;->shippingAddress:Lcom/stripe/android/model/ConsumerShippingAddress;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
