.class final Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "FinancialConnectionsLiteViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->onSuccessFromInstantDebits(Ljava/lang/String;)Lkotlinx/coroutines/Job;
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFinancialConnectionsLiteViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsLiteViewModel.kt\ncom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,203:1\n29#2:204\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsLiteViewModel.kt\ncom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1\n*L\n135#1:204\n*E\n"
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
    c = "com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1"
    f = "FinancialConnectionsLiteViewModel.kt"
    i = {}
    l = {
        0x89
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $url:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1;->$url:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1;->this$0:Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    new-instance p1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1;->$url:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1;->this$0:Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 134
    iget v1, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1;->L$0:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 135
    sget-object p1, Lcom/stripe/android/financialconnections/utils/InstantDebitsResultBuilder;->INSTANCE:Lcom/stripe/android/financialconnections/utils/InstantDebitsResultBuilder;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1;->$url:Ljava/lang/String;

    .line 204
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 135
    invoke-virtual {p1, v1}, Lcom/stripe/android/financialconnections/utils/InstantDebitsResultBuilder;->fromUri-IoAF18A(Landroid/net/Uri;)Ljava/lang/Object;

    move-result-object p1

    .line 136
    iget-object v1, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1;->this$0:Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;

    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    move-object v3, p1

    check-cast v3, Lcom/stripe/android/financialconnections/launcher/InstantDebitsResult;

    .line 137
    invoke-static {v1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->access$get_viewEffects$p(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    move-result-object v1

    .line 138
    new-instance v4, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect$FinishWithResult;

    .line 139
    new-instance v5, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;

    const/4 v6, 0x0

    invoke-direct {v5, v3, v6, v6}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;-><init>(Lcom/stripe/android/financialconnections/launcher/InstantDebitsResult;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lcom/stripe/android/model/Token;)V

    check-cast v5, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;

    .line 138
    invoke-direct {v4, v5}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$ViewEffect$FinishWithResult;-><init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;)V

    .line 137
    iput-object p1, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1;->label:I

    invoke-interface {v1, v4, p0}, Lkotlinx/coroutines/flow/MutableSharedFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    :goto_0
    move-object p1, v0

    .line 146
    :cond_3
    iget-object v0, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1;->this$0:Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel$onSuccessFromInstantDebits$1;->$url:Ljava/lang/String;

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 147
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to parse instant debits result from url: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;->access$handleError(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 149
    :cond_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
