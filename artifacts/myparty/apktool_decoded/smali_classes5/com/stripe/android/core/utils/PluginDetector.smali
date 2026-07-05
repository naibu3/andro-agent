.class public final Lcom/stripe/android/core/utils/PluginDetector;
.super Ljava/lang/Object;
.source "PluginDetector.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/core/utils/PluginDetector$PluginType;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPluginDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginDetector.kt\ncom/stripe/android/core/utils/PluginDetector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n295#2,2:42\n*S KotlinDebug\n*F\n+ 1 PluginDetector.kt\ncom/stripe/android/core/utils/PluginDetector\n*L\n18#1:42,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u0005H\u0002R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/core/utils/PluginDetector;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "kotlin.jvm.PlatformType",
        "Ljava/lang/String;",
        "pluginType",
        "getPluginType",
        "()Ljava/lang/String;",
        "isPlugin",
        "",
        "className",
        "PluginType",
        "stripe-core_release"
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
.field public static final INSTANCE:Lcom/stripe/android/core/utils/PluginDetector;

.field private static final TAG:Ljava/lang/String;

.field private static final pluginType:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/stripe/android/core/utils/PluginDetector;

    invoke-direct {v0}, Lcom/stripe/android/core/utils/PluginDetector;-><init>()V

    sput-object v0, Lcom/stripe/android/core/utils/PluginDetector;->INSTANCE:Lcom/stripe/android/core/utils/PluginDetector;

    .line 11
    const-string v0, "PluginDetector"

    sput-object v0, Lcom/stripe/android/core/utils/PluginDetector;->TAG:Ljava/lang/String;

    .line 18
    invoke-static {}, Lcom/stripe/android/core/utils/PluginDetector$PluginType;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 42
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/stripe/android/core/utils/PluginDetector$PluginType;

    .line 19
    sget-object v4, Lcom/stripe/android/core/utils/PluginDetector;->INSTANCE:Lcom/stripe/android/core/utils/PluginDetector;

    invoke-virtual {v3}, Lcom/stripe/android/core/utils/PluginDetector$PluginType;->getClassName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v3}, Lcom/stripe/android/core/utils/PluginDetector;->isPlugin(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    .line 18
    :goto_0
    check-cast v1, Lcom/stripe/android/core/utils/PluginDetector$PluginType;

    if-eqz v1, :cond_2

    .line 20
    invoke-virtual {v1}, Lcom/stripe/android/core/utils/PluginDetector$PluginType;->getPluginName()Ljava/lang/String;

    move-result-object v2

    :cond_2
    sput-object v2, Lcom/stripe/android/core/utils/PluginDetector;->pluginType:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final isPlugin(Ljava/lang/String;)Z
    .locals 3

    .line 23
    :try_start_0
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception v0

    .line 26
    sget-object v1, Lcom/stripe/android/core/utils/PluginDetector;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v2, " not found: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final getPluginType()Ljava/lang/String;
    .locals 1

    .line 17
    sget-object v0, Lcom/stripe/android/core/utils/PluginDetector;->pluginType:Ljava/lang/String;

    return-object v0
.end method
