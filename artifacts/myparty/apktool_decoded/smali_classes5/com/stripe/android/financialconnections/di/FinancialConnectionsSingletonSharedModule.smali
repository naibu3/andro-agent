.class public final Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule;
.super Ljava/lang/Object;
.source "FinancialConnectionsSingletonSharedComponentHolder.kt"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0008\u0010\u0008\u001a\u00020\tH\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule;",
        "",
        "<init>",
        "()V",
        "providesIntegrityStandardRequestManager",
        "Lcom/stripe/attestation/IntegrityRequestManager;",
        "context",
        "Landroid/app/Application;",
        "providesIntegrityVerdictManager",
        "Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;",
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


# static fields
.field public static final $stable:I


# direct methods
.method public static synthetic $r8$lambda$QBfwwXPJiix9Ib3yb2oYT3ENSHI(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule;->providesIntegrityStandardRequestManager$lambda$0(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final providesIntegrityStandardRequestManager$lambda$0(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 2

    const-string v0, "message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    sget-object v0, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/stripe/android/core/Logger$Companion;->getInstance(Z)Lcom/stripe/android/core/Logger;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final providesIntegrityStandardRequestManager(Landroid/app/Application;)Lcom/stripe/attestation/IntegrityRequestManager;
    .locals 5
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    new-instance v0, Lcom/stripe/attestation/IntegrityStandardRequestManager;

    .line 60
    new-instance v1, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule$$ExternalSyntheticLambda0;-><init>()V

    .line 62
    new-instance v2, Lcom/stripe/attestation/RealStandardIntegrityManagerFactory;

    invoke-direct {v2, p1}, Lcom/stripe/attestation/RealStandardIntegrityManagerFactory;-><init>(Landroid/app/Application;)V

    check-cast v2, Lcom/stripe/attestation/StandardIntegrityManagerFactory;

    const-wide v3, 0x7aba665dc9L

    .line 59
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/stripe/attestation/IntegrityStandardRequestManager;-><init>(JLkotlin/jvm/functions/Function2;Lcom/stripe/attestation/StandardIntegrityManagerFactory;)V

    check-cast v0, Lcom/stripe/attestation/IntegrityRequestManager;

    return-object v0
.end method

.method public final providesIntegrityVerdictManager()Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 67
    new-instance v0, Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;-><init>()V

    return-object v0
.end method
