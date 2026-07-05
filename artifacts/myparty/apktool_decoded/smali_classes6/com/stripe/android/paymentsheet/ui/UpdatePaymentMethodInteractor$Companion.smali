.class public final Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Companion;
.super Ljava/lang/Object;
.source "UpdatePaymentMethodInteractor.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Companion;",
        "",
        "<init>",
        "()V",
        "screenTitle",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "displayableSavedPaymentMethod",
        "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
        "expiredErrorMessage",
        "getExpiredErrorMessage",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Companion;

.field private static final expiredErrorMessage:Lcom/stripe/android/core/strings/ResolvableString;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Companion;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Companion;->$$INSTANCE:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Companion;

    .line 89
    sget v0, Lcom/stripe/android/R$string;->stripe_expired_card:I

    invoke-static {v0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Companion;->expiredErrorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getExpiredErrorMessage()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 89
    sget-object v0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Companion;->expiredErrorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final screenTitle(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 3

    const-string v0, "displayableSavedPaymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getSavedPaymentMethod()Lcom/stripe/android/paymentsheet/SavedPaymentMethod;

    move-result-object v0

    .line 71
    instance-of v1, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$SepaDebit;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    sget p1, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_manage_sepa_debit:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    .line 72
    :cond_0
    instance-of v1, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$USBankAccount;

    if-eqz v1, :cond_1

    sget p1, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_manage_bank_account:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    .line 73
    :cond_1
    instance-of v1, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Card;

    if-eqz v1, :cond_2

    sget p1, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_manage_card:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    .line 74
    :cond_2
    instance-of v1, v0, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Link;

    if-eqz v1, :cond_6

    .line 75
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethod;->getLinkPaymentDetails()Lcom/stripe/android/model/LinkPaymentDetails;

    move-result-object p1

    .line 76
    instance-of v0, p1, Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;

    if-eqz v0, :cond_3

    .line 77
    sget p1, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_manage_international_bank_account:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    .line 79
    :cond_3
    instance-of v0, p1, Lcom/stripe/android/model/LinkPaymentDetails$Card;

    if-eqz v0, :cond_4

    .line 80
    sget p1, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_manage_card:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :cond_4
    if-nez p1, :cond_5

    goto :goto_0

    .line 75
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 85
    :cond_6
    sget-object p1, Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Unexpected;->INSTANCE:Lcom/stripe/android/paymentsheet/SavedPaymentMethod$Unexpected;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    :goto_0
    move-object p1, v2

    :goto_1
    if-eqz p1, :cond_7

    .line 70
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 87
    invoke-static {p1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p1

    return-object p1

    :cond_7
    return-object v2

    .line 70
    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
