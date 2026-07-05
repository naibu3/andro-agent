.class public final synthetic Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

.field public final synthetic f$1:Z

.field public final synthetic f$2:Z

.field public final synthetic f$3:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$4:F

.field public final synthetic f$5:I

.field public final synthetic f$6:I


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;ZZLkotlin/jvm/functions/Function0;FII)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$$ExternalSyntheticLambda4;->f$0:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$$ExternalSyntheticLambda4;->f$1:Z

    iput-boolean p3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$$ExternalSyntheticLambda4;->f$2:Z

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$$ExternalSyntheticLambda4;->f$3:Lkotlin/jvm/functions/Function0;

    iput p5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$$ExternalSyntheticLambda4;->f$4:F

    iput p6, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$$ExternalSyntheticLambda4;->f$5:I

    iput p7, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$$ExternalSyntheticLambda4;->f$6:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$$ExternalSyntheticLambda4;->f$0:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$$ExternalSyntheticLambda4;->f$1:Z

    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$$ExternalSyntheticLambda4;->f$2:Z

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$$ExternalSyntheticLambda4;->f$3:Lkotlin/jvm/functions/Function0;

    iget v4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$$ExternalSyntheticLambda4;->f$4:F

    iget v5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$$ExternalSyntheticLambda4;->f$5:I

    iget v6, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt$$ExternalSyntheticLambda4;->f$6:I

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt;->$r8$lambda$HBaF71alvHKlww8fwr_M9f7Jin8(Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;ZZLkotlin/jvm/functions/Function0;FIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
