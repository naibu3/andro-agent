.class public final Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;
.super Ljava/lang/Object;
.source "CompleteFinancialConnectionsSession.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$Result;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0015B!\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\"\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0086B\u00a2\u0006\u0002\u0010\u0010J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;",
        "",
        "repository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;",
        "fetchPaginatedAccountsForSession",
        "Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;",
        "configuration",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)V",
        "invoke",
        "Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$Result;",
        "earlyTerminationCause",
        "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;",
        "closeAuthFlowError",
        "",
        "(Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "computeSessionCompletionStatus",
        "",
        "session",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
        "Result",
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

.field private final fetchPaginatedAccountsForSession:Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;

.field private final repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fetchPaginatedAccountsForSession"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;

    .line 10
    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;->fetchPaginatedAccountsForSession:Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;

    .line 11
    iput-object p3, p0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    return-void
.end method

.method private final computeSessionCompletionStatus(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 0

    if-eqz p2, :cond_1

    .line 36
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;->getAnalyticsValue()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    return-object p2

    :cond_1
    :goto_0
    invoke-static {p1, p3}, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSessionKt;->access$completionStatus(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final invoke(Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;",
            "Ljava/lang/Throwable;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$invoke$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$invoke$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$invoke$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$invoke$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$invoke$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$invoke$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$invoke$1;-><init>(Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$invoke$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 14
    iget v2, v0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$invoke$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$invoke$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    iget-object p2, v0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$invoke$1;->L$1:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;

    iget-object v0, v0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$invoke$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$invoke$1;->L$2:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Ljava/lang/Throwable;

    iget-object p1, v0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$invoke$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;

    iget-object v2, v0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$invoke$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 18
    iget-object p3, p0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;

    if-eqz p1, :cond_4

    .line 19
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;->getValue()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    .line 20
    :goto_1
    iget-object v5, p0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;->getFinancialConnectionsSessionClientSecret()Ljava/lang/String;

    move-result-object v5

    .line 18
    iput-object p0, v0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$invoke$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$invoke$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$invoke$1;->L$2:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$invoke$1;->label:I

    invoke-interface {p3, v5, v2, v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;->postCompleteFinancialConnectionsSessions(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    goto :goto_3

    :cond_5
    move-object v2, p0

    .line 23
    :goto_2
    check-cast p3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    iget-object v4, v2, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;->fetchPaginatedAccountsForSession:Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;

    iput-object v2, v0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$invoke$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$invoke$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$invoke$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$invoke$1;->label:I

    invoke-virtual {v4, p3, v0}, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;->invoke(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_6

    :goto_3
    return-object v1

    :cond_6
    move-object v0, p2

    move-object p2, p1

    move-object p1, v0

    move-object v0, v2

    .line 14
    :goto_4
    check-cast p3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    .line 25
    new-instance v1, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$Result;

    .line 27
    invoke-direct {v0, p3, p2, p1}, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;->computeSessionCompletionStatus(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    .line 25
    invoke-direct {v1, p3, p1}, Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession$Result;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Ljava/lang/String;)V

    return-object v1
.end method
