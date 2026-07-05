.class public interface abstract Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;
.super Ljava/lang/Object;
.source "QonversionCallback.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H&\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;",
        "",
        "onError",
        "",
        "error",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "onSuccess",
        "products",
        "",
        "",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
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


# virtual methods
.method public abstract onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
.end method

.method public abstract onSuccess(Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;)V"
        }
    .end annotation
.end method
