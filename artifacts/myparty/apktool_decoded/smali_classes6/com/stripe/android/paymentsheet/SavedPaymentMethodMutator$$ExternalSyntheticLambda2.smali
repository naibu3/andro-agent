.class public final synthetic Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;

.field public final synthetic f$1:Lkotlinx/coroutines/flow/StateFlow;

.field public final synthetic f$2:Z


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lkotlinx/coroutines/flow/StateFlow;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda2;->f$0:Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda2;->f$1:Lkotlinx/coroutines/flow/StateFlow;

    iput-boolean p3, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda2;->f$2:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda2;->f$0:Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda2;->f$1:Lkotlinx/coroutines/flow/StateFlow;

    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator$$ExternalSyntheticLambda2;->f$2:Z

    invoke-static {v0, v1, v2}, Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;->$r8$lambda$IdxEZmjBxn_PD3yZjZFXRR68BRU(Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;Lkotlinx/coroutines/flow/StateFlow;Z)Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsItemsMapper;

    move-result-object v0

    return-object v0
.end method
