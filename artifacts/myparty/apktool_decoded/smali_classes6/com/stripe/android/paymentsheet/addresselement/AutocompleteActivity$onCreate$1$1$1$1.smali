.class final Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AutocompleteActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event;",
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
        "event",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event;"
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
    c = "com.stripe.android.paymentsheet.addresselement.AutocompleteActivity$onCreate$1$1$1$1"
    f = "AutocompleteActivity.kt"
    i = {}
    l = {
        0x3f
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $bottomSheetState:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

.field final synthetic $starterArgs:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;

.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;",
            "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;",
            "Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1$1;->$starterArgs:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1$1;->$bottomSheetState:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
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

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1$1;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1$1;->$starterArgs:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1$1;->$bottomSheetState:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1$1;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public final invoke(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1$1;->invoke(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 49
    iget v1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event;

    .line 51
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event$EnterManually;

    if-eqz v1, :cond_2

    new-instance v1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result$EnterManually;

    .line 52
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1$1;->$starterArgs:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;->getId$paymentsheet_release()Ljava/lang/String;

    move-result-object v3

    .line 53
    check-cast p1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event$EnterManually;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event$EnterManually;->getAddressDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object p1

    .line 51
    invoke-direct {v1, v3, p1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result$EnterManually;-><init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V

    check-cast v1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;

    goto :goto_0

    .line 55
    :cond_2
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event$GoBack;

    if-eqz v1, :cond_4

    new-instance v1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result$Address;

    .line 56
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1$1;->$starterArgs:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;->getId$paymentsheet_release()Ljava/lang/String;

    move-result-object v3

    .line 57
    check-cast p1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event$GoBack;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event$GoBack;->getAddressDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object p1

    .line 55
    invoke-direct {v1, v3, p1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result$Address;-><init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V

    check-cast v1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;

    .line 61
    :goto_0
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;

    invoke-static {p1, v1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->access$setResult(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;)V

    .line 63
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1$1;->$bottomSheetState:Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1$1;->label:I

    invoke-virtual {p1, v1}, Lcom/stripe/android/uicore/elements/bottomsheet/StripeBottomSheetState;->hide(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    .line 64
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity$onCreate$1$1$1$1;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivity;->finish()V

    .line 65
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 50
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
