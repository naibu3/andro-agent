.class public final synthetic Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$$ExternalSyntheticLambda12;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

.field public final synthetic f$1:Lcom/stripe/android/core/strings/ResolvableString;

.field public final synthetic f$2:Lcom/stripe/android/paymentsheet/state/WalletsState;

.field public final synthetic f$3:Lcom/stripe/android/paymentsheet/state/WalletsProcessingState;

.field public final synthetic f$4:Lcom/stripe/android/core/strings/ResolvableString;

.field public final synthetic f$5:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;

.field public final synthetic f$6:Lcom/stripe/android/paymentsheet/model/MandateText;

.field public final synthetic f$7:Landroidx/compose/ui/Modifier;

.field public final synthetic f$8:I


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentsheet/state/WalletsState;Lcom/stripe/android/paymentsheet/state/WalletsProcessingState;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;Lcom/stripe/android/paymentsheet/model/MandateText;Landroidx/compose/ui/Modifier;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$$ExternalSyntheticLambda12;->f$0:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$$ExternalSyntheticLambda12;->f$1:Lcom/stripe/android/core/strings/ResolvableString;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$$ExternalSyntheticLambda12;->f$2:Lcom/stripe/android/paymentsheet/state/WalletsState;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$$ExternalSyntheticLambda12;->f$3:Lcom/stripe/android/paymentsheet/state/WalletsProcessingState;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$$ExternalSyntheticLambda12;->f$4:Lcom/stripe/android/core/strings/ResolvableString;

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$$ExternalSyntheticLambda12;->f$5:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$$ExternalSyntheticLambda12;->f$6:Lcom/stripe/android/paymentsheet/model/MandateText;

    iput-object p8, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$$ExternalSyntheticLambda12;->f$7:Landroidx/compose/ui/Modifier;

    iput p9, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$$ExternalSyntheticLambda12;->f$8:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$$ExternalSyntheticLambda12;->f$0:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$$ExternalSyntheticLambda12;->f$1:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$$ExternalSyntheticLambda12;->f$2:Lcom/stripe/android/paymentsheet/state/WalletsState;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$$ExternalSyntheticLambda12;->f$3:Lcom/stripe/android/paymentsheet/state/WalletsProcessingState;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$$ExternalSyntheticLambda12;->f$4:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$$ExternalSyntheticLambda12;->f$5:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;

    iget-object v6, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$$ExternalSyntheticLambda12;->f$6:Lcom/stripe/android/paymentsheet/model/MandateText;

    iget-object v7, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$$ExternalSyntheticLambda12;->f$7:Landroidx/compose/ui/Modifier;

    iget v8, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt$$ExternalSyntheticLambda12;->f$8:I

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt;->$r8$lambda$tFvbMO3QEhkzQVgvLpOkPMt92Qo(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentsheet/state/WalletsState;Lcom/stripe/android/paymentsheet/state/WalletsProcessingState;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;Lcom/stripe/android/paymentsheet/model/MandateText;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
