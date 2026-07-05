.class final Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1$onSuccess$2;
.super Lkotlin/jvm/internal/Lambda;
.source "QonversionInternal.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1;->onSuccess(Ljava/util/Map;)V
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
.field final synthetic $entitlements:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $purchaseCallback:Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1$onSuccess$2;->$purchaseCallback:Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1$onSuccess$2;->$entitlements:Ljava/util/Map;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 416
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1$onSuccess$2;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 416
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1$onSuccess$2;->$purchaseCallback:Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainPurchaseCallback$1$onSuccess$2;->$entitlements:Ljava/util/Map;

    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/listeners/QonversionPurchaseCallback;->onSuccess(Ljava/util/Map;)V

    return-void
.end method
