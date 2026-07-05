.class final Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attribution$2;
.super Lkotlin/jvm/internal/Lambda;
.source "RepositoryWithRateLimits.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->attribution(Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
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
.field final synthetic $conversionInfo:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $from:Ljava/lang/String;

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

.field final synthetic $onSuccess:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attribution$2;->this$0:Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attribution$2;->$conversionInfo:Ljava/util/Map;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attribution$2;->$from:Ljava/lang/String;

    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attribution$2;->$onSuccess:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attribution$2;->$onError:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 160
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attribution$2;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 5

    .line 165
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attribution$2;->this$0:Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;->access$getRepository$p(Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits;)Lcom/qonversion/android/sdk/internal/repository/QRepository;

    move-result-object v0

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attribution$2;->$conversionInfo:Ljava/util/Map;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attribution$2;->$from:Ljava/lang/String;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attribution$2;->$onSuccess:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/repository/RepositoryWithRateLimits$attribution$2;->$onError:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/qonversion/android/sdk/internal/repository/QRepository;->attribution(Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
