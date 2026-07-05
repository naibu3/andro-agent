.class public final Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;
.super Ljava/lang/Object;
.source "QExceptionManager.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/internal/logger/ExceptionManager;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQExceptionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QExceptionManager.kt\ncom/qonversion/android/sdk/internal/logger/QExceptionManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1#2:118\n1855#3,2:119\n*S KotlinDebug\n*F\n+ 1 QExceptionManager.kt\ncom/qonversion/android/sdk/internal/logger/QExceptionManager\n*L\n61#1:119,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0010H\u0002J\u0008\u0010\u001e\u001a\u00020\u0019H\u0002R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;",
        "Lcom/qonversion/android/sdk/internal/logger/ExceptionManager;",
        "repository",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "intervalConfig",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        "headersProvider",
        "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;",
        "moshi",
        "Lcom/squareup/moshi/Moshi;",
        "(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/squareup/moshi/Moshi;)V",
        "contextRef",
        "Ljava/lang/ref/WeakReference;",
        "Landroid/content/Context;",
        "exceptionAdapter",
        "Lcom/squareup/moshi/JsonAdapter;",
        "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;",
        "reportsDir",
        "Ljava/io/File;",
        "getAvailableReportNames",
        "",
        "",
        "getContentOfCrashReport",
        "filename",
        "initialize",
        "",
        "context",
        "prepareCrashData",
        "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;",
        "exception",
        "sendCrashReportsInBackground",
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
.field private contextRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final exceptionAdapter:Lcom/squareup/moshi/JsonAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/squareup/moshi/JsonAdapter<",
            "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final headersProvider:Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

.field private final intervalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

.field private reportsDir:Ljava/io/File;

.field private final repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;


# direct methods
.method public static synthetic $r8$lambda$NZuRJ31U4mEILM1qf3yuDGwUJ8Q(Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;)V
    .locals 0

    invoke-static {p0}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->sendCrashReportsInBackground$lambda$2(Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;)V

    return-void
.end method

.method public static synthetic $r8$lambda$gT_bpCSOFhU_-78MVGzYXt0_ynE(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->getAvailableReportNames$lambda$3(Ljava/io/File;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/squareup/moshi/Moshi;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intervalConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headersProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moshi"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 27
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->intervalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    .line 28
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->headersProvider:Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    .line 33
    const-class p1, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;

    invoke-virtual {p4, p1}, Lcom/squareup/moshi/Moshi;->adapter(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    const-string p2, "adapter(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->exceptionAdapter:Lcom/squareup/moshi/JsonAdapter;

    return-void
.end method

.method public static final synthetic access$getContextRef$p(Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->contextRef:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method private final getAvailableReportNames()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 75
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->reportsDir:Ljava/io/File;

    const/4 v1, 0x0

    const-string v2, "reportsDir"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->reportsDir:Ljava/io/File;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    move-result v0

    if-nez v0, :cond_2

    .line 76
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager$$ExternalSyntheticLambda1;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager$$ExternalSyntheticLambda1;-><init>()V

    .line 80
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->reportsDir:Ljava/io/File;

    if-nez v3, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v1, v3

    :goto_0
    invoke-virtual {v1, v0}, Ljava/io/File;->list(Ljava/io/FilenameFilter;)[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_5

    :cond_4
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :cond_5
    return-object v0
.end method

.method private static final getAvailableReportNames$lambda$3(Ljava/io/File;Ljava/lang/String;)Z
    .locals 3

    .line 79
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 p0, 0x2

    const/4 v0, 0x0

    const-string v1, ".qonversion.stacktrace"

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, p0, v0}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private final getContentOfCrashReport(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;
    .locals 7

    .line 84
    const-string v0, "append(...)"

    const-string v1, "QExceptionManager"

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->contextRef:Ljava/lang/ref/WeakReference;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const-string v2, "contextRef"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v3

    :cond_0
    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    if-nez v2, :cond_1

    move-object p1, p0

    check-cast p1, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;

    return-object v3

    .line 86
    :cond_1
    invoke-virtual {v2, p1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_0

    :cond_2
    move-object v4, v3

    :goto_0
    if-nez v4, :cond_3

    goto :goto_4

    .line 87
    :cond_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    :try_start_0
    new-instance v5, Ljava/io/BufferedReader;

    new-instance v6, Ljava/io/InputStreamReader;

    invoke-virtual {v2, p1}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object p1

    check-cast p1, Ljava/io/InputStream;

    invoke-direct {v6, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    check-cast v6, Ljava/io/Reader;

    invoke-direct {v5, v6}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    check-cast v5, Ljava/io/Closeable;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    move-object p1, v5

    check-cast p1, Ljava/io/BufferedReader;

    .line 91
    :goto_1
    invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 92
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xa

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    .line 94
    :cond_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    :try_start_2
    invoke-static {v5, v3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catchall_0
    move-exception p1

    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-static {v5, p1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p1

    .line 96
    const-string v0, "Failed to read crash report from the file"

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v1, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 99
    :goto_2
    :try_start_5
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->exceptionAdapter:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    move-object v3, p1

    goto :goto_3

    :catch_1
    move-exception p1

    .line 101
    const-string v0, "Failed to parse JSON from the crash report file"

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v1, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_3
    return-object v3

    .line 86
    :cond_5
    :goto_4
    move-object p1, p0

    check-cast p1, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;

    return-object v3
.end method

.method private final prepareCrashData(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;)Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;
    .locals 9

    .line 107
    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;

    new-instance v8, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;

    .line 108
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->headersProvider:Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->getPlatform()Ljava/lang/String;

    move-result-object v2

    .line 109
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->headersProvider:Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->getPlatformVersion()Ljava/lang/String;

    move-result-object v3

    .line 110
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->headersProvider:Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->getSource()Ljava/lang/String;

    move-result-object v4

    .line 111
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->headersProvider:Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->getSourceVersion()Ljava/lang/String;

    move-result-object v5

    .line 112
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->headersProvider:Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;->getProjectKey()Ljava/lang/String;

    move-result-object v6

    .line 113
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->intervalConfig:Lcom/qonversion/android/sdk/internal/InternalConfig;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/InternalConfig;->getUid()Ljava/lang/String;

    move-result-object v7

    move-object v1, v8

    .line 107
    invoke-direct/range {v1 .. v7}, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, p1, v8}, Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;-><init>(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$DeviceInfo;)V

    return-object v0
.end method

.method private final sendCrashReportsInBackground()V
    .locals 2

    .line 58
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    const-string v1, "newSingleThreadExecutor(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    new-instance v1, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager$$ExternalSyntheticLambda0;-><init>(Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final sendCrashReportsInBackground$lambda$2(Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;)V
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->getAvailableReportNames()Ljava/util/List;

    move-result-object v0

    .line 61
    check-cast v0, Ljava/lang/Iterable;

    .line 119
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 62
    invoke-direct {p0, v1}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->getContentOfCrashReport(Ljava/lang/String;)Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 63
    invoke-direct {p0, v2}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->prepareCrashData(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;)Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;

    move-result-object v2

    .line 64
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    new-instance v4, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager$sendCrashReportsInBackground$1$1$1$1;

    invoke-direct {v4, p0, v1}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager$sendCrashReportsInBackground$1$1$1$1;-><init>(Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;Ljava/lang/String;)V

    check-cast v4, Lkotlin/jvm/functions/Function0;

    sget-object v1, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager$sendCrashReportsInBackground$1$1$1$2;->INSTANCE:Lcom/qonversion/android/sdk/internal/logger/QExceptionManager$sendCrashReportsInBackground$1$1$1$2;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-interface {v3, v2, v4, v1}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->crashReport(Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public initialize(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    const-string v1, "getFilesDir(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->reportsDir:Ljava/io/File;

    .line 40
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->contextRef:Ljava/lang/ref/WeakReference;

    .line 42
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->isDebuggable(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 46
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    .line 47
    new-instance v1, Lcom/qonversion/android/sdk/internal/logger/ExceptionHandler;

    .line 48
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const-string v2, "getPackageName(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->reportsDir:Ljava/io/File;

    if-nez v2, :cond_1

    const-string v2, "reportsDir"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 47
    :cond_1
    invoke-direct {v1, p1, v0, v2}, Lcom/qonversion/android/sdk/internal/logger/ExceptionHandler;-><init>(Ljava/lang/String;Ljava/lang/Thread$UncaughtExceptionHandler;Ljava/io/File;)V

    .line 52
    check-cast v1, Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-static {v1}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 54
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;->sendCrashReportsInBackground()V

    return-void
.end method
