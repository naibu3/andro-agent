.class public final Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView$onAfterUpdateTransaction$1;
.super Ljava/lang/Object;
.source "AddToWalletButtonView.kt"

# interfaces
.implements Lcom/bumptech/glide/request/RequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;->onAfterUpdateTransaction()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/request/RequestListener<",
        "Landroid/graphics/drawable/Drawable;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J>\u0010\u000c\u001a\u00020\u00042\u0008\u0010\r\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016\u00a8\u0006\u0010"
    }
    d2 = {
        "com/reactnativestripesdk/pushprovisioning/AddToWalletButtonView$onAfterUpdateTransaction$1",
        "Lcom/bumptech/glide/request/RequestListener;",
        "Landroid/graphics/drawable/Drawable;",
        "onLoadFailed",
        "",
        "e",
        "Lcom/bumptech/glide/load/engine/GlideException;",
        "model",
        "",
        "target",
        "Lcom/bumptech/glide/request/target/Target;",
        "isFirstResource",
        "onResourceReady",
        "resource",
        "dataSource",
        "Lcom/bumptech/glide/load/DataSource;",
        "stripe_stripe-react-native_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $sourceToLoad:Ljava/lang/Object;

.field final synthetic this$0:Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;


# direct methods
.method constructor <init>(Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView$onAfterUpdateTransaction$1;->this$0:Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;

    iput-object p2, p0, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView$onAfterUpdateTransaction$1;->$sourceToLoad:Ljava/lang/Object;

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadFailed(Lcom/bumptech/glide/load/engine/GlideException;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Z)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/engine/GlideException;",
            "Ljava/lang/Object;",
            "Lcom/bumptech/glide/request/target/Target<",
            "Landroid/graphics/drawable/Drawable;",
            ">;Z)Z"
        }
    .end annotation

    .line 100
    iget-object p1, p0, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView$onAfterUpdateTransaction$1;->this$0:Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;

    .line 101
    iget-object p2, p0, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView$onAfterUpdateTransaction$1;->$sourceToLoad:Ljava/lang/Object;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Failed to load the source from "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "Failed"

    invoke-static {p3, p2}, Lcom/reactnativestripesdk/utils/ErrorsKt;->createError(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p2

    .line 100
    invoke-virtual {p1, p2}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;->dispatchEvent(Lcom/facebook/react/bridge/WritableMap;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onResourceReady(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/drawable/Drawable;",
            "Ljava/lang/Object;",
            "Lcom/bumptech/glide/request/target/Target<",
            "Landroid/graphics/drawable/Drawable;",
            ">;",
            "Lcom/bumptech/glide/load/DataSource;",
            "Z)Z"
        }
    .end annotation

    .line 113
    iget-object p2, p0, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView$onAfterUpdateTransaction$1;->this$0:Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;

    .line 114
    new-instance p3, Landroid/graphics/drawable/RippleDrawable;

    .line 115
    const-string p4, "#e0e0e0"

    invoke-static {p4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p4

    invoke-static {p4}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p4

    const/4 p5, 0x0

    .line 114
    invoke-direct {p3, p4, p1, p5}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    check-cast p3, Landroid/graphics/drawable/Drawable;

    .line 113
    invoke-virtual {p2, p3}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0

    .line 93
    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-virtual/range {p0 .. p5}, Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView$onAfterUpdateTransaction$1;->onResourceReady(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z

    move-result p1

    return p1
.end method
