.class public final synthetic Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenLauncher$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenLauncher$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenLauncher$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;

    check-cast p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;

    invoke-static {v0, p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenLauncher;->$r8$lambda$Tvu-j3MZcJY_7L0WqVuasd_fXkg(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultForTokenCallback;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;)V

    return-void
.end method
