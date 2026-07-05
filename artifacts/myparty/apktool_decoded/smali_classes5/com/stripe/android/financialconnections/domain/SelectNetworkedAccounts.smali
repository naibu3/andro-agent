.class public final Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;
.super Ljava/lang/Object;
.source "SelectNetworkedAccounts.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B!\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ.\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086B\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;",
        "",
        "configuration",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;",
        "successContentRepository",
        "Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;",
        "repository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;)V",
        "invoke",
        "Lcom/stripe/android/financialconnections/model/ShareNetworkedAccountsResponse;",
        "consumerSessionClientSecret",
        "",
        "selectedAccountIds",
        "",
        "consentAcquired",
        "",
        "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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

.field private final successContentRepository:Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "successContentRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    .line 12
    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;->successContentRepository:Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;

    .line 13
    iput-object p3, p0, Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/String;Ljava/util/Set;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Boolean;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/ShareNetworkedAccountsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts$invoke$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts$invoke$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts$invoke$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts$invoke$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts$invoke$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts$invoke$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts$invoke$1;-><init>(Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v0

    iget-object p4, v6, Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts$invoke$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 16
    iget v1, v6, Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts$invoke$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts$invoke$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 21
    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;

    .line 22
    iget-object p4, p0, Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    invoke-virtual {p4}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;->getFinancialConnectionsSessionClientSecret()Ljava/lang/String;

    move-result-object p4

    .line 21
    iput-object p0, v6, Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts$invoke$1;->L$0:Ljava/lang/Object;

    iput v2, v6, Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts$invoke$1;->label:I

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v2, p4

    invoke-interface/range {v1 .. v6}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;->postShareNetworkedAccounts(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v0, :cond_3

    return-object v0

    :cond_3
    move-object p1, p0

    .line 26
    :goto_1
    move-object p2, p4

    check-cast p2, Lcom/stripe/android/financialconnections/model/ShareNetworkedAccountsResponse;

    .line 27
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/ShareNetworkedAccountsResponse;->getDisplay()Lcom/stripe/android/financialconnections/model/Display;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/Display;->getText()Lcom/stripe/android/financialconnections/model/TextUpdate;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/TextUpdate;->getSuccessPane()Lcom/stripe/android/financialconnections/model/SuccessPane;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 28
    iget-object p1, p1, Lcom/stripe/android/financialconnections/domain/SelectNetworkedAccounts;->successContentRepository:Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;

    .line 29
    new-instance p3, Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/SuccessPane;->getCaption()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-direct {p3, v0}, Lcom/stripe/android/financialconnections/ui/TextResource$Text;-><init>(Ljava/lang/CharSequence;)V

    .line 30
    new-instance v0, Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/SuccessPane;->getSubCaption()Ljava/lang/String;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-direct {v0, p2}, Lcom/stripe/android/financialconnections/ui/TextResource$Text;-><init>(Ljava/lang/CharSequence;)V

    check-cast v0, Lcom/stripe/android/financialconnections/ui/TextResource;

    .line 29
    check-cast p3, Lcom/stripe/android/financialconnections/ui/TextResource;

    .line 28
    invoke-virtual {p1, v0, p3}, Lcom/stripe/android/financialconnections/repository/SuccessContentRepository;->set(Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;)V

    :cond_4
    return-object p4
.end method
