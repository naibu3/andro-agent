.class public final Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;
.super Ljava/lang/Object;
.source "FetchPaginatedAccountsForSession.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0086B\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;",
        "",
        "financialConnectionsRepository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;)V",
        "invoke",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
        "session",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.field private final financialConnectionsRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "financialConnectionsRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;->financialConnectionsRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;

    iget v4, v3, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->label:I

    const/high16 v5, -0x80000000

    and-int/2addr v4, v5

    if-eqz v4, :cond_0

    iget v2, v3, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->label:I

    sub-int/2addr v2, v5

    iput v2, v3, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;

    invoke-direct {v3, v0, v2}, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;-><init>(Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v2, v3, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 23
    iget v5, v3, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->label:I

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v5, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v1, v3, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v5, v3, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->L$1:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    iget-object v7, v3, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v10, v1

    move-object v1, v5

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v3, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v5, v3, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->L$1:Ljava/lang/Object;

    check-cast v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    iget-object v7, v3, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v25, v2

    move-object v2, v1

    move-object v1, v5

    move-object/from16 v5, v25

    goto :goto_1

    :cond_3
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 24
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getAccounts()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->getHasMore()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 25
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    .line 26
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getAccounts()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->getData()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v2, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 28
    iget-object v5, v0, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;->financialConnectionsRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;

    .line 29
    new-instance v8, Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getClientSecret()Ljava/lang/String;

    move-result-object v9

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v8, v9, v10}, Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    iput-object v0, v3, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->L$0:Ljava/lang/Object;

    iput-object v1, v3, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->L$1:Ljava/lang/Object;

    iput-object v2, v3, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->L$2:Ljava/lang/Object;

    iput v7, v3, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->label:I

    invoke-interface {v5, v8, v3}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;->getFinancialConnectionsAccounts(Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_4

    goto :goto_3

    :cond_4
    move-object v7, v0

    .line 23
    :goto_1
    check-cast v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    .line 31
    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->getData()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v2, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move-object v10, v2

    .line 33
    :goto_2
    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->getHasMore()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v2

    const/16 v8, 0x64

    if-ge v2, v8, :cond_6

    .line 34
    iget-object v2, v7, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;->financialConnectionsRepository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;

    .line 35
    new-instance v5, Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getClientSecret()Ljava/lang/String;

    move-result-object v8

    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    invoke-virtual {v9}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v5, v8, v9}, Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    iput-object v7, v3, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->L$0:Ljava/lang/Object;

    iput-object v1, v3, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->L$1:Ljava/lang/Object;

    iput-object v10, v3, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->L$2:Ljava/lang/Object;

    iput v6, v3, Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession$invoke$1;->label:I

    invoke-interface {v2, v5, v3}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;->getFinancialConnectionsAccounts(Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_5

    :goto_3
    return-object v4

    .line 23
    :cond_5
    :goto_4
    move-object v5, v2

    check-cast v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    .line 37
    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->getData()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v10, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    .line 41
    :cond_6
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getId()Ljava/lang/String;

    move-result-object v2

    .line 42
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getClientSecret()Ljava/lang/String;

    move-result-object v3

    .line 43
    new-instance v15, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;

    .line 45
    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->getHasMore()Z

    move-result v11

    .line 46
    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->getUrl()Ljava/lang/String;

    move-result-object v12

    .line 47
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v13

    .line 48
    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;->getTotalCount()Ljava/lang/Integer;

    move-result-object v14

    move-object v9, v15

    .line 43
    invoke-direct/range {v9 .. v14}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;-><init>(Ljava/util/List;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 51
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->getLivemode()Z

    move-result v16

    .line 40
    new-instance v11, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    const/16 v23, 0x764

    const/16 v24, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object v13, v2

    move-object v12, v3

    invoke-direct/range {v11 .. v24}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;ZLcom/stripe/android/financialconnections/model/PaymentAccount;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v11

    :cond_7
    return-object v1
.end method
