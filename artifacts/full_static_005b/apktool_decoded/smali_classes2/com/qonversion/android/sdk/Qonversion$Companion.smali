.class public final Lcom/qonversion/android/sdk/Qonversion$Companion;
.super Ljava/lang/Object;
.source "Qonversion.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/Qonversion;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u00048GX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0006\u0010\u0002\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/Qonversion$Companion;",
        "",
        "()V",
        "backingInstance",
        "Lcom/qonversion/android/sdk/Qonversion;",
        "shared",
        "getSharedInstance$annotations",
        "getSharedInstance",
        "()Lcom/qonversion/android/sdk/Qonversion;",
        "initialize",
        "config",
        "Lcom/qonversion/android/sdk/QonversionConfig;",
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
.field static final synthetic $$INSTANCE:Lcom/qonversion/android/sdk/Qonversion$Companion;

.field private static backingInstance:Lcom/qonversion/android/sdk/Qonversion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/qonversion/android/sdk/Qonversion$Companion;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/Qonversion$Companion;-><init>()V

    sput-object v0, Lcom/qonversion/android/sdk/Qonversion$Companion;->$$INSTANCE:Lcom/qonversion/android/sdk/Qonversion$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic getSharedInstance$annotations()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    return-void
.end method


# virtual methods
.method public final getSharedInstance()Lcom/qonversion/android/sdk/Qonversion;
    .locals 2

    .line 42
    sget-object v0, Lcom/qonversion/android/sdk/Qonversion$Companion;->backingInstance:Lcom/qonversion/android/sdk/Qonversion;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lkotlin/UninitializedPropertyAccessException;

    .line 43
    const-string v1, "Qonversion has not been initialized. You should call the initialize method before accessing the shared instance of Qonversion."

    .line 42
    invoke-direct {v0, v1}, Lkotlin/UninitializedPropertyAccessException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final initialize(Lcom/qonversion/android/sdk/QonversionConfig;)Lcom/qonversion/android/sdk/Qonversion;
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 58
    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/qonversion/android/sdk/Qonversion$Companion;->backingInstance:Lcom/qonversion/android/sdk/Qonversion;

    if-eqz v0, :cond_0

    .line 60
    const-string p1, "Qonversion"

    const-string v1, "Qonversion has been initialized already. Multiple instances of Qonversion are not supported now."

    .line 59
    invoke-static {p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0

    .line 66
    :cond_0
    new-instance v0, Lcom/qonversion/android/sdk/internal/InternalConfig;

    invoke-direct {v0, p1}, Lcom/qonversion/android/sdk/internal/InternalConfig;-><init>(Lcom/qonversion/android/sdk/QonversionConfig;)V

    .line 68
    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionInternal;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/QonversionConfig;->getApplication$sdk_release()Landroid/app/Application;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal;-><init>(Lcom/qonversion/android/sdk/internal/InternalConfig;Landroid/app/Application;)V

    .line 69
    check-cast v1, Lcom/qonversion/android/sdk/Qonversion;

    sput-object v1, Lcom/qonversion/android/sdk/Qonversion$Companion;->backingInstance:Lcom/qonversion/android/sdk/Qonversion;

    return-object v1
.end method
