.class final Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$4$1;
.super Ljava/lang/Object;
.source "SelectSavedPaymentMethodsInteractor.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/FlowCollector;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSelectSavedPaymentMethodsInteractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectSavedPaymentMethodsInteractor.kt\ncom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$4$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,278:1\n230#2,5:279\n*S KotlinDebug\n*F\n+ 1 SelectSavedPaymentMethodsInteractor.kt\ncom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$4$1\n*L\n132#1:279,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$4$1;->this$0:Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 131
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$4$1;->emit(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final emit(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 132
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor$4$1;->this$0:Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;

    invoke-static {p2}, Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;->access$get_state$p(Lcom/stripe/android/paymentsheet/ui/DefaultSelectSavedPaymentMethodsInteractor;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p2

    .line 280
    :goto_0
    invoke-interface {p2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 281
    move-object v1, v0

    check-cast v1, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;

    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v7, p1

    .line 133
    invoke-static/range {v1 .. v9}, Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;->copy$default(Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentOptionsItem;ZZZZILjava/lang/Object;)Lcom/stripe/android/paymentsheet/ui/SelectSavedPaymentMethodsInteractor$State;

    move-result-object p1

    .line 282
    invoke-interface {p2, v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 137
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_0
    move p1, v7

    goto :goto_0
.end method
