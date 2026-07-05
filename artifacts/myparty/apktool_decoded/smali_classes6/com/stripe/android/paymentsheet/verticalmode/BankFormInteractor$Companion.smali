.class public final Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor$Companion;
.super Ljava/lang/Object;
.source "BankFormInteractor.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor$Companion;",
        "",
        "<init>",
        "()V",
        "create",
        "Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor;",
        "viewModel",
        "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;)Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor;
    .locals 3

    const-string v0, "viewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    new-instance v0, Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor;

    .line 20
    new-instance v1, Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor$Companion$create$1;

    invoke-direct {v1, p1}, Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor$Companion$create$1;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 21
    sget-object v2, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;->Companion:Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor$Companion;

    invoke-virtual {v2, p1}, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor$Companion;->create(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;)Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;

    move-result-object p1

    .line 19
    invoke-direct {v0, v1, p1}, Lcom/stripe/android/paymentsheet/verticalmode/BankFormInteractor;-><init>(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodIncentiveInteractor;)V

    return-object v0
.end method
