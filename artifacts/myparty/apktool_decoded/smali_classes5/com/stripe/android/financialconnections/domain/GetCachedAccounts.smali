.class public final Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;
.super Ljava/lang/Object;
.source "GetCachedAccounts.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u0086B\u00a2\u0006\u0002\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;",
        "",
        "repository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;",
        "configuration",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)V",
        "getRepository",
        "()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;",
        "getConfiguration",
        "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;",
        "invoke",
        "",
        "Lcom/stripe/android/financialconnections/domain/CachedPartnerAccount;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;

    .line 15
    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    return-void
.end method


# virtual methods
.method public final getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    return-object v0
.end method

.method public final getRepository()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;

    return-object v0
.end method

.method public final invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/domain/CachedPartnerAccount;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/financialconnections/domain/GetCachedAccounts$invoke$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/financialconnections/domain/GetCachedAccounts$invoke$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/domain/GetCachedAccounts$invoke$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/android/financialconnections/domain/GetCachedAccounts$invoke$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/android/financialconnections/domain/GetCachedAccounts$invoke$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/domain/GetCachedAccounts$invoke$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/financialconnections/domain/GetCachedAccounts$invoke$1;-><init>(Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/financialconnections/domain/GetCachedAccounts$invoke$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 18
    iget v2, v0, Lcom/stripe/android/financialconnections/domain/GetCachedAccounts$invoke$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 19
    iget-object p1, p0, Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;

    iput v3, v0, Lcom/stripe/android/financialconnections/domain/GetCachedAccounts$invoke$1;->label:I

    invoke-interface {p1, v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;->getCachedAccounts(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_4

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_4
    return-object p1
.end method
