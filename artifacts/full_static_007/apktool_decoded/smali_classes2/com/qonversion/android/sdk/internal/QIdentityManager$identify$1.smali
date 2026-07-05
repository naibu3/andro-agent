.class final Lcom/qonversion/android/sdk/internal/QIdentityManager$identify$1;
.super Lkotlin/jvm/internal/Lambda;
.source "QIdentityManager.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QIdentityManager;->identify(Ljava/lang/String;Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "resultUserID",
        "",
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
.field final synthetic $callback:Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;

.field final synthetic $userID:Ljava/lang/String;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QIdentityManager;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/QIdentityManager;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QIdentityManager$identify$1;->this$0:Lcom/qonversion/android/sdk/internal/QIdentityManager;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QIdentityManager$identify$1;->$userID:Ljava/lang/String;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/QIdentityManager$identify$1;->$callback:Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 21
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/QIdentityManager$identify$1;->invoke(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 2

    const-string v0, "resultUserID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QIdentityManager$identify$1;->this$0:Lcom/qonversion/android/sdk/internal/QIdentityManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QIdentityManager;->access$getUserInfoService$p(Lcom/qonversion/android/sdk/internal/QIdentityManager;)Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    move-result-object v0

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QIdentityManager$identify$1;->$userID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->storePartnersIdentityId(Ljava/lang/String;)V

    .line 24
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 25
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QIdentityManager$identify$1;->this$0:Lcom/qonversion/android/sdk/internal/QIdentityManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QIdentityManager;->access$getUserInfoService$p(Lcom/qonversion/android/sdk/internal/QIdentityManager;)Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;->storeQonversionUserId(Ljava/lang/String;)V

    .line 28
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QIdentityManager$identify$1;->$callback:Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;->onSuccess(Ljava/lang/String;)V

    return-void
.end method
