.class final Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "NetworkingLinkSignupViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observePayloadResult$2$1"
    f = "NetworkingLinkSignupViewModel.kt"
    i = {}
    l = {
        0xbb
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $payload:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$2$1;->this$0:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$2$1;->$payload:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method public static final synthetic access$invokeSuspend$onEmailEntered(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$2$1;->invokeSuspend$onEmailEntered(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final synthetic invokeSuspend$onEmailEntered(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 187
    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->access$onEmailEntered(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
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

    new-instance p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$2$1;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$2$1;->this$0:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$2$1;->$payload:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$2$1;-><init>(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$2$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$2$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 184
    iget v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$2$1;->label:I

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

    .line 185
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$2$1;->this$0:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$2$1;->$payload:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;->getEmailController()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/uicore/elements/InputController;

    .line 186
    invoke-static {p1, v1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;->access$validFormFieldState(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;Lcom/stripe/android/uicore/elements/InputController;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    check-cast p1, Lkotlinx/coroutines/flow/Flow;

    .line 187
    new-instance v1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$2$1$1;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$2$1;->this$0:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;

    invoke-direct {v1, v3}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$2$1$1;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    move-object v3, p0

    check-cast v3, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$observePayloadResult$2$1;->label:I

    invoke-static {p1, v1, v3}, Lkotlinx/coroutines/flow/FlowKt;->collectLatest(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    .line 188
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
