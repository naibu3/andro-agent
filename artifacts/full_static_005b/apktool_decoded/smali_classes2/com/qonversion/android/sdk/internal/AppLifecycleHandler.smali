.class public final Lcom/qonversion/android/sdk/internal/AppLifecycleHandler;
.super Ljava/lang/Object;
.source "AppLifeCycleHandler.kt"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/AppLifecycleHandler;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "lifecycleDelegate",
        "Lcom/qonversion/android/sdk/internal/LifecycleDelegate;",
        "(Lcom/qonversion/android/sdk/internal/LifecycleDelegate;)V",
        "onStart",
        "",
        "owner",
        "Landroidx/lifecycle/LifecycleOwner;",
        "onStop",
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
.field private final lifecycleDelegate:Lcom/qonversion/android/sdk/internal/LifecycleDelegate;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/LifecycleDelegate;)V
    .locals 1

    const-string v0, "lifecycleDelegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/AppLifecycleHandler;->lifecycleDelegate:Lcom/qonversion/android/sdk/internal/LifecycleDelegate;

    return-void
.end method


# virtual methods
.method public onStart(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/AppLifecycleHandler;->lifecycleDelegate:Lcom/qonversion/android/sdk/internal/LifecycleDelegate;

    invoke-interface {p1}, Lcom/qonversion/android/sdk/internal/LifecycleDelegate;->onAppForeground()V

    return-void
.end method

.method public onStop(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/AppLifecycleHandler;->lifecycleDelegate:Lcom/qonversion/android/sdk/internal/LifecycleDelegate;

    invoke-interface {p1}, Lcom/qonversion/android/sdk/internal/LifecycleDelegate;->onAppBackground()V

    return-void
.end method
