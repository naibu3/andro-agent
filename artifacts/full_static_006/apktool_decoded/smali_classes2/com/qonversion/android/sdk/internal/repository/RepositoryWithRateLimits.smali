.class public final Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;
.super Ljava/lang/Object;
.source "RepositoryWithRateLimits.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/internal/repository/QRepository;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ce\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005Jd\u0010\u0006\u001a\u00020\u00072\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\r\u00a2\u0006\u000c\u0008\u000e\u0012\u0008\u0008\u000f\u0012\u0004\u0008\u0008(\u0010\u0012\u0004\u0012\u00020\u00070\u000c2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\u000e\u0012\u0008\u0008\u000f\u0012\u0004\u0008\u0008(\u0013\u0012\u0004\u0012\u00020\u00070\u000cH\u0016J \u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u001bH\u0016JY\u0010\u001c\u001a\u00020\u00072\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001e0\t2\u0006\u0010\u001f\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010 2#\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\u000e\u0012\u0008\u0008\u000f\u0012\u0004\u0008\u0008(\u0013\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000cH\u0016JA\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020#2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00070 2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\u000e\u0012\u0008\u0008\u000f\u0012\u0004\u0008\u0008(\u0013\u0012\u0004\u0012\u00020\u00070\u000cH\u0016J\u0018\u0010$\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010%\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u001bH\u0016J&\u0010&\u001a\u00020\u00072\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\n0(2\u0006\u0010)\u001a\u00020*2\u0006\u0010\u0017\u001a\u00020+H\u0016JE\u0010,\u001a\u00020\u00072\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020-0(\u0012\u0004\u0012\u00020\u00070\u000c2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\u000e\u0012\u0008\u0008\u000f\u0012\u0004\u0008\u0008(\u0013\u0012\u0004\u0012\u00020\u00070\u000cH\u0016J^\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\n2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\u000c\u0008\u000e\u0012\u0008\u0008\u000f\u0012\u0004\u0008\u0008(1\u0012\u0004\u0012\u00020\u00070\u000c2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\u000e\u0012\u0008\u0008\u000f\u0012\u0004\u0008\u0008(\u0013\u0012\u0004\u0012\u00020\u00070\u000cH\u0016J\u0010\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u000204H\u0016J*\u00105\u001a\u00020\u00072\u0006\u0010)\u001a\u00020*2\u0006\u00105\u001a\u0002062\u0008\u00107\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u000208H\u0016J\u001a\u00109\u001a\u00020\u00072\u0008\u0010:\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020=H\u0016J&\u0010<\u001a\u00020\u00072\u000c\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\n0(2\u0006\u0010?\u001a\u00020@2\u0006\u0010\u0017\u001a\u00020=H\u0016J.\u0010A\u001a\u00020\u00072\u0006\u0010)\u001a\u00020*2\u000c\u0010B\u001a\u0008\u0012\u0004\u0012\u00020C0(2\u0006\u0010\u0017\u001a\u0002082\u0006\u0010D\u001a\u00020EH\u0016JV\u0010F\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\n2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110H\u00a2\u0006\u000c\u0008\u000e\u0012\u0008\u0008\u000f\u0012\u0004\u0008\u0008(I\u0012\u0004\u0012\u00020\u00070\u000c2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\u000e\u0012\u0008\u0008\u000f\u0012\u0004\u0008\u0008(\u0013\u0012\u0004\u0012\u00020\u00070\u000cH\u0016JS\u0010J\u001a\u00020\u00072\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\u00070\u000c2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\u000e\u0012\u0008\u0008\u000f\u0012\u0004\u0008\u0008(\u0013\u0012\u0004\u0012\u00020\u00070\u000cH\u0016J\u0010\u0010M\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\nH\u0016JI\u0010N\u001a\u00020\u00072\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\u000c\u0008\u000e\u0012\u0008\u0008\u000f\u0012\u0004\u0008\u0008(\u0013\u0012\u0004\u0012\u00020\u00070\u000c2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00070 H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006S"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "repository",
        "rateLimiter",
        "Lcom/qonversion/android/sdk/internal/api/RateLimiter;",
        "(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/api/RateLimiter;)V",
        "actionPoints",
        "",
        "queryParams",
        "",
        "",
        "onSuccess",
        "Lkotlin/Function1;",
        "Lcom/qonversion/android/sdk/internal/dto/automations/ActionPointScreen;",
        "Lkotlin/ParameterName;",
        "name",
        "actionPoint",
        "onError",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "error",
        "attachUserToExperiment",
        "experimentId",
        "groupId",
        "callback",
        "Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;",
        "attachUserToRemoteConfiguration",
        "remoteConfigurationId",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;",
        "attribution",
        "conversionInfo",
        "",
        "from",
        "Lkotlin/Function0;",
        "crashReport",
        "crashData",
        "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;",
        "detachUserFromExperiment",
        "detachUserFromRemoteConfiguration",
        "eligibilityForProductIds",
        "productIds",
        "",
        "installDate",
        "",
        "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;",
        "getProperties",
        "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;",
        "identify",
        "userID",
        "currentUserID",
        "identityID",
        "init",
        "requestData",
        "Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;",
        "purchase",
        "Lcom/qonversion/android/sdk/internal/purchase/Purchase;",
        "qProductId",
        "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
        "remoteConfig",
        "contextKey",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;",
        "remoteConfigList",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
        "contextKeys",
        "includeEmptyContextKey",
        "",
        "restore",
        "historyRecords",
        "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
        "requestTrigger",
        "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;",
        "screens",
        "screenId",
        "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;",
        "screen",
        "sendProperties",
        "properties",
        "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;",
        "views",
        "withRateLimitCheck",
        "requestType",
        "Lcom/qonversion/android/sdk/internal/api/RequestType;",
        "hash",
        "",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final rateLimiter:Lcom/qonversion/android/sdk/internal/api/RateLimiter;

.field private final repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/api/RateLimiter;)V
    .locals 1

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rateLimiter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 25
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->rateLimiter:Lcom/qonversion/android/sdk/internal/api/RateLimiter;

    return-void
.end method

.method public static final synthetic access$getRepository$p(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;)Lcom/qonversion/android/sdk/internal/repository/QRepository;
    .locals 0

    .line 23
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    return-object p0
.end method

.method private final withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/api/RequestType;",
            "I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 253
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->rateLimiter:Lcom/qonversion/android/sdk/internal/api/RateLimiter;

    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/api/RateLimiter;->isRateLimitExceeded(Lcom/qonversion/android/sdk/internal/api/RequestType;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 254
    new-instance p1, Lcom/qonversion/android/sdk/dto/QonversionError;

    sget-object v2, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ApiRateLimitExceeded:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 255
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 257
    :cond_0
    iget-object p3, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->rateLimiter:Lcom/qonversion/android/sdk/internal/api/RateLimiter;

    invoke-virtual {p3, p1, p2}, Lcom/qonversion/android/sdk/internal/api/RateLimiter;->saveRequest(Lcom/qonversion/android/sdk/internal/api/RequestType;I)V

    .line 258
    invoke-interface {p4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :goto_0
    return-void
.end method


# virtual methods
.method public actionPoints(Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/dto/automations/ActionPointScreen;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "queryParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSuccess"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    invoke-interface {v0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->actionPoints(Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public attachUserToExperiment(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V
    .locals 4

    const-string v0, "experimentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "groupId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->AttachUserToExperiment:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 78
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    .line 76
    new-instance v2, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attachUserToExperiment$1;

    invoke-direct {v2, p3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attachUserToExperiment$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    new-instance v3, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attachUserToExperiment$2;

    invoke-direct {v3, p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attachUserToExperiment$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public attachUserToRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V
    .locals 4

    const-string v0, "remoteConfigurationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->AttachUserToRemoteConfiguration:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 104
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    .line 102
    new-instance v2, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attachUserToRemoteConfiguration$1;

    invoke-direct {v2, p2}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attachUserToRemoteConfiguration$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    new-instance v3, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attachUserToRemoteConfiguration$2;

    invoke-direct {v3, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attachUserToRemoteConfiguration$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public attribution(Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "conversionInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "from"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->Attribution:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 162
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    .line 160
    new-instance v2, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attribution$1;

    invoke-direct {v2, p4}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attribution$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    new-instance v9, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attribution$2;

    move-object v3, v9

    move-object v4, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move-object v8, p4

    invoke-direct/range {v3 .. v8}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attribution$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    check-cast v9, Lkotlin/jvm/functions/Function0;

    invoke-direct {p0, v0, v1, v2, v9}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public crashReport(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "crashData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSuccess"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    invoke-interface {v0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->crashReport(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public detachUserFromExperiment(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V
    .locals 4

    const-string v0, "experimentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->DetachUserFromExperiment:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 91
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    .line 89
    new-instance v2, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$detachUserFromExperiment$1;

    invoke-direct {v2, p2}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$detachUserFromExperiment$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    new-instance v3, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$detachUserFromExperiment$2;

    invoke-direct {v3, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$detachUserFromExperiment$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public detachUserFromRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V
    .locals 4

    const-string v0, "remoteConfigurationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->DetachUserFromRemoteConfiguration:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 117
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    .line 115
    new-instance v2, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$detachUserFromRemoteConfiguration$1;

    invoke-direct {v2, p2}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$detachUserFromRemoteConfiguration$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    new-instance v3, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$detachUserFromRemoteConfiguration$2;

    invoke-direct {v3, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$detachUserFromRemoteConfiguration$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public eligibilityForProductIds(Ljava/util/List;JLcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;J",
            "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;",
            ")V"
        }
    .end annotation

    const-string v0, "productIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->EligibilityForProductIds:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 197
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {p2, p3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v1, v2

    .line 195
    new-instance v2, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$eligibilityForProductIds$1;

    invoke-direct {v2, p4}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$eligibilityForProductIds$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    new-instance v9, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$eligibilityForProductIds$2;

    move-object v3, v9

    move-object v4, p0

    move-object v5, p1

    move-wide v6, p2

    move-object v8, p4

    invoke-direct/range {v3 .. v8}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$eligibilityForProductIds$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Ljava/util/List;JLcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V

    check-cast v9, Lkotlin/jvm/functions/Function0;

    invoke-direct {p0, v0, v1, v2, v9}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public getProperties(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "onSuccess"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->GetProperties:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 181
    new-instance v1, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$getProperties$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$getProperties$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x0

    invoke-direct {p0, v0, p1, p2, v1}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public identify(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "userID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentUserID"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSuccess"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 211
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->Identify:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 212
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    .line 210
    new-instance v8, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$identify$1;

    move-object v2, v8

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v2 .. v7}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$identify$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v8, Lkotlin/jvm/functions/Function0;

    invoke-direct {p0, v0, v1, p4, v8}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public init(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V
    .locals 4

    const-string v0, "requestData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->Init:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 30
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;->hashCode()I

    move-result v1

    .line 28
    new-instance v2, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$init$1;

    invoke-direct {v2, p1}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$init$1;-><init>(Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    new-instance v3, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$init$2;

    invoke-direct {v3, p0, p1}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$init$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Lcom/qonversion/android/sdk/internal/dto/request/data/InitRequestData;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public purchase(JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V
    .locals 11

    move-object/from16 v6, p5

    const-string v0, "purchase"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    sget-object v7, Lcom/qonversion/android/sdk/internal/api/RequestType;->Purchase:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 132
    invoke-virtual {p3}, Lcom/qonversion/android/sdk/internal/purchase/Purchase;->hashCode()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object v5, p4

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-wide v2, p1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int v8, v0, v1

    .line 130
    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$purchase$1;

    invoke-direct {v0, v6}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$purchase$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    move-object v9, v0

    check-cast v9, Lkotlin/jvm/functions/Function1;

    new-instance v10, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$purchase$2;

    move-object v0, v10

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$purchase$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    check-cast v10, Lkotlin/jvm/functions/Function0;

    move-object v0, p0

    invoke-direct {p0, v7, v8, v9, v10}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public remoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V
    .locals 4

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->RemoteConfig:Lcom/qonversion/android/sdk/internal/api/RequestType;

    if-eqz p1, :cond_0

    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 38
    :goto_0
    new-instance v2, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfig$1;

    invoke-direct {v2, p2}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfig$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    new-instance v3, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfig$2;

    invoke-direct {v3, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfig$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public remoteConfigList(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
    .locals 3

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->RemoteConfigList:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 62
    new-instance v1, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$3;

    invoke-direct {v1, p1}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$3;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    new-instance v2, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$4;

    invoke-direct {v2, p0, p1}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$4;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    check-cast v2, Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public remoteConfigList(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
            ")V"
        }
    .end annotation

    const-string v0, "contextKeys"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestType;->RemoteConfigList:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    .line 52
    new-instance v2, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$1;

    invoke-direct {v2, p3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    new-instance v3, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$2;

    invoke-direct {v3, p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public restore(JLjava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/purchase/PurchaseHistory;",
            ">;",
            "Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;",
            "Lcom/qonversion/android/sdk/internal/api/RequestTrigger;",
            ")V"
        }
    .end annotation

    move-object v5, p4

    const-string v0, "historyRecords"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestTrigger"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    sget-object v7, Lcom/qonversion/android/sdk/internal/api/RequestType;->Restore:Lcom/qonversion/android/sdk/internal/api/RequestType;

    .line 147
    invoke-static {p1, p2}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {p3}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int v8, v0, v1

    .line 145
    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$restore$1;

    invoke-direct {v0, p4}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$restore$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    move-object v9, v0

    check-cast v9, Lkotlin/jvm/functions/Function1;

    new-instance v10, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$restore$2;

    move-object v0, v10

    move-object v1, p0

    move-wide v2, p1

    invoke-direct/range {v0 .. v6}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$restore$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;JLjava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/internal/api/RequestTrigger;)V

    check-cast v10, Lkotlin/jvm/functions/Function0;

    move-object v0, p0

    invoke-direct {p0, v7, v8, v9, v10}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->withRateLimitCheck(Lcom/qonversion/android/sdk/internal/api/RequestType;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public screens(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "screenId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSuccess"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    invoke-interface {v0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->screens(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public sendProperties(Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "properties"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSuccess"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onError"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    invoke-interface {v0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->sendProperties(Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public views(Ljava/lang/String;)V
    .locals 1

    const-string v0, "screenId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->views(Ljava/lang/String;)V

    return-void
.end method
