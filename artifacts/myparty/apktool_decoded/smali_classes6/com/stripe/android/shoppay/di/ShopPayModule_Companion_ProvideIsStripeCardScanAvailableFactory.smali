.class public final Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideIsStripeCardScanAvailableFactory;
.super Ljava/lang/Object;
.source "ShopPayModule_Companion_ProvideIsStripeCardScanAvailableFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideIsStripeCardScanAvailableFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideIsStripeCardScanAvailableFactory;
    .locals 1

    .line 34
    sget-object v0, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideIsStripeCardScanAvailableFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideIsStripeCardScanAvailableFactory;

    return-object v0
.end method

.method public static provideIsStripeCardScanAvailable()Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;
    .locals 1

    .line 38
    sget-object v0, Lcom/stripe/android/shoppay/di/ShopPayModule;->Companion:Lcom/stripe/android/shoppay/di/ShopPayModule$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/shoppay/di/ShopPayModule$Companion;->provideIsStripeCardScanAvailable()Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;
    .locals 1

    .line 30
    invoke-static {}, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideIsStripeCardScanAvailableFactory;->provideIsStripeCardScanAvailable()Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideIsStripeCardScanAvailableFactory;->get()Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;

    move-result-object v0

    return-object v0
.end method
