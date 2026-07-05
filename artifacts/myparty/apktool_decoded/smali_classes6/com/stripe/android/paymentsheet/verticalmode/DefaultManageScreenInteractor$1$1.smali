.class final Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$1$1;
.super Ljava/lang/Object;
.source "ManageScreenInteractor.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic this$0:Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$1$1;->this$0:Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$State;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 152
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$State;->isEditing()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$State;->getCanEdit()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$State;->getPaymentMethods()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 153
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$1$1;->this$0:Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$State;->getPaymentMethods()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;

    invoke-static {p2, p1}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;->access$handlePaymentMethodSelected(Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor;Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)V

    .line 155
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 151
    check-cast p1, Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$State;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/verticalmode/DefaultManageScreenInteractor$1$1;->emit(Lcom/stripe/android/paymentsheet/verticalmode/ManageScreenInteractor$State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
