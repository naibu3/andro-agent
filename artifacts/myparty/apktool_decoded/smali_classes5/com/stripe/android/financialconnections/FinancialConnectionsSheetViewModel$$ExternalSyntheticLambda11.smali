.class public final synthetic Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda11;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

.field public final synthetic f$1:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda11;->f$0:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda11;->f$1:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda11;->f$0:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$$ExternalSyntheticLambda11;->f$1:Ljava/lang/String;

    check-cast p1, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    invoke-static {v0, v1, p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel;->$r8$lambda$WgXW9VNaGMPaNZWfGOeyCMohV18(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Ljava/lang/String;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetState;

    move-result-object p1

    return-object p1
.end method
