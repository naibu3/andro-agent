.class final Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepositoryImpl;
.super Ljava/lang/Object;
.source "FinancialConnectionsInstitutionsRepository.kt"

# interfaces
.implements Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepositoryImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0096@\u00a2\u0006\u0002\u0010\u000eJ&\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepositoryImpl;",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepository;",
        "requestExecutor",
        "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
        "provideApiRequestOptions",
        "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;",
        "apiRequestFactory",
        "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Lcom/stripe/android/core/networking/ApiRequest$Factory;)V",
        "featuredInstitutions",
        "Lcom/stripe/android/financialconnections/model/InstitutionResponse;",
        "clientSecret",
        "",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "searchInstitutions",
        "query",
        "limit",
        "",
        "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.field public static final Companion:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepositoryImpl$Companion;

.field public static final featuredInstitutionsUrl:Ljava/lang/String; = "https://api.stripe.com/v1/connections/featured_institutions"

.field public static final institutionsUrl:Ljava/lang/String; = "https://api.stripe.com/v1/connections/institutions"


# instance fields
.field private final apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

.field private final provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

.field private final requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepositoryImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepositoryImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepositoryImpl;->Companion:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepositoryImpl$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Lcom/stripe/android/core/networking/ApiRequest$Factory;)V
    .locals 1

    const-string v0, "requestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "provideApiRequestOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiRequestFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 36
    iput-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    .line 37
    iput-object p3, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    return-void
.end method


# virtual methods
.method public featuredInstitutions(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/InstitutionResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 43
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 45
    iget-object v1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v2

    .line 47
    const-string v1, "client_secret"

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    .line 46
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    .line 43
    const-string v1, "https://api.stripe.com/v1/connections/featured_institutions"

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 50
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 51
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 52
    sget-object v1, Lcom/stripe/android/financialconnections/model/InstitutionResponse;->Companion:Lcom/stripe/android/financialconnections/model/InstitutionResponse$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/InstitutionResponse$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object v1

    .line 50
    invoke-virtual {v0, p1, v1, p2}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public searchInstitutions(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/InstitutionResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 62
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    .line 64
    iget-object v1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepositoryImpl;->provideApiRequestOptions:Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;->invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object v1

    const/4 v3, 0x3

    .line 66
    new-array v3, v3, [Lkotlin/Pair;

    const-string v4, "client_secret"

    invoke-static {v4, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v4, 0x0

    aput-object p1, v3, v4

    .line 67
    const-string p1, "query"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v3, v2

    .line 68
    const-string p1, "limit"

    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v3, p2

    .line 65
    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v2, v1

    .line 62
    const-string v1, "https://api.stripe.com/v1/connections/institutions"

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createGet$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    .line 71
    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsInstitutionsRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    .line 72
    check-cast p1, Lcom/stripe/android/core/networking/StripeRequest;

    .line 73
    sget-object p3, Lcom/stripe/android/financialconnections/model/InstitutionResponse;->Companion:Lcom/stripe/android/financialconnections/model/InstitutionResponse$Companion;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/InstitutionResponse$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p3

    .line 71
    invoke-virtual {p2, p1, p3, p4}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;Lkotlinx/serialization/KSerializer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
