.class public final Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;
.super Ljava/lang/Object;
.source "EmbeddedPaymentElement.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "State"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B#\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;",
        "Landroid/os/Parcelable;",
        "confirmationState",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;",
        "customer",
        "Lcom/stripe/android/paymentsheet/state/CustomerState;",
        "previousNewSelections",
        "Landroid/os/Bundle;",
        "<init>",
        "(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;Lcom/stripe/android/paymentsheet/state/CustomerState;Landroid/os/Bundle;)V",
        "getConfirmationState$paymentsheet_release",
        "()Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;",
        "getCustomer$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/state/CustomerState;",
        "getPreviousNewSelections$paymentsheet_release",
        "()Landroid/os/Bundle;",
        "describeContents",
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
            "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final confirmationState:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;

.field private final customer:Lcom/stripe/android/paymentsheet/state/CustomerState;

.field private final previousNewSelections:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State$Creator;

    invoke-direct {v0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;Lcom/stripe/android/paymentsheet/state/CustomerState;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "confirmationState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previousNewSelections"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 681
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 682
    iput-object p1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;->confirmationState:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;

    .line 683
    iput-object p2, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;->customer:Lcom/stripe/android/paymentsheet/state/CustomerState;

    .line 684
    iput-object p3, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;->previousNewSelections:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
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
    instance-of v1, p1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;->confirmationState:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;

    iget-object v3, p1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;->confirmationState:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;->customer:Lcom/stripe/android/paymentsheet/state/CustomerState;

    iget-object v3, p1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;->customer:Lcom/stripe/android/paymentsheet/state/CustomerState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;->previousNewSelections:Landroid/os/Bundle;

    iget-object p1, p1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;->previousNewSelections:Landroid/os/Bundle;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getConfirmationState$paymentsheet_release()Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;
    .locals 1

    .line 682
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;->confirmationState:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;

    return-object v0
.end method

.method public final getCustomer$paymentsheet_release()Lcom/stripe/android/paymentsheet/state/CustomerState;
    .locals 1

    .line 683
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;->customer:Lcom/stripe/android/paymentsheet/state/CustomerState;

    return-object v0
.end method

.method public final getPreviousNewSelections$paymentsheet_release()Landroid/os/Bundle;
    .locals 1

    .line 684
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;->previousNewSelections:Landroid/os/Bundle;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;->confirmationState:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;->customer:Lcom/stripe/android/paymentsheet/state/CustomerState;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/state/CustomerState;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;->previousNewSelections:Landroid/os/Bundle;

    invoke-virtual {v1}, Landroid/os/Bundle;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;->confirmationState:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;->customer:Lcom/stripe/android/paymentsheet/state/CustomerState;

    iget-object v2, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;->previousNewSelections:Landroid/os/Bundle;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "State(confirmationState="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", customer="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", previousNewSelections="

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
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;->confirmationState:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationStateHolder$State;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;->customer:Lcom/stripe/android/paymentsheet/state/CustomerState;

    if-nez v0, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/state/CustomerState;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object p2, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;->previousNewSelections:Landroid/os/Bundle;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    return-void
.end method
