.class final Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "NetworkingLinkVerificationViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->onOTPEntered(Ljava/lang/String;)Lkotlinx/coroutines/Job;
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
    value = "SMAP\nNetworkingLinkVerificationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkingLinkVerificationViewModel.kt\ncom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1#2:200\n*E\n"
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
    c = "com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel$onOTPEntered$1"
    f = "NetworkingLinkVerificationViewModel.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x3,
        0x3
    }
    l = {
        0x79,
        0x82,
        0x83,
        0x85
    }
    m = "invokeSuspend"
    n = {
        "payload",
        "payload",
        "$this$invokeSuspend_u24lambda_u240",
        "isInstantDebits",
        "payload",
        "isInstantDebits",
        "payload",
        "isInstantDebits"
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "Z$0",
        "L$0",
        "Z$0",
        "L$0",
        "Z$0"
    }
.end annotation


# instance fields
.field final synthetic $otp:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field Z$0:Z

.field label:I

.field final synthetic this$0:Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;


# direct methods
.method constructor <init>(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->this$0:Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->$otp:Ljava/lang/String;

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

    new-instance v0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->this$0:Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->$otp:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p1}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;-><init>(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v3, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v6

    .line 119
    iget v0, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->label:I

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x2

    const/4 v9, 0x0

    if-eqz v0, :cond_5

    if-eq v0, v7, :cond_3

    if-eq v0, v8, :cond_2

    if-eq v0, v2, :cond_1

    if-ne v0, v1, :cond_0

    iget-boolean v1, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->Z$0:Z

    iget-object v0, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->L$0:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v0, p1

    goto/16 :goto_5

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-boolean v1, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->Z$0:Z

    iget-object v0, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->L$0:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v0, p1

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_2
    iget-boolean v1, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->Z$0:Z

    iget-object v0, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;

    iget-object v4, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move v10, v1

    :goto_0
    move-object v11, v4

    goto/16 :goto_2

    :catchall_1
    move-exception v0

    move-object v2, v4

    goto/16 :goto_7

    :cond_3
    iget-object v0, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :cond_4
    move-object v4, v0

    goto :goto_1

    :cond_5
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 120
    iget-object v0, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->this$0:Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->getStateFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState;->getPayload()Lcom/stripe/android/financialconnections/presentation/Async;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/presentation/Async;->invoke()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_d

    check-cast v0, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;

    .line 121
    iget-object v4, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->this$0:Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;

    invoke-static {v4}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->access$getConfirmVerification$p(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;)Lcom/stripe/android/financialconnections/domain/ConfirmVerification;

    move-result-object v4

    .line 122
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;->getConsumerSessionClientSecret()Ljava/lang/String;

    move-result-object v5

    .line 123
    iget-object v10, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->$otp:Ljava/lang/String;

    move-object v11, v3

    check-cast v11, Lkotlin/coroutines/Continuation;

    .line 121
    iput-object v0, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->L$0:Ljava/lang/Object;

    iput v7, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->label:I

    invoke-virtual {v4, v5, v10, v11}, Lcom/stripe/android/financialconnections/domain/ConfirmVerification;->sms(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v6, :cond_4

    goto :goto_4

    .line 126
    :goto_1
    iget-object v0, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->this$0:Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;

    invoke-static {v0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->access$isLinkWithStripe$p(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;)Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;

    move-result-object v0

    invoke-interface {v0}, Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;->invoke()Z

    move-result v5

    .line 128
    iget-object v0, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->this$0:Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;

    :try_start_3
    sget-object v10, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    if-eqz v5, :cond_8

    .line 130
    invoke-static {v0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->access$getAttachConsumerToLinkAccountSession$p(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;)Lcom/stripe/android/financialconnections/domain/AttachConsumerToLinkAccountSession;

    move-result-object v1

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;->getConsumerSessionClientSecret()Ljava/lang/String;

    move-result-object v10

    iput-object v4, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->L$0:Ljava/lang/Object;

    iput-object v0, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->L$1:Ljava/lang/Object;

    iput-boolean v5, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->Z$0:Z

    iput v8, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->label:I

    invoke-interface {v1, v10, v3}, Lcom/stripe/android/financialconnections/domain/AttachConsumerToLinkAccountSession;->invoke(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-ne v1, v6, :cond_6

    goto :goto_4

    :cond_6
    move v10, v5

    goto :goto_0

    .line 131
    :goto_2
    :try_start_4
    invoke-static {v0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->access$getGetOrFetchSync$p(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;)Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition$Always;->INSTANCE:Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition$Always;

    check-cast v1, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;

    iput-object v11, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->L$0:Ljava/lang/Object;

    iput-object v9, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->L$1:Ljava/lang/Object;

    iput-boolean v10, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->Z$0:Z

    iput v2, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->label:I

    const/4 v2, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;->invoke$default(Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync$RefetchCondition;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-ne v0, v6, :cond_7

    goto :goto_4

    :cond_7
    move v1, v10

    move-object v2, v11

    :goto_3
    :try_start_5
    check-cast v0, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_6

    :catchall_2
    move-exception v0

    move v1, v10

    move-object v2, v11

    goto :goto_7

    .line 133
    :cond_8
    :try_start_6
    invoke-static {v0}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->access$getMarkLinkVerified$p(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;)Lcom/stripe/android/financialconnections/domain/MarkLinkVerified;

    move-result-object v0

    iput-object v4, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->L$0:Ljava/lang/Object;

    iput-boolean v5, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->Z$0:Z

    iput v1, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->label:I

    invoke-virtual {v0, v3}, Lcom/stripe/android/financialconnections/domain/MarkLinkVerified;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    if-ne v0, v6, :cond_9

    :goto_4
    return-object v6

    :cond_9
    move-object v2, v4

    move v1, v5

    .line 119
    :goto_5
    :try_start_7
    check-cast v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    .line 128
    :goto_6
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_8

    :catchall_3
    move-exception v0

    move-object v2, v4

    move v1, v5

    :goto_7
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 135
    :goto_8
    iget-object v4, v3, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$onOTPEntered$1;->this$0:Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;

    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v5

    if-nez v5, :cond_a

    check-cast v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    .line 138
    invoke-static {v4}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->access$getAnalyticsTracker$p(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationSuccess;

    sget-object v2, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->Companion:Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion;->getPANE$financial_connections_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationSuccess;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    check-cast v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    invoke-interface {v0, v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    .line 139
    invoke-static {v4}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->access$getNavigationManager$p(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;)Lcom/stripe/android/uicore/navigation/NavigationManager;

    move-result-object v10

    sget-object v0, Lcom/stripe/android/financialconnections/navigation/Destination$LinkAccountPicker;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/Destination$LinkAccountPicker;

    check-cast v0, Lcom/stripe/android/financialconnections/navigation/Destination;

    sget-object v1, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->Companion:Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion;->getPANE$financial_connections_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v1

    invoke-static {v0, v1, v9, v8, v9}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    const/4 v14, 0x6

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    goto :goto_a

    :cond_a
    if-eqz v1, :cond_b

    .line 143
    invoke-static {v4}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->access$getHandleError$p(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;)Lcom/stripe/android/financialconnections/domain/HandleError;

    move-result-object v0

    .line 146
    sget-object v1, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->Companion:Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion;->getPANE$financial_connections_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v1

    .line 143
    const-string v2, "Error attaching consumer to LAS or synchronizing afterwards"

    invoke-interface {v0, v2, v5, v1, v7}, Lcom/stripe/android/financialconnections/domain/HandleError;->invoke(Ljava/lang/String;Ljava/lang/Throwable;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Z)V

    goto :goto_a

    .line 150
    :cond_b
    invoke-static {v4}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->access$getAnalyticsTracker$p(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object v0

    .line 153
    invoke-static {v4}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->access$getLogger$p(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;)Lcom/stripe/android/core/Logger;

    move-result-object v1

    .line 154
    sget-object v6, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->Companion:Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion;

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion;->getPANE$financial_connections_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v6

    .line 150
    const-string v7, "Error confirming verification or marking link as verified"

    invoke-static {v0, v7, v5, v1, v6}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerKt;->logError(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Ljava/lang/String;Ljava/lang/Throwable;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V

    .line 156
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationState$Payload;->getInitialInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 157
    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->PARTNER_AUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    if-eqz v0, :cond_c

    goto :goto_9

    .line 158
    :cond_c
    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->INSTITUTION_PICKER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    .line 159
    :goto_9
    invoke-static {v4}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->access$getAnalyticsTracker$p(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError;

    sget-object v5, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->Companion:Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion;

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion;->getPANE$financial_connections_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v5

    sget-object v6, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;->MarkLinkVerifiedError:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;

    invoke-direct {v2, v5, v6}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;)V

    check-cast v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;

    invoke-interface {v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;->track(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;)V

    .line 160
    invoke-static {v4}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->access$getNavigationManager$p(Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;)Lcom/stripe/android/uicore/navigation/NavigationManager;

    move-result-object v10

    invoke-static {v0}, Lcom/stripe/android/financialconnections/navigation/DestinationMappersKt;->getDestination(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Lcom/stripe/android/financialconnections/navigation/Destination;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel;->Companion:Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Companion;->getPANE$financial_connections_release()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v1

    invoke-static {v0, v1, v9, v8, v9}, Lcom/stripe/android/financialconnections/navigation/Destination;->invoke$default(Lcom/stripe/android/financialconnections/navigation/Destination;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Map;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    const/4 v14, 0x6

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lcom/stripe/android/uicore/navigation/NavigationManager$DefaultImpls;->tryNavigateTo$default(Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/uicore/navigation/PopUpToBehavior;ZILjava/lang/Object;)V

    .line 164
    :goto_a
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 120
    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
