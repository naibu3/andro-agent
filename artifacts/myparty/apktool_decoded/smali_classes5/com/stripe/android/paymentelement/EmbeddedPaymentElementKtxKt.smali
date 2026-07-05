.class public final Lcom/stripe/android/paymentelement/EmbeddedPaymentElementKtxKt;
.super Ljava/lang/Object;
.source "EmbeddedPaymentElementKtx.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEmbeddedPaymentElementKtx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmbeddedPaymentElementKtx.kt\ncom/stripe/android/paymentelement/EmbeddedPaymentElementKtxKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,88:1\n1225#2,6:89\n1225#2,6:96\n1225#2,6:102\n1225#2,6:108\n1225#2,6:114\n77#3:95\n81#4:120\n*S KotlinDebug\n*F\n+ 1 EmbeddedPaymentElementKtx.kt\ncom/stripe/android/paymentelement/EmbeddedPaymentElementKtxKt\n*L\n31#1:89,6\n40#1:96,6\n42#1:102,6\n46#1:108,6\n60#1:114,6\n35#1:95\n40#1:120\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005\u00b2\u0006\u0016\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0007X\u008a\u0084\u0002"
    }
    d2 = {
        "rememberEmbeddedPaymentElement",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;",
        "builder",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;",
        "(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;",
        "paymentsheet_release",
        "onResult",
        "Lkotlin/reflect/KFunction1;",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;",
        ""
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
.method public static synthetic $r8$lambda$3xv59sLDz6GJVyh8l-aLSI-zLvI()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElementKtxKt;->rememberEmbeddedPaymentElement$lambda$2$lambda$1()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$cXH0OUs4pJAgL3aTi05Wblq4Tbs()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElementKtxKt;->rememberEmbeddedPaymentElement$lambda$7$lambda$6()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final rememberEmbeddedPaymentElement(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;
    .locals 12

    const-string v0, "builder"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x6c545642

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentelement.rememberEmbeddedPaymentElement (EmbeddedPaymentElementKtx.kt:25)"

    .line 26
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 27
    :cond_0
    sget-object p2, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    sget v0, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->$stable:I

    invoke-virtual {p2, p1, v0}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object v4

    if-eqz v4, :cond_c

    const/4 p2, 0x0

    new-array v5, p2, [Ljava/lang/Object;

    const v0, -0x7d99ec02

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 89
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .line 90
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 91
    new-instance v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElementKtxKt$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElementKtxKt$$ExternalSyntheticLambda0;-><init>()V

    .line 92
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 31
    :cond_1
    move-object v8, v0

    check-cast v8, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/16 v10, 0xc00

    const/4 v11, 0x6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v9, p1

    invoke-static/range {v5 .. v11}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "rememberSaveable(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    .line 35
    invoke-static {}, Landroidx/lifecycle/compose/LocalLifecycleOwnerKt;->getLocalLifecycleOwner()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object p1

    check-cast p1, Landroidx/compose/runtime/CompositionLocal;

    const v0, 0x789c5f52

    const-string v1, "CC:CompositionLocal.kt#9igjgp"

    .line 95
    invoke-static {v9, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v9, p1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v9}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 35
    move-object v5, p1

    check-cast v5, Landroidx/lifecycle/LifecycleOwner;

    .line 36
    sget-object p1, Landroidx/activity/compose/LocalActivityResultRegistryOwner;->INSTANCE:Landroidx/activity/compose/LocalActivityResultRegistryOwner;

    sget v0, Landroidx/activity/compose/LocalActivityResultRegistryOwner;->$stable:I

    invoke-virtual {p1, v9, v0}, Landroidx/activity/compose/LocalActivityResultRegistryOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/activity/result/ActivityResultRegistryOwner;

    move-result-object p1

    if-eqz p1, :cond_b

    .line 40
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;->getResultCallback$paymentsheet_release()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;

    move-result-object v0

    const v1, -0x7d99c2ce

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    .line 96
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_2

    .line 97
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_3

    .line 40
    :cond_2
    new-instance v1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElementKtxKt$rememberEmbeddedPaymentElement$onResult$2$1;

    invoke-direct {v1, v0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElementKtxKt$rememberEmbeddedPaymentElement$onResult$2$1;-><init>(Ljava/lang/Object;)V

    move-object v2, v1

    check-cast v2, Lkotlin/reflect/KFunction;

    .line 99
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 40
    :cond_3
    check-cast v2, Lkotlin/reflect/KFunction;

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {v2, v9, p2}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v0

    const v1, -0x7d99b9b7

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 102
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 103
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_4

    .line 104
    new-instance v1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElementKtxKt$$ExternalSyntheticLambda1;

    invoke-direct {v1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElementKtxKt$$ExternalSyntheticLambda1;-><init>()V

    .line 105
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 42
    :cond_4
    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/4 v2, 0x6

    invoke-static {v1, v9, v2}, Lcom/stripe/android/utils/ComposeUtilsKt;->rememberActivity(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Landroid/app/Activity;

    move-result-object v2

    const v1, -0x7d99a89f

    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 108
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 109
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v1, v3, :cond_5

    .line 47
    sget-object v1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;->Companion:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Companion;

    .line 49
    new-instance v3, Lcom/stripe/android/common/ui/PaymentElementActivityResultCaller;

    .line 50
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "EmbeddedPaymentElement(instance = "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ")"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 49
    invoke-direct {v3, v7, p1}, Lcom/stripe/android/common/ui/PaymentElementActivityResultCaller;-><init>(Ljava/lang/String;Landroidx/activity/result/ActivityResultRegistryOwner;)V

    .line 56
    invoke-static {v0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElementKtxKt;->rememberEmbeddedPaymentElement$lambda$5(Landroidx/compose/runtime/State;)Lkotlin/reflect/KFunction;

    move-result-object p1

    new-instance v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElementKtxKt$sam$com_stripe_android_paymentelement_EmbeddedPaymentElement_ResultCallback$0;

    check-cast p1, Lkotlin/jvm/functions/Function1;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElementKtxKt$sam$com_stripe_android_paymentelement_EmbeddedPaymentElement_ResultCallback$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object v7, v0

    check-cast v7, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;

    .line 49
    check-cast v3, Landroidx/activity/result/ActivityResultCaller;

    .line 47
    invoke-virtual/range {v1 .. v7}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Companion;->create(Landroid/app/Activity;Landroidx/activity/result/ActivityResultCaller;Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/LifecycleOwner;Ljava/lang/String;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;)Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;

    move-result-object v1

    .line 111
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 46
    :cond_5
    check-cast v1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const p1, -0x7d995da8

    invoke-interface {v9, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 60
    invoke-interface {v9, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result p1

    .line 114
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_6

    .line 115
    sget-object p1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p1

    if-ne v0, p1, :cond_8

    .line 66
    :cond_6
    new-instance p1, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    invoke-direct {p1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;-><init>()V

    .line 68
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;->getDeferredHandler$paymentsheet_release()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler;

    move-result-object v0

    .line 69
    instance-of v2, v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler$Intent;

    if-eqz v2, :cond_7

    .line 70
    check-cast v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler$Intent;

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler$Intent;->getCreateIntentCallback()Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->createIntentCallback(Lcom/stripe/android/paymentsheet/CreateIntentCallback;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    goto :goto_0

    .line 72
    :cond_7
    instance-of v2, v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler$SharedPaymentToken;

    if-eqz v2, :cond_a

    .line 73
    check-cast v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler$SharedPaymentToken;

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler$SharedPaymentToken;->getPreparePaymentMethodHandler()Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->preparePaymentMethodHandler(Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    .line 77
    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;->getConfirmCustomPaymentMethodCallback$paymentsheet_release()Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->confirmCustomPaymentMethodCallback(Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    move-result-object p1

    .line 78
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;->getExternalPaymentMethodConfirmHandler$paymentsheet_release()Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->externalPaymentMethodConfirmHandler(Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    move-result-object p1

    .line 79
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;->getAnalyticEventCallback$paymentsheet_release()Lcom/stripe/android/paymentelement/AnalyticEventCallback;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->analyticEventCallback(Lcom/stripe/android/paymentelement/AnalyticEventCallback;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    move-result-object p1

    .line 80
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;->getRowSelectionBehavior$paymentsheet_release()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;

    move-result-object p0

    invoke-virtual {p1, p0, v1}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->rowSelectionImmediateActionCallback(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;)Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;

    move-result-object p0

    .line 81
    invoke-virtual {p0}, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;->build()Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;

    move-result-object v0

    .line 117
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 60
    :cond_8
    check-cast v0, Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 84
    invoke-static {v6, v0, v9, p2}, Lcom/stripe/android/common/ui/PaymentElementComposeKt;->UpdateCallbacks(Ljava/lang/String;Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_9
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-object v1

    .line 68
    :cond_a
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 36
    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "EmbeddedPaymentElement must have an ActivityResultRegistryOwner."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 27
    :cond_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "EmbeddedPaymentElement must have a ViewModelStoreOwner."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final rememberEmbeddedPaymentElement$lambda$2$lambda$1()Ljava/lang/String;
    .locals 1

    .line 32
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final rememberEmbeddedPaymentElement$lambda$5(Landroidx/compose/runtime/State;)Lkotlin/reflect/KFunction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lkotlin/reflect/KFunction<",
            "Lkotlin/Unit;",
            ">;>;)",
            "Lkotlin/reflect/KFunction<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 120
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/reflect/KFunction;

    return-object p0
.end method

.method private static final rememberEmbeddedPaymentElement$lambda$7$lambda$6()Ljava/lang/String;
    .locals 1

    .line 43
    const-string v0, "EmbeddedPaymentElement must be created in the context of an Activity."

    return-object v0
.end method
