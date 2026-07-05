.class public final Lcom/stripe/attestation/IntegrityStandardRequestManager;
.super Ljava/lang/Object;
.source "IntegrityStandardRequestManager.kt"

# interfaces
.implements Lcom/stripe/attestation/IntegrityRequestManager;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nIntegrityStandardRequestManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntegrityStandardRequestManager.kt\ncom/stripe/attestation/IntegrityStandardRequestManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0016\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0016H\u0096@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J \u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00162\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0096@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ \u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00162\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u0082@\u00a2\u0006\u0004\u0008\u001f\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u000f\u0010\u0010R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "
    }
    d2 = {
        "Lcom/stripe/attestation/IntegrityStandardRequestManager;",
        "Lcom/stripe/attestation/IntegrityRequestManager;",
        "cloudProjectNumber",
        "",
        "logError",
        "Lkotlin/Function2;",
        "",
        "",
        "",
        "factory",
        "Lcom/stripe/attestation/StandardIntegrityManagerFactory;",
        "<init>",
        "(JLkotlin/jvm/functions/Function2;Lcom/stripe/attestation/StandardIntegrityManagerFactory;)V",
        "standardIntegrityManager",
        "Lcom/google/android/play/core/integrity/StandardIntegrityManager;",
        "getStandardIntegrityManager",
        "()Lcom/google/android/play/core/integrity/StandardIntegrityManager;",
        "standardIntegrityManager$delegate",
        "Lkotlin/Lazy;",
        "integrityTokenProvider",
        "Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenProvider;",
        "prepare",
        "Lkotlin/Result;",
        "prepare-IoAF18A",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "requestToken",
        "requestIdentifier",
        "requestToken-gIAlu-s",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "request",
        "requestHash",
        "request-gIAlu-s",
        "stripe-attestation_release"
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
.field private final cloudProjectNumber:J

.field private final factory:Lcom/stripe/attestation/StandardIntegrityManagerFactory;

.field private integrityTokenProvider:Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenProvider;

.field private final logError:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/lang/String;",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final standardIntegrityManager$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$IriHsaRhNuyC6FHuQ7cqhnmNsbE(Lcom/stripe/attestation/IntegrityStandardRequestManager;)Lcom/google/android/play/core/integrity/StandardIntegrityManager;
    .locals 0

    invoke-static {p0}, Lcom/stripe/attestation/IntegrityStandardRequestManager;->standardIntegrityManager_delegate$lambda$0(Lcom/stripe/attestation/IntegrityStandardRequestManager;)Lcom/google/android/play/core/integrity/StandardIntegrityManager;

    move-result-object p0

    return-object p0
.end method

.method public constructor <init>(JLkotlin/jvm/functions/Function2;Lcom/stripe/attestation/StandardIntegrityManagerFactory;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/attestation/StandardIntegrityManagerFactory;",
            ")V"
        }
    .end annotation

    const-string v0, "logError"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-wide p1, p0, Lcom/stripe/attestation/IntegrityStandardRequestManager;->cloudProjectNumber:J

    .line 35
    iput-object p3, p0, Lcom/stripe/attestation/IntegrityStandardRequestManager;->logError:Lkotlin/jvm/functions/Function2;

    .line 36
    iput-object p4, p0, Lcom/stripe/attestation/IntegrityStandardRequestManager;->factory:Lcom/stripe/attestation/StandardIntegrityManagerFactory;

    .line 39
    new-instance p1, Lcom/stripe/attestation/IntegrityStandardRequestManager$$ExternalSyntheticLambda0;

    invoke-direct {p1, p0}, Lcom/stripe/attestation/IntegrityStandardRequestManager$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/attestation/IntegrityStandardRequestManager;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/attestation/IntegrityStandardRequestManager;->standardIntegrityManager$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$request-gIAlu-s(Lcom/stripe/attestation/IntegrityStandardRequestManager;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 32
    invoke-direct {p0, p1, p2}, Lcom/stripe/attestation/IntegrityStandardRequestManager;->request-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final getStandardIntegrityManager()Lcom/google/android/play/core/integrity/StandardIntegrityManager;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/stripe/attestation/IntegrityStandardRequestManager;->standardIntegrityManager$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/play/core/integrity/StandardIntegrityManager;

    return-object v0
.end method

.method private final request-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/attestation/IntegrityStandardRequestManager$request$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$request$1;

    iget v1, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$request$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$request$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$request$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$request$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/attestation/IntegrityStandardRequestManager$request$1;-><init>(Lcom/stripe/attestation/IntegrityStandardRequestManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$request$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 68
    iget v2, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$request$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$request$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/attestation/IntegrityStandardRequestManager;

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 70
    :try_start_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p2, p0

    check-cast p2, Lcom/stripe/attestation/IntegrityStandardRequestManager;

    .line 72
    iget-object p2, p0, Lcom/stripe/attestation/IntegrityStandardRequestManager;->integrityTokenProvider:Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenProvider;

    if-eqz p2, :cond_4

    .line 75
    invoke-static {}, Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenRequest;->builder()Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenRequest$Builder;

    move-result-object v2

    .line 76
    invoke-virtual {v2, p1}, Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenRequest$Builder;->setRequestHash(Ljava/lang/String;)Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenRequest$Builder;

    move-result-object p1

    .line 77
    invoke-virtual {p1}, Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenRequest$Builder;->build()Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenRequest;

    move-result-object p1

    .line 74
    invoke-interface {p2, p1}, Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenProvider;->request(Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenRequest;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    const-string p2, "request(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    iput-object p0, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$request$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$request$1;->label:I

    const/4 p2, 0x0

    invoke-static {p1, p2, v0, v3, p2}, Lcom/stripe/attestation/TaskExtensionsKt;->awaitTask$default(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/CancellationTokenSource;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    .line 68
    :goto_1
    :try_start_2
    check-cast p2, Lcom/google/android/gms/tasks/Task;

    .line 80
    invoke-static {p2}, Lcom/stripe/attestation/TaskExtensionsKt;->toResult(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityToken;

    .line 70
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    .line 73
    :cond_4
    :try_start_3
    const-string p1, "Integrity token provider is not initialized. Call prepare() first."

    .line 71
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p2

    move-object p1, p0

    .line 70
    :goto_2
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 81
    :goto_3
    invoke-static {p2}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p2, Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityToken;

    invoke-virtual {p2}, Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityToken;->token()Ljava/lang/String;

    move-result-object p2

    :cond_5
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 82
    invoke-static {p2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_6

    goto :goto_4

    :cond_6
    :try_start_4
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 83
    iget-object p1, p1, Lcom/stripe/attestation/IntegrityStandardRequestManager;->logError:Lkotlin/jvm/functions/Function2;

    const-string p2, "Integrity - Failed to request integrity token"

    invoke-interface {p1, p2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    sget-object p1, Lcom/stripe/attestation/AttestationError;->Companion:Lcom/stripe/attestation/AttestationError$Companion;

    invoke-virtual {p1, v0}, Lcom/stripe/attestation/AttestationError$Companion;->fromException(Ljava/lang/Throwable;)Lcom/stripe/attestation/AttestationError;

    move-result-object p1

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :goto_4
    return-object p2
.end method

.method private static final standardIntegrityManager_delegate$lambda$0(Lcom/stripe/attestation/IntegrityStandardRequestManager;)Lcom/google/android/play/core/integrity/StandardIntegrityManager;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/stripe/attestation/IntegrityStandardRequestManager;->factory:Lcom/stripe/attestation/StandardIntegrityManagerFactory;

    invoke-interface {p0}, Lcom/stripe/attestation/StandardIntegrityManagerFactory;->create()Lcom/google/android/play/core/integrity/StandardIntegrityManager;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public prepare-IoAF18A(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lkotlin/Unit;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/attestation/IntegrityStandardRequestManager$prepare$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$prepare$1;

    iget v1, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$prepare$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p1, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$prepare$1;->label:I

    sub-int/2addr p1, v2

    iput p1, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$prepare$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$prepare$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/attestation/IntegrityStandardRequestManager$prepare$1;-><init>(Lcom/stripe/attestation/IntegrityStandardRequestManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$prepare$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 42
    iget v2, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$prepare$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$prepare$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/attestation/IntegrityStandardRequestManager;

    iget-object v0, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$prepare$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/attestation/IntegrityStandardRequestManager;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :try_start_1
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p1, p0

    check-cast p1, Lcom/stripe/attestation/IntegrityStandardRequestManager;

    .line 43
    iget-object p1, p0, Lcom/stripe/attestation/IntegrityStandardRequestManager;->integrityTokenProvider:Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenProvider;

    if-eqz p1, :cond_3

    .line 44
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 47
    :cond_3
    invoke-direct {p0}, Lcom/stripe/attestation/IntegrityStandardRequestManager;->getStandardIntegrityManager()Lcom/google/android/play/core/integrity/StandardIntegrityManager;

    move-result-object p1

    .line 49
    invoke-static {}, Lcom/google/android/play/core/integrity/StandardIntegrityManager$PrepareIntegrityTokenRequest;->builder()Lcom/google/android/play/core/integrity/StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder;

    move-result-object v2

    .line 50
    iget-wide v4, p0, Lcom/stripe/attestation/IntegrityStandardRequestManager;->cloudProjectNumber:J

    invoke-virtual {v2, v4, v5}, Lcom/google/android/play/core/integrity/StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder;->setCloudProjectNumber(J)Lcom/google/android/play/core/integrity/StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder;

    move-result-object v2

    .line 51
    invoke-virtual {v2}, Lcom/google/android/play/core/integrity/StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder;->build()Lcom/google/android/play/core/integrity/StandardIntegrityManager$PrepareIntegrityTokenRequest;

    move-result-object v2

    .line 48
    invoke-interface {p1, v2}, Lcom/google/android/play/core/integrity/StandardIntegrityManager;->prepareIntegrityToken(Lcom/google/android/play/core/integrity/StandardIntegrityManager$PrepareIntegrityTokenRequest;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    const-string v2, "prepareIntegrityToken(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    iput-object p0, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$prepare$1;->L$0:Ljava/lang/Object;

    iput-object p0, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$prepare$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$prepare$1;->label:I

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v3, v2}, Lcom/stripe/attestation/TaskExtensionsKt;->awaitTask$default(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/CancellationTokenSource;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v0, p0

    move-object v1, v0

    .line 42
    :goto_1
    :try_start_2
    check-cast p1, Lcom/google/android/gms/tasks/Task;

    .line 54
    invoke-static {p1}, Lcom/stripe/attestation/TaskExtensionsKt;->toResult(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    move-result-object p1

    .line 55
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    move-object v2, p1

    check-cast v2, Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenProvider;

    iput-object v2, v1, Lcom/stripe/attestation/IntegrityStandardRequestManager;->integrityTokenProvider:Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenProvider;

    .line 56
    :cond_5
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenProvider;

    .line 42
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_1
    move-exception p1

    move-object v0, p0

    :goto_2
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 58
    :goto_3
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    check-cast p1, Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenProvider;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_6
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 59
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_7

    goto :goto_4

    :cond_7
    :try_start_3
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 60
    iget-object p1, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager;->logError:Lkotlin/jvm/functions/Function2;

    const-string v0, "Integrity - Failed to prepare integrity token"

    invoke-interface {p1, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    sget-object p1, Lcom/stripe/attestation/AttestationError;->Companion:Lcom/stripe/attestation/AttestationError$Companion;

    invoke-virtual {p1, v1}, Lcom/stripe/attestation/AttestationError$Companion;->fromException(Ljava/lang/Throwable;)Lcom/stripe/attestation/AttestationError;

    move-result-object p1

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception p1

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_4
    return-object p1
.end method

.method public requestToken-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/attestation/IntegrityStandardRequestManager$requestToken$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$requestToken$1;

    iget v1, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$requestToken$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$requestToken$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$requestToken$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$requestToken$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/attestation/IntegrityStandardRequestManager$requestToken$1;-><init>(Lcom/stripe/attestation/IntegrityStandardRequestManager;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$requestToken$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 64
    iget v2, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$requestToken$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 66
    iput v3, v0, Lcom/stripe/attestation/IntegrityStandardRequestManager$requestToken$1;->label:I

    invoke-direct {p0, p1, v0}, Lcom/stripe/attestation/IntegrityStandardRequestManager;->request-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method
