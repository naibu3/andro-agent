.class final Lcom/qonversion/android/sdk/internal/QProductCenterManager$preparePermissionsResult$actualizePermissions$2;
.super Lkotlin/jvm/internal/Lambda;
.source "QProductCenterManager.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QProductCenterManager;->preparePermissionsResult$actualizePermissions(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "error",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $onError:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onSuccess:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/QProductCenterManager;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/QProductCenterManager;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/dto/QPermission;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$preparePermissionsResult$actualizePermissions$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$preparePermissionsResult$actualizePermissions$2;->$onError:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$preparePermissionsResult$actualizePermissions$2;->$onSuccess:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 959
    check-cast p1, Lcom/qonversion/android/sdk/dto/QonversionError;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$preparePermissionsResult$actualizePermissions$2;->invoke(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 965
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$preparePermissionsResult$actualizePermissions$2;->this$0:Lcom/qonversion/android/sdk/internal/QProductCenterManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QProductCenterManager;->access$getLaunchResultCache$p(Lcom/qonversion/android/sdk/internal/QProductCenterManager;)Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/storage/LaunchResultCacheWrapper;->getActualPermissions()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 967
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$preparePermissionsResult$actualizePermissions$2;->$onSuccess:Lkotlin/jvm/functions/Function1;

    .line 968
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 967
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 969
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$preparePermissionsResult$actualizePermissions$2;->$onError:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
