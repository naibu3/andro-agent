.class public final synthetic Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$Companion$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;

.field public final synthetic f$1:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Landroid/os/Bundle;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$Companion$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$Companion$$ExternalSyntheticLambda0;->f$1:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$Companion$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$Companion$$ExternalSyntheticLambda0;->f$1:Landroid/os/Bundle;

    check-cast p1, Landroidx/lifecycle/viewmodel/CreationExtras;

    invoke-static {v0, v1, p1}, Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$Companion;->$r8$lambda$NBsRlCfSvluV_pAY6N6Ci2i1ock(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Landroid/os/Bundle;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/financialconnections/features/exit/ExitViewModel;

    move-result-object p1

    return-object p1
.end method
