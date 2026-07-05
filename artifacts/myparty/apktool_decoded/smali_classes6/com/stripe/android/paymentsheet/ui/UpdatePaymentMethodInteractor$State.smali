.class public final Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;
.super Ljava/lang/Object;
.source "UpdatePaymentMethodInteractor.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "State"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B)\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J3\u0010\u0015\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0010\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;",
        "",
        "error",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "status",
        "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;",
        "setAsDefaultCheckboxChecked",
        "",
        "isSaveButtonEnabled",
        "<init>",
        "(Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;ZZ)V",
        "getError",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "getStatus",
        "()Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;",
        "getSetAsDefaultCheckboxChecked",
        "()Z",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final error:Lcom/stripe/android/core/strings/ResolvableString;

.field private final isSaveButtonEnabled:Z

.field private final setAsDefaultCheckboxChecked:Z

.field private final status:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;ZZ)V
    .locals 1

    const-string v0, "status"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->error:Lcom/stripe/android/core/strings/ResolvableString;

    .line 48
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->status:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;

    .line 49
    iput-boolean p3, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->setAsDefaultCheckboxChecked:Z

    .line 50
    iput-boolean p4, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->isSaveButtonEnabled:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;ZZILjava/lang/Object;)Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->error:Lcom/stripe/android/core/strings/ResolvableString;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->status:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->setAsDefaultCheckboxChecked:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->isSaveButtonEnabled:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->copy(Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;ZZ)Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->error:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->status:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->setAsDefaultCheckboxChecked:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->isSaveButtonEnabled:Z

    return v0
.end method

.method public final copy(Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;ZZ)Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;
    .locals 1

    const-string v0, "status"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;-><init>(Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;ZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->error:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->error:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->status:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->status:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->setAsDefaultCheckboxChecked:Z

    iget-boolean v3, p1, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->setAsDefaultCheckboxChecked:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->isSaveButtonEnabled:Z

    iget-boolean p1, p1, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->isSaveButtonEnabled:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getError()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->error:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final getSetAsDefaultCheckboxChecked()Z
    .locals 1

    .line 49
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->setAsDefaultCheckboxChecked:Z

    return v0
.end method

.method public final getStatus()Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->status:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->error:Lcom/stripe/android/core/strings/ResolvableString;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->status:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->setAsDefaultCheckboxChecked:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->isSaveButtonEnabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isSaveButtonEnabled()Z
    .locals 1

    .line 50
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->isSaveButtonEnabled:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->error:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->status:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;

    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->setAsDefaultCheckboxChecked:Z

    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;->isSaveButtonEnabled:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "State(error="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", status="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", setAsDefaultCheckboxChecked="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isSaveButtonEnabled="

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
