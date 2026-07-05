.class final Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "DefaultRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1;->invoke(Lcom/qonversion/android/sdk/internal/CallBackKt;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lretrofit2/Response<",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lretrofit2/Response;",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
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
.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 111
    check-cast p1, Lretrofit2/Response;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1$1;->invoke(Lretrofit2/Response;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lretrofit2/Response;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Response<",
            "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
            ">;)V"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->access$getLogger$p(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;)Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object v0

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    invoke-static {v1, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->access$getLogMessage(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lretrofit2/Response;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "remoteConfigRequest - "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    .line 113
    invoke-virtual {p1}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    if-nez v0, :cond_0

    .line 115
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    invoke-static {v1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->access$getErrorMapper$p(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;)Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->getErrorFromResponse(Lretrofit2/Response;)Lcom/qonversion/android/sdk/dto/QonversionError;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    goto :goto_0

    .line 117
    :cond_0
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->isCorrect$sdk_release()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 118
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;

    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;->onSuccess(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V

    goto :goto_0

    .line 120
    :cond_1
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfig$1$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;

    new-instance v6, Lcom/qonversion/android/sdk/dto/QonversionError;

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->RemoteConfigurationNotAvailable:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v6}, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    :goto_0
    return-void
.end method
