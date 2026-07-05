.class public final synthetic Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:I

.field public final synthetic f$1:Landroidx/compose/ui/graphics/ColorFilter;

.field public final synthetic f$2:Landroidx/compose/ui/Alignment;

.field public final synthetic f$3:Landroidx/compose/ui/Modifier;

.field public final synthetic f$4:I


# direct methods
.method public synthetic constructor <init>(ILandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/Modifier;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda1;->f$0:I

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda1;->f$1:Landroidx/compose/ui/graphics/ColorFilter;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda1;->f$2:Landroidx/compose/ui/Alignment;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda1;->f$3:Landroidx/compose/ui/Modifier;

    iput p5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda1;->f$4:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda1;->f$0:I

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda1;->f$1:Landroidx/compose/ui/graphics/ColorFilter;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda1;->f$2:Landroidx/compose/ui/Alignment;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda1;->f$3:Landroidx/compose/ui/Modifier;

    iget v4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt$$ExternalSyntheticLambda1;->f$4:I

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodIconKt;->$r8$lambda$fk7N5DU6xdJk56Bd3IkiTw94Dx8(ILandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
