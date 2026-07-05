.class public final Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor;
.super Ljava/lang/Object;
.source "BankFormInteractor.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB%\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000c\u001a\u00020\u00052\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004R\u001c\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor;",
        "",
        "updateSelection",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;",
        "",
        "paymentMethodIncentiveInteractor",
        "Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;)V",
        "getPaymentMethodIncentiveInteractor",
        "()Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;",
        "handleLinkedBankAccountChanged",
        "selection",
        "Companion",
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

.field public static final Companion:Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor$Companion;


# instance fields
.field private final paymentMethodIncentiveInteractor:Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;

.field private final updateSelection:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor;->Companion:Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor;->$stable:I

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;",
            ")V"
        }
    .end annotation

    const-string v0, "updateSelection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodIncentiveInteractor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor;->updateSelection:Lkotlin/jvm/functions/Function1;

    .line 8
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor;->paymentMethodIncentiveInteractor:Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;

    return-void
.end method


# virtual methods
.method public final getPaymentMethodIncentiveInteractor()Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor;->paymentMethodIncentiveInteractor:Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;

    return-object v0
.end method

.method public final handleLinkedBankAccountChanged(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;)V
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor;->updateSelection:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor;->paymentMethodIncentiveInteractor:Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;->setEligible(Z)V

    return-void
.end method
