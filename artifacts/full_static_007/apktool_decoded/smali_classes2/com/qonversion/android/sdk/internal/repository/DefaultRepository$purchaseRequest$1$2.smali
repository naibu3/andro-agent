.class final Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$2;
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
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
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
.field final synthetic $attemptIndex:I

.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

.field final synthetic $installDate:J

.field final synthetic $purchase:Lcom/qonversion/android/sdk/internal/purchase/Purchase;

.field final synthetic $qProductId:Ljava/lang/String;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;IJLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$2;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$2;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    iput p3, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$2;->$attemptIndex:I

    iput-wide p4, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$2;->$installDate:J

    iput-object p6, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$2;->$purchase:Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    iput-object p7, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$2;->$qProductId:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 548
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$2;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 14

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 549
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$2;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->access$getLogger$p(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;)Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object v0

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/ErrorsKt;->toQonversionError(Ljava/lang/Throwable;)Lcom/qonversion/android/sdk/dto/QonversionError;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "purchaseRequest - failure - "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->error(Ljava/lang/String;)V

    .line 550
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$2;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    .line 551
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$2;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    .line 552
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/ErrorsKt;->toQonversionError(Ljava/lang/Throwable;)Lcom/qonversion/android/sdk/dto/QonversionError;

    move-result-object v4

    .line 554
    iget v6, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$2;->$attemptIndex:I

    .line 550
    new-instance p1, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$2$1;

    iget-object v8, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$2;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    iget-wide v9, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$2;->$installDate:J

    iget-object v11, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$2;->$purchase:Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    iget-object v12, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$2;->$qProductId:Ljava/lang/String;

    iget-object v13, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$2;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    move-object v7, p1

    invoke-direct/range {v7 .. v13}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$2$1;-><init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V

    move-object v7, p1

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->access$handlePurchaseError(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;Lcom/qonversion/android/sdk/dto/QonversionError;Ljava/lang/Integer;ILkotlin/jvm/functions/Function1;)V

    return-void
.end method
