.class final Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent$FinancialConnectionsSingletonSharedComponentImpl;
.super Ljava/lang/Object;
.source "DaggerFinancialConnectionsSingletonSharedComponent.java"

# interfaces
.implements Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "FinancialConnectionsSingletonSharedComponentImpl"
.end annotation


# instance fields
.field private applicationProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field

.field private final financialConnectionsSingletonSharedComponentImpl:Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent$FinancialConnectionsSingletonSharedComponentImpl;

.field private providesIntegrityStandardRequestManagerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/attestation/IntegrityRequestManager;",
            ">;"
        }
    .end annotation
.end field

.field private providesIntegrityVerdictManagerProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule;Landroid/app/Application;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent$FinancialConnectionsSingletonSharedComponentImpl;->financialConnectionsSingletonSharedComponentImpl:Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent$FinancialConnectionsSingletonSharedComponentImpl;

    .line 56
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent$FinancialConnectionsSingletonSharedComponentImpl;->initialize(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule;Landroid/app/Application;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule;Landroid/app/Application;Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent-IA;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent$FinancialConnectionsSingletonSharedComponentImpl;-><init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule;Landroid/app/Application;)V

    return-void
.end method

.method private initialize(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule;Landroid/app/Application;)V
    .locals 0

    .line 64
    invoke-static {p2}, Ldagger/internal/InstanceFactory;->create(Ljava/lang/Object;)Ldagger/internal/Factory;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent$FinancialConnectionsSingletonSharedComponentImpl;->applicationProvider:Ldagger/internal/Provider;

    .line 65
    invoke-static {p1, p2}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule_ProvidesIntegrityStandardRequestManagerFactory;->create(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule;Ldagger/internal/Provider;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule_ProvidesIntegrityStandardRequestManagerFactory;

    move-result-object p2

    invoke-static {p2}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent$FinancialConnectionsSingletonSharedComponentImpl;->providesIntegrityStandardRequestManagerProvider:Ldagger/internal/Provider;

    .line 66
    invoke-static {p1}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule_ProvidesIntegrityVerdictManagerFactory;->create(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule;)Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule_ProvidesIntegrityVerdictManagerFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ldagger/internal/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent$FinancialConnectionsSingletonSharedComponentImpl;->providesIntegrityVerdictManagerProvider:Ldagger/internal/Provider;

    return-void
.end method


# virtual methods
.method public integrityRequestManager()Lcom/stripe/attestation/IntegrityRequestManager;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent$FinancialConnectionsSingletonSharedComponentImpl;->providesIntegrityStandardRequestManagerProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/attestation/IntegrityRequestManager;

    return-object v0
.end method

.method public integrityVerdictManager()Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/stripe/android/financialconnections/di/DaggerFinancialConnectionsSingletonSharedComponent$FinancialConnectionsSingletonSharedComponentImpl;->providesIntegrityVerdictManagerProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;

    return-object v0
.end method
