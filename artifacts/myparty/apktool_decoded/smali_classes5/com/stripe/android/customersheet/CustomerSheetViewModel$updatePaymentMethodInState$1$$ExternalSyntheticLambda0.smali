.class public final synthetic Lcom/stripe/android/customersheet/CustomerSheetViewModel$updatePaymentMethodInState$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:Lcom/stripe/android/paymentsheet/model/PaymentSelection;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$updatePaymentMethodInState$1$$ExternalSyntheticLambda0;->f$0:Ljava/util/List;

    iput-object p2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$updatePaymentMethodInState$1$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$updatePaymentMethodInState$1$$ExternalSyntheticLambda0;->f$0:Ljava/util/List;

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewModel$updatePaymentMethodInState$1$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    invoke-static {v0, v1, p1}, Lcom/stripe/android/customersheet/CustomerSheetViewModel$updatePaymentMethodInState$1;->$r8$lambda$y5veCQC77pzDi_RLetOejZBGJu4(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;)Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;

    move-result-object p1

    return-object p1
.end method
