.class public final Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;
.super Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;
.source "InstitutionPlannedDowntimeError.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;",
        "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;",
        "institution",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "showManualEntry",
        "",
        "isToday",
        "backUpAt",
        "",
        "stripeException",
        "Lcom/stripe/android/core/exception/StripeException;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZZJLcom/stripe/android/core/exception/StripeException;)V",
        "getInstitution",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "getShowManualEntry",
        "()Z",
        "getBackUpAt",
        "()J",
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
.field private final backUpAt:J

.field private final institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

.field private final isToday:Z

.field private final showManualEntry:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZZJLcom/stripe/android/core/exception/StripeException;)V
    .locals 1

    const-string v0, "institution"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeException"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    const-string v0, "InstitutionPlannedDowntimeError"

    .line 12
    invoke-direct {p0, v0, p6}, Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;-><init>(Ljava/lang/String;Lcom/stripe/android/core/exception/StripeException;)V

    .line 7
    iput-object p1, p0, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;->institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    .line 8
    iput-boolean p2, p0, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;->showManualEntry:Z

    .line 9
    iput-boolean p3, p0, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;->isToday:Z

    .line 10
    iput-wide p4, p0, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;->backUpAt:J

    return-void
.end method


# virtual methods
.method public final getBackUpAt()J
    .locals 2

    .line 10
    iget-wide v0, p0, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;->backUpAt:J

    return-wide v0
.end method

.method public final getInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;->institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    return-object v0
.end method

.method public final getShowManualEntry()Z
    .locals 1

    .line 8
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;->showManualEntry:Z

    return v0
.end method

.method public final isToday()Z
    .locals 1

    .line 9
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;->isToday:Z

    return v0
.end method
