.class public final Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;
.super Ljava/lang/Object;
.source "QUserPropertiesManager.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/internal/FacebookAttributionListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQUserPropertiesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QUserPropertiesManager.kt\ncom/qonversion/android/sdk/internal/QUserPropertiesManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1855#2,2:191\n*S KotlinDebug\n*F\n+ 1 QUserPropertiesManager.kt\ncom/qonversion/android/sdk/internal/QUserPropertiesManager\n*L\n135#1:191,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 42\u00020\u0001:\u00014B7\u0008\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0008\u0010 \u001a\u00020!H\u0002J\u0012\u0010\"\u001a\u00020!2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\u0011J\u0006\u0010$\u001a\u00020!J\u0006\u0010%\u001a\u00020!J\u0012\u0010&\u001a\u00020!2\u0008\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0008\u0010)\u001a\u00020!H\u0007J\u0006\u0010*\u001a\u00020!J\u0010\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020\u001eH\u0007J\u0016\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020(J\u0016\u00100\u001a\u00020!2\u0006\u0010.\u001a\u0002012\u0006\u0010/\u001a\u00020(J\u000e\u00102\u001a\u00020!2\u0006\u0010#\u001a\u000203R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00065"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;",
        "Lcom/qonversion/android/sdk/internal/FacebookAttributionListener;",
        "context",
        "Landroid/app/Application;",
        "repository",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "propertiesStorage",
        "Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;",
        "delayCalculator",
        "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;",
        "appStateProvider",
        "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
        "logger",
        "Lcom/qonversion/android/sdk/internal/logger/Logger;",
        "(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/logger/Logger;)V",
        "completions",
        "",
        "Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;",
        "handler",
        "Landroid/os/Handler;",
        "isRequestInProgress",
        "",
        "isSendingScheduled",
        "productCenterManager",
        "Lcom/qonversion/android/sdk/internal/QProductCenterManager;",
        "getProductCenterManager$sdk_release",
        "()Lcom/qonversion/android/sdk/internal/QProductCenterManager;",
        "setProductCenterManager$sdk_release",
        "(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V",
        "retriesCounter",
        "",
        "retryDelay",
        "fireCallbacks",
        "",
        "forceSendProperties",
        "callback",
        "onAppBackground",
        "onAppForeground",
        "onFbAttributionIdResult",
        "id",
        "",
        "retryPropertiesRequest",
        "sendFacebookAttribution",
        "sendPropertiesWithDelay",
        "delaySec",
        "setCustomUserProperty",
        "key",
        "value",
        "setUserProperty",
        "Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;",
        "userProperties",
        "Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$Companion;

.field private static final LOOPER_THREAD_NAME:Ljava/lang/String; = "userPropertiesThread"

.field private static final PROPERTY_UPLOAD_MIN_DELAY:I = 0x5


# instance fields
.field private final appStateProvider:Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

.field private completions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Landroid/app/Application;

.field private final delayCalculator:Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;

.field private handler:Landroid/os/Handler;

.field private isRequestInProgress:Z

.field private isSendingScheduled:Z

.field private final logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

.field private productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

.field private propertiesStorage:Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;

.field private final repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

.field private retriesCounter:I

.field private retryDelay:I


# direct methods
.method public static synthetic $r8$lambda$ICRXQKXD-2cekJ5qq-_lCUzp7JU(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V
    .locals 0

    invoke-static {p0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->sendPropertiesWithDelay$lambda$1(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->Companion:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;Lcom/qonversion/android/sdk/internal/logger/Logger;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "propertiesStorage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "delayCalculator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appStateProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->context:Landroid/app/Application;

    .line 24
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 25
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->propertiesStorage:Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;

    .line 26
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->delayCalculator:Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;

    .line 27
    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->appStateProvider:Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

    .line 28
    iput-object p6, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    const/4 p1, 0x5

    .line 34
    iput p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->retryDelay:I

    .line 36
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->completions:Ljava/util/List;

    .line 44
    new-instance p1, Landroid/os/HandlerThread;

    const-string p2, "userPropertiesThread"

    invoke-direct {p1, p2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 45
    invoke-virtual {p1}, Landroid/os/HandlerThread;->start()V

    .line 46
    new-instance p2, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {p2, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->handler:Landroid/os/Handler;

    return-void
.end method

.method public static final synthetic access$fireCallbacks(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->fireCallbacks()V

    return-void
.end method

.method public static final synthetic access$getLogger$p(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)Lcom/qonversion/android/sdk/internal/logger/Logger;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    return-object p0
.end method

.method public static final synthetic access$getPropertiesStorage$p(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->propertiesStorage:Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;

    return-object p0
.end method

.method public static final synthetic access$setRequestInProgress$p(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;Z)V
    .locals 0

    .line 22
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->isRequestInProgress:Z

    return-void
.end method

.method public static final synthetic access$setRetriesCounter$p(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;I)V
    .locals 0

    .line 22
    iput p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->retriesCounter:I

    return-void
.end method

.method public static final synthetic access$setRetryDelay$p(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;I)V
    .locals 0

    .line 22
    iput p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->retryDelay:I

    return-void
.end method

.method private final fireCallbacks()V
    .locals 2

    .line 132
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->completions:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    .line 133
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->completions:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 135
    check-cast v0, Ljava/lang/Iterable;

    .line 191
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;

    .line 135
    invoke-interface {v1}, Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;->onComplete()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic forceSendProperties$default(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 73
    :cond_0
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->forceSendProperties(Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;)V

    return-void
.end method

.method private static final sendPropertiesWithDelay$lambda$1(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 186
    invoke-static {p0, v0, v1, v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->forceSendProperties$default(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final forceSendProperties(Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;)V
    .locals 3

    .line 74
    iget-boolean v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->isRequestInProgress:Z

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    .line 76
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->completions:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void

    .line 81
    :cond_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->propertiesStorage:Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;

    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;->getProperties()Ljava/util/Map;

    move-result-object v0

    .line 83
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    if-eqz p1, :cond_2

    .line 85
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->completions:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    const/4 p1, 0x1

    .line 88
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->isRequestInProgress:Z

    const/4 p1, 0x0

    .line 89
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->isSendingScheduled:Z

    .line 91
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    new-instance v1, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;

    invoke-direct {v1, p0, v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;-><init>(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;Ljava/util/Map;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    new-instance v2, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$2;

    invoke-direct {v2, p0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$2;-><init>(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0, v1, v2}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->sendProperties(Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_3
    if-eqz p1, :cond_4

    .line 127
    invoke-interface {p1}, Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;->onComplete()V

    :cond_4
    :goto_0
    return-void
.end method

.method public final getProductCenterManager$sdk_release()Lcom/qonversion/android/sdk/internal/QProductCenterManager;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    return-object v0
.end method

.method public final onAppBackground()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 50
    invoke-static {p0, v0, v1, v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->forceSendProperties$default(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final onAppForeground()V
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->propertiesStorage:Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;

    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;->getProperties()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 55
    iget v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->retryDelay:I

    invoke-virtual {p0, v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->sendPropertiesWithDelay(I)V

    :cond_0
    return-void
.end method

.method public onFbAttributionIdResult(Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 70
    :cond_0
    sget-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->FacebookAttribution:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->getUserPropertyCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->setCustomUserProperty(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final retryPropertiesRequest()V
    .locals 4

    .line 140
    iget v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->retriesCounter:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->retriesCounter:I

    .line 143
    :try_start_0
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->delayCalculator:Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;

    const/4 v2, 0x5

    invoke-virtual {v1, v2, v0}, Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;->countDelay(II)I

    move-result v0

    .line 142
    iput v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->retryDelay:I

    .line 144
    invoke-virtual {p0, v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->sendPropertiesWithDelay(I)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 146
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "The error occurred during properties sending. "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/qonversion/android/sdk/internal/logger/Logger;->error(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final sendFacebookAttribution()V
    .locals 4

    .line 61
    :try_start_0
    new-instance v0, Lcom/qonversion/android/sdk/internal/FacebookAttribution;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/FacebookAttribution;-><init>()V

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->context:Landroid/app/Application;

    invoke-virtual {v1}, Landroid/app/Application;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v2, "getContentResolver(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p0

    check-cast v2, Lcom/qonversion/android/sdk/internal/FacebookAttributionListener;

    invoke-virtual {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/FacebookAttribution;->getAttributionId(Landroid/content/ContentResolver;Lcom/qonversion/android/sdk/internal/FacebookAttributionListener;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 63
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to retrieve facebook attribution "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/qonversion/android/sdk/internal/logger/Logger;->error(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final sendPropertiesWithDelay(I)V
    .locals 3

    .line 179
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->appStateProvider:Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;->getAppState()Lcom/qonversion/android/sdk/internal/AppState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/AppState;->isBackground()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    int-to-long v0, p1

    .line 183
    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->secondsToMilliSeconds(J)J

    move-result-wide v0

    const/4 p1, 0x1

    .line 184
    iput-boolean p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->isSendingScheduled:Z

    .line 185
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->handler:Landroid/os/Handler;

    if-eqz p1, :cond_1

    new-instance v2, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$$ExternalSyntheticLambda0;

    invoke-direct {v2, p0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$$ExternalSyntheticLambda0;-><init>(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void
.end method

.method public final setCustomUserProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    move-object v0, p2

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 164
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->propertiesStorage:Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;

    invoke-interface {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;->save(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    iget-boolean p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->isSendingScheduled:Z

    if-nez p1, :cond_1

    .line 166
    iget p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->retryDelay:I

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->sendPropertiesWithDelay(I)V

    :cond_1
    return-void
.end method

.method public final setProductCenterManager$sdk_release(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->productCenterManager:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    return-void
.end method

.method public final setUserProperty(Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;Ljava/lang/String;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    sget-object v0, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->Custom:Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;

    if-ne p1, v0, :cond_0

    .line 152
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->logger:Lcom/qonversion/android/sdk/internal/logger/Logger;

    const-string p2, "Can not set user property with the key `QUserPropertyKey.Custom`. To set custom user property, use the `setCustomUserProperty` method."

    invoke-interface {p1, p2}, Lcom/qonversion/android/sdk/internal/logger/Logger;->error(Ljava/lang/String;)V

    return-void

    .line 156
    :cond_0
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;->getUserPropertyCode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->setCustomUserProperty(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final userProperties(Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;)V
    .locals 3

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    new-instance v1, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$userProperties$1;

    invoke-direct {v1, p1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$userProperties$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    new-instance v2, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$userProperties$2;

    invoke-direct {v2, p1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$userProperties$2;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionUserPropertiesCallback;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->getProperties(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
