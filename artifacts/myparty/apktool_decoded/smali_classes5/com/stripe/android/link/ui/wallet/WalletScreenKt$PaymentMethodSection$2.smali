.class final Lcom/stripe/android/link/ui/wallet/WalletScreenKt$PaymentMethodSection$2;
.super Ljava/lang/Object;
.source "WalletScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->PaymentMethodSection(Lcom/stripe/android/link/ui/wallet/WalletUiState;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function3<",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWalletScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt$PaymentMethodSection$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,835:1\n1225#2,6:836\n*S KotlinDebug\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt$PaymentMethodSection$2\n*L\n408#1:836,6\n*E\n"
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
.field final synthetic $labelMaxWidthDp:F

.field final synthetic $onExpandedChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $paymentLabel:Ljava/lang/String;

.field final synthetic $state:Lcom/stripe/android/link/ui/wallet/WalletUiState;


# direct methods
.method public static synthetic $r8$lambda$lrKsOoheEvYGk6-K_eR7ozpqrP8(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$PaymentMethodSection$2;->invoke$lambda$1$lambda$0(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/lang/String;FLkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/wallet/WalletUiState;",
            "Ljava/lang/String;",
            "F",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$PaymentMethodSection$2;->$state:Lcom/stripe/android/link/ui/wallet/WalletUiState;

    iput-object p2, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$PaymentMethodSection$2;->$paymentLabel:Ljava/lang/String;

    iput p3, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$PaymentMethodSection$2;->$labelMaxWidthDp:F

    iput-object p4, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$PaymentMethodSection$2;->$onExpandedChanged:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 1

    const/4 v0, 0x1

    .line 409
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 402
    check-cast p1, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$PaymentMethodSection$2;->invoke(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    const-string v0, "selectedItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.link.ui.wallet.PaymentMethodSection.<anonymous> (WalletScreen.kt:402)"

    const v2, -0x63655f82

    .line 403
    invoke-static {v2, p3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 405
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$PaymentMethodSection$2;->$state:Lcom/stripe/android/link/ui/wallet/WalletUiState;

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getPrimaryButtonState()Lcom/stripe/android/link/ui/PrimaryButtonState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/PrimaryButtonState;->isBlocking()Z

    move-result v0

    xor-int/lit8 v2, v0, 0x1

    .line 406
    iget-object v3, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$PaymentMethodSection$2;->$paymentLabel:Ljava/lang/String;

    .line 407
    iget v4, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$PaymentMethodSection$2;->$labelMaxWidthDp:F

    const v0, -0x79625148

    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$PaymentMethodSection$2;->$onExpandedChanged:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    .line 408
    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$PaymentMethodSection$2;->$onExpandedChanged:Lkotlin/jvm/functions/Function1;

    .line 836
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_1

    .line 837
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v5, v0, :cond_2

    .line 408
    :cond_1
    new-instance v5, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$PaymentMethodSection$2$$ExternalSyntheticLambda0;

    invoke-direct {v5, v1}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$PaymentMethodSection$2$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 839
    invoke-interface {p2, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 408
    :cond_2
    check-cast v5, Lkotlin/jvm/functions/Function0;

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    and-int/lit8 v7, p3, 0xe

    move-object v1, p1

    move-object v6, p2

    .line 403
    invoke-static/range {v1 .. v7}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt;->access$CollapsedPaymentDetails--jt2gSs(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZLjava/lang/String;FLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    return-void
.end method
