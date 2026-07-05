.class public final Lcom/stripe/android/view/CardBrandView$SavedState;
.super Landroid/view/View$BaseSavedState;
.source "CardBrandView.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/CardBrandView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SavedState"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/stripe/android/view/CardBrandView$SavedState;",
        "Landroid/view/View$BaseSavedState;",
        "Landroid/os/Parcelable;",
        "superSavedState",
        "state",
        "Lcom/stripe/android/view/CardBrandView$State;",
        "<init>",
        "(Landroid/os/Parcelable;Lcom/stripe/android/view/CardBrandView$State;)V",
        "getSuperSavedState",
        "()Landroid/os/Parcelable;",
        "getState",
        "()Lcom/stripe/android/view/CardBrandView$State;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
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
            "Lcom/stripe/android/view/CardBrandView$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final state:Lcom/stripe/android/view/CardBrandView$State;

.field private final superSavedState:Landroid/os/Parcelable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/view/CardBrandView$SavedState$Creator;

    invoke-direct {v0}, Lcom/stripe/android/view/CardBrandView$SavedState$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/view/CardBrandView$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/view/CardBrandView$SavedState;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcelable;Lcom/stripe/android/view/CardBrandView$State;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 263
    iput-object p1, p0, Lcom/stripe/android/view/CardBrandView$SavedState;->superSavedState:Landroid/os/Parcelable;

    .line 264
    iput-object p2, p0, Lcom/stripe/android/view/CardBrandView$SavedState;->state:Lcom/stripe/android/view/CardBrandView$State;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/view/CardBrandView$SavedState;Landroid/os/Parcelable;Lcom/stripe/android/view/CardBrandView$State;ILjava/lang/Object;)Lcom/stripe/android/view/CardBrandView$SavedState;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/view/CardBrandView$SavedState;->superSavedState:Landroid/os/Parcelable;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/view/CardBrandView$SavedState;->state:Lcom/stripe/android/view/CardBrandView$State;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/view/CardBrandView$SavedState;->copy(Landroid/os/Parcelable;Lcom/stripe/android/view/CardBrandView$State;)Lcom/stripe/android/view/CardBrandView$SavedState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Landroid/os/Parcelable;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView$SavedState;->superSavedState:Landroid/os/Parcelable;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/view/CardBrandView$State;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView$SavedState;->state:Lcom/stripe/android/view/CardBrandView$State;

    return-object v0
.end method

.method public final copy(Landroid/os/Parcelable;Lcom/stripe/android/view/CardBrandView$State;)Lcom/stripe/android/view/CardBrandView$SavedState;
    .locals 1

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/view/CardBrandView$SavedState;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/view/CardBrandView$SavedState;-><init>(Landroid/os/Parcelable;Lcom/stripe/android/view/CardBrandView$State;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/view/CardBrandView$SavedState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/view/CardBrandView$SavedState;

    iget-object v1, p0, Lcom/stripe/android/view/CardBrandView$SavedState;->superSavedState:Landroid/os/Parcelable;

    iget-object v3, p1, Lcom/stripe/android/view/CardBrandView$SavedState;->superSavedState:Landroid/os/Parcelable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/view/CardBrandView$SavedState;->state:Lcom/stripe/android/view/CardBrandView$State;

    iget-object p1, p1, Lcom/stripe/android/view/CardBrandView$SavedState;->state:Lcom/stripe/android/view/CardBrandView$State;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getState()Lcom/stripe/android/view/CardBrandView$State;
    .locals 1

    .line 264
    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView$SavedState;->state:Lcom/stripe/android/view/CardBrandView$State;

    return-object v0
.end method

.method public final getSuperSavedState()Landroid/os/Parcelable;
    .locals 1

    .line 263
    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView$SavedState;->superSavedState:Landroid/os/Parcelable;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView$SavedState;->superSavedState:Landroid/os/Parcelable;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/view/CardBrandView$SavedState;->state:Lcom/stripe/android/view/CardBrandView$State;

    invoke-virtual {v1}, Lcom/stripe/android/view/CardBrandView$State;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView$SavedState;->superSavedState:Landroid/os/Parcelable;

    iget-object v1, p0, Lcom/stripe/android/view/CardBrandView$SavedState;->state:Lcom/stripe/android/view/CardBrandView$State;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "SavedState(superSavedState="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", state="

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

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView$SavedState;->superSavedState:Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/stripe/android/view/CardBrandView$SavedState;->state:Lcom/stripe/android/view/CardBrandView$State;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/view/CardBrandView$State;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
