.class public final Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule_ProvidesIntegrityVerdictManagerFactory;
.super Ljava/lang/Object;
.source "FinancialConnectionsSingletonSharedModule_ProvidesIntegrityVerdictManagerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule_ProvidesIntegrityVerdictManagerFactory;->module:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule;

    return-void
.end method

.method public static create(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule_ProvidesIntegrityVerdictManagerFactory;
    .locals 1

    .line 42
    new-instance v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule_ProvidesIntegrityVerdictManagerFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule_ProvidesIntegrityVerdictManagerFactory;-><init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule;)V

    return-object v0
.end method

.method public static providesIntegrityVerdictManager(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule;)Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;
    .locals 0

    .line 47
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule;->providesIntegrityVerdictManager()Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;

    move-result-object p0

    invoke-static {p0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule_ProvidesIntegrityVerdictManagerFactory;->module:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule;

    invoke-static {v0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule_ProvidesIntegrityVerdictManagerFactory;->providesIntegrityVerdictManager(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule;)Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule_ProvidesIntegrityVerdictManagerFactory;->get()Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;

    move-result-object v0

    return-object v0
.end method
