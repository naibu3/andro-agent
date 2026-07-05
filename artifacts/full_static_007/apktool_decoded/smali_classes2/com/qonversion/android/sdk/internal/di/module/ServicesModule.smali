.class public final Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;
.super Ljava/lang/Object;
.source "ServicesModule.kt"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;",
        "",
        "()V",
        "provideUserInfoService",
        "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;",
        "cacheStorage",
        "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
        "tokenStorage",
        "Lcom/qonversion/android/sdk/internal/storage/TokenStorage;",
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
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final provideUserInfoService(Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;Lcom/qonversion/android/sdk/internal/storage/TokenStorage;)Lcom/qonversion/android/sdk/internal/services/QUserInfoService;
    .locals 1
    .annotation runtime Lcom/qonversion/android/sdk/internal/di/scope/ApplicationScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "cacheStorage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tokenStorage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    new-instance v0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    check-cast p1, Lcom/qonversion/android/sdk/internal/storage/Cache;

    invoke-direct {v0, p1, p2}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;-><init>(Lcom/qonversion/android/sdk/internal/storage/Cache;Lcom/qonversion/android/sdk/internal/storage/TokenStorage;)V

    return-object v0
.end method
