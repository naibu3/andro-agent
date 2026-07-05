.class public final Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;
.super Ljava/lang/Object;
.source "InitChallengeRepository.kt"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001BY\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;",
        "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;",
        "sdkTransactionId",
        "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;",
        "messageVersionRegistry",
        "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;",
        "jwsValidator",
        "Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;",
        "messageTransformer",
        "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;",
        "acsDataParser",
        "Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;",
        "challengeRequestResultRepository",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;",
        "errorRequestExecutorFactory",
        "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;",
        "uiCustomization",
        "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;",
        "errorReporter",
        "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;",
        "logger",
        "Lcom/stripe/android/stripe3ds2/transaction/Logger;",
        "<init>",
        "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/Logger;)V",
        "startChallenge",
        "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;",
        "args",
        "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;",
        "(Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createCreqData",
        "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;",
        "challengeParameters",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final acsDataParser:Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;

.field private final challengeRequestResultRepository:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;

.field private final errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

.field private final errorRequestExecutorFactory:Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;

.field private final jwsValidator:Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;

.field private final logger:Lcom/stripe/android/stripe3ds2/transaction/Logger;

.field private final messageTransformer:Lcom/stripe/android/stripe3ds2/security/MessageTransformer;

.field private final messageVersionRegistry:Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;

.field private final sdkTransactionId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

.field private final uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;


# direct methods
.method public constructor <init>(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/Logger;)V
    .locals 1

    const-string v0, "sdkTransactionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageVersionRegistry"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jwsValidator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageTransformer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acsDataParser"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "challengeRequestResultRepository"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorRequestExecutorFactory"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiCustomization"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->sdkTransactionId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    .line 24
    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->messageVersionRegistry:Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;

    .line 25
    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->jwsValidator:Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;

    .line 26
    iput-object p4, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->messageTransformer:Lcom/stripe/android/stripe3ds2/security/MessageTransformer;

    .line 27
    iput-object p5, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->acsDataParser:Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;

    .line 28
    iput-object p6, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->challengeRequestResultRepository:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;

    .line 29
    iput-object p7, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->errorRequestExecutorFactory:Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;

    .line 30
    iput-object p8, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    .line 31
    iput-object p9, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    .line 32
    iput-object p10, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->logger:Lcom/stripe/android/stripe3ds2/transaction/Logger;

    return-void
.end method

.method private final createCreqData(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;
    .locals 16

    .line 139
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;->getAcsTransactionId()Ljava/lang/String;

    move-result-object v3

    const-string v0, "Required value was null."

    if-eqz v3, :cond_1

    .line 140
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;->getThreeDsServerTransactionId()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v15, p0

    if-eqz v2, :cond_0

    .line 142
    iget-object v0, v15, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->messageVersionRegistry:Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;->getCurrent()Ljava/lang/String;

    move-result-object v1

    .line 143
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;->getThreeDSRequestorAppURL()Ljava/lang/String;

    move-result-object v5

    .line 138
    new-instance v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    const/16 v13, 0xfe0

    const/4 v14, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v4, p1

    invoke-direct/range {v0 .. v14}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    .line 140
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    move-object/from16 v15, p0

    .line 139
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public startChallenge(Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    const-string v2, "getEncoded(...)"

    instance-of v3, v0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;

    iget v4, v3, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->label:I

    const/high16 v5, -0x80000000

    and-int/2addr v4, v5

    if-eqz v4, :cond_0

    iget v0, v3, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->label:I

    sub-int/2addr v0, v5

    iput v0, v3, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;

    invoke-direct {v3, v1, v0}, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;-><init>(Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v3, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 40
    iget v5, v3, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->label:I

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v2, v3, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->L$4:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

    iget-object v4, v3, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;

    iget-object v5, v3, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->L$2:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;

    iget-object v6, v3, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;

    iget-object v3, v3, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v12, v2

    move-object v2, v6

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    move-object v2, v6

    goto/16 :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    iget-object v0, v1, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->logger:Lcom/stripe/android/stripe3ds2/transaction/Logger;

    const-string v5, "Make initial challenge request."

    invoke-virtual {v0, v5}, Lcom/stripe/android/stripe3ds2/transaction/Logger;->info(Ljava/lang/String;)V

    .line 45
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;

    .line 47
    iget-object v0, v1, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->acsDataParser:Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;

    .line 48
    iget-object v5, v1, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->jwsValidator:Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;

    .line 49
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->getChallengeParameters$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;

    move-result-object v8

    invoke-virtual {v8}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;->getAcsSignedContent()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_9

    .line 48
    invoke-interface {v5, v8}, Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;->getPayload(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 47
    invoke-interface {v0, v5}, Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;->parse(Lorg/json/JSONObject;)Lcom/stripe/android/stripe3ds2/transaction/AcsData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/transaction/AcsData;->component1()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/transaction/AcsData;->component2()Ljava/security/interfaces/ECPublicKey;

    move-result-object v0

    .line 53
    iget-object v5, v1, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->sdkTransactionId:Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->getChallengeParameters$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;

    move-result-object v8

    invoke-direct {v1, v5, v8}, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->createCreqData(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    move-result-object v11

    .line 55
    iget-object v5, v1, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->errorRequestExecutorFactory:Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;

    iget-object v8, v1, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    invoke-interface {v5, v12, v8}, Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;->create(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;

    move-result-object v5

    .line 57
    new-instance v8, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;

    .line 58
    iget-object v9, v1, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->messageTransformer:Lcom/stripe/android/stripe3ds2/security/MessageTransformer;

    .line 59
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->getSdkReferenceNumber$3ds2sdk_release()Ljava/lang/String;

    move-result-object v10

    .line 62
    new-instance v13, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;

    .line 63
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->getSdkKeyPair$3ds2sdk_release()Ljava/security/KeyPair;

    move-result-object v14

    invoke-virtual {v14}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v14

    invoke-interface {v14}, Ljava/security/PrivateKey;->getEncoded()[B

    move-result-object v14

    invoke-static {v14, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    invoke-interface {v0}, Ljava/security/interfaces/ECPublicKey;->getEncoded()[B

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    invoke-direct {v13, v14, v0}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;-><init>([B[B)V

    .line 57
    invoke-direct/range {v8 .. v13}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;-><init>(Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config$Keys;)V

    .line 68
    iget-object v0, v1, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->challengeRequestResultRepository:Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;

    iput-object v1, v3, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->L$0:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    move-object/from16 v2, p1

    :try_start_2
    iput-object v2, v3, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->L$1:Ljava/lang/Object;

    iput-object v1, v3, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->L$2:Ljava/lang/Object;

    iput-object v5, v3, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->L$3:Ljava/lang/Object;

    iput-object v8, v3, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->L$4:Ljava/lang/Object;

    iput v6, v3, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository$startChallenge$1;->label:I

    invoke-interface {v0, v8, v11, v3}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;->get(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v0, v4, :cond_3

    return-object v4

    :cond_3
    move-object v3, v1

    move-object v4, v5

    move-object v12, v8

    move-object v5, v3

    .line 40
    :goto_1
    :try_start_3
    check-cast v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;

    .line 74
    instance-of v6, v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Success;

    if-eqz v6, :cond_4

    .line 75
    new-instance v4, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$Start;

    .line 76
    new-instance v8, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;

    .line 77
    move-object v6, v0

    check-cast v6, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Success;

    invoke-virtual {v6}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Success;->getCresData()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    move-result-object v9

    .line 78
    check-cast v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Success;

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Success;->getCreqData()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;

    move-result-object v10

    .line 79
    iget-object v11, v5, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    .line 81
    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor$Factory;

    invoke-direct {v0, v12}, Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor$Factory;-><init>(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;)V

    move-object v13, v0

    check-cast v13, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;

    .line 82
    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->getTimeoutMins$3ds2sdk_release()I

    move-result v14

    .line 83
    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->getIntentData$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    move-result-object v15

    .line 76
    invoke-direct/range {v8 .. v15}, Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;-><init>(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;ILcom/stripe/android/stripe3ds2/transaction/IntentData;)V

    .line 75
    invoke-direct {v4, v8}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$Start;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;)V

    check-cast v4, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;

    goto :goto_2

    .line 87
    :cond_4
    instance-of v5, v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$ProtocolError;

    if-eqz v5, :cond_6

    .line 88
    move-object v5, v0

    check-cast v5, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$ProtocolError;

    invoke-virtual {v5}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$ProtocolError;->getData()Lcom/stripe/android/stripe3ds2/transactions/ErrorData;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/stripe3ds2/transactions/ErrorData;->getErrorComponent()Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;

    move-result-object v5

    sget-object v6, Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;->ThreeDsSdk:Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;

    if-ne v5, v6, :cond_5

    .line 89
    move-object v5, v0

    check-cast v5, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$ProtocolError;

    invoke-virtual {v5}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$ProtocolError;->getData()Lcom/stripe/android/stripe3ds2/transactions/ErrorData;

    move-result-object v5

    invoke-interface {v4, v5}, Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;->executeAsync(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)V

    .line 92
    :cond_5
    new-instance v4, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;

    .line 93
    new-instance v5, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$ProtocolError;

    .line 94
    check-cast v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$ProtocolError;

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$ProtocolError;->getData()Lcom/stripe/android/stripe3ds2/transactions/ErrorData;

    move-result-object v0

    .line 96
    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->getIntentData$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    move-result-object v6

    .line 93
    invoke-direct {v5, v0, v7, v6}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$ProtocolError;-><init>(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V

    check-cast v5, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    .line 92
    invoke-direct {v4, v5}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;-><init>(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;)V

    check-cast v4, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;

    goto :goto_2

    .line 100
    :cond_6
    instance-of v5, v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Timeout;

    if-eqz v5, :cond_7

    .line 101
    check-cast v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Timeout;

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Timeout;->getData()Lcom/stripe/android/stripe3ds2/transactions/ErrorData;

    move-result-object v0

    invoke-interface {v4, v0}, Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;->executeAsync(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)V

    .line 103
    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;

    .line 104
    new-instance v4, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Timeout;

    .line 107
    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->getIntentData$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    move-result-object v5

    .line 104
    invoke-direct {v4, v7, v7, v5}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$Timeout;-><init>(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V

    check-cast v4, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    .line 103
    invoke-direct {v0, v4}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;-><init>(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;)V

    move-object v4, v0

    check-cast v4, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;

    goto :goto_2

    .line 111
    :cond_7
    instance-of v4, v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$RuntimeError;

    if-eqz v4, :cond_8

    .line 112
    new-instance v4, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;

    .line 113
    new-instance v5, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$RuntimeError;

    .line 114
    check-cast v0, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$RuntimeError;

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$RuntimeError;->getThrowable()Ljava/lang/Throwable;

    move-result-object v0

    .line 116
    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->getIntentData$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    move-result-object v6

    .line 113
    invoke-direct {v5, v0, v7, v6}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$RuntimeError;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V

    check-cast v5, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    .line 112
    invoke-direct {v4, v5}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;-><init>(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;)V

    check-cast v4, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;

    .line 45
    :goto_2
    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_5

    .line 73
    :cond_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_9
    move-object/from16 v2, p1

    .line 49
    :try_start_4
    const-string v0, "Required value was null."

    new-instance v3, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    goto :goto_3

    :catchall_3
    move-exception v0

    move-object/from16 v2, p1

    :goto_3
    move-object v3, v1

    .line 45
    :goto_4
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 121
    :goto_5
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-nez v4, :cond_a

    goto :goto_6

    .line 122
    :cond_a
    iget-object v0, v3, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    invoke-interface {v0, v4}, Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;->reportError(Ljava/lang/Throwable;)V

    .line 123
    iget-object v0, v3, Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;->logger:Lcom/stripe/android/stripe3ds2/transaction/Logger;

    const-string v3, "Exception during initial challenge request."

    invoke-virtual {v0, v3, v4}, Lcom/stripe/android/stripe3ds2/transaction/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 125
    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;

    .line 126
    new-instance v3, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$RuntimeError;

    .line 129
    invoke-virtual {v2}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;->getIntentData$3ds2sdk_release()Lcom/stripe/android/stripe3ds2/transaction/IntentData;

    move-result-object v2

    .line 126
    invoke-direct {v3, v4, v7, v2}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult$RuntimeError;-><init>(Ljava/lang/Throwable;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;)V

    check-cast v3, Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;

    .line 125
    invoke-direct {v0, v3}, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult$End;-><init>(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;)V

    check-cast v0, Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;

    :goto_6
    return-object v0
.end method
