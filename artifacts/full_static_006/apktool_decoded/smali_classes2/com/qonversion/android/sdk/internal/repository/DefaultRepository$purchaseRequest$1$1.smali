.class final Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "DefaultRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1;->invoke(Lcom/qonversion/android/sdk/internal/CallBackKt;)V
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
        "Lcom/qonversion/android/sdk/internal/dto/BaseResponse<",
        "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lretrofit2/Response;",
        "Lcom/qonversion/android/sdk/internal/dto/BaseResponse;",
        "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
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
.field final synthetic $attemptIndex:I

.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

.field final synthetic $installDate:J

.field final synthetic $purchase:Lcom/qonversion/android/sdk/internal/purchase/Purchase;

.field final synthetic $qProductId:Ljava/lang/String;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;IJLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    iput p3, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->$attemptIndex:I

    iput-wide p4, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->$installDate:J

    iput-object p6, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->$purchase:Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    iput-object p7, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->$qProductId:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 526
    check-cast p1, Lretrofit2/Response;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->invoke(Lretrofit2/Response;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lretrofit2/Response;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Response<",
            "Lcom/qonversion/android/sdk/internal/dto/BaseResponse<",
            "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 527
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->access$getLogger$p(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;)Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object v0

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    invoke-static {v1, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->access$getLogMessage(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lretrofit2/Response;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "purchaseRequest - "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->debug(Ljava/lang/String;)V

    .line 528
    invoke-virtual {p1}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/internal/dto/BaseResponse;

    if-eqz v0, :cond_0

    .line 529
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/BaseResponse;->getSuccess()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 530
    iget-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/internal/dto/BaseResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;

    invoke-interface {p1, v0}, Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;->onSuccess(Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;)V

    goto :goto_0

    .line 532
    :cond_0
    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    .line 533
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    .line 534
    invoke-static {v1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->access$getErrorMapper$p(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;)Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;->getErrorFromResponse(Lretrofit2/Response;)Lcom/qonversion/android/sdk/dto/QonversionError;

    move-result-object v3

    .line 535
    invoke-virtual {p1}, Lretrofit2/Response;->code()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 536
    iget v5, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->$attemptIndex:I

    .line 532
    new-instance p1, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1$1;

    iget-object v7, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    iget-wide v8, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->$installDate:J

    iget-object v10, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->$purchase:Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    iget-object v11, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->$qProductId:Ljava/lang/String;

    iget-object v12, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    move-object v6, p1

    invoke-direct/range {v6 .. v12}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    move-object v6, p1

    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v6}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->access$handlePurchaseError(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/dto/QonversionError;Ljava/lang/Integer;ILkotlin/jvm/functions/Function1;)V

    :goto_0
    return-void
.end method
