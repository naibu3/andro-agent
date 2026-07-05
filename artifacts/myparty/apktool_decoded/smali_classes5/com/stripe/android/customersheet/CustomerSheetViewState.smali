.class public abstract Lcom/stripe/android/customersheet/CustomerSheetViewState;
.super Ljava/lang/Object;
.source "CustomerSheetViewState.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;,
        Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;,
        Lcom/stripe/android/customersheet/CustomerSheetViewState$SelectPaymentMethod;,
        Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u00002\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B!\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\u000b2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH&J\u0006\u0010\u000f\u001a\u00020\u0003R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0008R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u0008R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008\u0082\u0001\u0004\u0014\u0015\u0016\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerSheetViewState;",
        "",
        "isLiveMode",
        "",
        "isProcessing",
        "canNavigateBack",
        "<init>",
        "(ZZZ)V",
        "()Z",
        "getCanNavigateBack",
        "topBarState",
        "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;",
        "onEditIconPressed",
        "Lkotlin/Function0;",
        "",
        "shouldDisplayDismissConfirmationModal",
        "Loading",
        "SelectPaymentMethod",
        "AddPaymentMethod",
        "UpdatePaymentMethod",
        "Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;",
        "Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;",
        "Lcom/stripe/android/customersheet/CustomerSheetViewState$SelectPaymentMethod;",
        "Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;",
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


# instance fields
.field private final canNavigateBack:Z

.field private final isLiveMode:Z

.field private final isProcessing:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(ZZZ)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-boolean p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState;->isLiveMode:Z

    .line 23
    iput-boolean p2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState;->isProcessing:Z

    .line 24
    iput-boolean p3, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState;->canNavigateBack:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/customersheet/CustomerSheetViewState;-><init>(ZZZ)V

    return-void
.end method


# virtual methods
.method public getCanNavigateBack()Z
    .locals 1

    .line 24
    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState;->canNavigateBack:Z

    return v0
.end method

.method public isLiveMode()Z
    .locals 1

    .line 22
    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState;->isLiveMode:Z

    return v0
.end method

.method public isProcessing()Z
    .locals 1

    .line 23
    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState;->isProcessing:Z

    return v0
.end method

.method public final shouldDisplayDismissConfirmationModal()Z
    .locals 4

    .line 30
    instance-of v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$Loading;

    const/4 v1, 0x0

    if-nez v0, :cond_3

    .line 31
    instance-of v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;

    if-nez v0, :cond_3

    .line 32
    instance-of v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$SelectPaymentMethod;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 35
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    if-eqz v0, :cond_2

    .line 36
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getPaymentMethodCode()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/stripe/android/model/PaymentMethod$Type;->USBankAccount:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v3, v3, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getBankAccountSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1

    .line 29
    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_3
    :goto_0
    return v1
.end method

.method public abstract topBarState(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;"
        }
    .end annotation
.end method
