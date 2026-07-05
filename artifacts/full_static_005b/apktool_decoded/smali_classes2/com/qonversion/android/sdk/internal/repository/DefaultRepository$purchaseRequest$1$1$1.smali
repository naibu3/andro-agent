.class final Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "DefaultRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1;->invoke(Lretrofit2/Response;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "nextAttemptIndex",
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
.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

.field final synthetic $installDate:J

.field final synthetic $purchase:Lcom/qonversion/android/sdk/internal/purchase/Purchase;

.field final synthetic $qProductId:Ljava/lang/String;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    iput-wide p2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1$1;->$installDate:J

    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1$1;->$purchase:Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    iput-object p5, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1$1;->$qProductId:Ljava/lang/String;

    iput-object p6, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 532
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1$1;->invoke(I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(I)V
    .locals 7

    .line 538
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1$1;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    .line 539
    iget-wide v1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1$1;->$installDate:J

    .line 540
    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1$1;->$purchase:Lcom/qonversion/android/sdk/internal/purchase/Purchase;

    .line 541
    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1$1;->$qProductId:Ljava/lang/String;

    .line 542
    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$purchaseRequest$1$1$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;

    move v6, p1

    .line 538
    invoke-static/range {v0 .. v6}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->access$purchaseRequest(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;JLcom/qonversion/android/sdk/internal/purchase/Purchase;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionLaunchCallback;I)V

    return-void
.end method
