.class public final synthetic Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForDataLauncher$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForDataLauncher$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForDataLauncher$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;

    check-cast p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;

    invoke-static {v0, p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForDataLauncher;->$r8$lambda$yWXP-D4Ttf5pHCHjJ3Pxr1FA2yA(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V

    return-void
.end method
