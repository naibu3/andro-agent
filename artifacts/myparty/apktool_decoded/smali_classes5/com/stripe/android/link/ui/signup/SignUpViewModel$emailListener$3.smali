.class final Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SignUpViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/signup/SignUpViewModel;->emailListener(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/String;",
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
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "email",
        ""
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
    c = "com.stripe.android.link.ui.signup.SignUpViewModel$emailListener$3"
    f = "SignUpViewModel.kt"
    i = {
        0x0,
        0x1
    }
    l = {
        0x6f,
        0x72
    }
    m = "invokeSuspend"
    n = {
        "email",
        "email"
    }
    s = {
        "L$0",
        "L$0"
    }
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/link/ui/signup/SignUpViewModel;


# direct methods
.method constructor <init>(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/signup/SignUpViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;->this$0:Lcom/stripe/android/link/ui/signup/SignUpViewModel;

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

    new-instance v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;

    iget-object v1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;->this$0:Lcom/stripe/android/link/ui/signup/SignUpViewModel;

    invoke-direct {v0, v1, p2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;-><init>(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;->invoke(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 109
    iget v1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p1, v1

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    .line 110
    iget-object v1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;->this$0:Lcom/stripe/android/link/ui/signup/SignUpViewModel;

    const/4 v4, 0x0

    invoke-static {v1, v4, v4, v2, v4}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->onError$default(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Ljava/lang/Throwable;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)V

    .line 111
    sget-object v1, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->Companion:Lcom/stripe/android/link/ui/signup/SignUpViewModel$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Companion;->getLOOKUP_DEBOUNCE-UwyO8pc$paymentsheet_release()J

    move-result-wide v4

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;->label:I

    invoke-static {v4, v5, v1}, Lkotlinx/coroutines/DelayKt;->delay-VtjQ1oo(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    if-eqz p1, :cond_7

    .line 113
    iget-object v1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;->this$0:Lcom/stripe/android/link/ui/signup/SignUpViewModel;

    invoke-static {v1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->access$getConfiguration$p(Lcom/stripe/android/link/ui/signup/SignUpViewModel;)Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration;->getCustomerInfo()Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;->this$0:Lcom/stripe/android/link/ui/signup/SignUpViewModel;

    invoke-static {v1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->access$getEmailHasChanged$p(Lcom/stripe/android/link/ui/signup/SignUpViewModel;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_1

    .line 116
    :cond_4
    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;->this$0:Lcom/stripe/android/link/ui/signup/SignUpViewModel;

    sget-object v1, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingRemainingFields:Lcom/stripe/android/link/ui/signup/SignUpState;

    invoke-static {v0, v1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->access$updateSignUpState(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Lcom/stripe/android/link/ui/signup/SignUpState;)V

    goto :goto_4

    .line 114
    :cond_5
    :goto_1
    iget-object v1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;->this$0:Lcom/stripe/android/link/ui/signup/SignUpViewModel;

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;->label:I

    invoke-static {v1, p1, v4}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->access$lookupEmail(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_6

    :goto_2
    return-object v0

    :cond_6
    move-object v0, p1

    :goto_3
    move-object p1, v0

    goto :goto_4

    .line 119
    :cond_7
    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;->this$0:Lcom/stripe/android/link/ui/signup/SignUpViewModel;

    sget-object v1, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingPrimaryField:Lcom/stripe/android/link/ui/signup/SignUpState;

    invoke-static {v0, v1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->access$updateSignUpState(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Lcom/stripe/android/link/ui/signup/SignUpState;)V

    .line 122
    :goto_4
    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;->this$0:Lcom/stripe/android/link/ui/signup/SignUpViewModel;

    invoke-static {v0}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->access$getConfiguration$p(Lcom/stripe/android/link/ui/signup/SignUpViewModel;)Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkConfiguration;->getCustomerInfo()Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;->getEmail()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    .line 123
    iget-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$emailListener$3;->this$0:Lcom/stripe/android/link/ui/signup/SignUpViewModel;

    invoke-static {p1, v3}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->access$setEmailHasChanged$p(Lcom/stripe/android/link/ui/signup/SignUpViewModel;Z)V

    .line 125
    :cond_8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
