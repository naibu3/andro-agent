.class public final Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;
.super Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;
.source "InstitutionUnplannedDowntimeError.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;",
        "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;",
        "institution",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "showManualEntry",
        "",
        "stripeException",
        "Lcom/stripe/android/core/exception/StripeException;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZLcom/stripe/android/core/exception/StripeException;)V",
        "getInstitution",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "getShowManualEntry",
        "()Z",
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
.field private final institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

.field private final showManualEntry:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZLcom/stripe/android/core/exception/StripeException;)V
    .locals 1

    const-string v0, "institution"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeException"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    const-string v0, "InstitutionUnplannedDowntimeError"

    .line 10
    invoke-direct {p0, v0, p3}, Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;-><init>(Ljava/lang/String;Lcom/stripe/android/core/exception/StripeException;)V

    .line 7
    iput-object p1, p0, Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;->institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    .line 8
    iput-boolean p2, p0, Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;->showManualEntry:Z

    return-void
.end method


# virtual methods
.method public final getInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;->institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    return-object v0
.end method

.method public final getShowManualEntry()Z
    .locals 1

    .line 8
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;->showManualEntry:Z

    return v0
.end method
