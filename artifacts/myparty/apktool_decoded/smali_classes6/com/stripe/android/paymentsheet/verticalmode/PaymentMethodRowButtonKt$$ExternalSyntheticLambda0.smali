.class public final synthetic Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Z

.field public final synthetic f$2:Landroidx/compose/foundation/layout/PaddingValues;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$4:Landroidx/compose/ui/Modifier;

.field public final synthetic f$5:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio;

.field public final synthetic f$6:Lkotlin/jvm/functions/Function3;

.field public final synthetic f$7:I


# direct methods
.method public synthetic constructor <init>(ZZLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio;Lkotlin/jvm/functions/Function3;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda0;->f$0:Z

    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda0;->f$1:Z

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda0;->f$2:Landroidx/compose/foundation/layout/PaddingValues;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda0;->f$3:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda0;->f$4:Landroidx/compose/ui/Modifier;

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda0;->f$5:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio;

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda0;->f$6:Lkotlin/jvm/functions/Function3;

    iput p8, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda0;->f$7:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda0;->f$0:Z

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda0;->f$1:Z

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda0;->f$2:Landroidx/compose/foundation/layout/PaddingValues;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda0;->f$3:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda0;->f$4:Landroidx/compose/ui/Modifier;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda0;->f$5:Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio;

    iget-object v6, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda0;->f$6:Lkotlin/jvm/functions/Function3;

    iget v7, p0, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt$$ExternalSyntheticLambda0;->f$7:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodRowButtonKt;->$r8$lambda$oaYT4nWcD42yNUJHJ1hU954zWok(ZZLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
