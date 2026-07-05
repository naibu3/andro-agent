.class public final Lcom/stripe/android/link/injection/IntegrityRequestManagerModuleKt;
.super Ljava/lang/Object;
.source "IntegrityRequestManagerModule.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "createIntegrityStandardRequestManager",
        "Lcom/stripe/attestation/IntegrityRequestManager;",
        "context",
        "Landroid/app/Application;",
        "paymentsheet_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic $r8$lambda$d2lrr62xuHvLx5bhKGsxQIsB-eE(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/injection/IntegrityRequestManagerModuleKt;->createIntegrityStandardRequestManager$lambda$0(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final createIntegrityStandardRequestManager(Landroid/app/Application;)Lcom/stripe/attestation/IntegrityRequestManager;
    .locals 5

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    new-instance v0, Lcom/stripe/attestation/IntegrityStandardRequestManager;

    .line 13
    new-instance v1, Lcom/stripe/android/link/injection/IntegrityRequestManagerModuleKt$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/stripe/android/link/injection/IntegrityRequestManagerModuleKt$$ExternalSyntheticLambda0;-><init>()V

    .line 17
    new-instance v2, Lcom/stripe/attestation/RealStandardIntegrityManagerFactory;

    invoke-direct {v2, p0}, Lcom/stripe/attestation/RealStandardIntegrityManagerFactory;-><init>(Landroid/app/Application;)V

    check-cast v2, Lcom/stripe/attestation/StandardIntegrityManagerFactory;

    const-wide v3, 0x866dab52c2L

    .line 12
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/stripe/attestation/IntegrityStandardRequestManager;-><init>(JLkotlin/jvm/functions/Function2;Lcom/stripe/attestation/StandardIntegrityManagerFactory;)V

    check-cast v0, Lcom/stripe/attestation/IntegrityRequestManager;

    return-object v0
.end method

.method private static final createIntegrityStandardRequestManager$lambda$0(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 2

    const-string v0, "message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    sget-object v0, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/stripe/android/core/Logger$Companion;->getInstance(Z)Lcom/stripe/android/core/Logger;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
