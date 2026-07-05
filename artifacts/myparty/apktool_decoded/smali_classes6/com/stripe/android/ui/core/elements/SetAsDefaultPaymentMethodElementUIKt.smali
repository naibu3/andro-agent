.class public final Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElementUIKt;
.super Ljava/lang/Object;
.source "SetAsDefaultPaymentMethodElementUI.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSetAsDefaultPaymentMethodElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetAsDefaultPaymentMethodElementUI.kt\ncom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElementUIKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,40:1\n1225#2,6:41\n81#3:47\n81#3:48\n81#3:49\n*S KotlinDebug\n*F\n+ 1 SetAsDefaultPaymentMethodElementUI.kt\ncom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElementUIKt\n*L\n34#1:41,6\n22#1:47\n23#1:48\n25#1:49\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u001a\'\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u0007\u00a2\u0006\u0002\u0010\n\"\u0010\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b\u00b2\u0006\n\u0010\u000c\u001a\u00020\u0005X\u008a\u0084\u0002\u00b2\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002\u00b2\u0006\n\u0010\u000f\u001a\u00020\u0005X\u008a\u0084\u0002"
    }
    d2 = {
        "SET_AS_DEFAULT_PAYMENT_METHOD_TEST_TAG",
        "",
        "SetAsDefaultPaymentMethodElementUI",
        "",
        "enabled",
        "",
        "element",
        "Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "(ZLcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "payments-ui-core_release",
        "checked",
        "label",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "shouldShow"
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
.field public static final SET_AS_DEFAULT_PAYMENT_METHOD_TEST_TAG:Ljava/lang/String; = "SET_AS_DEFAULT_PAYMENT_METHOD_TEST_TAG"


# direct methods
.method public static synthetic $r8$lambda$141NCHyQW7Pu2TvSXTEqCJ9i3Is(ZLcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElementUIKt;->SetAsDefaultPaymentMethodElementUI$lambda$5(ZLcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$FzwRn6Cv5Rb49LwZZgfGDIOkyH0(Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodController;Landroidx/compose/runtime/State;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElementUIKt;->SetAsDefaultPaymentMethodElementUI$lambda$4$lambda$3(Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodController;Landroidx/compose/runtime/State;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final SetAsDefaultPaymentMethodElementUI(ZLcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 10

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x7eb5c44

    .line 20
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v7

    and-int/lit8 p3, p5, 0x1

    if-eqz p3, :cond_0

    or-int/lit8 p3, p4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 p3, p4, 0x6

    if-nez p3, :cond_2

    invoke-interface {v7, p0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result p3

    if-eqz p3, :cond_1

    const/4 p3, 0x4

    goto :goto_0

    :cond_1
    const/4 p3, 0x2

    :goto_0
    or-int/2addr p3, p4

    goto :goto_1

    :cond_2
    move p3, p4

    :goto_1
    and-int/lit8 v1, p5, 0x2

    if-eqz v1, :cond_3

    or-int/lit8 p3, p3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v1, p4, 0x30

    if-nez v1, :cond_5

    invoke-interface {v7, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x20

    goto :goto_2

    :cond_4
    const/16 v1, 0x10

    :goto_2
    or-int/2addr p3, v1

    :cond_5
    :goto_3
    and-int/lit8 v1, p5, 0x4

    if-eqz v1, :cond_6

    or-int/lit16 p3, p3, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v2, p4, 0x180

    if-nez v2, :cond_8

    invoke-interface {v7, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    const/16 v2, 0x100

    goto :goto_4

    :cond_7
    const/16 v2, 0x80

    :goto_4
    or-int/2addr p3, v2

    :cond_8
    :goto_5
    and-int/lit16 v2, p3, 0x93

    const/16 v3, 0x92

    if-ne v2, v3, :cond_a

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_6

    .line 39
    :cond_9
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move v5, p0

    move-object p3, p2

    goto/16 :goto_8

    :cond_a
    :goto_6
    if-eqz v1, :cond_b

    .line 19
    sget-object p2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast p2, Landroidx/compose/ui/Modifier;

    :cond_b
    move-object v1, p2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p2

    if-eqz p2, :cond_c

    const/4 p2, -0x1

    const-string v2, "com.stripe.android.ui.core.elements.SetAsDefaultPaymentMethodElementUI (SetAsDefaultPaymentMethodElementUI.kt:19)"

    .line 20
    invoke-static {v0, p3, p2, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 21
    :cond_c
    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;->getController()Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodController;

    move-result-object p2

    .line 22
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodController;->getSetAsDefaultPaymentMethodChecked()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v2, v7, v3, v4}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v0

    .line 23
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodController;->getLabel()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v5

    invoke-static {v5, v2, v7, v3, v4}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v5

    .line 25
    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;->getShouldShowElementFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v6

    invoke-static {v6, v2, v7, v3, v4}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object v2

    .line 27
    invoke-static {v2}, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElementUIKt;->SetAsDefaultPaymentMethodElementUI$lambda$2(Landroidx/compose/runtime/State;)Z

    move-result v2

    if-eqz v2, :cond_f

    move v2, v3

    .line 30
    invoke-static {v0}, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElementUIKt;->SetAsDefaultPaymentMethodElementUI$lambda$0(Landroidx/compose/runtime/State;)Z

    move-result v3

    .line 31
    invoke-static {v5}, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElementUIKt;->SetAsDefaultPaymentMethodElementUI$lambda$1(Landroidx/compose/runtime/State;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v4

    invoke-static {v4, v7, v2}, Lcom/stripe/android/uicore/strings/ResolvableStringComposeUtilsKt;->resolve(Lcom/stripe/android/core/strings/ResolvableString;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    const v2, -0x47e3e2d9

    .line 32
    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v7, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v2, v5

    .line 41
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_d

    .line 42
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v5, v2, :cond_e

    .line 34
    :cond_d
    new-instance v5, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElementUIKt$$ExternalSyntheticLambda0;

    invoke-direct {v5, p2, v0}, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElementUIKt$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodController;Landroidx/compose/runtime/State;)V

    .line 44
    invoke-interface {v7, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 34
    :cond_e
    move-object v6, v5

    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    shr-int/lit8 p2, p3, 0x6

    and-int/lit8 p2, p2, 0xe

    or-int/lit8 p2, p2, 0x30

    shl-int/lit8 p3, p3, 0xc

    const v0, 0xe000

    and-int/2addr p3, v0

    or-int v8, p2, p3

    const/4 v9, 0x0

    .line 28
    const-string v2, "SET_AS_DEFAULT_PAYMENT_METHOD_TEST_TAG"

    move v5, p0

    invoke-static/range {v1 .. v9}, Lcom/stripe/android/uicore/elements/CheckboxElementUIKt;->CheckboxElementUI(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_7

    :cond_f
    move v5, p0

    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_10

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_10
    move-object p3, v1

    .line 39
    :goto_8
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_11

    new-instance p0, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElementUIKt$$ExternalSyntheticLambda1;

    move-object p2, p1

    move p1, v5

    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElementUIKt$$ExternalSyntheticLambda1;-><init>(ZLcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;Landroidx/compose/ui/Modifier;II)V

    invoke-interface {v0, p0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_11
    return-void
.end method

.method private static final SetAsDefaultPaymentMethodElementUI$lambda$0(Landroidx/compose/runtime/State;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 47
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final SetAsDefaultPaymentMethodElementUI$lambda$1(Landroidx/compose/runtime/State;)Lcom/stripe/android/core/strings/ResolvableString;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;)",
            "Lcom/stripe/android/core/strings/ResolvableString;"
        }
    .end annotation

    .line 48
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/core/strings/ResolvableString;

    return-object p0
.end method

.method private static final SetAsDefaultPaymentMethodElementUI$lambda$2(Landroidx/compose/runtime/State;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 49
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final SetAsDefaultPaymentMethodElementUI$lambda$4$lambda$3(Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodController;Landroidx/compose/runtime/State;Z)Lkotlin/Unit;
    .locals 0

    .line 35
    invoke-static {p1}, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElementUIKt;->SetAsDefaultPaymentMethodElementUI$lambda$0(Landroidx/compose/runtime/State;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodController;->onValueChange(Z)V

    .line 36
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final SetAsDefaultPaymentMethodElementUI$lambda$5(ZLcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v4

    move v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElementUIKt;->SetAsDefaultPaymentMethodElementUI(ZLcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
