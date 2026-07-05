.class public final Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;
.super Ljava/lang/Object;
.source "AppModule_ProvidePurchasesCacheFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/qonversion/android/sdk/internal/di/module/AppModule;

.field private final sharedPreferencesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/AppModule;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
            ">;)V"
        }
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/AppModule;

    .line 26
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;->sharedPreferencesProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/internal/di/module/AppModule;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;",
            ">;)",
            "Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;"
        }
    .end annotation

    .line 36
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;

    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;-><init>(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static providePurchasesCache(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;)Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;
    .locals 0

    .line 41
    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/di/module/AppModule;->providePurchasesCache(Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;)Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;
    .locals 2

    .line 31
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;->module:Lcom/qonversion/android/sdk/internal/di/module/AppModule;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;->sharedPreferencesProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;

    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;->providePurchasesCache(Lcom/qonversion/android/sdk/internal/di/module/AppModule;Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;)Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/di/module/AppModule_ProvidePurchasesCacheFactory;->get()Lcom/qonversion/android/sdk/internal/storage/PurchasesCache;

    move-result-object v0

    return-object v0
.end method
