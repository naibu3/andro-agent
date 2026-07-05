.class final Lcom/stripe/android/link/ui/wallet/WalletScreenKt$PaymentDetailsSection$1$2$1;
.super Ljava/lang/Object;
.source "WalletScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->PaymentDetailsSection(Landroidx/compose/ui/Modifier;Lcom/stripe/android/link/ui/wallet/WalletUiState;ZLcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $cvcController:Lcom/stripe/android/ui/core/elements/CvcController;

.field final synthetic $expiryDateController:Lcom/stripe/android/uicore/elements/TextFieldController;

.field final synthetic $selectedCard:Lcom/stripe/android/model/ConsumerPaymentDetails$Card;


# direct methods
.method constructor <init>(Lcom/stripe/android/model/ConsumerPaymentDetails$Card;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$PaymentDetailsSection$1$2$1;->$selectedCard:Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    iput-object p2, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$PaymentDetailsSection$1$2$1;->$expiryDateController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iput-object p3, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$PaymentDetailsSection$1$2$1;->$cvcController:Lcom/stripe/android/ui/core/elements/CvcController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 277
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$PaymentDetailsSection$1$2$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 278
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 283
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 278
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.link.ui.wallet.PaymentDetailsSection.<anonymous>.<anonymous>.<anonymous> (WalletScreen.kt:277)"

    const v2, -0x7063c6b

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 279
    :cond_2
    iget-object p2, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$PaymentDetailsSection$1$2$1;->$selectedCard:Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    .line 280
    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$PaymentDetailsSection$1$2$1;->$expiryDateController:Lcom/stripe/android/uicore/elements/TextFieldController;

    .line 281
    iget-object v2, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$PaymentDetailsSection$1$2$1;->$cvcController:Lcom/stripe/android/ui/core/elements/CvcController;

    .line 282
    invoke-virtual {p2}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isExpired()Z

    move-result v3

    sget p2, Lcom/stripe/android/ui/core/elements/CvcController;->$stable:I

    shl-int/lit8 v6, p2, 0x6

    const/16 v7, 0x10

    const/4 v4, 0x0

    move-object v5, p1

    .line 278
    invoke-static/range {v0 .. v7}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->CardDetailsRecollectionForm(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/ui/core/elements/CvcController;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method
