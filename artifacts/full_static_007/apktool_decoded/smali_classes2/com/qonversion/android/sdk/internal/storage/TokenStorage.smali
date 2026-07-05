.class public final Lcom/qonversion/android/sdk/internal/storage/TokenStorage;
.super Ljava/lang/Object;
.source "TokenStorage.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/internal/storage/Storage;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/storage/TokenStorage$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0005\u001a\u00020\u0006H\u0016J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/storage/TokenStorage;",
        "Lcom/qonversion/android/sdk/internal/storage/Storage;",
        "preferences",
        "Landroid/content/SharedPreferences;",
        "(Landroid/content/SharedPreferences;)V",
        "delete",
        "",
        "load",
        "",
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
.field public static final Companion:Lcom/qonversion/android/sdk/internal/storage/TokenStorage$Companion;

.field private static final TOKEN_KEY:Ljava/lang/String; = "token_key"


# instance fields
.field private final preferences:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/qonversion/android/sdk/internal/storage/TokenStorage$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/storage/TokenStorage$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/qonversion/android/sdk/internal/storage/TokenStorage;->Companion:Lcom/qonversion/android/sdk/internal/storage/TokenStorage$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/SharedPreferences;)V
    .locals 1

    const-string v0, "preferences"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/storage/TokenStorage;->preferences:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public delete()V
    .locals 2

    .line 16
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/TokenStorage;->preferences:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "token_key"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public load()Ljava/lang/String;
    .locals 3

    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/storage/TokenStorage;->preferences:Landroid/content/SharedPreferences;

    const-string v1, "token_key"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    return-object v2
.end method
