.class public final Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;
.super Ljava/lang/Object;
.source "QPurchaseOptions.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/dto/QPurchaseOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0000J\u0014\u0010\u0011\u001a\u00020\u00002\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;",
        "",
        "()V",
        "applyOffer",
        "",
        "contextKeys",
        "",
        "",
        "offerId",
        "oldProduct",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "screenUid",
        "updatePolicy",
        "Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;",
        "build",
        "Lcom/qonversion/android/sdk/dto/QPurchaseOptions;",
        "removeOffer",
        "setContextKeys",
        "setOffer",
        "offer",
        "Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;",
        "setOfferId",
        "setOldProduct",
        "setScreenUid",
        "setUpdatePolicy",
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
.field private applyOffer:Z

.field private contextKeys:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private offerId:Ljava/lang/String;

.field private oldProduct:Lcom/qonversion/android/sdk/dto/products/QProduct;

.field private screenUid:Ljava/lang/String;

.field private updatePolicy:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 30
    iput-boolean v0, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->applyOffer:Z

    return-void
.end method


# virtual methods
.method public final build()Lcom/qonversion/android/sdk/dto/QPurchaseOptions;
    .locals 8

    .line 110
    new-instance v7, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->contextKeys:Ljava/util/List;

    iget-object v2, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->offerId:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->applyOffer:Z

    iget-object v4, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->oldProduct:Lcom/qonversion/android/sdk/dto/products/QProduct;

    iget-object v5, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->updatePolicy:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    iget-object v6, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->screenUid:Ljava/lang/String;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/qonversion/android/sdk/dto/QPurchaseOptions;-><init>(Ljava/util/List;Ljava/lang/String;ZLcom/qonversion/android/sdk/dto/products/QProduct;Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;Ljava/lang/String;)V

    return-object v7
.end method

.method public final removeOffer()Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;
    .locals 1

    .line 92
    move-object v0, p0

    check-cast v0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;

    const/4 v0, 0x0

    .line 93
    iput-boolean v0, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->applyOffer:Z

    return-object p0
.end method

.method public final setContextKeys(Ljava/util/List;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;"
        }
    .end annotation

    const-string v0, "contextKeys"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    move-object v0, p0

    check-cast v0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;

    .line 42
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->contextKeys:Ljava/util/List;

    return-object p0
.end method

.method public final setOffer(Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;
    .locals 1

    const-string v0, "offer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    move-object v0, p0

    check-cast v0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;

    .line 74
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/products/QProductOfferDetails;->getOfferId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->offerId:Ljava/lang/String;

    return-object p0
.end method

.method public final setOfferId(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;
    .locals 1

    const-string v0, "offerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    move-object v0, p0

    check-cast v0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;

    .line 85
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->offerId:Ljava/lang/String;

    return-object p0
.end method

.method public final setOldProduct(Lcom/qonversion/android/sdk/dto/products/QProduct;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;
    .locals 1

    const-string v0, "oldProduct"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    move-object v0, p0

    check-cast v0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;

    .line 54
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->oldProduct:Lcom/qonversion/android/sdk/dto/products/QProduct;

    return-object p0
.end method

.method public final setScreenUid(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;
    .locals 1

    const-string v0, "screenUid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    move-object v0, p0

    check-cast v0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;

    .line 102
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->screenUid:Ljava/lang/String;

    return-object p0
.end method

.method public final setUpdatePolicy(Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;)Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;
    .locals 1

    const-string v0, "updatePolicy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    move-object v0, p0

    check-cast v0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;

    .line 65
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/QPurchaseOptions$Builder;->updatePolicy:Lcom/qonversion/android/sdk/dto/QPurchaseUpdatePolicy;

    return-object p0
.end method
