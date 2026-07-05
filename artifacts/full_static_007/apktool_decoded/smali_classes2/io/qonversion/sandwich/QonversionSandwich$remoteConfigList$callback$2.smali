.class public final Lio/qonversion/sandwich/QonversionSandwich$remoteConfigList$callback$2;
.super Ljava/lang/Object;
.source "QonversionSandwich.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/qonversion/sandwich/QonversionSandwich;->remoteConfigList(Lio/qonversion/sandwich/ResultListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0008H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "io/qonversion/sandwich/QonversionSandwich$remoteConfigList$callback$2",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
        "onError",
        "",
        "error",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "onSuccess",
        "remoteConfigList",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfigList;",
        "sandwich_release"
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
.field final synthetic $resultListener:Lio/qonversion/sandwich/ResultListener;


# direct methods
.method constructor <init>(Lio/qonversion/sandwich/ResultListener;)V
    .locals 0

    iput-object p1, p0, Lio/qonversion/sandwich/QonversionSandwich$remoteConfigList$callback$2;->$resultListener:Lio/qonversion/sandwich/ResultListener;

    .line 269
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 275
    iget-object v0, p0, Lio/qonversion/sandwich/QonversionSandwich$remoteConfigList$callback$2;->$resultListener:Lio/qonversion/sandwich/ResultListener;

    invoke-static {p1}, Lio/qonversion/sandwich/MappersKt;->toSandwichError(Lcom/qonversion/android/sdk/dto/QonversionError;)Lio/qonversion/sandwich/SandwichError;

    move-result-object p1

    invoke-interface {v0, p1}, Lio/qonversion/sandwich/ResultListener;->onError(Lio/qonversion/sandwich/SandwichError;)V

    return-void
.end method

.method public onSuccess(Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)V
    .locals 1

    const-string v0, "remoteConfigList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 271
    iget-object v0, p0, Lio/qonversion/sandwich/QonversionSandwich$remoteConfigList$callback$2;->$resultListener:Lio/qonversion/sandwich/ResultListener;

    invoke-static {p1}, Lio/qonversion/sandwich/MappersKt;->toMap(Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p1}, Lio/qonversion/sandwich/ResultListener;->onSuccess(Ljava/util/Map;)V

    return-void
.end method
