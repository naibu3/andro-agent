.class final Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$identify$1;
.super Lkotlin/jvm/internal/Lambda;
.source "DefaultRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->identify(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/qonversion/android/sdk/internal/CallBackKt<",
        "Lcom/qonversion/android/sdk/internal/dto/Data<",
        "Lcom/qonversion/android/sdk/internal/dto/identity/IdentityResult;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/qonversion/android/sdk/internal/CallBackKt;",
        "Lcom/qonversion/android/sdk/internal/dto/Data;",
        "Lcom/qonversion/android/sdk/internal/dto/identity/IdentityResult;",
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

.field final synthetic $onSuccess:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$identify$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$identify$1;->$onSuccess:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$identify$1;->$onError:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 394
    check-cast p1, Lcom/qonversion/android/sdk/internal/CallBackKt;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$identify$1;->invoke(Lcom/qonversion/android/sdk/internal/CallBackKt;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/internal/CallBackKt;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/CallBackKt<",
            "Lcom/qonversion/android/sdk/internal/dto/Data<",
            "Lcom/qonversion/android/sdk/internal/dto/identity/IdentityResult;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "$this$enqueue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 395
    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$identify$1$1;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$identify$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$identify$1;->$onSuccess:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$identify$1;->$onError:Lkotlin/jvm/functions/Function1;

    invoke-direct {v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$identify$1$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/internal/CallBackKt;->setOnResponse(Lkotlin/jvm/functions/Function1;)V

    .line 405
    new-instance v0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$identify$1$2;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$identify$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$identify$1;->$onError:Lkotlin/jvm/functions/Function1;

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$identify$1$2;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lkotlin/jvm/functions/Function1;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/internal/CallBackKt;->setOnFailure(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
