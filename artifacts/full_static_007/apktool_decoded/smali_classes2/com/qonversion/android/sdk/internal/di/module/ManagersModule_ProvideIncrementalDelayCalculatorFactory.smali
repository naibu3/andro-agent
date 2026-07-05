.class public final Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideIncrementalDelayCalculatorFactory;
.super Ljava/lang/Object;
.source "ManagersModule_ProvideIncrementalDelayCalculatorFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideIncrementalDelayCalculatorFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;

    return-void
.end method

.method public static create(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;)Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideIncrementalDelayCalculatorFactory;
    .locals 1

    .line 30
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideIncrementalDelayCalculatorFactory;

    invoke-direct {v0, p0}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideIncrementalDelayCalculatorFactory;-><init>(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;)V

    return-object v0
.end method

.method public static provideIncrementalDelayCalculator(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;)Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;
    .locals 1

    .line 35
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;->provideIncrementalDelayCalculator()Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideIncrementalDelayCalculatorFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideIncrementalDelayCalculatorFactory;->provideIncrementalDelayCalculator(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;)Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule_ProvideIncrementalDelayCalculatorFactory;->get()Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;

    move-result-object v0

    return-object v0
.end method
