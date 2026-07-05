.class public interface abstract Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent;
.super Ljava/lang/Object;
.source "FinancialConnectionsSingletonSharedComponentHolder.kt"


# annotations
.annotation runtime Ldagger/Component;
    modules = {
        Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent$Factory;
    }
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008a\u0018\u00002\u00020\u0001:\u0001\u0006J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0008\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent;",
        "",
        "integrityRequestManager",
        "Lcom/stripe/attestation/IntegrityRequestManager;",
        "integrityVerdictManager",
        "Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;",
        "Factory",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract integrityRequestManager()Lcom/stripe/attestation/IntegrityRequestManager;
.end method

.method public abstract integrityVerdictManager()Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;
.end method
