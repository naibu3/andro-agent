.class public final Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;
.super Lcom/stripe/android/customersheet/CustomerSheetViewState;
.source "CustomerSheetViewState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/CustomerSheetViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "UpdatePaymentMethod"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0016\u0010\u000b\u001a\u00020\u000c2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\n\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;",
        "Lcom/stripe/android/customersheet/CustomerSheetViewState;",
        "updatePaymentMethodInteractor",
        "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;",
        "isLiveMode",
        "",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Z)V",
        "getUpdatePaymentMethodInteractor",
        "()Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;",
        "()Z",
        "topBarState",
        "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;",
        "onEditIconPressed",
        "Lkotlin/Function0;",
        "",
        "component1",
        "component2",
        "copy",
        "equals",
        "other",
        "",
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
.field private final isLiveMode:Z

.field private final updatePaymentMethodInteractor:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Z)V
    .locals 3

    const-string v0, "updatePaymentMethodInteractor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 129
    invoke-direct {p0, p2, v2, v0, v1}, Lcom/stripe/android/customersheet/CustomerSheetViewState;-><init>(ZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 127
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;->updatePaymentMethodInteractor:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;

    .line 128
    iput-boolean p2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;->isLiveMode:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;ZILjava/lang/Object;)Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;->updatePaymentMethodInteractor:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;->isLiveMode:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;->copy(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Z)Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;->updatePaymentMethodInteractor:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;->isLiveMode:Z

    return v0
.end method

.method public final copy(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Z)Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;
    .locals 1

    const-string v0, "updatePaymentMethodInteractor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;-><init>(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;->updatePaymentMethodInteractor:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;->updatePaymentMethodInteractor:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;->isLiveMode:Z

    iget-boolean p1, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;->isLiveMode:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getUpdatePaymentMethodInteractor()Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;->updatePaymentMethodInteractor:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;->updatePaymentMethodInteractor:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;->isLiveMode:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public isLiveMode()Z
    .locals 1

    .line 128
    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;->isLiveMode:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;->updatePaymentMethodInteractor:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;

    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;->isLiveMode:Z

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "UpdatePaymentMethod(updatePaymentMethodInteractor="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", isLiveMode="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public topBarState(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;"
        }
    .end annotation

    const-string v0, "onEditIconPressed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    sget-object p1, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateFactory;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateFactory;

    .line 136
    invoke-virtual {p0}, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;->isLiveMode()Z

    move-result v0

    .line 137
    sget-object v1, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable$Never;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable$Never;

    check-cast v1, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable;

    .line 135
    invoke-virtual {p1, v0, v1}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateFactory;->create(ZLcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable;)Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    move-result-object p1

    return-object p1
.end method
