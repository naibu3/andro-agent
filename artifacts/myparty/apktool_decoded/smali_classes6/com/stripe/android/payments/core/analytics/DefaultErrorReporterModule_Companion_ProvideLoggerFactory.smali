.class public final Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule_Companion_ProvideLoggerFactory;
.super Ljava/lang/Object;
.source "DefaultErrorReporterModule_Companion_ProvideLoggerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule_Companion_ProvideLoggerFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/core/Logger;",
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

.method public static create()Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule_Companion_ProvideLoggerFactory;
    .locals 1

    .line 34
    sget-object v0, Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule_Companion_ProvideLoggerFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule_Companion_ProvideLoggerFactory;

    return-object v0
.end method

.method public static provideLogger()Lcom/stripe/android/core/Logger;
    .locals 1

    .line 38
    sget-object v0, Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule;->Companion:Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule$Companion;->provideLogger()Lcom/stripe/android/core/Logger;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/core/Logger;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/core/Logger;
    .locals 1

    .line 30
    invoke-static {}, Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule_Companion_ProvideLoggerFactory;->provideLogger()Lcom/stripe/android/core/Logger;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule_Companion_ProvideLoggerFactory;->get()Lcom/stripe/android/core/Logger;

    move-result-object v0

    return-object v0
.end method
