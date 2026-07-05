.class public final Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt;
.super Ljava/lang/Object;
.source "StripeBottomSheetState.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStripeBottomSheetState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeBottomSheetState.kt\ncom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,123:1\n1225#2,6:124\n1225#2,6:130\n*S KotlinDebug\n*F\n+ 1 StripeBottomSheetState.kt\ncom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt\n*L\n20#1:124,6\n31#1:130,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0007\u001a-\u0010\u0000\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0014\u0008\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u00a2\u0006\u0002\u0010\u0007\u001a4\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\u000c\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0005H\u0082@\u00a2\u0006\u0002\u0010\u000f\"\u0014\u0010\u0010\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0012\u00a8\u0006\u0015"
    }
    d2 = {
        "rememberStripeBottomSheetState",
        "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;",
        "initialValue",
        "Landroidx/compose/material/ModalBottomSheetValue;",
        "confirmValueChange",
        "Lkotlin/Function1;",
        "",
        "(Landroidx/compose/material/ModalBottomSheetValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;",
        "repeatUntilSucceededOrLimit",
        "",
        "limit",
        "",
        "block",
        "Lkotlin/coroutines/Continuation;",
        "",
        "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "skipHideAnimation",
        "getSkipHideAnimation",
        "()Z",
        "isRunningUnitTest",
        "isRunningUiTest",
        "stripe-ui-core_release"
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
.method public static synthetic $r8$lambda$qX5o2aAgC9NKuXajH4eqi3sjWQg(Landroidx/compose/material/ModalBottomSheetValue;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt;->rememberStripeBottomSheetState$lambda$1$lambda$0(Landroidx/compose/material/ModalBottomSheetValue;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$repeatUntilSucceededOrLimit(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt;->repeatUntilSucceededOrLimit(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final getSkipHideAnimation()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method private static final isRunningUiTest()Z
    .locals 2

    .line 119
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 120
    const-string v0, "androidx.test.InstrumentationRegistry"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 119
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 121
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private static final isRunningUnitTest()Z
    .locals 3

    .line 112
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 113
    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    const-string v1, "FINGERPRINT"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "robolectric"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 112
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    .line 114
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public static final rememberStripeBottomSheetState(Landroidx/compose/material/ModalBottomSheetValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material/ModalBottomSheetValue;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/material/ModalBottomSheetValue;",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)",
            "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;"
        }
    .end annotation

    const v0, 0x7b6c7df5

    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    .line 19
    sget-object p0, Landroidx/compose/material/ModalBottomSheetValue;->Hidden:Landroidx/compose/material/ModalBottomSheetValue;

    :cond_0
    move-object v1, p0

    and-int/lit8 p0, p4, 0x2

    if-eqz p0, :cond_2

    const p0, -0x14af218

    .line 20
    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 124
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p0

    .line 125
    sget-object p1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    .line 126
    new-instance p0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt$$ExternalSyntheticLambda0;

    invoke-direct {p0}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt$$ExternalSyntheticLambda0;-><init>()V

    .line 127
    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 20
    :cond_1
    move-object p1, p0

    check-cast p1, Lkotlin/jvm/functions/Function1;

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    :cond_2
    move-object v3, p1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_3

    const/4 p0, -0x1

    const-string p1, "com.stripe.android.uicore.elements.bottomsheet.rememberStripeBottomSheetState (StripeBottomSheetState.kt:20)"

    .line 21
    invoke-static {v0, p3, p0, p1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_3
    const/4 p0, 0x7

    const/4 p1, 0x0

    const/4 p4, 0x0

    .line 26
    invoke-static {p1, p1, p4, p0, p4}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Landroidx/compose/animation/core/AnimationSpec;

    and-int/lit8 p0, p3, 0xe

    or-int/lit16 p0, p0, 0xc30

    shl-int/lit8 p3, p3, 0x3

    and-int/lit16 p3, p3, 0x380

    or-int v6, p0, p3

    const/4 v7, 0x0

    const/4 v4, 0x1

    move-object v5, p2

    .line 22
    invoke-static/range {v1 .. v7}, Landroidx/compose/material/ModalBottomSheetKt;->rememberModalBottomSheetState(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;

    move-result-object p0

    .line 29
    invoke-static {v5, p1}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandlerKt;->rememberStripeBottomSheetKeyboardHandler(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;

    move-result-object p1

    const p2, -0x14ac6dc

    invoke-interface {v5, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 130
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p2

    .line 131
    sget-object p3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {p3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object p3

    if-ne p2, p3, :cond_4

    .line 32
    new-instance p2, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    invoke-direct {p2, p0, p1}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;-><init>(Landroidx/compose/material/ModalBottomSheetState;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetKeyboardHandler;)V

    .line 133
    invoke-interface {v5, p2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 31
    :cond_4
    check-cast p2, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_5
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-object p2
.end method

.method private static final rememberStripeBottomSheetState$lambda$1$lambda$0(Landroidx/compose/material/ModalBottomSheetValue;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final repeatUntilSucceededOrLimit(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1;

    iget v1, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1;

    invoke-direct {v0, p2}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1;-><init>(Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 92
    iget v2, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p0, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1;->I$1:I

    iget p1, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1;->I$0:I

    iget-object v2, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-object p2, v2

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    const/4 p2, 0x0

    move-object v4, p1

    move p1, p0

    move p0, p2

    move-object p2, v4

    :goto_1
    if-ge p0, p1, :cond_3

    .line 99
    :try_start_1
    iput-object p2, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1;->L$0:Ljava/lang/Object;

    iput p1, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1;->I$0:I

    iput p0, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1;->I$1:I

    iput v3, v0, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetStateKt$repeatUntilSucceededOrLimit$1;->label:I

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    return-object v1

    :catch_1
    :goto_2
    add-int/2addr p0, v3

    goto :goto_1

    .line 105
    :cond_3
    :goto_3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
