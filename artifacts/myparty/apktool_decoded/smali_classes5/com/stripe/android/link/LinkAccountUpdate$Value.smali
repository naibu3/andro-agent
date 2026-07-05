.class public final Lcom/stripe/android/link/LinkAccountUpdate$Value;
.super Ljava/lang/Object;
.source "LinkActivityResult.kt"

# interfaces
.implements Lcom/stripe/android/link/LinkAccountUpdate;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/LinkAccountUpdate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Value"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0001\u001dB\u001d\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J!\u0010\u000e\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkAccountUpdate$Value;",
        "Lcom/stripe/android/link/LinkAccountUpdate;",
        "account",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "lastUpdateReason",
        "Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;",
        "<init>",
        "(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;)V",
        "getAccount",
        "()Lcom/stripe/android/link/model/LinkAccount;",
        "getLastUpdateReason",
        "()Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;",
        "component1",
        "component2",
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
        "UpdateReason",
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
            "Lcom/stripe/android/link/LinkAccountUpdate$Value;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final account:Lcom/stripe/android/link/model/LinkAccount;

.field private final lastUpdateReason:Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/LinkAccountUpdate$Value$Creator;

    invoke-direct {v0}, Lcom/stripe/android/link/LinkAccountUpdate$Value$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/link/LinkAccountUpdate$Value;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/LinkAccountUpdate$Value;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p1, p0, Lcom/stripe/android/link/LinkAccountUpdate$Value;->account:Lcom/stripe/android/link/model/LinkAccount;

    .line 65
    iput-object p2, p0, Lcom/stripe/android/link/LinkAccountUpdate$Value;->lastUpdateReason:Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 63
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/LinkAccountUpdate$Value;-><init>(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/link/LinkAccountUpdate$Value;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;ILjava/lang/Object;)Lcom/stripe/android/link/LinkAccountUpdate$Value;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/link/LinkAccountUpdate$Value;->account:Lcom/stripe/android/link/model/LinkAccount;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/link/LinkAccountUpdate$Value;->lastUpdateReason:Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/LinkAccountUpdate$Value;->copy(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;)Lcom/stripe/android/link/LinkAccountUpdate$Value;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/link/model/LinkAccount;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkAccountUpdate$Value;->account:Lcom/stripe/android/link/model/LinkAccount;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkAccountUpdate$Value;->lastUpdateReason:Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;)Lcom/stripe/android/link/LinkAccountUpdate$Value;
    .locals 1

    new-instance v0, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/link/LinkAccountUpdate$Value;-><init>(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;)V

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
    instance-of v1, p1, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/LinkAccountUpdate$Value;

    iget-object v1, p0, Lcom/stripe/android/link/LinkAccountUpdate$Value;->account:Lcom/stripe/android/link/model/LinkAccount;

    iget-object v3, p1, Lcom/stripe/android/link/LinkAccountUpdate$Value;->account:Lcom/stripe/android/link/model/LinkAccount;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/link/LinkAccountUpdate$Value;->lastUpdateReason:Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;

    iget-object p1, p1, Lcom/stripe/android/link/LinkAccountUpdate$Value;->lastUpdateReason:Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getAccount()Lcom/stripe/android/link/model/LinkAccount;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/stripe/android/link/LinkAccountUpdate$Value;->account:Lcom/stripe/android/link/model/LinkAccount;

    return-object v0
.end method

.method public final getLastUpdateReason()Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/stripe/android/link/LinkAccountUpdate$Value;->lastUpdateReason:Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/link/LinkAccountUpdate$Value;->account:Lcom/stripe/android/link/model/LinkAccount;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/link/model/LinkAccount;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/link/LinkAccountUpdate$Value;->lastUpdateReason:Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/link/LinkAccountUpdate$Value;->account:Lcom/stripe/android/link/model/LinkAccount;

    iget-object v1, p0, Lcom/stripe/android/link/LinkAccountUpdate$Value;->lastUpdateReason:Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Value(account="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", lastUpdateReason="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/LinkAccountUpdate$Value;->account:Lcom/stripe/android/link/model/LinkAccount;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/link/model/LinkAccount;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object p2, p0, Lcom/stripe/android/link/LinkAccountUpdate$Value;->lastUpdateReason:Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;

    if-nez p2, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Lcom/stripe/android/link/LinkAccountUpdate$Value$UpdateReason;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
