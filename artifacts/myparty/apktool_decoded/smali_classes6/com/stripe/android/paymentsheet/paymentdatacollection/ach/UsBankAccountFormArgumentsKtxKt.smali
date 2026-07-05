.class public final Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/UsBankAccountFormArgumentsKtxKt;
.super Ljava/lang/Object;
.source "UsBankAccountFormArgumentsKtx.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0008H\u0000\u001a2\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00082\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a8\u0006\u000e"
    }
    d2 = {
        "handleScreenStateChanged",
        "",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;",
        "screenState",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;",
        "enabled",
        "",
        "onPrimaryButtonClick",
        "Lkotlin/Function0;",
        "updatePrimaryButton",
        "text",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "onClick",
        "shouldShowProcessingWhenClicked",
        "paymentsheet_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic $r8$lambda$-IrKdUNaan4Dq-bHgMWvLZn67Qw(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/UsBankAccountFormArgumentsKtxKt;->updatePrimaryButton$lambda$4$lambda$3$lambda$2(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$GWE5Q9tRV1fUCErpeVCECbjxQFw(ZLcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/UsBankAccountFormArgumentsKtxKt;->updatePrimaryButton$lambda$4$lambda$3(ZLcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$jinnWjBkNBPFewFoUFf-xhLGehY(Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;ZLkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/UsBankAccountFormArgumentsKtxKt;->updatePrimaryButton$lambda$4(Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;ZLkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$tGGsMkJwV2F4ZTMxVytp2IP2Gr4(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/UsBankAccountFormArgumentsKtxKt;->handleScreenStateChanged$lambda$1(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    move-result-object p0

    return-object p0
.end method

.method public static final handleScreenStateChanged(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;ZLkotlin/jvm/functions/Function0;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screenState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPrimaryButtonClick"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;->getError()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 14
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;->getOnError()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;->getLinkedBankAccount()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    .line 19
    sget v0, Lcom/stripe/android/ui/core/R$string;->stripe_continue_button_label:I

    new-array v3, v1, [Ljava/lang/Object;

    const/4 v4, 0x4

    invoke-static {v0, v3, v2, v4, v2}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    .line 22
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;->isCompleteFlow()Z

    move-result v3

    .line 18
    invoke-static {p0, v0, p3, v3, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/UsBankAccountFormArgumentsKtxKt;->updatePrimaryButton(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/core/strings/ResolvableString;Lkotlin/jvm/functions/Function0;ZZ)V

    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;->getOnUpdatePrimaryButtonUIState()Lkotlin/jvm/functions/Function1;

    move-result-object p2

    new-instance p3, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/UsBankAccountFormArgumentsKtxKt$$ExternalSyntheticLambda1;

    invoke-direct {p3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/UsBankAccountFormArgumentsKtxKt$$ExternalSyntheticLambda1;-><init>()V

    invoke-interface {p2, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;->getOnMandateTextChanged()Lkotlin/jvm/functions/Function2;

    move-result-object p0

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState;->getLinkedBankAccount()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/BankFormScreenState$LinkedBankAccount;->getMandateText()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v2

    :cond_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, v2, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final handleScreenStateChanged$lambda$1(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method private static final updatePrimaryButton(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/core/strings/ResolvableString;Lkotlin/jvm/functions/Function0;ZZ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;ZZ)V"
        }
    .end annotation

    .line 38
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;->getOnUpdatePrimaryButtonUIState()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/UsBankAccountFormArgumentsKtxKt$$ExternalSyntheticLambda3;

    move-object v4, p0

    move-object v2, p1

    move-object v6, p2

    move v5, p3

    move v3, p4

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/UsBankAccountFormArgumentsKtxKt$$ExternalSyntheticLambda3;-><init>(Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;ZLkotlin/jvm/functions/Function0;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final updatePrimaryButton$lambda$4(Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;ZLkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;
    .locals 1

    .line 39
    new-instance p5, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    .line 41
    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/UsBankAccountFormArgumentsKtxKt$$ExternalSyntheticLambda2;

    invoke-direct {v0, p3, p2, p4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/UsBankAccountFormArgumentsKtxKt$$ExternalSyntheticLambda2;-><init>(ZLcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lkotlin/jvm/functions/Function0;)V

    .line 51
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;->isCompleteFlow()Z

    move-result p2

    .line 39
    invoke-direct {p5, p0, v0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;-><init>(Lcom/stripe/android/core/strings/ResolvableString;Lkotlin/jvm/functions/Function0;ZZ)V

    return-object p5
.end method

.method private static final updatePrimaryButton$lambda$4$lambda$3(ZLcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 1

    if-eqz p0, :cond_0

    .line 43
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;->getOnUpdatePrimaryButtonState()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    sget-object v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    :cond_0
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 46
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;->getOnUpdatePrimaryButtonUIState()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    new-instance p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/UsBankAccountFormArgumentsKtxKt$$ExternalSyntheticLambda0;

    invoke-direct {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/UsBankAccountFormArgumentsKtxKt$$ExternalSyntheticLambda0;-><init>()V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final updatePrimaryButton$lambda$4$lambda$3$lambda$2(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;
    .locals 7

    if-eqz p0, :cond_0

    const/16 v5, 0xb

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    .line 47
    invoke-static/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;->copy$default(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/core/strings/ResolvableString;Lkotlin/jvm/functions/Function0;ZZILjava/lang/Object;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
