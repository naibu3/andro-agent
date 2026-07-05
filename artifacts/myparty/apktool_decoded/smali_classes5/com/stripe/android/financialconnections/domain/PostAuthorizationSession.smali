.class public final Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;
.super Ljava/lang/Object;
.source "PostAuthorizationSession.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B#\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086B\u00a2\u0006\u0002\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;",
        "",
        "repository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;",
        "configuration",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;",
        "applicationId",
        "",
        "<init>",
        "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Ljava/lang/String;)V",
        "getRepository",
        "()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;",
        "getConfiguration",
        "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;",
        "invoke",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
        "institution",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "sync",
        "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "toDomainException",
        "Lcom/stripe/android/core/exception/StripeException;",
        "showManualEntry",
        "",
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
.field private final applicationId:Ljava/lang/String;

.field private final configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

.field private final repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Ljava/lang/String;)V
    .locals 1
    .param p3    # Ljava/lang/String;
        .annotation runtime Ljavax/inject/Named;
            value = "applicationId"
        .end annotation
    .end param
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    .line 24
    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    .line 25
    iput-object p3, p0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;->applicationId:Ljava/lang/String;

    return-void
.end method

.method private final toDomainException(Lcom/stripe/android/core/exception/StripeException;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)Lcom/stripe/android/core/exception/StripeException;
    .locals 10

    .line 53
    invoke-virtual {p1}, Lcom/stripe/android/core/exception/StripeException;->getStripeError()Lcom/stripe/android/core/StripeError;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 54
    invoke-virtual {v0}, Lcom/stripe/android/core/StripeError;->getExtraFields()Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const-string v3, "institution_unavailable"

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, v2

    .line 55
    :goto_0
    invoke-virtual {v0}, Lcom/stripe/android/core/StripeError;->getExtraFields()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v2, "expected_to_be_available_at"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 57
    :cond_1
    const-string v0, "true"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 58
    move-object v0, v2

    check-cast v0, Ljava/lang/CharSequence;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 64
    :cond_2
    new-instance v3, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;

    .line 68
    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, v2}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide v7

    const/4 v6, 0x1

    move-object v9, p1

    move v5, p2

    move-object v4, p3

    .line 64
    invoke-direct/range {v3 .. v9}, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZZJLcom/stripe/android/core/exception/StripeException;)V

    check-cast v3, Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;

    goto :goto_2

    :cond_3
    :goto_1
    move-object v9, p1

    move v5, p2

    move-object v4, p3

    .line 58
    new-instance p1, Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;

    invoke-direct {p1, v4, v5, v9}, Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZLcom/stripe/android/core/exception/StripeException;)V

    move-object v3, p1

    check-cast v3, Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;

    .line 64
    :goto_2
    check-cast v3, Lcom/stripe/android/core/exception/StripeException;

    goto :goto_3

    :cond_4
    move-object v9, p1

    move-object v3, v9

    :goto_3
    if-nez v3, :cond_5

    goto :goto_4

    :cond_5
    return-object v3

    :cond_6
    move-object v9, p1

    :goto_4
    return-object v9
.end method


# virtual methods
.method public final getConfiguration()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    return-object v0
.end method

.method public final getRepository()Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    return-object v0
.end method

.method public final invoke(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;-><init>(Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 32
    iget v2, v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;->L$2:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    iget-object p1, v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iget-object v0, v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p3

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 37
    :try_start_1
    iget-object p3, p0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;->repository:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    .line 38
    iget-object v2, p0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;->configuration:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;->getFinancialConnectionsSessionClientSecret()Ljava/lang/String;

    move-result-object v2

    .line 40
    iget-object v4, p0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;->applicationId:Ljava/lang/String;

    .line 37
    iput-object p0, v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession$invoke$1;->label:I

    invoke-interface {p3, v2, v4, p1, v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;->postAuthorizationSession(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3
    :try_end_1
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    :try_start_2
    check-cast p3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;
    :try_end_2
    .catch Lcom/stripe/android/core/exception/StripeException; {:try_start_2 .. :try_end_2} :catch_0

    return-object p3

    :catch_1
    move-exception p3

    move-object v0, p0

    .line 44
    :goto_2
    invoke-static {p2}, Lcom/stripe/android/financialconnections/features/common/ManifestExtensionsKt;->showManualEntryInErrors(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)Z

    move-result p2

    .line 43
    invoke-direct {v0, p3, p2, p1}, Lcom/stripe/android/financialconnections/domain/PostAuthorizationSession;->toDomainException(Lcom/stripe/android/core/exception/StripeException;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object p1

    throw p1
.end method
