.class public final Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;
.super Ljava/lang/Object;
.source "QExceptionManager_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;",
        ">;"
    }
.end annotation


# instance fields
.field private final headersProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final intervalConfigProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/InternalConfig;",
            ">;"
        }
    .end annotation
.end field

.field private final moshiProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/squareup/moshi/Moshi;",
            ">;"
        }
    .end annotation
.end field

.field private final repositoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/InternalConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/squareup/moshi/Moshi;",
            ">;)V"
        }
    .end annotation

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;->repositoryProvider:Ljavax/inject/Provider;

    .line 32
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;->intervalConfigProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p3, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;->headersProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p4, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;->moshiProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/InternalConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/squareup/moshi/Moshi;",
            ">;)",
            "Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;"
        }
    .end annotation

    .line 45
    new-instance v0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/squareup/moshi/Moshi;)Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;
    .locals 1

    .line 50
    new-instance v0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;-><init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/squareup/moshi/Moshi;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;
    .locals 5

    .line 39
    new-instance v0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;->repositoryProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/repository/QRepository;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;->intervalConfigProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/internal/InternalConfig;

    iget-object v3, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;->headersProvider:Ljavax/inject/Provider;

    invoke-interface {v3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;

    iget-object v4, p0, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;->moshiProvider:Ljavax/inject/Provider;

    invoke-interface {v4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/squareup/moshi/Moshi;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;-><init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/squareup/moshi/Moshi;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/logger/QExceptionManager_Factory;->get()Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;

    move-result-object v0

    return-object v0
.end method
