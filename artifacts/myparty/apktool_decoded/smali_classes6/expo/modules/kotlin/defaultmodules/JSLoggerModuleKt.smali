.class public final Lexpo/modules/kotlin/defaultmodules/JSLoggerModuleKt;
.super Ljava/lang/Object;
.source "JSLoggerModule.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/kotlin/defaultmodules/JSLoggerModuleKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0018\u0010\u000c\u001a\u00020\u0001*\u00020\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f*\u001a\u0008\u0007\u0010\u0007\"\u00020\u00082\u00020\u0008B\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u00a8\u0006\u0010"
    }
    d2 = {
        "moduleName",
        "",
        "onNewError",
        "onNewWarning",
        "onNewDebug",
        "onNewInfo",
        "onNewTrace",
        "ErrorManagerModule",
        "Lexpo/modules/kotlin/defaultmodules/JSLoggerModule;",
        "Lkotlin/Deprecated;",
        "message",
        "Use JSLoggerModule instead",
        "eventName",
        "Lexpo/modules/core/logging/LogType;",
        "getEventName",
        "(Lexpo/modules/core/logging/LogType;)Ljava/lang/String;",
        "expo-modules-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final moduleName:Ljava/lang/String; = "ExpoModulesCoreJSLogger"

.field private static final onNewDebug:Ljava/lang/String; = "ExpoModulesCoreJSLogger.onNewDebug"

.field private static final onNewError:Ljava/lang/String; = "ExpoModulesCoreJSLogger.onNewError"

.field private static final onNewInfo:Ljava/lang/String; = "ExpoModulesCoreJSLogger.onNewInfo"

.field private static final onNewTrace:Ljava/lang/String; = "ExpoModulesCoreJSLogger.onNewTrace"

.field private static final onNewWarning:Ljava/lang/String; = "ExpoModulesCoreJSLogger.onNewWarning"


# direct methods
.method public static synthetic ErrorManagerModule$annotations()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Use JSLoggerModule instead"
    .end annotation

    return-void
.end method

.method public static final synthetic access$getEventName(Lexpo/modules/core/logging/LogType;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/kotlin/defaultmodules/JSLoggerModuleKt;->getEventName(Lexpo/modules/core/logging/LogType;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final getEventName(Lexpo/modules/core/logging/LogType;)Ljava/lang/String;
    .locals 3

    .line 83
    sget-object v0, Lexpo/modules/kotlin/defaultmodules/JSLoggerModuleKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Lexpo/modules/core/logging/LogType;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const-string v0, "ExpoModulesCoreJSLogger.onNewError"

    const-string v1, "ExpoModulesCoreJSLogger.onNewDebug"

    const-string v2, "ExpoModulesCoreJSLogger.onNewTrace"

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    return-object v0

    .line 89
    :pswitch_1
    const-string p0, "ExpoModulesCoreJSLogger.onNewWarning"

    return-object p0

    .line 88
    :pswitch_2
    const-string p0, "ExpoModulesCoreJSLogger.onNewInfo"

    return-object p0

    :pswitch_3
    return-object v1

    :pswitch_4
    return-object v2

    :pswitch_5
    return-object v1

    :pswitch_6
    return-object v2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
