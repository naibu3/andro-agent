.class public final Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;
.super Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;
.source "InitChallengeResult.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "End"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0008\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;",
        "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;",
        "challengeResult",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;",
        "<init>",
        "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;)V",
        "getChallengeResult",
        "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;",
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
        "3ds2sdk_release"
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
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End$Creator;

    invoke-direct {v0}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;)V
    .locals 1

    const-string v0, "challengeResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 19
    invoke-direct {p0, v0}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;->challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;ILjava/lang/Object;)Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;->challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;->copy(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;)Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;->challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;)Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;
    .locals 1

    const-string v0, "challengeResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;

    invoke-direct {v0, p1}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;-><init>(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;)V

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
    instance-of v1, p1, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;->challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    iget-object p1, p1, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;->challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getChallengeResult()Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;->challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;->challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;->challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "End(challengeResult="

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
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;->challengeResult:Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
