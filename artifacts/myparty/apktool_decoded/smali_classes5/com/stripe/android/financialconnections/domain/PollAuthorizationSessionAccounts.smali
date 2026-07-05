.class public final Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;
.super Ljava/lang/Object;
.source "PollAuthorizationSessionAccounts.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPollAuthorizationSessionAccounts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollAuthorizationSessionAccounts.kt\ncom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,113:1\n295#2,2:114\n*S KotlinDebug\n*F\n+ 1 PollAuthorizationSessionAccounts.kt\ncom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts\n*L\n40#1:114,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001e\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0086B\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;",
        "",
        "repository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;",
        "configuration",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)V",
        "invoke",
        "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
        "canRetry",
        "",
        "sync",
        "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
        "(ZLcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

.field private final repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;

    .line 28
    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    return-void
.end method

.method public static final synthetic access$getConfiguration$p(Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;
    .locals 0

    .line 26
    iget-object p0, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    return-object p0
.end method

.method public static final synthetic access$getRepository$p(Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;
    .locals 0

    .line 26
    iget-object p0, p0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;

    return-object p0
.end method


# virtual methods
.method public final invoke(ZLcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p3

    instance-of v1, v0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$1;

    iget v2, v1, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v0, v1, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$1;->label:I

    sub-int/2addr v0, v3

    iput v0, v1, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$1;->label:I

    move-object/from16 v3, p0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$1;

    move-object/from16 v3, p0

    invoke-direct {v1, v3, v0}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$1;-><init>(Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v1, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v9

    .line 31
    iget v2, v1, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$1;->label:I

    const/4 v10, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v10, :cond_1

    iget-boolean v2, v1, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$1;->Z$0:Z

    iget-object v1, v1, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :catch_0
    move-exception v0

    move-object v6, v1

    move v7, v2

    goto/16 :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 35
    :try_start_1
    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v5
    :try_end_1
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_1 .. :try_end_1} :catch_3

    const-string v0, "Required value was null."

    if-eqz v5, :cond_7

    .line 36
    :try_start_2
    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveAuthSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-result-object v4

    if-eqz v4, :cond_6

    .line 39
    invoke-static {}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 114
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    .line 40
    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->getValue()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getFlow()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_1

    :cond_4
    move-object v2, v6

    .line 115
    :goto_1
    check-cast v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    .line 40
    invoke-static {v2}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccountsKt;->access$toPollIntervalMs(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;)J

    move-result-wide v12

    .line 38
    new-instance v11, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x6

    const/16 v18, 0x0

    invoke-direct/range {v11 .. v18}, Lcom/stripe/android/financialconnections/utils/PollTimingOptions;-><init>(JIJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 37
    new-instance v0, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;

    invoke-direct {v0, v6}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$3;-><init>(Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    new-instance v2, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$4;
    :try_end_2
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_2 .. :try_end_2} :catch_3

    const/4 v8, 0x0

    move/from16 v7, p1

    move-object/from16 v6, p2

    :try_start_3
    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$4;-><init>(Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;ZLkotlin/coroutines/Continuation;)V
    :try_end_3
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_3 .. :try_end_3} :catch_2

    :try_start_4
    check-cast v2, Lkotlin/jvm/functions/Function1;
    :try_end_4
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_4 .. :try_end_4} :catch_3

    move-object/from16 v6, p2

    :try_start_5
    iput-object v6, v1, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$1;->L$0:Ljava/lang/Object;
    :try_end_5
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_5 .. :try_end_5} :catch_1

    move/from16 v7, p1

    :try_start_6
    iput-boolean v7, v1, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$1;->Z$0:Z

    iput v10, v1, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccounts$invoke$1;->label:I

    invoke-static {v11, v0, v2, v1}, Lcom/stripe/android/financialconnections/utils/ErrorsKt;->retryOnException(Lcom/stripe/android/financialconnections/utils/PollTimingOptions;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_6
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_6 .. :try_end_6} :catch_2

    if-ne v0, v9, :cond_5

    return-object v9

    :cond_5
    move-object v1, v6

    move v2, v7

    :goto_2
    :try_start_7
    check-cast v0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;
    :try_end_7
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_7 .. :try_end_7} :catch_0

    return-object v0

    :catch_1
    move-exception v0

    move/from16 v7, p1

    goto :goto_3

    :cond_6
    move/from16 v7, p1

    move-object/from16 v6, p2

    .line 36
    :try_start_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    move/from16 v7, p1

    move-object/from16 v6, p2

    .line 35
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_8
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_8 .. :try_end_8} :catch_2

    :catch_2
    move-exception v0

    goto :goto_3

    :catch_3
    move-exception v0

    move/from16 v7, p1

    move-object/from16 v6, p2

    .line 61
    :goto_3
    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getActiveInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v1

    .line 62
    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v2

    invoke-static {v2}, Lcom/stripe/android/financialconnections/features/common/ManifestExtensionsKt;->getBusinessName(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Ljava/lang/String;

    move-result-object v2

    .line 64
    invoke-static {v6}, Lcom/stripe/android/financialconnections/features/common/ManifestExtensionsKt;->showManualEntryInErrors(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)Z

    move-result v3

    .line 60
    invoke-static {v0, v1, v2, v7, v3}, Lcom/stripe/android/financialconnections/domain/PollAuthorizationSessionAccountsKt;->access$toDomainException(Lcom/stripe/android/core/exception/StripeException;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;ZZ)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v0

    throw v0
.end method
