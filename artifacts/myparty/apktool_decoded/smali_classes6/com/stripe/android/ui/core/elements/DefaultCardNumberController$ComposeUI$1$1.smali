.class final Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CardNumberController.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->ComposeUI(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.ui.core.elements.DefaultCardNumberController$ComposeUI$1$1"
    f = "CardNumberController.kt"
    i = {}
    l = {
        0x17d
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $disallowedBrandReporter:Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;

.field final synthetic $lastLoggedCardBrand$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stripe/android/model/CardBrand;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $reporter:Lcom/stripe/android/ui/core/elements/events/CardNumberCompletedEventReporter;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;


# direct methods
.method constructor <init>(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Lcom/stripe/android/ui/core/elements/events/CardNumberCompletedEventReporter;Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;",
            "Lcom/stripe/android/ui/core/elements/events/CardNumberCompletedEventReporter;",
            "Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stripe/android/model/CardBrand;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;->this$0:Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;->$reporter:Lcom/stripe/android/ui/core/elements/events/CardNumberCompletedEventReporter;

    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;->$disallowedBrandReporter:Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;

    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;->$lastLoggedCardBrand$delegate:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;->this$0:Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;

    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;->$reporter:Lcom/stripe/android/ui/core/elements/events/CardNumberCompletedEventReporter;

    iget-object v3, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;->$disallowedBrandReporter:Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;

    iget-object v4, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;->$lastLoggedCardBrand$delegate:Landroidx/compose/runtime/MutableState;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;-><init>(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Lcom/stripe/android/ui/core/elements/events/CardNumberCompletedEventReporter;Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 379
    iget v1, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 381
    iget-object p1, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;->this$0:Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->getFieldState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    check-cast p1, Lkotlinx/coroutines/flow/Flow;

    invoke-static {p1, v2}, Lkotlinx/coroutines/flow/FlowKt;->drop(Lkotlinx/coroutines/flow/Flow;I)Lkotlinx/coroutines/flow/Flow;

    move-result-object p1

    new-instance v3, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;

    iget-object v4, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;->$reporter:Lcom/stripe/android/ui/core/elements/events/CardNumberCompletedEventReporter;

    iget-object v5, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;->this$0:Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;

    iget-object v6, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;->$disallowedBrandReporter:Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;

    iget-object v7, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;->$lastLoggedCardBrand$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;-><init>(Lcom/stripe/android/ui/core/elements/events/CardNumberCompletedEventReporter;Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function2;

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;->label:I

    invoke-static {p1, v3, v1}, Lkotlinx/coroutines/flow/FlowKt;->collectLatest(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    .line 400
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
