.class public final Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;
.super Ljava/lang/Object;
.source "SuccessContentRepository.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "State"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\u000c\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;",
        "Landroid/os/Parcelable;",
        "message",
        "Lcom/stripe/android/financialconnections/ui/TextResource;",
        "heading",
        "<init>",
        "(Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;)V",
        "getMessage",
        "()Lcom/stripe/android/financialconnections/ui/TextResource;",
        "getHeading",
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
        "financial-connections_release"
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
            "Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final heading:Lcom/stripe/android/financialconnections/ui/TextResource;

.field private final message:Lcom/stripe/android/financialconnections/ui/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;->message:Lcom/stripe/android/financialconnections/ui/TextResource;

    .line 33
    iput-object p2, p0, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;->heading:Lcom/stripe/android/financialconnections/ui/TextResource;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;->message:Lcom/stripe/android/financialconnections/ui/TextResource;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;->heading:Lcom/stripe/android/financialconnections/ui/TextResource;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;->copy(Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;)Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/ui/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;->message:Lcom/stripe/android/financialconnections/ui/TextResource;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/financialconnections/ui/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;->heading:Lcom/stripe/android/financialconnections/ui/TextResource;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;)Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;-><init>(Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;)V

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
    instance-of v1, p1, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;->message:Lcom/stripe/android/financialconnections/ui/TextResource;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;->message:Lcom/stripe/android/financialconnections/ui/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;->heading:Lcom/stripe/android/financialconnections/ui/TextResource;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;->heading:Lcom/stripe/android/financialconnections/ui/TextResource;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getHeading()Lcom/stripe/android/financialconnections/ui/TextResource;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;->heading:Lcom/stripe/android/financialconnections/ui/TextResource;

    return-object v0
.end method

.method public final getMessage()Lcom/stripe/android/financialconnections/ui/TextResource;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;->message:Lcom/stripe/android/financialconnections/ui/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;->message:Lcom/stripe/android/financialconnections/ui/TextResource;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;->heading:Lcom/stripe/android/financialconnections/ui/TextResource;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;->message:Lcom/stripe/android/financialconnections/ui/TextResource;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;->heading:Lcom/stripe/android/financialconnections/ui/TextResource;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "State(message="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", heading="

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

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;->message:Lcom/stripe/android/financialconnections/ui/TextResource;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository$State;->heading:Lcom/stripe/android/financialconnections/ui/TextResource;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
