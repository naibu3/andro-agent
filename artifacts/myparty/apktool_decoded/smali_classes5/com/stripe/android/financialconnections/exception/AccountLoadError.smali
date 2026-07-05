.class public final Lcom/stripe/android/financialconnections/exception/AccountLoadError;
.super Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;
.source "AccountLoadError.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/exception/AccountLoadError;",
        "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;",
        "showManualEntry",
        "",
        "canRetry",
        "institution",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "stripeException",
        "Lcom/stripe/android/core/exception/StripeException;",
        "<init>",
        "(ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/core/exception/StripeException;)V",
        "getShowManualEntry",
        "()Z",
        "getCanRetry",
        "getInstitution",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
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


# instance fields
.field private final canRetry:Z

.field private final institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

.field private final showManualEntry:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/core/exception/StripeException;)V
    .locals 1

    const-string v0, "institution"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeException"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    const-string v0, "AccountLoadError"

    .line 11
    invoke-direct {p0, v0, p4}, Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;-><init>(Ljava/lang/String;Lcom/stripe/android/core/exception/StripeException;)V

    .line 7
    iput-boolean p1, p0, Lcom/stripe/android/financialconnections/exception/AccountLoadError;->showManualEntry:Z

    .line 8
    iput-boolean p2, p0, Lcom/stripe/android/financialconnections/exception/AccountLoadError;->canRetry:Z

    .line 9
    iput-object p3, p0, Lcom/stripe/android/financialconnections/exception/AccountLoadError;->institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    return-void
.end method


# virtual methods
.method public final getCanRetry()Z
    .locals 1

    .line 8
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/exception/AccountLoadError;->canRetry:Z

    return v0
.end method

.method public final getInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/stripe/android/financialconnections/exception/AccountLoadError;->institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    return-object v0
.end method

.method public final getShowManualEntry()Z
    .locals 1

    .line 7
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/exception/AccountLoadError;->showManualEntry:Z

    return v0
.end method
