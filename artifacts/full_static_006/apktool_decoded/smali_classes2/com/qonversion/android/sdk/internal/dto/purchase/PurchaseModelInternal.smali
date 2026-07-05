.class public Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;
.super Ljava/lang/Object;
.source "PurchaseModelInternal.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0010\u0018\u00002\u00020\u0001B\u000f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u001b\u0008\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\tB\u000f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bB+\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\u0011J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0006R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;",
        "",
        "purchaseModel",
        "Lcom/qonversion/android/sdk/dto/QPurchaseModel;",
        "(Lcom/qonversion/android/sdk/dto/QPurchaseModel;)V",
        "product",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "options",
        "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
        "(Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V",
        "Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;",
        "(Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;)V",
        "productId",
        "",
        "oldProductId",
        "updatePolicy",
        "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V",
        "getOldProductId",
        "()Ljava/lang/String;",
        "getOptions",
        "()Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
        "getProductId",
        "getUpdatePolicy",
        "()Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;",
        "enrich",
        "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;",
        "oldProduct",
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
.field private final oldProductId:Ljava/lang/String;

.field private final options:Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

.field private final productId:Ljava/lang/String;

.field private final updatePolicy:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/dto/QPurchaseModel;)V
    .locals 11

    const-string v0, "purchaseModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QPurchaseModel;->getProductId()Ljava/lang/String;

    move-result-object v0

    .line 19
    new-instance v10, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QPurchaseModel;->getOfferId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QPurchaseModel;->getApplyOffer$sdk_release()Z

    move-result v4

    const/16 v8, 0x39

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;-><init>(Ljava/util/List;Ljava/lang/String;ZLcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x0

    .line 15
    invoke-direct {p0, v0, p1, p1, v10}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V

    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;)V
    .locals 13

    const-string v0, "purchaseModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->getProductId()Ljava/lang/String;

    move-result-object v0

    .line 31
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->getOldProductId()Ljava/lang/String;

    move-result-object v1

    .line 32
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->getUpdatePolicy()Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    move-result-object v2

    .line 33
    new-instance v12, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->getOfferId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QPurchaseUpdateModel;->getApplyOffer$sdk_release()Z

    move-result v6

    const/16 v10, 0x39

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v3, v12

    invoke-direct/range {v3 .. v11}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;-><init>(Ljava/util/List;Ljava/lang/String;ZLcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 29
    invoke-direct {p0, v0, v1, v2, v12}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V

    return-void
.end method

.method public constructor <init>(Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V
    .locals 2

    const-string v0, "product"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getQonversionID()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 24
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;->getOldProduct$sdk_release()Lcom/qonversion/android/sdk/dto/products/QProduct;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getQonversionID()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz p2, :cond_1

    .line 25
    invoke-virtual {p2}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;->getUpdatePolicy$sdk_release()Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    move-result-object v0

    .line 22
    :cond_1
    invoke-direct {p0, p1, v1, v0, p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 22
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;-><init>(Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V
    .locals 1

    const-string v0, "productId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->productId:Ljava/lang/String;

    .line 11
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->oldProductId:Ljava/lang/String;

    .line 12
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->updatePolicy:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    .line 13
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->options:Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    return-void
.end method


# virtual methods
.method public final enrich(Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;
    .locals 7

    const-string v0, "product"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    new-instance v0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;

    .line 37
    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->productId:Ljava/lang/String;

    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->updatePolicy:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->options:Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    move-object v1, v0

    move-object v3, p1

    move-object v4, p2

    .line 36
    invoke-direct/range {v1 .. v6}, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternalEnriched;-><init>(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Lcom/qonversion/android/sdk/dto/QPurchaseOptions;)V

    return-object v0
.end method

.method public final getOldProductId()Ljava/lang/String;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->oldProductId:Ljava/lang/String;

    return-object v0
.end method

.method public final getOptions()Lcom/qonversion/android/sdk/dto/QPurchaseOptions;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->options:Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    return-object v0
.end method

.method public final getProductId()Ljava/lang/String;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->productId:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatePolicy()Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseModelInternal;->updatePolicy:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    return-object v0
.end method
