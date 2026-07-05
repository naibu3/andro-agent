.class public final Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;
.super Ljava/lang/Object;
.source "QRemoteConfigManager.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;,
        Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQRemoteConfigManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QRemoteConfigManager.kt\ncom/qonversion/android/sdk/internal/QRemoteConfigManager\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,248:1\n526#2:249\n511#2,6:250\n1855#3,2:256\n1855#3,2:258\n1855#3,2:260\n1726#3,3:263\n1603#3,9:266\n1855#3:275\n1856#3:277\n1612#3:278\n1855#3,2:279\n1#4:262\n1#4:276\n*S KotlinDebug\n*F\n+ 1 QRemoteConfigManager.kt\ncom/qonversion/android/sdk/internal/QRemoteConfigManager\n*L\n45#1:249\n45#1:250,6\n46#1:256,2\n48#1:258,2\n58#1:260,2\n130#1:263,3\n131#1:266,9\n131#1:275\n131#1:277\n131#1:278\n244#1:279,2\n131#1:276\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001:\u0002>?B\u0017\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%J\u0016\u0010&\u001a\u00020!2\u0006\u0010\'\u001a\u00020\u00122\u0006\u0010$\u001a\u00020(J\u0016\u0010)\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%J\u0016\u0010*\u001a\u00020!2\u0006\u0010\'\u001a\u00020\u00122\u0006\u0010$\u001a\u00020(J+\u0010+\u001a\u00020!2\u0008\u0010,\u001a\u0004\u0018\u00010\u00122\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020!0.\u00a2\u0006\u0002\u00080H\u0002J(\u00101\u001a\u0002022\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001042\u0006\u00105\u001a\u0002062\u0006\u0010$\u001a\u000202H\u0002J\u0006\u00107\u001a\u00020!J\u001a\u00108\u001a\u00020!2\u0008\u0010,\u001a\u0004\u0018\u00010\u00122\u0008\u0010$\u001a\u0004\u0018\u00010/J\u000e\u00109\u001a\u00020!2\u0006\u0010$\u001a\u000202J$\u00109\u001a\u00020!2\u000c\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u0012042\u0006\u00105\u001a\u0002062\u0006\u0010$\u001a\u000202J\u0006\u0010:\u001a\u00020!J\u000e\u0010;\u001a\u00020!2\u0006\u0010<\u001a\u00020=R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001f\u00a8\u0006@"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;",
        "",
        "remoteConfigService",
        "Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;",
        "fallbacksService",
        "Lcom/qonversion/android/sdk/internal/services/QFallbacksService;",
        "(Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;Lcom/qonversion/android/sdk/internal/services/QFallbacksService;)V",
        "fallbackData",
        "Lcom/qonversion/android/sdk/dto/QFallbackObject;",
        "getFallbackData",
        "()Lcom/qonversion/android/sdk/dto/QFallbackObject;",
        "fallbackData$delegate",
        "Lkotlin/Lazy;",
        "listRequests",
        "",
        "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;",
        "loadingStates",
        "",
        "",
        "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;",
        "userPropertiesManager",
        "Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;",
        "getUserPropertiesManager",
        "()Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;",
        "setUserPropertiesManager",
        "(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V",
        "userStateProvider",
        "Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;",
        "getUserStateProvider",
        "()Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;",
        "setUserStateProvider",
        "(Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;)V",
        "attachUserToExperiment",
        "",
        "experimentId",
        "groupId",
        "callback",
        "Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;",
        "attachUserToRemoteConfiguration",
        "remoteConfigurationId",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;",
        "detachUserFromExperiment",
        "detachUserFromRemoteConfiguration",
        "fireToCallbacks",
        "contextKey",
        "action",
        "Lkotlin/Function1;",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;",
        "Lkotlin/ExtensionFunctionType;",
        "getRemoteConfigListCallbackWrapper",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
        "contextKeys",
        "",
        "includeEmptyContextKey",
        "",
        "handlePendingRequests",
        "loadRemoteConfig",
        "loadRemoteConfigList",
        "onUserUpdate",
        "userChangingRequestFailedWithError",
        "error",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "ListRequestData",
        "LoadingState",
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
.field private final fallbackData$delegate:Lkotlin/Lazy;

.field private final fallbacksService:Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

.field private final listRequests:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;",
            ">;"
        }
    .end annotation
.end field

.field private loadingStates:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;",
            ">;"
        }
    .end annotation
.end field

.field private final remoteConfigService:Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;

.field public userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

.field public userStateProvider:Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;Lcom/qonversion/android/sdk/internal/services/QFallbacksService;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "remoteConfigService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fallbacksService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->remoteConfigService:Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;

    .line 21
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->fallbacksService:Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

    .line 23
    new-instance p1, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$fallbackData$2;

    invoke-direct {p1, p0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$fallbackData$2;-><init>(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)V

    check-cast p1, Lkotlin/jvm/functions/Function0;

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->fallbackData$delegate:Lkotlin/Lazy;

    .line 40
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast p1, Ljava/util/Map;

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    .line 41
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->listRequests:Ljava/util/List;

    return-void
.end method

.method public static final synthetic access$fireToCallbacks(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->fireToCallbacks(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$getFallbackData(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)Lcom/qonversion/android/sdk/dto/QFallbackObject;
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->getFallbackData()Lcom/qonversion/android/sdk/dto/QFallbackObject;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getFallbacksService$p(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)Lcom/qonversion/android/sdk/internal/services/QFallbacksService;
    .locals 0

    .line 19
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->fallbacksService:Lcom/qonversion/android/sdk/internal/services/QFallbacksService;

    return-object p0
.end method

.method public static final synthetic access$getRemoteConfigListCallbackWrapper(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->getRemoteConfigListCallbackWrapper(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getRemoteConfigService$p(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;
    .locals 0

    .line 19
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->remoteConfigService:Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;

    return-object p0
.end method

.method private final fireToCallbacks(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 240
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 241
    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->setInProgress(Z)V

    .line 242
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->getCallbacks()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    .line 243
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->getCallbacks()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 244
    check-cast v0, Ljava/lang/Iterable;

    .line 279
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;

    .line 244
    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final getFallbackData()Lcom/qonversion/android/sdk/dto/QFallbackObject;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->fallbackData$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/dto/QFallbackObject;

    return-object v0
.end method

.method private final getRemoteConfigListCallbackWrapper(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
            ")",
            "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;"
        }
    .end annotation

    .line 198
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    .line 199
    new-instance v6, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;

    move-object v0, v6

    move-object v1, p3

    move-object v3, p0

    move-object v4, p1

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;Ljava/util/Map;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/util/List;Z)V

    check-cast v6, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    return-object v6
.end method


# virtual methods
.method public final attachUserToExperiment(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V
    .locals 2

    const-string v0, "experimentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "groupId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    invoke-static {}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManagerKt;->access$getEmptyContextKey$p()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->setLoadedConfig(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V

    .line 167
    :goto_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->remoteConfigService:Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;

    invoke-virtual {v0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;->attachUserToExperiment(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V

    return-void
.end method

.method public final attachUserToRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V
    .locals 2

    const-string v0, "remoteConfigurationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    invoke-static {}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManagerKt;->access$getEmptyContextKey$p()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->setLoadedConfig(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V

    .line 180
    :goto_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->remoteConfigService:Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;

    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;->attachUserToRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V

    return-void
.end method

.method public final detachUserFromExperiment(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V
    .locals 2

    const-string v0, "experimentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    invoke-static {}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManagerKt;->access$getEmptyContextKey$p()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->setLoadedConfig(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V

    .line 172
    :goto_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->remoteConfigService:Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;

    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;->detachUserFromExperiment(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;)V

    return-void
.end method

.method public final detachUserFromRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V
    .locals 2

    const-string v0, "remoteConfigurationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    invoke-static {}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManagerKt;->access$getEmptyContextKey$p()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->setLoadedConfig(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V

    .line 188
    :goto_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->remoteConfigService:Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;

    invoke-virtual {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;->detachUserFromRemoteConfiguration(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V

    return-void
.end method

.method public final getUserPropertiesManager()Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "userPropertiesManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getUserStateProvider()Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->userStateProvider:Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "userStateProvider"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final handlePendingRequests()V
    .locals 6

    .line 45
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    .line 249
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v1, Ljava/util/Map;

    .line 250
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 45
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    invoke-virtual {v3}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->getCallbacks()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    .line 252
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 46
    :cond_1
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 256
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 46
    invoke-virtual {p0, v1, v2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadRemoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V

    goto :goto_1

    .line 48
    :cond_2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->listRequests:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 258
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;

    .line 49
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;->getContextKeys()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 50
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;->getIncludeEmptyContextKey()Z

    move-result v4

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;->getCallback()Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    move-result-object v5

    invoke-virtual {p0, v3, v4, v5}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadRemoteConfigList(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    .line 49
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_3

    :cond_4
    move-object v3, v2

    :goto_3
    if-nez v3, :cond_3

    .line 51
    move-object v3, p0

    check-cast v3, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    .line 52
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;->getCallback()Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadRemoteConfigList(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    goto :goto_2

    :cond_5
    return-void
.end method

.method public final loadRemoteConfig(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V
    .locals 8

    .line 68
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 69
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->getLoadedConfig()Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 70
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->getUserStateProvider()Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;

    move-result-object v2

    invoke-interface {v2}, Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;->isUserStable()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_2

    if-eqz p2, :cond_1

    .line 72
    invoke-interface {p2, v0}, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;->onSuccess(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V

    :cond_1
    return-void

    .line 76
    :cond_2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    if-nez v0, :cond_3

    new-instance v0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;-><init>(Lcom/qonversion/android/sdk/dto/QRemoteConfig;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 77
    :cond_3
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_4

    .line 80
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->getCallbacks()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    :cond_4
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->getUserStateProvider()Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;

    move-result-object p2

    invoke-interface {p2}, Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;->isUserStable()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->isInProgress()Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_1

    :cond_5
    const/4 p2, 0x1

    .line 87
    invoke-virtual {v0, p2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->setInProgress(Z)V

    .line 88
    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->setLoadedConfig(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V

    .line 90
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->getUserPropertiesManager()Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    move-result-object p2

    new-instance v1, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4;

    invoke-direct {v1, p0, p1, v0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4;-><init>(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;)V

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;

    invoke-virtual {p2, v1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->forceSendProperties(Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;)V

    :cond_6
    :goto_1
    return-void
.end method

.method public final loadRemoteConfigList(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
    .locals 8

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->getUserStateProvider()Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;

    move-result-object v0

    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;->isUserStable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 154
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->listRequests:Ljava/util/List;

    new-instance v7, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v7

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 158
    :cond_0
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->getUserPropertiesManager()Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    move-result-object v0

    new-instance v1, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$3;

    invoke-direct {v1, p0, p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$3;-><init>(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->forceSendProperties(Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;)V

    return-void
.end method

.method public final loadRemoteConfigList(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
    .locals 5
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

    if-eqz p2, :cond_0

    .line 129
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-static {}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManagerKt;->access$getEmptyContextKey$p()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    .line 130
    :goto_0
    check-cast v0, Ljava/lang/Iterable;

    .line 263
    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_3

    .line 264
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 130
    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->getLoadedConfig()Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object v3, v2

    :goto_2
    if-eqz v3, :cond_3

    goto :goto_1

    .line 136
    :cond_3
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->getUserStateProvider()Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;

    move-result-object v0

    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;->isUserStable()Z

    move-result v0

    if-nez v0, :cond_4

    .line 137
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->listRequests:Ljava/util/List;

    new-instance v1, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;

    invoke-direct {v1, p3, p1, p2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$ListRequestData;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;Ljava/util/List;Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 141
    :cond_4
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->getUserPropertiesManager()Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    move-result-object v0

    new-instance v1, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$2;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfigList$2;-><init>(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->forceSendProperties(Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;)V

    return-void

    .line 266
    :cond_5
    :goto_3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/Collection;

    .line 275
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_6
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 274
    check-cast v0, Ljava/lang/String;

    .line 131
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->getLoadedConfig()Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    move-result-object v0

    goto :goto_5

    :cond_7
    move-object v0, v2

    :goto_5
    if-eqz v0, :cond_6

    .line 274
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 278
    :cond_8
    check-cast p1, Ljava/util/List;

    .line 132
    new-instance p2, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;

    invoke-direct {p2, p1}, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;-><init>(Ljava/util/List;)V

    invoke-interface {p3, p2}, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;->onSuccess(Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)V

    return-void
.end method

.method public final onUserUpdate()V
    .locals 1

    .line 64
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, Ljava/util/Map;

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    return-void
.end method

.method public final setUserPropertiesManager(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->userPropertiesManager:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    return-void
.end method

.method public final setUserStateProvider(Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->userStateProvider:Lcom/qonversion/android/sdk/internal/provider/UserStateProvider;

    return-void
.end method

.method public final userChangingRequestFailedWithError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->loadingStates:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 260
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 59
    new-instance v2, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$userChangingRequestFailedWithError$1$1;

    invoke-direct {v2, p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$userChangingRequestFailedWithError$1$1;-><init>(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v1, v2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->fireToCallbacks(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_0
    return-void
.end method
