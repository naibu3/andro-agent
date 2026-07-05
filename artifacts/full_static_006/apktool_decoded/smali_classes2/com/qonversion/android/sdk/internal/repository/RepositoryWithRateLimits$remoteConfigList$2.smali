.class final Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$2;
.super Lkotlin/jvm/internal/Lambda;
.source "RepositoryWithRateLimits.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->remoteConfigList(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
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

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$2;->this$0:Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$2;->$contextKeys:Ljava/util/List;

    iput-boolean p3, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$2;->$includeEmptyContextKey:Z

    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$2;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 52
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$2;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 57
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$2;->this$0:Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->access$getRepository$p(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;)Lcom/qonversion/android/sdk/internal/repository/QRepository;

    move-result-object v0

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$2;->$contextKeys:Ljava/util/List;

    iget-boolean v2, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$2;->$includeEmptyContextKey:Z

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$remoteConfigList$2;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;

    invoke-interface {v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->remoteConfigList(Ljava/util/List;ZLcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;)V

    return-void
.end method
