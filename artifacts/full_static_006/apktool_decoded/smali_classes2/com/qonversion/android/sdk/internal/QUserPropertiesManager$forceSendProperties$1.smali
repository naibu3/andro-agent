.class final Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;
.super Lkotlin/jvm/internal/Lambda;
.source "QUserPropertiesManager.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->forceSendProperties(Lcom/qonversion/android/sdk/listeners/QonversionEmptyCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQUserPropertiesManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QUserPropertiesManager.kt\ncom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1855#2,2:191\n*S KotlinDebug\n*F\n+ 1 QUserPropertiesManager.kt\ncom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1\n*L\n94#1:191,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "result",
        "Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;",
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
.field final synthetic $properties:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;->this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;->$properties:Ljava/util/Map;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 91
    check-cast p1, Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;->invoke(Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;)V
    .locals 6

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;->this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->access$fireCallbacks(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)V

    .line 94
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult;->getPropertyErrors()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;->this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    .line 191
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult$PropertyError;

    .line 95
    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->access$getLogger$p(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object v2

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult$PropertyError;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/SendPropertiesResult$PropertyError;->getError()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Failed to save property "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->error(Ljava/lang/String;)V

    goto :goto_0

    .line 98
    :cond_0
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;->this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->access$setRequestInProgress$p(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;Z)V

    .line 99
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;->this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->access$setRetriesCounter$p(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;I)V

    .line 100
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;->this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    const/4 v0, 0x5

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->access$setRetryDelay$p(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;I)V

    .line 103
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;->this$0:Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;->access$getPropertiesStorage$p(Lcom/qonversion/android/sdk/internal/QUserPropertiesManager;)Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;

    move-result-object p1

    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QUserPropertiesManager$forceSendProperties$1;->$properties:Ljava/util/Map;

    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;->clear(Ljava/util/Map;)V

    return-void
.end method
