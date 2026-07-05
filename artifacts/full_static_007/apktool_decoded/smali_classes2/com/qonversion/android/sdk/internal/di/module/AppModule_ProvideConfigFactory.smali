.class public final Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideConfigFactory;
.super Ljava/lang/Object;
.source "AppModule_ProvideConfigFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/qonversion/android/sdk/internal/InternalConfig;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/qonversion/android/sdk/internal/di/module/AppModule;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/AppModule;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideConfigFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/AppModule;

    return-void
.end method

.method public static create(Lcom/qonversion/android/sdk/internal/di/module/AppModule;)Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideConfigFactory;
    .locals 1

    .line 29
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideConfigFactory;

    invoke-direct {v0, p0}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideConfigFactory;-><init>(Lcom/qonversion/android/sdk/internal/di/module/AppModule;)V

    return-object v0
.end method

.method public static provideConfig(Lcom/qonversion/android/sdk/internal/di/module/AppModule;)Lcom/qonversion/android/sdk/internal/InternalConfig;
    .locals 1

    .line 33
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/AppModule;->provideConfig()Lcom/qonversion/android/sdk/internal/InternalConfig;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/internal/InternalConfig;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/InternalConfig;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideConfigFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/AppModule;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideConfigFactory;->provideConfig(Lcom/qonversion/android/sdk/internal/di/module/AppModule;)Lcom/qonversion/android/sdk/internal/InternalConfig;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvideConfigFactory;->get()Lcom/qonversion/android/sdk/internal/InternalConfig;

    move-result-object v0

    return-object v0
.end method
