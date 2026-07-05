.class final Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$handleContinue$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AccountUpdateRequiredViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->handleContinue()V
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
    c = "com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredViewModel$handleContinue$1"
    f = "AccountUpdateRequiredViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$handleContinue$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$handleContinue$1;->this$0:Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
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

    new-instance p1, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$handleContinue$1;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$handleContinue$1;->this$0:Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;

    invoke-direct {p1, v0, p2}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$handleContinue$1;-><init>(Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$handleContinue$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$handleContinue$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$handleContinue$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$handleContinue$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 60
    iget v0, p0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$handleContinue$1;->label:I

    if-nez v0, :cond_4

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$handleContinue$1;->this$0:Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;

    .line 62
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;->getReferrer()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v0

    .line 63
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/presentation/Async;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired;->getType()Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_3

    .line 64
    instance-of v1, p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type$Repair;

    if-eqz v1, :cond_1

    .line 65
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$handleContinue$1;->this$0:Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;

    check-cast p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type$Repair;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type$Repair;->getInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v2

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type$Repair;->getAuthorization()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, v2, p1, v0}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->access$openBankAuthRepair(Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    goto :goto_1

    .line 67
    :cond_1
    instance-of v1, p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type$Supportability;

    if-eqz v1, :cond_2

    .line 68
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$handleContinue$1;->this$0:Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;

    check-cast p1, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type$Supportability;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent$UpdateRequired$Type$Supportability;->getInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object p1

    invoke-static {v1, p1, v0}, Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;->access$openPartnerAuth(Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    .line 71
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 63
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 60
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
