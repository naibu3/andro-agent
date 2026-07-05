.class final Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "CardNumberController.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/stripe/android/uicore/elements/TextFieldState;",
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
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "state",
        "Lcom/stripe/android/uicore/elements/TextFieldState;"
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
    c = "com.stripe.android.ui.core.elements.DefaultCardNumberController$ComposeUI$1$1$1"
    f = "CardNumberController.kt"
    i = {}
    l = {}
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

.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;


# direct methods
.method constructor <init>(Lcom/stripe/android/ui/core/elements/events/CardNumberCompletedEventReporter;Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/ui/core/elements/events/CardNumberCompletedEventReporter;",
            "Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;",
            "Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stripe/android/model/CardBrand;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;->$reporter:Lcom/stripe/android/ui/core/elements/events/CardNumberCompletedEventReporter;

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;->this$0:Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;

    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;->$disallowedBrandReporter:Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;

    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;->$lastLoggedCardBrand$delegate:Landroidx/compose/runtime/MutableState;

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

    new-instance v0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;->$reporter:Lcom/stripe/android/ui/core/elements/events/CardNumberCompletedEventReporter;

    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;->this$0:Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;

    iget-object v3, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;->$disallowedBrandReporter:Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;

    iget-object v4, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;->$lastLoggedCardBrand$delegate:Landroidx/compose/runtime/MutableState;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;-><init>(Lcom/stripe/android/ui/core/elements/events/CardNumberCompletedEventReporter;Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public final invoke(Lcom/stripe/android/uicore/elements/TextFieldState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/TextFieldState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/uicore/elements/TextFieldState;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;->invoke(Lcom/stripe/android/uicore/elements/TextFieldState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 381
    iget v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;->label:I

    if-nez v0, :cond_3

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/uicore/elements/TextFieldState;

    .line 383
    instance-of v0, p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 384
    iget-object p1, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;->$reporter:Lcom/stripe/android/ui/core/elements/events/CardNumberCompletedEventReporter;

    invoke-interface {p1}, Lcom/stripe/android/ui/core/elements/events/CardNumberCompletedEventReporter;->onCardNumberCompleted()V

    .line 385
    iget-object p1, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;->$lastLoggedCardBrand$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1, v1}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->access$ComposeUI$lambda$23(Landroidx/compose/runtime/MutableState;Lcom/stripe/android/model/CardBrand;)V

    goto :goto_0

    .line 387
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;

    if-eqz v0, :cond_1

    .line 388
    check-cast p1, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;->getError()Lcom/stripe/android/uicore/elements/FieldError;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 389
    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/FieldError;->getErrorMessage()I

    move-result p1

    sget v0, Lcom/stripe/android/R$string;->stripe_disallowed_card_brand:I

    if-ne p1, v0, :cond_2

    .line 390
    iget-object p1, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;->$lastLoggedCardBrand$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->access$ComposeUI$lambda$22(Landroidx/compose/runtime/MutableState;)Lcom/stripe/android/model/CardBrand;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;->this$0:Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;

    invoke-static {v0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->access$getImpliedCardBrand$p(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eq p1, v0, :cond_2

    .line 391
    iget-object p1, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;->$disallowedBrandReporter:Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;->this$0:Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;

    invoke-static {v0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->access$getImpliedCardBrand$p(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/CardBrand;

    invoke-interface {p1, v0}, Lcom/stripe/android/ui/core/elements/events/CardBrandDisallowedReporter;->onDisallowedCardBrandEntered(Lcom/stripe/android/model/CardBrand;)V

    .line 392
    iget-object p1, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;->$lastLoggedCardBrand$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;->this$0:Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;

    invoke-static {v0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->access$getImpliedCardBrand$p(Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/CardBrand;

    invoke-static {p1, v0}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->access$ComposeUI$lambda$23(Landroidx/compose/runtime/MutableState;Lcom/stripe/android/model/CardBrand;)V

    goto :goto_0

    .line 396
    :cond_1
    iget-object p1, p0, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$ComposeUI$1$1$1;->$lastLoggedCardBrand$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1, v1}, Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;->access$ComposeUI$lambda$23(Landroidx/compose/runtime/MutableState;Lcom/stripe/android/model/CardBrand;)V

    .line 399
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 381
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
