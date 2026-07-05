.class final Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfigList$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "DefaultRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfigList$1;->invoke(Lcom/qonversion/android/sdk/internal/CallBackKt;)V
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
        "Ljava/util/List<",
        "+",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDefaultRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultRepository.kt\ncom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfigList$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,691:1\n766#2:692\n857#2,2:693\n*S KotlinDebug\n*F\n+ 1 DefaultRepository.kt\ncom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfigList$1$1\n*L\n144#1:692\n144#1:693,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lretrofit2/Response;",
        "",
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
.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfigList$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfigList$1$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 138
    check-cast p1, Lretrofit2/Response;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfigList$1$1;->invoke(Lretrofit2/Response;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lretrofit2/Response;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Response<",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/QRemoteConfig;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfigList$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->access$getLogger$p(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;)Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object v0

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfigList$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    invoke-static {v1, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->access$getLogMessage(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lretrofit2/Response;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "remoteConfigListRequest for specific context keys - "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    .line 140
    invoke-virtual {p1}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    .line 142
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfigList$1$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfigList$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    invoke-static {v1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->access$getErrorMapper$p(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;)Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->getErrorFromResponse(Lretrofit2/Response;)Lcom/qonversion/android/sdk/dto/QonversionError;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    goto :goto_1

    .line 144
    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    .line 692
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/Collection;

    .line 693
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    .line 144
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->isCorrect$sdk_release()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 693
    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 694
    :cond_2
    check-cast p1, Ljava/util/List;

    .line 144
    new-instance v0, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;

    invoke-direct {v0, p1}, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;-><init>(Ljava/util/List;)V

    .line 145
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$remoteConfigList$1$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;->onSuccess(Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)V

    :goto_1
    return-void
.end method
