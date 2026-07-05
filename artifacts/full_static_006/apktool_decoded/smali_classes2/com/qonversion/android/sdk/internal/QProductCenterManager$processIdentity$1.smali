.class public final Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;
.super Ljava/lang/Object;
.source "QProductCenterManager.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QProductCenterManager;->processIdentity(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0008H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "com/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1",
        "Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;",
        "onError",
        "",
        "error",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "onSuccess",
        "qonversionUid",
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
.field final synthetic $currentUserID:Ljava/lang/String;

.field final synthetic $identityId:Ljava/lang/String;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->$currentUserID:Ljava/lang/String;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->$identityId:Ljava/lang/String;

    .line 224
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 249
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$setProcessingPartnersIdentityId$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V

    .line 251
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$executeEntitlementsBlock(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 252
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getRemoteConfigManager$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->userChangingRequestFailedWithError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    .line 254
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->$identityId:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$fireIdentityError(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/String;)V
    .locals 4

    const-string v0, "qonversionUid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$setPendingPartnersIdentityId$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V

    .line 227
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$setProcessingPartnersIdentityId$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V

    .line 229
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->$currentUserID:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 230
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    const/4 v0, 0x1

    invoke-static {p1, v1, v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->handlePendingRequests$default(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lcom/qonversion/android/sdk/dto/QonversionError;ILjava/lang/Object;)V

    .line 231
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->$identityId:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$fireIdentitySuccess(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V

    goto :goto_0

    .line 233
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getInternalConfig$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/InternalConfig;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/InternalConfig;->setUid(Ljava/lang/String;)V

    .line 234
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getRemoteConfigManager$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->onUserUpdate()V

    .line 235
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getLaunchResultCache$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    move-result-object p1

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->clearPermissionsCache()V

    .line 236
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    sget-object v0, Lcom/qonversion/android/sdk/internal/api/RequestTrigger;->Identify:Lcom/qonversion/android/sdk/internal/api/RequestTrigger;

    new-instance v1, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1$onSuccess$1;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1;->$identityId:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$processIdentity$1$onSuccess$1;-><init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Ljava/lang/String;)V

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    invoke-virtual {p1, v0, v1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->launch(Lcom/qonversion/android/sdk/internal/api/RequestTrigger;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    :goto_0
    return-void
.end method
