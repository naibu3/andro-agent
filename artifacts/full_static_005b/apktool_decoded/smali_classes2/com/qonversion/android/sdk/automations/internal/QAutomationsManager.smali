.class public final Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;
.super Ljava/lang/Object;
.source "QAutomationsManager.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 /2\u00020\u0001:\u0001/B\'\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\"\u001a\u00020\u001aJ*\u0010#\u001a\u0012\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0$J\u0014\u0010&\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0$H\u0002J\u001a\u0010\'\u001a\u00020(2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0$J\u001a\u0010)\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 2\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010+J\u0008\u0010,\u001a\u00020\u001aH\u0002J\u0012\u0010-\u001a\u00020\u001a2\u0008\u0010.\u001a\u0004\u0018\u00010 H\u0002R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R6\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c8F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R6\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000c2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000c8F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0010\"\u0004\u0008\u0018\u0010\u0012\u00a8\u00060"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;",
        "",
        "repository",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "eventMapper",
        "Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;",
        "appContext",
        "Landroid/app/Application;",
        "activityProvider",
        "Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;",
        "(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;Landroid/app/Application;Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;)V",
        "<set-?>",
        "Ljava/lang/ref/WeakReference;",
        "Lcom/qonversion/android/sdk/automations/AutomationsDelegate;",
        "automationsDelegate",
        "getAutomationsDelegate",
        "()Ljava/lang/ref/WeakReference;",
        "setAutomationsDelegate",
        "(Ljava/lang/ref/WeakReference;)V",
        "logger",
        "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;",
        "Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;",
        "screenCustomizationDelegate",
        "getScreenCustomizationDelegate",
        "setScreenCustomizationDelegate",
        "automationsDidFailExecuting",
        "",
        "actionResult",
        "Lcom/qonversion/android/sdk/automations/dto/QActionResult;",
        "automationsDidFinishExecuting",
        "automationsDidShowScreen",
        "screenId",
        "",
        "automationsDidStartExecuting",
        "automationsFinished",
        "getNotificationCustomPayload",
        "",
        "messageData",
        "getQueryParams",
        "handlePushIfPossible",
        "",
        "loadScreen",
        "callback",
        "Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;",
        "loadScreenIfPossible",
        "logDelegateErrorForFunctionName",
        "functionName",
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
.field public static final Companion:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$Companion;

.field private static final KEY_CUSTOM_PAYLOAD:Ljava/lang/String; = "qonv.custom_payload"

.field private static final PICK_SCREEN:Ljava/lang/String; = "qonv.pick_screen"

.field private static final QUERY_PARAM_ACTIVE:Ljava/lang/String; = "active"

.field private static final QUERY_PARAM_ACTIVE_VALUE:I = 0x1

.field private static final QUERY_PARAM_TYPE:Ljava/lang/String; = "type"

.field private static final QUERY_PARAM_TYPE_VALUE:Ljava/lang/String; = "screen_view"


# instance fields
.field private final activityProvider:Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;

.field private final appContext:Landroid/app/Application;

.field private volatile automationsDelegate:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/qonversion/android/sdk/automations/AutomationsDelegate;",
            ">;"
        }
    .end annotation
.end field

.field private final eventMapper:Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;

.field private final logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

.field private final repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

.field private volatile screenCustomizationDelegate:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->Companion:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;Landroid/app/Application;Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventMapper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 27
    iput-object p2, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->eventMapper:Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;

    .line 28
    iput-object p3, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->appContext:Landroid/app/Application;

    .line 29
    iput-object p4, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->activityProvider:Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;

    .line 41
    new-instance p1, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    invoke-direct {p1}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;-><init>()V

    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    return-void
.end method

.method public static final synthetic access$getActivityProvider$p(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->activityProvider:Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;

    return-object p0
.end method

.method public static final synthetic access$getAppContext$p(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)Landroid/app/Application;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->appContext:Landroid/app/Application;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    return-object p0
.end method

.method private final getQueryParams()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 176
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "type"

    const-string v2, "screen_view"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 177
    const-string v1, "active"

    const-string v2, "1"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 175
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic loadScreen$default(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 75
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->loadScreen(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;)V

    return-void
.end method

.method private final loadScreenIfPossible()V
    .locals 4

    .line 160
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 161
    invoke-direct {p0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->getQueryParams()Ljava/util/Map;

    move-result-object v1

    .line 160
    new-instance v2, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreenIfPossible$1;

    invoke-direct {v2, p0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreenIfPossible$1;-><init>(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    new-instance v3, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreenIfPossible$2;

    invoke-direct {v3, p0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreenIfPossible$2;-><init>(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->actionPoints(Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final logDelegateErrorForFunctionName(Ljava/lang/String;)V
    .locals 3

    .line 153
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    .line 154
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "AutomationsDelegate."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, "() function can not be executed. It looks like Automations.setDelegate() was not called or delegate has been destroyed by GC"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 153
    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->error(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final automationsDidFailExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    .locals 2

    const-string v0, "actionResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDelegate:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;->automationsDidFailExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_2

    .line 134
    new-instance p1, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsDidFailExecuting$1;

    invoke-direct {p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsDidFailExecuting$1;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getEnclosingMethod()Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-direct {p0, v1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->logDelegateErrorForFunctionName(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final automationsDidFinishExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    .locals 2

    const-string v0, "actionResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDelegate:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;->automationsDidFinishExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_2

    .line 139
    new-instance p1, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsDidFinishExecuting$1;

    invoke-direct {p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsDidFinishExecuting$1;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getEnclosingMethod()Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-direct {p0, v1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->logDelegateErrorForFunctionName(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final automationsDidShowScreen(Ljava/lang/String;)V
    .locals 2

    const-string v0, "screenId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDelegate:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;->automationsDidShowScreen(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_2

    .line 144
    new-instance p1, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsDidShowScreen$1;

    invoke-direct {p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsDidShowScreen$1;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getEnclosingMethod()Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-direct {p0, v1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->logDelegateErrorForFunctionName(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final automationsDidStartExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    .locals 2

    const-string v0, "actionResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDelegate:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;->automationsDidStartExecuting(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_2

    .line 129
    new-instance p1, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsDidStartExecuting$1;

    invoke-direct {p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsDidStartExecuting$1;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getEnclosingMethod()Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-direct {p0, v1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->logDelegateErrorForFunctionName(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final automationsFinished()V
    .locals 2

    .line 148
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDelegate:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;->automationsFinished()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_2

    .line 149
    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsFinished$1;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$automationsFinished$1;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingMethod()Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-direct {p0, v1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->logDelegateErrorForFunctionName(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final declared-synchronized getAutomationsDelegate()Ljava/lang/ref/WeakReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/qonversion/android/sdk/automations/AutomationsDelegate;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    .line 34
    :try_start_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDelegate:Ljava/lang/ref/WeakReference;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final getNotificationCustomPayload(Ljava/util/Map;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "messageData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    const-string v0, "qonv.custom_payload"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 68
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->toMap(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, p1

    :catch_0
    :cond_0
    return-object v0
.end method

.method public final declared-synchronized getScreenCustomizationDelegate()Ljava/lang/ref/WeakReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    .line 39
    :try_start_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->screenCustomizationDelegate:Ljava/lang/ref/WeakReference;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final handlePushIfPossible(Ljava/util/Map;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "messageData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    const-string v0, "qonv.pick_screen"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 46
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->toBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 48
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->logger:Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    const-string v2, "handlePushIfPossible() -> Qonversion push notification was received"

    invoke-virtual {v1, v2}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->release(Ljava/lang/String;)V

    .line 52
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->eventMapper:Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;

    invoke-virtual {v1, p1}, Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;->getEventFromRemoteMessage(Ljava/util/Map;)Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    .line 55
    iget-object v3, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDelegate:Ljava/lang/ref/WeakReference;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;

    if-eqz v3, :cond_0

    invoke-interface {v3, v1, p1}, Lcom/qonversion/android/sdk/automations/AutomationsDelegate;->shouldHandleEvent(Lcom/qonversion/android/sdk/automations/dto/AutomationsEvent;Ljava/util/Map;)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    move v2, p1

    :cond_2
    :goto_1
    if-eqz v2, :cond_3

    .line 59
    invoke-direct {p0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->loadScreenIfPossible()V

    :cond_3
    return v0
.end method

.method public final loadScreen(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;)V
    .locals 3

    const-string v0, "screenId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    new-instance v1, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;-><init>(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    new-instance v2, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$2;

    invoke-direct {v2, p1, p0, p2}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$2;-><init>(Ljava/lang/String;Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1, v1, v2}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->screens(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final declared-synchronized setAutomationsDelegate(Ljava/lang/ref/WeakReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/qonversion/android/sdk/automations/AutomationsDelegate;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    .line 33
    :try_start_0
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->automationsDelegate:Ljava/lang/ref/WeakReference;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized setScreenCustomizationDelegate(Ljava/lang/ref/WeakReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    .line 38
    :try_start_0
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->screenCustomizationDelegate:Ljava/lang/ref/WeakReference;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
