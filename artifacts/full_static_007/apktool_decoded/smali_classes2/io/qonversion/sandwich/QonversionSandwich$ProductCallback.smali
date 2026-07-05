.class interface abstract Lio/qonversion/sandwich/QonversionSandwich$ProductCallback;
.super Ljava/lang/Object;
.source "QonversionSandwich.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/qonversion/sandwich/QonversionSandwich;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x60a
    name = "ProductCallback"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008b\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"
    }
    d2 = {
        "Lio/qonversion/sandwich/QonversionSandwich$ProductCallback;",
        "",
        "onLoadingFailed",
        "",
        "onProductLoaded",
        "product",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
        "sandwich_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract onLoadingFailed()V
.end method

.method public abstract onProductLoaded(Lcom/qonversion/android/sdk/dto/products/QProduct;)V
.end method
