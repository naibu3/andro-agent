.class public final Lcom/qonversion/android/sdk/internal/QAttributionManager;
.super Ljava/lang/Object;
.source "QAttributionManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u000c\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u000f\u001a\u00020\u0008J\u0006\u0010\u0010\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/QAttributionManager;",
        "",
        "repository",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "appStateProvider",
        "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;",
        "(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;)V",
        "pendingAttributionProvider",
        "Lcom/qonversion/android/sdk/dto/QAttributionProvider;",
        "pendingData",
        "",
        "",
        "attribution",
        "",
        "data",
        "provider",
        "onAppForeground",
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
.field private final appStateProvider:Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

.field private pendingAttributionProvider:Lcom/qonversion/android/sdk/dto/QAttributionProvider;

.field private pendingData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;)V
    .locals 1

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appStateProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QAttributionManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 9
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QAttributionManager;->appStateProvider:Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

    return-void
.end method


# virtual methods
.method public final attribution(Ljava/util/Map;Lcom/qonversion/android/sdk/dto/QAttributionProvider;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/qonversion/android/sdk/dto/QAttributionProvider;",
            ")V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "provider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QAttributionManager;->appStateProvider:Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;

    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;->getAppState()Lcom/qonversion/android/sdk/internal/AppState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/AppState;->isBackground()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QAttributionManager;->pendingAttributionProvider:Lcom/qonversion/android/sdk/dto/QAttributionProvider;

    .line 28
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QAttributionManager;->pendingData:Ljava/util/Map;

    return-void

    .line 32
    :cond_0
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QAttributionManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/QAttributionProvider;->getId()Ljava/lang/String;

    move-result-object v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lcom/qonversion/android/sdk/internal/repository/QRepository$DefaultImpls;->attribution$default(Lcom/qonversion/android/sdk/internal/repository/QRepository;Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method public final onAppForeground()V
    .locals 8

    .line 15
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QAttributionManager;->pendingAttributionProvider:Lcom/qonversion/android/sdk/dto/QAttributionProvider;

    .line 16
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QAttributionManager;->pendingData:Ljava/util/Map;

    if-eqz v0, :cond_1

    if-eqz v2, :cond_1

    .line 17
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 18
    :cond_0
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QAttributionManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QAttributionProvider;->getId()Ljava/lang/String;

    move-result-object v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/qonversion/android/sdk/internal/repository/QRepository$DefaultImpls;->attribution$default(Lcom/qonversion/android/sdk/internal/repository/QRepository;Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QAttributionManager;->pendingData:Ljava/util/Map;

    .line 21
    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/QAttributionManager;->pendingAttributionProvider:Lcom/qonversion/android/sdk/dto/QAttributionProvider;

    :cond_1
    :goto_0
    return-void
.end method
