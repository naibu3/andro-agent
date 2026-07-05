.class final Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "FormActivityStateHelper.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFormActivityStateHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormActivityStateHelper.kt\ncom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper$1$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,182:1\n230#2,5:183\n*S KotlinDebug\n*F\n+ 1 FormActivityStateHelper.kt\ncom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper$1$1\n*L\n72#1:183,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "selection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;"
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
    c = "com.stripe.android.paymentelement.embedded.form.DefaultFormActivityStateHelper$1$1"
    f = "FormActivityStateHelper.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper$1$1;->this$0:Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance v0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper$1$1;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper$1$1;->this$0:Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper;

    invoke-direct {v0, v1, p2}, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper$1$1;-><init>(Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public final invoke(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper$1$1;->invoke(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 71
    iget v0, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper$1$1;->label:I

    if-nez v0, :cond_3

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper$1$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    .line 72
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper$1$1;->this$0:Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper;

    invoke-static {v0}, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper;->access$get_state$p(Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper$1$1;->this$0:Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper;

    .line 184
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 185
    move-object v3, v2

    check-cast v3, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;

    .line 74
    invoke-static {v1}, Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper;->access$getUsBankAccountFormPrimaryButtonUiState$p(Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;->getEnabled()Z

    move-result v4

    :goto_0
    move v5, v4

    goto :goto_1

    :cond_1
    if-eqz p1, :cond_2

    .line 75
    invoke-virtual {v3}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->isProcessing()Z

    move-result v4

    if-nez v4, :cond_2

    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    goto :goto_0

    :goto_1
    const/16 v11, 0x7d

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 73
    invoke-static/range {v3 .. v12}, Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;->copy$default(Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;ZZLcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper$State;

    move-result-object v3

    .line 186
    invoke-interface {v0, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 78
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 71
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
