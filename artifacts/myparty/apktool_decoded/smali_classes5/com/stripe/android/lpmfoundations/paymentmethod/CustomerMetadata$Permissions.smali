.class public final Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;
.super Ljava/lang/Object;
.source "CustomerMetadata.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Permissions"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u0000  2\u00020\u0001:\u0001 B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\n\u00a8\u0006!"
    }
    d2 = {
        "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;",
        "Landroid/os/Parcelable;",
        "canRemovePaymentMethods",
        "",
        "canRemoveLastPaymentMethod",
        "canRemoveDuplicates",
        "canUpdateFullPaymentMethodDetails",
        "<init>",
        "(ZZZZ)V",
        "getCanRemovePaymentMethods",
        "()Z",
        "getCanRemoveLastPaymentMethod",
        "getCanRemoveDuplicates",
        "getCanUpdateFullPaymentMethodDetails",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "describeContents",
        "",
        "equals",
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
        "Companion",
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
            "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions$Companion;


# instance fields
.field private final canRemoveDuplicates:Z

.field private final canRemoveLastPaymentMethod:Z

.field private final canRemovePaymentMethods:Z

.field private final canUpdateFullPaymentMethodDetails:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->Companion:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions$Companion;

    new-instance v0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions$Creator;

    invoke-direct {v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->$stable:I

    return-void
.end method

.method public constructor <init>(ZZZZ)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-boolean p1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemovePaymentMethods:Z

    .line 20
    iput-boolean p2, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemoveLastPaymentMethod:Z

    .line 21
    iput-boolean p3, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemoveDuplicates:Z

    .line 22
    iput-boolean p4, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canUpdateFullPaymentMethodDetails:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;ZZZZILjava/lang/Object;)Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemovePaymentMethods:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemoveLastPaymentMethod:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemoveDuplicates:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canUpdateFullPaymentMethodDetails:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->copy(ZZZZ)Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemovePaymentMethods:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemoveLastPaymentMethod:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemoveDuplicates:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canUpdateFullPaymentMethodDetails:Z

    return v0
.end method

.method public final copy(ZZZZ)Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;
    .locals 1

    new-instance v0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;-><init>(ZZZZ)V

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
    instance-of v1, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;

    iget-boolean v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemovePaymentMethods:Z

    iget-boolean v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemovePaymentMethods:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemoveLastPaymentMethod:Z

    iget-boolean v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemoveLastPaymentMethod:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemoveDuplicates:Z

    iget-boolean v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemoveDuplicates:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canUpdateFullPaymentMethodDetails:Z

    iget-boolean p1, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canUpdateFullPaymentMethodDetails:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCanRemoveDuplicates()Z
    .locals 1

    .line 21
    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemoveDuplicates:Z

    return v0
.end method

.method public final getCanRemoveLastPaymentMethod()Z
    .locals 1

    .line 20
    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemoveLastPaymentMethod:Z

    return v0
.end method

.method public final getCanRemovePaymentMethods()Z
    .locals 1

    .line 19
    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemovePaymentMethods:Z

    return v0
.end method

.method public final getCanUpdateFullPaymentMethodDetails()Z
    .locals 1

    .line 22
    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canUpdateFullPaymentMethodDetails:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemovePaymentMethods:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemoveLastPaymentMethod:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemoveDuplicates:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canUpdateFullPaymentMethodDetails:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemovePaymentMethods:Z

    iget-boolean v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemoveLastPaymentMethod:Z

    iget-boolean v2, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemoveDuplicates:Z

    iget-boolean v3, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canUpdateFullPaymentMethodDetails:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Permissions(canRemovePaymentMethods="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", canRemoveLastPaymentMethod="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", canRemoveDuplicates="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", canUpdateFullPaymentMethodDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

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

    iget-boolean p2, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemovePaymentMethods:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemoveLastPaymentMethod:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canRemoveDuplicates:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->canUpdateFullPaymentMethodDetails:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
