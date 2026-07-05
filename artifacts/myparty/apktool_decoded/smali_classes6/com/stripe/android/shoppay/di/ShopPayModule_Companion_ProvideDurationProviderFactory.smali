.class public final Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideDurationProviderFactory;
.super Ljava/lang/Object;
.source "ShopPayModule_Companion_ProvideDurationProviderFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideDurationProviderFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/core/utils/DurationProvider;",
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

.method public static create()Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideDurationProviderFactory;
    .locals 1

    .line 34
    sget-object v0, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideDurationProviderFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideDurationProviderFactory;

    return-object v0
.end method

.method public static provideDurationProvider()Lcom/stripe/android/core/utils/DurationProvider;
    .locals 1

    .line 38
    sget-object v0, Lcom/stripe/android/shoppay/di/ShopPayModule;->Companion:Lcom/stripe/android/shoppay/di/ShopPayModule$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/shoppay/di/ShopPayModule$Companion;->provideDurationProvider()Lcom/stripe/android/core/utils/DurationProvider;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/core/utils/DurationProvider;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/core/utils/DurationProvider;
    .locals 1

    .line 30
    invoke-static {}, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideDurationProviderFactory;->provideDurationProvider()Lcom/stripe/android/core/utils/DurationProvider;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/stripe/android/shoppay/di/ShopPayModule_Companion_ProvideDurationProviderFactory;->get()Lcom/stripe/android/core/utils/DurationProvider;

    move-result-object v0

    return-object v0
.end method
