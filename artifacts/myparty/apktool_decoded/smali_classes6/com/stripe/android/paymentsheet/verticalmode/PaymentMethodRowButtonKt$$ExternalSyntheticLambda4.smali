.class public final synthetic Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Z

.field public final synthetic f$2:Landroidx/compose/foundation/layout/PaddingValues;

.field public final synthetic f$3:Landroidx/compose/ui/Modifier;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function3;

.field public final synthetic f$5:I


# direct methods
.method public synthetic constructor <init>(ZZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda4;->f$0:Z

    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda4;->f$1:Z

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda4;->f$2:Landroidx/compose/foundation/layout/PaddingValues;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda4;->f$3:Landroidx/compose/ui/Modifier;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda4;->f$4:Lkotlin/jvm/functions/Function3;

    iput p6, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda4;->f$5:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda4;->f$0:Z

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda4;->f$1:Z

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda4;->f$2:Landroidx/compose/foundation/layout/PaddingValues;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda4;->f$3:Landroidx/compose/ui/Modifier;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda4;->f$4:Lkotlin/jvm/functions/Function3;

    iget v5, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda4;->f$5:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt;->$r8$lambda$TD8lqei66rzEXBrxCgGOnzf3PnM(ZZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
