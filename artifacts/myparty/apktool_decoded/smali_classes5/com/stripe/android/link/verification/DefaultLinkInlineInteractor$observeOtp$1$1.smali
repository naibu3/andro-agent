.class final Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1;
.super Ljava/lang/Object;
.source "DefaultLinkInlineInteractor.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic $linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

.field final synthetic this$0:Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;


# direct methods
.method public static synthetic $r8$lambda$QwXOZg-ZsYJuUiZ-B3H2bBrJK-s(Lcom/stripe/android/link/ui/verification/VerificationViewState;)Lcom/stripe/android/link/ui/verification/VerificationViewState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1;->emit$lambda$0(Lcom/stripe/android/link/ui/verification/VerificationViewState;)Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;Lcom/stripe/android/link/account/LinkAccountManager;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1;->this$0:Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;

    iput-object p2, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1;->$linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final emit$lambda$0(Lcom/stripe/android/link/ui/verification/VerificationViewState;)Lcom/stripe/android/link/ui/verification/VerificationViewState;
    .locals 14

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v12, 0x3fa

    const/4 v13, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, p0

    .line 86
    invoke-static/range {v1 .. v13}, Lcom/stripe/android/link/ui/verification/VerificationViewState;->copy$default(Lcom/stripe/android/link/ui/verification/VerificationViewState;ZZLcom/stripe/android/core/strings/ResolvableString;ZZLjava/lang/String;Ljava/lang/String;ZZLcom/stripe/android/link/ui/wallet/DefaultPaymentUI;ILjava/lang/Object;)Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 81
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1;->emit(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final emit(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1$emit$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1$emit$1;

    iget v1, v0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1$emit$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1$emit$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1$emit$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1$emit$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1$emit$1;-><init>(Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1$emit$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 81
    iget v2, v0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1$emit$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1$emit$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/link/verification/VerificationState;

    iget-object v0, v0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1$emit$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 82
    iget-object p2, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1;->this$0:Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;

    invoke-virtual {p2}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->getState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    invoke-interface {p2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/link/verification/LinkInlineState;

    invoke-virtual {p2}, Lcom/stripe/android/link/verification/LinkInlineState;->getVerificationState()Lcom/stripe/android/link/verification/VerificationState;

    move-result-object p2

    .line 83
    instance-of v2, p2, Lcom/stripe/android/link/verification/VerificationState$Render2FA;

    if-eqz v2, :cond_4

    move-object v2, p2

    check-cast v2, Lcom/stripe/android/link/verification/VerificationState$Render2FA;

    invoke-virtual {v2}, Lcom/stripe/android/link/verification/VerificationState$Render2FA;->getViewState()Lcom/stripe/android/link/ui/verification/VerificationViewState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/verification/VerificationViewState;->isProcessing()Z

    move-result v2

    if-nez v2, :cond_4

    .line 85
    iget-object v2, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1;->this$0:Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;

    new-instance v4, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1$$ExternalSyntheticLambda0;

    invoke-direct {v4}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v2, v4}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->access$update2FAState(Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;Lkotlin/jvm/functions/Function1;)V

    .line 92
    iget-object v2, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1;->$linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    iput-object p0, v0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1$emit$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1$emit$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1$emit$1;->label:I

    invoke-interface {v2, p1, v0}, Lcom/stripe/android/link/account/LinkAccountManager;->confirmVerification-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p2

    move-object p2, p1

    move-object p1, v0

    move-object v0, p0

    .line 93
    :goto_1
    iget-object v0, v0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$observeOtp$1$1;->this$0:Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;

    check-cast p1, Lcom/stripe/android/link/verification/VerificationState$Render2FA;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->onConfirmationResult(Lcom/stripe/android/link/verification/VerificationState$Render2FA;Ljava/lang/Object;)V

    .line 95
    :cond_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
