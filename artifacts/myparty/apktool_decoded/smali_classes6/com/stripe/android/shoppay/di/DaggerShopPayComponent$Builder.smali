.class final Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;
.super Ljava/lang/Object;
.source "DaggerShopPayComponent.java"

# interfaces
.implements Lcom/stripe/android/shoppay/di/ShopPayComponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/shoppay/di/DaggerShopPayComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Builder"
.end annotation


# instance fields
.field private context:Landroid/content/Context;

.field private paymentElementCallbackIdentifier:Ljava/lang/String;

.field private publishableKeyProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private shopPayArgs:Lcom/stripe/android/shoppay/ShopPayArgs;

.field private statusBarColor:Ljava/lang/Integer;

.field private stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/shoppay/di/DaggerShopPayComponent-IA;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/stripe/android/shoppay/di/ShopPayComponent;
    .locals 12

    .line 112
    iget-object v0, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;->context:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 113
    iget-object v0, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    const-class v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 114
    iget-object v0, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    const-class v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 115
    iget-object v0, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;->paymentElementCallbackIdentifier:Ljava/lang/String;

    const-class v1, Ljava/lang/String;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 116
    iget-object v0, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;->shopPayArgs:Lcom/stripe/android/shoppay/ShopPayArgs;

    const-class v1, Lcom/stripe/android/shoppay/ShopPayArgs;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 117
    new-instance v2, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;

    new-instance v3, Lcom/stripe/android/core/injection/CoreCommonModule;

    invoke-direct {v3}, Lcom/stripe/android/core/injection/CoreCommonModule;-><init>()V

    new-instance v4, Lcom/stripe/android/core/injection/CoroutineContextModule;

    invoke-direct {v4}, Lcom/stripe/android/core/injection/CoroutineContextModule;-><init>()V

    iget-object v5, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;->context:Landroid/content/Context;

    iget-object v6, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;->statusBarColor:Ljava/lang/Integer;

    iget-object v7, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    iget-object v8, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    iget-object v9, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;->paymentElementCallbackIdentifier:Ljava/lang/String;

    iget-object v10, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;->shopPayArgs:Lcom/stripe/android/shoppay/ShopPayArgs;

    const/4 v11, 0x0

    invoke-direct/range {v2 .. v11}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$ShopPayComponentImpl;-><init>(Lcom/stripe/android/core/injection/CoreCommonModule;Lcom/stripe/android/core/injection/CoroutineContextModule;Landroid/content/Context;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/stripe/android/shoppay/ShopPayArgs;Lcom/stripe/android/shoppay/di/DaggerShopPayComponent-IA;)V

    return-object v2
.end method

.method public context(Landroid/content/Context;)Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;
    .locals 0

    .line 76
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;->context:Landroid/content/Context;

    return-object p0
.end method

.method public bridge synthetic context(Landroid/content/Context;)Lcom/stripe/android/shoppay/di/ShopPayComponent$Builder;
    .locals 0

    .line 61
    invoke-virtual {p0, p1}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;->context(Landroid/content/Context;)Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public paymentElementCallbackIdentifier(Ljava/lang/String;)Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;
    .locals 0

    .line 100
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;->paymentElementCallbackIdentifier:Ljava/lang/String;

    return-object p0
.end method

.method public bridge synthetic paymentElementCallbackIdentifier(Ljava/lang/String;)Lcom/stripe/android/shoppay/di/ShopPayComponent$Builder;
    .locals 0

    .line 61
    invoke-virtual {p0, p1}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;->paymentElementCallbackIdentifier(Ljava/lang/String;)Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;"
        }
    .end annotation

    .line 94
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function0;

    iput-object p1, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method public bridge synthetic publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/shoppay/di/ShopPayComponent$Builder;
    .locals 0

    .line 61
    invoke-virtual {p0, p1}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;->publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public shopPayArgs(Lcom/stripe/android/shoppay/ShopPayArgs;)Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;
    .locals 0

    .line 106
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/shoppay/ShopPayArgs;

    iput-object p1, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;->shopPayArgs:Lcom/stripe/android/shoppay/ShopPayArgs;

    return-object p0
.end method

.method public bridge synthetic shopPayArgs(Lcom/stripe/android/shoppay/ShopPayArgs;)Lcom/stripe/android/shoppay/di/ShopPayComponent$Builder;
    .locals 0

    .line 61
    invoke-virtual {p0, p1}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;->shopPayArgs(Lcom/stripe/android/shoppay/ShopPayArgs;)Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public statusBarColor(Ljava/lang/Integer;)Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;->statusBarColor:Ljava/lang/Integer;

    return-object p0
.end method

.method public bridge synthetic statusBarColor(Ljava/lang/Integer;)Lcom/stripe/android/shoppay/di/ShopPayComponent$Builder;
    .locals 0

    .line 61
    invoke-virtual {p0, p1}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;->statusBarColor(Ljava/lang/Integer;)Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public stripeAccountIdProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;"
        }
    .end annotation

    .line 88
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function0;

    iput-object p1, p0, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method public bridge synthetic stripeAccountIdProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/shoppay/di/ShopPayComponent$Builder;
    .locals 0

    .line 61
    invoke-virtual {p0, p1}, Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;->stripeAccountIdProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/shoppay/di/DaggerShopPayComponent$Builder;

    move-result-object p1

    return-object p1
.end method
