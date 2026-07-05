.class public final Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3;
.super Lkotlin/jvm/internal/Lambda;
.source "LazyDsl.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2;->invoke(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function4<",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "Ljava/lang/Integer;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4\n+ 2 NewPaymentMethodTabLayoutUI.kt\ncom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,433:1\n75#2,14:434\n92#2:454\n1225#3,6:448\n*S KotlinDebug\n*F\n+ 1 NewPaymentMethodTabLayoutUI.kt\ncom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2\n*L\n88#1:448,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "it",
        "",
        "invoke",
        "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V",
        "androidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $imageLoader$inlined:Lcom/stripe/android/uicore/image/StripeImageLoader;

.field final synthetic $incentive$inlined:Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;

.field final synthetic $isEnabled$inlined:Z

.field final synthetic $items:Ljava/util/List;

.field final synthetic $onItemSelectedListener$inlined:Lkotlin/jvm/functions/Function1;

.field final synthetic $paymentMethods$inlined:Ljava/util/List;

.field final synthetic $selectedIndex$inlined:I

.field final synthetic $viewWidth$inlined:F


# direct methods
.method public constructor <init>(Ljava/util/List;ILcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;FLcom/stripe/android/uicore/image/StripeImageLoader;ZLkotlin/jvm/functions/Function1;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3;->$items:Ljava/util/List;

    iput p2, p0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3;->$selectedIndex$inlined:I

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3;->$incentive$inlined:Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;

    iput p4, p0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3;->$viewWidth$inlined:F

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3;->$imageLoader$inlined:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iput-boolean p6, p0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3;->$isEnabled$inlined:Z

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3;->$onItemSelectedListener$inlined:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3;->$paymentMethods$inlined:Ljava/util/List;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 188
    check-cast p1, Landroidx/compose/foundation/lazy/LazyItemScope;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v12, p3

    const-string v2, "C188@8866L26:LazyDsl.kt#428nma"

    invoke-static {v12, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_1

    move-object/from16 v2, p1

    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit8 v3, p4, 0x30

    const/16 v4, 0x20

    if-nez v3, :cond_3

    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v4

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v2, 0x93

    const/16 v5, 0x92

    if-ne v3, v5, :cond_5

    .line 189
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    :cond_5
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, -0x1

    const-string v5, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)"

    const v6, -0x410876af

    invoke-static {v6, v2, v3, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_6
    iget-object v3, v0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3;->$items:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;

    const v5, -0x3fd84b61

    .line 434
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 435
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v5, Landroidx/compose/ui/Modifier;

    .line 436
    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "PaymentMethodsUITestTag"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 435
    invoke-static {v5, v6}, Landroidx/compose/ui/platform/TestTagKt;->testTag(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/4 v5, 0x0

    move v6, v2

    .line 439
    invoke-virtual {v3, v12, v5}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->icon(Landroidx/compose/runtime/Composer;I)I

    move-result v2

    move-object v7, v3

    .line 440
    invoke-virtual {v7, v12, v5}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->iconUrl(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    .line 442
    invoke-virtual {v7}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getDisplayName()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v8

    invoke-static {v8, v12, v5}, Lcom/stripe/android/uicore/strings/ResolvableStringComposeUtilsKt;->resolve(Lcom/stripe/android/core/strings/ResolvableString;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    .line 443
    iget v9, v0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3;->$selectedIndex$inlined:I

    move v13, v5

    if-ne v1, v9, :cond_7

    move v9, v6

    const/4 v6, 0x1

    goto :goto_4

    :cond_7
    move v9, v6

    move v6, v13

    :goto_4
    move-object v5, v8

    .line 445
    invoke-virtual {v7}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getIconRequiresTinting()Z

    move-result v8

    .line 446
    iget-object v14, v0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3;->$incentive$inlined:Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;

    if-eqz v14, :cond_8

    invoke-virtual {v7}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v14, v7}, Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;->takeIfMatches(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;

    move-result-object v7

    if-eqz v7, :cond_8

    invoke-virtual {v7}, Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;->getDisplayText()Ljava/lang/String;

    move-result-object v7

    goto :goto_5

    :cond_8
    const/4 v7, 0x0

    .line 438
    :goto_5
    iget v14, v0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3;->$viewWidth$inlined:F

    .line 441
    iget-object v15, v0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3;->$imageLoader$inlined:Lcom/stripe/android/uicore/image/StripeImageLoader;

    move/from16 v16, v9

    move-object v9, v7

    .line 444
    iget-boolean v7, v0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3;->$isEnabled$inlined:Z

    const v11, 0x400199cd

    .line 435
    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    iget-object v11, v0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3;->$onItemSelectedListener$inlined:Lkotlin/jvm/functions/Function1;

    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    iget-object v13, v0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3;->$paymentMethods$inlined:Ljava/util/List;

    invoke-interface {v12, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v11, v13

    and-int/lit8 v13, v16, 0x70

    xor-int/lit8 v13, v13, 0x30

    if-le v13, v4, :cond_9

    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v13

    if-nez v13, :cond_a

    :cond_9
    and-int/lit8 v13, v16, 0x30

    if-ne v13, v4, :cond_b

    :cond_a
    const/4 v4, 0x1

    goto :goto_6

    :cond_b
    const/4 v4, 0x0

    :goto_6
    or-int/2addr v4, v11

    .line 448
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v11

    if-nez v4, :cond_c

    .line 449
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v11, v4, :cond_d

    .line 447
    :cond_c
    new-instance v4, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$1$1$1$1$1;

    iget-object v11, v0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3;->$onItemSelectedListener$inlined:Lkotlin/jvm/functions/Function1;

    iget-object v13, v0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3;->$paymentMethods$inlined:Ljava/util/List;

    invoke-direct {v4, v11, v13, v1}, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$2$1$1$1$1$1;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;I)V

    move-object v11, v4

    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 451
    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 447
    :cond_d
    check-cast v11, Lkotlin/jvm/functions/Function0;

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    sget v1, Lcom/stripe/android/uicore/image/StripeImageLoader;->$stable:I

    shl-int/lit8 v13, v1, 0x9

    move v1, v14

    const/4 v14, 0x0

    move-object v4, v15

    const/4 v15, 0x0

    .line 434
    invoke-static/range {v1 .. v15}, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabKt;->NewPaymentMethodTab-jFuDa88(FILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;ZZZLjava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V

    invoke-interface/range {p3 .. p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 189
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_e
    return-void
.end method
