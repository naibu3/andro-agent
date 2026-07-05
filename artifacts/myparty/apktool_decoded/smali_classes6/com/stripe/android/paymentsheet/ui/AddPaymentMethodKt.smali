.class public final Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;
.super Ljava/lang/Object;
.source "AddPaymentMethod.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAddPaymentMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddPaymentMethod.kt\ncom/stripe/android/paymentsheet/ui/AddPaymentMethodKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,151:1\n1225#2,6:152\n1225#2,6:158\n1225#2,6:164\n81#3:170\n*S KotlinDebug\n*F\n+ 1 AddPaymentMethod.kt\ncom/stripe/android/paymentsheet/ui/AddPaymentMethodKt\n*L\n38#1:152,6\n47#1:158,6\n56#1:164,6\n30#1:170\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u0010\u0006\u001a \u0010\u0007\u001a\u00020\u0008*\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a&\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\u000c2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0000\u001a\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u0014*\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\u000cH\u0000\u001a\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000eH\u0000\"\u0016\u0010\u0019\u001a\u00020\u000b8\u0006X\u0087T\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c\u00b2\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002"
    }
    d2 = {
        "AddPaymentMethod",
        "",
        "interactor",
        "Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "transformToPaymentMethodCreateParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
        "paymentMethodCode",
        "",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "paymentMethodMetadata",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;",
        "transformToPaymentMethodOptionsParams",
        "Lcom/stripe/android/model/PaymentMethodOptionsParams;",
        "setupFutureUsage",
        "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;",
        "transformToExtraParams",
        "Lcom/stripe/android/model/PaymentMethodExtraParams;",
        "transformToPaymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "paymentMethod",
        "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;",
        "PAYMENT_SHEET_FORM_TEST_TAG",
        "getPAYMENT_SHEET_FORM_TEST_TAG$annotations",
        "()V",
        "paymentsheet_release",
        "state",
        "Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final PAYMENT_SHEET_FORM_TEST_TAG:Ljava/lang/String; = "PaymentSheetAddPaymentMethodForm"


# direct methods
.method public static synthetic $r8$lambda$2IL8pkTcozmgA9NY0DyijiYwUuw(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;Landroidx/compose/runtime/State;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$6$lambda$5(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;Landroidx/compose/runtime/State;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$3_BCwal2RPdjpG-YFIb9AoyJGI4(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;Landroidx/compose/runtime/State;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$4$lambda$3(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;Landroidx/compose/runtime/State;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$4TnGypf4IB4flBcuAued-GRzQNs(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$7(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$BiLteZYbcNtjabrSCP2Z4hW23-g(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$2$lambda$1(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final AddPaymentMethod(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p3

    move/from16 v2, p4

    const-string v3, "interactor"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, -0x412951fa

    move-object/from16 v4, p2

    .line 29
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v15

    and-int/lit8 v4, v2, 0x1

    const/4 v5, 0x4

    if-eqz v4, :cond_0

    or-int/lit8 v4, v1, 0x6

    goto :goto_2

    :cond_0
    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_3

    and-int/lit8 v4, v1, 0x8

    if-nez v4, :cond_1

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_0

    :cond_1
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    :goto_0
    if-eqz v4, :cond_2

    move v4, v5

    goto :goto_1

    :cond_2
    const/4 v4, 0x2

    :goto_1
    or-int/2addr v4, v1

    goto :goto_2

    :cond_3
    move v4, v1

    :goto_2
    and-int/lit8 v6, v2, 0x2

    if-eqz v6, :cond_4

    or-int/lit8 v4, v4, 0x30

    goto :goto_4

    :cond_4
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_6

    move-object/from16 v7, p1

    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_3

    :cond_5
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v4, v8

    goto :goto_5

    :cond_6
    :goto_4
    move-object/from16 v7, p1

    :goto_5
    and-int/lit8 v8, v4, 0x13

    const/16 v9, 0x12

    if-ne v8, v9, :cond_8

    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v8

    if-nez v8, :cond_7

    goto :goto_6

    .line 64
    :cond_7
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v3, v7

    goto/16 :goto_e

    :cond_8
    :goto_6
    if-eqz v6, :cond_9

    .line 28
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v6, Landroidx/compose/ui/Modifier;

    goto :goto_7

    :cond_9
    move-object v6, v7

    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v7

    if-eqz v7, :cond_a

    const/4 v7, -0x1

    const-string v8, "com.stripe.android.paymentsheet.ui.AddPaymentMethod (AddPaymentMethod.kt:28)"

    .line 29
    invoke-static {v3, v4, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 30
    :cond_a
    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;->getState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-static {v3, v7, v15, v8, v9}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v3

    .line 33
    invoke-static {v3}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;->getProcessing()Z

    move-result v7

    xor-int/2addr v7, v9

    .line 34
    invoke-static {v3}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;

    move-result-object v10

    invoke-virtual {v10}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;->getSupportedPaymentMethods()Ljava/util/List;

    move-result-object v10

    .line 35
    invoke-static {v3}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;

    move-result-object v11

    invoke-virtual {v11}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;->getSelectedPaymentMethodCode()Ljava/lang/String;

    move-result-object v11

    .line 36
    invoke-static {v3}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;

    move-result-object v12

    invoke-virtual {v12}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;->getIncentive()Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;

    move-result-object v12

    .line 37
    invoke-static {v3}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;

    move-result-object v13

    invoke-virtual {v13}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;->getFormElements()Ljava/util/List;

    move-result-object v13

    const v14, 0x22a35295

    invoke-interface {v15, v14}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    and-int/lit8 v14, v4, 0xe

    if-eq v14, v5, :cond_c

    and-int/lit8 v16, v4, 0x8

    if-eqz v16, :cond_b

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_b

    goto :goto_8

    :cond_b
    move/from16 v16, v8

    goto :goto_9

    :cond_c
    :goto_8
    move/from16 v16, v9

    .line 152
    :goto_9
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    if-nez v16, :cond_d

    .line 153
    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v8, v9, :cond_e

    .line 38
    :cond_d
    new-instance v8, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$$ExternalSyntheticLambda0;

    invoke-direct {v8, v0}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;)V

    .line 155
    invoke-interface {v15, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 38
    :cond_e
    move-object v9, v8

    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 45
    invoke-static {v3}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;

    move-result-object v8

    invoke-virtual {v8}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;->getArguments()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v8

    .line 46
    invoke-static {v3}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;->getUsBankAccountFormArguments()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;

    move-result-object v16

    move/from16 v17, v4

    const v4, 0x22a38044

    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    if-eq v14, v5, :cond_10

    and-int/lit8 v4, v17, 0x8

    if-eqz v4, :cond_f

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    goto :goto_a

    :cond_f
    const/4 v4, 0x0

    goto :goto_b

    :cond_10
    :goto_a
    const/4 v4, 0x1

    :goto_b
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    or-int v4, v4, v18

    .line 158
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_11

    .line 159
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_12

    .line 47
    :cond_11
    new-instance v5, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$$ExternalSyntheticLambda1;

    invoke-direct {v5, v0, v3}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;Landroidx/compose/runtime/State;)V

    .line 161
    invoke-interface {v15, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 47
    :cond_12
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 55
    const-string v4, "PaymentSheetAddPaymentMethodForm"

    invoke-static {v6, v4}, Landroidx/compose/ui/platform/TestTagKt;->testTag(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object/from16 v19, v4

    const v4, 0x22a3acf4

    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const/4 v4, 0x4

    if-eq v14, v4, :cond_14

    and-int/lit8 v4, v17, 0x8

    if-eqz v4, :cond_13

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_13

    goto :goto_c

    :cond_13
    const/4 v4, 0x0

    goto :goto_d

    :cond_14
    :goto_c
    const/4 v4, 0x1

    :goto_d
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v4, v14

    .line 164
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v14

    if-nez v4, :cond_15

    .line 165
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v14, v4, :cond_16

    .line 56
    :cond_15
    new-instance v14, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$$ExternalSyntheticLambda2;

    invoke-direct {v14, v0, v3}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;Landroidx/compose/runtime/State;)V

    .line 167
    invoke-interface {v15, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 56
    :cond_16
    check-cast v14, Lkotlin/jvm/functions/Function0;

    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v3, v6

    move-object v6, v11

    move-object/from16 v11, v16

    const/16 v16, 0x0

    move v4, v7

    move-object v7, v12

    move-object v12, v5

    move-object v5, v10

    move-object v10, v8

    move-object v8, v13

    move-object/from16 v13, v19

    .line 32
    invoke-static/range {v4 .. v18}, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt;->PaymentElement(ZLjava/util/List;Ljava/lang/String;Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_17

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 64
    :cond_17
    :goto_e
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v4

    if-eqz v4, :cond_18

    new-instance v5, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$$ExternalSyntheticLambda3;

    invoke-direct {v5, v0, v3, v1, v2}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$$ExternalSyntheticLambda3;-><init>(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;Landroidx/compose/ui/Modifier;II)V

    invoke-interface {v4, v5}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_18
    return-void
.end method

.method private static final AddPaymentMethod$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;"
        }
    .end annotation

    .line 170
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;

    return-object p0
.end method

.method private static final AddPaymentMethod$lambda$2$lambda$1(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;)Lkotlin/Unit;
    .locals 1

    const-string v0, "selectedLpm"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction$OnPaymentMethodSelected;

    .line 41
    invoke-virtual {p1}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object p1

    .line 40
    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction$OnPaymentMethodSelected;-><init>(Ljava/lang/String;)V

    check-cast v0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction;

    .line 39
    invoke-interface {p0, v0}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;->handleViewAction(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction;)V

    .line 44
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final AddPaymentMethod$lambda$4$lambda$3(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;Landroidx/compose/runtime/State;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;)Lkotlin/Unit;
    .locals 1

    .line 49
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction$OnFormFieldValuesChanged;

    .line 51
    invoke-static {p1}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;->getSelectedPaymentMethodCode()Ljava/lang/String;

    move-result-object p1

    .line 49
    invoke-direct {v0, p2, p1}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction$OnFormFieldValuesChanged;-><init>(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V

    check-cast v0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction;

    .line 48
    invoke-interface {p0, v0}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;->handleViewAction(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction;)V

    .line 54
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final AddPaymentMethod$lambda$6$lambda$5(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;Landroidx/compose/runtime/State;)Lkotlin/Unit;
    .locals 1

    .line 58
    new-instance v0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction$ReportFieldInteraction;

    .line 59
    invoke-static {p1}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod$lambda$0(Landroidx/compose/runtime/State;)Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$State;->getSelectedPaymentMethodCode()Ljava/lang/String;

    move-result-object p1

    .line 58
    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction$ReportFieldInteraction;-><init>(Ljava/lang/String;)V

    check-cast v0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction;

    .line 57
    invoke-interface {p0, v0}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;->handleViewAction(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor$ViewAction;)V

    .line 62
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final AddPaymentMethod$lambda$7(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->AddPaymentMethod(Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodInteractor;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic getPAYMENT_SHEET_FORM_TEST_TAG$annotations()V
    .locals 0

    return-void
.end method

.method public static final transformToExtraParams(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodExtraParams;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    sget-object v0, Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter;->Companion:Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter$Companion;

    .line 93
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/forms/FormFieldValues;->getFieldValuePairs()Ljava/util/Map;

    move-result-object p0

    .line 92
    invoke-virtual {v0, p0, p1}, Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter$Companion;->transformToPaymentMethodExtraParams(Ljava/util/Map;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodExtraParams;

    move-result-object p0

    return-object p0
.end method

.method public static final transformToPaymentMethodCreateParams(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Lcom/stripe/android/model/PaymentMethodCreateParams;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodMetadata"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    sget-object v0, Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter;->Companion:Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter$Companion;

    .line 71
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/forms/FormFieldValues;->getFieldValuePairs()Ljava/util/Map;

    move-result-object v1

    .line 73
    invoke-virtual {p2, p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->requiresMandate(Ljava/lang/String;)Z

    move-result v2

    .line 74
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/forms/FormFieldValues;->getUserRequestedReuse()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    move-result-object p0

    invoke-virtual {p2, p0, p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->allowRedisplay(Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    move-result-object p0

    .line 70
    invoke-virtual {v0, v1, p1, v2, p0}, Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter$Companion;->transformToPaymentMethodCreateParams(Ljava/util/Map;Ljava/lang/String;ZLcom/stripe/android/model/PaymentMethod$AllowRedisplay;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p0

    return-object p0
.end method

.method public static final transformToPaymentMethodOptionsParams(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)Lcom/stripe/android/model/PaymentMethodOptionsParams;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    sget-object v0, Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter;->Companion:Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter$Companion;

    .line 83
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/forms/FormFieldValues;->getFieldValuePairs()Ljava/util/Map;

    move-result-object p0

    .line 82
    invoke-virtual {v0, p0, p1, p2}, Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter$Companion;->transformToPaymentMethodOptionsParams(Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)Lcom/stripe/android/model/PaymentMethodOptionsParams;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic transformToPaymentMethodOptionsParams$default(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentMethodOptionsParams;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 78
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->transformToPaymentMethodOptionsParams(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)Lcom/stripe/android/model/PaymentMethodOptionsParams;

    move-result-object p0

    return-object p0
.end method

.method public static final transformToPaymentSelection(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "paymentMethod"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "paymentMethodMetadata"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/forms/FormFieldValues;->getUserRequestedReuse()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    move-result-object v2

    .line 103
    sget-object v4, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v4, v4, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-virtual {v1, v4}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->hasIntentToSetup(Ljava/lang/String;)Z

    move-result v4

    .line 102
    invoke-static {v2, v4}, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt;->getSetupFutureUseValue(Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;Z)Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    move-result-object v2

    .line 106
    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4, v1}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->transformToPaymentMethodCreateParams(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v6

    .line 107
    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4, v2}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->transformToPaymentMethodOptionsParams(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)Lcom/stripe/android/model/PaymentMethodOptionsParams;

    move-result-object v9

    .line 108
    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->transformToExtraParams(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodExtraParams;

    move-result-object v13

    .line 109
    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v4, v4, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 114
    sget-object v1, Lcom/stripe/android/model/CardBrand;->Companion:Lcom/stripe/android/model/CardBrand$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/forms/FormFieldValues;->getFieldValuePairs()Ljava/util/Map;

    move-result-object v2

    sget-object v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v3}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardBrand()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Lcom/stripe/android/model/CardBrand$Companion;->fromCode(Ljava/lang/String;)Lcom/stripe/android/model/CardBrand;

    move-result-object v7

    .line 115
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/forms/FormFieldValues;->getUserRequestedReuse()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    move-result-object v8

    .line 110
    new-instance v5, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;

    move-object v10, v13

    invoke-direct/range {v5 .. v10}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;-><init>(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;)V

    check-cast v5, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object v5

    .line 117
    :cond_1
    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->isExternalPaymentMethod(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 118
    new-instance v14, Lcom/stripe/android/paymentsheet/model/PaymentSelection$ExternalPaymentMethod;

    .line 119
    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v15

    .line 120
    invoke-virtual {v6}, Lcom/stripe/android/model/PaymentMethodCreateParams;->getBillingDetails()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object v16

    .line 121
    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getDisplayName()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v17

    .line 122
    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getIconResource()I

    move-result v18

    .line 123
    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getLightThemeIconUrl()Ljava/lang/String;

    move-result-object v19

    .line 124
    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getDarkThemeIconUrl()Ljava/lang/String;

    move-result-object v20

    .line 118
    invoke-direct/range {v14 .. v20}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$ExternalPaymentMethod;-><init>(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/String;Ljava/lang/String;)V

    check-cast v14, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object v14

    .line 126
    :cond_2
    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;->isCustomPaymentMethod(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 127
    new-instance v14, Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomPaymentMethod;

    .line 128
    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v15

    .line 129
    invoke-virtual {v6}, Lcom/stripe/android/model/PaymentMethodCreateParams;->getBillingDetails()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object v16

    .line 130
    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getDisplayName()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v17

    .line 131
    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getLightThemeIconUrl()Ljava/lang/String;

    move-result-object v18

    .line 132
    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getDarkThemeIconUrl()Ljava/lang/String;

    move-result-object v19

    .line 127
    invoke-direct/range {v14 .. v19}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomPaymentMethod;-><init>(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;Ljava/lang/String;)V

    check-cast v14, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object v14

    :cond_3
    move-object v10, v6

    .line 136
    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getDisplayName()Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v6

    .line 137
    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getIconResource()I

    move-result v7

    .line 138
    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getLightThemeIconUrl()Ljava/lang/String;

    move-result-object v8

    .line 139
    invoke-virtual {v3}, Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;->getDarkThemeIconUrl()Ljava/lang/String;

    move-result-object v1

    .line 143
    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/forms/FormFieldValues;->getUserRequestedReuse()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    move-result-object v11

    .line 135
    new-instance v5, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$GenericPaymentMethod;

    move-object v12, v9

    move-object v9, v1

    invoke-direct/range {v5 .. v13}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$GenericPaymentMethod;-><init>(Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;)V

    check-cast v5, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object v5
.end method
