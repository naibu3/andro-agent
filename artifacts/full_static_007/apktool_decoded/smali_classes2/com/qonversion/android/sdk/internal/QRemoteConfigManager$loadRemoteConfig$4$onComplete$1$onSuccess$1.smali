.class final Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onSuccess$1;
.super Lkotlin/jvm/internal/Lambda;
.source "QRemoteConfigManager.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1;->onSuccess(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;",
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
.field final synthetic $remoteConfig:Lcom/qonversion/android/sdk/dto/QRemoteConfig;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onSuccess$1;->$remoteConfig:Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 95
    check-cast p1, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onSuccess$1;->invoke(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V
    .locals 1

    const-string v0, "$this$fireToCallbacks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$loadRemoteConfig$4$onComplete$1$onSuccess$1;->$remoteConfig:Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;->onSuccess(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V

    return-void
.end method
