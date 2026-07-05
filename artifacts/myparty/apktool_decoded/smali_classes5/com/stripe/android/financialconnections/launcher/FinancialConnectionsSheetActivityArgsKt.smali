.class public final Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgsKt;
.super Ljava/lang/Object;
.source "FinancialConnectionsSheetActivityArgs.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "flowType",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;",
        "getFlowType",
        "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;)Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;",
        "financial-connections-core_release"
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
.method public static final getFlowType(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;)Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    instance-of v0, p0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;

    if-eqz v0, :cond_0

    .line 69
    sget-object p0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;->ForData:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;

    return-object p0

    .line 70
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForInstantDebits;

    if-eqz v0, :cond_1

    .line 71
    sget-object p0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;->ForInstantDebits:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;

    return-object p0

    .line 72
    :cond_1
    instance-of p0, p0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;

    if-eqz p0, :cond_2

    .line 73
    sget-object p0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;->ForToken:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;

    return-object p0

    .line 67
    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
