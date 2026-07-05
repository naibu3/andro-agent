.class public final synthetic Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Companion$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Companion$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Companion$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;

    check-cast p1, Landroidx/lifecycle/viewmodel/CreationExtras;

    invoke-static {v0, p1}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Companion;->$r8$lambda$IuJ9kUdXTFX9alxcgAXXDcRAOHE(Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;

    move-result-object p1

    return-object p1
.end method
