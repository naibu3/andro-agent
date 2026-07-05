.class public final Lcom/stripe/android/financialconnections/repository/RealConsumerSessionRepository;
.super Ljava/lang/Object;
.source "ConsumerSessionRepository.kt"

# interfaces
.implements Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nConsumerSessionRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsumerSessionRepository.kt\ncom/stripe/android/financialconnections/repository/RealConsumerSessionRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1755#2,3:70\n*S KotlinDebug\n*F\n+ 1 ConsumerSessionRepository.kt\ncom/stripe/android/financialconnections/repository/RealConsumerSessionRepository\n*L\n66#1:70,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\u000f\u001a\u00020\u0007*\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/repository/RealConsumerSessionRepository;",
        "Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "<init>",
        "(Landroidx/lifecycle/SavedStateHandle;)V",
        "provideConsumerSession",
        "Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;",
        "storeNewConsumerSession",
        "",
        "consumerSession",
        "Lcom/stripe/android/model/ConsumerSession;",
        "publishableKey",
        "",
        "updateConsumerSession",
        "toCached",
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
.field private final savedStateHandle:Landroidx/lifecycle/SavedStateHandle;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/SavedStateHandle;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/stripe/android/financialconnections/repository/RealConsumerSessionRepository;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    return-void
.end method

.method private final toCached(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;)Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;
    .locals 7

    .line 62
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getEmailAddress()Ljava/lang/String;

    move-result-object v1

    .line 63
    invoke-static {p1}, LConsumerSessionExtensionsKt;->getRedactedPhoneNumber(Lcom/stripe/android/model/ConsumerSession;)Ljava/lang/String;

    move-result-object v2

    .line 64
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getClientSecret()Ljava/lang/String;

    move-result-object v3

    .line 66
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerSession;->getVerificationSessions()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 70
    instance-of v0, p1, Ljava/util/Collection;

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    move v5, v4

    goto :goto_1

    .line 71
    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;

    .line 66
    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->getState()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    move-result-object v5

    sget-object v6, Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;->Verified:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    if-eq v5, v6, :cond_3

    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->getType()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    move-result-object v0

    sget-object v5, Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;->SignUp:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    if-ne v0, v5, :cond_2

    :cond_3
    const/4 v4, 0x1

    goto :goto_0

    .line 61
    :goto_1
    new-instance v0, Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method


# virtual methods
.method public provideConsumerSession()Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;
    .locals 2

    .line 43
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/RealConsumerSessionRepository;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "ConsumerSession"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;

    return-object v0
.end method

.method public storeNewConsumerSession(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;)V
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/RealConsumerSessionRepository;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    if-eqz p1, :cond_0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/repository/RealConsumerSessionRepository;->toCached(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;)Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string p2, "ConsumerSession"

    invoke-virtual {v0, p2, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public updateConsumerSession(Lcom/stripe/android/model/ConsumerSession;)V
    .locals 3

    const-string v0, "consumerSession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/repository/RealConsumerSessionRepository;->provideConsumerSession()Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 55
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;->getPublishableKey()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 56
    :goto_0
    iget-object v1, p0, Lcom/stripe/android/financialconnections/repository/RealConsumerSessionRepository;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v2, "ConsumerSession"

    invoke-direct {p0, p1, v0}, Lcom/stripe/android/financialconnections/repository/RealConsumerSessionRepository;->toCached(Lcom/stripe/android/model/ConsumerSession;Ljava/lang/String;)Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
