.class public final Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;
.super Ljava/lang/Object;
.source "QRemoteConfigManager.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->getRemoteConfigListCallbackWrapper(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQRemoteConfigManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QRemoteConfigManager.kt\ncom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,248:1\n1855#2,2:249\n766#2:251\n857#2,2:252\n1#3:254\n*S KotlinDebug\n*F\n+ 1 QRemoteConfigManager.kt\ncom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1\n*L\n201#1:249,2\n225#1:251\n225#1:252,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0008H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "com/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1",
        "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
        "onError",
        "",
        "error",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "onSuccess",
        "remoteConfigList",
        "Lcom/qonversion/android/sdk/dto/QRemoteConfigList;",
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
.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

.field final synthetic $contextKeys:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $includeEmptyContextKey:Z

.field final synthetic $localLoadingStates:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;Ljava/util/Map;Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;Ljava/util/List;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;",
            ">;",
            "Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->$localLoadingStates:Ljava/util/Map;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->$contextKeys:Ljava/util/List;

    iput-boolean p5, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->$includeEmptyContextKey:Z

    .line 199
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 7

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/UtilsKt;->getShouldFireFallback(Lcom/qonversion/android/sdk/dto/QonversionError;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 213
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void

    .line 217
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->this$0:Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;->access$getFallbackData(Lcom/qonversion/android/sdk/internal/QRemoteConfigManager;)Lcom/qonversion/android/sdk/dto/QFallbackObject;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QFallbackObject;->getRemoteConfigList()Lcom/qonversion/android/sdk/dto/QRemoteConfigList;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    .line 222
    :cond_1
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->$contextKeys:Ljava/util/List;

    const/4 v1, 0x0

    if-nez p1, :cond_2

    const/4 p1, 0x1

    .line 223
    invoke-static {v0, v1, p1, v1}, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->copy$default(Lcom/qonversion/android/sdk/dto/QRemoteConfigList;Ljava/util/List;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/QRemoteConfigList;

    move-result-object p1

    goto/16 :goto_1

    .line 225
    :cond_2
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->getRemoteConfigs()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->$contextKeys:Ljava/util/List;

    .line 251
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/Collection;

    .line 252
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    .line 225
    move-object v6, v2

    check-cast v6, Ljava/lang/Iterable;

    invoke-virtual {v5}, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->getSource()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    move-result-object v5

    invoke-virtual {v5}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->getContextKey()Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 252
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 253
    :cond_4
    check-cast v3, Ljava/util/List;

    .line 251
    check-cast v3, Ljava/util/Collection;

    .line 225
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    .line 226
    iget-boolean v2, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->$includeEmptyContextKey:Z

    if-eqz v2, :cond_7

    .line 227
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->getRemoteConfigs()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->getSource()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    move-result-object v3

    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->getContextKey()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_5

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_5

    move-object v1, v2

    :cond_6
    check-cast v1, Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    if-eqz v1, :cond_7

    .line 228
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 231
    :cond_7
    new-instance v0, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;-><init>(Ljava/util/List;)V

    move-object p1, v0

    .line 234
    :goto_1
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->onSuccess(Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)V

    return-void

    .line 217
    :cond_8
    :goto_2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    move-object v1, p0

    check-cast v1, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;

    .line 218
    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void
.end method

.method public onSuccess(Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)V
    .locals 11

    const-string v0, "remoteConfigList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QRemoteConfigList;->getRemoteConfigs()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->$localLoadingStates:Ljava/util/Map;

    .line 249
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/dto/QRemoteConfig;

    .line 202
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/QRemoteConfig;->getSource()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;

    move-result-object v3

    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;->getContextKey()Ljava/lang/String;

    move-result-object v3

    .line 203
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    if-nez v4, :cond_0

    new-instance v4, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;

    const/4 v9, 0x7

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, v4

    invoke-direct/range {v5 .. v10}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;-><init>(Lcom/qonversion/android/sdk/dto/QRemoteConfig;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 204
    :cond_0
    invoke-virtual {v4, v2}, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$LoadingState;->setLoadedConfig(Lcom/qonversion/android/sdk/dto/QRemoteConfig;)V

    .line 205
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 208
    :cond_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QRemoteConfigManager$getRemoteConfigListCallbackWrapper$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;->onSuccess(Lcom/qonversion/android/sdk/dto/QRemoteConfigList;)V

    return-void
.end method
