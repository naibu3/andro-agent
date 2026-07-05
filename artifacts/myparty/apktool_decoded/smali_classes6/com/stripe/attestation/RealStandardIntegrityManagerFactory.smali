.class public final Lcom/stripe/attestation/RealStandardIntegrityManagerFactory;
.super Ljava/lang/Object;
.source "StandardIntegrityManagerFactory.kt"

# interfaces
.implements Lcom/stripe/attestation/StandardIntegrityManagerFactory;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/attestation/RealStandardIntegrityManagerFactory;",
        "Lcom/stripe/attestation/StandardIntegrityManagerFactory;",
        "appContext",
        "Landroid/app/Application;",
        "<init>",
        "(Landroid/app/Application;)V",
        "create",
        "Lcom/google/android/play/core/integrity/StandardIntegrityManager;",
        "stripe-attestation_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final appContext:Landroid/app/Application;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/attestation/RealStandardIntegrityManagerFactory;->appContext:Landroid/app/Application;

    return-void
.end method


# virtual methods
.method public create()Lcom/google/android/play/core/integrity/StandardIntegrityManager;
    .locals 2

    .line 21
    iget-object v0, p0, Lcom/stripe/attestation/RealStandardIntegrityManagerFactory;->appContext:Landroid/app/Application;

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/play/core/integrity/IntegrityManagerFactory;->createStandard(Landroid/content/Context;)Lcom/google/android/play/core/integrity/StandardIntegrityManager;

    move-result-object v0

    const-string v1, "createStandard(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
