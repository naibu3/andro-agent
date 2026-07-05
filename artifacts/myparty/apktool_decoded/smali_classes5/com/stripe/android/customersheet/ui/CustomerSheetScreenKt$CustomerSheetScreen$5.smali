.class final Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$CustomerSheetScreen$5;
.super Ljava/lang/Object;
.source "CustomerSheetScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt;->CustomerSheetScreen(Lcom/stripe/android/customersheet/CustomerSheetViewState;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCustomerSheetScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerSheetScreen.kt\ncom/stripe/android/customersheet/ui/CustomerSheetScreenKt$CustomerSheetScreen$5\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,368:1\n1225#2,6:369\n1225#2,6:375\n*S KotlinDebug\n*F\n+ 1 CustomerSheetScreen.kt\ncom/stripe/android/customersheet/ui/CustomerSheetScreenKt$CustomerSheetScreen$5\n*L\n74#1:369,6\n79#1:375,6\n*E\n"
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
.field final synthetic $viewActionHandler:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/customersheet/CustomerSheetViewAction;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $viewState:Lcom/stripe/android/customersheet/CustomerSheetViewState;


# direct methods
.method public static synthetic $r8$lambda$RS-D4-UTk7tQX3HPOHUKxjuWPsY(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$CustomerSheetScreen$5;->invoke$lambda$1$lambda$0(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$dChqzYOmgbp8mh9inlFEi1SCDuQ(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$CustomerSheetScreen$5;->invoke$lambda$3$lambda$2(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/customersheet/CustomerSheetViewState;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/customersheet/CustomerSheetViewState;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/customersheet/CustomerSheetViewAction;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$CustomerSheetScreen$5;->$viewState:Lcom/stripe/android/customersheet/CustomerSheetViewState;

    iput-object p2, p0, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$CustomerSheetScreen$5;->$viewActionHandler:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 1

    .line 75
    sget-object v0, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnEditPressed;->INSTANCE:Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnEditPressed;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invoke$lambda$3$lambda$2(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 1

    .line 81
    sget-object v0, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnBackPressed;->INSTANCE:Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnBackPressed;

    .line 80
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 72
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$CustomerSheetScreen$5;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 11

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 73
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 84
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 73
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.customersheet.ui.CustomerSheetScreen.<anonymous> (CustomerSheetScreen.kt:72)"

    const v2, 0x393f7711

    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 74
    :cond_2
    iget-object p2, p0, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$CustomerSheetScreen$5;->$viewState:Lcom/stripe/android/customersheet/CustomerSheetViewState;

    const v0, -0x4cc7b10e

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v0, p0, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$CustomerSheetScreen$5;->$viewActionHandler:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$CustomerSheetScreen$5;->$viewActionHandler:Lkotlin/jvm/functions/Function1;

    .line 369
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_3

    .line 370
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_4

    .line 74
    :cond_3
    new-instance v2, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$CustomerSheetScreen$5$$ExternalSyntheticLambda0;

    invoke-direct {v2, v1}, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$CustomerSheetScreen$5$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 372
    invoke-interface {p1, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 74
    :cond_4
    check-cast v2, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-virtual {p2, v2}, Lcom/stripe/android/customersheet/CustomerSheetViewState;->topBarState(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    move-result-object v3

    .line 77
    iget-object p2, p0, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$CustomerSheetScreen$5;->$viewState:Lcom/stripe/android/customersheet/CustomerSheetViewState;

    invoke-virtual {p2}, Lcom/stripe/android/customersheet/CustomerSheetViewState;->getCanNavigateBack()Z

    move-result v4

    .line 78
    iget-object p2, p0, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$CustomerSheetScreen$5;->$viewState:Lcom/stripe/android/customersheet/CustomerSheetViewState;

    invoke-virtual {p2}, Lcom/stripe/android/customersheet/CustomerSheetViewState;->isProcessing()Z

    move-result p2

    xor-int/lit8 v5, p2, 0x1

    const p2, -0x4cc791e0

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object p2, p0, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$CustomerSheetScreen$5;->$viewActionHandler:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p2

    .line 79
    iget-object v0, p0, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$CustomerSheetScreen$5;->$viewActionHandler:Lkotlin/jvm/functions/Function1;

    .line 375
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    if-nez p2, :cond_5

    .line 376
    sget-object p2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p2

    if-ne v1, p2, :cond_6

    .line 79
    :cond_5
    new-instance v1, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$CustomerSheetScreen$5$$ExternalSyntheticLambda1;

    invoke-direct {v1, v0}, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$CustomerSheetScreen$5$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 378
    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 79
    :cond_6
    move-object v6, v1

    check-cast v6, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v9, 0x0

    const/16 v10, 0x10

    const/4 v7, 0x0

    move-object v8, p1

    .line 73
    invoke-static/range {v3 .. v10}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt;->PaymentSheetTopBar-FJfuzF0(Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;ZZLkotlin/jvm/functions/Function0;FLandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_7
    return-void
.end method
