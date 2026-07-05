.class public final Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideEnvironmentFactory;
.super Ljava/lang/Object;
.source "RepositoryModule_ProvideEnvironmentFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/qonversion/android/sdk/internal/EnvironmentProvider;",
        ">;"
    }
.end annotation


# instance fields
.field private final contextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;",
            "Ljavax/inject/Provider<",
            "Landroid/app/Application;",
            ">;)V"
        }
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideEnvironmentFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    .line 26
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideEnvironmentFactory;->contextProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideEnvironmentFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;",
            "Ljavax/inject/Provider<",
            "Landroid/app/Application;",
            ">;)",
            "Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideEnvironmentFactory;"
        }
    .end annotation

    .line 36
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideEnvironmentFactory;

    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideEnvironmentFactory;-><init>(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideEnvironment(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Landroid/app/Application;)Lcom/qonversion/android/sdk/internal/EnvironmentProvider;
    .locals 0

    .line 41
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;->provideEnvironment(Landroid/app/Application;)Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/EnvironmentProvider;
    .locals 2

    .line 31
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideEnvironmentFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideEnvironmentFactory;->contextProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Application;

    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideEnvironmentFactory;->provideEnvironment(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Landroid/app/Application;)Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule_ProvideEnvironmentFactory;->get()Lcom/qonversion/android/sdk/internal/EnvironmentProvider;

    move-result-object v0

    return-object v0
.end method
