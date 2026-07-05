.class final Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "NetworkingLinkSignupScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupScreenKt;->NetworkingLinkSignupLoaded(ZLcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;ZLcom/stripe/android/financialconnections/presentation/Async;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1"
    f = "NetworkingLinkSignupScreen.kt"
    i = {}
    l = {
        0x9a
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $payload:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;

.field final synthetic $phoneNumberFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

.field final synthetic $scrollState:Landroidx/compose/foundation/ScrollState;

.field final synthetic $showFullForm:Z

.field label:I


# direct methods
.method constructor <init>(ZLandroidx/compose/foundation/ScrollState;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;Landroidx/compose/ui/focus/FocusRequester;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroidx/compose/foundation/ScrollState;",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;",
            "Landroidx/compose/ui/focus/FocusRequester;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1;->$showFullForm:Z

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1;->$scrollState:Landroidx/compose/foundation/ScrollState;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1;->$payload:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1;->$phoneNumberFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

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

    new-instance v0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1;

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1;->$showFullForm:Z

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1;->$scrollState:Landroidx/compose/foundation/ScrollState;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1;->$payload:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1;->$phoneNumberFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1;-><init>(ZLandroidx/compose/foundation/ScrollState;Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;Landroidx/compose/ui/focus/FocusRequester;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 152
    iget v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1;->label:I

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

    .line 153
    iget-boolean p1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1;->$showFullForm:Z

    if-eqz p1, :cond_3

    .line 154
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1;->$scrollState:Landroidx/compose/foundation/ScrollState;

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1;->label:I

    const/4 v3, 0x0

    invoke-static {p1, v3, v1, v2, v3}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupScreenKt;->animateScrollToBottom$default(Landroidx/compose/foundation/ScrollState;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    .line 155
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1;->$payload:Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;->getFocusPhoneFieldOnShow()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 156
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupScreenKt$NetworkingLinkSignupLoaded$2$1;->$phoneNumberFocusRequester:Landroidx/compose/ui/focus/FocusRequester;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/FocusRequester;->requestFocus()V

    .line 159
    :cond_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
