.class public final Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;
.super Ljava/lang/Object;
.source "ElementsSession.kt"

# interfaces
.implements Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Enabled"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0008\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;",
        "Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet;",
        "isPaymentMethodRemoveEnabled",
        "",
        "canRemoveLastPaymentMethod",
        "isPaymentMethodSyncDefaultEnabled",
        "<init>",
        "(ZZZ)V",
        "()Z",
        "getCanRemoveLastPaymentMethod",
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
            "Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final canRemoveLastPaymentMethod:Z

.field private final isPaymentMethodRemoveEnabled:Z

.field private final isPaymentMethodSyncDefaultEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled$Creator;

    invoke-direct {v0}, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->$stable:I

    return-void
.end method

.method public constructor <init>(ZZZ)V
    .locals 0

    .line 179
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 180
    iput-boolean p1, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->isPaymentMethodRemoveEnabled:Z

    .line 181
    iput-boolean p2, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->canRemoveLastPaymentMethod:Z

    .line 182
    iput-boolean p3, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->isPaymentMethodSyncDefaultEnabled:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;ZZZILjava/lang/Object;)Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->isPaymentMethodRemoveEnabled:Z

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->canRemoveLastPaymentMethod:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->isPaymentMethodSyncDefaultEnabled:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->copy(ZZZ)Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->isPaymentMethodRemoveEnabled:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->canRemoveLastPaymentMethod:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->isPaymentMethodSyncDefaultEnabled:Z

    return v0
.end method

.method public final copy(ZZZ)Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;
    .locals 1

    new-instance v0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;-><init>(ZZZ)V

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
    instance-of v1, p1, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;

    iget-boolean v1, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->isPaymentMethodRemoveEnabled:Z

    iget-boolean v3, p1, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->isPaymentMethodRemoveEnabled:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->canRemoveLastPaymentMethod:Z

    iget-boolean v3, p1, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->canRemoveLastPaymentMethod:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->isPaymentMethodSyncDefaultEnabled:Z

    iget-boolean p1, p1, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->isPaymentMethodSyncDefaultEnabled:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCanRemoveLastPaymentMethod()Z
    .locals 1

    .line 181
    iget-boolean v0, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->canRemoveLastPaymentMethod:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->isPaymentMethodRemoveEnabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->canRemoveLastPaymentMethod:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->isPaymentMethodSyncDefaultEnabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isPaymentMethodRemoveEnabled()Z
    .locals 1

    .line 180
    iget-boolean v0, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->isPaymentMethodRemoveEnabled:Z

    return v0
.end method

.method public final isPaymentMethodSyncDefaultEnabled()Z
    .locals 1

    .line 182
    iget-boolean v0, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->isPaymentMethodSyncDefaultEnabled:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-boolean v0, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->isPaymentMethodRemoveEnabled:Z

    iget-boolean v1, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->canRemoveLastPaymentMethod:Z

    iget-boolean v2, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->isPaymentMethodSyncDefaultEnabled:Z

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Enabled(isPaymentMethodRemoveEnabled="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", canRemoveLastPaymentMethod="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isPaymentMethodSyncDefaultEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

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

    iget-boolean p2, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->isPaymentMethodRemoveEnabled:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->canRemoveLastPaymentMethod:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/stripe/android/model/ElementsSession$Customer$Components$CustomerSheet$Enabled;->isPaymentMethodSyncDefaultEnabled:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
