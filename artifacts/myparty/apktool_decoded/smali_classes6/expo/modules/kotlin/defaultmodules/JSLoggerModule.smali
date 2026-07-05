.class public final Lexpo/modules/kotlin/defaultmodules/JSLoggerModule;
.super Lexpo/modules/kotlin/modules/Module;
.source "JSLoggerModule.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/kotlin/defaultmodules/JSLoggerModule$JSLogHandler;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nJSLoggerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JSLoggerModule.kt\nexpo/modules/kotlin/defaultmodules/JSLoggerModule\n+ 2 Module.kt\nexpo/modules/kotlin/modules/ModuleKt\n+ 3 ExpoTrace.kt\nexpo/modules/kotlin/tracing/ExpoTraceKt\n+ 4 Trace.kt\nandroidx/tracing/TraceKt\n+ 5 ModuleDefinitionBuilder.kt\nexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder\n*L\n1#1,93:1\n62#2:94\n14#3:95\n25#3:96\n27#4,3:97\n31#4:102\n110#5,2:100\n*S KotlinDebug\n*F\n+ 1 JSLoggerModule.kt\nexpo/modules/kotlin/defaultmodules/JSLoggerModule\n*L\n39#1:94\n39#1:95\n39#1:96\n39#1:97,3\n39#1:102\n44#1:100,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eH\u0002J\u0018\u0010\u0015\u001a\u00020\u000c2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u000eH\u0002R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0019"
    }
    d2 = {
        "Lexpo/modules/kotlin/defaultmodules/JSLoggerModule;",
        "Lexpo/modules/kotlin/modules/Module;",
        "<init>",
        "()V",
        "value",
        "Lexpo/modules/core/logging/Logger;",
        "logger",
        "getLogger",
        "()Lexpo/modules/core/logging/Logger;",
        "definition",
        "Lexpo/modules/kotlin/modules/ModuleDefinitionData;",
        "reportWarningToLogBox",
        "",
        "warning",
        "",
        "reportExceptionToLogBox",
        "codedException",
        "Lexpo/modules/kotlin/exception/CodedException;",
        "createMessageBundle",
        "Landroid/os/Bundle;",
        "message",
        "reportToLogBox",
        "type",
        "Lexpo/modules/core/logging/LogType;",
        "JSLogHandler",
        "expo-modules-core_release"
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
.field private logger:Lexpo/modules/core/logging/Logger;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lexpo/modules/kotlin/modules/Module;-><init>()V

    return-void
.end method

.method public static final synthetic access$reportToLogBox(Lexpo/modules/kotlin/defaultmodules/JSLoggerModule;Lexpo/modules/core/logging/LogType;Ljava/lang/String;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2}, Lexpo/modules/kotlin/defaultmodules/JSLoggerModule;->reportToLogBox(Lexpo/modules/core/logging/LogType;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$setLogger$p(Lexpo/modules/kotlin/defaultmodules/JSLoggerModule;Lexpo/modules/core/logging/Logger;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lexpo/modules/kotlin/defaultmodules/JSLoggerModule;->logger:Lexpo/modules/core/logging/Logger;

    return-void
.end method

.method private final createMessageBundle(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 2

    .line 67
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 68
    const-string v1, "message"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final reportToLogBox(Lexpo/modules/core/logging/LogType;Ljava/lang/String;)V
    .locals 2

    .line 74
    invoke-static {p1}, Lexpo/modules/kotlin/defaultmodules/JSLoggerModuleKt;->access$getEventName(Lexpo/modules/core/logging/LogType;)Ljava/lang/String;

    move-result-object p1

    .line 75
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 76
    const-string v1, "message"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 73
    invoke-virtual {p0, p1, v0}, Lexpo/modules/kotlin/defaultmodules/JSLoggerModule;->sendEvent(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
    .locals 6

    .line 39
    move-object v0, p0

    check-cast v0, Lexpo/modules/kotlin/modules/Module;

    .line 94
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".ModuleDefinition"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 96
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "[ExpoModulesCore] "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 97
    invoke-static {v1}, Landroidx/tracing/Trace;->beginSection(Ljava/lang/String;)V

    .line 94
    :try_start_0
    new-instance v1, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;

    invoke-direct {v1, v0}, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;-><init>(Lexpo/modules/kotlin/modules/Module;)V

    .line 40
    const-string v0, "ExpoModulesCoreJSLogger"

    invoke-virtual {v1, v0}, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;->Name(Ljava/lang/String;)V

    const/4 v0, 0x5

    .line 42
    new-array v0, v0, [Ljava/lang/String;

    const-string v2, "ExpoModulesCoreJSLogger.onNewError"

    const/4 v3, 0x0

    aput-object v2, v0, v3

    const-string v2, "ExpoModulesCoreJSLogger.onNewWarning"

    const/4 v3, 0x1

    aput-object v2, v0, v3

    const-string v2, "ExpoModulesCoreJSLogger.onNewDebug"

    const/4 v3, 0x2

    aput-object v2, v0, v3

    const-string v2, "ExpoModulesCoreJSLogger.onNewInfo"

    const/4 v3, 0x3

    aput-object v2, v0, v3

    const-string v2, "ExpoModulesCoreJSLogger.onNewTrace"

    const/4 v3, 0x4

    aput-object v2, v0, v3

    invoke-virtual {v1, v0}, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;->Events([Ljava/lang/String;)V

    .line 44
    move-object v0, v1

    check-cast v0, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;

    .line 100
    invoke-virtual {v0}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getEventListeners()Ljava/util/Map;

    move-result-object v0

    sget-object v2, Lexpo/modules/kotlin/events/EventName;->MODULE_CREATE:Lexpo/modules/kotlin/events/EventName;

    new-instance v3, Lexpo/modules/kotlin/events/BasicEventListener;

    sget-object v4, Lexpo/modules/kotlin/events/EventName;->MODULE_CREATE:Lexpo/modules/kotlin/events/EventName;

    new-instance v5, Lexpo/modules/kotlin/defaultmodules/JSLoggerModule$definition$lambda$1$$inlined$OnCreate$1;

    invoke-direct {v5, p0}, Lexpo/modules/kotlin/defaultmodules/JSLoggerModule$definition$lambda$1$$inlined$OnCreate$1;-><init>(Lexpo/modules/kotlin/defaultmodules/JSLoggerModule;)V

    check-cast v5, Lkotlin/jvm/functions/Function0;

    invoke-direct {v3, v4, v5}, Lexpo/modules/kotlin/events/BasicEventListener;-><init>(Lexpo/modules/kotlin/events/EventName;Lkotlin/jvm/functions/Function0;)V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    invoke-virtual {v1}, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;->buildModule()Lexpo/modules/kotlin/modules/ModuleDefinitionData;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    invoke-static {}, Landroidx/tracing/Trace;->endSection()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-static {}, Landroidx/tracing/Trace;->endSection()V

    throw v0
.end method

.method public final getLogger()Lexpo/modules/core/logging/Logger;
    .locals 1

    .line 36
    iget-object v0, p0, Lexpo/modules/kotlin/defaultmodules/JSLoggerModule;->logger:Lexpo/modules/core/logging/Logger;

    return-object v0
.end method

.method public final reportExceptionToLogBox(Lexpo/modules/kotlin/exception/CodedException;)V
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        message = "Use appContext.jsLogger.error(...) instead"
    .end annotation

    const-string v0, "codedException"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    invoke-virtual {p1}, Lexpo/modules/kotlin/exception/CodedException;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lexpo/modules/kotlin/exception/CodedException;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-direct {p0, v0}, Lexpo/modules/kotlin/defaultmodules/JSLoggerModule;->createMessageBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    .line 60
    const-string v0, "ExpoModulesCoreJSLogger.onNewError"

    invoke-virtual {p0, v0, p1}, Lexpo/modules/kotlin/defaultmodules/JSLoggerModule;->sendEvent(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final reportWarningToLogBox(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        message = "Use appContext.jsLogger.warn(...) instead"
    .end annotation

    const-string v0, "warning"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    const-string v0, "ExpoModulesCoreJSLogger.onNewWarning"

    .line 54
    invoke-direct {p0, p1}, Lexpo/modules/kotlin/defaultmodules/JSLoggerModule;->createMessageBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    .line 52
    invoke-virtual {p0, v0, p1}, Lexpo/modules/kotlin/defaultmodules/JSLoggerModule;->sendEvent(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
