.class public final Lcom/qonversion/android/sdk/internal/QIdentityManager;
.super Ljava/lang/Object;
.source "QIdentityManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/QIdentityManager;",
        "",
        "repository",
        "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
        "userInfoService",
        "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;",
        "(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/services/QUserInfoService;)V",
        "currentPartnersIdentityId",
        "",
        "getCurrentPartnersIdentityId",
        "()Ljava/lang/String;",
        "identify",
        "",
        "userID",
        "callback",
        "Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;",
        "logoutIfNeeded",
        "",
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
.field private final repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

.field private final userInfoService:Lcom/qonversion/android/sdk/internal/services/QUserInfoService;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/services/QUserInfoService;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userInfoService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QIdentityManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    .line 15
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QIdentityManager;->userInfoService:Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    return-void
.end method

.method public static final synthetic access$getUserInfoService$p(Lcom/qonversion/android/sdk/internal/QIdentityManager;)Lcom/qonversion/android/sdk/internal/services/QUserInfoService;
    .locals 0

    .line 13
    iget-object p0, p0, Lcom/qonversion/android/sdk/internal/QIdentityManager;->userInfoService:Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    return-object p0
.end method


# virtual methods
.method public final getCurrentPartnersIdentityId()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QIdentityManager;->userInfoService:Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->getPartnersIdentityId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final identify(Ljava/lang/String;Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;)V
    .locals 4

    const-string v0, "userID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QIdentityManager;->userInfoService:Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->obtainUserID()Ljava/lang/String;

    move-result-object v0

    .line 21
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QIdentityManager;->repository:Lcom/qonversion/android/sdk/internal/repository/QRepository;

    new-instance v2, Lcom/qonversion/android/sdk/internal/QIdentityManager$identify$1;

    invoke-direct {v2, p0, p1, p2}, Lcom/qonversion/android/sdk/internal/QIdentityManager$identify$1;-><init>(Lcom/qonversion/android/sdk/internal/QIdentityManager;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    new-instance v3, Lcom/qonversion/android/sdk/internal/QIdentityManager$identify$2;

    invoke-direct {v3, p2}, Lcom/qonversion/android/sdk/internal/QIdentityManager$identify$2;-><init>(Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p1, v0, v2, v3}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->identify(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final logoutIfNeeded()Z
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QIdentityManager;->userInfoService:Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->logoutIfNeeded()Z

    move-result v0

    return v0
.end method
