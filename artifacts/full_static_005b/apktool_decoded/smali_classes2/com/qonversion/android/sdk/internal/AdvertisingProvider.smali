.class public final Lcom/qonversion/android/sdk/internal/AdvertisingProvider;
.super Ljava/lang/Object;
.source "AdvertisingProvider.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/AdvertisingProvider$AdvertisingConnection;,
        Lcom/qonversion/android/sdk/internal/AdvertisingProvider$AdvertisingInterface;,
        Lcom/qonversion/android/sdk/internal/AdvertisingProvider$Callback;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/AdvertisingProvider;",
        "",
        "()V",
        "init",
        "",
        "context",
        "Landroid/content/Context;",
        "callback",
        "Lcom/qonversion/android/sdk/internal/AdvertisingProvider$Callback;",
        "AdvertisingConnection",
        "AdvertisingInterface",
        "Callback",
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


# direct methods
.method public static synthetic $r8$lambda$YRBNbeNO0Bri_pY7doY3_xT2U7E(Landroid/content/Context;Lcom/qonversion/android/sdk/internal/AdvertisingProvider$Callback;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/qonversion/android/sdk/internal/AdvertisingProvider;->init$lambda$2(Landroid/content/Context;Lcom/qonversion/android/sdk/internal/AdvertisingProvider$Callback;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final init$lambda$2(Landroid/content/Context;Lcom/qonversion/android/sdk/internal/AdvertisingProvider$Callback;)V
    .locals 4

    const-string v0, "$context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 23
    new-instance v0, Lcom/qonversion/android/sdk/internal/AdvertisingProvider$AdvertisingConnection;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/AdvertisingProvider$AdvertisingConnection;-><init>()V

    .line 24
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.google.android.gms.ads.identifier.service.START"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 25
    const-string v2, "com.google.android.gms"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 27
    move-object v2, v0

    check-cast v2, Landroid/content/ServiceConnection;

    const/4 v3, 0x1

    invoke-virtual {p0, v1, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 28
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Binding to advertising id service failed"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Throwable;

    invoke-interface {p1, p0}, Lcom/qonversion/android/sdk/internal/AdvertisingProvider$Callback;->onFailure(Ljava/lang/Throwable;)V

    return-void

    .line 33
    :cond_0
    :try_start_0
    new-instance v1, Lcom/qonversion/android/sdk/internal/AdvertisingProvider$AdvertisingInterface;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/AdvertisingProvider$AdvertisingConnection;->getBinder$sdk_release()Landroid/os/IBinder;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/qonversion/android/sdk/internal/AdvertisingProvider$AdvertisingInterface;-><init>(Landroid/os/IBinder;)V

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/AdvertisingProvider$AdvertisingInterface;->getId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 34
    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/internal/AdvertisingProvider$Callback;->onSuccess(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception v0

    .line 37
    :try_start_1
    check-cast v0, Ljava/lang/Throwable;

    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/internal/AdvertisingProvider$Callback;->onFailure(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    :cond_1
    :goto_0
    invoke-virtual {p0, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    return-void

    :goto_1
    invoke-virtual {p0, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    throw p1

    .line 20
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Cannot be called from the main thread"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final init(Landroid/content/Context;Lcom/qonversion/android/sdk/internal/AdvertisingProvider$Callback;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance v0, Ljava/lang/Thread;

    .line 41
    new-instance v1, Lcom/qonversion/android/sdk/internal/AdvertisingProvider$$ExternalSyntheticLambda0;

    invoke-direct {v1, p1, p2}, Lcom/qonversion/android/sdk/internal/AdvertisingProvider$$ExternalSyntheticLambda0;-><init>(Landroid/content/Context;Lcom/qonversion/android/sdk/internal/AdvertisingProvider$Callback;)V

    .line 18
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 41
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method
