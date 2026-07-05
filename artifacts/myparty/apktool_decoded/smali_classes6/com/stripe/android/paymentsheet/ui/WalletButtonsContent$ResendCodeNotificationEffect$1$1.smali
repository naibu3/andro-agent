.class final Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$ResendCodeNotificationEffect$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "WalletButtonsContent.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;->ResendCodeNotificationEffect(Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.stripe.android.paymentsheet.ui.WalletButtonsContent$ResendCodeNotificationEffect$1$1"
    f = "WalletButtonsContent.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $state:Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;Landroid/content/Context;Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;",
            "Landroid/content/Context;",
            "Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$ResendCodeNotificationEffect$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$ResendCodeNotificationEffect$1$1;->$state:Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$ResendCodeNotificationEffect$1$1;->$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$ResendCodeNotificationEffect$1$1;->this$0:Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;

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

    new-instance p1, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$ResendCodeNotificationEffect$1$1;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$ResendCodeNotificationEffect$1$1;->$state:Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$ResendCodeNotificationEffect$1$1;->$context:Landroid/content/Context;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$ResendCodeNotificationEffect$1$1;->this$0:Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$ResendCodeNotificationEffect$1$1;-><init>(Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;Landroid/content/Context;Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$ResendCodeNotificationEffect$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$ResendCodeNotificationEffect$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$ResendCodeNotificationEffect$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$ResendCodeNotificationEffect$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 102
    iget v0, p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$ResendCodeNotificationEffect$1$1;->label:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 103
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$ResendCodeNotificationEffect$1$1;->$state:Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;->getLink2FAState()Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State$LinkOtpState;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State$LinkOtpState;->getViewState()Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/verification/VerificationViewState;->getDidSendNewCode()Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 104
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$ResendCodeNotificationEffect$1$1;->$context:Landroid/content/Context;

    sget v0, Lcom/stripe/android/paymentsheet/R$string;->stripe_verification_code_sent:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 105
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent$ResendCodeNotificationEffect$1$1;->this$0:Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;->access$getInteractor$p(Lcom/stripe/android/paymentsheet/ui/WalletButtonsContent;)Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;

    move-result-object p1

    sget-object v0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction$OnResendCodeNotificationSent;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction$OnResendCodeNotificationSent;

    check-cast v0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction;

    invoke-interface {p1, v0}, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;->handleViewAction(Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$ViewAction;)V

    .line 107
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 102
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
