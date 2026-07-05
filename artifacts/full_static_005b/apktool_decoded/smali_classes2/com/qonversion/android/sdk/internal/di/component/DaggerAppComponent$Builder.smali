.class public final Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;
.super Ljava/lang/Object;
.source "DaggerAppComponent.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private appModule:Lcom/qonversion/android/sdk/internal/di/module/AppModule;

.field private managersModule:Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;

.field private networkModule:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

.field private repositoryModule:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

.field private servicesModule:Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 262
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent-IA;)V
    .locals 0

    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public appModule(Lcom/qonversion/android/sdk/internal/di/module/AppModule;)Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;
    .locals 0

    .line 266
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/qonversion/android/sdk/internal/di/module/AppModule;

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->appModule:Lcom/qonversion/android/sdk/internal/di/module/AppModule;

    return-object p0
.end method

.method public build()Lcom/qonversion/android/sdk/internal/di/component/AppComponent;
    .locals 8

    .line 291
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->appModule:Lcom/qonversion/android/sdk/internal/di/module/AppModule;

    const-class v1, Lcom/qonversion/android/sdk/internal/di/module/AppModule;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 292
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->repositoryModule:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    if-nez v0, :cond_0

    .line 293
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;-><init>()V

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->repositoryModule:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    .line 295
    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->networkModule:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

    if-nez v0, :cond_1

    .line 296
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;-><init>()V

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->networkModule:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

    .line 298
    :cond_1
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->managersModule:Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;

    if-nez v0, :cond_2

    .line 299
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;-><init>()V

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->managersModule:Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;

    .line 301
    :cond_2
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->servicesModule:Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;

    if-nez v0, :cond_3

    .line 302
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;-><init>()V

    iput-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->servicesModule:Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;

    .line 304
    :cond_3
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->appModule:Lcom/qonversion/android/sdk/internal/di/module/AppModule;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->repositoryModule:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->networkModule:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

    iget-object v5, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->managersModule:Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;

    iget-object v6, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->servicesModule:Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent;-><init>(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent-IA;)V

    return-object v0
.end method

.method public managersModule(Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;)Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;
    .locals 0

    .line 281
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->managersModule:Lcom/qonversion/android/sdk/internal/di/module/ManagersModule;

    return-object p0
.end method

.method public networkModule(Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;)Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;
    .locals 0

    .line 276
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->networkModule:Lcom/qonversion/android/sdk/internal/di/module/NetworkModule;

    return-object p0
.end method

.method public repositoryModule(Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;)Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;
    .locals 0

    .line 271
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->repositoryModule:Lcom/qonversion/android/sdk/internal/di/module/RepositoryModule;

    return-object p0
.end method

.method public servicesModule(Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;)Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;
    .locals 0

    .line 286
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerAppComponent$Builder;->servicesModule:Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;

    return-object p0
.end method
