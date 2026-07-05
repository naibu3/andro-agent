.class final Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;
.super Ljava/lang/Object;
.source "FinancialConnectionsAccountsRepository.kt"

# interfaces
.implements Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFinancialConnectionsAccountsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsAccountsRepository.kt\ncom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,261:1\n1567#2:262\n1598#2,4:263\n1567#2:267\n1598#2,4:268\n1567#2:272\n1598#2,4:273\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsAccountsRepository.kt\ncom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl\n*L\n162#1:262\n162#1:263,4\n203#1:267\n203#1:268,4\n217#1:272\n217#1:273,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0002\u0018\u0000 42\u00020\u0001:\u00014B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001aH\u0096@\u00a2\u0006\u0002\u0010\u001cJ6\u0010 \u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u001a0#2\u0008\u0010$\u001a\u0004\u0018\u00010%H\u0096@\u00a2\u0006\u0002\u0010&J(\u0010\'\u001a\u00020(2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020*2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001aH\u0096@\u00a2\u0006\u0002\u0010+J,\u0010,\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u000fH\u0096@\u00a2\u0006\u0002\u0010.J\u001c\u0010/\u001a\u00020\u00132\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u001a0#H\u0096@\u00a2\u0006\u0002\u00101J\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u001a2\u000c\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepository;",
        "requestExecutor",
        "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
        "provideApiRequestOptions",
        "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;",
        "apiRequestFactory",
        "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/Logger;Landroidx/lifecycle/SavedStateHandle;)V",
        "getCachedAccounts",
        "",
        "Lcom/stripe/android/financialconnections/domain/CachedPartnerAccount;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "updateCachedAccounts",
        "",
        "partnerAccountsList",
        "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
        "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "postAuthorizationSessionAccounts",
        "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
        "clientSecret",
        "",
        "sessionId",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getNetworkedAccounts",
        "Lcom/stripe/android/financialconnections/model/NetworkedAccountsList;",
        "consumerSessionClientSecret",
        "postShareNetworkedAccounts",
        "Lcom/stripe/android/financialconnections/model/ShareNetworkedAccountsResponse;",
        "selectedAccountIds",
        "",
        "consentAcquired",
        "",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "postAttachPaymentAccountToLinkAccountSession",
        "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
        "paymentAccount",
        "Lcom/stripe/android/financialconnections/model/PaymentAccountParams;",
        "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/PaymentAccountParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "postAuthorizationSessionSelectedAccounts",
        "selectAccounts",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "pollAccountNumbers",
        "linkedAccounts",
        "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "source",
        "accounts",
        "Companion",
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
.field private static final CachedPartnerAccountsKey:Ljava/lang/String; = "CachedPartnerAccounts"

.field public static final Companion:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$Companion;

.field public static final accountsSessionUrl:Ljava/lang/String; = "https://api.stripe.com/v1/connections/auth_sessions/accounts"

.field public static final attachPaymentAccountUrl:Ljava/lang/String; = "https://api.stripe.com/v1/link_account_sessions/attach_payment_account"

.field public static final authorizationSessionSelectedAccountsUrl:Ljava/lang/String; = "https://api.stripe.com/v1/connections/auth_sessions/selected_accounts"

.field public static final networkedAccountsUrl:Ljava/lang/String; = "https://api.stripe.com/v1/link_account_sessions/networked_accounts"

.field public static final pollAccountsNumbersUrl:Ljava/lang/String; = "https://api.stripe.com/v1/link_account_sessions/poll_account_numbers"

.field public static final shareNetworkedAccountsUrl:Ljava/lang/String; = "https://api.stripe.com/v1/link_account_sessions/share_networked_account"


# instance fields
.field private final apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

.field private final requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

.field private final savedStateHandle:Landroidx/lifecycle/SavedStateHandle;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->Companion:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/Logger;Landroidx/lifecycle/SavedStateHandle;)V
    .locals 1

    const-string v0, "requestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "provideApiRequestOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiRequestFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    iput-object p1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 90
    iput-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    .line 91
    iput-object p3, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 92
    iput-object p4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->logger:Lcom/stripe/android/core/Logger;

    .line 93
    iput-object p5, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    return-void
.end method

.method private final updateCachedAccounts(Ljava/lang/String;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            ">;)V"
        }
    .end annotation

    .line 234
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->logger:Lcom/stripe/android/core/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "updating local partner accounts from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 235
    invoke-static {p2}, Lcom/stripe/android/financialconnections/domain/GetCachedAccountsKt;->toCachedPartnerAccounts(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 236
    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v0, "CachedPartnerAccounts"

    invoke-virtual {p2, v0, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public getCachedAccounts(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
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

    .line 97
    iget-object p1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v0, "CachedPartnerAccounts"

    invoke-virtual {p1, v0}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getNetworkedAccounts(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/NetworkedAccountsList;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 128
    iget v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 132
    iget-object v4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 134
    iget-object p3, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    invoke-interface {p3, v3}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v6

    const/4 p3, 0x3

    .line 136
    new-array p3, p3, [Lkotlin/Pair;

    const-string v2, "client_secret"

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, p3, v2

    .line 137
    const-string p1, "consumer_session_client_secret"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, p3, v3

    .line 138
    const-string p1, "data.institution"

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const-string p2, "expand"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, p3, p2

    .line 135
    invoke-static {p3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    .line 132
    const-string v5, "https://api.stripe.com/v1/link_account_sessions/networked_accounts"

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 141
    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 142
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 143
    sget-object p3, Lcom/stripe/android/financialconnections/model/NetworkedAccountsList;->Companion:Lcom/stripe/android/financialconnections/model/NetworkedAccountsList$Companion;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/NetworkedAccountsList$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p3

    .line 141
    iput-object p0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$getNetworkedAccounts$1;->label:I

    invoke-virtual {p2, p1, p3, v0}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    .line 144
    :goto_1
    move-object p2, p3

    check-cast p2, Lcom/stripe/android/financialconnections/model/NetworkedAccountsList;

    .line 145
    const-string v0, "getNetworkedAccounts"

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/NetworkedAccountsList;->getData()Ljava/util/List;

    move-result-object p2

    invoke-direct {p1, v0, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->updateCachedAccounts(Ljava/lang/String;Ljava/util/List;)V

    return-object p3
.end method

.method public pollAccountNumbers(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 217
    check-cast p1, Ljava/lang/Iterable;

    .line 272
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 274
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_0

    .line 275
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast v3, Ljava/lang/String;

    .line 218
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "linked_accounts["

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, "]"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    .line 275
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v2, v4

    goto :goto_0

    .line 276
    :cond_1
    check-cast v0, Ljava/util/List;

    .line 272
    check-cast v0, Ljava/lang/Iterable;

    .line 219
    invoke-static {v0}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v5

    .line 221
    iget-object v2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 223
    iget-object p1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    invoke-interface {p1, v1}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v4

    const/16 v7, 0x8

    const/4 v8, 0x0

    .line 221
    const-string v3, "https://api.stripe.com/v1/link_account_sessions/poll_account_numbers"

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 227
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public postAttachPaymentAccountToLinkAccountSession(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/PaymentAccountParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/PaymentAccountParams;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 177
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 179
    iget-object v1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v1

    const/4 v3, 0x2

    .line 181
    new-array v3, v3, [Lkotlin/Pair;

    const-string v4, "consumer_session_client_secret"

    invoke-static {v4, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 v4, 0x0

    aput-object p3, v3, v4

    .line 182
    const-string p3, "client_secret"

    invoke-static {p3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v3, v2

    .line 180
    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 183
    invoke-static {p1}, Lcom/stripe/android/financialconnections/utils/CollectionsKt;->filterNotNullValues(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/PaymentAccountParams;->toParamMap()Ljava/util/Map;

    move-result-object p2

    .line 180
    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, v1

    .line 177
    const-string v1, "https://api.stripe.com/v1/link_account_sessions/attach_payment_account"

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 185
    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 186
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 187
    sget-object p3, Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;->Companion:Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$Companion;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p3

    .line 185
    invoke-virtual {p2, p1, p3, p4}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public postAuthorizationSessionAccounts(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 107
    iget v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 111
    iget-object v4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 113
    iget-object p3, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    invoke-interface {p3, v3}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v6

    const/4 p3, 0x3

    .line 115
    new-array p3, p3, [Lkotlin/Pair;

    const-string v2, "id"

    invoke-static {v2, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 v2, 0x0

    aput-object p2, p3, v2

    .line 116
    const-string p2, "client_secret"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, p3, v3

    .line 117
    const-string p1, "data.institution"

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const-string p2, "expand"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, p3, p2

    .line 114
    invoke-static {p3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    .line 111
    const-string v5, "https://api.stripe.com/v1/connections/auth_sessions/accounts"

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 120
    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 121
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 122
    sget-object p3, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->Companion:Lcom/stripe/android/financialconnections/model/PartnerAccountsList$Companion;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/PartnerAccountsList$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p3

    .line 120
    iput-object p0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionAccounts$1;->label:I

    invoke-virtual {p2, p1, p3, v0}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    .line 123
    :goto_1
    move-object p2, p3

    check-cast p2, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;

    .line 124
    const-string v0, "getOrFetchAccounts"

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->getData()Ljava/util/List;

    move-result-object p2

    invoke-direct {p1, v0, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->updateCachedAccounts(Ljava/lang/String;Ljava/util/List;)V

    return-object p3
.end method

.method public postAuthorizationSessionSelectedAccounts(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;->label:I

    sub-int/2addr p4, v2

    iput p4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 191
    iget v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 196
    iget-object v4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 198
    iget-object p4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    invoke-interface {p4, v3}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v6

    const/4 p4, 0x3

    .line 200
    new-array p4, p4, [Lkotlin/Pair;

    const-string v2, "id"

    invoke-static {v2, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 v2, 0x0

    aput-object p2, p4, v2

    .line 201
    const-string p2, "client_secret"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, p4, v3

    .line 202
    const-string p1, "data.institution"

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const-string p2, "expand"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, p4, p2

    .line 199
    invoke-static {p4}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 203
    check-cast p3, Ljava/lang/Iterable;

    .line 267
    new-instance p2, Ljava/util/ArrayList;

    const/16 p4, 0xa

    invoke-static {p3, p4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p2, p4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p2, Ljava/util/Collection;

    .line 269
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_4

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    add-int/lit8 v5, v2, 0x1

    if-gez v2, :cond_3

    .line 270
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_3
    check-cast p4, Ljava/lang/String;

    .line 203
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "selected_accounts["

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v7, "]"

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p4

    .line 270
    invoke-interface {p2, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v2, v5

    goto :goto_1

    .line 271
    :cond_4
    check-cast p2, Ljava/util/List;

    .line 267
    check-cast p2, Ljava/lang/Iterable;

    .line 199
    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    .line 196
    const-string v5, "https://api.stripe.com/v1/connections/auth_sessions/selected_accounts"

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 205
    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 206
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 207
    sget-object p3, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->Companion:Lcom/stripe/android/financialconnections/model/PartnerAccountsList$Companion;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/PartnerAccountsList$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p3

    .line 205
    iput-object p0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl$postAuthorizationSessionSelectedAccounts$1;->label:I

    invoke-virtual {p2, p1, p3, v0}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_5

    return-object v1

    :cond_5
    move-object p1, p0

    .line 208
    :goto_2
    move-object p2, p4

    check-cast p2, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;

    .line 210
    const-string p3, "postAuthorizationSessionSelectedAccounts"

    .line 211
    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->getData()Ljava/util/List;

    move-result-object p2

    .line 209
    invoke-direct {p1, p3, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->updateCachedAccounts(Ljava/lang/String;Ljava/util/List;)V

    return-object p4
.end method

.method public postShareNetworkedAccounts(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
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

    .line 155
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 157
    iget-object v1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v1

    const/4 v3, 0x3

    .line 159
    new-array v3, v3, [Lkotlin/Pair;

    const-string v4, "client_secret"

    invoke-static {v4, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v4, 0x0

    aput-object p1, v3, v4

    .line 160
    const-string p1, "consumer_session_client_secret"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v3, v2

    .line 161
    const-string p1, "consent_acquired"

    invoke-static {p1, p4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v3, p2

    .line 158
    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    .line 162
    invoke-static {p1}, Lcom/stripe/android/financialconnections/utils/CollectionsKt;->filterNotNullValues(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    check-cast p3, Ljava/lang/Iterable;

    .line 262
    new-instance p2, Ljava/util/ArrayList;

    const/16 p4, 0xa

    invoke-static {p3, p4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p2, p4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p2, Ljava/util/Collection;

    .line 264
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    add-int/lit8 v2, v4, 0x1

    if-gez v4, :cond_0

    .line 265
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast p4, Ljava/lang/String;

    .line 163
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "selected_accounts["

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "]"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p4

    .line 265
    invoke-interface {p2, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v4, v2

    goto :goto_0

    .line 266
    :cond_1
    check-cast p2, Ljava/util/List;

    .line 262
    check-cast p2, Ljava/lang/Iterable;

    .line 158
    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, v1

    .line 155
    const-string v1, "https://api.stripe.com/v1/link_account_sessions/share_networked_account"

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 166
    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 167
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 168
    sget-object p3, Lcom/stripe/android/financialconnections/model/ShareNetworkedAccountsResponse;->Companion:Lcom/stripe/android/financialconnections/model/ShareNetworkedAccountsResponse$Companion;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/ShareNetworkedAccountsResponse$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p3

    .line 166
    invoke-virtual {p2, p1, p3, p5}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public updateCachedAccounts(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 103
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    .line 101
    :cond_0
    const-string p2, "updateCachedAccounts"

    invoke-direct {p0, p2, p1}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsAccountsRepositoryImpl;->updateCachedAccounts(Ljava/lang/String;Ljava/util/List;)V

    .line 105
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
