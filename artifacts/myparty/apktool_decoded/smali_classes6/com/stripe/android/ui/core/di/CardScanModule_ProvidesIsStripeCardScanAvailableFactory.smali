.class public final Lcom/stripe/android/ui/core/di/CardScanModule_ProvidesIsStripeCardScanAvailableFactory;
.super Ljava/lang/Object;
.source "CardScanModule_ProvidesIsStripeCardScanAvailableFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/di/CardScanModule_ProvidesIsStripeCardScanAvailableFactory$InstanceHolder;
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

.method public static create()Lcom/stripe/android/ui/core/di/CardScanModule_ProvidesIsStripeCardScanAvailableFactory;
    .locals 1

    .line 34
    sget-object v0, Lcom/stripe/android/ui/core/di/CardScanModule_ProvidesIsStripeCardScanAvailableFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/ui/core/di/CardScanModule_ProvidesIsStripeCardScanAvailableFactory;

    return-object v0
.end method

.method public static providesIsStripeCardScanAvailable()Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;
    .locals 1

    .line 38
    sget-object v0, Lcom/stripe/android/ui/core/di/CardScanModule;->INSTANCE:Lcom/stripe/android/ui/core/di/CardScanModule;

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/di/CardScanModule;->providesIsStripeCardScanAvailable()Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;

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
    invoke-static {}, Lcom/stripe/android/ui/core/di/CardScanModule_ProvidesIsStripeCardScanAvailableFactory;->providesIsStripeCardScanAvailable()Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/di/CardScanModule_ProvidesIsStripeCardScanAvailableFactory;->get()Lcom/stripe/android/ui/core/IsStripeCardScanAvailable;

    move-result-object v0

    return-object v0
.end method
