.class public final Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$restore$1;
.super Ljava/lang/Object;
.source "ScreenFragment.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->restore()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "com/qonversion/android/sdk/automations/mvp/ScreenFragment$restore$1",
        "Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;",
        "onError",
        "",
        "error",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "onSuccess",
        "entitlements",
        "",
        "",
        "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;",
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
.field final synthetic $actionResult:Lcom/qonversion/android/sdk/automations/dto/QActionResult;

.field final synthetic this$0:Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$restore$1;->this$0:Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;

    iput-object p2, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$restore$1;->$actionResult:Lcom/qonversion/android/sdk/automations/dto/QActionResult;

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$restore$1;->this$0:Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;

    .line 143
    new-instance v1, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$restore$1$onError$1;

    invoke-direct {v1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$restore$1$onError$1;-><init>()V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getEnclosingMethod()Ljava/lang/reflect/Method;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 145
    :goto_0
    iget-object v2, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$restore$1;->$actionResult:Lcom/qonversion/android/sdk/automations/dto/QActionResult;

    .line 142
    invoke-static {v0, v1, p1, v2}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->access$handleOnErrorCallback(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    return-void
.end method

.method public onSuccess(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;",
            ">;)V"
        }
    .end annotation

    const-string v0, "entitlements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    iget-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$restore$1;->this$0:Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;

    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$restore$1;->$actionResult:Lcom/qonversion/android/sdk/automations/dto/QActionResult;

    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->close(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V

    return-void
.end method
