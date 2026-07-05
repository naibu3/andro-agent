.class final Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3;
.super Ljava/lang/Object;
.source "CustomerSheetScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt;->AddPaymentMethod(Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nCustomerSheetScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerSheetScreen.kt\ncom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,368:1\n1225#2,6:369\n1225#2,6:375\n*S KotlinDebug\n*F\n+ 1 CustomerSheetScreen.kt\ncom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3\n*L\n253#1:369,6\n259#1:375,6\n*E\n"
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

.field final synthetic $viewState:Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;


# direct methods
.method public static synthetic $r8$lambda$94vdJvLaZsVEJG8pR0X3ybs3oKQ(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3;->invoke$lambda$1$lambda$0(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$DBkVz4GlB2sHP7TL1gcr2ZEzep0(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3;->invoke$lambda$3$lambda$2(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/customersheet/CustomerSheetViewAction;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3;->$viewState:Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    iput-object p2, p0, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3;->$viewActionHandler:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 254
    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnAddPaymentMethodItemChanged;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnAddPaymentMethodItemChanged;-><init>(Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final invoke$lambda$3$lambda$2(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;)Lkotlin/Unit;
    .locals 1

    .line 261
    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnFormFieldValuesCompleted;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewAction$OnFormFieldValuesCompleted;-><init>(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 247
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v12, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 248
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 263
    :cond_0
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 248
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.customersheet.ui.AddPaymentMethod.<anonymous> (CustomerSheetScreen.kt:247)"

    const v4, 0x2e6d1868

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 249
    :cond_2
    iget-object v1, v0, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3;->$viewState:Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getEnabled()Z

    move-result v1

    .line 250
    iget-object v2, v0, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3;->$viewState:Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    invoke-virtual {v2}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getSupportedPaymentMethods()Ljava/util/List;

    move-result-object v2

    .line 251
    iget-object v3, v0, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3;->$viewState:Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    invoke-virtual {v3}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getPaymentMethodCode()Ljava/lang/String;

    move-result-object v3

    .line 252
    iget-object v4, v0, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3;->$viewState:Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    invoke-virtual {v4}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getFormElements()Ljava/util/List;

    move-result-object v5

    .line 256
    iget-object v4, v0, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3;->$viewState:Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    invoke-virtual {v4}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getFormArguments()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v7

    .line 257
    iget-object v4, v0, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3;->$viewState:Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    invoke-virtual {v4}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->getUsBankAccountFormArguments()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;

    move-result-object v8

    const v4, 0x37cf87f3

    .line 252
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v4, v0, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3;->$viewActionHandler:Lkotlin/jvm/functions/Function1;

    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    .line 253
    iget-object v6, v0, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3;->$viewActionHandler:Lkotlin/jvm/functions/Function1;

    .line 369
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    if-nez v4, :cond_3

    .line 370
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v9, v4, :cond_4

    .line 253
    :cond_3
    new-instance v9, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3$$ExternalSyntheticLambda0;

    invoke-direct {v9, v6}, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 372
    invoke-interface {v12, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 253
    :cond_4
    move-object v6, v9

    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v4, 0x37cfb220

    .line 257
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v4, v0, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3;->$viewActionHandler:Lkotlin/jvm/functions/Function1;

    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    .line 259
    iget-object v9, v0, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3;->$viewActionHandler:Lkotlin/jvm/functions/Function1;

    .line 375
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    if-nez v4, :cond_5

    .line 376
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v10, v4, :cond_6

    .line 259
    :cond_5
    new-instance v10, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3$$ExternalSyntheticLambda1;

    invoke-direct {v10, v9}, Lcom/stripe/android/customersheet/ui/CustomerSheetScreenKt$AddPaymentMethod$3$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 378
    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 259
    :cond_6
    move-object v9, v10

    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v14, 0x0

    const/16 v15, 0x600

    const/4 v4, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v13, 0xc00

    .line 248
    invoke-static/range {v1 .. v15}, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt;->PaymentElement(ZLjava/util/List;Ljava/lang/String;Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_7
    return-void
.end method
