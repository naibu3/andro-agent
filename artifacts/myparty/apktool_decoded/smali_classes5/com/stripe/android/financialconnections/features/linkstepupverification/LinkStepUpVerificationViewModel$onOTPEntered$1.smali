.class final Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "LinkStepUpVerificationViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->onOTPEntered(Ljava/lang/String;)Lkotlinx/coroutines/Job;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLinkStepUpVerificationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkStepUpVerificationViewModel.kt\ncom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,221:1\n1#2:222\n1557#3:223\n1628#3,3:224\n*S KotlinDebug\n*F\n+ 1 LinkStepUpVerificationViewModel.kt\ncom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1\n*L\n156#1:223\n156#1:224,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
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
    c = "com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel$onOTPEntered$1"
    f = "LinkStepUpVerificationViewModel.kt"
    i = {
        0x0,
        0x1,
        0x2,
        0x2
    }
    l = {
        0x84,
        0x8a,
        0x8d,
        0x9a
    }
    m = "invokeSuspend"
    n = {
        "payload",
        "payload",
        "payload",
        "selectedAccounts"
    }
    s = {
        "L$0",
        "L$0",
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field final synthetic $otp:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->this$0:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->$otp:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->this$0:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->$otp:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p1}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;-><init>(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 129
    iget v0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->label:I

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x2

    const/4 v6, 0x0

    if-eqz v0, :cond_5

    if-eq v0, v4, :cond_4

    if-eq v0, v5, :cond_2

    if-eq v0, v3, :cond_1

    if-ne v0, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->L$1:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->L$0:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    :goto_0
    move-object p1, v0

    goto/16 :goto_4

    :cond_2
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :cond_3
    move-object v4, v0

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 130
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->this$0:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/presentation/Async;->invoke()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_d

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;

    .line 132
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->this$0:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->access$getConfirmVerification$p(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;)Lcom/stripe/android/financialconnections/domain/ConfirmVerification;

    move-result-object p1

    .line 133
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->getConsumerSessionClientSecret()Ljava/lang/String;

    move-result-object v7

    .line 134
    iget-object v8, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->$otp:Ljava/lang/String;

    move-object v9, p0

    check-cast v9, Lkotlin/coroutines/Continuation;

    .line 132
    iput-object v0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->L$0:Ljava/lang/Object;

    iput v4, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->label:I

    invoke-virtual {p1, v7, v8, v9}, Lcom/stripe/android/financialconnections/domain/ConfirmVerification;->email(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto/16 :goto_7

    .line 138
    :cond_6
    :goto_1
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->this$0:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->access$getGetCachedAccounts$p(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;)Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;

    move-result-object p1

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    iput-object v0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->L$0:Ljava/lang/Object;

    iput v5, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->label:I

    invoke-virtual {p1, v4}, Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto/16 :goto_7

    .line 129
    :goto_2
    check-cast p1, Ljava/util/List;

    .line 141
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->this$0:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;

    :try_start_1
    sget-object v7, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->access$getMarkLinkStepUpVerified$p(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;)Lcom/stripe/android/financialconnections/domain/MarkLinkStepUpVerified;

    move-result-object v0

    iput-object v4, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->L$0:Ljava/lang/Object;

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->L$1:Ljava/lang/Object;

    iput v3, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->label:I

    invoke-virtual {v0, p0}, Lcom/stripe/android/financialconnections/domain/MarkLinkStepUpVerified;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v1, :cond_7

    goto/16 :goto_7

    :cond_7
    move-object v3, p1

    move-object p1, v0

    :goto_3
    :try_start_2
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object v3, p1

    goto/16 :goto_0

    :goto_4
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 142
    :goto_5
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->this$0:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v7

    if-eqz v7, :cond_8

    .line 143
    invoke-static {v0}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object v0

    .line 144
    new-instance v7, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationStepUpError;

    .line 145
    sget-object v8, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->Companion:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$Companion;

    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$Companion;->getPANE$financial_connections_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v8

    .line 146
    sget-object v9, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationStepUpError$Error;->MarkLinkVerifiedError:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationStepUpError$Error;

    .line 144
    invoke-direct {v7, v8, v9}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationStepUpError;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationStepUpError$Error;)V

    check-cast v7, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    .line 143
    invoke-interface {v0, v7}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    .line 150
    :cond_8
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->this$0:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;

    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    move-object v7, p1

    check-cast v7, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    invoke-static {v0}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->access$getEventTracker$p(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object v0

    new-instance v7, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationStepUpSuccess;

    sget-object v8, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->Companion:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$Companion;

    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$Companion;->getPANE$financial_connections_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v8

    invoke-direct {v7, v8}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationStepUpSuccess;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    check-cast v7, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    invoke-interface {v0, v7}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    .line 151
    :cond_9
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 154
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->this$0:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;

    invoke-static {p1}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->access$getSelectNetworkedAccounts$p(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;)Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;

    move-result-object p1

    .line 155
    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationState$Payload;->getConsumerSessionClientSecret()Ljava/lang/String;

    move-result-object v0

    .line 156
    check-cast v3, Ljava/lang/Iterable;

    .line 223
    new-instance v4, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v3, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .line 224
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 225
    check-cast v7, Lcom/stripe/android/financialconnections/domain/CachedPartnerAccount;

    .line 156
    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/domain/CachedPartnerAccount;->getId()Ljava/lang/String;

    move-result-object v7

    .line 225
    invoke-interface {v4, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 226
    :cond_a
    check-cast v4, Ljava/util/List;

    .line 223
    check-cast v4, Ljava/lang/Iterable;

    .line 156
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v3

    .line 157
    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    .line 154
    iput-object v6, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->L$0:Ljava/lang/Object;

    iput-object v6, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->L$1:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->label:I

    invoke-virtual {p1, v0, v3, v6, v4}, Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;->invoke(Ljava/lang/String;Ljava/util/Set;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    :goto_7
    return-object v1

    .line 129
    :cond_b
    :goto_8
    check-cast p1, Lcom/stripe/android/financialconnections/model/ShareNetworkedAccountsResponse;

    .line 159
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$onOTPEntered$1;->this$0:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;

    invoke-static {v0}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->access$getNavigationManager$p(Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;)Lcom/stripe/android/uicore/navigation/NavigationManager;

    move-result-object v7

    .line 160
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/ShareNetworkedAccountsResponse;->getNextPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object p1

    if-nez p1, :cond_c

    sget-object p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->SUCCESS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    :cond_c
    invoke-static {p1}, Lcom/stripe/android/financialconnections/navigation/DestinationMappersKt;->getDestination(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Lcom/stripe/android/financialconnections/navigation/Destination;

    move-result-object p1

    sget-object v0, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel;->Companion:Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$Companion;->getPANE$financial_connections_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v0

    invoke-static {p1, v0, v6, v5, v6}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 159
    invoke-static/range {v7 .. v12}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    .line 162
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 130
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
