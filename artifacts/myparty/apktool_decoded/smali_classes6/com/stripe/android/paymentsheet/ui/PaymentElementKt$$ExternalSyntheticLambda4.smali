.class public final synthetic Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Ljava/util/List;

.field public final synthetic f$3:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

.field public final synthetic f$4:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;

.field public final synthetic f$5:Landroidx/compose/foundation/layout/PaddingValues;

.field public final synthetic f$6:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$7:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$8:I


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$$ExternalSyntheticLambda4;->f$0:Z

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$$ExternalSyntheticLambda4;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$$ExternalSyntheticLambda4;->f$2:Ljava/util/List;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$$ExternalSyntheticLambda4;->f$3:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$$ExternalSyntheticLambda4;->f$4:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$$ExternalSyntheticLambda4;->f$5:Landroidx/compose/foundation/layout/PaddingValues;

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$$ExternalSyntheticLambda4;->f$6:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$$ExternalSyntheticLambda4;->f$7:Lkotlin/jvm/functions/Function0;

    iput p9, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$$ExternalSyntheticLambda4;->f$8:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 0
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$$ExternalSyntheticLambda4;->f$0:Z

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$$ExternalSyntheticLambda4;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$$ExternalSyntheticLambda4;->f$2:Ljava/util/List;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$$ExternalSyntheticLambda4;->f$3:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$$ExternalSyntheticLambda4;->f$4:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$$ExternalSyntheticLambda4;->f$5:Landroidx/compose/foundation/layout/PaddingValues;

    iget-object v6, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$$ExternalSyntheticLambda4;->f$6:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$$ExternalSyntheticLambda4;->f$7:Lkotlin/jvm/functions/Function0;

    iget v8, p0, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt$$ExternalSyntheticLambda4;->f$8:I

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lcom/stripe/android/paymentsheet/ui/PaymentElementKt;->$r8$lambda$jDpDVzAn55QztKUYaZUPgTbncTI(ZLjava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
