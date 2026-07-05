.class public final Landroidx/camera/video/PendingRecording;
.super Ljava/lang/Object;
.source "PendingRecording.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPendingRecording.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PendingRecording.kt\nandroidx/camera/video/PendingRecording\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,253:1\n326#2:254\n*S KotlinDebug\n*F\n+ 1 PendingRecording.kt\nandroidx/camera/video/PendingRecording\n*L\n248#1:254\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B!\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0008\u0010\u0014\u001a\u00020\u0003H\u0001J\u0008\u0010\u0015\u001a\u00020\u0005H\u0001J\u0008\u0010\u0016\u001a\u00020\u0007H\u0001J\n\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0001J\u0010\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000cH\u0001J\u0008\u0010\u0010\u001a\u00020\u0011H\u0001J\u0008\u0010\u0012\u001a\u00020\u0011H\u0001J\u0008\u0010\u0013\u001a\u00020\u0011H\u0001J\u0012\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0011H\u0007J\u0008\u0010\u001b\u001a\u00020\u0000H\u0007J\u001e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u000f2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0007J\u001c\u0010\u001c\u001a\u00020\u001d2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0087@\u00a2\u0006\u0002\u0010\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "
    }
    d2 = {
        "Landroidx/camera/video/PendingRecording;",
        "",
        "context",
        "Landroid/content/Context;",
        "recorder",
        "Landroidx/camera/video/Recorder;",
        "outputOptions",
        "Landroidx/camera/video/OutputOptions;",
        "<init>",
        "(Landroid/content/Context;Landroidx/camera/video/Recorder;Landroidx/camera/video/OutputOptions;)V",
        "applicationContext",
        "eventListener",
        "Landroidx/core/util/Consumer;",
        "Landroidx/camera/video/VideoRecordEvent;",
        "listenerExecutor",
        "Ljava/util/concurrent/Executor;",
        "isAudioEnabled",
        "",
        "isAudioInitialMuted",
        "isPersistent",
        "getApplicationContext",
        "getRecorder",
        "getOutputOptions",
        "getListenerExecutor",
        "getEventListener",
        "withAudioEnabled",
        "initialMuted",
        "asPersistentRecording",
        "start",
        "Landroidx/camera/video/Recording;",
        "listener",
        "(Landroidx/core/util/Consumer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "camera-video_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final applicationContext:Landroid/content/Context;

.field private eventListener:Landroidx/core/util/Consumer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/core/util/Consumer<",
            "Landroidx/camera/video/VideoRecordEvent;",
            ">;"
        }
    .end annotation
.end field

.field private isAudioEnabled:Z

.field private isAudioInitialMuted:Z

.field private isPersistent:Z

.field private listenerExecutor:Ljava/util/concurrent/Executor;

.field private final outputOptions:Landroidx/camera/video/OutputOptions;

.field private final recorder:Landroidx/camera/video/Recorder;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/camera/video/Recorder;Landroidx/camera/video/OutputOptions;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recorder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outputOptions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p2, p0, Landroidx/camera/video/PendingRecording;->recorder:Landroidx/camera/video/Recorder;

    .line 54
    iput-object p3, p0, Landroidx/camera/video/PendingRecording;->outputOptions:Landroidx/camera/video/OutputOptions;

    .line 59
    invoke-static {p1}, Landroidx/camera/core/impl/utils/ContextUtil;->getApplicationContext(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    const-string p2, "getApplicationContext(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/camera/video/PendingRecording;->applicationContext:Landroid/content/Context;

    return-void
.end method

.method public static synthetic withAudioEnabled$default(Landroidx/camera/video/PendingRecording;ZILjava/lang/Object;)Landroidx/camera/video/PendingRecording;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 109
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/camera/video/PendingRecording;->withAudioEnabled(Z)Landroidx/camera/video/PendingRecording;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final asPersistentRecording()Landroidx/camera/video/PendingRecording;
    .locals 1

    const/4 v0, 0x1

    .line 192
    iput-boolean v0, p0, Landroidx/camera/video/PendingRecording;->isPersistent:Z

    return-object p0
.end method

.method public final getApplicationContext()Landroid/content/Context;
    .locals 1

    .line 71
    iget-object v0, p0, Landroidx/camera/video/PendingRecording;->applicationContext:Landroid/content/Context;

    return-object v0
.end method

.method public final getEventListener()Landroidx/core/util/Consumer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/core/util/Consumer<",
            "Landroidx/camera/video/VideoRecordEvent;",
            ">;"
        }
    .end annotation

    .line 80
    iget-object v0, p0, Landroidx/camera/video/PendingRecording;->eventListener:Landroidx/core/util/Consumer;

    return-object v0
.end method

.method public final getListenerExecutor()Ljava/util/concurrent/Executor;
    .locals 1

    .line 77
    iget-object v0, p0, Landroidx/camera/video/PendingRecording;->listenerExecutor:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public final getOutputOptions()Landroidx/camera/video/OutputOptions;
    .locals 1

    .line 75
    iget-object v0, p0, Landroidx/camera/video/PendingRecording;->outputOptions:Landroidx/camera/video/OutputOptions;

    return-object v0
.end method

.method public final getRecorder()Landroidx/camera/video/Recorder;
    .locals 1

    .line 73
    iget-object v0, p0, Landroidx/camera/video/PendingRecording;->recorder:Landroidx/camera/video/Recorder;

    return-object v0
.end method

.method public final isAudioEnabled()Z
    .locals 1

    .line 82
    iget-boolean v0, p0, Landroidx/camera/video/PendingRecording;->isAudioEnabled:Z

    return v0
.end method

.method public final isAudioInitialMuted()Z
    .locals 1

    .line 85
    iget-boolean v0, p0, Landroidx/camera/video/PendingRecording;->isAudioInitialMuted:Z

    return v0
.end method

.method public final isPersistent()Z
    .locals 1

    .line 87
    iget-boolean v0, p0, Landroidx/camera/video/PendingRecording;->isPersistent:Z

    return v0
.end method

.method public final start(Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)Landroidx/camera/video/Recording;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Landroidx/core/util/Consumer<",
            "Landroidx/camera/video/VideoRecordEvent;",
            ">;)",
            "Landroidx/camera/video/Recording;"
        }
    .end annotation

    const-string v0, "listenerExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    const-string v0, "Listener Executor can\'t be null."

    invoke-static {p1, v0}, Landroidx/core/util/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    const-string v0, "Event listener can\'t be null"

    invoke-static {p2, v0}, Landroidx/core/util/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    iput-object p1, p0, Landroidx/camera/video/PendingRecording;->listenerExecutor:Ljava/util/concurrent/Executor;

    .line 233
    iput-object p2, p0, Landroidx/camera/video/PendingRecording;->eventListener:Landroidx/core/util/Consumer;

    .line 234
    iget-object p1, p0, Landroidx/camera/video/PendingRecording;->recorder:Landroidx/camera/video/Recorder;

    invoke-virtual {p1, p0}, Landroidx/camera/video/Recorder;->start(Landroidx/camera/video/PendingRecording;)Landroidx/camera/video/Recording;

    move-result-object p1

    const-string/jumbo p2, "start(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final start(Landroidx/core/util/Consumer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/core/util/Consumer<",
            "Landroidx/camera/video/VideoRecordEvent;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/camera/video/Recording;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 254
    invoke-interface {p2}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p2

    .line 248
    sget-object v0, Lkotlin/coroutines/ContinuationInterceptor;->Key:Lkotlin/coroutines/ContinuationInterceptor$Key;

    check-cast v0, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-interface {p2, v0}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object p2

    instance-of v0, p2, Lkotlinx/coroutines/CoroutineDispatcher;

    if-eqz v0, :cond_0

    check-cast p2, Lkotlinx/coroutines/CoroutineDispatcher;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    .line 249
    invoke-static {p2}, Lkotlinx/coroutines/ExecutorsKt;->asExecutor(Lkotlinx/coroutines/CoroutineDispatcher;)Ljava/util/concurrent/Executor;

    move-result-object p2

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->directExecutor()Ljava/util/concurrent/Executor;

    move-result-object p2

    const-string v0, "directExecutor(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    :goto_1
    invoke-virtual {p0, p2, p1}, Landroidx/camera/video/PendingRecording;->start(Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)Landroidx/camera/video/Recording;

    move-result-object p1

    return-object p1
.end method

.method public final withAudioEnabled()Landroidx/camera/video/PendingRecording;
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Landroidx/camera/video/PendingRecording;->withAudioEnabled$default(Landroidx/camera/video/PendingRecording;ZILjava/lang/Object;)Landroidx/camera/video/PendingRecording;

    move-result-object v0

    return-object v0
.end method

.method public final withAudioEnabled(Z)Landroidx/camera/video/PendingRecording;
    .locals 2

    .line 115
    iget-object v0, p0, Landroidx/camera/video/PendingRecording;->applicationContext:Landroid/content/Context;

    .line 116
    const-string v1, "android.permission.RECORD_AUDIO"

    .line 114
    invoke-static {v0, v1}, Landroidx/core/content/PermissionChecker;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 125
    iget-object v0, p0, Landroidx/camera/video/PendingRecording;->recorder:Landroidx/camera/video/Recorder;

    invoke-virtual {v0}, Landroidx/camera/video/Recorder;->isAudioSupported()Z

    move-result v0

    .line 126
    const-string v1, "The Recorder this recording is associated to doesn\'t support audio."

    .line 124
    invoke-static {v0, v1}, Landroidx/core/util/Preconditions;->checkState(ZLjava/lang/String;)V

    const/4 v0, 0x1

    .line 128
    iput-boolean v0, p0, Landroidx/camera/video/PendingRecording;->isAudioEnabled:Z

    .line 129
    iput-boolean p1, p0, Landroidx/camera/video/PendingRecording;->isAudioInitialMuted:Z

    return-object p0

    .line 119
    :cond_0
    new-instance p1, Ljava/lang/SecurityException;

    .line 120
    const-string v0, "Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted."

    .line 119
    invoke-direct {p1, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
