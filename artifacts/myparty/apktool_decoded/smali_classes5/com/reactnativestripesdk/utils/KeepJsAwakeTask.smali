.class public final Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;
.super Ljava/lang/Object;
.source "KeepJsAwakeTask.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;",
        "",
        "context",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "taskId",
        "",
        "Ljava/lang/Integer;",
        "start",
        "",
        "stop",
        "stripe_stripe-react-native_release"
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
.field private final context:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private taskId:Ljava/lang/Integer;


# direct methods
.method public static synthetic $r8$lambda$UFtiLgAch7vQxTEuI0BQC_dTKzw(Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;Lcom/facebook/react/jstasks/HeadlessJsTaskContext;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;->start$lambda$0(Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;Lcom/facebook/react/jstasks/HeadlessJsTaskContext;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-void
.end method

.method private static final start$lambda$0(Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;Lcom/facebook/react/jstasks/HeadlessJsTaskContext;)V
    .locals 9

    .line 23
    new-instance v0, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;

    .line 25
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v2

    const-string v1, "createMap(...)"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x10

    const/4 v8, 0x0

    .line 23
    const-string v1, "StripeKeepJsAwakeTask"

    const-wide/16 v3, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;-><init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;JZLcom/facebook/react/jstasks/HeadlessJsTaskRetryPolicy;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 29
    invoke-virtual {p1, v0}, Lcom/facebook/react/jstasks/HeadlessJsTaskContext;->startTask(Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;->taskId:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final start()V
    .locals 2

    .line 20
    sget-object v0, Lcom/facebook/react/jstasks/HeadlessJsTaskContext;->Companion:Lcom/facebook/react/jstasks/HeadlessJsTaskContext$Companion;

    iget-object v1, p0, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    check-cast v1, Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {v0, v1}, Lcom/facebook/react/jstasks/HeadlessJsTaskContext$Companion;->getInstance(Lcom/facebook/react/bridge/ReactContext;)Lcom/facebook/react/jstasks/HeadlessJsTaskContext;

    move-result-object v0

    .line 21
    new-instance v1, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, v0}, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask$$ExternalSyntheticLambda0;-><init>(Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;Lcom/facebook/react/jstasks/HeadlessJsTaskContext;)V

    invoke-static {v1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final stop()V
    .locals 3

    .line 34
    iget-object v0, p0, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;->taskId:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 35
    sget-object v1, Lcom/facebook/react/jstasks/HeadlessJsTaskContext;->Companion:Lcom/facebook/react/jstasks/HeadlessJsTaskContext$Companion;

    iget-object v2, p0, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;->context:Lcom/facebook/react/bridge/ReactApplicationContext;

    check-cast v2, Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {v1, v2}, Lcom/facebook/react/jstasks/HeadlessJsTaskContext$Companion;->getInstance(Lcom/facebook/react/bridge/ReactContext;)Lcom/facebook/react/jstasks/HeadlessJsTaskContext;

    move-result-object v1

    .line 36
    invoke-virtual {v1, v0}, Lcom/facebook/react/jstasks/HeadlessJsTaskContext;->finishTask(I)V

    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;->taskId:Ljava/lang/Integer;

    :cond_0
    return-void
.end method
