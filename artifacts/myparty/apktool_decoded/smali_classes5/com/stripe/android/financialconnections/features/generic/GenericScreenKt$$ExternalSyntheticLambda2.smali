.class public final synthetic Lcom/stripe/android/financialconnections/features/generic/GenericScreenKt$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$1:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;

.field public final synthetic f$2:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

.field public final synthetic f$3:I


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/generic/GenericScreenKt$$ExternalSyntheticLambda2;->f$0:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/generic/GenericScreenKt$$ExternalSyntheticLambda2;->f$1:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/generic/GenericScreenKt$$ExternalSyntheticLambda2;->f$2:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    iput p4, p0, Lcom/stripe/android/financialconnections/features/generic/GenericScreenKt$$ExternalSyntheticLambda2;->f$3:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/generic/GenericScreenKt$$ExternalSyntheticLambda2;->f$0:Lkotlin/jvm/functions/Function0;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/generic/GenericScreenKt$$ExternalSyntheticLambda2;->f$1:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/generic/GenericScreenKt$$ExternalSyntheticLambda2;->f$2:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    iget v3, p0, Lcom/stripe/android/financialconnections/features/generic/GenericScreenKt$$ExternalSyntheticLambda2;->f$3:I

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/generic/GenericScreenKt;->$r8$lambda$9EusXABIo1xVNsFU8AJXj3JzYys(Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
