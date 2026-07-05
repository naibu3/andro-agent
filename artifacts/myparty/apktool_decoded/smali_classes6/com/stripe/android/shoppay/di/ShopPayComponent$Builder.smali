.class public interface abstract Lcom/stripe/android/shoppay/di/ShopPayComponent$Builder;
.super Ljava/lang/Object;
.source "ShopPayComponent.kt"


# annotations
.annotation runtime Ldagger/Component$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/shoppay/di/ShopPayComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\u0019\u0010\u0004\u001a\u00020\u00002\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\'\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00002\u0010\u0008\u0001\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0008H\'J\u0018\u0010\n\u001a\u00020\u00002\u000e\u0008\u0001\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\'J\u0012\u0010\u000b\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u000b\u001a\u00020\tH\'J\u0010\u0010\u000c\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH\'J\u0008\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/shoppay/di/ShopPayComponent$Builder;",
        "",
        "context",
        "Landroid/content/Context;",
        "statusBarColor",
        "",
        "(Ljava/lang/Integer;)Lcom/stripe/android/shoppay/di/ShopPayComponent$Builder;",
        "stripeAccountIdProvider",
        "Lkotlin/Function0;",
        "",
        "publishableKeyProvider",
        "paymentElementCallbackIdentifier",
        "shopPayArgs",
        "args",
        "Lcom/stripe/android/shoppay/ShopPayArgs;",
        "build",
        "Lcom/stripe/android/shoppay/di/ShopPayComponent;",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract build()Lcom/stripe/android/shoppay/di/ShopPayComponent;
.end method

.method public abstract context(Landroid/content/Context;)Lcom/stripe/android/shoppay/di/ShopPayComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract paymentElementCallbackIdentifier(Ljava/lang/String;)Lcom/stripe/android/shoppay/di/ShopPayComponent$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackIdentifier;
        .end annotation
    .end param
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/shoppay/di/ShopPayComponent$Builder;
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation runtime Ljavax/inject/Named;
            value = "publishableKey"
        .end annotation
    .end param
    .annotation runtime Ldagger/BindsInstance;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/shoppay/di/ShopPayComponent$Builder;"
        }
    .end annotation
.end method

.method public abstract shopPayArgs(Lcom/stripe/android/shoppay/ShopPayArgs;)Lcom/stripe/android/shoppay/di/ShopPayComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract statusBarColor(Ljava/lang/Integer;)Lcom/stripe/android/shoppay/di/ShopPayComponent$Builder;
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/inject/Named;
            value = "STATUS_BAR_COLOR"
        .end annotation
    .end param
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract stripeAccountIdProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/shoppay/di/ShopPayComponent$Builder;
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation runtime Ljavax/inject/Named;
            value = "stripeAccountId"
        .end annotation
    .end param
    .annotation runtime Ldagger/BindsInstance;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/shoppay/di/ShopPayComponent$Builder;"
        }
    .end annotation
.end method
