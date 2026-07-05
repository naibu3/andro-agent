.class final Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "PaymentOptionFactory.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;->create(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/paymentsheet/model/PaymentOption;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Landroid/graphics/drawable/Drawable;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Landroid/graphics/drawable/Drawable;"
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
    c = "com.stripe.android.paymentsheet.model.PaymentOptionFactory$create$1"
    f = "PaymentOptionFactory.kt"
    i = {}
    l = {
        0x15
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $selection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$1;->this$0:Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$1;->$selection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$1;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$1;->this$0:Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$1;->$selection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    invoke-direct {v0, v1, v2, p1}, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$1;-><init>(Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/graphics/drawable/Drawable;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$1;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 20
    iget v1, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 21
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$1;->this$0:Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;->access$getIconLoader$p(Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;

    move-result-object p1

    .line 22
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$1;->$selection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt;->getDrawableResourceId(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)I

    move-result v1

    .line 23
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$1;->$selection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    invoke-static {v3}, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt;->getLightThemeIconUrl(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Ljava/lang/String;

    move-result-object v3

    .line 24
    iget-object v4, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$1;->$selection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    invoke-static {v4}, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt;->getDarkThemeIconUrl(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Ljava/lang/String;

    move-result-object v4

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    .line 21
    iput v2, p0, Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory$create$1;->label:I

    invoke-virtual {p1, v1, v3, v4, v5}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;->load(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
