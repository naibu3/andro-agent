.class public final Lcom/stripe/android/link/LinkActivityResult$Canceled;
.super Lcom/stripe/android/link/LinkActivityResult;
.source "LinkActivityResult.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/LinkActivityResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Canceled"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u00002\u00020\u0001:\u0001\u001dB\u0019\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkActivityResult$Canceled;",
        "Lcom/stripe/android/link/LinkActivityResult;",
        "reason",
        "Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;",
        "linkAccountUpdate",
        "Lcom/stripe/android/link/LinkAccountUpdate;",
        "<init>",
        "(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;Lcom/stripe/android/link/LinkAccountUpdate;)V",
        "getReason",
        "()Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;",
        "getLinkAccountUpdate",
        "()Lcom/stripe/android/link/LinkAccountUpdate;",
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
        "Reason",
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
            "Lcom/stripe/android/link/LinkActivityResult$Canceled;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final linkAccountUpdate:Lcom/stripe/android/link/LinkAccountUpdate;

.field private final reason:Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/LinkActivityResult$Canceled$Creator;

    invoke-direct {v0}, Lcom/stripe/android/link/LinkActivityResult$Canceled$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/link/LinkActivityResult$Canceled;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;Lcom/stripe/android/link/LinkAccountUpdate;)V
    .locals 1

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountUpdate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 42
    invoke-direct {p0, v0}, Lcom/stripe/android/link/LinkActivityResult;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 40
    iput-object p1, p0, Lcom/stripe/android/link/LinkActivityResult$Canceled;->reason:Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;

    .line 41
    iput-object p2, p0, Lcom/stripe/android/link/LinkActivityResult$Canceled;->linkAccountUpdate:Lcom/stripe/android/link/LinkAccountUpdate;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;Lcom/stripe/android/link/LinkAccountUpdate;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 40
    sget-object p1, Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;->BackPressed:Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;

    .line 39
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/LinkActivityResult$Canceled;-><init>(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;Lcom/stripe/android/link/LinkAccountUpdate;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/link/LinkActivityResult$Canceled;Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;Lcom/stripe/android/link/LinkAccountUpdate;ILjava/lang/Object;)Lcom/stripe/android/link/LinkActivityResult$Canceled;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/link/LinkActivityResult$Canceled;->reason:Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/link/LinkActivityResult$Canceled;->linkAccountUpdate:Lcom/stripe/android/link/LinkAccountUpdate;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/LinkActivityResult$Canceled;->copy(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;Lcom/stripe/android/link/LinkAccountUpdate;)Lcom/stripe/android/link/LinkActivityResult$Canceled;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityResult$Canceled;->reason:Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/link/LinkAccountUpdate;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityResult$Canceled;->linkAccountUpdate:Lcom/stripe/android/link/LinkAccountUpdate;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;Lcom/stripe/android/link/LinkAccountUpdate;)Lcom/stripe/android/link/LinkActivityResult$Canceled;
    .locals 1

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountUpdate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/link/LinkActivityResult$Canceled;-><init>(Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;Lcom/stripe/android/link/LinkAccountUpdate;)V

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
    instance-of v1, p1, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityResult$Canceled;->reason:Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;

    iget-object v3, p1, Lcom/stripe/android/link/LinkActivityResult$Canceled;->reason:Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityResult$Canceled;->linkAccountUpdate:Lcom/stripe/android/link/LinkAccountUpdate;

    iget-object p1, p1, Lcom/stripe/android/link/LinkActivityResult$Canceled;->linkAccountUpdate:Lcom/stripe/android/link/LinkAccountUpdate;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public getLinkAccountUpdate()Lcom/stripe/android/link/LinkAccountUpdate;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityResult$Canceled;->linkAccountUpdate:Lcom/stripe/android/link/LinkAccountUpdate;

    return-object v0
.end method

.method public final getReason()Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityResult$Canceled;->reason:Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityResult$Canceled;->reason:Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityResult$Canceled;->linkAccountUpdate:Lcom/stripe/android/link/LinkAccountUpdate;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityResult$Canceled;->reason:Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityResult$Canceled;->linkAccountUpdate:Lcom/stripe/android/link/LinkAccountUpdate;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Canceled(reason="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", linkAccountUpdate="

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
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityResult$Canceled;->reason:Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkActivityResult$Canceled$Reason;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityResult$Canceled;->linkAccountUpdate:Lcom/stripe/android/link/LinkAccountUpdate;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
