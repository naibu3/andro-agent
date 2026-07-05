.class public final Lcom/qonversion/android/sdk/internal/services/QUserInfoService_Factory;
.super Ljava/lang/Object;
.source "QUserInfoService_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;",
        ">;"
    }
.end annotation


# instance fields
.field private final preferencesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/Cache;",
            ">;"
        }
    .end annotation
.end field

.field private final tokenStorageProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/TokenStorage;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/Cache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/TokenStorage;",
            ">;)V"
        }
    .end annotation

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService_Factory;->preferencesProvider:Ljavax/inject/Provider;

    .line 25
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService_Factory;->tokenStorageProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/services/QUserInfoService_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/Cache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/TokenStorage;",
            ">;)",
            "Lcom/qonversion/android/sdk/internal/services/QUserInfoService_Factory;"
        }
    .end annotation

    .line 35
    new-instance v0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService_Factory;

    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService_Factory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/qonversion/android/sdk/internal/storage/Cache;Lcom/qonversion/android/sdk/internal/storage/TokenStorage;)Lcom/qonversion/android/sdk/internal/services/QUserInfoService;
    .locals 1

    .line 39
    new-instance v0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;-><init>(Lcom/qonversion/android/sdk/internal/storage/Cache;Lcom/qonversion/android/sdk/internal/storage/TokenStorage;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/services/QUserInfoService;
    .locals 3

    .line 30
    new-instance v0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService_Factory;->preferencesProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/storage/Cache;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/services/QUserInfoService_Factory;->tokenStorageProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/internal/storage/TokenStorage;

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService;-><init>(Lcom/qonversion/android/sdk/internal/storage/Cache;Lcom/qonversion/android/sdk/internal/storage/TokenStorage;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/services/QUserInfoService_Factory;->get()Lcom/qonversion/android/sdk/internal/services/QUserInfoService;

    move-result-object v0

    return-object v0
.end method
