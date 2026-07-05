.class abstract Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult;
.super Ljava/lang/Object;
.source "FinancialConnectionsSheetViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "AttestationInitResult"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult$Failure;,
        Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult$Skipped;,
        Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult$Success;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00082\u0018\u00002\u00020\u0001:\u0003\u0008\t\nB\u0011\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u0003\u000b\u000c\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult;",
        "",
        "supportsAppVerification",
        "",
        "<init>",
        "(Z)V",
        "getSupportsAppVerification",
        "()Z",
        "Success",
        "Skipped",
        "Failure",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult$Failure;",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult$Skipped;",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult$Success;",
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


# instance fields
.field private final supportsAppVerification:Z


# direct methods
.method private constructor <init>(Z)V
    .locals 0

    .line 587
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult;->supportsAppVerification:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final getSupportsAppVerification()Z
    .locals 1

    .line 587
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$AttestationInitResult;->supportsAppVerification:Z

    return v0
.end method
