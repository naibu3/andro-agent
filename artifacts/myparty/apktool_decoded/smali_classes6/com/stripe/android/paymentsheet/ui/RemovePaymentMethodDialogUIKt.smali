.class public final Lcom/stripe/android/paymentsheet/ui/RemovePaymentMethodDialogUIKt;
.super Ljava/lang/Object;
.source "RemovePaymentMethodDialogUI.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ui/RemovePaymentMethodDialogUIKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00052\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0005H\u0001\u00a2\u0006\u0002\u0010\u0007\u001a\u000c\u0010\u0008\u001a\u00020\t*\u00020\u0003H\u0002\u001a\u000c\u0010\n\u001a\u00020\t*\u00020\u0003H\u0002\u00a8\u0006\u000b"
    }
    d2 = {
        "RemovePaymentMethodDialogUI",
        "",
        "paymentMethod",
        "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
        "onConfirmListener",
        "Lkotlin/Function0;",
        "onDismissListener",
        "(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V",
        "getRemoveDialogTitle",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "getRemoveDialogDescription",
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
.method public static synthetic $r8$lambda$EnExV_NsKktWFfCojRZjfxAMRgQ(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/stripe/android/paymentsheet/ui/RemovePaymentMethodDialogUIKt;->RemovePaymentMethodDialogUI$lambda$0(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final RemovePaymentMethodDialogUI(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "paymentMethod"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onConfirmListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDismissListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x1815d610

    .line 19
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v8

    and-int/lit8 p3, p4, 0x6

    if-nez p3, :cond_1

    invoke-interface {v8, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p3, 0x4

    goto :goto_0

    :cond_0
    const/4 p3, 0x2

    :goto_0
    or-int/2addr p3, p4

    goto :goto_1

    :cond_1
    move p3, p4

    :goto_1
    and-int/lit8 v1, p4, 0x30

    if-nez v1, :cond_3

    invoke-interface {v8, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr p3, v1

    :cond_3
    and-int/lit16 v1, p4, 0x180

    if-nez v1, :cond_5

    invoke-interface {v8, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr p3, v1

    :cond_5
    and-int/lit16 v1, p3, 0x93

    const/16 v2, 0x92

    if-ne v1, v2, :cond_7

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_4

    .line 32
    :cond_6
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v6, p1

    move-object v7, p2

    goto :goto_5

    .line 19
    :cond_7
    :goto_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_8

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.ui.RemovePaymentMethodDialogUI (RemovePaymentMethodDialogUI.kt:18)"

    invoke-static {v0, p3, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 20
    :cond_8
    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/RemovePaymentMethodDialogUIKt;->getRemoveDialogTitle(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v8, v1}, Lcom/stripe/android/uicore/strings/ResolvableStringComposeUtilsKt;->resolve(Lcom/stripe/android/core/strings/ResolvableString;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    .line 21
    invoke-static {p0}, Lcom/stripe/android/paymentsheet/ui/RemovePaymentMethodDialogUIKt;->getRemoveDialogDescription(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v2

    invoke-static {v2, v8, v1}, Lcom/stripe/android/uicore/strings/ResolvableStringComposeUtilsKt;->resolve(Lcom/stripe/android/core/strings/ResolvableString;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    .line 26
    sget v3, Lcom/stripe/android/R$string;->stripe_remove:I

    invoke-static {v3, v8, v1}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    .line 27
    sget v4, Lcom/stripe/android/R$string;->stripe_cancel:I

    invoke-static {v4, v8, v1}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    shl-int/lit8 p3, p3, 0xc

    const/high16 v1, 0x70000

    and-int/2addr v1, p3

    or-int/lit16 v1, v1, 0x6000

    const/high16 v5, 0x380000

    and-int/2addr p3, v5

    or-int v9, v1, p3

    const/4 v10, 0x0

    const/4 v5, 0x1

    move-object v6, p1

    move-object v7, p2

    move-object v1, v0

    .line 23
    invoke-static/range {v1 .. v10}, Lcom/stripe/android/ui/core/elements/SimpleDialogElementUIKt;->SimpleDialogElementUI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 32
    :cond_9
    :goto_5
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p1

    if-eqz p1, :cond_a

    new-instance p2, Lcom/stripe/android/paymentsheet/ui/RemovePaymentMethodDialogUIKt$$ExternalSyntheticLambda0;

    invoke-direct {p2, p0, v6, v7, p4}, Lcom/stripe/android/paymentsheet/ui/RemovePaymentMethodDialogUIKt$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {p1, p2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_a
    return-void
.end method

.method private static final RemovePaymentMethodDialogUI$lambda$0(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lcom/stripe/android/paymentsheet/ui/RemovePaymentMethodDialogUIKt;->RemovePaymentMethodDialogUI(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final getRemoveDialogDescription(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 6

    .line 60
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/stripe/android/paymentsheet/ui/RemovePaymentMethodDialogUIKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/4 v1, 0x1

    const/4 v2, 0x4

    const/4 v3, 0x0

    if-eq v0, v1, :cond_9

    const/4 v1, 0x2

    const/4 v4, 0x0

    const-string v5, ""

    if-eq v0, v1, :cond_5

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    if-eq v0, v2, :cond_1

    .line 98
    new-array p0, v4, [Ljava/lang/Object;

    invoke-static {v5, p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString(Ljava/lang/String;[Ljava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 81
    :cond_1
    sget v0, Lcom/stripe/android/paymentsheet/R$string;->stripe_bank_account_with_last_4:I

    .line 82
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p0

    iget-object p0, p0, Lcom/stripe/android/model/PaymentMethod;->usBankAccount:Lcom/stripe/android/model/PaymentMethod$USBankAccount;

    if-eqz p0, :cond_2

    iget-object p0, p0, Lcom/stripe/android/model/PaymentMethod$USBankAccount;->last4:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object p0, v3

    :goto_1
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 80
    invoke-static {v0, p0, v3, v2, v3}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 77
    :cond_3
    sget v0, Lcom/stripe/android/paymentsheet/R$string;->stripe_bank_account_with_last_4:I

    .line 78
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p0

    iget-object p0, p0, Lcom/stripe/android/model/PaymentMethod;->sepaDebit:Lcom/stripe/android/model/PaymentMethod$SepaDebit;

    if-eqz p0, :cond_4

    iget-object p0, p0, Lcom/stripe/android/model/PaymentMethod$SepaDebit;->last4:Ljava/lang/String;

    goto :goto_2

    :cond_4
    move-object p0, v3

    :goto_2
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 76
    invoke-static {v0, p0, v3, v2, v3}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 85
    :cond_5
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentMethod;->getLinkPaymentDetails()Lcom/stripe/android/model/LinkPaymentDetails;

    move-result-object v0

    .line 86
    instance-of v1, v0, Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;

    if-eqz v1, :cond_6

    .line 87
    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_bank_account_with_last_4:I

    .line 88
    check-cast v0, Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;

    invoke-virtual {v0}, Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;->getLast4()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 86
    invoke-static {p0, v0, v3, v2, v3}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 90
    :cond_6
    instance-of v1, v0, Lcom/stripe/android/model/LinkPaymentDetails$Card;

    if-eqz v1, :cond_7

    .line 91
    sget v1, Lcom/stripe/android/R$string;->stripe_card_with_last_4:I

    .line 92
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->brandDisplayName()Ljava/lang/String;

    move-result-object p0

    .line 93
    check-cast v0, Lcom/stripe/android/model/LinkPaymentDetails$Card;

    invoke-virtual {v0}, Lcom/stripe/android/model/LinkPaymentDetails$Card;->getLast4()Ljava/lang/String;

    move-result-object v0

    filled-new-array {p0, v0}, [Ljava/lang/Object;

    move-result-object p0

    .line 90
    invoke-static {v1, p0, v3, v2, v3}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    :cond_7
    if-nez v0, :cond_8

    .line 95
    new-array p0, v4, [Ljava/lang/Object;

    invoke-static {v5, p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString(Ljava/lang/String;[Ljava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 85
    :cond_8
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 62
    :cond_9
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentMethod;->isLinkPaymentMethod()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 65
    sget v0, Lcom/stripe/android/paymentsheet/R$string;->stripe_bank_account_with_last_4:I

    .line 66
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentMethod;->getLinkPaymentDetails()Lcom/stripe/android/model/LinkPaymentDetails;

    move-result-object p0

    if-eqz p0, :cond_a

    invoke-interface {p0}, Lcom/stripe/android/model/LinkPaymentDetails;->getLast4()Ljava/lang/String;

    move-result-object p0

    goto :goto_3

    :cond_a
    move-object p0, v3

    :goto_3
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 64
    invoke-static {v0, p0, v3, v2, v3}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 70
    :cond_b
    sget v0, Lcom/stripe/android/R$string;->stripe_card_with_last_4:I

    .line 71
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->brandDisplayName()Ljava/lang/String;

    move-result-object v1

    .line 72
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p0

    iget-object p0, p0, Lcom/stripe/android/model/PaymentMethod;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    if-eqz p0, :cond_c

    iget-object p0, p0, Lcom/stripe/android/model/PaymentMethod$Card;->last4:Ljava/lang/String;

    goto :goto_4

    :cond_c
    move-object p0, v3

    :goto_4
    filled-new-array {v1, p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 69
    invoke-static {v0, p0, v3, v2, v3}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method

.method private static final getRemoveDialogTitle(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 6

    .line 34
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/stripe/android/paymentsheet/ui/RemovePaymentMethodDialogUIKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/4 v1, 0x1

    const/4 v2, 0x4

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eq v0, v1, :cond_6

    const/4 v1, 0x2

    const-string v5, ""

    if-eq v0, v1, :cond_2

    const/4 p0, 0x3

    if-eq v0, p0, :cond_1

    if-eq v0, v2, :cond_1

    .line 57
    new-array p0, v3, [Ljava/lang/Object;

    invoke-static {v5, p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString(Ljava/lang/String;[Ljava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 56
    :cond_1
    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_remove_bank_account_question_title:I

    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {p0, v0, v4, v2, v4}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 44
    :cond_2
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentMethod;->getLinkPaymentDetails()Lcom/stripe/android/model/LinkPaymentDetails;

    move-result-object p0

    .line 45
    instance-of v0, p0, Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;

    if-eqz v0, :cond_3

    .line 46
    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_remove_bank_account_question_title:I

    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {p0, v0, v4, v2, v4}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 48
    :cond_3
    instance-of v0, p0, Lcom/stripe/android/model/LinkPaymentDetails$Card;

    if-eqz v0, :cond_4

    .line 49
    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_remove_card_title:I

    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {p0, v0, v4, v2, v4}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    :cond_4
    if-nez p0, :cond_5

    .line 51
    new-array p0, v3, [Ljava/lang/Object;

    invoke-static {v5, p0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString(Ljava/lang/String;[Ljava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 44
    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 36
    :cond_6
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentMethod;->isLinkPaymentMethod()Z

    move-result p0

    if-eqz p0, :cond_7

    .line 38
    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_remove_bank_account_question_title:I

    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {p0, v0, v4, v2, v4}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0

    .line 40
    :cond_7
    sget p0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_remove_card_title:I

    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {p0, v0, v4, v2, v4}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p0

    return-object p0
.end method
