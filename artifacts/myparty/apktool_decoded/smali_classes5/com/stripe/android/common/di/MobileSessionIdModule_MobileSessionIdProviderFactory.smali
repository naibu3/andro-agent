.class public final Lcom/stripe/android/common/di/MobileSessionIdModule_MobileSessionIdProviderFactory;
.super Ljava/lang/Object;
.source "MobileSessionIdModule_MobileSessionIdProviderFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/stripe/android/common/di/MobileSessionIdModule;


# direct methods
.method public constructor <init>(Lcom/stripe/android/common/di/MobileSessionIdModule;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/stripe/android/common/di/MobileSessionIdModule_MobileSessionIdProviderFactory;->module:Lcom/stripe/android/common/di/MobileSessionIdModule;

    return-void
.end method

.method public static create(Lcom/stripe/android/common/di/MobileSessionIdModule;)Lcom/stripe/android/common/di/MobileSessionIdModule_MobileSessionIdProviderFactory;
    .locals 1

    .line 40
    new-instance v0, Lcom/stripe/android/common/di/MobileSessionIdModule_MobileSessionIdProviderFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/common/di/MobileSessionIdModule_MobileSessionIdProviderFactory;-><init>(Lcom/stripe/android/common/di/MobileSessionIdModule;)V

    return-object v0
.end method

.method public static mobileSessionIdProvider(Lcom/stripe/android/common/di/MobileSessionIdModule;)Ljava/lang/String;
    .locals 0

    .line 44
    invoke-virtual {p0}, Lcom/stripe/android/common/di/MobileSessionIdModule;->mobileSessionIdProvider()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/stripe/android/common/di/MobileSessionIdModule_MobileSessionIdProviderFactory;->get()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/stripe/android/common/di/MobileSessionIdModule_MobileSessionIdProviderFactory;->module:Lcom/stripe/android/common/di/MobileSessionIdModule;

    invoke-static {v0}, Lcom/stripe/android/common/di/MobileSessionIdModule_MobileSessionIdProviderFactory;->mobileSessionIdProvider(Lcom/stripe/android/common/di/MobileSessionIdModule;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
