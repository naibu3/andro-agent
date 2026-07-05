.class public final Lcom/stripe/android/view/StripeEditText$StripeEditTextState;
.super Ljava/lang/Object;
.source "StripeEditText.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/StripeEditText;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "StripeEditTextState"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001B#\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J+\u0010\u0012\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00062\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0004H\u00d6\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/view/StripeEditText$StripeEditTextState;",
        "Landroid/os/Parcelable;",
        "superState",
        "errorMessage",
        "",
        "shouldShowError",
        "",
        "<init>",
        "(Landroid/os/Parcelable;Ljava/lang/String;Z)V",
        "getSuperState",
        "()Landroid/os/Parcelable;",
        "getErrorMessage",
        "()Ljava/lang/String;",
        "getShouldShowError",
        "()Z",
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
            "Lcom/stripe/android/view/StripeEditText$StripeEditTextState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final errorMessage:Ljava/lang/String;

.field private final shouldShowError:Z

.field private final superState:Landroid/os/Parcelable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState$Creator;

    invoke-direct {v0}, Lcom/stripe/android/view/StripeEditText$StripeEditTextState$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcelable;Ljava/lang/String;Z)V
    .locals 0

    .line 338
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 339
    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->superState:Landroid/os/Parcelable;

    .line 340
    iput-object p2, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->errorMessage:Ljava/lang/String;

    .line 341
    iput-boolean p3, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->shouldShowError:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/view/StripeEditText$StripeEditTextState;Landroid/os/Parcelable;Ljava/lang/String;ZILjava/lang/Object;)Lcom/stripe/android/view/StripeEditText$StripeEditTextState;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->superState:Landroid/os/Parcelable;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->errorMessage:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->shouldShowError:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->copy(Landroid/os/Parcelable;Ljava/lang/String;Z)Lcom/stripe/android/view/StripeEditText$StripeEditTextState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Landroid/os/Parcelable;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->superState:Landroid/os/Parcelable;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->shouldShowError:Z

    return v0
.end method

.method public final copy(Landroid/os/Parcelable;Ljava/lang/String;Z)Lcom/stripe/android/view/StripeEditText$StripeEditTextState;
    .locals 1

    new-instance v0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;-><init>(Landroid/os/Parcelable;Ljava/lang/String;Z)V

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
    instance-of v1, p1, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;

    iget-object v1, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->superState:Landroid/os/Parcelable;

    iget-object v3, p1, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->superState:Landroid/os/Parcelable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->errorMessage:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->errorMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->shouldShowError:Z

    iget-boolean p1, p1, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->shouldShowError:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getErrorMessage()Ljava/lang/String;
    .locals 1

    .line 340
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getShouldShowError()Z
    .locals 1

    .line 341
    iget-boolean v0, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->shouldShowError:Z

    return v0
.end method

.method public final getSuperState()Landroid/os/Parcelable;
    .locals 1

    .line 339
    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->superState:Landroid/os/Parcelable;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->superState:Landroid/os/Parcelable;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->errorMessage:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->shouldShowError:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->superState:Landroid/os/Parcelable;

    iget-object v1, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->errorMessage:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->shouldShowError:Z

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "StripeEditTextState(superState="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", errorMessage="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shouldShowError="

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
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->superState:Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->errorMessage:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/stripe/android/view/StripeEditText$StripeEditTextState;->shouldShowError:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
