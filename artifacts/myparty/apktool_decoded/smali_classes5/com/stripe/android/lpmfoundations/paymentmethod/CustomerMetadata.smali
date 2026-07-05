.class public final Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;
.super Ljava/lang/Object;
.source "CustomerMetadata.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u00002\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;",
        "Landroid/os/Parcelable;",
        "hasCustomerConfiguration",
        "",
        "isPaymentMethodSetAsDefaultEnabled",
        "permissions",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;",
        "<init>",
        "(ZZLcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;)V",
        "getHasCustomerConfiguration",
        "()Z",
        "getPermissions",
        "()Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;",
        "component1",
        "component2",
        "component3",
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
        "Permissions",
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
            "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final hasCustomerConfiguration:Z

.field private final isPaymentMethodSetAsDefaultEnabled:Z

.field private final permissions:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Creator;

    invoke-direct {v0}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZZLcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;)V
    .locals 1

    const-string v0, "permissions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-boolean p1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->hasCustomerConfiguration:Z

    .line 13
    iput-boolean p2, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->isPaymentMethodSetAsDefaultEnabled:Z

    .line 14
    iput-object p3, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->permissions:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;ZZLcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;ILjava/lang/Object;)Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->hasCustomerConfiguration:Z

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->isPaymentMethodSetAsDefaultEnabled:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->permissions:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->copy(ZZLcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;)Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->hasCustomerConfiguration:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->isPaymentMethodSetAsDefaultEnabled:Z

    return v0
.end method

.method public final component3()Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->permissions:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;

    return-object v0
.end method

.method public final copy(ZZLcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;)Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;
    .locals 1

    const-string v0, "permissions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;-><init>(ZZLcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;)V

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
    instance-of v1, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;

    iget-boolean v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->hasCustomerConfiguration:Z

    iget-boolean v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->hasCustomerConfiguration:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->isPaymentMethodSetAsDefaultEnabled:Z

    iget-boolean v3, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->isPaymentMethodSetAsDefaultEnabled:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->permissions:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;

    iget-object p1, p1, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->permissions:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getHasCustomerConfiguration()Z
    .locals 1

    .line 12
    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->hasCustomerConfiguration:Z

    return v0
.end method

.method public final getPermissions()Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->permissions:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->hasCustomerConfiguration:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->isPaymentMethodSetAsDefaultEnabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->permissions:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;

    invoke-virtual {v1}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isPaymentMethodSetAsDefaultEnabled()Z
    .locals 1

    .line 13
    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->isPaymentMethodSetAsDefaultEnabled:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->hasCustomerConfiguration:Z

    iget-boolean v1, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->isPaymentMethodSetAsDefaultEnabled:Z

    iget-object v2, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->permissions:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "CustomerMetadata(hasCustomerConfiguration="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", isPaymentMethodSetAsDefaultEnabled="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", permissions="

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

    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->hasCustomerConfiguration:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->isPaymentMethodSetAsDefaultEnabled:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;->permissions:Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
