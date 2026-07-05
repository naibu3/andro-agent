.class final Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "NewPaymentMethodTabLayoutUI.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt;->NewPaymentMethodTabLayoutUI(Ljava/util/List;IZLcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/uicore/image/StripeImageLoader;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.stripe.android.paymentsheet.ui.NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1"
    f = "NewPaymentMethodTabLayoutUI.kt"
    i = {}
    l = {
        0x35,
        0x37
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $inspectionMode:Z

.field final synthetic $selectedIndex:I

.field final synthetic $state:Landroidx/compose/foundation/lazy/LazyListState;

.field label:I


# direct methods
.method constructor <init>(ZLandroidx/compose/foundation/lazy/LazyListState;ILkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroidx/compose/foundation/lazy/LazyListState;",
            "I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1;->$inspectionMode:Z

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    iput p3, p0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1;->$selectedIndex:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance p1, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1;

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1;->$inspectionMode:Z

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    iget v2, p0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1;->$selectedIndex:I

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1;-><init>(ZLandroidx/compose/foundation/lazy/LazyListState;ILkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 51
    iget v1, p0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 52
    iget-boolean p1, p0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1;->$inspectionMode:Z

    if-eqz p1, :cond_3

    .line 53
    iget-object v4, p0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    iget v5, p0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1;->$selectedIndex:I

    move-object v7, p0

    check-cast v7, Lkotlin/coroutines/Continuation;

    iput v3, p0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1;->label:I

    const/4 v6, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, Landroidx/compose/foundation/lazy/LazyListState;->scrollToItem$default(Landroidx/compose/foundation/lazy/LazyListState;IILkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_1

    .line 55
    :cond_3
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1;->$state:Landroidx/compose/foundation/lazy/LazyListState;

    move p1, v2

    iget v2, p0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1;->$selectedIndex:I

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    iput p1, p0, Lcom/stripe/android/paymentsheet/ui/NewPaymentMethodTabLayoutUIKt$NewPaymentMethodTabLayoutUI$1$1;->label:I

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/lazy/LazyListState;->animateScrollToItem$default(Landroidx/compose/foundation/lazy/LazyListState;IILkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    .line 57
    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
